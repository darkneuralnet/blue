package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.PaymentInfo;
import co.bird.android.model.User;
import co.bird.android.model.constant.PaymentGatewayKind;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.api.request.SetDefaultProviderBody;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23488k;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C37791a94;
import p000.JN3;
@Metadata(m28433d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 P2\u00020\u0001:\u0001\u001dB9\b\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJL\u0010\r\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002JN\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011*\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0011*\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0011*\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0011*\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002J\f\u0010\u0016\u001a\u00020\b*\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\nH\u0002J\f\u0010\u0018\u001a\u00020\b*\u00020\nH\u0002J\f\u0010\u0019\u001a\u00020\b*\u00020\nH\u0002J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\u001aH\u0016J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u001a2\u0006\u0010\u001c\u001a\u00020\bH\u0016R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010.R \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n01008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000401008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020701008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00103R.\u0010>\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n ;*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00110\u00110:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R5\u0010C\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n ;*\n\u0012\u0004\u0012\u00020\n\u0018\u000101010?8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b\u001f\u0010BR5\u0010F\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 ;*\n\u0012\u0004\u0012\u00020\u0004\u0018\u000101010?8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010BR5\u0010H\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000207 ;*\n\u0012\u0004\u0012\u000207\u0018\u000101010?8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bG\u0010A\u001a\u0004\b*\u0010BR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010J¨\u0006Q"}, m28432d2 = {"LJN3;", "LzN3;", "", "Lco/bird/android/model/constant/PaymentMethod;", "Lco/bird/android/model/constant/PaymentProvider;", "paymentMethodToProvider", "", "providerEndpointVersion", "", "paypalEnabled", "Lco/bird/android/model/BirdPayment;", "defaultPaymentV2", "defaultPaymentV3", "v", "u", "", "B", "", "s", "H", "w", "t", "y", "x", "A", "z", "Lio/reactivex/Observable;", "b", "onlyPostPay", "e", "LLL3;", C17296a.f69688o, "LLL3;", "paymentClient", "LTq4;", "LTq4;", "reactiveConfig", "LiD1;", "c", "LiD1;", "googlePayManager", "LAM3;", DateTokenConverter.CONVERTER_KEY, "LAM3;", "paymentManagerV2", "LVM3;", "LVM3;", "paymentManagerV3", "La94;", "Lco/bird/android/buava/Optional;", "f", "La94;", "defaultPaymentMethodSubject", "g", "defaultPaymentProviderSubject", "Lco/bird/android/model/PaymentInfo;", "h", "defaultPaymentInfoSubject", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/a;", "paymentMethodsSubject", "LZ84;", "j", "Lkotlin/Lazy;", "()LZ84;", "defaultPaymentMethod", "k", "getDefaultPaymentProvider", "defaultPaymentProvider", "l", "defaultPaymentInfo", "", "()Ljava/util/Set;", "bankRedirectPaymentMethods", "LRh6;", "userStream", "<init>", "(LLL3;LTq4;LiD1;LAM3;LVM3;LRh6;)V", "m", "payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentMethodManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodManagerImpl.kt\nco/bird/android/manager/payment/PaymentMethodManagerImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n94#2,2:344\n52#2,2:347\n61#2,2:350\n82#2,2:355\n180#3:346\n180#3:349\n180#3:357\n1747#4,3:352\n288#4,2:358\n288#4,2:360\n819#4:362\n847#4,2:363\n819#4:365\n847#4,2:366\n819#4:368\n847#4,2:369\n766#4:371\n857#4,2:372\n1045#4:374\n766#4:375\n857#4,2:376\n*S KotlinDebug\n*F\n+ 1 PaymentMethodManagerImpl.kt\nco/bird/android/manager/payment/PaymentMethodManagerImpl\n*L\n61#1:344,2\n99#1:347,2\n146#1:350,2\n219#1:355,2\n96#1:346\n137#1:349\n239#1:357\n184#1:352,3\n251#1:358,2\n252#1:360,2\n256#1:362\n256#1:363,2\n265#1:365\n265#1:366,2\n266#1:368\n266#1:369,2\n279#1:371\n279#1:372,2\n288#1:374\n289#1:375\n289#1:376,2\n*E\n"})
/* renamed from: JN3 */
/* loaded from: classes4.dex */
public final class JN3 implements InterfaceC52757zN3 {

    /* renamed from: m */
    public static final C4044e f17426m = new C4044e(null);

    /* renamed from: n */
    public static final Set<PaymentMethod> f17427n;

    /* renamed from: a */
    public final LL3 f17428a;

    /* renamed from: b */
    public final C36207Tq4 f17429b;

    /* renamed from: c */
    public final InterfaceC42586iD1 f17430c;

    /* renamed from: d */
    public final AM3 f17431d;

    /* renamed from: e */
    public final VM3 f17432e;

    /* renamed from: f */
    public final C37791a94<Optional<BirdPayment>> f17433f;

    /* renamed from: g */
    public final C37791a94<Optional<PaymentProvider>> f17434g;

    /* renamed from: h */
    public final C37791a94<Optional<PaymentInfo>> f17435h;

    /* renamed from: i */
    public final C24552a<List<BirdPayment>> f17436i;

    /* renamed from: j */
    public final Lazy f17437j;

    /* renamed from: k */
    public final Lazy f17438k;

    /* renamed from: l */
    public final Lazy f17439l;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2¯\u0001\u0010\t\u001aª\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00010\u0001 \b*T\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"LJx5;", "", "", "Lco/bird/android/model/constant/PaymentMethod;", "Lco/bird/android/model/constant/PaymentProvider;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LJx5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPaymentMethodManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodManagerImpl.kt\nco/bird/android/manager/payment/PaymentMethodManagerImpl$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
    /* renamed from: JN3$a */
    /* loaded from: classes4.dex */
    public static final class C4039a extends Lambda implements Function1<C33931Jx5<? extends Boolean, ? extends Map<PaymentMethod, ? extends PaymentProvider>, ? extends Map<PaymentProvider, ? extends Integer>, ? extends Optional<BirdPayment>, ? extends Optional<BirdPayment>, ? extends Boolean>, Unit> {
        public C4039a() {
            super(1);
        }

        /* renamed from: a */
        public final void m100605a(C33931Jx5<Boolean, ? extends Map<PaymentMethod, ? extends PaymentProvider>, ? extends Map<PaymentProvider, Integer>, Optional<BirdPayment>, Optional<BirdPayment>, Boolean> c33931Jx5) {
            Optional m59034a;
            boolean booleanValue = c33931Jx5.m99520a().booleanValue();
            Map<PaymentMethod, ? extends PaymentProvider> m99519b = c33931Jx5.m99519b();
            Map<PaymentProvider, Integer> m99518c = c33931Jx5.m99518c();
            Optional<BirdPayment> m99517d = c33931Jx5.m99517d();
            Optional<BirdPayment> m99516e = c33931Jx5.m99516e();
            c33931Jx5.m99515f();
            BirdPayment m100611u = JN3.this.m100611u(m99519b, m99518c, booleanValue, m99517d.m59035e(), m99516e.m59035e());
            PaymentProvider m100610v = JN3.this.m100610v(m99519b, m99518c, booleanValue, m99517d.m59035e(), m99516e.m59035e());
            C37791a94 c37791a94 = JN3.this.f17433f;
            if (m100611u == null || (m59034a = Optional.f63040c.m59032c(m100611u)) == null) {
                m59034a = Optional.f63040c.m59034a();
            }
            c37791a94.accept(m59034a);
            C37791a94 c37791a942 = JN3.this.f17434g;
            Optional.C14443a c14443a = Optional.f63040c;
            c37791a942.accept(c14443a.m59032c(m100610v));
            JN3.this.f17435h.accept(c14443a.m59032c(new PaymentInfo(m100611u, m100610v)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C33931Jx5<? extends Boolean, ? extends Map<PaymentMethod, ? extends PaymentProvider>, ? extends Map<PaymentProvider, ? extends Integer>, ? extends Optional<BirdPayment>, ? extends Optional<BirdPayment>, ? extends Boolean> c33931Jx5) {
            m100605a(c33931Jx5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/User;", "old", "new", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JN3$b */
    /* loaded from: classes4.dex */
    public static final class C4040b extends Lambda implements Function2<Optional<User>, Optional<User>, Boolean> {

        /* renamed from: g */
        public static final C4040b f17441g = new C4040b();

        public C4040b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Optional<User> old, Optional<User> optional) {
            String str;
            Intrinsics.checkNotNullParameter(old, "old");
            Intrinsics.checkNotNullParameter(optional, "new");
            User m59035e = old.m59035e();
            String str2 = null;
            if (m59035e != null) {
                str = m59035e.getId();
            } else {
                str = null;
            }
            User m59035e2 = optional.m59035e();
            if (m59035e2 != null) {
                str2 = m59035e2.getId();
            }
            return Boolean.valueOf(Intrinsics.areEqual(str, str2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/PaymentInfo;", "old", "new", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JN3$c */
    /* loaded from: classes4.dex */
    public static final class C4041c extends Lambda implements Function2<Optional<PaymentInfo>, Optional<PaymentInfo>, Boolean> {

        /* renamed from: g */
        public static final C4041c f17442g = new C4041c();

        public C4041c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Optional<PaymentInfo> old, Optional<PaymentInfo> optional) {
            BirdPayment birdPayment;
            BirdPayment birdPayment2;
            String str;
            String str2;
            boolean z;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            PaymentProvider paymentProvider;
            PaymentProvider paymentProvider2;
            Intrinsics.checkNotNullParameter(old, "old");
            Intrinsics.checkNotNullParameter(optional, "new");
            PaymentInfo m59035e = old.m59035e();
            String str12 = null;
            if (m59035e != null) {
                birdPayment = m59035e.getPaymentMethod();
            } else {
                birdPayment = null;
            }
            PaymentInfo m59035e2 = optional.m59035e();
            if (m59035e2 != null) {
                birdPayment2 = m59035e2.getPaymentMethod();
            } else {
                birdPayment2 = null;
            }
            PaymentInfo m59035e3 = old.m59035e();
            if (m59035e3 != null && (paymentProvider2 = m59035e3.getPaymentProvider()) != null) {
                str = paymentProvider2.name();
            } else {
                str = null;
            }
            PaymentInfo m59035e4 = optional.m59035e();
            if (m59035e4 != null && (paymentProvider = m59035e4.getPaymentProvider()) != null) {
                str2 = paymentProvider.name();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str, str2)) {
                if (birdPayment != null) {
                    str3 = birdPayment.getBrand();
                } else {
                    str3 = null;
                }
                if (birdPayment2 != null) {
                    str4 = birdPayment2.getBrand();
                } else {
                    str4 = null;
                }
                if (Intrinsics.areEqual(str3, str4)) {
                    if (birdPayment != null) {
                        str5 = birdPayment.getLastCardNumbers();
                    } else {
                        str5 = null;
                    }
                    if (birdPayment2 != null) {
                        str6 = birdPayment2.getLastCardNumbers();
                    } else {
                        str6 = null;
                    }
                    if (Intrinsics.areEqual(str5, str6)) {
                        if (birdPayment != null) {
                            str7 = birdPayment.getExpiryMonth();
                        } else {
                            str7 = null;
                        }
                        if (birdPayment2 != null) {
                            str8 = birdPayment2.getExpiryMonth();
                        } else {
                            str8 = null;
                        }
                        if (Intrinsics.areEqual(str7, str8)) {
                            if (birdPayment != null) {
                                str9 = birdPayment.getExpiryYear();
                            } else {
                                str9 = null;
                            }
                            if (birdPayment2 != null) {
                                str10 = birdPayment2.getExpiryYear();
                            } else {
                                str10 = null;
                            }
                            if (Intrinsics.areEqual(str9, str10)) {
                                if (birdPayment != null) {
                                    str11 = birdPayment.getPaypalEmail();
                                } else {
                                    str11 = null;
                                }
                                if (birdPayment2 != null) {
                                    str12 = birdPayment2.getPaypalEmail();
                                }
                                if (Intrinsics.areEqual(str11, str12)) {
                                    z = true;
                                    return Boolean.valueOf(z);
                                }
                            }
                        }
                    }
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0003*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0003*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062:\u0010\u0005\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/PaymentInfo;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "LHM4;", "Lco/bird/api/request/SetDefaultProviderBody;", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JN3$d */
    /* loaded from: classes4.dex */
    public static final class C4042d extends Lambda implements Function1<Pair<? extends Optional<User>, ? extends Optional<PaymentInfo>>, InterfaceC24574u<? extends HM4<SetDefaultProviderBody>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: JN3$d$a */
        /* loaded from: classes4.dex */
        public static final class C4043a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C4043a f17444g = new C4043a();

            public C4043a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while setting default payment provider.", new Object[0]);
            }
        }

        public C4042d() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends HM4<SetDefaultProviderBody>> invoke(Pair<Optional<User>, Optional<PaymentInfo>> pair) {
            BirdPayment birdPayment;
            PaymentProvider paymentProvider;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<User> component1 = pair.component1();
            Optional<PaymentInfo> component2 = pair.component2();
            PaymentInfo m59035e = component2.m59035e();
            String str = null;
            if (m59035e != null) {
                birdPayment = m59035e.getPaymentMethod();
            } else {
                birdPayment = null;
            }
            PaymentInfo m59035e2 = component2.m59035e();
            if (m59035e2 != null) {
                paymentProvider = m59035e2.getPaymentProvider();
            } else {
                paymentProvider = null;
            }
            User m59035e3 = component1.m59035e();
            if (paymentProvider != null && paymentProvider != PaymentProvider.UNKNOWN && m59035e3 != null) {
                LL3 ll3 = JN3.this.f17428a;
                String id = m59035e3.getId();
                if (birdPayment != null) {
                    str = birdPayment.getId();
                }
                AbstractC24507p<HM4<SetDefaultProviderBody>> m33125j0 = ll3.m97042l(new SetDefaultProviderBody(paymentProvider, id, str)).m33125j0();
                final C4043a c4043a = C4043a.f17444g;
                return m33125j0.m32029p(new InterfaceC23484g() { // from class: KN3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        JN3.C4042d.invoke$lambda$0(Function1.this, obj);
                    }
                }).m32065J();
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LJN3$e;", "", "", "Lco/bird/android/model/constant/PaymentMethod;", "BANK_REDIRECT_PAYMENT_METHODS", "Ljava/util/Set;", "<init>", "()V", "payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: JN3$e */
    /* loaded from: classes4.dex */
    public static final class C4044e {
        public /* synthetic */ C4044e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4044e() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JN3$f */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C4045f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.values().length];
            try {
                iArr[PaymentMethod.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.PAYPAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.GOOGLE_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PaymentMethodManagerImpl.kt\nco/bird/android/manager/payment/PaymentMethodManagerImpl\n*L\n1#1,328:1\n288#2:329\n*E\n"})
    /* renamed from: JN3$g */
    /* loaded from: classes4.dex */
    public static final class C4046g<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(!((BirdPayment) t).getDefaultPaymentMethod()), Boolean.valueOf(!((BirdPayment) t2).getDefaultPaymentMethod()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/PaymentInfo;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JN3$h */
    /* loaded from: classes4.dex */
    public static final class C4047h extends Lambda implements Function0<Z84<Optional<PaymentInfo>>> {
        public C4047h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<PaymentInfo>> invoke() {
            return Z84.f47888d.m73663b(JN3.this.f17435h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JN3$i */
    /* loaded from: classes4.dex */
    public static final class C4048i extends Lambda implements Function0<Z84<Optional<BirdPayment>>> {
        public C4048i() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<BirdPayment>> invoke() {
            return Z84.f47888d.m73663b(JN3.this.f17433f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/PaymentProvider;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JN3$j */
    /* loaded from: classes4.dex */
    public static final class C4049j extends Lambda implements Function0<Z84<Optional<PaymentProvider>>> {
        public C4049j() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<PaymentProvider>> invoke() {
            return Z84.f47888d.m73663b(JN3.this.f17434g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u00032\u0006\u0010\n\u001a\u00028\u00042\u0006\u0010\u000b\u001a\u00028\u0005H\n¢\u0006\u0004\b\r\u0010\u000e"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "T6", "t1", "t2", "t3", "t4", "t5", "t6", "LJx5;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LJx5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$5\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: JN3$k */
    /* loaded from: classes4.dex */
    public static final class C4050k<T1, T2, T3, T4, T5, T6, R> implements InterfaceC23488k {

        /* renamed from: a */
        public static final C4050k<T1, T2, T3, T4, T5, T6, R> f17448a = new C4050k<>();

        @Override // io.reactivex.functions.InterfaceC23488k
        /* renamed from: a */
        public final C33931Jx5<T1, T2, T3, T4, T5, T6> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            return new C33931Jx5<>(t1, t2, t3, t4, t5, t6);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: JN3$l */
    /* loaded from: classes4.dex */
    public static final class C4051l<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C4051l<T1, T2, R> f17449a = new C4051l<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: JN3$m */
    /* loaded from: classes4.dex */
    public static final class C4052m<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C4052m<T1, T2, T3, T4, T5, R> f17450a = new C4052m<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "old", "new", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JN3$n */
    /* loaded from: classes4.dex */
    public static final class C4053n extends Lambda implements Function2<Optional<BirdPayment>, Optional<BirdPayment>, Boolean> {

        /* renamed from: g */
        public static final C4053n f17451g = new C4053n();

        public C4053n() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Optional<BirdPayment> old, Optional<BirdPayment> optional) {
            String str;
            Intrinsics.checkNotNullParameter(old, "old");
            Intrinsics.checkNotNullParameter(optional, "new");
            BirdPayment m59035e = old.m59035e();
            String str2 = null;
            if (m59035e != null) {
                str = m59035e.getId();
            } else {
                str = null;
            }
            BirdPayment m59035e2 = optional.m59035e();
            if (m59035e2 != null) {
                str2 = m59035e2.getId();
            }
            return Boolean.valueOf(Intrinsics.areEqual(str, str2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00050\u00052l\u0010\u0006\u001ah\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LRe4;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(LRe4;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPaymentMethodManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodManagerImpl.kt\nco/bird/android/manager/payment/PaymentMethodManagerImpl$subscribeToSavedPaymentMethods$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
    /* renamed from: JN3$o */
    /* loaded from: classes4.dex */
    public static final class C4054o extends Lambda implements Function1<C35631Re4<? extends Boolean, ? extends Boolean, ? extends Optional<BirdPayment>, ? extends Optional<List<? extends BirdPayment>>, ? extends List<? extends BirdPayment>>, List<? extends BirdPayment>> {
        public C4054o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<BirdPayment> invoke(C35631Re4<Boolean, Boolean, Optional<BirdPayment>, Optional<List<BirdPayment>>, ? extends List<BirdPayment>> c35631Re4) {
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            boolean booleanValue = c35631Re4.m86500a().booleanValue();
            Optional<List<BirdPayment>> m86497d = c35631Re4.m86497d();
            List<BirdPayment> paymentMethodsV3 = c35631Re4.m86496e();
            ArrayList arrayList = new ArrayList();
            Intrinsics.checkNotNullExpressionValue(paymentMethodsV3, "paymentMethodsV3");
            arrayList.addAll(paymentMethodsV3);
            BirdPayment m59035e = c35631Re4.m86498c().m59035e();
            if (m59035e != null) {
                arrayList.add(m59035e);
            }
            List<BirdPayment> m59035e2 = m86497d.m59035e();
            if (m59035e2 != null) {
                arrayList.addAll(m59035e2);
            }
            JN3 jn3 = JN3.this;
            return jn3.m100613s(jn3.m100627H(jn3.m100612t(jn3.m100609w(arrayList)), booleanValue));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/BirdPayment;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JN3$p */
    /* loaded from: classes4.dex */
    public static final class C4055p extends Lambda implements Function1<List<? extends BirdPayment>, Unit> {
        public C4055p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends BirdPayment> list) {
            invoke2((List<BirdPayment>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<BirdPayment> list) {
            JN3.this.f17436i.onNext(list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: JN3$q */
    /* loaded from: classes4.dex */
    public static final class C4056q<T1, T2, T3, R> implements InterfaceC23485h {

        /* renamed from: a */
        public static final C4056q<T1, T2, T3, R> f17454a = new C4056q<>();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0005*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/constant/PaymentMethod;", "Lco/bird/android/model/constant/PaymentProvider;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JN3$r */
    /* loaded from: classes4.dex */
    public static final class C4057r extends Lambda implements Function1<Map<PaymentMethod, ? extends PaymentProvider>, List<? extends PaymentMethod>> {

        /* renamed from: g */
        public static final C4057r f17455g = new C4057r();

        public C4057r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<PaymentMethod> invoke(Map<PaymentMethod, ? extends PaymentProvider> it) {
            List<PaymentMethod> list;
            Intrinsics.checkNotNullParameter(it, "it");
            list = CollectionsKt___CollectionsKt.toList(it.keySet());
            return list;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u000124\u0010\u0005\u001a0\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/constant/PaymentMethod;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPaymentMethodManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodManagerImpl.kt\nco/bird/android/manager/payment/PaymentMethodManagerImpl$supportedPaymentMethods$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1603#2,9:344\n1855#2:353\n1856#2:355\n1612#2:356\n1#3:354\n*S KotlinDebug\n*F\n+ 1 PaymentMethodManagerImpl.kt\nco/bird/android/manager/payment/PaymentMethodManagerImpl$supportedPaymentMethods$2\n*L\n152#1:344,9\n152#1:353\n152#1:355\n152#1:356\n152#1:354\n*E\n"})
    /* renamed from: JN3$s */
    /* loaded from: classes4.dex */
    public static final class C4058s extends Lambda implements Function1<Triple<? extends List<? extends PaymentMethod>, ? extends Boolean, ? extends Boolean>, List<? extends PaymentMethod>> {

        /* renamed from: g */
        public final /* synthetic */ boolean f17456g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4058s(boolean z) {
            super(1);
            this.f17456g = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<PaymentMethod> invoke(Triple<? extends List<? extends PaymentMethod>, Boolean, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<? extends PaymentMethod> paymentMethods = triple.component1();
            Boolean component2 = triple.component2();
            boolean booleanValue = triple.component3().booleanValue();
            Intrinsics.checkNotNullExpressionValue(paymentMethods, "paymentMethods");
            boolean z = this.f17456g;
            ArrayList arrayList = new ArrayList();
            for (PaymentMethod paymentMethod : paymentMethods) {
                if ((paymentMethod == PaymentMethod.GOOGLE_PAY && !component2.booleanValue()) || ((paymentMethod == PaymentMethod.PAYPAL && !booleanValue) || (z && JN3.f17427n.contains(paymentMethod)))) {
                    paymentMethod = null;
                }
                if (paymentMethod != null) {
                    arrayList.add(paymentMethod);
                }
            }
            return arrayList;
        }
    }

    static {
        Set<PaymentMethod> of;
        of = SetsKt__SetsKt.setOf((Object[]) new PaymentMethod[]{PaymentMethod.BANCONTACT, PaymentMethod.EPS, PaymentMethod.FPX, PaymentMethod.GIROPAY, PaymentMethod.IDEAL, PaymentMethod.P24, PaymentMethod.SOFORT});
        f17427n = of;
    }

    public JN3(LL3 paymentClient, C36207Tq4 reactiveConfig, InterfaceC42586iD1 googlePayManager, AM3 paymentManagerV2, VM3 paymentManagerV3, InterfaceC35660Rh6 userStream) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(paymentClient, "paymentClient");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f17428a = paymentClient;
        this.f17429b = reactiveConfig;
        this.f17430c = googlePayManager;
        this.f17431d = paymentManagerV2;
        this.f17432e = paymentManagerV3;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f17433f = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f17434g = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        C37791a94<Optional<PaymentInfo>> create$default = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f17435h = create$default;
        C24552a<List<BirdPayment>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<BirdPayment>>()");
        this.f17436i = m31922e;
        lazy = LazyKt__LazyJVMKt.lazy(new C4048i());
        this.f17437j = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C4049j());
        this.f17438k = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C4047h());
        this.f17439l = lazy3;
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<Boolean> m82810N6 = reactiveConfig.m82810N6();
        Observable<Map<PaymentMethod, PaymentProvider>> m82778Q8 = reactiveConfig.m82778Q8();
        Observable<Map<PaymentProvider, Integer>> m82758S8 = reactiveConfig.m82758S8();
        Z84<Optional<BirdPayment>> mo85677e = paymentManagerV2.mo85677e();
        Z84<Optional<BirdPayment>> mo25745e = paymentManagerV3.mo25745e();
        Observable<Boolean> distinctUntilChanged = googlePayManager.mo16238f().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "googlePayManager.googleP…().distinctUntilChanged()");
        Observable combineLatest = Observable.combineLatest(m82810N6, m82778Q8, m82758S8, mo85677e, mo25745e, distinctUntilChanged, C4050k.f17448a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…1, t2, t3, t4, t5, t6) })");
        final C4039a c4039a = new C4039a();
        Observable doOnNext = combineLatest.doOnNext(new InterfaceC23484g() { // from class: AN3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JN3.m100617o(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "Observables.combineLates…     ))\n        )\n      }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        Z84<Optional<User>> mo76577h = userStream.mo76577h();
        final C4040b c4040b = C4040b.f17441g;
        Observable<Optional<User>> distinctUntilChanged2 = mo76577h.distinctUntilChanged(new InterfaceC23481d() { // from class: BN3
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m100616p;
                m100616p = JN3.m100616p(Function2.this, obj, obj2);
                return m100616p;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "userStream.currentUserSt… new.orNull()?.id\n      }");
        final C4041c c4041c = C4041c.f17442g;
        Observable<Optional<PaymentInfo>> distinctUntilChanged3 = create$default.distinctUntilChanged(new InterfaceC23481d() { // from class: CN3
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m100615q;
                m100615q = JN3.m100615q(Function2.this, obj, obj2);
                return m100615q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged3, "defaultPaymentInfoSubjec…Card?.paypalEmail\n      }");
        Observable combineLatest2 = Observable.combineLatest(distinctUntilChanged2, distinctUntilChanged3, C4051l.f17449a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C4042d c4042d = new C4042d();
        Observable flatMapMaybe = combineLatest2.flatMapMaybe(new InterfaceC23492o() { // from class: DN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m100614r;
                m100614r = JN3.m100614r(Function1.this, obj);
                return m100614r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "Observables.combineLates…empty()\n        }\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = flatMapMaybe.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        m100633B();
    }

    /* renamed from: C */
    public static final boolean m100632C(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: D */
    public static final List m100631D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m100630E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final List m100629F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final List m100628G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m100617o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final boolean m100616p(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: q */
    public static final boolean m100615q(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: r */
    public static final InterfaceC24574u m100614r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final boolean m100634A(BirdPayment birdPayment) {
        VM3 vm3 = this.f17432e;
        PaymentMethod paymentMethod = PaymentMethod.PAYPAL;
        Integer mo25749c = vm3.mo25749c(paymentMethod);
        PaymentProvider mo25723p = this.f17432e.mo25723p(paymentMethod);
        if (!this.f17429b.m82623f8().m73665a().getPaymentConfig().getEnablePaypal() && (mo25723p == PaymentProvider.UNKNOWN || !Intrinsics.areEqual(birdPayment.getPaymentMethodVersion(), mo25749c))) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public final void m100633B() {
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<Boolean> m82810N6 = this.f17429b.m82810N6();
        Observable<Boolean> m82590i8 = this.f17429b.m82590i8();
        Z84<Optional<BirdPayment>> mo85677e = this.f17431d.mo85677e();
        final C4053n c4053n = C4053n.f17451g;
        Observable<Optional<BirdPayment>> distinctUntilChanged = mo85677e.distinctUntilChanged(new InterfaceC23481d() { // from class: EN3
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m100632C;
                m100632C = JN3.m100632C(Function2.this, obj, obj2);
                return m100632C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "paymentManagerV2.default… new.orNull()?.id\n      }");
        Observable<Optional<List<BirdPayment>>> distinctUntilChanged2 = this.f17431d.mo85657r().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "paymentManagerV2.stripeP…ds.distinctUntilChanged()");
        Observable<List<BirdPayment>> distinctUntilChanged3 = this.f17432e.mo25751b().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged3, "paymentManagerV3.savedPa…().distinctUntilChanged()");
        Observable combineLatest = Observable.combineLatest(m82810N6, m82590i8, distinctUntilChanged, distinctUntilChanged2, distinctUntilChanged3, C4052m.f17450a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
        final C4054o c4054o = new C4054o();
        Observable map = combineLatest.map(new InterfaceC23492o() { // from class: FN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m100631D;
                m100631D = JN3.m100631D(Function1.this, obj);
                return m100631D;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun subscribeToS…ct.onNext(it)\n      }\n  }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = map.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4055p c4055p = new C4055p();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: GN3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JN3.m100630E(Function1.this, obj);
            }
        });
    }

    /* renamed from: H */
    public final List<BirdPayment> m100627H(List<BirdPayment> list, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!((z || !((BirdPayment) next).isPaypal()) ? false : false)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            BirdPayment birdPayment = (BirdPayment) obj;
            if (birdPayment.getGatewayKind() == PaymentGatewayKind.BRAINTREE && birdPayment.getPaypalEmail() == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // p000.InterfaceC52757zN3
    /* renamed from: a */
    public Z84<Optional<BirdPayment>> mo1484a() {
        return (Z84) this.f17437j.getValue();
    }

    @Override // p000.InterfaceC52757zN3
    /* renamed from: b */
    public Observable<List<BirdPayment>> mo1483b() {
        Observable<List<BirdPayment>> hide = this.f17436i.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "paymentMethodsSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC52757zN3
    /* renamed from: c */
    public Set<PaymentMethod> mo1482c() {
        return f17427n;
    }

    @Override // p000.InterfaceC52757zN3
    /* renamed from: d */
    public Z84<Optional<PaymentInfo>> mo1481d() {
        return (Z84) this.f17439l.getValue();
    }

    @Override // p000.InterfaceC52757zN3
    /* renamed from: e */
    public Observable<List<PaymentMethod>> mo1480e(boolean z) {
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<Map<PaymentMethod, PaymentProvider>> m82778Q8 = this.f17429b.m82778Q8();
        final C4057r c4057r = C4057r.f17455g;
        InterfaceC23434B map = m82778Q8.map(new InterfaceC23492o() { // from class: HN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m100629F;
                m100629F = JN3.m100629F(Function1.this, obj);
                return m100629F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "reactiveConfig.paymentMe….map { it.keys.toList() }");
        Observable<Boolean> m33123k0 = this.f17430c.mo16237g().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "googlePayManager.googlePayReady().toObservable()");
        Observable combineLatest = Observable.combineLatest(map, m33123k0, this.f17429b.m82810N6(), C4056q.f17454a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
        final C4058s c4058s = new C4058s(z);
        Observable<List<PaymentMethod>> map2 = combineLatest.map(new InterfaceC23492o() { // from class: IN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m100628G;
                m100628G = JN3.m100628G(Function1.this, obj);
                return m100628G;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "onlyPostPay: Boolean): O…d\n        }\n      }\n    }");
        return map2;
    }

    /* renamed from: s */
    public final List<BirdPayment> m100613s(List<BirdPayment> list) {
        BirdPayment birdPayment;
        boolean z;
        Integer paymentMethodVersion;
        boolean z2;
        boolean z3;
        Integer paymentMethodVersion2;
        Integer mo25749c = this.f17432e.mo25749c(PaymentMethod.PAYPAL);
        Object obj = null;
        if (mo25749c != null && mo25749c.intValue() == 3) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                BirdPayment birdPayment2 = (BirdPayment) next;
                if (birdPayment2.isPaypal() && (paymentMethodVersion2 = birdPayment2.getPaymentMethodVersion()) != null && paymentMethodVersion2.intValue() == 3) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    obj = next;
                    break;
                }
            }
            birdPayment = (BirdPayment) obj;
        } else {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                BirdPayment birdPayment3 = (BirdPayment) next2;
                if (birdPayment3.isPaypal() && ((paymentMethodVersion = birdPayment3.getPaymentMethodVersion()) == null || paymentMethodVersion.intValue() != 3)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    obj = next2;
                    break;
                }
            }
            birdPayment = (BirdPayment) obj;
        }
        if (birdPayment != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                BirdPayment birdPayment4 = (BirdPayment) obj2;
                if (birdPayment4.isPaypal() && !Intrinsics.areEqual(birdPayment4.getId(), birdPayment.getId())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        return list;
    }

    /* renamed from: t */
    public final List<BirdPayment> m100612t(List<BirdPayment> list) {
        List sortedWith;
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C4046g());
        ArrayList arrayList = new ArrayList();
        for (Object obj : sortedWith) {
            BirdPayment birdPayment = (BirdPayment) obj;
            boolean z2 = true;
            if (birdPayment.getGatewayKind() != PaymentGatewayKind.STRIPE) {
                z = true;
            } else {
                z = false;
            }
            String str = birdPayment.getBrand() + birdPayment.getLastCardNumbers() + birdPayment.getExpiryMonth() + birdPayment.getExpiryYear();
            if (!z && !linkedHashSet.add(str)) {
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r5 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, r7) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return r9;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BirdPayment m100611u(Map<PaymentMethod, ? extends PaymentProvider> map, Map<PaymentProvider, Integer> map2, boolean z, BirdPayment birdPayment, BirdPayment birdPayment2) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z2;
        PaymentProvider paymentProvider = map.get(PaymentMethod.CARD);
        if (paymentProvider == null) {
            paymentProvider = PaymentProvider.STRIPE;
        }
        PaymentProvider paymentProvider2 = map.get(PaymentMethod.PAYPAL);
        Integer num = map2.get(paymentProvider2);
        boolean z3 = false;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (z && i == 3) {
            if (birdPayment2 != null && birdPayment2.isPaypal()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
            }
        }
        if (z) {
            if (birdPayment != null && birdPayment.isPaypal()) {
                z3 = true;
            }
            if (z3) {
                return birdPayment;
            }
        }
        if (birdPayment2 != null) {
            PaymentGatewayKind gatewayKind = birdPayment2.getGatewayKind();
            if (gatewayKind != null) {
                str3 = gatewayKind.name();
            } else {
                str3 = null;
            }
            if (paymentProvider != null) {
                str4 = paymentProvider.name();
            } else {
                str4 = null;
            }
        }
        if (birdPayment != null) {
            PaymentGatewayKind gatewayKind2 = birdPayment.getGatewayKind();
            if (gatewayKind2 != null) {
                str = gatewayKind2.name();
            } else {
                str = null;
            }
            if (paymentProvider != null) {
                str2 = paymentProvider.name();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str, str2)) {
                return birdPayment;
            }
        }
        return null;
    }

    /* renamed from: v */
    public final PaymentProvider m100610v(Map<PaymentMethod, ? extends PaymentProvider> map, Map<PaymentProvider, Integer> map2, boolean z, BirdPayment birdPayment, BirdPayment birdPayment2) {
        int i;
        boolean z2;
        boolean z3;
        PaymentProvider paymentProvider = map.get(PaymentMethod.CARD);
        if (paymentProvider == null) {
            paymentProvider = PaymentProvider.UNKNOWN;
        }
        PaymentProvider paymentProvider2 = map.get(PaymentMethod.PAYPAL);
        if (paymentProvider2 == null) {
            paymentProvider2 = PaymentProvider.UNKNOWN;
        }
        Integer num = map2.get(paymentProvider2);
        boolean z4 = false;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (birdPayment == null && birdPayment2 == null) {
            Collection<? extends PaymentProvider> values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator<T> it = values.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((PaymentProvider) it.next()) == PaymentProvider.ADYEN) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        z4 = true;
                        break;
                    }
                }
            }
            if (!z4 && !z) {
                return PaymentProvider.STRIPE;
            }
            return PaymentProvider.UNKNOWN;
        }
        if (z && i == 3) {
            if (birdPayment2 != null && birdPayment2.isPaypal()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && paymentProvider2 != PaymentProvider.UNKNOWN) {
                return paymentProvider2;
            }
        }
        if (z) {
            if (birdPayment != null && birdPayment.isPaypal()) {
                z4 = true;
            }
            if (z4) {
                return PaymentProvider.BRAINTREE;
            }
        }
        if ((birdPayment2 == null || paymentProvider == PaymentProvider.UNKNOWN) && paymentProvider == PaymentProvider.UNKNOWN) {
            return PaymentProvider.STRIPE;
        }
        return paymentProvider;
    }

    /* renamed from: w */
    public final List<BirdPayment> m100609w(List<BirdPayment> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (m100607y((BirdPayment) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    public final boolean m100608x(BirdPayment birdPayment) {
        String str;
        boolean equals;
        VM3 vm3 = this.f17432e;
        PaymentMethod paymentMethod = PaymentMethod.CARD;
        Integer mo25749c = vm3.mo25749c(paymentMethod);
        PaymentProvider mo25723p = this.f17432e.mo25723p(paymentMethod);
        if (mo25723p == PaymentProvider.UNKNOWN && Intrinsics.areEqual(mo25749c, birdPayment.getPaymentMethodVersion())) {
            mo25723p = PaymentProvider.STRIPE;
        }
        PaymentGatewayKind gatewayKind = birdPayment.getGatewayKind();
        if (gatewayKind != null) {
            str = gatewayKind.name();
        } else {
            str = null;
        }
        equals = StringsKt__StringsJVMKt.equals(str, mo25723p.name(), true);
        return equals;
    }

    /* renamed from: y */
    public final boolean m100607y(BirdPayment birdPayment) {
        int i = C4045f.$EnumSwitchMapping$0[birdPayment.getMethodType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return true;
                }
                return m100606z(birdPayment);
            }
            return m100634A(birdPayment);
        }
        return m100608x(birdPayment);
    }

    /* renamed from: z */
    public final boolean m100606z(BirdPayment birdPayment) {
        VM3 vm3 = this.f17432e;
        PaymentMethod paymentMethod = PaymentMethod.GOOGLE_PAY;
        Integer mo25749c = vm3.mo25749c(paymentMethod);
        PaymentProvider mo25723p = this.f17432e.mo25723p(paymentMethod);
        if (!this.f17429b.m82623f8().m73665a().getGooglePayAvailable() && (mo25723p == PaymentProvider.UNKNOWN || !Intrinsics.areEqual(birdPayment.getPaymentMethodVersion(), mo25749c))) {
            return false;
        }
        return true;
    }
}
