package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: Re */
/* loaded from: classes.dex */
public class C7220Re extends AbstractC37316Yj6 implements Animatable {

    /* renamed from: c */
    public C7223c f32372c;

    /* renamed from: d */
    public Context f32373d;

    /* renamed from: e */
    public ArgbEvaluator f32374e;

    /* renamed from: f */
    public C7224d f32375f;

    /* renamed from: g */
    public Animator.AnimatorListener f32376g;

    /* renamed from: h */
    public ArrayList<AbstractC27016oe> f32377h;

    /* renamed from: i */
    public final Drawable.Callback f32378i;

    /* renamed from: Re$a */
    /* loaded from: classes.dex */
    public class C7221a implements Drawable.Callback {
        public C7221a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C7220Re.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C7220Re.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C7220Re.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: Re$b */
    /* loaded from: classes.dex */
    public class C7222b extends AnimatorListenerAdapter {
        public C7222b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C7220Re.this.f32377h);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC27016oe) arrayList.get(i)).onAnimationEnd(C7220Re.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C7220Re.this.f32377h);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC27016oe) arrayList.get(i)).onAnimationStart(C7220Re.this);
            }
        }
    }

    /* renamed from: Re$c */
    /* loaded from: classes.dex */
    public static class C7223c extends Drawable.ConstantState {

        /* renamed from: a */
        public int f32381a;

        /* renamed from: b */
        public C37550Zj6 f32382b;

        /* renamed from: c */
        public AnimatorSet f32383c;

        /* renamed from: d */
        public ArrayList<Animator> f32384d;

        /* renamed from: e */
        public C28385so<Animator, String> f32385e;

        public C7223c(Context context, C7223c c7223c, Drawable.Callback callback, Resources resources) {
            if (c7223c != null) {
                this.f32381a = c7223c.f32381a;
                C37550Zj6 c37550Zj6 = c7223c.f32382b;
                if (c37550Zj6 != null) {
                    Drawable.ConstantState constantState = c37550Zj6.getConstantState();
                    if (resources != null) {
                        this.f32382b = (C37550Zj6) constantState.newDrawable(resources);
                    } else {
                        this.f32382b = (C37550Zj6) constantState.newDrawable();
                    }
                    C37550Zj6 c37550Zj62 = (C37550Zj6) this.f32382b.mutate();
                    this.f32382b = c37550Zj62;
                    c37550Zj62.setCallback(callback);
                    this.f32382b.setBounds(c7223c.f32382b.getBounds());
                    this.f32382b.m72637g(false);
                }
                ArrayList<Animator> arrayList = c7223c.f32384d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f32384d = new ArrayList<>(size);
                    this.f32385e = new C28385so<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c7223c.f32384d.get(i);
                        Animator clone = animator.clone();
                        String str = c7223c.f32385e.get(animator);
                        clone.setTarget(this.f32382b.m72641c(str));
                        this.f32384d.add(clone);
                        this.f32385e.put(clone, str);
                    }
                    m86509a();
                }
            }
        }

        /* renamed from: a */
        public void m86509a() {
            if (this.f32383c == null) {
                this.f32383c = new AnimatorSet();
            }
            this.f32383c.playTogether(this.f32384d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f32381a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C7220Re() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C7220Re m86517a(Context context, int i) {
        C7220Re c7220Re = new C7220Re(context);
        Drawable m10397f = C49785uM4.m10397f(context.getResources(), i, context.getTheme());
        c7220Re.f46514b = m10397f;
        m10397f.setCallback(c7220Re.f32378i);
        c7220Re.f32375f = new C7224d(c7220Re.f46514b.getConstantState());
        return c7220Re;
    }

    /* renamed from: c */
    public static void m86515c(Drawable drawable, AbstractC27016oe abstractC27016oe) {
        if (drawable == null || abstractC27016oe == null || !(drawable instanceof Animatable)) {
            return;
        }
        m86514d((AnimatedVectorDrawable) drawable, abstractC27016oe);
    }

    /* renamed from: d */
    public static void m86514d(AnimatedVectorDrawable animatedVectorDrawable, AbstractC27016oe abstractC27016oe) {
        animatedVectorDrawable.registerAnimationCallback(abstractC27016oe.getPlatformCallback());
    }

    /* renamed from: h */
    public static boolean m86510h(AnimatedVectorDrawable animatedVectorDrawable, AbstractC27016oe abstractC27016oe) {
        return animatedVectorDrawable.unregisterAnimationCallback(abstractC27016oe.getPlatformCallback());
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            P61.m90851a(drawable, theme);
        }
    }

    /* renamed from: b */
    public void m86516b(AbstractC27016oe abstractC27016oe) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            m86514d((AnimatedVectorDrawable) drawable, abstractC27016oe);
        } else if (abstractC27016oe == null) {
        } else {
            if (this.f32377h == null) {
                this.f32377h = new ArrayList<>();
            }
            if (this.f32377h.contains(abstractC27016oe)) {
                return;
            }
            this.f32377h.add(abstractC27016oe);
            if (this.f32376g == null) {
                this.f32376g = new C7222b();
            }
            this.f32372c.f32383c.addListener(this.f32376g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return P61.m90850b(drawable);
        }
        return false;
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f32372c.f32382b.draw(canvas);
        if (this.f32372c.f32383c.isStarted()) {
            invalidateSelf();
        }
    }

    /* renamed from: e */
    public final void m86513e() {
        Animator.AnimatorListener animatorListener = this.f32376g;
        if (animatorListener != null) {
            this.f32372c.f32383c.removeListener(animatorListener);
            this.f32376g = null;
        }
    }

    /* renamed from: f */
    public final void m86512f(String str, Animator animator) {
        animator.setTarget(this.f32372c.f32382b.m72641c(str));
        C7223c c7223c = this.f32372c;
        if (c7223c.f32384d == null) {
            c7223c.f32384d = new ArrayList<>();
            this.f32372c.f32385e = new C28385so<>();
        }
        this.f32372c.f32384d.add(animator);
        this.f32372c.f32385e.put(animator, str);
    }

    /* renamed from: g */
    public boolean m86511g(AbstractC27016oe abstractC27016oe) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            m86510h((AnimatedVectorDrawable) drawable, abstractC27016oe);
        }
        ArrayList<AbstractC27016oe> arrayList = this.f32377h;
        if (arrayList != null && abstractC27016oe != null) {
            boolean remove = arrayList.remove(abstractC27016oe);
            if (this.f32377h.size() == 0) {
                m86513e();
            }
            return remove;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return P61.m90848d(drawable);
        }
        return this.f32372c.f32382b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f32372c.f32381a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return P61.m90847e(drawable);
        }
        return this.f32372c.f32382b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f46514b != null) {
            return new C7224d(this.f46514b.getConstantState());
        }
        return null;
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f32372c.f32382b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f32372c.f32382b.getIntrinsicWidth();
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f32372c.f32382b.getOpacity();
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            P61.m90845g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m103665k = C33266Hb6.m103665k(resources, theme, attributeSet, C1919Ed.f7869e);
                    int resourceId = m103665k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C37550Zj6 m72642b = C37550Zj6.m72642b(resources, resourceId, theme);
                        m72642b.m72637g(false);
                        m72642b.setCallback(this.f32378i);
                        C37550Zj6 c37550Zj6 = this.f32372c.f32382b;
                        if (c37550Zj6 != null) {
                            c37550Zj6.setCallback(null);
                        }
                        this.f32372c.f32382b = m72642b;
                    }
                    m103665k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1919Ed.f7870f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f32373d;
                        if (context != null) {
                            m86512f(string, C31466zf.m618a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f32372c.m86509a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return P61.m90844h(drawable);
        }
        return this.f32372c.f32382b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f32372c.f32383c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f32372c.f32382b.isStateful();
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f32372c.f32382b.setBounds(rect);
        }
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f32372c.f32382b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f32372c.f32382b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f32372c.f32382b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            P61.m90842j(drawable, z);
        } else {
            this.f32372c.f32382b.setAutoMirrored(z);
        }
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            P61.m90838n(drawable, i);
        } else {
            this.f32372c.f32382b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            P61.m90837o(drawable, colorStateList);
        } else {
            this.f32372c.f32382b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            P61.m90836p(drawable, mode);
        } else {
            this.f32372c.f32382b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f32372c.f32382b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f32372c.f32383c.isStarted()) {
        } else {
            this.f32372c.f32383c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f32372c.f32383c.end();
        }
    }

    public C7220Re(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f32372c.f32382b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: Re$d */
    /* loaded from: classes.dex */
    public static class C7224d extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f32386a;

        public C7224d(Drawable.ConstantState constantState) {
            this.f32386a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f32386a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f32386a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C7220Re c7220Re = new C7220Re();
            Drawable newDrawable = this.f32386a.newDrawable();
            c7220Re.f46514b = newDrawable;
            newDrawable.setCallback(c7220Re.f32378i);
            return c7220Re;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C7220Re c7220Re = new C7220Re();
            Drawable newDrawable = this.f32386a.newDrawable(resources);
            c7220Re.f46514b = newDrawable;
            newDrawable.setCallback(c7220Re.f32378i);
            return c7220Re;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C7220Re c7220Re = new C7220Re();
            Drawable newDrawable = this.f32386a.newDrawable(resources, theme);
            c7220Re.f46514b = newDrawable;
            newDrawable.setCallback(c7220Re.f32378i);
            return c7220Re;
        }
    }

    public C7220Re(Context context, C7223c c7223c, Resources resources) {
        this.f32374e = null;
        this.f32376g = null;
        this.f32377h = null;
        C7221a c7221a = new C7221a();
        this.f32378i = c7221a;
        this.f32373d = context;
        if (c7223c != null) {
            this.f32372c = c7223c;
        } else {
            this.f32372c = new C7223c(context, c7223c, c7221a, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
