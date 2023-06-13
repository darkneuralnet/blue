package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"Lhs4;", "", "", "title", "amount", "Lis4;", "type", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lis4;", DateTokenConverter.CONVERTER_KEY, "()Lis4;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lis4;)V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hs4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42383hs4 {

    /* renamed from: a */
    public final String f86037a;

    /* renamed from: b */
    public final String f86038b;

    /* renamed from: c */
    public final EnumC42976is4 f86039c;

    public C42383hs4(String title, String amount, EnumC42976is4 type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f86037a = title;
        this.f86038b = amount;
        this.f86039c = type;
    }

    public static /* synthetic */ C42383hs4 copy$default(C42383hs4 c42383hs4, String str, String str2, EnumC42976is4 enumC42976is4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c42383hs4.f86037a;
        }
        if ((i & 2) != 0) {
            str2 = c42383hs4.f86038b;
        }
        if ((i & 4) != 0) {
            enumC42976is4 = c42383hs4.f86039c;
        }
        return c42383hs4.m35687a(str, str2, enumC42976is4);
    }

    /* renamed from: a */
    public final C42383hs4 m35687a(String title, String amount, EnumC42976is4 type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type, "type");
        return new C42383hs4(title, amount, type);
    }

    /* renamed from: b */
    public final String m35686b() {
        return this.f86038b;
    }

    /* renamed from: c */
    public final String m35685c() {
        return this.f86037a;
    }

    /* renamed from: d */
    public final EnumC42976is4 m35684d() {
        return this.f86039c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42383hs4) {
            C42383hs4 c42383hs4 = (C42383hs4) obj;
            return Intrinsics.areEqual(this.f86037a, c42383hs4.f86037a) && Intrinsics.areEqual(this.f86038b, c42383hs4.f86038b) && this.f86039c == c42383hs4.f86039c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f86037a.hashCode() * 31) + this.f86038b.hashCode()) * 31) + this.f86039c.hashCode();
    }

    public String toString() {
        String str = this.f86037a;
        String str2 = this.f86038b;
        EnumC42976is4 enumC42976is4 = this.f86039c;
        return "ReceiptItem(title=" + str + ", amount=" + str2 + ", type=" + enumC42976is4 + ")";
    }
}
