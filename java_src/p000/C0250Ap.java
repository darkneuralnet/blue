package p000;

import android.media.MediaCodecInfo;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.Objects;
/* renamed from: Ap */
/* loaded from: classes.dex */
public class C0250Ap extends AbstractC42813ic1 {

    /* renamed from: c */
    public final MediaCodecInfo.AudioCapabilities f1167c;

    public C0250Ap(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f87526b.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.f1167c = audioCapabilities;
    }
}
