package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\u0005B)\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lia1;", "", "", "index", "", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "elementsCount", "", "e", "b", "c", "LMs5;", "LMs5;", "descriptor", "Lkotlin/Function2;", "", "Lkotlin/jvm/functions/Function2;", "readIfAbsent", "", "J", "lowerMarks", "[J", "highMarksArray", "<init>", "(LMs5;Lkotlin/jvm/functions/Function2;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: ia1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42793ia1 {

    /* renamed from: e */
    public static final C23287a f87481e = new C23287a(null);
    @Deprecated

    /* renamed from: f */
    public static final long[] f87482f = new long[0];

    /* renamed from: a */
    public final InterfaceC34588Ms5 f87483a;

    /* renamed from: b */
    public final Function2<InterfaceC34588Ms5, Integer, Boolean> f87484b;

    /* renamed from: c */
    public long f87485c;

    /* renamed from: d */
    public final long[] f87486d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lia1$a;", "", "", "EMPTY_HIGH_MARKS", "[J", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ia1$a */
    /* loaded from: classes8.dex */
    public static final class C23287a {
        public /* synthetic */ C23287a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C23287a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C42793ia1(InterfaceC34588Ms5 descriptor, Function2<? super InterfaceC34588Ms5, ? super Integer, Boolean> readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f87483a = descriptor;
        this.f87484b = readIfAbsent;
        int mo10459e = descriptor.mo10459e();
        if (mo10459e <= 64) {
            this.f87485c = mo10459e != 64 ? (-1) << mo10459e : 0L;
            this.f87486d = f87482f;
            return;
        }
        this.f87485c = 0L;
        this.f87486d = m33795e(mo10459e);
    }

    /* renamed from: a */
    public final void m33799a(int i) {
        if (i < 64) {
            this.f87485c |= 1 << i;
        } else {
            m33798b(i);
        }
    }

    /* renamed from: b */
    public final void m33798b(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.f87486d;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    /* renamed from: c */
    public final int m33797c() {
        int length = this.f87486d.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i2 * 64;
            long j = this.f87486d[i];
            while (j != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << numberOfTrailingZeros;
                int i4 = numberOfTrailingZeros + i3;
                if (this.f87484b.invoke(this.f87483a, Integer.valueOf(i4)).booleanValue()) {
                    this.f87486d[i] = j;
                    return i4;
                }
            }
            this.f87486d[i] = j;
            i = i2;
        }
        return -1;
    }

    /* renamed from: d */
    public final int m33796d() {
        int numberOfTrailingZeros;
        int mo10459e = this.f87483a.mo10459e();
        do {
            long j = this.f87485c;
            if (j != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                this.f87485c |= 1 << numberOfTrailingZeros;
            } else if (mo10459e > 64) {
                return m33797c();
            } else {
                return -1;
            }
        } while (!this.f87484b.invoke(this.f87483a, Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }

    /* renamed from: e */
    public final long[] m33795e(int i) {
        int lastIndex;
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
            jArr[lastIndex] = (-1) << i;
        }
        return jArr;
    }
}
