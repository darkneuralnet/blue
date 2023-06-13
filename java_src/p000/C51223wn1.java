package p000;

import java.util.Map;
/* renamed from: wn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51223wn1 extends AbstractC45077mQ3 {

    /* renamed from: b */
    public static final C10776ad f116530b = C10776ad.m71007e();

    /* renamed from: a */
    public final C41338g66 f116531a;

    public C51223wn1(C41338g66 c41338g66) {
        this.f116531a = c41338g66;
    }

    @Override // p000.AbstractC45077mQ3
    /* renamed from: c */
    public boolean mo6338c() {
        if (!m6329o(this.f116531a, 0)) {
            C10776ad c10776ad = f116530b;
            c10776ad.m71002j("Invalid Trace:" + this.f116531a.m40026s0());
            return false;
        } else if (m6334j(this.f116531a) && !m6336h(this.f116531a)) {
            C10776ad c10776ad2 = f116530b;
            c10776ad2.m71002j("Invalid Counters for Trace:" + this.f116531a.m40026s0());
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g */
    public final boolean m6337g(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                AbstractC45077mQ3.m25654d(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e) {
                f116530b.m71002j(e.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m6336h(C41338g66 c41338g66) {
        return m6335i(c41338g66, 0);
    }

    /* renamed from: i */
    public final boolean m6335i(C41338g66 c41338g66, int i) {
        if (c41338g66 == null) {
            return false;
        }
        if (i > 1) {
            f116530b.m71002j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : c41338g66.m40032m0().entrySet()) {
            if (!m6332l(entry.getKey())) {
                C10776ad c10776ad = f116530b;
                c10776ad.m71002j("invalid CounterId:" + entry.getKey());
                return false;
            } else if (!m6331m(entry.getValue())) {
                C10776ad c10776ad2 = f116530b;
                c10776ad2.m71002j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (C41338g66 c41338g662 : c41338g66.m40024u0()) {
            if (!m6335i(c41338g662, i + 1)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m6334j(C41338g66 c41338g66) {
        boolean z;
        boolean z2;
        if (c41338g66.m40033l0() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        for (C41338g66 c41338g662 : c41338g66.m40024u0()) {
            if (c41338g662.m40033l0() > 0) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m6333k(C41338g66 c41338g66) {
        return c41338g66.m40026s0().startsWith("_st_");
    }

    /* renamed from: l */
    public final boolean m6332l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f116530b.m71002j("counterId is empty");
            return false;
        } else if (trim.length() > 100) {
            f116530b.m71002j("counterId exceeded max length 100");
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: m */
    public final boolean m6331m(Long l) {
        return l != null;
    }

    /* renamed from: n */
    public final boolean m6330n(C41338g66 c41338g66) {
        Long l = c41338g66.m40032m0().get(EnumC36041Sy0.FRAMES_TOTAL.toString());
        if (l != null && l.compareTo((Long) 0L) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m6329o(C41338g66 c41338g66, int i) {
        if (c41338g66 == null) {
            f116530b.m71002j("TraceMetric is null");
            return false;
        } else if (i > 1) {
            f116530b.m71002j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!m6327q(c41338g66.m40026s0())) {
            C10776ad c10776ad = f116530b;
            c10776ad.m71002j("invalid TraceId:" + c41338g66.m40026s0());
            return false;
        } else if (!m6328p(c41338g66)) {
            C10776ad c10776ad2 = f116530b;
            c10776ad2.m71002j("invalid TraceDuration:" + c41338g66.m40029p0());
            return false;
        } else if (!c41338g66.m40023v0()) {
            f116530b.m71002j("clientStartTimeUs is null.");
            return false;
        } else if (m6333k(c41338g66) && !m6330n(c41338g66)) {
            C10776ad c10776ad3 = f116530b;
            c10776ad3.m71002j("non-positive totalFrames in screen trace " + c41338g66.m40026s0());
            return false;
        } else {
            for (C41338g66 c41338g662 : c41338g66.m40024u0()) {
                if (!m6329o(c41338g662, i + 1)) {
                    return false;
                }
            }
            if (!m6337g(c41338g66.m40031n0())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: p */
    public final boolean m6328p(C41338g66 c41338g66) {
        return c41338g66 != null && c41338g66.m40029p0() > 0;
    }

    /* renamed from: q */
    public final boolean m6327q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty() || trim.length() > 100) {
            return false;
        }
        return true;
    }
}
