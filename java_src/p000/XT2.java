package p000;

import com.facebook.share.internal.C17296a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, m28432d2 = {"LXT2;", "", "", "name", "", "type", "", C17296a.f69688o, "", "Ljava/util/Map;", "calledMethods", "<init>", "()V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XT2 */
/* loaded from: classes.dex */
public class XT2 {

    /* renamed from: a */
    public final Map<String, Integer> f43285a = new HashMap();

    /* renamed from: a */
    public boolean m76972a(String name, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.f43285a.get(name);
        boolean z = false;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if ((i2 & i) != 0) {
            z = true;
        }
        this.f43285a.put(name, Integer.valueOf(i | i2));
        return !z;
    }
}
