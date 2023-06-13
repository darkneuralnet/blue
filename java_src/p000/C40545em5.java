package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lem5;", "", "", Entry.TYPE_TEXT, "original", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Object;", "getOriginal", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "core-basemvp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: em5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40545em5 {

    /* renamed from: a */
    public final String f78844a;

    /* renamed from: b */
    public final Object f78845b;

    public C40545em5(String text, Object obj) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f78844a = text;
        this.f78845b = obj;
    }

    public static /* synthetic */ C40545em5 copy$default(C40545em5 c40545em5, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = c40545em5.f78844a;
        }
        if ((i & 2) != 0) {
            obj = c40545em5.f78845b;
        }
        return c40545em5.m42566a(str, obj);
    }

    /* renamed from: a */
    public final C40545em5 m42566a(String text, Object obj) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new C40545em5(text, obj);
    }

    /* renamed from: b */
    public final String m42565b() {
        return this.f78844a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40545em5) {
            C40545em5 c40545em5 = (C40545em5) obj;
            return Intrinsics.areEqual(this.f78844a, c40545em5.f78844a) && Intrinsics.areEqual(this.f78845b, c40545em5.f78845b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f78844a.hashCode() * 31;
        Object obj = this.f78845b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        String str = this.f78844a;
        Object obj = this.f78845b;
        return "ScannerResult(text=" + str + ", original=" + obj + ")";
    }

    public /* synthetic */ C40545em5(String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj);
    }
}
