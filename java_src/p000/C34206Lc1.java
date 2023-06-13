package p000;

import android.media.CamcorderProfile;
import java.util.ArrayList;
import java.util.List;
import p000.InterfaceC44592lc1;
/* renamed from: Lc1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34206Lc1 {
    private C34206Lc1() {
    }

    /* renamed from: a */
    public static InterfaceC44592lc1 m96597a(CamcorderProfile camcorderProfile) {
        return InterfaceC44592lc1.AbstractC25738b.m27094e(camcorderProfile.duration, camcorderProfile.fileFormat, m96593e(camcorderProfile), m96592f(camcorderProfile));
    }

    /* renamed from: b */
    public static String m96596b(int i) {
        switch (i) {
            case 1:
                return "audio/3gpp";
            case 2:
                return "audio/amr-wb";
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return "audio/vorbis";
            case 7:
                return "audio/opus";
            default:
                return "audio/none";
        }
    }

    /* renamed from: c */
    public static int m96595c(int i) {
        if (i != 3) {
            if (i != 4) {
                return i != 5 ? -1 : 39;
            }
            return 5;
        }
        return 2;
    }

    /* renamed from: d */
    public static String m96594d(int i) {
        switch (i) {
            case 1:
                return "video/3gpp";
            case 2:
                return "video/avc";
            case 3:
                return "video/mp4v-es";
            case 4:
                return "video/x-vnd.on2.vp8";
            case 5:
                return "video/hevc";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/dolby-vision";
            case 8:
                return "video/av01";
            default:
                return "video/none";
        }
    }

    /* renamed from: e */
    public static List<InterfaceC44592lc1.AbstractC25737a> m96593e(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i = camcorderProfile.audioCodec;
        arrayList.add(InterfaceC44592lc1.AbstractC25737a.m27095a(i, m96596b(i), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, m96595c(camcorderProfile.audioCodec)));
        return arrayList;
    }

    /* renamed from: f */
    public static List<InterfaceC44592lc1.AbstractC25739c> m96592f(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i = camcorderProfile.videoCodec;
        arrayList.add(InterfaceC44592lc1.AbstractC25739c.m27093a(i, m96594d(i), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
