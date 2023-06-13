package p000;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a.\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¨\u0006\b"}, m28432d2 = {"LJm2;", "LLX2;", "LvO2;", "destination", "Lkotlin/Function1;", "transform", "", "b", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n165#2:1238\n476#3,11:1239\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n1161#1:1238\n1161#1:1239,11\n*E\n"})
/* renamed from: Pm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35233Pm2 {
    /* renamed from: a */
    public static final /* synthetic */ void m89797a(C33829Jm2 c33829Jm2, LX2 lx2, Function1 function1) {
        m89796b(c33829Jm2, lx2, function1);
    }

    /* renamed from: b */
    public static final void m89796b(C33829Jm2 c33829Jm2, LX2<InterfaceC50393vO2> lx2, Function1<? super C33829Jm2, ? extends InterfaceC50393vO2> function1) {
        LX2<C33829Jm2> m99736w0 = c33829Jm2.m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            int i = 0;
            do {
                C33829Jm2 c33829Jm22 = m96691s[i];
                if (lx2.m96690u() <= i) {
                    lx2.m96701b(function1.invoke(c33829Jm22));
                } else {
                    lx2.m96704F(i, function1.invoke(c33829Jm22));
                }
                i++;
            } while (i < m96690u);
            lx2.m96706D(c33829Jm2.m99818M().size(), lx2.m96690u());
        }
        lx2.m96706D(c33829Jm2.m99818M().size(), lx2.m96690u());
    }
}
