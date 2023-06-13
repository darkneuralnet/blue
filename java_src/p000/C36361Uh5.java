package p000;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdInspection;
import co.bird.android.model.BirdInspectionJob;
import co.bird.android.model.BirdInspectionPoint;
import co.bird.android.model.BirdRepair;
import co.bird.android.model.MechanicPhotoMode;
import co.bird.android.model.MechanicRepairStep;
import co.bird.android.model.constant.Resolution;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdLabel;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.C24576w;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C36361Uh5;
import p000.H31;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\bN\u0010OJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\bJ\b\u0010\f\u001a\u00020\u0005H\u0016J=\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0012j\b\u0012\u0004\u0012\u00020\u0010`\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\bR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R$\u00103\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010J\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0014\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006P"}, m28432d2 = {"LUh5;", "LxC;", "Lzh5;", "Landroid/content/Intent;", "intent", "", "b", "a0", "()V", "r0", "h0", "f0", "onBackPressed", "", "Lco/bird/android/model/BirdInspectionJob;", "jobs", "Lco/bird/android/model/BirdInspectionPoint;", "points", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Z", "(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;", "R", "c0", "Landroid/content/Context;", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LYh5;", DateTokenConverter.CONVERTER_KEY, "LYh5;", "ui", "Le13;", "e", "Le13;", "navigator", "LEg1;", "f", "LEg1;", "eventBus", "LFO2;", "g", "LFO2;", "mechanicManager", "", "h", "Ljava/lang/String;", "X", "()Ljava/lang/String;", "w0", "(Ljava/lang/String;)V", "inspectionId", "Lco/bird/android/model/wire/WireBird;", "i", "Lco/bird/android/model/wire/WireBird;", "W", "()Lco/bird/android/model/wire/WireBird;", "v0", "(Lco/bird/android/model/wire/WireBird;)V", "bird", "Landroid/location/Location;", "j", "Landroid/location/Location;", "Y", "()Landroid/location/Location;", "x0", "(Landroid/location/Location;)V", "location", "", "k", "getStartOver", "()Z", "setStartOver", "(Z)V", "startOver", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;LYh5;Le13;LEg1;LFO2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSafetyInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafetyInspectionPresenter.kt\nco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n180#2:224\n180#2:225\n180#2:226\n180#2:227\n180#2:228\n180#2:229\n180#2:230\n180#2:231\n180#2:236\n180#2:237\n766#3:232\n857#3:233\n858#3:235\n1#4:234\n*S KotlinDebug\n*F\n+ 1 SafetyInspectionPresenter.kt\nco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionPresenterImpl\n*L\n62#1:224\n71#1:225\n79#1:226\n87#1:227\n100#1:228\n128#1:229\n152#1:230\n181#1:231\n203#1:236\n219#1:237\n190#1:232\n190#1:233\n190#1:235\n*E\n"})
/* renamed from: Uh5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36361Uh5 extends C30060xC implements InterfaceC52946zh5 {

    /* renamed from: c */
    public final Context f37761c;

    /* renamed from: d */
    public final InterfaceC37297Yh5 f37762d;

    /* renamed from: e */
    public final InterfaceC40099e13 f37763e;

    /* renamed from: f */
    public final InterfaceC32604Eg1 f37764f;

    /* renamed from: g */
    public final FO2 f37765g;

    /* renamed from: h */
    public String f37766h;

    /* renamed from: i */
    public WireBird f37767i;

    /* renamed from: j */
    public Location f37768j;

    /* renamed from: k */
    public boolean f37769k;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/w;", "Lco/bird/android/model/BirdInspection;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$a */
    /* loaded from: classes2.dex */
    public static final class C8351a extends Lambda implements Function1<C24576w<BirdInspection>, Unit> {
        public C8351a() {
            super(1);
        }

        /* renamed from: a */
        public final void m81083a(C24576w<BirdInspection> c24576w) {
            S74.C7343a.showProgress$default(C36361Uh5.this.f37762d, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<BirdInspection> c24576w) {
            m81083a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdInspection;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BirdInspection;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$b */
    /* loaded from: classes2.dex */
    public static final class C8352b extends Lambda implements Function1<BirdInspection, Unit> {
        public C8352b() {
            super(1);
        }

        /* renamed from: a */
        public final void m81082a(BirdInspection birdInspection) {
            C36361Uh5.this.m81088w0(birdInspection.getId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdInspection birdInspection) {
            m81082a(birdInspection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdInspection;", "kotlin.jvm.PlatformType", "inspection", "", C17296a.f69688o, "(Lco/bird/android/model/BirdInspection;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$c */
    /* loaded from: classes2.dex */
    public static final class C8353c extends Lambda implements Function1<BirdInspection, Unit> {
        public C8353c() {
            super(1);
        }

        /* renamed from: a */
        public final void m81081a(BirdInspection birdInspection) {
            List<BirdInspectionPoint> inspectionPoints = birdInspection.getInspectionPoints();
            if (inspectionPoints != null) {
                C36361Uh5 c36361Uh5 = C36361Uh5.this;
                c36361Uh5.f37762d.mo64084i6(inspectionPoints);
                c36361Uh5.f37762d.mo64096Gf();
                c36361Uh5.m81108c0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdInspection birdInspection) {
            m81081a(birdInspection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uh5$d */
    /* loaded from: classes2.dex */
    public static final class C8354d extends Lambda implements Function1<Throwable, Unit> {
        public C8354d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C36361Uh5.this.f37762d.error(C45871nl4.start_inspection_error_message);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/MechanicRepairStep;", "kotlin.jvm.PlatformType", "step", "", "c", "(Lco/bird/android/model/MechanicRepairStep;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSafetyInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafetyInspectionPresenter.kt\nco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionPresenterImpl$inspectionOrRepair$1\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,223:1\n180#2:224\n*S KotlinDebug\n*F\n+ 1 SafetyInspectionPresenter.kt\nco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionPresenterImpl$inspectionOrRepair$1\n*L\n112#1:224\n*E\n"})
    /* renamed from: Uh5$e */
    /* loaded from: classes2.dex */
    public static final class C8355e extends Lambda implements Function1<MechanicRepairStep, Unit> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/BirdInspection;", "birdInspection", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/BirdInspection;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Uh5$e$a */
        /* loaded from: classes2.dex */
        public static final class C8356a extends Lambda implements Function1<BirdInspection, InterfaceC23434B<? extends Pair<? extends BirdInspection, ? extends BirdRepair>>> {

            /* renamed from: g */
            public final /* synthetic */ C36361Uh5 f37775g;

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BirdRepair;", "birdRepair", "Lkotlin/Pair;", "Lco/bird/android/model/BirdInspection;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/BirdRepair;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Uh5$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C8357a extends Lambda implements Function1<BirdRepair, Pair<? extends BirdInspection, ? extends BirdRepair>> {

                /* renamed from: g */
                public final /* synthetic */ BirdInspection f37776g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8357a(BirdInspection birdInspection) {
                    super(1);
                    this.f37776g = birdInspection;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Pair<BirdInspection, BirdRepair> invoke(BirdRepair birdRepair) {
                    Intrinsics.checkNotNullParameter(birdRepair, "birdRepair");
                    return new Pair<>(this.f37776g, birdRepair);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8356a(C36361Uh5 c36361Uh5) {
                super(1);
                this.f37775g = c36361Uh5;
            }

            public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23434B<? extends Pair<BirdInspection, BirdRepair>> invoke(BirdInspection birdInspection) {
                Intrinsics.checkNotNullParameter(birdInspection, "birdInspection");
                Observable<BirdRepair> mo93949v = this.f37775g.f37765g.mo93949v(this.f37775g.m81114W().getId());
                final C8357a c8357a = new C8357a(birdInspection);
                return mo93949v.map(new InterfaceC23492o() { // from class: Xh5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C36361Uh5.C8355e.C8356a.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lco/bird/android/model/BirdInspection;", "Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Uh5$e$b */
        /* loaded from: classes2.dex */
        public static final class C8358b extends Lambda implements Function1<Pair<? extends BirdInspection, ? extends BirdRepair>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36361Uh5 f37777g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8358b(C36361Uh5 c36361Uh5) {
                super(1);
                this.f37777g = c36361Uh5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BirdInspection, ? extends BirdRepair> pair) {
                invoke2((Pair<BirdInspection, BirdRepair>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<BirdInspection, BirdRepair> pair) {
                S74.C7343a.showProgress$default(this.f37777g.f37762d, false, 0, 2, null);
                InterfaceC40099e13 interfaceC40099e13 = this.f37777g.f37763e;
                WireBird m81114W = this.f37777g.m81114W();
                Location m81112Y = this.f37777g.m81112Y();
                String id = pair.getSecond().getId();
                C36361Uh5 c36361Uh5 = this.f37777g;
                List<BirdInspectionJob> inspectionJobs = pair.getFirst().getInspectionJobs();
                Intrinsics.checkNotNull(inspectionJobs);
                interfaceC40099e13.mo36987l4(m81114W, m81112Y, id, c36361Uh5.m81111Z(inspectionJobs, pair.getFirst().getInspectionPoints()));
                this.f37777g.f37763e.close();
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Uh5$e$c */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8359c {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MechanicRepairStep.values().length];
                try {
                    iArr[MechanicRepairStep.INSPECTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MechanicRepairStep.REPAIR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C8355e() {
            super(1);
        }

        /* renamed from: d */
        public static final InterfaceC23434B m81077d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final void m81076e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: c */
        public final void m81078c(MechanicRepairStep mechanicRepairStep) {
            int i;
            if (mechanicRepairStep == null) {
                i = -1;
            } else {
                i = C8359c.$EnumSwitchMapping$0[mechanicRepairStep.ordinal()];
            }
            if (i != 1) {
                if (i == 2) {
                    Observable<BirdInspection> mo93973G = C36361Uh5.this.f37765g.mo93973G(C36361Uh5.this.m81114W().getId());
                    final C8356a c8356a = new C8356a(C36361Uh5.this);
                    Observable<R> flatMap = mo93973G.flatMap(new InterfaceC23492o() { // from class: Vh5
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23434B m81077d;
                            m81077d = C36361Uh5.C8355e.m81077d(Function1.this, obj);
                            return m81077d;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(flatMap, "internal fun inspectionO…  }\n        }\n      }\n  }");
                    Object m33094as = flatMap.m33094as(AutoDispose.m45239a(C36361Uh5.this.m5717t()));
                    Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C8358b c8358b = new C8358b(C36361Uh5.this);
                    ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Wh5
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C36361Uh5.C8355e.m81076e(Function1.this, obj);
                        }
                    });
                    return;
                }
                return;
            }
            C36361Uh5.this.m81119R();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MechanicRepairStep mechanicRepairStep) {
            m81078c(mechanicRepairStep);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enable", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uh5$f */
    /* loaded from: classes2.dex */
    public static final class C8360f extends Lambda implements Function1<Boolean, Unit> {
        public C8360f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enable) {
            InterfaceC37297Yh5 interfaceC37297Yh5 = C36361Uh5.this.f37762d;
            Intrinsics.checkNotNullExpressionValue(enable, "enable");
            interfaceC37297Yh5.mo64080z4(enable.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdInspection;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BirdInspection;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$g */
    /* loaded from: classes2.dex */
    public static final class C8361g extends Lambda implements Function1<BirdInspection, Unit> {
        public C8361g() {
            super(1);
        }

        /* renamed from: a */
        public final void m81072a(BirdInspection birdInspection) {
            C36361Uh5.this.f37762d.snackToast(C45871nl4.mechanic_safety_inspection_closing_inspection_toast);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdInspection birdInspection) {
            m81072a(birdInspection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/w;", "Lco/bird/android/model/BirdInspection;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$h */
    /* loaded from: classes2.dex */
    public static final class C8362h extends Lambda implements Function1<C24576w<BirdInspection>, Unit> {
        public C8362h() {
            super(1);
        }

        /* renamed from: a */
        public final void m81071a(C24576w<BirdInspection> c24576w) {
            S74.C7343a.showProgress$default(C36361Uh5.this.f37762d, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<BirdInspection> c24576w) {
            m81071a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdInspection;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BirdInspection;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$i */
    /* loaded from: classes2.dex */
    public static final class C8363i extends Lambda implements Function1<BirdInspection, Unit> {
        public C8363i() {
            super(1);
        }

        /* renamed from: a */
        public final void m81070a(BirdInspection birdInspection) {
            C36361Uh5.this.f37763e.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdInspection birdInspection) {
            m81070a(birdInspection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uh5$j */
    /* loaded from: classes2.dex */
    public static final class C8364j extends Lambda implements Function1<Throwable, Unit> {
        public C8364j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C36361Uh5.this.f37762d.error(C45871nl4.cancel_repair_error_message);
            C41318g46.m40159e(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$k */
    /* loaded from: classes2.dex */
    public static final class C8365k extends Lambda implements Function1<WireBird, Unit> {
        public C8365k() {
            super(1);
        }

        /* renamed from: a */
        public final void m81069a(WireBird bird) {
            WireBird copy;
            InterfaceC32604Eg1 interfaceC32604Eg1 = C36361Uh5.this.f37764f;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            copy = bird.copy((r91 & 1) != 0 ? bird.f66717id : null, (r91 & 2) != 0 ? bird.model : null, (r91 & 4) != 0 ? bird.taskId : null, (r91 & 8) != 0 ? bird.batteryLevel : 0, (r91 & 16) != 0 ? bird.estimatedRange : null, (r91 & 32) != 0 ? bird.distance : 0, (r91 & 64) != 0 ? bird.location : null, (r91 & 128) != 0 ? bird.code : null, (r91 & 256) != 0 ? bird.stickerId : null, (r91 & 512) != 0 ? bird.serialNumber : null, (r91 & 1024) != 0 ? bird.disconnected : false, (r91 & 2048) != 0 ? bird.collect : false, (r91 & 4096) != 0 ? bird.submerged : false, (r91 & 8192) != 0 ? bird.lost : false, (r91 & 16384) != 0 ? bird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r91 & 65536) != 0 ? bird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r91 & 524288) != 0 ? bird.label : new WireBirdLabel("service", C40788fB0.m41776f(C36361Uh5.this.f37761c, C32364Df4.labelDamaged), null, null, null, 28, null), (r91 & 1048576) != 0 ? bird.actions : null, (r91 & 2097152) != 0 ? bird.bountyId : null, (r91 & 4194304) != 0 ? bird.bountyPrice : null, (r91 & 8388608) != 0 ? bird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r91 & 33554432) != 0 ? bird.bountyOverdue : false, (r91 & 67108864) != 0 ? bird.bountyKind : null, (r91 & 134217728) != 0 ? bird.brandName : null, (r91 & 268435456) != 0 ? bird.taskKind : null, (r91 & 536870912) != 0 ? bird.gpsAt : null, (r91 & 1073741824) != 0 ? bird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r92 & 1) != 0 ? bird.bluetooth : false, (r92 & 2) != 0 ? bird.cellular : false, (r92 & 4) != 0 ? bird.startedAt : null, (r92 & 8) != 0 ? bird.dueAt : null, (r92 & 16) != 0 ? bird.asleep : false, (r92 & 32) != 0 ? bird.imei : null, (r92 & 64) != 0 ? bird.boardProtocol : null, (r92 & 128) != 0 ? bird.physicalLock : null, (r92 & 256) != 0 ? bird.priorityCollect : false, (r92 & 512) != 0 ? bird.down : false, (r92 & 1024) != 0 ? bird.needsInspection : false, (r92 & 2048) != 0 ? bird.partnerId : null, (r92 & 4096) != 0 ? bird.nestId : null, (r92 & 8192) != 0 ? bird.lastRideEndedAt : null, (r92 & 16384) != 0 ? bird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.peril : false, (r92 & 65536) != 0 ? bird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.offline : false, (r92 & 524288) != 0 ? bird.license : null, (r92 & 1048576) != 0 ? bird.areaKey : null, (r92 & 2097152) != 0 ? bird.fleetId : null, (r92 & 4194304) != 0 ? bird.nestPurpose : null, (r92 & 8388608) != 0 ? bird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r92 & 33554432) != 0 ? bird.badgeType : null, (r92 & 67108864) != 0 ? bird.bountyReasons : null, (r92 & 134217728) != 0 ? bird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? bird.ephemeralId : null, (r92 & 536870912) != 0 ? bird.hasHelmet : false, (r92 & 1073741824) != 0 ? bird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? bird.bleMacAddress : null, (r93 & 1) != 0 ? bird.cellId : null, (r93 & 2) != 0 ? bird.externalFeedType : null);
            interfaceC32604Eg1.mo104915c(new C29560vT(copy));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m81069a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/BirdInspection;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$l */
    /* loaded from: classes2.dex */
    public static final class C8366l extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends BirdInspection>> {

        /* renamed from: h */
        public final /* synthetic */ String f37785h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8366l(String str) {
            super(1);
            this.f37785h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends BirdInspection> invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C36361Uh5.this.f37765g.mo93947x(this.f37785h, Resolution.CANCELED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/w;", "Lco/bird/android/model/BirdInspection;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$m */
    /* loaded from: classes2.dex */
    public static final class C8367m extends Lambda implements Function1<C24576w<BirdInspection>, Unit> {
        public C8367m() {
            super(1);
        }

        /* renamed from: a */
        public final void m81067a(C24576w<BirdInspection> c24576w) {
            S74.C7343a.showProgress$default(C36361Uh5.this.f37762d, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<BirdInspection> c24576w) {
            m81067a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdInspection;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BirdInspection;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$n */
    /* loaded from: classes2.dex */
    public static final class C8368n extends Lambda implements Function1<BirdInspection, Unit> {
        public C8368n() {
            super(1);
        }

        /* renamed from: a */
        public final void m81066a(BirdInspection birdInspection) {
            C36361Uh5.this.f37763e.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdInspection birdInspection) {
            m81066a(birdInspection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uh5$o */
    /* loaded from: classes2.dex */
    public static final class C8369o extends Lambda implements Function1<Throwable, Unit> {
        public C8369o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C36361Uh5.this.f37762d.error(C45871nl4.cant_fix_error_message);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u000520\u0010\u0004\u001a,\u0012\u0004\u0012\u00020\u0001 \u0003*\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u00020\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Ljava/util/ArrayList;", "Lco/bird/android/model/BirdInspectionPoint;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "inspectionPointsList", "", C17296a.f69688o, "(Ljava/util/ArrayList;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$p */
    /* loaded from: classes2.dex */
    public static final class C8370p extends Lambda implements Function1<ArrayList<BirdInspectionPoint>, Unit> {
        public C8370p() {
            super(1);
        }

        /* renamed from: a */
        public final void m81065a(ArrayList<BirdInspectionPoint> inspectionPointsList) {
            String m81113X = C36361Uh5.this.m81113X();
            if (m81113X != null) {
                C36361Uh5 c36361Uh5 = C36361Uh5.this;
                InterfaceC40099e13 interfaceC40099e13 = c36361Uh5.f37763e;
                WireBird m81114W = c36361Uh5.m81114W();
                MechanicPhotoMode mechanicPhotoMode = MechanicPhotoMode.INSPECTION;
                Location m81112Y = c36361Uh5.m81112Y();
                Intrinsics.checkNotNullExpressionValue(inspectionPointsList, "inspectionPointsList");
                interfaceC40099e13.mo37196B1(m81114W, mechanicPhotoMode, m81113X, m81112Y, inspectionPointsList, null);
                c36361Uh5.f37763e.close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ArrayList<BirdInspectionPoint> arrayList) {
            m81065a(arrayList);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uh5$q */
    /* loaded from: classes2.dex */
    public static final class C8371q extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Uh5$q$a */
        /* loaded from: classes2.dex */
        public static final class C8372a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36361Uh5 f37791g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8372a(C36361Uh5 c36361Uh5) {
                super(0);
                this.f37791g = c36361Uh5;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f37791g.m81093r0();
            }
        }

        public C8371q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            H31.C3014a.showDialog$default(C36361Uh5.this.f37762d, M93.f22742d, false, false, new C8372a(C36361Uh5.this), null, null, null, 116, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uh5$r */
    /* loaded from: classes2.dex */
    public static final class C8373r extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Uh5$r$a */
        /* loaded from: classes2.dex */
        public static final class C8374a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36361Uh5 f37793g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8374a(C36361Uh5 c36361Uh5) {
                super(0);
                this.f37793g = c36361Uh5;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f37793g.m81103h0();
            }
        }

        public C8373r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            H31.C3014a.showDialog$default(C36361Uh5.this.f37762d, C37490Zd0.f48850d, false, false, new C8374a(C36361Uh5.this), null, null, null, 116, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uh5$s */
    /* loaded from: classes2.dex */
    public static final class C8375s extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Uh5$s$a */
        /* loaded from: classes2.dex */
        public static final class C8376a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36361Uh5 f37795g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8376a(C36361Uh5 c36361Uh5) {
                super(0);
                this.f37795g = c36361Uh5;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f37795g.m81105f0();
            }
        }

        public C8375s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            H31.C3014a.showDialog$default(C36361Uh5.this.f37762d, C34907Oc0.f26890d, false, false, new C8376a(C36361Uh5.this), null, null, null, 116, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/w;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$t */
    /* loaded from: classes2.dex */
    public static final class C8377t extends Lambda implements Function1<C24576w<WireBird>, Unit> {
        public C8377t() {
            super(1);
        }

        /* renamed from: a */
        public final void m81064a(C24576w<WireBird> c24576w) {
            S74.C7343a.showProgress$default(C36361Uh5.this.f37762d, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<WireBird> c24576w) {
            m81064a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uh5$u */
    /* loaded from: classes2.dex */
    public static final class C8378u extends Lambda implements Function1<WireBird, Unit> {
        public C8378u() {
            super(1);
        }

        /* renamed from: a */
        public final void m81063a(WireBird it) {
            InterfaceC32604Eg1 interfaceC32604Eg1 = C36361Uh5.this.f37764f;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC32604Eg1.mo104915c(new C29560vT(it));
            C36361Uh5.this.f37763e.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m81063a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uh5$v */
    /* loaded from: classes2.dex */
    public static final class C8379v extends Lambda implements Function1<Throwable, Unit> {
        public C8379v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C36361Uh5.this.f37762d.error(C45871nl4.not_damaged_error_message);
            C41318g46.m40159e(th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36361Uh5(LifecycleScopeProvider<EnumC7097RE> scopeProvider, Context context, InterfaceC37297Yh5 ui, InterfaceC40099e13 navigator, InterfaceC32604Eg1 eventBus, FO2 mechanicManager) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(mechanicManager, "mechanicManager");
        this.f37761c = context;
        this.f37762d = ui;
        this.f37763e = navigator;
        this.f37764f = eventBus;
        this.f37765g = mechanicManager;
    }

    /* renamed from: S */
    public static final void m81118S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m81117T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m81116U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m81115V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m81109b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m81107d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m81106e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m81104g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m81102i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m81101j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m81100k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m81099l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final InterfaceC23434B m81098m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m81097n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m81096o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m81095p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m81094q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m81092s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final void m81091t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final void m81090u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public final void m81119R() {
        this.f37762d.mo64083m(m81114W().getCode());
        S74.C7343a.showProgress$default(this.f37762d, true, 0, 2, null);
        this.f37762d.mo64085gb();
        Observable<BirdInspection> mo93950r = this.f37765g.mo93950r(m81114W().getId());
        final C8351a c8351a = new C8351a();
        Observable<BirdInspection> doOnEach = mo93950r.doOnEach(new InterfaceC23484g() { // from class: Gh5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81118S(Function1.this, obj);
            }
        });
        final C8352b c8352b = new C8352b();
        Observable<BirdInspection> doOnNext = doOnEach.doOnNext(new InterfaceC23484g() { // from class: Hh5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81117T(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "internal fun continueToI…Timber.e(it)\n      })\n  }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8353c c8353c = new C8353c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Ih5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81116U(Function1.this, obj);
            }
        };
        final C8354d c8354d = new C8354d();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Jh5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81115V(Function1.this, obj);
            }
        });
    }

    /* renamed from: W */
    public final WireBird m81114W() {
        WireBird wireBird = this.f37767i;
        if (wireBird != null) {
            return wireBird;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bird");
        return null;
    }

    /* renamed from: X */
    public final String m81113X() {
        return this.f37766h;
    }

    /* renamed from: Y */
    public final Location m81112Y() {
        Location location = this.f37768j;
        if (location != null) {
            return location;
        }
        Intrinsics.throwUninitializedPropertyAccessException("location");
        return null;
    }

    /* renamed from: Z */
    public final ArrayList<BirdInspectionPoint> m81111Z(List<BirdInspectionJob> jobs, List<BirdInspectionPoint> list) {
        Collection emptyList;
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(jobs, "jobs");
        if (list != null) {
            emptyList = new ArrayList();
            for (Object obj2 : list) {
                BirdInspectionPoint birdInspectionPoint = (BirdInspectionPoint) obj2;
                Iterator<T> it = jobs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((BirdInspectionJob) obj).getPointId(), birdInspectionPoint.getId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    emptyList.add(obj2);
                }
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return new ArrayList<>(emptyList);
    }

    /* renamed from: a0 */
    public final void m81110a0() {
        S74.C7343a.showProgress$default(this.f37762d, true, 0, 2, null);
        this.f37762d.mo64082n9();
        Object m33094as = this.f37765g.mo93945z(m81114W().getId()).m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8355e c8355e = new C8355e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Fh5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81109b0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC52946zh5
    /* renamed from: b */
    public void mo538b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        m81089v0((WireBird) parcelableExtra);
        Parcelable parcelableExtra2 = intent.getParcelableExtra("location");
        Intrinsics.checkNotNull(parcelableExtra2);
        m81086x0((Location) parcelableExtra2);
        boolean booleanExtra = intent.getBooleanExtra("inspection_start_over", false);
        this.f37769k = booleanExtra;
        if (booleanExtra) {
            m81119R();
        } else {
            m81110a0();
        }
        Observable<ArrayList<BirdInspectionPoint>> observeOn = this.f37762d.mo64092S6().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.startRepairClicks()\n …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8370p c8370p = new C8370p();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ah5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81097n0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f37762d.mo64081x5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.notDamagedClicks()\n  …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8371q c8371q = new C8371q();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Lh5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81096o0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f37762d.mo64097A0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.cantFixClicks()\n     …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8373r c8373r = new C8373r();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Mh5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81095p0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f37762d.mo64086d().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.cancelClicks()\n      …dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8375s c8375s = new C8375s();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Nh5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81094q0(Function1.this, obj);
            }
        });
    }

    /* renamed from: c0 */
    public final void m81108c0() {
        Observable<Boolean> observeOn = this.f37762d.mo64087X3().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.inspectionAreaSelecti…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8360f c8360f = new C8360f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Kh5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81107d0(Function1.this, obj);
            }
        });
    }

    /* renamed from: f0 */
    public final void m81105f0() {
        String str = this.f37766h;
        if (str != null) {
            S74.C7343a.showProgress$default(this.f37762d, true, 0, 2, null);
            Observable<BirdInspection> mo93947x = this.f37765g.mo93947x(str, Resolution.CANCELED);
            final C8362h c8362h = new C8362h();
            Observable<BirdInspection> doOnEach = mo93947x.doOnEach(new InterfaceC23484g() { // from class: Eh5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36361Uh5.m81104g0(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doOnEach, "internal fun onCancelRep…(it)\n        })\n    }\n  }");
            m5716u(doOnEach, new C8363i(), new C8364j());
        }
    }

    /* renamed from: h0 */
    public final void m81103h0() {
        String str = this.f37766h;
        if (str != null) {
            S74.C7343a.showProgress$default(this.f37762d, true, 0, 2, null);
            FO2 fo2 = this.f37765g;
            String taskId = m81114W().getTaskId();
            Intrinsics.checkNotNull(taskId);
            Observable<WireBird> mo93975D = fo2.mo93975D(taskId);
            final C8365k c8365k = new C8365k();
            Observable<WireBird> doOnNext = mo93975D.doOnNext(new InterfaceC23484g() { // from class: Sh5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36361Uh5.m81099l0(Function1.this, obj);
                }
            });
            final C8366l c8366l = new C8366l(str);
            Observable<R> flatMap = doOnNext.flatMap(new InterfaceC23492o() { // from class: Th5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m81098m0;
                    m81098m0 = C36361Uh5.m81098m0(Function1.this, obj);
                    return m81098m0;
                }
            });
            final C8367m c8367m = new C8367m();
            Observable doOnEach = flatMap.doOnEach(new InterfaceC23484g() { // from class: Bh5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36361Uh5.m81102i0(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doOnEach, "internal fun onCantFixCo…(it)\n        })\n    }\n  }");
            Object m33094as = doOnEach.m33094as(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C8368n c8368n = new C8368n();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Ch5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36361Uh5.m81101j0(Function1.this, obj);
                }
            };
            final C8369o c8369o = new C8369o();
            ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Dh5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36361Uh5.m81100k0(Function1.this, obj);
                }
            });
        }
    }

    @Override // p000.InterfaceC52946zh5
    public void onBackPressed() {
        String str = this.f37766h;
        if (str != null) {
            Object m33094as = this.f37765g.mo93947x(str, Resolution.CANCELED).m33094as(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C8361g c8361g = new C8361g();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Oh5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36361Uh5.m81106e0(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: r0 */
    public final void m81093r0() {
        S74.C7343a.showProgress$default(this.f37762d, true, 0, 2, null);
        FO2 fo2 = this.f37765g;
        String taskId = m81114W().getTaskId();
        Intrinsics.checkNotNull(taskId);
        Observable<WireBird> mo93974F = fo2.mo93974F(taskId);
        final C8377t c8377t = new C8377t();
        Observable<WireBird> doOnEach = mo93974F.doOnEach(new InterfaceC23484g() { // from class: Ph5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81092s0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnEach, "internal fun onNotDamage…Timber.e(it)\n      })\n  }");
        Object m33094as = doOnEach.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8378u c8378u = new C8378u();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Qh5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81091t0(Function1.this, obj);
            }
        };
        final C8379v c8379v = new C8379v();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Rh5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36361Uh5.m81090u0(Function1.this, obj);
            }
        });
    }

    /* renamed from: v0 */
    public final void m81089v0(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<set-?>");
        this.f37767i = wireBird;
    }

    /* renamed from: w0 */
    public final void m81088w0(String str) {
        this.f37766h = str;
    }

    /* renamed from: x0 */
    public final void m81086x0(Location location) {
        Intrinsics.checkNotNullParameter(location, "<set-?>");
        this.f37768j = location;
    }
}
