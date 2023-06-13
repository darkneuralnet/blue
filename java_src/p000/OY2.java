package p000;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¨\u0006\u0013"}, m28432d2 = {"LOY2;", "LDY2;", "LLifecycleOwner;", "owner", "", "h0", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "i0", "", "enabled", "r", "LWr6;", "viewModelStore", "j0", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: OY2 */
/* loaded from: classes.dex */
public class OY2 extends DY2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OY2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p000.DY2
    /* renamed from: h0 */
    public final void mo92021h0(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.mo92021h0(owner);
    }

    @Override // p000.DY2
    /* renamed from: i0 */
    public final void mo92020i0(OnBackPressedDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        super.mo92020i0(dispatcher);
    }

    @Override // p000.DY2
    /* renamed from: j0 */
    public final void mo92019j0(C36920Wr6 viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        super.mo92019j0(viewModelStore);
    }

    @Override // p000.DY2
    /* renamed from: r */
    public final void mo92018r(boolean z) {
        super.mo92018r(z);
    }
}
