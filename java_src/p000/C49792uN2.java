package p000;

import androidx.lifecycle.C11759u;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.airbnb.mvrx.ViewModelDoesNotExistException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AN2;
import p000.RN2;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005Bm\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\b\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0019\u0012\b\b\u0002\u0010 \u001a\u00020\u001d\u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!¢\u0006\u0004\b%\u0010&J'\u0010\n\u001a\u00028\u0002\"\b\b\u0002\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"LuN2;", "LRN2;", "VM", "LAN2;", "S", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "b", "Ljava/lang/Class;", "viewModelClass", "c", "stateClass", "LPr6;", DateTokenConverter.CONVERTER_KEY, "LPr6;", "viewModelContext", "", "e", "Ljava/lang/String;", "key", "LIP5;", "f", "LIP5;", "stateRestorer", "", "g", "Z", "forExistingViewModel", "LBN2;", "h", "LBN2;", "initialStateFactory", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;LIP5;ZLBN2;)V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: uN2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49792uN2<VM extends RN2<S>, S extends AN2> implements C11759u.InterfaceC11763b {

    /* renamed from: b */
    public final Class<? extends VM> f112272b;

    /* renamed from: c */
    public final Class<? extends S> f112273c;

    /* renamed from: d */
    public final AbstractC35282Pr6 f112274d;

    /* renamed from: e */
    public final String f112275e;

    /* renamed from: f */
    public final IP5<VM, S> f112276f;

    /* renamed from: g */
    public final boolean f112277g;

    /* renamed from: h */
    public final BN2<VM, S> f112278h;

    public C49792uN2(Class<? extends VM> viewModelClass, Class<? extends S> stateClass, AbstractC35282Pr6 viewModelContext, String key, IP5<VM, S> ip5, boolean z, BN2<VM, S> initialStateFactory) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(stateClass, "stateClass");
        Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(initialStateFactory, "initialStateFactory");
        this.f112272b = viewModelClass;
        this.f112273c = stateClass;
        this.f112274d = viewModelContext;
        this.f112275e = key;
        this.f112276f = ip5;
        this.f112277g = z;
        this.f112278h = initialStateFactory;
    }

    @Override // androidx.lifecycle.C11759u.InterfaceC11763b
    public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
        C37925aO2 m8765c;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        IP5<VM, S> ip5 = this.f112276f;
        if (ip5 == null && this.f112277g) {
            throw new ViewModelDoesNotExistException(this.f112272b, this.f112274d, this.f112275e);
        }
        m8765c = C50384vN2.m8765c(this.f112272b, this.f112273c, this.f112274d, ip5, this.f112278h);
        Intrinsics.checkNotNull(m8765c, "null cannot be cast to non-null type T of com.airbnb.mvrx.MavericksFactory.create");
        return m8765c;
    }
}
