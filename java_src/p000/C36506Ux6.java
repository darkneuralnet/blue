package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 JC\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006!"}, m28432d2 = {"LUx6;", "", "Lco/bird/android/model/User;", "user", "Lco/bird/android/model/Warehouse;", "warehouse", "suggestedWarehouse", "", "showBlockingOverlay", "", "error", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/User;", "e", "()Lco/bird/android/model/User;", "b", "Lco/bird/android/model/Warehouse;", "f", "()Lco/bird/android/model/Warehouse;", "c", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "<init>", "(Lco/bird/android/model/User;Lco/bird/android/model/Warehouse;Lco/bird/android/model/Warehouse;ZLjava/lang/Throwable;)V", "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ux6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36506Ux6 {

    /* renamed from: a */
    public final User f38319a;

    /* renamed from: b */
    public final Warehouse f38320b;

    /* renamed from: c */
    public final Warehouse f38321c;

    /* renamed from: d */
    public final boolean f38322d;

    /* renamed from: e */
    public final Throwable f38323e;

    public C36506Ux6() {
        this(null, null, null, false, null, 31, null);
    }

    public static /* synthetic */ C36506Ux6 copy$default(C36506Ux6 c36506Ux6, User user, Warehouse warehouse, Warehouse warehouse2, boolean z, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            user = c36506Ux6.f38319a;
        }
        if ((i & 2) != 0) {
            warehouse = c36506Ux6.f38320b;
        }
        Warehouse warehouse3 = warehouse;
        if ((i & 4) != 0) {
            warehouse2 = c36506Ux6.f38321c;
        }
        Warehouse warehouse4 = warehouse2;
        if ((i & 8) != 0) {
            z = c36506Ux6.f38322d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            th = c36506Ux6.f38323e;
        }
        return c36506Ux6.m80586a(user, warehouse3, warehouse4, z2, th);
    }

    /* renamed from: a */
    public final C36506Ux6 m80586a(User user, Warehouse warehouse, Warehouse warehouse2, boolean z, Throwable th) {
        return new C36506Ux6(user, warehouse, warehouse2, z, th);
    }

    /* renamed from: b */
    public final Throwable m80585b() {
        return this.f38323e;
    }

    /* renamed from: c */
    public final boolean m80584c() {
        return this.f38322d;
    }

    /* renamed from: d */
    public final Warehouse m80583d() {
        return this.f38321c;
    }

    /* renamed from: e */
    public final User m80582e() {
        return this.f38319a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36506Ux6) {
            C36506Ux6 c36506Ux6 = (C36506Ux6) obj;
            return Intrinsics.areEqual(this.f38319a, c36506Ux6.f38319a) && Intrinsics.areEqual(this.f38320b, c36506Ux6.f38320b) && Intrinsics.areEqual(this.f38321c, c36506Ux6.f38321c) && this.f38322d == c36506Ux6.f38322d && Intrinsics.areEqual(this.f38323e, c36506Ux6.f38323e);
        }
        return false;
    }

    /* renamed from: f */
    public final Warehouse m80581f() {
        return this.f38320b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        User user = this.f38319a;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        Warehouse warehouse = this.f38320b;
        int hashCode2 = (hashCode + (warehouse == null ? 0 : warehouse.hashCode())) * 31;
        Warehouse warehouse2 = this.f38321c;
        int hashCode3 = (hashCode2 + (warehouse2 == null ? 0 : warehouse2.hashCode())) * 31;
        boolean z = this.f38322d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        Throwable th = this.f38323e;
        return i2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        User user = this.f38319a;
        Warehouse warehouse = this.f38320b;
        Warehouse warehouse2 = this.f38321c;
        boolean z = this.f38322d;
        Throwable th = this.f38323e;
        return "WarehouseCheckState(user=" + user + ", warehouse=" + warehouse + ", suggestedWarehouse=" + warehouse2 + ", showBlockingOverlay=" + z + ", error=" + th + ")";
    }

    public C36506Ux6(User user, Warehouse warehouse, Warehouse warehouse2, boolean z, Throwable th) {
        this.f38319a = user;
        this.f38320b = warehouse;
        this.f38321c = warehouse2;
        this.f38322d = z;
        this.f38323e = th;
    }

    public /* synthetic */ C36506Ux6(User user, Warehouse warehouse, Warehouse warehouse2, boolean z, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user, (i & 2) != 0 ? null : warehouse, (i & 4) != 0 ? null : warehouse2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : th);
    }
}
