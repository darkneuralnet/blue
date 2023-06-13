package p000;

import android.graphics.Typeface;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC44199kw1;
import p000.C1577Df;
import p000.InterfaceC32105Cc6;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010/\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010.R\u001a\u00103\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b,\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00109R\u001a\u0010?\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b5\u0010>R\u0014\u0010B\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010AR\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010AR\u0014\u0010E\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010D¨\u0006H"}, m28432d2 = {"Lkd;", "LAE3;", "", C17296a.f69688o, "Ljava/lang/String;", "getText", "()Ljava/lang/String;", Entry.TYPE_TEXT, "LG26;", "b", "LG26;", "i", "()LG26;", "style", "", "LDf$b;", "LGN5;", "c", "Ljava/util/List;", "getSpanStyles", "()Ljava/util/List;", "spanStyles", "LTU3;", DateTokenConverter.CONVERTER_KEY, "getPlaceholders", "placeholders", "Lkw1$b;", "e", "Lkw1$b;", "g", "()Lkw1$b;", "fontFamilyResolver", "Lg01;", "f", "Lg01;", "getDensity", "()Lg01;", "density", "LQd;", "LQd;", "k", "()LQd;", "textPaint", "", "h", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "charSequence", "Lwm2;", "Lwm2;", "()Lwm2;", "layoutIntrinsics", "Lwc6;", "j", "Lwc6;", "resolvedTypefaces", "", "Z", "emojiCompatProcessed", "", "l", "I", "()I", "textDirectionHeuristic", "", "()F", "maxIntrinsicWidth", "minIntrinsicWidth", "()Z", "hasStaleResolvedFonts", "<init>", "(Ljava/lang/String;LG26;Ljava/util/List;Ljava/util/List;Lkw1$b;Lg01;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kd */
/* loaded from: classes.dex */
public final class C25194kd implements AE3 {

    /* renamed from: a */
    public final String f94659a;

    /* renamed from: b */
    public final G26 f94660b;

    /* renamed from: c */
    public final List<C1577Df.C1580b<GN5>> f94661c;

    /* renamed from: d */
    public final List<C1577Df.C1580b<TU3>> f94662d;

    /* renamed from: e */
    public final AbstractC44199kw1.InterfaceC25559b f94663e;

    /* renamed from: f */
    public final InterfaceC41273g01 f94664f;

    /* renamed from: g */
    public final C6816Qd f94665g;

    /* renamed from: h */
    public final CharSequence f94666h;

    /* renamed from: i */
    public final C51214wm2 f94667i;

    /* renamed from: j */
    public C51118wc6 f94668j;

    /* renamed from: k */
    public final boolean f94669k;

    /* renamed from: l */
    public final int f94670l;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkw1;", "fontFamily", "LJw1;", "fontWeight", "LEw1;", "fontStyle", "LFw1;", "fontSynthesis", "Landroid/graphics/Typeface;", C17296a.f69688o, "(Lkw1;LJw1;II)Landroid/graphics/Typeface;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kd$a */
    /* loaded from: classes.dex */
    public static final class C25195a extends Lambda implements Function4<AbstractC44199kw1, C33918Jw1, C32748Ew1, C32982Fw1, Typeface> {
        public C25195a() {
            super(4);
        }

        /* renamed from: a */
        public final Typeface m28718a(AbstractC44199kw1 abstractC44199kw1, C33918Jw1 fontWeight, int i, int i2) {
            Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
            InterfaceC48627sP5<Object> mo24699a = C25194kd.this.m28723g().mo24699a(abstractC44199kw1, fontWeight, i, i2);
            if (!(mo24699a instanceof InterfaceC32105Cc6.C1107b)) {
                C51118wc6 c51118wc6 = new C51118wc6(mo24699a, C25194kd.this.f94668j);
                C25194kd.this.f94668j = c51118wc6;
                return c51118wc6.m6592a();
            }
            Object value = mo24699a.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) value;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Typeface invoke(AbstractC44199kw1 abstractC44199kw1, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1) {
            return m28718a(abstractC44199kw1, c33918Jw1, c32748Ew1.m108203i(), c32982Fw1.m106233m());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<Df$b<GN5>>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public C25194kd(String text, G26 style, List<C1577Df.C1580b<GN5>> spanStyles, List<C1577Df.C1580b<TU3>> placeholders, AbstractC44199kw1.InterfaceC25559b fontFamilyResolver, InterfaceC41273g01 density) {
        boolean m27084c;
        boolean booleanValue;
        C1577Df.C1580b<GN5> c1580b;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f94659a = text;
        this.f94660b = style;
        this.f94661c = spanStyles;
        this.f94662d = placeholders;
        this.f94663e = fontFamilyResolver;
        this.f94664f = density;
        C6816Qd c6816Qd = new C6816Qd(1, density.mo3408b());
        this.f94665g = c6816Qd;
        m27084c = C25743ld.m27084c(style);
        if (!m27084c) {
            booleanValue = false;
        } else {
            booleanValue = C51686xa1.f117819a.mo3251a().getValue().booleanValue();
        }
        this.f94669k = booleanValue;
        this.f94670l = C25743ld.m27083d(style.m105933D(), style.m105902w());
        C25195a c25195a = new C25195a();
        C46042o26.m21954e(c6816Qd, style.m105930G());
        GN5 m21958a = C46042o26.m21958a(c6816Qd, style.m105925L(), c25195a, density, !((Collection) spanStyles).isEmpty());
        if (m21958a != null) {
            int size = spanStyles.size() + 1;
            spanStyles = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    c1580b = new C1577Df.C1580b<>(m21958a, 0, this.f94659a.length());
                } else {
                    c1580b = this.f94661c.get(i - 1);
                }
                spanStyles.add(c1580b);
            }
        }
        CharSequence m30197a = C24958jd.m30197a(this.f94659a, this.f94665g.getTextSize(), this.f94660b, spanStyles, this.f94662d, this.f94664f, c25195a, this.f94669k);
        this.f94666h = m30197a;
        this.f94667i = new C51214wm2(m30197a, this.f94665g, this.f94670l);
    }

    @Override // p000.AE3
    /* renamed from: a */
    public float mo28729a() {
        return this.f94667i.m6378c();
    }

    @Override // p000.AE3
    /* renamed from: b */
    public boolean mo28728b() {
        boolean z;
        boolean m27084c;
        C51118wc6 c51118wc6 = this.f94668j;
        if (c51118wc6 != null) {
            z = c51118wc6.m6591b();
        } else {
            z = false;
        }
        if (!z) {
            if (this.f94669k) {
                return false;
            }
            m27084c = C25743ld.m27084c(this.f94660b);
            if (!m27084c || !C51686xa1.f117819a.mo3251a().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AE3
    /* renamed from: c */
    public float mo28727c() {
        return this.f94667i.m6379b();
    }

    /* renamed from: f */
    public final CharSequence m28724f() {
        return this.f94666h;
    }

    /* renamed from: g */
    public final AbstractC44199kw1.InterfaceC25559b m28723g() {
        return this.f94663e;
    }

    /* renamed from: h */
    public final C51214wm2 m28722h() {
        return this.f94667i;
    }

    /* renamed from: i */
    public final G26 m28721i() {
        return this.f94660b;
    }

    /* renamed from: j */
    public final int m28720j() {
        return this.f94670l;
    }

    /* renamed from: k */
    public final C6816Qd m28719k() {
        return this.f94665g;
    }
}
