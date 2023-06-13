package p000;

import androidx.activity.ComponentActivity;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J3\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m28432d2 = {"Lr6;", "LPr6;", "Landroidx/activity/ComponentActivity;", "activity", "", "args", "LXr6;", "owner", "Landroidx/savedstate/a;", "savedStateRegistry", "h", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Landroidx/activity/ComponentActivity;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/activity/ComponentActivity;", "b", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "c", "LXr6;", "f", "()LXr6;", "Landroidx/savedstate/a;", "g", "()Landroidx/savedstate/a;", "<init>", "(Landroidx/activity/ComponentActivity;Ljava/lang/Object;LXr6;Landroidx/savedstate/a;)V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: r6 */
/* loaded from: classes2.dex */
public final class C27850r6 extends AbstractC35282Pr6 {

    /* renamed from: a */
    public final ComponentActivity f106464a;

    /* renamed from: b */
    public final Object f106465b;

    /* renamed from: c */
    public final InterfaceC37154Xr6 f106466c;

    /* renamed from: d */
    public final C11966a f106467d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C27850r6(ComponentActivity componentActivity, Object obj, InterfaceC37154Xr6 interfaceC37154Xr6, C11966a c11966a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentActivity, obj, interfaceC37154Xr6, c11966a);
        interfaceC37154Xr6 = (i & 4) != 0 ? componentActivity : interfaceC37154Xr6;
        if ((i & 8) != 0) {
            c11966a = componentActivity.getSavedStateRegistry();
            Intrinsics.checkNotNullExpressionValue(c11966a, "activity.savedStateRegistry");
        }
    }

    /* renamed from: i */
    public static /* synthetic */ C27850r6 m16485i(C27850r6 c27850r6, ComponentActivity componentActivity, Object obj, InterfaceC37154Xr6 interfaceC37154Xr6, C11966a c11966a, int i, Object obj2) {
        if ((i & 1) != 0) {
            componentActivity = c27850r6.mo16490d();
        }
        if ((i & 2) != 0) {
            obj = c27850r6.mo16489e();
        }
        if ((i & 4) != 0) {
            interfaceC37154Xr6 = c27850r6.mo16488f();
        }
        if ((i & 8) != 0) {
            c11966a = c27850r6.mo16487g();
        }
        return c27850r6.m16486h(componentActivity, obj, interfaceC37154Xr6, c11966a);
    }

    @Override // p000.AbstractC35282Pr6
    /* renamed from: d */
    public ComponentActivity mo16490d() {
        return this.f106464a;
    }

    @Override // p000.AbstractC35282Pr6
    /* renamed from: e */
    public Object mo16489e() {
        return this.f106465b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27850r6) {
            C27850r6 c27850r6 = (C27850r6) obj;
            return Intrinsics.areEqual(mo16490d(), c27850r6.mo16490d()) && Intrinsics.areEqual(mo16489e(), c27850r6.mo16489e()) && Intrinsics.areEqual(mo16488f(), c27850r6.mo16488f()) && Intrinsics.areEqual(mo16487g(), c27850r6.mo16487g());
        }
        return false;
    }

    @Override // p000.AbstractC35282Pr6
    /* renamed from: f */
    public InterfaceC37154Xr6 mo16488f() {
        return this.f106466c;
    }

    @Override // p000.AbstractC35282Pr6
    /* renamed from: g */
    public C11966a mo16487g() {
        return this.f106467d;
    }

    /* renamed from: h */
    public final C27850r6 m16486h(ComponentActivity activity, Object obj, InterfaceC37154Xr6 owner, C11966a savedStateRegistry) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        return new C27850r6(activity, obj, owner, savedStateRegistry);
    }

    public int hashCode() {
        return (((((mo16490d().hashCode() * 31) + (mo16489e() == null ? 0 : mo16489e().hashCode())) * 31) + mo16488f().hashCode()) * 31) + mo16487g().hashCode();
    }

    public String toString() {
        return "ActivityViewModelContext(activity=" + mo16490d() + ", args=" + mo16489e() + ", owner=" + mo16488f() + ", savedStateRegistry=" + mo16487g() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27850r6(ComponentActivity activity, Object obj, InterfaceC37154Xr6 owner, C11966a savedStateRegistry) {
        super(null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        this.f106464a = activity;
        this.f106465b = obj;
        this.f106466c = owner;
        this.f106467d = savedStateRegistry;
    }
}
