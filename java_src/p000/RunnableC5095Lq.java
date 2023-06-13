package p000;

import com.skydoves.balloon.Balloon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"LLq;", "Ljava/lang/Runnable;", "", "run", "Lcom/skydoves/balloon/Balloon;", "b", "Lcom/skydoves/balloon/Balloon;", "getBalloon", "()Lcom/skydoves/balloon/Balloon;", "balloon", "<init>", "(Lcom/skydoves/balloon/Balloon;)V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Lq */
/* loaded from: classes6.dex */
public final class RunnableC5095Lq implements Runnable {

    /* renamed from: b */
    public final Balloon f22099b;

    public RunnableC5095Lq(Balloon balloon) {
        Intrinsics.checkNotNullParameter(balloon, "balloon");
        this.f22099b = balloon;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f22099b.m45739O();
    }
}
