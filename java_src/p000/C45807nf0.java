package p000;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11208l;
import androidx.camera.core.impl.InterfaceC11212p;
import p000.C45807nf0;
/* renamed from: nf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C45807nf0 implements InterfaceC11212p {

    /* renamed from: E */
    public final InterfaceC11197f f100281E;

    /* renamed from: nf0$a */
    /* loaded from: classes.dex */
    public static final class C26566a implements InterfaceC32388Di1<C45807nf0> {

        /* renamed from: a */
        public final C11209m f100282a = C11209m.m69372V();

        /* renamed from: e */
        public static C26566a m23349e(final InterfaceC11197f interfaceC11197f) {
            final C26566a c26566a = new C26566a();
            interfaceC11197f.mo69362b("camera2.captureRequest.option.", new InterfaceC11197f.InterfaceC11199b() { // from class: mf0
                @Override // androidx.camera.core.impl.InterfaceC11197f.InterfaceC11199b
                /* renamed from: a */
                public final boolean mo25218a(InterfaceC11197f.AbstractC11198a abstractC11198a) {
                    boolean m23348f;
                    m23348f = C45807nf0.C26566a.m23348f(C45807nf0.C26566a.this, interfaceC11197f, abstractC11198a);
                    return m23348f;
                }
            });
            return c26566a;
        }

        /* renamed from: f */
        public static /* synthetic */ boolean m23348f(C26566a c26566a, InterfaceC11197f interfaceC11197f, InterfaceC11197f.AbstractC11198a abstractC11198a) {
            c26566a.mo1343b().mo69369n(abstractC11198a, interfaceC11197f.mo69356h(abstractC11198a), interfaceC11197f.mo69363a(abstractC11198a));
            return true;
        }

        @Override // p000.InterfaceC32388Di1
        /* renamed from: b */
        public InterfaceC11208l mo1343b() {
            return this.f100282a;
        }

        /* renamed from: c */
        public C45807nf0 m23350c() {
            return new C45807nf0(C11210n.m69366T(this.f100282a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public <ValueT> C26566a m23347g(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f100282a.mo69373C(C43385ja0.m30310R(key), valuet);
            return this;
        }
    }

    public C45807nf0(InterfaceC11197f interfaceC11197f) {
        this.f100281E = interfaceC11197f;
    }

    @Override // androidx.camera.core.impl.InterfaceC11212p
    /* renamed from: B */
    public InterfaceC11197f mo1036B() {
        return this.f100281E;
    }
}
