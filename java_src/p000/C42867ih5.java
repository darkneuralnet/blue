package p000;

import io.reactivex.InterfaceC23470e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lih5;", "Lio/reactivex/e;", "", "e", "", "onComplete", "", "error", "onError", "b", "Lio/reactivex/e;", "emitter", "<init>", "(Lio/reactivex/e;)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ih5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42867ih5 implements InterfaceC23470e {

    /* renamed from: b */
    public final InterfaceC23470e f87755b;

    public C42867ih5(InterfaceC23470e emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f87755b = emitter;
    }

    @Override // io.reactivex.InterfaceC23470e
    /* renamed from: e */
    public boolean mo32897e() {
        return this.f87755b.mo32897e();
    }

    @Override // io.reactivex.InterfaceC23470e
    public void onComplete() {
        if (!this.f87755b.mo32897e()) {
            this.f87755b.onComplete();
        }
    }

    @Override // io.reactivex.InterfaceC23470e
    public void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!this.f87755b.mo32897e()) {
            this.f87755b.onError(error);
        }
    }
}
