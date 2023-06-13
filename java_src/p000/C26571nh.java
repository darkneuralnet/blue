package p000;

import android.content.Context;
import android.media.AudioRecord;
import android.media.MediaCodecInfo;
import android.util.Range;
/* renamed from: nh */
/* loaded from: classes.dex */
public final class C26571nh {
    private C26571nh() {
    }

    /* renamed from: a */
    public static Range<Integer>[] m23321a(MediaCodecInfo.AudioCapabilities audioCapabilities) {
        Range<Integer>[] inputChannelCountRanges;
        inputChannelCountRanges = audioCapabilities.getInputChannelCountRanges();
        return inputChannelCountRanges;
    }

    /* renamed from: b */
    public static int m23320b(MediaCodecInfo.AudioCapabilities audioCapabilities) {
        int minInputChannelCount;
        minInputChannelCount = audioCapabilities.getMinInputChannelCount();
        return minInputChannelCount;
    }

    /* renamed from: c */
    public static void m23319c(AudioRecord.Builder builder, Context context) {
        builder.setContext(context);
    }
}
