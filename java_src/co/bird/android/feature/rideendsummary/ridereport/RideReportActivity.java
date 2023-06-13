package co.bird.android.feature.rideendsummary.ridereport;

import android.app.Application;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.rideendsummary.ridereport.InterfaceC15296b;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireRideReport;
import co.bird.android.model.wire.WireRideReportItem;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b7\u00108J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00102\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00120\u00120.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00104\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00140\u00140.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\"\u00106\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00050\u00050.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101¨\u00069"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LG35;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "LH35;", TransferTable.COLUMN_STATE, "Q", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireRideDetail;", "N5", "Lco/bird/android/model/wire/WireRideReportItem;", "t7", "k9", "LF35;", "j", "LF35;", "P", "()LF35;", "setPresenter", "(LF35;)V", "presenter", "LQ5;", "k", "LQ5;", "binding", "l", "Landroid/view/MenuItem;", "moreInfoItem", "Lr35;", "m", "Lr35;", "adapter", "Ls35;", "n", "Ls35;", "converter", "Lma4;", "kotlin.jvm.PlatformType", "o", "Lma4;", "rideDetailRelay", "p", "reportItemRelay", "q", "moreInfoRelay", "<init>", "()V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideReportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportActivity.kt\nco/bird/android/feature/rideendsummary/ridereport/RideReportActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
/* loaded from: classes3.dex */
public final class RideReportActivity extends BaseActivityLite implements G35 {

    /* renamed from: j */
    public F35 f64780j;

    /* renamed from: k */
    public C6674Q5 f64781k;

    /* renamed from: l */
    public MenuItem f64782l;

    /* renamed from: m */
    public final C47830r35 f64783m = new C47830r35();

    /* renamed from: n */
    public final C48422s35 f64784n = new C48422s35();

    /* renamed from: o */
    public final C45168ma4<WireRideDetail> f64785o;

    /* renamed from: p */
    public final C45168ma4<WireRideReportItem> f64786p;

    /* renamed from: q */
    public final C45168ma4<Unit> f64787q;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rideendsummary.ridereport.RideReportActivity$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15292a extends FunctionReferenceImpl implements Function1<WireRideReportItem, Unit> {
        public C15292a(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m57435a(WireRideReportItem p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideReportItem wireRideReportItem) {
            m57435a(wireRideReportItem);
            return Unit.INSTANCE;
        }
    }

    public RideReportActivity() {
        C45168ma4<WireRideDetail> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<WireRideDetail>()");
        this.f64785o = m25409g;
        C45168ma4<WireRideReportItem> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<WireRideReportItem>()");
        this.f64786p = m25409g2;
        C45168ma4<Unit> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Unit>()");
        this.f64787q = m25409g3;
    }

    @Override // p000.G35
    /* renamed from: N5 */
    public Observable<WireRideDetail> mo57440N5() {
        Observable<WireRideDetail> hide = this.f64785o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "rideDetailRelay.hide()");
        return hide;
    }

    /* renamed from: P */
    public final F35 m57439P() {
        F35 f35 = this.f64780j;
        if (f35 != null) {
            return f35;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: Q */
    public void render(H35 state) {
        String str;
        boolean z;
        WireRideReport report;
        List<C3023H6> m14820a;
        Intrinsics.checkNotNullParameter(state, "state");
        WireRideDetail m104463d = state.m104463d();
        if (m104463d != null && (m14820a = this.f64784n.m14820a(m104463d)) != null) {
            this.f64783m.mo24871u(m14820a);
        }
        MenuItem menuItem = this.f64782l;
        if (menuItem != null) {
            WireRideDetail m104463d2 = state.m104463d();
            if (m104463d2 != null && (report = m104463d2.getReport()) != null) {
                str = report.getMoreInfoUrl();
            } else {
                str = null;
            }
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            menuItem.setVisible(z);
        }
        AbstractC5751Ny m104465b = state.m104465b();
        if (m104465b != null) {
            H31.C3014a.showBirdDialog$default(m58990F(), m104465b, false, false, null, null, null, null, 126, null);
        }
        Throwable m104464c = state.m104464c();
        if (m104464c != null) {
            C38689bg5.m64178c(m58990F(), m104464c);
        }
    }

    @Override // p000.G35
    /* renamed from: k9 */
    public Observable<Unit> mo57437k9() {
        Observable<Unit> hide = this.f64787q.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "moreInfoRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC15296b.InterfaceC15297a m57434a = C15293a.m57434a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m57434a.mo57430a(c46172oG2.m21419a(application)).mo57431a(this);
        C6674Q5 m88948c = C6674Q5.m88948c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m88948c, "inflate(layoutInflater)");
        this.f64781k = m88948c;
        C6674Q5 c6674q5 = null;
        if (m88948c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m88948c = null;
        }
        setContentView(m88948c.getRoot());
        C6674Q5 c6674q52 = this.f64781k;
        if (c6674q52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6674q52 = null;
        }
        c6674q52.getRoot().setLayoutManager(new LinearLayoutManager(this));
        C6674Q5 c6674q53 = this.f64781k;
        if (c6674q53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6674q53 = null;
        }
        c6674q53.getRoot().setAdapter(this.f64783m);
        C6674Q5 c6674q54 = this.f64781k;
        if (c6674q54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c6674q5 = c6674q54;
        }
        c6674q5.getRoot().setItemAnimator(new C11894g());
        this.f64783m.m16558w(new C15292a(this.f64786p));
        m57439P().consume(this);
        WireRideDetail wireRideDetail = (WireRideDetail) getIntent().getParcelableExtra("ride_detail");
        if (wireRideDetail != null) {
            this.f64785o.accept(wireRideDetail);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        String str;
        boolean z;
        WireRideReport report;
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C35217Pk4.menu_ride_report, menu);
        MenuItem findItem = menu.findItem(C35892Sh4.moreInfo);
        WireRideDetail m104463d = m57439P().m42277k().m104463d();
        if (m104463d != null && (report = m104463d.getReport()) != null) {
            str = report.getMoreInfoUrl();
        } else {
            str = null;
        }
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        findItem.setVisible(z);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C35892Sh4.moreInfo) {
            this.f64787q.accept(Unit.INSTANCE);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // p000.G35
    /* renamed from: t7 */
    public Observable<WireRideReportItem> mo57436t7() {
        Observable<WireRideReportItem> hide = this.f64786p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "reportItemRelay.hide()");
        return hide;
    }
}
