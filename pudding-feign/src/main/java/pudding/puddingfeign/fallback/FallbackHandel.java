package pudding.puddingfeign.fallback;

import org.springframework.stereotype.Component;
import pudding.puddingfeign.feignInterface.PuddingFeignClient;

/**
 * create by wusf on 2017/12/25.<br>
 */
@Component
public class FallbackHandel implements PuddingFeignClient {
    @Override
    public String sayHi() {
        return "feign fallback .";
    }
}
