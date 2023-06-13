package p000;

import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LlN4;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "run", "LSC0;", "b", "LSC0;", "dispatcher", "LWc0;", "c", "LWc0;", "continuation", "<init>", "(LSC0;LWc0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: lN4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44458lN4 implements Runnable {

    /* renamed from: b */
    public final SC0 f95956b;

    /* renamed from: c */
    public final InterfaceC36779Wc0<Unit> f95957c;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC44458lN4(SC0 sc0, InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
        this.f95956b = sc0;
        this.f95957c = interfaceC36779Wc0;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f95957c.mo76787S(this.f95956b, Unit.INSTANCE);
    }
}
