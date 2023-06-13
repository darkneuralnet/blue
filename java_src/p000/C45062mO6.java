package p000;

import android.os.Build;
import android.support.annotation.Nullable;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* renamed from: mO6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45062mO6 {

    /* renamed from: b */
    public static final Pattern f97946b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a */
    public final C42672iM6 f97947a;

    public C45062mO6(C42672iM6 c42672iM6) throws IOException {
        this.f97947a = c42672iM6;
    }

    /* renamed from: d */
    public static /* synthetic */ Set m25670d(C45062mO6 c45062mO6, Set set, VO6 vo6, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        c45062mO6.m25668f(vo6, set, new FN6(hashSet, vo6, zipFile));
        return hashSet;
    }

    /* renamed from: e */
    public static void m25669e(VO6 vo6, QN6 qn6) throws IOException {
        ZipFile zipFile;
        String[] strArr;
        String format;
        try {
            zipFile = new ZipFile(vo6.m79887a());
        } catch (IOException e) {
            e = e;
            zipFile = null;
        }
        try {
            String m79886b = vo6.m79886b();
            HashMap hashMap = new HashMap();
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                Matcher matcher = f97946b.matcher(nextElement.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", m79886b, group2, group));
                    Set set = (Set) hashMap.get(group);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(group, set);
                    }
                    set.add(new C43283jO6(nextElement, group2));
                }
            }
            HashMap hashMap2 = new HashMap();
            for (String str : Build.SUPPORTED_ABIS) {
                if (hashMap.containsKey(str)) {
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str));
                    for (C43283jO6 c43283jO6 : (Set) hashMap.get(str)) {
                        if (hashMap2.containsKey(c43283jO6.f92643a)) {
                            format = String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", c43283jO6.f92643a, str);
                        } else {
                            hashMap2.put(c43283jO6.f92643a, c43283jO6);
                            format = String.format("NativeLibraryExtractor: using library %s for ABI %s", c43283jO6.f92643a, str);
                        }
                        Log.d("SplitCompat", format);
                    }
                } else {
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str));
                }
            }
            qn6.mo8764a(zipFile, new HashSet(hashMap2.values()));
            zipFile.close();
        } catch (IOException e2) {
            e = e2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e3) {
                    RL6.m86831a(e, e3);
                }
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final Set<File> m25673a() throws IOException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<VO6> m34113i = this.f97947a.m34113i();
        for (String str : this.f97947a.m34112j()) {
            Iterator<VO6> it = m34113i.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().m79886b().equals(str)) {
                        break;
                    }
                } else {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    this.f97947a.m34111k(str);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (VO6 vo6 : m34113i) {
            HashSet hashSet2 = new HashSet();
            m25669e(vo6, new C50388vN6(this, hashSet2, vo6));
            for (File file : this.f97947a.m34109m(vo6.m79886b())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), vo6.m79886b(), vo6.m79887a().getAbsolutePath()));
                    this.f97947a.m34110l(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    @Nullable
    /* renamed from: b */
    public final Set<File> m25672b(VO6 vo6) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        m25669e(vo6, new C42088hN6(this, vo6, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    /* renamed from: f */
    public final void m25668f(VO6 vo6, Set<C43283jO6> set, ZN6 zn6) throws IOException {
        for (C43283jO6 c43283jO6 : set) {
            File m34117e = this.f97947a.m34117e(vo6.m79886b(), c43283jO6.f92643a);
            boolean z = false;
            if (m34117e.exists() && m34117e.length() == c43283jO6.f92644b.getSize()) {
                z = true;
            }
            zn6.mo73221a(c43283jO6, m34117e, z);
        }
    }
}
