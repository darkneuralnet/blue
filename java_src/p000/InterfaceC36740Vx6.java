package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC35918Sk3;
import p000.InterfaceC9073WW;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m28432d2 = {"LVx6;", "LSk3;", "LWW;", "LaM5;", "Lco/bird/android/model/Warehouse;", "currentWarehouse", "suggestedWarehouse", "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "G9", "Lco/bird/android/core/mvp/BaseActivity;", "getActivity", "()Lco/bird/android/core/mvp/BaseActivity;", "activity", "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vx6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC36740Vx6 extends InterfaceC35918Sk3, InterfaceC9073WW, InterfaceC37910aM5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vx6$a */
    /* loaded from: classes4.dex */
    public static final class C8882a {
        /* renamed from: a */
        public static Observable<Unit> m79075a(InterfaceC36740Vx6 interfaceC36740Vx6) {
            return InterfaceC9073WW.C9074a.m78262a(interfaceC36740Vx6);
        }

        /* renamed from: b */
        public static Observable<Unit> m79074b(InterfaceC36740Vx6 interfaceC36740Vx6) {
            return InterfaceC35918Sk3.C7527a.m84923a(interfaceC36740Vx6);
        }

        /* renamed from: c */
        public static void m79073c(InterfaceC36740Vx6 interfaceC36740Vx6, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC35918Sk3.C7527a.m84922b(interfaceC36740Vx6, user);
        }

        /* renamed from: d */
        public static void m79072d(InterfaceC36740Vx6 interfaceC36740Vx6, Warehouse warehouse) {
            InterfaceC35918Sk3.C7527a.m84921c(interfaceC36740Vx6, warehouse);
        }

        /* renamed from: e */
        public static void m79071e(InterfaceC36740Vx6 interfaceC36740Vx6, String str) {
            InterfaceC35918Sk3.C7527a.m84920d(interfaceC36740Vx6, str);
        }

        /* renamed from: f */
        public static void m79070f(InterfaceC36740Vx6 interfaceC36740Vx6, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            InterfaceC35918Sk3.C7527a.m84919e(interfaceC36740Vx6, imageUrl);
        }

        /* renamed from: g */
        public static void m79069g(InterfaceC36740Vx6 interfaceC36740Vx6, boolean z) {
            InterfaceC9073WW.C9074a.m78261b(interfaceC36740Vx6, z);
        }

        /* renamed from: h */
        public static void m79068h(InterfaceC36740Vx6 interfaceC36740Vx6, boolean z) {
            InterfaceC35918Sk3.C7527a.m84918f(interfaceC36740Vx6, z);
        }

        /* renamed from: i */
        public static Observable<DialogResponse> m79067i(InterfaceC36740Vx6 interfaceC36740Vx6, Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            C43641jz6 m29515a = C43641jz6.f93709e.m29515a(currentWarehouse, warehouse);
            m29515a.show(interfaceC36740Vx6.getActivity().getSupportFragmentManager(), "WarehouseVerificationBottomSheet");
            return m29515a.m29519A9();
        }
    }

    /* renamed from: G9 */
    Observable<DialogResponse> mo22207G9(Warehouse warehouse, Warehouse warehouse2);

    BaseActivity getActivity();
}
