package p000;

import java.util.NoSuchElementException;
/* renamed from: B0 */
/* loaded from: classes6.dex */
public abstract class AbstractC0367B0<T> extends AbstractC48175re6<T> {

    /* renamed from: b */
    public EnumC0369b f1511b = EnumC0369b.NOT_READY;

    /* renamed from: c */
    public T f1512c;

    /* renamed from: B0$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C0368a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1513a;

        static {
            int[] iArr = new int[EnumC0369b.values().length];
            f1513a = iArr;
            try {
                iArr[EnumC0369b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1513a[EnumC0369b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: B0$b */
    /* loaded from: classes6.dex */
    public enum EnumC0369b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract T mo575a();

    /* renamed from: b */
    public final T m114802b() {
        this.f1511b = EnumC0369b.DONE;
        return null;
    }

    /* renamed from: c */
    public final boolean m114801c() {
        this.f1511b = EnumC0369b.FAILED;
        this.f1512c = mo575a();
        if (this.f1511b != EnumC0369b.DONE) {
            this.f1511b = EnumC0369b.READY;
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f1511b != EnumC0369b.FAILED) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108795t(z);
        int i = C0368a.f1513a[this.f1511b.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        return m114801c();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f1511b = EnumC0369b.NOT_READY;
            T t = (T) C48162rd3.m15690a(this.f1512c);
            this.f1512c = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
