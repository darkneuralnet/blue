package p000;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.p003ui.platform.AbstractComposeView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b5\u00106J#\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\b\u0010&R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b'\u0010+R$\u0010/\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00108\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0014\u00101\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u00100R\u0014\u00102\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u00100¨\u00067"}, m28432d2 = {"Lv31;", "Landroidx/compose/ui/platform/AbstractComposeView;", "LI31;", "LYt0;", "parent", "Lkotlin/Function0;", "", "content", "setContent", "(LYt0;Lkotlin/jvm/functions/Function2;)V", "", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "(II)V", "internalOnMeasure", "", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui_release", "(ZIIII)V", "internalOnLayout", "Content", "(LEt0;I)V", "Landroid/view/Window;", "b", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "window", "<set-?>", "c", "LEX2;", C17296a.f69688o, "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", DateTokenConverter.CONVERTER_KEY, "Z", "getUsePlatformDefaultWidth", "()Z", "(Z)V", "usePlatformDefaultWidth", "e", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "()I", "displayWidth", "displayHeight", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,456:1\n76#2:457\n102#2,2:458\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n216#1:457\n216#1:458,2\n*E\n"})
/* renamed from: v31  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50196v31 extends AbstractComposeView implements I31 {

    /* renamed from: b */
    public final Window f113441b;

    /* renamed from: c */
    public final EX2 f113442c;

    /* renamed from: d */
    public boolean f113443d;

    /* renamed from: e */
    public boolean f113444e;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: v31$a */
    /* loaded from: classes.dex */
    public static final class C29404a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f113446h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29404a(int i) {
            super(2);
            this.f113446h = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C50196v31.this.Content(interfaceC32720Et0, C47127ps4.m18626a(this.f113446h | 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50196v31(Context context, Window window) {
        super(context, null, 0, 6, null);
        EX2 m97025e;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(window, "window");
        this.f113441b = window;
        m97025e = LM5.m97025e(C44168kt0.f95154a.m28242a(), null, 2, null);
        this.f113442c = m97025e;
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void Content(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1735448596);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1735448596, i, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:266)");
        }
        m9270a().invoke(mo89518u, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C29404a(i));
        }
    }

    /* renamed from: a */
    public final Function2<InterfaceC32720Et0, Integer, Unit> m9270a() {
        return (Function2) this.f113442c.getValue();
    }

    /* renamed from: b */
    public final int m9269b() {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
        return roundToInt;
    }

    /* renamed from: c */
    public final int m9268c() {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
        return roundToInt;
    }

    /* renamed from: d */
    public final void m9267d(boolean z) {
        this.f113443d = z;
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f113444e;
    }

    @Override // p000.I31
    public Window getWindow() {
        return this.f113441b;
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i, int i2) {
        if (this.f113443d) {
            super.internalOnMeasure$ui_release(i, i2);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(m9268c(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m9269b(), Integer.MIN_VALUE));
        }
    }

    public final void setContent(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
        this.f113442c.setValue(function2);
    }

    public final void setContent(AbstractC37400Yt0 parent, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.f113444e = true;
        createComposition();
    }
}
