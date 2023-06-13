package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.p034ar.core.dependencies.C17989c;
import com.google.p038vr.dynamite.client.INativeLibraryLoader;
/* renamed from: ZK6 */
/* loaded from: classes6.dex */
public final class ZK6 extends C17989c implements INativeLibraryLoader {
    public ZK6(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
    }

    @Override // com.google.p038vr.dynamite.client.INativeLibraryLoader
    public final int checkVersion(String str) throws RemoteException {
        Parcel m48425a = m48425a();
        m48425a.writeString(str);
        Parcel m48424b = m48424b(2, m48425a);
        int readInt = m48424b.readInt();
        m48424b.recycle();
        return readInt;
    }

    @Override // com.google.p038vr.dynamite.client.INativeLibraryLoader
    public final long initializeAndLoadNativeLibrary(String str) throws RemoteException {
        Parcel m48425a = m48425a();
        m48425a.writeString(str);
        Parcel m48424b = m48424b(1, m48425a);
        long readLong = m48424b.readLong();
        m48424b.recycle();
        return readLong;
    }
}
