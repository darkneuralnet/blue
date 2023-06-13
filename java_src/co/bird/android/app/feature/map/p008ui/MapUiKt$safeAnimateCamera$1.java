package co.bird.android.app.feature.map.p008ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapUiKt$safeAnimateCamera$1 */
/* loaded from: classes2.dex */
public final class MapUiKt$safeAnimateCamera$1 extends Lambda implements Function1<Exception, String> {
    public static final MapUiKt$safeAnimateCamera$1 INSTANCE = new MapUiKt$safeAnimateCamera$1();

    public MapUiKt$safeAnimateCamera$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return e.getMessage();
    }
}
