package p000;

import android.content.Intent;
import android.os.Bundle;
import com.stripe.android.core.networking.AnalyticsFields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: pM6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46823pM6 {

    /* renamed from: g */
    public static final C42061hK6 f103564g = new C42061hK6("ExtractorSessionStoreView");

    /* renamed from: a */
    public final HK6 f103565a;

    /* renamed from: b */
    public final InterfaceC46230oM6<InterfaceC40920fP6> f103566b;

    /* renamed from: c */
    public final C51556xL6 f103567c;

    /* renamed from: d */
    public final InterfaceC46230oM6<Executor> f103568d;

    /* renamed from: e */
    public final Map<Integer, OL6> f103569e = new HashMap();

    /* renamed from: f */
    public final ReentrantLock f103570f = new ReentrantLock();

    public C46823pM6(HK6 hk6, InterfaceC46230oM6<InterfaceC40920fP6> interfaceC46230oM6, C51556xL6 c51556xL6, InterfaceC46230oM6<Executor> interfaceC46230oM62) {
        this.f103565a = hk6;
        this.f103566b = interfaceC46230oM6;
        this.f103567c = c51556xL6;
        this.f103568d = interfaceC46230oM62;
    }

    /* renamed from: s */
    public static String m19400s(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new C49185tL6("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    /* renamed from: t */
    public static <T> List<T> m19399t(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public final void m19418a() {
        this.f103570f.lock();
    }

    /* renamed from: b */
    public final void m19417b() {
        this.f103570f.unlock();
    }

    /* renamed from: c */
    public final Map<Integer, OL6> m19416c() {
        return this.f103569e;
    }

    /* renamed from: d */
    public final boolean m19415d(Bundle bundle) {
        return ((Boolean) m19402q(new AL6(this, bundle, null))).booleanValue();
    }

    /* renamed from: e */
    public final boolean m19414e(Bundle bundle) {
        return ((Boolean) m19402q(new AL6(this, bundle))).booleanValue();
    }

    /* renamed from: f */
    public final void m19413f(final String str, final int i, final long j) {
        m19402q(new SL6(this, str, i, j) { // from class: CL6

            /* renamed from: a */
            public final C46823pM6 f3972a;

            /* renamed from: b */
            public final String f3973b;

            /* renamed from: c */
            public final int f3974c;

            /* renamed from: d */
            public final long f3975d;

            {
                this.f3972a = this;
                this.f3973b = str;
                this.f3974c = i;
                this.f3975d = j;
            }

            @Override // p000.SL6
            /* renamed from: a */
            public final Object mo85709a() {
                this.f3972a.m19407l(this.f3973b, this.f3974c, this.f3975d);
                return null;
            }
        });
    }

    /* renamed from: g */
    public final void m19412g(int i) {
        m19402q(new EL6(this, i));
    }

    /* renamed from: h */
    public final /* synthetic */ Map m19411h(List list) {
        int i;
        Map<String, OL6> m19403p = m19403p(list);
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            final OL6 ol6 = m19403p.get(str);
            if (ol6 == null) {
                i = 8;
            } else {
                if (BM6.m114069d(ol6.f26415c.f22991c)) {
                    try {
                        ol6.f26415c.f22991c = 6;
                        this.f103568d.m21257a().execute(new Runnable(this, ol6) { // from class: IL6

                            /* renamed from: b */
                            public final C46823pM6 f15383b;

                            /* renamed from: c */
                            public final OL6 f15384c;

                            {
                                this.f15383b = this;
                                this.f15384c = ol6;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f15383b.m19412g(this.f15384c.f26413a);
                            }
                        });
                        this.f103567c.m5432a(str);
                    } catch (C49185tL6 unused) {
                        f103564g.m36535d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(ol6.f26413a), str);
                    }
                }
                i = ol6.f26415c.f22991c;
            }
            hashMap.put(str, Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: i */
    public final /* synthetic */ Map m19410i(List list) {
        HashMap hashMap = new HashMap();
        for (OL6 ol6 : this.f103569e.values()) {
            String str = ol6.f26415c.f22989a;
            if (list.contains(str)) {
                OL6 ol62 = (OL6) hashMap.get(str);
                if ((ol62 == null ? -1 : ol62.f26413a) < ol6.f26413a) {
                    hashMap.put(str, ol6);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: j */
    public final /* synthetic */ Boolean m19409j(Bundle bundle) {
        int i = bundle.getInt(AnalyticsFields.SESSION_ID);
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, OL6> map = this.f103569e;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            OL6 ol6 = this.f103569e.get(valueOf);
            if (ol6.f26415c.f22991c == 6) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(!BM6.m114066g(ol6.f26415c.f22991c, bundle.getInt(XN6.m77066e("status", m19400s(bundle)))));
        }
        return Boolean.TRUE;
    }

    /* renamed from: k */
    public final /* synthetic */ Boolean m19408k(Bundle bundle) {
        QL6 ql6;
        int i = bundle.getInt(AnalyticsFields.SESSION_ID);
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, OL6> map = this.f103569e;
        Integer valueOf = Integer.valueOf(i);
        boolean z = true;
        boolean z2 = false;
        if (map.containsKey(valueOf)) {
            OL6 m19401r = m19401r(i);
            int i2 = bundle.getInt(XN6.m77066e("status", m19401r.f26415c.f22989a));
            if (BM6.m114066g(m19401r.f26415c.f22991c, i2)) {
                f103564g.m36538a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(m19401r.f26415c.f22991c));
                ML6 ml6 = m19401r.f26415c;
                String str = ml6.f22989a;
                int i3 = ml6.f22991c;
                if (i3 == 4) {
                    this.f103566b.m21257a().mo10448c(i, str);
                } else if (i3 == 5) {
                    this.f103566b.m21257a().mo10450a(i);
                } else if (i3 == 6) {
                    this.f103566b.m21257a().mo10445f(Arrays.asList(str));
                }
            } else {
                m19401r.f26415c.f22991c = i2;
                if (BM6.m114068e(i2)) {
                    m19412g(i);
                    this.f103567c.m5432a(m19401r.f26415c.f22989a);
                } else {
                    for (QL6 ql62 : m19401r.f26415c.f22993e) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(XN6.m77065f("chunk_intents", m19401r.f26415c.f22989a, ql62.f30231a));
                        if (parcelableArrayList != null) {
                            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                if (parcelableArrayList.get(i4) != null && ((Intent) parcelableArrayList.get(i4)).getData() != null) {
                                    ql62.f30234d.get(i4).f19456a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String m19400s = m19400s(bundle);
            long j = bundle.getLong(XN6.m77066e("pack_version", m19400s));
            int i5 = bundle.getInt(XN6.m77066e("status", m19400s));
            long j2 = bundle.getLong(XN6.m77066e("total_bytes_to_download", m19400s));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(XN6.m77066e("slice_ids", m19400s));
            ArrayList arrayList = new ArrayList();
            for (String str2 : m19399t(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(XN6.m77065f("chunk_intents", m19400s, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m19399t(parcelableArrayList2)) {
                    if (intent == null) {
                        z = z2;
                    }
                    arrayList2.add(new KL6(z));
                    z = true;
                    z2 = false;
                }
                String string = bundle.getString(XN6.m77065f("uncompressed_hash_sha256", m19400s, str2));
                long j3 = bundle.getLong(XN6.m77065f("uncompressed_size", m19400s, str2));
                int i6 = bundle.getInt(XN6.m77065f("patch_format", m19400s, str2), 0);
                if (i6 != 0) {
                    ql6 = new QL6(str2, string, j3, arrayList2, 0, i6);
                    z2 = false;
                } else {
                    z2 = false;
                    ql6 = new QL6(str2, string, j3, arrayList2, bundle.getInt(XN6.m77065f("compression_format", m19400s, str2), 0), 0);
                }
                arrayList.add(ql6);
                z = true;
            }
            this.f103569e.put(Integer.valueOf(i), new OL6(i, bundle.getInt("app_version_code"), new ML6(m19400s, j, i5, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* renamed from: l */
    public final /* synthetic */ void m19407l(String str, int i, long j) {
        OL6 ol6 = m19403p(Arrays.asList(str)).get(str);
        if (ol6 == null || BM6.m114068e(ol6.f26415c.f22991c)) {
            f103564g.m36537b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f103565a.m104016b(str, i, j);
        ol6.f26415c.f22991c = 4;
    }

    /* renamed from: m */
    public final /* synthetic */ void m19406m(int i) {
        m19401r(i).f26415c.f22991c = 5;
    }

    /* renamed from: n */
    public final /* synthetic */ void m19405n(int i) {
        OL6 m19401r = m19401r(i);
        if (!BM6.m114068e(m19401r.f26415c.f22991c)) {
            throw new C49185tL6(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
        }
        HK6 hk6 = this.f103565a;
        ML6 ml6 = m19401r.f26415c;
        hk6.m104016b(ml6.f22989a, m19401r.f26414b, ml6.f22990b);
        ML6 ml62 = m19401r.f26415c;
        int i2 = ml62.f22991c;
        if (i2 == 5 || i2 == 6) {
            this.f103565a.m104015c(ml62.f22989a, m19401r.f26414b, ml62.f22990b);
        }
    }

    /* renamed from: o */
    public final void m19404o(int i) {
        m19402q(new EL6(this, i, null));
    }

    /* renamed from: p */
    public final Map<String, OL6> m19403p(final List<String> list) {
        return (Map) m19402q(new SL6(this, list, null) { // from class: GL6

            /* renamed from: a */
            public final C46823pM6 f11711a;

            /* renamed from: b */
            public final List f11712b;

            /* renamed from: c */
            public final /* synthetic */ int f11713c = 1;

            {
                this.f11711a = this;
                this.f11712b = list;
            }

            @Override // p000.SL6
            /* renamed from: a */
            public final Object mo85709a() {
                return this.f11713c != 0 ? this.f11711a.m19410i(this.f11712b) : this.f11711a.m19411h(this.f11712b);
            }
        });
    }

    /* renamed from: q */
    public final <T> T m19402q(SL6<T> sl6) {
        try {
            m19418a();
            return sl6.mo85709a();
        } finally {
            m19417b();
        }
    }

    /* renamed from: r */
    public final OL6 m19401r(int i) {
        Map<Integer, OL6> map = this.f103569e;
        Integer valueOf = Integer.valueOf(i);
        OL6 ol6 = map.get(valueOf);
        if (ol6 != null) {
            return ol6;
        }
        throw new C49185tL6(String.format("Could not find session %d while trying to get it", valueOf), i);
    }
}
