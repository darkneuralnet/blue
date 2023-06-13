package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;
@Deprecated
/* loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: b */
    public final ArrayList<C11646a> f54633b;

    /* renamed from: c */
    public FrameLayout f54634c;

    /* renamed from: d */
    public Context f54635d;

    /* renamed from: e */
    public FragmentManager f54636e;

    /* renamed from: f */
    public int f54637f;

    /* renamed from: g */
    public TabHost.OnTabChangeListener f54638g;

    /* renamed from: h */
    public C11646a f54639h;

    /* renamed from: i */
    public boolean f54640i;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11645a();

        /* renamed from: b */
        public String f54641b;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        /* loaded from: classes.dex */
        public class C11645a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f54641b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f54641b);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f54641b = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    /* loaded from: classes.dex */
    public static final class C11646a {

        /* renamed from: a */
        public final String f54642a;

        /* renamed from: b */
        public final Class<?> f54643b;

        /* renamed from: c */
        public final Bundle f54644c;

        /* renamed from: d */
        public Fragment f54645d;
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.f54633b = new ArrayList<>();
        m67251e(context, null);
    }

    /* renamed from: a */
    public final AbstractC11685m m67255a(String str, AbstractC11685m abstractC11685m) {
        Fragment fragment;
        C11646a m67252d = m67252d(str);
        if (this.f54639h != m67252d) {
            if (abstractC11685m == null) {
                abstractC11685m = this.f54636e.m67311q();
            }
            C11646a c11646a = this.f54639h;
            if (c11646a != null && (fragment = c11646a.f54645d) != null) {
                abstractC11685m.mo67110n(fragment);
            }
            if (m67252d != null) {
                Fragment fragment2 = m67252d.f54645d;
                if (fragment2 == null) {
                    Fragment instantiate = this.f54636e.m67286y0().instantiate(this.f54635d.getClassLoader(), m67252d.f54643b.getName());
                    m67252d.f54645d = instantiate;
                    instantiate.setArguments(m67252d.f54644c);
                    abstractC11685m.m67121c(this.f54637f, m67252d.f54645d, m67252d.f54642a);
                } else {
                    abstractC11685m.m67116h(fragment2);
                }
            }
            this.f54639h = m67252d;
        }
        return abstractC11685m;
    }

    /* renamed from: b */
    public final void m67254b() {
        if (this.f54634c == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f54637f);
            this.f54634c = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f54637f);
            }
        }
    }

    /* renamed from: c */
    public final void m67253c(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f54634c = frameLayout2;
            frameLayout2.setId(this.f54637f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    /* renamed from: d */
    public final C11646a m67252d(String str) {
        int size = this.f54633b.size();
        for (int i = 0; i < size; i++) {
            C11646a c11646a = this.f54633b.get(i);
            if (c11646a.f54642a.equals(str)) {
                return c11646a;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m67251e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f54637f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f54633b.size();
        AbstractC11685m abstractC11685m = null;
        for (int i = 0; i < size; i++) {
            C11646a c11646a = this.f54633b.get(i);
            Fragment m67322m0 = this.f54636e.m67322m0(c11646a.f54642a);
            c11646a.f54645d = m67322m0;
            if (m67322m0 != null && !m67322m0.isDetached()) {
                if (c11646a.f54642a.equals(currentTabTag)) {
                    this.f54639h = c11646a;
                } else {
                    if (abstractC11685m == null) {
                        abstractC11685m = this.f54636e.m67311q();
                    }
                    abstractC11685m.mo67110n(c11646a.f54645d);
                }
            }
        }
        this.f54640i = true;
        AbstractC11685m m67255a = m67255a(currentTabTag, abstractC11685m);
        if (m67255a != null) {
            m67255a.mo67115i();
            this.f54636e.m67337h0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f54640i = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f54641b);
    }

    @Override // android.view.View
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f54641b = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        AbstractC11685m m67255a;
        if (this.f54640i && (m67255a = m67255a(str, null)) != null) {
            m67255a.mo67115i();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f54638g;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f54638g = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager) {
        m67253c(context);
        super.setup();
        this.f54635d = context;
        this.f54636e = fragmentManager;
        m67254b();
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54633b = new ArrayList<>();
        m67251e(context, attributeSet);
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager, int i) {
        m67253c(context);
        super.setup();
        this.f54635d = context;
        this.f54636e = fragmentManager;
        this.f54637f = i;
        m67254b();
        this.f54634c.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}
