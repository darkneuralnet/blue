package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC11685m;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.DB6;
/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes6.dex */
public final class C17780c<S> extends DialogInterface$OnCancelListenerC11663c {

    /* renamed from: B */
    public static final Object f72731B = "CONFIRM_BUTTON_TAG";

    /* renamed from: C */
    public static final Object f72732C = "CANCEL_BUTTON_TAG";

    /* renamed from: D */
    public static final Object f72733D = "TOGGLE_BUTTON_TAG";

    /* renamed from: A */
    public CharSequence f72734A;

    /* renamed from: b */
    public final LinkedHashSet<MM2<? super S>> f72735b = new LinkedHashSet<>();

    /* renamed from: c */
    public final LinkedHashSet<View.OnClickListener> f72736c = new LinkedHashSet<>();

    /* renamed from: d */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f72737d = new LinkedHashSet<>();

    /* renamed from: e */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f72738e = new LinkedHashSet<>();

    /* renamed from: f */
    public int f72739f;

    /* renamed from: g */
    public DateSelector<S> f72740g;

    /* renamed from: h */
    public AbstractC45104mT3<S> f72741h;

    /* renamed from: i */
    public CalendarConstraints f72742i;

    /* renamed from: j */
    public DayViewDecorator f72743j;

    /* renamed from: k */
    public C17766b<S> f72744k;

    /* renamed from: l */
    public int f72745l;

    /* renamed from: m */
    public CharSequence f72746m;

    /* renamed from: n */
    public boolean f72747n;

    /* renamed from: o */
    public int f72748o;

    /* renamed from: p */
    public int f72749p;

    /* renamed from: q */
    public CharSequence f72750q;

    /* renamed from: r */
    public int f72751r;

    /* renamed from: s */
    public CharSequence f72752s;

    /* renamed from: t */
    public TextView f72753t;

    /* renamed from: u */
    public TextView f72754u;

    /* renamed from: v */
    public CheckableImageButton f72755v;

    /* renamed from: w */
    public PM2 f72756w;

    /* renamed from: x */
    public Button f72757x;

    /* renamed from: y */
    public boolean f72758y;

    /* renamed from: z */
    public CharSequence f72759z;

    /* renamed from: com.google.android.material.datepicker.c$a */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC17781a implements View.OnClickListener {
        public View$OnClickListenerC17781a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C17780c.this.f72735b.iterator();
            while (it.hasNext()) {
                ((MM2) it.next()).mo28922a(C17780c.this.m49628ia());
            }
            C17780c.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.c$b */
    /* loaded from: classes6.dex */
    public class C17782b extends C5148M1 {
        public C17782b() {
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            c27125p2.m20072j0(C17780c.this.m49634T9().getError() + ", " + ((Object) c27125p2.m20041z()));
        }
    }

    /* renamed from: com.google.android.material.datepicker.c$c */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC17783c implements View.OnClickListener {
        public View$OnClickListenerC17783c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C17780c.this.f72736c.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C17780c.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.c$d */
    /* loaded from: classes6.dex */
    public class C17784d implements InterfaceC36332Ue3 {

        /* renamed from: b */
        public final /* synthetic */ int f72763b;

        /* renamed from: c */
        public final /* synthetic */ View f72764c;

        /* renamed from: d */
        public final /* synthetic */ int f72765d;

        public C17784d(int i, View view, int i2) {
            this.f72763b = i;
            this.f72764c = view;
            this.f72765d = i2;
        }

        @Override // p000.InterfaceC36332Ue3
        /* renamed from: a */
        public DB6 mo7930a(View view, DB6 db6) {
            int i = db6.m110784f(DB6.C1428m.m110715h()).f5127b;
            if (this.f72763b >= 0) {
                this.f72764c.getLayoutParams().height = this.f72763b + i;
                View view2 = this.f72764c;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f72764c;
            view3.setPadding(view3.getPaddingLeft(), this.f72765d + i, this.f72764c.getPaddingRight(), this.f72764c.getPaddingBottom());
            return db6;
        }
    }

    /* renamed from: com.google.android.material.datepicker.c$e */
    /* loaded from: classes6.dex */
    public class C17785e extends AbstractC43458jh3<S> {
        public C17785e() {
        }

        @Override // p000.AbstractC43458jh3
        /* renamed from: a */
        public void mo30094a() {
            C17780c.this.f72757x.setEnabled(false);
        }

        @Override // p000.AbstractC43458jh3
        /* renamed from: b */
        public void mo30093b(S s) {
            C17780c c17780c = C17780c.this;
            c17780c.m49645Ca(c17780c.m49630fa());
            C17780c.this.f72757x.setEnabled(C17780c.this.m49634T9().mo49688n1());
        }
    }

    /* renamed from: com.google.android.material.datepicker.c$f */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC17786f implements View.OnClickListener {
        public View$OnClickListenerC17786f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C17780c.this.f72757x.setEnabled(C17780c.this.m49634T9().mo49688n1());
            C17780c.this.f72755v.toggle();
            C17780c c17780c = C17780c.this;
            c17780c.m49641Ea(c17780c.f72755v);
            C17780c.this.m49646Ba();
        }
    }

    /* renamed from: com.google.android.material.datepicker.c$g */
    /* loaded from: classes6.dex */
    public static final class C17787g<S> {

        /* renamed from: a */
        public final DateSelector<S> f72769a;

        /* renamed from: c */
        public CalendarConstraints f72771c;

        /* renamed from: d */
        public DayViewDecorator f72772d;

        /* renamed from: b */
        public int f72770b = 0;

        /* renamed from: e */
        public int f72773e = 0;

        /* renamed from: f */
        public CharSequence f72774f = null;

        /* renamed from: g */
        public int f72775g = 0;

        /* renamed from: h */
        public CharSequence f72776h = null;

        /* renamed from: i */
        public int f72777i = 0;

        /* renamed from: j */
        public CharSequence f72778j = null;

        /* renamed from: k */
        public S f72779k = null;

        /* renamed from: l */
        public int f72780l = 0;

        public C17787g(DateSelector<S> dateSelector) {
            this.f72769a = dateSelector;
        }

        /* renamed from: c */
        public static C17787g<Long> m49618c() {
            return new C17787g<>(new SingleDateSelector());
        }

        /* renamed from: d */
        public static C17787g<C48526sE3<Long, Long>> m49617d() {
            return new C17787g<>(new RangeDateSelector());
        }

        /* renamed from: e */
        public static boolean m49616e(Month month, CalendarConstraints calendarConstraints) {
            if (month.compareTo(calendarConstraints.m49762m()) >= 0 && month.compareTo(calendarConstraints.m49766i()) <= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public C17780c<S> m49620a() {
            if (this.f72771c == null) {
                this.f72771c = new CalendarConstraints.C17751b().m49756a();
            }
            if (this.f72773e == 0) {
                this.f72773e = this.f72769a.mo49694c0();
            }
            S s = this.f72779k;
            if (s != null) {
                this.f72769a.mo49699J0(s);
            }
            if (this.f72771c.m49763l() == null) {
                this.f72771c.m49759p(m49619b());
            }
            return C17780c.m49621ya(this);
        }

        /* renamed from: b */
        public final Month m49619b() {
            if (!this.f72769a.mo49687s1().isEmpty()) {
                Month m49726c = Month.m49726c(this.f72769a.mo49687s1().iterator().next().longValue());
                if (m49616e(m49726c, this.f72771c)) {
                    return m49726c;
                }
            }
            Month m49725d = Month.m49725d();
            if (!m49616e(m49725d, this.f72771c)) {
                return this.f72771c.m49762m();
            }
            return m49725d;
        }

        /* renamed from: f */
        public C17787g<S> m49615f(CharSequence charSequence) {
            this.f72774f = charSequence;
            this.f72773e = 0;
            return this;
        }
    }

    /* renamed from: Aa */
    public static boolean m49648Aa(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(BM2.m114082d(context, C49961uf4.materialCalendarStyle, C17766b.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: P9 */
    public static Drawable m49636P9(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C29611vi.m8248b(context, C52935zg4.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C29611vi.m8248b(context, C52935zg4.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: da */
    public static CharSequence m49632da(CharSequence charSequence) {
        if (charSequence != null) {
            String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                return split[0];
            }
            return charSequence;
        }
        return null;
    }

    /* renamed from: ha */
    public static int m49629ha(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C35172Pf4.mtrl_calendar_content_padding);
        int i = Month.m49725d().f72660e;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C35172Pf4.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C35172Pf4.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: oa */
    public static boolean m49625oa(Context context) {
        return m49648Aa(context, 16843277);
    }

    /* renamed from: va */
    public static boolean m49622va(Context context) {
        return m49648Aa(context, C49961uf4.nestedScrollable);
    }

    /* renamed from: ya */
    public static <S> C17780c<S> m49621ya(C17787g<S> c17787g) {
        C17780c<S> c17780c = new C17780c<>();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", c17787g.f72770b);
        bundle.putParcelable("DATE_SELECTOR_KEY", c17787g.f72769a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c17787g.f72771c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", c17787g.f72772d);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", c17787g.f72773e);
        bundle.putCharSequence("TITLE_TEXT_KEY", c17787g.f72774f);
        bundle.putInt("INPUT_MODE_KEY", c17787g.f72780l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", c17787g.f72775g);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", c17787g.f72776h);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", c17787g.f72777i);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", c17787g.f72778j);
        c17780c.setArguments(bundle);
        return c17780c;
    }

    /* renamed from: Ba */
    public final void m49646Ba() {
        AbstractC45104mT3<S> abstractC45104mT3;
        int m49627la = m49627la(requireContext());
        this.f72744k = C17766b.m49658la(m49634T9(), m49627la, this.f72742i, this.f72743j);
        boolean isChecked = this.f72755v.isChecked();
        if (isChecked) {
            abstractC45104mT3 = RM2.m86810t8(m49634T9(), m49627la, this.f72742i);
        } else {
            abstractC45104mT3 = this.f72744k;
        }
        this.f72741h = abstractC45104mT3;
        m49643Da(isChecked);
        m49645Ca(m49630fa());
        AbstractC11685m m67311q = getChildFragmentManager().m67311q();
        m67311q.m67104t(C33795Ji4.mtrl_calendar_frame, this.f72741h);
        m67311q.mo67113k();
        this.f72741h.mo25544a5(new C17785e());
    }

    /* renamed from: Ca */
    public void m49645Ca(String str) {
        this.f72754u.setContentDescription(m49631ea());
        this.f72754u.setText(str);
    }

    /* renamed from: Da */
    public final void m49643Da(boolean z) {
        CharSequence charSequence;
        TextView textView = this.f72753t;
        if (z && m49624sa()) {
            charSequence = this.f72734A;
        } else {
            charSequence = this.f72759z;
        }
        textView.setText(charSequence);
    }

    /* renamed from: Ea */
    public final void m49641Ea(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f72755v.isChecked()) {
            string = checkableImageButton.getContext().getString(C40534el4.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(C40534el4.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f72755v.setContentDescription(string);
    }

    /* renamed from: G9 */
    public boolean m49640G9(DialogInterface.OnCancelListener onCancelListener) {
        return this.f72737d.add(onCancelListener);
    }

    /* renamed from: I9 */
    public boolean m49639I9(View.OnClickListener onClickListener) {
        return this.f72736c.add(onClickListener);
    }

    /* renamed from: J9 */
    public boolean m49638J9(MM2<? super S> mm2) {
        return this.f72735b.add(mm2);
    }

    /* renamed from: S9 */
    public final void m49635S9(Window window) {
        if (this.f72758y) {
            return;
        }
        View findViewById = requireView().findViewById(C33795Ji4.fullscreen_header);
        K91.m99126a(window, true, C36704Vt6.m79302f(findViewById), null);
        C38790bq6.m62531L0(findViewById, new C17784d(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.f72758y = true;
    }

    /* renamed from: T9 */
    public final DateSelector<S> m49634T9() {
        if (this.f72740g == null) {
            this.f72740g = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f72740g;
    }

    /* renamed from: ea */
    public final String m49631ea() {
        return m49634T9().mo49690h2(requireContext());
    }

    /* renamed from: fa */
    public String m49630fa() {
        return m49634T9().mo49701E2(getContext());
    }

    /* renamed from: ia */
    public final S m49628ia() {
        return m49634T9().mo49686t1();
    }

    /* renamed from: la */
    public final int m49627la(Context context) {
        int i = this.f72739f;
        if (i != 0) {
            return i;
        }
        return m49634T9().mo49689k0(context);
    }

    /* renamed from: ma */
    public final void m49626ma(Context context) {
        boolean z;
        this.f72755v.setTag(f72733D);
        this.f72755v.setImageDrawable(m49636P9(context));
        CheckableImageButton checkableImageButton = this.f72755v;
        if (this.f72748o != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton.setChecked(z);
        C38790bq6.m62452v0(this.f72755v, null);
        m49641Ea(this.f72755v);
        this.f72755v.setOnClickListener(new View$OnClickListenerC17786f());
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f72737d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f72739f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f72740g = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f72742i = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f72743j = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f72745l = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f72746m = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f72748o = bundle.getInt("INPUT_MODE_KEY");
        this.f72749p = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f72750q = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f72751r = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f72752s = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f72746m;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f72745l);
        }
        this.f72759z = charSequence;
        this.f72734A = m49632da(charSequence);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m49627la(requireContext()));
        Context context = dialog.getContext();
        this.f72747n = m49625oa(context);
        int m114082d = BM2.m114082d(context, C49961uf4.colorSurface, C17780c.class.getCanonicalName());
        PM2 pm2 = new PM2(context, null, C49961uf4.materialCalendarStyle, C50021ul4.Widget_MaterialComponents_MaterialCalendar);
        this.f72756w = pm2;
        pm2.m90427P(context);
        this.f72756w.m90416a0(ColorStateList.valueOf(m114082d));
        this.f72756w.m90417Z(C38790bq6.m62447y(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.f72747n) {
            i = C50603vk4.mtrl_picker_fullscreen;
        } else {
            i = C50603vk4.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        DayViewDecorator dayViewDecorator = this.f72743j;
        if (dayViewDecorator != null) {
            dayViewDecorator.m49734h(context);
        }
        if (this.f72747n) {
            inflate.findViewById(C33795Ji4.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m49629ha(context), -2));
        } else {
            inflate.findViewById(C33795Ji4.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m49629ha(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C33795Ji4.mtrl_picker_header_selection_text);
        this.f72754u = textView;
        C38790bq6.m62448x0(textView, 1);
        this.f72755v = (CheckableImageButton) inflate.findViewById(C33795Ji4.mtrl_picker_header_toggle);
        this.f72753t = (TextView) inflate.findViewById(C33795Ji4.mtrl_picker_title_text);
        m49626ma(context);
        this.f72757x = (Button) inflate.findViewById(C33795Ji4.confirm_button);
        if (m49634T9().mo49688n1()) {
            this.f72757x.setEnabled(true);
        } else {
            this.f72757x.setEnabled(false);
        }
        this.f72757x.setTag(f72731B);
        CharSequence charSequence = this.f72750q;
        if (charSequence != null) {
            this.f72757x.setText(charSequence);
        } else {
            int i2 = this.f72749p;
            if (i2 != 0) {
                this.f72757x.setText(i2);
            }
        }
        this.f72757x.setOnClickListener(new View$OnClickListenerC17781a());
        C38790bq6.m62452v0(this.f72757x, new C17782b());
        Button button = (Button) inflate.findViewById(C33795Ji4.cancel_button);
        button.setTag(f72732C);
        CharSequence charSequence2 = this.f72752s;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i3 = this.f72751r;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new View$OnClickListenerC17783c());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f72738e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f72739f);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f72740g);
        CalendarConstraints.C17751b c17751b = new CalendarConstraints.C17751b(this.f72742i);
        if (this.f72744k.m49663da() != null) {
            c17751b.m49755b(this.f72744k.m49663da().f72662g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c17751b.m49756a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f72743j);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f72745l);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f72746m);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f72749p);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f72750q);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f72751r);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f72752s);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f72747n) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f72756w);
            m49635S9(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C35172Pf4.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f72756w, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new B32(requireDialog(), rect));
        }
        m49646Ba();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onStop() {
        this.f72741h.m25545N6();
        super.onStop();
    }

    /* renamed from: sa */
    public final boolean m49624sa() {
        return getResources().getConfiguration().orientation == 2;
    }
}
