package p000;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/* renamed from: hV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42154hV0 {
    private C42154hV0() {
    }

    /* renamed from: a */
    public static void m36354a(StringBuilder sb, MediaCodecInfo.AudioCapabilities audioCapabilities, MediaFormat mediaFormat) {
        m36347h(sb, "[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
        m36347h(sb, "[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
        if (Build.VERSION.SDK_INT >= 31) {
            m36347h(sb, "[AudioCaps] getMinInputChannelCount = " + C26571nh.m23320b(audioCapabilities));
            m36347h(sb, "[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(C26571nh.m23321a(audioCapabilities)));
        }
        m36347h(sb, "[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
        m36347h(sb, "[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
        try {
            int integer = mediaFormat.getInteger("sample-rate");
            m36347h(sb, "[AudioCaps] isSampleRateSupported for " + integer + " = " + audioCapabilities.isSampleRateSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            m36347h(sb, "[AudioCaps] mediaFormat does not contain sample rate");
        }
    }

    /* renamed from: b */
    public static String m36353b(String str, MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            if (capabilitiesForType != null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103737a(z);
            m36352c(sb, capabilitiesForType, mediaFormat);
        } catch (IllegalArgumentException unused) {
            m36347h(sb, "[" + mediaCodec.getName() + "] does not support mime " + str);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static void m36352c(StringBuilder sb, MediaCodecInfo.CodecCapabilities codecCapabilities, MediaFormat mediaFormat) {
        try {
            m36347h(sb, "[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
        } catch (ClassCastException unused) {
            m36347h(sb, "[CodecCaps] isFormatSupported=false");
        }
        m36347h(sb, "[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb2 = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                arrayList.add(m36343l(codecProfileLevel));
            }
            sb2.append(TextUtils.join(", ", arrayList));
            sb2.append("]");
            m36347h(sb, "[CodecCaps] profileLevels = " + ((Object) sb2));
        }
        if (codecCapabilities.colorFormats != null) {
            m36347h(sb, "[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            m36349f(sb, videoCapabilities, mediaFormat);
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            m36354a(sb, audioCapabilities, mediaFormat);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            m36351d(sb, encoderCapabilities, mediaFormat);
        }
    }

    /* renamed from: d */
    public static void m36351d(StringBuilder sb, MediaCodecInfo.EncoderCapabilities encoderCapabilities, MediaFormat mediaFormat) {
        m36347h(sb, "[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
        if (Build.VERSION.SDK_INT >= 28) {
            m36347h(sb, "[EncoderCaps] getQualityRange = " + C13614ch.m61066a(encoderCapabilities));
        }
        try {
            int integer = mediaFormat.getInteger("bitrate-mode");
            m36347h(sb, "[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            m36347h(sb, "[EncoderCaps] mediaFormat does not contain bitrate mode");
        }
    }

    /* renamed from: e */
    public static String m36350e(MediaCodecList mediaCodecList, MediaFormat mediaFormat) {
        MediaCodecInfo[] codecInfos;
        boolean z;
        StringBuilder sb = new StringBuilder();
        m36347h(sb, "[Start] Dump MediaCodecList for mediaFormat " + mediaFormat);
        String string = mediaFormat.getString("mime");
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                boolean z2 = true;
                if (string != null) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    HZ3.m103737a(z);
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType == null) {
                        z2 = false;
                    }
                    HZ3.m103737a(z2);
                    m36347h(sb, "[Start] [" + mediaCodecInfo.getName() + "]");
                    m36352c(sb, capabilitiesForType, mediaFormat);
                    m36347h(sb, "[End] [" + mediaCodecInfo.getName() + "]");
                } catch (IllegalArgumentException unused) {
                    m36347h(sb, "[" + mediaCodecInfo.getName() + "] does not support mime " + string);
                }
            }
        }
        m36347h(sb, "[End] Dump MediaCodecList");
        String sb2 = sb.toString();
        m36344k(sb2);
        return sb2;
    }

    /* renamed from: f */
    public static void m36349f(StringBuilder sb, MediaCodecInfo.VideoCapabilities videoCapabilities, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        m36347h(sb, "[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
        m36347h(sb, "[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
        m36347h(sb, "[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
        int i3 = 0;
        boolean z3 = true;
        try {
            i = mediaFormat.getInteger("width");
            i2 = mediaFormat.getInteger("height");
            if (i > 0 && i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            HZ3.m103737a(z2);
            z = true;
        } catch (IllegalArgumentException | NullPointerException unused) {
            m36347h(sb, "[VideoCaps] mediaFormat does not contain valid width and height");
            i = 0;
            i2 = 0;
            z = false;
        }
        if (z) {
            try {
                m36347h(sb, "[VideoCaps] getSupportedHeightsFor " + i + " = " + videoCapabilities.getSupportedHeightsFor(i));
            } catch (IllegalArgumentException unused2) {
                m36347h(sb, "[VideoCaps] could not getSupportedHeightsFor " + i);
            }
            try {
                m36347h(sb, "[VideoCaps] getSupportedWidthsFor " + i2 + " = " + videoCapabilities.getSupportedWidthsFor(i2));
            } catch (IllegalArgumentException unused3) {
                m36347h(sb, "[VideoCaps] could not getSupportedWidthsFor " + i2);
            }
            m36347h(sb, "[VideoCaps] isSizeSupported for " + i + "x" + i2 + " = " + videoCapabilities.isSizeSupported(i, i2));
        }
        m36347h(sb, "[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
        try {
            int integer = mediaFormat.getInteger("frame-rate");
            if (integer <= 0) {
                z3 = false;
            }
            HZ3.m103737a(z3);
            i3 = integer;
        } catch (IllegalArgumentException | NullPointerException unused4) {
            m36347h(sb, "[VideoCaps] mediaFormat does not contain frame rate");
        }
        if (z) {
            m36347h(sb, "[VideoCaps] getSupportedFrameRatesFor " + i + "x" + i2 + " = " + videoCapabilities.getSupportedFrameRatesFor(i, i2));
        }
        if (z && i3 > 0) {
            m36347h(sb, "[VideoCaps] areSizeAndRateSupported for " + i + "x" + i2 + ", " + i3 + " = " + videoCapabilities.areSizeAndRateSupported(i, i2, i3));
        }
    }

    /* renamed from: g */
    public static String m36348g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    /* renamed from: h */
    public static void m36347h(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("\n");
    }

    /* renamed from: i */
    public static String m36346i(long j) {
        return m36348g(j);
    }

    /* renamed from: j */
    public static String m36345j(long j) {
        return m36346i(TimeUnit.MICROSECONDS.toMillis(j));
    }

    /* renamed from: k */
    public static void m36344k(String str) {
        if (C33928Jx2.m99527g("DebugUtils")) {
            Scanner scanner = new Scanner(str);
            while (scanner.hasNextLine()) {
                C33928Jx2.m99529e("DebugUtils", scanner.nextLine());
            }
        }
    }

    /* renamed from: l */
    public static String m36343l(MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        if (codecProfileLevel == null) {
            return "null";
        }
        return String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile));
    }
}
