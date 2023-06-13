package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0003\u0018\u00002\u00020\u0001Bb\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bR\u001d\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u001d\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\n\u0010\rR\u001d\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001d\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u001d\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u001d\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u001d\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u001d\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u001d\u0010\u001e\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u001d\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m28432d2 = {"LCW0;", "Lri0;", "Ln56;", TransferTable.COLUMN_STATE, "LsP5;", "Lpm0;", C17296a.f69688o, "(Ln56;LEt0;I)LsP5;", "", "enabled", "c", "(ZLn56;LEt0;I)LsP5;", "b", "J", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", DateTokenConverter.CONVERTER_KEY, "uncheckedBoxColor", "e", "disabledCheckedBoxColor", "f", "disabledUncheckedBoxColor", "g", "disabledIndeterminateBoxColor", "h", "checkedBorderColor", "i", "uncheckedBorderColor", "j", "disabledBorderColor", "k", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CW0 */
/* loaded from: classes.dex */
public final class CW0 implements InterfaceC48209ri0 {

    /* renamed from: a */
    public final long f4138a;

    /* renamed from: b */
    public final long f4139b;

    /* renamed from: c */
    public final long f4140c;

    /* renamed from: d */
    public final long f4141d;

    /* renamed from: e */
    public final long f4142e;

    /* renamed from: f */
    public final long f4143f;

    /* renamed from: g */
    public final long f4144g;

    /* renamed from: h */
    public final long f4145h;

    /* renamed from: i */
    public final long f4146i;

    /* renamed from: j */
    public final long f4147j;

    /* renamed from: k */
    public final long f4148k;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CW0$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C1034a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC45479n56.values().length];
            try {
                iArr[EnumC45479n56.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC45479n56.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC45479n56.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CW0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    @Override // p000.InterfaceC48209ri0
    /* renamed from: a */
    public InterfaceC48627sP5<C47063pm0> mo15559a(EnumC45479n56 state, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        interfaceC32720Et0.mo89638F(544656267);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(544656267, i, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:414)");
        }
        EnumC45479n56 enumC45479n56 = EnumC45479n56.Off;
        if (state == enumC45479n56) {
            j = this.f4139b;
        } else {
            j = this.f4138a;
        }
        long j2 = j;
        if (state == enumC45479n56) {
            i2 = 100;
        } else {
            i2 = 50;
        }
        InterfaceC48627sP5<C47063pm0> m21645a = C46130oB5.m21645a(j2, C26160mf.m25219k(i2, 0, null, 6, null), null, interfaceC32720Et0, 0, 4);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m21645a;
    }

    @Override // p000.InterfaceC48209ri0
    /* renamed from: b */
    public InterfaceC48627sP5<C47063pm0> mo15558b(boolean z, EnumC45479n56 state, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        InterfaceC48627sP5<C47063pm0> m105193n;
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        interfaceC32720Et0.mo89638F(-1568341342);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1568341342, i, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:451)");
        }
        if (z) {
            int i3 = C1034a.$EnumSwitchMapping$0[state.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    j = this.f4146i;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j = this.f4145h;
            }
        } else {
            int i4 = C1034a.$EnumSwitchMapping$0[state.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j = this.f4148k;
                }
            }
            j = this.f4147j;
        }
        long j2 = j;
        if (z) {
            interfaceC32720Et0.mo89638F(-796405227);
            if (state == EnumC45479n56.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            m105193n = C46130oB5.m21645a(j2, C26160mf.m25219k(i2, 0, null, 6, null), null, interfaceC32720Et0, 0, 4);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-796405041);
            m105193n = GM5.m105193n(C47063pm0.m18747i(j2), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    @Override // p000.InterfaceC48209ri0
    /* renamed from: c */
    public InterfaceC48627sP5<C47063pm0> mo15557c(boolean z, EnumC45479n56 state, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        InterfaceC48627sP5<C47063pm0> m105193n;
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        interfaceC32720Et0.mo89638F(840901029);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(840901029, i, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:426)");
        }
        if (z) {
            int i3 = C1034a.$EnumSwitchMapping$0[state.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    j = this.f4141d;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j = this.f4140c;
            }
        } else {
            int i4 = C1034a.$EnumSwitchMapping$0[state.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        j = this.f4143f;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j = this.f4144g;
                }
            } else {
                j = this.f4142e;
            }
        }
        long j2 = j;
        if (z) {
            interfaceC32720Et0.mo89638F(-2010643468);
            if (state == EnumC45479n56.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            m105193n = C46130oB5.m21645a(j2, C26160mf.m25219k(i2, 0, null, 6, null), null, interfaceC32720Et0, 0, 4);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-2010643282);
            m105193n = GM5.m105193n(C47063pm0.m18747i(j2), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    public CW0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f4138a = j;
        this.f4139b = j2;
        this.f4140c = j3;
        this.f4141d = j4;
        this.f4142e = j5;
        this.f4143f = j6;
        this.f4144g = j7;
        this.f4145h = j8;
        this.f4146i = j9;
        this.f4147j = j10;
        this.f4148k = j11;
    }
}
