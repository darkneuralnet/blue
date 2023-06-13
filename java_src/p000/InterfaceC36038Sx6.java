package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\u0007"}, m28432d2 = {"LSx6;", "", "", "onResume", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, DateTokenConverter.CONVERTER_KEY, "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sx6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC36038Sx6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Sx6$a */
    /* loaded from: classes4.dex */
    public static final class C7617a {
        public static /* synthetic */ void checkWarehouseInfo$default(InterfaceC36038Sx6 interfaceC36038Sx6, InterfaceC35804Rx6 interfaceC35804Rx6, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkWarehouseInfo");
            }
            if ((i & 1) != 0) {
                interfaceC35804Rx6 = null;
            }
            interfaceC36038Sx6.mo28195d(interfaceC35804Rx6);
        }
    }

    /* renamed from: d */
    void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6);

    void onResume();
}
