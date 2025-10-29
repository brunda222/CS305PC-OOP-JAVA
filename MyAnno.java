import java.lang.annotation.*;

@target(ElementType=TYPE)
@Retention(Retention policy.RUNTIME)

@interface MyAnno{
     String usage() default "dip dip dip";
  }
