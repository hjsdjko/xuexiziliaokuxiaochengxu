const base = {
    get() {
        return {
            url : "http://localhost:8080/xuexiziliaokuxiaochengxu/",
            name: "xuexiziliaokuxiaochengxu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xuexiziliaokuxiaochengxu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学习资料库小程序"
        } 
    }
}
export default base
