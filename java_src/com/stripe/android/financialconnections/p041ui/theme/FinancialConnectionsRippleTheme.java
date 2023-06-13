package com.stripe.android.financialconnections.p041ui.theme;

import kotlin.Metadata;
import p000.InterfaceC51700xb5;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0005\u001a\u00020\u0002H\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsRippleTheme;", "Lxb5;", "Lpm0;", "defaultColor-WaAFU9c", "(LEt0;I)J", "defaultColor", "Lpb5;", "rippleAlpha", "(LEt0;I)Lpb5;", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.ui.theme.FinancialConnectionsRippleTheme */
/* loaded from: classes7.dex */
final class FinancialConnectionsRippleTheme implements InterfaceC51700xb5 {
    public static final FinancialConnectionsRippleTheme INSTANCE = new FinancialConnectionsRippleTheme();

    private FinancialConnectionsRippleTheme() {
    }

    @Override // p000.InterfaceC51700xb5
    /* renamed from: defaultColor-WaAFU9c */
    public long mo116229defaultColorWaAFU9c(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        FinancialConnectionsColors financialConnectionsColors;
        interfaceC32720Et0.mo89638F(1307413827);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1307413827, i, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsRippleTheme.defaultColor (Theme.kt:134)");
        }
        InterfaceC51700xb5.C30239a c30239a = InterfaceC51700xb5.f117843a;
        financialConnectionsColors = ThemeKt.LightColorPalette;
        long m4961b = c30239a.m4961b(financialConnectionsColors.m116469getTextBrand0d7_KjU(), TM2.f35372a.m83731a(interfaceC32720Et0, TM2.f35373b).m94895o());
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m4961b;
    }

    @Override // p000.InterfaceC51700xb5
    public C46958pb5 rippleAlpha(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        FinancialConnectionsColors financialConnectionsColors;
        interfaceC32720Et0.mo89638F(1931126216);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1931126216, i, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsRippleTheme.rippleAlpha (Theme.kt:140)");
        }
        InterfaceC51700xb5.C30239a c30239a = InterfaceC51700xb5.f117843a;
        financialConnectionsColors = ThemeKt.LightColorPalette;
        C46958pb5 m4962a = c30239a.m4962a(financialConnectionsColors.m116469getTextBrand0d7_KjU(), TM2.f35372a.m83731a(interfaceC32720Et0, TM2.f35373b).m94895o());
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m4962a;
    }
}
