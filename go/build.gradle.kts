
plugins {
    id("org.openapi.generator") version "5.0.1"
}

openApiGenerate {
    generatorName.set("go")
    inputSpec.set("$rootDir/gitlab-api-spec.yaml")
    outputDir.set("$buildDir/generated")
    packageName.set("gitlabapi")
}