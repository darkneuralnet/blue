package p000;

import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.model.persistence.ScrapOrderView;
import co.bird.android.model.wire.WireSkuScannedItems;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.observables.AbstractC24495a;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.full.KClasses;
import p000.C31744Ao5;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LAo5;", "Lf1;", "LEo5;", "LFo5;", "renderer", "", "A", "", "e", "P", "LO86;", "LO86;", "transferOrderManager", "Llh6;", "f", "Llh6;", "userManager", "LSy6;", "g", "LSy6;", "warehouseManager", "Le13;", "h", "Le13;", "navigator", "<init>", "(LO86;Llh6;LSy6;Le13;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapOrderOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,141:1\n237#2:142\n180#2:143\n180#2:144\n180#2:145\n180#2:146\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter\n*L\n44#1:142\n49#1:143\n91#1:144\n103#1:145\n121#1:146\n*E\n"})
/* renamed from: Ao5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31744Ao5 extends AbstractC20169f1<InterfaceC32680Eo5, InterfaceC32914Fo5> {

    /* renamed from: e */
    public final O86 f1127e;

    /* renamed from: f */
    public final InterfaceC44647lh6 f1128f;

    /* renamed from: g */
    public final InterfaceC36047Sy6 f1129g;

    /* renamed from: h */
    public final InterfaceC40099e13 f1130h;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ao5$a */
    /* loaded from: classes3.dex */
    public static final class C0227a extends Lambda implements Function1<Unit, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ao5$a$a */
        /* loaded from: classes3.dex */
        public static final class C0228a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C31744Ao5 f1132g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LFo5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LFo5;)LFo5;"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nScrapOrderOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$1$1$1\n+ 2 ScrapOrderOverviewState.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewStateKt\n*L\n1#1,141:1\n40#2,10:142\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$1$1$1\n*L\n38#1:142,10\n*E\n"})
            /* renamed from: Ao5$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C0229a extends Lambda implements Function1<InterfaceC32914Fo5, InterfaceC32914Fo5> {

                /* renamed from: g */
                public static final C0229a f1133g = new C0229a();

                public C0229a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC32914Fo5 invoke(InterfaceC32914Fo5 state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(C37271Ye6.class);
                    if (!(state instanceof C37271Ye6)) {
                        KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                        InterfaceC32914Fo5 interfaceC32914Fo5 = null;
                        if (primaryConstructor != null) {
                            interfaceC32914Fo5 = (InterfaceC32914Fo5) primaryConstructor.call(state.mo64185b(), Integer.valueOf(state.mo64184c()), Boolean.valueOf(state.getLoading()), state.mo64186a(), null);
                        }
                        if (interfaceC32914Fo5 != null) {
                            state = (C37271Ye6) interfaceC32914Fo5;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.transferorder.scrap.overview.UpdateUi");
                        }
                    }
                    return C37271Ye6.copy$default((C37271Ye6) state, null, 0, true, null, null, 27, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0228a(C31744Ao5 c31744Ao5) {
                super(1);
                this.f1132g = c31744Ao5;
            }

            /* renamed from: a */
            public final void m115166a(InterfaceC23465c interfaceC23465c) {
                this.f1132g.m42279i(C0229a.f1133g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m115166a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        public C0227a() {
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
            AbstractC23461c mo80284r = C31744Ao5.this.f1127e.mo80284r();
            final C0228a c0228a = new C0228a(C31744Ao5.this);
            return mo80284r.m33081E(new InterfaceC23484g() { // from class: zo5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C31744Ao5.C0227a.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "scannedItemsCount", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao5$b */
    /* loaded from: classes3.dex */
    public static final class C0230b extends Lambda implements Function1<Integer, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LFo5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LFo5;)LFo5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nScrapOrderOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$10$1\n+ 2 ScrapOrderOverviewState.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewStateKt\n*L\n1#1,141:1\n40#2,10:142\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$10$1\n*L\n94#1:142,10\n*E\n"})
        /* renamed from: Ao5$b$a */
        /* loaded from: classes3.dex */
        public static final class C0231a extends Lambda implements Function1<InterfaceC32914Fo5, InterfaceC32914Fo5> {

            /* renamed from: g */
            public final /* synthetic */ Integer f1135g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0231a(Integer num) {
                super(1);
                this.f1135g = num;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC32914Fo5 invoke(InterfaceC32914Fo5 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(C37271Ye6.class);
                if (!(state instanceof C37271Ye6)) {
                    KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                    InterfaceC32914Fo5 interfaceC32914Fo5 = null;
                    if (primaryConstructor != null) {
                        interfaceC32914Fo5 = (InterfaceC32914Fo5) primaryConstructor.call(state.mo64185b(), Integer.valueOf(state.mo64184c()), Boolean.valueOf(state.getLoading()), state.mo64186a(), null);
                    }
                    if (interfaceC32914Fo5 != null) {
                        state = (C37271Ye6) interfaceC32914Fo5;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.transferorder.scrap.overview.UpdateUi");
                    }
                }
                Integer scannedItemsCount = this.f1135g;
                Intrinsics.checkNotNullExpressionValue(scannedItemsCount, "scannedItemsCount");
                return C37271Ye6.copy$default((C37271Ye6) state, null, scannedItemsCount.intValue(), false, null, null, 25, null);
            }
        }

        public C0230b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            C31744Ao5.this.m42279i(new C0231a(num));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "skuOrderId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao5$c */
    /* loaded from: classes3.dex */
    public static final class C0232c extends Lambda implements Function1<String, Unit> {
        public C0232c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String skuOrderId) {
            InterfaceC40099e13 interfaceC40099e13 = C31744Ao5.this.f1130h;
            Intrinsics.checkNotNullExpressionValue(skuOrderId, "skuOrderId");
            interfaceC40099e13.mo36995k2(skuOrderId, 10059);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ao5$d */
    /* loaded from: classes3.dex */
    public static final class C0233d extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Warehouse>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/u;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nScrapOrderOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$12$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
        /* renamed from: Ao5$d$a */
        /* loaded from: classes3.dex */
        public static final class C0234a extends Lambda implements Function1<User, InterfaceC24574u<? extends Warehouse>> {

            /* renamed from: g */
            public final /* synthetic */ C31744Ao5 f1138g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0234a(C31744Ao5 c31744Ao5) {
                super(1);
                this.f1138g = c31744Ao5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Warehouse> invoke(User user) {
                AbstractC23442F<HM4<Warehouse>> mo82208a;
                AbstractC23442F m70883l;
                AbstractC24507p m33125j0;
                Intrinsics.checkNotNullParameter(user, "user");
                String warehouseId = user.getWarehouseId();
                if (warehouseId == null || (mo82208a = this.f1138g.f1129g.mo82208a(warehouseId)) == null || (m70883l = C38096ag5.m70883l(mo82208a)) == null || (m33125j0 = m70883l.m33125j0()) == null) {
                    return AbstractC24507p.m32024u();
                }
                return m33125j0;
            }
        }

        public C0233d() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m115161c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Warehouse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<User> user = C31744Ao5.this.f1128f.getUser();
            final C0234a c0234a = new C0234a(C31744Ao5.this);
            return user.m33163C(new InterfaceC23492o() { // from class: Bo5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m115161c;
                    m115161c = C31744Ao5.C0233d.m115161c(Function1.this, obj);
                    return m115161c;
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao5$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0235e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C0235e(Object obj) {
            super(1, obj, C31744Ao5.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C31744Ao5) this.receiver).m115183P(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "warehouse", "", C17296a.f69688o, "(Lco/bird/android/model/Warehouse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ao5$f */
    /* loaded from: classes3.dex */
    public static final class C0236f extends Lambda implements Function1<Warehouse, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LFo5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LFo5;)LFo5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nScrapOrderOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$14$1\n+ 2 ScrapOrderOverviewState.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewStateKt\n*L\n1#1,141:1\n40#2,10:142\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$14$1\n*L\n124#1:142,10\n*E\n"})
        /* renamed from: Ao5$f$a */
        /* loaded from: classes3.dex */
        public static final class C0237a extends Lambda implements Function1<InterfaceC32914Fo5, InterfaceC32914Fo5> {

            /* renamed from: g */
            public final /* synthetic */ Warehouse f1140g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0237a(Warehouse warehouse) {
                super(1);
                this.f1140g = warehouse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC32914Fo5 invoke(InterfaceC32914Fo5 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Q64.class);
                if (!(state instanceof Q64)) {
                    KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                    InterfaceC32914Fo5 interfaceC32914Fo5 = null;
                    if (primaryConstructor != null) {
                        interfaceC32914Fo5 = (InterfaceC32914Fo5) primaryConstructor.call(state.mo64185b(), Integer.valueOf(state.mo64184c()), Boolean.valueOf(state.getLoading()), state.mo64186a(), null);
                    }
                    if (interfaceC32914Fo5 != null) {
                        state = (Q64) interfaceC32914Fo5;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.transferorder.scrap.overview.ProcessScrapOrderSuccess");
                    }
                }
                return Q64.copy$default((Q64) state, null, 0, false, this.f1140g.getName(), null, 23, null);
            }
        }

        public C0236f() {
            super(1);
        }

        /* renamed from: a */
        public final void m115159a(Warehouse warehouse) {
            C31744Ao5.this.m42279i(new C0237a(warehouse));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Warehouse warehouse) {
            m115159a(warehouse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao5$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0238g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C0238g(Object obj) {
            super(1, obj, C31744Ao5.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C31744Ao5) this.receiver).m115183P(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "scrapOrders", "", "Lco/bird/android/model/persistence/ScrapOrderView;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao5$h */
    /* loaded from: classes3.dex */
    public static final class C0239h extends Lambda implements Function1<List<? extends ScrapOrderView>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LFo5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LFo5;)LFo5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nScrapOrderOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$4$1\n+ 2 ScrapOrderOverviewState.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewStateKt\n*L\n1#1,141:1\n40#2,10:142\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$4$1\n*L\n52#1:142,10\n*E\n"})
        /* renamed from: Ao5$h$a */
        /* loaded from: classes3.dex */
        public static final class C0240a extends Lambda implements Function1<InterfaceC32914Fo5, InterfaceC32914Fo5> {

            /* renamed from: g */
            public final /* synthetic */ List<ScrapOrderView> f1142g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0240a(List<ScrapOrderView> list) {
                super(1);
                this.f1142g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC32914Fo5 invoke(InterfaceC32914Fo5 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(C37271Ye6.class);
                if (!(state instanceof C37271Ye6)) {
                    KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                    InterfaceC32914Fo5 interfaceC32914Fo5 = null;
                    if (primaryConstructor != null) {
                        interfaceC32914Fo5 = (InterfaceC32914Fo5) primaryConstructor.call(state.mo64185b(), Integer.valueOf(state.mo64184c()), Boolean.valueOf(state.getLoading()), state.mo64186a(), null);
                    }
                    if (interfaceC32914Fo5 != null) {
                        state = (C37271Ye6) interfaceC32914Fo5;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.transferorder.scrap.overview.UpdateUi");
                    }
                }
                List<ScrapOrderView> scrapOrders = this.f1142g;
                Intrinsics.checkNotNullExpressionValue(scrapOrders, "scrapOrders");
                return C37271Ye6.copy$default((C37271Ye6) state, scrapOrders, 0, false, null, null, 26, null);
            }
        }

        public C0239h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ScrapOrderView> list) {
            invoke2((List<ScrapOrderView>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<ScrapOrderView> list) {
            C31744Ao5.this.m42279i(new C0240a(list));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/persistence/ScrapOrderView;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao5$i */
    /* loaded from: classes3.dex */
    public static final class C0241i extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends ScrapOrderView>>, List<? extends ScrapOrderView>> {

        /* renamed from: g */
        public static final C0241i f1143g = new C0241i();

        public C0241i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends ScrapOrderView> invoke(Pair<? extends Unit, ? extends List<? extends ScrapOrderView>> pair) {
            return invoke2((Pair<Unit, ? extends List<ScrapOrderView>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<ScrapOrderView> invoke2(Pair<Unit, ? extends List<ScrapOrderView>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/ScrapOrderView;", "scrapOrders", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapOrderOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1549#2:142\n1620#2,3:143\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$6\n*L\n69#1:142\n69#1:143,3\n*E\n"})
    /* renamed from: Ao5$j */
    /* loaded from: classes3.dex */
    public static final class C0242j extends Lambda implements Function1<List<? extends ScrapOrderView>, List<? extends String>> {

        /* renamed from: g */
        public static final C0242j f1144g = new C0242j();

        public C0242j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(List<ScrapOrderView> scrapOrders) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(scrapOrders, "scrapOrders");
            List<ScrapOrderView> list = scrapOrders;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (ScrapOrderView scrapOrderView : list) {
                arrayList.add(scrapOrderView.getOrderId());
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "scrapOrders", "", "Lco/bird/android/model/persistence/ScrapOrderView;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao5$k */
    /* loaded from: classes3.dex */
    public static final class C0243k extends Lambda implements Function1<List<? extends ScrapOrderView>, Boolean> {

        /* renamed from: g */
        public static final C0243k f1145g = new C0243k();

        public C0243k() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<ScrapOrderView> scrapOrders) {
            Intrinsics.checkNotNullParameter(scrapOrders, "scrapOrders");
            return Boolean.valueOf(!scrapOrders.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends ScrapOrderView> list) {
            return invoke2((List<ScrapOrderView>) list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/ScrapOrderView;", "scrapOrders", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "c", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapOrderOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$8\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1549#2:142\n1620#2,3:143\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$8\n*L\n75#1:142\n75#1:143,3\n*E\n"})
    /* renamed from: Ao5$l */
    /* loaded from: classes3.dex */
    public static final class C0244l extends Lambda implements Function1<List<? extends ScrapOrderView>, InterfaceC23447K<? extends Integer>> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "scannedItemsArray", "", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ao5$l$a */
        /* loaded from: classes3.dex */
        public static final class C0245a extends Lambda implements Function1<Object[], Integer> {

            /* renamed from: g */
            public static final C0245a f1147g = new C0245a();

            public C0245a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Integer invoke(Object[] scannedItemsArray) {
                Intrinsics.checkNotNullParameter(scannedItemsArray, "scannedItemsArray");
                int i = 0;
                for (Object obj : scannedItemsArray) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type co.bird.android.model.wire.WireSkuScannedItems");
                    i += ((WireSkuScannedItems) obj).getSuccessfulScannedItems().size();
                }
                return Integer.valueOf(i);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ao5$l$b */
        /* loaded from: classes3.dex */
        public static final class C0246b extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C31744Ao5 f1148g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LFo5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LFo5;)LFo5;"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nScrapOrderOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$8$3$1\n+ 2 ScrapOrderOverviewState.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewStateKt\n*L\n1#1,141:1\n40#2,10:142\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$consume$8$3$1\n*L\n85#1:142,10\n*E\n"})
            /* renamed from: Ao5$l$b$a */
            /* loaded from: classes3.dex */
            public static final class C0247a extends Lambda implements Function1<InterfaceC32914Fo5, InterfaceC32914Fo5> {

                /* renamed from: g */
                public static final C0247a f1149g = new C0247a();

                public C0247a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC32914Fo5 invoke(InterfaceC32914Fo5 state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(C37271Ye6.class);
                    if (!(state instanceof C37271Ye6)) {
                        KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                        InterfaceC32914Fo5 interfaceC32914Fo5 = null;
                        if (primaryConstructor != null) {
                            interfaceC32914Fo5 = (InterfaceC32914Fo5) primaryConstructor.call(state.mo64185b(), Integer.valueOf(state.mo64184c()), Boolean.valueOf(state.getLoading()), state.mo64186a(), null);
                        }
                        if (interfaceC32914Fo5 != null) {
                            state = (C37271Ye6) interfaceC32914Fo5;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.transferorder.scrap.overview.UpdateUi");
                        }
                    }
                    return C37271Ye6.copy$default((C37271Ye6) state, null, 0, true, null, null, 27, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0246b(C31744Ao5 c31744Ao5) {
                super(1);
                this.f1148g = c31744Ao5;
            }

            /* renamed from: a */
            public final void m115149a(InterfaceC23465c interfaceC23465c) {
                this.f1148g.m42279i(C0247a.f1149g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m115149a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        public C0244l() {
            super(1);
        }

        /* renamed from: d */
        public static final Integer m115152d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Integer) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final void m115151e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Integer> invoke(List<ScrapOrderView> scrapOrders) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(scrapOrders, "scrapOrders");
            List<ScrapOrderView> list = scrapOrders;
            C31744Ao5 c31744Ao5 = C31744Ao5.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (ScrapOrderView scrapOrderView : list) {
                arrayList.add(c31744Ao5.f1127e.mo80279w(scrapOrderView.getOrderId()));
            }
            final C0245a c0245a = C0245a.f1147g;
            AbstractC23442F m33107s0 = AbstractC23442F.m33107s0(arrayList, new InterfaceC23492o() { // from class: Co5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Integer m115152d;
                    m115152d = C31744Ao5.C0244l.m115152d(Function1.this, obj);
                    return m115152d;
                }
            });
            final C0246b c0246b = new C0246b(C31744Ao5.this);
            return m33107s0.m33102v(new InterfaceC23484g() { // from class: Do5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C31744Ao5.C0244l.m115151e(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao5$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0248m extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C0248m(Object obj) {
            super(1, obj, C31744Ao5.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C31744Ao5) this.receiver).m115183P(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LFo5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LFo5;)LFo5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapOrderOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$onError$1\n+ 2 ScrapOrderOverviewState.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewStateKt\n*L\n1#1,141:1\n40#2,10:142\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewPresenter.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewPresenter$onError$1\n*L\n135#1:142,10\n*E\n"})
    /* renamed from: Ao5$n */
    /* loaded from: classes3.dex */
    public static final class C0249n extends Lambda implements Function1<InterfaceC32914Fo5, InterfaceC32914Fo5> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f1150g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0249n(Throwable th) {
            super(1);
            this.f1150g = th;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC32914Fo5 invoke(InterfaceC32914Fo5 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(C38685bg1.class);
            if (!(state instanceof C38685bg1)) {
                KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                InterfaceC32914Fo5 interfaceC32914Fo5 = null;
                if (primaryConstructor != null) {
                    interfaceC32914Fo5 = (InterfaceC32914Fo5) primaryConstructor.call(state.mo64185b(), Integer.valueOf(state.mo64184c()), Boolean.valueOf(state.getLoading()), state.mo64186a(), null);
                }
                if (interfaceC32914Fo5 != null) {
                    state = (C38685bg1) interfaceC32914Fo5;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.transferorder.scrap.overview.Error");
                }
            }
            return C38685bg1.copy$default((C38685bg1) state, null, 0, false, null, this.f1150g, 15, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31744Ao5(O86 transferOrderManager, InterfaceC44647lh6 userManager, InterfaceC36047Sy6 warehouseManager, InterfaceC40099e13 navigator) {
        super(new C37271Ye6(null, 0, false, null, null, 31, null));
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(warehouseManager, "warehouseManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f1127e = transferOrderManager;
        this.f1128f = userManager;
        this.f1129g = warehouseManager;
        this.f1130h = navigator;
    }

    /* renamed from: B */
    public static final InterfaceC23496h m115197B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m115196C() {
    }

    /* renamed from: D */
    public static final void m115195D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final InterfaceC24574u m115194E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m115193F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m115192G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m115191H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m115190I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final List m115189J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final List m115188K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final boolean m115187L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: M */
    public static final InterfaceC23447K m115186M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m115185N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m115184O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: A */
    public void consume(InterfaceC32680Eo5 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        AbstractC24495a<List<ScrapOrderView>> scrapOrderViewObservable = this.f1127e.mo80294j().publish();
        Observable<Unit> mo56412P4 = renderer.mo56412P4();
        final C0227a c0227a = new C0227a();
        AbstractC23461c flatMapCompletable = mo56412P4.flatMapCompletable(new InterfaceC23492o() { // from class: lo5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m115197B;
                m115197B = C31744Ao5.m115197B(Function1.this, obj);
                return m115197B;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun consume(ren…wObservable.connect()\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: uo5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C31744Ao5.m115196C();
            }
        };
        final C0238g c0238g = new C0238g(this);
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: vo5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31744Ao5.m115191H(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(scrapOrderViewObservable, "scrapOrderViewObservable");
        Object m33094as = scrapOrderViewObservable.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0239h c0239h = new C0239h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: wo5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31744Ao5.m115190I(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(renderer.mo56412P4(), scrapOrderViewObservable);
        final C0241i c0241i = C0241i.f1143g;
        Observable map = m31950a.map(new InterfaceC23492o() { // from class: xo5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m115189J;
                m115189J = C31744Ao5.m115189J(Function1.this, obj);
                return m115189J;
            }
        });
        final C0242j c0242j = C0242j.f1144g;
        Observable merge = Observable.merge(map, scrapOrderViewObservable.distinctUntilChanged(new InterfaceC23492o() { // from class: yo5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m115188K;
                m115188K = C31744Ao5.m115188K(Function1.this, obj);
                return m115188K;
            }
        }));
        final C0243k c0243k = C0243k.f1145g;
        Observable filter = merge.filter(new InterfaceC23494q() { // from class: mo5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m115187L;
                m115187L = C31744Ao5.m115187L(Function1.this, obj);
                return m115187L;
            }
        });
        final C0244l c0244l = new C0244l();
        Observable flatMapSingle = filter.flatMapSingle(new InterfaceC23492o() { // from class: no5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m115186M;
                m115186M = C31744Ao5.m115186M(Function1.this, obj);
                return m115186M;
            }
        });
        final C0248m c0248m = new C0248m(this);
        Observable doOnError = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: oo5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31744Ao5.m115185N(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "override fun consume(ren…wObservable.connect()\n  }");
        Object m33094as2 = doOnError.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0230b c0230b = new C0230b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: po5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31744Ao5.m115184O(Function1.this, obj);
            }
        });
        Object m33094as3 = renderer.mo56403q6().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0232c c0232c = new C0232c();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: qo5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31744Ao5.m115195D(Function1.this, obj);
            }
        });
        Observable<Unit> mo56407c8 = renderer.mo56407c8();
        final C0233d c0233d = new C0233d();
        Observable<R> flatMapMaybe = mo56407c8.flatMapMaybe(new InterfaceC23492o() { // from class: ro5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m115194E;
                m115194E = C31744Ao5.m115194E(Function1.this, obj);
                return m115194E;
            }
        });
        final C0235e c0235e = new C0235e(this);
        Observable doOnError2 = flatMapMaybe.doOnError(new InterfaceC23484g() { // from class: so5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31744Ao5.m115193F(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError2, "override fun consume(ren…wObservable.connect()\n  }");
        Object m33094as4 = doOnError2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0236f c0236f = new C0236f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: to5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31744Ao5.m115192G(Function1.this, obj);
            }
        });
        scrapOrderViewObservable.m32087e();
    }

    /* renamed from: P */
    public final void m115183P(Throwable th) {
        C41318g46.m40159e(th);
        m42279i(new C0249n(th));
    }
}
