package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f55008a;

    /* renamed from: b */
    public int f55009b;

    /* renamed from: c */
    public int f55010c;

    /* renamed from: d */
    public int f55011d;

    /* renamed from: androidx.media.AudioAttributesImplBase$a */
    /* loaded from: classes.dex */
    public static class C11773a implements AudioAttributesImpl.InterfaceC11770a {

        /* renamed from: a */
        public int f55012a = 0;

        /* renamed from: b */
        public int f55013b = 0;

        /* renamed from: c */
        public int f55014c = 0;

        /* renamed from: d */
        public int f55015d = -1;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: b */
        public final C11773a m66899b(int i) {
            switch (i) {
                case 0:
                    this.f55013b = 1;
                    break;
                case 1:
                    this.f55013b = 4;
                    break;
                case 2:
                    this.f55013b = 4;
                    break;
                case 3:
                    this.f55013b = 2;
                    break;
                case 4:
                    this.f55013b = 4;
                    break;
                case 5:
                    this.f55013b = 4;
                    break;
                case 6:
                    this.f55013b = 1;
                    this.f55014c |= 4;
                    break;
                case 7:
                    this.f55014c = 1 | this.f55014c;
                    this.f55013b = 4;
                    break;
                case 8:
                    this.f55013b = 4;
                    break;
                case 9:
                    this.f55013b = 4;
                    break;
                case 10:
                    this.f55013b = 1;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i + " for AudioAttributesCompat");
                    break;
            }
            this.f55012a = AudioAttributesImplBase.m66901e(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC11770a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f55013b, this.f55014c, this.f55012a, this.f55015d);
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC11770a
        /* renamed from: c */
        public C11773a mo66900a(int i) {
            if (i != 10) {
                this.f55015d = i;
                return m66899b(i);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
    }

    public AudioAttributesImplBase() {
        this.f55008a = 0;
        this.f55009b = 0;
        this.f55010c = 0;
        this.f55011d = -1;
    }

    /* renamed from: e */
    public static int m66901e(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    /* renamed from: a */
    public int m66905a() {
        return this.f55009b;
    }

    /* renamed from: b */
    public int m66904b() {
        int i = this.f55010c;
        int m66903c = m66903c();
        if (m66903c == 6) {
            i |= 4;
        } else if (m66903c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int m66903c() {
        int i = this.f55011d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m66911a(false, this.f55010c, this.f55008a);
    }

    /* renamed from: d */
    public int m66902d() {
        return this.f55008a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f55009b != audioAttributesImplBase.m66905a() || this.f55010c != audioAttributesImplBase.m66904b() || this.f55008a != audioAttributesImplBase.m66902d() || this.f55011d != audioAttributesImplBase.f55011d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f55009b), Integer.valueOf(this.f55010c), Integer.valueOf(this.f55008a), Integer.valueOf(this.f55011d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f55011d != -1) {
            sb.append(" stream=");
            sb.append(this.f55011d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m66910b(this.f55008a));
        sb.append(" content=");
        sb.append(this.f55009b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f55010c).toUpperCase());
        return sb.toString();
    }

    public AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f55009b = i;
        this.f55010c = i2;
        this.f55008a = i3;
        this.f55011d = i4;
    }
}
