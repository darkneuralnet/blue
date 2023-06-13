package androidx.compose.p003ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.p003ui.platform.AndroidComposeView;
import androidx.compose.p003ui.platform.C11371a;
import androidx.compose.p003ui.platform.C11379e;
import androidx.compose.p003ui.platform.C11381f;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt___RangesKt;
import net.danlew.android.joda.DateUtils;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.AbstractC44199kw1;
import p000.C27125p2;
import p000.C32095Cb5;
import p000.C37627Zs2;
@Metadata(m28433d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 «\u00012\u00020\u0001:\u000e\u008d\u0001\u0095\u0001\u009b\u0001¢\u0001©\u0001±\u0001µ\u0001B\u0013\u0012\b\u0010\u008c\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\bí\u0001\u0010î\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J@\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\f0\u000eH\u0002J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J=\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002J?\u0010+\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00022\b\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010(\u001a\u0004\u0018\u00010\u00022\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u00101\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010/H\u0002J*\u00103\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u00010/H\u0002J\u001c\u00108\u001a\u0004\u0018\u0001072\b\u00104\u001a\u0004\u0018\u00010\t2\u0006\u00106\u001a\u000205H\u0002J\u0010\u00109\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J/\u0010<\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010:*\u00020)2\b\u0010*\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010;\u001a\u00020\u0002H\u0002¢\u0006\u0004\b<\u0010=J\u0010\u0010@\u001a\u00020\u00132\u0006\u0010?\u001a\u00020>H\u0002J\u001e\u0010C\u001a\u00020\u00132\u0006\u0010?\u001a\u00020>2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020AH\u0002J\b\u0010D\u001a\u00020\u0013H\u0002J\b\u0010E\u001a\u00020\u0013H\u0002J\u001e\u0010:\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00022\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u001eH\u0002J\u0010\u0010J\u001a\u00020\u00132\u0006\u0010I\u001a\u00020GH\u0002J\"\u0010M\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010L\u001a\u0004\u0018\u00010\u001fH\u0002J\u0018\u0010Q\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\t2\u0006\u0010P\u001a\u00020OH\u0002J\u0010\u0010R\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0002H\u0002J(\u0010V\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010S\u001a\u00020\u00022\u0006\u0010T\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0006H\u0002J\u0010\u0010W\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u0002H\u0002J(\u0010[\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010X\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u0006H\u0002J\u0010\u0010\\\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0010\u0010]\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0010\u0010^\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u001c\u0010`\u001a\u0004\u0018\u00010_2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010S\u001a\u00020\u0002H\u0002J\u0014\u0010a\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0002J\u000e\u0010d\u001a\u0004\u0018\u00010c*\u00020bH\u0002J-\u0010i\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u00022\u0006\u0010h\u001a\u00020gH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bi\u0010jJ;\u0010n\u001a\u00020\u00062\f\u0010m\u001a\b\u0012\u0004\u0012\u00020l0k2\u0006\u0010e\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u00022\u0006\u0010h\u001a\u00020gH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bn\u0010oJ \u0010q\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010p\u001a\u00020\tH\u0007J\u001f\u0010r\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0001¢\u0006\u0004\br\u0010sJ\u000e\u0010u\u001a\u00020\u00062\u0006\u0010$\u001a\u00020tJ\u001f\u0010w\u001a\u00020\u00022\u0006\u0010]\u001a\u00020v2\u0006\u0010\\\u001a\u00020vH\u0001¢\u0006\u0004\bw\u0010xJ\u0010\u0010|\u001a\u00020{2\u0006\u0010z\u001a\u00020yH\u0016J\u000f\u0010}\u001a\u00020\u0013H\u0000¢\u0006\u0004\b}\u0010~J\u0014\u0010\u007f\u001a\u00020\u0013H\u0086@ø\u0001\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001a\u0010\u0081\u0001\u001a\u00020\u00132\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J(\u0010\u0085\u0001\u001a\u00020\u00132\u0014\u0010\u0084\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020l0\u0083\u0001H\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001d\u0010\u008c\u0001\u001a\u00030\u0087\u00018\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R)\u0010\u0093\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R'\u0010\u009a\u0001\u001a\u00030\u0094\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u0012\u0005\b\u0099\u0001\u0010~\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R(\u0010 \u0001\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u009b\u0001\u0010!\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R'\u0010§\u0001\u001a\u00030¡\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b¢\u0001\u0010£\u0001\u0012\u0005\b¦\u0001\u0010~\u001a\u0006\b¤\u0001\u0010¥\u0001R'\u0010®\u0001\u001a\u00030¨\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b©\u0001\u0010ª\u0001\u0012\u0005\b\u00ad\u0001\u0010~\u001a\u0006\b«\u0001\u0010¬\u0001RD\u0010³\u0001\u001a-\u0012\u000f\u0012\r °\u0001*\u0005\u0018\u00010¯\u00010¯\u0001 °\u0001*\u0015\u0012\u000f\u0012\r °\u0001*\u0005\u0018\u00010¯\u00010¯\u0001\u0018\u00010\u001e0\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0018\u0010·\u0001\u001a\u00030´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0019\u0010º\u0001\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0019\u0010¼\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010\u008e\u0001R'\u0010À\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020)0½\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R,\u0010Á\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00020\u0083\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010¿\u0001R\u0018\u0010Â\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u008e\u0001R\u001a\u0010Ä\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bi\u0010Ã\u0001R\u001c\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020>0A8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bn\u0010Å\u0001R\u001d\u0010É\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130Ç\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010È\u0001R\u0017\u0010Ê\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010!R\u001b\u0010Í\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\br\u0010Ì\u0001R,\u0010m\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020l0\u0083\u00018B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0005\b\u0005\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u001e\u0010Ñ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010Å\u0001R6\u0010Õ\u0001\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020Ò\u0001j\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bu\u0010Ô\u0001R7\u0010×\u0001\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020Ò\u0001j\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010Ô\u0001R\u0017\u0010Ù\u0001\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\b\n\u0006\b\u0097\u0001\u0010Ø\u0001R\u0016\u0010Ú\u0001\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0007\n\u0005\b]\u0010Ø\u0001R;\u0010Þ\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020O0\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b\\\u0010Î\u0001\u0012\u0005\bÝ\u0001\u0010~\u001a\u0006\bÛ\u0001\u0010Ð\u0001\"\u0006\bÜ\u0001\u0010\u0086\u0001R\u0019\u0010à\u0001\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010ß\u0001R\u0018\u0010á\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010!R\u0017\u0010ä\u0001\u001a\u00030â\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\ba\u0010ã\u0001R\u001c\u0010å\u0001\u001a\b\u0012\u0004\u0012\u00020G0\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b`\u0010²\u0001R#\u0010è\u0001\u001a\u000f\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00130æ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010ç\u0001R\u0017\u0010ê\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010\u009d\u0001R\u001e\u0010ì\u0001\u001a\u00020\u00068@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bë\u0001\u0010~\u001a\u0006\b\u008e\u0001\u0010\u009d\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006ï\u0001"}, m28432d2 = {"Landroidx/compose/ui/platform/f;", "LM1;", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "s", "", "layoutIsRtl", "Ljava/util/Comparator;", "Lis5;", "Lkotlin/Comparator;", "V", "", "parentListToSort", "", "containerChildrenMapping", "l0", "listToSort", "n0", "", "k0", "node", "Lp2;", "info", "i0", "j0", "G", "U", "eventType", "contentChangeType", "", "", "contentDescription", "Z", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "event", "Y", "fromIndex", "toIndex", "itemCount", "", Entry.TYPE_TEXT, "t", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "q", "action", "Landroid/os/Bundle;", "arguments", "N", "extraDataKey", "l", "textNode", "LOs4;", "bounds", "Landroid/graphics/RectF;", "p0", "t0", "T", "size", "s0", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "LJm2;", "layoutNode", "K", "Lyo;", "subtreeChangedSemanticsNodesIds", "g0", "p", AbstractC26684u0.f100690q, "id", "LVp5;", "oldScrollObservationScopes", "scrollObservationScope", "d0", "semanticsNodeId", "title", "b0", "newNode", "Landroidx/compose/ui/platform/f$h;", "oldNode", "f0", "X", "granularity", "forward", "extendSelection", "r0", "c0", "start", "end", "traversalMode", "h0", "y", "x", "H", "LP1;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "B", "Lbs5;", "LDf;", "D", "vertical", "direction", "LCe3;", "position", "n", "(ZIJ)Z", "", "Lks5;", "currentSemanticsNodes", "o", "(Ljava/util/Collection;ZIJ)Z", "semanticsNode", "Q", "r", "(II)Landroid/view/accessibility/AccessibilityEvent;", "Landroid/view/MotionEvent;", "u", "", "F", "(FF)I", "Landroid/view/View;", "host", "Ls2;", "getAccessibilityNodeProvider", "M", "()V", "m", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "L", "(LJm2;)V", "", "newSemanticsNodes", "e0", "(Ljava/util/Map;)V", "Landroidx/compose/ui/platform/AndroidComposeView;", C17296a.f69688o, "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "view", "b", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "hoveredVirtualViewId", "Landroid/view/accessibility/AccessibilityManager;", "c", "Landroid/view/accessibility/AccessibilityManager;", "w", "()Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release$annotations", "accessibilityManager", DateTokenConverter.CONVERTER_KEY, "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityForceEnabledForTesting", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "e", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "A", "()Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release$annotations", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "f", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "E", "()Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release$annotations", "touchExplorationStateListener", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "g", "Ljava/util/List;", "enabledServices", "Landroid/os/Handler;", "h", "Landroid/os/Handler;", "handler", "i", "Ls2;", "nodeProvider", "j", "focusedVirtualViewId", "LLN5;", "k", "LLN5;", "actionIdToLabel", "labelToActionId", "accessibilityCursorPosition", "Ljava/lang/Integer;", "previousTraversedNode", "Lyo;", "subtreeChangedLayoutNodes", "LFh0;", "LFh0;", "boundsUpdateChannel", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/f$g;", "Landroidx/compose/ui/platform/f$g;", "pendingTextTraversedEvent", "Ljava/util/Map;", "z", "()Ljava/util/Map;", "paneDisplayed", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "idToBeforeMap", "v", "idToAfterMap", "Ljava/lang/String;", "EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL", "EXTRA_DATA_TEST_TRAVERSALAFTER_VAL", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "getPreviousSemanticsNodes$ui_release$annotations", "previousSemanticsNodes", "Landroidx/compose/ui/platform/f$h;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "scrollObservationScopes", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "sendScrollEventIfNeededLambda", "J", "isTouchExplorationEnabled", "isEnabled$ui_release$annotations", "isEnabled", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,3169:1\n1747#2,3:3170\n33#3,4:3173\n33#3,6:3177\n38#3:3183\n33#3,6:3184\n33#3,6:3190\n33#3,6:3196\n69#3,6:3202\n69#3,6:3208\n33#3,6:3215\n33#3,6:3223\n33#3,6:3229\n33#3,6:3235\n33#3,6:3241\n33#3,6:3247\n1#4:3214\n37#5,2:3221\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n451#1:3170,3\n616#1:3173,4\n619#1:3177,6\n616#1:3183\n662#1:3184,6\n752#1:3190,6\n1200#1:3196,6\n1211#1:3202,6\n1218#1:3208,6\n1748#1:3215,6\n2432#1:3223,6\n2436#1:3229,6\n2595#1:3235,6\n2613#1:3241,6\n656#1:3247,6\n1813#1:3221,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.f */
/* loaded from: classes.dex */
public final class C11381f extends C5148M1 {

    /* renamed from: E */
    public static final C11387e f53262E = new C11387e(null);

    /* renamed from: F */
    public static final int[] f53263F = {C46424oh4.accessibility_custom_action_0, C46424oh4.accessibility_custom_action_1, C46424oh4.accessibility_custom_action_2, C46424oh4.accessibility_custom_action_3, C46424oh4.accessibility_custom_action_4, C46424oh4.accessibility_custom_action_5, C46424oh4.accessibility_custom_action_6, C46424oh4.accessibility_custom_action_7, C46424oh4.accessibility_custom_action_8, C46424oh4.accessibility_custom_action_9, C46424oh4.accessibility_custom_action_10, C46424oh4.accessibility_custom_action_11, C46424oh4.accessibility_custom_action_12, C46424oh4.accessibility_custom_action_13, C46424oh4.accessibility_custom_action_14, C46424oh4.accessibility_custom_action_15, C46424oh4.accessibility_custom_action_16, C46424oh4.accessibility_custom_action_17, C46424oh4.accessibility_custom_action_18, C46424oh4.accessibility_custom_action_19, C46424oh4.accessibility_custom_action_20, C46424oh4.accessibility_custom_action_21, C46424oh4.accessibility_custom_action_22, C46424oh4.accessibility_custom_action_23, C46424oh4.accessibility_custom_action_24, C46424oh4.accessibility_custom_action_25, C46424oh4.accessibility_custom_action_26, C46424oh4.accessibility_custom_action_27, C46424oh4.accessibility_custom_action_28, C46424oh4.accessibility_custom_action_29, C46424oh4.accessibility_custom_action_30, C46424oh4.accessibility_custom_action_31};

    /* renamed from: A */
    public boolean f53264A;

    /* renamed from: B */
    public final Runnable f53265B;

    /* renamed from: C */
    public final List<C36667Vp5> f53266C;

    /* renamed from: D */
    public final Function1<C36667Vp5, Unit> f53267D;

    /* renamed from: a */
    public final AndroidComposeView f53268a;

    /* renamed from: b */
    public int f53269b;

    /* renamed from: c */
    public final AccessibilityManager f53270c;

    /* renamed from: d */
    public boolean f53271d;

    /* renamed from: e */
    public final AccessibilityManager.AccessibilityStateChangeListener f53272e;

    /* renamed from: f */
    public final AccessibilityManager.TouchExplorationStateChangeListener f53273f;

    /* renamed from: g */
    public List<AccessibilityServiceInfo> f53274g;

    /* renamed from: h */
    public final Handler f53275h;

    /* renamed from: i */
    public C28154s2 f53276i;

    /* renamed from: j */
    public int f53277j;

    /* renamed from: k */
    public LN5<LN5<CharSequence>> f53278k;

    /* renamed from: l */
    public LN5<Map<CharSequence, Integer>> f53279l;

    /* renamed from: m */
    public int f53280m;

    /* renamed from: n */
    public Integer f53281n;

    /* renamed from: o */
    public final C30704yo<C33829Jm2> f53282o;

    /* renamed from: p */
    public final InterfaceC32846Fh0<Unit> f53283p;

    /* renamed from: q */
    public boolean f53284q;

    /* renamed from: r */
    public C11389g f53285r;

    /* renamed from: s */
    public Map<Integer, C44163ks5> f53286s;

    /* renamed from: t */
    public C30704yo<Integer> f53287t;

    /* renamed from: u */
    public HashMap<Integer, Integer> f53288u;

    /* renamed from: v */
    public HashMap<Integer, Integer> f53289v;

    /* renamed from: w */
    public final String f53290w;

    /* renamed from: x */
    public final String f53291x;

    /* renamed from: y */
    public Map<Integer, C11390h> f53292y;

    /* renamed from: z */
    public C11390h f53293z;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LOs4;", "", "Lis5;", "it", "", C17296a.f69688o, "(Lkotlin/Pair;)Ljava/lang/Comparable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$A */
    /* loaded from: classes.dex */
    public static final class C11382A extends Lambda implements Function1<Pair<? extends C35055Os4, ? extends List<C42977is5>>, Comparable<?>> {

        /* renamed from: g */
        public static final C11382A f53294g = new C11382A();

        public C11382A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(Pair<C35055Os4, ? extends List<C42977is5>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.getFirst().m91262e());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"androidx/compose/ui/platform/f$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$a */
    /* loaded from: classes.dex */
    public static final class View$OnAttachStateChangeListenerC11383a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC11383a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            C11381f.this.m68393w().addAccessibilityStateChangeListener(C11381f.this.m68462A());
            C11381f.this.m68393w().addTouchExplorationStateChangeListener(C11381f.this.m68458E());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            C11381f.this.f53275h.removeCallbacks(C11381f.this.f53265B);
            C11381f.this.m68393w().removeAccessibilityStateChangeListener(C11381f.this.m68462A());
            C11381f.this.m68393w().removeTouchExplorationStateChangeListener(C11381f.this.m68458E());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m28432d2 = {"Landroidx/compose/ui/platform/f$b;", "", "Lp2;", "info", "Lis5;", "semanticsNode", "", C17296a.f69688o, "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$b */
    /* loaded from: classes.dex */
    public static final class C11384b {

        /* renamed from: a */
        public static final C11384b f53296a = new C11384b();

        private C11384b() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final void m68388a(C27125p2 info, C42977is5 semanticsNode) {
            C4297K1 c4297k1;
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (C11409g.m68356b(semanticsNode) && (c4297k1 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), C38216as5.f56452a.m65353r())) != null) {
                info.m20089b(new C27125p2.C27126a(16908349, c4297k1.m99356b()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, m28432d2 = {"Landroidx/compose/ui/platform/f$c;", "", "Landroid/view/accessibility/AccessibilityEvent;", "event", "", "deltaX", "deltaY", "", C17296a.f69688o, "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$c */
    /* loaded from: classes.dex */
    public static final class C11385c {

        /* renamed from: a */
        public static final C11385c f53297a = new C11385c();

        private C11385c() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final void m68387a(AccessibilityEvent event, int i, int i2) {
            Intrinsics.checkNotNullParameter(event, "event");
            event.setScrollDeltaX(i);
            event.setScrollDeltaY(i2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m28432d2 = {"Landroidx/compose/ui/platform/f$d;", "", "Lp2;", "info", "Lis5;", "semanticsNode", "", C17296a.f69688o, "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$d */
    /* loaded from: classes.dex */
    public static final class C11386d {

        /* renamed from: a */
        public static final C11386d f53298a = new C11386d();

        private C11386d() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final void m68386a(C27125p2 info, C42977is5 semanticsNode) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (C11409g.m68356b(semanticsNode)) {
                C38809bs5 m31721t = semanticsNode.m31721t();
                C38216as5 c38216as5 = C38216as5.f56452a;
                C4297K1 c4297k1 = (C4297K1) C39420cs5.m44940a(m31721t, c38216as5.m65358m());
                if (c4297k1 != null) {
                    info.m20089b(new C27125p2.C27126a(16908358, c4297k1.m99356b()));
                }
                C4297K1 c4297k12 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65361j());
                if (c4297k12 != null) {
                    info.m20089b(new C27125p2.C27126a(16908359, c4297k12.m99356b()));
                }
                C4297K1 c4297k13 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65360k());
                if (c4297k13 != null) {
                    info.m20089b(new C27125p2.C27126a(16908360, c4297k13.m99356b()));
                }
                C4297K1 c4297k14 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65359l());
                if (c4297k14 != null) {
                    info.m20089b(new C27125p2.C27126a(16908361, c4297k14.m99356b()));
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Landroidx/compose/ui/platform/f$e;", "", "", "AccessibilityActionsResourceIds", "[I", "", "AccessibilityCursorPositionUndefined", "I", "AccessibilitySliderStepsCount", "", "ClassName", "Ljava/lang/String;", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "", "SendRecurringAccessibilityEventsIntervalMillis", "J", "TextClassName", "TextFieldClassName", "TextTraversedEventTimeoutMillis", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$e */
    /* loaded from: classes.dex */
    public static final class C11387e {
        public /* synthetic */ C11387e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C11387e() {
        }
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, m28432d2 = {"Landroidx/compose/ui/platform/f$f;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "createAccessibilityNodeInfo", "action", "Landroid/os/Bundle;", "arguments", "", "performAction", "info", "", "extraDataKey", "", "addExtraDataToAccessibilityNodeInfo", "<init>", "(Landroidx/compose/ui/platform/f;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$f */
    /* loaded from: classes.dex */
    public final class C11388f extends AccessibilityNodeProvider {
        public C11388f() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo info, String extraDataKey, Bundle bundle) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(extraDataKey, "extraDataKey");
            C11381f.this.m68414l(i, info, extraDataKey, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return C11381f.this.m68400s(i);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return C11381f.this.m68449N(i, i2, bundle);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Landroidx/compose/ui/platform/f$g;", "", "Lis5;", C17296a.f69688o, "Lis5;", DateTokenConverter.CONVERTER_KEY, "()Lis5;", "node", "", "b", "I", "()I", "action", "c", "granularity", "fromIndex", "e", "toIndex", "", "f", "J", "()J", "traverseTime", "<init>", "(Lis5;IIIIJ)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$g */
    /* loaded from: classes.dex */
    public static final class C11389g {

        /* renamed from: a */
        public final C42977is5 f53300a;

        /* renamed from: b */
        public final int f53301b;

        /* renamed from: c */
        public final int f53302c;

        /* renamed from: d */
        public final int f53303d;

        /* renamed from: e */
        public final int f53304e;

        /* renamed from: f */
        public final long f53305f;

        public C11389g(C42977is5 node, int i, int i2, int i3, int i4, long j) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f53300a = node;
            this.f53301b = i;
            this.f53302c = i2;
            this.f53303d = i3;
            this.f53304e = i4;
            this.f53305f = j;
        }

        /* renamed from: a */
        public final int m68385a() {
            return this.f53301b;
        }

        /* renamed from: b */
        public final int m68384b() {
            return this.f53303d;
        }

        /* renamed from: c */
        public final int m68383c() {
            return this.f53302c;
        }

        /* renamed from: d */
        public final C42977is5 m68382d() {
            return this.f53300a;
        }

        /* renamed from: e */
        public final int m68381e() {
            return this.f53304e;
        }

        /* renamed from: f */
        public final long m68380f() {
            return this.f53305f;
        }
    }

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0019"}, m28432d2 = {"Landroidx/compose/ui/platform/f$h;", "", "", DateTokenConverter.CONVERTER_KEY, "Lis5;", C17296a.f69688o, "Lis5;", "b", "()Lis5;", "semanticsNode", "Lbs5;", "Lbs5;", "c", "()Lbs5;", "unmergedConfig", "", "", "Ljava/util/Set;", "()Ljava/util/Set;", "children", "", "Lks5;", "currentSemanticsNodes", "<init>", "(Lis5;Ljava/util/Map;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,3169:1\n33#2,6:3170\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n*L\n380#1:3170,6\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.f$h */
    /* loaded from: classes.dex */
    public static final class C11390h {

        /* renamed from: a */
        public final C42977is5 f53306a;

        /* renamed from: b */
        public final C38809bs5 f53307b;

        /* renamed from: c */
        public final Set<Integer> f53308c;

        public C11390h(C42977is5 semanticsNode, Map<Integer, C44163ks5> currentSemanticsNodes) {
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
            this.f53306a = semanticsNode;
            this.f53307b = semanticsNode.m31721t();
            this.f53308c = new LinkedHashSet();
            List<C42977is5> m31724q = semanticsNode.m31724q();
            int size = m31724q.size();
            for (int i = 0; i < size; i++) {
                C42977is5 c42977is5 = m31724q.get(i);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(c42977is5.m31730k()))) {
                    this.f53308c.add(Integer.valueOf(c42977is5.m31730k()));
                }
            }
        }

        /* renamed from: a */
        public final Set<Integer> m68379a() {
            return this.f53308c;
        }

        /* renamed from: b */
        public final C42977is5 m68378b() {
            return this.f53306a;
        }

        /* renamed from: c */
        public final C38809bs5 m68377c() {
            return this.f53307b;
        }

        /* renamed from: d */
        public final boolean m68376d() {
            return this.f53307b.m62260c(C45349ms5.f98933a.m24803q());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.platform.f$i */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11391i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC45479n56.values().length];
            try {
                iArr[EnumC45479n56.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC45479n56.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC45479n56.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", m28418f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", m28417i = {0, 0, 1, 1}, m28416l = {2024, 2054}, m28415m = "boundsUpdatesEventLoop", m28414n = {"this", "subtreeChangedSemanticsNodesIds", "this", "subtreeChangedSemanticsNodesIds"}, m28413s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.compose.ui.platform.f$j */
    /* loaded from: classes.dex */
    public static final class C11392j extends ContinuationImpl {

        /* renamed from: h */
        public Object f53309h;

        /* renamed from: i */
        public Object f53310i;

        /* renamed from: j */
        public Object f53311j;

        /* renamed from: k */
        public /* synthetic */ Object f53312k;

        /* renamed from: m */
        public int f53314m;

        public C11392j(Continuation<? super C11392j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53312k = obj;
            this.f53314m |= Integer.MIN_VALUE;
            return C11381f.this.m68412m(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "it", "", C17296a.f69688o, "(LJm2;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$k */
    /* loaded from: classes.dex */
    public static final class C11393k extends Lambda implements Function1<C33829Jm2, Boolean> {

        /* renamed from: g */
        public static final C11393k f53315g = new C11393k();

        public C11393k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C33829Jm2 it) {
            C38809bs5 m35683a;
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC41791gs5 m29803i = C43570js5.m29803i(it);
            boolean z = false;
            if (m29803i != null && (m35683a = C42384hs5.m35683a(m29803i)) != null && m35683a.m62254s()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"<anonymous>", "", "T", "K", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n1#1,328:1\n542#2:329\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.f$l */
    /* loaded from: classes.dex */
    public static final class C11394l<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ Comparator f53316b;

        /* renamed from: c */
        public final /* synthetic */ Comparator f53317c;

        public C11394l(Comparator comparator, Comparator comparator2) {
            this.f53316b = comparator;
            this.f53317c = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f53316b.compare(t, t2);
            if (compare == 0) {
                return this.f53317c.compare(((C42977is5) t).m31728m(), ((C42977is5) t2).m31728m());
            }
            return compare;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n1#1,328:1\n544#2:329\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.f$m */
    /* loaded from: classes.dex */
    public static final class C11395m<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ Comparator f53318b;

        public C11395m(Comparator comparator) {
            this.f53318b = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            int compare = this.f53318b.compare(t, t2);
            if (compare == 0) {
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((C42977is5) t).m31730k()), Integer.valueOf(((C42977is5) t2).m31730k()));
                return compareValues;
            }
            return compare;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lis5;", "it", "", C17296a.f69688o, "(Lis5;)Ljava/lang/Comparable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$n */
    /* loaded from: classes.dex */
    public static final class C11396n extends Lambda implements Function1<C42977is5, Comparable<?>> {

        /* renamed from: g */
        public static final C11396n f53319g = new C11396n();

        public C11396n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(C42977is5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.m31734g().m91257j());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lis5;", "it", "", C17296a.f69688o, "(Lis5;)Ljava/lang/Comparable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$o */
    /* loaded from: classes.dex */
    public static final class C11397o extends Lambda implements Function1<C42977is5, Comparable<?>> {

        /* renamed from: g */
        public static final C11397o f53320g = new C11397o();

        public C11397o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(C42977is5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.m31734g().m91255l());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lis5;", "it", "", C17296a.f69688o, "(Lis5;)Ljava/lang/Comparable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$p */
    /* loaded from: classes.dex */
    public static final class C11398p extends Lambda implements Function1<C42977is5, Comparable<?>> {

        /* renamed from: g */
        public static final C11398p f53321g = new C11398p();

        public C11398p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(C42977is5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.m31734g().m91262e());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lis5;", "it", "", C17296a.f69688o, "(Lis5;)Ljava/lang/Comparable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$q */
    /* loaded from: classes.dex */
    public static final class C11399q extends Lambda implements Function1<C42977is5, Comparable<?>> {

        /* renamed from: g */
        public static final C11399q f53322g = new C11399q();

        public C11399q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(C42977is5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.m31734g().m91258i());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lis5;", "it", "", C17296a.f69688o, "(Lis5;)Ljava/lang/Comparable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$r */
    /* loaded from: classes.dex */
    public static final class C11400r extends Lambda implements Function1<C42977is5, Comparable<?>> {

        /* renamed from: g */
        public static final C11400r f53323g = new C11400r();

        public C11400r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(C42977is5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.m31734g().m91258i());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lis5;", "it", "", C17296a.f69688o, "(Lis5;)Ljava/lang/Comparable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$s */
    /* loaded from: classes.dex */
    public static final class C11401s extends Lambda implements Function1<C42977is5, Comparable<?>> {

        /* renamed from: g */
        public static final C11401s f53324g = new C11401s();

        public C11401s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(C42977is5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.m31734g().m91255l());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lis5;", "it", "", C17296a.f69688o, "(Lis5;)Ljava/lang/Comparable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$t */
    /* loaded from: classes.dex */
    public static final class C11402t extends Lambda implements Function1<C42977is5, Comparable<?>> {

        /* renamed from: g */
        public static final C11402t f53325g = new C11402t();

        public C11402t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(C42977is5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.m31734g().m91262e());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lis5;", "it", "", C17296a.f69688o, "(Lis5;)Ljava/lang/Comparable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$u */
    /* loaded from: classes.dex */
    public static final class C11403u extends Lambda implements Function1<C42977is5, Comparable<?>> {

        /* renamed from: g */
        public static final C11403u f53326g = new C11403u();

        public C11403u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(C42977is5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.m31734g().m91257j());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.platform.f$v */
    /* loaded from: classes.dex */
    public static final class C11404v extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ C36667Vp5 f53327g;

        /* renamed from: h */
        public final /* synthetic */ C11381f f53328h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11404v(C36667Vp5 c36667Vp5, C11381f c11381f) {
            super(0);
            this.f53327g = c36667Vp5;
            this.f53328h = c11381f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
            if ((r2 == 0.0f) == false) goto L23;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2() {
            C35497Qp5 m79392a = this.f53327g.m79392a();
            C35497Qp5 m79388e = this.f53327g.m79388e();
            Float m79391b = this.f53327g.m79391b();
            Float m79390c = this.f53327g.m79390c();
            float floatValue = (m79392a == null || m79391b == null) ? 0.0f : m79392a.m87896c().invoke().floatValue() - m79391b.floatValue();
            float floatValue2 = (m79388e == null || m79390c == null) ? 0.0f : m79388e.m87896c().invoke().floatValue() - m79390c.floatValue();
            if (floatValue == 0.0f) {
            }
            int m68439X = this.f53328h.m68439X(this.f53327g.m79389d());
            C11381f.m68435a0(this.f53328h, m68439X, 2048, 1, null, 8, null);
            AccessibilityEvent m68402r = this.f53328h.m68402r(m68439X, 4096);
            if (m79392a != null) {
                m68402r.setScrollX((int) m79392a.m87896c().invoke().floatValue());
                m68402r.setMaxScrollX((int) m79392a.m87898a().invoke().floatValue());
            }
            if (m79388e != null) {
                m68402r.setScrollY((int) m79388e.m87896c().invoke().floatValue());
                m68402r.setMaxScrollY((int) m79388e.m87898a().invoke().floatValue());
            }
            if (Build.VERSION.SDK_INT >= 28) {
                C11385c.m68387a(m68402r, (int) floatValue, (int) floatValue2);
            }
            this.f53328h.m68438Y(m68402r);
            if (m79392a != null) {
                this.f53327g.m79386g(m79392a.m87896c().invoke());
            }
            if (m79388e != null) {
                this.f53327g.m79385h(m79388e.m87896c().invoke());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LVp5;", "it", "", C17296a.f69688o, "(LVp5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$w */
    /* loaded from: classes.dex */
    public static final class C11405w extends Lambda implements Function1<C36667Vp5, Unit> {
        public C11405w() {
            super(1);
        }

        /* renamed from: a */
        public final void m68366a(C36667Vp5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C11381f.this.m68429d0(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36667Vp5 c36667Vp5) {
            m68366a(c36667Vp5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "it", "", C17296a.f69688o, "(LJm2;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$x */
    /* loaded from: classes.dex */
    public static final class C11406x extends Lambda implements Function1<C33829Jm2, Boolean> {

        /* renamed from: g */
        public static final C11406x f53330g = new C11406x();

        public C11406x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C33829Jm2 it) {
            C38809bs5 m35683a;
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC41791gs5 m29803i = C43570js5.m29803i(it);
            boolean z = false;
            if (m29803i != null && (m35683a = C42384hs5.m35683a(m29803i)) != null && m35683a.m62254s()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "it", "", C17296a.f69688o, "(LJm2;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$y */
    /* loaded from: classes.dex */
    public static final class C11407y extends Lambda implements Function1<C33829Jm2, Boolean> {

        /* renamed from: g */
        public static final C11407y f53331g = new C11407y();

        public C11407y() {
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

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LOs4;", "", "Lis5;", "it", "", C17296a.f69688o, "(Lkotlin/Pair;)Ljava/lang/Comparable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f$z */
    /* loaded from: classes.dex */
    public static final class C11408z extends Lambda implements Function1<Pair<? extends C35055Os4, ? extends List<C42977is5>>, Comparable<?>> {

        /* renamed from: g */
        public static final C11408z f53332g = new C11408z();

        public C11408z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(Pair<C35055Os4, ? extends List<C42977is5>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.getFirst().m91255l());
        }
    }

    public C11381f(AndroidComposeView view) {
        Map<Integer, C44163ks5> emptyMap;
        Map emptyMap2;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f53268a = view;
        this.f53269b = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f53270c = accessibilityManager;
        this.f53272e = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: mc
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                C11381f.m68394v(C11381f.this, z);
            }
        };
        this.f53273f = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: nc
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                C11381f.m68403q0(C11381f.this, z);
            }
        };
        this.f53274g = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f53275h = new Handler(Looper.getMainLooper());
        this.f53276i = new C28154s2(new C11388f());
        this.f53277j = Integer.MIN_VALUE;
        this.f53278k = new LN5<>();
        this.f53279l = new LN5<>();
        this.f53280m = -1;
        this.f53282o = new C30704yo<>();
        this.f53283p = C35186Ph0.m89918b(-1, null, null, 6, null);
        this.f53284q = true;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f53286s = emptyMap;
        this.f53287t = new C30704yo<>();
        this.f53288u = new HashMap<>();
        this.f53289v = new HashMap<>();
        this.f53290w = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f53291x = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f53292y = new LinkedHashMap();
        C42977is5 m26718a = view.m68612A0().m26718a();
        emptyMap2 = MapsKt__MapsKt.emptyMap();
        this.f53293z = new C11390h(m26718a, emptyMap2);
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC11383a());
        this.f53265B = new Runnable() { // from class: oc
            @Override // java.lang.Runnable
            public final void run() {
                C11381f.m68440W(C11381f.this);
            }
        };
        this.f53266C = new ArrayList();
        this.f53267D = new C11405w();
    }

    /* renamed from: O */
    public static final boolean m68448O(C35497Qp5 c35497Qp5, float f) {
        return (f < 0.0f && c35497Qp5.m87896c().invoke().floatValue() > 0.0f) || (f > 0.0f && c35497Qp5.m87896c().invoke().floatValue() < c35497Qp5.m87898a().invoke().floatValue());
    }

    /* renamed from: P */
    public static final float m68447P(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* renamed from: R */
    public static final boolean m68445R(C35497Qp5 c35497Qp5) {
        return (c35497Qp5.m87896c().invoke().floatValue() > 0.0f && !c35497Qp5.m87897b()) || (c35497Qp5.m87896c().invoke().floatValue() < c35497Qp5.m87898a().invoke().floatValue() && c35497Qp5.m87897b());
    }

    /* renamed from: S */
    public static final boolean m68444S(C35497Qp5 c35497Qp5) {
        return (c35497Qp5.m87896c().invoke().floatValue() < c35497Qp5.m87898a().invoke().floatValue() && !c35497Qp5.m87897b()) || (c35497Qp5.m87896c().invoke().floatValue() > 0.0f && c35497Qp5.m87897b());
    }

    /* renamed from: W */
    public static final void m68440W(C11381f this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC43181jD3.m30991j(this$0.f53268a, false, 1, null);
        this$0.m68406p();
        this$0.f53264A = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a0 */
    public static /* synthetic */ boolean m68435a0(C11381f c11381f, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return c11381f.m68437Z(i, i2, num, list);
    }

    /* renamed from: m0 */
    public static final boolean m68411m0(List<Pair<C35055Os4, List<C42977is5>>> list, C42977is5 c42977is5) {
        int lastIndex;
        float m91255l = c42977is5.m31734g().m91255l();
        float m91262e = c42977is5.m31734g().m91262e();
        InterfaceC35423Qh3<Float> m68358E = C11409g.m68358E(m91255l, m91262e);
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                C35055Os4 first = list.get(i).getFirst();
                if (C11409g.m68347k(C11409g.m68358E(first.m91255l(), first.m91262e()), m68358E)) {
                    list.set(i, new Pair<>(first.m91251p(new C35055Os4(0.0f, m91255l, Float.POSITIVE_INFINITY, m91262e)), list.get(i).getSecond()));
                    list.get(i).getSecond().add(c42977is5);
                    return true;
                } else if (i == lastIndex) {
                    break;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /* renamed from: o0 */
    public static final void m68407o0(List<C42977is5> list, Map<Integer, List<C42977is5>> map, C11381f c11381f, boolean z, C42977is5 c42977is5) {
        List<C42977is5> mutableList;
        list.add(c42977is5);
        if (C11409g.m68353e(c42977is5)) {
            Integer valueOf = Integer.valueOf(c42977is5.m31730k());
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) c42977is5.m31733h());
            map.put(valueOf, c11381f.m68409n0(z, mutableList));
            return;
        }
        List<C42977is5> m31733h = c42977is5.m31733h();
        int size = m31733h.size();
        for (int i = 0; i < size; i++) {
            m68407o0(list, map, c11381f, z, m31733h.get(i));
        }
    }

    /* renamed from: q0 */
    public static final void m68403q0(C11381f this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f53274g = this$0.f53270c.getEnabledAccessibilityServiceList(-1);
    }

    /* renamed from: v */
    public static final void m68394v(C11381f this$0, boolean z) {
        List<AccessibilityServiceInfo> emptyList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            emptyList = this$0.f53270c.getEnabledAccessibilityServiceList(-1);
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        this$0.f53274g = emptyList;
    }

    /* renamed from: A */
    public final AccessibilityManager.AccessibilityStateChangeListener m68462A() {
        return this.f53272e;
    }

    /* renamed from: B */
    public final String m68461B(C42977is5 c42977is5) {
        Object firstOrNull;
        if (c42977is5 == null) {
            return null;
        }
        C38809bs5 m31721t = c42977is5.m31721t();
        C45349ms5 c45349ms5 = C45349ms5.f98933a;
        if (m31721t.m62260c(c45349ms5.m24817c())) {
            return C43057j06.m31267d((List) c42977is5.m31721t().m62258f(c45349ms5.m24817c()), ",", null, null, 0, null, null, 62, null);
        }
        if (C11409g.m68349i(c42977is5)) {
            C1577Df m68459D = m68459D(c42977is5.m31721t());
            if (m68459D == null) {
                return null;
            }
            return m68459D.m110052j();
        }
        List list = (List) C39420cs5.m44940a(c42977is5.m31721t(), c45349ms5.m24795y());
        if (list == null) {
            return null;
        }
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
        C1577Df c1577Df = (C1577Df) firstOrNull;
        if (c1577Df == null) {
            return null;
        }
        return c1577Df.m110052j();
    }

    /* renamed from: C */
    public final InterfaceC6230P1 m68460C(C42977is5 c42977is5, int i) {
        boolean z;
        Boolean bool;
        if (c42977is5 == null) {
            return null;
        }
        String m68461B = m68461B(c42977is5);
        if (m68461B != null && m68461B.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            return null;
                        }
                    } else {
                        C11377d m68473a = C11377d.f53256c.m68473a();
                        m68473a.mo68470e(m68461B);
                        return m68473a;
                    }
                }
                C38809bs5 m31721t = c42977is5.m31721t();
                C38216as5 c38216as5 = C38216as5.f56452a;
                if (!m31721t.m62260c(c38216as5.m65364g())) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Function1 function1 = (Function1) ((C4297K1) c42977is5.m31721t().m62258f(c38216as5.m65364g())).m99357a();
                if (function1 != null) {
                    bool = (Boolean) function1.invoke(arrayList);
                } else {
                    bool = null;
                }
                if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    return null;
                }
                C42484i26 c42484i26 = (C42484i26) arrayList.get(0);
                if (i == 4) {
                    C11373b m68483a = C11373b.f53242d.m68483a();
                    m68483a.m68484j(m68461B, c42484i26);
                    return m68483a;
                }
                C11375c m68478a = C11375c.f53248f.m68478a();
                m68478a.m68479j(m68461B, c42484i26, c42977is5);
                return m68478a;
            }
            C11379e.C11380a c11380a = C11379e.f53258d;
            Locale locale = this.f53268a.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale, "view.context.resources.configuration.locale");
            C11379e m68463a = c11380a.m68463a(locale);
            m68463a.mo68470e(m68461B);
            return m68463a;
        }
        C11371a.C11372a c11372a = C11371a.f53238d;
        Locale locale2 = this.f53268a.getContext().getResources().getConfiguration().locale;
        Intrinsics.checkNotNullExpressionValue(locale2, "view.context.resources.configuration.locale");
        C11371a m68488a = c11372a.m68488a(locale2);
        m68488a.mo68470e(m68461B);
        return m68488a;
    }

    /* renamed from: D */
    public final C1577Df m68459D(C38809bs5 c38809bs5) {
        return (C1577Df) C39420cs5.m44940a(c38809bs5, C45349ms5.f98933a.m24815e());
    }

    /* renamed from: E */
    public final AccessibilityManager.TouchExplorationStateChangeListener m68458E() {
        return this.f53273f;
    }

    /* renamed from: F */
    public final int m68457F(float f, float f2) {
        Object lastOrNull;
        C33829Jm2 m6661h;
        InterfaceC41791gs5 interfaceC41791gs5 = null;
        InterfaceC43181jD3.m30991j(this.f53268a, false, 1, null);
        RM1 rm1 = new RM1();
        this.f53268a.m68548z0().m99727z0(C33056Ge3.m104938a(f, f2), rm1, (r13 & 4) != 0, (r13 & 8) != 0);
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) rm1);
        InterfaceC41791gs5 interfaceC41791gs52 = (InterfaceC41791gs5) lastOrNull;
        if (interfaceC41791gs52 != null && (m6661h = C51083wZ0.m6661h(interfaceC41791gs52)) != null) {
            interfaceC41791gs5 = C43570js5.m29803i(m6661h);
        }
        if (interfaceC41791gs5 != null && C11409g.m68348j(new C42977is5(interfaceC41791gs5, false, null, 4, null))) {
            C33829Jm2 m6661h2 = C51083wZ0.m6661h(interfaceC41791gs5);
            if (this.f53268a.m68553u0().m68532c().get(m6661h2) == null) {
                return m68439X(m6661h2.m99750r0());
            }
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: G */
    public final boolean m68456G(int i) {
        return this.f53277j == i;
    }

    /* renamed from: H */
    public final boolean m68455H(C42977is5 c42977is5) {
        C38809bs5 m31721t = c42977is5.m31721t();
        C45349ms5 c45349ms5 = C45349ms5.f98933a;
        if (!m31721t.m62260c(c45349ms5.m24817c()) && c42977is5.m31721t().m62260c(c45349ms5.m24815e())) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final boolean m68454I() {
        if (this.f53271d) {
            return true;
        }
        if (this.f53270c.isEnabled()) {
            List<AccessibilityServiceInfo> enabledServices = this.f53274g;
            Intrinsics.checkNotNullExpressionValue(enabledServices, "enabledServices");
            if (!enabledServices.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m68453J() {
        if (!this.f53271d && (!this.f53270c.isEnabled() || !this.f53270c.isTouchExplorationEnabled())) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public final void m68452K(C33829Jm2 c33829Jm2) {
        if (this.f53282o.add(c33829Jm2)) {
            this.f53283p.mo2349h(Unit.INSTANCE);
        }
    }

    /* renamed from: L */
    public final void m68451L(C33829Jm2 layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f53284q = true;
        if (!m68454I()) {
            return;
        }
        m68452K(layoutNode);
    }

    /* renamed from: M */
    public final void m68450M() {
        this.f53284q = true;
        if (m68454I() && !this.f53264A) {
            this.f53264A = true;
            this.f53275h.post(this.f53265B);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0180 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019f  */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x017d -> B:84:0x017e). Please submit an issue!!! */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m68449N(int i, int i2, Bundle bundle) {
        C42977is5 m28250b;
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        float coerceAtLeast;
        float coerceAtMost;
        float f;
        int i3;
        Function2 function2;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function1 function1;
        C4297K1 c4297k1;
        Function2 function22;
        C38809bs5 m31731j;
        C38809bs5 m31731j2;
        C4297K1 c4297k12;
        Function1 function12;
        Function0 function010;
        Function0 function011;
        Function0 function012;
        Function0 function013;
        CharSequence m96983k;
        List list;
        C44163ks5 c44163ks5 = m68390z().get(Integer.valueOf(i));
        if (c44163ks5 == null || (m28250b = c44163ks5.m28250b()) == null) {
            return false;
        }
        if (i2 != 64) {
            if (i2 != 128) {
                boolean z = true;
                if (i2 == 256 || i2 == 512) {
                    if (bundle != null) {
                        return m68401r0(m28250b, bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"), i2 == 256, bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"));
                    }
                    return false;
                } else if (i2 == 16384) {
                    C4297K1 c4297k13 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65369b());
                    if (c4297k13 == null || (function0 = (Function0) c4297k13.m99357a()) == null) {
                        return false;
                    }
                    return ((Boolean) function0.invoke()).booleanValue();
                } else if (i2 != 131072) {
                    if (C11409g.m68356b(m28250b)) {
                        if (i2 == 1) {
                            C4297K1 c4297k14 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65356o());
                            if (c4297k14 == null || (function02 = (Function0) c4297k14.m99357a()) == null) {
                                return false;
                            }
                            return ((Boolean) function02.invoke()).booleanValue();
                        }
                        Boolean bool = null;
                        bool = null;
                        if (i2 != 2) {
                            switch (i2) {
                                case 16:
                                    C4297K1 c4297k15 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65363h());
                                    if (c4297k15 != null && (function03 = (Function0) c4297k15.m99357a()) != null) {
                                        bool = (Boolean) function03.invoke();
                                    }
                                    m68435a0(this, i, 1, null, null, 12, null);
                                    if (bool != null) {
                                        return bool.booleanValue();
                                    }
                                    return false;
                                case 32:
                                    C4297K1 c4297k16 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65362i());
                                    if (c4297k16 == null || (function04 = (Function0) c4297k16.m99357a()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function04.invoke()).booleanValue();
                                case 4096:
                                case 8192:
                                    break;
                                case DateUtils.FORMAT_ABBREV_WEEKDAY /* 32768 */:
                                    C4297K1 c4297k17 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65357n());
                                    if (c4297k17 == null || (function05 = (Function0) c4297k17.m99357a()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function05.invoke()).booleanValue();
                                case 65536:
                                    C4297K1 c4297k18 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65367d());
                                    if (c4297k18 == null || (function06 = (Function0) c4297k18.m99357a()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function06.invoke()).booleanValue();
                                case DateUtils.FORMAT_ABBREV_RELATIVE /* 262144 */:
                                    C4297K1 c4297k19 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65365f());
                                    if (c4297k19 == null || (function07 = (Function0) c4297k19.m99357a()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function07.invoke()).booleanValue();
                                case 524288:
                                    C4297K1 c4297k110 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65370a());
                                    if (c4297k110 == null || (function08 = (Function0) c4297k110.m99357a()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function08.invoke()).booleanValue();
                                case 1048576:
                                    C4297K1 c4297k111 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65366e());
                                    if (c4297k111 == null || (function09 = (Function0) c4297k111.m99357a()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function09.invoke()).booleanValue();
                                case 2097152:
                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                    C4297K1 c4297k112 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65351t());
                                    if (c4297k112 == null || (function1 = (Function1) c4297k112.m99357a()) == null) {
                                        return false;
                                    }
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) function1.invoke(new C1577Df(string, null, null, 6, null))).booleanValue();
                                case 16908342:
                                    C42977is5 m31726o = m28250b.m31726o();
                                    if (m31726o != null && (m31731j2 = m31726o.m31731j()) != null) {
                                        c4297k1 = (C4297K1) C39420cs5.m44940a(m31731j2, C38216as5.f56452a.m65355p());
                                        while (m31726o != null && c4297k1 == null) {
                                            m31726o = m31726o.m31726o();
                                            if (m31726o != null && (m31731j = m31726o.m31731j()) != null) {
                                                c4297k1 = (C4297K1) C39420cs5.m44940a(m31731j, C38216as5.f56452a.m65355p());
                                            }
                                        }
                                        if (m31726o != null) {
                                            return false;
                                        }
                                        C35055Os4 m20520a = C46472om2.m20520a(m31726o.m31729l().mo8157h());
                                        InterfaceC45879nm2 mo23182t = m31726o.m31729l().mo8157h().mo23182t();
                                        C35055Os4 m91248s = m20520a.m91248s(mo23182t != null ? C46472om2.m20516e(mo23182t) : C32120Ce3.f4427b.m111932c());
                                        C35055Os4 m84692b = C35991Ss4.m84692b(m28250b.m31725p(), H52.m104428c(m28250b.m31723r()));
                                        C38809bs5 m31721t = m31726o.m31721t();
                                        C45349ms5 c45349ms5 = C45349ms5.f98933a;
                                        C35497Qp5 c35497Qp5 = (C35497Qp5) C39420cs5.m44940a(m31721t, c45349ms5.m24811i());
                                        C35497Qp5 c35497Qp52 = (C35497Qp5) C39420cs5.m44940a(m31726o.m31721t(), c45349ms5.m24820B());
                                        float m68447P = m68447P(m84692b.m91258i() - m91248s.m91258i(), m84692b.m91257j() - m91248s.m91257j());
                                        if ((c35497Qp5 != null && c35497Qp5.m87897b()) != false) {
                                            m68447P = -m68447P;
                                        }
                                        if (C11409g.m68350h(m28250b)) {
                                            m68447P = -m68447P;
                                        }
                                        float m68447P2 = m68447P(m84692b.m91255l() - m91248s.m91255l(), m84692b.m91262e() - m91248s.m91262e());
                                        if ((c35497Qp52 == null || !c35497Qp52.m87897b()) ? false : false) {
                                            m68447P2 = -m68447P2;
                                        }
                                        if (c4297k1 == null || (function22 = (Function2) c4297k1.m99357a()) == null) {
                                            return false;
                                        }
                                        return ((Boolean) function22.invoke(Float.valueOf(m68447P), Float.valueOf(m68447P2))).booleanValue();
                                    }
                                    c4297k1 = null;
                                    while (m31726o != null) {
                                        m31726o = m31726o.m31726o();
                                        if (m31726o != null) {
                                            c4297k1 = (C4297K1) C39420cs5.m44940a(m31731j, C38216as5.f56452a.m65355p());
                                        }
                                        c4297k1 = null;
                                        while (m31726o != null) {
                                        }
                                    }
                                    if (m31726o != null) {
                                    }
                                    break;
                                case 16908349:
                                    if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || (c4297k12 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65353r())) == null || (function12 = (Function1) c4297k12.m99357a()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function12.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                default:
                                    switch (i2) {
                                        case 16908344:
                                        case 16908345:
                                        case 16908346:
                                        case 16908347:
                                            break;
                                        default:
                                            switch (i2) {
                                                case 16908358:
                                                    C4297K1 c4297k113 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65358m());
                                                    if (c4297k113 == null || (function010 = (Function0) c4297k113.m99357a()) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function010.invoke()).booleanValue();
                                                case 16908359:
                                                    C4297K1 c4297k114 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65361j());
                                                    if (c4297k114 == null || (function011 = (Function0) c4297k114.m99357a()) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function011.invoke()).booleanValue();
                                                case 16908360:
                                                    C4297K1 c4297k115 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65360k());
                                                    if (c4297k115 == null || (function012 = (Function0) c4297k115.m99357a()) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function012.invoke()).booleanValue();
                                                case 16908361:
                                                    C4297K1 c4297k116 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65359l());
                                                    if (c4297k116 == null || (function013 = (Function0) c4297k116.m99357a()) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function013.invoke()).booleanValue();
                                                default:
                                                    LN5<CharSequence> m96983k2 = this.f53278k.m96983k(i);
                                                    if (m96983k2 == null || (m96983k = m96983k2.m96983k(i2)) == null || (list = (List) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65368c())) == null) {
                                                        return false;
                                                    }
                                                    int size = list.size();
                                                    for (int i4 = 0; i4 < size; i4++) {
                                                        C44382lF0 c44382lF0 = (C44382lF0) list.get(i4);
                                                        if (Intrinsics.areEqual(c44382lF0.m27627b(), m96983k)) {
                                                            return c44382lF0.m27628a().invoke().booleanValue();
                                                        }
                                                    }
                                                    return false;
                                            }
                                    }
                            }
                            ?? r13 = i2 == 4096;
                            ?? r15 = i2 == 8192;
                            ?? r2 = i2 == 16908345;
                            ?? r4 = i2 == 16908347;
                            ?? r5 = i2 == 16908344;
                            ?? r14 = i2 == 16908346;
                            ?? r6 = r2 == true || r4 == true || r13 == true || r15 == true;
                            ?? r142 = r5 == true || r14 == true || r13 == true || r15 == true;
                            if (r13 != false || r15 != false) {
                                I74 i74 = (I74) C39420cs5.m44940a(m28250b.m31721t(), C45349ms5.f98933a.m24801s());
                                C4297K1 c4297k117 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65353r());
                                if (i74 != null && c4297k117 != null) {
                                    coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i74.m102936c().getEndInclusive().floatValue(), i74.m102936c().getStart().floatValue());
                                    coerceAtMost = RangesKt___RangesKt.coerceAtMost(i74.m102936c().getStart().floatValue(), i74.m102936c().getEndInclusive().floatValue());
                                    if (i74.m102935d() > 0) {
                                        f = coerceAtLeast - coerceAtMost;
                                        i3 = i74.m102935d() + 1;
                                    } else {
                                        f = coerceAtLeast - coerceAtMost;
                                        i3 = 20;
                                    }
                                    float f2 = f / i3;
                                    if (r15 != false) {
                                        f2 = -f2;
                                    }
                                    Function1 function13 = (Function1) c4297k117.m99357a();
                                    if (function13 != null) {
                                        return ((Boolean) function13.invoke(Float.valueOf(i74.m102937b() + f2))).booleanValue();
                                    }
                                    return false;
                                }
                            }
                            long m91256k = C46472om2.m20520a(m28250b.m31729l().mo8157h()).m91256k();
                            C4297K1 c4297k118 = (C4297K1) C39420cs5.m44940a(m28250b.m31721t(), C38216as5.f56452a.m65355p());
                            if (c4297k118 == null) {
                                return false;
                            }
                            C38809bs5 m31721t2 = m28250b.m31721t();
                            C45349ms5 c45349ms52 = C45349ms5.f98933a;
                            C35497Qp5 c35497Qp53 = (C35497Qp5) C39420cs5.m44940a(m31721t2, c45349ms52.m24811i());
                            if (c35497Qp53 != null && r6 != false) {
                                float m5730i = C51465xB5.m5730i(m91256k);
                                if (r2 != false || r15 != false) {
                                    m5730i = -m5730i;
                                }
                                if (c35497Qp53.m87897b()) {
                                    m5730i = -m5730i;
                                }
                                if (C11409g.m68350h(m28250b) && (r2 != false || r4 != false)) {
                                    m5730i = -m5730i;
                                }
                                if (m68448O(c35497Qp53, m5730i)) {
                                    Function2 function23 = (Function2) c4297k118.m99357a();
                                    if (function23 != null) {
                                        return ((Boolean) function23.invoke(Float.valueOf(m5730i), Float.valueOf(0.0f))).booleanValue();
                                    }
                                    return false;
                                }
                            }
                            C35497Qp5 c35497Qp54 = (C35497Qp5) C39420cs5.m44940a(m28250b.m31721t(), c45349ms52.m24820B());
                            if (c35497Qp54 == null || !r142 == true) {
                                return false;
                            }
                            float m5732g = C51465xB5.m5732g(m91256k);
                            if (r5 != false || r15 != false) {
                                m5732g = -m5732g;
                            }
                            if (c35497Qp54.m87897b()) {
                                m5732g = -m5732g;
                            }
                            if (!m68448O(c35497Qp54, m5732g) || (function2 = (Function2) c4297k118.m99357a()) == null) {
                                return false;
                            }
                            return ((Boolean) function2.invoke(Float.valueOf(0.0f), Float.valueOf(m5732g))).booleanValue();
                        } else if (Intrinsics.areEqual(C39420cs5.m44940a(m28250b.m31721t(), C45349ms5.f98933a.m24813g()), Boolean.TRUE)) {
                            InterfaceC32037Bv1.m113331e(this.f53268a.mo31015B(), false, 1, null);
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                } else {
                    boolean m68421h0 = m68421h0(m28250b, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (m68421h0) {
                        m68435a0(this, m68439X(m28250b.m31730k()), 0, null, null, 12, null);
                    }
                    return m68421h0;
                }
            }
            return m68404q(i);
        }
        return m68442U(i);
    }

    /* renamed from: Q */
    public final void m68446Q(int i, C27125p2 info, C42977is5 semanticsNode) {
        String str;
        Object firstOrNull;
        List mutableList;
        Map<CharSequence, Integer> map;
        C27125p2.C27126a c27126a;
        C27125p2.C27126a c27126a2;
        float coerceAtLeast;
        float coerceAtMost;
        float coerceIn;
        int i2;
        int roundToInt;
        boolean z;
        String string;
        String str2;
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        boolean z2 = !semanticsNode.m31720u() && semanticsNode.m31724q().isEmpty() && C11409g.m68354d(semanticsNode.m31728m(), C11393k.f53315g) == null;
        info.m20080f0("android.view.View");
        C38809bs5 m31721t = semanticsNode.m31721t();
        C45349ms5 c45349ms5 = C45349ms5.f98933a;
        C32095Cb5 c32095Cb5 = (C32095Cb5) C39420cs5.m44940a(m31721t, c45349ms5.m24800t());
        if (c32095Cb5 != null) {
            int m112067n = c32095Cb5.m112067n();
            if (semanticsNode.m31720u() || semanticsNode.m31724q().isEmpty()) {
                C32095Cb5.C1074a c1074a = C32095Cb5.f4306b;
                if (C32095Cb5.m112070k(c32095Cb5.m112067n(), c1074a.m112060g())) {
                    info.m20128F0(this.f53268a.getContext().getResources().getString(C43499jl4.tab));
                } else if (C32095Cb5.m112070k(c32095Cb5.m112067n(), c1074a.m112061f())) {
                    info.m20128F0(this.f53268a.getContext().getResources().getString(C43499jl4.switch_role));
                } else {
                    if (C32095Cb5.m112070k(m112067n, c1074a.m112066a())) {
                        str2 = "android.widget.Button";
                    } else if (C32095Cb5.m112070k(m112067n, c1074a.m112065b())) {
                        str2 = "android.widget.CheckBox";
                    } else if (C32095Cb5.m112070k(m112067n, c1074a.m112062e())) {
                        str2 = "android.widget.RadioButton";
                    } else if (C32095Cb5.m112070k(m112067n, c1074a.m112063d())) {
                        str2 = "android.widget.ImageView";
                    } else {
                        str2 = C32095Cb5.m112070k(m112067n, c1074a.m112064c()) ? "android.widget.Spinner" : null;
                    }
                    if (!C32095Cb5.m112070k(c32095Cb5.m112067n(), c1074a.m112063d()) || z2 || semanticsNode.m31721t().m62254s()) {
                        info.m20080f0(str2);
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        if (C11409g.m68349i(semanticsNode)) {
            info.m20080f0("android.widget.EditText");
        }
        if (semanticsNode.m31731j().m62260c(c45349ms5.m24795y())) {
            info.m20080f0("android.widget.TextView");
        }
        info.m20040z0(this.f53268a.getContext().getPackageName());
        info.m20052t0(true);
        List<C42977is5> m31724q = semanticsNode.m31724q();
        int size = m31724q.size();
        for (int i3 = 0; i3 < size; i3++) {
            C42977is5 c42977is5 = m31724q.get(i3);
            if (m68390z().containsKey(Integer.valueOf(c42977is5.m31730k()))) {
                AndroidViewHolder androidViewHolder = this.f53268a.m68553u0().m68532c().get(c42977is5.m31728m());
                if (androidViewHolder != null) {
                    info.m20087c(androidViewHolder);
                } else {
                    info.m20085d(this.f53268a, c42977is5.m31730k());
                }
            }
        }
        if (this.f53277j == i) {
            info.m20093Y(true);
            info.m20089b(C27125p2.C27126a.f103000l);
        } else {
            info.m20093Y(false);
            info.m20089b(C27125p2.C27126a.f102999k);
        }
        m68417j0(semanticsNode, info);
        m68419i0(semanticsNode, info);
        C38809bs5 m31721t2 = semanticsNode.m31721t();
        C45349ms5 c45349ms52 = C45349ms5.f98933a;
        info.m20114M0((CharSequence) C39420cs5.m44940a(m31721t2, c45349ms52.m24797w()));
        EnumC45479n56 enumC45479n56 = (EnumC45479n56) C39420cs5.m44940a(semanticsNode.m31721t(), c45349ms52.m24821A());
        if (enumC45479n56 != null) {
            info.m20084d0(true);
            int i4 = C11391i.$EnumSwitchMapping$0[enumC45479n56.ordinal()];
            if (i4 == 1) {
                info.m20082e0(true);
                if ((c32095Cb5 == null ? false : C32095Cb5.m112070k(c32095Cb5.m112067n(), C32095Cb5.f4306b.m112061f())) && info.m20043y() == null) {
                    info.m20114M0(this.f53268a.getContext().getResources().getString(C43499jl4.f93295on));
                }
            } else if (i4 != 2) {
                if (i4 == 3 && info.m20043y() == null) {
                    info.m20114M0(this.f53268a.getContext().getResources().getString(C43499jl4.indeterminate));
                }
            } else {
                info.m20082e0(false);
                if ((c32095Cb5 == null ? false : C32095Cb5.m112070k(c32095Cb5.m112067n(), C32095Cb5.f4306b.m112061f())) && info.m20043y() == null) {
                    info.m20114M0(this.f53268a.getContext().getResources().getString(C43499jl4.off));
                }
            }
            Unit unit2 = Unit.INSTANCE;
        }
        Boolean bool = (Boolean) C39420cs5.m44940a(semanticsNode.m31721t(), c45349ms52.m24798v());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (c32095Cb5 == null ? false : C32095Cb5.m112070k(c32095Cb5.m112067n(), C32095Cb5.f4306b.m112060g())) {
                info.m20122I0(booleanValue);
            } else {
                info.m20084d0(true);
                info.m20082e0(booleanValue);
                if (info.m20043y() == null) {
                    if (booleanValue) {
                        string = this.f53268a.getContext().getResources().getString(C43499jl4.selected);
                    } else {
                        string = this.f53268a.getContext().getResources().getString(C43499jl4.not_selected);
                    }
                    info.m20114M0(string);
                }
            }
            Unit unit3 = Unit.INSTANCE;
        }
        if (!semanticsNode.m31721t().m62254s() || semanticsNode.m31724q().isEmpty()) {
            List list = (List) C39420cs5.m44940a(semanticsNode.m31721t(), c45349ms52.m24817c());
            if (list != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
                str = (String) firstOrNull;
            } else {
                str = null;
            }
            info.m20072j0(str);
        }
        String str3 = (String) C39420cs5.m44940a(semanticsNode.m31721t(), c45349ms52.m24796x());
        if (str3 != null) {
            C42977is5 c42977is52 = semanticsNode;
            while (true) {
                if (c42977is52 == null) {
                    z = false;
                    break;
                }
                C38809bs5 m31721t3 = c42977is52.m31721t();
                C45942ns5 c45942ns5 = C45942ns5.f100956a;
                if (m31721t3.m62260c(c45942ns5.m22265a())) {
                    z = ((Boolean) c42977is52.m31721t().m62258f(c45942ns5.m22265a())).booleanValue();
                    break;
                }
                c42977is52 = c42977is52.m31726o();
            }
            if (z) {
                info.m20102S0(str3);
            }
        }
        C38809bs5 m31721t4 = semanticsNode.m31721t();
        C45349ms5 c45349ms53 = C45349ms5.f98933a;
        if (((Unit) C39420cs5.m44940a(m31721t4, c45349ms53.m24812h())) != null) {
            info.m20056r0(true);
            Unit unit4 = Unit.INSTANCE;
        }
        info.m20132D0(C11409g.m68351g(semanticsNode));
        info.m20066m0(C11409g.m68349i(semanticsNode));
        info.m20064n0(C11409g.m68356b(semanticsNode));
        info.m20060p0(semanticsNode.m31721t().m62260c(c45349ms53.m24813g()));
        if (info.m20121J()) {
            info.m20058q0(((Boolean) semanticsNode.m31721t().m62258f(c45349ms53.m24813g())).booleanValue());
            if (info.m20119K()) {
                info.m20091a(2);
            } else {
                info.m20091a(1);
            }
        }
        info.m20100T0(C11409g.m68348j(semanticsNode));
        C37627Zs2 c37627Zs2 = (C37627Zs2) C39420cs5.m44940a(semanticsNode.m31721t(), c45349ms53.m24804p());
        if (c37627Zs2 != null) {
            int m72372i = c37627Zs2.m72372i();
            C37627Zs2.C10422a c10422a = C37627Zs2.f49423b;
            info.m20048v0((C37627Zs2.m72375f(m72372i, c10422a.m72370b()) || !C37627Zs2.m72375f(m72372i, c10422a.m72371a())) ? 1 : 2);
            Unit unit5 = Unit.INSTANCE;
        }
        info.m20078g0(false);
        C38809bs5 m31721t5 = semanticsNode.m31721t();
        C38216as5 c38216as5 = C38216as5.f56452a;
        C4297K1 c4297k1 = (C4297K1) C39420cs5.m44940a(m31721t5, c38216as5.m65363h());
        if (c4297k1 != null) {
            boolean areEqual = Intrinsics.areEqual(C39420cs5.m44940a(semanticsNode.m31721t(), c45349ms53.m24798v()), Boolean.TRUE);
            info.m20078g0(!areEqual);
            if (C11409g.m68356b(semanticsNode) && !areEqual) {
                info.m20089b(new C27125p2.C27126a(16, c4297k1.m99356b()));
            }
            Unit unit6 = Unit.INSTANCE;
        }
        info.m20046w0(false);
        C4297K1 c4297k12 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65362i());
        if (c4297k12 != null) {
            info.m20046w0(true);
            if (C11409g.m68356b(semanticsNode)) {
                info.m20089b(new C27125p2.C27126a(32, c4297k12.m99356b()));
            }
            Unit unit7 = Unit.INSTANCE;
        }
        C4297K1 c4297k13 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65369b());
        if (c4297k13 != null) {
            info.m20089b(new C27125p2.C27126a(16384, c4297k13.m99356b()));
            Unit unit8 = Unit.INSTANCE;
        }
        if (C11409g.m68356b(semanticsNode)) {
            C4297K1 c4297k14 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65351t());
            if (c4297k14 != null) {
                info.m20089b(new C27125p2.C27126a(2097152, c4297k14.m99356b()));
                Unit unit9 = Unit.INSTANCE;
            }
            C4297K1 c4297k15 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65367d());
            if (c4297k15 != null) {
                info.m20089b(new C27125p2.C27126a(65536, c4297k15.m99356b()));
                Unit unit10 = Unit.INSTANCE;
            }
            C4297K1 c4297k16 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65357n());
            if (c4297k16 != null) {
                if (info.m20119K() && this.f53268a.mo30988n().mo44025c()) {
                    info.m20089b(new C27125p2.C27126a(DateUtils.FORMAT_ABBREV_WEEKDAY, c4297k16.m99356b()));
                }
                Unit unit11 = Unit.INSTANCE;
            }
        }
        String m68461B = m68461B(semanticsNode);
        if (!(m68461B == null || m68461B.length() == 0)) {
            info.m20110O0(m68391y(semanticsNode), m68392x(semanticsNode));
            C4297K1 c4297k17 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65352s());
            info.m20089b(new C27125p2.C27126a(DateUtils.FORMAT_NUMERIC_DATE, c4297k17 != null ? c4297k17.m99356b() : null));
            info.m20091a(256);
            info.m20091a(512);
            info.m20042y0(11);
            List list2 = (List) C39420cs5.m44940a(semanticsNode.m31721t(), c45349ms53.m24817c());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.m31721t().m62260c(c38216as5.m65364g()) && !C11409g.m68355c(semanticsNode)) {
                info.m20042y0(info.m20051u() | 4 | 16);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence m20041z = info.m20041z();
            if (!(m20041z == null || m20041z.length() == 0) && semanticsNode.m31721t().m62260c(c38216as5.m65364g())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.m31721t().m62260c(c45349ms53.m24796x())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            if (!arrayList.isEmpty()) {
                C27757r2 c27757r2 = C27757r2.f106238a;
                AccessibilityNodeInfo m20098U0 = info.m20098U0();
                Intrinsics.checkNotNullExpressionValue(m20098U0, "info.unwrap()");
                c27757r2.m16624a(m20098U0, arrayList);
            }
        }
        I74 i74 = (I74) C39420cs5.m44940a(semanticsNode.m31721t(), c45349ms53.m24801s());
        if (i74 != null) {
            if (semanticsNode.m31721t().m62260c(c38216as5.m65353r())) {
                info.m20080f0("android.widget.SeekBar");
            } else {
                info.m20080f0("android.widget.ProgressBar");
            }
            if (i74 != I74.f14536d.m102934a()) {
                info.m20130E0(C27125p2.C27129d.m20032a(1, i74.m102936c().getStart().floatValue(), i74.m102936c().getEndInclusive().floatValue(), i74.m102937b()));
                if (info.m20043y() == null) {
                    ClosedFloatingPointRange<Float> m102936c = i74.m102936c();
                    coerceIn = RangesKt___RangesKt.coerceIn(((m102936c.getEndInclusive().floatValue() - m102936c.getStart().floatValue()) > 0.0f ? 1 : ((m102936c.getEndInclusive().floatValue() - m102936c.getStart().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (i74.m102937b() - m102936c.getStart().floatValue()) / (m102936c.getEndInclusive().floatValue() - m102936c.getStart().floatValue()), 0.0f, 1.0f);
                    if (coerceIn == 0.0f) {
                        i2 = 0;
                    } else {
                        i2 = 100;
                        if (!(coerceIn == 1.0f)) {
                            roundToInt = MathKt__MathJVMKt.roundToInt(coerceIn * 100);
                            i2 = RangesKt___RangesKt.coerceIn(roundToInt, 1, 99);
                        }
                    }
                    info.m20114M0(this.f53268a.getContext().getResources().getString(C43499jl4.template_percent, Integer.valueOf(i2)));
                }
            } else if (info.m20043y() == null) {
                info.m20114M0(this.f53268a.getContext().getResources().getString(C43499jl4.in_progress));
            }
            if (semanticsNode.m31721t().m62260c(c38216as5.m65353r()) && C11409g.m68356b(semanticsNode)) {
                float m102937b = i74.m102937b();
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i74.m102936c().getEndInclusive().floatValue(), i74.m102936c().getStart().floatValue());
                if (m102937b < coerceAtLeast) {
                    info.m20089b(C27125p2.C27126a.f103005q);
                }
                float m102937b2 = i74.m102937b();
                coerceAtMost = RangesKt___RangesKt.coerceAtMost(i74.m102936c().getStart().floatValue(), i74.m102936c().getEndInclusive().floatValue());
                if (m102937b2 > coerceAtMost) {
                    info.m20089b(C27125p2.C27126a.f103006r);
                }
            }
        }
        C11384b.m68388a(info, semanticsNode);
        C41133fm0.m40881d(semanticsNode, info);
        C41133fm0.m40880e(semanticsNode, info);
        C35497Qp5 c35497Qp5 = (C35497Qp5) C39420cs5.m44940a(semanticsNode.m31721t(), c45349ms53.m24811i());
        C4297K1 c4297k18 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65355p());
        if (c35497Qp5 != null && c4297k18 != null) {
            if (!C41133fm0.m40883b(semanticsNode)) {
                info.m20080f0("android.widget.HorizontalScrollView");
            }
            if (c35497Qp5.m87898a().invoke().floatValue() > 0.0f) {
                info.m20124H0(true);
            }
            if (C11409g.m68356b(semanticsNode)) {
                if (m68444S(c35497Qp5)) {
                    info.m20089b(C27125p2.C27126a.f103005q);
                    if (!C11409g.m68350h(semanticsNode)) {
                        c27126a2 = C27125p2.C27126a.f102977F;
                    } else {
                        c27126a2 = C27125p2.C27126a.f102975D;
                    }
                    info.m20089b(c27126a2);
                }
                if (m68445R(c35497Qp5)) {
                    info.m20089b(C27125p2.C27126a.f103006r);
                    if (!C11409g.m68350h(semanticsNode)) {
                        c27126a = C27125p2.C27126a.f102975D;
                    } else {
                        c27126a = C27125p2.C27126a.f102977F;
                    }
                    info.m20089b(c27126a);
                }
            }
        }
        C35497Qp5 c35497Qp52 = (C35497Qp5) C39420cs5.m44940a(semanticsNode.m31721t(), c45349ms53.m24820B());
        if (c35497Qp52 != null && c4297k18 != null) {
            if (!C41133fm0.m40883b(semanticsNode)) {
                info.m20080f0("android.widget.ScrollView");
            }
            if (c35497Qp52.m87898a().invoke().floatValue() > 0.0f) {
                info.m20124H0(true);
            }
            if (C11409g.m68356b(semanticsNode)) {
                if (m68444S(c35497Qp52)) {
                    info.m20089b(C27125p2.C27126a.f103005q);
                    info.m20089b(C27125p2.C27126a.f102976E);
                }
                if (m68445R(c35497Qp52)) {
                    info.m20089b(C27125p2.C27126a.f103006r);
                    info.m20089b(C27125p2.C27126a.f102974C);
                }
            }
        }
        if (i5 >= 29) {
            C11386d.m68386a(info, semanticsNode);
        }
        info.m20138A0((CharSequence) C39420cs5.m44940a(semanticsNode.m31721t(), c45349ms53.m24803q()));
        if (C11409g.m68356b(semanticsNode)) {
            C4297K1 c4297k19 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65365f());
            if (c4297k19 != null) {
                info.m20089b(new C27125p2.C27126a(DateUtils.FORMAT_ABBREV_RELATIVE, c4297k19.m99356b()));
                Unit unit12 = Unit.INSTANCE;
            }
            C4297K1 c4297k110 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65370a());
            if (c4297k110 != null) {
                info.m20089b(new C27125p2.C27126a(524288, c4297k110.m99356b()));
                Unit unit13 = Unit.INSTANCE;
            }
            C4297K1 c4297k111 = (C4297K1) C39420cs5.m44940a(semanticsNode.m31721t(), c38216as5.m65366e());
            if (c4297k111 != null) {
                info.m20089b(new C27125p2.C27126a(1048576, c4297k111.m99356b()));
                Unit unit14 = Unit.INSTANCE;
            }
            if (semanticsNode.m31721t().m62260c(c38216as5.m65368c())) {
                List list3 = (List) semanticsNode.m31721t().m62258f(c38216as5.m65368c());
                int size2 = list3.size();
                int[] iArr = f53263F;
                if (size2 < iArr.length) {
                    LN5<CharSequence> ln5 = new LN5<>();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.f53279l.m96986g(i)) {
                        Map<CharSequence, Integer> m96983k = this.f53279l.m96983k(i);
                        mutableList = ArraysKt___ArraysKt.toMutableList(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list3.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            C44382lF0 c44382lF0 = (C44382lF0) list3.get(i6);
                            Intrinsics.checkNotNull(m96983k);
                            if (m96983k.containsKey(c44382lF0.m27627b())) {
                                Integer num = m96983k.get(c44382lF0.m27627b());
                                Intrinsics.checkNotNull(num);
                                map = m96983k;
                                ln5.m96978p(num.intValue(), c44382lF0.m27627b());
                                linkedHashMap.put(c44382lF0.m27627b(), num);
                                mutableList.remove(num);
                                info.m20089b(new C27125p2.C27126a(num.intValue(), c44382lF0.m27627b()));
                            } else {
                                map = m96983k;
                                arrayList2.add(c44382lF0);
                            }
                            i6++;
                            m96983k = map;
                        }
                        int size4 = arrayList2.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            C44382lF0 c44382lF02 = (C44382lF0) arrayList2.get(i7);
                            int intValue = ((Number) mutableList.get(i7)).intValue();
                            ln5.m96978p(intValue, c44382lF02.m27627b());
                            linkedHashMap.put(c44382lF02.m27627b(), Integer.valueOf(intValue));
                            info.m20089b(new C27125p2.C27126a(intValue, c44382lF02.m27627b()));
                        }
                    } else {
                        int size5 = list3.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            C44382lF0 c44382lF03 = (C44382lF0) list3.get(i8);
                            int i9 = f53263F[i8];
                            ln5.m96978p(i9, c44382lF03.m27627b());
                            linkedHashMap.put(c44382lF03.m27627b(), Integer.valueOf(i9));
                            info.m20089b(new C27125p2.C27126a(i9, c44382lF03.m27627b()));
                        }
                    }
                    this.f53278k.m96978p(i, ln5);
                    this.f53279l.m96978p(i, linkedHashMap);
                } else {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
            }
        }
        info.m20126G0(semanticsNode.m31721t().m62254s() || (z2 && (info.m20057r() != null || info.m20041z() != null || info.m20053t() != null || info.m20043y() != null || info.m20129F())));
        if (this.f53288u.get(Integer.valueOf(i)) != null) {
            Integer num2 = this.f53288u.get(Integer.valueOf(i));
            if (num2 != null) {
                info.m20104R0(this.f53268a, num2.intValue());
                Unit unit15 = Unit.INSTANCE;
            }
            AccessibilityNodeInfo m20098U02 = info.m20098U0();
            Intrinsics.checkNotNullExpressionValue(m20098U02, "info.unwrap()");
            m68414l(i, m20098U02, this.f53290w, null);
        }
        if (this.f53289v.get(Integer.valueOf(i)) != null) {
            Integer num3 = this.f53289v.get(Integer.valueOf(i));
            if (num3 != null) {
                info.m20106Q0(this.f53268a, num3.intValue());
                Unit unit16 = Unit.INSTANCE;
            }
            AccessibilityNodeInfo m20098U03 = info.m20098U0();
            Intrinsics.checkNotNullExpressionValue(m20098U03, "info.unwrap()");
            m68414l(i, m20098U03, this.f53291x, null);
        }
    }

    /* renamed from: T */
    public final boolean m68443T(int i, List<C36667Vp5> list) {
        boolean z;
        C36667Vp5 m68342p = C11409g.m68342p(list, i);
        if (m68342p != null) {
            z = false;
        } else {
            m68342p = new C36667Vp5(i, this.f53266C, null, null, null, null);
            z = true;
        }
        this.f53266C.add(m68342p);
        return z;
    }

    /* renamed from: U */
    public final boolean m68442U(int i) {
        if (!m68453J() || m68456G(i)) {
            return false;
        }
        int i2 = this.f53277j;
        if (i2 != Integer.MIN_VALUE) {
            m68435a0(this, i2, 65536, null, null, 12, null);
        }
        this.f53277j = i;
        this.f53268a.invalidate();
        m68435a0(this, i, DateUtils.FORMAT_ABBREV_WEEKDAY, null, null, 12, null);
        return true;
    }

    /* renamed from: V */
    public final Comparator<C42977is5> m68441V(boolean z) {
        Comparator compareBy;
        compareBy = ComparisonsKt__ComparisonsKt.compareBy(C11400r.f53323g, C11401s.f53324g, C11402t.f53325g, C11403u.f53326g);
        if (z) {
            compareBy = ComparisonsKt__ComparisonsKt.compareBy(C11396n.f53319g, C11397o.f53320g, C11398p.f53321g, C11399q.f53322g);
        }
        return new C11395m(new C11394l(compareBy, C33829Jm2.f18144U.m99722b()));
    }

    /* renamed from: X */
    public final int m68439X(int i) {
        if (i == this.f53268a.m68612A0().m26718a().m31730k()) {
            return -1;
        }
        return i;
    }

    /* renamed from: Y */
    public final boolean m68438Y(AccessibilityEvent accessibilityEvent) {
        if (!m68454I()) {
            return false;
        }
        return this.f53268a.getParent().requestSendAccessibilityEvent(this.f53268a, accessibilityEvent);
    }

    /* renamed from: Z */
    public final boolean m68437Z(int i, int i2, Integer num, List<String> list) {
        if (i != Integer.MIN_VALUE && m68454I()) {
            AccessibilityEvent m68402r = m68402r(i, i2);
            if (num != null) {
                m68402r.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                m68402r.setContentDescription(C43057j06.m31267d(list, ",", null, null, 0, null, null, 62, null));
            }
            return m68438Y(m68402r);
        }
        return false;
    }

    /* renamed from: b0 */
    public final void m68433b0(int i, int i2, String str) {
        AccessibilityEvent m68402r = m68402r(m68439X(i), 32);
        m68402r.setContentChangeTypes(i2);
        if (str != null) {
            m68402r.getText().add(str);
        }
        m68438Y(m68402r);
    }

    /* renamed from: c0 */
    public final void m68431c0(int i) {
        C11389g c11389g = this.f53285r;
        if (c11389g != null) {
            if (i != c11389g.m68382d().m31730k()) {
                return;
            }
            if (SystemClock.uptimeMillis() - c11389g.m68380f() <= 1000) {
                AccessibilityEvent m68402r = m68402r(m68439X(c11389g.m68382d().m31730k()), DateUtils.FORMAT_NUMERIC_DATE);
                m68402r.setFromIndex(c11389g.m68384b());
                m68402r.setToIndex(c11389g.m68381e());
                m68402r.setAction(c11389g.m68385a());
                m68402r.setMovementGranularity(c11389g.m68383c());
                m68402r.getText().add(m68461B(c11389g.m68382d()));
                m68438Y(m68402r);
            }
        }
        this.f53285r = null;
    }

    /* renamed from: d0 */
    public final void m68429d0(C36667Vp5 c36667Vp5) {
        if (!c36667Vp5.mo14142L()) {
            return;
        }
        this.f53268a.mo30989l().m26010h(c36667Vp5, this.f53267D, new C11404v(c36667Vp5, this));
    }

    /* renamed from: e0 */
    public final void m68427e0(Map<Integer, C44163ks5> map) {
        C42977is5 c42977is5;
        boolean m68443T;
        boolean areEqual;
        boolean m112070k;
        String str;
        String str2;
        int coerceAtMost;
        boolean z;
        boolean z2;
        AccessibilityEvent m68398t;
        String m110052j;
        boolean areEqual2;
        Map<Integer, C44163ks5> newSemanticsNodes = map;
        Intrinsics.checkNotNullParameter(newSemanticsNodes, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.f53266C);
        this.f53266C.clear();
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            C11390h c11390h = this.f53292y.get(Integer.valueOf(intValue));
            if (c11390h != null) {
                C44163ks5 c44163ks5 = newSemanticsNodes.get(Integer.valueOf(intValue));
                if (c44163ks5 != null) {
                    c42977is5 = c44163ks5.m28250b();
                } else {
                    c42977is5 = null;
                }
                Intrinsics.checkNotNull(c42977is5);
                Iterator<Map.Entry<? extends C48314rs5<?>, ? extends Object>> it = c42977is5.m31721t().iterator();
                boolean z3 = false;
                while (it.hasNext()) {
                    Map.Entry<? extends C48314rs5<?>, ? extends Object> next = it.next();
                    C48314rs5<?> key = next.getKey();
                    C45349ms5 c45349ms5 = C45349ms5.f98933a;
                    if (!Intrinsics.areEqual(key, c45349ms5.m24811i()) && !Intrinsics.areEqual(next.getKey(), c45349ms5.m24820B())) {
                        m68443T = false;
                    } else {
                        m68443T = m68443T(intValue, arrayList);
                    }
                    if (m68443T || !Intrinsics.areEqual(next.getValue(), C39420cs5.m44940a(c11390h.m68377c(), next.getKey()))) {
                        C48314rs5<?> key2 = next.getKey();
                        if (Intrinsics.areEqual(key2, c45349ms5.m24803q())) {
                            Object value = next.getValue();
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) value;
                            if (c11390h.m68376d()) {
                                m68433b0(intValue, 8, str3);
                            }
                        } else {
                            if (Intrinsics.areEqual(key2, c45349ms5.m24797w())) {
                                areEqual = true;
                            } else {
                                areEqual = Intrinsics.areEqual(key2, c45349ms5.m24821A());
                            }
                            if (areEqual) {
                                m68435a0(this, m68439X(intValue), 2048, 64, null, 8, null);
                                m68435a0(this, m68439X(intValue), 2048, 0, null, 8, null);
                            } else if (Intrinsics.areEqual(key2, c45349ms5.m24801s())) {
                                m68435a0(this, m68439X(intValue), 2048, 64, null, 8, null);
                                m68435a0(this, m68439X(intValue), 2048, 0, null, 8, null);
                            } else if (Intrinsics.areEqual(key2, c45349ms5.m24798v())) {
                                C32095Cb5 c32095Cb5 = (C32095Cb5) C39420cs5.m44940a(c42977is5.m31731j(), c45349ms5.m24800t());
                                int m112060g = C32095Cb5.f4306b.m112060g();
                                if (c32095Cb5 == null) {
                                    m112070k = false;
                                } else {
                                    m112070k = C32095Cb5.m112070k(c32095Cb5.m112067n(), m112060g);
                                }
                                if (m112070k) {
                                    if (Intrinsics.areEqual(C39420cs5.m44940a(c42977is5.m31731j(), c45349ms5.m24798v()), Boolean.TRUE)) {
                                        AccessibilityEvent m68402r = m68402r(m68439X(intValue), 4);
                                        C42977is5 c42977is52 = new C42977is5(c42977is5.m31727n(), true, null, 4, null);
                                        List list = (List) C39420cs5.m44940a(c42977is52.m31731j(), c45349ms5.m24817c());
                                        if (list != null) {
                                            str = C43057j06.m31267d(list, ",", null, null, 0, null, null, 62, null);
                                        } else {
                                            str = null;
                                        }
                                        List list2 = (List) C39420cs5.m44940a(c42977is52.m31731j(), c45349ms5.m24795y());
                                        if (list2 != null) {
                                            str2 = C43057j06.m31267d(list2, ",", null, null, 0, null, null, 62, null);
                                        } else {
                                            str2 = null;
                                        }
                                        if (str != null) {
                                            m68402r.setContentDescription(str);
                                        }
                                        if (str2 != null) {
                                            m68402r.getText().add(str2);
                                        }
                                        m68438Y(m68402r);
                                    } else {
                                        m68435a0(this, m68439X(intValue), 2048, 0, null, 8, null);
                                    }
                                } else {
                                    m68435a0(this, m68439X(intValue), 2048, 64, null, 8, null);
                                    m68435a0(this, m68439X(intValue), 2048, 0, null, 8, null);
                                }
                            } else if (Intrinsics.areEqual(key2, c45349ms5.m24817c())) {
                                int m68439X = m68439X(intValue);
                                Object value2 = next.getValue();
                                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                m68437Z(m68439X, 2048, 4, (List) value2);
                            } else {
                                String str4 = "";
                                if (Intrinsics.areEqual(key2, c45349ms5.m24815e())) {
                                    if (C11409g.m68349i(c42977is5)) {
                                        C1577Df m68459D = m68459D(c11390h.m68377c());
                                        if (m68459D == null) {
                                            m68459D = "";
                                        }
                                        C1577Df m68459D2 = m68459D(c42977is5.m31721t());
                                        if (m68459D2 != null) {
                                            str4 = m68459D2;
                                        }
                                        CharSequence m68399s0 = m68399s0(str4, 100000);
                                        int length = m68459D.length();
                                        int length2 = str4.length();
                                        coerceAtMost = RangesKt___RangesKt.coerceAtMost(length, length2);
                                        int i = 0;
                                        while (i < coerceAtMost && m68459D.charAt(i) == str4.charAt(i)) {
                                            i++;
                                        }
                                        int i2 = 0;
                                        while (i2 < coerceAtMost - i) {
                                            int i3 = coerceAtMost;
                                            if (m68459D.charAt((length - 1) - i2) != str4.charAt((length2 - 1) - i2)) {
                                                break;
                                            }
                                            i2++;
                                            coerceAtMost = i3;
                                        }
                                        int i4 = (length - i2) - i;
                                        int i5 = (length2 - i2) - i;
                                        if (C11409g.m68349i(c11390h.m68378b()) && !C11409g.m68351g(c11390h.m68378b()) && C11409g.m68351g(c42977is5)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (C11409g.m68349i(c11390h.m68378b()) && C11409g.m68351g(c11390h.m68378b()) && !C11409g.m68351g(c42977is5)) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (!z && !z2) {
                                            m68398t = m68402r(m68439X(intValue), 16);
                                            m68398t.setFromIndex(i);
                                            m68398t.setRemovedCount(i4);
                                            m68398t.setAddedCount(i5);
                                            m68398t.setBeforeText(m68459D);
                                            m68398t.getText().add(m68399s0);
                                        } else {
                                            m68398t = m68398t(m68439X(intValue), 0, 0, Integer.valueOf(length2), m68399s0);
                                        }
                                        m68398t.setClassName("android.widget.EditText");
                                        m68438Y(m68398t);
                                        if (z || z2) {
                                            long m14828r = ((C48413s26) c42977is5.m31721t().m62258f(C45349ms5.f98933a.m24794z())).m14828r();
                                            m68398t.setFromIndex(C48413s26.m14832n(m14828r));
                                            m68398t.setToIndex(C48413s26.m14837i(m14828r));
                                            m68438Y(m68398t);
                                        }
                                    } else {
                                        m68435a0(this, m68439X(intValue), 2048, 2, null, 8, null);
                                    }
                                } else if (Intrinsics.areEqual(key2, c45349ms5.m24794z())) {
                                    C1577Df m68459D3 = m68459D(c42977is5.m31721t());
                                    if (m68459D3 != null && (m110052j = m68459D3.m110052j()) != null) {
                                        str4 = m110052j;
                                    }
                                    long m14828r2 = ((C48413s26) c42977is5.m31721t().m62258f(c45349ms5.m24794z())).m14828r();
                                    m68438Y(m68398t(m68439X(intValue), Integer.valueOf(C48413s26.m14832n(m14828r2)), Integer.valueOf(C48413s26.m14837i(m14828r2)), Integer.valueOf(str4.length()), m68399s0(str4, 100000)));
                                    m68431c0(c42977is5.m31730k());
                                } else {
                                    if (Intrinsics.areEqual(key2, c45349ms5.m24811i())) {
                                        areEqual2 = true;
                                    } else {
                                        areEqual2 = Intrinsics.areEqual(key2, c45349ms5.m24820B());
                                    }
                                    if (areEqual2) {
                                        m68452K(c42977is5.m31728m());
                                        C36667Vp5 m68342p = C11409g.m68342p(this.f53266C, intValue);
                                        Intrinsics.checkNotNull(m68342p);
                                        m68342p.m79387f((C35497Qp5) C39420cs5.m44940a(c42977is5.m31721t(), c45349ms5.m24811i()));
                                        m68342p.m79384i((C35497Qp5) C39420cs5.m44940a(c42977is5.m31721t(), c45349ms5.m24820B()));
                                        m68429d0(m68342p);
                                    } else if (Intrinsics.areEqual(key2, c45349ms5.m24813g())) {
                                        Object value3 = next.getValue();
                                        Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                        if (((Boolean) value3).booleanValue()) {
                                            m68438Y(m68402r(m68439X(c42977is5.m31730k()), 8));
                                        }
                                        m68435a0(this, m68439X(c42977is5.m31730k()), 2048, 0, null, 8, null);
                                    } else {
                                        C38216as5 c38216as5 = C38216as5.f56452a;
                                        if (Intrinsics.areEqual(key2, c38216as5.m65368c())) {
                                            List list3 = (List) c42977is5.m31721t().m62258f(c38216as5.m65368c());
                                            List list4 = (List) C39420cs5.m44940a(c11390h.m68377c(), c38216as5.m65368c());
                                            if (list4 != null) {
                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                int size = list3.size();
                                                for (int i6 = 0; i6 < size; i6++) {
                                                    linkedHashSet.add(((C44382lF0) list3.get(i6)).m27627b());
                                                }
                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                int size2 = list4.size();
                                                for (int i7 = 0; i7 < size2; i7++) {
                                                    linkedHashSet2.add(((C44382lF0) list4.get(i7)).m27627b());
                                                }
                                                if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                    z3 = false;
                                                }
                                                z3 = true;
                                            } else if (!list3.isEmpty()) {
                                                z3 = true;
                                            }
                                        } else {
                                            if (next.getValue() instanceof C4297K1) {
                                                Object value4 = next.getValue();
                                                Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                z3 = !C11409g.m68357a((C4297K1) value4, C39420cs5.m44940a(c11390h.m68377c(), next.getKey()));
                                            }
                                            z3 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!z3) {
                    z3 = C11409g.m68346l(c42977is5, c11390h);
                }
                if (z3) {
                    m68435a0(this, m68439X(intValue), 2048, 0, null, 8, null);
                }
                newSemanticsNodes = map;
            }
        }
    }

    /* renamed from: f0 */
    public final void m68425f0(C42977is5 c42977is5, C11390h c11390h) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<C42977is5> m31724q = c42977is5.m31724q();
        int size = m31724q.size();
        for (int i = 0; i < size; i++) {
            C42977is5 c42977is52 = m31724q.get(i);
            if (m68390z().containsKey(Integer.valueOf(c42977is52.m31730k()))) {
                if (!c11390h.m68379a().contains(Integer.valueOf(c42977is52.m31730k()))) {
                    m68452K(c42977is5.m31728m());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(c42977is52.m31730k()));
            }
        }
        for (Integer num : c11390h.m68379a()) {
            if (!linkedHashSet.contains(Integer.valueOf(num.intValue()))) {
                m68452K(c42977is5.m31728m());
                return;
            }
        }
        List<C42977is5> m31724q2 = c42977is5.m31724q();
        int size2 = m31724q2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C42977is5 c42977is53 = m31724q2.get(i2);
            if (m68390z().containsKey(Integer.valueOf(c42977is53.m31730k()))) {
                C11390h c11390h2 = this.f53292y.get(Integer.valueOf(c42977is53.m31730k()));
                Intrinsics.checkNotNull(c11390h2);
                m68425f0(c42977is53, c11390h2);
            }
        }
    }

    /* renamed from: g0 */
    public final void m68423g0(C33829Jm2 c33829Jm2, C30704yo<Integer> c30704yo) {
        C33829Jm2 m68354d;
        InterfaceC41791gs5 m29803i;
        if (!c33829Jm2.m99822J0() || this.f53268a.m68553u0().m68532c().containsKey(c33829Jm2)) {
            return;
        }
        InterfaceC41791gs5 m29803i2 = C43570js5.m29803i(c33829Jm2);
        if (m29803i2 == null) {
            C33829Jm2 m68354d2 = C11409g.m68354d(c33829Jm2, C11407y.f53331g);
            if (m68354d2 != null) {
                m29803i2 = C43570js5.m29803i(m68354d2);
            } else {
                m29803i2 = null;
            }
            if (m29803i2 == null) {
                return;
            }
        }
        if (!C42384hs5.m35683a(m29803i2).m62254s() && (m68354d = C11409g.m68354d(c33829Jm2, C11406x.f53330g)) != null && (m29803i = C43570js5.m29803i(m68354d)) != null) {
            m29803i2 = m29803i;
        }
        int m99750r0 = C51083wZ0.m6661h(m29803i2).m99750r0();
        if (!c30704yo.add(Integer.valueOf(m99750r0))) {
            return;
        }
        m68435a0(this, m68439X(m99750r0), 2048, 1, null, 8, null);
    }

    @Override // p000.C5148M1
    public C28154s2 getAccessibilityNodeProvider(View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return this.f53276i;
    }

    /* renamed from: h0 */
    public final boolean m68421h0(C42977is5 c42977is5, int i, int i2, boolean z) {
        String m68461B;
        Integer num;
        Integer num2;
        C38809bs5 m31721t = c42977is5.m31721t();
        C38216as5 c38216as5 = C38216as5.f56452a;
        boolean z2 = false;
        if (m31721t.m62260c(c38216as5.m65352s()) && C11409g.m68356b(c42977is5)) {
            Function3 function3 = (Function3) ((C4297K1) c42977is5.m31721t().m62258f(c38216as5.m65352s())).m99357a();
            if (function3 == null) {
                return false;
            }
            return ((Boolean) function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } else if ((i == i2 && i2 == this.f53280m) || (m68461B = m68461B(c42977is5)) == null) {
            return false;
        } else {
            this.f53280m = (i < 0 || i != i2 || i2 > m68461B.length()) ? -1 : -1;
            if (m68461B.length() > 0) {
                z2 = true;
            }
            int m68439X = m68439X(c42977is5.m31730k());
            Integer num3 = null;
            if (z2) {
                num = Integer.valueOf(this.f53280m);
            } else {
                num = null;
            }
            if (z2) {
                num2 = Integer.valueOf(this.f53280m);
            } else {
                num2 = null;
            }
            if (z2) {
                num3 = Integer.valueOf(m68461B.length());
            }
            m68438Y(m68398t(m68439X, num, num2, num3, m68461B));
            m68431c0(c42977is5.m31730k());
            return true;
        }
    }

    /* renamed from: i0 */
    public final void m68419i0(C42977is5 c42977is5, C27125p2 c27125p2) {
        C38809bs5 m31721t = c42977is5.m31721t();
        C45349ms5 c45349ms5 = C45349ms5.f98933a;
        if (m31721t.m62260c(c45349ms5.m24814f())) {
            c27125p2.m20070k0(true);
            c27125p2.m20062o0((CharSequence) C39420cs5.m44940a(c42977is5.m31721t(), c45349ms5.m24814f()));
        }
    }

    /* renamed from: j0 */
    public final void m68417j0(C42977is5 c42977is5, C27125p2 c27125p2) {
        SpannableString spannableString;
        Object firstOrNull;
        AbstractC44199kw1.InterfaceC25559b mo31009J = this.f53268a.mo31009J();
        C1577Df m68459D = m68459D(c42977is5.m31721t());
        SpannableString spannableString2 = null;
        if (m68459D != null) {
            spannableString = C25186kb.m28812b(m68459D, this.f53268a.mo30995b(), mo31009J);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) m68399s0(spannableString, 100000);
        List list = (List) C39420cs5.m44940a(c42977is5.m31721t(), C45349ms5.f98933a.m24795y());
        if (list != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            C1577Df c1577Df = (C1577Df) firstOrNull;
            if (c1577Df != null) {
                spannableString2 = C25186kb.m28812b(c1577Df, this.f53268a.mo30995b(), mo31009J);
            }
        }
        SpannableString spannableString4 = (SpannableString) m68399s0(spannableString2, 100000);
        if (spannableString3 == null) {
            spannableString3 = spannableString4;
        }
        c27125p2.m20112N0(spannableString3);
    }

    /* renamed from: k0 */
    public final void m68415k0() {
        C42977is5 c42977is5;
        List<C42977is5> mutableList;
        int lastIndex;
        this.f53288u.clear();
        this.f53289v.clear();
        C44163ks5 c44163ks5 = m68390z().get(-1);
        if (c44163ks5 != null) {
            c42977is5 = c44163ks5.m28250b();
        } else {
            c42977is5 = null;
        }
        Intrinsics.checkNotNull(c42977is5);
        boolean m68350h = C11409g.m68350h(c42977is5);
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) c42977is5.m31733h());
        List<C42977is5> m68409n0 = m68409n0(m68350h, mutableList);
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(m68409n0);
        int i = 1;
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int m31730k = m68409n0.get(i - 1).m31730k();
            int m31730k2 = m68409n0.get(i).m31730k();
            this.f53288u.put(Integer.valueOf(m31730k), Integer.valueOf(m31730k2));
            this.f53289v.put(Integer.valueOf(m31730k2), Integer.valueOf(m31730k));
            if (i != lastIndex) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public final void m68414l(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        C42977is5 m28250b;
        String str2;
        int i2;
        Boolean bool;
        C44163ks5 c44163ks5 = m68390z().get(Integer.valueOf(i));
        if (c44163ks5 != null && (m28250b = c44163ks5.m28250b()) != null) {
            String m68461B = m68461B(m28250b);
            if (Intrinsics.areEqual(str, this.f53290w)) {
                Integer num = this.f53288u.get(Integer.valueOf(i));
                if (num != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                }
            } else if (Intrinsics.areEqual(str, this.f53291x)) {
                Integer num2 = this.f53289v.get(Integer.valueOf(i));
                if (num2 != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                }
            } else {
                C38809bs5 m31721t = m28250b.m31721t();
                C38216as5 c38216as5 = C38216as5.f56452a;
                if (m31721t.m62260c(c38216as5.m65364g()) && bundle != null && Intrinsics.areEqual(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i4 > 0 && i3 >= 0) {
                        if (m68461B != null) {
                            i2 = m68461B.length();
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        if (i3 < i2) {
                            ArrayList arrayList = new ArrayList();
                            Function1 function1 = (Function1) ((C4297K1) m28250b.m31721t().m62258f(c38216as5.m65364g())).m99357a();
                            if (function1 != null) {
                                bool = (Boolean) function1.invoke(arrayList);
                            } else {
                                bool = null;
                            }
                            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                                C42484i26 c42484i26 = (C42484i26) arrayList.get(0);
                                ArrayList arrayList2 = new ArrayList();
                                for (int i5 = 0; i5 < i4; i5++) {
                                    int i6 = i3 + i5;
                                    if (i6 >= c42484i26.m34597k().m40259j().length()) {
                                        arrayList2.add(null);
                                    } else {
                                        arrayList2.add(m68405p0(m28250b, c42484i26.m34605c(i6)));
                                    }
                                }
                                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                                return;
                            }
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
                C38809bs5 m31721t2 = m28250b.m31721t();
                C45349ms5 c45349ms5 = C45349ms5.f98933a;
                if (m31721t2.m62260c(c45349ms5.m24796x()) && bundle != null && Intrinsics.areEqual(str, "androidx.compose.ui.semantics.testTag") && (str2 = (String) C39420cs5.m44940a(m28250b.m31721t(), c45349ms5.m24796x())) != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                }
            }
        }
    }

    /* renamed from: l0 */
    public final List<C42977is5> m68413l0(boolean z, List<C42977is5> list, Map<Integer, List<C42977is5>> map) {
        int lastIndex;
        Comparator compareBy;
        List<C42977is5> mutableListOf;
        List mutableListOf2;
        ArrayList arrayList = new ArrayList();
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                C42977is5 c42977is5 = list.get(i);
                if (i == 0 || !m68411m0(arrayList, c42977is5)) {
                    C35055Os4 m31734g = c42977is5.m31734g();
                    mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(c42977is5);
                    arrayList.add(new Pair(m31734g, mutableListOf2));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        compareBy = ComparisonsKt__ComparisonsKt.compareBy(C11408z.f53332g, C11382A.f53294g);
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, compareBy);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            CollectionsKt__MutableCollectionsJVMKt.sortWith((List) pair.getSecond(), m68441V(z));
            List list2 = (List) pair.getSecond();
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C42977is5 c42977is52 = (C42977is5) list2.get(i3);
                List<C42977is5> list3 = map.get(Integer.valueOf(c42977is52.m31730k()));
                if (list3 == null) {
                    mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c42977is52);
                    list3 = mutableListOf;
                }
                arrayList2.addAll(list3);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:35:0x008f, B:36:0x00a0, B:38:0x00a7, B:39:0x00b0, B:18:0x004d), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c3 -> B:14:0x0037). Please submit an issue!!! */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m68412m(Continuation<? super Unit> continuation) {
        C11392j c11392j;
        Object coroutine_suspended;
        int i;
        C11381f c11381f;
        C30704yo<Integer> c30704yo;
        InterfaceC34952Oh0<Unit> it;
        C30704yo<Integer> c30704yo2;
        Object mo31286a;
        try {
            if (continuation instanceof C11392j) {
                c11392j = (C11392j) continuation;
                int i2 = c11392j.f53314m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c11392j.f53314m = i2 - Integer.MIN_VALUE;
                    Object obj = c11392j.f53312k;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c11392j.f53314m;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                it = (InterfaceC34952Oh0) c11392j.f53311j;
                                c30704yo2 = (C30704yo) c11392j.f53310i;
                                c11381f = (C11381f) c11392j.f53309h;
                                ResultKt.throwOnFailure(obj);
                                c30704yo = c30704yo2;
                                c11392j.f53309h = c11381f;
                                c11392j.f53310i = c30704yo;
                                c11392j.f53311j = it;
                                c11392j.f53314m = 1;
                                mo31286a = it.mo31286a(c11392j);
                                if (mo31286a == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c30704yo2 = c30704yo;
                                obj = mo31286a;
                                if (!((Boolean) obj).booleanValue()) {
                                    it.next();
                                    if (c11381f.m68454I()) {
                                        int size = c11381f.f53282o.size();
                                        for (int i3 = 0; i3 < size; i3++) {
                                            C33829Jm2 m2571s = c11381f.f53282o.m2571s(i3);
                                            Intrinsics.checkNotNull(m2571s);
                                            c11381f.m68423g0(m2571s, c30704yo2);
                                        }
                                        c30704yo2.clear();
                                        if (!c11381f.f53264A) {
                                            c11381f.f53264A = true;
                                            c11381f.f53275h.post(c11381f.f53265B);
                                        }
                                    }
                                    c11381f.f53282o.clear();
                                    c11392j.f53309h = c11381f;
                                    c11392j.f53310i = c30704yo2;
                                    c11392j.f53311j = it;
                                    c11392j.f53314m = 2;
                                    if (C48120rZ0.m15768a(100L, c11392j) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    c30704yo = c30704yo2;
                                    c11392j.f53309h = c11381f;
                                    c11392j.f53310i = c30704yo;
                                    c11392j.f53311j = it;
                                    c11392j.f53314m = 1;
                                    mo31286a = it.mo31286a(c11392j);
                                    if (mo31286a == coroutine_suspended) {
                                    }
                                } else {
                                    c11381f.f53282o.clear();
                                    return Unit.INSTANCE;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            it = (InterfaceC34952Oh0) c11392j.f53311j;
                            c30704yo2 = (C30704yo) c11392j.f53310i;
                            c11381f = (C11381f) c11392j.f53309h;
                            ResultKt.throwOnFailure(obj);
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        try {
                            c30704yo = new C30704yo<>();
                            it = this.f53283p.iterator();
                            c11381f = this;
                            c11392j.f53309h = c11381f;
                            c11392j.f53310i = c30704yo;
                            c11392j.f53311j = it;
                            c11392j.f53314m = 1;
                            mo31286a = it.mo31286a(c11392j);
                            if (mo31286a == coroutine_suspended) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            c11381f = this;
                            c11381f.f53282o.clear();
                            throw th;
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        c11392j = new C11392j(continuation);
        Object obj2 = c11392j.f53312k;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c11392j.f53314m;
    }

    /* renamed from: n */
    public final boolean m68410n(boolean z, int i, long j) {
        return m68408o(m68390z().values(), z, i, j);
    }

    /* renamed from: n0 */
    public final List<C42977is5> m68409n0(boolean z, List<C42977is5> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m68407o0(arrayList, linkedHashMap, this, z, list.get(i));
        }
        return m68413l0(z, arrayList, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5 A[SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m68408o(Collection<C44163ks5> currentSemanticsNodes, boolean z, int i, long j) {
        C48314rs5<C35497Qp5> m24811i;
        C35497Qp5 c35497Qp5;
        int i2;
        boolean z2;
        Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
        if (C32120Ce3.m111947l(j, C32120Ce3.f4427b.m111933b()) || !C32120Ce3.m111941r(j)) {
            return false;
        }
        if (z) {
            m24811i = C45349ms5.f98933a.m24820B();
        } else if (!z) {
            m24811i = C45349ms5.f98933a.m24811i();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Collection<C44163ks5> collection = currentSemanticsNodes;
        if (collection.isEmpty()) {
            return false;
        }
        for (C44163ks5 c44163ks5 : collection) {
            if (C35757Rs4.m86251a(c44163ks5.m28251a()).m91265b(j) && (c35497Qp5 = (C35497Qp5) C39420cs5.m44940a(c44163ks5.m28250b().m31731j(), m24811i)) != null) {
                if (c35497Qp5.m87897b()) {
                    i2 = -i;
                } else {
                    i2 = i;
                }
                if (i == 0 && c35497Qp5.m87897b()) {
                    i2 = -1;
                }
                if (i2 >= 0 ? c35497Qp5.m87896c().invoke().floatValue() < c35497Qp5.m87898a().invoke().floatValue() : c35497Qp5.m87896c().invoke().floatValue() > 0.0f) {
                    z2 = true;
                    continue;
                    if (z2) {
                        return true;
                    }
                }
            }
            z2 = false;
            continue;
            if (z2) {
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void m68406p() {
        m68425f0(this.f53268a.m68612A0().m26718a(), this.f53293z);
        m68427e0(m68390z());
        m68395u0();
    }

    /* renamed from: p0 */
    public final RectF m68405p0(C42977is5 c42977is5, C35055Os4 c35055Os4) {
        C35055Os4 c35055Os42;
        if (c42977is5 == null) {
            return null;
        }
        C35055Os4 m91248s = c35055Os4.m91248s(c42977is5.m31725p());
        C35055Os4 m31735f = c42977is5.m31735f();
        if (m91248s.m91250q(m31735f)) {
            c35055Os42 = m91248s.m91251p(m31735f);
        } else {
            c35055Os42 = null;
        }
        if (c35055Os42 == null) {
            return null;
        }
        long mo68594S = this.f53268a.mo68594S(C33056Ge3.m104938a(c35055Os42.m91258i(), c35055Os42.m91255l()));
        long mo68594S2 = this.f53268a.mo68594S(C33056Ge3.m104938a(c35055Os42.m91257j(), c35055Os42.m91262e()));
        return new RectF(C32120Ce3.m111944o(mo68594S), C32120Ce3.m111943p(mo68594S), C32120Ce3.m111944o(mo68594S2), C32120Ce3.m111943p(mo68594S2));
    }

    /* renamed from: q */
    public final boolean m68404q(int i) {
        if (m68456G(i)) {
            this.f53277j = Integer.MIN_VALUE;
            this.f53268a.invalidate();
            m68435a0(this, i, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final AccessibilityEvent m68402r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f53268a.getContext().getPackageName());
        obtain.setSource(this.f53268a, i);
        C44163ks5 c44163ks5 = m68390z().get(Integer.valueOf(i));
        if (c44163ks5 != null) {
            obtain.setPassword(C11409g.m68351g(c44163ks5.m28250b()));
        }
        return obtain;
    }

    /* renamed from: r0 */
    public final boolean m68401r0(C42977is5 c42977is5, int i, boolean z, boolean z2) {
        boolean z3;
        InterfaceC6230P1 m68460C;
        int[] mo68471b;
        int i2;
        int i3;
        int i4;
        int m31730k = c42977is5.m31730k();
        Integer num = this.f53281n;
        if (num == null || m31730k != num.intValue()) {
            this.f53280m = -1;
            this.f53281n = Integer.valueOf(c42977is5.m31730k());
        }
        String m68461B = m68461B(c42977is5);
        if (m68461B != null && m68461B.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3 || (m68460C = m68460C(c42977is5, i)) == null) {
            return false;
        }
        int m68392x = m68392x(c42977is5);
        if (m68392x == -1) {
            if (z) {
                m68392x = 0;
            } else {
                m68392x = m68461B.length();
            }
        }
        if (z) {
            mo68471b = m68460C.mo68472a(m68392x);
        } else {
            mo68471b = m68460C.mo68471b(m68392x);
        }
        if (mo68471b == null) {
            return false;
        }
        int i5 = mo68471b[0];
        int i6 = mo68471b[1];
        if (z2 && m68455H(c42977is5)) {
            i2 = m68391y(c42977is5);
            if (i2 == -1) {
                if (z) {
                    i2 = i5;
                } else {
                    i2 = i6;
                }
            }
            if (z) {
                i3 = i6;
            } else {
                i3 = i5;
            }
        } else {
            if (z) {
                i2 = i6;
            } else {
                i2 = i5;
            }
            i3 = i2;
        }
        if (z) {
            i4 = 256;
        } else {
            i4 = 512;
        }
        this.f53285r = new C11389g(c42977is5, i4, i, i5, i6, SystemClock.uptimeMillis());
        m68421h0(c42977is5, i2, i3, true);
        return true;
    }

    /* renamed from: s */
    public final AccessibilityNodeInfo m68400s(int i) {
        AbstractC11719f.EnumC11724b enumC11724b;
        LifecycleOwner m68545a;
        AbstractC11719f lifecycle;
        AndroidComposeView.C11339b m68610C0 = this.f53268a.m68610C0();
        View view = null;
        if (m68610C0 != null && (m68545a = m68610C0.m68545a()) != null && (lifecycle = m68545a.getLifecycle()) != null) {
            enumC11724b = lifecycle.mo67007b();
        } else {
            enumC11724b = null;
        }
        if (enumC11724b == AbstractC11719f.EnumC11724b.DESTROYED) {
            return null;
        }
        C27125p2 m20105R = C27125p2.m20105R();
        Intrinsics.checkNotNullExpressionValue(m20105R, "obtain()");
        C44163ks5 c44163ks5 = m68390z().get(Integer.valueOf(i));
        if (c44163ks5 == null) {
            return null;
        }
        C42977is5 m28250b = c44163ks5.m28250b();
        int i2 = -1;
        if (i == -1) {
            ViewParent m62536J = C38790bq6.m62536J(this.f53268a);
            if (m62536J instanceof View) {
                view = (View) m62536J;
            }
            m20105R.m20136B0(view);
        } else if (m28250b.m31726o() != null) {
            C42977is5 m31726o = m28250b.m31726o();
            Intrinsics.checkNotNull(m31726o);
            int m31730k = m31726o.m31730k();
            if (m31730k != this.f53268a.m68612A0().m26718a().m31730k()) {
                i2 = m31730k;
            }
            m20105R.m20134C0(this.f53268a, i2);
        } else {
            throw new IllegalStateException("semanticsNode " + i + " has null parent");
        }
        m20105R.m20116L0(this.f53268a, i);
        Rect m28251a = c44163ks5.m28251a();
        long mo68594S = this.f53268a.mo68594S(C33056Ge3.m104938a(m28251a.left, m28251a.top));
        long mo68594S2 = this.f53268a.mo68594S(C33056Ge3.m104938a(m28251a.right, m28251a.bottom));
        m20105R.m20088b0(new Rect((int) Math.floor(C32120Ce3.m111944o(mo68594S)), (int) Math.floor(C32120Ce3.m111943p(mo68594S)), (int) Math.ceil(C32120Ce3.m111944o(mo68594S2)), (int) Math.ceil(C32120Ce3.m111943p(mo68594S2))));
        m68446Q(i, m20105R, m28250b);
        return m20105R.m20098U0();
    }

    /* renamed from: s0 */
    public final <T extends CharSequence> T m68399s0(T t, int i) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (t != null && t.length() != 0) {
                z2 = false;
            }
            if (!z2 && t.length() > i) {
                int i2 = i - 1;
                if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
                    i = i2;
                }
                T t2 = (T) t.subSequence(0, i);
                Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return t2;
            }
            return t;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: t */
    public final AccessibilityEvent m68398t(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent m68402r = m68402r(i, 8192);
        if (num != null) {
            m68402r.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            m68402r.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            m68402r.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            m68402r.getText().add(charSequence);
        }
        return m68402r;
    }

    /* renamed from: t0 */
    public final void m68397t0(int i) {
        int i2 = this.f53269b;
        if (i2 == i) {
            return;
        }
        this.f53269b = i;
        m68435a0(this, i, 128, null, null, 12, null);
        m68435a0(this, i2, 256, null, null, 12, null);
    }

    /* renamed from: u */
    public final boolean m68396u(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!m68453J()) {
            return false;
        }
        int action = event.getAction();
        if (action != 7 && action != 9) {
            if (action != 10) {
                return false;
            }
            if (this.f53269b != Integer.MIN_VALUE) {
                m68397t0(Integer.MIN_VALUE);
                return true;
            }
            return this.f53268a.m68553u0().dispatchGenericMotionEvent(event);
        }
        int m68457F = m68457F(event.getX(), event.getY());
        boolean dispatchGenericMotionEvent = this.f53268a.m68553u0().dispatchGenericMotionEvent(event);
        m68397t0(m68457F);
        if (m68457F != Integer.MIN_VALUE) {
            return true;
        }
        return dispatchGenericMotionEvent;
    }

    /* renamed from: u0 */
    public final void m68395u0() {
        C42977is5 c42977is5;
        C38809bs5 m68377c;
        C30704yo<? extends Integer> c30704yo = new C30704yo<>();
        Iterator<Integer> it = this.f53287t.iterator();
        while (it.hasNext()) {
            Integer id = it.next();
            C44163ks5 c44163ks5 = m68390z().get(id);
            String str = null;
            if (c44163ks5 != null) {
                c42977is5 = c44163ks5.m28250b();
            } else {
                c42977is5 = null;
            }
            if (c42977is5 == null || !C11409g.m68352f(c42977is5)) {
                c30704yo.add(id);
                Intrinsics.checkNotNullExpressionValue(id, "id");
                int intValue = id.intValue();
                C11390h c11390h = this.f53292y.get(id);
                if (c11390h != null && (m68377c = c11390h.m68377c()) != null) {
                    str = (String) C39420cs5.m44940a(m68377c, C45349ms5.f98933a.m24803q());
                }
                m68433b0(intValue, 32, str);
            }
        }
        this.f53287t.m2573j(c30704yo);
        this.f53292y.clear();
        for (Map.Entry<Integer, C44163ks5> entry : m68390z().entrySet()) {
            if (C11409g.m68352f(entry.getValue().m28250b()) && this.f53287t.add(entry.getKey())) {
                m68433b0(entry.getKey().intValue(), 16, (String) entry.getValue().m28250b().m31721t().m62258f(C45349ms5.f98933a.m24803q()));
            }
            this.f53292y.put(entry.getKey(), new C11390h(entry.getValue().m28250b(), m68390z()));
        }
        this.f53293z = new C11390h(this.f53268a.m68612A0().m26718a(), m68390z());
    }

    /* renamed from: w */
    public final AccessibilityManager m68393w() {
        return this.f53270c;
    }

    /* renamed from: x */
    public final int m68392x(C42977is5 c42977is5) {
        C38809bs5 m31721t = c42977is5.m31721t();
        C45349ms5 c45349ms5 = C45349ms5.f98933a;
        if (!m31721t.m62260c(c45349ms5.m24817c()) && c42977is5.m31721t().m62260c(c45349ms5.m24794z())) {
            return C48413s26.m14837i(((C48413s26) c42977is5.m31721t().m62258f(c45349ms5.m24794z())).m14828r());
        }
        return this.f53280m;
    }

    /* renamed from: y */
    public final int m68391y(C42977is5 c42977is5) {
        C38809bs5 m31721t = c42977is5.m31721t();
        C45349ms5 c45349ms5 = C45349ms5.f98933a;
        if (!m31721t.m62260c(c45349ms5.m24817c()) && c42977is5.m31721t().m62260c(c45349ms5.m24794z())) {
            return C48413s26.m14832n(((C48413s26) c42977is5.m31721t().m62258f(c45349ms5.m24794z())).m14828r());
        }
        return this.f53280m;
    }

    /* renamed from: z */
    public final Map<Integer, C44163ks5> m68390z() {
        if (this.f53284q) {
            this.f53284q = false;
            this.f53286s = C11409g.m68340r(this.f53268a.m68612A0());
            m68415k0();
        }
        return this.f53286s;
    }
}
