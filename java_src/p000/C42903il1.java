package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
/* renamed from: il1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C42903il1 extends AbstractC46562ov2<ParcelFileDescriptor> {
    public C42903il1(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p000.IS0
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo6834a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p000.AbstractC46562ov2
    /* renamed from: f */
    public void mo6833c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // p000.AbstractC46562ov2
    /* renamed from: g */
    public ParcelFileDescriptor mo6832d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
