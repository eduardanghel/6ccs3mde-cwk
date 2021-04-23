package uk.ac.kcl.eanghel.planning.generator;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import uk.ac.kcl.eanghel.planning.planning.Owner;
import uk.ac.kcl.eanghel.planning.planning.TaskPlanning;
import uk.ac.kcl.eanghel.planning.planning.TaskType;
import uk.ac.kcl.eanghel.planning.planning.Tasks;

@SuppressWarnings("all")
public class Auxiliary {
  public static List<TaskType> getTasks(final TaskPlanning root) {
    List<TaskType> TasksList = new ArrayList<TaskType>();
    EList<Tasks> _tasks = root.getTasks();
    for (final Tasks x : _tasks) {
      TasksList.add(x.getTaskType());
    }
    return TasksList;
  }
  
  public static TaskPlanning getTaskOwner(final Owner owner) {
    EObject _eContainer = owner.eContainer();
    return ((TaskPlanning) _eContainer);
  }
}
