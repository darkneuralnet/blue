package p000;

import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, m28432d2 = {"LL44;", "", "Lco/bird/android/model/wire/WireBird;", "privateBird", "", "toggleLock", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: L44 */
/* loaded from: classes2.dex */
public interface L44 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: L44$a */
    /* loaded from: classes2.dex */
    public static final class C4731a {
        public static /* synthetic */ void setPrivateBird$default(L44 l44, WireBird wireBird, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPrivateBird");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            l44.mo40105a(wireBird, z);
        }
    }

    /* renamed from: a */
    void mo40105a(WireBird wireBird, boolean z);
}
