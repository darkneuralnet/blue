package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0014\u0010\u0018R\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"LhW1;", "T", "", "", "title", "message", "", "startIcon", "endIcon", "value", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)LhW1;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "I", DateTokenConverter.CONVERTER_KEY, "()I", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hW1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42164hW1<T> {

    /* renamed from: a */
    public final String f85334a;

    /* renamed from: b */
    public final String f85335b;

    /* renamed from: c */
    public final int f85336c;

    /* renamed from: d */
    public final int f85337d;

    /* renamed from: e */
    public final T f85338e;

    public C42164hW1(String title, String str, int i, int i2, T t) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f85334a = title;
        this.f85335b = str;
        this.f85336c = i;
        this.f85337d = i2;
        this.f85338e = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C42164hW1 copy$default(C42164hW1 c42164hW1, String str, String str2, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            str = c42164hW1.f85334a;
        }
        if ((i3 & 2) != 0) {
            str2 = c42164hW1.f85335b;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = c42164hW1.f85336c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = c42164hW1.f85337d;
        }
        int i5 = i2;
        T t = obj;
        if ((i3 & 16) != 0) {
            t = c42164hW1.f85338e;
        }
        return c42164hW1.m36261a(str, str3, i4, i5, t);
    }

    /* renamed from: a */
    public final C42164hW1<T> m36261a(String title, String str, int i, int i2, T t) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new C42164hW1<>(title, str, i, i2, t);
    }

    /* renamed from: b */
    public final int m36260b() {
        return this.f85337d;
    }

    /* renamed from: c */
    public final String m36259c() {
        return this.f85335b;
    }

    /* renamed from: d */
    public final int m36258d() {
        return this.f85336c;
    }

    /* renamed from: e */
    public final String m36257e() {
        return this.f85334a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42164hW1) {
            C42164hW1 c42164hW1 = (C42164hW1) obj;
            return Intrinsics.areEqual(this.f85334a, c42164hW1.f85334a) && Intrinsics.areEqual(this.f85335b, c42164hW1.f85335b) && this.f85336c == c42164hW1.f85336c && this.f85337d == c42164hW1.f85337d && Intrinsics.areEqual(this.f85338e, c42164hW1.f85338e);
        }
        return false;
    }

    /* renamed from: f */
    public final T m36256f() {
        return this.f85338e;
    }

    public int hashCode() {
        int hashCode = this.f85334a.hashCode() * 31;
        String str = this.f85335b;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f85336c)) * 31) + Integer.hashCode(this.f85337d)) * 31;
        T t = this.f85338e;
        return hashCode2 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        String str = this.f85334a;
        String str2 = this.f85335b;
        int i = this.f85336c;
        int i2 = this.f85337d;
        T t = this.f85338e;
        return "IdentificationViewModel(title=" + str + ", message=" + str2 + ", startIcon=" + i + ", endIcon=" + i2 + ", value=" + t + ")";
    }
}
