package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.NonRepair;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.RepairFlow;
import co.bird.android.model.RepairIssue;
import co.bird.android.model.constant.InspectionContext;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.QuickLinkBehavior;
import co.bird.android.model.wire.WireQuickLink;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C50907wF4;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00107\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u000f0\u000f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, m28432d2 = {"LwF4;", "", "", "e", "", "Q", "Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/F;", "", "v", "", "birdId", "x", "R", "Lco/bird/android/model/RepairFlow;", "repairFlow", "", "requestCode", "U", "Lrn6;", C17296a.f69688o, "Lrn6;", "vehicleServicingManager", "LEa;", "b", "LEa;", "analyticsManager", "LDQ3;", "c", "LDQ3;", "permissionManager", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LWE4;", "LWE4;", "converter", "LGF4;", "f", "LGF4;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "g", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "h", "LTq4;", "reactiveConfig", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/a;", "repairFlowSubject", "<init>", "(Lrn6;LEa;LDQ3;Le13;LWE4;LGF4;Lcom/uber/autodispose/ScopeProvider;LTq4;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3OverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewPresenter.kt\nco/bird/android/feature/repair/v3/overview/RepairV3OverviewPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n199#2:250\n180#2:251\n180#2:252\n180#2:253\n180#2:254\n180#2:255\n180#2:256\n180#2:257\n180#2:258\n1747#3,3:259\n288#3,2:262\n1#4:264\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewPresenter.kt\nco/bird/android/feature/repair/v3/overview/RepairV3OverviewPresenter\n*L\n47#1:250\n61#1:251\n129#1:252\n143#1:253\n147#1:254\n153#1:255\n164#1:256\n197#1:257\n207#1:258\n222#1:259,3\n231#1:262,2\n*E\n"})
/* renamed from: wF4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50907wF4 {

    /* renamed from: a */
    public final InterfaceC48265rn6 f115690a;

    /* renamed from: b */
    public final InterfaceC1880Ea f115691b;

    /* renamed from: c */
    public final DQ3 f115692c;

    /* renamed from: d */
    public final InterfaceC40099e13 f115693d;

    /* renamed from: e */
    public final WE4 f115694e;

    /* renamed from: f */
    public final GF4 f115695f;

    /* renamed from: g */
    public final ScopeProvider f115696g;

    /* renamed from: h */
    public final C36207Tq4 f115697h;

    /* renamed from: i */
    public final C24552a<RepairFlow> f115698i;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wF4$a */
    /* loaded from: classes3.dex */
    public static final class C29820a extends Lambda implements Function1<DialogResponse, Boolean> {

        /* renamed from: g */
        public static final C29820a f115699g = new C29820a();

        public C29820a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(DialogResponse it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == DialogResponse.OK) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wF4$b */
    /* loaded from: classes3.dex */
    public static final class C29821b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f115701h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29821b(String str) {
            super(1);
            this.f115701h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C50907wF4.this.f115695f.m105597Ul(this.f115701h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RepairIssue;", "kotlin.jvm.PlatformType", "issue", "", C17296a.f69688o, "(Lco/bird/android/model/RepairIssue;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wF4$c */
    /* loaded from: classes3.dex */
    public static final class C29822c extends Lambda implements Function1<RepairIssue, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f115703h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29822c(String str) {
            super(1);
            this.f115703h = str;
        }

        /* renamed from: a */
        public final void m7109a(RepairIssue repairIssue) {
            InterfaceC40099e13.C19924a.goToRepairV3Issue$default(C50907wF4.this.f115693d, this.f115703h, null, repairIssue, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RepairIssue repairIssue) {
            m7109a(repairIssue);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/RepairCategory;", "Lco/bird/android/model/NonRepair;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wF4$d */
    /* loaded from: classes3.dex */
    public static final class C29823d extends Lambda implements Function1<Pair<? extends RepairCategory, ? extends NonRepair>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f115705h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29823d(String str) {
            super(1);
            this.f115705h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends RepairCategory, ? extends NonRepair> pair) {
            invoke2((Pair<RepairCategory, NonRepair>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<RepairCategory, NonRepair> pair) {
            C50907wF4.this.f115693d.mo37010i(this.f115705h, pair.component1(), pair.component2(), 10087);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RepairCategory;", "kotlin.jvm.PlatformType", "category", "", C17296a.f69688o, "(Lco/bird/android/model/RepairCategory;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wF4$e */
    /* loaded from: classes3.dex */
    public static final class C29824e extends Lambda implements Function1<RepairCategory, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f115707h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29824e(String str) {
            super(1);
            this.f115707h = str;
        }

        /* renamed from: a */
        public final void m7108a(RepairCategory repairCategory) {
            InterfaceC40099e13.C19924a.goToRepairV3Issue$default(C50907wF4.this.f115693d, this.f115707h, repairCategory, null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RepairCategory repairCategory) {
            m7108a(repairCategory);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "<anonymous parameter 0>", "Lco/bird/android/model/RepairFlow;", "repairFlow", C17296a.f69688o, "(Lkotlin/Unit;Lco/bird/android/model/RepairFlow;)Lco/bird/android/model/RepairFlow;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wF4$f */
    /* loaded from: classes3.dex */
    public static final class C29825f extends Lambda implements Function2<Unit, RepairFlow, RepairFlow> {

        /* renamed from: g */
        public static final C29825f f115708g = new C29825f();

        public C29825f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RepairFlow invoke(Unit unit, RepairFlow repairFlow) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(repairFlow, "repairFlow");
            return repairFlow;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RepairFlow;", "repairFlow", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/RepairFlow;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wF4$g */
    /* loaded from: classes3.dex */
    public static final class C29826g extends Lambda implements Function1<RepairFlow, InterfaceC24574u<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFQ3;", "response", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: wF4$g$a */
        /* loaded from: classes3.dex */
        public static final class C29827a extends Lambda implements Function1<FQ3, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public final /* synthetic */ C50907wF4 f115710g;

            /* renamed from: h */
            public final /* synthetic */ RepairFlow f115711h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29827a(C50907wF4 c50907wF4, RepairFlow repairFlow) {
                super(1);
                this.f115710g = c50907wF4;
                this.f115711h = repairFlow;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Unit> invoke(FQ3 response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.m107154a()) {
                    return this.f115710g.f115695f.m105594Xl(this.f115711h.getCode(), this.f115711h.getVehicleId()).m33125j0();
                }
                return AbstractC24507p.m32024u();
            }
        }

        public C29826g() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m7104c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Unit> invoke(RepairFlow repairFlow) {
            Intrinsics.checkNotNullParameter(repairFlow, "repairFlow");
            if (C50907wF4.this.f115697h.m82623f8().m73665a().getOperatorConfig().getFeatures().getRepair().getRequireVehicleScanConfirmationForRepair()) {
                AbstractC23442F<FQ3> m110485l = C50907wF4.this.f115692c.m110485l(Permission.CAMERA);
                final C29827a c29827a = new C29827a(C50907wF4.this, repairFlow);
                return m110485l.m33163C(new InterfaceC23492o() { // from class: xF4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m7104c;
                        m7104c = C50907wF4.C29826g.m7104c(Function1.this, obj);
                        return m7104c;
                    }
                });
            }
            return AbstractC24507p.m32068G(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wF4$h */
    /* loaded from: classes3.dex */
    public static final class C29828h extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Unit>> {

        /* renamed from: h */
        public final /* synthetic */ String f115713h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29828h(String str) {
            super(1);
            this.f115713h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C28237sD.progress$default(C50907wF4.this.f115690a.mo13668d(this.f115713h), C50907wF4.this.f115695f, 0, 2, (Object) null).m33042m(AbstractC23442F.m33158H(Unit.INSTANCE));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wF4$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29829i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C29829i(Object obj) {
            super(1, obj, C50907wF4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50907wF4) this.receiver).m7141Q(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wF4$j */
    /* loaded from: classes3.dex */
    public static final class C29830j extends Lambda implements Function1<Unit, Unit> {
        public C29830j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C50907wF4.this.f115693d.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wF4$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29831k extends FunctionReferenceImpl implements Function1<RepairFlow, Unit> {
        public C29831k(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m7102a(RepairFlow p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RepairFlow repairFlow) {
            m7102a(repairFlow);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wF4$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29832l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C29832l(Object obj) {
            super(1, obj, C50907wF4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50907wF4) this.receiver).m7141Q(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireQuickLink;", "kotlin.jvm.PlatformType", "quickLink", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireQuickLink;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wF4$m */
    /* loaded from: classes3.dex */
    public static final class C29833m extends Lambda implements Function1<WireQuickLink, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f115716h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29833m(String str) {
            super(1);
            this.f115716h = str;
        }

        /* renamed from: a */
        public final void m7101a(WireQuickLink wireQuickLink) {
            InterfaceC1880Ea interfaceC1880Ea = C50907wF4.this.f115691b;
            String str = this.f115716h;
            String url = wireQuickLink.getUrl();
            String linkType = wireQuickLink.getLinkType();
            if (linkType == null) {
                return;
            }
            String lowerCase = wireQuickLink.getLinkBehavior().name().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            interfaceC1880Ea.mo55905y(new C50880wC4(null, null, null, str, null, url, linkType, lowerCase, 23, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireQuickLink wireQuickLink) {
            m7101a(wireQuickLink);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireQuickLink;", "kotlin.jvm.PlatformType", "quickLink", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireQuickLink;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wF4$n */
    /* loaded from: classes3.dex */
    public static final class C29834n extends Lambda implements Function1<WireQuickLink, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f115718h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: wF4$n$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C29835a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[QuickLinkBehavior.values().length];
                try {
                    iArr[QuickLinkBehavior.EXTERNAL_WEB_VIEW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[QuickLinkBehavior.INSPECTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[QuickLinkBehavior.PAST_REPAIRS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29834n(String str) {
            super(1);
            this.f115718h = str;
        }

        /* renamed from: a */
        public final void m7100a(WireQuickLink wireQuickLink) {
            int i = C29835a.$EnumSwitchMapping$0[wireQuickLink.getLinkBehavior().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C50907wF4.this.f115693d.mo37144K(this.f115718h);
                        return;
                    }
                    return;
                }
                InterfaceC40099e13.C19924a.goToInspectionV3$default(C50907wF4.this.f115693d, this.f115718h, InspectionContext.SCANNER, null, 4, null);
                return;
            }
            String url = wireQuickLink.getUrl();
            if (url != null) {
                InterfaceC40099e13.C19924a.goToWebView$default(C50907wF4.this.f115693d, url, wireQuickLink.getDisplay(), null, false, 12, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireQuickLink wireQuickLink) {
            m7100a(wireQuickLink);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/RepairFlow;", "repairFlow", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/RepairFlow;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wF4$o */
    /* loaded from: classes3.dex */
    public static final class C29836o extends Lambda implements Function1<RepairFlow, InterfaceC24574u<? extends Pair<? extends DialogResponse, ? extends RepairFlow>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lkotlin/Pair;", "Lco/bird/android/model/RepairFlow;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: wF4$o$a */
        /* loaded from: classes3.dex */
        public static final class C29837a extends Lambda implements Function1<DialogResponse, Pair<? extends DialogResponse, ? extends RepairFlow>> {

            /* renamed from: g */
            public final /* synthetic */ RepairFlow f115720g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29837a(RepairFlow repairFlow) {
                super(1);
                this.f115720g = repairFlow;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<DialogResponse, RepairFlow> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(response, this.f115720g);
            }
        }

        public C29836o() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<DialogResponse, RepairFlow>> invoke(RepairFlow repairFlow) {
            Intrinsics.checkNotNullParameter(repairFlow, "repairFlow");
            if (repairFlow.getCompleted()) {
                AbstractC24507p<DialogResponse> m33125j0 = C50907wF4.this.f115695f.m105596Vl().m33125j0();
                final C29837a c29837a = new C29837a(repairFlow);
                return m33125j0.m32067H(new InterfaceC23492o() { // from class: yF4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C50907wF4.C29836o.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/android/model/RepairFlow;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wF4$p */
    /* loaded from: classes3.dex */
    public static final class C29838p extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends RepairFlow>, InterfaceC24574u<? extends DialogResponse>> {

        /* renamed from: h */
        public final /* synthetic */ String f115722h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFQ3;", "response", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: wF4$p$a */
        /* loaded from: classes3.dex */
        public static final class C29839a extends Lambda implements Function1<FQ3, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public final /* synthetic */ C50907wF4 f115723g;

            /* renamed from: h */
            public final /* synthetic */ RepairFlow f115724h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29839a(C50907wF4 c50907wF4, RepairFlow repairFlow) {
                super(1);
                this.f115723g = c50907wF4;
                this.f115724h = repairFlow;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Unit> invoke(FQ3 response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.m107154a()) {
                    return this.f115723g.f115695f.m105594Xl(this.f115724h.getCode(), this.f115724h.getVehicleId()).m33125j0();
                }
                return AbstractC24507p.m32024u();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: wF4$p$b */
        /* loaded from: classes3.dex */
        public static final class C29840b extends Lambda implements Function1<Unit, InterfaceC24574u<? extends DialogResponse>> {

            /* renamed from: g */
            public final /* synthetic */ C50907wF4 f115725g;

            /* renamed from: h */
            public final /* synthetic */ String f115726h;

            /* renamed from: i */
            public final /* synthetic */ DialogResponse f115727i;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: wF4$p$b$a */
            /* loaded from: classes3.dex */
            public static final class C29841a extends Lambda implements Function1<Throwable, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C50907wF4 f115728g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C29841a(C50907wF4 c50907wF4) {
                    super(1);
                    this.f115728g = c50907wF4;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    this.f115728g.f115695f.m105598Tl(true);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29840b(C50907wF4 c50907wF4, String str, DialogResponse dialogResponse) {
                super(1);
                this.f115725g = c50907wF4;
                this.f115726h = str;
                this.f115727i = dialogResponse;
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC24574u<? extends DialogResponse> invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbstractC23461c m33070P = this.f115725g.f115690a.mo13668d(this.f115726h).m33070P(C23454a.m33087a());
                final C29841a c29841a = new C29841a(this.f115725g);
                AbstractC23461c m33084B = m33070P.m33084B(new InterfaceC23484g() { // from class: BF4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C50907wF4.C29838p.C29840b.invoke$lambda$0(Function1.this, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33084B, "fun onCreate(birdId: Str…r.Result.RESULT_OK) }\n  }");
                return C28237sD.progress$default(m33084B, this.f115725g.f115695f, 0, 2, (Object) null).m33045k(AbstractC24507p.m32068G(this.f115727i));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29838p(String str) {
            super(1);
            this.f115722h = str;
        }

        /* renamed from: d */
        public static final InterfaceC24574u m7093d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        public static final InterfaceC24574u invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends DialogResponse> invoke(Pair<? extends DialogResponse, RepairFlow> pair) {
            AbstractC24507p m32068G;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            DialogResponse component1 = pair.component1();
            RepairFlow component2 = pair.component2();
            if (component1 == DialogResponse.OK) {
                if (C50907wF4.this.f115697h.m82623f8().m73665a().getOperatorConfig().getFeatures().getRepair().getRequireVehicleScanConfirmationForRepair()) {
                    AbstractC23442F<FQ3> m110485l = C50907wF4.this.f115692c.m110485l(Permission.CAMERA);
                    final C29839a c29839a = new C29839a(C50907wF4.this, component2);
                    m32068G = m110485l.m33163C(new InterfaceC23492o() { // from class: zF4
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u m7093d;
                            m7093d = C50907wF4.C29838p.m7093d(Function1.this, obj);
                            return m7093d;
                        }
                    });
                } else {
                    m32068G = AbstractC24507p.m32068G(Unit.INSTANCE);
                }
                final C29840b c29840b = new C29840b(C50907wF4.this, this.f115722h, component1);
                return m32068G.m32021x(new InterfaceC23492o() { // from class: AF4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u invoke$lambda$1;
                        invoke$lambda$1 = C50907wF4.C29838p.invoke$lambda$1(Function1.this, obj);
                        return invoke$lambda$1;
                    }
                });
            }
            return AbstractC24507p.m32068G(component1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wF4$q */
    /* loaded from: classes3.dex */
    public static final class C29842q extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends Pair<? extends DialogResponse, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: wF4$q$a */
        /* loaded from: classes3.dex */
        public static final class C29843a extends Lambda implements Function1<Boolean, Pair<? extends DialogResponse, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ DialogResponse f115730g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29843a(DialogResponse dialogResponse) {
                super(1);
                this.f115730g = dialogResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<DialogResponse, Boolean> invoke(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f115730g, it);
            }
        }

        public C29842q() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<DialogResponse, Boolean>> invoke(DialogResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            AbstractC23442F m7115v = C50907wF4.this.m7115v(response);
            final C29843a c29843a = new C29843a(response);
            return m7115v.m33157I(new InterfaceC23492o() { // from class: CF4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C50907wF4.C29842q.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wF4$r */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29844r extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C29844r(Object obj) {
            super(1, obj, C50907wF4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50907wF4) this.receiver).m7141Q(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wF4$s */
    /* loaded from: classes3.dex */
    public static final class C29845s extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends Boolean>, Unit> {
        public C29845s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends DialogResponse, ? extends Boolean> pair) {
            invoke2((Pair<? extends DialogResponse, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends DialogResponse, Boolean> pair) {
            DialogResponse component1 = pair.component1();
            Boolean navigateToInventory = pair.component2();
            GF4 gf4 = C50907wF4.this.f115695f;
            DialogResponse dialogResponse = DialogResponse.OK;
            gf4.m105598Tl(component1 != dialogResponse);
            if (component1 == dialogResponse) {
                InterfaceC40099e13.C19924a.closeDownWithResult$default(C50907wF4.this.f115693d, -1, null, 2, null);
            }
            Intrinsics.checkNotNullExpressionValue(navigateToInventory, "navigateToInventory");
            if (navigateToInventory.booleanValue()) {
                C50907wF4.this.f115693d.mo36921w4();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wF4$t */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29846t extends FunctionReferenceImpl implements Function1<RepairFlow, List<? extends C3023H6>> {
        public C29846t(Object obj) {
            super(1, obj, WE4.class, "convert", "convert(Lco/bird/android/model/RepairFlow;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(RepairFlow p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((WE4) this.receiver).m78684a(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wF4$u */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29847u extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C29847u(Object obj) {
            super(1, obj, GF4.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((GF4) this.receiver).m105591b(p0);
        }
    }

    public C50907wF4(InterfaceC48265rn6 vehicleServicingManager, InterfaceC1880Ea analyticsManager, DQ3 permissionManager, InterfaceC40099e13 navigator, WE4 converter, GF4 ui, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(vehicleServicingManager, "vehicleServicingManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f115690a = vehicleServicingManager;
        this.f115691b = analyticsManager;
        this.f115692c = permissionManager;
        this.f115693d = navigator;
        this.f115694e = converter;
        this.f115695f = ui;
        this.f115696g = scopeProvider;
        this.f115697h = reactiveConfig;
        C24552a<RepairFlow> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<RepairFlow>()");
        this.f115698i = m31922e;
    }

    /* renamed from: A */
    public static final void m7157A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m7156B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m7155C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final RepairFlow m7154D(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RepairFlow) tmp0.invoke(obj, obj2);
    }

    /* renamed from: E */
    public static final InterfaceC24574u m7153E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23447K m7152F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m7151G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m7150H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m7149I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m7148J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final InterfaceC24574u m7147K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC24574u m7146L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23447K m7145M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m7144N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m7143O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m7142P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final List m7139S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m7138T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final Boolean m7114w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m7112y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m7111z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* renamed from: Q */
    public final void m7141Q(Throwable th) {
        RetrofitException retrofitException;
        C49375tg1 c49375tg1;
        String m11932c;
        ?? r2;
        Unit unit = null;
        if (th instanceof CompositeException) {
            CompositeException compositeException = (CompositeException) th;
            List<Throwable> m33015b = compositeException.m33015b();
            Intrinsics.checkNotNullExpressionValue(m33015b, "e.exceptions");
            Iterator it = m33015b.iterator();
            while (true) {
                if (it.hasNext()) {
                    r2 = it.next();
                    if (((Throwable) r2) instanceof RetrofitException) {
                        break;
                    }
                } else {
                    r2 = 0;
                    break;
                }
            }
            Throwable th2 = r2;
            if (th2 == null) {
                th = compositeException.m33015b().get(0);
            } else {
                th = th2;
            }
        }
        if (th instanceof RetrofitException) {
            retrofitException = (RetrofitException) th;
        } else {
            retrofitException = null;
        }
        if (retrofitException != null && (c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class)) != null && (m11932c = c49375tg1.m11932c()) != null) {
            this.f115695f.error(m11932c);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f115695f.errorGeneric();
        }
    }

    /* renamed from: R */
    public final void m7140R() {
        Observable<RepairFlow> observeOn = this.f115698i.observeOn(C24542a.m31934a());
        final C29846t c29846t = new C29846t(this.f115694e);
        Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: lF4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m7139S;
                m7139S = C50907wF4.m7139S(Function1.this, obj);
                return m7139S;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "repairFlowSubject\n      …dSchedulers.mainThread())");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f115696g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29847u c29847u = new C29847u(this.f115695f);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: nF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7138T(Function1.this, obj);
            }
        });
    }

    /* renamed from: U */
    public final void m7137U(RepairFlow repairFlow, int i) {
        Object first;
        Intrinsics.checkNotNullParameter(repairFlow, "repairFlow");
        this.f115698i.onNext(repairFlow);
        if (i == 10087) {
            boolean z = true;
            if (repairFlow.getCategories().size() == 1) {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) repairFlow.getCategories());
                List<NonRepair> overviewNonRepairs = ((RepairCategory) first).getOverviewNonRepairs();
                if (!(overviewNonRepairs instanceof Collection) || !overviewNonRepairs.isEmpty()) {
                    for (NonRepair nonRepair : overviewNonRepairs) {
                        if (nonRepair.getSelected()) {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    this.f115693d.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
                }
            }
        }
    }

    /* renamed from: v */
    public final AbstractC23442F<Boolean> m7115v(DialogResponse dialogResponse) {
        boolean z;
        if (dialogResponse == DialogResponse.OK && this.f115697h.m82623f8().m73665a().getOperatorConfig().getFeatures().getMaintenance().getEnableInventory()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC23442F<DialogResponse> m105600Si = this.f115695f.m105600Si();
            final C29820a c29820a = C29820a.f115699g;
            AbstractC23442F m33157I = m105600Si.m33157I(new InterfaceC23492o() { // from class: kF4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m7114w;
                    m7114w = C50907wF4.m7114w(Function1.this, obj);
                    return m7114w;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "{\n      ui.showNavigateT…DialogResponse.OK }\n    }");
            return m33157I;
        }
        AbstractC23442F<Boolean> m33158H = AbstractC23442F.m33158H(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      Single.just(false)\n    }");
        return m33158H;
    }

    /* renamed from: x */
    public final void m7113x(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Object m33135e = this.f115690a.mo13670b(birdId).m33135e(AutoDispose.m45239a(this.f115696g));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29831k c29831k = new C29831k(this.f115698i);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: bF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7112y(Function1.this, obj);
            }
        };
        final C29832l c29832l = new C29832l(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: vF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7111z(Function1.this, obj);
            }
        });
        Observable<WireQuickLink> m105599Sl = this.f115695f.m105599Sl();
        final C29833m c29833m = new C29833m(birdId);
        Observable<WireQuickLink> doAfterNext = m105599Sl.doAfterNext(new InterfaceC23484g() { // from class: cF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7149I(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doAfterNext, "fun onCreate(birdId: Str…r.Result.RESULT_OK) }\n  }");
        Object m33094as = doAfterNext.m33094as(AutoDispose.m45239a(this.f115696g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29834n c29834n = new C29834n(birdId);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: dF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7148J(Function1.this, obj);
            }
        });
        Observable<RepairFlow> observeOn = this.f115698i.skip(10L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        final C29836o c29836o = new C29836o();
        Observable<R> flatMapMaybe = observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: eF4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m7147K;
                m7147K = C50907wF4.m7147K(Function1.this, obj);
                return m7147K;
            }
        });
        final C29838p c29838p = new C29838p(birdId);
        Observable flatMapMaybe2 = flatMapMaybe.flatMapMaybe(new InterfaceC23492o() { // from class: fF4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m7146L;
                m7146L = C50907wF4.m7146L(Function1.this, obj);
                return m7146L;
            }
        });
        final C29842q c29842q = new C29842q();
        Observable observeOn2 = flatMapMaybe2.flatMapSingle(new InterfaceC23492o() { // from class: gF4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m7145M;
                m7145M = C50907wF4.m7145M(Function1.this, obj);
                return m7145M;
            }
        }).observeOn(C23454a.m33087a());
        final C29844r c29844r = new C29844r(this);
        Observable retry = observeOn2.doOnError(new InterfaceC23484g() { // from class: hF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7144N(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun onCreate(birdId: Str…r.Result.RESULT_OK) }\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f115696g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29845s c29845s = new C29845s();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: iF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7143O(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f115695f.m105595Wl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.vehicleInfoClicks()\n …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f115696g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29821b c29821b = new C29821b(birdId);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: jF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7142P(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f115695f.m105590ze().m33094as(AutoDispose.m45239a(this.f115696g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29822c c29822c = new C29822c(birdId);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: mF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7157A(Function1.this, obj);
            }
        });
        Object m33094as5 = this.f115695f.m105601Rl().m33094as(AutoDispose.m45239a(this.f115696g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29823d c29823d = new C29823d(birdId);
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: oF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7156B(Function1.this, obj);
            }
        });
        Object m33094as6 = this.f115695f.m105602Ql().m33094as(AutoDispose.m45239a(this.f115696g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29824e c29824e = new C29824e(birdId);
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: pF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7155C(Function1.this, obj);
            }
        });
        Observable<Unit> m105592Z5 = this.f115695f.m105592Z5();
        C24552a<RepairFlow> c24552a = this.f115698i;
        final C29825f c29825f = C29825f.f115708g;
        Observable<R> withLatestFrom = m105592Z5.withLatestFrom(c24552a, new InterfaceC23480c() { // from class: qF4
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                RepairFlow m7154D;
                m7154D = C50907wF4.m7154D(Function2.this, obj, obj2);
                return m7154D;
            }
        });
        final C29826g c29826g = new C29826g();
        Observable flatMapMaybe3 = withLatestFrom.flatMapMaybe(new InterfaceC23492o() { // from class: rF4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m7153E;
                m7153E = C50907wF4.m7153E(Function1.this, obj);
                return m7153E;
            }
        });
        final C29828h c29828h = new C29828h(birdId);
        Observable observeOn4 = flatMapMaybe3.flatMapSingle(new InterfaceC23492o() { // from class: sF4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m7152F;
                m7152F = C50907wF4.m7152F(Function1.this, obj);
                return m7152F;
            }
        }).observeOn(C23454a.m33087a());
        final C29829i c29829i = new C29829i(this);
        Observable retry2 = observeOn4.doOnError(new InterfaceC23484g() { // from class: tF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7151G(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry2, "fun onCreate(birdId: Str…r.Result.RESULT_OK) }\n  }");
        Object m33094as7 = retry2.m33094as(AutoDispose.m45239a(this.f115696g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29830j c29830j = new C29830j();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: uF4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50907wF4.m7150H(Function1.this, obj);
            }
        });
    }
}
