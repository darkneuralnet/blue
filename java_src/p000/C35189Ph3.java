package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"LPh3;", "LQh3;", "", "", "isEmpty", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "", "toString", C17296a.f69688o, "F", "_start", "b", "_endExclusive", "()Ljava/lang/Float;", "start", "endExclusive", "<init>", "(FF)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ph3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35189Ph3 implements InterfaceC35423Qh3<Float> {

    /* renamed from: a */
    public final float f28910a;

    /* renamed from: b */
    public final float f28911b;

    public C35189Ph3(float f, float f2) {
        this.f28910a = f;
        this.f28911b = f2;
    }

    @Override // p000.InterfaceC35423Qh3
    /* renamed from: a */
    public Float getEndExclusive() {
        return Float.valueOf(this.f28911b);
    }

    @Override // p000.InterfaceC35423Qh3
    /* renamed from: b */
    public Float getStart() {
        return Float.valueOf(this.f28910a);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C35189Ph3)) {
            return false;
        }
        if (!isEmpty() || !((C35189Ph3) obj).isEmpty()) {
            C35189Ph3 c35189Ph3 = (C35189Ph3) obj;
            if (this.f28910a == c35189Ph3.f28910a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.f28911b == c35189Ph3.f28911b) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f28910a) * 31) + Float.hashCode(this.f28911b);
    }

    @Override // p000.InterfaceC35423Qh3
    public boolean isEmpty() {
        return this.f28910a >= this.f28911b;
    }

    public String toString() {
        return this.f28910a + "..<" + this.f28911b;
    }
}
