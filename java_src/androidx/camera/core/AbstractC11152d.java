package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC11183i;
import java.util.HashSet;
import java.util.Set;
/* renamed from: androidx.camera.core.d */
/* loaded from: classes.dex */
public abstract class AbstractC11152d implements InterfaceC11183i {

    /* renamed from: c */
    public final InterfaceC11183i f52444c;

    /* renamed from: b */
    public final Object f52443b = new Object();

    /* renamed from: d */
    public final Set<InterfaceC11153a> f52445d = new HashSet();

    /* renamed from: androidx.camera.core.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11153a {
        /* renamed from: f */
        void mo43878f(InterfaceC11183i interfaceC11183i);
    }

    public AbstractC11152d(InterfaceC11183i interfaceC11183i) {
        this.f52444c = interfaceC11183i;
    }

    @Override // androidx.camera.core.InterfaceC11183i
    /* renamed from: A0 */
    public InterfaceC11183i.InterfaceC11184a[] mo69480A0() {
        return this.f52444c.mo69480A0();
    }

    /* renamed from: a */
    public void m69639a(InterfaceC11153a interfaceC11153a) {
        synchronized (this.f52443b) {
            this.f52445d.add(interfaceC11153a);
        }
    }

    /* renamed from: b */
    public void m69638b() {
        HashSet<InterfaceC11153a> hashSet;
        synchronized (this.f52443b) {
            hashSet = new HashSet(this.f52445d);
        }
        for (InterfaceC11153a interfaceC11153a : hashSet) {
            interfaceC11153a.mo43878f(this);
        }
    }

    @Override // androidx.camera.core.InterfaceC11183i, java.lang.AutoCloseable
    public void close() {
        this.f52444c.close();
        m69638b();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public Rect getCropRect() {
        return this.f52444c.getCropRect();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public int getFormat() {
        return this.f52444c.getFormat();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public int getHeight() {
        return this.f52444c.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public int getWidth() {
        return this.f52444c.getWidth();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    /* renamed from: i1 */
    public InterfaceC51066wX1 mo40428i1() {
        return this.f52444c.mo40428i1();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    /* renamed from: k3 */
    public Image mo69479k3() {
        return this.f52444c.mo69479k3();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public void setCropRect(Rect rect) {
        this.f52444c.setCropRect(rect);
    }
}
