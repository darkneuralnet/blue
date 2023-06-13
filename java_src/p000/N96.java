package p000;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* renamed from: N96 */
/* loaded from: classes.dex */
public class N96 {

    /* renamed from: b */
    public View f24200b;

    /* renamed from: a */
    public final Map<String, Object> f24199a = new HashMap();

    /* renamed from: c */
    public final ArrayList<Transition> f24201c = new ArrayList<>();

    @Deprecated
    public N96() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof N96) {
            N96 n96 = (N96) obj;
            if (this.f24200b == n96.f24200b && this.f24199a.equals(n96.f24199a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f24200b.hashCode() * 31) + this.f24199a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f24200b + "\n") + "    values:";
        for (String str2 : this.f24199a.keySet()) {
            str = str + "    " + str2 + ": " + this.f24199a.get(str2) + "\n";
        }
        return str;
    }

    public N96(View view) {
        this.f24200b = view;
    }
}
