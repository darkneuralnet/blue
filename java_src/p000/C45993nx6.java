package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.persistence.HibernationSessionVehicle;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23488k;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C45993nx6;
import p000.H31;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lnx6;", "Lbx6;", "", C17296a.f69688o, "LTq4;", "LTq4;", "reactiveConfig", "Lom3;", "b", "Lom3;", "operatorManager", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "Lqx6;", "e", "Lqx6;", "ui", "LDQ3;", "f", "LDQ3;", "permissionManager", "<init>", "(LTq4;Lom3;Lcom/uber/autodispose/ScopeProvider;Le13;Lqx6;LDQ3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWakeSleepBirdsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WakeSleepBirdsPresenter.kt\nco/bird/android/app/feature/wakebirds/WakeSleepBirdsPresenterImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,116:1\n94#2,2:117\n180#3:119\n180#3:120\n180#3:121\n180#3:122\n180#3:123\n180#3:124\n180#3:125\n*S KotlinDebug\n*F\n+ 1 WakeSleepBirdsPresenter.kt\nco/bird/android/app/feature/wakebirds/WakeSleepBirdsPresenterImpl\n*L\n37#1:117,2\n46#1:119\n60#1:120\n68#1:121\n74#1:122\n83#1:123\n90#1:124\n112#1:125\n*E\n"})
/* renamed from: nx6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45993nx6 implements InterfaceC38860bx6 {

    /* renamed from: a */
    public final C36207Tq4 f101118a;

    /* renamed from: b */
    public final InterfaceC46473om3 f101119b;

    /* renamed from: c */
    public final ScopeProvider f101120c;

    /* renamed from: d */
    public final InterfaceC40099e13 f101121d;

    /* renamed from: e */
    public final InterfaceC47772qx6 f101122e;

    /* renamed from: f */
    public final DQ3 f101123f;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u00032\u0006\u0010\n\u001a\u00028\u00042\u0006\u0010\u000b\u001a\u00028\u0005H\n¢\u0006\u0004\b\r\u0010\u000e"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "T6", "t1", "t2", "t3", "t4", "t5", "t6", "LJx5;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LJx5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$5\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: nx6$a */
    /* loaded from: classes2.dex */
    public static final class C26745a<T1, T2, T3, T4, T5, T6, R> implements InterfaceC23488k {

        /* renamed from: a */
        public static final C26745a<T1, T2, T3, T4, T5, T6, R> f101124a = new C26745a<>();

        @Override // io.reactivex.functions.InterfaceC23488k
        /* renamed from: a */
        public final C33931Jx5<T1, T2, T3, T4, T5, T6> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            return new C33931Jx5<>(t1, t2, t3, t4, t5, t6);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nx6$b */
    /* loaded from: classes2.dex */
    public static final class C26746b extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends HibernationSessionVehicle>>, InterfaceC23447K<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: nx6$b$a */
        /* loaded from: classes2.dex */
        public static final class C26747a extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends Unit>> {

            /* renamed from: g */
            public final /* synthetic */ C45993nx6 f101126g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26747a(C45993nx6 c45993nx6) {
                super(1);
                this.f101126g = c45993nx6;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends Unit> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.CANCEL) {
                    return this.f101126g.f101119b.mo8106f().m33042m(AbstractC23442F.m33158H(Unit.INSTANCE));
                }
                return AbstractC23442F.m33158H(Unit.INSTANCE);
            }
        }

        public C26746b() {
            super(1);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Unit> invoke(Pair<Unit, ? extends List<HibernationSessionVehicle>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<HibernationSessionVehicle> vehicles = pair.component2();
            Intrinsics.checkNotNullExpressionValue(vehicles, "vehicles");
            if (!vehicles.isEmpty()) {
                AbstractC23442F showBottomSheetAlert$default = H31.C3014a.showBottomSheetAlert$default(C45993nx6.this.f101122e, GM1.f11787d, null, 2, null);
                final C26747a c26747a = new C26747a(C45993nx6.this);
                return showBottomSheetAlert$default.m33165A(new InterfaceC23492o() { // from class: ox6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K invoke$lambda$0;
                        invoke$lambda$0 = C45993nx6.C26746b.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
            return AbstractC23442F.m33158H(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nx6$c */
    /* loaded from: classes2.dex */
    public static final class C26748c extends Lambda implements Function1<Unit, Unit> {
        public C26748c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C45993nx6.this.f101122e.mo11147w8();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042V\u0010\u0003\u001aR\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*(\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LJx5;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LJx5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nx6$d */
    /* loaded from: classes2.dex */
    public static final class C26749d extends Lambda implements Function1<C33931Jx5<? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Boolean>, Unit> {
        public C26749d() {
            super(1);
        }

        /* renamed from: a */
        public final void m22107a(C33931Jx5<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> c33931Jx5) {
            boolean booleanValue = c33931Jx5.m99520a().booleanValue();
            boolean booleanValue2 = c33931Jx5.m99519b().booleanValue();
            boolean booleanValue3 = c33931Jx5.m99518c().booleanValue();
            boolean booleanValue4 = c33931Jx5.m99517d().booleanValue();
            boolean booleanValue5 = c33931Jx5.m99516e().booleanValue();
            boolean booleanValue6 = c33931Jx5.m99515f().booleanValue();
            C45993nx6.this.f101122e.mo11146ye(booleanValue);
            C45993nx6.this.f101122e.mo11158Pk(booleanValue2);
            C45993nx6.this.f101122e.mo11149pi(booleanValue3);
            C45993nx6.this.f101122e.mo11160Li(booleanValue4);
            C45993nx6.this.f101122e.mo11159Pa(booleanValue5);
            C45993nx6.this.f101122e.mo11161Hg(booleanValue6);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C33931Jx5<? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Boolean> c33931Jx5) {
            m22107a(c33931Jx5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nx6$e */
    /* loaded from: classes2.dex */
    public static final class C26750e extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C26750e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C45993nx6.this.f101123f.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nx6$f */
    /* loaded from: classes2.dex */
    public static final class C26751f extends Lambda implements Function1<FQ3, Unit> {
        public C26751f() {
            super(1);
        }

        /* renamed from: a */
        public final void m22106a(FQ3 fq3) {
            InterfaceC40099e13.C19924a.goToLegacyScanBird$default(C45993nx6.this.f101121d, null, null, BirdAction.WAKE_BIRD, MapMode.OPERATOR, null, false, 51, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m22106a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nx6$g */
    /* loaded from: classes2.dex */
    public static final class C26752g extends Lambda implements Function1<Unit, InterfaceC24574u<? extends String>> {
        public C26752g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends String> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C45993nx6.this.f101122e.mo11148s9(C45871nl4.batch_id_dialog_title, C45871nl4.batch_id, null, false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "batchId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nx6$h */
    /* loaded from: classes2.dex */
    public static final class C26753h extends Lambda implements Function1<String, Unit> {
        public C26753h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C45993nx6.this.f101121d.mo37124N1(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nx6$i */
    /* loaded from: classes2.dex */
    public static final class C26754i extends Lambda implements Function1<Unit, Unit> {
        public C26754i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToWakeFlockProgress$default(C45993nx6.this.f101121d, null, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nx6$j */
    /* loaded from: classes2.dex */
    public static final class C26755j extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C26755j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C45993nx6.this.f101123f.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nx6$k */
    /* loaded from: classes2.dex */
    public static final class C26756k extends Lambda implements Function1<FQ3, Unit> {
        public C26756k() {
            super(1);
        }

        /* renamed from: a */
        public final void m22104a(FQ3 fq3) {
            InterfaceC40099e13.C19924a.goToLegacyScanBird$default(C45993nx6.this.f101121d, null, null, BirdAction.SLEEP_BIRD, MapMode.OPERATOR, null, false, 51, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m22104a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nx6$l */
    /* loaded from: classes2.dex */
    public static final class C26757l extends Lambda implements Function1<Unit, Unit> {
        public C26757l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToBulkScanner$default(C45993nx6.this.f101121d, BulkScanPurpose.WAKE_VEHICLES, null, null, null, 14, null);
        }
    }

    public C45993nx6(C36207Tq4 reactiveConfig, InterfaceC46473om3 operatorManager, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC47772qx6 ui, DQ3 permissionManager) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f101118a = reactiveConfig;
        this.f101119b = operatorManager;
        this.f101120c = scopeProvider;
        this.f101121d = navigator;
        this.f101122e = ui;
        this.f101123f = permissionManager;
    }

    /* renamed from: m */
    public static final void m22122m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final InterfaceC23447K m22121n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m22120o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m22119p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC24574u m22118q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m22117r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m22116s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m22115t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m22114u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m22113v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23447K m22112w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC38860bx6
    /* renamed from: a */
    public void mo22134a() {
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f101118a.m82729V7(), this.f101118a.m82496r3(), this.f101118a.m82909D7(), this.f101118a.m82929B7(), this.f101118a.m82913D3(), this.f101118a.m82791P5(), C26745a.f101124a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…1, t2, t3, t4, t5, t6) })");
        Observable observeOn = combineLatest.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f101120c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26749d c26749d = new C26749d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: cx6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45993nx6.m22122m(Function1.this, obj);
            }
        });
        Observable<Unit> mo11163Bh = this.f101122e.mo11163Bh();
        final C26750e c26750e = new C26750e();
        Observable<R> flatMapSingle = mo11163Bh.flatMapSingle(new InterfaceC23492o() { // from class: fx6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m22121n;
                m22121n = C45993nx6.m22121n(Function1.this, obj);
                return m22121n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onCreate() …owScanToHibernate() }\n  }");
        Object m33094as2 = flatMapSingle.m33094as(AutoDispose.m45239a(this.f101120c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26751f c26751f = new C26751f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: gx6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45993nx6.m22119p(Function1.this, obj);
            }
        });
        Observable<Unit> mo11150fh = this.f101122e.mo11150fh();
        final C26752g c26752g = new C26752g();
        Observable<R> flatMapMaybe = mo11150fh.flatMapMaybe(new InterfaceC23492o() { // from class: hx6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m22118q;
                m22118q = C45993nx6.m22118q(Function1.this, obj);
                return m22118q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun onCreate() …owScanToHibernate() }\n  }");
        Object m33094as3 = flatMapMaybe.m33094as(AutoDispose.m45239a(this.f101120c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26753h c26753h = new C26753h();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: ix6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45993nx6.m22117r(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f101122e.mo11155R8().m33094as(AutoDispose.m45239a(this.f101120c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26754i c26754i = new C26754i();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: jx6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45993nx6.m22116s(Function1.this, obj);
            }
        });
        Observable<Unit> mo11152Vd = this.f101122e.mo11152Vd();
        final C26755j c26755j = new C26755j();
        Observable<R> flatMapSingle2 = mo11152Vd.flatMapSingle(new InterfaceC23492o() { // from class: kx6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m22115t;
                m22115t = C45993nx6.m22115t(Function1.this, obj);
                return m22115t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "override fun onCreate() …owScanToHibernate() }\n  }");
        Object m33094as5 = flatMapSingle2.m33094as(AutoDispose.m45239a(this.f101120c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26756k c26756k = new C26756k();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: lx6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45993nx6.m22114u(Function1.this, obj);
            }
        });
        Object m33094as6 = this.f101122e.mo11162Ch().m33094as(AutoDispose.m45239a(this.f101120c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26757l c26757l = new C26757l();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: mx6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45993nx6.m22113v(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f101122e.mo11151bl(), this.f101119b.mo8141N());
        final C26746b c26746b = new C26746b();
        Observable flatMapSingle3 = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: dx6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m22112w;
                m22112w = C45993nx6.m22112w(Function1.this, obj);
                return m22112w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle3, "override fun onCreate() …owScanToHibernate() }\n  }");
        Object m33094as7 = flatMapSingle3.m33094as(AutoDispose.m45239a(this.f101120c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26748c c26748c = new C26748c();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: ex6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45993nx6.m22120o(Function1.this, obj);
            }
        });
    }
}
