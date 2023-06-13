package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u0000 \u00162\u00020\u0001:\u0001\tB#\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lad4;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "getValue", "value", "c", "getComment", "comment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ad4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38065ad4 {

    /* renamed from: d */
    public static final C10777a f50831d = new C10777a(null);
    @InterfaceC41208ft5("name")

    /* renamed from: a */
    public final String f50832a;
    @InterfaceC41208ft5("value")

    /* renamed from: b */
    public final String f50833b;
    @InterfaceC41208ft5("comment")

    /* renamed from: c */
    public final String f50834c;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, m28432d2 = {"Lad4$a;", "", "Lokhttp3/HttpUrl;", "url", "", "Lad4;", C17296a.f69688o, "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ad4$a */
    /* loaded from: classes5.dex */
    public static final class C10777a {
        public /* synthetic */ C10777a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List<C38065ad4> m70994a(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            int querySize = url.querySize();
            ArrayList arrayList = new ArrayList(querySize);
            for (int i = 0; i < querySize; i++) {
                String queryParameterName = url.queryParameterName(i);
                String queryParameterValue = url.queryParameterValue(i);
                if (queryParameterValue == null) {
                    queryParameterValue = "";
                }
                arrayList.add(new C38065ad4(queryParameterName, queryParameterValue, null, 4, null));
            }
            return arrayList;
        }

        private C10777a() {
        }
    }

    public C38065ad4(String name, String value, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f50832a = name;
        this.f50833b = value;
        this.f50834c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38065ad4) {
            C38065ad4 c38065ad4 = (C38065ad4) obj;
            return Intrinsics.areEqual(this.f50832a, c38065ad4.f50832a) && Intrinsics.areEqual(this.f50833b, c38065ad4.f50833b) && Intrinsics.areEqual(this.f50834c, c38065ad4.f50834c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f50832a.hashCode() * 31) + this.f50833b.hashCode()) * 31;
        String str = this.f50834c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f50832a;
        String str2 = this.f50833b;
        String str3 = this.f50834c;
        return "QueryString(name=" + str + ", value=" + str2 + ", comment=" + str3 + ")";
    }

    public /* synthetic */ C38065ad4(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
