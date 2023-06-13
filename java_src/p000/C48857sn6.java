package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.InspectionFlow;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import co.bird.android.model.RepairFlow;
import co.bird.android.model.RepairFlowStatus;
import co.bird.api.request.InspectionUpdateRequestBody;
import co.bird.api.request.RepairUpdateNonRepairRequestBody;
import co.bird.api.request.RepairUpdateRequestBody;
import co.bird.api.request.VehicleIdRequestBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016JJ\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lsn6;", "Lrn6;", "", "vehicleId", "Lio/reactivex/F;", "Lco/bird/android/model/RepairFlowStatus;", C17296a.f69688o, "Lco/bird/android/model/InspectionFlow;", "c", "", "selectedCategories", "selectedIssues", "f", "Lco/bird/android/model/RepairFlow;", "b", "issueId", "selectedRepairs", "Lco/bird/android/model/NonRepair;", "selectedNonRepair", "Lco/bird/android/model/NonRepairReason;", "selectedNonRepairReason", "notes", "e", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "Lqn6;", "Lqn6;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "<init>", "(Lqn6;)V", "inspection_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sn6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48857sn6 implements InterfaceC48265rn6 {

    /* renamed from: a */
    public final InterfaceC47672qn6 f109250a;

    public C48857sn6(InterfaceC47672qn6 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f109250a = client;
    }

    @Override // p000.InterfaceC48265rn6
    /* renamed from: a */
    public AbstractC23442F<RepairFlowStatus> mo13671a(String vehicleId) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        AbstractC23442F<RepairFlowStatus> m33142Y = this.f109250a.m17051a(vehicleId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.getVehicleFlowSta…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48265rn6
    /* renamed from: b */
    public AbstractC23442F<RepairFlow> mo13670b(String vehicleId) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        AbstractC23442F<RepairFlow> m33142Y = this.f109250a.m17050b(vehicleId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.getRepairFlow(veh…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48265rn6
    /* renamed from: c */
    public AbstractC23442F<InspectionFlow> mo13669c(String vehicleId) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        AbstractC23442F<InspectionFlow> m33142Y = this.f109250a.m17049c(vehicleId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.getInspectionFlow…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48265rn6
    /* renamed from: d */
    public AbstractC23461c mo13668d(String vehicleId) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        AbstractC23461c m33063X = this.f109250a.m17048d(new VehicleIdRequestBody(vehicleId)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "client.finishRepairFlow(…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC48265rn6
    /* renamed from: e */
    public AbstractC23442F<RepairFlow> mo13667e(String vehicleId, String issueId, List<String> selectedRepairs, NonRepair nonRepair, NonRepairReason nonRepairReason, String str) {
        RepairUpdateNonRepairRequestBody repairUpdateNonRepairRequestBody;
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        InterfaceC47672qn6 interfaceC47672qn6 = this.f109250a;
        String str2 = null;
        if (nonRepair != null) {
            String status = nonRepair.getStatus();
            if (nonRepairReason != null) {
                str2 = nonRepairReason.getReason();
            }
            repairUpdateNonRepairRequestBody = new RepairUpdateNonRepairRequestBody(status, str2, str);
        } else {
            repairUpdateNonRepairRequestBody = null;
        }
        AbstractC23442F<RepairFlow> m33142Y = interfaceC47672qn6.m17047e(new RepairUpdateRequestBody(vehicleId, issueId, selectedRepairs, repairUpdateNonRepairRequestBody, false)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.updateRepairFlow(…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48265rn6
    /* renamed from: f */
    public AbstractC23442F<InspectionFlow> mo13666f(String vehicleId, List<String> selectedCategories, List<String> selectedIssues) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(selectedIssues, "selectedIssues");
        AbstractC23442F<InspectionFlow> m33142Y = this.f109250a.m17046f(new InspectionUpdateRequestBody(vehicleId, selectedCategories, selectedIssues)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.updateInspections…scribeOn(Schedulers.io())");
        return m33142Y;
    }
}
