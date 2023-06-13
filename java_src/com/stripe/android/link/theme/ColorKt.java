package com.stripe.android.link.theme;

import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeShapes;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.StripeTypography;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.C47063pm0;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0017\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u0017\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0017\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u0007\"\u0017\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007\"\u0017\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\u0007\"\u0017\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u0007\"\u0017\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007\"\u0017\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007\"\u0017\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007\"\u0017\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007\"\u0017\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007\"\u0017\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007\"\u0017\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007\"\u0017\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007\"\u0017\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007\"\u0017\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007\"\u0017\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007\"\u0017\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007\"\u0017\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007\"\u0017\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007\"\u0017\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007\"\u0017\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007\"\u0017\u0010\u001e\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u0007\"\u0017\u0010\u001f\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007\"\u0017\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010\u0007\"\u0017\u0010!\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\u0007\"\u0017\u0010\"\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\"\u0010\u0007\"\u0017\u0010#\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010\u0007\"\u0017\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b$\u0010\u0007\"\u0017\u0010%\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b%\u0010\u0007\"\u0017\u0010&\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b&\u0010\u0007\"\u0017\u0010'\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b'\u0010\u0007\"\u0017\u0010(\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b(\u0010\u0007\"\u0017\u0010)\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b)\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, m28432d2 = {"Lkotlin/Function0;", "", "content", "StripeThemeForLink", "(Lkotlin/jvm/functions/Function2;LEt0;I)V", "Lpm0;", "LinkTeal", "J", "ActionLightGreen", "ActionGreen", "ButtonLabel", "ErrorText", "ErrorBackground", "InlineLink", "LightComponentBackground", "LightComponentBorder", "LightComponentDivider", "LightTextPrimary", "LightTextSecondary", "LightTextDisabled", "LightBackground", "LightFill", "LightCloseButton", "LightLinkLogo", "LightSecondaryButtonLabel", "LightOtpPlaceholder", "LightSheetScrim", "LightProgressIndicator", "DarkComponentBackground", "DarkComponentBorder", "DarkComponentDivider", "DarkTextPrimary", "DarkTextSecondary", "DarkTextDisabled", "DarkBackground", "DarkFill", "DarkCloseButton", "DarkLinkLogo", "DarkSecondaryButtonLabel", "DarkOtpPlaceholder", "DarkSheetScrim", "DarkProgressIndicator", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ColorKt {
    private static final long ActionGreen;
    private static final long ActionLightGreen;
    private static final long ButtonLabel;
    private static final long DarkBackground;
    private static final long DarkCloseButton;
    private static final long DarkComponentBackground;
    private static final long DarkComponentBorder;
    private static final long DarkComponentDivider;
    private static final long DarkFill;
    private static final long DarkLinkLogo;
    private static final long DarkOtpPlaceholder;
    private static final long DarkProgressIndicator;
    private static final long DarkSecondaryButtonLabel;
    private static final long DarkSheetScrim;
    private static final long DarkTextDisabled;
    private static final long DarkTextPrimary;
    private static final long DarkTextSecondary;
    private static final long ErrorBackground;
    private static final long ErrorText;
    private static final long InlineLink;
    private static final long LightBackground;
    private static final long LightCloseButton;
    private static final long LightComponentBackground;
    private static final long LightComponentBorder;
    private static final long LightComponentDivider;
    private static final long LightFill;
    private static final long LightLinkLogo;
    private static final long LightOtpPlaceholder;
    private static final long LightProgressIndicator;
    private static final long LightSecondaryButtonLabel;
    private static final long LightSheetScrim;
    private static final long LightTextDisabled;
    private static final long LightTextPrimary;
    private static final long LightTextSecondary;
    private static final long LinkTeal;

    static {
        long m8178c = C50619vm0.m8178c(4281589171L);
        LinkTeal = m8178c;
        ActionLightGreen = C50619vm0.m8178c(4279944603L);
        long m8178c2 = C50619vm0.m8178c(4278560895L);
        ActionGreen = m8178c2;
        ButtonLabel = C50619vm0.m8178c(4280105284L);
        ErrorText = C50619vm0.m8178c(4294913868L);
        ErrorBackground = C50619vm0.m8179b(788432801);
        InlineLink = C50619vm0.m8179b(863533184);
        C47063pm0.C27386a c27386a = C47063pm0.f104050b;
        LightComponentBackground = c27386a.m18725h();
        LightComponentBorder = C50619vm0.m8178c(4292929259L);
        LightComponentDivider = C50619vm0.m8178c(4293915380L);
        LightTextPrimary = C50619vm0.m8178c(4281348413L);
        LightTextSecondary = C50619vm0.m8178c(4285166467L);
        LightTextDisabled = C50619vm0.m8178c(4288916666L);
        LightBackground = c27386a.m18725h();
        LightFill = C50619vm0.m8178c(4294375674L);
        LightCloseButton = C50619vm0.m8178c(4281348413L);
        LightLinkLogo = C50619vm0.m8178c(4280105284L);
        LightSecondaryButtonLabel = C50619vm0.m8178c(4280105284L);
        LightOtpPlaceholder = C50619vm0.m8178c(4293652209L);
        LightSheetScrim = C50619vm0.m8179b(520758088);
        LightProgressIndicator = C50619vm0.m8178c(4280105284L);
        DarkComponentBackground = C50619vm0.m8179b(779383936);
        DarkComponentBorder = C50619vm0.m8179b(1551399040);
        DarkComponentDivider = C50619vm0.m8179b(863533184);
        DarkTextPrimary = c27386a.m18725h();
        DarkTextSecondary = C50619vm0.m8178c(2582375413L);
        DarkTextDisabled = C50619vm0.m8179b(1644167167);
        DarkBackground = C50619vm0.m8178c(4280032286L);
        DarkFill = C50619vm0.m8179b(863533184);
        DarkCloseButton = C50619vm0.m8178c(2582375413L);
        DarkLinkLogo = c27386a.m18725h();
        DarkSecondaryButtonLabel = m8178c2;
        DarkOtpPlaceholder = C50619vm0.m8179b(1644167167);
        DarkSheetScrim = C50619vm0.m8178c(2566914048L);
        DarkProgressIndicator = m8178c;
    }

    public static final void StripeThemeForLink(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        C34529Mm0 m94909a;
        StripeColors m116693copyKvvhxLA;
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(168964534);
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
                C35528Qt0.m87816Z(168964534, i2, -1, "com.stripe.android.link.theme.StripeThemeForLink (Color.kt:71)");
            }
            StripeThemeDefaults stripeThemeDefaults = StripeThemeDefaults.INSTANCE;
            StripeColors colors = stripeThemeDefaults.colors(C51020wS0.m6823a(mo89518u, 0));
            m94909a = r28.m94909a((r43 & 1) != 0 ? r28.m94900j() : ActionGreen, (r43 & 2) != 0 ? r28.m94899k() : 0L, (r43 & 4) != 0 ? r28.m94898l() : 0L, (r43 & 8) != 0 ? r28.m94897m() : 0L, (r43 & 16) != 0 ? r28.m94907c() : 0L, (r43 & 32) != 0 ? r28.m94896n() : 0L, (r43 & 64) != 0 ? r28.m94906d() : 0L, (r43 & 128) != 0 ? r28.m94903g() : 0L, (r43 & 256) != 0 ? r28.m94902h() : 0L, (r43 & 512) != 0 ? r28.m94905e() : 0L, (r43 & 1024) != 0 ? r28.m94901i() : 0L, (r43 & 2048) != 0 ? r28.m94904f() : 0L, (r43 & 4096) != 0 ? colors.getMaterialColors().m94895o() : false);
            m116693copyKvvhxLA = colors.m116693copyKvvhxLA((r34 & 1) != 0 ? colors.component : 0L, (r34 & 2) != 0 ? colors.componentBorder : 0L, (r34 & 4) != 0 ? colors.componentDivider : 0L, (r34 & 8) != 0 ? colors.onComponent : 0L, (r34 & 16) != 0 ? colors.subtitle : 0L, (r34 & 32) != 0 ? colors.textCursor : 0L, (r34 & 64) != 0 ? colors.placeholderText : 0L, (r34 & 128) != 0 ? colors.appBarIcon : 0L, (r34 & 256) != 0 ? colors.materialColors : m94909a);
            StripeThemeKt.StripeTheme(m116693copyKvvhxLA, StripeShapes.copy$default(stripeThemeDefaults.getShapes(), 9.0f, 0.0f, 0.0f, 6, null), stripeThemeDefaults.getTypography(), C43575jt0.m29791b(mo89518u, -1574000156, true, new ColorKt$StripeThemeForLink$1(content, i2)), mo89518u, StripeColors.$stable | 3072 | (StripeShapes.$stable << 3) | (StripeTypography.$stable << 6), 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ColorKt$StripeThemeForLink$2(content, i));
        }
    }
}
