package p000;

import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.OperatorOrderViewSection;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32219Cp3;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LCp3;", "Lf1;", "LEp3;", "LFp3;", "renderer", "", "s", "LO86;", "e", "LO86;", "transferOrderManager", "LGp3;", "f", "LGp3;", "navigator", "<init>", "(LO86;LGp3;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/operator/landing/OperatorOrderLandingPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,48:1\n180#2:49\n180#2:50\n237#2:51\n*S KotlinDebug\n*F\n+ 1 OperatorOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/operator/landing/OperatorOrderLandingPresenter\n*L\n30#1:49\n34#1:50\n44#1:51\n*E\n"})
/* renamed from: Cp3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32219Cp3 extends AbstractC20169f1<InterfaceC32687Ep3, AbstractC32921Fp3> {

    /* renamed from: e */
    public final O86 f4749e;

    /* renamed from: f */
    public final C33155Gp3 f4750f;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u008a\u0001\u0012>\b\u0001\u0012:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u0004 \u0006*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u0004\u0018\u00010\u00000\u0000 \u0006*D\u0012>\b\u0001\u0012:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u0004 \u0006*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "sections", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/OperatorOrderView;", "kotlin.jvm.PlatformType", "c", "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/operator/landing/OperatorOrderLandingPresenter$consume$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1549#2:49\n1620#2,3:50\n*S KotlinDebug\n*F\n+ 1 OperatorOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/operator/landing/OperatorOrderLandingPresenter$consume$1\n*L\n23#1:49\n23#1:50,3\n*E\n"})
    /* renamed from: Cp3$a */
    /* loaded from: classes3.dex */
    public static final class C1189a extends Lambda implements Function1<List<? extends OperatorOrderViewSection>, InterfaceC23434B<? extends List<? extends Pair<? extends OperatorOrderViewSection, ? extends List<? extends OperatorOrderView>>>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorOrderView;", "orders", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Cp3$a$a */
        /* loaded from: classes3.dex */
        public static final class C1190a extends Lambda implements Function1<List<? extends OperatorOrderView>, Pair<? extends OperatorOrderViewSection, ? extends List<? extends OperatorOrderView>>> {

            /* renamed from: g */
            public final /* synthetic */ OperatorOrderViewSection f4752g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1190a(OperatorOrderViewSection operatorOrderViewSection) {
                super(1);
                this.f4752g = operatorOrderViewSection;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<OperatorOrderViewSection, List<OperatorOrderView>> invoke(List<OperatorOrderView> orders) {
                Intrinsics.checkNotNullParameter(orders, "orders");
                return TuplesKt.m28425to(this.f4752g, orders);
            }
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0005 \u0002*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0005\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "pairs", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "Lco/bird/android/model/persistence/OperatorOrderView;", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOperatorOrderLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/operator/landing/OperatorOrderLandingPresenter$consume$1$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,48:1\n11335#2:49\n11670#2,3:50\n*S KotlinDebug\n*F\n+ 1 OperatorOrderLandingPresenter.kt\nco/bird/android/feature/transferorder/operator/landing/OperatorOrderLandingPresenter$consume$1$2\n*L\n27#1:49\n27#1:50,3\n*E\n"})
        /* renamed from: Cp3$a$b */
        /* loaded from: classes3.dex */
        public static final class C1191b extends Lambda implements Function1<Object[], List<? extends Pair<? extends OperatorOrderViewSection, ? extends List<? extends OperatorOrderView>>>> {

            /* renamed from: g */
            public static final C1191b f4753g = new C1191b();

            public C1191b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<Pair<OperatorOrderViewSection, List<OperatorOrderView>>> invoke(Object[] pairs) {
                Intrinsics.checkNotNullParameter(pairs, "pairs");
                ArrayList arrayList = new ArrayList(pairs.length);
                for (Object obj : pairs) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Pair<co.bird.android.model.persistence.OperatorOrderViewSection, kotlin.collections.List<co.bird.android.model.persistence.OperatorOrderView>>");
                    arrayList.add((Pair) obj);
                }
                return arrayList;
            }
        }

        public C1189a() {
            super(1);
        }

        /* renamed from: d */
        public static final Pair m111485d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final List m111484e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23434B<? extends List<Pair<OperatorOrderViewSection, List<OperatorOrderView>>>> invoke(List<OperatorOrderViewSection> sections) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(sections, "sections");
            List<OperatorOrderViewSection> list = sections;
            C32219Cp3 c32219Cp3 = C32219Cp3.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorOrderViewSection operatorOrderViewSection : list) {
                Observable<List<OperatorOrderView>> mo80286p0 = c32219Cp3.f4749e.mo80286p0(operatorOrderViewSection.getTitle());
                final C1190a c1190a = new C1190a(operatorOrderViewSection);
                arrayList.add(mo80286p0.map(new InterfaceC23492o() { // from class: Ap3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m111485d;
                        m111485d = C32219Cp3.C1189a.m111485d(Function1.this, obj);
                        return m111485d;
                    }
                }));
            }
            final C1191b c1191b = C1191b.f4753g;
            return Observable.combineLatest(arrayList, new InterfaceC23492o() { // from class: Bp3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m111484e;
                    m111484e = C32219Cp3.C1189a.m111484e(Function1.this, obj);
                    return m111484e;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00000\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "Lco/bird/android/model/persistence/OperatorOrderView;", "orders", "LpY3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)LpY3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cp3$b */
    /* loaded from: classes3.dex */
    public static final class C1192b extends Lambda implements Function1<List<? extends Pair<? extends OperatorOrderViewSection, ? extends List<? extends OperatorOrderView>>>, C46928pY3> {

        /* renamed from: g */
        public static final C1192b f4754g = new C1192b();

        public C1192b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C46928pY3 invoke(List<? extends Pair<OperatorOrderViewSection, ? extends List<OperatorOrderView>>> orders) {
            Intrinsics.checkNotNullParameter(orders, "orders");
            return new C46928pY3(orders);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp3$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1193c extends FunctionReferenceImpl implements Function1<AbstractC32921Fp3, Unit> {
        public C1193c(Object obj) {
            super(1, obj, C32219Cp3.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m111480a(AbstractC32921Fp3 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C32219Cp3) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC32921Fp3 abstractC32921Fp3) {
            m111480a(abstractC32921Fp3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/constant/OperatorOrderViewType;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp3$d */
    /* loaded from: classes3.dex */
    public static final class C1194d extends Lambda implements Function1<Pair<? extends String, ? extends OperatorOrderViewType>, Unit> {
        public C1194d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends OperatorOrderViewType> pair) {
            invoke2((Pair<String, ? extends OperatorOrderViewType>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends OperatorOrderViewType> pair) {
            C32219Cp3.this.f4750f.m104696e(pair.component1(), pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cp3$e */
    /* loaded from: classes3.dex */
    public static final class C1195e extends Lambda implements Function1<Unit, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Cp3$e$a */
        /* loaded from: classes3.dex */
        public static final class C1196a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C32219Cp3 f4757g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1196a(C32219Cp3 c32219Cp3) {
                super(1);
                this.f4757g = c32219Cp3;
            }

            /* renamed from: a */
            public final void m111477a(InterfaceC23465c interfaceC23465c) {
                this.f4757g.m42280h(new C51877xt2(true));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m111477a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        public C1195e() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c mo80298f = C32219Cp3.this.f4749e.mo80298f();
            final C1196a c1196a = new C1196a(C32219Cp3.this);
            return mo80298f.m33081E(new InterfaceC23484g() { // from class: Dp3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C32219Cp3.C1195e.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp3$f */
    /* loaded from: classes3.dex */
    public static final class C1197f extends Lambda implements Function1<Throwable, Unit> {
        public C1197f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C32219Cp3 c32219Cp3 = C32219Cp3.this;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            c32219Cp3.m42280h(new C37509Zf1(e));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32219Cp3(O86 transferOrderManager, C33155Gp3 navigator) {
        super(C48409s22.f108165a);
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f4749e = transferOrderManager;
        this.f4750f = navigator;
    }

    /* renamed from: t */
    public static final InterfaceC23434B m111494t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final C46928pY3 m111493u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C46928pY3) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m111492v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m111491w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23496h m111490x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m111489y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: s */
    public void consume(InterfaceC32687Ep3 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<List<OperatorOrderViewSection>> mo80300d0 = this.f4749e.mo80300d0();
        final C1189a c1189a = new C1189a();
        Observable<R> flatMap = mo80300d0.flatMap(new InterfaceC23492o() { // from class: up3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m111494t;
                m111494t = C32219Cp3.m111494t(Function1.this, obj);
                return m111494t;
            }
        });
        final C1192b c1192b = C1192b.f4754g;
        Observable map = flatMap.map(new InterfaceC23492o() { // from class: vp3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C46928pY3 m111493u;
                m111493u = C32219Cp3.m111493u(Function1.this, obj);
                return m111493u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1193c c1193c = new C1193c(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: wp3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32219Cp3.m111492v(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.mo15314N4().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1194d c1194d = new C1194d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: xp3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32219Cp3.m111491w(Function1.this, obj);
            }
        });
        Observable<Unit> mo15311m3 = renderer.mo15311m3();
        final C1195e c1195e = new C1195e();
        AbstractC23461c flatMapCompletable = mo15311m3.flatMapCompletable(new InterfaceC23492o() { // from class: yp3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m111490x;
                m111490x = C32219Cp3.m111490x(Function1.this, obj);
                return m111490x;
            }
        });
        final C1197f c1197f = new C1197f();
        AbstractC23461c m33066T = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: zp3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32219Cp3.m111489y(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }
}
