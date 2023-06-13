package p000;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: vw9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50728vw9 extends AbstractC52517yx9 {

    /* renamed from: g */
    public final Y98 f114930g;

    /* renamed from: h */
    public final /* synthetic */ C32835Ff7 f114931h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50728vw9(C32835Ff7 c32835Ff7, String str, int i, Y98 y98) {
        super(str, i);
        this.f114931h = c32835Ff7;
        this.f114930g = y98;
    }

    @Override // p000.AbstractC52517yx9
    /* renamed from: a */
    public final int mo2182a() {
        return this.f114930g.m75493C();
    }

    @Override // p000.AbstractC52517yx9
    /* renamed from: b */
    public final boolean mo2181b() {
        return this.f114930g.m75481P();
    }

    @Override // p000.AbstractC52517yx9
    /* renamed from: c */
    public final boolean mo2180c() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03fb  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7730k(Long l, Long l2, C47051pk8 c47051pk8, long j, C47160pv7 c47160pv7, boolean z) {
        Boolean m2209i;
        Bc9.m113800b();
        boolean m37502y = this.f114931h.f100966a.m89751w().m37502y(this.f120451a, C37795a98.f49960a0);
        long j2 = this.f114930g.m75482O() ? c47160pv7.f104328e : j;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        Boolean bool = null;
        if (Log.isLoggable(this.f114931h.f100966a.mo22258a().m106900D(), 2)) {
            this.f114931h.f100966a.mo22258a().m106889s().m42705d("Evaluating filter. audience, filter, event", Integer.valueOf(this.f120452b), this.f114930g.m75480Q() ? Integer.valueOf(this.f114930g.m75493C()) : null, this.f114931h.f100966a.m89786D().m17332d(this.f114930g.m75488H()));
            this.f114931h.f100966a.mo22258a().m106889s().m42707b("Filter definition", this.f114931h.f15489b.m36285g0().m110340E(this.f114930g));
        }
        if (!this.f114930g.m75480Q() || this.f114930g.m75493C() > 256) {
            this.f114931h.f100966a.mo22258a().m106888t().m42706c("Invalid event filter ID. appId, id", C32809Fc8.m106885w(this.f120451a), String.valueOf(this.f114930g.m75480Q() ? Integer.valueOf(this.f114930g.m75493C()) : null));
            return false;
        }
        Object[] objArr = (this.f114930g.m75484M() || this.f114930g.m75483N() || this.f114930g.m75482O()) ? 1 : null;
        if (z && objArr == null) {
            this.f114931h.f100966a.mo22258a().m106889s().m42706c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f120452b), this.f114930g.m75480Q() ? Integer.valueOf(this.f114930g.m75493C()) : null);
            return true;
        }
        Y98 y98 = this.f114930g;
        String m18858I = c47051pk8.m18858I();
        if (y98.m75481P()) {
            Boolean m2210h = AbstractC52517yx9.m2210h(j2, y98.m75489G());
            if (m2210h != null) {
                if (!m2210h.booleanValue()) {
                    bool = Boolean.FALSE;
                }
            }
            this.f114931h.f100966a.mo22258a().m106889s().m42707b("Event filter result", bool != null ? "null" : bool);
            if (bool != null) {
                return false;
            }
            Boolean bool2 = Boolean.TRUE;
            this.f120453c = bool2;
            if (bool.booleanValue()) {
                this.f120454d = bool2;
                if (objArr != null && c47051pk8.m18846V()) {
                    Long valueOf = Long.valueOf(c47051pk8.m18862E());
                    if (this.f114930g.m75483N()) {
                        if (m37502y && this.f114930g.m75481P()) {
                            valueOf = l;
                        }
                        this.f120456f = valueOf;
                    } else {
                        if (m37502y && this.f114930g.m75481P()) {
                            valueOf = l2;
                        }
                        this.f120455e = valueOf;
                    }
                }
                return true;
            }
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it = y98.m75487I().iterator();
        while (true) {
            if (it.hasNext()) {
                C32323Da8 c32323Da8 = (C32323Da8) it.next();
                if (c32323Da8.m110141F().isEmpty()) {
                    this.f114931h.f100966a.mo22258a().m106888t().m42707b("null or empty param name in filter. event", this.f114931h.f100966a.m89786D().m17332d(m18858I));
                    break;
                }
                hashSet.add(c32323Da8.m110141F());
            } else {
                C28385so c28385so = new C28385so();
                Iterator it2 = c47051pk8.m18857J().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C47061pl8 c47061pl8 = (C47061pl8) it2.next();
                        if (hashSet.contains(c47061pl8.m18780H())) {
                            if (c47061pl8.m18765X()) {
                                c28385so.put(c47061pl8.m18780H(), c47061pl8.m18765X() ? Long.valueOf(c47061pl8.m18783E()) : null);
                            } else if (c47061pl8.m18767V()) {
                                c28385so.put(c47061pl8.m18780H(), c47061pl8.m18767V() ? Double.valueOf(c47061pl8.m18786B()) : null);
                            } else if (c47061pl8.m18763Z()) {
                                c28385so.put(c47061pl8.m18780H(), c47061pl8.m18779I());
                            } else {
                                this.f114931h.f100966a.mo22258a().m106888t().m42706c("Unknown value for param. event, param", this.f114931h.f100966a.m89786D().m17332d(m18858I), this.f114931h.f100966a.m89786D().m17331e(c47061pl8.m18780H()));
                                break;
                            }
                        }
                    } else {
                        Iterator it3 = y98.m75487I().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                C32323Da8 c32323Da82 = (C32323Da8) it3.next();
                                boolean z2 = c32323Da82.m110138I() && c32323Da82.m110139H();
                                String m110141F = c32323Da82.m110141F();
                                if (m110141F.isEmpty()) {
                                    this.f114931h.f100966a.mo22258a().m106888t().m42707b("Event has empty param name. event", this.f114931h.f100966a.m89786D().m17332d(m18858I));
                                    break;
                                }
                                Object obj = c28385so.get(m110141F);
                                if (obj instanceof Long) {
                                    if (!c32323Da82.m110137J()) {
                                        this.f114931h.f100966a.mo22258a().m106888t().m42706c("No number filter for long param. event, param", this.f114931h.f100966a.m89786D().m17332d(m18858I), this.f114931h.f100966a.m89786D().m17331e(m110141F));
                                        break;
                                    }
                                    Boolean m2210h2 = AbstractC52517yx9.m2210h(((Long) obj).longValue(), c32323Da82.m110143D());
                                    if (m2210h2 == null) {
                                        break;
                                    } else if (m2210h2.booleanValue() == z2) {
                                        bool = Boolean.FALSE;
                                        break;
                                    }
                                } else if (obj instanceof Double) {
                                    if (!c32323Da82.m110137J()) {
                                        this.f114931h.f100966a.mo22258a().m106888t().m42706c("No number filter for double param. event, param", this.f114931h.f100966a.m89786D().m17332d(m18858I), this.f114931h.f100966a.m89786D().m17331e(m110141F));
                                        break;
                                    }
                                    Boolean m2211g = AbstractC52517yx9.m2211g(((Double) obj).doubleValue(), c32323Da82.m110143D());
                                    if (m2211g == null) {
                                        break;
                                    } else if (m2211g.booleanValue() == z2) {
                                        bool = Boolean.FALSE;
                                        break;
                                    }
                                } else if (obj instanceof String) {
                                    if (c32323Da82.m110135M()) {
                                        m2209i = AbstractC52517yx9.m2212f((String) obj, c32323Da82.m110142E(), this.f114931h.f100966a.mo22258a());
                                    } else if (c32323Da82.m110137J()) {
                                        String str = (String) obj;
                                        if (DV8.m110331N(str)) {
                                            m2209i = AbstractC52517yx9.m2209i(str, c32323Da82.m110143D());
                                        } else {
                                            this.f114931h.f100966a.mo22258a().m106888t().m42706c("Invalid param value for number filter. event, param", this.f114931h.f100966a.m89786D().m17332d(m18858I), this.f114931h.f100966a.m89786D().m17331e(m110141F));
                                            break;
                                        }
                                    } else {
                                        this.f114931h.f100966a.mo22258a().m106888t().m42706c("No filter for String param. event, param", this.f114931h.f100966a.m89786D().m17332d(m18858I), this.f114931h.f100966a.m89786D().m17331e(m110141F));
                                        break;
                                    }
                                    if (m2209i == null) {
                                        break;
                                    } else if (m2209i.booleanValue() == z2) {
                                        bool = Boolean.FALSE;
                                        break;
                                    }
                                } else if (obj == null) {
                                    this.f114931h.f100966a.mo22258a().m106889s().m42706c("Missing param for filter. event, param", this.f114931h.f100966a.m89786D().m17332d(m18858I), this.f114931h.f100966a.m89786D().m17331e(m110141F));
                                    bool = Boolean.FALSE;
                                } else {
                                    this.f114931h.f100966a.mo22258a().m106888t().m42706c("Unknown param type. event, param", this.f114931h.f100966a.m89786D().m17332d(m18858I), this.f114931h.f100966a.m89786D().m17331e(m110141F));
                                }
                            } else {
                                bool = Boolean.TRUE;
                                break;
                            }
                        }
                    }
                }
            }
        }
        this.f114931h.f100966a.mo22258a().m106889s().m42707b("Event filter result", bool != null ? "null" : bool);
        if (bool != null) {
        }
    }
}
