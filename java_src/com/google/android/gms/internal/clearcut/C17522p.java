package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.clearcut.C17477a;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.clearcut.C17517n;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: com.google.android.gms.internal.clearcut.p */
/* loaded from: classes5.dex */
public final class C17522p implements C17477a.InterfaceC17479b {

    /* renamed from: b */
    public static final Charset f70488b = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: c */
    public static final C41200fs7 f70489c;

    /* renamed from: d */
    public static final C41200fs7 f70490d;

    /* renamed from: e */
    public static final ConcurrentHashMap<String, AbstractC48818sj7<C17517n>> f70491e;

    /* renamed from: f */
    public static final HashMap<String, AbstractC48818sj7<String>> f70492f;
    @VisibleForTesting

    /* renamed from: g */
    public static Boolean f70493g;
    @VisibleForTesting

    /* renamed from: h */
    public static Long f70494h;
    @VisibleForTesting

    /* renamed from: i */
    public static final AbstractC48818sj7<Boolean> f70495i;

    /* renamed from: a */
    public final Context f70496a;

    static {
        C41200fs7 m40606i = new C41200fs7(C43909kS3.m28954a("com.google.android.gms.clearcut.public")).m40608g("gms:playlog:service:samplingrules_").m40606i("LogSamplingRules__");
        f70489c = m40606i;
        f70490d = new C41200fs7(C43909kS3.m28954a("com.google.android.gms.clearcut.public")).m40608g("gms:playlog:service:sampling_").m40606i("LogSampling__");
        f70491e = new ConcurrentHashMap<>();
        f70492f = new HashMap<>();
        f70493g = null;
        f70494h = null;
        f70495i = m40606i.m40609f("enable_log_sampling_rules", false);
    }

    public C17522p(Context context) {
        this.f70496a = context;
        if (context != null) {
            AbstractC48818sj7.m13761b(context);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    public static long m51453b(String str, long j) {
        if (str == null || str.isEmpty()) {
            return ON8.m92354c(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(f70488b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return ON8.m92354c(allocate.array());
    }

    @VisibleForTesting
    /* renamed from: c */
    public static C17517n.C17519b m51452c(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        int i = 0;
        if (indexOf >= 0) {
            i = indexOf + 1;
            str2 = str.substring(0, indexOf);
        } else {
            str2 = "";
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            Log.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong < 0 || parseLong2 < 0) {
                StringBuilder sb = new StringBuilder(72);
                sb.append("negative values not supported: ");
                sb.append(parseLong);
                sb.append("/");
                sb.append(parseLong2);
                Log.e("LogSamplerImpl", sb.toString());
                return null;
            }
            return C17517n.C17519b.m51459y().m51457q(str2).m51456r(parseLong).m51455t(parseLong2).m51546p();
        } catch (NumberFormatException e) {
            Log.e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e);
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    public static boolean m51451d(long j, long j2, long j3) {
        if (j2 < 0 || j3 <= 0) {
            return true;
        }
        return ((j > 0L ? 1 : (j == 0L ? 0 : -1)) >= 0 ? j % j3 : (((LongCompanionObject.MAX_VALUE % j3) + 1) + ((j & LongCompanionObject.MAX_VALUE) % j3)) % j3) < j2;
    }

    /* renamed from: e */
    public static boolean m51450e(Context context) {
        if (f70493g == null) {
            f70493g = Boolean.valueOf(Wrappers.packageManager(context).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f70493g.booleanValue();
    }

    @VisibleForTesting
    /* renamed from: f */
    public static long m51449f(Context context) {
        if (f70494h == null) {
            if (context == null) {
                return 0L;
            }
            f70494h = Long.valueOf(m51450e(context) ? Fx9.m106160a(context.getContentResolver(), "android_id", 0L) : 0L);
        }
        return f70494h.longValue();
    }

    @Override // com.google.android.gms.clearcut.C17477a.InterfaceC17479b
    /* renamed from: a */
    public final boolean mo51454a(zze zzeVar) {
        List<C17517n.C17519b> m51475p;
        AbstractC48818sj7<C17517n> putIfAbsent;
        zzr zzrVar = zzeVar.f70326b;
        String str = zzrVar.f70524h;
        int i = zzrVar.f70520d;
        C35536Qt8 c35536Qt8 = zzeVar.f70334j;
        int i2 = c35536Qt8 != null ? c35536Qt8.f31148h : 0;
        String str2 = null;
        if (!f70495i.m13762a().booleanValue()) {
            if (str == null || str.isEmpty()) {
                str = i >= 0 ? String.valueOf(i) : null;
            }
            if (str != null) {
                Context context = this.f70496a;
                if (context != null && m51450e(context)) {
                    HashMap<String, AbstractC48818sj7<String>> hashMap = f70492f;
                    AbstractC48818sj7<String> abstractC48818sj7 = hashMap.get(str);
                    if (abstractC48818sj7 == null) {
                        abstractC48818sj7 = f70490d.m40612c(str, null);
                        hashMap.put(str, abstractC48818sj7);
                    }
                    str2 = abstractC48818sj7.m13762a();
                }
                C17517n.C17519b m51452c = m51452c(str2);
                if (m51452c != null) {
                    return m51451d(m51453b(m51452c.m51462u(), m51449f(this.f70496a)), m51452c.m51461w(), m51452c.m51460x());
                }
                return true;
            }
            return true;
        }
        if (str == null || str.isEmpty()) {
            str = i >= 0 ? String.valueOf(i) : null;
        }
        if (str != null) {
            if (this.f70496a == null) {
                m51475p = Collections.emptyList();
            } else {
                ConcurrentHashMap<String, AbstractC48818sj7<C17517n>> concurrentHashMap = f70491e;
                AbstractC48818sj7<C17517n> abstractC48818sj72 = concurrentHashMap.get(str);
                if (abstractC48818sj72 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (abstractC48818sj72 = f70489c.m40613b(str, C17517n.m51474q(), Qh9.f30767a)))) != null) {
                    abstractC48818sj72 = putIfAbsent;
                }
                m51475p = abstractC48818sj72.m13762a().m51475p();
            }
            for (C17517n.C17519b c17519b : m51475p) {
                if (!c17519b.m51463t() || c17519b.m51467p() == 0 || c17519b.m51467p() == i2) {
                    if (!m51451d(m51453b(c17519b.m51462u(), m51449f(this.f70496a)), c17519b.m51461w(), c17519b.m51460x())) {
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }
}
