package p000;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.main.MainActivity;
import com.facebook.share.internal.C17296a;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC5384Mp;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\t\u001a\u00020\u0002*\u00020\bH\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\n \u001a*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006)"}, m28432d2 = {"Lkh6;", "Ldh6;", "", "restartProcess", "Lio/reactivex/c;", C17296a.f69688o, "k", "n", "LMp$b;", "p", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LRh6;", "b", "LRh6;", "userStream", "Llh6;", "c", "Llh6;", "userManager", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LAG;", "kotlin.jvm.PlatformType", "e", "LAG;", "shouldRestartProcess", "f", "Lio/reactivex/c;", "sharedLogoutCompletable", "LOp;", "authInterceptor", "LTq4;", "config", "Lhq;", "authTokenManager", "<init>", "(Landroid/content/Context;LOp;LTq4;Lhq;LRh6;Llh6;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserLogoutManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserLogoutManagerImpl.kt\nco/bird/android/app/manager/UserLogoutManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,111:1\n237#2:112\n*S KotlinDebug\n*F\n+ 1 UserLogoutManagerImpl.kt\nco/bird/android/app/manager/UserLogoutManagerImpl\n*L\n61#1:112\n*E\n"})
/* renamed from: kh6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44054kh6 implements InterfaceC39904dh6 {

    /* renamed from: a */
    public final Context f94784a;

    /* renamed from: b */
    public final InterfaceC35660Rh6 f94785b;

    /* renamed from: c */
    public final InterfaceC44647lh6 f94786c;

    /* renamed from: d */
    public final InterfaceC40099e13 f94787d;

    /* renamed from: e */
    public final C0058AG<Boolean> f94788e;

    /* renamed from: f */
    public final AbstractC23461c f94789f;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LMp;", "error", "", C17296a.f69688o, "(LMp;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kh6$a */
    /* loaded from: classes2.dex */
    public static final class C25213a extends Lambda implements Function1<AbstractC5384Mp, Boolean> {
        public C25213a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC5384Mp error) {
            boolean z;
            Intrinsics.checkNotNullParameter(error, "error");
            if (!(error instanceof AbstractC5384Mp.C5385a) && (!(error instanceof AbstractC5384Mp.C5386b) || !C44054kh6.this.m28619p((AbstractC5384Mp.C5386b) error))) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LMp;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LMp;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kh6$b */
    /* loaded from: classes2.dex */
    public static final class C25214b extends Lambda implements Function1<AbstractC5384Mp, InterfaceC23496h> {
        public C25214b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(AbstractC5384Mp it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C44054kh6.this.mo28634a(false).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kh6$c */
    /* loaded from: classes2.dex */
    public static final class C25215c extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f94793h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25215c(boolean z) {
            super(1);
            this.f94793h = z;
        }

        /* renamed from: a */
        public final void m28616a(InterfaceC23465c interfaceC23465c) {
            C44054kh6.this.f94788e.accept(Boolean.valueOf(this.f94793h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m28616a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    public C44054kh6(Context context, InterfaceC6181Op authInterceptor, C36207Tq4 config, InterfaceC22767hq authTokenManager, InterfaceC35660Rh6 userStream, InterfaceC44647lh6 userManager, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authInterceptor, "authInterceptor");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f94784a = context;
        this.f94785b = userStream;
        this.f94786c = userManager;
        this.f94787d = navigator;
        C0058AG<Boolean> m115950h = C0058AG.m115950h(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(false)");
        this.f94788e = m115950h;
        this.f94789f = m28624k().m33050h0().share().ignoreElements();
        Observable<AbstractC5384Mp> mo89746a = authInterceptor.mo89746a();
        final C25213a c25213a = new C25213a();
        Observable<AbstractC5384Mp> filter = mo89746a.filter(new InterfaceC23494q() { // from class: eh6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m28627h;
                m28627h = C44054kh6.m28627h(Function1.this, obj);
                return m28627h;
            }
        });
        final C25214b c25214b = new C25214b();
        AbstractC23461c m33066T = filter.flatMapCompletable(new InterfaceC23492o() { // from class: fh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m28626i;
                m28626i = C44054kh6.m28626i(Function1.this, obj);
                return m28626i;
            }
        }).m33063X(C24542a.m31932c()).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "authInterceptor.authErro…lers.io())\n      .retry()");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: h */
    public static final boolean m28627h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: i */
    public static final InterfaceC23496h m28626i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m28625j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final Boolean m28623l(C44054kh6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Boolean.valueOf(this$0.f94785b.mo76578g());
    }

    /* renamed from: m */
    public static final InterfaceC23496h m28622m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m28620o(boolean z, C44054kh6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            Intent intent = new Intent(this$0.f94784a, MainActivity.class);
            intent.setFlags(268468224);
            ProcessPhoenix.m45924b(this$0.f94784a, intent);
            return;
        }
        InterfaceC40099e13.C19924a.goToMain$default(this$0.f94787d, false, 1, null);
    }

    @Override // p000.InterfaceC39904dh6
    /* renamed from: a */
    public AbstractC23461c mo28634a(boolean z) {
        AbstractC23461c abstractC23461c = this.f94789f;
        final C25215c c25215c = new C25215c(z);
        AbstractC23461c m33081E = abstractC23461c.m33081E(new InterfaceC23484g() { // from class: hh6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44054kh6.m28625j(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33081E, "override fun logout(rest…startProcess)\n      }\n  }");
        return m33081E;
    }

    /* renamed from: k */
    public final AbstractC23461c m28624k() {
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: ih6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean m28623l;
                m28623l = C44054kh6.m28623l(C44054kh6.this);
                return m28623l;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      userStream.isLoggedIn\n    }");
        AbstractC23442F m74531s0 = C37279Yf5.m74531s0(m33161E, this.f94788e);
        final C25216d c25216d = new C25216d();
        AbstractC23461c m33164B = m74531s0.m33164B(new InterfaceC23492o() { // from class: jh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m28622m;
                m28622m = C44054kh6.m28622m(Function1.this, obj);
                return m28622m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "private fun logoutIntern…ss)\n        }\n      }\n  }");
        return m33164B;
    }

    /* renamed from: n */
    public final AbstractC23461c m28621n(final boolean z) {
        AbstractC23461c m33029z = this.f94786c.mo26970b().m33070P(C23454a.m33087a()).m33029z(new InterfaceC23478a() { // from class: gh6
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C44054kh6.m28620o(z, this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "userManager.logout()\n   …oMain()\n        }\n      }");
        return m33029z;
    }

    /* renamed from: p */
    public final boolean m28619p(AbstractC5384Mp.C5386b c5386b) {
        return c5386b.m94766c() && c5386b.m94767b().header("Authorization") != null;
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kh6$d */
    /* loaded from: classes2.dex */
    public static final class C25216d extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, InterfaceC23496h> {
        public C25216d() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<Boolean, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean restartProcess = pair.component2();
            if (!pair.component1().booleanValue()) {
                return AbstractC23461c.m33039p();
            }
            C44054kh6 c44054kh6 = C44054kh6.this;
            Intrinsics.checkNotNullExpressionValue(restartProcess, "restartProcess");
            return c44054kh6.m28621n(restartProcess.booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            return invoke2((Pair<Boolean, Boolean>) pair);
        }
    }
}
