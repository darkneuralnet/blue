package co.bird.android.feature.bottomsheets.area;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.feature.bottomsheets.area.AreaBottomSheet;
import co.bird.android.model.AreaBottomSheetButton;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eB!\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001a\u0010!J\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR.\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006#"}, m28432d2 = {"Lco/bird/android/feature/bottomsheets/area/AreaBottomSheet;", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/AreaBottomSheetButton;", "LwZ;", "A", "Lco/bird/android/feature/bottomsheets/area/AreaBottomSheet$d;", "n", "Lco/bird/android/feature/bottomsheets/area/AreaBottomSheet$d;", "getMode", "()Lco/bird/android/feature/bottomsheets/area/AreaBottomSheet$d;", "setMode", "(Lco/bird/android/feature/bottomsheets/area/AreaBottomSheet$d;)V", "mode", "LPm;", "o", "LPm;", "converter", "Lio/reactivex/subjects/d;", "", "LH6;", "kotlin.jvm.PlatformType", "p", "Lio/reactivex/subjects/d;", "uiUpdateSubject", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", DateTokenConverter.CONVERTER_KEY, "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAreaBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheet.kt\nco/bird/android/feature/bottomsheets/area/AreaBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,87:1\n44#2:88\n161#3:89\n*S KotlinDebug\n*F\n+ 1 AreaBottomSheet.kt\nco/bird/android/feature/bottomsheets/area/AreaBottomSheet\n*L\n57#1:88\n57#1:89\n*E\n"})
/* loaded from: classes3.dex */
public final class AreaBottomSheet extends BaseBottomSheet<AreaBottomSheetButton> {

    /* renamed from: n */
    public EnumC14591d f63380n;

    /* renamed from: o */
    public final C6487Pm f63381o;

    /* renamed from: p */
    public final C24558d<List<C3023H6>> f63382p;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.bottomsheets.area.AreaBottomSheet$a */
    /* loaded from: classes3.dex */
    public static final class C14588a extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C14588a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            AbstractC29912wZ<? extends AreaBottomSheetButton> m59056v = AreaBottomSheet.this.m59056v();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            m59056v.m6670c(it);
            AreaBottomSheet.this.invalidate();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.bottomsheets.area.AreaBottomSheet$b */
    /* loaded from: classes3.dex */
    public static final class C14589b extends Lambda implements Function1<List<? extends C3023H6>, Unit> {

        /* renamed from: g */
        public static final C14589b f63384g = new C14589b();

        public C14589b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> list) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.bottomsheets.area.AreaBottomSheet$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C14590c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C14590c f63385b = new C14590c();

        public C14590c() {
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

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/feature/bottomsheets/area/AreaBottomSheet$d;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.bottomsheets.area.AreaBottomSheet$d */
    /* loaded from: classes3.dex */
    public enum EnumC14591d {
        RESTRICTED_CAP_ZONE,
        REFRESH,
        RELEASE_ENCOURAGEMENT,
        VARIABLE_FEE,
        REBALANCE,
        UNKNOWN
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreaBottomSheet(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f63380n = EnumC14591d.UNKNOWN;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f63381o = new C6487Pm(context2);
        C24558d<List<C3023H6>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<List<AdapterSection>>()");
        this.f63382p = m31902e;
        if (isInEditMode()) {
            return;
        }
        AbstractC24490k<List<C3023H6>> m32111s0 = m31902e.toFlowable(EnumC23460b.BUFFER).m32111s0(C23454a.m33087a());
        final C14588a c14588a = new C14588a();
        AbstractC24490k<List<C3023H6>> m32191K = m32111s0.m32191K(new InterfaceC23484g() { // from class: Jm
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AreaBottomSheet.m58667b0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32191K, "uiUpdateSubject\n        …   invalidate()\n        }");
        Context context3 = getContext();
        Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b((LifecycleOwner) context3);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m32150f = m32191K.m32150f(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14589b c14589b = C14589b.f63384g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Km
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AreaBottomSheet.m58666c0(Function1.this, obj);
            }
        };
        final C14590c c14590c = C14590c.f63385b;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Lm
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AreaBottomSheet.m58665d0(Function1.this, obj);
            }
        });
    }

    /* renamed from: b0 */
    public static final void m58667b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m58666c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m58665d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.bottomsheet.BaseBottomSheet
    /* renamed from: A */
    public AbstractC29912wZ<? extends AreaBottomSheetButton> mo56204A() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return new C5357Mm(context);
    }

    public final void setMode(EnumC14591d enumC14591d) {
        Intrinsics.checkNotNullParameter(enumC14591d, "<set-?>");
        this.f63380n = enumC14591d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreaBottomSheet(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f63380n = EnumC14591d.UNKNOWN;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f63381o = new C6487Pm(context2);
        C24558d<List<C3023H6>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<List<AdapterSection>>()");
        this.f63382p = m31902e;
        if (isInEditMode()) {
            return;
        }
        AbstractC24490k<List<C3023H6>> m32111s0 = m31902e.toFlowable(EnumC23460b.BUFFER).m32111s0(C23454a.m33087a());
        final C14588a c14588a = new C14588a();
        AbstractC24490k<List<C3023H6>> m32191K = m32111s0.m32191K(new InterfaceC23484g() { // from class: Jm
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AreaBottomSheet.m58667b0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32191K, "uiUpdateSubject\n        …   invalidate()\n        }");
        Context context3 = getContext();
        Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b((LifecycleOwner) context3);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m32150f = m32191K.m32150f(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14589b c14589b = C14589b.f63384g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Km
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AreaBottomSheet.m58666c0(Function1.this, obj);
            }
        };
        final C14590c c14590c = C14590c.f63385b;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Lm
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AreaBottomSheet.m58665d0(Function1.this, obj);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreaBottomSheet(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f63380n = EnumC14591d.UNKNOWN;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f63381o = new C6487Pm(context2);
        C24558d<List<C3023H6>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<List<AdapterSection>>()");
        this.f63382p = m31902e;
        if (isInEditMode()) {
            return;
        }
        AbstractC24490k<List<C3023H6>> m32111s0 = m31902e.toFlowable(EnumC23460b.BUFFER).m32111s0(C23454a.m33087a());
        final C14588a c14588a = new C14588a();
        AbstractC24490k<List<C3023H6>> m32191K = m32111s0.m32191K(new InterfaceC23484g() { // from class: Jm
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AreaBottomSheet.m58667b0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32191K, "uiUpdateSubject\n        …   invalidate()\n        }");
        Context context3 = getContext();
        Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b((LifecycleOwner) context3);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m32150f = m32191K.m32150f(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14589b c14589b = C14589b.f63384g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Km
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AreaBottomSheet.m58666c0(Function1.this, obj);
            }
        };
        final C14590c c14590c = C14590c.f63385b;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Lm
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AreaBottomSheet.m58665d0(Function1.this, obj);
            }
        });
    }
}
