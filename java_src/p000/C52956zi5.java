package p000;

import co.bird.android.model.persistence.BirdPlusView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BI\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b4\u00105J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, m28432d2 = {"Lzi5;", "Lf1;", "LAi5;", "LDi5;", "", Stripe3ds2AuthParams.FIELD_SOURCE, "", "K", "renderer", "x", "Le13;", "e", "Le13;", "J", "()Le13;", "navigator", "LEa;", "f", "LEa;", "analyticsManager", "LJQ;", "g", "LJQ;", "birdPlusManager", "Lgd3;", "h", "Lgd3;", "notificationStateManager", "LVM3;", "i", "LVM3;", "paymentManagerV3", "LWU4;", "j", "LWU4;", "ridePassManager", "Lgl;", "k", "Lgl;", "preference", "LTq4;", "l", "LTq4;", "reactiveConfig", "La94;", "", "m", "La94;", "birdPlusEnabledRelay", "n", "Ljava/lang/String;", "entryPoint", "<init>", "(Le13;LEa;LJQ;Lgd3;LVM3;LWU4;Lgl;LTq4;)V", "save-money_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSaveMoneyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveMoneyPresenter.kt\nco/bird/android/feature/savemoney/SaveMoneyPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,136:1\n237#2:137\n237#2:138\n237#2:139\n180#2:142\n180#2:145\n180#2:146\n52#3,2:140\n71#3,2:143\n*S KotlinDebug\n*F\n+ 1 SaveMoneyPresenter.kt\nco/bird/android/feature/savemoney/SaveMoneyPresenter\n*L\n53#1:137\n61#1:138\n69#1:139\n82#1:142\n115#1:145\n120#1:146\n75#1:140,2\n85#1:143,2\n*E\n"})
/* renamed from: zi5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52956zi5 extends AbstractC20169f1<InterfaceC31690Ai5, InterfaceC32392Di5> {

    /* renamed from: e */
    public final InterfaceC40099e13 f122090e;

    /* renamed from: f */
    public final InterfaceC1880Ea f122091f;

    /* renamed from: g */
    public final InterfaceC4077JQ f122092g;

    /* renamed from: h */
    public final InterfaceC41639gd3 f122093h;

    /* renamed from: i */
    public final VM3 f122094i;

    /* renamed from: j */
    public final WU4 f122095j;

    /* renamed from: k */
    public final C22454gl f122096k;

    /* renamed from: l */
    public final C36207Tq4 f122097l;

    /* renamed from: m */
    public final C37791a94<Boolean> f122098m;

    /* renamed from: n */
    public String f122099n;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: zi5$a */
    /* loaded from: classes3.dex */
    public static final class C31481a<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C31481a<T1, T2, R> f122100a = new C31481a<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$3\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: zi5$b */
    /* loaded from: classes3.dex */
    public static final class C31482b<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C31482b<T1, T2, T3, T4, R> f122101a = new C31482b<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042n\u0010\u0003\u001aj\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*4\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lwb4;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSaveMoneyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveMoneyPresenter.kt\nco/bird/android/feature/savemoney/SaveMoneyPresenter$consume$10\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1549#2:137\n1620#2,3:138\n*S KotlinDebug\n*F\n+ 1 SaveMoneyPresenter.kt\nco/bird/android/feature/savemoney/SaveMoneyPresenter$consume$10\n*L\n112#1:137\n112#1:138,3\n*E\n"})
    /* renamed from: zi5$c */
    /* loaded from: classes3.dex */
    public static final class C31483c extends Lambda implements Function1<C51106wb4<? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Boolean>, Unit> {
        public C31483c() {
            super(1);
        }

        /* renamed from: a */
        public final void m490a(C51106wb4<Boolean, Boolean, Boolean, Boolean> c51106wb4) {
            EnumC42284hi5 enumC42284hi5;
            EnumC42284hi5 enumC42284hi52;
            EnumC42284hi5 enumC42284hi53;
            List listOfNotNull;
            int collectionSizeOrDefault;
            Boolean birdPlusEnabled = c51106wb4.m6614a();
            boolean booleanValue = c51106wb4.m6613b().booleanValue();
            Boolean reloadEnabled = c51106wb4.m6612c();
            Boolean m6611d = c51106wb4.m6611d();
            EnumC42284hi5[] enumC42284hi5Arr = new EnumC42284hi5[5];
            Intrinsics.checkNotNullExpressionValue(birdPlusEnabled, "birdPlusEnabled");
            EnumC42284hi5 enumC42284hi54 = null;
            if (birdPlusEnabled.booleanValue()) {
                enumC42284hi5 = EnumC42284hi5.f85703g;
            } else {
                enumC42284hi5 = null;
            }
            enumC42284hi5Arr[0] = enumC42284hi5;
            if (booleanValue) {
                enumC42284hi52 = EnumC42284hi5.f85704h;
            } else {
                enumC42284hi52 = null;
            }
            enumC42284hi5Arr[1] = enumC42284hi52;
            enumC42284hi5Arr[2] = EnumC42284hi5.f85705i;
            Intrinsics.checkNotNullExpressionValue(reloadEnabled, "reloadEnabled");
            if (reloadEnabled.booleanValue()) {
                enumC42284hi53 = EnumC42284hi5.f85706j;
            } else {
                enumC42284hi53 = null;
            }
            enumC42284hi5Arr[3] = enumC42284hi53;
            if (!m6611d.booleanValue()) {
                enumC42284hi54 = EnumC42284hi5.f85707k;
            }
            enumC42284hi5Arr[4] = enumC42284hi54;
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) enumC42284hi5Arr);
            C52956zi5.this.m42280h(new C49967ug0(listOfNotNull));
            InterfaceC1880Ea interfaceC1880Ea = C52956zi5.this.f122091f;
            String str = C52956zi5.this.f122099n;
            List<EnumC42284hi5> list = listOfNotNull;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (EnumC42284hi5 enumC42284hi55 : list) {
                String lowerCase = enumC42284hi55.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                arrayList.add(lowerCase);
            }
            interfaceC1880Ea.mo55905y(new C31924Bi5(null, null, null, str, arrayList.toString(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Boolean> c51106wb4) {
            m490a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lhi5;", "kotlin.jvm.PlatformType", "cardClicked", "", C17296a.f69688o, "(Lhi5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zi5$d */
    /* loaded from: classes3.dex */
    public static final class C31484d extends Lambda implements Function1<EnumC42284hi5, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: zi5$d$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C31485a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC42284hi5.values().length];
                try {
                    iArr[EnumC42284hi5.f85703g.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC42284hi5.f85704h.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC42284hi5.f85705i.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC42284hi5.f85706j.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC42284hi5.f85707k.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C31484d() {
            super(1);
        }

        /* renamed from: a */
        public final void m489a(EnumC42284hi5 enumC42284hi5) {
            InterfaceC1880Ea interfaceC1880Ea = C52956zi5.this.f122091f;
            String lowerCase = enumC42284hi5.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            interfaceC1880Ea.mo55905y(new C41691gi5(null, null, null, lowerCase, 7, null));
            int i = C31485a.$EnumSwitchMapping$0[enumC42284hi5.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                C52956zi5.this.m508J().mo36945s4();
                                return;
                            }
                            return;
                        }
                        InterfaceC40099e13.C19924a.goToPreloadV2OptionsSelection$default(C52956zi5.this.m508J(), false, false, null, "save_money", 6, null);
                        return;
                    }
                    C52956zi5.this.m508J().mo37099R3();
                    return;
                }
                InterfaceC40099e13.C19924a.goToRidePassV4$default(C52956zi5.this.m508J(), null, 1, null);
                return;
            }
            InterfaceC40099e13.C19924a.goToBirdPlus$default(C52956zi5.this.m508J(), null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC42284hi5 enumC42284hi5) {
            m489a(enumC42284hi5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zi5$e */
    /* loaded from: classes3.dex */
    public static final class C31486e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C31486e f122104g = new C31486e();

        public C31486e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error caught when refreshing bird plus (birdPlusManager).", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zi5$f */
    /* loaded from: classes3.dex */
    public static final class C31487f extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C31487f f122105g = new C31487f();

        public C31487f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error caught when refreshing ride pass (ridePassManager).", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zi5$g */
    /* loaded from: classes3.dex */
    public static final class C31488g extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C31488g f122106g = new C31488g();

        public C31488g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error caught when refreshing reload v2 configs (paymentManagerV3).", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Lco/bird/android/model/persistence/BirdPlusView;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zi5$h */
    /* loaded from: classes3.dex */
    public static final class C31489h extends Lambda implements Function1<List<? extends BirdPlusView>, Boolean> {

        /* renamed from: g */
        public static final C31489h f122107g = new C31489h();

        public C31489h() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<BirdPlusView> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends BirdPlusView> list) {
            return invoke2((List<BirdPlusView>) list);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zi5$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C31491j extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C31491j(Object obj) {
            super(1, obj, C37791a94.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((C37791a94) this.receiver).accept(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52956zi5(InterfaceC40099e13 navigator, InterfaceC1880Ea analyticsManager, InterfaceC4077JQ birdPlusManager, InterfaceC41639gd3 notificationStateManager, VM3 paymentManagerV3, WU4 ridePassManager, C22454gl preference, C36207Tq4 reactiveConfig) {
        super(C45445n22.f99261a);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdPlusManager, "birdPlusManager");
        Intrinsics.checkNotNullParameter(notificationStateManager, "notificationStateManager");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(ridePassManager, "ridePassManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f122090e = navigator;
        this.f122091f = analyticsManager;
        this.f122092g = birdPlusManager;
        this.f122093h = notificationStateManager;
        this.f122094i = paymentManagerV3;
        this.f122095j = ridePassManager;
        this.f122096k = preference;
        this.f122097l = reactiveConfig;
        this.f122098m = C37791a94.C10586a.create$default(C37791a94.f49908h, Boolean.FALSE, null, 2, null);
        this.f122099n = "null";
    }

    /* renamed from: A */
    public static final void m517A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m516B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m515C() {
    }

    /* renamed from: D */
    public static final void m514D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m513E() {
    }

    /* renamed from: F */
    public static final void m512F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final Boolean m511G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final Boolean m510H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m509I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m494y() {
    }

    /* renamed from: z */
    public static final void m493z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public final InterfaceC40099e13 m508J() {
        return this.f122090e;
    }

    /* renamed from: K */
    public final void m507K(String str) {
        if (str != null) {
            this.f122099n = str;
        }
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: x */
    public void consume(InterfaceC31690Ai5 renderer) {
        List listOf;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(EnumC42284hi5.f85705i);
        m42280h(new C49967ug0(listOf));
        this.f122093h.mo30187a(m42278j());
        AbstractC23461c m33065U = this.f122092g.refresh().m33065U(2L);
        Intrinsics.checkNotNullExpressionValue(m33065U, "birdPlusManager.refresh()\n      .retry(2)");
        Object m33041n = m33065U.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: oi5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C52956zi5.m494y();
            }
        };
        final C31486e c31486e = C31486e.f122104g;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: ri5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52956zi5.m516B(Function1.this, obj);
            }
        });
        AbstractC23461c m33065U2 = this.f122095j.refresh().m33065U(2L);
        Intrinsics.checkNotNullExpressionValue(m33065U2, "ridePassManager.refresh()\n      .retry(2)");
        Object m33041n2 = m33065U2.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a2 = new InterfaceC23478a() { // from class: si5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C52956zi5.m515C();
            }
        };
        final C31487f c31487f = C31487f.f122105g;
        ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a2, new InterfaceC23484g() { // from class: ti5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52956zi5.m514D(Function1.this, obj);
            }
        });
        AbstractC23461c m33065U3 = this.f122094i.mo25779A().m33065U(2L);
        Intrinsics.checkNotNullExpressionValue(m33065U3, "paymentManagerV3.refresh…Configs()\n      .retry(2)");
        Object m33041n3 = m33065U3.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a3 = new InterfaceC23478a() { // from class: ui5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C52956zi5.m513E();
            }
        };
        final C31488g c31488g = C31488g.f122106g;
        ((CompletableSubscribeProxy) m33041n3).mo45217e(interfaceC23478a3, new InterfaceC23484g() { // from class: vi5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52956zi5.m512F(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<Boolean> m82874H2 = this.f122097l.m82874H2();
        Z84<List<BirdPlusView>> mo90339b0 = this.f122092g.mo90339b0();
        final C31489h c31489h = C31489h.f122107g;
        InterfaceC23434B map = mo90339b0.map(new InterfaceC23492o() { // from class: wi5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m511G;
                m511G = C52956zi5.m511G(Function1.this, obj);
                return m511G;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "birdPlusManager.birdPlus…s.map { it.isNotEmpty() }");
        Observable combineLatest = Observable.combineLatest(m82874H2, map, C31481a.f122100a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C31490i c31490i = C31490i.f122108g;
        Observable map2 = combineLatest.map(new InterfaceC23492o() { // from class: xi5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m510H;
                m510H = C52956zi5.m510H(Function1.this, obj);
                return m510H;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "Observables.combineLates… hasBirdPlusViews\n      }");
        Object m33094as = map2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31491j c31491j = new C31491j(this.f122098m);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: yi5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52956zi5.m509I(Function1.this, obj);
            }
        });
        Observable<Boolean> distinctUntilChanged = this.f122098m.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "birdPlusEnabledRelay.distinctUntilChanged()");
        Observable<Boolean> enabled = this.f122095j.enabled();
        Observable<Boolean> m33123k0 = this.f122094i.mo25710x().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "paymentManagerV3.preloadV2Enabled().toObservable()");
        Observable<Boolean> distinctUntilChanged2 = this.f122093h.mo30186b().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "notificationStateManager…().distinctUntilChanged()");
        Observable combineLatest2 = Observable.combineLatest(distinctUntilChanged, enabled, m33123k0, distinctUntilChanged2, C31482b.f122101a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…> Quad(t1, t2, t3, t4) })");
        final C31483c c31483c = new C31483c();
        Observable doOnNext = combineLatest2.doOnNext(new InterfaceC23484g() { // from class: pi5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52956zi5.m493z(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun consume(ren…s()\n        }\n      }\n  }");
        Object m33094as2 = doOnNext.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        Observable<EnumC42284hi5> observeOn = renderer.mo56992R5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "renderer.cardClicks()\n  …dSchedulers.mainThread())");
        Object m33094as3 = observeOn.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31484d c31484d = new C31484d();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: qi5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52956zi5.m517A(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zi5$i */
    /* loaded from: classes3.dex */
    public static final class C31490i extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C31490i f122108g = new C31490i();

        public C31490i() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, Boolean> pair) {
            boolean z;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            boolean booleanValue = pair.component1().booleanValue();
            Boolean hasBirdPlusViews = pair.component2();
            if (booleanValue) {
                Intrinsics.checkNotNullExpressionValue(hasBirdPlusViews, "hasBirdPlusViews");
                if (hasBirdPlusViews.booleanValue()) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            return invoke2((Pair<Boolean, Boolean>) pair);
        }
    }
}
