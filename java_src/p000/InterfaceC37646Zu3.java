package p000;

import co.bird.android.model.persistence.OperatorTaskBanner;
import co.bird.android.model.persistence.OperatorTaskGroup;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u0004H&¨\u0006\r"}, m28432d2 = {"LZu3;", "LbI4;", "Lio/reactivex/c;", "j1", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/OperatorTaskGroup;", "w1", "", "title", "J0", "Lco/bird/android/model/persistence/OperatorTaskBanner;", "L", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zu3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC37646Zu3 extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zu3$a */
    /* loaded from: classes2.dex */
    public static final class C10429a {
        /* renamed from: a */
        public static <T> Observable<T> m72324a(InterfaceC37646Zu3 interfaceC37646Zu3, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64703i(interfaceC37646Zu3, receiver);
        }
    }

    /* renamed from: J0 */
    Observable<OperatorTaskGroup> mo62141J0(String str);

    /* renamed from: L */
    Observable<List<OperatorTaskBanner>> mo62138L();

    /* renamed from: j1 */
    AbstractC23461c mo62136j1();

    /* renamed from: w1 */
    Observable<List<OperatorTaskGroup>> mo62135w1();
}
