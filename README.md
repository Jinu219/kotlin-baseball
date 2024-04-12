# kotlin-baseball

기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

- 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
    - 예) 상대방(컴퓨터)의 수가 425일 때
        - 123을 제시한 경우 : 1스트라이크
        - 456을 제시한 경우 : 1볼 1스트라이크
        - 789를 제시한 경우 : 낫싱
- 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플레이어는 컴퓨터가 생각하고 있는 서로 다른 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
    - 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
    - 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
    - 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.



< Commit > 
- [x] 컴퓨터는 1~9까지 서로 다른 임의의 수 3개를 선택한다   
  -[x] 100 ~ 999 중 숫자 하나를 골라서 리스트 값으로 변환
  - [x] -> Fix : 중복 불가능하게 변경 / 정수값이 아닌 초기가 타입이 리스트임.
- [x] 플레이어는 컴퓨터가 생각하고 있는 서로 다른 3개의 숫자를 입력한다
  - [x] IllegalArgumentException 발생 및 그 부분 부터 입력을 다시 받게 한다.
  - [x] 입력받은 값이 Int값이 아닐때 다시 입력을 받게 한다.
  - [x] 입력받은 값이 3자리 미만, 3자리 초과일떄 다시 입력을 받게 한다.
- [x] 스트라이크, 볼, 낫싱의 힌트를 표시한다.
- [x] 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
- [x] README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- [x] Git의 커밋 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.


< Test >
- [x] 모든 로직에 단위 테스트를 구현한다. 단, Controller, UI(System.out, System.in) 로직은 제외
-  [x] -> private 함수는 구현하지 않는다.
-  [x] Judgement -> 스트라이크 볼 낫싱 힌트 표시 
-  [x] 컴퓨터는 서로 다른 3개의 수를 선택한다
-  [x] 사용자가 입력하는 수는 3자리수여야 한다

< Code Review >
- [x] GameController의 CheckInt를 InputView의 책임으로 봐도 된다.
- [x] Count라는 클래스의 이름이 너무 범용적이다 -> 무슨 역할을 하는 지 알기 쉽게 이름을 바꿔보자 
  - Count -> Referee
- [x] 변수명에 컬렉션이 포함되면 안된다. 
- [ ] GameTest에는 Game을 테스트 해야하며 로직이 존재하면 안된다.
- [x] GameController -> View -> GameController 수정 // 순환참조가 발생한다.
- [x] "게임에서 승리했다", "Strike : 3"이 View의 로직인가? // 비즈니스 로직과 뷰로직 분리 
- [x] 리스트는 복수형 변수를 사용해야 한다.