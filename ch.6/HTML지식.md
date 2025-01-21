# 개발에 필요한 HTML지식 
---
## 1. 백엔드도 HTML을 알아야 하는 이유

- 웹 브라우저(in html문서) -> 서버 , html문서 -> 서버 ( HTTP 요청 )
보내는 방법, 받는 방법 동일해야, 요청을 정상적으로 처리가능.

- api만 만들더라도 프런트엔드에서 어떤 형태로 사용될지 고려하여 설계해야됨,실제 서비스를 가정해 기존 api설계에 있던 모순을 찾아내기 위해 필요
  또한 하나의 서비스 생성 가능 

- 서비스 내부 영역에 있는 api 서버와 시스템에도 개발자나 기획자들 혹은 모니터링을 하는 운영자들에게 제공할 프런트엔드 페이지가 필요

---
## 2. html 구조 

### 1.form 태그와 input태그 

### 2. 주석 : <!-- -->

### 3. lang 태그

<html lang="ko"></html> 한글로 작성된 페이지임을 나타냄
<html lang="en-US></html>
웹 페이지의 언어와 사용자의 언어가 다른경우 웹 페이지의 번역기능을 사용 가능.

언어별로 문서를 따로 만들거나, 한 문서 내에서 JavaScript로 동적으로 변경(코드 참고)

### 4. 최상단의 html 태그
**html태그가 문서의 최상단**에 반드시 들어가고, html태그 안쪽에는 **head태그**와 **body태그**가 작성된다.
구조적으로 생략하지 않고 작성해주는 것이 좋다.

**1. head 태그** 

**head 태그** : **해당 문서를 설명**해주는 내용 = **메타데이터** (어떤 데이터를 설명하느 데이터)
**title 태그** : HTML의 문서의 **제목표현**
**link태그** : **CSS파일** 불어와 적용
**meta태그** : 캐리터셋이나 검색엔진에게 해당페이지를 **크롤링하기 위한 여러 정보 제공** 
-> 코드 참고
HTML문서는 인코딩 방식과 캐릭터셋이 맞아야 정상적으로 출력된다. 
https://developers.google.com/search/docs/crawling-indexing/special-tags?hl=ko : 구글 공식 문서 


### 4. 독타입 
html 태그에 포함되지 않고 밖에 작성하는 태그 
해당 HTML의 문서가 어떤 버전으로 작성된 것인지를 명시하는 기능
: 버전을 써주지 않으면 가장 최신 버전사용 선언 하는 것과 일치


### 5. minify
파일에 줄바꿈이 전혀 되어있지 않거나, 띄어쓰기가 생략되어 있는 경우 : 파일 용량을 줄이기 위한것
네트워크 트래픽이 줄어들어 운영비용을 절감할 수 있음 

### 6. 오픈그래프 SEO
미리보기 창

### 7. link 태그

CSS파일을 HTML페이지에 적용하기 위해 사용



**body태그**
**사용자 눈에 보이는 HTML 페이지의 내용**이 들어가는 영역

- 링크를 생성하는 **a 태그**
다른 웹 페이지로 이동할 수 있는 링크를 생성하며, 주소만 넣으면 된다.

<body>
  <a href = "https://www.google.com/">구글로 이동</a>
 <a href = "https://www.google.com/"target="_blank">구글로 이동</a>
  : 현재 창은 그대로 둔 채 새로운 창 혹은 새로운 탭으로 열리도록 바꾸기
</body>
-html img 태그
<img src = "https://www.gd.co.kr.jpg">


- **javascript를 넣는 script 태그**
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
### Q. 그렇다면 프론트의 html문서는 어떻게 이루어져 있고, 각각 어떤 역할을 할까?

## 1. HTML (HyperText Markup Language)
HTML은 웹 페이지의 기본 구조를 만드는 뼈대 역할을 합니다.

역할: 콘텐츠를 배치하고 구조화.
예: 제목, 단락, 이미지, 링크 등.
특징:HTML은 정적인 태그 기반 언어로, 디자인이나 동적 동작은 포함되지 않음.

## 2. CSS (Cascading Style Sheets)
CSS는 HTML에 스타일을 입혀주는 화장품 역할을 합니다.
역할: 글자 크기, 색상, 레이아웃 등 디자인을 정의.
특징:HTML과 분리된 외부 파일로 사용하거나, <style> 태그를 통해 HTML 내부에 작성 가능.

## 3. JavaScript
JavaScript는 HTML과 CSS에 동적인 동작을 추가하는 역할을 합니다.
역할: 버튼 클릭, 데이터 처리, 사용자와의 상호작용 등 동적 기능 제공.
특징:<script> 태그로 HTML 안에 작성하거나 외부 파일로 포함 가능.
  
## 4. React (JavaScript 라이브러리)
React는 더 복잡하고 동적인 웹 애플리케이션을 쉽게 개발하기 위한 JavaScript 라이브러리입니다.
역할: 컴포넌트 기반으로 UI를 효율적으로 개발.
  
### 정리
HTML: 웹의 구조를 만듦 (뼈대 ).
CSS: 웹의 디자인을 만듦 (화장 ).
JavaScript: 동작을 추가 (생명 ).
React: 동적 웹앱을 효율적으로 만듦 (똑똑한 뇌 ).
HTML은 "기초 구조"를 제공하고, CSS와 JavaScript, React는 그 위에 올려져서 각각 스타일과 기능을 확장

+) 추가자료  https://www.yes24.com/product/goods/72297124 모던 웹을 위한 HTML5+CSS3 바이블,  https://www.w3schools.com/html/default.asp
    
----
## 3. 웹 브라우저와 서버의 상호작용 

### 웹 브라우저가 서버와 상호작용하는 4가지 방법 : 각 상황에따라 적절하게 사용하기 
-1. URL을 통한 접속
-2. form태그를 사용하여 form 제출
-3. XHR을 사용한 AJAX 요청
-4. 웹 소켓을 통한 요청

 ### 1.URL을 통한 접속 : ch.8 참고 
  사용자가 직접 URL입력 또는 a태그가 걸려있는 링크를 통해 접근 

  HTTP는 요청의 종류를 메서드로 구분한다.
    url을 통한 것이라면 get메서드를 사용한다- http요청 메서드 

 ###  2. form태그를 사용하여 form 제출 
  웹사이트에서 자주 보았을 로그인 창이나 게시글 작성화면에서 보게 되는 입력란에 자주 사용됨
  GET, POST를 주로 사용

1,2 : 정보를 전송하기 위해 반드시 화면을 새로고침 해야됨
  
 ###  3. XHR을 사용한 AJAX 요청
   : 새로고침 없이 정보를 요청하고 받아올 수 있음

 1,2,3 : 정보교환을 시작할 수있는 주체가 오직 '클라이언트' , 서버쪽에서 주도적으로 클라이언트에게정보를 전달할 수 없음
  
 ###  4. 웹 소켓을 통한 요청
   양방향 통신을 가능하도록 지원함.SSE도 가능 (다음에 비교해보기)
     문자의 경우, 문자를 보내면 수신하기전에 서버가 먼저 알게되는 것이다.

     그래서. 웹 소켓이 등장하기 전에는 AJAX요청을 보내 서버의 상태변경을 체크했었다.(폴링)
             웹뿐 아닌 상대의 상태변경을 체크하기 위해 주기적으로 요청하는 방식을 지칭하는 말로도 널리 사용됨
  
---
 ###    2. form태그를 사용하여 form 제출 
  웹사이트에서 자주 보았을 로그인 창이나 게시글 작성화면에서 보게 되는 입력란에 자주 사용됨
  GET, POST를 주로 사용 - > 자세히 알아보기

  태그타입
  text : 글자를 입력할 수 있는 공간
  submit : 제출이라는 버튼이 생성됨

        <form action="./article" method="post">
            <input type="text" name="title" placeholder="제목 입력">
            <input type="text" name="content" placeholder="내용 입력">
            <input type="submit" value="제출">
        </form>
form태그 ㅣ input태그의 입력값들을 웹 서버로 전송, form태그는 웹서버로전송될 하나의 논리적인 영역


### 1. name 속성
정의: input 태그의 데이터를 식별
역할: 서버로 전송된 데이터를 처리할 때, 서버는 **name 속성값**으로 데이터를 받음. 보내는 형태와 받는 형태가 같아야 되기에.

###   2. submit 버튼
특징: name 속성이 없으며, 서버로 전송되지 않음.
역할: form 태그 내부 데이터를 서버로 제출하는 동작 수행.submit 타입은 웹 서버로 전송되는것이아니라, form태그 내부에서 form을 제출하는 버튼으로서의 역할 

### 3. form 태그
역할: 데이터를 서버로 전송.
속성:action: 데이터를 전송할 서버의 경로(URL).
예: action="./article"
주의: 경로가 없으면 요청 실패. 해당 경로를 처리할 컨트롤러 또는 파일이 필요.
method: HTTP 메서드 지정.

### 4. 컨트롤러 추가
문제: 위 예제에서 ./article 경로를 처리할 컨트롤러가 없으면 실행되지 않음.
해결 방법: ./article 요청을 처리할 컨트롤러 추가.
article 파일 생성 후 서버에서 처리.

  @RestController
  public class SimpleRestController{
    @RequestMapping("/article")
    public String createArticle(
  @RequestParam("title") String title,
  @RequestParam("content") String contnet){
      return String.format("title=%s / content=%s",title,content);
    }}


 ###  +) form 태그의 여러가지 속성
추가 참고 자료 -검색해보기 
HTML Form Input Types : 다양한 input 타입 확인.
HTML Forms Guide : 폼 태그 속성 및 사용법.


  ---
 ###  요약
   - HTML을 알아야 되는 이유
   - HTML의 기본구조 html,head,body 태그
   - 최상단 태그인 html의 독타입
   - head태그와 그밖의 주요 태그들
   - html페이지 내용을 작성하는 body 태그와 링크를 연결하는 a태그, 이미지를 삽압히는 img태그
   - 웹 브라우저가 서버와 상호작용하기위한 대표적인 방법4가지 숙지
   - form 태그를 사용하여 실제 서버로 데이터 전송 
