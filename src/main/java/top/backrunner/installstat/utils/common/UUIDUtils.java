package top.backrunner.installstat.utils.common;

import java.util.UUID;

public class UUIDUtils {
    public static String generate(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }
}
