package pudding.ribbon.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * create by wusf on 2017/12/22.<br>
 */
@Data
public class RequestBean  implements Serializable{
    private static final long serialVersionUID = 4388767497318582193L;

    private String type;

    private LocalTime time;
}
