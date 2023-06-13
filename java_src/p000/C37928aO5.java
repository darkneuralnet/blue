package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.play.core.internal.C17962bf;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* renamed from: aO5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37928aO5 {

    /* renamed from: d */
    public static final AtomicReference<C37928aO5> f50395d = new AtomicReference<>(null);

    /* renamed from: a */
    public final C42672iM6 f50396a;

    /* renamed from: b */
    public final Set<String> f50397b = new HashSet();

    /* renamed from: c */
    public final TJ6 f50398c;

    public C37928aO5(Context context) {
        try {
            C42672iM6 c42672iM6 = new C42672iM6(context);
            this.f50396a = c42672iM6;
            this.f50398c = new TJ6(c42672iM6);
        } catch (PackageManager.NameNotFoundException e) {
            throw new C17962bf(e);
        }
    }

    /* renamed from: a */
    public static boolean m71496a(Context context) {
        return m71492e(context, true);
    }

    /* renamed from: b */
    public static boolean m71495b() {
        return f50395d.get() != null;
    }

    /* renamed from: d */
    public static boolean m71493d() {
        return false;
    }

    /* renamed from: e */
    public static boolean m71492e(Context context, boolean z) {
        if (m71493d()) {
            return false;
        }
        AtomicReference<C37928aO5> atomicReference = f50395d;
        boolean m35337a = C42482i24.m35337a(atomicReference, null, new C37928aO5(context));
        C37928aO5 c37928aO5 = atomicReference.get();
        if (m35337a) {
            EnumC49212tO6.f110421b.m12415b(new EK6(context, RO6.m86778a(), new IK6(context, c37928aO5.f50396a, new MK6(), null), c37928aO5.f50396a, new RO6()));
            PO6.m90353a(new C48619sO6(c37928aO5));
            RO6.m86778a().execute(new RunnableC52176yO6(context));
        }
        try {
            c37928aO5.m71491f(context, z);
            return true;
        } catch (Exception e) {
            Log.e("SplitCompat", "Error installing additional splits", e);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m71490g(@NonNull Context context) {
        return m71492e(context, false);
    }

    /* renamed from: f */
    public final synchronized void m71491f(Context context, boolean z) throws IOException {
        ZipFile zipFile;
        if (z) {
            this.f50396a.m34121a();
        } else {
            RO6.m86778a().execute(new CO6(this));
        }
        String packageName = context.getPackageName();
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
            List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
            Set<VO6> m34113i = this.f50396a.m34113i();
            HashSet hashSet = new HashSet();
            Iterator<VO6> it = m34113i.iterator();
            while (it.hasNext()) {
                String m79886b = it.next().m79886b();
                if (arrayList.contains(m79886b)) {
                    if (z) {
                        this.f50396a.m34108n(m79886b);
                    } else {
                        hashSet.add(m79886b);
                    }
                    it.remove();
                }
            }
            if (!hashSet.isEmpty()) {
                RO6.m86778a().execute(new OO6(this, hashSet));
            }
            HashSet hashSet2 = new HashSet();
            for (VO6 vo6 : m34113i) {
                String m79886b2 = vo6.m79886b();
                if (!SO6.m85525b(m79886b2)) {
                    hashSet2.add(m79886b2);
                }
            }
            for (String str : arrayList) {
                if (!SO6.m85525b(str)) {
                    hashSet2.add(str);
                }
            }
            HashSet<VO6> hashSet3 = new HashSet(m34113i.size());
            for (VO6 vo62 : m34113i) {
                if (!SO6.m85526a(vo62.m79886b())) {
                    String m79886b3 = vo62.m79886b();
                    if (hashSet2.contains(SO6.m85526a(m79886b3) ? "" : m79886b3.split("\\.config\\.", 2)[0])) {
                    }
                }
                hashSet3.add(vo62);
            }
            C45062mO6 c45062mO6 = new C45062mO6(this.f50396a);
            KK6 m95441a = MK6.m95441a();
            ClassLoader classLoader = context.getClassLoader();
            if (z) {
                m95441a.mo44381a(classLoader, c45062mO6.m25673a());
            } else {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    Set<File> m25672b = c45062mO6.m25672b((VO6) it2.next());
                    if (m25672b == null) {
                        it2.remove();
                    } else {
                        m95441a.mo44381a(classLoader, m25672b);
                    }
                }
            }
            HashSet hashSet4 = new HashSet();
            for (VO6 vo63 : hashSet3) {
                try {
                    zipFile = new ZipFile(vo63.m79887a());
                } catch (IOException e) {
                    e = e;
                    zipFile = null;
                }
                try {
                    ZipEntry entry = zipFile.getEntry("classes.dex");
                    zipFile.close();
                    if (entry != null && !m95441a.mo44380b(classLoader, this.f50396a.m34114h(vo63.m79886b()), vo63.m79887a(), z)) {
                        String valueOf = String.valueOf(vo63.m79887a());
                        StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                        sb.append("split was not installed ");
                        sb.append(valueOf);
                        Log.w("SplitCompat", sb.toString());
                    }
                    hashSet4.add(vo63.m79887a());
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
            this.f50398c.m83818a(context, hashSet4);
            HashSet hashSet5 = new HashSet();
            for (VO6 vo64 : hashSet3) {
                if (hashSet4.contains(vo64.m79887a())) {
                    String m79886b4 = vo64.m79886b();
                    StringBuilder sb2 = new StringBuilder(m79886b4.length() + 30);
                    sb2.append("Split '");
                    sb2.append(m79886b4);
                    sb2.append("' installation emulated");
                    Log.d("SplitCompat", sb2.toString());
                    hashSet5.add(vo64.m79886b());
                } else {
                    String m79886b5 = vo64.m79886b();
                    StringBuilder sb3 = new StringBuilder(m79886b5.length() + 35);
                    sb3.append("Split '");
                    sb3.append(m79886b5);
                    sb3.append("' installation not emulated.");
                    Log.d("SplitCompat", sb3.toString());
                }
            }
            synchronized (this.f50397b) {
                this.f50397b.addAll(hashSet5);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IOException(String.format("Cannot load data for application '%s'", packageName), e4);
        }
    }
}
