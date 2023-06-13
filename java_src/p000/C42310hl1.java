package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
/* renamed from: hl1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C42310hl1 extends AbstractC8447Uo<AssetFileDescriptor> {
    public C42310hl1(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p000.IS0
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo6834a() {
        return AssetFileDescriptor.class;
    }

    @Override // p000.AbstractC8447Uo
    /* renamed from: f */
    public void mo25621c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // p000.AbstractC8447Uo
    /* renamed from: g */
    public AssetFileDescriptor mo25620d(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
