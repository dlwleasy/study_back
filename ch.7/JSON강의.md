# JSON 개념 및 활용 정리

## 1. JSON이란?
JSON(JavaScript Object Notation)은 **자바스크립트 객체 문법을 기반으로 한 데이터 교환 형식**이다. 여러 프로그래밍 언어에서 데이터 교환을 위해 사용되며, 단순한 배열, 문자열 등의 표현도 가능하다.

## 2. 데이터 + 교환 형식
- **데이터(Data)**: 추상적인 아이디어부터 구체적인 측정값까지 포함하는 개념으로, 실험, 조사, 관찰 등을 통해 얻을 수 있는 사실이나 자료.
- **교환 형식(Format)**: 데이터를 기업 또는 시스템 간에 전달할 때 필요한 통일된 형식.

## 3. 여러 언어에서의 JSON 활용
JSON은 다양한 언어에서 **객체(Object), 해시 테이블(Hash Table), 딕셔너리(Dictionary)** 등의 자료구조로 변환되어 활용된다.

## 4. JSON 데이터 표현 방식
```json
{
  "name": "minkyeong",
  "like": ["coding", "exercise"]
}
```

```json
{
  "name": "minkyeong",
  "like": {
    "coding": "computer science subject",
    "exercise": "weight"
  }
}
```

```json
{
  "name": "minkyeong",
  "like": {
    "coding": {
      "what": "computer science subject",
      "which": "java"
    },
    "exercise": {
      "what": "weight",
      "which": "idontknow"
    }
  }
}
```

배열을 활용하면 다음과 같이 표현할 수도 있다.

```json
{
  "name": "minkyeong",
  "like": [
    {
      "name": "coding",
      "what": "computer science subject",
      "which": "java"
    }
  ]
}
```

## 5. JSON의 데이터 타입
JSON은 **JavaScript 객체와 유사하지만**, `undefined` 또는 함수(메서드)는 포함하지 않는다.

```javascript
const a = {
  "a": () => { console.log(1) },
  "b": undefined  
};
console.log(a); // JSON에 저장할 수 없는 값 포함
```

JSON에서 사용할 수 있는 데이터 타입:
- 객체(Object)
- 배열(Array)
- 문자열(String)
- 숫자(Number)
- 참/거짓(Boolean)
- `null`

## 6. JSON 직렬화 & 역직렬화
- **직렬화(Serialization)**: 데이터를 외부 시스템에서도 사용할 수 있도록 **문자열(바이트 형태)로 변환**하는 과정.
- **역직렬화(Deserialization)**: 직렬화된 데이터를 **객체 형태로 복원**하는 과정.

```javascript
const obj = { name: "Ji Won", age: 22 };

// JSON 직렬화 (객체 → 문자열)
const jsonStr = JSON.stringify(obj);
console.log(jsonStr); // "{"name":"Ji Won","age":22}"

// JSON 역직렬화 (문자열 → 객체)
const parsedObj = JSON.parse(jsonStr);
console.log(parsedObj.name); // Ji Won
```

**즉, JSON 자체는 직렬화된 데이터(문자열)이며, 이를 객체로 변환하는 과정이 역직렬화이다.**

## 7. JSON의 활용
JSON은 **프로그래밍 언어와 프레임워크에 독립적**이므로, 서로 다른 시스템 간 데이터 교환에 유용하다.'
- 주요 활용 사례
- **API 반환 형식** (예: 업비트 API, GitHub API)
- **설정 파일** (예: `package.json`, `tsconfig.json`)
- **데이터 저장 및 전송** (예: 클라이언트-서버 간 통신)

---
##  정리
1. **JSON은 데이터 교환을 위한 형식**으로, 객체뿐만 아니라 배열, 문자열 등도 표현 가능하다.
2. **직렬화된 데이터(문자열) 형태이며, 역직렬화를 통해 객체로 변환하여 활용 가능하다.**
3. **다양한 언어에서 객체, 해시 테이블, 딕셔너리 형태로 변환하여 사용된다.**
4. **API 및 설정 파일 등 다양한 곳에서 활용된다.**

 **JSON은 현대 소프트웨어 개발에서 필수적인 데이터 형식이다!**


