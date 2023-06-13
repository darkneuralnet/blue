package p000;

import com.amazonaws.services.p026s3.model.InstructionFileId;
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
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* renamed from: F41 */
/* loaded from: classes6.dex */
public final class F41 implements Closeable {

    /* renamed from: p */
    public static final Pattern f8602p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: q */
    public static final OutputStream f8603q = new C2128b();

    /* renamed from: b */
    public final File f8604b;

    /* renamed from: c */
    public final File f8605c;

    /* renamed from: d */
    public final File f8606d;

    /* renamed from: e */
    public final File f8607e;

    /* renamed from: f */
    public final int f8608f;

    /* renamed from: g */
    public long f8609g;

    /* renamed from: h */
    public final int f8610h;

    /* renamed from: j */
    public Writer f8612j;

    /* renamed from: l */
    public int f8614l;

    /* renamed from: i */
    public long f8611i = 0;

    /* renamed from: k */
    public final LinkedHashMap<String, C2131d> f8613k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m */
    public long f8615m = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f8616n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: o */
    public final Callable<Void> f8617o = new CallableC2127a();

    /* renamed from: F41$a */
    /* loaded from: classes6.dex */
    public class CallableC2127a implements Callable<Void> {
        public CallableC2127a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (F41.this) {
                if (F41.this.f8612j == null) {
                    return null;
                }
                F41.this.m107864E();
                if (F41.this.m107845v()) {
                    F41.this.m107867B();
                    F41.this.f8614l = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: F41$b */
    /* loaded from: classes6.dex */
    public static class C2128b extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    }

    /* renamed from: F41$c */
    /* loaded from: classes6.dex */
    public final class C2129c {

        /* renamed from: a */
        public final C2131d f8619a;

        /* renamed from: b */
        public final boolean[] f8620b;

        /* renamed from: c */
        public boolean f8621c;

        /* renamed from: d */
        public boolean f8622d;

        /* renamed from: F41$c$a */
        /* loaded from: classes6.dex */
        public class C2130a extends FilterOutputStream {
            public /* synthetic */ C2130a(C2129c c2129c, OutputStream outputStream, CallableC2127a callableC2127a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C2129c.this.f8621c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C2129c.this.f8621c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    C2129c.this.f8621c = true;
                }
            }

            public C2130a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C2129c.this.f8621c = true;
                }
            }
        }

        public /* synthetic */ C2129c(F41 f41, C2131d c2131d, CallableC2127a callableC2127a) {
            this(c2131d);
        }

        /* renamed from: a */
        public void m107840a() throws IOException {
            F41.this.m107852n(this, false);
        }

        /* renamed from: e */
        public void m107836e() throws IOException {
            if (this.f8621c) {
                F41.this.m107852n(this, false);
                F41.this.m107866C(this.f8619a.f8625a);
            } else {
                F41.this.m107852n(this, true);
            }
            this.f8622d = true;
        }

        /* renamed from: f */
        public OutputStream m107835f(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C2130a c2130a;
            synchronized (F41.this) {
                if (this.f8619a.f8628d == this) {
                    if (!this.f8619a.f8627c) {
                        this.f8620b[i] = true;
                    }
                    File m107824k = this.f8619a.m107824k(i);
                    try {
                        fileOutputStream = new FileOutputStream(m107824k);
                    } catch (FileNotFoundException unused) {
                        F41.this.f8604b.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(m107824k);
                        } catch (FileNotFoundException unused2) {
                            return F41.f8603q;
                        }
                    }
                    c2130a = new C2130a(this, fileOutputStream, null);
                } else {
                    throw new IllegalStateException();
                }
            }
            return c2130a;
        }

        public C2129c(C2131d c2131d) {
            this.f8619a = c2131d;
            this.f8620b = c2131d.f8627c ? null : new boolean[F41.this.f8610h];
        }
    }

    /* renamed from: F41$d */
    /* loaded from: classes6.dex */
    public final class C2131d {

        /* renamed from: a */
        public final String f8625a;

        /* renamed from: b */
        public final long[] f8626b;

        /* renamed from: c */
        public boolean f8627c;

        /* renamed from: d */
        public C2129c f8628d;

        /* renamed from: e */
        public long f8629e;

        public /* synthetic */ C2131d(F41 f41, String str, CallableC2127a callableC2127a) {
            this(str);
        }

        /* renamed from: j */
        public File m107825j(int i) {
            File file = F41.this.f8604b;
            return new File(file, this.f8625a + InstructionFileId.DOT + i);
        }

        /* renamed from: k */
        public File m107824k(int i) {
            File file = F41.this.f8604b;
            return new File(file, this.f8625a + InstructionFileId.DOT + i + ".tmp");
        }

        /* renamed from: l */
        public String m107823l() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f8626b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException m107822m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m107821n(String[] strArr) throws IOException {
            if (strArr.length == F41.this.f8610h) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f8626b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m107822m(strArr);
                    }
                }
                return;
            }
            throw m107822m(strArr);
        }

        public C2131d(String str) {
            this.f8625a = str;
            this.f8626b = new long[F41.this.f8610h];
        }
    }

    /* renamed from: F41$e */
    /* loaded from: classes6.dex */
    public final class C2132e implements Closeable {

        /* renamed from: b */
        public final String f8631b;

        /* renamed from: c */
        public final long f8632c;

        /* renamed from: d */
        public final InputStream[] f8633d;

        /* renamed from: e */
        public final long[] f8634e;

        public /* synthetic */ C2132e(F41 f41, String str, long j, InputStream[] inputStreamArr, long[] jArr, CallableC2127a callableC2127a) {
            this(str, j, inputStreamArr, jArr);
        }

        /* renamed from: a */
        public InputStream m107820a(int i) {
            return this.f8633d[i];
        }

        /* renamed from: b */
        public long m107819b(int i) {
            return this.f8634e[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f8633d) {
                C49400ti6.m11881a(inputStream);
            }
        }

        public C2132e(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f8631b = str;
            this.f8632c = j;
            this.f8633d = inputStreamArr;
            this.f8634e = jArr;
        }
    }

    public F41(File file, int i, int i2, long j) {
        this.f8604b = file;
        this.f8608f = i;
        this.f8605c = new File(file, "journal");
        this.f8606d = new File(file, "journal.tmp");
        this.f8607e = new File(file, "journal.bkp");
        this.f8610h = i2;
        this.f8609g = j;
    }

    /* renamed from: D */
    public static void m107865D(File file, File file2, boolean z) throws IOException {
        if (z) {
            m107850q(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    /* renamed from: q */
    public static void m107850q(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: x */
    public static F41 m107844x(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        m107865D(file2, file3, false);
                    }
                }
                F41 f41 = new F41(file, i, i2, j);
                if (f41.f8605c.exists()) {
                    try {
                        f41.m107842z();
                        f41.m107843y();
                        f41.f8612j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f41.f8605c, true), C49400ti6.f110928a));
                        return f41;
                    } catch (IOException e) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        f41.m107851p();
                    }
                }
                file.mkdirs();
                F41 f412 = new F41(file, i, i2, j);
                f412.m107867B();
                return f412;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: A */
    public final void m107868A(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f8613k.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C2131d c2131d = this.f8613k.get(substring);
            if (c2131d == null) {
                c2131d = new C2131d(this, substring, null);
                this.f8613k.put(substring, c2131d);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c2131d.f8627c = true;
                c2131d.f8628d = null;
                c2131d.m107821n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c2131d.f8628d = new C2129c(this, c2131d, null);
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
    public final synchronized void m107867B() throws IOException {
        Writer writer = this.f8612j;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8606d), C49400ti6.f110928a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f8608f));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f8610h));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C2131d c2131d : this.f8613k.values()) {
            if (c2131d.f8628d != null) {
                bufferedWriter.write("DIRTY " + c2131d.f8625a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c2131d.f8625a + c2131d.m107823l() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f8605c.exists()) {
            m107865D(this.f8605c, this.f8607e, true);
        }
        m107865D(this.f8606d, this.f8605c, false);
        this.f8607e.delete();
        this.f8612j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8605c, true), C49400ti6.f110928a));
    }

    /* renamed from: C */
    public synchronized boolean m107866C(String str) throws IOException {
        m107853m();
        m107863F(str);
        C2131d c2131d = this.f8613k.get(str);
        if (c2131d != null && c2131d.f8628d == null) {
            for (int i = 0; i < this.f8610h; i++) {
                File m107825j = c2131d.m107825j(i);
                if (m107825j.exists() && !m107825j.delete()) {
                    throw new IOException("failed to delete " + m107825j);
                }
                this.f8611i -= c2131d.f8626b[i];
                c2131d.f8626b[i] = 0;
            }
            this.f8614l++;
            this.f8612j.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f8613k.remove(str);
            if (m107845v()) {
                this.f8616n.submit(this.f8617o);
            }
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final void m107864E() throws IOException {
        while (this.f8611i > this.f8609g) {
            m107866C(this.f8613k.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: F */
    public final void m107863F(String str) {
        if (f8602p.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f8612j == null) {
            return;
        }
        Iterator it = new ArrayList(this.f8613k.values()).iterator();
        while (it.hasNext()) {
            C2131d c2131d = (C2131d) it.next();
            if (c2131d.f8628d != null) {
                c2131d.f8628d.m107840a();
            }
        }
        m107864E();
        this.f8612j.close();
        this.f8612j = null;
    }

    public synchronized void flush() throws IOException {
        m107853m();
        m107864E();
        this.f8612j.flush();
    }

    /* renamed from: m */
    public final void m107853m() {
        if (this.f8612j != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: n */
    public final synchronized void m107852n(C2129c c2129c, boolean z) throws IOException {
        C2131d c2131d = c2129c.f8619a;
        if (c2131d.f8628d == c2129c) {
            if (z && !c2131d.f8627c) {
                for (int i = 0; i < this.f8610h; i++) {
                    if (c2129c.f8620b[i]) {
                        if (!c2131d.m107824k(i).exists()) {
                            c2129c.m107840a();
                            return;
                        }
                    } else {
                        c2129c.m107840a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f8610h; i2++) {
                File m107824k = c2131d.m107824k(i2);
                if (z) {
                    if (m107824k.exists()) {
                        File m107825j = c2131d.m107825j(i2);
                        m107824k.renameTo(m107825j);
                        long j = c2131d.f8626b[i2];
                        long length = m107825j.length();
                        c2131d.f8626b[i2] = length;
                        this.f8611i = (this.f8611i - j) + length;
                    }
                } else {
                    m107850q(m107824k);
                }
            }
            this.f8614l++;
            c2131d.f8628d = null;
            if (c2131d.f8627c | z) {
                c2131d.f8627c = true;
                this.f8612j.write("CLEAN " + c2131d.f8625a + c2131d.m107823l() + '\n');
                if (z) {
                    long j2 = this.f8615m;
                    this.f8615m = 1 + j2;
                    c2131d.f8629e = j2;
                }
            } else {
                this.f8613k.remove(c2131d.f8625a);
                this.f8612j.write("REMOVE " + c2131d.f8625a + '\n');
            }
            this.f8612j.flush();
            if (this.f8611i > this.f8609g || m107845v()) {
                this.f8616n.submit(this.f8617o);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    public void m107851p() throws IOException {
        close();
        C49400ti6.m11880b(this.f8604b);
    }

    /* renamed from: r */
    public C2129c m107849r(String str) throws IOException {
        return m107848s(str, -1L);
    }

    /* renamed from: s */
    public final synchronized C2129c m107848s(String str, long j) throws IOException {
        m107853m();
        m107863F(str);
        C2131d c2131d = this.f8613k.get(str);
        if (j != -1 && (c2131d == null || c2131d.f8629e != j)) {
            return null;
        }
        if (c2131d == null) {
            c2131d = new C2131d(this, str, null);
            this.f8613k.put(str, c2131d);
        } else if (c2131d.f8628d != null) {
            return null;
        }
        C2129c c2129c = new C2129c(this, c2131d, null);
        c2131d.f8628d = c2129c;
        Writer writer = this.f8612j;
        writer.write("DIRTY " + str + '\n');
        this.f8612j.flush();
        return c2129c;
    }

    /* renamed from: t */
    public synchronized C2132e m107847t(String str) throws IOException {
        InputStream inputStream;
        m107853m();
        m107863F(str);
        C2131d c2131d = this.f8613k.get(str);
        if (c2131d == null) {
            return null;
        }
        if (!c2131d.f8627c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f8610h];
        for (int i = 0; i < this.f8610h; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(c2131d.m107825j(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.f8610h && (inputStream = inputStreamArr[i2]) != null; i2++) {
                    C49400ti6.m11881a(inputStream);
                }
                return null;
            }
        }
        this.f8614l++;
        this.f8612j.append((CharSequence) ("READ " + str + '\n'));
        if (m107845v()) {
            this.f8616n.submit(this.f8617o);
        }
        return new C2132e(this, str, c2131d.f8629e, inputStreamArr, c2131d.f8626b, null);
    }

    /* renamed from: u */
    public File m107846u() {
        return this.f8604b;
    }

    /* renamed from: v */
    public final boolean m107845v() {
        int i = this.f8614l;
        return i >= 2000 && i >= this.f8613k.size();
    }

    /* renamed from: y */
    public final void m107843y() throws IOException {
        m107850q(this.f8606d);
        Iterator<C2131d> it = this.f8613k.values().iterator();
        while (it.hasNext()) {
            C2131d next = it.next();
            int i = 0;
            if (next.f8628d == null) {
                while (i < this.f8610h) {
                    this.f8611i += next.f8626b[i];
                    i++;
                }
            } else {
                next.f8628d = null;
                while (i < this.f8610h) {
                    m107850q(next.m107825j(i));
                    m107850q(next.m107824k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: z */
    public final void m107842z() throws IOException {
        OR5 or5 = new OR5(new FileInputStream(this.f8605c), C49400ti6.f110928a);
        try {
            String m92281c = or5.m92281c();
            String m92281c2 = or5.m92281c();
            String m92281c3 = or5.m92281c();
            String m92281c4 = or5.m92281c();
            String m92281c5 = or5.m92281c();
            if ("libcore.io.DiskLruCache".equals(m92281c) && "1".equals(m92281c2) && Integer.toString(this.f8608f).equals(m92281c3) && Integer.toString(this.f8610h).equals(m92281c4) && "".equals(m92281c5)) {
                int i = 0;
                while (true) {
                    try {
                        m107868A(or5.m92281c());
                        i++;
                    } catch (EOFException unused) {
                        this.f8614l = i - this.f8613k.size();
                        C49400ti6.m11881a(or5);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + m92281c + ", " + m92281c2 + ", " + m92281c4 + ", " + m92281c5 + "]");
            }
        } catch (Throwable th) {
            C49400ti6.m11881a(or5);
            throw th;
        }
    }
}
