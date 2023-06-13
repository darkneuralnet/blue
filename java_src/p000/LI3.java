package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.PartnerUser;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C37791a94;
import p000.GI3;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010RI\u0010\u001a\u001a0\u0012,\u0012*\u0012\b\u0012\u00060\u0002j\u0002`\u0014\u0012\u0004\u0012\u00020\b \u0015*\u0014\u0012\b\u0012\u00060\u0002j\u0002`\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u00130\u00130\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R5\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u0015*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u001b0\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R*\u0010#\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0014\u0012\u0004\u0012\u00020\b0\u00130 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006("}, m28432d2 = {"LLI3;", "LGI3;", "", "partnerId", "Lio/reactivex/p;", "Ltg1;", "r", "Lio/reactivex/F;", "Lco/bird/android/model/MobilePartner;", "u", "LFI3;", "b", "LFI3;", "partnerClient", "LTo2;", "c", "LTo2;", "assetManager", "LZ84;", "", "Lco/bird/android/model/PartnerId;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "A", "()LZ84;", "partners", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/PartnerUser;", "e", "o1", "primaryPartner", "La94;", "f", "La94;", "mutablePartners", "g", "mutablePrimaryPartner", "<init>", "(LFI3;LTo2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: LI3 */
/* loaded from: classes2.dex */
public final class LI3 implements GI3 {

    /* renamed from: b */
    public final FI3 f21073b;

    /* renamed from: c */
    public final InterfaceC36187To2 f21074c;

    /* renamed from: d */
    public final Lazy f21075d;

    /* renamed from: e */
    public final Lazy f21076e;

    /* renamed from: f */
    public final C37791a94<Map<String, MobilePartner>> f21077f;

    /* renamed from: g */
    public final C37791a94<Optional<PartnerUser>> f21078g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltg1;", "errorResponse", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ltg1;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LI3$a */
    /* loaded from: classes2.dex */
    public static final class C4796a extends Lambda implements Function1<C49375tg1, InterfaceC23496h> {

        /* renamed from: g */
        public static final C4796a f21079g = new C4796a();

        public C4796a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C49375tg1 errorResponse) {
            Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
            return AbstractC23461c.m33080F(new C34044Kk1(errorResponse));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00030\u00032\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "Lco/bird/android/model/PartnerId;", "Lco/bird/android/model/MobilePartner;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Map;)Lco/bird/android/model/MobilePartner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LI3$b */
    /* loaded from: classes2.dex */
    public static final class C4797b extends Lambda implements Function1<Map<String, ? extends MobilePartner>, MobilePartner> {

        /* renamed from: g */
        public final /* synthetic */ String f21080g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4797b(String str) {
            super(1);
            this.f21080g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final MobilePartner invoke(Map<String, MobilePartner> it) {
            Object value;
            Intrinsics.checkNotNullParameter(it, "it");
            value = MapsKt__MapsKt.getValue(it, this.f21080g);
            return (MobilePartner) value;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "Lco/bird/android/model/PartnerId;", "Lco/bird/android/model/MobilePartner;", "oldPartners", "newPartners", C17296a.f69688o, "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LI3$c */
    /* loaded from: classes2.dex */
    public static final class C4798c extends Lambda implements Function2<Map<String, ? extends MobilePartner>, Map<String, ? extends MobilePartner>, Map<String, ? extends MobilePartner>> {

        /* renamed from: g */
        public static final C4798c f21081g = new C4798c();

        public C4798c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Map<String, MobilePartner> invoke(Map<String, MobilePartner> oldPartners, Map<String, MobilePartner> newPartners) {
            Map<String, MobilePartner> plus;
            Intrinsics.checkNotNullParameter(oldPartners, "oldPartners");
            Intrinsics.checkNotNullParameter(newPartners, "newPartners");
            plus = MapsKt__MapsKt.plus(oldPartners, newPartners);
            return plus;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a0\u0012,\u0012*\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0014\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LZ84;", "", "", "Lco/bird/android/model/PartnerId;", "Lco/bird/android/model/MobilePartner;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LI3$d */
    /* loaded from: classes2.dex */
    public static final class C4799d extends Lambda implements Function0<Z84<Map<String, ? extends MobilePartner>>> {
        public C4799d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Map<String, ? extends MobilePartner>> invoke2() {
            return Z84.f47888d.m73663b(LI3.this.f21077f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/PartnerUser;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LI3$e */
    /* loaded from: classes2.dex */
    public static final class C4800e extends Lambda implements Function0<Z84<Optional<PartnerUser>>> {
        public C4800e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<PartnerUser>> invoke() {
            return Z84.f47888d.m73663b(LI3.this.f21078g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/MobilePartner;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LI3$f */
    /* loaded from: classes2.dex */
    public static final class C4801f extends Lambda implements Function1<HM4<MobilePartner>, Unit> {
        public C4801f() {
            super(1);
        }

        /* renamed from: a */
        public final void m97356a(HM4<MobilePartner> hm4) {
            Map mapOf;
            MobilePartner m103944a = hm4.m103944a();
            if (m103944a != null) {
                C37791a94 c37791a94 = LI3.this.f21077f;
                mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(m103944a.getPartnerId(), m103944a));
                c37791a94.accept(mapOf);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<MobilePartner> hm4) {
            m97356a(hm4);
            return Unit.INSTANCE;
        }
    }

    public LI3(FI3 partnerClient, InterfaceC36187To2 assetManager) {
        Lazy lazy;
        Lazy lazy2;
        Map emptyMap;
        Intrinsics.checkNotNullParameter(partnerClient, "partnerClient");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.f21073b = partnerClient;
        this.f21074c = assetManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C4799d());
        this.f21075d = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C4800e());
        this.f21076e = lazy2;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f21077f = c10586a.m71835a(emptyMap, C4798c.f21081g);
        this.f21078g = C37791a94.C10586a.create$default(c10586a, Optional.f63040c.m59034a(), null, 2, null);
    }

    /* renamed from: g */
    public static final MobilePartner m97367g(LI3 this$0, String partnerId) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(partnerId, "$partnerId");
        return this$0.mo97372A().getValue().get(partnerId);
    }

    /* renamed from: h */
    public static final InterfaceC23496h m97366h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final MobilePartner m97365i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (MobilePartner) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m97361v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.GI3
    /* renamed from: A */
    public Z84<Map<String, MobilePartner>> mo97372A() {
        return (Z84) this.f21075d.getValue();
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return GI3.C2702a.m105521b(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return GI3.C2702a.m105520c(this);
    }

    @Override // p000.GI3
    /* renamed from: o1 */
    public Z84<Optional<PartnerUser>> mo97364o1() {
        return (Z84) this.f21076e.getValue();
    }

    /* renamed from: r */
    public AbstractC24507p<C49375tg1> m97363r(String partnerId) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        AbstractC23442F<HM4<MobilePartner>> m107347a = this.f21073b.m107347a(partnerId);
        final C4801f c4801f = new C4801f();
        AbstractC23442F<HM4<MobilePartner>> m33101w = m107347a.m33101w(new InterfaceC23484g() { // from class: KI3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LI3.m97361v(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun refreshPart…pMaybeErrorResponse()\n  }");
        AbstractC23442F m97360w = m97360w(m33101w);
        Intrinsics.checkNotNullExpressionValue(m97360w, "override fun refreshPart…pMaybeErrorResponse()\n  }");
        return NM4.m94019b(m97360w);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return GI3.C2702a.m105519d(this);
    }

    @Override // p000.GI3
    /* renamed from: u */
    public AbstractC23442F<MobilePartner> mo97362u(final String partnerId) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        AbstractC24507p m32071D = AbstractC24507p.m32071D(new Callable() { // from class: HI3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MobilePartner m97367g;
                m97367g = LI3.m97367g(LI3.this, partnerId);
                return m97367g;
            }
        });
        AbstractC24507p<C49375tg1> m97363r = m97363r(partnerId);
        final C4796a c4796a = C4796a.f21079g;
        AbstractC23461c m32074A = m97363r.m32074A(new InterfaceC23492o() { // from class: II3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m97366h;
                m97366h = LI3.m97366h(Function1.this, obj);
                return m97366h;
            }
        });
        AbstractC23442F<Map<String, MobilePartner>> firstOrError = mo97372A().firstOrError();
        final C4797b c4797b = new C4797b(partnerId);
        AbstractC23442F<MobilePartner> m32053W = m32071D.m32053W(m32074A.m33042m(firstOrError.m33157I(new InterfaceC23492o() { // from class: JI3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                MobilePartner m97365i;
                m97365i = LI3.m97365i(Function1.this, obj);
                return m97365i;
            }
        })));
        Intrinsics.checkNotNullExpressionValue(m32053W, "partnerId: String): Sing…l not in the map.\n      )");
        return m32053W;
    }

    /* renamed from: w */
    public <T> AbstractC23442F<T> m97360w(AbstractC23442F<T> abstractC23442F) {
        return GI3.C2702a.m105518e(this, abstractC23442F);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return GI3.C2702a.m105522a(this);
    }
}
