package com.adyen.checkout.card;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.card.CardView;
import com.adyen.checkout.card.p023ui.SecurityCodeInput;
import com.adyen.checkout.components.p024ui.view.AdyenLinearLayout;
import com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText;
import com.adyen.checkout.components.p024ui.view.RoundCornerImageView;
import com.facebook.share.internal.C17296a;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC51188wj6;
import p000.C52845zX1;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006B'\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I\u0012\b\b\u0002\u0010K\u001a\u00020\u0015¢\u0006\u0004\bL\u0010MJ\b\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u001b\u0010\u0017\u001a\u00020\u00072\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0002J\b\u0010\u001e\u001a\u00020\u0007H\u0002J\b\u0010\u001f\u001a\u00020\u0007H\u0002J\b\u0010 \u001a\u00020\u0007H\u0002J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020!H\u0002J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0002J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020&H\u0002J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020&H\u0002J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-H\u0002J\u0012\u00103\u001a\u0004\u0018\u0001022\u0006\u00101\u001a\u000200H\u0002J\b\u00104\u001a\u00020\u0007H\u0014J\b\u00105\u001a\u00020\u0007H\u0014J\b\u00106\u001a\u00020\u0007H\u0016J\u0010\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u000200H\u0014J\b\u00109\u001a\u00020\u0007H\u0016J\u0012\u0010;\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0014R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010G¨\u0006N"}, m28432d2 = {"Lcom/adyen/checkout/card/CardView;", "Lcom/adyen/checkout/components/ui/view/AdyenLinearLayout;", "LWf0;", "Lcom/adyen/checkout/card/CardConfiguration;", "LCf0;", "Lyf0;", "Lfe3;", "", "c0", "", "LT11;", "detectedCardTypes", "d0", "LYk1;", "Lvi1;", "expiryDateState", "f0", "Landroid/view/View;", "view", "z", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", "stringResId", "g0", "(Ljava/lang/Integer;)V", "F", "V", "I", "Y", "L", "M", "P", "S", "Le32;", "cvcUIState", "A", "expiryDateUIState", "B", "", "shouldShowSocialSecurityNumber", "j0", "shouldShowKCPAuth", "h0", "shouldShowPostalCode", "i0", "LHf0;", "storedCardInput", "k0", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/Activity;", "y", "onAttachedToWindow", "onDetachedFromWindow", C17296a.f69688o, "localizedContext", "f", "b", "cardOutputData", "e0", "LLifecycleOwner;", "lifecycleOwner", "g", "Lrg0;", DateTokenConverter.CONVERTER_KEY, "Lrg0;", "binding", "e", "LHf0;", "mCardInputData", "LzX1;", "LzX1;", "mImageLoader", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CardView extends AdyenLinearLayout<C36806Wf0, CardConfiguration, C32126Cf0, C52328yf0> implements InterfaceC41056fe3<C36806Wf0> {

    /* renamed from: d */
    public final C48189rg0 f68356d;

    /* renamed from: e */
    public final C33296Hf0 f68357e;

    /* renamed from: f */
    public C52845zX1 f68358f;

    @Metadata(m28431k = 3, m28430mv = {1, 5, 1}, m28428xi = 48)
    /* renamed from: com.adyen.checkout.card.CardView$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C16795a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC40118e32.values().length];
            iArr[EnumC40118e32.REQUIRED.ordinal()] = 1;
            iArr[EnumC40118e32.OPTIONAL.ordinal()] = 2;
            iArr[EnumC40118e32.HIDDEN.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: D */
    public static final void m53687D(CardView this$0, Editable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        C33296Hf0 c33296Hf0 = this$0.f68357e;
        String mo53578c = this$0.f68356d.f107456d.mo53578c();
        Intrinsics.checkNotNullExpressionValue(mo53578c, "binding.editTextCardNumber.rawValue");
        c33296Hf0.m103565j(mo53578c);
        this$0.m53662c0();
        this$0.m53658g0(null);
    }

    /* renamed from: E */
    public static final void m53686E(CardView this$0, View view, boolean z) {
        C37320Yk1<String> m78044a;
        AbstractC51188wj6 m74342a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.m53584d().m3035C()) {
            C36806Wf0 m10670h = this$0.m53584d().m10670h();
            if (m10670h == null || (m78044a = m10670h.m78044a()) == null) {
                m74342a = null;
            } else {
                m74342a = m78044a.m74342a();
            }
            if (z) {
                this$0.m53658g0(null);
            } else if (m74342a != null && (m74342a instanceof AbstractC51188wj6.C29948a)) {
                this$0.m53658g0(Integer.valueOf(((AbstractC51188wj6.C29948a) m74342a).m6430b()));
            }
        }
    }

    /* renamed from: G */
    public static final void m53684G(CardView this$0, Editable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        C50580vi1 m53607f = this$0.f68356d.f107457e.m53607f();
        Intrinsics.checkNotNullExpressionValue(m53607f, "binding.editTextExpiryDate.date");
        this$0.f68357e.m103564k(m53607f);
        this$0.m53662c0();
        this$0.f68356d.f107466n.setError(null);
    }

    /* renamed from: H */
    public static final void m53683H(CardView this$0, View view, boolean z) {
        C37320Yk1<C50580vi1> m78041d;
        AbstractC51188wj6 m74342a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C36806Wf0 m10670h = this$0.m53584d().m10670h();
        if (m10670h == null || (m78041d = m10670h.m78041d()) == null) {
            m74342a = null;
        } else {
            m74342a = m78041d.m74342a();
        }
        if (z) {
            this$0.f68356d.f107466n.setError(null);
        } else if (m74342a != null && (m74342a instanceof AbstractC51188wj6.C29948a)) {
            this$0.f68356d.f107466n.setError(this$0.f68422c.getString(((AbstractC51188wj6.C29948a) m74342a).m6430b()));
        }
    }

    /* renamed from: J */
    public static final void m53681J(CardView this$0, View view, boolean z) {
        C37320Yk1<String> m78039f;
        AbstractC51188wj6 m74342a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C36806Wf0 m10670h = this$0.m53584d().m10670h();
        if (m10670h == null || (m78039f = m10670h.m78039f()) == null) {
            m74342a = null;
        } else {
            m74342a = m78039f.m74342a();
        }
        if (z) {
            this$0.f68356d.f107464l.setError(null);
        } else if (m74342a != null && (m74342a instanceof AbstractC51188wj6.C29948a)) {
            this$0.f68356d.f107464l.setError(this$0.f68422c.getString(((AbstractC51188wj6.C29948a) m74342a).m6430b()));
        }
    }

    /* renamed from: K */
    public static final void m53680K(CardView this$0, Editable editable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(editable, "editable");
        this$0.f68357e.m103563l(editable.toString());
        this$0.m53662c0();
        this$0.f68356d.f107464l.setError(null);
    }

    /* renamed from: N */
    public static final void m53677N(CardView this$0, Editable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f68357e.m103562m(it.toString());
        this$0.m53662c0();
        this$0.f68356d.f107467o.setError(null);
        this$0.f68356d.f107467o.setHint(this$0.f68422c.getString(this$0.m53584d().m3015z(it.toString())));
    }

    /* renamed from: O */
    public static final void m53676O(CardView this$0, View view, boolean z) {
        C37320Yk1<String> m78038g;
        AbstractC51188wj6 m74342a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C36806Wf0 m10670h = this$0.m53584d().m10670h();
        if (m10670h == null || (m78038g = m10670h.m78038g()) == null) {
            m74342a = null;
        } else {
            m74342a = m78038g.m74342a();
        }
        if (z) {
            this$0.f68356d.f107467o.setError(null);
        } else if (m74342a != null && (m74342a instanceof AbstractC51188wj6.C29948a)) {
            this$0.f68356d.f107467o.setError(this$0.f68422c.getString(((AbstractC51188wj6.C29948a) m74342a).m6430b()));
        }
    }

    /* renamed from: Q */
    public static final void m53674Q(CardView this$0, Editable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f68357e.m103561n(it.toString());
        this$0.m53662c0();
        this$0.f68356d.f107468p.setError(null);
    }

    /* renamed from: R */
    public static final void m53673R(CardView this$0, View view, boolean z) {
        C37320Yk1<String> m78037h;
        AbstractC51188wj6 m74342a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C36806Wf0 m10670h = this$0.m53584d().m10670h();
        if (m10670h == null || (m78037h = m10670h.m78037h()) == null) {
            m74342a = null;
        } else {
            m74342a = m78037h.m74342a();
        }
        if (z) {
            this$0.f68356d.f107468p.setError(null);
        } else if (m74342a != null && (m74342a instanceof AbstractC51188wj6.C29948a)) {
            this$0.f68356d.f107468p.setError(this$0.f68422c.getString(((AbstractC51188wj6.C29948a) m74342a).m6430b()));
        }
    }

    /* renamed from: T */
    public static final void m53671T(CardView this$0, Editable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f68357e.m103560o(it.toString());
        this$0.m53662c0();
        this$0.f68356d.f107469q.setError(null);
    }

    /* renamed from: U */
    public static final void m53670U(CardView this$0, View view, boolean z) {
        C37320Yk1<String> m78036i;
        AbstractC51188wj6 m74342a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C36806Wf0 m10670h = this$0.m53584d().m10670h();
        if (m10670h == null || (m78036i = m10670h.m78036i()) == null) {
            m74342a = null;
        } else {
            m74342a = m78036i.m74342a();
        }
        if (z) {
            this$0.f68356d.f107469q.setError(null);
        } else if (m74342a != null && (m74342a instanceof AbstractC51188wj6.C29948a)) {
            this$0.f68356d.f107469q.setError(this$0.f68422c.getString(((AbstractC51188wj6.C29948a) m74342a).m6430b()));
        }
    }

    /* renamed from: W */
    public static final void m53668W(CardView this$0, Editable editable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(editable, "editable");
        this$0.f68357e.m103559p(editable.toString());
        this$0.m53662c0();
        this$0.f68356d.f107470r.setError(null);
    }

    /* renamed from: X */
    public static final void m53667X(CardView this$0, View view, boolean z) {
        C37320Yk1<String> m78035j;
        AbstractC51188wj6 m74342a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C36806Wf0 m10670h = this$0.m53584d().m10670h();
        if (m10670h == null || (m78035j = m10670h.m78035j()) == null) {
            m74342a = null;
        } else {
            m74342a = m78035j.m74342a();
        }
        if (z) {
            this$0.f68356d.f107470r.setError(null);
        } else if (m74342a != null && (m74342a instanceof AbstractC51188wj6.C29948a)) {
            this$0.f68356d.f107470r.setError(this$0.f68422c.getString(((AbstractC51188wj6.C29948a) m74342a).m6430b()));
        }
    }

    /* renamed from: Z */
    public static final void m53665Z(CardView this$0, Editable editable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(editable, "editable");
        this$0.f68357e.m103558q(editable.toString());
        this$0.m53662c0();
        this$0.f68356d.f107471s.setError(null);
    }

    /* renamed from: a0 */
    public static final void m53664a0(CardView this$0, View view, boolean z) {
        C37320Yk1<String> m78034k;
        AbstractC51188wj6 m74342a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C36806Wf0 m10670h = this$0.m53584d().m10670h();
        if (m10670h == null || (m78034k = m10670h.m78034k()) == null) {
            m74342a = null;
        } else {
            m74342a = m78034k.m74342a();
        }
        if (z) {
            this$0.f68356d.f107471s.setError(null);
        } else if (m74342a != null && (m74342a instanceof AbstractC51188wj6.C29948a)) {
            this$0.f68356d.f107471s.setError(this$0.f68422c.getString(((AbstractC51188wj6.C29948a) m74342a).m6430b()));
        }
    }

    /* renamed from: b0 */
    public static final void m53663b0(CardView this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f68357e.m103557r(z);
        this$0.m53662c0();
    }

    /* renamed from: A */
    public final void m53690A(EnumC40118e32 enumC40118e32) {
        int i = C16795a.$EnumSwitchMapping$0[enumC40118e32.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    TextInputLayout textInputLayout = this.f68356d.f107470r;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout, "binding.textInputLayoutSecurityCode");
                    textInputLayout.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams = this.f68356d.f107466n.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.setMarginEnd(0);
                        this.f68356d.f107466n.setLayoutParams(layoutParams2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                return;
            }
            TextInputLayout textInputLayout2 = this.f68356d.f107470r;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "binding.textInputLayoutSecurityCode");
            textInputLayout2.setVisibility(0);
            this.f68356d.f107470r.setHint(C37557Zk4.checkout_card_security_code_optional_hint);
            return;
        }
        TextInputLayout textInputLayout3 = this.f68356d.f107470r;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "binding.textInputLayoutSecurityCode");
        textInputLayout3.setVisibility(0);
        this.f68356d.f107470r.setHint(C37557Zk4.checkout_card_security_code_hint);
    }

    /* renamed from: B */
    public final void m53689B(EnumC40118e32 enumC40118e32) {
        int i = C16795a.$EnumSwitchMapping$0[enumC40118e32.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    TextInputLayout textInputLayout = this.f68356d.f107466n;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout, "binding.textInputLayoutExpiryDate");
                    textInputLayout.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams = this.f68356d.f107470r.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.setMarginStart(0);
                        this.f68356d.f107470r.setLayoutParams(layoutParams2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                return;
            }
            TextInputLayout textInputLayout2 = this.f68356d.f107466n;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "binding.textInputLayoutExpiryDate");
            textInputLayout2.setVisibility(0);
            this.f68356d.f107466n.setHint(C37557Zk4.checkout_card_expiry_date_optional_hint);
            return;
        }
        TextInputLayout textInputLayout3 = this.f68356d.f107466n;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "binding.textInputLayoutExpiryDate");
        textInputLayout3.setVisibility(0);
        this.f68356d.f107466n.setHint(C37557Zk4.checkout_card_expiry_date_hint);
    }

    /* renamed from: C */
    public final void m53688C() {
        this.f68356d.f107456d.setOnChangeListener(new AdyenTextInputEditText.InterfaceC16843b() { // from class: fg0
            @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText.InterfaceC16843b
            /* renamed from: a */
            public final void mo19001a(Editable editable) {
                CardView.m53687D(CardView.this, editable);
            }
        });
        this.f68356d.f107456d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: gg0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardView.m53686E(CardView.this, view, z);
            }
        });
    }

    /* renamed from: F */
    public final void m53685F() {
        this.f68356d.f107457e.setOnChangeListener(new AdyenTextInputEditText.InterfaceC16843b() { // from class: ng0
            @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText.InterfaceC16843b
            /* renamed from: a */
            public final void mo19001a(Editable editable) {
                CardView.m53684G(CardView.this, editable);
            }
        });
        this.f68356d.f107457e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: og0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardView.m53683H(CardView.this, view, z);
            }
        });
    }

    /* renamed from: I */
    public final void m53682I() {
        AdyenTextInputEditText adyenTextInputEditText;
        EditText editText = this.f68356d.f107464l.getEditText();
        if (editText instanceof AdyenTextInputEditText) {
            adyenTextInputEditText = (AdyenTextInputEditText) editText;
        } else {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.InterfaceC16843b() { // from class: hg0
                @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText.InterfaceC16843b
                /* renamed from: a */
                public final void mo19001a(Editable editable) {
                    CardView.m53680K(CardView.this, editable);
                }
            });
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ig0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    CardView.m53681J(CardView.this, view, z);
                }
            });
        }
    }

    /* renamed from: L */
    public final void m53679L() {
        m53678M();
        m53675P();
    }

    /* renamed from: M */
    public final void m53678M() {
        AdyenTextInputEditText adyenTextInputEditText;
        EditText editText = this.f68356d.f107467o.getEditText();
        if (editText instanceof AdyenTextInputEditText) {
            adyenTextInputEditText = (AdyenTextInputEditText) editText;
        } else {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.InterfaceC16843b() { // from class: bg0
                @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText.InterfaceC16843b
                /* renamed from: a */
                public final void mo19001a(Editable editable) {
                    CardView.m53677N(CardView.this, editable);
                }
            });
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: cg0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    CardView.m53676O(CardView.this, view, z);
                }
            });
        }
    }

    /* renamed from: P */
    public final void m53675P() {
        AdyenTextInputEditText adyenTextInputEditText;
        EditText editText = this.f68356d.f107468p.getEditText();
        if (editText instanceof AdyenTextInputEditText) {
            adyenTextInputEditText = (AdyenTextInputEditText) editText;
        } else {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.InterfaceC16843b() { // from class: pg0
                @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText.InterfaceC16843b
                /* renamed from: a */
                public final void mo19001a(Editable editable) {
                    CardView.m53674Q(CardView.this, editable);
                }
            });
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ag0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    CardView.m53673R(CardView.this, view, z);
                }
            });
        }
    }

    /* renamed from: S */
    public final void m53672S() {
        AdyenTextInputEditText adyenTextInputEditText;
        EditText editText = this.f68356d.f107469q.getEditText();
        if (editText instanceof AdyenTextInputEditText) {
            adyenTextInputEditText = (AdyenTextInputEditText) editText;
        } else {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.InterfaceC16843b() { // from class: dg0
                @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText.InterfaceC16843b
                /* renamed from: a */
                public final void mo19001a(Editable editable) {
                    CardView.m53671T(CardView.this, editable);
                }
            });
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: eg0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    CardView.m53670U(CardView.this, view, z);
                }
            });
        }
    }

    /* renamed from: V */
    public final void m53669V() {
        SecurityCodeInput securityCodeInput;
        EditText editText = this.f68356d.f107470r.getEditText();
        if (editText instanceof SecurityCodeInput) {
            securityCodeInput = (SecurityCodeInput) editText;
        } else {
            securityCodeInput = null;
        }
        if (securityCodeInput != null) {
            securityCodeInput.setOnChangeListener(new AdyenTextInputEditText.InterfaceC16843b() { // from class: jg0
                @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText.InterfaceC16843b
                /* renamed from: a */
                public final void mo19001a(Editable editable) {
                    CardView.m53668W(CardView.this, editable);
                }
            });
        }
        if (securityCodeInput != null) {
            securityCodeInput.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kg0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    CardView.m53667X(CardView.this, view, z);
                }
            });
        }
    }

    /* renamed from: Y */
    public final void m53666Y() {
        AdyenTextInputEditText adyenTextInputEditText;
        EditText editText = this.f68356d.f107471s.getEditText();
        if (editText instanceof AdyenTextInputEditText) {
            adyenTextInputEditText = (AdyenTextInputEditText) editText;
        } else {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.InterfaceC16843b() { // from class: lg0
                @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText.InterfaceC16843b
                /* renamed from: a */
                public final void mo19001a(Editable editable) {
                    CardView.m53665Z(CardView.this, editable);
                }
            });
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: mg0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    CardView.m53664a0(CardView.this, view, z);
                }
            });
        }
    }

    @Override // p000.InterfaceC41796gt0
    /* renamed from: a */
    public void mo37366a() {
        int i;
        m53688C();
        m53685F();
        m53669V();
        m53682I();
        m53666Y();
        m53679L();
        m53672S();
        this.f68356d.f107463k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Zf0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CardView.m53663b0(CardView.this, compoundButton, z);
            }
        });
        if (m53584d().m3035C()) {
            C33296Hf0 m3037A = m53584d().m3037A();
            if (m3037A != null) {
                m53650k0(m3037A);
            }
        } else {
            TextInputLayout textInputLayout = this.f68356d.f107464l;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "binding.textInputLayoutCardHolder");
            int i2 = 0;
            if (m53584d().m3036B()) {
                i = 0;
            } else {
                i = 8;
            }
            textInputLayout.setVisibility(i);
            SwitchCompat switchCompat = this.f68356d.f107463k;
            Intrinsics.checkNotNullExpressionValue(switchCompat, "binding.switchStorePaymentMethod");
            if (!m53584d().m3027K()) {
                i2 = 8;
            }
            switchCompat.setVisibility(i2);
        }
        m53662c0();
    }

    @Override // p000.InterfaceC41796gt0
    /* renamed from: b */
    public void mo37365b() {
        C52845zX1.C31036b c31036b = C52845zX1.f121488d;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f68358f = c31036b.m1247a(context, ((CardConfiguration) m53584d().mo88649d()).m53595b());
    }

    /* renamed from: c0 */
    public final void m53662c0() {
        m53584d().m10669i(this.f68357e);
    }

    /* renamed from: d0 */
    public final void m53661d0(List<T11> list) {
        boolean z = false;
        if (list.isEmpty()) {
            this.f68356d.f107454b.setStrokeWidth(0.0f);
            this.f68356d.f107454b.setImageResource(C49378tg4.ic_card);
            this.f68356d.f107456d.setAmexCardFormat(false);
            return;
        }
        this.f68356d.f107454b.setStrokeWidth(4.0f);
        C52845zX1 c52845zX1 = this.f68358f;
        if (c52845zX1 != null) {
            String m76729c = list.get(0).m84423b().m76729c();
            Intrinsics.checkNotNullExpressionValue(m76729c, "detectedCardTypes[0].cardType.txVariant");
            RoundCornerImageView roundCornerImageView = this.f68356d.f107454b;
            Intrinsics.checkNotNullExpressionValue(roundCornerImageView, "binding.cardBrandLogoImageView");
            c52845zX1.m1251d(m76729c, roundCornerImageView, 0, C49378tg4.ic_card);
        }
        for (T11 t11 : list) {
            if (t11.m84424a() == EnumC37040Xf0.AMERICAN_EXPRESS) {
                z = true;
            }
        }
        this.f68356d.f107456d.setAmexCardFormat(z);
    }

    @Override // p000.InterfaceC41056fe3
    /* renamed from: e0 */
    public void onChanged(C36806Wf0 c36806Wf0) {
        EditText editText;
        if (c36806Wf0 != null) {
            m53661d0(c36806Wf0.m78042c());
            m53659f0(c36806Wf0.m78041d());
            m53652j0(c36806Wf0.m78031n());
            m53656h0(c36806Wf0.m78033l());
            m53654i0(c36806Wf0.m78032m());
            m53690A(c36806Wf0.m78043b());
            m53689B(c36806Wf0.m78040e());
        }
        if (m53584d().m3035C() && m53584d().m3028J() && (editText = this.f68356d.f107470r.getEditText()) != null) {
            editText.requestFocus();
        }
    }

    @Override // com.adyen.checkout.components.p024ui.view.AdyenLinearLayout
    /* renamed from: f */
    public void mo53582f(Context localizedContext) {
        Intrinsics.checkNotNullParameter(localizedContext, "localizedContext");
        int[] iArr = {16843088};
        TypedArray obtainStyledAttributes = localizedContext.obtainStyledAttributes(C32652El4.AdyenCheckout_Card_CardNumberInput, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "localizedContext.obtainStyledAttributes(R.style.AdyenCheckout_Card_CardNumberInput, myAttrs)");
        this.f68356d.f107465m.setHint(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = localizedContext.obtainStyledAttributes(C32652El4.AdyenCheckout_Card_ExpiryDateInput, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes2, "localizedContext.obtainStyledAttributes(R.style.AdyenCheckout_Card_ExpiryDateInput, myAttrs)");
        this.f68356d.f107466n.setHint(obtainStyledAttributes2.getString(0));
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = localizedContext.obtainStyledAttributes(C32652El4.AdyenCheckout_Card_SecurityCodeInput, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes3, "localizedContext.obtainStyledAttributes(R.style.AdyenCheckout_Card_SecurityCodeInput, myAttrs)");
        this.f68356d.f107470r.setHint(obtainStyledAttributes3.getString(0));
        obtainStyledAttributes3.recycle();
        TypedArray obtainStyledAttributes4 = localizedContext.obtainStyledAttributes(C32652El4.AdyenCheckout_Card_HolderNameInput, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes4, "localizedContext.obtainStyledAttributes(R.style.AdyenCheckout_Card_HolderNameInput, myAttrs)");
        this.f68356d.f107464l.setHint(obtainStyledAttributes4.getString(0));
        obtainStyledAttributes4.recycle();
        TypedArray obtainStyledAttributes5 = localizedContext.obtainStyledAttributes(C32652El4.AdyenCheckout_Card_PostalCodeInput, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes5, "localizedContext.obtainStyledAttributes(R.style.AdyenCheckout_Card_PostalCodeInput, myAttrs)");
        this.f68356d.f107469q.setHint(obtainStyledAttributes5.getString(0));
        obtainStyledAttributes5.recycle();
        TypedArray obtainStyledAttributes6 = localizedContext.obtainStyledAttributes(C32652El4.AdyenCheckout_Card_StorePaymentSwitch, new int[]{16843087});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes6, "localizedContext.obtainStyledAttributes(R.style.AdyenCheckout_Card_StorePaymentSwitch, myAttrs)");
        this.f68356d.f107463k.setText(obtainStyledAttributes6.getString(0));
        obtainStyledAttributes6.recycle();
    }

    /* renamed from: f0 */
    public final void m53659f0(C37320Yk1<C50580vi1> c37320Yk1) {
        if (c37320Yk1.m74342a().m6431a()) {
            m53635z(this.f68356d.f107457e);
        }
    }

    @Override // com.adyen.checkout.components.p024ui.view.AdyenLinearLayout
    /* renamed from: g */
    public void mo53581g(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        m53584d().m10662p(lifecycleOwner, this);
    }

    /* renamed from: g0 */
    public final void m53658g0(Integer num) {
        if (num == null) {
            this.f68356d.f107465m.setError(null);
            RoundCornerImageView roundCornerImageView = this.f68356d.f107454b;
            Intrinsics.checkNotNullExpressionValue(roundCornerImageView, "binding.cardBrandLogoImageView");
            roundCornerImageView.setVisibility(0);
            return;
        }
        this.f68356d.f107465m.setError(this.f68422c.getString(num.intValue()));
        RoundCornerImageView roundCornerImageView2 = this.f68356d.f107454b;
        Intrinsics.checkNotNullExpressionValue(roundCornerImageView2, "binding.cardBrandLogoImageView");
        roundCornerImageView2.setVisibility(8);
    }

    /* renamed from: h0 */
    public final void m53656h0(boolean z) {
        int i;
        TextInputLayout textInputLayout = this.f68356d.f107467o;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "binding.textInputLayoutKcpBirthDateOrTaxNumber");
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textInputLayout.setVisibility(i);
        TextInputLayout textInputLayout2 = this.f68356d.f107468p;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "binding.textInputLayoutKcpCardPassword");
        if (!z) {
            i2 = 8;
        }
        textInputLayout2.setVisibility(i2);
    }

    /* renamed from: i0 */
    public final void m53654i0(boolean z) {
        int i;
        TextInputLayout textInputLayout = this.f68356d.f107469q;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "binding.textInputLayoutPostalCode");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textInputLayout.setVisibility(i);
    }

    /* renamed from: j0 */
    public final void m53652j0(boolean z) {
        int i;
        TextInputLayout textInputLayout = this.f68356d.f107471s;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "binding.textInputLayoutSocialSecurityNumber");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textInputLayout.setVisibility(i);
    }

    /* renamed from: k0 */
    public final void m53650k0(C33296Hf0 c33296Hf0) {
        this.f68356d.f107456d.setText(this.f68422c.getString(C37557Zk4.card_number_4digit, c33296Hf0.m103574a()));
        this.f68356d.f107456d.setEnabled(false);
        this.f68356d.f107457e.setDate(c33296Hf0.m103573b());
        this.f68356d.f107457e.setEnabled(false);
        SwitchCompat switchCompat = this.f68356d.f107463k;
        Intrinsics.checkNotNullExpressionValue(switchCompat, "binding.switchStorePaymentMethod");
        switchCompat.setVisibility(8);
        TextInputLayout textInputLayout = this.f68356d.f107464l;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "binding.textInputLayoutCardHolder");
        textInputLayout.setVisibility(8);
        TextInputLayout textInputLayout2 = this.f68356d.f107469q;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "binding.textInputLayoutPostalCode");
        textInputLayout2.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Window window;
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Activity m53636y = m53636y(context);
        if (m53636y != null && (window = m53636y.getWindow()) != null) {
            window.addFlags(8192);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Window window;
        super.onDetachedFromWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Activity m53636y = m53636y(context);
        if (m53636y != null && (window = m53636y.getWindow()) != null) {
            window.clearFlags(8192);
        }
    }

    /* renamed from: y */
    public final Activity m53636y(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "context.baseContext");
            return m53636y(baseContext);
        }
        return null;
    }

    /* renamed from: z */
    public final void m53635z(View view) {
        if (getRootView().findFocus() == view && view != null) {
            findViewById(view.getNextFocusForwardId()).requestFocus();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C48189rg0 m15586b = C48189rg0.m15586b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(m15586b, "inflate(LayoutInflater.from(context), this)");
        this.f68356d = m15586b;
        this.f68357e = new C33296Hf0(null, null, null, null, null, null, null, null, false, 511, null);
        setOrientation(1);
        int dimension = (int) getResources().getDimension(C38095ag4.standard_margin);
        setPadding(dimension, dimension, dimension, 0);
    }
}
