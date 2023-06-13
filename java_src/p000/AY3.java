package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BO\b\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bBE\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001cJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0007\u0010\nR\u0017\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0018\u0010\n¨\u0006\u001d"}, m28432d2 = {"LAY3;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", C17296a.f69688o, "Z", "e", "()Z", "focusable", "b", "dismissOnBackPress", "c", "dismissOnClickOutside", "LOq5;", DateTokenConverter.CONVERTER_KEY, "LOq5;", "f", "()LOq5;", "securePolicy", "excludeFromSystemGesture", "clippingEnabled", "g", "usePlatformDefaultWidth", "<init>", "(ZZZLOq5;ZZZ)V", "(ZZZLOq5;ZZ)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AY3 */
/* loaded from: classes.dex */
public final class AY3 {

    /* renamed from: a */
    public final boolean f769a;

    /* renamed from: b */
    public final boolean f770b;

    /* renamed from: c */
    public final boolean f771c;

    /* renamed from: d */
    public final EnumC35038Oq5 f772d;

    /* renamed from: e */
    public final boolean f773e;

    /* renamed from: f */
    public final boolean f774f;

    /* renamed from: g */
    public final boolean f775g;

    public AY3() {
        this(false, false, false, null, false, false, false, 127, null);
    }

    /* renamed from: a */
    public final boolean m115568a() {
        return this.f774f;
    }

    /* renamed from: b */
    public final boolean m115567b() {
        return this.f770b;
    }

    /* renamed from: c */
    public final boolean m115566c() {
        return this.f771c;
    }

    /* renamed from: d */
    public final boolean m115565d() {
        return this.f773e;
    }

    /* renamed from: e */
    public final boolean m115564e() {
        return this.f769a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AY3)) {
            return false;
        }
        AY3 ay3 = (AY3) obj;
        if (this.f769a == ay3.f769a && this.f770b == ay3.f770b && this.f771c == ay3.f771c && this.f772d == ay3.f772d && this.f773e == ay3.f773e && this.f774f == ay3.f774f && this.f775g == ay3.f775g) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final EnumC35038Oq5 m115563f() {
        return this.f772d;
    }

    /* renamed from: g */
    public final boolean m115562g() {
        return this.f775g;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f770b) * 31) + Boolean.hashCode(this.f769a)) * 31) + Boolean.hashCode(this.f770b)) * 31) + Boolean.hashCode(this.f771c)) * 31) + this.f772d.hashCode()) * 31) + Boolean.hashCode(this.f773e)) * 31) + Boolean.hashCode(this.f774f)) * 31) + Boolean.hashCode(this.f775g);
    }

    public AY3(boolean z, boolean z2, boolean z3, EnumC35038Oq5 securePolicy, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        this.f769a = z;
        this.f770b = z2;
        this.f771c = z3;
        this.f772d = securePolicy;
        this.f773e = z4;
        this.f774f = z5;
        this.f775g = z6;
    }

    public /* synthetic */ AY3(boolean z, boolean z2, boolean z3, EnumC35038Oq5 enumC35038Oq5, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? EnumC35038Oq5.Inherit : enumC35038Oq5, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true, (i & 64) != 0 ? false : z6);
    }

    public /* synthetic */ AY3(boolean z, boolean z2, boolean z3, EnumC35038Oq5 enumC35038Oq5, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? EnumC35038Oq5.Inherit : enumC35038Oq5, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AY3(boolean z, boolean z2, boolean z3, EnumC35038Oq5 securePolicy, boolean z4, boolean z5) {
        this(z, z2, z3, securePolicy, z4, z5, false);
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
    }
}
