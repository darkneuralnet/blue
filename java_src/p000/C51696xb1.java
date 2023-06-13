package p000;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.text.TextUtils;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
/* renamed from: xb1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51696xb1 {

    /* renamed from: a */
    public final boolean f117839a;

    public C51696xb1() {
        boolean z;
        if (((C47439qP2) Q21.m89097a(C47439qP2.class)) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f117839a = z;
    }

    /* renamed from: a */
    public MediaCodec m4971a(MediaFormat mediaFormat) throws InvalidConfigException {
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        String m4970b = m4970b(mediaFormat, mediaCodecList);
        try {
            if (TextUtils.isEmpty(m4970b)) {
                String string = mediaFormat.getString("mime");
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(string);
                C33928Jx2.m99522l("EncoderFinder", String.format("No encoder found that supports requested MediaFormat %s. Create encoder by MIME type. Dump codec info:\n%s", mediaFormat, C42154hV0.m36353b(string, createEncoderByType, mediaFormat)));
                return createEncoderByType;
            }
            return MediaCodec.createByCodecName(m4970b);
        } catch (IOException | IllegalArgumentException | NullPointerException e) {
            boolean m4968d = m4968d(mediaFormat);
            String m36350e = C42154hV0.m36350e(mediaCodecList, mediaFormat);
            throw new InvalidConfigException("Encoder cannot created: " + m4970b + ", isMediaFormatInQuirk: " + m4968d + "\n" + m36350e, e);
        }
    }

    /* renamed from: b */
    public String m4970b(MediaFormat mediaFormat, MediaCodecList mediaCodecList) {
        Integer num = null;
        try {
            if (this.f117839a && mediaFormat.containsKey("frame-rate")) {
                Integer valueOf = Integer.valueOf(mediaFormat.getInteger("frame-rate"));
                try {
                    mediaFormat.setString("frame-rate", null);
                    num = valueOf;
                } catch (Throwable th) {
                    th = th;
                    num = valueOf;
                    if (num != null) {
                        mediaFormat.setInteger("frame-rate", num.intValue());
                    }
                    throw th;
                }
            }
            String findEncoderForFormat = mediaCodecList.findEncoderForFormat(mediaFormat);
            if (findEncoderForFormat == null) {
                findEncoderForFormat = m4969c(mediaFormat, mediaCodecList.getCodecInfos());
            }
            if (num != null) {
                mediaFormat.setInteger("frame-rate", num.intValue());
            }
            return findEncoderForFormat;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: c */
    public final String m4969c(MediaFormat mediaFormat, MediaCodecInfo[] mediaCodecInfoArr) {
        Integer num;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean z;
        int i;
        boolean z2;
        String string = mediaFormat.getString("mime");
        Integer num2 = null;
        if (string == null) {
            C33928Jx2.m99522l("EncoderFinder", "MediaFormat does not contain mime info.");
            return null;
        }
        int length = mediaCodecInfoArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i2];
            if (mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    HZ3.m103736b(z, "MIME type is not supported");
                    if (mediaFormat.containsKey("bitrate")) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        if (videoCapabilities != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        HZ3.m103736b(z2, "Not video codec");
                        num = Integer.valueOf(mediaFormat.getInteger("bitrate"));
                        try {
                            i = videoCapabilities.getBitrateRange().clamp(num).intValue();
                            mediaFormat.setInteger("bitrate", i);
                        } catch (IllegalArgumentException unused) {
                            if (num == null) {
                            }
                            mediaFormat.setInteger("bitrate", num.intValue());
                        } catch (Throwable th) {
                            th = th;
                            num2 = num;
                            if (num2 != null) {
                                mediaFormat.setInteger("bitrate", num2.intValue());
                            }
                            throw th;
                        }
                    } else {
                        i = -1;
                        num = null;
                    }
                } catch (IllegalArgumentException unused2) {
                    num = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (capabilitiesForType.isFormatSupported(mediaFormat)) {
                    C33928Jx2.m99522l("EncoderFinder", String.format("No encoder found that supports requested bitrate. Adjusting bitrate to nearest supported bitrate [requested: %dbps, nearest: %dbps]", num, Integer.valueOf(i)));
                    String name = mediaCodecInfo.getName();
                    if (num != null) {
                        mediaFormat.setInteger("bitrate", num.intValue());
                    }
                    return name;
                }
                if (num == null) {
                }
                mediaFormat.setInteger("bitrate", num.intValue());
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m4968d(MediaFormat mediaFormat) {
        C46846pP2 c46846pP2 = (C46846pP2) Q21.m89097a(C46846pP2.class);
        if (c46846pP2 == null) {
            return false;
        }
        return c46846pP2.m19341j(mediaFormat);
    }
}
