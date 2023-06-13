package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import com.adyen.checkout.card.p023ui.CardNumberInput;
import com.adyen.checkout.card.p023ui.ExpiryDateInput;
import com.adyen.checkout.card.p023ui.SecurityCodeInput;
import com.adyen.checkout.card.p023ui.SocialSecurityNumberInput;
import com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText;
import com.adyen.checkout.components.p024ui.view.RoundCornerImageView;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: rg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48189rg0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f107453a;

    /* renamed from: b */
    public final RoundCornerImageView f107454b;

    /* renamed from: c */
    public final AdyenTextInputEditText f107455c;

    /* renamed from: d */
    public final CardNumberInput f107456d;

    /* renamed from: e */
    public final ExpiryDateInput f107457e;

    /* renamed from: f */
    public final AdyenTextInputEditText f107458f;

    /* renamed from: g */
    public final AdyenTextInputEditText f107459g;

    /* renamed from: h */
    public final AdyenTextInputEditText f107460h;

    /* renamed from: i */
    public final SecurityCodeInput f107461i;

    /* renamed from: j */
    public final SocialSecurityNumberInput f107462j;

    /* renamed from: k */
    public final SwitchCompat f107463k;

    /* renamed from: l */
    public final TextInputLayout f107464l;

    /* renamed from: m */
    public final TextInputLayout f107465m;

    /* renamed from: n */
    public final TextInputLayout f107466n;

    /* renamed from: o */
    public final TextInputLayout f107467o;

    /* renamed from: p */
    public final TextInputLayout f107468p;

    /* renamed from: q */
    public final TextInputLayout f107469q;

    /* renamed from: r */
    public final TextInputLayout f107470r;

    /* renamed from: s */
    public final TextInputLayout f107471s;

    public C48189rg0(View view, RoundCornerImageView roundCornerImageView, AdyenTextInputEditText adyenTextInputEditText, CardNumberInput cardNumberInput, ExpiryDateInput expiryDateInput, AdyenTextInputEditText adyenTextInputEditText2, AdyenTextInputEditText adyenTextInputEditText3, AdyenTextInputEditText adyenTextInputEditText4, SecurityCodeInput securityCodeInput, SocialSecurityNumberInput socialSecurityNumberInput, SwitchCompat switchCompat, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8) {
        this.f107453a = view;
        this.f107454b = roundCornerImageView;
        this.f107455c = adyenTextInputEditText;
        this.f107456d = cardNumberInput;
        this.f107457e = expiryDateInput;
        this.f107458f = adyenTextInputEditText2;
        this.f107459g = adyenTextInputEditText3;
        this.f107460h = adyenTextInputEditText4;
        this.f107461i = securityCodeInput;
        this.f107462j = socialSecurityNumberInput;
        this.f107463k = switchCompat;
        this.f107464l = textInputLayout;
        this.f107465m = textInputLayout2;
        this.f107466n = textInputLayout3;
        this.f107467o = textInputLayout4;
        this.f107468p = textInputLayout5;
        this.f107469q = textInputLayout6;
        this.f107470r = textInputLayout7;
        this.f107471s = textInputLayout8;
    }

    /* renamed from: a */
    public static C48189rg0 m15587a(View view) {
        int i = C32625Ei4.cardBrandLogo_imageView;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) view.findViewById(i);
        if (roundCornerImageView != null) {
            i = C32625Ei4.editText_cardHolder;
            AdyenTextInputEditText adyenTextInputEditText = (AdyenTextInputEditText) view.findViewById(i);
            if (adyenTextInputEditText != null) {
                i = C32625Ei4.editText_cardNumber;
                CardNumberInput cardNumberInput = (CardNumberInput) view.findViewById(i);
                if (cardNumberInput != null) {
                    i = C32625Ei4.editText_expiryDate;
                    ExpiryDateInput expiryDateInput = (ExpiryDateInput) view.findViewById(i);
                    if (expiryDateInput != null) {
                        i = C32625Ei4.editText_kcpBirthDateOrTaxNumber;
                        AdyenTextInputEditText adyenTextInputEditText2 = (AdyenTextInputEditText) view.findViewById(i);
                        if (adyenTextInputEditText2 != null) {
                            i = C32625Ei4.editText_kcpCardPassword;
                            AdyenTextInputEditText adyenTextInputEditText3 = (AdyenTextInputEditText) view.findViewById(i);
                            if (adyenTextInputEditText3 != null) {
                                i = C32625Ei4.editText_postalCode;
                                AdyenTextInputEditText adyenTextInputEditText4 = (AdyenTextInputEditText) view.findViewById(i);
                                if (adyenTextInputEditText4 != null) {
                                    i = C32625Ei4.editText_securityCode;
                                    SecurityCodeInput securityCodeInput = (SecurityCodeInput) view.findViewById(i);
                                    if (securityCodeInput != null) {
                                        i = C32625Ei4.editText_socialSecurityNumber;
                                        SocialSecurityNumberInput socialSecurityNumberInput = (SocialSecurityNumberInput) view.findViewById(i);
                                        if (socialSecurityNumberInput != null) {
                                            i = C32625Ei4.switch_storePaymentMethod;
                                            SwitchCompat switchCompat = (SwitchCompat) view.findViewById(i);
                                            if (switchCompat != null) {
                                                i = C32625Ei4.textInputLayout_cardHolder;
                                                TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(i);
                                                if (textInputLayout != null) {
                                                    i = C32625Ei4.textInputLayout_cardNumber;
                                                    TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(i);
                                                    if (textInputLayout2 != null) {
                                                        i = C32625Ei4.textInputLayout_expiryDate;
                                                        TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(i);
                                                        if (textInputLayout3 != null) {
                                                            i = C32625Ei4.textInputLayout_kcpBirthDateOrTaxNumber;
                                                            TextInputLayout textInputLayout4 = (TextInputLayout) view.findViewById(i);
                                                            if (textInputLayout4 != null) {
                                                                i = C32625Ei4.textInputLayout_kcpCardPassword;
                                                                TextInputLayout textInputLayout5 = (TextInputLayout) view.findViewById(i);
                                                                if (textInputLayout5 != null) {
                                                                    i = C32625Ei4.textInputLayout_postalCode;
                                                                    TextInputLayout textInputLayout6 = (TextInputLayout) view.findViewById(i);
                                                                    if (textInputLayout6 != null) {
                                                                        i = C32625Ei4.textInputLayout_securityCode;
                                                                        TextInputLayout textInputLayout7 = (TextInputLayout) view.findViewById(i);
                                                                        if (textInputLayout7 != null) {
                                                                            i = C32625Ei4.textInputLayout_socialSecurityNumber;
                                                                            TextInputLayout textInputLayout8 = (TextInputLayout) view.findViewById(i);
                                                                            if (textInputLayout8 != null) {
                                                                                return new C48189rg0(view, roundCornerImageView, adyenTextInputEditText, cardNumberInput, expiryDateInput, adyenTextInputEditText2, adyenTextInputEditText3, adyenTextInputEditText4, securityCodeInput, socialSecurityNumberInput, switchCompat, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C48189rg0 m15586b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C48233rk4.card_view, viewGroup);
            return m15587a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f107453a;
    }
}
