package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, m28432d2 = {"LvZ0;", "LE61;", "b", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,114:1\n71#2:115\n69#2:116\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n101#1:115\n102#1:116\n*E\n"})
/* renamed from: Mm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34531Mm2 {
    /* renamed from: b */
    public static final E61 m94880b(InterfaceC50490vZ0 interfaceC50490vZ0) {
        int m99169a = K83.m99169a(4);
        int m99169a2 = K83.m99169a(2);
        InterfaceC41563gV2.AbstractC20914c m39261I = interfaceC50490vZ0.mo8445r().m39261I();
        if (m39261I == null || (m39261I.m39262G() & m99169a) == 0) {
            return null;
        }
        while (m39261I != null && (m39261I.m39258M() & m99169a2) == 0) {
            if ((m39261I.m39258M() & m99169a) != 0) {
                return (E61) m39261I;
            }
            m39261I = m39261I.m39261I();
        }
        return null;
    }
}
