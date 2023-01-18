package automationJava.homework7;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;

    class DemoLogger {
        //    Написати свій клас Logger, який потім можна у різних місцях наших програм.
        //    Логгер має підтримувати різні рівні логування (info, debug, warn, error).
//    Можна додати Enum для різних рівнів логування, щоб за цими рівнями змінювати колір повідомлення,
//    не має випадати помилка у программі.
//    Як можна змінювати колір консолі:
//    https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
//у нас же в завданні треба самому повністю реалізувати клас з базовими методами і виводом до консолі, тут більше мета
//    щоб ви зробили свою ієрархію класів і помилки, і через sout вивели їх у консоль в різному кольорі в залежності від
//    hівня який ви оберете
        private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        public void makeSomeLog() {
            LOGGER.log(Level.INFO, "My first Log Message");
        }
        public void logWarn(){
            LOGGER.log(Level.WARNING, "Some warning");
        }

        public static void main(String[] args) {
            DemoLogger obj = new DemoLogger();
            obj.makeSomeLog();
            LogManager lgmngr = LogManager.getLogManager();
            Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
            log.log(Level.INFO, "This is a log message");

            obj.logWarn();
            log.log(Level.WARNING, "Some warning");
        }
    }
