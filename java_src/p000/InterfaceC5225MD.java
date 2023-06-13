package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\fJ,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\f\u001a\u00020\u000bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H&¨\u0006\u0010"}, m28432d2 = {"LMD;", "", "", "scanMode", "", "includeEphemeralCacheResults", "", "bleTrigger", "Lio/reactivex/Observable;", "LTk5;", C17296a.f69688o, "LMD$b;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: MD */
/* loaded from: classes2.dex */
public interface InterfaceC5225MD {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD$a */
    /* loaded from: classes2.dex */
    public static final class C5226a {
        public static /* synthetic */ Observable scanBleDevices$default(InterfaceC5225MD interfaceC5225MD, int i, boolean z, String str, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    z = true;
                }
                if ((i2 & 4) != 0) {
                    str = null;
                }
                return interfaceC5225MD.mo73606a(i, z, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scanBleDevices");
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"LMD$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: MD$b */
    /* loaded from: classes2.dex */
    public enum EnumC5227b {
        BLUETOOTH_NOT_AVAILABLE,
        LOCATION_PERMISSION_NOT_GRANTED,
        BLUETOOTH_NOT_ENABLED,
        LOCATION_SERVICES_NOT_ENABLED,
        READY,
        UNKNOWN
    }

    /* renamed from: a */
    Observable<C36154Tk5> mo73606a(int i, boolean z, String str);

    /* renamed from: b */
    EnumC5227b mo73605b();

    /* renamed from: c */
    Observable<EnumC5227b> mo73604c();

    /* renamed from: d */
    boolean mo73603d();

    /* renamed from: e */
    boolean mo73602e();
}
