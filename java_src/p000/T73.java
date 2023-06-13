package p000;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\r"}, m28432d2 = {"LT73;", "LZy0;", "LP73;", "LHG6;", "workSpec", "", "b", "value", "i", "Ldz0;", "tracker", "<init>", "(Ldz0;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: T73 */
/* loaded from: classes.dex */
public final class T73 extends AbstractC37679Zy0<P73> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T73(AbstractC40077dz0<P73> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // p000.AbstractC37679Zy0
    /* renamed from: b */
    public boolean mo42880b(HG6 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        S73 m26580d = workSpec.f13200j.m26580d();
        if (m26580d != S73.UNMETERED && (Build.VERSION.SDK_INT < 30 || m26580d != S73.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    @Override // p000.AbstractC37679Zy0
    /* renamed from: i */
    public boolean mo42879c(P73 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.m90733a() && !value.m90732b()) {
            return false;
        }
        return true;
    }
}
