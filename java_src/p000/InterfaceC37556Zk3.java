package p000;

import co.bird.android.model.persistence.OperatorFilter;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H&J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\n"}, m28432d2 = {"LZk3;", "LbI4;", "Lio/reactivex/c;", "G", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "E1", "filters", "n1", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zk3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC37556Zk3 extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zk3$a */
    /* loaded from: classes2.dex */
    public static final class C10352a {
        /* renamed from: a */
        public static AbstractC23461c m72586a(InterfaceC37556Zk3 interfaceC37556Zk3, AbstractC23461c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64706f(interfaceC37556Zk3, receiver);
        }
    }

    /* renamed from: E1 */
    Observable<List<OperatorFilter>> mo60906E1();

    /* renamed from: G */
    AbstractC23461c mo60905G();

    /* renamed from: n1 */
    AbstractC23461c mo60899n1(List<? extends OperatorFilter> list);
}
