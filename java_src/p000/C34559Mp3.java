package p000;

import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.OperatorOrderViewSection;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34559Mp3;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LMp3;", "Lf1;", "LOp3;", "LPp3;", "renderer", "", "q", "LO86;", "e", "LO86;", "transferOrderManager", "LGp3;", "f", "LGp3;", "operatorOrderNavigator", "<init>", "(LO86;LGp3;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderPresenter.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,43:1\n199#2:44\n*S KotlinDebug\n*F\n+ 1 OperatorOrderPresenter.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderPresenter\n*L\n31#1:44\n*E\n"})
/* renamed from: Mp3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34559Mp3 extends AbstractC20169f1<InterfaceC35027Op3, AbstractC35261Pp3> {

    /* renamed from: e */
    public final O86 f23652e;

    /* renamed from: f */
    public final C33155Gp3 f23653f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Mp3$a */
    /* loaded from: classes3.dex */
    public static final class C5395a extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C5395a() {
            super(1);
        }

        /* renamed from: a */
        public final void m94697a(InterfaceC23465c interfaceC23465c) {
            C34559Mp3.this.m42280h(new C50691vt2(true));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m94697a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "sections", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/OperatorOrderView;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderPresenter.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderPresenter$consume$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,3:45\n*S KotlinDebug\n*F\n+ 1 OperatorOrderPresenter.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderPresenter$consume$2\n*L\n23#1:44\n23#1:45,3\n*E\n"})
    /* renamed from: Mp3$b */
    /* loaded from: classes3.dex */
    public static final class C5396b extends Lambda implements Function1<List<? extends OperatorOrderViewSection>, InterfaceC23447K<? extends List<? extends OperatorOrderView>>> {

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "orders", "", "Lco/bird/android/model/persistence/OperatorOrderView;", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOperatorOrderPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderPresenter.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderPresenter$consume$2$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n11335#2:44\n11670#2,3:45\n*S KotlinDebug\n*F\n+ 1 OperatorOrderPresenter.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderPresenter$consume$2$2\n*L\n25#1:44\n25#1:45,3\n*E\n"})
        /* renamed from: Mp3$b$a */
        /* loaded from: classes3.dex */
        public static final class C5397a extends Lambda implements Function1<Object[], List<? extends OperatorOrderView>> {

            /* renamed from: g */
            public static final C5397a f23656g = new C5397a();

            public C5397a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<OperatorOrderView> invoke(Object[] orders) {
                List<OperatorOrderView> flatten;
                Intrinsics.checkNotNullParameter(orders, "orders");
                ArrayList arrayList = new ArrayList(orders.length);
                for (Object obj : orders) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<co.bird.android.model.persistence.OperatorOrderView>");
                    arrayList.add((List) obj);
                }
                flatten = CollectionsKt__IterablesKt.flatten(arrayList);
                return flatten;
            }
        }

        public C5396b() {
            super(1);
        }

        /* renamed from: c */
        public static final List m94694c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends List<OperatorOrderView>> invoke(List<OperatorOrderViewSection> sections) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(sections, "sections");
            List<OperatorOrderViewSection> list = sections;
            C34559Mp3 c34559Mp3 = C34559Mp3.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorOrderViewSection operatorOrderViewSection : list) {
                arrayList.add(c34559Mp3.f23652e.mo80286p0(operatorOrderViewSection.getTitle()));
            }
            final C5397a c5397a = C5397a.f23656g;
            return Observable.zip(arrayList, new InterfaceC23492o() { // from class: Np3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m94694c;
                    m94694c = C34559Mp3.C5396b.m94694c(Function1.this, obj);
                    return m94694c;
                }
            }).firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/OperatorOrderView;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mp3$c */
    /* loaded from: classes3.dex */
    public static final class C5398c extends Lambda implements Function1<List<? extends OperatorOrderView>, Unit> {
        public C5398c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OperatorOrderView> list) {
            invoke2((List<OperatorOrderView>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<OperatorOrderView> list) {
            C34559Mp3.this.m42280h(new C50691vt2(false));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "orders", "", "Lco/bird/android/model/persistence/OperatorOrderView;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mp3$d */
    /* loaded from: classes3.dex */
    public static final class C5399d extends Lambda implements Function1<List<? extends OperatorOrderView>, Unit> {
        public C5399d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OperatorOrderView> list) {
            invoke2((List<OperatorOrderView>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<OperatorOrderView> orders) {
            Object first;
            Object first2;
            if (orders.size() == 1) {
                C33155Gp3 c33155Gp3 = C34559Mp3.this.f23653f;
                Intrinsics.checkNotNullExpressionValue(orders, "orders");
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) orders);
                String orderId = ((OperatorOrderView) first).getOrderId();
                first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) orders);
                c33155Gp3.m104696e(orderId, ((OperatorOrderView) first2).getType());
                return;
            }
            C34559Mp3.this.f23653f.m104697d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34559Mp3(O86 transferOrderManager, C33155Gp3 operatorOrderNavigator) {
        super(C37719a22.f49740a);
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(operatorOrderNavigator, "operatorOrderNavigator");
        this.f23652e = transferOrderManager;
        this.f23653f = operatorOrderNavigator;
    }

    /* renamed from: f */
    public static final void m94706f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23447K m94700r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m94699s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m94698t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: q */
    public void consume(InterfaceC35027Op3 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        AbstractC23461c mo80298f = this.f23652e.mo80298f();
        final C5395a c5395a = new C5395a();
        AbstractC23442F m33042m = mo80298f.m33081E(new InterfaceC23484g() { // from class: Ip3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34559Mp3.m94706f(Function1.this, obj);
            }
        }).m33042m(this.f23652e.mo80300d0().firstOrError());
        final C5396b c5396b = new C5396b();
        AbstractC23442F m33165A = m33042m.m33165A(new InterfaceC23492o() { // from class: Jp3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m94700r;
                m94700r = C34559Mp3.m94700r(Function1.this, obj);
                return m94700r;
            }
        });
        final C5398c c5398c = new C5398c();
        AbstractC23442F m33101w = m33165A.m33101w(new InterfaceC23484g() { // from class: Kp3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34559Mp3.m94699s(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun consume(ren…g()\n        }\n      }\n  }");
        Object m33135e = m33101w.m33135e(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5399d c5399d = new C5399d();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Lp3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34559Mp3.m94698t(Function1.this, obj);
            }
        });
    }
}
