package p000;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: I99 */
/* loaded from: classes5.dex */
public final class I99 extends U89 {
    @Override // p000.U89
    /* renamed from: a */
    public final int mo81916a(Map.Entry entry) {
        C38050ab9 c38050ab9 = (C38050ab9) entry.getKey();
        return 202056002;
    }

    @Override // p000.U89
    /* renamed from: b */
    public final C39837da9 mo81915b(Object obj) {
        return ((Ta9) obj).zzb;
    }

    @Override // p000.U89
    /* renamed from: c */
    public final C39837da9 mo81914c(Object obj) {
        return ((Ta9) obj).m83365u();
    }

    @Override // p000.U89
    /* renamed from: d */
    public final Object mo81913d(N89 n89, InterfaceC47012pg9 interfaceC47012pg9, int i) {
        return n89.m94316c(interfaceC47012pg9, i);
    }

    @Override // p000.U89
    /* renamed from: e */
    public final void mo81912e(Object obj) {
        ((Ta9) obj).zzb.m44104h();
    }

    @Override // p000.U89
    /* renamed from: f */
    public final boolean mo81911f(InterfaceC47012pg9 interfaceC47012pg9) {
        return interfaceC47012pg9 instanceof Ta9;
    }

    @Override // p000.U89
    /* renamed from: g */
    public final void mo81910g(C41954h89 c41954h89, Map.Entry entry) throws IOException {
        EnumC41152fn9 enumC41152fn9 = EnumC41152fn9.f80685c;
        switch (((C38050ab9) entry.getKey()).f50706d.ordinal()) {
            case 0:
                Ti9.m83092l(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 1:
                Ti9.m83088p(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 2:
                Ti9.m83085s(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 3:
                Ti9.m83130B(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 4:
                Ti9.m83086r(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 5:
                Ti9.m83089o(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 6:
                Ti9.m83090n(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 7:
                Ti9.m83094j(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 8:
                Ti9.m83079y(202056002, (List) entry.getValue(), c41954h89);
                return;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    Ti9.m83087q(202056002, (List) entry.getValue(), c41954h89, C42288hi9.m36060a().m36059b(list.get(0).getClass()));
                    return;
                }
                return;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    Ti9.m83084t(202056002, (List) entry.getValue(), c41954h89, C42288hi9.m36060a().m36059b(list2.get(0).getClass()));
                    return;
                }
                return;
            case 11:
                Ti9.m83093k(202056002, (List) entry.getValue(), c41954h89);
                return;
            case 12:
                Ti9.m83078z(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 13:
                Ti9.m83086r(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 14:
                Ti9.m83083u(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 15:
                Ti9.m83082v(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 16:
                Ti9.m83081w(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            case 17:
                Ti9.m83080x(202056002, (List) entry.getValue(), c41954h89, false);
                return;
            default:
                return;
        }
    }
}
