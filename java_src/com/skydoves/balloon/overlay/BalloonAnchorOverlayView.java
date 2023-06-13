package com.skydoves.balloon.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010E\u001a\u00020D\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\b\b\u0002\u0010H\u001a\u00020\b¢\u0006\u0004\bI\u0010JJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J0\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002R/\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R;\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00192\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010$\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b8G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010'\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b8G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0014\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R+\u0010-\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020(8G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0014\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R/\u00103\u001a\u0004\u0018\u00010.2\b\u0010\u0012\u001a\u0004\u0018\u00010.8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00108\u001a\u0002042\u0006\u0010\u0012\u001a\u0002048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0014\u001a\u0004\b\u001f\u00105\"\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010=R\u0014\u0010@\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006K"}, m28432d2 = {"Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "dispatchDraw", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "j", "view", C17296a.f69688o, "i", "<set-?>", "b", "LSs6;", "()Landroid/view/View;", "setAnchorView", "(Landroid/view/View;)V", "anchorView", "", "c", "()Ljava/util/List;", "setAnchorViewList", "(Ljava/util/List;)V", "anchorViewList", DateTokenConverter.CONVERTER_KEY, "e", "()I", "setOverlayColor", "(I)V", "overlayColor", "g", "setOverlayPaddingColor", "overlayPaddingColor", "", "f", "()F", "setOverlayPadding", "(F)V", "overlayPadding", "Landroid/graphics/Point;", "h", "()Landroid/graphics/Point;", "setOverlayPosition", "(Landroid/graphics/Point;)V", "overlayPosition", "Lhx;", "()Lhx;", "setBalloonOverlayShape", "(Lhx;)V", "balloonOverlayShape", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "k", "paddingColorPaint", "l", "Z", "invalidated", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attr", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class BalloonAnchorOverlayView extends View {

    /* renamed from: m */
    public static final /* synthetic */ KProperty<Object>[] f75231m = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "anchorView", "getAnchorView()Landroid/view/View;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "anchorViewList", "getAnchorViewList()Ljava/util/List;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "overlayColor", "getOverlayColor()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "overlayPaddingColor", "getOverlayPaddingColor()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "overlayPadding", "getOverlayPadding()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "overlayPosition", "getOverlayPosition()Landroid/graphics/Point;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", 0))};

    /* renamed from: b */
    public final C35993Ss6 f75232b;

    /* renamed from: c */
    public final C35993Ss6 f75233c;

    /* renamed from: d */
    public final C35993Ss6 f75234d;

    /* renamed from: e */
    public final C35993Ss6 f75235e;

    /* renamed from: f */
    public final C35993Ss6 f75236f;

    /* renamed from: g */
    public final C35993Ss6 f75237g;

    /* renamed from: h */
    public final C35993Ss6 f75238h;

    /* renamed from: i */
    public Bitmap f75239i;

    /* renamed from: j */
    public final Paint f75240j;

    /* renamed from: k */
    public final Paint f75241k;

    /* renamed from: l */
    public boolean f75242l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BalloonAnchorOverlayView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final void m45564a(View view, Canvas canvas) {
        RectF rectF;
        if (view != null) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            Point m45557h = m45557h();
            if (m45557h != null) {
                rectF = new RectF(m45557h.x - m45559f(), (m45557h.y - m45559f()) + m45556i(), m45557h.x + view.getWidth() + m45559f(), m45557h.y + view.getHeight() + m45559f() + m45556i());
            } else {
                rectF = new RectF(rect.left - m45559f(), rect.top - m45559f(), rect.right + m45559f(), rect.bottom + m45559f());
            }
            float m45559f = m45559f() / 2;
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(m45559f, m45559f);
            AbstractC22854hx m45561d = m45561d();
            if (!(m45561d instanceof C19916dx)) {
                if (m45561d instanceof C20664fx) {
                    canvas.drawRect(rectF, this.f75240j);
                    canvas.drawRect(rectF2, this.f75241k);
                } else if (m45561d instanceof C20149ex) {
                    canvas.drawOval(rectF, this.f75240j);
                    canvas.drawOval(rectF2, this.f75241k);
                } else if (m45561d instanceof C19645cx) {
                    C19645cx c19645cx = (C19645cx) m45561d;
                    Float m44804a = c19645cx.m44804a();
                    if (m44804a != null) {
                        float floatValue = m44804a.floatValue();
                        canvas.drawCircle(rectF.centerX(), rectF.centerY(), floatValue, this.f75240j);
                        canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), floatValue - m45559f, this.f75241k);
                    }
                    Integer m44803b = c19645cx.m44803b();
                    if (m44803b != null) {
                        m44803b.intValue();
                        float centerX = rectF.centerX();
                        float centerY = rectF.centerY();
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        canvas.drawCircle(centerX, centerY, Intrinsics.checkNotNullParameter(context, "<this>"), this.f75240j);
                        float centerX2 = rectF2.centerX();
                        float centerY2 = rectF2.centerY();
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        canvas.drawCircle(centerX2, centerY2, Intrinsics.checkNotNullParameter(context2, "<this>") - m45559f, this.f75241k);
                    }
                } else if (m45561d instanceof C22517gx) {
                    C22517gx c22517gx = (C22517gx) m45561d;
                    Pair<Float, Float> m37301a = c22517gx.m37301a();
                    if (m37301a != null) {
                        canvas.drawRoundRect(rectF, m37301a.getFirst().floatValue(), m37301a.getSecond().floatValue(), this.f75240j);
                        canvas.drawRoundRect(rectF2, m37301a.getFirst().floatValue() - m45559f, m37301a.getSecond().floatValue() - m45559f, this.f75241k);
                    }
                    Pair<Integer, Integer> m37300b = c22517gx.m37300b();
                    if (m37300b != null) {
                        Context context3 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        m37300b.getFirst().intValue();
                        float checkNotNullParameter = Intrinsics.checkNotNullParameter(context3, "<this>");
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                        m37300b.getSecond().intValue();
                        canvas.drawRoundRect(rectF, checkNotNullParameter, Intrinsics.checkNotNullParameter(context4, "<this>"), this.f75240j);
                        Context context5 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                        m37300b.getFirst().intValue();
                        Context context6 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context6, "context");
                        m37300b.getSecond().intValue();
                        canvas.drawRoundRect(rectF2, Intrinsics.checkNotNullParameter(context5, "<this>") - m45559f, Intrinsics.checkNotNullParameter(context6, "<this>") - m45559f, this.f75241k);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    /* renamed from: b */
    public final View m45563b() {
        return (View) this.f75232b.getValue(this, f75231m[0]);
    }

    /* renamed from: c */
    public final List<View> m45562c() {
        return (List) this.f75233c.getValue(this, f75231m[1]);
    }

    /* renamed from: d */
    public final AbstractC22854hx m45561d() {
        return (AbstractC22854hx) this.f75238h.getValue(this, f75231m[6]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r1 != false) goto L22;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f75242l && (bitmap = this.f75239i) != null) {
            boolean z = false;
            if (bitmap != null && bitmap.isRecycled()) {
                z = true;
            }
        }
        m45555j();
        Bitmap bitmap2 = this.f75239i;
        if (bitmap2 != null && !bitmap2.isRecycled() && canvas != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    /* renamed from: e */
    public final int m45560e() {
        return ((Number) this.f75234d.getValue(this, f75231m[2])).intValue();
    }

    /* renamed from: f */
    public final float m45559f() {
        return ((Number) this.f75236f.getValue(this, f75231m[4])).floatValue();
    }

    /* renamed from: g */
    public final int m45558g() {
        return ((Number) this.f75235e.getValue(this, f75231m[3])).intValue();
    }

    /* renamed from: h */
    public final Point m45557h() {
        return (Point) this.f75237g.getValue(this, f75231m[5]);
    }

    /* renamed from: i */
    public final int m45556i() {
        Rect rect = new Rect();
        Context context = getContext();
        if (context instanceof Activity) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.top;
        }
        return 0;
    }

    /* renamed from: j */
    public final void m45555j() {
        boolean z;
        boolean z2;
        if (getWidth() != 0 && getHeight() != 0) {
            View m45563b = m45563b();
            boolean z3 = true;
            if (m45563b != null && m45563b.getWidth() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                View m45563b2 = m45563b();
                if (m45563b2 != null && m45563b2.getHeight() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    Bitmap bitmap = this.f75239i;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    this.f75239i = createBitmap;
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = this.f75240j;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                    paint.setColor(m45560e());
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f75240j);
                    Paint paint2 = this.f75240j;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    paint2.setColor(0);
                    Paint paint3 = this.f75241k;
                    paint3.setColor(m45558g());
                    paint3.setStyle(Paint.Style.STROKE);
                    paint3.setStrokeWidth(m45559f());
                    List<View> m45562c = m45562c();
                    if (m45562c != null && !m45562c.isEmpty()) {
                        z3 = false;
                    }
                    if (z3) {
                        m45564a(m45563b(), canvas);
                    } else {
                        List<View> m45562c2 = m45562c();
                        if (m45562c2 != null) {
                            for (View view : m45562c2) {
                                m45564a(view, canvas);
                            }
                        }
                    }
                    this.f75242l = false;
                }
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f75242l = true;
    }

    public final void setAnchorView(View view) {
        this.f75232b.setValue(this, f75231m[0], view);
    }

    public final void setAnchorViewList(List<? extends View> list) {
        this.f75233c.setValue(this, f75231m[1], list);
    }

    public final void setBalloonOverlayShape(AbstractC22854hx abstractC22854hx) {
        Intrinsics.checkNotNullParameter(abstractC22854hx, "<set-?>");
        this.f75238h.setValue(this, f75231m[6], abstractC22854hx);
    }

    public final void setOverlayColor(int i) {
        this.f75234d.setValue(this, f75231m[2], Integer.valueOf(i));
    }

    public final void setOverlayPadding(float f) {
        this.f75236f.setValue(this, f75231m[4], Float.valueOf(f));
    }

    public final void setOverlayPaddingColor(int i) {
        this.f75235e.setValue(this, f75231m[3], Integer.valueOf(i));
    }

    public final void setOverlayPosition(Point point) {
        this.f75237g.setValue(this, f75231m[5], point);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f75232b = Intrinsics.checkNotNullParameter(this, "<this>");
        this.f75233c = Intrinsics.checkNotNullParameter(this, "<this>");
        this.f75234d = Intrinsics.checkNotNullParameter(this, "<this>");
        this.f75235e = Intrinsics.checkNotNullParameter(this, "<this>");
        Float.valueOf(0.0f);
        this.f75236f = Intrinsics.checkNotNullParameter(this, "<this>");
        this.f75237g = Intrinsics.checkNotNullParameter(this, "<this>");
        C20149ex c20149ex = C20149ex.f79167a;
        this.f75238h = Intrinsics.checkNotNullParameter(this, "<this>");
        Paint paint = new Paint(1);
        this.f75240j = paint;
        Paint paint2 = new Paint(1);
        this.f75241k = paint2;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
    }
}
