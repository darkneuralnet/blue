package p000;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.Map;
/* renamed from: U06 */
/* loaded from: classes2.dex */
public class U06 {

    /* renamed from: a */
    public final Map<String, String> f36610a = new HashMap();

    /* renamed from: d */
    public boolean f36613d = true;

    /* renamed from: b */
    public final LottieAnimationView f36611b = null;

    /* renamed from: c */
    public final RD2 f36612c = null;

    /* renamed from: a */
    public String m82171a(String str) {
        return str;
    }

    /* renamed from: b */
    public String m82170b(String str, String str2) {
        return m82171a(str2);
    }

    /* renamed from: c */
    public final String m82169c(String str, String str2) {
        if (this.f36613d && this.f36610a.containsKey(str2)) {
            return this.f36610a.get(str2);
        }
        String m82170b = m82170b(str, str2);
        if (this.f36613d) {
            this.f36610a.put(str2, m82170b);
        }
        return m82170b;
    }
}
