package com.stripe.android.uicore.elements;

import androidx.compose.p003ui.focus.C11308g;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.StripeThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.EP1;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a)\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\"\u001d\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, m28432d2 = {"", "DropDownPreview", "(LEt0;I)V", "Lcom/stripe/android/uicore/elements/DropdownFieldController;", "controller", "", "enabled", "LgV2;", "modifier", "DropDown", "(Lcom/stripe/android/uicore/elements/DropdownFieldController;ZLgV2;LEt0;II)V", "", "displayValue", "isSelected", "Lpm0;", "currentTextColor", "Lkotlin/Function0;", "onClick", "DropdownMenuItem-cf5BqRc", "(Ljava/lang/String;ZJLkotlin/jvm/functions/Function0;LEt0;II)V", "DropdownMenuItem", "Lk61;", "DropdownMenuItemDefaultMaxWidth", "F", "getDropdownMenuItemDefaultMaxWidth", "()F", "DropdownMenuItemDefaultMinHeight", "getDropdownMenuItemDefaultMinHeight", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDropdownFieldUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropdownFieldUI.kt\ncom/stripe/android/uicore/elements/DropdownFieldUIKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,244:1\n25#2:245\n25#2:252\n460#2,13:279\n36#2:293\n460#2,13:319\n460#2,13:353\n473#2,3:368\n460#2,13:392\n460#2,13:428\n460#2,13:461\n473#2,3:475\n473#2,3:480\n460#2,13:504\n473#2,3:519\n473#2,3:524\n473#2,3:529\n36#2:534\n473#2,3:542\n460#2,13:568\n473#2,3:584\n1057#3,6:246\n1057#3,6:253\n1057#3,6:294\n1057#3,6:535\n1057#3,6:547\n76#4:259\n76#4:267\n76#4:307\n76#4:341\n76#4:380\n76#4:416\n76#4:449\n76#4:492\n76#4:556\n67#5,6:260\n73#5:292\n67#5,6:300\n73#5:332\n77#5:533\n77#5:546\n75#6:266\n76#6,11:268\n75#6:306\n76#6,11:308\n75#6:340\n76#6,11:342\n89#6:371\n75#6:379\n76#6,11:381\n75#6:415\n76#6,11:417\n75#6:448\n76#6,11:450\n89#6:478\n89#6:483\n75#6:491\n76#6,11:493\n89#6:522\n89#6:527\n89#6:532\n89#6:545\n75#6:555\n76#6,11:557\n89#6:587\n74#7,7:333\n81#7:366\n85#7:372\n75#7,6:373\n81#7:405\n75#7,6:442\n81#7:474\n85#7:479\n85#7:528\n79#7,2:553\n81#7:581\n85#7:588\n154#8:367\n154#8:406\n154#8:407\n154#8:408\n154#8:518\n154#8:582\n154#8:583\n154#8:594\n154#8:595\n74#9,6:409\n80#9:441\n84#9:484\n74#9,6:485\n80#9:517\n84#9:523\n88#10:541\n76#11:589\n76#11:590\n76#11:591\n102#11,2:592\n*S KotlinDebug\n*F\n+ 1 DropdownFieldUI.kt\ncom/stripe/android/uicore/elements/DropdownFieldUIKt\n*L\n82#1:245\n84#1:252\n95#1:279,13\n109#1:293\n101#1:319,13\n114#1:353,13\n114#1:368,3\n129#1:392,13\n133#1:428,13\n143#1:461,13\n143#1:475,3\n133#1:480,3\n154#1:504,13\n154#1:519,3\n129#1:524,3\n101#1:529,3\n169#1:534\n95#1:542,3\n197#1:568,13\n197#1:584,3\n82#1:246,6\n84#1:253,6\n109#1:294,6\n169#1:535,6\n205#1:547,6\n94#1:259\n95#1:267\n101#1:307\n114#1:341\n129#1:380\n133#1:416\n143#1:449\n154#1:492\n197#1:556\n95#1:260,6\n95#1:292\n101#1:300,6\n101#1:332\n101#1:533\n95#1:546\n95#1:266\n95#1:268,11\n101#1:306\n101#1:308,11\n114#1:340\n114#1:342,11\n114#1:371\n129#1:379\n129#1:381,11\n133#1:415\n133#1:417,11\n143#1:448\n143#1:450,11\n143#1:478\n133#1:483\n154#1:491\n154#1:493,11\n154#1:522\n129#1:527\n101#1:532\n95#1:545\n197#1:555\n197#1:557,11\n197#1:587\n114#1:333,7\n114#1:366\n114#1:372\n129#1:373,6\n129#1:405\n143#1:442,6\n143#1:474\n143#1:479\n129#1:528\n197#1:553,2\n197#1:581\n197#1:588\n123#1:367\n135#1:406\n136#1:407\n137#1:408\n158#1:518\n214#1:582\n234#1:583\n242#1:594\n243#1:595\n133#1:409,6\n133#1:441\n133#1:484\n154#1:485,6\n154#1:517\n154#1:523\n173#1:541\n74#1:589\n75#1:590\n82#1:591\n82#1:592,2\n*E\n"})
/* loaded from: classes7.dex */
public final class DropdownFieldUIKt {
    private static final float DropdownMenuItemDefaultMaxWidth = C43705k61.m29303g(280);
    private static final float DropdownMenuItemDefaultMinHeight = C43705k61.m29303g(48);

    public static final void DropDown(DropdownFieldController controller, boolean z, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC32720Et0 interfaceC32720Et02;
        EX2 ex2;
        Object obj;
        int i3;
        long j;
        InterfaceC41563gV2.C20912a c20912a;
        char c;
        int i4;
        TM2 tm2;
        int i5;
        InterfaceC41563gV2 interfaceC41563gV23;
        InterfaceC32720Et0 interfaceC32720Et03;
        TM2 tm22;
        InterfaceC41563gV2.C20912a c20912a2;
        EX2 ex22;
        Intrinsics.checkNotNullParameter(controller, "controller");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1853309673);
        InterfaceC41563gV2.C20912a c20912a3 = (i2 & 4) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1853309673, i, -1, "com.stripe.android.uicore.elements.DropDown (DropdownFieldUI.kt:68)");
        }
        InterfaceC48627sP5 m105206a = GM5.m105206a(controller.getLabel(), null, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a2 = GM5.m105206a(controller.getSelectedIndex(), 0, null, mo89518u, 56, 2);
        List<String> displayItems = controller.getDisplayItems();
        boolean z2 = displayItems.size() == 1 && controller.getDisableDropdownWithSingleElement();
        boolean z3 = z && !z2;
        mo89518u.mo89638F(-492369756);
        Object mo89635G = mo89518u.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = LM5.m97025e(Boolean.FALSE, null, 2, null);
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        EX2 ex23 = (EX2) mo89635G;
        String selectedItemLabel = controller.getSelectedItemLabel(DropDown$lambda$1(m105206a2));
        mo89518u.mo89638F(-492369756);
        Object mo89635G2 = mo89518u.mo89635G();
        if (mo89635G2 == c2012a.m108267a()) {
            mo89635G2 = C40741f62.m42091a();
            mo89518u.mo89503z(mo89635G2);
        }
        mo89518u.mo89605Q();
        InterfaceC48104rX2 interfaceC48104rX2 = (InterfaceC48104rX2) mo89635G2;
        if (z3) {
            mo89518u.mo89638F(430754190);
            long m116698getOnComponent0d7_KjU = StripeThemeKt.getStripeColors(TM2.f35372a, mo89518u, TM2.f35373b).m116698getOnComponent0d7_KjU();
            mo89518u.mo89605Q();
            j = m116698getOnComponent0d7_KjU;
            ex2 = ex23;
            obj = null;
            i3 = 2;
            interfaceC41563gV22 = c20912a3;
            interfaceC32720Et02 = mo89518u;
        } else {
            mo89518u.mo89638F(430754250);
            interfaceC41563gV22 = c20912a3;
            interfaceC32720Et02 = mo89518u;
            ex2 = ex23;
            obj = null;
            i3 = 2;
            long m18733w = C41288g16.f81350a.m40288l(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, interfaceC32720Et02, 0, 0, 48, 2097151).mo44714d(false, false, interfaceC48104rX2, interfaceC32720Et02, 438).getValue().m18733w();
            interfaceC32720Et02.mo89605Q();
            j = m18733w;
        }
        InterfaceC32720Et0 interfaceC32720Et04 = interfaceC32720Et02;
        InterfaceC44862m32 interfaceC44862m32 = (InterfaceC44862m32) interfaceC32720Et04.mo89572c(C42399hu0.m35608k());
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        InterfaceC41563gV2 interfaceC41563gV24 = interfaceC41563gV22;
        InterfaceC41563gV2 m114269E = BB5.m114269E(interfaceC41563gV24, c4361a.m99132n(), false, i3, obj);
        TM2 tm23 = TM2.f35372a;
        int i6 = TM2.f35373b;
        InterfaceC41563gV2 m62124d = C13342bw.m62124d(m114269E, StripeThemeKt.getStripeColors(tm23, interfaceC32720Et04, i6).m116695getComponent0d7_KjU(), null, 2, null);
        interfaceC32720Et04.mo89638F(733328855);
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, interfaceC32720Et04, 0);
        interfaceC32720Et04.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et04.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et04.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et04.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m62124d);
        if (!(interfaceC32720Et04.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        interfaceC32720Et04.mo89557h();
        if (interfaceC32720Et04.mo89521t()) {
            interfaceC32720Et04.mo89617M(m113415a);
        } else {
            interfaceC32720Et04.mo89566e();
        }
        interfaceC32720Et04.mo89620L();
        InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et04);
        C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        interfaceC32720Et04.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et04)), interfaceC32720Et04, 0);
        interfaceC32720Et04.mo89638F(2058660585);
        interfaceC32720Et04.mo89638F(-2137368960);
        C40689f10 c40689f10 = C40689f10.f79291a;
        interfaceC32720Et04.mo89638F(-1833949201);
        InterfaceC41563gV2.C20912a c20912a4 = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m68784a = C11308g.m68784a(c20912a4, new DropdownFieldUIKt$DropDown$1$1(interfaceC44862m32));
        String m41310c = C40946fS5.m41310c(C19423R.string.change, interfaceC32720Et04, 0);
        interfaceC32720Et04.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et04.mo89539n(ex2);
        Object mo89635G3 = interfaceC32720Et04.mo89635G();
        if (mo89539n || mo89635G3 == c2012a.m108267a()) {
            mo89635G3 = new DropdownFieldUIKt$DropDown$1$2$1(ex2);
            interfaceC32720Et04.mo89503z(mo89635G3);
        }
        interfaceC32720Et04.mo89605Q();
        InterfaceC41563gV2 m70814e = C38131ak0.m70814e(m68784a, z3, m41310c, null, (Function0) mo89635G3, 4, null);
        interfaceC32720Et04.mo89638F(733328855);
        InterfaceC51579xO2 m44729h2 = C39504d10.m44729h(c4361a.m99132n(), false, interfaceC32720Et04, 0);
        interfaceC32720Et04.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et04.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et04.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et04.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m70814e);
        if (!(interfaceC32720Et04.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        interfaceC32720Et04.mo89557h();
        if (interfaceC32720Et04.mo89521t()) {
            interfaceC32720Et04.mo89617M(m113415a2);
        } else {
            interfaceC32720Et04.mo89566e();
        }
        interfaceC32720Et04.mo89620L();
        InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(interfaceC32720Et04);
        C38680bf6.m64191b(m64192a2, m44729h2, c0757a.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
        interfaceC32720Et04.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et04)), interfaceC32720Et04, 0);
        interfaceC32720Et04.mo89638F(2058660585);
        interfaceC32720Et04.mo89638F(-2137368960);
        interfaceC32720Et04.mo89638F(436023925);
        if (controller.getTinyMode()) {
            interfaceC32720Et04.mo89638F(1960511525);
            InterfaceC4360K9.InterfaceC4363c m99138h = c4361a.m99138h();
            interfaceC32720Et04.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, interfaceC32720Et04, 48);
            interfaceC32720Et04.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) interfaceC32720Et04.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) interfaceC32720Et04.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) interfaceC32720Et04.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(c20912a4);
            if (!(interfaceC32720Et04.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et04.mo89557h();
            if (interfaceC32720Et04.mo89521t()) {
                interfaceC32720Et04.mo89617M(m113415a3);
            } else {
                interfaceC32720Et04.mo89566e();
            }
            interfaceC32720Et04.mo89620L();
            InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(interfaceC32720Et04);
            C38680bf6.m64191b(m64192a3, m74813a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
            C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
            C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
            interfaceC32720Et04.mo89530q();
            m115273a3.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et04)), interfaceC32720Et04, 0);
            interfaceC32720Et04.mo89638F(2058660585);
            interfaceC32720Et04.mo89638F(-678309503);
            C38066ad5 c38066ad5 = C38066ad5.f50835a;
            interfaceC32720Et04.mo89638F(-1576911820);
            c20912a2 = c20912a4;
            EX2 ex24 = ex2;
            C38909c26.m62000e(selectedItemLabel, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et04, 0, 0, 65530);
            if (!z2) {
                DP1.m110533b(C46748pE3.m19793d(C19423R.C19424drawable.ic_chevron_down, interfaceC32720Et04, 0), null, BB5.m114254o(c20912a2, C43705k61.m29303g(24)), StripeThemeKt.getStripeColors(tm23, interfaceC32720Et04, i6).m116699getPlaceholderText0d7_KjU(), interfaceC32720Et04, 440, 0);
            }
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89563f();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            ex22 = ex24;
            i4 = i6;
            tm22 = tm23;
            interfaceC41563gV23 = interfaceC41563gV24;
        } else {
            interfaceC32720Et04.mo89638F(1960512200);
            InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a4, 0.0f, 1, null);
            interfaceC32720Et04.mo89638F(693286680);
            C25777lo c25777lo = C25777lo.f96729a;
            InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(c25777lo.m26803f(), c4361a.m99135k(), interfaceC32720Et04, 0);
            interfaceC32720Et04.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g014 = (InterfaceC41273g01) interfaceC32720Et04.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm24 = (EnumC47065pm2) interfaceC32720Et04.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq64 = (InterfaceC33869Jq6) interfaceC32720Et04.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a4 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a4 = C31723Am2.m115273a(m114255n);
            if (!(interfaceC32720Et04.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et04.mo89557h();
            if (interfaceC32720Et04.mo89521t()) {
                interfaceC32720Et04.mo89617M(m113415a4);
            } else {
                interfaceC32720Et04.mo89566e();
            }
            interfaceC32720Et04.mo89620L();
            InterfaceC32720Et0 m64192a4 = C38680bf6.m64192a(interfaceC32720Et04);
            C38680bf6.m64191b(m64192a4, m74813a2, c0757a.m113412d());
            C38680bf6.m64191b(m64192a4, interfaceC41273g014, c0757a.m113414b());
            C38680bf6.m64191b(m64192a4, enumC47065pm24, c0757a.m113413c());
            C38680bf6.m64191b(m64192a4, interfaceC33869Jq64, c0757a.m113410f());
            interfaceC32720Et04.mo89530q();
            m115273a4.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et04)), interfaceC32720Et04, 0);
            interfaceC32720Et04.mo89638F(2058660585);
            interfaceC32720Et04.mo89638F(-678309503);
            C38066ad5 c38066ad52 = C38066ad5.f50835a;
            interfaceC32720Et04.mo89638F(-736924291);
            InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a4, C43705k61.m29303g(16), C43705k61.m29303g(4), 0.0f, C43705k61.m29303g(8), 4, null);
            interfaceC32720Et04.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), interfaceC32720Et04, 0);
            interfaceC32720Et04.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g015 = (InterfaceC41273g01) interfaceC32720Et04.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm25 = (EnumC47065pm2) interfaceC32720Et04.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq65 = (InterfaceC33869Jq6) interfaceC32720Et04.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a5 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a5 = C31723Am2.m115273a(m94180m);
            if (!(interfaceC32720Et04.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et04.mo89557h();
            if (interfaceC32720Et04.mo89521t()) {
                interfaceC32720Et04.mo89617M(m113415a5);
            } else {
                interfaceC32720Et04.mo89566e();
            }
            interfaceC32720Et04.mo89620L();
            InterfaceC32720Et0 m64192a5 = C38680bf6.m64192a(interfaceC32720Et04);
            C38680bf6.m64191b(m64192a5, m91546a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a5, interfaceC41273g015, c0757a.m113414b());
            C38680bf6.m64191b(m64192a5, enumC47065pm25, c0757a.m113413c());
            C38680bf6.m64191b(m64192a5, interfaceC33869Jq65, c0757a.m113410f());
            interfaceC32720Et04.mo89530q();
            m115273a5.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et04)), interfaceC32720Et04, 0);
            interfaceC32720Et04.mo89638F(2058660585);
            interfaceC32720Et04.mo89638F(-1163856341);
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            interfaceC32720Et04.mo89638F(1163332979);
            Integer DropDown$lambda$0 = DropDown$lambda$0(m105206a);
            interfaceC32720Et04.mo89638F(-1005215452);
            if (DropDown$lambda$0 == null) {
                c20912a = c20912a4;
                i4 = i6;
                tm2 = tm23;
                i5 = 0;
                interfaceC32720Et03 = interfaceC32720Et04;
                interfaceC41563gV23 = interfaceC41563gV24;
                c = 61956;
            } else {
                String m41310c2 = C40946fS5.m41310c(DropDown$lambda$0.intValue(), interfaceC32720Et04, 0);
                c20912a = c20912a4;
                c = 61956;
                i4 = i6;
                tm2 = tm23;
                i5 = 0;
                interfaceC41563gV23 = interfaceC41563gV24;
                interfaceC32720Et03 = interfaceC32720Et04;
                FormLabelKt.FormLabel(m41310c2, null, z3, interfaceC32720Et04, 0, 2);
                Unit unit = Unit.INSTANCE;
            }
            interfaceC32720Et03.mo89605Q();
            InterfaceC41563gV2 m114256m = BB5.m114256m(c20912a, 0.9f);
            InterfaceC4360K9.InterfaceC4363c m99145a = c4361a.m99145a();
            interfaceC32720Et03.mo89638F(693286680);
            InterfaceC51579xO2 m74813a3 = C37252Yc5.m74813a(c25777lo.m26803f(), m99145a, interfaceC32720Et03, 48);
            interfaceC32720Et03.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g016 = (InterfaceC41273g01) interfaceC32720Et03.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm26 = (EnumC47065pm2) interfaceC32720Et03.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq66 = (InterfaceC33869Jq6) interfaceC32720Et03.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a6 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a6 = C31723Am2.m115273a(m114256m);
            if (!(interfaceC32720Et03.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et03.mo89557h();
            if (interfaceC32720Et03.mo89521t()) {
                interfaceC32720Et03.mo89617M(m113415a6);
            } else {
                interfaceC32720Et03.mo89566e();
            }
            interfaceC32720Et03.mo89620L();
            InterfaceC32720Et0 m64192a6 = C38680bf6.m64192a(interfaceC32720Et03);
            C38680bf6.m64191b(m64192a6, m74813a3, c0757a.m113412d());
            C38680bf6.m64191b(m64192a6, interfaceC41273g016, c0757a.m113414b());
            C38680bf6.m64191b(m64192a6, enumC47065pm26, c0757a.m113413c());
            C38680bf6.m64191b(m64192a6, interfaceC33869Jq66, c0757a.m113410f());
            interfaceC32720Et03.mo89530q();
            m115273a6.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et03)), interfaceC32720Et03, Integer.valueOf(i5));
            interfaceC32720Et03.mo89638F(2058660585);
            interfaceC32720Et03.mo89638F(-678309503);
            interfaceC32720Et03.mo89638F(-361477417);
            interfaceC32720Et04 = interfaceC32720Et03;
            tm22 = tm2;
            c20912a2 = c20912a;
            ex22 = ex2;
            C38909c26.m62000e(selectedItemLabel, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et04, 0, 0, 65530);
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89563f();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89563f();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            if (!z2) {
                InterfaceC41563gV2 mo70992c = c38066ad52.mo70992c(c20912a2, c4361a.m99138h());
                interfaceC32720Et04.mo89638F(-483455358);
                int i7 = i5;
                InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), interfaceC32720Et04, i7);
                interfaceC32720Et04.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g017 = (InterfaceC41273g01) interfaceC32720Et04.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm27 = (EnumC47065pm2) interfaceC32720Et04.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq67 = (InterfaceC33869Jq6) interfaceC32720Et04.mo89572c(C42399hu0.m35602q());
                Function0<InterfaceC32018Bt0> m113415a7 = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a7 = C31723Am2.m115273a(mo70992c);
                if (!(interfaceC32720Et04.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                interfaceC32720Et04.mo89557h();
                if (interfaceC32720Et04.mo89521t()) {
                    interfaceC32720Et04.mo89617M(m113415a7);
                } else {
                    interfaceC32720Et04.mo89566e();
                }
                interfaceC32720Et04.mo89620L();
                InterfaceC32720Et0 m64192a7 = C38680bf6.m64192a(interfaceC32720Et04);
                C38680bf6.m64191b(m64192a7, m91546a2, c0757a.m113412d());
                C38680bf6.m64191b(m64192a7, interfaceC41273g017, c0757a.m113414b());
                C38680bf6.m64191b(m64192a7, enumC47065pm27, c0757a.m113413c());
                C38680bf6.m64191b(m64192a7, interfaceC33869Jq67, c0757a.m113410f());
                interfaceC32720Et04.mo89530q();
                m115273a7.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et04)), interfaceC32720Et04, Integer.valueOf(i7));
                interfaceC32720Et04.mo89638F(2058660585);
                interfaceC32720Et04.mo89638F(-1163856341);
                interfaceC32720Et04.mo89638F(1263107086);
                DP1.m110533b(C46748pE3.m19793d(C19423R.C19424drawable.ic_chevron_down, interfaceC32720Et04, i7), null, BB5.m114254o(c20912a2, C43705k61.m29303g(24)), j, interfaceC32720Et04, 440, 0);
                interfaceC32720Et04.mo89605Q();
                interfaceC32720Et04.mo89605Q();
                interfaceC32720Et04.mo89605Q();
                interfaceC32720Et04.mo89563f();
                interfaceC32720Et04.mo89605Q();
                interfaceC32720Et04.mo89605Q();
            }
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89563f();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
            interfaceC32720Et04.mo89605Q();
        }
        interfaceC32720Et04.mo89605Q();
        interfaceC32720Et04.mo89605Q();
        interfaceC32720Et04.mo89605Q();
        interfaceC32720Et04.mo89563f();
        interfaceC32720Et04.mo89605Q();
        interfaceC32720Et04.mo89605Q();
        boolean DropDown$lambda$3 = DropDown$lambda$3(ex22);
        interfaceC32720Et04.mo89638F(1157296644);
        EX2 ex25 = ex22;
        boolean mo89539n2 = interfaceC32720Et04.mo89539n(ex25);
        Object mo89635G4 = interfaceC32720Et04.mo89635G();
        if (mo89539n2 || mo89635G4 == c2012a.m108267a()) {
            mo89635G4 = new DropdownFieldUIKt$DropDown$1$4$1(ex25);
            interfaceC32720Et04.mo89503z(mo89635G4);
        }
        interfaceC32720Et04.mo89605Q();
        InterfaceC32720Et0 interfaceC32720Et05 = interfaceC32720Et04;
        C19808dd.m44013a(DropDown$lambda$3, (Function0) mo89635G4, BB5.m114248u(BB5.m114273A(C13342bw.m62124d(c20912a2, StripeThemeKt.getStripeColors(tm22, interfaceC32720Et04, i4).m116695getComponent0d7_KjU(), null, 2, null), DropdownMenuItemDefaultMaxWidth), 0.0f, 0.0f, 0.0f, C43705k61.m29303g(DropdownMenuItemDefaultMinHeight * 8.9f), 7, null), 0L, null, C43575jt0.m29791b(interfaceC32720Et05, -1670751007, true, new DropdownFieldUIKt$DropDown$1$5(displayItems, j, m105206a2, controller, ex25)), interfaceC32720Et05, ImageMetadata.EDGE_MODE, 24);
        interfaceC32720Et05.mo89605Q();
        interfaceC32720Et05.mo89605Q();
        interfaceC32720Et05.mo89605Q();
        interfaceC32720Et05.mo89563f();
        interfaceC32720Et05.mo89605Q();
        interfaceC32720Et05.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et05.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new DropdownFieldUIKt$DropDown$2(controller, z, interfaceC41563gV23, i, i2));
    }

    private static final Integer DropDown$lambda$0(InterfaceC48627sP5<Integer> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int DropDown$lambda$1(InterfaceC48627sP5<Integer> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().intValue();
    }

    private static final boolean DropDown$lambda$3(EX2<Boolean> ex2) {
        return ex2.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DropDown$lambda$4(EX2<Boolean> ex2, boolean z) {
        ex2.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DropDownPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1234776829);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1234776829, i, -1, "com.stripe.android.uicore.elements.DropDownPreview (DropdownFieldUI.kt:45)");
            }
            DropDown(new DropdownFieldController(new CountryConfig(null, null, true, false, null, null, 59, null), null, 2, null), true, null, mo89518u, 56, 4);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new DropdownFieldUIKt$DropDownPreview$1(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: DropdownMenuItem-cf5BqRc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116734DropdownMenuItemcf5BqRc(String displayValue, boolean z, long j, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        int i8;
        DropdownFieldUIKt$DropdownMenuItem$1 dropdownFieldUIKt$DropdownMenuItem$1;
        boolean mo89539n;
        Object mo89635G;
        long j2;
        C33918Jw1 m99540d;
        InterfaceC32720Et0 interfaceC32720Et02;
        Function0<Unit> function02;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(30068389);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(displayValue)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89524s(j)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
            i7 = i2 & 8;
            if (i7 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                obj = function0;
                if (mo89518u.mo89539n(obj)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
                if ((i3 & 5851) != 1170 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    Function0<Unit> function03 = obj;
                    interfaceC32720Et02 = mo89518u;
                    function02 = function03;
                } else {
                    if (i7 != 0) {
                        dropdownFieldUIKt$DropdownMenuItem$1 = DropdownFieldUIKt$DropdownMenuItem$1.INSTANCE;
                    } else {
                        dropdownFieldUIKt$DropdownMenuItem$1 = obj;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(30068389, i3, -1, "com.stripe.android.uicore.elements.DropdownMenuItem (DropdownFieldUI.kt:190)");
                    }
                    InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
                    C25777lo.InterfaceC25781d m26803f = C25777lo.f96729a.m26803f();
                    InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                    InterfaceC41563gV2 m114248u = BB5.m114248u(BB5.m114255n(c20912a, 0.0f, 1, null), 0.0f, DropdownMenuItemDefaultMinHeight, 0.0f, 0.0f, 13, null);
                    mo89539n = mo89518u.mo89539n(dropdownFieldUIKt$DropdownMenuItem$1);
                    mo89635G = mo89518u.mo89635G();
                    if (!mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                        mo89635G = new DropdownFieldUIKt$DropdownMenuItem$2$1(dropdownFieldUIKt$DropdownMenuItem$1);
                        mo89518u.mo89503z(mo89635G);
                    }
                    InterfaceC41563gV2 m70814e = C38131ak0.m70814e(m114248u, false, null, null, (Function0) mo89635G, 7, null);
                    mo89518u.mo89638F(693286680);
                    InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26803f, m99138h, mo89518u, 54);
                    mo89518u.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m70814e);
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
                    mo89518u.mo89638F(416616457);
                    InterfaceC41563gV2 m114256m = BB5.m114256m(ND3.m94180m(c20912a, C43705k61.m29303g(13), 0.0f, 0.0f, 0.0f, 14, null), 0.8f);
                    if (z) {
                        j2 = TM2.f35372a.m83731a(mo89518u, TM2.f35373b).m94900j();
                    } else {
                        j2 = j;
                    }
                    if (z) {
                        m99540d = C33918Jw1.f18784c.m99543a();
                    } else {
                        m99540d = C33918Jw1.f18784c.m99540d();
                    }
                    Function0<Unit> function04 = dropdownFieldUIKt$DropdownMenuItem$1;
                    C38909c26.m62000e(displayValue, m114256m, j2, 0L, null, m99540d, null, 0L, null, null, 0L, 0, false, 0, null, null, mo89518u, (i3 & 14) | 48, 0, 65496);
                    if (z) {
                        interfaceC32720Et02 = mo89518u;
                        DP1.m110534a(C45837ni0.m23289a(EP1.C1822a.f7416a), null, BB5.m114254o(c20912a, C43705k61.m29303g(24)), TM2.f35372a.m83731a(interfaceC32720Et02, TM2.f35373b).m94900j(), interfaceC32720Et02, 432, 0);
                    } else {
                        interfaceC32720Et02 = mo89518u;
                    }
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89563f();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    function02 = function04;
                }
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new DropdownFieldUIKt$DropdownMenuItem$4(displayValue, z, j, function02, i, i2));
                    return;
                }
                return;
            }
            obj = function0;
            if ((i3 & 5851) != 1170) {
            }
            if (i7 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            InterfaceC4360K9.InterfaceC4363c m99138h2 = InterfaceC4360K9.f19170a.m99138h();
            C25777lo.InterfaceC25781d m26803f2 = C25777lo.f96729a.m26803f();
            InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m114248u2 = BB5.m114248u(BB5.m114255n(c20912a2, 0.0f, 1, null), 0.0f, DropdownMenuItemDefaultMinHeight, 0.0f, 0.0f, 13, null);
            mo89539n = mo89518u.mo89539n(dropdownFieldUIKt$DropdownMenuItem$1);
            mo89635G = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G = new DropdownFieldUIKt$DropdownMenuItem$2$1(dropdownFieldUIKt$DropdownMenuItem$1);
            mo89518u.mo89503z(mo89635G);
            InterfaceC41563gV2 m70814e2 = C38131ak0.m70814e(m114248u2, false, null, null, (Function0) mo89635G, 7, null);
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(m26803f2, m99138h2, mo89518u, 54);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m70814e2);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2, m74813a2, c0757a2.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            C38066ad5 c38066ad52 = C38066ad5.f50835a;
            mo89518u.mo89638F(416616457);
            InterfaceC41563gV2 m114256m2 = BB5.m114256m(ND3.m94180m(c20912a2, C43705k61.m29303g(13), 0.0f, 0.0f, 0.0f, 14, null), 0.8f);
            if (z) {
            }
            if (z) {
            }
            Function0<Unit> function042 = dropdownFieldUIKt$DropdownMenuItem$1;
            C38909c26.m62000e(displayValue, m114256m2, j2, 0L, null, m99540d, null, 0L, null, null, 0L, 0, false, 0, null, null, mo89518u, (i3 & 14) | 48, 0, 65496);
            if (z) {
            }
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89563f();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            if (C35528Qt0.m87827O()) {
            }
            function02 = function042;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w != null) {
            }
        }
        i7 = i2 & 8;
        if (i7 == 0) {
        }
        obj = function0;
        if ((i3 & 5851) != 1170) {
        }
        if (i7 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        InterfaceC4360K9.InterfaceC4363c m99138h22 = InterfaceC4360K9.f19170a.m99138h();
        C25777lo.InterfaceC25781d m26803f22 = C25777lo.f96729a.m26803f();
        InterfaceC41563gV2.C20912a c20912a22 = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m114248u22 = BB5.m114248u(BB5.m114255n(c20912a22, 0.0f, 1, null), 0.0f, DropdownMenuItemDefaultMinHeight, 0.0f, 0.0f, 13, null);
        mo89539n = mo89518u.mo89539n(dropdownFieldUIKt$DropdownMenuItem$1);
        mo89635G = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G = new DropdownFieldUIKt$DropdownMenuItem$2$1(dropdownFieldUIKt$DropdownMenuItem$1);
        mo89518u.mo89503z(mo89635G);
        InterfaceC41563gV2 m70814e22 = C38131ak0.m70814e(m114248u22, false, null, null, (Function0) mo89635G, 7, null);
        mo89518u.mo89638F(693286680);
        InterfaceC51579xO2 m74813a22 = C37252Yc5.m74813a(m26803f22, m99138h22, mo89518u, 54);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a22 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a22 = c0757a22.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22 = C31723Am2.m115273a(m70814e22);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a22, m74813a22, c0757a22.m113412d());
        C38680bf6.m64191b(m64192a22, interfaceC41273g0122, c0757a22.m113414b());
        C38680bf6.m64191b(m64192a22, enumC47065pm222, c0757a22.m113413c());
        C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a22.m113410f());
        mo89518u.mo89530q();
        m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-678309503);
        C38066ad5 c38066ad522 = C38066ad5.f50835a;
        mo89518u.mo89638F(416616457);
        InterfaceC41563gV2 m114256m22 = BB5.m114256m(ND3.m94180m(c20912a22, C43705k61.m29303g(13), 0.0f, 0.0f, 0.0f, 14, null), 0.8f);
        if (z) {
        }
        if (z) {
        }
        Function0<Unit> function0422 = dropdownFieldUIKt$DropdownMenuItem$1;
        C38909c26.m62000e(displayValue, m114256m22, j2, 0L, null, m99540d, null, 0L, null, null, 0L, 0, false, 0, null, null, mo89518u, (i3 & 14) | 48, 0, 65496);
        if (z) {
        }
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89563f();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        function02 = function0422;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
        }
    }

    public static final float getDropdownMenuItemDefaultMaxWidth() {
        return DropdownMenuItemDefaultMaxWidth;
    }

    public static final float getDropdownMenuItemDefaultMinHeight() {
        return DropdownMenuItemDefaultMinHeight;
    }
}
