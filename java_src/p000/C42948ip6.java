package p000;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.Objects;
/* renamed from: ip6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42948ip6 extends AbstractC42813ic1 implements InterfaceC42355hp6 {

    /* renamed from: c */
    public final MediaCodecInfo.VideoCapabilities f91369c;

    public C42948ip6(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f87526b.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f91369c = videoCapabilities;
    }

    /* renamed from: j */
    public static C42948ip6 m31765j(AbstractC39983dp6 abstractC39983dp6) throws InvalidConfigException {
        return new C42948ip6(AbstractC42813ic1.m33755i(abstractC39983dp6), abstractC39983dp6.mo2555a());
    }

    /* renamed from: k */
    public static IllegalArgumentException m31764k(Throwable th) {
        if (th instanceof IllegalArgumentException) {
            return (IllegalArgumentException) th;
        }
        return new IllegalArgumentException(th);
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: a */
    public Range<Integer> mo29874a(int i) {
        try {
            return this.f91369c.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            throw m31764k(th);
        }
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: b */
    public Range<Integer> mo29873b() {
        return this.f91369c.getBitrateRange();
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: c */
    public Range<Integer> mo29872c(int i) {
        try {
            return this.f91369c.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            throw m31764k(th);
        }
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: d */
    public Range<Integer> mo29871d() {
        return this.f91369c.getSupportedWidths();
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: e */
    public Range<Integer> mo29870e() {
        return this.f91369c.getSupportedHeights();
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: f */
    public int mo29869f() {
        return this.f91369c.getHeightAlignment();
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: g */
    public boolean mo29868g(int i, int i2) {
        return this.f91369c.isSizeSupported(i, i2);
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: h */
    public int mo29867h() {
        return this.f91369c.getWidthAlignment();
    }
}
