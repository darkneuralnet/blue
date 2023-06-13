package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p000.AbstractC43405jc0;
import p000.J90;
/* renamed from: J90 */
/* loaded from: classes.dex */
public final class J90 implements InterfaceC33962Kb0 {

    /* renamed from: a */
    public final String f16886a;

    /* renamed from: b */
    public final C36761Wa0 f16887b;

    /* renamed from: c */
    public final H90 f16888c;

    /* renamed from: e */
    public C47885r90 f16890e;

    /* renamed from: h */
    public final C3901a<AbstractC43405jc0> f16893h;

    /* renamed from: j */
    public final C36099Te4 f16895j;

    /* renamed from: k */
    public final InterfaceC43999kc1 f16896k;

    /* renamed from: l */
    public final C35600Rb0 f16897l;

    /* renamed from: d */
    public final Object f16889d = new Object();

    /* renamed from: f */
    public C3901a<Integer> f16891f = null;

    /* renamed from: g */
    public C3901a<InterfaceC47389qJ6> f16892g = null;

    /* renamed from: i */
    public List<Pair<AbstractC46943pa0, Executor>> f16894i = null;

    /* renamed from: J90$a */
    /* loaded from: classes.dex */
    public static class C3901a<T> extends MP2<T> {

        /* renamed from: b */
        public LiveData<T> f16898b;

        /* renamed from: c */
        public final T f16899c;

        public C3901a(T t) {
            this.f16899c = t;
        }

        @Override // p000.MP2
        /* renamed from: b */
        public <S> void mo95315b(LiveData<S> liveData, InterfaceC41056fe3<? super S> interfaceC41056fe3) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public void m101082d(LiveData<T> liveData) {
            LiveData liveData2 = (LiveData<T>) this.f16898b;
            if (liveData2 != null) {
                super.m95314c(liveData2);
            }
            this.f16898b = liveData;
            super.mo95315b(liveData, new InterfaceC41056fe3() { // from class: I90
                @Override // p000.InterfaceC41056fe3
                public final void onChanged(Object obj) {
                    J90.C3901a.this.setValue(obj);
                }
            });
        }

        @Override // androidx.lifecycle.LiveData
        public T getValue() {
            LiveData<T> liveData = this.f16898b;
            return liveData == null ? this.f16899c : liveData.getValue();
        }
    }

    public J90(String str, C35600Rb0 c35600Rb0) throws CameraAccessExceptionCompat {
        String str2 = (String) HZ3.m103731g(str);
        this.f16886a = str2;
        this.f16897l = c35600Rb0;
        C36761Wa0 m86590c = c35600Rb0.m86590c(str2);
        this.f16887b = m86590c;
        this.f16888c = new H90(this);
        this.f16895j = C40440ec0.m42726a(str, m86590c);
        this.f16896k = new C42792ia0(str);
        this.f16893h = new C3901a<>(AbstractC43405jc0.m30210a(AbstractC43405jc0.EnumC24957b.CLOSED));
    }

    @Override // p000.InterfaceC33962Kb0
    /* renamed from: a */
    public String mo98721a() {
        return this.f16886a;
    }

    @Override // p000.InterfaceC33728Jb0
    /* renamed from: b */
    public int mo100139b() {
        boolean z;
        Integer num = (Integer) this.f16887b.m78176a(CameraCharacteristics.LENS_FACING);
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "Unable to get the lens facing of the camera.");
        return C45326mq2.m24862a(num.intValue());
    }

    @Override // p000.InterfaceC33962Kb0
    /* renamed from: c */
    public void mo98720c(Executor executor, AbstractC46943pa0 abstractC46943pa0) {
        synchronized (this.f16889d) {
            C47885r90 c47885r90 = this.f16890e;
            if (c47885r90 == null) {
                if (this.f16894i == null) {
                    this.f16894i = new ArrayList();
                }
                this.f16894i.add(new Pair<>(abstractC46943pa0, executor));
                return;
            }
            c47885r90.m16371w(executor, abstractC46943pa0);
        }
    }

    @Override // p000.InterfaceC33962Kb0
    /* renamed from: d */
    public void mo98719d(AbstractC46943pa0 abstractC46943pa0) {
        synchronized (this.f16889d) {
            C47885r90 c47885r90 = this.f16890e;
            if (c47885r90 == null) {
                List<Pair<AbstractC46943pa0, Executor>> list = this.f16894i;
                if (list == null) {
                    return;
                }
                Iterator<Pair<AbstractC46943pa0, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == abstractC46943pa0) {
                        it.remove();
                    }
                }
                return;
            }
            c47885r90.m16399e0(abstractC46943pa0);
        }
    }

    @Override // p000.InterfaceC33728Jb0
    /* renamed from: e */
    public int mo100138e(int i) {
        int m101089r = m101089r();
        int m71099b = C38051ac0.m71099b(i);
        boolean z = true;
        if (1 != mo100139b()) {
            z = false;
        }
        return C38051ac0.m71100a(m71099b, m101089r, z);
    }

    @Override // p000.InterfaceC33728Jb0
    /* renamed from: f */
    public boolean mo100137f() {
        if (m101087t() && S21.m86079a(C51538xJ6.class) == null) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC33962Kb0
    /* renamed from: g */
    public InterfaceC43999kc1 mo98718g() {
        return this.f16896k;
    }

    @Override // p000.InterfaceC33728Jb0
    /* renamed from: h */
    public LiveData<InterfaceC47389qJ6> mo100136h() {
        synchronized (this.f16889d) {
            C47885r90 c47885r90 = this.f16890e;
            if (c47885r90 == null) {
                if (this.f16892g == null) {
                    this.f16892g = new C3901a<>(C46203oJ6.m21365h(this.f16887b));
                }
                return this.f16892g;
            }
            C3901a<InterfaceC47389qJ6> c3901a = this.f16892g;
            if (c3901a != null) {
                return c3901a;
            }
            return c47885r90.m16422M().m21363j();
        }
    }

    @Override // p000.InterfaceC33728Jb0
    /* renamed from: i */
    public int mo100135i() {
        return mo100138e(0);
    }

    @Override // p000.InterfaceC33962Kb0
    /* renamed from: j */
    public List<Size> mo98717j(int i) {
        Size[] m19306a = this.f16887b.m78175b().m19306a(i);
        if (m19306a != null) {
            return Arrays.asList(m19306a);
        }
        return Collections.emptyList();
    }

    @Override // p000.InterfaceC33962Kb0
    /* renamed from: k */
    public C36099Te4 mo98716k() {
        return this.f16895j;
    }

    @Override // p000.InterfaceC33962Kb0
    /* renamed from: l */
    public List<Size> mo98715l(int i) {
        Size[] m19305b = this.f16887b.m78175b().m19305b(i);
        if (m19305b != null) {
            return Arrays.asList(m19305b);
        }
        return Collections.emptyList();
    }

    @Override // p000.InterfaceC33728Jb0
    /* renamed from: m */
    public LiveData<Integer> mo100134m() {
        synchronized (this.f16889d) {
            C47885r90 c47885r90 = this.f16890e;
            if (c47885r90 == null) {
                if (this.f16891f == null) {
                    this.f16891f = new C3901a<>(0);
                }
                return this.f16891f;
            }
            C3901a<Integer> c3901a = this.f16891f;
            if (c3901a != null) {
                return c3901a;
            }
            return c47885r90.m16424K().m81985f();
        }
    }

    @Override // p000.InterfaceC33962Kb0
    /* renamed from: n */
    public EnumC47841r46 mo98714n() {
        Integer num = (Integer) this.f16887b.m78176a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        HZ3.m103731g(num);
        if (num.intValue() != 1) {
            return EnumC47841r46.UPTIME;
        }
        return EnumC47841r46.REALTIME;
    }

    @Override // p000.InterfaceC33728Jb0
    /* renamed from: o */
    public String mo100133o() {
        return m101088s() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    /* renamed from: p */
    public H90 m101091p() {
        return this.f16888c;
    }

    /* renamed from: q */
    public C36761Wa0 m101090q() {
        return this.f16887b;
    }

    /* renamed from: r */
    public int m101089r() {
        Integer num = (Integer) this.f16887b.m78176a(CameraCharacteristics.SENSOR_ORIENTATION);
        HZ3.m103731g(num);
        return num.intValue();
    }

    /* renamed from: s */
    public int m101088s() {
        Integer num = (Integer) this.f16887b.m78176a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        HZ3.m103731g(num);
        return num.intValue();
    }

    /* renamed from: t */
    public boolean m101087t() {
        return C52724zJ6.m1539a(this.f16887b, 4);
    }

    /* renamed from: u */
    public void m101086u(C47885r90 c47885r90) {
        synchronized (this.f16889d) {
            this.f16890e = c47885r90;
            C3901a<InterfaceC47389qJ6> c3901a = this.f16892g;
            if (c3901a != null) {
                c3901a.m101082d(c47885r90.m16422M().m21363j());
            }
            C3901a<Integer> c3901a2 = this.f16891f;
            if (c3901a2 != null) {
                c3901a2.m101082d(this.f16890e.m16424K().m81985f());
            }
            List<Pair<AbstractC46943pa0, Executor>> list = this.f16894i;
            if (list != null) {
                for (Pair<AbstractC46943pa0, Executor> pair : list) {
                    this.f16890e.m16371w((Executor) pair.second, (AbstractC46943pa0) pair.first);
                }
                this.f16894i = null;
            }
        }
        m101085v();
    }

    /* renamed from: v */
    public final void m101085v() {
        m101084w();
    }

    /* renamed from: w */
    public final void m101084w() {
        String str;
        int m101088s = m101088s();
        if (m101088s != 0) {
            if (m101088s != 1) {
                if (m101088s != 2) {
                    if (m101088s != 3) {
                        if (m101088s != 4) {
                            str = "Unknown value: " + m101088s;
                        } else {
                            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
                        }
                    } else {
                        str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                    }
                } else {
                    str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                }
            } else {
                str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
            }
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        }
        C33928Jx2.m99529e("Camera2CameraInfo", "Device Level: " + str);
    }

    /* renamed from: x */
    public void m101083x(LiveData<AbstractC43405jc0> liveData) {
        this.f16893h.m101082d(liveData);
    }
}
