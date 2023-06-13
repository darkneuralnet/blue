package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017B'\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0018J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u0019"}, m28432d2 = {"LD31;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", C17296a.f69688o, "Z", "b", "()Z", "dismissOnBackPress", "c", "dismissOnClickOutside", "LOq5;", "LOq5;", DateTokenConverter.CONVERTER_KEY, "()LOq5;", "securePolicy", "e", "usePlatformDefaultWidth", "decorFitsSystemWindows", "<init>", "(ZZLOq5;ZZ)V", "(ZZLOq5;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: D31 */
/* loaded from: classes.dex */
public final class D31 {

    /* renamed from: a */
    public final boolean f5120a;

    /* renamed from: b */
    public final boolean f5121b;

    /* renamed from: c */
    public final EnumC35038Oq5 f5122c;

    /* renamed from: d */
    public final boolean f5123d;

    /* renamed from: e */
    public final boolean f5124e;

    public D31() {
        this(false, false, null, false, false, 31, null);
    }

    /* renamed from: a */
    public final boolean m111011a() {
        return this.f5124e;
    }

    /* renamed from: b */
    public final boolean m111010b() {
        return this.f5120a;
    }

    /* renamed from: c */
    public final boolean m111009c() {
        return this.f5121b;
    }

    /* renamed from: d */
    public final EnumC35038Oq5 m111008d() {
        return this.f5122c;
    }

    /* renamed from: e */
    public final boolean m111007e() {
        return this.f5123d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D31)) {
            return false;
        }
        D31 d31 = (D31) obj;
        if (this.f5120a == d31.f5120a && this.f5121b == d31.f5121b && this.f5122c == d31.f5122c && this.f5123d == d31.f5123d && this.f5124e == d31.f5124e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f5120a) * 31) + Boolean.hashCode(this.f5121b)) * 31) + this.f5122c.hashCode()) * 31) + Boolean.hashCode(this.f5123d)) * 31) + Boolean.hashCode(this.f5124e);
    }

    public D31(boolean z, boolean z2, EnumC35038Oq5 securePolicy, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        this.f5120a = z;
        this.f5121b = z2;
        this.f5122c = securePolicy;
        this.f5123d = z3;
        this.f5124e = z4;
    }

    public /* synthetic */ D31(boolean z, boolean z2, EnumC35038Oq5 enumC35038Oq5, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? EnumC35038Oq5.Inherit : enumC35038Oq5, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4);
    }

    public /* synthetic */ D31(boolean z, boolean z2, EnumC35038Oq5 enumC35038Oq5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? EnumC35038Oq5.Inherit : enumC35038Oq5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D31(boolean z, boolean z2, EnumC35038Oq5 securePolicy) {
        this(z, z2, securePolicy, true, true);
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
    }
}
