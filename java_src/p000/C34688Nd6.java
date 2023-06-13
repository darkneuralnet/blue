package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"LNd6;", "LpB6;", "Lg01;", "density", "Lpm2;", "layoutDirection", "", DateTokenConverter.CONVERTER_KEY, "c", C17296a.f69688o, "b", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "toString", "LpB6;", "first", "second", "<init>", "(LpB6;LpB6;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Nd6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34688Nd6 implements InterfaceC46724pB6 {

    /* renamed from: a */
    public final InterfaceC46724pB6 f24878a;

    /* renamed from: b */
    public final InterfaceC46724pB6 f24879b;

    public C34688Nd6(InterfaceC46724pB6 first, InterfaceC46724pB6 second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.f24878a = first;
        this.f24879b = second;
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: a */
    public int mo8257a(InterfaceC41273g01 density, EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f24878a.mo8257a(density, layoutDirection), this.f24879b.mo8257a(density, layoutDirection));
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: b */
    public int mo8256b(InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Math.max(this.f24878a.mo8256b(density), this.f24879b.mo8256b(density));
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: c */
    public int mo8255c(InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Math.max(this.f24878a.mo8255c(density), this.f24879b.mo8255c(density));
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: d */
    public int mo8254d(InterfaceC41273g01 density, EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f24878a.mo8254d(density, layoutDirection), this.f24879b.mo8254d(density, layoutDirection));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34688Nd6)) {
            return false;
        }
        C34688Nd6 c34688Nd6 = (C34688Nd6) obj;
        if (Intrinsics.areEqual(c34688Nd6.f24878a, this.f24878a) && Intrinsics.areEqual(c34688Nd6.f24879b, this.f24879b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f24878a.hashCode() + (this.f24879b.hashCode() * 31);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f24878a + " ∪ " + this.f24879b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
