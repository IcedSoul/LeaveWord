## 简介
　　之前在刚开始学习JavaEE的时候写了一篇JSP+Servlet+JavaBean传统方式实现留言板的博客，在那篇博客中放了我跟着教材做的一个简单的留言板。一年多过去了，从刚开始学习servlet，到后来的Struts2，Spring，Hibernate，SpringMVC，到现在用的SpringBoot，也算是接触到了不少东西。昨天应一位同学的要求用SpringBoot重新做了一个简单的留言板项目，后端用的基本都是我现在学到的最新的知识，这次我会把做的流程简单说一下，希望能为大家的学习提供一些参考。
## 准备
　　开发工具：Intellij IDEA<br/>
　　数据库：MySQL<br/>
　　开发框架：SpringBoot<br/>
## 开始
### 创建项目
　　创建项目时可以使用Intellij IDEA默认提供的新建方式，个人建议的新建方式有两种：一种是新建Maven Project，然后添加SpringBoot和一些必要依赖就好，这种方式可以百度Intellij  IDEA使用Maven创建JavaWeb项目，这里就不再多讲。<br/>
　　另一种新建项目方式，如图：<br/>
　　![](http://ou7jocypf.bkt.clouddn.com/17-8-25/99767335.jpg)
　　
　　然后填写基本的项目信息（图中只是示例，具体根据自己需要填写）：<br/>
　　![](http://ou7jocypf.bkt.clouddn.com/17-8-25/96946608.jpg)
　　
　　填写基本信息之后需要勾选本项目所需要使用的组件：<br/>
　　本项目使用了Lombok（省略实体get、set方法组件，IJ需装插件）<br/>
　　JPA、MySQL等（此处未勾选也无所谓，可以之后再pom.xml中手动添加依赖）<br/>
　　![](http://ou7jocypf.bkt.clouddn.com/17-8-25/75594869.jpg)
　　
　　之后填写路径和名字，新建项目的步骤就完成了。<br/>
　　（新建之后如果IJ没有自动标记源码、资源、测试目录记得手动右键标记）<br/>
　　（项目如果运行失败，请去掉pom.xml中如下依赖多的provide即可）
　　

```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
		</dependency>
```

### 搭建后台
　　新建项目成功之后，就可以搭建框架了，这里我只提一下基本的知识，不再具体提每个类怎么建立，每个东西是什么了，具体大家可以自行搜索、研究。<br/>
　　这里使用的仍旧是MVC开发模式：<br/>
　　domain文件下面对应数据库表，因为JPA可以自动创建实体，所以本项目无需使用SQL新建数据库，项目第一次运行时会自动根据实体创建表。（前提是建立数据库并且成功连接了数据库。）<br/>
　　repository文件夹对应于传统的数据接口访问层，不过因为jpa的封装这里只需要继承接口，就可以有最基本的增删改查方法。此外特殊查询可以自定义，此处也不再详细讲。<br/>
　　service文件夹对应具体的业务逻辑层，分为接口和实现，里面的方法都是controller需要调用的方法。<br/>
　　controller对应控制层，提供接口，规定参数，调用Service对应方法。<br/>
　　![](http://ou7jocypf.bkt.clouddn.com/17-8-25/50645877.jpg)
　　
　　此外，注意，SpringBoot也有配置文件，即resources下面的application.yml文件（默认是properties格式，两种皆可，格式不同），配置具体大家可以百度&Google，也可以自己修改试试就知道作用了。
　　![](http://ou7jocypf.bkt.clouddn.com/17-8-25/6778879.jpg)
### 搭建前端
　　为了避免麻烦，我前端没用vue，而是使用了基本的HTML，使用了Bootstrap框架，前后端交互方式是ajax，具体也不必多讲，大家可以具体看代码。
## 页面展示
![](http://ou7jocypf.bkt.clouddn.com/17-8-25/16156120.jpg)
![](http://ou7jocypf.bkt.clouddn.com/17-8-25/41027652.jpg)
