# 협곡 매치
<Strong>진행 기간 : 2022.1.23 ~ 2022.2.13</Strong><br>

## 프로젝트 소개
Player와 Computer가 챔피언을 선택하여 1:1 대전을 진행하는 프로그램

## 패키지 구조
![스크린샷 2022-02-09 오후 8 27 49](https://user-images.githubusercontent.com/60283977/153191147-83dea08b-9210-4a21-a9b1-aa077d8ed65c.png)

## 프로젝트 주요 기능
🔗 https://www.notion.so/33190faf30524339b443ce27265317a3 (주요 기능 설명)

##  클래스 설계도
🔗 https://www.notion.so/9955b5a87e7e4861a8f70b594fb28597 (클래스 설계도 내용 정리)
![스크린샷 2022-02-11 오전 1 10 43](https://user-images.githubusercontent.com/60283977/153448461-db874018-2721-49c5-93b0-41b39bcf0fb3.png)

##❗프로젝트 이슈
#### 문제점
대결 상황에서 Player 또는 Computer의 공격 차례일 떄 공격할 수 있는 제한 시간이 흐르는 기능을 구현하는 과정에서 
대전하는 동안 지속적으로 제한 시간이 흐르는 것이 아닌 Player의 공격이 끝나면 흐르고, Computer의 공격이 끝나야 흐르는 문제점 발생
#### 해결법
원인은 프로세스 내에서 하나의 스레드가 순차적인 흐름으로 동작하여 문제가 발생하는 것이었다.
문제의 해결을 위해 타이머 기능만을 하는 스레드를 생성해, 멀티 스레드를 적용함으로써, 병렬적인 흐름으로 작업이 가능해져 이슈를 해결할 수 있었다.

## 프로그램 동작
![스크린샷 2022-02-11 오전 12 27 47](https://user-images.githubusercontent.com/60283977/153439874-d4a9e93f-292e-47b4-90c6-eccbac802c37.png)

## 시연 영상
https://youtu.be/E9n8lHgfsEA

## 프로젝트 회고
### 진행하면서 아쉬운 부분(개선하고 싶은 점)
프로그램을 완성한 이후에도 개선해야 할 점이 보여 수정이나 추가 코드를 작성하는 일이 빈번히 발생했다.  
그럴 때마다 비슷한 기능을 가지는 중복된 코드들로 인해 수정해야 하는 부분은 적지 않았다.
프로그램은 계속 업데이트되어야 함으로써, 추후에도 이 문제는 계속 반복될 것이고 이것은 효율적이지 않다는 생각이 남아있었다.  
하지만 프로젝트를 진행하는 과정에서는 기간 내 구현이 1순위였기에 기간에 맞추다 보니 코드 퀄리티 부분까지 신경 쓰기에는 시간적 여유가 없었던 것 같다.  
이번 프로젝트가 끝난 후 가장 아쉬운 부분이면서 계속 문제가 될 수 있는 부분이라 생각하며, 추후에 재사용 가능한 코드, 중복 코드를 찾아 메소드를 활용해 코드 퀄리티를 개선하고 싶다.

### 프로젝트 진행 후 느낀점
1. <strong> 클래스를 적용하면서, 상속의 필요성에 대하여 알게 되었다.</strong>

   - 매번 같은 속성과 메소드를 가지는 챔피언들의 클래스 생성 시 공통 속성을 가지는 부모 클래스를 상속하기 떄문에 따로 속성을 추가할 필요 없다.
   - 부모 클래스에서 선언한 속성 및 메소드를 가져와 편리하게 사용할 수 있다.
   - 모든 자식 클래스의 속성 수정이 필요할 떄 부모 클래스만을 수정함으로써, 유지보수가 좋아진다.
           <br>
   

2. <strong>Player와 Computer가 공격과 스킬을 사용하며 대전을 할 때, 동시다발적으로 공격 제한 시간 타이머가 흐르도록 구현하는 과정에서
  스레드의 동작 과정, 상황에 따른 동기적인 흐름과 비동기적 흐름 사용의 필요성에 대하여 알게 되었다.<br></strong>


3. <strong>팀원과 프로젝트를 공유하는 시간을 가지면서 작성한 코드에 대한 주석을 내 입장에서 이해하기 쉽게 작성했다고 생각했는데,
  팀원은 내 생각처럼 쉽게 이해하지 못했고, 추후 팀 프로젝트를 진행할 때 팀원이 더 쉽게 이해할 수 있게 작성해 의사소통의 시간을 줄일 수 있도록 개선해야겠다고 느꼈다.</strong>
