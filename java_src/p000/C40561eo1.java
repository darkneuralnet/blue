package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0019"}, m28432d2 = {"Leo1;", "LpB6;", "Lg01;", "density", "Lpm2;", "layoutDirection", "", DateTokenConverter.CONVERTER_KEY, "c", C17296a.f69688o, "b", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "I", "leftVal", "topVal", "rightVal", "bottomVal", "<init>", "(IIII)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40561eo1 implements InterfaceC46724pB6 {

    /* renamed from: a */
    public final int f78882a;

    /* renamed from: b */
    public final int f78883b;

    /* renamed from: c */
    public final int f78884c;

    /* renamed from: d */
    public final int f78885d;

    public C40561eo1(int i, int i2, int i3, int i4) {
        this.f78882a = i;
        this.f78883b = i2;
        this.f78884c = i3;
        this.f78885d = i4;
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: a */
    public int mo8257a(InterfaceC41273g01 density, EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f78884c;
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: b */
    public int mo8256b(InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f78885d;
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: c */
    public int mo8255c(InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f78883b;
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: d */
    public int mo8254d(InterfaceC41273g01 density, EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f78882a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40561eo1)) {
            return false;
        }
        C40561eo1 c40561eo1 = (C40561eo1) obj;
        if (this.f78882a == c40561eo1.f78882a && this.f78883b == c40561eo1.f78883b && this.f78884c == c40561eo1.f78884c && this.f78885d == c40561eo1.f78885d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f78882a * 31) + this.f78883b) * 31) + this.f78884c) * 31) + this.f78885d;
    }

    public String toString() {
        return "Insets(left=" + this.f78882a + ", top=" + this.f78883b + ", right=" + this.f78884c + ", bottom=" + this.f78885d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
