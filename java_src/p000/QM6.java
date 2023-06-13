package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
/* renamed from: QM6 */
/* loaded from: classes6.dex */
public final class QM6 {

    /* renamed from: h */
    public static final C42061hK6 f30275h = new C42061hK6("SliceMetadataManager");

    /* renamed from: b */
    public final HK6 f30277b;

    /* renamed from: c */
    public final String f30278c;

    /* renamed from: d */
    public final int f30279d;

    /* renamed from: e */
    public final long f30280e;

    /* renamed from: f */
    public final String f30281f;

    /* renamed from: a */
    public final byte[] f30276a = new byte[8192];

    /* renamed from: g */
    public int f30282g = -1;

    public QM6(HK6 hk6, String str, int i, long j, String str2) {
        this.f30277b = hk6;
        this.f30278c = str;
        this.f30279d = i;
        this.f30280e = j;
        this.f30281f = str2;
    }

    /* renamed from: a */
    public final void m88593a(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f30282g));
        FileOutputStream fileOutputStream = new FileOutputStream(m88579o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                RL6.m86831a(th, th2);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void m88592b(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f30282g));
        FileOutputStream fileOutputStream = new FileOutputStream(m88579o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File m104027B = this.f30277b.m104027B(this.f30278c, this.f30279d, this.f30280e, this.f30281f);
            if (m104027B.exists()) {
                m104027B.delete();
            }
            fileOutputStream = new FileOutputStream(m104027B);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable th) {
                    RL6.m86831a(th, th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public final void m88591c(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(m88584j().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f30282g));
        FileOutputStream fileOutputStream = new FileOutputStream(m88579o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                RL6.m86831a(th, th2);
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final void m88590d(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f30282g));
        FileOutputStream fileOutputStream = new FileOutputStream(m88579o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                RL6.m86831a(th, th2);
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final PM6 m88589e() throws IOException {
        File m104028A = this.f30277b.m104028A(this.f30278c, this.f30279d, this.f30280e, this.f30281f);
        if (m104028A.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(m104028A);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C49185tL6("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f30282g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new PM6(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C49185tL6("Slice checkpoint file corrupt.", e);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    RL6.m86831a(th, th2);
                }
                throw th;
            }
        }
        throw new C49185tL6("Slice checkpoint file does not exist.");
    }

    /* renamed from: f */
    public final void m88588f(InputStream inputStream, long j) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(m88584j(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f30276a);
                if (read > 0) {
                    randomAccessFile.write(this.f30276a, 0, read);
                }
            } while (read == 8192);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                RL6.m86831a(th, th2);
            }
            throw th;
        }
    }

    /* renamed from: g */
    public final void m88587g(byte[] bArr) throws IOException {
        this.f30282g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m88580n(), String.format("%s-LFH.dat", Integer.valueOf(this.f30282g))));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e) {
            throw new C49185tL6("Could not write metadata file.", e);
        }
    }

    /* renamed from: h */
    public final void m88586h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f30282g++;
        FileOutputStream fileOutputStream = new FileOutputStream(m88584j());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f30276a);
            while (read > 0) {
                fileOutputStream.write(this.f30276a, 0, read);
                read = inputStream.read(this.f30276a);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                RL6.m86831a(th, th2);
            }
            throw th;
        }
    }

    /* renamed from: i */
    public final void m88585i(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(m88584j(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                RL6.m86831a(th, th2);
            }
            throw th;
        }
    }

    /* renamed from: j */
    public final File m88584j() {
        return new File(m88580n(), String.format("%s-NAM.dat", Integer.valueOf(this.f30282g)));
    }

    /* renamed from: k */
    public final int m88583k() throws IOException {
        File m104028A = this.f30277b.m104028A(this.f30278c, this.f30279d, this.f30280e, this.f30281f);
        if (m104028A.exists()) {
            FileInputStream fileInputStream = new FileInputStream(m104028A);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                    return -1;
                }
                if (properties.getProperty("previousChunk") != null) {
                    return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
                }
                throw new C49185tL6("Slice checkpoint file corrupt.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    RL6.m86831a(th, th2);
                }
                throw th;
            }
        }
        return 0;
    }

    /* renamed from: l */
    public final boolean m88582l() {
        File m104028A = this.f30277b.m104028A(this.f30278c, this.f30279d, this.f30280e, this.f30281f);
        if (m104028A.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(m104028A);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f30275h.m36537b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (IOException e) {
                f30275h.m36537b("Could not read checkpoint while checking if extraction finished. %s", e);
                return false;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final void m88581m(byte[] bArr, int i) throws IOException {
        this.f30282g++;
        FileOutputStream fileOutputStream = new FileOutputStream(m88584j());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                RL6.m86831a(th, th2);
            }
            throw th;
        }
    }

    /* renamed from: n */
    public final File m88580n() {
        File m104026C = this.f30277b.m104026C(this.f30278c, this.f30279d, this.f30280e, this.f30281f);
        if (!m104026C.exists()) {
            m104026C.mkdirs();
        }
        return m104026C;
    }

    /* renamed from: o */
    public final File m88579o() throws IOException {
        File m104028A = this.f30277b.m104028A(this.f30278c, this.f30279d, this.f30280e, this.f30281f);
        m104028A.getParentFile().mkdirs();
        m104028A.createNewFile();
        return m104028A;
    }
}
