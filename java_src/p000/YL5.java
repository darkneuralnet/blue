package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0019"}, m28432d2 = {"LYL5;", "", "", "title", "body", "", "imageResId", "metadata", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)LYL5;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YL5 */
/* loaded from: classes2.dex */
public final class YL5 {

    /* renamed from: a */
    public final String f45775a;

    /* renamed from: b */
    public final String f45776b;

    /* renamed from: c */
    public final Integer f45777c;

    /* renamed from: d */
    public final String f45778d;

    public YL5(String title, String body, Integer num, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f45775a = title;
        this.f45776b = body;
        this.f45777c = num;
        this.f45778d = str;
    }

    public static /* synthetic */ YL5 copy$default(YL5 yl5, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yl5.f45775a;
        }
        if ((i & 2) != 0) {
            str2 = yl5.f45776b;
        }
        if ((i & 4) != 0) {
            num = yl5.f45777c;
        }
        if ((i & 8) != 0) {
            str3 = yl5.f45778d;
        }
        return yl5.m75151a(str, str2, num, str3);
    }

    /* renamed from: a */
    public final YL5 m75151a(String title, String body, Integer num, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new YL5(title, body, num, str);
    }

    /* renamed from: b */
    public final String m75150b() {
        return this.f45776b;
    }

    /* renamed from: c */
    public final Integer m75149c() {
        return this.f45777c;
    }

    /* renamed from: d */
    public final String m75148d() {
        return this.f45778d;
    }

    /* renamed from: e */
    public final String m75147e() {
        return this.f45775a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YL5) {
            YL5 yl5 = (YL5) obj;
            return Intrinsics.areEqual(this.f45775a, yl5.f45775a) && Intrinsics.areEqual(this.f45776b, yl5.f45776b) && Intrinsics.areEqual(this.f45777c, yl5.f45777c) && Intrinsics.areEqual(this.f45778d, yl5.f45778d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f45775a.hashCode() * 31) + this.f45776b.hashCode()) * 31;
        Integer num = this.f45777c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f45778d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.f45775a;
        String str2 = this.f45776b;
        Integer num = this.f45777c;
        String str3 = this.f45778d;
        return "SmartlockViewModel(title=" + str + ", body=" + str2 + ", imageResId=" + num + ", metadata=" + str3 + ")";
    }

    public /* synthetic */ YL5(String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
    }
}
