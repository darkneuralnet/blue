package p000;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010'J=\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, m28432d2 = {"LFy1;", "LPr6;", "Landroidx/activity/ComponentActivity;", "activity", "", "args", "Landroidx/fragment/app/Fragment;", "fragment", "LXr6;", "owner", "Landroidx/savedstate/a;", "savedStateRegistry", "h", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Landroidx/activity/ComponentActivity;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/activity/ComponentActivity;", "b", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "c", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "LXr6;", "f", "()LXr6;", "Landroidx/savedstate/a;", "g", "()Landroidx/savedstate/a;", "<init>", "(Landroidx/activity/ComponentActivity;Ljava/lang/Object;Landroidx/fragment/app/Fragment;LXr6;Landroidx/savedstate/a;)V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Fy1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33000Fy1 extends AbstractC35282Pr6 {

    /* renamed from: a */
    public final ComponentActivity f10636a;

    /* renamed from: b */
    public final Object f10637b;

    /* renamed from: c */
    public final Fragment f10638c;

    /* renamed from: d */
    public final InterfaceC37154Xr6 f10639d;

    /* renamed from: e */
    public final C11966a f10640e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C33000Fy1(ComponentActivity componentActivity, Object obj, Fragment fragment, InterfaceC37154Xr6 interfaceC37154Xr6, C11966a c11966a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentActivity, obj, fragment, r4, c11966a);
        InterfaceC37154Xr6 interfaceC37154Xr62 = (i & 8) != 0 ? fragment : interfaceC37154Xr6;
        if ((i & 16) != 0) {
            c11966a = fragment.getSavedStateRegistry();
            Intrinsics.checkNotNullExpressionValue(c11966a, "fragment.savedStateRegistry");
        }
    }

    /* renamed from: i */
    public static /* synthetic */ C33000Fy1 m106128i(C33000Fy1 c33000Fy1, ComponentActivity componentActivity, Object obj, Fragment fragment, InterfaceC37154Xr6 interfaceC37154Xr6, C11966a c11966a, int i, Object obj2) {
        if ((i & 1) != 0) {
            componentActivity = c33000Fy1.mo16490d();
        }
        if ((i & 2) != 0) {
            obj = c33000Fy1.mo16489e();
        }
        Object obj3 = obj;
        if ((i & 4) != 0) {
            fragment = c33000Fy1.f10638c;
        }
        Fragment fragment2 = fragment;
        if ((i & 8) != 0) {
            interfaceC37154Xr6 = c33000Fy1.mo16488f();
        }
        InterfaceC37154Xr6 interfaceC37154Xr62 = interfaceC37154Xr6;
        if ((i & 16) != 0) {
            c11966a = c33000Fy1.mo16487g();
        }
        return c33000Fy1.m106129h(componentActivity, obj3, fragment2, interfaceC37154Xr62, c11966a);
    }

    @Override // p000.AbstractC35282Pr6
    /* renamed from: d */
    public ComponentActivity mo16490d() {
        return this.f10636a;
    }

    @Override // p000.AbstractC35282Pr6
    /* renamed from: e */
    public Object mo16489e() {
        return this.f10637b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33000Fy1) {
            C33000Fy1 c33000Fy1 = (C33000Fy1) obj;
            return Intrinsics.areEqual(mo16490d(), c33000Fy1.mo16490d()) && Intrinsics.areEqual(mo16489e(), c33000Fy1.mo16489e()) && Intrinsics.areEqual(this.f10638c, c33000Fy1.f10638c) && Intrinsics.areEqual(mo16488f(), c33000Fy1.mo16488f()) && Intrinsics.areEqual(mo16487g(), c33000Fy1.mo16487g());
        }
        return false;
    }

    @Override // p000.AbstractC35282Pr6
    /* renamed from: f */
    public InterfaceC37154Xr6 mo16488f() {
        return this.f10639d;
    }

    @Override // p000.AbstractC35282Pr6
    /* renamed from: g */
    public C11966a mo16487g() {
        return this.f10640e;
    }

    /* renamed from: h */
    public final C33000Fy1 m106129h(ComponentActivity activity, Object obj, Fragment fragment, InterfaceC37154Xr6 owner, C11966a savedStateRegistry) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        return new C33000Fy1(activity, obj, fragment, owner, savedStateRegistry);
    }

    public int hashCode() {
        return (((((((mo16490d().hashCode() * 31) + (mo16489e() == null ? 0 : mo16489e().hashCode())) * 31) + this.f10638c.hashCode()) * 31) + mo16488f().hashCode()) * 31) + mo16487g().hashCode();
    }

    public String toString() {
        return "FragmentViewModelContext(activity=" + mo16490d() + ", args=" + mo16489e() + ", fragment=" + this.f10638c + ", owner=" + mo16488f() + ", savedStateRegistry=" + mo16487g() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33000Fy1(ComponentActivity activity, Object obj, Fragment fragment, InterfaceC37154Xr6 owner, C11966a savedStateRegistry) {
        super(null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        this.f10636a = activity;
        this.f10637b = obj;
        this.f10638c = fragment;
        this.f10639d = owner;
        this.f10640e = savedStateRegistry;
    }
}
