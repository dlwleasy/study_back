---
1. 백엔드도 HTML을 알아야 하는 이유

- HTTP요청은 웹 브라우저를 통해 일ㅇ어나는데, HTML문서가 이 웹브라우저에 띄워져있기때문에, HTML문서로부터 요청이 날아온다고 말해도 됨.
웹 브라우저에서 보내는 방법과 백엔드 웹 애플리케이션에서의 받는 방법은 서로 동일해야 되기 때문에 (요청을 정상적으로 처리하기 위해) HTML에 대한 기본적인 이해가 필수적이다.

- api만 만들더라도 프런트엔드에서 어떤 형태로 사용될지 고려하여 설계해야됨
실제 서비스를 가정해 기존 api설계에 있던 모순을 찾아내기 위해서 필요함
하나의 서비스를 만들 수 있게 되기 때문이다.

- 서비스 내부 영역에 있는 api 서버와 시스템에도 개발자나 기획자들 혹은 모니터링을 하는 운영자들에게 제공할 프런트엔드 페이지가 필요하다.

---
2. html 구조
html태그에 사용되는 언어

1.form 태그와 input태그 

2. 주석
<!-- -->

<html lang="ko"></html> 한글로 작성된 페이지임을 나타냄
<html lnag="en-US></html>
웹 페이지의 언어와 사용자의 언어가 다른경우 웹 페이지의 번역기능을 사용할 수 있다.
기능으로 속성lang을 지정해야만 된다.

언어별로 문서를 따로 만들거나, 한 문서 내에서 JavaScript로 동적으로 변경할 수 있습니다.
-> 이는 코드로 확인할 수 있다. 

3.최상단의 html 태그
html태그가 문서의 최상단에 반드시 들어가고, html태그 안쪽에는 head태그와 body태그가 작성된다.
구조적으로 생략하지 않고 작성해주는 것이 좋다.

-< head 태그>> : 해당 문서를 설명해주는 내용이 들어있음 = 메타데이터 (어떤 데이터를 설명하느 데이터)
title 태그 : HTML의 문서의 제목표현
link태그 : CSS파일으 불어와 적용
meta태그 : 캐리터셋이나 검색엔진에게 해당페이지를 크롤링하기 위한 여러 정보 제공 
-> 코드 참고

HTML문서는 인코딩 방식과 캐릭터셋이 맞아야 정상적으로 출력된다. 

| **Meta 태그**                               | **설명**                                                                                                                                                                                   |
|---------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `<meta name="description" content="...">`   | 페이지에 대한 간단한 설명 제공. 검색 결과의 스니펫으로 사용됨.                                                                                                                             |
| `<meta name="robots" content="..., ...">`   | 검색엔진의 크롤링 및 색인 동작 제어. 모든 검색엔진에 적용됨.                                                                                                                                |
| `<meta name="googlebot" content="..., ...">`| Google 검색엔진의 크롤링 및 색인 동작 제어. `robots`와 충돌 시 더 제한적인 태그가 적용됨.                                                                                                   |
| `<meta name="google" content="nositelinkssearchbox">` | 사이트 검색결과에 사이트 전용 검색창 표시 방지.                                                                                                                              |
| `<meta name="googlebot" content="notranslate">` | 페이지 번역 기능 비활성화. 사용자가 선호하는 언어로 페이지 번역 방지.                                                                                                                     |
| `<meta name="google" content="nopagereadaloud">` | Google의 TTS(텍스트 음성 변환) 기능으로 페이지 읽기 방지.                                                                                                                                |
| `<meta name="google-site-verification" content="...">` | Search Console에서 사이트 소유권 확인. 제공된 값과 정확히 일치해야 함.                                                                                                                     |
| `<meta http-equiv="Content-Type" content="...; charset=...">` | 페이지의 콘텐츠 유형과 문자 집합 정의. UTF-8 사용 권장.                                                                                                                                    |
| `<meta charset="...">`                      | 콘텐츠 문자 집합 정의. UTF-8 권장.                                                                                                                                                        |
| `<meta http-equiv="refresh" content="...;url=...">` | 특정 시간 후 새 URL로 리디렉션. 서버 측 301 리디렉션을 권장함.                                                                                                                             |
| `<meta name="viewport" content="...">`      | 모바일 장치에서 페이지를 렌더링하는 방법 지정. 페이지가 모바일 친화적임을 Google에 알림.                                                                                                   |
| `<meta name="rating" content="adult">`      | 성인용 콘텐츠 페이지로 라벨 지정. 세이프서치에서 필터링됨.                                                                                                                                 |
| `<meta name="rating" content="RTA-5042-1996-1400-1577-RTA">` | 성인용 콘텐츠 페이지임을 표시. 세이프서치에서 필터링됨.                                                                                                                                    |


https://developers.google.com/search/docs/crawling-indexing/special-tags?hl=ko : 구글 공식 문서 



1. name 속성
정의: input 태그의 데이터를 식별하는 이름.
역할: 서버로 전송된 데이터를 처리할 때, 서버는 name 속성값으로 데이터를 받음.
예시:
<input type="text" name="title"> → 서버에서 title이라는 키로 값 처리.

3. 독타입 
html 태그에 포함되지 않고 밖에 작성하는 태그 
해당 HTML의 문서가 어떤 버전으로 작성된 것인지를 명시하는 기능
: 버전을 써주지 않으면 가장 최신 버전사용 선언 하는 것과 일치


4. minify
파일에 줄바꿈이 전혀 되어있지 않거나, 띄어쓰기가 생략되어 있는 경우 : 파일 용량을 줄이기 위한것
네트워크 트래픽이 줄어들어 운영비용을 절감할 수 있음 

5. 오픈그래프 SEO
미리보기 창

6. link 태그

CSS파일을 HTML페이지에 적용하기 위해 사용


<<BODY>>태그 
사용자 눈에 보이는 HTML 페이지의 내용이 들어가는 영역

- 링크를 생성하는 a 태그
다른 웹 페이지로 이동할 수 있는 링크를 생성하며, 주소만 넣으면 된다.

<body>
  <a href = "https://www.google.com/">구글로 이동</a>
 <a href = "https://www.google.com/"target="_blank">구글로 이동</a>
  : 현재 창은 그대로 둔 채 새로운 창 혹은 새로운 탭으로 열리도록 바꾸기
</body>
- 
-html img 태그
<img src = "https://www.gd.co.kr.jpg">


- javascript를 넣는 script 태그
 : html태그가 script태그보다 앞쪽에 있어야 제어가 된다. 먼저 a가 정의되어야 기능을 부여하니까

<html>
  <head>
    <meta charset = "utf-8">
  </head>
  <body>
    <a href="https://www.google.com/">어떤링크</a>
    <script>
      document.querySelector('a').innerText = '구글로 이동';
    </script>
  </body>
</html>



---
그렇다면 프론트의 html문서는 어떻게 이루어져 있고, 각각 어떤 역할을 할까?

1. HTML (HyperText Markup Language)
HTML은 웹 페이지의 기본 구조를 만드는 뼈대 역할을 합니다.

역할: 콘텐츠를 배치하고 구조화.
예: 제목, 단락, 이미지, 링크 등.
특징:
HTML은 정적인 태그 기반 언어로, 디자인이나 동적 동작은 포함되지 않음.
<div>, <h1>, <p> 같은 태그를 사용.
2. CSS (Cascading Style Sheets)
CSS는 HTML에 스타일을 입혀주는 화장품 역할을 합니다.

역할: 글자 크기, 색상, 레이아웃 등 디자인을 정의.
특징:
HTML과 분리된 외부 파일로 사용하거나, <style> 태그를 통해 HTML 내부에 작성 가능.
예:
css
복사
편집
body {
  background-color: #f0f0f0;
  font-family: Arial, sans-serif;
}
3. JavaScript
JavaScript는 HTML과 CSS에 동적인 동작을 추가하는 역할을 합니다.

역할: 버튼 클릭, 데이터 처리, 사용자와의 상호작용 등 동적 기능 제공.
특징:
<script> 태그로 HTML 안에 작성하거나 외부 파일로 포함 가능.
예:
javascript
복사
편집
document.getElementById("myButton").addEventListener("click", function() {
  alert("Button clicked!");
});
4. React (JavaScript 라이브러리)
React는 더 복잡하고 동적인 웹 애플리케이션을 쉽게 개발하기 위한 JavaScript 라이브러리입니다.

역할: 컴포넌트 기반으로 UI를 효율적으로 개발.
특징:
React는 JavaScript의 확장 문법인 JSX를 사용.
상태 관리(state), 컴포넌트 간 데이터 흐름 등을 처리.
예:
javascript
복사
편집
function App() {
  const [count, setCount] = React.useState(0);

  return (
    <div>
      <h1>Count: {count}</h1>
      <button onClick={() => setCount(count + 1)}>Increase</button>
    </div>
  );
}
정리
HTML: 웹의 구조를 만듦 (뼈대 ).
CSS: 웹의 디자인을 만듦 (화장 ).
JavaScript: 동작을 추가 (생명 ).
React: 동적 웹앱을 효율적으로 만듦 (똑똑한 뇌 ).
HTML은 "기초 구조"를 제공하고, CSS와 JavaScript, React는 그 위에 올려져서 각각 스타일과 기능을 확장하는 역할


  +) https://www.yes24.com/product/goods/72297124 모던 웹을 위한 HTML5+CSS3 바이블
     https://www.w3schools.com/html/default.asp
----
3. 웹 브라우저와 서버의 상호작용 

웹 브라우저가 서버와 상호작용하는 4가지 방법 : 
  각 상황에따라 적절하게 사용하기 
  
-1. URL을 통한 접속
-2. form태그를 사용하여 form 제출
-3. XHR을 사용한 AJAX 요청
-4. 웹 소켓을 통한 요청

  1.URL을 통한 접속 : ch.8 참고 
  사용자가 직접 URL입력 또는 a태그가 걸려있는 링크를 통해 접근 

  HTTP는 요청의 종류를 메서드로 구분한다.
    url을 통한 것이라면 get메서드를 사용한다- http요청 메서드 

  2. form태그를 사용하여 form 제출 
  웹사이트에서 자주 보았을 로그인 창이나 게시글 작성화면에서 보게 되는 입력란에 자주 사용됨
  GET, POST를 주로 사용

1,2 : 정보를 전송하기 위해 반드시 화면을 새로고침 해야됨
  
  3. XHR을 사용한 AJAX 요청
   : 새로고침 없이 정보를 요청하고 받아올 수 있음

 1,2,3 : 정보교환을 시작할 수있는 주체가 오직 '클라이언트' , 서버쪽에서 주도적으로 클라이언트에게정보를 전달할 수 없음
  
  4. 웹 소켓을 통한 요청
   양방향 통신을 가능하도록 지원함.SSE도 가능 (다음에 비교해보기)
     문자의 경우, 문자를 보내면 수신하기전에 서버가 먼저 알게되는 것이다.

     그래서. 웹 소켓이 등장하기 전에는 AJAX요청을 보내 서버의 상태변경을 체크했었다.(폴링)
             웹뿐 아닌 상대의 상태변경을 체크하기 위해 주기적으로 요청하는 방식을 지칭하는 말로도 널리 사용됨
  
---
    2. form태그를 사용하여 form 제출 
  웹사이트에서 자주 보았을 로그인 창이나 게시글 작성화면에서 보게 되는 입력란에 자주 사용됨
  GET, POST를 주로 사용 - > 자세히 알아보기

  태그타입
  text : 글자를 입력할 수 있는 공간
  submit : 제출이라는 버튼이 생성됨
  

  2. submit 버튼
특징: name 속성이 없으며, 서버로 전송되지 않음.
역할: form 태그 내부 데이터를 서버로 제출하는 동작 수행.
정리: submit은 form 태그의 동작을 완료하면 역할이 종료됨.

3. form 태그
역할: 데이터를 서버로 전송.
속성:
action: 데이터를 전송할 서버의 경로(URL).
예: action="./article"
주의: 경로가 없으면 요청 실패. 해당 경로를 처리할 컨트롤러 또는 파일이 필요.
method: HTTP 메서드 지정.
POST: 데이터를 본문(body)에 담아 전송. 주로 데이터 생성 시 사용.
GET: URL에 데이터를 쿼리 문자열로 첨부. 데이터 조회에 적합.
enctype: 데이터 인코딩 방식 (추후 학습 필요).

4. 컨트롤러 추가
문제: 위 예제에서 ./article 경로를 처리할 컨트롤러가 없으면 실행되지 않음.
해결 방법: ./article 요청을 처리할 컨트롤러 추가.
article 파일 생성 후 서버에서 처리.

5. 학습 전략
태그별 역할: 각 태그가 어떤 데이터를 처리하고, 어떤 상황에서 사용되는지 파악.
HTTP 메서드 구분:
POST: 데이터 생성/전송.
GET: 단순 링크나 데이터 조회.
데이터 전송 방식 이해: 요청 시 데이터가 서버에 어떻게 전달되고, 어떤 응답이 오는지 학습.

추가 참고 자료 -검색해보기 
HTML Form Input Types : 다양한 input 타입 확인.
HTML Forms Guide : 폼 태그 속성 및 사용법.

추가로 해야되는 공부 
enctype 사용법: 파일 업로드와 같은 특수 상황에서 필요.
API 문서 작성: 컨트롤러와 요청/응답 흐름에 대한 상세 문서화.
각 input 타입의 차이점: 데이터 전송 방식, 사용 사례별 적합성.
