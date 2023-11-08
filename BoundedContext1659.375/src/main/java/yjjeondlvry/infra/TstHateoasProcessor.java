package yjjeondlvry.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import yjjeondlvry.domain.*;

@Component
public class TstHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Tst>> {

    @Override
    public EntityModel<Tst> process(EntityModel<Tst> model) {
        return model;
    }
}
