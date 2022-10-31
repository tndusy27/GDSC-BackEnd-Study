package annotation;

import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args) throws NoSuchMethodException{
        Method m1=AnnotationExample.class.getDeclaredMethod("printAgeDefault");
        // getDeclaredMethod() :  해당 클래스에만 선언된 method 를 가져옴.
        CustomAnnotation customAnnotation1=m1.getDeclaredAnnotation(CustomAnnotation.class);
        //getDeclaredAnnotation : 모든 어노테이션을 구함.(대상 클랙스에 부여된 어노테이션만)
        System.out.println(customAnnotation1.myAge());

        Method m2=AnnotationExample.class.getDeclaredMethod("printAgeCustom");

        CustomAnnotation customAnnotation2=m2.getDeclaredAnnotation(CustomAnnotation.class);

        System.out.println(customAnnotation2.myAge());
    }
    @CustomAnnotation
    public static void printAgeDefault(){
    } //default 값 24출력
    @CustomAnnotation
    public static void printAgeCustom(){
    }//default 값 24출력
}
