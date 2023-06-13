package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"Lmx5;", "LiN5;", "", "title", "body", "word", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sober_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mx5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45399mx5 extends AbstractC42680iN5 {

    /* renamed from: a */
    public final String f99140a;

    /* renamed from: b */
    public final String f99141b;

    /* renamed from: c */
    public final String f99142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45399mx5(String title, String body, String word) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(word, "word");
        this.f99140a = title;
        this.f99141b = body;
        this.f99142c = word;
    }

    public static /* synthetic */ C45399mx5 copy$default(C45399mx5 c45399mx5, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c45399mx5.f99140a;
        }
        if ((i & 2) != 0) {
            str2 = c45399mx5.f99141b;
        }
        if ((i & 4) != 0) {
            str3 = c45399mx5.f99142c;
        }
        return c45399mx5.m24629a(str, str2, str3);
    }

    /* renamed from: a */
    public final C45399mx5 m24629a(String title, String body, String word) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(word, "word");
        return new C45399mx5(title, body, word);
    }

    /* renamed from: b */
    public final String m24628b() {
        return this.f99141b;
    }

    /* renamed from: c */
    public final String m24627c() {
        return this.f99140a;
    }

    /* renamed from: d */
    public final String m24626d() {
        return this.f99142c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45399mx5) {
            C45399mx5 c45399mx5 = (C45399mx5) obj;
            return Intrinsics.areEqual(this.f99140a, c45399mx5.f99140a) && Intrinsics.areEqual(this.f99141b, c45399mx5.f99141b) && Intrinsics.areEqual(this.f99142c, c45399mx5.f99142c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f99140a.hashCode() * 31) + this.f99141b.hashCode()) * 31) + this.f99142c.hashCode();
    }

    public String toString() {
        String str = this.f99140a;
        String str2 = this.f99141b;
        String str3 = this.f99142c;
        return "Setup(title=" + str + ", body=" + str2 + ", word=" + str3 + ")";
    }
}
