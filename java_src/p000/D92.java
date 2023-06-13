package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC36740Vx6;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LD92;", "LVx6;", "", "visible", "", "A9", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: D92 */
/* loaded from: classes3.dex */
public interface D92 extends InterfaceC36740Vx6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D92$a */
    /* loaded from: classes3.dex */
    public static final class C1401a {
        /* renamed from: a */
        public static Observable<Unit> m110868a(D92 d92) {
            return InterfaceC36740Vx6.C8882a.m79075a(d92);
        }

        /* renamed from: b */
        public static Observable<Unit> m110867b(D92 d92) {
            return InterfaceC36740Vx6.C8882a.m79074b(d92);
        }

        /* renamed from: c */
        public static void m110866c(D92 d92, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC36740Vx6.C8882a.m79073c(d92, user);
        }

        /* renamed from: d */
        public static void m110865d(D92 d92, Warehouse warehouse) {
            InterfaceC36740Vx6.C8882a.m79072d(d92, warehouse);
        }

        /* renamed from: e */
        public static void m110864e(D92 d92, String str) {
            InterfaceC36740Vx6.C8882a.m79071e(d92, str);
        }

        /* renamed from: f */
        public static void m110863f(D92 d92, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            InterfaceC36740Vx6.C8882a.m79070f(d92, imageUrl);
        }

        /* renamed from: g */
        public static void m110862g(D92 d92, boolean z) {
            InterfaceC36740Vx6.C8882a.m79069g(d92, z);
        }

        /* renamed from: h */
        public static void m110861h(D92 d92, boolean z) {
            InterfaceC36740Vx6.C8882a.m79068h(d92, z);
        }

        /* renamed from: i */
        public static Observable<DialogResponse> m110860i(D92 d92, Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            return InterfaceC36740Vx6.C8882a.m79067i(d92, currentWarehouse, warehouse);
        }
    }

    /* renamed from: A9 */
    void mo109341A9(boolean z);
}
