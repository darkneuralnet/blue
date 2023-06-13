package p000;

import co.bird.android.model.wire.WirePhysicalLock;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&¨\u0006\n"}, m28432d2 = {"LWS3;", "", "Lco/bird/android/model/wire/WirePhysicalLock;", "lock", "", "forceEndTutorialSteps", "", C17296a.f69688o, "Lio/reactivex/Observable;", "observeDone", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WS3 */
/* loaded from: classes2.dex */
public interface WS3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WS3$a */
    /* loaded from: classes2.dex */
    public static final class C9041a {
        public static /* synthetic */ void onCreate$default(WS3 ws3, WirePhysicalLock wirePhysicalLock, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCreate");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            ws3.mo73093a(wirePhysicalLock, z);
        }
    }

    /* renamed from: a */
    void mo73093a(WirePhysicalLock wirePhysicalLock, boolean z);

    Observable<Unit> observeDone();
}
