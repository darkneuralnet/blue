package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.TokenPair;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'J:\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\u0014\b\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\rH'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H'J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¨\u0006\u0015"}, m28432d2 = {"LLp;", "", "Luh1;", "request", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/TokenPair;", "b", "", "authorization", C17296a.f69688o, "Lra1;", "location", "", "tags", "Lsa1;", "e", "LOh6;", "c", "LYy2;", DateTokenConverter.CONVERTER_KEY, "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Lp */
/* loaded from: classes2.dex */
public interface InterfaceC5093Lp {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Lp$a */
    /* loaded from: classes2.dex */
    public static final class C5094a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC23442F emailLogin$default(InterfaceC5093Lp interfaceC5093Lp, C48130ra1 c48130ra1, String str, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("email", c48130ra1.m15751b()));
                }
                return interfaceC5093Lp.m96322e(c48130ra1, str, map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: emailLogin");
        }
    }

    @AD3("api/v1/auth/refresh/token")
    /* renamed from: a */
    AbstractC23442F<HM4<TokenPair>> m96326a(@InterfaceC52701zH1("Authorization") String str);

    @AD3("api/v1/auth/exchange/token")
    /* renamed from: b */
    AbstractC23442F<HM4<TokenPair>> m96325b(@InterfaceC6404PY C49978uh1 c49978uh1);

    @AD3("api/v1/auth/magic-link/use")
    /* renamed from: c */
    AbstractC23442F<TokenPair> m96324c(@InterfaceC6404PY C34958Oh6 c34958Oh6);

    @AD3("/api/v1/auth/google")
    /* renamed from: d */
    AbstractC23442F<C48722sa1> m96323d(@InterfaceC6404PY C37447Yy2 c37447Yy2);

    @AD3("api/v1/auth/email")
    /* renamed from: e */
    AbstractC23442F<C48722sa1> m96322e(@InterfaceC6404PY C48130ra1 c48130ra1, @InterfaceC52701zH1("Location") String str, @InterfaceC51079wY5 Map<String, String> map);
}
