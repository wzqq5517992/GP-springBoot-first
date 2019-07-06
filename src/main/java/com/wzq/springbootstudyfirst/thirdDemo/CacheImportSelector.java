package com.wzq.springbootstudyfirst.thirdDemo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.MultiValueMap;

import java.util.Map;

/**
 * @author wzq.Jolin
 * @company none
 * @create 2019-07-04 17:57
 */

public class CacheImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        MultiValueMap< String, Object >
                allAnnotationAttributes = annotationMetadata.getAllAnnotationAttributes(EnableDefineService.class.getName());

        //返回的是一个固定的CacheService
        return new String[]{CacheService.class.getName()};
    }
}
