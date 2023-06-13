package com.adyen.checkout.card.p023ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText;
import java.util.Arrays;
/* renamed from: com.adyen.checkout.card.ui.CardNumberInput */
/* loaded from: classes.dex */
public class CardNumberInput extends AdyenTextInputEditText {

    /* renamed from: d */
    public static final int[] f68382d = {4, 6, 5, 4};

    /* renamed from: e */
    public static final int[] f68383e = {4, 4, 4, 4, 3};

    /* renamed from: c */
    public boolean f68384c;

    public CardNumberInput(Context context) {
        this(context, null);
    }

    @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText
    /* renamed from: a */
    public void mo53580a(Editable editable) {
        String obj = editable.toString();
        String m53610e = m53610e(obj.trim().replaceAll(String.valueOf(' '), ""));
        if (!obj.equals(m53610e)) {
            editable.replace(0, obj.length(), m53610e);
        }
        super.mo53580a(editable);
    }

    @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText
    /* renamed from: c */
    public String mo53578c() {
        return getText().toString().replace(String.valueOf(' '), "");
    }

    /* renamed from: e */
    public final String m53610e(String str) {
        int[] iArr;
        if (this.f68384c) {
            iArr = f68382d;
        } else {
            iArr = f68383e;
        }
        return TextUtils.join(" ", m53609f(str, iArr)).trim();
    }

    /* renamed from: f */
    public final String[] m53609f(String str, int... iArr) {
        String[] strArr = new String[iArr.length];
        Arrays.fill(strArr, "");
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                break;
            }
            int length = str.length();
            int i2 = iArr[i];
            if (length >= i2) {
                strArr[i] = str.substring(0, i2);
                str = str.substring(iArr[i]);
                i++;
            } else {
                strArr[i] = str;
                break;
            }
        }
        return strArr;
    }

    public void setAmexCardFormat(boolean z) {
        if (!this.f68384c && z) {
            this.f68384c = true;
            mo53580a(getEditableText());
            return;
        }
        this.f68384c = z;
    }

    public CardNumberInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardNumberInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m53579b(23);
        setInputType(2);
        setKeyListener(DigitsKeyListener.getInstance("0123456789 "));
    }
}
