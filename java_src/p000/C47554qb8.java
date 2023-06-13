package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
/* renamed from: qb8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47554qb8 {

    /* renamed from: b */
    public static final AtomicReference f105504b = new AtomicReference();

    /* renamed from: c */
    public static final AtomicReference f105505c = new AtomicReference();

    /* renamed from: d */
    public static final AtomicReference f105506d = new AtomicReference();

    /* renamed from: a */
    public final InterfaceC39235cb8 f105507a;

    public C47554qb8(InterfaceC39235cb8 interfaceC39235cb8) {
        this.f105507a = interfaceC39235cb8;
    }

    /* renamed from: g */
    public static final String m17329g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z;
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final String m17335a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = m17334b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final String m17334b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f105507a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(m17331e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = m17335a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = m17335a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = m17335a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: c */
    public final String m17333c(zzaw zzawVar) {
        String m17334b;
        if (!this.f105507a.zza()) {
            return zzawVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzawVar.f71531d);
        sb.append(",name=");
        sb.append(m17332d(zzawVar.f71529b));
        sb.append(",params=");
        zzau zzauVar = zzawVar.f71530c;
        if (zzauVar == null) {
            m17334b = null;
        } else if (!this.f105507a.zza()) {
            m17334b = zzauVar.toString();
        } else {
            m17334b = m17334b(zzauVar.m50583u());
        }
        sb.append(m17334b);
        return sb.toString();
    }

    /* renamed from: d */
    public final String m17332d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f105507a.zza()) {
            return str;
        }
        return m17329g(str, C40628eu8.f79112c, C40628eu8.f79110a, f105504b);
    }

    /* renamed from: e */
    public final String m17331e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f105507a.zza()) {
            return str;
        }
        return m17329g(str, C48337ru8.f107887b, C48337ru8.f107886a, f105505c);
    }

    /* renamed from: f */
    public final String m17330f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f105507a.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return m17329g(str, C32971Fu8.f10511b, C32971Fu8.f10510a, f105506d);
    }
}
