package p000;

import co.bird.android.model.BatchBirdFraudReport;
import co.bird.android.model.BirdFraudReport;
import co.bird.api.request.ContractorReportFraudBatchBody;
import co.bird.api.request.ContractorReportFraudBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¨\u0006\f"}, m28432d2 = {"LiB0;", "", "Lco/bird/api/request/ContractorReportFraudBody;", "body", "Lio/reactivex/Observable;", "Lco/bird/android/model/BirdFraudReport;", "b", "Lco/bird/api/request/ContractorReportFraudBatchBody;", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/BatchBirdFraudReport;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iB0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC42567iB0 {
    @AD3("contractor/report-fraud-batch")
    /* renamed from: a */
    AbstractC23442F<HM4<BatchBirdFraudReport>> m34378a(@InterfaceC6404PY ContractorReportFraudBatchBody contractorReportFraudBatchBody);

    @AD3("contractor/report-fraud")
    /* renamed from: b */
    Observable<BirdFraudReport> m34377b(@InterfaceC6404PY ContractorReportFraudBody contractorReportFraudBody);
}
