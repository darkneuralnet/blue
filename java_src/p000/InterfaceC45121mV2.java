package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R$\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m28432d2 = {"LmV2;", "LpV2;", "LvZ0;", "LlV2;", "k", "()LlV2;", "providedValues", "T", "LhV2;", C17296a.f69688o, "(LhV2;)Ljava/lang/Object;", "current", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModifierLocalNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,220:1\n77#2:221\n314#3:222\n78#3,17:223\n*S KotlinDebug\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNode\n*L\n170#1:221\n170#1:222\n170#1:223,17\n*E\n"})
/* renamed from: mV2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC45121mV2 extends InterfaceC46900pV2, InterfaceC50490vZ0 {
    @Override // p000.InterfaceC46900pV2
    /* renamed from: a */
    default <T> T mo19176a(AbstractC42156hV2<T> abstractC42156hV2) {
        F83 m99764m0;
        Intrinsics.checkNotNullParameter(abstractC42156hV2, "<this>");
        if (mo8445r().m39254Q()) {
            int m99169a = K83.m99169a(32);
            if (mo8445r().m39254Q()) {
                InterfaceC41563gV2.AbstractC20914c m39256O = mo8445r().m39256O();
                C33829Jm2 m6661h = C51083wZ0.m6661h(this);
                while (m6661h != null) {
                    if ((m6661h.m99764m0().m107677l().m39262G() & m99169a) != 0) {
                        while (m39256O != null) {
                            if ((m39256O.m39258M() & m99169a) != 0 && (m39256O instanceof InterfaceC45121mV2)) {
                                InterfaceC45121mV2 interfaceC45121mV2 = (InterfaceC45121mV2) m39256O;
                                if (interfaceC45121mV2.mo25501k().mo27215a(abstractC42156hV2)) {
                                    return (T) interfaceC45121mV2.mo25501k().mo27214b(abstractC42156hV2);
                                }
                            }
                            m39256O = m39256O.m39256O();
                        }
                    }
                    m6661h = m6661h.m99756p0();
                    if (m6661h != null && (m99764m0 = m6661h.m99764m0()) != null) {
                        m39256O = m99764m0.m107674o();
                    } else {
                        m39256O = null;
                    }
                }
                return abstractC42156hV2.m36342a().invoke();
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: k */
    default AbstractC44528lV2 mo25501k() {
        return C36294Ua1.f37562a;
    }
}
