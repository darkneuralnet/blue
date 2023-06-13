package com.stripe.android.link.p042ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.p003ui.platform.AbstractComposeView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.link.LinkPaymentLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0006\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R7\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001d\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001f¨\u0006("}, m28432d2 = {"Lcom/stripe/android/link/ui/LinkButtonView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "enabled", "", "setEnabled", "Content", "(LEt0;I)V", "<set-?>", "shouldCreateCompositionOnAttachedToWindow", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "Lcom/stripe/android/link/LinkPaymentLauncher;", "linkPaymentLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "getLinkPaymentLauncher", "()Lcom/stripe/android/link/LinkPaymentLauncher;", "setLinkPaymentLauncher", "(Lcom/stripe/android/link/LinkPaymentLauncher;)V", "Lkotlin/Function0;", "onClick$delegate", "LEX2;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "onClick", "isEnabledState$delegate", "isEnabledState", "setEnabledState", "(Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLinkButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonView\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,166:1\n76#2:167\n102#2,2:168\n76#2:170\n102#2,2:171\n76#2:173\n*S KotlinDebug\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonView\n*L\n146#1:167\n146#1:168,2\n147#1:170\n147#1:171,2\n157#1:173\n*E\n"})
/* renamed from: com.stripe.android.link.ui.LinkButtonView */
/* loaded from: classes7.dex */
public final class LinkButtonView extends AbstractComposeView {
    public static final int $stable = 8;
    private final EX2 isEnabledState$delegate;
    private LinkPaymentLauncher linkPaymentLauncher;
    private final EX2 onClick$delegate;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LinkButtonView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private static final String Content$lambda$1$lambda$0(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private final boolean isEnabledState() {
        return ((Boolean) this.isEnabledState$delegate.getValue()).booleanValue();
    }

    private final void setEnabledState(boolean z) {
        this.isEnabledState$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void Content(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(230006564);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(230006564, i, -1, "com.stripe.android.link.ui.LinkButtonView.Content (LinkButtonView.kt:154)");
        }
        LinkPaymentLauncher linkPaymentLauncher = this.linkPaymentLauncher;
        if (linkPaymentLauncher != null) {
            LinkButtonViewKt.LinkButton(Content$lambda$1$lambda$0(GM5.m105206a(linkPaymentLauncher.getEmailFlow(), null, null, mo89518u, 56, 2)), isEnabledState(), getOnClick(), null, mo89518u, 0, 8);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LinkButtonView$Content$2(this, i));
        }
    }

    public final LinkPaymentLauncher getLinkPaymentLauncher() {
        return this.linkPaymentLauncher;
    }

    public final Function0<Unit> getOnClick() {
        return (Function0) this.onClick$delegate.getValue();
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setEnabledState(z);
    }

    public final void setLinkPaymentLauncher(LinkPaymentLauncher linkPaymentLauncher) {
        this.linkPaymentLauncher = linkPaymentLauncher;
    }

    public final void setOnClick(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onClick$delegate.setValue(function0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LinkButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LinkButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LinkButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EX2 m97025e;
        EX2 m97025e2;
        Intrinsics.checkNotNullParameter(context, "context");
        m97025e = LM5.m97025e(LinkButtonView$onClick$2.INSTANCE, null, 2, null);
        this.onClick$delegate = m97025e;
        m97025e2 = LM5.m97025e(Boolean.valueOf(isEnabled()), null, 2, null);
        this.isEnabledState$delegate = m97025e2;
    }
}
