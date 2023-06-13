package com.stripe.android.p049ui.core.elements.menu;

import co.bird.android.model.LegacyRepairType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013ø\u0001\u0001¢\u0006\u0004\b,\u0010-J5\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\rHÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003JF\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R \u0010\u0016\u001a\u00020\r8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(R)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006."}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/menu/DropdownMenuPositionProvider;", "LzY3;", "LD52;", "anchorBounds", "LG52;", "windowSize", "Lpm2;", "layoutDirection", "popupContentSize", "LA52;", "calculatePosition-llwVHH4", "(LD52;JLpm2;J)J", "calculatePosition", "Ln61;", "component1-RKDOV3M", "()J", "component1", "Lg01;", "component2", "Lkotlin/Function2;", "", "component3", "contentOffset", "density", "onPositionCalculated", "copy-rOJDEFc", "(JLg01;Lkotlin/jvm/functions/Function2;)Lcom/stripe/android/ui/core/elements/menu/DropdownMenuPositionProvider;", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "J", "getContentOffset-RKDOV3M", "Lg01;", "getDensity", "()Lg01;", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "<init>", "(JLg01;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\ncom/stripe/android/ui/core/elements/menu/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,317:1\n1#2:318\n179#3,2:319\n179#3,2:321\n*S KotlinDebug\n*F\n+ 1 Menu.kt\ncom/stripe/android/ui/core/elements/menu/DropdownMenuPositionProvider\n*L\n296#1:319,2\n305#1:321,2\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.menu.DropdownMenuPositionProvider */
/* loaded from: classes7.dex */
public final class DropdownMenuPositionProvider implements InterfaceC52856zY3 {
    private final long contentOffset;
    private final InterfaceC41273g01 density;
    private final Function2<D52, D52, Unit> onPositionCalculated;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LD52;", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "invoke", "(LD52;LD52;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.menu.DropdownMenuPositionProvider$1 */
    /* loaded from: classes7.dex */
    public static final class C194211 extends Lambda implements Function2<D52, D52, Unit> {
        public static final C194211 INSTANCE = new C194211();

        public C194211() {
            super(2);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(D52 d52, D52 d522) {
            Intrinsics.checkNotNullParameter(d52, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(d522, "<anonymous parameter 1>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(D52 d52, D52 d522) {
            invoke2(d52, d522);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, InterfaceC41273g01 interfaceC41273g01, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, interfaceC41273g01, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-rOJDEFc$default  reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m116668copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, InterfaceC41273g01 interfaceC41273g01, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i & 2) != 0) {
            interfaceC41273g01 = dropdownMenuPositionProvider.density;
        }
        if ((i & 4) != 0) {
            function2 = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m116670copyrOJDEFc(j, interfaceC41273g01, function2);
    }

    @Override // p000.InterfaceC52856zY3
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo116225calculatePositionllwVHH4(D52 anchorBounds, long j, EnumC47065pm2 layoutDirection, long j2) {
        Sequence sequenceOf;
        Object obj;
        Object obj2;
        Sequence sequenceOf2;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int mo3416F0 = this.density.mo3416F0(MenuKt.getMenuVerticalMargin());
        int mo3416F02 = this.density.mo3416F0(C45484n61.m24351f(this.contentOffset));
        int mo3416F03 = this.density.mo3416F0(C45484n61.m24350g(this.contentOffset));
        int m110922c = anchorBounds.m110922c() + mo3416F02;
        int m110921d = (anchorBounds.m110921d() - mo3416F02) - G52.m105829g(j2);
        int m105829g = G52.m105829g(j) - G52.m105829g(j2);
        if (layoutDirection == EnumC47065pm2.Ltr) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(m110922c);
            numArr[1] = Integer.valueOf(m110921d);
            if (anchorBounds.m110922c() < 0) {
                m105829g = 0;
            }
            numArr[2] = Integer.valueOf(m105829g);
            sequenceOf = SequencesKt__SequencesKt.sequenceOf(numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(m110921d);
            numArr2[1] = Integer.valueOf(m110922c);
            if (anchorBounds.m110921d() <= G52.m105829g(j)) {
                m105829g = 0;
            }
            numArr2[2] = Integer.valueOf(m105829g);
            sequenceOf = SequencesKt__SequencesKt.sequenceOf(numArr2);
        }
        Iterator it = sequenceOf.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                int intValue = ((Number) obj2).intValue();
                if (intValue >= 0 && intValue + G52.m105829g(j2) <= G52.m105829g(j)) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            m110921d = num.intValue();
        }
        int max = Math.max(anchorBounds.m110924a() + mo3416F03, mo3416F0);
        int m110920e = (anchorBounds.m110920e() - mo3416F03) - G52.m105830f(j2);
        sequenceOf2 = SequencesKt__SequencesKt.sequenceOf(Integer.valueOf(max), Integer.valueOf(m110920e), Integer.valueOf(anchorBounds.m110920e() - (G52.m105830f(j2) / 2)), Integer.valueOf((G52.m105830f(j) - G52.m105830f(j2)) - mo3416F0));
        Iterator it2 = sequenceOf2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= mo3416F0 && intValue2 + G52.m105830f(j2) <= G52.m105830f(j) - mo3416F0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            m110920e = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new D52(m110921d, m110920e, G52.m105829g(j2) + m110921d, G52.m105830f(j2) + m110920e));
        return B52.m114704a(m110921d, m110920e);
    }

    /* renamed from: component1-RKDOV3M  reason: not valid java name */
    public final long m116669component1RKDOV3M() {
        return this.contentOffset;
    }

    public final InterfaceC41273g01 component2() {
        return this.density;
    }

    public final Function2<D52, D52, Unit> component3() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-rOJDEFc  reason: not valid java name */
    public final DropdownMenuPositionProvider m116670copyrOJDEFc(long j, InterfaceC41273g01 density, Function2<? super D52, ? super D52, Unit> onPositionCalculated) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(onPositionCalculated, "onPositionCalculated");
        return new DropdownMenuPositionProvider(j, density, onPositionCalculated, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownMenuPositionProvider) {
            DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
            return C45484n61.m24352e(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
        }
        return false;
    }

    /* renamed from: getContentOffset-RKDOV3M  reason: not valid java name */
    public final long m116671getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final InterfaceC41273g01 getDensity() {
        return this.density;
    }

    public final Function2<D52, D52, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return (((C45484n61.m24349h(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        String m24348i = C45484n61.m24348i(this.contentOffset);
        InterfaceC41273g01 interfaceC41273g01 = this.density;
        Function2<D52, D52, Unit> function2 = this.onPositionCalculated;
        return "DropdownMenuPositionProvider(contentOffset=" + m24348i + ", density=" + interfaceC41273g01 + ", onPositionCalculated=" + function2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j, InterfaceC41273g01 interfaceC41273g01, Function2<? super D52, ? super D52, Unit> function2) {
        this.contentOffset = j;
        this.density = interfaceC41273g01;
        this.onPositionCalculated = function2;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, InterfaceC41273g01 interfaceC41273g01, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, interfaceC41273g01, (i & 4) != 0 ? C194211.INSTANCE : function2, null);
    }
}
