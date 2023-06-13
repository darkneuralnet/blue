package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Ls51;", "LMc0;", "", "cause", "", C17296a.f69688o, "", "toString", "Lo51;", "b", "Lo51;", "handle", "<init>", "(Lo51;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: s51  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48438s51 extends AbstractC34439Mc0 {

    /* renamed from: b */
    public final InterfaceC46067o51 f108230b;

    public C48438s51(InterfaceC46067o51 interfaceC46067o51) {
        this.f108230b = interfaceC46067o51;
    }

    @Override // p000.AbstractC34673Nc0
    /* renamed from: a */
    public void mo14797a(Throwable th) {
        this.f108230b.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo14797a(th);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f108230b + ']';
    }
}
