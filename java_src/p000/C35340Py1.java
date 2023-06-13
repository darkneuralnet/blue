package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J \u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0000J\u0017\u0010\f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\tJ\u0010\u0010\r\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0000J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00048FX\u0086\u0084\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u001b\u0010\"\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010!\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, m28432d2 = {"LPy1;", "", "", "lastNanoseconds", "Lkotlin/time/Duration;", "g", "(Ljava/lang/Long;)J", "", "i", "(Ljava/lang/Long;)D", "frameTime", "h", "b", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "J", "f", "()J", "nanoseconds", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "c", "Lkotlin/Lazy;", "getInterval-UwyO8pc", "interval", DateTokenConverter.CONVERTER_KEY, "()D", "intervalSeconds", "fps", "<init>", "(JLjava/lang/Long;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Py1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35340Py1 {

    /* renamed from: a */
    public final long f29484a;

    /* renamed from: b */
    public final Long f29485b;

    /* renamed from: c */
    public final Lazy f29486c;

    /* renamed from: d */
    public final Lazy f29487d;

    /* renamed from: e */
    public final Lazy f29488e;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Py1$a */
    /* loaded from: classes6.dex */
    public static final class C6599a extends Lambda implements Function0<Double> {
        public C6599a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Double invoke() {
            C35340Py1 c35340Py1 = C35340Py1.this;
            return Double.valueOf(c35340Py1.m89223b(c35340Py1.m89220e()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lkotlin/time/Duration;", "b", "()J"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: Py1$b */
    /* loaded from: classes6.dex */
    public static final class C6600b extends Lambda implements Function0<Duration> {
        public C6600b() {
            super(0);
        }

        /* renamed from: b */
        public final long m89215b() {
            C35340Py1 c35340Py1 = C35340Py1.this;
            return c35340Py1.m89218g(c35340Py1.m89220e());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Duration invoke() {
            return Duration.m118138boximpl(m89215b());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Py1$c */
    /* loaded from: classes6.dex */
    public static final class C6601c extends Lambda implements Function0<Double> {
        public C6601c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Double invoke() {
            C35340Py1 c35340Py1 = C35340Py1.this;
            return Double.valueOf(c35340Py1.m89216i(c35340Py1.m89220e()));
        }
    }

    public C35340Py1(long j, Long l) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        this.f29484a = j;
        this.f29485b = l;
        lazy = LazyKt__LazyJVMKt.lazy(new C6600b());
        this.f29486c = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C6601c());
        this.f29487d = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C6599a());
        this.f29488e = lazy3;
    }

    /* renamed from: a */
    public final double m89224a(C35340Py1 c35340Py1) {
        return m89223b(c35340Py1 != null ? Long.valueOf(c35340Py1.f29484a) : null);
    }

    /* renamed from: b */
    public final double m89223b(Long l) {
        return 1.0d / m89216i(l);
    }

    /* renamed from: c */
    public final double m89222c() {
        return ((Number) this.f29488e.getValue()).doubleValue();
    }

    /* renamed from: d */
    public final double m89221d() {
        return ((Number) this.f29487d.getValue()).doubleValue();
    }

    /* renamed from: e */
    public final Long m89220e() {
        return this.f29485b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35340Py1) {
            C35340Py1 c35340Py1 = (C35340Py1) obj;
            return this.f29484a == c35340Py1.f29484a && Intrinsics.areEqual(this.f29485b, c35340Py1.f29485b);
        }
        return false;
    }

    /* renamed from: f */
    public final long m89219f() {
        return this.f29484a;
    }

    /* renamed from: g */
    public final long m89218g(Long l) {
        Duration.Companion companion = Duration.Companion;
        return DurationKt.toDuration(this.f29484a - (l != null ? l.longValue() : 0L), DurationUnit.NANOSECONDS);
    }

    /* renamed from: h */
    public final double m89217h(C35340Py1 c35340Py1) {
        return m89216i(c35340Py1 != null ? c35340Py1.f29485b : null);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f29484a) * 31;
        Long l = this.f29485b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    /* renamed from: i */
    public final double m89216i(Long l) {
        return Duration.m118183toDoubleimpl(m89218g(l), DurationUnit.SECONDS);
    }

    public String toString() {
        return "FrameTime(nanoseconds=" + this.f29484a + ", lastNanoseconds=" + this.f29485b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ C35340Py1(long j, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : l);
    }
}
