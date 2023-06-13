package p000;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
/* renamed from: hL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42070hL6 {

    /* renamed from: a */
    public final InterfaceC46230oM6<InterfaceC40920fP6> f85028a;

    public C42070hL6(InterfaceC46230oM6<InterfaceC40920fP6> interfaceC46230oM6) {
        this.f85028a = interfaceC46230oM6;
    }

    /* renamed from: a */
    public final InputStream m36529a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) CZ5.m112113b(this.f85028a.m21257a().mo10446e(i, str, str2, i2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new C49185tL6(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), i);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e) {
            throw new C49185tL6("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (ExecutionException e2) {
            throw new C49185tL6(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e2, i);
        }
    }
}
