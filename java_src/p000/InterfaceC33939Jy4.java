package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdProblem;
import co.bird.android.model.BirdRepair;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePhysicalLockReplacementType;
import co.bird.api.request.CloseRepairBody;
import co.bird.api.request.RepairBody;
import co.bird.api.request.ReplacePhysicalLockBody;
import co.bird.api.request.SubmitRepairJobsBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'J$\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'J$\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\u000e0\u00122\b\b\u0001\u0010\n\u001a\u00020\tH'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000e0\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'¨\u0006\u0018"}, m28432d2 = {"LJy4;", "", "Lco/bird/api/request/RepairBody;", "body", "Lio/reactivex/Observable;", "Lco/bird/android/model/BirdRepair;", "g", "Lco/bird/api/request/SubmitRepairJobsBody;", "e", "", "birdId", C17296a.f69688o, "Lco/bird/api/request/CloseRepairBody;", DateTokenConverter.CONVERTER_KEY, "LHM4;", "", "Lco/bird/android/model/BirdProblem;", "c", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;", "b", "Lco/bird/api/request/ReplacePhysicalLockBody;", "Lco/bird/android/model/wire/WirePhysicalLock;", "f", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jy4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC33939Jy4 {
    @NA1("repair/last")
    /* renamed from: a */
    Observable<BirdRepair> m99487a(@InterfaceC37017Xc4("bird_id") String str);

    @NA1("repair/all-physical-lock-replacement-types")
    /* renamed from: b */
    AbstractC23442F<HM4<List<WirePhysicalLockReplacementType>>> m99486b(@InterfaceC37017Xc4("bird_id") String str);

    @NA1("repair/problems")
    /* renamed from: c */
    Observable<HM4<List<BirdProblem>>> m99485c(@InterfaceC37017Xc4("bird_id") String str);

    @CD3("repair/close")
    /* renamed from: d */
    Observable<BirdRepair> m99484d(@InterfaceC6404PY CloseRepairBody closeRepairBody);

    @AD3("repair/job")
    /* renamed from: e */
    Observable<BirdRepair> m99483e(@InterfaceC6404PY SubmitRepairJobsBody submitRepairJobsBody);

    @AD3("repair/replace-physical-lock")
    /* renamed from: f */
    AbstractC23442F<HM4<WirePhysicalLock>> m99482f(@InterfaceC6404PY ReplacePhysicalLockBody replacePhysicalLockBody);

    @AD3("repair")
    /* renamed from: g */
    Observable<BirdRepair> m99481g(@InterfaceC6404PY RepairBody repairBody);
}
