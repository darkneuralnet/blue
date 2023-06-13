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
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&¨\u0006\n"}, m28432d2 = {"LdF;", "LVx6;", "", "enabled", "", "xf", "B9", "Lio/reactivex/k;", "Tf", "yi", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dF */
/* loaded from: classes3.dex */
public interface InterfaceC19703dF extends InterfaceC36740Vx6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dF$a */
    /* loaded from: classes3.dex */
    public static final class C19704a {
        /* renamed from: a */
        public static Observable<Unit> m44496a(InterfaceC19703dF interfaceC19703dF) {
            return InterfaceC36740Vx6.C8882a.m79075a(interfaceC19703dF);
        }

        /* renamed from: b */
        public static Observable<Unit> m44495b(InterfaceC19703dF interfaceC19703dF) {
            return InterfaceC36740Vx6.C8882a.m79074b(interfaceC19703dF);
        }

        /* renamed from: c */
        public static void m44494c(InterfaceC19703dF interfaceC19703dF, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC36740Vx6.C8882a.m79073c(interfaceC19703dF, user);
        }

        /* renamed from: d */
        public static void m44493d(InterfaceC19703dF interfaceC19703dF, Warehouse warehouse) {
            InterfaceC36740Vx6.C8882a.m79072d(interfaceC19703dF, warehouse);
        }

        /* renamed from: e */
        public static void m44492e(InterfaceC19703dF interfaceC19703dF, String str) {
            InterfaceC36740Vx6.C8882a.m79071e(interfaceC19703dF, str);
        }

        /* renamed from: f */
        public static void m44491f(InterfaceC19703dF interfaceC19703dF, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            InterfaceC36740Vx6.C8882a.m79070f(interfaceC19703dF, imageUrl);
        }

        /* renamed from: g */
        public static void m44490g(InterfaceC19703dF interfaceC19703dF, boolean z) {
            InterfaceC36740Vx6.C8882a.m79069g(interfaceC19703dF, z);
        }

        /* renamed from: h */
        public static void m44489h(InterfaceC19703dF interfaceC19703dF, boolean z) {
            InterfaceC36740Vx6.C8882a.m79068h(interfaceC19703dF, z);
        }

        /* renamed from: i */
        public static Observable<DialogResponse> m44488i(InterfaceC19703dF interfaceC19703dF, Warehouse currentWarehouse, Warehouse warehouse) {
            Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
            return InterfaceC36740Vx6.C8882a.m79067i(interfaceC19703dF, currentWarehouse, warehouse);
        }
    }

    /* renamed from: B9 */
    void mo43080B9(boolean z);

    /* renamed from: Tf */
    AbstractC24490k<Unit> mo43079Tf();

    /* renamed from: xf */
    void mo43078xf(boolean z);

    /* renamed from: yi */
    AbstractC24490k<Unit> mo43077yi();
}
