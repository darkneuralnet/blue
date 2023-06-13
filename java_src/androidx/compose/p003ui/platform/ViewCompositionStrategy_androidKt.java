package androidx.compose.p003ui.platform;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, m28432d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Landroidx/lifecycle/f;", "lifecycle", "Lkotlin/Function0;", "", "b", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt */
/* loaded from: classes.dex */
public final class ViewCompositionStrategy_androidKt {

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$a */
    /* loaded from: classes.dex */
    public static final class C11355a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC11719f f53172g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC11728i f53173h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11355a(AbstractC11719f abstractC11719f, InterfaceC11728i interfaceC11728i) {
            super(0);
            this.f53172g = abstractC11719f;
            this.f53173h = interfaceC11728i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f53172g.mo67006d(this.f53173h);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Function0 m68529a(AbstractComposeView abstractComposeView, AbstractC11719f abstractC11719f) {
        return m68528b(abstractComposeView, abstractC11719f);
    }

    /* renamed from: b */
    public static final Function0<Unit> m68528b(final AbstractComposeView abstractComposeView, AbstractC11719f abstractC11719f) {
        boolean z;
        if (abstractC11719f.mo67007b().compareTo(AbstractC11719f.EnumC11724b.DESTROYED) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            InterfaceC11728i interfaceC11728i = new InterfaceC11728i() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$observer$1
                @Override // androidx.lifecycle.InterfaceC11728i
                public final void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == AbstractC11719f.EnumC11720a.ON_DESTROY) {
                        AbstractComposeView.this.disposeComposition();
                    }
                }
            };
            abstractC11719f.mo67008a(interfaceC11728i);
            return new C11355a(abstractC11719f, interfaceC11728i);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + abstractC11719f + "is already destroyed").toString());
    }
}
