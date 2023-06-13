package com.skydoves.balloon;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.method.MovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.C52773zP1;
import p000.I16;
@Metadata(m28433d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0091\u0001B\u001b\b\u0002\u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010g\u001a\u00020d¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J \u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\b\u0010 \u001a\u00020\u0002H\u0002J\b\u0010!\u001a\u00020\u0002H\u0002J\b\u0010\"\u001a\u00020\u0002H\u0002J\b\u0010#\u001a\u00020\u0002H\u0002J\b\u0010$\u001a\u00020\u0002H\u0002J\b\u0010%\u001a\u00020\u0002H\u0002J\b\u0010'\u001a\u00020&H\u0002J\b\u0010(\u001a\u00020\u0002H\u0002J\b\u0010)\u001a\u00020\u0002H\u0002J\b\u0010*\u001a\u00020\u0002H\u0002J\b\u0010+\u001a\u00020\u0002H\u0002J\n\u0010-\u001a\u0004\u0018\u00010,H\u0002J\b\u0010.\u001a\u00020\u0002H\u0002J\b\u0010/\u001a\u00020\u0002H\u0002J\u0010\u00100\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000bH\u0002J#\u00103\u001a\u00020\u00022\u0012\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b01\"\u00020\u000bH\u0002¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u00109\u001a\u00020\u00022\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u000bH\u0002J\u0010\u0010:\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u00108\u001a\u00020\u000bH\u0002J$\u0010?\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u00020\tH\u0007J\u0006\u0010@\u001a\u00020\u0002J\u000e\u0010C\u001a\u00020&2\u0006\u0010B\u001a\u00020AJ\u0010\u0010F\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010DJ\u0010\u0010I\u001a\u00020\u00022\b\u0010H\u001a\u0004\u0018\u00010GJ\u0010\u0010L\u001a\u00020\u00022\b\u0010K\u001a\u0004\u0018\u00010JJ\u0010\u0010O\u001a\u00020\u00022\b\u0010N\u001a\u0004\u0018\u00010MJ\u0010\u0010P\u001a\u00020\u00022\b\u0010N\u001a\u0004\u0018\u00010MJ \u0010T\u001a\u00020\u00022\u0018\u0010S\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020&0QJ\u0010\u0010W\u001a\u00020\u00022\b\u0010V\u001a\u0004\u0018\u00010UJ\u000e\u0010Y\u001a\u00020\u00002\u0006\u0010X\u001a\u00020&J\u0006\u0010Z\u001a\u00020\tJ\u0006\u0010[\u001a\u00020\tJ\u0010\u0010^\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\\H\u0016J\u0010\u0010_\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\\H\u0016R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0017\u0010u\u001a\u00020p8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0017\u0010x\u001a\u00020p8\u0006¢\u0006\f\n\u0004\bv\u0010r\u001a\u0004\bw\u0010tR$\u0010|\u001a\u00020&2\u0006\u0010y\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0016\u0010\u007f\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010{R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b{\u0010\u0083\u0001R!\u0010\u0089\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0082\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R!\u0010\u008e\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u0082\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0092\u0001"}, m28432d2 = {"Lcom/skydoves/balloon/Balloon;", "LVX0;", "", "N", "Landroid/view/ViewGroup;", "parent", "J", "", "d0", "", "Y", "Landroid/view/View;", "anchor", "g0", "Landroid/widget/ImageView;", "imageView", "x", "y", "Landroid/graphics/Bitmap;", "G", "Lkotlin/Pair;", "X", "Landroid/graphics/drawable/Drawable;", "drawable", "width", "height", "Q", "H", "R", "S", "i0", "o0", "l0", "n0", "j0", "q0", "r0", "k0", "", "f0", "p0", "m0", "K", "L", "Landroid/view/animation/Animation;", "U", "J0", "M0", "M", "", "anchors", "I0", "([Landroid/view/View;)V", "t0", "Landroid/widget/TextView;", "textView", "rootView", "s0", "N0", "measuredWidth", "b0", "xOff", "yOff", "G0", "O", "", "delay", "P", "Ldf3;", "onBalloonClickListener", "v0", "Lef3;", "onBalloonDismissListener", "x0", "Lgf3;", "onBalloonOutsideTouchListener", "z0", "Landroid/view/View$OnTouchListener;", "onTouchListener", "F0", "C0", "Lkotlin/Function2;", "Landroid/view/MotionEvent;", "block", "D0", "Lhf3;", "onBalloonOverlayClickListener", "A0", "value", AbstractC26684u0.f100690q, "c0", "a0", "LLifecycleOwner;", "owner", "onPause", "onDestroy", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/skydoves/balloon/Balloon$a;", "c", "Lcom/skydoves/balloon/Balloon$a;", "builder", "LZw;", DateTokenConverter.CONVERTER_KEY, "LZw;", "binding", "Lax;", "e", "Lax;", "overlayBinding", "Landroid/widget/PopupWindow;", "f", "Landroid/widget/PopupWindow;", "W", "()Landroid/widget/PopupWindow;", "bodyWindow", "g", "e0", "overlayWindow", "<set-?>", "h", "Z", "isShowing", "()Z", "i", "destroyed", "Landroid/os/Handler;", "j", "Lkotlin/Lazy;", "()Landroid/os/Handler;", "handler", "LLq;", "k", "T", "()LLq;", "autoDismissRunnable", "Lix;", "l", "V", "()Lix;", "balloonPersistence", "<init>", "(Landroid/content/Context;Lcom/skydoves/balloon/Balloon$a;)V", C17296a.f69688o, "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class Balloon implements VX0 {

    /* renamed from: b */
    public final Context f75113b;

    /* renamed from: c */
    public final C18588a f75114c;

    /* renamed from: d */
    public final C10433Zw f75115d;

    /* renamed from: e */
    public final C12247ax f75116e;

    /* renamed from: f */
    public final PopupWindow f75117f;

    /* renamed from: g */
    public final PopupWindow f75118g;

    /* renamed from: h */
    public boolean f75119h;

    /* renamed from: i */
    public boolean f75120i;

    /* renamed from: j */
    public final Lazy f75121j;

    /* renamed from: k */
    public final Lazy f75122k;

    /* renamed from: l */
    public final Lazy f75123l;

    @Metadata(m28433d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0006\u0010'\u001a\u00020%¢\u0006\u0006\b´\u0003\u0010µ\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0012J\u0010\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\nJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0018J\u001a\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020!J\u0006\u0010$\u001a\u00020#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010&R*\u0010/\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00103\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R*\u00107\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R*\u0010>\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010B\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R*\u0010F\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bC\u00109\u001a\u0004\bD\u0010;\"\u0004\bE\u0010=R*\u0010J\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010*\u001a\u0004\bH\u0010,\"\u0004\bI\u0010.R*\u0010N\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010*\u001a\u0004\bL\u0010,\"\u0004\bM\u0010.R*\u0010R\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010*\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010.R*\u0010V\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010*\u001a\u0004\bT\u0010,\"\u0004\bU\u0010.R*\u0010Z\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010*\u001a\u0004\bX\u0010,\"\u0004\bY\u0010.R*\u0010^\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010*\u001a\u0004\b\\\u0010,\"\u0004\b]\u0010.R*\u0010b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010*\u001a\u0004\b`\u0010,\"\u0004\ba\u0010.R*\u0010f\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010*\u001a\u0004\bd\u0010,\"\u0004\be\u0010.R*\u0010j\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bg\u0010*\u001a\u0004\bh\u0010,\"\u0004\bi\u0010.R*\u0010p\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010d\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR*\u0010s\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010*\u001a\u0004\b?\u0010,\"\u0004\br\u0010.R*\u0010v\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010d\u001a\u0004\bC\u0010m\"\u0004\bu\u0010oR*\u0010y\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bw\u0010*\u001a\u0004\bg\u0010,\"\u0004\bx\u0010.R*\u0010|\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bz\u00109\u001a\u0004\b[\u0010;\"\u0004\b{\u0010=R-\u0010\u0082\u0001\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b}\u0010~\u001a\u0004\b_\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R2\u0010\u0089\u0001\u001a\u00030\u0083\u00012\u0007\u0010(\u001a\u00030\u0083\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\bW\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R0\u0010\u008f\u0001\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\bS\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R6\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0090\u00012\t\u0010(\u001a\u0005\u0018\u00010\u0090\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0005\bG\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R-\u0010\u0099\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0005\b\u0097\u0001\u0010*\u001a\u0004\bO\u0010,\"\u0005\b\u0098\u0001\u0010.R-\u0010\u009c\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0005\b\u009a\u0001\u0010*\u001a\u0004\bc\u0010,\"\u0005\b\u009b\u0001\u0010.R-\u0010\u009f\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0005\b\u009d\u0001\u0010*\u001a\u0004\bk\u0010,\"\u0005\b\u009e\u0001\u0010.R-\u0010¢\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0005\b \u0001\u0010*\u001a\u0004\b8\u0010,\"\u0005\b¡\u0001\u0010.R-\u0010¥\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0005\b£\u0001\u0010*\u001a\u0004\b0\u0010,\"\u0005\b¤\u0001\u0010.R-\u0010¨\u0001\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0005\b¦\u0001\u00109\u001a\u0004\b4\u0010;\"\u0005\b§\u0001\u0010=R,\u0010ª\u0001\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b9\u00109\u001a\u0004\bK\u0010;\"\u0005\b©\u0001\u0010=R-\u0010\u00ad\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0005\b«\u0001\u0010*\u001a\u0004\bt\u0010,\"\u0005\b¬\u0001\u0010.R6\u0010°\u0001\u001a\u0005\u0018\u00010\u0090\u00012\t\u0010(\u001a\u0005\u0018\u00010\u0090\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b®\u0001\u0010\u0092\u0001\u001a\u0005\bw\u0010\u0093\u0001\"\u0006\b¯\u0001\u0010\u0095\u0001R-\u0010²\u0001\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0004\b*\u00109\u001a\u0005\b£\u0001\u0010;\"\u0005\b±\u0001\u0010=R1\u0010¹\u0001\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R-\u0010¼\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0004\bH\u0010*\u001a\u0005\bº\u0001\u0010,\"\u0005\b»\u0001\u0010.R.\u0010À\u0001\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b½\u0001\u0010d\u001a\u0005\b¾\u0001\u0010m\"\u0005\b¿\u0001\u0010oR7\u0010È\u0001\u001a\u0005\u0018\u00010Á\u00012\t\u0010(\u001a\u0005\u0018\u00010Á\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R.\u0010Ì\u0001\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\bÉ\u0001\u00109\u001a\u0005\bÊ\u0001\u0010;\"\u0005\bË\u0001\u0010=R.\u0010Ð\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bÍ\u0001\u0010*\u001a\u0005\bÎ\u0001\u0010,\"\u0005\bÏ\u0001\u0010.R7\u0010Ø\u0001\u001a\u0005\u0018\u00010Ñ\u00012\t\u0010(\u001a\u0005\u0018\u00010Ñ\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R.\u0010Ü\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bÙ\u0001\u0010*\u001a\u0005\bÚ\u0001\u0010,\"\u0005\bÛ\u0001\u0010.R7\u0010ä\u0001\u001a\u0005\u0018\u00010Ý\u00012\t\u0010(\u001a\u0005\u0018\u00010Ý\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R7\u0010ç\u0001\u001a\u0005\u0018\u00010\u0090\u00012\t\u0010(\u001a\u0005\u0018\u00010\u0090\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bå\u0001\u0010\u0092\u0001\u001a\u0006\bÂ\u0001\u0010\u0093\u0001\"\u0006\bæ\u0001\u0010\u0095\u0001R3\u0010î\u0001\u001a\u00030è\u00012\u0007\u0010(\u001a\u00030è\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bÍ\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R.\u0010ñ\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\bï\u0001\u0010*\u001a\u0005\bÞ\u0001\u0010,\"\u0005\bð\u0001\u0010.R.\u0010ô\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\bò\u0001\u0010*\u001a\u0005\bÒ\u0001\u0010,\"\u0005\bó\u0001\u0010.R-\u0010ö\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0004\bh\u0010*\u001a\u0005\bÙ\u0001\u0010,\"\u0005\bõ\u0001\u0010.R-\u0010ø\u0001\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0004\b`\u0010*\u001a\u0005\b½\u0001\u0010,\"\u0005\b÷\u0001\u0010.R6\u0010þ\u0001\u001a\u0005\u0018\u00010ù\u00012\t\u0010(\u001a\u0005\u0018\u00010ù\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\\\u0010ú\u0001\u001a\u0006\bÉ\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R,\u0010\u0080\u0002\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0006@FX\u0087\u000e¢\u0006\u0013\n\u0004\bd\u00109\u001a\u0004\b)\u0010;\"\u0005\bÿ\u0001\u0010=R-\u0010\u0082\u0002\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b5\u00109\u001a\u0005\b³\u0001\u0010;\"\u0005\b\u0081\u0002\u0010=R4\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u001b2\b\u0010(\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bD\u0010\u0083\u0002\u001a\u0006\bå\u0001\u0010\u0084\u0002\"\u0006\b\u0085\u0002\u0010\u0086\u0002R4\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u00022\b\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0087\u000e¢\u0006\u0017\n\u0005\b1\u0010\u0088\u0002\u001a\u0006\bé\u0001\u0010\u0089\u0002\"\u0006\b\u008a\u0002\u0010\u008b\u0002R-\u0010\u008f\u0002\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b@\u0010d\u001a\u0005\b\u008d\u0002\u0010m\"\u0005\b\u008e\u0002\u0010oR.\u0010\u0092\u0002\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\bÄ\u0001\u0010*\u001a\u0005\b\u0090\u0002\u0010,\"\u0005\b\u0091\u0002\u0010.R.\u0010\u0096\u0002\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0093\u0002\u00109\u001a\u0005\b\u0094\u0002\u0010;\"\u0005\b\u0095\u0002\u0010=R.\u0010\u009a\u0002\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0097\u0002\u0010*\u001a\u0005\b\u0098\u0002\u0010,\"\u0005\b\u0099\u0002\u0010.R7\u0010¢\u0002\u001a\u0005\u0018\u00010\u009b\u00022\t\u0010(\u001a\u0005\u0018\u00010\u009b\u00028\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0002\u0010\u009d\u0002\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002\"\u0006\b \u0002\u0010¡\u0002R3\u0010ª\u0002\u001a\u00030£\u00022\u0007\u0010(\u001a\u00030£\u00028\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¤\u0002\u0010¥\u0002\u001a\u0006\b¦\u0002\u0010§\u0002\"\u0006\b¨\u0002\u0010©\u0002R.\u0010®\u0002\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b«\u0002\u0010*\u001a\u0005\b¬\u0002\u0010,\"\u0005\b\u00ad\u0002\u0010.R7\u0010µ\u0002\u001a\u0005\u0018\u00010¯\u00022\t\u0010(\u001a\u0005\u0018\u00010¯\u00028\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b°\u0002\u0010±\u0002\u001a\u0006\b\u0093\u0002\u0010²\u0002\"\u0006\b³\u0002\u0010´\u0002R7\u0010¼\u0002\u001a\u0005\u0018\u00010¶\u00022\t\u0010(\u001a\u0005\u0018\u00010¶\u00028\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0002\u0010¸\u0002\u001a\u0006\b·\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002R7\u0010¾\u0002\u001a\u0005\u0018\u00010¶\u00022\t\u0010(\u001a\u0005\u0018\u00010¶\u00028\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0002\u0010¸\u0002\u001a\u0006\b°\u0002\u0010¹\u0002\"\u0006\b½\u0002\u0010»\u0002R-\u0010À\u0002\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0005\b¬\u0002\u0010d\u001a\u0004\b*\u0010m\"\u0005\b¿\u0002\u0010oR.\u0010Â\u0002\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0002\u0010d\u001a\u0005\b®\u0001\u0010m\"\u0005\bÁ\u0002\u0010oR.\u0010Ä\u0002\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0098\u0002\u0010d\u001a\u0005\b¦\u0001\u0010m\"\u0005\bÃ\u0002\u0010oR.\u0010Æ\u0002\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u009e\u0002\u0010d\u001a\u0005\b«\u0001\u0010m\"\u0005\bÅ\u0002\u0010oR-\u0010È\u0002\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0005\b¦\u0002\u0010d\u001a\u0004\b9\u0010m\"\u0005\bÇ\u0002\u0010oR-\u0010Ë\u0002\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\bX\u0010d\u001a\u0005\bÉ\u0002\u0010m\"\u0005\bÊ\u0002\u0010oR/\u0010Ï\u0002\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\bL\u0010³\u0001\u001a\u0005\bq\u0010Ì\u0002\"\u0006\bÍ\u0002\u0010Î\u0002R4\u0010Ô\u0002\u001a\u0004\u0018\u00010\u00162\b\u0010(\u001a\u0004\u0018\u00010\u00168\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bT\u0010Ð\u0002\u001a\u0006\bò\u0001\u0010Ñ\u0002\"\u0006\bÒ\u0002\u0010Ó\u0002R6\u0010Ú\u0002\u001a\u0005\u0018\u00010Õ\u00022\t\u0010(\u001a\u0005\u0018\u00010Õ\u00028\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bP\u0010Ö\u0002\u001a\u0006\bï\u0001\u0010×\u0002\"\u0006\bØ\u0002\u0010Ù\u0002R-\u0010Ü\u0002\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0005\bÉ\u0002\u0010*\u001a\u0004\b}\u0010,\"\u0005\bÛ\u0002\u0010.R.\u0010ß\u0002\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\bÝ\u0002\u0010*\u001a\u0005\b\u009a\u0001\u0010,\"\u0005\bÞ\u0002\u0010.R0\u0010å\u0002\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bà\u0002\u0010á\u0002\u001a\u0005\bz\u0010â\u0002\"\u0006\bã\u0002\u0010ä\u0002R3\u0010ì\u0002\u001a\u00030æ\u00022\u0007\u0010(\u001a\u00030æ\u00028\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bç\u0002\u0010è\u0002\u001a\u0006\b\u0097\u0001\u0010é\u0002\"\u0006\bê\u0002\u0010ë\u0002R1\u0010ï\u0002\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bí\u0002\u0010³\u0001\u001a\u0006\b \u0001\u0010Ì\u0002\"\u0006\bî\u0002\u0010Î\u0002R3\u0010õ\u0002\u001a\u00030ð\u00022\u0007\u0010(\u001a\u00030ð\u00028\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010ñ\u0002\u001a\u0006\b\u0084\u0001\u0010ò\u0002\"\u0006\bó\u0002\u0010ô\u0002R.\u0010÷\u0002\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\bº\u0001\u0010*\u001a\u0005\b\u0091\u0001\u0010,\"\u0005\bö\u0002\u0010.R1\u0010ù\u0002\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bà\u0001\u0010³\u0001\u001a\u0006\b\u008a\u0001\u0010Ì\u0002\"\u0006\bø\u0002\u0010Î\u0002R7\u0010ÿ\u0002\u001a\u0005\u0018\u00010ú\u00022\t\u0010(\u001a\u0005\u0018\u00010ú\u00028\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÚ\u0001\u0010û\u0002\u001a\u0006\bÝ\u0002\u0010ü\u0002\"\u0006\bý\u0002\u0010þ\u0002R.\u0010\u0081\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b¾\u0001\u0010*\u001a\u0005\bç\u0002\u0010,\"\u0005\b\u0080\u0003\u0010.RC\u0010\u0087\u0003\u001a\u000b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0082\u00032\u000f\u0010(\u001a\u000b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0082\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÊ\u0001\u0010\u0083\u0003\u001a\u0006\bà\u0002\u0010\u0084\u0003\"\u0006\b\u0085\u0003\u0010\u0086\u0003R.\u0010\u008a\u0003\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bÎ\u0001\u0010d\u001a\u0005\b\u0088\u0003\u0010m\"\u0005\b\u0089\u0003\u0010oR.\u0010\u008c\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bÔ\u0001\u0010*\u001a\u0005\bí\u0002\u0010,\"\u0005\b\u008b\u0003\u0010.R-\u0010\u008f\u0003\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b+\u0010d\u001a\u0005\b\u008d\u0003\u0010m\"\u0005\b\u008e\u0003\u0010oR-\u0010\u0092\u0003\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b:\u0010d\u001a\u0005\b\u0090\u0003\u0010m\"\u0005\b\u0091\u0003\u0010oR.\u0010\u0095\u0003\u001a\u00020!2\u0006\u0010(\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0003\u0010d\u001a\u0005\b\u0093\u0003\u0010m\"\u0005\b\u0094\u0003\u0010oR7\u0010\u0097\u0003\u001a\u0005\u0018\u00010\u0096\u00032\t\u0010(\u001a\u0005\u0018\u00010\u0096\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0003\u0010\u0098\u0003\u001a\u0006\b\u0097\u0002\u0010\u0099\u0003\"\u0006\b\u009a\u0003\u0010\u009b\u0003R7\u0010\u009d\u0003\u001a\u0005\u0018\u00010\u009c\u00032\t\u0010(\u001a\u0005\u0018\u00010\u009c\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009d\u0003\u0010\u009e\u0003\u001a\u0006\b\u009c\u0002\u0010\u009f\u0003\"\u0006\b \u0003\u0010¡\u0003R7\u0010£\u0003\u001a\u0005\u0018\u00010¢\u00032\t\u0010(\u001a\u0005\u0018\u00010¢\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b£\u0003\u0010¤\u0003\u001a\u0006\b¤\u0002\u0010¥\u0003\"\u0006\b¦\u0003\u0010§\u0003R7\u0010©\u0003\u001a\u0005\u0018\u00010¨\u00032\t\u0010(\u001a\u0005\u0018\u00010¨\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b©\u0003\u0010ª\u0003\u001a\u0006\b«\u0002\u0010«\u0003\"\u0006\b¬\u0003\u0010\u00ad\u0003R7\u0010¯\u0003\u001a\u0005\u0018\u00010®\u00032\t\u0010(\u001a\u0005\u0018\u00010®\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¯\u0003\u0010°\u0003\u001a\u0006\b\u009d\u0001\u0010±\u0003\"\u0006\b²\u0003\u0010³\u0003¨\u0006¶\u0003"}, m28432d2 = {"Lcom/skydoves/balloon/Balloon$a;", "", "", "value", "c1", "e1", "g1", "f1", "d1", "U0", "", "S0", "LFo;", "T0", "LDo;", "R0", "W0", "Y0", "", "h1", "i1", "j1", "LLifecycleOwner;", "a1", "LVw;", "X0", "Lkotlin/Function1;", "Landroid/view/View;", "", "block", "b1", "", "V0", "", "Z0", "Lcom/skydoves/balloon/Balloon;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<set-?>", "b", "I", "J0", "()I", "setWidth", "(I)V", "width", "c", "c0", "setMinWidth", "minWidth", DateTokenConverter.CONVERTER_KEY, "a0", "setMaxWidth", "maxWidth", "e", "F", "K0", "()F", "setWidthRatio", "(F)V", "widthRatio", "f", "d0", "setMinWidthRatio", "minWidthRatio", "g", "b0", "setMaxWidthRatio", "maxWidthRatio", "h", "K", "setHeight", "height", "i", "t0", "setPaddingLeft", "paddingLeft", "j", "v0", "setPaddingTop", "paddingTop", "k", AbstractC26684u0.f100690q, "setPaddingRight", "paddingRight", "l", "s0", "setPaddingBottom", "paddingBottom", "m", "Y", "setMarginRight", "marginRight", "n", "X", "setMarginLeft", "marginLeft", "o", "Z", "setMarginTop", "marginTop", "p", "W", "setMarginBottom", "marginBottom", "q", "P0", "()Z", "setVisibleArrow", "(Z)V", "isVisibleArrow", "r", "setArrowColor", "arrowColor", "s", "setArrowColorMatchBalloon", "arrowColorMatchBalloon", "t", "setArrowSize", "arrowSize", "u", "setArrowPosition", "arrowPosition", "v", "LFo;", "()LFo;", "setArrowPositionRules", "(LFo;)V", "arrowPositionRules", "LEo;", "w", "LEo;", "()LEo;", "setArrowOrientationRules", "(LEo;)V", "arrowOrientationRules", "x", "LDo;", "()LDo;", "setArrowOrientation", "(LDo;)V", "arrowOrientation", "Landroid/graphics/drawable/Drawable;", "y", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "setArrowDrawable", "(Landroid/graphics/drawable/Drawable;)V", "arrowDrawable", "z", "setArrowLeftPadding", "arrowLeftPadding", "A", "setArrowRightPadding", "arrowRightPadding", "B", "setArrowTopPadding", "arrowTopPadding", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "setArrowBottomPadding", "arrowBottomPadding", "D", "setArrowAlignAnchorPadding", "arrowAlignAnchorPadding", "E", "setArrowAlignAnchorPaddingRatio", "arrowAlignAnchorPaddingRatio", "setArrowElevation", "arrowElevation", "G", "setBackgroundColor", "backgroundColor", "H", "setBackgroundDrawable", "backgroundDrawable", "setCornerRadius", "cornerRadius", "J", "Ljava/lang/CharSequence;", "B0", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", Entry.TYPE_TEXT, "C0", "setTextColor", "textColor", "L", "F0", "setTextIsHtml", "textIsHtml", "Landroid/text/method/MovementMethod;", "M", "Landroid/text/method/MovementMethod;", "e0", "()Landroid/text/method/MovementMethod;", "setMovementMethod", "(Landroid/text/method/MovementMethod;)V", "movementMethod", "N", "G0", "setTextSize", "textSize", "O", "H0", "setTextTypeface", "textTypeface", "Landroid/graphics/Typeface;", "P", "Landroid/graphics/Typeface;", "I0", "()Landroid/graphics/Typeface;", "setTextTypefaceObject", "(Landroid/graphics/Typeface;)V", "textTypefaceObject", "Q", "E0", "setTextGravity", "textGravity", "LI16;", "R", "LI16;", "D0", "()LI16;", "setTextForm", "(LI16;)V", "textForm", "S", "setIconDrawable", "iconDrawable", "LBP1;", "T", "LBP1;", "()LBP1;", "setIconGravity", "(LBP1;)V", "iconGravity", "U", "setIconWidth", "iconWidth", "V", "setIconHeight", "iconHeight", "setIconSpace", "iconSpace", "setIconColor", "iconColor", "LzP1;", "LzP1;", "()LzP1;", "setIconForm", "(LzP1;)V", "iconForm", "setAlpha", "alpha", "setElevation", "elevation", "Landroid/view/View;", "()Landroid/view/View;", "setLayout", "(Landroid/view/View;)V", "layout", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setLayoutRes", "(Ljava/lang/Integer;)V", "layoutRes", "Q0", "setVisibleOverlay", "isVisibleOverlay", "m0", "setOverlayColor", "overlayColor", "f0", "o0", "setOverlayPadding", "overlayPadding", "g0", "p0", "setOverlayPaddingColor", "overlayPaddingColor", "Landroid/graphics/Point;", "h0", "Landroid/graphics/Point;", "q0", "()Landroid/graphics/Point;", "setOverlayPosition", "(Landroid/graphics/Point;)V", "overlayPosition", "Lhx;", "i0", "Lhx;", "r0", "()Lhx;", "setOverlayShape", "(Lhx;)V", "overlayShape", "j0", "n0", "setOverlayGravity", "overlayGravity", "Ldf3;", "k0", "Ldf3;", "()Ldf3;", "setOnBalloonClickListener", "(Ldf3;)V", "onBalloonClickListener", "Landroid/view/View$OnTouchListener;", "l0", "Landroid/view/View$OnTouchListener;", "()Landroid/view/View$OnTouchListener;", "setOnBalloonTouchListener", "(Landroid/view/View$OnTouchListener;)V", "onBalloonTouchListener", "setOnBalloonOverlayTouchListener", "onBalloonOverlayTouchListener", "setDismissWhenTouchOutside", "dismissWhenTouchOutside", "setDismissWhenShowAgain", "dismissWhenShowAgain", "setDismissWhenClicked", "dismissWhenClicked", "setDismissWhenOverlayClicked", "dismissWhenOverlayClicked", "setDismissWhenLifecycleOnPause", "dismissWhenLifecycleOnPause", "w0", "setPassTouchEventToAnchor", "passTouchEventToAnchor", "()J", "setAutoDismissDuration", "(J)V", "autoDismissDuration", "LLifecycleOwner;", "()LLifecycleOwner;", "setLifecycleOwner", "(LLifecycleOwner;)V", "lifecycleOwner", "LFq2;", "LFq2;", "()LFq2;", "setLifecycleObserver", "(LFq2;)V", "lifecycleObserver", "setBalloonAnimationStyle", "balloonAnimationStyle", "x0", "setBalloonOverlayAnimationStyle", "balloonOverlayAnimationStyle", "y0", "LVw;", "()LVw;", "setBalloonAnimation", "(LVw;)V", "balloonAnimation", "Lbx;", "z0", "Lbx;", "()Lbx;", "setBalloonOverlayAnimation", "(Lbx;)V", "balloonOverlayAnimation", "A0", "setCircularDuration", "circularDuration", "LXw;", "LXw;", "()LXw;", "setBalloonHighlightAnimation", "(LXw;)V", "balloonHighlightAnimation", "setBalloonHighlightAnimationStyle", "balloonHighlightAnimationStyle", "setBalloonHighlightAnimationStartDelay", "balloonHighlightAnimationStartDelay", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setPreferenceName", "(Ljava/lang/String;)V", "preferenceName", "setShowTimes", "showTimes", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "setRunIfReachedShowCounts", "(Lkotlin/jvm/functions/Function0;)V", "runIfReachedShowCounts", "N0", "setRtlLayout", "isRtlLayout", "setSupportRtlLayoutFactor", "supportRtlLayoutFactor", "M0", "setFocusable", "isFocusable", "O0", "setStatusBarVisible", "isStatusBarVisible", "L0", "setAttachedInDecor", "isAttachedInDecor", "Lef3;", "onBalloonDismissListener", "Lef3;", "()Lef3;", "setOnBalloonDismissListener", "(Lef3;)V", "Lff3;", "onBalloonInitializedListener", "Lff3;", "()Lff3;", "setOnBalloonInitializedListener", "(Lff3;)V", "Lgf3;", "onBalloonOutsideTouchListener", "Lgf3;", "()Lgf3;", "setOnBalloonOutsideTouchListener", "(Lgf3;)V", "Lhf3;", "onBalloonOverlayClickListener", "Lhf3;", "()Lhf3;", "setOnBalloonOverlayClickListener", "(Lhf3;)V", "Ljx;", "balloonRotateAnimation", "Ljx;", "()Ljx;", "setBalloonRotateAnimation", "(Ljx;)V", "<init>", "(Landroid/content/Context;)V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: com.skydoves.balloon.Balloon$a */
    /* loaded from: classes6.dex */
    public static final class C18588a {

        /* renamed from: A */
        public int f75124A;

        /* renamed from: A0 */
        public long f75125A0;

        /* renamed from: B */
        public int f75126B;

        /* renamed from: B0 */
        public EnumC9554Xw f75127B0;

        /* renamed from: C */
        public int f75128C;

        /* renamed from: C0 */
        public int f75129C0;

        /* renamed from: D */
        public int f75130D;

        /* renamed from: D0 */
        public long f75131D0;

        /* renamed from: E */
        public float f75132E;

        /* renamed from: E0 */
        public String f75133E0;

        /* renamed from: F */
        public float f75134F;

        /* renamed from: F0 */
        public int f75135F0;

        /* renamed from: G */
        public int f75136G;

        /* renamed from: G0 */
        public Function0<Unit> f75137G0;

        /* renamed from: H */
        public Drawable f75138H;

        /* renamed from: H0 */
        public boolean f75139H0;

        /* renamed from: I */
        public float f75140I;

        /* renamed from: I0 */
        public int f75141I0;

        /* renamed from: J */
        public CharSequence f75142J;

        /* renamed from: J0 */
        public boolean f75143J0;

        /* renamed from: K */
        public int f75144K;

        /* renamed from: K0 */
        public boolean f75145K0;

        /* renamed from: L */
        public boolean f75146L;

        /* renamed from: L0 */
        public boolean f75147L0;

        /* renamed from: M */
        public MovementMethod f75148M;

        /* renamed from: N */
        public float f75149N;

        /* renamed from: O */
        public int f75150O;

        /* renamed from: P */
        public Typeface f75151P;

        /* renamed from: Q */
        public int f75152Q;

        /* renamed from: R */
        public I16 f75153R;

        /* renamed from: S */
        public Drawable f75154S;

        /* renamed from: T */
        public BP1 f75155T;

        /* renamed from: U */
        public int f75156U;

        /* renamed from: V */
        public int f75157V;

        /* renamed from: W */
        public int f75158W;

        /* renamed from: X */
        public int f75159X;

        /* renamed from: Y */
        public C52773zP1 f75160Y;

        /* renamed from: Z */
        public float f75161Z;

        /* renamed from: a */
        public final Context f75162a;

        /* renamed from: a0 */
        public float f75163a0;

        /* renamed from: b */
        public int f75164b;

        /* renamed from: b0 */
        public View f75165b0;

        /* renamed from: c */
        public int f75166c;

        /* renamed from: c0 */
        public Integer f75167c0;

        /* renamed from: d */
        public int f75168d;

        /* renamed from: d0 */
        public boolean f75169d0;

        /* renamed from: e */
        public float f75170e;

        /* renamed from: e0 */
        public int f75171e0;

        /* renamed from: f */
        public float f75172f;

        /* renamed from: f0 */
        public float f75173f0;

        /* renamed from: g */
        public float f75174g;

        /* renamed from: g0 */
        public int f75175g0;

        /* renamed from: h */
        public int f75176h;

        /* renamed from: h0 */
        public Point f75177h0;

        /* renamed from: i */
        public int f75178i;

        /* renamed from: i0 */
        public AbstractC22854hx f75179i0;

        /* renamed from: j */
        public int f75180j;

        /* renamed from: j0 */
        public int f75181j0;

        /* renamed from: k */
        public int f75182k;

        /* renamed from: k0 */
        public InterfaceC39881df3 f75183k0;

        /* renamed from: l */
        public int f75184l;

        /* renamed from: l0 */
        public View.OnTouchListener f75185l0;

        /* renamed from: m */
        public int f75186m;

        /* renamed from: m0 */
        public View.OnTouchListener f75187m0;

        /* renamed from: n */
        public int f75188n;

        /* renamed from: n0 */
        public boolean f75189n0;

        /* renamed from: o */
        public int f75190o;

        /* renamed from: o0 */
        public boolean f75191o0;

        /* renamed from: p */
        public int f75192p;

        /* renamed from: p0 */
        public boolean f75193p0;

        /* renamed from: q */
        public boolean f75194q;

        /* renamed from: q0 */
        public boolean f75195q0;

        /* renamed from: r */
        public int f75196r;

        /* renamed from: r0 */
        public boolean f75197r0;

        /* renamed from: s */
        public boolean f75198s;

        /* renamed from: s0 */
        public boolean f75199s0;

        /* renamed from: t */
        public int f75200t;

        /* renamed from: t0 */
        public long f75201t0;

        /* renamed from: u */
        public float f75202u;

        /* renamed from: u0 */
        public LifecycleOwner f75203u0;

        /* renamed from: v */
        public EnumC2480Fo f75204v;

        /* renamed from: v0 */
        public InterfaceC32929Fq2 f75205v0;

        /* renamed from: w */
        public EnumC1994Eo f75206w;

        /* renamed from: w0 */
        public int f75207w0;

        /* renamed from: x */
        public EnumC1606Do f75208x;

        /* renamed from: x0 */
        public int f75209x0;

        /* renamed from: y */
        public Drawable f75210y;

        /* renamed from: y0 */
        public EnumC8825Vw f75211y0;

        /* renamed from: z */
        public int f75212z;

        /* renamed from: z0 */
        public EnumC13348bx f75213z0;

        public C18588a(Context context) {
            int roundToInt;
            int roundToInt2;
            int roundToInt3;
            int roundToInt4;
            boolean z;
            Intrinsics.checkNotNullParameter(context, "context");
            this.f75162a = context;
            this.f75164b = Integer.MIN_VALUE;
            this.f75168d = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
            this.f75176h = Integer.MIN_VALUE;
            this.f75194q = true;
            this.f75196r = Integer.MIN_VALUE;
            roundToInt = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, 12, Resources.getSystem().getDisplayMetrics()));
            this.f75200t = roundToInt;
            this.f75202u = 0.5f;
            this.f75204v = EnumC2480Fo.ALIGN_BALLOON;
            this.f75206w = EnumC1994Eo.ALIGN_ANCHOR;
            this.f75208x = EnumC1606Do.BOTTOM;
            this.f75132E = 2.5f;
            this.f75136G = -16777216;
            this.f75140I = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
            this.f75142J = "";
            this.f75144K = -1;
            this.f75149N = 12.0f;
            this.f75152Q = 17;
            this.f75155T = BP1.START;
            float f = 28;
            roundToInt2 = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            this.f75156U = roundToInt2;
            roundToInt3 = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            this.f75157V = roundToInt3;
            roundToInt4 = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
            this.f75158W = roundToInt4;
            this.f75159X = Integer.MIN_VALUE;
            this.f75161Z = 1.0f;
            this.f75163a0 = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
            this.f75179i0 = C20149ex.f79167a;
            this.f75181j0 = 17;
            this.f75189n0 = true;
            this.f75195q0 = true;
            this.f75201t0 = -1L;
            this.f75207w0 = Integer.MIN_VALUE;
            this.f75209x0 = Integer.MIN_VALUE;
            this.f75211y0 = EnumC8825Vw.FADE;
            this.f75213z0 = EnumC13348bx.FADE;
            this.f75125A0 = 500L;
            this.f75127B0 = EnumC9554Xw.NONE;
            this.f75129C0 = Integer.MIN_VALUE;
            this.f75135F0 = 1;
            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f75139H0 = z;
            this.f75141I0 = C45155mZ0.m25431b(1, z);
            this.f75143J0 = true;
            this.f75145K0 = true;
            this.f75147L0 = true;
        }

        /* renamed from: A */
        public final int m45681A() {
            return this.f75209x0;
        }

        /* renamed from: A0 */
        public final int m45680A0() {
            return this.f75141I0;
        }

        /* renamed from: B */
        public final C25048jx m45679B() {
            return null;
        }

        /* renamed from: B0 */
        public final CharSequence m45678B0() {
            return this.f75142J;
        }

        /* renamed from: C */
        public final long m45677C() {
            return this.f75125A0;
        }

        /* renamed from: C0 */
        public final int m45676C0() {
            return this.f75144K;
        }

        /* renamed from: D */
        public final float m45675D() {
            return this.f75140I;
        }

        /* renamed from: D0 */
        public final I16 m45674D0() {
            return this.f75153R;
        }

        /* renamed from: E */
        public final boolean m45673E() {
            return this.f75193p0;
        }

        /* renamed from: E0 */
        public final int m45672E0() {
            return this.f75152Q;
        }

        /* renamed from: F */
        public final boolean m45671F() {
            return this.f75197r0;
        }

        /* renamed from: F0 */
        public final boolean m45670F0() {
            return this.f75146L;
        }

        /* renamed from: G */
        public final boolean m45669G() {
            return this.f75195q0;
        }

        /* renamed from: G0 */
        public final float m45668G0() {
            return this.f75149N;
        }

        /* renamed from: H */
        public final boolean m45667H() {
            return this.f75191o0;
        }

        /* renamed from: H0 */
        public final int m45666H0() {
            return this.f75150O;
        }

        /* renamed from: I */
        public final boolean m45665I() {
            return this.f75189n0;
        }

        /* renamed from: I0 */
        public final Typeface m45664I0() {
            return this.f75151P;
        }

        /* renamed from: J */
        public final float m45663J() {
            return this.f75163a0;
        }

        /* renamed from: J0 */
        public final int m45662J0() {
            return this.f75164b;
        }

        /* renamed from: K */
        public final int m45661K() {
            return this.f75176h;
        }

        /* renamed from: K0 */
        public final float m45660K0() {
            return this.f75170e;
        }

        /* renamed from: L */
        public final int m45659L() {
            return this.f75159X;
        }

        /* renamed from: L0 */
        public final boolean m45658L0() {
            return this.f75147L0;
        }

        /* renamed from: M */
        public final Drawable m45657M() {
            return this.f75154S;
        }

        /* renamed from: M0 */
        public final boolean m45656M0() {
            return this.f75143J0;
        }

        /* renamed from: N */
        public final C52773zP1 m45655N() {
            return this.f75160Y;
        }

        /* renamed from: N0 */
        public final boolean m45654N0() {
            return this.f75139H0;
        }

        /* renamed from: O */
        public final BP1 m45653O() {
            return this.f75155T;
        }

        /* renamed from: O0 */
        public final boolean m45652O0() {
            return this.f75145K0;
        }

        /* renamed from: P */
        public final int m45651P() {
            return this.f75157V;
        }

        /* renamed from: P0 */
        public final boolean m45650P0() {
            return this.f75194q;
        }

        /* renamed from: Q */
        public final int m45649Q() {
            return this.f75158W;
        }

        /* renamed from: Q0 */
        public final boolean m45648Q0() {
            return this.f75169d0;
        }

        /* renamed from: R */
        public final int m45647R() {
            return this.f75156U;
        }

        /* renamed from: R0 */
        public final C18588a m45646R0(EnumC1606Do value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f75208x = value;
            return this;
        }

        /* renamed from: S */
        public final View m45645S() {
            return this.f75165b0;
        }

        /* renamed from: S0 */
        public final C18588a m45644S0(float f) {
            this.f75202u = f;
            return this;
        }

        /* renamed from: T */
        public final Integer m45643T() {
            return this.f75167c0;
        }

        /* renamed from: T0 */
        public final C18588a m45642T0(EnumC2480Fo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f75204v = value;
            return this;
        }

        /* renamed from: U */
        public final InterfaceC32929Fq2 m45641U() {
            return this.f75205v0;
        }

        /* renamed from: U0 */
        public final C18588a m45640U0(int i) {
            int i2 = Integer.MIN_VALUE;
            if (i != Integer.MIN_VALUE) {
                i2 = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
            }
            this.f75200t = i2;
            return this;
        }

        /* renamed from: V */
        public final LifecycleOwner m45639V() {
            return this.f75203u0;
        }

        /* renamed from: V0 */
        public final C18588a m45638V0(long j) {
            this.f75201t0 = j;
            return this;
        }

        /* renamed from: W */
        public final int m45637W() {
            return this.f75192p;
        }

        /* renamed from: W0 */
        public final C18588a m45636W0(int i) {
            this.f75136G = Intrinsics.checkNotNullParameter(this.f75162a, "<this>");
            return this;
        }

        /* renamed from: X */
        public final int m45635X() {
            return this.f75188n;
        }

        /* renamed from: X0 */
        public final C18588a m45634X0(EnumC8825Vw value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f75211y0 = value;
            if (value == EnumC8825Vw.CIRCULAR) {
                m45630Z0(false);
            }
            return this;
        }

        /* renamed from: Y */
        public final int m45633Y() {
            return this.f75186m;
        }

        /* renamed from: Y0 */
        public final C18588a m45632Y0(float f) {
            this.f75140I = TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
            return this;
        }

        /* renamed from: Z */
        public final int m45631Z() {
            return this.f75190o;
        }

        /* renamed from: Z0 */
        public final C18588a m45630Z0(boolean z) {
            this.f75143J0 = z;
            return this;
        }

        /* renamed from: a */
        public final Balloon m45629a() {
            return new Balloon(this.f75162a, this, null);
        }

        /* renamed from: a0 */
        public final int m45628a0() {
            return this.f75168d;
        }

        /* renamed from: a1 */
        public final C18588a m45627a1(LifecycleOwner lifecycleOwner) {
            this.f75203u0 = lifecycleOwner;
            return this;
        }

        /* renamed from: b */
        public final float m45626b() {
            return this.f75161Z;
        }

        /* renamed from: b0 */
        public final float m45625b0() {
            return this.f75174g;
        }

        /* renamed from: b1 */
        public final /* synthetic */ C18588a m45624b1(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.f75183k0 = new C10083Yw(block);
            return this;
        }

        /* renamed from: c */
        public final int m45623c() {
            return this.f75130D;
        }

        /* renamed from: c0 */
        public final int m45622c0() {
            return this.f75166c;
        }

        /* renamed from: c1 */
        public final C18588a m45621c1(int i) {
            m45615e1(i);
            m45609g1(i);
            m45612f1(i);
            m45618d1(i);
            return this;
        }

        /* renamed from: d */
        public final float m45620d() {
            return this.f75132E;
        }

        /* renamed from: d0 */
        public final float m45619d0() {
            return this.f75172f;
        }

        /* renamed from: d1 */
        public final C18588a m45618d1(int i) {
            int roundToInt;
            roundToInt = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
            this.f75184l = roundToInt;
            return this;
        }

        /* renamed from: e */
        public final int m45617e() {
            return this.f75128C;
        }

        /* renamed from: e0 */
        public final MovementMethod m45616e0() {
            return this.f75148M;
        }

        /* renamed from: e1 */
        public final C18588a m45615e1(int i) {
            int roundToInt;
            roundToInt = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
            this.f75178i = roundToInt;
            return this;
        }

        /* renamed from: f */
        public final int m45614f() {
            return this.f75196r;
        }

        /* renamed from: f0 */
        public final InterfaceC39881df3 m45613f0() {
            return this.f75183k0;
        }

        /* renamed from: f1 */
        public final C18588a m45612f1(int i) {
            int roundToInt;
            roundToInt = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
            this.f75182k = roundToInt;
            return this;
        }

        /* renamed from: g */
        public final boolean m45611g() {
            return this.f75198s;
        }

        /* renamed from: g0 */
        public final InterfaceC40473ef3 m45610g0() {
            return null;
        }

        /* renamed from: g1 */
        public final C18588a m45609g1(int i) {
            int roundToInt;
            roundToInt = MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
            this.f75180j = roundToInt;
            return this;
        }

        /* renamed from: h */
        public final Drawable m45608h() {
            return this.f75210y;
        }

        /* renamed from: h0 */
        public final InterfaceC41066ff3 m45607h0() {
            return null;
        }

        /* renamed from: h1 */
        public final C18588a m45606h1(CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f75142J = value;
            return this;
        }

        /* renamed from: i */
        public final float m45605i() {
            return this.f75134F;
        }

        /* renamed from: i0 */
        public final InterfaceC41659gf3 m45604i0() {
            return null;
        }

        /* renamed from: i1 */
        public final C18588a m45603i1(int i) {
            this.f75144K = Intrinsics.checkNotNullParameter(this.f75162a, "<this>");
            return this;
        }

        /* renamed from: j */
        public final int m45602j() {
            return this.f75212z;
        }

        /* renamed from: j0 */
        public final InterfaceC42252hf3 m45601j0() {
            return null;
        }

        /* renamed from: j1 */
        public final C18588a m45600j1(float f) {
            this.f75149N = f;
            return this;
        }

        /* renamed from: k */
        public final EnumC1606Do m45599k() {
            return this.f75208x;
        }

        /* renamed from: k0 */
        public final View.OnTouchListener m45598k0() {
            return this.f75187m0;
        }

        /* renamed from: l */
        public final EnumC1994Eo m45597l() {
            return this.f75206w;
        }

        /* renamed from: l0 */
        public final View.OnTouchListener m45596l0() {
            return this.f75185l0;
        }

        /* renamed from: m */
        public final float m45595m() {
            return this.f75202u;
        }

        /* renamed from: m0 */
        public final int m45594m0() {
            return this.f75171e0;
        }

        /* renamed from: n */
        public final EnumC2480Fo m45593n() {
            return this.f75204v;
        }

        /* renamed from: n0 */
        public final int m45592n0() {
            return this.f75181j0;
        }

        /* renamed from: o */
        public final int m45591o() {
            return this.f75124A;
        }

        /* renamed from: o0 */
        public final float m45590o0() {
            return this.f75173f0;
        }

        /* renamed from: p */
        public final int m45589p() {
            return this.f75200t;
        }

        /* renamed from: p0 */
        public final int m45588p0() {
            return this.f75175g0;
        }

        /* renamed from: q */
        public final int m45587q() {
            return this.f75126B;
        }

        /* renamed from: q0 */
        public final Point m45586q0() {
            return this.f75177h0;
        }

        /* renamed from: r */
        public final long m45585r() {
            return this.f75201t0;
        }

        /* renamed from: r0 */
        public final AbstractC22854hx m45584r0() {
            return this.f75179i0;
        }

        /* renamed from: s */
        public final int m45583s() {
            return this.f75136G;
        }

        /* renamed from: s0 */
        public final int m45582s0() {
            return this.f75184l;
        }

        /* renamed from: t */
        public final Drawable m45581t() {
            return this.f75138H;
        }

        /* renamed from: t0 */
        public final int m45580t0() {
            return this.f75178i;
        }

        /* renamed from: u */
        public final EnumC8825Vw m45579u() {
            return this.f75211y0;
        }

        /* renamed from: u0 */
        public final int m45578u0() {
            return this.f75182k;
        }

        /* renamed from: v */
        public final int m45577v() {
            return this.f75207w0;
        }

        /* renamed from: v0 */
        public final int m45576v0() {
            return this.f75180j;
        }

        /* renamed from: w */
        public final EnumC9554Xw m45575w() {
            return this.f75127B0;
        }

        /* renamed from: w0 */
        public final boolean m45574w0() {
            return this.f75199s0;
        }

        /* renamed from: x */
        public final long m45573x() {
            return this.f75131D0;
        }

        /* renamed from: x0 */
        public final String m45572x0() {
            return this.f75133E0;
        }

        /* renamed from: y */
        public final int m45571y() {
            return this.f75129C0;
        }

        /* renamed from: y0 */
        public final Function0<Unit> m45570y0() {
            return this.f75137G0;
        }

        /* renamed from: z */
        public final EnumC13348bx m45569z() {
            return this.f75213z0;
        }

        /* renamed from: z0 */
        public final int m45568z0() {
            return this.f75135F0;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: com.skydoves.balloon.Balloon$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C18589b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[EnumC1606Do.values().length];
            iArr[EnumC1606Do.BOTTOM.ordinal()] = 1;
            iArr[EnumC1606Do.TOP.ordinal()] = 2;
            iArr[EnumC1606Do.START.ordinal()] = 3;
            iArr[EnumC1606Do.END.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC2480Fo.values().length];
            iArr2[EnumC2480Fo.ALIGN_BALLOON.ordinal()] = 1;
            iArr2[EnumC2480Fo.ALIGN_ANCHOR.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC8825Vw.values().length];
            iArr3[EnumC8825Vw.ELASTIC.ordinal()] = 1;
            iArr3[EnumC8825Vw.CIRCULAR.ordinal()] = 2;
            iArr3[EnumC8825Vw.FADE.ordinal()] = 3;
            iArr3[EnumC8825Vw.OVERSHOOT.ordinal()] = 4;
            iArr3[EnumC8825Vw.NONE.ordinal()] = 5;
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[EnumC13348bx.values().length];
            iArr4[EnumC13348bx.FADE.ordinal()] = 1;
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[EnumC9554Xw.values().length];
            iArr5[EnumC9554Xw.HEARTBEAT.ordinal()] = 1;
            iArr5[EnumC9554Xw.SHAKE.ordinal()] = 2;
            iArr5[EnumC9554Xw.BREATH.ordinal()] = 3;
            iArr5[EnumC9554Xw.ROTATE.ordinal()] = 4;
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[EnumC9241Ww.values().length];
            iArr6[EnumC9241Ww.TOP.ordinal()] = 1;
            iArr6[EnumC9241Ww.BOTTOM.ordinal()] = 2;
            iArr6[EnumC9241Ww.START.ordinal()] = 3;
            iArr6[EnumC9241Ww.END.ordinal()] = 4;
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[EnumC8502Uw.values().length];
            iArr7[EnumC8502Uw.TOP.ordinal()] = 1;
            iArr7[EnumC8502Uw.BOTTOM.ordinal()] = 2;
            iArr7[EnumC8502Uw.END.ordinal()] = 3;
            iArr7[EnumC8502Uw.START.ordinal()] = 4;
            $EnumSwitchMapping$6 = iArr7;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LLq;", "b", "()LLq;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: com.skydoves.balloon.Balloon$c */
    /* loaded from: classes6.dex */
    public static final class C18590c extends Lambda implements Function0<RunnableC5095Lq> {
        public C18590c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final RunnableC5095Lq invoke() {
            return new RunnableC5095Lq(Balloon.this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lix;", "b", "()Lix;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: com.skydoves.balloon.Balloon$d */
    /* loaded from: classes6.dex */
    public static final class C18591d extends Lambda implements Function0<C24646ix> {
        public C18591d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C24646ix invoke() {
            return C24646ix.f91751a.m31568a(Balloon.this.f75113b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "run", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: com.skydoves.balloon.Balloon$e */
    /* loaded from: classes6.dex */
    public static final class RunnableC18592e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f75216b;

        /* renamed from: c */
        public final /* synthetic */ long f75217c;

        /* renamed from: d */
        public final /* synthetic */ Function0 f75218d;

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"com/skydoves/balloon/Balloon$e$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: com.skydoves.balloon.Balloon$e$a */
        /* loaded from: classes6.dex */
        public static final class C18593a extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ Function0 f75219a;

            public C18593a(Function0 function0) {
                this.f75219a = function0;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f75219a.invoke();
            }
        }

        public RunnableC18592e(View view, long j, Function0 function0) {
            this.f75216b = view;
            this.f75217c = j;
            this.f75218d = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f75216b.isAttachedToWindow()) {
                View view = this.f75216b;
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getLeft() + this.f75216b.getRight()) / 2, (this.f75216b.getTop() + this.f75216b.getBottom()) / 2, Math.max(this.f75216b.getWidth(), this.f75216b.getHeight()), 0.0f);
                createCircularReveal.setDuration(this.f75217c);
                createCircularReveal.start();
                createCircularReveal.addListener(new C18593a(this.f75218d));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: com.skydoves.balloon.Balloon$f */
    /* loaded from: classes6.dex */
    public static final class C18594f extends Lambda implements Function0<Unit> {
        public C18594f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Balloon.this.f75119h = false;
            Balloon.this.m45731W().dismiss();
            Balloon.this.m45719e0().dismiss();
            Balloon.this.m45728Z().removeCallbacks(Balloon.this.m45734T());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: com.skydoves.balloon.Balloon$g */
    /* loaded from: classes6.dex */
    public static final class C18595g extends Lambda implements Function0<Handler> {

        /* renamed from: g */
        public static final C18595g f75221g = new C18595g();

        public C18595g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "", C17296a.f69688o, "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: com.skydoves.balloon.Balloon$h */
    /* loaded from: classes6.dex */
    public static final class C18596h extends Lambda implements Function2<View, MotionEvent, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ View f75222g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18596h(View view) {
            super(2);
            this.f75222g = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(View view, MotionEvent event) {
            boolean z;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            view.performClick();
            Rect rect = new Rect();
            this.f75222g.getGlobalVisibleRect(rect);
            if (rect.contains((int) event.getRawX(), (int) event.getRawY())) {
                this.f75222g.getRootView().dispatchTouchEvent(event);
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\b"}, m28432d2 = {"com/skydoves/balloon/Balloon$i", "Landroid/view/View$OnTouchListener;", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "", "onTouch", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: com.skydoves.balloon.Balloon$i */
    /* loaded from: classes6.dex */
    public static final class View$OnTouchListenerC18597i implements View.OnTouchListener {
        public View$OnTouchListenerC18597i(InterfaceC41659gf3 interfaceC41659gf3) {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 4) {
                if (Balloon.this.f75114c.m45665I()) {
                    Balloon.this.m45739O();
                    return true;
                }
                return true;
            }
            return false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "run", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: com.skydoves.balloon.Balloon$j */
    /* loaded from: classes6.dex */
    public static final class RunnableC18598j implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ View f75225c;

        /* renamed from: d */
        public final /* synthetic */ View[] f75226d;

        /* renamed from: e */
        public final /* synthetic */ Balloon f75227e;

        /* renamed from: f */
        public final /* synthetic */ View f75228f;

        /* renamed from: g */
        public final /* synthetic */ int f75229g;

        /* renamed from: h */
        public final /* synthetic */ int f75230h;

        public RunnableC18598j(View view, View[] viewArr, Balloon balloon, View view2, int i, int i2) {
            this.f75225c = view;
            this.f75226d = viewArr;
            this.f75227e = balloon;
            this.f75228f = view2;
            this.f75229g = i;
            this.f75230h = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Boolean valueOf = Boolean.valueOf(Balloon.this.m45743M(this.f75225c));
            if (!valueOf.booleanValue()) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.booleanValue();
                String m45572x0 = Balloon.this.f75114c.m45572x0();
                if (m45572x0 != null) {
                    Balloon balloon = Balloon.this;
                    if (balloon.m45732V().m31569g(m45572x0, balloon.f75114c.m45568z0())) {
                        balloon.m45732V().m31570f(m45572x0);
                    } else {
                        Function0<Unit> m45570y0 = balloon.f75114c.m45570y0();
                        if (m45570y0 != null) {
                            m45570y0.invoke();
                            return;
                        }
                        return;
                    }
                }
                Balloon.this.f75119h = true;
                long m45585r = Balloon.this.f75114c.m45585r();
                if (m45585r != -1) {
                    Balloon.this.m45738P(m45585r);
                }
                if (Balloon.this.m45717f0()) {
                    Balloon balloon2 = Balloon.this;
                    RadiusLayout radiusLayout = balloon2.f75115d.f49496d;
                    Intrinsics.checkNotNullExpressionValue(radiusLayout, "binding.balloonCard");
                    balloon2.m45740N0(radiusLayout);
                } else {
                    Balloon balloon3 = Balloon.this;
                    VectorTextView vectorTextView = balloon3.f75115d.f49498f;
                    Intrinsics.checkNotNullExpressionValue(vectorTextView, "binding.balloonText");
                    RadiusLayout radiusLayout2 = Balloon.this.f75115d.f49496d;
                    Intrinsics.checkNotNullExpressionValue(radiusLayout2, "binding.balloonCard");
                    balloon3.m45696s0(vectorTextView, radiusLayout2);
                }
                Balloon.this.f75115d.getRoot().measure(0, 0);
                Balloon.this.m45731W().setWidth(Balloon.this.m45723c0());
                Balloon.this.m45731W().setHeight(Balloon.this.m45726a0());
                Balloon.this.f75115d.f49498f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                Balloon.this.m45716g0(this.f75225c);
                Balloon.this.m45712j0();
                Balloon.this.m45745L();
                Balloon balloon4 = Balloon.this;
                View[] viewArr = this.f75226d;
                balloon4.m45750I0((View[]) Arrays.copyOf(viewArr, viewArr.length));
                Balloon.this.m45694t0(this.f75225c);
                Balloon.this.m45747K();
                Balloon.this.m45748J0();
                this.f75227e.m45731W().showAsDropDown(this.f75228f, this.f75227e.f75114c.m45680A0() * (((this.f75228f.getMeasuredWidth() / 2) - (this.f75227e.m45723c0() / 2)) + this.f75229g), ((-this.f75227e.m45726a0()) - this.f75228f.getMeasuredHeight()) + this.f75230h);
            }
        }
    }

    public /* synthetic */ Balloon(Context context, C18588a c18588a, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c18588a);
    }

    /* renamed from: B0 */
    public static final void m45762B0(InterfaceC42252hf3 interfaceC42252hf3, Balloon this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (interfaceC42252hf3 != null) {
            interfaceC42252hf3.m36106a();
        }
        if (this$0.f75114c.m45669G()) {
            this$0.m45739O();
        }
    }

    /* renamed from: E0 */
    public static final boolean m45756E0(Function2 tmp0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(view, motionEvent)).booleanValue();
    }

    /* renamed from: H0 */
    public static /* synthetic */ void m45751H0(Balloon balloon, View view, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        balloon.m45753G0(view, i, i2);
    }

    /* renamed from: K0 */
    public static final void m45746K0(final Balloon this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: Tw
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.m45744L0(Balloon.this);
            }
        }, this$0.f75114c.m45573x());
    }

    /* renamed from: L0 */
    public static final void m45744L0(Balloon this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation m45733U = this$0.m45733U();
        if (m45733U != null) {
            this$0.f75115d.f49494b.startAnimation(m45733U);
        }
    }

    /* renamed from: h0 */
    public static final void m45715h0(Balloon this$0, View anchor, AppCompatImageView this_with) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anchor, "$anchor");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this$0.getClass();
        this$0.m45752H(anchor);
        int i = C18589b.$EnumSwitchMapping$0[EnumC1606Do.f6338b.m109921a(this$0.f75114c.m45599k(), this$0.f75114c.m45654N0()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this_with.setRotation(90.0f);
                        this_with.setX((this$0.f75115d.f49496d.getX() + this$0.f75115d.f49496d.getWidth()) - 1);
                        this_with.setY(this$0.m45735S(anchor));
                        if (this$0.f75114c.m45611g() && PC1.m90593a()) {
                            this_with.setForeground(new BitmapDrawable(this_with.getResources(), this$0.m45754G(this_with, this$0.f75115d.f49496d.getWidth(), this_with.getY())));
                        }
                    }
                } else {
                    this_with.setRotation(-90.0f);
                    this_with.setX((this$0.f75115d.f49496d.getX() - this$0.f75114c.m45589p()) + 1);
                    this_with.setY(this$0.m45735S(anchor));
                    if (this$0.f75114c.m45611g() && PC1.m90593a()) {
                        this_with.setForeground(new BitmapDrawable(this_with.getResources(), this$0.m45754G(this_with, 0.0f, this_with.getY())));
                    }
                }
            } else {
                this_with.setRotation(0.0f);
                this_with.setX(this$0.m45736R(anchor));
                this_with.setY((this$0.f75115d.f49496d.getY() - this$0.f75114c.m45589p()) + 1);
                if (this$0.f75114c.m45611g() && PC1.m90593a()) {
                    this_with.setForeground(new BitmapDrawable(this_with.getResources(), this$0.m45754G(this_with, this_with.getX(), 0.0f)));
                }
            }
        } else {
            this_with.setRotation(180.0f);
            this_with.setX(this$0.m45736R(anchor));
            this_with.setY((this$0.f75115d.f49496d.getY() + this$0.f75115d.f49496d.getHeight()) - 1);
            C38790bq6.m62545E0(this_with, this$0.f75114c.m45605i());
            if (this$0.f75114c.m45611g() && PC1.m90593a()) {
                this_with.setForeground(new BitmapDrawable(this_with.getResources(), this$0.m45754G(this_with, this_with.getX(), this$0.f75115d.f49496d.getHeight())));
            }
        }
        C37145Xq6.m76207f(this_with, this$0.f75114c.m45650P0());
    }

    /* renamed from: w0 */
    public static final void m45688w0(InterfaceC39881df3 interfaceC39881df3, Balloon this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (interfaceC39881df3 != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC39881df3.mo43928a(it);
        }
        if (this$0.f75114c.m45673E()) {
            this$0.m45739O();
        }
    }

    /* renamed from: y0 */
    public static final void m45684y0(Balloon this$0, InterfaceC40473ef3 interfaceC40473ef3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m45742M0();
        this$0.m45739O();
        if (interfaceC40473ef3 != null) {
            interfaceC40473ef3.m42647a();
        }
    }

    /* renamed from: A0 */
    public final void m45764A0(final InterfaceC42252hf3 interfaceC42252hf3) {
        this.f75116e.getRoot().setOnClickListener(new View.OnClickListener(interfaceC42252hf3, this) { // from class: Pw

            /* renamed from: b */
            public final /* synthetic */ Balloon f29402b;

            {
                this.f29402b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Balloon.m45762B0(null, this.f29402b, view);
            }
        });
    }

    /* renamed from: C0 */
    public final void m45760C0(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.f75118g.setTouchInterceptor(onTouchListener);
        }
    }

    /* renamed from: D0 */
    public final void m45758D0(final Function2<? super View, ? super MotionEvent, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m45760C0(new View.OnTouchListener() { // from class: Sw
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m45756E0;
                m45756E0 = Balloon.m45756E0(Function2.this, view, motionEvent);
                return m45756E0;
            }
        });
    }

    /* renamed from: F0 */
    public final void m45755F0(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.f75117f.setTouchInterceptor(onTouchListener);
        }
    }

    /* renamed from: G */
    public final Bitmap m45754G(ImageView imageView, float f, float f2) {
        LinearGradient linearGradient;
        imageView.setColorFilter(this.f75114c.m45583s(), PorterDuff.Mode.SRC_IN);
        Drawable drawable = imageView.getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable, "imageView.drawable");
        Bitmap m45737Q = m45737Q(drawable, imageView.getDrawable().getIntrinsicWidth(), imageView.getDrawable().getIntrinsicHeight());
        try {
            Pair<Integer, Integer> m45730X = m45730X(f, f2);
            int intValue = m45730X.getFirst().intValue();
            int intValue2 = m45730X.getSecond().intValue();
            Bitmap updatedBitmap = Bitmap.createBitmap(m45737Q.getWidth(), m45737Q.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(updatedBitmap);
            canvas.drawBitmap(m45737Q, 0.0f, 0.0f, (Paint) null);
            Paint paint = new Paint();
            int i = C18589b.$EnumSwitchMapping$0[this.f75114c.m45599k().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                linearGradient = new LinearGradient((this.f75114c.m45589p() * 0.5f) + (m45737Q.getWidth() / 2), 0.0f, 0.0f, 0.0f, intValue, intValue2, Shader.TileMode.CLAMP);
                paint.setShader(linearGradient);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawRect(0.0f, 0.0f, m45737Q.getWidth(), m45737Q.getHeight(), paint);
                imageView.setColorFilter(0, PorterDuff.Mode.SRC_IN);
                Intrinsics.checkNotNullExpressionValue(updatedBitmap, "updatedBitmap");
                return updatedBitmap;
            }
            linearGradient = new LinearGradient((m45737Q.getWidth() / 2) - (this.f75114c.m45589p() * 0.5f), 0.0f, m45737Q.getWidth(), 0.0f, intValue, intValue2, Shader.TileMode.CLAMP);
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawRect(0.0f, 0.0f, m45737Q.getWidth(), m45737Q.getHeight(), paint);
            imageView.setColorFilter(0, PorterDuff.Mode.SRC_IN);
            Intrinsics.checkNotNullExpressionValue(updatedBitmap, "updatedBitmap");
            return updatedBitmap;
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Arrow attached outside balloon. Could not get a matching color.");
        }
    }

    @JvmOverloads
    /* renamed from: G0 */
    public final void m45753G0(View anchor, int i, int i2) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        View[] viewArr = {anchor};
        if (m45743M(anchor)) {
            anchor.post(new RunnableC18598j(anchor, viewArr, this, anchor, i, i2));
        } else if (this.f75114c.m45667H()) {
            m45739O();
        }
    }

    /* renamed from: H */
    public final void m45752H(View view) {
        if (this.f75114c.m45597l() == EnumC1994Eo.ALIGN_FIXED) {
            return;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int[] iArr = {0, 0};
        this.f75117f.getContentView().getLocationOnScreen(iArr);
        EnumC1606Do m45599k = this.f75114c.m45599k();
        EnumC1606Do enumC1606Do = EnumC1606Do.TOP;
        if (m45599k == enumC1606Do && iArr[1] < rect.bottom) {
            this.f75114c.m45646R0(EnumC1606Do.BOTTOM);
        } else if (this.f75114c.m45599k() == EnumC1606Do.BOTTOM && iArr[1] > rect.top) {
            this.f75114c.m45646R0(enumC1606Do);
        }
        m45712j0();
    }

    /* renamed from: I0 */
    public final void m45750I0(View... viewArr) {
        List<? extends View> list;
        if (this.f75114c.m45648Q0()) {
            View view = viewArr[0];
            if (viewArr.length == 1) {
                this.f75116e.f56638b.setAnchorView(view);
            } else {
                BalloonAnchorOverlayView balloonAnchorOverlayView = this.f75116e.f56638b;
                list = ArraysKt___ArraysKt.toList(viewArr);
                balloonAnchorOverlayView.setAnchorViewList(list);
            }
            this.f75118g.showAtLocation(view, this.f75114c.m45592n0(), 0, 0);
        }
    }

    /* renamed from: J */
    public final void m45749J(ViewGroup viewGroup) {
        IntRange until;
        int collectionSizeOrDefault;
        viewGroup.setFitsSystemWindows(false);
        until = RangesKt___RangesKt.until(0, viewGroup.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                m45749J((ViewGroup) view);
            }
        }
    }

    /* renamed from: J0 */
    public final void m45748J0() {
        this.f75115d.f49494b.post(new Runnable() { // from class: Rw
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.m45746K0(Balloon.this);
            }
        });
    }

    /* renamed from: K */
    public final void m45747K() {
        if (this.f75114c.m45577v() == Integer.MIN_VALUE) {
            int i = C18589b.$EnumSwitchMapping$2[this.f75114c.m45579u().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                this.f75117f.setAnimationStyle(C51206wl4.Balloon_Normal_Anim);
                                return;
                            }
                            return;
                        }
                        this.f75117f.setAnimationStyle(C51206wl4.Balloon_Overshoot_Anim);
                        return;
                    }
                    this.f75117f.setAnimationStyle(C51206wl4.Balloon_Fade_Anim);
                    return;
                }
                View contentView = this.f75117f.getContentView();
                Intrinsics.checkNotNullExpressionValue(contentView, "bodyWindow.contentView");
                C37145Xq6.m76211b(contentView, this.f75114c.m45677C());
                this.f75117f.setAnimationStyle(C51206wl4.Balloon_Normal_Dispose_Anim);
                return;
            }
            this.f75117f.setAnimationStyle(C51206wl4.Balloon_Elastic_Anim);
            return;
        }
        this.f75117f.setAnimationStyle(this.f75114c.m45577v());
    }

    /* renamed from: L */
    public final void m45745L() {
        if (this.f75114c.m45681A() == Integer.MIN_VALUE) {
            if (C18589b.$EnumSwitchMapping$3[this.f75114c.m45569z().ordinal()] == 1) {
                this.f75118g.setAnimationStyle(C51206wl4.Balloon_Fade_Anim);
                return;
            } else {
                this.f75118g.setAnimationStyle(C51206wl4.Balloon_Normal_Anim);
                return;
            }
        }
        this.f75118g.setAnimationStyle(this.f75114c.m45577v());
    }

    /* renamed from: M */
    public final boolean m45743M(View view) {
        boolean z;
        if (this.f75119h || this.f75120i) {
            return false;
        }
        Context context = this.f75113b;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f75117f.getContentView().getParent() != null || !C38790bq6.m62506Y(view)) {
            return false;
        }
        return true;
    }

    /* renamed from: M0 */
    public final void m45742M0() {
        FrameLayout frameLayout = this.f75115d.f49494b;
        Animation animation = frameLayout.getAnimation();
        if (animation != null) {
            Intrinsics.checkNotNullExpressionValue(animation, "animation");
            animation.cancel();
            animation.reset();
        }
        frameLayout.clearAnimation();
    }

    /* renamed from: N */
    public final void m45741N() {
        AbstractC11719f lifecycle;
        m45714i0();
        m45705n0();
        m45703o0();
        m45710k0();
        m45712j0();
        m45707m0();
        m45708l0();
        FrameLayout root = this.f75115d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        m45749J(root);
        if (this.f75114c.m45639V() == null) {
            Context context = this.f75113b;
            if (context instanceof LifecycleOwner) {
                this.f75114c.m45627a1((LifecycleOwner) context);
                AbstractC11719f lifecycle2 = ((LifecycleOwner) this.f75113b).getLifecycle();
                InterfaceC32929Fq2 m45641U = this.f75114c.m45641U();
                if (m45641U == null) {
                    m45641U = this;
                }
                lifecycle2.mo67008a(m45641U);
                return;
            }
        }
        LifecycleOwner m45639V = this.f75114c.m45639V();
        if (m45639V != null && (lifecycle = m45639V.getLifecycle()) != null) {
            InterfaceC32929Fq2 m45641U2 = this.f75114c.m45641U();
            if (m45641U2 == null) {
                m45641U2 = this;
            }
            lifecycle.mo67008a(m45641U2);
        }
    }

    /* renamed from: N0 */
    public final void m45740N0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(index)");
            if (childAt instanceof TextView) {
                m45696s0((TextView) childAt, viewGroup);
            } else if (childAt instanceof ViewGroup) {
                m45740N0((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: O */
    public final void m45739O() {
        if (this.f75119h) {
            C18594f c18594f = new C18594f();
            if (this.f75114c.m45579u() == EnumC8825Vw.CIRCULAR) {
                View contentView = this.f75117f.getContentView();
                Intrinsics.checkNotNullExpressionValue(contentView, "this.bodyWindow.contentView");
                contentView.post(new RunnableC18592e(contentView, this.f75114c.m45677C(), c18594f));
                return;
            }
            c18594f.invoke();
        }
    }

    /* renamed from: P */
    public final boolean m45738P(long j) {
        return m45728Z().postDelayed(m45734T(), j);
    }

    /* renamed from: Q */
    public final Bitmap m45737Q(Drawable drawable, int i, int i2) {
        Bitmap bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        return bitmap;
    }

    /* renamed from: R */
    public final float m45736R(View view) {
        FrameLayout frameLayout = this.f75115d.f49497e;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.balloonContent");
        int i = C37145Xq6.m76208e(frameLayout).x;
        int i2 = C37145Xq6.m76208e(view).x;
        float m45721d0 = m45721d0();
        float m45723c0 = ((m45723c0() - m45721d0) - this.f75114c.m45633Y()) - this.f75114c.m45635X();
        int i3 = C18589b.$EnumSwitchMapping$1[this.f75114c.m45593n().ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                if (view.getWidth() + i2 >= i) {
                    if (m45723c0() + i >= i2) {
                        float width = (((view.getWidth() * this.f75114c.m45595m()) + i2) - i) - (this.f75114c.m45589p() * 0.5f);
                        if (width > m45729Y()) {
                            if (width <= m45723c0() - m45729Y()) {
                                return width;
                            }
                        } else {
                            return m45721d0;
                        }
                    }
                    return m45723c0;
                }
                return m45721d0;
            }
            throw new NoWhenBranchMatchedException();
        }
        return (this.f75115d.f49499g.getWidth() * this.f75114c.m45595m()) - (this.f75114c.m45589p() * 0.5f);
    }

    /* renamed from: S */
    public final float m45735S(View view) {
        int m76209d = C37145Xq6.m76209d(view, this.f75114c.m45652O0());
        FrameLayout frameLayout = this.f75115d.f49497e;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.balloonContent");
        int i = C37145Xq6.m76208e(frameLayout).y - m76209d;
        int i2 = C37145Xq6.m76208e(view).y - m76209d;
        float m45721d0 = m45721d0();
        float m45726a0 = ((m45726a0() - m45721d0) - this.f75114c.m45631Z()) - this.f75114c.m45637W();
        int m45589p = this.f75114c.m45589p() / 2;
        int i3 = C18589b.$EnumSwitchMapping$1[this.f75114c.m45593n().ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                if (view.getHeight() + i2 >= i) {
                    if (m45726a0() + i >= i2) {
                        float height = (((view.getHeight() * this.f75114c.m45595m()) + i2) - i) - m45589p;
                        if (height > m45729Y()) {
                            if (height <= m45726a0() - m45729Y()) {
                                return height;
                            }
                        } else {
                            return m45721d0;
                        }
                    }
                    return m45726a0;
                }
                return m45721d0;
            }
            throw new NoWhenBranchMatchedException();
        }
        return (this.f75115d.f49499g.getHeight() * this.f75114c.m45595m()) - m45589p;
    }

    /* renamed from: T */
    public final RunnableC5095Lq m45734T() {
        return (RunnableC5095Lq) this.f75122k.getValue();
    }

    /* renamed from: U */
    public final Animation m45733U() {
        int m45571y;
        if (this.f75114c.m45571y() == Integer.MIN_VALUE) {
            int i = C18589b.$EnumSwitchMapping$4[this.f75114c.m45575w().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        this.f75114c.m45679B();
                        return null;
                    }
                    m45571y = C38678bf4.balloon_fade;
                } else {
                    int i2 = C18589b.$EnumSwitchMapping$0[this.f75114c.m45599k().ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    m45571y = C38678bf4.balloon_shake_left;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                m45571y = C38678bf4.balloon_shake_right;
                            }
                        } else {
                            m45571y = C38678bf4.balloon_shake_bottom;
                        }
                    } else {
                        m45571y = C38678bf4.balloon_shake_top;
                    }
                }
            } else if (this.f75114c.m45650P0()) {
                int i3 = C18589b.$EnumSwitchMapping$0[this.f75114c.m45599k().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                m45571y = C38678bf4.balloon_heartbeat_left;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            m45571y = C38678bf4.balloon_heartbeat_right;
                        }
                    } else {
                        m45571y = C38678bf4.balloon_heartbeat_bottom;
                    }
                } else {
                    m45571y = C38678bf4.balloon_heartbeat_top;
                }
            } else {
                m45571y = C38678bf4.balloon_heartbeat_center;
            }
        } else {
            m45571y = this.f75114c.m45571y();
        }
        return AnimationUtils.loadAnimation(this.f75113b, m45571y);
    }

    /* renamed from: V */
    public final C24646ix m45732V() {
        return (C24646ix) this.f75123l.getValue();
    }

    /* renamed from: W */
    public final PopupWindow m45731W() {
        return this.f75117f;
    }

    /* renamed from: X */
    public final Pair<Integer, Integer> m45730X(float f, float f2) {
        int pixel;
        int pixel2;
        Drawable background = this.f75115d.f49496d.getBackground();
        Intrinsics.checkNotNullExpressionValue(background, "binding.balloonCard.background");
        Bitmap m45737Q = m45737Q(background, this.f75115d.f49496d.getWidth() + 1, this.f75115d.f49496d.getHeight() + 1);
        int i = C18589b.$EnumSwitchMapping$0[this.f75114c.m45599k().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = (int) f;
            pixel = m45737Q.getPixel(i2, (int) ((this.f75114c.m45589p() * 0.5f) + f2));
            pixel2 = m45737Q.getPixel(i2, (int) (f2 - (this.f75114c.m45589p() * 0.5f)));
        } else {
            int i3 = (int) f2;
            pixel = m45737Q.getPixel((int) ((this.f75114c.m45589p() * 0.5f) + f), i3);
            pixel2 = m45737Q.getPixel((int) (f - (this.f75114c.m45589p() * 0.5f)), i3);
        }
        return new Pair<>(Integer.valueOf(pixel), Integer.valueOf(pixel2));
    }

    /* renamed from: Y */
    public final int m45729Y() {
        return this.f75114c.m45589p() * 2;
    }

    /* renamed from: Z */
    public final Handler m45728Z() {
        return (Handler) this.f75121j.getValue();
    }

    /* renamed from: a0 */
    public final int m45726a0() {
        if (this.f75114c.m45661K() != Integer.MIN_VALUE) {
            return this.f75114c.m45661K();
        }
        return this.f75115d.getRoot().getMeasuredHeight();
    }

    /* renamed from: b0 */
    public final int m45724b0(int i, View view) {
        int m45633Y;
        int m45589p;
        boolean z;
        boolean z2;
        float f;
        int coerceAtMost;
        boolean z3;
        int coerceAtMost2;
        int m45662J0;
        int i2 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        boolean z4 = false;
        if (this.f75114c.m45657M() != null) {
            m45633Y = this.f75114c.m45647R();
            m45589p = this.f75114c.m45649Q();
        } else {
            m45633Y = this.f75114c.m45633Y() + 0 + this.f75114c.m45635X();
            m45589p = this.f75114c.m45589p() * 2;
        }
        int i3 = paddingLeft + m45633Y + m45589p;
        int m45628a0 = this.f75114c.m45628a0() - i3;
        if (this.f75114c.m45660K0() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m45662J0 = (int) (i2 * this.f75114c.m45660K0());
        } else {
            if (this.f75114c.m45619d0() == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.f75114c.m45625b0() == 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (this.f75114c.m45662J0() == Integer.MIN_VALUE || this.f75114c.m45662J0() > i2) {
                        coerceAtMost2 = RangesKt___RangesKt.coerceAtMost(i, m45628a0);
                        return coerceAtMost2;
                    }
                    m45662J0 = this.f75114c.m45662J0();
                }
            }
            if (this.f75114c.m45625b0() == 0.0f) {
                z4 = true;
            }
            if (!z4) {
                f = this.f75114c.m45625b0();
            } else {
                f = 1.0f;
            }
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(i, ((int) (i2 * f)) - i3);
            return coerceAtMost;
        }
        return m45662J0 - i3;
    }

    /* renamed from: c0 */
    public final int m45723c0() {
        boolean z;
        boolean z2;
        float f;
        int coerceIn;
        boolean z3;
        int coerceIn2;
        int coerceAtMost;
        int i = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        boolean z4 = true;
        if (this.f75114c.m45660K0() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return (int) (i * this.f75114c.m45660K0());
        }
        if (this.f75114c.m45619d0() == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.f75114c.m45625b0() == 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (this.f75114c.m45662J0() != Integer.MIN_VALUE) {
                    coerceAtMost = RangesKt___RangesKt.coerceAtMost(this.f75114c.m45662J0(), i);
                    return coerceAtMost;
                }
                coerceIn2 = RangesKt___RangesKt.coerceIn(this.f75115d.getRoot().getMeasuredWidth(), this.f75114c.m45622c0(), this.f75114c.m45628a0());
                return coerceIn2;
            }
        }
        if (this.f75114c.m45625b0() != 0.0f) {
            z4 = false;
        }
        if (!z4) {
            f = this.f75114c.m45625b0();
        } else {
            f = 1.0f;
        }
        float f2 = i;
        coerceIn = RangesKt___RangesKt.coerceIn(this.f75115d.getRoot().getMeasuredWidth(), (int) (this.f75114c.m45619d0() * f2), (int) (f2 * f));
        return coerceIn;
    }

    /* renamed from: d0 */
    public final float m45721d0() {
        return (this.f75114c.m45589p() * this.f75114c.m45620d()) + this.f75114c.m45623c();
    }

    /* renamed from: e0 */
    public final PopupWindow m45719e0() {
        return this.f75118g;
    }

    /* renamed from: f0 */
    public final boolean m45717f0() {
        return (this.f75114c.m45643T() == null && this.f75114c.m45645S() == null) ? false : true;
    }

    /* renamed from: g0 */
    public final void m45716g0(final View view) {
        final AppCompatImageView appCompatImageView = this.f75115d.f49495c;
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(this.f75114c.m45589p(), this.f75114c.m45589p()));
        appCompatImageView.setAlpha(this.f75114c.m45626b());
        Drawable m45608h = this.f75114c.m45608h();
        if (m45608h != null) {
            appCompatImageView.setImageDrawable(m45608h);
        }
        appCompatImageView.setPadding(this.f75114c.m45602j(), this.f75114c.m45587q(), this.f75114c.m45591o(), this.f75114c.m45617e());
        if (this.f75114c.m45614f() != Integer.MIN_VALUE) {
            C51668xY1.m5035c(appCompatImageView, ColorStateList.valueOf(this.f75114c.m45614f()));
        } else {
            C51668xY1.m5035c(appCompatImageView, ColorStateList.valueOf(this.f75114c.m45583s()));
        }
        appCompatImageView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        this.f75115d.f49496d.post(new Runnable() { // from class: Ow
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.m45715h0(Balloon.this, view, appCompatImageView);
            }
        });
    }

    /* renamed from: i0 */
    public final void m45714i0() {
        RadiusLayout radiusLayout = this.f75115d.f49496d;
        radiusLayout.setAlpha(this.f75114c.m45626b());
        radiusLayout.setRadius(this.f75114c.m45675D());
        C38790bq6.m62545E0(radiusLayout, this.f75114c.m45663J());
        Drawable m45581t = this.f75114c.m45581t();
        GradientDrawable gradientDrawable = m45581t;
        if (m45581t == null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(this.f75114c.m45583s());
            gradientDrawable2.setCornerRadius(this.f75114c.m45675D());
            gradientDrawable = gradientDrawable2;
        }
        radiusLayout.setBackground(gradientDrawable);
        radiusLayout.setPadding(this.f75114c.m45580t0(), this.f75114c.m45576v0(), this.f75114c.m45578u0(), this.f75114c.m45582s0());
    }

    /* renamed from: j0 */
    public final void m45712j0() {
        int coerceAtLeast;
        int coerceAtLeast2;
        int m45589p = this.f75114c.m45589p() - 1;
        int m45663J = (int) this.f75114c.m45663J();
        FrameLayout frameLayout = this.f75115d.f49497e;
        int i = C18589b.$EnumSwitchMapping$0[this.f75114c.m45599k().ordinal()];
        if (i == 1) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(m45589p, m45663J);
            frameLayout.setPadding(m45663J, m45589p, m45663J, coerceAtLeast);
        } else if (i == 2) {
            coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(m45589p, m45663J);
            frameLayout.setPadding(m45663J, m45589p, m45663J, coerceAtLeast2);
        } else if (i != 3) {
            if (i == 4) {
                frameLayout.setPadding(m45589p, m45663J, m45589p, m45663J);
            }
        } else {
            frameLayout.setPadding(m45589p, m45663J, m45589p, m45663J);
        }
    }

    /* renamed from: k0 */
    public final void m45710k0() {
        if (m45717f0()) {
            m45701p0();
            return;
        }
        m45699q0();
        m45698r0();
    }

    /* renamed from: l0 */
    public final void m45708l0() {
        m45690v0(this.f75114c.m45613f0());
        this.f75114c.m45610g0();
        m45686x0(null);
        this.f75114c.m45604i0();
        m45682z0(null);
        m45755F0(this.f75114c.m45596l0());
        this.f75114c.m45601j0();
        m45764A0(null);
        m45760C0(this.f75114c.m45598k0());
    }

    /* renamed from: m0 */
    public final void m45707m0() {
        if (this.f75114c.m45648Q0()) {
            BalloonAnchorOverlayView balloonAnchorOverlayView = this.f75116e.f56638b;
            balloonAnchorOverlayView.setOverlayColor(this.f75114c.m45594m0());
            balloonAnchorOverlayView.setOverlayPadding(this.f75114c.m45590o0());
            balloonAnchorOverlayView.setOverlayPosition(this.f75114c.m45586q0());
            balloonAnchorOverlayView.setBalloonOverlayShape(this.f75114c.m45584r0());
            balloonAnchorOverlayView.setOverlayPaddingColor(this.f75114c.m45588p0());
            this.f75118g.setClippingEnabled(false);
        }
    }

    /* renamed from: n0 */
    public final void m45705n0() {
        ViewGroup.LayoutParams layoutParams = this.f75115d.f49499g.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(this.f75114c.m45635X(), this.f75114c.m45631Z(), this.f75114c.m45633Y(), this.f75114c.m45637W());
    }

    /* renamed from: o0 */
    public final void m45703o0() {
        PopupWindow popupWindow = this.f75117f;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(this.f75114c.m45656M0());
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setElevation(this.f75114c.m45663J());
        m45692u0(this.f75114c.m45658L0());
    }

    @Override // p000.VX0
    public void onDestroy(LifecycleOwner owner) {
        AbstractC11719f lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.f75120i = true;
        this.f75118g.dismiss();
        this.f75117f.dismiss();
        LifecycleOwner m45639V = this.f75114c.m45639V();
        if (m45639V != null && (lifecycle = m45639V.getLifecycle()) != null) {
            lifecycle.mo67006d(this);
        }
    }

    @Override // p000.VX0
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        if (this.f75114c.m45671F()) {
            m45739O();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 == null) goto L14;
     */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m45701p0() {
        View m45645S;
        ViewGroup viewGroup;
        Integer m45643T = this.f75114c.m45643T();
        if (m45643T != null) {
            m45645S = LayoutInflater.from(this.f75113b).inflate(m45643T.intValue(), (ViewGroup) this.f75115d.f49496d, false);
        }
        m45645S = this.f75114c.m45645S();
        if (m45645S == null) {
            throw new IllegalArgumentException("The custom layout is null.");
        }
        ViewParent parent = m45645S.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(m45645S);
        }
        this.f75115d.f49496d.removeAllViews();
        this.f75115d.f49496d.addView(m45645S);
        RadiusLayout radiusLayout = this.f75115d.f49496d;
        Intrinsics.checkNotNullExpressionValue(radiusLayout, "binding.balloonCard");
        m45740N0(radiusLayout);
    }

    /* renamed from: q0 */
    public final void m45699q0() {
        Unit unit;
        VectorTextView vectorTextView = this.f75115d.f49498f;
        C52773zP1 m45655N = this.f75114c.m45655N();
        if (m45655N != null) {
            Intrinsics.checkNotNullExpressionValue(vectorTextView, "");
            V26.m80471b(vectorTextView, m45655N);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            Intrinsics.checkNotNullExpressionValue(vectorTextView, "");
            Context context = vectorTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            C52773zP1.C30997a c30997a = new C52773zP1.C30997a(context);
            c30997a.m1397i(this.f75114c.m45657M());
            c30997a.m1392n(this.f75114c.m45647R());
            c30997a.m1394l(this.f75114c.m45651P());
            c30997a.m1395k(this.f75114c.m45659L());
            c30997a.m1393m(this.f75114c.m45649Q());
            c30997a.m1396j(this.f75114c.m45653O());
            V26.m80471b(vectorTextView, c30997a.m1405a());
        }
        vectorTextView.m45552g(this.f75114c.m45654N0());
    }

    /* renamed from: r0 */
    public final void m45698r0() {
        Unit unit;
        VectorTextView vectorTextView = this.f75115d.f49498f;
        I16 m45674D0 = this.f75114c.m45674D0();
        if (m45674D0 != null) {
            Intrinsics.checkNotNullExpressionValue(vectorTextView, "");
            V26.m80470c(vectorTextView, m45674D0);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            Intrinsics.checkNotNullExpressionValue(vectorTextView, "");
            Context context = vectorTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            I16.C3313a c3313a = new I16.C3313a(context);
            c3313a.m103058j(this.f75114c.m45678B0());
            c3313a.m103054n(this.f75114c.m45668G0());
            c3313a.m103057k(this.f75114c.m45676C0());
            c3313a.m103055m(this.f75114c.m45670F0());
            c3313a.m103056l(this.f75114c.m45672E0());
            c3313a.m103053o(this.f75114c.m45666H0());
            c3313a.m103052p(this.f75114c.m45664I0());
            vectorTextView.setMovementMethod(this.f75114c.m45616e0());
            V26.m80470c(vectorTextView, c3313a.m103067a());
        }
        Intrinsics.checkNotNullExpressionValue(vectorTextView, "this");
        RadiusLayout radiusLayout = this.f75115d.f49496d;
        Intrinsics.checkNotNullExpressionValue(radiusLayout, "binding.balloonCard");
        m45696s0(vectorTextView, radiusLayout);
    }

    /* renamed from: s0 */
    public final void m45696s0(TextView textView, View view) {
        int checkNotNullParameter;
        int compoundPaddingStart;
        int compoundPaddingEnd;
        int measureText = (int) textView.getPaint().measureText(textView.getText().toString());
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "compoundDrawablesRelative");
        if (T61.m84313e(compoundDrawablesRelative)) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative2, "compoundDrawablesRelative");
            textView.setMinHeight(T61.m84316b(compoundDrawablesRelative2));
            Drawable[] compoundDrawablesRelative3 = textView.getCompoundDrawablesRelative();
            Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative3, "compoundDrawablesRelative");
            checkNotNullParameter = Intrinsics.checkNotNullParameter(compoundDrawablesRelative3, "<this>");
            compoundPaddingStart = textView.getCompoundPaddingStart();
            compoundPaddingEnd = textView.getCompoundPaddingEnd();
        } else {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            Intrinsics.checkNotNullExpressionValue(compoundDrawables, "compoundDrawables");
            if (T61.m84313e(compoundDrawables)) {
                Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
                Intrinsics.checkNotNullExpressionValue(compoundDrawables2, "compoundDrawables");
                textView.setMinHeight(T61.m84316b(compoundDrawables2));
                Drawable[] compoundDrawables3 = textView.getCompoundDrawables();
                Intrinsics.checkNotNullExpressionValue(compoundDrawables3, "compoundDrawables");
                checkNotNullParameter = Intrinsics.checkNotNullParameter(compoundDrawables3, "<this>");
                compoundPaddingStart = textView.getCompoundPaddingStart();
                compoundPaddingEnd = textView.getCompoundPaddingEnd();
            }
            textView.setMaxWidth(m45724b0(measureText, view));
        }
        measureText += checkNotNullParameter + compoundPaddingStart + compoundPaddingEnd;
        textView.setMaxWidth(m45724b0(measureText, view));
    }

    /* renamed from: t0 */
    public final void m45694t0(View view) {
        if (!this.f75114c.m45574w0()) {
            return;
        }
        m45758D0(new C18596h(view));
    }

    /* renamed from: u0 */
    public final Balloon m45692u0(boolean z) {
        this.f75117f.setAttachedInDecor(z);
        return this;
    }

    /* renamed from: v0 */
    public final void m45690v0(final InterfaceC39881df3 interfaceC39881df3) {
        this.f75115d.f49499g.setOnClickListener(new View.OnClickListener() { // from class: Nw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Balloon.m45688w0(InterfaceC39881df3.this, this, view);
            }
        });
    }

    /* renamed from: x0 */
    public final void m45686x0(final InterfaceC40473ef3 interfaceC40473ef3) {
        this.f75117f.setOnDismissListener(new PopupWindow.OnDismissListener(interfaceC40473ef3) { // from class: Qw
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Balloon.m45684y0(Balloon.this, null);
            }
        });
    }

    /* renamed from: z0 */
    public final void m45682z0(InterfaceC41659gf3 interfaceC41659gf3) {
        this.f75117f.setTouchInterceptor(new View$OnTouchListenerC18597i(interfaceC41659gf3));
    }

    public Balloon(Context context, C18588a c18588a) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        this.f75113b = context;
        this.f75114c = c18588a;
        C10433Zw m72292c = C10433Zw.m72292c(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(m72292c, "inflate(LayoutInflater.from(context), null, false)");
        this.f75115d = m72292c;
        C12247ax m65212c = C12247ax.m65212c(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(m65212c, "inflate(LayoutInflater.from(context), null, false)");
        this.f75116e = m65212c;
        this.f75117f = new PopupWindow(m72292c.getRoot(), -2, -2);
        this.f75118g = new PopupWindow(m65212c.getRoot(), -1, -1);
        c18588a.m45607h0();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) C18595g.f75221g);
        this.f75121j = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new C18590c());
        this.f75122k = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new C18591d());
        this.f75123l = lazy3;
        m45741N();
    }
}
