package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.exception.HttpException;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24556c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m28432d2 = {"Lf96;", "LiE;", "LjE;", "", "instruction", "instruction2", "", "f", "", "e", "t", "Lio/reactivex/subjects/c;", "c", "Lio/reactivex/subjects/c;", "transferOrderIdSubject", DateTokenConverter.CONVERTER_KEY, "LjE;", "getUi", "()LjE;", "ui", "Ldm5;", "scannerNavigator", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lio/reactivex/subjects/c;LjE;Ldm5;Lcom/uber/autodispose/ScopeProvider;)V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransferOrderScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderScanPresenter.kt\nco/bird/android/vehiclescanner/transferorder/TransferOrderScanPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n180#2:58\n1#3:59\n*S KotlinDebug\n*F\n+ 1 TransferOrderScanPresenter.kt\nco/bird/android/vehiclescanner/transferorder/TransferOrderScanPresenter\n*L\n44#1:58\n*E\n"})
/* renamed from: f96  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40775f96 extends AbstractC23170iE<C24739jE> {

    /* renamed from: c */
    public final C24556c<String> f79545c;

    /* renamed from: d */
    public final C24739jE f79546d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "raw", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: f96$a */
    /* loaded from: classes4.dex */
    public static final class C20248a extends Lambda implements Function1<String, InterfaceC23447K<? extends String>> {

        /* renamed from: g */
        public static final C20248a f79547g = new C20248a();

        public C20248a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends String> invoke(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            String m99601a = C33894Jt4.f18402a.m99601a(raw);
            if (m99601a != null) {
                return AbstractC23442F.m33158H(m99601a);
            }
            return AbstractC23442F.m33100x(new IllegalArgumentException("Invalid Container Order ID."));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f96$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20249b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C20249b(Object obj) {
            super(1, obj, C40775f96.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C40775f96) this.receiver).m41937t(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f96$c */
    /* loaded from: classes4.dex */
    public static final class C20250c extends Lambda implements Function1<String, Unit> {
        public C20250c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C40775f96.this.getUi().vibrate(250L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "containerOrderId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: f96$d */
    /* loaded from: classes4.dex */
    public static final class C20251d extends Lambda implements Function1<String, Unit> {
        public C20251d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C40775f96.this.f79545c.onSuccess(str);
            C40775f96.this.getUi().dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40775f96(C24556c<String> transferOrderIdSubject, C24739jE ui, InterfaceC39953dm5 scannerNavigator, ScopeProvider scopeProvider) {
        super(scannerNavigator, scopeProvider);
        Intrinsics.checkNotNullParameter(transferOrderIdSubject, "transferOrderIdSubject");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scannerNavigator, "scannerNavigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f79545c = transferOrderIdSubject;
        this.f79546d = ui;
        getUi().m86366sm(false);
    }

    /* renamed from: p */
    public static final InterfaceC23447K m41941p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m41940q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m41939r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m41938s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC23170iE
    /* renamed from: f */
    public void mo34311f(String str, String str2) {
        super.mo34311f(str, str2);
        Observable<String> m86400Am = getUi().m86400Am();
        final C20248a c20248a = C20248a.f79547g;
        Observable observeOn = m86400Am.flatMapSingle(new InterfaceC23492o() { // from class: b96
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m41941p;
                m41941p = C40775f96.m41941p(Function1.this, obj);
                return m41941p;
            }
        }).observeOn(C23454a.m33087a());
        final C20249b c20249b = new C20249b(this);
        Observable retry = observeOn.doOnError(new InterfaceC23484g() { // from class: c96
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40775f96.m41940q(Function1.this, obj);
            }
        }).retry();
        final C20250c c20250c = new C20250c();
        Observable doOnNext = retry.doOnNext(new InterfaceC23484g() { // from class: d96
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40775f96.m41939r(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onCreate(in… ui.dismiss()\n      }\n  }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(m34312e()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20251d c20251d = new C20251d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: e96
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40775f96.m41938s(Function1.this, obj);
            }
        });
    }

    @Override // p000.AbstractC23170iE
    public C24739jE getUi() {
        return this.f79546d;
    }

    /* renamed from: t */
    public final void m41937t(Throwable th) {
        HttpException httpException;
        C41318g46.m40159e(th);
        Unit unit = null;
        if (th instanceof HttpException) {
            httpException = (HttpException) th;
        } else {
            httpException = null;
        }
        if (httpException != null) {
            getUi().error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            getUi().error(th);
        }
        getUi().m86370p3();
    }
}
