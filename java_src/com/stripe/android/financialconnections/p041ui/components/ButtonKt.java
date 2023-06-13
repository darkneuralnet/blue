package com.stripe.android.financialconnections.p041ui.components;

import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001\u0012\u001ah\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m28432d2 = {"Lkotlin/Function0;", "", "onClick", "LgV2;", "modifier", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;", "type", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;", "size", "", "enabled", "loading", "Lkotlin/Function1;", "LZc5;", "Lkotlin/ExtensionFunctionType;", "content", "FinancialConnectionsButton", "(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V", "com/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1", "rippleTheme", "(Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;)Lcom/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1;", "FinancialConnectionsButtonPreview", "(LEt0;I)V", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.ui.components.ButtonKt */
/* loaded from: classes7.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FinancialConnectionsButton(Function0<Unit> onClick, InterfaceC41563gV2 interfaceC41563gV2, FinancialConnectionsButton.Type type, FinancialConnectionsButton.Size size, boolean z, boolean z2, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Object obj;
        int i7;
        int i8;
        Object obj2;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        boolean z4;
        int i13;
        int i14;
        InterfaceC41563gV2.C20912a c20912a;
        FinancialConnectionsButton.Type.Primary primary;
        FinancialConnectionsButton.Size.Regular regular;
        boolean z5;
        boolean z6;
        InterfaceC41563gV2 interfaceC41563gV22;
        FinancialConnectionsButton.Type type2;
        FinancialConnectionsButton.Size size2;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1133551384);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(onClick)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i2 & 4;
            if (i6 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = type;
                if (mo89518u.mo89539n(obj)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                i8 = i2 & 8;
                if (i8 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    obj2 = size;
                    if (mo89518u.mo89539n(obj2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i3 |= i9;
                    i10 = i2 & 16;
                    if (i10 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        z3 = z;
                        if (mo89518u.mo89536o(z3)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i3 |= i11;
                        i12 = i2 & 32;
                        if (i12 != 0) {
                            i3 |= ImageMetadata.EDGE_MODE;
                        } else if ((458752 & i) == 0) {
                            z4 = z2;
                            if (mo89518u.mo89536o(z4)) {
                                i13 = DateUtils.FORMAT_NUMERIC_DATE;
                            } else {
                                i13 = 65536;
                            }
                            i3 |= i13;
                            if ((i2 & 64) == 0) {
                                i14 = 1572864;
                            } else {
                                if ((i & 3670016) == 0) {
                                    if (mo89518u.mo89539n(content)) {
                                        i14 = 1048576;
                                    } else {
                                        i14 = 524288;
                                    }
                                }
                                if ((i3 & 2995931) != 599186 && mo89518u.mo89575b()) {
                                    mo89518u.mo89548k();
                                    interfaceC41563gV22 = interfaceC41563gV2;
                                    type2 = obj;
                                    size2 = obj2;
                                    z5 = z3;
                                    z6 = z4;
                                } else {
                                    if (i15 != 0) {
                                        c20912a = InterfaceC41563gV2.f82354b0;
                                    } else {
                                        c20912a = interfaceC41563gV2;
                                    }
                                    if (i6 != 0) {
                                        primary = FinancialConnectionsButton.Type.Primary.INSTANCE;
                                    } else {
                                        primary = obj;
                                    }
                                    if (i8 != 0) {
                                        regular = FinancialConnectionsButton.Size.Regular.INSTANCE;
                                    } else {
                                        regular = obj2;
                                    }
                                    if (i10 != 0) {
                                        z3 = true;
                                    }
                                    if (i12 != 0) {
                                        z4 = false;
                                    }
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87816Z(1133551384, i3, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton (Button.kt:42)");
                                    }
                                    C41806gu0.m37353a(new W94[]{C52293yb5.m3198d().m81907c(rippleTheme(primary))}, C43575jt0.m29791b(mo89518u, 862168024, true, new ButtonKt$FinancialConnectionsButton$1(regular, i3, primary, onClick, c20912a, z3, z4, content)), mo89518u, 56);
                                    if (C35528Qt0.m87827O()) {
                                        C35528Qt0.m87817Y();
                                    }
                                    z5 = z3;
                                    z6 = z4;
                                    interfaceC41563gV22 = c20912a;
                                    type2 = primary;
                                    size2 = regular;
                                }
                                mo89512w = mo89518u.mo89512w();
                                if (mo89512w != null) {
                                    mo89512w.mo20405a(new ButtonKt$FinancialConnectionsButton$2(onClick, interfaceC41563gV22, type2, size2, z5, z6, content, i, i2));
                                    return;
                                }
                                return;
                            }
                            i3 |= i14;
                            if ((i3 & 2995931) != 599186) {
                            }
                            if (i15 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (C35528Qt0.m87827O()) {
                            }
                            C41806gu0.m37353a(new W94[]{C52293yb5.m3198d().m81907c(rippleTheme(primary))}, C43575jt0.m29791b(mo89518u, 862168024, true, new ButtonKt$FinancialConnectionsButton$1(regular, i3, primary, onClick, c20912a, z3, z4, content)), mo89518u, 56);
                            if (C35528Qt0.m87827O()) {
                            }
                            z5 = z3;
                            z6 = z4;
                            interfaceC41563gV22 = c20912a;
                            type2 = primary;
                            size2 = regular;
                            mo89512w = mo89518u.mo89512w();
                            if (mo89512w != null) {
                            }
                        }
                        z4 = z2;
                        if ((i2 & 64) == 0) {
                        }
                        i3 |= i14;
                        if ((i3 & 2995931) != 599186) {
                        }
                        if (i15 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (C35528Qt0.m87827O()) {
                        }
                        C41806gu0.m37353a(new W94[]{C52293yb5.m3198d().m81907c(rippleTheme(primary))}, C43575jt0.m29791b(mo89518u, 862168024, true, new ButtonKt$FinancialConnectionsButton$1(regular, i3, primary, onClick, c20912a, z3, z4, content)), mo89518u, 56);
                        if (C35528Qt0.m87827O()) {
                        }
                        z5 = z3;
                        z6 = z4;
                        interfaceC41563gV22 = c20912a;
                        type2 = primary;
                        size2 = regular;
                        mo89512w = mo89518u.mo89512w();
                        if (mo89512w != null) {
                        }
                    }
                    z3 = z;
                    i12 = i2 & 32;
                    if (i12 != 0) {
                    }
                    z4 = z2;
                    if ((i2 & 64) == 0) {
                    }
                    i3 |= i14;
                    if ((i3 & 2995931) != 599186) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    C41806gu0.m37353a(new W94[]{C52293yb5.m3198d().m81907c(rippleTheme(primary))}, C43575jt0.m29791b(mo89518u, 862168024, true, new ButtonKt$FinancialConnectionsButton$1(regular, i3, primary, onClick, c20912a, z3, z4, content)), mo89518u, 56);
                    if (C35528Qt0.m87827O()) {
                    }
                    z5 = z3;
                    z6 = z4;
                    interfaceC41563gV22 = c20912a;
                    type2 = primary;
                    size2 = regular;
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w != null) {
                    }
                }
                obj2 = size;
                i10 = i2 & 16;
                if (i10 == 0) {
                }
                z3 = z;
                i12 = i2 & 32;
                if (i12 != 0) {
                }
                z4 = z2;
                if ((i2 & 64) == 0) {
                }
                i3 |= i14;
                if ((i3 & 2995931) != 599186) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                C41806gu0.m37353a(new W94[]{C52293yb5.m3198d().m81907c(rippleTheme(primary))}, C43575jt0.m29791b(mo89518u, 862168024, true, new ButtonKt$FinancialConnectionsButton$1(regular, i3, primary, onClick, c20912a, z3, z4, content)), mo89518u, 56);
                if (C35528Qt0.m87827O()) {
                }
                z5 = z3;
                z6 = z4;
                interfaceC41563gV22 = c20912a;
                type2 = primary;
                size2 = regular;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                }
            }
            obj = type;
            i8 = i2 & 8;
            if (i8 != 0) {
            }
            obj2 = size;
            i10 = i2 & 16;
            if (i10 == 0) {
            }
            z3 = z;
            i12 = i2 & 32;
            if (i12 != 0) {
            }
            z4 = z2;
            if ((i2 & 64) == 0) {
            }
            i3 |= i14;
            if ((i3 & 2995931) != 599186) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            C41806gu0.m37353a(new W94[]{C52293yb5.m3198d().m81907c(rippleTheme(primary))}, C43575jt0.m29791b(mo89518u, 862168024, true, new ButtonKt$FinancialConnectionsButton$1(regular, i3, primary, onClick, c20912a, z3, z4, content)), mo89518u, 56);
            if (C35528Qt0.m87827O()) {
            }
            z5 = z3;
            z6 = z4;
            interfaceC41563gV22 = c20912a;
            type2 = primary;
            size2 = regular;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        obj = type;
        i8 = i2 & 8;
        if (i8 != 0) {
        }
        obj2 = size;
        i10 = i2 & 16;
        if (i10 == 0) {
        }
        z3 = z;
        i12 = i2 & 32;
        if (i12 != 0) {
        }
        z4 = z2;
        if ((i2 & 64) == 0) {
        }
        i3 |= i14;
        if ((i3 & 2995931) != 599186) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        C41806gu0.m37353a(new W94[]{C52293yb5.m3198d().m81907c(rippleTheme(primary))}, C43575jt0.m29791b(mo89518u, 862168024, true, new ButtonKt$FinancialConnectionsButton$1(regular, i3, primary, onClick, c20912a, z3, z4, content)), mo89518u, 56);
        if (C35528Qt0.m87827O()) {
        }
        z5 = z3;
        z6 = z4;
        interfaceC41563gV22 = c20912a;
        type2 = primary;
        size2 = regular;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    public static final void FinancialConnectionsButtonPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1629601071);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1629601071, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButtonPreview (Button.kt:190)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ButtonKt.INSTANCE.m116422getLambda6$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ButtonKt$FinancialConnectionsButtonPreview$1(i));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.stripe.android.financialconnections.ui.components.ButtonKt$rippleTheme$1] */
    private static final ButtonKt$rippleTheme$1 rippleTheme(final FinancialConnectionsButton.Type type) {
        return new InterfaceC51700xb5() { // from class: com.stripe.android.financialconnections.ui.components.ButtonKt$rippleTheme$1
            @Override // p000.InterfaceC51700xb5
            /* renamed from: defaultColor-WaAFU9c */
            public long mo116229defaultColorWaAFU9c(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                long m18725h;
                interfaceC32720Et0.mo89638F(-1975968033);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1975968033, i, -1, "com.stripe.android.financialconnections.ui.components.rippleTheme.<no name provided>.defaultColor (Button.kt:92)");
                }
                FinancialConnectionsButton.Type type2 = FinancialConnectionsButton.Type.this;
                if (Intrinsics.areEqual(type2, FinancialConnectionsButton.Type.Primary.INSTANCE)) {
                    m18725h = C47063pm0.f104050b.m18725h();
                } else if (Intrinsics.areEqual(type2, FinancialConnectionsButton.Type.Secondary.INSTANCE)) {
                    m18725h = FinancialConnectionsTheme.INSTANCE.getColors(interfaceC32720Et0, 6).m116474getTextSecondary0d7_KjU();
                } else if (Intrinsics.areEqual(type2, FinancialConnectionsButton.Type.Critical.INSTANCE)) {
                    m18725h = C47063pm0.f104050b.m18725h();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC32720Et0.mo89605Q();
                return m18725h;
            }

            @Override // p000.InterfaceC51700xb5
            public C46958pb5 rippleAlpha(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                interfaceC32720Et0.mo89638F(-457451996);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-457451996, i, -1, "com.stripe.android.financialconnections.ui.components.rippleTheme.<no name provided>.rippleAlpha (Button.kt:99)");
                }
                C46958pb5 m4962a = InterfaceC51700xb5.f117843a.m4962a(FinancialConnectionsButton.Type.this.buttonColors(interfaceC32720Et0, 0).mo5106b(true, interfaceC32720Et0, 6).getValue().m18733w(), true);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC32720Et0.mo89605Q();
                return m4962a;
            }
        };
    }
}
