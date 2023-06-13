package zendesk.support;

import java.util.UUID;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes8.dex */
public class IdUtil {
    private static UUID generateUniqueId() {
        return UUID.randomUUID();
    }

    public static long newLongId() {
        return generateUniqueId().getMostSignificantBits() & LongCompanionObject.MAX_VALUE;
    }

    public static String newStringId() {
        return generateUniqueId().toString();
    }
}
