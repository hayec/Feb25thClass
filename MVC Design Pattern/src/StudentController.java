
public class StudentController 
{
	public StudentController(Student model, WindowView window)
	{
		window.setOKButtonListener(new OKButtonListener(){
			@Override
			public void okButtonClicked(OKButtonEventObject ev)
			{
				model.setName(ev.getName());
				model.setId(ev.getID());
				//Change the data
				String str = model.getName() + " Says Hello";
				window.setNameField(str);
				window.setIDField(ev.getID());
			}
		});
	}
}
