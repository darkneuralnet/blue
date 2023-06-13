package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.BottomSheetButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m28432d2 = {"LII6;", "LwZ;", "Lco/bird/android/model/BottomSheetButton;", "LyS0;", "c", "LyS0;", "getAdapter", "()LyS0;", "adapter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "zone-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: II6 */
/* loaded from: classes3.dex */
public final class II6 extends AbstractC29912wZ<BottomSheetButton> {

    /* renamed from: c */
    public final AbstractC52206yS0 f15296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public II6(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15296c = new GI6();
    }

    @Override // p000.AbstractC29912wZ
    public AbstractC52206yS0 getAdapter() {
        return this.f15296c;
    }
}
