## 문자열 계산기 기능 목록
-[x] 입력받은 문자열에서 커스텀 구분자를 추출 (CustomDelimiter.extraction())  
-[x] 문자열에서 //부터 /n까지 제거 (CustomDelimiter.remove())  
-[x] 커스텀 구분자로 문자열에서 Split (CustomDelimiter.customSplit())  
-[x] 쉼표, 콜론으로 문자열에서 split (customDelimiter.defaultSplit())  
-[x] 추출한 값이 숫자나 음수가 아니면 Exception 출력   
-[x] 추출된 숫자의 합을 구함 (Calculator.add())  
-[x] 문자열 계산기 실행(Calculator.execute())

## 로또(자동) 기능 목록
-[x] 로또 한장을 구매하는데 천원 (복수 가능) Lotto -> price
-[x] 로또 구매한 개수에 대한 잔액 확인 Lotto.payment
-[ ] 로또 한장을 구입하면 1~45중 중복되지 않은 6개 숫자 생성  RandomNumber/generate
-[ ] 당점번호와 보너스 번호랑 구매한 로또 번호랑 비교  Lotto/compare
-[ ] 3개 일치(5000원), 4개 일치(1.5원), 5개 일치(150만원), 5개+보너스 일치(3천만원), 6개 일치(20억) 결과 확인 Lotto/result
-[ ] 구매 금액에 대한 당첨 결과 수익률 계산  Lotto / profit