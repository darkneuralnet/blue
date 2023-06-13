package com.adyen.checkout.components.p024ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
/* renamed from: com.adyen.checkout.components.ui.view.AdyenTextInputEditText */
/* loaded from: classes.dex */
public class AdyenTextInputEditText extends TextInputEditText {

    /* renamed from: b */
    public InterfaceC16843b f68423b;

    /* renamed from: com.adyen.checkout.components.ui.view.AdyenTextInputEditText$a */
    /* loaded from: classes.dex */
    public class C16842a implements TextWatcher {
        public C16842a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AdyenTextInputEditText.this.mo53580a(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.adyen.checkout.components.ui.view.AdyenTextInputEditText$b */
    /* loaded from: classes.dex */
    public interface InterfaceC16843b {
        /* renamed from: a */
        void mo19001a(Editable editable);
    }

    public AdyenTextInputEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo53580a(Editable editable) {
        InterfaceC16843b interfaceC16843b = this.f68423b;
        if (interfaceC16843b != null) {
            interfaceC16843b.mo19001a(editable);
        }
    }

    /* renamed from: b */
    public void m53579b(int i) {
        if (i != -1) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    /* renamed from: c */
    public String mo53578c() {
        return getText() != null ? getText().toString() : "";
    }

    /* renamed from: d */
    public final TextWatcher m53577d() {
        return new C16842a();
    }

    public void setOnChangeListener(InterfaceC16843b interfaceC16843b) {
        this.f68423b = interfaceC16843b;
    }

    public AdyenTextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdyenTextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i == 0 ? C49961uf4.editTextStyle : i);
        addTextChangedListener(m53577d());
    }
}
