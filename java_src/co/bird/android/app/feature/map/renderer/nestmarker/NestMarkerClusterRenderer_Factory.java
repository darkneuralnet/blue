package co.bird.android.app.feature.map.renderer.nestmarker;

import android.content.Context;
import co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterItem;
/* loaded from: classes2.dex */
public final class NestMarkerClusterRenderer_Factory {
    private final Y94<Context> contextProvider;
    private final Y94<C36207Tq4> reactiveConfigProvider;

    public NestMarkerClusterRenderer_Factory(Y94<Context> y94, Y94<C36207Tq4> y942) {
        this.contextProvider = y94;
        this.reactiveConfigProvider = y942;
    }

    public static NestMarkerClusterRenderer_Factory create(Y94<Context> y94, Y94<C36207Tq4> y942) {
        return new NestMarkerClusterRenderer_Factory(y94, y942);
    }

    public static NestMarkerClusterRenderer newInstance(C33116Gl0<NestMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1, Context context, C36207Tq4 c36207Tq4) {
        return new NestMarkerClusterRenderer(c33116Gl0, c39011cD1, context, c36207Tq4);
    }

    public NestMarkerClusterRenderer get(C33116Gl0<NestMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1) {
        return newInstance(c33116Gl0, c39011cD1, this.contextProvider.get(), this.reactiveConfigProvider.get());
    }
}
