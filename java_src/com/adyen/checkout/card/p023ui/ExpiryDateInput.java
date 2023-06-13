package com.adyen.checkout.card.p023ui;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* renamed from: com.adyen.checkout.card.ui.ExpiryDateInput */
/* loaded from: classes.dex */
public class ExpiryDateInput extends AdyenTextInputEditText {

    /* renamed from: d */
    public static final String f68385d = C50139ux2.m9434c();

    /* renamed from: c */
    public final SimpleDateFormat f68386c;

    public ExpiryDateInput(Context context) {
        this(context, null);
    }

    @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText
    /* renamed from: a */
    public void mo53580a(Editable editable) {
        String obj = editable.toString();
        String replaceAll = obj.replaceAll("\\D", "").replaceAll("(\\d{2})(?=\\d)", "$1/");
        if (replaceAll.length() == 1 && m53606g(replaceAll) && Integer.parseInt(replaceAll) > 1) {
            replaceAll = "0" + replaceAll;
        }
        if (!obj.equals(replaceAll)) {
            editable.replace(0, obj.length(), replaceAll);
        }
        super.mo53580a(editable);
    }

    /* renamed from: e */
    public final void m53608e(Calendar calendar) {
        if (calendar.get(1) / 100 < Calendar.getInstance().get(1) / 100) {
            calendar.add(1, 100);
        }
    }

    /* renamed from: f */
    public C50580vi1 m53607f() {
        String m36365b = C42132hS5.m36365b(mo53578c(), new char[0]);
        String str = f68385d;
        C32290Cx2.m111209f(str, "getDate - " + m36365b);
        try {
            Date parse = this.f68386c.parse(m36365b);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parse);
            m53608e(calendar);
            return new C50580vi1(calendar.get(2) + 1, calendar.get(1), true);
        } catch (ParseException e) {
            String str2 = f68385d;
            C32290Cx2.m111214a(str2, "getDate - value does not match expected pattern. " + e.getLocalizedMessage());
            if (mo53578c().isEmpty()) {
                return C50580vi1.f114526d;
            }
            return C50580vi1.f114527e;
        }
    }

    /* renamed from: g */
    public final boolean m53606g(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public void setDate(C50580vi1 c50580vi1) {
        if (c50580vi1 != null && c50580vi1 != C50580vi1.f114526d) {
            String str = f68385d;
            C32290Cx2.m111209f(str, "setDate - " + c50580vi1.m8245b() + " " + c50580vi1.m8246a());
            Calendar calendar = Calendar.getInstance();
            calendar.clear();
            calendar.set(c50580vi1.m8245b(), c50580vi1.m8246a() - 1, 1);
            setText(this.f68386c.format(calendar.getTime()));
            return;
        }
        setText("");
    }

    public ExpiryDateInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpiryDateInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy", Locale.ROOT);
        this.f68386c = simpleDateFormat;
        m53579b(5);
        simpleDateFormat.setLenient(false);
    }
}
