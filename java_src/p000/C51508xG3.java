package p000;

import android.content.Intent;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PhotoReviewStatusKt;
import co.bird.android.model.wire.WireEndRidePhotoParkingEvaluation;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC41921h56;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LxG3;", "", "Landroid/content/Intent;", "intent", "", "f", "LYR4;", C17296a.f69688o, "LYR4;", "rideManager", "LEa;", "b", "LEa;", "analyticsManager", "LBG3;", "c", "LBG3;", "parkingPhotoHelpUi", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "e", "Le13;", "navigator", "<init>", "(LYR4;LEa;LBG3;Lcom/uber/autodispose/ScopeProvider;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParkingPhotoHelpPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingPhotoHelpPresenter.kt\nco/bird/android/app/feature/ridedetail/ParkingPhotoHelpPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,78:1\n180#2:79\n180#2:80\n*S KotlinDebug\n*F\n+ 1 ParkingPhotoHelpPresenter.kt\nco/bird/android/app/feature/ridedetail/ParkingPhotoHelpPresenterImpl\n*L\n47#1:79\n66#1:80\n*E\n"})
/* renamed from: xG3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51508xG3 {

    /* renamed from: a */
    public final YR4 f117259a;

    /* renamed from: b */
    public final InterfaceC1880Ea f117260b;

    /* renamed from: c */
    public final BG3 f117261c;

    /* renamed from: d */
    public final ScopeProvider f117262d;

    /* renamed from: e */
    public final InterfaceC40099e13 f117263e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xG3$a */
    /* loaded from: classes2.dex */
    public static final class C30075a extends Lambda implements Function1<String, Unit> {
        public C30075a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            boolean isBlank;
            BG3 bg3 = C51508xG3.this.f117261c;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            isBlank = StringsKt__StringsJVMKt.isBlank(it);
            bg3.mo112493L0(!isBlank);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xG3$b */
    /* loaded from: classes2.dex */
    public static final class C30076b extends Lambda implements Function1<Unit, InterfaceC23447K<? extends HM4<Object>>> {

        /* renamed from: h */
        public final /* synthetic */ String f117266h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30076b(String str) {
            super(1);
            this.f117266h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends HM4<Object>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C51508xG3.this.f117259a.mo75037j0(this.f117266h, C51508xG3.this.f117261c.mo112495C5());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xG3$c */
    /* loaded from: classes2.dex */
    public static final class C30077c extends Lambda implements Function1<HM4<Object>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireEndRidePhotoParkingEvaluation f117268h;

        /* renamed from: i */
        public final /* synthetic */ String f117269i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30077c(WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation, String str) {
            super(1);
            this.f117268h = wireEndRidePhotoParkingEvaluation;
            this.f117269i = str;
        }

        /* renamed from: a */
        public final void m5604a(HM4<Object> hm4) {
            C51508xG3.this.f117260b.mo55905y(new C43810kH3(null, null, null, this.f117268h.getId(), PhotoReviewStatusKt.toPhotoReviewStatus(this.f117268h), this.f117269i, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Object> hm4) {
            m5604a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xG3$d */
    /* loaded from: classes2.dex */
    public static final class C30078d extends Lambda implements Function1<HM4<Object>, Unit> {
        public C30078d() {
            super(1);
        }

        /* renamed from: a */
        public final void m5603a(HM4<Object> hm4) {
            if (hm4.m103939f()) {
                InterfaceC41921h56.C22549a.topToast$default(C51508xG3.this.f117261c, C45871nl4.parking_photo_feedback_sent, (EnumC40735f56) null, 2, (Object) null);
                C51508xG3.this.f117263e.mo37030e3();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Object> hm4) {
            m5603a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xG3$e */
    /* loaded from: classes2.dex */
    public static final class C30079e extends Lambda implements Function1<Throwable, Unit> {
        public C30079e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C51508xG3.this.f117261c.error(C45871nl4.error_generic_body);
        }
    }

    public C51508xG3(YR4 rideManager, InterfaceC1880Ea analyticsManager, BG3 parkingPhotoHelpUi, ScopeProvider scopeProvider, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(parkingPhotoHelpUi, "parkingPhotoHelpUi");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f117259a = rideManager;
        this.f117260b = analyticsManager;
        this.f117261c = parkingPhotoHelpUi;
        this.f117262d = scopeProvider;
        this.f117263e = navigator;
    }

    /* renamed from: g */
    public static final void m5609g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final InterfaceC23447K m5608h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m5607i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m5606j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m5605k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public void m5610f(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("ride_id");
        Intrinsics.checkNotNull(stringExtra);
        Parcelable parcelableExtra = intent.getParcelableExtra("parking_photo_evaluation");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f117261c.mo112493L0(false);
        Object m33094as = this.f117261c.mo112494G0().m33094as(AutoDispose.m45239a(this.f117262d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30075a c30075a = new C30075a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: sG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51508xG3.m5609g(Function1.this, obj);
            }
        });
        Observable<Unit> mo112492e = this.f117261c.mo112492e();
        final C30076b c30076b = new C30076b(stringExtra);
        Observable<R> switchMapSingle = mo112492e.switchMapSingle(new InterfaceC23492o() { // from class: tG3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m5608h;
                m5608h = C51508xG3.m5608h(Function1.this, obj);
                return m5608h;
            }
        });
        final C30077c c30077c = new C30077c((WireEndRidePhotoParkingEvaluation) parcelableExtra, stringExtra);
        Observable observeOn = switchMapSingle.doOnNext(new InterfaceC23484g() { // from class: uG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51508xG3.m5607i(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate(in…eneric_body)\n      })\n  }");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.f117262d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30078d c30078d = new C30078d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: vG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51508xG3.m5606j(Function1.this, obj);
            }
        };
        final C30079e c30079e = new C30079e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: wG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51508xG3.m5605k(Function1.this, obj);
            }
        });
    }
}
