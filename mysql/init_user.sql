CREATE USER 'choerodon'@'%' IDENTIFIED BY "123456";
CREATE DATABASE IF NOT EXISTS iam_service DEFAULT CHARACTER SET utf8mb4;
CREATE DATABASE IF NOT EXISTS manager_service DEFAULT CHARACTER SET utf8mb4;
CREATE DATABASE IF NOT EXISTS asgard_service DEFAULT CHARACTER SET utf8mb4;
CREATE DATABASE IF NOT EXISTS notify_service DEFAULT CHARACTER SET utf8mb4;
CREATE DATABASE IF NOT EXISTS choerodon_study_service DEFAULT CHARACTER SET utf8mb4;
GRANT ALL PRIVILEGES ON iam_service.* TO choerodon@'%';\
GRANT ALL PRIVILEGES ON manager_service.* TO choerodon@'%';\
GRANT ALL PRIVILEGES ON asgard_service.* TO choerodon@'%';\
GRANT ALL PRIVILEGES ON notify_service.* TO choerodon@'%';\
GRANT ALL PRIVILEGES ON choerodon_study_service.* TO choerodon@'%';\
FLUSH PRIVILEGES;