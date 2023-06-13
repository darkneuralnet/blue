package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C8329Uc;
/* renamed from: Tc1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesC36078Tc1 implements SharedPreferences {

    /* renamed from: a */
    public final SharedPreferences f35755a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f35756b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final String f35757c;

    /* renamed from: d */
    public final String f35758d;

    /* renamed from: e */
    public final InterfaceC27152p8 f35759e;

    /* renamed from: f */
    public final InterfaceC40107e21 f35760f;

    /* renamed from: Tc1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C7891a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35761a;

        static {
            int[] iArr = new int[EnumC7893c.values().length];
            f35761a = iArr;
            try {
                iArr[EnumC7893c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35761a[EnumC7893c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35761a[EnumC7893c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35761a[EnumC7893c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35761a[EnumC7893c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35761a[EnumC7893c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: Tc1$b */
    /* loaded from: classes.dex */
    public static final class SharedPreferences$EditorC7892b implements SharedPreferences.Editor {

        /* renamed from: a */
        public final SharedPreferencesC36078Tc1 f35762a;

        /* renamed from: b */
        public final SharedPreferences.Editor f35763b;

        /* renamed from: d */
        public AtomicBoolean f35765d = new AtomicBoolean(false);

        /* renamed from: c */
        public final List<String> f35764c = new CopyOnWriteArrayList();

        public SharedPreferences$EditorC7892b(SharedPreferencesC36078Tc1 sharedPreferencesC36078Tc1, SharedPreferences.Editor editor) {
            this.f35762a = sharedPreferencesC36078Tc1;
            this.f35763b = editor;
        }

        /* renamed from: a */
        public final void m83327a() {
            if (this.f35765d.getAndSet(false)) {
                for (String str : this.f35762a.getAll().keySet()) {
                    if (!this.f35764c.contains(str) && !this.f35762a.m83328g(str)) {
                        this.f35763b.remove(this.f35762a.m83331d(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            m83327a();
            this.f35763b.apply();
            m83326b();
            this.f35764c.clear();
        }

        /* renamed from: b */
        public final void m83326b() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f35762a.f35756b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                for (String str : this.f35764c) {
                    next.onSharedPreferenceChanged(this.f35762a, str);
                }
            }
        }

        /* renamed from: c */
        public final void m83325c(String str, byte[] bArr) {
            if (!this.f35762a.m83328g(str)) {
                this.f35764c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    Pair<String, String> m83330e = this.f35762a.m83330e(str, bArr);
                    this.f35763b.putString((String) m83330e.first, (String) m83330e.second);
                    return;
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
                }
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f35765d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            m83327a();
            try {
                return this.f35763b.commit();
            } finally {
                m83326b();
                this.f35764c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EnumC7893c.BOOLEAN.m83322c());
            allocate.put(z ? (byte) 1 : (byte) 0);
            m83325c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EnumC7893c.FLOAT.m83322c());
            allocate.putFloat(f);
            m83325c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EnumC7893c.INT.m83322c());
            allocate.putInt(i);
            m83325c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EnumC7893c.LONG.m83322c());
            allocate.putLong(j);
            m83325c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EnumC7893c.STRING.m83322c());
            allocate.putInt(length);
            allocate.put(bytes);
            m83325c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new C30704yo<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            for (String str2 : set) {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(EnumC7893c.STRING_SET.m83322c());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            m83325c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f35762a.m83328g(str)) {
                this.f35763b.remove(this.f35762a.m83331d(str));
                this.f35764c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* renamed from: Tc1$c */
    /* loaded from: classes.dex */
    public enum EnumC7893c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        

        /* renamed from: b */
        public final int f35773b;

        EnumC7893c(int i) {
            this.f35773b = i;
        }

        /* renamed from: b */
        public static EnumC7893c m83323b(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return BOOLEAN;
                            }
                            return FLOAT;
                        }
                        return LONG;
                    }
                    return INT;
                }
                return STRING_SET;
            }
            return STRING;
        }

        /* renamed from: c */
        public int m83322c() {
            return this.f35773b;
        }
    }

    /* renamed from: Tc1$d */
    /* loaded from: classes.dex */
    public enum EnumC7894d {
        AES256_SIV("AES256_SIV");
        

        /* renamed from: b */
        public final String f35776b;

        EnumC7894d(String str) {
            this.f35776b = str;
        }

        /* renamed from: b */
        public C33811Jk2 m83320b() throws GeneralSecurityException {
            return C34279Lk2.m96382a(this.f35776b);
        }
    }

    /* renamed from: Tc1$e */
    /* loaded from: classes.dex */
    public enum EnumC7895e {
        AES256_GCM("AES256_GCM");
        

        /* renamed from: b */
        public final String f35779b;

        EnumC7895e(String str) {
            this.f35779b = str;
        }

        /* renamed from: b */
        public C33811Jk2 m83318b() throws GeneralSecurityException {
            return C34279Lk2.m96382a(this.f35779b);
        }
    }

    public SharedPreferencesC36078Tc1(String str, String str2, SharedPreferences sharedPreferences, InterfaceC27152p8 interfaceC27152p8, InterfaceC40107e21 interfaceC40107e21) {
        this.f35757c = str;
        this.f35755a = sharedPreferences;
        this.f35758d = str2;
        this.f35759e = interfaceC27152p8;
        this.f35760f = interfaceC40107e21;
    }

    /* renamed from: a */
    public static SharedPreferences m83334a(Context context, String str, C49783uM2 c49783uM2, EnumC7894d enumC7894d, EnumC7895e enumC7895e) throws GeneralSecurityException, IOException {
        return m83333b(str, c49783uM2.m10411a(), context, enumC7894d, enumC7895e);
    }

    @Deprecated
    /* renamed from: b */
    public static SharedPreferences m83333b(String str, String str2, Context context, EnumC7894d enumC7894d, EnumC7895e enumC7895e) throws GeneralSecurityException, IOException {
        C40700f21.m42260a();
        C27512q8.m18079b();
        Context applicationContext = context.getApplicationContext();
        C8329Uc.C8331b m81268j = new C8329Uc.C8331b().m81270h(enumC7894d.m83320b()).m81268j(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        C44683ll2 m81279c = m81268j.m81269i("android-keystore://" + str2).m81274d().m81279c();
        C8329Uc.C8331b m81268j2 = new C8329Uc.C8331b().m81270h(enumC7895e.m83318b()).m81268j(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        C44683ll2 m81279c2 = m81268j2.m81269i("android-keystore://" + str2).m81274d().m81279c();
        InterfaceC40107e21 interfaceC40107e21 = (InterfaceC40107e21) m81279c.m26873h(InterfaceC40107e21.class);
        return new SharedPreferencesC36078Tc1(str, str2, applicationContext.getSharedPreferences(str, 0), (InterfaceC27152p8) m81279c2.m26873h(InterfaceC27152p8.class), interfaceC40107e21);
    }

    /* renamed from: c */
    public String m83332c(String str) {
        try {
            String str2 = new String(this.f35760f.mo40276a(C2538Fy.m106150a(str, 0), this.f35757c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!m83328g(str)) {
            return this.f35755a.contains(m83331d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* renamed from: d */
    public String m83331d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return C2538Fy.m106147d(this.f35760f.mo40275b(str.getBytes(StandardCharsets.UTF_8), this.f35757c.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    /* renamed from: e */
    public Pair<String, String> m83330e(String str, byte[] bArr) throws GeneralSecurityException {
        String m83331d = m83331d(str);
        return new Pair<>(m83331d, C2538Fy.m106147d(this.f35759e.mo3716a(bArr, m83331d.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new SharedPreferences$EditorC7892b(this, this.f35755a.edit());
    }

    /* renamed from: f */
    public final Object m83329f(String str) throws SecurityException {
        if (!m83328g(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String m83331d = m83331d(str);
                String string = this.f35755a.getString(m83331d, null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                ByteBuffer wrap = ByteBuffer.wrap(this.f35759e.mo3715b(C2538Fy.m106150a(string, 0), m83331d.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                int i = wrap.getInt();
                EnumC7893c m83323b = EnumC7893c.m83323b(i);
                if (m83323b != null) {
                    switch (C7891a.f35761a[m83323b.ordinal()]) {
                        case 1:
                            int i2 = wrap.getInt();
                            ByteBuffer slice = wrap.slice();
                            wrap.limit(i2);
                            String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                            if (charBuffer.equals("__NULL__")) {
                                return null;
                            }
                            return charBuffer;
                        case 2:
                            return Integer.valueOf(wrap.getInt());
                        case 3:
                            return Long.valueOf(wrap.getLong());
                        case 4:
                            return Float.valueOf(wrap.getFloat());
                        case 5:
                            if (wrap.get() != 0) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        case 6:
                            C30704yo c30704yo = new C30704yo();
                            while (wrap.hasRemaining()) {
                                int i3 = wrap.getInt();
                                ByteBuffer slice2 = wrap.slice();
                                slice2.limit(i3);
                                wrap.position(wrap.position() + i3);
                                c30704yo.add(StandardCharsets.UTF_8.decode(slice2).toString());
                            }
                            if (c30704yo.size() == 1 && "__NULL__".equals(c30704yo.m2571s(0))) {
                                return null;
                            }
                            return c30704yo;
                        default:
                            throw new SecurityException("Unhandled type for encrypted pref value: " + m83323b);
                    }
                }
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
            }
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* renamed from: g */
    public boolean m83328g(String str) {
        if (!"__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) && !"__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f35755a.getAll().entrySet()) {
            if (!m83328g(entry.getKey())) {
                String m83332c = m83332c(entry.getKey());
                hashMap.put(m83332c, m83329f(m83332c));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object m83329f = m83329f(str);
        if (m83329f != null && (m83329f instanceof Boolean)) {
            return ((Boolean) m83329f).booleanValue();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object m83329f = m83329f(str);
        if (m83329f != null && (m83329f instanceof Float)) {
            return ((Float) m83329f).floatValue();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object m83329f = m83329f(str);
        if (m83329f != null && (m83329f instanceof Integer)) {
            return ((Integer) m83329f).intValue();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object m83329f = m83329f(str);
        if (m83329f != null && (m83329f instanceof Long)) {
            return ((Long) m83329f).longValue();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object m83329f = m83329f(str);
        if (m83329f != null && (m83329f instanceof String)) {
            return (String) m83329f;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> c30704yo;
        Object m83329f = m83329f(str);
        if (m83329f instanceof Set) {
            c30704yo = (Set) m83329f;
        } else {
            c30704yo = new C30704yo<>();
        }
        if (c30704yo.size() > 0) {
            return c30704yo;
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f35756b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f35756b.remove(onSharedPreferenceChangeListener);
    }
}
