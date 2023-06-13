package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aa\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"LgV2;", "modifier", "Lhy5;", "shape", "Lpm0;", "backgroundColor", "contentColor", "LeZ;", "border", "Lk61;", "elevation", "Lkotlin/Function0;", "", "content", C17296a.f69688o, "(LgV2;Lhy5;JJLeZ;FLkotlin/jvm/functions/Function2;LEt0;II)V", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,212:1\n154#2:213\n154#2:214\n154#2:222\n25#3:215\n25#3:223\n1114#4,6:216\n1114#4,6:224\n76#5:230\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n*L\n65#1:213\n116#1:214\n187#1:222\n117#1:215\n188#1:223\n117#1:216,6\n188#1:224,6\n189#1:230\n*E\n"})
/* renamed from: Pf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35168Pf0 {
    /* renamed from: a */
    public static final void m90018a(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC42444hy5 interfaceC42444hy5, long j, long j2, C20064eZ c20064eZ, float f, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC41563gV2 interfaceC41563gV22;
        KC0 kc0;
        long j3;
        long j4;
        C20064eZ c20064eZ2;
        float f2;
        Intrinsics.checkNotNullParameter(content, "content");
        interfaceC32720Et0.mo89638F(1956755640);
        if ((i2 & 1) != 0) {
            interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
        } else {
            interfaceC41563gV22 = interfaceC41563gV2;
        }
        if ((i2 & 2) != 0) {
            kc0 = TM2.f35372a.m83730b(interfaceC32720Et0, 6).m109565d();
        } else {
            kc0 = interfaceC42444hy5;
        }
        if ((i2 & 4) != 0) {
            j3 = TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94896n();
        } else {
            j3 = j;
        }
        if ((i2 & 8) != 0) {
            j4 = C34763Nm0.m93468b(j3, interfaceC32720Et0, (i >> 6) & 14);
        } else {
            j4 = j2;
        }
        if ((i2 & 16) != 0) {
            c20064eZ2 = null;
        } else {
            c20064eZ2 = c20064eZ;
        }
        if ((i2 & 32) != 0) {
            f2 = C43705k61.m29303g(1);
        } else {
            f2 = f;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1956755640, i, -1, "androidx.compose.material.Card (Card.kt:58)");
        }
        NV5.m93838a(interfaceC41563gV22, kc0, j3, j4, c20064eZ2, f2, content, interfaceC32720Et0, (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (i & 3670016), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
    }
}
