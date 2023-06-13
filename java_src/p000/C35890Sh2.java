package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.C38856bx2;
import p000.InterfaceC52943zh2;
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(m28433d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006¶\u0001¤\u0001¦\u0001B\u0012\u0012\u0007\u0010³\u0001\u001a\u00020\u0015¢\u0006\u0006\b´\u0001\u0010µ\u0001J#\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u0010*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b!\u0010\u001eJ\u0019\u0010#\u001a\u00020\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b#\u0010$J@\u0010,\u001a\u00020+2'\u0010)\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00100%j\u0002`(2\u0006\u0010*\u001a\u00020\u0015H\u0002¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020+H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0015H\u0002¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b?\u0010<J\u0019\u0010@\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u0019\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\bI\u0010JJ*\u0010L\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010K\u001a\u00020H2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0082\u0010¢\u0006\u0004\bL\u0010MJ)\u0010O\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010N\u001a\u00020H2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u0004\u0018\u00010H*\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u0019\u0010U\u001a\u00020T2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bU\u0010VJ\u0015\u0010W\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\bW\u0010:J\u0019\u0010Y\u001a\u00020\u00102\b\u0010X\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bY\u0010ZJ\r\u0010[\u001a\u00020\u0015¢\u0006\u0004\b[\u00108J\u000f\u0010\\\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\\\u0010]J\u0011\u0010`\u001a\u00060^j\u0002`_¢\u0006\u0004\b`\u0010aJ#\u0010c\u001a\u00060^j\u0002`_*\u00020\u000b2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010TH\u0004¢\u0006\u0004\bc\u0010dJ6\u0010f\u001a\u00020e2'\u0010)\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00100%j\u0002`(¢\u0006\u0004\bf\u0010gJF\u0010i\u001a\u00020e2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010h\u001a\u00020\u00152'\u0010)\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00100%j\u0002`(¢\u0006\u0004\bi\u0010jJ\u0013\u0010k\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\bk\u0010:J\u0017\u0010l\u001a\u00020\u00102\u0006\u0010/\u001a\u00020+H\u0000¢\u0006\u0004\bl\u00106J\u001f\u0010m\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0018\u00010^j\u0004\u0018\u0001`_H\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020TH\u0014¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bq\u0010rJ\u0015\u0010t\u001a\u00020\u00102\u0006\u0010s\u001a\u00020\u0003¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bv\u0010 J\u0017\u0010w\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bw\u0010 J\u0019\u0010x\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bx\u0010yJ\u0013\u0010z\u001a\u00060^j\u0002`_H\u0016¢\u0006\u0004\bz\u0010aJ\u0019\u0010{\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b{\u0010yJ\u001b\u0010|\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b|\u0010<J\u0015\u0010~\u001a\u00020}2\u0006\u0010K\u001a\u00020\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001a\u0010\u0081\u0001\u001a\u00020\u00102\u0007\u0010\u0080\u0001\u001a\u00020\u000bH\u0010¢\u0006\u0005\b\u0081\u0001\u0010rJ\u001b\u0010\u0082\u0001\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0005\b\u0082\u0001\u0010rJ\u001a\u0010\u0083\u0001\u001a\u00020\u00152\u0007\u0010\u0080\u0001\u001a\u00020\u000bH\u0014¢\u0006\u0005\b\u0083\u0001\u0010 J\u001c\u0010\u0084\u0001\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001c\u0010\u0086\u0001\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0006\b\u0086\u0001\u0010\u0085\u0001J\u0011\u0010\u0087\u0001\u001a\u00020TH\u0016¢\u0006\u0005\b\u0087\u0001\u0010pJ\u0011\u0010\u0088\u0001\u001a\u00020TH\u0007¢\u0006\u0005\b\u0088\u0001\u0010pJ\u0011\u0010\u0089\u0001\u001a\u00020TH\u0010¢\u0006\u0005\b\u0089\u0001\u0010pJ\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0017\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0004H\u0080@ø\u0001\u0000¢\u0006\u0005\b\u008c\u0001\u0010:JZ\u0010\u0094\u0001\u001a\u00020\u0010\"\u0005\b\u0000\u0010\u008d\u0001\"\u0005\b\u0001\u0010\u008e\u00012\u000e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008f\u00012%\u0010\u0093\u0001\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0092\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0091\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001JZ\u0010\u0096\u0001\u001a\u00020\u0010\"\u0005\b\u0000\u0010\u008d\u0001\"\u0005\b\u0001\u0010\u008e\u00012\u000e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008f\u00012%\u0010\u0093\u0001\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0092\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0091\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0095\u0001R\u001e\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010>R\u0019\u0010\u009c\u0001\u001a\u0007\u0012\u0002\b\u00030\u0099\u00018F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R.\u0010¢\u0001\u001a\u0004\u0018\u00010}2\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010}8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010\u008b\u0001R\u0016\u0010¥\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u00108R\u0013\u0010§\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b¦\u0001\u00108R\u0013\u0010¨\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b¨\u0001\u00108R\u0016\u0010ª\u0001\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u00108R\u001b\u0010®\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010«\u00018F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010°\u0001\u001a\u00020\u00158TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u00108R\u0016\u0010²\u0001\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b±\u0001\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006·\u0001"}, m28432d2 = {"LSh2;", "Lzh2;", "LLi0;", "LVE3;", "", "LSh2$c;", TransferTable.COLUMN_STATE, "proposedUpdate", "k0", "(LSh2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "o0", "(LSh2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "", "V", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Li12;", "update", "", "W0", "(Li12;Ljava/lang/Object;)Z", "h0", "(Li12;Ljava/lang/Object;)V", "LM83;", "list", "cause", "G0", "(LM83;Ljava/lang/Throwable;)V", "e0", "(Ljava/lang/Throwable;)Z", "H0", "", "R0", "(Ljava/lang/Object;)I", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "LPh2;", "D0", "(Lkotlin/jvm/functions/Function1;Z)LPh2;", "expect", "node", "U", "(Ljava/lang/Object;LM83;LPh2;)Z", "LMa1;", "L0", "(LMa1;)V", "M0", "(LPh2;)V", "y0", "()Z", "z0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d0", "(Ljava/lang/Object;)Ljava/lang/Object;", "j0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "A0", "r0", "(Li12;)LM83;", "X0", "(Li12;Ljava/lang/Throwable;)Z", "Y0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Z0", "(Li12;Ljava/lang/Object;)Ljava/lang/Object;", "LKi0;", "l0", "(Li12;)LKi0;", "child", "a1", "(LSh2$c;LKi0;Ljava/lang/Object;)Z", "lastChild", "i0", "(LSh2$c;LKi0;Ljava/lang/Object;)V", "Lbx2;", "F0", "(Lbx2;)LKi0;", "", "S0", "(Ljava/lang/Object;)Ljava/lang/String;", "Z", "parent", "w0", "(Lzh2;)V", "start", "K0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "F", "()Ljava/util/concurrent/CancellationException;", "message", "T0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lo51;", "n", "(Lkotlin/jvm/functions/Function1;)Lo51;", "invokeImmediately", "D", "(ZZLkotlin/jvm/functions/Function1;)Lo51;", "P", "O0", "f", "(Ljava/util/concurrent/CancellationException;)V", "f0", "()Ljava/lang/String;", "c0", "(Ljava/lang/Throwable;)V", "parentJob", "z", "(LVE3;)V", "g0", "a0", "b0", "(Ljava/lang/Object;)Z", "O", "B0", "C0", "LJi0;", "Q", "(LLi0;)LJi0;", "exception", "v0", "I0", AbstractC26684u0.f100690q, "J0", "(Ljava/lang/Object;)V", "W", "toString", "V0", "E0", "m0", "()Ljava/lang/Object;", "Y", "T", "R", "Lrr5;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "N0", "(Lrr5;Lkotlin/jvm/functions/Function2;)V", "P0", "n0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "value", "s0", "()LJi0;", "Q0", "(LJi0;)V", "parentHandle", "t0", "b", "isActive", "c", "isCompleted", "isCancelled", "q0", "onCancelComplete", "Lkotlin/sequences/Sequence;", DateTokenConverter.CONVERTER_KEY, "()Lkotlin/sequences/Sequence;", "children", "x0", "isScopedCoroutine", "p0", "handlesException", "active", "<init>", "(Z)V", C17296a.f69688o, "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Sh2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C35890Sh2 implements InterfaceC52943zh2, InterfaceC34259Li0, VE3 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34063b = AtomicReferenceFieldUpdater.newUpdater(C35890Sh2.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"LSh2$a;", "T", "LXc0;", "Lzh2;", "parent", "", "p", "", "A", "LSh2;", "j", "LSh2;", "job", "Lkotlin/coroutines/Continuation;", "delegate", "<init>", "(Lkotlin/coroutines/Continuation;LSh2;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Sh2$a */
    /* loaded from: classes8.dex */
    public static final class C7502a<T> extends C37013Xc0<T> {

        /* renamed from: j */
        public final C35890Sh2 f34064j;

        public C7502a(Continuation<? super T> continuation, C35890Sh2 c35890Sh2) {
            super(continuation, 1);
            this.f34064j = c35890Sh2;
        }

        @Override // p000.C37013Xc0
        /* renamed from: A */
        public String mo76801A() {
            return "AwaitContinuation";
        }

        @Override // p000.C37013Xc0
        /* renamed from: p */
        public Throwable mo76771p(InterfaceC52943zh2 interfaceC52943zh2) {
            Throwable m85069f;
            Object m85077t0 = this.f34064j.m85077t0();
            if ((m85077t0 instanceof C7504c) && (m85069f = ((C7504c) m85077t0).m85069f()) != null) {
                return m85069f;
            }
            if (m85077t0 instanceof C47716qs0) {
                return ((C47716qs0) m85077t0).f105942a;
            }
            return interfaceC52943zh2.mo558F();
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LSh2$b;", "LPh2;", "", "cause", "", "P", "LSh2;", "f", "LSh2;", "parent", "LSh2$c;", "g", "LSh2$c;", TransferTable.COLUMN_STATE, "LKi0;", "h", "LKi0;", "child", "", "i", "Ljava/lang/Object;", "proposedUpdate", "<init>", "(LSh2;LSh2$c;LKi0;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Sh2$b */
    /* loaded from: classes8.dex */
    public static final class C7503b extends AbstractC35188Ph2 {

        /* renamed from: f */
        public final C35890Sh2 f34065f;

        /* renamed from: g */
        public final C7504c f34066g;

        /* renamed from: h */
        public final C34025Ki0 f34067h;

        /* renamed from: i */
        public final Object f34068i;

        public C7503b(C35890Sh2 c35890Sh2, C7504c c7504c, C34025Ki0 c34025Ki0, Object obj) {
            this.f34065f = c35890Sh2;
            this.f34066g = c7504c;
            this.f34067h = c34025Ki0;
            this.f34068i = obj;
        }

        @Override // p000.AbstractC48901ss0
        /* renamed from: P */
        public void mo13153P(Throwable th) {
            this.f34065f.m85087i0(this.f34066g, this.f34067h, this.f34068i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            mo13153P(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010 \u001a\u00020\u001a\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b/\u00100J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\fR\u0011\u0010&\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0011\u0010(\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0014\u0010)\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001dR(\u0010.\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, m28432d2 = {"LSh2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Li12;", "", "proposedException", "", "j", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", C17296a.f69688o, "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "LM83;", "b", "LM83;", "e", "()LM83;", "list", "", "value", "h", "()Z", "k", "(Z)V", "isCompleting", "f", "()Ljava/lang/Throwable;", "m", "rootCause", "i", "isSealed", "g", "isCancelling", "isActive", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "exceptionsHolder", "<init>", "(LM83;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Sh2$c */
    /* loaded from: classes8.dex */
    public static final class C7504c implements InterfaceC42470i12 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: b */
        public final M83 f34069b;

        public C7504c(M83 m83, boolean z, Throwable th) {
            this.f34069b = m83;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m85072a(Throwable th) {
            Throwable m85069f = m85069f();
            if (m85069f == null) {
                m85062m(th);
            } else if (th == m85069f) {
            } else {
                Object m85070d = m85070d();
                if (m85070d == null) {
                    m85063l(th);
                } else if (m85070d instanceof Throwable) {
                    if (th == m85070d) {
                        return;
                    }
                    ArrayList<Throwable> m85071c = m85071c();
                    m85071c.add(m85070d);
                    m85071c.add(th);
                    m85063l(m85071c);
                } else if (m85070d instanceof ArrayList) {
                    ((ArrayList) m85070d).add(th);
                } else {
                    throw new IllegalStateException(("State is " + m85070d).toString());
                }
            }
        }

        @Override // p000.InterfaceC42470i12
        /* renamed from: b */
        public boolean mo35387b() {
            return m85069f() == null;
        }

        /* renamed from: c */
        public final ArrayList<Throwable> m85071c() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        public final Object m85070d() {
            return this._exceptionsHolder;
        }

        @Override // p000.InterfaceC42470i12
        /* renamed from: e */
        public M83 mo35386e() {
            return this.f34069b;
        }

        /* renamed from: f */
        public final Throwable m85069f() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: g */
        public final boolean m85068g() {
            return m85069f() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        /* renamed from: h */
        public final boolean m85067h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean m85066i() {
            C49885uX5 c49885uX5;
            Object m85070d = m85070d();
            c49885uX5 = C36124Th2.f35880e;
            return m85070d == c49885uX5;
        }

        /* renamed from: j */
        public final List<Throwable> m85065j(Throwable th) {
            ArrayList<Throwable> arrayList;
            C49885uX5 c49885uX5;
            Object m85070d = m85070d();
            if (m85070d == null) {
                arrayList = m85071c();
            } else if (m85070d instanceof Throwable) {
                ArrayList<Throwable> m85071c = m85071c();
                m85071c.add(m85070d);
                arrayList = m85071c;
            } else if (m85070d instanceof ArrayList) {
                arrayList = (ArrayList) m85070d;
            } else {
                throw new IllegalStateException(("State is " + m85070d).toString());
            }
            Throwable m85069f = m85069f();
            if (m85069f != null) {
                arrayList.add(0, m85069f);
            }
            if (th != null && !Intrinsics.areEqual(th, m85069f)) {
                arrayList.add(th);
            }
            c49885uX5 = C36124Th2.f35880e;
            m85063l(c49885uX5);
            return arrayList;
        }

        /* renamed from: k */
        public final void m85064k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: l */
        public final void m85063l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: m */
        public final void m85062m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + m85068g() + ", completing=" + m85067h() + ", rootCause=" + m85069f() + ", exceptions=" + m85070d() + ", list=" + mo35386e() + ']';
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, m28432d2 = {"Sh2$d", "Lbx2$b;", "Lbx2;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Sh2$d */
    /* loaded from: classes8.dex */
    public static final class C7505d extends C38856bx2.AbstractC13353b {

        /* renamed from: d */
        public final /* synthetic */ C35890Sh2 f34070d;

        /* renamed from: e */
        public final /* synthetic */ Object f34071e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7505d(C38856bx2 c38856bx2, C35890Sh2 c35890Sh2, Object obj) {
            super(c38856bx2);
            this.f34070d = c35890Sh2;
            this.f34071e = obj;
        }

        @Override // p000.AbstractC28006rp
        /* renamed from: k */
        public Object mo15326i(C38856bx2 c38856bx2) {
            if (this.f34070d.m85077t0() == this.f34071e) {
                return null;
            }
            return C38263ax2.m65211a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"Lkotlin/sequences/SequenceScope;", "Lzh2;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.JobSupport$children$1", m28418f = "JobSupport.kt", m28417i = {1, 1, 1}, m28416l = {952, 954}, m28415m = "invokeSuspend", m28414n = {"$this$sequence", "this_$iv", "cur$iv"}, m28413s = {"L$0", "L$1", "L$2"})
    /* renamed from: Sh2$e */
    /* loaded from: classes8.dex */
    public static final class C7506e extends RestrictedSuspendLambda implements Function2<SequenceScope<? super InterfaceC52943zh2>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f34072h;

        /* renamed from: i */
        public Object f34073i;

        /* renamed from: j */
        public int f34074j;

        /* renamed from: k */
        public /* synthetic */ Object f34075k;

        public C7506e(Continuation<? super C7506e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C7506e c7506e = new C7506e(continuation);
            c7506e.f34075k = obj;
            return c7506e;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:27:0x007e). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            M83 mo35386e;
            SequenceScope sequenceScope;
            C7506e c7506e;
            Object obj2;
            C38856bx2 c38856bx2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f34074j;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c38856bx2 = (C38856bx2) this.f34073i;
                        obj2 = (C37663Zw2) this.f34072h;
                        sequenceScope = (SequenceScope) this.f34075k;
                        ResultKt.throwOnFailure(obj);
                        c7506e = this;
                        c38856bx2 = c38856bx2.m62098D();
                        if (!Intrinsics.areEqual(c38856bx2, obj2)) {
                            if (c38856bx2 instanceof C34025Ki0) {
                                InterfaceC34259Li0 interfaceC34259Li0 = ((C34025Ki0) c38856bx2).f20076f;
                                c7506e.f34075k = sequenceScope;
                                c7506e.f34072h = obj2;
                                c7506e.f34073i = c38856bx2;
                                c7506e.f34074j = 2;
                                if (sequenceScope.yield(interfaceC34259Li0, c7506e) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            c38856bx2 = c38856bx2.m62098D();
                            if (!Intrinsics.areEqual(c38856bx2, obj2)) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.f34075k;
                Object m85077t0 = C35890Sh2.this.m85077t0();
                if (m85077t0 instanceof C34025Ki0) {
                    InterfaceC34259Li0 interfaceC34259Li02 = ((C34025Ki0) m85077t0).f20076f;
                    this.f34074j = 1;
                    if (sequenceScope2.yield(interfaceC34259Li02, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if ((m85077t0 instanceof InterfaceC42470i12) && (mo35386e = ((InterfaceC42470i12) m85077t0).mo35386e()) != null) {
                    sequenceScope = sequenceScope2;
                    c7506e = this;
                    obj2 = mo35386e;
                    c38856bx2 = (C38856bx2) mo35386e.m62099A();
                    if (!Intrinsics.areEqual(c38856bx2, obj2)) {
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super InterfaceC52943zh2> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C7506e) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public C35890Sh2(boolean z) {
        C34422Ma1 c34422Ma1;
        if (z) {
            c34422Ma1 = C36124Th2.f35882g;
        } else {
            c34422Ma1 = C36124Th2.f35881f;
        }
        this._state = c34422Ma1;
        this._parentHandle = null;
    }

    /* renamed from: U0 */
    public static /* synthetic */ CancellationException m85103U0(C35890Sh2 c35890Sh2, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return c35890Sh2.m85105T0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: A0 */
    public final Object m85123A0(Object obj) {
        C49885uX5 c49885uX5;
        C49885uX5 c49885uX52;
        C49885uX5 c49885uX53;
        C49885uX5 c49885uX54;
        C49885uX5 c49885uX55;
        C49885uX5 c49885uX56;
        Throwable th = null;
        Throwable th2 = null;
        while (true) {
            Object m85077t0 = m85077t0();
            if (m85077t0 instanceof C7504c) {
                synchronized (m85077t0) {
                    if (((C7504c) m85077t0).m85066i()) {
                        c49885uX52 = C36124Th2.f35879d;
                        return c49885uX52;
                    }
                    boolean m85068g = ((C7504c) m85077t0).m85068g();
                    if (obj != null || !m85068g) {
                        if (th2 == null) {
                            th2 = m85086j0(obj);
                        }
                        ((C7504c) m85077t0).m85072a(th2);
                    }
                    Throwable m85069f = ((C7504c) m85077t0).m85069f();
                    if (!m85068g) {
                        th = m85069f;
                    }
                    if (th != null) {
                        m85118G0(((C7504c) m85077t0).mo35386e(), th);
                    }
                    c49885uX5 = C36124Th2.f35876a;
                    return c49885uX5;
                }
            } else if (m85077t0 instanceof InterfaceC42470i12) {
                if (th2 == null) {
                    th2 = m85086j0(obj);
                }
                InterfaceC42470i12 interfaceC42470i12 = (InterfaceC42470i12) m85077t0;
                if (interfaceC42470i12.mo35387b()) {
                    if (m85099X0(interfaceC42470i12, th2)) {
                        c49885uX54 = C36124Th2.f35876a;
                        return c49885uX54;
                    }
                } else {
                    Object m85097Y0 = m85097Y0(m85077t0, new C47716qs0(th2, false, 2, null));
                    c49885uX55 = C36124Th2.f35876a;
                    if (m85097Y0 != c49885uX55) {
                        c49885uX56 = C36124Th2.f35878c;
                        if (m85097Y0 != c49885uX56) {
                            return m85097Y0;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + m85077t0).toString());
                    }
                }
            } else {
                c49885uX53 = C36124Th2.f35879d;
                return c49885uX53;
            }
        }
    }

    /* renamed from: B0 */
    public final boolean m85122B0(Object obj) {
        Object m85097Y0;
        C49885uX5 c49885uX5;
        C49885uX5 c49885uX52;
        do {
            m85097Y0 = m85097Y0(m85077t0(), obj);
            c49885uX5 = C36124Th2.f35876a;
            if (m85097Y0 == c49885uX5) {
                return false;
            }
            if (m85097Y0 == C36124Th2.f35877b) {
                return true;
            }
            c49885uX52 = C36124Th2.f35878c;
        } while (m85097Y0 == c49885uX52);
        mo79833W(m85097Y0);
        return true;
    }

    /* renamed from: C0 */
    public final Object m85121C0(Object obj) {
        Object m85097Y0;
        C49885uX5 c49885uX5;
        C49885uX5 c49885uX52;
        do {
            m85097Y0 = m85097Y0(m85077t0(), obj);
            c49885uX5 = C36124Th2.f35876a;
            if (m85097Y0 != c49885uX5) {
                c49885uX52 = C36124Th2.f35878c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m85082n0(obj));
            }
        } while (m85097Y0 == c49885uX52);
        return m85097Y0;
    }

    @Override // p000.InterfaceC52943zh2
    /* renamed from: D */
    public final InterfaceC46067o51 mo559D(boolean z, boolean z2, Function1<? super Throwable, Unit> function1) {
        C47716qs0 c47716qs0;
        AbstractC35188Ph2 m85120D0 = m85120D0(function1, z);
        while (true) {
            Object m85077t0 = m85077t0();
            if (m85077t0 instanceof C34422Ma1) {
                C34422Ma1 c34422Ma1 = (C34422Ma1) m85077t0;
                if (c34422Ma1.mo35387b()) {
                    if (C22859i1.m35391a(f34063b, this, m85077t0, m85120D0)) {
                        return m85120D0;
                    }
                } else {
                    m85115L0(c34422Ma1);
                }
            } else {
                Throwable th = null;
                if (m85077t0 instanceof InterfaceC42470i12) {
                    M83 mo35386e = ((InterfaceC42470i12) m85077t0).mo35386e();
                    if (mo35386e == null) {
                        if (m85077t0 != null) {
                            m85114M0((AbstractC35188Ph2) m85077t0);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        }
                    } else {
                        InterfaceC46067o51 interfaceC46067o51 = W83.f40466b;
                        if (z && (m85077t0 instanceof C7504c)) {
                            synchronized (m85077t0) {
                                th = ((C7504c) m85077t0).m85069f();
                                if (th == null || ((function1 instanceof C34025Ki0) && !((C7504c) m85077t0).m85067h())) {
                                    if (m85104U(m85077t0, mo35386e, m85120D0)) {
                                        if (th == null) {
                                            return m85120D0;
                                        }
                                        interfaceC46067o51 = m85120D0;
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                function1.invoke(th);
                            }
                            return interfaceC46067o51;
                        } else if (m85104U(m85077t0, mo35386e, m85120D0)) {
                            return m85120D0;
                        }
                    }
                } else {
                    if (z2) {
                        if (m85077t0 instanceof C47716qs0) {
                            c47716qs0 = (C47716qs0) m85077t0;
                        } else {
                            c47716qs0 = null;
                        }
                        if (c47716qs0 != null) {
                            th = c47716qs0.f105942a;
                        }
                        function1.invoke(th);
                    }
                    return W83.f40466b;
                }
            }
        }
    }

    /* renamed from: D0 */
    public final AbstractC35188Ph2 m85120D0(Function1<? super Throwable, Unit> function1, boolean z) {
        AbstractC35188Ph2 abstractC35188Ph2 = null;
        if (z) {
            if (function1 instanceof AbstractC31678Ah2) {
                abstractC35188Ph2 = (AbstractC31678Ah2) function1;
            }
            if (abstractC35188Ph2 == null) {
                abstractC35188Ph2 = new U92(function1);
            }
        } else {
            if (function1 instanceof AbstractC35188Ph2) {
                abstractC35188Ph2 = (AbstractC35188Ph2) function1;
            }
            if (abstractC35188Ph2 == null) {
                abstractC35188Ph2 = new V92(function1);
            }
        }
        abstractC35188Ph2.m89916R(this);
        return abstractC35188Ph2;
    }

    /* renamed from: E0 */
    public String mo18344E0() {
        return C39783dV0.m44216a(this);
    }

    @Override // p000.InterfaceC52943zh2
    /* renamed from: F */
    public final CancellationException mo558F() {
        Object m85077t0 = m85077t0();
        if (m85077t0 instanceof C7504c) {
            Throwable m85069f = ((C7504c) m85077t0).m85069f();
            if (m85069f != null) {
                CancellationException m85105T0 = m85105T0(m85069f, C39783dV0.m44216a(this) + " is cancelling");
                if (m85105T0 != null) {
                    return m85105T0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(m85077t0 instanceof InterfaceC42470i12)) {
            if (m85077t0 instanceof C47716qs0) {
                return m85103U0(this, ((C47716qs0) m85077t0).f105942a, null, 1, null);
            }
            return new JobCancellationException(C39783dV0.m44216a(this) + " has completed normally", null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    /* renamed from: F0 */
    public final C34025Ki0 m85119F0(C38856bx2 c38856bx2) {
        while (c38856bx2.mo62094I()) {
            c38856bx2 = c38856bx2.m62097E();
        }
        while (true) {
            c38856bx2 = c38856bx2.m62098D();
            if (!c38856bx2.mo62094I()) {
                if (c38856bx2 instanceof C34025Ki0) {
                    return (C34025Ki0) c38856bx2;
                }
                if (c38856bx2 instanceof M83) {
                    return null;
                }
            }
        }
    }

    /* renamed from: G0 */
    public final void m85118G0(M83 m83, Throwable th) {
        m85116I0(th);
        CompletionHandlerException completionHandlerException = null;
        for (C38856bx2 c38856bx2 = (C38856bx2) m83.m62099A(); !Intrinsics.areEqual(c38856bx2, m83); c38856bx2 = c38856bx2.m62098D()) {
            if (c38856bx2 instanceof AbstractC31678Ah2) {
                AbstractC35188Ph2 abstractC35188Ph2 = (AbstractC35188Ph2) c38856bx2;
                try {
                    abstractC35188Ph2.mo13153P(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + abstractC35188Ph2 + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo18336v0(completionHandlerException);
        }
        m85089e0(th);
    }

    /* renamed from: H0 */
    public final void m85117H0(M83 m83, Throwable th) {
        CompletionHandlerException completionHandlerException = null;
        for (C38856bx2 c38856bx2 = (C38856bx2) m83.m62099A(); !Intrinsics.areEqual(c38856bx2, m83); c38856bx2 = c38856bx2.m62098D()) {
            if (c38856bx2 instanceof AbstractC35188Ph2) {
                AbstractC35188Ph2 abstractC35188Ph2 = (AbstractC35188Ph2) c38856bx2;
                try {
                    abstractC35188Ph2.mo13153P(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + abstractC35188Ph2 + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo18336v0(completionHandlerException);
        }
    }

    /* renamed from: I0 */
    public void m85116I0(Throwable th) {
    }

    /* renamed from: J0 */
    public void mo18343J0(Object obj) {
    }

    /* renamed from: K0 */
    public void mo40821K0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [a02] */
    /* renamed from: L0 */
    public final void m85115L0(C34422Ma1 c34422Ma1) {
        M83 m83 = new M83();
        if (!c34422Ma1.mo35387b()) {
            m83 = new C37699a02(m83);
        }
        C22859i1.m35391a(f34063b, this, c34422Ma1, m83);
    }

    /* renamed from: M0 */
    public final void m85114M0(AbstractC35188Ph2 abstractC35188Ph2) {
        abstractC35188Ph2.m62083w(new M83());
        C22859i1.m35391a(f34063b, this, abstractC35188Ph2, abstractC35188Ph2.m62098D());
    }

    /* renamed from: N0 */
    public final <T, R> void m85112N0(InterfaceC48304rr5<? super R> interfaceC48304rr5, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object m85077t0;
        do {
            m85077t0 = m85077t0();
            if (interfaceC48304rr5.mo15174i()) {
                return;
            }
            if (!(m85077t0 instanceof InterfaceC42470i12)) {
                if (interfaceC48304rr5.mo15172l()) {
                    if (m85077t0 instanceof C47716qs0) {
                        interfaceC48304rr5.mo15169o(((C47716qs0) m85077t0).f105942a);
                        return;
                    } else {
                        C32816Fd6.m106837b(function2, C36124Th2.m83151h(m85077t0), interfaceC48304rr5.mo15171m());
                        return;
                    }
                }
                return;
            }
        } while (m85108R0(m85077t0) != 0);
        interfaceC48304rr5.mo15173j(mo551n(new C40595er5(interfaceC48304rr5, function2)));
    }

    @Override // p000.VE3
    /* renamed from: O */
    public CancellationException mo80171O() {
        Throwable th;
        Object m85077t0 = m85077t0();
        CancellationException cancellationException = null;
        if (m85077t0 instanceof C7504c) {
            th = ((C7504c) m85077t0).m85069f();
        } else if (m85077t0 instanceof C47716qs0) {
            th = ((C47716qs0) m85077t0).f105942a;
        } else if (!(m85077t0 instanceof InterfaceC42470i12)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + m85077t0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is " + m85107S0(m85077t0), th, this);
        }
        return cancellationException;
    }

    /* renamed from: O0 */
    public final void m85111O0(AbstractC35188Ph2 abstractC35188Ph2) {
        Object m85077t0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C34422Ma1 c34422Ma1;
        do {
            m85077t0 = m85077t0();
            if (m85077t0 instanceof AbstractC35188Ph2) {
                if (m85077t0 != abstractC35188Ph2) {
                    return;
                }
                atomicReferenceFieldUpdater = f34063b;
                c34422Ma1 = C36124Th2.f35882g;
            } else if ((m85077t0 instanceof InterfaceC42470i12) && ((InterfaceC42470i12) m85077t0).mo35386e() != null) {
                abstractC35188Ph2.mo62093J();
                return;
            } else {
                return;
            }
        } while (!C22859i1.m35391a(atomicReferenceFieldUpdater, this, m85077t0, c34422Ma1));
    }

    @Override // p000.InterfaceC52943zh2
    /* renamed from: P */
    public final Object mo557P(Continuation<? super Unit> continuation) {
        if (!m85075y0()) {
            C34018Kh2.m98499m(continuation.getContext());
            return Unit.INSTANCE;
        }
        Object m85073z0 = m85073z0(continuation);
        if (m85073z0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return m85073z0;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: P0 */
    public final <T, R> void m85110P0(InterfaceC48304rr5<? super R> interfaceC48304rr5, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object m85077t0 = m85077t0();
        if (m85077t0 instanceof C47716qs0) {
            interfaceC48304rr5.mo15169o(((C47716qs0) m85077t0).f105942a);
        } else {
            C38061ad0.m70996e(function2, C36124Th2.m83151h(m85077t0), interfaceC48304rr5.mo15171m(), null, 4, null);
        }
    }

    @Override // p000.InterfaceC52943zh2
    /* renamed from: Q */
    public final InterfaceC33791Ji0 mo556Q(InterfaceC34259Li0 interfaceC34259Li0) {
        return (InterfaceC33791Ji0) InterfaceC52943zh2.C31478a.m547d(this, true, false, new C34025Ki0(interfaceC34259Li0), 2, null);
    }

    /* renamed from: Q0 */
    public final void m85109Q0(InterfaceC33791Ji0 interfaceC33791Ji0) {
        this._parentHandle = interfaceC33791Ji0;
    }

    /* renamed from: R0 */
    public final int m85108R0(Object obj) {
        C34422Ma1 c34422Ma1;
        if (obj instanceof C34422Ma1) {
            if (((C34422Ma1) obj).mo35387b()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34063b;
            c34422Ma1 = C36124Th2.f35882g;
            if (!C22859i1.m35391a(atomicReferenceFieldUpdater, this, obj, c34422Ma1)) {
                return -1;
            }
            mo40821K0();
            return 1;
        } else if (!(obj instanceof C37699a02)) {
            return 0;
        } else {
            if (!C22859i1.m35391a(f34063b, this, obj, ((C37699a02) obj).mo35386e())) {
                return -1;
            }
            mo40821K0();
            return 1;
        }
    }

    /* renamed from: S0 */
    public final String m85107S0(Object obj) {
        if (obj instanceof C7504c) {
            C7504c c7504c = (C7504c) obj;
            if (c7504c.m85068g()) {
                return "Cancelling";
            }
            if (!c7504c.m85067h()) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof InterfaceC42470i12) {
            if (((InterfaceC42470i12) obj).mo35387b()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C47716qs0) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* renamed from: T0 */
    public final CancellationException m85105T0(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = mo18337f0();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: U */
    public final boolean m85104U(Object obj, M83 m83, AbstractC35188Ph2 abstractC35188Ph2) {
        int m62089O;
        C7505d c7505d = new C7505d(abstractC35188Ph2, this, obj);
        do {
            m62089O = m83.m62097E().m62089O(abstractC35188Ph2, m83, c7505d);
            if (m62089O == 1) {
                return true;
            }
        } while (m62089O != 2);
        return false;
    }

    /* renamed from: V */
    public final void m85102V(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }

    /* renamed from: V0 */
    public final String m85101V0() {
        return mo18344E0() + CoreConstants.CURLY_LEFT + m85107S0(m85077t0()) + CoreConstants.CURLY_RIGHT;
    }

    /* renamed from: W */
    public void mo79833W(Object obj) {
    }

    /* renamed from: W0 */
    public final boolean m85100W0(InterfaceC42470i12 interfaceC42470i12, Object obj) {
        if (!C22859i1.m35391a(f34063b, this, interfaceC42470i12, C36124Th2.m83152g(obj))) {
            return false;
        }
        m85116I0(null);
        mo18343J0(obj);
        m85088h0(interfaceC42470i12, obj);
        return true;
    }

    /* renamed from: X0 */
    public final boolean m85099X0(InterfaceC42470i12 interfaceC42470i12, Throwable th) {
        M83 m85079r0 = m85079r0(interfaceC42470i12);
        if (m85079r0 == null) {
            return false;
        }
        if (!C22859i1.m35391a(f34063b, this, interfaceC42470i12, new C7504c(m85079r0, false, th))) {
            return false;
        }
        m85118G0(m85079r0, th);
        return true;
    }

    /* renamed from: Y */
    public final Object m85098Y(Continuation<Object> continuation) {
        Object m85077t0;
        do {
            m85077t0 = m85077t0();
            if (!(m85077t0 instanceof InterfaceC42470i12)) {
                if (!(m85077t0 instanceof C47716qs0)) {
                    return C36124Th2.m83151h(m85077t0);
                }
                throw ((C47716qs0) m85077t0).f105942a;
            }
        } while (m85108R0(m85077t0) < 0);
        return m85096Z(continuation);
    }

    /* renamed from: Y0 */
    public final Object m85097Y0(Object obj, Object obj2) {
        C49885uX5 c49885uX5;
        C49885uX5 c49885uX52;
        if (!(obj instanceof InterfaceC42470i12)) {
            c49885uX52 = C36124Th2.f35876a;
            return c49885uX52;
        } else if (((obj instanceof C34422Ma1) || (obj instanceof AbstractC35188Ph2)) && !(obj instanceof C34025Ki0) && !(obj2 instanceof C47716qs0)) {
            if (m85100W0((InterfaceC42470i12) obj, obj2)) {
                return obj2;
            }
            c49885uX5 = C36124Th2.f35878c;
            return c49885uX5;
        } else {
            return m85095Z0((InterfaceC42470i12) obj, obj2);
        }
    }

    /* renamed from: Z */
    public final Object m85096Z(Continuation<Object> continuation) {
        C7502a c7502a = new C7502a(IntrinsicsKt.intercepted(continuation), this);
        c7502a.m76766u();
        C37481Zc0.m72855a(c7502a, mo551n(new C43272jN4(c7502a)));
        Object m76770q = c7502a.m76770q();
        if (m76770q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* renamed from: Z0 */
    public final Object m85095Z0(InterfaceC42470i12 interfaceC42470i12, Object obj) {
        C7504c c7504c;
        C47716qs0 c47716qs0;
        C49885uX5 c49885uX5;
        C49885uX5 c49885uX52;
        C49885uX5 c49885uX53;
        M83 m85079r0 = m85079r0(interfaceC42470i12);
        if (m85079r0 == null) {
            c49885uX53 = C36124Th2.f35878c;
            return c49885uX53;
        }
        ?? r2 = 0;
        if (interfaceC42470i12 instanceof C7504c) {
            c7504c = (C7504c) interfaceC42470i12;
        } else {
            c7504c = null;
        }
        boolean z = false;
        if (c7504c == null) {
            c7504c = new C7504c(m85079r0, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (c7504c) {
            if (c7504c.m85067h()) {
                c49885uX52 = C36124Th2.f35876a;
                return c49885uX52;
            }
            c7504c.m85064k(true);
            if (c7504c != interfaceC42470i12 && !C22859i1.m35391a(f34063b, this, interfaceC42470i12, c7504c)) {
                c49885uX5 = C36124Th2.f35878c;
                return c49885uX5;
            }
            boolean m85068g = c7504c.m85068g();
            if (obj instanceof C47716qs0) {
                c47716qs0 = (C47716qs0) obj;
            } else {
                c47716qs0 = null;
            }
            if (c47716qs0 != null) {
                c7504c.m85072a(c47716qs0.f105942a);
            }
            Throwable m85069f = c7504c.m85069f();
            if (!m85068g) {
                z = true;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                r2 = m85069f;
            }
            objectRef.element = r2;
            Unit unit = Unit.INSTANCE;
            if (r2 != 0) {
                m85118G0(m85079r0, r2);
            }
            C34025Ki0 m85084l0 = m85084l0(interfaceC42470i12);
            if (m85084l0 != null && m85093a1(c7504c, m85084l0, obj)) {
                return C36124Th2.f35877b;
            }
            return m85085k0(c7504c, obj);
        }
    }

    /* renamed from: a0 */
    public final boolean m85094a0(Throwable th) {
        return m85092b0(th);
    }

    /* renamed from: a1 */
    public final boolean m85093a1(C7504c c7504c, C34025Ki0 c34025Ki0, Object obj) {
        while (InterfaceC52943zh2.C31478a.m547d(c34025Ki0.f20076f, false, false, new C7503b(this, c7504c, c34025Ki0, obj), 1, null) == W83.f40466b) {
            c34025Ki0 = m85119F0(c34025Ki0);
            if (c34025Ki0 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC52943zh2
    /* renamed from: b */
    public boolean mo555b() {
        Object m85077t0 = m85077t0();
        if ((m85077t0 instanceof InterfaceC42470i12) && ((InterfaceC42470i12) m85077t0).mo35387b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    public final boolean m85092b0(Object obj) {
        Object obj2;
        C49885uX5 c49885uX5;
        C49885uX5 c49885uX52;
        C49885uX5 c49885uX53;
        obj2 = C36124Th2.f35876a;
        if (mo29820q0() && (obj2 = m85090d0(obj)) == C36124Th2.f35877b) {
            return true;
        }
        c49885uX5 = C36124Th2.f35876a;
        if (obj2 == c49885uX5) {
            obj2 = m85123A0(obj);
        }
        c49885uX52 = C36124Th2.f35876a;
        if (obj2 == c49885uX52 || obj2 == C36124Th2.f35877b) {
            return true;
        }
        c49885uX53 = C36124Th2.f35879d;
        if (obj2 == c49885uX53) {
            return false;
        }
        mo79833W(obj2);
        return true;
    }

    @Override // p000.InterfaceC52943zh2
    /* renamed from: c */
    public final boolean mo554c() {
        return !(m85077t0() instanceof InterfaceC42470i12);
    }

    /* renamed from: c0 */
    public void mo85091c0(Throwable th) {
        m85092b0(th);
    }

    @Override // p000.InterfaceC52943zh2
    /* renamed from: d */
    public final Sequence<InterfaceC52943zh2> mo553d() {
        Sequence<InterfaceC52943zh2> sequence;
        sequence = SequencesKt__SequenceBuilderKt.sequence(new C7506e(null));
        return sequence;
    }

    /* renamed from: d0 */
    public final Object m85090d0(Object obj) {
        C49885uX5 c49885uX5;
        Object m85097Y0;
        C49885uX5 c49885uX52;
        do {
            Object m85077t0 = m85077t0();
            if ((m85077t0 instanceof InterfaceC42470i12) && (!(m85077t0 instanceof C7504c) || !((C7504c) m85077t0).m85067h())) {
                m85097Y0 = m85097Y0(m85077t0, new C47716qs0(m85086j0(obj), false, 2, null));
                c49885uX52 = C36124Th2.f35878c;
            } else {
                c49885uX5 = C36124Th2.f35876a;
                return c49885uX5;
            }
        } while (m85097Y0 == c49885uX52);
        return m85097Y0;
    }

    /* renamed from: e0 */
    public final boolean m85089e0(Throwable th) {
        if (mo79831x0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC33791Ji0 m85078s0 = m85078s0();
        if (m85078s0 != null && m85078s0 != W83.f40466b) {
            if (m85078s0.mo78793d(th) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    @Override // p000.InterfaceC52943zh2, p000.InterfaceC44162ks4
    /* renamed from: f */
    public void mo552f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo18337f0(), null, this);
        }
        mo85091c0(cancellationException);
    }

    /* renamed from: f0 */
    public String mo18337f0() {
        return "Job was cancelled";
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) InterfaceC52943zh2.C31478a.m549b(this, r, function2);
    }

    /* renamed from: g0 */
    public boolean mo78318g0(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (m85092b0(th) && mo85080p0()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) InterfaceC52943zh2.C31478a.m548c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return InterfaceC52943zh2.f122077a0;
    }

    /* renamed from: h0 */
    public final void m85088h0(InterfaceC42470i12 interfaceC42470i12, Object obj) {
        C47716qs0 c47716qs0;
        InterfaceC33791Ji0 m85078s0 = m85078s0();
        if (m85078s0 != null) {
            m85078s0.dispose();
            m85109Q0(W83.f40466b);
        }
        Throwable th = null;
        if (obj instanceof C47716qs0) {
            c47716qs0 = (C47716qs0) obj;
        } else {
            c47716qs0 = null;
        }
        if (c47716qs0 != null) {
            th = c47716qs0.f105942a;
        }
        if (interfaceC42470i12 instanceof AbstractC35188Ph2) {
            try {
                ((AbstractC35188Ph2) interfaceC42470i12).mo13153P(th);
                return;
            } catch (Throwable th2) {
                mo18336v0(new CompletionHandlerException("Exception in completion handler " + interfaceC42470i12 + " for " + this, th2));
                return;
            }
        }
        M83 mo35386e = interfaceC42470i12.mo35386e();
        if (mo35386e != null) {
            m85117H0(mo35386e, th);
        }
    }

    /* renamed from: i0 */
    public final void m85087i0(C7504c c7504c, C34025Ki0 c34025Ki0, Object obj) {
        C34025Ki0 m85119F0 = m85119F0(c34025Ki0);
        if (m85119F0 != null && m85093a1(c7504c, m85119F0, obj)) {
            return;
        }
        mo79833W(m85085k0(c7504c, obj));
    }

    @Override // p000.InterfaceC52943zh2
    public final boolean isCancelled() {
        Object m85077t0 = m85077t0();
        if (!(m85077t0 instanceof C47716qs0) && (!(m85077t0 instanceof C7504c) || !((C7504c) m85077t0).m85068g())) {
            return false;
        }
        return true;
    }

    /* renamed from: j0 */
    public final Throwable m85086j0(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(mo18337f0(), null, this);
            }
            return th;
        } else if (obj != null) {
            return ((VE3) obj).mo80171O();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* renamed from: k0 */
    public final Object m85085k0(C7504c c7504c, Object obj) {
        C47716qs0 c47716qs0;
        Throwable th;
        boolean m85068g;
        Throwable m85081o0;
        if (obj instanceof C47716qs0) {
            c47716qs0 = (C47716qs0) obj;
        } else {
            c47716qs0 = null;
        }
        if (c47716qs0 != null) {
            th = c47716qs0.f105942a;
        } else {
            th = null;
        }
        synchronized (c7504c) {
            m85068g = c7504c.m85068g();
            List<Throwable> m85065j = c7504c.m85065j(th);
            m85081o0 = m85081o0(c7504c, m85065j);
            if (m85081o0 != null) {
                m85102V(m85081o0, m85065j);
            }
        }
        boolean z = false;
        if (m85081o0 != null && m85081o0 != th) {
            obj = new C47716qs0(m85081o0, false, 2, null);
        }
        if (m85081o0 != null) {
            if ((m85089e0(m85081o0) || mo16004u0(m85081o0)) ? true : true) {
                if (obj != null) {
                    ((C47716qs0) obj).m16900b();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        if (!m85068g) {
            m85116I0(m85081o0);
        }
        mo18343J0(obj);
        C22859i1.m35391a(f34063b, this, c7504c, C36124Th2.m83152g(obj));
        m85088h0(c7504c, obj);
        return obj;
    }

    /* renamed from: l0 */
    public final C34025Ki0 m85084l0(InterfaceC42470i12 interfaceC42470i12) {
        C34025Ki0 c34025Ki0 = interfaceC42470i12 instanceof C34025Ki0 ? (C34025Ki0) interfaceC42470i12 : null;
        if (c34025Ki0 == null) {
            M83 mo35386e = interfaceC42470i12.mo35386e();
            if (mo35386e != null) {
                return m85119F0(mo35386e);
            }
            return null;
        }
        return c34025Ki0;
    }

    /* renamed from: m0 */
    public final Object m85083m0() {
        Object m85077t0 = m85077t0();
        if (!(m85077t0 instanceof InterfaceC42470i12)) {
            if (!(m85077t0 instanceof C47716qs0)) {
                return C36124Th2.m83151h(m85077t0);
            }
            throw ((C47716qs0) m85077t0).f105942a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return InterfaceC52943zh2.C31478a.m546e(this, key);
    }

    @Override // p000.InterfaceC52943zh2
    /* renamed from: n */
    public final InterfaceC46067o51 mo551n(Function1<? super Throwable, Unit> function1) {
        return mo559D(false, true, function1);
    }

    /* renamed from: n0 */
    public final Throwable m85082n0(Object obj) {
        C47716qs0 c47716qs0 = obj instanceof C47716qs0 ? (C47716qs0) obj : null;
        if (c47716qs0 != null) {
            return c47716qs0.f105942a;
        }
        return null;
    }

    /* renamed from: o0 */
    public final Throwable m85081o0(C7504c c7504c, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!c7504c.m85068g()) {
                return null;
            }
            return new JobCancellationException(mo18337f0(), null, this);
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: p0 */
    public boolean mo85080p0() {
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return InterfaceC52943zh2.C31478a.m545f(this, coroutineContext);
    }

    /* renamed from: q0 */
    public boolean mo29820q0() {
        return false;
    }

    /* renamed from: r0 */
    public final M83 m85079r0(InterfaceC42470i12 interfaceC42470i12) {
        M83 mo35386e = interfaceC42470i12.mo35386e();
        if (mo35386e == null) {
            if (interfaceC42470i12 instanceof C34422Ma1) {
                return new M83();
            }
            if (interfaceC42470i12 instanceof AbstractC35188Ph2) {
                m85114M0((AbstractC35188Ph2) interfaceC42470i12);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC42470i12).toString());
        }
        return mo35386e;
    }

    /* renamed from: s0 */
    public final InterfaceC33791Ji0 m85078s0() {
        return (InterfaceC33791Ji0) this._parentHandle;
    }

    @Override // p000.InterfaceC52943zh2
    public final boolean start() {
        int m85108R0;
        do {
            m85108R0 = m85108R0(m85077t0());
            if (m85108R0 == 0) {
                return false;
            }
        } while (m85108R0 != 1);
        return true;
    }

    /* renamed from: t0 */
    public final Object m85077t0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC33083Gh3)) {
                return obj;
            }
            ((AbstractC33083Gh3) obj).mo15332c(this);
        }
    }

    public String toString() {
        return m85101V0() + '@' + C39783dV0.m44215b(this);
    }

    /* renamed from: u0 */
    public boolean mo16004u0(Throwable th) {
        return false;
    }

    /* renamed from: v0 */
    public void mo18336v0(Throwable th) {
        throw th;
    }

    /* renamed from: w0 */
    public final void m85076w0(InterfaceC52943zh2 interfaceC52943zh2) {
        if (interfaceC52943zh2 == null) {
            m85109Q0(W83.f40466b);
            return;
        }
        interfaceC52943zh2.start();
        InterfaceC33791Ji0 mo556Q = interfaceC52943zh2.mo556Q(this);
        m85109Q0(mo556Q);
        if (mo554c()) {
            mo556Q.dispose();
            m85109Q0(W83.f40466b);
        }
    }

    /* renamed from: x0 */
    public boolean mo79831x0() {
        return false;
    }

    /* renamed from: y0 */
    public final boolean m85075y0() {
        Object m85077t0;
        do {
            m85077t0 = m85077t0();
            if (!(m85077t0 instanceof InterfaceC42470i12)) {
                return false;
            }
        } while (m85108R0(m85077t0) < 0);
        return true;
    }

    @Override // p000.InterfaceC34259Li0
    /* renamed from: z */
    public final void mo85074z(VE3 ve3) {
        m85092b0(ve3);
    }

    /* renamed from: z0 */
    public final Object m85073z0(Continuation<? super Unit> continuation) {
        C37013Xc0 c37013Xc0 = new C37013Xc0(IntrinsicsKt.intercepted(continuation), 1);
        c37013Xc0.m76766u();
        C37481Zc0.m72855a(c37013Xc0, mo551n(new C43865kN4(c37013Xc0)));
        Object m76770q = c37013Xc0.m76770q();
        if (m76770q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (m76770q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return m76770q;
        }
        return Unit.INSTANCE;
    }
}
