package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
/* renamed from: QO1 */
/* loaded from: classes6.dex */
public interface QO1 extends IInterface {
    /* renamed from: S4 */
    void mo6787S4(InterfaceC51299wu7 interfaceC51299wu7) throws RemoteException;

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
