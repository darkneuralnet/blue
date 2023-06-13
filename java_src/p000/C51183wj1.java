package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B<\u0012\u0006\u0010\u0017\u001a\u00028\u0000\u0012+\u0010\u001a\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\f\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0017\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R<\u0010\u001a\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001d"}, m28432d2 = {"Lwj1;", "T", "", C17296a.f69688o, "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "content", "Landroidx/compose/material/FadeInFadeOutTransition;", "b", "()Lkotlin/jvm/functions/Function3;", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Object;", "c", "key", "Lkotlin/jvm/functions/Function3;", "getTransition", "transition", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51183wj1<T> {

    /* renamed from: a */
    public final T f116393a;

    /* renamed from: b */
    public final Function3<Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, InterfaceC32720Et0, Integer, Unit> f116394b;

    /* JADX WARN: Multi-variable type inference failed */
    public C51183wj1(T t, Function3<? super Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, ? super InterfaceC32720Et0, ? super Integer, Unit> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f116393a = t;
        this.f116394b = transition;
    }

    /* renamed from: a */
    public final T m6445a() {
        return this.f116393a;
    }

    /* renamed from: b */
    public final Function3<Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, InterfaceC32720Et0, Integer, Unit> m6444b() {
        return this.f116394b;
    }

    /* renamed from: c */
    public final T m6443c() {
        return this.f116393a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C51183wj1) {
            C51183wj1 c51183wj1 = (C51183wj1) obj;
            return Intrinsics.areEqual(this.f116393a, c51183wj1.f116393a) && Intrinsics.areEqual(this.f116394b, c51183wj1.f116394b);
        }
        return false;
    }

    public int hashCode() {
        T t = this.f116393a;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.f116394b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f116393a + ", transition=" + this.f116394b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
