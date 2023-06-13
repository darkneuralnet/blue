package p000;

import java.io.File;
import java.io.IOException;
/* renamed from: TM6 */
/* loaded from: classes6.dex */
public final class TM6 implements ZN6 {

    /* renamed from: a */
    public final /* synthetic */ C42088hN6 f35384a;

    public TM6(C42088hN6 c42088hN6) {
        this.f35384a = c42088hN6;
    }

    @Override // p000.ZN6
    /* renamed from: a */
    public final void mo73221a(C43283jO6 c43283jO6, File file, boolean z) throws IOException {
        this.f35384a.f85132b.add(file);
        if (z) {
            return;
        }
        this.f35384a.f85133c.set(false);
    }
}
