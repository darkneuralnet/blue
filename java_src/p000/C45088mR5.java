package p000;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: mR5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45088mR5 extends AbstractC8447Uo<InputStream> {
    public C45088mR5(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p000.IS0
    /* renamed from: a */
    public Class<InputStream> mo6834a() {
        return InputStream.class;
    }

    @Override // p000.AbstractC8447Uo
    /* renamed from: f */
    public void mo25621c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p000.AbstractC8447Uo
    /* renamed from: g */
    public InputStream mo25620d(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
