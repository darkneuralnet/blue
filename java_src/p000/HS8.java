package p000;

import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.UByte;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* renamed from: HS8 */
/* loaded from: classes6.dex */
public final class HS8<K, V> extends AbstractC50417vQ8<K, V> {

    /* renamed from: h */
    public static final AbstractC50417vQ8<Object, Object> f13418h = new HS8(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object f13419e;

    /* renamed from: f */
    public final transient Object[] f13420f;

    /* renamed from: g */
    public final transient int f13421g;

    public HS8(Object obj, Object[] objArr, int i) {
        this.f13419e = obj;
        this.f13420f = objArr;
        this.f13421g = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <K, V> HS8<K, V> m103848g(int i, Object[] objArr) {
        byte[] bArr;
        if (i == 0) {
            return (HS8) f13418h;
        }
        Object obj = null;
        int i2 = 0;
        if (i == 1) {
            C44462lN8.m27367a(objArr[0], objArr[1]);
            return new HS8<>(null, objArr, 1);
        }
        C52142yK8.m3663b(i, objArr.length >> 1, "index");
        int m86762o = RQ8.m86762o(i);
        if (i == 1) {
            C44462lN8.m27367a(objArr[0], objArr[1]);
        } else {
            int i3 = m86762o - 1;
            if (m86762o <= 128) {
                bArr = new byte[m86762o];
                Arrays.fill(bArr, (byte) -1);
                while (i2 < i) {
                    int i4 = i2 + i2;
                    Object obj2 = objArr[i4];
                    Object obj3 = objArr[i4 ^ 1];
                    C44462lN8.m27367a(obj2, obj3);
                    int m17542a = C47436qO8.m17542a(obj2.hashCode());
                    while (true) {
                        int i5 = m17542a & i3;
                        int i6 = bArr[i5] & KotlinVersion.MAX_COMPONENT_VALUE;
                        if (i6 == 255) {
                            break;
                        } else if (!objArr[i6].equals(obj2)) {
                            m17542a = i5 + 1;
                        } else {
                            throw m103847h(obj2, obj3, objArr, i6);
                        }
                    }
                }
            } else if (m86762o <= 32768) {
                bArr = new short[m86762o];
                Arrays.fill(bArr, (short) -1);
                while (i2 < i) {
                    int i7 = i2 + i2;
                    Object obj4 = objArr[i7];
                    Object obj5 = objArr[i7 ^ 1];
                    C44462lN8.m27367a(obj4, obj5);
                    int m17542a2 = C47436qO8.m17542a(obj4.hashCode());
                    while (true) {
                        int i8 = m17542a2 & i3;
                        char c = (char) bArr[i8];
                        if (c == 65535) {
                            break;
                        } else if (!objArr[c].equals(obj4)) {
                            m17542a2 = i8 + 1;
                        } else {
                            throw m103847h(obj4, obj5, objArr, c);
                        }
                    }
                }
            } else {
                bArr = new int[m86762o];
                Arrays.fill((int[]) bArr, -1);
                while (i2 < i) {
                    int i9 = i2 + i2;
                    Object obj6 = objArr[i9];
                    Object obj7 = objArr[i9 ^ 1];
                    C44462lN8.m27367a(obj6, obj7);
                    int m17542a3 = C47436qO8.m17542a(obj6.hashCode());
                    while (true) {
                        int i10 = m17542a3 & i3;
                        ?? r8 = bArr[i10];
                        if (r8 == -1) {
                            break;
                        } else if (!objArr[r8].equals(obj6)) {
                            m17542a3 = i10 + 1;
                        } else {
                            throw m103847h(obj6, obj7, objArr, r8);
                        }
                    }
                }
            }
            obj = bArr;
        }
        return new HS8<>(obj, objArr, i);
    }

    /* renamed from: h */
    public static IllegalArgumentException m103847h(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    @Override // p000.AbstractC50417vQ8
    /* renamed from: a */
    public final XO8<V> mo8684a() {
        return new C51028wS8(this.f13420f, 1, this.f13421g);
    }

    @Override // p000.AbstractC50417vQ8
    /* renamed from: d */
    public final RQ8<Map.Entry<K, V>> mo8681d() {
        return new C38560bS8(this, this.f13420f, 0, this.f13421g);
    }

    @Override // p000.AbstractC50417vQ8
    /* renamed from: e */
    public final RQ8<K> mo8680e() {
        return new C45100mS8(this, new C51028wS8(this.f13420f, 0, this.f13421g));
    }

    @Override // p000.AbstractC50417vQ8, java.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.f13419e;
        Object[] objArr = this.f13420f;
        int i = this.f13421g;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (!objArr[0].equals(obj)) {
                return null;
            }
            return (V) objArr[1];
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int m17542a = C47436qO8.m17542a(obj.hashCode());
                while (true) {
                    int i2 = m17542a & length;
                    int i3 = bArr[i2] & UByte.MAX_VALUE;
                    if (i3 == 255) {
                        return null;
                    }
                    if (objArr[i3].equals(obj)) {
                        return (V) objArr[i3 ^ 1];
                    }
                    m17542a = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int m17542a2 = C47436qO8.m17542a(obj.hashCode());
                while (true) {
                    int i4 = m17542a2 & length2;
                    char c = (char) sArr[i4];
                    if (c == 65535) {
                        return null;
                    }
                    if (objArr[c].equals(obj)) {
                        return (V) objArr[c ^ 1];
                    }
                    m17542a2 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int m17542a3 = C47436qO8.m17542a(obj.hashCode());
                while (true) {
                    int i5 = m17542a3 & length3;
                    int i6 = iArr[i5];
                    if (i6 == -1) {
                        return null;
                    }
                    if (objArr[i6].equals(obj)) {
                        return (V) objArr[i6 ^ 1];
                    }
                    m17542a3 = i5 + 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f13421g;
    }
}
