package p000;

import co.bird.android.model.persistence.ScrapOrderView;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&¨\u0006\n"}, m28432d2 = {"Ljp5;", "LbI4;", "", "warehouseId", "Lio/reactivex/c;", "C1", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/ScrapOrderView;", "q1", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jp5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC43540jp5 extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jp5$a */
    /* loaded from: classes2.dex */
    public static final class C25028a {
        /* renamed from: a */
        public static AbstractC23461c m29876a(InterfaceC43540jp5 interfaceC43540jp5, AbstractC23461c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64706f(interfaceC43540jp5, receiver);
        }

        /* renamed from: b */
        public static <T> Observable<T> m29875b(InterfaceC43540jp5 interfaceC43540jp5, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64703i(interfaceC43540jp5, receiver);
        }
    }

    /* renamed from: C1 */
    AbstractC23461c mo26760C1(String str);

    /* renamed from: q1 */
    Observable<List<ScrapOrderView>> mo26755q1();
}
