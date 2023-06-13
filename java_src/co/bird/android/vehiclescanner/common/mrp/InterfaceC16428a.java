package co.bird.android.vehiclescanner.common.mrp;

import co.bird.android.model.constant.PartKind;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m28432d2 = {"Lco/bird/android/vehiclescanner/common/mrp/a;", "S", "Lrx4;", "Lio/reactivex/Observable;", "", "T", "", "G", "LRk5;", "w1", "()LRk5;", "rendererDelegate", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.vehiclescanner.common.mrp.a */
/* loaded from: classes4.dex */
public interface InterfaceC16428a<S> extends InterfaceC48362rx4<S> {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBaseScanRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseScanRenderer.kt\nco/bird/android/vehiclescanner/common/mrp/BaseScanRenderer$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
    /* renamed from: co.bird.android.vehiclescanner.common.mrp.a$a */
    /* loaded from: classes4.dex */
    public static final class C16429a {
        /* renamed from: a */
        public static <S> void m54813a(InterfaceC16428a<S> interfaceC16428a, S s) {
            if (s instanceof InterfaceC33697Ix5) {
                InterfaceC33697Ix5 interfaceC33697Ix5 = (InterfaceC33697Ix5) s;
                Boolean mo40320c = interfaceC33697Ix5.mo40320c();
                if (mo40320c != null) {
                    interfaceC16428a.mo54814w1().mo86379gm(mo40320c.booleanValue());
                }
                Boolean mo40317g = interfaceC33697Ix5.mo40317g();
                if (mo40317g != null) {
                    interfaceC16428a.mo54814w1().m86378hm(mo40317g.booleanValue());
                }
                Boolean mo40314j = interfaceC33697Ix5.mo40314j();
                if (mo40314j != null) {
                    interfaceC16428a.mo54814w1().m86377im(mo40314j.booleanValue());
                }
                Boolean mo40318e = interfaceC33697Ix5.mo40318e();
                if (mo40318e != null) {
                    interfaceC16428a.mo54814w1().m86366sm(mo40318e.booleanValue());
                }
                Boolean mo40316h = interfaceC33697Ix5.mo40316h();
                if (mo40316h != null) {
                    interfaceC16428a.mo54814w1().m86362vm(mo40316h.booleanValue());
                }
                Boolean mo40313k = interfaceC33697Ix5.mo40313k();
                if (mo40313k != null) {
                    interfaceC16428a.mo54814w1().m86365tm(mo40313k.booleanValue());
                }
                PartKind mo40315i = interfaceC33697Ix5.mo40315i();
                if (mo40315i != null) {
                    interfaceC16428a.mo54814w1().m86367rm(mo40315i);
                }
                String mo40319d = interfaceC33697Ix5.mo40319d();
                if (mo40319d != null) {
                    C35686Rk5.setInstructions$default(interfaceC16428a.mo54814w1(), mo40319d, null, 2, null);
                }
            }
        }
    }

    /* renamed from: G */
    Observable<Unit> mo54816G();

    /* renamed from: T */
    Observable<String> mo54815T();

    /* renamed from: w1 */
    C35686Rk5 mo54814w1();
}
