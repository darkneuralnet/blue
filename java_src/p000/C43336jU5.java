package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"LjU5;", "", "", "title", "detail", "hint", "", "editable", "LkU5;", "type", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "LkU5;", "f", "()LkU5;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkU5;)V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jU5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43336jU5 {

    /* renamed from: a */
    public final String f92770a;

    /* renamed from: b */
    public final String f92771b;

    /* renamed from: c */
    public final String f92772c;

    /* renamed from: d */
    public final boolean f92773d;

    /* renamed from: e */
    public final EnumC43929kU5 f92774e;

    public C43336jU5(String str, String str2, String str3, boolean z, EnumC43929kU5 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f92770a = str;
        this.f92771b = str2;
        this.f92772c = str3;
        this.f92773d = z;
        this.f92774e = type;
    }

    public static /* synthetic */ C43336jU5 copy$default(C43336jU5 c43336jU5, String str, String str2, String str3, boolean z, EnumC43929kU5 enumC43929kU5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c43336jU5.f92770a;
        }
        if ((i & 2) != 0) {
            str2 = c43336jU5.f92771b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c43336jU5.f92772c;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = c43336jU5.f92773d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            enumC43929kU5 = c43336jU5.f92774e;
        }
        return c43336jU5.m30573a(str, str4, str5, z2, enumC43929kU5);
    }

    /* renamed from: a */
    public final C43336jU5 m30573a(String str, String str2, String str3, boolean z, EnumC43929kU5 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new C43336jU5(str, str2, str3, z, type);
    }

    /* renamed from: b */
    public final String m30572b() {
        return this.f92771b;
    }

    /* renamed from: c */
    public final boolean m30571c() {
        return this.f92773d;
    }

    /* renamed from: d */
    public final String m30570d() {
        return this.f92772c;
    }

    /* renamed from: e */
    public final String m30569e() {
        return this.f92770a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43336jU5) {
            C43336jU5 c43336jU5 = (C43336jU5) obj;
            return Intrinsics.areEqual(this.f92770a, c43336jU5.f92770a) && Intrinsics.areEqual(this.f92771b, c43336jU5.f92771b) && Intrinsics.areEqual(this.f92772c, c43336jU5.f92772c) && this.f92773d == c43336jU5.f92773d && this.f92774e == c43336jU5.f92774e;
        }
        return false;
    }

    /* renamed from: f */
    public final EnumC43929kU5 m30568f() {
        return this.f92774e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f92770a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f92771b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92772c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f92773d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode3 + i) * 31) + this.f92774e.hashCode();
    }

    public String toString() {
        String str = this.f92770a;
        String str2 = this.f92771b;
        String str3 = this.f92772c;
        boolean z = this.f92773d;
        EnumC43929kU5 enumC43929kU5 = this.f92774e;
        return "SuggestNestDetail(title=" + str + ", detail=" + str2 + ", hint=" + str3 + ", editable=" + z + ", type=" + enumC43929kU5 + ")";
    }
}
