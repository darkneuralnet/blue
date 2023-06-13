package p000;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;
/* renamed from: R22 */
/* loaded from: classes.dex */
public final class R22 {

    /* renamed from: a */
    public final InterfaceC7058c f31415a;

    /* renamed from: R22$a */
    /* loaded from: classes.dex */
    public static class C7056a implements InterfaceC7058c {

        /* renamed from: a */
        public final InputConfiguration f31416a;

        public C7056a(Object obj) {
            this.f31416a = (InputConfiguration) obj;
        }

        @Override // p000.R22.InterfaceC7058c
        /* renamed from: b */
        public Object mo87399b() {
            return this.f31416a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InterfaceC7058c)) {
                return false;
            }
            return Objects.equals(this.f31416a, ((InterfaceC7058c) obj).mo87399b());
        }

        public int hashCode() {
            return this.f31416a.hashCode();
        }

        public String toString() {
            return this.f31416a.toString();
        }
    }

    /* renamed from: R22$b */
    /* loaded from: classes.dex */
    public static final class C7057b extends C7056a {
        public C7057b(Object obj) {
            super(obj);
        }
    }

    /* renamed from: R22$c */
    /* loaded from: classes.dex */
    public interface InterfaceC7058c {
        /* renamed from: b */
        Object mo87399b();
    }

    public R22(InterfaceC7058c interfaceC7058c) {
        this.f31415a = interfaceC7058c;
    }

    /* renamed from: b */
    public static R22 m87400b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return new R22(new C7057b(obj));
        }
        return new R22(new C7056a(obj));
    }

    /* renamed from: a */
    public Object m87401a() {
        return this.f31415a.mo87399b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof R22)) {
            return false;
        }
        return this.f31415a.equals(((R22) obj).f31415a);
    }

    public int hashCode() {
        return this.f31415a.hashCode();
    }

    public String toString() {
        return this.f31415a.toString();
    }
}
