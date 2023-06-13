package com.bumptech.glide.integration.webp;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.KotlinVersion;
import okhttp3.internal.http2.Settings;
/* renamed from: com.bumptech.glide.integration.webp.a */
/* loaded from: classes5.dex */
public class C17109a {

    /* renamed from: a */
    public static final boolean f69131a = m53111f();

    /* renamed from: com.bumptech.glide.integration.webp.a$a */
    /* loaded from: classes5.dex */
    public static final class C17110a implements InterfaceC17112c {

        /* renamed from: a */
        public final byte[] f69132a;

        /* renamed from: b */
        public final int f69133b;

        /* renamed from: c */
        public final int f69134c;

        /* renamed from: d */
        public int f69135d;

        public C17110a(byte[] bArr, int i, int i2) {
            this.f69132a = bArr;
            this.f69133b = i;
            this.f69134c = i2;
            this.f69135d = i;
        }

        @Override // com.bumptech.glide.integration.webp.C17109a.InterfaceC17112c
        /* renamed from: a */
        public int mo53109a() throws IOException {
            return ((mo53108b() << 8) & 65280) | (mo53108b() & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.bumptech.glide.integration.webp.C17109a.InterfaceC17112c
        /* renamed from: b */
        public int mo53108b() throws IOException {
            int i = this.f69135d;
            if (i >= this.f69133b + this.f69134c) {
                return -1;
            }
            byte[] bArr = this.f69132a;
            this.f69135d = i + 1;
            return bArr[i];
        }

        @Override // com.bumptech.glide.integration.webp.C17109a.InterfaceC17112c
        public long skip(long j) throws IOException {
            int min = (int) Math.min((this.f69133b + this.f69134c) - this.f69135d, j);
            this.f69135d += min;
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.integration.webp.a$b */
    /* loaded from: classes5.dex */
    public static final class C17111b implements InterfaceC17112c {

        /* renamed from: a */
        public final ByteBuffer f69136a;

        public C17111b(ByteBuffer byteBuffer) {
            this.f69136a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.integration.webp.C17109a.InterfaceC17112c
        /* renamed from: a */
        public int mo53109a() throws IOException {
            return ((mo53108b() << 8) & 65280) | (mo53108b() & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.bumptech.glide.integration.webp.C17109a.InterfaceC17112c
        /* renamed from: b */
        public int mo53108b() throws IOException {
            if (this.f69136a.remaining() < 1) {
                return -1;
            }
            return this.f69136a.get();
        }

        @Override // com.bumptech.glide.integration.webp.C17109a.InterfaceC17112c
        public long skip(long j) throws IOException {
            int min = (int) Math.min(this.f69136a.remaining(), j);
            ByteBuffer byteBuffer = this.f69136a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.integration.webp.a$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC17112c {
        /* renamed from: a */
        int mo53109a() throws IOException;

        /* renamed from: b */
        int mo53108b() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: com.bumptech.glide.integration.webp.a$d */
    /* loaded from: classes5.dex */
    public static final class C17113d implements InterfaceC17112c {

        /* renamed from: a */
        public final InputStream f69137a;

        public C17113d(InputStream inputStream) {
            this.f69137a = inputStream;
        }

        @Override // com.bumptech.glide.integration.webp.C17109a.InterfaceC17112c
        /* renamed from: a */
        public int mo53109a() throws IOException {
            return ((this.f69137a.read() << 8) & 65280) | (this.f69137a.read() & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.bumptech.glide.integration.webp.C17109a.InterfaceC17112c
        /* renamed from: b */
        public int mo53108b() throws IOException {
            return this.f69137a.read();
        }

        @Override // com.bumptech.glide.integration.webp.C17109a.InterfaceC17112c
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f69137a.skip(j2);
                if (skip <= 0) {
                    if (this.f69137a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: com.bumptech.glide.integration.webp.a$e */
    /* loaded from: classes5.dex */
    public enum EnumC17114e {
        WEBP_SIMPLE(false, false),
        WEBP_LOSSLESS(false, false),
        WEBP_LOSSLESS_WITH_ALPHA(true, false),
        WEBP_EXTENDED(false, false),
        WEBP_EXTENDED_WITH_ALPHA(true, false),
        WEBP_EXTENDED_ANIMATED(false, true),
        NONE_WEBP(false, false);
        

        /* renamed from: b */
        public final boolean f69146b;

        /* renamed from: c */
        public final boolean f69147c;

        EnumC17114e(boolean z, boolean z2) {
            this.f69146b = z;
            this.f69147c = z2;
        }
    }

    /* renamed from: a */
    public static EnumC17114e m53116a(InterfaceC17112c interfaceC17112c) throws IOException {
        if ((((interfaceC17112c.mo53109a() << 16) & (-65536)) | (interfaceC17112c.mo53109a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != 1380533830) {
            return EnumC17114e.NONE_WEBP;
        }
        interfaceC17112c.skip(4L);
        if ((((interfaceC17112c.mo53109a() << 16) & (-65536)) | (interfaceC17112c.mo53109a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != 1464156752) {
            return EnumC17114e.NONE_WEBP;
        }
        int mo53109a = ((interfaceC17112c.mo53109a() << 16) & (-65536)) | (interfaceC17112c.mo53109a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if (mo53109a == 1448097824) {
            return EnumC17114e.WEBP_SIMPLE;
        }
        if (mo53109a == 1448097868) {
            interfaceC17112c.skip(4L);
            if ((interfaceC17112c.mo53108b() & 8) != 0) {
                return EnumC17114e.WEBP_LOSSLESS_WITH_ALPHA;
            }
            return EnumC17114e.WEBP_LOSSLESS;
        } else if (mo53109a == 1448097880) {
            interfaceC17112c.skip(4L);
            int mo53108b = interfaceC17112c.mo53108b();
            if ((mo53108b & 2) != 0) {
                return EnumC17114e.WEBP_EXTENDED_ANIMATED;
            }
            if ((mo53108b & 16) != 0) {
                return EnumC17114e.WEBP_EXTENDED_WITH_ALPHA;
            }
            return EnumC17114e.WEBP_EXTENDED;
        } else {
            return EnumC17114e.NONE_WEBP;
        }
    }

    /* renamed from: b */
    public static EnumC17114e m53115b(InputStream inputStream, InterfaceC28820to interfaceC28820to) throws IOException {
        if (inputStream == null) {
            return EnumC17114e.NONE_WEBP;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C38818bt4(inputStream, interfaceC28820to);
        }
        inputStream.mark(21);
        try {
            return m53116a(new C17113d((InputStream) C52865zZ3.m1111d(inputStream)));
        } finally {
            inputStream.reset();
        }
    }

    /* renamed from: c */
    public static EnumC17114e m53114c(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return EnumC17114e.NONE_WEBP;
        }
        return m53116a(new C17111b((ByteBuffer) C52865zZ3.m1111d(byteBuffer)));
    }

    /* renamed from: d */
    public static EnumC17114e m53113d(byte[] bArr, int i, int i2) throws IOException {
        return m53116a(new C17110a(bArr, i, i2));
    }

    /* renamed from: e */
    public static boolean m53112e(EnumC17114e enumC17114e) {
        return enumC17114e == EnumC17114e.WEBP_EXTENDED_ANIMATED;
    }

    /* renamed from: f */
    public static boolean m53111f() {
        return true;
    }

    /* renamed from: g */
    public static boolean m53110g(EnumC17114e enumC17114e) {
        return enumC17114e == EnumC17114e.WEBP_SIMPLE || enumC17114e == EnumC17114e.WEBP_LOSSLESS || enumC17114e == EnumC17114e.WEBP_LOSSLESS_WITH_ALPHA || enumC17114e == EnumC17114e.WEBP_EXTENDED || enumC17114e == EnumC17114e.WEBP_EXTENDED_WITH_ALPHA;
    }
}
