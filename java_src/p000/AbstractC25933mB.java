package p000;

import java.util.Collections;
import java.util.Set;
/* renamed from: mB */
/* loaded from: classes6.dex */
public abstract class AbstractC25933mB implements InterfaceC31669Ag2 {

    /* renamed from: a */
    public final Set<C42271hh2> f97497a;

    /* renamed from: b */
    public final C31903Bg2 f97498b = new C31903Bg2();

    public AbstractC25933mB(Set<C42271hh2> set) {
        if (set != null) {
            this.f97497a = Collections.unmodifiableSet(set);
            return;
        }
        throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
    }

    /* renamed from: c */
    public Set<C42271hh2> m26190c() {
        return this.f97497a;
    }

    @Override // p000.InterfaceC31669Ag2
    public C31903Bg2 getJCAContext() {
        return this.f97498b;
    }
}
