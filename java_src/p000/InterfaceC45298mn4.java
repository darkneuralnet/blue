package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.request.ProgrammaticIssueBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010%\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00052\b\b\u0001\u0010\t\u001a\u00020\bH'J:\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'J>\u0010\u0012\u001a,\u0012(\u0012&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00110\u00100\u00060\n0\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¨\u0006\u0013"}, m28432d2 = {"Lmn4;", "", "", "birdId", "role", "Lio/reactivex/F;", "", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/ProgrammaticIssueBody;", "body", "LHM4;", "", C17296a.f69688o, "", "locking", "b", "", "", "c", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mn4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC45298mn4 {
    @AD3("rating/reliability-issue")
    /* renamed from: a */
    AbstractC23442F<HM4<Unit>> m24995a(@InterfaceC6404PY ProgrammaticIssueBody programmaticIssueBody);

    @NA1("rating/physical-lock-issues")
    /* renamed from: b */
    AbstractC23442F<Map<String, String>> m24994b(@InterfaceC37017Xc4("bird_id") String str, @InterfaceC37017Xc4("locking") boolean z, @InterfaceC37017Xc4("request_role") String str2);

    @NA1("rating/vehicle-and-app-issues")
    /* renamed from: c */
    AbstractC23442F<HM4<Map<String, List<Map<String, String>>>>> m24993c(@InterfaceC37017Xc4("bird_id") String str);

    @NA1("rating/v2/issues")
    /* renamed from: d */
    AbstractC23442F<Map<String, String>> m24992d(@InterfaceC37017Xc4("bird_id") String str, @InterfaceC37017Xc4("request_role") String str2);
}
