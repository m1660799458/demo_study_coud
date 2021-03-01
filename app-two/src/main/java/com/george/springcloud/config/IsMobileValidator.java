package com.george.springcloud.config;


import cn.hutool.core.util.StrUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * isMobile注解校验代码
 *
 * @author 伍磊
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {
    private boolean required = false;

    @Override
    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        // value为空时进行校验
        if (StrUtil.isBlank(value)) {
            if (required) {
                return false;
            }
            return true;
        } else {
            // 不为空时进行校验
            return ValidatorUtils.isMobile(value);
        }
    }
}
