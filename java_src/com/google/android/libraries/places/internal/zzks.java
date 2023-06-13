package com.google.android.libraries.places.internal;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* loaded from: classes6.dex */
public final class zzks {
    private static final String[] zza;
    private static final zzkw zzb;

    static {
        zzkw zzkxVar;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        zza = strArr;
        int i = 0;
        while (true) {
            if (i < 2) {
                try {
                    zzkxVar = (zzkw) Class.forName(strArr[i]).asSubclass(zzkw.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    zzkxVar = null;
                }
                if (zzkxVar != null) {
                    break;
                }
                i++;
            } else {
                zzkxVar = new zzkx();
                break;
            }
        }
        zzb = zzkxVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i) {
        zzkt.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
