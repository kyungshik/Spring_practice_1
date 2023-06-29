# spring_practice_basic <1> : 프로젝트 생성

김영한 선생님의 해당 강의를 들으면서 공부하는 과정들을 기록하였습니다.   
[스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8/dashboard)

간단 요약   
1. JDK 11 | Gradle-Groovy | spring boot 2.0 | Spring Web, Thymeleaf
2. Intellij로 build.gradle 열기
3. 동작확인
   
처음에는 JDK17과 spring boot 3.0 조합으로 프로젝트를 생성하였다.   
그러나 프로젝트를 진행하는 과정에서 강의와 달리 안되는 부분들이 생기기 시작했다.   
강의와 동일한 개발환경에서 개발하고 싶으나, 버전은 항상 업그레이드 된다.   
아쉽지만, 기존의 프로젝트는 모두 삭제하고 **JDK 11** 과 **spring boot 2.7.13** 조합으로 다시 생성하였다.   
매끄러운 진행을 위해서라면 spring 3.0은 지양하는 것이 좋을 것 같다…   
그 과정에서 **로컬에 있는 모든 JDK 파일을 삭제하고 JDK 11을 재설치** 하였다.   

## JDK 11 
로컬에서 돌아가고 있는 자바가 JDK 11 인지 먼저 확인한다.   
나중에 버전이 달라서 고생할 수 있다.   

학교에 가기 전에 준비물을 준비하는 것 처럼,   
미리 JDK 11을 준비하자. 
```bash
java --version
```
![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/88e71819-e079-4e6c-ac82-2f12af5240dc)

## Spring Initializr
[Spring Initializr](https://start.spring.io/)를 사용해서 프로젝트를 생성한다.
 * Project : Gradle - Groovy
 * Language : Java
 * Spring Boot : 2.7.13
   * 강의와 버전을 맞추기 위해서 spring boot 2.0 선택
 * Group : hello
 * Artifact : hello-spring
 * Java : 11
 * Dependencies : Spring Web, Thymeleaf
![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/52c5432b-d355-4c36-a047-7cd6a4ba7738)
Generate를 누르면 스프링 프로젝트가 생성된다.

## 생성 결과
1. 압축을 풀고 폴더에 들어간다.
![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/40145473-0dbc-4034-9a16-b98648dafa9f)
2. Intellij로 build.gradle 파일을 실행한다.
![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/6301b130-f506-4c27-9847-3fa955723fbb)
![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/b5d1efb6-9700-42e1-97f7-23517688578f)
  ```gradle
  plugins {
  	id 'java'
  	id 'org.springframework.boot' version '2.7.13'
  	id 'io.spring.dependency-management' version '1.0.15.RELEASE'
  }
  
  group = 'hello'
  version = '0.0.1-SNAPSHOT'
  
  java {
  	sourceCompatibility = '11'
  }
  
  repositories {
  	mavenCentral()
  }
  
  dependencies {
  	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
  	implementation 'org.springframework.boot:spring-boot-starter-web'
  	testImplementation 'org.springframework.boot:spring-boot-starter-test'
  }
  
  tasks.named('test') {
  	useJUnitPlatform()
  }
  ```
3. 프로젝트 버전 확인
   * 버전 확인: 로컬과 인텔리제이 모두 JDK 11인지 확인한다.
     * 로컬 버전 확인 : JDK 11 일치!
    ![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/0916578e-a41e-4bf9-973d-99b8a7d54bca)
       
     * 인텔리제이 확인
       * 프로젝트 JDK 설정: File -> Project Structure
         * JDK 11로 버전 맞춰주기
           ![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/c08df55b-1a4a-42c5-961d-f4813df3ad75)
           ![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/9f29a996-a297-4b88-ad50-45c7f5388610)
       * Gradle JDK 설정: IntelliJ Idea -> Setting
         * IntelliJ IDEA 설정하기
         * JDK 11로 버전 맞춰주기
            ![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/39a76e68-730a-4386-9878-c9bc632fa67a)
            ![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/33ef69bf-1456-4c2b-ae8a-46a0846a3de4)

##동작확인

정상적으로 작동되는 지 확인한다!
로컬에서 아래와 같은 화면이 나타나면 개발 완료
![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/66b86eb5-cbe1-40e9-a475-f782fc74d2e3)
![image](https://github.com/kyungshik/spring_practice_basic/assets/98220653/4cb65cab-2773-4e40-bd8b-e0df2dafde36)   


 
