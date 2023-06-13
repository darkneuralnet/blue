package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\b\u0003\u0018\u00002\u00020\u0001Bº\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0006\u0010*\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\u0006\u00100\u001a\u00020\u0006\u0012\u0006\u00102\u001a\u00020\u0006\u0012\u0006\u00104\u001a\u00020\u0006\u0012\u0006\u00106\u001a\u00020\u0006\u0012\u0006\u00108\u001a\u00020\u0006\u0012\u0006\u0010:\u001a\u00020\u0006\u0012\u0006\u0010<\u001a\u00020\u0006\u0012\u0006\u0010>\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b?\u0010@J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0010J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0010J\u0013\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u001d\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u001d\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u001d\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u001d\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001d\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001d\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u001d\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001d\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u001d\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001d\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u001d\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010\u001bR\u001d\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b)\u0010\u001bR\u001d\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b+\u0010\u001bR\u001d\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010\u001bR\u001d\u00100\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b/\u0010\u001bR\u001d\u00102\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b1\u0010\u001bR\u001d\u00104\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b3\u0010\u001bR\u001d\u00106\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b5\u0010\u001bR\u001d\u00108\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b7\u0010\u001bR\u001d\u0010:\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b9\u0010\u001bR\u001d\u0010<\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b;\u0010\u001bR\u001d\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b=\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, m28432d2 = {"LPY0;", "Le16;", "", "enabled", "isError", "LsP5;", "Lpm0;", "e", "(ZZLEt0;I)LsP5;", "i", "Le62;", "interactionSource", "f", "(ZZLe62;LEt0;I)LsP5;", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "(ZLEt0;I)LsP5;", "b", "error", "h", "j", "g", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "J", "textColor", "disabledTextColor", "c", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "k", "errorLeadingIconColor", "l", "trailingIconColor", "m", "focusedTrailingIconColor", "n", "disabledTrailingIconColor", "o", "errorTrailingIconColor", "p", "backgroundColor", "q", "focusedLabelColor", "r", "unfocusedLabelColor", "s", "disabledLabelColor", "t", "errorLabelColor", "u", "placeholderColor", "v", "disabledPlaceholderColor", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,731:1\n76#2:732\n76#2:733\n76#2:734\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors\n*L\n604#1:732\n622#1:733\n653#1:734\n*E\n"})
/* renamed from: PY0 */
/* loaded from: classes.dex */
public final class PY0 implements InterfaceC40102e16 {

    /* renamed from: a */
    public final long f28656a;

    /* renamed from: b */
    public final long f28657b;

    /* renamed from: c */
    public final long f28658c;

    /* renamed from: d */
    public final long f28659d;

    /* renamed from: e */
    public final long f28660e;

    /* renamed from: f */
    public final long f28661f;

    /* renamed from: g */
    public final long f28662g;

    /* renamed from: h */
    public final long f28663h;

    /* renamed from: i */
    public final long f28664i;

    /* renamed from: j */
    public final long f28665j;

    /* renamed from: k */
    public final long f28666k;

    /* renamed from: l */
    public final long f28667l;

    /* renamed from: m */
    public final long f28668m;

    /* renamed from: n */
    public final long f28669n;

    /* renamed from: o */
    public final long f28670o;

    /* renamed from: p */
    public final long f28671p;

    /* renamed from: q */
    public final long f28672q;

    /* renamed from: r */
    public final long f28673r;

    /* renamed from: s */
    public final long f28674s;

    /* renamed from: t */
    public final long f28675t;

    /* renamed from: u */
    public final long f28676u;

    /* renamed from: v */
    public final long f28677v;

    public /* synthetic */ PY0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22);
    }

    /* renamed from: k */
    public static final boolean m90134k(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    /* renamed from: l */
    public static final boolean m90133l(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    /* renamed from: m */
    public static final boolean m90132m(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    @Override // p000.InterfaceC39510d16
    /* renamed from: a */
    public InterfaceC48627sP5<C47063pm0> mo44716a(boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-28962788);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-28962788, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.backgroundColor (ExposedDropdownMenu.kt:637)");
        }
        InterfaceC48627sP5<C47063pm0> m105193n = GM5.m105193n(C47063pm0.m18747i(this.f28671p), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    @Override // p000.InterfaceC39510d16
    /* renamed from: b */
    public InterfaceC48627sP5<C47063pm0> mo44715b(boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        interfaceC32720Et0.mo89638F(1742462291);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1742462291, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.placeholderColor (ExposedDropdownMenu.kt:642)");
        }
        if (z) {
            j = this.f28676u;
        } else {
            j = this.f28677v;
        }
        InterfaceC48627sP5<C47063pm0> m105193n = GM5.m105193n(C47063pm0.m18747i(j), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    @Override // p000.InterfaceC39510d16
    /* renamed from: d */
    public InterfaceC48627sP5<C47063pm0> mo44714d(boolean z, boolean z2, InterfaceC40148e62 interactionSource, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        InterfaceC48627sP5<C47063pm0> m105193n;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        interfaceC32720Et0.mo89638F(476110356);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(476110356, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.indicatorColor (ExposedDropdownMenu.kt:616)");
        }
        InterfaceC48627sP5<Boolean> m116a = C53082zv1.m116a(interactionSource, interfaceC32720Et0, (i >> 6) & 14);
        if (!z) {
            j = this.f28663h;
        } else if (z2) {
            j = this.f28662g;
        } else if (m90134k(m116a)) {
            j = this.f28660e;
        } else {
            j = this.f28661f;
        }
        long j2 = j;
        if (z) {
            interfaceC32720Et0.mo89638F(182314714);
            m105193n = C46130oB5.m21645a(j2, C26160mf.m25219k(150, 0, null, 6, null), null, interfaceC32720Et0, 48, 4);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(182314819);
            m105193n = GM5.m105193n(C47063pm0.m18747i(j2), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    @Override // p000.InterfaceC39510d16
    /* renamed from: e */
    public InterfaceC48627sP5<C47063pm0> mo44713e(boolean z, boolean z2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        interfaceC32720Et0.mo89638F(-776179197);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-776179197, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.leadingIconColor (ExposedDropdownMenu.kt:576)");
        }
        if (!z) {
            j = this.f28665j;
        } else if (z2) {
            j = this.f28666k;
        } else {
            j = this.f28664i;
        }
        InterfaceC48627sP5<C47063pm0> m105193n = GM5.m105193n(C47063pm0.m18747i(j), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PY0.class != obj.getClass()) {
            return false;
        }
        PY0 py0 = (PY0) obj;
        if (C47063pm0.m18741o(this.f28656a, py0.f28656a) && C47063pm0.m18741o(this.f28657b, py0.f28657b) && C47063pm0.m18741o(this.f28658c, py0.f28658c) && C47063pm0.m18741o(this.f28659d, py0.f28659d) && C47063pm0.m18741o(this.f28660e, py0.f28660e) && C47063pm0.m18741o(this.f28661f, py0.f28661f) && C47063pm0.m18741o(this.f28662g, py0.f28662g) && C47063pm0.m18741o(this.f28663h, py0.f28663h) && C47063pm0.m18741o(this.f28664i, py0.f28664i) && C47063pm0.m18741o(this.f28665j, py0.f28665j) && C47063pm0.m18741o(this.f28666k, py0.f28666k) && C47063pm0.m18741o(this.f28667l, py0.f28667l) && C47063pm0.m18741o(this.f28668m, py0.f28668m) && C47063pm0.m18741o(this.f28669n, py0.f28669n) && C47063pm0.m18741o(this.f28670o, py0.f28670o) && C47063pm0.m18741o(this.f28671p, py0.f28671p) && C47063pm0.m18741o(this.f28672q, py0.f28672q) && C47063pm0.m18741o(this.f28673r, py0.f28673r) && C47063pm0.m18741o(this.f28674s, py0.f28674s) && C47063pm0.m18741o(this.f28675t, py0.f28675t) && C47063pm0.m18741o(this.f28676u, py0.f28676u) && C47063pm0.m18741o(this.f28677v, py0.f28677v)) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC40102e16
    /* renamed from: f */
    public InterfaceC48627sP5<C47063pm0> mo43401f(boolean z, boolean z2, InterfaceC40148e62 interactionSource, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        interfaceC32720Et0.mo89638F(79259602);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(79259602, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:598)");
        }
        InterfaceC48627sP5<Boolean> m116a = C53082zv1.m116a(interactionSource, interfaceC32720Et0, (i >> 6) & 14);
        if (!z) {
            j = this.f28669n;
        } else if (z2) {
            j = this.f28670o;
        } else if (m90132m(m116a)) {
            j = this.f28668m;
        } else {
            j = this.f28667l;
        }
        InterfaceC48627sP5<C47063pm0> m105193n = GM5.m105193n(C47063pm0.m18747i(j), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    @Override // p000.InterfaceC39510d16
    /* renamed from: g */
    public InterfaceC48627sP5<C47063pm0> mo44712g(boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        interfaceC32720Et0.mo89638F(-930693132);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-930693132, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.cursorColor (ExposedDropdownMenu.kt:669)");
        }
        if (z) {
            j = this.f28659d;
        } else {
            j = this.f28658c;
        }
        InterfaceC48627sP5<C47063pm0> m105193n = GM5.m105193n(C47063pm0.m18747i(j), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    @Override // p000.InterfaceC39510d16
    /* renamed from: h */
    public InterfaceC48627sP5<C47063pm0> mo44711h(boolean z, boolean z2, InterfaceC40148e62 interactionSource, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        interfaceC32720Et0.mo89638F(-1749156593);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1749156593, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.labelColor (ExposedDropdownMenu.kt:647)");
        }
        InterfaceC48627sP5<Boolean> m116a = C53082zv1.m116a(interactionSource, interfaceC32720Et0, (i >> 6) & 14);
        if (!z) {
            j = this.f28674s;
        } else if (z2) {
            j = this.f28675t;
        } else if (m90133l(m116a)) {
            j = this.f28672q;
        } else {
            j = this.f28673r;
        }
        InterfaceC48627sP5<C47063pm0> m105193n = GM5.m105193n(C47063pm0.m18747i(j), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((C47063pm0.m18735u(this.f28656a) * 31) + C47063pm0.m18735u(this.f28657b)) * 31) + C47063pm0.m18735u(this.f28658c)) * 31) + C47063pm0.m18735u(this.f28659d)) * 31) + C47063pm0.m18735u(this.f28660e)) * 31) + C47063pm0.m18735u(this.f28661f)) * 31) + C47063pm0.m18735u(this.f28662g)) * 31) + C47063pm0.m18735u(this.f28663h)) * 31) + C47063pm0.m18735u(this.f28664i)) * 31) + C47063pm0.m18735u(this.f28665j)) * 31) + C47063pm0.m18735u(this.f28666k)) * 31) + C47063pm0.m18735u(this.f28667l)) * 31) + C47063pm0.m18735u(this.f28668m)) * 31) + C47063pm0.m18735u(this.f28669n)) * 31) + C47063pm0.m18735u(this.f28670o)) * 31) + C47063pm0.m18735u(this.f28671p)) * 31) + C47063pm0.m18735u(this.f28672q)) * 31) + C47063pm0.m18735u(this.f28673r)) * 31) + C47063pm0.m18735u(this.f28674s)) * 31) + C47063pm0.m18735u(this.f28675t)) * 31) + C47063pm0.m18735u(this.f28676u)) * 31) + C47063pm0.m18735u(this.f28677v);
    }

    @Override // p000.InterfaceC39510d16
    /* renamed from: i */
    public InterfaceC48627sP5<C47063pm0> mo44710i(boolean z, boolean z2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        interfaceC32720Et0.mo89638F(1665901393);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1665901393, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:587)");
        }
        if (!z) {
            j = this.f28669n;
        } else if (z2) {
            j = this.f28670o;
        } else {
            j = this.f28667l;
        }
        InterfaceC48627sP5<C47063pm0> m105193n = GM5.m105193n(C47063pm0.m18747i(j), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    @Override // p000.InterfaceC39510d16
    /* renamed from: j */
    public InterfaceC48627sP5<C47063pm0> mo44709j(boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        interfaceC32720Et0.mo89638F(394526077);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(394526077, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.textColor (ExposedDropdownMenu.kt:664)");
        }
        if (z) {
            j = this.f28656a;
        } else {
            j = this.f28657b;
        }
        InterfaceC48627sP5<C47063pm0> m105193n = GM5.m105193n(C47063pm0.m18747i(j), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    public PY0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22) {
        this.f28656a = j;
        this.f28657b = j2;
        this.f28658c = j3;
        this.f28659d = j4;
        this.f28660e = j5;
        this.f28661f = j6;
        this.f28662g = j7;
        this.f28663h = j8;
        this.f28664i = j9;
        this.f28665j = j10;
        this.f28666k = j11;
        this.f28667l = j12;
        this.f28668m = j13;
        this.f28669n = j14;
        this.f28670o = j15;
        this.f28671p = j16;
        this.f28672q = j17;
        this.f28673r = j18;
        this.f28674s = j19;
        this.f28675t = j20;
        this.f28676u = j21;
        this.f28677v = j22;
    }
}
