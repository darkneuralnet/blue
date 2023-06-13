package co.bird.android.feature.rider.bottomsheets;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet;
import co.bird.android.model.RideStatusBottomSheetButton;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
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
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR:\u0010\u0014\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f \u0011*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u000e0\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet;", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/RideStatusBottomSheetButton;", "LwZ;", "A", "LZ65;", RequestHeadersFactory.MODEL, "", "e0", "LX65;", "n", "LX65;", "converter", "Lio/reactivex/subjects/d;", "Lio/reactivex/F;", "", "LH6;", "kotlin.jvm.PlatformType", "o", "Lio/reactivex/subjects/d;", "uiUpdateSubject", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStatusBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStatusBottomSheet.kt\nco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,82:1\n44#2:83\n237#3:84\n*S KotlinDebug\n*F\n+ 1 RideStatusBottomSheet.kt\nco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet\n*L\n70#1:83\n70#1:84\n*E\n"})
/* loaded from: classes3.dex */
public final class RideStatusBottomSheet extends BaseBottomSheet<RideStatusBottomSheetButton> {

    /* renamed from: n */
    public final X65 f65115n;

    /* renamed from: o */
    public final C24558d<AbstractC23442F<List<C3023H6>>> f65116o;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/F;", "", "LH6;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lio/reactivex/F;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet$a */
    /* loaded from: classes3.dex */
    public static final class C15485a extends Lambda implements Function1<AbstractC23442F<List<? extends C3023H6>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: g */
        public static final C15485a f65117g = new C15485a();

        public C15485a() {
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
    /* renamed from: co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15486b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C15486b f65118b = new C15486b();

        public C15486b() {
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
    /* renamed from: co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet$c */
    /* loaded from: classes3.dex */
    public static final class C15487c extends Lambda implements Function1<List<? extends C3023H6>, InterfaceC23496h> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet$c$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C15488a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

            /* renamed from: b */
            public static final C15488a f65120b = new C15488a();

            public C15488a() {
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

        public C15487c() {
            super(1);
        }

        /* renamed from: d */
        public static final Unit m57078d(RideStatusBottomSheet this$0, List it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "$it");
            this$0.m59056v().m6670c(it);
            this$0.invalidate();
            return Unit.INSTANCE;
        }

        /* renamed from: e */
        public static final void m57077e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(final List<C3023H6> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final RideStatusBottomSheet rideStatusBottomSheet = RideStatusBottomSheet.this;
            AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: S65
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m57078d;
                    m57078d = RideStatusBottomSheet.C15487c.m57078d(RideStatusBottomSheet.this, it);
                    return m57078d;
                }
            });
            final C15488a c15488a = C15488a.f65120b;
            return m33078H.m33084B(new InterfaceC23484g() { // from class: T65
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    RideStatusBottomSheet.C15487c.m57077e(Function1.this, obj);
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m28432d2 = {"co/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet$d", "LwZ;", "Lco/bird/android/model/RideStatusBottomSheetButton;", "LU65;", "c", "LU65;", DateTokenConverter.CONVERTER_KEY, "()LU65;", "adapter", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet$d */
    /* loaded from: classes3.dex */
    public static final class C15489d extends AbstractC29912wZ<RideStatusBottomSheetButton> {

        /* renamed from: c */
        public final U65 f65121c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/RideStatusBottomSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideStatusBottomSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet$d$a */
        /* loaded from: classes3.dex */
        public static final class C15490a extends Lambda implements Function1<RideStatusBottomSheetButton, Unit> {
            public C15490a() {
                super(1);
            }

            /* renamed from: a */
            public final void m57075a(RideStatusBottomSheetButton it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C15489d.this.m6672a().invoke(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RideStatusBottomSheetButton rideStatusBottomSheetButton) {
                m57075a(rideStatusBottomSheetButton);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15489d(Context context) {
            super(context);
            Intrinsics.checkNotNullExpressionValue(context, "context");
            this.f65121c = new U65();
            getAdapter().m81966w(new C15490a());
        }

        @Override // p000.AbstractC29912wZ
        /* renamed from: d */
        public U65 getAdapter() {
            return this.f65121c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideStatusBottomSheet(Context context) {
        super(context);
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f65115n = new X65(context2);
        C24558d<AbstractC23442F<List<C3023H6>>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Single<List<AdapterSection>>>()");
        this.f65116o = m31902e;
        AbstractC24490k<AbstractC23442F<List<C3023H6>>> flowable = m31902e.toFlowable(EnumC23460b.LATEST);
        final C15485a c15485a = C15485a.f65117g;
        AbstractC24490k<R> m32149f0 = flowable.m32149f0(new InterfaceC23492o() { // from class: P65
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m57086b0;
                m57086b0 = RideStatusBottomSheet.m57086b0(Function1.this, obj);
                return m57086b0;
            }
        });
        final C15486b c15486b = C15486b.f65118b;
        AbstractC24490k m32195I = m32149f0.m32195I(new InterfaceC23484g() { // from class: Q65
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RideStatusBottomSheet.m57085c0(Function1.this, obj);
            }
        });
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC24490k m32111s0 = m32195I.m32206C0(emptyList).m32111s0(C23454a.m33087a());
        final C15487c c15487c = new C15487c();
        AbstractC23461c m32162Z = m32111s0.m32162Z(new InterfaceC23492o() { // from class: R65
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m57084d0;
                m57084d0 = RideStatusBottomSheet.m57084d0(Function1.this, obj);
                return m57084d0;
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
    public static final InterfaceC23447K m57086b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m57085c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23496h m57084d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // co.bird.android.bottomsheet.BaseBottomSheet
    /* renamed from: A */
    public AbstractC29912wZ<? extends RideStatusBottomSheetButton> mo56204A() {
        return new C15489d(getContext());
    }

    /* renamed from: e0 */
    public final void m57083e0(Z65 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof C37772a75) {
            this.f65116o.onNext(this.f65115n.m77375s((C37772a75) model));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideStatusBottomSheet(Context context, AttributeSet attrs) {
        super(context, attrs);
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f65115n = new X65(context2);
        C24558d<AbstractC23442F<List<C3023H6>>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Single<List<AdapterSection>>>()");
        this.f65116o = m31902e;
        AbstractC24490k<AbstractC23442F<List<C3023H6>>> flowable = m31902e.toFlowable(EnumC23460b.LATEST);
        final C15485a c15485a = C15485a.f65117g;
        AbstractC24490k<R> m32149f0 = flowable.m32149f0(new InterfaceC23492o() { // from class: P65
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m57086b0;
                m57086b0 = RideStatusBottomSheet.m57086b0(Function1.this, obj);
                return m57086b0;
            }
        });
        final C15486b c15486b = C15486b.f65118b;
        AbstractC24490k m32195I = m32149f0.m32195I(new InterfaceC23484g() { // from class: Q65
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RideStatusBottomSheet.m57085c0(Function1.this, obj);
            }
        });
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC24490k m32111s0 = m32195I.m32206C0(emptyList).m32111s0(C23454a.m33087a());
        final C15487c c15487c = new C15487c();
        AbstractC23461c m32162Z = m32111s0.m32162Z(new InterfaceC23492o() { // from class: R65
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m57084d0;
                m57084d0 = RideStatusBottomSheet.m57084d0(Function1.this, obj);
                return m57084d0;
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
    public RideStatusBottomSheet(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f65115n = new X65(context2);
        C24558d<AbstractC23442F<List<C3023H6>>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Single<List<AdapterSection>>>()");
        this.f65116o = m31902e;
        AbstractC24490k<AbstractC23442F<List<C3023H6>>> flowable = m31902e.toFlowable(EnumC23460b.LATEST);
        final C15485a c15485a = C15485a.f65117g;
        AbstractC24490k<R> m32149f0 = flowable.m32149f0(new InterfaceC23492o() { // from class: P65
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m57086b0;
                m57086b0 = RideStatusBottomSheet.m57086b0(Function1.this, obj);
                return m57086b0;
            }
        });
        final C15486b c15486b = C15486b.f65118b;
        AbstractC24490k m32195I = m32149f0.m32195I(new InterfaceC23484g() { // from class: Q65
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RideStatusBottomSheet.m57085c0(Function1.this, obj);
            }
        });
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC24490k m32111s0 = m32195I.m32206C0(emptyList).m32111s0(C23454a.m33087a());
        final C15487c c15487c = new C15487c();
        AbstractC23461c m32162Z = m32111s0.m32162Z(new InterfaceC23492o() { // from class: R65
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m57084d0;
                m57084d0 = RideStatusBottomSheet.m57084d0(Function1.this, obj);
                return m57084d0;
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
