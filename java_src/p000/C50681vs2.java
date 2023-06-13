package p000;

import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.QCInspection;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.QCStatus;
import co.bird.android.model.constant.QualityControlFlow;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\"\u0010#J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, m28432d2 = {"Lvs2;", "LNC;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "", C17296a.f69688o, "Lxs2;", "l", "Lxs2;", "ui", "Ljs2;", "m", "Ljs2;", "converter", "Lco/bird/android/model/constant/QualityControlFlow;", "n", "Lco/bird/android/model/constant/QualityControlFlow;", "s", "()Lco/bird/android/model/constant/QualityControlFlow;", "flow", "LaG6;", "workOrderManager", "LAb4;", "qcAnalyticsManager", "Lsu2;", "localAssetManager", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "reactiveConfig", "<init>", "(LaG6;LAb4;Lsu2;Le13;Lcom/uber/autodispose/ScopeProvider;LTq4;Lxs2;Ljs2;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nListQualityControlPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListQualityControlPresenterImpl.kt\nco/bird/android/qualitycontrol/list/ListQualityControlPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,84:1\n180#2:85\n180#2:86\n180#2:87\n180#2:88\n*S KotlinDebug\n*F\n+ 1 ListQualityControlPresenterImpl.kt\nco/bird/android/qualitycontrol/list/ListQualityControlPresenterImpl\n*L\n40#1:85\n62#1:86\n71#1:87\n77#1:88\n*E\n"})
/* renamed from: vs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50681vs2 extends AbstractC5496NC {

    /* renamed from: l */
    public final InterfaceC51867xs2 f114817l;

    /* renamed from: m */
    public final InterfaceC43567js2 f114818m;

    /* renamed from: n */
    public final QualityControlFlow f114819n;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vs2$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29669a extends FunctionReferenceImpl implements Function1<List<? extends QCInspection>, AbstractC23442F<List<? extends C3023H6>>> {
        public C29669a(Object obj) {
            super(1, obj, InterfaceC43567js2.class, "convert", "convert(Ljava/util/List;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<List<C3023H6>> invoke(List<QCInspection> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC43567js2) this.receiver).mo26726a(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vs2$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29670b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C29670b(Object obj) {
            super(1, obj, InterfaceC51867xs2.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC51867xs2) this.receiver).mo2357b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u000124\u0010\u0004\u001a0\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00070\u00070\u0005H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vs2$c */
    /* loaded from: classes4.dex */
    public static final class C29671c extends Lambda implements Function1<Pair<? extends Pair<? extends QCInspection, ? extends Boolean>, ? extends List<? extends QCInspection>>, List<QCInspection>> {

        /* renamed from: g */
        public static final C29671c f114820g = new C29671c();

        public C29671c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<QCInspection> invoke(Pair<? extends Pair<? extends QCInspection, ? extends Boolean>, ? extends List<? extends QCInspection>> pair) {
            return invoke2((Pair<Pair<QCInspection, Boolean>, ? extends List<QCInspection>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<QCInspection> invoke2(Pair<Pair<QCInspection, Boolean>, ? extends List<QCInspection>> pair) {
            List<QCInspection> mutableList;
            QCStatus qCStatus;
            QCInspection copy;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Pair<QCInspection, Boolean> component1 = pair.component1();
            List<QCInspection> qcInspections = pair.component2();
            QCInspection first = component1.getFirst();
            Boolean second = component1.getSecond();
            int indexOf = qcInspections.indexOf(first);
            Intrinsics.checkNotNullExpressionValue(qcInspections, "qcInspections");
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) qcInspections);
            if (indexOf != -1) {
                if (Intrinsics.areEqual(second, Boolean.TRUE)) {
                    qCStatus = QCStatus.PASSED;
                } else {
                    qCStatus = Intrinsics.areEqual(second, Boolean.FALSE) ? QCStatus.FAILED : QCStatus.OPEN;
                }
                QCStatus qCStatus2 = qCStatus;
                mutableList.remove(indexOf);
                copy = first.copy((r20 & 1) != 0 ? first.f66615id : null, (r20 & 2) != 0 ? first.title : null, (r20 & 4) != 0 ? first.description : null, (r20 & 8) != 0 ? first.workOrderId : null, (r20 & 16) != 0 ? first.issueTypeId : null, (r20 & 32) != 0 ? first.repairTypeId : null, (r20 & 64) != 0 ? first.kind : null, (r20 & 128) != 0 ? first.status : qCStatus2, (r20 & 256) != 0 ? first.assetId : null);
                mutableList.add(indexOf, copy);
            }
            return mutableList;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vs2$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29672d extends FunctionReferenceImpl implements Function1<List<? extends QCInspection>, Unit> {
        public C29672d(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends QCInspection> list) {
            invoke2((List<QCInspection>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<QCInspection> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vs2$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29673e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C29673e f114821b = new C29673e();

        public C29673e() {
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vs2$f */
    /* loaded from: classes4.dex */
    public static final class C29674f extends Lambda implements Function1<Pair<? extends Unit, ? extends WorkOrder>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f114823h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29674f(WireBird wireBird) {
            super(1);
            this.f114823h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends WorkOrder> pair) {
            invoke2((Pair<Unit, WorkOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, WorkOrder> pair) {
            WorkOrder workOrder = pair.component2();
            C50681vs2 c50681vs2 = C50681vs2.this;
            WireBird wireBird = this.f114823h;
            Intrinsics.checkNotNullExpressionValue(workOrder, "workOrder");
            c50681vs2.m94249B(wireBird, workOrder);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00012\u0082\u0001\u0010\u0006\u001a~\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u0002 \u0004*>\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/QCAutoCheck;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vs2$g */
    /* loaded from: classes4.dex */
    public static final class C29675g extends Lambda implements Function1<Triple<? extends Unit, ? extends List<? extends QCInspection>, ? extends List<? extends QCAutoCheck>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f114825h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29675g(WireBird wireBird) {
            super(1);
            this.f114825h = wireBird;
        }

        /* renamed from: a */
        public final void m7889a(Triple<Unit, ? extends List<QCInspection>, ? extends List<QCAutoCheck>> triple) {
            List<QCInspection> qcInspections = triple.component2();
            List<QCAutoCheck> qcAutoChecks = triple.component3();
            InterfaceC40099e13 m94221u = C50681vs2.this.m94221u();
            WireBird wireBird = this.f114825h;
            Intrinsics.checkNotNullExpressionValue(qcInspections, "qcInspections");
            Intrinsics.checkNotNullExpressionValue(qcAutoChecks, "qcAutoChecks");
            m94221u.mo36927v4(wireBird, qcInspections, qcAutoChecks);
            C50681vs2.this.m94221u().close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends List<? extends QCInspection>, ? extends List<? extends QCAutoCheck>> triple) {
            m7889a(triple);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50681vs2(InterfaceC37857aG6 workOrderManager, InterfaceC31626Ab4 qcAnalyticsManager, InterfaceC48923su2 localAssetManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig, InterfaceC51867xs2 ui, InterfaceC43567js2 converter) {
        super(workOrderManager, localAssetManager, navigator, scopeProvider, reactiveConfig, qcAnalyticsManager, ui);
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(qcAnalyticsManager, "qcAnalyticsManager");
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f114817l = ui;
        this.f114818m = converter;
        this.f114819n = QualityControlFlow.LIST;
        C24552a<List<QCInspection>> m94219w = m94219w();
        final C29669a c29669a = new C29669a(converter);
        Observable observeOn = m94219w.flatMapSingle(new InterfaceC23492o() { // from class: os2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m7897T;
                m7897T = C50681vs2.m7897T(Function1.this, obj);
                return m7897T;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "qcInspectionSubject\n    …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29670b c29670b = new C29670b(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ps2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50681vs2.m7896U(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(ui.mo2356dk(), m94219w());
        final C29671c c29671c = C29671c.f114820g;
        Observable map = m31950a.map(new InterfaceC23492o() { // from class: qs2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m7895V;
                m7895V = C50681vs2.m7895V(Function1.this, obj);
                return m7895V;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.qcUpdates()\n      .wi…      }\n        }\n      }");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29672d c29672d = new C29672d(m94219w());
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: rs2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50681vs2.m7894W(Function1.this, obj);
            }
        };
        final C29673e c29673e = C29673e.f114821b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ss2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50681vs2.m7893X(Function1.this, obj);
            }
        });
    }

    /* renamed from: H */
    public static final void m7906H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m7905I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23447K m7897T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m7896U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final List m7895V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m7894W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m7893X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC5496NC, p000.InterfaceC35838Sb4
    /* renamed from: a */
    public void mo7892a(WireBird bird, WorkOrder workOrder) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        super.mo7892a(bird, workOrder);
        Observable observeOn = C24527f.m31950a(this.f114817l.mo2355i1(), m94250A()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.addIssuesClicks()\n   …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m94217y()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29674f c29674f = new C29674f(bird);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ts2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50681vs2.m7906H(Function1.this, obj);
            }
        });
        Observable observeOn2 = C24527f.m31949b(this.f114817l.mo2358I(), m94219w(), m94220v()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.completeClicks()\n    …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(m94217y()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29675g c29675g = new C29675g(bird);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: us2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50681vs2.m7905I(Function1.this, obj);
            }
        });
    }

    @Override // p000.AbstractC5496NC
    /* renamed from: s */
    public QualityControlFlow mo7891s() {
        return this.f114819n;
    }
}
