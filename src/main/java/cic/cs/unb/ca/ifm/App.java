package cic.cs.unb.ca.ifm;

import cic.cs.unb.ca.flow.FlowMgr;
import cic.cs.unb.ca.guava.GuavaMgr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.*;

public class App {
	public static final Logger logger = LoggerFactory.getLogger(App.class);
	public static void init() {
		FlowMgr.getInstance().init();
		GuavaMgr.getInstance().init();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*try {
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}*/
		
		EventQueue.invokeLater(() -> {
            try {
                
                init();
//                new MainFrame();
                
                new AutomaticFlowmeter(args[0], args[1], args[2], args[3]);
//                new AutomaticFlowmeter("netflowmqtt", "192.168.100.9", "1883", "wlp3s0");
            } catch (Exception e) {
				logger.debug(e.getMessage());
            }
        });
	}
}
