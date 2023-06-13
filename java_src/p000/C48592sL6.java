package p000;

import ch.qos.logback.core.FileAppender;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;
/* renamed from: sL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48592sL6 {

    /* renamed from: f */
    public static final C42061hK6 f108657f = new C42061hK6("ExtractChunkTaskHandler");

    /* renamed from: a */
    public final byte[] f108658a = new byte[8192];

    /* renamed from: b */
    public final HK6 f108659b;

    /* renamed from: c */
    public final InterfaceC46230oM6<InterfaceC40920fP6> f108660c;

    /* renamed from: d */
    public final InterfaceC46230oM6<BK6> f108661d;

    /* renamed from: e */
    public final C51556xL6 f108662e;

    public C48592sL6(HK6 hk6, InterfaceC46230oM6<InterfaceC40920fP6> interfaceC46230oM6, InterfaceC46230oM6<BK6> interfaceC46230oM62, C51556xL6 c51556xL6) {
        this.f108659b = hk6;
        this.f108660c = interfaceC46230oM6;
        this.f108661d = interfaceC46230oM62;
        this.f108662e = c51556xL6;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(1:3)|4|5|6|(1:8)(2:112|113)|9|(2:11|(12:13|(1:(1:(2:17|(2:82|83))(2:84|85))(2:86|(10:88|(7:21|(4:22|(2:26|(1:35)(4:30|(1:32)|33|34))|36|(1:38)(1:62))|40|41|(1:43)|44|(2:46|(1:48)(2:49|(1:51)(3:52|(2:54|(1:56)(2:58|59))(1:61)|57))))|63|64|(2:76|77)|66|67|68|69|(2:71|72)(1:73))(2:89|90)))(2:91|(4:93|(4:94|(1:96)|97|(1:100)(1:106))|103|(1:105))(2:107|108))|19|(0)|63|64|(0)|66|67|68|69|(0)(0))(2:109|110))|111|(0)|63|64|(0)|66|67|68|69|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ed, code lost:
        p000.C48592sL6.f108657f.m36534e("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r23.f106886g), r23.f106884e, r23.f110336b);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017d A[Catch: all -> 0x032f, TryCatch #3 {IOException -> 0x033b, blocks: (B:6:0x002f, B:89:0x0288, B:9:0x0037, B:11:0x003f, B:13:0x0043, B:15:0x0051, B:19:0x005d, B:51:0x017d, B:52:0x0186, B:54:0x0190, B:56:0x0196, B:58:0x019c, B:60:0x01a2, B:62:0x01c6, B:63:0x01d2, B:64:0x01d6, B:65:0x01dd, B:67:0x01e3, B:69:0x01e9, B:71:0x01ef, B:72:0x01ff, B:74:0x0205, B:76:0x020b, B:77:0x021e, B:79:0x0224, B:80:0x0233, B:82:0x0239, B:88:0x027a, B:85:0x0261, B:86:0x0268, B:87:0x0269, B:22:0x0077, B:23:0x0080, B:24:0x0081, B:25:0x009a, B:26:0x009b, B:28:0x00c2, B:29:0x00ce, B:30:0x00d7, B:31:0x00d8, B:33:0x00f6, B:34:0x0108, B:36:0x011b, B:37:0x0120, B:42:0x012f, B:44:0x0138, B:45:0x0150, B:46:0x0159, B:47:0x015a, B:48:0x0179), top: B:116:0x002f }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14315a(C48000rL6 c48000rL6) {
        InputStream inputStream;
        C40309eN6 m30765a;
        File m88584j;
        long length;
        int min;
        int max;
        long j;
        QM6 qm6 = new QM6(this.f108659b, c48000rL6.f110336b, c48000rL6.f106882c, c48000rL6.f106883d, c48000rL6.f106884e);
        File m104026C = this.f108659b.m104026C(c48000rL6.f110336b, c48000rL6.f106882c, c48000rL6.f106883d, c48000rL6.f106884e);
        if (!m104026C.exists()) {
            m104026C.mkdirs();
        }
        try {
            InputStream inputStream2 = c48000rL6.f106890k;
            GZIPInputStream gZIPInputStream = c48000rL6.f106885f != 1 ? inputStream2 : new GZIPInputStream(inputStream2, 8192);
            if (c48000rL6.f106886g > 0) {
                PM6 m88589e = qm6.m88589e();
                int m90370e = m88589e.m90370e();
                int i = c48000rL6.f106886g;
                if (m90370e != i - 1) {
                    throw new C49185tL6(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i), Integer.valueOf(m88589e.m90370e())), c48000rL6.f110335a);
                }
                int m90374a = m88589e.m90374a();
                if (m90374a == 1) {
                    f108657f.m36538a("Resuming zip entry from last chunk during file %s.", m88589e.m90373b());
                    File file = new File(m88589e.m90373b());
                    if (!file.exists()) {
                        throw new C49185tL6("Partial file specified in checkpoint does not exist. Corrupt directory.", c48000rL6.f110335a);
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    randomAccessFile.seek(m88589e.m90372c());
                    long m90371d = m88589e.m90371d();
                    while (true) {
                        min = (int) Math.min(m90371d, (long) FileAppender.DEFAULT_BUFFER_SIZE);
                        max = Math.max(gZIPInputStream.read(this.f108658a, 0, min), 0);
                        if (max > 0) {
                            randomAccessFile.write(this.f108658a, 0, max);
                        }
                        j = m90371d - max;
                        if (j <= 0 || max <= 0) {
                            break;
                        }
                        m90371d = j;
                    }
                    long length2 = randomAccessFile.length();
                    randomAccessFile.close();
                    if (max != min) {
                        f108657f.m36538a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                        qm6.m88593a(file.getCanonicalPath(), length2, j, c48000rL6.f106886g);
                    }
                } else if (m90374a == 2) {
                    f108657f.m36538a("Resuming zip entry from last chunk during local file header.", new Object[0]);
                    File m104027B = this.f108659b.m104027B(c48000rL6.f110336b, c48000rL6.f106882c, c48000rL6.f106883d, c48000rL6.f106884e);
                    if (!m104027B.exists()) {
                        throw new C49185tL6("Checkpoint extension file not found.", c48000rL6.f110335a);
                    }
                    inputStream = new SequenceInputStream(new FileInputStream(m104027B), gZIPInputStream);
                    if (inputStream != null) {
                        C43256jL6 c43256jL6 = new C43256jL6(inputStream);
                        File m14314b = m14314b(c48000rL6);
                        do {
                            m30765a = c43256jL6.m30765a();
                            if (!m30765a.m42948g() && !c43256jL6.m30763c()) {
                                if (!m30765a.m42952c() || m30765a.m42953b()) {
                                    qm6.m88586h(m30765a.m42946i(), c43256jL6);
                                } else {
                                    qm6.m88587g(m30765a.m42946i());
                                    File file2 = new File(m14314b, m30765a.m42951d());
                                    file2.getParentFile().mkdirs();
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    int read = c43256jL6.read(this.f108658a);
                                    while (read > 0) {
                                        fileOutputStream.write(this.f108658a, 0, read);
                                        read = c43256jL6.read(this.f108658a);
                                    }
                                    fileOutputStream.close();
                                }
                            }
                            if (c43256jL6.m30764b()) {
                                break;
                            }
                        } while (!c43256jL6.m30763c());
                        if (c43256jL6.m30763c()) {
                            f108657f.m36538a("Writing central directory metadata.", new Object[0]);
                            qm6.m88586h(m30765a.m42946i(), inputStream);
                        }
                        if (!c48000rL6.m16045a()) {
                            if (m30765a.m42948g()) {
                                f108657f.m36538a("Writing slice checkpoint for partial local file header.", new Object[0]);
                                qm6.m88592b(m30765a.m42946i(), c48000rL6.f106886g);
                            } else if (c43256jL6.m30763c()) {
                                f108657f.m36538a("Writing slice checkpoint for central directory.", new Object[0]);
                                qm6.m88591c(c48000rL6.f106886g);
                            } else {
                                if (m30765a.m42949f() == 0) {
                                    f108657f.m36538a("Writing slice checkpoint for partial file.", new Object[0]);
                                    m88584j = new File(m14314b(c48000rL6), m30765a.m42951d());
                                    length = m30765a.m42950e() - c43256jL6.m30762d();
                                    if (m88584j.length() != length) {
                                        throw new C49185tL6("Partial file is of unexpected size.");
                                    }
                                } else {
                                    f108657f.m36538a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                    m88584j = qm6.m88584j();
                                    length = m88584j.length();
                                }
                                qm6.m88593a(m88584j.getCanonicalPath(), length, c43256jL6.m30762d(), c48000rL6.f106886g);
                            }
                        }
                    }
                    gZIPInputStream.close();
                    if (c48000rL6.m16045a()) {
                        try {
                            qm6.m88590d(c48000rL6.f106886g);
                        } catch (IOException e) {
                            f108657f.m36537b("Writing extraction finished checkpoint failed with %s.", e.getMessage());
                            throw new C49185tL6("Writing extraction finished checkpoint failed.", e, c48000rL6.f110335a);
                        }
                    }
                    f108657f.m36535d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(c48000rL6.f106886g), c48000rL6.f106884e, c48000rL6.f110336b, Integer.valueOf(c48000rL6.f110335a));
                    this.f108660c.m21257a().mo10449b(c48000rL6.f110335a, c48000rL6.f110336b, c48000rL6.f106884e, c48000rL6.f106886g);
                    c48000rL6.f106890k.close();
                    if (c48000rL6.f106889j == 3) {
                        String str = c48000rL6.f110336b;
                        long j2 = c48000rL6.f106888i;
                        this.f108661d.m21257a().m114092f(AbstractC7546So.m84820d(str, 3, 0, j2, j2, this.f108662e.m5430c(str, c48000rL6), 1, ""));
                        return;
                    }
                    return;
                } else if (m90374a != 3) {
                    throw new C49185tL6(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(m88589e.m90374a())), c48000rL6.f110335a);
                } else {
                    f108657f.m36538a("Resuming central directory from last chunk.", new Object[0]);
                    qm6.m88588f(gZIPInputStream, m88589e.m90372c());
                    if (!c48000rL6.m16045a()) {
                        throw new C49185tL6("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", c48000rL6.f110335a);
                    }
                }
                inputStream = null;
                if (inputStream != null) {
                }
                gZIPInputStream.close();
                if (c48000rL6.m16045a()) {
                }
                f108657f.m36535d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(c48000rL6.f106886g), c48000rL6.f106884e, c48000rL6.f110336b, Integer.valueOf(c48000rL6.f110335a));
                this.f108660c.m21257a().mo10449b(c48000rL6.f110335a, c48000rL6.f110336b, c48000rL6.f106884e, c48000rL6.f106886g);
                c48000rL6.f106890k.close();
                if (c48000rL6.f106889j == 3) {
                }
            }
            inputStream = gZIPInputStream;
            if (inputStream != null) {
            }
            gZIPInputStream.close();
            if (c48000rL6.m16045a()) {
            }
            f108657f.m36535d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(c48000rL6.f106886g), c48000rL6.f106884e, c48000rL6.f110336b, Integer.valueOf(c48000rL6.f110335a));
            this.f108660c.m21257a().mo10449b(c48000rL6.f110335a, c48000rL6.f110336b, c48000rL6.f106884e, c48000rL6.f106886g);
            c48000rL6.f106890k.close();
            if (c48000rL6.f106889j == 3) {
            }
        } catch (IOException e2) {
            f108657f.m36537b("IOException during extraction %s.", e2.getMessage());
            throw new C49185tL6(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(c48000rL6.f106886g), c48000rL6.f106884e, c48000rL6.f110336b, Integer.valueOf(c48000rL6.f110335a)), e2, c48000rL6.f110335a);
        }
    }

    /* renamed from: b */
    public final File m14314b(C48000rL6 c48000rL6) {
        File m103996v = this.f108659b.m103996v(c48000rL6.f110336b, c48000rL6.f106882c, c48000rL6.f106883d, c48000rL6.f106884e);
        if (!m103996v.exists()) {
            m103996v.mkdirs();
        }
        return m103996v;
    }
}
