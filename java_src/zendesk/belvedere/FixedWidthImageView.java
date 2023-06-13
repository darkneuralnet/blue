package zendesk.belvedere;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C42732iT3;
/* loaded from: classes8.dex */
public class FixedWidthImageView extends AppCompatImageView implements MY5 {

    /* renamed from: b */
    public int f121741b;

    /* renamed from: c */
    public int f121742c;

    /* renamed from: d */
    public int f121743d;

    /* renamed from: e */
    public int f121744e;

    /* renamed from: f */
    public Uri f121745f;

    /* renamed from: g */
    public C42732iT3 f121746g;

    /* renamed from: h */
    public final AtomicBoolean f121747h;

    /* renamed from: i */
    public InterfaceC31081c f121748i;

    /* renamed from: zendesk.belvedere.FixedWidthImageView$a */
    /* loaded from: classes8.dex */
    public class RunnableC31079a implements Runnable {
        public RunnableC31079a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FixedWidthImageView.this.requestLayout();
        }
    }

    /* renamed from: zendesk.belvedere.FixedWidthImageView$b */
    /* loaded from: classes8.dex */
    public static class C31080b {

        /* renamed from: a */
        public final int f121750a;

        /* renamed from: b */
        public final int f121751b;

        /* renamed from: c */
        public final int f121752c;

        /* renamed from: d */
        public final int f121753d;

        public C31080b(int i, int i2, int i3, int i4) {
            this.f121750a = i;
            this.f121751b = i2;
            this.f121752c = i3;
            this.f121753d = i4;
        }
    }

    /* renamed from: zendesk.belvedere.FixedWidthImageView$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC31081c {
        /* renamed from: a */
        void mo725a(C31080b c31080b);
    }

    public FixedWidthImageView(Context context) {
        super(context);
        this.f121741b = -1;
        this.f121742c = -1;
        this.f121745f = null;
        this.f121747h = new AtomicBoolean(false);
        init();
    }

    /* renamed from: c */
    public final void m843c(C42732iT3 c42732iT3, int i, int i2, Uri uri) {
        this.f121742c = i2;
        post(new RunnableC31079a());
        InterfaceC31081c interfaceC31081c = this.f121748i;
        if (interfaceC31081c != null) {
            interfaceC31081c.mo725a(new C31080b(this.f121744e, this.f121743d, this.f121742c, this.f121741b));
            this.f121748i = null;
        }
        c42732iT3.m33879j(uri).m107336k(i, i2).m107335l(C32627Ei6.m108564d(getContext(), C35874Sf4.belvedere_image_stream_item_radius)).m107340g(this);
    }

    /* renamed from: d */
    public final Pair<Integer, Integer> m842d(int i, int i2, int i3) {
        return Pair.create(Integer.valueOf(i), Integer.valueOf((int) (i3 * (i / i2))));
    }

    /* renamed from: e */
    public void m841e(C42732iT3 c42732iT3, Uri uri, long j, long j2, InterfaceC31081c interfaceC31081c) {
        if (uri != null && !uri.equals(this.f121745f)) {
            C42732iT3 c42732iT32 = this.f121746g;
            if (c42732iT32 != null) {
                c42732iT32.m33887b(this);
                this.f121746g.m33886c(this);
            }
            this.f121745f = uri;
            this.f121746g = c42732iT3;
            int i = (int) j;
            this.f121743d = i;
            int i2 = (int) j2;
            this.f121744e = i2;
            this.f121748i = interfaceC31081c;
            int i3 = this.f121741b;
            if (i3 > 0) {
                m839g(c42732iT3, uri, i3, i, i2);
                return;
            } else {
                this.f121747h.set(true);
                return;
            }
        }
        C31129i.m671a("FixedWidthImageView", "Image already loaded. " + uri);
    }

    /* renamed from: f */
    public void m840f(C42732iT3 c42732iT3, Uri uri, C31080b c31080b) {
        if (uri != null && !uri.equals(this.f121745f)) {
            C42732iT3 c42732iT32 = this.f121746g;
            if (c42732iT32 != null) {
                c42732iT32.m33887b(this);
                this.f121746g.m33886c(this);
            }
            this.f121745f = uri;
            this.f121746g = c42732iT3;
            this.f121743d = c31080b.f121751b;
            this.f121744e = c31080b.f121750a;
            this.f121742c = c31080b.f121752c;
            int i = c31080b.f121753d;
            this.f121741b = i;
            m839g(c42732iT3, uri, i, this.f121743d, this.f121744e);
            return;
        }
        C31129i.m671a("FixedWidthImageView", "Image already loaded. " + uri);
    }

    /* renamed from: g */
    public final void m839g(C42732iT3 c42732iT3, Uri uri, int i, int i2, int i3) {
        C31129i.m671a("FixedWidthImageView", "Start loading image: " + i + " " + i2 + " " + i3);
        if (i2 > 0 && i3 > 0) {
            Pair<Integer, Integer> m842d = m842d(i, i2, i3);
            m843c(c42732iT3, ((Integer) m842d.first).intValue(), ((Integer) m842d.second).intValue(), uri);
            return;
        }
        c42732iT3.m33879j(uri).m107341f(this);
    }

    public void init() {
        this.f121742c = getResources().getDimensionPixelOffset(C35874Sf4.belvedere_image_stream_image_height);
    }

    @Override // p000.MY5
    public void onBitmapFailed(Exception exc, Drawable drawable) {
    }

    @Override // p000.MY5
    public void onBitmapLoaded(Bitmap bitmap, C42732iT3.EnumC23266e enumC23266e) {
        this.f121744e = bitmap.getHeight();
        int width = bitmap.getWidth();
        this.f121743d = width;
        Pair<Integer, Integer> m842d = m842d(this.f121741b, width, this.f121744e);
        m843c(this.f121746g, ((Integer) m842d.first).intValue(), ((Integer) m842d.second).intValue(), this.f121745f);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f121742c, 1073741824);
        if (this.f121741b == -1) {
            this.f121741b = size;
        }
        int i3 = this.f121741b;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            if (this.f121747h.compareAndSet(true, false)) {
                m839g(this.f121746g, this.f121745f, this.f121741b, this.f121743d, this.f121744e);
            }
        }
        super.onMeasure(i, makeMeasureSpec);
    }

    @Override // p000.MY5
    public void onPrepareLoad(Drawable drawable) {
    }

    public FixedWidthImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121741b = -1;
        this.f121742c = -1;
        this.f121745f = null;
        this.f121747h = new AtomicBoolean(false);
        init();
    }

    public FixedWidthImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121741b = -1;
        this.f121742c = -1;
        this.f121745f = null;
        this.f121747h = new AtomicBoolean(false);
        init();
    }
}
