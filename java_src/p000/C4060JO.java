package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.p008ui.MapBirdUi;
import co.bird.android.app.feature.map.p008ui.renderer.MerchantRenderItem;
import co.bird.android.model.FlightBannerNode;
import co.bird.android.model.Trigger;
import co.bird.android.model.offer.WireCouponOffer;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC23227iO;
import p000.InterfaceC40001dr4;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\b\b\u0001\u0010&\u001a\u00020#\u0012\b\b\u0001\u0010*\u001a\u00020'\u0012\b\b\u0001\u0010.\u001a\u00020+\u0012\b\b\u0001\u00102\u001a\u00020/¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u0010:\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\u0014\u0010>\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, m28432d2 = {"LJO;", "LuO;", "", "z", "v", "p", "", "Lco/bird/android/model/wire/WireMerchantSite;", "merchantSites", "J", "E", "merchantSite", "I", "K", "H", "LEa;", C17296a.f69688o, "LEa;", "analyticsManager", "LiO;", "b", "LiO;", "birdPayManager", "Ldr4;", "c", "Ldr4;", "locationManager", "Lue3;", DateTokenConverter.CONVERTER_KEY, "Lue3;", "offerManager", "Le13;", "e", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/app/feature/map/ui/MapBirdUi;", "g", "Lco/bird/android/app/feature/map/ui/MapBirdUi;", "mapUi", "LTq4;", "h", "LTq4;", "reactiveConfig", "LZr1;", "i", "LZr1;", "flightBannerCoordinatorPresenter", "", "j", "Z", "enabled", "k", "showOnMap", "l", "showMerchantInfoOnPinClicked", "", "o", "()D", "refreshRadius", "<init>", "(LEa;LiO;Ldr4;Lue3;Le13;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/MapBirdUi;LTq4;LZr1;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPayPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayPresenter.kt\nco/bird/android/app/feature/birdpay/BirdPayPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n237#2:217\n180#2:218\n199#2:219\n180#2:220\n180#2:221\n180#2:236\n2333#3,14:222\n*S KotlinDebug\n*F\n+ 1 BirdPayPresenter.kt\nco/bird/android/app/feature/birdpay/BirdPayPresenterImpl\n*L\n97#1:217\n107#1:218\n130#1:219\n145#1:220\n156#1:221\n185#1:236\n169#1:222,14\n*E\n"})
/* renamed from: JO */
/* loaded from: classes2.dex */
public final class C4060JO implements InterfaceC29188uO {

    /* renamed from: a */
    public final InterfaceC1880Ea f17464a;

    /* renamed from: b */
    public final InterfaceC23227iO f17465b;

    /* renamed from: c */
    public final InterfaceC40001dr4 f17466c;

    /* renamed from: d */
    public final InterfaceC49950ue3 f17467d;

    /* renamed from: e */
    public final InterfaceC40099e13 f17468e;

    /* renamed from: f */
    public final ScopeProvider f17469f;

    /* renamed from: g */
    public final MapBirdUi f17470g;

    /* renamed from: h */
    public final C36207Tq4 f17471h;

    /* renamed from: i */
    public final InterfaceC37617Zr1 f17472i;

    /* renamed from: j */
    public final boolean f17473j;

    /* renamed from: k */
    public final boolean f17474k;

    /* renamed from: l */
    public final boolean f17475l;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LfM2;", "it", "", "invoke", "(LfM2;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JO$a */
    /* loaded from: classes2.dex */
    public static final class C4061a extends Lambda implements Function1<C40889fM2, Boolean> {

        /* renamed from: g */
        public static final C4061a f17476g = new C4061a();

        public C4061a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C40889fM2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m41531c() instanceof MerchantRenderItem);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LfM2;", "it", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LfM2;)Lco/bird/android/model/wire/WireMerchantSite;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JO$b */
    /* loaded from: classes2.dex */
    public static final class C4062b extends Lambda implements Function1<C40889fM2, WireMerchantSite> {

        /* renamed from: g */
        public static final C4062b f17477g = new C4062b();

        public C4062b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireMerchantSite invoke(C40889fM2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object m41531c = it.m41531c();
            Intrinsics.checkNotNull(m41531c, "null cannot be cast to non-null type co.bird.android.app.feature.map.ui.renderer.MerchantRenderItem");
            return ((MerchantRenderItem) m41531c).getMerchantSite();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JO$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4063c extends FunctionReferenceImpl implements Function1<WireMerchantSite, Unit> {
        public C4063c(Object obj) {
            super(1, obj, C4060JO.class, "onMerchantSiteSelected", "onMerchantSiteSelected(Lco/bird/android/model/wire/WireMerchantSite;)V", 0);
        }

        /* renamed from: a */
        public final void m100525a(WireMerchantSite p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C4060JO) this.receiver).m100555I(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireMerchantSite wireMerchantSite) {
            m100525a(wireMerchantSite);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LfM2;", "it", "", "invoke", "(LfM2;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JO$d */
    /* loaded from: classes2.dex */
    public static final class C4064d extends Lambda implements Function1<C40889fM2, Boolean> {

        /* renamed from: g */
        public static final C4064d f17478g = new C4064d();

        public C4064d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C40889fM2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!(it.m41531c() instanceof MerchantRenderItem));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireMerchantSite;", "sites", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPayPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayPresenter.kt\nco/bird/android/app/feature/birdpay/BirdPayPresenterImpl$observeMerchantSitesMapRender$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n766#2:217\n857#2,2:218\n*S KotlinDebug\n*F\n+ 1 BirdPayPresenter.kt\nco/bird/android/app/feature/birdpay/BirdPayPresenterImpl$observeMerchantSitesMapRender$1\n*L\n104#1:217\n104#1:218,2\n*E\n"})
    /* renamed from: JO$e */
    /* loaded from: classes2.dex */
    public static final class C4065e extends Lambda implements Function1<List<? extends WireMerchantSite>, List<? extends WireMerchantSite>> {

        /* renamed from: g */
        public static final C4065e f17479g = new C4065e();

        public C4065e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireMerchantSite> invoke(List<WireMerchantSite> sites) {
            Intrinsics.checkNotNullParameter(sites, "sites");
            ArrayList arrayList = new ArrayList();
            for (Object obj : sites) {
                if (((WireMerchantSite) obj).getOpen()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007 \u0006*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "Landroid/location/Location;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JO$f */
    /* loaded from: classes2.dex */
    public static final class C4066f extends Lambda implements Function1<Pair<? extends List<? extends WireMerchantSite>, ? extends Location>, Unit> {
        public C4066f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends WireMerchantSite>, ? extends Location> pair) {
            invoke2((Pair<? extends List<WireMerchantSite>, ? extends Location>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<WireMerchantSite>, ? extends Location> pair) {
            List<WireMerchantSite> merchantSites = pair.component1();
            Location userLocation = pair.component2();
            C4060JO c4060jo = C4060JO.this;
            Intrinsics.checkNotNullExpressionValue(merchantSites, "merchantSites");
            c4060jo.m100554J(merchantSites);
            C4060JO.this.f17470g.setMerchantSites(merchantSites);
            Double bannerProminenceThreshold = C4060JO.this.f17471h.m82623f8().m73665a().getBirdPayConfig().getBannerProminenceThreshold();
            boolean z = false;
            if (bannerProminenceThreshold != null) {
                C4060JO c4060jo2 = C4060JO.this;
                double doubleValue = bannerProminenceThreshold.doubleValue();
                InterfaceC23227iO interfaceC23227iO = c4060jo2.f17465b;
                Intrinsics.checkNotNullExpressionValue(userLocation, "userLocation");
                WireMerchantSite mo27364c = interfaceC23227iO.mo27364c(userLocation, InterfaceC23227iO.EnumC23228a.BANNER, doubleValue);
                if (mo27364c != null) {
                    c4060jo2.f17465b.mo27363d(mo27364c);
                    c4060jo2.f17472i.mo40695M1(FlightBannerNode.FlightBanner.MERCHANT_SITE_INFO);
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C4060JO.this.f17472i.mo40694N1(FlightBannerNode.FlightBanner.MERCHANT_SITE_INFO);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Landroid/location/Location;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JO$g */
    /* loaded from: classes2.dex */
    public static final class C4067g extends Lambda implements Function1<Pair<? extends Location, ? extends List<? extends WireMerchantSite>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ double f17482h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4067g(double d) {
            super(1);
            this.f17482h = d;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Location, ? extends List<? extends WireMerchantSite>> pair) {
            invoke2((Pair<? extends Location, ? extends List<WireMerchantSite>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Location, ? extends List<WireMerchantSite>> pair) {
            pair.component2();
            WireMerchantSite mo27357j = C4060JO.this.f17465b.mo27357j(pair.component1(), this.f17482h);
            if (mo27357j != null) {
                C4060JO c4060jo = C4060JO.this;
                c4060jo.m100553K(mo27357j);
                c4060jo.f17468e.mo36923w2(mo27357j.getId(), Trigger.CLOSEST_AUTOSELECT);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JO$h */
    /* loaded from: classes2.dex */
    public static final class C4068h extends Lambda implements Function1<LatLng, LatLng> {

        /* renamed from: g */
        public static final C4068h f17483g = new C4068h();

        public C4068h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final LatLng invoke(LatLng it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new LatLng(it.f71430b, it.f71431c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "it", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lcom/google/android/gms/maps/model/LatLng;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JO$i */
    /* loaded from: classes2.dex */
    public static final class C4069i extends Lambda implements Function1<Location, LatLng> {

        /* renamed from: g */
        public static final C4069i f17484g = new C4069i();

        public C4069i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final LatLng invoke(Location it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new LatLng(it.getLatitude(), it.getLongitude());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/LatLng;", "", "kotlin.jvm.PlatformType", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JO$j */
    /* loaded from: classes2.dex */
    public static final class C4070j extends Lambda implements Function1<LatLng, Pair<? extends LatLng, ? extends Double>> {
        public C4070j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<LatLng, Double> invoke(LatLng it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TuplesKt.m28425to(it, Double.valueOf(C4060JO.this.m100538o()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0001H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "Lco/bird/android/model/offer/WireCouponOffer;", "Lco/bird/android/model/wire/configs/Config;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JO$l */
    /* loaded from: classes2.dex */
    public static final class C4072l extends Lambda implements Function1<Pair<? extends List<? extends WireCouponOffer>, ? extends Config>, Pair<? extends Boolean, ? extends Boolean>> {

        /* renamed from: g */
        public static final C4072l f17487g = new C4072l();

        public C4072l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends Boolean, ? extends Boolean> invoke(Pair<? extends List<? extends WireCouponOffer>, ? extends Config> pair) {
            return invoke2((Pair<? extends List<WireCouponOffer>, Config>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<Boolean, Boolean> invoke2(Pair<? extends List<WireCouponOffer>, Config> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return new Pair<>(Boolean.valueOf(!pair.component1().isEmpty()), Boolean.valueOf(pair.component2().getOfferConfig().getDisplayOfferBanners()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JO$m */
    /* loaded from: classes2.dex */
    public static final class C4073m extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
        public C4073m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            boolean booleanValue = pair.component1().booleanValue();
            boolean booleanValue2 = pair.component2().booleanValue();
            if (booleanValue && booleanValue2) {
                C4060JO.this.f17472i.mo40695M1(FlightBannerNode.FlightBanner.BIRD_PAY_PROMO);
            } else {
                C4060JO.this.f17472i.mo40694N1(FlightBannerNode.FlightBanner.BIRD_PAY_PROMO);
            }
        }
    }

    public C4060JO(InterfaceC1880Ea analyticsManager, InterfaceC23227iO birdPayManager, InterfaceC40001dr4 locationManager, InterfaceC49950ue3 offerManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, MapBirdUi mapUi, C36207Tq4 reactiveConfig, InterfaceC37617Zr1 flightBannerCoordinatorPresenter) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdPayManager, "birdPayManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(offerManager, "offerManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(flightBannerCoordinatorPresenter, "flightBannerCoordinatorPresenter");
        this.f17464a = analyticsManager;
        this.f17465b = birdPayManager;
        this.f17466c = locationManager;
        this.f17467d = offerManager;
        this.f17468e = navigator;
        this.f17469f = scopeProvider;
        this.f17470g = mapUi;
        this.f17471h = reactiveConfig;
        this.f17472i = flightBannerCoordinatorPresenter;
        this.f17473j = reactiveConfig.m82623f8().m73665a().getBirdPayConfig().getEnableBirdPay();
        this.f17474k = reactiveConfig.m82623f8().m73665a().getBirdPayConfig().getShowBirdPayOnMap();
        this.f17475l = reactiveConfig.m82623f8().m73665a().getBirdPayConfig().getShowMerchantInfoOnPinTap();
    }

    /* renamed from: A */
    public static final LatLng m100563A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LatLng) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final LatLng m100562B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LatLng) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final Pair m100561C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23496h m100560D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final Pair m100558F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m100557G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m100536q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final boolean m100535r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: s */
    public static final void m100534s(C4060JO this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f17465b.mo27365b();
        if (!this$0.f17475l) {
            this$0.f17472i.mo40694N1(FlightBannerNode.FlightBanner.MERCHANT_SITE_INFO);
        }
    }

    /* renamed from: t */
    public static final boolean m100533t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: u */
    public static final WireMerchantSite m100532u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireMerchantSite) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final List m100530w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m100529x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m100528y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public final void m100559E() {
        Observable m31956a = C24523e.f91168a.m31956a(this.f17467d.mo3141a(), this.f17471h.m82623f8());
        final C4072l c4072l = C4072l.f17487g;
        Observable observeOn = m31956a.map(new InterfaceC23492o() { // from class: vO
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m100558F;
                m100558F = C4060JO.m100558F(Function1.this, obj);
                return m100558F;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f17469f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4073m c4073m = new C4073m();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: AO
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4060JO.m100557G(Function1.this, obj);
            }
        });
    }

    /* renamed from: H */
    public void m100556H() {
        if (this.f17473j) {
            m100527z();
            if (this.f17474k) {
                m100531v();
                m100537p();
                m100559E();
            }
        }
    }

    /* renamed from: I */
    public final void m100555I(WireMerchantSite wireMerchantSite) {
        m100553K(wireMerchantSite);
        this.f17465b.mo27363d(wireMerchantSite);
        if (this.f17475l) {
            this.f17468e.mo36923w2(wireMerchantSite.getId(), Trigger.PIN_TAP);
        } else {
            this.f17472i.mo40695M1(FlightBannerNode.FlightBanner.MERCHANT_SITE_INFO);
        }
    }

    /* renamed from: J */
    public final void m100554J(List<WireMerchantSite> list) {
        Object obj;
        Location value = this.f17466c.mo43616p().getValue();
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                float m73968c = C37429Yw2.f47648a.m73968c(((WireMerchantSite) next).getLocation().fromLocation(), value);
                do {
                    Object next2 = it.next();
                    float m73968c2 = C37429Yw2.f47648a.m73968c(((WireMerchantSite) next2).getLocation().fromLocation(), value);
                    if (Float.compare(m73968c, m73968c2) > 0) {
                        next = next2;
                        m73968c = m73968c2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        WireMerchantSite wireMerchantSite = (WireMerchantSite) obj;
        if (wireMerchantSite != null) {
            this.f17464a.mo55905y(new M95(null, null, null, C37429Yw2.f47648a.m73968c(wireMerchantSite.getLocation().fromLocation(), value), wireMerchantSite.getMerchant().getId(), list.size(), null, 71, null));
        }
    }

    /* renamed from: K */
    public final void m100553K(WireMerchantSite wireMerchantSite) {
        InterfaceC1880Ea interfaceC1880Ea = this.f17464a;
        String id = wireMerchantSite.getMerchant().getId();
        String id2 = wireMerchantSite.getId();
        String name = wireMerchantSite.getName();
        if (name == null) {
            name = wireMerchantSite.getMerchant().getName();
        }
        interfaceC1880Ea.mo55905y(new CK2(null, null, null, id, name, id2, null, Long.valueOf(C37429Yw2.f47648a.m73968c(wireMerchantSite.getLocation().fromLocation(), this.f17466c.mo43616p().getValue())), null, null, 839, null));
    }

    /* renamed from: o */
    public final double m100538o() {
        Double nearbyQueryRadius = this.f17471h.m82623f8().m73665a().getBirdPayConfig().getNearbyQueryRadius();
        return nearbyQueryRadius != null ? nearbyQueryRadius.doubleValue() : this.f17470g.nearbyRadius();
    }

    /* renamed from: p */
    public final void m100537p() {
        List listOf;
        Observable<C40889fM2> markerClicks = this.f17470g.reactiveMapEvent().markerClicks();
        final C4061a c4061a = C4061a.f17476g;
        Observable<C40889fM2> filter = markerClicks.filter(new InterfaceC23494q() { // from class: IO
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m100533t;
                m100533t = C4060JO.m100533t(Function1.this, obj);
                return m100533t;
            }
        });
        final C4062b c4062b = C4062b.f17477g;
        Observable<R> map = filter.map(new InterfaceC23492o() { // from class: wO
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireMerchantSite m100532u;
                m100532u = C4060JO.m100532u(Function1.this, obj);
                return m100532u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "mapUi.reactiveMapEvent()…enderItem).merchantSite }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(this.f17469f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4063c c4063c = new C4063c(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: xO
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4060JO.m100536q(Function1.this, obj);
            }
        });
        Observable<C40889fM2> markerClicks2 = this.f17470g.reactiveMapEvent().markerClicks();
        final C4064d c4064d = C4064d.f17478g;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Observable[]{this.f17470g.reactiveMapEvent().mapClicks(), markerClicks2.filter(new InterfaceC23494q() { // from class: yO
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m100535r;
                m100535r = C4060JO.m100535r(Function1.this, obj);
                return m100535r;
            }
        }), this.f17470g.reactiveMapEvent().polygonClicks(), this.f17470g.reactiveMapEvent().groundOverlayClicks(), this.f17470g.birdItemClicks()});
        Observable merge = Observable.merge(listOf);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(listOf(\n      mapU…i.birdItemClicks())\n    )");
        Object m33094as2 = merge.m33094as(AutoDispose.m45239a(this.f17469f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: zO
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4060JO.m100534s(C4060JO.this, obj);
            }
        });
    }

    /* renamed from: v */
    public final void m100531v() {
        Z84<List<WireMerchantSite>> mo27361f = this.f17465b.mo27361f();
        final C4065e c4065e = C4065e.f17479g;
        Observable<R> map = mo27361f.map(new InterfaceC23492o() { // from class: BO
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m100530w;
                m100530w = C4060JO.m100530w(Function1.this, obj);
                return m100530w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "birdPayManager.nearbyMer…ites.filter { it.open } }");
        Observable observeOn = C24527f.m31950a(map, this.f17466c.mo43616p()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "birdPayManager.nearbyMer…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f17469f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4066f c4066f = new C4066f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: CO
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4060JO.m100529x(Function1.this, obj);
            }
        });
        Double maxAutoselectMerchantDistance = this.f17471h.m82623f8().m73665a().getRiderMapConfig().getMaxAutoselectMerchantDistance();
        if (maxAutoselectMerchantDistance != null) {
            double doubleValue = maxAutoselectMerchantDistance.doubleValue();
            Object m33135e = C37279Yf5.m74531s0(InterfaceC40001dr4.C19874a.requestLocationOnce$default(this.f17466c, false, 1, null), this.f17465b.mo27361f()).m33135e(AutoDispose.m45239a(this.f17469f));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C4067g c4067g = new C4067g(doubleValue);
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: DO
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C4060JO.m100528y(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: z */
    public final void m100527z() {
        Observable map;
        if (Intrinsics.areEqual(this.f17471h.m82623f8().m73665a().getBirdPayConfig().getNearbyQueryUsesMapCenter(), Boolean.TRUE)) {
            Observable<LatLng> distinctUntilChanged = this.f17470g.centerLocationChanged().distinctUntilChanged();
            final C4068h c4068h = C4068h.f17483g;
            map = distinctUntilChanged.map(new InterfaceC23492o() { // from class: EO
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    LatLng m100563A;
                    m100563A = C4060JO.m100563A(Function1.this, obj);
                    return m100563A;
                }
            });
        } else {
            Observable<Location> mo43626f = this.f17466c.mo43626f(false);
            final C4069i c4069i = C4069i.f17484g;
            map = mo43626f.map(new InterfaceC23492o() { // from class: FO
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    LatLng m100562B;
                    m100562B = C4060JO.m100562B(Function1.this, obj);
                    return m100562B;
                }
            });
        }
        Observable observeOn = map.observeOn(C23454a.m33087a());
        final C4070j c4070j = new C4070j();
        Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: GO
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m100561C;
                m100561C = C4060JO.m100561C(Function1.this, obj);
                return m100561C;
            }
        }).observeOn(C24542a.m31932c());
        final C4071k c4071k = new C4071k();
        AbstractC23461c switchMapCompletable = observeOn2.switchMapCompletable(new InterfaceC23492o() { // from class: HO
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m100560D;
                m100560D = C4060JO.m100560D(Function1.this, obj);
                return m100560D;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "private fun observeNearb…r)\n      .subscribe()\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(this.f17469f));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/LatLng;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JO$k */
    /* loaded from: classes2.dex */
    public static final class C4071k extends Lambda implements Function1<Pair<? extends LatLng, ? extends Double>, InterfaceC23496h> {
        public C4071k() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<LatLng, Double> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            LatLng component1 = pair.component1();
            return C4060JO.this.f17465b.mo27360g(component1.f71430b, component1.f71431c, pair.component2().doubleValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends LatLng, ? extends Double> pair) {
            return invoke2((Pair<LatLng, Double>) pair);
        }
    }
}
