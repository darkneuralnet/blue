package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.wallet.zze;
import com.google.android.gms.internal.wallet.zzg;
import com.google.android.gms.internal.wallet.zzi;
import com.google.android.gms.internal.wallet.zzk;
import com.google.android.gms.internal.wallet.zzm;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.button.zzc;
import com.google.android.gms.wallet.zzau;
/* renamed from: id9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC42831id9 extends BinderC37822aC7 implements Dh9 {
    public AbstractBinderC42831id9() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    @Override // p000.BinderC37822aC7
    /* renamed from: c5 */
    public final boolean mo33718c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                MP7.m95310b(parcel);
                mo106415Y(parcel.readInt(), (MaskedWallet) MP7.m95311a(parcel, MaskedWallet.CREATOR), (Bundle) MP7.m95311a(parcel, Bundle.CREATOR));
                return true;
            case 2:
                MP7.m95310b(parcel);
                mo106416V1(parcel.readInt(), (FullWallet) MP7.m95311a(parcel, FullWallet.CREATOR), (Bundle) MP7.m95311a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                MP7.m95310b(parcel);
                mo28244o2(parcel.readInt(), MP7.m95307e(parcel), (Bundle) MP7.m95311a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                MP7.m95310b(parcel);
                mo106414e3(parcel.readInt(), (Bundle) MP7.m95311a(parcel, Bundle.CREATOR));
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                MP7.m95307e(parcel);
                Bundle bundle = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
            case 7:
                Status status = (Status) MP7.m95311a(parcel, Status.CREATOR);
                zze zzeVar = (zze) MP7.m95311a(parcel, zze.CREATOR);
                Bundle bundle2 = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
            case 8:
                Status status2 = (Status) MP7.m95311a(parcel, Status.CREATOR);
                Bundle bundle3 = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
            case 9:
                MP7.m95310b(parcel);
                mo28245L0((Status) MP7.m95311a(parcel, Status.CREATOR), MP7.m95307e(parcel), (Bundle) MP7.m95311a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Status status3 = (Status) MP7.m95311a(parcel, Status.CREATOR);
                zzg zzgVar = (zzg) MP7.m95311a(parcel, zzg.CREATOR);
                Bundle bundle4 = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
            case 11:
                Status status4 = (Status) MP7.m95311a(parcel, Status.CREATOR);
                Bundle bundle5 = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
            case 12:
                Status status5 = (Status) MP7.m95311a(parcel, Status.CREATOR);
                zzau zzauVar = (zzau) MP7.m95311a(parcel, zzau.CREATOR);
                Bundle bundle6 = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
            case 13:
                Status status6 = (Status) MP7.m95311a(parcel, Status.CREATOR);
                Bundle bundle7 = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
            case 14:
                MP7.m95310b(parcel);
                mo11176X2((Status) MP7.m95311a(parcel, Status.CREATOR), (PaymentData) MP7.m95311a(parcel, PaymentData.CREATOR), (Bundle) MP7.m95311a(parcel, Bundle.CREATOR));
                return true;
            case 15:
                Status status7 = (Status) MP7.m95311a(parcel, Status.CREATOR);
                zzm zzmVar = (zzm) MP7.m95311a(parcel, zzm.CREATOR);
                Bundle bundle8 = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
            case 16:
                Status status8 = (Status) MP7.m95311a(parcel, Status.CREATOR);
                zzi zziVar = (zzi) MP7.m95311a(parcel, zzi.CREATOR);
                Bundle bundle9 = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
            case 17:
                Status status9 = (Status) MP7.m95311a(parcel, Status.CREATOR);
                zzk zzkVar = (zzk) MP7.m95311a(parcel, zzk.CREATOR);
                Bundle bundle10 = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
            case 18:
                parcel.readInt();
                Bundle bundle11 = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
            case 19:
                MP7.m95310b(parcel);
                mo106417N0((Status) MP7.m95311a(parcel, Status.CREATOR), (PaymentCardRecognitionIntentResponse) MP7.m95311a(parcel, PaymentCardRecognitionIntentResponse.CREATOR), (Bundle) MP7.m95311a(parcel, Bundle.CREATOR));
                return true;
            case 20:
                Status status10 = (Status) MP7.m95311a(parcel, Status.CREATOR);
                zzc zzcVar = (zzc) MP7.m95311a(parcel, zzc.CREATOR);
                Bundle bundle12 = (Bundle) MP7.m95311a(parcel, Bundle.CREATOR);
                MP7.m95310b(parcel);
                return true;
        }
    }
}
