package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: R71 */
/* loaded from: classes.dex */
public class R71 extends ListView {

    /* renamed from: b */
    public final Rect f31559b;

    /* renamed from: c */
    public int f31560c;

    /* renamed from: d */
    public int f31561d;

    /* renamed from: e */
    public int f31562e;

    /* renamed from: f */
    public int f31563f;

    /* renamed from: g */
    public int f31564g;

    /* renamed from: h */
    public C7070d f31565h;

    /* renamed from: i */
    public boolean f31566i;

    /* renamed from: j */
    public boolean f31567j;

    /* renamed from: k */
    public boolean f31568k;

    /* renamed from: l */
    public C34823Ns6 f31569l;

    /* renamed from: m */
    public C32479Ds2 f31570m;

    /* renamed from: n */
    public RunnableC7072f f31571n;

    /* renamed from: R71$a */
    /* loaded from: classes.dex */
    public static class C7067a {
        private C7067a() {
        }

        /* renamed from: a */
        public static void m87292a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: R71$b */
    /* loaded from: classes.dex */
    public static class C7068b {

        /* renamed from: a */
        public static Method f31572a;

        /* renamed from: b */
        public static Method f31573b;

        /* renamed from: c */
        public static Method f31574c;

        /* renamed from: d */
        public static boolean f31575d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f31572a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f31573b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f31574c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f31575d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        private C7068b() {
        }

        /* renamed from: a */
        public static boolean m87291a() {
            return f31575d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        public static void m87290b(R71 r71, int i, View view) {
            try {
                f31572a.invoke(r71, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f31573b.invoke(r71, Integer.valueOf(i));
                f31574c.invoke(r71, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: R71$c */
    /* loaded from: classes.dex */
    public static class C7069c {
        private C7069c() {
        }

        /* renamed from: a */
        public static boolean m87289a(AbsListView absListView) {
            boolean isSelectedChildViewEnabled;
            isSelectedChildViewEnabled = absListView.isSelectedChildViewEnabled();
            return isSelectedChildViewEnabled;
        }

        /* renamed from: b */
        public static void m87288b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* renamed from: R71$d */
    /* loaded from: classes.dex */
    public static class C7070d extends C41936h71 {

        /* renamed from: c */
        public boolean f31576c;

        public C7070d(Drawable drawable) {
            super(drawable);
            this.f31576c = true;
        }

        /* renamed from: b */
        public void m87287b(boolean z) {
            this.f31576c = z;
        }

        @Override // p000.C41936h71, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f31576c) {
                super.draw(canvas);
            }
        }

        @Override // p000.C41936h71, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f31576c) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p000.C41936h71, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f31576c) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p000.C41936h71, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f31576c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p000.C41936h71, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f31576c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: R71$e */
    /* loaded from: classes.dex */
    public static class C7071e {

        /* renamed from: a */
        public static final Field f31577a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f31577a = field;
        }

        private C7071e() {
        }

        /* renamed from: a */
        public static boolean m87286a(AbsListView absListView) {
            Field field = f31577a;
            if (field != null) {
                try {
                    return field.getBoolean(absListView);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        /* renamed from: b */
        public static void m87285b(AbsListView absListView, boolean z) {
            Field field = f31577a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: R71$f */
    /* loaded from: classes.dex */
    public class RunnableC7072f implements Runnable {
        public RunnableC7072f() {
        }

        /* renamed from: a */
        public void m87284a() {
            R71 r71 = R71.this;
            r71.f31571n = null;
            r71.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m87283b() {
            R71.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            R71 r71 = R71.this;
            r71.f31571n = null;
            r71.drawableStateChanged();
        }
    }

    public R71(Context context, boolean z) {
        super(context, null, C50553vf4.dropDownListViewStyle);
        this.f31559b = new Rect();
        this.f31560c = 0;
        this.f31561d = 0;
        this.f31562e = 0;
        this.f31563f = 0;
        this.f31567j = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final void m87305a() {
        this.f31568k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f31564g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C34823Ns6 c34823Ns6 = this.f31569l;
        if (c34823Ns6 != null) {
            c34823Ns6.m93247c();
            this.f31569l = null;
        }
    }

    /* renamed from: b */
    public final void m87304b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    public final void m87303c(Canvas canvas) {
        Drawable selector;
        if (!this.f31559b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f31559b);
            selector.draw(canvas);
        }
    }

    /* renamed from: d */
    public int mo69864d(int i, int i2, int i3, int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i7 = 0;
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            if (i10 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i9 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                if (i5 >= 0 && i9 > i5 && i8 > 0 && i6 != i4) {
                    return i8;
                }
                return i4;
            }
            if (i5 >= 0 && i9 >= i5) {
                i8 = i6;
            }
        }
        return i6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m87303c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f31571n != null) {
            return;
        }
        super.drawableStateChanged();
        m87297k(true);
        m87293o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo69863e(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            }
        } else {
            z = false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition == -1) {
                z2 = true;
                if (z || z2) {
                    m87305a();
                }
                if (z) {
                    if (this.f31570m == null) {
                        this.f31570m = new C32479Ds2(this);
                    }
                    this.f31570m.m62229m(true);
                    this.f31570m.onTouch(this, motionEvent);
                } else {
                    C32479Ds2 c32479Ds2 = this.f31570m;
                    if (c32479Ds2 != null) {
                        c32479Ds2.m62229m(false);
                    }
                }
                return z;
            }
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            m87298j(childAt, pointToPosition, x, y);
            if (actionMasked == 1) {
                m87304b(childAt, pointToPosition);
            }
            z = true;
            z2 = false;
            if (z) {
            }
            m87305a();
            if (z) {
            }
            return z;
        }
        z2 = false;
        z = false;
        if (z) {
        }
        m87305a();
        if (z) {
        }
        return z;
    }

    /* renamed from: f */
    public final void m87302f(int i, View view) {
        Rect rect = this.f31559b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f31560c;
        rect.top -= this.f31561d;
        rect.right += this.f31562e;
        rect.bottom += this.f31563f;
        boolean m87296l = m87296l();
        if (view.isEnabled() != m87296l) {
            m87295m(!m87296l);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    /* renamed from: g */
    public final void m87301g(int i, View view) {
        boolean z;
        Drawable selector = getSelector();
        boolean z2 = true;
        if (selector != null && i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        m87302f(i, view);
        if (z) {
            Rect rect = this.f31559b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            P61.m90841k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    public final void m87300h(int i, View view, float f, float f2) {
        m87301g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            P61.m90841k(selector, f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f31567j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f31567j || super.hasWindowFocus();
    }

    /* renamed from: i */
    public void m87299i(boolean z) {
        this.f31566i = z;
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f31567j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f31567j && this.f31566i) || super.isInTouchMode();
    }

    /* renamed from: j */
    public final void m87298j(View view, int i, float f, float f2) {
        View childAt;
        this.f31568k = true;
        C7067a.m87292a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f31564g;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f31564g = i;
        C7067a.m87292a(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m87300h(i, view, f, f2);
        m87297k(false);
        refreshDrawableState();
    }

    /* renamed from: k */
    public final void m87297k(boolean z) {
        C7070d c7070d = this.f31565h;
        if (c7070d != null) {
            c7070d.m87287b(z);
        }
    }

    /* renamed from: l */
    public final boolean m87296l() {
        if (T30.m84398c()) {
            return C7069c.m87289a(this);
        }
        return C7071e.m87286a(this);
    }

    /* renamed from: m */
    public final void m87295m(boolean z) {
        if (T30.m84398c()) {
            C7069c.m87288b(this, z);
        } else {
            C7071e.m87285b(this, z);
        }
    }

    /* renamed from: n */
    public final boolean m87294n() {
        return this.f31568k;
    }

    /* renamed from: o */
    public final void m87293o() {
        Drawable selector = getSelector();
        if (selector != null && m87294n() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f31571n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f31571n == null) {
            RunnableC7072f runnableC7072f = new RunnableC7072f();
            this.f31571n = runnableC7072f;
            runnableC7072f.m87283b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && C7068b.m87291a()) {
                        C7068b.m87290b(this, pointToPosition, childAt);
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                m87293o();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f31564g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC7072f runnableC7072f = this.f31571n;
        if (runnableC7072f != null) {
            runnableC7072f.m87284a();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C7070d c7070d;
        if (drawable != null) {
            c7070d = new C7070d(drawable);
        } else {
            c7070d = null;
        }
        this.f31565h = c7070d;
        super.setSelector(c7070d);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f31560c = rect.left;
        this.f31561d = rect.top;
        this.f31562e = rect.right;
        this.f31563f = rect.bottom;
    }
}
