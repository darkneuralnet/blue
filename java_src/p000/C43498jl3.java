package p000;

import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.model.constant.FilterLogicToggleOption;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import co.bird.android.widget.BottomSheetOptionLayout;
import co.bird.android.widget.C16597a;
import co.bird.android.widget.C16664e;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC45277ml3;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001UB\u0007¢\u0006\u0004\bR\u0010SJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00104\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u000100000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u0010;\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R,\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b@\u0010:R \u0010D\u001a\b\u0012\u0004\u0012\u000200058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010:R \u0010G\u001a\b\u0012\u0004\u0012\u000200058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u00108\u001a\u0004\bF\u0010:R!\u0010K\u001a\b\u0012\u0004\u0012\u00020\f058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010:R!\u0010N\u001a\b\u0012\u0004\u0012\u00020\f058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010:R!\u0010Q\u001a\b\u0012\u0004\u0012\u00020\f058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bO\u0010I\u001a\u0004\bP\u0010:¨\u0006V"}, m28432d2 = {"Ljl3;", "Lhc5;", "LSl3;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lio/reactivex/h;", "T0", "Lel3;", TransferTable.COLUMN_STATE, "t8", "Lsx4;", "e", "Lsx4;", "delegate", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lfl3;", "g", "Lfl3;", "adapter", "Lnl3;", "h", "Lnl3;", "converter", "LQl3;", "i", "LQl3;", "N6", "()LQl3;", "setPresenter", "(LQl3;)V", "presenter", "LTZ;", "j", "LTZ;", "binding", "Lio/reactivex/subjects/d;", "Lco/bird/android/model/constant/FilterLogicToggleOption;", "kotlin.jvm.PlatformType", "k", "Lio/reactivex/subjects/d;", "logicOperatorSubject", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/OperatorFilter;", "l", "Lio/reactivex/Observable;", "D7", "()Lio/reactivex/Observable;", "filterSelects", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/OperatorOptionFilter;", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "m", "p8", "optionUpdates", "n", "X1", "logicOperatorClicks", "o", "V1", "logicOperatorSelected", "p", "Lkotlin/Lazy;", "K2", "applyClicks", "q", "x9", "resetClicks", "r", "f2", "closeClicks", "<init>", "()V", "s", C17296a.f69688o, "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorFilterV2BottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2BottomSheet.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2BottomSheet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$1\n+ 7 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,139:1\n1#2:140\n64#3:141\n38#4,9:142\n47#4,4:155\n819#5:151\n847#5:152\n848#5:154\n40#6:153\n218#7:159\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2BottomSheet.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2BottomSheet\n*L\n45#1:141\n105#1:142,9\n105#1:155,4\n105#1:151\n105#1:152\n105#1:154\n105#1:153\n109#1:159\n*E\n"})
/* renamed from: jl3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43498jl3 extends AbstractC42224hc5 implements InterfaceC35927Sl3 {

    /* renamed from: s */
    public static final C25007a f93275s = new C25007a(null);

    /* renamed from: e */
    public final C48955sx4 f93276e;

    /* renamed from: f */
    public final ScopeProvider f93277f;

    /* renamed from: g */
    public final C41126fl3 f93278g;

    /* renamed from: h */
    public final C45870nl3 f93279h;

    /* renamed from: i */
    public C35459Ql3 f93280i;

    /* renamed from: j */
    public C7880TZ f93281j;

    /* renamed from: k */
    public final C24558d<FilterLogicToggleOption> f93282k;

    /* renamed from: l */
    public final Observable<OperatorFilter> f93283l;

    /* renamed from: m */
    public final Observable<Pair<OperatorOptionFilter, OperatorFilterOption>> f93284m;

    /* renamed from: n */
    public final Observable<FilterLogicToggleOption> f93285n;

    /* renamed from: o */
    public final Observable<FilterLogicToggleOption> f93286o;

    /* renamed from: p */
    public final Lazy f93287p;

    /* renamed from: q */
    public final Lazy f93288q;

    /* renamed from: r */
    public final Lazy f93289r;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Ljl3$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jl3$a */
    /* loaded from: classes3.dex */
    public static final class C25007a {
        public /* synthetic */ C25007a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C25007a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jl3$b */
    /* loaded from: classes3.dex */
    public static final class C25008b extends Lambda implements Function0<Observable<Unit>> {
        public C25008b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C7880TZ c7880tz = C43498jl3.this.f93281j;
            if (c7880tz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c7880tz = null;
            }
            Button button = c7880tz.f35673b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.apply");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jl3$c */
    /* loaded from: classes3.dex */
    public static final class C25009c extends Lambda implements Function0<Observable<Unit>> {
        public C25009c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C7880TZ c7880tz = C43498jl3.this.f93281j;
            if (c7880tz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c7880tz = null;
            }
            ImageView imageView = c7880tz.f35675d;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.close");
            return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00018\u00008\u0000\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"", "Lco/bird/android/widget/d;", "K", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Enum;", "co/bird/android/widget/a$l"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$2$1\n*L\n1#1,108:1\n*E\n"})
    /* renamed from: jl3$d */
    /* loaded from: classes3.dex */
    public static final class C25010d extends Lambda implements Function1<Integer, EnumC37438Yx2> {

        /* renamed from: g */
        public final /* synthetic */ List f93292g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25010d(List list) {
            super(1);
            this.f93292g = list;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Yx2, java.lang.Enum] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EnumC37438Yx2 invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (Enum) this.f93292g.get(it.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LYx2;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LYx2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jl3$e */
    /* loaded from: classes3.dex */
    public static final class C25011e extends Lambda implements Function1<EnumC37438Yx2, Unit> {
        public C25011e() {
            super(1);
        }

        /* renamed from: a */
        public final void m29975a(EnumC37438Yx2 it) {
            C24558d c24558d = C43498jl3.this.f93282k;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c24558d.onNext(C44091kl3.m28488a(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC37438Yx2 enumC37438Yx2) {
            m29975a(enumC37438Yx2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jl3$f */
    /* loaded from: classes3.dex */
    public static final class C25012f extends Lambda implements Function0<Observable<Unit>> {
        public C25012f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C7880TZ c7880tz = C43498jl3.this.f93281j;
            if (c7880tz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c7880tz = null;
            }
            TextView textView = c7880tz.f35679h;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.reset");
            return C44626lf5.clicksThrottle$default(textView, 0L, 1, null).share();
        }
    }

    public C43498jl3() {
        AppCompatActivity appCompatActivity;
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        FragmentActivity activity = getActivity();
        if (activity instanceof AppCompatActivity) {
            appCompatActivity = (AppCompatActivity) activity;
        } else {
            appCompatActivity = null;
        }
        this.f93276e = appCompatActivity != null ? new C48955sx4(appCompatActivity) : null;
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        this.f93277f = m45195i;
        C41126fl3 c41126fl3 = new C41126fl3();
        this.f93278g = c41126fl3;
        this.f93279h = new C45870nl3();
        C24558d<FilterLogicToggleOption> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<FilterLogicToggleOption>()");
        this.f93282k = m31902e;
        this.f93283l = c41126fl3.m40898S4();
        this.f93284m = c41126fl3.m40896w();
        this.f93285n = c41126fl3.m40897v();
        Observable<FilterLogicToggleOption> hide = m31902e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "logicOperatorSubject.hide()");
        this.f93286o = hide;
        lazy = LazyKt__LazyJVMKt.lazy(new C25008b());
        this.f93287p = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C25012f());
        this.f93288q = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C25009c());
        this.f93289r = lazy3;
    }

    /* renamed from: A9 */
    public static final void m29989A9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC35927Sl3
    /* renamed from: D7 */
    public Observable<OperatorFilter> mo29988D7() {
        return this.f93283l;
    }

    @Override // p000.InterfaceC35927Sl3
    /* renamed from: K2 */
    public Observable<Unit> mo29987K2() {
        return (Observable) this.f93287p.getValue();
    }

    /* renamed from: N6 */
    public final C35459Ql3 m29986N6() {
        C35459Ql3 c35459Ql3 = this.f93280i;
        if (c35459Ql3 != null) {
            return c35459Ql3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        InterfaceC23496h mo231T0 = this.f93277f.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope.requestScope()");
        return mo231T0;
    }

    @Override // p000.InterfaceC35927Sl3
    /* renamed from: V1 */
    public Observable<FilterLogicToggleOption> mo29985V1() {
        return this.f93286o;
    }

    @Override // p000.InterfaceC35927Sl3
    /* renamed from: X1 */
    public Observable<FilterLogicToggleOption> mo29984X1() {
        return this.f93285n;
    }

    @Override // p000.InterfaceC35927Sl3
    /* renamed from: f2 */
    public Observable<Unit> mo29982f2() {
        return (Observable) this.f93289r.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C7880TZ.m83394c(inflater, viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        C7880TZ m83396a = C7880TZ.m83396a(view);
        Intrinsics.checkNotNullExpressionValue(m83396a, "bind(view)");
        this.f93281j = m83396a;
        Application application = null;
        if (m83396a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m83396a = null;
        }
        m83396a.f35678g.setAdapter(this.f93278g);
        C7880TZ c7880tz = this.f93281j;
        if (c7880tz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c7880tz = null;
        }
        c7880tz.f35678g.setLayoutManager(new LinearLayoutManager(getActivity()));
        C7880TZ c7880tz2 = this.f93281j;
        if (c7880tz2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c7880tz2 = null;
        }
        c7880tz2.f35678g.setItemAnimator(new C11894g());
        InterfaceC45277ml3.InterfaceC26197a m92397a = OM0.m92397a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            application = activity.getApplication();
        }
        if (application == null) {
            return;
        }
        m92397a.mo25077a(c46172oG2.m21419a(application)).mo25078a(this);
        m29986N6().consume(this);
    }

    @Override // p000.InterfaceC35927Sl3
    /* renamed from: p8 */
    public Observable<Pair<OperatorOptionFilter, OperatorFilterOption>> mo29981p8() {
        return this.f93284m;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: t8 */
    public void render(InterfaceC40533el3 state) {
        List list;
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.areEqual(state, C39938dl0.f77161a)) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
                return;
            }
            return;
        }
        C7880TZ c7880tz = null;
        if (Intrinsics.areEqual(state, C32488Dt2.f6462a)) {
            C7880TZ c7880tz2 = this.f93281j;
            if (c7880tz2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c7880tz = c7880tz2;
            }
            c7880tz.f35677f.m49246u();
        } else if (state instanceof C45742nY3) {
            C45742nY3 c45742nY3 = (C45742nY3) state;
            this.f93278g.mo24871u(this.f93279h.m23213a(c45742nY3.m23550c()));
            C7880TZ c7880tz3 = this.f93281j;
            if (c7880tz3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c7880tz3 = null;
            }
            c7880tz3.f35673b.setText(getString(C45871nl4.operator_map_filter_apply_number, Integer.valueOf(c45742nY3.m23551b())));
            C7880TZ c7880tz4 = this.f93281j;
            if (c7880tz4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c7880tz = c7880tz4;
            }
            c7880tz.f35677f.m49252o();
            if (c45742nY3.m23549d()) {
                this.f93278g.notifyDataSetChanged();
            }
        } else if (state instanceof C36105Tf1) {
            C48955sx4 c48955sx4 = this.f93276e;
            if (c48955sx4 != null) {
                C38689bg5.m64178c(c48955sx4, ((C36105Tf1) state).m83227b());
            }
        } else if (state instanceof C43749kA5) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            list = ArraysKt___ArraysKt.toList(EnumC37438Yx2.values());
            BottomSheetOptionLayout.EnumC16469a enumC16469a = BottomSheetOptionLayout.EnumC16469a.NORMAL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Enum r5 = (Enum) obj;
                arrayList.add(obj);
            }
            C16664e c16664e = new C16664e();
            c16664e.setArguments(C16597a.m54345a(enumC16469a, null, null, 8388611, arrayList));
            c16664e.show(appCompatActivity.getSupportFragmentManager(), "BottomSheetOptionFragment");
            AbstractC24507p<R> m32067H = c16664e.m54040D9().m32067H(new C16597a.C16604g(new C25010d(arrayList)));
            Intrinsics.checkNotNullExpressionValue(m32067H, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
            final C25011e c25011e = new C25011e();
            AbstractC24507p m32026s = m32067H.m32026s(new InterfaceC23484g() { // from class: il3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj2) {
                    C43498jl3.m29989A9(Function1.this, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32026s, "override fun render(stat…cribe()\n      }\n    }\n  }");
            Object m32048b = m32026s.m32048b(AutoDispose.m45239a(this.f93277f));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((MaybeSubscribeProxy) m32048b).subscribe();
        }
    }

    @Override // p000.InterfaceC35927Sl3
    /* renamed from: x9 */
    public Observable<Unit> mo29979x9() {
        Object value = this.f93288q.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-resetClicks>(...)");
        return (Observable) value;
    }
}
