tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    implementation(project(":domain-module"))

    //sleuth를 바로 쓰는게 아니라, logging 모듈 내에서 한번더 격리해서 쓰는 느낌
    implementation(project(":support-module:logging"))

    //
    runtimeOnly(project(":storage-module:db-core"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}