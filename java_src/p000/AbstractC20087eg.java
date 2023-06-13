package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.constant.AnnouncementDisplayType;
import co.bird.android.model.persistence.Announcement;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\t\u001a\u00020\bH'J#\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H'J\b\u0010\u0013\u001a\u00020\rH'¨\u0006\u0016"}, m28432d2 = {"Leg;", "", "Lco/bird/android/model/constant/AnnouncementContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/Announcement;", C17296a.f69688o, "Lco/bird/android/model/constant/AnnouncementDisplayType;", "displayType", "b", "", "announcement", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "([Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/c;", "", "retainedAnnouncementIds", "e", "c", "<init>", "()V", "co.bird.android.lib.persistence.announcements.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eg */
/* loaded from: classes4.dex */
public abstract class AbstractC20087eg {
    /* renamed from: a */
    public abstract Observable<List<Announcement>> mo41060a(AnnouncementContext announcementContext);

    /* renamed from: b */
    public abstract Observable<List<Announcement>> mo41059b(AnnouncementDisplayType announcementDisplayType);

    /* renamed from: c */
    public abstract AbstractC23461c mo41058c();

    /* renamed from: d */
    public abstract AbstractC23461c mo41057d(Announcement... announcementArr);

    /* renamed from: e */
    public abstract AbstractC23461c mo41056e(List<String> list);
}
