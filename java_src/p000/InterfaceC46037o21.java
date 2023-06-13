package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.analytics.AnalyticsEvent;
import co.bird.android.model.constant.DeviceVerification;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¨\u0006\u0012"}, m28432d2 = {"Lo21;", "", "Lco/bird/android/model/constant/DeviceVerification;", "deviceVerification", "", "retry", "e", "", C17296a.f69688o, "", "b", "requestHost", "requestMethod", "requestPath", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "c", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: o21  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC46037o21 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: o21$a */
    /* loaded from: classes2.dex */
    public static final class C26801a {
        public static /* synthetic */ boolean executeRecaptchaAction$default(InterfaceC46037o21 interfaceC46037o21, DeviceVerification deviceVerification, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return interfaceC46037o21.mo1963e(deviceVerification, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeRecaptchaAction");
        }

        public static /* synthetic */ void initRecaptchaClient$default(InterfaceC46037o21 interfaceC46037o21, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initRecaptchaClient");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            interfaceC46037o21.mo1966b(z);
        }
    }

    /* renamed from: a */
    String mo1967a();

    /* renamed from: b */
    void mo1966b(boolean z);

    /* renamed from: c */
    Observable<AnalyticsEvent> mo1965c();

    /* renamed from: d */
    boolean mo1964d(String str, String str2, String str3);

    /* renamed from: e */
    boolean mo1963e(DeviceVerification deviceVerification, boolean z);
}
