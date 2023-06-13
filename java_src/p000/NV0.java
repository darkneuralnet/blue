package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import kotlin.Metadata;
import kotlin.Pair;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH&J\b\u0010\u0010\u001a\u00020\u000eH&J,\u0010\u0014\u001a\u00020\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00110\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u000bH&¨\u0006\u0015"}, m28432d2 = {"LNV0;", "", "Landroid/content/Intent;", "intent", "", "e", "Lio/reactivex/p;", "LcW0;", C17296a.f69688o, "", "uri", "", "navigateToUrlOnFailure", "restartActivity", "Lio/reactivex/c;", "c", "b", "Lkotlin/Pair;", "deepLinkMaybe", "allowExternal", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NV0 */
/* loaded from: classes2.dex */
public interface NV0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: NV0$a */
    /* loaded from: classes2.dex */
    public static final class C5589a {
        public static /* synthetic */ AbstractC23461c navigate$default(NV0 nv0, AbstractC24507p abstractC24507p, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return nv0.mo78298d(abstractC24507p, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }

        public static /* synthetic */ AbstractC23461c navigateDeeplinkUri$default(NV0 nv0, String str, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                if ((i & 4) != 0) {
                    z2 = true;
                }
                return nv0.mo78299c(str, z, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateDeeplinkUri");
        }
    }

    /* renamed from: a */
    AbstractC24507p<AbstractC39181cW0> mo78301a(Intent intent);

    /* renamed from: b */
    AbstractC23461c mo78300b();

    /* renamed from: c */
    AbstractC23461c mo78299c(String str, boolean z, boolean z2);

    /* renamed from: d */
    AbstractC23461c mo78298d(AbstractC24507p<Pair<AbstractC39181cW0, Intent>> abstractC24507p, boolean z);

    /* renamed from: e */
    void mo78297e(Intent intent);
}
