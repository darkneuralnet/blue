package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ComplaintSection;
import co.bird.android.model.ComplaintType;
import co.bird.android.model.analytics.RiderBulkReportFraudButtonClicked;
import co.bird.android.model.constant.MapMode;
import co.bird.api.request.ComplaintSchemaType;
import co.bird.api.response.ComplaintSchemaResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC34088Kp0;
import p000.InterfaceC40099e13;
import p000.InterfaceC42952iq0;
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u000e\b\u0001\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\b\b\u0001\u0010+\u001a\u00020(\u0012\b\b\u0001\u0010/\u001a\u00020,¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R*\u00105\u001a\u0016\u0012\u0004\u0012\u000201\u0018\u000100j\n\u0012\u0004\u0012\u000201\u0018\u0001`28\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R*\u00107\u001a\u0016\u0012\u0004\u0012\u000201\u0018\u000100j\n\u0012\u0004\u0012\u000201\u0018\u0001`28\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R*\u00109\u001a\u0016\u0012\u0004\u0012\u000201\u0018\u000100j\n\u0012\u0004\u0012\u000201\u0018\u0001`28\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, m28432d2 = {"Lqq0;", "Liq0;", "Landroid/content/Intent;", "intent", "", "b", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "Lco/bird/api/request/ComplaintSchemaType;", "complaintSchemaType", C17296a.f69688o, "", "q", "()Z", "LKp0;", "LKp0;", "communityManager", "Lgl;", "Lgl;", "preference", "LTq4;", "c", "LTq4;", "reactiveConfig", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "LYR4;", "e", "LYR4;", "rideManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "f", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Lgs0;", "g", "Lgs0;", "ui", "Le13;", "h", "Le13;", "navigator", "Ljava/util/ArrayList;", "Lco/bird/android/model/ComplaintSection;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "damaged", "j", "badParking", "k", "badRiding", "Lco/bird/android/model/constant/MapMode;", "l", "Lco/bird/android/model/constant/MapMode;", "role", "<init>", "(LKp0;Lgl;LTq4;LEa;LYR4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lgs0;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplaintPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintPresenter.kt\nco/bird/android/app/feature/communitymode/presenter/ComplaintPresenterImpl\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,128:1\n6#2:129\n1#3:130\n1#3:137\n13#4,2:131\n15#4,2:135\n1109#5,2:133\n180#6:138\n180#6:139\n180#6:140\n180#6:141\n180#6:142\n199#6:143\n*S KotlinDebug\n*F\n+ 1 ComplaintPresenter.kt\nco/bird/android/app/feature/communitymode/presenter/ComplaintPresenterImpl\n*L\n63#1:129\n63#1:130\n63#1:131,2\n63#1:135,2\n63#1:133,2\n66#1:138\n70#1:139\n74#1:140\n78#1:141\n85#1:142\n104#1:143\n*E\n"})
/* renamed from: qq0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47696qq0 implements InterfaceC42952iq0 {

    /* renamed from: a */
    public final InterfaceC34088Kp0 f105886a;

    /* renamed from: b */
    public final C22454gl f105887b;

    /* renamed from: c */
    public final C36207Tq4 f105888c;

    /* renamed from: d */
    public final InterfaceC1880Ea f105889d;

    /* renamed from: e */
    public final YR4 f105890e;

    /* renamed from: f */
    public final LifecycleScopeProvider<EnumC7097RE> f105891f;

    /* renamed from: g */
    public final InterfaceC41786gs0 f105892g;

    /* renamed from: h */
    public final InterfaceC40099e13 f105893h;

    /* renamed from: i */
    public ArrayList<ComplaintSection> f105894i;

    /* renamed from: j */
    public ArrayList<ComplaintSection> f105895j;

    /* renamed from: k */
    public ArrayList<ComplaintSection> f105896k;

    /* renamed from: l */
    public MapMode f105897l;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ComplaintSchemaResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/ComplaintSchemaResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qq0$a */
    /* loaded from: classes2.dex */
    public static final class C27699a extends Lambda implements Function1<ComplaintSchemaResponse, Unit> {
        public C27699a() {
            super(1);
        }

        /* renamed from: a */
        public final void m16932a(ComplaintSchemaResponse complaintSchemaResponse) {
            C47696qq0 c47696qq0 = C47696qq0.this;
            List<ComplaintSection> damaged = complaintSchemaResponse.getDamaged();
            Intrinsics.checkNotNull(damaged, "null cannot be cast to non-null type java.util.ArrayList<co.bird.android.model.ComplaintSection>{ kotlin.collections.TypeAliasesKt.ArrayList<co.bird.android.model.ComplaintSection> }");
            c47696qq0.f105894i = (ArrayList) damaged;
            C47696qq0 c47696qq02 = C47696qq0.this;
            List<ComplaintSection> badParking = complaintSchemaResponse.getBadParking();
            Intrinsics.checkNotNull(badParking, "null cannot be cast to non-null type java.util.ArrayList<co.bird.android.model.ComplaintSection>{ kotlin.collections.TypeAliasesKt.ArrayList<co.bird.android.model.ComplaintSection> }");
            c47696qq02.f105895j = (ArrayList) badParking;
            C47696qq0 c47696qq03 = C47696qq0.this;
            List<ComplaintSection> badRiding = complaintSchemaResponse.getBadRiding();
            Intrinsics.checkNotNull(badRiding, "null cannot be cast to non-null type java.util.ArrayList<co.bird.android.model.ComplaintSection>{ kotlin.collections.TypeAliasesKt.ArrayList<co.bird.android.model.ComplaintSection> }");
            c47696qq03.f105896k = (ArrayList) badRiding;
            C47696qq0.this.f105892g.mo35695k(false);
            C47696qq0.this.f105892g.mo35693x8(true);
            C47696qq0.this.f105892g.mo35697aj(C47696qq0.this.f105888c.m82623f8().getValue().getEnableReportBadRiding());
            C47696qq0.this.f105892g.mo35698Yh(C47696qq0.this.m16933q());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ComplaintSchemaResponse complaintSchemaResponse) {
            m16932a(complaintSchemaResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qq0$b */
    /* loaded from: classes2.dex */
    public static final class C27700b extends Lambda implements Function1<Throwable, Unit> {
        public C27700b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C47696qq0.this.f105892g.mo35695k(false);
            C47696qq0.this.f105892g.error(th.getMessage());
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qq0$c */
    /* loaded from: classes2.dex */
    public static final class C27701c extends Lambda implements Function1<Unit, Unit> {
        public C27701c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13 interfaceC40099e13 = C47696qq0.this.f105893h;
            ArrayList<ComplaintSection> arrayList = C47696qq0.this.f105896k;
            Intrinsics.checkNotNull(arrayList);
            MapMode mapMode = C47696qq0.this.f105897l;
            if (mapMode == null) {
                Intrinsics.throwUninitializedPropertyAccessException("role");
                mapMode = null;
            }
            interfaceC40099e13.mo36957q4(arrayList, mapMode);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qq0$d */
    /* loaded from: classes2.dex */
    public static final class C27702d extends Lambda implements Function1<Unit, Unit> {
        public C27702d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13 interfaceC40099e13 = C47696qq0.this.f105893h;
            ComplaintType complaintType = ComplaintType.BAD_PARKING;
            ArrayList arrayList = C47696qq0.this.f105895j;
            Intrinsics.checkNotNull(arrayList);
            MapMode mapMode = C47696qq0.this.f105897l;
            if (mapMode == null) {
                Intrinsics.throwUninitializedPropertyAccessException("role");
                mapMode = null;
            }
            InterfaceC40099e13.C19924a.goToReport$default(interfaceC40099e13, complaintType, arrayList, null, mapMode, null, false, 52, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qq0$e */
    /* loaded from: classes2.dex */
    public static final class C27703e extends Lambda implements Function1<Unit, Unit> {
        public C27703e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13 interfaceC40099e13 = C47696qq0.this.f105893h;
            ComplaintType complaintType = ComplaintType.DAMAGED;
            ArrayList arrayList = C47696qq0.this.f105894i;
            Intrinsics.checkNotNull(arrayList);
            MapMode mapMode = C47696qq0.this.f105897l;
            if (mapMode == null) {
                Intrinsics.throwUninitializedPropertyAccessException("role");
                mapMode = null;
            }
            InterfaceC40099e13.C19924a.goToReport$default(interfaceC40099e13, complaintType, arrayList, null, mapMode, null, false, 52, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qq0$f */
    /* loaded from: classes2.dex */
    public static final class C27704f extends Lambda implements Function1<Unit, Unit> {
        public C27704f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C47696qq0.this.f105889d.mo55956N(new RiderBulkReportFraudButtonClicked());
            InterfaceC40099e13 interfaceC40099e13 = C47696qq0.this.f105893h;
            MapMode mapMode = C47696qq0.this.f105897l;
            if (mapMode == null) {
                Intrinsics.throwUninitializedPropertyAccessException("role");
                mapMode = null;
            }
            InterfaceC40099e13.C19924a.goToReportMultipleBirdsFraud$default(interfaceC40099e13, mapMode, null, Integer.valueOf(EnumC49749uI4.REPORT_FRAUD.ordinal()), 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qq0$g */
    /* loaded from: classes2.dex */
    public static final class C27705g extends Lambda implements Function1<Unit, Unit> {
        public C27705g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.navigateToHelp$default(C47696qq0.this.f105893h, MapMode.RIDER, null, false, Boolean.valueOf(C47696qq0.this.f105890e.mo75061N()), 6, null);
        }
    }

    public C47696qq0(InterfaceC34088Kp0 communityManager, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, YR4 rideManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC41786gs0 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(communityManager, "communityManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f105886a = communityManager;
        this.f105887b = preference;
        this.f105888c = reactiveConfig;
        this.f105889d = analyticsManager;
        this.f105890e = rideManager;
        this.f105891f = scopeProvider;
        this.f105892g = ui;
        this.f105893h = navigator;
    }

    /* renamed from: j */
    public static final void m16940j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m16939k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m16938l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m16937m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m16936n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m16935o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m16934p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC42952iq0
    /* renamed from: a */
    public void mo16949a(ComplaintSchemaType complaintSchemaType) {
        Intrinsics.checkNotNullParameter(complaintSchemaType, "complaintSchemaType");
        this.f105892g.mo35695k(true);
        Object m33135e = InterfaceC34088Kp0.C4602a.complaintsSchema$default(this.f105886a, complaintSchemaType, null, 2, null).m33135e(AutoDispose.m45239a(this.f105891f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27699a c27699a = new C27699a();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: oq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47696qq0.m16940j(Function1.this, obj);
            }
        };
        final C27700b c27700b = new C27700b();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: pq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47696qq0.m16939k(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC42952iq0
    /* renamed from: b */
    public void mo16948b(Intent intent) {
        Enum r8;
        Unit unit;
        boolean equals;
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("map_mode");
        if (stringExtra != null) {
            try {
                Object[] enumConstants = MapMode.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r8 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = MapMode.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    r8 = (Enum) obj2;
                    if (Intrinsics.areEqual(r8.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r8 = null;
        MapMode mapMode = (MapMode) r8;
        if (mapMode != null) {
            this.f105897l = mapMode;
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            return;
        }
        InterfaceC42952iq0.C24602a.getComplaintsSchema$default(this, null, 1, null);
        Object m33094as = this.f105892g.mo35694ub().m33094as(AutoDispose.m45239a(this.f105891f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27701c c27701c = new C27701c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: jq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C47696qq0.m16938l(Function1.this, obj3);
            }
        });
        Object m33094as2 = this.f105892g.mo35692z8().m33094as(AutoDispose.m45239a(this.f105891f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27702d c27702d = new C27702d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: kq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C47696qq0.m16937m(Function1.this, obj3);
            }
        });
        Object m33094as3 = this.f105892g.mo35691zi().m33094as(AutoDispose.m45239a(this.f105891f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27703e c27703e = new C27703e();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: lq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C47696qq0.m16936n(Function1.this, obj3);
            }
        });
        Object m33094as4 = this.f105892g.mo35696c8().m33094as(AutoDispose.m45239a(this.f105891f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27704f c27704f = new C27704f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: mq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C47696qq0.m16935o(Function1.this, obj3);
            }
        });
        Object m33094as5 = this.f105892g.mo35699P8().m33094as(AutoDispose.m45239a(this.f105891f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27705g c27705g = new C27705g();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: nq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C47696qq0.m16934p(Function1.this, obj3);
            }
        });
    }

    @Override // p000.InterfaceC42952iq0
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == EnumC49749uI4.REPORT_FRAUD.ordinal()) {
            if (intent == null) {
                intent = new Intent();
            }
            Intent putExtra = intent.putExtra("complaint_type", "REPORT_FRAUD");
            Intrinsics.checkNotNullExpressionValue(putExtra, "data ?: Intent()).putExt…stCode.REPORT_FRAUD.name)");
            this.f105893h.mo37029e4(i2, putExtra);
        }
    }

    /* renamed from: q */
    public final boolean m16933q() {
        return this.f105888c.m82623f8().getValue().getChargerConfig().getEnableReportMultipleBirdsRider();
    }
}
