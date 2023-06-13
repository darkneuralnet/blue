package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\b\u0003\u0018\u00002\u00020\u0001B²\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0006\u0010*\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\u0006\u00100\u001a\u00020\u0006\u0012\u0006\u00102\u001a\u00020\u0006\u0012\u0006\u00104\u001a\u00020\u0006\u0012\u0006\u00106\u001a\u00020\u0006\u0012\u0006\u00108\u001a\u00020\u0006\u0012\u0006\u0010:\u001a\u00020\u0006\u0012\u0006\u0010<\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b=\u0010>J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000fJ\u0013\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u001d\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u001d\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u001d\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u001d\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001d\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001d\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u001d\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u001d\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u001d\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001d\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001d\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u001d\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b+\u0010\u001aR\u001d\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010\u001aR\u001d\u00100\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b/\u0010\u001aR\u001d\u00102\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b1\u0010\u001aR\u001d\u00104\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b3\u0010\u001aR\u001d\u00106\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b5\u0010\u001aR\u001d\u00108\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b7\u0010\u001aR\u001d\u0010:\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b9\u0010\u001aR\u001d\u0010<\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b;\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, m28432d2 = {"LOY0;", "Ld16;", "", "enabled", "isError", "LsP5;", "Lpm0;", "e", "(ZZLEt0;I)LsP5;", "i", "Le62;", "interactionSource", DateTokenConverter.CONVERTER_KEY, "(ZZLe62;LEt0;I)LsP5;", C17296a.f69688o, "(ZLEt0;I)LsP5;", "b", "error", "h", "j", "g", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "J", "textColor", "disabledTextColor", "c", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "f", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "k", "errorLeadingIconColor", "l", "trailingIconColor", "m", "disabledTrailingIconColor", "n", "errorTrailingIconColor", "o", "backgroundColor", "p", "focusedLabelColor", "q", "unfocusedLabelColor", "r", "disabledLabelColor", "s", "errorLabelColor", "t", "placeholderColor", "u", "disabledPlaceholderColor", "<init>", "(JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/DefaultTextFieldColors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,855:1\n76#2:856\n76#2:857\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/DefaultTextFieldColors\n*L\n726#1:856\n757#1:857\n*E\n"})
/* renamed from: OY0 */
/* loaded from: classes.dex */
public final class OY0 implements InterfaceC39510d16 {

    /* renamed from: a */
    public final long f26747a;

    /* renamed from: b */
    public final long f26748b;

    /* renamed from: c */
    public final long f26749c;

    /* renamed from: d */
    public final long f26750d;

    /* renamed from: e */
    public final long f26751e;

    /* renamed from: f */
    public final long f26752f;

    /* renamed from: g */
    public final long f26753g;

    /* renamed from: h */
    public final long f26754h;

    /* renamed from: i */
    public final long f26755i;

    /* renamed from: j */
    public final long f26756j;

    /* renamed from: k */
    public final long f26757k;

    /* renamed from: l */
    public final long f26758l;

    /* renamed from: m */
    public final long f26759m;

    /* renamed from: n */
    public final long f26760n;

    /* renamed from: o */
    public final long f26761o;

    /* renamed from: p */
    public final long f26762p;

    /* renamed from: q */
    public final long f26763q;

    /* renamed from: r */
    public final long f26764r;

    /* renamed from: s */
    public final long f26765s;

    /* renamed from: t */
    public final long f26766t;

    /* renamed from: u */
    public final long f26767u;

    public /* synthetic */ OY0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    /* renamed from: k */
    public static final boolean m92024k(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    /* renamed from: l */
    public static final boolean m92023l(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    @Override // p000.InterfaceC39510d16
    /* renamed from: a */
    public InterfaceC48627sP5<C47063pm0> mo44716a(boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-1423938813);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1423938813, i, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:741)");
        }
        InterfaceC48627sP5<C47063pm0> m105193n = GM5.m105193n(C47063pm0.m18747i(this.f26761o), interfaceC32720Et0, 0);
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
        interfaceC32720Et0.mo89638F(264799724);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(264799724, i, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:746)");
        }
        if (z) {
            j = this.f26766t;
        } else {
            j = this.f26767u;
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
        interfaceC32720Et0.mo89638F(998675979);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(998675979, i, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:720)");
        }
        InterfaceC48627sP5<Boolean> m116a = C53082zv1.m116a(interactionSource, interfaceC32720Et0, (i >> 6) & 14);
        if (!z) {
            j = this.f26754h;
        } else if (z2) {
            j = this.f26753g;
        } else if (m92024k(m116a)) {
            j = this.f26751e;
        } else {
            j = this.f26752f;
        }
        long j2 = j;
        if (z) {
            interfaceC32720Et0.mo89638F(-2054190397);
            m105193n = C46130oB5.m21645a(j2, C26160mf.m25219k(150, 0, null, 6, null), null, interfaceC32720Et0, 48, 4);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-2054190292);
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
        interfaceC32720Et0.mo89638F(1016171324);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1016171324, i, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:698)");
        }
        if (!z) {
            j = this.f26756j;
        } else if (z2) {
            j = this.f26757k;
        } else {
            j = this.f26755i;
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
        if (obj == null || OY0.class != obj.getClass()) {
            return false;
        }
        OY0 oy0 = (OY0) obj;
        if (C47063pm0.m18741o(this.f26747a, oy0.f26747a) && C47063pm0.m18741o(this.f26748b, oy0.f26748b) && C47063pm0.m18741o(this.f26749c, oy0.f26749c) && C47063pm0.m18741o(this.f26750d, oy0.f26750d) && C47063pm0.m18741o(this.f26751e, oy0.f26751e) && C47063pm0.m18741o(this.f26752f, oy0.f26752f) && C47063pm0.m18741o(this.f26753g, oy0.f26753g) && C47063pm0.m18741o(this.f26754h, oy0.f26754h) && C47063pm0.m18741o(this.f26755i, oy0.f26755i) && C47063pm0.m18741o(this.f26756j, oy0.f26756j) && C47063pm0.m18741o(this.f26757k, oy0.f26757k) && C47063pm0.m18741o(this.f26758l, oy0.f26758l) && C47063pm0.m18741o(this.f26759m, oy0.f26759m) && C47063pm0.m18741o(this.f26760n, oy0.f26760n) && C47063pm0.m18741o(this.f26761o, oy0.f26761o) && C47063pm0.m18741o(this.f26762p, oy0.f26762p) && C47063pm0.m18741o(this.f26763q, oy0.f26763q) && C47063pm0.m18741o(this.f26764r, oy0.f26764r) && C47063pm0.m18741o(this.f26765s, oy0.f26765s) && C47063pm0.m18741o(this.f26766t, oy0.f26766t) && C47063pm0.m18741o(this.f26767u, oy0.f26767u)) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC39510d16
    /* renamed from: g */
    public InterfaceC48627sP5<C47063pm0> mo44712g(boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        interfaceC32720Et0.mo89638F(-1446422485);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1446422485, i, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:773)");
        }
        if (z) {
            j = this.f26750d;
        } else {
            j = this.f26749c;
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
        interfaceC32720Et0.mo89638F(727091888);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(727091888, i, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:751)");
        }
        InterfaceC48627sP5<Boolean> m116a = C53082zv1.m116a(interactionSource, interfaceC32720Et0, (i >> 6) & 14);
        if (!z) {
            j = this.f26764r;
        } else if (z2) {
            j = this.f26765s;
        } else if (m92023l(m116a)) {
            j = this.f26762p;
        } else {
            j = this.f26763q;
        }
        InterfaceC48627sP5<C47063pm0> m105193n = GM5.m105193n(C47063pm0.m18747i(j), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((C47063pm0.m18735u(this.f26747a) * 31) + C47063pm0.m18735u(this.f26748b)) * 31) + C47063pm0.m18735u(this.f26749c)) * 31) + C47063pm0.m18735u(this.f26750d)) * 31) + C47063pm0.m18735u(this.f26751e)) * 31) + C47063pm0.m18735u(this.f26752f)) * 31) + C47063pm0.m18735u(this.f26753g)) * 31) + C47063pm0.m18735u(this.f26754h)) * 31) + C47063pm0.m18735u(this.f26755i)) * 31) + C47063pm0.m18735u(this.f26756j)) * 31) + C47063pm0.m18735u(this.f26757k)) * 31) + C47063pm0.m18735u(this.f26758l)) * 31) + C47063pm0.m18735u(this.f26759m)) * 31) + C47063pm0.m18735u(this.f26760n)) * 31) + C47063pm0.m18735u(this.f26761o)) * 31) + C47063pm0.m18735u(this.f26762p)) * 31) + C47063pm0.m18735u(this.f26763q)) * 31) + C47063pm0.m18735u(this.f26764r)) * 31) + C47063pm0.m18735u(this.f26765s)) * 31) + C47063pm0.m18735u(this.f26766t)) * 31) + C47063pm0.m18735u(this.f26767u);
    }

    @Override // p000.InterfaceC39510d16
    /* renamed from: i */
    public InterfaceC48627sP5<C47063pm0> mo44710i(boolean z, boolean z2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long j;
        interfaceC32720Et0.mo89638F(225259054);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(225259054, i, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:709)");
        }
        if (!z) {
            j = this.f26759m;
        } else if (z2) {
            j = this.f26760n;
        } else {
            j = this.f26758l;
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
        interfaceC32720Et0.mo89638F(9804418);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(9804418, i, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:768)");
        }
        if (z) {
            j = this.f26747a;
        } else {
            j = this.f26748b;
        }
        InterfaceC48627sP5<C47063pm0> m105193n = GM5.m105193n(C47063pm0.m18747i(j), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n;
    }

    public OY0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.f26747a = j;
        this.f26748b = j2;
        this.f26749c = j3;
        this.f26750d = j4;
        this.f26751e = j5;
        this.f26752f = j6;
        this.f26753g = j7;
        this.f26754h = j8;
        this.f26755i = j9;
        this.f26756j = j10;
        this.f26757k = j11;
        this.f26758l = j12;
        this.f26759m = j13;
        this.f26760n = j14;
        this.f26761o = j15;
        this.f26762p = j16;
        this.f26763q = j17;
        this.f26764r = j18;
        this.f26765s = j19;
        this.f26766t = j20;
        this.f26767u = j21;
    }
}
