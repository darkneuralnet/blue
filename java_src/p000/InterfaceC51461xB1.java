package p000;

import android.net.Uri;
import co.bird.android.model.ZigZagVehiclesResponse;
import com.amazonaws.http.HttpHeader;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¨\u0006\t"}, m28432d2 = {"LxB1;", "", "", "url", "", "headers", "Lio/reactivex/F;", "Lco/bird/android/model/ZigZagVehiclesResponse;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xB1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC51461xB1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xB1$a */
    /* loaded from: classes4.dex */
    public static final class C30058a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC23442F getZigZagVehicles$default(InterfaceC51461xB1 interfaceC51461xB1, String str, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    Pair[] pairArr = new Pair[3];
                    pairArr[0] = TuplesKt.m28425to("Accept", "*/*");
                    Uri parse = Uri.parse(str);
                    pairArr[1] = TuplesKt.m28425to(HttpHeader.HOST, (parse == null || (r4 = parse.getHost()) == null) ? "" : "");
                    pairArr[2] = TuplesKt.m28425to("User-Agent", "curl/7.64.1");
                    map = MapsKt__MapsKt.mapOf(pairArr);
                }
                return interfaceC51461xB1.m5739a(str, map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getZigZagVehicles");
        }
    }

    @NA1
    /* renamed from: a */
    AbstractC23442F<ZigZagVehiclesResponse> m5739a(@InterfaceC33770Jf6 String str, @DH1 Map<String, String> map);
}
