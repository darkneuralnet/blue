package p000;

import io.reactivex.subjects.C24567g;
import java.util.List;
import p000.U23;
/* renamed from: vM0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50373vM0 {

    /* renamed from: vM0$a */
    /* loaded from: classes2.dex */
    public static final class C29483a implements U23.InterfaceC8181a {
        @Override // p000.U23.InterfaceC8181a
        /* renamed from: a */
        public U23 mo8881a(InterfaceC44393lG2 interfaceC44393lG2, C24567g<List<String>> c24567g) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(c24567g);
            return new C29484b(interfaceC44393lG2, c24567g);
        }

        private C29483a() {
        }
    }

    /* renamed from: vM0$b */
    /* loaded from: classes2.dex */
    public static final class C29484b implements U23 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f113880a;

        /* renamed from: b */
        public final C24567g<List<String>> f113881b;

        /* renamed from: c */
        public final C29484b f113882c;

        @Override // p000.U23
        /* renamed from: a */
        public void mo8880a(X23 x23) {
            m8879b(x23);
        }

        /* renamed from: b */
        public final X23 m8879b(X23 x23) {
            Y23.m75802b(x23, m8878c());
            return x23;
        }

        /* renamed from: c */
        public final C42491i33 m8878c() {
            return new C42491i33((InterfaceC46473om3) C51679xZ3.m5003d(this.f113880a.mo27584F0()), this.f113881b);
        }

        public C29484b(InterfaceC44393lG2 interfaceC44393lG2, C24567g<List<String>> c24567g) {
            this.f113882c = this;
            this.f113880a = interfaceC44393lG2;
            this.f113881b = c24567g;
        }
    }

    private C50373vM0() {
    }

    /* renamed from: a */
    public static U23.InterfaceC8181a m8882a() {
        return new C29483a();
    }
}
