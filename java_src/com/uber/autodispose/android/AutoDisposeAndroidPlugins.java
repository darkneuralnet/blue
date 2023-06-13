package com.uber.autodispose.android;

import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23482e;
/* loaded from: classes7.dex */
public final class AutoDisposeAndroidPlugins {

    /* renamed from: a */
    public static volatile InterfaceC23482e f75558a;

    private AutoDisposeAndroidPlugins() {
    }

    /* renamed from: a */
    public static boolean m45203a(InterfaceC23482e interfaceC23482e) {
        if (interfaceC23482e != null) {
            InterfaceC23482e interfaceC23482e2 = f75558a;
            try {
                if (interfaceC23482e2 == null) {
                    return interfaceC23482e.mo33005a();
                }
                return interfaceC23482e2.mo33005a();
            } catch (Exception e) {
                throw C23475a.m33010a(e);
            }
        }
        throw new NullPointerException("defaultChecker == null");
    }
}
