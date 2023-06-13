package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import java.util.Locale;
import kotlin.KotlinVersion;
/* loaded from: classes6.dex */
public final class BadgeState {

    /* renamed from: a */
    public final State f72218a;

    /* renamed from: b */
    public final State f72219b;

    /* renamed from: c */
    public final float f72220c;

    /* renamed from: d */
    public final float f72221d;

    /* renamed from: e */
    public final float f72222e;

    public BadgeState(Context context, int i, int i2, int i3, State state) {
        CharSequence charSequence;
        int i4;
        int i5;
        int i6;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        State state2 = new State();
        this.f72219b = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            state.f72223b = i;
        }
        TypedArray m50350a = m50350a(context, state.f72223b, i2, i3);
        Resources resources = context.getResources();
        this.f72220c = m50350a.getDimensionPixelSize(C37098Xl4.Badge_badgeRadius, resources.getDimensionPixelSize(C35172Pf4.mtrl_badge_radius));
        this.f72222e = m50350a.getDimensionPixelSize(C37098Xl4.Badge_badgeWidePadding, resources.getDimensionPixelSize(C35172Pf4.mtrl_badge_long_text_horizontal_padding));
        this.f72221d = m50350a.getDimensionPixelSize(C37098Xl4.Badge_badgeWithTextRadius, resources.getDimensionPixelSize(C35172Pf4.mtrl_badge_with_text_radius));
        state2.f72226e = state.f72226e == -2 ? KotlinVersion.MAX_COMPONENT_VALUE : state.f72226e;
        if (state.f72230i == null) {
            charSequence = context.getString(C40534el4.mtrl_badge_numberless_content_description);
        } else {
            charSequence = state.f72230i;
        }
        state2.f72230i = charSequence;
        if (state.f72231j == 0) {
            i4 = C36855Wk4.mtrl_badge_content_description;
        } else {
            i4 = state.f72231j;
        }
        state2.f72231j = i4;
        if (state.f72232k == 0) {
            i5 = C40534el4.mtrl_exceed_max_badge_number_content_description;
        } else {
            i5 = state.f72232k;
        }
        state2.f72232k = i5;
        state2.f72234m = Boolean.valueOf(state.f72234m == null || state.f72234m.booleanValue());
        if (state.f72228g == -2) {
            i6 = m50350a.getInt(C37098Xl4.Badge_maxCharacterCount, 4);
        } else {
            i6 = state.f72228g;
        }
        state2.f72228g = i6;
        if (state.f72227f != -2) {
            state2.f72227f = state.f72227f;
        } else {
            int i7 = C37098Xl4.Badge_number;
            if (m50350a.hasValue(i7)) {
                state2.f72227f = m50350a.getInt(i7, 0);
            } else {
                state2.f72227f = -1;
            }
        }
        if (state.f72224c == null) {
            intValue = m50330u(context, m50350a, C37098Xl4.Badge_backgroundColor);
        } else {
            intValue = state.f72224c.intValue();
        }
        state2.f72224c = Integer.valueOf(intValue);
        if (state.f72225d != null) {
            state2.f72225d = state.f72225d;
        } else {
            int i8 = C37098Xl4.Badge_badgeTextColor;
            if (m50350a.hasValue(i8)) {
                state2.f72225d = Integer.valueOf(m50330u(context, m50350a, i8));
            } else {
                state2.f72225d = Integer.valueOf(new N06(context, C50021ul4.TextAppearance_MaterialComponents_Badge).m94481i().getDefaultColor());
            }
        }
        if (state.f72233l == null) {
            intValue2 = m50350a.getInt(C37098Xl4.Badge_badgeGravity, 8388661);
        } else {
            intValue2 = state.f72233l.intValue();
        }
        state2.f72233l = Integer.valueOf(intValue2);
        if (state.f72235n == null) {
            intValue3 = m50350a.getDimensionPixelOffset(C37098Xl4.Badge_horizontalOffset, 0);
        } else {
            intValue3 = state.f72235n.intValue();
        }
        state2.f72235n = Integer.valueOf(intValue3);
        if (state.f72236o == null) {
            intValue4 = m50350a.getDimensionPixelOffset(C37098Xl4.Badge_verticalOffset, 0);
        } else {
            intValue4 = state.f72236o.intValue();
        }
        state2.f72236o = Integer.valueOf(intValue4);
        if (state.f72237p == null) {
            intValue5 = m50350a.getDimensionPixelOffset(C37098Xl4.Badge_horizontalOffsetWithText, state2.f72235n.intValue());
        } else {
            intValue5 = state.f72237p.intValue();
        }
        state2.f72237p = Integer.valueOf(intValue5);
        if (state.f72238q == null) {
            intValue6 = m50350a.getDimensionPixelOffset(C37098Xl4.Badge_verticalOffsetWithText, state2.f72236o.intValue());
        } else {
            intValue6 = state.f72238q.intValue();
        }
        state2.f72238q = Integer.valueOf(intValue6);
        state2.f72239r = Integer.valueOf(state.f72239r == null ? 0 : state.f72239r.intValue());
        state2.f72240s = Integer.valueOf(state.f72240s != null ? state.f72240s.intValue() : 0);
        m50350a.recycle();
        if (state.f72229h == null) {
            state2.f72229h = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.f72229h = state.f72229h;
        }
        this.f72218a = state;
    }

    /* renamed from: u */
    public static int m50330u(Context context, TypedArray typedArray, int i) {
        return NM2.m94029b(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: a */
    public final TypedArray m50350a(Context context, int i, int i2, int i3) {
        AttributeSet attributeSet;
        int i4;
        int i5;
        if (i != 0) {
            AttributeSet m42012g = C40750f71.m42012g(context, i, "badge");
            i4 = m42012g.getStyleAttribute();
            attributeSet = m42012g;
        } else {
            attributeSet = null;
            i4 = 0;
        }
        if (i4 == 0) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        return C46052o36.m21866i(context, attributeSet, C37098Xl4.Badge, i2, i5, new int[0]);
    }

    /* renamed from: b */
    public int m50349b() {
        return this.f72219b.f72239r.intValue();
    }

    /* renamed from: c */
    public int m50348c() {
        return this.f72219b.f72240s.intValue();
    }

    /* renamed from: d */
    public int m50347d() {
        return this.f72219b.f72226e;
    }

    /* renamed from: e */
    public int m50346e() {
        return this.f72219b.f72224c.intValue();
    }

    /* renamed from: f */
    public int m50345f() {
        return this.f72219b.f72233l.intValue();
    }

    /* renamed from: g */
    public int m50344g() {
        return this.f72219b.f72225d.intValue();
    }

    /* renamed from: h */
    public int m50343h() {
        return this.f72219b.f72232k;
    }

    /* renamed from: i */
    public CharSequence m50342i() {
        return this.f72219b.f72230i;
    }

    /* renamed from: j */
    public int m50341j() {
        return this.f72219b.f72231j;
    }

    /* renamed from: k */
    public int m50340k() {
        return this.f72219b.f72237p.intValue();
    }

    /* renamed from: l */
    public int m50339l() {
        return this.f72219b.f72235n.intValue();
    }

    /* renamed from: m */
    public int m50338m() {
        return this.f72219b.f72228g;
    }

    /* renamed from: n */
    public int m50337n() {
        return this.f72219b.f72227f;
    }

    /* renamed from: o */
    public Locale m50336o() {
        return this.f72219b.f72229h;
    }

    /* renamed from: p */
    public State m50335p() {
        return this.f72218a;
    }

    /* renamed from: q */
    public int m50334q() {
        return this.f72219b.f72238q.intValue();
    }

    /* renamed from: r */
    public int m50333r() {
        return this.f72219b.f72236o.intValue();
    }

    /* renamed from: s */
    public boolean m50332s() {
        return this.f72219b.f72227f != -1;
    }

    /* renamed from: t */
    public boolean m50331t() {
        return this.f72219b.f72234m.booleanValue();
    }

    /* renamed from: v */
    public void m50329v(int i) {
        this.f72218a.f72226e = i;
        this.f72219b.f72226e = i;
    }

    /* loaded from: classes6.dex */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new C17670a();

        /* renamed from: b */
        public int f72223b;

        /* renamed from: c */
        public Integer f72224c;

        /* renamed from: d */
        public Integer f72225d;

        /* renamed from: e */
        public int f72226e;

        /* renamed from: f */
        public int f72227f;

        /* renamed from: g */
        public int f72228g;

        /* renamed from: h */
        public Locale f72229h;

        /* renamed from: i */
        public CharSequence f72230i;

        /* renamed from: j */
        public int f72231j;

        /* renamed from: k */
        public int f72232k;

        /* renamed from: l */
        public Integer f72233l;

        /* renamed from: m */
        public Boolean f72234m;

        /* renamed from: n */
        public Integer f72235n;

        /* renamed from: o */
        public Integer f72236o;

        /* renamed from: p */
        public Integer f72237p;

        /* renamed from: q */
        public Integer f72238q;

        /* renamed from: r */
        public Integer f72239r;

        /* renamed from: s */
        public Integer f72240s;

        /* renamed from: com.google.android.material.badge.BadgeState$State$a */
        /* loaded from: classes6.dex */
        public class C17670a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this.f72226e = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f72227f = -2;
            this.f72228g = -2;
            this.f72234m = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            String charSequence;
            parcel.writeInt(this.f72223b);
            parcel.writeSerializable(this.f72224c);
            parcel.writeSerializable(this.f72225d);
            parcel.writeInt(this.f72226e);
            parcel.writeInt(this.f72227f);
            parcel.writeInt(this.f72228g);
            CharSequence charSequence2 = this.f72230i;
            if (charSequence2 == null) {
                charSequence = null;
            } else {
                charSequence = charSequence2.toString();
            }
            parcel.writeString(charSequence);
            parcel.writeInt(this.f72231j);
            parcel.writeSerializable(this.f72233l);
            parcel.writeSerializable(this.f72235n);
            parcel.writeSerializable(this.f72236o);
            parcel.writeSerializable(this.f72237p);
            parcel.writeSerializable(this.f72238q);
            parcel.writeSerializable(this.f72239r);
            parcel.writeSerializable(this.f72240s);
            parcel.writeSerializable(this.f72234m);
            parcel.writeSerializable(this.f72229h);
        }

        public State(Parcel parcel) {
            this.f72226e = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f72227f = -2;
            this.f72228g = -2;
            this.f72234m = Boolean.TRUE;
            this.f72223b = parcel.readInt();
            this.f72224c = (Integer) parcel.readSerializable();
            this.f72225d = (Integer) parcel.readSerializable();
            this.f72226e = parcel.readInt();
            this.f72227f = parcel.readInt();
            this.f72228g = parcel.readInt();
            this.f72230i = parcel.readString();
            this.f72231j = parcel.readInt();
            this.f72233l = (Integer) parcel.readSerializable();
            this.f72235n = (Integer) parcel.readSerializable();
            this.f72236o = (Integer) parcel.readSerializable();
            this.f72237p = (Integer) parcel.readSerializable();
            this.f72238q = (Integer) parcel.readSerializable();
            this.f72239r = (Integer) parcel.readSerializable();
            this.f72240s = (Integer) parcel.readSerializable();
            this.f72234m = (Boolean) parcel.readSerializable();
            this.f72229h = (Locale) parcel.readSerializable();
        }
    }
}
