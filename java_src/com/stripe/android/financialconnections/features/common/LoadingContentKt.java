package com.stripe.android.financialconnections.features.common;

import androidx.compose.p003ui.graphics.C11327b;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC37727a30;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m28432d2 = {"Lkotlin/Function1;", "La30;", "", "content", "LoadingShimmerEffect", "(Lkotlin/jvm/functions/Function3;LEt0;I)V", "LgV2;", "modifier", "", "title", "LoadingContent", "(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V", "LoadingSpinner", "(LEt0;I)V", "LoadingSpinnerPreview", "", "LOADING_SPINNER_ROTATION_MS", "I", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLoadingContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingContent.kt\ncom/stripe/android/financialconnections/features/common/LoadingContentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,111:1\n154#2:112\n154#2:146\n154#2:147\n154#2:148\n74#3,6:113\n80#3:145\n84#3:153\n75#4:119\n76#4,11:121\n89#4:152\n76#5:120\n460#6,13:132\n473#6,3:149\n36#6:154\n1057#7,6:155\n76#8:161\n*S KotlinDebug\n*F\n+ 1 LoadingContent.kt\ncom/stripe/android/financialconnections/features/common/LoadingContentKt\n*L\n66#1:112\n68#1:146\n71#1:147\n78#1:148\n64#1:113,6\n64#1:145\n64#1:153\n64#1:119\n64#1:121,11\n64#1:152\n64#1:120\n64#1:132,13\n64#1:149,3\n99#1:154\n99#1:155,6\n90#1:161\n*E\n"})
/* loaded from: classes7.dex */
public final class LoadingContentKt {
    private static final int LOADING_SPINNER_ROTATION_MS = 1000;

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadingContent(InterfaceC41563gV2 interfaceC41563gV2, String str, String str2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        Object obj2;
        int i5;
        int i6;
        Object obj3;
        int i7;
        int i8;
        InterfaceC41563gV2 interfaceC41563gV22;
        Object obj4;
        Object obj5;
        InterfaceC41563gV2 interfaceC41563gV23;
        int i9;
        int i10;
        String str3;
        String str4;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(311508354);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            obj = interfaceC41563gV2;
        } else if ((i & 14) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = interfaceC41563gV2;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj2 = str;
            if (mo89518u.mo89539n(obj2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i2 & 4;
            if (i6 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj3 = str2;
                if (mo89518u.mo89539n(obj3)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                i8 = i3;
                if ((i8 & 731) != 146 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    str3 = obj2;
                    str4 = obj3;
                } else {
                    if (i11 != 0) {
                        interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
                    } else {
                        interfaceC41563gV22 = obj;
                    }
                    if (i12 != 0) {
                        obj4 = null;
                    } else {
                        obj4 = obj2;
                    }
                    if (i6 != 0) {
                        obj5 = null;
                    } else {
                        obj5 = obj3;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(311508354, i8, -1, "com.stripe.android.financialconnections.features.common.LoadingContent (LoadingContent.kt:58)");
                    }
                    InterfaceC41563gV2 m94182k = ND3.m94182k(interfaceC41563gV22, C43705k61.m29303g(24), 0.0f, 2, null);
                    mo89518u.mo89638F(-483455358);
                    InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
                    mo89518u.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94182k);
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
                    C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
                    C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                    C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                    C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                    mo89518u.mo89530q();
                    m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                    mo89518u.mo89638F(2058660585);
                    mo89518u.mo89638F(-1163856341);
                    C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
                    mo89518u.mo89638F(-1319790344);
                    InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                    DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(8)), mo89518u, 6);
                    LoadingSpinner(mo89518u, 0);
                    mo89518u.mo89638F(797875328);
                    if (obj4 != null) {
                        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(16)), mo89518u, 6);
                        i10 = i8;
                        interfaceC41563gV23 = interfaceC41563gV22;
                        i9 = 6;
                        C38909c26.m62000e(obj4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, FinancialConnectionsTheme.INSTANCE.getTypography(mo89518u, 6).getSubtitle(), mo89518u, (i10 >> 3) & 14, 0, 32766);
                    } else {
                        interfaceC41563gV23 = interfaceC41563gV22;
                        i9 = 6;
                        i10 = i8;
                    }
                    mo89518u.mo89605Q();
                    if (obj5 != null) {
                        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(16)), mo89518u, i9);
                        C38909c26.m62000e(obj5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, FinancialConnectionsTheme.INSTANCE.getTypography(mo89518u, i9).getBody(), mo89518u, (i10 >> 6) & 14, 0, 32766);
                    }
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    mo89518u.mo89563f();
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    obj = interfaceC41563gV23;
                    str3 = obj4;
                    str4 = obj5;
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new LoadingContentKt$LoadingContent$2(obj, str3, str4, i, i2));
                    return;
                }
                return;
            }
            obj3 = str2;
            i8 = i3;
            if ((i8 & 731) != 146) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i6 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            InterfaceC41563gV2 m94182k2 = ND3.m94182k(interfaceC41563gV22, C43705k61.m29303g(24), 0.0f, 2, null);
            mo89518u.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94182k2);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2, m91546a2, c0757a2.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-1163856341);
            C35465Qm0 c35465Qm02 = C35465Qm0.f30887a;
            mo89518u.mo89638F(-1319790344);
            InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
            DN5.m110552a(BB5.m114246w(c20912a2, C43705k61.m29303g(8)), mo89518u, 6);
            LoadingSpinner(mo89518u, 0);
            mo89518u.mo89638F(797875328);
            if (obj4 != null) {
            }
            mo89518u.mo89605Q();
            if (obj5 != null) {
            }
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
            }
            obj = interfaceC41563gV23;
            str3 = obj4;
            str4 = obj5;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        obj2 = str;
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        obj3 = str2;
        i8 = i3;
        if ((i8 & 731) != 146) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i6 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        InterfaceC41563gV2 m94182k22 = ND3.m94182k(interfaceC41563gV22, C43705k61.m29303g(24), 0.0f, 2, null);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a22 = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a22 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a22 = c0757a22.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22 = C31723Am2.m115273a(m94182k22);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a22, m91546a22, c0757a22.m113412d());
        C38680bf6.m64191b(m64192a22, interfaceC41273g0122, c0757a22.m113414b());
        C38680bf6.m64191b(m64192a22, enumC47065pm222, c0757a22.m113413c());
        C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a22.m113410f());
        mo89518u.mo89530q();
        m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm022 = C35465Qm0.f30887a;
        mo89518u.mo89638F(-1319790344);
        InterfaceC41563gV2.C20912a c20912a22 = InterfaceC41563gV2.f82354b0;
        DN5.m110552a(BB5.m114246w(c20912a22, C43705k61.m29303g(8)), mo89518u, 6);
        LoadingSpinner(mo89518u, 0);
        mo89518u.mo89638F(797875328);
        if (obj4 != null) {
        }
        mo89518u.mo89605Q();
        if (obj5 != null) {
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        obj = interfaceC41563gV23;
        str3 = obj4;
        str4 = obj5;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    public static final void LoadingShimmerEffect(Function3<? super AbstractC37727a30, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        List listOf;
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-833932477);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(content)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-833932477, i2, -1, "com.stripe.android.financialconnections.features.common.LoadingShimmerEffect (LoadingContent.kt:27)");
            }
            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C47063pm0[]{C47063pm0.m18747i(financialConnectionsTheme.getColors(mo89518u, 6).m116460getBackgroundContainer0d7_KjU()), C47063pm0.m18747i(financialConnectionsTheme.getColors(mo89518u, 6).m116476getTextWhite0d7_KjU()), C47063pm0.m18747i(financialConnectionsTheme.getColors(mo89518u, 6).m116460getBackgroundContainer0d7_KjU())});
            InterfaceC48627sP5 m99353a = K12.m99353a(K12.m99349e(mo89518u, 0), 0.0f, 1000.0f, C26160mf.m25226d(C26160mf.m25219k(1000, 0, C42549i91.m34396a(), 2, null), null, 0L, 6, null), mo89518u, (I12.f14339d << 9) | J12.f16588f | 432);
            content.invoke(AbstractC37727a30.C10553a.m71951b(AbstractC37727a30.f49755b, listOf, C33056Ge3.m104938a(200.0f, 200.0f), C33056Ge3.m104938a(((Number) m99353a.getValue()).floatValue(), ((Number) m99353a.getValue()).floatValue()), 0, 8, null), mo89518u, Integer.valueOf((i2 << 3) & 112));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LoadingContentKt$LoadingShimmerEffect$1(content, i));
        }
    }

    public static final void LoadingSpinner(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(701834379);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(701834379, i, -1, "com.stripe.android.financialconnections.features.common.LoadingSpinner (LoadingContent.kt:87)");
            }
            InterfaceC48627sP5 m99353a = K12.m99353a(K12.m99349e(mo89518u, 0), 0.0f, 360.0f, C26160mf.m25226d(C26160mf.m25219k(1000, 0, null, 6, null), null, 0L, 6, null), mo89518u, (I12.f14339d << 9) | J12.f16588f | 432);
            AbstractC45562nE3 m19793d = C46748pE3.m19793d(C18634R.C18635drawable.stripe_ic_loading_spinner, mo89518u, 0);
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(m99353a);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new LoadingContentKt$LoadingSpinner$1$1(m99353a);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            C51659xX1.m5069a(m19793d, "Loading spinner.", C11327b.m68714a(c20912a, (Function1) mo89635G), null, null, 0.0f, null, mo89518u, 56, 120);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LoadingContentKt$LoadingSpinner$2(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LoadingSpinner$lambda$1(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    public static final void LoadingSpinnerPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1954745767);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1954745767, i, -1, "com.stripe.android.financialconnections.features.common.LoadingSpinnerPreview (LoadingContent.kt:107)");
            }
            LoadingSpinner(mo89518u, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LoadingContentKt$LoadingSpinnerPreview$1(i));
        }
    }
}
