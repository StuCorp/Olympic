package behaviours;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by user on 27/06/2017.
 */

public interface Loggable {

    void saveSession(Integer lastSession) throws IOException;

    void saveAllSessions(Integer allSessionsTotal) throws IOException;

    void saveAsArray(ArrayList<Integer> runs);
}
