package information.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * @Classname GsonUtils
 * @Date 2019/10/22 9:29
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * * @Description 生成gson对象
 */
public class GsonUtils {

    private GsonUtils(){}

    private static Gson gson = null;

    public static Gson getGson(){
        if (gson == null){
            synchronized(GsonUtils.class){
                gson = new Gson();
            }
        }
        return gson;
    }


    /**
     * 转jsonArray
     * @param object
     * @return
     */
    public static JsonArray toJsonArray(Object object){
       JsonArray jsonElements = GsonUtils.getGson().fromJson(GsonUtils.getGson().toJson(object),JsonArray.class);
       return jsonElements;
    }

    /**
     * bean转json
     * @param object
     * @return
     */
    public static JsonObject toJson(Object object){
        return GsonUtils.getGson().toJsonTree(object).getAsJsonObject();
    }

}
