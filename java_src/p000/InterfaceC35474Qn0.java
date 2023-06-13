package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC36740Vx6;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\b"}, m28432d2 = {"LQn0;", "LVx6;", "LS74;", "LLo6;", "LQj5;", "Lio/reactivex/Observable;", "", "G", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qn0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC35474Qn0 extends InterfaceC36740Vx6, S74, InterfaceC34319Lo6, InterfaceC35443Qj5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qn0$a */
    /* loaded from: classes3.dex */
    public static final class C6900a {
        /* renamed from: a */
        public static Observable<Unit> m87942a(InterfaceC35474Qn0 interfaceC35474Qn0) {
            return InterfaceC36740Vx6.C8882a.m79075a(interfaceC35474Qn0);
        }

        /* renamed from: b */
        public static Observable<Unit> m87941b(InterfaceC35474Qn0 interfaceC35474Qn0) {
            return InterfaceC36740Vx6.C8882a.m79074b(interfaceC35474Qn0);
        }

        /* renamed from: c */
        public static void m87940c(InterfaceC35474Qn0 interfaceC35474Qn0, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC36740Vx6.C8882a.m79073c(interfaceC35474Qn0, user);
        }

        /* renamed from: d */
        public static void m87939d(InterfaceC35474Qn0 interfaceC35474Qn0, Warehouse warehouse) {
            InterfaceC36740Vx6.C8882a.m79072d(interfaceC35474Qn0, warehouse);
        }

        /* renamed from: e */
        public static void m87938e(InterfaceC35474Qn0 interfaceC35474Qn0, String str) {
            InterfaceC36740Vx6.C8882a.m79071e(interfaceC35474Qn0, str);
        }

        /* renamed from: f */
        public static void m87937f(InterfaceC35474Qn0 interfaceC35474Qn0, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            InterfaceC36740Vx6.C8882a.m79070f(interfaceC35474Qn0, imageUrl);
        }

        /* renamed from: g */
        public static void m87936g(InterfaceC35474Qn0 interfaceC35474Qn0, boolean z) {
            InterfaceC36740Vx6.C8882a.m79069g(interfaceC35474Qn0, z);
        }

        /* renamed from: h */
        public static void m87935h(InterfaceC35474Qn0 interfaceC35474Qn0, boolean z) {
            InterfaceC36740Vx6.C8882a.m79068h(interfaceC35474Qn0, z);
        }

        /* renamed from: i */
        public static Observable<DialogResponse> m87934i(InterfaceC35474Qn0 interfaceC35474Qn0, Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            return InterfaceC36740Vx6.C8882a.m79067i(interfaceC35474Qn0, currentWarehouse, warehouse);
        }
    }

    /* renamed from: G */
    Observable<Unit> mo84844G();
}
