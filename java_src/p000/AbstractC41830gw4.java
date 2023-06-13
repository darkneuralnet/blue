package p000;

import com.google.android.gms.common.internal.Objects;
import java.util.EnumMap;
import java.util.Map;
/* renamed from: gw4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC41830gw4 {

    /* renamed from: d */
    public static final Map f84473d = new EnumMap(EnumC1755EB.class);

    /* renamed from: e */
    public static final Map f84474e = new EnumMap(EnumC1755EB.class);

    /* renamed from: a */
    public final String f84475a;

    /* renamed from: b */
    public final EnumC1755EB f84476b;

    /* renamed from: c */
    public final EnumC40377eV2 f84477c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC41830gw4)) {
            return false;
        }
        AbstractC41830gw4 abstractC41830gw4 = (AbstractC41830gw4) obj;
        if (Objects.equal(this.f84475a, abstractC41830gw4.f84475a) && Objects.equal(this.f84476b, abstractC41830gw4.f84476b) && Objects.equal(this.f84477c, abstractC41830gw4.f84477c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f84475a, this.f84476b, this.f84477c);
    }

    public String toString() {
        Ky9 m88267a = C35409Qf7.m88267a("RemoteModel");
        m88267a.m98001a("modelName", this.f84475a);
        m88267a.m98001a("baseModel", this.f84476b);
        m88267a.m98001a("modelType", this.f84477c);
        return m88267a.toString();
    }
}
