package androidx.lifecycle;

import androidx.lifecycle.C11759u;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import p000.AbstractC35048Or6;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\n¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Landroidx/lifecycle/t;", "LOr6;", "VM", "Lkotlin/Lazy;", "", "isInitialized", "Lkotlin/reflect/KClass;", "b", "Lkotlin/reflect/KClass;", "viewModelClass", "Lkotlin/Function0;", "LWr6;", "c", "Lkotlin/jvm/functions/Function0;", "storeProducer", "Landroidx/lifecycle/u$b;", DateTokenConverter.CONVERTER_KEY, "factoryProducer", "LFE0;", "e", "extrasProducer", "f", "LOr6;", "cached", C17296a.f69688o, "()LOr6;", "value", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.t */
/* loaded from: classes.dex */
public final class C11758t<VM extends AbstractC35048Or6> implements Lazy<VM> {

    /* renamed from: b */
    public final KClass<VM> f54981b;

    /* renamed from: c */
    public final Function0<C36920Wr6> f54982c;

    /* renamed from: d */
    public final Function0<C11759u.InterfaceC11763b> f54983d;

    /* renamed from: e */
    public final Function0<FE0> f54984e;

    /* renamed from: f */
    public VM f54985f;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public C11758t(KClass<VM> viewModelClass, Function0<? extends C36920Wr6> storeProducer, Function0<? extends C11759u.InterfaceC11763b> factoryProducer, Function0<? extends FE0> extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f54981b = viewModelClass;
        this.f54982c = storeProducer;
        this.f54983d = factoryProducer;
        this.f54984e = extrasProducer;
    }

    @Override // kotlin.Lazy
    /* renamed from: a */
    public VM getValue() {
        VM vm = this.f54985f;
        if (vm == null) {
            VM vm2 = (VM) new C11759u(this.f54982c.invoke(), this.f54983d.invoke(), this.f54984e.invoke()).m66922a(JvmClassMappingKt.getJavaClass((KClass) this.f54981b));
            this.f54985f = vm2;
            return vm2;
        }
        return vm;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f54985f != null;
    }
}
