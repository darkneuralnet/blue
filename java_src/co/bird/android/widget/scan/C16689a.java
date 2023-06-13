package co.bird.android.widget.scan;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.scan.GraphicOverlay;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0005B+\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/widget/scan/a;", "Lco/bird/android/widget/scan/GraphicOverlay$a;", "Landroid/graphics/Canvas;", "canvas", "", C17296a.f69688o, "Landroid/graphics/Rect;", "b", "Landroid/graphics/Rect;", "rect", "", "c", "I", "strokeColor", "", DateTokenConverter.CONVERTER_KEY, "F", "getWidth", "()F", "width", "Landroid/graphics/Paint;", "e", "Landroid/graphics/Paint;", "rectPaint", "Lco/bird/android/widget/scan/GraphicOverlay;", "overlay", "strokeWidth", "<init>", "(Lco/bird/android/widget/scan/GraphicOverlay;Landroid/graphics/Rect;IF)V", "f", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBoundingBoxGraphic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoundingBoxGraphic.kt\nco/bird/android/widget/scan/BoundingBoxGraphic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* renamed from: co.bird.android.widget.scan.a */
/* loaded from: classes4.dex */
public final class C16689a extends GraphicOverlay.AbstractC16670a {

    /* renamed from: f */
    public static final C16690a f68096f = new C16690a(null);

    /* renamed from: b */
    public final Rect f68097b;

    /* renamed from: c */
    public final int f68098c;

    /* renamed from: d */
    public final float f68099d;

    /* renamed from: e */
    public final Paint f68100e;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lco/bird/android/widget/scan/a$a;", "", "", "STROKE_WIDTH", "F", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.a$a */
    /* loaded from: classes4.dex */
    public static final class C16690a {
        public /* synthetic */ C16690a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16690a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16689a(GraphicOverlay overlay, Rect rect, int i, float f) {
        super(overlay);
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        this.f68097b = rect;
        this.f68098c = i;
        this.f68099d = f;
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setAlpha(140);
        m54028b();
        this.f68100e = paint;
    }

    @Override // co.bird.android.widget.scan.GraphicOverlay.AbstractC16670a
    /* renamed from: a */
    public void mo53984a(Canvas canvas) {
        Log.d("BoundingBoxGraphic", "on draw bounding box graphic");
        Rect rect = this.f68097b;
        if (rect != null) {
            if (canvas != null) {
                canvas.drawRect(rect, this.f68100e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Attempting to draw a null box.".toString());
    }

    public /* synthetic */ C16689a(GraphicOverlay graphicOverlay, Rect rect, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(graphicOverlay, rect, i, (i2 & 8) != 0 ? 2.0f : f);
    }
}
