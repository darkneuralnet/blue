package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.WorkOrder;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, m28432d2 = {"LPC;", "LxE;", "LOC;", "Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/F;", "", "Lco/bird/android/model/QCAutoCheck;", "Ug", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PC */
/* loaded from: classes4.dex */
public abstract class AbstractC6295PC extends AbstractC30071xE implements InterfaceC5925OC {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6295PC(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // p000.InterfaceC5925OC
    /* renamed from: Ug */
    public AbstractC23442F<List<QCAutoCheck>> mo90598Ug(WorkOrder workOrder) {
        Intrinsics.checkNotNullParameter(workOrder, "workOrder");
        C35595Ra4 m86607a = C35595Ra4.f32243d.m86607a(workOrder);
        m86607a.show(getActivity().getSupportFragmentManager(), "QCAutoChecksBottomSheetDialog");
        return m86607a.m86609N6();
    }
}
