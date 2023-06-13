package p000;

import androidx.lifecycle.AbstractC11719f;
import com.uber.autodispose.lifecycle.CorrespondingEventsFunction;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lgv5;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "Landroidx/lifecycle/f$a;", "Lio/reactivex/Observable;", "c2", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "O8", "e", "event", "", "i", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/subjects/a;", "lifecycleEventSubject", "<init>", "()V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gv5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41821gv5 implements LifecycleScopeProvider<AbstractC11719f.EnumC11720a> {

    /* renamed from: b */
    public final C24552a<AbstractC11719f.EnumC11720a> f84456b;

    public C41821gv5() {
        C24552a<AbstractC11719f.EnumC11720a> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Lifecycle.Event>()");
        this.f84456b = m31922e;
    }

    /* renamed from: b */
    public static final AbstractC11719f.EnumC11720a m37324b(AbstractC11719f.EnumC11720a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AbstractC11719f.EnumC11720a.ON_DESTROY;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: O8 */
    public CorrespondingEventsFunction<AbstractC11719f.EnumC11720a> mo37326O8() {
        return new CorrespondingEventsFunction() { // from class: fv5
            @Override // com.uber.autodispose.lifecycle.CorrespondingEventsFunction, io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                AbstractC11719f.EnumC11720a m37324b;
                m37324b = C41821gv5.m37324b((AbstractC11719f.EnumC11720a) obj);
                return m37324b;
            }
        };
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: c2 */
    public Observable<AbstractC11719f.EnumC11720a> mo37323c2() {
        Observable<AbstractC11719f.EnumC11720a> hide = this.f84456b.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "lifecycleEventSubject.hide()");
        return hide;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: e */
    public AbstractC11719f.EnumC11720a peekLifecycle() {
        return this.f84456b.getValue();
    }

    /* renamed from: i */
    public final void m37321i(AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f84456b.onNext(event);
    }
}
