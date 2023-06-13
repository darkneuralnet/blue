package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
/* renamed from: Po */
/* loaded from: classes5.dex */
public final class C6492Po extends AbstractC46562ov2<AssetFileDescriptor> {
    public C6492Po(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p000.IS0
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo6834a() {
        return AssetFileDescriptor.class;
    }

    @Override // p000.AbstractC46562ov2
    /* renamed from: f */
    public void mo6833c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // p000.AbstractC46562ov2
    /* renamed from: g */
    public AssetFileDescriptor mo6832d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
