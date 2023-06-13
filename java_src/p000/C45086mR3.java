package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: mR3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45086mR3 {

    /* renamed from: a */
    public File f98012a;

    /* renamed from: b */
    public final C31722Am1 f98013b;

    /* renamed from: mR3$a */
    /* loaded from: classes6.dex */
    public enum EnumC26097a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C45086mR3(C31722Am1 c31722Am1) {
        this.f98013b = c31722Am1;
    }

    /* renamed from: a */
    public final File m25628a() {
        if (this.f98012a == null) {
            synchronized (this) {
                if (this.f98012a == null) {
                    File filesDir = this.f98013b.m115293j().getFilesDir();
                    this.f98012a = new File(filesDir, "PersistedInstallation." + this.f98013b.m115289n() + ".json");
                }
            }
        }
        return this.f98012a;
    }

    /* renamed from: b */
    public AbstractC45679nR3 m25627b(AbstractC45679nR3 abstractC45679nR3) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC45679nR3.mo23777d());
            jSONObject.put("Status", abstractC45679nR3.mo23774g().ordinal());
            jSONObject.put("AuthToken", abstractC45679nR3.mo23779b());
            jSONObject.put("RefreshToken", abstractC45679nR3.mo23775f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC45679nR3.mo23773h());
            jSONObject.put("ExpiresInSecs", abstractC45679nR3.mo23778c());
            jSONObject.put("FisError", abstractC45679nR3.mo23776e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f98013b.m115293j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.DEFAULT_ENCODING));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (!createTempFile.renameTo(m25628a())) {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        return abstractC45679nR3;
    }

    /* renamed from: c */
    public final JSONObject m25626c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m25628a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: d */
    public AbstractC45679nR3 m25625d() {
        JSONObject m25626c = m25626c();
        String optString = m25626c.optString("Fid", null);
        int optInt = m25626c.optInt("Status", EnumC26097a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m25626c.optString("AuthToken", null);
        String optString3 = m25626c.optString("RefreshToken", null);
        long optLong = m25626c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m25626c.optLong("ExpiresInSecs", 0L);
        return AbstractC45679nR3.m23780a().mo23757d(optString).mo23754g(EnumC26097a.values()[optInt]).mo23759b(optString2).mo23755f(optString3).mo23753h(optLong).mo23758c(optLong2).mo23756e(m25626c.optString("FisError", null)).mo23760a();
    }
}
