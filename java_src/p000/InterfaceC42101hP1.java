package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
/* renamed from: hP1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC42101hP1 extends IInterface {
    /* renamed from: J0 */
    void mo36454J0(MM7 mm7) throws RemoteException;

    WO1 getView() throws RemoteException;

    void onCreate(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle bundle) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;
}
