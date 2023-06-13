package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¨\u0006\t"}, m28432d2 = {"LIL2;", "", "LcD1;", "map", "", "", "includePointsOfInterest", "", C17296a.f69688o, "co.bird.android.lib.map.style.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IL2 */
/* loaded from: classes3.dex */
public interface IL2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IL2$a */
    /* loaded from: classes3.dex */
    public static final class C3513a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onMapReady$default(IL2 il2, C39011cD1 c39011cD1, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onMapReady");
            }
            if ((i & 2) != 0) {
                list = null;
            }
            il2.mo100666a(c39011cD1, list);
        }
    }

    /* renamed from: a */
    void mo100666a(C39011cD1 c39011cD1, List<String> list);
}
