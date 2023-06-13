package co.bird.android.feature.transferorder.scrap.overview;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.base.viewmodel.ScrapRemovalComplete;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.model.DialogResponse;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
import p000.InterfaceC36272Tx6;
@Metadata(m28433d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bX\u0010YJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014J\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010S\u001a\u0010\u0012\f\u0012\n Q*\u0004\u0018\u00010\u00060\u00060.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u00101R\"\u0010U\u001a\u0010\u0012\f\u0012\n Q*\u0004\u0018\u00010\u00060\u00060.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u00101R\"\u0010W\u001a\u0010\u0012\f\u0012\n Q*\u0004\u0018\u00010\u00060\u00060.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00101¨\u0006Z"}, m28432d2 = {"Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LEo5;", "LTx6;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LFo5;", TransferTable.COLUMN_STATE, "R", "Lio/reactivex/Observable;", "W7", "", "q6", "c8", "P4", "Landroidx/appcompat/app/AppCompatActivity;", "j", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lsx4;", "k", "Lkotlin/Lazy;", "w1", "()Lsx4;", "rendererDelegate", "Lco/bird/android/widget/OperatorInfoCard;", "l", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Lco/bird/android/widget/BlockingEnterLocationView;", "m", "d7", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationView", "Lma4;", "Lco/bird/android/model/DialogResponse;", "n", "Lma4;", "a7", "()Lma4;", "warehouseVerificationRelay", "LBy6;", "o", "LBy6;", "Q", "()LBy6;", "setWarehouseChecker", "(LBy6;)V", "warehouseChecker", "LAo5;", "p", "LAo5;", "P", "()LAo5;", "setPresenter", "(LAo5;)V", "presenter", "LV5;", "q", "LV5;", "binding", "Ljo5;", "r", "Ljo5;", "converter", "Lio5;", "s", "Lio5;", "adapter", "kotlin.jvm.PlatformType", "t", "warehouseChecksRelay", "u", "processContainerOrderSuccessRelay", "v", "refreshScrapVehiclesRelay", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapOrderOverviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewActivity.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,103:1\n1#2:104\n199#3:105\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewActivity.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity\n*L\n87#1:105\n*E\n"})
/* loaded from: classes3.dex */
public final class ScrapOrderOverviewActivity extends BaseActivityLite implements InterfaceC32680Eo5, InterfaceC36272Tx6 {

    /* renamed from: j */
    public final AppCompatActivity f65779j = this;

    /* renamed from: k */
    public final Lazy f65780k;

    /* renamed from: l */
    public final Lazy f65781l;

    /* renamed from: m */
    public final Lazy f65782m;

    /* renamed from: n */
    public final C45168ma4<DialogResponse> f65783n;

    /* renamed from: o */
    public C32069By6 f65784o;

    /* renamed from: p */
    public C31744Ao5 f65785p;

    /* renamed from: q */
    public C8544V5 f65786q;

    /* renamed from: r */
    public final C43530jo5 f65787r;

    /* renamed from: s */
    public final C42937io5 f65788s;

    /* renamed from: t */
    public final C45168ma4<Unit> f65789t;

    /* renamed from: u */
    public final C45168ma4<Unit> f65790u;

    /* renamed from: v */
    public final C45168ma4<Unit> f65791v;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/widget/BlockingEnterLocationView;", "b", "()Lco/bird/android/widget/BlockingEnterLocationView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scrap.overview.ScrapOrderOverviewActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15842a extends Lambda implements Function0<BlockingEnterLocationView> {
        public C15842a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final BlockingEnterLocationView invoke() {
            C8544V5 c8544v5 = ScrapOrderOverviewActivity.this.f65786q;
            if (c8544v5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8544v5 = null;
            }
            BlockingEnterLocationView blockingEnterLocationView = c8544v5.f38582b;
            Intrinsics.checkNotNullExpressionValue(blockingEnterLocationView, "binding.blockEnterLocationOverlay");
            return blockingEnterLocationView;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/widget/OperatorInfoCard;", "b", "()Lco/bird/android/widget/OperatorInfoCard;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scrap.overview.ScrapOrderOverviewActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15843b extends Lambda implements Function0<OperatorInfoCard> {
        public C15843b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final OperatorInfoCard invoke() {
            C8544V5 c8544v5 = ScrapOrderOverviewActivity.this.f65786q;
            if (c8544v5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8544v5 = null;
            }
            OperatorInfoCard operatorInfoCard = c8544v5.f38583c;
            Intrinsics.checkNotNullExpressionValue(operatorInfoCard, "binding.operatorInfoCard");
            return operatorInfoCard;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lsx4;", "b", "()Lsx4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scrap.overview.ScrapOrderOverviewActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15844c extends Lambda implements Function0<C48955sx4> {
        public C15844c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C48955sx4 invoke() {
            return ScrapOrderOverviewActivity.this.m58990F();
        }
    }

    public ScrapOrderOverviewActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new C15844c());
        this.f65780k = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C15843b());
        this.f65781l = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C15842a());
        this.f65782m = lazy3;
        C45168ma4<DialogResponse> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create()");
        this.f65783n = m25409g;
        this.f65787r = new C43530jo5();
        this.f65788s = new C42937io5();
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f65789t = m25409g2;
        C45168ma4<Unit> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Unit>()");
        this.f65790u = m25409g3;
        C45168ma4<Unit> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<Unit>()");
        this.f65791v = m25409g4;
    }

    @Override // p000.InterfaceC36272Tx6
    /* renamed from: D0 */
    public Observable<Unit> mo56414D0() {
        return InterfaceC36272Tx6.C8157a.m82221a(this);
    }

    /* renamed from: P */
    public final C31744Ao5 m56413P() {
        C31744Ao5 c31744Ao5 = this.f65785p;
        if (c31744Ao5 != null) {
            return c31744Ao5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC32680Eo5
    /* renamed from: P4 */
    public Observable<Unit> mo56412P4() {
        Observable<Unit> hide = this.f65791v.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "refreshScrapVehiclesRelay.hide()");
        return hide;
    }

    /* renamed from: Q */
    public final C32069By6 m56411Q() {
        C32069By6 c32069By6 = this.f65784o;
        if (c32069By6 != null) {
            return c32069By6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("warehouseChecker");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: R */
    public void render(InterfaceC32914Fo5 state) {
        Throwable error;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C37271Ye6) {
            this.f65788s.mo24871u(this.f65787r.m29896a(state.mo64185b(), state.mo64184c()));
        } else if (state instanceof Q64) {
            String mo64186a = state.mo64186a();
            if (mo64186a != null) {
                Object m33135e = H31.C3014a.showBottomSheetAlert$default(m58990F(), new ScrapRemovalComplete(mo64186a), null, 2, null).m33135e(AutoDispose.m45239a(this));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                ((SingleSubscribeProxy) m33135e).subscribe();
            }
        } else if ((state instanceof C38685bg1) && (error = state.getError()) != null) {
            C38689bg5.m64178c(m58990F(), error);
        }
    }

    @Override // p000.InterfaceC36272Tx6
    /* renamed from: W7 */
    public Observable<Unit> mo56409W7() {
        Observable<Unit> hide = this.f65789t.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "warehouseChecksRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC36272Tx6
    /* renamed from: a7 */
    public C45168ma4<DialogResponse> mo56408a7() {
        return this.f65783n;
    }

    @Override // p000.InterfaceC32680Eo5
    /* renamed from: c8 */
    public Observable<Unit> mo56407c8() {
        Observable<Unit> hide = this.f65790u.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "processContainerOrderSuccessRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC36272Tx6
    /* renamed from: d7 */
    public BlockingEnterLocationView mo56406d7() {
        return (BlockingEnterLocationView) this.f65782m.getValue();
    }

    @Override // p000.InterfaceC36272Tx6
    /* renamed from: e8 */
    public void mo56405e8(C36506Ux6 c36506Ux6) {
        InterfaceC36272Tx6.C8157a.m82219c(this, c36506Ux6);
    }

    @Override // p000.InterfaceC36272Tx6
    public AppCompatActivity getActivity() {
        return this.f65779j;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10059 && i2 == -1) {
            this.f65790u.accept(Unit.INSTANCE);
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8544V5 m80432c = C8544V5.m80432c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m80432c, "inflate(layoutInflater)");
        this.f65786q = m80432c;
        C8544V5 c8544v5 = null;
        if (m80432c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m80432c = null;
        }
        setContentView(m80432c.getRoot());
        C40330eQ0.m42892a().mo17052a(m58989H()).mo17053a(this);
        C8544V5 c8544v52 = this.f65786q;
        if (c8544v52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8544v52 = null;
        }
        c8544v52.f38584d.setLayoutManager(new LinearLayoutManager(this));
        C8544V5 c8544v53 = this.f65786q;
        if (c8544v53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8544v53 = null;
        }
        c8544v53.f38584d.setItemAnimator(new C11894g());
        C8544V5 c8544v54 = this.f65786q;
        if (c8544v54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c8544v5 = c8544v54;
        }
        c8544v5.f38584d.setAdapter(this.f65788s);
        m56413P().consume(this);
        m56411Q().m113187p(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C45168ma4<Unit> c45168ma4 = this.f65789t;
        Unit unit = Unit.INSTANCE;
        c45168ma4.accept(unit);
        this.f65791v.accept(unit);
    }

    @Override // p000.InterfaceC36272Tx6
    /* renamed from: p1 */
    public OperatorInfoCard mo56404p1() {
        return (OperatorInfoCard) this.f65781l.getValue();
    }

    @Override // p000.InterfaceC32680Eo5
    /* renamed from: q6 */
    public Observable<String> mo56403q6() {
        return this.f65788s.m31853q6();
    }

    @Override // p000.InterfaceC36272Tx6
    /* renamed from: v1 */
    public Observable<Unit> mo56402v1() {
        return InterfaceC36272Tx6.C8157a.m82220b(this);
    }

    @Override // p000.InterfaceC36272Tx6
    /* renamed from: w1 */
    public C48955sx4 mo56401w1() {
        return (C48955sx4) this.f65780k.getValue();
    }

    @Override // p000.InterfaceC36272Tx6
    /* renamed from: z5 */
    public Observable<DialogResponse> mo56400z5() {
        return InterfaceC36272Tx6.C8157a.m82218d(this);
    }
}
