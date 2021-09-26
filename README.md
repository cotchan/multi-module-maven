### What You Will Build

- You will set up `a library jar that exposes a service` for simple “Hello, World” messages 
- `and then include the service in a web application` that uses the library as a dependency.

### 구성 요소

1. multi-module
    - my-library 모듈과 my-app 모듈의 부모 컴포넌트 
    - multi-module 구성을 위한 parent
2. my-library
    - @Service 어노테이션만 사용하며 Library처럼 사용하도록 구성
    - my-app에서 my-library에 대한 dependecy 추가해서 사용함
3. my-app
    - main function(@SpringBootApplication)을 가진 entrypoint 
    - my-library 모듈을 사용하는 입장

### 코드 출처

- [spring-guides/gs-multi-module](https://github.com/spring-guides/gs-multi-module/tree/main/complete)
- [Creating a Multi Module Project](https://spring.io/guides/gs/multi-module/)