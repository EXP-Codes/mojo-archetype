# mojo-archetype
Maven项目规范骨架

------


## 运行环境

　![](https://img.shields.io/badge/Maven-3.2.5%2B-brightgreen.svg)  ![](https://img.shields.io/badge/JDK-1.7%2B-brightgreen.svg)


## 软件介绍

　快速创建一个规范架构的Java后端项目（Maven版），使得项目中自动内置：

- [经验构件库](https://github.com/lyy289065406/exp-libs)：*用于快速开发的辅助包*
- [Maven项目发布插件](https://github.com/lyy289065406/mojo-release-plugin)：*用于快速发布一个可运行应用到生产环境*
- 混淆打包插件：*第三方插件`proguard-maven-plugin`，用于保护所发布的项目代码*
- Ant插件：*第三方插件`maven-antrun-plugin`，用于拷贝项目配置、文档等资源到发布包*
- 基线发布插件：*第三方插件`maven-release-plugin`，用于发布项目基线到版本库和Nexus私服*


## 使用说明

- 01.　本地已安装并部署好 `apache-maven-3.2.5`（或更高版本）
- 02.　下载本骨架项目 `mojo-archetype` 到本地，拷贝 `mojo-archetype/conf/archetype-catalog.xml` 文件到 `apache-maven-3.2.5/conf` 目录下，若目录下已存在同名文件，则只需把 `archetype-catalog.xml` 的内容附加进去即可：<br/>
```
<!-- Maven骨架 -->
<archetype>
  <groupId>exp.libs</groupId>
  <artifactId>mojo-archetype</artifactId>
  <version>1.0</version>   <!-- 注意版本号要根据实际发布的骨架版本号调整 -->
  <repository>http://127.0.0.1:8081/nexus/content/repositories/releases</repository> <!-- 若本地部署了Nexus私服则如实填写，这是releases库 -->
</archetype>
<archetype>
  <groupId>exp.libs</groupId>
  <artifactId>mojo-archetype</artifactId>
  <version>1.0-SNAPSHOT</version>  <!-- 同名骨架可配置多个版本号，但只有最高版本生效 -->
  <repository>http://127.0.0.1:8081/nexus/content/repositories/snapshots</repository> <!-- 若本地部署了Nexus私服则如实填写，这是snapshots库 -->
</archetype>
```
- 03.　通过 `maven install` 命令安装骨架到本地 Maven Repository
- 04.　（可选）若本地部署了 Nexus 私服，可通过 `maven deploy` 命令直接发布骨架到私服
- 05.　新建Maven项目，并选择此骨架进行项目构件：<br/>
![新建Maven项目](https://raw.githubusercontent.com/lyy289065406/mojo-archetype/master/doc/%E6%95%88%E6%9E%9C%E6%88%AA%E5%9B%BE/01-%E9%80%89%E6%8B%A9Maven%E9%AA%A8%E6%9E%B6.png)
- 06.　填写项目必要信息：<br/>
![填写项目必要信息](https://raw.githubusercontent.com/lyy289065406/mojo-archetype/master/doc/%E6%95%88%E6%9E%9C%E6%88%AA%E5%9B%BE/02-%E5%A1%AB%E5%86%99%E9%A1%B9%E7%9B%AE%E4%BF%A1%E6%81%AF.png)
- 07.　通过骨架所生成的项目，项目中会引用到 [`构件经验库 exp-libs`](https://github.com/lyy289065406/exp-libs) 的一些功能：<br/>
![通过骨架所生成的项目](https://raw.githubusercontent.com/lyy289065406/mojo-archetype/master/doc/%E6%95%88%E6%9E%9C%E6%88%AA%E5%9B%BE/03-%E7%94%9F%E6%88%90%E7%9A%84%E9%A1%B9%E7%9B%AE%E6%A8%A1%E6%9D%BF.png)
- 08.　通过 `maven install` 在 `target` 目录直接发布可运行应用（详见[`Maven项目发布插件 mojo-release-plugin`](https://github.com/lyy289065406/mojo-release-plugin)）：<br/>
![发布可运行项目到生产环境](https://raw.githubusercontent.com/lyy289065406/mojo-archetype/master/doc/%E6%95%88%E6%9E%9C%E6%88%AA%E5%9B%BE/04-%E5%8F%91%E5%B8%83%E9%A1%B9%E7%9B%AE.png)




## 版权声明

　[![Copyright (C) 2016-2018 By EXP](https://img.shields.io/badge/Copyright%20(C)-2006~2018%20By%20EXP-blue.svg)](http://exp-blog.com)　[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
  

- Site: [http://exp-blog.com](http://exp-blog.com) 
- Mail: <a href="mailto:289065406@qq.com?subject=[EXP's Github]%20Your%20Question%20（请写下您的疑问）&amp;body=What%20can%20I%20help%20you?%20（需要我提供什么帮助吗？）">289065406@qq.com</a>


------
