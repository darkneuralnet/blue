package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
/* renamed from: nj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45847nj0 implements InterfaceC34094Kp6 {

    /* renamed from: A */
    public final TextView f100392A;

    /* renamed from: B */
    public final TextView f100393B;

    /* renamed from: C */
    public final TextView f100394C;

    /* renamed from: D */
    public final TextView f100395D;

    /* renamed from: a */
    public final ScrollView f100396a;

    /* renamed from: b */
    public final Barrier f100397b;

    /* renamed from: c */
    public final Barrier f100398c;

    /* renamed from: d */
    public final Barrier f100399d;

    /* renamed from: e */
    public final Barrier f100400e;

    /* renamed from: f */
    public final TextView f100401f;

    /* renamed from: g */
    public final Group f100402g;

    /* renamed from: h */
    public final TextView f100403h;

    /* renamed from: i */
    public final TextView f100404i;

    /* renamed from: j */
    public final TextView f100405j;

    /* renamed from: k */
    public final Guideline f100406k;

    /* renamed from: l */
    public final TextView f100407l;

    /* renamed from: m */
    public final TextView f100408m;

    /* renamed from: n */
    public final TextView f100409n;

    /* renamed from: o */
    public final TextView f100410o;

    /* renamed from: p */
    public final TextView f100411p;

    /* renamed from: q */
    public final TextView f100412q;

    /* renamed from: r */
    public final TextView f100413r;

    /* renamed from: s */
    public final TextView f100414s;

    /* renamed from: t */
    public final TextView f100415t;

    /* renamed from: u */
    public final TextView f100416u;

    /* renamed from: v */
    public final TextView f100417v;

    /* renamed from: w */
    public final Group f100418w;

    /* renamed from: x */
    public final TextView f100419x;

    /* renamed from: y */
    public final TextView f100420y;

    /* renamed from: z */
    public final Group f100421z;

    public C45847nj0(ScrollView scrollView, Barrier barrier, Barrier barrier2, Barrier barrier3, Barrier barrier4, TextView textView, Group group, TextView textView2, TextView textView3, TextView textView4, Guideline guideline, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, Group group2, TextView textView16, TextView textView17, Group group3, TextView textView18, TextView textView19, TextView textView20, TextView textView21) {
        this.f100396a = scrollView;
        this.f100397b = barrier;
        this.f100398c = barrier2;
        this.f100399d = barrier3;
        this.f100400e = barrier4;
        this.f100401f = textView;
        this.f100402g = group;
        this.f100403h = textView2;
        this.f100404i = textView3;
        this.f100405j = textView4;
        this.f100406k = guideline;
        this.f100407l = textView5;
        this.f100408m = textView6;
        this.f100409n = textView7;
        this.f100410o = textView8;
        this.f100411p = textView9;
        this.f100412q = textView10;
        this.f100413r = textView11;
        this.f100414s = textView12;
        this.f100415t = textView13;
        this.f100416u = textView14;
        this.f100417v = textView15;
        this.f100418w = group2;
        this.f100419x = textView16;
        this.f100420y = textView17;
        this.f100421z = group3;
        this.f100392A = textView18;
        this.f100393B = textView19;
        this.f100394C = textView20;
        this.f100395D = textView21;
    }

    /* renamed from: a */
    public static C45847nj0 m23273a(View view) {
        int i = C33093Gi4.barrierRequestSize;
        Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
        if (barrier != null) {
            i = C33093Gi4.barrierRequestTime;
            Barrier barrier2 = (Barrier) C34328Lp6.m96312a(view, i);
            if (barrier2 != null) {
                i = C33093Gi4.barrierResponseSize;
                Barrier barrier3 = (Barrier) C34328Lp6.m96312a(view, i);
                if (barrier3 != null) {
                    i = C33093Gi4.barrierResponseTime;
                    Barrier barrier4 = (Barrier) C34328Lp6.m96312a(view, i);
                    if (barrier4 != null) {
                        i = C33093Gi4.cipherSuite;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C33093Gi4.cipherSuiteGroup;
                            Group group = (Group) C34328Lp6.m96312a(view, i);
                            if (group != null) {
                                i = C33093Gi4.cipherSuiteValue;
                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView2 != null) {
                                    i = C33093Gi4.duration;
                                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView3 != null) {
                                        i = C33093Gi4.method;
                                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView4 != null) {
                                            i = C33093Gi4.overviewGuideline;
                                            Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
                                            if (guideline != null) {
                                                i = C33093Gi4.protocol;
                                                TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView5 != null) {
                                                    i = C33093Gi4.requestSize;
                                                    TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView6 != null) {
                                                        i = C33093Gi4.requestSizeLabel;
                                                        TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                        if (textView7 != null) {
                                                            i = C33093Gi4.requestTime;
                                                            TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                            if (textView8 != null) {
                                                                i = C33093Gi4.requestTimeLabel;
                                                                TextView textView9 = (TextView) C34328Lp6.m96312a(view, i);
                                                                if (textView9 != null) {
                                                                    i = C33093Gi4.response;
                                                                    TextView textView10 = (TextView) C34328Lp6.m96312a(view, i);
                                                                    if (textView10 != null) {
                                                                        i = C33093Gi4.responseSize;
                                                                        TextView textView11 = (TextView) C34328Lp6.m96312a(view, i);
                                                                        if (textView11 != null) {
                                                                            i = C33093Gi4.responseSizeLabel;
                                                                            TextView textView12 = (TextView) C34328Lp6.m96312a(view, i);
                                                                            if (textView12 != null) {
                                                                                i = C33093Gi4.responseTime;
                                                                                TextView textView13 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                if (textView13 != null) {
                                                                                    i = C33093Gi4.responseTimeLabel;
                                                                                    TextView textView14 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                    if (textView14 != null) {
                                                                                        i = C33093Gi4.ssl;
                                                                                        TextView textView15 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                        if (textView15 != null) {
                                                                                            i = C33093Gi4.sslGroup;
                                                                                            Group group2 = (Group) C34328Lp6.m96312a(view, i);
                                                                                            if (group2 != null) {
                                                                                                i = C33093Gi4.sslValue;
                                                                                                TextView textView16 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                if (textView16 != null) {
                                                                                                    i = C33093Gi4.status;
                                                                                                    TextView textView17 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                    if (textView17 != null) {
                                                                                                        i = C33093Gi4.tlsGroup;
                                                                                                        Group group3 = (Group) C34328Lp6.m96312a(view, i);
                                                                                                        if (group3 != null) {
                                                                                                            i = C33093Gi4.tlsVersion;
                                                                                                            TextView textView18 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                            if (textView18 != null) {
                                                                                                                i = C33093Gi4.tlsVersionValue;
                                                                                                                TextView textView19 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                if (textView19 != null) {
                                                                                                                    i = C33093Gi4.totalSize;
                                                                                                                    TextView textView20 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                    if (textView20 != null) {
                                                                                                                        i = C33093Gi4.url;
                                                                                                                        TextView textView21 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                        if (textView21 != null) {
                                                                                                                            return new C45847nj0((ScrollView) view, barrier, barrier2, barrier3, barrier4, textView, group, textView2, textView3, textView4, guideline, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, group2, textView16, textView17, group3, textView18, textView19, textView20, textView21);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C45847nj0 m23271c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48825sk4.chucker_fragment_transaction_overview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m23273a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f100396a;
    }
}
