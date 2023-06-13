package androidx.compose.p003ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001b\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m28432d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "Content", "(LEt0;I)V", "", "getAccessibilityClassName", "Lkotlin/Function0;", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "LEX2;", "b", "LEX2;", "", "<set-?>", "c", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.ComposeView */
/* loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {

    /* renamed from: b */
    public final EX2<Function2<InterfaceC32720Et0, Integer, Unit>> f53167b;

    /* renamed from: c */
    public boolean f53168c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.platform.ComposeView$a */
    /* loaded from: classes.dex */
    public static final class C11354a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f53170h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11354a(int i) {
            super(2);
            this.f53170h = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            ComposeView.this.Content(interfaceC32720Et0, C47127ps4.m18626a(this.f53170h | 1));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void Content(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(420213850);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(420213850, i, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:426)");
        }
        Function2<InterfaceC32720Et0, Integer, Unit> value = this.f53167b.getValue();
        if (value != null) {
            value.invoke(mo89518u, 0);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C11354a(i));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = ComposeView.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "javaClass.name");
        return name;
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f53168c;
    }

    public final void setContent(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f53168c = true;
        this.f53167b.setValue(content);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EX2<Function2<InterfaceC32720Et0, Integer, Unit>> m97025e;
        Intrinsics.checkNotNullParameter(context, "context");
        m97025e = LM5.m97025e(null, null, 2, null);
        this.f53167b = m97025e;
    }
}
