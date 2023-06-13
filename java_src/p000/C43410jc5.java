package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireRoute;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"Ljc5;", "Lqi0;", "Lco/bird/android/model/wire/WireRoute;", "route", "", "checked", "e", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "b", "Lco/bird/android/model/wire/WireRoute;", "f", "()Lco/bird/android/model/wire/WireRoute;", "c", "Z", C17296a.f69688o, "()Z", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "()Ljava/lang/String;", "title", "enabled", "details", "<init>", "(Lco/bird/android/model/wire/WireRoute;Z)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jc5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43410jc5 extends AbstractC47616qi0 {

    /* renamed from: b */
    public final WireRoute f93021b;

    /* renamed from: c */
    public final boolean f93022c;

    /* renamed from: d */
    public final String f93023d;

    /* renamed from: e */
    public final boolean f93024e;

    /* renamed from: f */
    public final String f93025f;

    public C43410jc5(WireRoute route, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(route, "route");
        this.f93021b = route;
        this.f93022c = z;
        this.f93023d = route.getRouteDisplay();
        Boolean disabled = route.getDisabled();
        Boolean bool = Boolean.TRUE;
        this.f93024e = !Intrinsics.areEqual(disabled, bool);
        if (Intrinsics.areEqual(route.getDisabled(), bool)) {
            str = route.getDisabledMessage();
        } else {
            str = null;
        }
        this.f93025f = str;
    }

    public static /* synthetic */ C43410jc5 copy$default(C43410jc5 c43410jc5, WireRoute wireRoute, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            wireRoute = c43410jc5.f93021b;
        }
        if ((i & 2) != 0) {
            z = c43410jc5.f93022c;
        }
        return c43410jc5.m30201e(wireRoute, z);
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: a */
    public boolean mo3250a() {
        return this.f93022c;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: b */
    public String mo3249b() {
        return this.f93025f;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: c */
    public boolean mo3248c() {
        return this.f93024e;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: d */
    public String mo3247d() {
        return this.f93023d;
    }

    /* renamed from: e */
    public final C43410jc5 m30201e(WireRoute route, boolean z) {
        Intrinsics.checkNotNullParameter(route, "route");
        return new C43410jc5(route, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43410jc5) {
            C43410jc5 c43410jc5 = (C43410jc5) obj;
            return Intrinsics.areEqual(this.f93021b, c43410jc5.f93021b) && this.f93022c == c43410jc5.f93022c;
        }
        return false;
    }

    /* renamed from: f */
    public final WireRoute m30200f() {
        return this.f93021b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f93021b.hashCode() * 31;
        boolean z = this.f93022c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        WireRoute wireRoute = this.f93021b;
        boolean z = this.f93022c;
        return "RouteViewModel(route=" + wireRoute + ", checked=" + z + ")";
    }
}
