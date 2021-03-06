package com.mycompany.mars.validation.common;

import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorI2 extends ValidatorHandler<String> implements com.baidu.unbiz.fluentvalidator.Validator<String>{
    
    @Override
    public boolean validate(ValidatorContext context, String subfield) {
        String fieldName = context.getAttribute("fieldName", String.class);
        if(subfield == null){
            context.addError(ValidationError.create("В поле " + fieldName + " индикатор 2 отсутствует.")
                    .setErrorCode(2)
                    .setField(fieldName)
                    .setInvalidValue(subfield));
            return false;
        }else{
            Pattern p = Pattern.compile("^([0-9]|#| )$");
            Matcher m = p.matcher(subfield);
            if (!m.matches()) {
                context.addError(ValidationError.create("В поле " + fieldName + " индикатор 2 заполнен неверно.")
                        .setErrorCode(2)
                        .setField(fieldName)
                        .setInvalidValue(subfield));
                return false;
            }
            return true;
        } 
    }
}