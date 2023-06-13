package p000;

import android.media.MediaFormat;
import android.os.Build;
/* renamed from: pP2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46846pP2 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m19347d() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m19346e() {
        if ("lge".equalsIgnoreCase(Build.BRAND) && "lg-k430".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m19345f() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m19344g() {
        if ("Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m19343h() {
        if ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m19342i() {
        if ("Xiaomi".equalsIgnoreCase(Build.BRAND) && "redmi note 4".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m19339l() {
        if ("LGE".equalsIgnoreCase(Build.BRAND) && "LG-X230".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m19338m() {
        if ("infinix".equalsIgnoreCase(Build.BRAND) && "infinix x650".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m19337n() {
        if (!m19344g() && !m19345f() && !m19338m() && !m19339l() && !m19347d() && !m19343h() && !m19342i() && !m19346e()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean m19341j(MediaFormat mediaFormat) {
        if (!m19344g() && !m19345f() && !m19338m() && !m19339l() && !m19343h()) {
            if (m19347d() && m19340k(mediaFormat)) {
                int integer = mediaFormat.getInteger("width");
                int integer2 = mediaFormat.getInteger("height");
                if (integer == 3840 && integer2 == 2160) {
                    return true;
                }
                return false;
            } else if ((!m19342i() && !m19346e()) || !"video/avc".equals(mediaFormat.getString("mime"))) {
                return false;
            } else {
                int integer3 = mediaFormat.getInteger("width");
                int integer4 = mediaFormat.getInteger("height");
                if (integer3 == 1920 && integer4 == 1080) {
                    return true;
                }
                return false;
            }
        }
        return "video/mp4v-es".equals(mediaFormat.getString("mime"));
    }

    /* renamed from: k */
    public final boolean m19340k(MediaFormat mediaFormat) {
        return mediaFormat.getString("mime").contains("video/");
    }
}
