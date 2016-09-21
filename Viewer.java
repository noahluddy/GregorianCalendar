
import javax.swing.JFrame;
import java.util.GregorianCalendar;

/**
 *  Shows a frame that has the week in it.  The following code only generates the 
 *  frame and calls WeekFrameComponent to generate the week of days (rectangles side-
 *  by-side) which is then displayed in the frame.
 */
public class Viewer
{
   public void weekViewer(GregorianCalendar myDay) // passed it through bits of info. 
   // Now weekViewer can use myDay and myDayOfWeek
   {
      JFrame frame = new JFrame();

      frame.setSize(1000, 400);
      frame.setTitle("Calendar Program");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Component comp = new Component(myDay);
      frame.add(comp);

      frame.setVisible(true);
   }
}
