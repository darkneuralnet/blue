package p000;

import co.bird.api.request.NotificationCenterRequest;
import co.bird.api.response.NotificationCategoriesResponse;
import co.bird.api.response.NotificationCenterResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¨\u0006\t"}, m28432d2 = {"Loa3;", "", "Lio/reactivex/F;", "Lco/bird/api/response/NotificationCategoriesResponse;", C17296a.f69688o, "Lco/bird/api/request/NotificationCenterRequest;", "request", "Lco/bird/api/response/NotificationCenterResponse;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oa3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC46353oa3 {
    @NA1("api/v1/notification-center/categories")
    /* renamed from: a */
    AbstractC23442F<NotificationCategoriesResponse> m20828a();

    @AD3("api/v1/notification-center/for-user")
    /* renamed from: b */
    AbstractC23442F<NotificationCenterResponse> m20827b(@InterfaceC6404PY NotificationCenterRequest notificationCenterRequest);
}
