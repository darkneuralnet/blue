package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"Lvh1;", "LpB6;", "Lg01;", "density", "Lpm2;", "layoutDirection", "", DateTokenConverter.CONVERTER_KEY, "c", C17296a.f69688o, "b", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "LpB6;", "included", "excluded", "<init>", "(LpB6;LpB6;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50570vh1 implements InterfaceC46724pB6 {

    /* renamed from: a */
    public final InterfaceC46724pB6 f114502a;

    /* renamed from: b */
    public final InterfaceC46724pB6 f114503b;

    public C50570vh1(InterfaceC46724pB6 included, InterfaceC46724pB6 excluded) {
        Intrinsics.checkNotNullParameter(included, "included");
        Intrinsics.checkNotNullParameter(excluded, "excluded");
        this.f114502a = included;
        this.f114503b = excluded;
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: a */
    public int mo8257a(InterfaceC41273g01 density, EnumC47065pm2 layoutDirection) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(this.f114502a.mo8257a(density, layoutDirection) - this.f114503b.mo8257a(density, layoutDirection), 0);
        return coerceAtLeast;
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: b */
    public int mo8256b(InterfaceC41273g01 density) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(density, "density");
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(this.f114502a.mo8256b(density) - this.f114503b.mo8256b(density), 0);
        return coerceAtLeast;
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: c */
    public int mo8255c(InterfaceC41273g01 density) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(density, "density");
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(this.f114502a.mo8255c(density) - this.f114503b.mo8255c(density), 0);
        return coerceAtLeast;
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: d */
    public int mo8254d(InterfaceC41273g01 density, EnumC47065pm2 layoutDirection) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(this.f114502a.mo8254d(density, layoutDirection) - this.f114503b.mo8254d(density, layoutDirection), 0);
        return coerceAtLeast;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50570vh1)) {
            return false;
        }
        C50570vh1 c50570vh1 = (C50570vh1) obj;
        if (Intrinsics.areEqual(c50570vh1.f114502a, this.f114502a) && Intrinsics.areEqual(c50570vh1.f114503b, this.f114503b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f114502a.hashCode() * 31) + this.f114503b.hashCode();
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f114502a + " - " + this.f114503b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
