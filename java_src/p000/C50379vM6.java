package p000;

import android.support.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* renamed from: vM6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50379vM6 {

    /* renamed from: e */
    public static final C42061hK6 f113953e = new C42061hK6("ExtractorTaskFinder");

    /* renamed from: a */
    public final C46823pM6 f113954a;

    /* renamed from: b */
    public final HK6 f113955b;

    /* renamed from: c */
    public final C42070hL6 f113956c;

    /* renamed from: d */
    public final PJ6 f113957d;

    public C50379vM6(C46823pM6 c46823pM6, HK6 hk6, C42070hL6 c42070hL6, PJ6 pj6) {
        this.f113954a = c46823pM6;
        this.f113955b = hk6;
        this.f113956c = c42070hL6;
        this.f113957d = pj6;
    }

    /* renamed from: c */
    public static boolean m8772c(QL6 ql6) {
        int i = ql6.f30236f;
        return i == 1 || i == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r0 == null) goto L40;
     */
    @Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C49194tM6 m8774a() {
        C49194tM6 c49194tM6;
        int i;
        try {
            this.f113954a.m19418a();
            ArrayList arrayList = new ArrayList();
            for (OL6 ol6 : this.f113954a.m19416c().values()) {
                if (BM6.m114067f(ol6.f26415c.f22991c)) {
                    arrayList.add(ol6);
                }
            }
            C48000rL6 c48000rL6 = null;
            if (!arrayList.isEmpty()) {
                if (this.f113957d.m90483a()) {
                    Map<String, Long> m104001q = this.f113955b.m104001q();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c49194tM6 = null;
                            break;
                        }
                        OL6 ol62 = (OL6) it.next();
                        Long l = m104001q.get(ol62.f26415c.f22989a);
                        if (l != null && ol62.f26415c.f22990b == l.longValue()) {
                            f113953e.m36538a("Found promote pack task for session %s with pack %s.", Integer.valueOf(ol62.f26413a), ol62.f26415c.f22989a);
                            int i2 = ol62.f26413a;
                            String str = ol62.f26415c.f22989a;
                            this.f113955b.m104022G(str);
                            c49194tM6 = new C49194tM6(i2, str, null);
                            break;
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c49194tM6 = null;
                        break;
                    }
                    OL6 ol63 = (OL6) it2.next();
                    try {
                        HK6 hk6 = this.f113955b;
                        ML6 ml6 = ol63.f26415c;
                        if (hk6.m103993y(ml6.f22989a, ol63.f26414b, ml6.f22990b) == ol63.f26415c.f22993e.size()) {
                            f113953e.m36538a("Found final move task for session %s with pack %s.", Integer.valueOf(ol63.f26413a), ol63.f26415c.f22989a);
                            int i3 = ol63.f26413a;
                            ML6 ml62 = ol63.f26415c;
                            c49194tM6 = new HM6(i3, ml62.f22989a, ol63.f26414b, ml62.f22990b);
                            break;
                        }
                    } catch (IOException e) {
                        throw new C49185tL6(String.format("Failed to check number of completed merges for session %s, pack %s", Integer.valueOf(ol63.f26413a), ol63.f26415c.f22989a), e, ol63.f26413a);
                    }
                }
                if (c49194tM6 == null) {
                    Iterator it3 = arrayList.iterator();
                    loop3: while (true) {
                        if (!it3.hasNext()) {
                            c49194tM6 = null;
                            break;
                        }
                        OL6 ol64 = (OL6) it3.next();
                        if (BM6.m114067f(ol64.f26415c.f22991c)) {
                            for (QL6 ql6 : ol64.f26415c.f22993e) {
                                HK6 hk62 = this.f113955b;
                                ML6 ml63 = ol64.f26415c;
                                if (hk62.m103995w(ml63.f22989a, ol64.f26414b, ml63.f22990b, ql6.f30231a).exists()) {
                                    f113953e.m36538a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(ol64.f26413a), ol64.f26415c.f22989a, ql6.f30231a);
                                    int i4 = ol64.f26413a;
                                    ML6 ml64 = ol64.f26415c;
                                    c49194tM6 = new EM6(i4, ml64.f22989a, ol64.f26414b, ml64.f22990b, ql6.f30231a);
                                    break loop3;
                                }
                            }
                            continue;
                        }
                    }
                    if (c49194tM6 == null) {
                        Iterator it4 = arrayList.iterator();
                        loop5: while (true) {
                            if (!it4.hasNext()) {
                                c49194tM6 = null;
                                break;
                            }
                            OL6 ol65 = (OL6) it4.next();
                            if (BM6.m114067f(ol65.f26415c.f22991c)) {
                                for (QL6 ql62 : ol65.f26415c.f22993e) {
                                    if (m8773b(ol65, ql62)) {
                                        HK6 hk63 = this.f113955b;
                                        ML6 ml65 = ol65.f26415c;
                                        if (hk63.m103996v(ml65.f22989a, ol65.f26414b, ml65.f22990b, ql62.f30231a).exists()) {
                                            f113953e.m36538a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(ol65.f26413a), ol65.f26415c.f22989a, ql62.f30231a);
                                            int i5 = ol65.f26413a;
                                            ML6 ml66 = ol65.f26415c;
                                            c49194tM6 = new C39106cN6(i5, ml66.f22989a, ol65.f26414b, ml66.f22990b, ql62.f30231a, ql62.f30232b);
                                            break loop5;
                                        }
                                    }
                                }
                                continue;
                            }
                        }
                        if (c49194tM6 == null) {
                            Iterator it5 = arrayList.iterator();
                            loop7: while (true) {
                                if (!it5.hasNext()) {
                                    c48000rL6 = null;
                                    break;
                                }
                                OL6 ol66 = (OL6) it5.next();
                                if (BM6.m114067f(ol66.f26415c.f22991c)) {
                                    Iterator<QL6> it6 = ol66.f26415c.f22993e.iterator();
                                    while (it6.hasNext()) {
                                        QL6 next = it6.next();
                                        if (!m8772c(next)) {
                                            HK6 hk64 = this.f113955b;
                                            ML6 ml67 = ol66.f26415c;
                                            Iterator<QL6> it7 = it6;
                                            try {
                                                i = new QM6(hk64, ml67.f22989a, ol66.f26414b, ml67.f22990b, next.f30231a).m88583k();
                                            } catch (IOException e2) {
                                                f113953e.m36537b("Slice checkpoint corrupt, restarting extraction. %s", e2);
                                                i = 0;
                                            }
                                            if (i != -1 && next.f30234d.get(i).f19456a) {
                                                f113953e.m36538a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(next.f30235e), Integer.valueOf(ol66.f26413a), ol66.f26415c.f22989a, next.f30231a, Integer.valueOf(i));
                                                InputStream m36529a = this.f113956c.m36529a(ol66.f26413a, ol66.f26415c.f22989a, next.f30231a, i);
                                                int i6 = ol66.f26413a;
                                                ML6 ml68 = ol66.f26415c;
                                                String str2 = ml68.f22989a;
                                                int i7 = ol66.f26414b;
                                                long j = ml68.f22990b;
                                                String str3 = next.f30231a;
                                                int i8 = next.f30235e;
                                                int size = next.f30234d.size();
                                                ML6 ml69 = ol66.f26415c;
                                                c48000rL6 = new C48000rL6(i6, str2, i7, j, str3, i8, i, size, ml69.f22992d, ml69.f22991c, m36529a);
                                                break loop7;
                                            }
                                            it6 = it7;
                                        }
                                    }
                                    continue;
                                }
                            }
                            if (c48000rL6 == null) {
                                Iterator it8 = arrayList.iterator();
                                loop9: while (true) {
                                    if (!it8.hasNext()) {
                                        c49194tM6 = null;
                                        break;
                                    }
                                    OL6 ol67 = (OL6) it8.next();
                                    if (BM6.m114067f(ol67.f26415c.f22991c)) {
                                        for (QL6 ql63 : ol67.f26415c.f22993e) {
                                            if (m8772c(ql63) && ql63.f30234d.get(0).f19456a && !m8773b(ol67, ql63)) {
                                                f113953e.m36538a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(ql63.f30236f), Integer.valueOf(ol67.f26413a), ol67.f26415c.f22989a, ql63.f30231a);
                                                InputStream m36529a2 = this.f113956c.m36529a(ol67.f26413a, ol67.f26415c.f22989a, ql63.f30231a, 0);
                                                int i9 = ol67.f26413a;
                                                String str4 = ol67.f26415c.f22989a;
                                                c49194tM6 = new NM6(i9, str4, this.f113955b.m104022G(str4), this.f113955b.m104021H(ol67.f26415c.f22989a), ol67.f26414b, ol67.f26415c.f22990b, ql63.f30236f, ql63.f30231a, ql63.f30233c, m36529a2);
                                                break loop9;
                                            }
                                        }
                                        continue;
                                    }
                                }
                                if (c49194tM6 == null) {
                                    this.f113954a.m19417b();
                                    return null;
                                }
                            }
                        }
                    }
                }
                return c49194tM6;
            }
            return c48000rL6;
        } finally {
            this.f113954a.m19417b();
        }
    }

    /* renamed from: b */
    public final boolean m8773b(OL6 ol6, QL6 ql6) {
        HK6 hk6 = this.f113955b;
        ML6 ml6 = ol6.f26415c;
        return new QM6(hk6, ml6.f22989a, ol6.f26414b, ml6.f22990b, ql6.f30231a).m88582l();
    }
}
