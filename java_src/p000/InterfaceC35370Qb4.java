package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC36740Vx6;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\b"}, m28432d2 = {"LQb4;", "LVx6;", "LH31;", "Lio/reactivex/Observable;", "", "h", "n", "G", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qb4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC35370Qb4 extends InterfaceC36740Vx6, H31 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qb4$a */
    /* loaded from: classes3.dex */
    public static final class C6808a {
        /* renamed from: a */
        public static Observable<Unit> m88378a(InterfaceC35370Qb4 interfaceC35370Qb4) {
            return InterfaceC36740Vx6.C8882a.m79075a(interfaceC35370Qb4);
        }

        /* renamed from: b */
        public static Observable<Unit> m88377b(InterfaceC35370Qb4 interfaceC35370Qb4) {
            return InterfaceC36740Vx6.C8882a.m79074b(interfaceC35370Qb4);
        }

        /* renamed from: c */
        public static void m88376c(InterfaceC35370Qb4 interfaceC35370Qb4, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC36740Vx6.C8882a.m79073c(interfaceC35370Qb4, user);
        }

        /* renamed from: d */
        public static void m88375d(InterfaceC35370Qb4 interfaceC35370Qb4, Warehouse warehouse) {
            InterfaceC36740Vx6.C8882a.m79072d(interfaceC35370Qb4, warehouse);
        }

        /* renamed from: e */
        public static void m88374e(InterfaceC35370Qb4 interfaceC35370Qb4, String str) {
            InterfaceC36740Vx6.C8882a.m79071e(interfaceC35370Qb4, str);
        }

        /* renamed from: f */
        public static void m88373f(InterfaceC35370Qb4 interfaceC35370Qb4, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            InterfaceC36740Vx6.C8882a.m79070f(interfaceC35370Qb4, imageUrl);
        }

        /* renamed from: g */
        public static void m88372g(InterfaceC35370Qb4 interfaceC35370Qb4, boolean z) {
            InterfaceC36740Vx6.C8882a.m79069g(interfaceC35370Qb4, z);
        }

        /* renamed from: h */
        public static void m88371h(InterfaceC35370Qb4 interfaceC35370Qb4, boolean z) {
            InterfaceC36740Vx6.C8882a.m79068h(interfaceC35370Qb4, z);
        }

        /* renamed from: i */
        public static Observable<DialogResponse> m88370i(InterfaceC35370Qb4 interfaceC35370Qb4, Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            return InterfaceC36740Vx6.C8882a.m79067i(interfaceC35370Qb4, currentWarehouse, warehouse);
        }
    }

    /* renamed from: G */
    Observable<Unit> mo86573G();

    /* renamed from: h */
    Observable<Unit> mo86572h();

    /* renamed from: n */
    Observable<Unit> mo86571n();
}
