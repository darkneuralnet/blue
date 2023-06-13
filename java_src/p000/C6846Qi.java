package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23437E;
import io.reactivex.Observable;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\"\u0010\r\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LQi;", "LOi;", "LNi;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "Lio/reactivex/E;", "Lio/reactivex/E;", "submissionScheduler", "Lma4;", "kotlin.jvm.PlatformType", "b", "Lma4;", "_events", "Lio/reactivex/Observable;", "c", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "events", "<init>", "()V", "impl"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qi */
/* loaded from: classes2.dex */
public final class C6846Qi implements InterfaceC6098Oi {

    /* renamed from: a */
    public final AbstractC23437E f30768a;

    /* renamed from: b */
    public final C45168ma4<AbstractC5657Ni> f30769b;

    /* renamed from: c */
    public final Observable<AbstractC5657Ni> f30770c;

    public C6846Qi() {
        AbstractC23437E m31931d = C24542a.m31931d();
        Intrinsics.checkNotNullExpressionValue(m31931d, "single()");
        this.f30768a = m31931d;
        C45168ma4<AbstractC5657Ni> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<AppContext>()");
        this.f30769b = m25409g;
        Observable<AbstractC5657Ni> observeOn = m25409g.observeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(observeOn, "_events.observeOn(Schedulers.io())");
        this.f30770c = observeOn;
    }

    /* renamed from: d */
    public static final void m88169d(C6846Qi this$0, AbstractC5657Ni context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.f30769b.accept(context);
    }

    @Override // p000.InterfaceC6098Oi
    /* renamed from: a */
    public void mo88172a(final AbstractC5657Ni context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30768a.mo32324d(new Runnable() { // from class: Pi
            @Override // java.lang.Runnable
            public final void run() {
                C6846Qi.m88169d(C6846Qi.this, context);
            }
        });
    }

    @Override // p000.InterfaceC6098Oi
    /* renamed from: b */
    public Observable<AbstractC5657Ni> mo88171b() {
        return this.f30770c;
    }
}
