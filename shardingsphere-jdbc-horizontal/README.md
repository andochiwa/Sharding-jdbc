# 水平切分

## 水平分表

按照水平分表方式，创建数据库与数据库表

1. 创建数据库`course_sharding`
2. 在数据库中创建两张表`course_1`, `course_2`
3. 设置规则：如果添加的课程id是偶数，则添加到`course_1`，否则添加到`course_2`

## 水平分库

1. 创建两个数据库`course_db_1`, `course_db_2`
2. 设置库规则：如果user_id是偶数就添加到`course_db_1`，反之添加到`course_db_2`
3. 设置表规则：如果添加的课程id是偶数，则添加到`course_1`，否则添加到`course_2`