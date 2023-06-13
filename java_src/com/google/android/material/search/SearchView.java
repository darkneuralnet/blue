package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p000.C36704Vt6;
/* loaded from: classes6.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.InterfaceC11526b {

    /* renamed from: B */
    public static final int f73187B = C50021ul4.Widget_Material3_SearchView;

    /* renamed from: A */
    public Map<View, Integer> f73188A;

    /* renamed from: b */
    public final View f73189b;

    /* renamed from: c */
    public final ClippableRoundedCornerLayout f73190c;

    /* renamed from: d */
    public final View f73191d;

    /* renamed from: e */
    public final View f73192e;

    /* renamed from: f */
    public final FrameLayout f73193f;

    /* renamed from: g */
    public final FrameLayout f73194g;

    /* renamed from: h */
    public final MaterialToolbar f73195h;

    /* renamed from: i */
    public final Toolbar f73196i;

    /* renamed from: j */
    public final TextView f73197j;

    /* renamed from: k */
    public final EditText f73198k;

    /* renamed from: l */
    public final ImageButton f73199l;

    /* renamed from: m */
    public final View f73200m;

    /* renamed from: n */
    public final TouchObserverFrameLayout f73201n;

    /* renamed from: o */
    public final boolean f73202o;

    /* renamed from: p */
    public final C17862a f73203p;

    /* renamed from: q */
    public final C46351oa1 f73204q;

    /* renamed from: r */
    public final Set<InterfaceC17860b> f73205r;

    /* renamed from: s */
    public SearchBar f73206s;

    /* renamed from: t */
    public int f73207t;

    /* renamed from: u */
    public boolean f73208u;

    /* renamed from: v */
    public boolean f73209v;

    /* renamed from: w */
    public boolean f73210w;

    /* renamed from: x */
    public boolean f73211x;

    /* renamed from: y */
    public boolean f73212y;

    /* renamed from: z */
    public EnumC17861c f73213z;

    /* loaded from: classes6.dex */
    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: a */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (!searchView.m49153x() && (view instanceof SearchBar)) {
                searchView.setupWithSearchBar((SearchBar) view);
                return false;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes6.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17858a();

        /* renamed from: d */
        public String f73214d;

        /* renamed from: e */
        public int f73215e;

        /* renamed from: com.google.android.material.search.SearchView$SavedState$a */
        /* loaded from: classes6.dex */
        public class C17858a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f73214d);
            parcel.writeInt(this.f73215e);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f73214d = parcel.readString();
            this.f73215e = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: com.google.android.material.search.SearchView$a */
    /* loaded from: classes6.dex */
    public class C17859a implements TextWatcher {
        public C17859a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.f73199l.setVisibility(charSequence.length() > 0 ? 0 : 8);
        }
    }

    /* renamed from: com.google.android.material.search.SearchView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17860b {
        /* renamed from: a */
        void m49146a(SearchView searchView, EnumC17861c enumC17861c, EnumC17861c enumC17861c2);
    }

    /* renamed from: com.google.android.material.search.SearchView$c */
    /* loaded from: classes6.dex */
    public enum EnumC17861c {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m49206A(View view) {
        m49158s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m49205B(View view) {
        m49163n();
        m49197J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ boolean m49204C(View view, MotionEvent motionEvent) {
        if (m49157t()) {
            m49164m();
            return false;
        }
        return false;
    }

    /* renamed from: D */
    public static /* synthetic */ DB6 m49203D(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, DB6 db6) {
        marginLayoutParams.leftMargin = i + db6.m110779k();
        marginLayoutParams.rightMargin = i2 + db6.m110778l();
        return db6;
    }

    /* renamed from: E */
    public static /* synthetic */ boolean m49202E(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ DB6 m49201F(View view, DB6 db6) {
        boolean z;
        int m110777m = db6.m110777m();
        m49184W(m110777m);
        if (!this.f73212y) {
            if (m110777m > 0) {
                z = true;
            } else {
                z = false;
            }
            m49196K(z);
        }
        return db6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ DB6 m49200G(View view, DB6 db6, C36704Vt6.C8810f c8810f) {
        int i;
        int i2;
        boolean m79294n = C36704Vt6.m79294n(this.f73195h);
        if (m79294n) {
            i = c8810f.f39894c;
        } else {
            i = c8810f.f39892a;
        }
        if (m79294n) {
            i2 = c8810f.f39892a;
        } else {
            i2 = c8810f.f39894c;
        }
        this.f73195h.setPadding(i + db6.m110779k(), c8810f.f39893b, i2 + db6.m110778l(), c8810f.f39895d);
        return db6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m49199H(View view) {
        m49181Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m49152y() {
        this.f73198k.clearFocus();
        SearchBar searchBar = this.f73206s;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        C36704Vt6.m79295m(this.f73198k, this.f73211x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m49151z() {
        if (this.f73198k.requestFocus()) {
            this.f73198k.sendAccessibilityEvent(8);
        }
        C36704Vt6.m79290r(this.f73198k, this.f73211x);
    }

    /* renamed from: I */
    public void m49198I() {
        this.f73198k.postDelayed(new Runnable() { // from class: zq5
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.this.m49151z();
            }
        }, 100L);
    }

    /* renamed from: J */
    public void m49197J() {
        if (this.f73210w) {
            m49198I();
        }
    }

    /* renamed from: K */
    public final void m49196K(boolean z) {
        this.f73192e.setVisibility(z ? 0 : 8);
    }

    /* renamed from: L */
    public void m49195L(EnumC17861c enumC17861c) {
        if (this.f73213z.equals(enumC17861c)) {
            return;
        }
        EnumC17861c enumC17861c2 = this.f73213z;
        this.f73213z = enumC17861c;
        for (InterfaceC17860b interfaceC17860b : new LinkedHashSet(this.f73205r)) {
            interfaceC17860b.m49146a(this, enumC17861c2, enumC17861c);
        }
    }

    /* renamed from: M */
    public final void m49194M(boolean z, boolean z2) {
        if (z2) {
            this.f73195h.setNavigationIcon((Drawable) null);
            return;
        }
        this.f73195h.setNavigationOnClickListener(new View.OnClickListener() { // from class: tq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.this.m49206A(view);
            }
        });
        if (z) {
            C43122j71 c43122j71 = new C43122j71(getContext());
            c43122j71.m31080c(HM2.m103952d(this, C49961uf4.colorOnSurface));
            this.f73195h.setNavigationIcon(c43122j71);
        }
    }

    /* renamed from: N */
    public final void m49193N() {
        m49192O(m49161p());
    }

    /* renamed from: O */
    public final void m49192O(float f) {
        C46351oa1 c46351oa1 = this.f73204q;
        if (c46351oa1 != null && this.f73191d != null) {
            this.f73191d.setBackgroundColor(c46351oa1.m20831d(f));
        }
    }

    /* renamed from: P */
    public final void m49191P() {
        this.f73199l.setOnClickListener(new View.OnClickListener() { // from class: xq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.this.m49205B(view);
            }
        });
        this.f73198k.addTextChangedListener(new C17859a());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: Q */
    public final void m49190Q() {
        this.f73201n.setOnTouchListener(new View.OnTouchListener() { // from class: rq5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m49204C;
                m49204C = SearchView.this.m49204C(view, motionEvent);
                return m49204C;
            }
        });
    }

    /* renamed from: R */
    public final void m49189R() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f73200m.getLayoutParams();
        final int i = marginLayoutParams.leftMargin;
        final int i2 = marginLayoutParams.rightMargin;
        C38790bq6.m62531L0(this.f73200m, new InterfaceC36332Ue3() { // from class: uq5
            @Override // p000.InterfaceC36332Ue3
            /* renamed from: a */
            public final DB6 mo7930a(View view, DB6 db6) {
                DB6 m49203D;
                m49203D = SearchView.m49203D(marginLayoutParams, i, i2, view, db6);
                return m49203D;
            }
        });
    }

    /* renamed from: S */
    public final void m49188S(int i, String str, String str2) {
        if (i != -1) {
            Q26.m89061o(this.f73198k, i);
        }
        this.f73198k.setText(str);
        this.f73198k.setHint(str2);
    }

    /* renamed from: T */
    public final void m49187T(int i) {
        if (i != -1) {
            m49165l(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.f73193f, false));
        }
    }

    /* renamed from: U */
    public final void m49186U() {
        m49182Y();
        m49189R();
        m49183X();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: V */
    public final void m49185V() {
        this.f73190c.setOnTouchListener(new View.OnTouchListener() { // from class: sq5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m49202E;
                m49202E = SearchView.m49202E(view, motionEvent);
                return m49202E;
            }
        });
    }

    /* renamed from: W */
    public final void m49184W(int i) {
        if (this.f73192e.getLayoutParams().height != i) {
            this.f73192e.getLayoutParams().height = i;
            this.f73192e.requestLayout();
        }
    }

    /* renamed from: X */
    public final void m49183X() {
        m49184W(m49160q());
        C38790bq6.m62531L0(this.f73192e, new InterfaceC36332Ue3() { // from class: vq5
            @Override // p000.InterfaceC36332Ue3
            /* renamed from: a */
            public final DB6 mo7930a(View view, DB6 db6) {
                DB6 m49201F;
                m49201F = SearchView.this.m49201F(view, db6);
                return m49201F;
            }
        });
    }

    /* renamed from: Y */
    public final void m49182Y() {
        C36704Vt6.m79305c(this.f73195h, new C36704Vt6.InterfaceC8809e() { // from class: yq5
            @Override // p000.C36704Vt6.InterfaceC8809e
            /* renamed from: a */
            public final DB6 mo2412a(View view, DB6 db6, C36704Vt6.C8810f c8810f) {
                DB6 m49200G;
                m49200G = SearchView.this.m49200G(view, db6, c8810f);
                return m49200G;
            }
        });
    }

    /* renamed from: Z */
    public void m49181Z() {
        if (!this.f73213z.equals(EnumC17861c.SHOWN) && !this.f73213z.equals(EnumC17861c.SHOWING)) {
            this.f73203p.m49124V();
            setModalForAccessibility(true);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC11526b
    /* renamed from: a */
    public CoordinatorLayout.Behavior<SearchView> mo49180a() {
        return new Behavior();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a0 */
    public final void m49179a0(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.f73190c.getId()) != null) {
                    m49179a0((ViewGroup) childAt, z);
                } else if (!z) {
                    Map<View, Integer> map = this.f73188A;
                    if (map != null && map.containsKey(childAt)) {
                        C38790bq6.m62539H0(childAt, this.f73188A.get(childAt).intValue());
                    }
                } else {
                    this.f73188A.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    C38790bq6.m62539H0(childAt, 4);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f73202o) {
            this.f73201n.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    /* renamed from: b0 */
    public final void m49177b0() {
        MaterialToolbar materialToolbar = this.f73195h;
        if (materialToolbar == null || m49154w(materialToolbar)) {
            return;
        }
        int i = C52935zg4.ic_arrow_back_black_24;
        if (this.f73206s == null) {
            this.f73195h.setNavigationIcon(i);
            return;
        }
        Drawable m90834r = P61.m90834r(C29611vi.m8248b(getContext(), i).mutate());
        if (this.f73195h.m50356i0() != null) {
            P61.m90838n(m90834r, this.f73195h.m50356i0().intValue());
        }
        this.f73195h.setNavigationIcon(new C52962zj1(this.f73206s.m69794F(), m90834r));
        m49175c0();
    }

    /* renamed from: c0 */
    public final void m49175c0() {
        int i;
        ImageButton m114368d = B56.m114368d(this.f73195h);
        if (m114368d == null) {
            return;
        }
        if (this.f73190c.getVisibility() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        Drawable m90835q = P61.m90835q(m114368d.getDrawable());
        if (m90835q instanceof C43122j71) {
            ((C43122j71) m90835q).m31078e(i);
        }
        if (m90835q instanceof C52962zj1) {
            ((C52962zj1) m90835q).m477a(i);
        }
    }

    /* renamed from: d0 */
    public void m49173d0() {
        Window m49162o = m49162o();
        if (m49162o != null) {
            this.f73207t = m49162o.getAttributes().softInputMode;
        }
    }

    /* renamed from: l */
    public void m49165l(View view) {
        this.f73193f.addView(view);
        this.f73193f.setVisibility(0);
    }

    /* renamed from: m */
    public void m49164m() {
        this.f73198k.post(new Runnable() { // from class: Aq5
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.this.m49152y();
            }
        });
    }

    /* renamed from: n */
    public void m49163n() {
        this.f73198k.setText("");
    }

    /* renamed from: o */
    public final Window m49162o() {
        Activity m43152a = C40195eB0.m43152a(getContext());
        if (m43152a == null) {
            return null;
        }
        return m43152a.getWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        QM2.m88639e(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49173d0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean z;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m67617a());
        setText(savedState.f73214d);
        if (savedState.f73215e == 0) {
            z = true;
        } else {
            z = false;
        }
        setVisible(z);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        String charSequence;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable m49159r = m49159r();
        if (m49159r == null) {
            charSequence = null;
        } else {
            charSequence = m49159r.toString();
        }
        savedState.f73214d = charSequence;
        savedState.f73215e = this.f73190c.getVisibility();
        return savedState;
    }

    /* renamed from: p */
    public final float m49161p() {
        SearchBar searchBar = this.f73206s;
        if (searchBar != null) {
            return searchBar.m49224m0();
        }
        return getResources().getDimension(C35172Pf4.m3_searchview_elevation);
    }

    /* renamed from: q */
    public final int m49160q() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: r */
    public Editable m49159r() {
        return this.f73198k.getText();
    }

    /* renamed from: s */
    public void m49158s() {
        if (!this.f73213z.equals(EnumC17861c.HIDDEN) && !this.f73213z.equals(EnumC17861c.HIDING)) {
            this.f73203p.m49136J();
            setModalForAccessibility(false);
        }
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.f73208u = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.f73210w = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m49192O(f);
    }

    public void setHint(CharSequence charSequence) {
        this.f73198k.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.f73209v = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.f73188A = new HashMap(viewGroup.getChildCount());
        }
        m49179a0(viewGroup, z);
        if (!z) {
            this.f73188A = null;
        }
    }

    public void setOnMenuItemClickListener(Toolbar.InterfaceC11133g interfaceC11133g) {
        this.f73195h.setOnMenuItemClickListener(interfaceC11133g);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        int i;
        this.f73197j.setText(charSequence);
        TextView textView = this.f73197j;
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.f73212y = true;
        m49196K(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f73198k.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.f73195h.setTouchscreenBlocksFocus(z);
    }

    public void setUseWindowInsetsController(boolean z) {
        this.f73211x = z;
    }

    public void setVisible(boolean z) {
        boolean z2;
        EnumC17861c enumC17861c;
        int i = 0;
        if (this.f73190c.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f73190c;
        if (!z) {
            i = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i);
        m49175c0();
        if (z2 != z) {
            setModalForAccessibility(z);
        }
        if (z) {
            enumC17861c = EnumC17861c.SHOWN;
        } else {
            enumC17861c = EnumC17861c.HIDDEN;
        }
        m49195L(enumC17861c);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f73206s = searchBar;
        this.f73203p.m49126T(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: wq5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchView.this.m49199H(view);
                }
            });
        }
        m49177b0();
        m49193N();
    }

    /* renamed from: t */
    public boolean m49157t() {
        return this.f73207t == 48;
    }

    /* renamed from: u */
    public boolean m49156u() {
        return this.f73208u;
    }

    /* renamed from: v */
    public boolean m49155v() {
        return this.f73209v;
    }

    /* renamed from: w */
    public final boolean m49154w(Toolbar toolbar) {
        return P61.m90835q(toolbar.m69794F()) instanceof C43122j71;
    }

    /* renamed from: x */
    public boolean m49153x() {
        return this.f73206s != null;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.materialSearchViewStyle);
    }

    public void setHint(int i) {
        this.f73198k.setHint(i);
    }

    public void setText(int i) {
        this.f73198k.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f73187B;
        this.f73205r = new LinkedHashSet();
        this.f73207t = 16;
        this.f73213z = EnumC17861c.HIDDEN;
        Context context2 = getContext();
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.SearchView, i, i2, new int[0]);
        int resourceId = m21866i.getResourceId(C37098Xl4.SearchView_headerLayout, -1);
        int resourceId2 = m21866i.getResourceId(C37098Xl4.SearchView_android_textAppearance, -1);
        String string = m21866i.getString(C37098Xl4.SearchView_android_text);
        String string2 = m21866i.getString(C37098Xl4.SearchView_android_hint);
        String string3 = m21866i.getString(C37098Xl4.SearchView_searchPrefixText);
        boolean z = m21866i.getBoolean(C37098Xl4.SearchView_useDrawerArrowDrawable, false);
        this.f73208u = m21866i.getBoolean(C37098Xl4.SearchView_animateNavigationIcon, true);
        this.f73209v = m21866i.getBoolean(C37098Xl4.SearchView_animateMenuItems, true);
        boolean z2 = m21866i.getBoolean(C37098Xl4.SearchView_hideNavigationIcon, false);
        this.f73210w = m21866i.getBoolean(C37098Xl4.SearchView_autoShowKeyboard, true);
        m21866i.recycle();
        LayoutInflater.from(context2).inflate(C50603vk4.mtrl_search_view, this);
        this.f73202o = true;
        this.f73189b = findViewById(C33795Ji4.search_view_scrim);
        this.f73190c = (ClippableRoundedCornerLayout) findViewById(C33795Ji4.search_view_root);
        this.f73191d = findViewById(C33795Ji4.search_view_background);
        this.f73192e = findViewById(C33795Ji4.search_view_status_bar_spacer);
        this.f73193f = (FrameLayout) findViewById(C33795Ji4.search_view_header_container);
        this.f73194g = (FrameLayout) findViewById(C33795Ji4.search_view_toolbar_container);
        this.f73195h = (MaterialToolbar) findViewById(C33795Ji4.search_view_toolbar);
        this.f73196i = (Toolbar) findViewById(C33795Ji4.search_view_dummy_toolbar);
        this.f73197j = (TextView) findViewById(C33795Ji4.search_view_search_prefix);
        this.f73198k = (EditText) findViewById(C33795Ji4.search_view_edit_text);
        this.f73199l = (ImageButton) findViewById(C33795Ji4.search_view_clear_button);
        this.f73200m = findViewById(C33795Ji4.search_view_divider);
        this.f73201n = (TouchObserverFrameLayout) findViewById(C33795Ji4.search_view_content_container);
        this.f73203p = new C17862a(this);
        this.f73204q = new C46351oa1(context2);
        m49185V();
        m49193N();
        m49187T(resourceId);
        setSearchPrefixText(string3);
        m49188S(resourceId2, string, string2);
        m49194M(z, z2);
        m49191P();
        m49190Q();
        m49186U();
    }
}
