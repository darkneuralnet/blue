package p000;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.offer.WireCouponDeal;
import co.bird.android.model.offer.WireCouponOffer;
import co.bird.android.model.wire.WireLegacyAsset;
import co.bird.android.model.wire.WireMerchantAction;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.WireMerchantSiteKt;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.C23464b;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24535i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C41318g46;
import p000.InterfaceC40099e13;
import p000.JU3;
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\b\b\u0001\u00103\u001a\u00020\b¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0019H\u0016J\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\bH\u0016R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00102R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R(\u0010D\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010\u00020\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010G\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010CR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010A\u001a\u0004\bI\u0010CR&\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010A\u001a\u0004\bK\u0010CR \u0010P\u001a\b\u0012\u0004\u0012\u00020M0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010CR \u0010S\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010CR \u0010V\u001a\b\u0012\u0004\u0012\u00020M0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\bU\u0010CR \u0010Y\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010A\u001a\u0004\bX\u0010CR \u0010\\\u001a\b\u0012\u0004\u0012\u00020M0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010A\u001a\u0004\b[\u0010CR \u0010_\u001a\b\u0012\u0004\u0012\u00020M0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010A\u001a\u0004\b^\u0010CR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010A\u001a\u0004\ba\u0010CR \u0010d\u001a\b\u0012\u0004\u0012\u00020M0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010A\u001a\u0004\bc\u0010CR \u0010g\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010A\u001a\u0004\bf\u0010CR\"\u0010k\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010\u00100\u00100h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR \u0010n\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010A\u001a\u0004\bm\u0010CR\"\u0010p\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010\u00100\u00100h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010jR \u0010s\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010A\u001a\u0004\br\u0010CR&\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0\u00040\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\b\u001f\u0010CR\"\u0010v\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010\u00160\u00160h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010jR&\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010A\u001a\u0004\bx\u0010CR&\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160z0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010A\u001a\u0004\b|\u0010CR'\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160z0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b~\u0010A\u001a\u0004\b\u007f\u0010CR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0087\u0001"}, m28432d2 = {"LJU3;", "LoU3;", "Lco/bird/android/model/wire/WireMerchantSite;", "site", "", "LXT3;", "H", "I", "", "photoId", "B", "K", "L", "hours", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "id", "", "G0", "siteId", "z0", "F0", "B0", "Lco/bird/android/model/wire/WireMerchantAction;", "action", "M0", "Lio/reactivex/Observable;", "b", "uriString", "title", "y0", "LEa;", C17296a.f69688o, "LEa;", "analyticsManager", "LiO;", "LiO;", "manager", "Lue3;", "c", "Lue3;", "offerManager", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "Le13;", "e", "Le13;", "navigator", "f", "Ljava/lang/String;", "placesKey", "Lio/reactivex/disposables/b;", "g", "Lio/reactivex/disposables/b;", "disposables", "h", "LAG;", "i", "LAG;", "siteIdRelay", "j", "merchantSiteRelay", "kotlin.jvm.PlatformType", "k", "Lio/reactivex/Observable;", "A0", "()Lio/reactivex/Observable;", "merchantSite", "l", "E0", "toolbarTitle", "m", "getTitle", "n", "O0", "images", "", "o", "H0", "descriptionVisible", "p", "getDescription", "description", "q", "D0", "addressVisible", "r", "getAddress", PaymentMethod.BillingDetails.PARAM_ADDRESS, "s", "getBirdPayEnabled", "birdPayEnabled", "t", "I0", "hoursVisible", "u", "getHours", "v", "L0", "phoneVisible", "w", "x0", PaymentMethod.BillingDetails.PARAM_PHONE, "Lma4;", "x", "Lma4;", "addressClicks", "y", "getShowDirections", "showDirections", "z", "phoneClicks", "A", "K0", "attemptCall", "Lne3;", "offers", "actionButtonClicks", "D", "N0", "listActionButtons", "Lco/bird/android/buava/Optional;", "E", "C0", "footerPrimaryActionButton", "F", "J0", "footerSecondaryActionButton", "Lg46$b;", "J", "()Lg46$b;", "logger", "<init>", "(LEa;LiO;Lue3;LTq4;Le13;Ljava/lang/String;)V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlaceInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1549#2:399\n1620#2,3:400\n1549#2:403\n1620#2,3:404\n1#3:407\n*S KotlinDebug\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl\n*L\n223#1:399\n223#1:400,3\n228#1:403\n228#1:404,3\n*E\n"})
/* renamed from: JU3 */
/* loaded from: classes3.dex */
public final class JU3 implements InterfaceC46299oU3 {

    /* renamed from: A */
    public final Observable<String> f17639A;

    /* renamed from: B */
    public final Observable<List<C45800ne3>> f17640B;

    /* renamed from: C */
    public final C45168ma4<WireMerchantAction> f17641C;

    /* renamed from: D */
    public final Observable<List<WireMerchantAction>> f17642D;

    /* renamed from: E */
    public final Observable<Optional<WireMerchantAction>> f17643E;

    /* renamed from: F */
    public final Observable<Optional<WireMerchantAction>> f17644F;

    /* renamed from: a */
    public final InterfaceC1880Ea f17645a;

    /* renamed from: b */
    public final InterfaceC23227iO f17646b;

    /* renamed from: c */
    public final InterfaceC49950ue3 f17647c;

    /* renamed from: d */
    public final C36207Tq4 f17648d;

    /* renamed from: e */
    public final InterfaceC40099e13 f17649e;

    /* renamed from: f */
    public final String f17650f;

    /* renamed from: g */
    public final C23464b f17651g;

    /* renamed from: h */
    public String f17652h;

    /* renamed from: i */
    public final C0058AG<String> f17653i;

    /* renamed from: j */
    public final C0058AG<WireMerchantSite> f17654j;

    /* renamed from: k */
    public final Observable<WireMerchantSite> f17655k;

    /* renamed from: l */
    public final Observable<String> f17656l;

    /* renamed from: m */
    public final Observable<String> f17657m;

    /* renamed from: n */
    public final Observable<List<XT3>> f17658n;

    /* renamed from: o */
    public final Observable<Boolean> f17659o;

    /* renamed from: p */
    public final Observable<String> f17660p;

    /* renamed from: q */
    public final Observable<Boolean> f17661q;

    /* renamed from: r */
    public final Observable<String> f17662r;

    /* renamed from: s */
    public final Observable<Boolean> f17663s;

    /* renamed from: t */
    public final Observable<Boolean> f17664t;

    /* renamed from: u */
    public final Observable<String> f17665u;

    /* renamed from: v */
    public final Observable<Boolean> f17666v;

    /* renamed from: w */
    public final Observable<String> f17667w;

    /* renamed from: x */
    public final C45168ma4<Unit> f17668x;

    /* renamed from: y */
    public final Observable<String> f17669y;

    /* renamed from: z */
    public final C45168ma4<Unit> f17670z;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JU3$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C4103a extends FunctionReferenceImpl implements Function1<WireMerchantSite, String> {
        public C4103a(Object obj) {
            super(1, obj, JU3.class, "getReadableAddress", "getReadableAddress(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(WireMerchantSite p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((JU3) this.receiver).m100376L(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$b */
    /* loaded from: classes3.dex */
    public static final class C4104b extends Lambda implements Function1<WireMerchantSite, Boolean> {

        /* renamed from: g */
        public static final C4104b f17671g = new C4104b();

        public C4104b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WireMerchantSite it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getAddress() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$c */
    /* loaded from: classes3.dex */
    public static final class C4105c extends Lambda implements Function1<Unit, InterfaceC23447K<? extends String>> {
        public C4105c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends String> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return JU3.this.mo20993x0().firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "phoneNumber", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JU3$d */
    /* loaded from: classes3.dex */
    public static final class C4106d extends Lambda implements Function1<String, String> {

        /* renamed from: g */
        public static final C4106d f17673g = new C4106d();

        public C4106d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String phoneNumber) {
            String replace$default;
            String replace$default2;
            String replace$default3;
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            replace$default = StringsKt__StringsJVMKt.replace$default(phoneNumber, " ", "", false, 4, (Object) null);
            replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "(", "", false, 4, (Object) null);
            replace$default3 = StringsKt__StringsJVMKt.replace$default(replace$default2, ")", "", false, 4, (Object) null);
            return replace$default3;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$e */
    /* loaded from: classes3.dex */
    public static final class C4107e extends Lambda implements Function1<WireMerchantSite, Boolean> {

        /* renamed from: g */
        public static final C4107e f17674g = new C4107e();

        public C4107e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WireMerchantSite it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.getBirdPayEnabled(), Boolean.TRUE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$f */
    /* loaded from: classes3.dex */
    public static final class C4108f extends Lambda implements Function1<WireMerchantSite, String> {

        /* renamed from: g */
        public static final C4108f f17675g = new C4108f();

        public C4108f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(WireMerchantSite it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String description = it.getDescription();
            if (description == null) {
                String description2 = it.getMerchant().getDescription();
                if (description2 == null) {
                    return "";
                }
                return description2;
            }
            return description;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$g */
    /* loaded from: classes3.dex */
    public static final class C4109g extends Lambda implements Function1<WireMerchantSite, Boolean> {

        /* renamed from: g */
        public static final C4109g f17676g = new C4109g();

        public C4109g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WireMerchantSite it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            String description = it.getDescription();
            if (description == null) {
                description = it.getMerchant().getDescription();
            }
            if (description != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "site", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantAction;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPlaceInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$footerPrimaryActionButton$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n766#2:399\n857#2,2:400\n1045#2:402\n1#3:403\n*S KotlinDebug\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$footerPrimaryActionButton$1\n*L\n360#1:399\n360#1:400,2\n361#1:402\n*E\n"})
    /* renamed from: JU3$h */
    /* loaded from: classes3.dex */
    public static final class C4110h extends Lambda implements Function1<WireMerchantSite, Optional<WireMerchantAction>> {

        /* renamed from: g */
        public static final C4110h f17677g = new C4110h();

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$footerPrimaryActionButton$1\n*L\n1#1,328:1\n361#2:329\n*E\n"})
        /* renamed from: JU3$h$a */
        /* loaded from: classes3.dex */
        public static final class C4111a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((WireMerchantAction) t).getPriority()), Integer.valueOf(((WireMerchantAction) t2).getPriority()));
                return compareValues;
            }
        }

        public C4110h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WireMerchantAction> invoke(WireMerchantSite site) {
            List sortedWith;
            Object firstOrNull;
            Optional<WireMerchantAction> m59032c;
            Intrinsics.checkNotNullParameter(site, "site");
            List<WireMerchantAction> actions = site.getActions();
            if (actions == null) {
                actions = CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : actions) {
                if (WireMerchantSiteKt.isFooter((WireMerchantAction) obj)) {
                    arrayList.add(obj);
                }
            }
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new C4111a());
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) sortedWith);
            WireMerchantAction wireMerchantAction = (WireMerchantAction) firstOrNull;
            if (wireMerchantAction == null || (m59032c = Optional.f63040c.m59032c(wireMerchantAction)) == null) {
                return Optional.f63040c.m59034a();
            }
            return m59032c;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "site", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantAction;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPlaceInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$footerSecondaryActionButton$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n766#2:399\n857#2,2:400\n1045#2:402\n1#3:403\n*S KotlinDebug\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$footerSecondaryActionButton$1\n*L\n367#1:399\n367#1:400,2\n368#1:402\n*E\n"})
    /* renamed from: JU3$i */
    /* loaded from: classes3.dex */
    public static final class C4112i extends Lambda implements Function1<WireMerchantSite, Optional<WireMerchantAction>> {

        /* renamed from: g */
        public static final C4112i f17678g = new C4112i();

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$footerSecondaryActionButton$1\n*L\n1#1,328:1\n368#2:329\n*E\n"})
        /* renamed from: JU3$i$a */
        /* loaded from: classes3.dex */
        public static final class C4113a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((WireMerchantAction) t).getPriority()), Integer.valueOf(((WireMerchantAction) t2).getPriority()));
                return compareValues;
            }
        }

        public C4112i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WireMerchantAction> invoke(WireMerchantSite site) {
            List sortedWith;
            Object orNull;
            Optional<WireMerchantAction> m59032c;
            Intrinsics.checkNotNullParameter(site, "site");
            List<WireMerchantAction> actions = site.getActions();
            if (actions == null) {
                actions = CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : actions) {
                if (WireMerchantSiteKt.isFooter((WireMerchantAction) obj)) {
                    arrayList.add(obj);
                }
            }
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new C4113a());
            orNull = CollectionsKt___CollectionsKt.getOrNull(sortedWith, 1);
            WireMerchantAction wireMerchantAction = (WireMerchantAction) orNull;
            if (wireMerchantAction == null || (m59032c = Optional.f63040c.m59032c(wireMerchantAction)) == null) {
                return Optional.f63040c.m59034a();
            }
            return m59032c;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$j */
    /* loaded from: classes3.dex */
    public static final class C4114j extends Lambda implements Function1<WireMerchantSite, String> {
        public C4114j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(WireMerchantSite it) {
            Intrinsics.checkNotNullParameter(it, "it");
            JU3 ju3 = JU3.this;
            List<String> hoursText = it.getHoursText();
            if (hoursText == null) {
                hoursText = CollectionsKt__CollectionsKt.emptyList();
            }
            return ju3.m100385C(hoursText);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$k */
    /* loaded from: classes3.dex */
    public static final class C4115k extends Lambda implements Function1<WireMerchantSite, Boolean> {

        /* renamed from: g */
        public static final C4115k f17680g = new C4115k();

        public C4115k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WireMerchantSite it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            List<String> hoursText = it.getHoursText();
            if (hoursText != null && !hoursText.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(!z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "site", "", "LXT3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$l */
    /* loaded from: classes3.dex */
    public static final class C4116l extends Lambda implements Function1<WireMerchantSite, List<? extends XT3>> {
        public C4116l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<XT3> invoke(WireMerchantSite site) {
            List plus;
            List<XT3> plus2;
            Intrinsics.checkNotNullParameter(site, "site");
            plus = CollectionsKt___CollectionsKt.plus((Collection) JU3.this.m100380H(site), (Iterable) JU3.this.m100379I(site));
            plus2 = CollectionsKt___CollectionsKt.plus((Collection) plus, (Iterable) JU3.this.m100377K(site));
            return plus2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "site", "", "Lco/bird/android/model/wire/WireMerchantAction;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPlaceInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$listActionButtons$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,398:1\n766#2:399\n857#2,2:400\n1045#2:402\n*S KotlinDebug\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$listActionButtons$1\n*L\n354#1:399\n354#1:400,2\n355#1:402\n*E\n"})
    /* renamed from: JU3$m */
    /* loaded from: classes3.dex */
    public static final class C4117m extends Lambda implements Function1<WireMerchantSite, List<? extends WireMerchantAction>> {

        /* renamed from: g */
        public static final C4117m f17682g = new C4117m();

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$listActionButtons$1\n*L\n1#1,328:1\n355#2:329\n*E\n"})
        /* renamed from: JU3$m$a */
        /* loaded from: classes3.dex */
        public static final class C4118a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((WireMerchantAction) t).getPriority()), Integer.valueOf(((WireMerchantAction) t2).getPriority()));
                return compareValues;
            }
        }

        public C4117m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireMerchantAction> invoke(WireMerchantSite site) {
            List<WireMerchantAction> sortedWith;
            Intrinsics.checkNotNullParameter(site, "site");
            List<WireMerchantAction> actions = site.getActions();
            if (actions == null) {
                actions = CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : actions) {
                if (WireMerchantSiteKt.isList((WireMerchantAction) obj)) {
                    arrayList.add(obj);
                }
            }
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new C4118a());
            return sortedWith;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "siteId", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$n */
    /* loaded from: classes3.dex */
    public static final class C4119n extends Lambda implements Function1<String, InterfaceC23447K<? extends WireMerchantSite>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: JU3$n$a */
        /* loaded from: classes3.dex */
        public static final class C4120a extends Lambda implements Function1<WireMerchantSite, Unit> {

            /* renamed from: g */
            public final /* synthetic */ JU3 f17684g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4120a(JU3 ju3) {
                super(1);
                this.f17684g = ju3;
            }

            /* renamed from: a */
            public final void m100328a(WireMerchantSite wireMerchantSite) {
                this.f17684g.f17654j.accept(wireMerchantSite);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireMerchantSite wireMerchantSite) {
                m100328a(wireMerchantSite);
                return Unit.INSTANCE;
            }
        }

        public C4119n() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WireMerchantSite> invoke(String siteId) {
            Intrinsics.checkNotNullParameter(siteId, "siteId");
            AbstractC23442F<WireMerchantSite> m33146T = JU3.this.f17646b.mo27366a(siteId).m33146T(3L);
            final C4120a c4120a = new C4120a(JU3.this);
            return m33146T.m33101w(new InterfaceC23484g() { // from class: KU3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    JU3.C4119n.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u00032H\u0010\u0006\u001aD\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/offer/WireCouponOffer;", "Lco/bird/android/model/offer/WireCouponDeal;", "<name for destructuring parameter 0>", "Lne3;", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPlaceInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$offers$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,398:1\n766#2:399\n857#2,2:400\n1549#2:402\n1620#2,3:403\n766#2:406\n857#2,2:407\n1549#2:409\n1620#2,3:410\n1045#2:413\n*S KotlinDebug\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$offers$1\n*L\n300#1:399\n300#1:400,2\n302#1:402\n302#1:403,3\n304#1:406\n304#1:407,2\n305#1:409\n305#1:410,3\n307#1:413\n*E\n"})
    /* renamed from: JU3$o */
    /* loaded from: classes3.dex */
    public static final class C4121o extends Lambda implements Function1<Triple<? extends String, ? extends List<? extends WireCouponOffer>, ? extends List<? extends WireCouponDeal>>, List<? extends C45800ne3>> {

        /* renamed from: g */
        public static final C4121o f17685g = new C4121o();

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$offers$1\n*L\n1#1,328:1\n307#2:329\n*E\n"})
        /* renamed from: JU3$o$a */
        /* loaded from: classes3.dex */
        public static final class C4122a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(((C45800ne3) t).m23369c(), ((C45800ne3) t2).m23369c());
                return compareValues;
            }
        }

        public C4121o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C45800ne3> invoke(Triple<String, ? extends List<WireCouponOffer>, ? extends List<WireCouponDeal>> triple) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List plus;
            List<C45800ne3> sortedWith;
            boolean z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            String component1 = triple.component1();
            List<WireCouponOffer> allOffers = triple.component2();
            List<WireCouponDeal> allDeals = triple.component3();
            Intrinsics.checkNotNullExpressionValue(allOffers, "allOffers");
            ArrayList<WireCouponOffer> arrayList = new ArrayList();
            for (Object obj : allOffers) {
                WireCouponOffer wireCouponOffer = (WireCouponOffer) obj;
                if (wireCouponOffer.getExplicitAccept() && wireCouponOffer.getAction().getDestinationIds().contains(component1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (WireCouponOffer wireCouponOffer2 : arrayList) {
                arrayList2.add(C49357te3.m11982b(wireCouponOffer2));
            }
            Intrinsics.checkNotNullExpressionValue(allDeals, "allDeals");
            ArrayList<WireCouponDeal> arrayList3 = new ArrayList();
            for (Object obj2 : allDeals) {
                if (((WireCouponDeal) obj2).getAction().getDestinationIds().contains(component1)) {
                    arrayList3.add(obj2);
                }
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
            for (WireCouponDeal wireCouponDeal : arrayList3) {
                arrayList4.add(C49357te3.m11983a(wireCouponDeal));
            }
            plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(plus, new C4122a());
            return sortedWith;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JU3$p */
    /* loaded from: classes3.dex */
    public static final class C4123p extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f17687h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4123p(String str) {
            super(1);
            this.f17687h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C41318g46.AbstractC20723b m100378J = JU3.this.m100378J();
            String str = this.f17687h;
            m100378J.mo7220p(throwable, "Failed to accept offer: " + str, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JU3$q */
    /* loaded from: classes3.dex */
    public static final class C4124q extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f17689h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4124q(String str) {
            super(0);
            this.f17689h = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C41318g46.AbstractC20723b m100378J = JU3.this.m100378J();
            String str = this.f17689h;
            m100378J.mo7221o("Successfully accepted offer: " + str, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$r */
    /* loaded from: classes3.dex */
    public static final class C4125r extends Lambda implements Function1<WireMerchantSite, String> {

        /* renamed from: g */
        public static final C4125r f17690g = new C4125r();

        public C4125r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(WireMerchantSite it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String phone = it.getPhone();
            if (phone == null) {
                return "";
            }
            return phone;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$s */
    /* loaded from: classes3.dex */
    public static final class C4126s extends Lambda implements Function1<WireMerchantSite, Boolean> {

        /* renamed from: g */
        public static final C4126s f17691g = new C4126s();

        public C4126s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WireMerchantSite it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getPhone() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$t */
    /* loaded from: classes3.dex */
    public static final class C4127t extends Lambda implements Function1<Unit, InterfaceC23447K<? extends String>> {
        public C4127t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends String> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return JU3.this.getAddress().firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$u */
    /* loaded from: classes3.dex */
    public static final class C4128u extends Lambda implements Function1<WireMerchantSite, String> {

        /* renamed from: g */
        public static final C4128u f17693g = new C4128u();

        public C4128u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(WireMerchantSite it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getMerchant().getName();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JU3$v */
    /* loaded from: classes3.dex */
    public static final class C4129v extends Lambda implements Function1<Config, String> {

        /* renamed from: g */
        public static final C4129v f17694g = new C4129v();

        public C4129v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            String detailsScreenHeader = config.getBirdPayConfig().getDetailsScreenHeader();
            if (detailsScreenHeader == null) {
                return "";
            }
            return detailsScreenHeader;
        }
    }

    public JU3(InterfaceC1880Ea analyticsManager, InterfaceC23227iO manager, InterfaceC49950ue3 offerManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, String placesKey) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(offerManager, "offerManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(placesKey, "placesKey");
        this.f17645a = analyticsManager;
        this.f17646b = manager;
        this.f17647c = offerManager;
        this.f17648d = reactiveConfig;
        this.f17649e = navigator;
        this.f17650f = placesKey;
        this.f17651g = new C23464b();
        C0058AG<String> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create()");
        this.f17653i = m115951g;
        C0058AG<WireMerchantSite> m115951g2 = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g2, "create()");
        this.f17654j = m115951g2;
        final C4119n c4119n = new C4119n();
        Observable switchMapSingleDelayError = m115951g.switchMapSingleDelayError(new InterfaceC23492o() { // from class: pU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m100371Q;
                m100371Q = JU3.m100371Q(Function1.this, obj);
                return m100371Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapSingleDelayError, "siteIdRelay.switchMapSin…iteRelay.accept(it) }\n  }");
        this.f17655k = switchMapSingleDelayError;
        Z84<Config> m82623f8 = reactiveConfig.m82623f8();
        final C4129v c4129v = C4129v.f17694g;
        Observable map = m82623f8.map(new InterfaceC23492o() { // from class: rU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m100365W;
                m100365W = JU3.m100365W(Function1.this, obj);
                return m100365W;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "reactiveConfig.config.ma…ilsScreenHeader ?: \"\"\n  }");
        this.f17656l = map;
        Observable<WireMerchantSite> mo21010A0 = mo21010A0();
        final C4128u c4128u = C4128u.f17693g;
        Observable map2 = mo21010A0.map(new InterfaceC23492o() { // from class: sU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m100366V;
                m100366V = JU3.m100366V(Function1.this, obj);
                return m100366V;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "merchantSite.map { it.merchant.name }");
        this.f17657m = map2;
        Observable<WireMerchantSite> mo21010A02 = mo21010A0();
        final C4116l c4116l = new C4116l();
        Observable map3 = mo21010A02.map(new InterfaceC23492o() { // from class: tU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m100373O;
                m100373O = JU3.m100373O(Function1.this, obj);
                return m100373O;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "merchantSite.map { site …getMerchantLogo(site)\n  }");
        this.f17658n = map3;
        Observable<WireMerchantSite> mo21010A03 = mo21010A0();
        final C4109g c4109g = C4109g.f17676g;
        Observable map4 = mo21010A03.map(new InterfaceC23492o() { // from class: uU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m100383E;
                m100383E = JU3.m100383E(Function1.this, obj);
                return m100383E;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "merchantSite.map { it.de…ant.description != null }");
        this.f17659o = map4;
        Observable<WireMerchantSite> mo21010A04 = mo21010A0();
        final C4108f c4108f = C4108f.f17675g;
        Observable map5 = mo21010A04.map(new InterfaceC23492o() { // from class: vU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m100384D;
                m100384D = JU3.m100384D(Function1.this, obj);
                return m100384D;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "merchantSite.map { it.de…chant.description ?: \"\" }");
        this.f17660p = map5;
        Observable<WireMerchantSite> mo21010A05 = mo21010A0();
        final C4104b c4104b = C4104b.f17671g;
        Observable map6 = mo21010A05.map(new InterfaceC23492o() { // from class: wU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m100343x;
                m100343x = JU3.m100343x(Function1.this, obj);
                return m100343x;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "merchantSite.map { it.address != null }");
        this.f17661q = map6;
        Observable<WireMerchantSite> mo21010A06 = mo21010A0();
        final C4103a c4103a = new C4103a(this);
        Observable map7 = mo21010A06.map(new InterfaceC23492o() { // from class: xU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m100344w;
                m100344w = JU3.m100344w(Function1.this, obj);
                return m100344w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map7, "merchantSite.map(::getReadableAddress)");
        this.f17662r = map7;
        Observable<WireMerchantSite> mo21010A07 = mo21010A0();
        final C4107e c4107e = C4107e.f17674g;
        Observable map8 = mo21010A07.map(new InterfaceC23492o() { // from class: yU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m100387A;
                m100387A = JU3.m100387A(Function1.this, obj);
                return m100387A;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map8, "merchantSite.map { it.birdPayEnabled == true }");
        this.f17663s = map8;
        Observable<WireMerchantSite> mo21010A08 = mo21010A0();
        final C4115k c4115k = C4115k.f17680g;
        Observable map9 = mo21010A08.map(new InterfaceC23492o() { // from class: zU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m100374N;
                m100374N = JU3.m100374N(Function1.this, obj);
                return m100374N;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map9, "merchantSite.map { !it.hoursText.isNullOrEmpty() }");
        this.f17664t = map9;
        Observable<WireMerchantSite> mo21010A09 = mo21010A0();
        final C4114j c4114j = new C4114j();
        Observable map10 = mo21010A09.map(new InterfaceC23492o() { // from class: AU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m100375M;
                m100375M = JU3.m100375M(Function1.this, obj);
                return m100375M;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map10, "merchantSite.map {\n    c…sText ?: emptyList())\n  }");
        this.f17665u = map10;
        Observable<WireMerchantSite> mo21010A010 = mo21010A0();
        final C4126s c4126s = C4126s.f17691g;
        Observable map11 = mo21010A010.map(new InterfaceC23492o() { // from class: BU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m100368T;
                m100368T = JU3.m100368T(Function1.this, obj);
                return m100368T;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map11, "merchantSite.map { it.phone != null }");
        this.f17666v = map11;
        Observable<WireMerchantSite> mo21010A011 = mo21010A0();
        final C4125r c4125r = C4125r.f17690g;
        Observable map12 = mo21010A011.map(new InterfaceC23492o() { // from class: CU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m100369S;
                m100369S = JU3.m100369S(Function1.this, obj);
                return m100369S;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map12, "merchantSite.map { it.phone ?: \"\" }");
        this.f17667w = map12;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f17668x = m25409g;
        final C4127t c4127t = new C4127t();
        Observable switchMapSingle = m25409g.switchMapSingle(new InterfaceC23492o() { // from class: DU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m100367U;
                m100367U = JU3.m100367U(Function1.this, obj);
                return m100367U;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapSingle, "addressClicks.switchMapS… address.firstOrError() }");
        this.f17669y = switchMapSingle;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f17670z = m25409g2;
        final C4105c c4105c = new C4105c();
        Observable<R> switchMapSingle2 = m25409g2.switchMapSingle(new InterfaceC23492o() { // from class: EU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m100342y;
                m100342y = JU3.m100342y(Function1.this, obj);
                return m100342y;
            }
        });
        final C4106d c4106d = C4106d.f17673g;
        Observable<String> map13 = switchMapSingle2.map(new InterfaceC23492o() { // from class: FU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m100341z;
                m100341z = JU3.m100341z(Function1.this, obj);
                return m100341z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map13, "phoneClicks.switchMapSin….replace(\")\", \"\")\n      }");
        this.f17639A = map13;
        C24523e c24523e = C24523e.f91168a;
        Observable<String> distinctUntilChanged = m115951g.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "siteIdRelay.distinctUntilChanged()");
        Observable<List<WireCouponOffer>> distinctUntilChanged2 = offerManager.mo3141a().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "offerManager.offers.distinctUntilChanged()");
        Observable<List<WireCouponDeal>> distinctUntilChanged3 = offerManager.mo3138d().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged3, "offerManager.deals.distinctUntilChanged()");
        Observable m31955b = c24523e.m31955b(distinctUntilChanged, distinctUntilChanged2, distinctUntilChanged3);
        final C4121o c4121o = C4121o.f17685g;
        Observable<List<C45800ne3>> map14 = m31955b.map(new InterfaceC23492o() { // from class: GU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m100370R;
                m100370R = JU3.m100370R(Function1.this, obj);
                return m100370R;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map14, "Observables.combineLates…s).sortedBy { it.id }\n  }");
        this.f17640B = map14;
        C45168ma4<WireMerchantAction> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<WireMerchantAction>()");
        this.f17641C = m25409g3;
        Observable<WireMerchantSite> mo21010A012 = mo21010A0();
        final C4117m c4117m = C4117m.f17682g;
        Observable map15 = mo21010A012.map(new InterfaceC23492o() { // from class: HU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m100372P;
                m100372P = JU3.m100372P(Function1.this, obj);
                return m100372P;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map15, "merchantSite.map { site …tedBy { it.priority }\n  }");
        this.f17642D = map15;
        Observable<WireMerchantSite> mo21010A013 = mo21010A0();
        final C4110h c4110h = C4110h.f17677g;
        Observable map16 = mo21010A013.map(new InterfaceC23492o() { // from class: IU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m100382F;
                m100382F = JU3.m100382F(Function1.this, obj);
                return m100382F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map16, "merchantSite.map { site … ?: Optional.absent()\n  }");
        this.f17643E = map16;
        Observable<WireMerchantSite> mo21010A014 = mo21010A0();
        final C4112i c4112i = C4112i.f17678g;
        Observable map17 = mo21010A014.map(new InterfaceC23492o() { // from class: qU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m100381G;
                m100381G = JU3.m100381G(Function1.this, obj);
                return m100381G;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map17, "merchantSite.map { site … ?: Optional.absent()\n  }");
        this.f17644F = map17;
    }

    /* renamed from: A */
    public static final Boolean m100387A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final String m100384D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final Boolean m100383E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final Optional m100382F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final Optional m100381G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final String m100375M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final Boolean m100374N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final List m100373O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final List m100372P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23447K m100371Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final List m100370R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final String m100369S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final Boolean m100368T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23447K m100367U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final String m100366V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final String m100365W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final String m100344w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final Boolean m100343x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23447K m100342y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final String m100341z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: A0 */
    public Observable<WireMerchantSite> mo21010A0() {
        return this.f17655k;
    }

    /* renamed from: B */
    public final String m100386B(String str) {
        String str2 = this.f17650f;
        return "https://maps.googleapis.com/maps/api/place/photo?key=" + str2 + "&photoreference=" + str + "&maxheight=640";
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: B0 */
    public void mo21009B0() {
        this.f17670z.accept(Unit.INSTANCE);
    }

    /* renamed from: C */
    public final String m100385C(List<String> list) {
        int size = list.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            String str2 = list.get(i);
            str = str + ((Object) str2);
            if (i < list.size() - 1) {
                str = str + "\n";
            }
        }
        return str;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: C0 */
    public Observable<Optional<WireMerchantAction>> mo21008C0() {
        return this.f17643E;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: D0 */
    public Observable<Boolean> mo21007D0() {
        return this.f17661q;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: E0 */
    public Observable<String> mo21006E0() {
        return this.f17656l;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: F0 */
    public void mo21005F0() {
        this.f17668x.accept(Unit.INSTANCE);
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: G0 */
    public void mo21004G0(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        C41318g46.AbstractC20723b m100378J = m100378J();
        m100378J.mo7221o("Offer accepted click: " + id, new Object[0]);
        AbstractC23461c m33070P = this.f17647c.mo3140b(id).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "offerManager.acceptOffer…dSchedulers.mainThread())");
        C37279Yf5.m74523y(C24535i.m31937d(m33070P, new C4123p(id), new C4124q(id)), this.f17651g);
    }

    /* renamed from: H */
    public final List<XT3> m100380H(WireMerchantSite wireMerchantSite) {
        List<XT3> emptyList;
        List<WireLegacyAsset> assets;
        int collectionSizeOrDefault;
        WireMerchantSite.Photos photos = wireMerchantSite.getPhotos();
        if (photos != null && (assets = photos.getAssets()) != null) {
            List<WireLegacyAsset> list = assets;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireLegacyAsset wireLegacyAsset : list) {
                arrayList.add(new XT3(wireLegacyAsset.getMedia().getMediaUrl(), null));
            }
            return arrayList;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: H0 */
    public Observable<Boolean> mo21003H0() {
        return this.f17659o;
    }

    /* renamed from: I */
    public final List<XT3> m100379I(WireMerchantSite wireMerchantSite) {
        List<XT3> emptyList;
        List<String> places;
        int collectionSizeOrDefault;
        String str;
        Map<String, String> attributions;
        WireMerchantSite.Photos photos = wireMerchantSite.getPhotos();
        if (photos != null && (places = photos.getPlaces()) != null) {
            List<String> list = places;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (String str2 : list) {
                String m100386B = m100386B(str2);
                WireMerchantSite.Photos photos2 = wireMerchantSite.getPhotos();
                if (photos2 != null && (attributions = photos2.getAttributions()) != null) {
                    str = attributions.get(str2);
                } else {
                    str = null;
                }
                arrayList.add(new XT3(m100386B, str));
            }
            return arrayList;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: I0 */
    public Observable<Boolean> mo21002I0() {
        return this.f17664t;
    }

    /* renamed from: J */
    public final C41318g46.AbstractC20723b m100378J() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("place-info-vm");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"place-info-vm\")");
        return m40153k;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: J0 */
    public Observable<Optional<WireMerchantAction>> mo21001J0() {
        return this.f17644F;
    }

    /* renamed from: K */
    public final List<XT3> m100377K(WireMerchantSite wireMerchantSite) {
        List<XT3> listOfNotNull;
        String photoUrl = WireMerchantSiteKt.photoUrl(wireMerchantSite);
        if (photoUrl == null) {
            photoUrl = "";
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(new XT3(photoUrl, null));
        return listOfNotNull;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: K0 */
    public Observable<String> mo21000K0() {
        return this.f17639A;
    }

    /* renamed from: L */
    public final String m100376L(WireMerchantSite wireMerchantSite) {
        String address = wireMerchantSite.getAddress();
        String city = wireMerchantSite.getCity();
        String state = wireMerchantSite.getState();
        String zip = wireMerchantSite.getZip();
        return address + "\n" + city + ", " + state + " " + zip;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: L0 */
    public Observable<Boolean> mo20999L0() {
        return this.f17666v;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: M0 */
    public void mo20998M0(WireMerchantAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f17641C.accept(action);
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: N0 */
    public Observable<List<WireMerchantAction>> mo20997N0() {
        return this.f17642D;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: O0 */
    public Observable<List<XT3>> mo20996O0() {
        return this.f17658n;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: a */
    public Observable<List<C45800ne3>> mo20995a() {
        return this.f17640B;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: b */
    public Observable<WireMerchantAction> mo20994b() {
        Observable<WireMerchantAction> hide = this.f17641C.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "actionButtonClicks.hide()");
        return hide;
    }

    @Override // p000.InterfaceC46299oU3
    public Observable<String> getAddress() {
        return this.f17662r;
    }

    @Override // p000.InterfaceC46299oU3
    public Observable<String> getDescription() {
        return this.f17660p;
    }

    @Override // p000.InterfaceC46299oU3
    public Observable<String> getHours() {
        return this.f17665u;
    }

    @Override // p000.InterfaceC46299oU3
    public Observable<String> getTitle() {
        return this.f17657m;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: x0 */
    public Observable<String> mo20993x0() {
        return this.f17667w;
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: y0 */
    public void mo20992y0(String str, String title) {
        String authority;
        String str2;
        String queryParameter;
        String queryParameter2;
        Intrinsics.checkNotNullParameter(title, "title");
        if (str == null) {
            return;
        }
        Uri parse = Uri.parse(str);
        if (Intrinsics.areEqual(parse.getScheme(), "action") && (authority = parse.getAuthority()) != null) {
            switch (authority.hashCode()) {
                case -1719822106:
                    if (authority.equals("scan_to_pay")) {
                        this.f17649e.mo37177E2();
                        return;
                    }
                    return;
                case -1083954944:
                    if (authority.equals("tap_to_pay") && (str2 = this.f17652h) != null) {
                        InterfaceC40099e13.C19924a.goToMerchantPay$default(this.f17649e, str2, null, false, 6, null);
                        return;
                    }
                    return;
                case -718398288:
                    if (authority.equals("web_view") && (queryParameter = parse.getQueryParameter("url")) != null) {
                        InterfaceC40099e13.C19924a.goToWebView$default(this.f17649e, queryParameter, title, null, false, 12, null);
                        return;
                    }
                    return;
                case 1098761075:
                    if (authority.equals("zendesk_article") && (queryParameter2 = parse.getQueryParameter("article_id")) != null) {
                        try {
                            this.f17649e.mo36922w3(Long.parseLong(queryParameter2));
                            return;
                        } catch (Exception e) {
                            C41318g46.AbstractC20723b m100378J = m100378J();
                            m100378J.mo7220p(e, "Failed to view Zendesk article id " + queryParameter2, new Object[0]);
                            return;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // p000.InterfaceC46299oU3
    /* renamed from: z0 */
    public void mo20991z0(String siteId) {
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        this.f17652h = siteId;
        this.f17653i.accept(siteId);
    }
}
