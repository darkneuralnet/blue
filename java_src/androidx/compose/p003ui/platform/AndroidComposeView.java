package androidx.compose.p003ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p003ui.focus.C11299c;
import androidx.compose.p003ui.focus.FocusOwnerImpl;
import androidx.compose.p003ui.platform.AndroidComposeView;
import androidx.compose.p003ui.platform.ViewLayer;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.math.MathKt__MathJVMKt;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.AbstractC44199kw1;
import p000.C32120Ce3;
import p000.C33829Jm2;
import p000.C36844Wj2;
import p000.C44269l32;
import p000.C6412Pd;
import p000.InterfaceC40641ew1;
import p000.InterfaceC41563gV2;
import p000.InterfaceC43181jD3;
@Metadata(m28433d1 = {"\u0000ø\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u0083\u0003\b\u0001\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002SeB\u0013\u0012\b\u0010¥\u0003\u001a\u00030¤\u0003¢\u0006\u0006\b¦\u0003\u0010§\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J\u0014\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\f\u0010\r\u001a\u00020\f*\u00020\tH\u0002J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010\u001cJ*\u0010%\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\fH\u0002J\u0010\u0010&\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010'\u001a\u00020\u0007H\u0002J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010)\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020\fH\u0002J\u0010\u0010+\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010,\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u001a\u00100\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.H\u0002J\u0010\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u000201H\u0016J\u0010\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204H\u0016J\"\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u000101H\u0014J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\fH\u0016J\u001d\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020=H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020AH\u0016J\u0010\u0010C\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010D\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0006\u0010E\u001a\u00020\u0007J\b\u0010F\u001a\u00020\u0007H\u0016J\u0016\u0010I\u001a\u00020\u00072\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00070GH\u0016J\u0016\u0010M\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\tJ\u000e\u0010N\u001a\u00020\u00072\u0006\u0010K\u001a\u00020JJ\u0016\u0010Q\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010P\u001a\u00020OJ\u0010\u0010S\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\fH\u0016J%\u0010V\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\t2\u0006\u0010U\u001a\u00020TH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\tH\u0016J \u0010[\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\fH\u0016J \u0010\\\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\fH\u0016J\u0010\u0010]\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\tH\u0016J\u0018\u0010`\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000eH\u0014J0\u0010f\u001a\u00020\u00072\u0006\u0010a\u001a\u00020\f2\u0006\u0010b\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020\u000eH\u0014J\u0010\u0010g\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0014J*\u0010m\u001a\u00020l2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020\u00070h2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00070GH\u0016J\u0017\u0010o\u001a\u00020\f2\u0006\u0010n\u001a\u00020lH\u0000¢\u0006\u0004\bo\u0010pJ\b\u0010q\u001a\u00020\u0007H\u0016J\u0010\u0010c\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\tH\u0016J\u0010\u0010s\u001a\u00020\u00072\u0006\u0010H\u001a\u00020rH\u0016J\u001f\u0010u\u001a\u0004\u0018\u00010t2\u0006\u0010>\u001a\u00020=H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bu\u0010vJ\u0010\u0010w\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0014J\u001f\u0010y\u001a\u00020\u00072\u0006\u0010n\u001a\u00020l2\u0006\u0010x\u001a\u00020\fH\u0000¢\u0006\u0004\by\u0010zJ\u001a\u0010}\u001a\u00020\u00072\u0012\u0010|\u001a\u000e\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u00070hJ\u0013\u0010~\u001a\u00020\u0007H\u0086@ø\u0001\u0002¢\u0006\u0004\b~\u0010\u007fJ\t\u0010\u0080\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u0081\u0001\u001a\u00020\u0007H\u0014J\t\u0010\u0082\u0001\u001a\u00020\u0007H\u0014J\u001e\u0010\u0086\u0001\u001a\u00020\u00072\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u000eH\u0016J\u001a\u0010\u008a\u0001\u001a\u00020\u00072\u000f\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u0001H\u0016J\u0011\u0010\u008b\u0001\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0011\u0010\u008c\u0001\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0011\u0010\u008d\u0001\u001a\u00020\f2\u0006\u00108\u001a\u00020\u000eH\u0016J\u0011\u0010\u008e\u0001\u001a\u00020\f2\u0006\u00108\u001a\u00020\u000eH\u0016J#\u0010\u0091\u0001\u001a\u00030\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J#\u0010\u0094\u0001\u001a\u00030\u008f\u00012\b\u0010\u0093\u0001\u001a\u00030\u008f\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0092\u0001J\t\u0010\u0095\u0001\u001a\u00020\fH\u0016J\u0016\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0016J#\u0010\u009b\u0001\u001a\u00030\u008f\u00012\b\u0010\u009a\u0001\u001a\u00030\u008f\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u0092\u0001J#\u0010\u009c\u0001\u001a\u00030\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u0092\u0001J\u0013\u0010\u009f\u0001\u001a\u00020\u00072\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0014J\u0012\u0010¡\u0001\u001a\u00020\u00072\u0007\u0010 \u0001\u001a\u00020\u000eH\u0016J\u0011\u0010¢\u0001\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0011\u0010£\u0001\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020\u000eJ\t\u0010¤\u0001\u001a\u00020\fH\u0016R\"\u0010¦\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\be\u0010¥\u0001R\u0019\u0010©\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R \u0010¯\u0001\u001a\u00030ª\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010´\u0001\u001a\u00030°\u00012\b\u0010±\u0001\u001a\u00030°\u00018\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0005\bC\u0010²\u0001\u001a\u0005\be\u0010³\u0001R\u0018\u0010¸\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R \u0010¾\u0001\u001a\u00030¹\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010Â\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Æ\u0001\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0018\u0010È\u0001\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010Å\u0001R\u0018\u0010Ì\u0001\u001a\u00030É\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u001e\u0010Ð\u0001\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bb\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R \u0010Ö\u0001\u001a\u00030Ñ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R \u0010Ü\u0001\u001a\u00030×\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u0018\u0010à\u0001\u001a\u00030Ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R \u0010æ\u0001\u001a\u00030á\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001R\u001e\u0010é\u0001\u001a\t\u0012\u0004\u0012\u00020l0ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010è\u0001R!\u0010ê\u0001\u001a\u000b\u0012\u0004\u0012\u00020l\u0018\u00010ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bd\u0010è\u0001R\u0019\u0010ì\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010¨\u0001R\u0017\u0010ï\u0001\u001a\u00030í\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bc\u0010î\u0001R\u0017\u0010ò\u0001\u001a\u00030ð\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010ñ\u0001R6\u0010ù\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u009d\u0001\u0012\u0004\u0012\u00020\u00070h8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R\u001a\u0010ü\u0001\u001a\u0005\u0018\u00010ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010û\u0001R\u0018\u0010ý\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010¨\u0001R\u001f\u0010\u0082\u0002\u001a\u00030þ\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bF\u0010ÿ\u0001\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R \u0010\u0087\u0002\u001a\u00030\u0083\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bä\u0001\u0010\u0084\u0002\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R\u001f\u0010\u008c\u0002\u001a\u00030\u0088\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0005\bb\u0010\u008b\u0002R1\u0010\u0092\u0002\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006 \n\u0006\b¼\u0001\u0010¨\u0001\u0012\u0006\b\u0090\u0002\u0010\u0091\u0002\u001a\u0006\b\u0089\u0002\u0010\u008d\u0002\"\u0006\b\u008e\u0002\u0010\u008f\u0002R\u001c\u0010\u0095\u0002\u001a\u0005\u0018\u00010\u0093\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0094\u0002R\u001c\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0096\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0098\u0002R#\u0010\u009b\u0002\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\bs\u0010\u009a\u0002R\u0019\u0010\u009d\u0002\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0002\u0010¨\u0001R\u0017\u0010 \u0002\u001a\u00030\u009e\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b]\u0010\u009f\u0002R \u0010¥\u0002\u001a\u00030¡\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¢\u0002\u0010£\u0002\u001a\u0006\bë\u0001\u0010¤\u0002R#\u0010¨\u0002\u001a\u00030¦\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b§\u0002\u0010¥\u0001R\u0018\u0010«\u0002\u001a\u00030©\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010ª\u0002R!\u0010¯\u0002\u001a\u00030¬\u00028\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b\u00ad\u0002\u0010®\u0002R \u0010°\u0002\u001a\u00030¬\u00028\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\b[\u0010®\u0002R1\u0010¶\u0002\u001a\u00020\"8\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\b\u00ad\u0001\u0010¥\u0001\u0012\u0006\bµ\u0002\u0010\u0091\u0002\u001a\u0006\b±\u0002\u0010²\u0002\"\u0006\b³\u0002\u0010´\u0002R\u0019\u0010¸\u0002\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0002\u0010¨\u0001R#\u0010¹\u0002\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b\u0091\u0001\u0010¥\u0001R\u0018\u0010º\u0002\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010¨\u0001R7\u0010Á\u0002\u001a\u0004\u0018\u00010{2\t\u0010±\u0001\u001a\u0004\u0018\u00010{8F@BX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b»\u0002\u0010¼\u0002\u001a\u0006\b½\u0002\u0010¾\u0002\"\u0006\b¿\u0002\u0010À\u0002R'\u0010Ã\u0002\u001a\u0010\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u0007\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0002\u0010ô\u0001R\u0017\u0010Æ\u0002\u001a\u00030Ä\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010Å\u0002R\u0017\u0010É\u0002\u001a\u00030Ç\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010È\u0002R\u0017\u0010Ì\u0002\u001a\u00030Ê\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bQ\u0010Ë\u0002R\u001f\u0010Ñ\u0002\u001a\u00030Í\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b0\u0010Î\u0002\u001a\u0006\bÏ\u0002\u0010Ð\u0002R \u0010Õ\u0002\u001a\u00030Ò\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010Ó\u0002\u001a\u0006\b\u00ad\u0002\u0010Ô\u0002R(\u0010Ü\u0002\u001a\u00030Ö\u00028\u0016X\u0097\u0004¢\u0006\u0018\n\u0006\b×\u0002\u0010Ø\u0002\u0012\u0006\bÛ\u0002\u0010\u0091\u0002\u001a\u0006\bÙ\u0002\u0010Ú\u0002R5\u0010á\u0002\u001a\u00030Ý\u00022\b\u0010±\u0001\u001a\u00030Ý\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b\u0080\u0002\u0010¼\u0002\u001a\u0006\b¥\u0001\u0010Þ\u0002\"\u0006\bß\u0002\u0010à\u0002R\u0018\u0010â\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bu\u0010§\u0002R5\u0010 \u0001\u001a\u00030ã\u00022\b\u0010±\u0001\u001a\u00030ã\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\bä\u0002\u0010¼\u0002\u001a\u0006\bå\u0002\u0010æ\u0002\"\u0006\bç\u0002\u0010è\u0002R \u0010ì\u0002\u001a\u00030é\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÏ\u0002\u0010ê\u0002\u001a\u0006\b»\u0002\u0010ë\u0002R\u0018\u0010ï\u0002\u001a\u00030í\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010î\u0002R \u0010ó\u0002\u001a\u00030ð\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÚ\u0001\u0010ñ\u0002\u001a\u0006\bÞ\u0001\u0010ò\u0002R \u0010ø\u0002\u001a\u00030ô\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bõ\u0002\u0010ö\u0002\u001a\u0006\bâ\u0001\u0010÷\u0002R\u001b\u0010ú\u0002\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0002\u0010ù\u0002R\u0019\u0010ü\u0002\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0002\u0010¥\u0001R\u001d\u0010ÿ\u0002\u001a\t\u0012\u0004\u0012\u00020l0ý\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010þ\u0002R%\u0010\u0082\u0003\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010G0\u0080\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0081\u0003R\u0017\u0010\u0085\u0003\u001a\u00030\u0083\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010\u0084\u0003R\u0018\u0010\u0088\u0003\u001a\u00030\u0086\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0087\u0003R\u0018\u0010\u0089\u0003\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010¨\u0001R\u001c\u0010\u008b\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070G8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u008a\u0003R\u0017\u0010\u008e\u0003\u001a\u00030\u008c\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010\u008d\u0003R\u0018\u0010\u008f\u0003\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010¨\u0001R\u001b\u0010\u0092\u0003\u001a\u0005\u0018\u00010\u0090\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0091\u0003R\u001f\u0010\u0096\u0003\u001a\u00030\u0093\u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b,\u0010\u0094\u0003\u001a\u0006\b\u0097\u0002\u0010\u0095\u0003R\u001c\u0010\u0098\u0003\u001a\u00020\u000e*\u00030\u009d\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bä\u0002\u0010\u0097\u0003R\u0016\u0010K\u001a\u00020.8VX\u0096\u0004¢\u0006\b\u001a\u0006\bõ\u0002\u0010\u0099\u0003R\u0018\u0010\u009c\u0003\u001a\u00030\u009a\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b·\u0002\u0010\u009b\u0003R\u001a\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u009d\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010\u009e\u0003R\u0018\u0010 \u0003\u001a\u00030\u0093\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b×\u0002\u0010\u009f\u0003R\u0018\u0010£\u0003\u001a\u00030¡\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010¢\u0003\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006¨\u0003"}, m28432d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "LjD3;", "Landroidx/compose/ui/platform/l;", "LDY3;", "LVX0;", "viewGroup", "", "p0", "LJm2;", "nodeToRemeasure", "V0", "", "o0", "", "measureSpec", "Lkotlin/Pair;", "q0", "h1", "node", "J0", "I0", "Landroid/view/MotionEvent;", "event", "F0", "motionEvent", "LP64;", "E0", "(Landroid/view/MotionEvent;)I", "lastEvent", "G0", "L0", "a1", "action", "", "eventTime", "forceHover", "b1", "M0", "P0", "Q0", "R0", "m0", "K0", "N0", "accessibilityId", "Landroid/view/View;", "currentView", "s0", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "LLifecycleOwner;", "owner", "onResume", "gainFocus", "direction", "previouslyFocusedRect", "onFocusChanged", "hasWindowFocus", "onWindowFocusChanged", "Lik2;", "keyEvent", "Z0", "(Landroid/view/KeyEvent;)Z", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "e", "u", "U0", "y", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "layoutNode", "l0", "T0", "Landroid/graphics/Canvas;", "canvas", "r0", "sendPointerUpdate", C17296a.f69688o, "Lkz0;", "constraints", "O", "(LJm2;J)V", "N", "affectsLookahead", "forceRequest", "P", "L", "G", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "l", "t", "r", "b", "onLayout", "onDraw", "Lkotlin/Function1;", "Lme0;", "drawBlock", "invalidateParentLayer", "LiD3;", "x", "layer", "S0", "(LiD3;)Z", "V", "LjD3$b;", "E", "Landroidx/compose/ui/focus/c;", "w0", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/c;", "dispatchDraw", "isDirty", "O0", "(LiD3;Z)V", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "callback", "setOnViewTreeOwnersAvailable", "n0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "H0", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewStructure;", "structure", "flags", "onProvideAutofillVirtualStructure", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "LCe3;", "localPosition", "S", "(J)J", "positionOnScreen", "q", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "positionInWindow", "w", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "layoutDirection", "onRtlPropertiesChanged", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "shouldDelayChildPressedState", "J", "lastDownPointerPosition", "c", "Z", "superclassInitComplete", "LLm2;", DateTokenConverter.CONVERTER_KEY, "LLm2;", "Q", "()LLm2;", "sharedDrawScope", "Lg01;", "<set-?>", "Lg01;", "()Lg01;", "density", "Les5;", "f", "Les5;", "semanticsModifier", "LQv1;", "g", "LQv1;", "B", "()LQv1;", "focusOwner", "LoB6;", "h", "LoB6;", "_windowInfo", "LgV2;", "i", "LgV2;", "keyInputModifier", "j", "rotaryInputModifier", "Lqe0;", "k", "Lqe0;", "canvasHolder", "LJm2;", "z0", "()LJm2;", "root", "LLb5;", "m", "LLb5;", "getRootForTest", "()LLb5;", "rootForTest", "Lls5;", "n", "Lls5;", "A0", "()Lls5;", "semanticsOwner", "Landroidx/compose/ui/platform/f;", "o", "Landroidx/compose/ui/platform/f;", "accessibilityDelegate", "LQu;", "p", "LQu;", "z", "()LQu;", "autofillTree", "", "Ljava/util/List;", "dirtyLayers", "postponedDirtyLayers", "s", "isDrawingContent", "LRV2;", "LRV2;", "motionEventAdapter", "LnX3;", "LnX3;", "pointerInputEventProcessor", "v", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/Function1;)V", "configurationChangeObserver", "Lrb;", "Lrb;", "_autofill", "observationClearRequested", "Ldc;", "Ldc;", "v0", "()Ldc;", "clipboardManager", "Ljb;", "Ljb;", "t0", "()Ljb;", "accessibilityManager", "LmD3;", "A", "LmD3;", "()LmD3;", "snapshotObserver", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_androidViewsHandler", "Landroidx/compose/ui/platform/DrawChildContainer;", "D", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewLayersContainer", "Lkz0;", "onMeasureConstraints", "F", "wasMeasuredWithMultipleConstraints", "LwO2;", "LwO2;", "measureAndLayoutDelegate", "LJq6;", "H", "LJq6;", "()LJq6;", "viewConfiguration", "LA52;", "I", "globalPosition", "", "[I", "tmpPositionArray", "LhN2;", "K", "[F", "viewToWindowMatrix", "windowToViewMatrix", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "R", "forceUseMatrixCache", "windowPosition", "isRenderNodeCompatible", "U", "LEX2;", "C0", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "f1", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "viewTreeOwners", "W", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "LjW3;", "LjW3;", "y0", "()LjW3;", "platformTextInputPluginRegistry", "LU16;", "LU16;", "()LU16;", "textInputService", "Lew1$b;", AbstractC26684u0.f100690q, "Lew1$b;", "M", "()Lew1$b;", "getFontLoader$annotations", "fontLoader", "Lkw1$b;", "()Lkw1$b;", "d1", "(Lkw1$b;)V", "fontFamilyResolver", "currentFontWeightAdjustment", "Lpm2;", "x0", "getLayoutDirection", "()Lpm2;", "e1", "(Lpm2;)V", "LWE1;", "LWE1;", "()LWE1;", "hapticFeedBack", "Ln32;", "Ln32;", "_inputModeManager", "LkV2;", "LkV2;", "()LkV2;", "modifierLocalManager", "LI26;", "B0", "LI26;", "()LI26;", "textToolbar", "Landroid/view/MotionEvent;", "previousMotionEvent", "D0", "relayoutTime", "Luz6;", "Luz6;", "layerCache", "LLX2;", "LLX2;", "endApplyChangesListeners", "androidx/compose/ui/platform/AndroidComposeView$l", "Landroidx/compose/ui/platform/AndroidComposeView$l;", "resendMotionEventRunnable", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "sendHoverExitEvent", "hoverExitReceived", "Lkotlin/jvm/functions/Function0;", "resendMotionEventOnLayout", "Ll80;", "Ll80;", "matrixToWindow", "keyboardModifiersRequireUpdate", "LdX3;", "LdX3;", "desiredPointerIcon", "LgX3;", "LgX3;", "()LgX3;", "pointerIconService", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "()Landroid/view/View;", "LnB6;", "()LnB6;", "windowInfo", "Lzu;", "()Lzu;", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "Lm32;", "()Lm32;", "inputModeManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"ViewConstructor", "VisibleForTests"})
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 6 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 9 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1941:1\n1182#2:1942\n1161#2,2:1943\n76#3:1945\n102#3,2:1946\n76#3:1948\n102#3,2:1949\n76#3:1951\n102#3,2:1952\n523#4:1954\n728#4,2:1955\n460#4,11:1979\n460#4,11:1991\n26#5,5:1957\n26#5,5:1962\n26#5,5:1967\n26#5,5:2006\n47#6,5:1972\n1#7:1977\n163#8:1978\n163#8:1990\n20#9,2:2002\n20#9,2:2004\n533#10,6:2011\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n481#1:1942\n481#1:1943,2\n348#1:1945\n348#1:1946,2\n405#1:1948\n405#1:1949,2\n419#1:1951\n419#1:1952,2\n673#1:1954\n686#1:1955,2\n1115#1:1979,11\n1123#1:1991,11\n803#1:1957,5\n814#1:1962,5\n864#1:1967,5\n1273#1:2006,5\n1041#1:1972,5\n1115#1:1978\n1123#1:1990\n1135#1:2002,2\n1190#1:2004,2\n1357#1:2011,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView */
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements InterfaceC43181jD3, InterfaceC11445l, DY3, VX0 {

    /* renamed from: O0 */
    public static final C11338a f53075O0 = new C11338a(null);

    /* renamed from: P0 */
    public static Class<?> f53076P0;

    /* renamed from: Q0 */
    public static Method f53077Q0;

    /* renamed from: A */
    public final C44960mD3 f53078A;

    /* renamed from: A0 */
    public final C43935kV2 f53079A0;

    /* renamed from: B */
    public boolean f53080B;

    /* renamed from: B0 */
    public final I26 f53081B0;

    /* renamed from: C */
    public AndroidViewsHandler f53082C;

    /* renamed from: C0 */
    public MotionEvent f53083C0;

    /* renamed from: D */
    public DrawChildContainer f53084D;

    /* renamed from: D0 */
    public long f53085D0;

    /* renamed from: E */
    public C44228kz0 f53086E;

    /* renamed from: E0 */
    public final C50163uz6<InterfaceC42588iD3> f53087E0;

    /* renamed from: F */
    public boolean f53088F;

    /* renamed from: F0 */
    public final LX2<Function0<Unit>> f53089F0;

    /* renamed from: G */
    public final C50986wO2 f53090G;

    /* renamed from: G0 */
    public final RunnableC11350l f53091G0;

    /* renamed from: H */
    public final InterfaceC33869Jq6 f53092H;

    /* renamed from: H0 */
    public final Runnable f53093H0;

    /* renamed from: I */
    public long f53094I;

    /* renamed from: I0 */
    public boolean f53095I0;

    /* renamed from: J */
    public final int[] f53096J;

    /* renamed from: J0 */
    public final Function0<Unit> f53097J0;

    /* renamed from: K */
    public final float[] f53098K;

    /* renamed from: K0 */
    public final InterfaceC44317l80 f53099K0;

    /* renamed from: L0 */
    public boolean f53100L0;

    /* renamed from: M0 */
    public InterfaceC39804dX3 f53101M0;

    /* renamed from: N0 */
    public final InterfaceC41582gX3 f53102N0;

    /* renamed from: P */
    public final float[] f53103P;

    /* renamed from: Q */
    public long f53104Q;

    /* renamed from: R */
    public boolean f53105R;

    /* renamed from: S */
    public long f53106S;

    /* renamed from: T */
    public boolean f53107T;

    /* renamed from: U */
    public final EX2 f53108U;

    /* renamed from: W */
    public Function1<? super C11339b, Unit> f53109W;

    /* renamed from: b */
    public long f53110b;

    /* renamed from: c */
    public boolean f53111c;

    /* renamed from: d */
    public final C34297Lm2 f53112d;

    /* renamed from: e */
    public InterfaceC41273g01 f53113e;

    /* renamed from: f */
    public final C40605es5 f53114f;

    /* renamed from: g */
    public final InterfaceC35547Qv1 f53115g;

    /* renamed from: h */
    public final C46131oB6 f53116h;

    /* renamed from: i */
    public final InterfaceC41563gV2 f53117i;

    /* renamed from: j */
    public final InterfaceC41563gV2 f53118j;

    /* renamed from: k */
    public final C47576qe0 f53119k;

    /* renamed from: l */
    public final C33829Jm2 f53120l;

    /* renamed from: m */
    public final InterfaceC34201Lb5 f53121m;

    /* renamed from: n */
    public final C44756ls5 f53122n;

    /* renamed from: o */
    public final C11381f f53123o;

    /* renamed from: p */
    public final C6975Qu f53124p;

    /* renamed from: p0 */
    public final ViewTreeObserver.OnGlobalLayoutListener f53125p0;

    /* renamed from: q */
    public final List<InterfaceC42588iD3> f53126q;

    /* renamed from: q0 */
    public final ViewTreeObserver.OnScrollChangedListener f53127q0;

    /* renamed from: r */
    public List<InterfaceC42588iD3> f53128r;

    /* renamed from: r0 */
    public final ViewTreeObserver.OnTouchModeChangeListener f53129r0;

    /* renamed from: s */
    public boolean f53130s;

    /* renamed from: s0 */
    public final C43352jW3 f53131s0;

    /* renamed from: t */
    public final RV2 f53132t;

    /* renamed from: t0 */
    public final U16 f53133t0;

    /* renamed from: u */
    public final C45733nX3 f53134u;

    /* renamed from: u0 */
    public final InterfaceC40641ew1.InterfaceC20148b f53135u0;

    /* renamed from: v */
    public Function1<? super Configuration, Unit> f53136v;

    /* renamed from: v0 */
    public final EX2 f53137v0;

    /* renamed from: w */
    public final C27951rb f53138w;

    /* renamed from: w0 */
    public int f53139w0;

    /* renamed from: x */
    public boolean f53140x;

    /* renamed from: x0 */
    public final EX2 f53141x0;

    /* renamed from: y */
    public final C19807dc f53142y;

    /* renamed from: y0 */
    public final WE1 f53143y0;

    /* renamed from: z */
    public final C24950jb f53144z;

    /* renamed from: z0 */
    public final C45455n32 f53145z0;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$a;", "", "", "b", "", "FocusTag", "Ljava/lang/String;", "", "MaximumLayerCacheSize", "I", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$a */
    /* loaded from: classes.dex */
    public static final class C11338a {
        public /* synthetic */ C11338a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        /* renamed from: b */
        public final boolean m68546b() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (AndroidComposeView.f53076P0 == null) {
                    AndroidComposeView.f53076P0 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.f53076P0;
                    if (cls != null) {
                        method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                    } else {
                        method = null;
                    }
                    AndroidComposeView.f53077Q0 = method;
                }
                Method method2 = AndroidComposeView.f53077Q0;
                if (method2 != null) {
                    obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = obj;
                }
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }

        private C11338a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, m28432d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "", "LLifecycleOwner;", C17296a.f69688o, "LLifecycleOwner;", "()LLifecycleOwner;", "lifecycleOwner", "LPi5;", "b", "LPi5;", "()LPi5;", "savedStateRegistryOwner", "<init>", "(LLifecycleOwner;LPi5;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$b */
    /* loaded from: classes.dex */
    public static final class C11339b {

        /* renamed from: a */
        public final LifecycleOwner f53146a;

        /* renamed from: b */
        public final InterfaceC35200Pi5 f53147b;

        public C11339b(LifecycleOwner lifecycleOwner, InterfaceC35200Pi5 savedStateRegistryOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
            this.f53146a = lifecycleOwner;
            this.f53147b = savedStateRegistryOwner;
        }

        /* renamed from: a */
        public final LifecycleOwner m68545a() {
            return this.f53146a;
        }

        /* renamed from: b */
        public final InterfaceC35200Pi5 m68544b() {
            return this.f53147b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Ll32;", "it", "", "b", "(I)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$c */
    /* loaded from: classes.dex */
    public static final class C11340c extends Lambda implements Function1<C44269l32, Boolean> {
        public C11340c() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean m68543b(int i) {
            boolean z;
            C44269l32.C25593a c25593a = C44269l32.f95397b;
            if (C44269l32.m27987f(i, c25593a.m27982b())) {
                z = AndroidComposeView.this.isInTouchMode();
            } else if (C44269l32.m27987f(i, c25593a.m27983a())) {
                if (AndroidComposeView.this.isInTouchMode()) {
                    z = AndroidComposeView.this.requestFocusFromTouch();
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(C44269l32 c44269l32) {
            return m68543b(c44269l32.m27984i());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"androidx/compose/ui/platform/AndroidComposeView$d", "LM1;", "Landroid/view/View;", "host", "Lp2;", "info", "", "onInitializeAccessibilityNodeInfo", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$d */
    /* loaded from: classes.dex */
    public static final class C11341d extends C5148M1 {

        /* renamed from: a */
        public final /* synthetic */ C33829Jm2 f53149a;

        /* renamed from: b */
        public final /* synthetic */ AndroidComposeView f53150b;

        /* renamed from: c */
        public final /* synthetic */ AndroidComposeView f53151c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "it", "", C17296a.f69688o, "(LJm2;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.AndroidComposeView$d$a */
        /* loaded from: classes.dex */
        public static final class C11342a extends Lambda implements Function1<C33829Jm2, Boolean> {

            /* renamed from: g */
            public static final C11342a f53152g = new C11342a();

            public C11342a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(C33829Jm2 it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (C43570js5.m29803i(it) != null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C11341d(C33829Jm2 c33829Jm2, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
            this.f53149a = c33829Jm2;
            this.f53150b = androidComposeView;
            this.f53151c = androidComposeView2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
            if (r3.intValue() == r2.f53150b.m68612A0().m26718a().m31730k()) goto L10;
         */
        @Override // p000.C5148M1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onInitializeAccessibilityNodeInfo(View host, C27125p2 info) {
            Integer num;
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.onInitializeAccessibilityNodeInfo(host, info);
            C33829Jm2 m29807e = C43570js5.m29807e(this.f53149a, C11342a.f53152g);
            if (m29807e != null) {
                num = Integer.valueOf(m29807e.m99750r0());
            } else {
                num = null;
            }
            if (num != null) {
            }
            num = -1;
            info.m20134C0(this.f53151c, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/res/Configuration;", "it", "", C17296a.f69688o, "(Landroid/content/res/Configuration;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$e */
    /* loaded from: classes.dex */
    public static final class C11343e extends Lambda implements Function1<Configuration, Unit> {

        /* renamed from: g */
        public static final C11343e f53153g = new C11343e();

        public C11343e() {
            super(1);
        }

        /* renamed from: a */
        public final void m68541a(Configuration it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
            m68541a(configuration);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lkotlin/Function0;", "", "it", C17296a.f69688o, "(Lkotlin/jvm/functions/Function0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$f */
    /* loaded from: classes.dex */
    public static final class C11344f extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        public C11344f() {
            super(1);
        }

        /* renamed from: a */
        public final void m68540a(Function0<Unit> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidComposeView.this.mo31000T(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            m68540a(function0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lik2;", "it", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$g */
    /* loaded from: classes.dex */
    public static final class C11345g extends Lambda implements Function1<C42894ik2, Boolean> {
        public C11345g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(C42894ik2 c42894ik2) {
            return m116234invokeZmokQxo(c42894ik2.m33518f());
        }

        /* renamed from: invoke-ZmokQxo  reason: not valid java name */
        public final Boolean m116234invokeZmokQxo(KeyEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C11299c m68551w0 = AndroidComposeView.this.m68551w0(it);
            if (m68551w0 != null && C44673lk2.m26890e(C45266mk2.m25124b(it), C44673lk2.f96650a.m26889a())) {
                return Boolean.valueOf(AndroidComposeView.this.mo31015B().mo68851i(m68551w0.m68808o()));
            }
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LhW3;", "factory", "LfW3;", "platformTextInput", "LgW3;", C17296a.f69688o, "(LhW3;LfW3;)LgW3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$h */
    /* loaded from: classes.dex */
    public static final class C11346h extends Lambda implements Function2<InterfaceC42166hW3<?>, InterfaceC40980fW3, InterfaceC41573gW3> {
        public C11346h() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [gW3] */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final InterfaceC41573gW3 invoke(InterfaceC42166hW3<?> factory, InterfaceC40980fW3 platformTextInput) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(platformTextInput, "platformTextInput");
            return factory.mo36254a(platformTextInput, AndroidComposeView.this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m28432d2 = {"androidx/compose/ui/platform/AndroidComposeView$i", "LgX3;", "LdX3;", "value", "getCurrent", "()LdX3;", C17296a.f69688o, "(LdX3;)V", "current", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$i */
    /* loaded from: classes.dex */
    public static final class C11347i implements InterfaceC41582gX3 {
        public C11347i() {
        }

        @Override // p000.InterfaceC41582gX3
        /* renamed from: a */
        public void mo39187a(InterfaceC39804dX3 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            AndroidComposeView.this.f53101M0 = value;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$j */
    /* loaded from: classes.dex */
    public static final class C11348j extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ AndroidViewHolder f53159h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11348j(AndroidViewHolder androidViewHolder) {
            super(0);
            this.f53159h = androidViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AndroidComposeView.this.m68553u0().removeViewInLayout(this.f53159h);
            HashMap<C33829Jm2, AndroidViewHolder> m68532c = AndroidComposeView.this.m68553u0().m68532c();
            TypeIntrinsics.asMutableMap(m68532c).remove(AndroidComposeView.this.m68553u0().m68533b().remove(this.f53159h));
            C38790bq6.m62539H0(this.f53159h, 0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$k */
    /* loaded from: classes.dex */
    public static final class C11349k extends Lambda implements Function0<Unit> {
        public C11349k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MotionEvent motionEvent = AndroidComposeView.this.f53083C0;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.f53085D0 = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.f53091G0);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"androidx/compose/ui/platform/AndroidComposeView$l", "Ljava/lang/Runnable;", "", "run", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$l */
    /* loaded from: classes.dex */
    public static final class RunnableC11350l implements Runnable {
        public RunnableC11350l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.f53083C0;
            if (motionEvent != null) {
                boolean z2 = false;
                if (motionEvent.getToolType(0) == 3) {
                    z = true;
                } else {
                    z = false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (!z ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z2 = true;
                }
                if (z2) {
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.m68579b1(motionEvent, i, androidComposeView.f53085D0, false);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LQb5;", "it", "", C17296a.f69688o, "(LQb5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$m */
    /* loaded from: classes.dex */
    public static final class C11351m extends Lambda implements Function1<C35371Qb5, Boolean> {

        /* renamed from: g */
        public static final C11351m f53162g = new C11351m();

        public C11351m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C35371Qb5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lss5;", "", "invoke", "(Lss5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$n */
    /* loaded from: classes.dex */
    public static final class C11352n extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public static final C11352n f53163g = new C11352n();

        public C11352n() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lkotlin/Function0;", "", "command", "b", "(Lkotlin/jvm/functions/Function0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$o */
    /* loaded from: classes.dex */
    public static final class C11353o extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        public C11353o() {
            super(1);
        }

        /* renamed from: c */
        public static final void m68535c(Function0 tmp0) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke();
        }

        /* renamed from: b */
        public final void m68536b(final Function0<Unit> command) {
            Looper looper;
            Intrinsics.checkNotNullParameter(command, "command");
            Handler handler = AndroidComposeView.this.getHandler();
            if (handler != null) {
                looper = handler.getLooper();
            } else {
                looper = null;
            }
            if (looper == Looper.myLooper()) {
                command.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: lc
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.C11353o.m68535c(Function0.this);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            m68536b(function0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context) {
        super(context);
        C27951rb c27951rb;
        EX2 m97025e;
        EX2 m97025e2;
        int m27983a;
        InterfaceC44317l80 c44910m80;
        Intrinsics.checkNotNullParameter(context, "context");
        C32120Ce3.C1110a c1110a = C32120Ce3.f4427b;
        this.f53110b = c1110a.m111933b();
        this.f53111c = true;
        this.f53112d = new C34297Lm2(null, 1, null);
        this.f53113e = C0163Ac.m115450a(context);
        C40605es5 c40605es5 = new C40605es5(false, false, C11352n.f53163g, null, 8, null);
        this.f53114f = c40605es5;
        this.f53115g = new FocusOwnerImpl(new C11344f());
        this.f53116h = new C46131oB6();
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m17173a = C47638qk2.m17173a(c20912a, new C11345g());
        this.f53117i = m17173a;
        InterfaceC41563gV2 m93725a = C34669Nb5.m93725a(c20912a, C11351m.f53162g);
        this.f53118j = m93725a;
        this.f53119k = new C47576qe0();
        C33829Jm2 c33829Jm2 = new C33829Jm2(false, 0, 3, null);
        c33829Jm2.mo99760o(C34435Mb5.f23271b);
        c33829Jm2.mo99769k(mo30995b());
        c33829Jm2.mo99757p(c20912a.mo39266t0(c40605es5).mo39266t0(m93725a).mo39266t0(mo31015B().mo68854f()).mo39266t0(m17173a));
        this.f53120l = c33829Jm2;
        this.f53121m = this;
        this.f53122n = new C44756ls5(m68548z0());
        C11381f c11381f = new C11381f(this);
        this.f53123o = c11381f;
        this.f53124p = new C6975Qu();
        this.f53126q = new ArrayList();
        this.f53132t = new RV2();
        this.f53134u = new C45733nX3(m68548z0());
        this.f53136v = C11343e.f53153g;
        if (m68562m0()) {
            c27951rb = new C27951rb(this, mo30978z());
        } else {
            c27951rb = null;
        }
        this.f53138w = c27951rb;
        this.f53142y = new C19807dc(context);
        this.f53144z = new C24950jb(context);
        this.f53078A = new C44960mD3(new C11353o());
        this.f53090G = new C50986wO2(m68548z0());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(context)");
        this.f53092H = new C20080ee(viewConfiguration);
        this.f53094I = B52.m114704a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f53096J = new int[]{0, 0};
        this.f53098K = C42084hN2.m36494c(null, 1, null);
        this.f53103P = C42084hN2.m36494c(null, 1, null);
        this.f53104Q = -1L;
        this.f53106S = c1110a.m111934a();
        this.f53107T = true;
        m97025e = LM5.m97025e(null, null, 2, null);
        this.f53108U = m97025e;
        this.f53125p0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: hc
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.m68609D0(AndroidComposeView.this);
            }
        };
        this.f53127q0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: ic
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.m68587X0(AndroidComposeView.this);
            }
        };
        this.f53129r0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: jc
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.m68569g1(AndroidComposeView.this, z);
            }
        };
        this.f53131s0 = new C43352jW3(new C11346h());
        this.f53133t0 = ((C6412Pd.C6413a) mo30997W().m30386e(C6412Pd.f28754a).m30384a()).m90056b();
        this.f53135u0 = new C5035Lc(context);
        this.f53137v0 = GM5.m105200g(C46571ow1.m20258a(context), GM5.m105194m());
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        this.f53139w0 = m68550x0(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "context.resources.configuration");
        m97025e2 = LM5.m97025e(C30240xc.m4955d(configuration2), null, 2, null);
        this.f53141x0 = m97025e2;
        this.f53143y0 = new C52236yV3(this);
        if (isInTouchMode()) {
            m27983a = C44269l32.f95397b.m27982b();
        } else {
            m27983a = C44269l32.f95397b.m27983a();
        }
        this.f53145z0 = new C45455n32(m27983a, new C11340c(), null);
        this.f53079A0 = new C43935kV2(this);
        this.f53081B0 = new C7896Td(this);
        this.f53087E0 = new C50163uz6<>();
        this.f53089F0 = new LX2<>(new Function0[16], 0);
        this.f53091G0 = new RunnableC11350l();
        this.f53093H0 = new Runnable() { // from class: kc
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.m68585Y0(AndroidComposeView.this);
            }
        };
        this.f53097J0 = new C11349k();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c44910m80 = new C46096o80();
        } else {
            c44910m80 = new C44910m80();
        }
        this.f53099K0 = c44910m80;
        setWillNotDraw(false);
        setFocusable(true);
        if (i >= 26) {
            C29923wc.f116262a.m6598a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        C38790bq6.m62452v0(this, c11381f);
        Function1<InterfaceC11445l, Unit> m68288a = InterfaceC11445l.f53400f0.m68288a();
        if (m68288a != null) {
            m68288a.invoke(this);
        }
        m68548z0().m99734x(this);
        if (i >= 29) {
            C28361sc.f109038a.m13950a(this);
        }
        this.f53102N0 = new C11347i();
    }

    /* renamed from: D0 */
    public static final void m68609D0(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m68567h1();
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m68589W0(AndroidComposeView androidComposeView, C33829Jm2 c33829Jm2, int i, Object obj) {
        if ((i & 1) != 0) {
            c33829Jm2 = null;
        }
        androidComposeView.m68590V0(c33829Jm2);
    }

    /* renamed from: X0 */
    public static final void m68587X0(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m68567h1();
    }

    /* renamed from: Y0 */
    public static final void m68585Y0(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = false;
        this$0.f53095I0 = false;
        MotionEvent motionEvent = this$0.f53083C0;
        Intrinsics.checkNotNull(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            z = true;
        }
        if (z) {
            this$0.m68581a1(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    /* renamed from: c1 */
    public static /* synthetic */ void m68577c1(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.m68579b1(motionEvent, i, j, z);
    }

    /* renamed from: g1 */
    public static final void m68569g1(AndroidComposeView this$0, boolean z) {
        int m27983a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C45455n32 c45455n32 = this$0.f53145z0;
        if (z) {
            m27983a = C44269l32.f95397b.m27982b();
        } else {
            m27983a = C44269l32.f95397b.m27983a();
        }
        c45455n32.m24517b(m27983a);
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: A */
    public boolean mo31016A() {
        return this.f53080B;
    }

    /* renamed from: A0 */
    public C44756ls5 m68612A0() {
        return this.f53122n;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: B */
    public InterfaceC35547Qv1 mo31015B() {
        return this.f53115g;
    }

    /* renamed from: B0 */
    public View m68611B0() {
        return this;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: C */
    public long mo31014C(long j) {
        m68597P0();
        return C42084hN2.m36491f(this.f53098K, j);
    }

    /* renamed from: C0 */
    public final C11339b m68610C0() {
        return (C11339b) this.f53108U.getValue();
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: D */
    public InterfaceC41582gX3 mo31013D() {
        return this.f53102N0;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: E */
    public void mo31012E(InterfaceC43181jD3.InterfaceC24738b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f53090G.m6914q(listener);
        m68589W0(this, null, 1, null);
    }

    /* renamed from: E0 */
    public final int m68608E0(MotionEvent motionEvent) {
        boolean z;
        removeCallbacks(this.f53091G0);
        try {
            m68596Q0(motionEvent);
            boolean z2 = true;
            this.f53105R = true;
            mo30996a(false);
            this.f53101M0 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.f53083C0;
            if (motionEvent2 != null && motionEvent2.getToolType(0) == 3) {
                z = true;
            } else {
                z = false;
            }
            if (motionEvent2 != null && m68606G0(motionEvent, motionEvent2)) {
                if (m68601L0(motionEvent2)) {
                    this.f53134u.m23557b();
                } else if (motionEvent2.getActionMasked() != 10 && z) {
                    m68577c1(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z2 = false;
            }
            if (!z && z2 && actionMasked != 3 && actionMasked != 9 && m68600M0(motionEvent)) {
                m68577c1(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f53083C0 = MotionEvent.obtainNoHistory(motionEvent);
            int m68581a1 = m68581a1(motionEvent);
            Trace.endSection();
            C28792tc.f110785a.m12014a(this, this.f53101M0);
            return m68581a1;
        } finally {
            this.f53105R = false;
        }
    }

    /* renamed from: F0 */
    public final boolean m68607F0(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        return mo31015B().mo68847m(new C35371Qb5(C34571Mq6.m94684e(viewConfiguration, getContext()) * f, f * C34571Mq6.m94687b(viewConfiguration, getContext()), motionEvent.getEventTime()));
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: G */
    public void mo31011G(C33829Jm2 layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f53090G.m6907x(layoutNode);
        m68589W0(this, null, 1, null);
    }

    /* renamed from: G0 */
    public final boolean m68606G0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    /* renamed from: H0 */
    public void m68605H0() {
        m68604I0(m68548z0());
    }

    /* renamed from: I0 */
    public final void m68604I0(C33829Jm2 c33829Jm2) {
        c33829Jm2.m99830F0();
        LX2<C33829Jm2> m99736w0 = c33829Jm2.m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            int i = 0;
            do {
                m68604I0(m96691s[i]);
                i++;
            } while (i < m96690u);
        }
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: J */
    public AbstractC44199kw1.InterfaceC25559b mo31009J() {
        return (AbstractC44199kw1.InterfaceC25559b) this.f53137v0.getValue();
    }

    /* renamed from: J0 */
    public final void m68603J0(C33829Jm2 c33829Jm2) {
        int i = 0;
        C50986wO2.m6932B(this.f53090G, c33829Jm2, false, 2, null);
        LX2<C33829Jm2> m99736w0 = c33829Jm2.m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            do {
                m68603J0(m96691s[i]);
                i++;
            } while (i < m96690u);
        }
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: K */
    public U16 mo31008K() {
        return this.f53133t0;
    }

    /* renamed from: K0 */
    public final boolean m68602K0(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        float y = motionEvent.getY();
        if (!Float.isInfinite(y) && !Float.isNaN(y)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: L */
    public void mo31007L(C33829Jm2 layoutNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (z) {
            if (this.f53090G.m6911t(layoutNode, z2)) {
                m68589W0(this, null, 1, null);
            }
        } else if (this.f53090G.m6906y(layoutNode, z2)) {
            m68589W0(this, null, 1, null);
        }
    }

    /* renamed from: L0 */
    public final boolean m68601L0(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: M */
    public InterfaceC40641ew1.InterfaceC20148b mo31006M() {
        return this.f53135u0;
    }

    /* renamed from: M0 */
    public final boolean m68600M0(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= getWidth()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (0.0f <= y && y <= getHeight()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: N */
    public void mo31005N(C33829Jm2 layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f53090G.m6923h(layoutNode);
    }

    /* renamed from: N0 */
    public final boolean m68599N0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        boolean z;
        boolean z2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f53083C0) == null) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        if (motionEvent.getRawY() == motionEvent2.getRawY()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: O */
    public void mo31004O(C33829Jm2 layoutNode, long j) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f53090G.m6918m(layoutNode, j);
            C50986wO2.m6926e(this.f53090G, false, 1, null);
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: O0 */
    public final void m68598O0(InterfaceC42588iD3 layer, boolean z) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (!z) {
            if (!this.f53130s) {
                this.f53126q.remove(layer);
                List<InterfaceC42588iD3> list = this.f53128r;
                if (list != null) {
                    list.remove(layer);
                }
            }
        } else if (!this.f53130s) {
            this.f53126q.add(layer);
        } else {
            List list2 = this.f53128r;
            if (list2 == null) {
                list2 = new ArrayList();
                this.f53128r = list2;
            }
            list2.add(layer);
        }
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: P */
    public void mo31003P(C33829Jm2 layoutNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (z) {
            if (this.f53090G.m6909v(layoutNode, z2)) {
                m68590V0(layoutNode);
            }
        } else if (this.f53090G.m6933A(layoutNode, z2)) {
            m68590V0(layoutNode);
        }
    }

    /* renamed from: P0 */
    public final void m68597P0() {
        if (!this.f53105R) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f53104Q) {
                this.f53104Q = currentAnimationTimeMillis;
                m68595R0();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.f53096J);
                int[] iArr = this.f53096J;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.f53096J;
                this.f53106S = C33056Ge3.m104938a(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            }
        }
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: Q */
    public C34297Lm2 mo31002Q() {
        return this.f53112d;
    }

    /* renamed from: Q0 */
    public final void m68596Q0(MotionEvent motionEvent) {
        this.f53104Q = AnimationUtils.currentAnimationTimeMillis();
        m68595R0();
        long m36491f = C42084hN2.m36491f(this.f53098K, C33056Ge3.m104938a(motionEvent.getX(), motionEvent.getY()));
        this.f53106S = C33056Ge3.m104938a(motionEvent.getRawX() - C32120Ce3.m111944o(m36491f), motionEvent.getRawY() - C32120Ce3.m111943p(m36491f));
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: R */
    public InterfaceC45538nB6 mo31001R() {
        return this.f53116h;
    }

    /* renamed from: R0 */
    public final void m68595R0() {
        this.f53099K0.mo21727a(this, this.f53098K);
        Q92.m88865a(this.f53098K, this.f53103P);
    }

    @Override // p000.DY3
    /* renamed from: S */
    public long mo68594S(long j) {
        m68597P0();
        long m36491f = C42084hN2.m36491f(this.f53098K, j);
        return C33056Ge3.m104938a(C32120Ce3.m111944o(m36491f) + C32120Ce3.m111944o(this.f53106S), C32120Ce3.m111943p(m36491f) + C32120Ce3.m111943p(this.f53106S));
    }

    /* renamed from: S0 */
    public final boolean m68593S0(InterfaceC42588iD3 layer) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (this.f53084D != null) {
            ViewLayer.f53175p.m68511b();
        }
        this.f53087E0.m9413c(layer);
        return true;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: T */
    public void mo31000T(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!this.f53089F0.m96695j(listener)) {
            this.f53089F0.m96701b(listener);
        }
    }

    /* renamed from: T0 */
    public final void m68592T0(AndroidViewHolder view) {
        Intrinsics.checkNotNullParameter(view, "view");
        mo31000T(new C11348j(view));
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: U */
    public WE1 mo30999U() {
        return this.f53143y0;
    }

    /* renamed from: U0 */
    public final void m68591U0() {
        this.f53140x = true;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: V */
    public void mo30998V() {
        this.f53123o.m68450M();
    }

    /* renamed from: V0 */
    public final void m68590V0(C33829Jm2 c33829Jm2) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (c33829Jm2 != null) {
                while (c33829Jm2 != null && c33829Jm2.m99773i0() == C33829Jm2.EnumC4230g.InMeasureBlock && m68560o0(c33829Jm2)) {
                    c33829Jm2 = c33829Jm2.m99756p0();
                }
                if (c33829Jm2 == m68548z0()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    /* renamed from: Z0 */
    public boolean m68583Z0(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return mo31015B().mo68853g(keyEvent);
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: a */
    public void mo30996a(boolean z) {
        Function0<Unit> function0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                function0 = this.f53097J0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            function0 = null;
        }
        if (this.f53090G.m6919l(function0)) {
            requestLayout();
        }
        C50986wO2.m6926e(this.f53090G, false, 1, null);
        Unit unit = Unit.INSTANCE;
        Trace.endSection();
    }

    /* renamed from: a1 */
    public final int m68581a1(MotionEvent motionEvent) {
        C45140mX3 c45140mX3;
        if (this.f53100L0) {
            this.f53100L0 = false;
            this.f53116h.m21643a(C51661xX3.m5063b(motionEvent.getMetaState()));
        }
        C44547lX3 m86692c = this.f53132t.m86692c(motionEvent, this);
        if (m86692c != null) {
            List<C45140mX3> m27174b = m86692c.m27174b();
            ListIterator<C45140mX3> listIterator = m27174b.listIterator(m27174b.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    c45140mX3 = listIterator.previous();
                    if (c45140mX3.m25462a()) {
                        break;
                    }
                } else {
                    c45140mX3 = null;
                    break;
                }
            }
            C45140mX3 c45140mX32 = c45140mX3;
            if (c45140mX32 != null) {
                this.f53110b = c45140mX32.m25458e();
            }
            int m23558a = this.f53134u.m23558a(m86692c, this, m68600M0(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !P64.m90799c(m23558a)) {
                this.f53132t.m86690e(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return m23558a;
            }
            return m23558a;
        }
        this.f53134u.m23557b();
        return C46326oX3.m20912a(false, false);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> values) {
        C27951rb c27951rb;
        Intrinsics.checkNotNullParameter(values, "values");
        if (m68562m0() && (c27951rb = this.f53138w) != null) {
            C29267ub.m10006a(c27951rb, values);
        }
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: b */
    public InterfaceC41273g01 mo30995b() {
        return this.f53113e;
    }

    /* renamed from: b1 */
    public final void m68579b1(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int buttonState;
        long downTime;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i4 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = pointerCount - i2;
        if (i5 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            pointerPropertiesArr[i6] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            pointerCoordsArr[i7] = new MotionEvent.PointerCoords();
        }
        for (int i8 = 0; i8 < i5; i8++) {
            if (i4 >= 0 && i8 >= i4) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i9 = i3 + i8;
            motionEvent.getPointerProperties(i9, pointerPropertiesArr[i8]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i8];
            motionEvent.getPointerCoords(i9, pointerCoords);
            long mo68594S = mo68594S(C33056Ge3.m104938a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C32120Ce3.m111944o(mo68594S);
            pointerCoords.y = C32120Ce3.m111943p(mo68594S);
        }
        if (z) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent event = MotionEvent.obtain(downTime, j, i, i5, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        RV2 rv2 = this.f53132t;
        Intrinsics.checkNotNullExpressionValue(event, "event");
        C44547lX3 m86692c = rv2.m86692c(event, this);
        Intrinsics.checkNotNull(m86692c);
        this.f53134u.m23558a(m86692c, this, true);
        event.recycle();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f53123o.m68410n(false, i, this.f53110b);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f53123o.m68410n(true, i, this.f53110b);
    }

    /* renamed from: d1 */
    public final void m68575d1(AbstractC44199kw1.InterfaceC25559b interfaceC25559b) {
        this.f53137v0.setValue(interfaceC25559b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!isAttachedToWindow()) {
            m68604I0(m68548z0());
        }
        InterfaceC43181jD3.m30991j(this, false, 1, null);
        this.f53130s = true;
        C47576qe0 c47576qe0 = this.f53119k;
        Canvas m71102y = c47576qe0.m17308a().m71102y();
        c47576qe0.m17308a().m71101z(canvas);
        m68548z0().m99829G(c47576qe0.m17308a());
        c47576qe0.m17308a().m71101z(m71102y);
        if (!this.f53126q.isEmpty()) {
            int size = this.f53126q.size();
            for (int i = 0; i < size; i++) {
                this.f53126q.get(i).mo29664i();
            }
        }
        if (ViewLayer.f53175p.m68511b()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f53126q.clear();
        this.f53130s = false;
        List<InterfaceC42588iD3> list = this.f53128r;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            this.f53126q.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getActionMasked() == 8) {
            if (event.isFromSource(4194304)) {
                return m68607F0(event);
            }
            if (!m68602K0(event) && isAttachedToWindow()) {
                return P64.m90799c(m68608E0(event));
            }
            return super.dispatchGenericMotionEvent(event);
        }
        return super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f53095I0) {
            removeCallbacks(this.f53093H0);
            this.f53093H0.run();
        }
        if (m68602K0(event) || !isAttachedToWindow()) {
            return false;
        }
        if (event.isFromSource(4098) && event.getToolType(0) == 1) {
            return this.f53123o.m68396u(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && m68600M0(event)) {
                if (event.getToolType(0) != 3) {
                    MotionEvent motionEvent = this.f53083C0;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    this.f53083C0 = MotionEvent.obtainNoHistory(event);
                    this.f53095I0 = true;
                    post(this.f53093H0);
                    return false;
                } else if (event.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!m68599N0(event)) {
            return false;
        }
        return P64.m90799c(m68608E0(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isFocused()) {
            this.f53116h.m21643a(C51661xX3.m5063b(event.getMetaState()));
            return m68583Z0(C42894ik2.m33522b(event));
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.f53095I0) {
            removeCallbacks(this.f53093H0);
            MotionEvent motionEvent2 = this.f53083C0;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && !m68606G0(motionEvent, motionEvent2)) {
                this.f53095I0 = false;
            } else {
                this.f53093H0.run();
            }
        }
        if (m68602K0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !m68599N0(motionEvent)) {
            return false;
        }
        int m68608E0 = m68608E0(motionEvent);
        if (P64.m90800b(m68608E0)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return P64.m90799c(m68608E0);
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: e */
    public void mo30993e(C33829Jm2 node) {
        Intrinsics.checkNotNullParameter(node, "node");
    }

    /* renamed from: e1 */
    public final void m68573e1(EnumC47065pm2 enumC47065pm2) {
        this.f53141x0.setValue(enumC47065pm2);
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: f */
    public InterfaceC31588zu mo30992f() {
        return this.f53138w;
    }

    /* renamed from: f1 */
    public final void m68571f1(C11339b c11339b) {
        this.f53108U.setValue(c11339b);
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = m68555s0(i, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        Unit unit;
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        Intrinsics.checkNotNullParameter(rect, "rect");
        C35055Os4 mo68850j = mo31015B().mo68850j();
        if (mo68850j != null) {
            roundToInt = MathKt__MathJVMKt.roundToInt(mo68850j.m91258i());
            rect.left = roundToInt;
            roundToInt2 = MathKt__MathJVMKt.roundToInt(mo68850j.m91255l());
            rect.top = roundToInt2;
            roundToInt3 = MathKt__MathJVMKt.roundToInt(mo68850j.m91257j());
            rect.right = roundToInt3;
            roundToInt4 = MathKt__MathJVMKt.roundToInt(mo68850j.m91262e());
            rect.bottom = roundToInt4;
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // android.view.View, android.view.ViewParent, p000.InterfaceC43181jD3
    public EnumC47065pm2 getLayoutDirection() {
        return (EnumC47065pm2) this.f53141x0.getValue();
    }

    /* renamed from: h1 */
    public final void m68567h1() {
        getLocationOnScreen(this.f53096J);
        long j = this.f53094I;
        int m116118c = A52.m116118c(j);
        int m116117d = A52.m116117d(j);
        int[] iArr = this.f53096J;
        boolean z = false;
        int i = iArr[0];
        if (m116118c != i || m116117d != iArr[1]) {
            this.f53094I = B52.m114704a(i, iArr[1]);
            if (m116118c != Integer.MAX_VALUE && m116117d != Integer.MAX_VALUE) {
                m68548z0().m99796X().m91505x().m91474r1();
                z = true;
            }
        }
        this.f53090G.m6927d(z);
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: k */
    public InterfaceC44862m32 mo30990k() {
        return this.f53145z0;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: l */
    public C44960mD3 mo30989l() {
        return this.f53078A;
    }

    /* renamed from: l0 */
    public final void m68563l0(AndroidViewHolder view, C33829Jm2 layoutNode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        m68553u0().m68533b().put(view, layoutNode);
        m68553u0().addView(view);
        m68553u0().m68532c().put(layoutNode, view);
        C38790bq6.m62539H0(view, 1);
        C38790bq6.m62452v0(view, new C11341d(layoutNode, this, this));
    }

    /* renamed from: m0 */
    public final boolean m68562m0() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: n0 */
    public final Object m68561n0(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m68412m = this.f53123o.m68412m(continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m68412m == coroutine_suspended ? m68412m : Unit.INSTANCE;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: o */
    public C43935kV2 mo30987o() {
        return this.f53079A0;
    }

    /* renamed from: o0 */
    public final boolean m68560o0(C33829Jm2 c33829Jm2) {
        boolean z;
        if (this.f53088F) {
            return true;
        }
        C33829Jm2 m99756p0 = c33829Jm2.m99756p0();
        if (m99756p0 != null && !m99756p0.m99810Q()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        boolean z;
        int m27983a;
        LifecycleOwner m68545a;
        AbstractC11719f lifecycle;
        C27951rb c27951rb;
        super.onAttachedToWindow();
        m68603J0(m68548z0());
        m68604I0(m68548z0());
        mo30989l().m26009i();
        if (m68562m0() && (c27951rb = this.f53138w) != null) {
            C6204Ou.f27553a.m91201a(c27951rb);
        }
        LifecycleOwner m87653a = C35534Qt6.m87653a(this);
        InterfaceC35200Pi5 m82297a = C36236Tt6.m82297a(this);
        C11339b m68610C0 = m68610C0();
        if (m68610C0 != null && (m87653a == null || m82297a == null || (m87653a == m68610C0.m68545a() && m82297a == m68610C0.m68545a()))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (m87653a != null) {
                if (m82297a != null) {
                    if (m68610C0 != null && (m68545a = m68610C0.m68545a()) != null && (lifecycle = m68545a.getLifecycle()) != null) {
                        lifecycle.mo67006d(this);
                    }
                    m87653a.getLifecycle().mo67008a(this);
                    C11339b c11339b = new C11339b(m87653a, m82297a);
                    m68571f1(c11339b);
                    Function1<? super C11339b, Unit> function1 = this.f53109W;
                    if (function1 != null) {
                        function1.invoke(c11339b);
                    }
                    this.f53109W = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        C45455n32 c45455n32 = this.f53145z0;
        if (isInTouchMode()) {
            m27983a = C44269l32.f95397b.m27982b();
        } else {
            m27983a = C44269l32.f95397b.m27983a();
        }
        c45455n32.m24517b(m27983a);
        C11339b m68610C02 = m68610C0();
        Intrinsics.checkNotNull(m68610C02);
        m68610C02.m68545a().getLifecycle().mo67008a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f53125p0);
        getViewTreeObserver().addOnScrollChangedListener(this.f53127q0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f53129r0);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return mo30997W().m30387d() != null;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f53113e = C0163Ac.m115450a(context);
        if (m68550x0(newConfig) != this.f53139w0) {
            this.f53139w0 = m68550x0(newConfig);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            m68575d1(C46571ow1.m20258a(context2));
        }
        this.f53136v.invoke(newConfig);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        InterfaceC41573gW3 m30387d = mo30997W().m30387d();
        if (m30387d != null) {
            return m30387d.mo39200a(outAttrs);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C27951rb c27951rb;
        LifecycleOwner m68545a;
        AbstractC11719f lifecycle;
        super.onDetachedFromWindow();
        mo30989l().m26008j();
        C11339b m68610C0 = m68610C0();
        if (m68610C0 != null && (m68545a = m68610C0.m68545a()) != null && (lifecycle = m68545a.getLifecycle()) != null) {
            lifecycle.mo67006d(this);
        }
        if (m68562m0() && (c27951rb = this.f53138w) != null) {
            C6204Ou.f27553a.m91200b(c27951rb);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f53125p0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f53127q0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f53129r0);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if (z) {
            mo31015B().mo68857b();
        } else {
            mo31015B().mo68848l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f53090G.m6919l(this.f53097J0);
        this.f53086E = null;
        m68567h1();
        if (this.f53082C != null) {
            m68553u0().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m68603J0(m68548z0());
            }
            Pair<Integer, Integer> m68557q0 = m68557q0(i);
            int intValue = m68557q0.component1().intValue();
            int intValue2 = m68557q0.component2().intValue();
            Pair<Integer, Integer> m68557q02 = m68557q0(i2);
            long m22043a = C46007nz0.m22043a(intValue, intValue2, m68557q02.component1().intValue(), m68557q02.component2().intValue());
            C44228kz0 c44228kz0 = this.f53086E;
            boolean z = false;
            if (c44228kz0 == null) {
                this.f53086E = C44228kz0.m28075b(m22043a);
                this.f53088F = false;
            } else {
                if (c44228kz0 != null) {
                    z = C44228kz0.m28070g(c44228kz0.m28058s(), m22043a);
                }
                if (!z) {
                    this.f53088F = true;
                }
            }
            this.f53090G.m6931C(m22043a);
            this.f53090G.m6917n();
            setMeasuredDimension(m68548z0().m99741u0(), m68548z0().m99808R());
            if (this.f53082C != null) {
                m68553u0().measure(View.MeasureSpec.makeMeasureSpec(m68548z0().m99741u0(), 1073741824), View.MeasureSpec.makeMeasureSpec(m68548z0().m99808R(), 1073741824));
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C27951rb c27951rb;
        if (!m68562m0() || viewStructure == null || (c27951rb = this.f53138w) == null) {
            return;
        }
        C29267ub.m10005b(c27951rb, viewStructure);
    }

    @Override // p000.VX0
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setShowLayoutBounds(f53075O0.m68546b());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        EnumC47065pm2 m4953f;
        if (this.f53111c) {
            m4953f = C30240xc.m4953f(i);
            m68573e1(m4953f);
            mo31015B().mo68858a(m4953f);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean m68546b;
        this.f53116h.m21642b(z);
        this.f53100L0 = true;
        super.onWindowFocusChanged(z);
        if (z && mo31016A() != (m68546b = f53075O0.m68546b())) {
            setShowLayoutBounds(m68546b);
            m68605H0();
        }
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: p */
    public I26 mo30986p() {
        return this.f53081B0;
    }

    /* renamed from: p0 */
    public final void m68559p0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).mo30979y();
            } else if (childAt instanceof ViewGroup) {
                m68559p0((ViewGroup) childAt);
            }
        }
    }

    @Override // p000.DY3
    /* renamed from: q */
    public long mo68558q(long j) {
        m68597P0();
        return C42084hN2.m36491f(this.f53103P, C33056Ge3.m104938a(C32120Ce3.m111944o(j) - C32120Ce3.m111944o(this.f53106S), C32120Ce3.m111943p(j) - C32120Ce3.m111943p(this.f53106S)));
    }

    /* renamed from: q0 */
    public final Pair<Integer, Integer> m68557q0(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return TuplesKt.m28425to(Integer.valueOf(size), Integer.valueOf(size));
                }
                throw new IllegalStateException();
            }
            return TuplesKt.m28425to(0, Integer.MAX_VALUE);
        }
        return TuplesKt.m28425to(0, Integer.valueOf(size));
    }

    /* renamed from: r0 */
    public final void m68556r0(AndroidViewHolder view, Canvas canvas) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        m68553u0().m68534a(view, canvas);
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: s */
    public InterfaceC33869Jq6 mo30985s() {
        return this.f53092H;
    }

    /* renamed from: s0 */
    public final View m68555s0(int i, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (Intrinsics.areEqual(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    Intrinsics.checkNotNullExpressionValue(childAt, "currentView.getChildAt(i)");
                    View m68555s0 = m68555s0(i, childAt);
                    if (m68555s0 != null) {
                        return m68555s0;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f53136v = function1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.f53104Q = j;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super C11339b, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C11339b m68610C0 = m68610C0();
        if (m68610C0 != null) {
            callback.invoke(m68610C0);
        }
        if (!isAttachedToWindow()) {
            this.f53109W = callback;
        }
    }

    @Override // p000.InterfaceC43181jD3
    public void setShowLayoutBounds(boolean z) {
        this.f53080B = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: t */
    public void mo30984t(C33829Jm2 layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f53123o.m68451L(layoutNode);
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: t0 */
    public C24950jb mo30994d() {
        return this.f53144z;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: u */
    public void mo30983u(C33829Jm2 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f53090G.m6916o(node);
        m68591U0();
    }

    /* renamed from: u0 */
    public final AndroidViewsHandler m68553u0() {
        if (this.f53082C == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this.f53082C = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this.f53082C;
        Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: v0 */
    public C19807dc mo30988n() {
        return this.f53142y;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: w */
    public long mo30981w(long j) {
        m68597P0();
        return C42084hN2.m36491f(this.f53103P, j);
    }

    /* renamed from: w0 */
    public C11299c m68551w0(KeyEvent keyEvent) {
        boolean m77917n;
        boolean m77917n2;
        int m68803e;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        long m25125a = C45266mk2.m25125a(keyEvent);
        C36844Wj2.C9160a c9160a = C36844Wj2.f41718b;
        if (C36844Wj2.m77917n(m25125a, c9160a.m77904j())) {
            if (C45266mk2.m25120f(keyEvent)) {
                m68803e = C11299c.f52961b.m68802f();
            } else {
                m68803e = C11299c.f52961b.m68803e();
            }
            return C11299c.m68814i(m68803e);
        } else if (C36844Wj2.m77917n(m25125a, c9160a.m77909e())) {
            return C11299c.m68814i(C11299c.f52961b.m68801g());
        } else {
            if (C36844Wj2.m77917n(m25125a, c9160a.m77910d())) {
                return C11299c.m68814i(C11299c.f52961b.m68804d());
            }
            if (C36844Wj2.m77917n(m25125a, c9160a.m77908f())) {
                return C11299c.m68814i(C11299c.f52961b.m68800h());
            }
            if (C36844Wj2.m77917n(m25125a, c9160a.m77911c())) {
                return C11299c.m68814i(C11299c.f52961b.m68807a());
            }
            boolean z = true;
            if (C36844Wj2.m77917n(m25125a, c9160a.m77912b())) {
                m77917n = true;
            } else {
                m77917n = C36844Wj2.m77917n(m25125a, c9160a.m77907g());
            }
            if (m77917n) {
                m77917n2 = true;
            } else {
                m77917n2 = C36844Wj2.m77917n(m25125a, c9160a.m77905i());
            }
            if (m77917n2) {
                return C11299c.m68814i(C11299c.f52961b.m68806b());
            }
            if (!C36844Wj2.m77917n(m25125a, c9160a.m77913a())) {
                z = C36844Wj2.m77917n(m25125a, c9160a.m77906h());
            }
            if (z) {
                return C11299c.m68814i(C11299c.f52961b.m68805c());
            }
            return null;
        }
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: x */
    public InterfaceC42588iD3 mo30980x(Function1<? super InterfaceC45204me0, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        DrawChildContainer viewLayerContainer;
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        InterfaceC42588iD3 m9414b = this.f53087E0.m9414b();
        if (m9414b != null) {
            m9414b.mo29671b(drawBlock, invalidateParentLayer);
            return m9414b;
        }
        if (isHardwareAccelerated() && this.f53107T) {
            try {
                return new C43619jx4(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.f53107T = false;
            }
        }
        if (this.f53084D == null) {
            ViewLayer.C11358c c11358c = ViewLayer.f53175p;
            if (!c11358c.m68512a()) {
                c11358c.m68509d(new View(getContext()));
            }
            if (c11358c.m68511b()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                viewLayerContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                viewLayerContainer = new ViewLayerContainer(context2);
            }
            this.f53084D = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.f53084D;
        Intrinsics.checkNotNull(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, drawBlock, invalidateParentLayer);
    }

    /* renamed from: x0 */
    public final int m68550x0(Configuration configuration) {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            return i;
        }
        return 0;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: y */
    public void mo30979y() {
        if (this.f53140x) {
            mo30989l().m26017a();
            this.f53140x = false;
        }
        AndroidViewsHandler androidViewsHandler = this.f53082C;
        if (androidViewsHandler != null) {
            m68559p0(androidViewsHandler);
        }
        while (this.f53089F0.m96687x()) {
            int m96690u = this.f53089F0.m96690u();
            for (int i = 0; i < m96690u; i++) {
                Function0<Unit> function0 = this.f53089F0.m96691s()[i];
                this.f53089F0.m96704F(i, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.f53089F0.m96706D(0, m96690u);
        }
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: y0 */
    public C43352jW3 mo30997W() {
        return this.f53131s0;
    }

    @Override // p000.InterfaceC43181jD3
    /* renamed from: z */
    public C6975Qu mo30978z() {
        return this.f53124p;
    }

    /* renamed from: z0 */
    public C33829Jm2 m68548z0() {
        return this.f53120l;
    }
}
