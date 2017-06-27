package behaviours;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by user on 27/06/2017.
 */

public interface Loggable {

    void logSession(Integer lastSession) throws IOException;

    void logAllSessions(Integer allSessionsTotal) throws IOException;

    void logAsArray(ArrayList<Integer> runs);

}
