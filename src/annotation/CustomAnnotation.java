package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//사용방법 :
//@Target({ElementType.[적용대상]})
//@Retention(RetentionPolicy.[정보유지되는 대상])
//public @interface [어노테이션명]{
//public 타입 elementName() [default 값]
@Target(ElementType.METHOD)//메서드 선언
@Retention(RetentionPolicy.RUNTIME) //파일 이후에도 JVM에 의해 계속 참조가 가능.
public @interface CustomAnnotation {
    int myAge() default 24; //기본 값으로는 default 24
}
