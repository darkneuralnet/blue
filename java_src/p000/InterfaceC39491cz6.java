package p000;

import co.bird.android.model.persistence.WarehouseMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\tH&¨\u0006\f"}, m28432d2 = {"Lcz6;", "LbI4;", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "Lio/reactivex/c;", "H1", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/WarehouseMarker;", "p1", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cz6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC39491cz6 extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cz6$a */
    /* loaded from: classes2.dex */
    public static final class C19648a {
        /* renamed from: a */
        public static AbstractC23461c m44759a(InterfaceC39491cz6 interfaceC39491cz6, AbstractC23461c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64706f(interfaceC39491cz6, receiver);
        }
    }

    /* renamed from: H1 */
    AbstractC23461c mo37247H1(List<Geolocation> list, OperatorMapFilterBundle operatorMapFilterBundle);

    /* renamed from: p1 */
    Observable<List<WarehouseMarker>> mo37243p1();
}
