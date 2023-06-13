package co.bird.android.feature.complaintresolution;

import android.content.Context;
import co.bird.android.feature.complaintresolution.InterfaceC14736a;
import java.util.List;
/* renamed from: co.bird.android.feature.complaintresolution.b */
/* loaded from: classes3.dex */
public final class C14740b {

    /* renamed from: co.bird.android.feature.complaintresolution.b$a */
    /* loaded from: classes3.dex */
    public static final class C14741a implements InterfaceC14736a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63718a;

        /* renamed from: b */
        public final List<String> f63719b;

        /* renamed from: c */
        public final C14741a f63720c;

        @Override // co.bird.android.feature.complaintresolution.InterfaceC14736a
        /* renamed from: a */
        public void mo58420a(ComplaintResolutionActivity complaintResolutionActivity) {
            m58417d(complaintResolutionActivity);
        }

        /* renamed from: b */
        public final C33629Iq0 m58419b() {
            return new C33629Iq0((Context) C51679xZ3.m5003d(this.f63718a.mo27552R1()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f63718a.mo27584F0()));
        }

        /* renamed from: c */
        public final C53041zr0 m58418c() {
            return new C53041zr0(this.f63719b, (InterfaceC46473om3) C51679xZ3.m5003d(this.f63718a.mo27584F0()), m58419b(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f63718a.mo27461w2()));
        }

        /* renamed from: d */
        public final ComplaintResolutionActivity m58417d(ComplaintResolutionActivity complaintResolutionActivity) {
            C4650Ky.m98043b(complaintResolutionActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63718a.mo27461w2()));
            C4650Ky.m98042c(complaintResolutionActivity, (C22454gl) C51679xZ3.m5003d(this.f63718a.mo27479r()));
            C4650Ky.m98041d(complaintResolutionActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63718a.mo27595B1()));
            C51252wq0.m6273b(complaintResolutionActivity, m58418c());
            return complaintResolutionActivity;
        }

        public C14741a(InterfaceC44393lG2 interfaceC44393lG2, List<String> list) {
            this.f63720c = this;
            this.f63718a = interfaceC44393lG2;
            this.f63719b = list;
        }
    }

    /* renamed from: co.bird.android.feature.complaintresolution.b$b */
    /* loaded from: classes3.dex */
    public static final class C14742b implements InterfaceC14736a.InterfaceC14737a {
        @Override // co.bird.android.feature.complaintresolution.InterfaceC14736a.InterfaceC14737a
        /* renamed from: a */
        public InterfaceC14736a mo58416a(InterfaceC44393lG2 interfaceC44393lG2, List<String> list) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(list);
            return new C14741a(interfaceC44393lG2, list);
        }

        private C14742b() {
        }
    }

    private C14740b() {
    }

    /* renamed from: a */
    public static InterfaceC14736a.InterfaceC14737a m58421a() {
        return new C14742b();
    }
}
