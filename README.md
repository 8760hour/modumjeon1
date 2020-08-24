# modumjeon
지역화폐 가이드라인

# 개요
최근 코로나로 인해 정부에서 지원금을 지역화폐로 지원하여 사용량이 급증하고 있고 지역의 자본 중앙 흡수를 억제하고 지역 중심 실물 가치 화폐로 소비생활 습관을 바꿀 수 있는 장점이 있으므로 지역 소비 활성화 대책 방법 중 하나라고 생각한다.

# 주요 기능
지역 화폐 가맹점을 카카오 지도 API를 이용하여 클러스터와 마커로 나타내고 리스트로 출력
지역화폐 사용량 및 충전량, 연령별 사용빈도 등 분석 및 예측

# 프로젝트에서의 담당 업무
## 1. 가맹점 데이터를 json으로 불러온뒤 카카오 지도 API를 이용해 지도에 마커와 클러스터로 표현
(1) [경기데이터드림](https://data.gg.go.kr/portal/data/village/selectServicePage.do?infId=3NPA52LBMO36CQEQ1GMY28894927&infSeq=1&sigunFlag=41270)
## 2. 문의 사항을 관리자에게 이메일로 전송
## 3. 사용자들이 쉽고 안전하게 접근할 수 있도록 도메인을 생성하고 SSL 인증서를 적용

## 4. Spring 프레임워크 전반적 구현
(1) MVC 패턴 구현
MODEL : JAVA BEANS
VIEW : APACH TOMCAT을 서버로 사용하여 JSP 구현
Controller : 위의 업무의 데이터를 송/수신 하기위해 Controller, Service, Dao, Dto구현
(2) MAVEN
필요한 라이브러리 사용

# (3) MyBatis
필요한 쿼리문을 MyBatis로 사용할 수 있도록 구현

결과물
