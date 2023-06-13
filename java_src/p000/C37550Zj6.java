package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.C49164tJ3;
/* renamed from: Zj6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37550Zj6 extends AbstractC37316Yj6 {

    /* renamed from: l */
    public static final PorterDuff.Mode f49008l = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public C10346h f49009c;

    /* renamed from: d */
    public PorterDuffColorFilter f49010d;

    /* renamed from: e */
    public ColorFilter f49011e;

    /* renamed from: f */
    public boolean f49012f;

    /* renamed from: g */
    public boolean f49013g;

    /* renamed from: h */
    public Drawable.ConstantState f49014h;

    /* renamed from: i */
    public final float[] f49015i;

    /* renamed from: j */
    public final Matrix f49016j;

    /* renamed from: k */
    public final Rect f49017k;

    /* renamed from: Zj6$b */
    /* loaded from: classes.dex */
    public static class C10340b extends AbstractC10344f {
        public C10340b() {
        }

        @Override // p000.C37550Zj6.AbstractC10344f
        /* renamed from: c */
        public boolean mo72623c() {
            return true;
        }

        /* renamed from: e */
        public void m72634e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!C33266Hb6.m103666j(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray m103665k = C33266Hb6.m103665k(resources, theme, attributeSet, C1919Ed.f7868d);
            m72633f(m103665k, xmlPullParser);
            m103665k.recycle();
        }

        /* renamed from: f */
        public final void m72633f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f49044b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f49043a = C49164tJ3.m12511d(string2);
            }
            this.f49045c = C33266Hb6.m103669g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public C10340b(C10340b c10340b) {
            super(c10340b);
        }
    }

    /* renamed from: Zj6$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10343e {
        private AbstractC10343e() {
        }

        /* renamed from: a */
        public boolean mo72625a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo72624b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: Zj6$h */
    /* loaded from: classes.dex */
    public static class C10346h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f49064a;

        /* renamed from: b */
        public C10345g f49065b;

        /* renamed from: c */
        public ColorStateList f49066c;

        /* renamed from: d */
        public PorterDuff.Mode f49067d;

        /* renamed from: e */
        public boolean f49068e;

        /* renamed from: f */
        public Bitmap f49069f;

        /* renamed from: g */
        public ColorStateList f49070g;

        /* renamed from: h */
        public PorterDuff.Mode f49071h;

        /* renamed from: i */
        public int f49072i;

        /* renamed from: j */
        public boolean f49073j;

        /* renamed from: k */
        public boolean f49074k;

        /* renamed from: l */
        public Paint f49075l;

        public C10346h(C10346h c10346h) {
            this.f49066c = null;
            this.f49067d = C37550Zj6.f49008l;
            if (c10346h != null) {
                this.f49064a = c10346h.f49064a;
                C10345g c10345g = new C10345g(c10346h.f49065b);
                this.f49065b = c10345g;
                if (c10346h.f49065b.f49052e != null) {
                    c10345g.f49052e = new Paint(c10346h.f49065b.f49052e);
                }
                if (c10346h.f49065b.f49051d != null) {
                    this.f49065b.f49051d = new Paint(c10346h.f49065b.f49051d);
                }
                this.f49066c = c10346h.f49066c;
                this.f49067d = c10346h.f49067d;
                this.f49068e = c10346h.f49068e;
            }
        }

        /* renamed from: a */
        public boolean m72614a(int i, int i2) {
            if (i == this.f49069f.getWidth() && i2 == this.f49069f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m72613b() {
            if (!this.f49074k && this.f49070g == this.f49066c && this.f49071h == this.f49067d && this.f49073j == this.f49068e && this.f49072i == this.f49065b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m72612c(int i, int i2) {
            if (this.f49069f == null || !m72614a(i, i2)) {
                this.f49069f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f49074k = true;
            }
        }

        /* renamed from: d */
        public void m72611d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f49069f, (Rect) null, rect, m72610e(colorFilter));
        }

        /* renamed from: e */
        public Paint m72610e(ColorFilter colorFilter) {
            if (!m72609f() && colorFilter == null) {
                return null;
            }
            if (this.f49075l == null) {
                Paint paint = new Paint();
                this.f49075l = paint;
                paint.setFilterBitmap(true);
            }
            this.f49075l.setAlpha(this.f49065b.getRootAlpha());
            this.f49075l.setColorFilter(colorFilter);
            return this.f49075l;
        }

        /* renamed from: f */
        public boolean m72609f() {
            return this.f49065b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m72608g() {
            return this.f49065b.m72616f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f49064a;
        }

        /* renamed from: h */
        public boolean m72607h(int[] iArr) {
            boolean m72615g = this.f49065b.m72615g(iArr);
            this.f49074k |= m72615g;
            return m72615g;
        }

        /* renamed from: i */
        public void m72606i() {
            this.f49070g = this.f49066c;
            this.f49071h = this.f49067d;
            this.f49072i = this.f49065b.getRootAlpha();
            this.f49073j = this.f49068e;
            this.f49074k = false;
        }

        /* renamed from: j */
        public void m72605j(int i, int i2) {
            this.f49069f.eraseColor(0);
            this.f49065b.m72620b(new Canvas(this.f49069f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C37550Zj6(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C37550Zj6(this);
        }

        public C10346h() {
            this.f49066c = null;
            this.f49067d = C37550Zj6.f49008l;
            this.f49065b = new C10345g();
        }
    }

    public C37550Zj6() {
        this.f49013g = true;
        this.f49015i = new float[9];
        this.f49016j = new Matrix();
        this.f49017k = new Rect();
        this.f49009c = new C10346h();
    }

    /* renamed from: a */
    public static int m72643a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    /* renamed from: b */
    public static C37550Zj6 m72642b(Resources resources, int i, Resources.Theme theme) {
        C37550Zj6 c37550Zj6 = new C37550Zj6();
        c37550Zj6.f46514b = C49785uM4.m10397f(resources, i, theme);
        c37550Zj6.f49014h = new C10347i(c37550Zj6.f46514b.getConstantState());
        return c37550Zj6;
    }

    /* renamed from: f */
    public static PorterDuff.Mode m72638f(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* renamed from: c */
    public Object m72641c(String str) {
        return this.f49009c.f49065b.f49063p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            P61.m90850b(drawable);
            return false;
        }
        return false;
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public final void m72640d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C10346h c10346h = this.f49009c;
        C10345g c10345g = c10346h.f49065b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c10345g.f49055h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C10342d c10342d = (C10342d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C10341c c10341c = new C10341c();
                    c10341c.m72630g(resources, attributeSet, theme, xmlPullParser);
                    c10342d.f49031b.add(c10341c);
                    if (c10341c.getPathName() != null) {
                        c10345g.f49063p.put(c10341c.getPathName(), c10341c);
                    }
                    c10346h.f49064a = c10341c.f49046d | c10346h.f49064a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C10340b c10340b = new C10340b();
                    c10340b.m72634e(resources, attributeSet, theme, xmlPullParser);
                    c10342d.f49031b.add(c10340b);
                    if (c10340b.getPathName() != null) {
                        c10345g.f49063p.put(c10340b.getPathName(), c10340b);
                    }
                    c10346h.f49064a = c10340b.f49046d | c10346h.f49064a;
                } else if ("group".equals(name)) {
                    C10342d c10342d2 = new C10342d();
                    c10342d2.m72628c(resources, attributeSet, theme, xmlPullParser);
                    c10342d.f49031b.add(c10342d2);
                    arrayDeque.push(c10342d2);
                    if (c10342d2.getGroupName() != null) {
                        c10345g.f49063p.put(c10342d2.getGroupName(), c10342d2);
                    }
                    c10346h.f49064a = c10342d2.f49040k | c10346h.f49064a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f49017k);
        if (this.f49017k.width() > 0 && this.f49017k.height() > 0) {
            ColorFilter colorFilter = this.f49011e;
            if (colorFilter == null) {
                colorFilter = this.f49010d;
            }
            canvas.getMatrix(this.f49016j);
            this.f49016j.getValues(this.f49015i);
            float abs = Math.abs(this.f49015i[0]);
            float abs2 = Math.abs(this.f49015i[4]);
            float abs3 = Math.abs(this.f49015i[1]);
            float abs4 = Math.abs(this.f49015i[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (this.f49017k.width() * abs));
            int min2 = Math.min(2048, (int) (this.f49017k.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f49017k;
                canvas.translate(rect.left, rect.top);
                if (m72639e()) {
                    canvas.translate(this.f49017k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f49017k.offsetTo(0, 0);
                this.f49009c.m72612c(min, min2);
                if (!this.f49013g) {
                    this.f49009c.m72605j(min, min2);
                } else if (!this.f49009c.m72613b()) {
                    this.f49009c.m72605j(min, min2);
                    this.f49009c.m72606i();
                }
                this.f49009c.m72611d(canvas, colorFilter, this.f49017k);
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: e */
    public final boolean m72639e() {
        if (isAutoMirrored() && P61.m90846f(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m72637g(boolean z) {
        this.f49013g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return P61.m90848d(drawable);
        }
        return this.f49009c.f49065b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f49009c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return P61.m90847e(drawable);
        }
        return this.f49011e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f46514b != null) {
            return new C10347i(this.f46514b.getConstantState());
        }
        this.f49009c.f49064a = getChangingConfigurations();
        return this.f49009c;
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
        return (int) this.f49009c.f49065b.f49057j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f49009c.f49065b.f49056i;
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
        return -3;
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

    /* renamed from: h */
    public final void m72636h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C10346h c10346h = this.f49009c;
        C10345g c10345g = c10346h.f49065b;
        c10346h.f49067d = m72638f(C33266Hb6.m103669g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m103673c = C33266Hb6.m103673c(typedArray, xmlPullParser, theme, "tint", 1);
        if (m103673c != null) {
            c10346h.f49066c = m103673c;
        }
        c10346h.f49068e = C33266Hb6.m103675a(typedArray, xmlPullParser, "autoMirrored", 5, c10346h.f49068e);
        c10345g.f49058k = C33266Hb6.m103670f(typedArray, xmlPullParser, "viewportWidth", 7, c10345g.f49058k);
        float m103670f = C33266Hb6.m103670f(typedArray, xmlPullParser, "viewportHeight", 8, c10345g.f49059l);
        c10345g.f49059l = m103670f;
        if (c10345g.f49058k > 0.0f) {
            if (m103670f > 0.0f) {
                c10345g.f49056i = typedArray.getDimension(3, c10345g.f49056i);
                float dimension = typedArray.getDimension(2, c10345g.f49057j);
                c10345g.f49057j = dimension;
                if (c10345g.f49056i > 0.0f) {
                    if (dimension > 0.0f) {
                        c10345g.setAlpha(C33266Hb6.m103670f(typedArray, xmlPullParser, "alpha", 4, c10345g.getAlpha()));
                        String string = typedArray.getString(0);
                        if (string != null) {
                            c10345g.f49061n = string;
                            c10345g.f49063p.put(string, c10345g);
                            return;
                        }
                        return;
                    }
                    throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    /* renamed from: i */
    public PorterDuffColorFilter m72635i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return P61.m90844h(drawable);
        }
        return this.f49009c.f49068e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C10346h c10346h;
        ColorStateList colorStateList;
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful() && ((c10346h = this.f49009c) == null || (!c10346h.m72608g() && ((colorStateList = this.f49009c.f49066c) == null || !colorStateList.isStateful())))) {
            return false;
        }
        return true;
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
            return this;
        }
        if (!this.f49012f && super.mutate() == this) {
            this.f49009c = new C10346h(this.f49009c);
            this.f49012f = true;
        }
        return this;
    }

    @Override // p000.AbstractC37316Yj6, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C10346h c10346h = this.f49009c;
        ColorStateList colorStateList = c10346h.f49066c;
        if (colorStateList != null && (mode = c10346h.f49067d) != null) {
            this.f49010d = m72635i(this.f49010d, colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        if (c10346h.m72608g() && c10346h.m72607h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f49009c.f49065b.getRootAlpha() != i) {
            this.f49009c.f49065b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            P61.m90842j(drawable, z);
        } else {
            this.f49009c.f49068e = z;
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
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            P61.m90837o(drawable, colorStateList);
            return;
        }
        C10346h c10346h = this.f49009c;
        if (c10346h.f49066c != colorStateList) {
            c10346h.f49066c = colorStateList;
            this.f49010d = m72635i(this.f49010d, colorStateList, c10346h.f49067d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            P61.m90836p(drawable, mode);
            return;
        }
        C10346h c10346h = this.f49009c;
        if (c10346h.f49067d != mode) {
            c10346h.f49067d = mode;
            this.f49010d = m72635i(this.f49010d, c10346h.f49066c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: Zj6$i */
    /* loaded from: classes.dex */
    public static class C10347i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f49076a;

        public C10347i(Drawable.ConstantState constantState) {
            this.f49076a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f49076a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f49076a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C37550Zj6 c37550Zj6 = new C37550Zj6();
            c37550Zj6.f46514b = (VectorDrawable) this.f49076a.newDrawable();
            return c37550Zj6;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C37550Zj6 c37550Zj6 = new C37550Zj6();
            c37550Zj6.f46514b = (VectorDrawable) this.f49076a.newDrawable(resources);
            return c37550Zj6;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C37550Zj6 c37550Zj6 = new C37550Zj6();
            c37550Zj6.f46514b = (VectorDrawable) this.f49076a.newDrawable(resources, theme);
            return c37550Zj6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f49011e = colorFilter;
        invalidateSelf();
    }

    /* renamed from: Zj6$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10344f extends AbstractC10343e {

        /* renamed from: a */
        public C49164tJ3.C28677b[] f49043a;

        /* renamed from: b */
        public String f49044b;

        /* renamed from: c */
        public int f49045c;

        /* renamed from: d */
        public int f49046d;

        public AbstractC10344f() {
            super();
            this.f49043a = null;
            this.f49045c = 0;
        }

        /* renamed from: c */
        public boolean mo72623c() {
            return false;
        }

        /* renamed from: d */
        public void m72622d(Path path) {
            path.reset();
            C49164tJ3.C28677b[] c28677bArr = this.f49043a;
            if (c28677bArr != null) {
                C49164tJ3.C28677b.m12501d(c28677bArr, path);
            }
        }

        public C49164tJ3.C28677b[] getPathData() {
            return this.f49043a;
        }

        public String getPathName() {
            return this.f49044b;
        }

        public void setPathData(C49164tJ3.C28677b[] c28677bArr) {
            if (!C49164tJ3.m12513b(this.f49043a, c28677bArr)) {
                this.f49043a = C49164tJ3.m12509f(c28677bArr);
            } else {
                C49164tJ3.m12505j(this.f49043a, c28677bArr);
            }
        }

        public AbstractC10344f(AbstractC10344f abstractC10344f) {
            super();
            this.f49043a = null;
            this.f49045c = 0;
            this.f49044b = abstractC10344f.f49044b;
            this.f49046d = abstractC10344f.f49046d;
            this.f49043a = C49164tJ3.m12509f(abstractC10344f.f49043a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f46514b;
        if (drawable != null) {
            P61.m90845g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C10346h c10346h = this.f49009c;
        c10346h.f49065b = new C10345g();
        TypedArray m103665k = C33266Hb6.m103665k(resources, theme, attributeSet, C1919Ed.f7865a);
        m72636h(m103665k, xmlPullParser, theme);
        m103665k.recycle();
        c10346h.f49064a = getChangingConfigurations();
        c10346h.f49074k = true;
        m72640d(resources, xmlPullParser, attributeSet, theme);
        this.f49010d = m72635i(this.f49010d, c10346h.f49066c, c10346h.f49067d);
    }

    public C37550Zj6(C10346h c10346h) {
        this.f49013g = true;
        this.f49015i = new float[9];
        this.f49016j = new Matrix();
        this.f49017k = new Rect();
        this.f49009c = c10346h;
        this.f49010d = m72635i(this.f49010d, c10346h.f49066c, c10346h.f49067d);
    }

    /* renamed from: Zj6$c */
    /* loaded from: classes.dex */
    public static class C10341c extends AbstractC10344f {

        /* renamed from: e */
        public int[] f49018e;

        /* renamed from: f */
        public C50087us0 f49019f;

        /* renamed from: g */
        public float f49020g;

        /* renamed from: h */
        public C50087us0 f49021h;

        /* renamed from: i */
        public float f49022i;

        /* renamed from: j */
        public float f49023j;

        /* renamed from: k */
        public float f49024k;

        /* renamed from: l */
        public float f49025l;

        /* renamed from: m */
        public float f49026m;

        /* renamed from: n */
        public Paint.Cap f49027n;

        /* renamed from: o */
        public Paint.Join f49028o;

        /* renamed from: p */
        public float f49029p;

        public C10341c() {
            this.f49020g = 0.0f;
            this.f49022i = 1.0f;
            this.f49023j = 1.0f;
            this.f49024k = 0.0f;
            this.f49025l = 1.0f;
            this.f49026m = 0.0f;
            this.f49027n = Paint.Cap.BUTT;
            this.f49028o = Paint.Join.MITER;
            this.f49029p = 4.0f;
        }

        @Override // p000.C37550Zj6.AbstractC10343e
        /* renamed from: a */
        public boolean mo72625a() {
            return this.f49021h.m9636i() || this.f49019f.m9636i();
        }

        @Override // p000.C37550Zj6.AbstractC10343e
        /* renamed from: b */
        public boolean mo72624b(int[] iArr) {
            return this.f49019f.m9635j(iArr) | this.f49021h.m9635j(iArr);
        }

        /* renamed from: e */
        public final Paint.Cap m72632e(int i, Paint.Cap cap) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        /* renamed from: f */
        public final Paint.Join m72631f(int i, Paint.Join join) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        /* renamed from: g */
        public void m72630g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m103665k = C33266Hb6.m103665k(resources, theme, attributeSet, C1919Ed.f7867c);
            m72629h(m103665k, xmlPullParser, theme);
            m103665k.recycle();
        }

        public float getFillAlpha() {
            return this.f49023j;
        }

        public int getFillColor() {
            return this.f49021h.m9640e();
        }

        public float getStrokeAlpha() {
            return this.f49022i;
        }

        public int getStrokeColor() {
            return this.f49019f.m9640e();
        }

        public float getStrokeWidth() {
            return this.f49020g;
        }

        public float getTrimPathEnd() {
            return this.f49025l;
        }

        public float getTrimPathOffset() {
            return this.f49026m;
        }

        public float getTrimPathStart() {
            return this.f49024k;
        }

        /* renamed from: h */
        public final void m72629h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f49018e = null;
            if (!C33266Hb6.m103666j(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.f49044b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.f49043a = C49164tJ3.m12511d(string2);
            }
            this.f49021h = C33266Hb6.m103671e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.f49023j = C33266Hb6.m103670f(typedArray, xmlPullParser, "fillAlpha", 12, this.f49023j);
            this.f49027n = m72632e(C33266Hb6.m103669g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f49027n);
            this.f49028o = m72631f(C33266Hb6.m103669g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f49028o);
            this.f49029p = C33266Hb6.m103670f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f49029p);
            this.f49019f = C33266Hb6.m103671e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.f49022i = C33266Hb6.m103670f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f49022i);
            this.f49020g = C33266Hb6.m103670f(typedArray, xmlPullParser, "strokeWidth", 4, this.f49020g);
            this.f49025l = C33266Hb6.m103670f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f49025l);
            this.f49026m = C33266Hb6.m103670f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f49026m);
            this.f49024k = C33266Hb6.m103670f(typedArray, xmlPullParser, "trimPathStart", 5, this.f49024k);
            this.f49045c = C33266Hb6.m103669g(typedArray, xmlPullParser, "fillType", 13, this.f49045c);
        }

        public void setFillAlpha(float f) {
            this.f49023j = f;
        }

        public void setFillColor(int i) {
            this.f49021h.m9634k(i);
        }

        public void setStrokeAlpha(float f) {
            this.f49022i = f;
        }

        public void setStrokeColor(int i) {
            this.f49019f.m9634k(i);
        }

        public void setStrokeWidth(float f) {
            this.f49020g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f49025l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f49026m = f;
        }

        public void setTrimPathStart(float f) {
            this.f49024k = f;
        }

        public C10341c(C10341c c10341c) {
            super(c10341c);
            this.f49020g = 0.0f;
            this.f49022i = 1.0f;
            this.f49023j = 1.0f;
            this.f49024k = 0.0f;
            this.f49025l = 1.0f;
            this.f49026m = 0.0f;
            this.f49027n = Paint.Cap.BUTT;
            this.f49028o = Paint.Join.MITER;
            this.f49029p = 4.0f;
            this.f49018e = c10341c.f49018e;
            this.f49019f = c10341c.f49019f;
            this.f49020g = c10341c.f49020g;
            this.f49022i = c10341c.f49022i;
            this.f49021h = c10341c.f49021h;
            this.f49045c = c10341c.f49045c;
            this.f49023j = c10341c.f49023j;
            this.f49024k = c10341c.f49024k;
            this.f49025l = c10341c.f49025l;
            this.f49026m = c10341c.f49026m;
            this.f49027n = c10341c.f49027n;
            this.f49028o = c10341c.f49028o;
            this.f49029p = c10341c.f49029p;
        }
    }

    /* renamed from: Zj6$g */
    /* loaded from: classes.dex */
    public static class C10345g {

        /* renamed from: q */
        public static final Matrix f49047q = new Matrix();

        /* renamed from: a */
        public final Path f49048a;

        /* renamed from: b */
        public final Path f49049b;

        /* renamed from: c */
        public final Matrix f49050c;

        /* renamed from: d */
        public Paint f49051d;

        /* renamed from: e */
        public Paint f49052e;

        /* renamed from: f */
        public PathMeasure f49053f;

        /* renamed from: g */
        public int f49054g;

        /* renamed from: h */
        public final C10342d f49055h;

        /* renamed from: i */
        public float f49056i;

        /* renamed from: j */
        public float f49057j;

        /* renamed from: k */
        public float f49058k;

        /* renamed from: l */
        public float f49059l;

        /* renamed from: m */
        public int f49060m;

        /* renamed from: n */
        public String f49061n;

        /* renamed from: o */
        public Boolean f49062o;

        /* renamed from: p */
        public final C28385so<String, Object> f49063p;

        public C10345g() {
            this.f49050c = new Matrix();
            this.f49056i = 0.0f;
            this.f49057j = 0.0f;
            this.f49058k = 0.0f;
            this.f49059l = 0.0f;
            this.f49060m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f49061n = null;
            this.f49062o = null;
            this.f49063p = new C28385so<>();
            this.f49055h = new C10342d();
            this.f49048a = new Path();
            this.f49049b = new Path();
        }

        /* renamed from: a */
        public static float m72621a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: b */
        public void m72620b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m72619c(this.f49055h, f49047q, canvas, i, i2, colorFilter);
        }

        /* renamed from: c */
        public final void m72619c(C10342d c10342d, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c10342d.f49030a.set(matrix);
            c10342d.f49030a.preConcat(c10342d.f49039j);
            canvas.save();
            for (int i3 = 0; i3 < c10342d.f49031b.size(); i3++) {
                AbstractC10343e abstractC10343e = c10342d.f49031b.get(i3);
                if (abstractC10343e instanceof C10342d) {
                    m72619c((C10342d) abstractC10343e, c10342d.f49030a, canvas, i, i2, colorFilter);
                } else if (abstractC10343e instanceof AbstractC10344f) {
                    m72618d(c10342d, (AbstractC10344f) abstractC10343e, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        public final void m72618d(C10342d c10342d, AbstractC10344f abstractC10344f, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f = i / this.f49058k;
            float f2 = i2 / this.f49059l;
            float min = Math.min(f, f2);
            Matrix matrix = c10342d.f49030a;
            this.f49050c.set(matrix);
            this.f49050c.postScale(f, f2);
            float m72617e = m72617e(matrix);
            if (m72617e == 0.0f) {
                return;
            }
            abstractC10344f.m72622d(this.f49048a);
            Path path = this.f49048a;
            this.f49049b.reset();
            if (abstractC10344f.mo72623c()) {
                Path path2 = this.f49049b;
                if (abstractC10344f.f49045c == 0) {
                    fillType2 = Path.FillType.WINDING;
                } else {
                    fillType2 = Path.FillType.EVEN_ODD;
                }
                path2.setFillType(fillType2);
                this.f49049b.addPath(path, this.f49050c);
                canvas.clipPath(this.f49049b);
                return;
            }
            C10341c c10341c = (C10341c) abstractC10344f;
            float f3 = c10341c.f49024k;
            if (f3 != 0.0f || c10341c.f49025l != 1.0f) {
                float f4 = c10341c.f49026m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c10341c.f49025l + f4) % 1.0f;
                if (this.f49053f == null) {
                    this.f49053f = new PathMeasure();
                }
                this.f49053f.setPath(this.f49048a, false);
                float length = this.f49053f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f49053f.getSegment(f7, length, path, true);
                    this.f49053f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f49053f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f49049b.addPath(path, this.f49050c);
            if (c10341c.f49021h.m9633l()) {
                C50087us0 c50087us0 = c10341c.f49021h;
                if (this.f49052e == null) {
                    Paint paint = new Paint(1);
                    this.f49052e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f49052e;
                if (c50087us0.m9637h()) {
                    Shader m9639f = c50087us0.m9639f();
                    m9639f.setLocalMatrix(this.f49050c);
                    paint2.setShader(m9639f);
                    paint2.setAlpha(Math.round(c10341c.f49023j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                    paint2.setColor(C37550Zj6.m72643a(c50087us0.m9640e(), c10341c.f49023j));
                }
                paint2.setColorFilter(colorFilter);
                Path path3 = this.f49049b;
                if (c10341c.f49045c == 0) {
                    fillType = Path.FillType.WINDING;
                } else {
                    fillType = Path.FillType.EVEN_ODD;
                }
                path3.setFillType(fillType);
                canvas.drawPath(this.f49049b, paint2);
            }
            if (c10341c.f49019f.m9633l()) {
                C50087us0 c50087us02 = c10341c.f49019f;
                if (this.f49051d == null) {
                    Paint paint3 = new Paint(1);
                    this.f49051d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f49051d;
                Paint.Join join = c10341c.f49028o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c10341c.f49027n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c10341c.f49029p);
                if (c50087us02.m9637h()) {
                    Shader m9639f2 = c50087us02.m9639f();
                    m9639f2.setLocalMatrix(this.f49050c);
                    paint4.setShader(m9639f2);
                    paint4.setAlpha(Math.round(c10341c.f49022i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                    paint4.setColor(C37550Zj6.m72643a(c50087us02.m9640e(), c10341c.f49022i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c10341c.f49020g * min * m72617e);
                canvas.drawPath(this.f49049b, paint4);
            }
        }

        /* renamed from: e */
        public final float m72617e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float m72621a = m72621a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max <= 0.0f) {
                return 0.0f;
            }
            return Math.abs(m72621a) / max;
        }

        /* renamed from: f */
        public boolean m72616f() {
            if (this.f49062o == null) {
                this.f49062o = Boolean.valueOf(this.f49055h.mo72625a());
            }
            return this.f49062o.booleanValue();
        }

        /* renamed from: g */
        public boolean m72615g(int[] iArr) {
            return this.f49055h.mo72624b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f49060m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f49060m = i;
        }

        public C10345g(C10345g c10345g) {
            this.f49050c = new Matrix();
            this.f49056i = 0.0f;
            this.f49057j = 0.0f;
            this.f49058k = 0.0f;
            this.f49059l = 0.0f;
            this.f49060m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f49061n = null;
            this.f49062o = null;
            C28385so<String, Object> c28385so = new C28385so<>();
            this.f49063p = c28385so;
            this.f49055h = new C10342d(c10345g.f49055h, c28385so);
            this.f49048a = new Path(c10345g.f49048a);
            this.f49049b = new Path(c10345g.f49049b);
            this.f49056i = c10345g.f49056i;
            this.f49057j = c10345g.f49057j;
            this.f49058k = c10345g.f49058k;
            this.f49059l = c10345g.f49059l;
            this.f49054g = c10345g.f49054g;
            this.f49060m = c10345g.f49060m;
            this.f49061n = c10345g.f49061n;
            String str = c10345g.f49061n;
            if (str != null) {
                c28385so.put(str, this);
            }
            this.f49062o = c10345g.f49062o;
        }
    }

    /* renamed from: Zj6$d */
    /* loaded from: classes.dex */
    public static class C10342d extends AbstractC10343e {

        /* renamed from: a */
        public final Matrix f49030a;

        /* renamed from: b */
        public final ArrayList<AbstractC10343e> f49031b;

        /* renamed from: c */
        public float f49032c;

        /* renamed from: d */
        public float f49033d;

        /* renamed from: e */
        public float f49034e;

        /* renamed from: f */
        public float f49035f;

        /* renamed from: g */
        public float f49036g;

        /* renamed from: h */
        public float f49037h;

        /* renamed from: i */
        public float f49038i;

        /* renamed from: j */
        public final Matrix f49039j;

        /* renamed from: k */
        public int f49040k;

        /* renamed from: l */
        public int[] f49041l;

        /* renamed from: m */
        public String f49042m;

        public C10342d(C10342d c10342d, C28385so<String, Object> c28385so) {
            super();
            AbstractC10344f c10340b;
            this.f49030a = new Matrix();
            this.f49031b = new ArrayList<>();
            this.f49032c = 0.0f;
            this.f49033d = 0.0f;
            this.f49034e = 0.0f;
            this.f49035f = 1.0f;
            this.f49036g = 1.0f;
            this.f49037h = 0.0f;
            this.f49038i = 0.0f;
            Matrix matrix = new Matrix();
            this.f49039j = matrix;
            this.f49042m = null;
            this.f49032c = c10342d.f49032c;
            this.f49033d = c10342d.f49033d;
            this.f49034e = c10342d.f49034e;
            this.f49035f = c10342d.f49035f;
            this.f49036g = c10342d.f49036g;
            this.f49037h = c10342d.f49037h;
            this.f49038i = c10342d.f49038i;
            this.f49041l = c10342d.f49041l;
            String str = c10342d.f49042m;
            this.f49042m = str;
            this.f49040k = c10342d.f49040k;
            if (str != null) {
                c28385so.put(str, this);
            }
            matrix.set(c10342d.f49039j);
            ArrayList<AbstractC10343e> arrayList = c10342d.f49031b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC10343e abstractC10343e = arrayList.get(i);
                if (abstractC10343e instanceof C10342d) {
                    this.f49031b.add(new C10342d((C10342d) abstractC10343e, c28385so));
                } else {
                    if (abstractC10343e instanceof C10341c) {
                        c10340b = new C10341c((C10341c) abstractC10343e);
                    } else if (abstractC10343e instanceof C10340b) {
                        c10340b = new C10340b((C10340b) abstractC10343e);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f49031b.add(c10340b);
                    String str2 = c10340b.f49044b;
                    if (str2 != null) {
                        c28385so.put(str2, c10340b);
                    }
                }
            }
        }

        @Override // p000.C37550Zj6.AbstractC10343e
        /* renamed from: a */
        public boolean mo72625a() {
            for (int i = 0; i < this.f49031b.size(); i++) {
                if (this.f49031b.get(i).mo72625a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.C37550Zj6.AbstractC10343e
        /* renamed from: b */
        public boolean mo72624b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f49031b.size(); i++) {
                z |= this.f49031b.get(i).mo72624b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void m72628c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m103665k = C33266Hb6.m103665k(resources, theme, attributeSet, C1919Ed.f7866b);
            m72626e(m103665k, xmlPullParser);
            m103665k.recycle();
        }

        /* renamed from: d */
        public final void m72627d() {
            this.f49039j.reset();
            this.f49039j.postTranslate(-this.f49033d, -this.f49034e);
            this.f49039j.postScale(this.f49035f, this.f49036g);
            this.f49039j.postRotate(this.f49032c, 0.0f, 0.0f);
            this.f49039j.postTranslate(this.f49037h + this.f49033d, this.f49038i + this.f49034e);
        }

        /* renamed from: e */
        public final void m72626e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f49041l = null;
            this.f49032c = C33266Hb6.m103670f(typedArray, xmlPullParser, "rotation", 5, this.f49032c);
            this.f49033d = typedArray.getFloat(1, this.f49033d);
            this.f49034e = typedArray.getFloat(2, this.f49034e);
            this.f49035f = C33266Hb6.m103670f(typedArray, xmlPullParser, "scaleX", 3, this.f49035f);
            this.f49036g = C33266Hb6.m103670f(typedArray, xmlPullParser, "scaleY", 4, this.f49036g);
            this.f49037h = C33266Hb6.m103670f(typedArray, xmlPullParser, "translateX", 6, this.f49037h);
            this.f49038i = C33266Hb6.m103670f(typedArray, xmlPullParser, "translateY", 7, this.f49038i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f49042m = string;
            }
            m72627d();
        }

        public String getGroupName() {
            return this.f49042m;
        }

        public Matrix getLocalMatrix() {
            return this.f49039j;
        }

        public float getPivotX() {
            return this.f49033d;
        }

        public float getPivotY() {
            return this.f49034e;
        }

        public float getRotation() {
            return this.f49032c;
        }

        public float getScaleX() {
            return this.f49035f;
        }

        public float getScaleY() {
            return this.f49036g;
        }

        public float getTranslateX() {
            return this.f49037h;
        }

        public float getTranslateY() {
            return this.f49038i;
        }

        public void setPivotX(float f) {
            if (f != this.f49033d) {
                this.f49033d = f;
                m72627d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f49034e) {
                this.f49034e = f;
                m72627d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f49032c) {
                this.f49032c = f;
                m72627d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f49035f) {
                this.f49035f = f;
                m72627d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f49036g) {
                this.f49036g = f;
                m72627d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f49037h) {
                this.f49037h = f;
                m72627d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f49038i) {
                this.f49038i = f;
                m72627d();
            }
        }

        public C10342d() {
            super();
            this.f49030a = new Matrix();
            this.f49031b = new ArrayList<>();
            this.f49032c = 0.0f;
            this.f49033d = 0.0f;
            this.f49034e = 0.0f;
            this.f49035f = 1.0f;
            this.f49036g = 1.0f;
            this.f49037h = 0.0f;
            this.f49038i = 0.0f;
            this.f49039j = new Matrix();
            this.f49042m = null;
        }
    }
}
