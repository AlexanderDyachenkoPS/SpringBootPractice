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
        private Long longParam1;

        public Long getLongParam2() {
            return longParam2;
        }

        public void setLongParam2(Long longParam2) {
            this.longParam2 = longParam2;
        }

        private Long longParam2;


        public Long getSum() {
            return sum;
        }

        public void setSum(Long sum) {
            this.sum = sum;
        }

        private Long sum;

        public void setParam1(String param1) {
            this.param1 = param1;
        }

        public void setParam2(String param2) {
            this.param2 = param2;
        }

        public void setLongParam1(Long longParam1) {
            this.longParam1 = longParam1;
        }



        public String getParam1() {
            return param1;
        }

        public String getParam2() {
            return param2;
        }

        public Long getLongParam1() {
            return longParam1;
        }

    }
    @RequestMapping(path = "/hello9",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public RestResponse restMethod1( String name, String middleName, Long long1, Long long2) {
        RestResponse result = new RestResponse();
        result.setParam1(name);
        result.setParam2(middleName);

        result.setLongParam1(long1);
        result.setLongParam2(long2);

        Long sum = result.getLongParam1() + result.getLongParam2() + 12;

        result.setSum(sum);


        return result;
    }

    @RequestMapping(path = "/hello1",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public RestResponse restMethod2( String param1, String param2) {
        RestResponse result = new RestResponse();
        result.setParam1(param1);
        result.setParam2(param2);
        result.setLongParam1(12313l);

        return result;
    }
}

