package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.ComposeView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\f\u0010\b\u001a\u00020\u0004*\u00020\u0000H\u0002\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\f"}, m28432d2 = {"Landroidx/activity/ComponentActivity;", "LYt0;", "parent", "Lkotlin/Function0;", "", "content", C17296a.f69688o, "(Landroidx/activity/ComponentActivity;LYt0;Lkotlin/jvm/functions/Function2;)V", "c", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultActivityContentLayoutParams", "activity-compose_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ms0 */
/* loaded from: classes.dex */
public final class C34583Ms0 {

    /* renamed from: a */
    public static final ViewGroup.LayoutParams f23693a = new ViewGroup.LayoutParams(-2, -2);

    /* renamed from: a */
    public static final void m94673a(ComponentActivity componentActivity, AbstractC37400Yt0 abstractC37400Yt0, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        ComposeView composeView;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(abstractC37400Yt0);
            composeView.setContent(content);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(abstractC37400Yt0);
        composeView2.setContent(content);
        m94671c(componentActivity);
        componentActivity.setContentView(composeView2, f23693a);
    }

    /* renamed from: b */
    public static /* synthetic */ void m94672b(ComponentActivity componentActivity, AbstractC37400Yt0 abstractC37400Yt0, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC37400Yt0 = null;
        }
        m94673a(componentActivity, abstractC37400Yt0, function2);
    }

    /* renamed from: c */
    public static final void m94671c(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (C35534Qt6.m87653a(decorView) == null) {
            C35534Qt6.m87652b(decorView, componentActivity);
        }
        if (C36470Ut6.m80658a(decorView) == null) {
            C36470Ut6.m80657b(decorView, componentActivity);
        }
        if (C36236Tt6.m82297a(decorView) == null) {
            C36236Tt6.m82296b(decorView, componentActivity);
        }
    }
}
