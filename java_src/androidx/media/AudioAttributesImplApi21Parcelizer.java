package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f55005a = (AudioAttributes) versionedParcel.m65757r(audioAttributesImplApi21.f55005a, 1);
        audioAttributesImplApi21.f55006b = versionedParcel.m65759p(audioAttributesImplApi21.f55006b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.m65751x(false, false);
        versionedParcel.m65781H(audioAttributesImplApi21.f55005a, 1);
        versionedParcel.m65783F(audioAttributesImplApi21.f55006b, 2);
    }
}
