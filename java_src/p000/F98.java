package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;
/* renamed from: F98 */
/* loaded from: classes6.dex */
public abstract class F98 extends DL7 implements V98 {
    public F98() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p000.DL7
    /* renamed from: c5 */
    public final boolean mo75075c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                UL7.m81614c(parcel);
                mo18052J2((zzaw) UL7.m81616a(parcel, zzaw.CREATOR), (zzq) UL7.m81616a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                UL7.m81614c(parcel);
                mo18040z((zzlj) UL7.m81616a(parcel, zzlj.CREATOR), (zzq) UL7.m81616a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                UL7.m81614c(parcel);
                mo18046a0((zzq) UL7.m81616a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                UL7.m81614c(parcel);
                mo44927z4((zzaw) UL7.m81616a(parcel, zzaw.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                UL7.m81614c(parcel);
                mo18054C0((zzq) UL7.m81616a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean m81611f = UL7.m81611f(parcel);
                UL7.m81614c(parcel);
                List mo44937E = mo44937E((zzq) UL7.m81616a(parcel, zzq.CREATOR), m81611f);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo44937E);
                return true;
            case 9:
                String readString3 = parcel.readString();
                UL7.m81614c(parcel);
                byte[] mo18047X3 = mo18047X3((zzaw) UL7.m81616a(parcel, zzaw.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(mo18047X3);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                UL7.m81614c(parcel);
                mo18051O2(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                UL7.m81614c(parcel);
                String mo18044d4 = mo18044d4((zzq) UL7.m81616a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(mo18044d4);
                return true;
            case 12:
                UL7.m81614c(parcel);
                mo18048R4((zzac) UL7.m81616a(parcel, zzac.CREATOR), (zzq) UL7.m81616a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                UL7.m81614c(parcel);
                mo44930j2((zzac) UL7.m81616a(parcel, zzac.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                UL7.m81614c(parcel);
                List mo18045d3 = mo18045d3(parcel.readString(), parcel.readString(), UL7.m81611f(parcel), (zzq) UL7.m81616a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo18045d3);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean m81611f2 = UL7.m81611f(parcel);
                UL7.m81614c(parcel);
                List mo18049Q3 = mo18049Q3(readString7, readString8, readString9, m81611f2);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo18049Q3);
                return true;
            case 16:
                UL7.m81614c(parcel);
                List mo18041t4 = mo18041t4(parcel.readString(), parcel.readString(), (zzq) UL7.m81616a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo18041t4);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                UL7.m81614c(parcel);
                List mo18050Q0 = mo18050Q0(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo18050Q0);
                return true;
            case 18:
                UL7.m81614c(parcel);
                mo18042q0((zzq) UL7.m81616a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                UL7.m81614c(parcel);
                mo18053E0((Bundle) UL7.m81616a(parcel, Bundle.CREATOR), (zzq) UL7.m81616a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                UL7.m81614c(parcel);
                mo18043k0((zzq) UL7.m81616a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
