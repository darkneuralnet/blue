package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aH\u0010\r\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"Landroidx/lifecycle/f;", "Landroidx/lifecycle/f$b;", TransferTable.COLUMN_STATE, "Lkotlin/Function2;", "LZC0;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "b", "(Landroidx/lifecycle/f;Landroidx/lifecycle/f$b;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LLifecycleOwner;", C17296a.f69688o, "(LLifecycleOwner;Landroidx/lifecycle/f$b;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    /* renamed from: a */
    public static final Object m67039a(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11724b enumC11724b, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m67038b = m67038b(lifecycleOwner.getLifecycle(), enumC11724b, function2, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m67038b == coroutine_suspended ? m67038b : Unit.INSTANCE;
    }

    /* renamed from: b */
    public static final Object m67038b(AbstractC11719f abstractC11719f, AbstractC11719f.EnumC11724b enumC11724b, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        boolean z;
        Object coroutine_suspended;
        if (enumC11724b != AbstractC11719f.EnumC11724b.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (abstractC11719f.mo67007b() == AbstractC11719f.EnumC11724b.DESTROYED) {
                return Unit.INSTANCE;
            }
            Object m71786e = C37824aD0.m71786e(new RepeatOnLifecycleKt$repeatOnLifecycle$3(abstractC11719f, enumC11724b, function2, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m71786e == coroutine_suspended) {
                return m71786e;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }
}
