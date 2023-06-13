package p000;

import android.content.DialogInterface;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.afollestad.materialdialogs.MaterialDialog;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.uber.autodispose.lifecycle.CorrespondingEventsFunction;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24552a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016R!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006,"}, m28432d2 = {"LDU2;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "", "o", "k", "Landroid/content/DialogInterface$OnDismissListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "j", "Lio/reactivex/Observable;", "c2", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "O8", "n", "b", "Lkotlin/Lazy;", "m", "()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Ltu0;", "c", "Ltu0;", "dismissListener", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "parentScopeProvider", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/a;", "dialogLifecycleEvents", "f", "Lio/reactivex/Observable;", "mergedLifecycleEvents", "Lcom/afollestad/materialdialogs/MaterialDialog;", "g", "Lcom/afollestad/materialdialogs/MaterialDialog;", "l", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog", "LIU2;", "builder", "<init>", "(LIU2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modal.kt\nco/bird/android/app/dialog/Modal\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
/* renamed from: DU2 */
/* loaded from: classes2.dex */
public final class DU2 implements LifecycleScopeProvider<EnumC7097RE> {

    /* renamed from: b */
    public final Lazy f5763b;

    /* renamed from: c */
    public final DialogInterface$OnDismissListenerC49514tu0 f5764c;

    /* renamed from: d */
    public final LifecycleScopeProvider<EnumC7097RE> f5765d;

    /* renamed from: e */
    public final C24552a<EnumC7097RE> f5766e;

    /* renamed from: f */
    public final Observable<EnumC7097RE> f5767f;

    /* renamed from: g */
    public final MaterialDialog f5768g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LRE;", "it", "", C17296a.f69688o, "(LRE;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: DU2$a */
    /* loaded from: classes2.dex */
    public static final class C1494a extends Lambda implements Function1<EnumC7097RE, Boolean> {

        /* renamed from: g */
        public static final C1494a f5769g = new C1494a();

        public C1494a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC7097RE it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == EnumC7097RE.DETACH) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: DU2$b */
    /* loaded from: classes2.dex */
    public static final class C1495b extends Lambda implements Function1<View, Unit> {
        public C1495b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            DU2.this.m110367l().dismiss();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LDU2;", "b", "()LDU2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: DU2$c */
    /* loaded from: classes2.dex */
    public static final class C1496c extends Lambda implements Function0<DU2> {
        public C1496c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final DU2 invoke() {
            return DU2.this;
        }
    }

    public DU2(IU2 builder) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(builder, "builder");
        lazy = LazyKt__LazyJVMKt.lazy(new C1496c());
        this.f5763b = lazy;
        C24552a<EnumC7097RE> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<BasicScopeEvent>()");
        this.f5766e = m31922e;
        MaterialDialog m102048i = builder.m102048i();
        this.f5768g = m102048i;
        DialogInterface$OnDismissListenerC49514tu0 m102049h = builder.m102049h();
        this.f5764c = m102049h;
        m102048i.setOnDismissListener(m102049h);
        m110369j(new DialogInterface.OnDismissListener() { // from class: BU2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DU2.m110371e(DU2.this, dialogInterface);
            }
        });
        this.f5765d = builder.m102047j();
        Observable<EnumC7097RE> mo37323c2 = builder.m102047j().mo37323c2();
        final C1494a c1494a = C1494a.f5769g;
        Observable<EnumC7097RE> distinctUntilChanged = m31922e.mergeWith(mo37323c2.filter(new InterfaceC23494q() { // from class: CU2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m110370i;
                m110370i = DU2.m110370i(Function1.this, obj);
                return m110370i;
            }
        })).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "dialogLifecycleEvents\n  …  .distinctUntilChanged()");
        this.f5767f = distinctUntilChanged;
        View m102050g = builder.m102050g();
        if (m102050g != null) {
            C34585Ms2.m94661j(m102050g, new C1495b());
        }
    }

    /* renamed from: e */
    public static final void m110371e(DU2 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f5766e.onNext(EnumC7097RE.DETACH);
    }

    /* renamed from: i */
    public static final boolean m110370i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: O8 */
    public CorrespondingEventsFunction<EnumC7097RE> mo37326O8() {
        return EnumC7097RE.f31752b.m87016a();
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: c2 */
    public Observable<EnumC7097RE> mo37323c2() {
        Observable<EnumC7097RE> hide = this.f5767f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "mergedLifecycleEvents.hide()");
        return hide;
    }

    /* renamed from: j */
    public final void m110369j(DialogInterface.OnDismissListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f5764c.m11252a(listener);
    }

    /* renamed from: k */
    public final void m110368k() {
        this.f5768g.dismiss();
    }

    /* renamed from: l */
    public final MaterialDialog m110367l() {
        return this.f5768g;
    }

    /* renamed from: m */
    public final LifecycleScopeProvider<EnumC7097RE> m110366m() {
        return (LifecycleScopeProvider) this.f5763b.getValue();
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: n */
    public EnumC7097RE peekLifecycle() {
        EnumC7097RE peekLifecycle = this.f5765d.peekLifecycle();
        EnumC7097RE enumC7097RE = EnumC7097RE.DETACH;
        if (peekLifecycle != enumC7097RE) {
            return this.f5766e.getValue();
        }
        return enumC7097RE;
    }

    /* renamed from: o */
    public final void m110364o() {
        this.f5768g.show();
        this.f5766e.onNext(EnumC7097RE.ATTACH);
    }
}
