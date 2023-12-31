# 🍀 로또 🍀

## [ 요구사항 ]
### Step 1 - 로또 (자동)
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1,000원이다.
- 당첨 통계를 보여준다.
### Step 2 - 로또 (2등)
- 2등을 위해 추가 번호를 하나 더 추첨한다.
- 당첨 통계에 2등도 추가해야 한다.
### Step 3 - 로또 (수동)
- 현재 로또 생성기는 자동 생성 기능만 제공한다. 사용자가 수동으로 추첨 번호를 입력할 수 있도록 해야 한다.
- 입력한 금액, 자동 생성 숫자, 수동 생성 번호를 입력하도록 해야 한다.

<br>

## [ 기능 구현 목록 ]
### Step 1 - 로또 (자동)
- [x] 사용자에게 로또 구입 금액을 입력받는다.
- [x] 입력한 금액만큼 로또를 자동으로 생성한다.
- [x] 구입한 자동 로또에 대한 정보를 모두 출력한다.
- [ ] 당첨 번호를 입력받는다.
- [ ] 당첨 번호와 로또의 번호를 비교하여 당첨 통계를 계산하여 출력한다.
- [ ] 당첨 통계에 총 수익률을 추가로 계산하여 출력한다.

### Step 2 - 로또 (2등)
- [ ] 보너스 볼을 추가로 입력받는다.
- [ ] 당첨 통계에 2등도 추가로 계산하여 출력한다.

### Step 3 - 로또 (수동)
- [ ] 수동으로 구매할 수를 입력받는다.
- [ ] 수동으로 구매할 번호를 구매한 복권 수만큼 입력받는다.
- [ ] 수동 로또와 자동 로또 모두 출력한다.

<br>

## [ 규칙 ]
### 객체지향 생활 체조 원칙 중 일부
- 한 메서드에 오직 한 단계의 들여 쓰기만 한다.
- else 예약어를 쓰지 않는다.
- **모든 원시 값과 문자열을 포장한다.**
- **줄여 쓰지 않는다. (축약금지)**
- **일급 컬렉션을 쓴다.**