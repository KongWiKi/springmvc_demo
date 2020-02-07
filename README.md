## SpringMVC 

 **pom依赖**

* junit
* spring-webmvc
* servler-api
* jsp-api
* jstl

### servlet的使用

**servlet负责内容(多数)**

* 获得表单数据
* 调用业务逻辑
* 跳转指定页面

#### 1. 编写servlet

```java
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 处理表单数据
        String method = req.getParameter("method");
        if (method.equals("add")) {
            req.getSession().setAttribute("msg", "执行了add方法");
        }
        if (method.equals("delete")) {
            req.getSession().setAttribute("msg", "执行了delete方法");
        }
        // 处理业务逻辑
        // service 层
        // 跳转页面
        // resp.sendRedirect()
         req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
```

#### 2. web.xml中注册

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">
    <servlet>
        <servlet-name>HelloServlet</servlet-name>
        <servlet-class>com.wkk.servlet.HelloServlet</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>HelloServlet</servlet-name>
        <url-pattern>/user</url-pattern>
    </servlet-mapping>
</web-app>

```







