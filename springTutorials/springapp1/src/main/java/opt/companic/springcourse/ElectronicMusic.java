package opt.companic.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ElectronicMusic implements Music {

    @Override public String getSong() {
        return "Playing Emancipator - Eve";
    }
}
