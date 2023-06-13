package p000;

import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"LxE;", "LXC;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/core/mvp/BaseActivity;", "getActivity", "()Lco/bird/android/core/mvp/BaseActivity;", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "core-basemvp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xE */
/* loaded from: classes2.dex */
public abstract class AbstractC30071xE extends AbstractC9344XC {
    private final BaseActivity activity;

    public AbstractC30071xE(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    @Override // p000.AbstractC9344XC, p000.InterfaceC44721lp0
    public BaseActivity getActivity() {
        return this.activity;
    }
}
