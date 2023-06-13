package co.bird.android.feature.coreinventory.scan;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LRk5;", "b", "()LRk5;"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CoreInventoryScanActivity$rendererDelegate$2 extends Lambda implements Function0<C35686Rk5> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanActivity f63828g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanActivity$rendererDelegate$2(CoreInventoryScanActivity coreInventoryScanActivity) {
        super(0);
        this.f63828g = coreInventoryScanActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b */
    public final C35686Rk5 invoke() {
        C40679f00 c40679f00;
        CoreInventoryScanActivity coreInventoryScanActivity = this.f63828g;
        c40679f00 = coreInventoryScanActivity.f63811o;
        if (c40679f00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c40679f00 = null;
        }
        return new C35686Rk5(coreInventoryScanActivity, c40679f00, null);
    }
}
