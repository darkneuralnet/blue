package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\"\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, m28432d2 = {"LL9;", "", "position1", "position2", "c", "LYM1;", C17296a.f69688o, "LYM1;", "()LYM1;", "FirstBaseline", "b", "LastBaseline", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: N9 */
/* loaded from: classes.dex */
public final class C5482N9 {

    /* renamed from: a */
    public static final YM1 f24191a = new YM1(C5483a.f24193b);

    /* renamed from: b */
    public static final YM1 f24192b = new YM1(C5484b.f24194b);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: N9$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C5483a extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {

        /* renamed from: b */
        public static final C5483a f24193b = new C5483a();

        public C5483a() {
            super(2, MathKt.class, "min", "min(II)I", 1);
        }

        /* renamed from: a */
        public final Integer m94311a(int i, int i2) {
            return Integer.valueOf(Math.min(i, i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return m94311a(num.intValue(), num2.intValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: N9$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C5484b extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {

        /* renamed from: b */
        public static final C5484b f24194b = new C5484b();

        public C5484b() {
            super(2, MathKt.class, "max", "max(II)I", 1);
        }

        /* renamed from: a */
        public final Integer m94310a(int i, int i2) {
            return Integer.valueOf(Math.max(i, i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return m94310a(num.intValue(), num2.intValue());
        }
    }

    /* renamed from: a */
    public static final YM1 m94314a() {
        return f24191a;
    }

    /* renamed from: b */
    public static final YM1 m94313b() {
        return f24192b;
    }

    /* renamed from: c */
    public static final int m94312c(AbstractC4750L9 abstractC4750L9, int i, int i2) {
        Intrinsics.checkNotNullParameter(abstractC4750L9, "<this>");
        return abstractC4750L9.m97656a().invoke(Integer.valueOf(i), Integer.valueOf(i2)).intValue();
    }
}
