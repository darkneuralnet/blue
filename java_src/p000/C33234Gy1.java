package p000;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.C11759u;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aZ\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0007¨\u0006\u0010²\u0006\u0018\u0010\u000f\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u000f\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, m28432d2 = {"LOr6;", "VM", "Landroidx/fragment/app/Fragment;", "Lkotlin/reflect/KClass;", "viewModelClass", "Lkotlin/Function0;", "LWr6;", "storeProducer", "LFE0;", "extrasProducer", "Landroidx/lifecycle/u$b;", "factoryProducer", "Lkotlin/Lazy;", "b", "LXr6;", "owner", "fragment-ktx_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Gy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33234Gy1 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Gy1$a */
    /* loaded from: classes.dex */
    public static final class C2991a extends Lambda implements Function0<C11759u.InterfaceC11763b> {

        /* renamed from: g */
        public final /* synthetic */ Fragment f12670g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2991a(Fragment fragment) {
            super(0);
            this.f12670g = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C11759u.InterfaceC11763b invoke() {
            C11759u.InterfaceC11763b defaultViewModelProviderFactory = this.f12670g.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: b */
    public static final <VM extends AbstractC35048Or6> Lazy<VM> m104545b(Fragment fragment, KClass<VM> viewModelClass, Function0<? extends C36920Wr6> storeProducer, Function0<? extends FE0> extrasProducer, Function0<? extends C11759u.InterfaceC11763b> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        if (function0 == null) {
            function0 = new C2991a(fragment);
        }
        return new C11758t(viewModelClass, storeProducer, function0, extrasProducer);
    }

    /* renamed from: c */
    public static final InterfaceC37154Xr6 m104544c(Lazy<? extends InterfaceC37154Xr6> lazy) {
        return lazy.getValue();
    }
}
