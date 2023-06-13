package p000;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* renamed from: F3 */
/* loaded from: classes5.dex */
public class C2062F3 implements InterfaceC51254wq2 {

    /* renamed from: b */
    public final Set<InterfaceC32227Cq2> f8502b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public boolean f8503c;

    /* renamed from: d */
    public boolean f8504d;

    @Override // p000.InterfaceC51254wq2
    /* renamed from: a */
    public void mo6272a(InterfaceC32227Cq2 interfaceC32227Cq2) {
        this.f8502b.add(interfaceC32227Cq2);
        if (this.f8504d) {
            interfaceC32227Cq2.onDestroy();
        } else if (this.f8503c) {
            interfaceC32227Cq2.onStart();
        } else {
            interfaceC32227Cq2.onStop();
        }
    }

    @Override // p000.InterfaceC51254wq2
    /* renamed from: b */
    public void mo6271b(InterfaceC32227Cq2 interfaceC32227Cq2) {
        this.f8502b.remove(interfaceC32227Cq2);
    }

    /* renamed from: c */
    public void m108063c() {
        this.f8504d = true;
        for (InterfaceC32227Cq2 interfaceC32227Cq2 : C47029pi6.m18916j(this.f8502b)) {
            interfaceC32227Cq2.onDestroy();
        }
    }

    /* renamed from: d */
    public void m108062d() {
        this.f8503c = true;
        for (InterfaceC32227Cq2 interfaceC32227Cq2 : C47029pi6.m18916j(this.f8502b)) {
            interfaceC32227Cq2.onStart();
        }
    }

    /* renamed from: e */
    public void m108061e() {
        this.f8503c = false;
        for (InterfaceC32227Cq2 interfaceC32227Cq2 : C47029pi6.m18916j(this.f8502b)) {
            interfaceC32227Cq2.onStop();
        }
    }
}
