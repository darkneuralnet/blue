package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import co.bird.android.widget.BatteryViewV2;
/* renamed from: nu6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45963nu6 implements InterfaceC34094Kp6 {

    /* renamed from: A */
    public final ImageView f101019A;

    /* renamed from: B */
    public final ImageView f101020B;

    /* renamed from: C */
    public final Guideline f101021C;

    /* renamed from: D */
    public final View f101022D;

    /* renamed from: E */
    public final Space f101023E;

    /* renamed from: F */
    public final Barrier f101024F;

    /* renamed from: G */
    public final TextView f101025G;

    /* renamed from: H */
    public final Group f101026H;

    /* renamed from: I */
    public final ImageView f101027I;

    /* renamed from: J */
    public final TextView f101028J;

    /* renamed from: K */
    public final TextView f101029K;

    /* renamed from: L */
    public final Barrier f101030L;

    /* renamed from: M */
    public final ImageView f101031M;

    /* renamed from: N */
    public final TextView f101032N;

    /* renamed from: O */
    public final TextView f101033O;

    /* renamed from: P */
    public final TextView f101034P;

    /* renamed from: Q */
    public final ImageView f101035Q;

    /* renamed from: a */
    public final View f101036a;

    /* renamed from: b */
    public final TextView f101037b;

    /* renamed from: c */
    public final TextView f101038c;

    /* renamed from: d */
    public final Barrier f101039d;

    /* renamed from: e */
    public final BatteryViewV2 f101040e;

    /* renamed from: f */
    public final TextView f101041f;

    /* renamed from: g */
    public final Barrier f101042g;

    /* renamed from: h */
    public final ImageView f101043h;

    /* renamed from: i */
    public final TextView f101044i;

    /* renamed from: j */
    public final Barrier f101045j;

    /* renamed from: k */
    public final ImageView f101046k;

    /* renamed from: l */
    public final TextView f101047l;

    /* renamed from: m */
    public final TextView f101048m;

    /* renamed from: n */
    public final TextView f101049n;

    /* renamed from: o */
    public final Barrier f101050o;

    /* renamed from: p */
    public final ImageView f101051p;

    /* renamed from: q */
    public final View f101052q;

    /* renamed from: r */
    public final Guideline f101053r;

    /* renamed from: s */
    public final TextView f101054s;

    /* renamed from: t */
    public final TextView f101055t;

    /* renamed from: u */
    public final Barrier f101056u;

    /* renamed from: v */
    public final Barrier f101057v;

    /* renamed from: w */
    public final TextView f101058w;

    /* renamed from: x */
    public final TextView f101059x;

    /* renamed from: y */
    public final TextView f101060y;

    /* renamed from: z */
    public final TextView f101061z;

    public C45963nu6(View view, TextView textView, TextView textView2, Barrier barrier, BatteryViewV2 batteryViewV2, TextView textView3, Barrier barrier2, ImageView imageView, TextView textView4, Barrier barrier3, ImageView imageView2, TextView textView5, TextView textView6, TextView textView7, Barrier barrier4, ImageView imageView3, View view2, Guideline guideline, TextView textView8, TextView textView9, Barrier barrier5, Barrier barrier6, TextView textView10, TextView textView11, TextView textView12, TextView textView13, ImageView imageView4, ImageView imageView5, Guideline guideline2, View view3, Space space, Barrier barrier7, TextView textView14, Group group, ImageView imageView6, TextView textView15, TextView textView16, Barrier barrier8, ImageView imageView7, TextView textView17, TextView textView18, TextView textView19, ImageView imageView8) {
        this.f101036a = view;
        this.f101037b = textView;
        this.f101038c = textView2;
        this.f101039d = barrier;
        this.f101040e = batteryViewV2;
        this.f101041f = textView3;
        this.f101042g = barrier2;
        this.f101043h = imageView;
        this.f101044i = textView4;
        this.f101045j = barrier3;
        this.f101046k = imageView2;
        this.f101047l = textView5;
        this.f101048m = textView6;
        this.f101049n = textView7;
        this.f101050o = barrier4;
        this.f101051p = imageView3;
        this.f101052q = view2;
        this.f101053r = guideline;
        this.f101054s = textView8;
        this.f101055t = textView9;
        this.f101056u = barrier5;
        this.f101057v = barrier6;
        this.f101058w = textView10;
        this.f101059x = textView11;
        this.f101060y = textView12;
        this.f101061z = textView13;
        this.f101019A = imageView4;
        this.f101020B = imageView5;
        this.f101021C = guideline2;
        this.f101022D = view3;
        this.f101023E = space;
        this.f101024F = barrier7;
        this.f101025G = textView14;
        this.f101026H = group;
        this.f101027I = imageView6;
        this.f101028J = textView15;
        this.f101029K = textView16;
        this.f101030L = barrier8;
        this.f101031M = imageView7;
        this.f101032N = textView17;
        this.f101033O = textView18;
        this.f101034P = textView19;
        this.f101035Q = imageView8;
    }

    /* renamed from: a */
    public static C45963nu6 m22195a(View view) {
        View m96312a;
        View m96312a2;
        int i = C52955zi4.average;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C52955zi4.battery;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C52955zi4.batteryBarrier;
                Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
                if (barrier != null) {
                    i = C52955zi4.batteryLevel;
                    BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
                    if (batteryViewV2 != null) {
                        i = C52955zi4.brain;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C52955zi4.brainBarrier;
                            Barrier barrier2 = (Barrier) C34328Lp6.m96312a(view, i);
                            if (barrier2 != null) {
                                i = C52955zi4.brainIcon;
                                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView != null) {
                                    i = C52955zi4.brand;
                                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView4 != null) {
                                        i = C52955zi4.brandBarrier;
                                        Barrier barrier3 = (Barrier) C34328Lp6.m96312a(view, i);
                                        if (barrier3 != null) {
                                            i = C52955zi4.brandIcon;
                                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                            if (imageView2 != null) {
                                                i = C52955zi4.caption;
                                                TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView5 != null) {
                                                    i = C52955zi4.code;
                                                    TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView6 != null) {
                                                        i = C52955zi4.condition;
                                                        TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                        if (textView7 != null) {
                                                            i = C52955zi4.conditionBarrier;
                                                            Barrier barrier4 = (Barrier) C34328Lp6.m96312a(view, i);
                                                            if (barrier4 != null) {
                                                                i = C52955zi4.conditionIcon;
                                                                ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                if (imageView3 != null && (m96312a = C34328Lp6.m96312a(view, (i = C52955zi4.divider))) != null) {
                                                                    i = C52955zi4.guide;
                                                                    Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
                                                                    if (guideline != null) {
                                                                        i = C52955zi4.label1;
                                                                        TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                                        if (textView8 != null) {
                                                                            i = C52955zi4.label2;
                                                                            TextView textView9 = (TextView) C34328Lp6.m96312a(view, i);
                                                                            if (textView9 != null) {
                                                                                i = C52955zi4.labelBarrier;
                                                                                Barrier barrier5 = (Barrier) C34328Lp6.m96312a(view, i);
                                                                                if (barrier5 != null) {
                                                                                    i = C52955zi4.lastCellularBarrier;
                                                                                    Barrier barrier6 = (Barrier) C34328Lp6.m96312a(view, i);
                                                                                    if (barrier6 != null) {
                                                                                        i = C52955zi4.lastCellularTrack;
                                                                                        TextView textView10 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                        if (textView10 != null) {
                                                                                            i = C52955zi4.lastCellularTrackLabel;
                                                                                            TextView textView11 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                            if (textView11 != null) {
                                                                                                i = C52955zi4.markerLabel;
                                                                                                TextView textView12 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                if (textView12 != null) {
                                                                                                    i = C52955zi4.signal;
                                                                                                    TextView textView13 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                    if (textView13 != null) {
                                                                                                        i = C52955zi4.signalIcon;
                                                                                                        ImageView imageView4 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                                        if (imageView4 != null) {
                                                                                                            i = C52955zi4.star;
                                                                                                            ImageView imageView5 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                                            if (imageView5 != null) {
                                                                                                                i = C52955zi4.startGuideline;
                                                                                                                Guideline guideline2 = (Guideline) C34328Lp6.m96312a(view, i);
                                                                                                                if (guideline2 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C52955zi4.statusBackground))) != null) {
                                                                                                                    i = C52955zi4.statusBackgroundBottomSpace;
                                                                                                                    Space space = (Space) C34328Lp6.m96312a(view, i);
                                                                                                                    if (space != null) {
                                                                                                                        i = C52955zi4.statusBarrier;
                                                                                                                        Barrier barrier7 = (Barrier) C34328Lp6.m96312a(view, i);
                                                                                                                        if (barrier7 != null) {
                                                                                                                            i = C52955zi4.statusDescription;
                                                                                                                            TextView textView14 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                            if (textView14 != null) {
                                                                                                                                i = C52955zi4.statusGroup;
                                                                                                                                Group group = (Group) C34328Lp6.m96312a(view, i);
                                                                                                                                if (group != null) {
                                                                                                                                    i = C52955zi4.statusIcon;
                                                                                                                                    ImageView imageView6 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                                                                    if (imageView6 != null) {
                                                                                                                                        i = C52955zi4.statusTitle;
                                                                                                                                        TextView textView15 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                                        if (textView15 != null) {
                                                                                                                                            i = C52955zi4.time;
                                                                                                                                            TextView textView16 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                                            if (textView16 != null) {
                                                                                                                                                i = C52955zi4.timeBarrier;
                                                                                                                                                Barrier barrier8 = (Barrier) C34328Lp6.m96312a(view, i);
                                                                                                                                                if (barrier8 != null) {
                                                                                                                                                    i = C52955zi4.timeIcon;
                                                                                                                                                    ImageView imageView7 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                                                                                    if (imageView7 != null) {
                                                                                                                                                        i = C52955zi4.title;
                                                                                                                                                        TextView textView17 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                            i = C52955zi4.value1;
                                                                                                                                                            TextView textView18 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                i = C52955zi4.value2;
                                                                                                                                                                TextView textView19 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                                                                                                if (textView19 != null) {
                                                                                                                                                                    i = C52955zi4.vehicleImage;
                                                                                                                                                                    ImageView imageView8 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                                                                                                    if (imageView8 != null) {
                                                                                                                                                                        return new C45963nu6(view, textView, textView2, barrier, batteryViewV2, textView3, barrier2, imageView, textView4, barrier3, imageView2, textView5, textView6, textView7, barrier4, imageView3, m96312a, guideline, textView8, textView9, barrier5, barrier6, textView10, textView11, textView12, textView13, imageView4, imageView5, guideline2, m96312a2, space, barrier7, textView14, group, imageView6, textView15, textView16, barrier8, imageView7, textView17, textView18, textView19, imageView8);
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

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f101036a;
    }
}
