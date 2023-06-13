package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0004H&¨\u0006\u0010"}, m28432d2 = {"LXB4;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "", C17296a.f69688o, "", "Lco/bird/android/model/LegacyRepair;", "repairs", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/RepairTypeLock;", "c", "Lco/bird/android/model/Issue;", "issue", "b", "onBackPressed", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XB4 */
/* loaded from: classes3.dex */
public interface XB4 {
    /* renamed from: a */
    void mo24198a(WireBird wireBird);

    /* renamed from: b */
    void mo77224b(Issue issue);

    /* renamed from: c */
    void mo77223c(List<RepairTypeLock> list);

    /* renamed from: d */
    void mo77222d(List<LegacyRepair> list);

    void onBackPressed();
}
