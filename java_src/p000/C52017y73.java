package p000;

import android.util.Pair;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: y73  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52017y73 {

    /* renamed from: a */
    public final XD2 f118785a;

    public C52017y73(XD2 xd2) {
        this.f118785a = xd2;
    }

    /* renamed from: b */
    public static String m4117b(String str, EnumC44089kl1 enumC44089kl1, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? enumC44089kl1.m28525b() : enumC44089kl1.f94876b);
        return sb.toString();
    }

    /* renamed from: a */
    public Pair<EnumC44089kl1, InputStream> m4118a(String str) {
        EnumC44089kl1 enumC44089kl1;
        try {
            File m4116c = m4116c(str);
            if (m4116c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m4116c);
            if (m4116c.getAbsolutePath().endsWith(".zip")) {
                enumC44089kl1 = EnumC44089kl1.ZIP;
            } else {
                enumC44089kl1 = EnumC44089kl1.JSON;
            }
            C32524Dx2.m109588a("Cache hit for " + str + " at " + m4116c.getAbsolutePath());
            return new Pair<>(enumC44089kl1, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final File m4116c(String str) throws FileNotFoundException {
        File file = new File(m4115d(), m4117b(str, EnumC44089kl1.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m4115d(), m4117b(str, EnumC44089kl1.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: d */
    public final File m4115d() {
        File mo77176a = this.f118785a.mo77176a();
        if (mo77176a.isFile()) {
            mo77176a.delete();
        }
        if (!mo77176a.exists()) {
            mo77176a.mkdirs();
        }
        return mo77176a;
    }

    /* renamed from: e */
    public void m4114e(String str, EnumC44089kl1 enumC44089kl1) {
        File file = new File(m4115d(), m4117b(str, enumC44089kl1, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C32524Dx2.m109588a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            C32524Dx2.m109586c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + InstructionFileId.DOT);
        }
    }

    /* renamed from: f */
    public File m4113f(String str, InputStream inputStream, EnumC44089kl1 enumC44089kl1) throws IOException {
        File file = new File(m4115d(), m4117b(str, enumC44089kl1, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
