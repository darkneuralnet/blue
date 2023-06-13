package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.datepicker.DateSelector;
import java.util.Collection;
/* loaded from: classes6.dex */
public interface DateSelector<S> extends Parcelable {
    /* renamed from: C0 */
    static /* synthetic */ void m49749C0(EditText[] editTextArr, View view, boolean z) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        C36704Vt6.m79296l(view);
    }

    /* renamed from: b3 */
    static void m49748b3(final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: jT0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                DateSelector.m49749C0(editTextArr, view, z);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        C36704Vt6.m79291q(editTextArr[0]);
    }

    /* renamed from: E2 */
    String mo49701E2(Context context);

    /* renamed from: I2 */
    Collection<C48526sE3<Long, Long>> mo49700I2();

    /* renamed from: J0 */
    void mo49699J0(S s);

    /* renamed from: K1 */
    View mo49698K1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, AbstractC43458jh3<S> abstractC43458jh3);

    /* renamed from: c0 */
    int mo49694c0();

    String getError();

    /* renamed from: h2 */
    String mo49690h2(Context context);

    /* renamed from: k0 */
    int mo49689k0(Context context);

    /* renamed from: n1 */
    boolean mo49688n1();

    /* renamed from: s1 */
    Collection<Long> mo49687s1();

    /* renamed from: t1 */
    S mo49686t1();

    /* renamed from: z1 */
    void mo49685z1(long j);
}
