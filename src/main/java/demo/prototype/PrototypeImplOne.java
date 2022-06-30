package demo.prototype;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ClassName PrototypeImplOne
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 10:57
 * @Version 1.0
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PrototypeImplOne  implements Prototype{

    private String name;

    private String age;


    @Override
    public Prototype clone() {
        PrototypeImplOne tom = PrototypeImplOne.builder()
                .name(name)
                .age(age)
                .build();
        return tom;
    }
}
