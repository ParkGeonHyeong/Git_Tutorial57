@Controller
public class UserController{

    //로그인 페이지로 이동
    @RequestMapping("/user/login.do")
    public String login(){
        logger.info("경로 : login");

        return "user/login";
    }

    //회원가입 페이지로 이동
    @RequesetMapping("/user/insert.do")
    public String insert(){
        logger.info("경로 : insert");

        return "user/insert";
    }

    //회원수정 페이지로 이동
        @RequesetMapping("/user/modify.do")
        public String modify(){
            logger.info("경로 : modify

            return "user/modify";
    }




}