package p000;

import android.app.Application;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.analytics.AnalyticsDebugEvent;
import co.bird.android.model.analytics.AnalyticsEvent;
import co.bird.android.model.analytics.LegacyAnalyticsEvent;
import co.bird.android.model.analytics.PersistentPropertyEntry;
import co.bird.android.model.analytics.TraceKey;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23461c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&J4\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&J>\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013H&J0\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&J!\u0010!\u001a\u00020\u0006\"\b\b\u0000\u0010\u001f*\u00020\u001e2\u0006\u0010 \u001a\u00028\u0000H&¢\u0006\u0004\b!\u0010\"J\b\u0010$\u001a\u00020#H&J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H&J\b\u0010)\u001a\u00020(H&R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, m28432d2 = {"LEa;", "", "Landroid/app/Application;", Stripe3ds2AuthParams.FIELD_APP, "", "isDebug", "", DateTokenConverter.CONVERTER_KEY, "D", "P", "O", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "legacyEvent", "N", "Lco/bird/android/model/analytics/TraceKey;", "key", "", "", "attributes", "Lorg/joda/time/DateTime;", "startTimeOverride", "z", "keySuffix", "stopTimeOverride", "w", "", "throttleMillis", "G", "J", "v", "Lco/bird/android/model/analytics/AnalyticsEvent;", "T", "event", "y", "(Lco/bird/android/model/analytics/AnalyticsEvent;)V", "", "f", "Lco/bird/android/model/analytics/PersistentPropertyEntry;", "entry", "x", "Lio/reactivex/c;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LZ84;", "", "Lco/bird/android/model/analytics/AnalyticsDebugEvent;", "e", "()LZ84;", "trackedEventsObservable", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ea */
/* loaded from: classes2.dex */
public interface InterfaceC1880Ea {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ea$a */
    /* loaded from: classes2.dex */
    public static final class C1881a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean startThrottledTrace$default(InterfaceC1880Ea interfaceC1880Ea, TraceKey traceKey, Map map, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    map = null;
                }
                return interfaceC1880Ea.mo55965G(traceKey, map, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startThrottledTrace");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startTrace$default(InterfaceC1880Ea interfaceC1880Ea, TraceKey traceKey, Map map, DateTime dateTime, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTrace");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            if ((i & 4) != 0) {
                dateTime = null;
            }
            interfaceC1880Ea.mo55903z(traceKey, map, dateTime);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void stopTrace$default(InterfaceC1880Ea interfaceC1880Ea, TraceKey traceKey, String str, Map map, DateTime dateTime, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = "";
                }
                if ((i & 4) != 0) {
                    map = null;
                }
                if ((i & 8) != 0) {
                    dateTime = null;
                }
                interfaceC1880Ea.mo55909w(traceKey, str, map, dateTime);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopTrace");
        }
    }

    /* renamed from: C */
    AbstractC23461c mo55971C();

    /* renamed from: D */
    void mo55969D();

    /* renamed from: G */
    boolean mo55965G(TraceKey traceKey, Map<String, String> map, int i);

    /* renamed from: J */
    void mo55961J(TraceKey traceKey);

    /* renamed from: N */
    void mo55956N(LegacyAnalyticsEvent legacyAnalyticsEvent);

    /* renamed from: O */
    void mo55954O();

    /* renamed from: P */
    void mo55952P();

    /* renamed from: d */
    void mo55936d(Application application, boolean z);

    /* renamed from: e */
    Z84<List<AnalyticsDebugEvent>> mo55935e();

    /* renamed from: f */
    long mo55933f();

    /* renamed from: v */
    boolean mo55912v(TraceKey traceKey);

    /* renamed from: w */
    void mo55909w(TraceKey traceKey, String str, Map<String, String> map, DateTime dateTime);

    /* renamed from: x */
    void mo55907x(PersistentPropertyEntry persistentPropertyEntry);

    /* renamed from: y */
    <T extends AnalyticsEvent> void mo55905y(T t);

    /* renamed from: z */
    void mo55903z(TraceKey traceKey, Map<String, String> map, DateTime dateTime);
}
