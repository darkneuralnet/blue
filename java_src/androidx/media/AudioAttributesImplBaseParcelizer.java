package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f55008a = versionedParcel.m65759p(audioAttributesImplBase.f55008a, 1);
        audioAttributesImplBase.f55009b = versionedParcel.m65759p(audioAttributesImplBase.f55009b, 2);
        audioAttributesImplBase.f55010c = versionedParcel.m65759p(audioAttributesImplBase.f55010c, 3);
        audioAttributesImplBase.f55011d = versionedParcel.m65759p(audioAttributesImplBase.f55011d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.m65751x(false, false);
        versionedParcel.m65783F(audioAttributesImplBase.f55008a, 1);
        versionedParcel.m65783F(audioAttributesImplBase.f55009b, 2);
        versionedParcel.m65783F(audioAttributesImplBase.f55010c, 3);
        versionedParcel.m65783F(audioAttributesImplBase.f55011d, 4);
    }
}
