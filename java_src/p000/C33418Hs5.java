package p000;

import android.hardware.SensorManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.GravityVector;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24552a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b/\u00100J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0016\u0010\u001fR\"\u0010%\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u00030!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010(\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010&0&0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\"\u0010*\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u00030!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\"\u0010,\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u00030!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010$R\"\u0010.\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u00030!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010$¨\u00061"}, m28432d2 = {"LHs5;", "LFs5;", "Lio/reactivex/Observable;", "", C17296a.f69688o, "Landroid/hardware/SensorManager;", "Landroid/hardware/SensorManager;", "sensorManager", "Ldr4;", "b", "Ldr4;", "locationManager", "LC1;", "c", "Lkotlin/Lazy;", "()LC1;", "accelerometerSensorListener", "LZD1;", DateTokenConverter.CONVERTER_KEY, "()LZD1;", "gravitySensorListener", "LGy3;", "e", "f", "()LGy3;", "orientationV1Sensor", "LIy3;", "g", "()LIy3;", "orientationV2Sensor", "Lgy3;", "()Lgy3;", "opticalBrightnessSensorListener", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/a;", "accelerometerSubject", "Lco/bird/android/model/GravityVector;", "i", "gravitySubject", "j", "orientationV1Subject", "k", "orientationV2Subject", "l", "opticalBrightnessSubject", "<init>", "(Landroid/hardware/SensorManager;Ldr4;)V", "co.bird.android.manager.sensor"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hs5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33418Hs5 implements InterfaceC32950Fs5 {

    /* renamed from: a */
    public final SensorManager f14087a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f14088b;

    /* renamed from: c */
    public final Lazy f14089c;

    /* renamed from: d */
    public final Lazy f14090d;

    /* renamed from: e */
    public final Lazy f14091e;

    /* renamed from: f */
    public final Lazy f14092f;

    /* renamed from: g */
    public final Lazy f14093g;

    /* renamed from: h */
    public final C24552a<Float> f14094h;

    /* renamed from: i */
    public final C24552a<GravityVector> f14095i;

    /* renamed from: j */
    public final C24552a<Float> f14096j;

    /* renamed from: k */
    public final C24552a<Float> f14097k;

    /* renamed from: l */
    public final C24552a<Float> f14098l;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LC1;", "b", "()LC1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hs5$a */
    /* loaded from: classes4.dex */
    public static final class C3254a extends Lambda implements Function0<C0837C1> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Hs5$a$a */
        /* loaded from: classes4.dex */
        public static final class C3255a extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C33418Hs5 f14100g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3255a(C33418Hs5 c33418Hs5) {
                super(0);
                this.f14100g = c33418Hs5;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f14100g.f14094h.m31920h());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "acceleration", "", C17296a.f69688o, "(F)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Hs5$a$b */
        /* loaded from: classes4.dex */
        public static final class C3256b extends Lambda implements Function1<Float, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C33418Hs5 f14101g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3256b(C33418Hs5 c33418Hs5) {
                super(1);
                this.f14101g = c33418Hs5;
            }

            /* renamed from: a */
            public final void m103266a(float f) {
                this.f14101g.f14094h.onNext(Float.valueOf(f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                m103266a(f.floatValue());
                return Unit.INSTANCE;
            }
        }

        public C3254a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C0837C1 invoke() {
            C0837C1 c0837c1 = new C0837C1(C33418Hs5.this.f14087a);
            C33418Hs5 c33418Hs5 = C33418Hs5.this;
            c0837c1.m108278c(new C3255a(c33418Hs5));
            c0837c1.m108277d(new C3256b(c33418Hs5));
            return c0837c1;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LZD1;", "b", "()LZD1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hs5$b */
    /* loaded from: classes4.dex */
    public static final class C3257b extends Lambda implements Function0<ZD1> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Hs5$b$a */
        /* loaded from: classes4.dex */
        public static final class C3258a extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C33418Hs5 f14103g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3258a(C33418Hs5 c33418Hs5) {
                super(0);
                this.f14103g = c33418Hs5;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f14103g.f14095i.m31920h());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/GravityVector;", "gravityVector", "", C17296a.f69688o, "(Lco/bird/android/model/GravityVector;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Hs5$b$b */
        /* loaded from: classes4.dex */
        public static final class C3259b extends Lambda implements Function1<GravityVector, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C33418Hs5 f14104g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3259b(C33418Hs5 c33418Hs5) {
                super(1);
                this.f14104g = c33418Hs5;
            }

            /* renamed from: a */
            public final void m103264a(GravityVector gravityVector) {
                Intrinsics.checkNotNullParameter(gravityVector, "gravityVector");
                this.f14104g.f14095i.onNext(gravityVector);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GravityVector gravityVector) {
                m103264a(gravityVector);
                return Unit.INSTANCE;
            }
        }

        public C3257b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ZD1 invoke() {
            ZD1 zd1 = new ZD1(C33418Hs5.this.f14087a);
            C33418Hs5 c33418Hs5 = C33418Hs5.this;
            zd1.m108278c(new C3258a(c33418Hs5));
            zd1.m108277d(new C3259b(c33418Hs5));
            return zd1;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lgy3;", "b", "()Lgy3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hs5$c */
    /* loaded from: classes4.dex */
    public static final class C3260c extends Lambda implements Function0<C41849gy3> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Hs5$c$a */
        /* loaded from: classes4.dex */
        public static final class C3261a extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C33418Hs5 f14106g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3261a(C33418Hs5 c33418Hs5) {
                super(0);
                this.f14106g = c33418Hs5;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f14106g.f14098l.m31920h());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "brightness", "", C17296a.f69688o, "(F)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Hs5$c$b */
        /* loaded from: classes4.dex */
        public static final class C3262b extends Lambda implements Function1<Float, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C33418Hs5 f14107g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3262b(C33418Hs5 c33418Hs5) {
                super(1);
                this.f14107g = c33418Hs5;
            }

            /* renamed from: a */
            public final void m103262a(float f) {
                this.f14107g.f14098l.onNext(Float.valueOf(f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                m103262a(f.floatValue());
                return Unit.INSTANCE;
            }
        }

        public C3260c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C41849gy3 invoke() {
            C41849gy3 c41849gy3 = new C41849gy3(C33418Hs5.this.f14087a);
            C33418Hs5 c33418Hs5 = C33418Hs5.this;
            c41849gy3.m108278c(new C3261a(c33418Hs5));
            c41849gy3.m108277d(new C3262b(c33418Hs5));
            return c41849gy3;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hs5$d */
    /* loaded from: classes4.dex */
    public static final class C3263d extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C3263d() {
            super(1);
        }

        /* renamed from: a */
        public final void m103261a(InterfaceC23465c interfaceC23465c) {
            C33418Hs5.this.m103270f().m108276e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m103261a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LGy3;", "b", "()LGy3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hs5$e */
    /* loaded from: classes4.dex */
    public static final class C3264e extends Lambda implements Function0<C33236Gy3> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Hs5$e$a */
        /* loaded from: classes4.dex */
        public static final class C3265a extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C33418Hs5 f14110g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3265a(C33418Hs5 c33418Hs5) {
                super(0);
                this.f14110g = c33418Hs5;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f14110g.f14096j.m31920h());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "azimuth", "", C17296a.f69688o, "(F)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Hs5$e$b */
        /* loaded from: classes4.dex */
        public static final class C3266b extends Lambda implements Function1<Float, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C33418Hs5 f14111g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3266b(C33418Hs5 c33418Hs5) {
                super(1);
                this.f14111g = c33418Hs5;
            }

            /* renamed from: a */
            public final void m103259a(float f) {
                this.f14111g.f14096j.onNext(Float.valueOf(f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                m103259a(f.floatValue());
                return Unit.INSTANCE;
            }
        }

        public C3264e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C33236Gy3 invoke() {
            C33236Gy3 c33236Gy3 = new C33236Gy3(C33418Hs5.this.f14087a, C33418Hs5.this.f14088b);
            C33418Hs5 c33418Hs5 = C33418Hs5.this;
            c33236Gy3.m108278c(new C3265a(c33418Hs5));
            c33236Gy3.m108277d(new C3266b(c33418Hs5));
            return c33236Gy3;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LIy3;", "b", "()LIy3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hs5$f */
    /* loaded from: classes4.dex */
    public static final class C3267f extends Lambda implements Function0<C33704Iy3> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Hs5$f$a */
        /* loaded from: classes4.dex */
        public static final class C3268a extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C33418Hs5 f14113g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3268a(C33418Hs5 c33418Hs5) {
                super(0);
                this.f14113g = c33418Hs5;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f14113g.f14097k.m31920h());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "azimuth", "", C17296a.f69688o, "(F)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Hs5$f$b */
        /* loaded from: classes4.dex */
        public static final class C3269b extends Lambda implements Function1<Float, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C33418Hs5 f14114g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3269b(C33418Hs5 c33418Hs5) {
                super(1);
                this.f14114g = c33418Hs5;
            }

            /* renamed from: a */
            public final void m103257a(float f) {
                this.f14114g.f14097k.onNext(Float.valueOf(f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                m103257a(f.floatValue());
                return Unit.INSTANCE;
            }
        }

        public C3267f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C33704Iy3 invoke() {
            C33704Iy3 c33704Iy3 = new C33704Iy3(C33418Hs5.this.f14087a);
            C33418Hs5 c33418Hs5 = C33418Hs5.this;
            c33704Iy3.m108278c(new C3268a(c33418Hs5));
            c33704Iy3.m108277d(new C3269b(c33418Hs5));
            return c33704Iy3;
        }
    }

    public C33418Hs5(SensorManager sensorManager, InterfaceC40001dr4 locationManager) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f14087a = sensorManager;
        this.f14088b = locationManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C3254a());
        this.f14089c = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C3257b());
        this.f14090d = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C3264e());
        this.f14091e = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C3267f());
        this.f14092f = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C3260c());
        this.f14093g = lazy5;
        C24552a<Float> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Float>()");
        this.f14094h = m31922e;
        C24552a<GravityVector> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<GravityVector>()");
        this.f14095i = m31922e2;
        C24552a<Float> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<Float>()");
        this.f14096j = m31922e3;
        C24552a<Float> m31922e4 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e4, "create<Float>()");
        this.f14097k = m31922e4;
        C24552a<Float> m31922e5 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e5, "create<Float>()");
        this.f14098l = m31922e5;
    }

    /* renamed from: h */
    public static final void m103268h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC32950Fs5
    /* renamed from: a */
    public Observable<Float> mo103275a() {
        Observable<Float> hide = this.f14096j.hide();
        final C3263d c3263d = new C3263d();
        Observable<Float> doOnSubscribe = hide.doOnSubscribe(new InterfaceC23484g() { // from class: Gs5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33418Hs5.m103268h(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "override fun orientation…ntationV1Sensor.start() }");
        return doOnSubscribe;
    }

    /* renamed from: c */
    public final C0837C1 m103273c() {
        return (C0837C1) this.f14089c.getValue();
    }

    /* renamed from: d */
    public final ZD1 m103272d() {
        return (ZD1) this.f14090d.getValue();
    }

    /* renamed from: e */
    public final C41849gy3 m103271e() {
        return (C41849gy3) this.f14093g.getValue();
    }

    /* renamed from: f */
    public final C33236Gy3 m103270f() {
        return (C33236Gy3) this.f14091e.getValue();
    }

    /* renamed from: g */
    public final C33704Iy3 m103269g() {
        return (C33704Iy3) this.f14092f.getValue();
    }
}
