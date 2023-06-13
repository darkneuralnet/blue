package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LCj1;", "T", "Ldp;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "", "e", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "error", "f", "Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Cj1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32163Cj1<T> extends AbstractC19862dp<T> {

    /* renamed from: e */
    public final Throwable f4549e;

    /* renamed from: f */
    public final T f4550f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32163Cj1(Throwable error, T t) {
        super(true, true, t, null);
        Intrinsics.checkNotNullParameter(error, "error");
        this.f4549e = error;
        this.f4550f = t;
    }

    /* renamed from: b */
    public final Throwable m111793b() {
        return this.f4549e;
    }

    public boolean equals(Object obj) {
        Object firstOrNull;
        Object firstOrNull2;
        if (!(obj instanceof C32163Cj1)) {
            return false;
        }
        Throwable th = ((C32163Cj1) obj).f4549e;
        if (!Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(this.f4549e.getClass()), Reflection.getOrCreateKotlinClass(th.getClass())) || !Intrinsics.areEqual(this.f4549e.getMessage(), th.getMessage())) {
            return false;
        }
        StackTraceElement[] stackTrace = this.f4549e.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "error.stackTrace");
        firstOrNull = ArraysKt___ArraysKt.firstOrNull(stackTrace);
        StackTraceElement[] stackTrace2 = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace2, "otherError.stackTrace");
        firstOrNull2 = ArraysKt___ArraysKt.firstOrNull(stackTrace2);
        if (!Intrinsics.areEqual(firstOrNull, firstOrNull2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object firstOrNull;
        StackTraceElement[] stackTrace = this.f4549e.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "error.stackTrace");
        firstOrNull = ArraysKt___ArraysKt.firstOrNull(stackTrace);
        return Arrays.hashCode(new Object[]{Reflection.getOrCreateKotlinClass(this.f4549e.getClass()), this.f4549e.getMessage(), firstOrNull});
    }

    public String toString() {
        return "Fail(error=" + this.f4549e + ", value=" + this.f4550f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ C32163Cj1(Throwable th, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? null : obj);
    }
}
