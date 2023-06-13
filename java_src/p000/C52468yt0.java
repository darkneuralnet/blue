package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m28432d2 = {"", "c", "LYt0;", DateTokenConverter.CONVERTER_KEY, "(LEt0;I)LYt0;", "Lns4;", "b", "(LEt0;I)Lns4;", "currentRecomposeScope", "", C17296a.f69688o, "(LEt0;I)I", "currentCompositeKeyHash", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n1114#2,6:485\n1114#2,6:491\n1114#2,6:497\n1114#2,6:503\n1114#2,6:509\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:485,6\n36#1:491,6\n49#1:497,6\n66#1:503,6\n85#1:509,6\n*E\n"})
/* renamed from: yt0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52468yt0 {
    @JvmName(name = "getCurrentCompositeKeyHash")
    /* renamed from: a */
    public static final int m2337a(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int mo89611O = interfaceC32720Et0.mo89611O();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return mo89611O;
    }

    @JvmName(name = "getCurrentRecomposeScope")
    /* renamed from: b */
    public static final InterfaceC45941ns4 m2336b(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        InterfaceC45941ns4 mo89644D = interfaceC32720Et0.mo89644D();
        if (mo89644D != null) {
            interfaceC32720Et0.mo89554i(mo89644D);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            return mo89644D;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    @PublishedApi
    /* renamed from: c */
    public static final void m2335c() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    /* renamed from: d */
    public static final AbstractC37400Yt0 m2334d(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-1165786124);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        AbstractC37400Yt0 mo89542m = interfaceC32720Et0.mo89542m();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return mo89542m;
    }
}
