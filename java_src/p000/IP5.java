package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.AN2;
import p000.RN2;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005BC\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0013\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u000e\u0010\u0017R#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006 "}, m28432d2 = {"LIP5;", "LRN2;", "VM", "LAN2;", "S", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LPr6;", C17296a.f69688o, "LPr6;", DateTokenConverter.CONVERTER_KEY, "()LPr6;", "viewModelContext", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "c", "()Ljava/lang/Class;", "viewModelClass", "stateClass", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "toRestoredState", "<init>", "(LPr6;Ljava/lang/Class;Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: IP5 */
/* loaded from: classes2.dex */
public final class IP5<VM extends RN2<S>, S extends AN2> {

    /* renamed from: a */
    public final AbstractC35282Pr6 f15463a;

    /* renamed from: b */
    public final Class<? extends VM> f15464b;

    /* renamed from: c */
    public final Class<? extends S> f15465c;

    /* renamed from: d */
    public final Function1<S, S> f15466d;

    /* JADX WARN: Multi-variable type inference failed */
    public IP5(AbstractC35282Pr6 viewModelContext, Class<? extends VM> viewModelClass, Class<? extends S> stateClass, Function1<? super S, ? extends S> toRestoredState) {
        Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(stateClass, "stateClass");
        Intrinsics.checkNotNullParameter(toRestoredState, "toRestoredState");
        this.f15463a = viewModelContext;
        this.f15464b = viewModelClass;
        this.f15465c = stateClass;
        this.f15466d = toRestoredState;
    }

    /* renamed from: a */
    public final Class<? extends S> m102415a() {
        return this.f15465c;
    }

    /* renamed from: b */
    public final Function1<S, S> m102414b() {
        return this.f15466d;
    }

    /* renamed from: c */
    public final Class<? extends VM> m102413c() {
        return this.f15464b;
    }

    /* renamed from: d */
    public final AbstractC35282Pr6 m102412d() {
        return this.f15463a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IP5) {
            IP5 ip5 = (IP5) obj;
            return Intrinsics.areEqual(this.f15463a, ip5.f15463a) && Intrinsics.areEqual(this.f15464b, ip5.f15464b) && Intrinsics.areEqual(this.f15465c, ip5.f15465c) && Intrinsics.areEqual(this.f15466d, ip5.f15466d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f15463a.hashCode() * 31) + this.f15464b.hashCode()) * 31) + this.f15465c.hashCode()) * 31) + this.f15466d.hashCode();
    }

    public String toString() {
        return "StateRestorer(viewModelContext=" + this.f15463a + ", viewModelClass=" + this.f15464b + ", stateClass=" + this.f15465c + ", toRestoredState=" + this.f15466d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
