package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import androidx.navigation.NavBackStackEntryState;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import net.danlew.android.joda.DateUtils;
import p000.AY2;
import p000.AbstractC39507d13;
import p000.EY2;
import p000.GY2;
import p000.HY2;
import p000.TY2;
@Metadata(m28433d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u0000 \u0089\u00012\u00020\u0001:\u0003cimB\u0011\u0012\u0006\u0010g\u001a\u00020b¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J[\u0010\u0014\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\u000fH\u0002JI\u0010\u0018\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00050\u000fH\u0002J$\u0010\u001c\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0003J*\u0010 \u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u0012\u0010!\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0003J\b\u0010\"\u001a\u00020\u0016H\u0002J\u0012\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#H\u0003J\u0012\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020&H\u0002J\u0018\u0010*\u001a\u0004\u0018\u00010\b*\u00020\b2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0002J.\u0010-\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010#2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003J.\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010#2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002J2\u00104\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010#2\u0006\u0010\u0012\u001a\u00020\u00022\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002J\b\u00105\u001a\u00020\u0005H\u0002J\u0019\u00106\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b6\u00107J\b\u00108\u001a\u00020\u0016H\u0017J\u001a\u00109\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0017J\"\u0010:\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J%\u0010=\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050;H\u0000¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0005H\u0000¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0000¢\u0006\u0004\bA\u0010BJ\u001a\u0010E\u001a\u00020\u00052\u0006\u0010D\u001a\u00020C2\b\u0010$\u001a\u0004\u0018\u00010#H\u0017J\u0012\u0010H\u001a\u00020\u00162\b\u0010G\u001a\u0004\u0018\u00010FH\u0017J\u0014\u0010I\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0007J$\u0010L\u001a\u00020\u00052\u0006\u0010K\u001a\u00020J2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J'\u0010Q\u001a\u00020\u00052\u0006\u0010M\u001a\u00020(2\u0017\u0010P\u001a\u0013\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\bOJ(\u0010R\u001a\u00020\u00052\u0006\u0010M\u001a\u00020(2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\n\u0010S\u001a\u0004\u0018\u00010#H\u0017J\u0012\u0010U\u001a\u00020\u00052\b\u0010T\u001a\u0004\u0018\u00010#H\u0017J\u0010\u0010X\u001a\u00020\u00052\u0006\u0010W\u001a\u00020VH\u0017J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020YH\u0017J\u0010\u0010]\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020\u0016H\u0017J\u0010\u0010`\u001a\u00020\u00052\u0006\u0010_\u001a\u00020^H\u0017J\u0012\u0010a\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0016R\u0017\u0010g\u001a\u00020b8\u0007¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010u\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u001e\u0010z\u001a\n\u0012\u0004\u0012\u00020w\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010|\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010 R\"\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8WX\u0096\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R$\u0010\u0085\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R)\u0010\u008b\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0086\u00018\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R$\u0010\u008f\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R%\u0010\u0092\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u0090\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008e\u0001R&\u0010\u0094\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010(0\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008e\u0001R)\u0010\u0095\u0001\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u008c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010\u008e\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001a\u0010\u009a\u0001\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010\u0099\u0001R\u001b\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u009c\u0001R\u001e\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030\u009f\u00010\u009e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b]\u0010 \u0001R)\u0010¨\u0001\u001a\u00030¢\u00018@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bI\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010«\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010ª\u0001R\u0017\u0010®\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u00ad\u0001R\u0017\u0010¯\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010 R\u0019\u0010²\u0001\u001a\u00030°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\ba\u0010±\u0001R0\u0010´\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\t\u0012\u00070³\u0001R\u00020\u00000\u008c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\be\u0010\u008e\u0001R6\u0010·\u0001\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R6\u0010¹\u0001\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¶\u0001R$\u0010»\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010\u008e\u0001R\u0018\u0010½\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u00101R\u001e\u0010Á\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R \u0010Å\u0001\u001a\u00020l8VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001e\u0010É\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R#\u0010Î\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Ê\u00018\u0006¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\b¸\u0001\u0010Í\u0001R\u0017\u0010Ð\u0001\u001a\u00020\u00198BX\u0082\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010Ï\u0001R(\u0010D\u001a\u00020C2\u0006\u0010D\u001a\u00020C8W@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b¿\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R,\u0010Ô\u0001\u001a\u00030°\u00012\b\u0010Ô\u0001\u001a\u00030°\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÇ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R\u0019\u0010Ù\u0001\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010Ø\u0001R\u0019\u0010Û\u0001\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010Ú\u0001R\u0019\u0010Ü\u0001\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ú\u0001¨\u0006ß\u0001"}, m28432d2 = {"LDY2;", "", "LAY2;", "child", "parent", "", "K", "Ld13;", "LHY2;", "", "entries", "LTY2;", "navOptions", "Ld13$a;", "navigatorExtras", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "backStackEntry", "handler", "Q", "popUpTo", "", "saveState", "W", "", "destinationId", "inclusive", "X", "Lkotlin/collections/ArrayDeque;", "Landroidx/navigation/NavBackStackEntryState;", "savedState", "Z", "p", "q", "Landroid/os/Bundle;", "startDestinationArgs", "R", "", "deepLink", "", "u", "t", "node", "args", "M", "id", "d0", "backStackState", "I", "finalArgs", "restoredEntries", "n", "m0", "k0", "(LAY2;)LAY2;", "S", "T", "U", "Lkotlin/Function0;", "onComplete", "V", "(LAY2;Lkotlin/jvm/functions/Function0;)V", "l0", "()V", "b0", "()Ljava/util/List;", "LJY2;", "graph", "g0", "Landroid/content/Intent;", "intent", "H", "s", "LGY2;", "request", "L", "route", "LUY2;", "Lkotlin/ExtensionFunctionType;", "builder", "O", "N", "e0", "navState", "c0", "LLifecycleOwner;", "owner", "h0", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "i0", "enabled", "r", "LWr6;", "viewModelStore", "j0", "w", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", "x", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "activity", "LSY2;", "c", "LSY2;", "inflater", DateTokenConverter.CONVERTER_KEY, "LJY2;", "_graph", "e", "Landroid/os/Bundle;", "navigatorStateToRestore", "", "Landroid/os/Parcelable;", "f", "[Landroid/os/Parcelable;", "backStackToRestore", "g", "deepLinkHandled", "h", "Lkotlin/collections/ArrayDeque;", "v", "()Lkotlin/collections/ArrayDeque;", "backQueue", "LGX2;", "i", "LGX2;", "_visibleEntries", "LtP5;", "j", "LtP5;", "G", "()LtP5;", "visibleEntries", "", "k", "Ljava/util/Map;", "childToParentEntries", "Ljava/util/concurrent/atomic/AtomicInteger;", "l", "parentToChildCount", "m", "backStackMap", "backStackStates", "o", "LLifecycleOwner;", "lifecycleOwner", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "LEY2;", "LEY2;", "viewModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "LDY2$c;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Landroidx/lifecycle/f$b;", "Landroidx/lifecycle/f$b;", "D", "()Landroidx/lifecycle/f$b;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/f$b;)V", "hostLifecycleState", "LFq2;", "LFq2;", "lifecycleObserver", "LVe3;", "LVe3;", "onBackPressedCallback", "enableOnBackPressedCallback", "Li13;", "Li13;", "_navigatorProvider", "LDY2$b;", "navigatorState", "y", "Lkotlin/jvm/functions/Function1;", "addToBackStackHandler", "z", "popFromBackStackHandler", "A", "entrySavedState", "B", "dispatchReentrantCount", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Ljava/util/List;", "backStackEntriesToDispatch", "Lkotlin/Lazy;", "getNavInflater", "()LSY2;", "navInflater", "LBX2;", "E", "LBX2;", "_currentBackStackEntryFlow", "LEu1;", "F", "LEu1;", "()LEu1;", "currentBackStackEntryFlow", "()I", "destinationCountOnBackStack", "()LJY2;", "f0", "(LJY2;)V", "navigatorProvider", "()Li13;", "setNavigatorProvider", "(Li13;)V", "()LHY2;", "currentDestination", "()LAY2;", "currentBackStackEntry", "previousBackStackEntry", "<init>", "(Landroid/content/Context;)V", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: DY2 */
/* loaded from: classes.dex */
public class DY2 {

    /* renamed from: G */
    public static final C1521a f5878G = new C1521a(null);

    /* renamed from: H */
    public static boolean f5879H = true;

    /* renamed from: A */
    public final Map<AY2, Boolean> f5880A;

    /* renamed from: B */
    public int f5881B;

    /* renamed from: C */
    public final List<AY2> f5882C;

    /* renamed from: D */
    public final Lazy f5883D;

    /* renamed from: E */
    public final BX2<AY2> f5884E;

    /* renamed from: F */
    public final InterfaceC32730Eu1<AY2> f5885F;

    /* renamed from: a */
    public final Context f5886a;

    /* renamed from: b */
    public Activity f5887b;

    /* renamed from: c */
    public SY2 f5888c;

    /* renamed from: d */
    public JY2 f5889d;

    /* renamed from: e */
    public Bundle f5890e;

    /* renamed from: f */
    public Parcelable[] f5891f;

    /* renamed from: g */
    public boolean f5892g;

    /* renamed from: h */
    public final ArrayDeque<AY2> f5893h;

    /* renamed from: i */
    public final GX2<List<AY2>> f5894i;

    /* renamed from: j */
    public final InterfaceC49220tP5<List<AY2>> f5895j;

    /* renamed from: k */
    public final Map<AY2, AY2> f5896k;

    /* renamed from: l */
    public final Map<AY2, AtomicInteger> f5897l;

    /* renamed from: m */
    public final Map<Integer, String> f5898m;

    /* renamed from: n */
    public final Map<String, ArrayDeque<NavBackStackEntryState>> f5899n;

    /* renamed from: o */
    public LifecycleOwner f5900o;

    /* renamed from: p */
    public OnBackPressedDispatcher f5901p;

    /* renamed from: q */
    public EY2 f5902q;

    /* renamed from: r */
    public final CopyOnWriteArrayList<InterfaceC1524c> f5903r;

    /* renamed from: s */
    public AbstractC11719f.EnumC11724b f5904s;

    /* renamed from: t */
    public final InterfaceC32929Fq2 f5905t;

    /* renamed from: u */
    public final AbstractC36566Ve3 f5906u;

    /* renamed from: v */
    public boolean f5907v;

    /* renamed from: w */
    public C42471i13 f5908w;

    /* renamed from: x */
    public final Map<AbstractC39507d13<? extends HY2>, C1522b> f5909x;

    /* renamed from: y */
    public Function1<? super AY2, Unit> f5910y;

    /* renamed from: z */
    public Function1<? super AY2, Unit> f5911z;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\n\u0010\u0004\u0012\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28432d2 = {"LDY2$a;", "", "", "KEY_BACK_STACK", "Ljava/lang/String;", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_EXTRAS", "getKEY_DEEP_LINK_EXTRAS$annotations", "()V", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "", "deepLinkSaveState", "Z", "<init>", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: DY2$a */
    /* loaded from: classes.dex */
    public static final class C1521a {
        public /* synthetic */ C1521a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1521a() {
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u001f\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00138\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LDY2$b;", "Lj13;", "LAY2;", "backStackEntry", "", "i", "m", "LHY2;", "destination", "Landroid/os/Bundle;", "arguments", C17296a.f69688o, "popUpTo", "", "saveState", "g", "h", "entry", "e", "Ld13;", "Ld13;", "getNavigator", "()Ld13;", "navigator", "<init>", "(LDY2;Ld13;)V", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: DY2$b */
    /* loaded from: classes.dex */
    public final class C1522b extends AbstractC43064j13 {

        /* renamed from: g */
        public final AbstractC39507d13<? extends HY2> f5912g;

        /* renamed from: h */
        public final /* synthetic */ DY2 f5913h;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: DY2$b$a */
        /* loaded from: classes.dex */
        public static final class C1523a extends Lambda implements Function0<Unit> {

            /* renamed from: h */
            public final /* synthetic */ AY2 f5915h;

            /* renamed from: i */
            public final /* synthetic */ boolean f5916i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1523a(AY2 ay2, boolean z) {
                super(0);
                this.f5915h = ay2;
                this.f5916i = z;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C1522b.super.mo31245g(this.f5915h, this.f5916i);
            }
        }

        public C1522b(DY2 dy2, AbstractC39507d13<? extends HY2> navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.f5913h = dy2;
            this.f5912g = navigator;
        }

        @Override // p000.AbstractC43064j13
        /* renamed from: a */
        public AY2 mo31251a(HY2 destination, Bundle bundle) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return AY2.C0146a.m115572b(AY2.f752o, this.f5913h.m110203x(), destination, bundle, this.f5913h.m110258D(), this.f5913h.f5902q, null, null, 96, null);
        }

        @Override // p000.AbstractC43064j13
        /* renamed from: e */
        public void mo31247e(AY2 entry) {
            EY2 ey2;
            Intrinsics.checkNotNullParameter(entry, "entry");
            boolean areEqual = Intrinsics.areEqual(this.f5913h.f5880A.get(entry), Boolean.TRUE);
            super.mo31247e(entry);
            this.f5913h.f5880A.remove(entry);
            if (!this.f5913h.m110205v().contains(entry)) {
                this.f5913h.m110217k0(entry);
                if (entry.getLifecycle().mo67007b().m67013b(AbstractC11719f.EnumC11724b.CREATED)) {
                    entry.m115575m(AbstractC11719f.EnumC11724b.DESTROYED);
                }
                ArrayDeque<AY2> m110205v = this.f5913h.m110205v();
                boolean z = true;
                if (!(m110205v instanceof Collection) || !m110205v.isEmpty()) {
                    Iterator<AY2> it = m110205v.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.areEqual(it.next().m115581g(), entry.m115581g())) {
                            z = false;
                            break;
                        }
                    }
                }
                if (z && !areEqual && (ey2 = this.f5913h.f5902q) != null) {
                    ey2.m108836f(entry.m115581g());
                }
                this.f5913h.m110215l0();
                this.f5913h.f5894i.mo10357b(this.f5913h.m110232b0());
            } else if (!m31248d()) {
                this.f5913h.m110215l0();
                this.f5913h.f5894i.mo10357b(this.f5913h.m110232b0());
            }
        }

        @Override // p000.AbstractC43064j13
        /* renamed from: g */
        public void mo31245g(AY2 popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            AbstractC39507d13 m35381e = this.f5913h.f5908w.m35381e(popUpTo.m115582f().m103773u());
            if (Intrinsics.areEqual(m35381e, this.f5912g)) {
                Function1 function1 = this.f5913h.f5911z;
                if (function1 != null) {
                    function1.invoke(popUpTo);
                    super.mo31245g(popUpTo, z);
                    return;
                }
                this.f5913h.m110240V(popUpTo, new C1523a(popUpTo, z));
                return;
            }
            Object obj = this.f5913h.f5909x.get(m35381e);
            Intrinsics.checkNotNull(obj);
            ((C1522b) obj).mo31245g(popUpTo, z);
        }

        @Override // p000.AbstractC43064j13
        /* renamed from: h */
        public void mo31244h(AY2 popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.mo31244h(popUpTo, z);
            this.f5913h.f5880A.put(popUpTo, Boolean.valueOf(z));
        }

        @Override // p000.AbstractC43064j13
        /* renamed from: i */
        public void mo31243i(AY2 backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            AbstractC39507d13 m35381e = this.f5913h.f5908w.m35381e(backStackEntry.m115582f().m103773u());
            if (Intrinsics.areEqual(m35381e, this.f5912g)) {
                Function1 function1 = this.f5913h.f5910y;
                if (function1 != null) {
                    function1.invoke(backStackEntry);
                    m110199m(backStackEntry);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + backStackEntry.m115582f() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f5913h.f5909x.get(m35381e);
            if (obj != null) {
                ((C1522b) obj).mo31243i(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.m115582f().m103773u() + " should already be created").toString());
        }

        /* renamed from: m */
        public final void m110199m(AY2 backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.mo31243i(backStackEntry);
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\n"}, m28432d2 = {"LDY2$c;", "", "LDY2;", "controller", "LHY2;", "destination", "Landroid/os/Bundle;", "arguments", "", C17296a.f69688o, "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: DY2$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1524c {
        /* renamed from: a */
        void m110198a(DY2 dy2, HY2 hy2, Bundle bundle);
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/content/Context;", "it", C17296a.f69688o, "(Landroid/content/Context;)Landroid/content/Context;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: DY2$d */
    /* loaded from: classes.dex */
    public static final class C1525d extends Lambda implements Function1<Context, Context> {

        /* renamed from: g */
        public static final C1525d f5917g = new C1525d();

        public C1525d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Context invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LUY2;", "", "invoke", "(LUY2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: DY2$e */
    /* loaded from: classes.dex */
    public static final class C1526e extends Lambda implements Function1<UY2, Unit> {

        /* renamed from: g */
        public final /* synthetic */ HY2 f5918g;

        /* renamed from: h */
        public final /* synthetic */ DY2 f5919h;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lme;", "", C17296a.f69688o, "(Lme;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: DY2$e$a */
        /* loaded from: classes.dex */
        public static final class C1527a extends Lambda implements Function1<C26143me, Unit> {

            /* renamed from: g */
            public static final C1527a f5920g = new C1527a();

            public C1527a() {
                super(1);
            }

            /* renamed from: a */
            public final void m110196a(C26143me anim) {
                Intrinsics.checkNotNullParameter(anim, "$this$anim");
                anim.m25290e(0);
                anim.m25289f(0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C26143me c26143me) {
                m110196a(c26143me);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LlY3;", "", "invoke", "(LlY3;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: DY2$e$b */
        /* loaded from: classes.dex */
        public static final class C1528b extends Lambda implements Function1<C44556lY3, Unit> {

            /* renamed from: g */
            public static final C1528b f5921g = new C1528b();

            public C1528b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C44556lY3 c44556lY3) {
                invoke2(c44556lY3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(C44556lY3 popUpTo) {
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.m27163d(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1526e(HY2 hy2, DY2 dy2) {
            super(1);
            this.f5918g = hy2;
            this.f5919h = dy2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UY2 uy2) {
            invoke2(uy2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(UY2 navOptions) {
            boolean z;
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.m81364a(C1527a.f5920g);
            HY2 hy2 = this.f5918g;
            boolean z2 = false;
            if (hy2 instanceof JY2) {
                Sequence<HY2> m103766c = HY2.f13508k.m103766c(hy2);
                DY2 dy2 = this.f5919h;
                Iterator<HY2> it = m103766c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    HY2 next = it.next();
                    HY2 m110261A = dy2.m110261A();
                    if (Intrinsics.areEqual(next, m110261A != null ? m110261A.m103772v() : null)) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    z2 = true;
                }
            }
            if (z2 && DY2.f5879H) {
                navOptions.m81362c(JY2.f17777q.m100245a(this.f5919h.m110259C()).m103774s(), C1528b.f5921g);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LSY2;", "b", "()LSY2;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: DY2$f */
    /* loaded from: classes.dex */
    public static final class C1529f extends Lambda implements Function0<SY2> {
        public C1529f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final SY2 invoke() {
            SY2 sy2 = DY2.this.f5888c;
            return sy2 == null ? new SY2(DY2.this.m110203x(), DY2.this.f5908w) : sy2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LAY2;", "it", "", C17296a.f69688o, "(LAY2;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: DY2$g */
    /* loaded from: classes.dex */
    public static final class C1530g extends Lambda implements Function1<AY2, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.BooleanRef f5923g;

        /* renamed from: h */
        public final /* synthetic */ DY2 f5924h;

        /* renamed from: i */
        public final /* synthetic */ HY2 f5925i;

        /* renamed from: j */
        public final /* synthetic */ Bundle f5926j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1530g(Ref.BooleanRef booleanRef, DY2 dy2, HY2 hy2, Bundle bundle) {
            super(1);
            this.f5923g = booleanRef;
            this.f5924h = dy2;
            this.f5925i = hy2;
            this.f5926j = bundle;
        }

        /* renamed from: a */
        public final void m110194a(AY2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f5923g.element = true;
            DY2.m110211o(this.f5924h, this.f5925i, this.f5926j, it, null, 8, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2) {
            m110194a(ay2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"DY2$h", "LVe3;", "", "handleOnBackPressed", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: DY2$h */
    /* loaded from: classes.dex */
    public static final class C1531h extends AbstractC36566Ve3 {
        public C1531h() {
            super(false);
        }

        @Override // p000.AbstractC36566Ve3
        public void handleOnBackPressed() {
            DY2.this.m110243S();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LAY2;", "entry", "", C17296a.f69688o, "(LAY2;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: DY2$i */
    /* loaded from: classes.dex */
    public static final class C1532i extends Lambda implements Function1<AY2, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.BooleanRef f5928g;

        /* renamed from: h */
        public final /* synthetic */ Ref.BooleanRef f5929h;

        /* renamed from: i */
        public final /* synthetic */ DY2 f5930i;

        /* renamed from: j */
        public final /* synthetic */ boolean f5931j;

        /* renamed from: k */
        public final /* synthetic */ ArrayDeque<NavBackStackEntryState> f5932k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1532i(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, DY2 dy2, boolean z, ArrayDeque<NavBackStackEntryState> arrayDeque) {
            super(1);
            this.f5928g = booleanRef;
            this.f5929h = booleanRef2;
            this.f5930i = dy2;
            this.f5931j = z;
            this.f5932k = arrayDeque;
        }

        /* renamed from: a */
        public final void m110193a(AY2 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f5928g.element = true;
            this.f5929h.element = true;
            this.f5930i.m110236Z(entry, this.f5931j, this.f5932k);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2) {
            m110193a(ay2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHY2;", "destination", C17296a.f69688o, "(LHY2;)LHY2;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: DY2$j */
    /* loaded from: classes.dex */
    public static final class C1533j extends Lambda implements Function1<HY2, HY2> {

        /* renamed from: g */
        public static final C1533j f5933g = new C1533j();

        public C1533j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final HY2 invoke(HY2 destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            JY2 m103772v = destination.m103772v();
            boolean z = false;
            if (m103772v != null && m103772v.m100253N() == destination.m103774s()) {
                z = true;
            }
            if (z) {
                return destination.m103772v();
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LHY2;", "destination", "", C17296a.f69688o, "(LHY2;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: DY2$k */
    /* loaded from: classes.dex */
    public static final class C1534k extends Lambda implements Function1<HY2, Boolean> {
        public C1534k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(HY2 destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return Boolean.valueOf(!DY2.this.f5898m.containsKey(Integer.valueOf(destination.m103774s())));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHY2;", "destination", C17296a.f69688o, "(LHY2;)LHY2;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: DY2$l */
    /* loaded from: classes.dex */
    public static final class C1535l extends Lambda implements Function1<HY2, HY2> {

        /* renamed from: g */
        public static final C1535l f5935g = new C1535l();

        public C1535l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final HY2 invoke(HY2 destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            JY2 m103772v = destination.m103772v();
            boolean z = false;
            if (m103772v != null && m103772v.m100253N() == destination.m103774s()) {
                z = true;
            }
            if (z) {
                return destination.m103772v();
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LHY2;", "destination", "", C17296a.f69688o, "(LHY2;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: DY2$m */
    /* loaded from: classes.dex */
    public static final class C1536m extends Lambda implements Function1<HY2, Boolean> {
        public C1536m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(HY2 destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return Boolean.valueOf(!DY2.this.f5898m.containsKey(Integer.valueOf(destination.m103774s())));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: DY2$n */
    /* loaded from: classes.dex */
    public static final class C1537n extends Lambda implements Function1<String, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ String f5937g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1537n(String str) {
            super(1);
            this.f5937g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Intrinsics.areEqual(str, this.f5937g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LAY2;", "entry", "", C17296a.f69688o, "(LAY2;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: DY2$o */
    /* loaded from: classes.dex */
    public static final class C1538o extends Lambda implements Function1<AY2, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.BooleanRef f5938g;

        /* renamed from: h */
        public final /* synthetic */ List<AY2> f5939h;

        /* renamed from: i */
        public final /* synthetic */ Ref.IntRef f5940i;

        /* renamed from: j */
        public final /* synthetic */ DY2 f5941j;

        /* renamed from: k */
        public final /* synthetic */ Bundle f5942k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1538o(Ref.BooleanRef booleanRef, List<AY2> list, Ref.IntRef intRef, DY2 dy2, Bundle bundle) {
            super(1);
            this.f5938g = booleanRef;
            this.f5939h = list;
            this.f5940i = intRef;
            this.f5941j = dy2;
            this.f5942k = bundle;
        }

        /* renamed from: a */
        public final void m110188a(AY2 entry) {
            List<AY2> emptyList;
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f5938g.element = true;
            int indexOf = this.f5939h.indexOf(entry);
            if (indexOf != -1) {
                int i = indexOf + 1;
                emptyList = this.f5939h.subList(this.f5940i.element, i);
                this.f5940i.element = i;
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            this.f5941j.m110212n(entry.m115582f(), this.f5942k, entry, emptyList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2) {
            m110188a(ay2);
            return Unit.INSTANCE;
        }
    }

    public DY2(Context context) {
        Sequence generateSequence;
        Object obj;
        List emptyList;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5886a = context;
        generateSequence = SequencesKt__SequencesKt.generateSequence(context, C1525d.f5917g);
        Iterator it = generateSequence.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f5887b = (Activity) obj;
        this.f5893h = new ArrayDeque<>();
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        GX2<List<AY2>> m8742a = C50405vP5.m8742a(emptyList);
        this.f5894i = m8742a;
        this.f5895j = C36708Vu1.m79269b(m8742a);
        this.f5896k = new LinkedHashMap();
        this.f5897l = new LinkedHashMap();
        this.f5898m = new LinkedHashMap();
        this.f5899n = new LinkedHashMap();
        this.f5903r = new CopyOnWriteArrayList<>();
        this.f5904s = AbstractC11719f.EnumC11724b.INITIALIZED;
        this.f5905t = new InterfaceC11728i() { // from class: CY2
            @Override // androidx.lifecycle.InterfaceC11728i
            public final void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
                DY2.m110252J(DY2.this, lifecycleOwner, enumC11720a);
            }
        };
        this.f5906u = new C1531h();
        this.f5907v = true;
        this.f5908w = new C42471i13();
        this.f5909x = new LinkedHashMap();
        this.f5880A = new LinkedHashMap();
        C42471i13 c42471i13 = this.f5908w;
        c42471i13.m35384b(new NY2(c42471i13));
        this.f5908w.m35384b(new C26807o4(this.f5886a));
        this.f5882C = new ArrayList();
        lazy = LazyKt__LazyJVMKt.lazy(new C1529f());
        this.f5883D = lazy;
        BX2<AY2> m79031b = C36748Vy5.m79031b(1, 0, EnumC43674k30.DROP_OLDEST, 2, null);
        this.f5884E = m79031b;
        this.f5885F = C36708Vu1.m79270a(m79031b);
    }

    /* renamed from: J */
    public static final void m110252J(DY2 this$0, LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        AbstractC11719f.EnumC11724b m67019c = event.m67019c();
        Intrinsics.checkNotNullExpressionValue(m67019c, "event.targetState");
        this$0.f5904s = m67019c;
        if (this$0.f5889d != null) {
            Iterator<AY2> it = this$0.m110205v().iterator();
            while (it.hasNext()) {
                it.next().m115578j(event);
            }
        }
    }

    /* renamed from: P */
    public static /* synthetic */ void m110246P(DY2 dy2, String str, TY2 ty2, AbstractC39507d13.InterfaceC19660a interfaceC19660a, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i & 2) != 0) {
            ty2 = null;
        }
        if ((i & 4) != 0) {
            interfaceC19660a = null;
        }
        dy2.m110248N(str, ty2, interfaceC19660a);
    }

    /* renamed from: Y */
    public static /* synthetic */ boolean m110237Y(DY2 dy2, int i, boolean z, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return dy2.m110238X(i, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a0 */
    public static /* synthetic */ void m110234a0(DY2 dy2, AY2 ay2, boolean z, ArrayDeque arrayDeque, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                arrayDeque = new ArrayDeque();
            }
            dy2.m110236Z(ay2, z, arrayDeque);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static /* synthetic */ void m110211o(DY2 dy2, HY2 hy2, Bundle bundle, AY2 ay2, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            dy2.m110212n(hy2, bundle, ay2, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    /* renamed from: A */
    public HY2 m110261A() {
        AY2 m110202y = m110202y();
        if (m110202y != null) {
            return m110202y.m115582f();
        }
        return null;
    }

    /* renamed from: B */
    public final int m110260B() {
        ArrayDeque<AY2> m110205v = m110205v();
        int i = 0;
        if (!(m110205v instanceof Collection) || !m110205v.isEmpty()) {
            for (AY2 ay2 : m110205v) {
                if ((!(ay2.m115582f() instanceof JY2)) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i;
    }

    /* renamed from: C */
    public JY2 m110259C() {
        JY2 jy2 = this.f5889d;
        if (jy2 != null) {
            if (jy2 != null) {
                return jy2;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    /* renamed from: D */
    public final AbstractC11719f.EnumC11724b m110258D() {
        if (this.f5900o == null) {
            return AbstractC11719f.EnumC11724b.CREATED;
        }
        return this.f5904s;
    }

    /* renamed from: E */
    public C42471i13 m110257E() {
        return this.f5908w;
    }

    /* renamed from: F */
    public AY2 m110256F() {
        List reversed;
        Sequence asSequence;
        Object obj;
        reversed = CollectionsKt___CollectionsKt.reversed(m110205v());
        Iterator it = reversed.iterator();
        if (it.hasNext()) {
            it.next();
        }
        asSequence = SequencesKt__SequencesKt.asSequence(it);
        Iterator it2 = asSequence.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (!(((AY2) obj).m115582f() instanceof JY2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (AY2) obj;
    }

    /* renamed from: G */
    public final InterfaceC49220tP5<List<AY2>> m110255G() {
        return this.f5895j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r1 != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m110254H(Intent intent) {
        int[] iArr;
        ArrayList arrayList;
        Bundle bundle;
        int[] iArr2;
        boolean z;
        HY2 m100259H;
        JY2 jy2;
        Bundle bundle2;
        boolean z2;
        int i = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        } else {
            iArr = null;
        }
        if (extras != null) {
            arrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        } else {
            arrayList = null;
        }
        Bundle bundle3 = new Bundle();
        if (extras != null) {
            bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle3.putAll(bundle);
        }
        if (iArr != null) {
            if (iArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        JY2 jy22 = this.f5889d;
        Intrinsics.checkNotNull(jy22);
        HY2.C3160b mo100246x = jy22.mo100246x(new GY2(intent));
        if (mo100246x != null) {
            HY2 m103763b = mo100246x.m103763b();
            int[] m103776h = HY2.m103776h(m103763b, null, 1, null);
            Bundle m103778e = m103763b.m103778e(mo100246x.m103762c());
            if (m103778e != null) {
                bundle3.putAll(m103778e);
            }
            iArr2 = m103776h;
            arrayList = null;
            if (iArr2 != null) {
                if (iArr2.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String m110206u = m110206u(iArr2);
                    if (m110206u != null) {
                        Log.i("NavController", "Could not find destination " + m110206u + " in the navigation graph, ignoring the deep link from " + intent);
                        return false;
                    }
                    bundle3.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                    int length = iArr2.length;
                    Bundle[] bundleArr = new Bundle[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putAll(bundle3);
                        if (arrayList != null && (bundle2 = (Bundle) arrayList.get(i2)) != null) {
                            bundle4.putAll(bundle2);
                        }
                        bundleArr[i2] = bundle4;
                    }
                    int flags = intent.getFlags();
                    int i3 = 268435456 & flags;
                    if (i3 != 0 && (flags & DateUtils.FORMAT_ABBREV_WEEKDAY) == 0) {
                        intent.addFlags(DateUtils.FORMAT_ABBREV_WEEKDAY);
                        BZ5 m113857b = BZ5.m113853h(this.f5886a).m113857b(intent);
                        Intrinsics.checkNotNullExpressionValue(m113857b, "create(context)\n        …ntWithParentStack(intent)");
                        m113857b.m113850s();
                        Activity activity = this.f5887b;
                        if (activity != null) {
                            activity.finish();
                            activity.overridePendingTransition(0, 0);
                        }
                        return true;
                    } else if (i3 != 0) {
                        if (!m110205v().isEmpty()) {
                            JY2 jy23 = this.f5889d;
                            Intrinsics.checkNotNull(jy23);
                            m110237Y(this, jy23.m103774s(), true, false, 4, null);
                        }
                        while (i < iArr2.length) {
                            int i4 = iArr2[i];
                            int i5 = i + 1;
                            Bundle bundle5 = bundleArr[i];
                            HY2 m110208s = m110208s(i4);
                            if (m110208s != null) {
                                m110249M(m110208s, bundle5, VY2.m79755a(new C1526e(m110208s, this)), null);
                                i = i5;
                            } else {
                                throw new IllegalStateException("Deep Linking failed: destination " + HY2.f13508k.m103767b(this.f5886a, i4) + " cannot be found from the current destination " + m110261A());
                            }
                        }
                        return true;
                    } else {
                        JY2 jy24 = this.f5889d;
                        int length2 = iArr2.length;
                        for (int i6 = 0; i6 < length2; i6++) {
                            int i7 = iArr2[i6];
                            Bundle bundle6 = bundleArr[i6];
                            if (i6 == 0) {
                                m100259H = this.f5889d;
                            } else {
                                Intrinsics.checkNotNull(jy24);
                                m100259H = jy24.m100259H(i7);
                            }
                            if (m100259H != null) {
                                if (i6 != iArr2.length - 1) {
                                    if (m100259H instanceof JY2) {
                                        while (true) {
                                            jy2 = (JY2) m100259H;
                                            Intrinsics.checkNotNull(jy2);
                                            if (!(jy2.m100259H(jy2.m100253N()) instanceof JY2)) {
                                                break;
                                            }
                                            m100259H = jy2.m100259H(jy2.m100253N());
                                        }
                                        jy24 = jy2;
                                    }
                                } else {
                                    TY2.C7879a c7879a = new TY2.C7879a();
                                    JY2 jy25 = this.f5889d;
                                    Intrinsics.checkNotNull(jy25);
                                    m110249M(m100259H, bundle6, TY2.C7879a.m83404i(c7879a, jy25.m103774s(), true, false, 4, null).m83411b(0).m83410c(0).m83412a(), null);
                                }
                            } else {
                                throw new IllegalStateException("Deep Linking failed: destination " + HY2.f13508k.m103767b(this.f5886a, i7) + " cannot be found in graph " + jy24);
                            }
                        }
                        this.f5892g = true;
                        return true;
                    }
                }
            }
            return false;
        }
        iArr2 = iArr;
        if (iArr2 != null) {
        }
        return false;
    }

    /* renamed from: I */
    public final List<AY2> m110253I(ArrayDeque<NavBackStackEntryState> arrayDeque) {
        HY2 m110259C;
        ArrayList arrayList = new ArrayList();
        AY2 lastOrNull = m110205v().lastOrNull();
        if (lastOrNull == null || (m110259C = lastOrNull.m115582f()) == null) {
            m110259C = m110259C();
        }
        if (arrayDeque != null) {
            for (NavBackStackEntryState navBackStackEntryState : arrayDeque) {
                HY2 m110207t = m110207t(m110259C, navBackStackEntryState.m66835a());
                if (m110207t != null) {
                    arrayList.add(navBackStackEntryState.m66834b(this.f5886a, m110207t, m110258D(), this.f5902q));
                    m110259C = m110207t;
                } else {
                    String m103767b = HY2.f13508k.m103767b(this.f5886a, navBackStackEntryState.m66835a());
                    throw new IllegalStateException(("Restore State failed: destination " + m103767b + " cannot be found from the current destination " + m110259C).toString());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: K */
    public final void m110251K(AY2 ay2, AY2 ay22) {
        this.f5896k.put(ay2, ay22);
        if (this.f5897l.get(ay22) == null) {
            this.f5897l.put(ay22, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.f5897l.get(ay22);
        Intrinsics.checkNotNull(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    /* renamed from: L */
    public void m110250L(GY2 request, TY2 ty2, AbstractC39507d13.InterfaceC19660a interfaceC19660a) {
        Intrinsics.checkNotNullParameter(request, "request");
        JY2 jy2 = this.f5889d;
        Intrinsics.checkNotNull(jy2);
        HY2.C3160b mo100246x = jy2.mo100246x(request);
        if (mo100246x != null) {
            Bundle m103778e = mo100246x.m103763b().m103778e(mo100246x.m103762c());
            if (m103778e == null) {
                m103778e = new Bundle();
            }
            HY2 m103763b = mo100246x.m103763b();
            Intent intent = new Intent();
            intent.setDataAndType(request.m105012c(), request.m105013b());
            intent.setAction(request.m105014a());
            m103778e.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
            m110249M(m103763b, m103778e, ty2, interfaceC19660a);
            return;
        }
        throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this.f5889d);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011d A[LOOP:1: B:44:0x0117->B:46:0x011d, LOOP_END] */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m110249M(HY2 hy2, Bundle bundle, TY2 ty2, AbstractC39507d13.InterfaceC19660a interfaceC19660a) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<AY2> listOf;
        boolean z5;
        HY2 m115582f;
        Iterator<T> it = this.f5909x.values().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            ((C1522b) it.next()).m31241k(true);
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (ty2 != null && ty2.m83417e() != -1) {
            z2 = m110238X(ty2.m83417e(), ty2.m83416f(), ty2.m83414h());
        } else {
            z2 = false;
        }
        Bundle m103778e = hy2.m103778e(bundle);
        if (ty2 != null && ty2.m83413i()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && this.f5898m.containsKey(Integer.valueOf(hy2.m103774s()))) {
            booleanRef.element = m110228d0(hy2.m103774s(), m103778e, ty2, interfaceC19660a);
        } else {
            AY2 m110202y = m110202y();
            AbstractC39507d13<? extends HY2> m35381e = this.f5908w.m35381e(hy2.m103773u());
            if (ty2 != null && ty2.m83415g()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (m110202y != null && (m115582f = m110202y.m115582f()) != null && hy2.m103774s() == m115582f.m103774s()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    m110217k0(m110205v().removeLast());
                    AY2 ay2 = new AY2(m110202y, m103778e);
                    m110205v().addLast(ay2);
                    JY2 m103772v = ay2.m115582f().m103772v();
                    if (m103772v != null) {
                        m110251K(ay2, m110204w(m103772v.m103774s()));
                    }
                    m35381e.m44720g(ay2);
                    m110213m0();
                    for (C1522b c1522b : this.f5909x.values()) {
                        c1522b.m31241k(false);
                    }
                    if (z2 && !booleanRef.element && !z) {
                        m110215l0();
                        return;
                    }
                    m110209q();
                }
            }
            listOf = CollectionsKt__CollectionsJVMKt.listOf(AY2.C0146a.m115572b(AY2.f752o, this.f5886a, hy2, m103778e, m110258D(), this.f5902q, null, null, 96, null));
            m110245Q(m35381e, listOf, ty2, interfaceC19660a, new C1530g(booleanRef, this, hy2, m103778e));
        }
        z = false;
        m110213m0();
        while (r0.hasNext()) {
        }
        if (z2) {
        }
        m110209q();
    }

    @JvmOverloads
    /* renamed from: N */
    public final void m110248N(String route, TY2 ty2, AbstractC39507d13.InterfaceC19660a interfaceC19660a) {
        Intrinsics.checkNotNullParameter(route, "route");
        GY2.C2887a.C2888a c2888a = GY2.C2887a.f12065d;
        Uri parse = Uri.parse(HY2.f13508k.m103768a(route));
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(this)");
        m110250L(c2888a.m105009a(parse).m105011a(), ty2, interfaceC19660a);
    }

    /* renamed from: O */
    public final void m110247O(String route, Function1<? super UY2, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        m110246P(this, route, VY2.m79755a(builder), null, 4, null);
    }

    /* renamed from: Q */
    public final void m110245Q(AbstractC39507d13<? extends HY2> abstractC39507d13, List<AY2> list, TY2 ty2, AbstractC39507d13.InterfaceC19660a interfaceC19660a, Function1<? super AY2, Unit> function1) {
        this.f5910y = function1;
        abstractC39507d13.mo172e(list, ty2, interfaceC19660a);
        this.f5910y = null;
    }

    /* renamed from: R */
    public final void m110244R(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f5890e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String name = it.next();
                C42471i13 c42471i13 = this.f5908w;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                AbstractC39507d13 m35381e = c42471i13.m35381e(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    m35381e.m44719h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f5891f;
        boolean z = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                HY2 m110208s = m110208s(navBackStackEntryState.m66835a());
                if (m110208s != null) {
                    AY2 m66834b = navBackStackEntryState.m66834b(this.f5886a, m110208s, m110258D(), this.f5902q);
                    AbstractC39507d13<? extends HY2> m35381e2 = this.f5908w.m35381e(m110208s.m103773u());
                    Map<AbstractC39507d13<? extends HY2>, C1522b> map = this.f5909x;
                    C1522b c1522b = map.get(m35381e2);
                    if (c1522b == null) {
                        c1522b = new C1522b(this, m35381e2);
                        map.put(m35381e2, c1522b);
                    }
                    m110205v().add(m66834b);
                    c1522b.m110199m(m66834b);
                    JY2 m103772v = m66834b.m115582f().m103772v();
                    if (m103772v != null) {
                        m110251K(m66834b, m110204w(m103772v.m103774s()));
                    }
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + HY2.f13508k.m103767b(this.f5886a, navBackStackEntryState.m66835a()) + " cannot be found from the current destination " + m110261A());
                }
            }
            m110213m0();
            this.f5891f = null;
        }
        ArrayList<AbstractC39507d13<? extends HY2>> arrayList = new ArrayList();
        for (Object obj : this.f5908w.m35380f().values()) {
            if (!((AbstractC39507d13) obj).m44722c()) {
                arrayList.add(obj);
            }
        }
        for (AbstractC39507d13<? extends HY2> abstractC39507d13 : arrayList) {
            Map<AbstractC39507d13<? extends HY2>, C1522b> map2 = this.f5909x;
            C1522b c1522b2 = map2.get(abstractC39507d13);
            if (c1522b2 == null) {
                c1522b2 = new C1522b(this, abstractC39507d13);
                map2.put(abstractC39507d13, c1522b2);
            }
            abstractC39507d13.m44721f(c1522b2);
        }
        if (this.f5889d != null && m110205v().isEmpty()) {
            if (!this.f5892g && (activity = this.f5887b) != null) {
                Intrinsics.checkNotNull(activity);
                if (m110254H(activity.getIntent())) {
                    z = true;
                }
            }
            if (!z) {
                JY2 jy2 = this.f5889d;
                Intrinsics.checkNotNull(jy2);
                m110249M(jy2, bundle, null, null);
                return;
            }
            return;
        }
        m110209q();
    }

    /* renamed from: S */
    public boolean m110243S() {
        if (m110205v().isEmpty()) {
            return false;
        }
        HY2 m110261A = m110261A();
        Intrinsics.checkNotNull(m110261A);
        return m110242T(m110261A.m103774s(), true);
    }

    /* renamed from: T */
    public boolean m110242T(int i, boolean z) {
        return m110241U(i, z, false);
    }

    /* renamed from: U */
    public boolean m110241U(int i, boolean z, boolean z2) {
        if (m110238X(i, z, z2) && m110209q()) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public final void m110240V(AY2 popUpTo, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        int indexOf = m110205v().indexOf(popUpTo);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != m110205v().size()) {
            m110238X(m110205v().get(i).m115582f().m103774s(), true, false);
        }
        m110234a0(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        m110213m0();
        m110209q();
    }

    /* renamed from: W */
    public final void m110239W(AbstractC39507d13<? extends HY2> abstractC39507d13, AY2 ay2, boolean z, Function1<? super AY2, Unit> function1) {
        this.f5911z = function1;
        abstractC39507d13.mo171j(ay2, z);
        this.f5911z = null;
    }

    /* renamed from: X */
    public final boolean m110238X(int i, boolean z, boolean z2) {
        List reversed;
        HY2 hy2;
        Sequence generateSequence;
        Sequence<HY2> takeWhile;
        Sequence generateSequence2;
        Sequence<HY2> takeWhile2;
        String str;
        if (m110205v().isEmpty()) {
            return false;
        }
        ArrayList<AbstractC39507d13<? extends HY2>> arrayList = new ArrayList();
        reversed = CollectionsKt___CollectionsKt.reversed(m110205v());
        Iterator it = reversed.iterator();
        while (true) {
            if (it.hasNext()) {
                HY2 m115582f = ((AY2) it.next()).m115582f();
                AbstractC39507d13 m35381e = this.f5908w.m35381e(m115582f.m103773u());
                if (z || m115582f.m103774s() != i) {
                    arrayList.add(m35381e);
                }
                if (m115582f.m103774s() == i) {
                    hy2 = m115582f;
                    break;
                }
            } else {
                hy2 = null;
                break;
            }
        }
        if (hy2 == null) {
            String m103767b = HY2.f13508k.m103767b(this.f5886a, i);
            Log.i("NavController", "Ignoring popBackStack to destination " + m103767b + " as it was not found on the current back stack");
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>();
        for (AbstractC39507d13<? extends HY2> abstractC39507d13 : arrayList) {
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            m110239W(abstractC39507d13, m110205v().last(), z2, new C1532i(booleanRef2, booleanRef, this, z2, arrayDeque));
            if (!booleanRef2.element) {
                break;
            }
        }
        if (z2) {
            if (!z) {
                generateSequence2 = SequencesKt__SequencesKt.generateSequence(hy2, C1533j.f5933g);
                takeWhile2 = SequencesKt___SequencesKt.takeWhile(generateSequence2, new C1534k());
                for (HY2 hy22 : takeWhile2) {
                    Map<Integer, String> map = this.f5898m;
                    Integer valueOf = Integer.valueOf(hy22.m103774s());
                    NavBackStackEntryState firstOrNull = arrayDeque.firstOrNull();
                    if (firstOrNull != null) {
                        str = firstOrNull.getId();
                    } else {
                        str = null;
                    }
                    map.put(valueOf, str);
                }
            }
            if (!arrayDeque.isEmpty()) {
                NavBackStackEntryState first = arrayDeque.first();
                generateSequence = SequencesKt__SequencesKt.generateSequence(m110208s(first.m66835a()), C1535l.f5935g);
                takeWhile = SequencesKt___SequencesKt.takeWhile(generateSequence, new C1536m());
                for (HY2 hy23 : takeWhile) {
                    this.f5898m.put(Integer.valueOf(hy23.m103774s()), first.getId());
                }
                this.f5899n.put(first.getId(), arrayDeque);
            }
        }
        m110213m0();
        return booleanRef.element;
    }

    /* renamed from: Z */
    public final void m110236Z(AY2 ay2, boolean z, ArrayDeque<NavBackStackEntryState> arrayDeque) {
        boolean z2;
        EY2 ey2;
        InterfaceC49220tP5<Set<AY2>> m31249c;
        Set<AY2> value;
        AY2 last = m110205v().last();
        if (Intrinsics.areEqual(last, ay2)) {
            m110205v().removeLast();
            C1522b c1522b = this.f5909x.get(m110257E().m35381e(last.m115582f().m103773u()));
            boolean z3 = true;
            if (c1522b != null && (m31249c = c1522b.m31249c()) != null && (value = m31249c.getValue()) != null && value.contains(last)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !this.f5897l.containsKey(last)) {
                z3 = false;
            }
            AbstractC11719f.EnumC11724b mo67007b = last.getLifecycle().mo67007b();
            AbstractC11719f.EnumC11724b enumC11724b = AbstractC11719f.EnumC11724b.CREATED;
            if (mo67007b.m67013b(enumC11724b)) {
                if (z) {
                    last.m115575m(enumC11724b);
                    arrayDeque.addFirst(new NavBackStackEntryState(last));
                }
                if (!z3) {
                    last.m115575m(AbstractC11719f.EnumC11724b.DESTROYED);
                    m110217k0(last);
                } else {
                    last.m115575m(enumC11724b);
                }
            }
            if (!z && !z3 && (ey2 = this.f5902q) != null) {
                ey2.m108836f(last.m115581g());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + ay2.m115582f() + ", which is not the top of the back stack (" + last.m115582f() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* renamed from: b0 */
    public final List<AY2> m110232b0() {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (C1522b c1522b : this.f5909x.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : c1522b.m31249c().getValue()) {
                AY2 ay2 = (AY2) obj;
                if (!arrayList.contains(ay2) && !ay2.m115580h().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        ArrayDeque<AY2> m110205v = m110205v();
        ArrayList arrayList3 = new ArrayList();
        for (AY2 ay22 : m110205v) {
            AY2 ay23 = ay22;
            if (!arrayList.contains(ay23) && ay23.m115580h().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList3.add(ay22);
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((AY2) obj2).m115582f() instanceof JY2)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* renamed from: c0 */
    public void m110230c0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f5886a.getClassLoader());
        this.f5890e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f5891f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f5899n.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                this.f5898m.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                i++;
                i2++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + id);
                if (parcelableArray != null) {
                    Map<String, ArrayDeque<NavBackStackEntryState>> map = this.f5899n;
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>(parcelableArray.length);
                    Iterator it = ArrayIteratorKt.iterator(parcelableArray);
                    while (it.hasNext()) {
                        Parcelable parcelable = (Parcelable) it.next();
                        if (parcelable != null) {
                            arrayDeque.add((NavBackStackEntryState) parcelable);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        }
                    }
                    map.put(id, arrayDeque);
                }
            }
        }
        this.f5892g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e A[SYNTHETIC] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m110228d0(int i, Bundle bundle, TY2 ty2, AbstractC39507d13.InterfaceC19660a interfaceC19660a) {
        Object first;
        Object lastOrNull;
        String str;
        List mutableListOf;
        Object last;
        HY2 m115582f;
        if (!this.f5898m.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str2 = this.f5898m.get(Integer.valueOf(i));
        CollectionsKt__MutableCollectionsKt.removeAll(this.f5898m.values(), new C1537n(str2));
        List<AY2> m110253I = m110253I((ArrayDeque) TypeIntrinsics.asMutableMap(this.f5899n).remove(str2));
        ArrayList<List<AY2>> arrayList = new ArrayList();
        ArrayList<AY2> arrayList2 = new ArrayList();
        for (Object obj : m110253I) {
            if (!(((AY2) obj).m115582f() instanceof JY2)) {
                arrayList2.add(obj);
            }
        }
        for (AY2 ay2 : arrayList2) {
            lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) arrayList);
            List list = (List) lastOrNull;
            if (list != null) {
                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) list);
                AY2 ay22 = (AY2) last;
                if (ay22 != null && (m115582f = ay22.m115582f()) != null) {
                    str = m115582f.m103773u();
                    if (!Intrinsics.areEqual(str, ay2.m115582f().m103773u())) {
                        list.add(ay2);
                    } else {
                        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(ay2);
                        arrayList.add(mutableListOf);
                    }
                }
            }
            str = null;
            if (!Intrinsics.areEqual(str, ay2.m115582f().m103773u())) {
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List<AY2> list2 : arrayList) {
            C42471i13 c42471i13 = this.f5908w;
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list2);
            m110245Q(c42471i13.m35381e(((AY2) first).m115582f().m103773u()), list2, ty2, interfaceC19660a, new C1538o(booleanRef, m110253I, new Ref.IntRef(), this, bundle));
        }
        return booleanRef.element;
    }

    /* renamed from: e0 */
    public Bundle m110226e0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, AbstractC39507d13<? extends HY2>> entry : this.f5908w.m35380f().entrySet()) {
            String key = entry.getKey();
            Bundle m44718i = entry.getValue().m44718i();
            if (m44718i != null) {
                arrayList.add(key);
                bundle2.putBundle(key, m44718i);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!m110205v().isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[m110205v().size()];
            Iterator<AY2> it = m110205v().iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f5898m.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f5898m.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry<Integer, String> entry2 : this.f5898m.entrySet()) {
                iArr[i2] = entry2.getKey().intValue();
                arrayList2.add(entry2.getValue());
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.f5899n.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, ArrayDeque<NavBackStackEntryState>> entry3 : this.f5899n.entrySet()) {
                String key2 = entry3.getKey();
                ArrayDeque<NavBackStackEntryState> value = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value.size()];
                int i3 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    parcelableArr2[i3] = navBackStackEntryState;
                    i3 = i4;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + key2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f5892g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f5892g);
        }
        return bundle;
    }

    /* renamed from: f0 */
    public void m110224f0(JY2 graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        m110222g0(graph, null);
    }

    /* renamed from: g0 */
    public void m110222g0(JY2 graph, Bundle bundle) {
        boolean z;
        Intrinsics.checkNotNullParameter(graph, "graph");
        if (!Intrinsics.areEqual(this.f5889d, graph)) {
            JY2 jy2 = this.f5889d;
            if (jy2 != null) {
                for (Integer id : new ArrayList(this.f5898m.keySet())) {
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    m110210p(id.intValue());
                }
                m110237Y(this, jy2.m103774s(), true, false, 4, null);
            }
            this.f5889d = graph;
            m110244R(bundle);
            return;
        }
        int size = graph.m100255L().size();
        for (int i = 0; i < size; i++) {
            HY2 newDestination = graph.m100255L().m96975t(i);
            JY2 jy22 = this.f5889d;
            Intrinsics.checkNotNull(jy22);
            jy22.m100255L().m96976r(i, newDestination);
            ArrayDeque<AY2> m110205v = m110205v();
            ArrayList<AY2> arrayList = new ArrayList();
            for (AY2 ay2 : m110205v) {
                AY2 ay22 = ay2;
                if (newDestination != null && ay22.m115582f().m103774s() == newDestination.m103774s()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(ay2);
                }
            }
            for (AY2 ay23 : arrayList) {
                Intrinsics.checkNotNullExpressionValue(newDestination, "newDestination");
                ay23.m115576l(newDestination);
            }
        }
    }

    /* renamed from: h0 */
    public void mo92021h0(LifecycleOwner owner) {
        AbstractC11719f lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (Intrinsics.areEqual(owner, this.f5900o)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.f5900o;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.mo67006d(this.f5905t);
        }
        this.f5900o = owner;
        owner.getLifecycle().mo67008a(this.f5905t);
    }

    /* renamed from: i0 */
    public void mo92020i0(OnBackPressedDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        if (Intrinsics.areEqual(dispatcher, this.f5901p)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.f5900o;
        if (lifecycleOwner != null) {
            this.f5906u.remove();
            this.f5901p = dispatcher;
            dispatcher.m70498b(lifecycleOwner, this.f5906u);
            AbstractC11719f lifecycle = lifecycleOwner.getLifecycle();
            lifecycle.mo67006d(this.f5905t);
            lifecycle.mo67008a(this.f5905t);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
    }

    /* renamed from: j0 */
    public void mo92019j0(C36920Wr6 viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        EY2 ey2 = this.f5902q;
        EY2.C1864b c1864b = EY2.f7663b;
        if (Intrinsics.areEqual(ey2, c1864b.m108835a(viewModelStore))) {
            return;
        }
        if (m110205v().isEmpty()) {
            this.f5902q = c1864b.m108835a(viewModelStore);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
    }

    /* renamed from: k0 */
    public final AY2 m110217k0(AY2 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        AY2 remove = this.f5896k.remove(child);
        Integer num = null;
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.f5897l.get(remove);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            C1522b c1522b = this.f5909x.get(this.f5908w.m35381e(remove.m115582f().m103773u()));
            if (c1522b != null) {
                c1522b.mo31247e(remove);
            }
            this.f5897l.remove(remove);
        }
        return remove;
    }

    /* renamed from: l0 */
    public final void m110215l0() {
        List<AY2> mutableList;
        Object last;
        HY2 hy2;
        List<AY2> reversed;
        Boolean bool;
        InterfaceC49220tP5<Set<AY2>> m31249c;
        Set<AY2> value;
        List<AY2> reversed2;
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) m110205v());
        if (!mutableList.isEmpty()) {
            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) mutableList);
            HY2 m115582f = ((AY2) last).m115582f();
            if (m115582f instanceof InterfaceC51886xu1) {
                reversed2 = CollectionsKt___CollectionsKt.reversed(mutableList);
                for (AY2 ay2 : reversed2) {
                    hy2 = ay2.m115582f();
                    if (!(hy2 instanceof JY2) && !(hy2 instanceof InterfaceC51886xu1)) {
                        break;
                    }
                }
            }
            hy2 = null;
            HashMap hashMap = new HashMap();
            reversed = CollectionsKt___CollectionsKt.reversed(mutableList);
            for (AY2 ay22 : reversed) {
                AbstractC11719f.EnumC11724b m115580h = ay22.m115580h();
                HY2 m115582f2 = ay22.m115582f();
                if (m115582f != null && m115582f2.m103774s() == m115582f.m103774s()) {
                    AbstractC11719f.EnumC11724b enumC11724b = AbstractC11719f.EnumC11724b.RESUMED;
                    if (m115580h != enumC11724b) {
                        C1522b c1522b = this.f5909x.get(m110257E().m35381e(ay22.m115582f().m103773u()));
                        if (c1522b != null && (m31249c = c1522b.m31249c()) != null && (value = m31249c.getValue()) != null) {
                            bool = Boolean.valueOf(value.contains(ay22));
                        } else {
                            bool = null;
                        }
                        if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
                            AtomicInteger atomicInteger = this.f5897l.get(ay22);
                            boolean z = false;
                            if (atomicInteger != null && atomicInteger.get() == 0) {
                                z = true;
                            }
                            if (!z) {
                                hashMap.put(ay22, enumC11724b);
                            }
                        }
                        hashMap.put(ay22, AbstractC11719f.EnumC11724b.STARTED);
                    }
                    m115582f = m115582f.m103772v();
                } else if (hy2 != null && m115582f2.m103774s() == hy2.m103774s()) {
                    if (m115580h == AbstractC11719f.EnumC11724b.RESUMED) {
                        ay22.m115575m(AbstractC11719f.EnumC11724b.STARTED);
                    } else {
                        AbstractC11719f.EnumC11724b enumC11724b2 = AbstractC11719f.EnumC11724b.STARTED;
                        if (m115580h != enumC11724b2) {
                            hashMap.put(ay22, enumC11724b2);
                        }
                    }
                    hy2 = hy2.m103772v();
                } else {
                    ay22.m115575m(AbstractC11719f.EnumC11724b.CREATED);
                }
            }
            for (AY2 ay23 : mutableList) {
                AbstractC11719f.EnumC11724b enumC11724b3 = (AbstractC11719f.EnumC11724b) hashMap.get(ay23);
                if (enumC11724b3 != null) {
                    ay23.m115575m(enumC11724b3);
                } else {
                    ay23.m115574n();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (m110260B() > 1) goto L5;
     */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m110213m0() {
        boolean z;
        AbstractC36566Ve3 abstractC36566Ve3 = this.f5906u;
        if (this.f5907v) {
            z = true;
        }
        z = false;
        abstractC36566Ve3.setEnabled(z);
    }

    /* renamed from: n */
    public final void m110212n(HY2 hy2, Bundle bundle, AY2 ay2, List<AY2> list) {
        ArrayDeque<AY2> arrayDeque;
        HY2 hy22;
        List<AY2> list2;
        AY2 ay22;
        Bundle bundle2;
        JY2 m115582f;
        HY2 hy23;
        List<AY2> plus;
        AY2 ay23;
        JY2 jy2;
        AY2 ay24;
        List<AY2> list3;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        AY2 ay25 = ay2;
        List<AY2> list4 = list;
        HY2 m115582f2 = ay2.m115582f();
        if (!(m115582f2 instanceof InterfaceC51886xu1)) {
            while (!m110205v().isEmpty() && (m110205v().last().m115582f() instanceof InterfaceC51886xu1) && m110237Y(this, m110205v().last().m115582f().m103774s(), true, false, 4, null)) {
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        AY2 ay26 = null;
        if (hy2 instanceof JY2) {
            HY2 hy24 = m115582f2;
            while (true) {
                Intrinsics.checkNotNull(hy24);
                JY2 m103772v = hy24.m103772v();
                if (m103772v != null) {
                    ListIterator<AY2> listIterator = list4.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            ay24 = listIterator.previous();
                            if (Intrinsics.areEqual(ay24.m115582f(), m103772v)) {
                                break;
                            }
                        } else {
                            ay24 = null;
                            break;
                        }
                    }
                    AY2 ay27 = ay24;
                    if (ay27 == null) {
                        hy22 = m115582f2;
                        list3 = list4;
                        bundle3 = bundle4;
                        ay22 = ay25;
                        ay27 = AY2.C0146a.m115572b(AY2.f752o, this.f5886a, m103772v, bundle, m110258D(), this.f5902q, null, null, 96, null);
                    } else {
                        hy22 = m115582f2;
                        list3 = list4;
                        ay22 = ay25;
                        bundle3 = bundle4;
                    }
                    arrayDeque2.addFirst(ay27);
                    if ((!m110205v().isEmpty()) && m110205v().last().m115582f() == m103772v) {
                        list2 = list3;
                        bundle2 = bundle3;
                        jy2 = m103772v;
                        arrayDeque = arrayDeque2;
                        m110234a0(this, m110205v().last(), false, null, 6, null);
                    } else {
                        list2 = list3;
                        bundle2 = bundle3;
                        jy2 = m103772v;
                        arrayDeque = arrayDeque2;
                    }
                } else {
                    jy2 = m103772v;
                    arrayDeque = arrayDeque2;
                    hy22 = m115582f2;
                    list2 = list4;
                    ay22 = ay25;
                    bundle2 = bundle4;
                }
                if (jy2 == null || jy2 == hy2) {
                    break;
                }
                ay25 = ay22;
                hy24 = jy2;
                arrayDeque2 = arrayDeque;
                bundle4 = bundle2;
                list4 = list2;
                m115582f2 = hy22;
            }
        } else {
            arrayDeque = arrayDeque2;
            hy22 = m115582f2;
            list2 = list4;
            ay22 = ay25;
            bundle2 = bundle4;
        }
        if (arrayDeque.isEmpty()) {
            m115582f = hy22;
        } else {
            m115582f = ((AY2) arrayDeque.first()).m115582f();
        }
        while (m115582f != null && m110208s(m115582f.m103774s()) == null) {
            m115582f = m115582f.m103772v();
            if (m115582f != null) {
                ListIterator<AY2> listIterator2 = list2.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        ay23 = listIterator2.previous();
                        if (Intrinsics.areEqual(ay23.m115582f(), m115582f)) {
                            break;
                        }
                    } else {
                        ay23 = null;
                        break;
                    }
                }
                AY2 ay28 = ay23;
                if (ay28 == null) {
                    ay28 = AY2.C0146a.m115572b(AY2.f752o, this.f5886a, m115582f, m115582f.m103778e(bundle2), m110258D(), this.f5902q, null, null, 96, null);
                }
                arrayDeque.addFirst(ay28);
            }
        }
        if (!arrayDeque.isEmpty()) {
            hy22 = ((AY2) arrayDeque.first()).m115582f();
        }
        while (!m110205v().isEmpty() && (m110205v().last().m115582f() instanceof JY2) && ((JY2) m110205v().last().m115582f()).m100258I(hy22.m103774s(), false) == null) {
            m110234a0(this, m110205v().last(), false, null, 6, null);
        }
        AY2 firstOrNull = m110205v().firstOrNull();
        if (firstOrNull == null) {
            firstOrNull = (AY2) arrayDeque.firstOrNull();
        }
        if (firstOrNull != null) {
            hy23 = firstOrNull.m115582f();
        } else {
            hy23 = null;
        }
        if (!Intrinsics.areEqual(hy23, this.f5889d)) {
            ListIterator<AY2> listIterator3 = list2.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                AY2 previous = listIterator3.previous();
                HY2 m115582f3 = previous.m115582f();
                JY2 jy22 = this.f5889d;
                Intrinsics.checkNotNull(jy22);
                if (Intrinsics.areEqual(m115582f3, jy22)) {
                    ay26 = previous;
                    break;
                }
            }
            AY2 ay29 = ay26;
            if (ay29 == null) {
                AY2.C0146a c0146a = AY2.f752o;
                Context context = this.f5886a;
                JY2 jy23 = this.f5889d;
                Intrinsics.checkNotNull(jy23);
                JY2 jy24 = this.f5889d;
                Intrinsics.checkNotNull(jy24);
                ay29 = AY2.C0146a.m115572b(c0146a, context, jy23, jy24.m103778e(bundle2), m110258D(), this.f5902q, null, null, 96, null);
            }
            arrayDeque.addFirst(ay29);
        }
        for (AY2 ay210 : arrayDeque) {
            C1522b c1522b = this.f5909x.get(this.f5908w.m35381e(ay210.m115582f().m103773u()));
            if (c1522b != null) {
                c1522b.m110199m(ay210);
            } else {
                throw new IllegalStateException(("NavigatorBackStack for " + hy2.m103773u() + " should already be created").toString());
            }
        }
        m110205v().addAll(arrayDeque);
        m110205v().add(ay22);
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends AY2>) ((Collection<? extends Object>) arrayDeque), ay22);
        for (AY2 ay211 : plus) {
            JY2 m103772v2 = ay211.m115582f().m103772v();
            if (m103772v2 != null) {
                m110251K(ay211, m110204w(m103772v2.m103774s()));
            }
        }
    }

    /* renamed from: p */
    public final boolean m110210p(int i) {
        for (C1522b c1522b : this.f5909x.values()) {
            c1522b.m31241k(true);
        }
        boolean m110228d0 = m110228d0(i, null, null, null);
        for (C1522b c1522b2 : this.f5909x.values()) {
            c1522b2.m31241k(false);
        }
        if (m110228d0 && m110238X(i, true, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m110209q() {
        List<AY2> mutableList;
        while (!m110205v().isEmpty() && (m110205v().last().m115582f() instanceof JY2)) {
            m110234a0(this, m110205v().last(), false, null, 6, null);
        }
        AY2 lastOrNull = m110205v().lastOrNull();
        if (lastOrNull != null) {
            this.f5882C.add(lastOrNull);
        }
        this.f5881B++;
        m110215l0();
        int i = this.f5881B - 1;
        this.f5881B = i;
        if (i == 0) {
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f5882C);
            this.f5882C.clear();
            for (AY2 ay2 : mutableList) {
                Iterator<InterfaceC1524c> it = this.f5903r.iterator();
                while (it.hasNext()) {
                    it.next().m110198a(this, ay2.m115582f(), ay2.m115584d());
                }
                this.f5884E.mo10357b(ay2);
            }
            this.f5894i.mo10357b(m110232b0());
        }
        if (lastOrNull != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void mo92018r(boolean z) {
        this.f5907v = z;
        m110213m0();
    }

    /* renamed from: s */
    public final HY2 m110208s(int i) {
        HY2 hy2;
        JY2 jy2 = this.f5889d;
        if (jy2 == null) {
            return null;
        }
        Intrinsics.checkNotNull(jy2);
        if (jy2.m103774s() == i) {
            return this.f5889d;
        }
        AY2 lastOrNull = m110205v().lastOrNull();
        if (lastOrNull == null || (hy2 = lastOrNull.m115582f()) == null) {
            hy2 = this.f5889d;
            Intrinsics.checkNotNull(hy2);
        }
        return m110207t(hy2, i);
    }

    /* renamed from: t */
    public final HY2 m110207t(HY2 hy2, int i) {
        JY2 m103772v;
        if (hy2.m103774s() == i) {
            return hy2;
        }
        if (hy2 instanceof JY2) {
            m103772v = (JY2) hy2;
        } else {
            m103772v = hy2.m103772v();
            Intrinsics.checkNotNull(m103772v);
        }
        return m103772v.m100259H(i);
    }

    /* renamed from: u */
    public final String m110206u(int[] iArr) {
        JY2 jy2;
        JY2 jy22 = this.f5889d;
        int length = iArr.length;
        int i = 0;
        while (true) {
            HY2 hy2 = null;
            if (i >= length) {
                return null;
            }
            int i2 = iArr[i];
            if (i == 0) {
                JY2 jy23 = this.f5889d;
                Intrinsics.checkNotNull(jy23);
                if (jy23.m103774s() == i2) {
                    hy2 = this.f5889d;
                }
            } else {
                Intrinsics.checkNotNull(jy22);
                hy2 = jy22.m100259H(i2);
            }
            if (hy2 == null) {
                return HY2.f13508k.m103767b(this.f5886a, i2);
            }
            if (i != iArr.length - 1 && (hy2 instanceof JY2)) {
                while (true) {
                    jy2 = (JY2) hy2;
                    Intrinsics.checkNotNull(jy2);
                    if (!(jy2.m100259H(jy2.m100253N()) instanceof JY2)) {
                        break;
                    }
                    hy2 = jy2.m100259H(jy2.m100253N());
                }
                jy22 = jy2;
            }
            i++;
        }
    }

    /* renamed from: v */
    public ArrayDeque<AY2> m110205v() {
        return this.f5893h;
    }

    /* renamed from: w */
    public AY2 m110204w(int i) {
        AY2 ay2;
        boolean z;
        ArrayDeque<AY2> m110205v = m110205v();
        ListIterator<AY2> listIterator = m110205v.listIterator(m110205v.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                ay2 = listIterator.previous();
                if (ay2.m115582f().m103774s() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                ay2 = null;
                break;
            }
        }
        AY2 ay22 = ay2;
        if (ay22 != null) {
            return ay22;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + m110261A()).toString());
    }

    /* renamed from: x */
    public final Context m110203x() {
        return this.f5886a;
    }

    /* renamed from: y */
    public AY2 m110202y() {
        return m110205v().lastOrNull();
    }

    /* renamed from: z */
    public final InterfaceC32730Eu1<AY2> m110201z() {
        return this.f5885F;
    }
}
