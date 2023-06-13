package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC36740Vx6;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, m28432d2 = {"Lmu5;", "LVx6;", "LLo6;", "Lio/reactivex/Observable;", "", "w", "n", "E5", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mu5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC45369mu5 extends InterfaceC36740Vx6, InterfaceC34319Lo6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mu5$a */
    /* loaded from: classes3.dex */
    public static final class C26288a {
        /* renamed from: a */
        public static Observable<Unit> m24728a(InterfaceC45369mu5 interfaceC45369mu5) {
            return InterfaceC36740Vx6.C8882a.m79075a(interfaceC45369mu5);
        }

        /* renamed from: b */
        public static void m24727b(InterfaceC45369mu5 interfaceC45369mu5, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC36740Vx6.C8882a.m79073c(interfaceC45369mu5, user);
        }

        /* renamed from: c */
        public static void m24726c(InterfaceC45369mu5 interfaceC45369mu5, Warehouse warehouse) {
            InterfaceC36740Vx6.C8882a.m79072d(interfaceC45369mu5, warehouse);
        }

        /* renamed from: d */
        public static void m24725d(InterfaceC45369mu5 interfaceC45369mu5, String str) {
            InterfaceC36740Vx6.C8882a.m79071e(interfaceC45369mu5, str);
        }

        /* renamed from: e */
        public static void m24724e(InterfaceC45369mu5 interfaceC45369mu5, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            InterfaceC36740Vx6.C8882a.m79070f(interfaceC45369mu5, imageUrl);
        }

        /* renamed from: f */
        public static void m24723f(InterfaceC45369mu5 interfaceC45369mu5, boolean z) {
            InterfaceC36740Vx6.C8882a.m79069g(interfaceC45369mu5, z);
        }

        /* renamed from: g */
        public static void m24722g(InterfaceC45369mu5 interfaceC45369mu5, boolean z) {
            InterfaceC36740Vx6.C8882a.m79068h(interfaceC45369mu5, z);
        }

        /* renamed from: h */
        public static Observable<DialogResponse> m24721h(InterfaceC45369mu5 interfaceC45369mu5, Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            return InterfaceC36740Vx6.C8882a.m79067i(interfaceC45369mu5, currentWarehouse, warehouse);
        }
    }

    /* renamed from: E5 */
    void mo22208E5();

    /* renamed from: n */
    Observable<Unit> mo22201n();

    /* renamed from: w */
    Observable<Unit> mo22197w();
}
