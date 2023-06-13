package p000;
/* renamed from: Vt */
/* loaded from: classes5.dex */
public final class C8804Vt extends AbstractC43900kR3 {

    /* renamed from: a */
    public final long f39873a;

    /* renamed from: b */
    public final T96 f39874b;

    /* renamed from: c */
    public final AbstractC33774Jg1 f39875c;

    public C8804Vt(long j, T96 t96, AbstractC33774Jg1 abstractC33774Jg1) {
        this.f39873a = j;
        if (t96 != null) {
            this.f39874b = t96;
            if (abstractC33774Jg1 != null) {
                this.f39875c = abstractC33774Jg1;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // p000.AbstractC43900kR3
    /* renamed from: b */
    public AbstractC33774Jg1 mo28961b() {
        return this.f39875c;
    }

    @Override // p000.AbstractC43900kR3
    /* renamed from: c */
    public long mo28960c() {
        return this.f39873a;
    }

    @Override // p000.AbstractC43900kR3
    /* renamed from: d */
    public T96 mo28959d() {
        return this.f39874b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC43900kR3)) {
            return false;
        }
        AbstractC43900kR3 abstractC43900kR3 = (AbstractC43900kR3) obj;
        if (this.f39873a == abstractC43900kR3.mo28960c() && this.f39874b.equals(abstractC43900kR3.mo28959d()) && this.f39875c.equals(abstractC43900kR3.mo28961b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f39873a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f39874b.hashCode()) * 1000003) ^ this.f39875c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f39873a + ", transportContext=" + this.f39874b + ", event=" + this.f39875c + "}";
    }
}
