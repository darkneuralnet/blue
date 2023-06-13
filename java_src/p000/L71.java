package p000;

import com.facebook.share.internal.C17296a;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDateTime;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0000¨\u0006\u0005"}, m28432d2 = {"", "Ljava/util/Calendar;", "b", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: L71 */
/* loaded from: classes2.dex */
public final class L71 {
    /* renamed from: a */
    public static final boolean m97756a(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        if (calendar.getTime().compareTo(Calendar.getInstance().getTime()) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final Calendar m97755b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            LocalDateTime m25570a = C45101mT0.f98056a.m25570a(str);
            Intrinsics.checkNotNull(m25570a);
            return C50838w80.m7366b(m25570a);
        } catch (Exception e) {
            e.printStackTrace();
            C41318g46.m40159e(e);
            return null;
        }
    }
}
