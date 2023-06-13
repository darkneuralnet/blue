package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC33328Hi5;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u001d\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n0\tH\u0096\u0001J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0001J\u0006\u0010\u0011\u001a\u00020\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"Lp51;", "LHi5;", "", "value", "", C17296a.f69688o, "", "key", "f", "", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function0;", "valueProvider", "LHi5$a;", "b", "", "c", "Lkotlin/jvm/functions/Function0;", "onDispose", "saveableStateRegistry", "<init>", "(LHi5;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: p51  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46660p51 implements InterfaceC33328Hi5 {

    /* renamed from: a */
    public final Function0<Unit> f103117a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC33328Hi5 f103118b;

    public C46660p51(InterfaceC33328Hi5 saveableStateRegistry, Function0<Unit> onDispose) {
        Intrinsics.checkNotNullParameter(saveableStateRegistry, "saveableStateRegistry");
        Intrinsics.checkNotNullParameter(onDispose, "onDispose");
        this.f103117a = onDispose;
        this.f103118b = saveableStateRegistry;
    }

    @Override // p000.InterfaceC33328Hi5
    /* renamed from: a */
    public boolean mo19982a(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f103118b.mo19982a(value);
    }

    @Override // p000.InterfaceC33328Hi5
    /* renamed from: b */
    public InterfaceC33328Hi5.InterfaceC3212a mo19981b(String key, Function0<? extends Object> valueProvider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueProvider, "valueProvider");
        return this.f103118b.mo19981b(key, valueProvider);
    }

    /* renamed from: c */
    public final void m19980c() {
        this.f103117a.invoke();
    }

    @Override // p000.InterfaceC33328Hi5
    /* renamed from: d */
    public Map<String, List<Object>> mo19979d() {
        return this.f103118b.mo19979d();
    }

    @Override // p000.InterfaceC33328Hi5
    /* renamed from: f */
    public Object mo19978f(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f103118b.mo19978f(key);
    }
}
