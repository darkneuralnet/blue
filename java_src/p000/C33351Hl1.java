package p000;

import co.bird.android.model.filter.KeyBasedAreasFilter;
import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LHl1;", "LGl1;", "", "areaKey", "", C17296a.f69688o, "b", "LZ84;", "Lco/bird/android/model/filter/KeyBasedAreasFilter;", "Lkotlin/Lazy;", "c", "()LZ84;", "areaKeyFilter", "La94;", "La94;", "mutableAreaKeyFilter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hl1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33351Hl1 implements InterfaceC33117Gl1 {

    /* renamed from: a */
    public final Lazy f13843a;

    /* renamed from: b */
    public final C37791a94<KeyBasedAreasFilter> f13844b;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "Lco/bird/android/model/filter/KeyBasedAreasFilter;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hl1$a */
    /* loaded from: classes2.dex */
    public static final class C3219a extends Lambda implements Function0<Z84<KeyBasedAreasFilter>> {
        public C3219a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<KeyBasedAreasFilter> invoke() {
            return Z84.f47888d.m73663b(C33351Hl1.this.f13844b);
        }
    }

    public C33351Hl1() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C3219a());
        this.f13843a = lazy;
        this.f13844b = C37791a94.C10586a.create$default(C37791a94.f49908h, new KeyBasedAreasFilter(false, null, 3, null), null, 2, null);
    }

    @Override // p000.InterfaceC33117Gl1
    /* renamed from: a */
    public void mo103478a(String str) {
        this.f13844b.accept(new KeyBasedAreasFilter(true, str));
    }

    @Override // p000.InterfaceC33117Gl1
    /* renamed from: b */
    public void mo103477b() {
        this.f13844b.accept(new KeyBasedAreasFilter(false, null, 3, null));
    }

    @Override // p000.InterfaceC33117Gl1
    /* renamed from: c */
    public Z84<KeyBasedAreasFilter> mo103476c() {
        return (Z84) this.f13843a.getValue();
    }
}
