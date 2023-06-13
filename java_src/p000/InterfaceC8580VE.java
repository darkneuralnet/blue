package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBatch;
import co.bird.api.request.BatchAddBirdsRequestBody;
import co.bird.api.request.BatchCreateRequestBody;
import co.bird.api.request.BatchRemoveBirdRequestBody;
import co.bird.api.response.BatchBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u000bH'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¨\u0006\u0012"}, m28432d2 = {"LVE;", "", "Lco/bird/api/request/BatchCreateRequestBody;", "body", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireBatch;", "c", "Lco/bird/api/request/BatchAddBirdsRequestBody;", "", "Lco/bird/api/response/BatchBird;", "e", "", "warehouseId", DateTokenConverter.CONVERTER_KEY, "batchId", C17296a.f69688o, "Lco/bird/api/request/BatchRemoveBirdRequestBody;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VE */
/* loaded from: classes4.dex */
public interface InterfaceC8580VE {
    @NA1("batch/birds")
    /* renamed from: a */
    AbstractC23442F<List<BatchBird>> m80186a(@InterfaceC37017Xc4("batch_id") String str);

    @AD3("batch/remove-bird")
    /* renamed from: b */
    AbstractC23442F<BatchBird> m80185b(@InterfaceC6404PY BatchRemoveBirdRequestBody batchRemoveBirdRequestBody);

    @AD3("batch/create")
    /* renamed from: c */
    AbstractC23442F<WireBatch> m80184c(@InterfaceC6404PY BatchCreateRequestBody batchCreateRequestBody);

    @NA1("batch/by-warehouse-id")
    /* renamed from: d */
    AbstractC23442F<List<WireBatch>> m80183d(@InterfaceC52701zH1("Warehouse-Id") String str);

    @AD3("batch/add-birds")
    /* renamed from: e */
    AbstractC23442F<List<BatchBird>> m80182e(@InterfaceC6404PY BatchAddBirdsRequestBody batchAddBirdsRequestBody);
}
