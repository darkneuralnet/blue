package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.RideFeedbackCategoryTags;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\bD\u0010EJ:\u0010\n\u001a,\u0012(\u0012&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t0\b0\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\r\u001a\u00020\f2$\u0010\u000b\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t0\b0\u0006H\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0016R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109R\u0014\u0010A\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00109¨\u0006F"}, m28432d2 = {"Lg35;", "LQ25;", "Lco/bird/android/model/wire/WireRide;", "ride", "Lio/reactivex/F;", "LHM4;", "", "", "", "", "w", "map", "Lco/bird/android/model/RideFeedbackCategoryTags;", "s", "", "t", "r", "Landroid/content/Intent;", "intent", "b", "onBackPressed", "", "rating", "q", "(F)V", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "LFk1;", C17296a.f69688o, "LFk1;", "feedbackManager", "LGI3;", "LGI3;", "partnerManager", "Lgl;", "c", "Lgl;", "preference", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "e", "Le13;", "navigator", "Li35;", "f", "Li35;", "ui", "g", "Lco/bird/android/model/wire/WireRide;", "", "h", "Z", "feedbackTagsSet", "i", "Ljava/lang/String;", "partnerName", "j", "enableIssueCategoryButtons", "k", "enableIssueCategoryTabs", "LTq4;", "reactiveConfig", "<init>", "(LFk1;LGI3;Lgl;LTq4;Lcom/uber/autodispose/ScopeProvider;Le13;Li35;)V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideRatingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideRatingPresenter.kt\nco/bird/android/feature/rideendsummary/RideRatingPresenterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,294:1\n1#2:295\n199#3:296\n180#3:297\n180#3:298\n180#3:299\n180#3:300\n180#3:301\n180#3:302\n180#3:303\n180#3:305\n271#4:304\n*S KotlinDebug\n*F\n+ 1 RideRatingPresenter.kt\nco/bird/android/feature/rideendsummary/RideRatingPresenterImpl\n*L\n78#1:296\n130#1:297\n139#1:298\n155#1:299\n167#1:300\n181#1:301\n188#1:302\n197#1:303\n212#1:305\n203#1:304\n*E\n"})
/* renamed from: g35  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41307g35 implements Q25 {

    /* renamed from: a */
    public final InterfaceC32874Fk1 f81465a;

    /* renamed from: b */
    public final GI3 f81466b;

    /* renamed from: c */
    public final C22454gl f81467c;

    /* renamed from: d */
    public final ScopeProvider f81468d;

    /* renamed from: e */
    public final InterfaceC40099e13 f81469e;

    /* renamed from: f */
    public final InterfaceC42493i35 f81470f;

    /* renamed from: g */
    public WireRide f81471g;

    /* renamed from: h */
    public boolean f81472h;

    /* renamed from: i */
    public String f81473i;

    /* renamed from: j */
    public final boolean f81474j;

    /* renamed from: k */
    public final boolean f81475k;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g35$a */
    /* loaded from: classes3.dex */
    public static final class C20697a extends Lambda implements Function0<Unit> {
        public C20697a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C41307g35.this.f81469e.mo37183D2(AI4.PLAY_STORE.ordinal());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g35$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20698b extends FunctionReferenceImpl implements Function0<Unit> {
        public C20698b(Object obj) {
            super(0, obj, C41307g35.class, "closeDownWithThanks", "closeDownWithThanks()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((C41307g35) this.receiver).m40206r();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/MobilePartner;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/MobilePartner;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideRatingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideRatingPresenter.kt\nco/bird/android/feature/rideendsummary/RideRatingPresenterImpl$maybeGetAndSetPartnerName$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n1#2:295\n*E\n"})
    /* renamed from: g35$c */
    /* loaded from: classes3.dex */
    public static final class C20699c extends Lambda implements Function1<MobilePartner, Unit> {
        public C20699c() {
            super(1);
        }

        /* renamed from: a */
        public final void m40197a(MobilePartner mobilePartner) {
            String displayName = mobilePartner.getDisplayName();
            if (displayName != null) {
                C41307g35.this.f81473i = displayName;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MobilePartner mobilePartner) {
            m40197a(mobilePartner);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/MobilePartner;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/MobilePartner;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: g35$d */
    /* loaded from: classes3.dex */
    public static final class C20700d extends Lambda implements Function1<MobilePartner, Unit> {

        /* renamed from: g */
        public static final C20700d f81478g = new C20700d();

        public C20700d() {
            super(1);
        }

        /* renamed from: a */
        public final void m40196a(MobilePartner it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MobilePartner mobilePartner) {
            m40196a(mobilePartner);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T", "T1", "T2", "T3", "R", "t", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$5\n+ 2 RideRatingPresenter.kt\nco/bird/android/feature/rideendsummary/RideRatingPresenterImpl\n*L\n1#1,304:1\n206#2:305\n*E\n"})
    /* renamed from: g35$e */
    /* loaded from: classes3.dex */
    public static final class C20701e<T1, T2, T3, T4, R> implements InterfaceC23486i<Unit, T1, T2, T3, R> {
        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(Unit unit, T1 t1, T2 t2, T3 t3) {
            return (R) new C51106wb4(unit, (Float) t1, (String) t2, (List) t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g35$f */
    /* loaded from: classes3.dex */
    public static final class C20702f extends Lambda implements Function1<Integer, Unit> {
        public C20702f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer it) {
            InterfaceC42493i35 interfaceC42493i35 = C41307g35.this.f81470f;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC42493i35.mo21906T8(it.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "ratingVal", "", C17296a.f69688o, "(Ljava/lang/Float;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: g35$g */
    /* loaded from: classes3.dex */
    public static final class C20703g extends Lambda implements Function1<Float, Unit> {
        public C20703g() {
            super(1);
        }

        /* renamed from: a */
        public final void m40195a(Float ratingVal) {
            InterfaceC42493i35 interfaceC42493i35 = C41307g35.this.f81470f;
            Intrinsics.checkNotNullExpressionValue(ratingVal, "ratingVal");
            interfaceC42493i35.mo21900X(ratingVal.floatValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            m40195a(f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00012\u0087\u0001\u0010\u0006\u001a\u0082\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005 \u0003*@\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lwb4;", "", "", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: g35$h */
    /* loaded from: classes3.dex */
    public static final class C20704h extends Lambda implements Function1<C51106wb4<? extends Unit, ? extends Float, ? extends String, ? extends List<String>>, Unit> {
        public C20704h() {
            super(1);
        }

        /* renamed from: a */
        public final void m40194a(C51106wb4<Unit, Float, String, ? extends List<String>> c51106wb4) {
            List<String> list;
            Float ratingVal = c51106wb4.m6613b();
            String m6612c = c51106wb4.m6612c();
            List<String> issues = c51106wb4.m6611d();
            Intrinsics.checkNotNullExpressionValue(ratingVal, "ratingVal");
            if (ratingVal.floatValue() > 4.0f) {
                list = CollectionsKt__CollectionsKt.emptyList();
            } else {
                Intrinsics.checkNotNullExpressionValue(issues, "issues");
                list = CollectionsKt___CollectionsKt.toList(issues);
            }
            InterfaceC32874Fk1 interfaceC32874Fk1 = C41307g35.this.f81465a;
            WireRide wireRide = C41307g35.this.f81471g;
            if (wireRide == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ride");
                wireRide = null;
            }
            interfaceC32874Fk1.mo99883g(wireRide, ratingVal.floatValue(), m6612c, list);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends Unit, ? extends Float, ? extends String, ? extends List<String>> c51106wb4) {
            m40194a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00012\u0087\u0001\u0010\u0006\u001a\u0082\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005 \u0003*@\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lwb4;", "", "", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: g35$i */
    /* loaded from: classes3.dex */
    public static final class C20705i extends Lambda implements Function1<C51106wb4<? extends Unit, ? extends Float, ? extends String, ? extends List<String>>, Unit> {
        public C20705i() {
            super(1);
        }

        /* renamed from: a */
        public final void m40193a(C51106wb4<Unit, Float, String, ? extends List<String>> c51106wb4) {
            Float ratingVal = c51106wb4.m6613b();
            C41307g35 c41307g35 = C41307g35.this;
            Intrinsics.checkNotNullExpressionValue(ratingVal, "ratingVal");
            c41307g35.m40207q(ratingVal.floatValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends Unit, ? extends Float, ? extends String, ? extends List<String>> c51106wb4) {
            m40193a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g35$j */
    /* loaded from: classes3.dex */
    public static final class C20706j extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20706j f81483g = new C20706j();

        public C20706j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while handling rating submission click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010%\n\u0002\b\u0004\u0010\u000b\u001aº\u0001\u0012V\b\u0001\u0012R\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00070\u00060\u0004 \b*(\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00070\u00060\u0004\u0018\u00010\u00030\u0003 \b*\\\u0012V\b\u0001\u0012R\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00070\u00060\u0004 \b*(\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00070\u00060\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "", "", "", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: g35$k */
    /* loaded from: classes3.dex */
    public static final class C20707k extends Lambda implements Function1<Unit, InterfaceC23447K<? extends HM4<Map<String, ? extends List<? extends Map<String, String>>>>>> {
        public C20707k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends HM4<Map<String, List<Map<String, String>>>>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41307g35 c41307g35 = C41307g35.this;
            WireRide wireRide = c41307g35.f81471g;
            if (wireRide == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ride");
                wireRide = null;
            }
            return c41307g35.m40201w(wireRide);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072V\u0010\u0006\u001aR\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00040\u00030\u0001 \u0005*(\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00040\u00030\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LHM4;", "", "", "", "", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: g35$l */
    /* loaded from: classes3.dex */
    public static final class C20708l extends Lambda implements Function1<HM4<Map<String, ? extends List<? extends Map<String, String>>>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ float f81486h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20708l(float f) {
            super(1);
            this.f81486h = f;
        }

        /* renamed from: a */
        public final void m40192a(HM4<Map<String, List<Map<String, String>>>> hm4) {
            Map<String, List<Map<String, String>>> m103944a = hm4.m103944a();
            if (hm4.m103939f() && m103944a != null) {
                C41307g35.this.f81470f.mo21918Hb(C41307g35.this.m40205s(m103944a));
                C41307g35.this.f81472h = true;
            }
            C41307g35.this.f81470f.mo21913Jj(false);
            C41307g35.this.f81470f.mo21917Ib(false);
            if (!C41307g35.this.f81474j && !C41307g35.this.f81475k) {
                if (this.f81486h < 5.0f) {
                    C41307g35.this.f81470f.mo21884mg(true);
                    C41307g35.this.f81470f.mo21882q6(true);
                }
                C41307g35.this.f81470f.mo21879wj(true);
            } else if (C41307g35.this.f81474j) {
                if (this.f81486h < 5.0f) {
                    C41307g35.this.f81470f.mo21917Ib(true);
                }
            } else if (C41307g35.this.f81475k && this.f81486h < 5.0f) {
                C41307g35.this.f81470f.mo21913Jj(true);
                C41307g35.this.f81470f.mo21915J9(true);
                C41307g35.this.f81470f.mo21919Gl(false);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Map<String, ? extends List<? extends Map<String, String>>>> hm4) {
            m40192a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g35$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20709m extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C20709m f81487b = new C20709m();

        public C20709m() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g35$n */
    /* loaded from: classes3.dex */
    public static final class C20710n extends Lambda implements Function1<Unit, Unit> {
        public C20710n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            boolean z = true;
            C41307g35.this.f81470f.mo21920Fh(!C41307g35.this.f81470f.mo21914Jb());
            C41307g35.this.f81470f.mo21887hi(false);
            InterfaceC42493i35 interfaceC42493i35 = C41307g35.this.f81470f;
            if (!C41307g35.this.f81470f.mo21914Jb() && !C41307g35.this.f81470f.mo21888gh()) {
                z = false;
            }
            interfaceC42493i35.mo21879wj(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g35$o */
    /* loaded from: classes3.dex */
    public static final class C20711o extends Lambda implements Function1<Unit, Unit> {
        public C20711o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            boolean z = true;
            C41307g35.this.f81470f.mo21887hi(!C41307g35.this.f81470f.mo21888gh());
            C41307g35.this.f81470f.mo21920Fh(false);
            InterfaceC42493i35 interfaceC42493i35 = C41307g35.this.f81470f;
            if (!C41307g35.this.f81470f.mo21914Jb() && !C41307g35.this.f81470f.mo21888gh()) {
                z = false;
            }
            interfaceC42493i35.mo21879wj(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g35$p */
    /* loaded from: classes3.dex */
    public static final class C20712p extends Lambda implements Function1<Unit, Unit> {
        public C20712p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            if (!C41307g35.this.f81470f.mo21912P4()) {
                C41307g35.this.f81470f.mo21915J9(true);
            }
            if (C41307g35.this.f81470f.mo21905Ta()) {
                C41307g35.this.f81470f.mo21919Gl(false);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g35$q */
    /* loaded from: classes3.dex */
    public static final class C20713q extends Lambda implements Function1<Unit, Unit> {
        public C20713q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            if (!C41307g35.this.f81470f.mo21905Ta()) {
                C41307g35.this.f81470f.mo21919Gl(true);
            }
            if (C41307g35.this.f81470f.mo21912P4()) {
                C41307g35.this.f81470f.mo21915J9(false);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g35$r */
    /* loaded from: classes3.dex */
    public static final class C20714r extends Lambda implements Function1<Integer, Unit> {
        public C20714r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer it) {
            InterfaceC42493i35 interfaceC42493i35 = C41307g35.this.f81470f;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC42493i35.mo21916J2(it.intValue());
        }
    }

    public C41307g35(InterfaceC32874Fk1 feedbackManager, GI3 partnerManager, C22454gl preference, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC42493i35 ui) {
        boolean z;
        Intrinsics.checkNotNullParameter(feedbackManager, "feedbackManager");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f81465a = feedbackManager;
        this.f81466b = partnerManager;
        this.f81467c = preference;
        this.f81468d = scopeProvider;
        this.f81469e = navigator;
        this.f81470f = ui;
        this.f81473i = "Bird";
        boolean enableEndRideRatingIssuesV2Grouped = reactiveConfig.m82623f8().m73665a().getEndRideRating().getEnableEndRideRatingIssuesV2Grouped();
        boolean enableEndRideRatingIssuesV2Tabbed = reactiveConfig.m82623f8().m73665a().getEndRideRating().getEnableEndRideRatingIssuesV2Tabbed();
        boolean z2 = true;
        if (enableEndRideRatingIssuesV2Grouped && !enableEndRideRatingIssuesV2Tabbed) {
            z = true;
        } else {
            z = false;
        }
        this.f81474j = z;
        this.f81475k = (enableEndRideRatingIssuesV2Grouped && enableEndRideRatingIssuesV2Tabbed) ? z2 : false;
    }

    /* renamed from: A */
    public static final void m40233A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m40232B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m40231C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m40230D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m40229E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m40228F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m40227G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m40226H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m40225I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m40224J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m40203u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final Unit m40202v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23447K m40200x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m40199y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m40198z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.Q25
    /* renamed from: b */
    public void mo40222b(Intent intent) {
        boolean z;
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f81470f.mo21880ue(this.f81474j, this.f81475k);
        WireRide wireRide = (WireRide) intent.getParcelableExtra("ride");
        if (wireRide != null) {
            this.f81471g = wireRide;
        }
        float floatExtra = intent.getFloatExtra("rating", 5.0f);
        this.f81470f.mo21900X(floatExtra);
        AbstractC23442F<Unit> m40204t = m40204t();
        final C20707k c20707k = new C20707k();
        AbstractC23442F m33142Y = m40204t.m33165A(new InterfaceC23492o() { // from class: R25
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m40200x;
                m40200x = C41307g35.m40200x(Function1.this, obj);
                return m40200x;
            }
        }).m33152N(C23454a.m33087a()).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "override fun onCreate(in…ptInAppReview()\n    }\n  }");
        Object m33135e = m33142Y.m33135e(AutoDispose.m45239a(this.f81468d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20708l c20708l = new C20708l(floatExtra);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: a35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41307g35.m40231C(Function1.this, obj);
            }
        };
        final C20709m c20709m = C20709m.f81487b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: b35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41307g35.m40230D(Function1.this, obj);
            }
        });
        boolean z2 = this.f81474j;
        if (z2 || this.f81475k) {
            if (z2) {
                Observable<Unit> observeOn = this.f81470f.mo21886jc().observeOn(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(observeOn, "ui.vehicleButtonClicks()…dSchedulers.mainThread())");
                Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f81468d));
                Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C20710n c20710n = new C20710n();
                ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: c35
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C41307g35.m40229E(Function1.this, obj);
                    }
                });
                Observable<Unit> observeOn2 = this.f81470f.mo21877y4().observeOn(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.otherButtonClicks()\n …dSchedulers.mainThread())");
                Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f81468d));
                Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C20711o c20711o = new C20711o();
                ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: d35
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C41307g35.m40228F(Function1.this, obj);
                    }
                });
            } else if (this.f81475k) {
                Observable<Unit> observeOn3 = this.f81470f.mo21892cf().observeOn(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.vehicleTabClicks()\n  …dSchedulers.mainThread())");
                Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f81468d));
                Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C20712p c20712p = new C20712p();
                ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: e35
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C41307g35.m40227G(Function1.this, obj);
                    }
                });
                Observable<Unit> observeOn4 = this.f81470f.mo21890eh().observeOn(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.otherTabClicks()\n    …dSchedulers.mainThread())");
                Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f81468d));
                Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C20713q c20713q = new C20713q();
                ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: f35
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C41307g35.m40226H(Function1.this, obj);
                    }
                });
            }
            Observable<Integer> observeOn5 = this.f81470f.mo21907T0().observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn5, "ui.vehicleCount()\n      …dSchedulers.mainThread())");
            Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f81468d));
            Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C20714r c20714r = new C20714r();
            ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: S25
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41307g35.m40225I(Function1.this, obj);
                }
            });
            Observable<Integer> observeOn6 = this.f81470f.mo21883o3().observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn6, "ui.otherCount()\n        …dSchedulers.mainThread())");
            Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(this.f81468d));
            Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C20702f c20702f = new C20702f();
            ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: T25
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41307g35.m40224J(Function1.this, obj);
                }
            });
        }
        Observable<Float> observeOn7 = this.f81470f.mo21891ef().throttleFirst(750L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn7, "ui.ratingChanges()\n     …dSchedulers.mainThread())");
        Object m33094as7 = observeOn7.m33094as(AutoDispose.m45239a(this.f81468d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20703g c20703g = new C20703g();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: U25
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41307g35.m40199y(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom = this.f81470f.mo21893c().withLatestFrom(this.f81470f.mo21891ef(), this.f81470f.mo21885mb(), this.f81470f.mo21881qe(), new C20701e());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        final C20704h c20704h = new C20704h();
        Observable observeOn8 = withLatestFrom.doOnNext(new InterfaceC23484g() { // from class: X25
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41307g35.m40198z(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn8, "override fun onCreate(in…ptInAppReview()\n    }\n  }");
        Object m33094as8 = observeOn8.m33094as(AutoDispose.m45239a(this.f81468d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20705i c20705i = new C20705i();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Y25
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41307g35.m40233A(Function1.this, obj);
            }
        };
        final C20706j c20706j = C20706j.f81483g;
        ((ObservableSubscribeProxy) m33094as8).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Z25
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41307g35.m40232B(Function1.this, obj);
            }
        });
        this.f81470f.mo21921D();
        if (floatExtra == 5.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f81470f.mo21889f1();
        }
    }

    @Override // p000.Q25
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == AI4.PLAY_STORE.ordinal()) {
            m40206r();
        }
    }

    @Override // p000.Q25
    public void onBackPressed() {
        this.f81469e.mo37030e3();
    }

    /* renamed from: q */
    public final void m40207q(float f) {
        boolean z;
        C41318g46.m40163a("calling askRateOrCloseDown now with rating of " + f, new Object[0]);
        if (f == 5.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.f81467c.m37639c1() && !this.f81470f.mo21898Y0()) {
            this.f81467c.m37672U2();
            C41318g46.m40163a("calling showRateAppDialog now", new Object[0]);
            this.f81470f.mo21878y1(new C20697a(), new C20698b(this));
            return;
        }
        m40206r();
    }

    /* renamed from: r */
    public final void m40206r() {
        this.f81469e.mo37030e3();
        this.f81470f.topToast(C45871nl4.feedback_thank_you, EnumC40735f56.LONG);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.toMutableList((java.util.Collection) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        r3 = kotlin.collections.CollectionsKt___CollectionsKt.toMutableList((java.util.Collection) r3);
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RideFeedbackCategoryTags m40205s(Map<String, ? extends List<? extends Map<String, String>>> map) {
        List arrayList;
        List arrayList2;
        List<? extends Map<String, String>> list = map.get("vehicle");
        if (list == null || arrayList == null) {
            arrayList = new ArrayList();
        }
        List<? extends Map<String, String>> list2 = map.get(Stripe3ds2AuthParams.FIELD_APP);
        if (list2 == null || arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        return new RideFeedbackCategoryTags(arrayList, arrayList2);
    }

    /* renamed from: t */
    public final AbstractC23442F<Unit> m40204t() {
        WireRide wireRide = this.f81471g;
        AbstractC23442F<Unit> abstractC23442F = null;
        if (wireRide == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ride");
            wireRide = null;
        }
        String partnerId = wireRide.getPartnerId();
        if (partnerId != null) {
            AbstractC23442F<MobilePartner> m33142Y = this.f81466b.mo97362u(partnerId).m33142Y(C24542a.m31932c());
            final C20699c c20699c = new C20699c();
            AbstractC23442F<MobilePartner> m33101w = m33142Y.m33101w(new InterfaceC23484g() { // from class: V25
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41307g35.m40203u(Function1.this, obj);
                }
            });
            final C20700d c20700d = C20700d.f81478g;
            abstractC23442F = m33101w.m33157I(new InterfaceC23492o() { // from class: W25
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Unit m40202v;
                    m40202v = C41307g35.m40202v(Function1.this, obj);
                    return m40202v;
                }
            });
        }
        if (abstractC23442F == null) {
            AbstractC23442F<Unit> m33158H = AbstractC23442F.m33158H(Unit.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(m33158H, "run {\n      Single.just(Unit)\n    }");
            return m33158H;
        }
        return abstractC23442F;
    }

    /* renamed from: w */
    public final AbstractC23442F<HM4<Map<String, List<Map<String, String>>>>> m40201w(WireRide wireRide) {
        String str;
        WireBird bird;
        String str2 = null;
        if (!this.f81472h) {
            if (wireRide.getBirdId() != null) {
                str2 = wireRide.getBirdId();
            } else {
                WireBird bird2 = wireRide.getBird();
                if (bird2 != null) {
                    str = bird2.getId();
                } else {
                    str = null;
                }
                if (str != null && (bird = wireRide.getBird()) != null) {
                    str2 = bird.getId();
                }
            }
            return this.f81465a.mo99887c(str2);
        }
        AbstractC23442F<HM4<Map<String, List<Map<String, String>>>>> m33158H = AbstractC23442F.m33158H(HM4.m103935j(null));
        Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      Single.just<Resp…onse.success(null))\n    }");
        return m33158H;
    }
}
