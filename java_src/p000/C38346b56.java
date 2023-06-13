package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fJH\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m28432d2 = {"Lb56;", "", "", "titleIcon", "", "title", "titleBackgroundColor", "description", "", "zendeskArticleId", C17296a.f69688o, "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;)Lb56;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "I", DateTokenConverter.CONVERTER_KEY, "()I", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: b56  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38346b56 {

    /* renamed from: a */
    public final Integer f56915a;

    /* renamed from: b */
    public final String f56916b;

    /* renamed from: c */
    public final int f56917c;

    /* renamed from: d */
    public final String f56918d;

    /* renamed from: e */
    public final Long f56919e;

    public C38346b56(Integer num, String str, int i, String description, Long l) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f56915a = num;
        this.f56916b = str;
        this.f56917c = i;
        this.f56918d = description;
        this.f56919e = l;
    }

    public static /* synthetic */ C38346b56 copy$default(C38346b56 c38346b56, Integer num, String str, int i, String str2, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = c38346b56.f56915a;
        }
        if ((i2 & 2) != 0) {
            str = c38346b56.f56916b;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            i = c38346b56.f56917c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = c38346b56.f56918d;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            l = c38346b56.f56919e;
        }
        return c38346b56.m64984a(num, str3, i3, str4, l);
    }

    /* renamed from: a */
    public final C38346b56 m64984a(Integer num, String str, int i, String description, Long l) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new C38346b56(num, str, i, description, l);
    }

    /* renamed from: b */
    public final String m64983b() {
        return this.f56918d;
    }

    /* renamed from: c */
    public final String m64982c() {
        return this.f56916b;
    }

    /* renamed from: d */
    public final int m64981d() {
        return this.f56917c;
    }

    /* renamed from: e */
    public final Integer m64980e() {
        return this.f56915a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38346b56) {
            C38346b56 c38346b56 = (C38346b56) obj;
            return Intrinsics.areEqual(this.f56915a, c38346b56.f56915a) && Intrinsics.areEqual(this.f56916b, c38346b56.f56916b) && this.f56917c == c38346b56.f56917c && Intrinsics.areEqual(this.f56918d, c38346b56.f56918d) && Intrinsics.areEqual(this.f56919e, c38346b56.f56919e);
        }
        return false;
    }

    /* renamed from: f */
    public final Long m64979f() {
        return this.f56919e;
    }

    public int hashCode() {
        Integer num = this.f56915a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f56916b;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f56917c)) * 31) + this.f56918d.hashCode()) * 31;
        Long l = this.f56919e;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.f56915a;
        String str = this.f56916b;
        int i = this.f56917c;
        String str2 = this.f56918d;
        Long l = this.f56919e;
        return "TitleMessageViewModel(titleIcon=" + num + ", title=" + str + ", titleBackgroundColor=" + i + ", description=" + str2 + ", zendeskArticleId=" + l + ")";
    }

    public /* synthetic */ C38346b56(Integer num, String str, int i, String str2, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : str, i, str2, (i2 & 16) != 0 ? null : l);
    }
}
