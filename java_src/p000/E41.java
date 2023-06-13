package p000;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import ch.qos.logback.core.CoreConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: E41 */
/* loaded from: classes5.dex */
public final class E41 implements Closeable {

    /* renamed from: b */
    public final File f6911b;

    /* renamed from: c */
    public final File f6912c;

    /* renamed from: d */
    public final File f6913d;

    /* renamed from: e */
    public final File f6914e;

    /* renamed from: f */
    public final int f6915f;

    /* renamed from: g */
    public long f6916g;

    /* renamed from: h */
    public final int f6917h;

    /* renamed from: j */
    public Writer f6919j;

    /* renamed from: l */
    public int f6921l;

    /* renamed from: i */
    public long f6918i = 0;

    /* renamed from: k */
    public final LinkedHashMap<String, C1731d> f6920k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m */
    public long f6922m = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f6923n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1729b(null));

    /* renamed from: o */
    public final Callable<Void> f6924o = new CallableC1728a();

    /* renamed from: E41$a */
    /* loaded from: classes5.dex */
    public class CallableC1728a implements Callable<Void> {
        public CallableC1728a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (E41.this) {
                if (E41.this.f6919j == null) {
                    return null;
                }
                E41.this.m109463E();
                if (E41.this.m109445v()) {
                    E41.this.m109466B();
                    E41.this.f6921l = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: E41$b */
    /* loaded from: classes5.dex */
    public static final class ThreadFactoryC1729b implements ThreadFactory {
        private ThreadFactoryC1729b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ ThreadFactoryC1729b(CallableC1728a callableC1728a) {
            this();
        }
    }

    /* renamed from: E41$c */
    /* loaded from: classes5.dex */
    public final class C1730c {

        /* renamed from: a */
        public final C1731d f6926a;

        /* renamed from: b */
        public final boolean[] f6927b;

        /* renamed from: c */
        public boolean f6928c;

        public /* synthetic */ C1730c(E41 e41, C1731d c1731d, CallableC1728a callableC1728a) {
            this(c1731d);
        }

        /* renamed from: a */
        public void m109440a() throws IOException {
            E41.this.m109452n(this, false);
        }

        /* renamed from: b */
        public void m109439b() {
            if (!this.f6928c) {
                try {
                    m109440a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void m109436e() throws IOException {
            E41.this.m109452n(this, true);
            this.f6928c = true;
        }

        /* renamed from: f */
        public File m109435f(int i) throws IOException {
            File m109424k;
            synchronized (E41.this) {
                if (this.f6926a.f6935f == this) {
                    if (!this.f6926a.f6934e) {
                        this.f6927b[i] = true;
                    }
                    m109424k = this.f6926a.m109424k(i);
                    E41.this.f6911b.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return m109424k;
        }

        public C1730c(C1731d c1731d) {
            this.f6926a = c1731d;
            this.f6927b = c1731d.f6934e ? null : new boolean[E41.this.f6917h];
        }
    }

    /* renamed from: E41$d */
    /* loaded from: classes5.dex */
    public final class C1731d {

        /* renamed from: a */
        public final String f6930a;

        /* renamed from: b */
        public final long[] f6931b;

        /* renamed from: c */
        public File[] f6932c;

        /* renamed from: d */
        public File[] f6933d;

        /* renamed from: e */
        public boolean f6934e;

        /* renamed from: f */
        public C1730c f6935f;

        /* renamed from: g */
        public long f6936g;

        public /* synthetic */ C1731d(E41 e41, String str, CallableC1728a callableC1728a) {
            this(str);
        }

        /* renamed from: j */
        public File m109425j(int i) {
            return this.f6932c[i];
        }

        /* renamed from: k */
        public File m109424k(int i) {
            return this.f6933d[i];
        }

        /* renamed from: l */
        public String m109423l() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f6931b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException m109422m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m109421n(String[] strArr) throws IOException {
            if (strArr.length == E41.this.f6917h) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f6931b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m109422m(strArr);
                    }
                }
                return;
            }
            throw m109422m(strArr);
        }

        public C1731d(String str) {
            this.f6930a = str;
            this.f6931b = new long[E41.this.f6917h];
            this.f6932c = new File[E41.this.f6917h];
            this.f6933d = new File[E41.this.f6917h];
            StringBuilder sb = new StringBuilder(str);
            sb.append(CoreConstants.DOT);
            int length = sb.length();
            for (int i = 0; i < E41.this.f6917h; i++) {
                sb.append(i);
                this.f6932c[i] = new File(E41.this.f6911b, sb.toString());
                sb.append(".tmp");
                this.f6933d[i] = new File(E41.this.f6911b, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: E41$e */
    /* loaded from: classes5.dex */
    public final class C1732e {

        /* renamed from: a */
        public final String f6938a;

        /* renamed from: b */
        public final long f6939b;

        /* renamed from: c */
        public final long[] f6940c;

        /* renamed from: d */
        public final File[] f6941d;

        public /* synthetic */ C1732e(E41 e41, String str, long j, File[] fileArr, long[] jArr, CallableC1728a callableC1728a) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File m109420a(int i) {
            return this.f6941d[i];
        }

        public C1732e(String str, long j, File[] fileArr, long[] jArr) {
            this.f6938a = str;
            this.f6939b = j;
            this.f6941d = fileArr;
            this.f6940c = jArr;
        }
    }

    public E41(File file, int i, int i2, long j) {
        this.f6911b = file;
        this.f6915f = i;
        this.f6912c = new File(file, "journal");
        this.f6913d = new File(file, "journal.tmp");
        this.f6914e = new File(file, "journal.bkp");
        this.f6917h = i2;
        this.f6916g = j;
    }

    /* renamed from: D */
    public static void m109464D(File file, File file2, boolean z) throws IOException {
        if (z) {
            m109450q(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    @TargetApi(26)
    /* renamed from: m */
    public static void m109453m(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: q */
    public static void m109450q(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* renamed from: t */
    public static void m109447t(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: x */
    public static E41 m109444x(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        m109464D(file2, file3, false);
                    }
                }
                E41 e41 = new E41(file, i, i2, j);
                if (e41.f6912c.exists()) {
                    try {
                        e41.m109442z();
                        e41.m109443y();
                        return e41;
                    } catch (IOException e) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        e41.m109451p();
                    }
                }
                file.mkdirs();
                E41 e412 = new E41(file, i, i2, j);
                e412.m109466B();
                return e412;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: A */
    public final void m109467A(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f6920k.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C1731d c1731d = this.f6920k.get(substring);
            if (c1731d == null) {
                c1731d = new C1731d(this, substring, null);
                this.f6920k.put(substring, c1731d);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c1731d.f6934e = true;
                c1731d.f6935f = null;
                c1731d.m109421n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c1731d.f6935f = new C1730c(this, c1731d, null);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: B */
    public final synchronized void m109466B() throws IOException {
        Writer writer = this.f6919j;
        if (writer != null) {
            m109453m(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6913d), C50585vi6.f114535a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f6915f));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f6917h));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C1731d c1731d : this.f6920k.values()) {
            if (c1731d.f6935f != null) {
                bufferedWriter.write("DIRTY " + c1731d.f6930a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c1731d.f6930a + c1731d.m109423l() + '\n');
            }
        }
        m109453m(bufferedWriter);
        if (this.f6912c.exists()) {
            m109464D(this.f6912c, this.f6914e, true);
        }
        m109464D(this.f6913d, this.f6912c, false);
        this.f6914e.delete();
        this.f6919j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6912c, true), C50585vi6.f114535a));
    }

    /* renamed from: C */
    public synchronized boolean m109465C(String str) throws IOException {
        m109454l();
        C1731d c1731d = this.f6920k.get(str);
        if (c1731d != null && c1731d.f6935f == null) {
            for (int i = 0; i < this.f6917h; i++) {
                File m109425j = c1731d.m109425j(i);
                if (m109425j.exists() && !m109425j.delete()) {
                    throw new IOException("failed to delete " + m109425j);
                }
                this.f6918i -= c1731d.f6931b[i];
                c1731d.f6931b[i] = 0;
            }
            this.f6921l++;
            this.f6919j.append((CharSequence) "REMOVE");
            this.f6919j.append(' ');
            this.f6919j.append((CharSequence) str);
            this.f6919j.append('\n');
            this.f6920k.remove(str);
            if (m109445v()) {
                this.f6923n.submit(this.f6924o);
            }
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final void m109463E() throws IOException {
        while (this.f6918i > this.f6916g) {
            m109465C(this.f6920k.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f6919j == null) {
            return;
        }
        Iterator it = new ArrayList(this.f6920k.values()).iterator();
        while (it.hasNext()) {
            C1731d c1731d = (C1731d) it.next();
            if (c1731d.f6935f != null) {
                c1731d.f6935f.m109440a();
            }
        }
        m109463E();
        m109453m(this.f6919j);
        this.f6919j = null;
    }

    /* renamed from: l */
    public final void m109454l() {
        if (this.f6919j != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: n */
    public final synchronized void m109452n(C1730c c1730c, boolean z) throws IOException {
        C1731d c1731d = c1730c.f6926a;
        if (c1731d.f6935f == c1730c) {
            if (z && !c1731d.f6934e) {
                for (int i = 0; i < this.f6917h; i++) {
                    if (c1730c.f6927b[i]) {
                        if (!c1731d.m109424k(i).exists()) {
                            c1730c.m109440a();
                            return;
                        }
                    } else {
                        c1730c.m109440a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f6917h; i2++) {
                File m109424k = c1731d.m109424k(i2);
                if (z) {
                    if (m109424k.exists()) {
                        File m109425j = c1731d.m109425j(i2);
                        m109424k.renameTo(m109425j);
                        long j = c1731d.f6931b[i2];
                        long length = m109425j.length();
                        c1731d.f6931b[i2] = length;
                        this.f6918i = (this.f6918i - j) + length;
                    }
                } else {
                    m109450q(m109424k);
                }
            }
            this.f6921l++;
            c1731d.f6935f = null;
            if (c1731d.f6934e | z) {
                c1731d.f6934e = true;
                this.f6919j.append((CharSequence) "CLEAN");
                this.f6919j.append(' ');
                this.f6919j.append((CharSequence) c1731d.f6930a);
                this.f6919j.append((CharSequence) c1731d.m109423l());
                this.f6919j.append('\n');
                if (z) {
                    long j2 = this.f6922m;
                    this.f6922m = 1 + j2;
                    c1731d.f6936g = j2;
                }
            } else {
                this.f6920k.remove(c1731d.f6930a);
                this.f6919j.append((CharSequence) "REMOVE");
                this.f6919j.append(' ');
                this.f6919j.append((CharSequence) c1731d.f6930a);
                this.f6919j.append('\n');
            }
            m109447t(this.f6919j);
            if (this.f6918i > this.f6916g || m109445v()) {
                this.f6923n.submit(this.f6924o);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    public void m109451p() throws IOException {
        close();
        C50585vi6.m8243b(this.f6911b);
    }

    /* renamed from: r */
    public C1730c m109449r(String str) throws IOException {
        return m109448s(str, -1L);
    }

    /* renamed from: s */
    public final synchronized C1730c m109448s(String str, long j) throws IOException {
        m109454l();
        C1731d c1731d = this.f6920k.get(str);
        if (j != -1 && (c1731d == null || c1731d.f6936g != j)) {
            return null;
        }
        if (c1731d == null) {
            c1731d = new C1731d(this, str, null);
            this.f6920k.put(str, c1731d);
        } else if (c1731d.f6935f != null) {
            return null;
        }
        C1730c c1730c = new C1730c(this, c1731d, null);
        c1731d.f6935f = c1730c;
        this.f6919j.append((CharSequence) "DIRTY");
        this.f6919j.append(' ');
        this.f6919j.append((CharSequence) str);
        this.f6919j.append('\n');
        m109447t(this.f6919j);
        return c1730c;
    }

    /* renamed from: u */
    public synchronized C1732e m109446u(String str) throws IOException {
        m109454l();
        C1731d c1731d = this.f6920k.get(str);
        if (c1731d == null) {
            return null;
        }
        if (!c1731d.f6934e) {
            return null;
        }
        for (File file : c1731d.f6932c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f6921l++;
        this.f6919j.append((CharSequence) "READ");
        this.f6919j.append(' ');
        this.f6919j.append((CharSequence) str);
        this.f6919j.append('\n');
        if (m109445v()) {
            this.f6923n.submit(this.f6924o);
        }
        return new C1732e(this, str, c1731d.f6936g, c1731d.f6932c, c1731d.f6931b, null);
    }

    /* renamed from: v */
    public final boolean m109445v() {
        int i = this.f6921l;
        if (i >= 2000 && i >= this.f6920k.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final void m109443y() throws IOException {
        m109450q(this.f6913d);
        Iterator<C1731d> it = this.f6920k.values().iterator();
        while (it.hasNext()) {
            C1731d next = it.next();
            int i = 0;
            if (next.f6935f == null) {
                while (i < this.f6917h) {
                    this.f6918i += next.f6931b[i];
                    i++;
                }
            } else {
                next.f6935f = null;
                while (i < this.f6917h) {
                    m109450q(next.m109425j(i));
                    m109450q(next.m109424k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: z */
    public final void m109442z() throws IOException {
        PR5 pr5 = new PR5(new FileInputStream(this.f6912c), C50585vi6.f114535a);
        try {
            String m90246d = pr5.m90246d();
            String m90246d2 = pr5.m90246d();
            String m90246d3 = pr5.m90246d();
            String m90246d4 = pr5.m90246d();
            String m90246d5 = pr5.m90246d();
            if ("libcore.io.DiskLruCache".equals(m90246d) && "1".equals(m90246d2) && Integer.toString(this.f6915f).equals(m90246d3) && Integer.toString(this.f6917h).equals(m90246d4) && "".equals(m90246d5)) {
                int i = 0;
                while (true) {
                    try {
                        m109467A(pr5.m90246d());
                        i++;
                    } catch (EOFException unused) {
                        this.f6921l = i - this.f6920k.size();
                        if (pr5.m90247c()) {
                            m109466B();
                        } else {
                            this.f6919j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6912c, true), C50585vi6.f114535a));
                        }
                        C50585vi6.m8244a(pr5);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + m90246d + ", " + m90246d2 + ", " + m90246d4 + ", " + m90246d5 + "]");
            }
        } catch (Throwable th) {
            C50585vi6.m8244a(pr5);
            throw th;
        }
    }
}
