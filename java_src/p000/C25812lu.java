package p000;

import java.util.List;
import p000.YV5;
/* renamed from: lu */
/* loaded from: classes.dex */
public final class C25812lu extends YV5.AbstractC9794b {

    /* renamed from: a */
    public final MV5 f96874a;

    /* renamed from: b */
    public final List<YV5.AbstractC9796d> f96875b;

    public C25812lu(MV5 mv5, List<YV5.AbstractC9796d> list) {
        if (mv5 != null) {
            this.f96874a = mv5;
            if (list != null) {
                this.f96875b = list;
                return;
            }
            throw new NullPointerException("Null outConfigs");
        }
        throw new NullPointerException("Null surfaceEdge");
    }

    @Override // p000.YV5.AbstractC9794b
    /* renamed from: a */
    public List<YV5.AbstractC9796d> mo26698a() {
        return this.f96875b;
    }

    @Override // p000.YV5.AbstractC9794b
    /* renamed from: b */
    public MV5 mo26697b() {
        return this.f96874a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof YV5.AbstractC9794b)) {
            return false;
        }
        YV5.AbstractC9794b abstractC9794b = (YV5.AbstractC9794b) obj;
        if (this.f96874a.equals(abstractC9794b.mo26697b()) && this.f96875b.equals(abstractC9794b.mo26698a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f96874a.hashCode() ^ 1000003) * 1000003) ^ this.f96875b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f96874a + ", outConfigs=" + this.f96875b + "}";
    }
}
