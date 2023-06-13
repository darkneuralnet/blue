package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LuA5;", "Lrv1;", "", "inbound", "", "destinationWarehouseName", "destinationFleetName", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uA5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49678uA5 extends AbstractC48340rv1 {

    /* renamed from: a */
    public final boolean f111870a;

    /* renamed from: b */
    public final String f111871b;

    /* renamed from: c */
    public final String f111872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49678uA5(boolean z, String destinationWarehouseName, String destinationFleetName) {
        super(null);
        Intrinsics.checkNotNullParameter(destinationWarehouseName, "destinationWarehouseName");
        Intrinsics.checkNotNullParameter(destinationFleetName, "destinationFleetName");
        this.f111870a = z;
        this.f111871b = destinationWarehouseName;
        this.f111872c = destinationFleetName;
    }

    public static /* synthetic */ C49678uA5 copy$default(C49678uA5 c49678uA5, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c49678uA5.f111870a;
        }
        if ((i & 2) != 0) {
            str = c49678uA5.f111871b;
        }
        if ((i & 4) != 0) {
            str2 = c49678uA5.f111872c;
        }
        return c49678uA5.m10709a(z, str, str2);
    }

    /* renamed from: a */
    public final C49678uA5 m10709a(boolean z, String destinationWarehouseName, String destinationFleetName) {
        Intrinsics.checkNotNullParameter(destinationWarehouseName, "destinationWarehouseName");
        Intrinsics.checkNotNullParameter(destinationFleetName, "destinationFleetName");
        return new C49678uA5(z, destinationWarehouseName, destinationFleetName);
    }

    /* renamed from: b */
    public final String m10708b() {
        return this.f111872c;
    }

    /* renamed from: c */
    public final String m10707c() {
        return this.f111871b;
    }

    /* renamed from: d */
    public final boolean m10706d() {
        return this.f111870a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49678uA5) {
            C49678uA5 c49678uA5 = (C49678uA5) obj;
            return this.f111870a == c49678uA5.f111870a && Intrinsics.areEqual(this.f111871b, c49678uA5.f111871b) && Intrinsics.areEqual(this.f111872c, c49678uA5.f111872c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.f111870a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.f111871b.hashCode()) * 31) + this.f111872c.hashCode();
    }

    public String toString() {
        boolean z = this.f111870a;
        String str = this.f111871b;
        String str2 = this.f111872c;
        return "ShowSuccessDialog(inbound=" + z + ", destinationWarehouseName=" + str + ", destinationFleetName=" + str2 + ")";
    }
}
