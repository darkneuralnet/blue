package p000;

import com.airbnb.mvrx.FlowExtensionsKt;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;
import p000.AN2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S extends AN2
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001rB\u0019\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\b\b\u0002\u0010O\u001a\u00020N¢\u0006\u0004\bp\u0010qJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0017J!\u0010\f\u001a\u00020\u00052\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\nH\u0004J\u0013\u0010\r\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u00020\u00052!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00050\tH\u0004Jg\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001c\b\u0002\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0018\u00010\u00182#\u0010\u000b\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0002\b\nH\u0014J\u0081\u0001\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0001\u0010\u0014*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001c\b\u0002\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0018\u00010\u00182#\u0010\u000b\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0002\b\nH\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001fJg\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00010 2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001c\b\u0002\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0018\u00010\u00182#\u0010\u000b\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0002\b\nH\u0014JC\u0010!\u001a\u00020\u001c\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00010 2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0002\b\nH\u0014J6\u0010\"\u001a\u00020\u001c2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001bH\u0004ø\u0001\u0000¢\u0006\u0004\b\"\u0010#JP\u0010\"\u001a\u00020\u001c\"\u0004\b\u0001\u0010$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001bH\u0004ø\u0001\u0000¢\u0006\u0004\b\"\u0010&Jp\u0010\"\u001a\u00020\u001c\"\u0004\b\u0001\u0010$\"\u0004\b\u0002\u0010'2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00182(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00030)H\u0004ø\u0001\u0000¢\u0006\u0004\b\"\u0010*J\u0090\u0001\u0010\"\u001a\u00020\u001c\"\u0004\b\u0001\u0010$\"\u0004\b\u0002\u0010'\"\u0004\b\u0003\u0010+2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00182\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00182.\u0010\u0012\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00030-H\u0004ø\u0001\u0000¢\u0006\u0004\b\"\u0010.J°\u0001\u0010\"\u001a\u00020\u001c\"\u0004\b\u0001\u0010$\"\u0004\b\u0002\u0010'\"\u0004\b\u0003\u0010+\"\u0004\b\u0004\u0010/2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00182\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00182\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u001824\u0010\u0012\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u000301H\u0004ø\u0001\u0000¢\u0006\u0004\b\"\u00102JÐ\u0001\u0010\"\u001a\u00020\u001c\"\u0004\b\u0001\u0010$\"\u0004\b\u0002\u0010'\"\u0004\b\u0003\u0010+\"\u0004\b\u0004\u0010/\"\u0004\b\u0005\u001032\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00182\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00182\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u00182\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00050\u00182:\u0010\u0012\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u000305H\u0004ø\u0001\u0000¢\u0006\u0004\b\"\u00106Jð\u0001\u0010\"\u001a\u00020\u001c\"\u0004\b\u0001\u0010$\"\u0004\b\u0002\u0010'\"\u0004\b\u0003\u0010+\"\u0004\b\u0004\u0010/\"\u0004\b\u0005\u00103\"\u0004\b\u0006\u001072\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00182\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00182\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u00182\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00050\u00182\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u00182@\u0010\u0012\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u000309H\u0004ø\u0001\u0000¢\u0006\u0004\b\"\u0010:J\u0090\u0002\u0010\"\u001a\u00020\u001c\"\u0004\b\u0001\u0010$\"\u0004\b\u0002\u0010'\"\u0004\b\u0003\u0010+\"\u0004\b\u0004\u0010/\"\u0004\b\u0005\u00103\"\u0004\b\u0006\u00107\"\u0004\b\u0007\u0010;2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00182\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00182\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u00182\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00050\u00182\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u00182\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00070\u00182F\u0010\u0012\u001aB\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00030=H\u0004ø\u0001\u0000¢\u0006\u0004\b\"\u0010>J\u0082\u0001\u0010C\u001a\u00020\u001c\"\u0004\b\u0001\u0010\u00142\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u00182&\b\u0002\u0010A\u001a \b\u0001\u0012\u0004\u0012\u00020@\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001b2&\b\u0002\u0010B\u001a \b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001bH\u0004ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ^\u0010K\u001a\u00020\u001c\"\b\b\u0001\u0010\u0014*\u00020\u0003*\b\u0012\u0004\u0012\u00028\u00010 2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010H\u001a\u00020G2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\b\u0010M\u001a\u00020LH\u0016R \u0010O\u001a\u00020N8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010T\u001a\u0004\bQ\u0010RR&\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000U8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010T\u001a\u0004\bX\u0010YR\u0017\u0010\\\u001a\u00020[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001e\u0010a\u001a\f0`R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\"\u0010d\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010\u00030c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR8\u0010i\u001a&\u0012\f\u0012\n g*\u0004\u0018\u00010L0L g*\u0012\u0012\f\u0012\n g*\u0004\u0018\u00010L0L\u0018\u00010h0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0011\u001a\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0017\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000 8F¢\u0006\u0006\u001a\u0004\bm\u0010n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006s"}, m28432d2 = {"LRN2;", "LAN2;", "S", "", "initialState", "", "validateState", "(LAN2;)V", "onCleared", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "reducer", "setState", "awaitState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/ParameterName;", "name", TransferTable.COLUMN_STATE, "action", "withState", "T", "LhZ0;", "LSC0;", "dispatcher", "Lkotlin/reflect/KProperty1;", "Ldp;", "retainValue", "Lkotlin/Function2;", "Lzh2;", "execute", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)Lzh2;", "LEu1;", "setOnEach", "onEach", "(Lkotlin/jvm/functions/Function2;)Lzh2;", "A", "prop1", "(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)Lzh2;", "B", "prop2", "Lkotlin/Function3;", "(Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function3;)Lzh2;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "prop3", "Lkotlin/Function4;", "(Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function4;)Lzh2;", "D", "prop4", "Lkotlin/Function5;", "(Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function5;)Lzh2;", "E", "prop5", "Lkotlin/Function6;", "(Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function6;)Lzh2;", "F", "prop6", "Lkotlin/Function7;", "(Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function7;)Lzh2;", "G", "prop7", "Lkotlin/Function8;", "(Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function8;)Lzh2;", "asyncProp", "", "onFail", "onSuccess", "onAsync", "(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;", "LLifecycleOwner;", "lifecycleOwner", "La01;", "deliveryMode", "resolveSubscription$mvrx_release", "(LEu1;LLifecycleOwner;La01;Lkotlin/jvm/functions/Function2;)Lzh2;", "resolveSubscription", "", "toString", "LTN2;", "configFactory", "LTN2;", "getConfigFactory", "()LTN2;", "getConfigFactory$annotations", "()V", "LSN2;", "config", "LSN2;", "getConfig", "()LSN2;", "getConfig$annotations", "LZC0;", "viewModelScope", "LZC0;", "getViewModelScope", "()LZC0;", "LRN2$b;", "repository", "LRN2$b;", "Ljava/util/concurrent/ConcurrentHashMap;", "lastDeliveredStates", "Ljava/util/concurrent/ConcurrentHashMap;", "", "kotlin.jvm.PlatformType", "", "activeSubscriptions", "Ljava/util/Set;", "getState$mvrx_release", "()LAN2;", "getStateFlow", "()LEu1;", "stateFlow", "<init>", "(LAN2;LTN2;)V", "b", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: RN2 */
/* loaded from: classes2.dex */
public abstract class RN2<S extends AN2> {
    private final Set<String> activeSubscriptions;
    private final SN2<S> config;
    private final TN2 configFactory;
    private final ConcurrentHashMap<String, Object> lastDeliveredStates;
    private final RN2<S>.C7160b repository;
    private final ZC0 viewModelScope;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, m28432d2 = {"LAN2;", "S", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModel$1", m28418f = "MavericksViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: RN2$a */
    /* loaded from: classes2.dex */
    public static final class C7159a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f31974h;

        /* renamed from: i */
        public final /* synthetic */ RN2<S> f31975i;

        /* renamed from: j */
        public final /* synthetic */ S f31976j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7159a(RN2<S> rn2, S s, Continuation<? super C7159a> continuation) {
            super(2, continuation);
            this.f31975i = rn2;
            this.f31976j = s;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C7159a(this.f31975i, this.f31976j, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C7159a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f31974h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f31975i.validateState(this.f31976j);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    @Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\b\u0003J)\u0010\u000b\u001a\u00020\u00052!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00050\u0002J\u007f\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0001\u0010\f*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0018\u00010\u00112#\u0010\u0004\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0002\b\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017Je\u0010\u0019\u001a\u00020\u0015\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u00028\u00010\u00182\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0018\u00010\u00112#\u0010\u0004\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0002\b\u0003JA\u0010\u001a\u001a\u00020\u0015\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u00028\u00010\u00182\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u001d\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0002\b\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"LRN2$b;", "LxN2;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "reducer", "", "p", "Lkotlin/ParameterName;", "name", TransferTable.COLUMN_STATE, "action", "q", "T", "Lkotlin/coroutines/Continuation;", "", "LSC0;", "dispatcher", "Lkotlin/reflect/KProperty1;", "Ldp;", "retainValue", "Lkotlin/Function2;", "Lzh2;", "n", "(Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)Lzh2;", "LEu1;", "m", "o", "<init>", "(LRN2;)V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: RN2$b */
    /* loaded from: classes2.dex */
    public final class C7160b extends AbstractC51570xN2<S> {

        /* renamed from: f */
        public final /* synthetic */ RN2<S> f31977f;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LAN2;", "S", "LxN2;", "it", "LsN2;", C17296a.f69688o, "(LxN2;)LsN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: RN2$b$a */
        /* loaded from: classes2.dex */
        public static final class C7161a extends Lambda implements Function1<AbstractC51570xN2<S>, EnumC48606sN2> {

            /* renamed from: g */
            public final /* synthetic */ RN2<S> f31978g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7161a(RN2<S> rn2) {
                super(1);
                this.f31978g = rn2;
            }

            /* renamed from: a */
            public final EnumC48606sN2 m86799a(AbstractC51570xN2<S> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f31978g.getConfig().mo83709e(this.f31978g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ EnumC48606sN2 invoke(Object obj) {
                return m86799a((AbstractC51570xN2) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7160b(RN2 rn2) {
            super(new C52163yN2(rn2.getConfig().m85606b(), rn2.getConfig().m85605c(), rn2.getConfig().m85607a(), rn2.getConfig().m85604d(), new C7161a(rn2)));
            this.f31977f = rn2;
        }

        /* renamed from: m */
        public final <T> InterfaceC52943zh2 m86804m(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, SC0 sc0, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1, Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> reducer) {
            Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
            Intrinsics.checkNotNullParameter(reducer, "reducer");
            return m5354d(interfaceC32730Eu1, sc0, kProperty1, reducer);
        }

        /* renamed from: n */
        public final <T> InterfaceC52943zh2 m86803n(Function1<? super Continuation<? super T>, ? extends Object> function1, SC0 sc0, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1, Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> reducer) {
            Intrinsics.checkNotNullParameter(function1, "<this>");
            Intrinsics.checkNotNullParameter(reducer, "reducer");
            return m5353e(function1, sc0, kProperty1, reducer);
        }

        /* renamed from: o */
        public final <T> InterfaceC52943zh2 m86802o(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, SC0 sc0, Function2<? super S, ? super T, ? extends S> reducer) {
            Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
            Intrinsics.checkNotNullParameter(reducer, "reducer");
            return m5349i(interfaceC32730Eu1, sc0, reducer);
        }

        /* renamed from: p */
        public final void m86801p(Function1<? super S, ? extends S> reducer) {
            Intrinsics.checkNotNullParameter(reducer, "reducer");
            m5348j(reducer);
        }

        /* renamed from: q */
        public final void m86800q(Function1<? super S, Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            m5346l(action);
        }
    }

    /* JADX WARN: Unknown type variable: T in type: hZ0<T> */
    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LAN2;", "S", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksViewModel$execute$1", m28418f = "MavericksViewModel.kt", m28417i = {}, m28416l = {133}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: RN2$c */
    /* loaded from: classes2.dex */
    public static final class C7162c extends SuspendLambda implements Function1<Continuation<? super T>, Object> {

        /* renamed from: h */
        public int f31979h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC42190hZ0<T> f31980i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: hZ0<? extends T> */
        public C7162c(InterfaceC42190hZ0<? extends T> interfaceC42190hZ0, Continuation<? super C7162c> continuation) {
            super(1, continuation);
            this.f31980i = interfaceC42190hZ0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C7162c(this.f31980i, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Continuation) obj);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31979h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC42190hZ0<T> interfaceC42190hZ0 = this.f31980i;
                this.f31979h = 1;
                obj = interfaceC42190hZ0.mo29821k(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return obj;
        }

        /* JADX WARN: Unknown type variable: T in type: kotlin.coroutines.Continuation<? super T> */
        public final Object invoke(Continuation<? super T> continuation) {
            return ((C7162c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public RN2(S initialState, TN2 configFactory) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(configFactory, "configFactory");
        this.configFactory = C48014rN2.f106907a.m16036a();
        SN2<S> m83710d = configFactory.m83710d(this, initialState);
        this.config = m83710d;
        ZC0 m85607a = m83710d.m85607a();
        this.viewModelScope = m85607a;
        this.repository = new C7160b(this);
        this.lastDeliveredStates = new ConcurrentHashMap<>();
        this.activeSubscriptions = Collections.newSetFromMap(new ConcurrentHashMap());
        if (m83710d.m85606b()) {
            Z30.m73800d(m85607a, T41.m84378a(), null, new C7159a(this, initialState, null), 2, null);
        }
    }

    public static /* synthetic */ InterfaceC52943zh2 execute$default(RN2 rn2, InterfaceC42190hZ0 interfaceC42190hZ0, SC0 sc0, KProperty1 kProperty1, Function2 function2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                sc0 = null;
            }
            if ((i & 2) != 0) {
                kProperty1 = null;
            }
            return rn2.execute(interfaceC42190hZ0, sc0, kProperty1, function2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    public static /* synthetic */ void getConfig$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getConfigFactory$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC52943zh2 onAsync$default(RN2 rn2, KProperty1 kProperty1, Function2 function2, Function2 function22, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function2 = null;
            }
            if ((i & 4) != 0) {
                function22 = null;
            }
            return rn2.onAsync(kProperty1, function2, function22);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAsync");
    }

    public static /* synthetic */ InterfaceC52943zh2 resolveSubscription$mvrx_release$default(RN2 rn2, InterfaceC32730Eu1 interfaceC32730Eu1, LifecycleOwner lifecycleOwner, AbstractC37698a01 abstractC37698a01, Function2 function2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                lifecycleOwner = null;
            }
            return rn2.resolveSubscription$mvrx_release(interfaceC32730Eu1, lifecycleOwner, abstractC37698a01, function2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveSubscription");
    }

    public static /* synthetic */ InterfaceC52943zh2 setOnEach$default(RN2 rn2, InterfaceC32730Eu1 interfaceC32730Eu1, SC0 sc0, Function2 function2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                sc0 = null;
            }
            return rn2.setOnEach(interfaceC32730Eu1, sc0, function2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnEach");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateState(S s) {
        C43307jR3.m30613i(C43307jR3.m30617e(getState$mvrx_release(), true), s, true);
    }

    public final Object awaitState(Continuation<? super S> continuation) {
        return this.repository.m5355c(continuation);
    }

    public <T> InterfaceC52943zh2 execute(InterfaceC42190hZ0<? extends T> interfaceC42190hZ0, SC0 sc0, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1, Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> reducer) {
        Intrinsics.checkNotNullParameter(interfaceC42190hZ0, "<this>");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        return execute(new C7162c(interfaceC42190hZ0, null), sc0, kProperty1, reducer);
    }

    public final SN2<S> getConfig() {
        return this.config;
    }

    public final TN2 getConfigFactory() {
        return this.configFactory;
    }

    public final S getState$mvrx_release() {
        return (S) this.repository.m5352f();
    }

    public final InterfaceC32730Eu1<S> getStateFlow() {
        return (InterfaceC32730Eu1<S>) this.repository.m5351g();
    }

    public final ZC0 getViewModelScope() {
        return this.viewModelScope;
    }

    public final <T> InterfaceC52943zh2 onAsync(KProperty1<S, ? extends AbstractC19862dp<? extends T>> asyncProp, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function22) {
        Intrinsics.checkNotNullParameter(asyncProp, "asyncProp");
        return C52756zN2.m1493i(this.repository, asyncProp, function2, function22);
    }

    public void onCleared() {
        C37824aD0.m71787d(this.viewModelScope, null, 1, null);
    }

    public final InterfaceC52943zh2 onEach(Function2<? super S, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return C52756zN2.m1501a(this.repository, action);
    }

    public final <T> InterfaceC52943zh2 resolveSubscription$mvrx_release(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, LifecycleOwner lifecycleOwner, AbstractC37698a01 deliveryMode, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
        Intrinsics.checkNotNullParameter(action, "action");
        if (lifecycleOwner != null) {
            ConcurrentHashMap<String, Object> concurrentHashMap = this.lastDeliveredStates;
            Set<String> activeSubscriptions = this.activeSubscriptions;
            Intrinsics.checkNotNullExpressionValue(activeSubscriptions, "activeSubscriptions");
            return FlowExtensionsKt.m53531c(interfaceC32730Eu1, lifecycleOwner, concurrentHashMap, activeSubscriptions, deliveryMode, action);
        }
        return this.repository.m5350h(interfaceC32730Eu1, action);
    }

    public <T> InterfaceC52943zh2 setOnEach(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, SC0 sc0, Function2<? super S, ? super T, ? extends S> reducer) {
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        return this.repository.m86802o(interfaceC32730Eu1, sc0, reducer);
    }

    public final void setState(Function1<? super S, ? extends S> reducer) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        this.repository.m86801p(reducer);
    }

    public String toString() {
        return getClass().getSimpleName() + ' ' + getState$mvrx_release();
    }

    public final void withState(Function1<? super S, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.repository.m86800q(action);
    }

    public static /* synthetic */ InterfaceC52943zh2 execute$default(RN2 rn2, Function1 function1, SC0 sc0, KProperty1 kProperty1, Function2 function2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                sc0 = null;
            }
            if ((i & 2) != 0) {
                kProperty1 = null;
            }
            return rn2.execute(function1, sc0, kProperty1, function2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    public <T> InterfaceC52943zh2 execute(Function1<? super Continuation<? super T>, ? extends Object> function1, SC0 sc0, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1, Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> reducer) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        return this.repository.m86803n(function1, sc0, kProperty1, reducer);
    }

    public final <A> InterfaceC52943zh2 onEach(KProperty1<S, ? extends A> prop1, Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(action, "action");
        return C52756zN2.m1500b(this.repository, prop1, action);
    }

    public static /* synthetic */ InterfaceC52943zh2 execute$default(RN2 rn2, InterfaceC32730Eu1 interfaceC32730Eu1, SC0 sc0, KProperty1 kProperty1, Function2 function2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                sc0 = null;
            }
            if ((i & 2) != 0) {
                kProperty1 = null;
            }
            return rn2.execute(interfaceC32730Eu1, sc0, kProperty1, function2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    public final <A, B> InterfaceC52943zh2 onEach(KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, Function3<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(action, "action");
        return C52756zN2.m1499c(this.repository, prop1, prop2, action);
    }

    public <T> InterfaceC52943zh2 execute(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, SC0 sc0, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1, Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> reducer) {
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        return this.repository.m86804m(interfaceC32730Eu1, sc0, kProperty1, reducer);
    }

    public final <A, B, C> InterfaceC52943zh2 onEach(KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, Function4<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(prop3, "prop3");
        Intrinsics.checkNotNullParameter(action, "action");
        return C52756zN2.m1498d(this.repository, prop1, prop2, prop3, action);
    }

    public final <A, B, C, D> InterfaceC52943zh2 onEach(KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, Function5<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(prop3, "prop3");
        Intrinsics.checkNotNullParameter(prop4, "prop4");
        Intrinsics.checkNotNullParameter(action, "action");
        return C52756zN2.m1497e(this.repository, prop1, prop2, prop3, prop4, action);
    }

    public final <A, B, C, D, E> InterfaceC52943zh2 onEach(KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, KProperty1<S, ? extends E> prop5, Function6<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(prop3, "prop3");
        Intrinsics.checkNotNullParameter(prop4, "prop4");
        Intrinsics.checkNotNullParameter(prop5, "prop5");
        Intrinsics.checkNotNullParameter(action, "action");
        return C52756zN2.m1496f(this.repository, prop1, prop2, prop3, prop4, prop5, action);
    }

    public final <A, B, C, D, E, F> InterfaceC52943zh2 onEach(KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, KProperty1<S, ? extends E> prop5, KProperty1<S, ? extends F> prop6, Function7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(prop3, "prop3");
        Intrinsics.checkNotNullParameter(prop4, "prop4");
        Intrinsics.checkNotNullParameter(prop5, "prop5");
        Intrinsics.checkNotNullParameter(prop6, "prop6");
        Intrinsics.checkNotNullParameter(action, "action");
        return C52756zN2.m1495g(this.repository, prop1, prop2, prop3, prop4, prop5, prop6, action);
    }

    public final <A, B, C, D, E, F, G> InterfaceC52943zh2 onEach(KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, KProperty1<S, ? extends E> prop5, KProperty1<S, ? extends F> prop6, KProperty1<S, ? extends G> prop7, Function8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        Intrinsics.checkNotNullParameter(prop2, "prop2");
        Intrinsics.checkNotNullParameter(prop3, "prop3");
        Intrinsics.checkNotNullParameter(prop4, "prop4");
        Intrinsics.checkNotNullParameter(prop5, "prop5");
        Intrinsics.checkNotNullParameter(prop6, "prop6");
        Intrinsics.checkNotNullParameter(prop7, "prop7");
        Intrinsics.checkNotNullParameter(action, "action");
        return C52756zN2.m1494h(this.repository, prop1, prop2, prop3, prop4, prop5, prop6, prop7, action);
    }

    public /* synthetic */ RN2(AN2 an2, TN2 tn2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(an2, (i & 2) != 0 ? C48014rN2.f106907a.m16036a() : tn2);
    }
}
