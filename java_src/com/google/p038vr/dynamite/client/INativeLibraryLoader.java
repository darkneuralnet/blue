package com.google.p038vr.dynamite.client;

import android.os.IInterface;
import android.os.RemoteException;
/* renamed from: com.google.vr.dynamite.client.INativeLibraryLoader */
/* loaded from: classes6.dex */
public interface INativeLibraryLoader extends IInterface {
    int checkVersion(String str) throws RemoteException;

    long initializeAndLoadNativeLibrary(String str) throws RemoteException;
}
