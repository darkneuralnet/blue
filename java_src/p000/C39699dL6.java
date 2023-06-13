package p000;

import android.util.Log;
import com.google.android.play.core.internal.C17962bf;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: dL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39699dL6 implements KK6 {

    /* renamed from: a */
    public final /* synthetic */ int f76468a = 0;

    public C39699dL6() {
    }

    /* renamed from: c */
    public static void m44379c(ClassLoader classLoader, Set<File> set) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (File file : set) {
            String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
            Log.d("Splitcompat", valueOf.length() != 0 ? "Adding native library parent directory: ".concat(valueOf) : new String("Adding native library parent directory: "));
            hashSet.add(file.getParentFile());
        }
        C45628nL6 m19454e = C46814pL6.m19454e(m44377e(classLoader), "nativeLibraryDirectories", File.class);
        hashSet.removeAll(Arrays.asList((File[]) m19454e.m23956a()));
        synchronized (C45655nO6.class) {
            int size = hashSet.size();
            StringBuilder sb = new StringBuilder(30);
            sb.append("Adding directories ");
            sb.append(size);
            Log.d("Splitcompat", sb.toString());
            m19454e.m23952e(hashSet);
        }
    }

    /* renamed from: d */
    public static boolean m44378d(ClassLoader classLoader, File file, File file2, boolean z, PK6 pk6, String str, NK6 nk6) {
        ArrayList<IOException> arrayList = new ArrayList<>();
        Object m44377e = m44377e(classLoader);
        C45628nL6 m19454e = C46814pL6.m19454e(m44377e, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) m19454e.m23956a());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : asList) {
            arrayList2.add((File) C46814pL6.m19455d(obj, str, File.class).m23956a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z && !nk6.mo29049a(m44377e, file2, file)) {
            String valueOf = String.valueOf(file2.getPath());
            Log.w("SplitCompat", valueOf.length() != 0 ? "Should be optimized ".concat(valueOf) : new String("Should be optimized "));
            return false;
        }
        m19454e.m23953d(Arrays.asList(pk6.mo41536a(m44377e, new ArrayList<>(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        C17962bf c17962bf = new C17962bf("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IOException iOException = arrayList.get(i);
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
            RL6.m86831a(c17962bf, iOException);
        }
        C46814pL6.m19454e(m44377e, "dexElementsSuppressedExceptions", IOException.class).m23953d(arrayList);
        throw c17962bf;
    }

    /* renamed from: e */
    public static Object m44377e(ClassLoader classLoader) {
        return C46814pL6.m19455d(classLoader, "pathList", Object.class).m23956a();
    }

    /* renamed from: f */
    public static PK6 m44376f() {
        return new C40884fL6(null);
    }

    /* renamed from: g */
    public static NK6 m44375g() {
        return new C43849kL6((byte[]) null);
    }

    /* renamed from: h */
    public static void m44374h(ClassLoader classLoader, Set<File> set, InterfaceC41477gL6 interfaceC41477gL6) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (File file : set) {
            hashSet.add(file.getParentFile());
        }
        Object m44377e = m44377e(classLoader);
        C45628nL6 m19455d = C46814pL6.m19455d(m44377e, "nativeLibraryDirectories", List.class);
        synchronized (C45655nO6.class) {
            ArrayList arrayList = new ArrayList((Collection) m19455d.m23956a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            m19455d.m23955b(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] mo34135a = interfaceC41477gL6.mo34135a(m44377e, new ArrayList(hashSet), arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (C45655nO6.class) {
                C46814pL6.m19454e(m44377e, "nativeLibraryPathElements", Object.class).m23952e(Arrays.asList(mo34135a));
            }
            return;
        }
        C17962bf c17962bf = new C17962bf("Error in makePathElements");
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            RL6.m86831a(c17962bf, arrayList2.get(i));
        }
        throw c17962bf;
    }

    /* renamed from: i */
    public static PK6 m44373i() {
        return new C40884fL6();
    }

    /* renamed from: j */
    public static InterfaceC41477gL6 m44372j() {
        return new C42663iL6(null);
    }

    /* renamed from: k */
    public static boolean m44371k(ClassLoader classLoader, File file, File file2, boolean z) {
        return m44378d(classLoader, file, file2, z, m44373i(), "zip", m44375g());
    }

    /* renamed from: l */
    public static void m44370l(ClassLoader classLoader, Set<File> set) {
        m44374h(classLoader, set, new C42663iL6());
    }

    /* renamed from: m */
    public static boolean m44369m(ClassLoader classLoader, File file, File file2, boolean z) {
        return m44378d(classLoader, file, file2, z, m44373i(), "path", new C43849kL6());
    }

    @Override // p000.KK6
    /* renamed from: a */
    public final void mo44381a(ClassLoader classLoader, Set set) {
        switch (this.f76468a) {
            case 0:
                m44379c(classLoader, set);
                return;
            case 1:
                m44379c(classLoader, set);
                return;
            case 2:
            case 3:
            case 4:
                m44374h(classLoader, set, m44372j());
                return;
            case 5:
                m44370l(classLoader, set);
                return;
            case 6:
                m44370l(classLoader, set);
                return;
            default:
                m44370l(classLoader, set);
                return;
        }
    }

    @Override // p000.KK6
    /* renamed from: b */
    public final boolean mo44380b(ClassLoader classLoader, File file, File file2, boolean z) {
        PK6 m44376f;
        String str;
        NK6 m44375g;
        switch (this.f76468a) {
            case 0:
            case 1:
                m44376f = m44376f();
                str = "zip";
                m44375g = m44375g();
                break;
            case 2:
                return m44371k(classLoader, file, file2, z);
            case 3:
                return m44371k(classLoader, file, file2, z);
            case 4:
                return m44371k(classLoader, file, file2, z);
            case 5:
                return m44369m(classLoader, file, file2, z);
            case 6:
                return m44369m(classLoader, file, file2, z);
            default:
                m44376f = m44373i();
                m44375g = new C43849kL6((char[]) null);
                str = "path";
                break;
        }
        return m44378d(classLoader, file, file2, z, m44376f, str, m44375g);
    }

    public C39699dL6(float[] fArr) {
    }

    public C39699dL6(int[] iArr) {
    }

    public C39699dL6(short[] sArr) {
    }

    public C39699dL6(boolean[] zArr) {
    }

    public C39699dL6(byte[][] bArr) {
    }
}
