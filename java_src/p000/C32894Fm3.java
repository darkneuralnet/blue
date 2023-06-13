package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001f\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LFm3;", "", "", "name", "", "options", "logicOperation", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "c", "getLogicOperation", "", "()Ljava/util/Map;", "properties", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fm3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32894Fm3 {

    /* renamed from: a */
    public final String f10106a;

    /* renamed from: b */
    public final List<String> f10107b;

    /* renamed from: c */
    public final String f10108c;

    public C32894Fm3(String name, List<String> options, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f10106a = name;
        this.f10107b = options;
        this.f10108c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C32894Fm3 copy$default(C32894Fm3 c32894Fm3, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c32894Fm3.f10106a;
        }
        if ((i & 2) != 0) {
            list = c32894Fm3.f10107b;
        }
        if ((i & 4) != 0) {
            str2 = c32894Fm3.f10108c;
        }
        return c32894Fm3.m106593a(str, list, str2);
    }

    /* renamed from: a */
    public final C32894Fm3 m106593a(String name, List<String> options, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(options, "options");
        return new C32894Fm3(name, options, str);
    }

    /* renamed from: b */
    public final Map<String, Object> m106592b() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("name", this.f10106a), TuplesKt.m28425to("options", this.f10107b), TuplesKt.m28425to("logic_operation", this.f10108c));
        return mapOf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32894Fm3) {
            C32894Fm3 c32894Fm3 = (C32894Fm3) obj;
            return Intrinsics.areEqual(this.f10106a, c32894Fm3.f10106a) && Intrinsics.areEqual(this.f10107b, c32894Fm3.f10107b) && Intrinsics.areEqual(this.f10108c, c32894Fm3.f10108c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f10106a.hashCode() * 31) + this.f10107b.hashCode()) * 31;
        String str = this.f10108c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f10106a;
        List<String> list = this.f10107b;
        String str2 = this.f10108c;
        return "OperatorMapFilter(name=" + str + ", options=" + list + ", logicOperation=" + str2 + ")";
    }

    public /* synthetic */ C32894Fm3(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2);
    }
}
