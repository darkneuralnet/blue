package bo.app;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* renamed from: bo.app.l0 */
/* loaded from: classes.dex */
public final class C12861l0 {

    /* renamed from: o */
    static final Pattern f58819o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: p */
    private static final String f58820p = C43664k20.m29433n(C12861l0.class);

    /* renamed from: q */
    private static final OutputStream f58821q = new C12863b();

    /* renamed from: a */
    private final File f58822a;

    /* renamed from: b */
    private final File f58823b;

    /* renamed from: c */
    private final File f58824c;

    /* renamed from: d */
    private final File f58825d;

    /* renamed from: e */
    private final int f58826e;

    /* renamed from: f */
    private long f58827f;

    /* renamed from: g */
    private final int f58828g;

    /* renamed from: i */
    private Writer f58830i;

    /* renamed from: k */
    private int f58832k;

    /* renamed from: h */
    private long f58829h = 0;

    /* renamed from: j */
    private final LinkedHashMap<String, C13078r0> f58831j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    private long f58833l = 0;

    /* renamed from: m */
    final ThreadPoolExecutor f58834m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n */
    private final Callable<Void> f58835n = new CallableC12862a();

    /* renamed from: bo.app.l0$a */
    /* loaded from: classes.dex */
    public class CallableC12862a implements Callable<Void> {
        public CallableC12862a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (C12861l0.this) {
                if (C12861l0.this.f58830i != null) {
                    C12861l0.this.m63376i();
                    if (C12861l0.this.m63383e()) {
                        C12861l0.this.m63377h();
                        C12861l0.this.f58832k = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    }

    /* renamed from: bo.app.l0$b */
    /* loaded from: classes.dex */
    public class C12863b extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i) {
        }
    }

    /* renamed from: bo.app.l0$c */
    /* loaded from: classes.dex */
    public final class C12864c {

        /* renamed from: a */
        private final C13078r0 f58837a;

        /* renamed from: b */
        private final boolean[] f58838b;

        /* renamed from: c */
        private boolean f58839c;

        /* renamed from: d */
        private boolean f58840d;

        /* renamed from: bo.app.l0$c$a */
        /* loaded from: classes.dex */
        public class C12865a extends FilterOutputStream {
            public /* synthetic */ C12865a(C12864c c12864c, OutputStream outputStream, CallableC12862a callableC12862a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C12864c.this.f58839c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C12864c.this.f58839c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    C12864c.this.f58839c = true;
                }
            }

            private C12865a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C12864c.this.f58839c = true;
                }
            }
        }

        public /* synthetic */ C12864c(C12861l0 c12861l0, C13078r0 c13078r0, CallableC12862a callableC12862a) {
            this(c13078r0);
        }

        private C12864c(C13078r0 c13078r0) {
            this.f58837a = c13078r0;
            this.f58838b = c13078r0.f59202c ? null : new boolean[C12861l0.this.f58828g];
        }

        /* renamed from: b */
        public void m63370b() {
            if (this.f58839c) {
                C12861l0.this.m63401a(this, false);
                C12861l0.this.m63384d(this.f58837a.f59200a);
            } else {
                C12861l0.this.m63401a(this, true);
            }
            this.f58840d = true;
        }

        /* renamed from: a */
        public OutputStream m63373a(int i) {
            FileOutputStream fileOutputStream;
            C12865a c12865a;
            if (i < 0 || i >= C12861l0.this.f58828g) {
                throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + C12861l0.this.f58828g);
            }
            synchronized (C12861l0.this) {
                C13078r0 c13078r0 = this.f58837a;
                if (c13078r0.f59203d == this) {
                    if (!c13078r0.f59202c) {
                        this.f58838b[i] = true;
                    }
                    File m63040b = c13078r0.m63040b(i);
                    try {
                        fileOutputStream = new FileOutputStream(m63040b);
                    } catch (FileNotFoundException unused) {
                        C12861l0.this.f58822a.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(m63040b);
                        } catch (FileNotFoundException unused2) {
                            return C12861l0.f58821q;
                        }
                    }
                    c12865a = new C12865a(this, fileOutputStream, null);
                } else {
                    throw new IllegalStateException();
                }
            }
            return c12865a;
        }

        /* renamed from: a */
        public void m63374a() {
            C12861l0.this.m63401a(this, false);
        }
    }

    /* renamed from: bo.app.l0$d */
    /* loaded from: classes.dex */
    public final class C12866d implements Closeable {

        /* renamed from: b */
        private final String f58843b;

        /* renamed from: c */
        private final long f58844c;

        /* renamed from: d */
        private final InputStream[] f58845d;

        /* renamed from: e */
        private final long[] f58846e;

        public /* synthetic */ C12866d(C12861l0 c12861l0, String str, long j, InputStream[] inputStreamArr, long[] jArr, CallableC12862a callableC12862a) {
            this(str, j, inputStreamArr, jArr);
        }

        /* renamed from: a */
        public InputStream m63368a(int i) {
            return this.f58845d[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f58845d) {
                C13090r6.m63020a(inputStream);
            }
        }

        private C12866d(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f58843b = str;
            this.f58844c = j;
            this.f58845d = inputStreamArr;
            this.f58846e = jArr;
        }
    }

    private C12861l0(File file, int i, int i2, long j) {
        this.f58822a = file;
        this.f58826e = i;
        this.f58823b = new File(file, "journal");
        this.f58824c = new File(file, "journal.tmp");
        this.f58825d = new File(file, "journal.bkp");
        this.f58828g = i2;
        this.f58827f = j;
    }

    /* renamed from: g */
    private void m63378g() {
        C12924n5 c12924n5 = new C12924n5(new FileInputStream(this.f58823b), C13090r6.f59231a);
        try {
            String m63290c = c12924n5.m63290c();
            String m63290c2 = c12924n5.m63290c();
            String m63290c3 = c12924n5.m63290c();
            String m63290c4 = c12924n5.m63290c();
            String m63290c5 = c12924n5.m63290c();
            if ("libcore.io.DiskLruCache".equals(m63290c) && "1".equals(m63290c2) && Integer.toString(this.f58826e).equals(m63290c3) && Integer.toString(this.f58828g).equals(m63290c4) && "".equals(m63290c5)) {
                int i = 0;
                while (true) {
                    try {
                        m63387c(c12924n5.m63290c());
                        i++;
                    } catch (EOFException unused) {
                        this.f58832k = i - this.f58831j.size();
                        if (c12924n5.m63291b()) {
                            m63377h();
                        } else {
                            this.f58830i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f58823b, true), C13090r6.f59231a));
                        }
                        C13090r6.m63020a(c12924n5);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + m63290c + ", " + m63290c2 + ", " + m63290c4 + ", " + m63290c5 + "]");
            }
        } catch (Throwable th) {
            C13090r6.m63020a(c12924n5);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m63377h() {
        Writer writer = this.f58830i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f58824c), C13090r6.f59231a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f58826e));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f58828g));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C13078r0 c13078r0 : this.f58831j.values()) {
            if (c13078r0.f59203d != null) {
                bufferedWriter.write("DIRTY " + c13078r0.f59200a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c13078r0.f59200a + c13078r0.m63043a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f58823b.exists()) {
            m63395a(this.f58823b, this.f58825d, true);
        }
        m63395a(this.f58824c, this.f58823b, false);
        this.f58825d.delete();
        this.f58830i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f58823b, true), C13090r6.f59231a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m63376i() {
        while (this.f58829h > this.f58827f) {
            m63384d(this.f58831j.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: c */
    private void m63387c(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f58831j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C13078r0 c13078r0 = this.f58831j.get(substring);
            if (c13078r0 == null) {
                c13078r0 = new C13078r0(substring, this.f58828g, this.f58822a);
                this.f58831j.put(substring, c13078r0);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c13078r0.f59202c = true;
                c13078r0.f59203d = null;
                c13078r0.m63039b(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c13078r0.f59203d = new C12864c(this, c13078r0, null);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m63383e() {
        int i = this.f58832k;
        return i >= 2000 && i >= this.f58831j.size();
    }

    /* renamed from: f */
    private void m63380f() {
        m63397a(this.f58824c);
        Iterator<C13078r0> it = this.f58831j.values().iterator();
        while (it.hasNext()) {
            C13078r0 next = it.next();
            int i = 0;
            if (next.f59203d == null) {
                while (i < this.f58828g) {
                    this.f58829h += next.f59201b[i];
                    i++;
                }
            } else {
                next.f59203d = null;
                while (i < this.f58828g) {
                    m63397a(next.m63042a(i));
                    m63397a(next.m63040b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public synchronized C12866d m63390b(String str) {
        InputStream inputStream;
        m63392b();
        m63381e(str);
        C13078r0 c13078r0 = this.f58831j.get(str);
        if (c13078r0 == null) {
            return null;
        }
        if (c13078r0.f59202c) {
            InputStream[] inputStreamArr = new InputStream[this.f58828g];
            for (int i = 0; i < this.f58828g; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(c13078r0.m63042a(i));
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < this.f58828g && (inputStream = inputStreamArr[i2]) != null; i2++) {
                        C13090r6.m63020a(inputStream);
                    }
                    return null;
                }
            }
            this.f58832k++;
            this.f58830i.append((CharSequence) ("READ " + str + '\n'));
            if (m63383e()) {
                this.f58834m.submit(this.f58835n);
            }
            return new C12866d(this, str, c13078r0.f59204e, inputStreamArr, c13078r0.f59201b, null);
        }
        return null;
    }

    /* renamed from: d */
    public synchronized boolean m63384d(String str) {
        m63392b();
        m63381e(str);
        C13078r0 c13078r0 = this.f58831j.get(str);
        if (c13078r0 != null && c13078r0.f59203d == null) {
            for (int i = 0; i < this.f58828g; i++) {
                File m63042a = c13078r0.m63042a(i);
                if (m63042a.exists() && !m63042a.delete()) {
                    throw new IOException("failed to delete " + m63042a);
                }
                long j = this.f58829h;
                long[] jArr = c13078r0.f59201b;
                this.f58829h = j - jArr[i];
                jArr[i] = 0;
            }
            this.f58832k++;
            this.f58830i.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f58831j.remove(str);
            if (m63383e()) {
                this.f58834m.submit(this.f58835n);
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m63381e(String str) {
        if (f58819o.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* renamed from: a */
    public static C12861l0 m63396a(File file, int i, int i2, long j) {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        m63395a(file2, file3, false);
                    }
                }
                C12861l0 c12861l0 = new C12861l0(file, i, i2, j);
                if (c12861l0.f58823b.exists()) {
                    try {
                        c12861l0.m63378g();
                        c12861l0.m63380f();
                        return c12861l0;
                    } catch (IOException e) {
                        String str = f58820p;
                        C43664k20.m29421z(str, "DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        c12861l0.m63386d();
                    }
                }
                file.mkdirs();
                C12861l0 c12861l02 = new C12861l0(file, i, i2, j);
                c12861l02.m63377h();
                return c12861l02;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: b */
    private void m63392b() {
        if (this.f58830i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: d */
    public void m63386d() {
        m63389c();
        C13090r6.m63019a(this.f58822a);
    }

    /* renamed from: c */
    public synchronized void m63389c() {
        if (this.f58830i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f58831j.values()).iterator();
        while (it.hasNext()) {
            C12864c c12864c = ((C13078r0) it.next()).f59203d;
            if (c12864c != null) {
                c12864c.m63374a();
            }
        }
        m63376i();
        this.f58830i.close();
        this.f58830i = null;
    }

    /* renamed from: a */
    private static void m63397a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m63395a(File file, File file2, boolean z) {
        if (z) {
            m63397a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public C12864c m63394a(String str) {
        return m63393a(str, -1L);
    }

    /* renamed from: a */
    private synchronized C12864c m63393a(String str, long j) {
        m63392b();
        m63381e(str);
        C13078r0 c13078r0 = this.f58831j.get(str);
        if (j == -1 || (c13078r0 != null && c13078r0.f59204e == j)) {
            if (c13078r0 == null) {
                c13078r0 = new C13078r0(str, this.f58828g, this.f58822a);
                this.f58831j.put(str, c13078r0);
            } else if (c13078r0.f59203d != null) {
                return null;
            }
            C12864c c12864c = new C12864c(this, c13078r0, null);
            c13078r0.f59203d = c12864c;
            Writer writer = this.f58830i;
            writer.write("DIRTY " + str + '\n');
            this.f58830i.flush();
            return c12864c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m63401a(C12864c c12864c, boolean z) {
        C13078r0 c13078r0 = c12864c.f58837a;
        if (c13078r0.f59203d == c12864c) {
            if (z && !c13078r0.f59202c) {
                for (int i = 0; i < this.f58828g; i++) {
                    if (c12864c.f58838b[i]) {
                        if (!c13078r0.m63040b(i).exists()) {
                            c12864c.m63374a();
                            return;
                        }
                    } else {
                        c12864c.m63374a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f58828g; i2++) {
                File m63040b = c13078r0.m63040b(i2);
                if (z) {
                    if (m63040b.exists()) {
                        File m63042a = c13078r0.m63042a(i2);
                        m63040b.renameTo(m63042a);
                        long j = c13078r0.f59201b[i2];
                        long length = m63042a.length();
                        c13078r0.f59201b[i2] = length;
                        this.f58829h = (this.f58829h - j) + length;
                    }
                } else {
                    m63397a(m63040b);
                }
            }
            this.f58832k++;
            c13078r0.f59203d = null;
            if (c13078r0.f59202c | z) {
                c13078r0.f59202c = true;
                this.f58830i.write("CLEAN " + c13078r0.f59200a + c13078r0.m63043a() + '\n');
                if (z) {
                    long j2 = this.f58833l;
                    this.f58833l = 1 + j2;
                    c13078r0.f59204e = j2;
                }
            } else {
                this.f58831j.remove(c13078r0.f59200a);
                this.f58830i.write("REMOVE " + c13078r0.f59200a + '\n');
            }
            this.f58830i.flush();
            if (this.f58829h > this.f58827f || m63383e()) {
                this.f58834m.submit(this.f58835n);
            }
            return;
        }
        throw new IllegalStateException();
    }
}
