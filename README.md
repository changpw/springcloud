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



