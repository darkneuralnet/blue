package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001a\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0000H&J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, m28432d2 = {"Lb66;", "", "", "name", "value", "b", "", "incrementBy", C17296a.f69688o, "start", "", "stop", "co.bird.android.lib.performance.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: b66  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC38356b66 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: b66$a */
    /* loaded from: classes3.dex */
    public static final class C12294a {
        public static /* synthetic */ InterfaceC38356b66 incrementMetric$default(InterfaceC38356b66 interfaceC38356b66, String str, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    j = 1;
                }
                return interfaceC38356b66.mo64962a(str, j);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementMetric");
        }
    }

    /* renamed from: a */
    InterfaceC38356b66 mo64962a(String str, long j);

    /* renamed from: b */
    InterfaceC38356b66 mo64961b(String str, String str2);

    InterfaceC38356b66 start();

    void stop();
}
