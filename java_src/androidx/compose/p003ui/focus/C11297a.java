package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.focus.C11299c;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC0587BG;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, m28432d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/c;", "direction", "Lkotlin/Function1;", "LBG$a;", "Lkotlin/ExtensionFunctionType;", "block", C17296a.f69688o, "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.a */
/* loaded from: classes.dex */
public final class C11297a {
    /* renamed from: a */
    public static final <T> T m68824a(FocusTargetModifierNode searchBeyondBounds, int i, Function1<? super InterfaceC0587BG.InterfaceC0588a, ? extends T> block) {
        int m114152c;
        Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
        Intrinsics.checkNotNullParameter(block, "block");
        InterfaceC0587BG m68832f0 = searchBeyondBounds.m68832f0();
        if (m68832f0 != null) {
            C11299c.C11300a c11300a = C11299c.f52961b;
            if (C11299c.m68811l(i, c11300a.m68800h())) {
                m114152c = InterfaceC0587BG.C0589b.f2153a.m114154a();
            } else if (C11299c.m68811l(i, c11300a.m68807a())) {
                m114152c = InterfaceC0587BG.C0589b.f2153a.m114151d();
            } else if (C11299c.m68811l(i, c11300a.m68804d())) {
                m114152c = InterfaceC0587BG.C0589b.f2153a.m114150e();
            } else if (C11299c.m68811l(i, c11300a.m68801g())) {
                m114152c = InterfaceC0587BG.C0589b.f2153a.m114149f();
            } else if (C11299c.m68811l(i, c11300a.m68803e())) {
                m114152c = InterfaceC0587BG.C0589b.f2153a.m114153b();
            } else if (C11299c.m68811l(i, c11300a.m68802f())) {
                m114152c = InterfaceC0587BG.C0589b.f2153a.m114152c();
            } else {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            return (T) m68832f0.mo93416a(m114152c, block);
        }
        return null;
    }
}
