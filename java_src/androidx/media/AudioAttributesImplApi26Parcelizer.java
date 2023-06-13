package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f55005a = (AudioAttributes) versionedParcel.m65757r(audioAttributesImplApi26.f55005a, 1);
        audioAttributesImplApi26.f55006b = versionedParcel.m65759p(audioAttributesImplApi26.f55006b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.m65751x(false, false);
        versionedParcel.m65781H(audioAttributesImplApi26.f55005a, 1);
        versionedParcel.m65783F(audioAttributesImplApi26.f55006b, 2);
    }
}
