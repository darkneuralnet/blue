package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0006J$\u0010\r\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016¨\u0006 "}, m28432d2 = {"Luo6;", "", "", "timeMillis", "", "dataPoint", "", C17296a.f69688o, "c", DateTokenConverter.CONVERTER_KEY, "", "dataPoints", "time", "b", "", "Z", "isDataDifferential", "()Z", "Luo6$a;", "Luo6$a;", "strategy", "", "I", "minSampleSize", "", "LPS0;", "[LPS0;", "samples", "e", "index", "<init>", "(ZLuo6$a;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uo6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50053uo6 {

    /* renamed from: a */
    public final boolean f113012a;

    /* renamed from: b */
    public final EnumC29310a f113013b;

    /* renamed from: c */
    public final int f113014c;

    /* renamed from: d */
    public final PS0[] f113015d;

    /* renamed from: e */
    public int f113016e;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Luo6$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uo6$a */
    /* loaded from: classes.dex */
    public enum EnumC29310a {
        Lsq2,
        Impulse
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: uo6$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C29311b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC29310a.values().length];
            try {
                iArr[EnumC29310a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC29310a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C50053uo6() {
        this(false, null, 3, null);
    }

    /* renamed from: a */
    public final void m9716a(long j, float f) {
        int i = (this.f113016e + 1) % 20;
        this.f113016e = i;
        C51238wo6.m6302g(this.f113015d, i, j, f);
    }

    /* renamed from: b */
    public final float m9715b(List<Float> list, List<Float> list2) {
        try {
            return C51238wo6.m6303f(list2, list, 2).get(1).floatValue();
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    /* renamed from: c */
    public final float m9714c() {
        float m6305d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = this.f113016e;
        PS0 ps0 = this.f113015d[i];
        if (ps0 == null) {
            return 0.0f;
        }
        int i2 = 0;
        PS0 ps02 = ps0;
        while (true) {
            PS0 ps03 = this.f113015d[i];
            if (ps03 != null) {
                float m90244b = (float) (ps0.m90244b() - ps03.m90244b());
                float abs = (float) Math.abs(ps03.m90244b() - ps02.m90244b());
                if (m90244b > 100.0f || abs > 40.0f) {
                    break;
                }
                arrayList.add(Float.valueOf(ps03.m90245a()));
                arrayList2.add(Float.valueOf(-m90244b));
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                ps02 = ps03;
            } else {
                break;
            }
        }
        if (i2 < this.f113014c) {
            return 0.0f;
        }
        int i3 = C29311b.$EnumSwitchMapping$0[this.f113013b.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                m6305d = m9715b(arrayList, arrayList2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            m6305d = C51238wo6.m6305d(arrayList, arrayList2, this.f113012a);
        }
        return m6305d * 1000;
    }

    /* renamed from: d */
    public final void m9713d() {
        ArraysKt___ArraysJvmKt.fill$default(this.f113015d, (Object) null, 0, 0, 6, (Object) null);
        this.f113016e = 0;
    }

    public C50053uo6(boolean z, EnumC29310a strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f113012a = z;
        this.f113013b = strategy;
        if (z && strategy.equals(EnumC29310a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i = C29311b.$EnumSwitchMapping$0[strategy.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 3;
        }
        this.f113014c = i2;
        PS0[] ps0Arr = new PS0[20];
        for (int i3 = 0; i3 < 20; i3++) {
            ps0Arr[i3] = null;
        }
        this.f113015d = ps0Arr;
    }

    public /* synthetic */ C50053uo6(boolean z, EnumC29310a enumC29310a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? EnumC29310a.Lsq2 : enumC29310a);
    }
}
