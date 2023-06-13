package p000;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import java.util.Iterator;
/* renamed from: RM2 */
/* loaded from: classes6.dex */
public final class RM2<S> extends AbstractC45104mT3<S> {

    /* renamed from: c */
    public int f31951c;

    /* renamed from: d */
    public DateSelector<S> f31952d;

    /* renamed from: e */
    public CalendarConstraints f31953e;

    /* renamed from: RM2$a */
    /* loaded from: classes6.dex */
    public class C7156a extends AbstractC43458jh3<S> {
        public C7156a() {
        }

        @Override // p000.AbstractC43458jh3
        /* renamed from: a */
        public void mo30094a() {
            Iterator<AbstractC43458jh3<S>> it = RM2.this.f98072b.iterator();
            while (it.hasNext()) {
                it.next().mo30094a();
            }
        }

        @Override // p000.AbstractC43458jh3
        /* renamed from: b */
        public void mo30093b(S s) {
            Iterator<AbstractC43458jh3<S>> it = RM2.this.f98072b.iterator();
            while (it.hasNext()) {
                it.next().mo30093b(s);
            }
        }
    }

    /* renamed from: t8 */
    public static <T> RM2<T> m86810t8(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        RM2<T> rm2 = new RM2<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        rm2.setArguments(bundle);
        return rm2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f31951c = bundle.getInt("THEME_RES_ID_KEY");
        this.f31952d = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f31953e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f31952d.mo49698K1(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f31951c)), viewGroup, bundle, this.f31953e, new C7156a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f31951c);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f31952d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f31953e);
    }
}
