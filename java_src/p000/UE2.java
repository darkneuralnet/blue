package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u000b\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LUE2;", "", "", "i", "b", "", "shape", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "I", "capacity", "", "<set-?>", "[F", "()[F", MessageExtension.FIELD_DATA, "c", "[I", "()I", "shapeSize", "<init>", "([I)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: UE2 */
/* loaded from: classes5.dex */
public final class UE2 {

    /* renamed from: d */
    public static final C8235a f37102d = new C8235a(null);

    /* renamed from: a */
    public int f37103a;

    /* renamed from: b */
    public float[] f37104b;

    /* renamed from: c */
    public int[] f37105c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\b"}, m28432d2 = {"LUE2$a;", "", "", "shape", "", "b", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: UE2$a */
    /* loaded from: classes5.dex */
    public static final class C8235a {
        private C8235a() {
        }

        /* renamed from: b */
        public final int m81793b(int[] iArr) {
            boolean z;
            int lastIndex;
            int i = 1;
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int i2 = iArr[0];
                lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
                if (1 <= lastIndex) {
                    while (true) {
                        i2 *= iArr[i];
                        if (i == lastIndex) {
                            break;
                        }
                        i++;
                    }
                }
                return i2;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }

        public /* synthetic */ C8235a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UE2(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f37105c = shape;
        int m81793b = f37102d.m81793b(shape);
        this.f37103a = m81793b;
        this.f37104b = new float[m81793b];
    }

    /* renamed from: a */
    public final float[] m81798a() {
        return this.f37104b;
    }

    /* renamed from: b */
    public final int m81797b(int i) {
        return this.f37105c[i];
    }

    /* renamed from: c */
    public final int m81796c() {
        return this.f37105c.length;
    }

    /* renamed from: d */
    public final void m81795d(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f37105c = shape;
        int m81793b = f37102d.m81793b(shape);
        float[] fArr = new float[m81793b];
        System.arraycopy(this.f37104b, 0, fArr, 0, Math.min(this.f37103a, m81793b));
        this.f37104b = fArr;
        this.f37103a = m81793b;
    }
}
