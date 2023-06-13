package com.google.p034ar.core.dependencies;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: com.google.ar.core.dependencies.g */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC17993g extends BinderC17990d implements InterfaceC17994h {
    /* renamed from: b */
    public static InterfaceC17994h m48418b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
        if (queryLocalInterface instanceof InterfaceC17994h) {
            return (InterfaceC17994h) queryLocalInterface;
        }
        return new C17992f(iBinder);
    }
}
