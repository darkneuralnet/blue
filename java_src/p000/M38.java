package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: M38 */
/* loaded from: classes5.dex */
public final class M38 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ Long f22547f;

    /* renamed from: g */
    public final /* synthetic */ String f22548g;

    /* renamed from: h */
    public final /* synthetic */ String f22549h;

    /* renamed from: i */
    public final /* synthetic */ Bundle f22550i;

    /* renamed from: j */
    public final /* synthetic */ boolean f22551j;

    /* renamed from: k */
    public final /* synthetic */ boolean f22552k;

    /* renamed from: l */
    public final /* synthetic */ C52032y88 f22553l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M38(C52032y88 c52032y88, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(c52032y88, true);
        this.f22553l = c52032y88;
        this.f22547f = l;
        this.f22548g = str;
        this.f22549h = str2;
        this.f22550i = bundle;
        this.f22551j = z;
        this.f22552k = z2;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        long longValue;
        InterfaceC45683nR7 interfaceC45683nR7;
        Long l = this.f22547f;
        if (l == null) {
            longValue = this.f103108b;
        } else {
            longValue = l.longValue();
        }
        long j = longValue;
        interfaceC45683nR7 = this.f22553l.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).logEvent(this.f22548g, this.f22549h, this.f22550i, this.f22551j, this.f22552k, j);
    }
}
