package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
final class zzkx implements zzkw {
    @Override // com.google.android.libraries.places.internal.zzkw
    public final StackTraceElement zza(Class cls, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i2 = 3;
        boolean z = false;
        while (true) {
            if (i2 < stackTrace.length) {
                if (stackTrace[i2].getClassName().equals(name)) {
                    z = true;
                } else if (z) {
                    break;
                } else {
                    z = false;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1) {
            return stackTrace[i2];
        }
        return null;
    }
}
