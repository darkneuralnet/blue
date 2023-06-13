package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.p034ar.core.dependencies.C17989c;
import com.google.p034ar.core.dependencies.C17991e;
import com.google.p038vr.dynamite.client.ILoadedInstanceCreator;
import com.google.p038vr.dynamite.client.INativeLibraryLoader;
import com.google.p038vr.dynamite.client.IObjectWrapper;
/* renamed from: IJ6 */
/* loaded from: classes6.dex */
public final class IJ6 extends C17989c implements ILoadedInstanceCreator {
    public IJ6(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.ILoadedInstanceCreator");
    }

    @Override // com.google.p038vr.dynamite.client.ILoadedInstanceCreator
    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        INativeLibraryLoader zk6;
        Parcel m48425a = m48425a();
        C17991e.m48419d(m48425a, iObjectWrapper);
        C17991e.m48419d(m48425a, iObjectWrapper2);
        Parcel m48424b = m48424b(1, m48425a);
        IBinder readStrongBinder = m48424b.readStrongBinder();
        if (readStrongBinder == null) {
            zk6 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            if (queryLocalInterface instanceof INativeLibraryLoader) {
                zk6 = (INativeLibraryLoader) queryLocalInterface;
            } else {
                zk6 = new ZK6(readStrongBinder);
            }
        }
        m48424b.recycle();
        return zk6;
    }
}
