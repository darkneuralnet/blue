package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lne3;", "", "", "id", "title", "subtitle", "", "canAccept", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "e", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ne3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45800ne3 {

    /* renamed from: a */
    public final String f100267a;

    /* renamed from: b */
    public final String f100268b;

    /* renamed from: c */
    public final String f100269c;

    /* renamed from: d */
    public final boolean f100270d;

    public C45800ne3(String id, String title, String str, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f100267a = id;
        this.f100268b = title;
        this.f100269c = str;
        this.f100270d = z;
    }

    public static /* synthetic */ C45800ne3 copy$default(C45800ne3 c45800ne3, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c45800ne3.f100267a;
        }
        if ((i & 2) != 0) {
            str2 = c45800ne3.f100268b;
        }
        if ((i & 4) != 0) {
            str3 = c45800ne3.f100269c;
        }
        if ((i & 8) != 0) {
            z = c45800ne3.f100270d;
        }
        return c45800ne3.m23371a(str, str2, str3, z);
    }

    /* renamed from: a */
    public final C45800ne3 m23371a(String id, String title, String str, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new C45800ne3(id, title, str, z);
    }

    /* renamed from: b */
    public final boolean m23370b() {
        return this.f100270d;
    }

    /* renamed from: c */
    public final String m23369c() {
        return this.f100267a;
    }

    /* renamed from: d */
    public final String m23368d() {
        return this.f100269c;
    }

    /* renamed from: e */
    public final String m23367e() {
        return this.f100268b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45800ne3) {
            C45800ne3 c45800ne3 = (C45800ne3) obj;
            return Intrinsics.areEqual(this.f100267a, c45800ne3.f100267a) && Intrinsics.areEqual(this.f100268b, c45800ne3.f100268b) && Intrinsics.areEqual(this.f100269c, c45800ne3.f100269c) && this.f100270d == c45800ne3.f100270d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f100267a.hashCode() * 31) + this.f100268b.hashCode()) * 31;
        String str = this.f100269c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f100270d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f100267a;
        String str2 = this.f100268b;
        String str3 = this.f100269c;
        boolean z = this.f100270d;
        return "Offer(id=" + str + ", title=" + str2 + ", subtitle=" + str3 + ", canAccept=" + z + ")";
    }
}
