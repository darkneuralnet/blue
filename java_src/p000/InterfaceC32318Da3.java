package p000;

import co.bird.android.model.OperatorNotification;
import co.bird.android.model.persistence.Notification;
import co.bird.android.model.persistence.OperatorNotificationCategory;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J$\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\nH&J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\nH&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000f\u001a\u00020\u0007H&J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\n2\u0006\u0010\u0012\u001a\u00020\u0007H&¨\u0006\u0015"}, m28432d2 = {"LDa3;", "", "Lio/reactivex/c;", "b", "", "fetchLatest", "", "", "categories", "P", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "g0", "Lco/bird/android/model/OperatorNotification;", "w", "id", "Lco/bird/android/model/persistence/Notification;", "l", "groupId", "Lco/bird/android/model/OperatorNotification$Notification;", "j0", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Da3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC32318Da3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Da3$a */
    /* loaded from: classes2.dex */
    public static final class C1553a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC23461c fetchOperatorNotifications$default(InterfaceC32318Da3 interfaceC32318Da3, boolean z, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                if ((i & 2) != 0) {
                    list = null;
                }
                return interfaceC32318Da3.mo108781P(z, list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchOperatorNotifications");
        }
    }

    /* renamed from: P */
    AbstractC23461c mo108781P(boolean z, List<String> list);

    /* renamed from: b */
    AbstractC23461c mo108780b();

    /* renamed from: g0 */
    Observable<List<OperatorNotificationCategory>> mo108779g0();

    /* renamed from: j0 */
    Observable<List<OperatorNotification.Notification>> mo108778j0(String str);

    /* renamed from: l */
    Observable<Notification> mo108777l(String str);

    /* renamed from: w */
    Observable<List<OperatorNotification>> mo108776w();
}
