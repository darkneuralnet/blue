package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC11183i;
import androidx.camera.core.internal.utils.ImageUtil;
import java.nio.ByteBuffer;
import java.util.Objects;
import p000.C36825Wh1;
/* renamed from: TO4 */
/* loaded from: classes.dex */
public final class TO4 implements InterfaceC11183i {

    /* renamed from: b */
    public final Object f35404b;

    /* renamed from: c */
    public final int f35405c;

    /* renamed from: d */
    public final int f35406d;

    /* renamed from: e */
    public final Rect f35407e;

    /* renamed from: f */
    public InterfaceC11183i.InterfaceC11184a[] f35408f;

    /* renamed from: g */
    public final InterfaceC51066wX1 f35409g;

    /* renamed from: TO4$a */
    /* loaded from: classes.dex */
    public class C7824a implements InterfaceC11183i.InterfaceC11184a {

        /* renamed from: a */
        public final /* synthetic */ int f35410a;

        /* renamed from: b */
        public final /* synthetic */ int f35411b;

        /* renamed from: c */
        public final /* synthetic */ ByteBuffer f35412c;

        public C7824a(int i, int i2, ByteBuffer byteBuffer) {
            this.f35410a = i;
            this.f35411b = i2;
            this.f35412c = byteBuffer;
        }

        @Override // androidx.camera.core.InterfaceC11183i.InterfaceC11184a
        /* renamed from: a */
        public int mo69478a() {
            return this.f35410a;
        }

        @Override // androidx.camera.core.InterfaceC11183i.InterfaceC11184a
        /* renamed from: b */
        public int mo69477b() {
            return this.f35411b;
        }

        @Override // androidx.camera.core.InterfaceC11183i.InterfaceC11184a
        /* renamed from: e */
        public ByteBuffer mo69476e() {
            return this.f35412c;
        }
    }

    /* renamed from: TO4$b */
    /* loaded from: classes.dex */
    public class C7825b implements InterfaceC51066wX1 {

        /* renamed from: a */
        public final /* synthetic */ long f35413a;

        /* renamed from: b */
        public final /* synthetic */ int f35414b;

        /* renamed from: c */
        public final /* synthetic */ Matrix f35415c;

        public C7825b(long j, int i, Matrix matrix) {
            this.f35413a = j;
            this.f35414b = i;
            this.f35415c = matrix;
        }

        @Override // p000.InterfaceC51066wX1
        /* renamed from: a */
        public void mo3255a(C36825Wh1.C9150b c9150b) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // p000.InterfaceC51066wX1
        /* renamed from: b */
        public C51672xY5 mo3254b() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // p000.InterfaceC51066wX1
        /* renamed from: c */
        public int mo3253c() {
            return this.f35414b;
        }

        @Override // p000.InterfaceC51066wX1
        public long getTimestamp() {
            return this.f35413a;
        }
    }

    public TO4(MD3<Bitmap> md3) {
        this(md3.mo80666c(), md3.mo80667b(), md3.mo80663f(), md3.mo80662g(), md3.mo80668a().getTimestamp());
    }

    /* renamed from: b */
    public static InterfaceC51066wX1 m83700b(long j, int i, Matrix matrix) {
        return new C7825b(j, i, matrix);
    }

    /* renamed from: c */
    public static InterfaceC11183i.InterfaceC11184a m83699c(ByteBuffer byteBuffer, int i, int i2) {
        return new C7824a(i, i2, byteBuffer);
    }

    @Override // androidx.camera.core.InterfaceC11183i
    /* renamed from: A0 */
    public InterfaceC11183i.InterfaceC11184a[] mo69480A0() {
        InterfaceC11183i.InterfaceC11184a[] interfaceC11184aArr;
        synchronized (this.f35404b) {
            m83701a();
            InterfaceC11183i.InterfaceC11184a[] interfaceC11184aArr2 = this.f35408f;
            Objects.requireNonNull(interfaceC11184aArr2);
            interfaceC11184aArr = interfaceC11184aArr2;
        }
        return interfaceC11184aArr;
    }

    /* renamed from: a */
    public final void m83701a() {
        boolean z;
        synchronized (this.f35404b) {
            if (this.f35408f != null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "The image is closed.");
        }
    }

    @Override // androidx.camera.core.InterfaceC11183i, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f35404b) {
            m83701a();
            this.f35408f = null;
        }
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public Rect getCropRect() {
        Rect rect;
        synchronized (this.f35404b) {
            m83701a();
            rect = this.f35407e;
        }
        return rect;
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public int getFormat() {
        synchronized (this.f35404b) {
            m83701a();
        }
        return 1;
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public int getHeight() {
        int i;
        synchronized (this.f35404b) {
            m83701a();
            i = this.f35406d;
        }
        return i;
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public int getWidth() {
        int i;
        synchronized (this.f35404b) {
            m83701a();
            i = this.f35405c;
        }
        return i;
    }

    @Override // androidx.camera.core.InterfaceC11183i
    /* renamed from: i1 */
    public InterfaceC51066wX1 mo40428i1() {
        InterfaceC51066wX1 interfaceC51066wX1;
        synchronized (this.f35404b) {
            m83701a();
            interfaceC51066wX1 = this.f35409g;
        }
        return interfaceC51066wX1;
    }

    @Override // androidx.camera.core.InterfaceC11183i
    /* renamed from: k3 */
    public Image mo69479k3() {
        synchronized (this.f35404b) {
            m83701a();
        }
        return null;
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public void setCropRect(Rect rect) {
        synchronized (this.f35404b) {
            m83701a();
            if (rect != null) {
                this.f35407e.set(rect);
            }
        }
    }

    public TO4(Bitmap bitmap, Rect rect, int i, Matrix matrix, long j) {
        this(ImageUtil.m69226d(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i, matrix, j);
    }

    public TO4(ByteBuffer byteBuffer, int i, int i2, int i3, Rect rect, int i4, Matrix matrix, long j) {
        this.f35404b = new Object();
        this.f35405c = i2;
        this.f35406d = i3;
        this.f35407e = rect;
        this.f35409g = m83700b(j, i4, matrix);
        byteBuffer.rewind();
        this.f35408f = new InterfaceC11183i.InterfaceC11184a[]{m83699c(byteBuffer, i2 * i, i)};
    }
}
