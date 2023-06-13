package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Ldh6;", "", "", "restartProcess", "Lio/reactivex/c;", C17296a.f69688o, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dh6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC39904dh6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dh6$a */
    /* loaded from: classes2.dex */
    public static final class C19843a {
        public static /* synthetic */ AbstractC23461c logout$default(InterfaceC39904dh6 interfaceC39904dh6, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return interfaceC39904dh6.mo28634a(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logout");
        }
    }

    /* renamed from: a */
    AbstractC23461c mo28634a(boolean z);
}
