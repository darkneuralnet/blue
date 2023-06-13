package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes5.dex */
public abstract class zzbn extends VC7 {

    /* renamed from: b */
    public static final Logger f70497b = Logger.getLogger(zzbn.class.getName());

    /* renamed from: c */
    public static final boolean f70498c = C35410Qf8.m88222x();

    /* renamed from: a */
    public C42673iM7 f70499a;

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$a */
    /* loaded from: classes5.dex */
    public static class C17523a extends zzbn {

        /* renamed from: d */
        public final byte[] f70500d;

        /* renamed from: e */
        public final int f70501e;

        /* renamed from: f */
        public final int f70502f;

        /* renamed from: g */
        public int f70503g;

        public C17523a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.f70500d = bArr;
            this.f70501e = i;
            this.f70503g = i;
            this.f70502f = i3;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: A0 */
        public final void mo51385A0(int i) throws IOException {
            try {
                byte[] bArr = this.f70500d;
                int i2 = this.f70503g;
                int i3 = i2 + 1;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (i >> 16);
                this.f70503g = i5 + 1;
                bArr[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f70503g), Integer.valueOf(this.f70502f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: G */
        public final void mo51384G(int i, int i2) throws IOException {
            mo51358y0((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: I */
        public final void mo51383I(int i, TD7 td7) throws IOException {
            mo51384G(1, 3);
            mo51373b0(2, i);
            mo51365n(3, td7);
            mo51384G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: J */
        public final void mo51382J(int i, H28 h28) throws IOException {
            mo51384G(1, 3);
            mo51373b0(2, i);
            mo51364o(3, h28);
            mo51384G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: K */
        public final void mo51381K(int i, boolean z) throws IOException {
            mo51384G(i, 0);
            mo51370g(z ? (byte) 1 : (byte) 0);
        }

        /* renamed from: K0 */
        public final int m51387K0() {
            return this.f70503g - this.f70501e;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: L */
        public final void mo51379L(long j) throws IOException {
            if (zzbn.f70498c && mo51360u() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f70500d;
                    int i = this.f70503g;
                    this.f70503g = i + 1;
                    C35410Qf8.m88235k(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f70500d;
                int i2 = this.f70503g;
                this.f70503g = i2 + 1;
                C35410Qf8.m88235k(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f70500d;
                    int i3 = this.f70503g;
                    this.f70503g = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f70503g), Integer.valueOf(this.f70502f), 1), e);
                }
            }
            byte[] bArr4 = this.f70500d;
            int i4 = this.f70503g;
            this.f70503g = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: M */
        public final void mo51378M(H28 h28) throws IOException {
            mo51358y0(h28.mo51553o());
            h28.mo51554n(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: T */
        public final void mo51377T(int i, int i2) throws IOException {
            mo51384G(i, 0);
            mo51359x0(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: U */
        public final void mo51376U(int i, long j) throws IOException {
            mo51384G(i, 1);
            mo51371c0(j);
        }

        @Override // p000.VC7
        /* renamed from: a */
        public final void mo51375a(byte[] bArr, int i, int i2) throws IOException {
            mo51372c(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: b */
        public void mo51374b() {
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: b0 */
        public final void mo51373b0(int i, int i2) throws IOException {
            mo51384G(i, 0);
            mo51358y0(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: c */
        public final void mo51372c(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f70500d, this.f70503g, i2);
                this.f70503g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f70503g), Integer.valueOf(this.f70502f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: c0 */
        public final void mo51371c0(long j) throws IOException {
            try {
                byte[] bArr = this.f70500d;
                int i = this.f70503g;
                int i2 = i + 1;
                bArr[i] = (byte) j;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (j >> 48);
                this.f70503g = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f70503g), Integer.valueOf(this.f70502f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: g */
        public final void mo51370g(byte b) throws IOException {
            try {
                byte[] bArr = this.f70500d;
                int i = this.f70503g;
                this.f70503g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f70503g), Integer.valueOf(this.f70502f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: i0 */
        public final void mo51369i0(int i, int i2) throws IOException {
            mo51384G(i, 5);
            mo51385A0(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: l */
        public final void mo51368l(int i, long j) throws IOException {
            mo51384G(i, 0);
            mo51379L(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: m */
        public final void mo51367m(int i, String str) throws IOException {
            mo51384G(i, 2);
            mo51366m0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: m0 */
        public final void mo51366m0(String str) throws IOException {
            int i = this.f70503g;
            try {
                int m51442D0 = zzbn.m51442D0(str.length() * 3);
                int m51442D02 = zzbn.m51442D0(str.length());
                if (m51442D02 != m51442D0) {
                    mo51358y0(C31909Bg8.m113685a(str));
                    this.f70503g = C31909Bg8.m113684b(str, this.f70500d, this.f70503g, mo51360u());
                    return;
                }
                int i2 = i + m51442D02;
                this.f70503g = i2;
                int m113684b = C31909Bg8.m113684b(str, this.f70500d, i2, mo51360u());
                this.f70503g = i;
                mo51358y0((m113684b - i) - m51442D02);
                this.f70503g = m113684b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            } catch (C49985uh8 e2) {
                this.f70503g = i;
                m51402q(str, e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: n */
        public final void mo51365n(int i, TD7 td7) throws IOException {
            mo51384G(i, 2);
            mo51362r(td7);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: o */
        public final void mo51364o(int i, H28 h28) throws IOException {
            mo51384G(i, 2);
            mo51378M(h28);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: p */
        public final void mo51363p(int i, H28 h28, InterfaceC51439x88 interfaceC51439x88) throws IOException {
            mo51384G(i, 2);
            AbstractC17495a abstractC17495a = (AbstractC17495a) h28;
            int mo51564b = abstractC17495a.mo51564b();
            if (mo51564b == -1) {
                mo51564b = interfaceC51439x88.mo5806h(abstractC17495a);
                abstractC17495a.mo51565a(mo51564b);
            }
            mo51358y0(mo51564b);
            interfaceC51439x88.mo5811c(h28, this.f70499a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: r */
        public final void mo51362r(TD7 td7) throws IOException {
            mo51358y0(td7.size());
            td7.mo8902e(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: s */
        public final void mo51361s(H28 h28, InterfaceC51439x88 interfaceC51439x88) throws IOException {
            AbstractC17495a abstractC17495a = (AbstractC17495a) h28;
            int mo51564b = abstractC17495a.mo51564b();
            if (mo51564b == -1) {
                mo51564b = interfaceC51439x88.mo5806h(abstractC17495a);
                abstractC17495a.mo51565a(mo51564b);
            }
            mo51358y0(mo51564b);
            interfaceC51439x88.mo5811c(h28, this.f70499a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: u */
        public final int mo51360u() {
            return this.f70502f - this.f70503g;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: x0 */
        public final void mo51359x0(int i) throws IOException {
            if (i >= 0) {
                mo51358y0(i);
            } else {
                mo51379L(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: y0 */
        public final void mo51358y0(int i) throws IOException {
            if (zzbn.f70498c && mo51360u() >= 10) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.f70500d;
                    int i2 = this.f70503g;
                    this.f70503g = i2 + 1;
                    C35410Qf8.m88235k(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f70500d;
                int i3 = this.f70503g;
                this.f70503g = i3 + 1;
                C35410Qf8.m88235k(bArr2, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f70500d;
                    int i4 = this.f70503g;
                    this.f70503g = i4 + 1;
                    bArr3[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f70503g), Integer.valueOf(this.f70502f), 1), e);
                }
            }
            byte[] bArr4 = this.f70500d;
            int i5 = this.f70503g;
            this.f70503g = i5 + 1;
            bArr4[i5] = (byte) i;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$b */
    /* loaded from: classes5.dex */
    public static final class C17524b extends C17523a {

        /* renamed from: h */
        public final ByteBuffer f70504h;

        /* renamed from: i */
        public int f70505i;

        public C17524b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f70504h = byteBuffer;
            this.f70505i = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn.C17523a, com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: b */
        public final void mo51374b() {
            this.f70504h.position(this.f70505i + m51387K0());
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$c */
    /* loaded from: classes5.dex */
    public static final class C17525c extends zzbn {

        /* renamed from: d */
        public final ByteBuffer f70506d;

        /* renamed from: e */
        public final ByteBuffer f70507e;

        /* renamed from: f */
        public final int f70508f;

        public C17525c(ByteBuffer byteBuffer) {
            super();
            this.f70506d = byteBuffer;
            this.f70507e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f70508f = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: A0 */
        public final void mo51385A0(int i) throws IOException {
            try {
                this.f70507e.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: G */
        public final void mo51384G(int i, int i2) throws IOException {
            mo51358y0((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: I */
        public final void mo51383I(int i, TD7 td7) throws IOException {
            mo51384G(1, 3);
            mo51373b0(2, i);
            mo51365n(3, td7);
            mo51384G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: J */
        public final void mo51382J(int i, H28 h28) throws IOException {
            mo51384G(1, 3);
            mo51373b0(2, i);
            mo51364o(3, h28);
            mo51384G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: K */
        public final void mo51381K(int i, boolean z) throws IOException {
            mo51384G(i, 0);
            mo51370g(z ? (byte) 1 : (byte) 0);
        }

        /* renamed from: K0 */
        public final void m51386K0(String str) throws IOException {
            try {
                C31909Bg8.m113683c(str, this.f70507e);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: L */
        public final void mo51379L(long j) throws IOException {
            while (((-128) & j) != 0) {
                try {
                    this.f70507e.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzc(e);
                }
            }
            this.f70507e.put((byte) j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: M */
        public final void mo51378M(H28 h28) throws IOException {
            mo51358y0(h28.mo51553o());
            h28.mo51554n(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: T */
        public final void mo51377T(int i, int i2) throws IOException {
            mo51384G(i, 0);
            mo51359x0(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: U */
        public final void mo51376U(int i, long j) throws IOException {
            mo51384G(i, 1);
            mo51371c0(j);
        }

        @Override // p000.VC7
        /* renamed from: a */
        public final void mo51375a(byte[] bArr, int i, int i2) throws IOException {
            mo51372c(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: b */
        public final void mo51374b() {
            this.f70506d.position(this.f70507e.position());
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: b0 */
        public final void mo51373b0(int i, int i2) throws IOException {
            mo51384G(i, 0);
            mo51358y0(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: c */
        public final void mo51372c(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f70507e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: c0 */
        public final void mo51371c0(long j) throws IOException {
            try {
                this.f70507e.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: g */
        public final void mo51370g(byte b) throws IOException {
            try {
                this.f70507e.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: i0 */
        public final void mo51369i0(int i, int i2) throws IOException {
            mo51384G(i, 5);
            mo51385A0(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: l */
        public final void mo51368l(int i, long j) throws IOException {
            mo51384G(i, 0);
            mo51379L(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: m */
        public final void mo51367m(int i, String str) throws IOException {
            mo51384G(i, 2);
            mo51366m0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: m0 */
        public final void mo51366m0(String str) throws IOException {
            int position = this.f70507e.position();
            try {
                int m51442D0 = zzbn.m51442D0(str.length() * 3);
                int m51442D02 = zzbn.m51442D0(str.length());
                if (m51442D02 != m51442D0) {
                    mo51358y0(C31909Bg8.m113685a(str));
                    m51386K0(str);
                    return;
                }
                int position2 = this.f70507e.position() + m51442D02;
                this.f70507e.position(position2);
                m51386K0(str);
                int position3 = this.f70507e.position();
                this.f70507e.position(position);
                mo51358y0(position3 - position2);
                this.f70507e.position(position3);
            } catch (C49985uh8 e) {
                this.f70507e.position(position);
                m51402q(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: n */
        public final void mo51365n(int i, TD7 td7) throws IOException {
            mo51384G(i, 2);
            mo51362r(td7);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: o */
        public final void mo51364o(int i, H28 h28) throws IOException {
            mo51384G(i, 2);
            mo51378M(h28);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: p */
        public final void mo51363p(int i, H28 h28, InterfaceC51439x88 interfaceC51439x88) throws IOException {
            mo51384G(i, 2);
            mo51361s(h28, interfaceC51439x88);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: r */
        public final void mo51362r(TD7 td7) throws IOException {
            mo51358y0(td7.size());
            td7.mo8902e(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: s */
        public final void mo51361s(H28 h28, InterfaceC51439x88 interfaceC51439x88) throws IOException {
            AbstractC17495a abstractC17495a = (AbstractC17495a) h28;
            int mo51564b = abstractC17495a.mo51564b();
            if (mo51564b == -1) {
                mo51564b = interfaceC51439x88.mo5806h(abstractC17495a);
                abstractC17495a.mo51565a(mo51564b);
            }
            mo51358y0(mo51564b);
            interfaceC51439x88.mo5811c(h28, this.f70499a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: u */
        public final int mo51360u() {
            return this.f70507e.remaining();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: x0 */
        public final void mo51359x0(int i) throws IOException {
            if (i >= 0) {
                mo51358y0(i);
            } else {
                mo51379L(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: y0 */
        public final void mo51358y0(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    this.f70507e.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzc(e);
                }
            }
            this.f70507e.put((byte) i);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$d */
    /* loaded from: classes5.dex */
    public static final class C17526d extends zzbn {

        /* renamed from: d */
        public final ByteBuffer f70509d;

        /* renamed from: e */
        public final ByteBuffer f70510e;

        /* renamed from: f */
        public final long f70511f;

        /* renamed from: g */
        public final long f70512g;

        /* renamed from: h */
        public final long f70513h;

        /* renamed from: i */
        public final long f70514i;

        /* renamed from: j */
        public long f70515j;

        public C17526d(ByteBuffer byteBuffer) {
            super();
            this.f70509d = byteBuffer;
            this.f70510e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long m88231o = C35410Qf8.m88231o(byteBuffer);
            this.f70511f = m88231o;
            long position = byteBuffer.position() + m88231o;
            this.f70512g = position;
            long limit = m88231o + byteBuffer.limit();
            this.f70513h = limit;
            this.f70514i = limit - 10;
            this.f70515j = position;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: A0 */
        public final void mo51385A0(int i) throws IOException {
            this.f70510e.putInt((int) (this.f70515j - this.f70511f), i);
            this.f70515j += 4;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: G */
        public final void mo51384G(int i, int i2) throws IOException {
            mo51358y0((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: I */
        public final void mo51383I(int i, TD7 td7) throws IOException {
            mo51384G(1, 3);
            mo51373b0(2, i);
            mo51365n(3, td7);
            mo51384G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: J */
        public final void mo51382J(int i, H28 h28) throws IOException {
            mo51384G(1, 3);
            mo51373b0(2, i);
            mo51364o(3, h28);
            mo51384G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: K */
        public final void mo51381K(int i, boolean z) throws IOException {
            mo51384G(i, 0);
            mo51370g(z ? (byte) 1 : (byte) 0);
        }

        /* renamed from: K0 */
        public final void m51380K0(long j) {
            this.f70510e.position((int) (j - this.f70511f));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: L */
        public final void mo51379L(long j) throws IOException {
            if (this.f70515j <= this.f70514i) {
                while ((j & (-128)) != 0) {
                    long j2 = this.f70515j;
                    this.f70515j = j2 + 1;
                    C35410Qf8.m88243c(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f70515j;
                this.f70515j = 1 + j3;
                C35410Qf8.m88243c(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.f70515j;
                if (j4 >= this.f70513h) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f70515j), Long.valueOf(this.f70513h), 1));
                }
                if ((j & (-128)) == 0) {
                    this.f70515j = 1 + j4;
                    C35410Qf8.m88243c(j4, (byte) j);
                    return;
                }
                this.f70515j = j4 + 1;
                C35410Qf8.m88243c(j4, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: M */
        public final void mo51378M(H28 h28) throws IOException {
            mo51358y0(h28.mo51553o());
            h28.mo51554n(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: T */
        public final void mo51377T(int i, int i2) throws IOException {
            mo51384G(i, 0);
            mo51359x0(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: U */
        public final void mo51376U(int i, long j) throws IOException {
            mo51384G(i, 1);
            mo51371c0(j);
        }

        @Override // p000.VC7
        /* renamed from: a */
        public final void mo51375a(byte[] bArr, int i, int i2) throws IOException {
            mo51372c(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: b */
        public final void mo51374b() {
            this.f70509d.position((int) (this.f70515j - this.f70511f));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: b0 */
        public final void mo51373b0(int i, int i2) throws IOException {
            mo51384G(i, 0);
            mo51358y0(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: c */
        public final void mo51372c(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.f70515j;
                if (this.f70513h - j >= j2) {
                    C35410Qf8.m88234l(bArr, i, j2, j);
                    this.f70515j += j;
                    return;
                }
            }
            if (bArr != null) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f70515j), Long.valueOf(this.f70513h), Integer.valueOf(i2)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: c0 */
        public final void mo51371c0(long j) throws IOException {
            this.f70510e.putLong((int) (this.f70515j - this.f70511f), j);
            this.f70515j += 8;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: g */
        public final void mo51370g(byte b) throws IOException {
            long j = this.f70515j;
            if (j >= this.f70513h) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f70515j), Long.valueOf(this.f70513h), 1));
            }
            this.f70515j = 1 + j;
            C35410Qf8.m88243c(j, b);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: i0 */
        public final void mo51369i0(int i, int i2) throws IOException {
            mo51384G(i, 5);
            mo51385A0(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: l */
        public final void mo51368l(int i, long j) throws IOException {
            mo51384G(i, 0);
            mo51379L(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: m */
        public final void mo51367m(int i, String str) throws IOException {
            mo51384G(i, 2);
            mo51366m0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: m0 */
        public final void mo51366m0(String str) throws IOException {
            long j = this.f70515j;
            try {
                int m51442D0 = zzbn.m51442D0(str.length() * 3);
                int m51442D02 = zzbn.m51442D0(str.length());
                if (m51442D02 != m51442D0) {
                    int m113685a = C31909Bg8.m113685a(str);
                    mo51358y0(m113685a);
                    m51380K0(this.f70515j);
                    C31909Bg8.m113683c(str, this.f70510e);
                    this.f70515j += m113685a;
                    return;
                }
                int i = ((int) (this.f70515j - this.f70511f)) + m51442D02;
                this.f70510e.position(i);
                C31909Bg8.m113683c(str, this.f70510e);
                int position = this.f70510e.position() - i;
                mo51358y0(position);
                this.f70515j += position;
            } catch (IllegalArgumentException e) {
                throw new zzc(e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            } catch (C49985uh8 e3) {
                this.f70515j = j;
                m51380K0(j);
                m51402q(str, e3);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: n */
        public final void mo51365n(int i, TD7 td7) throws IOException {
            mo51384G(i, 2);
            mo51362r(td7);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: o */
        public final void mo51364o(int i, H28 h28) throws IOException {
            mo51384G(i, 2);
            mo51378M(h28);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: p */
        public final void mo51363p(int i, H28 h28, InterfaceC51439x88 interfaceC51439x88) throws IOException {
            mo51384G(i, 2);
            mo51361s(h28, interfaceC51439x88);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: r */
        public final void mo51362r(TD7 td7) throws IOException {
            mo51358y0(td7.size());
            td7.mo8902e(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: s */
        public final void mo51361s(H28 h28, InterfaceC51439x88 interfaceC51439x88) throws IOException {
            AbstractC17495a abstractC17495a = (AbstractC17495a) h28;
            int mo51564b = abstractC17495a.mo51564b();
            if (mo51564b == -1) {
                mo51564b = interfaceC51439x88.mo5806h(abstractC17495a);
                abstractC17495a.mo51565a(mo51564b);
            }
            mo51358y0(mo51564b);
            interfaceC51439x88.mo5811c(h28, this.f70499a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: u */
        public final int mo51360u() {
            return (int) (this.f70513h - this.f70515j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: x0 */
        public final void mo51359x0(int i) throws IOException {
            if (i >= 0) {
                mo51358y0(i);
            } else {
                mo51379L(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: y0 */
        public final void mo51358y0(int i) throws IOException {
            long j;
            if (this.f70515j <= this.f70514i) {
                while (true) {
                    int i2 = i & (-128);
                    j = this.f70515j;
                    if (i2 == 0) {
                        break;
                    }
                    this.f70515j = j + 1;
                    C35410Qf8.m88243c(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            } else {
                while (true) {
                    j = this.f70515j;
                    if (j >= this.f70513h) {
                        throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f70515j), Long.valueOf(this.f70513h), 1));
                    }
                    if ((i & (-128)) == 0) {
                        break;
                    }
                    this.f70515j = j + 1;
                    C35410Qf8.m88243c(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
            this.f70515j = 1 + j;
            C35410Qf8.m88243c(j, (byte) i);
        }
    }

    /* loaded from: classes5.dex */
    public static class zzc extends IOException {
        public zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public zzc(String str) {
            super(r3.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "));
            String valueOf = String.valueOf(str);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public zzc(String str, Throwable th) {
            super(r3.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
            String valueOf = String.valueOf(str);
        }

        public zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private zzbn() {
    }

    /* renamed from: A */
    public static int m51448A(int i, String str) {
        return m51446B0(i) + m51401q0(str);
    }

    /* renamed from: B */
    public static int m51447B(int i, C50470vW7 c50470vW7) {
        return (m51446B0(1) << 1) + m51405n0(2, i) + m51420d(3, c50470vW7);
    }

    /* renamed from: B0 */
    public static int m51446B0(int i) {
        return m51442D0(i << 3);
    }

    /* renamed from: C */
    public static int m51445C(int i, H28 h28, InterfaceC51439x88 interfaceC51439x88) {
        return m51446B0(i) + m51441E(h28, interfaceC51439x88);
    }

    /* renamed from: C0 */
    public static int m51444C0(int i) {
        if (i >= 0) {
            return m51442D0(i);
        }
        return 10;
    }

    /* renamed from: D */
    public static int m51443D(TD7 td7) {
        int size = td7.size();
        return m51442D0(size) + size;
    }

    /* renamed from: D0 */
    public static int m51442D0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: E */
    public static int m51441E(H28 h28, InterfaceC51439x88 interfaceC51439x88) {
        AbstractC17495a abstractC17495a = (AbstractC17495a) h28;
        int mo51564b = abstractC17495a.mo51564b();
        if (mo51564b == -1) {
            mo51564b = interfaceC51439x88.mo5806h(abstractC17495a);
            abstractC17495a.mo51565a(mo51564b);
        }
        return m51442D0(mo51564b) + mo51564b;
    }

    /* renamed from: E0 */
    public static int m51440E0(int i) {
        return m51442D0(m51434I0(i));
    }

    /* renamed from: F */
    public static int m51439F(boolean z) {
        return 1;
    }

    /* renamed from: F0 */
    public static int m51438F0(int i) {
        return 4;
    }

    /* renamed from: G0 */
    public static int m51437G0(int i) {
        return 4;
    }

    /* renamed from: H0 */
    public static int m51435H0(int i) {
        return m51444C0(i);
    }

    /* renamed from: I0 */
    public static int m51434I0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    /* renamed from: J0 */
    public static int m51433J0(int i) {
        return m51442D0(i);
    }

    /* renamed from: N */
    public static int m51432N(int i, TD7 td7) {
        int m51446B0 = m51446B0(i);
        int size = td7.size();
        return m51446B0 + m51442D0(size) + size;
    }

    /* renamed from: O */
    public static int m51431O(int i, H28 h28) {
        return m51446B0(i) + m51428R(h28);
    }

    @Deprecated
    /* renamed from: P */
    public static int m51430P(int i, H28 h28, InterfaceC51439x88 interfaceC51439x88) {
        int m51446B0 = m51446B0(i) << 1;
        AbstractC17495a abstractC17495a = (AbstractC17495a) h28;
        int mo51564b = abstractC17495a.mo51564b();
        if (mo51564b == -1) {
            mo51564b = interfaceC51439x88.mo5806h(abstractC17495a);
            abstractC17495a.mo51565a(mo51564b);
        }
        return m51446B0 + mo51564b;
    }

    /* renamed from: Q */
    public static int m51429Q(int i, boolean z) {
        return m51446B0(i) + 1;
    }

    /* renamed from: R */
    public static int m51428R(H28 h28) {
        int mo51553o = h28.mo51553o();
        return m51442D0(mo51553o) + mo51553o;
    }

    /* renamed from: S */
    public static zzbn m51427S(byte[] bArr) {
        return new C17523a(bArr, 0, bArr.length);
    }

    /* renamed from: W */
    public static int m51425W(int i, long j) {
        return m51446B0(i) + m51412h0(j);
    }

    /* renamed from: X */
    public static int m51424X(int i, TD7 td7) {
        return (m51446B0(1) << 1) + m51405n0(2, i) + m51432N(3, td7);
    }

    /* renamed from: Y */
    public static int m51423Y(int i, H28 h28) {
        return (m51446B0(1) << 1) + m51405n0(2, i) + m51431O(3, h28);
    }

    @Deprecated
    /* renamed from: Z */
    public static int m51422Z(H28 h28) {
        return h28.mo51553o();
    }

    /* renamed from: a0 */
    public static int m51421a0(byte[] bArr) {
        int length = bArr.length;
        return m51442D0(length) + length;
    }

    /* renamed from: d */
    public static int m51420d(int i, C50470vW7 c50470vW7) {
        int m51446B0 = m51446B0(i);
        int m8538a = c50470vW7.m8538a();
        return m51446B0 + m51442D0(m8538a) + m8538a;
    }

    /* renamed from: d0 */
    public static int m51419d0(int i, long j) {
        return m51446B0(i) + m51412h0(j);
    }

    /* renamed from: e */
    public static int m51418e(C50470vW7 c50470vW7) {
        int m8538a = c50470vW7.m8538a();
        return m51442D0(m8538a) + m8538a;
    }

    /* renamed from: e0 */
    public static int m51417e0(long j) {
        return m51412h0(j);
    }

    /* renamed from: f */
    public static zzbn m51416f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C17524b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return C35410Qf8.m88221y() ? new C17526d(byteBuffer) : new C17525c(byteBuffer);
    }

    /* renamed from: g0 */
    public static int m51414g0(int i, long j) {
        return m51446B0(i) + m51412h0(m51396u0(j));
    }

    /* renamed from: h0 */
    public static int m51412h0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: j0 */
    public static int m51409j0(int i, int i2) {
        return m51446B0(i) + m51444C0(i2);
    }

    /* renamed from: k0 */
    public static int m51407k0(int i, long j) {
        return m51446B0(i) + 8;
    }

    /* renamed from: l0 */
    public static int m51406l0(long j) {
        return m51412h0(m51396u0(j));
    }

    /* renamed from: n0 */
    public static int m51405n0(int i, int i2) {
        return m51446B0(i) + m51442D0(i2);
    }

    /* renamed from: o0 */
    public static int m51404o0(int i, long j) {
        return m51446B0(i) + 8;
    }

    /* renamed from: p0 */
    public static int m51403p0(long j) {
        return 8;
    }

    /* renamed from: q0 */
    public static int m51401q0(String str) {
        int length;
        try {
            length = C31909Bg8.m113685a(str);
        } catch (C49985uh8 unused) {
            length = str.getBytes(C37975aT7.f50512a).length;
        }
        return m51442D0(length) + length;
    }

    /* renamed from: r0 */
    public static int m51400r0(int i, int i2) {
        return m51446B0(i) + m51442D0(m51434I0(i2));
    }

    /* renamed from: s0 */
    public static int m51399s0(long j) {
        return 8;
    }

    /* renamed from: t0 */
    public static int m51397t0(int i, int i2) {
        return m51446B0(i) + 4;
    }

    /* renamed from: u0 */
    public static long m51396u0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: v0 */
    public static int m51394v0(int i, int i2) {
        return m51446B0(i) + 4;
    }

    /* renamed from: w */
    public static int m51393w(double d) {
        return 8;
    }

    /* renamed from: w0 */
    public static int m51392w0(int i, int i2) {
        return m51446B0(i) + m51444C0(i2);
    }

    /* renamed from: x */
    public static int m51391x(float f) {
        return 4;
    }

    /* renamed from: y */
    public static int m51390y(int i, double d) {
        return m51446B0(i) + 8;
    }

    /* renamed from: z */
    public static int m51389z(int i, float f) {
        return m51446B0(i) + 4;
    }

    /* renamed from: A0 */
    public abstract void mo51385A0(int i) throws IOException;

    /* renamed from: G */
    public abstract void mo51384G(int i, int i2) throws IOException;

    /* renamed from: H */
    public final void m51436H(int i, long j) throws IOException {
        mo51368l(i, m51396u0(j));
    }

    /* renamed from: I */
    public abstract void mo51383I(int i, TD7 td7) throws IOException;

    /* renamed from: J */
    public abstract void mo51382J(int i, H28 h28) throws IOException;

    /* renamed from: K */
    public abstract void mo51381K(int i, boolean z) throws IOException;

    /* renamed from: L */
    public abstract void mo51379L(long j) throws IOException;

    /* renamed from: M */
    public abstract void mo51378M(H28 h28) throws IOException;

    /* renamed from: T */
    public abstract void mo51377T(int i, int i2) throws IOException;

    /* renamed from: U */
    public abstract void mo51376U(int i, long j) throws IOException;

    /* renamed from: V */
    public final void m51426V(long j) throws IOException {
        mo51379L(m51396u0(j));
    }

    /* renamed from: b */
    public abstract void mo51374b() throws IOException;

    /* renamed from: b0 */
    public abstract void mo51373b0(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo51372c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c0 */
    public abstract void mo51371c0(long j) throws IOException;

    /* renamed from: f0 */
    public final void m51415f0(int i, int i2) throws IOException {
        mo51373b0(i, m51434I0(i2));
    }

    /* renamed from: g */
    public abstract void mo51370g(byte b) throws IOException;

    /* renamed from: h */
    public final void m51413h(double d) throws IOException {
        mo51371c0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: i */
    public final void m51411i(float f) throws IOException {
        mo51385A0(Float.floatToRawIntBits(f));
    }

    /* renamed from: i0 */
    public abstract void mo51369i0(int i, int i2) throws IOException;

    /* renamed from: j */
    public final void m51410j(int i, double d) throws IOException {
        mo51376U(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: k */
    public final void m51408k(int i, float f) throws IOException {
        mo51369i0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: l */
    public abstract void mo51368l(int i, long j) throws IOException;

    /* renamed from: m */
    public abstract void mo51367m(int i, String str) throws IOException;

    /* renamed from: m0 */
    public abstract void mo51366m0(String str) throws IOException;

    /* renamed from: n */
    public abstract void mo51365n(int i, TD7 td7) throws IOException;

    /* renamed from: o */
    public abstract void mo51364o(int i, H28 h28) throws IOException;

    /* renamed from: p */
    public abstract void mo51363p(int i, H28 h28, InterfaceC51439x88 interfaceC51439x88) throws IOException;

    /* renamed from: q */
    public final void m51402q(String str, C49985uh8 c49985uh8) throws IOException {
        f70497b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c49985uh8);
        byte[] bytes = str.getBytes(C37975aT7.f50512a);
        try {
            mo51358y0(bytes.length);
            mo51375a(bytes, 0, bytes.length);
        } catch (zzc e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzc(e2);
        }
    }

    /* renamed from: r */
    public abstract void mo51362r(TD7 td7) throws IOException;

    /* renamed from: s */
    public abstract void mo51361s(H28 h28, InterfaceC51439x88 interfaceC51439x88) throws IOException;

    /* renamed from: t */
    public final void m51398t(boolean z) throws IOException {
        mo51370g(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: u */
    public abstract int mo51360u();

    /* renamed from: x0 */
    public abstract void mo51359x0(int i) throws IOException;

    /* renamed from: y0 */
    public abstract void mo51358y0(int i) throws IOException;

    /* renamed from: z0 */
    public final void m51388z0(int i) throws IOException {
        mo51358y0(m51434I0(i));
    }
}
