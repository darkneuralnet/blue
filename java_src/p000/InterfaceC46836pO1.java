package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
/* renamed from: pO1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC46836pO1 extends IInterface {

    /* renamed from: pO1$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractBinderC27282a extends Binder implements InterfaceC46836pO1 {

        /* renamed from: pO1$a$a */
        /* loaded from: classes6.dex */
        public static class C27283a implements InterfaceC46836pO1 {

            /* renamed from: a */
            public IBinder f103609a;

            public C27283a(IBinder iBinder) {
                this.f103609a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f103609a;
            }
        }

        public AbstractBinderC27282a() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        }

        /* renamed from: c5 */
        public static InterfaceC46836pO1 m19356c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC46836pO1)) {
                return (InterfaceC46836pO1) queryLocalInterface;
            }
            return new C27283a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Status status;
            Status status2;
            DynamicLinkData dynamicLinkData = null;
            ShortDynamicLinkImpl shortDynamicLinkImpl = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                    return true;
                }
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                if (parcel.readInt() != 0) {
                    status2 = Status.CREATOR.createFromParcel(parcel);
                } else {
                    status2 = null;
                }
                if (parcel.readInt() != 0) {
                    shortDynamicLinkImpl = ShortDynamicLinkImpl.CREATOR.createFromParcel(parcel);
                }
                mo19358C3(status2, shortDynamicLinkImpl);
                return true;
            }
            parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            if (parcel.readInt() != 0) {
                status = Status.CREATOR.createFromParcel(parcel);
            } else {
                status = null;
            }
            if (parcel.readInt() != 0) {
                dynamicLinkData = DynamicLinkData.CREATOR.createFromParcel(parcel);
            }
            mo19357U2(status, dynamicLinkData);
            return true;
        }
    }

    /* renamed from: C3 */
    void mo19358C3(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) throws RemoteException;

    /* renamed from: U2 */
    void mo19357U2(Status status, DynamicLinkData dynamicLinkData) throws RemoteException;
}
