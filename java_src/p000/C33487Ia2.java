package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LIa2;", "Value", "", "", "position", "value", C17296a.f69688o, "(JLjava/lang/Object;)LIa2;", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "J", "b", "()J", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "<init>", "(JLjava/lang/Object;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ia2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33487Ia2<Value> {

    /* renamed from: a */
    public final long f15912a;

    /* renamed from: b */
    public final Value f15913b;

    public C33487Ia2(long j, Value value) {
        this.f15912a = j;
        this.f15913b = value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C33487Ia2 copy$default(C33487Ia2 c33487Ia2, long j, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            j = c33487Ia2.f15912a;
        }
        if ((i & 2) != 0) {
            obj = c33487Ia2.f15913b;
        }
        return c33487Ia2.m101905a(j, obj);
    }

    /* renamed from: a */
    public final C33487Ia2<Value> m101905a(long j, Value value) {
        return new C33487Ia2<>(j, value);
    }

    /* renamed from: b */
    public final long m101904b() {
        return this.f15912a;
    }

    /* renamed from: c */
    public final Value m101903c() {
        return this.f15913b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33487Ia2) {
            C33487Ia2 c33487Ia2 = (C33487Ia2) obj;
            return this.f15912a == c33487Ia2.f15912a && Intrinsics.areEqual(this.f15913b, c33487Ia2.f15913b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f15912a) * 31;
        Value value = this.f15913b;
        return hashCode + (value == null ? 0 : value.hashCode());
    }

    public String toString() {
        long j = this.f15912a;
        Value value = this.f15913b;
        return "Item(position=" + j + ", value=" + value + ")";
    }
}
