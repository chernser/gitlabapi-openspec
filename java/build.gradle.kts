
plugins {
    id("org.openapi.generator") version "5.0.1"
}

openApiGenerate {
    generatorName.set("java")
    inputSpec.set("$rootDir/gitlab-api-spec.yaml")
    outputDir.set("$buildDir/generated")
    apiPackage.set("gitlabapi.client")
    invokerPackage.set("gitlabapi.client.invoker")
    modelPackage.set("gitlabapi.models")
    configOptions.put("dateLibrary", "java8")
}