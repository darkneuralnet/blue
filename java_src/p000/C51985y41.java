package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import com.amazonaws.services.p026s3.internal.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import p000.Y70;
/* renamed from: y41  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51985y41 implements Y70 {

    /* renamed from: a */
    public final Map<String, C30412a> f118696a;

    /* renamed from: b */
    public long f118697b;

    /* renamed from: c */
    public final InterfaceC30414c f118698c;

    /* renamed from: d */
    public final int f118699d;

    /* renamed from: y41$c */
    /* loaded from: classes.dex */
    public interface InterfaceC30414c {
        File get();
    }

    public C51985y41(InterfaceC30414c interfaceC30414c, int i) {
        this.f118696a = new LinkedHashMap(16, 0.75f, true);
        this.f118697b = 0L;
        this.f118698c = interfaceC30414c;
        this.f118699d = i;
    }

    /* renamed from: k */
    public static int m4195k(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: l */
    public static List<AH1> m4194l(C30413b c30413b) throws IOException {
        List<AH1> arrayList;
        int m4193m = m4193m(c30413b);
        if (m4193m >= 0) {
            if (m4193m == 0) {
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList<>();
            }
            for (int i = 0; i < m4193m; i++) {
                arrayList.add(new AH1(m4191o(c30413b).intern(), m4191o(c30413b).intern()));
            }
            return arrayList;
        }
        throw new IOException("readHeaderList size=" + m4193m);
    }

    /* renamed from: m */
    public static int m4193m(InputStream inputStream) throws IOException {
        return (m4195k(inputStream) << 24) | (m4195k(inputStream) << 0) | 0 | (m4195k(inputStream) << 8) | (m4195k(inputStream) << 16);
    }

    /* renamed from: n */
    public static long m4192n(InputStream inputStream) throws IOException {
        return ((m4195k(inputStream) & 255) << 0) | 0 | ((m4195k(inputStream) & 255) << 8) | ((m4195k(inputStream) & 255) << 16) | ((m4195k(inputStream) & 255) << 24) | ((m4195k(inputStream) & 255) << 32) | ((m4195k(inputStream) & 255) << 40) | ((m4195k(inputStream) & 255) << 48) | ((255 & m4195k(inputStream)) << 56);
    }

    /* renamed from: o */
    public static String m4191o(C30413b c30413b) throws IOException {
        return new String(m4188r(c30413b, m4192n(c30413b)), Constants.DEFAULT_ENCODING);
    }

    /* renamed from: r */
    public static byte[] m4188r(C30413b c30413b, long j) throws IOException {
        long m4179a = c30413b.m4179a();
        if (j >= 0 && j <= m4179a) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(c30413b).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + m4179a);
    }

    /* renamed from: s */
    public static void m4187s(List<AH1> list, OutputStream outputStream) throws IOException {
        if (list != null) {
            m4186t(outputStream, list.size());
            for (AH1 ah1 : list) {
                m4184v(outputStream, ah1.m115938a());
                m4184v(outputStream, ah1.m115937b());
            }
            return;
        }
        m4186t(outputStream, 0);
    }

    /* renamed from: t */
    public static void m4186t(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: u */
    public static void m4185u(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) (j >>> 0));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* renamed from: v */
    public static void m4184v(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(Constants.DEFAULT_ENCODING);
        m4185u(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    public InputStream m4205a(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* renamed from: b */
    public OutputStream m4204b(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    @Override // p000.Y70
    /* renamed from: c */
    public synchronized void mo4203c() {
        File file = this.f118698c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                C34841Nu6.m93204c("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                long length = file2.length();
                C30413b c30413b = new C30413b(new BufferedInputStream(m4205a(file2)), length);
                try {
                    C30412a m4182b = C30412a.m4182b(c30413b);
                    m4182b.f118700a = length;
                    m4196j(m4182b.f118701b, m4182b);
                    c30413b.close();
                } catch (Throwable th) {
                    c30413b.close();
                    throw th;
                    break;
                }
            } catch (IOException unused) {
                file2.delete();
            }
        }
    }

    @Override // p000.Y70
    /* renamed from: d */
    public synchronized void mo4202d(String str, boolean z) {
        Y70.C9639a c9639a = get(str);
        if (c9639a != null) {
            c9639a.f44579f = 0L;
            if (z) {
                c9639a.f44578e = 0L;
            }
            mo4201e(str, c9639a);
        }
    }

    @Override // p000.Y70
    /* renamed from: e */
    public synchronized void mo4201e(String str, Y70.C9639a c9639a) {
        BufferedOutputStream bufferedOutputStream;
        C30412a c30412a;
        long j = this.f118697b;
        byte[] bArr = c9639a.f44574a;
        long length = j + bArr.length;
        int i = this.f118699d;
        if (length > i && bArr.length > i * 0.9f) {
            return;
        }
        File m4200f = m4200f(str);
        try {
            bufferedOutputStream = new BufferedOutputStream(m4204b(m4200f));
            c30412a = new C30412a(str, c9639a);
        } catch (IOException unused) {
            if (!m4200f.delete()) {
                C34841Nu6.m93205b("Could not clean up file %s", m4200f.getAbsolutePath());
            }
            m4198h();
        }
        if (c30412a.m4180d(bufferedOutputStream)) {
            bufferedOutputStream.write(c9639a.f44574a);
            bufferedOutputStream.close();
            c30412a.f118700a = m4200f.length();
            m4196j(str, c30412a);
            m4197i();
            return;
        }
        bufferedOutputStream.close();
        C34841Nu6.m93205b("Failed to write header for %s", m4200f.getAbsolutePath());
        throw new IOException();
    }

    /* renamed from: f */
    public File m4200f(String str) {
        return new File(this.f118698c.get(), m4199g(str));
    }

    /* renamed from: g */
    public final String m4199g(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    @Override // p000.Y70
    public synchronized Y70.C9639a get(String str) {
        C30412a c30412a = this.f118696a.get(str);
        if (c30412a == null) {
            return null;
        }
        File m4200f = m4200f(str);
        try {
            C30413b c30413b = new C30413b(new BufferedInputStream(m4205a(m4200f)), m4200f.length());
            try {
                C30412a m4182b = C30412a.m4182b(c30413b);
                if (!TextUtils.equals(str, m4182b.f118701b)) {
                    C34841Nu6.m93205b("%s: key=%s, found=%s", m4200f.getAbsolutePath(), str, m4182b.f118701b);
                    m4189q(str);
                    return null;
                }
                return c30412a.m4181c(m4188r(c30413b, c30413b.m4179a()));
            } finally {
                c30413b.close();
            }
        } catch (IOException e) {
            C34841Nu6.m93205b("%s: %s", m4200f.getAbsolutePath(), e.toString());
            m4190p(str);
            return null;
        }
    }

    /* renamed from: h */
    public final void m4198h() {
        if (!this.f118698c.get().exists()) {
            C34841Nu6.m93205b("Re-initializing cache after external clearing.", new Object[0]);
            this.f118696a.clear();
            this.f118697b = 0L;
            mo4203c();
        }
    }

    /* renamed from: i */
    public final void m4197i() {
        if (this.f118697b < this.f118699d) {
            return;
        }
        if (C34841Nu6.f25359b) {
            C34841Nu6.m93202e("Pruning old cache entries.", new Object[0]);
        }
        long j = this.f118697b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, C30412a>> it = this.f118696a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            C30412a value = it.next().getValue();
            if (m4200f(value.f118701b).delete()) {
                this.f118697b -= value.f118700a;
            } else {
                String str = value.f118701b;
                C34841Nu6.m93205b("Could not delete cache entry for key=%s, filename=%s", str, m4199g(str));
            }
            it.remove();
            i++;
            if (((float) this.f118697b) < this.f118699d * 0.9f) {
                break;
            }
        }
        if (C34841Nu6.f25359b) {
            C34841Nu6.m93202e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f118697b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    /* renamed from: j */
    public final void m4196j(String str, C30412a c30412a) {
        if (!this.f118696a.containsKey(str)) {
            this.f118697b += c30412a.f118700a;
        } else {
            this.f118697b += c30412a.f118700a - this.f118696a.get(str).f118700a;
        }
        this.f118696a.put(str, c30412a);
    }

    /* renamed from: p */
    public synchronized void m4190p(String str) {
        boolean delete = m4200f(str).delete();
        m4189q(str);
        if (!delete) {
            C34841Nu6.m93205b("Could not delete cache entry for key=%s, filename=%s", str, m4199g(str));
        }
    }

    /* renamed from: q */
    public final void m4189q(String str) {
        C30412a remove = this.f118696a.remove(str);
        if (remove != null) {
            this.f118697b -= remove.f118700a;
        }
    }

    /* renamed from: y41$b */
    /* loaded from: classes.dex */
    public static class C30413b extends FilterInputStream {

        /* renamed from: b */
        public final long f118708b;

        /* renamed from: c */
        public long f118709c;

        public C30413b(InputStream inputStream, long j) {
            super(inputStream);
            this.f118708b = j;
        }

        /* renamed from: a */
        public long m4179a() {
            return this.f118708b - this.f118709c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f118709c++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f118709c += read;
            }
            return read;
        }
    }

    public C51985y41(InterfaceC30414c interfaceC30414c) {
        this(interfaceC30414c, 5242880);
    }

    /* renamed from: y41$a */
    /* loaded from: classes.dex */
    public static class C30412a {

        /* renamed from: a */
        public long f118700a;

        /* renamed from: b */
        public final String f118701b;

        /* renamed from: c */
        public final String f118702c;

        /* renamed from: d */
        public final long f118703d;

        /* renamed from: e */
        public final long f118704e;

        /* renamed from: f */
        public final long f118705f;

        /* renamed from: g */
        public final long f118706g;

        /* renamed from: h */
        public final List<AH1> f118707h;

        public C30412a(String str, String str2, long j, long j2, long j3, long j4, List<AH1> list) {
            this.f118701b = str;
            this.f118702c = "".equals(str2) ? null : str2;
            this.f118703d = j;
            this.f118704e = j2;
            this.f118705f = j3;
            this.f118706g = j4;
            this.f118707h = list;
        }

        /* renamed from: a */
        public static List<AH1> m4183a(Y70.C9639a c9639a) {
            List<AH1> list = c9639a.f44581h;
            if (list != null) {
                return list;
            }
            return EN1.m109098h(c9639a.f44580g);
        }

        /* renamed from: b */
        public static C30412a m4182b(C30413b c30413b) throws IOException {
            if (C51985y41.m4193m(c30413b) == 538247942) {
                return new C30412a(C51985y41.m4191o(c30413b), C51985y41.m4191o(c30413b), C51985y41.m4192n(c30413b), C51985y41.m4192n(c30413b), C51985y41.m4192n(c30413b), C51985y41.m4192n(c30413b), C51985y41.m4194l(c30413b));
            }
            throw new IOException();
        }

        /* renamed from: c */
        public Y70.C9639a m4181c(byte[] bArr) {
            Y70.C9639a c9639a = new Y70.C9639a();
            c9639a.f44574a = bArr;
            c9639a.f44575b = this.f118702c;
            c9639a.f44576c = this.f118703d;
            c9639a.f44577d = this.f118704e;
            c9639a.f44578e = this.f118705f;
            c9639a.f44579f = this.f118706g;
            c9639a.f44580g = EN1.m109097i(this.f118707h);
            c9639a.f44581h = Collections.unmodifiableList(this.f118707h);
            return c9639a;
        }

        /* renamed from: d */
        public boolean m4180d(OutputStream outputStream) {
            try {
                C51985y41.m4186t(outputStream, 538247942);
                C51985y41.m4184v(outputStream, this.f118701b);
                String str = this.f118702c;
                if (str == null) {
                    str = "";
                }
                C51985y41.m4184v(outputStream, str);
                C51985y41.m4185u(outputStream, this.f118703d);
                C51985y41.m4185u(outputStream, this.f118704e);
                C51985y41.m4185u(outputStream, this.f118705f);
                C51985y41.m4185u(outputStream, this.f118706g);
                C51985y41.m4187s(this.f118707h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C34841Nu6.m93205b("%s", e.toString());
                return false;
            }
        }

        public C30412a(String str, Y70.C9639a c9639a) {
            this(str, c9639a.f44575b, c9639a.f44576c, c9639a.f44577d, c9639a.f44578e, c9639a.f44579f, m4183a(c9639a));
        }
    }
}
