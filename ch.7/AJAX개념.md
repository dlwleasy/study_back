아래는 AJAX 서버 요청 방법에 대한 내용을 마크다운으로 정리한 것입니다! 😊

```markdown
# AJAX 정리

## 1. AJAX란?
- **AJAX (Asynchronous JavaScript and XML)**:  
  서버와의 비동기 통신을 통해 새로고침 없이 데이터를 가져오거나 서버로 데이터를 보낼 수 있는 기술.

---

## 2. 서버 요청 방법
1. **원하는 데이터 URL을 알아내기**
2. **이 URL로 GET 요청하기**

### GET 메소드 사용 방법
1. **URL 직접 입력하기**
   - 브라우저 주소창에 URL을 입력하여 데이터 확인
2. **Form 형식으로 요청 (버튼 클릭)**
   - 데이터를 전송할 때 새로고침이 필요함
3. **AJAX로 GET 요청하기 (JS 코드 사용)**
   - 새로고침 없이 데이터를 가져올 수 있음 (부드러운 사용자 경험 제공)

---

## 3. AJAX를 사용한 GET 요청 예시
```javascript
// JavaScript AJAX 코드 예시
const xhr = new XMLHttpRequest();
xhr.open("GET", "https://example.com/data", true);  // 비동기 GET 요청
xhr.onload = function() {
  if (xhr.status === 200) {
    console.log("데이터:", xhr.responseText);  // 서버로부터 응답받은 데이터 출력
  }
};
xhr.send();
```

---

## 4. AJAX의 장점
1. **새로고침 없이 데이터 가져오기**:  
   페이지 전체를 다시 로드하지 않아 부드럽고 빠른 사용자 경험 제공
2. **사용자 경험 개선**:  
   부분적으로만 데이터를 갱신할 수 있어 웹 애플리케이션 성능 향상

---

## 5. AJAX의 활용 예시
- 검색 결과 실시간 업데이트
- 페이지 일부만 변경하여 더 빠른 사용자 반응 제공
- 채팅 메시지 실시간 갱신
```

이 마크다운 파일을 깃허브에 올리면 AJAX에 대해 깔끔하게 정리된 문서를 공유할 수 있어요! 😊
