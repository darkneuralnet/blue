package p000;

import java.util.concurrent.Future;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Ln51;", "Lo51;", "", "dispose", "", "toString", "Ljava/util/concurrent/Future;", "b", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: n51  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45474n51 implements InterfaceC46067o51 {

    /* renamed from: b */
    public final Future<?> f99336b;

    public C45474n51(Future<?> future) {
        this.f99336b = future;
    }

    @Override // p000.InterfaceC46067o51
    public void dispose() {
        this.f99336b.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f99336b + ']';
    }
}
