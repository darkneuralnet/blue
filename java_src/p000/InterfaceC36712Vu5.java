package p000;

import co.bird.android.model.wire.WireServiceCenterStatus;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&J$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0010"}, m28432d2 = {"LVu5;", "", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "status", "Lio/reactivex/F;", "", "LH6;", "j", "", "e", "i", "", "birdCode", "", "minHibernateBattery", "g", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vu5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC36712Vu5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vu5$a */
    /* loaded from: classes3.dex */
    public static final class C8823a {
        public static /* synthetic */ AbstractC23442F convertForFailure$default(InterfaceC36712Vu5 interfaceC36712Vu5, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return interfaceC36712Vu5.mo72322i(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertForFailure");
        }
    }

    /* renamed from: g */
    AbstractC23442F<List<C3023H6>> mo72323g(String str, int i);

    /* renamed from: i */
    AbstractC23442F<List<C3023H6>> mo72322i(Throwable th);

    /* renamed from: j */
    AbstractC23442F<List<C3023H6>> mo72321j(WireServiceCenterStatus wireServiceCenterStatus);
}
