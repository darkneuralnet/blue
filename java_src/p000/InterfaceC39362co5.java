package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.model.wire.WireBird;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC36740Vx6;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\r"}, m28432d2 = {"Lco5;", "LVx6;", "LS74;", "Lio/reactivex/Observable;", "", "h", "v0", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/DialogResponse;", "lc", "Nb", "wk", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC39362co5 extends InterfaceC36740Vx6, S74 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co5$a */
    /* loaded from: classes3.dex */
    public static final class C16792a {
        /* renamed from: a */
        public static Observable<Unit> m53727a(InterfaceC39362co5 interfaceC39362co5) {
            return InterfaceC36740Vx6.C8882a.m79075a(interfaceC39362co5);
        }

        /* renamed from: b */
        public static Observable<Unit> m53726b(InterfaceC39362co5 interfaceC39362co5) {
            return InterfaceC36740Vx6.C8882a.m79074b(interfaceC39362co5);
        }

        /* renamed from: c */
        public static void m53725c(InterfaceC39362co5 interfaceC39362co5, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC36740Vx6.C8882a.m79073c(interfaceC39362co5, user);
        }

        /* renamed from: d */
        public static void m53724d(InterfaceC39362co5 interfaceC39362co5, Warehouse warehouse) {
            InterfaceC36740Vx6.C8882a.m79072d(interfaceC39362co5, warehouse);
        }

        /* renamed from: e */
        public static void m53723e(InterfaceC39362co5 interfaceC39362co5, String str) {
            InterfaceC36740Vx6.C8882a.m79071e(interfaceC39362co5, str);
        }

        /* renamed from: f */
        public static void m53722f(InterfaceC39362co5 interfaceC39362co5, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            InterfaceC36740Vx6.C8882a.m79070f(interfaceC39362co5, imageUrl);
        }

        /* renamed from: g */
        public static void m53721g(InterfaceC39362co5 interfaceC39362co5, boolean z) {
            InterfaceC36740Vx6.C8882a.m79069g(interfaceC39362co5, z);
        }

        /* renamed from: h */
        public static void m53720h(InterfaceC39362co5 interfaceC39362co5, boolean z) {
            InterfaceC36740Vx6.C8882a.m79068h(interfaceC39362co5, z);
        }

        /* renamed from: i */
        public static Observable<DialogResponse> m53719i(InterfaceC39362co5 interfaceC39362co5, Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            return InterfaceC36740Vx6.C8882a.m79067i(interfaceC39362co5, currentWarehouse, warehouse);
        }
    }

    /* renamed from: Nb */
    void mo43691Nb(WireBird wireBird);

    /* renamed from: h */
    Observable<Unit> mo43690h();

    /* renamed from: lc */
    Observable<DialogResponse> mo43689lc(WireBird wireBird);

    /* renamed from: v0 */
    Observable<Unit> mo43688v0();

    /* renamed from: wk */
    void mo43687wk(WireBird wireBird);
}
