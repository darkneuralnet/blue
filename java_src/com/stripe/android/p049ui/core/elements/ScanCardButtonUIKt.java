package com.stripe.android.p049ui.core.elements;

import android.content.Context;
import android.content.Intent;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.p049ui.core.C19369R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C48841sm0;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a:\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"", "enabled", "Lkotlin/Function1;", "Landroid/content/Intent;", "Lkotlin/ParameterName;", "name", "intent", "", "onResult", "ScanCardButtonUI", "(ZLkotlin/jvm/functions/Function1;LEt0;I)V", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScanCardButtonUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanCardButtonUI.kt\ncom/stripe/android/ui/core/elements/ScanCardButtonUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,75:1\n76#2:76\n76#2:98\n36#3:77\n25#3:84\n460#3,13:110\n473#3,3:127\n1057#4,6:78\n1057#4,6:85\n75#5,6:91\n81#5:123\n85#5:131\n75#6:97\n76#6,11:99\n89#6:130\n154#7:124\n154#7:125\n154#7:126\n*S KotlinDebug\n*F\n+ 1 ScanCardButtonUI.kt\ncom/stripe/android/ui/core/elements/ScanCardButtonUIKt\n*L\n32#1:76\n40#1:98\n35#1:77\n43#1:84\n40#1:110,13\n40#1:127,3\n35#1:78,6\n43#1:85,6\n40#1:91,6\n40#1:123\n40#1:131\n40#1:97\n40#1:99,11\n40#1:130\n63#1:124\n64#1:125\n69#1:126\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.ScanCardButtonUIKt */
/* loaded from: classes7.dex */
public final class ScanCardButtonUIKt {
    public static final void ScanCardButtonUI(boolean z, Function1<? super Intent, Unit> onResult, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1242685780);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onResult)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1242685780, i2, -1, "com.stripe.android.ui.core.elements.ScanCardButtonUI (ScanCardButtonUI.kt:27)");
            }
            Context context = (Context) mo89518u.mo89572c(C11411h.m68324g());
            C30903z5 c30903z5 = new C30903z5();
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(onResult);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new ScanCardButtonUIKt$ScanCardButtonUI$cardScanLauncher$1$1(onResult);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            TH2 m110957a = C1362D5.m110957a(c30903z5, (Function1) mo89635G, mo89518u, 8);
            InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            mo89518u.mo89638F(-492369756);
            Object mo89635G2 = mo89518u.mo89635G();
            if (mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G2 = C40741f62.m42091a();
                mo89518u.mo89503z(mo89635G2);
            }
            mo89518u.mo89605Q();
            InterfaceC41563gV2 m70816c = C38131ak0.m70816c(c20912a, (InterfaceC48104rX2) mo89635G2, null, z, null, null, new ScanCardButtonUIKt$ScanCardButtonUI$2(m110957a, context), 24, null);
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, mo89518u, 48);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m70816c);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            C38066ad5 c38066ad5 = C38066ad5.f50835a;
            mo89518u.mo89638F(1382192752);
            AbstractC45562nE3 m19793d = C46748pE3.m19793d(C19369R.C19370drawable.ic_photo_camera, mo89518u, 0);
            int i5 = C19369R.string.scan_card;
            String m41310c = C40946fS5.m41310c(i5, mo89518u, 0);
            C48841sm0.C28383a c28383a = C48841sm0.f109227b;
            TM2 tm2 = TM2.f35372a;
            int i6 = TM2.f35373b;
            C48841sm0 m13699b = C48841sm0.C28383a.m13699b(c28383a, tm2.m83731a(mo89518u, i6).m94900j(), 0, 2, null);
            float f = 18;
            C51659xX1.m5069a(m19793d, m41310c, BB5.m114254o(BB5.m114273A(c20912a, C43705k61.m29303g(f)), C43705k61.m29303g(f)), null, null, 0.0f, m13699b, mo89518u, 392, 56);
            interfaceC32720Et02 = mo89518u;
            C38909c26.m62000e(C40946fS5.m41310c(i5, mo89518u, 0), ND3.m94180m(c20912a, C43705k61.m29303g(4), 0.0f, 0.0f, 0.0f, 14, null), tm2.m83731a(interfaceC32720Et02, i6).m94900j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm2.m83729c(interfaceC32720Et02, i6).m104958j(), interfaceC32720Et02, 48, 0, 32760);
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89563f();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ScanCardButtonUIKt$ScanCardButtonUI$4(z, onResult, i));
        }
    }
}
