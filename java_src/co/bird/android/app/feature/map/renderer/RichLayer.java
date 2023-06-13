package co.bird.android.app.feature.map.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import io.reactivex.AbstractC24507p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u0003342BE\b\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0016\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\tR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00065"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/RichLayer;", "", "", "prepareBitmap", "Landroid/graphics/Canvas;", "canvas", "LU74;", "projection", "", "LZO4;", "draw", "shapes", "Lcom/google/android/gms/maps/model/CameraPosition;", "cameraPosition", "Lio/reactivex/p;", "Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;", "refresh", "Landroid/graphics/Bitmap;", "bitmap", "addBitmapOverlay", "shape", "addShape", "removeShape", "Landroid/view/View;", "view", "Landroid/view/View;", "LcD1;", "map", "LcD1;", "", "paddingLeft", "I", "paddingTop", "paddingRight", "paddingBottom", "Landroid/graphics/Bitmap;", "", "zIndex", "F", "LfE1;", "overlay", "LfE1;", "Ljava/util/TreeMap;", "", "Ljava/util/TreeMap;", "Ljava/util/concurrent/locks/ReentrantLock;", "shapeLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "(Landroid/view/View;LcD1;FIIII)V", "Companion", "BitmapDrawData", "Builder", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRichLayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RichLayer.kt\nco/bird/android/app/feature/map/renderer/RichLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1#2:203\n766#3:204\n857#3,2:205\n*S KotlinDebug\n*F\n+ 1 RichLayer.kt\nco/bird/android/app/feature/map/renderer/RichLayer\n*L\n167#1:204\n167#1:205,2\n*E\n"})
/* loaded from: classes2.dex */
public final class RichLayer {
    public static final Companion Companion = new Companion(null);
    private static final float MINIMUM_ZOOM_LEVEL = 5.0f;
    private Bitmap bitmap;
    private final C39011cD1 map;
    private C40816fE1 overlay;
    private final int paddingBottom;
    private final int paddingLeft;
    private final int paddingRight;
    private final int paddingTop;
    private final ReentrantLock shapeLock;
    private final TreeMap<Integer, List<ZO4>> shapes;
    private final View view;
    private float zIndex;

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;", "", "LU74;", "component1", "Landroid/graphics/Bitmap;", "component2", "Lcom/google/android/gms/maps/model/CameraPosition;", "component3", "", "LZO4;", "component4", "projection", "bitmap", "cameraPosition", "drawnShapes", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LU74;", "getProjection", "()LU74;", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "Lcom/google/android/gms/maps/model/CameraPosition;", "getCameraPosition", "()Lcom/google/android/gms/maps/model/CameraPosition;", "Ljava/util/List;", "getDrawnShapes", "()Ljava/util/List;", "<init>", "(LU74;Landroid/graphics/Bitmap;Lcom/google/android/gms/maps/model/CameraPosition;Ljava/util/List;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class BitmapDrawData {
        private final Bitmap bitmap;
        private final CameraPosition cameraPosition;
        private final List<ZO4> drawnShapes;
        private final U74 projection;

        /* JADX WARN: Multi-variable type inference failed */
        public BitmapDrawData(U74 projection, Bitmap bitmap, CameraPosition cameraPosition, List<? extends ZO4> drawnShapes) {
            Intrinsics.checkNotNullParameter(projection, "projection");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
            Intrinsics.checkNotNullParameter(drawnShapes, "drawnShapes");
            this.projection = projection;
            this.bitmap = bitmap;
            this.cameraPosition = cameraPosition;
            this.drawnShapes = drawnShapes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BitmapDrawData copy$default(BitmapDrawData bitmapDrawData, U74 u74, Bitmap bitmap, CameraPosition cameraPosition, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                u74 = bitmapDrawData.projection;
            }
            if ((i & 2) != 0) {
                bitmap = bitmapDrawData.bitmap;
            }
            if ((i & 4) != 0) {
                cameraPosition = bitmapDrawData.cameraPosition;
            }
            if ((i & 8) != 0) {
                list = bitmapDrawData.drawnShapes;
            }
            return bitmapDrawData.copy(u74, bitmap, cameraPosition, list);
        }

        public final U74 component1() {
            return this.projection;
        }

        public final Bitmap component2() {
            return this.bitmap;
        }

        public final CameraPosition component3() {
            return this.cameraPosition;
        }

        public final List<ZO4> component4() {
            return this.drawnShapes;
        }

        public final BitmapDrawData copy(U74 projection, Bitmap bitmap, CameraPosition cameraPosition, List<? extends ZO4> drawnShapes) {
            Intrinsics.checkNotNullParameter(projection, "projection");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
            Intrinsics.checkNotNullParameter(drawnShapes, "drawnShapes");
            return new BitmapDrawData(projection, bitmap, cameraPosition, drawnShapes);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BitmapDrawData) {
                BitmapDrawData bitmapDrawData = (BitmapDrawData) obj;
                return Intrinsics.areEqual(this.projection, bitmapDrawData.projection) && Intrinsics.areEqual(this.bitmap, bitmapDrawData.bitmap) && Intrinsics.areEqual(this.cameraPosition, bitmapDrawData.cameraPosition) && Intrinsics.areEqual(this.drawnShapes, bitmapDrawData.drawnShapes);
            }
            return false;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final CameraPosition getCameraPosition() {
            return this.cameraPosition;
        }

        public final List<ZO4> getDrawnShapes() {
            return this.drawnShapes;
        }

        public final U74 getProjection() {
            return this.projection;
        }

        public int hashCode() {
            return (((((this.projection.hashCode() * 31) + this.bitmap.hashCode()) * 31) + this.cameraPosition.hashCode()) * 31) + this.drawnShapes.hashCode();
        }

        public String toString() {
            U74 u74 = this.projection;
            Bitmap bitmap = this.bitmap;
            CameraPosition cameraPosition = this.cameraPosition;
            List<ZO4> list = this.drawnShapes;
            return "BitmapDrawData(projection=" + u74 + ", bitmap=" + bitmap + ", cameraPosition=" + cameraPosition + ", drawnShapes=" + list + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;", "", "", "zIndex", "", "top", "bottom", "left", "right", "padding", "Lco/bird/android/app/feature/map/renderer/RichLayer;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroid/view/View;", "view", "Landroid/view/View;", "LcD1;", "map", "LcD1;", "F", "paddingLeft", "I", "paddingTop", "paddingRight", "paddingBottom", "<init>", "(Landroid/view/View;LcD1;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Builder {
        private final C39011cD1 map;
        private int paddingBottom;
        private int paddingLeft;
        private int paddingRight;
        private int paddingTop;
        private final View view;
        private float zIndex;

        public Builder(View view, C39011cD1 map) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(map, "map");
            this.view = view;
            this.map = map;
        }

        public final RichLayer build() {
            return new RichLayer(this.view, this.map, this.zIndex, this.paddingLeft, this.paddingTop, this.paddingRight, this.paddingBottom, null);
        }

        public final Builder padding(int i, int i2, int i3, int i4) {
            this.paddingTop = i;
            this.paddingBottom = i2;
            this.paddingLeft = i3;
            this.paddingRight = i4;
            return this;
        }

        public final Builder zIndex(float f) {
            this.zIndex = f;
            return this;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/RichLayer$Companion;", "", "()V", "MINIMUM_ZOOM_LEVEL", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ RichLayer(View view, C39011cD1 c39011cD1, float f, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, c39011cD1, f, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ZO4> draw(Canvas canvas, U74 u74) {
        List<ZO4> emptyList;
        try {
            Set<Integer> keySet = this.shapes.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "shapes.keys");
            ArrayList arrayList = new ArrayList();
            for (Integer num : keySet) {
                ReentrantLock reentrantLock = this.shapeLock;
                reentrantLock.lock();
                List<ZO4> list = this.shapes.get(num);
                Intrinsics.checkNotNull(list);
                List<ZO4> draw = draw(canvas, u74, list);
                reentrantLock.unlock();
                arrayList.addAll(draw);
            }
            return arrayList;
        } catch (Exception e) {
            C41318g46.m40158f(e, "There was an error drawing shapes", new Object[0]);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareBitmap() {
        boolean z;
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            View view = this.view;
            boolean z2 = true;
            if (view != null && bitmap.getWidth() == view.getWidth()) {
                z = true;
            } else {
                z = false;
            }
            if (!z || bitmap.getHeight() != this.view.getHeight()) {
                z2 = false;
            }
            if (!z2) {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap.eraseColor(0);
                this.bitmap = bitmap;
            }
        }
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        View view2 = this.view;
        Intrinsics.checkNotNull(view2);
        bitmap = Bitmap.createBitmap(view2.getWidth(), this.view.getHeight(), Bitmap.Config.ARGB_8888);
        this.bitmap = bitmap;
    }

    public final void addBitmapOverlay(U74 projection, Bitmap bitmap, CameraPosition cameraPosition) {
        Unit unit;
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        float m86795c = (float) RN5.m86795c(projection.m81934b().f71505b, projection.m81934b().f71506c);
        C40816fE1 c40816fE1 = this.overlay;
        C40816fE1 c40816fE12 = null;
        if (c40816fE1 != null) {
            c40816fE1.m41702g(cameraPosition.f71394b);
            c40816fE1.m41704e(m86795c);
            c40816fE1.m41705d(cameraPosition.f71397e);
            c40816fE1.m41703f(C6780QT.m88495a(bitmap));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            GroundOverlayOptions m50678j1 = new GroundOverlayOptions().m50690D0(C6780QT.m88495a(bitmap)).m50681W0(cameraPosition.f71394b, m86795c).m50673u(cameraPosition.f71397e).m50672v(false).m50678j1(this.zIndex);
            Intrinsics.checkNotNullExpressionValue(m50678j1, "GroundOverlayOptions()\n …)\n        .zIndex(zIndex)");
            C39011cD1 c39011cD1 = this.map;
            if (c39011cD1 != null) {
                c40816fE12 = c39011cD1.m61686b(m50678j1);
            }
            this.overlay = c40816fE12;
        }
    }

    public final void addShape(ZO4 zo4) {
        if (zo4 != null) {
            if (!this.shapes.containsKey(Integer.valueOf(zo4.m73211g()))) {
                this.shapes.put(Integer.valueOf(zo4.m73211g()), new ArrayList());
            }
            List<ZO4> list = this.shapes.get(Integer.valueOf(zo4.m73211g()));
            Intrinsics.checkNotNull(list);
            List<ZO4> list2 = list;
            ReentrantLock reentrantLock = this.shapeLock;
            reentrantLock.lock();
            try {
                list2.add(zo4);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final AbstractC24507p<BitmapDrawData> refresh(CameraPosition cameraPosition, U74 projection) {
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        Intrinsics.checkNotNullParameter(projection, "projection");
        return C45832nh5.m23309g(new RichLayer$refresh$1(this, projection, cameraPosition));
    }

    public final void removeShape(ZO4 zo4) {
        if (zo4 != null) {
            Set<Integer> keySet = this.shapes.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "shapes.keys");
            for (Integer num : keySet) {
                List<ZO4> list = this.shapes.get(num);
                Intrinsics.checkNotNull(list);
                List<ZO4> list2 = list;
                ReentrantLock reentrantLock = this.shapeLock;
                reentrantLock.lock();
                try {
                    list2.remove(zo4);
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    private RichLayer(View view, C39011cD1 c39011cD1, float f, int i, int i2, int i3, int i4) {
        this.view = view;
        this.map = c39011cD1;
        this.paddingLeft = i;
        this.paddingTop = i2;
        this.paddingRight = i3;
        this.paddingBottom = i4;
        this.shapes = new TreeMap<>();
        this.shapeLock = new ReentrantLock();
        if (view != null && c39011cD1 != null) {
            this.zIndex = f;
            c39011cD1.m61676l().m4913e(false);
            return;
        }
        throw new IllegalArgumentException("View and GoogleMap cannot be null");
    }

    private final List<ZO4> draw(Canvas canvas, U74 u74, List<? extends ZO4> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ZO4) obj).m73214d(canvas, u74, this.paddingLeft, this.paddingTop, this.paddingRight, this.paddingBottom)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
