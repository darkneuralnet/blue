package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&J \u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH&J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH&J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH&J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH&J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J*\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u001c"}, m28432d2 = {"LTo0;", "", "Lco/bird/android/model/persistence/Bird;", "bird", "", "retryAttempts", "delayMillis", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "", "lock", "useBluetooth", C17296a.f69688o, "k", "c", "g", "", "duration", "f", "b", "Lco/bird/android/model/wire/WireBird;", "i", "j", "sleep", "", "sessionId", "e", "h", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: To0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC36185To0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: To0$a */
    /* loaded from: classes2.dex */
    public static final class C7924a {
        public static /* synthetic */ AbstractC23461c refreshBirdAckLockStatus$default(InterfaceC36185To0 interfaceC36185To0, Bird bird, long j, long j2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    j = 15;
                }
                long j3 = j;
                if ((i & 4) != 0) {
                    j2 = 1000;
                }
                return interfaceC36185To0.mo31811d(bird, j3, j2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshBirdAckLockStatus");
        }

        public static /* synthetic */ AbstractC23461c sleepBird$default(InterfaceC36185To0 interfaceC36185To0, Bird bird, boolean z, boolean z2, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    str = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
                }
                return interfaceC36185To0.mo31810e(bird, z, z2, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sleepBird");
        }
    }

    /* renamed from: a */
    AbstractC23461c mo31814a(Bird bird, boolean z, boolean z2);

    /* renamed from: b */
    AbstractC23461c mo31813b(Bird bird, boolean z);

    /* renamed from: c */
    AbstractC23461c mo31812c(Bird bird, boolean z);

    /* renamed from: d */
    AbstractC23461c mo31811d(Bird bird, long j, long j2);

    /* renamed from: e */
    AbstractC23461c mo31810e(Bird bird, boolean z, boolean z2, String str);

    /* renamed from: f */
    AbstractC23461c mo31809f(Bird bird, int i);

    /* renamed from: g */
    AbstractC23461c mo31808g(Bird bird, boolean z);

    /* renamed from: h */
    AbstractC23461c mo31807h(Bird bird);

    /* renamed from: i */
    AbstractC23461c mo31806i(WireBird wireBird, boolean z);

    /* renamed from: j */
    AbstractC23461c mo31805j(Bird bird);

    /* renamed from: k */
    AbstractC23461c mo31804k(Bird bird, boolean z);
}
