package p000;

import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.C43188jE1;
import p000.FR3;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: V
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0004Ï\u0001Ý\u0001Bý\u0001\u0012\n\u0010g\u001a\u0006\u0012\u0002\b\u00030d\u0012\b\u0010â\u0001\u001a\u00030Ç\u0001\u0012\b\u0010å\u0001\u001a\u00030ã\u0001\u0012\u000f\u0010é\u0001\u001a\n\u0012\u0005\u0012\u00030ç\u00010æ\u0001\u0012[\u0010ì\u0001\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`l0ê\u0001\u0012[\u0010í\u0001\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`l0ê\u0001\u0012\u0007\u0010ñ\u0001\u001a\u00020R¢\u0006\u0006\bâ\u0002\u0010ã\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J(\u0010\u0012\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u0011H\u0002J0\u0010\u0014\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00112\u0006\u0010\u0013\u001a\u00020\u0006H\u0002Jx\u0010\u0017\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00112&\u0010\u0015\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00112&\u0010\u0016\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u0011H\u0002JK\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2&\u0010\u0019\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0002J\u001a\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J9\u0010%\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002J\u0018\u0010,\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001eH\u0002J\u0010\u0010-\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010.\u001a\u00020\u0002H\u0002J\u0010\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002J\u0018\u00102\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J(\u00106\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0002J\u0010\u00107\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0018\u00109\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0002J\b\u0010:\u001a\u00020\u0002H\u0002J \u0010>\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0002J\u0018\u0010@\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0006H\u0002J \u0010B\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006H\u0002J\u0014\u0010D\u001a\u00020\u0006*\u00020C2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010E\u001a\u00020\u0002H\u0002J\b\u0010F\u001a\u00020\u0002H\u0002JR\u0010L\u001a\u00020\u00022\u000e\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0G2&\u0010I\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00112\b\u0010J\u001a\u0004\u0018\u00010\t2\u0006\u0010K\u001a\u00020\u001eH\u0002J$\u0010Q\u001a\u00020\u00022\u001a\u0010P\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020O\u0012\u0006\u0012\u0004\u0018\u00010O0N0MH\u0002Jk\u0010Z\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\n\b\u0002\u0010S\u001a\u0004\u0018\u00010R2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010R2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00062\"\b\u0002\u0010W\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020U\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010V0N0M2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000XH\u0002¢\u0006\u0004\bZ\u0010[J;\u0010^\u001a\u00020\u00022\u001a\u0010]\u001a\u0016\u0012\u0004\u0012\u00020U\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010V0\\2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010XH\u0002¢\u0006\u0004\b^\u0010_J\u0016\u0010`\u001a\u0004\u0018\u00010\t*\u00020C2\u0006\u0010/\u001a\u00020\u0006H\u0002J\b\u0010a\u001a\u00020\u0002H\u0002J\b\u0010b\u001a\u00020\u0002H\u0002J]\u0010n\u001a\u00020\u00022S\u0010m\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`lH\u0002J]\u0010o\u001a\u00020\u00022S\u0010m\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`lH\u0002J]\u0010p\u001a\u00020\u00022S\u0010m\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`lH\u0002Jg\u0010r\u001a\u00020\u00022\b\b\u0002\u0010q\u001a\u00020\u001e2S\u0010m\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`lH\u0002J\b\u0010s\u001a\u00020\u0002H\u0002J\u001f\u0010v\u001a\u00020\u00022\u000e\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0tH\u0002¢\u0006\u0004\bv\u0010wJ\b\u0010x\u001a\u00020\u0002H\u0002J\u0012\u0010z\u001a\u00020\u00022\b\u0010y\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010{\u001a\u00020\u0002H\u0002J\u0012\u0010|\u001a\u00020\u00022\b\b\u0002\u0010q\u001a\u00020\u001eH\u0002J\u0010\u0010\u007f\u001a\u00020\u00022\u0006\u0010~\u001a\u00020}H\u0002J^\u0010\u0080\u0001\u001a\u00020\u00022S\u0010m\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`lH\u0002J^\u0010\u0081\u0001\u001a\u00020\u00022S\u0010m\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`lH\u0002J\t\u0010\u0082\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0083\u0001\u001a\u00020\u0002H\u0002J\u0012\u0010\u0085\u0001\u001a\u00020\u00022\u0007\u0010\u0084\u0001\u001a\u00020\u0006H\u0002J\u001a\u0010\u0087\u0001\u001a\u00020\u00022\u0007\u0010\u0086\u0001\u001a\u00020O2\u0006\u0010i\u001a\u00020hH\u0002J\t\u0010\u0088\u0001\u001a\u00020\u0002H\u0002J\u0012\u0010\u008a\u0001\u001a\u00020\u00022\u0007\u0010\u0089\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u008b\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u008c\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u008d\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u008e\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u008f\u0001\u001a\u00020\u0002H\u0002J\u001a\u0010\u0091\u0001\u001a\u00020\u00022\u0007\u0010\u0090\u0001\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0002J!\u0010\u0092\u0001\u001a\u00020\u00022\u0006\u0010S\u001a\u00020\u00062\u0006\u0010T\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0002J\t\u0010\u0093\u0001\u001a\u00020\u0002H\u0002J&\u0010\u0095\u0001\u001a\u00020\u00022\u0007\u0010\u0094\u0001\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u0097\u0001\u001a\u00020\u00022\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0002J&\u0010\u0098\u0001\u001a\u00020\u00022\u0007\u0010\u0094\u0001\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u0099\u0001\u001a\u00020\u00022\u0007\u0010\u0094\u0001\u001a\u00020\u0006H\u0002J\u0011\u0010\u009a\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\t\u0010\u009b\u0001\u001a\u00020\u0002H\u0017J\t\u0010\u009c\u0001\u001a\u00020\u0002H\u0017J\t\u0010\u009d\u0001\u001a\u00020\u0002H\u0017J\u001b\u0010\u009e\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017J\t\u0010\u009f\u0001\u001a\u00020\u0002H\u0017J\u0012\u0010 \u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001J\t\u0010¢\u0001\u001a\u00020\u0002H\u0016J\u0012\u0010£\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b£\u0001\u0010¡\u0001J\t\u0010¤\u0001\u001a\u00020\u0002H\u0016J\t\u0010¥\u0001\u001a\u00020\u0002H\u0016J\u001e\u0010§\u0001\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00182\r\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000XH\u0016J\t\u0010¨\u0001\u001a\u00020\u0002H\u0016J\t\u0010©\u0001\u001a\u00020\u0002H\u0016J\u001b\u0010ª\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\t\u0010«\u0001\u001a\u00020\u0002H\u0016J\t\u0010¬\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u00ad\u0001\u001a\u00020\u0002H\u0016JI\u0010²\u0001\u001a\u00020\u0002\"\u0005\b\u0000\u0010®\u0001\"\u0004\b\u0001\u0010\u00182\u0007\u0010¯\u0001\u001a\u00028\u00002\u001f\u0010Y\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020°\u0001¢\u0006\u0003\b±\u0001H\u0016¢\u0006\u0006\b²\u0001\u0010³\u0001J\u000b\u0010´\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0014\u0010µ\u0001\u001a\u00020\u001e2\t\u0010¯\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u0014\u0010¶\u0001\u001a\u00020\u001e2\t\u0010¯\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u0012\u0010·\u0001\u001a\u00020\u001e2\u0007\u0010¯\u0001\u001a\u00020\u001eH\u0017J\u0013\u0010¹\u0001\u001a\u00020\u001e2\b\u0010¯\u0001\u001a\u00030¸\u0001H\u0017J\u0013\u0010»\u0001\u001a\u00020\u001e2\b\u0010¯\u0001\u001a\u00030º\u0001H\u0017J\u0012\u0010¼\u0001\u001a\u00020\u001e2\u0007\u0010¯\u0001\u001a\u00020\u0006H\u0017J\u0014\u0010½\u0001\u001a\u00020\u00022\t\u0010¯\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0018\u0010¿\u0001\u001a\u00020\u00022\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020XH\u0016J(\u0010Â\u0001\u001a\u00020\u00022\u0014\u0010Á\u0001\u001a\u000f\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030À\u00010tH\u0017¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\t\u0010Ä\u0001\u001a\u00020\u0002H\u0017J&\u0010Å\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0017¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\n\u0010È\u0001\u001a\u00030Ç\u0001H\u0016J%\u0010Ê\u0001\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020U2\t\u0010É\u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\t\u0010Ì\u0001\u001a\u00020\u0002H\u0017J\t\u0010Í\u0001\u001a\u00020\u0002H\u0017J\u0012\u0010Ï\u0001\u001a\u00020\u00022\u0007\u0010Î\u0001\u001a\u00020\u001eH\u0017J\u0011\u0010Ð\u0001\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\f\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u0001H\u0017J%\u0010Ó\u0001\u001a\u00020\u00022\u001a\u0010P\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020O\u0012\u0006\u0012\u0004\u0018\u00010O0N0MH\u0017J;\u0010Ô\u0001\u001a\u00020\u00022\u001a\u0010]\u001a\u0016\u0012\u0004\u0012\u00020U\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010V0\\2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020XH\u0000¢\u0006\u0005\bÔ\u0001\u0010_J \u0010Õ\u0001\u001a\u00020\u00022\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00020XH\u0000¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J.\u0010×\u0001\u001a\u00020\u001e2\u001a\u0010]\u001a\u0016\u0012\u0004\u0012\u00020U\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010V0\\H\u0000¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u000b\u0010Ù\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010Ú\u0001\u001a\u00020\u00022\t\u0010¯\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010Ü\u0001\u001a\u00020\u00022\u0007\u0010\u0019\u001a\u00030Û\u0001H\u0016R\"\u0010g\u001a\u0006\u0012\u0002\b\u00030d8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001R\u0018\u0010â\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010á\u0001R\u0018\u0010å\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010ä\u0001R\u001f\u0010é\u0001\u001a\n\u0012\u0005\u0012\u00030ç\u00010æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010è\u0001Rm\u0010ì\u0001\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`l0ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ë\u0001Rm\u0010í\u0001\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`l0ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010ë\u0001R\u001f\u0010ñ\u0001\u001a\u00020R8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¥\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001R \u0010ô\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010'0ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010ó\u0001R\u001b\u0010ö\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010õ\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010¶\u0001R\u001a\u0010ú\u0001\u001a\u00030÷\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u0019\u0010û\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010¶\u0001R\u001a\u0010ü\u0001\u001a\u00030÷\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010ù\u0001R\u001c\u0010ÿ\u0001\u001a\u0005\u0018\u00010ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010þ\u0001R;\u0010\u0083\u0002\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0080\u0002j\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0081\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010\u0082\u0002R\u0019\u0010\u0085\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u0084\u0002R\u0019\u0010\u0086\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010\u0084\u0002R\u0019\u0010\u0087\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010\u0084\u0002R\u001e\u0010W\u001a\n\u0012\u0005\u0012\u00030\u0088\u00020ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010ë\u0001R\u0018\u0010\u008a\u0002\u001a\u00030÷\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010ù\u0001R9\u0010\u008c\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010\u008b\u0002R>\u0010\u008f\u0002\u001a)\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00110\u008d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010\u008e\u0002R\u0019\u0010\u0090\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u0084\u0002R\u0018\u0010\u0092\u0002\u001a\u00030÷\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0002\u0010ù\u0001R\u0019\u0010\u0093\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010\u0084\u0002R\u0019\u0010\u0094\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010¶\u0001R\u0019\u0010\u0095\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010¶\u0001R\u001a\u0010\u0098\u0002\u001a\u00030\u0096\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u0097\u0002R\u0019\u0010\u009a\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0002\u0010¶\u0001R\u0019\u0010\u009b\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u0084\u0002R\u001e\u0010\u009c\u0002\u001a\t\u0012\u0004\u0012\u00020U0ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010ó\u0001R*\u0010 \u0002\u001a\u00020\u001e2\u0007\u0010\u009d\u0002\u001a\u00020\u001e8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÙ\u0001\u0010\u0084\u0002\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R*\u0010£\u0002\u001a\u00020\u001e2\u0007\u0010\u009d\u0002\u001a\u00020\u001e8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¡\u0002\u0010\u0084\u0002\u001a\u0006\b¢\u0002\u0010\u009f\u0002R\u0019\u0010¥\u0002\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010¤\u0002R*\u0010ª\u0002\u001a\u00030ã\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010ä\u0001\u001a\u0006\b¦\u0002\u0010§\u0002\"\u0006\b¨\u0002\u0010©\u0002R\u0019\u0010¬\u0002\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010«\u0002R\u0019\u0010\u00ad\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u0084\u0002R=\u0010®\u0002\u001a&\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010\u008b\u0002R\u007f\u0010³\u0002\u001aX\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`l\u0018\u00010ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÄ\u0001\u0010ë\u0001\u001a\u0006\b¯\u0002\u0010°\u0002\"\u0006\b±\u0002\u0010²\u0002R\u0019\u0010¶\u0002\u001a\u00020}8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0002\u0010µ\u0002Rk\u0010·\u0002\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`l0ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010ë\u0001R1\u0010+\u001a\u00020\u001e2\u0007\u0010\u009d\u0002\u001a\u00020\u001e8\u0016@RX\u0097\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0084\u0002\u0012\u0006\b¸\u0002\u0010¡\u0001\u001a\u0006\b\u0089\u0002\u0010\u009f\u0002R1\u0010»\u0002\u001a\u00020\u00062\u0007\u0010\u009d\u0002\u001a\u00020\u00068\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0005\b\u0005\u0010¶\u0001\u0012\u0006\bº\u0002\u0010¡\u0001\u001a\u0006\b´\u0002\u0010¹\u0002R\u0019\u0010½\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0002\u0010¶\u0001R!\u0010¾\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010ó\u0001R\u0019\u0010À\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010¶\u0001R\u0019\u0010Á\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u0084\u0002R\u0019\u0010Ã\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0002\u0010\u0084\u0002R\u0018\u0010Å\u0002\u001a\u00030÷\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0002\u0010ù\u0001Rk\u0010Ç\u0002\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030d¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0013\u0012\u00110h¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(i\u0012\u0013\u0012\u00110j¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00020cj\u0002`l0ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0002\u0010ó\u0001R\u0019\u0010È\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010¶\u0001R\u0019\u0010Ê\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0002\u0010¶\u0001R\u0019\u0010Ì\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0002\u0010¶\u0001R\u0019\u0010Î\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0002\u0010¶\u0001R\u001c\u0010y\u001a\u0004\u0018\u00010\t*\u00020C8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÏ\u0002\u0010Ð\u0002R\u0017\u0010Ò\u0002\u001a\u00020\u001e8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÑ\u0002\u0010\u009f\u0002R\u0018\u0010Õ\u0002\u001a\u00030Ó\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010Ô\u0002R\u001f\u0010×\u0002\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u0010\u0012\u0006\bÖ\u0002\u0010¡\u0001\u001a\u0006\bø\u0001\u0010\u009f\u0002R\u001f\u0010Ù\u0002\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u0010\u0012\u0006\bØ\u0002\u0010¡\u0001\u001a\u0006\bÝ\u0001\u0010\u009f\u0002R\u0018\u0010Ü\u0002\u001a\u00030Ú\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0002\u0010Û\u0002R\u0019\u0010ß\u0002\u001a\u0004\u0018\u00010U8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÝ\u0002\u0010Þ\u0002R\u001a\u0010á\u0002\u001a\u0005\u0018\u00010Û\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010à\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006ä\u0002"}, m28432d2 = {"LPt0;", "LEt0;", "", "K1", "y0", "R", "", "key", "H1", "", "dataKey", "I1", "x0", "E1", "LFR3;", "Lfu0;", "LsP5;", "Landroidx/compose/runtime/CompositionLocalMap;", "r0", "group", "s0", "parentScope", "currentProviders", "S1", "T", Action.SCOPE_ATTRIBUTE, "C1", "(Lfu0;LFR3;)Ljava/lang/Object;", "z0", "q0", "", "isNode", MessageExtension.FIELD_DATA, AbstractC3831J1.f16564d, "objectKey", "LjE1;", "kind", "G1", "(ILjava/lang/Object;ILjava/lang/Object;)V", "LaQ3;", "newPending", "A0", "expectedNodeCount", "inserting", "B0", "w0", "e1", "index", "O0", "newCount", "R1", "groupLocation", "recomposeGroup", "recomposeIndex", "T0", "U1", "count", "Q1", "n0", "oldGroup", "newGroup", "commonRoot", "w1", "nearestCommonRoot", "v0", "recomposeKey", "p0", "LmE5;", "I0", "F1", "k0", "LhW2;", "content", "locals", "parameter", "force", "P0", "", "Lkotlin/Pair;", "LjW2;", "references", "J0", "LnB0;", "from", "to", "Los4;", "LlW1;", "invalidations", "Lkotlin/Function0;", "block", "c1", "(LnB0;LnB0;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "LkW1;", "invalidationsRequested", AbstractC26684u0.f100690q, "(LkW1;Lkotlin/jvm/functions/Function2;)V", "S0", "V1", "W1", "Lkotlin/Function3;", "Llm;", "Lkotlin/ParameterName;", "name", "applier", "LqE5;", "slots", "LOv4;", "rememberManager", "Landroidx/compose/runtime/Change;", "change", "f1", "g1", "s1", "forParent", "t1", "a1", "", "nodes", "W0", "([Ljava/lang/Object;)V", "V0", "node", "i1", "v1", "Y0", "Ldb;", "anchor", "m1", "l1", "n1", "x1", "h1", "groupBeingRemoved", "A1", "reference", "y1", "z1", "location", "p1", "r1", "j1", "k1", "C0", "m0", "nodeIndex", "q1", "o1", "X0", "groupKey", "M1", "keyHash", "N1", "O1", "P1", "F", "Q", "J", "B", "K", "P", "l0", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "t0", "x", "h", "factory", "M", "e", "f", "j", "E", "L", "q", "V", "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "R0", "n", "I", "o", "", "p", "", "s", "r", "T1", "effect", "g", "LW94;", "values", "A", "([LW94;)V", "N", "c", "(Lfu0;)Ljava/lang/Object;", "LYt0;", "m", "instance", "L1", "(Los4;Ljava/lang/Object;)Z", "D1", "k", "changed", C17296a.f69688o, "u", "LWm5;", "w", "N0", "o0", "U0", "(Lkotlin/jvm/functions/Function0;)V", "b1", "(LkW1;)Z", "G", "z", "Lns4;", "i", "b", "Llm;", "v", "()Llm;", "LYt0;", "parentContext", "LnE5;", "LnE5;", "slotTable", "", "LPv4;", "Ljava/util/Set;", "abandonSet", "", "Ljava/util/List;", "changes", "lateChanges", "LnB0;", "E0", "()LnB0;", "composition", "LmO5;", "LmO5;", "pendingStack", "LaQ3;", "pending", "LJ52;", "l", "LJ52;", "nodeIndexStack", "groupNodeCount", "groupNodeCountStack", "", "[I", "nodeCountOverrides", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "nodeCountVirtualOverrides", "Z", "forceRecomposeScopes", "forciblyRecompose", "nodeExpected", "Lm72;", "t", "entersStack", "LFR3;", "parentProvider", "Ly52;", "Ly52;", "providerUpdates", "providersInvalid", "y", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "LsM5;", "LsM5;", "snapshot", "D", "compositionToken", "sourceInformationEnabled", "invalidateStack", "<set-?>", "Q0", "()Z", "isComposing", "H", "isDisposed$runtime_release", "isDisposed", "LmE5;", "reader", "getInsertTable$runtime_release", "()LnE5;", "setInsertTable$runtime_release", "(LnE5;)V", "insertTable", "LqE5;", "writer", "writerHasAProvider", "providerCache", "G0", "()Ljava/util/List;", "setDeferredChanges$runtime_release", "(Ljava/util/List;)V", "deferredChanges", "O", "Ldb;", "insertAnchor", "insertFixups", "getInserting$annotations", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "S", "pendingUps", "downNodes", "U", "writersReaderDelta", "startedGroup", "W", "implicitRootStart", "X", "startedGroups", "Y", "insertUpFixups", "previousRemove", "a0", "previousMoveFrom", "b0", "previousMoveTo", "c0", "previousCount", "H0", "(LmE5;)Ljava/lang/Object;", "D0", "areChildrenComposing", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping$annotations", "skipping", "Lau0;", "()Lau0;", "compositionData", "F0", "()Los4;", "currentRecomposeScope", "()Lns4;", "recomposeScope", "<init>", "(Llm;LYt0;LnE5;Ljava/util/Set;Ljava/util/List;Ljava/util/List;LnB0;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 7 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 8 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 9 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 10 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4528:1\n3212#1,4:4567\n3222#1,6:4587\n3212#1,6:4593\n3229#1,2:4599\n3217#1:4605\n3212#1,6:4673\n1#2:4529\n146#3,8:4530\n146#3,8:4575\n146#3,4:4583\n151#3,3:4601\n162#3,8:4661\n146#3,4:4669\n151#3,3:4679\n46#4,5:4538\n46#4,3:4636\n50#4:4642\n4513#5,5:4543\n4513#5,5:4548\n309#5:4553\n4513#5,5:4557\n4513#5,5:4562\n4513#5,5:4616\n4513#5,5:4621\n4513#5,5:4626\n4513#5,5:4631\n4513#5,5:4646\n4513#5,5:4651\n4513#5,5:4656\n4513#5,5:4682\n4513#5,5:4687\n4513#5,5:4692\n4513#5,5:4697\n4443#6:4554\n4444#6:4555\n26#7:4556\n26#7:4702\n22#7:4703\n33#8,4:4571\n38#8:4604\n33#8,4:4606\n38#8:4615\n82#8,3:4704\n33#8,4:4707\n85#8,2:4711\n38#8:4713\n87#8:4714\n105#9,5:4610\n146#10,3:4639\n150#10:4643\n1002#11,2:4644\n1855#11,2:4715\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n3053#1:4567,4\n3166#1:4587,6\n3172#1:4593,6\n3166#1:4599,2\n3053#1:4605\n3770#1:4673,6\n1300#1:4530,8\n3081#1:4575,8\n3165#1:4583,4\n3165#1:4601,3\n3737#1:4661,8\n3768#1:4669,4\n3768#1:4679,3\n1540#1:4538,5\n3339#1:4636,3\n3339#1:4642\n1609#1:4543,5\n1636#1:4548,5\n1987#1:4553\n2770#1:4557,5\n2783#1:4562,5\n3297#1:4616,5\n3302#1:4621,5\n3318#1:4626,5\n3338#1:4631,5\n3405#1:4646,5\n3412#1:4651,5\n3549#1:4656,5\n3817#1:4682,5\n3833#1:4687,5\n3834#1:4692,5\n3862#1:4697,5\n2146#1:4554\n2170#1:4555\n2694#1:4556\n4057#1:4702\n4073#1:4703\n3055#1:4571,4\n3055#1:4604\n3248#1:4606,4\n3248#1:4615\n3641#1:4704,3\n3641#1:4707,4\n3641#1:4711,2\n3641#1:4713\n3641#1:4714\n3250#1:4610,5\n3343#1:4639,3\n3343#1:4643\n3347#1:4644,2\n3677#1:4715,2\n*E\n"})
/* renamed from: Pt0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35294Pt0 implements InterfaceC32720Et0 {

    /* renamed from: A */
    public int f29219A;

    /* renamed from: B */
    public int f29220B;

    /* renamed from: C */
    public AbstractC48600sM5 f29221C;

    /* renamed from: D */
    public int f29222D;

    /* renamed from: E */
    public boolean f29223E;

    /* renamed from: F */
    public final C45061mO5<C46534os4> f29224F;

    /* renamed from: G */
    public boolean f29225G;

    /* renamed from: H */
    public boolean f29226H;

    /* renamed from: I */
    public C44971mE5 f29227I;

    /* renamed from: J */
    public C45564nE5 f29228J;

    /* renamed from: K */
    public C47343qE5 f29229K;

    /* renamed from: L */
    public boolean f29230L;

    /* renamed from: M */
    public FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> f29231M;

    /* renamed from: N */
    public List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> f29232N;

    /* renamed from: O */
    public C19797db f29233O;

    /* renamed from: P */
    public final List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> f29234P;

    /* renamed from: Q */
    public boolean f29235Q;

    /* renamed from: R */
    public int f29236R;

    /* renamed from: S */
    public int f29237S;

    /* renamed from: T */
    public C45061mO5<Object> f29238T;

    /* renamed from: U */
    public int f29239U;

    /* renamed from: V */
    public boolean f29240V;

    /* renamed from: W */
    public boolean f29241W;

    /* renamed from: X */
    public final J52 f29242X;

    /* renamed from: Y */
    public final C45061mO5<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> f29243Y;

    /* renamed from: Z */
    public int f29244Z;

    /* renamed from: a0 */
    public int f29245a0;

    /* renamed from: b */
    public final InterfaceC25773lm<?> f29246b;

    /* renamed from: b0 */
    public int f29247b0;

    /* renamed from: c */
    public final AbstractC37400Yt0 f29248c;

    /* renamed from: c0 */
    public int f29249c0;

    /* renamed from: d */
    public final C45564nE5 f29250d;

    /* renamed from: e */
    public final Set<InterfaceC35316Pv4> f29251e;

    /* renamed from: f */
    public List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> f29252f;

    /* renamed from: g */
    public List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> f29253g;

    /* renamed from: h */
    public final InterfaceC45532nB0 f29254h;

    /* renamed from: i */
    public final C45061mO5<C37944aQ3> f29255i;

    /* renamed from: j */
    public C37944aQ3 f29256j;

    /* renamed from: k */
    public int f29257k;

    /* renamed from: l */
    public J52 f29258l;

    /* renamed from: m */
    public int f29259m;

    /* renamed from: n */
    public J52 f29260n;

    /* renamed from: o */
    public int[] f29261o;

    /* renamed from: p */
    public HashMap<Integer, Integer> f29262p;

    /* renamed from: q */
    public boolean f29263q;

    /* renamed from: r */
    public boolean f29264r;

    /* renamed from: s */
    public boolean f29265s;

    /* renamed from: t */
    public final List<C44902m72> f29266t;

    /* renamed from: u */
    public final J52 f29267u;

    /* renamed from: v */
    public FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> f29268v;

    /* renamed from: w */
    public final C51996y52<FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>>> f29269w;

    /* renamed from: x */
    public boolean f29270x;

    /* renamed from: y */
    public final J52 f29271y;

    /* renamed from: z */
    public boolean f29272z;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$A */
    /* loaded from: classes.dex */
    public static final class C6521A extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C45564nE5 f29273g;

        /* renamed from: h */
        public final /* synthetic */ C19797db f29274h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6521A(C45564nE5 c45564nE5, C19797db c19797db) {
            super(3);
            this.f29273g = c45564nE5;
            this.f29274h = c19797db;
        }

        /* renamed from: a */
        public final void m89500a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            slots.m17847D();
            C45564nE5 c45564nE5 = this.f29273g;
            slots.m17766o0(c45564nE5, this.f29274h.m44092d(c45564nE5));
            slots.m17825O();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89500a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "applier", "LqE5;", "slots", "LOv4;", "rememberManager", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$recordInsert$2\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4528:1\n162#2,4:4529\n167#2,3:4539\n33#3,6:4533\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$recordInsert$2\n*L\n3573#1:4529,4\n3573#1:4539,3\n3574#1:4533,6\n*E\n"})
    /* renamed from: Pt0$B */
    /* loaded from: classes.dex */
    public static final class C6522B extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C45564nE5 f29275g;

        /* renamed from: h */
        public final /* synthetic */ C19797db f29276h;

        /* renamed from: i */
        public final /* synthetic */ List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> f29277i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6522B(C45564nE5 c45564nE5, C19797db c19797db, List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> list) {
            super(3);
            this.f29275g = c45564nE5;
            this.f29276h = c19797db;
            this.f29277i = list;
        }

        /* renamed from: a */
        public final void m89499a(InterfaceC25773lm<?> applier, C47343qE5 slots, InterfaceC35082Ov4 rememberManager) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
            C45564nE5 c45564nE5 = this.f29275g;
            List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> list = this.f29277i;
            C47343qE5 m24113z = c45564nE5.m24113z();
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invoke(applier, m24113z, rememberManager);
                }
                Unit unit = Unit.INSTANCE;
                m24113z.m17843F();
                slots.m17847D();
                C45564nE5 c45564nE52 = this.f29275g;
                slots.m17766o0(c45564nE52, this.f29276h.m44092d(c45564nE52));
                slots.m17825O();
            } catch (Throwable th) {
                m24113z.m17843F();
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89499a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "<anonymous parameter 1>", "LOv4;", "rememberManager", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$C */
    /* loaded from: classes.dex */
    public static final class C6523C extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f29278g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6523C(Function0<Unit> function0) {
            super(3);
            this.f29278g = function0;
        }

        /* renamed from: a */
        public final void m89498a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 rememberManager) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(c47343qE5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
            rememberManager.mo44867a(this.f29278g);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89498a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$D */
    /* loaded from: classes.dex */
    public static final class C6524D extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C19797db f29279g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6524D(C19797db c19797db) {
            super(3);
            this.f29279g = c19797db;
        }

        /* renamed from: a */
        public final void m89497a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            slots.m17821Q(this.f29279g);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89497a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$E */
    /* loaded from: classes.dex */
    public static final class C6525E extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C43351jW2 f29281h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6525E(C43351jW2 c43351jW2) {
            super(3);
            this.f29281h = c43351jW2;
        }

        /* renamed from: a */
        public final void m89496a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            C35294Pt0.this.m89504y1(this.f29281h, slots);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89496a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$F */
    /* loaded from: classes.dex */
    public static final class C6526F extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f29282g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6526F(int i) {
            super(3);
            this.f29282g = i;
        }

        /* renamed from: a */
        public final void m89495a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            slots.m17764p0(this.f29282g);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89495a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFR3;", "Lfu0;", "", "LsP5;", "Landroidx/compose/runtime/CompositionLocalMap;", C17296a.f69688o, "(LEt0;I)LFR3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$G */
    /* loaded from: classes.dex */
    public static final class C6527G extends Lambda implements Function2<InterfaceC32720Et0, Integer, FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>>> {

        /* renamed from: g */
        public final /* synthetic */ W94<?>[] f29283g;

        /* renamed from: h */
        public final /* synthetic */ FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> f29284h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6527G(W94<?>[] w94Arr, FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> fr3) {
            super(2);
            this.f29283g = w94Arr;
            this.f29284h = fr3;
        }

        /* renamed from: a */
        public final FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> m89494a(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> m87791y;
            interfaceC32720Et0.mo89638F(935231726);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(935231726, i, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:2002)");
            }
            m87791y = C35528Qt0.m87791y(this.f29283g, this.f29284h, interfaceC32720Et0, 8);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m87791y;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m89494a(interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$H */
    /* loaded from: classes.dex */
    public static final class C6528H extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Object f29285g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6528H(Object obj) {
            super(3);
            this.f29285g = obj;
        }

        /* renamed from: a */
        public final void m89493a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            slots.m17802Z0(this.f29285g);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89493a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "<anonymous parameter 1>", "LOv4;", "rememberManager", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$I */
    /* loaded from: classes.dex */
    public static final class C6529I extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Object f29286g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6529I(Object obj) {
            super(3);
            this.f29286g = obj;
        }

        /* renamed from: a */
        public final void m89492a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 rememberManager) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(c47343qE5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
            rememberManager.mo44866b((InterfaceC35316Pv4) this.f29286g);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89492a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "rememberManager", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$J */
    /* loaded from: classes.dex */
    public static final class C6530J extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Object f29287g;

        /* renamed from: h */
        public final /* synthetic */ int f29288h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6530J(Object obj, int i) {
            super(3);
            this.f29287g = obj;
            this.f29288h = i;
        }

        /* renamed from: a */
        public final void m89491a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 rememberManager) {
            C46534os4 c46534os4;
            C39435cu0 m20394l;
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
            Object obj = this.f29287g;
            if (obj instanceof InterfaceC35316Pv4) {
                rememberManager.mo44866b((InterfaceC35316Pv4) obj);
            }
            Object m17832K0 = slots.m17832K0(this.f29288h, this.f29287g);
            if (m17832K0 instanceof InterfaceC35316Pv4) {
                rememberManager.mo44863e((InterfaceC35316Pv4) m17832K0);
            } else if ((m17832K0 instanceof C46534os4) && (m20394l = (c46534os4 = (C46534os4) m17832K0).m20394l()) != null) {
                c46534os4.m20382x();
                m20394l.m44880F(true);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89491a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "applier", "LqE5;", "<anonymous parameter 1>", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$K */
    /* loaded from: classes.dex */
    public static final class C6531K extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public static final C6531K f29289g = new C6531K();

        public C6531K() {
            super(3);
        }

        /* renamed from: a */
        public final void m89490a(InterfaceC25773lm<?> applier, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(c47343qE5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            Object mo26853a = applier.mo26853a();
            Intrinsics.checkNotNull(mo26853a, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((InterfaceC31784At0) mo26853a).mo68271l();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89490a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\f\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001b\u0010\f\u001a\u00060\u0006R\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LPt0$a;", "LPv4;", "", "onRemembered", "onAbandoned", "onForgotten", "LPt0$b;", "LPt0;", "b", "LPt0$b;", C17296a.f69688o, "()LPt0$b;", ActionConst.REF_ATTRIBUTE, "<init>", "(LPt0$b;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$a */
    /* loaded from: classes.dex */
    public static final class C6532a implements InterfaceC35316Pv4 {

        /* renamed from: b */
        public final C6533b f29290b;

        public C6532a(C6533b ref) {
            Intrinsics.checkNotNullParameter(ref, "ref");
            this.f29290b = ref;
        }

        /* renamed from: a */
        public final C6533b m89489a() {
            return this.f29290b;
        }

        @Override // p000.InterfaceC35316Pv4
        public void onAbandoned() {
            this.f29290b.m89488q();
        }

        @Override // p000.InterfaceC35316Pv4
        public void onForgotten() {
            this.f29290b.m89488q();
        }

        @Override // p000.InterfaceC35316Pv4
        public void onRemembered() {
        }
    }

    @Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00102\u001a\u00020.\u0012\u0006\u00107\u001a\u000203¢\u0006\u0004\bJ\u0010KJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\fJ/\u0010\u0017\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00150\u0012j\u0002`\u0016H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001a\u001a\u00020\u00022&\u0010\u0019\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00150\u0012j\u0002`\u0016J\u001d\u0010\u001e\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0010¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0010¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0010¢\u0006\u0004\b'\u0010&J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010$\u001a\u00020#H\u0010¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010+\u001a\u00020(H\u0010¢\u0006\u0004\b,\u0010-R\u001a\u00102\u001a\u00020.8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u001a\u00107\u001a\u0002038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b'\u00104\u001a\u0004\b5\u00106R0\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u001fR\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u001b8\u0006¢\u0006\f\n\u0004\b5\u00108\u001a\u0004\b>\u0010:Rk\u0010E\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00150\u0012j\u0002`\u00162&\u0010@\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00150\u0012j\u0002`\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010\u0018\"\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006L"}, m28432d2 = {"LPt0$b;", "LYt0;", "", "q", "LEt0;", "composer", "m", "(LEt0;)V", "o", "LnB0;", "composition", "p", "(LnB0;)V", "Lkotlin/Function0;", "content", C17296a.f69688o, "(LnB0;Lkotlin/jvm/functions/Function2;)V", "i", "LFR3;", "Lfu0;", "", "LsP5;", "Landroidx/compose/runtime/CompositionLocalMap;", "e", "()LFR3;", Action.SCOPE_ATTRIBUTE, "u", "", "Lau0;", "table", "l", "(Ljava/util/Set;)V", "n", "()V", "c", "LjW2;", "reference", "h", "(LjW2;)V", "b", "LiW2;", "k", "(LjW2;)LiW2;", MessageExtension.FIELD_DATA, "j", "(LjW2;LiW2;)V", "", "I", "f", "()I", "compoundHashKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "collectingParameterInformation", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "inspectionTables", "LPt0;", "r", "composers", "<set-?>", "LEX2;", "s", "t", "(LFR3;)V", "compositionLocalScope", "Lkotlin/coroutines/CoroutineContext;", "g", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(LPt0;IZ)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,4528:1\n1855#2,2:4529\n76#3:4531\n102#3,2:4532\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n3948#1:4529,2\n3998#1:4531\n3998#1:4532,2\n*E\n"})
    /* renamed from: Pt0$b */
    /* loaded from: classes.dex */
    public final class C6533b extends AbstractC37400Yt0 {

        /* renamed from: a */
        public final int f29291a;

        /* renamed from: b */
        public final boolean f29292b;

        /* renamed from: c */
        public Set<Set<InterfaceC38231au0>> f29293c;

        /* renamed from: d */
        public final Set<C35294Pt0> f29294d = new LinkedHashSet();

        /* renamed from: e */
        public final EX2 f29295e;

        public C6533b(int i, boolean z) {
            EX2 m97025e;
            this.f29291a = i;
            this.f29292b = z;
            m97025e = LM5.m97025e(C34494Mi1.m95010a(), null, 2, null);
            this.f29295e = m97025e;
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: a */
        public void mo16869a(InterfaceC45532nB0 composition, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            Intrinsics.checkNotNullParameter(content, "content");
            C35294Pt0.this.f29248c.mo16869a(composition, content);
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: b */
        public void mo16867b(C43351jW2 reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            C35294Pt0.this.f29248c.mo16867b(reference);
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: c */
        public void mo74042c() {
            C35294Pt0 c35294Pt0 = C35294Pt0.this;
            c35294Pt0.f29220B--;
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: d */
        public boolean mo16864d() {
            return this.f29292b;
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: e */
        public FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> mo74041e() {
            return m89486s();
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: f */
        public int mo16861f() {
            return this.f29291a;
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: g */
        public CoroutineContext mo16859g() {
            return C35294Pt0.this.f29248c.mo16859g();
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: h */
        public void mo16857h(C43351jW2 reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            C35294Pt0.this.f29248c.mo16857h(reference);
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: i */
        public void mo16855i(InterfaceC45532nB0 composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            C35294Pt0.this.f29248c.mo16855i(C35294Pt0.this.m89640E0());
            C35294Pt0.this.f29248c.mo16855i(composition);
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: j */
        public void mo16853j(C43351jW2 reference, C42758iW2 data) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            Intrinsics.checkNotNullParameter(data, "data");
            C35294Pt0.this.f29248c.mo16853j(reference, data);
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: k */
        public C42758iW2 mo16851k(C43351jW2 reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            return C35294Pt0.this.f29248c.mo16851k(reference);
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: l */
        public void mo16849l(Set<InterfaceC38231au0> table) {
            Intrinsics.checkNotNullParameter(table, "table");
            Set set = this.f29293c;
            if (set == null) {
                set = new HashSet();
                this.f29293c = set;
            }
            set.add(table);
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: m */
        public void mo74040m(InterfaceC32720Et0 composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            super.mo74040m((C35294Pt0) composer);
            this.f29294d.add(composer);
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: n */
        public void mo74039n() {
            C35294Pt0.this.f29220B++;
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: o */
        public void mo74038o(InterfaceC32720Et0 composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            Set<Set<InterfaceC38231au0>> set = this.f29293c;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((C35294Pt0) composer).f29250d);
                }
            }
            TypeIntrinsics.asMutableCollection(this.f29294d).remove(composer);
        }

        @Override // p000.AbstractC37400Yt0
        /* renamed from: p */
        public void mo16845p(InterfaceC45532nB0 composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            C35294Pt0.this.f29248c.mo16845p(composition);
        }

        /* renamed from: q */
        public final void m89488q() {
            if (!this.f29294d.isEmpty()) {
                Set<Set<InterfaceC38231au0>> set = this.f29293c;
                if (set != null) {
                    for (C35294Pt0 c35294Pt0 : this.f29294d) {
                        for (Set<InterfaceC38231au0> set2 : set) {
                            set2.remove(c35294Pt0.f29250d);
                        }
                    }
                }
                this.f29294d.clear();
            }
        }

        /* renamed from: r */
        public final Set<C35294Pt0> m89487r() {
            return this.f29294d;
        }

        /* renamed from: s */
        public final FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> m89486s() {
            return (FR3) this.f29295e.getValue();
        }

        /* renamed from: t */
        public final void m89485t(FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> fr3) {
            this.f29295e.setValue(fr3);
        }

        /* renamed from: u */
        public final void m89484u(FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            m89485t(scope);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"V", "T", "Llm;", "applier", "LqE5;", "<anonymous parameter 1>", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$c */
    /* loaded from: classes.dex */
    public static final class C6534c extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<T, V, Unit> f29297g;

        /* renamed from: h */
        public final /* synthetic */ V f29298h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6534c(Function2<? super T, ? super V, Unit> function2, V v) {
            super(3);
            this.f29297g = function2;
            this.f29298h = v;
        }

        /* renamed from: a */
        public final void m89483a(InterfaceC25773lm<?> applier, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(c47343qE5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            this.f29297g.invoke(applier.mo26853a(), this.f29298h);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89483a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"T", "Llm;", "applier", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$d */
    /* loaded from: classes.dex */
    public static final class C6535d extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<T> f29299g;

        /* renamed from: h */
        public final /* synthetic */ C19797db f29300h;

        /* renamed from: i */
        public final /* synthetic */ int f29301i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6535d(Function0<? extends T> function0, C19797db c19797db, int i) {
            super(3);
            this.f29299g = function0;
            this.f29300h = c19797db;
            this.f29301i = i;
        }

        /* renamed from: a */
        public final void m89482a(InterfaceC25773lm<?> applier, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            Object invoke = this.f29299g.invoke();
            slots.m17790d1(this.f29300h, invoke);
            applier.mo8332f(this.f29301i, invoke);
            applier.mo26851h(invoke);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89482a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"T", "Llm;", "applier", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$e */
    /* loaded from: classes.dex */
    public static final class C6536e extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C19797db f29302g;

        /* renamed from: h */
        public final /* synthetic */ int f29303h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6536e(C19797db c19797db, int i) {
            super(3);
            this.f29302g = c19797db;
            this.f29303h = i;
        }

        /* renamed from: a */
        public final void m89481a(InterfaceC25773lm<?> applier, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            Object m17752v0 = slots.m17752v0(this.f29302g);
            applier.mo26850i();
            applier.mo8331g(this.f29303h, m17752v0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89481a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "<anonymous parameter 1>", "LOv4;", "rememberManager", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$f */
    /* loaded from: classes.dex */
    public static final class C6537f extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Object f29304g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6537f(Object obj) {
            super(3);
            this.f29304g = obj;
        }

        /* renamed from: a */
        public final void m89480a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 rememberManager) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(c47343qE5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
            rememberManager.mo44865c((InterfaceC31784At0) this.f29304g);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89480a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "index", "", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "(ILjava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$g */
    /* loaded from: classes.dex */
    public static final class C6538g extends Lambda implements Function2<Integer, Object, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C35294Pt0 f29305g;

        /* renamed from: h */
        public final /* synthetic */ int f29306h;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "rememberManager", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$deactivateToEndGroup$3$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4528:1\n4513#2,5:4529\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$deactivateToEndGroup$3$1\n*L\n2807#1:4529,5\n*E\n"})
        /* renamed from: Pt0$g$a */
        /* loaded from: classes.dex */
        public static final class C6539a extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Object f29307g;

            /* renamed from: h */
            public final /* synthetic */ int f29308h;

            /* renamed from: i */
            public final /* synthetic */ int f29309i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6539a(Object obj, int i, int i2) {
                super(3);
                this.f29307g = obj;
                this.f29308h = i;
                this.f29309i = i2;
            }

            /* renamed from: a */
            public final void m89478a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 rememberManager) {
                Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                if (Intrinsics.areEqual(this.f29307g, slots.m17822P0(this.f29308h, this.f29309i))) {
                    rememberManager.mo44863e((InterfaceC35316Pv4) this.f29307g);
                    slots.m17832K0(this.f29309i, InterfaceC32720Et0.f8257a.m108267a());
                    return;
                }
                C35528Qt0.m87792x("Slot table is out of sync".toString());
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
                m89478a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$deactivateToEndGroup$3$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4528:1\n4513#2,5:4529\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$deactivateToEndGroup$3$2\n*L\n2822#1:4529,5\n*E\n"})
        /* renamed from: Pt0$g$b */
        /* loaded from: classes.dex */
        public static final class C6540b extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Object f29310g;

            /* renamed from: h */
            public final /* synthetic */ int f29311h;

            /* renamed from: i */
            public final /* synthetic */ int f29312i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6540b(Object obj, int i, int i2) {
                super(3);
                this.f29310g = obj;
                this.f29311h = i;
                this.f29312i = i2;
            }

            /* renamed from: a */
            public final void m89477a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
                Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
                if (Intrinsics.areEqual(this.f29310g, slots.m17822P0(this.f29311h, this.f29312i))) {
                    slots.m17832K0(this.f29312i, InterfaceC32720Et0.f8257a.m108267a());
                } else {
                    C35528Qt0.m87792x("Slot table is out of sync".toString());
                    throw new KotlinNothingValueException();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
                m89477a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6538g(C35294Pt0 c35294Pt0, int i) {
            super(2);
            this.f29305g = c35294Pt0;
            this.f29306h = i;
        }

        /* renamed from: a */
        public final void m89479a(int i, Object obj) {
            if (obj instanceof InterfaceC35316Pv4) {
                this.f29305g.f29227I.m25903O(this.f29306h);
                C35294Pt0.m89516u1(this.f29305g, false, new C6539a(obj, this.f29306h, i), 1, null);
            } else if (obj instanceof C46534os4) {
                C46534os4 c46534os4 = (C46534os4) obj;
                C39435cu0 m20394l = c46534os4.m20394l();
                if (m20394l != null) {
                    m20394l.m44880F(true);
                    c46534os4.m20382x();
                }
                this.f29305g.f29227I.m25903O(this.f29306h);
                C35294Pt0.m89516u1(this.f29305g, false, new C6540b(obj, this.f29306h, i), 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Object obj) {
            m89479a(num.intValue(), obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LsP5;", "it", "", C17296a.f69688o, "(LsP5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$h */
    /* loaded from: classes.dex */
    public static final class C6541h extends Lambda implements Function1<InterfaceC48627sP5<?>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C35294Pt0 f29313g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6541h(C35294Pt0 c35294Pt0) {
            super(1);
            this.f29313g = c35294Pt0;
        }

        /* renamed from: a */
        public final void m89476a(InterfaceC48627sP5<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f29313g.f29220B++;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48627sP5<?> interfaceC48627sP5) {
            m89476a(interfaceC48627sP5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LsP5;", "it", "", C17296a.f69688o, "(LsP5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$i */
    /* loaded from: classes.dex */
    public static final class C6542i extends Lambda implements Function1<InterfaceC48627sP5<?>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C35294Pt0 f29314g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6542i(C35294Pt0 c35294Pt0) {
            super(1);
            this.f29314g = c35294Pt0;
        }

        /* renamed from: a */
        public final void m89475a(InterfaceC48627sP5<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C35294Pt0 c35294Pt0 = this.f29314g;
            c35294Pt0.f29220B--;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48627sP5<?> interfaceC48627sP5) {
            m89475a(interfaceC48627sP5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pt0$j */
    /* loaded from: classes.dex */
    public static final class C6543j extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f29315g;

        /* renamed from: h */
        public final /* synthetic */ C35294Pt0 f29316h;

        /* renamed from: i */
        public final /* synthetic */ Object f29317i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6543j(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, C35294Pt0 c35294Pt0, Object obj) {
            super(0);
            this.f29315g = function2;
            this.f29316h = c35294Pt0;
            this.f29317i = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Object obj;
            if (this.f29315g != null) {
                this.f29316h.m89627I1(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, C35528Qt0.m87835G());
                C0521B6.m114361b(this.f29316h, this.f29315g);
                this.f29316h.m89508x0();
            } else if ((this.f29316h.f29264r || this.f29316h.f29270x) && (obj = this.f29317i) != null && !Intrinsics.areEqual(obj, InterfaceC32720Et0.f8257a.m108267a())) {
                this.f29316h.m89627I1(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, C35528Qt0.m87835G());
                C35294Pt0 c35294Pt0 = this.f29316h;
                Object obj2 = this.f29317i;
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
                C0521B6.m114361b(c35294Pt0, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj2, 2));
                this.f29316h.m89508x0();
            } else {
                this.f29316h.m89642D1();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,328:1\n3347#2:329\n*E\n"})
    /* renamed from: Pt0$k */
    /* loaded from: classes.dex */
    public static final class C6544k<T> implements Comparator {
        public C6544k() {
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((C44902m72) t).m26317b()), Integer.valueOf(((C44902m72) t2).m26317b()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "<anonymous parameter 1>", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$l */
    /* loaded from: classes.dex */
    public static final class C6545l extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<InterfaceC37166Xt0, Unit> f29318g;

        /* renamed from: h */
        public final /* synthetic */ C35294Pt0 f29319h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6545l(Function1<? super InterfaceC37166Xt0, Unit> function1, C35294Pt0 c35294Pt0) {
            super(3);
            this.f29318g = function1;
            this.f29319h = c35294Pt0;
        }

        /* renamed from: a */
        public final void m89474a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(c47343qE5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            this.f29318g.invoke(this.f29319h.m89640E0());
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89474a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "applier", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$m */
    /* loaded from: classes.dex */
    public static final class C6546m extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.IntRef f29320g;

        /* renamed from: h */
        public final /* synthetic */ C19797db f29321h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6546m(Ref.IntRef intRef, C19797db c19797db) {
            super(3);
            this.f29320g = intRef;
            this.f29321h = c19797db;
        }

        /* renamed from: a */
        public final void m89473a(InterfaceC25773lm<?> applier, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            this.f29320g.element = C35294Pt0.m89619L0(slots, this.f29321h, applier);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89473a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,4528:1\n3212#2,4:4529\n3222#2,9:4533\n3217#2:4542\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$1\n*L\n3086#1:4529,4\n3087#1:4533,9\n3086#1:4542\n*E\n"})
    /* renamed from: Pt0$n */
    /* loaded from: classes.dex */
    public static final class C6547n extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ C35294Pt0 f29322g;

        /* renamed from: h */
        public final /* synthetic */ List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> f29323h;

        /* renamed from: i */
        public final /* synthetic */ C44971mE5 f29324i;

        /* renamed from: j */
        public final /* synthetic */ C43351jW2 f29325j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6547n(C35294Pt0 c35294Pt0, List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> list, C44971mE5 c44971mE5, C43351jW2 c43351jW2) {
            super(0);
            this.f29322g = c35294Pt0;
            this.f29323h = list;
            this.f29324i = c44971mE5;
            this.f29325j = c43351jW2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C35294Pt0 c35294Pt0 = this.f29322g;
            List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> list = this.f29323h;
            C44971mE5 c44971mE5 = this.f29324i;
            C43351jW2 c43351jW2 = this.f29325j;
            List list2 = c35294Pt0.f29252f;
            try {
                c35294Pt0.f29252f = list;
                C44971mE5 c44971mE52 = c35294Pt0.f29227I;
                int[] iArr = c35294Pt0.f29261o;
                c35294Pt0.f29261o = null;
                c35294Pt0.f29227I = c44971mE5;
                c35294Pt0.m89607P0(c43351jW2.m30395c(), c43351jW2.m30393e(), c43351jW2.m30392f(), true);
                Unit unit = Unit.INSTANCE;
                c35294Pt0.f29227I = c44971mE52;
                c35294Pt0.f29261o = iArr;
            } finally {
                c35294Pt0.f29252f = list2;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "applier", "LqE5;", "slots", "LOv4;", "rememberManager", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$2\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4528:1\n33#2,6:4529\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$2\n*L\n3101#1:4529,6\n*E\n"})
    /* renamed from: Pt0$o */
    /* loaded from: classes.dex */
    public static final class C6548o extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.IntRef f29326g;

        /* renamed from: h */
        public final /* synthetic */ List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> f29327h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6548o(Ref.IntRef intRef, List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> list) {
            super(3);
            this.f29326g = intRef;
            this.f29327h = list;
        }

        /* renamed from: a */
        public final void m89472a(InterfaceC25773lm<?> applier, C47343qE5 slots, InterfaceC35082Ov4 rememberManager) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
            int i = this.f29326g.element;
            if (i > 0) {
                applier = new C32354De3(applier, i);
            }
            List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> list = this.f29327h;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).invoke(applier, slots, rememberManager);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89472a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "applier", "LqE5;", "<anonymous parameter 1>", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$3\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4528:1\n64#2,6:4529\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$3\n*L\n3121#1:4529,6\n*E\n"})
    /* renamed from: Pt0$p */
    /* loaded from: classes.dex */
    public static final class C6549p extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.IntRef f29328g;

        /* renamed from: h */
        public final /* synthetic */ List<Object> f29329h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6549p(Ref.IntRef intRef, List<? extends Object> list) {
            super(3);
            this.f29328g = intRef;
            this.f29329h = list;
        }

        /* renamed from: a */
        public final void m89471a(InterfaceC25773lm<?> applier, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(c47343qE5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            int i = this.f29328g.element;
            List<Object> list = this.f29329h;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                int i3 = i + i2;
                applier.mo8331g(i3, obj);
                applier.mo8332f(i3, obj);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89471a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$4\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4528:1\n33#2,6:4529\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$4\n*L\n3156#1:4529,6\n*E\n"})
    /* renamed from: Pt0$q */
    /* loaded from: classes.dex */
    public static final class C6550q extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C42758iW2 f29330g;

        /* renamed from: h */
        public final /* synthetic */ C35294Pt0 f29331h;

        /* renamed from: i */
        public final /* synthetic */ C43351jW2 f29332i;

        /* renamed from: j */
        public final /* synthetic */ C43351jW2 f29333j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6550q(C42758iW2 c42758iW2, C35294Pt0 c35294Pt0, C43351jW2 c43351jW2, C43351jW2 c43351jW22) {
            super(3);
            this.f29330g = c42758iW2;
            this.f29331h = c35294Pt0;
            this.f29332i = c43351jW2;
            this.f29333j = c43351jW22;
        }

        /* renamed from: a */
        public final void m89470a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            C46534os4 c46534os4;
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            C42758iW2 c42758iW2 = this.f29330g;
            if (c42758iW2 == null && (c42758iW2 = this.f29331h.f29248c.mo16851k(this.f29332i)) == null) {
                C35528Qt0.m87792x("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List<C19797db> m17760r0 = slots.m17760r0(1, c42758iW2.m33850a(), 2);
            if (!m17760r0.isEmpty()) {
                InterfaceC45532nB0 m30396b = this.f29333j.m30396b();
                Intrinsics.checkNotNull(m30396b, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                C39435cu0 c39435cu0 = (C39435cu0) m30396b;
                int size = m17760r0.size();
                for (int i = 0; i < size; i++) {
                    Object m17820Q0 = slots.m17820Q0(m17760r0.get(i), 0);
                    if (m17820Q0 instanceof C46534os4) {
                        c46534os4 = (C46534os4) m17820Q0;
                    } else {
                        c46534os4 = null;
                    }
                    if (c46534os4 != null) {
                        c46534os4.m20399g(c39435cu0);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89470a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pt0$r */
    /* loaded from: classes.dex */
    public static final class C6551r extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ C35294Pt0 f29334g;

        /* renamed from: h */
        public final /* synthetic */ C43351jW2 f29335h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6551r(C35294Pt0 c35294Pt0, C43351jW2 c43351jW2) {
            super(0);
            this.f29334g = c35294Pt0;
            this.f29335h = c43351jW2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f29334g.m89607P0(this.f29335h.m30395c(), this.f29335h.m30393e(), this.f29335h.m30392f(), true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "applier", "LqE5;", "slots", "LOv4;", "rememberManager", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$5$1$2\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4528:1\n33#2,6:4529\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$5$1$2\n*L\n3191#1:4529,6\n*E\n"})
    /* renamed from: Pt0$s */
    /* loaded from: classes.dex */
    public static final class C6552s extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.IntRef f29336g;

        /* renamed from: h */
        public final /* synthetic */ List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> f29337h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6552s(Ref.IntRef intRef, List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> list) {
            super(3);
            this.f29336g = intRef;
            this.f29337h = list;
        }

        /* renamed from: a */
        public final void m89469a(InterfaceC25773lm<?> applier, C47343qE5 slots, InterfaceC35082Ov4 rememberManager) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
            int i = this.f29336g.element;
            if (i > 0) {
                applier = new C32354De3(applier, i);
            }
            List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> list = this.f29337h;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).invoke(applier, slots, rememberManager);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89469a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "applier", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$t */
    /* loaded from: classes.dex */
    public static final class C6553t extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public static final C6553t f29338g = new C6553t();

        static {
        }

        public C6553t() {
            super(3);
        }

        /* renamed from: a */
        public final void m89468a(InterfaceC25773lm<?> applier, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            C35294Pt0.m89616M0(slots, applier, 0);
            slots.m17827N();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89468a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$u */
    /* loaded from: classes.dex */
    public static final class C6554u extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C42165hW2<Object> f29339g;

        /* renamed from: h */
        public final /* synthetic */ Object f29340h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6554u(C42165hW2<Object> c42165hW2, Object obj) {
            super(2);
            this.f29339g = c42165hW2;
            this.f29340h = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(694380496, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:2967)");
            }
            this.f29339g.m36255a().invoke(this.f29340h, interfaceC32720Et0, 8);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "applier", "LqE5;", "<anonymous parameter 1>", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$v */
    /* loaded from: classes.dex */
    public static final class C6555v extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Object[] f29341g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6555v(Object[] objArr) {
            super(3);
            this.f29341g = objArr;
        }

        /* renamed from: a */
        public final void m89467a(InterfaceC25773lm<?> applier, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(c47343qE5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            int length = this.f29341g.length;
            for (int i = 0; i < length; i++) {
                applier.mo26851h(this.f29341g[i]);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89467a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "applier", "LqE5;", "<anonymous parameter 1>", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$w */
    /* loaded from: classes.dex */
    public static final class C6556w extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f29342g;

        /* renamed from: h */
        public final /* synthetic */ int f29343h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6556w(int i, int i2) {
            super(3);
            this.f29342g = i;
            this.f29343h = i2;
        }

        /* renamed from: a */
        public final void m89466a(InterfaceC25773lm<?> applier, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(c47343qE5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            applier.mo8335b(this.f29342g, this.f29343h);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89466a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "applier", "LqE5;", "<anonymous parameter 1>", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$x */
    /* loaded from: classes.dex */
    public static final class C6557x extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f29344g;

        /* renamed from: h */
        public final /* synthetic */ int f29345h;

        /* renamed from: i */
        public final /* synthetic */ int f29346i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6557x(int i, int i2, int i3) {
            super(3);
            this.f29344g = i;
            this.f29345h = i2;
            this.f29346i = i3;
        }

        /* renamed from: a */
        public final void m89465a(InterfaceC25773lm<?> applier, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(c47343qE5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            applier.mo8333e(this.f29344g, this.f29345h, this.f29346i);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89465a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "<anonymous parameter 0>", "LqE5;", "slots", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pt0$y */
    /* loaded from: classes.dex */
    public static final class C6558y extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f29347g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6558y(int i) {
            super(3);
            this.f29347g = i;
        }

        /* renamed from: a */
        public final void m89464a(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 slots, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(interfaceC25773lm, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            slots.m17745z(this.f29347g);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89464a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Llm;", "applier", "LqE5;", "<anonymous parameter 1>", "LOv4;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Llm;LqE5;LOv4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$realizeUps$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4528:1\n1#2:4529\n*E\n"})
    /* renamed from: Pt0$z */
    /* loaded from: classes.dex */
    public static final class C6559z extends Lambda implements Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f29348g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6559z(int i) {
            super(3);
            this.f29348g = i;
        }

        /* renamed from: a */
        public final void m89463a(InterfaceC25773lm<?> applier, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            Intrinsics.checkNotNullParameter(applier, "applier");
            Intrinsics.checkNotNullParameter(c47343qE5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(interfaceC35082Ov4, "<anonymous parameter 2>");
            int i = this.f29348g;
            for (int i2 = 0; i2 < i; i2++) {
                applier.mo26850i();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC25773lm<?> interfaceC25773lm, C47343qE5 c47343qE5, InterfaceC35082Ov4 interfaceC35082Ov4) {
            m89463a(interfaceC25773lm, c47343qE5, interfaceC35082Ov4);
            return Unit.INSTANCE;
        }
    }

    public C35294Pt0(InterfaceC25773lm<?> applier, AbstractC37400Yt0 parentContext, C45564nE5 slotTable, Set<InterfaceC35316Pv4> abandonSet, List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> changes, List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> lateChanges, InterfaceC45532nB0 composition) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(slotTable, "slotTable");
        Intrinsics.checkNotNullParameter(abandonSet, "abandonSet");
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(lateChanges, "lateChanges");
        Intrinsics.checkNotNullParameter(composition, "composition");
        this.f29246b = applier;
        this.f29248c = parentContext;
        this.f29250d = slotTable;
        this.f29251e = abandonSet;
        this.f29252f = changes;
        this.f29253g = lateChanges;
        this.f29254h = composition;
        this.f29255i = new C45061mO5<>();
        this.f29258l = new J52();
        this.f29260n = new J52();
        this.f29266t = new ArrayList();
        this.f29267u = new J52();
        this.f29268v = C34494Mi1.m95010a();
        this.f29269w = new C51996y52<>(0, 1, null);
        this.f29271y = new J52();
        this.f29219A = -1;
        this.f29221C = C51564xM5.m5413D();
        this.f29223E = true;
        this.f29224F = new C45061mO5<>();
        C44971mE5 m24114y = slotTable.m24114y();
        m24114y.m25894d();
        this.f29227I = m24114y;
        C45564nE5 c45564nE5 = new C45564nE5();
        this.f29228J = c45564nE5;
        C47343qE5 m24113z = c45564nE5.m24113z();
        m24113z.m17843F();
        this.f29229K = m24113z;
        C44971mE5 m24114y2 = this.f29228J.m24114y();
        try {
            C19797db m25897a = m24114y2.m25897a(0);
            m24114y2.m25894d();
            this.f29233O = m25897a;
            this.f29234P = new ArrayList();
            this.f29238T = new C45061mO5<>();
            this.f29241W = true;
            this.f29242X = new J52();
            this.f29243Y = new C45061mO5<>();
            this.f29244Z = -1;
            this.f29245a0 = -1;
            this.f29247b0 = -1;
        } catch (Throwable th) {
            m24114y2.m25894d();
            throw th;
        }
    }

    /* renamed from: B1 */
    public static final int m89648B1(C35294Pt0 c35294Pt0, int i, boolean z, int i2) {
        boolean z2;
        int i3;
        C6532a c6532a;
        List m87840B;
        int i4 = 1;
        if (c35294Pt0.f29227I.m25914D(i)) {
            int m25917A = c35294Pt0.f29227I.m25917A(i);
            Object m25916B = c35294Pt0.f29227I.m25916B(i);
            if (m25917A == 126665345 && (m25916B instanceof C42165hW2)) {
                C42165hW2 c42165hW2 = (C42165hW2) m25916B;
                Object m25872z = c35294Pt0.f29227I.m25872z(i, 0);
                C19797db m25897a = c35294Pt0.f29227I.m25897a(i);
                m87840B = C35528Qt0.m87840B(c35294Pt0.f29266t, i, c35294Pt0.f29227I.m25915C(i) + i);
                ArrayList arrayList = new ArrayList(m87840B.size());
                int size = m87840B.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C44902m72 c44902m72 = (C44902m72) m87840B.get(i5);
                    arrayList.add(TuplesKt.m28425to(c44902m72.m26316c(), c44902m72.m26318a()));
                }
                C43351jW2 c43351jW2 = new C43351jW2(c42165hW2, m25872z, c35294Pt0.m89640E0(), c35294Pt0.f29250d, m25897a, arrayList, c35294Pt0.m89523s0(i));
                c35294Pt0.f29248c.mo16867b(c43351jW2);
                c35294Pt0.m89525r1();
                c35294Pt0.m89561f1(new C6525E(c43351jW2));
                if (z) {
                    c35294Pt0.m89583X0();
                    c35294Pt0.m89576a1();
                    c35294Pt0.m89589V0();
                    if (!c35294Pt0.f29227I.m25910H(i)) {
                        i4 = c35294Pt0.f29227I.m25906L(i);
                    }
                    if (i4 <= 0) {
                        return 0;
                    }
                    c35294Pt0.m89528q1(i2, i4);
                    return 0;
                }
                return c35294Pt0.f29227I.m25906L(i);
            } else if (m25917A == 206 && Intrinsics.areEqual(m25916B, C35528Qt0.m87830L())) {
                Object m25872z2 = c35294Pt0.f29227I.m25872z(i, 0);
                if (m25872z2 instanceof C6532a) {
                    c6532a = (C6532a) m25872z2;
                } else {
                    c6532a = null;
                }
                if (c6532a != null) {
                    for (C35294Pt0 c35294Pt02 : c6532a.m89489a().m89487r()) {
                        c35294Pt02.m89501z1();
                    }
                }
                return c35294Pt0.f29227I.m25906L(i);
            } else {
                return c35294Pt0.f29227I.m25906L(i);
            }
        } else if (c35294Pt0.f29227I.m25893e(i)) {
            int m25915C = c35294Pt0.f29227I.m25915C(i) + i;
            int i6 = i + 1;
            int i7 = 0;
            while (i6 < m25915C) {
                boolean m25910H = c35294Pt0.f29227I.m25910H(i6);
                if (m25910H) {
                    c35294Pt0.m89583X0();
                    c35294Pt0.m89552i1(c35294Pt0.f29227I.m25908J(i6));
                }
                if (!m25910H && !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (m25910H) {
                    i3 = 0;
                } else {
                    i3 = i2 + i7;
                }
                i7 += m89648B1(c35294Pt0, i6, z2, i3);
                if (m25910H) {
                    c35294Pt0.m89583X0();
                    c35294Pt0.m89513v1();
                }
                i6 += c35294Pt0.f29227I.m25915C(i6);
            }
            return i7;
        } else {
            return c35294Pt0.f29227I.m25906L(i);
        }
    }

    /* renamed from: K0 */
    public static final int m89622K0(C47343qE5 c47343qE5) {
        int m17750w0;
        int m17813U = c47343qE5.m17813U();
        int m17811V = c47343qE5.m17811V();
        while (m17811V >= 0 && !c47343qE5.m17774k0(m17811V)) {
            m17811V = c47343qE5.m17746y0(m17811V);
        }
        int i = m17811V + 1;
        int i2 = 0;
        while (i < m17813U) {
            if (c47343qE5.m17785f0(m17813U, i)) {
                if (c47343qE5.m17774k0(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                if (c47343qE5.m17774k0(i)) {
                    m17750w0 = 1;
                } else {
                    m17750w0 = c47343qE5.m17750w0(i);
                }
                i2 += m17750w0;
                i += c47343qE5.m17794c0(i);
            }
        }
        return i2;
    }

    /* renamed from: L0 */
    public static final int m89619L0(C47343qE5 c47343qE5, C19797db c19797db, InterfaceC25773lm<Object> interfaceC25773lm) {
        boolean z;
        int m17851B = c47343qE5.m17851B(c19797db);
        boolean z2 = true;
        if (c47343qE5.m17813U() < m17851B) {
            z = true;
        } else {
            z = false;
        }
        C35528Qt0.m87818X(z);
        m89616M0(c47343qE5, interfaceC25773lm, m17851B);
        int m89622K0 = m89622K0(c47343qE5);
        while (c47343qE5.m17813U() < m17851B) {
            if (c47343qE5.m17788e0(m17851B)) {
                if (c47343qE5.m17776j0()) {
                    interfaceC25773lm.mo26851h(c47343qE5.m17754u0(c47343qE5.m17813U()));
                    m89622K0 = 0;
                }
                c47343qE5.m17814T0();
            } else {
                m89622K0 += c47343qE5.m17826N0();
            }
        }
        if (c47343qE5.m17813U() != m17851B) {
            z2 = false;
        }
        C35528Qt0.m87818X(z2);
        return m89622K0;
    }

    /* renamed from: M0 */
    public static final void m89616M0(C47343qE5 c47343qE5, InterfaceC25773lm<Object> interfaceC25773lm, int i) {
        while (!c47343qE5.m17782g0(i)) {
            c47343qE5.m17824O0();
            if (c47343qE5.m17774k0(c47343qE5.m17811V())) {
                interfaceC25773lm.mo26850i();
            }
            c47343qE5.m17827N();
        }
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m89579Z0(C35294Pt0 c35294Pt0, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c35294Pt0.m89581Y0(z);
    }

    /* renamed from: d1 */
    public static /* synthetic */ Object m89567d1(C35294Pt0 c35294Pt0, InterfaceC45532nB0 interfaceC45532nB0, InterfaceC45532nB0 interfaceC45532nB02, Integer num, List list, Function0 function0, int i, Object obj) {
        InterfaceC45532nB0 interfaceC45532nB03;
        InterfaceC45532nB0 interfaceC45532nB04;
        Integer num2;
        List emptyList;
        if ((i & 1) != 0) {
            interfaceC45532nB03 = null;
        } else {
            interfaceC45532nB03 = interfaceC45532nB0;
        }
        if ((i & 2) != 0) {
            interfaceC45532nB04 = null;
        } else {
            interfaceC45532nB04 = interfaceC45532nB02;
        }
        if ((i & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list2 = emptyList;
        }
        return c35294Pt0.m89570c1(interfaceC45532nB03, interfaceC45532nB04, num2, list2, function0);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m89516u1(C35294Pt0 c35294Pt0, boolean z, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c35294Pt0.m89519t1(z, function3);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: A */
    public void mo89653A(W94<?>[] values) {
        FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> m89597S1;
        int m87795u;
        Intrinsics.checkNotNullParameter(values, "values");
        FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> m89526r0 = m89526r0();
        m89627I1(201, C35528Qt0.m87833I());
        m89627I1(203, C35528Qt0.m87831K());
        FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> fr3 = (FR3) C0521B6.m114360c(this, new C6527G(values, m89526r0));
        m89508x0();
        boolean z = false;
        if (mo89521t()) {
            m89597S1 = m89597S1(m89526r0, fr3);
            this.f29230L = true;
        } else {
            Object m25873y = this.f29227I.m25873y(0);
            Intrinsics.checkNotNull(m25873y, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> fr32 = (FR3) m25873y;
            Object m25873y2 = this.f29227I.m25873y(1);
            Intrinsics.checkNotNull(m25873y2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            FR3 fr33 = (FR3) m25873y2;
            if (mo89575b() && Intrinsics.areEqual(fr33, fr3)) {
                m89639E1();
                m89597S1 = fr32;
            } else {
                m89597S1 = m89597S1(m89526r0, fr3);
                z = !Intrinsics.areEqual(m89597S1, fr32);
            }
        }
        if (z && !mo89521t()) {
            this.f29269w.m4158c(this.f29227I.m25886l(), m89597S1);
        }
        J52 j52 = this.f29271y;
        m87795u = C35528Qt0.m87795u(this.f29270x);
        j52.m101180i(m87795u);
        this.f29270x = z;
        this.f29231M = m89597S1;
        m89633G1(202, C35528Qt0.m87836F(), C43188jE1.f92297a.m30972a(), m89597S1);
    }

    /* renamed from: A0 */
    public final void m89652A0(boolean z, C37944aQ3 c37944aQ3) {
        this.f29255i.m25675h(this.f29256j);
        this.f29256j = c37944aQ3;
        this.f29258l.m101180i(this.f29257k);
        if (z) {
            this.f29257k = 0;
        }
        this.f29260n.m101180i(this.f29259m);
        this.f29259m = 0;
    }

    /* renamed from: A1 */
    public final void m89651A1(int i) {
        m89648B1(this, i, false, 0);
        m89583X0();
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: B */
    public void mo89650B() {
        m89508x0();
        C46534os4 m89637F0 = m89637F0();
        if (m89637F0 != null && m89637F0.m20388r()) {
            m89637F0.m20412B(true);
        }
    }

    /* renamed from: B0 */
    public final void m89649B0(int i, boolean z) {
        C37944aQ3 m25676g = this.f29255i.m25676g();
        if (m25676g != null && !z) {
            m25676g.m71415l(m25676g.m71426a() + 1);
        }
        this.f29256j = m25676g;
        this.f29257k = this.f29258l.m101181h() + i;
        this.f29259m = this.f29260n.m101181h() + i;
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: C */
    public void mo89647C() {
        this.f29263q = true;
    }

    /* renamed from: C0 */
    public final void m89646C0() {
        m89576a1();
        if (this.f29255i.m25680c()) {
            if (this.f29242X.m101185d()) {
                m89541m0();
                return;
            } else {
                C35528Qt0.m87792x("Missed recording an endGroup()".toString());
                throw new KotlinNothingValueException();
            }
        }
        C35528Qt0.m87792x("Start/end imbalance".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: C1 */
    public final <T> T m89645C1(AbstractC41213fu0<T> abstractC41213fu0, FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> fr3) {
        if (C35528Qt0.m87790z(fr3, abstractC41213fu0)) {
            return (T) C35528Qt0.m87829M(fr3, abstractC41213fu0);
        }
        return abstractC41213fu0.m40583a().getValue();
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: D */
    public InterfaceC45941ns4 mo89644D() {
        return m89637F0();
    }

    /* renamed from: D0 */
    public final boolean m89643D0() {
        return this.f29220B > 0;
    }

    /* renamed from: D1 */
    public void m89642D1() {
        if (this.f29266t.isEmpty()) {
            m89639E1();
            return;
        }
        C44971mE5 c44971mE5 = this.f29227I;
        int m25883o = c44971mE5.m25883o();
        Object m25882p = c44971mE5.m25882p();
        Object m25885m = c44971mE5.m25885m();
        m89615M1(m25883o, m25882p, m25885m);
        m89624J1(c44971mE5.m25911G(), null);
        m89564e1();
        c44971mE5.m25891g();
        m89609O1(m25883o, m25882p, m25885m);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: E */
    public void mo89641E() {
        if (this.f29272z && this.f29227I.m25878t() == this.f29219A) {
            this.f29219A = -1;
            this.f29272z = false;
        }
        m89511w0(false);
    }

    /* renamed from: E0 */
    public InterfaceC45532nB0 m89640E0() {
        return this.f29254h;
    }

    /* renamed from: E1 */
    public final void m89639E1() {
        this.f29259m += this.f29227I.m25901Q();
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: F */
    public void mo89638F(int i) {
        m89633G1(i, null, C43188jE1.f92297a.m30972a(), null);
    }

    /* renamed from: F0 */
    public final C46534os4 m89637F0() {
        C45061mO5<C46534os4> c45061mO5 = this.f29224F;
        if (this.f29220B == 0 && c45061mO5.m25679d()) {
            return c45061mO5.m25678e();
        }
        return null;
    }

    /* renamed from: F1 */
    public final void m89636F1() {
        this.f29259m = this.f29227I.m25877u();
        this.f29227I.m25900R();
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: G */
    public Object mo89635G() {
        return m89601R0();
    }

    /* renamed from: G0 */
    public final List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> m89634G0() {
        return this.f29232N;
    }

    /* renamed from: G1 */
    public final void m89633G1(int i, Object obj, int i2, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj3 = obj;
        m89585W1();
        m89615M1(i, obj, obj2);
        C43188jE1.C24740a c24740a = C43188jE1.f92297a;
        int i3 = 0;
        if (i2 != c24740a.m30972a()) {
            z = true;
        } else {
            z = false;
        }
        C37944aQ3 c37944aQ3 = null;
        if (mo89521t()) {
            this.f29227I.m25895c();
            int m17813U = this.f29229K.m17813U();
            if (z) {
                this.f29229K.m17808W0(i, InterfaceC32720Et0.f8257a.m108267a());
            } else if (obj2 != null) {
                C47343qE5 c47343qE5 = this.f29229K;
                if (obj3 == null) {
                    obj3 = InterfaceC32720Et0.f8257a.m108267a();
                }
                c47343qE5.m17816S0(i, obj3, obj2);
            } else {
                C47343qE5 c47343qE52 = this.f29229K;
                if (obj3 == null) {
                    obj3 = InterfaceC32720Et0.f8257a.m108267a();
                }
                c47343qE52.m17812U0(i, obj3);
            }
            C37944aQ3 c37944aQ32 = this.f29256j;
            if (c37944aQ32 != null) {
                C46452ok2 c46452ok2 = new C46452ok2(i, -1, m89610O0(m17813U), -1, 0);
                c37944aQ32.m71418i(c46452ok2, this.f29257k - c37944aQ32.m71422e());
                c37944aQ32.m71419h(c46452ok2);
            }
            m89652A0(z, null);
            return;
        }
        if (i2 != c24740a.m30971b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && this.f29272z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f29256j == null) {
            int m25883o = this.f29227I.m25883o();
            if (!z3 && m25883o == i && Intrinsics.areEqual(obj, this.f29227I.m25882p())) {
                m89624J1(z, obj2);
            } else {
                this.f29256j = new C37944aQ3(this.f29227I.m25890h(), this.f29257k);
            }
        }
        C37944aQ3 c37944aQ33 = this.f29256j;
        if (c37944aQ33 != null) {
            C46452ok2 m71423d = c37944aQ33.m71423d(i, obj);
            if (!z3 && m71423d != null) {
                c37944aQ33.m71419h(m71423d);
                int m20552b = m71423d.m20552b();
                this.f29257k = c37944aQ33.m71420g(m71423d) + c37944aQ33.m71422e();
                int m71414m = c37944aQ33.m71414m(m71423d);
                int m71426a = m71414m - c37944aQ33.m71426a();
                c37944aQ33.m71416k(m71414m, c37944aQ33.m71426a());
                m89531p1(m20552b);
                this.f29227I.m25903O(m20552b);
                if (m71426a > 0) {
                    m89522s1(new C6526F(m71426a));
                }
                m89624J1(z, obj2);
            } else {
                this.f29227I.m25895c();
                this.f29235Q = true;
                this.f29231M = null;
                m89502z0();
                this.f29229K.m17847D();
                int m17813U2 = this.f29229K.m17813U();
                if (z) {
                    this.f29229K.m17808W0(i, InterfaceC32720Et0.f8257a.m108267a());
                } else if (obj2 != null) {
                    C47343qE5 c47343qE53 = this.f29229K;
                    if (obj3 == null) {
                        obj3 = InterfaceC32720Et0.f8257a.m108267a();
                    }
                    c47343qE53.m17816S0(i, obj3, obj2);
                } else {
                    C47343qE5 c47343qE54 = this.f29229K;
                    if (obj3 == null) {
                        obj3 = InterfaceC32720Et0.f8257a.m108267a();
                    }
                    c47343qE54.m17812U0(i, obj3);
                }
                this.f29233O = this.f29229K.m17853A(m17813U2);
                C46452ok2 c46452ok22 = new C46452ok2(i, -1, m89610O0(m17813U2), -1, 0);
                c37944aQ33.m71418i(c46452ok22, this.f29257k - c37944aQ33.m71422e());
                c37944aQ33.m71419h(c46452ok22);
                ArrayList arrayList = new ArrayList();
                if (!z) {
                    i3 = this.f29257k;
                }
                c37944aQ3 = new C37944aQ3(arrayList, i3);
            }
        }
        m89652A0(z, c37944aQ3);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: H */
    public InterfaceC38231au0 mo89632H() {
        return this.f29250d;
    }

    /* renamed from: H0 */
    public final Object m89631H0(C44971mE5 c44971mE5) {
        return c44971mE5.m25908J(c44971mE5.m25878t());
    }

    /* renamed from: H1 */
    public final void m89630H1(int i) {
        m89633G1(i, null, C43188jE1.f92297a.m30972a(), null);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: I */
    public boolean mo89629I(Object obj) {
        if (m89601R0() != obj) {
            m89594T1(obj);
            return true;
        }
        return false;
    }

    /* renamed from: I0 */
    public final int m89628I0(C44971mE5 c44971mE5, int i) {
        Object m25874x;
        if (c44971mE5.m25913E(i)) {
            Object m25916B = c44971mE5.m25916B(i);
            if (m25916B != null) {
                if (m25916B instanceof Enum) {
                    return ((Enum) m25916B).ordinal();
                }
                if (m25916B instanceof C42165hW2) {
                    return 126665345;
                }
                return m25916B.hashCode();
            }
            return 0;
        }
        int m25917A = c44971mE5.m25917A(i);
        if (m25917A == 207 && (m25874x = c44971mE5.m25874x(i)) != null && !Intrinsics.areEqual(m25874x, InterfaceC32720Et0.f8257a.m108267a())) {
            m25917A = m25874x.hashCode();
        }
        return m25917A;
    }

    /* renamed from: I1 */
    public final void m89627I1(int i, Object obj) {
        m89633G1(i, obj, C43188jE1.f92297a.m30972a(), null);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: J */
    public void mo89626J() {
        m89633G1(-127, null, C43188jE1.f92297a.m30972a(), null);
    }

    /* renamed from: J0 */
    public final void m89625J0(List<Pair<C43351jW2, C43351jW2>> list) {
        Function3<? super InterfaceC25773lm<?>, ? super C47343qE5, ? super InterfaceC35082Ov4, Unit> function3;
        C45564nE5 m30391g;
        C19797db m30397a;
        List m87794v;
        List list2;
        C45564nE5 m33850a;
        Function3<? super InterfaceC25773lm<?>, ? super C47343qE5, ? super InterfaceC35082Ov4, Unit> function32;
        List<Function3<InterfaceC25773lm<?>, C47343qE5, InterfaceC35082Ov4, Unit>> list3 = this.f29253g;
        List list4 = this.f29252f;
        try {
            this.f29252f = list3;
            function3 = C35528Qt0.f31048e;
            m89561f1(function3);
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Pair<C43351jW2, C43351jW2> pair = list.get(i2);
                C43351jW2 component1 = pair.component1();
                C43351jW2 component2 = pair.component2();
                C19797db m30397a2 = component1.m30397a();
                int m24126b = component1.m30391g().m24126b(m30397a2);
                Ref.IntRef intRef = new Ref.IntRef();
                m89576a1();
                m89561f1(new C6546m(intRef, m30397a2));
                if (component2 == null) {
                    if (Intrinsics.areEqual(component1.m30391g(), this.f29228J)) {
                        m89529q0();
                    }
                    C44971mE5 m24114y = component1.m30391g().m24114y();
                    m24114y.m25903O(m24126b);
                    this.f29239U = m24126b;
                    ArrayList arrayList = new ArrayList();
                    m89567d1(this, null, null, null, null, new C6547n(this, arrayList, m24114y, component1), 15, null);
                    if (!arrayList.isEmpty()) {
                        m89561f1(new C6548o(intRef, arrayList));
                    }
                    Unit unit = Unit.INSTANCE;
                    m24114y.m25894d();
                } else {
                    C42758iW2 mo16851k = this.f29248c.mo16851k(component2);
                    if (mo16851k == null || (m30391g = mo16851k.m33850a()) == null) {
                        m30391g = component2.m30391g();
                    }
                    if (mo16851k == null || (m33850a = mo16851k.m33850a()) == null || (m30397a = m33850a.m24127a(i)) == null) {
                        m30397a = component2.m30397a();
                    }
                    m87794v = C35528Qt0.m87794v(m30391g, m30397a);
                    if (!m87794v.isEmpty()) {
                        m89561f1(new C6549p(intRef, m87794v));
                        if (Intrinsics.areEqual(component1.m30391g(), this.f29250d)) {
                            int m24126b2 = this.f29250d.m24126b(m30397a2);
                            m89603Q1(m24126b2, m89591U1(m24126b2) + m87794v.size());
                        }
                    }
                    m89561f1(new C6550q(mo16851k, this, component2, component1));
                    C44971mE5 m24114y2 = m30391g.m24114y();
                    C44971mE5 c44971mE5 = this.f29227I;
                    int[] iArr = this.f29261o;
                    this.f29261o = null;
                    this.f29227I = m24114y2;
                    int m24126b3 = m30391g.m24126b(m30397a);
                    m24114y2.m25903O(m24126b3);
                    this.f29239U = m24126b3;
                    ArrayList arrayList2 = new ArrayList();
                    List list5 = this.f29252f;
                    try {
                        this.f29252f = arrayList2;
                        list2 = list5;
                        try {
                            m89570c1(component2.m30396b(), component1.m30396b(), Integer.valueOf(m24114y2.m25886l()), component2.m30394d(), new C6551r(this, component1));
                            Unit unit2 = Unit.INSTANCE;
                            this.f29252f = list2;
                            if (!arrayList2.isEmpty()) {
                                m89561f1(new C6552s(intRef, arrayList2));
                            }
                            this.f29227I = c44971mE5;
                            this.f29261o = iArr;
                            m24114y2.m25894d();
                        } catch (Throwable th) {
                            th = th;
                            this.f29252f = list2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        list2 = list5;
                    }
                }
                function32 = C35528Qt0.f31045b;
                m89561f1(function32);
                i2++;
                i = 0;
            }
            m89561f1(C6553t.f29338g);
            this.f29239U = 0;
            Unit unit3 = Unit.INSTANCE;
        } finally {
            this.f29252f = list4;
        }
    }

    /* renamed from: J1 */
    public final void m89624J1(boolean z, Object obj) {
        if (z) {
            this.f29227I.m25898T();
            return;
        }
        if (obj != null && this.f29227I.m25885m() != obj) {
            m89516u1(this, false, new C6528H(obj), 1, null);
        }
        this.f29227I.m25899S();
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: K */
    public void mo89623K(int i, Object obj) {
        m89633G1(i, obj, C43188jE1.f92297a.m30972a(), null);
    }

    /* renamed from: K1 */
    public final void m89621K1() {
        int m87795u;
        this.f29227I = this.f29250d.m24114y();
        m89630H1(100);
        this.f29248c.mo74039n();
        this.f29268v = this.f29248c.mo74041e();
        J52 j52 = this.f29271y;
        m87795u = C35528Qt0.m87795u(this.f29270x);
        j52.m101180i(m87795u);
        this.f29270x = mo89539n(this.f29268v);
        this.f29231M = null;
        if (!this.f29263q) {
            this.f29263q = this.f29248c.mo16864d();
        }
        Set<InterfaceC38231au0> set = (Set) m89645C1(U32.m82034a(), this.f29268v);
        if (set != null) {
            set.add(this.f29250d);
            this.f29248c.mo16849l(set);
        }
        m89630H1(this.f29248c.mo16861f());
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: L */
    public void mo89620L() {
        this.f29272z = false;
    }

    /* renamed from: L1 */
    public final boolean m89618L1(C46534os4 scope, Object obj) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        C19797db m20396j = scope.m20396j();
        if (m20396j == null) {
            return false;
        }
        int m44092d = m20396j.m44092d(this.f29250d);
        if (!this.f29225G || m44092d < this.f29227I.m25886l()) {
            return false;
        }
        C35528Qt0.m87828N(this.f29266t, m44092d, scope, obj);
        return true;
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: M */
    public <T> void mo89617M(Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        m89588V1();
        if (mo89521t()) {
            int m101184e = this.f29258l.m101184e();
            C47343qE5 c47343qE5 = this.f29229K;
            C19797db m17853A = c47343qE5.m17853A(c47343qE5.m17811V());
            this.f29259m++;
            m89543l1(new C6535d(factory, m17853A, m101184e));
            m89537n1(new C6536e(m17853A, m101184e));
            return;
        }
        C35528Qt0.m87792x("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: M1 */
    public final void m89615M1(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207 && !Intrinsics.areEqual(obj2, InterfaceC32720Et0.f8257a.m108267a())) {
                m89612N1(obj2.hashCode());
            } else {
                m89612N1(i);
            }
        } else if (obj instanceof Enum) {
            m89612N1(((Enum) obj).ordinal());
        } else {
            m89612N1(obj.hashCode());
        }
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: N */
    public void mo89614N() {
        boolean m87796t;
        m89508x0();
        m89508x0();
        m87796t = C35528Qt0.m87796t(this.f29271y.m101181h());
        this.f29270x = m87796t;
        this.f29231M = null;
    }

    /* renamed from: N0 */
    public void m89613N0(List<Pair<C43351jW2, C43351jW2>> references) {
        Intrinsics.checkNotNullParameter(references, "references");
        try {
            m89625J0(references);
            m89541m0();
        } catch (Throwable th) {
            m89602R();
            throw th;
        }
    }

    /* renamed from: N1 */
    public final void m89612N1(int i) {
        this.f29236R = i ^ Integer.rotateLeft(mo89611O(), 3);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: O */
    public int mo89611O() {
        return this.f29236R;
    }

    /* renamed from: O0 */
    public final int m89610O0(int i) {
        return (-2) - i;
    }

    /* renamed from: O1 */
    public final void m89609O1(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207 && !Intrinsics.areEqual(obj2, InterfaceC32720Et0.f8257a.m108267a())) {
                m89606P1(obj2.hashCode());
            } else {
                m89606P1(i);
            }
        } else if (obj instanceof Enum) {
            m89606P1(((Enum) obj).ordinal());
        } else {
            m89606P1(obj.hashCode());
        }
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: P */
    public void mo89608P() {
        m89508x0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        r10.f29269w.m4158c(r10.f29227I.m25886l(), r12);
     */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m89607P0(C42165hW2<Object> c42165hW2, FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> fr3, Object obj, boolean z) {
        List emptyList;
        mo89623K(126665345, c42165hW2);
        mo89539n(obj);
        int mo89611O = mo89611O();
        try {
            this.f29236R = 126665345;
            boolean z2 = false;
            if (mo89521t()) {
                C47343qE5.m17770m0(this.f29229K, 0, 1, null);
            }
            if (!mo89521t() && !Intrinsics.areEqual(this.f29227I.m25885m(), fr3)) {
                z2 = true;
            }
            m89633G1(202, C35528Qt0.m87836F(), C43188jE1.f92297a.m30972a(), fr3);
            if (mo89521t() && !z) {
                this.f29230L = true;
                this.f29231M = null;
                C47343qE5 c47343qE5 = this.f29229K;
                C19797db m17853A = c47343qE5.m17853A(c47343qE5.m17746y0(c47343qE5.m17811V()));
                InterfaceC45532nB0 m89640E0 = m89640E0();
                C45564nE5 c45564nE5 = this.f29228J;
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                this.f29248c.mo16857h(new C43351jW2(c42165hW2, obj, m89640E0, c45564nE5, m17853A, emptyList, m89526r0()));
            } else {
                boolean z3 = this.f29270x;
                this.f29270x = z2;
                C0521B6.m114361b(this, C43575jt0.m29790c(694380496, true, new C6554u(c42165hW2, obj)));
                this.f29270x = z3;
            }
        } finally {
            m89508x0();
            this.f29236R = mo89611O;
            mo89608P();
        }
    }

    /* renamed from: P1 */
    public final void m89606P1(int i) {
        this.f29236R = Integer.rotateRight(Integer.hashCode(i) ^ mo89611O(), 3);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: Q */
    public void mo89605Q() {
        m89508x0();
    }

    /* renamed from: Q0 */
    public final boolean m89604Q0() {
        return this.f29225G;
    }

    /* renamed from: Q1 */
    public final void m89603Q1(int i, int i2) {
        if (m89591U1(i) != i2) {
            if (i < 0) {
                HashMap<Integer, Integer> hashMap = this.f29262p;
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.f29262p = hashMap;
                }
                hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            int[] iArr = this.f29261o;
            if (iArr == null) {
                iArr = new int[this.f29227I.m25876v()];
                ArraysKt___ArraysJvmKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.f29261o = iArr;
            }
            iArr[i] = i2;
        }
    }

    /* renamed from: R */
    public final void m89602R() {
        m89541m0();
        this.f29255i.m25682a();
        this.f29258l.m101188a();
        this.f29260n.m101188a();
        this.f29267u.m101188a();
        this.f29271y.m101188a();
        this.f29269w.m4160a();
        if (!this.f29227I.m25888j()) {
            this.f29227I.m25894d();
        }
        if (!this.f29229K.m17815T()) {
            this.f29229K.m17843F();
        }
        m89529q0();
        this.f29236R = 0;
        this.f29220B = 0;
        this.f29265s = false;
        this.f29235Q = false;
        this.f29272z = false;
        this.f29225G = false;
        this.f29264r = false;
    }

    @PublishedApi
    /* renamed from: R0 */
    public final Object m89601R0() {
        if (mo89521t()) {
            m89585W1();
            return InterfaceC32720Et0.f8257a.m108267a();
        }
        Object m25909I = this.f29227I.m25909I();
        if (this.f29272z) {
            return InterfaceC32720Et0.f8257a.m108267a();
        }
        return m25909I;
    }

    /* renamed from: R1 */
    public final void m89600R1(int i, int i2) {
        int m89591U1 = m89591U1(i);
        if (m89591U1 != i2) {
            int i3 = i2 - m89591U1;
            int m25681b = this.f29255i.m25681b() - 1;
            while (i != -1) {
                int m89591U12 = m89591U1(i) + i3;
                m89603Q1(i, m89591U12);
                int i4 = m25681b;
                while (true) {
                    if (-1 < i4) {
                        C37944aQ3 m25677f = this.f29255i.m25677f(i4);
                        if (m25677f != null && m25677f.m71413n(i, m89591U12)) {
                            m25681b = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f29227I.m25878t();
                } else if (!this.f29227I.m25910H(i)) {
                    i = this.f29227I.m25904N(i);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: S0 */
    public final Object m89598S0(C44971mE5 c44971mE5, int i) {
        return c44971mE5.m25908J(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S1 */
    public final FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> m89597S1(FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> fr3, FR3<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> fr32) {
        FR3.InterfaceC2276a<AbstractC41213fu0<Object>, ? extends InterfaceC48627sP5<? extends Object>> builder = fr3.builder();
        builder.putAll(fr32);
        FR3 build = builder.build();
        m89627I1(204, C35528Qt0.m87832J());
        mo89539n(build);
        mo89539n(fr32);
        m89508x0();
        return build;
    }

    /* renamed from: T0 */
    public final int m89595T0(int i, int i2, int i3, int i4) {
        int m25904N = this.f29227I.m25904N(i2);
        while (m25904N != i3 && !this.f29227I.m25910H(m25904N)) {
            m25904N = this.f29227I.m25904N(m25904N);
        }
        if (this.f29227I.m25910H(m25904N)) {
            i4 = 0;
        }
        if (m25904N == i2) {
            return i4;
        }
        int m89591U1 = (m89591U1(m25904N) - this.f29227I.m25906L(i2)) + i4;
        loop1: while (i4 < m89591U1 && m25904N != i) {
            m25904N++;
            while (m25904N < i) {
                int m25915C = this.f29227I.m25915C(m25904N) + m25904N;
                if (i >= m25915C) {
                    i4 += m89591U1(m25904N);
                    m25904N = m25915C;
                }
            }
            break loop1;
        }
        return i4;
    }

    @PublishedApi
    /* renamed from: T1 */
    public final void m89594T1(Object obj) {
        if (mo89521t()) {
            this.f29229K.m17806X0(obj);
            if (obj instanceof InterfaceC35316Pv4) {
                m89561f1(new C6529I(obj));
                this.f29251e.add(obj);
                return;
            }
            return;
        }
        int m25880r = this.f29227I.m25880r() - 1;
        if (obj instanceof InterfaceC35316Pv4) {
            this.f29251e.add(obj);
        }
        m89519t1(true, new C6530J(obj, m25880r));
    }

    /* renamed from: U0 */
    public final void m89592U0(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!this.f29225G) {
            this.f29225G = true;
            try {
                block.invoke();
                return;
            } finally {
                this.f29225G = false;
            }
        }
        C35528Qt0.m87792x("Preparing a composition while composing is not supported".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: U1 */
    public final int m89591U1(int i) {
        int i2;
        Integer num;
        if (i < 0) {
            HashMap<Integer, Integer> hashMap = this.f29262p;
            if (hashMap != null && (num = hashMap.get(Integer.valueOf(i))) != null) {
                return num.intValue();
            }
            return 0;
        }
        int[] iArr = this.f29261o;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.f29227I.m25906L(i);
    }

    /* renamed from: V0 */
    public final void m89589V0() {
        if (this.f29238T.m25679d()) {
            m89586W0(this.f29238T.m25674i());
            this.f29238T.m25682a();
        }
    }

    /* renamed from: V1 */
    public final void m89588V1() {
        if (this.f29265s) {
            this.f29265s = false;
        } else {
            C35528Qt0.m87792x("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: W0 */
    public final void m89586W0(Object[] objArr) {
        m89561f1(new C6555v(objArr));
    }

    /* renamed from: W1 */
    public final void m89585W1() {
        if (!this.f29265s) {
            return;
        }
        C35528Qt0.m87792x("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: X0 */
    public final void m89583X0() {
        int i = this.f29249c0;
        this.f29249c0 = 0;
        if (i > 0) {
            int i2 = this.f29244Z;
            if (i2 >= 0) {
                this.f29244Z = -1;
                m89558g1(new C6556w(i2, i));
                return;
            }
            int i3 = this.f29245a0;
            this.f29245a0 = -1;
            int i4 = this.f29247b0;
            this.f29247b0 = -1;
            m89558g1(new C6557x(i3, i4, i));
        }
    }

    /* renamed from: Y0 */
    public final void m89581Y0(boolean z) {
        int m25886l;
        boolean z2;
        if (z) {
            m25886l = this.f29227I.m25878t();
        } else {
            m25886l = this.f29227I.m25886l();
        }
        int i = m25886l - this.f29239U;
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i > 0) {
                m89561f1(new C6558y(i));
                this.f29239U = m25886l;
                return;
            }
            return;
        }
        C35528Qt0.m87792x("Tried to seek backward".toString());
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: a */
    public void mo89578a(boolean z) {
        boolean z2;
        if (this.f29259m == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!mo89521t()) {
                if (!z) {
                    m89636F1();
                    return;
                }
                int m25886l = this.f29227I.m25886l();
                int m25887k = this.f29227I.m25887k();
                for (int i = m25886l; i < m25887k; i++) {
                    if (this.f29227I.m25910H(i)) {
                        Object m25908J = this.f29227I.m25908J(i);
                        if (m25908J instanceof InterfaceC31784At0) {
                            m89561f1(new C6537f(m25908J));
                        }
                    }
                    this.f29227I.m25889i(i, new C6538g(this, i));
                }
                C35528Qt0.m87819W(this.f29266t, m25886l, m25887k);
                this.f29227I.m25903O(m25886l);
                this.f29227I.m25900R();
                return;
            }
            return;
        }
        C35528Qt0.m87792x("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: a1 */
    public final void m89576a1() {
        int i = this.f29237S;
        if (i > 0) {
            this.f29237S = 0;
            m89561f1(new C6559z(i));
        }
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: b */
    public boolean mo89575b() {
        boolean z;
        if (mo89521t() || this.f29272z || this.f29270x) {
            return false;
        }
        C46534os4 m89637F0 = m89637F0();
        if (m89637F0 != null && !m89637F0.m20391o()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f29264r) {
            return false;
        }
        return true;
    }

    /* renamed from: b1 */
    public final boolean m89573b1(C43943kW1<C46534os4, C44536lW1<Object>> invalidationsRequested) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        if (this.f29252f.isEmpty()) {
            if (!invalidationsRequested.m28893i() && !(!this.f29266t.isEmpty()) && !this.f29264r) {
                return false;
            }
            m89517u0(invalidationsRequested, null);
            return !this.f29252f.isEmpty();
        }
        C35528Qt0.m87792x("Expected applyChanges() to have been called".toString());
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: c */
    public <T> T mo89572c(AbstractC41213fu0<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) m89645C1(key, m89526r0());
    }

    /* renamed from: c1 */
    public final <R> R m89570c1(InterfaceC45532nB0 interfaceC45532nB0, InterfaceC45532nB0 interfaceC45532nB02, Integer num, List<Pair<C46534os4, C44536lW1<Object>>> list, Function0<? extends R> function0) {
        R r;
        int i;
        boolean z = this.f29241W;
        boolean z2 = this.f29225G;
        int i2 = this.f29257k;
        try {
            this.f29241W = false;
            this.f29225G = true;
            this.f29257k = 0;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Pair<C46534os4, C44536lW1<Object>> pair = list.get(i3);
                C46534os4 component1 = pair.component1();
                C44536lW1<Object> component2 = pair.component2();
                if (component2 != null) {
                    int size2 = component2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        m89618L1(component1, component2.get(i4));
                    }
                } else {
                    m89618L1(component1, null);
                }
            }
            if (interfaceC45532nB0 != null) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                r = (R) interfaceC45532nB0.mo24225a(interfaceC45532nB02, i, function0);
                if (r == null) {
                }
                return r;
            }
            r = function0.invoke();
            return r;
        } finally {
            this.f29241W = z;
            this.f29225G = z2;
            this.f29257k = i2;
        }
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: d */
    public <V, T> void mo89569d(V v, Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C6534c c6534c = new C6534c(block, v);
        if (mo89521t()) {
            m89543l1(c6534c);
        } else {
            m89558g1(c6534c);
        }
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: e */
    public void mo89566e() {
        m89588V1();
        if (!mo89521t()) {
            Object m89631H0 = m89631H0(this.f29227I);
            m89552i1(m89631H0);
            if (this.f29272z && (m89631H0 instanceof InterfaceC31784At0)) {
                m89558g1(C6531K.f29289g);
                return;
            }
            return;
        }
        C35528Qt0.m87792x("useNode() called while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: e1 */
    public final void m89564e1() {
        C44902m72 m87837E;
        boolean z = this.f29225G;
        this.f29225G = true;
        int m25878t = this.f29227I.m25878t();
        int m25915C = this.f29227I.m25915C(m25878t) + m25878t;
        int i = this.f29257k;
        int mo89611O = mo89611O();
        int i2 = this.f29259m;
        m87837E = C35528Qt0.m87837E(this.f29266t, this.f29227I.m25886l(), m25915C);
        boolean z2 = false;
        int i3 = m25878t;
        while (m87837E != null) {
            int m26317b = m87837E.m26317b();
            C35528Qt0.m87820V(this.f29266t, m26317b);
            if (m87837E.m26315d()) {
                this.f29227I.m25903O(m26317b);
                int m25886l = this.f29227I.m25886l();
                m89510w1(i3, m25886l, m25878t);
                this.f29257k = m89595T0(m26317b, m25886l, m25878t, i);
                this.f29236R = m89532p0(this.f29227I.m25904N(m25886l), m25878t, mo89611O);
                this.f29231M = null;
                m87837E.m26316c().m20398h(this);
                this.f29231M = null;
                this.f29227I.m25902P(m25878t);
                i3 = m25886l;
                z2 = true;
            } else {
                this.f29224F.m25675h(m87837E.m26316c());
                m87837E.m26316c().m20381y();
                this.f29224F.m25676g();
            }
            m87837E = C35528Qt0.m87837E(this.f29266t, this.f29227I.m25886l(), m25915C);
        }
        if (z2) {
            m89510w1(i3, m25878t, m25878t);
            this.f29227I.m25900R();
            int m89591U1 = m89591U1(m25878t);
            this.f29257k = i + m89591U1;
            this.f29259m = i2 + m89591U1;
        } else {
            m89636F1();
        }
        this.f29236R = mo89611O;
        this.f29225G = z;
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: f */
    public void mo89563f() {
        m89511w0(true);
    }

    /* renamed from: f1 */
    public final void m89561f1(Function3<? super InterfaceC25773lm<?>, ? super C47343qE5, ? super InterfaceC35082Ov4, Unit> function3) {
        this.f29252f.add(function3);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: g */
    public void mo89560g(Function0<Unit> effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        m89561f1(new C6523C(effect));
    }

    /* renamed from: g1 */
    public final void m89558g1(Function3<? super InterfaceC25773lm<?>, ? super C47343qE5, ? super InterfaceC35082Ov4, Unit> function3) {
        m89576a1();
        m89589V0();
        m89561f1(function3);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: h */
    public void mo89557h() {
        m89633G1(125, null, C43188jE1.f92297a.m30970c(), null);
        this.f29265s = true;
    }

    /* renamed from: h1 */
    public final void m89555h1() {
        Function3<? super InterfaceC25773lm<?>, ? super C47343qE5, ? super InterfaceC35082Ov4, Unit> function3;
        m89651A1(this.f29227I.m25886l());
        function3 = C35528Qt0.f31044a;
        m89522s1(function3);
        this.f29239U += this.f29227I.m25881q();
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: i */
    public void mo89554i(InterfaceC45941ns4 scope) {
        C46534os4 c46534os4;
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (scope instanceof C46534os4) {
            c46534os4 = (C46534os4) scope;
        } else {
            c46534os4 = null;
        }
        if (c46534os4 != null) {
            c46534os4.m20407G(true);
        }
    }

    /* renamed from: i1 */
    public final void m89552i1(Object obj) {
        this.f29238T.m25675h(obj);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: j */
    public void mo89551j(int i, Object obj) {
        if (this.f29227I.m25883o() == i && !Intrinsics.areEqual(this.f29227I.m25885m(), obj) && this.f29219A < 0) {
            this.f29219A = this.f29227I.m25886l();
            this.f29272z = true;
        }
        m89633G1(i, null, C43188jE1.f92297a.m30972a(), obj);
    }

    /* renamed from: j1 */
    public final void m89549j1() {
        boolean z;
        Function3 function3;
        int m25878t = this.f29227I.m25878t();
        if (this.f29242X.m101182g(-1) <= m25878t) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f29242X.m101182g(-1) == m25878t) {
                this.f29242X.m101181h();
                function3 = C35528Qt0.f31046c;
                m89516u1(this, false, function3, 1, null);
                return;
            }
            return;
        }
        C35528Qt0.m87792x("Missed recording an endGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: k */
    public void mo89548k() {
        boolean z;
        if (this.f29259m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C46534os4 m89637F0 = m89637F0();
            if (m89637F0 != null) {
                m89637F0.m20380z();
            }
            if (this.f29266t.isEmpty()) {
                m89636F1();
                return;
            } else {
                m89564e1();
                return;
            }
        }
        C35528Qt0.m87792x("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: k0 */
    public final void m89547k0() {
        C44902m72 m87820V;
        C46534os4 c46534os4;
        boolean z;
        if (mo89521t()) {
            InterfaceC45532nB0 m89640E0 = m89640E0();
            Intrinsics.checkNotNull(m89640E0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            C46534os4 c46534os42 = new C46534os4((C39435cu0) m89640E0);
            this.f29224F.m25675h(c46534os42);
            m89594T1(c46534os42);
            c46534os42.m20406H(this.f29222D);
            return;
        }
        m87820V = C35528Qt0.m87820V(this.f29266t, this.f29227I.m25878t());
        Object m25909I = this.f29227I.m25909I();
        if (Intrinsics.areEqual(m25909I, InterfaceC32720Et0.f8257a.m108267a())) {
            InterfaceC45532nB0 m89640E02 = m89640E0();
            Intrinsics.checkNotNull(m89640E02, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            c46534os4 = new C46534os4((C39435cu0) m89640E02);
            m89594T1(c46534os4);
        } else {
            Intrinsics.checkNotNull(m25909I, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            c46534os4 = (C46534os4) m25909I;
        }
        if (m87820V != null) {
            z = true;
        } else {
            z = false;
        }
        c46534os4.m20410D(z);
        this.f29224F.m25675h(c46534os4);
        c46534os4.m20406H(this.f29222D);
    }

    /* renamed from: k1 */
    public final void m89546k1() {
        Function3 function3;
        if (this.f29240V) {
            function3 = C35528Qt0.f31046c;
            m89516u1(this, false, function3, 1, null);
            this.f29240V = false;
        }
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: l */
    public boolean mo89545l() {
        if (this.f29270x) {
            return true;
        }
        C46534os4 m89637F0 = m89637F0();
        return m89637F0 != null && m89637F0.m20392n();
    }

    /* renamed from: l0 */
    public final void m89544l0() {
        this.f29269w.m4160a();
    }

    /* renamed from: l1 */
    public final void m89543l1(Function3<? super InterfaceC25773lm<?>, ? super C47343qE5, ? super InterfaceC35082Ov4, Unit> function3) {
        this.f29234P.add(function3);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: m */
    public AbstractC37400Yt0 mo89542m() {
        m89627I1(206, C35528Qt0.m87830L());
        C6532a c6532a = null;
        if (mo89521t()) {
            C47343qE5.m17770m0(this.f29229K, 0, 1, null);
        }
        Object m89601R0 = m89601R0();
        if (m89601R0 instanceof C6532a) {
            c6532a = (C6532a) m89601R0;
        }
        if (c6532a == null) {
            c6532a = new C6532a(new C6533b(mo89611O(), this.f29263q));
            m89594T1(c6532a);
        }
        c6532a.m89489a().m89484u(m89526r0());
        m89508x0();
        return c6532a.m89489a();
    }

    /* renamed from: m0 */
    public final void m89541m0() {
        this.f29256j = null;
        this.f29257k = 0;
        this.f29259m = 0;
        this.f29239U = 0;
        this.f29236R = 0;
        this.f29265s = false;
        this.f29240V = false;
        this.f29242X.m101188a();
        this.f29224F.m25682a();
        m89538n0();
    }

    /* renamed from: m1 */
    public final void m89540m1(C19797db c19797db) {
        List mutableList;
        if (this.f29234P.isEmpty()) {
            m89522s1(new C6521A(this.f29228J, c19797db));
            return;
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f29234P);
        this.f29234P.clear();
        m89576a1();
        m89589V0();
        m89522s1(new C6522B(this.f29228J, c19797db, mutableList));
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: n */
    public boolean mo89539n(Object obj) {
        if (!Intrinsics.areEqual(m89601R0(), obj)) {
            m89594T1(obj);
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    public final void m89538n0() {
        this.f29261o = null;
        this.f29262p = null;
    }

    /* renamed from: n1 */
    public final void m89537n1(Function3<? super InterfaceC25773lm<?>, ? super C47343qE5, ? super InterfaceC35082Ov4, Unit> function3) {
        this.f29243Y.m25675h(function3);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: o */
    public boolean mo89536o(boolean z) {
        Object m89601R0 = m89601R0();
        if ((m89601R0 instanceof Boolean) && z == ((Boolean) m89601R0).booleanValue()) {
            return false;
        }
        m89594T1(Boolean.valueOf(z));
        return true;
    }

    /* renamed from: o0 */
    public final void m89535o0(C43943kW1<C46534os4, C44536lW1<Object>> invalidationsRequested, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.f29252f.isEmpty()) {
            m89517u0(invalidationsRequested, content);
        } else {
            C35528Qt0.m87792x("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: o1 */
    public final void m89534o1(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.f29249c0;
            if (i4 > 0 && this.f29245a0 == i - i4 && this.f29247b0 == i2 - i4) {
                this.f29249c0 = i4 + i3;
                return;
            }
            m89583X0();
            this.f29245a0 = i;
            this.f29247b0 = i2;
            this.f29249c0 = i3;
        }
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: p */
    public boolean mo89533p(float f) {
        boolean z;
        Object m89601R0 = m89601R0();
        if (m89601R0 instanceof Float) {
            if (f == ((Number) m89601R0).floatValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
        }
        m89594T1(Float.valueOf(f));
        return true;
    }

    /* renamed from: p0 */
    public final int m89532p0(int i, int i2, int i3) {
        if (i != i2) {
            int m89628I0 = m89628I0(this.f29227I, i);
            if (m89628I0 == 126665345) {
                return m89628I0;
            }
            return Integer.rotateLeft(m89532p0(this.f29227I.m25904N(i), i2, i3), 3) ^ m89628I0;
        }
        return i3;
    }

    /* renamed from: p1 */
    public final void m89531p1(int i) {
        this.f29239U = i - (this.f29227I.m25886l() - this.f29239U);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: q */
    public void mo89530q() {
        this.f29272z = this.f29219A >= 0;
    }

    /* renamed from: q0 */
    public final void m89529q0() {
        C35528Qt0.m87818X(this.f29229K.m17815T());
        C45564nE5 c45564nE5 = new C45564nE5();
        this.f29228J = c45564nE5;
        C47343qE5 m24113z = c45564nE5.m24113z();
        m24113z.m17843F();
        this.f29229K = m24113z;
    }

    /* renamed from: q1 */
    public final void m89528q1(int i, int i2) {
        boolean z;
        if (i2 > 0) {
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f29244Z == i) {
                    this.f29249c0 += i2;
                    return;
                }
                m89583X0();
                this.f29244Z = i;
                this.f29249c0 = i2;
                return;
            }
            C35528Qt0.m87792x(("Invalid remove index " + i).toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: r */
    public boolean mo89527r(int i) {
        Object m89601R0 = m89601R0();
        if ((m89601R0 instanceof Integer) && i == ((Number) m89601R0).intValue()) {
            return false;
        }
        m89594T1(Integer.valueOf(i));
        return true;
    }

    /* renamed from: r0 */
    public final FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> m89526r0() {
        FR3 fr3 = this.f29231M;
        if (fr3 != null) {
            return fr3;
        }
        return m89523s0(this.f29227I.m25878t());
    }

    /* renamed from: r1 */
    public final void m89525r1() {
        C44971mE5 c44971mE5;
        int m25878t;
        Function3 function3;
        if (this.f29227I.m25876v() > 0 && this.f29242X.m101182g(-2) != (m25878t = (c44971mE5 = this.f29227I).m25878t())) {
            if (!this.f29240V && this.f29241W) {
                function3 = C35528Qt0.f31047d;
                m89516u1(this, false, function3, 1, null);
                this.f29240V = true;
            }
            if (m25878t > 0) {
                C19797db m25897a = c44971mE5.m25897a(m25878t);
                this.f29242X.m101180i(m25878t);
                m89516u1(this, false, new C6524D(m25897a), 1, null);
            }
        }
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: s */
    public boolean mo89524s(long j) {
        Object m89601R0 = m89601R0();
        if ((m89601R0 instanceof Long) && j == ((Number) m89601R0).longValue()) {
            return false;
        }
        m89594T1(Long.valueOf(j));
        return true;
    }

    /* renamed from: s0 */
    public final FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> m89523s0(int i) {
        if (mo89521t() && this.f29230L) {
            int m17811V = this.f29229K.m17811V();
            while (m17811V > 0) {
                if (this.f29229K.m17800a0(m17811V) == 202 && Intrinsics.areEqual(this.f29229K.m17797b0(m17811V), C35528Qt0.m87836F())) {
                    Object m17805Y = this.f29229K.m17805Y(m17811V);
                    Intrinsics.checkNotNull(m17805Y, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> fr3 = (FR3) m17805Y;
                    this.f29231M = fr3;
                    return fr3;
                }
                m17811V = this.f29229K.m17746y0(m17811V);
            }
        }
        if (this.f29227I.m25876v() > 0) {
            while (i > 0) {
                if (this.f29227I.m25917A(i) == 202 && Intrinsics.areEqual(this.f29227I.m25916B(i), C35528Qt0.m87836F())) {
                    FR3<AbstractC41213fu0<Object>, InterfaceC48627sP5<Object>> m4159b = this.f29269w.m4159b(i);
                    if (m4159b == null) {
                        Object m25874x = this.f29227I.m25874x(i);
                        Intrinsics.checkNotNull(m25874x, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        m4159b = (FR3) m25874x;
                    }
                    this.f29231M = m4159b;
                    return m4159b;
                }
                i = this.f29227I.m25904N(i);
            }
        }
        FR3 fr32 = this.f29268v;
        this.f29231M = fr32;
        return fr32;
    }

    /* renamed from: s1 */
    public final void m89522s1(Function3<? super InterfaceC25773lm<?>, ? super C47343qE5, ? super InterfaceC35082Ov4, Unit> function3) {
        m89579Z0(this, false, 1, null);
        m89525r1();
        m89561f1(function3);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: t */
    public boolean mo89521t() {
        return this.f29235Q;
    }

    /* renamed from: t0 */
    public final void m89520t0() {
        C38949c66 c38949c66 = C38949c66.f60129a;
        Object m61928a = c38949c66.m61928a("Compose:Composer.dispose");
        try {
            this.f29248c.mo74038o(this);
            this.f29224F.m25682a();
            this.f29266t.clear();
            this.f29252f.clear();
            this.f29269w.m4160a();
            mo89515v().clear();
            this.f29226H = true;
            Unit unit = Unit.INSTANCE;
            c38949c66.m61927b(m61928a);
        } catch (Throwable th) {
            C38949c66.f60129a.m61927b(m61928a);
            throw th;
        }
    }

    /* renamed from: t1 */
    public final void m89519t1(boolean z, Function3<? super InterfaceC25773lm<?>, ? super C47343qE5, ? super InterfaceC35082Ov4, Unit> function3) {
        m89581Y0(z);
        m89561f1(function3);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: u */
    public InterfaceC32720Et0 mo89518u(int i) {
        m89633G1(i, null, C43188jE1.f92297a.m30972a(), null);
        m89547k0();
        return this;
    }

    /* renamed from: u0 */
    public final void m89517u0(C43943kW1<C46534os4, C44536lW1<Object>> c43943kW1, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
        if (!this.f29225G) {
            Object m61928a = C38949c66.f60129a.m61928a("Compose:recompose");
            try {
                AbstractC48600sM5 m5413D = C51564xM5.m5413D();
                this.f29221C = m5413D;
                this.f29222D = m5413D.mo14300f();
                this.f29269w.m4160a();
                int m28895g = c43943kW1.m28895g();
                for (int i = 0; i < m28895g; i++) {
                    Object obj = c43943kW1.m28896f()[i];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    C44536lW1 c44536lW1 = (C44536lW1) c43943kW1.m28894h()[i];
                    C46534os4 c46534os4 = (C46534os4) obj;
                    C19797db m20396j = c46534os4.m20396j();
                    if (m20396j != null) {
                        this.f29266t.add(new C44902m72(c46534os4, m20396j.m44095a(), c44536lW1));
                    } else {
                        return;
                    }
                }
                List<C44902m72> list = this.f29266t;
                if (list.size() > 1) {
                    CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new C6544k());
                }
                this.f29257k = 0;
                this.f29225G = true;
                m89621K1();
                Object m89601R0 = m89601R0();
                if (m89601R0 != function2 && function2 != null) {
                    m89594T1(function2);
                }
                GM5.m105197j(new C6541h(this), new C6542i(this), new C6543j(function2, this, m89601R0));
                m89505y0();
                this.f29225G = false;
                this.f29266t.clear();
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                C38949c66.f60129a.m61927b(m61928a);
            }
        }
        C35528Qt0.m87792x("Reentrant composition is not supported".toString());
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: v */
    public InterfaceC25773lm<?> mo89515v() {
        return this.f29246b;
    }

    /* renamed from: v0 */
    public final void m89514v0(int i, int i2) {
        if (i > 0 && i != i2) {
            m89514v0(this.f29227I.m25904N(i), i2);
            if (this.f29227I.m25910H(i)) {
                m89552i1(m89598S0(this.f29227I, i));
            }
        }
    }

    /* renamed from: v1 */
    public final void m89513v1() {
        if (this.f29238T.m25679d()) {
            this.f29238T.m25676g();
        } else {
            this.f29237S++;
        }
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: w */
    public InterfaceC36874Wm5 mo89512w() {
        C46534os4 c46534os4;
        C19797db m25897a;
        Function1<InterfaceC37166Xt0, Unit> m20397i;
        C46534os4 c46534os42 = null;
        if (this.f29224F.m25679d()) {
            c46534os4 = this.f29224F.m25676g();
        } else {
            c46534os4 = null;
        }
        if (c46534os4 != null) {
            c46534os4.m20410D(false);
        }
        if (c46534os4 != null && (m20397i = c46534os4.m20397i(this.f29222D)) != null) {
            m89561f1(new C6545l(m20397i, this));
        }
        if (c46534os4 != null && !c46534os4.m20389q() && (c46534os4.m20388r() || this.f29263q)) {
            if (c46534os4.m20396j() == null) {
                if (mo89521t()) {
                    C47343qE5 c47343qE5 = this.f29229K;
                    m25897a = c47343qE5.m17853A(c47343qE5.m17811V());
                } else {
                    C44971mE5 c44971mE5 = this.f29227I;
                    m25897a = c44971mE5.m25897a(c44971mE5.m25878t());
                }
                c46534os4.m20413A(m25897a);
            }
            c46534os4.m20411C(false);
            c46534os42 = c46534os4;
        }
        m89511w0(false);
        return c46534os42;
    }

    /* renamed from: w0 */
    public final void m89511w0(boolean z) {
        List<C46452ok2> list;
        if (mo89521t()) {
            int m17811V = this.f29229K.m17811V();
            m89609O1(this.f29229K.m17800a0(m17811V), this.f29229K.m17797b0(m17811V), this.f29229K.m17805Y(m17811V));
        } else {
            int m25878t = this.f29227I.m25878t();
            m89609O1(this.f29227I.m25917A(m25878t), this.f29227I.m25916B(m25878t), this.f29227I.m25874x(m25878t));
        }
        int i = this.f29259m;
        C37944aQ3 c37944aQ3 = this.f29256j;
        int i2 = 0;
        if (c37944aQ3 != null && c37944aQ3.m71425b().size() > 0) {
            List<C46452ok2> m71425b = c37944aQ3.m71425b();
            List<C46452ok2> m71421f = c37944aQ3.m71421f();
            Set m111385e = C32245Cs2.m111385e(m71421f);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = m71421f.size();
            int size2 = m71425b.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < size2) {
                C46452ok2 c46452ok2 = m71425b.get(i3);
                if (!m111385e.contains(c46452ok2)) {
                    m89528q1(c37944aQ3.m71420g(c46452ok2) + c37944aQ3.m71422e(), c46452ok2.m20551c());
                    c37944aQ3.m71413n(c46452ok2.m20552b(), i2);
                    m89531p1(c46452ok2.m20552b());
                    this.f29227I.m25903O(c46452ok2.m20552b());
                    m89555h1();
                    this.f29227I.m25901Q();
                    C35528Qt0.m87819W(this.f29266t, c46452ok2.m20552b(), c46452ok2.m20552b() + this.f29227I.m25915C(c46452ok2.m20552b()));
                } else if (!linkedHashSet.contains(c46452ok2)) {
                    if (i4 < size) {
                        C46452ok2 c46452ok22 = m71421f.get(i4);
                        if (c46452ok22 != c46452ok2) {
                            int m71420g = c37944aQ3.m71420g(c46452ok22);
                            linkedHashSet.add(c46452ok22);
                            if (m71420g != i5) {
                                int m71412o = c37944aQ3.m71412o(c46452ok22);
                                list = m71421f;
                                m89534o1(c37944aQ3.m71422e() + m71420g, i5 + c37944aQ3.m71422e(), m71412o);
                                c37944aQ3.m71417j(m71420g, i5, m71412o);
                            } else {
                                list = m71421f;
                            }
                        } else {
                            list = m71421f;
                            i3++;
                        }
                        i4++;
                        i5 += c37944aQ3.m71412o(c46452ok22);
                        m71421f = list;
                    }
                    i2 = 0;
                }
                i3++;
                i2 = 0;
            }
            m89583X0();
            if (m71425b.size() > 0) {
                m89531p1(this.f29227I.m25884n());
                this.f29227I.m25900R();
            }
        }
        int i6 = this.f29257k;
        while (!this.f29227I.m25912F()) {
            int m25886l = this.f29227I.m25886l();
            m89555h1();
            m89528q1(i6, this.f29227I.m25901Q());
            C35528Qt0.m87819W(this.f29266t, m25886l, this.f29227I.m25886l());
        }
        boolean mo89521t = mo89521t();
        if (mo89521t) {
            if (z) {
                m89507x1();
                i = 1;
            }
            this.f29227I.m25892f();
            int m17811V2 = this.f29229K.m17811V();
            this.f29229K.m17827N();
            if (!this.f29227I.m25879s()) {
                int m89610O0 = m89610O0(m17811V2);
                this.f29229K.m17825O();
                this.f29229K.m17843F();
                m89540m1(this.f29233O);
                this.f29235Q = false;
                if (!this.f29250d.isEmpty()) {
                    m89603Q1(m89610O0, 0);
                    m89600R1(m89610O0, i);
                }
            }
        } else {
            if (z) {
                m89513v1();
            }
            m89549j1();
            int m25878t2 = this.f29227I.m25878t();
            if (i != m89591U1(m25878t2)) {
                m89600R1(m25878t2, i);
            }
            if (z) {
                i = 1;
            }
            this.f29227I.m25891g();
            m89583X0();
        }
        m89649B0(i, mo89521t);
    }

    /* renamed from: w1 */
    public final void m89510w1(int i, int i2, int i3) {
        int m87825Q;
        C44971mE5 c44971mE5 = this.f29227I;
        m87825Q = C35528Qt0.m87825Q(c44971mE5, i, i2, i3);
        while (i > 0 && i != m87825Q) {
            if (c44971mE5.m25910H(i)) {
                m89513v1();
            }
            i = c44971mE5.m25904N(i);
        }
        m89514v0(i2, m87825Q);
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: x */
    public void mo89509x() {
        m89633G1(125, null, C43188jE1.f92297a.m30971b(), null);
        this.f29265s = true;
    }

    /* renamed from: x0 */
    public final void m89508x0() {
        m89511w0(false);
    }

    /* renamed from: x1 */
    public final void m89507x1() {
        this.f29234P.add(this.f29243Y.m25676g());
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: y */
    public CoroutineContext mo89506y() {
        return this.f29248c.mo16859g();
    }

    /* renamed from: y0 */
    public final void m89505y0() {
        m89508x0();
        this.f29248c.mo74042c();
        m89508x0();
        m89546k1();
        m89646C0();
        this.f29227I.m25894d();
        this.f29264r = false;
    }

    /* renamed from: y1 */
    public final void m89504y1(C43351jW2 c43351jW2, C47343qE5 c47343qE5) {
        C45564nE5 c45564nE5 = new C45564nE5();
        C47343qE5 m24113z = c45564nE5.m24113z();
        try {
            m24113z.m17847D();
            m24113z.m17812U0(126665345, c43351jW2.m30395c());
            C47343qE5.m17770m0(m24113z, 0, 1, null);
            m24113z.m17806X0(c43351jW2.m30392f());
            c47343qE5.m17756t0(c43351jW2.m30397a(), 1, m24113z);
            m24113z.m17826N0();
            m24113z.m17827N();
            m24113z.m17825O();
            Unit unit = Unit.INSTANCE;
            m24113z.m17843F();
            this.f29248c.mo16853j(c43351jW2, new C42758iW2(c45564nE5));
        } catch (Throwable th) {
            m24113z.m17843F();
            throw th;
        }
    }

    @Override // p000.InterfaceC32720Et0
    /* renamed from: z */
    public void mo89503z(Object obj) {
        m89594T1(obj);
    }

    /* renamed from: z0 */
    public final void m89502z0() {
        if (this.f29229K.m17815T()) {
            C47343qE5 m24113z = this.f29228J.m24113z();
            this.f29229K = m24113z;
            m24113z.m17824O0();
            this.f29230L = false;
            this.f29231M = null;
        }
    }

    /* renamed from: z1 */
    public final void m89501z1() {
        Function3<? super InterfaceC25773lm<?>, ? super C47343qE5, ? super InterfaceC35082Ov4, Unit> function3;
        if (this.f29250d.m24123f()) {
            ArrayList arrayList = new ArrayList();
            this.f29232N = arrayList;
            C44971mE5 m24114y = this.f29250d.m24114y();
            try {
                this.f29227I = m24114y;
                List list = this.f29252f;
                this.f29252f = arrayList;
                m89651A1(0);
                m89576a1();
                if (this.f29240V) {
                    function3 = C35528Qt0.f31045b;
                    m89561f1(function3);
                    m89546k1();
                }
                Unit unit = Unit.INSTANCE;
                this.f29252f = list;
            } finally {
                m24114y.m25894d();
            }
        }
    }
}
