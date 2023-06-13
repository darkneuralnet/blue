package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010(\u001a\u00020\u0005¢\u0006\u0004\b)\u0010&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\b\u0010\b\u001a\u00020\u0005H\u0004J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u001a\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0011J\u0006\u0010\u0013\u001a\u00020\tJ\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\"\u0010'\u001a\u00020\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, m28432d2 = {"LMA5;", "K", "V", "", "key", "", "hash", "c", "e", "", C17296a.f69688o, "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "g", "(I)Ljava/lang/Object;", "i", "f", "value", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "", "toString", "", "[I", "hashes", "", "[Ljava/lang/Object;", "keyValues", "I", "get_size", "()I", "set_size", "(I)V", "_size", "capacity", "<init>", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: MA5 */
/* loaded from: classes.dex */
public final class MA5<K, V> {

    /* renamed from: a */
    public int[] f22781a;

    /* renamed from: b */
    public Object[] f22782b;

    /* renamed from: c */
    public int f22783c;

    @JvmOverloads
    public MA5() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public final boolean m95623a(K k) {
        return m95620d(k) >= 0;
    }

    /* renamed from: b */
    public final V m95622b(K k) {
        int m95620d = m95620d(k);
        if (m95620d >= 0) {
            return (V) this.f22782b[(m95620d << 1) + 1];
        }
        return null;
    }

    /* renamed from: c */
    public final int m95621c(Object key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i2 = this.f22783c;
        if (i2 == 0) {
            return -1;
        }
        int m4356a = C51935xz0.m4356a(this.f22781a, i2, i);
        if (m4356a < 0) {
            return m4356a;
        }
        if (Intrinsics.areEqual(key, this.f22782b[m4356a << 1])) {
            return m4356a;
        }
        int i3 = m4356a + 1;
        while (i3 < i2 && this.f22781a[i3] == i) {
            if (Intrinsics.areEqual(key, this.f22782b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m4356a - 1; i4 >= 0 && this.f22781a[i4] == i; i4--) {
            if (Intrinsics.areEqual(key, this.f22782b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: d */
    public final int m95620d(Object obj) {
        return obj == null ? m95619e() : m95621c(obj, obj.hashCode());
    }

    /* renamed from: e */
    public final int m95619e() {
        int i = this.f22783c;
        if (i == 0) {
            return -1;
        }
        int m4356a = C51935xz0.m4356a(this.f22781a, i, 0);
        if (m4356a < 0) {
            return m4356a;
        }
        if (this.f22782b[m4356a << 1] == null) {
            return m4356a;
        }
        int i2 = m4356a + 1;
        while (i2 < i && this.f22781a[i2] == 0) {
            if (this.f22782b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m4356a - 1; i3 >= 0 && this.f22781a[i3] == 0; i3--) {
            if (this.f22782b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof MA5) {
                MA5 ma5 = (MA5) obj;
                int i = this.f22783c;
                if (i != ma5.f22783c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    K m95617g = m95617g(i2);
                    V m95615i = m95615i(i2);
                    Object m95622b = ma5.m95622b(m95617g);
                    if (m95615i == null) {
                        if (m95622b != null || !ma5.m95623a(m95617g)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(m95615i, m95622b)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f22783c != ((Map) obj).size()) {
                return false;
            } else {
                int i3 = this.f22783c;
                for (int i4 = 0; i4 < i3; i4++) {
                    K m95617g2 = m95617g(i4);
                    V m95615i2 = m95615i(i4);
                    Object obj2 = ((Map) obj).get(m95617g2);
                    if (m95615i2 == null) {
                        if (obj2 != null || !((Map) obj).containsKey(m95617g2)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(m95615i2, obj2)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m95618f() {
        return this.f22783c <= 0;
    }

    /* renamed from: g */
    public final K m95617g(int i) {
        return (K) this.f22782b[i << 1];
    }

    /* renamed from: h */
    public final V m95616h(K k, V v) {
        int hashCode;
        int m95621c;
        int i = this.f22783c;
        if (k == null) {
            m95621c = m95619e();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            m95621c = m95621c(k, hashCode);
        }
        if (m95621c >= 0) {
            int i2 = (m95621c << 1) + 1;
            Object[] objArr = this.f22782b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~m95621c;
        int[] iArr = this.f22781a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f22781a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22782b, i4 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f22782b = copyOf2;
            if (i != this.f22783c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f22781a;
            int i5 = i3 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f22782b;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i5 << 1, i3 << 1, this.f22783c << 1);
        }
        int i6 = this.f22783c;
        if (i == i6) {
            int[] iArr3 = this.f22781a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.f22782b;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.f22783c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int i;
        int[] iArr = this.f22781a;
        Object[] objArr = this.f22782b;
        int i2 = this.f22783c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    /* renamed from: i */
    public final V m95615i(int i) {
        return (V) this.f22782b[(i << 1) + 1];
    }

    public String toString() {
        if (m95618f()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22783c * 28);
        sb.append(CoreConstants.CURLY_LEFT);
        int i = this.f22783c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K m95617g = m95617g(i2);
            if (m95617g != this) {
                sb.append(m95617g);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m95615i = m95615i(i2);
            if (m95615i != this) {
                sb.append(m95615i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
        return sb2;
    }

    @JvmOverloads
    public MA5(int i) {
        if (i == 0) {
            this.f22781a = C51935xz0.f118495a;
            this.f22782b = C51935xz0.f118496b;
        } else {
            this.f22781a = new int[i];
            this.f22782b = new Object[i << 1];
        }
        this.f22783c = 0;
    }

    public /* synthetic */ MA5(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
