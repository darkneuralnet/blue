package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LMa1;", "Li12;", "", "toString", "", "b", "Z", "()Z", "isActive", "LM83;", "e", "()LM83;", "list", "<init>", "(Z)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Ma1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34422Ma1 implements InterfaceC42470i12 {

    /* renamed from: b */
    public final boolean f23254b;

    public C34422Ma1(boolean z) {
        this.f23254b = z;
    }

    @Override // p000.InterfaceC42470i12
    /* renamed from: b */
    public boolean mo35387b() {
        return this.f23254b;
    }

    @Override // p000.InterfaceC42470i12
    /* renamed from: e */
    public M83 mo35386e() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo35387b() ? "Active" : "New");
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}
