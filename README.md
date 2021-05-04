## 기능 요구사항
- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우  
구분자를 기준으로 분리한 각 숫자의 합을 반환 (e.g. "" => 0, "1,2" => 3, "1,2,3" => 6, "1,2:3" => 6)
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 
  “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 
  예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.
1 2 3 
;
## 기능 목록
-[x] 입력받은 문자열에서 커스텀 구분자를 추출 (CustomDelimiter.extraction())  
-[x] 문자열에서 //부터 /n까지 제거 (CustomDelimiter.remove())  
-[x] 커스텀 구분자로 문자열에서 Split (CustomDelimiter.customSplit())  
-[x] 쉼표, 콜론으로 문자열에서 split (customDelimiter.defaultSplit())  
-[x] 추출한 값이 숫자나 음수가 아니면 Exception 출력   
-[x] 추출된 숫자의 합을 구함 (Calculator.add())  
-[ ] 문자열 계산기 실행(Calculator.execute())


