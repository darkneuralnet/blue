package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdFlexVehicleConnection;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.VehicleVersion;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.nio.charset.Charset;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.B44;
import p000.InterfaceC48164rd5;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u0089\u0001\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006*"}, m28432d2 = {"LB44;", "LtC3;", "", C17296a.f69688o, "Lco/bird/android/model/persistence/Bird;", "bird", "F2", "", "onBackPressed", "LEa;", "analyticsManager", "LpJ;", "bluetoothManager", "Lq54;", "privateBirdsManager", "LWX2;", "myBirdsManager", "LgH;", "birdActionsManager", "LkI;", "birdAirManager", "Lrd5;", "rxBleBirdBluetoothManager", "Ldr4;", "reactiveLocationManager", "LTq4;", "reactiveConfig", "Le13;", "navigator", "LOA3;", "converter", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LUC3;", "ui", "", "birdId", "justPaired", "Ldd3;", "notificationSender", "<init>", "(LEa;LpJ;Lq54;LWX2;LgH;LkI;Lrd5;Ldr4;LTq4;Le13;LOA3;Lcom/uber/autodispose/ScopeProvider;LUC3;Ljava/lang/String;ZLdd3;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrivateBirdFlexDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdFlexDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdFlexDetailsPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n237#2:283\n237#2:284\n1726#3,3:285\n*S KotlinDebug\n*F\n+ 1 PrivateBirdFlexDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdFlexDetailsPresenterImpl\n*L\n133#1:283\n257#1:284\n279#1:285,3\n*E\n"})
/* renamed from: B44 */
/* loaded from: classes3.dex */
public final class B44 extends C49101tC3 {

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u000f\u0010\u0012R\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LB44$a;", "", "", "dataString", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "", "b", "Lkotlin/Lazy;", "f", "()Ljava/util/List;", "payload", "c", "command", "Ljava/util/List;", "arguments", "e", "Z", "()Z", "passwordSuccess", "<init>", "(Ljava/lang/String;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B44$a */
    /* loaded from: classes3.dex */
    public static final class C0390a {

        /* renamed from: a */
        public final String f1621a;

        /* renamed from: b */
        public final Lazy f1622b;

        /* renamed from: c */
        public final String f1623c;

        /* renamed from: d */
        public final List<String> f1624d;

        /* renamed from: e */
        public final boolean f1625e;

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPrivateBirdFlexDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdFlexDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/PrivateBirdFlexDetailsPresenterImpl$CommandResponse$payload$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1#2:283\n*E\n"})
        /* renamed from: B44$a$a */
        /* loaded from: classes3.dex */
        public static final class C0391a extends Lambda implements Function0<List<? extends String>> {
            public C0391a() {
                super(0);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
                r0 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r6, new java.lang.String[]{"="}, false, 2, 2, (java.lang.Object) null);
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List<? extends String> invoke() {
                List split$default;
                List<? extends String> split$default2;
                split$default = StringsKt__StringsKt.split$default((CharSequence) C0390a.this.m114725d(), new String[]{":"}, false, 2, 2, (Object) null);
                if (!(split$default.size() == 2 && (Intrinsics.areEqual(split$default.get(0), BirdFlexVehicleConnection.MESSAGE_INSTRUCTION_RESPONSE_PREFIX) || Intrinsics.areEqual(split$default.get(0), BirdFlexVehicleConnection.CONTROL_COMMAND_RESPONSE_PREFIX)))) {
                    split$default = null;
                }
                if (split$default == null || (r6 = (String) split$default.get(1)) == null || split$default2 == null) {
                    return null;
                }
                if (split$default2.size() == 2) {
                    return split$default2;
                }
                return null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
            if (r9 != null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
            r9 = kotlin.text.StringsKt__StringNumberConversionsKt.toIntOrNull(r9.get(0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
            if (r9 == null) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C0390a(String dataString) {
            Lazy lazy;
            String str;
            List<String> emptyList;
            Integer intOrNull;
            Object orNull;
            Object orNull2;
            Intrinsics.checkNotNullParameter(dataString, "dataString");
            this.f1621a = dataString;
            lazy = LazyKt__LazyJVMKt.lazy(new C0391a());
            this.f1622b = lazy;
            List<String> m114723f = m114723f();
            boolean z = false;
            if (m114723f != null) {
                orNull2 = CollectionsKt___CollectionsKt.getOrNull(m114723f, 0);
                str = (String) orNull2;
            }
            str = "";
            this.f1623c = str;
            List<String> m114723f2 = m114723f();
            if (m114723f2 != null) {
                orNull = CollectionsKt___CollectionsKt.getOrNull(m114723f2, 1);
                String str2 = (String) orNull;
                if (str2 != null) {
                    emptyList = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null);
                }
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.f1624d = emptyList;
            if ((!emptyList.isEmpty()) && intOrNull != null && intOrNull.intValue() == 1) {
                z = true;
            }
            this.f1625e = z;
        }

        public static /* synthetic */ C0390a copy$default(C0390a c0390a, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c0390a.f1621a;
            }
            return c0390a.m114728a(str);
        }

        /* renamed from: a */
        public final C0390a m114728a(String dataString) {
            Intrinsics.checkNotNullParameter(dataString, "dataString");
            return new C0390a(dataString);
        }

        /* renamed from: b */
        public final List<String> m114727b() {
            return this.f1624d;
        }

        /* renamed from: c */
        public final String m114726c() {
            return this.f1623c;
        }

        /* renamed from: d */
        public final String m114725d() {
            return this.f1621a;
        }

        /* renamed from: e */
        public final boolean m114724e() {
            return this.f1625e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0390a) && Intrinsics.areEqual(this.f1621a, ((C0390a) obj).f1621a);
        }

        /* renamed from: f */
        public final List<String> m114723f() {
            return (List) this.f1622b.getValue();
        }

        public int hashCode() {
            return this.f1621a.hashCode();
        }

        public String toString() {
            String str = this.f1621a;
            return "CommandResponse(dataString=" + str + ")";
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B44$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0392b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C0392b f1627b = new C0392b();

        public C0392b() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B44$c */
    /* loaded from: classes3.dex */
    public static final class C0393c extends Lambda implements Function1<Bird, Boolean> {

        /* renamed from: g */
        public static final C0393c f1628g = new C0393c();

        public C0393c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Bird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Bird_Kt.isES500(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B44$d */
    /* loaded from: classes3.dex */
    public static final class C0394d extends Lambda implements Function1<Bird, InterfaceC23447K<? extends Bird>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/persistence/Bird;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B44$d$a */
        /* loaded from: classes3.dex */
        public static final class C0395a extends Lambda implements Function1<Unit, Bird> {

            /* renamed from: g */
            public final /* synthetic */ Bird f1630g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0395a(Bird bird) {
                super(1);
                this.f1630g = bird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Bird invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f1630g;
            }
        }

        public C0394d() {
            super(1);
        }

        /* renamed from: c */
        public static final Bird m114719c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Bird) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Bird> invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            Observable<Unit> delay = B44.this.m12830V0().delay(500L, TimeUnit.MILLISECONDS);
            final C0395a c0395a = new C0395a(bird);
            return delay.map(new InterfaceC23492o() { // from class: C44
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Bird m114719c;
                    m114719c = B44.C0394d.m114719c(Function1.this, obj);
                    return m114719c;
                }
            }).firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B44$e */
    /* loaded from: classes3.dex */
    public static final class C0396e extends Lambda implements Function1<Bird, InterfaceC23447K<? extends Pair<? extends Bird, ? extends String>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "kotlin.jvm.PlatformType", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: B44$e$a */
        /* loaded from: classes3.dex */
        public static final class C0397a extends Lambda implements Function1<String, Pair<? extends Bird, ? extends String>> {

            /* renamed from: g */
            public final /* synthetic */ Bird f1632g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0397a(Bird bird) {
                super(1);
                this.f1632g = bird;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<Bird, String> invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f1632g, it);
            }
        }

        public C0396e() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Bird, String>> invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            C41318g46.m40163a("calling get token for flex vehicle", new Object[0]);
            AbstractC23442F<String> mo19542p = B44.this.m12860L0().mo19542p(C0613BT.m114027f(bird));
            final C0397a c0397a = new C0397a(bird);
            return mo19542p.m33157I(new InterfaceC23492o() { // from class: D44
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = B44.C0396e.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B44$f */
    /* loaded from: classes3.dex */
    public static final class C0398f extends Lambda implements Function1<Pair<? extends Bird, ? extends String>, Unit> {
        public C0398f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends String> pair) {
            invoke2((Pair<Bird, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, String> pair) {
            CharSequence trim;
            Bird bird = pair.component1();
            String token = pair.component2();
            C41318g46.m40163a("setting token for flex vehicle " + token, new Object[0]);
            InterfaceC48164rd5 m12836T0 = B44.this.m12836T0();
            B44 b44 = B44.this;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            VehicleDescriptor m12874G2 = b44.m12874G2(bird);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            trim = StringsKt__StringsKt.trim((CharSequence) token);
            m12836T0.mo15670p(m12874G2, C45097mS5.base64DecodeToByteArray$default(trim.toString(), 0, 1, null));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B44$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0400h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C0400h f1635b = new C0400h();

        public C0400h() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B44$i */
    /* loaded from: classes3.dex */
    public static final class C0401i extends Lambda implements Function1<Bird, Boolean> {

        /* renamed from: g */
        public static final C0401i f1636g = new C0401i();

        public C0401i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Bird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            boolean isES500 = Bird_Kt.isES500(it);
            C41318g46.m40163a("filtering if bird flex: " + isES500, new Object[0]);
            return Boolean.valueOf(isES500);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B44(InterfaceC1880Ea analyticsManager, InterfaceC27246pJ bluetoothManager, InterfaceC47256q54 privateBirdsManager, WX2 myBirdsManager, InterfaceC20792gH birdActionsManager, InterfaceC25134kI birdAirManager, InterfaceC48164rd5 rxBleBirdBluetoothManager, InterfaceC40001dr4 reactiveLocationManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, OA3 converter, ScopeProvider scopeProvider, UC3 ui, String birdId, boolean z, InterfaceC39861dd3 notificationSender) {
        super(analyticsManager, bluetoothManager, privateBirdsManager, myBirdsManager, birdActionsManager, birdAirManager, rxBleBirdBluetoothManager, reactiveLocationManager, reactiveConfig, navigator, converter, scopeProvider, ui, birdId, z, notificationSender);
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(myBirdsManager, "myBirdsManager");
        Intrinsics.checkNotNullParameter(birdActionsManager, "birdActionsManager");
        Intrinsics.checkNotNullParameter(birdAirManager, "birdAirManager");
        Intrinsics.checkNotNullParameter(rxBleBirdBluetoothManager, "rxBleBirdBluetoothManager");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(notificationSender, "notificationSender");
    }

    /* renamed from: S2 */
    public static final boolean m114739S2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: T2 */
    public static final InterfaceC23447K m114738T2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U2 */
    public static final void m114737U2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V2 */
    public static final InterfaceC23447K m114736V2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W2 */
    public static final void m114735W2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X2 */
    public static final InterfaceC23496h m114734X2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Y2 */
    public static final void m114733Y2() {
    }

    /* renamed from: Z2 */
    public static final boolean m114732Z2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: a3 */
    public static final InterfaceC23496h m114731a3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: b3 */
    public static final void m114730b3() {
    }

    /* renamed from: h2 */
    public static final void m114729h2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.C49101tC3
    /* renamed from: F2 */
    public void mo12878F2(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        super.mo12878F2(bird);
        m12827W0().m81842om(true);
        m12827W0().m81844mm(bird.getLocked());
        m12827W0().m81834wm(true);
        m12827W0().m81832ym(false);
        m12827W0().m81845lm(false);
    }

    @Override // p000.C49101tC3, p000.RA3
    /* renamed from: a */
    public void mo12816a() {
        super.mo12816a();
        AbstractC23442F<Bird> firstOrError = m12872H0().firstOrError();
        final C0393c c0393c = C0393c.f1628g;
        AbstractC24507p<Bird> m33098z = firstOrError.m33098z(new InterfaceC23494q() { // from class: q44
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m114739S2;
                m114739S2 = B44.m114739S2(Function1.this, obj);
                return m114739S2;
            }
        });
        final C0394d c0394d = new C0394d();
        AbstractC23442F<R> m32072C = m33098z.m32072C(new InterfaceC23492o() { // from class: t44
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m114738T2;
                m114738T2 = B44.m114738T2(Function1.this, obj);
                return m114738T2;
            }
        });
        final C0396e c0396e = new C0396e();
        AbstractC23442F m33165A = m32072C.m33165A(new InterfaceC23492o() { // from class: u44
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m114736V2;
                m114736V2 = B44.m114736V2(Function1.this, obj);
                return m114736V2;
            }
        });
        final C0398f c0398f = new C0398f();
        AbstractC23442F m33101w = m33165A.m33101w(new InterfaceC23484g() { // from class: v44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B44.m114735W2(Function1.this, obj);
            }
        });
        final C0399g c0399g = new C0399g();
        AbstractC23461c m33164B = m33101w.m33164B(new InterfaceC23492o() { // from class: w44
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m114734X2;
                m114734X2 = B44.m114734X2(Function1.this, obj);
                return m114734X2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun onCreate() …cribe({ }, Timber::e)\n  }");
        Object m33041n = m33164B.m33041n(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: x44
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B44.m114733Y2();
            }
        };
        final C0400h c0400h = C0400h.f1635b;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: y44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B44.m114729h2(Function1.this, obj);
            }
        });
        C0058AG<Bird> m12872H0 = m12872H0();
        final C0401i c0401i = C0401i.f1636g;
        Observable<Bird> take = m12872H0.filter(new InterfaceC23494q() { // from class: z44
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m114732Z2;
                m114732Z2 = B44.m114732Z2(Function1.this, obj);
                return m114732Z2;
            }
        }).take(1L);
        final C0402j c0402j = new C0402j();
        AbstractC23461c switchMapCompletable = take.switchMapCompletable(new InterfaceC23492o() { // from class: A44
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m114731a3;
                m114731a3 = B44.m114731a3(Function1.this, obj);
                return m114731a3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun onCreate() …cribe({ }, Timber::e)\n  }");
        Object m33041n2 = switchMapCompletable.m33041n(AutoDispose.m45239a(m12833U0()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a2 = new InterfaceC23478a() { // from class: r44
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B44.m114730b3();
            }
        };
        final C0392b c0392b = C0392b.f1627b;
        ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a2, new InterfaceC23484g() { // from class: s44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B44.m114737U2(Function1.this, obj);
            }
        });
    }

    @Override // p000.C49101tC3, p000.RA3
    public boolean onBackPressed() {
        boolean m81861Wl = m12827W0().m81861Wl();
        if (!m81861Wl) {
            return super.onBackPressed();
        }
        return m81861Wl;
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B44$g */
    /* loaded from: classes3.dex */
    public static final class C0399g extends Lambda implements Function1<Pair<? extends Bird, ? extends String>, InterfaceC23496h> {
        public C0399g() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<Bird, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird bird = pair.component1();
            C41318g46.m40163a("calling refresh status via ble", new Object[0]);
            InterfaceC48164rd5 m12836T0 = B44.this.m12836T0();
            B44 b44 = B44.this;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            return m12836T0.mo15664v(b44.m12874G2(bird));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Bird, ? extends String> pair) {
            return invoke2((Pair<Bird, String>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B44$j */
    /* loaded from: classes3.dex */
    public static final class C0402j extends Lambda implements Function1<Bird, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: B44$j$a */
        /* loaded from: classes3.dex */
        public static final class C0403a extends Lambda implements Function1<Observable<byte[]>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ B44 f1638g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0403a(B44 b44) {
                super(1);
                this.f1638g = b44;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Observable<byte[]> observable) {
                invoke2(observable);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Observable<byte[]> observable) {
                C41318g46.m40163a("received notification observable for bird flex", new Object[0]);
                this.f1638g.m12830V0().onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B44$j$b */
        /* loaded from: classes3.dex */
        public static final class C0404b extends Lambda implements Function1<Observable<byte[]>, InterfaceC23434B<? extends byte[]>> {

            /* renamed from: g */
            public static final C0404b f1639g = new C0404b();

            public C0404b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23434B<? extends byte[]> invoke(Observable<byte[]> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        }

        public C0402j() {
            super(1);
        }

        /* renamed from: e */
        public static final InterfaceC23434B m114710e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final InterfaceC23496h m114709f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23496h invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            String id = bird.getId();
            C41318g46.m40163a("subscribing to ble notifications for bird " + id, new Object[0]);
            Observable retry = InterfaceC48164rd5.C27958a.subscribeBleNotifications$default(B44.this.m12836T0(), B44.this.m12874G2(bird), null, 2, null).retry(3L);
            final C0403a c0403a = new C0403a(B44.this);
            Observable doOnNext = retry.doOnNext(new InterfaceC23484g() { // from class: E44
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B44.C0402j.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C0404b c0404b = C0404b.f1639g;
            Observable flatMap = doOnNext.flatMap(new InterfaceC23492o() { // from class: F44
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m114710e;
                    m114710e = B44.C0402j.m114710e(Function1.this, obj);
                    return m114710e;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMap, "override fun onCreate() …cribe({ }, Timber::e)\n  }");
            Observable m31950a = C24527f.m31950a(flatMap, B44.this.m12872H0());
            final C0405c c0405c = new C0405c(B44.this);
            return m31950a.flatMapCompletable(new InterfaceC23492o() { // from class: G44
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m114709f;
                    m114709f = B44.C0402j.m114709f(Function1.this, obj);
                    return m114709f;
                }
            });
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/Bird;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B44$j$c */
        /* loaded from: classes3.dex */
        public static final class C0405c extends Lambda implements Function1<Pair<? extends byte[], ? extends Bird>, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ B44 f1640g;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "decryptedData", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: B44$j$c$a */
            /* loaded from: classes3.dex */
            public static final class C0406a extends Lambda implements Function1<byte[], InterfaceC23496h> {

                /* renamed from: g */
                public final /* synthetic */ B44 f1641g;

                /* renamed from: h */
                public final /* synthetic */ Bird f1642h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0406a(B44 b44, Bird bird) {
                    super(1);
                    this.f1641g = b44;
                    this.f1642h = bird;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x01db, code lost:
                    r2 = kotlin.text.StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(r1.get(r2));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x0204, code lost:
                    r1 = kotlin.text.StringsKt__StringNumberConversionsKt.toIntOrNull(r1.get(r2));
                 */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final InterfaceC23496h invoke(byte[] decryptedData) {
                    Bird updatedBird;
                    Integer intOrNull;
                    Integer intOrNull2;
                    Float floatOrNull;
                    Integer intOrNull3;
                    Integer intOrNull4;
                    Integer intOrNull5;
                    Boolean lightOn;
                    Boolean valueOf;
                    boolean z;
                    Intrinsics.checkNotNullParameter(decryptedData, "decryptedData");
                    Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
                    Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
                    String str = new String(decryptedData, forName);
                    C0390a c0390a = new C0390a(str);
                    boolean z2 = false;
                    C41318g46.m40163a("decrypted data response: " + str, new Object[0]);
                    String m114726c = c0390a.m114726c();
                    switch (m114726c.hashCode()) {
                        case 75257372:
                            if (m114726c.equals(BirdFlexVehicleConnection.REFRESH_STATUS_COMMAND)) {
                                C41318g46.m40163a("refresh status response received", new Object[0]);
                                int indexOf = c0390a.m114727b().indexOf("VER");
                                if (indexOf != -1) {
                                    C0058AG<VehicleVersion> m12824X0 = this.f1641g.m12824X0();
                                    String uuid = UUID.randomUUID().toString();
                                    String str2 = c0390a.m114727b().get(indexOf + 1);
                                    intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(c0390a.m114727b().get(indexOf + 2));
                                    int intValue = intOrNull != null ? intOrNull.intValue() : -1;
                                    String str3 = c0390a.m114727b().get(indexOf + 5);
                                    Intrinsics.checkNotNullExpressionValue(uuid, "toString()");
                                    m12824X0.accept(new VehicleVersion(uuid, str3, str2, intValue, c0390a.m114727b().get(indexOf + 3), null, 32, null));
                                }
                                updatedBird = this.f1642h;
                                break;
                            }
                            updatedBird = this.f1642h;
                            break;
                        case 75259018:
                            if (m114726c.equals(BirdFlexVehicleConnection.UNSOLICITED_STATUS_COMMAND)) {
                                List<String> m114727b = c0390a.m114727b();
                                C41318g46.m40163a("periodic status update received", new Object[0]);
                                int indexOf2 = m114727b.indexOf("ECU");
                                int distance = this.f1642h.getDistance();
                                Integer estimatedRange = this.f1642h.getEstimatedRange();
                                Boolean lightOn2 = this.f1642h.getLightOn();
                                int batteryLevel = this.f1642h.getBatteryLevel();
                                boolean locked = this.f1642h.getLocked();
                                if (indexOf2 != -1 && m114727b.size() > 8) {
                                    intOrNull3 = StringsKt__StringNumberConversionsKt.toIntOrNull(m114727b.get(indexOf2 + 5));
                                    if (intOrNull3 != null) {
                                        distance = intOrNull3.intValue() * 100;
                                    }
                                    intOrNull4 = StringsKt__StringNumberConversionsKt.toIntOrNull(m114727b.get(indexOf2 + 3));
                                    if (intOrNull4 != null) {
                                        estimatedRange = Integer.valueOf(intOrNull4.intValue() * 100);
                                    }
                                    intOrNull5 = StringsKt__StringNumberConversionsKt.toIntOrNull(m114727b.get(indexOf2 + 7));
                                    if (intOrNull5 != null) {
                                        lightOn2 = Boolean.valueOf(intOrNull5.equals(1));
                                    }
                                }
                                int i = distance;
                                Integer num = estimatedRange;
                                int indexOf3 = m114727b.indexOf("BMS");
                                if (indexOf3 != -1 && m114727b.size() >= (r2 = indexOf3 + 1) && floatOrNull != null) {
                                    batteryLevel = MathKt__MathJVMKt.roundToInt(floatOrNull.floatValue() / 10.0f);
                                }
                                int i2 = batteryLevel;
                                int indexOf4 = m114727b.indexOf("Meter");
                                if (indexOf4 != -1 && m114727b.size() >= (r2 = indexOf4 + 2) && intOrNull2 != null) {
                                    locked = intOrNull2.equals(1);
                                }
                                Bird bird = this.f1642h;
                                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                                updatedBird = bird.copy((r88 & 1) != 0 ? bird.f66670id : null, (r88 & 2) != 0 ? bird.model : null, (r88 & 4) != 0 ? bird.taskId : null, (r88 & 8) != 0 ? bird.batteryLevel : i2, (r88 & 16) != 0 ? bird.estimatedRange : num, (r88 & 32) != 0 ? bird.distance : i, (r88 & 64) != 0 ? bird.location : null, (r88 & 128) != 0 ? bird.code : null, (r88 & 256) != 0 ? bird.stickerId : null, (r88 & 512) != 0 ? bird.serialNumber : null, (r88 & 1024) != 0 ? bird.disconnected : false, (r88 & 2048) != 0 ? bird.collect : false, (r88 & 4096) != 0 ? bird.submerged : false, (r88 & 8192) != 0 ? bird.lost : false, (r88 & 16384) != 0 ? bird.locked : locked, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r88 & 65536) != 0 ? bird.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r88 & 524288) != 0 ? bird.label : null, (r88 & 1048576) != 0 ? bird.actions : null, (r88 & 2097152) != 0 ? bird.bountyId : null, (r88 & 4194304) != 0 ? bird.bountyPrice : null, (r88 & 8388608) != 0 ? bird.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r88 & 33554432) != 0 ? bird.bountyOverdue : false, (r88 & 67108864) != 0 ? bird.bountyKind : null, (r88 & 134217728) != 0 ? bird.brandName : null, (r88 & 268435456) != 0 ? bird.taskKind : null, (r88 & 536870912) != 0 ? bird.gpsAt : null, (r88 & 1073741824) != 0 ? bird.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r89 & 1) != 0 ? bird.bluetooth : false, (r89 & 2) != 0 ? bird.cellular : false, (r89 & 4) != 0 ? bird.startedAt : null, (r89 & 8) != 0 ? bird.dueAt : null, (r89 & 16) != 0 ? bird.asleep : false, (r89 & 32) != 0 ? bird.imei : null, (r89 & 64) != 0 ? bird.boardProtocol : null, (r89 & 128) != 0 ? bird.physicalLock : null, (r89 & 256) != 0 ? bird.physicalLocks : null, (r89 & 512) != 0 ? bird.priorityCollect : false, (r89 & 1024) != 0 ? bird.down : false, (r89 & 2048) != 0 ? bird.needsInspection : false, (r89 & 4096) != 0 ? bird.partnerId : null, (r89 & 8192) != 0 ? bird.nestId : null, (r89 & 16384) != 0 ? bird.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.partnerBirdState : null, (r89 & 65536) != 0 ? bird.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.lifecycle : null, (r89 & 524288) != 0 ? bird.offline : false, (r89 & 1048576) != 0 ? bird.license : null, (r89 & 2097152) != 0 ? bird.areaKey : null, (r89 & 4194304) != 0 ? bird.nestPurpose : null, (r89 & 8388608) != 0 ? bird.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r89 & 33554432) != 0 ? bird.badgeType : null, (r89 & 67108864) != 0 ? bird.bountyReasons : null, (r89 & 134217728) != 0 ? bird.ephemeralId : null, (r89 & 268435456) != 0 ? bird.bleMacAddress : null, (r89 & 536870912) != 0 ? bird.hasHelmet : null, (r89 & 1073741824) != 0 ? bird.locationUpdatedAt : null);
                                updatedBird.setLightOn(lightOn2);
                                break;
                            }
                            updatedBird = this.f1642h;
                            break;
                        case 75260949:
                            if (m114726c.equals(BirdFlexVehicleConnection.ERROR_STATUS_COMMAND)) {
                                updatedBird = this.f1642h;
                                break;
                            }
                            updatedBird = this.f1642h;
                            break;
                        case 75267727:
                            if (m114726c.equals(BirdFlexVehicleConnection.TOGGLE_HEADLIGHT_COMMAND)) {
                                Bird bird2 = this.f1642h;
                                if (c0390a.m114724e()) {
                                    valueOf = this.f1642h.getLightOn();
                                } else {
                                    valueOf = Boolean.valueOf(!(this.f1642h.getLightOn() != null ? lightOn.booleanValue() : true));
                                }
                                bird2.setLightOn(valueOf);
                                updatedBird = this.f1642h;
                                break;
                            }
                            updatedBird = this.f1642h;
                            break;
                        case 75268036:
                            if (m114726c.equals(BirdFlexVehicleConnection.CHIRP_LIGHT_COMMAND)) {
                                updatedBird = this.f1642h;
                                break;
                            }
                            updatedBird = this.f1642h;
                            break;
                        case 75274401:
                            if (m114726c.equals(BirdFlexVehicleConnection.LOCK_PCM_COMMAND)) {
                                Bird bird3 = this.f1642h;
                                Intrinsics.checkNotNullExpressionValue(bird3, "bird");
                                if (!c0390a.m114724e()) {
                                    if (!this.f1642h.getLocked()) {
                                        z = true;
                                        updatedBird = bird3.copy((r88 & 1) != 0 ? bird3.f66670id : null, (r88 & 2) != 0 ? bird3.model : null, (r88 & 4) != 0 ? bird3.taskId : null, (r88 & 8) != 0 ? bird3.batteryLevel : 0, (r88 & 16) != 0 ? bird3.estimatedRange : null, (r88 & 32) != 0 ? bird3.distance : 0, (r88 & 64) != 0 ? bird3.location : null, (r88 & 128) != 0 ? bird3.code : null, (r88 & 256) != 0 ? bird3.stickerId : null, (r88 & 512) != 0 ? bird3.serialNumber : null, (r88 & 1024) != 0 ? bird3.disconnected : false, (r88 & 2048) != 0 ? bird3.collect : false, (r88 & 4096) != 0 ? bird3.submerged : false, (r88 & 8192) != 0 ? bird3.lost : false, (r88 & 16384) != 0 ? bird3.locked : z, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird3.ackLocked : false, (r88 & 65536) != 0 ? bird3.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird3.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird3.broken : false, (r88 & 524288) != 0 ? bird3.label : null, (r88 & 1048576) != 0 ? bird3.actions : null, (r88 & 2097152) != 0 ? bird3.bountyId : null, (r88 & 4194304) != 0 ? bird3.bountyPrice : null, (r88 & 8388608) != 0 ? bird3.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird3.bountyLost : false, (r88 & 33554432) != 0 ? bird3.bountyOverdue : false, (r88 & 67108864) != 0 ? bird3.bountyKind : null, (r88 & 134217728) != 0 ? bird3.brandName : null, (r88 & 268435456) != 0 ? bird3.taskKind : null, (r88 & 536870912) != 0 ? bird3.gpsAt : null, (r88 & 1073741824) != 0 ? bird3.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird3.token : null, (r89 & 1) != 0 ? bird3.bluetooth : false, (r89 & 2) != 0 ? bird3.cellular : false, (r89 & 4) != 0 ? bird3.startedAt : null, (r89 & 8) != 0 ? bird3.dueAt : null, (r89 & 16) != 0 ? bird3.asleep : false, (r89 & 32) != 0 ? bird3.imei : null, (r89 & 64) != 0 ? bird3.boardProtocol : null, (r89 & 128) != 0 ? bird3.physicalLock : null, (r89 & 256) != 0 ? bird3.physicalLocks : null, (r89 & 512) != 0 ? bird3.priorityCollect : false, (r89 & 1024) != 0 ? bird3.down : false, (r89 & 2048) != 0 ? bird3.needsInspection : false, (r89 & 4096) != 0 ? bird3.partnerId : null, (r89 & 8192) != 0 ? bird3.nestId : null, (r89 & 16384) != 0 ? bird3.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird3.partnerBirdState : null, (r89 & 65536) != 0 ? bird3.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird3.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird3.lifecycle : null, (r89 & 524288) != 0 ? bird3.offline : false, (r89 & 1048576) != 0 ? bird3.license : null, (r89 & 2097152) != 0 ? bird3.areaKey : null, (r89 & 4194304) != 0 ? bird3.nestPurpose : null, (r89 & 8388608) != 0 ? bird3.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird3.scannedAt : null, (r89 & 33554432) != 0 ? bird3.badgeType : null, (r89 & 67108864) != 0 ? bird3.bountyReasons : null, (r89 & 134217728) != 0 ? bird3.ephemeralId : null, (r89 & 268435456) != 0 ? bird3.bleMacAddress : null, (r89 & 536870912) != 0 ? bird3.hasHelmet : null, (r89 & 1073741824) != 0 ? bird3.locationUpdatedAt : null);
                                        break;
                                    }
                                } else {
                                    z2 = this.f1642h.getLocked();
                                }
                                z = z2;
                                updatedBird = bird3.copy((r88 & 1) != 0 ? bird3.f66670id : null, (r88 & 2) != 0 ? bird3.model : null, (r88 & 4) != 0 ? bird3.taskId : null, (r88 & 8) != 0 ? bird3.batteryLevel : 0, (r88 & 16) != 0 ? bird3.estimatedRange : null, (r88 & 32) != 0 ? bird3.distance : 0, (r88 & 64) != 0 ? bird3.location : null, (r88 & 128) != 0 ? bird3.code : null, (r88 & 256) != 0 ? bird3.stickerId : null, (r88 & 512) != 0 ? bird3.serialNumber : null, (r88 & 1024) != 0 ? bird3.disconnected : false, (r88 & 2048) != 0 ? bird3.collect : false, (r88 & 4096) != 0 ? bird3.submerged : false, (r88 & 8192) != 0 ? bird3.lost : false, (r88 & 16384) != 0 ? bird3.locked : z, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird3.ackLocked : false, (r88 & 65536) != 0 ? bird3.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird3.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird3.broken : false, (r88 & 524288) != 0 ? bird3.label : null, (r88 & 1048576) != 0 ? bird3.actions : null, (r88 & 2097152) != 0 ? bird3.bountyId : null, (r88 & 4194304) != 0 ? bird3.bountyPrice : null, (r88 & 8388608) != 0 ? bird3.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird3.bountyLost : false, (r88 & 33554432) != 0 ? bird3.bountyOverdue : false, (r88 & 67108864) != 0 ? bird3.bountyKind : null, (r88 & 134217728) != 0 ? bird3.brandName : null, (r88 & 268435456) != 0 ? bird3.taskKind : null, (r88 & 536870912) != 0 ? bird3.gpsAt : null, (r88 & 1073741824) != 0 ? bird3.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird3.token : null, (r89 & 1) != 0 ? bird3.bluetooth : false, (r89 & 2) != 0 ? bird3.cellular : false, (r89 & 4) != 0 ? bird3.startedAt : null, (r89 & 8) != 0 ? bird3.dueAt : null, (r89 & 16) != 0 ? bird3.asleep : false, (r89 & 32) != 0 ? bird3.imei : null, (r89 & 64) != 0 ? bird3.boardProtocol : null, (r89 & 128) != 0 ? bird3.physicalLock : null, (r89 & 256) != 0 ? bird3.physicalLocks : null, (r89 & 512) != 0 ? bird3.priorityCollect : false, (r89 & 1024) != 0 ? bird3.down : false, (r89 & 2048) != 0 ? bird3.needsInspection : false, (r89 & 4096) != 0 ? bird3.partnerId : null, (r89 & 8192) != 0 ? bird3.nestId : null, (r89 & 16384) != 0 ? bird3.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird3.partnerBirdState : null, (r89 & 65536) != 0 ? bird3.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird3.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird3.lifecycle : null, (r89 & 524288) != 0 ? bird3.offline : false, (r89 & 1048576) != 0 ? bird3.license : null, (r89 & 2097152) != 0 ? bird3.areaKey : null, (r89 & 4194304) != 0 ? bird3.nestPurpose : null, (r89 & 8388608) != 0 ? bird3.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird3.scannedAt : null, (r89 & 33554432) != 0 ? bird3.badgeType : null, (r89 & 67108864) != 0 ? bird3.bountyReasons : null, (r89 & 134217728) != 0 ? bird3.ephemeralId : null, (r89 & 268435456) != 0 ? bird3.bleMacAddress : null, (r89 & 536870912) != 0 ? bird3.hasHelmet : null, (r89 & 1073741824) != 0 ? bird3.locationUpdatedAt : null);
                            }
                            updatedBird = this.f1642h;
                            break;
                        default:
                            updatedBird = this.f1642h;
                            break;
                    }
                    B44 b44 = this.f1641g;
                    Bird bird4 = this.f1642h;
                    Intrinsics.checkNotNullExpressionValue(bird4, "bird");
                    Intrinsics.checkNotNullExpressionValue(updatedBird, "updatedBird");
                    if (!b44.m12886D2(bird4, updatedBird)) {
                        this.f1641g.m12872H0().accept(updatedBird);
                        return this.f1641g.m12845Q0().mo18209e(updatedBird);
                    }
                    return AbstractC23461c.m33039p();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0405c(B44 b44) {
                super(1);
                this.f1640g = b44;
            }

            /* renamed from: b */
            public static final InterfaceC23496h m114707b(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23496h) tmp0.invoke(obj);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final InterfaceC23496h invoke2(Pair<byte[], Bird> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                byte[] data = pair.component1();
                Bird bird = pair.component2();
                Intrinsics.checkNotNullExpressionValue(data, "data");
                String m103785e = C3157HY.m103785e(data);
                C41318g46.m40163a("Attempting to decrypt ble notify data: " + m103785e, new Object[0]);
                InterfaceC48164rd5 m12836T0 = this.f1640g.m12836T0();
                B44 b44 = this.f1640g;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                AbstractC23442F<byte[]> mo15667s = m12836T0.mo15667s(b44.m12874G2(bird), data);
                final C0406a c0406a = new C0406a(this.f1640g, bird);
                return mo15667s.m33164B(new InterfaceC23492o() { // from class: H44
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m114707b;
                        m114707b = B44.C0402j.C0405c.m114707b(Function1.this, obj);
                        return m114707b;
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends byte[], ? extends Bird> pair) {
                return invoke2((Pair<byte[], Bird>) pair);
            }
        }
    }
}
