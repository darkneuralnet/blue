package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.WireMerchantSiteProminence;
import co.bird.api.response.MerchantSiteResponse;
import com.adyen.checkout.components.model.payments.response.QrCodeAction;
import com.facebook.share.internal.C17296a;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.InterfaceC23227iO;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(¢\u0006\u0004\b8\u00109J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016J5\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00100\u000f2\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\"\u0010#\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0002H\u0016J\u001a\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0002H\u0002R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R \u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010-R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0/0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R'\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0,018VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R'\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0/018VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b2\u00105¨\u0006:"}, m28432d2 = {"LlO;", "LiO;", "", "latitude", "longitude", "radius", "Lio/reactivex/c;", "g", "Lco/bird/android/model/wire/WireMerchantSite;", "merchantSite", "", DateTokenConverter.CONVERTER_KEY, "b", "", "merchantSiteId", "Lio/reactivex/F;", "LHM4;", "i", "id", C17296a.f69688o, "", "amount", "tip", "LuL3;", "h", "(Ljava/lang/String;ILjava/lang/Integer;)Lio/reactivex/F;", QrCodeAction.ACTION_TYPE, "LbT2;", "k", "Landroid/location/Location;", "location", "j", "LiO$a;", "type", "threshold", "c", "n", "LeT2;", "LeT2;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lcom/google/android/libraries/places/api/net/PlacesClient;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient", "La94;", "", "La94;", "merchantSiteSubject", "Lco/bird/android/buava/Optional;", "mutableCurrentMerchantSite", "LZ84;", "e", "Lkotlin/Lazy;", "f", "()LZ84;", "nearbyMerchants", "currentMerchantSite", "<init>", "(LeT2;Lcom/google/android/libraries/places/api/net/PlacesClient;)V", "birdpay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPayManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayManagerImpl.kt\nco/bird/android/manager/birdpay/BirdPayManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1855#2,2:128\n1855#2,2:131\n1#3:130\n*S KotlinDebug\n*F\n+ 1 BirdPayManagerImpl.kt\nco/bird/android/manager/birdpay/BirdPayManagerImpl\n*L\n96#1:128,2\n115#1:131,2\n*E\n"})
/* renamed from: lO */
/* loaded from: classes4.dex */
public final class C25684lO implements InterfaceC23227iO {

    /* renamed from: a */
    public final InterfaceC40359eT2 f95968a;

    /* renamed from: b */
    public final PlacesClient f95969b;

    /* renamed from: c */
    public final C37791a94<List<WireMerchantSite>> f95970c;

    /* renamed from: d */
    public final C37791a94<Optional<WireMerchantSite>> f95971d;

    /* renamed from: e */
    public final Lazy f95972e;

    /* renamed from: f */
    public final Lazy f95973f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lO$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C25685a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterfaceC23227iO.EnumC23228a.values().length];
            try {
                iArr[InterfaceC23227iO.EnumC23228a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC23227iO.EnumC23228a.PIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lO$b */
    /* loaded from: classes4.dex */
    public static final class C25686b extends Lambda implements Function0<Z84<Optional<WireMerchantSite>>> {
        public C25686b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<WireMerchantSite>> invoke() {
            return Z84.f47888d.m73663b(C25684lO.this.f95971d);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "site", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lO$c */
    /* loaded from: classes4.dex */
    public static final class C25687c extends Lambda implements Function1<WireMerchantSite, Unit> {
        public C25687c() {
            super(1);
        }

        /* renamed from: a */
        public final void m27350a(WireMerchantSite wireMerchantSite) {
            List plus;
            C37791a94 c37791a94 = C25684lO.this.f95970c;
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends WireMerchantSite>) ((Collection<? extends Object>) C25684lO.this.f95970c.getValue()), wireMerchantSite);
            c37791a94.accept(plus);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireMerchantSite wireMerchantSite) {
            m27350a(wireMerchantSite);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lO$d */
    /* loaded from: classes4.dex */
    public static final class C25688d extends Lambda implements Function0<Z84<List<? extends WireMerchantSite>>> {
        public C25688d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireMerchantSite>> invoke2() {
            return Z84.f47888d.m73663b(C25684lO.this.f95970c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/MerchantSiteResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lO$e */
    /* loaded from: classes4.dex */
    public static final class C25689e extends Lambda implements Function1<HM4<MerchantSiteResponse>, Unit> {
        public C25689e() {
            super(1);
        }

        /* renamed from: a */
        public final void m27349a(HM4<MerchantSiteResponse> hm4) {
            MerchantSiteResponse m103944a = hm4.m103944a();
            if (m103944a != null) {
                C25684lO.this.f95970c.accept(m103944a.getMerchantSites());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<MerchantSiteResponse> hm4) {
            m27349a(hm4);
            return Unit.INSTANCE;
        }
    }

    public C25684lO(InterfaceC40359eT2 client, PlacesClient placesClient) {
        List emptyList;
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(placesClient, "placesClient");
        this.f95968a = client;
        this.f95969b = placesClient;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f95970c = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        this.f95971d = C37791a94.C10586a.create$default(c10586a, Optional.f63040c.m59034a(), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C25688d());
        this.f95972e = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C25686b());
        this.f95973f = lazy2;
    }

    /* renamed from: o */
    public static final void m27352o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m27351p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC23227iO
    /* renamed from: a */
    public AbstractC23442F<WireMerchantSite> mo27366a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        AbstractC23442F<WireMerchantSite> m42859i = this.f95968a.m42859i(id);
        final C25687c c25687c = new C25687c();
        AbstractC23442F<WireMerchantSite> m33101w = m42859i.m33101w(new InterfaceC23484g() { // from class: kO
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25684lO.m27352o(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun getMerchant…bject.value + site)\n    }");
        return m33101w;
    }

    @Override // p000.InterfaceC23227iO
    /* renamed from: b */
    public void mo27365b() {
        this.f95971d.m71836j();
    }

    @Override // p000.InterfaceC23227iO
    /* renamed from: c */
    public WireMerchantSite mo27364c(Location location, InterfaceC23227iO.EnumC23228a type, double d) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(type, "type");
        int i = C25685a.$EnumSwitchMapping$0[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return m27353n(location, d);
    }

    @Override // p000.InterfaceC23227iO
    /* renamed from: d */
    public void mo27363d(WireMerchantSite merchantSite) {
        Intrinsics.checkNotNullParameter(merchantSite, "merchantSite");
        this.f95971d.accept(Optional.f63040c.m59032c(merchantSite));
    }

    @Override // p000.InterfaceC23227iO
    /* renamed from: e */
    public Z84<Optional<WireMerchantSite>> mo27362e() {
        return (Z84) this.f95973f.getValue();
    }

    @Override // p000.InterfaceC23227iO
    /* renamed from: f */
    public Z84<List<WireMerchantSite>> mo27361f() {
        return (Z84) this.f95972e.getValue();
    }

    @Override // p000.InterfaceC23227iO
    /* renamed from: g */
    public AbstractC23461c mo27360g(double d, double d2, double d3) {
        AbstractC23442F<HM4<MerchantSiteResponse>> m33152N = this.f95968a.m42858j(d, d2, d3).m33152N(C24542a.m31932c());
        final C25689e c25689e = new C25689e();
        AbstractC23461c m33159G = m33152N.m33101w(new InterfaceC23484g() { // from class: jO
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C25684lO.m27351p(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun refresh(lat…     .ignoreElement()\n  }");
        return m33159G;
    }

    @Override // p000.InterfaceC23227iO
    /* renamed from: h */
    public AbstractC23442F<HM4<C49775uL3>> mo27359h(String merchantSiteId, int i, Integer num) {
        AbstractC23442F<HM4<C49775uL3>> m42861g;
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        if (num != null && num.intValue() != 0) {
            m42861g = this.f95968a.m42860h(new C40288eL3(merchantSiteId, i + num.intValue(), num));
        } else {
            m42861g = this.f95968a.m42861g(new C39696dL3(merchantSiteId, i));
        }
        AbstractC23442F<HM4<C49775uL3>> m33152N = m42861g.m33152N(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33152N, "when {\n    tip == null |…bserveOn(Schedulers.io())");
        return m33152N;
    }

    @Override // p000.InterfaceC23227iO
    /* renamed from: i */
    public AbstractC23442F<HM4<WireMerchantSite>> mo27358i(String merchantSiteId) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        AbstractC23442F<HM4<WireMerchantSite>> m33152N = this.f95968a.m42864d(merchantSiteId).m33152N(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33152N, "client.merchantSiteById(…bserveOn(Schedulers.io())");
        return m33152N;
    }

    @Override // p000.InterfaceC23227iO
    /* renamed from: j */
    public WireMerchantSite mo27357j(Location location, double d) {
        Object next;
        Intrinsics.checkNotNullParameter(location, "location");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (WireMerchantSite wireMerchantSite : this.f95970c.getValue()) {
            float m73967d = C37429Yw2.f47648a.m73967d(location, wireMerchantSite.getLocation());
            if (m73967d <= d) {
                linkedHashMap.put(wireMerchantSite, Float.valueOf(m73967d));
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (Float.compare(floatValue, floatValue2) > 0) {
                        next = next2;
                        floatValue = floatValue2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (WireMerchantSite) entry.getKey();
    }

    @Override // p000.InterfaceC23227iO
    /* renamed from: k */
    public AbstractC23442F<HM4<C38563bT2>> mo27356k(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        AbstractC23442F<HM4<C38563bT2>> m33152N = this.f95968a.m42866b(new C37970aT2(qrCode)).m33152N(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33152N, "client.scan(MerchantScan…bserveOn(Schedulers.io())");
        return m33152N;
    }

    /* renamed from: n */
    public final WireMerchantSite m27353n(Location location, double d) {
        Object next;
        double d2;
        Double banner;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (WireMerchantSite wireMerchantSite : this.f95970c.getValue()) {
            float m73967d = C37429Yw2.f47648a.m73967d(location, wireMerchantSite.getLocation());
            WireMerchantSiteProminence prominence = wireMerchantSite.getProminence();
            if (prominence != null && (banner = prominence.getBanner()) != null) {
                d2 = banner.doubleValue();
            } else {
                d2 = 0.0d;
            }
            if (m73967d > 1.0d) {
                d2 /= m73967d * m73967d;
            }
            if (d2 >= d) {
                linkedHashMap.put(wireMerchantSite, Double.valueOf(d2));
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                double doubleValue = ((Number) ((Map.Entry) next).getValue()).doubleValue();
                do {
                    Object next2 = it.next();
                    double doubleValue2 = ((Number) ((Map.Entry) next2).getValue()).doubleValue();
                    if (Double.compare(doubleValue, doubleValue2) < 0) {
                        next = next2;
                        doubleValue = doubleValue2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (WireMerchantSite) entry.getKey();
    }
}
