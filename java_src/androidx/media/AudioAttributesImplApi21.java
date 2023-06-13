package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f55005a;

    /* renamed from: b */
    public int f55006b;

    /* renamed from: androidx.media.AudioAttributesImplApi21$a */
    /* loaded from: classes.dex */
    public static class C11771a implements AudioAttributesImpl.InterfaceC11770a {

        /* renamed from: a */
        public final AudioAttributes.Builder f55007a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.InterfaceC11770a
        /* renamed from: b */
        public C11771a mo66900a(int i) {
            this.f55007a.setLegacyStreamType(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC11770a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f55007a.build());
        }
    }

    public AudioAttributesImplApi21() {
        this.f55006b = -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f55005a.equals(((AudioAttributesImplApi21) obj).f55005a);
    }

    public int hashCode() {
        return this.f55005a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f55005a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f55005a = audioAttributes;
        this.f55006b = i;
    }
}
