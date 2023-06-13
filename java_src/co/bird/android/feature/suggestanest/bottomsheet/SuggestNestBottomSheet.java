package co.bird.android.feature.suggestanest.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.model.BottomSheetButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010!B!\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010#J\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\tR@\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R@\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R<\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012¨\u0006$"}, m28432d2 = {"Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/BottomSheetButton;", "LwZ;", "A", "", "D", "LgU5;", "n", "LgU5;", "adapter", "Lkotlin/Function1;", "", "", "value", "getOnNameUpdated", "()Lkotlin/jvm/functions/Function1;", "setOnNameUpdated", "(Lkotlin/jvm/functions/Function1;)V", "onNameUpdated", "getOnNoteUpdated", "setOnNoteUpdated", "onNoteUpdated", "", "getOnCapacityUpdated", "setOnCapacityUpdated", "onCapacityUpdated", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuggestNestBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestBottomSheet.kt\nco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
/* loaded from: classes3.dex */
public final class SuggestNestBottomSheet extends BaseBottomSheet<BottomSheetButton> {

    /* renamed from: n */
    public C41557gU5 f65674n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestNestBottomSheet(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // co.bird.android.bottomsheet.BaseBottomSheet
    /* renamed from: A */
    public AbstractC29912wZ<? extends BottomSheetButton> mo56204A() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C41557gU5 c41557gU5 = new C41557gU5(context);
        this.f65674n = c41557gU5;
        return c41557gU5;
    }

    @Override // co.bird.android.bottomsheet.BaseBottomSheet
    /* renamed from: D */
    public boolean mo56569D() {
        return false;
    }

    public final void setOnCapacityUpdated(Function1<? super Integer, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C41557gU5 c41557gU5 = this.f65674n;
        if (c41557gU5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            c41557gU5 = null;
        }
        c41557gU5.m39270e(value);
    }

    public final void setOnNameUpdated(Function1<? super String, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C41557gU5 c41557gU5 = this.f65674n;
        if (c41557gU5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            c41557gU5 = null;
        }
        c41557gU5.m39269f(value);
    }

    public final void setOnNoteUpdated(Function1<? super String, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C41557gU5 c41557gU5 = this.f65674n;
        if (c41557gU5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            c41557gU5 = null;
        }
        c41557gU5.m39268g(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestNestBottomSheet(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestNestBottomSheet(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
