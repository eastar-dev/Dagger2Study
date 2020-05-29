# Dagger2Study
Dagger2 를 공부 하면서 하는 실습들...


## 첫번째 모듈 만들기
```
@Module
public class MyModule {

    @Provides
    String provideName() {
        return "eastar";
    }
}

@Component(modules = MyModule.class)
public interface MyComponent {
    void inject(MyClass myClass);
}

~~~
MyComponent myComponent = DaggerMyComponent.create();
myComponent.inject(myClass);
~~
```

모듈은 Dagger 에서 재공한 형태를 정의 한다.

위코드는
MyComponent라는 클레스는 MyModule.class모듈 을 제공하는 Component이고
MyModule은 provideName라는 함수를 통해 String형태의 값 "eastar"를 제공하는것이다.
다음으로 확인 할것이 재공되는 시점이고
그시점은 inject함수가 실행되는 시점이다.

```
MyComponent myComponent = DaggerMyComponent.create();
myComponent.inject(myClass);
```


