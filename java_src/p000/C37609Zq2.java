package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.p034ar.core.ImageMetadata;
@Deprecated
/* renamed from: Zq2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37609Zq2 extends AbstractServiceConnectionC39184cW3 {

    /* renamed from: k */
    public String f49381k;

    public C37609Zq2(Context context, String str, String str2) {
        super(context, ImageMetadata.CONTROL_AE_PRECAPTURE_TRIGGER, ImageMetadata.CONTROL_AF_MODE, 20141001, str);
        this.f49381k = str2;
    }

    @Override // p000.AbstractServiceConnectionC39184cW3
    /* renamed from: d */
    public void mo26165d(Bundle bundle) {
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", this.f49381k);
    }
}
