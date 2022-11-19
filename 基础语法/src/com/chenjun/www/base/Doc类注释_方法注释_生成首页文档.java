package com.chenjun.www.base;

/**类注释
 * @author chenjun
 * @version 1.0
 * @since 1.8
 */
public class Doc类注释_方法注释_生成首页文档 {
    String name;

    /**方法注释
     * @author chenjun
     * @param name
     * @return
     * @throws Exception
     */
    public String test(String name) throws Exception{
        return name;
    }
    public static void main(String[] args) {
//使用命令行-javadoc -encoing UTF-8 -charset UTF-8 Doc.java在目标包文件下生成相应的index首页文档
        //作业：百度查找使用IDEA生产javadoc文档（面向百度编程）
    }
    /*
    author-作者名
    version-版本号
    since-指明需要最早使用的jdk版本
    param-参数名
    return-返回值情况
    throws-异常抛出情况
     */
}
