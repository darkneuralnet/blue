package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
/* renamed from: Xy5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37216Xy5 implements InterfaceC46462ol2 {

    /* renamed from: a */
    public final SharedPreferences f44342a;

    /* renamed from: b */
    public final String f44343b;

    public C37216Xy5(Context context, String str, String str2) throws IOException {
        if (str != null) {
            this.f44343b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f44342a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                return;
            } else {
                this.f44342a = applicationContext.getSharedPreferences(str2, 0);
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    @Override // p000.InterfaceC46462ol2
    /* renamed from: a */
    public C35844Sc1 mo20538a() throws IOException {
        return C35844Sc1.m85194K(m75956b(), C18219m.m47528b());
    }

    /* renamed from: b */
    public final byte[] m75956b() throws IOException {
        try {
            String string = this.f44342a.getString(this.f44343b, null);
            if (string != null) {
                return ML1.m95435a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.f44343b));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.f44343b));
        }
    }

    @Override // p000.InterfaceC46462ol2
    public C44090kl2 read() throws IOException {
        return C44090kl2.m28514P(m75956b(), C18219m.m47528b());
    }
}
