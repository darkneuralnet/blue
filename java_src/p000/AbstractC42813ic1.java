package p000;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.Objects;
/* renamed from: ic1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42813ic1 implements InterfaceC42220hc1 {

    /* renamed from: a */
    public final MediaCodecInfo f87525a;

    /* renamed from: b */
    public final MediaCodecInfo.CodecCapabilities f87526b;

    public AbstractC42813ic1(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        this.f87525a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f87526b = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException("Unable to get CodecCapabilities for mime: " + str, e);
        }
    }

    /* renamed from: i */
    public static MediaCodecInfo m33755i(InterfaceC49918ub1 interfaceC49918ub1) throws InvalidConfigException {
        MediaCodec m4971a = new C51696xb1().m4971a(interfaceC49918ub1.mo2554c());
        MediaCodecInfo codecInfo = m4971a.getCodecInfo();
        m4971a.release();
        return codecInfo;
    }
}
