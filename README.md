# 开发遇见问题

### springcloud 打包失败,提示找不到程序包

#### 将打包插件更改为更低的版本得以解决

```xml
   <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <version>1.3.7.RELEASE</version>
            </plugin>
        </plugins>
```



### mybatis的#{}和${}的区别

#### 相当于对数据 加上 双引号，$相当于直接显示数据。

```sql
1、#对传入的参数视为字符串，也就是它会预编译，select * from user where user_name=${rookie}，比如我传一个rookie，那么传过来就是 select * from user where user_name = ‘rookie’；

2、$不会将传入的值进行预编译， select * from user where user_name= ${rookie} ,那么传过来的sql就是：select * from user where user_name=rookie;

```







