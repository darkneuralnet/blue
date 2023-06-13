package androidx.compose.p003ui.platform;

import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\u0007\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m28432d2 = {"Landroidx/compose/ui/platform/k;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", C17296a.f69688o, "b", "c", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.k */
/* loaded from: classes.dex */
public interface InterfaceC11435k {

    /* renamed from: a */
    public static final C11436a f53386a = C11436a.f53387a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m28432d2 = {"Landroidx/compose/ui/platform/k$a;", "", "Landroidx/compose/ui/platform/k;", C17296a.f69688o, "()Landroidx/compose/ui/platform/k;", "Default", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.k$a */
    /* loaded from: classes.dex */
    public static final class C11436a {

        /* renamed from: a */
        public static final /* synthetic */ C11436a f53387a = new C11436a();

        private C11436a() {
        }

        /* renamed from: a */
        public final InterfaceC11435k m68290a() {
            return C11437b.f53388b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"Landroidx/compose/ui/platform/k$b;", "Landroidx/compose/ui/platform/k;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", C17296a.f69688o, "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.k$b */
    /* loaded from: classes.dex */
    public static final class C11437b implements InterfaceC11435k {

        /* renamed from: b */
        public static final C11437b f53388b = new C11437b();

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: androidx.compose.ui.platform.k$b$a */
        /* loaded from: classes.dex */
        public static final class C11438a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractComposeView f53389g;

            /* renamed from: h */
            public final /* synthetic */ View$OnAttachStateChangeListenerC11439b f53390h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC40405eY3 f53391i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11438a(AbstractComposeView abstractComposeView, View$OnAttachStateChangeListenerC11439b view$OnAttachStateChangeListenerC11439b, InterfaceC40405eY3 interfaceC40405eY3) {
                super(0);
                this.f53389g = abstractComposeView;
                this.f53390h = view$OnAttachStateChangeListenerC11439b;
                this.f53391i = interfaceC40405eY3;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f53389g.removeOnAttachStateChangeListener(this.f53390h);
                C39813dY3.m44164g(this.f53389g, this.f53391i);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"androidx/compose/ui/platform/k$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.k$b$b */
        /* loaded from: classes.dex */
        public static final class View$OnAttachStateChangeListenerC11439b implements View.OnAttachStateChangeListener {

            /* renamed from: b */
            public final /* synthetic */ AbstractComposeView f53392b;

            public View$OnAttachStateChangeListenerC11439b(AbstractComposeView abstractComposeView) {
                this.f53392b = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
                if (!C39813dY3.m44165f(this.f53392b)) {
                    this.f53392b.disposeComposition();
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.k$b$c */
        /* loaded from: classes.dex */
        public static final class C11440c implements InterfaceC40405eY3 {

            /* renamed from: a */
            public final /* synthetic */ AbstractComposeView f53393a;

            public C11440c(AbstractComposeView abstractComposeView) {
                this.f53393a = abstractComposeView;
            }

            @Override // p000.InterfaceC40405eY3
            /* renamed from: b */
            public final void mo42798b() {
                this.f53393a.disposeComposition();
            }
        }

        private C11437b() {
        }

        @Override // androidx.compose.p003ui.platform.InterfaceC11435k
        /* renamed from: a */
        public Function0<Unit> mo68289a(AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            View$OnAttachStateChangeListenerC11439b view$OnAttachStateChangeListenerC11439b = new View$OnAttachStateChangeListenerC11439b(view);
            view.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC11439b);
            C11440c c11440c = new C11440c(view);
            C39813dY3.m44170a(view, c11440c);
            return new C11438a(view, view$OnAttachStateChangeListenerC11439b, c11440c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"Landroidx/compose/ui/platform/k$c;", "Landroidx/compose/ui/platform/k;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", C17296a.f69688o, "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.k$c */
    /* loaded from: classes.dex */
    public static final class C11441c implements InterfaceC11435k {

        /* renamed from: b */
        public static final C11441c f53394b = new C11441c();

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: androidx.compose.ui.platform.k$c$a */
        /* loaded from: classes.dex */
        public static final class C11442a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractComposeView f53395g;

            /* renamed from: h */
            public final /* synthetic */ View$OnAttachStateChangeListenerC11444c f53396h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11442a(AbstractComposeView abstractComposeView, View$OnAttachStateChangeListenerC11444c view$OnAttachStateChangeListenerC11444c) {
                super(0);
                this.f53395g = abstractComposeView;
                this.f53396h = view$OnAttachStateChangeListenerC11444c;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f53395g.removeOnAttachStateChangeListener(this.f53396h);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: androidx.compose.ui.platform.k$c$b */
        /* loaded from: classes.dex */
        public static final class C11443b extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ Ref.ObjectRef<Function0<Unit>> f53397g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11443b(Ref.ObjectRef<Function0<Unit>> objectRef) {
                super(0);
                this.f53397g = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f53397g.element.invoke();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"androidx/compose/ui/platform/k$c$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.k$c$c */
        /* loaded from: classes.dex */
        public static final class View$OnAttachStateChangeListenerC11444c implements View.OnAttachStateChangeListener {

            /* renamed from: b */
            public final /* synthetic */ AbstractComposeView f53398b;

            /* renamed from: c */
            public final /* synthetic */ Ref.ObjectRef<Function0<Unit>> f53399c;

            public View$OnAttachStateChangeListenerC11444c(AbstractComposeView abstractComposeView, Ref.ObjectRef<Function0<Unit>> objectRef) {
                this.f53398b = abstractComposeView;
                this.f53399c = objectRef;
            }

            /* JADX WARN: Type inference failed for: r3v7, types: [T, kotlin.jvm.functions.Function0] */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
                LifecycleOwner m87653a = C35534Qt6.m87653a(this.f53398b);
                AbstractComposeView abstractComposeView = this.f53398b;
                if (m87653a != null) {
                    this.f53399c.element = ViewCompositionStrategy_androidKt.m68529a(abstractComposeView, m87653a.getLifecycle());
                    this.f53398b.removeOnAttachStateChangeListener(this);
                    return;
                }
                throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
            }
        }

        private C11441c() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.k$c$a] */
        @Override // androidx.compose.p003ui.platform.InterfaceC11435k
        /* renamed from: a */
        public Function0<Unit> mo68289a(AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (view.isAttachedToWindow()) {
                LifecycleOwner m87653a = C35534Qt6.m87653a(view);
                if (m87653a != null) {
                    return ViewCompositionStrategy_androidKt.m68529a(view, m87653a.getLifecycle());
                }
                throw new IllegalStateException(("View tree for " + view + " has no ViewTreeLifecycleOwner").toString());
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            View$OnAttachStateChangeListenerC11444c view$OnAttachStateChangeListenerC11444c = new View$OnAttachStateChangeListenerC11444c(view, objectRef);
            view.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC11444c);
            objectRef.element = new C11442a(view, view$OnAttachStateChangeListenerC11444c);
            return new C11443b(objectRef);
        }
    }

    /* renamed from: a */
    Function0<Unit> mo68289a(AbstractComposeView abstractComposeView);
}
