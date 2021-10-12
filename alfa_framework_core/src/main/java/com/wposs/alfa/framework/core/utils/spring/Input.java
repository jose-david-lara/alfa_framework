package com.wposs.alfa.framework.core.utils.spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Repeatable(Inputs.class)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Input {

	String type() default "";
	String name() default "";
	
	String required() default "false";
	String values() default "";
	String minSize() default "";
	String min() default "";
	String max() default "";
	String pattern() default "";
	
	String description() default "";

	String messages() default "";	
	
}
