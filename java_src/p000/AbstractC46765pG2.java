package p000;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\u0007\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LpG2;", "LSC0;", "", "toString", "L", "G", "()LpG2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: pG2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46765pG2 extends SC0 {
    /* renamed from: G */
    public abstract AbstractC46765pG2 mo14156G();

    /* renamed from: L */
    public final String m19682L() {
        AbstractC46765pG2 abstractC46765pG2;
        AbstractC46765pG2 m84376c = T41.m84376c();
        if (this == m84376c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC46765pG2 = m84376c.mo14156G();
        } catch (UnsupportedOperationException unused) {
            abstractC46765pG2 = null;
        }
        if (this != abstractC46765pG2) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // p000.SC0
    public String toString() {
        String m19682L = m19682L();
        if (m19682L == null) {
            return C39783dV0.m44216a(this) + '@' + C39783dV0.m44215b(this);
        }
        return m19682L;
    }
}
