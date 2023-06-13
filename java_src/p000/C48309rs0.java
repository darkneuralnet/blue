package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B4\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR/\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lrs0;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/Object;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "b", "Lkotlin/jvm/functions/Function1;", "onCancellation", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: rs0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48309rs0 {
    @JvmField

    /* renamed from: a */
    public final Object f107803a;
    @JvmField

    /* renamed from: b */
    public final Function1<Throwable, Unit> f107804b;

    /* JADX WARN: Multi-variable type inference failed */
    public C48309rs0(Object obj, Function1<? super Throwable, Unit> function1) {
        this.f107803a = obj;
        this.f107804b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48309rs0) {
            C48309rs0 c48309rs0 = (C48309rs0) obj;
            return Intrinsics.areEqual(this.f107803a, c48309rs0.f107803a) && Intrinsics.areEqual(this.f107804b, c48309rs0.f107804b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f107803a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f107804b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f107803a + ", onCancellation=" + this.f107804b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
