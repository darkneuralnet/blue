package p000;
/* renamed from: B41 */
/* loaded from: classes5.dex */
public abstract class B41 {

    /* renamed from: a */
    public static final B41 f1615a = new C0385a();

    /* renamed from: b */
    public static final B41 f1616b = new C0386b();

    /* renamed from: c */
    public static final B41 f1617c = new C0387c();

    /* renamed from: d */
    public static final B41 f1618d = new C0388d();

    /* renamed from: e */
    public static final B41 f1619e = new C0389e();

    /* renamed from: B41$a */
    /* loaded from: classes5.dex */
    public class C0385a extends B41 {
        @Override // p000.B41
        /* renamed from: a */
        public boolean mo114756a() {
            return true;
        }

        @Override // p000.B41
        /* renamed from: b */
        public boolean mo114755b() {
            return true;
        }

        @Override // p000.B41
        /* renamed from: c */
        public boolean mo114754c(ZS0 zs0) {
            return zs0 == ZS0.REMOTE;
        }

        @Override // p000.B41
        /* renamed from: d */
        public boolean mo114753d(boolean z, ZS0 zs0, EnumC41024fb1 enumC41024fb1) {
            return (zs0 == ZS0.RESOURCE_DISK_CACHE || zs0 == ZS0.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: B41$b */
    /* loaded from: classes5.dex */
    public class C0386b extends B41 {
        @Override // p000.B41
        /* renamed from: a */
        public boolean mo114756a() {
            return false;
        }

        @Override // p000.B41
        /* renamed from: b */
        public boolean mo114755b() {
            return false;
        }

        @Override // p000.B41
        /* renamed from: c */
        public boolean mo114754c(ZS0 zs0) {
            return false;
        }

        @Override // p000.B41
        /* renamed from: d */
        public boolean mo114753d(boolean z, ZS0 zs0, EnumC41024fb1 enumC41024fb1) {
            return false;
        }
    }

    /* renamed from: B41$c */
    /* loaded from: classes5.dex */
    public class C0387c extends B41 {
        @Override // p000.B41
        /* renamed from: a */
        public boolean mo114756a() {
            return true;
        }

        @Override // p000.B41
        /* renamed from: b */
        public boolean mo114755b() {
            return false;
        }

        @Override // p000.B41
        /* renamed from: c */
        public boolean mo114754c(ZS0 zs0) {
            return (zs0 == ZS0.DATA_DISK_CACHE || zs0 == ZS0.MEMORY_CACHE) ? false : true;
        }

        @Override // p000.B41
        /* renamed from: d */
        public boolean mo114753d(boolean z, ZS0 zs0, EnumC41024fb1 enumC41024fb1) {
            return false;
        }
    }

    /* renamed from: B41$d */
    /* loaded from: classes5.dex */
    public class C0388d extends B41 {
        @Override // p000.B41
        /* renamed from: a */
        public boolean mo114756a() {
            return false;
        }

        @Override // p000.B41
        /* renamed from: b */
        public boolean mo114755b() {
            return true;
        }

        @Override // p000.B41
        /* renamed from: c */
        public boolean mo114754c(ZS0 zs0) {
            return false;
        }

        @Override // p000.B41
        /* renamed from: d */
        public boolean mo114753d(boolean z, ZS0 zs0, EnumC41024fb1 enumC41024fb1) {
            return (zs0 == ZS0.RESOURCE_DISK_CACHE || zs0 == ZS0.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: B41$e */
    /* loaded from: classes5.dex */
    public class C0389e extends B41 {
        @Override // p000.B41
        /* renamed from: a */
        public boolean mo114756a() {
            return true;
        }

        @Override // p000.B41
        /* renamed from: b */
        public boolean mo114755b() {
            return true;
        }

        @Override // p000.B41
        /* renamed from: c */
        public boolean mo114754c(ZS0 zs0) {
            return zs0 == ZS0.REMOTE;
        }

        @Override // p000.B41
        /* renamed from: d */
        public boolean mo114753d(boolean z, ZS0 zs0, EnumC41024fb1 enumC41024fb1) {
            return ((z && zs0 == ZS0.DATA_DISK_CACHE) || zs0 == ZS0.LOCAL) && enumC41024fb1 == EnumC41024fb1.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo114756a();

    /* renamed from: b */
    public abstract boolean mo114755b();

    /* renamed from: c */
    public abstract boolean mo114754c(ZS0 zs0);

    /* renamed from: d */
    public abstract boolean mo114753d(boolean z, ZS0 zs0, EnumC41024fb1 enumC41024fb1);
}
