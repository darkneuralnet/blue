package p000;

import android.media.EncoderProfiles;
import java.util.ArrayList;
import java.util.List;
import p000.InterfaceC44592lc1;
/* renamed from: Gc1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33036Gc1 {
    private C33036Gc1() {
    }

    /* renamed from: a */
    public static InterfaceC44592lc1 m104972a(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds;
        int recommendedFileFormat;
        List audioProfiles;
        List videoProfiles;
        defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        audioProfiles = encoderProfiles.getAudioProfiles();
        List<InterfaceC44592lc1.AbstractC25737a> m104971b = m104971b(audioProfiles);
        videoProfiles = encoderProfiles.getVideoProfiles();
        return InterfaceC44592lc1.AbstractC25738b.m27094e(defaultDurationSeconds, recommendedFileFormat, m104971b, m104970c(videoProfiles));
    }

    /* renamed from: b */
    public static List<InterfaceC44592lc1.AbstractC25737a> m104971b(List<EncoderProfiles.AudioProfile> list) {
        int codec;
        String mediaType;
        int bitrate;
        int sampleRate;
        int channels;
        int profile;
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : list) {
            EncoderProfiles.AudioProfile m17326a = C47557qc1.m17326a(audioProfile);
            codec = m17326a.getCodec();
            mediaType = m17326a.getMediaType();
            bitrate = m17326a.getBitrate();
            sampleRate = m17326a.getSampleRate();
            channels = m17326a.getChannels();
            profile = m17326a.getProfile();
            arrayList.add(InterfaceC44592lc1.AbstractC25737a.m27095a(codec, mediaType, bitrate, sampleRate, channels, profile));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<InterfaceC44592lc1.AbstractC25739c> m104970c(List<EncoderProfiles.VideoProfile> list) {
        int codec;
        String mediaType;
        int bitrate;
        int frameRate;
        int width;
        int height;
        int profile;
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : list) {
            EncoderProfiles.VideoProfile m115443a = C31632Ac1.m115443a(videoProfile);
            codec = m115443a.getCodec();
            mediaType = m115443a.getMediaType();
            bitrate = m115443a.getBitrate();
            frameRate = m115443a.getFrameRate();
            width = m115443a.getWidth();
            height = m115443a.getHeight();
            profile = m115443a.getProfile();
            arrayList.add(InterfaceC44592lc1.AbstractC25739c.m27093a(codec, mediaType, bitrate, frameRate, width, height, profile, 8, 0, 0));
        }
        return arrayList;
    }
}