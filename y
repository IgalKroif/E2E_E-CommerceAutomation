[33mcommit 4e8b608c8555d8c956905a6f6c865ab30558ed6e[m[33m ([m[1;36mHEAD -> [m[1;32mworkingBranch[m[33m, [m[1;31morigin/workingBranch[m[33m, [m[1;32mmaster[m[33m)[m
Author: Yigal Kroef <igalkroif@gmail.com>
Date:   Wed Jun 28 11:20:13 2023 +0300

    e-commerce Start

[1mdiff --git a/.classpath b/.classpath[m
[1mnew file mode 100644[m
[1mindex 0000000..90f81ed[m
[1m--- /dev/null[m
[1m+++ b/.classpath[m
[36m@@ -0,0 +1,38 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<classpath>[m
[32m+[m	[32m<classpathentry kind="src" output="target/classes" path="src/main/java">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="optional" value="true"/>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry excluding="**" kind="src" output="target/classes" path="src/main/resources">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="src" output="target/test-classes" path="src/test/java">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="optional" value="true"/>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m			[32m<attribute name="test" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry excluding="**" kind="src" output="target/test-classes" path="src/test/resources">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m			[32m<attribute name="test" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/J2SE-1.5">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="con" path="org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="output" path="target/classes"/>[m
[32m+[m[32m</classpath>[m
[1mdiff --git a/.gitignore b/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..b83d222[m
[1m--- /dev/null[m
[1m+++ b/.gitignore[m
[36m@@ -0,0 +1 @@[m
[32m+[m[32m/target/[m
[1mdiff --git a/.project b/.project[m
[1mnew file mode 100644[m
[1mindex 0000000..771ce4a[m
[1m--- /dev/null[m
[1m+++ b/.project[m
[36m@@ -0,0 +1,23 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<projectDescription>[m
[32m+[m	[32m<name>ecommerceautomation</name>[m
[32m+[m	[32m<comment></comment>[m
[32m+[m	[32m<projects>[m
[32m+[m	[32m</projects>[m
[32m+[m	[32m<buildSpec>[m
[32m+[m		[32m<buildCommand>[m
[32m+[m			[32m<name>org.eclipse.jdt.core.javabuilder</name>[m
[32m+[m			[32m<arguments>[m
[32m+[m			[32m</arguments>[m
[32m+[m		[32m</buildCommand>[m
[32m+[m		[32m<buildCommand>[m
[32m+[m			[32m<name>org.eclipse.m2e.core.maven2Builder</name>[m
[32m+[m			[32m<arguments>[m
[32m+[m			[32m</arguments>[m
[32m+[m		[32m</buildCommand>[m
[32m+[m	[32m</buildSpec>[m
[32m+[m	[32m<natures>[m
[32m+[m		[32m<nature>org.eclipse.jdt.core.javanature</nature>[m
[32m+[m		[32m<nature>org.eclipse.m2e.core.maven2Nature</nature>[m
[32m+[m	[32m</natures>[m
[32m+[m[32m</projectDescription>[m
[1mdiff --git a/.settings/org.eclipse.jdt.core.prefs b/.settings/org.eclipse.jdt.core.prefs[m
[1mnew file mode 100644[m
[1mindex 0000000..5723a0f[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.jdt.core.prefs[m
[36m@@ -0,0 +1,8 @@[m
[32m+[m[32meclipse.preferences.version=1[m
[32m+[m[32morg.eclipse.jdt.core.compiler.codegen.targetPlatform=1.5[m
[32m+[m[32morg.eclipse.jdt.core.compiler.compliance=1.5[m
[32m+[m[32morg.eclipse.jdt.core.compiler.problem.enablePreviewFeatures=disabled[m
[32m+[m[32morg.eclipse.jdt.core.compiler.problem.forbiddenReference=warning[m
[32m+[m[32morg.eclipse.jdt.core.compiler.problem.reportPreviewFeatures=ignore[m
[32m+[m[32morg.eclipse.jdt.core.compiler.release=disabled[m
[32m+[m[32morg.eclipse.jdt.core.compiler.source=1.5[m
[1mdiff --git a/.settings/org.eclipse.m2e.core.prefs b/.settings/org.eclipse.m2e.core.prefs[m
[1mnew file mode 100644[m
[1mindex 0000000..f897a7f[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.m2e.core.prefs[m
[36m@@ -0,0 +1,4 @@[m
[32m+[m[32mactiveProfiles=[m
[32m+[m[32meclipse.preferences.version=1[m
[32m+[m[32mresolveWorkspaceProjects=true[m
[32m+[m[32mversion=1[m
[1mdiff --git a/pom.xml b/pom.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..d7e241f[m
[1m--- /dev/null[m
[1m+++ b/pom.xml[m
[36m@@ -0,0 +1,79 @@[m
[32m+[m[32m<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">[m
[32m+[m[32m  <modelVersion>4.0.0</modelVersion>[m
[32m+[m[32m  <groupId>ecommerceautomation</groupId>[m
[32m+[m[32m  <artifactId>ecommerceautomation</artifactId>[m
[32m+[m[32m  <version>0.0.1-SNAPSHOT</version>[m
[32m+[m[41m  [m
[32m+[m[32m    <dependencies>[m
[32m+[m[41m  [m
[32m+[m[32m  <!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->[m
[32m+[m	[32m<dependency>[m
[32m+[m	[32m    <groupId>io.rest-assured</groupId>[m
[32m+[m	[32m    <artifactId>rest-assured</artifactId>[m
[32m+[m	[32m    <version>5.1.1</version>[m
[32m+[m	[32m    <scope>test</scope>[m
[32m+[m	[32m</dependency>[m
[32m+[m[41m	[m
[32m+[m	[32m<!-- https://mvnrepository.com/artifact/io.rest-assured/json-path -->[m
[32m+[m	[32m<dependency>[m
[32m+[m	[32m    <groupId>io.rest-assured</groupId>[m
[32m+[m	[32m    <artifactId>json-path</artifactId>[m
[32m+[m	[32m    <version>5.1.1</version>[m
[32m+[m	[32m    <scope>test</scope>[m
[32m+[m	[32m</dependency>[m
[32m+[m
[32m+[m
[32m+[m	[32m<!-- https://mvnrepository.com/artifact/org.json/json -->[m
[32m+[m	[32m<dependency>[m
[32m+[m	[32m    <groupId>org.json</groupId>[m
[32m+[m	[32m    <artifactId>json</artifactId>[m
[32m+[m	[32m    <version>20220320</version>[m
[32m+[m	[32m</dependency>[m
[32m+[m[41m	[m
[32m+[m
[32m+[m[32m    <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->[m
[32m+[m	[32m<dependency>[m
[32m+[m	[32m    <groupId>com.google.code.gson</groupId>[m
[32m+[m	[32m    <artifactId>gson</artifactId>[m
[32m+[m	[32m    <version>2.8.5</version>[m
[32m+[m	[32m</dependency>[m[41m	[m
[32m+[m[41m	[m
[32m+[m[41m	    [m
[32m+[m[41m    [m
[32m+[m	[32m<!-- https://mvnrepository.com/artifact/org.testng/testng -->[m
[32m+[m	[32m<dependency>[m
[32m+[m	[32m    <groupId>org.testng</groupId>[m
[32m+[m	[32m    <artifactId>testng</artifactId>[m
[32m+[m	[32m    <version>7.6.1</version>[m
[32m+[m	[32m    <scope>test</scope>[m
[32m+[m	[32m</dependency>[m
[32m+[m[41m	[m
[32m+[m	[32m<!-- https://mvnrepository.com/artifact/com.github.scribejava/scribejava-apis -->[m
[32m+[m	[32m<!-- reuquired for OAuth 1 and OAuth 2 authentications -->[m
[32m+[m	[32m<dependency>[m
[32m+[m	[32m    <groupId>com.github.scribejava</groupId>[m
[32m+[m	[32m    <artifactId>scribejava-apis</artifactId>[m
[32m+[m	[32m    <version>8.3.1</version>[m
[32m+[m	[32m    <scope>test</scope>[m
[32m+[m	[32m</dependency>[m
[32m+[m
[32m+[m[41m	[m
[32m+[m	[32m<!-- https://mvnrepository.com/artifact/io.rest-assured/json-schema-validator -->[m
[32m+[m	[32m<dependency>[m
[32m+[m	[32m    <groupId>io.rest-assured</groupId>[m
[32m+[m	[32m    <artifactId>json-schema-validator</artifactId>[m
[32m+[m	[32m    <version>5.1.1</version>[m
[32m+[m	[32m    <scope>test</scope>[m
[32m+[m	[32m</dependency>[m
[32m+[m	[32m<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->[m
[32m+[m[32m<dependency>[m
[32m+[m[32m    <groupId>com.fasterxml.jackson.core</groupId>[m
[32m+[m[32m    <artifactId>jackson-databind</artifactId>[m
[32m+[m[32m    <version>2.15.2</version>[m
[32m+[m[32m</dependency>[m
[32m+[m
[32m+[m
[32m+[m
[32m+[m
[32m+[m[32m  </dependencies>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
