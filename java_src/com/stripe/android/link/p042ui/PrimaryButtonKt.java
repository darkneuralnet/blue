package com.stripe.android.link.p042ui;

import android.content.res.Resources;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.Amount;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u000f\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001aE\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0007\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0001¢\u0006\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0017\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Landroid/content/res/Resources;", "resources", "", "completePaymentButtonLabel", "", "PrimaryButton", "(LEt0;I)V", "label", "Lcom/stripe/android/link/ui/PrimaryButtonState;", TransferTable.COLUMN_STATE, "Lkotlin/Function0;", "onButtonClick", "", "iconStart", "iconEnd", "(Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;LEt0;II)V", "icon", "PrimaryButtonIcon", "(Ljava/lang/Integer;LEt0;I)V", "", "enabled", "onClick", "SecondaryButton", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;I)V", "Lk61;", "PrimaryButtonIconWidth", "F", "PrimaryButtonIconHeight", "progressIndicatorTestTag", "Ljava/lang/String;", "completedIconTestTag", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,206:1\n68#2,5:207\n73#2:238\n77#2:244\n75#3:212\n76#3,11:214\n89#3:243\n76#4:213\n76#4:239\n460#5,13:225\n473#5,3:240\n154#6:245\n154#6:246\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt\n*L\n158#1:207,5\n158#1:238\n158#1:244\n158#1:212\n158#1:214,11\n158#1:243\n158#1:213\n171#1:239\n158#1:225,13\n158#1:240,3\n59#1:245\n60#1:246\n*E\n"})
/* renamed from: com.stripe.android.link.ui.PrimaryButtonKt */
/* loaded from: classes7.dex */
public final class PrimaryButtonKt {
    public static final String completedIconTestTag = "CompletedIcon";
    public static final String progressIndicatorTestTag = "CircularProgressIndicator";
    private static final float PrimaryButtonIconWidth = C43705k61.m29303g(13);
    private static final float PrimaryButtonIconHeight = C43705k61.m29303g(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PrimaryButton(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1828575393);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1828575393, i, -1, "com.stripe.android.link.ui.PrimaryButton (PrimaryButton.kt:76)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$PrimaryButtonKt.INSTANCE.m116552getLambda1$link_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new PrimaryButtonKt$PrimaryButton$1(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PrimaryButtonIcon(Integer num, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2111548925);
        if ((i & 14) == 0) {
            i2 = (mo89518u.mo89539n(num) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2111548925, i, -1, "com.stripe.android.link.ui.PrimaryButtonIcon (PrimaryButton.kt:154)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            float f = PrimaryButtonIconWidth;
            InterfaceC41563gV2 m114273A = BB5.m114273A(c20912a, f);
            float f2 = PrimaryButtonIconHeight;
            InterfaceC41563gV2 m114254o = BB5.m114254o(m114273A, f2);
            InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
            mo89518u.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, mo89518u, 6);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114254o);
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
            C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-2137368960);
            C40689f10 c40689f10 = C40689f10.f79291a;
            mo89518u.mo89638F(676236169);
            if (num != null) {
                DP1.m110533b(C46748pE3.m19793d(num.intValue(), mo89518u, 0), null, BB5.m114254o(BB5.m114273A(c20912a, f), f2), C47063pm0.m18743m(ThemeKt.getLinkColors(TM2.f35372a, mo89518u, TM2.f35373b).m116530getButtonLabel0d7_KjU(), ((Number) mo89518u.mo89572c(C37220Xz0.m75931a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), mo89518u, 440, 0);
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
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new PrimaryButtonKt$PrimaryButtonIcon$2(num, i));
    }

    public static final void SecondaryButton(boolean z, String label, Function0<Unit> onClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2081911822);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(label)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onClick)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2081911822, i2, -1, "com.stripe.android.link.ui.SecondaryButton (PrimaryButton.kt:177)");
            }
            InterfaceC41563gV2 m114254o = BB5.m114254o(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), ThemeKt.getPrimaryButtonHeight());
            TM2 tm2 = TM2.f35372a;
            int i6 = TM2.f35373b;
            interfaceC32720Et02 = mo89518u;
            C43714k70.m29276c(onClick, m114254o, z, null, null, ThemeKt.getLinkShapes(tm2, mo89518u, i6).getMedium(), null, C42528i70.f86761a.m34439a(tm2.m83731a(mo89518u, i6).m94898l(), 0L, tm2.m83731a(mo89518u, i6).m94898l(), 0L, mo89518u, C42528i70.f86772l << 12, 10), null, C43575jt0.m29791b(mo89518u, 1154361457, true, new PrimaryButtonKt$SecondaryButton$1(z, label, i2)), mo89518u, ((i2 >> 6) & 14) | 805306416 | ((i2 << 6) & 896), 344);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PrimaryButtonKt$SecondaryButton$2(z, label, onClick, i));
        }
    }

    public static final String completePaymentButtonLabel(StripeIntent stripeIntent, Resources resources) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (stripeIntent instanceof PaymentIntent) {
            PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
            Long amount = paymentIntent.getAmount();
            if (amount != null) {
                long longValue = amount.longValue();
                String currency = paymentIntent.getCurrency();
                if (currency != null) {
                    return new Amount(longValue, currency).buildPayButtonLabel(resources);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (stripeIntent instanceof SetupIntent) {
            String string = resources.getString(C18975R.string.stripe_setup_button_label);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…tripe_setup_button_label)");
            return string;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrimaryButton(String label, PrimaryButtonState state, Function0<Unit> onButtonClick, Integer num, Integer num2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Integer num3;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1553805445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo89518u.mo89539n(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= mo89518u.mo89539n(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= mo89518u.mo89539n(onButtonClick) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            obj = num;
            i3 |= mo89518u.mo89539n(obj) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj2 = num2;
                i3 |= mo89518u.mo89539n(obj2) ? 16384 : 8192;
                i5 = i3;
                if ((46811 & i5) != 9362 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    num3 = obj;
                } else {
                    Object obj3 = i6 != 0 ? null : obj;
                    Integer num4 = i4 != 0 ? null : obj2;
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(1553805445, i5, -1, "com.stripe.android.link.ui.PrimaryButton (PrimaryButton.kt:88)");
                    }
                    W94[] w94Arr = new W94[1];
                    w94Arr[0] = C37220Xz0.m75931a().m81907c(Float.valueOf(state == PrimaryButtonState.Disabled ? C36986Wz0.f42427a.m77588b(mo89518u, C36986Wz0.f42428b) : C36986Wz0.f42427a.m77587c(mo89518u, C36986Wz0.f42428b)));
                    C41806gu0.m37353a(w94Arr, C43575jt0.m29791b(mo89518u, 1996772677, true, new PrimaryButtonKt$PrimaryButton$2(onButtonClick, state, i5, obj3, label, num4)), mo89518u, 56);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    num3 = obj3;
                    obj2 = num4;
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                    return;
                }
                mo89512w.mo20405a(new PrimaryButtonKt$PrimaryButton$3(label, state, onButtonClick, num3, obj2, i, i2));
                return;
            }
            obj2 = num2;
            i5 = i3;
            if ((46811 & i5) != 9362) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            W94[] w94Arr2 = new W94[1];
            w94Arr2[0] = C37220Xz0.m75931a().m81907c(Float.valueOf(state == PrimaryButtonState.Disabled ? C36986Wz0.f42427a.m77588b(mo89518u, C36986Wz0.f42428b) : C36986Wz0.f42427a.m77587c(mo89518u, C36986Wz0.f42428b)));
            C41806gu0.m37353a(w94Arr2, C43575jt0.m29791b(mo89518u, 1996772677, true, new PrimaryButtonKt$PrimaryButton$2(onButtonClick, state, i5, obj3, label, num4)), mo89518u, 56);
            if (C35528Qt0.m87827O()) {
            }
            num3 = obj3;
            obj2 = num4;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        obj = num;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        obj2 = num2;
        i5 = i3;
        if ((46811 & i5) != 9362) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        W94[] w94Arr22 = new W94[1];
        w94Arr22[0] = C37220Xz0.m75931a().m81907c(Float.valueOf(state == PrimaryButtonState.Disabled ? C36986Wz0.f42427a.m77588b(mo89518u, C36986Wz0.f42428b) : C36986Wz0.f42427a.m77587c(mo89518u, C36986Wz0.f42428b)));
        C41806gu0.m37353a(w94Arr22, C43575jt0.m29791b(mo89518u, 1996772677, true, new PrimaryButtonKt$PrimaryButton$2(onButtonClick, state, i5, obj3, label, num4)), mo89518u, 56);
        if (C35528Qt0.m87827O()) {
        }
        num3 = obj3;
        obj2 = num4;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }
}
