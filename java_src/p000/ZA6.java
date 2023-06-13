package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import io.reactivex.AbstractC24490k;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC36740Vx6;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¨\u0006\b"}, m28432d2 = {"LZA6;", "LVx6;", "Lh56;", "LS74;", "Lio/reactivex/k;", "", "o1", "Ei", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZA6 */
/* loaded from: classes3.dex */
public interface ZA6 extends InterfaceC36740Vx6, InterfaceC41921h56, S74 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZA6$a */
    /* loaded from: classes3.dex */
    public static final class C10123a {
        /* renamed from: a */
        public static Observable<Unit> m73647a(ZA6 za6) {
            return InterfaceC36740Vx6.C8882a.m79075a(za6);
        }

        /* renamed from: b */
        public static Observable<Unit> m73646b(ZA6 za6) {
            return InterfaceC36740Vx6.C8882a.m79074b(za6);
        }

        /* renamed from: c */
        public static void m73645c(ZA6 za6, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC36740Vx6.C8882a.m79073c(za6, user);
        }

        /* renamed from: d */
        public static void m73644d(ZA6 za6, Warehouse warehouse) {
            InterfaceC36740Vx6.C8882a.m79072d(za6, warehouse);
        }

        /* renamed from: e */
        public static void m73643e(ZA6 za6, String str) {
            InterfaceC36740Vx6.C8882a.m79071e(za6, str);
        }

        /* renamed from: f */
        public static void m73642f(ZA6 za6, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            InterfaceC36740Vx6.C8882a.m79070f(za6, imageUrl);
        }

        /* renamed from: g */
        public static void m73641g(ZA6 za6, boolean z) {
            InterfaceC36740Vx6.C8882a.m79069g(za6, z);
        }

        /* renamed from: h */
        public static void m73640h(ZA6 za6, boolean z) {
            InterfaceC36740Vx6.C8882a.m79068h(za6, z);
        }

        /* renamed from: i */
        public static Observable<DialogResponse> m73639i(ZA6 za6, Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            return InterfaceC36740Vx6.C8882a.m79067i(za6, currentWarehouse, warehouse);
        }
    }

    /* renamed from: Ei */
    AbstractC24490k<Unit> mo71796Ei();

    /* renamed from: o1 */
    AbstractC24490k<Unit> mo71795o1();
}
