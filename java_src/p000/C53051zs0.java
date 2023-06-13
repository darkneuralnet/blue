package p000;

import co.bird.android.model.NonComplianceWarning;
import co.bird.android.model.NonComplianceWarningKind;
import co.bird.api.request.NonComplianceWarningBody;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lzs0;", "Lys0;", "Lbr4;", "Lco/bird/android/model/NonComplianceWarningKind;", "warningKind", "", "rideId", "currency", "", "amount", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/NonComplianceWarning;", "c", "(Lco/bird/android/model/NonComplianceWarningKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/F;", "Lxs0;", "b", "Lxs0;", "complianceClient", "<init>", "(Lxs0;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zs0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C53051zs0 implements InterfaceC52458ys0, InterfaceC38798br4 {

    /* renamed from: b */
    public final InterfaceC51865xs0 f122404b;

    public C53051zs0(InterfaceC51865xs0 complianceClient) {
        Intrinsics.checkNotNullParameter(complianceClient, "complianceClient");
        this.f122404b = complianceClient;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    /* renamed from: d */
    public <T> AbstractC23442F<T> m210d(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC38798br4.C13315a.m62279p(this, abstractC23442F);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    @Override // p000.InterfaceC52458ys0
    /* renamed from: c */
    public AbstractC23442F<HM4<NonComplianceWarning>> mo211c(NonComplianceWarningKind warningKind, String str, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(warningKind, "warningKind");
        AbstractC23442F<HM4<NonComplianceWarning>> m210d = m210d(this.f122404b.m4548a(new NonComplianceWarningBody(warningKind, str, str2, num)));
        Intrinsics.checkNotNullExpressionValue(m210d, "complianceClient\n      .…unt))\n      .schedulers()");
        return m210d;
    }
}
