package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001b"}, m28432d2 = {"Lrj2;", "LE0;", "LMs5;", "descriptor", "", "index", "", "c0", "tag", "Lxi2;", "g0", "q", "Lei2;", "f", "Lei2;", "x0", "()Lei2;", "value", "g", "I", "size", "h", "currentIndex", "Lbi2;", "json", "<init>", "(Lbi2;Lei2;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48221rj2 extends AbstractC1694E0 {

    /* renamed from: f */
    public final C40502ei2 f107533f;

    /* renamed from: g */
    public final int f107534g;

    /* renamed from: h */
    public int f107535h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48221rj2(AbstractC38706bi2 json, C40502ei2 value) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f107533f = value;
        this.f107534g = mo11842v0().size();
        this.f107535h = -1;
    }

    @Override // p000.AbstractC46334oY2
    /* renamed from: c0 */
    public String mo11845c0(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // p000.AbstractC1694E0
    /* renamed from: g0 */
    public AbstractC51767xi2 mo11844g0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return mo11842v0().get(Integer.parseInt(tag));
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: q */
    public int mo11843q(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.f107535h;
        if (i < this.f107534g - 1) {
            int i2 = i + 1;
            this.f107535h = i2;
            return i2;
        }
        return -1;
    }

    @Override // p000.AbstractC1694E0
    /* renamed from: x0 */
    public C40502ei2 mo11842v0() {
        return this.f107533f;
    }
}
