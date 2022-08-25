package bootsbrain;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {
    public static class RestResponse {
        private String param1;
        private String param2;

        public void setParam1(String param1) {
            this.param1 = param1;
        }

        public void setParam2(String param2) {
            this.param2 = param2;
        }

        public String getParam1() {
            return param1;
        }

        public String getParam2() {
            return param2;
        }
    }
    @RequestMapping(path = "/ehllo",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public RestResponse restMethod( String name, String middleName) {
        RestResponse result = new RestResponse();
        result.setParam1(name);
        result.setParam2(middleName);

        return result;
    }
}

