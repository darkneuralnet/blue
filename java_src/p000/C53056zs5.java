package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import p000.C38856bx2;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Lzs5;", "E", "Lxs5;", "Lbx2$c;", "otherOp", "LuX5;", "T", "", "P", "LCl0;", "closed", "R", "", "toString", "e", "Ljava/lang/Object;", "Q", "()Ljava/lang/Object;", "pollResult", "LWc0;", "f", "LWc0;", "cont", "<init>", "(Ljava/lang/Object;LWc0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: zs5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C53056zs5<E> extends AbstractC51870xs5 {

    /* renamed from: e */
    public final E f122413e;
    @JvmField

    /* renamed from: f */
    public final InterfaceC36779Wc0<Unit> f122414f;

    /* JADX WARN: Multi-variable type inference failed */
    public C53056zs5(E e, InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
        this.f122413e = e;
        this.f122414f = interfaceC36779Wc0;
    }

    @Override // p000.AbstractC51870xs5
    /* renamed from: P */
    public void mo198P() {
        this.f122414f.mo76800B(C37247Yc0.f46071a);
    }

    @Override // p000.AbstractC51870xs5
    /* renamed from: Q */
    public E mo197Q() {
        return this.f122413e;
    }

    @Override // p000.AbstractC51870xs5
    /* renamed from: R */
    public void mo196R(C32180Cl0<?> c32180Cl0) {
        InterfaceC36779Wc0<Unit> interfaceC36779Wc0 = this.f122414f;
        Result.Companion companion = Result.Companion;
        interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(c32180Cl0.m111746Z())));
    }

    @Override // p000.AbstractC51870xs5
    /* renamed from: T */
    public C49885uX5 mo195T(C38856bx2.C13354c c13354c) {
        C38856bx2.AbstractC13352a abstractC13352a;
        InterfaceC36779Wc0<Unit> interfaceC36779Wc0 = this.f122414f;
        Unit unit = Unit.INSTANCE;
        if (c13354c != null) {
            abstractC13352a = c13354c.f59828c;
        } else {
            abstractC13352a = null;
        }
        if (interfaceC36779Wc0.mo76799C(unit, abstractC13352a) == null) {
            return null;
        }
        if (c13354c != null) {
            c13354c.m62078d();
        }
        return C37247Yc0.f46071a;
    }

    @Override // p000.C38856bx2
    public String toString() {
        return C39783dV0.m44216a(this) + '@' + C39783dV0.m44215b(this) + CoreConstants.LEFT_PARENTHESIS_CHAR + mo197Q() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
