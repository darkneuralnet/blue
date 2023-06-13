package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"LgV2;", "LCo2;", TransferTable.COLUMN_STATE, "Lho2;", "beyondBoundsInfo", "", "reverseLayout", "LEy3;", "orientation", C17296a.f69688o, "(LgV2;LCo2;Lho2;ZLEy3;LEt0;I)LgV2;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,71:1\n76#2:72\n36#3:73\n83#3,3:80\n1114#4,6:74\n1114#4,6:83\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n*L\n39#1:72\n40#1:73\n41#1:80,3\n40#1:74,6\n41#1:83,6\n*E\n"})
/* renamed from: io2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42934io2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r11v0, types: [Et0] */
    /* renamed from: a */
    public static final InterfaceC41563gV2 m31854a(InterfaceC41563gV2 interfaceC41563gV2, C32209Co2 state, C42341ho2 beyondBoundsInfo, boolean z, EnumC32768Ey3 orientation, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        interfaceC32720Et0.mo89638F(-62057177);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-62057177, i, -1, "androidx.compose.foundation.lazy.lazyListBeyondBoundsModifier (LazyListBeyondBoundsModifier.kt:32)");
        }
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(state);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C43527jo2(state);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C43527jo2 c43527jo2 = mo89635G;
        Object[] objArr = {c43527jo2, beyondBoundsInfo, Boolean.valueOf(z), enumC47065pm2, orientation};
        interfaceC32720Et0.mo89638F(-568225417);
        boolean z2 = false;
        for (int i2 = 0; i2 < 5; i2++) {
            z2 |= interfaceC32720Et0.mo89539n(objArr[i2]);
        }
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (z2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C34774Nn2(c43527jo2, beyondBoundsInfo, z, enumC47065pm2, orientation);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC41563gV2 mo39266t0 = interfaceC41563gV2.mo39266t0((InterfaceC41563gV2) mo89635G2);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return mo39266t0;
    }
}
