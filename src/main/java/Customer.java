/*import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;*/
import lombok.*;
@Getter
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
public class Customer {
    private int custId;
    private String custName;
    private int balance;
}
