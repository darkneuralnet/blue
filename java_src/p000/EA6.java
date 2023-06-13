package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.LruCache;
import com.bumptech.glide.integration.webp.WebpFrame;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;
import p000.InterfaceC49099tC1;
/* renamed from: EA6 */
/* loaded from: classes5.dex */
public class EA6 implements InterfaceC49099tC1 {

    /* renamed from: a */
    public ByteBuffer f7057a;

    /* renamed from: b */
    public WebpImage f7058b;

    /* renamed from: c */
    public final InterfaceC49099tC1.InterfaceC28552a f7059c;

    /* renamed from: d */
    public int f7060d;

    /* renamed from: e */
    public final int[] f7061e;

    /* renamed from: f */
    public final KA6[] f7062f;

    /* renamed from: g */
    public int f7063g;

    /* renamed from: h */
    public int f7064h;

    /* renamed from: i */
    public int f7065i;

    /* renamed from: j */
    public final Paint f7066j;

    /* renamed from: k */
    public JA6 f7067k;

    /* renamed from: l */
    public Bitmap.Config f7068l;

    /* renamed from: m */
    public final LruCache<Integer, Bitmap> f7069m;

    /* renamed from: EA6$a */
    /* loaded from: classes5.dex */
    public class C1754a extends LruCache<Integer, Bitmap> {
        public C1754a(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        /* renamed from: a */
        public void entryRemoved(boolean z, Integer num, Bitmap bitmap, Bitmap bitmap2) {
            if (bitmap != null) {
                EA6.this.f7059c.mo12905c(bitmap);
            }
        }
    }

    public EA6(InterfaceC49099tC1.InterfaceC28552a interfaceC28552a, WebpImage webpImage, ByteBuffer byteBuffer, int i) {
        this(interfaceC28552a, webpImage, byteBuffer, i, JA6.f16966c);
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: a */
    public void mo12434a(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888) {
            this.f7068l = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888);
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: b */
    public void mo12433b() {
        this.f7060d = -1;
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: c */
    public int mo12432c() {
        return this.f7060d;
    }

    @Override // p000.InterfaceC49099tC1
    public void clear() {
        this.f7058b.dispose();
        this.f7058b = null;
        this.f7069m.evictAll();
        this.f7057a = null;
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: d */
    public int mo12431d() {
        return this.f7058b.getSizeInBytes();
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: e */
    public Bitmap mo12430e() {
        int i;
        Bitmap bitmap;
        int mo12432c = mo12432c();
        Bitmap mo12906b = this.f7059c.mo12906b(this.f7065i, this.f7064h, Bitmap.Config.ARGB_8888);
        mo12906b.eraseColor(0);
        mo12906b.setDensity(DisplayMetrics.DENSITY_DEVICE_STABLE);
        Canvas canvas = new Canvas(mo12906b);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (!this.f7067k.m101048c() && (bitmap = this.f7069m.get(Integer.valueOf(mo12432c))) != null) {
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "hit frame bitmap from memory cache, frameNumber=" + mo12432c);
            }
            bitmap.setDensity(canvas.getDensity());
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return mo12906b;
        }
        if (!m109317p(mo12432c)) {
            i = m109316q(mo12432c - 1, canvas);
        } else {
            i = mo12432c;
        }
        if (Log.isLoggable("WebpDecoder", 3)) {
            Log.d("WebpDecoder", "frameNumber=" + mo12432c + ", nextIndex=" + i);
        }
        while (i < mo12432c) {
            KA6 ka6 = this.f7062f[i];
            if (!ka6.f19234g) {
                m109322k(canvas, ka6);
            }
            m109315r(i, canvas);
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "renderFrame, index=" + i + ", blend=" + ka6.f19234g + ", dispose=" + ka6.f19235h);
            }
            if (ka6.f19235h) {
                m109322k(canvas, ka6);
            }
            i++;
        }
        KA6 ka62 = this.f7062f[mo12432c];
        if (!ka62.f19234g) {
            m109322k(canvas, ka62);
        }
        m109315r(mo12432c, canvas);
        if (Log.isLoggable("WebpDecoder", 3)) {
            Log.d("WebpDecoder", "renderFrame, index=" + mo12432c + ", blend=" + ka62.f19234g + ", dispose=" + ka62.f19235h);
        }
        m109323j(mo12432c, mo12906b);
        return mo12906b;
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: f */
    public void mo12429f() {
        this.f7060d = (this.f7060d + 1) % this.f7058b.getFrameCount();
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: g */
    public int mo12428g() {
        return this.f7058b.getFrameCount();
    }

    @Override // p000.InterfaceC49099tC1
    public ByteBuffer getData() {
        return this.f7057a;
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: h */
    public int mo12427h() {
        int i;
        if (this.f7061e.length != 0 && (i = this.f7060d) >= 0) {
            return m109320m(i);
        }
        return 0;
    }

    /* renamed from: j */
    public final void m109323j(int i, Bitmap bitmap) {
        this.f7069m.remove(Integer.valueOf(i));
        Bitmap mo12906b = this.f7059c.mo12906b(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        mo12906b.eraseColor(0);
        mo12906b.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(mo12906b);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f7069m.put(Integer.valueOf(i), mo12906b);
    }

    /* renamed from: k */
    public final void m109322k(Canvas canvas, KA6 ka6) {
        int i = ka6.f19229b;
        int i2 = this.f7063g;
        int i3 = ka6.f19230c;
        canvas.drawRect(i / i2, i3 / i2, (i + ka6.f19231d) / i2, (i3 + ka6.f19232e) / i2, this.f7066j);
    }

    /* renamed from: l */
    public JA6 m109321l() {
        return this.f7067k;
    }

    /* renamed from: m */
    public int m109320m(int i) {
        if (i >= 0) {
            int[] iArr = this.f7061e;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        return -1;
    }

    /* renamed from: n */
    public int m109319n() {
        if (this.f7058b.getLoopCount() == 0) {
            return 0;
        }
        return this.f7058b.getLoopCount();
    }

    /* renamed from: o */
    public final boolean m109318o(KA6 ka6) {
        if (ka6.f19229b == 0 && ka6.f19230c == 0 && ka6.f19231d == this.f7058b.getWidth() && ka6.f19232e == this.f7058b.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m109317p(int i) {
        if (i == 0) {
            return true;
        }
        KA6[] ka6Arr = this.f7062f;
        KA6 ka6 = ka6Arr[i];
        KA6 ka62 = ka6Arr[i - 1];
        if (!ka6.f19234g && m109318o(ka6)) {
            return true;
        }
        if (ka62.f19235h && m109318o(ka62)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final int m109316q(int i, Canvas canvas) {
        while (i >= 0) {
            KA6 ka6 = this.f7062f[i];
            if (ka6.f19235h && m109318o(ka6)) {
                return i + 1;
            }
            Bitmap bitmap = this.f7069m.get(Integer.valueOf(i));
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.setDensity(canvas.getDensity());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                if (ka6.f19235h) {
                    m109322k(canvas, ka6);
                }
                return i + 1;
            } else if (m109317p(i)) {
                return i;
            } else {
                i--;
            }
        }
        return 0;
    }

    /* renamed from: r */
    public final void m109315r(int i, Canvas canvas) {
        KA6 ka6 = this.f7062f[i];
        int i2 = ka6.f19231d;
        int i3 = this.f7063g;
        int i4 = i2 / i3;
        int i5 = ka6.f19232e / i3;
        int i6 = ka6.f19229b / i3;
        int i7 = ka6.f19230c / i3;
        if (i4 != 0 && i5 != 0) {
            WebpFrame frame = this.f7058b.getFrame(i);
            try {
                try {
                    Bitmap mo12906b = this.f7059c.mo12906b(i4, i5, this.f7068l);
                    mo12906b.eraseColor(0);
                    mo12906b.setDensity(canvas.getDensity());
                    frame.renderFrame(i4, i5, mo12906b);
                    canvas.drawBitmap(mo12906b, i6, i7, (Paint) null);
                    this.f7059c.mo12905c(mo12906b);
                } catch (IllegalArgumentException | IllegalStateException unused) {
                    Log.e("WebpDecoder", "Rendering of frame failed. Frame number: " + i);
                }
            } finally {
                frame.dispose();
            }
        }
    }

    /* renamed from: s */
    public void m109314s(CC1 cc1, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f7057a = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f7063g = highestOneBit;
            this.f7065i = this.f7058b.getWidth() / highestOneBit;
            this.f7064h = this.f7058b.getHeight() / highestOneBit;
            return;
        }
        throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
    }

    public EA6(InterfaceC49099tC1.InterfaceC28552a interfaceC28552a, WebpImage webpImage, ByteBuffer byteBuffer, int i, JA6 ja6) {
        int max;
        this.f7060d = -1;
        this.f7068l = Bitmap.Config.ARGB_8888;
        this.f7059c = interfaceC28552a;
        this.f7058b = webpImage;
        this.f7061e = webpImage.getFrameDurations();
        this.f7062f = new KA6[webpImage.getFrameCount()];
        for (int i2 = 0; i2 < this.f7058b.getFrameCount(); i2++) {
            this.f7062f[i2] = this.f7058b.getFrameInfo(i2);
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "mFrameInfos: " + this.f7062f[i2].toString());
            }
        }
        this.f7067k = ja6;
        Paint paint = new Paint();
        this.f7066j = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        if (this.f7067k.m101050a()) {
            max = webpImage.getFrameCount();
        } else {
            max = Math.max(5, this.f7067k.m101049b());
        }
        this.f7069m = new C1754a(max);
        m109314s(new CC1(), byteBuffer, i);
    }
}
