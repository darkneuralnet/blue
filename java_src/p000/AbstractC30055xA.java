package p000;

import co.bird.android.core.base.BaseCoreActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LxA;", "LXC;", "Lco/bird/android/core/base/BaseCoreActivity;", "b", "Lco/bird/android/core/base/BaseCoreActivity;", "getActivity", "()Lco/bird/android/core/base/BaseCoreActivity;", "activity", "<init>", "(Lco/bird/android/core/base/BaseCoreActivity;)V", "core-basemvp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xA */
/* loaded from: classes2.dex */
public abstract class AbstractC30055xA extends AbstractC9344XC {

    /* renamed from: b */
    public final BaseCoreActivity f117156b;

    public AbstractC30055xA(BaseCoreActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f117156b = activity;
    }

    @Override // p000.AbstractC9344XC, p000.InterfaceC44721lp0
    public BaseCoreActivity getActivity() {
        return this.f117156b;
    }
}
