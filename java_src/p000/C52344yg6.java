package p000;

import android.annotation.SuppressLint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Agreement;
import co.bird.android.model.AgreementKey;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.Balance;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireUserGuest;
import co.bird.api.request.AgreementAgreeBody;
import co.bird.api.response.AgreementAcceptResponse;
import co.bird.api.response.AgreementResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C37791a94;
import p000.C52344yg6;
import p000.InterfaceC36587Vg6;
import p000.InterfaceC44637lg6;
@Metadata(m28433d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00100\u001a\u00020.\u0012\u0006\u00103\u001a\u000201\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0002JC\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0013\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0016\u0010\u0018\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0002J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a2\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u0016J=\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b \u0010\u000eJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0006\u0010!\u001a\u00020\u0007H\u0016J)\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0012\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\u0004\"\u00020#H\u0016¢\u0006\u0004\b%\u0010&J \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010(\u001a\u00020'2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00109R3\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020=\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0<0;8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010>\u001a\u0004\b5\u0010?R!\u0010A\u001a\b\u0012\u0004\u0012\u00020@0;8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010>\u001a\u0004\b+\u0010?R,\u0010D\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020=\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0<0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020@0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010C¨\u0006K"}, m28432d2 = {"Lyg6;", "Llg6;", "", "L", "", "Lco/bird/android/model/AgreementRole;", "roles", "", "partnerId", "userGuestId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/AgreementResponse;", "J", "([Lco/bird/android/model/AgreementRole;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;", "", "Lco/bird/android/model/Agreement;", "agreements", "rolesQueried", "I", "(Ljava/util/List;[Lco/bird/android/model/AgreementRole;Ljava/lang/String;Ljava/lang/String;)V", "id", "z", "ids", "A", "role", "Lio/reactivex/p;", "g", "E", "Ltg1;", "f", "([Lco/bird/android/model/AgreementRole;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/p;", "c", "agreementId", "h", "LvE1;", "agreementRequests", "e", "([LvE1;)Lio/reactivex/p;", "Lco/bird/android/model/User;", "user", "b", "Llh6;", C17296a.f69688o, "Llh6;", "userManager", "Lkg6;", "Lkg6;", "userAgreementClient", "LVg6;", "LVg6;", "userGuestClient", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "LEa;", "LEa;", "analyticsManager", "LZ84;", "", "Lco/bird/android/model/AgreementKey;", "Lkotlin/Lazy;", "()LZ84;", "", "needsPreloadAgreement", "La94;", "La94;", "mutableAgreements", "i", "mutableNeedsPreloadAgreement", "LRh6;", "userStream", "<init>", "(Llh6;Lkg6;LVg6;LTq4;LEa;LRh6;)V", "agreements_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nUserAgreementManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,287:1\n1#2:288\n11335#3:289\n11670#3,3:290\n11335#3:293\n11670#3,3:294\n8676#3,2:297\n9358#3,4:299\n1477#4:303\n1502#4,3:304\n1505#4,3:314\n361#5,7:307\n*S KotlinDebug\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl\n*L\n174#1:289\n174#1:290,3\n175#1:293\n175#1:294,3\n204#1:297,2\n204#1:299,4\n205#1:303\n205#1:304,3\n205#1:314,3\n205#1:307,7\n*E\n"})
/* renamed from: yg6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52344yg6 implements InterfaceC44637lg6 {

    /* renamed from: a */
    public final InterfaceC44647lh6 f119977a;

    /* renamed from: b */
    public final InterfaceC44044kg6 f119978b;

    /* renamed from: c */
    public final InterfaceC36587Vg6 f119979c;

    /* renamed from: d */
    public final C36207Tq4 f119980d;

    /* renamed from: e */
    public final InterfaceC1880Ea f119981e;

    /* renamed from: f */
    public final Lazy f119982f;

    /* renamed from: g */
    public final Lazy f119983g;

    /* renamed from: h */
    public final C37791a94<Map<AgreementKey, List<Agreement>>> f119984h;

    /* renamed from: i */
    public final C37791a94<Boolean> f119985i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$a */
    /* loaded from: classes4.dex */
    public static final class C30660a extends Lambda implements Function1<User, Unit> {
        public C30660a() {
            super(1);
        }

        /* renamed from: a */
        public final void m2934a(User user) {
            C52344yg6.this.m2961L();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m2934a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/User;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserAgreementManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$2\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,287:1\n22#2,2:288\n*S KotlinDebug\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$2\n*L\n62#1:288,2\n*E\n"})
    /* renamed from: yg6$b */
    /* loaded from: classes4.dex */
    public static final class C30661b extends Lambda implements Function1<User, InterfaceC23434B<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Balance;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: yg6$b$a */
        /* loaded from: classes4.dex */
        public static final class C30662a extends Lambda implements Function1<Optional<Balance>, Boolean> {

            /* renamed from: g */
            public static final C30662a f119988g = new C30662a();

            public C30662a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Optional<Balance> it) {
                boolean z;
                Boolean autoPayActive;
                Intrinsics.checkNotNullParameter(it, "it");
                Balance m59035e = it.m59035e();
                if (m59035e != null && (autoPayActive = m59035e.getAutoPayActive()) != null) {
                    z = autoPayActive.booleanValue();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$2\n*L\n1#1,304:1\n65#2:305\n*E\n"})
        /* renamed from: yg6$b$b */
        /* loaded from: classes4.dex */
        public static final class C30663b<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
            @Override // io.reactivex.functions.InterfaceC23480c
            public final R apply(T1 t1, T2 t2) {
                boolean z;
                Boolean bool = (Boolean) t2;
                if (!((Boolean) t1).booleanValue() && !bool.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                return (R) Boolean.valueOf(z);
            }
        }

        public C30661b() {
            super(1);
        }

        /* renamed from: c */
        public static final Boolean m2931c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Boolean> invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C24523e c24523e = C24523e.f91168a;
            Observable<Boolean> m82914D2 = C52344yg6.this.f119980d.m82914D2();
            Z84<Optional<Balance>> mo26977K = C52344yg6.this.f119977a.mo26977K();
            final C30662a c30662a = C30662a.f119988g;
            Observable distinctUntilChanged = mo26977K.map(new InterfaceC23492o() { // from class: zg6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m2931c;
                    m2931c = C52344yg6.C30661b.m2931c(Function1.this, obj);
                    return m2931c;
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "userManager.balance.map … }.distinctUntilChanged()");
            Observable combineLatest = Observable.combineLatest(m82914D2, distinctUntilChanged, new C30663b());
            Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
            return combineLatest;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/User;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$c */
    /* loaded from: classes4.dex */
    public static final class C30664c extends Lambda implements Function1<User, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: yg6$c$a */
        /* loaded from: classes4.dex */
        public static final class C30665a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C30665a f119990g = new C30665a();

            public C30665a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while refreshing agreements, ignoring.", new Object[0]);
            }
        }

        public C30664c() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c m32069F = InterfaceC44637lg6.C25760a.refreshAgreements$default(C52344yg6.this, new AgreementRole[]{AgreementRole.RIDER}, null, null, 6, null).m32069F();
            final C30665a c30665a = C30665a.f119990g;
            return m32069F.m33084B(new InterfaceC23484g() { // from class: Ag6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52344yg6.C30664c.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "autoPay", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$d */
    /* loaded from: classes4.dex */
    public static final class C30666d extends Lambda implements Function1<Boolean, InterfaceC23496h> {
        public C30666d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean autoPay) {
            Intrinsics.checkNotNullParameter(autoPay, "autoPay");
            return autoPay.booleanValue() ? InterfaceC44637lg6.C25760a.refreshAgreements$default(C52344yg6.this, new AgreementRole[]{AgreementRole.PRELOAD}, null, null, 6, null).m32069F() : AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/AgreementAcceptResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$e */
    /* loaded from: classes4.dex */
    public static final class C30667e extends Lambda implements Function1<HM4<AgreementAcceptResponse>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f119993h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30667e(String str) {
            super(1);
            this.f119993h = str;
        }

        /* renamed from: a */
        public final void m2927a(HM4<AgreementAcceptResponse> hm4) {
            List listOf;
            if (hm4.m103939f()) {
                InterfaceC1880Ea interfaceC1880Ea = C52344yg6.this.f119981e;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(this.f119993h);
                interfaceC1880Ea.mo55905y(new C44911m81(null, null, null, null, listOf, null, 47, null));
                C52344yg6.this.m2935z(this.f119993h);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<AgreementAcceptResponse> hm4) {
            m2927a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/AgreementKey;", "", "Lco/bird/android/model/Agreement;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$f */
    /* loaded from: classes4.dex */
    public static final class C30668f extends Lambda implements Function0<Z84<Map<AgreementKey, ? extends List<? extends Agreement>>>> {
        public C30668f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Map<AgreementKey, ? extends List<? extends Agreement>>> invoke2() {
            return Z84.f47888d.m73663b(C52344yg6.this.f119984h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/AgreementKey;", "", "Lco/bird/android/model/Agreement;", "currentAgreements", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserAgreementManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$clearAgreement$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n215#2:288\n216#2:292\n766#3:289\n857#3,2:290\n*S KotlinDebug\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$clearAgreement$1\n*L\n218#1:288\n218#1:292\n219#1:289\n219#1:290,2\n*E\n"})
    /* renamed from: yg6$g */
    /* loaded from: classes4.dex */
    public static final class C30669g extends Lambda implements Function1<Map<AgreementKey, ? extends List<? extends Agreement>>, Map<AgreementKey, ? extends List<? extends Agreement>>> {

        /* renamed from: g */
        public final /* synthetic */ String f119995g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30669g(String str) {
            super(1);
            this.f119995g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<AgreementKey, List<Agreement>> invoke(Map<AgreementKey, ? extends List<Agreement>> currentAgreements) {
            Map<AgreementKey, List<Agreement>> mutableMap;
            Intrinsics.checkNotNullParameter(currentAgreements, "currentAgreements");
            mutableMap = MapsKt__MapsKt.toMutableMap(currentAgreements);
            String str = this.f119995g;
            for (Map.Entry<AgreementKey, ? extends List<Agreement>> entry : currentAgreements.entrySet()) {
                AgreementKey key = entry.getKey();
                ArrayList arrayList = new ArrayList();
                for (Object obj : entry.getValue()) {
                    if (!Intrinsics.areEqual(((Agreement) obj).getId(), str)) {
                        arrayList.add(obj);
                    }
                }
                mutableMap.put(key, arrayList);
            }
            return mutableMap;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/AgreementKey;", "", "Lco/bird/android/model/Agreement;", "currentAgreements", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserAgreementManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$clearAgreements$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n215#2:288\n216#2:292\n766#3:289\n857#3,2:290\n*S KotlinDebug\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$clearAgreements$1\n*L\n227#1:288\n227#1:292\n228#1:289\n228#1:290,2\n*E\n"})
    /* renamed from: yg6$h */
    /* loaded from: classes4.dex */
    public static final class C30670h extends Lambda implements Function1<Map<AgreementKey, ? extends List<? extends Agreement>>, Map<AgreementKey, ? extends List<? extends Agreement>>> {

        /* renamed from: g */
        public final /* synthetic */ List<String> f119996g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30670h(List<String> list) {
            super(1);
            this.f119996g = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<AgreementKey, List<Agreement>> invoke(Map<AgreementKey, ? extends List<Agreement>> currentAgreements) {
            Map<AgreementKey, List<Agreement>> mutableMap;
            Intrinsics.checkNotNullParameter(currentAgreements, "currentAgreements");
            mutableMap = MapsKt__MapsKt.toMutableMap(currentAgreements);
            List<String> list = this.f119996g;
            for (Map.Entry<AgreementKey, ? extends List<Agreement>> entry : currentAgreements.entrySet()) {
                AgreementKey key = entry.getKey();
                ArrayList arrayList = new ArrayList();
                for (Object obj : entry.getValue()) {
                    if (!list.contains(((Agreement) obj).getId())) {
                        arrayList.add(obj);
                    }
                }
                mutableMap.put(key, arrayList);
            }
            return mutableMap;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/AgreementResponse;", "it", "", "Lco/bird/android/model/Agreement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$i */
    /* loaded from: classes4.dex */
    public static final class C30671i extends Lambda implements Function1<HM4<AgreementResponse>, List<? extends Agreement>> {

        /* renamed from: g */
        public static final C30671i f119997g = new C30671i();

        public C30671i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<Agreement> invoke(HM4<AgreementResponse> it) {
            List<Agreement> emptyList;
            List<Agreement> agreements;
            Intrinsics.checkNotNullParameter(it, "it");
            AgreementResponse m103944a = it.m103944a();
            if (m103944a == null || (agreements = m103944a.getAgreements()) == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
            return agreements;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/AgreementResponse;", "it", "", "Lco/bird/android/model/Agreement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/AgreementResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$j */
    /* loaded from: classes4.dex */
    public static final class C30672j extends Lambda implements Function1<AgreementResponse, List<? extends Agreement>> {

        /* renamed from: g */
        public static final C30672j f119998g = new C30672j();

        public C30672j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<Agreement> invoke(AgreementResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getAgreements();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u00052:\u0010\u0004\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/Agreement;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/u;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserAgreementManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$getAgreementContent$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n288#2,2:288\n288#2,2:290\n1#3:292\n*S KotlinDebug\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$getAgreementContent$3\n*L\n121#1:288,2\n123#1:290,2\n*E\n"})
    /* renamed from: yg6$k */
    /* loaded from: classes4.dex */
    public static final class C30673k extends Lambda implements Function1<Pair<? extends List<? extends Agreement>, ? extends List<? extends Agreement>>, InterfaceC24574u<? extends Agreement>> {

        /* renamed from: g */
        public final /* synthetic */ AgreementRole f119999g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30673k(AgreementRole agreementRole) {
            super(1);
            this.f119999g = agreementRole;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Agreement> invoke(Pair<? extends List<Agreement>, ? extends List<Agreement>> pair) {
            Agreement agreement;
            Object obj;
            AbstractC24507p m32068G;
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<Agreement> unsignedAgreements = pair.component1();
            List<Agreement> signedAgreements = pair.component2();
            Intrinsics.checkNotNullExpressionValue(unsignedAgreements, "unsignedAgreements");
            AgreementRole agreementRole = this.f119999g;
            Iterator<T> it = unsignedAgreements.iterator();
            while (true) {
                agreement = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Agreement) obj).getRole() == agreementRole) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Agreement agreement2 = (Agreement) obj;
            if (agreement2 == null) {
                Intrinsics.checkNotNullExpressionValue(signedAgreements, "signedAgreements");
                AgreementRole agreementRole2 = this.f119999g;
                Iterator<T> it2 = signedAgreements.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((Agreement) next).getRole() == agreementRole2) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        agreement = next;
                        break;
                    }
                }
                agreement2 = agreement;
            }
            if (agreement2 == null || (m32068G = AbstractC24507p.m32068G(agreement2)) == null) {
                return AbstractC24507p.m32024u();
            }
            return m32068G;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/AgreementAcceptResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserAgreementManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$guestAgree$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,287:1\n11335#2:288\n11670#2,3:289\n*S KotlinDebug\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$guestAgree$1\n*L\n185#1:288\n185#1:289,3\n*E\n"})
    /* renamed from: yg6$l */
    /* loaded from: classes4.dex */
    public static final class C30674l extends Lambda implements Function1<HM4<AgreementAcceptResponse>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C50302vE1[] f120001h;

        /* renamed from: i */
        public final /* synthetic */ List<String> f120002i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30674l(C50302vE1[] c50302vE1Arr, List<String> list) {
            super(1);
            this.f120001h = c50302vE1Arr;
            this.f120002i = list;
        }

        /* renamed from: a */
        public final void m2921a(HM4<AgreementAcceptResponse> hm4) {
            List<String> list;
            if (hm4.m103939f()) {
                InterfaceC1880Ea interfaceC1880Ea = C52344yg6.this.f119981e;
                C50302vE1[] c50302vE1Arr = this.f120001h;
                ArrayList arrayList = new ArrayList(c50302vE1Arr.length);
                for (C50302vE1 c50302vE1 : c50302vE1Arr) {
                    arrayList.add(c50302vE1.m8999b());
                }
                interfaceC1880Ea.mo55905y(new C44911m81(null, null, null, null, arrayList, null, 47, null));
                C52344yg6 c52344yg6 = C52344yg6.this;
                AgreementAcceptResponse m103944a = hm4.m103944a();
                if (m103944a == null || (list = m103944a.getAgreementIds()) == null) {
                    list = this.f120002i;
                }
                c52344yg6.m2972A(list);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<AgreementAcceptResponse> hm4) {
            m2921a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/AgreementResponse;", "it", "", C17296a.f69688o, "(LHM4;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$m */
    /* loaded from: classes4.dex */
    public static final class C30675m extends Lambda implements Function1<HM4<AgreementResponse>, Boolean> {

        /* renamed from: g */
        public static final C30675m f120003g = new C30675m();

        public C30675m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(HM4<AgreementResponse> it) {
            List<Agreement> agreements;
            Intrinsics.checkNotNullParameter(it, "it");
            AgreementResponse m103944a = it.m103944a();
            boolean z = false;
            if (m103944a != null && (agreements = m103944a.getAgreements()) != null && !agreements.isEmpty()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/AgreementResponse;", "it", "Lco/bird/android/model/AgreementRole;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lco/bird/android/model/AgreementRole;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$n */
    /* loaded from: classes4.dex */
    public static final class C30676n extends Lambda implements Function1<HM4<AgreementResponse>, AgreementRole> {

        /* renamed from: g */
        public final /* synthetic */ AgreementRole f120004g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30676n(AgreementRole agreementRole) {
            super(1);
            this.f120004g = agreementRole;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AgreementRole invoke(HM4<AgreementResponse> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f120004g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/AgreementKey;", "", "Lco/bird/android/model/Agreement;", "oldAgreements", "newAgreements", C17296a.f69688o, "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$o */
    /* loaded from: classes4.dex */
    public static final class C30677o extends Lambda implements Function2<Map<AgreementKey, ? extends List<? extends Agreement>>, Map<AgreementKey, ? extends List<? extends Agreement>>, Map<AgreementKey, ? extends List<? extends Agreement>>> {

        /* renamed from: g */
        public static final C30677o f120005g = new C30677o();

        public C30677o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Map<AgreementKey, List<Agreement>> invoke(Map<AgreementKey, ? extends List<Agreement>> oldAgreements, Map<AgreementKey, ? extends List<Agreement>> newAgreements) {
            Map<AgreementKey, List<Agreement>> plus;
            Intrinsics.checkNotNullParameter(oldAgreements, "oldAgreements");
            Intrinsics.checkNotNullParameter(newAgreements, "newAgreements");
            plus = MapsKt__MapsKt.plus(oldAgreements, newAgreements);
            return plus;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$p */
    /* loaded from: classes4.dex */
    public static final class C30678p extends Lambda implements Function0<Z84<Boolean>> {
        public C30678p() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Boolean> invoke() {
            return Z84.f47888d.m73663b(C52344yg6.this.f119985i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/AgreementResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yg6$q */
    /* loaded from: classes4.dex */
    public static final class C30679q extends Lambda implements Function1<HM4<AgreementResponse>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ AgreementRole[] f120008h;

        /* renamed from: i */
        public final /* synthetic */ String f120009i;

        /* renamed from: j */
        public final /* synthetic */ String f120010j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30679q(AgreementRole[] agreementRoleArr, String str, String str2) {
            super(1);
            this.f120008h = agreementRoleArr;
            this.f120009i = str;
            this.f120010j = str2;
        }

        /* renamed from: a */
        public final void m2917a(HM4<AgreementResponse> hm4) {
            List<Agreement> emptyList;
            if (hm4.m103939f()) {
                C52344yg6 c52344yg6 = C52344yg6.this;
                AgreementResponse m103944a = hm4.m103944a();
                if (m103944a == null || (emptyList = m103944a.getAgreements()) == null) {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                c52344yg6.m2964I(emptyList, this.f120008h, this.f120009i, this.f120010j);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<AgreementResponse> hm4) {
            m2917a(hm4);
            return Unit.INSTANCE;
        }
    }

    public C52344yg6(InterfaceC44647lh6 userManager, InterfaceC44044kg6 userAgreementClient, InterfaceC36587Vg6 userGuestClient, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC35660Rh6 userStream) {
        Lazy lazy;
        Lazy lazy2;
        Map emptyMap;
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userAgreementClient, "userAgreementClient");
        Intrinsics.checkNotNullParameter(userGuestClient, "userGuestClient");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f119977a = userManager;
        this.f119978b = userAgreementClient;
        this.f119979c = userGuestClient;
        this.f119980d = reactiveConfig;
        this.f119981e = analyticsManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C30668f());
        this.f119982f = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C30678p());
        this.f119983g = lazy2;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f119984h = c10586a.m71835a(emptyMap, C30677o.f120005g);
        C37791a94<Boolean> create$default = C37791a94.C10586a.create$default(c10586a, Boolean.FALSE, null, 2, null);
        this.f119985i = create$default;
        m2961L();
        Observable<User> mo76576i = userStream.mo76576i();
        final C30660a c30660a = new C30660a();
        mo76576i.subscribe(new InterfaceC23484g() { // from class: mg6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52344yg6.m2940u(Function1.this, obj);
            }
        });
        Observable<User> mo76582c = userStream.mo76582c();
        final C30661b c30661b = new C30661b();
        mo76582c.switchMap(new InterfaceC23492o() { // from class: pg6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m2939v;
                m2939v = C52344yg6.m2939v(Function1.this, obj);
                return m2939v;
            }
        }).subscribe(create$default);
        Observable<User> mo76582c2 = userStream.mo76582c();
        final C30664c c30664c = new C30664c();
        mo76582c2.switchMapCompletable(new InterfaceC23492o() { // from class: qg6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m2938w;
                m2938w = C52344yg6.m2938w(Function1.this, obj);
                return m2938w;
            }
        }).subscribe();
        Z84<Boolean> mo2960a = mo2960a();
        final C30666d c30666d = new C30666d();
        mo2960a.flatMapCompletable(new InterfaceC23492o() { // from class: rg6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m2937x;
                m2937x = C52344yg6.m2937x(Function1.this, obj);
                return m2937x;
            }
        }).m33069Q().subscribe();
    }

    /* renamed from: B */
    public static final List m2971B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final List m2970C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC24574u m2969D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m2967F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final boolean m2966G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: H */
    public static final AgreementRole m2965H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (AgreementRole) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m2962K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m2940u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23434B m2939v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23496h m2938w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23496h m2937x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m2936y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final void m2972A(List<String> list) {
        this.f119984h.m71837i(new C30670h(list));
    }

    /* renamed from: E */
    public AbstractC23442F<AgreementResponse> m2968E() {
        return this.f119978b.m28647b();
    }

    /* renamed from: I */
    public final void m2964I(List<Agreement> list, AgreementRole[] agreementRoleArr, String str, String str2) {
        int mapCapacity;
        int coerceAtLeast;
        Map<AgreementKey, List<Agreement>> plus;
        String str3;
        List emptyList;
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(agreementRoleArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (AgreementRole agreementRole : agreementRoleArr) {
            AgreementKey agreementKey = new AgreementKey(agreementRole, str, str2);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            Pair m28425to = TuplesKt.m28425to(agreementKey, emptyList);
            linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : list) {
            Agreement agreement = (Agreement) obj;
            InterfaceC1880Ea interfaceC1880Ea = this.f119981e;
            String id = agreement.getId();
            AgreementRole role = agreement.getRole();
            if (role != null) {
                str3 = role.name();
            } else {
                str3 = null;
            }
            interfaceC1880Ea.mo55905y(new C45504n81(null, null, null, null, id, str3, 15, null));
            AgreementRole role2 = agreement.getRole();
            if (role2 == null) {
                role2 = AgreementRole.UNKNOWN;
            }
            AgreementKey agreementKey2 = new AgreementKey(role2, str, str2);
            Object obj2 = linkedHashMap2.get(agreementKey2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(agreementKey2, obj2);
            }
            ((List) obj2).add(obj);
        }
        plus = MapsKt__MapsKt.plus(linkedHashMap, linkedHashMap2);
        this.f119984h.accept(plus);
    }

    /* renamed from: J */
    public final AbstractC23442F<HM4<AgreementResponse>> m2963J(AgreementRole[] agreementRoleArr, String str, String str2) {
        AbstractC23442F<HM4<AgreementResponse>> mo2958c = mo2958c((AgreementRole[]) Arrays.copyOf(agreementRoleArr, agreementRoleArr.length), str, str2);
        final C30679q c30679q = new C30679q(agreementRoleArr, str, str2);
        AbstractC23442F<HM4<AgreementResponse>> m33101w = mo2958c.m33101w(new InterfaceC23484g() { // from class: vg6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52344yg6.m2962K(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun refreshAgree…Id)\n        }\n      }\n  }");
        return m33101w;
    }

    /* renamed from: L */
    public final void m2961L() {
        this.f119984h.m71836j();
        this.f119985i.m71836j();
    }

    @Override // p000.InterfaceC44637lg6
    /* renamed from: a */
    public Z84<Boolean> mo2960a() {
        return (Z84) this.f119983g.getValue();
    }

    @Override // p000.InterfaceC44637lg6
    @Deprecated(message = "Use refreshAgreements() and react to agreements instead. This swallows HTTP errors and simply returns Maybe.empty() in the event of one.")
    /* renamed from: b */
    public AbstractC24507p<AgreementRole> mo2959b(User user, String str) {
        Intrinsics.checkNotNullParameter(user, "user");
        AgreementRole m113687a = C31907Bg6.m113687a(user);
        AbstractC23442F<HM4<AgreementResponse>> m2963J = m2963J(new AgreementRole[]{m113687a}, str, null);
        final C30675m c30675m = C30675m.f120003g;
        AbstractC24507p<HM4<AgreementResponse>> m33098z = m2963J.m33098z(new InterfaceC23494q() { // from class: wg6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m2966G;
                m2966G = C52344yg6.m2966G(Function1.this, obj);
                return m2966G;
            }
        });
        final C30676n c30676n = new C30676n(m113687a);
        AbstractC24507p m32067H = m33098z.m32067H(new InterfaceC23492o() { // from class: xg6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                AgreementRole m2965H;
                m2965H = C52344yg6.m2965H(Function1.this, obj);
                return m2965H;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32067H, "agreementRole = user.agr…   .map { agreementRole }");
        return m32067H;
    }

    @Override // p000.InterfaceC44637lg6
    /* renamed from: c */
    public AbstractC23442F<HM4<AgreementResponse>> mo2958c(AgreementRole[] roles, String str, String str2) {
        AbstractC23442F<HM4<AgreementResponse>> abstractC23442F;
        Intrinsics.checkNotNullParameter(roles, "roles");
        if (str2 != null) {
            abstractC23442F = InterfaceC36587Vg6.C8722a.getGuestDisplayAgreement$default(this.f119979c, C31907Bg6.m113686b(roles), str, str2, null, 8, null).m33142Y(C24542a.m31932c());
        } else {
            abstractC23442F = null;
        }
        if (abstractC23442F == null) {
            AbstractC23442F<HM4<AgreementResponse>> m33142Y = this.f119978b.m28648a(C31907Bg6.m113686b(roles), str).m33142Y(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33142Y, "userAgreementClient.getD…scribeOn(Schedulers.io())");
            return m33142Y;
        }
        return abstractC23442F;
    }

    @Override // p000.InterfaceC44637lg6
    /* renamed from: d */
    public Z84<Map<AgreementKey, List<Agreement>>> mo2957d() {
        return (Z84) this.f119982f.getValue();
    }

    @Override // p000.InterfaceC44637lg6
    /* renamed from: e */
    public AbstractC24507p<C49375tg1> mo2956e(C50302vE1... agreementRequests) {
        boolean z;
        C50302vE1[] c50302vE1Arr;
        Intrinsics.checkNotNullParameter(agreementRequests, "agreementRequests");
        if (agreementRequests.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            c50302vE1Arr = agreementRequests;
        } else {
            c50302vE1Arr = null;
        }
        if (c50302vE1Arr == null) {
            AbstractC24507p<C49375tg1> m32023v = AbstractC24507p.m32023v(new IllegalArgumentException("Cannot pass an empty list of agreements"));
            Intrinsics.checkNotNullExpressionValue(m32023v, "error(IllegalArgumentExc…pty list of agreements\"))");
            return m32023v;
        }
        ArrayList arrayList = new ArrayList(c50302vE1Arr.length);
        for (C50302vE1 c50302vE1 : c50302vE1Arr) {
            arrayList.add(c50302vE1.m8999b());
        }
        ArrayList arrayList2 = new ArrayList(c50302vE1Arr.length);
        for (C50302vE1 c50302vE12 : c50302vE1Arr) {
            arrayList2.add(new WireUserGuest(c50302vE12.m8997d(), c50302vE12.m8998c(), null, false, 12, null));
        }
        AbstractC23442F<HM4<AgreementAcceptResponse>> m33142Y = this.f119979c.m79574b(new AgreementAgreeBody(arrayList, arrayList2)).m33142Y(C24542a.m31932c());
        final C30674l c30674l = new C30674l(agreementRequests, arrayList);
        AbstractC23442F<HM4<AgreementAcceptResponse>> m33101w = m33142Y.m33101w(new InterfaceC23484g() { // from class: ng6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52344yg6.m2967F(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun guestAgree(…pMaybeErrorResponse()\n  }");
        return NM4.m94019b(m33101w);
    }

    @Override // p000.InterfaceC44637lg6
    /* renamed from: f */
    public AbstractC24507p<C49375tg1> mo2955f(AgreementRole[] roles, String str, String str2) {
        Intrinsics.checkNotNullParameter(roles, "roles");
        return NM4.m94019b(m2963J((AgreementRole[]) Arrays.copyOf(roles, roles.length), str, str2));
    }

    @Override // p000.InterfaceC44637lg6
    /* renamed from: g */
    public AbstractC24507p<Agreement> mo2954g(AgreementRole role, String str, String str2) {
        Intrinsics.checkNotNullParameter(role, "role");
        C24530g c24530g = C24530g.f91174a;
        AbstractC23442F<HM4<AgreementResponse>> m2963J = m2963J(new AgreementRole[]{role}, str, str2);
        final C30671i c30671i = C30671i.f119997g;
        InterfaceC23447K m33157I = m2963J.m33157I(new InterfaceC23492o() { // from class: sg6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m2971B;
                m2971B = C52344yg6.m2971B(Function1.this, obj);
                return m2971B;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "refreshAgreementsInterna… ?: emptyList()\n        }");
        AbstractC23442F<AgreementResponse> m2968E = m2968E();
        final C30672j c30672j = C30672j.f119998g;
        InterfaceC23447K m33157I2 = m2968E.m33157I(new InterfaceC23492o() { // from class: tg6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m2970C;
                m2970C = C52344yg6.m2970C(Function1.this, obj);
                return m2970C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I2, "getSignedAgreements().ma…    it.agreements\n      }");
        AbstractC23442F m31946a = c24530g.m31946a(m33157I, m33157I2);
        final C30673k c30673k = new C30673k(role);
        AbstractC24507p<Agreement> m33163C = m31946a.m33163C(new InterfaceC23492o() { // from class: ug6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m2969D;
                m2969D = C52344yg6.m2969D(Function1.this, obj);
                return m2969D;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "role: AgreementRole,\n   … } ?: Maybe.empty()\n    }");
        return m33163C;
    }

    @Override // p000.InterfaceC44637lg6
    /* renamed from: h */
    public AbstractC24507p<C49375tg1> mo2953h(String agreementId) {
        List listOf;
        Intrinsics.checkNotNullParameter(agreementId, "agreementId");
        InterfaceC44044kg6 interfaceC44044kg6 = this.f119978b;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(agreementId);
        AbstractC23442F<HM4<AgreementAcceptResponse>> m33142Y = interfaceC44044kg6.m28646c(new AgreementAgreeBody(listOf, null, 2, null)).m33142Y(C24542a.m31932c());
        final C30667e c30667e = new C30667e(agreementId);
        AbstractC23442F<HM4<AgreementAcceptResponse>> m33101w = m33142Y.m33101w(new InterfaceC23484g() { // from class: og6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52344yg6.m2936y(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun agree(agree…pMaybeErrorResponse()\n  }");
        return NM4.m94019b(m33101w);
    }

    /* renamed from: z */
    public final void m2935z(String str) {
        this.f119984h.m71837i(new C30669g(str));
    }
}
