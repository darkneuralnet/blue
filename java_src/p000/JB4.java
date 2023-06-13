package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC36740Vx6;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\b"}, m28432d2 = {"LJB4;", "LVx6;", "LH31;", "LS74;", "LLo6;", "Lio/reactivex/Observable;", "", "w", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: JB4 */
/* loaded from: classes3.dex */
public interface JB4 extends InterfaceC36740Vx6, H31, S74, InterfaceC34319Lo6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JB4$a */
    /* loaded from: classes3.dex */
    public static final class C3917a {
        /* renamed from: a */
        public static Observable<Unit> m101040a(JB4 jb4) {
            return InterfaceC36740Vx6.C8882a.m79075a(jb4);
        }

        /* renamed from: b */
        public static Observable<Unit> m101039b(JB4 jb4) {
            return InterfaceC36740Vx6.C8882a.m79074b(jb4);
        }

        /* renamed from: c */
        public static void m101038c(JB4 jb4, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC36740Vx6.C8882a.m79073c(jb4, user);
        }

        /* renamed from: d */
        public static void m101037d(JB4 jb4, Warehouse warehouse) {
            InterfaceC36740Vx6.C8882a.m79072d(jb4, warehouse);
        }

        /* renamed from: e */
        public static void m101036e(JB4 jb4, String str) {
            InterfaceC36740Vx6.C8882a.m79071e(jb4, str);
        }

        /* renamed from: f */
        public static void m101035f(JB4 jb4, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            InterfaceC36740Vx6.C8882a.m79070f(jb4, imageUrl);
        }

        /* renamed from: g */
        public static void m101034g(JB4 jb4, boolean z) {
            InterfaceC36740Vx6.C8882a.m79069g(jb4, z);
        }

        /* renamed from: h */
        public static void m101033h(JB4 jb4, boolean z) {
            InterfaceC36740Vx6.C8882a.m79068h(jb4, z);
        }

        /* renamed from: i */
        public static Observable<DialogResponse> m101032i(JB4 jb4, Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            return InterfaceC36740Vx6.C8882a.m79067i(jb4, currentWarehouse, warehouse);
        }
    }

    /* renamed from: w */
    Observable<Unit> mo99107w();
}
