package io.reactivex.exceptions;

import io.reactivex.internal.util.C24475k;
/* renamed from: io.reactivex.exceptions.a */
/* loaded from: classes6.dex */
public final class C23475a {
    private C23475a() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static RuntimeException m33010a(Throwable th) {
        throw C24475k.m32256e(th);
    }

    /* renamed from: b */
    public static void m33009b(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                }
                throw ((LinkageError) th);
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }
}
