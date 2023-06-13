package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.UserRoleItemKt;
import co.bird.android.model.constant.HabitatType;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC47153pv0;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"Lyv0;", "Lpv0;", "", "partnerId", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/configs/Config;", "l0", "Lio/reactivex/c;", "E", "habitatId", "Lio/reactivex/F;", "D", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LOh;", "b", "LOh;", "buildConfig", "LTg6;", "c", "LTg6;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "preference", "LTq4;", "e", "LTq4;", "reactiveConfig", "LGI3;", "f", "LGI3;", "partnerManager", "Ldr4;", "reactiveLocationManager", "<init>", "(LOh;LTg6;Lgl;LTq4;LGI3;Ldr4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigManagerImpl.kt\nco/bird/android/app/manager/ConfigManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n237#2:146\n1#3:147\n1#3:158\n135#4,9:148\n215#4:157\n216#4:159\n144#4:160\n1549#5:161\n1620#5,3:162\n*S KotlinDebug\n*F\n+ 1 ConfigManagerImpl.kt\nco/bird/android/app/manager/ConfigManagerImpl\n*L\n46#1:146\n93#1:158\n93#1:148,9\n93#1:157\n93#1:159\n93#1:160\n95#1:161\n95#1:162,3\n*E\n"})
/* renamed from: yv0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52488yv0 implements InterfaceC47153pv0 {

    /* renamed from: b */
    public final InterfaceC6097Oh f120400b;

    /* renamed from: c */
    public final InterfaceC36119Tg6 f120401c;

    /* renamed from: d */
    public final C22454gl f120402d;

    /* renamed from: e */
    public final C36207Tq4 f120403e;

    /* renamed from: f */
    public final GI3 f120404f;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\u0010\b\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00030\u0003 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u00052\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "", "Lco/bird/android/model/PartnerId;", "Lco/bird/android/model/MobilePartner;", "partners", "", "kotlin.jvm.PlatformType", "", C17296a.f69688o, "(Ljava/util/Map;)Ljava/lang/Iterable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yv0$a */
    /* loaded from: classes2.dex */
    public static final class C30772a extends Lambda implements Function1<Map<String, ? extends MobilePartner>, Iterable<? extends MobilePartner>> {

        /* renamed from: g */
        public static final C30772a f120405g = new C30772a();

        public C30772a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Iterable<MobilePartner> invoke(Map<String, MobilePartner> partners) {
            Intrinsics.checkNotNullParameter(partners, "partners");
            return partners.values();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/MobilePartner;", "partner", "", C17296a.f69688o, "(Lco/bird/android/model/MobilePartner;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yv0$b */
    /* loaded from: classes2.dex */
    public static final class C30773b extends Lambda implements Function1<MobilePartner, String> {

        /* renamed from: g */
        public static final C30773b f120406g = new C30773b();

        public C30773b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(MobilePartner partner) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            return partner.getHabitatId();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "habitatId", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yv0$c */
    /* loaded from: classes2.dex */
    public static final class C30774c extends Lambda implements Function1<String, InterfaceC23496h> {
        public C30774c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(String habitatId) {
            Intrinsics.checkNotNullParameter(habitatId, "habitatId");
            return C52488yv0.this.m2289D(habitatId).m33159G().m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "previous", "current", "", C17296a.f69688o, "(Landroid/location/Location;Landroid/location/Location;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yv0$d */
    /* loaded from: classes2.dex */
    public static final class C30775d extends Lambda implements Function2<Location, Location, Boolean> {

        /* renamed from: g */
        public static final C30775d f120408g = new C30775d();

        public C30775d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Location previous, Location current) {
            boolean z;
            Intrinsics.checkNotNullParameter(previous, "previous");
            Intrinsics.checkNotNullParameter(current, "current");
            if (previous.distanceTo(current) < 100.0f) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yv0$e */
    /* loaded from: classes2.dex */
    public static final class C30776e extends Lambda implements Function1<Location, InterfaceC23496h> {
        public C30776e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Location it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52488yv0.this.mo2288E().m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Landroid/location/Location;", "it", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yv0$f */
    /* loaded from: classes2.dex */
    public static final class C30777f extends Lambda implements Function1<Pair<? extends Long, ? extends Location>, InterfaceC23496h> {
        public C30777f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Long, ? extends Location> pair) {
            return invoke2((Pair<Long, ? extends Location>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<Long, ? extends Location> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52488yv0.this.mo2288E().m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "kotlin.jvm.PlatformType", "config", "", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigManagerImpl.kt\nco/bird/android/app/manager/ConfigManagerImpl$fetchConfig$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n515#2:146\n500#2,6:147\n125#3:153\n152#3,3:154\n1855#4,2:157\n*S KotlinDebug\n*F\n+ 1 ConfigManagerImpl.kt\nco/bird/android/app/manager/ConfigManagerImpl$fetchConfig$1\n*L\n120#1:146\n120#1:147,6\n121#1:153\n121#1:154,3\n122#1:157,2\n*E\n"})
    /* renamed from: yv0$g */
    /* loaded from: classes2.dex */
    public static final class C30778g extends Lambda implements Function1<Config, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f120412h;

        /* renamed from: i */
        public final /* synthetic */ String f120413i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30778g(String str, String str2) {
            super(1);
            this.f120412h = str;
            this.f120413i = str2;
        }

        /* renamed from: a */
        public final void m2264a(Config config) {
            String str = this.f120413i;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, MobilePartner> entry : C52488yv0.this.f120404f.mo97372A().m73665a().entrySet()) {
                if (Intrinsics.areEqual(entry.getValue().getHabitatId(), str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList<String> arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList.add(((MobilePartner) entry2.getValue()).getPartnerId());
            }
            C52488yv0 c52488yv0 = C52488yv0.this;
            for (String str2 : arrayList) {
                C36207Tq4 c36207Tq4 = c52488yv0.f120403e;
                Intrinsics.checkNotNullExpressionValue(config, "config");
                c36207Tq4.m82633e9(str2, config);
            }
            if (Intrinsics.areEqual(this.f120412h, C52488yv0.this.m2290C())) {
                C36207Tq4 c36207Tq42 = C52488yv0.this.f120403e;
                Intrinsics.checkNotNullExpressionValue(config, "config");
                c36207Tq42.m82633e9(null, config);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m2264a(config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/configs/Config;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yv0$h */
    /* loaded from: classes2.dex */
    public static final class C30779h extends Lambda implements Function1<Config, Config> {
        public C30779h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Config invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52488yv0.this.f120403e.m82623f8().getValue();
        }
    }

    public C52488yv0(InterfaceC6097Oh buildConfig, InterfaceC36119Tg6 client, C22454gl preference, C36207Tq4 reactiveConfig, GI3 partnerManager, InterfaceC40001dr4 reactiveLocationManager) {
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        this.f120400b = buildConfig;
        this.f120401c = client;
        this.f120402d = preference;
        this.f120403e = reactiveConfig;
        this.f120404f = partnerManager;
        Z84<Map<String, MobilePartner>> mo97372A = partnerManager.mo97372A();
        final C30772a c30772a = C30772a.f120405g;
        Observable<U> flatMapIterable = mo97372A.flatMapIterable(new InterfaceC23492o() { // from class: sv0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Iterable m2275r;
                m2275r = C52488yv0.m2275r(Function1.this, obj);
                return m2275r;
            }
        });
        final C30773b c30773b = C30773b.f120406g;
        Observable distinct = flatMapIterable.map(new InterfaceC23492o() { // from class: tv0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m2274v;
                m2274v = C52488yv0.m2274v(Function1.this, obj);
                return m2274v;
            }
        }).distinct();
        final C30774c c30774c = new C30774c();
        AbstractC23461c flatMapCompletable = distinct.flatMapCompletable(new InterfaceC23492o() { // from class: uv0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m2273w;
                m2273w = C52488yv0.m2273w(Function1.this, obj);
                return m2273w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "partnerManager.partners\n…onErrorComplete()\n      }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Z84<Location> mo43616p = reactiveLocationManager.mo43616p();
        final C30775d c30775d = C30775d.f120408g;
        Observable<Location> distinctUntilChanged = mo43616p.distinctUntilChanged(new InterfaceC23481d() { // from class: vv0
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m2272x;
                m2272x = C52488yv0.m2272x(Function2.this, obj, obj2);
                return m2272x;
            }
        });
        final C30776e c30776e = new C30776e();
        distinctUntilChanged.flatMapCompletable(new InterfaceC23492o() { // from class: wv0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m2271y;
                m2271y = C52488yv0.m2271y(Function1.this, obj);
                return m2271y;
            }
        }).subscribe();
        Observable<Long> interval = Observable.interval(0L, 60L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(interval, "interval(0, 60, TimeUnit.SECONDS)");
        Observable m31950a = C24527f.m31950a(interval, reactiveLocationManager.mo43616p());
        final C30777f c30777f = new C30777f();
        m31950a.flatMapCompletable(new InterfaceC23492o() { // from class: xv0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m2270z;
                m2270z = C52488yv0.m2270z(Function1.this, obj);
                return m2270z;
            }
        }).subscribe();
    }

    /* renamed from: F */
    public static final Config m2287F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Config) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m2286G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final Iterable m2275r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Iterable) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final String m2274v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23496h m2273w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final boolean m2272x(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: y */
    public static final InterfaceC23496h m2271y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23496h m2270z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final String m2290C() {
        String habitatId;
        HabitatType habitatTypeOverride = this.f120403e.m82601h8().m73665a().asConfig().getHabitatTypeOverride();
        if (habitatTypeOverride == null || (habitatId = habitatTypeOverride.getHabitatId()) == null) {
            return C7241Rh.m86446d(this.f120400b);
        }
        return habitatId;
    }

    /* renamed from: D */
    public final AbstractC23442F<Config> m2289D(String str) {
        String str2;
        if (str == null) {
            str2 = m2290C();
        } else {
            str2 = str;
        }
        AbstractC23442F<Config> m83169y = this.f120401c.m83169y(UserRoleItemKt.getRoleParam(this.f120402d.m37575s0()), str2);
        final C30778g c30778g = new C30778g(str2, str);
        AbstractC23442F<Config> m33101w = m83169y.m33101w(new InterfaceC23484g() { // from class: qv0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52488yv0.m2286G(Function1.this, obj);
            }
        });
        final C30779h c30779h = new C30779h();
        AbstractC23442F m33157I = m33101w.m33157I(new InterfaceC23492o() { // from class: rv0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Config m2287F;
                m2287F = C52488yv0.m2287F(Function1.this, obj);
                return m2287F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "private fun fetchConfig(…Config.config.value }\n  }");
        return m33157I;
    }

    @Override // p000.InterfaceC47153pv0
    /* renamed from: E */
    public AbstractC23461c mo2288E() {
        List distinct;
        int collectionSizeOrDefault;
        List plus;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, MobilePartner> entry : this.f120404f.mo97372A().m73665a().entrySet()) {
            String habitatId = entry.getValue().getHabitatId();
            if (habitatId != null) {
                arrayList.add(habitatId);
            }
        }
        distinct = CollectionsKt___CollectionsKt.distinct(arrayList);
        List<String> list = distinct;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (String str : list) {
            arrayList2.add(m2289D(str).m33159G().m33069Q());
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends AbstractC23461c>) ((Collection<? extends Object>) arrayList2), m2289D(null).m33159G().m33069Q());
        AbstractC23461c m33074L = AbstractC23461c.m33074L(plus);
        Intrinsics.checkNotNullExpressionValue(m33074L, "merge(partnerConfigs + birdConfig)");
        return m33074L;
    }

    /* renamed from: I */
    public <T> Observable<T> m2285I(Observable<T> observable) {
        return InterfaceC47153pv0.C27417a.m18430e(this, observable);
    }

    @Override // p000.InterfaceC47153pv0
    /* renamed from: l0 */
    public Observable<Config> mo2277l0(String str) {
        MobilePartner mobilePartner;
        String str2 = null;
        if (str != null) {
            mobilePartner = this.f120404f.mo97372A().getValue().get(str);
        } else {
            mobilePartner = null;
        }
        if (mobilePartner != null) {
            str2 = mobilePartner.getHabitatId();
        }
        Observable<Config> m33123k0 = m2289D(str2).m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "fetchConfig(mobilePartne…Id)\n      .toObservable()");
        Observable<Config> m2285I = m2285I(m33123k0);
        Intrinsics.checkNotNullExpressionValue(m2285I, "fetchConfig(mobilePartne…ble()\n      .schedulers()");
        return m2285I;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC47153pv0.C27417a.m18432c(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC47153pv0.C27417a.m18431d(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC47153pv0.C27417a.m18434a(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC47153pv0.C27417a.m18433b(this);
    }
}
