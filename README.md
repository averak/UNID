# UNID - University Network ID

![CI](https://github.com/averak/unid/workflows/CI/badge.svg)
![version](https://img.shields.io/badge/version-1.0.0__SNAPSHOT-yellow.svg)

## 概要

本プロジェクトは学内組織向けのIDプロバイダです。

フロントエンドは[app/src/main/client](./app/src/main/client)を参照してください。

## 開発

### 開発環境

- Java OpenJDK 11
- Spring Boot 2.7
- MySQL 8.0
- Docker

### ビルド方法

ビルドに成功すると、`app/build/libs`直下に`.jar`ファイルが生成されます。

```sh
$ ./gradlew bootJar
```

### 起動方法

まず、Docker から MySQL を起動します。

```
$ docker compose up -d
# 3306 db-local: ローカル用データベース
# 3307 db-test:  テスト用データベース
```

デフォルトで使用されるポート番号は`8080`です。`-Dserver.port=XXXX`オプションを付けることでポート番号を変更できます。

```sh
# 1. run .jar file
$ java -jar unid-<version>.jar -Dspring.profiles.active=local

# 2. run with bootRun
$ ./gradlew bootRun -Dspring.profiles.active=local
```

### 依存関係のアップデート

[Gradle Versions Plugin](https://github.com/ben-manes/gradle-versions-plugin)を使って、outdatedな依存関係をアップデートします。

下記コマンドの実行後、出力されたレポートに従って[build.gradle](./app/build.gradle)に記載されたバージョンを書き換えてください。

```sh
$ ./gradlew dependencyUpdates -Drevision=release
```
