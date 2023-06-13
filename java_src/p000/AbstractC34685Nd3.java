package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.mlkit.vision.common.internal.C18452a;
import java.util.concurrent.Executor;
/* renamed from: Nd3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34685Nd3 implements C18452a.InterfaceC18454b<InterfaceC34217Ld3> {

    /* renamed from: a */
    public final int f24868a;

    /* renamed from: b */
    public final boolean f24869b;

    /* renamed from: c */
    public final boolean f24870c;

    /* renamed from: d */
    public final Executor f24871d;

    @KeepForSdk
    /* renamed from: Nd3$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC5615a<B extends AbstractC5615a<B>> {

        /* renamed from: a */
        public int f24872a = 1;

        /* renamed from: b */
        public boolean f24873b = false;

        /* renamed from: c */
        public boolean f24874c = false;

        /* renamed from: d */
        public Executor f24875d;

        @KeepForSdk
        /* renamed from: a */
        public B m93685a(int i) {
            this.f24872a = i;
            return this;
        }
    }

    @KeepForSdk
    public AbstractC34685Nd3(AbstractC5615a<?> abstractC5615a) {
        this.f24868a = abstractC5615a.f24872a;
        this.f24869b = abstractC5615a.f24873b;
        this.f24870c = abstractC5615a.f24874c;
        this.f24871d = abstractC5615a.f24875d;
    }

    @KeepForSdk
    /* renamed from: a */
    public int m93689a() {
        return this.f24868a;
    }

    @KeepForSdk
    /* renamed from: b */
    public Executor m93688b() {
        return this.f24871d;
    }

    @KeepForSdk
    /* renamed from: c */
    public boolean m93687c() {
        return this.f24870c;
    }

    @KeepForSdk
    /* renamed from: d */
    public boolean m93686d() {
        return this.f24869b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC34685Nd3)) {
            return false;
        }
        AbstractC34685Nd3 abstractC34685Nd3 = (AbstractC34685Nd3) obj;
        if (getClass().equals(abstractC34685Nd3.getClass()) && abstractC34685Nd3.f24868a == this.f24868a && abstractC34685Nd3.f24870c == this.f24870c && abstractC34685Nd3.f24869b == this.f24869b && Objects.equal(abstractC34685Nd3.f24871d, this.f24871d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(getClass(), Integer.valueOf(this.f24868a), Boolean.valueOf(this.f24870c), Boolean.valueOf(this.f24869b), this.f24871d);
    }
}
