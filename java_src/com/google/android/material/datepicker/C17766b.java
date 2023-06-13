package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.C11947r;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes6.dex */
public final class C17766b<S> extends AbstractC45104mT3<S> {

    /* renamed from: p */
    public static final Object f72692p = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: q */
    public static final Object f72693q = "NAVIGATION_PREV_TAG";

    /* renamed from: r */
    public static final Object f72694r = "NAVIGATION_NEXT_TAG";

    /* renamed from: s */
    public static final Object f72695s = "SELECTOR_TOGGLE_TAG";

    /* renamed from: c */
    public int f72696c;

    /* renamed from: d */
    public DateSelector<S> f72697d;

    /* renamed from: e */
    public CalendarConstraints f72698e;

    /* renamed from: f */
    public DayViewDecorator f72699f;

    /* renamed from: g */
    public Month f72700g;

    /* renamed from: h */
    public EnumC17778l f72701h;

    /* renamed from: i */
    public C50245v80 f72702i;

    /* renamed from: j */
    public RecyclerView f72703j;

    /* renamed from: k */
    public RecyclerView f72704k;

    /* renamed from: l */
    public View f72705l;

    /* renamed from: m */
    public View f72706m;

    /* renamed from: n */
    public View f72707n;

    /* renamed from: o */
    public View f72708o;

    /* renamed from: com.google.android.material.datepicker.b$a */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC17767a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C17789e f72709b;

        public View$OnClickListenerC17767a(C17789e c17789e) {
            this.f72709b = c17789e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m66704u2 = C17766b.this.m49659ia().m66704u2() - 1;
            if (m66704u2 >= 0) {
                C17766b.this.m49656oa(this.f72709b.m49595p(m66704u2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$b */
    /* loaded from: classes6.dex */
    public class RunnableC17768b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f72711b;

        public RunnableC17768b(int i) {
            this.f72711b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C17766b.this.f72704k.smoothScrollToPosition(this.f72711b);
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$c */
    /* loaded from: classes6.dex */
    public class C17769c extends C5148M1 {
        public C17769c() {
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            c27125p2.m20076h0(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$d */
    /* loaded from: classes6.dex */
    public class C17770d extends ZL5 {

        /* renamed from: J */
        public final /* synthetic */ int f72714J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17770d(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f72714J = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: e2 */
        public void mo49651e2(RecyclerView.C11872z c11872z, int[] iArr) {
            if (this.f72714J == 0) {
                iArr[0] = C17766b.this.f72704k.getWidth();
                iArr[1] = C17766b.this.f72704k.getWidth();
                return;
            }
            iArr[0] = C17766b.this.f72704k.getHeight();
            iArr[1] = C17766b.this.f72704k.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$e */
    /* loaded from: classes6.dex */
    public class C17771e implements InterfaceC17779m {
        public C17771e() {
        }

        @Override // com.google.android.material.datepicker.C17766b.InterfaceC17779m
        /* renamed from: a */
        public void mo49650a(long j) {
            if (C17766b.this.f72698e.m49767h().mo49743l0(j)) {
                C17766b.this.f72697d.mo49685z1(j);
                Iterator<AbstractC43458jh3<S>> it = C17766b.this.f98072b.iterator();
                while (it.hasNext()) {
                    it.next().mo30093b((S) C17766b.this.f72697d.mo49686t1());
                }
                C17766b.this.f72704k.getAdapter().notifyDataSetChanged();
                if (C17766b.this.f72703j != null) {
                    C17766b.this.f72703j.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$f */
    /* loaded from: classes6.dex */
    public class C17772f extends C5148M1 {
        public C17772f() {
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            c27125p2.m20124H0(false);
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$g */
    /* loaded from: classes6.dex */
    public class C17773g extends RecyclerView.AbstractC11854o {

        /* renamed from: b */
        public final Calendar f72718b = C43471ji6.m30049l();

        /* renamed from: c */
        public final Calendar f72719c = C43471ji6.m30049l();

        public C17773g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
            int i;
            int width;
            if ((recyclerView.getAdapter() instanceof C17792f) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C17792f c17792f = (C17792f) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C48526sE3<Long, Long> c48526sE3 : C17766b.this.f72697d.mo49700I2()) {
                    Long l = c48526sE3.f108491a;
                    if (l != null && c48526sE3.f108492b != null) {
                        this.f72718b.setTimeInMillis(l.longValue());
                        this.f72719c.setTimeInMillis(c48526sE3.f108492b.longValue());
                        int m49588q = c17792f.m49588q(this.f72718b.get(1));
                        int m49588q2 = c17792f.m49588q(this.f72719c.get(1));
                        View mo66607W = gridLayoutManager.mo66607W(m49588q);
                        View mo66607W2 = gridLayoutManager.mo66607W(m49588q2);
                        int m66769o3 = m49588q / gridLayoutManager.m66769o3();
                        int m66769o32 = m49588q2 / gridLayoutManager.m66769o3();
                        for (int i2 = m66769o3; i2 <= m66769o32; i2++) {
                            View mo66607W3 = gridLayoutManager.mo66607W(gridLayoutManager.m66769o3() * i2);
                            if (mo66607W3 != null) {
                                int top = mo66607W3.getTop() + C17766b.this.f72702i.f113576d.m10822c();
                                int bottom = mo66607W3.getBottom() - C17766b.this.f72702i.f113576d.m10823b();
                                if (i2 == m66769o3) {
                                    i = mo66607W.getLeft() + (mo66607W.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i2 == m66769o32) {
                                    width = mo66607W2.getLeft() + (mo66607W2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(i, top, width, bottom, C17766b.this.f72702i.f113580h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$h */
    /* loaded from: classes6.dex */
    public class C17774h extends C5148M1 {
        public C17774h() {
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            String string;
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            if (C17766b.this.f72708o.getVisibility() == 0) {
                string = C17766b.this.getString(C40534el4.mtrl_picker_toggle_to_year_selection);
            } else {
                string = C17766b.this.getString(C40534el4.mtrl_picker_toggle_to_day_selection);
            }
            c27125p2.m20054s0(string);
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$i */
    /* loaded from: classes6.dex */
    public class C17775i extends RecyclerView.AbstractC11863t {

        /* renamed from: a */
        public final /* synthetic */ C17789e f72722a;

        /* renamed from: b */
        public final /* synthetic */ MaterialButton f72723b;

        public C17775i(C17789e c17789e, MaterialButton materialButton) {
            this.f72722a = c17789e;
            this.f72723b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f72723b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int m66704u2;
            if (i < 0) {
                m66704u2 = C17766b.this.m49659ia().m66707r2();
            } else {
                m66704u2 = C17766b.this.m49659ia().m66704u2();
            }
            C17766b.this.f72700g = this.f72722a.m49595p(m66704u2);
            this.f72723b.setText(this.f72722a.m49594q(m66704u2));
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$j */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC17776j implements View.OnClickListener {
        public View$OnClickListenerC17776j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C17766b.this.m49652ya();
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$k */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC17777k implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C17789e f72726b;

        public View$OnClickListenerC17777k(C17789e c17789e) {
            this.f72726b = c17789e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m66707r2 = C17766b.this.m49659ia().m66707r2() + 1;
            if (m66707r2 < C17766b.this.f72704k.getAdapter().getItemCount()) {
                C17766b.this.m49656oa(this.f72726b.m49595p(m66707r2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$l */
    /* loaded from: classes6.dex */
    public enum EnumC17778l {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.b$m */
    /* loaded from: classes6.dex */
    public interface InterfaceC17779m {
        /* renamed from: a */
        void mo49650a(long j);
    }

    /* renamed from: fa */
    public static int m49661fa(Context context) {
        return context.getResources().getDimensionPixelSize(C35172Pf4.mtrl_calendar_day_height);
    }

    /* renamed from: ha */
    public static int m49660ha(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C35172Pf4.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C35172Pf4.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C35172Pf4.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C35172Pf4.mtrl_calendar_days_of_week_height);
        int i = C17788d.f72781h;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C35172Pf4.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(C35172Pf4.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C35172Pf4.mtrl_calendar_bottom_padding);
    }

    /* renamed from: la */
    public static <T> C17766b<T> m49658la(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        C17766b<T> c17766b = new C17766b<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m49763l());
        c17766b.setArguments(bundle);
        return c17766b;
    }

    /* renamed from: J9 */
    public final void m49667J9(View view, C17789e c17789e) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C33795Ji4.month_navigation_fragment_toggle);
        materialButton.setTag(f72695s);
        C38790bq6.m62452v0(materialButton, new C17774h());
        View findViewById = view.findViewById(C33795Ji4.month_navigation_previous);
        this.f72705l = findViewById;
        findViewById.setTag(f72693q);
        View findViewById2 = view.findViewById(C33795Ji4.month_navigation_next);
        this.f72706m = findViewById2;
        findViewById2.setTag(f72694r);
        this.f72707n = view.findViewById(C33795Ji4.mtrl_calendar_year_selector_frame);
        this.f72708o = view.findViewById(C33795Ji4.mtrl_calendar_day_selector_frame);
        m49655sa(EnumC17778l.DAY);
        materialButton.setText(this.f72700g.m49721i());
        this.f72704k.addOnScrollListener(new C17775i(c17789e, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC17776j());
        this.f72706m.setOnClickListener(new View$OnClickListenerC17777k(c17789e));
        this.f72705l.setOnClickListener(new View$OnClickListenerC17767a(c17789e));
    }

    /* renamed from: P9 */
    public final RecyclerView.AbstractC11854o m49666P9() {
        return new C17773g();
    }

    /* renamed from: S9 */
    public CalendarConstraints m49665S9() {
        return this.f72698e;
    }

    /* renamed from: T9 */
    public C50245v80 m49664T9() {
        return this.f72702i;
    }

    @Override // p000.AbstractC45104mT3
    /* renamed from: a5 */
    public boolean mo25544a5(AbstractC43458jh3<S> abstractC43458jh3) {
        return super.mo25544a5(abstractC43458jh3);
    }

    /* renamed from: da */
    public Month m49663da() {
        return this.f72700g;
    }

    /* renamed from: ea */
    public DateSelector<S> m49662ea() {
        return this.f72697d;
    }

    /* renamed from: ia */
    public LinearLayoutManager m49659ia() {
        return (LinearLayoutManager) this.f72704k.getLayoutManager();
    }

    /* renamed from: ma */
    public final void m49657ma(int i) {
        this.f72704k.post(new RunnableC17768b(i));
    }

    /* renamed from: oa */
    public void m49656oa(Month month) {
        boolean z;
        C17789e c17789e = (C17789e) this.f72704k.getAdapter();
        int m49593r = c17789e.m49593r(month);
        int m49593r2 = m49593r - c17789e.m49593r(this.f72700g);
        boolean z2 = true;
        if (Math.abs(m49593r2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (m49593r2 <= 0) {
            z2 = false;
        }
        this.f72700g = month;
        if (z && z2) {
            this.f72704k.scrollToPosition(m49593r - 3);
            m49657ma(m49593r);
        } else if (z) {
            this.f72704k.scrollToPosition(m49593r + 3);
            m49657ma(m49593r);
        } else {
            m49657ma(m49593r);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f72696c = bundle.getInt("THEME_RES_ID_KEY");
        this.f72697d = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f72698e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f72699f = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f72700g = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        C48658sT0 c48658sT0;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f72696c);
        this.f72702i = new C50245v80(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month m49762m = this.f72698e.m49762m();
        if (C17780c.m49625oa(contextThemeWrapper)) {
            i = C50603vk4.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = C50603vk4.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        inflate.setMinimumHeight(m49660ha(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(C33795Ji4.mtrl_calendar_days_of_week);
        C38790bq6.m62452v0(gridView, new C17769c());
        int m49765j = this.f72698e.m49765j();
        if (m49765j > 0) {
            c48658sT0 = new C48658sT0(m49765j);
        } else {
            c48658sT0 = new C48658sT0();
        }
        gridView.setAdapter((ListAdapter) c48658sT0);
        gridView.setNumColumns(m49762m.f72660e);
        gridView.setEnabled(false);
        this.f72704k = (RecyclerView) inflate.findViewById(C33795Ji4.mtrl_calendar_months);
        this.f72704k.setLayoutManager(new C17770d(getContext(), i2, false, i2));
        this.f72704k.setTag(f72692p);
        C17789e c17789e = new C17789e(contextThemeWrapper, this.f72697d, this.f72698e, this.f72699f, new C17771e());
        this.f72704k.setAdapter(c17789e);
        int integer = contextThemeWrapper.getResources().getInteger(C35667Ri4.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C33795Ji4.mtrl_calendar_year_selector_frame);
        this.f72703j = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f72703j.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f72703j.setAdapter(new C17792f(this));
            this.f72703j.addItemDecoration(m49666P9());
        }
        if (inflate.findViewById(C33795Ji4.month_navigation_fragment_toggle) != null) {
            m49667J9(inflate, c17789e);
        }
        if (!C17780c.m49625oa(contextThemeWrapper)) {
            new C11947r().m66132b(this.f72704k);
        }
        this.f72704k.scrollToPosition(c17789e.m49593r(this.f72700g));
        m49653va();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f72696c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f72697d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f72698e);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f72699f);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f72700g);
    }

    /* renamed from: sa */
    public void m49655sa(EnumC17778l enumC17778l) {
        this.f72701h = enumC17778l;
        if (enumC17778l == EnumC17778l.YEAR) {
            this.f72703j.getLayoutManager().mo51857P1(((C17792f) this.f72703j.getAdapter()).m49588q(this.f72700g.f72659d));
            this.f72707n.setVisibility(0);
            this.f72708o.setVisibility(8);
            this.f72705l.setVisibility(8);
            this.f72706m.setVisibility(8);
        } else if (enumC17778l == EnumC17778l.DAY) {
            this.f72707n.setVisibility(8);
            this.f72708o.setVisibility(0);
            this.f72705l.setVisibility(0);
            this.f72706m.setVisibility(0);
            m49656oa(this.f72700g);
        }
    }

    /* renamed from: va */
    public final void m49653va() {
        C38790bq6.m62452v0(this.f72704k, new C17772f());
    }

    /* renamed from: ya */
    public void m49652ya() {
        EnumC17778l enumC17778l = this.f72701h;
        EnumC17778l enumC17778l2 = EnumC17778l.YEAR;
        if (enumC17778l == enumC17778l2) {
            m49655sa(EnumC17778l.DAY);
        } else if (enumC17778l == EnumC17778l.DAY) {
            m49655sa(enumC17778l2);
        }
    }
}
