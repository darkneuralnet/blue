package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC10997b;
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    @SuppressLint({"ResourceType"})
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {16843505};
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "AppCompatSpinner";
    private final C10331Zh mBackgroundTintHelper;
    int mDropDownWidth;
    private AbstractView$OnTouchListenerC32757Ex1 mForwardingListener;
    private InterfaceC11083i mPopup;
    private final Context mPopupContext;
    private final boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    final Rect mTempRect;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11071a();

        /* renamed from: b */
        public boolean f52137b;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        /* loaded from: classes.dex */
        public class C11071a implements Parcelable.Creator<SavedState> {
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

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f52137b ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f52137b = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    /* loaded from: classes.dex */
    public class C11072a extends AbstractView$OnTouchListenerC32757Ex1 {

        /* renamed from: k */
        public final /* synthetic */ C11079h f52138k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11072a(View view, C11079h c11079h) {
            super(view);
            this.f52138k = c11079h;
        }

        @Override // p000.AbstractView$OnTouchListenerC32757Ex1
        /* renamed from: b */
        public InterfaceC52642zA5 mo69952b() {
            return this.f52138k;
        }

        @Override // p000.AbstractView$OnTouchListenerC32757Ex1
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo69951c() {
            if (!AppCompatSpinner.this.getInternalPopup().mo69939c()) {
                AppCompatSpinner.this.showPopup();
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC11073b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC11073b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo69939c()) {
                AppCompatSpinner.this.showPopup();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C11074c.m69950a(viewTreeObserver, this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    /* loaded from: classes.dex */
    public static final class C11074c {
        private C11074c() {
        }

        /* renamed from: a */
        public static void m69950a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    /* loaded from: classes.dex */
    public static final class C11075d {
        private C11075d() {
        }

        /* renamed from: a */
        public static int m69949a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        public static int m69948b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        public static void m69947c(View view, int i) {
            view.setTextAlignment(i);
        }

        /* renamed from: d */
        public static void m69946d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    /* loaded from: classes.dex */
    public static final class C11076e {
        private C11076e() {
        }

        /* renamed from: a */
        public static void m69945a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!C37259Yd3.m74780a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC11077f implements InterfaceC11083i, DialogInterface.OnClickListener {

        /* renamed from: b */
        public DialogInterfaceC10997b f52141b;

        /* renamed from: c */
        public ListAdapter f52142c;

        /* renamed from: d */
        public CharSequence f52143d;

        public DialogInterface$OnClickListenerC11077f() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: b */
        public void mo69940b(Drawable drawable) {
            Log.e(AppCompatSpinner.TAG, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: c */
        public boolean mo69939c() {
            DialogInterfaceC10997b dialogInterfaceC10997b = this.f52141b;
            if (dialogInterfaceC10997b != null) {
                return dialogInterfaceC10997b.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        public void dismiss() {
            DialogInterfaceC10997b dialogInterfaceC10997b = this.f52141b;
            if (dialogInterfaceC10997b != null) {
                dialogInterfaceC10997b.dismiss();
                this.f52141b = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: e */
        public Drawable mo69938e() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: f */
        public void mo69937f(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: g */
        public void mo69936g(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: h */
        public void mo69935h(int i, int i2) {
            if (this.f52142c == null) {
                return;
            }
            DialogInterfaceC10997b.C10998a c10998a = new DialogInterfaceC10997b.C10998a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f52143d;
            if (charSequence != null) {
                c10998a.mo70285q(charSequence);
            }
            DialogInterfaceC10997b mo70301a = c10998a.mo70287o(this.f52142c, AppCompatSpinner.this.getSelectedItemPosition(), this).mo70301a();
            this.f52141b = mo70301a;
            ListView m70303b = mo70301a.m70303b();
            C11075d.m69946d(m70303b, i);
            C11075d.m69947c(m70303b, i2);
            this.f52141b.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: i */
        public int mo69934i() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: l */
        public int mo69933l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: m */
        public void mo69932m(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: n */
        public CharSequence mo69931n() {
            return this.f52143d;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: o */
        public void mo69930o(CharSequence charSequence) {
            this.f52143d = charSequence;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f52142c.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: p */
        public void mo69882p(ListAdapter listAdapter) {
            this.f52142c = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    /* loaded from: classes.dex */
    public static class C11078g implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        public SpinnerAdapter f52145b;

        /* renamed from: c */
        public ListAdapter f52146c;

        public C11078g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f52145b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f52146c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    C11076e.m69945a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC47238q36) {
                    InterfaceC47238q36 interfaceC47238q36 = (InterfaceC47238q36) spinnerAdapter;
                    if (interfaceC47238q36.getDropDownViewTheme() == null) {
                        interfaceC47238q36.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f52146c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f52145b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f52145b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f52145b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f52145b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f52145b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f52146c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f52145b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f52145b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h */
    /* loaded from: classes.dex */
    public class C11079h extends ListPopupWindow implements InterfaceC11083i {

        /* renamed from: J */
        public CharSequence f52147J;

        /* renamed from: K */
        public ListAdapter f52148K;

        /* renamed from: P */
        public final Rect f52149P;

        /* renamed from: Q */
        public int f52150Q;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$a */
        /* loaded from: classes.dex */
        public class C11080a implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            public final /* synthetic */ AppCompatSpinner f52152b;

            public C11080a(AppCompatSpinner appCompatSpinner) {
                this.f52152b = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C11079h c11079h = C11079h.this;
                    AppCompatSpinner.this.performItemClick(view, i, c11079h.f52148K.getItemId(i));
                }
                C11079h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$b */
        /* loaded from: classes.dex */
        public class ViewTreeObserver$OnGlobalLayoutListenerC11081b implements ViewTreeObserver.OnGlobalLayoutListener {
            public ViewTreeObserver$OnGlobalLayoutListenerC11081b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C11079h c11079h = C11079h.this;
                if (!c11079h.m69941V(AppCompatSpinner.this)) {
                    C11079h.this.dismiss();
                    return;
                }
                C11079h.this.m69943T();
                C11079h.super.mo1722a();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$c */
        /* loaded from: classes.dex */
        public class C11082c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f52155b;

            public C11082c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f52155b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f52155b);
                }
            }
        }

        public C11079h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f52149P = new Rect();
            m69903D(AppCompatSpinner.this);
            m69897J(true);
            m69891P(0);
            m69895L(new C11080a(AppCompatSpinner.this));
        }

        /* renamed from: T */
        public void m69943T() {
            int i;
            int m69942U;
            Drawable m69887e = m69887e();
            if (m69887e != null) {
                m69887e.getPadding(AppCompatSpinner.this.mTempRect);
                if (C37406Yt6.m74027b(AppCompatSpinner.this)) {
                    i = AppCompatSpinner.this.mTempRect.right;
                } else {
                    i = -AppCompatSpinner.this.mTempRect.left;
                }
            } else {
                Rect rect = AppCompatSpinner.this.mTempRect;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.mDropDownWidth;
            if (i2 == -2) {
                int compatMeasureContentWidth = appCompatSpinner.compatMeasureContentWidth((SpinnerAdapter) this.f52148K, m69887e());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.mTempRect;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (compatMeasureContentWidth > i4) {
                    compatMeasureContentWidth = i4;
                }
                m69901F(Math.max(compatMeasureContentWidth, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m69901F((width - paddingLeft) - paddingRight);
            } else {
                m69901F(i2);
            }
            if (C37406Yt6.m74027b(AppCompatSpinner.this)) {
                m69942U = i + (((width - paddingRight) - m69873z()) - m69942U());
            } else {
                m69942U = i + paddingLeft + m69942U();
            }
            m69883m(m69942U);
        }

        /* renamed from: U */
        public int m69942U() {
            return this.f52150Q;
        }

        /* renamed from: V */
        public boolean m69941V(View view) {
            return C38790bq6.m62506Y(view) && view.getGlobalVisibleRect(this.f52149P);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: g */
        public void mo69936g(int i) {
            this.f52150Q = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: h */
        public void mo69935h(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean mo1721c = mo1721c();
            m69943T();
            m69898I(2);
            super.mo1722a();
            ListView mo1720k = mo1720k();
            mo1720k.setChoiceMode(1);
            C11075d.m69946d(mo1720k, i);
            C11075d.m69947c(mo1720k, i2);
            m69890Q(AppCompatSpinner.this.getSelectedItemPosition());
            if (!mo1721c && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                ViewTreeObserver$OnGlobalLayoutListenerC11081b viewTreeObserver$OnGlobalLayoutListenerC11081b = new ViewTreeObserver$OnGlobalLayoutListenerC11081b();
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC11081b);
                m69896K(new C11082c(viewTreeObserver$OnGlobalLayoutListenerC11081b));
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: n */
        public CharSequence mo69931n() {
            return this.f52147J;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: o */
        public void mo69930o(CharSequence charSequence) {
            this.f52147J = charSequence;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.InterfaceC11083i
        /* renamed from: p */
        public void mo69882p(ListAdapter listAdapter) {
            super.mo69882p(listAdapter);
            this.f52148K = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$i */
    /* loaded from: classes.dex */
    public interface InterfaceC11083i {
        /* renamed from: b */
        void mo69940b(Drawable drawable);

        /* renamed from: c */
        boolean mo69939c();

        void dismiss();

        /* renamed from: e */
        Drawable mo69938e();

        /* renamed from: f */
        void mo69937f(int i);

        /* renamed from: g */
        void mo69936g(int i);

        /* renamed from: h */
        void mo69935h(int i, int i2);

        /* renamed from: i */
        int mo69934i();

        /* renamed from: l */
        int mo69933l();

        /* renamed from: m */
        void mo69932m(int i);

        /* renamed from: n */
        CharSequence mo69931n();

        /* renamed from: o */
        void mo69930o(CharSequence charSequence);

        /* renamed from: p */
        void mo69882p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.mTempRect);
            Rect rect = this.mTempRect;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            c10331Zh.m72690b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC11083i interfaceC11083i = this.mPopup;
        if (interfaceC11083i != null) {
            return interfaceC11083i.mo69933l();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC11083i interfaceC11083i = this.mPopup;
        if (interfaceC11083i != null) {
            return interfaceC11083i.mo69934i();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.mPopup != null) {
            return this.mDropDownWidth;
        }
        return super.getDropDownWidth();
    }

    public final InterfaceC11083i getInternalPopup() {
        return this.mPopup;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC11083i interfaceC11083i = this.mPopup;
        if (interfaceC11083i != null) {
            return interfaceC11083i.mo69938e();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.mPopupContext;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC11083i interfaceC11083i = this.mPopup;
        return interfaceC11083i != null ? interfaceC11083i.mo69931n() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            return c10331Zh.m72689c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            return c10331Zh.m72688d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC11083i interfaceC11083i = this.mPopup;
        if (interfaceC11083i != null && interfaceC11083i.mo69939c()) {
            this.mPopup.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mPopup != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f52137b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC11073b());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC11083i interfaceC11083i = this.mPopup;
        if (interfaceC11083i != null && interfaceC11083i.mo69939c()) {
            z = true;
        } else {
            z = false;
        }
        savedState.f52137b = z;
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC32757Ex1 abstractView$OnTouchListenerC32757Ex1 = this.mForwardingListener;
        if (abstractView$OnTouchListenerC32757Ex1 != null && abstractView$OnTouchListenerC32757Ex1.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC11083i interfaceC11083i = this.mPopup;
        if (interfaceC11083i != null) {
            if (!interfaceC11083i.mo69939c()) {
                showPopup();
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            c10331Zh.m72686f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            c10331Zh.m72685g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC11083i interfaceC11083i = this.mPopup;
        if (interfaceC11083i != null) {
            interfaceC11083i.mo69936g(i);
            this.mPopup.mo69932m(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC11083i interfaceC11083i = this.mPopup;
        if (interfaceC11083i != null) {
            interfaceC11083i.mo69937f(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC11083i interfaceC11083i = this.mPopup;
        if (interfaceC11083i != null) {
            interfaceC11083i.mo69940b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C29611vi.m8248b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC11083i interfaceC11083i = this.mPopup;
        if (interfaceC11083i != null) {
            interfaceC11083i.mo69930o(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            c10331Zh.m72683i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            c10331Zh.m72682j(mode);
        }
    }

    public void showPopup() {
        this.mPopup.mo69935h(C11075d.m69948b(this), C11075d.m69949a(this));
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, C50553vf4.spinnerStyle, i);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            Context context = this.mPopupContext;
            if (context == null) {
                context = getContext();
            }
            this.mPopup.mo69882p(new C11078g(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.appcompat.widget.AppCompatSpinner, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.mTempRect = new Rect();
        C46645p36.m20010a(this, getContext());
        Z46 m73747v = Z46.m73747v(context, attributeSet, C43509jm4.Spinner, i, 0);
        this.mBackgroundTintHelper = new C10331Zh(this);
        if (theme != null) {
            this.mPopupContext = new C37806aB0(context, theme);
        } else {
            int m73755n = m73747v.m73755n(C43509jm4.Spinner_popupTheme, 0);
            if (m73755n != 0) {
                this.mPopupContext = new C37806aB0(context, m73755n);
            } else {
                this.mPopupContext = context;
            }
        }
        ?? r11 = -1;
        TypedArray typedArray2 = null;
        try {
            if (i2 == -1) {
                try {
                    typedArray = context.obtainStyledAttributes(attributeSet, ATTRS_ANDROID_SPINNERMODE, i, 0);
                    try {
                        boolean hasValue = typedArray.hasValue(0);
                        r11 = typedArray;
                        if (hasValue) {
                            i2 = typedArray.getInt(0, 0);
                            r11 = typedArray;
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.i(TAG, "Could not read android:spinnerMode", e);
                        r11 = typedArray;
                    }
                } catch (Exception e2) {
                    e = e2;
                    typedArray = null;
                } catch (Throwable th) {
                    th = th;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i2 == 0) {
                DialogInterface$OnClickListenerC11077f dialogInterface$OnClickListenerC11077f = new DialogInterface$OnClickListenerC11077f();
                this.mPopup = dialogInterface$OnClickListenerC11077f;
                dialogInterface$OnClickListenerC11077f.mo69930o(m73747v.m73754o(C43509jm4.Spinner_android_prompt));
            } else if (i2 == 1) {
                C11079h c11079h = new C11079h(this.mPopupContext, attributeSet, i);
                Z46 m73747v2 = Z46.m73747v(this.mPopupContext, attributeSet, C43509jm4.Spinner, i, 0);
                this.mDropDownWidth = m73747v2.m73756m(C43509jm4.Spinner_android_dropDownWidth, -2);
                c11079h.m69888b(m73747v2.m73762g(C43509jm4.Spinner_android_popupBackground));
                c11079h.mo69930o(m73747v.m73754o(C43509jm4.Spinner_android_prompt));
                m73747v2.m73746w();
                this.mPopup = c11079h;
                this.mForwardingListener = new C11072a(this, c11079h);
            }
            CharSequence[] m73752q = m73747v.m73752q(C43509jm4.Spinner_android_entries);
            if (m73752q != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, m73752q);
                arrayAdapter.setDropDownViewResource(C32643Ek4.support_simple_spinner_dropdown_item);
                setAdapter(arrayAdapter);
            }
            m73747v.m73746w();
            this.mPopupSet = true;
            SpinnerAdapter spinnerAdapter = this.mTempAdapter;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.mTempAdapter = null;
            }
            this.mBackgroundTintHelper.m72687e(attributeSet, i);
        } catch (Throwable th2) {
            th = th2;
            typedArray2 = r11;
        }
    }
}
