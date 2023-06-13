package p000;

import androidx.lifecycle.C11759u;
import androidx.lifecycle.InterfaceC11718e;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.FE0;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m28432d2 = {"LOr6;", "VM", "Ljava/lang/Class;", "modelClass", "LXr6;", "viewModelStoreOwner", "", "key", "Landroidx/lifecycle/u$b;", "factory", "LFE0;", "extras", "b", "(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;", "javaClass", C17296a.f69688o, "(LXr6;Ljava/lang/Class;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;)LOr6;", "lifecycle-viewmodel-compose_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,218:1\n31#2:219\n63#2,2:220\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n187#1:219\n187#1:220,2\n*E\n"})
/* renamed from: Sr6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35984Sr6 {
    /* renamed from: a */
    public static final <VM extends AbstractC35048Or6> VM m84735a(InterfaceC37154Xr6 interfaceC37154Xr6, Class<VM> cls, String str, C11759u.InterfaceC11763b interfaceC11763b, FE0 fe0) {
        C11759u c11759u;
        if (interfaceC11763b != null) {
            c11759u = new C11759u(interfaceC37154Xr6.getViewModelStore(), interfaceC11763b, fe0);
        } else if (interfaceC37154Xr6 instanceof InterfaceC11718e) {
            c11759u = new C11759u(interfaceC37154Xr6.getViewModelStore(), ((InterfaceC11718e) interfaceC37154Xr6).getDefaultViewModelProviderFactory(), fe0);
        } else {
            c11759u = new C11759u(interfaceC37154Xr6);
        }
        if (str != null) {
            return (VM) c11759u.m66921b(str, cls);
        }
        return (VM) c11759u.m66922a(cls);
    }

    /* renamed from: b */
    public static final <VM extends AbstractC35048Or6> VM m84734b(Class<VM> modelClass, InterfaceC37154Xr6 interfaceC37154Xr6, String str, C11759u.InterfaceC11763b interfaceC11763b, FE0 fe0, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        interfaceC32720Et0.mo89638F(-1439476281);
        if ((i2 & 2) != 0 && (interfaceC37154Xr6 = C47155pv2.f104319a.m18429a(interfaceC32720Et0, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            interfaceC11763b = null;
        }
        if ((i2 & 16) != 0) {
            if (interfaceC37154Xr6 instanceof InterfaceC11718e) {
                fe0 = ((InterfaceC11718e) interfaceC37154Xr6).getDefaultViewModelCreationExtras();
            } else {
                fe0 = FE0.C2209a.f9049b;
            }
        }
        VM vm = (VM) m84735a(interfaceC37154Xr6, modelClass, str, interfaceC11763b, fe0);
        interfaceC32720Et0.mo89605Q();
        return vm;
    }
}
