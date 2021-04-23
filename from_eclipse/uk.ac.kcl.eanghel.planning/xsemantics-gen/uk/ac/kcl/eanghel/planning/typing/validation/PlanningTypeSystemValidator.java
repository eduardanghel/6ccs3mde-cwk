package uk.ac.kcl.eanghel.planning.typing.validation;

import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import uk.ac.kcl.eanghel.planning.typing.PlanningTypeSystem;
import uk.ac.kcl.eanghel.planning.validation.AbstractPlanningValidator;

@SuppressWarnings("all")
public class PlanningTypeSystemValidator extends AbstractPlanningValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected PlanningTypeSystem xsemanticsSystem;
  
  protected PlanningTypeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
}
