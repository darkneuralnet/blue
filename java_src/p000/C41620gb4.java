package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.WorkOrder;
import co.bird.api.response.QCAutoCheckResponseBody;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.AbstractC24569h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"Lgb4;", "LXa4;", "Lco/bird/android/model/WorkOrder;", "workOrder", "", C17296a.f69688o, "LaG6;", "LaG6;", "workOrderManager", "Lhb4;", "b", "Lhb4;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTa4;", DateTokenConverter.CONVERTER_KEY, "LTa4;", "converter", "Lio/reactivex/subjects/h;", "", "Lco/bird/android/model/QCAutoCheck;", "e", "Lio/reactivex/subjects/h;", "qcAutoChecksSubject", "LAb4;", "f", "LAb4;", "qualityControlAnalyticsManager", "<init>", "(LaG6;Lhb4;Lcom/uber/autodispose/ScopeProvider;LTa4;Lio/reactivex/subjects/h;LAb4;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQCAutoChecksPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QCAutoChecksPresenter.kt\nco/bird/android/qualitycontrol/autocheck/QCAutoChecksPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,57:1\n180#2:58\n180#2:59\n199#2:60\n*S KotlinDebug\n*F\n+ 1 QCAutoChecksPresenter.kt\nco/bird/android/qualitycontrol/autocheck/QCAutoChecksPresenterImpl\n*L\n35#1:58\n42#1:59\n51#1:60\n*E\n"})
/* renamed from: gb4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41620gb4 implements InterfaceC36999Xa4 {

    /* renamed from: a */
    public final InterfaceC37857aG6 f82463a;

    /* renamed from: b */
    public final InterfaceC42213hb4 f82464b;

    /* renamed from: c */
    public final ScopeProvider f82465c;

    /* renamed from: d */
    public final InterfaceC36063Ta4 f82466d;

    /* renamed from: e */
    public final AbstractC24569h<List<QCAutoCheck>> f82467e;

    /* renamed from: f */
    public final InterfaceC31626Ab4 f82468f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gb4$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20928a extends FunctionReferenceImpl implements Function1<List<? extends QCAutoCheck>, AbstractC23442F<List<? extends C3023H6>>> {
        public C20928a(Object obj) {
            super(1, obj, InterfaceC36063Ta4.class, "convert", "convert(Ljava/util/List;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<List<C3023H6>> invoke(List<QCAutoCheck> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC36063Ta4) this.receiver).mo79735a(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gb4$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20929b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C20929b(Object obj) {
            super(1, obj, InterfaceC42213hb4.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC42213hb4) this.receiver).mo33768b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gb4$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20930c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C20930c f82469b = new C20930c();

        public C20930c() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lco/bird/android/model/QCAutoCheck;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gb4$d */
    /* loaded from: classes4.dex */
    public static final class C20931d extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends QCAutoCheck>>, Unit> {
        public C20931d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends List<? extends QCAutoCheck>> pair) {
            invoke2((Pair<Unit, ? extends List<QCAutoCheck>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, ? extends List<QCAutoCheck>> pair) {
            C41620gb4.this.f82464b.dismiss();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lco/bird/android/model/QCAutoCheck;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gb4$e */
    /* loaded from: classes4.dex */
    public static final class C20932e extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends QCAutoCheck>>, Unit> {
        public C20932e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends List<? extends QCAutoCheck>> pair) {
            invoke2((Pair<Unit, ? extends List<QCAutoCheck>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, ? extends List<QCAutoCheck>> pair) {
            C41620gb4.this.f82464b.dismiss();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/QCAutoCheckResponseBody;", "kotlin.jvm.PlatformType", "qcAutoChecksResponse", "", C17296a.f69688o, "(Lco/bird/api/response/QCAutoCheckResponseBody;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gb4$f */
    /* loaded from: classes4.dex */
    public static final class C20933f extends Lambda implements Function1<QCAutoCheckResponseBody, Unit> {
        public C20933f() {
            super(1);
        }

        /* renamed from: a */
        public final void m39090a(QCAutoCheckResponseBody qCAutoCheckResponseBody) {
            C41620gb4.this.f82468f.mo113829a(qCAutoCheckResponseBody.getChecks());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(QCAutoCheckResponseBody qCAutoCheckResponseBody) {
            m39090a(qCAutoCheckResponseBody);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/QCAutoCheckResponseBody;", "kotlin.jvm.PlatformType", "qcAutoChecksResponse", "", C17296a.f69688o, "(Lco/bird/api/response/QCAutoCheckResponseBody;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gb4$g */
    /* loaded from: classes4.dex */
    public static final class C20934g extends Lambda implements Function1<QCAutoCheckResponseBody, Unit> {
        public C20934g() {
            super(1);
        }

        /* renamed from: a */
        public final void m39089a(QCAutoCheckResponseBody qCAutoCheckResponseBody) {
            C41620gb4.this.f82467e.onNext(qCAutoCheckResponseBody.getChecks());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(QCAutoCheckResponseBody qCAutoCheckResponseBody) {
            m39089a(qCAutoCheckResponseBody);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gb4$h */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20935h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C20935h f82474b = new C20935h();

        public C20935h() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    public C41620gb4(InterfaceC37857aG6 workOrderManager, InterfaceC42213hb4 ui, ScopeProvider scopeProvider, InterfaceC36063Ta4 converter, AbstractC24569h<List<QCAutoCheck>> qcAutoChecksSubject, InterfaceC31626Ab4 qualityControlAnalyticsManager) {
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(qcAutoChecksSubject, "qcAutoChecksSubject");
        Intrinsics.checkNotNullParameter(qualityControlAnalyticsManager, "qualityControlAnalyticsManager");
        this.f82463a = workOrderManager;
        this.f82464b = ui;
        this.f82465c = scopeProvider;
        this.f82466d = converter;
        this.f82467e = qcAutoChecksSubject;
        this.f82468f = qualityControlAnalyticsManager;
        final C20928a c20928a = new C20928a(converter);
        Observable observeOn = qcAutoChecksSubject.flatMapSingle(new InterfaceC23492o() { // from class: Ya4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m39099j;
                m39099j = C41620gb4.m39099j(Function1.this, obj);
                return m39099j;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "qcAutoChecksSubject\n    …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20929b c20929b = new C20929b(ui);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Za4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41620gb4.m39098k(Function1.this, obj);
            }
        };
        final C20930c c20930c = C20930c.f82469b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ab4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41620gb4.m39097l(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(ui.doneClicks(), qcAutoChecksSubject);
        final C20931d c20931d = new C20931d();
        Observable observeOn2 = m31950a.doOnNext(new InterfaceC23484g() { // from class: bb4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41620gb4.m39096m(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.doneClicks()\n      .w…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20932e c20932e = new C20932e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: cb4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41620gb4.m39095n(Function1.this, obj);
            }
        });
    }

    /* renamed from: j */
    public static final InterfaceC23447K m39099j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m39098k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m39097l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m39096m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m39095n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m39094o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m39093p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m39092q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC36999Xa4
    /* renamed from: a */
    public void mo39108a(WorkOrder workOrder) {
        Intrinsics.checkNotNullParameter(workOrder, "workOrder");
        AbstractC23442F m70883l = C38096ag5.m70883l(C28237sD.progress$default(this.f82463a.mo19638o(workOrder.getId()), this.f82464b, 0, 2, (Object) null));
        final C20933f c20933f = new C20933f();
        AbstractC23442F m33101w = m70883l.m33101w(new InterfaceC23484g() { // from class: db4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41620gb4.m39094o(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun onCreate(wo…)\n      }, Timber::e)\n  }");
        Object m33135e = m33101w.m33135e(AutoDispose.m45239a(this.f82465c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20934g c20934g = new C20934g();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: eb4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41620gb4.m39093p(Function1.this, obj);
            }
        };
        final C20935h c20935h = C20935h.f82474b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: fb4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41620gb4.m39092q(Function1.this, obj);
            }
        });
    }
}
