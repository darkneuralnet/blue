package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f55003a = (AudioAttributesImpl) versionedParcel.m65753v(audioAttributesCompat.f55003a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.m65751x(false, false);
        versionedParcel.m65776M(audioAttributesCompat.f55003a, 1);
    }
}
