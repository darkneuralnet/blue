package p000;

import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.constant.OperatorOrderViewTypeKt;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C42352hp3;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lhp3;", "Lf1;", "Llp3;", "Lmp3;", "renderer", "", "H", "", "orderId", "Lio/reactivex/c;", "b0", "LO86;", "e", "LO86;", "transferOrderManager", "LDQ3;", "f", "LDQ3;", "permissionManager", "Le13;", "g", "Le13;", "navigator", "Lma4;", "Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "h", "Lma4;", "scannedItemsRelay", "<init>", "(LO86;LDQ3;Le13;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsPresenter.kt\nco/bird/android/feature/transferorder/operator/details/OperatorOrderDetailsPresenter\n+ 2 Rx+.kt\nco/bird/android/library/rx/Rx_Kt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,162:1\n641#2,2:163\n641#2,2:166\n641#2,2:170\n641#2,2:173\n641#2,2:176\n641#2,2:179\n180#3:165\n237#3:168\n180#3:169\n180#3:172\n180#3:175\n180#3:178\n218#3:181\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsPresenter.kt\nco/bird/android/feature/transferorder/operator/details/OperatorOrderDetailsPresenter\n*L\n33#1:163,2\n80#1:166,2\n96#1:170,2\n112#1:173,2\n118#1:176,2\n135#1:179,2\n77#1:165\n83#1:168\n87#1:169\n100#1:172\n114#1:175\n130#1:178\n151#1:181\n*E\n"})
/* renamed from: hp3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42352hp3 extends AbstractC20169f1<InterfaceC44724lp3, AbstractC45317mp3> {

    /* renamed from: e */
    public final O86 f85931e;

    /* renamed from: f */
    public final DQ3 f85932f;

    /* renamed from: g */
    public final InterfaceC40099e13 f85933g;

    /* renamed from: h */
    public final C45168ma4<WireSkuScannedItems> f85934h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hp3$A */
    /* loaded from: classes3.dex */
    public static final class C22730A extends Lambda implements Function1<Throwable, Unit> {
        public C22730A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C42352hp3 c42352hp3 = C42352hp3.this;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            c42352hp3.m42280h(new C37275Yf1(e));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hp3$B */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22731B extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C22731B(Object obj) {
            super(1, obj, InterfaceC40099e13.class, "goToGoogleMap", "goToGoogleMap(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC40099e13) this.receiver).mo37047b4(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "LFQ3;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$C */
    /* loaded from: classes3.dex */
    public static final class C22732C extends Lambda implements Function1<Unit, InterfaceC24574u<? extends FQ3>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFQ3;", "response", "", C17296a.f69688o, "(LFQ3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: hp3$C$a */
        /* loaded from: classes3.dex */
        public static final class C22733a extends Lambda implements Function1<FQ3, Boolean> {

            /* renamed from: g */
            public static final C22733a f85937g = new C22733a();

            public C22733a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(FQ3 response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return Boolean.valueOf(response.m107154a());
            }
        }

        public C22732C() {
            super(1);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<FQ3> m110485l = C42352hp3.this.f85932f.m110485l(Permission.CAMERA);
            final C22733a c22733a = C22733a.f85937g;
            return m110485l.m33098z(new InterfaceC23494q() { // from class: kp3
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = C42352hp3.C22732C.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LIO5;", TransferTable.COLUMN_STATE, "Lio/reactivex/B;", "Lco/bird/android/model/persistence/OperatorOrderView;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LIO5;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$D */
    /* loaded from: classes3.dex */
    public static final class C22734D extends Lambda implements Function1<IO5, InterfaceC23434B<? extends OperatorOrderView>> {
        public C22734D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends OperatorOrderView> invoke(IO5 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return C42352hp3.this.f85931e.mo80305W(state.m102422b(), state.m102421c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$E */
    /* loaded from: classes3.dex */
    public static final class C22735E extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C22735E() {
            super(1);
        }

        /* renamed from: a */
        public final void m35792a(InterfaceC23465c interfaceC23465c) {
            C42352hp3.this.m42280h(new C51284wt2(true));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m35792a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hp3$F */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22736F extends FunctionReferenceImpl implements Function1<WireSkuScannedItems, Unit> {
        public C22736F(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m35791a(WireSkuScannedItems p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireSkuScannedItems wireSkuScannedItems) {
            m35791a(wireSkuScannedItems);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$a */
    /* loaded from: classes3.dex */
    public static final class C22737a<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C22737a<T, R> f85940b = new C22737a<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final IO5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (IO5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$b */
    /* loaded from: classes3.dex */
    public static final class C22738b<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C22738b<T> f85941b = new C22738b<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof IO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$c */
    /* loaded from: classes3.dex */
    public static final class C22739c<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C22739c<T, R> f85942b = new C22739c<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final IO5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (IO5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$d */
    /* loaded from: classes3.dex */
    public static final class C22740d<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C22740d<T> f85943b = new C22740d<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof IO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$e */
    /* loaded from: classes3.dex */
    public static final class C22741e<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C22741e<T, R> f85944b = new C22741e<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final IO5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (IO5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$f */
    /* loaded from: classes3.dex */
    public static final class C22742f<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C22742f<T> f85945b = new C22742f<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof IO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$g */
    /* loaded from: classes3.dex */
    public static final class C22743g<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C22743g<T, R> f85946b = new C22743g<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final IO5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (IO5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$h */
    /* loaded from: classes3.dex */
    public static final class C22744h<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C22744h<T> f85947b = new C22744h<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof IO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$i */
    /* loaded from: classes3.dex */
    public static final class C22745i<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C22745i<T, R> f85948b = new C22745i<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final IO5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (IO5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$j */
    /* loaded from: classes3.dex */
    public static final class C22746j<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C22746j<T> f85949b = new C22746j<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof IO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$k */
    /* loaded from: classes3.dex */
    public static final class C22747k<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C22747k<T, R> f85950b = new C22747k<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final IO5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (IO5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: hp3$l */
    /* loaded from: classes3.dex */
    public static final class C22748l<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C22748l<T> f85951b = new C22748l<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof IO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LIO5;", TransferTable.COLUMN_STATE, "Lio/reactivex/B;", "Lco/bird/android/model/persistence/OperatorOrderView;", "kotlin.jvm.PlatformType", "b", "(LIO5;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$m */
    /* loaded from: classes3.dex */
    public static final class C22749m extends Lambda implements Function1<IO5, InterfaceC23434B<? extends OperatorOrderView>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorOrderView;", "orderView", "Lco/bird/android/model/wire/WireSkuScannedItems;", "scannedItem", C17296a.f69688o, "(Lco/bird/android/model/persistence/OperatorOrderView;Lco/bird/android/model/wire/WireSkuScannedItems;)Lco/bird/android/model/persistence/OperatorOrderView;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOperatorOrderDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsPresenter.kt\nco/bird/android/feature/transferorder/operator/details/OperatorOrderDetailsPresenter$consume$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,162:1\n2624#2,3:163\n1747#2,3:166\n2624#2,3:169\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsPresenter.kt\nco/bird/android/feature/transferorder/operator/details/OperatorOrderDetailsPresenter$consume$1$1\n*L\n45#1:163,3\n58#1:166,3\n64#1:169,3\n*E\n"})
        /* renamed from: hp3$m$a */
        /* loaded from: classes3.dex */
        public static final class C22750a extends Lambda implements Function2<OperatorOrderView, WireSkuScannedItems, OperatorOrderView> {

            /* renamed from: g */
            public final /* synthetic */ C42352hp3 f85953g;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: hp3$m$a$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C22751a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OperatorOrderViewType.values().length];
                    try {
                        iArr[OperatorOrderViewType.DROP_OFF.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OperatorOrderViewType.LONGTAIL_RETURN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[OperatorOrderViewType.PICK_UP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[OperatorOrderViewType.LONGTAIL_DELIVERY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22750a(C42352hp3 c42352hp3) {
                super(2);
                this.f85953g = c42352hp3;
            }

            /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
                if (r12.getSuccessfulScannedItems().size() < r11.getQuantity()) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
                if (r12.getSuccessfulScannedItems().size() >= r11.getQuantity()) goto L12;
             */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final OperatorOrderView invoke(OperatorOrderView orderView, WireSkuScannedItems scannedItem) {
                boolean isEmpty;
                boolean z;
                int i;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                Intrinsics.checkNotNullParameter(orderView, "orderView");
                Intrinsics.checkNotNullParameter(scannedItem, "scannedItem");
                C42352hp3 c42352hp3 = this.f85953g;
                OperatorOrderViewType type = orderView.getType();
                int i2 = C22751a.$EnumSwitchMapping$0[orderView.getType().ordinal()];
                boolean z6 = false;
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        z = false;
                        i = C22751a.$EnumSwitchMapping$0[orderView.getType().ordinal()];
                        if (i == 1 && i != 2) {
                            if (i == 3 || i == 4) {
                                List<WireSuccessfulScannedItem> successfulScannedItems = scannedItem.getSuccessfulScannedItems();
                                if (!(successfulScannedItems instanceof Collection) || !successfulScannedItems.isEmpty()) {
                                    for (WireSuccessfulScannedItem wireSuccessfulScannedItem : successfulScannedItems) {
                                        if (!wireSuccessfulScannedItem.getReceived()) {
                                            z4 = true;
                                            break;
                                        }
                                    }
                                }
                                z4 = false;
                                if (!z4) {
                                    List<WireSuccessfulScannedItem> successfulScannedItems2 = scannedItem.getSuccessfulScannedItems();
                                    if (!(successfulScannedItems2 instanceof Collection) || !successfulScannedItems2.isEmpty()) {
                                        for (WireSuccessfulScannedItem wireSuccessfulScannedItem2 : successfulScannedItems2) {
                                            if (!wireSuccessfulScannedItem2.getReceived()) {
                                                z5 = false;
                                                break;
                                            }
                                        }
                                    }
                                    z5 = true;
                                    if (z5) {
                                    }
                                }
                                z2 = true;
                            }
                            z2 = false;
                        }
                        if (OperatorOrderViewTypeKt.isLongtail(orderView.getType())) {
                            z3 = orderView.getBolUploaded();
                        } else {
                            z3 = true;
                        }
                        if (orderView.getContainerOrderId() != null) {
                            z6 = true;
                        }
                        c42352hp3.m42280h(new C44806lx5(type, z, z2, z3, z6));
                        return orderView;
                    }
                    List<WireSuccessfulScannedItem> successfulScannedItems3 = scannedItem.getSuccessfulScannedItems();
                    if (!(successfulScannedItems3 instanceof Collection) || !successfulScannedItems3.isEmpty()) {
                        for (WireSuccessfulScannedItem wireSuccessfulScannedItem3 : successfulScannedItems3) {
                            if (wireSuccessfulScannedItem3.getReceived()) {
                                isEmpty = false;
                                break;
                            }
                        }
                    }
                    isEmpty = true;
                } else {
                    isEmpty = scannedItem.getSuccessfulScannedItems().isEmpty();
                }
                z = isEmpty;
                i = C22751a.$EnumSwitchMapping$0[orderView.getType().ordinal()];
                if (i == 1) {
                }
            }
        }

        public C22749m() {
            super(1);
        }

        /* renamed from: c */
        public static final OperatorOrderView m35788c(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (OperatorOrderView) tmp0.invoke(obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends OperatorOrderView> invoke(IO5 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            Observable<OperatorOrderView> mo80305W = C42352hp3.this.f85931e.mo80305W(state.m102422b(), state.m102421c());
            C45168ma4 c45168ma4 = C42352hp3.this.f85934h;
            final C22750a c22750a = new C22750a(C42352hp3.this);
            return Observable.combineLatest(mo80305W, c45168ma4, new InterfaceC23480c() { // from class: ip3
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    OperatorOrderView m35788c;
                    m35788c = C42352hp3.C22749m.m35788c(Function2.this, obj, obj2);
                    return m35788c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052F\u0010\u0004\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LFQ3;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/OperatorOrderView;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$n */
    /* loaded from: classes3.dex */
    public static final class C22752n extends Lambda implements Function1<Pair<? extends FQ3, ? extends OperatorOrderView>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hp3$n$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C22753a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OperatorOrderViewType.values().length];
                try {
                    iArr[OperatorOrderViewType.PICK_UP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OperatorOrderViewType.DROP_OFF.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OperatorOrderViewType.LONGTAIL_DELIVERY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OperatorOrderViewType.LONGTAIL_RETURN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C22752n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends FQ3, ? extends OperatorOrderView> pair) {
            invoke2((Pair<FQ3, OperatorOrderView>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<FQ3, OperatorOrderView> pair) {
            OperatorOrderView component2 = pair.component2();
            int i = C22753a.$EnumSwitchMapping$0[component2.getType().ordinal()];
            if (i == 1) {
                C42352hp3.this.f85933g.mo37000j3(component2.getOrderId(), false, 10050);
            } else if (i == 2) {
                C42352hp3.this.f85933g.mo37056a1(component2.getOrderId(), false, 10051);
            } else if (i == 3) {
                C42352hp3.this.f85933g.mo37000j3(component2.getOrderId(), false, 10052);
            } else if (i != 4) {
            } else {
                C42352hp3.this.f85933g.mo37056a1(component2.getOrderId(), false, 10053);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "LIO5;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lm7;", C17296a.f69688o, "(Lkotlin/Pair;)Lm7;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$o */
    /* loaded from: classes3.dex */
    public static final class C22754o extends Lambda implements Function1<Pair<? extends Unit, ? extends IO5>, C25915m7> {

        /* renamed from: g */
        public static final C22754o f85955g = new C22754o();

        public C22754o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C25915m7 invoke(Pair<Unit, IO5> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            IO5 component2 = pair.component2();
            return new C25915m7(component2.m102422b(), component2.m102421c());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hp3$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22755p extends FunctionReferenceImpl implements Function1<AbstractC45317mp3, Unit> {
        public C22755p(Object obj) {
            super(1, obj, C42352hp3.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m35785a(AbstractC45317mp3 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C42352hp3) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC45317mp3 abstractC45317mp3) {
            m35785a(abstractC45317mp3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/constant/OperatorOrderViewType;", "LIO5;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/u;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$q */
    /* loaded from: classes3.dex */
    public static final class C22756q extends Lambda implements Function1<Pair<? extends OperatorOrderViewType, ? extends IO5>, InterfaceC24574u<? extends OperatorOrderViewType>> {
        public C22756q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends OperatorOrderViewType> invoke(Pair<? extends OperatorOrderViewType, IO5> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            OperatorOrderViewType component1 = pair.component1();
            IO5 component2 = pair.component2();
            if (component1 == OperatorOrderViewType.LONGTAIL_RETURN) {
                return C42352hp3.this.m35813b0(component2.m102422b()).m33045k(AbstractC24507p.m32024u());
            }
            return AbstractC24507p.m32068G(component1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/OperatorOrderViewType;", "type", "Lns0;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/constant/OperatorOrderViewType;)Lns0;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$r */
    /* loaded from: classes3.dex */
    public static final class C22757r extends Lambda implements Function1<OperatorOrderViewType, C45937ns0> {

        /* renamed from: g */
        public static final C22757r f85957g = new C22757r();

        public C22757r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C45937ns0 invoke(OperatorOrderViewType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new C45937ns0(type);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hp3$s */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22758s extends FunctionReferenceImpl implements Function1<AbstractC45317mp3, Unit> {
        public C22758s(Object obj) {
            super(1, obj, C42352hp3.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m35782a(AbstractC45317mp3 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C42352hp3) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC45317mp3 abstractC45317mp3) {
            m35782a(abstractC45317mp3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LIO5;", TransferTable.COLUMN_STATE, "Lio/reactivex/K;", "Lco/bird/android/model/persistence/OperatorOrderView;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LIO5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$t */
    /* loaded from: classes3.dex */
    public static final class C22759t extends Lambda implements Function1<IO5, InterfaceC23447K<? extends OperatorOrderView>> {
        public C22759t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends OperatorOrderView> invoke(IO5 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return C42352hp3.this.f85931e.mo80305W(state.m102422b(), state.m102421c()).firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorOrderView;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lmp3;", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$u */
    /* loaded from: classes3.dex */
    public static final class C22760u extends Lambda implements Function1<Pair<? extends Unit, ? extends OperatorOrderView>, InterfaceC24574u<? extends AbstractC45317mp3>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: hp3$u$a */
        /* loaded from: classes3.dex */
        public static final class C22761a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42352hp3 f85960g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22761a(C42352hp3 c42352hp3) {
                super(1);
                this.f85960g = c42352hp3;
            }

            /* renamed from: a */
            public final void m35778a(InterfaceC23465c interfaceC23465c) {
                this.f85960g.m42280h(new C51284wt2(true));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m35778a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        public C22760u() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends AbstractC45317mp3> invoke(Pair<Unit, OperatorOrderView> pair) {
            AbstractC24507p m32068G;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            OperatorOrderView component2 = pair.component2();
            AbstractC23461c mo80298f = C42352hp3.this.f85931e.mo80298f();
            final C22761a c22761a = new C22761a(C42352hp3.this);
            AbstractC23461c m33065U = mo80298f.m33081E(new InterfaceC23484g() { // from class: jp3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42352hp3.C22760u.invoke$lambda$0(Function1.this, obj);
                }
            }).m33065U(3L);
            if (component2.getType() == OperatorOrderViewType.LONGTAIL_DELIVERY) {
                m32068G = AbstractC24507p.m32024u();
            } else {
                m32068G = AbstractC24507p.m32068G(new C45937ns0(component2.getType()));
            }
            return m33065U.m33045k(m32068G);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "e", "Lio/reactivex/u;", "Lmp3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$v */
    /* loaded from: classes3.dex */
    public static final class C22762v extends Lambda implements Function1<Throwable, InterfaceC24574u<? extends AbstractC45317mp3>> {

        /* renamed from: g */
        public static final C22762v f85961g = new C22762v();

        public C22762v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends AbstractC45317mp3> invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return AbstractC24507p.m32068G(new C37275Yf1(e));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hp3$w */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22763w extends FunctionReferenceImpl implements Function1<AbstractC45317mp3, Unit> {
        public C22763w(Object obj) {
            super(1, obj, C42352hp3.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m35776a(AbstractC45317mp3 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C42352hp3) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC45317mp3 abstractC45317mp3) {
            m35776a(abstractC45317mp3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorOrderView;", "order", "LoY3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/OperatorOrderView;)LoY3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$x */
    /* loaded from: classes3.dex */
    public static final class C22764x extends Lambda implements Function1<OperatorOrderView, C46335oY3> {

        /* renamed from: g */
        public static final C22764x f85962g = new C22764x();

        public C22764x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C46335oY3 invoke(OperatorOrderView order) {
            Intrinsics.checkNotNullParameter(order, "order");
            return new C46335oY3(order);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hp3$y */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22765y extends FunctionReferenceImpl implements Function1<AbstractC45317mp3, Unit> {
        public C22765y(Object obj) {
            super(1, obj, C42352hp3.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m35774a(AbstractC45317mp3 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C42352hp3) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC45317mp3 abstractC45317mp3) {
            m35774a(abstractC45317mp3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LIO5;", TransferTable.COLUMN_STATE, "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LIO5;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hp3$z */
    /* loaded from: classes3.dex */
    public static final class C22766z extends Lambda implements Function1<IO5, InterfaceC23496h> {
        public C22766z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(IO5 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return C42352hp3.this.m35813b0(state.m102422b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42352hp3(O86 transferOrderManager, DQ3 permissionManager, InterfaceC40099e13 navigator) {
        super(C47817r22.f106318a);
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f85931e = transferOrderManager;
        this.f85932f = permissionManager;
        this.f85933g = navigator;
        C45168ma4<WireSkuScannedItems> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<WireSkuScannedItems>()");
        this.f85934h = m25409g;
    }

    /* renamed from: I */
    public static final InterfaceC23434B m35832I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final C46335oY3 m35831J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C46335oY3) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final C25915m7 m35830K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C25915m7) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m35829L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC24574u m35828M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final C45937ns0 m35827N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C45937ns0) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m35826O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23447K m35825P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC24574u m35824Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final InterfaceC24574u m35823R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m35822S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m35821T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23496h m35820U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m35819V() {
    }

    /* renamed from: W */
    public static final void m35818W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m35817X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC24574u m35816Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final InterfaceC23434B m35815Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m35814a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m35812c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m35811d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: H */
    public void consume(InterfaceC44724lp3 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<R> map = m42276l().filter(C22740d.f85943b).map(C22741e.f85944b);
        Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
        final C22749m c22749m = new C22749m();
        Observable switchMap = map.switchMap(new InterfaceC23492o() { // from class: Mo3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m35832I;
                m35832I = C42352hp3.m35832I(Function1.this, obj);
                return m35832I;
            }
        });
        final C22764x c22764x = C22764x.f85962g;
        Observable map2 = switchMap.map(new InterfaceC23492o() { // from class: No3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C46335oY3 m35831J;
                m35831J = C42352hp3.m35831J(Function1.this, obj);
                return m35831J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "override fun consume(ren…   .subscribe(::emit)\n  }");
        Object m33094as = map2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22765y c22765y = new C22765y(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Oo3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42352hp3.m35821T(Function1.this, obj);
            }
        });
        Observable<R> map3 = m42276l().filter(C22742f.f85945b).map(C22743g.f85946b);
        Intrinsics.checkNotNullExpressionValue(map3, "filter { item -> item is…map { item -> item as K }");
        final C22766z c22766z = new C22766z();
        AbstractC23461c m33065U = map3.flatMapCompletable(new InterfaceC23492o() { // from class: Po3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m35820U;
                m35820U = C42352hp3.m35820U(Function1.this, obj);
                return m35820U;
            }
        }).m33065U(3L);
        Intrinsics.checkNotNullExpressionValue(m33065U, "override fun consume(ren…   .subscribe(::emit)\n  }");
        Object m33041n = m33065U.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Qo3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C42352hp3.m35819V();
            }
        };
        final C22730A c22730a = new C22730A();
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Ro3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42352hp3.m35818W(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.mo26762f7().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22731B c22731b = new C22731B(this.f85933g);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: So3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42352hp3.m35817X(Function1.this, obj);
            }
        });
        Observable<Unit> mo26761h = renderer.mo26761h();
        final C22732C c22732c = new C22732C();
        Observable<R> flatMapMaybe = mo26761h.flatMapMaybe(new InterfaceC23492o() { // from class: To3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m35816Y;
                m35816Y = C42352hp3.m35816Y(Function1.this, obj);
                return m35816Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun consume(ren…   .subscribe(::emit)\n  }");
        Observable<R> map4 = m42276l().filter(C22744h.f85947b).map(C22745i.f85948b);
        Intrinsics.checkNotNullExpressionValue(map4, "filter { item -> item is…map { item -> item as K }");
        final C22734D c22734d = new C22734D();
        Observable flatMap = map4.flatMap(new InterfaceC23492o() { // from class: Uo3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m35815Z;
                m35815Z = C42352hp3.m35815Z(Function1.this, obj);
                return m35815Z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "override fun consume(ren…   .subscribe(::emit)\n  }");
        Object m33094as3 = C24527f.m31950a(flatMapMaybe, flatMap).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22752n c22752n = new C22752n();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Vo3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42352hp3.m35814a0(Function1.this, obj);
            }
        });
        Observable<Unit> mo26763Z6 = renderer.mo26763Z6();
        InterfaceC23434B map5 = m42276l().filter(C22746j.f85949b).map(C22747k.f85950b);
        Intrinsics.checkNotNullExpressionValue(map5, "filter { item -> item is…map { item -> item as K }");
        Observable m31950a = C24527f.m31950a(mo26763Z6, map5);
        final C22754o c22754o = C22754o.f85955g;
        Observable map6 = m31950a.map(new InterfaceC23492o() { // from class: Xo3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C25915m7 m35830K;
                m35830K = C42352hp3.m35830K(Function1.this, obj);
                return m35830K;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "renderer.addBolClicks()\n…te.orderId, state.type) }");
        Object m33094as4 = map6.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22755p c22755p = new C22755p(this);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Zo3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42352hp3.m35829L(Function1.this, obj);
            }
        });
        Observable<OperatorOrderViewType> mo26765G7 = renderer.mo26765G7();
        InterfaceC23434B map7 = m42276l().filter(C22748l.f85951b).map(C22737a.f85940b);
        Intrinsics.checkNotNullExpressionValue(map7, "filter { item -> item is…map { item -> item as K }");
        Observable m31950a2 = C24527f.m31950a(mo26765G7, map7);
        final C22756q c22756q = new C22756q();
        Observable flatMapMaybe2 = m31950a2.flatMapMaybe(new InterfaceC23492o() { // from class: ap3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m35828M;
                m35828M = C42352hp3.m35828M(Function1.this, obj);
                return m35828M;
            }
        });
        final C22757r c22757r = C22757r.f85957g;
        Observable map8 = flatMapMaybe2.map(new InterfaceC23492o() { // from class: bp3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C45937ns0 m35827N;
                m35827N = C42352hp3.m35827N(Function1.this, obj);
                return m35827N;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map8, "override fun consume(ren…   .subscribe(::emit)\n  }");
        Object m33094as5 = map8.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22758s c22758s = new C22758s(this);
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: cp3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42352hp3.m35826O(Function1.this, obj);
            }
        });
        AbstractC23442F<Unit> mo26764W3 = renderer.mo26764W3();
        Observable<R> map9 = m42276l().filter(C22738b.f85941b).map(C22739c.f85942b);
        Intrinsics.checkNotNullExpressionValue(map9, "filter { item -> item is…map { item -> item as K }");
        final C22759t c22759t = new C22759t();
        Observable flatMapSingle = map9.flatMapSingle(new InterfaceC23492o() { // from class: dp3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m35825P;
                m35825P = C42352hp3.m35825P(Function1.this, obj);
                return m35825P;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun consume(ren…   .subscribe(::emit)\n  }");
        AbstractC23442F m74531s0 = C37279Yf5.m74531s0(mo26764W3, flatMapSingle);
        final C22760u c22760u = new C22760u();
        AbstractC24507p m33163C = m74531s0.m33163C(new InterfaceC23492o() { // from class: ep3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m35824Q;
                m35824Q = C42352hp3.m35824Q(Function1.this, obj);
                return m35824Q;
            }
        });
        final C22762v c22762v = C22762v.f85961g;
        AbstractC24507p m32062M = m33163C.m32062M(new InterfaceC23492o() { // from class: fp3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m35823R;
                m35823R = C42352hp3.m35823R(Function1.this, obj);
                return m35823R;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32062M, "override fun consume(ren…   .subscribe(::emit)\n  }");
        Object m32048b = m32062M.m32048b(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22763w c22763w = new C22763w(this);
        ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: gp3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42352hp3.m35822S(Function1.this, obj);
            }
        });
    }

    /* renamed from: b0 */
    public final AbstractC23461c m35813b0(String str) {
        AbstractC23442F<WireSkuScannedItems> mo80279w = this.f85931e.mo80279w(str);
        final C22735E c22735e = new C22735E();
        AbstractC23442F<WireSkuScannedItems> m33102v = mo80279w.m33102v(new InterfaceC23484g() { // from class: Wo3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42352hp3.m35812c0(Function1.this, obj);
            }
        });
        final C22736F c22736f = new C22736F(this.f85934h);
        AbstractC23461c m33159G = m33102v.m33101w(new InterfaceC23484g() { // from class: Yo3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42352hp3.m35811d0(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun refreshScann…     .ignoreElement()\n  }");
        return m33159G;
    }
}
