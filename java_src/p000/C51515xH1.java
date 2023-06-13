package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0019"}, m28432d2 = {"LxH1;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "getValue", "value", "c", "getComment", "comment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LDN1;", "header", "(LDN1;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xH1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51515xH1 {
    @InterfaceC41208ft5("name")

    /* renamed from: a */
    public final String f117291a;
    @InterfaceC41208ft5("value")

    /* renamed from: b */
    public final String f117292b;
    @InterfaceC41208ft5("comment")

    /* renamed from: c */
    public final String f117293c;

    public C51515xH1(String name, String value, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f117291a = name;
        this.f117292b = value;
        this.f117293c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C51515xH1) {
            C51515xH1 c51515xH1 = (C51515xH1) obj;
            return Intrinsics.areEqual(this.f117291a, c51515xH1.f117291a) && Intrinsics.areEqual(this.f117292b, c51515xH1.f117292b) && Intrinsics.areEqual(this.f117293c, c51515xH1.f117293c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f117291a.hashCode() * 31) + this.f117292b.hashCode()) * 31;
        String str = this.f117293c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f117291a;
        String str2 = this.f117292b;
        String str3 = this.f117293c;
        return "Header(name=" + str + ", value=" + str2 + ", comment=" + str3 + ")";
    }

    public /* synthetic */ C51515xH1(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51515xH1(DN1 header) {
        this(header.m110556a(), header.m110555b(), null, 4, null);
        Intrinsics.checkNotNullParameter(header, "header");
    }
}
