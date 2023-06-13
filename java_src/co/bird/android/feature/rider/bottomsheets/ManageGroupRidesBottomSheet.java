package co.bird.android.feature.rider.bottomsheets;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.feature.rider.bottomsheets.ManageGroupRidesBottomSheet;
import co.bird.android.model.RideStatusBottomSheetButton;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017B!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0013\u0010\u001aJ\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R:\u0010\u0010\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b \r*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\n0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/RideStatusBottomSheetButton;", "LwZ;", "A", "LrH2;", "n", "LrH2;", "converter", "Lio/reactivex/subjects/d;", "Lio/reactivex/F;", "", "LH6;", "kotlin.jvm.PlatformType", "o", "Lio/reactivex/subjects/d;", "uiUpdateSubject", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nManageGroupRidesBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheet.kt\nco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,76:1\n44#2:77\n237#3:78\n*S KotlinDebug\n*F\n+ 1 ManageGroupRidesBottomSheet.kt\nco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet\n*L\n68#1:77\n68#1:78\n*E\n"})
/* loaded from: classes3.dex */
public final class ManageGroupRidesBottomSheet extends BaseBottomSheet<RideStatusBottomSheetButton> {

    /* renamed from: n */
    public final C47960rH2 f65107n;

    /* renamed from: o */
    public final C24558d<AbstractC23442F<List<C3023H6>>> f65108o;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/F;", "", "LH6;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lio/reactivex/F;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.bottomsheets.ManageGroupRidesBottomSheet$a */
    /* loaded from: classes3.dex */
    public static final class C15479a extends Lambda implements Function1<AbstractC23442F<List<? extends C3023H6>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: g */
        public static final C15479a f65109g = new C15479a();

        public C15479a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(AbstractC23442F<List<C3023H6>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.bottomsheets.ManageGroupRidesBottomSheet$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15480b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C15480b f65110b = new C15480b();

        public C15480b() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.bottomsheets.ManageGroupRidesBottomSheet$c */
    /* loaded from: classes3.dex */
    public static final class C15481c extends Lambda implements Function1<List<? extends C3023H6>, InterfaceC23496h> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.rider.bottomsheets.ManageGroupRidesBottomSheet$c$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C15482a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

            /* renamed from: b */
            public static final C15482a f65112b = new C15482a();

            public C15482a() {
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

        public C15481c() {
            super(1);
        }

        /* renamed from: d */
        public static final Unit m57093d(ManageGroupRidesBottomSheet this$0, List it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "$it");
            this$0.m59056v().m6670c(it);
            this$0.invalidate();
            return Unit.INSTANCE;
        }

        /* renamed from: e */
        public static final void m57092e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(final List<C3023H6> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final ManageGroupRidesBottomSheet manageGroupRidesBottomSheet = ManageGroupRidesBottomSheet.this;
            AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: nH2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m57093d;
                    m57093d = ManageGroupRidesBottomSheet.C15481c.m57093d(ManageGroupRidesBottomSheet.this, it);
                    return m57093d;
                }
            });
            final C15482a c15482a = C15482a.f65112b;
            return m33078H.m33084B(new InterfaceC23484g() { // from class: oH2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ManageGroupRidesBottomSheet.C15481c.m57092e(Function1.this, obj);
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m28432d2 = {"co/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$d", "LwZ;", "Lco/bird/android/model/RideStatusBottomSheetButton;", "LpH2;", "c", "LpH2;", DateTokenConverter.CONVERTER_KEY, "()LpH2;", "adapter", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.bottomsheets.ManageGroupRidesBottomSheet$d */
    /* loaded from: classes3.dex */
    public static final class C15483d extends AbstractC29912wZ<RideStatusBottomSheetButton> {

        /* renamed from: c */
        public final C46774pH2 f65113c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/RideStatusBottomSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideStatusBottomSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.rider.bottomsheets.ManageGroupRidesBottomSheet$d$a */
        /* loaded from: classes3.dex */
        public static final class C15484a extends Lambda implements Function1<RideStatusBottomSheetButton, Unit> {
            public C15484a() {
                super(1);
            }

            /* renamed from: a */
            public final void m57090a(RideStatusBottomSheetButton it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C15483d.this.m6672a().invoke(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RideStatusBottomSheetButton rideStatusBottomSheetButton) {
                m57090a(rideStatusBottomSheetButton);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15483d(Context context) {
            super(context);
            Intrinsics.checkNotNullExpressionValue(context, "context");
            this.f65113c = new C46774pH2();
            getAdapter().m19574x(new C15484a());
        }

        @Override // p000.AbstractC29912wZ
        /* renamed from: d */
        public C46774pH2 getAdapter() {
            return this.f65113c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageGroupRidesBottomSheet(Context context) {
        super(context);
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f65107n = new C47960rH2(context2);
        C24558d<AbstractC23442F<List<C3023H6>>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Single<List<AdapterSection>>>()");
        this.f65108o = m31902e;
        AbstractC24490k<AbstractC23442F<List<C3023H6>>> flowable = m31902e.toFlowable(EnumC23460b.LATEST);
        final C15479a c15479a = C15479a.f65109g;
        AbstractC24490k<R> m32149f0 = flowable.m32149f0(new InterfaceC23492o() { // from class: kH2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m57100b0;
                m57100b0 = ManageGroupRidesBottomSheet.m57100b0(Function1.this, obj);
                return m57100b0;
            }
        });
        final C15480b c15480b = C15480b.f65110b;
        AbstractC24490k m32195I = m32149f0.m32195I(new InterfaceC23484g() { // from class: lH2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ManageGroupRidesBottomSheet.m57099c0(Function1.this, obj);
            }
        });
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC24490k m32111s0 = m32195I.m32206C0(emptyList).m32111s0(C23454a.m33087a());
        final C15481c c15481c = new C15481c();
        AbstractC23461c m32162Z = m32111s0.m32162Z(new InterfaceC23492o() { // from class: mH2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m57098d0;
                m57098d0 = ManageGroupRidesBottomSheet.m57098d0(Function1.this, obj);
                return m57098d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32162Z, "uiUpdateSubject\n      .t…onErrorComplete()\n      }");
        Context context3 = getContext();
        Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b((LifecycleOwner) context3);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33041n = m32162Z.m33041n(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: b0 */
    public static final InterfaceC23447K m57100b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m57099c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23496h m57098d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // co.bird.android.bottomsheet.BaseBottomSheet
    /* renamed from: A */
    public AbstractC29912wZ<? extends RideStatusBottomSheetButton> mo56204A() {
        return new C15483d(getContext());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageGroupRidesBottomSheet(Context context, AttributeSet attrs) {
        super(context, attrs);
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f65107n = new C47960rH2(context2);
        C24558d<AbstractC23442F<List<C3023H6>>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Single<List<AdapterSection>>>()");
        this.f65108o = m31902e;
        AbstractC24490k<AbstractC23442F<List<C3023H6>>> flowable = m31902e.toFlowable(EnumC23460b.LATEST);
        final C15479a c15479a = C15479a.f65109g;
        AbstractC24490k<R> m32149f0 = flowable.m32149f0(new InterfaceC23492o() { // from class: kH2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m57100b0;
                m57100b0 = ManageGroupRidesBottomSheet.m57100b0(Function1.this, obj);
                return m57100b0;
            }
        });
        final C15480b c15480b = C15480b.f65110b;
        AbstractC24490k m32195I = m32149f0.m32195I(new InterfaceC23484g() { // from class: lH2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ManageGroupRidesBottomSheet.m57099c0(Function1.this, obj);
            }
        });
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC24490k m32111s0 = m32195I.m32206C0(emptyList).m32111s0(C23454a.m33087a());
        final C15481c c15481c = new C15481c();
        AbstractC23461c m32162Z = m32111s0.m32162Z(new InterfaceC23492o() { // from class: mH2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m57098d0;
                m57098d0 = ManageGroupRidesBottomSheet.m57098d0(Function1.this, obj);
                return m57098d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32162Z, "uiUpdateSubject\n      .t…onErrorComplete()\n      }");
        Context context3 = getContext();
        Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b((LifecycleOwner) context3);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33041n = m32162Z.m33041n(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageGroupRidesBottomSheet(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f65107n = new C47960rH2(context2);
        C24558d<AbstractC23442F<List<C3023H6>>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Single<List<AdapterSection>>>()");
        this.f65108o = m31902e;
        AbstractC24490k<AbstractC23442F<List<C3023H6>>> flowable = m31902e.toFlowable(EnumC23460b.LATEST);
        final C15479a c15479a = C15479a.f65109g;
        AbstractC24490k<R> m32149f0 = flowable.m32149f0(new InterfaceC23492o() { // from class: kH2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m57100b0;
                m57100b0 = ManageGroupRidesBottomSheet.m57100b0(Function1.this, obj);
                return m57100b0;
            }
        });
        final C15480b c15480b = C15480b.f65110b;
        AbstractC24490k m32195I = m32149f0.m32195I(new InterfaceC23484g() { // from class: lH2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ManageGroupRidesBottomSheet.m57099c0(Function1.this, obj);
            }
        });
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC24490k m32111s0 = m32195I.m32206C0(emptyList).m32111s0(C23454a.m33087a());
        final C15481c c15481c = new C15481c();
        AbstractC23461c m32162Z = m32111s0.m32162Z(new InterfaceC23492o() { // from class: mH2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m57098d0;
                m57098d0 = ManageGroupRidesBottomSheet.m57098d0(Function1.this, obj);
                return m57098d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32162Z, "uiUpdateSubject\n      .t…onErrorComplete()\n      }");
        Context context3 = getContext();
        Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b((LifecycleOwner) context3);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33041n = m32162Z.m33041n(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }
}
