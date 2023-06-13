package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0003R\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LK41;", "", "", "h", "i", "g", "e", "", "b", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Runnable;", "runnable", "c", "f", C17296a.f69688o, "Z", "paused", "finished", "isDraining", "Ljava/util/Queue;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Queue;", "queue", "<init>", "()V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: K41 */
/* loaded from: classes.dex */
public final class K41 {

    /* renamed from: b */
    public boolean f19026b;

    /* renamed from: c */
    public boolean f19027c;

    /* renamed from: a */
    public boolean f19025a = true;

    /* renamed from: d */
    public final Queue<Runnable> f19028d = new ArrayDeque();

    /* renamed from: d */
    public static final void m99268d(K41 this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.m99266f(runnable);
    }

    /* renamed from: b */
    public final boolean m99270b() {
        return this.f19026b || !this.f19025a;
    }

    /* renamed from: c */
    public final void m99269c(CoroutineContext context, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC46765pG2 mo14156G = T41.m84376c().mo14156G();
        if (!mo14156G.mo14157B(context) && !m99270b()) {
            m99266f(runnable);
        } else {
            mo14156G.mo14150y(context, new Runnable() { // from class: J41
                @Override // java.lang.Runnable
                public final void run() {
                    K41.m99268d(K41.this, runnable);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m99267e() {
        if (this.f19027c) {
            return;
        }
        try {
            this.f19027c = true;
            while ((!this.f19028d.isEmpty()) && m99270b()) {
                Runnable poll = this.f19028d.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.f19027c = false;
        }
    }

    /* renamed from: f */
    public final void m99266f(Runnable runnable) {
        if (this.f19028d.offer(runnable)) {
            m99267e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    /* renamed from: g */
    public final void m99265g() {
        this.f19026b = true;
        m99267e();
    }

    /* renamed from: h */
    public final void m99264h() {
        this.f19025a = true;
    }

    /* renamed from: i */
    public final void m99263i() {
        if (!this.f19025a) {
            return;
        }
        if (!this.f19026b) {
            this.f19025a = false;
            m99267e();
            return;
        }
        throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
    }
}
