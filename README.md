# 코틀린 코딩 테스트 : 1일 1알고리즘 ~ 3알고리즘
백준 연동된 레퍼지토리
# import 정리
1. stack 사용 : import java.util.Stack
2. StringBuilder 사용 : import java.lang.StringBuilder

# 특이 함수 정리
1. 이분탐색 사용 : binarySearch

# 브루트 포스 (brute force) 알고리즘
모든 경우의 수를 하나 하나 체크해가면서 정답이 나올 때 까지 실행하는 알고리즘을 의미한다.

## 백준
1436번

# 이분 탐색 (Binary Search) 알고리즘 => .binarySearch
UpAndDown 게임이라고 생각하면 쉽다.
-시작점 , 중간점 , 끝점 이 세가지 를 사용하여 탐색의 범위를 설정한다.
-단계마다 탐색 범위를 2로 나누는 것과 동일하므로 연산 횟수는 log2N에 비례한다.
-따라서 시간 복잡도는 o(logN)을 보장한다.

## 백준
1654번 , 1920번(.binarySearch)

# 에라토스테네스의 체
소수를 찾을 때 소수가 아닌 합성수를 제거하면서 찾는 개념이다.
이때 주의해야 할 것은 배열을 Boolean으로 생성하는데 2는 소수이나 계산 과정에서 2는 생략되므로 초기 배열 생성 후 수동으로 인덱스1번(2)자리를 true로 설정해줘야 한다.

# 주의사항
1. while(1) 안 먹힘 : while(true) 하기
2. bufferedReader() 사용하기

# 코틀린 기본 문법 정리
1. Array(size) : 사이즈를 size로 갖는 배열 생성

2.for (lan in lans) { ... } : lans 배열의 요소를 순회하면서 { ... }에서 요소를 활용한 로직 처리

# 2024-04-23 
1. 이분 탐색 알고리즘 개념 정리하기(O)

-Array(size) : 사이즈를 size로 갖는 배열 생성

-for (lan in lans) { ... } : lans 배열의 요소를 순회하면서 { ... }에서 요소를 활용한 로직 처리


