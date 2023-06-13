package p000;

import android.view.View;
import android.widget.Magnifier;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LNV3;", "LFV3;", "LaG2;", "style", "Landroid/view/View;", "view", "Lg01;", "density", "", "initialZoom", "LNV3$a;", "c", "", "Z", "b", "()Z", "canUpdateZoom", "<init>", "()V", C17296a.f69688o, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NV3 */
/* loaded from: classes.dex */
public final class NV3 implements FV3 {

    /* renamed from: b */
    public static final NV3 f24683b = new NV3();

    /* renamed from: c */
    public static final boolean f24684c = false;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J-\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u0013\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0017"}, m28432d2 = {"LNV3$a;", "LEV3;", "", "c", "LCe3;", "sourceCenter", "magnifierCenter", "", "zoom", "b", "(JJF)V", "dismiss", "Landroid/widget/Magnifier;", C17296a.f69688o, "Landroid/widget/Magnifier;", DateTokenConverter.CONVERTER_KEY, "()Landroid/widget/Magnifier;", "magnifier", "LG52;", "()J", "size", "<init>", "(Landroid/widget/Magnifier;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NV3$a */
    /* loaded from: classes.dex */
    public static class C5590a implements EV3 {

        /* renamed from: a */
        public final Magnifier f24685a;

        public C5590a(Magnifier magnifier) {
            Intrinsics.checkNotNullParameter(magnifier, "magnifier");
            this.f24685a = magnifier;
        }

        @Override // p000.EV3
        /* renamed from: a */
        public long mo93841a() {
            int width;
            int height;
            width = this.f24685a.getWidth();
            height = this.f24685a.getHeight();
            return H52.m104430a(width, height);
        }

        @Override // p000.EV3
        /* renamed from: b */
        public void mo74969b(long j, long j2, float f) {
            this.f24685a.show(C32120Ce3.m111944o(j), C32120Ce3.m111943p(j));
        }

        @Override // p000.EV3
        /* renamed from: c */
        public void mo93840c() {
            this.f24685a.update();
        }

        /* renamed from: d */
        public final Magnifier m93839d() {
            return this.f24685a;
        }

        @Override // p000.EV3
        public void dismiss() {
            this.f24685a.dismiss();
        }
    }

    private NV3() {
    }

    @Override // p000.FV3
    /* renamed from: b */
    public boolean mo74971b() {
        return f24684c;
    }

    @Override // p000.FV3
    /* renamed from: c */
    public C5590a mo74972a(C37853aG2 style, View view, InterfaceC41273g01 density, float f) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(density, "density");
        HV3.m103806a();
        return new C5590a(GV3.m105047a(view));
    }
}
