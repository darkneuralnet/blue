package co.bird.android.app.feature.map.presenter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl$onResume$13 extends Lambda implements Function1<String, Boolean> {
    public static final LocationSelectionPresenterImpl$onResume$13 INSTANCE = new LocationSelectionPresenterImpl$onResume$13();

    public LocationSelectionPresenterImpl$onResume$13() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String it) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(it, "it");
        isBlank = StringsKt__StringsJVMKt.isBlank(it);
        return Boolean.valueOf(!isBlank);
    }
}
