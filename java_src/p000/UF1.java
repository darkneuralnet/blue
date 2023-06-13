package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.HardCountStatus;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC36740Vx6;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\b\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0010"}, m28432d2 = {"LUF1;", "LVx6;", "LH31;", "", "enable", "", "o8", "Lio/reactivex/Observable;", "p8", "ne", "", "expectedCount", "F4", "Lco/bird/android/model/HardCountStatus;", "hardCountStatus", "if", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UF1 */
/* loaded from: classes3.dex */
public interface UF1 extends InterfaceC36740Vx6, H31 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UF1$a */
    /* loaded from: classes3.dex */
    public static final class C8245a {
        /* renamed from: a */
        public static Observable<Unit> m81782a(UF1 uf1) {
            return InterfaceC36740Vx6.C8882a.m79075a(uf1);
        }

        /* renamed from: b */
        public static Observable<Unit> m81781b(UF1 uf1) {
            return InterfaceC36740Vx6.C8882a.m79074b(uf1);
        }

        /* renamed from: c */
        public static void m81780c(UF1 uf1, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC36740Vx6.C8882a.m79073c(uf1, user);
        }

        /* renamed from: d */
        public static void m81779d(UF1 uf1, Warehouse warehouse) {
            InterfaceC36740Vx6.C8882a.m79072d(uf1, warehouse);
        }

        /* renamed from: e */
        public static void m81778e(UF1 uf1, String str) {
            InterfaceC36740Vx6.C8882a.m79071e(uf1, str);
        }

        /* renamed from: f */
        public static void m81777f(UF1 uf1, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            InterfaceC36740Vx6.C8882a.m79070f(uf1, imageUrl);
        }

        /* renamed from: g */
        public static void m81776g(UF1 uf1, boolean z) {
            InterfaceC36740Vx6.C8882a.m79069g(uf1, z);
        }

        /* renamed from: h */
        public static void m81775h(UF1 uf1, boolean z) {
            InterfaceC36740Vx6.C8882a.m79068h(uf1, z);
        }

        /* renamed from: i */
        public static Observable<DialogResponse> m81774i(UF1 uf1, Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            return InterfaceC36740Vx6.C8882a.m79067i(uf1, currentWarehouse, warehouse);
        }
    }

    /* renamed from: F4 */
    void mo80168F4(int i);

    /* renamed from: if */
    void mo80167if(HardCountStatus hardCountStatus);

    /* renamed from: ne */
    void mo80166ne();

    /* renamed from: o8 */
    void mo80165o8(boolean z);

    /* renamed from: p8 */
    Observable<Unit> mo80164p8();
}
