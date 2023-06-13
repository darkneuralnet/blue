package p000;

import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000\"!\u0010\u0013\u001a\u00020\r8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010*\f\b\u0000\u0010\u0015\"\u00020\u00142\u00020\u0014¨\u0006\u0016"}, m28432d2 = {"T", "value", "LEM5;", "policy", "LCM5;", C17296a.f69688o, "(Ljava/lang/Object;LEM5;)LCM5;", "", "message", "", "e", "", "b", "LIV2;", "Lkotlin/Lazy;", "getDefaultMonotonicFrameClock", "()LIV2;", "getDefaultMonotonicFrameClock$annotations", "()V", "DefaultMonotonicFrameClock", "", "CheckResult", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: A6 */
/* loaded from: classes.dex */
public final class C0030A6 {

    /* renamed from: a */
    public static final Lazy f143a;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LIV2;", "b", "()LIV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: A6$a */
    /* loaded from: classes.dex */
    public static final class C0031a extends Lambda implements Function0<IV2> {

        /* renamed from: g */
        public static final C0031a f144g = new C0031a();

        public C0031a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final IV2 invoke() {
            if (Looper.getMainLooper() != null) {
                return DW0.f5806b;
            }
            return C41178fq5.f80829b;
        }
    }

    static {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(C0031a.f144g);
        f143a = lazy;
    }

    /* renamed from: a */
    public static final <T> CM5<T> m116100a(T t, EM5<T> policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        return new ParcelableSnapshotMutableState(t, policy);
    }

    /* renamed from: b */
    public static final void m116099b(String message, Throwable e) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(e, "e");
        Log.e("ComposeInternal", message, e);
    }
}
