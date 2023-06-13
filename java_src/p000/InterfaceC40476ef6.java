package p000;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.Folder;
import co.bird.android.model.constant.ContentKind;
import co.bird.android.model.constant.UploadKind;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JN\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH&J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&JN\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH&J:\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J.\u0010\u001e\u001a\u00020\u001d2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH&¨\u0006\u001f"}, m28432d2 = {"Lef6;", "", "Ljava/io/File;", "file", "Lco/bird/android/model/constant/ContentKind;", "contentKind", "Lco/bird/android/model/constant/UploadKind;", "uploadKind", "Lco/bird/android/model/Folder;", "s3Folder", "", "filename", "", "useSignedUrlUpload", "needAssetId", "Lio/reactivex/F;", "e", "Lco/bird/android/model/FileUploadReceipt;", "h", "", "bytes", "c", "g", "f", "", "headers", "signedUrl", "Landroid/net/Uri;", "uri", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ef6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC40476ef6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ef6$a */
    /* loaded from: classes2.dex */
    public static final class C20086a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC23461c putAssetUpload$default(InterfaceC40476ef6 interfaceC40476ef6, Map map, String str, Uri uri, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    map = MapsKt__MapsKt.emptyMap();
                }
                return interfaceC40476ef6.mo28678d(map, str, uri);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putAssetUpload");
        }

        public static /* synthetic */ AbstractC23442F uploadBytesForReceipt$default(InterfaceC40476ef6 interfaceC40476ef6, byte[] bArr, ContentKind contentKind, UploadKind uploadKind, Folder folder, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    str = null;
                }
                return interfaceC40476ef6.mo28675g(bArr, contentKind, uploadKind, folder, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadBytesForReceipt");
        }

        public static /* synthetic */ AbstractC23442F uploadContent$default(InterfaceC40476ef6 interfaceC40476ef6, File file, ContentKind contentKind, UploadKind uploadKind, Folder folder, String str, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                return interfaceC40476ef6.mo28677e(file, contentKind, uploadKind, folder, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadContent");
        }

        public static /* synthetic */ AbstractC23442F uploadContent$default(InterfaceC40476ef6 interfaceC40476ef6, byte[] bArr, ContentKind contentKind, UploadKind uploadKind, Folder folder, String str, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                return interfaceC40476ef6.mo28679c(bArr, contentKind, uploadKind, folder, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadContent");
        }

        public static /* synthetic */ AbstractC23442F uploadContent$default(InterfaceC40476ef6 interfaceC40476ef6, byte[] bArr, Folder folder, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str = null;
                }
                return interfaceC40476ef6.mo28676f(bArr, folder, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadContent");
        }
    }

    /* renamed from: c */
    AbstractC23442F<String> mo28679c(byte[] bArr, ContentKind contentKind, UploadKind uploadKind, Folder folder, String str, boolean z, boolean z2);

    /* renamed from: d */
    AbstractC23461c mo28678d(Map<String, String> map, String str, Uri uri);

    /* renamed from: e */
    AbstractC23442F<String> mo28677e(File file, ContentKind contentKind, UploadKind uploadKind, Folder folder, String str, boolean z, boolean z2);

    /* renamed from: f */
    AbstractC23442F<String> mo28676f(byte[] bArr, Folder folder, String str);

    /* renamed from: g */
    AbstractC23442F<FileUploadReceipt> mo28675g(byte[] bArr, ContentKind contentKind, UploadKind uploadKind, Folder folder, String str);

    /* renamed from: h */
    AbstractC23442F<FileUploadReceipt> mo28674h(File file, ContentKind contentKind, UploadKind uploadKind, Folder folder);
}
