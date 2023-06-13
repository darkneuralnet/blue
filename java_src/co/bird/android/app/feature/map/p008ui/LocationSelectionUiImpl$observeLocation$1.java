package co.bird.android.app.feature.map.p008ui;

import co.bird.android.app.feature.map.p008ui.LocationSelectionUiImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;", "invoke", "(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$observeLocation$1 */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl$observeLocation$1 extends Lambda implements Function1<LocationSelectionUiImpl.LocationUpdate, Boolean> {
    final /* synthetic */ boolean $includeIndirectUpdates;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionUiImpl$observeLocation$1(boolean z) {
        super(1);
        this.$includeIndirectUpdates = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LocationSelectionUiImpl.LocationUpdate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(this.$includeIndirectUpdates || !it.getIndirect());
    }
}
