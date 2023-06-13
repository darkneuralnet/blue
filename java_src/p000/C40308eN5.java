package p000;

import co.bird.android.model.wire.WireSafeStartValues;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C40308eN5;
import p000.C41318g46;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LeN5;", "Lf1;", "LhN5;", "LiN5;", "renderer", "", "v", "LYR4;", "e", "LYR4;", "rideManager", "LEa;", "f", "LEa;", "analyticsManager", "Le13;", "g", "Le13;", "navigator", "Lg46$b;", "E", "()Lg46$b;", "logger", "<init>", "(LYR4;LEa;Le13;)V", "sober_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSoberStartPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoberStartPresenter.kt\nco/bird/android/feature/sober/SoberStartPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Rx+.kt\nco/bird/android/library/rx/Rx_Kt\n*L\n1#1,76:1\n199#2:77\n180#2:80\n180#2:85\n180#2:90\n641#3,2:78\n641#3,2:81\n641#3,2:83\n641#3,2:86\n641#3,2:88\n*S KotlinDebug\n*F\n+ 1 SoberStartPresenter.kt\nco/bird/android/feature/sober/SoberStartPresenter\n*L\n37#1:77\n41#1:80\n52#1:85\n68#1:90\n40#1:78,2\n46#1:81,2\n50#1:83,2\n60#1:86,2\n67#1:88,2\n*E\n"})
/* renamed from: eN5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40308eN5 extends AbstractC20169f1<InterfaceC42087hN5, AbstractC42680iN5> {

    /* renamed from: e */
    public final YR4 f78288e;

    /* renamed from: f */
    public final InterfaceC1880Ea f78289f;

    /* renamed from: g */
    public final InterfaceC40099e13 f78290g;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: eN5$a */
    /* loaded from: classes3.dex */
    public static final class C20014a<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C20014a<T, R> f78291b = new C20014a<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final CO5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (CO5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: eN5$b */
    /* loaded from: classes3.dex */
    public static final class C20015b<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C20015b<T> f78292b = new C20015b<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof CO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: eN5$c */
    /* loaded from: classes3.dex */
    public static final class C20016c<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C20016c<T, R> f78293b = new C20016c<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final CO5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (CO5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: eN5$d */
    /* loaded from: classes3.dex */
    public static final class C20017d<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C20017d<T> f78294b = new C20017d<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof C12263b0;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: eN5$e */
    /* loaded from: classes3.dex */
    public static final class C20018e<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C20018e<T, R> f78295b = new C20018e<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final C12263b0 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (C12263b0) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: eN5$f */
    /* loaded from: classes3.dex */
    public static final class C20019f<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C20019f<T> f78296b = new C20019f<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof CO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: eN5$g */
    /* loaded from: classes3.dex */
    public static final class C20020g<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C20020g<T, R> f78297b = new C20020g<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final CO5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (CO5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: eN5$h */
    /* loaded from: classes3.dex */
    public static final class C20021h<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C20021h<T> f78298b = new C20021h<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof C45399mx5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: eN5$i */
    /* loaded from: classes3.dex */
    public static final class C20022i<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C20022i<T, R> f78299b = new C20022i<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final C45399mx5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (C45399mx5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: eN5$j */
    /* loaded from: classes3.dex */
    public static final class C20023j<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C20023j<T> f78300b = new C20023j<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof CO5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireSafeStartValues;", "values", "Lmx5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSafeStartValues;)Lmx5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: eN5$k */
    /* loaded from: classes3.dex */
    public static final class C20024k extends Lambda implements Function1<WireSafeStartValues, C45399mx5> {

        /* renamed from: g */
        public static final C20024k f78301g = new C20024k();

        public C20024k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C45399mx5 invoke(WireSafeStartValues values) {
            Intrinsics.checkNotNullParameter(values, "values");
            return new C45399mx5(values.getTitle(), values.getBody(), values.getWord());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eN5$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20025l extends FunctionReferenceImpl implements Function1<AbstractC42680iN5, Unit> {
        public C20025l(Object obj) {
            super(1, obj, C40308eN5.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m42962a(AbstractC42680iN5 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C40308eN5) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC42680iN5 abstractC42680iN5) {
            m42962a(abstractC42680iN5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eN5$m */
    /* loaded from: classes3.dex */
    public static final class C20026m extends Lambda implements Function1<Throwable, Unit> {
        public C20026m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C40308eN5 c40308eN5 = C40308eN5.this;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            c40308eN5.m42280h(new C36807Wf1(e));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LCO5;", "kotlin.jvm.PlatformType", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(LCO5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: eN5$n */
    /* loaded from: classes3.dex */
    public static final class C20027n extends Lambda implements Function1<CO5, Unit> {
        public C20027n() {
            super(1);
        }

        /* renamed from: a */
        public final void m42961a(CO5 co5) {
            C40308eN5.this.f78289f.mo55905y(new C50574vh5(null, null, null, co5.m112266b(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CO5 co5) {
            m42961a(co5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eN5$o */
    /* loaded from: classes3.dex */
    public static final class C20028o extends Lambda implements Function1<String, Boolean> {

        /* renamed from: g */
        public static final C20028o f78304g = new C20028o();

        public C20028o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062R\u0010\u0005\u001aN\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*&\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lb0;", "", "kotlin.jvm.PlatformType", "LCO5;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: eN5$p */
    /* loaded from: classes3.dex */
    public static final class C20029p extends Lambda implements Function1<Triple<? extends C12263b0, ? extends Boolean, ? extends CO5>, Unit> {
        public C20029p() {
            super(1);
        }

        /* renamed from: a */
        public final void m42960a(Triple<C12263b0, Boolean, CO5> triple) {
            Boolean attempted = triple.component2();
            InterfaceC1880Ea interfaceC1880Ea = C40308eN5.this.f78289f;
            String m112266b = triple.component3().m112266b();
            Intrinsics.checkNotNullExpressionValue(attempted, "attempted");
            interfaceC1880Ea.mo55905y(new C49982uh5(null, null, null, m112266b, attempted.booleanValue(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends C12263b0, ? extends Boolean, ? extends CO5> triple) {
            m42960a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lmx5;", TransferTable.COLUMN_STATE, "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "c", "(Lmx5;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: eN5$q */
    /* loaded from: classes3.dex */
    public static final class C20030q extends Lambda implements Function1<C45399mx5, InterfaceC23434B<? extends Boolean>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC42087hN5 f78306g;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", Entry.TYPE_TEXT, "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: eN5$q$a */
        /* loaded from: classes3.dex */
        public static final class C20031a extends Lambda implements Function1<String, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C45399mx5 f78307g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20031a(C45399mx5 c45399mx5) {
                super(1);
                this.f78307g = c45399mx5;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String text) {
                boolean equals;
                Intrinsics.checkNotNullParameter(text, "text");
                equals = StringsKt__StringsJVMKt.equals(text, this.f78307g.m24626d(), true);
                return Boolean.valueOf(equals);
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "match", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: eN5$q$b */
        /* loaded from: classes3.dex */
        public static final class C20032b extends Lambda implements Function1<Boolean, Boolean> {

            /* renamed from: g */
            public static final C20032b f78308g = new C20032b();

            public C20032b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Boolean match) {
                Intrinsics.checkNotNullParameter(match, "match");
                return match;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20030q(InterfaceC42087hN5 interfaceC42087hN5) {
            super(1);
            this.f78306g = interfaceC42087hN5;
        }

        /* renamed from: d */
        public static final Boolean m42956d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final boolean m42955e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23434B<? extends Boolean> invoke(C45399mx5 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            Observable<String> mo36482G0 = this.f78306g.mo36482G0();
            final C20031a c20031a = new C20031a(state);
            Observable<R> map = mo36482G0.map(new InterfaceC23492o() { // from class: fN5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m42956d;
                    m42956d = C40308eN5.C20030q.m42956d(Function1.this, obj);
                    return m42956d;
                }
            });
            final C20032b c20032b = C20032b.f78308g;
            return map.filter(new InterfaceC23494q() { // from class: gN5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m42955e;
                    m42955e = C40308eN5.C20030q.m42955e(Function1.this, obj);
                    return m42955e;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eN5$r */
    /* loaded from: classes3.dex */
    public static final class C20033r extends Lambda implements Function1<Boolean, Unit> {
        public C20033r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C40308eN5.this.m42280h(C47657qm1.f105769a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052F\u0010\u0004\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "LCO5;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: eN5$s */
    /* loaded from: classes3.dex */
    public static final class C20034s extends Lambda implements Function1<Pair<? extends Boolean, ? extends CO5>, Unit> {
        public C20034s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends CO5> pair) {
            invoke2((Pair<Boolean, CO5>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, CO5> pair) {
            CO5 component2 = pair.component2();
            C40308eN5.this.f78289f.mo55905y(new C51167wh5(null, null, null, component2.m112266b(), 7, null));
            C40308eN5.this.m42979E().mo7221o("Match found!", new Object[0]);
            C40308eN5.this.f78290g.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, TuplesKt.m28425to("bird_id", component2.m112266b()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40308eN5(YR4 rideManager, InterfaceC1880Ea analyticsManager, InterfaceC40099e13 navigator) {
        super(Z12.f47762a);
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f78288e = rideManager;
        this.f78289f = analyticsManager;
        this.f78290g = navigator;
    }

    /* renamed from: A */
    public static final void m42983A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final InterfaceC23434B m42982B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m42981C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m42980D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m42978g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final C45399mx5 m42967w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C45399mx5) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m42966x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m42965y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final Boolean m42964z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public final C41318g46.AbstractC20723b m42979E() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("Tipsy Test");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"Tipsy Test\")");
        return m40153k;
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: v */
    public void consume(InterfaceC42087hN5 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        AbstractC23442F<WireSafeStartValues> mo75050d = this.f78288e.mo75050d();
        final C20024k c20024k = C20024k.f78301g;
        AbstractC23442F m33146T = mo75050d.m33157I(new InterfaceC23492o() { // from class: VM5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C45399mx5 m42967w;
                m42967w = C40308eN5.m42967w(Function1.this, obj);
                return m42967w;
            }
        }).m33146T(3L);
        Intrinsics.checkNotNullExpressionValue(m33146T, "rideManager.safeStartVal…)\n      }\n      .retry(3)");
        Object m33135e = m33146T.m33135e(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20025l c20025l = new C20025l(this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: WM5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40308eN5.m42978g(Function1.this, obj);
            }
        };
        final C20026m c20026m = new C20026m();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: XM5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40308eN5.m42966x(Function1.this, obj);
            }
        });
        Observable<R> map = m42276l().filter(C20015b.f78292b).map(C20016c.f78293b);
        Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20027n c20027n = new C20027n();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: YM5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40308eN5.m42965y(Function1.this, obj);
            }
        });
        Observable<R> map2 = m42276l().filter(C20017d.f78294b).map(C20018e.f78295b);
        Intrinsics.checkNotNullExpressionValue(map2, "filter { item -> item is…map { item -> item as K }");
        Observable<String> skip = renderer.mo36482G0().skip(1L);
        final C20028o c20028o = C20028o.f78304g;
        Observable startWith = skip.map(new InterfaceC23492o() { // from class: ZM5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m42964z;
                m42964z = C40308eN5.m42964z(Function1.this, obj);
                return m42964z;
            }
        }).startWith((Observable<R>) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(startWith, "renderer.textChanges().s…        .startWith(false)");
        InterfaceC23434B map3 = m42276l().filter(C20019f.f78296b).map(C20020g.f78297b);
        Intrinsics.checkNotNullExpressionValue(map3, "filter { item -> item is…map { item -> item as K }");
        Object m33094as2 = C24527f.m31949b(map2, startWith, map3).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20029p c20029p = new C20029p();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: aN5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40308eN5.m42983A(Function1.this, obj);
            }
        });
        Observable<R> map4 = m42276l().filter(C20021h.f78298b).map(C20022i.f78299b);
        Intrinsics.checkNotNullExpressionValue(map4, "filter { item -> item is…map { item -> item as K }");
        final C20030q c20030q = new C20030q(renderer);
        Observable switchMap = map4.switchMap(new InterfaceC23492o() { // from class: bN5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m42982B;
                m42982B = C40308eN5.m42982B(Function1.this, obj);
                return m42982B;
            }
        });
        final C20033r c20033r = new C20033r();
        Observable doOnNext = switchMap.doOnNext(new InterfaceC23484g() { // from class: cN5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40308eN5.m42981C(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun consume(ren…state.birdId)\n      }\n  }");
        InterfaceC23434B map5 = m42276l().filter(C20023j.f78300b).map(C20014a.f78291b);
        Intrinsics.checkNotNullExpressionValue(map5, "filter { item -> item is…map { item -> item as K }");
        Object m33094as3 = C24527f.m31950a(doOnNext, map5).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20034s c20034s = new C20034s();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: dN5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40308eN5.m42980D(Function1.this, obj);
            }
        });
    }
}
