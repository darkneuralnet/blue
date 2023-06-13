package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.skydoves.balloon.vectortext.VectorTextView;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\f\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0000¨\u0006\u0010"}, m28432d2 = {"Landroid/widget/TextView;", "LI16;", "textForm", "", "c", "", Entry.TYPE_TEXT, "Landroid/text/Spanned;", DateTokenConverter.CONVERTER_KEY, "Lcom/skydoves/balloon/vectortext/VectorTextView;", "LzP1;", "iconForm", "b", "Lkk6;", "vectorTextViewParams", C17296a.f69688o, "balloon_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: V26 */
/* loaded from: classes6.dex */
public final class V26 {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: V26$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C8537a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BP1.values().length];
            iArr[BP1.START.ordinal()] = 1;
            iArr[BP1.TOP.ordinal()] = 2;
            iArr[BP1.BOTTOM.ordinal()] = 3;
            iArr[BP1.END.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m80472a(TextView textView, C44084kk6 vectorTextViewParams) {
        Drawable drawable;
        Drawable m28549e;
        Drawable drawable2;
        Drawable m28551c;
        Drawable drawable3;
        Drawable m28545i;
        Integer m28553a;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(vectorTextViewParams, "vectorTextViewParams");
        Integer m28542l = vectorTextViewParams.m28542l();
        Drawable drawable4 = null;
        if (m28542l == null) {
            Integer m28543k = vectorTextViewParams.m28543k();
            if (m28543k != null) {
                m28542l = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(m28543k.intValue()));
            } else {
                m28542l = null;
            }
            if (m28542l == null) {
                Integer m28540n = vectorTextViewParams.m28540n();
                if (m28540n != null) {
                    m28542l = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(m28540n.intValue()));
                } else {
                    m28542l = null;
                }
            }
        }
        Integer m28541m = vectorTextViewParams.m28541m();
        if (m28541m == null) {
            Integer m28538p = vectorTextViewParams.m28538p();
            if (m28538p != null) {
                m28541m = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(m28538p.intValue()));
            } else {
                m28541m = null;
            }
            if (m28541m == null) {
                Integer m28540n2 = vectorTextViewParams.m28540n();
                if (m28540n2 != null) {
                    m28541m = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(m28540n2.intValue()));
                } else {
                    m28541m = null;
                }
            }
        }
        Drawable m28547g = vectorTextViewParams.m28547g();
        if (m28547g == null) {
            Integer m28546h = vectorTextViewParams.m28546h();
            if (m28546h != null) {
                m28547g = C29611vi.m8248b(textView.getContext(), m28546h.intValue());
            } else {
                m28547g = null;
            }
        }
        if (m28547g != null) {
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Drawable m84312f = T61.m84312f(m28547g, context, m28541m, m28542l);
            if (m84312f != null) {
                drawable = T61.m84311g(m84312f, vectorTextViewParams.m28539o());
                m28549e = vectorTextViewParams.m28549e();
                if (m28549e == null) {
                    Integer m28548f = vectorTextViewParams.m28548f();
                    if (m28548f != null) {
                        m28549e = C29611vi.m8248b(textView.getContext(), m28548f.intValue());
                    } else {
                        m28549e = null;
                    }
                }
                if (m28549e != null) {
                    Context context2 = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "context");
                    Drawable m84312f2 = T61.m84312f(m28549e, context2, m28541m, m28542l);
                    if (m84312f2 != null) {
                        drawable2 = T61.m84311g(m84312f2, vectorTextViewParams.m28539o());
                        m28551c = vectorTextViewParams.m28551c();
                        if (m28551c == null) {
                            Integer m28550d = vectorTextViewParams.m28550d();
                            if (m28550d != null) {
                                m28551c = C29611vi.m8248b(textView.getContext(), m28550d.intValue());
                            } else {
                                m28551c = null;
                            }
                        }
                        if (m28551c != null) {
                            Context context3 = textView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "context");
                            Drawable m84312f3 = T61.m84312f(m28551c, context3, m28541m, m28542l);
                            if (m84312f3 != null) {
                                drawable3 = T61.m84311g(m84312f3, vectorTextViewParams.m28539o());
                                m28545i = vectorTextViewParams.m28545i();
                                if (m28545i == null) {
                                    Integer m28544j = vectorTextViewParams.m28544j();
                                    if (m28544j != null) {
                                        m28545i = C29611vi.m8248b(textView.getContext(), m28544j.intValue());
                                    } else {
                                        m28545i = null;
                                    }
                                }
                                if (m28545i != null) {
                                    Context context4 = textView.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context4, "context");
                                    Drawable m84312f4 = T61.m84312f(m28545i, context4, m28541m, m28542l);
                                    if (m84312f4 != null) {
                                        drawable4 = T61.m84311g(m84312f4, vectorTextViewParams.m28539o());
                                    }
                                }
                                if (!vectorTextViewParams.m28537q()) {
                                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable4, drawable, drawable3);
                                } else {
                                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable4, drawable2, drawable3);
                                }
                                m28553a = vectorTextViewParams.m28553a();
                                if (m28553a == null) {
                                    textView.setCompoundDrawablePadding(m28553a.intValue());
                                    return;
                                }
                                Integer m28552b = vectorTextViewParams.m28552b();
                                if (m28552b != null) {
                                    textView.setCompoundDrawablePadding(textView.getContext().getResources().getDimensionPixelSize(m28552b.intValue()));
                                    return;
                                }
                                return;
                            }
                        }
                        drawable3 = null;
                        m28545i = vectorTextViewParams.m28545i();
                        if (m28545i == null) {
                        }
                        if (m28545i != null) {
                        }
                        if (!vectorTextViewParams.m28537q()) {
                        }
                        m28553a = vectorTextViewParams.m28553a();
                        if (m28553a == null) {
                        }
                    }
                }
                drawable2 = null;
                m28551c = vectorTextViewParams.m28551c();
                if (m28551c == null) {
                }
                if (m28551c != null) {
                }
                drawable3 = null;
                m28545i = vectorTextViewParams.m28545i();
                if (m28545i == null) {
                }
                if (m28545i != null) {
                }
                if (!vectorTextViewParams.m28537q()) {
                }
                m28553a = vectorTextViewParams.m28553a();
                if (m28553a == null) {
                }
            }
        }
        drawable = null;
        m28549e = vectorTextViewParams.m28549e();
        if (m28549e == null) {
        }
        if (m28549e != null) {
        }
        drawable2 = null;
        m28551c = vectorTextViewParams.m28551c();
        if (m28551c == null) {
        }
        if (m28551c != null) {
        }
        drawable3 = null;
        m28545i = vectorTextViewParams.m28545i();
        if (m28545i == null) {
        }
        if (m28545i != null) {
        }
        if (!vectorTextViewParams.m28537q()) {
        }
        m28553a = vectorTextViewParams.m28553a();
        if (m28553a == null) {
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m80471b(VectorTextView vectorTextView, C52773zP1 iconForm) {
        boolean z;
        Intrinsics.checkNotNullParameter(vectorTextView, "<this>");
        Intrinsics.checkNotNullParameter(iconForm, "iconForm");
        if (iconForm.m1412a() != null) {
            int m1406g = iconForm.m1406g();
            int m1408e = iconForm.m1408e();
            int m1407f = iconForm.m1407f();
            Integer valueOf = Integer.valueOf(iconForm.m1410c());
            if (valueOf.intValue() != Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            if (!Boolean.valueOf(z).booleanValue()) {
                valueOf = null;
            }
            C44084kk6 c44084kk6 = new C44084kk6(null, null, null, null, null, null, null, null, false, Integer.valueOf(m1407f), Integer.valueOf(m1406g), Integer.valueOf(m1408e), null, valueOf, null, null, null, 119295, null);
            int i = C8537a.$EnumSwitchMapping$0[iconForm.m1409d().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            c44084kk6.m28534t(iconForm.m1412a());
                            c44084kk6.m28533u(iconForm.m1411b());
                        }
                    } else {
                        c44084kk6.m28536r(iconForm.m1412a());
                        c44084kk6.m28535s(iconForm.m1411b());
                    }
                } else {
                    c44084kk6.m28530x(iconForm.m1412a());
                    c44084kk6.m28529y(iconForm.m1411b());
                }
            } else {
                c44084kk6.m28532v(iconForm.m1412a());
                c44084kk6.m28531w(iconForm.m1411b());
            }
            vectorTextView.setDrawableTextViewParams(c44084kk6);
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m80470c(TextView textView, I16 textForm) {
        CharSequence m103074b;
        Unit unit;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(textForm, "textForm");
        boolean m103071e = textForm.m103071e();
        if (m103071e) {
            m103074b = m80469d(textForm.m103074b().toString());
        } else if (!m103071e) {
            m103074b = textForm.m103074b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setText(m103074b);
        textView.setTextSize(textForm.m103070f());
        textView.setGravity(textForm.m103072d());
        textView.setTextColor(textForm.m103073c());
        Typeface m103068h = textForm.m103068h();
        if (m103068h != null) {
            textView.setTypeface(m103068h);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            textView.setTypeface(textView.getTypeface(), textForm.m103069g());
        }
        MovementMethod m103075a = textForm.m103075a();
        if (m103075a != null) {
            textView.setMovementMethod(m103075a);
        }
    }

    /* renamed from: d */
    public static final Spanned m80469d(String str) {
        return Html.fromHtml(str, 0);
    }
}
