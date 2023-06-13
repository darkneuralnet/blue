package p000;

import co.bird.api.request.BeaconConfigurationConfirmationRequestBody;
import co.bird.api.request.BeaconConfigurationRequestRequestBody;
import co.bird.api.response.BeaconConfigurationRequestResponseBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0004B\u0019\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0012"}, m28432d2 = {"LdG;", "LZF;", "Lio/reactivex/F;", "", C17296a.f69688o, "macAddress", "birdCode", "Lio/reactivex/c;", "b", "LYF;", "LYF;", "beaconConfigurationClient", "Laj6;", "Laj6;", "vtBeaconManager", "<init>", "(LYF;Laj6;)V", "c", "beacon-configuration_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dG */
/* loaded from: classes4.dex */
public final class C19707dG implements InterfaceC10163ZF {

    /* renamed from: c */
    public static final C19708a f76331c = new C19708a(null);

    /* renamed from: a */
    public final InterfaceC9749YF f76332a;

    /* renamed from: b */
    public final InterfaceC38127aj6 f76333b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LdG$a;", "", "", "DEFAULT_PIN", "Ljava/lang/String;", "<init>", "()V", "beacon-configuration_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: dG$a */
    /* loaded from: classes4.dex */
    public static final class C19708a {
        public /* synthetic */ C19708a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C19708a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/BeaconConfigurationRequestResponseBody;", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/BeaconConfigurationRequestResponseBody;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dG$b */
    /* loaded from: classes4.dex */
    public static final class C19709b extends Lambda implements Function1<BeaconConfigurationRequestResponseBody, Pair<? extends String, ? extends BeaconConfigurationRequestResponseBody>> {

        /* renamed from: g */
        public final /* synthetic */ String f76334g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19709b(String str) {
            super(1);
            this.f76334g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<String, BeaconConfigurationRequestResponseBody> invoke(BeaconConfigurationRequestResponseBody it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Pair<>(this.f76334g, it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/api/response/BeaconConfigurationRequestResponseBody;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dG$c */
    /* loaded from: classes4.dex */
    public static final class C19710c extends Lambda implements Function1<Pair<? extends String, ? extends BeaconConfigurationRequestResponseBody>, InterfaceC23447K<? extends String>> {
        public C19710c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends String> invoke(Pair<String, BeaconConfigurationRequestResponseBody> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String component1 = pair.component1();
            BeaconConfigurationRequestResponseBody component2 = pair.component2();
            InterfaceC38127aj6 interfaceC38127aj6 = C19707dG.this.f76333b;
            String oldPin = component2.getOldPin();
            if (oldPin == null) {
                oldPin = "000000";
            }
            return interfaceC38127aj6.mo55475b(component1, oldPin, component2.getProximityUUID(), component2.getMajorNumber(), component2.getMinorNumber(), component2.getNewPin()).m33042m(AbstractC23442F.m33158H(component2.getConfigurationRequestId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "configurationRequestId", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dG$d */
    /* loaded from: classes4.dex */
    public static final class C19711d extends Lambda implements Function1<String, InterfaceC23496h> {
        public C19711d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(String configurationRequestId) {
            Intrinsics.checkNotNullParameter(configurationRequestId, "configurationRequestId");
            return C38096ag5.m70883l(C19707dG.this.f76332a.m75297b(new BeaconConfigurationConfirmationRequestBody(configurationRequestId))).m33159G();
        }
    }

    public C19707dG(InterfaceC9749YF beaconConfigurationClient, InterfaceC38127aj6 vtBeaconManager) {
        Intrinsics.checkNotNullParameter(beaconConfigurationClient, "beaconConfigurationClient");
        Intrinsics.checkNotNullParameter(vtBeaconManager, "vtBeaconManager");
        this.f76332a = beaconConfigurationClient;
        this.f76333b = vtBeaconManager;
    }

    /* renamed from: f */
    public static final Pair m44472f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final InterfaceC23447K m44471g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final InterfaceC23496h m44470h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC10163ZF
    /* renamed from: a */
    public AbstractC23442F<String> mo44477a() {
        return this.f76333b.mo55476a();
    }

    @Override // p000.InterfaceC10163ZF
    /* renamed from: b */
    public AbstractC23461c mo44476b(String macAddress, String birdCode) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        AbstractC23442F m70883l = C38096ag5.m70883l(this.f76332a.m75298a(new BeaconConfigurationRequestRequestBody(macAddress, birdCode)));
        final C19709b c19709b = new C19709b(macAddress);
        AbstractC23442F m33157I = m70883l.m33157I(new InterfaceC23492o() { // from class: aG
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m44472f;
                m44472f = C19707dG.m44472f(Function1.this, obj);
                return m44472f;
            }
        });
        final C19710c c19710c = new C19710c();
        AbstractC23442F m33165A = m33157I.m33165A(new InterfaceC23492o() { // from class: bG
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m44471g;
                m44471g = C19707dG.m44471g(Function1.this, obj);
                return m44471g;
            }
        });
        final C19711d c19711d = new C19711d();
        AbstractC23461c m33164B = m33165A.m33164B(new InterfaceC23492o() { // from class: cG
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m44470h;
                m44470h = C19707dG.m44470h(Function1.this, obj);
                return m44470h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun configureBe…noreElement()\n      }\n  }");
        return m33164B;
    }
}
