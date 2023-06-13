package p000;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p000.C45777nc0;
import p000.InterfaceC34196Lb0;
import p000.InterfaceC43988kb0;
/* renamed from: nc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45777nc0 implements InterfaceC43988kb0.InterfaceC25187a {

    /* renamed from: a */
    public final StringBuilder f100195a = new StringBuilder();

    /* renamed from: b */
    public final Object f100196b;

    /* renamed from: c */
    public int f100197c;

    /* renamed from: d */
    public final InterfaceC43988kb0 f100198d;

    /* renamed from: e */
    public final Map<InterfaceC45757na0, C26552a> f100199e;

    /* renamed from: f */
    public int f100200f;

    /* renamed from: nc0$a */
    /* loaded from: classes.dex */
    public static class C26552a {

        /* renamed from: a */
        public InterfaceC34196Lb0.EnumC5034a f100201a;

        /* renamed from: b */
        public final Executor f100202b;

        /* renamed from: c */
        public final InterfaceC26553b f100203c;

        /* renamed from: d */
        public final InterfaceC26554c f100204d;

        public C26552a(InterfaceC34196Lb0.EnumC5034a enumC5034a, Executor executor, InterfaceC26553b interfaceC26553b, InterfaceC26554c interfaceC26554c) {
            this.f100201a = enumC5034a;
            this.f100202b = executor;
            this.f100203c = interfaceC26553b;
            this.f100204d = interfaceC26554c;
        }

        /* renamed from: a */
        public InterfaceC34196Lb0.EnumC5034a m23442a() {
            return this.f100201a;
        }

        /* renamed from: b */
        public void m23441b() {
            try {
                Executor executor = this.f100202b;
                final InterfaceC26553b interfaceC26553b = this.f100203c;
                Objects.requireNonNull(interfaceC26553b);
                executor.execute(new Runnable() { // from class: mc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C45777nc0.InterfaceC26553b.this.mo23438a();
                    }
                });
            } catch (RejectedExecutionException e) {
                C33928Jx2.m99530d("CameraStateRegistry", "Unable to notify camera to configure.", e);
            }
        }

        /* renamed from: c */
        public void m23440c() {
            try {
                Executor executor = this.f100202b;
                final InterfaceC26554c interfaceC26554c = this.f100204d;
                Objects.requireNonNull(interfaceC26554c);
                executor.execute(new Runnable() { // from class: lc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C45777nc0.InterfaceC26554c.this.mo23437a();
                    }
                });
            } catch (RejectedExecutionException e) {
                C33928Jx2.m99530d("CameraStateRegistry", "Unable to notify camera to open.", e);
            }
        }

        /* renamed from: d */
        public InterfaceC34196Lb0.EnumC5034a m23439d(InterfaceC34196Lb0.EnumC5034a enumC5034a) {
            InterfaceC34196Lb0.EnumC5034a enumC5034a2 = this.f100201a;
            this.f100201a = enumC5034a;
            return enumC5034a2;
        }
    }

    /* renamed from: nc0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC26553b {
        /* renamed from: a */
        void mo23438a();
    }

    /* renamed from: nc0$c */
    /* loaded from: classes.dex */
    public interface InterfaceC26554c {
        /* renamed from: a */
        void mo23437a();
    }

    public C45777nc0(InterfaceC43988kb0 interfaceC43988kb0, int i) {
        Object obj = new Object();
        this.f100196b = obj;
        this.f100199e = new HashMap();
        this.f100197c = i;
        synchronized (obj) {
            this.f100198d = interfaceC43988kb0;
            this.f100200f = this.f100197c;
        }
    }

    /* renamed from: d */
    public static boolean m23450d(InterfaceC34196Lb0.EnumC5034a enumC5034a) {
        return enumC5034a != null && enumC5034a.m96605b();
    }

    @Override // p000.InterfaceC43988kb0.InterfaceC25187a
    /* renamed from: a */
    public void mo23453a(int i, int i2) {
        int i3;
        boolean z;
        synchronized (this.f100196b) {
            boolean z2 = true;
            if (i2 == 2) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            this.f100197c = i3;
            if (i != 2 && i2 == 2) {
                z = true;
            } else {
                z = false;
            }
            if (i != 2 || i2 == 2) {
                z2 = false;
            }
            if (z || z2) {
                m23448f();
            }
        }
    }

    /* renamed from: b */
    public final C26552a m23452b(String str) {
        for (InterfaceC45757na0 interfaceC45757na0 : this.f100199e.keySet()) {
            if (str.equals(((InterfaceC33962Kb0) interfaceC45757na0.mo23505b()).mo98721a())) {
                return this.f100199e.get(interfaceC45757na0);
            }
        }
        return null;
    }

    /* renamed from: c */
    public boolean m23451c() {
        synchronized (this.f100196b) {
            for (Map.Entry<InterfaceC45757na0, C26552a> entry : this.f100199e.entrySet()) {
                if (entry.getValue().m23442a() == InterfaceC34196Lb0.EnumC5034a.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m23449e(InterfaceC45757na0 interfaceC45757na0, InterfaceC34196Lb0.EnumC5034a enumC5034a, boolean z) {
        InterfaceC34196Lb0.EnumC5034a m23443k;
        C26552a c26552a;
        synchronized (this.f100196b) {
            int i = this.f100200f;
            if (enumC5034a == InterfaceC34196Lb0.EnumC5034a.RELEASED) {
                m23443k = m23444j(interfaceC45757na0);
            } else {
                m23443k = m23443k(interfaceC45757na0, enumC5034a);
            }
            if (m23443k == enumC5034a) {
                return;
            }
            HashMap hashMap = null;
            if (this.f100198d.mo13004c() == 2 && enumC5034a == InterfaceC34196Lb0.EnumC5034a.CONFIGURED) {
                String mo13005b = this.f100198d.mo13005b(((InterfaceC33962Kb0) interfaceC45757na0.mo23505b()).mo98721a());
                if (mo13005b != null) {
                    c26552a = m23452b(mo13005b);
                    if (i >= 1 && this.f100200f > 0) {
                        hashMap = new HashMap();
                        for (Map.Entry<InterfaceC45757na0, C26552a> entry : this.f100199e.entrySet()) {
                            if (entry.getValue().m23442a() == InterfaceC34196Lb0.EnumC5034a.PENDING_OPEN) {
                                hashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    } else if (enumC5034a == InterfaceC34196Lb0.EnumC5034a.PENDING_OPEN && this.f100200f > 0) {
                        hashMap = new HashMap();
                        hashMap.put(interfaceC45757na0, this.f100199e.get(interfaceC45757na0));
                    }
                    if (hashMap != null && !z) {
                        hashMap.remove(interfaceC45757na0);
                    }
                    if (hashMap != null) {
                        for (C26552a c26552a2 : hashMap.values()) {
                            c26552a2.m23440c();
                        }
                    }
                    if (c26552a == null) {
                        c26552a.m23441b();
                        return;
                    }
                    return;
                }
            }
            c26552a = null;
            if (i >= 1) {
            }
            if (enumC5034a == InterfaceC34196Lb0.EnumC5034a.PENDING_OPEN) {
                hashMap = new HashMap();
                hashMap.put(interfaceC45757na0, this.f100199e.get(interfaceC45757na0));
            }
            if (hashMap != null) {
                hashMap.remove(interfaceC45757na0);
            }
            if (hashMap != null) {
            }
            if (c26552a == null) {
            }
        }
    }

    /* renamed from: f */
    public final void m23448f() {
        String str;
        if (C33928Jx2.m99528f("CameraStateRegistry")) {
            this.f100195a.setLength(0);
            this.f100195a.append("Recalculating open cameras:\n");
            this.f100195a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f100195a.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry<InterfaceC45757na0, C26552a> entry : this.f100199e.entrySet()) {
            if (C33928Jx2.m99528f("CameraStateRegistry")) {
                if (entry.getValue().m23442a() != null) {
                    str = entry.getValue().m23442a().toString();
                } else {
                    str = "UNKNOWN";
                }
                this.f100195a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), str));
            }
            if (m23450d(entry.getValue().m23442a())) {
                i++;
            }
        }
        if (C33928Jx2.m99528f("CameraStateRegistry")) {
            this.f100195a.append("-------------------------------------------------------------------\n");
            this.f100195a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.f100197c)));
            C33928Jx2.m99533a("CameraStateRegistry", this.f100195a.toString());
        }
        this.f100200f = Math.max(this.f100197c - i, 0);
    }

    /* renamed from: g */
    public void m23447g(InterfaceC45757na0 interfaceC45757na0, Executor executor, InterfaceC26553b interfaceC26553b, InterfaceC26554c interfaceC26554c) {
        boolean z;
        synchronized (this.f100196b) {
            if (!this.f100199e.containsKey(interfaceC45757na0)) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "Camera is already registered: " + interfaceC45757na0);
            this.f100199e.put(interfaceC45757na0, new C26552a(null, executor, interfaceC26553b, interfaceC26554c));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:14:0x0069, B:16:0x0071, B:20:0x0080, B:22:0x0096, B:23:0x0099, B:13:0x0063), top: B:28:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:14:0x0069, B:16:0x0071, B:20:0x0080, B:22:0x0096, B:23:0x0099, B:13:0x0063), top: B:28:0x0003 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m23446h(InterfaceC45757na0 interfaceC45757na0) {
        boolean z;
        String str;
        synchronized (this.f100196b) {
            C26552a c26552a = (C26552a) HZ3.m103730h(this.f100199e.get(interfaceC45757na0), "Camera must first be registered with registerCamera()");
            if (C33928Jx2.m99528f("CameraStateRegistry")) {
                this.f100195a.setLength(0);
                this.f100195a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC45757na0, Integer.valueOf(this.f100200f), Boolean.valueOf(m23450d(c26552a.m23442a())), c26552a.m23442a()));
            }
            if (this.f100200f <= 0 && !m23450d(c26552a.m23442a())) {
                z = false;
                if (C33928Jx2.m99528f("CameraStateRegistry")) {
                    StringBuilder sb = this.f100195a;
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    if (z) {
                        str = "SUCCESS";
                    } else {
                        str = "FAIL";
                    }
                    objArr[0] = str;
                    sb.append(String.format(locale, " --> %s", objArr));
                    C33928Jx2.m99533a("CameraStateRegistry", this.f100195a.toString());
                }
                if (z) {
                    m23448f();
                }
            }
            c26552a.m23439d(InterfaceC34196Lb0.EnumC5034a.OPENING);
            z = true;
            if (C33928Jx2.m99528f("CameraStateRegistry")) {
            }
            if (z) {
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059 A[ADDED_TO_REGION] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m23445i(String str, String str2) {
        InterfaceC34196Lb0.EnumC5034a enumC5034a;
        boolean z;
        boolean z2;
        synchronized (this.f100196b) {
            boolean z3 = true;
            if (this.f100198d.mo13004c() != 2) {
                return true;
            }
            InterfaceC34196Lb0.EnumC5034a enumC5034a2 = null;
            if (m23452b(str) != null) {
                enumC5034a = m23452b(str).m23442a();
            } else {
                enumC5034a = null;
            }
            if (str2 != null && m23452b(str2) != null) {
                enumC5034a2 = m23452b(str2).m23442a();
            }
            InterfaceC34196Lb0.EnumC5034a enumC5034a3 = InterfaceC34196Lb0.EnumC5034a.OPEN;
            if (!enumC5034a3.equals(enumC5034a) && !InterfaceC34196Lb0.EnumC5034a.CONFIGURED.equals(enumC5034a)) {
                z = false;
                if (!enumC5034a3.equals(enumC5034a2) && !InterfaceC34196Lb0.EnumC5034a.CONFIGURED.equals(enumC5034a2)) {
                    z2 = false;
                    if (z || !z2) {
                        z3 = false;
                    }
                    return z3;
                }
                z2 = true;
                if (z) {
                }
                z3 = false;
                return z3;
            }
            z = true;
            if (!enumC5034a3.equals(enumC5034a2)) {
                z2 = false;
                if (z) {
                }
                z3 = false;
                return z3;
            }
            z2 = true;
            if (z) {
            }
            z3 = false;
            return z3;
        }
    }

    /* renamed from: j */
    public final InterfaceC34196Lb0.EnumC5034a m23444j(InterfaceC45757na0 interfaceC45757na0) {
        C26552a remove = this.f100199e.remove(interfaceC45757na0);
        if (remove != null) {
            m23448f();
            return remove.m23442a();
        }
        return null;
    }

    /* renamed from: k */
    public final InterfaceC34196Lb0.EnumC5034a m23443k(InterfaceC45757na0 interfaceC45757na0, InterfaceC34196Lb0.EnumC5034a enumC5034a) {
        boolean z;
        InterfaceC34196Lb0.EnumC5034a m23439d = ((C26552a) HZ3.m103730h(this.f100199e.get(interfaceC45757na0), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).m23439d(enumC5034a);
        InterfaceC34196Lb0.EnumC5034a enumC5034a2 = InterfaceC34196Lb0.EnumC5034a.OPENING;
        if (enumC5034a == enumC5034a2) {
            if (!m23450d(enumC5034a) && m23439d != enumC5034a2) {
                z = false;
            } else {
                z = true;
            }
            HZ3.m103728j(z, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (m23439d != enumC5034a) {
            m23448f();
        }
        return m23439d;
    }
}
