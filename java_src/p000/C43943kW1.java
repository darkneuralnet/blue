package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0012\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\b\b\u0002\u0010&\u001a\u00020\u0011¢\u0006\u0004\b'\u0010$J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\nJ\u0006\u0010\u0010\u001a\u00020\fJ\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u0011H\u0002R*\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010%\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"LkW1;", "", "Key", "Value", "", "i", "key", "b", "(Ljava/lang/Object;)Z", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "", "k", "(Ljava/lang/Object;Ljava/lang/Object;)V", "j", C17296a.f69688o, "", "c", "midIndex", "keyHash", DateTokenConverter.CONVERTER_KEY, "", "[Ljava/lang/Object;", "f", "()[Ljava/lang/Object;", "setKeys$runtime_release", "([Ljava/lang/Object;)V", UserMetadata.KEYDATA_FILENAME, "h", "setValues$runtime_release", "values", "I", "g", "()I", "l", "(I)V", "size", "capacity", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentityArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,208:1\n118#1,22:209\n*S KotlinDebug\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n142#1:209,22\n*E\n"})
/* renamed from: kW1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43943kW1<Key, Value> {

    /* renamed from: a */
    public Object[] f94455a;

    /* renamed from: b */
    public Object[] f94456b;

    /* renamed from: c */
    public int f94457c;

    public C43943kW1() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public final void m28901a() {
        this.f94457c = 0;
        ArraysKt___ArraysJvmKt.fill$default(this.f94455a, (Object) null, 0, 0, 6, (Object) null);
        ArraysKt___ArraysJvmKt.fill$default(this.f94456b, (Object) null, 0, 0, 6, (Object) null);
    }

    /* renamed from: b */
    public final boolean m28900b(Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (m28899c(key) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int m28899c(Object obj) {
        int m114362a = C0521B6.m114362a(obj);
        int i = this.f94457c - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f94455a[i3];
            int m114362a2 = C0521B6.m114362a(obj2);
            if (m114362a2 < m114362a) {
                i2 = i3 + 1;
            } else if (m114362a2 > m114362a) {
                i = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                return m28898d(i3, obj, m114362a);
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: d */
    public final int m28898d(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.f94455a[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (C0521B6.m114362a(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.f94457c;
        while (true) {
            if (i4 < i5) {
                Object obj3 = this.f94455a[i4];
                if (obj3 == obj) {
                    return i4;
                }
                if (C0521B6.m114362a(obj3) != i2) {
                    break;
                }
                i4++;
            } else {
                i4 = this.f94457c;
                break;
            }
        }
        return -(i4 + 1);
    }

    /* renamed from: e */
    public final Value m28897e(Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int m28899c = m28899c(key);
        if (m28899c >= 0) {
            return (Value) this.f94456b[m28899c];
        }
        return null;
    }

    /* renamed from: f */
    public final Object[] m28896f() {
        return this.f94455a;
    }

    /* renamed from: g */
    public final int m28895g() {
        return this.f94457c;
    }

    /* renamed from: h */
    public final Object[] m28894h() {
        return this.f94456b;
    }

    /* renamed from: i */
    public final boolean m28893i() {
        return this.f94457c > 0;
    }

    /* renamed from: j */
    public final Value m28892j(Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int m28899c = m28899c(key);
        if (m28899c < 0) {
            return null;
        }
        Object[] objArr = this.f94456b;
        Value value = (Value) objArr[m28899c];
        int i = this.f94457c;
        Object[] objArr2 = this.f94455a;
        int i2 = m28899c + 1;
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, m28899c, i2, i);
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, m28899c, i2, i);
        int i3 = i - 1;
        objArr2[i3] = null;
        objArr[i3] = null;
        this.f94457c = i3;
        return value;
    }

    /* renamed from: k */
    public final void m28891k(Key key, Value value) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        Intrinsics.checkNotNullParameter(key, "key");
        int m28899c = m28899c(key);
        if (m28899c >= 0) {
            this.f94456b[m28899c] = value;
            return;
        }
        int i = -(m28899c + 1);
        int i2 = this.f94457c;
        Object[] objArr3 = this.f94455a;
        if (i2 == objArr3.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            objArr = new Object[i2 * 2];
        } else {
            objArr = objArr3;
        }
        int i3 = i + 1;
        ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr, i3, i, i2);
        if (z) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.f94455a, objArr, 0, 0, i, 6, (Object) null);
        }
        objArr[i] = key;
        this.f94455a = objArr;
        if (z) {
            objArr2 = new Object[this.f94457c * 2];
        } else {
            objArr2 = this.f94456b;
        }
        ArraysKt___ArraysJvmKt.copyInto(this.f94456b, objArr2, i3, i, this.f94457c);
        if (z) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.f94456b, objArr2, 0, 0, i, 6, (Object) null);
        }
        objArr2[i] = value;
        this.f94456b = objArr2;
        this.f94457c++;
    }

    /* renamed from: l */
    public final void m28890l(int i) {
        this.f94457c = i;
    }

    public C43943kW1(int i) {
        this.f94455a = new Object[i];
        this.f94456b = new Object[i];
    }

    public /* synthetic */ C43943kW1(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
