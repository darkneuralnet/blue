package p000;

import android.media.MediaCodecInfo;
import android.util.Range;
/* renamed from: ch */
/* loaded from: classes.dex */
public final class C13614ch {
    private C13614ch() {
    }

    /* renamed from: a */
    public static Range<Integer> m61066a(MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        Range<Integer> qualityRange;
        qualityRange = encoderCapabilities.getQualityRange();
        return qualityRange;
    }
}
