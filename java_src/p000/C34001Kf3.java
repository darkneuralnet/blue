package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.PillButtonConfig;
import co.bird.android.model.wire.configs.RentalConfig;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.subjects.C24558d;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34001Kf3;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\bD\u0010EJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bHÆ\u0001J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020\u001fHÖ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003J\b\u0010$\u001a\u00020\u0005H\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R.\u0010\u0006\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00050\u0005048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R!\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b7\u0010;\u001a\u0004\b<\u0010=R!\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b*\u0010=R!\u0010A\u001a\b\u0012\u0004\u0012\u00020\n0\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\b(\u0010=R!\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\b&\u0010=¨\u0006F"}, m28432d2 = {"LKf3;", "LMT3;", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/configs/PillButtonConfig;", "pillButtonConfig", "", "pillClickSubject", "", "k", C17296a.f69688o, "", "experimentName", "q", "LTq4;", "reactiveConfig", "LEa;", "analyticsManager", "Lqi1;", "experimentManager", "LCx4;", "rentalManager", "Le13;", "navigator", "Lgl;", "preferences", "LaM;", "birdManager", "Ldr4;", "locationManager", "i", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "n", "LTq4;", "b", "LEa;", "c", "Lqi1;", DateTokenConverter.CONVERTER_KEY, "LCx4;", "e", "Le13;", "f", "Lgl;", "g", "LaM;", "h", "Ldr4;", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "j", "()Lio/reactivex/subjects/d;", "getPillClickSubject$annotations", "()V", "Lkotlin/Lazy;", "getVisibility", "()Lio/reactivex/Observable;", "visibility", "mainText", "l", "secondaryText", "m", "secondaryTextVisibility", "<init>", "(LTq4;LEa;Lqi1;LCx4;Le13;Lgl;LaM;Ldr4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPillConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillConfiguration.kt\nco/bird/android/app/feature/pill/internal/OnDemandPillConfiguration\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,134:1\n237#2:135\n199#2:136\n*S KotlinDebug\n*F\n+ 1 PillConfiguration.kt\nco/bird/android/app/feature/pill/internal/OnDemandPillConfiguration\n*L\n114#1:135\n130#1:136\n*E\n"})
/* renamed from: Kf3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34001Kf3 implements MT3 {

    /* renamed from: a */
    public final C36207Tq4 f19974a;

    /* renamed from: b */
    public final InterfaceC1880Ea f19975b;

    /* renamed from: c */
    public final InterfaceC47617qi1 f19976c;

    /* renamed from: d */
    public final InterfaceC32292Cx4 f19977d;

    /* renamed from: e */
    public final InterfaceC40099e13 f19978e;

    /* renamed from: f */
    public final C22454gl f19979f;

    /* renamed from: g */
    public final InterfaceC10636aM f19980g;

    /* renamed from: h */
    public final InterfaceC40001dr4 f19981h;

    /* renamed from: i */
    public final C24558d<Unit> f19982i;

    /* renamed from: j */
    public final Lazy f19983j;

    /* renamed from: k */
    public final Lazy f19984k;

    /* renamed from: l */
    public final Lazy f19985l;

    /* renamed from: m */
    public final Lazy f19986m;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/configs/PillButtonConfig;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kf3$a */
    /* loaded from: classes2.dex */
    public static final class C4519a extends Lambda implements Function1<Unit, InterfaceC23434B<? extends PillButtonConfig>> {

        /* renamed from: g */
        public final /* synthetic */ Observable<PillButtonConfig> f19987g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4519a(Observable<PillButtonConfig> observable) {
            super(1);
            this.f19987g = observable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends PillButtonConfig> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f19987g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/PillButtonConfig;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/PillButtonConfig;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kf3$b */
    /* loaded from: classes2.dex */
    public static final class C4520b extends Lambda implements Function1<PillButtonConfig, Boolean> {
        public C4520b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(PillButtonConfig it) {
            boolean m37710L0;
            Intrinsics.checkNotNullParameter(it, "it");
            String experimentName = it.getExperimentName();
            if (experimentName == null) {
                m37710L0 = false;
            } else {
                m37710L0 = C34001Kf3.this.f19979f.m37710L0(experimentName);
            }
            return Boolean.valueOf(m37710L0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kf3$c */
    /* loaded from: classes2.dex */
    public static final class C4521c extends Lambda implements Function0<Observable<String>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kf3$c$a */
        /* loaded from: classes2.dex */
        public static final class C4522a extends Lambda implements Function1<Config, String> {

            /* renamed from: g */
            public static final C4522a f19990g = new C4522a();

            public C4522a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(Config it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String preorderText = it.getRentalConfigs().getOnDemandConfig().getPillConfig().getPreorderText();
                if (preorderText == null) {
                    return "";
                }
                return preorderText;
            }
        }

        public C4521c() {
            super(0);
        }

        /* renamed from: c */
        public static final String m98603c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            Z84<Config> m82623f8 = C34001Kf3.this.f19974a.m82623f8();
            final C4522a c4522a = C4522a.f19990g;
            return m82623f8.map(new InterfaceC23492o() { // from class: Lf3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m98603c;
                    m98603c = C34001Kf3.C4521c.m98603c(Function1.this, obj);
                    return m98603c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "f", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kf3$d */
    /* loaded from: classes2.dex */
    public static final class C4523d extends Lambda implements Function0<Observable<String>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kf3$d$a */
        /* loaded from: classes2.dex */
        public static final class C4524a extends Lambda implements Function1<Optional<RentalPlan>, Boolean> {

            /* renamed from: g */
            public static final C4524a f19992g = new C4524a();

            public C4524a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Optional<RentalPlan> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.m59037c());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kf3$d$b */
        /* loaded from: classes2.dex */
        public static final class C4525b extends Lambda implements Function1<Optional<RentalPlan>, Integer> {

            /* renamed from: g */
            public static final C4525b f19993g = new C4525b();

            public C4525b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Integer invoke(Optional<RentalPlan> it) {
                int i;
                Integer shortestOnDemandEstimate;
                Intrinsics.checkNotNullParameter(it, "it");
                RentalPlan m59035e = it.m59035e();
                if (m59035e != null && (shortestOnDemandEstimate = m59035e.getShortestOnDemandEstimate()) != null) {
                    i = shortestOnDemandEstimate.intValue();
                } else {
                    i = -1;
                }
                return Integer.valueOf(i);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "estimatedTime", "", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kf3$d$c */
        /* loaded from: classes2.dex */
        public static final class C4526c extends Lambda implements Function1<Integer, Boolean> {

            /* renamed from: g */
            public static final C4526c f19994g = new C4526c();

            public C4526c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Integer estimatedTime) {
                boolean z;
                Intrinsics.checkNotNullParameter(estimatedTime, "estimatedTime");
                if (estimatedTime.intValue() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kf3$d$d */
        /* loaded from: classes2.dex */
        public static final class C4527d extends Lambda implements Function1<Integer, Long> {

            /* renamed from: g */
            public static final C4527d f19995g = new C4527d();

            public C4527d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Long invoke(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Long.valueOf(TimeUnit.SECONDS.toMinutes(it.intValue()));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kf3$d$e */
        /* loaded from: classes2.dex */
        public static final class C4528e extends Lambda implements Function1<Long, String> {

            /* renamed from: g */
            public static final C4528e f19996g = new C4528e();

            public C4528e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return String.valueOf(it.longValue());
            }
        }

        public C4523d() {
            super(0);
        }

        /* renamed from: g */
        public static final Integer m98595g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Integer) tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final boolean m98594h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* renamed from: i */
        public static final Long m98593i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Long) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* renamed from: j */
        public static final String m98592j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: f */
        public final Observable<String> invoke() {
            Observable<Optional<RentalPlan>> mo87536c = C34001Kf3.this.f19977d.mo87536c();
            final C4524a c4524a = C4524a.f19992g;
            Observable<Optional<RentalPlan>> filter = mo87536c.filter(new InterfaceC23494q() { // from class: Mf3
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = C34001Kf3.C4523d.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C4525b c4525b = C4525b.f19993g;
            Observable<R> map = filter.map(new InterfaceC23492o() { // from class: Nf3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Integer m98595g;
                    m98595g = C34001Kf3.C4523d.m98595g(Function1.this, obj);
                    return m98595g;
                }
            });
            final C4526c c4526c = C4526c.f19994g;
            Observable filter2 = map.filter(new InterfaceC23494q() { // from class: Of3
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m98594h;
                    m98594h = C34001Kf3.C4523d.m98594h(Function1.this, obj);
                    return m98594h;
                }
            });
            final C4527d c4527d = C4527d.f19995g;
            Observable map2 = filter2.map(new InterfaceC23492o() { // from class: Pf3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Long m98593i;
                    m98593i = C34001Kf3.C4523d.m98593i(Function1.this, obj);
                    return m98593i;
                }
            });
            final C4528e c4528e = C4528e.f19996g;
            return map2.map(new InterfaceC23492o() { // from class: Qf3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m98592j;
                    m98592j = C34001Kf3.C4523d.m98592j(Function1.this, obj);
                    return m98592j;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kf3$e */
    /* loaded from: classes2.dex */
    public static final class C4529e extends Lambda implements Function0<Observable<Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Kf3$e$a */
        /* loaded from: classes2.dex */
        public static final class C4530a extends Lambda implements Function1<String, Boolean> {

            /* renamed from: g */
            public static final C4530a f19998g = new C4530a();

            public C4530a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.length() > 0);
            }
        }

        public C4529e() {
            super(0);
        }

        /* renamed from: c */
        public static final Boolean m98584c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Boolean> invoke() {
            Observable<String> mo25231c = C34001Kf3.this.mo25231c();
            final C4530a c4530a = C4530a.f19998g;
            return mo25231c.map(new InterfaceC23492o() { // from class: Rf3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m98584c;
                    m98584c = C34001Kf3.C4529e.m98584c(Function1.this, obj);
                    return m98584c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "it", "LFf3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)LFf3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kf3$f */
    /* loaded from: classes2.dex */
    public static final class C4531f extends Lambda implements Function1<Optional<RentalPlan>, C32831Ff3> {
        public C4531f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C32831Ff3 invoke(Optional<RentalPlan> it) {
            long j;
            Long l;
            Integer shortestOnDemandEstimate;
            Intrinsics.checkNotNullParameter(it, "it");
            RentalPlan m59035e = it.m59035e();
            if (m59035e != null && (shortestOnDemandEstimate = m59035e.getShortestOnDemandEstimate()) != null) {
                j = shortestOnDemandEstimate.intValue();
            } else {
                j = -1;
            }
            long j2 = j;
            WireBird mo71569y0 = C34001Kf3.this.f19980g.mo71569y0(C34001Kf3.this.f19981h.mo43616p().m73665a());
            if (mo71569y0 != null) {
                l = Long.valueOf((long) C34001Kf3.this.f19981h.mo43618n(mo71569y0.getLocation().fromLocation()));
            } else {
                l = null;
            }
            return new C32831Ff3(null, null, null, j2, l, 7, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kf3$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4532g extends FunctionReferenceImpl implements Function1<C32831Ff3, Unit> {
        public C4532g(Object obj) {
            super(1, obj, InterfaceC1880Ea.class, "trackEvent", "trackEvent(Lco/bird/android/model/analytics/AnalyticsEvent;)V", 0);
        }

        /* renamed from: a */
        public final void m98582a(C32831Ff3 c32831Ff3) {
            ((InterfaceC1880Ea) this.receiver).mo55905y(c32831Ff3);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32831Ff3 c32831Ff3) {
            m98582a(c32831Ff3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPillConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillConfiguration.kt\nco/bird/android/app/feature/pill/internal/OnDemandPillConfiguration$visibility$2\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,134:1\n22#2,2:135\n*S KotlinDebug\n*F\n+ 1 PillConfiguration.kt\nco/bird/android/app/feature/pill/internal/OnDemandPillConfiguration$visibility$2\n*L\n68#1:135,2\n*E\n"})
    /* renamed from: Kf3$h */
    /* loaded from: classes2.dex */
    public static final class C4533h extends Lambda implements Function0<Observable<Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "it", "Lco/bird/android/model/wire/configs/RentalConfig;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/configs/RentalConfig;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kf3$h$a */
        /* loaded from: classes2.dex */
        public static final class C4534a extends Lambda implements Function1<Config, RentalConfig> {

            /* renamed from: g */
            public static final C4534a f20001g = new C4534a();

            public C4534a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final RentalConfig invoke(Config it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getRentalConfigs().getOnDemandConfig();
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 PillConfiguration.kt\nco/bird/android/app/feature/pill/internal/OnDemandPillConfiguration$visibility$2\n*L\n1#1,304:1\n72#2,3:305\n*E\n"})
        /* renamed from: Kf3$h$b */
        /* loaded from: classes2.dex */
        public static final class C4535b<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
            @Override // io.reactivex.functions.InterfaceC23480c
            public final R apply(T1 t1, T2 t2) {
                boolean z;
                boolean booleanValue = ((Boolean) t2).booleanValue();
                RentalConfig rentalConfig = (RentalConfig) t1;
                boolean z2 = false;
                if (rentalConfig.getEnabled()) {
                    String preorderText = rentalConfig.getPillConfig().getPreorderText();
                    if (preorderText != null && preorderText.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z && !booleanValue) {
                        z2 = true;
                    }
                }
                return (R) Boolean.valueOf(z2);
            }
        }

        public C4533h() {
            super(0);
        }

        /* renamed from: c */
        public static final RentalConfig m98579c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (RentalConfig) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Boolean> invoke() {
            C24523e c24523e = C24523e.f91168a;
            Z84<Config> m82623f8 = C34001Kf3.this.f19974a.m82623f8();
            final C4534a c4534a = C4534a.f20001g;
            InterfaceC23434B map = m82623f8.map(new InterfaceC23492o() { // from class: Sf3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    RentalConfig m98579c;
                    m98579c = C34001Kf3.C4533h.m98579c(Function1.this, obj);
                    return m98579c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "reactiveConfig.config.ma…lConfigs.onDemandConfig }");
            C34001Kf3 c34001Kf3 = C34001Kf3.this;
            Observable<PillButtonConfig> m82738U8 = c34001Kf3.f19974a.m82738U8();
            Intrinsics.checkNotNullExpressionValue(m82738U8, "reactiveConfig.pillButtonConfig()");
            Observable<Boolean> combineLatest = Observable.combineLatest(map, c34001Kf3.m98613k(m82738U8, C34001Kf3.this.m98614j()), new C4535b());
            Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
            return combineLatest;
        }
    }

    public C34001Kf3(C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC47617qi1 experimentManager, InterfaceC32292Cx4 rentalManager, InterfaceC40099e13 navigator, C22454gl preferences, InterfaceC10636aM birdManager, InterfaceC40001dr4 locationManager) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
        Intrinsics.checkNotNullParameter(rentalManager, "rentalManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f19974a = reactiveConfig;
        this.f19975b = analyticsManager;
        this.f19976c = experimentManager;
        this.f19977d = rentalManager;
        this.f19978e = navigator;
        this.f19979f = preferences;
        this.f19980g = birdManager;
        this.f19981h = locationManager;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f19982i = m31902e;
        lazy = LazyKt__LazyJVMKt.lazy(new C4533h());
        this.f19983j = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C4521c());
        this.f19984k = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C4523d());
        this.f19985l = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C4529e());
        this.f19986m = lazy4;
    }

    public static /* synthetic */ void getPillClickSubject$annotations() {
    }

    /* renamed from: l */
    public static final InterfaceC23434B m98612l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final Boolean m98611m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final C32831Ff3 m98609o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C32831Ff3) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m98608p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.MT3
    /* renamed from: a */
    public void mo25233a() {
        C41318g46.m40157g("ON_DEMAND pill click", new Object[0]);
        m98607q(this.f19974a.m82623f8().m73665a().getPillButtonConfig().getExperimentName());
        m98610n();
        this.f19982i.onNext(Unit.INSTANCE);
        this.f19978e.mo37173F0(I35.ON_DEMAND_RENTAL_SETUP.ordinal());
    }

    @Override // p000.MT3
    /* renamed from: b */
    public Observable<Boolean> mo25232b() {
        Object value = this.f19986m.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-secondaryTextVisibility>(...)");
        return (Observable) value;
    }

    @Override // p000.MT3
    /* renamed from: c */
    public Observable<String> mo25231c() {
        Object value = this.f19985l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-secondaryText>(...)");
        return (Observable) value;
    }

    @Override // p000.MT3
    /* renamed from: d */
    public Observable<String> mo25230d() {
        Object value = this.f19984k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-mainText>(...)");
        return (Observable) value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34001Kf3) {
            C34001Kf3 c34001Kf3 = (C34001Kf3) obj;
            return Intrinsics.areEqual(this.f19974a, c34001Kf3.f19974a) && Intrinsics.areEqual(this.f19975b, c34001Kf3.f19975b) && Intrinsics.areEqual(this.f19976c, c34001Kf3.f19976c) && Intrinsics.areEqual(this.f19977d, c34001Kf3.f19977d) && Intrinsics.areEqual(this.f19978e, c34001Kf3.f19978e) && Intrinsics.areEqual(this.f19979f, c34001Kf3.f19979f) && Intrinsics.areEqual(this.f19980g, c34001Kf3.f19980g) && Intrinsics.areEqual(this.f19981h, c34001Kf3.f19981h);
        }
        return false;
    }

    @Override // p000.MT3
    public Observable<Boolean> getVisibility() {
        return (Observable) this.f19983j.getValue();
    }

    public int hashCode() {
        return (((((((((((((this.f19974a.hashCode() * 31) + this.f19975b.hashCode()) * 31) + this.f19976c.hashCode()) * 31) + this.f19977d.hashCode()) * 31) + this.f19978e.hashCode()) * 31) + this.f19979f.hashCode()) * 31) + this.f19980g.hashCode()) * 31) + this.f19981h.hashCode();
    }

    /* renamed from: i */
    public final C34001Kf3 m98615i(C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC47617qi1 experimentManager, InterfaceC32292Cx4 rentalManager, InterfaceC40099e13 navigator, C22454gl preferences, InterfaceC10636aM birdManager, InterfaceC40001dr4 locationManager) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
        Intrinsics.checkNotNullParameter(rentalManager, "rentalManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        return new C34001Kf3(reactiveConfig, analyticsManager, experimentManager, rentalManager, navigator, preferences, birdManager, locationManager);
    }

    /* renamed from: j */
    public final C24558d<Unit> m98614j() {
        return this.f19982i;
    }

    /* renamed from: k */
    public final Observable<Boolean> m98613k(Observable<PillButtonConfig> pillButtonConfig, Observable<Unit> pillClickSubject) {
        Intrinsics.checkNotNullParameter(pillButtonConfig, "pillButtonConfig");
        Intrinsics.checkNotNullParameter(pillClickSubject, "pillClickSubject");
        final C4519a c4519a = new C4519a(pillButtonConfig);
        Observable merge = Observable.merge(pillButtonConfig, pillClickSubject.flatMap(new InterfaceC23492o() { // from class: If3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m98612l;
                m98612l = C34001Kf3.m98612l(Function1.this, obj);
                return m98612l;
            }
        }));
        final C4520b c4520b = new C4520b();
        Observable<Boolean> map = merge.map(new InterfaceC23492o() { // from class: Jf3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m98611m;
                m98611m = C34001Kf3.m98611m(Function1.this, obj);
                return m98611m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "@VisibleForTesting\n  fun…experimentName)\n    }\n  }");
        return map;
    }

    /* renamed from: n */
    public final void m98610n() {
        AbstractC23442F<Optional<RentalPlan>> firstOrError = this.f19977d.mo87536c().firstOrError();
        final C4531f c4531f = new C4531f();
        AbstractC23442F<R> m33157I = firstOrError.m33157I(new InterfaceC23492o() { // from class: Gf3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C32831Ff3 m98609o;
                m98609o = C34001Kf3.m98609o(Function1.this, obj);
                return m98609o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "private fun sendAnalytic…sManager::trackEvent)\n  }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33135e = m33157I.m33135e(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4532g c4532g = new C4532g(this.f19975b);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Hf3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34001Kf3.m98608p(Function1.this, obj);
            }
        });
    }

    /* renamed from: q */
    public final void m98607q(String str) {
        if (str == null) {
            return;
        }
        this.f19979f.m37728G2(str);
        AbstractC23461c mo15556a = this.f19976c.mo15556a(str);
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = mo15556a.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    public String toString() {
        C36207Tq4 c36207Tq4 = this.f19974a;
        InterfaceC1880Ea interfaceC1880Ea = this.f19975b;
        InterfaceC47617qi1 interfaceC47617qi1 = this.f19976c;
        InterfaceC32292Cx4 interfaceC32292Cx4 = this.f19977d;
        InterfaceC40099e13 interfaceC40099e13 = this.f19978e;
        C22454gl c22454gl = this.f19979f;
        InterfaceC10636aM interfaceC10636aM = this.f19980g;
        InterfaceC40001dr4 interfaceC40001dr4 = this.f19981h;
        return "OnDemandPillConfiguration(reactiveConfig=" + c36207Tq4 + ", analyticsManager=" + interfaceC1880Ea + ", experimentManager=" + interfaceC47617qi1 + ", rentalManager=" + interfaceC32292Cx4 + ", navigator=" + interfaceC40099e13 + ", preferences=" + c22454gl + ", birdManager=" + interfaceC10636aM + ", locationManager=" + interfaceC40001dr4 + ")";
    }
}
