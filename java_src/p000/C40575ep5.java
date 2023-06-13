package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lep5;", "", "", "title", "quantity", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ep5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40575ep5 {

    /* renamed from: a */
    public final String f78954a;

    /* renamed from: b */
    public final String f78955b;

    public C40575ep5(String title, String quantity) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f78954a = title;
        this.f78955b = quantity;
    }

    public static /* synthetic */ C40575ep5 copy$default(C40575ep5 c40575ep5, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c40575ep5.f78954a;
        }
        if ((i & 2) != 0) {
            str2 = c40575ep5.f78955b;
        }
        return c40575ep5.m42510a(str, str2);
    }

    /* renamed from: a */
    public final C40575ep5 m42510a(String title, String quantity) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return new C40575ep5(title, quantity);
    }

    /* renamed from: b */
    public final String m42509b() {
        return this.f78955b;
    }

    /* renamed from: c */
    public final String m42508c() {
        return this.f78954a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40575ep5) {
            C40575ep5 c40575ep5 = (C40575ep5) obj;
            return Intrinsics.areEqual(this.f78954a, c40575ep5.f78954a) && Intrinsics.areEqual(this.f78955b, c40575ep5.f78955b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f78954a.hashCode() * 31) + this.f78955b.hashCode();
    }

    public String toString() {
        String str = this.f78954a;
        String str2 = this.f78955b;
        return "ScrapOrderVehiclesHeaderViewModel(title=" + str + ", quantity=" + str2 + ")";
    }
}
