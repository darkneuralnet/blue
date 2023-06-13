package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lz36;", "", "", "key", "b", "value", "", DateTokenConverter.CONVERTER_KEY, "c", "", C17296a.f69688o, "I", "size", "", "[J", UserMetadata.KEYDATA_FILENAME, "", "[Ljava/lang/Object;", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThreadMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,111:1\n12904#2,3:112\n*S KotlinDebug\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:112,3\n*E\n"})
/* renamed from: z36  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52573z36 {

    /* renamed from: a */
    public final int f120707a;

    /* renamed from: b */
    public final long[] f120708b;

    /* renamed from: c */
    public final Object[] f120709c;

    public C52573z36(int i, long[] keys, Object[] values) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f120707a = i;
        this.f120708b = keys;
        this.f120709c = values;
    }

    /* renamed from: a */
    public final int m1865a(long j) {
        int i = this.f120707a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i != 0) {
            while (i2 <= i) {
                int i3 = (i2 + i) >>> 1;
                int i4 = ((this.f120708b[i3] - j) > 0L ? 1 : ((this.f120708b[i3] - j) == 0L ? 0 : -1));
                if (i4 < 0) {
                    i2 = i3 + 1;
                } else if (i4 > 0) {
                    i = i3 - 1;
                } else {
                    return i3;
                }
            }
            return -(i2 + 1);
        }
        long j2 = this.f120708b[0];
        if (j2 == j) {
            return 0;
        }
        if (j2 <= j) {
            return -1;
        }
        return -2;
    }

    /* renamed from: b */
    public final Object m1864b(long j) {
        int m1865a = m1865a(j);
        if (m1865a >= 0) {
            return this.f120709c[m1865a];
        }
        return null;
    }

    /* renamed from: c */
    public final C52573z36 m1863c(long j, Object obj) {
        int i = this.f120707a;
        Object[] objArr = this.f120709c;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= length) {
                break;
            }
            if (objArr[i3] == null) {
                z = false;
            }
            if (z) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = this.f120708b[i6];
                Object obj2 = this.f120709c[i6];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr[i7] = j;
                objArr2[i7] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = this.f120708b[i6];
                    Object obj3 = this.f120709c[i6];
                    if (obj3 != null) {
                        jArr[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new C52573z36(i5, jArr, objArr2);
    }

    /* renamed from: d */
    public final boolean m1862d(long j, Object obj) {
        int m1865a = m1865a(j);
        if (m1865a < 0) {
            return false;
        }
        this.f120709c[m1865a] = obj;
        return true;
    }
}
