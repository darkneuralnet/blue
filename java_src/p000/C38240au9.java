package p000;

import java.io.IOException;
import java.util.Iterator;
/* renamed from: au9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38240au9 implements Iterable {

    /* renamed from: b */
    public final /* synthetic */ CharSequence f56518b;

    /* renamed from: c */
    public final /* synthetic */ Cw9 f56519c;

    public C38240au9(Cw9 cw9, CharSequence charSequence) {
        this.f56519c = cw9;
        this.f56518b = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator m111215h;
        m111215h = this.f56519c.m111215h(this.f56518b);
        return m111215h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(Rh9.m86436a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(Rh9.m86436a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
