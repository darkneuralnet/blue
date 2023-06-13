package p000;

import android.content.Intent;
import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ComplaintSection;
import co.bird.android.model.ComplaintType;
import co.bird.android.model.NearbyRide;
import co.bird.android.model.RideTrack;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import co.bird.api.response.RidesNearbyResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.networking.FraudDetectionData;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C1639Dw;
import p000.InterfaceC3815Iw;
import p000.InterfaceC40099e13;
import p000.S74;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0001\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\u0007J\b\u0010\t\u001a\u00020\u0004H\u0016J\u001d\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R&\u00100\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, m28432d2 = {"LDw;", "Lnw;", "Landroid/content/Intent;", "intent", "", "b", "s", "()V", "q", "A", "LHM4;", "Lco/bird/api/response/RidesNearbyResponse;", "response", "z", "(LHM4;)V", "Ldr4;", C17296a.f69688o, "Ldr4;", "reactiveLocationManager", "LKp0;", "LKp0;", "communityManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "c", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LIw;", DateTokenConverter.CONVERTER_KEY, "LIw;", "ui", "Le13;", "e", "Le13;", "navigator", "Lco/bird/android/model/wire/WireLocation;", "f", "Lco/bird/android/model/wire/WireLocation;", "lastLocation", "", "g", "Ljava/lang/Long;", FraudDetectionData.KEY_TIMESTAMP, "Ljava/util/ArrayList;", "Lco/bird/android/model/ComplaintSection;", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "sections", "Lco/bird/android/model/constant/MapMode;", "i", "Lco/bird/android/model/constant/MapMode;", "role", "<init>", "(Ldr4;LKp0;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LIw;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadRidingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadRidingPresenter.kt\nco/bird/android/app/feature/communitymode/presenter/BadRidingPresenterImpl\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,185:1\n6#2:186\n1#3:187\n1#3:194\n13#4,2:188\n15#4,2:192\n1109#5,2:190\n180#6:195\n180#6:196\n180#6:197\n180#6:198\n180#6:199\n199#6:200\n*S KotlinDebug\n*F\n+ 1 BadRidingPresenter.kt\nco/bird/android/app/feature/communitymode/presenter/BadRidingPresenterImpl\n*L\n60#1:186\n60#1:187\n60#1:188,2\n60#1:192,2\n60#1:190,2\n65#1:195\n73#1:196\n79#1:197\n97#1:198\n118#1:199\n148#1:200\n*E\n"})
/* renamed from: Dw */
/* loaded from: classes2.dex */
public final class C1639Dw implements InterfaceC26742nw {

    /* renamed from: a */
    public final InterfaceC40001dr4 f6578a;

    /* renamed from: b */
    public final InterfaceC34088Kp0 f6579b;

    /* renamed from: c */
    public final LifecycleScopeProvider<EnumC7097RE> f6580c;

    /* renamed from: d */
    public final InterfaceC3815Iw f6581d;

    /* renamed from: e */
    public final InterfaceC40099e13 f6582e;

    /* renamed from: f */
    public WireLocation f6583f;

    /* renamed from: g */
    public Long f6584g;

    /* renamed from: h */
    public ArrayList<ComplaintSection> f6585h;

    /* renamed from: i */
    public MapMode f6586i;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw$a */
    /* loaded from: classes2.dex */
    public static final class C1640a extends Lambda implements Function1<Unit, Unit> {
        public C1640a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            if (C1639Dw.this.f6581d.mo96124i8()) {
                C1639Dw.this.f6581d.mo96125fg(false);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u008a\u0001\u0012>\b\u0001\u0012:\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0004\u0012\u00020\u0000 \u0007*\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0007*D\u0012>\b\u0001\u0012:\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0004\u0012\u00020\u0000 \u0007*\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LfM2;", "marker", "Lio/reactivex/K;", "Lkotlin/Pair;", "LHM4;", "", "Lco/bird/android/model/RideTrack;", "kotlin.jvm.PlatformType", "b", "(LfM2;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw$b */
    /* loaded from: classes2.dex */
    public static final class C1641b extends Lambda implements Function1<C40889fM2, InterfaceC23447K<? extends Pair<? extends HM4<List<? extends RideTrack>>, ? extends C40889fM2>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a:\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005 \u0006*\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/RideTrack;", "it", "Lkotlin/Pair;", "LfM2;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Dw$b$a */
        /* loaded from: classes2.dex */
        public static final class C1642a extends Lambda implements Function1<HM4<List<? extends RideTrack>>, Pair<? extends HM4<List<? extends RideTrack>>, ? extends C40889fM2>> {

            /* renamed from: g */
            public final /* synthetic */ C40889fM2 f6589g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1642a(C40889fM2 c40889fM2) {
                super(1);
                this.f6589g = c40889fM2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<HM4<List<RideTrack>>, C40889fM2> invoke(HM4<List<RideTrack>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Pair<>(it, this.f6589g);
            }
        }

        public C1641b() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<HM4<List<RideTrack>>, C40889fM2>> invoke(C40889fM2 marker) {
            Intrinsics.checkNotNullParameter(marker, "marker");
            InterfaceC34088Kp0 interfaceC34088Kp0 = C1639Dw.this.f6579b;
            Object m41531c = marker.m41531c();
            Intrinsics.checkNotNull(m41531c, "null cannot be cast to non-null type kotlin.String");
            Long l = C1639Dw.this.f6584g;
            Intrinsics.checkNotNull(l);
            AbstractC23442F<HM4<List<RideTrack>>> mo96318f = interfaceC34088Kp0.mo96318f((String) m41531c, l.longValue());
            final C1642a c1642a = new C1642a(marker);
            return mo96318f.m33157I(new InterfaceC23492o() { // from class: Ew
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C1639Dw.C1641b.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072>\u0010\u0006\u001a:\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\u0004\u0012\u00020\u0004 \u0005*\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "LHM4;", "", "Lco/bird/android/model/RideTrack;", "LfM2;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw$c */
    /* loaded from: classes2.dex */
    public static final class C1643c extends Lambda implements Function1<Pair<? extends HM4<List<? extends RideTrack>>, ? extends C40889fM2>, Unit> {
        public C1643c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends HM4<List<? extends RideTrack>>, ? extends C40889fM2> pair) {
            invoke2((Pair<HM4<List<RideTrack>>, C40889fM2>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<HM4<List<RideTrack>>, C40889fM2> pair) {
            HM4<List<RideTrack>> first = pair.getFirst();
            Intrinsics.checkNotNullExpressionValue(first, "it.first");
            HM4<List<RideTrack>> hm4 = first;
            if (hm4.m103939f()) {
                List<RideTrack> m103944a = hm4.m103944a();
                C40889fM2 second = pair.getSecond();
                Intrinsics.checkNotNullExpressionValue(second, "it.second");
                C40889fM2 c40889fM2 = second;
                if (m103944a != null) {
                    C1639Dw.this.f6581d.mo96132V5(m103944a, c40889fM2);
                }
            } else if (hm4.m103943b() == 408) {
                C1639Dw.this.f6581d.mo96127cj(C45871nl4.rides_timed_out);
            } else {
                C1639Dw.this.f6581d.error(C45871nl4.error_generic_body);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw$d */
    /* loaded from: classes2.dex */
    public static final class C1644d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C1644d f6591g = new C1644d();

        public C1644d() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw$e */
    /* loaded from: classes2.dex */
    public static final class C1645e extends Lambda implements Function1<Unit, Unit> {
        public C1645e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            WireLocation wireLocation = C1639Dw.this.f6583f;
            if (wireLocation != null) {
                C1639Dw.this.f6581d.mo96137R6(wireLocation, true);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw$f */
    /* loaded from: classes2.dex */
    public static final class C1646f extends Lambda implements Function1<Unit, Unit> {
        public C1646f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13 interfaceC40099e13 = C1639Dw.this.f6582e;
            ComplaintType complaintType = ComplaintType.BAD_RIDING;
            ArrayList arrayList = C1639Dw.this.f6585h;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sections");
                arrayList = null;
            }
            MapMode mapMode = C1639Dw.this.f6586i;
            if (mapMode == null) {
                Intrinsics.throwUninitializedPropertyAccessException("role");
                mapMode = null;
            }
            InterfaceC40099e13.C19924a.goToReport$default(interfaceC40099e13, complaintType, arrayList, null, mapMode, null, false, 52, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw$g */
    /* loaded from: classes2.dex */
    public static final class C1647g extends Lambda implements Function1<Unit, Unit> {
        public C1647g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13 interfaceC40099e13 = C1639Dw.this.f6582e;
            ComplaintType complaintType = ComplaintType.BAD_RIDING;
            ArrayList arrayList = C1639Dw.this.f6585h;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sections");
                arrayList = null;
            }
            String mo96126f4 = C1639Dw.this.f6581d.mo96126f4();
            MapMode mapMode = C1639Dw.this.f6586i;
            if (mapMode == null) {
                Intrinsics.throwUninitializedPropertyAccessException("role");
                mapMode = null;
            }
            InterfaceC40099e13.C19924a.goToReport$default(interfaceC40099e13, complaintType, arrayList, mo96126f4, mapMode, null, false, 48, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw$h */
    /* loaded from: classes2.dex */
    public static final class C1648h extends Lambda implements Function0<Unit> {
        public C1648h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C1639Dw.this.f6582e.close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw$i */
    /* loaded from: classes2.dex */
    public static final class C1649i extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C1649i() {
            super(1);
        }

        /* renamed from: a */
        public final void m109659a(InterfaceC23465c interfaceC23465c) {
            S74.C7343a.showProgress$default(C1639Dw.this.f6581d, true, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m109659a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "locationStream", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lco/bird/android/model/wire/WireLocation;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw$j */
    /* loaded from: classes2.dex */
    public static final class C1650j extends Lambda implements Function1<Location, WireLocation> {

        /* renamed from: g */
        public static final C1650j f6597g = new C1650j();

        public C1650j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireLocation invoke(Location locationStream) {
            Intrinsics.checkNotNullParameter(locationStream, "locationStream");
            return WireLocationKt.toLocation$default(locationStream, null, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "location", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw$k */
    /* loaded from: classes2.dex */
    public static final class C1651k extends Lambda implements Function1<WireLocation, Unit> {
        public C1651k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireLocation wireLocation) {
            invoke2(wireLocation);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WireLocation location) {
            C1639Dw.this.f6583f = location;
            InterfaceC3815Iw interfaceC3815Iw = C1639Dw.this.f6581d;
            Intrinsics.checkNotNullExpressionValue(location, "location");
            interfaceC3815Iw.mo96123k8(location);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireLocation;", "location", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/response/RidesNearbyResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireLocation;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw$l */
    /* loaded from: classes2.dex */
    public static final class C1652l extends Lambda implements Function1<WireLocation, InterfaceC23447K<? extends HM4<RidesNearbyResponse>>> {
        public C1652l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<RidesNearbyResponse>> invoke(WireLocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return C1639Dw.this.f6579b.mo96321c(location);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/RidesNearbyResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw$m */
    /* loaded from: classes2.dex */
    public static final class C1653m extends Lambda implements Function1<HM4<RidesNearbyResponse>, Unit> {
        public C1653m() {
            super(1);
        }

        /* renamed from: a */
        public final void m109656a(HM4<RidesNearbyResponse> hm4) {
            C1639Dw.this.f6581d.mo96142Ae(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<RidesNearbyResponse> hm4) {
            m109656a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/RidesNearbyResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dw$n */
    /* loaded from: classes2.dex */
    public static final class C1654n extends Lambda implements Function1<HM4<RidesNearbyResponse>, Unit> {
        public C1654n() {
            super(1);
        }

        /* renamed from: a */
        public final void m109655a(HM4<RidesNearbyResponse> response) {
            C1639Dw c1639Dw = C1639Dw.this;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            c1639Dw.m109663z(response);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<RidesNearbyResponse> hm4) {
            m109655a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Dw$o */
    /* loaded from: classes2.dex */
    public static final class C1655o extends Lambda implements Function1<Throwable, Unit> {
        public C1655o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C1639Dw.this.f6581d.error(C45871nl4.error_generic_body);
            C41318g46.m40159e(th);
        }
    }

    public C1639Dw(InterfaceC40001dr4 reactiveLocationManager, InterfaceC34088Kp0 communityManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC3815Iw ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(communityManager, "communityManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f6578a = reactiveLocationManager;
        this.f6579b = communityManager;
        this.f6580c = scopeProvider;
        this.f6581d = ui;
        this.f6582e = navigator;
    }

    /* renamed from: B */
    public static final void m109695B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23447K m109694C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m109693D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m109692E(C1639Dw this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        S74.C7343a.showProgress$default(this$0.f6581d, false, 0, 2, null);
    }

    /* renamed from: F */
    public static final void m109691F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m109690G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m109689H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final WireLocation m109688I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireLocation) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m109671r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m109669t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m109668u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m109667v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m109666w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m109665x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m109664y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public void m109696A() {
        Observable<Location> observeOn = this.f6578a.mo43627e(true).m33123k0().subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        final C1649i c1649i = new C1649i();
        Observable<Location> doOnSubscribe = observeOn.doOnSubscribe(new InterfaceC23484g() { // from class: Aw
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C1639Dw.m109689H(Function1.this, obj);
            }
        });
        final C1650j c1650j = C1650j.f6597g;
        Observable<R> map = doOnSubscribe.map(new InterfaceC23492o() { // from class: Bw
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireLocation m109688I;
                m109688I = C1639Dw.m109688I(Function1.this, obj);
                return m109688I;
            }
        });
        final C1651k c1651k = new C1651k();
        AbstractC23442F m33152N = map.doOnNext(new InterfaceC23484g() { // from class: Cw
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C1639Dw.m109695B(Function1.this, obj);
            }
        }).singleOrError().m33152N(C24542a.m31932c());
        final C1652l c1652l = new C1652l();
        AbstractC23442F m33152N2 = m33152N.m33165A(new InterfaceC23492o() { // from class: pw
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m109694C;
                m109694C = C1639Dw.m109694C(Function1.this, obj);
                return m109694C;
            }
        }).m33152N(C23454a.m33087a());
        final C1653m c1653m = new C1653m();
        AbstractC23442F m33110r = m33152N2.m33101w(new InterfaceC23484g() { // from class: qw
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C1639Dw.m109693D(Function1.this, obj);
            }
        }).m33110r(new InterfaceC23478a() { // from class: rw
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C1639Dw.m109692E(C1639Dw.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33110r, "override fun setupMap() …Timber.e(it)\n      })\n  }");
        Object m33135e = m33110r.m33135e(AutoDispose.m45239a(this.f6580c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1654n c1654n = new C1654n();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: sw
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C1639Dw.m109691F(Function1.this, obj);
            }
        };
        final C1655o c1655o = new C1655o();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: tw
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C1639Dw.m109690G(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC26742nw
    /* renamed from: b */
    public void mo22165b(Intent intent) {
        Enum r7;
        boolean equals;
        Intrinsics.checkNotNullParameter(intent, "intent");
        m109696A();
        ArrayList<ComplaintSection> parcelableArrayListExtra = intent.getParcelableArrayListExtra("complaint_section");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        this.f6585h = parcelableArrayListExtra;
        String stringExtra = intent.getStringExtra("map_mode");
        Unit unit = null;
        if (stringExtra != null) {
            try {
                Object[] enumConstants = MapMode.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r7 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = MapMode.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    r7 = (Enum) obj2;
                    if (Intrinsics.areEqual(r7.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r7 = null;
        MapMode mapMode = (MapMode) r7;
        if (mapMode != null) {
            this.f6586i = mapMode;
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            return;
        }
        this.f6581d.mo96122p7();
        Object m33094as = this.f6581d.mo96130W5().m33094as(AutoDispose.m45239a(this.f6580c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1645e c1645e = new C1645e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ow
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C1639Dw.m109666w(Function1.this, obj3);
            }
        });
        Object m33094as2 = this.f6581d.mo96121u1().m33094as(AutoDispose.m45239a(this.f6580c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1646f c1646f = new C1646f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: uw
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C1639Dw.m109665x(Function1.this, obj3);
            }
        });
        Object m33094as3 = this.f6581d.mo96141If().m33094as(AutoDispose.m45239a(this.f6580c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1647g c1647g = new C1647g();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: vw
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C1639Dw.m109664y(Function1.this, obj3);
            }
        });
        m109672q();
        m109670s();
    }

    /* renamed from: q */
    public final void m109672q() {
        Object m33094as = this.f6581d.mapClicks().m33094as(AutoDispose.m45239a(this.f6580c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1640a c1640a = new C1640a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: zw
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C1639Dw.m109671r(Function1.this, obj);
            }
        });
    }

    /* renamed from: s */
    public final void m109670s() {
        Observable<C40889fM2> markerClicks = this.f6581d.markerClicks();
        final C1641b c1641b = new C1641b();
        Observable<R> switchMapSingle = markerClicks.switchMapSingle(new InterfaceC23492o() { // from class: ww
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m109669t;
                m109669t = C1639Dw.m109669t(Function1.this, obj);
                return m109669t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapSingle, "@VisibleForTesting\n  int…       }\n      }, {})\n  }");
        Object m33094as = switchMapSingle.m33094as(AutoDispose.m45239a(this.f6580c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1643c c1643c = new C1643c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: xw
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C1639Dw.m109668u(Function1.this, obj);
            }
        };
        final C1644d c1644d = C1644d.f6591g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: yw
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C1639Dw.m109667v(Function1.this, obj);
            }
        });
    }

    /* renamed from: z */
    public final void m109663z(HM4<RidesNearbyResponse> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.m103939f()) {
            RidesNearbyResponse m103944a = response.m103944a();
            if (m103944a != null) {
                List<NearbyRide> rides = m103944a.getRides();
                this.f6584g = Long.valueOf(m103944a.getTime());
                if (rides.isEmpty()) {
                    WireLocation wireLocation = this.f6583f;
                    if (wireLocation != null) {
                        InterfaceC3815Iw.C3816a.zoomTo$default(this.f6581d, wireLocation, false, 2, null);
                    }
                    this.f6581d.mo96127cj(C45871nl4.no_rides_nearby);
                    return;
                }
                this.f6581d.mo96140N1(rides);
                this.f6581d.mo96127cj(C45871nl4.report_bad_riding_instructions);
            }
        } else if (response.m103943b() == 429) {
            this.f6581d.mo96120x6(new C1648h());
        } else {
            this.f6581d.error(C45871nl4.error_generic_body);
        }
    }
}
