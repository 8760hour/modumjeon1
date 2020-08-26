# modumjeon
지역화폐 가이드라인

# 개요
최근 코로나로 인해 정부에서 지원금을 지역화폐로 지원하여 사용량이 급증하고 있고 지역의 자본 중앙 흡수를 억제하고 지역 중심 실물 가치 화폐로 소비생활 습관을 바꿀 수 있는 장점이 있으므로 지역 소비 활성화 대책 방법 중 하나라고 생각한다.

# 주요 기능
지역 화폐 가맹점을 카카오 지도 API를 이용하여 클러스터와 마커로 나타내고 리스트로 출력
지역화폐 사용량 및 충전량, 연령별 사용빈도 등 분석 및 예측

# 프로젝트에서의 담당 업무
## 1. 지도관련
(1) [경기데이터드림](https://data.gg.go.kr/portal/data/village/selectServicePage.do?infId=3NPA52LBMO36CQEQ1GMY28894927&infSeq=1&sigunFlag=41270)에서 지역 화폐 가맹점 현황을 JSON으로 가져와 프로젝트에 불러옴

(2) QGIS와 [행정구역데이터](http://www.gisdeveloper.co.kr/?p=2332)를 이용해 폴리곤을 생성하여 카카오 지도에 표시함
![전국폴리곤](https://user-images.githubusercontent.com/64400666/91262965-2c7c7800-e7ab-11ea-9079-49a428a017a0.png)

(3) 멀티 폴리곤은 하나의 폴리곤으로 인식하도록 구현
![멀티폴리곤수정](https://user-images.githubusercontent.com/64400666/91263004-2e463b80-e7ab-11ea-9d70-db52fbbab9c7.gif)

(4) 폴리곤을 클릭할 시 해당 시에 대한 가맹점을 검색 및 조회할 수 있도록 구현
![검색 및 조회](https://user-images.githubusercontent.com/64400666/91265899-f986b400-e7ab-11ea-911a-33af387f396c.png)

(5) 가맹점이 어디에 밀집되어 있는지, 몇 개가 있는지 알기 쉽도록 클러스터로 구현
![클러스터](https://user-images.githubusercontent.com/64400666/91263648-5cc41680-e7ab-11ea-9456-18a0c6c08638.png)

## 2. 문의 사항, 도메인 및 SSL 인증서
(1) 자신의 이메일을 사용하지 않고 SMTP와 SSL 인증서를 이용하여 관리자에게 이메일을 전송할 수 있도록 구현

(2) 사용자들이 쉽게 접근할 수 있도록 도메인을 생성하고 SSL 인증서를 적용시켜 보안성을 높임
![도메인_SSL](https://user-images.githubusercontent.com/64400666/91267203-cf35f600-e7ad-11ea-9975-b3cb1510f5ee.png)

## 3. Spring 프레임워크 전반적 구현
### (1) MVC 패턴 구현
MODEL : JAVA BEANS
VIEW : APACH TOMCAT을 서버로 사용하여 JSP 구현
Controller : 위의 업무의 데이터를 송/수신 하기위해 Controller, Service, Dao, Dto구현
### (2) MAVEN
필요한 라이브러리 사용

### (3) MyBatis
필요한 쿼리문을 MyBatis로 사용할 수 있도록 구현
