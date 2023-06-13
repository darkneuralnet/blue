package co.bird.android.feature.complaintresolution.scanner;

import android.app.Application;
import android.os.Bundle;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.feature.complaintresolution.scanner.InterfaceC14749b;
import co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010&\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00060\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;", "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;", "Lam6;", "LZl6;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", TransferTable.COLUMN_STATE, "d0", "Lio/reactivex/Observable;", "doneClicks", "LWl6;", "l", "LWl6;", "b0", "()LWl6;", "setPresenter", "(LWl6;)V", "presenter", "LOl6;", "m", "LOl6;", "converter", "LNl6;", "n", "LNl6;", "adapter", "LYP3;", "o", "Lkotlin/Lazy;", "Z", "()LYP3;", "peekHelper", "Lma4;", "kotlin.jvm.PlatformType", "p", "Lma4;", "doneRelay", "<init>", "()V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleInvolvedScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInvolvedScanActivity.kt\nco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* loaded from: classes3.dex */
public final class VehicleInvolvedScanActivity extends BaseVehicleScanActivity<C38157am6> implements InterfaceC37568Zl6 {

    /* renamed from: l */
    public C36866Wl6 f63721l;

    /* renamed from: m */
    public final C34994Ol6 f63722m = new C34994Ol6();

    /* renamed from: n */
    public final C34760Nl6 f63723n = new C34760Nl6();

    /* renamed from: o */
    public final Lazy f63724o;

    /* renamed from: p */
    public final C45168ma4<Unit> f63725p;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "peekHeight", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.complaintresolution.scanner.VehicleInvolvedScanActivity$a */
    /* loaded from: classes3.dex */
    public static final class C14743a extends Lambda implements Function1<Integer, Unit> {
        public C14743a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            VehicleInvolvedScanActivity.this.mo54814w1().m86368qm(i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.complaintresolution.scanner.VehicleInvolvedScanActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14744b extends Lambda implements Function0<Unit> {
        public C14744b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VehicleInvolvedScanActivity.this.f63725p.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LYP3;", "b", "()LYP3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.scanner.VehicleInvolvedScanActivity$c */
    /* loaded from: classes3.dex */
    public static final class C14745c extends Lambda implements Function0<YP3> {
        public C14745c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final YP3 invoke() {
            RecyclerView recyclerView = VehicleInvolvedScanActivity.this.m54820U().f79266i;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
            return new YP3(recyclerView);
        }
    }

    public VehicleInvolvedScanActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C14745c());
        this.f63724o = lazy;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f63725p = m25409g;
    }

    /* renamed from: Z */
    public final YP3 m58415Z() {
        return (YP3) this.f63724o.getValue();
    }

    /* renamed from: b0 */
    public final C36866Wl6 m58414b0() {
        C36866Wl6 c36866Wl6 = this.f63721l;
        if (c36866Wl6 != null) {
            return c36866Wl6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity, p000.InterfaceC48362rx4
    /* renamed from: d0 */
    public void render(C38157am6 state) {
        boolean z;
        Intrinsics.checkNotNullParameter(state, "state");
        super.render(state);
        this.f63723n.mo24871u(this.f63722m.m91549a(state.m70760p()));
        LinearProgressIndicator linearProgressIndicator = m54820U().f79263f;
        Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "binding.progressBar");
        if (state.m70761o() > 0) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(linearProgressIndicator, z, 0, 2, null);
        Throwable error = state.getError();
        if (error != null) {
            C38689bg5.m64178c(mo54814w1(), error);
        }
    }

    @Override // p000.InterfaceC37568Zl6
    public Observable<Unit> doneClicks() {
        Observable<Unit> hide = this.f63725p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "doneRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity, co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC14749b.InterfaceC14750a m58411a = C14746a.m58411a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m58411a.mo58407a(c46172oG2.m21419a(application)).mo58408a(this);
        mo54814w1().mo86379gm(true);
        mo54814w1().m86366sm(false);
        this.f63723n.m93473x(m58415Z());
        m58415Z().m75089g(new C14743a());
        m54820U().f79266i.setAdapter(this.f63723n);
        m54820U().f79266i.setLayoutManager(new LinearLayoutManager(this));
        m54820U().f79266i.setItemAnimator(new C11894g());
        this.f63723n.m93474w(new C14744b());
        m58414b0().consume(this);
    }
}
