package p000;

import android.app.Activity;
import android.location.Location;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.modelmanager.Filter;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.destination.Destination;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import co.bird.android.model.wire.configs.DestinationConfig;
import co.bird.android.model.wire.configs.RiderDestinationConfig;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.card.MaterialCardView;
import com.skydoves.balloon.Balloon;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bn\u0010oJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0016\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0016\u0010\u001b\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015H\u0016J\u0016\u0010\u001c\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u0006H\u0016R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00109\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u00010505048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>R \u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>R \u0010L\u001a\b\u0012\u0004\u0012\u00020I0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010<\u001a\u0004\bK\u0010>R\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010T\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u00010\b0\b0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010W\u001a\b\u0012\u0004\u0012\u00020\b0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010<\u001a\u0004\bV\u0010>R \u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010<\u001a\u0004\bY\u0010>R+\u0010a\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b-\u0010^\"\u0004\b_\u0010`R$\u0010e\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010^\"\u0004\bd\u0010`R$\u0010h\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010^\"\u0004\bg\u0010`R\u0014\u0010k\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006p"}, m28432d2 = {"LS11;", "LQ11;", "Lco/bird/android/model/destination/Destination;", "destination", "", "animate", "", "L1", "", "message", "clickToDismiss", "x1", "", "latitude", "longitude", "C1", "Lco/bird/android/model/persistence/Area;", "area", "I1", "M1", "z1", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "Lco/bird/android/model/wire/WireBird;", "filter", "w1", "z0", "Lco/bird/android/model/ParkingNest;", "addParkingFilter", "removeParkingFilter", PaymentMethod.BillingDetails.PARAM_ADDRESS, "H1", "", "resId", "P1", "K1", AbstractC3831J1.f16564d, "Landroid/app/Activity;", C17296a.f69688o, "Landroid/app/Activity;", "activity", "LF5;", "b", "LF5;", "binding", "LG95;", "c", "LG95;", "mapUi", "Ldr4;", DateTokenConverter.CONVERTER_KEY, "Ldr4;", "locationManager", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "kotlin.jvm.PlatformType", "e", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomsheetBehavior", "Lio/reactivex/Observable;", "f", "Lio/reactivex/Observable;", "G1", "()Lio/reactivex/Observable;", "selectDestinationClicks", "g", "Q1", "negativeButtonClicks", "h", "O1", "positiveButtonClicks", "i", "E1", "addressInputClicks", "Lco/bird/android/model/wire/WireLocation;", "j", "F1", "destinationPinDragged", "Lcom/skydoves/balloon/Balloon;", "k", "Lcom/skydoves/balloon/Balloon;", "destinationBalloon", "Lma4;", "l", "Lma4;", "_tooltipClicked", "m", "B1", "tooltipClicked", "n", "D1", "destinationPinClicks", "<set-?>", "o", "Lkotlin/properties/ReadWriteProperty;", "()Z", "setVisible", "(Z)V", "visible", "value", "getDestinationSelectionButtonVisible", "A1", "destinationSelectionButtonVisible", "N1", "y1", "selectionPinVisible", "R1", "()Ljava/lang/String;", "defaultTooltipText", "LTq4;", "reactiveConfig", "<init>", "(Landroid/app/Activity;LF5;LG95;Ldr4;LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDestinationUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DestinationUi.kt\nco/bird/android/app/feature/destination/DestinationUiImpl\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,245:1\n33#2,3:246\n1#3:249\n260#4:250\n262#4,2:251\n283#4,2:253\n260#4:255\n262#4,2:256\n*S KotlinDebug\n*F\n+ 1 DestinationUi.kt\nco/bird/android/app/feature/destination/DestinationUiImpl\n*L\n165#1:246,3\n152#1:250\n155#1:251,2\n160#1:253,2\n179#1:255\n181#1:256,2\n*E\n"})
/* renamed from: S11 */
/* loaded from: classes2.dex */
public final class S11 implements Q11 {

    /* renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f33010p = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(S11.class, "visible", "getVisible()Z", 0))};

    /* renamed from: q */
    public static final int f33011q = 8;

    /* renamed from: a */
    public final Activity f33012a;

    /* renamed from: b */
    public final C2136F5 f33013b;

    /* renamed from: c */
    public final G95 f33014c;

    /* renamed from: d */
    public final InterfaceC40001dr4 f33015d;

    /* renamed from: e */
    public final BottomSheetBehavior<ConstraintLayout> f33016e;

    /* renamed from: f */
    public final Observable<Unit> f33017f;

    /* renamed from: g */
    public final Observable<Unit> f33018g;

    /* renamed from: h */
    public final Observable<Unit> f33019h;

    /* renamed from: i */
    public final Observable<Unit> f33020i;

    /* renamed from: j */
    public final Observable<WireLocation> f33021j;

    /* renamed from: k */
    public Balloon f33022k;

    /* renamed from: l */
    public final C45168ma4<String> f33023l;

    /* renamed from: m */
    public final Observable<String> f33024m;

    /* renamed from: n */
    public final Observable<Unit> f33025n;

    /* renamed from: o */
    public final ReadWriteProperty f33026o;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: S11$a */
    /* loaded from: classes2.dex */
    public static final class C7309a extends Lambda implements Function1<LatLng, WireLocation> {

        /* renamed from: g */
        public static final C7309a f33027g = new C7309a();

        public C7309a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WireLocation invoke(LatLng latLng) {
            Intrinsics.checkNotNullParameter(latLng, "latLng");
            return WireLocationKt.toLocation$default(C37429Yw2.f47648a.m73962i(latLng), null, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/skydoves/balloon/Balloon$a;", "", C17296a.f69688o, "(Lcom/skydoves/balloon/Balloon$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: S11$b */
    /* loaded from: classes2.dex */
    public static final class C7310b extends Lambda implements Function1<Balloon.C18588a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f33028g;

        /* renamed from: h */
        public final /* synthetic */ S11 f33029h;

        /* renamed from: i */
        public final /* synthetic */ String f33030i;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: S11$b$a */
        /* loaded from: classes2.dex */
        public static final class C7311a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ S11 f33031g;

            /* renamed from: h */
            public final /* synthetic */ String f33032h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7311a(S11 s11, String str) {
                super(1);
                this.f33031g = s11;
                this.f33032h = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.f33031g.f33023l.accept(this.f33032h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7310b(boolean z, S11 s11, String str) {
            super(1);
            this.f33028g = z;
            this.f33029h = s11;
            this.f33030i = str;
        }

        /* renamed from: a */
        public final void m86095a(Balloon.C18588a createBirdTooltip) {
            Intrinsics.checkNotNullParameter(createBirdTooltip, "$this$createBirdTooltip");
            createBirdTooltip.m45624b1(new C7311a(this.f33029h, this.f33030i));
            if (!this.f33028g) {
                createBirdTooltip.m45638V0(8000L);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Balloon.C18588a c18588a) {
            m86095a(c18588a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, m28432d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 DestinationUi.kt\nco/bird/android/app/feature/destination/DestinationUiImpl\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,70:1\n166#2,4:71\n170#2:77\n172#2,5:80\n262#3,2:75\n262#3,2:78\n*S KotlinDebug\n*F\n+ 1 DestinationUi.kt\nco/bird/android/app/feature/destination/DestinationUiImpl\n*L\n169#1:75,2\n170#1:78,2\n*E\n"})
    /* renamed from: S11$c */
    /* loaded from: classes2.dex */
    public static final class C7312c extends ObservableProperty<Boolean> {

        /* renamed from: b */
        public final /* synthetic */ S11 f33033b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7312c(Object obj, S11 s11) {
            super(obj);
            this.f33033b = s11;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty<?> property, Boolean bool, Boolean bool2) {
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(property, "property");
            boolean booleanValue = bool2.booleanValue();
            if (bool.booleanValue() != booleanValue) {
                Balloon balloon = this.f33033b.f33022k;
                if (balloon != null) {
                    balloon.m45739O();
                }
                this.f33033b.f33022k = null;
                ImageView imageView = this.f33033b.f33013b.f8664G;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.selectDestinationButton");
                int i3 = 0;
                if (!booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                ConstraintLayout root = this.f33033b.f33013b.f8680l.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "binding.destinationSelectionView.root");
                if (!booleanValue) {
                    i3 = 8;
                }
                root.setVisibility(i3);
                BottomSheetBehavior bottomSheetBehavior = this.f33033b.f33016e;
                if (booleanValue) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
                bottomSheetBehavior.m50082p0(i2);
            }
        }
    }

    public S11(Activity activity, C2136F5 binding, G95 mapUi, InterfaceC40001dr4 locationManager, C36207Tq4 reactiveConfig) {
        RiderDestinationConfig rider;
        String title;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f33012a = activity;
        this.f33013b = binding;
        this.f33014c = mapUi;
        this.f33015d = locationManager;
        BottomSheetBehavior<ConstraintLayout> m50133G = BottomSheetBehavior.m50133G(binding.f8680l.getRoot());
        Intrinsics.checkNotNullExpressionValue(m50133G, "from(binding.destinationSelectionView.root)");
        this.f33016e = m50133G;
        ImageView imageView = binding.f8664G;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.selectDestinationButton");
        this.f33017f = C44626lf5.debounceClicks$default(imageView, 0L, 1, null);
        Button button = binding.f8680l.f32739b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.destinationSelec…View.destinationCancelBtn");
        this.f33018g = C44626lf5.debounceClicks$default(button, 0L, 1, null);
        Button button2 = binding.f8680l.f32740c;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.destinationSelec…iew.destinationConfirmBtn");
        this.f33019h = C44626lf5.debounceClicks$default(button2, 0L, 1, null);
        MaterialCardView materialCardView = binding.f8680l.f32742e;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "binding.destinationSelec…displayedAddressContainer");
        this.f33020i = C44626lf5.debounceClicks$default(materialCardView, 0L, 1, null);
        Observable<LatLng> centerLocationChanged = mapUi.centerLocationChanged();
        final C7309a c7309a = C7309a.f33027g;
        Observable map = centerLocationChanged.map(new InterfaceC23492o() { // from class: R11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireLocation m86102b;
                m86102b = S11.m86102b(Function1.this, obj);
                return m86102b;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "mapUi.centerLocationChan…atLng).toLocation()\n    }");
        this.f33021j = map;
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f33023l = m25409g;
        this.f33024m = m25409g;
        this.f33025n = mapUi.getDestinationFlagClicks();
        Delegates delegates = Delegates.INSTANCE;
        this.f33026o = new C7312c(Boolean.FALSE, this);
        DestinationConfig destination = reactiveConfig.m82623f8().m73665a().getDestination();
        if (destination != null && (rider = destination.getRider()) != null && (title = rider.getTitle()) != null) {
            binding.f8680l.f32741d.setText(title);
        }
    }

    /* renamed from: b */
    public static final WireLocation m86102b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireLocation) tmp0.invoke(obj);
    }

    @Override // p000.Q11
    /* renamed from: A1 */
    public void mo86121A1(boolean z) {
        if (z) {
            ImageView imageView = this.f33013b.f8664G;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.selectDestinationButton");
            imageView.setVisibility(0);
            return;
        }
        Balloon balloon = this.f33022k;
        if (balloon != null) {
            balloon.m45739O();
        }
        this.f33022k = null;
        ImageView imageView2 = this.f33013b.f8664G;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.selectDestinationButton");
        imageView2.setVisibility(4);
    }

    @Override // p000.Q11
    /* renamed from: B1 */
    public Observable<String> mo86120B1() {
        return this.f33024m;
    }

    @Override // p000.Q11
    /* renamed from: C1 */
    public void mo86119C1(double d, double d2) {
        this.f33014c.setDestination(this.f33015d.mo43616p().m73665a().getLatitude(), this.f33015d.mo43616p().m73665a().getLongitude(), d, d2);
    }

    @Override // p000.Q11
    /* renamed from: D1 */
    public Observable<Unit> mo86118D1() {
        return this.f33025n;
    }

    @Override // p000.Q11
    /* renamed from: E1 */
    public Observable<Unit> mo86117E1() {
        return this.f33020i;
    }

    @Override // p000.Q11
    /* renamed from: F1 */
    public Observable<WireLocation> mo86116F1() {
        return this.f33021j;
    }

    @Override // p000.Q11
    /* renamed from: G1 */
    public Observable<Unit> mo86115G1() {
        return this.f33017f;
    }

    @Override // p000.Q11
    /* renamed from: H1 */
    public void mo86114H1(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f33013b.f8680l.f32743f.setText(address);
    }

    @Override // p000.Q11
    /* renamed from: I1 */
    public void mo86113I1(Area area) {
        Intrinsics.checkNotNullParameter(area, "area");
        G95 g95 = this.f33014c;
        g95.showInfoWindowForArea(area, g95.getCenterLocation());
    }

    @Override // p000.Q11
    /* renamed from: J1 */
    public void mo86112J1() {
        this.f33014c.clearDestination();
    }

    @Override // p000.Q11
    /* renamed from: K1 */
    public void mo86111K1(int i) {
        this.f33013b.f8680l.f32739b.setText(i);
    }

    @Override // p000.Q11
    /* renamed from: L1 */
    public void mo86110L1(Destination destination, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Location m73963h = C37429Yw2.f47648a.m73963h(destination.getLatitude(), destination.getLongitude());
        this.f33013b.f8680l.f32743f.setText(destination.getAddress());
        if (!m86101c()) {
            return;
        }
        if (z) {
            MapUi.DefaultImpls.zoomTo$default(this.f33014c, m73963h, null, 2, null);
        } else {
            this.f33014c.moveTo(m73963h);
        }
    }

    @Override // p000.Q11
    /* renamed from: M1 */
    public void mo86109M1(double d, double d2) {
        this.f33014c.showInfoWindowForNonOperationalArea(new LatLng(d, d2));
    }

    @Override // p000.Q11
    /* renamed from: N1 */
    public boolean mo86108N1() {
        ImageView imageView = this.f33013b.f8679k;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.destinationSelectionPin");
        if (imageView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // p000.Q11
    /* renamed from: O1 */
    public Observable<Unit> mo86107O1() {
        return this.f33019h;
    }

    @Override // p000.Q11
    /* renamed from: P1 */
    public void mo86106P1(int i) {
        this.f33013b.f8680l.f32740c.setText(i);
    }

    @Override // p000.Q11
    /* renamed from: Q1 */
    public Observable<Unit> mo86105Q1() {
        return this.f33018g;
    }

    @Override // p000.Q11
    /* renamed from: R1 */
    public String mo86104R1() {
        String string = this.f33012a.getString(C45871nl4.destination_selection_default_tooltip);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…election_default_tooltip)");
        return string;
    }

    @Override // p000.Q11
    public void addParkingFilter(Filter<ParkingNest> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f33014c.addParkingFilter(filter);
    }

    /* renamed from: c */
    public boolean m86101c() {
        return ((Boolean) this.f33026o.getValue(this, f33010p[0])).booleanValue();
    }

    @Override // p000.Q11
    public void removeParkingFilter(Filter<ParkingNest> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f33014c.removeParkingFilter(filter);
    }

    @Override // p000.Q11
    public void setVisible(boolean z) {
        this.f33026o.setValue(this, f33010p[0], Boolean.valueOf(z));
    }

    @Override // p000.Q11
    /* renamed from: w1 */
    public void mo86100w1(Filter<WireBird> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f33014c.mo104256w1(filter);
    }

    @Override // p000.Q11
    /* renamed from: x1 */
    public void mo86099x1(String message, boolean z) {
        Intrinsics.checkNotNullParameter(message, "message");
        Balloon m99238a = K56.m99238a(this.f33012a, message, new C7310b(z, this, message));
        this.f33022k = m99238a;
        if (m99238a != null) {
            ImageView imageView = this.f33013b.f8664G;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.selectDestinationButton");
            Balloon.m45751H0(m99238a, imageView, 0, 0, 6, null);
        }
    }

    @Override // p000.Q11
    /* renamed from: y1 */
    public void mo86098y1(boolean z) {
        int i;
        ImageView imageView = this.f33013b.f8679k;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.destinationSelectionPin");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    @Override // p000.Q11
    /* renamed from: z0 */
    public void mo86097z0(Filter<WireBird> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f33014c.mo104253z0(filter);
    }

    @Override // p000.Q11
    /* renamed from: z1 */
    public void mo86096z1() {
        this.f33014c.hideInfoWindow();
    }
}
