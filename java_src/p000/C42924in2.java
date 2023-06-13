package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J<\u0010\u0012\u001a\u00020\b2'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0019\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, m28432d2 = {"Lin2;", "Lcn2;", "", "index", "e", "(I)Ljava/lang/Integer;", "LWp5;", "scrollOffset", "", "f", "targetScrollOffset", "", C17296a.f69688o, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "g", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lln2;", "visibleItems", "", "isVertical", "j", "LGn2;", "LGn2;", TransferTable.COLUMN_STATE, "Lg01;", "b", "()Lg01;", "density", "c", "()I", "firstVisibleItemIndex", "i", "firstVisibleItemScrollOffset", DateTokenConverter.CONVERTER_KEY, "lastVisibleItemIndex", "getItemCount", "itemCount", "h", "numOfItemsForTeleport", "<init>", "(LGn2;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,122:1\n116#2,2:123\n33#2,6:125\n118#2:131\n*S KotlinDebug\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n*L\n42#1:123,2\n42#1:125,6\n42#1:131\n*E\n"})
/* renamed from: in2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42924in2 implements InterfaceC39349cn2 {

    /* renamed from: a */
    public final C33136Gn2 f87867a;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: in2$a */
    /* loaded from: classes.dex */
    public static final class C23355a extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: g */
        public final /* synthetic */ boolean f87868g;

        /* renamed from: h */
        public final /* synthetic */ List<InterfaceC44703ln2> f87869h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23355a(boolean z, List<? extends InterfaceC44703ln2> list) {
            super(1);
            this.f87868g = z;
            this.f87869h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Integer invoke(int i) {
            return Integer.valueOf(this.f87868g ? this.f87869h.get(i).mo26832d() : this.f87869h.get(i).mo26834b());
        }
    }

    public C42924in2(C33136Gn2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f87867a = state;
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: a */
    public float mo33495a(int i, int i2) {
        boolean z;
        List<InterfaceC44703ln2> mo4706b = this.f87867a.m104735p().mo4706b();
        int m104727x = this.f87867a.m104727x();
        int m33486j = m33486j(mo4706b, this.f87867a.m104726y());
        int i3 = 1;
        if (i < mo33493c()) {
            z = true;
        } else {
            z = false;
        }
        int mo33493c = i - mo33493c();
        int i4 = m104727x - 1;
        if (z) {
            i3 = -1;
        }
        int i5 = (mo33493c + (i4 * i3)) / m104727x;
        int min = Math.min(Math.abs(i2), m33486j);
        if (i2 < 0) {
            min *= -1;
        }
        return ((m33486j * i5) + min) - mo33487i();
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: b */
    public InterfaceC41273g01 mo33494b() {
        return this.f87867a.m104739l();
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: c */
    public int mo33493c() {
        return this.f87867a.m104738m();
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: d */
    public int mo33492d() {
        Object lastOrNull;
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.f87867a.m104735p().mo4706b());
        InterfaceC44703ln2 interfaceC44703ln2 = (InterfaceC44703ln2) lastOrNull;
        if (interfaceC44703ln2 != null) {
            return interfaceC44703ln2.getIndex();
        }
        return 0;
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: e */
    public Integer mo33491e(int i) {
        InterfaceC44703ln2 interfaceC44703ln2;
        int m116111j;
        boolean z;
        List<InterfaceC44703ln2> mo4706b = this.f87867a.m104735p().mo4706b();
        int size = mo4706b.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                interfaceC44703ln2 = mo4706b.get(i2);
                if (interfaceC44703ln2.getIndex() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            } else {
                interfaceC44703ln2 = null;
                break;
            }
        }
        InterfaceC44703ln2 interfaceC44703ln22 = interfaceC44703ln2;
        if (interfaceC44703ln22 == null) {
            return null;
        }
        if (this.f87867a.m104726y()) {
            m116111j = A52.m116110k(interfaceC44703ln22.mo26833c());
        } else {
            m116111j = A52.m116111j(interfaceC44703ln22.mo26833c());
        }
        return Integer.valueOf(m116111j);
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: f */
    public void mo33490f(InterfaceC36901Wp5 interfaceC36901Wp5, int i, int i2) {
        Intrinsics.checkNotNullParameter(interfaceC36901Wp5, "<this>");
        this.f87867a.m104746L(i, i2);
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: g */
    public Object mo33489g(Function2<? super InterfaceC36901Wp5, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m65390d = InterfaceC38196aq5.m65390d(this.f87867a, null, function2, continuation, 1, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m65390d == coroutine_suspended ? m65390d : Unit.INSTANCE;
    }

    @Override // p000.InterfaceC39349cn2
    public int getItemCount() {
        return this.f87867a.m104735p().mo4707a();
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: h */
    public int mo33488h() {
        return this.f87867a.m104727x() * 100;
    }

    @Override // p000.InterfaceC39349cn2
    /* renamed from: i */
    public int mo33487i() {
        return this.f87867a.m104737n();
    }

    /* renamed from: j */
    public final int m33486j(List<? extends InterfaceC44703ln2> list, boolean z) {
        int m105829g;
        C23355a c23355a = new C23355a(z, list);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < list.size()) {
            int intValue = c23355a.invoke((C23355a) Integer.valueOf(i)).intValue();
            if (intValue == -1) {
                i++;
            } else {
                int i4 = 0;
                while (i < list.size() && c23355a.invoke((C23355a) Integer.valueOf(i)).intValue() == intValue) {
                    if (z) {
                        m105829g = G52.m105830f(list.get(i).mo26835a());
                    } else {
                        m105829g = G52.m105829g(list.get(i).mo26835a());
                    }
                    i4 = Math.max(i4, m105829g);
                    i++;
                }
                i2 += i4;
                i3++;
            }
        }
        return i2 / i3;
    }
}
