package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ListPopupWindow implements InterfaceC52642zA5 {

    /* renamed from: H */
    public static Method f52175H;

    /* renamed from: I */
    public static Method f52176I;

    /* renamed from: A */
    public final RunnableC11092e f52177A;

    /* renamed from: B */
    public Runnable f52178B;

    /* renamed from: C */
    public final Handler f52179C;

    /* renamed from: D */
    public final Rect f52180D;

    /* renamed from: E */
    public Rect f52181E;

    /* renamed from: F */
    public boolean f52182F;

    /* renamed from: G */
    public PopupWindow f52183G;

    /* renamed from: b */
    public Context f52184b;

    /* renamed from: c */
    public ListAdapter f52185c;

    /* renamed from: d */
    public R71 f52186d;

    /* renamed from: e */
    public int f52187e;

    /* renamed from: f */
    public int f52188f;

    /* renamed from: g */
    public int f52189g;

    /* renamed from: h */
    public int f52190h;

    /* renamed from: i */
    public int f52191i;

    /* renamed from: j */
    public boolean f52192j;

    /* renamed from: k */
    public boolean f52193k;

    /* renamed from: l */
    public boolean f52194l;

    /* renamed from: m */
    public int f52195m;

    /* renamed from: n */
    public boolean f52196n;

    /* renamed from: o */
    public boolean f52197o;

    /* renamed from: p */
    public int f52198p;

    /* renamed from: q */
    public View f52199q;

    /* renamed from: r */
    public int f52200r;

    /* renamed from: s */
    public DataSetObserver f52201s;

    /* renamed from: t */
    public View f52202t;

    /* renamed from: u */
    public Drawable f52203u;

    /* renamed from: v */
    public AdapterView.OnItemClickListener f52204v;

    /* renamed from: w */
    public AdapterView.OnItemSelectedListener f52205w;

    /* renamed from: x */
    public final RunnableC11096i f52206x;

    /* renamed from: y */
    public final View$OnTouchListenerC11095h f52207y;

    /* renamed from: z */
    public final C11094g f52208z;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    /* loaded from: classes.dex */
    public class RunnableC11088a implements Runnable {
        public RunnableC11088a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m69879t = ListPopupWindow.this.m69879t();
            if (m69879t != null && m69879t.getWindowToken() != null) {
                ListPopupWindow.this.mo1722a();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    /* loaded from: classes.dex */
    public class C11089b implements AdapterView.OnItemSelectedListener {
        public C11089b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            R71 r71;
            if (i != -1 && (r71 = ListPopupWindow.this.f52186d) != null) {
                r71.m87299i(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    /* loaded from: classes.dex */
    public static class C11090c {
        private C11090c() {
        }

        /* renamed from: a */
        public static int m69872a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    /* loaded from: classes.dex */
    public static class C11091d {
        private C11091d() {
        }

        /* renamed from: a */
        public static void m69871a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        public static void m69870b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    /* loaded from: classes.dex */
    public class RunnableC11092e implements Runnable {
        public RunnableC11092e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.m69880r();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$f */
    /* loaded from: classes.dex */
    public class C11093f extends DataSetObserver {
        public C11093f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.mo1721c()) {
                ListPopupWindow.this.mo1722a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$g */
    /* loaded from: classes.dex */
    public class C11094g implements AbsListView.OnScrollListener {
        public C11094g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.m69906A() && ListPopupWindow.this.f52183G.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f52179C.removeCallbacks(listPopupWindow.f52206x);
                ListPopupWindow.this.f52206x.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$h */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC11095h implements View.OnTouchListener {
        public View$OnTouchListenerC11095h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f52183G) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f52183G.getWidth() && y >= 0 && y < ListPopupWindow.this.f52183G.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f52179C.postDelayed(listPopupWindow.f52206x, 250L);
                return false;
            } else if (action == 1) {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.f52179C.removeCallbacks(listPopupWindow2.f52206x);
                return false;
            } else {
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$i */
    /* loaded from: classes.dex */
    public class RunnableC11096i implements Runnable {
        public RunnableC11096i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            R71 r71 = ListPopupWindow.this.f52186d;
            if (r71 != null && C38790bq6.m62506Y(r71) && ListPopupWindow.this.f52186d.getCount() > ListPopupWindow.this.f52186d.getChildCount()) {
                int childCount = ListPopupWindow.this.f52186d.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.f52198p) {
                    listPopupWindow.f52183G.setInputMethodMode(2);
                    ListPopupWindow.this.mo1722a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f52175H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f52176I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, C50553vf4.listPopupWindowStyle);
    }

    /* renamed from: A */
    public boolean m69906A() {
        return this.f52183G.getInputMethodMode() == 2;
    }

    /* renamed from: B */
    public boolean m69905B() {
        return this.f52182F;
    }

    /* renamed from: C */
    public final void m69904C() {
        View view = this.f52199q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f52199q);
            }
        }
    }

    /* renamed from: D */
    public void m69903D(View view) {
        this.f52202t = view;
    }

    /* renamed from: E */
    public void m69902E(int i) {
        this.f52183G.setAnimationStyle(i);
    }

    /* renamed from: F */
    public void m69901F(int i) {
        Drawable background = this.f52183G.getBackground();
        if (background != null) {
            background.getPadding(this.f52180D);
            Rect rect = this.f52180D;
            this.f52188f = rect.left + rect.right + i;
            return;
        }
        m69889R(i);
    }

    /* renamed from: G */
    public void m69900G(int i) {
        this.f52195m = i;
    }

    /* renamed from: H */
    public void m69899H(Rect rect) {
        this.f52181E = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: I */
    public void m69898I(int i) {
        this.f52183G.setInputMethodMode(i);
    }

    /* renamed from: J */
    public void m69897J(boolean z) {
        this.f52182F = z;
        this.f52183G.setFocusable(z);
    }

    /* renamed from: K */
    public void m69896K(PopupWindow.OnDismissListener onDismissListener) {
        this.f52183G.setOnDismissListener(onDismissListener);
    }

    /* renamed from: L */
    public void m69895L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f52204v = onItemClickListener;
    }

    /* renamed from: M */
    public void m69894M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f52205w = onItemSelectedListener;
    }

    /* renamed from: N */
    public void m69893N(boolean z) {
        this.f52194l = true;
        this.f52193k = z;
    }

    /* renamed from: O */
    public final void m69892O(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f52175H;
            if (method != null) {
                try {
                    method.invoke(this.f52183G, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        C11091d.m69870b(this.f52183G, z);
    }

    /* renamed from: P */
    public void m69891P(int i) {
        this.f52200r = i;
    }

    /* renamed from: Q */
    public void m69890Q(int i) {
        R71 r71 = this.f52186d;
        if (mo1721c() && r71 != null) {
            r71.m87299i(false);
            r71.setSelection(i);
            if (r71.getChoiceMode() != 0) {
                r71.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: R */
    public void m69889R(int i) {
        this.f52188f = i;
    }

    @Override // p000.InterfaceC52642zA5
    /* renamed from: a */
    public void mo1722a() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int m69881q = m69881q();
        boolean m69906A = m69906A();
        BY3.m113874b(this.f52183G, this.f52191i);
        boolean z2 = true;
        if (this.f52183G.isShowing()) {
            if (!C38790bq6.m62506Y(m69879t())) {
                return;
            }
            int i5 = this.f52188f;
            if (i5 == -1) {
                i5 = -1;
            } else if (i5 == -2) {
                i5 = m69879t().getWidth();
            }
            int i6 = this.f52187e;
            if (i6 == -1) {
                if (!m69906A) {
                    m69881q = -1;
                }
                if (m69906A) {
                    PopupWindow popupWindow = this.f52183G;
                    if (this.f52188f == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    popupWindow.setWidth(i4);
                    this.f52183G.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.f52183G;
                    if (this.f52188f == -1) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    popupWindow2.setWidth(i3);
                    this.f52183G.setHeight(-1);
                }
            } else if (i6 != -2) {
                m69881q = i6;
            }
            PopupWindow popupWindow3 = this.f52183G;
            if (this.f52197o || this.f52196n) {
                z2 = false;
            }
            popupWindow3.setOutsideTouchable(z2);
            PopupWindow popupWindow4 = this.f52183G;
            View m69879t = m69879t();
            int i7 = this.f52189g;
            int i8 = this.f52190h;
            if (i5 < 0) {
                i = -1;
            } else {
                i = i5;
            }
            if (m69881q < 0) {
                i2 = -1;
            } else {
                i2 = m69881q;
            }
            popupWindow4.update(m69879t, i7, i8, i, i2);
            return;
        }
        int i9 = this.f52188f;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = m69879t().getWidth();
        }
        int i10 = this.f52187e;
        if (i10 == -1) {
            m69881q = -1;
        } else if (i10 != -2) {
            m69881q = i10;
        }
        this.f52183G.setWidth(i9);
        this.f52183G.setHeight(m69881q);
        m69892O(true);
        PopupWindow popupWindow5 = this.f52183G;
        if (!this.f52197o && !this.f52196n) {
            z = true;
        } else {
            z = false;
        }
        popupWindow5.setOutsideTouchable(z);
        this.f52183G.setTouchInterceptor(this.f52207y);
        if (this.f52194l) {
            BY3.m113875a(this.f52183G, this.f52193k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f52176I;
            if (method != null) {
                try {
                    method.invoke(this.f52183G, this.f52181E);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            C11091d.m69871a(this.f52183G, this.f52181E);
        }
        BY3.m113873c(this.f52183G, m69879t(), this.f52189g, this.f52190h, this.f52195m);
        this.f52186d.setSelection(-1);
        if (!this.f52182F || this.f52186d.isInTouchMode()) {
            m69880r();
        }
        if (!this.f52182F) {
            this.f52179C.post(this.f52177A);
        }
    }

    /* renamed from: b */
    public void m69888b(Drawable drawable) {
        this.f52183G.setBackgroundDrawable(drawable);
    }

    @Override // p000.InterfaceC52642zA5
    /* renamed from: c */
    public boolean mo1721c() {
        return this.f52183G.isShowing();
    }

    @Override // p000.InterfaceC52642zA5
    public void dismiss() {
        this.f52183G.dismiss();
        m69904C();
        this.f52183G.setContentView(null);
        this.f52186d = null;
        this.f52179C.removeCallbacks(this.f52206x);
    }

    /* renamed from: e */
    public Drawable m69887e() {
        return this.f52183G.getBackground();
    }

    /* renamed from: f */
    public void m69886f(int i) {
        this.f52190h = i;
        this.f52192j = true;
    }

    /* renamed from: i */
    public int m69885i() {
        if (!this.f52192j) {
            return 0;
        }
        return this.f52190h;
    }

    @Override // p000.InterfaceC52642zA5
    /* renamed from: k */
    public ListView mo1720k() {
        return this.f52186d;
    }

    /* renamed from: l */
    public int m69884l() {
        return this.f52189g;
    }

    /* renamed from: m */
    public void m69883m(int i) {
        this.f52189g = i;
    }

    /* renamed from: p */
    public void mo69882p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f52201s;
        if (dataSetObserver == null) {
            this.f52201s = new C11093f();
        } else {
            ListAdapter listAdapter2 = this.f52185c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f52185c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f52201s);
        }
        R71 r71 = this.f52186d;
        if (r71 != null) {
            r71.setAdapter(this.f52185c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final int m69881q() {
        int i;
        int i2;
        int makeMeasureSpec;
        int i3;
        boolean z = true;
        if (this.f52186d == null) {
            Context context = this.f52184b;
            this.f52178B = new RunnableC11088a();
            R71 mo69865s = mo69865s(context, !this.f52182F);
            this.f52186d = mo69865s;
            Drawable drawable = this.f52203u;
            if (drawable != null) {
                mo69865s.setSelector(drawable);
            }
            this.f52186d.setAdapter(this.f52185c);
            this.f52186d.setOnItemClickListener(this.f52204v);
            this.f52186d.setFocusable(true);
            this.f52186d.setFocusableInTouchMode(true);
            this.f52186d.setOnItemSelectedListener(new C11089b());
            this.f52186d.setOnScrollListener(this.f52208z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f52205w;
            if (onItemSelectedListener != null) {
                this.f52186d.setOnItemSelectedListener(onItemSelectedListener);
            }
            R71 r71 = this.f52186d;
            View view = this.f52199q;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.f52200r;
                if (i4 != 0) {
                    if (i4 != 1) {
                        Log.e("ListPopupWindow", "Invalid hint position " + this.f52200r);
                    } else {
                        linearLayout.addView(r71, layoutParams);
                        linearLayout.addView(view);
                    }
                } else {
                    linearLayout.addView(view);
                    linearLayout.addView(r71, layoutParams);
                }
                int i5 = this.f52188f;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                r71 = linearLayout;
            } else {
                i = 0;
            }
            this.f52183G.setContentView(r71);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f52183G.getContentView();
            View view2 = this.f52199q;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f52183G.getBackground();
        if (background != null) {
            background.getPadding(this.f52180D);
            Rect rect = this.f52180D;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.f52192j) {
                this.f52190h = -i6;
            }
        } else {
            this.f52180D.setEmpty();
            i2 = 0;
        }
        if (this.f52183G.getInputMethodMode() != 2) {
            z = false;
        }
        int m69878u = m69878u(m69879t(), this.f52190h, z);
        if (!this.f52196n && this.f52187e != -1) {
            int i7 = this.f52188f;
            if (i7 != -2) {
                if (i7 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else {
                    int i8 = this.f52184b.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f52180D;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i9 = this.f52184b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f52180D;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), Integer.MIN_VALUE);
            }
            int mo69864d = this.f52186d.mo69864d(makeMeasureSpec, 0, -1, m69878u - i, -1);
            if (mo69864d > 0) {
                i += i2 + this.f52186d.getPaddingTop() + this.f52186d.getPaddingBottom();
            }
            return mo69864d + i;
        }
        return m69878u + i2;
    }

    /* renamed from: r */
    public void m69880r() {
        R71 r71 = this.f52186d;
        if (r71 != null) {
            r71.m87299i(true);
            r71.requestLayout();
        }
    }

    /* renamed from: s */
    public R71 mo69865s(Context context, boolean z) {
        return new R71(context, z);
    }

    /* renamed from: t */
    public View m69879t() {
        return this.f52202t;
    }

    /* renamed from: u */
    public final int m69878u(View view, int i, boolean z) {
        return C11090c.m69872a(this.f52183G, view, i, z);
    }

    /* renamed from: v */
    public Object m69877v() {
        if (!mo1721c()) {
            return null;
        }
        return this.f52186d.getSelectedItem();
    }

    /* renamed from: w */
    public long m69876w() {
        if (!mo1721c()) {
            return Long.MIN_VALUE;
        }
        return this.f52186d.getSelectedItemId();
    }

    /* renamed from: x */
    public int m69875x() {
        if (!mo1721c()) {
            return -1;
        }
        return this.f52186d.getSelectedItemPosition();
    }

    /* renamed from: y */
    public View m69874y() {
        if (!mo1721c()) {
            return null;
        }
        return this.f52186d.getSelectedView();
    }

    /* renamed from: z */
    public int m69873z() {
        return this.f52188f;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f52187e = -2;
        this.f52188f = -2;
        this.f52191i = 1002;
        this.f52195m = 0;
        this.f52196n = false;
        this.f52197o = false;
        this.f52198p = Integer.MAX_VALUE;
        this.f52200r = 0;
        this.f52206x = new RunnableC11096i();
        this.f52207y = new View$OnTouchListenerC11095h();
        this.f52208z = new C11094g();
        this.f52177A = new RunnableC11092e();
        this.f52180D = new Rect();
        this.f52184b = context;
        this.f52179C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C43509jm4.ListPopupWindow, i, i2);
        this.f52189g = obtainStyledAttributes.getDimensionPixelOffset(C43509jm4.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C43509jm4.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f52190h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f52192j = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f52183G = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
