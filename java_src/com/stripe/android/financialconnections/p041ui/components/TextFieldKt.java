package com.stripe.android.financialconnections.p041ui.components;

import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a¥\u0001\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0004H\u0000\u001a5\u0010\u001d\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001e\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"LF16;", "value", "LgV2;", "modifier", "Lkotlin/Function1;", "", "onValueChange", "", "readOnly", "isError", "Lbl2;", "keyboardOptions", "Lkotlin/Function0;", "placeholder", "LEu6;", "visualTransformation", "trailingIcon", "leadingIcon", "label", "FinancialConnectionsOutlinedTextField", "(LF16;LgV2;Lkotlin/jvm/functions/Function1;ZZLbl2;Lkotlin/jvm/functions/Function2;LEu6;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;III)V", "", "predicate", "filtered", "Ls26;", "", Entry.TYPE_TEXT, "adjustForFilter-8ffj60Q", "(JLjava/lang/String;Lkotlin/jvm/functions/Function1;)J", "adjustForFilter", "FinancialConnectionsOutlinedTextFieldPreview", "(LEt0;I)V", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\ncom/stripe/android/financialconnections/ui/components/TextFieldKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,90:1\n154#2:91\n429#3:92\n502#3,5:93\n1099#3,3:98\n1099#3,3:101\n*S KotlinDebug\n*F\n+ 1 TextField.kt\ncom/stripe/android/financialconnections/ui/components/TextFieldKt\n*L\n38#1:91\n68#1:92\n68#1:93,5\n77#1:98,3\n78#1:101,3\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.ui.components.TextFieldKt */
/* loaded from: classes7.dex */
public final class TextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FinancialConnectionsOutlinedTextField(F16 value, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super F16, Unit> onValueChange, boolean z, boolean z2, C38736bl2 c38736bl2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, InterfaceC32735Eu6 interfaceC32735Eu6, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C38736bl2 c38736bl22;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function25;
        InterfaceC32735Eu6 interfaceC32735Eu62;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function26;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function27;
        boolean z4;
        boolean z5;
        C38736bl2 c38736bl23;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function28;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV23;
        boolean z6;
        boolean z7;
        C38736bl2 c38736bl24;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function29;
        InterfaceC32735Eu6 interfaceC32735Eu63;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function210;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function211;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function212;
        InterfaceC36874Wm5 mo89512w;
        int i14;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1885705739);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (mo89518u.mo89539n(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= mo89518u.mo89539n(interfaceC41563gV2) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 896) == 0) {
                i4 |= mo89518u.mo89539n(onValueChange) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= mo89518u.mo89536o(z) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z2;
                    i4 |= mo89518u.mo89536o(z3) ? 16384 : 8192;
                    if ((458752 & i) == 0) {
                        if ((i3 & 32) == 0 && mo89518u.mo89539n(c38736bl2)) {
                            i14 = DateUtils.FORMAT_NUMERIC_DATE;
                            i4 |= i14;
                        }
                        i14 = 65536;
                        i4 |= i14;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= mo89518u.mo89539n(function2) ? 1048576 : 524288;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= mo89518u.mo89539n(interfaceC32735Eu6) ? 8388608 : 4194304;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= mo89518u.mo89539n(function22) ? 67108864 : 33554432;
                    }
                    i10 = i3 & 512;
                    if (i10 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= mo89518u.mo89539n(function23) ? 536870912 : 268435456;
                    }
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i13 = i2 | 6;
                    } else if ((i2 & 14) != 0) {
                        i12 = i2;
                        if ((i4 & 1533916891) != 306783378 && (i12 & 11) == 2 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            interfaceC41563gV23 = interfaceC41563gV2;
                            z6 = z;
                            c38736bl24 = c38736bl2;
                            function29 = function2;
                            function210 = function22;
                            function211 = function23;
                            function212 = function24;
                            interfaceC32720Et02 = mo89518u;
                            z7 = z3;
                            interfaceC32735Eu63 = interfaceC32735Eu6;
                        } else {
                            mo89518u.mo89626J();
                            if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                                mo89518u.mo89548k();
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                interfaceC41563gV22 = interfaceC41563gV2;
                                z4 = z;
                                c38736bl23 = c38736bl2;
                                function28 = function2;
                                interfaceC32735Eu62 = interfaceC32735Eu6;
                                function26 = function22;
                                function27 = function23;
                                function25 = function24;
                                z5 = z3;
                            } else {
                                InterfaceC41563gV2 interfaceC41563gV24 = i15 != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                                boolean z8 = i5 != 0 ? false : z;
                                boolean z9 = i6 == 0 ? z3 : false;
                                if ((i3 & 32) != 0) {
                                    c38736bl22 = C38736bl2.f58036e.m64037a();
                                    i4 &= -458753;
                                } else {
                                    c38736bl22 = c38736bl2;
                                }
                                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function213 = i7 != 0 ? null : function2;
                                InterfaceC32735Eu6 m108216a = i8 != 0 ? InterfaceC32735Eu6.f8291a.m108216a() : interfaceC32735Eu6;
                                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function214 = i9 != 0 ? null : function22;
                                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function215 = i10 != 0 ? null : function23;
                                if (i11 != 0) {
                                    interfaceC32735Eu62 = m108216a;
                                    function26 = function214;
                                    function27 = function215;
                                    z4 = z8;
                                    z5 = z9;
                                    function25 = null;
                                } else {
                                    function25 = function24;
                                    interfaceC32735Eu62 = m108216a;
                                    function26 = function214;
                                    function27 = function215;
                                    z4 = z8;
                                    z5 = z9;
                                }
                                c38736bl23 = c38736bl22;
                                function28 = function213;
                                interfaceC41563gV22 = interfaceC41563gV24;
                            }
                            mo89518u.mo89650B();
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(-1885705739, i4, i12, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:23)");
                            }
                            C38649bc5 m61172d = C39242cc5.m61172d(C43705k61.m29303g(8));
                            InterfaceC41563gV2 m114255n = BB5.m114255n(interfaceC41563gV22, 0.0f, 1, null);
                            C31686Ai1 c31686Ai1 = C31686Ai1.f965a;
                            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
                            long m116469getTextBrand0d7_KjU = financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU();
                            long m116462getBorderDefault0d7_KjU = financialConnectionsTheme.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU();
                            long m116471getTextDisabled0d7_KjU = financialConnectionsTheme.getColors(mo89518u, 6).m116471getTextDisabled0d7_KjU();
                            long m116474getTextSecondary0d7_KjU = financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU();
                            int i16 = i4 >> 3;
                            int i17 = i4 << 3;
                            InterfaceC41563gV2 interfaceC41563gV25 = interfaceC41563gV22;
                            interfaceC32720Et02 = mo89518u;
                            C35351Pz3.m89192b(value, onValueChange, m114255n, false, z4, null, function25, function28, function27, function26, z5, interfaceC32735Eu62, c38736bl23, null, false, 0, null, m61172d, c31686Ai1.m115380a(0L, 0L, 0L, financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), financialConnectionsTheme.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), m116469getTextBrand0d7_KjU, m116462getBorderDefault0d7_KjU, m116471getTextDisabled0d7_KjU, financialConnectionsTheme.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, 0L, 0L, financialConnectionsTheme.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU(), financialConnectionsTheme.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU(), 0L, financialConnectionsTheme.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), m116474getTextSecondary0d7_KjU, 0L, financialConnectionsTheme.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, 0L, mo89518u, 0, 0, C31686Ai1.f966b << 6, 3427847), interfaceC32720Et02, (i4 & 14) | (i16 & 112) | (i17 & 57344) | ((i12 << 18) & 3670016) | (i17 & 29360128) | (i16 & 234881024) | (i17 & 1879048192), ((i4 >> 12) & 14) | ((i4 >> 18) & 112) | ((i4 >> 9) & 896), 122920);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            interfaceC41563gV23 = interfaceC41563gV25;
                            z6 = z4;
                            z7 = z5;
                            c38736bl24 = c38736bl23;
                            function29 = function28;
                            interfaceC32735Eu63 = interfaceC32735Eu62;
                            function210 = function26;
                            function211 = function27;
                            function212 = function25;
                        }
                        mo89512w = interfaceC32720Et02.mo89512w();
                        if (mo89512w == null) {
                            return;
                        }
                        mo89512w.mo20405a(new TextFieldKt$FinancialConnectionsOutlinedTextField$1(value, interfaceC41563gV23, onValueChange, z6, z7, c38736bl24, function29, interfaceC32735Eu63, function210, function211, function212, i, i2, i3));
                        return;
                    } else {
                        i13 = i2 | (mo89518u.mo89539n(function24) ? 4 : 2);
                    }
                    i12 = i13;
                    if ((i4 & 1533916891) != 306783378) {
                    }
                    mo89518u.mo89626J();
                    if ((i & 1) == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    c38736bl23 = c38736bl22;
                    function28 = function213;
                    interfaceC41563gV22 = interfaceC41563gV24;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    C38649bc5 m61172d2 = C39242cc5.m61172d(C43705k61.m29303g(8));
                    InterfaceC41563gV2 m114255n2 = BB5.m114255n(interfaceC41563gV22, 0.0f, 1, null);
                    C31686Ai1 c31686Ai12 = C31686Ai1.f965a;
                    FinancialConnectionsTheme financialConnectionsTheme2 = FinancialConnectionsTheme.INSTANCE;
                    long m116469getTextBrand0d7_KjU2 = financialConnectionsTheme2.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU();
                    long m116462getBorderDefault0d7_KjU2 = financialConnectionsTheme2.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU();
                    long m116471getTextDisabled0d7_KjU2 = financialConnectionsTheme2.getColors(mo89518u, 6).m116471getTextDisabled0d7_KjU();
                    long m116474getTextSecondary0d7_KjU2 = financialConnectionsTheme2.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU();
                    int i162 = i4 >> 3;
                    int i172 = i4 << 3;
                    InterfaceC41563gV2 interfaceC41563gV252 = interfaceC41563gV22;
                    interfaceC32720Et02 = mo89518u;
                    C35351Pz3.m89192b(value, onValueChange, m114255n2, false, z4, null, function25, function28, function27, function26, z5, interfaceC32735Eu62, c38736bl23, null, false, 0, null, m61172d2, c31686Ai12.m115380a(0L, 0L, 0L, financialConnectionsTheme2.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), financialConnectionsTheme2.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), m116469getTextBrand0d7_KjU2, m116462getBorderDefault0d7_KjU2, m116471getTextDisabled0d7_KjU2, financialConnectionsTheme2.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, 0L, 0L, financialConnectionsTheme2.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU(), financialConnectionsTheme2.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU(), 0L, financialConnectionsTheme2.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), financialConnectionsTheme2.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), m116474getTextSecondary0d7_KjU2, 0L, financialConnectionsTheme2.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, 0L, mo89518u, 0, 0, C31686Ai1.f966b << 6, 3427847), interfaceC32720Et02, (i4 & 14) | (i162 & 112) | (i172 & 57344) | ((i12 << 18) & 3670016) | (i172 & 29360128) | (i162 & 234881024) | (i172 & 1879048192), ((i4 >> 12) & 14) | ((i4 >> 18) & 112) | ((i4 >> 9) & 896), 122920);
                    if (C35528Qt0.m87827O()) {
                    }
                    interfaceC41563gV23 = interfaceC41563gV252;
                    z6 = z4;
                    z7 = z5;
                    c38736bl24 = c38736bl23;
                    function29 = function28;
                    interfaceC32735Eu63 = interfaceC32735Eu62;
                    function210 = function26;
                    function211 = function27;
                    function212 = function25;
                    mo89512w = interfaceC32720Et02.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                z3 = z2;
                if ((458752 & i) == 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                i12 = i13;
                if ((i4 & 1533916891) != 306783378) {
                }
                mo89518u.mo89626J();
                if ((i & 1) == 0) {
                }
                if (i15 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                c38736bl23 = c38736bl22;
                function28 = function213;
                interfaceC41563gV22 = interfaceC41563gV24;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                C38649bc5 m61172d22 = C39242cc5.m61172d(C43705k61.m29303g(8));
                InterfaceC41563gV2 m114255n22 = BB5.m114255n(interfaceC41563gV22, 0.0f, 1, null);
                C31686Ai1 c31686Ai122 = C31686Ai1.f965a;
                FinancialConnectionsTheme financialConnectionsTheme22 = FinancialConnectionsTheme.INSTANCE;
                long m116469getTextBrand0d7_KjU22 = financialConnectionsTheme22.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU();
                long m116462getBorderDefault0d7_KjU22 = financialConnectionsTheme22.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU();
                long m116471getTextDisabled0d7_KjU22 = financialConnectionsTheme22.getColors(mo89518u, 6).m116471getTextDisabled0d7_KjU();
                long m116474getTextSecondary0d7_KjU22 = financialConnectionsTheme22.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU();
                int i1622 = i4 >> 3;
                int i1722 = i4 << 3;
                InterfaceC41563gV2 interfaceC41563gV2522 = interfaceC41563gV22;
                interfaceC32720Et02 = mo89518u;
                C35351Pz3.m89192b(value, onValueChange, m114255n22, false, z4, null, function25, function28, function27, function26, z5, interfaceC32735Eu62, c38736bl23, null, false, 0, null, m61172d22, c31686Ai122.m115380a(0L, 0L, 0L, financialConnectionsTheme22.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), financialConnectionsTheme22.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), m116469getTextBrand0d7_KjU22, m116462getBorderDefault0d7_KjU22, m116471getTextDisabled0d7_KjU22, financialConnectionsTheme22.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, 0L, 0L, financialConnectionsTheme22.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU(), financialConnectionsTheme22.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU(), 0L, financialConnectionsTheme22.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), financialConnectionsTheme22.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), m116474getTextSecondary0d7_KjU22, 0L, financialConnectionsTheme22.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, 0L, mo89518u, 0, 0, C31686Ai1.f966b << 6, 3427847), interfaceC32720Et02, (i4 & 14) | (i1622 & 112) | (i1722 & 57344) | ((i12 << 18) & 3670016) | (i1722 & 29360128) | (i1622 & 234881024) | (i1722 & 1879048192), ((i4 >> 12) & 14) | ((i4 >> 18) & 112) | ((i4 >> 9) & 896), 122920);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV23 = interfaceC41563gV2522;
                z6 = z4;
                z7 = z5;
                c38736bl24 = c38736bl23;
                function29 = function28;
                interfaceC32735Eu63 = interfaceC32735Eu62;
                function210 = function26;
                function211 = function27;
                function212 = function25;
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z3 = z2;
            if ((458752 & i) == 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            i12 = i13;
            if ((i4 & 1533916891) != 306783378) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i15 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            c38736bl23 = c38736bl22;
            function28 = function213;
            interfaceC41563gV22 = interfaceC41563gV24;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            C38649bc5 m61172d222 = C39242cc5.m61172d(C43705k61.m29303g(8));
            InterfaceC41563gV2 m114255n222 = BB5.m114255n(interfaceC41563gV22, 0.0f, 1, null);
            C31686Ai1 c31686Ai1222 = C31686Ai1.f965a;
            FinancialConnectionsTheme financialConnectionsTheme222 = FinancialConnectionsTheme.INSTANCE;
            long m116469getTextBrand0d7_KjU222 = financialConnectionsTheme222.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU();
            long m116462getBorderDefault0d7_KjU222 = financialConnectionsTheme222.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU();
            long m116471getTextDisabled0d7_KjU222 = financialConnectionsTheme222.getColors(mo89518u, 6).m116471getTextDisabled0d7_KjU();
            long m116474getTextSecondary0d7_KjU222 = financialConnectionsTheme222.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU();
            int i16222 = i4 >> 3;
            int i17222 = i4 << 3;
            InterfaceC41563gV2 interfaceC41563gV25222 = interfaceC41563gV22;
            interfaceC32720Et02 = mo89518u;
            C35351Pz3.m89192b(value, onValueChange, m114255n222, false, z4, null, function25, function28, function27, function26, z5, interfaceC32735Eu62, c38736bl23, null, false, 0, null, m61172d222, c31686Ai1222.m115380a(0L, 0L, 0L, financialConnectionsTheme222.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), financialConnectionsTheme222.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), m116469getTextBrand0d7_KjU222, m116462getBorderDefault0d7_KjU222, m116471getTextDisabled0d7_KjU222, financialConnectionsTheme222.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, 0L, 0L, financialConnectionsTheme222.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU(), financialConnectionsTheme222.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU(), 0L, financialConnectionsTheme222.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), financialConnectionsTheme222.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), m116474getTextSecondary0d7_KjU222, 0L, financialConnectionsTheme222.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, 0L, mo89518u, 0, 0, C31686Ai1.f966b << 6, 3427847), interfaceC32720Et02, (i4 & 14) | (i16222 & 112) | (i17222 & 57344) | ((i12 << 18) & 3670016) | (i17222 & 29360128) | (i16222 & 234881024) | (i17222 & 1879048192), ((i4 >> 12) & 14) | ((i4 >> 18) & 112) | ((i4 >> 9) & 896), 122920);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV23 = interfaceC41563gV25222;
            z6 = z4;
            z7 = z5;
            c38736bl24 = c38736bl23;
            function29 = function28;
            interfaceC32735Eu63 = interfaceC32735Eu62;
            function210 = function26;
            function211 = function27;
            function212 = function25;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z3 = z2;
        if ((458752 & i) == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        i12 = i13;
        if ((i4 & 1533916891) != 306783378) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i15 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        c38736bl23 = c38736bl22;
        function28 = function213;
        interfaceC41563gV22 = interfaceC41563gV24;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        C38649bc5 m61172d2222 = C39242cc5.m61172d(C43705k61.m29303g(8));
        InterfaceC41563gV2 m114255n2222 = BB5.m114255n(interfaceC41563gV22, 0.0f, 1, null);
        C31686Ai1 c31686Ai12222 = C31686Ai1.f965a;
        FinancialConnectionsTheme financialConnectionsTheme2222 = FinancialConnectionsTheme.INSTANCE;
        long m116469getTextBrand0d7_KjU2222 = financialConnectionsTheme2222.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU();
        long m116462getBorderDefault0d7_KjU2222 = financialConnectionsTheme2222.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU();
        long m116471getTextDisabled0d7_KjU2222 = financialConnectionsTheme2222.getColors(mo89518u, 6).m116471getTextDisabled0d7_KjU();
        long m116474getTextSecondary0d7_KjU2222 = financialConnectionsTheme2222.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU();
        int i162222 = i4 >> 3;
        int i172222 = i4 << 3;
        InterfaceC41563gV2 interfaceC41563gV252222 = interfaceC41563gV22;
        interfaceC32720Et02 = mo89518u;
        C35351Pz3.m89192b(value, onValueChange, m114255n2222, false, z4, null, function25, function28, function27, function26, z5, interfaceC32735Eu62, c38736bl23, null, false, 0, null, m61172d2222, c31686Ai12222.m115380a(0L, 0L, 0L, financialConnectionsTheme2222.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), financialConnectionsTheme2222.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), m116469getTextBrand0d7_KjU2222, m116462getBorderDefault0d7_KjU2222, m116471getTextDisabled0d7_KjU2222, financialConnectionsTheme2222.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, 0L, 0L, financialConnectionsTheme2222.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU(), financialConnectionsTheme2222.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU(), 0L, financialConnectionsTheme2222.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), financialConnectionsTheme2222.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), m116474getTextSecondary0d7_KjU2222, 0L, financialConnectionsTheme2222.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, 0L, mo89518u, 0, 0, C31686Ai1.f966b << 6, 3427847), interfaceC32720Et02, (i4 & 14) | (i162222 & 112) | (i172222 & 57344) | ((i12 << 18) & 3670016) | (i172222 & 29360128) | (i162222 & 234881024) | (i172222 & 1879048192), ((i4 >> 12) & 14) | ((i4 >> 18) & 112) | ((i4 >> 9) & 896), 122920);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV23 = interfaceC41563gV252222;
        z6 = z4;
        z7 = z5;
        c38736bl24 = c38736bl23;
        function29 = function28;
        interfaceC32735Eu63 = interfaceC32735Eu62;
        function210 = function26;
        function211 = function27;
        function212 = function25;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    public static final void FinancialConnectionsOutlinedTextFieldPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1620257465);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1620257465, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextFieldPreview (TextField.kt:82)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$TextFieldKt.INSTANCE.m116423getLambda1$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new TextFieldKt$FinancialConnectionsOutlinedTextFieldPreview$1(i));
        }
    }

    /* renamed from: adjustForFilter-8ffj60Q  reason: not valid java name */
    private static final long m116432adjustForFilter8ffj60Q(long j, String str, Function1<? super Character, Boolean> function1) {
        CharSequence subSequence = str.subSequence(0, C48413s26.m14832n(j));
        int i = 0;
        for (int i2 = 0; i2 < subSequence.length(); i2++) {
            if (function1.invoke(Character.valueOf(subSequence.charAt(i2))).booleanValue()) {
                i++;
            }
        }
        CharSequence subSequence2 = str.subSequence(0, C48413s26.m14837i(j));
        int i3 = 0;
        for (int i4 = 0; i4 < subSequence2.length(); i4++) {
            if (function1.invoke(Character.valueOf(subSequence2.charAt(i4))).booleanValue()) {
                i3++;
            }
        }
        return C49006t26.m13200b(i, i3);
    }

    public static final F16 filtered(F16 f16, Function1<? super Character, Boolean> predicate) {
        C48413s26 c48413s26;
        Intrinsics.checkNotNullParameter(f16, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String m108102h = f16.m108102h();
        StringBuilder sb = new StringBuilder();
        int length = m108102h.length();
        for (int i = 0; i < length; i++) {
            char charAt = m108102h.charAt(i);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        long m116432adjustForFilter8ffj60Q = m116432adjustForFilter8ffj60Q(f16.m108103g(), f16.m108102h(), predicate);
        C48413s26 m108104f = f16.m108104f();
        if (m108104f != null) {
            c48413s26 = C48413s26.m14844b(m116432adjustForFilter8ffj60Q(m108104f.m14828r(), f16.m108102h(), predicate));
        } else {
            c48413s26 = null;
        }
        return f16.m108108b(sb2, m116432adjustForFilter8ffj60Q, c48413s26);
    }
}
