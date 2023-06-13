package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* renamed from: gP6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC41513gP6 extends BinderC44469lO6 implements InterfaceC42699iP6 {
    public AbstractBinderC41513gP6() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // p000.BinderC44469lO6
    /* renamed from: c5 */
    public final boolean mo27338c5(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo34008i1(parcel.readInt(), (Bundle) C48027rO6.m16003a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C48027rO6.m16003a(parcel, Bundle.CREATOR);
                mo34015M(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) C48027rO6.m16003a(parcel, Bundle.CREATOR);
                mo34010d0(readInt2);
                return true;
            case 5:
                mo25821T4(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) C48027rO6.m16003a(parcel, creator);
                mo34013R0((Bundle) C48027rO6.m16003a(parcel, creator));
                return true;
            case 7:
                mo17605O1((Bundle) C48027rO6.m16003a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) C48027rO6.m16003a(parcel, creator2);
                mo34011c3((Bundle) C48027rO6.m16003a(parcel, creator2));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) C48027rO6.m16003a(parcel, creator3);
                mo34014N2((Bundle) C48027rO6.m16003a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo21339x1((Bundle) C48027rO6.m16003a(parcel, creator4), (Bundle) C48027rO6.m16003a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo29051P1((Bundle) C48027rO6.m16003a(parcel, creator5), (Bundle) C48027rO6.m16003a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                mo34012X1((Bundle) C48027rO6.m16003a(parcel, creator6), (Bundle) C48027rO6.m16003a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) C48027rO6.m16003a(parcel, creator7);
                Bundle bundle7 = (Bundle) C48027rO6.m16003a(parcel, creator7);
                mo34007n();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) C48027rO6.m16003a(parcel, Bundle.CREATOR);
                mo34009i();
                return true;
        }
    }
}
