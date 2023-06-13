package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C24739jE;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u001a\u0010\u0010\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LiE;", "LjE;", "T", "", "", "instruction", "instruction2", "", "f", "h", "g", "Ldm5;", C17296a.f69688o, "Ldm5;", DateTokenConverter.CONVERTER_KEY, "()Ldm5;", "scannerNavigator", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "e", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "getUi", "()LjE;", "ui", "<init>", "(Ldm5;Lcom/uber/autodispose/ScopeProvider;)V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseScanPresenter.kt\nco/bird/android/vehiclescanner/common/mvp/BaseScanPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,38:1\n180#2:39\n180#2:40\n180#2:41\n*S KotlinDebug\n*F\n+ 1 BaseScanPresenter.kt\nco/bird/android/vehiclescanner/common/mvp/BaseScanPresenter\n*L\n22#1:39\n26#1:40\n30#1:41\n*E\n"})
/* renamed from: iE */
/* loaded from: classes4.dex */
public abstract class AbstractC23170iE<T extends C24739jE> {

    /* renamed from: a */
    public final InterfaceC39953dm5 f86977a;

    /* renamed from: b */
    public final ScopeProvider f86978b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LjE;", "T", "", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/Unit;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iE$a */
    /* loaded from: classes4.dex */
    public static final class C23171a extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC23170iE<T> f86979g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23171a(AbstractC23170iE<T> abstractC23170iE) {
            super(1);
            this.f86979g = abstractC23170iE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f86979g.getUi().m86359ym();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LjE;", "T", "", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/Unit;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iE$b */
    /* loaded from: classes4.dex */
    public static final class C23172b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC23170iE<T> f86980g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23172b(AbstractC23170iE<T> abstractC23170iE) {
            super(1);
            this.f86980g = abstractC23170iE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f86980g.getUi().m86358zm();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LjE;", "T", "", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/Unit;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iE$c */
    /* loaded from: classes4.dex */
    public static final class C23173c extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC23170iE<T> f86981g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23173c(AbstractC23170iE<T> abstractC23170iE) {
            super(1);
            this.f86981g = abstractC23170iE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f86981g.m34313d().mo43724q();
        }
    }

    public AbstractC23170iE(InterfaceC39953dm5 scannerNavigator, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(scannerNavigator, "scannerNavigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f86977a = scannerNavigator;
        this.f86978b = scopeProvider;
    }

    /* renamed from: i */
    public static final void m34308i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m34307j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m34306k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void onCreate$default(AbstractC23170iE abstractC23170iE, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCreate");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        abstractC23170iE.mo34311f(str, str2);
    }

    /* renamed from: d */
    public final InterfaceC39953dm5 m34313d() {
        return this.f86977a;
    }

    /* renamed from: e */
    public final ScopeProvider m34312e() {
        return this.f86978b;
    }

    /* renamed from: f */
    public void mo34311f(String str, String str2) {
        getUi().m86371om(str, str2);
    }

    /* renamed from: g */
    public void m34310g() {
        getUi().onPause();
    }

    public abstract T getUi();

    /* renamed from: h */
    public void m34309h() {
        getUi().onResume();
        Object m33094as = getUi().m86363v0().m33094as(AutoDispose.m45239a(this.f86978b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23171a c23171a = new C23171a(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: dE
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC23170iE.m34308i(Function1.this, obj);
            }
        });
        Object m33094as2 = getUi().m86397M9().m33094as(AutoDispose.m45239a(this.f86978b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23172b c23172b = new C23172b(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: fE
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC23170iE.m34307j(Function1.this, obj);
            }
        });
        Object m33094as3 = getUi().m86398G().m33094as(AutoDispose.m45239a(this.f86978b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23173c c23173c = new C23173c(this);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: gE
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC23170iE.m34306k(Function1.this, obj);
            }
        });
    }
}
