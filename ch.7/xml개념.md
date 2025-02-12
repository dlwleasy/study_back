
# XML 정리

## 1. XML: 마크업 형태로 데이터를 교환하는 형식
- **마크업**: 태그를 이용하여 문서나 데이터의 구조를 나타내는 방법. 속성(attribute)을 부여할 수 있음.

---

## 2. XML 구성 요소
1. **프롤로그**: 버전, 인코딩 정보 포함
2. **루트 요소**: 단 하나만 존재해야 함
3. **하위 요소들**: 루트 요소 내에 포함될 수 있는 여러 개의 요소

### XML 예시
```xml
<?xml version="1.0" encoding="UTF-8"?>
<OSTList>
  <OST>
    <name>gd</name>
    <song>니가 뭔데</song>
  </OST>
  <OST>
    <name>태양</name>
    <song>새벽 한시</song>
  </OST>
</OSTList>
```

---

## 3. HTML과 XML의 차이
1. **용도**
   - HTML: 데이터를 화면에 **표시**하는 데 사용
   - XML: 데이터를 **저장**하고 **전송**하는 데 사용
2. **태그의 정의**
   - HTML: 미리 정의된 태그를 사용
   - XML: 사용자가 고유한 태그를 정의 가능 (커스텀 태그 사용)
3. **대소문자 구분**
   - HTML: 대소문자 구분 안 함 (`<body>`와 `<BODY>`는 동일)
   - XML: 대소문자 구분 (`<name>`과 `<Name>`은 서로 다름)

---

## 4. JSON과 XML의 차이
1. **데이터 표현 방식**
   - XML: 닫힌 태그를 사용하여 데이터 표현  
     예: `<name></name>` (key 값을 두 번 작성)
   - JSON: `{ "name": "value" }` 형태로 간결하게 표현
2. **자바스크립트와의 호환성**
   - XML: 데이터를 자바스크립트 객체로 변환하려면 추가적인 작업 필요
     ```javascript
     const parser = require('xml2json');
     let a = parser.toJson(a);  // XML을 JSON으로 변환
     ```
   - JSON: `JSON.parse()` 함수로 간단하게 객체로 변환
     ```javascript
     let obj = JSON.parse(jsonString);  // JSON 문자열을 객체로 변환
     ```

---

## 5. XML 활용
- **Sitemap.xml**
  - 웹 서비스에서 여러 페이지(home, user 등)를 검색 엔진에 노출시키기 위해 사용
  - **SEO (Search Engine Optimization)**: 구글과 같은 검색 엔진의 데이터베이스에 페이지 정보를 저장하고, 이 정보를 바탕으로 검색 결과에 노출시킴

---

## 6. XML의 장단점
### 장점
1. 데이터 저장 및 구조화에 유용
2. 다양한 시스템 간 데이터 교환 용이
3. 사용자가 정의한 태그 사용 가능 (확장성)

### 단점
1. 태그로 인해 데이터 크기 증가 (JSON보다 용량 큼)
2. 자바스크립트와의 호환성에서 JSON보다 불편
