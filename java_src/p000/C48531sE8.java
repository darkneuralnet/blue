package p000;

import java.util.WeakHashMap;
/* renamed from: sE8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48531sE8 extends ThreadLocal<C39036cF8> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ C39036cF8 initialValue() {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        C39036cF8 c39036cF8 = new C39036cF8(Q48.m88951b());
        Thread currentThread = Thread.currentThread();
        weakHashMap = FE8.f9067b;
        synchronized (weakHashMap) {
            weakHashMap2 = FE8.f9067b;
            weakHashMap2.put(currentThread, c39036cF8);
        }
        return c39036cF8;
    }
}
