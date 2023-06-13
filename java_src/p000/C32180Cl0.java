package p000;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p000.C38856bx2;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, m28432d2 = {"LCl0;", "E", "Lxs5;", "Lls4;", "Lbx2$c;", "otherOp", "LuX5;", "T", "", "P", "value", "g", "(Ljava/lang/Object;Lbx2$c;)LuX5;", "f", "(Ljava/lang/Object;)V", "closed", "R", "", "toString", "", "e", "Ljava/lang/Throwable;", "closeCause", "Z", "()Ljava/lang/Throwable;", "sendException", "Y", "receiveException", "V", "()LCl0;", "offerResult", "W", "pollResult", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Cl0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C32180Cl0<E> extends AbstractC51870xs5 implements InterfaceC44755ls4<E> {
    @JvmField

    /* renamed from: e */
    public final Throwable f4627e;

    public C32180Cl0(Throwable th) {
        this.f4627e = th;
    }

    @Override // p000.AbstractC51870xs5
    /* renamed from: P */
    public void mo198P() {
    }

    @Override // p000.AbstractC51870xs5
    /* renamed from: R */
    public void mo196R(C32180Cl0<?> c32180Cl0) {
    }

    @Override // p000.AbstractC51870xs5
    /* renamed from: T */
    public C49885uX5 mo195T(C38856bx2.C13354c c13354c) {
        C49885uX5 c49885uX5 = C37247Yc0.f46071a;
        if (c13354c != null) {
            c13354c.m62078d();
        }
        return c49885uX5;
    }

    @Override // p000.InterfaceC44755ls4
    /* renamed from: V */
    public C32180Cl0<E> mo26721a() {
        return this;
    }

    @Override // p000.AbstractC51870xs5
    /* renamed from: W */
    public C32180Cl0<E> mo197Q() {
        return this;
    }

    /* renamed from: Y */
    public final Throwable m111747Y() {
        Throwable th = this.f4627e;
        return th == null ? new ClosedReceiveChannelException("Channel was closed") : th;
    }

    /* renamed from: Z */
    public final Throwable m111746Z() {
        Throwable th = this.f4627e;
        return th == null ? new ClosedSendChannelException("Channel was closed") : th;
    }

    @Override // p000.InterfaceC44755ls4
    /* renamed from: f */
    public void mo26720f(E e) {
    }

    @Override // p000.InterfaceC44755ls4
    /* renamed from: g */
    public C49885uX5 mo26719g(E e, C38856bx2.C13354c c13354c) {
        C49885uX5 c49885uX5 = C37247Yc0.f46071a;
        if (c13354c != null) {
            c13354c.m62078d();
        }
        return c49885uX5;
    }

    @Override // p000.C38856bx2
    public String toString() {
        return "Closed@" + C39783dV0.m44215b(this) + '[' + this.f4627e + ']';
    }
}
