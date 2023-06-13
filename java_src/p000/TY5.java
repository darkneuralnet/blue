package p000;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* renamed from: TY5 */
/* loaded from: classes5.dex */
public final class TY5 implements InterfaceC32227Cq2 {

    /* renamed from: b */
    public final Set<LY5<?>> f35667b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void m83402a() {
        this.f35667b.clear();
    }

    /* renamed from: b */
    public List<LY5<?>> m83401b() {
        return C47029pi6.m18916j(this.f35667b);
    }

    /* renamed from: c */
    public void m83400c(LY5<?> ly5) {
        this.f35667b.add(ly5);
    }

    /* renamed from: d */
    public void m83399d(LY5<?> ly5) {
        this.f35667b.remove(ly5);
    }

    @Override // p000.InterfaceC32227Cq2
    public void onDestroy() {
        for (LY5 ly5 : C47029pi6.m18916j(this.f35667b)) {
            ly5.onDestroy();
        }
    }

    @Override // p000.InterfaceC32227Cq2
    public void onStart() {
        for (LY5 ly5 : C47029pi6.m18916j(this.f35667b)) {
            ly5.onStart();
        }
    }

    @Override // p000.InterfaceC32227Cq2
    public void onStop() {
        for (LY5 ly5 : C47029pi6.m18916j(this.f35667b)) {
            ly5.onStop();
        }
    }
}
