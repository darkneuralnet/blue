package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzn;
import com.google.android.gms.auth.api.accounttransfer.zzv;
import com.google.android.gms.common.api.Status;
/* renamed from: Av7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC31809Av7 extends DB7 implements InterfaceC47170pw7 {
    public AbstractBinderC31809Av7() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // p000.DB7
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzh((Status) C51602xQ7.m5273a(parcel, Status.CREATOR));
                return true;
            case 2:
                zzf((Status) C51602xQ7.m5273a(parcel, Status.CREATOR), (zzv) C51602xQ7.m5273a(parcel, zzv.CREATOR));
                return true;
            case 3:
                zzg((Status) C51602xQ7.m5273a(parcel, Status.CREATOR), (zzn) C51602xQ7.m5273a(parcel, zzn.CREATOR));
                return true;
            case 4:
                zze();
                return true;
            case 5:
                zzd((Status) C51602xQ7.m5273a(parcel, Status.CREATOR));
                return true;
            case 6:
                zzb(parcel.createByteArray());
                return true;
            case 7:
                zzc((DeviceMetaData) C51602xQ7.m5273a(parcel, DeviceMetaData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
