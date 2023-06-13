package co.bird.android.app.feature.map.presenter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "degree", "", "invoke", "(Ljava/lang/Float;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$onResume$22 extends Lambda implements Function1<Float, Boolean> {
    public static final MapPresenterImpl$onResume$22 INSTANCE = new MapPresenterImpl$onResume$22();

    public MapPresenterImpl$onResume$22() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Float degree) {
        Intrinsics.checkNotNullParameter(degree, "degree");
        return Boolean.valueOf(!Float.isNaN(degree.floatValue()));
    }
}
