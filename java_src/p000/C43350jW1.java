package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010\u0010J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0002R(\u0010\u0011\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0013\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010!\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\t\u0010\u001b\u0012\u0004\b \u0010\u0010\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"LjW1;", "", "key", "", "value", C17296a.f69688o, "b", "midIndex", "valueHash", "c", "I", "e", "()I", "g", "(I)V", "getSize$annotations", "()V", "size", "", "[Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()[Ljava/lang/Object;", "setKeys", "([Ljava/lang/Object;)V", "getKeys$annotations", UserMetadata.KEYDATA_FILENAME, "", "[I", "f", "()[I", "setValues", "([I)V", "getValues$annotations", "values", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jW1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43350jW1 {

    /* renamed from: a */
    public int f92869a;

    /* renamed from: b */
    public Object[] f92870b = new Object[4];

    /* renamed from: c */
    public int[] f92871c = new int[4];

    /* renamed from: a */
    public final int m30404a(Object key, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f92869a > 0) {
            i2 = m30403b(key);
            if (i2 >= 0) {
                int[] iArr = this.f92871c;
                int i3 = iArr[i2];
                iArr[i2] = i;
                return i3;
            }
        } else {
            i2 = -1;
        }
        int i4 = -(i2 + 1);
        int i5 = this.f92869a;
        Object[] objArr = this.f92870b;
        if (i5 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i6 = i4 + 1;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i6, i4, i5);
            ArraysKt___ArraysJvmKt.copyInto(this.f92871c, iArr2, i6, i4, this.f92869a);
            ArraysKt___ArraysJvmKt.copyInto$default(this.f92870b, objArr2, 0, 0, i4, 6, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto$default(this.f92871c, iArr2, 0, 0, i4, 6, (Object) null);
            this.f92870b = objArr2;
            this.f92871c = iArr2;
        } else {
            int i7 = i4 + 1;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i7, i4, i5);
            int[] iArr3 = this.f92871c;
            ArraysKt___ArraysJvmKt.copyInto(iArr3, iArr3, i7, i4, this.f92869a);
        }
        this.f92870b[i4] = key;
        this.f92871c[i4] = i;
        this.f92869a++;
        return -1;
    }

    /* renamed from: b */
    public final int m30403b(Object obj) {
        int i = this.f92869a - 1;
        int m114362a = C0521B6.m114362a(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f92870b[i3];
            int m114362a2 = C0521B6.m114362a(obj2);
            if (m114362a2 < m114362a) {
                i2 = i3 + 1;
            } else if (m114362a2 > m114362a) {
                i = i3 - 1;
            } else if (obj2 == obj) {
                return i3;
            } else {
                return m30402c(i3, obj, m114362a);
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: c */
    public final int m30402c(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.f92870b[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (C0521B6.m114362a(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.f92869a;
        while (true) {
            if (i4 < i5) {
                Object obj3 = this.f92870b[i4];
                if (obj3 == obj) {
                    return i4;
                }
                if (C0521B6.m114362a(obj3) != i2) {
                    break;
                }
                i4++;
            } else {
                i4 = this.f92869a;
                break;
            }
        }
        return -(i4 + 1);
    }

    /* renamed from: d */
    public final Object[] m30401d() {
        return this.f92870b;
    }

    /* renamed from: e */
    public final int m30400e() {
        return this.f92869a;
    }

    /* renamed from: f */
    public final int[] m30399f() {
        return this.f92871c;
    }

    /* renamed from: g */
    public final void m30398g(int i) {
        this.f92869a = i;
    }
}
