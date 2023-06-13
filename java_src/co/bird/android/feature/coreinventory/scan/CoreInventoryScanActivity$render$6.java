package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.DialogResponse;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CoreInventoryScanActivity$render$6 extends Lambda implements Function1<DialogResponse, Unit> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanActivity f63827g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanActivity$render$6(CoreInventoryScanActivity coreInventoryScanActivity) {
        super(1);
        this.f63827g = coreInventoryScanActivity;
    }

    /* renamed from: a */
    public final void m58350a(DialogResponse dialogResponse) {
        C45168ma4 c45168ma4;
        c45168ma4 = this.f63827g.f63816t;
        c45168ma4.accept(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
        m58350a(dialogResponse);
        return Unit.INSTANCE;
    }
}
