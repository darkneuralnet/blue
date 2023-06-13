package com.google.p034ar.core.dependencies;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* renamed from: com.google.ar.core.dependencies.f */
/* loaded from: classes6.dex */
public final class C17992f extends C17989c implements InterfaceC17994h {
    public C17992f(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
    }

    @Override // com.google.p034ar.core.dependencies.InterfaceC17994h
    /* renamed from: d */
    public final void mo48417d(String str, Bundle bundle, InterfaceC17996j interfaceC17996j) throws RemoteException {
        Parcel m48425a = m48425a();
        m48425a.writeString(str);
        C17991e.m48420c(m48425a, bundle);
        C17991e.m48419d(m48425a, interfaceC17996j);
        m48423c(2, m48425a);
    }

    @Override // com.google.p034ar.core.dependencies.InterfaceC17994h
    /* renamed from: e */
    public final void mo48416e(String str, List list, Bundle bundle, InterfaceC17996j interfaceC17996j) throws RemoteException {
        Parcel m48425a = m48425a();
        m48425a.writeString(str);
        m48425a.writeTypedList(list);
        C17991e.m48420c(m48425a, bundle);
        C17991e.m48419d(m48425a, interfaceC17996j);
        m48423c(1, m48425a);
    }
}
