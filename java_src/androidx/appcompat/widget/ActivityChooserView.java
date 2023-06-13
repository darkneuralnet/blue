package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: b */
    public final C11068f f52079b;

    /* renamed from: c */
    public final View$OnClickListenerC11069g f52080c;

    /* renamed from: d */
    public final View f52081d;

    /* renamed from: e */
    public final Drawable f52082e;

    /* renamed from: f */
    public final FrameLayout f52083f;

    /* renamed from: g */
    public final ImageView f52084g;

    /* renamed from: h */
    public final FrameLayout f52085h;

    /* renamed from: i */
    public final ImageView f52086i;

    /* renamed from: j */
    public final int f52087j;

    /* renamed from: k */
    public AbstractC3314I2 f52088k;

    /* renamed from: l */
    public final DataSetObserver f52089l;

    /* renamed from: m */
    public final ViewTreeObserver.OnGlobalLayoutListener f52090m;

    /* renamed from: n */
    public ListPopupWindow f52091n;

    /* renamed from: o */
    public PopupWindow.OnDismissListener f52092o;

    /* renamed from: p */
    public boolean f52093p;

    /* renamed from: q */
    public int f52094q;

    /* renamed from: r */
    public boolean f52095r;

    /* renamed from: s */
    public int f52096s;

    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: b */
        public static final int[] f52097b = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Z46 m73748u = Z46.m73748u(context, attributeSet, f52097b);
            setBackgroundDrawable(m73748u.m73762g(0));
            m73748u.m73746w();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    /* loaded from: classes.dex */
    public class C11063a extends DataSetObserver {
        public C11063a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f52079b.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f52079b.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC11064b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC11064b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.m69978c()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.m69979b().dismiss();
                    return;
                }
                ActivityChooserView.this.m69979b().mo1722a();
                AbstractC3314I2 abstractC3314I2 = ActivityChooserView.this.f52088k;
                if (abstractC3314I2 != null) {
                    abstractC3314I2.m103047k(true);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    /* loaded from: classes.dex */
    public class C11065c extends View.AccessibilityDelegate {
        public C11065c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C27125p2.m20096V0(accessibilityNodeInfo).m20086c0(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    /* loaded from: classes.dex */
    public class C11066d extends AbstractView$OnTouchListenerC32757Ex1 {
        public C11066d(View view) {
            super(view);
        }

        @Override // p000.AbstractView$OnTouchListenerC32757Ex1
        /* renamed from: b */
        public InterfaceC52642zA5 mo69952b() {
            return ActivityChooserView.this.m69979b();
        }

        @Override // p000.AbstractView$OnTouchListenerC32757Ex1
        /* renamed from: c */
        public boolean mo69951c() {
            ActivityChooserView.this.m69977d();
            return true;
        }

        @Override // p000.AbstractView$OnTouchListenerC32757Ex1
        /* renamed from: d */
        public boolean mo69974d() {
            ActivityChooserView.this.m69980a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    /* loaded from: classes.dex */
    public class C11067e extends DataSetObserver {
        public C11067e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.m69975f();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    /* loaded from: classes.dex */
    public class C11068f extends BaseAdapter {

        /* renamed from: b */
        public int f52103b = 4;

        /* renamed from: c */
        public boolean f52104c;

        /* renamed from: d */
        public boolean f52105d;

        /* renamed from: e */
        public boolean f52106e;

        public C11068f() {
        }

        /* renamed from: a */
        public int m69973a() {
            throw null;
        }

        /* renamed from: b */
        public C25087k3 m69972b() {
            return null;
        }

        /* renamed from: c */
        public ResolveInfo m69971c() {
            throw null;
        }

        /* renamed from: d */
        public int m69970d() {
            throw null;
        }

        /* renamed from: e */
        public boolean m69969e() {
            return this.f52104c;
        }

        /* renamed from: f */
        public void m69968f(C25087k3 c25087k3) {
            ActivityChooserView.this.f52079b.m69972b();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            } else if (!this.f52104c) {
                throw null;
            } else {
                throw null;
            }
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (this.f52106e && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view == null || view.getId() != 1) {
                        View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C32643Ek4.abc_activity_chooser_view_list_item, viewGroup, false);
                        inflate.setId(1);
                        ((TextView) inflate.findViewById(C39902dh4.title)).setText(ActivityChooserView.this.getContext().getString(C49428tl4.abc_activity_chooser_view_see_all));
                        return inflate;
                    }
                    return view;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != C39902dh4.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C32643Ek4.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            ((ImageView) view.findViewById(C39902dh4.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(C39902dh4.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f52104c && i == 0 && this.f52105d) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC11069g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public View$OnClickListenerC11069g() {
        }

        /* renamed from: a */
        public final void m69967a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f52092o;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f52085h) {
                if (view == activityChooserView.f52083f) {
                    activityChooserView.f52093p = false;
                    activityChooserView.m69976e(activityChooserView.f52094q);
                    return;
                }
                throw new IllegalArgumentException();
            }
            activityChooserView.m69980a();
            ActivityChooserView.this.f52079b.m69971c();
            ActivityChooserView.this.f52079b.m69972b();
            throw null;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m69967a();
            AbstractC3314I2 abstractC3314I2 = ActivityChooserView.this.f52088k;
            if (abstractC3314I2 != null) {
                abstractC3314I2.m103047k(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((C11068f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.m69976e(Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.m69980a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f52093p) {
                if (i <= 0) {
                    return;
                }
                activityChooserView.f52079b.m69972b();
                throw null;
            }
            activityChooserView.f52079b.m69969e();
            ActivityChooserView.this.f52079b.m69972b();
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f52085h) {
                if (activityChooserView.f52079b.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f52093p = true;
                    activityChooserView2.m69976e(activityChooserView2.f52094q);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public boolean m69980a() {
        if (m69978c()) {
            m69979b().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f52090m);
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: b */
    public ListPopupWindow m69979b() {
        if (this.f52091n == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f52091n = listPopupWindow;
            listPopupWindow.mo69882p(this.f52079b);
            this.f52091n.m69903D(this);
            this.f52091n.m69897J(true);
            this.f52091n.m69895L(this.f52080c);
            this.f52091n.m69896K(this.f52080c);
        }
        return this.f52091n;
    }

    /* renamed from: c */
    public boolean m69978c() {
        return m69979b().mo1721c();
    }

    /* renamed from: d */
    public boolean m69977d() {
        if (m69978c() || !this.f52095r) {
            return false;
        }
        this.f52093p = false;
        m69976e(this.f52094q);
        return true;
    }

    /* renamed from: e */
    public void m69976e(int i) {
        this.f52079b.m69972b();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: f */
    public void m69975f() {
        if (this.f52079b.getCount() > 0) {
            this.f52083f.setEnabled(true);
        } else {
            this.f52083f.setEnabled(false);
        }
        int m69973a = this.f52079b.m69973a();
        int m69970d = this.f52079b.m69970d();
        if (m69973a != 1 && (m69973a <= 1 || m69970d <= 0)) {
            this.f52085h.setVisibility(8);
        } else {
            this.f52085h.setVisibility(0);
            ResolveInfo m69971c = this.f52079b.m69971c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f52086i.setImageDrawable(m69971c.loadIcon(packageManager));
            if (this.f52096s != 0) {
                this.f52085h.setContentDescription(getContext().getString(this.f52096s, m69971c.loadLabel(packageManager)));
            }
        }
        if (this.f52085h.getVisibility() == 0) {
            this.f52081d.setBackgroundDrawable(this.f52082e);
        } else {
            this.f52081d.setBackgroundDrawable(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f52079b.m69972b();
        this.f52095r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52079b.m69972b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f52090m);
        }
        if (m69978c()) {
            m69980a();
        }
        this.f52095r = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f52081d.layout(0, 0, i3 - i, i4 - i2);
        if (!m69978c()) {
            m69980a();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.f52081d;
        if (this.f52085h.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C25087k3 c25087k3) {
        this.f52079b.m69968f(c25087k3);
        if (m69978c()) {
            m69980a();
            m69977d();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f52096s = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f52084g.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f52084g.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f52094q = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f52092o = onDismissListener;
    }

    public void setProvider(AbstractC3314I2 abstractC3314I2) {
        this.f52088k = abstractC3314I2;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52089l = new C11063a();
        this.f52090m = new ViewTreeObserver$OnGlobalLayoutListenerC11064b();
        this.f52094q = 4;
        int[] iArr = C43509jm4.ActivityChooserView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C38790bq6.m62456t0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.f52094q = obtainStyledAttributes.getInt(C43509jm4.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C43509jm4.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C32643Ek4.abc_activity_chooser_view, (ViewGroup) this, true);
        View$OnClickListenerC11069g view$OnClickListenerC11069g = new View$OnClickListenerC11069g();
        this.f52080c = view$OnClickListenerC11069g;
        View findViewById = findViewById(C39902dh4.activity_chooser_view_content);
        this.f52081d = findViewById;
        this.f52082e = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C39902dh4.default_activity_button);
        this.f52085h = frameLayout;
        frameLayout.setOnClickListener(view$OnClickListenerC11069g);
        frameLayout.setOnLongClickListener(view$OnClickListenerC11069g);
        int i2 = C39902dh4.image;
        this.f52086i = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C39902dh4.expand_activities_button);
        frameLayout2.setOnClickListener(view$OnClickListenerC11069g);
        frameLayout2.setAccessibilityDelegate(new C11065c());
        frameLayout2.setOnTouchListener(new C11066d(frameLayout2));
        this.f52083f = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.f52084g = imageView;
        imageView.setImageDrawable(drawable);
        C11068f c11068f = new C11068f();
        this.f52079b = c11068f;
        c11068f.registerDataSetObserver(new C11067e());
        Resources resources = context.getResources();
        this.f52087j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C39281cg4.abc_config_prefDialogWidth));
    }
}
