package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LPh2;", "Lss0;", "Lo51;", "Li12;", "", "dispose", "", "toString", "LSh2;", "e", "LSh2;", "Q", "()LSh2;", "R", "(LSh2;)V", "job", "", "b", "()Z", "isActive", "LM83;", "()LM83;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Ph2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC35188Ph2 extends AbstractC48901ss0 implements InterfaceC46067o51, InterfaceC42470i12 {

    /* renamed from: e */
    public C35890Sh2 f28909e;

    /* renamed from: Q */
    public final C35890Sh2 m89917Q() {
        C35890Sh2 c35890Sh2 = this.f28909e;
        if (c35890Sh2 != null) {
            return c35890Sh2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    /* renamed from: R */
    public final void m89916R(C35890Sh2 c35890Sh2) {
        this.f28909e = c35890Sh2;
    }

    @Override // p000.InterfaceC42470i12
    /* renamed from: b */
    public boolean mo35387b() {
        return true;
    }

    @Override // p000.InterfaceC46067o51
    public void dispose() {
        m89917Q().m85111O0(this);
    }

    @Override // p000.InterfaceC42470i12
    /* renamed from: e */
    public M83 mo35386e() {
        return null;
    }

    @Override // p000.C38856bx2
    public String toString() {
        return C39783dV0.m44216a(this) + '@' + C39783dV0.m44215b(this) + "[job@" + C39783dV0.m44215b(m89917Q()) + ']';
    }
}
