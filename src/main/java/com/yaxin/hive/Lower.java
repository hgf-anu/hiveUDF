package com.yaxin.hive;

import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class Lower extends UDF {

    /**
     * evaluate不是继承也不是实现接口,写该方法的时候一定不要写错evaluate的拼写
     */
    public String evaluate(String original){
        if(StringUtils.isBlank(original)){
            return null;
        }
        return original.toLowerCase();

    }
}
