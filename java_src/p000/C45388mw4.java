package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lmw4;", "LlG;", "", "cause", "", C17296a.f69688o, "", "toString", "Lbx2;", "b", "Lbx2;", "node", "<init>", "(Lbx2;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: mw4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45388mw4 extends AbstractC25669lG {

    /* renamed from: b */
    public final C38856bx2 f99081b;

    public C45388mw4(C38856bx2 c38856bx2) {
        this.f99081b = c38856bx2;
    }

    @Override // p000.AbstractC34673Nc0
    /* renamed from: a */
    public void mo14797a(Throwable th) {
        this.f99081b.mo62093J();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo14797a(th);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f99081b + ']';
    }
}
