package p000;

import co.bird.android.feature.rideendsummary.exceptions.RideReportPending;
import co.bird.android.model.constant.RideReportStatus;
import co.bird.android.model.wire.WireLegacyAsset;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireRideReport;
import co.bird.android.model.wire.WireRideReportItem;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LF35;", "Lf1;", "LG35;", "LH35;", "renderer", "", "x", "LYR4;", "e", "LYR4;", "rideManager", "Le13;", "f", "Le13;", "navigator", "Lma4;", "Lco/bird/android/model/wire/WireRideDetail;", "kotlin.jvm.PlatformType", "g", "Lma4;", "rideDetailRelay", "<init>", "(LYR4;Le13;)V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportPresenter.kt\nco/bird/android/feature/rideendsummary/ridereport/RideReportPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,93:1\n180#2:94\n161#2:95\n180#2:96\n180#2:97\n*S KotlinDebug\n*F\n+ 1 RideReportPresenter.kt\nco/bird/android/feature/rideendsummary/ridereport/RideReportPresenter\n*L\n33#1:94\n58#1:95\n62#1:96\n87#1:97\n*E\n"})
/* renamed from: F35 */
/* loaded from: classes3.dex */
public final class F35 extends AbstractC20169f1<G35, H35> {

    /* renamed from: e */
    public final YR4 f8575e;

    /* renamed from: f */
    public final InterfaceC40099e13 f8576f;

    /* renamed from: g */
    public final C45168ma4<WireRideDetail> f8577g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "kotlin.jvm.PlatformType", "rideDetail", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F35$a */
    /* loaded from: classes3.dex */
    public static final class C2113a extends Lambda implements Function1<WireRideDetail, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LH35;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LH35;)LH35;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: F35$a$a */
        /* loaded from: classes3.dex */
        public static final class C2114a extends Lambda implements Function1<H35, H35> {

            /* renamed from: g */
            public final /* synthetic */ WireRideDetail f8579g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2114a(WireRideDetail wireRideDetail) {
                super(1);
                this.f8579g = wireRideDetail;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final H35 invoke(H35 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.m104466a(this.f8579g);
            }
        }

        public C2113a() {
            super(1);
        }

        /* renamed from: a */
        public final void m107883a(WireRideDetail wireRideDetail) {
            F35.this.m42279i(new C2114a(wireRideDetail));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideDetail wireRideDetail) {
            m107883a(wireRideDetail);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F35$b */
    /* loaded from: classes3.dex */
    public static final class C2115b extends Lambda implements Function1<WireRideDetail, InterfaceC24574u<? extends String>> {

        /* renamed from: g */
        public static final C2115b f8580g = new C2115b();

        public C2115b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends String> invoke(WireRideDetail rideDetail) {
            String str;
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            WireRideReport report = rideDetail.getReport();
            if (report != null) {
                str = report.getMoreInfoUrl();
            } else {
                str = null;
            }
            if (str != null) {
                return AbstractC24507p.m32068G(str);
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "moreInfoUrl", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F35$c */
    /* loaded from: classes3.dex */
    public static final class C2116c extends Lambda implements Function1<String, Unit> {
        public C2116c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String moreInfoUrl) {
            InterfaceC40099e13 interfaceC40099e13 = F35.this.f8576f;
            Intrinsics.checkNotNullExpressionValue(moreInfoUrl, "moreInfoUrl");
            InterfaceC40099e13.C19924a.goToWebView$default(interfaceC40099e13, moreInfoUrl, null, null, true, 6, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F35$d */
    /* loaded from: classes3.dex */
    public static final class C2117d extends Lambda implements Function1<WireRideDetail, Boolean> {

        /* renamed from: g */
        public static final C2117d f8582g = new C2117d();

        public C2117d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WireRideDetail rideDetail) {
            boolean z;
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            if (rideDetail.getReportStatus() == RideReportStatus.PENDING) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F35$e */
    /* loaded from: classes3.dex */
    public static final class C2118e extends Lambda implements Function1<WireRideDetail, InterfaceC23434B<? extends WireRideDetail>> {
        public C2118e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends WireRideDetail> invoke(WireRideDetail rideDetail) {
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            return F35.this.f8575e.mo75045g(rideDetail.getRide().getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRideDetail;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportPresenter.kt\nco/bird/android/feature/rideendsummary/ridereport/RideReportPresenter$consume$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
    /* renamed from: F35$f */
    /* loaded from: classes3.dex */
    public static final class C2119f extends Lambda implements Function1<WireRideDetail, WireRideDetail> {

        /* renamed from: g */
        public static final C2119f f8584g = new C2119f();

        public C2119f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireRideDetail invoke(WireRideDetail rideDetail) {
            boolean z;
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            if (rideDetail.getReportStatus() == RideReportStatus.AVAILABLE) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                rideDetail = null;
            }
            if (rideDetail != null) {
                return rideDetail;
            }
            throw RideReportPending.f64779b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F35$g */
    /* loaded from: classes3.dex */
    public static final class C2120g extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LH35;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LH35;)LH35;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRideReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportPresenter.kt\nco/bird/android/feature/rideendsummary/ridereport/RideReportPresenter$consume$6$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
        /* renamed from: F35$g$a */
        /* loaded from: classes3.dex */
        public static final class C2121a extends Lambda implements Function1<H35, H35> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f8586g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2121a(Throwable th) {
                super(1);
                this.f8586g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final H35 invoke(H35 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                H35 copy$default = H35.copy$default(state, null, 1, null);
                copy$default.m104461f(this.f8586g);
                return copy$default;
            }
        }

        public C2120g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            F35.this.m42279i(new C2121a(th));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F35$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2122h extends FunctionReferenceImpl implements Function1<WireRideDetail, Unit> {
        public C2122h(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m107876a(WireRideDetail p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideDetail wireRideDetail) {
            m107876a(wireRideDetail);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideReportItem;", "kotlin.jvm.PlatformType", "rideReportItem", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideReportItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F35$i */
    /* loaded from: classes3.dex */
    public static final class C2123i extends Lambda implements Function1<WireRideReportItem, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LH35;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LH35;)LH35;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRideReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportPresenter.kt\nco/bird/android/feature/rideendsummary/ridereport/RideReportPresenter$consume$8$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
        /* renamed from: F35$i$a */
        /* loaded from: classes3.dex */
        public static final class C2124a extends Lambda implements Function1<H35, H35> {

            /* renamed from: g */
            public final /* synthetic */ String f8588g;

            /* renamed from: h */
            public final /* synthetic */ String f8589h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2124a(String str, String str2) {
                super(1);
                this.f8588g = str;
                this.f8589h = str2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final H35 invoke(H35 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                H35 copy$default = H35.copy$default(state, null, 1, null);
                copy$default.m104462e(new C50868wB1(this.f8588g, this.f8589h));
                return copy$default;
            }
        }

        public C2123i() {
            super(1);
        }

        /* renamed from: a */
        public final void m107875a(WireRideReportItem wireRideReportItem) {
            List listOf;
            WireLegacyAsset imageAsset = wireRideReportItem.getImageAsset();
            String imageTitle = wireRideReportItem.getImageTitle();
            String imageCaption = wireRideReportItem.getImageCaption();
            if (imageAsset != null) {
                InterfaceC40099e13 interfaceC40099e13 = F35.this.f8576f;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(imageAsset.getMedia().getMediaUrl(), null));
                InterfaceC40099e13.C19924a.goToLightbox$default(interfaceC40099e13, listOf, 0, 2, null);
            } else if (imageTitle != null && imageCaption != null) {
                F35.this.m42279i(new C2124a(imageTitle, imageCaption));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideReportItem wireRideReportItem) {
            m107875a(wireRideReportItem);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "<anonymous parameter 0>", "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", C17296a.f69688o, "(Lkotlin/Unit;Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRideDetail;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F35$j */
    /* loaded from: classes3.dex */
    public static final class C2125j extends Lambda implements Function2<Unit, WireRideDetail, WireRideDetail> {

        /* renamed from: g */
        public static final C2125j f8590g = new C2125j();

        public C2125j() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final WireRideDetail invoke(Unit unit, WireRideDetail rideDetail) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            return rideDetail;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F35(YR4 rideManager, InterfaceC40099e13 navigator) {
        super(new H35(null, 1, null));
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f8575e = rideManager;
        this.f8576f = navigator;
        C45168ma4<WireRideDetail> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<WireRideDetail>()");
        this.f8577g = m25409g;
    }

    /* renamed from: A */
    public static final InterfaceC23434B m107906A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final WireRideDetail m107905B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireRideDetail) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final boolean m107904C(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return e instanceof RideReportPending;
    }

    /* renamed from: D */
    public static final void m107903D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m107902E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m107901F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final WireRideDetail m107900G(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireRideDetail) tmp0.invoke(obj, obj2);
    }

    /* renamed from: H */
    public static final InterfaceC24574u m107899H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m107898f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final boolean m107885y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: z */
    public static final void m107884z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: x */
    public void consume(G35 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable merge = Observable.merge(renderer.mo57440N5(), this.f8577g);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      renderer.ri…    rideDetailRelay\n    )");
        Object m33094as = merge.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2113a c2113a = new C2113a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: u35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F35.m107898f(Function1.this, obj);
            }
        });
        Observable<WireRideDetail> mo57440N5 = renderer.mo57440N5();
        final C2117d c2117d = C2117d.f8582g;
        AbstractC23442F<WireRideDetail> firstOrError = mo57440N5.filter(new InterfaceC23494q() { // from class: x35
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m107885y;
                m107885y = F35.m107885y(Function1.this, obj);
                return m107885y;
            }
        }).firstOrError();
        final C2118e c2118e = new C2118e();
        Observable<R> m33162D = firstOrError.m33162D(new InterfaceC23492o() { // from class: y35
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m107906A;
                m107906A = F35.m107906A(Function1.this, obj);
                return m107906A;
            }
        });
        final C2119f c2119f = C2119f.f8584g;
        AbstractC24490k m32182O0 = m33162D.map(new InterfaceC23492o() { // from class: z35
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireRideDetail m107905B;
                m107905B = F35.m107905B(Function1.this, obj);
                return m107905B;
            }
        }).toFlowable(EnumC23460b.BUFFER).m32182O0(SN4.m85592l(new InterfaceC23494q() { // from class: A35
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m107904C;
                m107904C = F35.m107904C((Throwable) obj);
                return m107904C;
            }
        }).m85584b(3L, TimeUnit.SECONDS).m85585a());
        final C2120g c2120g = new C2120g();
        AbstractC24490k m32195I = m32182O0.m32195I(new InterfaceC23484g() { // from class: B35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F35.m107903D(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32195I, "override fun consume(ren…ctUrl = true)\n      }\n  }");
        Object m32150f = m32195I.m32150f(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2122h c2122h = new C2122h(this.f8577g);
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: C35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F35.m107902E(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.mo57436t7().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2123i c2123i = new C2123i();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: D35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F35.m107901F(Function1.this, obj);
            }
        });
        Observable<Unit> mo57437k9 = renderer.mo57437k9();
        Observable merge2 = Observable.merge(renderer.mo57440N5(), this.f8577g);
        final C2125j c2125j = C2125j.f8590g;
        Observable<R> withLatestFrom = mo57437k9.withLatestFrom(merge2, new InterfaceC23480c() { // from class: E35
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                WireRideDetail m107900G;
                m107900G = F35.m107900G(Function2.this, obj, obj2);
                return m107900G;
            }
        });
        final C2115b c2115b = C2115b.f8580g;
        Observable flatMapMaybe = withLatestFrom.flatMapMaybe(new InterfaceC23492o() { // from class: v35
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m107899H;
                m107899H = F35.m107899H(Function1.this, obj);
                return m107899H;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "renderer.moreInfoClicks(…lse Maybe.empty()\n      }");
        Object m33094as3 = flatMapMaybe.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2116c c2116c = new C2116c();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: w35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F35.m107884z(Function1.this, obj);
            }
        });
    }
}
