package p000;

import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.widget.OperatorInfoCard;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28432d2 = {"LSk3;", "", "Lio/reactivex/Observable;", "", "v1", "", "show", "Zd", "", "name", "z7", "Lco/bird/android/model/Warehouse;", "warehouse", "S9", "imageUrl", "I9", "Lco/bird/android/model/User;", "user", "Df", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sk3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC35918Sk3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorInfoCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorInfoCard.kt\nco/bird/android/widget/OperatorCardUi$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* renamed from: Sk3$a */
    /* loaded from: classes4.dex */
    public static final class C7527a {
        /* renamed from: a */
        public static Observable<Unit> m84923a(InterfaceC35918Sk3 interfaceC35918Sk3) {
            return C44626lf5.clicksThrottle$default(interfaceC35918Sk3.mo22200p1(), 0L, 1, null);
        }

        /* renamed from: b */
        public static void m84922b(InterfaceC35918Sk3 interfaceC35918Sk3, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            String imageUrl = user.getImageUrl();
            if (imageUrl != null) {
                interfaceC35918Sk3.mo22206I9(imageUrl);
            }
            interfaceC35918Sk3.mo22196z7(user.getName());
        }

        /* renamed from: c */
        public static void m84921c(InterfaceC35918Sk3 interfaceC35918Sk3, Warehouse warehouse) {
            interfaceC35918Sk3.mo22200p1().m54517g().setText(warehouse != null ? warehouse.getName() : null);
        }

        /* renamed from: d */
        public static void m84920d(InterfaceC35918Sk3 interfaceC35918Sk3, String str) {
            interfaceC35918Sk3.mo22200p1().m54518f().setText(str);
        }

        /* renamed from: e */
        public static void m84919e(InterfaceC35918Sk3 interfaceC35918Sk3, String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            ComponentCallbacks2C17096a.m53138t(interfaceC35918Sk3.mo22200p1().getContext()).m81653k(imageUrl).m16096R0(interfaceC35918Sk3.mo22200p1().m54519e());
        }

        /* renamed from: f */
        public static void m84918f(InterfaceC35918Sk3 interfaceC35918Sk3, boolean z) {
            C49520tu6.show$default(interfaceC35918Sk3.mo22200p1(), z, 0, 2, null);
        }
    }

    /* renamed from: Df */
    void mo22209Df(User user);

    /* renamed from: I9 */
    void mo22206I9(String str);

    /* renamed from: S9 */
    void mo22203S9(Warehouse warehouse);

    /* renamed from: Zd */
    void mo22202Zd(boolean z);

    /* renamed from: p1 */
    OperatorInfoCard mo22200p1();

    /* renamed from: v1 */
    Observable<Unit> mo22198v1();

    /* renamed from: z7 */
    void mo22196z7(String str);
}
