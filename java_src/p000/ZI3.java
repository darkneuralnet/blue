package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.CommandCenterBody;
import co.bird.android.model.RepairLog;
import co.bird.android.model.persistence.Bird;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LZI3;", "", "", "birdId", "", "h", "", "e", "p", "Lom3;", C17296a.f69688o, "Lom3;", "operatorManager", "LTn0;", "b", "LTn0;", "commandCenterManager", "LRI3;", "c", "LRI3;", "converter", "LaJ3;", DateTokenConverter.CONVERTER_KEY, "LaJ3;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lom3;LTn0;LRI3;LaJ3;Lcom/uber/autodispose/ScopeProvider;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPastRepairsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PastRepairsPresenter.kt\nco/bird/android/feature/repair/pastrepairs/PastRepairsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n180#2:53\n199#2:54\n1#3:55\n*S KotlinDebug\n*F\n+ 1 PastRepairsPresenter.kt\nco/bird/android/feature/repair/pastrepairs/PastRepairsPresenter\n*L\n33#1:53\n43#1:54\n*E\n"})
/* renamed from: ZI3 */
/* loaded from: classes3.dex */
public final class ZI3 {

    /* renamed from: a */
    public final InterfaceC46473om3 f48204a;

    /* renamed from: b */
    public final InterfaceC36176Tn0 f48205b;

    /* renamed from: c */
    public final RI3 f48206c;

    /* renamed from: d */
    public final C37881aJ3 f48207d;

    /* renamed from: e */
    public final ScopeProvider f48208e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZI3$a */
    /* loaded from: classes3.dex */
    public static final class C10229a extends Lambda implements Function1<Bird, Unit> {
        public C10229a() {
            super(1);
        }

        /* renamed from: a */
        public final void m73319a(Bird bird) {
            C37881aJ3 c37881aJ3 = ZI3.this.f48207d;
            String code = bird.getCode();
            c37881aJ3.m71663t("#" + code);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m73319a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/CommandCenterBody;", "commandCenter", "", "Lco/bird/android/model/RepairLog;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/CommandCenterBody;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZI3$b */
    /* loaded from: classes3.dex */
    public static final class C10230b extends Lambda implements Function1<CommandCenterBody, List<? extends RepairLog>> {

        /* renamed from: g */
        public static final C10230b f48210g = new C10230b();

        public C10230b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<RepairLog> invoke(CommandCenterBody commandCenter) {
            Intrinsics.checkNotNullParameter(commandCenter, "commandCenter");
            return commandCenter.getRepairLogs();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZI3$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10231c extends FunctionReferenceImpl implements Function1<List<? extends RepairLog>, List<? extends C3023H6>> {
        public C10231c(Object obj) {
            super(1, obj, RI3.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(List<RepairLog> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((RI3) this.receiver).m86973a(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZI3$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10232d extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C10232d(Object obj) {
            super(1, obj, C37881aJ3.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37881aJ3) this.receiver).m71664b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZI3$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10233e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10233e(Object obj) {
            super(1, obj, ZI3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ZI3) this.receiver).m73320p(p0);
        }
    }

    public ZI3(InterfaceC46473om3 operatorManager, InterfaceC36176Tn0 commandCenterManager, RI3 converter, C37881aJ3 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(commandCenterManager, "commandCenterManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f48204a = operatorManager;
        this.f48205b = commandCenterManager;
        this.f48206c = converter;
        this.f48207d = ui;
        this.f48208e = scopeProvider;
    }

    /* renamed from: i */
    public static final void m73327i(final ZI3 this$0, final String birdId, InterfaceC23436D it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdId, "$birdId");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f48204a.mo8133S0(birdId).m33043l(Observable.defer(new Callable() { // from class: YI3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m73326j;
                m73326j = ZI3.m73326j(ZI3.this, birdId);
                return m73326j;
            }
        }));
    }

    /* renamed from: j */
    public static final InterfaceC23434B m73326j(ZI3 this$0, String birdId) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdId, "$birdId");
        return this$0.f48204a.mo8118a(birdId);
    }

    /* renamed from: k */
    public static final void m73325k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final List m73324l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final List m73323m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m73322n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m73321o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public final void m73328h(final String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Observable<Bird> observeOn = this.f48204a.mo8118a(birdId).switchIfEmpty(new InterfaceC23434B() { // from class: SI3
            @Override // io.reactivex.InterfaceC23434B
            public final void subscribe(InterfaceC23436D interfaceC23436D) {
                ZI3.m73327i(ZI3.this, birdId, interfaceC23436D);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "operatorManager.streamBi…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f48208e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10229a c10229a = new C10229a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: TI3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZI3.m73325k(Function1.this, obj);
            }
        });
        AbstractC23442F m70883l = C38096ag5.m70883l(C28237sD.progress$default(this.f48205b.mo80872b(birdId), this.f48207d, 0, 2, (Object) null));
        final C10230b c10230b = C10230b.f48210g;
        AbstractC23442F m33152N = m70883l.m33157I(new InterfaceC23492o() { // from class: UI3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m73324l;
                m73324l = ZI3.m73324l(Function1.this, obj);
                return m73324l;
            }
        }).m33152N(C24542a.m31934a());
        final C10231c c10231c = new C10231c(this.f48206c);
        AbstractC23442F m33152N2 = m33152N.m33157I(new InterfaceC23492o() { // from class: VI3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m73323m;
                m73323m = ZI3.m73323m(Function1.this, obj);
                return m73323m;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N2, "commandCenterManager.get…dSchedulers.mainThread())");
        Object m33135e = m33152N2.m33135e(AutoDispose.m45239a(this.f48208e));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10232d c10232d = new C10232d(this.f48207d);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: WI3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZI3.m73322n(Function1.this, obj);
            }
        };
        final C10233e c10233e = new C10233e(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: XI3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZI3.m73321o(Function1.this, obj);
            }
        });
    }

    /* renamed from: p */
    public final void m73320p(Throwable th) {
        RetrofitException retrofitException;
        C41318g46.m40159e(th);
        Unit unit = null;
        if (th instanceof RetrofitException) {
            retrofitException = (RetrofitException) th;
        } else {
            retrofitException = null;
        }
        if (retrofitException != null) {
            this.f48207d.error(retrofitException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f48207d.errorGeneric();
        }
    }
}
