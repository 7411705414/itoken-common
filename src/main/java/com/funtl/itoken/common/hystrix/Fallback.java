package com.funtl.itoken.common.hystrix;

import com.funtl.itoken.common.constants.HttpStatusConstants;
import com.funtl.itoken.common.dto.BaseResult;
import com.funtl.itoken.common.utils.MapperUtils;
import com.google.common.collect.Lists;

public class Fallback {

    public static String badGaeway() {
        BaseResult baseResult = BaseResult.notok(Lists.newArrayList(new BaseResult.Error(String.valueOf(HttpStatusConstants.BAD_GATEWAY.getStatus()), String.valueOf(HttpStatusConstants.BAD_GATEWAY.getContent()))));
        try {
            return MapperUtils.obj2json(baseResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null ;
    }





}
