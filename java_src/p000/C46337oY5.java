package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.material.tabs.TabLayout;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.android.AbstractC23451a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0003H\u0014R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, m28432d2 = {"LoY5;", "Lio/reactivex/Observable;", "Lcom/google/android/material/tabs/TabLayout$g;", "Lio/reactivex/D;", "observer", "", "subscribeActual", "Lcom/google/android/material/tabs/TabLayout;", "b", "Lcom/google/android/material/tabs/TabLayout;", "view", "<init>", "(Lcom/google/android/material/tabs/TabLayout;)V", C17296a.f69688o, "rxbinding-material_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: oY5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46337oY5 extends Observable<TabLayout.C17910g> {

    /* renamed from: b */
    public final TabLayout f102133b;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001f\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\r¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u001c\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LoY5$a;", "Lio/reactivex/android/a;", "Lcom/google/android/material/tabs/TabLayout$c;", "Lcom/google/android/material/tabs/TabLayout$g;", "", DateTokenConverter.CONVERTER_KEY, "tab", C17296a.f69688o, "b", "c", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lio/reactivex/D;", "Lio/reactivex/D;", "observer", "<init>", "(Lcom/google/android/material/tabs/TabLayout;Lio/reactivex/D;)V", "rxbinding-material_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: oY5$a */
    /* loaded from: classes6.dex */
    public static final class C27006a extends AbstractC23451a implements TabLayout.InterfaceC17905c<TabLayout.C17910g> {

        /* renamed from: c */
        public final TabLayout f102134c;

        /* renamed from: d */
        public final InterfaceC23436D<? super TabLayout.C17910g> f102135d;

        public C27006a(TabLayout tabLayout, InterfaceC23436D<? super TabLayout.C17910g> interfaceC23436D) {
            this.f102134c = tabLayout;
            this.f102135d = interfaceC23436D;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: a */
        public void mo20905a(TabLayout.C17910g c17910g) {
            if (!mo1769e()) {
                this.f102135d.onNext(c17910g);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: b */
        public void mo20904b(TabLayout.C17910g c17910g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: c */
        public void mo20903c(TabLayout.C17910g c17910g) {
        }

        @Override // io.reactivex.android.AbstractC23451a
        /* renamed from: d */
        public void mo15091d() {
            this.f102134c.m48802P(this);
        }
    }

    public C46337oY5(TabLayout tabLayout) {
        this.f102133b = tabLayout;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super TabLayout.C17910g> interfaceC23436D) {
        if (!GZ3.m105004a(interfaceC23436D)) {
            return;
        }
        C27006a c27006a = new C27006a(this.f102133b, interfaceC23436D);
        interfaceC23436D.onSubscribe(c27006a);
        this.f102133b.m48783g(c27006a);
        int m48815C = this.f102133b.m48815C();
        if (m48815C != -1) {
            TabLayout.C17910g m48814D = this.f102133b.m48814D(m48815C);
            if (m48814D == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(m48814D, "view.getTabAt(index)!!");
            interfaceC23436D.onNext(m48814D);
        }
    }
}
