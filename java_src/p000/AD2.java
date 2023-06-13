package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import ch.qos.logback.core.net.SyslogConstants;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* renamed from: AD2 */
/* loaded from: classes2.dex */
public class AD2 {

    /* renamed from: a */
    public static final Map<String, C39632dE2<C47924rD2>> f293a = new HashMap();

    /* renamed from: b */
    public static final Set<InterfaceC40224eE2> f294b = new HashSet();

    /* renamed from: c */
    public static final byte[] f295c = {80, 75, 3, 4};

    private AD2() {
    }

    /* renamed from: A */
    public static boolean m115997A(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: B */
    public static Boolean m115996B(InterfaceC46046o30 interfaceC46046o30) {
        try {
            InterfaceC46046o30 peek = interfaceC46046o30.peek();
            for (byte b : f295c) {
                if (peek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            C32524Dx2.m109587b("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: C */
    public static /* synthetic */ void m115995C(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map<String, C39632dE2<C47924rD2>> map = f293a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m115988J(true);
        }
    }

    /* renamed from: D */
    public static /* synthetic */ C38428bE2 m115994D(C47924rD2 c47924rD2) throws Exception {
        return new C38428bE2(c47924rD2);
    }

    /* renamed from: E */
    public static /* synthetic */ void m115993E(String str, AtomicBoolean atomicBoolean, C47924rD2 c47924rD2) {
        Map<String, C39632dE2<C47924rD2>> map = f293a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m115988J(true);
        }
    }

    /* renamed from: H */
    public static /* synthetic */ C38428bE2 m115990H(WeakReference weakReference, Context context, int i, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return m115965v(context, i, str);
    }

    /* renamed from: I */
    public static /* synthetic */ C38428bE2 m115989I(Context context, String str, String str2) throws Exception {
        C38428bE2<C47924rD2> m107733c = C32416Dl2.m109974e(context).m107733c(context, str, str2);
        if (str2 != null && m107733c.m64804b() != null) {
            C48516sD2.m14528b().m14527c(str2, m107733c.m64804b());
        }
        return m107733c;
    }

    /* renamed from: J */
    public static void m115988J(boolean z) {
        ArrayList arrayList = new ArrayList(f294b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((InterfaceC40224eE2) arrayList.get(i)).m43087a(z);
        }
    }

    /* renamed from: K */
    public static String m115987K(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(m115997A(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: h */
    public static C39632dE2<C47924rD2> m115979h(final String str, Callable<C38428bE2<C47924rD2>> callable) {
        final C47924rD2 m14529a;
        if (str == null) {
            m14529a = null;
        } else {
            m14529a = C48516sD2.m14528b().m14529a(str);
        }
        if (m14529a != null) {
            return new C39632dE2<>(new Callable() { // from class: vD2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C38428bE2 m115994D;
                    m115994D = AD2.m115994D(C47924rD2.this);
                    return m115994D;
                }
            });
        }
        if (str != null) {
            Map<String, C39632dE2<C47924rD2>> map = f293a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C39632dE2<C47924rD2> c39632dE2 = new C39632dE2<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c39632dE2.m44508d(new VD2() { // from class: wD2
                @Override // p000.VD2
                public final void onResult(Object obj) {
                    AD2.m115993E(str, atomicBoolean, (C47924rD2) obj);
                }
            });
            c39632dE2.m44509c(new VD2() { // from class: xD2
                @Override // p000.VD2
                public final void onResult(Object obj) {
                    AD2.m115995C(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, C39632dE2<C47924rD2>> map2 = f293a;
                map2.put(str, c39632dE2);
                if (map2.size() == 1) {
                    m115988J(false);
                }
            }
        }
        return c39632dE2;
    }

    /* renamed from: i */
    public static UD2 m115978i(C47924rD2 c47924rD2, String str) {
        for (UD2 ud2 : c47924rD2.m16214j().values()) {
            if (ud2.m81818b().equals(str)) {
                return ud2;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static C39632dE2<C47924rD2> m115977j(Context context, String str) {
        return m115976k(context, str, "asset_" + str);
    }

    /* renamed from: k */
    public static C39632dE2<C47924rD2> m115976k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return m115979h(str2, new Callable() { // from class: yD2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C38428bE2 m115974m;
                m115974m = AD2.m115974m(applicationContext, str, str2);
                return m115974m;
            }
        });
    }

    /* renamed from: l */
    public static C38428bE2<C47924rD2> m115975l(Context context, String str) {
        return m115974m(context, str, "asset_" + str);
    }

    /* renamed from: m */
    public static C38428bE2<C47924rD2> m115974m(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return m115972o(context.getAssets().open(str), str2);
            }
            return m115962y(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C38428bE2<>(e);
        }
    }

    /* renamed from: n */
    public static C39632dE2<C47924rD2> m115973n(final InputStream inputStream, final String str) {
        return m115979h(str, new Callable() { // from class: uD2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C38428bE2 m115972o;
                m115972o = AD2.m115972o(inputStream, str);
                return m115972o;
            }
        });
    }

    /* renamed from: o */
    public static C38428bE2<C47924rD2> m115972o(InputStream inputStream, String str) {
        return m115971p(inputStream, str, true);
    }

    /* renamed from: p */
    public static C38428bE2<C47924rD2> m115971p(InputStream inputStream, String str, boolean z) {
        try {
            return m115970q(AbstractC39920dj2.m43843p(C34928Oe3.m91759d(C34928Oe3.m91751l(inputStream))), str);
        } finally {
            if (z) {
                C33095Gi6.m104869c(inputStream);
            }
        }
    }

    /* renamed from: q */
    public static C38428bE2<C47924rD2> m115970q(AbstractC39920dj2 abstractC39920dj2, String str) {
        return m115969r(abstractC39920dj2, str, true);
    }

    /* renamed from: r */
    public static C38428bE2<C47924rD2> m115969r(AbstractC39920dj2 abstractC39920dj2, String str, boolean z) {
        try {
            try {
                C47924rD2 m114211a = BD2.m114211a(abstractC39920dj2);
                if (str != null) {
                    C48516sD2.m14528b().m14527c(str, m114211a);
                }
                C38428bE2<C47924rD2> c38428bE2 = new C38428bE2<>(m114211a);
                if (z) {
                    C33095Gi6.m104869c(abstractC39920dj2);
                }
                return c38428bE2;
            } catch (Exception e) {
                C38428bE2<C47924rD2> c38428bE22 = new C38428bE2<>(e);
                if (z) {
                    C33095Gi6.m104869c(abstractC39920dj2);
                }
                return c38428bE22;
            }
        } catch (Throwable th) {
            if (z) {
                C33095Gi6.m104869c(abstractC39920dj2);
            }
            throw th;
        }
    }

    /* renamed from: s */
    public static C39632dE2<C47924rD2> m115968s(Context context, int i) {
        return m115967t(context, i, m115987K(context, i));
    }

    /* renamed from: t */
    public static C39632dE2<C47924rD2> m115967t(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m115979h(str, new Callable() { // from class: zD2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C38428bE2 m115990H;
                m115990H = AD2.m115990H(weakReference, applicationContext, i, str);
                return m115990H;
            }
        });
    }

    /* renamed from: u */
    public static C38428bE2<C47924rD2> m115966u(Context context, int i) {
        return m115965v(context, i, m115987K(context, i));
    }

    /* renamed from: v */
    public static C38428bE2<C47924rD2> m115965v(Context context, int i, String str) {
        try {
            InterfaceC46046o30 m91759d = C34928Oe3.m91759d(C34928Oe3.m91751l(context.getResources().openRawResource(i)));
            if (m115996B(m91759d).booleanValue()) {
                return m115962y(context, new ZipInputStream(m91759d.mo21930w3()), str);
            }
            return m115972o(m91759d.mo21930w3(), str);
        } catch (Resources.NotFoundException e) {
            return new C38428bE2<>(e);
        }
    }

    /* renamed from: w */
    public static C39632dE2<C47924rD2> m115964w(Context context, String str) {
        return m115963x(context, str, "url_" + str);
    }

    /* renamed from: x */
    public static C39632dE2<C47924rD2> m115963x(final Context context, final String str, final String str2) {
        return m115979h(str2, new Callable() { // from class: tD2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C38428bE2 m115989I;
                m115989I = AD2.m115989I(context, str, str2);
                return m115989I;
            }
        });
    }

    /* renamed from: y */
    public static C38428bE2<C47924rD2> m115962y(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return m115961z(context, zipInputStream, str);
        } finally {
            C33095Gi6.m104869c(zipInputStream);
        }
    }

    /* renamed from: z */
    public static C38428bE2<C47924rD2> m115961z(Context context, ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C47924rD2 c47924rD2 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    c47924rD2 = m115969r(AbstractC39920dj2.m43843p(C34928Oe3.m91759d(C34928Oe3.m91751l(zipInputStream))), null, false).m64804b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        if (!name.contains(".ttf") && !name.contains(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        String[] split = name.split("/");
                        String str2 = split[split.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                C32524Dx2.m109586c("Failed to delete temp font file " + file.getAbsolutePath() + InstructionFileId.DOT);
                            }
                            hashMap2.put(str3, createFromFile);
                        } finally {
                        }
                    }
                    String[] split2 = name.split("/");
                    hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c47924rD2 == null) {
                return new C38428bE2<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                UD2 m115978i = m115978i(c47924rD2, (String) entry.getKey());
                if (m115978i != null) {
                    m115978i.m81814f(C33095Gi6.m104860l((Bitmap) entry.getValue(), m115978i.m81815e(), m115978i.m81817c()));
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z = false;
                for (C41234fw1 c41234fw1 : c47924rD2.m16217g().values()) {
                    if (c41234fw1.m40436a().equals(entry2.getKey())) {
                        c41234fw1.m40432e((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                    C32524Dx2.m109586c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (hashMap.isEmpty()) {
                for (Map.Entry<String, UD2> entry3 : c47924rD2.m16214j().entrySet()) {
                    UD2 value = entry3.getValue();
                    if (value == null) {
                        return null;
                    }
                    String m81818b = value.m81818b();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = SyslogConstants.LOG_LOCAL4;
                    if (m81818b.startsWith("data:") && m81818b.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(m81818b.substring(m81818b.indexOf(44) + 1), 0);
                            value.m81814f(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                        } catch (IllegalArgumentException e) {
                            C32524Dx2.m109585d("data URL did not have correct base64 format.", e);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, UD2> entry4 : c47924rD2.m16214j().entrySet()) {
                if (entry4.getValue().m81819a() == null) {
                    return new C38428bE2<>(new IllegalStateException("There is no image for " + entry4.getValue().m81818b()));
                }
            }
            if (str != null) {
                C48516sD2.m14528b().m14527c(str, c47924rD2);
            }
            return new C38428bE2<>(c47924rD2);
        } catch (IOException e2) {
            return new C38428bE2<>(e2);
        }
    }
}
