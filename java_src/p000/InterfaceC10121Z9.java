package p000;

import co.bird.api.request.CreateAnalyticsEventsBody;
import co.bird.api.request.LegacyCreateAnalyticsEventsBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Deprecated;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"LZ9;", "", "Lco/bird/api/request/LegacyCreateAnalyticsEventsBody;", "events", "Lio/reactivex/Observable;", C17296a.f69688o, "Lco/bird/api/request/CreateAnalyticsEventsBody;", "Lio/reactivex/F;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Z9 */
/* loaded from: classes4.dex */
public interface InterfaceC10121Z9 {
    @Deprecated(message = "Use track()")
    @AD3("analytics/track")
    /* renamed from: a */
    Observable<Object> m73650a(@InterfaceC6404PY LegacyCreateAnalyticsEventsBody legacyCreateAnalyticsEventsBody);

    @AD3("analytics/track-events")
    /* renamed from: b */
    AbstractC23442F<Object> m73649b(@InterfaceC6404PY CreateAnalyticsEventsBody createAnalyticsEventsBody);
}
