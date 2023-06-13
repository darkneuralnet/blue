package p000;

import co.bird.android.model.Folder;
import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.wire.WireContainerOrder;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lj7;", "Lf1;", "Lk7;", "Ll7;", "renderer", "", "t", "LO86;", "e", "LO86;", "transferOrderManager", "LTq4;", "f", "LTq4;", "reactiveConfig", "Le13;", "g", "Le13;", "navigator", "<init>", "(LO86;LTq4;Le13;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddBillOfLadingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddBillOfLadingPresenter.kt\nco/bird/android/feature/transferorder/operator/billoflading/AddBillOfLadingPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Rx+.kt\nco/bird/android/library/rx/Rx_Kt\n*L\n1#1,72:1\n180#2:73\n180#2:74\n180#2:77\n641#3,2:75\n*S KotlinDebug\n*F\n+ 1 AddBillOfLadingPresenter.kt\nco/bird/android/feature/transferorder/operator/billoflading/AddBillOfLadingPresenter\n*L\n33#1:73\n38#1:74\n68#1:77\n50#1:75,2\n*E\n"})
/* renamed from: j7 */
/* loaded from: classes3.dex */
public final class C24711j7 extends AbstractC20169f1<InterfaceC25106k7, AbstractC25599l7> {

    /* renamed from: e */
    public final O86 f92157e;

    /* renamed from: f */
    public final C36207Tq4 f92158f;

    /* renamed from: g */
    public final InterfaceC40099e13 f92159g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: j7$a */
    /* loaded from: classes3.dex */
    public static final class C24712a<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C24712a<T> f92160b = new C24712a<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof JO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: j7$b */
    /* loaded from: classes3.dex */
    public static final class C24713b<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C24713b<T, R> f92161b = new C24713b<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final JO5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (JO5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "photoUrls", "LWe6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)LWe6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: j7$c */
    /* loaded from: classes3.dex */
    public static final class C24714c extends Lambda implements Function1<List<? extends String>, C36803We6> {

        /* renamed from: g */
        public static final C24714c f92162g = new C24714c();

        public C24714c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C36803We6 invoke(List<String> photoUrls) {
            Intrinsics.checkNotNullParameter(photoUrls, "photoUrls");
            return new C36803We6(photoUrls, !photoUrls.isEmpty());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: j7$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24715d extends FunctionReferenceImpl implements Function1<AbstractC25599l7, Unit> {
        public C24715d(Object obj) {
            super(1, obj, C24711j7.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m31086a(AbstractC25599l7 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24711j7) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC25599l7 abstractC25599l7) {
            m31086a(abstractC25599l7);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: j7$e */
    /* loaded from: classes3.dex */
    public static final class C24716e extends Lambda implements Function1<Unit, Unit> {
        public C24716e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(C24711j7.this.f92159g, null, null, Folder.TRANSFER_ORDERS_BOL_PHOTOS, 10026, Boolean.valueOf(C24711j7.this.f92158f.m82623f8().m73665a().getOperatorConfig().getFeatures().getTransferOrder().getOverrideUploadBOLViaSignedUrl()), false, 35, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LJO5;", TransferTable.COLUMN_STATE, "Lio/reactivex/B;", "Lco/bird/android/model/persistence/OperatorOrderView;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LJO5;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: j7$f */
    /* loaded from: classes3.dex */
    public static final class C24717f extends Lambda implements Function1<JO5, InterfaceC23434B<? extends OperatorOrderView>> {
        public C24717f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends OperatorOrderView> invoke(JO5 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return C24711j7.this.f92157e.mo80305W(state.m100520b(), state.m100519c());
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\b0\b \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u000724\u0010\u0006\u001a0\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/persistence/OperatorOrderView;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireContainerOrder;", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: j7$g */
    /* loaded from: classes3.dex */
    public static final class C24718g extends Lambda implements Function1<Triple<? extends Unit, ? extends OperatorOrderView, ? extends List<? extends String>>, InterfaceC23447K<? extends WireContainerOrder>> {
        public C24718g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireContainerOrder> invoke(Triple<Unit, OperatorOrderView, ? extends List<String>> triple) {
            boolean z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            OperatorOrderView component2 = triple.component2();
            List<String> photoUrls = triple.component3();
            O86 o86 = C24711j7.this.f92157e;
            String containerOrderId = component2.getContainerOrderId();
            if (containerOrderId == null) {
                containerOrderId = "";
            }
            Intrinsics.checkNotNullExpressionValue(photoUrls, "photoUrls");
            if (component2.getType() == OperatorOrderViewType.LONGTAIL_DELIVERY) {
                z = true;
            } else {
                z = false;
            }
            return o86.mo80293k(containerOrderId, photoUrls, z).m33146T(3L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: j7$h */
    /* loaded from: classes3.dex */
    public static final class C24719h extends Lambda implements Function1<Throwable, Unit> {
        public C24719h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C41318g46.m40159e(e);
            C24711j7 c24711j7 = C24711j7.this;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            c24711j7.m42280h(new C37041Xf1(e));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireContainerOrder;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireContainerOrder;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: j7$i */
    /* loaded from: classes3.dex */
    public static final class C24720i extends Lambda implements Function1<WireContainerOrder, Unit> {
        public C24720i() {
            super(1);
        }

        /* renamed from: a */
        public final void m31083a(WireContainerOrder wireContainerOrder) {
            C24711j7.this.m42280h(C46530os0.f102672a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireContainerOrder wireContainerOrder) {
            m31083a(wireContainerOrder);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24711j7(O86 transferOrderManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator) {
        super(C38312b22.f56810a);
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f92157e = transferOrderManager;
        this.f92158f = reactiveConfig;
        this.f92159g = navigator;
    }

    /* renamed from: g */
    public static final void m31102g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final C36803We6 m31093u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C36803We6) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m31092v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23434B m31091w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23447K m31090x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m31089y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m31088z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: t */
    public void consume(InterfaceC25106k7 renderer) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<List<String>> mo29281D8 = renderer.mo29281D8();
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<String>> startWith = mo29281D8.startWith((Observable<List<String>>) emptyList);
        final C24714c c24714c = C24714c.f92162g;
        Observable<R> map = startWith.map(new InterfaceC23492o() { // from class: c7
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C36803We6 m31093u;
                m31093u = C24711j7.m31093u(Function1.this, obj);
                return m31093u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "renderer.photoUrls()\n   …Empty()\n        )\n      }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24715d c24715d = new C24715d(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: d7
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C24711j7.m31102g(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.mo29279g().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24716e c24716e = new C24716e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: e7
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C24711j7.m31092v(Function1.this, obj);
            }
        });
        Observable<Unit> mo29280F4 = renderer.mo29280F4();
        Observable<R> map2 = m42276l().filter(C24712a.f92160b).map(C24713b.f92161b);
        Intrinsics.checkNotNullExpressionValue(map2, "filter { item -> item is…map { item -> item as K }");
        final C24717f c24717f = new C24717f();
        Observable switchMap = map2.switchMap(new InterfaceC23492o() { // from class: f7
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m31091w;
                m31091w = C24711j7.m31091w(Function1.this, obj);
                return m31091w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "override fun consume(ren…e { emit(Completed) }\n  }");
        Observable m31949b = C24527f.m31949b(mo29280F4, switchMap, renderer.mo29281D8());
        final C24718g c24718g = new C24718g();
        Observable flatMapSingle = m31949b.flatMapSingle(new InterfaceC23492o() { // from class: g7
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m31090x;
                m31090x = C24711j7.m31090x(Function1.this, obj);
                return m31090x;
            }
        });
        final C24719h c24719h = new C24719h();
        Observable doOnError = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: h7
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C24711j7.m31089y(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "override fun consume(ren…e { emit(Completed) }\n  }");
        Object m33094as3 = doOnError.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24720i c24720i = new C24720i();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: i7
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C24711j7.m31088z(Function1.this, obj);
            }
        });
    }
}
