package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LxT5;", "Lk02;", "", "title", "message", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xT5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51627xT5 extends AbstractC43646k02 {

    /* renamed from: a */
    public final String f117642a;

    /* renamed from: b */
    public final String f117643b;

    public C51627xT5(String str, String str2) {
        super(null);
        this.f117642a = str;
        this.f117643b = str2;
    }

    public static /* synthetic */ C51627xT5 copy$default(C51627xT5 c51627xT5, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c51627xT5.f117642a;
        }
        if ((i & 2) != 0) {
            str2 = c51627xT5.f117643b;
        }
        return c51627xT5.m5239a(str, str2);
    }

    /* renamed from: a */
    public final C51627xT5 m5239a(String str, String str2) {
        return new C51627xT5(str, str2);
    }

    /* renamed from: b */
    public final String m5238b() {
        return this.f117643b;
    }

    /* renamed from: c */
    public final String m5237c() {
        return this.f117642a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C51627xT5) {
            C51627xT5 c51627xT5 = (C51627xT5) obj;
            return Intrinsics.areEqual(this.f117642a, c51627xT5.f117642a) && Intrinsics.areEqual(this.f117643b, c51627xT5.f117643b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f117642a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117643b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f117642a;
        String str2 = this.f117643b;
        return "Success(title=" + str + ", message=" + str2 + ")";
    }
}
