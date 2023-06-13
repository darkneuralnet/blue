package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzll;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2Factory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* renamed from: Ok8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34987Ok8 extends TR8 implements InterfaceC44085kk7 {

    /* renamed from: d */
    public final Map f27185d;
    @VisibleForTesting

    /* renamed from: e */
    public final Map f27186e;
    @VisibleForTesting

    /* renamed from: f */
    public final Map f27187f;
    @VisibleForTesting

    /* renamed from: g */
    public final Map f27188g;

    /* renamed from: h */
    public final Map f27189h;

    /* renamed from: i */
    public final Map f27190i;
    @VisibleForTesting

    /* renamed from: j */
    public final C50303vE2 f27191j;

    /* renamed from: k */
    public final Nl9 f27192k;

    /* renamed from: l */
    public final Map f27193l;

    /* renamed from: m */
    public final Map f27194m;

    /* renamed from: n */
    public final Map f27195n;

    public C34987Ok8(C42162hV8 c42162hV8) {
        super(c42162hV8);
        this.f27185d = new C28385so();
        this.f27186e = new C28385so();
        this.f27187f = new C28385so();
        this.f27188g = new C28385so();
        this.f27189h = new C28385so();
        this.f27193l = new C28385so();
        this.f27194m = new C28385so();
        this.f27195n = new C28385so();
        this.f27190i = new C28385so();
        this.f27191j = new C38732bk8(this, 20);
        this.f27192k = new C46458ok8(this);
    }

    /* renamed from: n */
    public static final Map m91570n(C32143Cg8 c32143Cg8) {
        C28385so c28385so = new C28385so();
        if (c32143Cg8 != null) {
            for (C34024Kh8 c34024Kh8 : c32143Cg8.m111885Q()) {
                c28385so.put(c34024Kh8.m98495C(), c34024Kh8.m98494D());
            }
        }
        return c28385so;
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ C52186yP7 m91568p(C34987Ok8 c34987Ok8, String str) {
        c34987Ok8.m83601f();
        Preconditions.checkNotEmpty(str);
        if (!c34987Ok8.m91586B(str)) {
            return null;
        }
        if (c34987Ok8.f27189h.containsKey(str) && c34987Ok8.f27189h.get(str) != null) {
            c34987Ok8.m91571m(str, (C32143Cg8) c34987Ok8.f27189h.get(str));
        } else {
            c34987Ok8.m91572l(str);
        }
        return (C52186yP7) c34987Ok8.f27191j.m8988i().get(str);
    }

    /* renamed from: B */
    public final boolean m91586B(String str) {
        C32143Cg8 c32143Cg8;
        if (TextUtils.isEmpty(str) || (c32143Cg8 = (C32143Cg8) this.f27189h.get(str)) == null || c32143Cg8.m111899B() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final boolean m91585D(String str) {
        return "1".equals(mo18891b(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: E */
    public final boolean m91584E(String str, String str2) {
        Boolean bool;
        mo19953e();
        m91572l(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f27188g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: F */
    public final boolean m91583F(String str, String str2) {
        Boolean bool;
        mo19953e();
        m91572l(str);
        if (m91585D(str) && OW8.m92080Y(str2)) {
            return true;
        }
        if (m91582G(str) && OW8.m92079Z(str2)) {
            return true;
        }
        Map map = (Map) this.f27187f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: G */
    public final boolean m91582G(String str) {
        return "1".equals(mo18891b(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: H */
    public final boolean m91581H(String str, byte[] bArr, String str2, String str3) {
        m83601f();
        mo19953e();
        Preconditions.checkNotEmpty(str);
        C45232mg8 c45232mg8 = (C45232mg8) m91574j(str, bArr).m19208j();
        m91573k(str, c45232mg8);
        m91571m(str, (C32143Cg8) c45232mg8.m81476q());
        this.f27189h.put(str, (C32143Cg8) c45232mg8.m81476q());
        this.f27193l.put(str, c45232mg8.m25172C());
        this.f27194m.put(str, str2);
        this.f27195n.put(str, str3);
        this.f27185d.put(str, m91570n((C32143Cg8) c45232mg8.m81476q()));
        this.f15489b.m36300W().m11653k(str, new ArrayList(c45232mg8.m25171D()));
        try {
            c45232mg8.m25174A();
            bArr = ((C32143Cg8) c45232mg8.m81476q()).m88653c();
        } catch (RuntimeException e) {
            this.f100966a.mo22258a().m106888t().m42706c("Unable to serialize reduced-size config. Storing full config instead. appId", C32809Fc8.m106885w(str), e);
        }
        C49481tq7 m36300W = this.f15489b.m36300W();
        Preconditions.checkNotEmpty(str);
        m36300W.mo19953e();
        m36300W.m83601f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (m36300W.m11674P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                m36300W.f100966a.mo22258a().m106893o().m42707b("Failed to update remote config (got 0). appId", C32809Fc8.m106885w(str));
            }
        } catch (SQLiteException e2) {
            m36300W.f100966a.mo22258a().m106893o().m42706c("Error storing remote config. appId", C32809Fc8.m106885w(str), e2);
        }
        this.f27189h.put(str, (C32143Cg8) c45232mg8.m81476q());
        return true;
    }

    /* renamed from: I */
    public final boolean m91580I(String str) {
        mo19953e();
        m91572l(str);
        if (this.f27186e.get(str) != null && ((Set) this.f27186e.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m91579J(String str) {
        mo19953e();
        m91572l(str);
        if (this.f27186e.get(str) == null) {
            return false;
        }
        if (!((Set) this.f27186e.get(str)).contains("device_model") && !((Set) this.f27186e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public final boolean m91578K(String str) {
        mo19953e();
        m91572l(str);
        if (this.f27186e.get(str) != null && ((Set) this.f27186e.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m91577L(String str) {
        mo19953e();
        m91572l(str);
        if (this.f27186e.get(str) != null && ((Set) this.f27186e.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean m91576M(String str) {
        mo19953e();
        m91572l(str);
        if (this.f27186e.get(str) == null) {
            return false;
        }
        if (!((Set) this.f27186e.get(str)).contains(AnalyticsFields.OS_VERSION) && !((Set) this.f27186e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public final boolean m91575N(String str) {
        mo19953e();
        m91572l(str);
        if (this.f27186e.get(str) != null && ((Set) this.f27186e.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC44085kk7
    /* renamed from: b */
    public final String mo18891b(String str, String str2) {
        mo19953e();
        m91572l(str);
        Map map = (Map) this.f27185d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // p000.TR8
    /* renamed from: i */
    public final boolean mo11655i() {
        return false;
    }

    /* renamed from: j */
    public final C32143Cg8 m91574j(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return C32143Cg8.m111893H();
        }
        try {
            C32143Cg8 c32143Cg8 = (C32143Cg8) ((C45232mg8) DV8.m110342B(C32143Cg8.m111895F(), bArr)).m81476q();
            C40448ec8 m106889s = this.f100966a.mo22258a().m106889s();
            String str2 = null;
            if (c32143Cg8.m111880V()) {
                l = Long.valueOf(c32143Cg8.m111897D());
            } else {
                l = null;
            }
            if (c32143Cg8.m111881U()) {
                str2 = c32143Cg8.m111892I();
            }
            m106889s.m42706c("Parsed config. version, gmp_app_id", l, str2);
            return c32143Cg8;
        } catch (zzll e) {
            this.f100966a.mo22258a().m106888t().m42706c("Unable to merge remote config. appId", C32809Fc8.m106885w(str), e);
            return C32143Cg8.m111893H();
        } catch (RuntimeException e2) {
            this.f100966a.mo22258a().m106888t().m42706c("Unable to merge remote config. appId", C32809Fc8.m106885w(str), e2);
            return C32143Cg8.m111893H();
        }
    }

    /* renamed from: k */
    public final void m91573k(String str, C45232mg8 c45232mg8) {
        HashSet hashSet = new HashSet();
        C28385so c28385so = new C28385so();
        C28385so c28385so2 = new C28385so();
        C28385so c28385so3 = new C28385so();
        for (C49372tf8 c49372tf8 : c45232mg8.m25170G()) {
            hashSet.add(c49372tf8.m11950C());
        }
        for (int i = 0; i < c45232mg8.m25169y(); i++) {
            C33304Hf8 c33304Hf8 = (C33304Hf8) c45232mg8.m25168z(i).m19208j();
            if (c33304Hf8.m103551A().isEmpty()) {
                this.f100966a.mo22258a().m106888t().m42708a("EventConfig contained null event name");
            } else {
                String m103551A = c33304Hf8.m103551A();
                String m42393b = C40628eu8.m42393b(c33304Hf8.m103551A());
                if (!TextUtils.isEmpty(m42393b)) {
                    c33304Hf8.m103544z(m42393b);
                    c45232mg8.m25173B(i, c33304Hf8);
                }
                if (c33304Hf8.m103548D() && c33304Hf8.m103550B()) {
                    c28385so.put(m103551A, Boolean.TRUE);
                }
                if (c33304Hf8.m103547G() && c33304Hf8.m103549C()) {
                    c28385so2.put(c33304Hf8.m103551A(), Boolean.TRUE);
                }
                if (c33304Hf8.m103546H()) {
                    if (c33304Hf8.m103545y() >= 2 && c33304Hf8.m103545y() <= 65535) {
                        c28385so3.put(c33304Hf8.m103551A(), Integer.valueOf(c33304Hf8.m103545y()));
                    } else {
                        this.f100966a.mo22258a().m106888t().m42706c("Invalid sampling rate. Event name, sample rate", c33304Hf8.m103551A(), Integer.valueOf(c33304Hf8.m103545y()));
                    }
                }
            }
        }
        this.f27186e.put(str, hashSet);
        this.f27187f.put(str, c28385so);
        this.f27188g.put(str, c28385so2);
        this.f27190i.put(str, c28385so3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m91572l(String str) {
        SQLiteException e;
        Cursor cursor;
        C35247Pn7 c35247Pn7;
        m83601f();
        mo19953e();
        Preconditions.checkNotEmpty(str);
        if (this.f27189h.get(str) == null) {
            C49481tq7 m36300W = this.f15489b.m36300W();
            Preconditions.checkNotEmpty(str);
            m36300W.mo19953e();
            m36300W.m83601f();
            Cursor cursor2 = null;
            try {
                cursor = m36300W.m11674P().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                    } catch (SQLiteException e2) {
                        e = e2;
                        m36300W.f100966a.mo22258a().m106893o().m42706c("Error querying remote config. appId", C32809Fc8.m106885w(str), e);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                }
                throw th;
            }
            if (cursor.moveToFirst()) {
                byte[] blob = cursor.getBlob(0);
                String string = cursor.getString(1);
                String string2 = cursor.getString(2);
                if (cursor.moveToNext()) {
                    m36300W.f100966a.mo22258a().m106893o().m42707b("Got multiple records for app config, expected one. appId", C32809Fc8.m106885w(str));
                }
                if (blob != null) {
                    c35247Pn7 = new C35247Pn7(blob, string, string2);
                    cursor.close();
                    if (c35247Pn7 != null) {
                        this.f27185d.put(str, null);
                        this.f27187f.put(str, null);
                        this.f27186e.put(str, null);
                        this.f27188g.put(str, null);
                        this.f27189h.put(str, null);
                        this.f27193l.put(str, null);
                        this.f27194m.put(str, null);
                        this.f27195n.put(str, null);
                        this.f27190i.put(str, null);
                        return;
                    }
                    C45232mg8 c45232mg8 = (C45232mg8) m91574j(str, c35247Pn7.f29060a).m19208j();
                    m91573k(str, c45232mg8);
                    this.f27185d.put(str, m91570n((C32143Cg8) c45232mg8.m81476q()));
                    this.f27189h.put(str, (C32143Cg8) c45232mg8.m81476q());
                    m91571m(str, (C32143Cg8) c45232mg8.m81476q());
                    this.f27193l.put(str, c45232mg8.m25172C());
                    this.f27194m.put(str, c35247Pn7.f29061b);
                    this.f27195n.put(str, c35247Pn7.f29062c);
                    return;
                }
            }
            cursor.close();
            c35247Pn7 = null;
            if (c35247Pn7 != null) {
            }
        }
    }

    /* renamed from: m */
    public final void m91571m(final String str, C32143Cg8 c32143Cg8) {
        if (c32143Cg8.m111899B() != 0) {
            this.f100966a.mo22258a().m106889s().m42707b("EES programs found", Integer.valueOf(c32143Cg8.m111899B()));
            C48899sr8 c48899sr8 = (C48899sr8) c32143Cg8.m111886P().get(0);
            try {
                C52186yP7 c52186yP7 = new C52186yP7();
                c52186yP7.m3519d("internal.remoteConfig", new Callable() { // from class: nj8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C41331g59("internal.remoteConfig", new C31945Bk8(C34987Ok8.this, str));
                    }
                });
                c52186yP7.m3519d("internal.appMetadata", new Callable() { // from class: Aj8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final C34987Ok8 c34987Ok8 = C34987Ok8.this;
                        final String str2 = str;
                        return new C51874xs9("internal.appMetadata", new Callable() { // from class: Zi8
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C34987Ok8 c34987Ok82 = C34987Ok8.this;
                                String str3 = str2;
                                C47141pt8 m11672R = c34987Ok82.f15489b.m36300W().m11672R(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", "android");
                                hashMap.put(AnalyticsRequestV2Factory.PARAM_PACKAGE_NAME, str3);
                                c34987Ok82.f100966a.m89751w().m37513n();
                                hashMap.put("gmp_version", 77000L);
                                if (m11672R != null) {
                                    String m18466l0 = m11672R.m18466l0();
                                    if (m18466l0 != null) {
                                        hashMap.put(AnalyticsFields.APP_VERSION, m18466l0);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(m11672R.m18500P()));
                                    hashMap.put("dynamite_version", Long.valueOf(m11672R.m18491Y()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                c52186yP7.m3519d("internal.logger", new Callable() { // from class: Oj8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new Vq9(C34987Ok8.this.f27192k);
                    }
                });
                c52186yP7.m3520c(c48899sr8);
                this.f27191j.m8992e(str, c52186yP7);
                this.f100966a.mo22258a().m106889s().m42706c("EES program loaded for appId, activities", str, Integer.valueOf(c48899sr8.m13567B().m9661B()));
                for (C36679Vq8 c36679Vq8 : c48899sr8.m13567B().m9658E()) {
                    this.f100966a.mo22258a().m106889s().m42707b("EES program activity", c36679Vq8.m79342C());
                }
                return;
            } catch (zzd unused) {
                this.f100966a.mo22258a().m106893o().m42707b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f27191j.m8991f(str);
    }

    /* renamed from: o */
    public final int m91569o(String str, String str2) {
        Integer num;
        mo19953e();
        m91572l(str);
        Map map = (Map) this.f27190i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: q */
    public final C32143Cg8 m91567q(String str) {
        m83601f();
        mo19953e();
        Preconditions.checkNotEmpty(str);
        m91572l(str);
        return (C32143Cg8) this.f27189h.get(str);
    }

    /* renamed from: r */
    public final String m91566r(String str) {
        mo19953e();
        return (String) this.f27195n.get(str);
    }

    /* renamed from: s */
    public final String m91565s(String str) {
        mo19953e();
        return (String) this.f27194m.get(str);
    }

    /* renamed from: t */
    public final String m91564t(String str) {
        mo19953e();
        m91572l(str);
        return (String) this.f27193l.get(str);
    }

    /* renamed from: v */
    public final Set m91562v(String str) {
        mo19953e();
        m91572l(str);
        return (Set) this.f27186e.get(str);
    }

    /* renamed from: w */
    public final void m91561w(String str) {
        mo19953e();
        this.f27194m.put(str, null);
    }

    /* renamed from: x */
    public final void m91560x(String str) {
        mo19953e();
        this.f27189h.remove(str);
    }

    /* renamed from: y */
    public final boolean m91559y(String str) {
        mo19953e();
        C32143Cg8 m91567q = m91567q(str);
        if (m91567q == null) {
            return false;
        }
        return m91567q.m111882T();
    }
}
