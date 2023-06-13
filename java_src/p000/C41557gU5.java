package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BottomSheetButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R@\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R@\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R<\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010¨\u0006\u001d"}, m28432d2 = {"LgU5;", "LwZ;", "Lco/bird/android/model/BottomSheetButton;", "LeU5;", "c", "LeU5;", DateTokenConverter.CONVERTER_KEY, "()LeU5;", "adapter", "Lkotlin/Function1;", "", "", "value", "getOnNameUpdated", "()Lkotlin/jvm/functions/Function1;", "f", "(Lkotlin/jvm/functions/Function1;)V", "onNameUpdated", "getOnNoteUpdated", "g", "onNoteUpdated", "", "getOnCapacityUpdated", "e", "onCapacityUpdated", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gU5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41557gU5 extends AbstractC29912wZ<BottomSheetButton> {

    /* renamed from: c */
    public final C40371eU5 f82345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41557gU5(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82345c = new C40371eU5();
    }

    @Override // p000.AbstractC29912wZ
    /* renamed from: d */
    public C40371eU5 getAdapter() {
        return this.f82345c;
    }

    /* renamed from: e */
    public final void m39270e(Function1<? super Integer, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getAdapter().m42846y(value);
    }

    /* renamed from: f */
    public final void m39269f(Function1<? super String, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getAdapter().m42851A(value);
    }

    /* renamed from: g */
    public final void m39268g(Function1<? super String, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getAdapter().m42850B(value);
    }
}
