package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006H&¨\u0006\n"}, m28432d2 = {"LLI4;", "", "", "path", "", "Lkotlin/Pair;", "Lcom/github/kittinunf/fuel/core/Parameters;", "parameters", "LpI4;", C17296a.f69688o, "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: LI4 */
/* loaded from: classes5.dex */
public interface LI4 {

    @Metadata(m28434bv = {1, 0, 3}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: LI4$a */
    /* loaded from: classes5.dex */
    public static final class C4802a {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ InterfaceC46785pI4 m97355a(LI4 li4, String str, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    list = null;
                }
                return li4.mo16330a(str, list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
    }

    /* renamed from: a */
    InterfaceC46785pI4 mo16330a(String str, List<? extends Pair<String, ? extends Object>> list);
}
