```

```

<div align="center">
<h1>二次元极客爱好者博客</h1>
   <h3>   正在入门极客的平凡者  </h3>
</div>
# 博客介绍

本博客是参考风丶宇博客、大树博客更新而成，感谢大佬提供的页面，该博客是基于 SpringBoot 和 Vue 开发的，有多种技术栈，适合新手学习。

- 风、宇博客：目前已停止开源。

- 大树博客：[tree-Blog](https://gitee.com/macw/blog)


# 在线地址

**项目链接：** [https://localhost:8082](https://localhost:8082)

**后台链接：** [https://localhost:8081](https://localhost:8081)

测试账号：test@163.com，密码：123456，可登入后台查看。

**在线接口文档地址：** [https://localhost:8080/doc.html](https://localhost:8080/doc.html)

欢迎大家批评指正，提交PR，一起改进项目。

# 技术栈

- 后端：SpringBoot、Spring Security、Swagger2、MyBatis-Plus、MySQL、Redis、ElasticSearch、Kafka、腾讯云Cos
- 前端：Vue + Vuetify + Vuex + Vue-router + Axios + Element + Echarts
- 运维：Docker、Nginx

# 项目特点

- 前后端分离部署，符合当下的需求，可以使用Docker部署，也可以使用宝塔面板部署。
- 使用开源的 Editor.md，实现 markdown 的方式写博客，十分便捷，生成的文章美观简洁。
- 使用策略模式构建多重上传模式（OSS、COS和本地）和两种搜索模式（MYSQL 和 ES）。
- 引入消息队列模型，支持邮件异步通知方式。
- 引入Canal，解决缓存一致性问题。
- 支持动态权限修改，采用RBAC模型，前端菜单和后台权限实时更新。
- 新增aop注解实现日志管理。
- 前台参考"Hexo"的"Butterfly"设计，美观简洁，响应式体验好。
- 后台参考"element-admin"设计，侧边栏，历史标签，面包屑自动生成。
- 支持发表文章、说说、留言等，评论支持表情输入回复。
- 后台管理支持修改背景图片，博客配置等信息，操作简单，支持上传相册。
- 采用 Restful 风格的 API，代码遵循阿里巴巴开发规范，利于开发者学习。
- 引入随机图片API，实现背景的随机更换。

# 运行

## 本地运行

1. 推荐使用 Docker 部署开发，十分方便，需要部署 MySQL、Redis 、Kafka 和 zookeeper 这三个，如果有意深化开发，还可以安装 Elastic Search 等，均可以拉取最新版本，如果服务器配置不够，可以放弃拉取 Kafka，改用 RabbitMQ。

2. SQL 文件见 Datasets 文件夹内，请先建立 PersonalBlog 数据库，然后在这个数据库内运行该SQL文件。

3. 需要修改配置信息，即要修改 blog-springboot\src\main\resources\application-dev.yml 里面的信息，包括替换IP、添加OSS或COS的信息等。
4. 要先启动后端，然后启动前端的admin，接着启动前端的blog（必须先安装 npm（本地安装）），前端的启动方式是 1) npm install 2) npm run serve，必须在 admin 或 blog 的路径内。
5. 项目启动后，使用 test@163.com 登录后台。

## 服务器运行

### 运行环境

**服务器** : 阿里云 ECS 云服务器 2核2GB （尚未使用 ES 和 Kafka）CentOS 7.6

**对象存储** : 阿里云OSS、腾讯云COS

**推荐配置** ：如果要开启 ES 和 Kafka ，最低要 2 核 4G 服务器。

**部署工具**：Docker、Nginx

### 开发工具

|       开发工具        |        说明        |
| :-------------------: | :----------------: |
|         IDEA          | Java 开发工具 IDE  |
|        VSCode         |  Vue 开发工具 IDE  |
|        Navicat        | MySQL 远程连接工具 |
| Redis Desktop Manager | Redis 远程连接工具 |
|        Xshell         | Linux 远程连接工具 |
|         Xftp          | Linux 文件上传工具 |

# 后续更新计划

- [ ] 整合 EasyExcel 实现导出 Excel。
- [x] 完善 Redis 与 MYSQL 的更新机制，引入 Canal。

- [ ] 添加微信公众号菜单配置功能。

- [ ] 添加开源的对象存储 Minio。

- [ ] 添加图床功能。

- [x] 引入Kafka。
- [ ] 添加博客园等博客的爬虫博客功能。
- [ ] 添加实时推荐系统。
- [ ] 添加保存搜索记录的模块（MongoDB）。
- [ ] 修改标签页面不能正常显示的 Bug。

**欢迎大家通过issue、博客页或私聊我等方式给予建议**

# 项目总结

博客作为新手入门项目是十分不错的，项目所用的技术栈覆盖的也比较广，适合初学者学习，开发期间，我也参考了不少优质的开源项目，碰上了不少坑，请教了无数次，学习了不少内容，真的十分感谢大家。以及如果这个项目中有做的不好的地方请大家见谅，有问题的或者有好的建议可以直接 issue 或私聊联系我，邮箱：liuweixu@163.com 。

鸣谢项目：

- 风、宇
- [大树博客](https://gitee.com/macw/blog)
- [blog-bamboo](https://github.com/yk-flight/blog-bamboo)

- [Editor.md](https://pandao.github.io/editor.md/)

- [QingFengInn-blog](https://gitee.com/lindaifeng/QingFengInn-blog)
- [Blog](https://gitee.com/wu_shengdong/blog)

- ...
