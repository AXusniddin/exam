package examine4.student.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDto<T> {
    private Integer code;
    private String message;
    private boolean succes;
    private T data;
}
