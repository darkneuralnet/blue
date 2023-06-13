package org.joda.time.p059tz;
/* renamed from: org.joda.time.tz.ZoneInfoLogger */
/* loaded from: classes8.dex */
public class ZoneInfoLogger {
    static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>() { // from class: org.joda.time.tz.ZoneInfoLogger.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };

    public static void set(boolean z) {
        cVerbose.set(Boolean.valueOf(z));
    }

    public static boolean verbose() {
        return cVerbose.get().booleanValue();
    }
}
