package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LI74;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "", C17296a.f69688o, "F", "b", "()F", "current", "Lkotlin/ranges/ClosedFloatingPointRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "c", "()Lkotlin/ranges/ClosedFloatingPointRange;", "range", "I", DateTokenConverter.CONVERTER_KEY, "()I", "steps", "<init>", "(FLkotlin/ranges/ClosedFloatingPointRange;I)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/ProgressBarRangeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1195:1\n1#2:1196\n*E\n"})
/* renamed from: I74 */
/* loaded from: classes.dex */
public final class I74 {

    /* renamed from: d */
    public static final C3328a f14536d = new C3328a(null);

    /* renamed from: e */
    public static final I74 f14537e;

    /* renamed from: a */
    public final float f14538a;

    /* renamed from: b */
    public final ClosedFloatingPointRange<Float> f14539b;

    /* renamed from: c */
    public final int f14540c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"LI74$a;", "", "LI74;", "Indeterminate", "LI74;", C17296a.f69688o, "()LI74;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: I74$a */
    /* loaded from: classes.dex */
    public static final class C3328a {
        public /* synthetic */ C3328a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final I74 m102934a() {
            return I74.f14537e;
        }

        private C3328a() {
        }
    }

    static {
        ClosedFloatingPointRange rangeTo;
        rangeTo = RangesKt__RangesKt.rangeTo(0.0f, 0.0f);
        f14537e = new I74(0.0f, rangeTo, 0, 4, null);
    }

    public I74(float f, ClosedFloatingPointRange<Float> range, int i) {
        Intrinsics.checkNotNullParameter(range, "range");
        this.f14538a = f;
        this.f14539b = range;
        this.f14540c = i;
        if (!(!Float.isNaN(f))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    /* renamed from: b */
    public final float m102937b() {
        return this.f14538a;
    }

    /* renamed from: c */
    public final ClosedFloatingPointRange<Float> m102936c() {
        return this.f14539b;
    }

    /* renamed from: d */
    public final int m102935d() {
        return this.f14540c;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I74)) {
            return false;
        }
        I74 i74 = (I74) obj;
        if (this.f14538a == i74.f14538a) {
            z = true;
        } else {
            z = false;
        }
        if (z && Intrinsics.areEqual(this.f14539b, i74.f14539b) && this.f14540c == i74.f14540c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f14538a) * 31) + this.f14539b.hashCode()) * 31) + this.f14540c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f14538a + ", range=" + this.f14539b + ", steps=" + this.f14540c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ I74(float f, ClosedFloatingPointRange closedFloatingPointRange, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, closedFloatingPointRange, (i2 & 4) != 0 ? 0 : i);
    }
}
