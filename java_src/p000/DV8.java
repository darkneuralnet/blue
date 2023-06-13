package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
/* renamed from: DV8 */
/* loaded from: classes6.dex */
public final class DV8 extends TR8 {
    public DV8(C42162hV8 c42162hV8) {
        super(c42162hV8);
    }

    /* renamed from: B */
    public static InterfaceC41884h19 m110342B(InterfaceC41884h19 interfaceC41884h19, byte[] bArr) throws zzll {
        TQ8 m83663a = TQ8.m83663a();
        if (m83663a != null) {
            return interfaceC41884h19.mo36898L(bArr, m83663a);
        }
        return interfaceC41884h19.mo36896p2(bArr);
    }

    /* renamed from: H */
    public static List m110337H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: L */
    public static boolean m110333L(List list, int i) {
        if (i < list.size() * 64) {
            if (((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m110331N(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public static final void m110329P(C39936dk8 c39936dk8, String str, Object obj) {
        List m43793S = c39936dk8.m43793S();
        int i = 0;
        while (true) {
            if (i < m43793S.size()) {
                if (str.equals(((C47061pl8) m43793S.get(i)).m18780H())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        C39946dl8 m18782F = C47061pl8.m18782F();
        m18782F.m43763J(str);
        if (obj instanceof Long) {
            m18782F.m43764I(((Long) obj).longValue());
        }
        if (i >= 0) {
            c39936dk8.m43799J(i, m18782F);
        } else {
            c39936dk8.m43804C(m18782F);
        }
    }

    /* renamed from: j */
    public static final boolean m110328j(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotNull(zzqVar);
        if (TextUtils.isEmpty(zzqVar.f71542c) && TextUtils.isEmpty(zzqVar.f71557r)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static final C47061pl8 m110327k(C47051pk8 c47051pk8, String str) {
        for (C47061pl8 c47061pl8 : c47051pk8.m18857J()) {
            if (c47061pl8.m18780H().equals(str)) {
                return c47061pl8;
            }
        }
        return null;
    }

    /* renamed from: l */
    public static final Object m110326l(C47051pk8 c47051pk8, String str) {
        C47061pl8 m110327k = m110327k(c47051pk8, str);
        if (m110327k != null) {
            if (m110327k.m18763Z()) {
                return m110327k.m18779I();
            }
            if (m110327k.m18765X()) {
                return Long.valueOf(m110327k.m18783E());
            }
            if (m110327k.m18767V()) {
                return Double.valueOf(m110327k.m18786B());
            }
            if (m110327k.m18784D() > 0) {
                List<C47061pl8> m18778J = m110327k.m18778J();
                ArrayList arrayList = new ArrayList();
                for (C47061pl8 c47061pl8 : m18778J) {
                    if (c47061pl8 != null) {
                        Bundle bundle = new Bundle();
                        for (C47061pl8 c47061pl82 : c47061pl8.m18778J()) {
                            if (c47061pl82.m18763Z()) {
                                bundle.putString(c47061pl82.m18780H(), c47061pl82.m18779I());
                            } else if (c47061pl82.m18765X()) {
                                bundle.putLong(c47061pl82.m18780H(), c47061pl82.m18783E());
                            } else if (c47061pl82.m18767V()) {
                                bundle.putDouble(c47061pl82.m18780H(), c47061pl82.m18786B());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    /* renamed from: o */
    public static final void m110323o(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: p */
    public static final String m110322p(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: q */
    public static final void m110321q(StringBuilder sb, int i, String str, C34789No8 c34789No8) {
        Integer num;
        Integer num2;
        Long l;
        if (c34789No8 == null) {
            return;
        }
        m110323o(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c34789No8.m93385C() != 0) {
            m110323o(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l2 : c34789No8.m93378J()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (c34789No8.m93383E() != 0) {
            m110323o(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l3 : c34789No8.m93376M()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (c34789No8.m93386B() != 0) {
            m110323o(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (C35446Qj8 c35446Qj8 : c34789No8.m93379I()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                if (c35446Qj8.m88110I()) {
                    num2 = Integer.valueOf(c35446Qj8.m88117B());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (c35446Qj8.m88111H()) {
                    l = Long.valueOf(c35446Qj8.m88116C());
                } else {
                    l = null;
                }
                sb.append(l);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (c34789No8.m93384D() != 0) {
            m110323o(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (C45322mp8 c45322mp8 : c34789No8.m93377K()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                if (c45322mp8.m24872J()) {
                    num = Integer.valueOf(c45322mp8.m24879C());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                int i10 = 0;
                for (Long l4 : c45322mp8.m24875G()) {
                    long longValue = l4.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        m110323o(sb, 3);
        sb.append("}\n");
    }

    /* renamed from: r */
    public static final void m110320r(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m110323o(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* renamed from: s */
    public static final void m110319s(StringBuilder sb, int i, String str, C36544Vb8 c36544Vb8) {
        String str2;
        if (c36544Vb8 == null) {
            return;
        }
        m110323o(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (c36544Vb8.m79672H()) {
            int m79667N = c36544Vb8.m79667N();
            if (m79667N != 1) {
                if (m79667N != 2) {
                    if (m79667N != 3) {
                        if (m79667N != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            m110320r(sb, i, "comparison_type", str2);
        }
        if (c36544Vb8.m79670J()) {
            m110320r(sb, i, "match_as_float", Boolean.valueOf(c36544Vb8.m79673G()));
        }
        if (c36544Vb8.m79671I()) {
            m110320r(sb, i, "comparison_value", c36544Vb8.m79676D());
        }
        if (c36544Vb8.m79668M()) {
            m110320r(sb, i, "min_comparison_value", c36544Vb8.m79674F());
        }
        if (c36544Vb8.m79669K()) {
            m110320r(sb, i, "max_comparison_value", c36544Vb8.m79675E());
        }
        m110323o(sb, i);
        sb.append("}\n");
    }

    /* renamed from: t */
    public static int m110318t(C47674qn8 c47674qn8, String str) {
        for (int i = 0; i < c47674qn8.m17038F0(); i++) {
            if (str.equals(c47674qn8.m16977x0(i).m98254G())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: D */
    public final String m110341D(C41151fn8 c41151fn8) {
        Long l;
        Long l2;
        Double d;
        if (c41151fn8 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C32206Cn8 c32206Cn8 : c41151fn8.m40813E()) {
            if (c32206Cn8 != null) {
                m110323o(sb, 1);
                sb.append("bundle {\n");
                if (c32206Cn8.m111575r1()) {
                    m110320r(sb, 1, "protocol_version", Integer.valueOf(c32206Cn8.m111679B1()));
                }
                C49423tk9.m11813b();
                if (this.f100966a.m89751w().m37502y(c32206Cn8.m111618W1(), C37795a98.f49992q0) && c32206Cn8.m111569u1()) {
                    m110320r(sb, 1, "session_stitching_token", c32206Cn8.m111646N());
                }
                m110320r(sb, 1, "platform", c32206Cn8.m111654K());
                if (c32206Cn8.m111583n1()) {
                    m110320r(sb, 1, "gmp_version", Long.valueOf(c32206Cn8.m111655J1()));
                }
                if (c32206Cn8.m111559z1()) {
                    m110320r(sb, 1, "uploading_gmp_version", Long.valueOf(c32206Cn8.m111638P1()));
                }
                if (c32206Cn8.m111587l1()) {
                    m110320r(sb, 1, "dynamite_version", Long.valueOf(c32206Cn8.m111661H1()));
                }
                if (c32206Cn8.m111593i1()) {
                    m110320r(sb, 1, "config_version", Long.valueOf(c32206Cn8.m111667F1()));
                }
                m110320r(sb, 1, "gmp_app_id", c32206Cn8.m111663H());
                m110320r(sb, 1, "admob_app_id", c32206Cn8.m111621V1());
                m110320r(sb, 1, PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, c32206Cn8.m111618W1());
                m110320r(sb, 1, AnalyticsFields.APP_VERSION, c32206Cn8.m111678C());
                if (c32206Cn8.m111597g1()) {
                    m110320r(sb, 1, "app_version_major", Integer.valueOf(c32206Cn8.m111606c0()));
                }
                m110320r(sb, 1, "firebase_instance_id", c32206Cn8.m111666G());
                if (c32206Cn8.m111589k1()) {
                    m110320r(sb, 1, "dev_cert_hash", Long.valueOf(c32206Cn8.m111664G1()));
                }
                m110320r(sb, 1, "app_store", c32206Cn8.m111681B());
                if (c32206Cn8.m111561y1()) {
                    m110320r(sb, 1, "upload_timestamp_millis", Long.valueOf(c32206Cn8.m111641O1()));
                }
                if (c32206Cn8.m111567v1()) {
                    m110320r(sb, 1, "start_timestamp_millis", Long.valueOf(c32206Cn8.m111647M1()));
                }
                if (c32206Cn8.m111585m1()) {
                    m110320r(sb, 1, "end_timestamp_millis", Long.valueOf(c32206Cn8.m111658I1()));
                }
                if (c32206Cn8.m111577q1()) {
                    m110320r(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c32206Cn8.m111650L1()));
                }
                if (c32206Cn8.m111579p1()) {
                    m110320r(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c32206Cn8.m111652K1()));
                }
                m110320r(sb, 1, "app_instance_id", c32206Cn8.m111615X1());
                m110320r(sb, 1, "resettable_device_id", c32206Cn8.m111649M());
                m110320r(sb, 1, "ds_id", c32206Cn8.m111669F());
                if (c32206Cn8.m111581o1()) {
                    m110320r(sb, 1, "limited_ad_tracking", Boolean.valueOf(c32206Cn8.m111680B0()));
                }
                m110320r(sb, 1, AnalyticsFields.OS_VERSION, c32206Cn8.m111657J());
                m110320r(sb, 1, "device_model", c32206Cn8.m111672E());
                m110320r(sb, 1, "user_default_language", c32206Cn8.m111643O());
                if (c32206Cn8.m111563x1()) {
                    m110320r(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c32206Cn8.m111673D1()));
                }
                if (c32206Cn8.m111595h1()) {
                    m110320r(sb, 1, "bundle_sequential_index", Integer.valueOf(c32206Cn8.m111603d1()));
                }
                if (c32206Cn8.m111571t1()) {
                    m110320r(sb, 1, "service_upload", Boolean.valueOf(c32206Cn8.m111677C0()));
                }
                m110320r(sb, 1, "health_monitor", c32206Cn8.m111660I());
                if (c32206Cn8.m111573s1()) {
                    m110320r(sb, 1, "retry_counter", Integer.valueOf(c32206Cn8.m111676C1()));
                }
                if (c32206Cn8.m111591j1()) {
                    m110320r(sb, 1, "consent_signals", c32206Cn8.m111675D());
                }
                Yg9.m74465b();
                if (this.f100966a.m89751w().m37502y(null, C37795a98.f49936G0) && c32206Cn8.m111565w1()) {
                    m110320r(sb, 1, "target_os_version", Long.valueOf(c32206Cn8.m111644N1()));
                }
                List<C34096Kp8> m111634R = c32206Cn8.m111634R();
                if (m111634R != null) {
                    for (C34096Kp8 c34096Kp8 : m111634R) {
                        if (c34096Kp8 != null) {
                            m110323o(sb, 2);
                            sb.append("user_property {\n");
                            if (c34096Kp8.m98242T()) {
                                l = Long.valueOf(c34096Kp8.m98257D());
                            } else {
                                l = null;
                            }
                            m110320r(sb, 2, "set_timestamp_millis", l);
                            m110320r(sb, 2, "name", this.f100966a.m89786D().m17330f(c34096Kp8.m98254G()));
                            m110320r(sb, 2, "string_value", c34096Kp8.m98253H());
                            if (c34096Kp8.m98243S()) {
                                l2 = Long.valueOf(c34096Kp8.m98258C());
                            } else {
                                l2 = null;
                            }
                            m110320r(sb, 2, "int_value", l2);
                            if (c34096Kp8.m98244R()) {
                                d = Double.valueOf(c34096Kp8.m98259B());
                            } else {
                                d = null;
                            }
                            m110320r(sb, 2, "double_value", d);
                            m110323o(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C47041pj8> m111640P = c32206Cn8.m111640P();
                if (m111640P != null) {
                    for (C47041pj8 c47041pj8 : m111640P) {
                        if (c47041pj8 != null) {
                            m110323o(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c47041pj8.m18880M()) {
                                m110320r(sb, 2, "audience_id", Integer.valueOf(c47041pj8.m18890B()));
                            }
                            if (c47041pj8.m18879N()) {
                                m110320r(sb, 2, "new_audience", Boolean.valueOf(c47041pj8.m18881K()));
                            }
                            m110321q(sb, 2, "current_data", c47041pj8.m18887E());
                            if (c47041pj8.m18878O()) {
                                m110321q(sb, 2, "previous_data", c47041pj8.m18886F());
                            }
                            m110323o(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C47051pk8> m111637Q = c32206Cn8.m111637Q();
                if (m111637Q != null) {
                    for (C47051pk8 c47051pk8 : m111637Q) {
                        if (c47051pk8 != null) {
                            m110323o(sb, 2);
                            sb.append("event {\n");
                            m110320r(sb, 2, "name", this.f100966a.m89786D().m17332d(c47051pk8.m18858I()));
                            if (c47051pk8.m18846V()) {
                                m110320r(sb, 2, "timestamp_millis", Long.valueOf(c47051pk8.m18862E()));
                            }
                            if (c47051pk8.m18847U()) {
                                m110320r(sb, 2, "previous_timestamp_millis", Long.valueOf(c47051pk8.m18863D()));
                            }
                            if (c47051pk8.m18848T()) {
                                m110320r(sb, 2, "count", Integer.valueOf(c47051pk8.m18865B()));
                            }
                            if (c47051pk8.m18864C() != 0) {
                                m110325m(sb, 2, c47051pk8.m18857J());
                            }
                            m110323o(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m110323o(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: E */
    public final String m110340E(Y98 y98) {
        if (y98 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (y98.m75480Q()) {
            m110320r(sb, 0, "filter_id", Integer.valueOf(y98.m75493C()));
        }
        m110320r(sb, 0, AnalyticsRequestV2.PARAM_EVENT_NAME, this.f100966a.m89786D().m17332d(y98.m75488H()));
        String m110322p = m110322p(y98.m75484M(), y98.m75483N(), y98.m75482O());
        if (!m110322p.isEmpty()) {
            m110320r(sb, 0, "filter_type", m110322p);
        }
        if (y98.m75481P()) {
            m110319s(sb, 1, "event_count_filter", y98.m75489G());
        }
        if (y98.m75494B() > 0) {
            sb.append("  filters {\n");
            for (C32323Da8 c32323Da8 : y98.m75487I()) {
                m110324n(sb, 2, c32323Da8);
            }
        }
        m110323o(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* renamed from: F */
    public final String m110339F(C50527vc8 c50527vc8) {
        if (c50527vc8 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c50527vc8.m8340K()) {
            m110320r(sb, 0, "filter_id", Integer.valueOf(c50527vc8.m8349B()));
        }
        m110320r(sb, 0, "property_name", this.f100966a.m89786D().m17330f(c50527vc8.m8345F()));
        String m110322p = m110322p(c50527vc8.m8343H(), c50527vc8.m8342I(), c50527vc8.m8341J());
        if (!m110322p.isEmpty()) {
            m110320r(sb, 0, "filter_type", m110322p);
        }
        m110324n(sb, 1, c50527vc8.m8348C());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: G */
    public final List m110338G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f100966a.mo22258a().m106888t().m42707b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f100966a.mo22258a().m106888t().m42706c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(m110336I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        r5.add(m110336I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r5.add(m110336I((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0.put(r2, r5);
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map m110336I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (!z2 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: J */
    public final void m110335J(C39946dl8 c39946dl8, Object obj) {
        Bundle[] bundleArr;
        Preconditions.checkNotNull(obj);
        c39946dl8.m43766G();
        c39946dl8.m43768C();
        c39946dl8.m43769B();
        c39946dl8.m43767D();
        if (obj instanceof String) {
            c39946dl8.m43762M((String) obj);
        } else if (obj instanceof Long) {
            c39946dl8.m43764I(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c39946dl8.m43765H(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C39946dl8 m18782F = C47061pl8.m18782F();
                    for (String str : bundle.keySet()) {
                        C39946dl8 m18782F2 = C47061pl8.m18782F();
                        m18782F2.m43763J(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            m18782F2.m43764I(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            m18782F2.m43762M((String) obj2);
                        } else if (obj2 instanceof Double) {
                            m18782F2.m43765H(((Double) obj2).doubleValue());
                        }
                        m18782F.m43770A(m18782F2);
                    }
                    if (m18782F.m43761y() > 0) {
                        arrayList.add((C47061pl8) m18782F.m81476q());
                    }
                }
            }
            c39946dl8.m43760z(arrayList);
        } else {
            this.f100966a.mo22258a().m106893o().m42707b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: K */
    public final void m110334K(C52436yp8 c52436yp8, Object obj) {
        Preconditions.checkNotNull(obj);
        c52436yp8.m2518A();
        c52436yp8.m2511z();
        c52436yp8.m2512y();
        if (obj instanceof String) {
            c52436yp8.m2513H((String) obj);
        } else if (obj instanceof Long) {
            c52436yp8.m2516C(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c52436yp8.m2517B(((Double) obj).doubleValue());
        } else {
            this.f100966a.mo22258a().m106893o().m42707b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: M */
    public final boolean m110332M(long j, long j2) {
        if (j != 0 && j2 > 0 && Math.abs(this.f100966a.mo22260A().currentTimeMillis() - j) <= j2) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public final byte[] m110330O(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f100966a.mo22258a().m106893o().m42707b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // p000.TR8
    /* renamed from: i */
    public final boolean mo11655i() {
        return false;
    }

    /* renamed from: m */
    public final void m110325m(StringBuilder sb, int i, List list) {
        String str;
        String str2;
        Long l;
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C47061pl8 c47061pl8 = (C47061pl8) it.next();
            if (c47061pl8 != null) {
                m110323o(sb, i2);
                sb.append("param {\n");
                Double d = null;
                if (c47061pl8.m18764Y()) {
                    str = this.f100966a.m89786D().m17331e(c47061pl8.m18780H());
                } else {
                    str = null;
                }
                m110320r(sb, i2, "name", str);
                if (c47061pl8.m18763Z()) {
                    str2 = c47061pl8.m18779I();
                } else {
                    str2 = null;
                }
                m110320r(sb, i2, "string_value", str2);
                if (c47061pl8.m18765X()) {
                    l = Long.valueOf(c47061pl8.m18783E());
                } else {
                    l = null;
                }
                m110320r(sb, i2, "int_value", l);
                if (c47061pl8.m18767V()) {
                    d = Double.valueOf(c47061pl8.m18786B());
                }
                m110320r(sb, i2, "double_value", d);
                if (c47061pl8.m18784D() > 0) {
                    m110325m(sb, i2, c47061pl8.m18778J());
                }
                m110323o(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: n */
    public final void m110324n(StringBuilder sb, int i, C32323Da8 c32323Da8) {
        String str;
        if (c32323Da8 == null) {
            return;
        }
        m110323o(sb, i);
        sb.append("filter {\n");
        if (c32323Da8.m110138I()) {
            m110320r(sb, i, "complement", Boolean.valueOf(c32323Da8.m110139H()));
        }
        if (c32323Da8.m110136K()) {
            m110320r(sb, i, "param_name", this.f100966a.m89786D().m17331e(c32323Da8.m110141F()));
        }
        if (c32323Da8.m110135M()) {
            int i2 = i + 1;
            C33520Id8 m110142E = c32323Da8.m110142E();
            if (m110142E != null) {
                m110323o(sb, i2);
                sb.append("string_filter {\n");
                if (m110142E.m101855J()) {
                    switch (m110142E.m101854K()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m110320r(sb, i2, "match_type", str);
                }
                if (m110142E.m101856I()) {
                    m110320r(sb, i2, "expression", m110142E.m101860E());
                }
                if (m110142E.m101857H()) {
                    m110320r(sb, i2, "case_sensitive", Boolean.valueOf(m110142E.m101858G()));
                }
                if (m110142E.m101863B() > 0) {
                    m110323o(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : m110142E.m101859F()) {
                        m110323o(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m110323o(sb, i2);
                sb.append("}\n");
            }
        }
        if (c32323Da8.m110137J()) {
            m110319s(sb, i + 1, "number_filter", c32323Da8.m110143D());
        }
        m110323o(sb, i);
        sb.append("}\n");
    }

    /* renamed from: u */
    public final long m110317u(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.f100966a.m89776N().mo19953e();
        MessageDigest m92056q = OW8.m92056q();
        if (m92056q == null) {
            this.f100966a.mo22258a().m106893o().m42708a("Failed to get MD5");
            return 0L;
        }
        return OW8.m92051s0(m92056q.digest(bArr));
    }

    /* renamed from: v */
    public final Bundle m110316v(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(m110316v((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    /* renamed from: w */
    public final Parcelable m110315w(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.f100966a.mo22258a().m106893o().m42708a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: x */
    public final zzaw m110314x(C35175Pf7 c35175Pf7) {
        String str;
        Object obj;
        Bundle m110316v = m110316v(c35175Pf7.m89959e(), true);
        if (m110316v.containsKey("_o") && (obj = m110316v.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = Stripe3ds2AuthParams.FIELD_APP;
        }
        String str2 = str;
        String m42393b = C40628eu8.m42393b(c35175Pf7.m89960d());
        if (m42393b == null) {
            m42393b = c35175Pf7.m89960d();
        }
        return new zzaw(m42393b, new zzau(m110316v), str2, c35175Pf7.m89963a());
    }

    /* renamed from: y */
    public final C47051pk8 m110313y(C51892xu7 c51892xu7) {
        C39936dk8 m18861F = C47051pk8.m18861F();
        m18861F.m43797N(c51892xu7.f118332e);
        C40647ew7 c40647ew7 = new C40647ew7(c51892xu7.f118333f);
        while (c40647ew7.hasNext()) {
            String next = c40647ew7.next();
            C39946dl8 m18782F = C47061pl8.m18782F();
            m18782F.m43763J(next);
            Object m50586F = c51892xu7.f118333f.m50586F(next);
            Preconditions.checkNotNull(m50586F);
            m110335J(m18782F, m50586F);
            m18861F.m43804C(m18782F);
        }
        return (C47051pk8) m18861F.m81476q();
    }
}
