package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom;
import p000.WO1;
/* renamed from: O77 */
/* loaded from: classes5.dex */
public abstract class O77 extends BinderC44559lY6 implements P77 {
    public O77() {
        super("com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    @Override // p000.BinderC44559lY6
    /* renamed from: c5 */
    public final boolean mo27162c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    C47533qZ6.m17447b(parcel);
                    zbf[] mo8685y = mo8685y(WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder()), (zbnz) C47533qZ6.m17448a(parcel, zbnz.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(mo8685y, 1);
                } else {
                    C47533qZ6.m17447b(parcel);
                    zbom mo8686b0 = mo8686b0(WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder()), (zbnz) C47533qZ6.m17448a(parcel, zbnz.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    mo8686b0.writeToParcel(parcel2, 1);
                }
            } else {
                zbd();
                parcel2.writeNoException();
            }
        } else {
            zbc();
            parcel2.writeNoException();
        }
        return true;
    }
}
