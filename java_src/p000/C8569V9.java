package p000;

import java.util.Map;
import java.util.Objects;
/* renamed from: V9 */
/* loaded from: classes8.dex */
public final class C8569V9<Q> extends AbstractC28986u1<Q> {
    private static final long serialVersionUID = 4696690756456282705L;

    /* renamed from: f */
    public final InterfaceC35858Sd6<?> f38691f;

    public C8569V9(InterfaceC35858Sd6<?> interfaceC35858Sd6, String str) {
        super(str);
        if (interfaceC35858Sd6 instanceof AbstractC28986u1) {
            if (((AbstractC28986u1) interfaceC35858Sd6).m11066v()) {
                this.f38691f = interfaceC35858Sd6 instanceof C8569V9 ? ((C8569V9) interfaceC35858Sd6).m80273L() : interfaceC35858Sd6;
                return;
            }
            throw new IllegalArgumentException("The parent unit: " + interfaceC35858Sd6 + " is not an unscaled SI unit");
        }
        throw new IllegalArgumentException("The parent unit: " + interfaceC35858Sd6 + " is not an AbstractUnit");
    }

    /* renamed from: M */
    public static <Q> C8569V9<Q> m80272M(InterfaceC35858Sd6<?> interfaceC35858Sd6, String str, String str2) {
        return new C8569V9<>(interfaceC35858Sd6, str, str2);
    }

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: F */
    public V31 mo3806F() {
        return this.f38691f.mo3806F();
    }

    @Override // p000.AbstractC28986u1
    /* renamed from: J */
    public InterfaceC35858Sd6<Q> mo3805J() {
        return this;
    }

    /* renamed from: L */
    public InterfaceC35858Sd6<?> m80273L() {
        return this.f38691f;
    }

    @Override // p000.InterfaceC35726Rp0
    /* renamed from: b0 */
    public InterfaceC38077ae6 mo3804b0() {
        return ((AbstractC28986u1) this.f38691f).mo3804b0();
    }

    @Override // p000.AbstractC28986u1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8569V9)) {
            return false;
        }
        C8569V9 c8569v9 = (C8569V9) obj;
        if (Objects.equals(this.f38691f, c8569v9.f38691f) && Objects.equals(mo11086a(), c8569v9.mo11086a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f38691f, mo11086a());
    }

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: l */
    public Map<? extends InterfaceC35858Sd6<?>, Integer> mo3803l() {
        return this.f38691f.mo3803l();
    }

    public C8569V9(InterfaceC35858Sd6<?> interfaceC35858Sd6, String str, String str2) {
        this(interfaceC35858Sd6, str);
        this.f111481b = str2;
    }
}
