package co.bird.android.app.feature.map.renderer;

import android.graphics.PointF;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;", "T", "", "marker", "Landroid/graphics/PointF;", "anchorPoint", "(Ljava/lang/Object;)Landroid/graphics/PointF;", "", "withIcon", "LPT;", "bitmapDescriptor", "(Ljava/lang/Object;Z)LPT;", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface MarkerOptionProvider<T> {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ C6378PT bitmapDescriptor$default(MarkerOptionProvider markerOptionProvider, Object obj, boolean z, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return markerOptionProvider.bitmapDescriptor(obj, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bitmapDescriptor");
        }
    }

    PointF anchorPoint(T t);

    C6378PT bitmapDescriptor(T t, boolean z);
}
