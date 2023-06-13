package com.google.p038vr.dynamite.client;

import android.os.IInterface;
import android.os.RemoteException;
/* renamed from: com.google.vr.dynamite.client.ILoadedInstanceCreator */
/* loaded from: classes6.dex */
public interface ILoadedInstanceCreator extends IInterface {
    INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;
}
