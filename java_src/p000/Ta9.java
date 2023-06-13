package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: Ta9 */
/* loaded from: classes5.dex */
public abstract class Ta9 extends AbstractC49926ub9 implements InterfaceC51161wg9 {
    protected C39837da9 zzb = C39837da9.m44108d();

    /* renamed from: u */
    public final C39837da9 m83365u() {
        if (this.zzb.m44101k()) {
            this.zzb = this.zzb.clone();
        }
        return this.zzb;
    }

    /* renamed from: v */
    public final Object m83364v(C51440x89 c51440x89) {
        C42218hb9 c42218hb9 = (C42218hb9) c51440x89;
        if (c42218hb9.f85598a == ((AbstractC49926ub9) mo9690n(6, null, null))) {
            Object m44107e = this.zzb.m44107e(c42218hb9.f85601d);
            if (m44107e == null) {
                return c42218hb9.f85599b;
            }
            if (c42218hb9.f85601d.f50706d.m40811a() == EnumC44710ln9.ENUM) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) m44107e) {
                    if (c42218hb9.f85601d.f50706d.m40811a() != EnumC44710ln9.ENUM) {
                        arrayList.add(obj);
                    } else {
                        Pb9 pb9 = c42218hb9.f85601d.f50704b;
                        ((Integer) obj).intValue();
                        throw null;
                    }
                }
                return arrayList;
            }
            return m44107e;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
}
