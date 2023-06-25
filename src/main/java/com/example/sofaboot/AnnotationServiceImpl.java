package com.example.sofaboot;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import org.springframework.stereotype.Service;

import java.util.Date;

@SofaService(interfaceType = AnnotationService.class, bindings = { @SofaServiceBinding(bindingType = "bolt") })
@Service
public class AnnotationServiceImpl implements AnnotationService{
    private int index = 0;
    @Override
    public String sayAnnotation(String string) {
        if (index < 0) index = 0;
        String s = String.format("%s,%s,衣服,交易,创建,%s,%s", new Date(), ++index*index, index, string);
        System.out.print("server annotation: " + s);
        return s;
    }
}
