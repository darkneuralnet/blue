package p000;

import com.polidea.rxandroidble2.scan.ScanFilter;
import com.polidea.rxandroidble2.scan.ScanSettings;
import io.reactivex.InterfaceC23435C;
import io.reactivex.Observable;
/* renamed from: dl5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39943dl5 implements InterfaceC39332cl5 {

    /* renamed from: a */
    public final C46978pd5 f77174a;

    /* renamed from: b */
    public final C49635u62 f77175b;

    /* renamed from: c */
    public final C37558Zk5 f77176c;

    /* renamed from: dl5$a */
    /* loaded from: classes6.dex */
    public class C19852a implements InterfaceC23435C<C51730xe5, C51730xe5> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC23435C f77177a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC23435C f77178b;

        public C19852a(InterfaceC23435C interfaceC23435C, InterfaceC23435C interfaceC23435C2) {
            this.f77177a = interfaceC23435C;
            this.f77178b = interfaceC23435C2;
        }

        @Override // io.reactivex.InterfaceC23435C
        /* renamed from: a */
        public Observable<C51730xe5> apply(Observable<C51730xe5> observable) {
            return observable.compose(this.f77177a).compose(this.f77178b);
        }
    }

    public C39943dl5(C46978pd5 c46978pd5, C49635u62 c49635u62, C37558Zk5 c37558Zk5) {
        this.f77174a = c46978pd5;
        this.f77175b = c49635u62;
        this.f77176c = c37558Zk5;
    }

    @Override // p000.InterfaceC39332cl5
    /* renamed from: a */
    public C38739bl5 mo35887a(ScanSettings scanSettings, ScanFilter... scanFilterArr) {
        return new C38739bl5(new C47641qk5(this.f77174a, this.f77175b, new C36996Xa1(scanFilterArr)), new C19852a(this.f77176c.m72584b(scanSettings.m45827h()), this.f77176c.m72585a(scanSettings.m45832b())));
    }
}
