package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24552a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC48362rx4;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: R extends rx4<? super S>
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0010\b\u0000\u0010\u0002 \u0000*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u000f\u0012\u0006\u0010\u0015\u001a\u00028\u0001¢\u0006\u0004\b \u0010\u000eJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\tJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011R\u0014\u0010\u0015\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198D@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m28432d2 = {"Lf1;", "Lrx4;", "R", "S", "", "renderer", "", "consume", "(Lrx4;)V", "Lkotlin/Function1;", "reducer", "i", TransferTable.COLUMN_STATE, "h", "(Ljava/lang/Object;)V", "k", "()Ljava/lang/Object;", "Lio/reactivex/Observable;", "l", "b", "Ljava/lang/Object;", "initial", "Lio/reactivex/subjects/a;", "c", "Lio/reactivex/subjects/a;", "Lcom/uber/autodispose/ScopeProvider;", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "j", "()Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "<init>", "core-basemrp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAbstractPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPresenter.kt\nco/bird/android/core/mrp/AbstractPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,64:1\n180#2:65\n*S KotlinDebug\n*F\n+ 1 AbstractPresenter.kt\nco/bird/android/core/mrp/AbstractPresenter\n*L\n38#1:65\n*E\n"})
/* renamed from: f1 */
/* loaded from: classes2.dex */
public abstract class AbstractC20169f1<R extends InterfaceC48362rx4<? super S>, S> {

    /* renamed from: b */
    public final S f79285b;

    /* renamed from: c */
    public final C24552a<S> f79286c;

    /* renamed from: d */
    public ScopeProvider f79287d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0010\b\u0000\u0010\u0001 \u0000*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00022\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lrx4;", "R", "S", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f1$a */
    /* loaded from: classes2.dex */
    public static final class C20170a extends Lambda implements Function1<S, Unit> {

        /* renamed from: g */
        public final /* synthetic */ R f79288g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20170a(R r) {
            super(1);
            this.f79288g = r;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C20170a) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(S s) {
            this.f79288g.render(s);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\u0010\b\u0000\u0010\u0001 \u0000*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lrx4;", "R", "S", "", "kotlin.jvm.PlatformType", "e", "", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f1$b */
    /* loaded from: classes2.dex */
    public static final class C20171b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ R f79289g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC20169f1<R, S> f79290h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20171b(R r, AbstractC20169f1<? super R, S> abstractC20169f1) {
            super(1);
            this.f79289g = r;
            this.f79290h = abstractC20169f1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            R r = this.f79289g;
            C24552a c24552a = this.f79290h.f79286c;
            C41318g46.m40158f(th, "render: " + r + ", state: " + c24552a, new Object[0]);
        }
    }

    public AbstractC20169f1(S s) {
        this.f79285b = s;
        C24552a<S> m31921g = C24552a.m31921g(s);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(initial)");
        this.f79286c = m31921g;
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        this.f79287d = UNBOUND;
    }

    /* renamed from: f */
    public static final void m42282f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m42281g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public void consume(R renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f79287d = renderer;
        Observable<S> observeOn = this.f79286c.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "state\n      .observeOn(A…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20170a c20170a = new C20170a(renderer);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: d1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20169f1.m42282f(Function1.this, obj);
            }
        };
        final C20171b c20171b = new C20171b(renderer, this);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: e1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20169f1.m42281g(Function1.this, obj);
            }
        });
    }

    /* renamed from: h */
    public final void m42280h(S s) {
        this.f79286c.onNext(s);
    }

    /* renamed from: i */
    public final void m42279i(Function1<? super S, ? extends S> reducer) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Object obj = (S) this.f79286c.getValue();
        if (obj != null) {
            this.f79286c.onNext(reducer.invoke(obj));
        }
    }

    /* renamed from: j */
    public final ScopeProvider m42278j() {
        if (!Intrinsics.areEqual(this.f79287d, ScopeProvider.f75557g0)) {
            return this.f79287d;
        }
        throw new IllegalArgumentException("ScopeProvider not set. Call consume(Renderer) before using scope");
    }

    /* renamed from: k */
    public final S m42277k() {
        S value = this.f79286c.getValue();
        return value == null ? this.f79285b : value;
    }

    /* renamed from: l */
    public final Observable<S> m42276l() {
        Observable<S> hide = this.f79286c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "state.hide()");
        return hide;
    }
}
