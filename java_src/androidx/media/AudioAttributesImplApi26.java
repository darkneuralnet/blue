package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;
/* loaded from: classes.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* renamed from: androidx.media.AudioAttributesImplApi26$a */
    /* loaded from: classes.dex */
    public static class C11772a extends AudioAttributesImplApi21.C11771a {
        @Override // androidx.media.AudioAttributesImplApi21.C11771a, androidx.media.AudioAttributesImpl.InterfaceC11770a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f55007a.build());
        }
    }

    public AudioAttributesImplApi26() {
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
