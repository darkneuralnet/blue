package co.bird.android.widget.scan;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006&"}, m28432d2 = {"Lco/bird/android/widget/scan/GraphicOverlay;", "Landroid/view/View;", "", "b", "Lco/bird/android/widget/scan/GraphicOverlay$a;", "graphic", C17296a.f69688o, "", "previewWidth", "previewHeight", "facing", "setCameraInfo", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "Ljava/lang/Object;", "lock", "c", "I", "", DateTokenConverter.CONVERTER_KEY, "F", "widthScaleFactor", "e", "f", "heightScaleFactor", "g", "", "h", "Ljava/util/Set;", "graphics", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGraphicOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicOverlay.kt\nco/bird/android/widget/scan/GraphicOverlay\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* loaded from: classes4.dex */
public final class GraphicOverlay extends View {

    /* renamed from: b */
    public final Object f68046b;

    /* renamed from: c */
    public int f68047c;

    /* renamed from: d */
    public float f68048d;

    /* renamed from: e */
    public int f68049e;

    /* renamed from: f */
    public float f68050f;

    /* renamed from: g */
    public int f68051g;

    /* renamed from: h */
    public final Set<AbstractC16670a> f68052h;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/widget/scan/GraphicOverlay$a;", "", "Landroid/graphics/Canvas;", "canvas", "", C17296a.f69688o, "b", "Lco/bird/android/widget/scan/GraphicOverlay;", "Lco/bird/android/widget/scan/GraphicOverlay;", "overlay", "<init>", "(Lco/bird/android/widget/scan/GraphicOverlay;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.GraphicOverlay$a */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC16670a {

        /* renamed from: a */
        public final GraphicOverlay f68053a;

        public AbstractC16670a(GraphicOverlay overlay) {
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            this.f68053a = overlay;
        }

        /* renamed from: a */
        public abstract void mo53984a(Canvas canvas);

        /* renamed from: b */
        public final void m54028b() {
            this.f68053a.postInvalidate();
        }
    }

    public GraphicOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68046b = new Object();
        this.f68048d = 1.0f;
        this.f68050f = 1.0f;
        this.f68051g = 1;
        this.f68052h = new HashSet();
    }

    /* renamed from: a */
    public final void m54030a(AbstractC16670a graphic) {
        Intrinsics.checkNotNullParameter(graphic, "graphic");
        synchronized (this.f68046b) {
            this.f68052h.add(graphic);
        }
        postInvalidate();
    }

    /* renamed from: b */
    public final void m54029b() {
        synchronized (this.f68046b) {
            this.f68052h.clear();
            Unit unit = Unit.INSTANCE;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        synchronized (this.f68046b) {
            if (this.f68047c != 0 && this.f68049e != 0) {
                this.f68048d = canvas.getWidth() / this.f68047c;
                this.f68050f = canvas.getHeight() / this.f68049e;
            }
            for (AbstractC16670a abstractC16670a : this.f68052h) {
                abstractC16670a.mo53984a(canvas);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setCameraInfo(int i, int i2, int i3) {
        synchronized (this.f68046b) {
            this.f68047c = i;
            this.f68049e = i2;
            this.f68051g = i3;
            Unit unit = Unit.INSTANCE;
        }
        postInvalidate();
    }
}
