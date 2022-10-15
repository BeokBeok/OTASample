# OTASample
- Lokalise를 활용한 OTA(Over The Air) 적용

## OTA란
- 앱 배포 없이, Lokalise에서 특정 버전을 적용하면 실시간(?)으로 특정 버전의 문구들로 반영되는 기능

## Demo
https://user-images.githubusercontent.com/48344355/195992828-c8ee93bc-6308-4b8a-ac33-38d6078b718e.mov

## 주의사항
- Custom View는 동적으로 업데이트해주어야 함
```kotlin
LokaliseResources(this).getString(R.string.hello_world)
```
- Compose 및 KMM은 지원하지 않음
- Dark mode일 경우, 제대로 작동하지 않을 가능성이 있음

ref. https://developers.lokalise.com/docs/android-sdk-v2#limitations

## 참고
- https://developers.lokalise.com/docs/android-sdk-v2
