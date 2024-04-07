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
  - [x]-> Fix : 중복 불가능하게 변경 / 정수값이 아닌 초기가 타입이 리스트임.
- [x] 플레이어는 컴퓨터가 생각하고 있는 서로 다른 3개의 숫자를 입력한다
  - [x] IllegalArgumentException 발생 및 그 부분 부터 입력을 다시 받게 한다
- [x] 스트라이크, 볼, 낫싱의 힌트를 표시한다.
- [ ] 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
