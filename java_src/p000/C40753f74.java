package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.C11164h;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import androidx.camera.core.impl.InterfaceC11195e;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* renamed from: f74  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40753f74 {

    /* renamed from: a */
    public final C11164h.C11180n f79495a;

    /* renamed from: b */
    public final Rect f79496b;

    /* renamed from: c */
    public final int f79497c;

    /* renamed from: d */
    public final int f79498d;

    /* renamed from: e */
    public final Matrix f79499e;

    /* renamed from: f */
    public final BY5 f79500f;

    /* renamed from: g */
    public final String f79501g;

    /* renamed from: h */
    public final List<Integer> f79502h = new ArrayList();

    /* renamed from: i */
    public final ListenableFuture<Void> f79503i;

    public C40753f74(InterfaceC37499Ze0 interfaceC37499Ze0, C11164h.C11180n c11180n, Rect rect, int i, int i2, Matrix matrix, BY5 by5, ListenableFuture<Void> listenableFuture) {
        this.f79495a = c11180n;
        this.f79498d = i2;
        this.f79497c = i;
        this.f79496b = rect;
        this.f79499e = matrix;
        this.f79500f = by5;
        this.f79501g = String.valueOf(interfaceC37499Ze0.hashCode());
        List<InterfaceC11195e> mo70909a = interfaceC37499Ze0.mo70909a();
        Objects.requireNonNull(mo70909a);
        for (InterfaceC11195e interfaceC11195e : mo70909a) {
            this.f79502h.add(Integer.valueOf(interfaceC11195e.getId()));
        }
        this.f79503i = listenableFuture;
    }

    /* renamed from: a */
    public ListenableFuture<Void> m41992a() {
        return this.f79503i;
    }

    /* renamed from: b */
    public Rect m41991b() {
        return this.f79496b;
    }

    /* renamed from: c */
    public int m41990c() {
        return this.f79498d;
    }

    /* renamed from: d */
    public C11164h.C11180n m41989d() {
        return this.f79495a;
    }

    /* renamed from: e */
    public int m41988e() {
        return this.f79497c;
    }

    /* renamed from: f */
    public Matrix m41987f() {
        return this.f79499e;
    }

    /* renamed from: g */
    public List<Integer> m41986g() {
        return this.f79502h;
    }

    /* renamed from: h */
    public String m41985h() {
        return this.f79501g;
    }

    /* renamed from: i */
    public boolean m41984i() {
        return this.f79500f.mo17627c();
    }

    /* renamed from: j */
    public boolean m41983j() {
        return m41989d() == null;
    }

    /* renamed from: k */
    public void m41982k(ImageCaptureException imageCaptureException) {
        this.f79500f.mo17624f(imageCaptureException);
    }

    /* renamed from: l */
    public void m41981l(C11164h.C11182o c11182o) {
        this.f79500f.mo17625e(c11182o);
    }

    /* renamed from: m */
    public void m41980m(InterfaceC11183i interfaceC11183i) {
        this.f79500f.mo17628b(interfaceC11183i);
    }

    /* renamed from: n */
    public void m41979n() {
        this.f79500f.mo17626d();
    }

    /* renamed from: o */
    public void m41978o(ImageCaptureException imageCaptureException) {
        this.f79500f.mo17629a(imageCaptureException);
    }
}
