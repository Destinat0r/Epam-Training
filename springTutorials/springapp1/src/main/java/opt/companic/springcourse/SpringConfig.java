package opt.companic.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("opt.companic.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
