package pl.gatomek.swaggerrest.plugin;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pl.gatomek.swaggerrest.data.CustomUuid;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.schema.ModelPropertyBuilderPlugin;
import springfox.documentation.spi.schema.contexts.ModelPropertyContext;

import java.util.Optional;

@Component
//@Order(Validators.BEAN_VALIDATOR_PLUGIN_ORDER)
public class TestPlugin implements ModelPropertyBuilderPlugin {

    @Override
    public boolean supports(DocumentationType delimiter) {
        return true;
    }

    @Override
    public void apply(ModelPropertyContext context) {
        int dbg = 13;


    }
}
