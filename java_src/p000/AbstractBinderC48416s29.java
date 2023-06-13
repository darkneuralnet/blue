package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmh;
import p000.WO1;
/* renamed from: s29  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC48416s29 extends RB7 implements C29 {
    public AbstractBinderC48416s29() {
        super("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    public static C29 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        if (queryLocalInterface instanceof C29) {
            return (C29) queryLocalInterface;
        }
        return new C42487i29(iBinder);
    }

    @Override // p000.RB7
    /* renamed from: c5 */
    public final boolean mo14826c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Y19 newFaceDetector = newFaceDetector(WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder()), (zzmh) EP7.m109033a(parcel, zzmh.CREATOR));
            parcel2.writeNoException();
            EP7.m109032b(parcel2, newFaceDetector);
            return true;
        }
        return false;
    }
}
