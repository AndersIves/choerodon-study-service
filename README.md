## 1. 执行 init_start_local_db.sh
+ 该脚本执行 docker-compose，并初始化数据库 choerodon_study_service，如果本地有容器名为 mysql 或 redis 请慎用
## 2. 执行 init-local-database.sh
+ 该脚本初始化了本地 fd_organization, fd_project, iam_user表
## 3. 在 api-gateway 中配置路由
## 4. 执行 api-gateway 中 init-config.sh
## 5. 编译运行 api-gateway 
## 6. 执行 start.sh

---

## 结果
![1](https://github.com/AndersIves/choerodon-study-service/blob/master/result/insertOrganization.png?raw=true)

![2](https://github.com/AndersIves/choerodon-study-service/blob/master/result/insertUser.png?raw=true)                                            

![3](https://github.com/AndersIves/choerodon-study-service/blob/master/result/getProject.png?raw=true)                                                                                            