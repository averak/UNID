# UNID - University Network ID

![CI](https://github.com/averak/unid/workflows/CI/badge.svg)
![version](https://img.shields.io/badge/version-1.0.0__SNAPSHOT-yellow.svg)

## 概要

本プロジェクトはUNIDのフロントエンドです。

## 開発

### 開発環境

- Node.js 18
- Angular 14
- yarn

### ビルド方法

ビルドに成功すると、`dist`直下に静的 HTML ファイルが生成されます。

```sh
$ yarn build
```

### 起動方法

起動に成功すると、[localhost:4200](http://localhost:4200)からアクセスできます。

```sh
$ yarn start
```

### テスト & コードチェック

```sh
# テスト
$ yarn run test:ci

# コードチェック
$ yarn run check

# フォーマット
$ yarn run format
```

### 依存関係のアップデート

```sh
# outdatedな依存関係をリストアップ
$ yarn outdated

# 依存関係をアップデート
$ yarn upgrade-interactive --latest
```
