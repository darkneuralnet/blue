package co.bird.android.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LocalAsset$mimeType$2 extends Lambda implements Function0<String> {
    final /* synthetic */ LocalAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAsset$mimeType$2(LocalAsset localAsset) {
        super(0);
        this.this$0 = localAsset;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        FileInputStream fileInputStream = new FileInputStream(this.this$0.getFile());
        try {
            String guessContentTypeFromStream = URLConnection.guessContentTypeFromStream(fileInputStream);
            fileInputStream.close();
            return guessContentTypeFromStream;
        } catch (IOException unused) {
            fileInputStream.close();
            return null;
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }
}
