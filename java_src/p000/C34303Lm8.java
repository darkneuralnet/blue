package p000;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.WO1;
/* renamed from: Lm8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34303Lm8 extends C45804ne7 implements MA8 {
    public C34303Lm8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // p000.MA8
    /* renamed from: K */
    public final WO1 mo95612K(Bitmap bitmap) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, bitmap);
        Parcel m23365c5 = m23365c5(6, m23364d5);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m78501c5;
    }

    @Override // p000.MA8
    /* renamed from: i */
    public final WO1 mo95611i(int i) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeInt(i);
        Parcel m23365c5 = m23365c5(1, m23364d5);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m78501c5;
    }
}
