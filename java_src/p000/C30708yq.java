package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.TokenPair;
import co.bird.android.model.TokenPairState;
import com.auth0.android.jwt.JWT;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lyq;", "", "", "f", "Lhq;", C17296a.f69688o, "Lhq;", "tokenManager", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LCq;", "c", "LCq;", "ui", "<init>", "(Lhq;Lcom/uber/autodispose/ScopeProvider;LCq;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAuthTokensDebuggerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthTokensDebuggerPresenter.kt\nco/bird/android/app/feature/settings/auth/AuthTokensDebuggerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,81:1\n180#2:82\n180#2:83\n237#2:84\n237#2:85\n237#2:86\n*S KotlinDebug\n*F\n+ 1 AuthTokensDebuggerPresenter.kt\nco/bird/android/app/feature/settings/auth/AuthTokensDebuggerPresenter\n*L\n32#1:82\n41#1:83\n57#1:84\n67#1:85\n76#1:86\n*E\n"})
/* renamed from: yq */
/* loaded from: classes2.dex */
public final class C30708yq {

    /* renamed from: a */
    public final InterfaceC22767hq f120233a;

    /* renamed from: b */
    public final ScopeProvider f120234b;

    /* renamed from: c */
    public final InterfaceC1216Cq f120235c;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "optionalLegacyAuthToken", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAuthTokensDebuggerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthTokensDebuggerPresenter.kt\nco/bird/android/app/feature/settings/auth/AuthTokensDebuggerPresenter$onCreate$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
    /* renamed from: yq$a */
    /* loaded from: classes2.dex */
    public static final class C30709a extends Lambda implements Function1<Optional<String>, Unit> {
        public C30709a() {
            super(1);
        }

        /* renamed from: a */
        public final void m2492a(Optional<String> optional) {
            String str;
            JSONObject m18976d;
            String m59035e = optional.m59035e();
            InterfaceC1216Cq interfaceC1216Cq = C30708yq.this.f120235c;
            if (m59035e != null && (m18976d = C47015ph2.m18976d(new JWT(m59035e))) != null) {
                str = m18976d.toString(2);
            } else {
                str = null;
            }
            if (str == null) {
                str = "--";
            }
            interfaceC1216Cq.mo109864f(str);
            InterfaceC1216Cq interfaceC1216Cq2 = C30708yq.this.f120235c;
            if (m59035e == null) {
                m59035e = "--";
            }
            interfaceC1216Cq2.mo109865e(m59035e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<String> optional) {
            m2492a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/TokenPairState;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq$b */
    /* loaded from: classes2.dex */
    public static final class C30710b extends Lambda implements Function1<Optional<TokenPairState>, Unit> {
        public C30710b() {
            super(1);
        }

        /* renamed from: a */
        public final void m2491a(Optional<TokenPairState> optional) {
            TokenPair tokenPair;
            String str;
            JWT refreshJwt;
            String jwt;
            JWT accessJwt;
            JWT refreshJwt2;
            JSONObject m18976d;
            JWT accessJwt2;
            JSONObject m18976d2;
            TokenPairState m59035e = optional.m59035e();
            String str2 = null;
            if (m59035e != null) {
                tokenPair = m59035e.getTokenPair();
            } else {
                tokenPair = null;
            }
            InterfaceC1216Cq interfaceC1216Cq = C30708yq.this.f120235c;
            if (tokenPair != null && (accessJwt2 = tokenPair.getAccessJwt()) != null && (m18976d2 = C47015ph2.m18976d(accessJwt2)) != null) {
                str = m18976d2.toString(2);
            } else {
                str = null;
            }
            String str3 = "--";
            if (str == null) {
                str = "--";
            }
            interfaceC1216Cq.mo109861i(str);
            InterfaceC1216Cq interfaceC1216Cq2 = C30708yq.this.f120235c;
            if (tokenPair != null && (refreshJwt2 = tokenPair.getRefreshJwt()) != null && (m18976d = C47015ph2.m18976d(refreshJwt2)) != null) {
                str2 = m18976d.toString(2);
            }
            if (str2 == null) {
                str2 = "--";
            }
            interfaceC1216Cq2.mo109868b(str2);
            C30708yq.this.f120235c.mo109866d((tokenPair == null || (accessJwt = tokenPair.getAccessJwt()) == null || (r1 = accessJwt.toString()) == null) ? "--" : "--");
            InterfaceC1216Cq interfaceC1216Cq3 = C30708yq.this.f120235c;
            if (tokenPair != null && (refreshJwt = tokenPair.getRefreshJwt()) != null && (jwt = refreshJwt.toString()) != null) {
                str3 = jwt;
            }
            interfaceC1216Cq3.mo109863g(str3);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<TokenPairState> optional) {
            m2491a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq$c */
    /* loaded from: classes2.dex */
    public static final class C30711c extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C30711c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C30708yq.this.f120233a.mo15261f().m33063X(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq$d */
    /* loaded from: classes2.dex */
    public static final class C30712d extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C30712d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C30708yq.this.f120233a.mo15265b().m33063X(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yq$e */
    /* loaded from: classes2.dex */
    public static final class C30713e extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C30713e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C30708yq.this.f120233a.mo15262e().m33063X(C24542a.m31932c());
        }
    }

    public C30708yq(InterfaceC22767hq tokenManager, ScopeProvider scopeProvider, InterfaceC1216Cq ui) {
        Intrinsics.checkNotNullParameter(tokenManager, "tokenManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f120233a = tokenManager;
        this.f120234b = scopeProvider;
        this.f120235c = ui;
    }

    /* renamed from: g */
    public static final void m2497g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m2496h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final InterfaceC23496h m2495i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final InterfaceC23496h m2494j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final InterfaceC23496h m2493k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public final void m2498f() {
        Observable<Optional<String>> observeOn = this.f120233a.mo15266a().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "tokenManager.legacyAuthT…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f120234b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30709a c30709a = new C30709a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: tq
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C30708yq.m2497g(Function1.this, obj);
            }
        });
        Observable<Optional<TokenPairState>> observeOn2 = this.f120233a.mo15263d().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "tokenManager.tokenPairSt…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f120234b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30710b c30710b = new C30710b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: uq
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C30708yq.m2496h(Function1.this, obj);
            }
        });
        Observable<Unit> mo109869a = this.f120235c.mo109869a();
        final C30711c c30711c = new C30711c();
        AbstractC23461c m33066T = mo109869a.flatMapCompletable(new InterfaceC23492o() { // from class: vq
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m2495i;
                m2495i = C30708yq.m2495i(Function1.this, obj);
                return m2495i;
            }
        }).m33070P(C23454a.m33087a()).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "fun onCreate() {\n\n    to…r)\n      .subscribe()\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f120234b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<Unit> mo109862h = this.f120235c.mo109862h();
        final C30712d c30712d = new C30712d();
        AbstractC23461c m33066T2 = mo109862h.flatMapCompletable(new InterfaceC23492o() { // from class: wq
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m2494j;
                m2494j = C30708yq.m2494j(Function1.this, obj);
                return m2494j;
            }
        }).m33070P(C23454a.m33087a()).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T2, "fun onCreate() {\n\n    to…r)\n      .subscribe()\n  }");
        Object m33041n2 = m33066T2.m33041n(AutoDispose.m45239a(this.f120234b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Observable<Unit> mo109867c = this.f120235c.mo109867c();
        final C30713e c30713e = new C30713e();
        AbstractC23461c m33070P = mo109867c.flatMapCompletable(new InterfaceC23492o() { // from class: xq
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m2493k;
                m2493k = C30708yq.m2493k(Function1.this, obj);
                return m2493k;
            }
        }).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "fun onCreate() {\n\n    to…r)\n      .subscribe()\n  }");
        Object m33041n3 = m33070P.m33041n(AutoDispose.m45239a(this.f120234b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
    }
}
