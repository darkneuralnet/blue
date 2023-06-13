package androidx.legacy.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
    public final ArrayList<C11698a> f54817b;

    /* renamed from: c */
    public FrameLayout f54818c;

    /* renamed from: d */
    public Context f54819d;

    /* renamed from: e */
    public FragmentManager f54820e;

    /* renamed from: f */
    public int f54821f;

    /* renamed from: g */
    public TabHost.OnTabChangeListener f54822g;

    /* renamed from: h */
    public C11698a f54823h;

    /* renamed from: i */
    public boolean f54824i;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11697a();

        /* renamed from: b */
        public String f54825b;

        /* renamed from: androidx.legacy.app.FragmentTabHost$SavedState$a */
        /* loaded from: classes.dex */
        public static class C11697a implements Parcelable.Creator<SavedState> {
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
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f54825b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f54825b);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f54825b = parcel.readString();
        }
    }

    /* renamed from: androidx.legacy.app.FragmentTabHost$a */
    /* loaded from: classes.dex */
    public static final class C11698a {

        /* renamed from: a */
        public final String f54826a;

        /* renamed from: b */
        public final Class<?> f54827b;

        /* renamed from: c */
        public final Bundle f54828c;

        /* renamed from: d */
        public Fragment f54829d;
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.f54817b = new ArrayList<>();
        m67054d(context, null);
    }

    /* renamed from: a */
    public final FragmentTransaction m67057a(String str, FragmentTransaction fragmentTransaction) {
        Fragment fragment;
        C11698a c11698a = null;
        for (int i = 0; i < this.f54817b.size(); i++) {
            C11698a c11698a2 = this.f54817b.get(i);
            if (c11698a2.f54826a.equals(str)) {
                c11698a = c11698a2;
            }
        }
        if (c11698a != null) {
            if (this.f54823h != c11698a) {
                if (fragmentTransaction == null) {
                    fragmentTransaction = this.f54820e.beginTransaction();
                }
                C11698a c11698a3 = this.f54823h;
                if (c11698a3 != null && (fragment = c11698a3.f54829d) != null) {
                    fragmentTransaction.detach(fragment);
                }
                Fragment fragment2 = c11698a.f54829d;
                if (fragment2 == null) {
                    Fragment instantiate = Fragment.instantiate(this.f54819d, c11698a.f54827b.getName(), c11698a.f54828c);
                    c11698a.f54829d = instantiate;
                    fragmentTransaction.add(this.f54821f, instantiate, c11698a.f54826a);
                } else {
                    fragmentTransaction.attach(fragment2);
                }
                this.f54823h = c11698a;
            }
            return fragmentTransaction;
        }
        throw new IllegalStateException("No tab known for tag " + str);
    }

    /* renamed from: b */
    public final void m67056b() {
        if (this.f54818c == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f54821f);
            this.f54818c = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f54821f);
            }
        }
    }

    /* renamed from: c */
    public final void m67055c(Context context) {
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
            this.f54818c = frameLayout2;
            frameLayout2.setId(this.f54821f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    /* renamed from: d */
    public final void m67054d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f54821f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        FragmentTransaction fragmentTransaction = null;
        for (int i = 0; i < this.f54817b.size(); i++) {
            C11698a c11698a = this.f54817b.get(i);
            Fragment findFragmentByTag = this.f54820e.findFragmentByTag(c11698a.f54826a);
            c11698a.f54829d = findFragmentByTag;
            if (findFragmentByTag != null && !findFragmentByTag.isDetached()) {
                if (c11698a.f54826a.equals(currentTabTag)) {
                    this.f54823h = c11698a;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.f54820e.beginTransaction();
                    }
                    fragmentTransaction.detach(c11698a.f54829d);
                }
            }
        }
        this.f54824i = true;
        FragmentTransaction m67057a = m67057a(currentTabTag, fragmentTransaction);
        if (m67057a != null) {
            m67057a.commit();
            this.f54820e.executePendingTransactions();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f54824i = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f54825b);
    }

    @Override // android.view.View
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f54825b = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        FragmentTransaction m67057a;
        if (this.f54824i && (m67057a = m67057a(str, null)) != null) {
            m67057a.commit();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f54822g;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f54822g = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager) {
        m67055c(context);
        super.setup();
        this.f54819d = context;
        this.f54820e = fragmentManager;
        m67056b();
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54817b = new ArrayList<>();
        m67054d(context, attributeSet);
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager, int i) {
        m67055c(context);
        super.setup();
        this.f54819d = context;
        this.f54820e = fragmentManager;
        this.f54821f = i;
        m67056b();
        this.f54818c.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}
