package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
/* renamed from: OW8 */
/* loaded from: classes6.dex */
public final class OW8 extends AbstractC32017Bs8 {

    /* renamed from: g */
    public static final String[] f26727g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    public static final String[] f26728h = {"_err"};

    /* renamed from: c */
    public SecureRandom f26729c;

    /* renamed from: d */
    public final AtomicLong f26730d;

    /* renamed from: e */
    public int f26731e;

    /* renamed from: f */
    public Integer f26732f;

    public OW8(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f26732f = null;
        this.f26730d = new AtomicLong(0L);
    }

    /* renamed from: Y */
    public static boolean m92080Y(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: Z */
    public static boolean m92079Z(String str) {
        Preconditions.checkNotEmpty(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public static boolean m92078a0(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: b0 */
    public static boolean m92077b0(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        return m92067k0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    /* renamed from: c0 */
    public static boolean m92076c0(String str) {
        if (f26728h[0].equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public static final boolean m92072f0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    @VisibleForTesting
    /* renamed from: g0 */
    public static final boolean m92071g0(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: j0 */
    public static boolean m92068j0(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (C48693sW8.m14112a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    public static boolean m92067k0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: q */
    public static MessageDigest m92056q() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: s */
    public static ArrayList m92052s(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, zzacVar.f71517b);
            bundle.putString(AnalyticsRequestV2.HEADER_ORIGIN, zzacVar.f71518c);
            bundle.putLong("creation_timestamp", zzacVar.f71520e);
            bundle.putString("name", zzacVar.f71519d.f71534c);
            C35302Pt8.m89460b(bundle, Preconditions.checkNotNull(zzacVar.f71519d.m50581s()));
            bundle.putBoolean("active", zzacVar.f71521f);
            String str = zzacVar.f71522g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzawVar = zzacVar.f71523h;
            if (zzawVar != null) {
                bundle.putString("timed_out_event_name", zzawVar.f71529b);
                zzau zzauVar = zzawVar.f71530c;
                if (zzauVar != null) {
                    bundle.putBundle("timed_out_event_params", zzauVar.m50583u());
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.f71524i);
            zzaw zzawVar2 = zzacVar.f71525j;
            if (zzawVar2 != null) {
                bundle.putString("triggered_event_name", zzawVar2.f71529b);
                zzau zzauVar2 = zzawVar2.f71530c;
                if (zzauVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzauVar2.m50583u());
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.f71519d.f71535d);
            bundle.putLong("time_to_live", zzacVar.f71526k);
            zzaw zzawVar3 = zzacVar.f71527l;
            if (zzawVar3 != null) {
                bundle.putString("expired_event_name", zzawVar3.f71529b);
                zzau zzauVar3 = zzawVar3.f71530c;
                if (zzauVar3 != null) {
                    bundle.putBundle("expired_event_params", zzauVar3.m50583u());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @VisibleForTesting
    /* renamed from: s0 */
    public static long m92051s0(byte[] bArr) {
        boolean z;
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    /* renamed from: v */
    public static void m92046v(C50902wE8 c50902wE8, Bundle bundle, boolean z) {
        if (bundle != null && c50902wE8 != null) {
            if (bundle.containsKey("_sc") && !z) {
                z = false;
            } else {
                String str = c50902wE8.f115669a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c50902wE8.f115670b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c50902wE8.f115671c);
                return;
            }
        }
        if (bundle != null && c50902wE8 == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: B */
    public final void m92102B(DW8 dw8, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m92072f0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        dw8.mo41290a(str, "_err", bundle);
    }

    /* renamed from: D */
    public final void m92101D(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = obj.getClass().getSimpleName();
            } else {
                str2 = null;
            }
            this.f100966a.mo22258a().m106887u().m42706c("Not putting event parameter. Invalid value type. name, type", this.f100966a.m89786D().m17331e(str), str2);
        }
    }

    /* renamed from: E */
    public final void m92100E(InterfaceC42134hS7 interfaceC42134hS7, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            interfaceC42134hS7.mo30653W0(bundle);
        } catch (RemoteException e) {
            this.f100966a.mo22258a().m106888t().m42707b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: F */
    public final void m92099F(InterfaceC42134hS7 interfaceC42134hS7, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC42134hS7.mo30653W0(bundle);
        } catch (RemoteException e) {
            this.f100966a.mo22258a().m106888t().m42707b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: G */
    public final void m92098G(InterfaceC42134hS7 interfaceC42134hS7, Bundle bundle) {
        try {
            interfaceC42134hS7.mo30653W0(bundle);
        } catch (RemoteException e) {
            this.f100966a.mo22258a().m106888t().m42707b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: H */
    public final void m92097H(InterfaceC42134hS7 interfaceC42134hS7, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC42134hS7.mo30653W0(bundle);
        } catch (RemoteException e) {
            this.f100966a.mo22258a().m106888t().m42707b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: I */
    public final void m92096I(InterfaceC42134hS7 interfaceC42134hS7, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            interfaceC42134hS7.mo30653W0(bundle);
        } catch (RemoteException e) {
            this.f100966a.mo22258a().m106888t().m42707b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: J */
    public final void m92095J(InterfaceC42134hS7 interfaceC42134hS7, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            interfaceC42134hS7.mo30653W0(bundle);
        } catch (RemoteException e) {
            this.f100966a.mo22258a().m106888t().m42707b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: K */
    public final void m92094K(InterfaceC42134hS7 interfaceC42134hS7, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC42134hS7.mo30653W0(bundle);
        } catch (RemoteException e) {
            this.f100966a.mo22258a().m106888t().m42707b("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: L */
    public final void m92093L(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        int i3;
        String str4;
        int i4;
        int m92090O;
        int i5;
        String str5;
        String str6;
        if (bundle == null) {
            return;
        }
        C41723gl7 m89751w = this.f100966a.m89751w();
        Jf9.m100045b();
        String str7 = null;
        if (m89751w.f100966a.m89751w().m37502y(null, C37795a98.f49926B0) && m89751w.f100966a.m89776N().m92081X(231100000, true)) {
            i = 35;
        } else {
            i = 0;
        }
        int i6 = 0;
        for (String str8 : new TreeSet(bundle.keySet())) {
            if (list != null && list.contains(str8)) {
                i3 = 0;
            } else {
                if (!z) {
                    i2 = m92059o0(str8);
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    i2 = m92061n0(str8);
                }
                i3 = i2;
            }
            if (i3 != 0) {
                if (i3 == 3) {
                    str6 = str8;
                } else {
                    str6 = str7;
                }
                m92048u(bundle, i3, str8, str8, str6);
                bundle.remove(str8);
                i5 = i;
                str5 = str7;
            } else {
                if (m92083V(bundle.get(str8))) {
                    this.f100966a.mo22258a().m106887u().m42705d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str8);
                    m92090O = 22;
                    str4 = str8;
                    i4 = i;
                } else {
                    str4 = str8;
                    i4 = i;
                    m92090O = m92090O(str, str2, str8, bundle.get(str8), bundle, list, z, false);
                }
                if (m92090O != 0 && !"_ev".equals(str4)) {
                    m92048u(bundle, m92090O, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (m92079Z(str4) && !m92068j0(str4, C48337ru8.f107889d)) {
                    int i7 = i6 + 1;
                    if (!m92081X(231100000, true)) {
                        this.f100966a.mo22258a().m106892p().m42706c("Item array not supported on client's version of Google Play Services (Android Only)", this.f100966a.m89786D().m17332d(str2), this.f100966a.m89786D().m17334b(bundle));
                        m92072f0(bundle, 23);
                        bundle.remove(str4);
                        i5 = i4;
                    } else {
                        i5 = i4;
                        if (i7 > i5) {
                            Jf9.m100045b();
                            str5 = null;
                            if (this.f100966a.m89751w().m37502y(null, C37795a98.f49926B0)) {
                                this.f100966a.mo22258a().m106892p().m42706c("Item can't contain more than " + i5 + " item-scoped custom params", this.f100966a.m89786D().m17332d(str2), this.f100966a.m89786D().m17334b(bundle));
                                m92072f0(bundle, 28);
                                bundle.remove(str4);
                            } else {
                                this.f100966a.mo22258a().m106892p().m42706c("Item cannot contain custom parameters", this.f100966a.m89786D().m17332d(str2), this.f100966a.m89786D().m17334b(bundle));
                                m92072f0(bundle, 23);
                                bundle.remove(str4);
                            }
                            i6 = i7;
                        }
                    }
                    str5 = null;
                    i6 = i7;
                }
                i5 = i4;
                str5 = null;
            }
            i = i5;
            str7 = str5;
        }
    }

    /* renamed from: M */
    public final boolean m92092M(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!m92071g0(str)) {
                if (this.f100966a.m89760n()) {
                    this.f100966a.mo22258a().m106892p().m42707b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C32809Fc8.m106885w(str));
                }
                return false;
            }
            return true;
        } else if (!TextUtils.isEmpty(str2)) {
            if (!m92071g0(str2)) {
                this.f100966a.mo22258a().m106892p().m42707b("Invalid admob_app_id. Analytics disabled.", C32809Fc8.m106885w(str2));
                return false;
            }
            return true;
        } else {
            if (this.f100966a.m89760n()) {
                this.f100966a.mo22258a().m106892p().m42708a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    /* renamed from: N */
    public final boolean m92091N(String str, int i, String str2) {
        if (str2 == null) {
            this.f100966a.mo22258a().m106892p().m42707b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i) {
            this.f100966a.mo22258a().m106892p().m42705d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m92090O(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        Object obj2;
        Parcelable[] parcelableArr;
        int size;
        mo19953e();
        if (m92083V(obj)) {
            if (z2) {
                if (!m92068j0(str3, C48337ru8.f107888c)) {
                    return 20;
                }
                QM8 m89778L = this.f100966a.m89778L();
                m89778L.mo19953e();
                m89778L.m6551f();
                if (m89778L.m88544y() && m89778L.f100966a.m89776N().m92055q0() < 200900) {
                    return 25;
                }
                this.f100966a.m89751w();
                boolean z3 = obj instanceof Parcelable[];
                if (z3) {
                    size = ((Parcelable[]) obj).length;
                } else if (obj instanceof ArrayList) {
                    size = ((ArrayList) obj).size();
                }
                if (size > 200) {
                    this.f100966a.mo22258a().m106887u().m42705d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                    this.f100966a.m89751w();
                    if (z3) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        if (parcelableArr2.length > 200) {
                            bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr2, (int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION));
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        if (arrayList.size() > 200) {
                            bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION)));
                        }
                    }
                    i = 17;
                    if (m92080Y(str2) && !m92080Y(str3)) {
                        this.f100966a.m89751w();
                        i2 = 100;
                    } else {
                        this.f100966a.m89751w();
                        i2 = 256;
                    }
                    if (!m92088Q("param", str3, i2, obj)) {
                        return i;
                    }
                    if (z2) {
                        if (obj instanceof Bundle) {
                            m92093L(str, str2, str3, (Bundle) obj, list, z);
                        } else if (obj instanceof Parcelable[]) {
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (!(parcelable instanceof Bundle)) {
                                    this.f100966a.mo22258a().m106887u().m42706c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                                    return 4;
                                }
                                m92093L(str, str2, str3, (Bundle) parcelable, list, z);
                            }
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList2 = (ArrayList) obj;
                            int size2 = arrayList2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                Object obj3 = arrayList2.get(i3);
                                if (!(obj3 instanceof Bundle)) {
                                    C40448ec8 m106887u = this.f100966a.mo22258a().m106887u();
                                    if (obj3 != null) {
                                        obj2 = obj3.getClass();
                                    } else {
                                        obj2 = "null";
                                    }
                                    m106887u.m42706c("All ArrayList elements must be of type Bundle. Value type, name", obj2, str3);
                                    return 4;
                                }
                                m92093L(str, str2, str3, (Bundle) obj3, list, z);
                            }
                        } else {
                            return 4;
                        }
                        return i;
                    }
                    return 4;
                }
            } else {
                return 21;
            }
        }
        i = 0;
        if (m92080Y(str2)) {
        }
        this.f100966a.m89751w();
        i2 = 256;
        if (!m92088Q("param", str3, i2, obj)) {
        }
    }

    /* renamed from: P */
    public final boolean m92089P(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f100966a.mo22258a().m106892p().m42707b("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = f26727g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f100966a.mo22258a().m106892p().m42706c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null && m92068j0(str2, strArr)) {
            if (strArr2 == null || !m92068j0(str2, strArr2)) {
                this.f100966a.mo22258a().m106892p().m42706c("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: Q */
    public final boolean m92088Q(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f100966a.mo22258a().m106887u().m42705d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: R */
    public final boolean m92087R(String str, String str2) {
        if (str2 == null) {
            this.f100966a.mo22258a().m106892p().m42707b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f100966a.mo22258a().m106892p().m42707b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f100966a.mo22258a().m106892p().m42706c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f100966a.mo22258a().m106892p().m42706c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* renamed from: S */
    public final boolean m92086S(String str, String str2) {
        if (str2 == null) {
            this.f100966a.mo22258a().m106892p().m42707b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f100966a.mo22258a().m106892p().m42707b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f100966a.mo22258a().m106892p().m42706c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f100966a.mo22258a().m106892p().m42706c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* renamed from: T */
    public final boolean m92085T(String str) {
        mo19953e();
        if (Wrappers.packageManager(this.f100966a.mo22255z()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.f100966a.mo22258a().m106894n().m42707b("Permission not granted", str);
        return false;
    }

    /* renamed from: U */
    public final boolean m92084U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String m37509r = this.f100966a.m89751w().m37509r();
        this.f100966a.mo22259C();
        return m37509r.equals(str);
    }

    /* renamed from: V */
    public final boolean m92083V(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    @VisibleForTesting
    /* renamed from: W */
    public final boolean m92082W(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            this.f100966a.mo22258a().m106893o().m42707b("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            this.f100966a.mo22258a().m106893o().m42707b("Error obtaining certificate", e2);
            return true;
        }
    }

    /* renamed from: X */
    public final boolean m92081X(int i, boolean z) {
        Boolean m88571J = this.f100966a.m89778L().m88571J();
        if (m92055q0() >= i / 1000) {
            return true;
        }
        if (m88571J != null && !m88571J.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    public final boolean m92075d0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (!TextUtils.isEmpty(str4)) {
                return true;
            } else {
                return false;
            }
        } else if (!isEmpty) {
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        } else if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e0 */
    public final byte[] m92074e0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // p000.AbstractC32017Bs8
    /* renamed from: f */
    public final void mo92073f() {
        mo19953e();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f100966a.mo22258a().m106888t().m42708a("Utils falling back to Random for random id");
            }
        }
        this.f26730d.set(nextLong);
    }

    @Override // p000.AbstractC32017Bs8
    /* renamed from: g */
    public final boolean mo43707g() {
        return true;
    }

    /* renamed from: h0 */
    public final int m92070h0(String str) {
        if ("_ldl".equals(str)) {
            this.f100966a.m89751w();
            return 2048;
        } else if (TransferTable.COLUMN_ID.equals(str)) {
            this.f100966a.m89751w();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f100966a.m89751w();
            return 100;
        } else {
            this.f100966a.m89751w();
            return 36;
        }
    }

    /* renamed from: i0 */
    public final Object m92069i0(int i, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        long j;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                if (true != ((Boolean) obj).booleanValue()) {
                    j = 0;
                } else {
                    j = 1;
                }
                return Long.valueOf(j);
            } else if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            } else {
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (parcelable instanceof Bundle) {
                            Bundle m92043w0 = m92043w0((Bundle) parcelable);
                            if (!m92043w0.isEmpty()) {
                                arrayList.add(m92043w0);
                            }
                        }
                    }
                    return arrayList.toArray(new Bundle[arrayList.size()]);
                }
                return m92060o(obj.toString(), i, z);
            }
        }
        return obj;
    }

    /* renamed from: l */
    public final Object m92066l(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f100966a.m89751w();
            return m92069i0(256, obj, true, true);
        }
        if (m92080Y(str)) {
            this.f100966a.m89751w();
        } else {
            this.f100966a.m89751w();
            i = 100;
        }
        return m92069i0(i, obj, false, true);
    }

    /* renamed from: l0 */
    public final int m92065l0(String str, Object obj) {
        boolean m92088Q;
        if ("_ldl".equals(str)) {
            m92088Q = m92088Q("user property referrer", str, m92070h0(str), obj);
        } else {
            m92088Q = m92088Q("user property", str, m92070h0(str), obj);
        }
        if (m92088Q) {
            return 0;
        }
        return 7;
    }

    /* renamed from: m */
    public final Object m92064m(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m92069i0(m92070h0(str), obj, true, false);
        }
        return m92069i0(m92070h0(str), obj, false, false);
    }

    /* renamed from: m0 */
    public final int m92063m0(String str) {
        if (!m92087R("event", str)) {
            return 2;
        }
        if (!m92089P("event", C40628eu8.f79110a, C40628eu8.f79111b, str)) {
            return 13;
        }
        this.f100966a.m89751w();
        if (!m92091N("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: n */
    public final String m92062n() {
        byte[] bArr = new byte[16];
        m92054r().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: n0 */
    public final int m92061n0(String str) {
        if (!m92087R("event param", str)) {
            return 3;
        }
        if (!m92089P("event param", null, null, str)) {
            return 14;
        }
        this.f100966a.m89751w();
        if (!m92091N("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: o */
    public final String m92060o(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i) {
            if (!z) {
                return null;
            }
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return str;
    }

    /* renamed from: o0 */
    public final int m92059o0(String str) {
        if (!m92086S("event param", str)) {
            return 3;
        }
        if (!m92089P("event param", null, null, str)) {
            return 14;
        }
        this.f100966a.m89751w();
        if (!m92091N("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: p */
    public final URL m92058p(long j, String str, String str2, long j2) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 77000L, Integer.valueOf(m92055q0())), str2, str, Long.valueOf(j2));
            if (str.equals(this.f100966a.m89751w().m37508s())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f100966a.mo22258a().m106893o().m42707b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: p0 */
    public final int m92057p0(String str) {
        if (!m92087R("user property", str)) {
            return 6;
        }
        if (!m92089P("user property", C32971Fu8.f10510a, null, str)) {
            return 15;
        }
        this.f100966a.m89751w();
        if (!m92091N("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* renamed from: q0 */
    public final int m92055q0() {
        if (this.f26732f == null) {
            this.f26732f = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f100966a.mo22255z()) / 1000);
        }
        return this.f26732f.intValue();
    }

    /* renamed from: r */
    public final SecureRandom m92054r() {
        mo19953e();
        if (this.f26729c == null) {
            this.f26729c = new SecureRandom();
        }
        return this.f26729c;
    }

    /* renamed from: r0 */
    public final int m92053r0(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.f100966a.mo22255z(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* renamed from: t */
    public final void m92050t(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f100966a.mo22258a().m106888t().m42707b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: t0 */
    public final long m92049t0() {
        long andIncrement;
        long j;
        if (this.f26730d.get() == 0) {
            synchronized (this.f26730d) {
                long nextLong = new Random(System.nanoTime() ^ this.f100966a.mo22260A().currentTimeMillis()).nextLong();
                int i = this.f26731e + 1;
                this.f26731e = i;
                j = nextLong + i;
            }
            return j;
        }
        synchronized (this.f26730d) {
            this.f26730d.compareAndSet(-1L, 1L);
            andIncrement = this.f26730d.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: u */
    public final void m92048u(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m92072f0(bundle, i)) {
            this.f100966a.m89751w();
            bundle.putString("_ev", m92060o(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* renamed from: u0 */
    public final long m92047u0(long j, long j2) {
        return (j + (j2 * 60000)) / CoreConstants.MILLIS_IN_ONE_DAY;
    }

    /* renamed from: v0 */
    public final Bundle m92045v0(Uri uri, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("utm_id");
                str6 = uri.getQueryParameter("dclid");
                str7 = uri.getQueryParameter("srsltid");
                if (z) {
                    str8 = uri.getQueryParameter("sfmc_id");
                } else {
                    str8 = null;
                }
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && (!z || TextUtils.isEmpty(str8))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(Stripe3ds2AuthParams.FIELD_SOURCE, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("campaign_id", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("dclid", str6);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("srsltid", str7);
            }
            if (z && !TextUtils.isEmpty(str8)) {
                bundle.putString("sfmc_id", str8);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            this.f100966a.mo22258a().m106888t().m42707b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* renamed from: w */
    public final void m92044w(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f100966a.m89776N().m92101D(bundle, str, bundle2.get(str));
            }
        }
    }

    /* renamed from: w0 */
    public final Bundle m92043w0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m92066l = m92066l(str, bundle.get(str));
                if (m92066l == null) {
                    this.f100966a.mo22258a().m106887u().m42707b("Param value can't be null", this.f100966a.m89786D().m17331e(str));
                } else {
                    m92101D(bundle2, str, m92066l);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: x */
    public final void m92042x(Parcelable[] parcelableArr, int i, boolean z) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m92079Z(str) && !m92068j0(str, C48337ru8.f107889d) && (i2 = i2 + 1) > i) {
                    if (z) {
                        this.f100966a.mo22258a().m106892p().m42706c("Param can't contain more than " + i + " item-scoped custom parameters", this.f100966a.m89786D().m17331e(str), this.f100966a.m89786D().m17334b(bundle));
                        m92072f0(bundle, 28);
                    } else {
                        this.f100966a.mo22258a().m106892p().m42706c("Param cannot contain item-scoped custom parameters", this.f100966a.m89786D().m17331e(str), this.f100966a.m89786D().m17334b(bundle));
                        m92072f0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108 A[SYNTHETIC] */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle m92041x0(String str, String str2, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        int i3;
        String str3;
        String str4;
        String str5;
        boolean m92068j0 = m92068j0(str2, C40628eu8.f79113d);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            int m37517j = this.f100966a.m89751w().m37517j();
            int i4 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list != null && list.contains(str6)) {
                    i2 = 0;
                } else {
                    if (!z) {
                        i = m92059o0(str6);
                    } else {
                        i = 0;
                    }
                    if (i == 0) {
                        i = m92061n0(str6);
                    }
                    i2 = i;
                }
                if (i2 != 0) {
                    if (i2 == 3) {
                        str5 = str6;
                    } else {
                        str5 = null;
                    }
                    m92048u(bundle2, i2, str6, str6, str5);
                    bundle2.remove(str6);
                    i3 = m37517j;
                } else {
                    i3 = m37517j;
                    int m92090O = m92090O(str, str2, str6, bundle.get(str6), bundle2, list, z, m92068j0);
                    if (m92090O == 17) {
                        m92048u(bundle2, 17, str6, str6, Boolean.FALSE);
                    } else if (m92090O != 0) {
                        str3 = str6;
                        if (!"_ev".equals(str3)) {
                            if (m92090O == 21) {
                                str4 = str2;
                            } else {
                                str4 = str3;
                            }
                            m92048u(bundle2, m92090O, str4, str3, bundle.get(str3));
                            bundle2.remove(str3);
                        }
                        if (m92079Z(str3)) {
                            int i5 = i4 + 1;
                            if (i5 > i3) {
                                this.f100966a.mo22258a().m106892p().m42706c("Event can't contain more than " + i3 + " params", this.f100966a.m89786D().m17332d(str2), this.f100966a.m89786D().m17334b(bundle));
                                m92072f0(bundle2, 5);
                                bundle2.remove(str3);
                            }
                            i4 = i5;
                        }
                    }
                    str3 = str6;
                    if (m92079Z(str3)) {
                    }
                }
                m37517j = i3;
            }
            return bundle2;
        }
        return null;
    }

    /* renamed from: y */
    public final void m92040y(C36319Uc8 c36319Uc8, int i) {
        int i2 = 0;
        for (String str : new TreeSet(c36319Uc8.f37693d.keySet())) {
            if (m92079Z(str) && (i2 = i2 + 1) > i) {
                this.f100966a.mo22258a().m106892p().m42706c("Event can't contain more than " + i + " params", this.f100966a.m89786D().m17332d(c36319Uc8.f37690a), this.f100966a.m89786D().m17334b(c36319Uc8.f37693d));
                m92072f0(c36319Uc8.f37693d, 5);
                c36319Uc8.f37693d.remove(str);
            }
        }
    }

    /* renamed from: y0 */
    public final zzaw m92039y0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m92063m0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle m92041x0 = m92041x0(str, str2, bundle3, CollectionUtils.listOf("_o"), true);
            if (z) {
                m92041x0 = m92043w0(m92041x0);
            }
            Preconditions.checkNotNull(m92041x0);
            return new zzaw(str2, new zzau(m92041x0), str3, j);
        }
        this.f100966a.mo22258a().m106893o().m42707b("Invalid conditional property event name", this.f100966a.m89786D().m17330f(str2));
        throw new IllegalArgumentException();
    }
}
