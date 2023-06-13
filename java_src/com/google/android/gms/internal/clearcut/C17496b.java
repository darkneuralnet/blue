package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
import java.io.IOException;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.clearcut.b */
/* loaded from: classes5.dex */
public final class C17496b extends LN7<AbstractC17497c.C17501d> {
    @Override // p000.LN7
    /* renamed from: a */
    public final int mo51572a(Map.Entry<?, ?> entry) {
        return ((AbstractC17497c.C17501d) entry.getKey()).f70401b;
    }

    @Override // p000.LN7
    /* renamed from: b */
    public final TO7<AbstractC17497c.C17501d> mo51571b(Object obj) {
        return ((AbstractC17497c.AbstractC17500c) obj).zzjv;
    }

    @Override // p000.LN7
    /* renamed from: c */
    public final void mo51570c(Object obj, TO7<AbstractC17497c.C17501d> to7) {
        ((AbstractC17497c.AbstractC17500c) obj).zzjv = to7;
    }

    @Override // p000.LN7
    /* renamed from: d */
    public final void mo51569d(InterfaceC35212Pj8 interfaceC35212Pj8, Map.Entry<?, ?> entry) throws IOException {
        AbstractC17497c.C17501d c17501d = (AbstractC17497c.C17501d) entry.getKey();
        switch (C52177yO7.f119483a[c17501d.f70402c.ordinal()]) {
            case 1:
                interfaceC35212Pj8.mo34057z(c17501d.f70401b, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                interfaceC35212Pj8.mo34098A(c17501d.f70401b, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                interfaceC35212Pj8.mo34088L(c17501d.f70401b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                interfaceC35212Pj8.mo34058y(c17501d.f70401b, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                interfaceC35212Pj8.mo34060w(c17501d.f70401b, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                interfaceC35212Pj8.mo34074i(c17501d.f70401b, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                interfaceC35212Pj8.mo34072k(c17501d.f70401b, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                interfaceC35212Pj8.mo34077f(c17501d.f70401b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                interfaceC35212Pj8.mo34071l(c17501d.f70401b, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                interfaceC35212Pj8.mo34087M(c17501d.f70401b, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                interfaceC35212Pj8.mo34097C(c17501d.f70401b, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                interfaceC35212Pj8.mo34070m(c17501d.f70401b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                interfaceC35212Pj8.mo34075h(c17501d.f70401b, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                interfaceC35212Pj8.mo34060w(c17501d.f70401b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                interfaceC35212Pj8.mo34086N(c17501d.f70401b, (TD7) entry.getValue());
                return;
            case 16:
                interfaceC35212Pj8.mo34096D(c17501d.f70401b, (String) entry.getValue());
                return;
            case 17:
                interfaceC35212Pj8.mo34084P(c17501d.f70401b, entry.getValue(), Y68.m75693a().m75692b(entry.getValue().getClass()));
                return;
            case 18:
                interfaceC35212Pj8.mo34091I(c17501d.f70401b, entry.getValue(), Y68.m75693a().m75692b(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // p000.LN7
    /* renamed from: e */
    public final TO7<AbstractC17497c.C17501d> mo51568e(Object obj) {
        TO7<AbstractC17497c.C17501d> mo51571b = mo51571b(obj);
        if (mo51571b.m83694c()) {
            TO7<AbstractC17497c.C17501d> to7 = (TO7) mo51571b.clone();
            mo51570c(obj, to7);
            return to7;
        }
        return mo51571b;
    }

    @Override // p000.LN7
    /* renamed from: f */
    public final void mo51567f(Object obj) {
        mo51571b(obj).m83677t();
    }

    @Override // p000.LN7
    /* renamed from: g */
    public final boolean mo51566g(H28 h28) {
        return h28 instanceof AbstractC17497c.AbstractC17500c;
    }
}
