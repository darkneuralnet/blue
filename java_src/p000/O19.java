package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmd;
import java.util.List;
import p000.WO1;
/* renamed from: O19 */
/* loaded from: classes5.dex */
public abstract class O19 extends RB7 implements Y19 {
    public O19() {
        super("com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    @Override // p000.RB7
    /* renamed from: c5 */
    public final boolean mo14826c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                List mo33614c4 = mo33614c4(WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder()), (zzmd) EP7.m109033a(parcel, zzmd.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo33614c4);
            } else {
                zzd();
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
