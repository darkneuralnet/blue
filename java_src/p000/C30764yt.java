package p000;
/* renamed from: yt */
/* loaded from: classes5.dex */
public final class C30764yt<T> extends AbstractC52339yg1<T> {

    /* renamed from: a */
    public final Integer f120362a;

    /* renamed from: b */
    public final T f120363b;

    /* renamed from: c */
    public final N24 f120364c;

    public C30764yt(Integer num, T t, N24 n24) {
        this.f120362a = num;
        if (t != null) {
            this.f120363b = t;
            if (n24 != null) {
                this.f120364c = n24;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // p000.AbstractC52339yg1
    /* renamed from: a */
    public Integer mo2340a() {
        return this.f120362a;
    }

    @Override // p000.AbstractC52339yg1
    /* renamed from: b */
    public T mo2339b() {
        return this.f120363b;
    }

    @Override // p000.AbstractC52339yg1
    /* renamed from: c */
    public N24 mo2338c() {
        return this.f120364c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC52339yg1)) {
            return false;
        }
        AbstractC52339yg1 abstractC52339yg1 = (AbstractC52339yg1) obj;
        Integer num = this.f120362a;
        if (num != null ? num.equals(abstractC52339yg1.mo2340a()) : abstractC52339yg1.mo2340a() == null) {
            if (this.f120363b.equals(abstractC52339yg1.mo2339b()) && this.f120364c.equals(abstractC52339yg1.mo2338c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f120362a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f120363b.hashCode()) * 1000003) ^ this.f120364c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f120362a + ", payload=" + this.f120363b + ", priority=" + this.f120364c + "}";
    }
}
