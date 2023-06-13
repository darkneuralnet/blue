package p000;

import co.bird.android.model.persistence.SkuOrder;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, m28432d2 = {"Lcj3;", "LbI4;", "", "skuOrderId", "Lio/reactivex/c;", "n", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/SkuOrder;", "D0", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cj3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC39310cj3 extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cj3$a */
    /* loaded from: classes2.dex */
    public static final class C13653a {
        /* renamed from: a */
        public static <T> Observable<T> m61020a(InterfaceC39310cj3 interfaceC39310cj3, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64703i(interfaceC39310cj3, receiver);
        }
    }

    /* renamed from: D0 */
    Observable<SkuOrder> mo40991D0(String str);

    /* renamed from: n */
    AbstractC23461c mo40986n(String str);
}
