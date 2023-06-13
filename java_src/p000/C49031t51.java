package p000;

import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lt51;", "LPh2;", "", "cause", "", "P", "Lo51;", "f", "Lo51;", "handle", "<init>", "(Lo51;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: t51  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49031t51 extends AbstractC35188Ph2 {

    /* renamed from: f */
    public final InterfaceC46067o51 f109811f;

    public C49031t51(InterfaceC46067o51 interfaceC46067o51) {
        this.f109811f = interfaceC46067o51;
    }

    @Override // p000.AbstractC48901ss0
    /* renamed from: P */
    public void mo13153P(Throwable th) {
        this.f109811f.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo13153P(th);
        return Unit.INSTANCE;
    }
}
