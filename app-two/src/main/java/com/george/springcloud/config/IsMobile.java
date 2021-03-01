package com.george.springcloud.config;

//## 自定义校验注解
import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 电话号码格式校验
 * @Constraint注解表明是由哪个类进行校验
 * groups和payload为必须
 * @author 伍磊
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Constraint(validatedBy = {IsMobileValidator.class})
public @interface IsMobile {

    /**
     * 是否需要校验
     * @return  boolean
     */
    boolean required() default true;

    String message() default "手机号码格式错误";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
