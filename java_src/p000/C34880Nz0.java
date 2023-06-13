package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.ContainerOrderStatus;
import co.bird.android.model.wire.WireContainerOrder;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34880Nz0;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010%\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"LNz0;", "", "", "l", "LPz0;", C17296a.f69688o, "LPz0;", "ui", "LBz0;", "b", "LBz0;", "converter", "Le13;", "c", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LO86;", "e", "LO86;", "transferOrderManager", "", "f", "Ljava/lang/String;", "containerOrderId", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/wire/WireContainerOrder;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/a;", "containerOrderSubject", "Lio/reactivex/subjects/d;", "h", "Lio/reactivex/subjects/d;", "promptContainerOrderArrivedSubject", "<init>", "(LPz0;LBz0;Le13;Lcom/uber/autodispose/ScopeProvider;LO86;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContainerOrderDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContainerOrderDetailsPresenter.kt\nco/bird/android/feature/transferorder/container/ContainerOrderDetailsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,107:1\n199#2:108\n180#2:109\n180#2:110\n180#2:111\n180#2:112\n*S KotlinDebug\n*F\n+ 1 ContainerOrderDetailsPresenter.kt\nco/bird/android/feature/transferorder/container/ContainerOrderDetailsPresenter\n*L\n36#1:108\n56#1:109\n62#1:110\n97#1:111\n103#1:112\n*E\n"})
/* renamed from: Nz0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34880Nz0 {

    /* renamed from: a */
    public final C35348Pz0 f25469a;

    /* renamed from: b */
    public final C32072Bz0 f25470b;

    /* renamed from: c */
    public final InterfaceC40099e13 f25471c;

    /* renamed from: d */
    public final ScopeProvider f25472d;

    /* renamed from: e */
    public final O86 f25473e;

    /* renamed from: f */
    public final String f25474f;

    /* renamed from: g */
    public final C24552a<WireContainerOrder> f25475g;

    /* renamed from: h */
    public final C24558d<Unit> f25476h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nz0$a */
    /* loaded from: classes3.dex */
    public static final class C5788a extends Lambda implements Function1<DialogResponse, Unit> {
        public C5788a() {
            super(1);
        }

        /* renamed from: a */
        public final void m93045a(DialogResponse dialogResponse) {
            InterfaceC40099e13.C19924a.goToProcessContainerOrder$default(C34880Nz0.this.f25471c, C34880Nz0.this.f25474f, null, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m93045a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nz0$b */
    /* loaded from: classes3.dex */
    public static final class C5789b extends Lambda implements Function1<Unit, Unit> {
        public C5789b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToProcessContainerOrder$default(C34880Nz0.this.f25471c, C34880Nz0.this.f25474f, null, 2, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nz0$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5790c extends FunctionReferenceImpl implements Function1<WireContainerOrder, Unit> {
        public C5790c(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m93044a(WireContainerOrder p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireContainerOrder wireContainerOrder) {
            m93044a(wireContainerOrder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nz0$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5791d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C5791d(Object obj) {
            super(1, obj, C35348Pz0.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C35348Pz0) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireContainerOrder;", "kotlin.jvm.PlatformType", "containerOrder", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireContainerOrder;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nz0$e */
    /* loaded from: classes3.dex */
    public static final class C5792e extends Lambda implements Function1<WireContainerOrder, Unit> {
        public C5792e() {
            super(1);
        }

        /* renamed from: a */
        public final void m93043a(WireContainerOrder containerOrder) {
            boolean z;
            O86 o86 = C34880Nz0.this.f25473e;
            Intrinsics.checkNotNullExpressionValue(containerOrder, "containerOrder");
            boolean mo80283s = o86.mo80283s(containerOrder);
            C35348Pz0 c35348Pz0 = C34880Nz0.this.f25469a;
            boolean z2 = true;
            if ((mo80283s && containerOrder.getStatus() != ContainerOrderStatus.IN_TRANSIT) || (!mo80283s && containerOrder.getStatus() != ContainerOrderStatus.RECEIVED)) {
                z = true;
            } else {
                z = false;
            }
            if (mo80283s && (!mo80283s || containerOrder.getStatus() != ContainerOrderStatus.READY_FOR_PICKUP)) {
                z2 = false;
            }
            c35348Pz0.m89200Ql(z, z2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireContainerOrder wireContainerOrder) {
            m93043a(wireContainerOrder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireContainerOrder;", "wireContainerOrder", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireContainerOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nz0$f */
    /* loaded from: classes3.dex */
    public static final class C5793f extends Lambda implements Function1<WireContainerOrder, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C5793f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(WireContainerOrder wireContainerOrder) {
            Intrinsics.checkNotNullParameter(wireContainerOrder, "wireContainerOrder");
            return C34880Nz0.this.f25470b.m113159b(wireContainerOrder, C34880Nz0.this.f25473e.mo80291m(wireContainerOrder), C34880Nz0.this.f25473e.mo80283s(wireContainerOrder));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nz0$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5794g extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C5794g(Object obj) {
            super(1, obj, C35348Pz0.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C35348Pz0) this.receiver).m89195b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireContainerOrder;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nz0$h */
    /* loaded from: classes3.dex */
    public static final class C5795h extends Lambda implements Function1<Pair<? extends String, ? extends WireContainerOrder>, Unit> {
        public C5795h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends WireContainerOrder> pair) {
            invoke2((Pair<String, WireContainerOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, WireContainerOrder> pair) {
            String component1 = pair.component1();
            WireContainerOrder containerOrder = pair.component2();
            O86 o86 = C34880Nz0.this.f25473e;
            Intrinsics.checkNotNullExpressionValue(containerOrder, "containerOrder");
            if ((!o86.mo80283s(containerOrder)) && containerOrder.getStatus() == ContainerOrderStatus.IN_TRANSIT) {
                C34880Nz0.this.f25476h.onNext(Unit.INSTANCE);
            } else {
                InterfaceC40099e13.C19924a.goToSKUOrderDetails$default(C34880Nz0.this.f25471c, component1, null, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireContainerOrder;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/DialogResponse;", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nz0$i */
    /* loaded from: classes3.dex */
    public static final class C5796i extends Lambda implements Function1<Pair<? extends Unit, ? extends WireContainerOrder>, InterfaceC24574u<? extends DialogResponse>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Nz0$i$a */
        /* loaded from: classes3.dex */
        public static final class C5797a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends DialogResponse>> {

            /* renamed from: g */
            public static final C5797a f25483g = new C5797a();

            public C5797a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends DialogResponse> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        public C5796i() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m93039c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends DialogResponse> invoke(Pair<Unit, WireContainerOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireContainerOrder containerOrder = pair.component2();
            O86 o86 = C34880Nz0.this.f25473e;
            Intrinsics.checkNotNullExpressionValue(containerOrder, "containerOrder");
            boolean mo80283s = o86.mo80283s(containerOrder);
            if (mo80283s && !containerOrder.getBooked()) {
                AbstractC23442F<DialogResponse> m89198Sl = C34880Nz0.this.f25469a.m89198Sl(C34880Nz0.this.f25474f);
                final C5797a c5797a = C5797a.f25483g;
                return m89198Sl.m33163C(new InterfaceC23492o() { // from class: Oz0
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m93039c;
                        m93039c = C34880Nz0.C5796i.m93039c(Function1.this, obj);
                        return m93039c;
                    }
                });
            } else if (mo80283s) {
                return C34880Nz0.this.f25469a.m89197Tl().m33125j0();
            } else {
                if (!mo80283s && containerOrder.getStatus() == ContainerOrderStatus.IN_TRANSIT) {
                    return C34880Nz0.this.f25469a.m89199Rl().m33125j0();
                }
                return AbstractC24507p.m32024u();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nz0$j */
    /* loaded from: classes3.dex */
    public static final class C5798j extends Lambda implements Function1<DialogResponse, Boolean> {

        /* renamed from: g */
        public static final C5798j f25484g = new C5798j();

        public C5798j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(DialogResponse response) {
            boolean z;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response == DialogResponse.OK) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nz0$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5799k extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C5799k(Object obj) {
            super(1, obj, C35348Pz0.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C35348Pz0) this.receiver).error(p0);
        }
    }

    public C34880Nz0(C35348Pz0 ui, C32072Bz0 converter, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, O86 transferOrderManager, String containerOrderId) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(containerOrderId, "containerOrderId");
        this.f25469a = ui;
        this.f25470b = converter;
        this.f25471c = navigator;
        this.f25472d = scopeProvider;
        this.f25473e = transferOrderManager;
        this.f25474f = containerOrderId;
        C24552a<WireContainerOrder> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireContainerOrder>()");
        this.f25475g = m31922e;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f25476h = m31902e;
    }

    /* renamed from: m */
    public static final void m93056m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m93055n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m93054o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m93053p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23447K m93052q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m93051r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m93050s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC24574u m93049t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final boolean m93048u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: v */
    public static final void m93047v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m93046w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public final void m93057l() {
        AbstractC23442F<WireContainerOrder> m33146T = this.f25473e.mo80297g(this.f25474f).m33146T(3L);
        Intrinsics.checkNotNullExpressionValue(m33146T, "transferOrderManager\n   …rOrderId)\n      .retry(3)");
        Object m33135e = m33146T.m33135e(AutoDispose.m45239a(this.f25472d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5790c c5790c = new C5790c(this.f25475g);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Cz0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34880Nz0.m93056m(Function1.this, obj);
            }
        };
        final C5791d c5791d = new C5791d(this.f25469a);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Fz0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34880Nz0.m93055n(Function1.this, obj);
            }
        });
        Observable<WireContainerOrder> observeOn = this.f25475g.observeOn(C23454a.m33087a());
        final C5792e c5792e = new C5792e();
        Observable<WireContainerOrder> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: Gz0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34880Nz0.m93053p(Function1.this, obj);
            }
        });
        final C5793f c5793f = new C5793f();
        Observable<R> flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: Hz0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m93052q;
                m93052q = C34880Nz0.m93052q(Function1.this, obj);
                return m93052q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onResume() {\n    tra…r(containerOrderId) }\n  }");
        Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(this.f25472d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5794g c5794g = new C5794g(this.f25469a);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Iz0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34880Nz0.m93051r(Function1.this, obj);
            }
        });
        Observable observeOn2 = C24527f.m31950a(this.f25469a.m89196Ul(), this.f25475g).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.skuOrderClicks()\n    …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f25472d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5795h c5795h = new C5795h();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Jz0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34880Nz0.m93050s(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f25476h, this.f25475g);
        final C5796i c5796i = new C5796i();
        Observable flatMapMaybe = m31950a.flatMapMaybe(new InterfaceC23492o() { // from class: Kz0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m93049t;
                m93049t = C34880Nz0.m93049t(Function1.this, obj);
                return m93049t;
            }
        });
        final C5798j c5798j = C5798j.f25484g;
        Observable filter = flatMapMaybe.filter(new InterfaceC23494q() { // from class: Lz0
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m93048u;
                m93048u = C34880Nz0.m93048u(Function1.this, obj);
                return m93048u;
            }
        });
        final C5799k c5799k = new C5799k(this.f25469a);
        Observable observeOn3 = filter.doOnError(new InterfaceC23484g() { // from class: Mz0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34880Nz0.m93047v(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "fun onResume() {\n    tra…r(containerOrderId) }\n  }");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f25472d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5788a c5788a = new C5788a();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Dz0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34880Nz0.m93046w(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f25469a.m89201Pl().m33094as(AutoDispose.m45239a(this.f25472d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5789b c5789b = new C5789b();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Ez0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34880Nz0.m93054o(Function1.this, obj);
            }
        });
    }
}
