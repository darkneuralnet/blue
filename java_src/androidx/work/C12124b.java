package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: androidx.work.b */
/* loaded from: classes.dex */
public final class C12124b {

    /* renamed from: b */
    public static final String f56213b = AbstractC32056Bx2.m113270i("Data");

    /* renamed from: c */
    public static final C12124b f56214c = new C12125a().m65581a();

    /* renamed from: a */
    public Map<String, Object> f56215a;

    /* renamed from: androidx.work.b$a */
    /* loaded from: classes.dex */
    public static final class C12125a {

        /* renamed from: a */
        public Map<String, Object> f56216a = new HashMap();

        /* renamed from: a */
        public C12124b m65581a() {
            C12124b c12124b = new C12124b(this.f56216a);
            C12124b.m65582l(c12124b);
            return c12124b;
        }

        /* renamed from: b */
        public C12125a m65580b(String str, Object obj) {
            if (obj == null) {
                this.f56216a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    if (cls == boolean[].class) {
                        this.f56216a.put(str, C12124b.m65593a((boolean[]) obj));
                    } else if (cls == byte[].class) {
                        this.f56216a.put(str, C12124b.m65592b((byte[]) obj));
                    } else if (cls == int[].class) {
                        this.f56216a.put(str, C12124b.m65589e((int[]) obj));
                    } else if (cls == long[].class) {
                        this.f56216a.put(str, C12124b.m65588f((long[]) obj));
                    } else if (cls == float[].class) {
                        this.f56216a.put(str, C12124b.m65590d((float[]) obj));
                    } else if (cls == double[].class) {
                        this.f56216a.put(str, C12124b.m65591c((double[]) obj));
                    } else {
                        throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                    }
                } else {
                    this.f56216a.put(str, obj);
                }
            }
            return this;
        }

        /* renamed from: c */
        public C12125a m65579c(C12124b c12124b) {
            m65578d(c12124b.f56215a);
            return this;
        }

        /* renamed from: d */
        public C12125a m65578d(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                m65580b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public C12125a m65577e(String str, String str2) {
            this.f56216a.put(str, str2);
            return this;
        }
    }

    public C12124b() {
    }

    /* renamed from: a */
    public static Boolean[] m65593a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    /* renamed from: b */
    public static Byte[] m65592b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    /* renamed from: c */
    public static Double[] m65591c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    /* renamed from: d */
    public static Float[] m65590d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* renamed from: e */
    public static Integer[] m65589e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* renamed from: f */
    public static Long[] m65588f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x005d -> B:36:0x0062). Please submit an issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12124b m65587g(byte[] bArr) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Throwable e;
        if (bArr.length <= 10240) {
            HashMap hashMap = new HashMap();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
            } catch (IOException e2) {
                Log.e(f56213b, "Error in Data#fromByteArray: ", e2);
            }
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                            hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e3) {
                            Log.e(f56213b, "Error in Data#fromByteArray: ", e3);
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e4) {
                        e = e4;
                        Log.e(f56213b, "Error in Data#fromByteArray: ", e);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e5) {
                                Log.e(f56213b, "Error in Data#fromByteArray: ", e5);
                            }
                        }
                        byteArrayInputStream.close();
                        return new C12124b(hashMap);
                    } catch (ClassNotFoundException e6) {
                        e = e6;
                        Log.e(f56213b, "Error in Data#fromByteArray: ", e);
                        if (objectInputStream != null) {
                        }
                        byteArrayInputStream.close();
                        return new C12124b(hashMap);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e7) {
                            Log.e(f56213b, "Error in Data#fromByteArray: ", e7);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e8) {
                        Log.e(f56213b, "Error in Data#fromByteArray: ", e8);
                    }
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
                Throwable th3 = e;
                objectInputStream = null;
                e = th3;
                Log.e(f56213b, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new C12124b(hashMap);
            } catch (ClassNotFoundException e10) {
                e = e10;
                Throwable th32 = e;
                objectInputStream = null;
                e = th32;
                Log.e(f56213b, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new C12124b(hashMap);
            } catch (Throwable th4) {
                th = th4;
                if (0 != 0) {
                }
                byteArrayInputStream.close();
                throw th;
            }
            return new C12124b(hashMap);
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    /* renamed from: l */
    public static byte[] m65582l(C12124b c12124b) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            objectOutputStream.writeInt(c12124b.m65583k());
            for (Map.Entry<String, Object> entry : c12124b.f56215a.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e2) {
                Log.e(f56213b, "Error in Data#toByteArray: ", e2);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                Log.e(f56213b, "Error in Data#toByteArray: ", e3);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            Log.e(f56213b, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    Log.e(f56213b, "Error in Data#toByteArray: ", e5);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                Log.e(f56213b, "Error in Data#toByteArray: ", e6);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e7) {
                    Log.e(f56213b, "Error in Data#toByteArray: ", e7);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e8) {
                Log.e(f56213b, "Error in Data#toByteArray: ", e8);
            }
            throw th;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || C12124b.class != obj.getClass()) {
            return false;
        }
        C12124b c12124b = (C12124b) obj;
        Set<String> keySet = this.f56215a.keySet();
        if (!keySet.equals(c12124b.f56215a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f56215a.get(str);
            Object obj3 = c12124b.f56215a.get(str);
            if (obj2 != null && obj3 != null) {
                if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z = obj2.equals(obj3);
                    continue;
                }
            } else if (obj2 == obj3) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public Map<String, Object> m65586h() {
        return Collections.unmodifiableMap(this.f56215a);
    }

    public int hashCode() {
        return this.f56215a.hashCode() * 31;
    }

    /* renamed from: i */
    public String m65585i(String str) {
        Object obj = this.f56215a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: j */
    public String[] m65584j(String str) {
        Object obj = this.f56215a.get(str);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    /* renamed from: k */
    public int m65583k() {
        return this.f56215a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f56215a.isEmpty()) {
            for (String str : this.f56215a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f56215a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C12124b(C12124b c12124b) {
        this.f56215a = new HashMap(c12124b.f56215a);
    }

    public C12124b(Map<String, ?> map) {
        this.f56215a = new HashMap(map);
    }
}
