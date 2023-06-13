package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC36740Vx6;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¨\u0006\t"}, m28432d2 = {"LbG4;", "LVx6;", "LH31;", "LS74;", "Lio/reactivex/Observable;", "", "h", "n", "d0", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bG4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC38448bG4 extends InterfaceC36740Vx6, H31, S74 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bG4$a */
    /* loaded from: classes3.dex */
    public static final class C12345a {
        /* renamed from: a */
        public static Observable<Unit> m64744a(InterfaceC38448bG4 interfaceC38448bG4) {
            return InterfaceC36740Vx6.C8882a.m79075a(interfaceC38448bG4);
        }

        /* renamed from: b */
        public static Observable<Unit> m64743b(InterfaceC38448bG4 interfaceC38448bG4) {
            return InterfaceC36740Vx6.C8882a.m79074b(interfaceC38448bG4);
        }

        /* renamed from: c */
        public static void m64742c(InterfaceC38448bG4 interfaceC38448bG4, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC36740Vx6.C8882a.m79073c(interfaceC38448bG4, user);
        }

        /* renamed from: d */
        public static void m64741d(InterfaceC38448bG4 interfaceC38448bG4, Warehouse warehouse) {
            InterfaceC36740Vx6.C8882a.m79072d(interfaceC38448bG4, warehouse);
        }

        /* renamed from: e */
        public static void m64740e(InterfaceC38448bG4 interfaceC38448bG4, String str) {
            InterfaceC36740Vx6.C8882a.m79071e(interfaceC38448bG4, str);
        }

        /* renamed from: f */
        public static void m64739f(InterfaceC38448bG4 interfaceC38448bG4, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            InterfaceC36740Vx6.C8882a.m79070f(interfaceC38448bG4, imageUrl);
        }

        /* renamed from: g */
        public static void m64738g(InterfaceC38448bG4 interfaceC38448bG4, boolean z) {
            InterfaceC36740Vx6.C8882a.m79069g(interfaceC38448bG4, z);
        }

        /* renamed from: h */
        public static void m64737h(InterfaceC38448bG4 interfaceC38448bG4, boolean z) {
            InterfaceC36740Vx6.C8882a.m79068h(interfaceC38448bG4, z);
        }

        /* renamed from: i */
        public static Observable<DialogResponse> m64736i(InterfaceC38448bG4 interfaceC38448bG4, Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            return InterfaceC36740Vx6.C8882a.m79067i(interfaceC38448bG4, currentWarehouse, warehouse);
        }
    }

    /* renamed from: d0 */
    Observable<Unit> mo61629d0();

    /* renamed from: h */
    Observable<Unit> mo61628h();

    /* renamed from: n */
    Observable<Unit> mo61627n();
}
