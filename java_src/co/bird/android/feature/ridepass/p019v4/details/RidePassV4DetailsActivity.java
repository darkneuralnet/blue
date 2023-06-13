package co.bird.android.feature.ridepass.p019v4.details;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.ridepass.p019v4.details.RidePassV4DetailsActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.model.persistence.nestedstructures.RidePassSubscriptionPlanView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001AB\u0007¢\u0006\u0004\b>\u0010?J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00107\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00180\u0018038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010;\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00050\u0005088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010=\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00050\u0005088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:¨\u0006B"}, m28432d2 = {"Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LrX4;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "LsX4;", TransferTable.COLUMN_STATE, "Z", "Lio/reactivex/Observable;", "", "P8", "e0", "b1", "g0", DateTokenConverter.CONVERTER_KEY, "c0", "LbX4;", "j", "LbX4;", "Y", "()LbX4;", "setPresenter", "(LbX4;)V", "presenter", "LN5;", "k", "LN5;", "binding", "LLW4;", "l", "LLW4;", "converter", "LKW4;", "m", "LKW4;", "adapter", "LAG;", "kotlin.jvm.PlatformType", "n", "LAG;", "linkCodeRelay", "Lma4;", "o", "Lma4;", "paymentSuccessRelay", "p", "infoClicksRelay", "<init>", "()V", "q", C17296a.f69688o, "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassV4DetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4DetailsActivity.kt\nco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* renamed from: co.bird.android.feature.ridepass.v4.details.RidePassV4DetailsActivity */
/* loaded from: classes3.dex */
public final class RidePassV4DetailsActivity extends BaseActivityLite implements InterfaceC48106rX4 {

    /* renamed from: q */
    public static final C15327a f64849q = new C15327a(null);

    /* renamed from: r */
    public static final Set<Integer> f64850r;

    /* renamed from: j */
    public C38601bX4 f64851j;

    /* renamed from: k */
    public C5474N5 f64852k;

    /* renamed from: l */
    public final LW4 f64853l = new LW4();

    /* renamed from: m */
    public final KW4 f64854m = new KW4();

    /* renamed from: n */
    public final C0058AG<String> f64855n;

    /* renamed from: o */
    public final C45168ma4<Unit> f64856o;

    /* renamed from: p */
    public final C45168ma4<Unit> f64857p;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$a;", "", "", "MENU_INFO_ID", "I", "", "PURCHASE_REQUEST_CODES", "Ljava/util/Set;", "<init>", "()V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ridepass.v4.details.RidePassV4DetailsActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15327a {
        public /* synthetic */ C15327a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15327a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ridepass.v4.details.RidePassV4DetailsActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15328b extends Lambda implements Function1<Unit, InterfaceC24574u<? extends DialogResponse>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.ridepass.v4.details.RidePassV4DetailsActivity$b$a */
        /* loaded from: classes3.dex */
        public static final class C15329a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C15329a f64859g = new C15329a();

            public C15329a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse response) {
                boolean z;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C15328b() {
            super(1);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(RidePassV4DetailsActivity.this.m58990F(), OU4.f26645d, false, false, 6, null);
            final C15329a c15329a = C15329a.f64859g;
            return birdDialog$default.m33098z(new InterfaceC23494q() { // from class: HW4
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = RidePassV4DetailsActivity.C15328b.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ridepass.v4.details.RidePassV4DetailsActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15330c extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public static final C15330c f64860g = new C15330c();

        public C15330c() {
            super(1);
        }

        /* renamed from: a */
        public final void m57376a(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m57376a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ridepass.v4.details.RidePassV4DetailsActivity$d */
    /* loaded from: classes3.dex */
    public static final class C15331d extends Lambda implements Function1<Unit, InterfaceC24574u<? extends DialogResponse>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.ridepass.v4.details.RidePassV4DetailsActivity$d$a */
        /* loaded from: classes3.dex */
        public static final class C15332a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C15332a f64862g = new C15332a();

            public C15332a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse response) {
                boolean z;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C15331d() {
            super(1);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(RidePassV4DetailsActivity.this.m58990F(), GV4.f12003d, false, false, 6, null);
            final C15332a c15332a = C15332a.f64862g;
            return birdDialog$default.m33098z(new InterfaceC23494q() { // from class: IW4
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = RidePassV4DetailsActivity.C15331d.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ridepass.v4.details.RidePassV4DetailsActivity$e */
    /* loaded from: classes3.dex */
    public static final class C15333e extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public static final C15333e f64863g = new C15333e();

        public C15333e() {
            super(1);
        }

        /* renamed from: a */
        public final void m57372a(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m57372a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    static {
        Set<Integer> of;
        of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{10046, 10030});
        f64850r = of;
    }

    public RidePassV4DetailsActivity() {
        C0058AG<String> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<String>()");
        this.f64855n = m115951g;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f64856o = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f64857p = m25409g2;
    }

    /* renamed from: U */
    public static final InterfaceC24574u m57385U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final Unit m57384X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final InterfaceC24574u m57381b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final Unit m57380d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC48106rX4
    /* renamed from: P8 */
    public Observable<String> mo15814P8() {
        Observable<String> hide = this.f64855n.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "linkCodeRelay.hide()");
        return hide;
    }

    /* renamed from: Y */
    public final C38601bX4 m57383Y() {
        C38601bX4 c38601bX4 = this.f64851j;
        if (c38601bX4 != null) {
            return c38601bX4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: Z */
    public void render(C48698sX4 state) {
        boolean z;
        C48698sX4 c48698sX4;
        RidePassSubscriptionPlanView ridePassSubscriptionPlanView;
        String string;
        List<C3023H6> m96715a;
        String str;
        Intrinsics.checkNotNullParameter(state, "state");
        S74.C7343a.showProgress$default(m58990F(), state.m14082c(), 0, 2, null);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            RidePassView m14081d = state.m14081d();
            if (m14081d != null) {
                str = m14081d.getTitle();
            } else {
                str = null;
            }
            supportActionBar.mo70242E(str);
        }
        if (state.m14081d() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c48698sX4 = state;
        } else {
            c48698sX4 = null;
        }
        if (c48698sX4 != null && (m96715a = this.f64853l.m96715a(c48698sX4)) != null) {
            this.f64854m.mo24871u(m96715a);
        }
        C5474N5 c5474n5 = this.f64852k;
        if (c5474n5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5474n5 = null;
        }
        Button button = c5474n5.f24117f;
        RidePassView m14081d2 = state.m14081d();
        if (m14081d2 != null) {
            ridePassSubscriptionPlanView = m14081d2.getSubscriptionPlan();
        } else {
            ridePassSubscriptionPlanView = null;
        }
        if (ridePassSubscriptionPlanView != null) {
            string = getString(C45871nl4.subscribe);
        } else {
            string = getString(C45871nl4.ride_pass_buy_pass_button);
        }
        button.setText(string);
        C5474N5 c5474n52 = this.f64852k;
        if (c5474n52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5474n52 = null;
        }
        c5474n52.f24117f.setEnabled(state.m14076i());
        C5474N5 c5474n53 = this.f64852k;
        if (c5474n53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5474n53 = null;
        }
        Button button2 = c5474n53.f24117f;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.subscribe");
        C49520tu6.show$default(button2, state.m14078g(), 0, 2, null);
        C5474N5 c5474n54 = this.f64852k;
        if (c5474n54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5474n54 = null;
        }
        Button button3 = c5474n54.f24114c;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.cancel");
        C49520tu6.show$default(button3, state.m14080e(), 0, 2, null);
        C5474N5 c5474n55 = this.f64852k;
        if (c5474n55 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5474n55 = null;
        }
        Button button4 = c5474n55.f24118g;
        Intrinsics.checkNotNullExpressionValue(button4, "binding.transfer");
        C49520tu6.show$default(button4, state.m14077h(), 0, 2, null);
        Throwable m14083b = state.m14083b();
        if (m14083b != null) {
            C38689bg5.m64178c(m58990F(), m14083b);
        }
    }

    @Override // p000.InterfaceC48106rX4
    /* renamed from: b1 */
    public Observable<Unit> mo15813b1() {
        Observable<Unit> hide = this.f64856o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "paymentSuccessRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC48106rX4
    /* renamed from: c0 */
    public Observable<Unit> mo15812c0() {
        C5474N5 c5474n5 = this.f64852k;
        if (c5474n5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5474n5 = null;
        }
        Button button = c5474n5.f24118g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.transfer");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C15331d c15331d = new C15331d();
        Observable flatMapMaybe = clicksThrottle$default.flatMapMaybe(new InterfaceC23492o() { // from class: FW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m57381b0;
                m57381b0 = RidePassV4DetailsActivity.m57381b0(Function1.this, obj);
                return m57381b0;
            }
        });
        final C15333e c15333e = C15333e.f64863g;
        Observable<Unit> map = flatMapMaybe.map(new InterfaceC23492o() { // from class: GW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m57380d0;
                m57380d0 = RidePassV4DetailsActivity.m57380d0(Function1.this, obj);
                return m57380d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun transferCli…}\n      .map { Unit }\n  }");
        return map;
    }

    @Override // p000.InterfaceC48106rX4
    /* renamed from: d */
    public Observable<Unit> mo15811d() {
        C5474N5 c5474n5 = this.f64852k;
        if (c5474n5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5474n5 = null;
        }
        Button button = c5474n5.f24114c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancel");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C15328b c15328b = new C15328b();
        Observable flatMapMaybe = clicksThrottle$default.flatMapMaybe(new InterfaceC23492o() { // from class: DW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m57385U;
                m57385U = RidePassV4DetailsActivity.m57385U(Function1.this, obj);
                return m57385U;
            }
        });
        final C15330c c15330c = C15330c.f64860g;
        Observable<Unit> map = flatMapMaybe.map(new InterfaceC23492o() { // from class: EW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m57384X;
                m57384X = RidePassV4DetailsActivity.m57384X(Function1.this, obj);
                return m57384X;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun cancelClick…}\n      .map { Unit }\n  }");
        return map;
    }

    @Override // p000.InterfaceC48106rX4
    /* renamed from: e0 */
    public Observable<Unit> mo15810e0() {
        C5474N5 c5474n5 = this.f64852k;
        if (c5474n5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5474n5 = null;
        }
        Button button = c5474n5.f24117f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.subscribe");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC48106rX4
    /* renamed from: g0 */
    public Observable<Unit> mo15809g0() {
        Observable<Unit> hide = this.f64857p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "infoClicksRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (f64850r.contains(Integer.valueOf(i)) && i2 == -1) {
            this.f64856o.accept(Unit.INSTANCE);
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5474N5 m94390c = C5474N5.m94390c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m94390c, "inflate(layoutInflater)");
        this.f64852k = m94390c;
        C5474N5 c5474n5 = null;
        if (m94390c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m94390c = null;
        }
        setContentView(m94390c.getRoot());
        DP0.m110542a().mo110541a(m58989H()).mo110540a(this);
        C5474N5 c5474n52 = this.f64852k;
        if (c5474n52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5474n52 = null;
        }
        c5474n52.f24116e.setAdapter(this.f64854m);
        C5474N5 c5474n53 = this.f64852k;
        if (c5474n53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5474n53 = null;
        }
        c5474n53.f24116e.setLayoutManager(new LinearLayoutManager(this));
        C5474N5 c5474n54 = this.f64852k;
        if (c5474n54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c5474n5 = c5474n54;
        }
        c5474n5.f24116e.setItemAnimator(new C11894g());
        m57383Y().consume(this);
        String stringExtra = getIntent().getStringExtra("ride_pass_link_code");
        if (stringExtra != null) {
            this.f64855n.accept(stringExtra);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        menu.add(0, 0, 0, getString(C45871nl4.general_info));
        MenuItem findItem = menu.findItem(0);
        findItem.setIcon(C48193rg4.ic_info);
        findItem.setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 0) {
            this.f64857p.accept(Unit.INSTANCE);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
