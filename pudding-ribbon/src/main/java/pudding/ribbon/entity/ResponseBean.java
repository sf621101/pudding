package pudding.ribbon.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * create by wusf on 2017/12/22.<br>
 */
@Data
public class ResponseBean implements Serializable {

    private static final long serialVersionUID = -2136782783134130687L;

    private String msg;

    private String code;


}
