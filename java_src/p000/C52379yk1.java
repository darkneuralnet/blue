package p000;

import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lyk1;", "LHA;", "LTo2;", "j", "LTo2;", "Vl", "()LTo2;", "assetManager", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LJf;", "adapter", "Lbg;", "converter", "<init>", "(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;)V", "announcement_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C52379yk1 extends AbstractC3056HA {

    /* renamed from: j */
    public final InterfaceC36187To2 f120086j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52379yk1(InterfaceC36187To2 assetManager, BaseActivity activity, C4176Jf adapter, C12470bg converter) {
        super(activity, adapter, converter);
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f120086j = assetManager;
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Vl */
    public InterfaceC36187To2 mo2709Vl() {
        return this.f120086j;
    }
}
