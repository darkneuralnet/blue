package p000;

import android.content.Intent;
import android.location.Location;
import android.os.Handler;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.physicallock.ReplacePhysicalLockActivity;
import co.bird.android.model.BirdInspectionPoint;
import co.bird.android.model.BirdRepair;
import co.bird.android.model.MechanicPhotoMode;
import co.bird.android.model.constant.Resolution;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.C24576w;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37937aP5;
import p000.H31;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*¢\u0006\u0004\bA\u0010BJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J$\u0010\t\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016J\"\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006C"}, m28432d2 = {"LaP5;", "LxC;", "LMO5;", "", "L", "", "Lco/bird/android/model/BirdInspectionPoint;", "selectedPoints", "unSelectedPoints", "Z", "P", "Landroid/content/Intent;", "intent", "b", "", "requestCode", "resultCode", "onActivityResult", "LdP5;", "c", "LdP5;", "ui", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LTq4;", "e", "LTq4;", "reactiveConfig", "LEg1;", "f", "LEg1;", "eventBus", "LjB0;", "g", "LjB0;", "contractorManager", "LFO2;", "h", "LFO2;", "mechanicManager", "Landroid/os/Handler;", "i", "Landroid/os/Handler;", "handler", "Lco/bird/android/model/wire/WireBird;", "j", "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "k", "Landroid/location/Location;", "location", "", "l", "Ljava/lang/String;", "repairId", "Ljava/util/ArrayList;", "m", "Ljava/util/ArrayList;", "inspectionPointList", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LdP5;Le13;LTq4;LEg1;LjB0;LFO2;Landroid/os/Handler;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStartRepairPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartRepairPresenter.kt\nco/bird/android/app/feature/legacyrepair/startrepair/StartRepairPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,177:1\n180#2:178\n180#2:179\n180#2:180\n180#2:181\n180#2:182\n180#2:183\n180#2:184\n*S KotlinDebug\n*F\n+ 1 StartRepairPresenter.kt\nco/bird/android/app/feature/legacyrepair/startrepair/StartRepairPresenterImpl\n*L\n63#1:178\n71#1:179\n80#1:180\n88#1:181\n97#1:182\n130#1:183\n165#1:184\n*E\n"})
/* renamed from: aP5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37937aP5 extends C30060xC implements MO5 {

    /* renamed from: c */
    public final InterfaceC39734dP5 f50409c;

    /* renamed from: d */
    public final InterfaceC40099e13 f50410d;

    /* renamed from: e */
    public final C36207Tq4 f50411e;

    /* renamed from: f */
    public final InterfaceC32604Eg1 f50412f;

    /* renamed from: g */
    public final InterfaceC43160jB0 f50413g;

    /* renamed from: h */
    public final FO2 f50414h;

    /* renamed from: i */
    public final Handler f50415i;

    /* renamed from: j */
    public WireBird f50416j;

    /* renamed from: k */
    public Location f50417k;

    /* renamed from: l */
    public String f50418l;

    /* renamed from: m */
    public ArrayList<BirdInspectionPoint> f50419m;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aP5$a */
    /* loaded from: classes2.dex */
    public static final class C10673a extends Lambda implements Function1<Unit, Unit> {
        public C10673a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13 interfaceC40099e13 = C37937aP5.this.f50410d;
            WireBird wireBird = C37937aP5.this.f50416j;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            interfaceC40099e13.mo37112P1(wireBird.getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/w;", "Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aP5$b */
    /* loaded from: classes2.dex */
    public static final class C10674b extends Lambda implements Function1<C24576w<BirdRepair>, Unit> {
        public C10674b() {
            super(1);
        }

        /* renamed from: a */
        public final void m71452a(C24576w<BirdRepair> c24576w) {
            C37937aP5.this.f50409c.showProgress(false, 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<BirdRepair> c24576w) {
            m71452a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BirdRepair;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aP5$c */
    /* loaded from: classes2.dex */
    public static final class C10675c extends Lambda implements Function1<BirdRepair, Unit> {
        public C10675c() {
            super(1);
        }

        /* renamed from: a */
        public final void m71451a(BirdRepair birdRepair) {
            C37937aP5.this.f50410d.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdRepair birdRepair) {
            m71451a(birdRepair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aP5$d */
    /* loaded from: classes2.dex */
    public static final class C10676d extends Lambda implements Function1<Throwable, Unit> {
        public C10676d() {
            super(1);
        }

        /* renamed from: b */
        public static final void m71449b(C37937aP5 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f50410d.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C37937aP5.this.f50409c.error(C45871nl4.cancel_repair_error_message);
            C41318g46.m40159e(th);
            Handler handler = C37937aP5.this.f50415i;
            final C37937aP5 c37937aP5 = C37937aP5.this;
            handler.postDelayed(new Runnable() { // from class: bP5
                @Override // java.lang.Runnable
                public final void run() {
                    C37937aP5.C10676d.m71449b(C37937aP5.this);
                }
            }, 2000L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aP5$e */
    /* loaded from: classes2.dex */
    public static final class C10677e extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends BirdRepair>> {
        public C10677e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends BirdRepair> invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C37937aP5.this.f50412f.mo104915c(new C29560vT(it));
            FO2 fo2 = C37937aP5.this.f50414h;
            String str = C37937aP5.this.f50418l;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("repairId");
                str = null;
            }
            return fo2.mo93952i(str, Resolution.CANCELED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/w;", "Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aP5$f */
    /* loaded from: classes2.dex */
    public static final class C10678f extends Lambda implements Function1<C24576w<BirdRepair>, Unit> {
        public C10678f() {
            super(1);
        }

        /* renamed from: a */
        public final void m71447a(C24576w<BirdRepair> c24576w) {
            C37937aP5.this.f50409c.showProgress(false, 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<BirdRepair> c24576w) {
            m71447a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BirdRepair;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aP5$g */
    /* loaded from: classes2.dex */
    public static final class C10679g extends Lambda implements Function1<BirdRepair, Unit> {
        public C10679g() {
            super(1);
        }

        /* renamed from: a */
        public final void m71446a(BirdRepair birdRepair) {
            C37937aP5.this.f50410d.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdRepair birdRepair) {
            m71446a(birdRepair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aP5$h */
    /* loaded from: classes2.dex */
    public static final class C10680h extends Lambda implements Function1<Throwable, Unit> {
        public C10680h() {
            super(1);
        }

        /* renamed from: b */
        public static final void m71444b(C37937aP5 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f50410d.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C37937aP5.this.f50409c.error(C45871nl4.cant_fix_error_message);
            C41318g46.m40159e(th);
            Handler handler = C37937aP5.this.f50415i;
            final C37937aP5 c37937aP5 = C37937aP5.this;
            handler.postDelayed(new Runnable() { // from class: cP5
                @Override // java.lang.Runnable
                public final void run() {
                    C37937aP5.C10680h.m71444b(C37937aP5.this);
                }
            }, 2000L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/BirdInspectionPoint;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aP5$i */
    /* loaded from: classes2.dex */
    public static final class C10681i extends Lambda implements Function1<Pair<? extends List<? extends BirdInspectionPoint>, ? extends List<? extends BirdInspectionPoint>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: aP5$i$a */
        /* loaded from: classes2.dex */
        public static final class C10682a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37937aP5 f50429g;

            /* renamed from: h */
            public final /* synthetic */ List<BirdInspectionPoint> f50430h;

            /* renamed from: i */
            public final /* synthetic */ List<BirdInspectionPoint> f50431i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10682a(C37937aP5 c37937aP5, List<BirdInspectionPoint> list, List<BirdInspectionPoint> list2) {
                super(0);
                this.f50429g = c37937aP5;
                this.f50430h = list;
                this.f50431i = list2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f50429g.m71457Z(this.f50430h, this.f50431i);
            }
        }

        public C10681i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends BirdInspectionPoint>, ? extends List<? extends BirdInspectionPoint>> pair) {
            invoke2((Pair<? extends List<BirdInspectionPoint>, ? extends List<BirdInspectionPoint>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<BirdInspectionPoint>, ? extends List<BirdInspectionPoint>> pair) {
            H31.C3014a.showDialog$default(C37937aP5.this.f50409c, C36734Vx0.f40103d, false, false, new C10682a(C37937aP5.this, pair.component1(), pair.component2()), null, null, null, 116, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aP5$j */
    /* loaded from: classes2.dex */
    public static final class C10683j extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: aP5$j$a */
        /* loaded from: classes2.dex */
        public static final class C10684a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37937aP5 f50433g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10684a(C37937aP5 c37937aP5) {
                super(0);
                this.f50433g = c37937aP5;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC43160jB0 interfaceC43160jB0 = this.f50433g.f50413g;
                InterfaceC40099e13 interfaceC40099e13 = this.f50433g.f50410d;
                WireBird wireBird = this.f50433g.f50416j;
                Location location = null;
                if (wireBird == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                    wireBird = null;
                }
                Location location2 = this.f50433g.f50417k;
                if (location2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("location");
                } else {
                    location = location2;
                }
                interfaceC43160jB0.mo27699c(interfaceC40099e13, wireBird, location, true);
                this.f50433g.f50410d.mo37030e3();
            }
        }

        public C10683j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            H31.C3014a.showDialog$default(C37937aP5.this.f50409c, OM4.f26432d, false, false, new C10684a(C37937aP5.this), null, null, null, 116, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aP5$k */
    /* loaded from: classes2.dex */
    public static final class C10685k extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: aP5$k$a */
        /* loaded from: classes2.dex */
        public static final class C10686a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37937aP5 f50435g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10686a(C37937aP5 c37937aP5) {
                super(0);
                this.f50435g = c37937aP5;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f50435g.m71467P();
            }
        }

        public C10685k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            H31.C3014a.showDialog$default(C37937aP5.this.f50409c, C37490Zd0.f48850d, false, false, new C10686a(C37937aP5.this), null, null, null, 116, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aP5$l */
    /* loaded from: classes2.dex */
    public static final class C10687l extends Lambda implements Function1<Unit, Unit> {
        public C10687l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C37937aP5.this.m71471L();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "isChecked", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aP5$m */
    /* loaded from: classes2.dex */
    public static final class C10688m extends Lambda implements Function1<Boolean, Unit> {
        public C10688m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean isChecked) {
            Intrinsics.checkNotNullExpressionValue(isChecked, "isChecked");
            if (isChecked.booleanValue()) {
                InterfaceC40099e13 interfaceC40099e13 = C37937aP5.this.f50410d;
                WireBird wireBird = C37937aP5.this.f50416j;
                if (wireBird == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                    wireBird = null;
                }
                interfaceC40099e13.mo37112P1(wireBird.getId());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37937aP5(LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC39734dP5 ui, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig, InterfaceC32604Eg1 eventBus, InterfaceC43160jB0 contractorManager, FO2 mechanicManager, Handler handler) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(contractorManager, "contractorManager");
        Intrinsics.checkNotNullParameter(mechanicManager, "mechanicManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f50409c = ui;
        this.f50410d = navigator;
        this.f50411e = reactiveConfig;
        this.f50412f = eventBus;
        this.f50413g = contractorManager;
        this.f50414h = mechanicManager;
        this.f50415i = handler;
    }

    /* renamed from: K */
    public static final void m71472K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m71470M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m71469N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m71468O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23434B m71466Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m71465R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m71464S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m71463T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m71462U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m71461V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m71460W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m71459X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m71458Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public final void m71471L() {
        this.f50409c.showProgress(true, 4);
        FO2 fo2 = this.f50414h;
        String str = this.f50418l;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("repairId");
            str = null;
        }
        Observable<BirdRepair> mo93952i = fo2.mo93952i(str, Resolution.CANCELED);
        final C10674b c10674b = new C10674b();
        Observable<BirdRepair> doOnEach = mo93952i.doOnEach(new InterfaceC23484g() { // from class: NO5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37937aP5.m71469N(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnEach, "private fun onCancelRepa…   }, 2000L)\n      })\n  }");
        Object m33094as = doOnEach.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10675c c10675c = new C10675c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: RO5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37937aP5.m71468O(Function1.this, obj);
            }
        };
        final C10676d c10676d = new C10676d();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: SO5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37937aP5.m71470M(Function1.this, obj);
            }
        });
    }

    /* renamed from: P */
    public final void m71467P() {
        this.f50409c.showProgress(true, 4);
        FO2 fo2 = this.f50414h;
        WireBird wireBird = this.f50416j;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        String taskId = wireBird.getTaskId();
        Intrinsics.checkNotNull(taskId);
        Observable<WireBird> mo93975D = fo2.mo93975D(taskId);
        final C10677e c10677e = new C10677e();
        Observable<R> flatMap = mo93975D.flatMap(new InterfaceC23492o() { // from class: TO5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m71466Q;
                m71466Q = C37937aP5.m71466Q(Function1.this, obj);
                return m71466Q;
            }
        });
        final C10678f c10678f = new C10678f();
        Observable doOnEach = flatMap.doOnEach(new InterfaceC23484g() { // from class: UO5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37937aP5.m71465R(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnEach, "private fun onCantFixCli…   }, 2000L)\n      })\n  }");
        Object m33094as = doOnEach.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10679g c10679g = new C10679g();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: VO5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37937aP5.m71464S(Function1.this, obj);
            }
        };
        final C10680h c10680h = new C10680h();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: WO5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37937aP5.m71463T(Function1.this, obj);
            }
        });
    }

    /* renamed from: Z */
    public final void m71457Z(List<BirdInspectionPoint> list, List<BirdInspectionPoint> list2) {
        InterfaceC40099e13 interfaceC40099e13 = this.f50410d;
        WireBird wireBird = this.f50416j;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        MechanicPhotoMode mechanicPhotoMode = MechanicPhotoMode.REPAIR;
        String str = this.f50418l;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("repairId");
            str = null;
        }
        Location location = this.f50417k;
        if (location == null) {
            Intrinsics.throwUninitializedPropertyAccessException("location");
            location = null;
        }
        interfaceC40099e13.mo37196B1(wireBird, mechanicPhotoMode, str, location, new ArrayList<>(list), new ArrayList<>(list2));
        this.f50410d.close();
    }

    @Override // p000.MO5
    /* renamed from: b */
    public void mo71456b(Intent intent) {
        C24552a<Boolean> mo36451Jk;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f50416j = (WireBird) parcelableExtra;
        Parcelable parcelableExtra2 = intent.getParcelableExtra("location");
        Intrinsics.checkNotNull(parcelableExtra2);
        this.f50417k = (Location) parcelableExtra2;
        String stringExtra = intent.getStringExtra("repair_id");
        Intrinsics.checkNotNull(stringExtra);
        this.f50418l = stringExtra;
        ArrayList<BirdInspectionPoint> parcelableArrayListExtra = intent.getParcelableArrayListExtra("inspection_point_list");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        this.f50419m = parcelableArrayListExtra;
        InterfaceC39734dP5 interfaceC39734dP5 = this.f50409c;
        WireBird wireBird = this.f50416j;
        ArrayList<BirdInspectionPoint> arrayList = null;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        interfaceC39734dP5.mo36442m(wireBird.getCode());
        InterfaceC39734dP5 interfaceC39734dP52 = this.f50409c;
        ArrayList<BirdInspectionPoint> arrayList2 = this.f50419m;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inspectionPointList");
        } else {
            arrayList = arrayList2;
        }
        interfaceC39734dP52.mo36445Ui(arrayList);
        Observable<Pair<List<BirdInspectionPoint>, List<BirdInspectionPoint>>> observeOn = this.f50409c.mo36439v7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.markRepairClicks()\n  …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10681i c10681i = new C10681i();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: YO5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37937aP5.m71462U(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f50409c.mo36441o7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.startOverClicks()\n   …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10683j c10683j = new C10683j();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: ZO5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37937aP5.m71461V(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f50409c.mo36453A0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.cantFixClicks()\n     …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10685k c10685k = new C10685k();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: OO5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37937aP5.m71460W(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f50409c.mo36440rd().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.cancelTaskClicks()\n  …dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10687l c10687l = new C10687l();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: PO5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37937aP5.m71459X(Function1.this, obj);
            }
        });
        if (this.f50411e.m82623f8().getValue().getEnablePhysicalLockReplacement() && (mo36451Jk = this.f50409c.mo36451Jk("neck_physical_lock")) != null) {
            Observable<Boolean> skip = mo36451Jk.observeOn(C23454a.m33087a()).skip(1L);
            Intrinsics.checkNotNullExpressionValue(skip, "this.observeOn(AndroidSc…ead())\n          .skip(1)");
            Object m33094as5 = skip.m33094as(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C10688m c10688m = new C10688m();
            ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: QO5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37937aP5.m71458Y(Function1.this, obj);
                }
            });
        }
    }

    @Override // p000.MO5
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == C30906z6.m1823a(Reflection.getOrCreateKotlinClass(ReplacePhysicalLockActivity.class))) {
            if (i2 != -1) {
                if (i2 == 0) {
                    this.f50409c.mo36452J7();
                    return;
                }
                return;
            }
            Observable<Unit> mo36443ki = this.f50409c.mo36443ki((intent == null || (r3 = intent.getStringExtra(PaymentMethodOptionsParams.Blik.PARAM_CODE)) == null) ? "" : "");
            if (mo36443ki != null) {
                Observable<Unit> observeOn = mo36443ki.observeOn(C23454a.m33087a());
                final C10673a c10673a = new C10673a();
                observeOn.subscribe(new InterfaceC23484g() { // from class: XO5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C37937aP5.m71472K(Function1.this, obj);
                    }
                });
            }
        }
    }
}
