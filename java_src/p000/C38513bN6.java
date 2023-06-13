package p000;

import co.bird.android.model.Detail;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/* renamed from: bN6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38513bN6 {

    /* renamed from: a */
    public static final Pattern f57365a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* renamed from: a */
    public static List<File> m64614a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(C37920aN6.f50379a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[listFiles.length];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split(Detail.EMPTY_CHAR)[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new C49185tL6("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    C40309eN6 m30765a = new C43256jL6(fileInputStream).m30765a();
                    if (m30765a.m42951d() == null) {
                        throw new C49185tL6("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, m30765a.m42951d());
                    if (!file5.exists()) {
                        throw new C49185tL6(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        RL6.m86831a(th, th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
