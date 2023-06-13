package com.bumptech.glide.manager;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes5.dex */
final class LifecycleLifecycle implements InterfaceC51254wq2, InterfaceC32929Fq2 {

    /* renamed from: b */
    public final Set<InterfaceC32227Cq2> f69182b = new HashSet();

    /* renamed from: c */
    public final AbstractC11719f f69183c;

    public LifecycleLifecycle(AbstractC11719f abstractC11719f) {
        this.f69183c = abstractC11719f;
        abstractC11719f.mo67008a(this);
    }

    @Override // p000.InterfaceC51254wq2
    /* renamed from: a */
    public void mo6272a(InterfaceC32227Cq2 interfaceC32227Cq2) {
        this.f69182b.add(interfaceC32227Cq2);
        if (this.f69183c.mo67007b() == AbstractC11719f.EnumC11724b.DESTROYED) {
            interfaceC32227Cq2.onDestroy();
        } else if (this.f69183c.mo67007b().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
            interfaceC32227Cq2.onStart();
        } else {
            interfaceC32227Cq2.onStop();
        }
    }

    @Override // p000.InterfaceC51254wq2
    /* renamed from: b */
    public void mo6271b(InterfaceC32227Cq2 interfaceC32227Cq2) {
        this.f69182b.remove(interfaceC32227Cq2);
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        for (InterfaceC32227Cq2 interfaceC32227Cq2 : C47029pi6.m18916j(this.f69182b)) {
            interfaceC32227Cq2.onDestroy();
        }
        lifecycleOwner.getLifecycle().mo67006d(this);
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        for (InterfaceC32227Cq2 interfaceC32227Cq2 : C47029pi6.m18916j(this.f69182b)) {
            interfaceC32227Cq2.onStart();
        }
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        for (InterfaceC32227Cq2 interfaceC32227Cq2 : C47029pi6.m18916j(this.f69182b)) {
            interfaceC32227Cq2.onStop();
        }
    }
}
