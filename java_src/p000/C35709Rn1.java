package p000;
/* renamed from: Rn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35709Rn1 implements InterfaceC35475Qn1 {

    /* renamed from: a */
    public final String f32608a;

    /* renamed from: b */
    public final int f32609b;

    public C35709Rn1(String str, int i) {
        this.f32608a = str;
        this.f32609b = i;
    }

    @Override // p000.InterfaceC35475Qn1
    /* renamed from: a */
    public long mo86299a() {
        if (this.f32609b == 0) {
            return 0L;
        }
        String m86295e = m86295e();
        try {
            return Long.valueOf(m86295e).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m86295e, "long"), e);
        }
    }

    @Override // p000.InterfaceC35475Qn1
    /* renamed from: b */
    public double mo86298b() {
        if (this.f32609b == 0) {
            return 0.0d;
        }
        String m86295e = m86295e();
        try {
            return Double.valueOf(m86295e).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m86295e, "double"), e);
        }
    }

    @Override // p000.InterfaceC35475Qn1
    /* renamed from: c */
    public String mo86297c() {
        if (this.f32609b == 0) {
            return "";
        }
        m86294f();
        return this.f32608a;
    }

    @Override // p000.InterfaceC35475Qn1
    /* renamed from: d */
    public boolean mo86296d() throws IllegalArgumentException {
        if (this.f32609b == 0) {
            return false;
        }
        String m86295e = m86295e();
        if (C45967nv0.f101072f.matcher(m86295e).matches()) {
            return true;
        }
        if (C45967nv0.f101073g.matcher(m86295e).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m86295e, "boolean"));
    }

    /* renamed from: e */
    public final String m86295e() {
        return mo86297c().trim();
    }

    /* renamed from: f */
    public final void m86294f() {
        if (this.f32608a != null) {
            return;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override // p000.InterfaceC35475Qn1
    public int getSource() {
        return this.f32609b;
    }
}
