package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b-\b\u0000\u0018\u0000 K*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002g\u0005B1\u0012\u0006\u0010h\u001a\u00020\u0007\u0012\u0006\u0010i\u001a\u00020\u0007\u0012\u000e\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&\u0012\b\u0010k\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bq\u0010rB)\b\u0016\u0012\u0006\u0010h\u001a\u00020\u0007\u0012\u0006\u0010i\u001a\u00020\u0007\u0012\u000e\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&¢\u0006\u0004\bq\u0010sJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\rJ3\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0017J?\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J8\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J&\u0010 \u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J.\u0010!\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002JQ\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b'\u0010(JK\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010*JS\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010,J]\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u00012\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b3\u00104J&\u00105\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J:\u00106\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002J\u001e\u00108\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00107\u001a\u00020\u0007H\u0002J2\u00109\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00107\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002J\u0017\u0010:\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b<\u0010=J-\u0010>\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b>\u0010?J?\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002¢\u0006\u0004\b@\u0010AJ%\u00107\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b7\u0010BJ9\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002¢\u0006\u0004\bC\u0010DJA\u0010E\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002¢\u0006\u0004\bE\u0010AJ8\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010H\u001a\u00020G2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002JT\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010H\u001a\u00020G2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002J\b\u0010K\u001a\u00020\u0007H\u0002J\u001c\u0010L\u001a\u00020\t2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002JP\u0010N\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002JX\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u000f\u0010O\u001a\u00020\u0007H\u0000¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bU\u0010TJ#\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\bV\u0010WJ%\u0010Y\u001a\u00020\t2\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\bY\u0010ZJ'\u0010[\u001a\u0004\u0018\u00018\u00012\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b[\u0010\\JJ\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010%\u001a\u00020\u00072\u0006\u0010H\u001a\u00020G2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018J;\u0010^\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b^\u0010_JM\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018¢\u0006\u0004\b`\u0010aJ3\u0010b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\bb\u0010cJG\u0010d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018¢\u0006\u0004\bd\u0010eJO\u0010f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018¢\u0006\u0004\bf\u0010aR\u0016\u0010h\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u00106R\u0016\u0010i\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0016\u0010k\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010jR4\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&2\u000e\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b'\u0010m\u001a\u0004\bn\u0010o¨\u0006t"}, m28432d2 = {"Lqa6;", "K", "V", "", "Lqa6$b;", "b", "c", "", "positionMask", "", "r", "keyIndex", "t", "(I)Ljava/lang/Object;", "W", "key", "value", "s", "(ILjava/lang/Object;Ljava/lang/Object;)Lqa6;", "LpX2;", "owner", "B", "(ILjava/lang/Object;Ljava/lang/Object;LpX2;)Lqa6;", "(ILjava/lang/Object;)Lqa6;", "LqR3;", "mutator", "M", "(ILjava/lang/Object;LqR3;)Lqa6;", "nodeIndex", "newNode", "U", "L", "S", "J", "newKeyHash", "newKey", "newValue", "shift", "", DateTokenConverter.CONVERTER_KEY, "(IIILjava/lang/Object;Ljava/lang/Object;ILpX2;)[Ljava/lang/Object;", "v", "(IIILjava/lang/Object;Ljava/lang/Object;I)Lqa6;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(IIILjava/lang/Object;Ljava/lang/Object;ILpX2;)Lqa6;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "u", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILpX2;)Lqa6;", "R", "I", "i", "j", "A", "f", "(Ljava/lang/Object;)Z", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Lqa6$b;", "w", "(Ljava/lang/Object;Ljava/lang/Object;LqR3;)Lqa6;", "(Ljava/lang/Object;)Lqa6;", "y", "(Ljava/lang/Object;LqR3;)Lqa6;", "z", "otherNode", "Ld01;", "intersectionCounter", "x", "F", "e", "l", "targetNode", "T", "m", "()I", "q", "(I)Z", "n", "(I)I", "O", "N", "(I)Lqa6;", "keyHash", "k", "(ILjava/lang/Object;I)Z", "o", "(ILjava/lang/Object;I)Ljava/lang/Object;", "E", "P", "(ILjava/lang/Object;Ljava/lang/Object;I)Lqa6$b;", "D", "(ILjava/lang/Object;Ljava/lang/Object;ILqR3;)Lqa6;", "Q", "(ILjava/lang/Object;I)Lqa6;", "G", "(ILjava/lang/Object;ILqR3;)Lqa6;", "H", C17296a.f69688o, "dataMap", "nodeMap", "LpX2;", "ownedBy", "<set-?>", "[Ljava/lang/Object;", "p", "()[Ljava/lang/Object;", "buffer", "<init>", "(II[Ljava/lang/Object;LpX2;)V", "(II[Ljava/lang/Object;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,887:1\n10#2,9:888\n10#2,9:897\n10#2,9:906\n83#3:915\n1#4:916\n26#5:917\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n619#1:888,9\n636#1:897,9\n640#1:906,9\n688#1:915\n688#1:916\n885#1:917\n*E\n"})
/* renamed from: qa6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47542qa6<K, V> {

    /* renamed from: e */
    public static final C27627a f105443e = new C27627a(null);

    /* renamed from: f */
    public static final C47542qa6 f105444f = new C47542qa6(0, 0, new Object[0]);

    /* renamed from: a */
    public int f105445a;

    /* renamed from: b */
    public int f105446b;

    /* renamed from: c */
    public final C46918pX2 f105447c;

    /* renamed from: d */
    public Object[] f105448d;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lqa6$a;", "", "Lqa6;", "", "EMPTY", "Lqa6;", C17296a.f69688o, "()Lqa6;", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qa6$a */
    /* loaded from: classes.dex */
    public static final class C27627a {
        public /* synthetic */ C27627a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C47542qa6 m17380a() {
            return C47542qa6.f105444f;
        }

        private C27627a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lqa6$b;", "K", "V", "", "Lqa6;", C17296a.f69688o, "Lqa6;", "()Lqa6;", "c", "(Lqa6;)V", "node", "", "b", "I", "()I", "sizeDelta", "<init>", "(Lqa6;I)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,887:1\n1#2:888\n*E\n"})
    /* renamed from: qa6$b */
    /* loaded from: classes.dex */
    public static final class C27628b<K, V> {

        /* renamed from: a */
        public C47542qa6<K, V> f105449a;

        /* renamed from: b */
        public final int f105450b;

        public C27628b(C47542qa6<K, V> node, int i) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f105449a = node;
            this.f105450b = i;
        }

        /* renamed from: a */
        public final C47542qa6<K, V> m17379a() {
            return this.f105449a;
        }

        /* renamed from: b */
        public final int m17378b() {
            return this.f105450b;
        }

        /* renamed from: c */
        public final void m17377c(C47542qa6<K, V> c47542qa6) {
            Intrinsics.checkNotNullParameter(c47542qa6, "<set-?>");
            this.f105449a = c47542qa6;
        }
    }

    public C47542qa6(int i, int i2, Object[] buffer, C46918pX2 c46918pX2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f105445a = i;
        this.f105446b = i2;
        this.f105447c = c46918pX2;
        this.f105448d = buffer;
    }

    /* renamed from: A */
    public final C47542qa6<K, V> m17429A(int i, C47458qR3<K, V> c47458qR3) {
        c47458qR3.m17509g(c47458qR3.size() - 1);
        c47458qR3.m17510f(m17407W(i));
        if (this.f105448d.length == 2) {
            return null;
        }
        if (this.f105447c == c47458qR3.m17512d()) {
            this.f105448d = C49913ua6.m10020b(this.f105448d, i);
            return this;
        }
        return new C47542qa6<>(0, 0, C49913ua6.m10020b(this.f105448d, i), c47458qR3.m17512d());
    }

    /* renamed from: B */
    public final C47542qa6<K, V> m17428B(int i, K k, V v, C46918pX2 c46918pX2) {
        int m17393n = m17393n(i);
        if (this.f105447c == c46918pX2) {
            this.f105448d = C49913ua6.m10021a(this.f105448d, m17393n, k, v);
            this.f105445a = i | this.f105445a;
            return this;
        }
        return new C47542qa6<>(i | this.f105445a, this.f105446b, C49913ua6.m10021a(this.f105448d, m17393n, k, v), c46918pX2);
    }

    /* renamed from: C */
    public final C47542qa6<K, V> m17427C(int i, int i2, int i3, K k, V v, int i4, C46918pX2 c46918pX2) {
        if (this.f105447c == c46918pX2) {
            this.f105448d = m17403d(i, i2, i3, k, v, i4, c46918pX2);
            this.f105445a ^= i2;
            this.f105446b |= i2;
            return this;
        }
        return new C47542qa6<>(this.f105445a ^ i2, i2 | this.f105446b, m17403d(i, i2, i3, k, v, i4, c46918pX2), c46918pX2);
    }

    /* renamed from: D */
    public final C47542qa6<K, V> m17426D(int i, K k, V v, int i2, C47458qR3<K, V> mutator) {
        C47542qa6<K, V> m17426D;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int m10016f = 1 << C49913ua6.m10016f(i, i2);
        if (m17390q(m10016f)) {
            int m17393n = m17393n(m10016f);
            if (Intrinsics.areEqual(k, m17387t(m17393n))) {
                mutator.m17510f(m17407W(m17393n));
                if (m17407W(m17393n) == v) {
                    return this;
                }
                return m17417M(m17393n, v, mutator);
            }
            mutator.m17509g(mutator.size() + 1);
            return m17427C(m17393n, m10016f, i, k, v, i2, mutator.m17512d());
        } else if (m17389r(m10016f)) {
            int m17415O = m17415O(m10016f);
            C47542qa6<K, V> m17416N = m17416N(m17415O);
            if (i2 == 30) {
                m17426D = m17416N.m17384w(k, v, mutator);
            } else {
                m17426D = m17416N.m17426D(i, k, v, i2 + 5, mutator);
            }
            if (m17416N == m17426D) {
                return this;
            }
            return m17418L(m17415O, m17426D, mutator.m17512d());
        } else {
            mutator.m17509g(mutator.size() + 1);
            return m17428B(m10016f, k, v, mutator.m17512d());
        }
    }

    /* renamed from: E */
    public final C47542qa6<K, V> m17425E(C47542qa6<K, V> otherNode, int i, C39495d01 intersectionCounter, C47458qR3<K, V> mutator) {
        boolean z;
        C47542qa6<K, V> c47542qa6;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionCounter, "intersectionCounter");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionCounter.m44745b(m17402e());
            return this;
        } else if (i > 30) {
            return m17383x(otherNode, intersectionCounter, mutator.m17512d());
        } else {
            int i2 = this.f105446b | otherNode.f105446b;
            int i3 = this.f105445a;
            int i4 = otherNode.f105445a;
            int i5 = i3 & i4;
            int i6 = (i3 ^ i4) & (~i2);
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                if (Intrinsics.areEqual(m17387t(m17393n(lowestOneBit)), otherNode.m17387t(otherNode.m17393n(lowestOneBit)))) {
                    i6 |= lowestOneBit;
                } else {
                    i2 |= lowestOneBit;
                }
                i5 ^= lowestOneBit;
            }
            int i7 = 0;
            if ((i2 & i6) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (Intrinsics.areEqual(this.f105447c, mutator.m17512d()) && this.f105445a == i6 && this.f105446b == i2) {
                    c47542qa6 = this;
                } else {
                    c47542qa6 = new C47542qa6<>(i6, i2, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i2)]);
                }
                int i8 = i2;
                int i9 = 0;
                while (i8 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i8);
                    Object[] objArr = c47542qa6.f105448d;
                    objArr[(objArr.length - 1) - i9] = m17424F(otherNode, lowestOneBit2, i, intersectionCounter, mutator);
                    i9++;
                    i8 ^= lowestOneBit2;
                }
                while (i6 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i6);
                    int i10 = i7 * 2;
                    if (!otherNode.m17390q(lowestOneBit3)) {
                        int m17393n = m17393n(lowestOneBit3);
                        c47542qa6.f105448d[i10] = m17387t(m17393n);
                        c47542qa6.f105448d[i10 + 1] = m17407W(m17393n);
                    } else {
                        int m17393n2 = otherNode.m17393n(lowestOneBit3);
                        c47542qa6.f105448d[i10] = otherNode.m17387t(m17393n2);
                        c47542qa6.f105448d[i10 + 1] = otherNode.m17407W(m17393n2);
                        if (m17390q(lowestOneBit3)) {
                            intersectionCounter.m44744c(intersectionCounter.m44746a() + 1);
                        }
                    }
                    i7++;
                    i6 ^= lowestOneBit3;
                }
                if (m17395l(c47542qa6)) {
                    return this;
                }
                if (otherNode.m17395l(c47542qa6)) {
                    return otherNode;
                }
                return c47542qa6;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: F */
    public final C47542qa6<K, V> m17424F(C47542qa6<K, V> c47542qa6, int i, int i2, C39495d01 c39495d01, C47458qR3<K, V> c47458qR3) {
        int i3;
        int i4;
        int i5 = 0;
        if (m17389r(i)) {
            C47542qa6<K, V> m17416N = m17416N(m17415O(i));
            if (c47542qa6.m17389r(i)) {
                return m17416N.m17425E(c47542qa6.m17416N(c47542qa6.m17415O(i)), i2 + 5, c39495d01, c47458qR3);
            }
            if (c47542qa6.m17390q(i)) {
                int m17393n = c47542qa6.m17393n(i);
                K m17387t = c47542qa6.m17387t(m17393n);
                V m17407W = c47542qa6.m17407W(m17393n);
                int size = c47458qR3.size();
                if (m17387t != null) {
                    i5 = m17387t.hashCode();
                }
                C47542qa6<K, V> m17426D = m17416N.m17426D(i5, m17387t, m17407W, i2 + 5, c47458qR3);
                if (c47458qR3.size() == size) {
                    c39495d01.m44744c(c39495d01.m44746a() + 1);
                    return m17426D;
                }
                return m17426D;
            }
            return m17416N;
        } else if (c47542qa6.m17389r(i)) {
            C47542qa6<K, V> m17416N2 = c47542qa6.m17416N(c47542qa6.m17415O(i));
            if (m17390q(i)) {
                int m17393n2 = m17393n(i);
                K m17387t2 = m17387t(m17393n2);
                if (m17387t2 != null) {
                    i4 = m17387t2.hashCode();
                } else {
                    i4 = 0;
                }
                int i6 = i2 + 5;
                if (m17416N2.m17396k(i4, m17387t2, i6)) {
                    c39495d01.m44744c(c39495d01.m44746a() + 1);
                } else {
                    V m17407W2 = m17407W(m17393n2);
                    if (m17387t2 != null) {
                        i5 = m17387t2.hashCode();
                    }
                    return m17416N2.m17426D(i5, m17387t2, m17407W2, i6, c47458qR3);
                }
            }
            return m17416N2;
        } else {
            int m17393n3 = m17393n(i);
            K m17387t3 = m17387t(m17393n3);
            V m17407W3 = m17407W(m17393n3);
            int m17393n4 = c47542qa6.m17393n(i);
            K m17387t4 = c47542qa6.m17387t(m17393n4);
            V m17407W4 = c47542qa6.m17407W(m17393n4);
            if (m17387t3 != null) {
                i3 = m17387t3.hashCode();
            } else {
                i3 = 0;
            }
            if (m17387t4 != null) {
                i5 = m17387t4.hashCode();
            }
            return m17386u(i3, m17387t3, m17407W3, i5, m17387t4, m17407W4, i2 + 5, c47458qR3.m17512d());
        }
    }

    /* renamed from: G */
    public final C47542qa6<K, V> m17423G(int i, K k, int i2, C47458qR3<K, V> mutator) {
        C47542qa6<K, V> m17423G;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int m10016f = 1 << C49913ua6.m10016f(i, i2);
        if (m17390q(m10016f)) {
            int m17393n = m17393n(m10016f);
            if (Intrinsics.areEqual(k, m17387t(m17393n))) {
                return m17421I(m17393n, m10016f, mutator);
            }
            return this;
        } else if (m17389r(m10016f)) {
            int m17415O = m17415O(m10016f);
            C47542qa6<K, V> m17416N = m17416N(m17415O);
            if (i2 == 30) {
                m17423G = m17416N.m17382y(k, mutator);
            } else {
                m17423G = m17416N.m17423G(i, k, i2 + 5, mutator);
            }
            return m17419K(m17416N, m17423G, m17415O, m10016f, mutator.m17512d());
        } else {
            return this;
        }
    }

    /* renamed from: H */
    public final C47542qa6<K, V> m17422H(int i, K k, V v, int i2, C47458qR3<K, V> mutator) {
        C47542qa6<K, V> m17422H;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int m10016f = 1 << C49913ua6.m10016f(i, i2);
        if (m17390q(m10016f)) {
            int m17393n = m17393n(m10016f);
            if (!Intrinsics.areEqual(k, m17387t(m17393n)) || !Intrinsics.areEqual(v, m17407W(m17393n))) {
                return this;
            }
            return m17421I(m17393n, m10016f, mutator);
        } else if (!m17389r(m10016f)) {
            return this;
        } else {
            int m17415O = m17415O(m10016f);
            C47542qa6<K, V> m17416N = m17416N(m17415O);
            if (i2 == 30) {
                m17422H = m17416N.m17381z(k, v, mutator);
            } else {
                m17422H = m17416N.m17422H(i, k, v, i2 + 5, mutator);
            }
            return m17419K(m17416N, m17422H, m17415O, m10016f, mutator.m17512d());
        }
    }

    /* renamed from: I */
    public final C47542qa6<K, V> m17421I(int i, int i2, C47458qR3<K, V> c47458qR3) {
        c47458qR3.m17509g(c47458qR3.size() - 1);
        c47458qR3.m17510f(m17407W(i));
        if (this.f105448d.length == 2) {
            return null;
        }
        if (this.f105447c == c47458qR3.m17512d()) {
            this.f105448d = C49913ua6.m10020b(this.f105448d, i);
            this.f105445a ^= i2;
            return this;
        }
        return new C47542qa6<>(i2 ^ this.f105445a, this.f105446b, C49913ua6.m10020b(this.f105448d, i), c47458qR3.m17512d());
    }

    /* renamed from: J */
    public final C47542qa6<K, V> m17420J(int i, int i2, C46918pX2 c46918pX2) {
        Object[] objArr = this.f105448d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f105447c == c46918pX2) {
            this.f105448d = C49913ua6.m10019c(objArr, i);
            this.f105446b ^= i2;
            return this;
        }
        return new C47542qa6<>(this.f105445a, i2 ^ this.f105446b, C49913ua6.m10019c(objArr, i), c46918pX2);
    }

    /* renamed from: K */
    public final C47542qa6<K, V> m17419K(C47542qa6<K, V> c47542qa6, C47542qa6<K, V> c47542qa62, int i, int i2, C46918pX2 c46918pX2) {
        if (c47542qa62 == null) {
            return m17420J(i, i2, c46918pX2);
        }
        if (this.f105447c != c46918pX2 && c47542qa6 == c47542qa62) {
            return this;
        }
        return m17418L(i, c47542qa62, c46918pX2);
    }

    /* renamed from: L */
    public final C47542qa6<K, V> m17418L(int i, C47542qa6<K, V> c47542qa6, C46918pX2 c46918pX2) {
        Object[] objArr = this.f105448d;
        if (objArr.length == 1 && c47542qa6.f105448d.length == 2 && c47542qa6.f105446b == 0) {
            c47542qa6.f105445a = this.f105446b;
            return c47542qa6;
        } else if (this.f105447c == c46918pX2) {
            objArr[i] = c47542qa6;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[i] = c47542qa6;
            return new C47542qa6<>(this.f105445a, this.f105446b, copyOf, c46918pX2);
        }
    }

    /* renamed from: M */
    public final C47542qa6<K, V> m17417M(int i, V v, C47458qR3<K, V> c47458qR3) {
        if (this.f105447c == c47458qR3.m17512d()) {
            this.f105448d[i + 1] = v;
            return this;
        }
        c47458qR3.m17511e(c47458qR3.m17514b() + 1);
        Object[] objArr = this.f105448d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new C47542qa6<>(this.f105445a, this.f105446b, copyOf, c47458qR3.m17512d());
    }

    /* renamed from: N */
    public final C47542qa6<K, V> m17416N(int i) {
        Object obj = this.f105448d[i];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C47542qa6) obj;
    }

    /* renamed from: O */
    public final int m17415O(int i) {
        return (this.f105448d.length - 1) - Integer.bitCount((i - 1) & this.f105446b);
    }

    /* renamed from: P */
    public final C27628b<K, V> m17414P(int i, K k, V v, int i2) {
        C27628b<K, V> m17414P;
        int m10016f = 1 << C49913ua6.m10016f(i, i2);
        if (m17390q(m10016f)) {
            int m17393n = m17393n(m10016f);
            if (Intrinsics.areEqual(k, m17387t(m17393n))) {
                if (m17407W(m17393n) == v) {
                    return null;
                }
                return m17408V(m17393n, v).m17404c();
            }
            return m17385v(m17393n, m10016f, i, k, v, i2).m17405b();
        } else if (m17389r(m10016f)) {
            int m17415O = m17415O(m10016f);
            C47542qa6<K, V> m17416N = m17416N(m17415O);
            if (i2 == 30) {
                m17414P = m17416N.m17399h(k, v);
                if (m17414P == null) {
                    return null;
                }
            } else {
                m17414P = m17416N.m17414P(i, k, v, i2 + 5);
                if (m17414P == null) {
                    return null;
                }
            }
            m17414P.m17377c(m17409U(m17415O, m10016f, m17414P.m17379a()));
            return m17414P;
        } else {
            return m17388s(m10016f, k, v).m17405b();
        }
    }

    /* renamed from: Q */
    public final C47542qa6<K, V> m17413Q(int i, K k, int i2) {
        C47542qa6<K, V> m17413Q;
        int m10016f = 1 << C49913ua6.m10016f(i, i2);
        if (m17390q(m10016f)) {
            int m17393n = m17393n(m10016f);
            if (Intrinsics.areEqual(k, m17387t(m17393n))) {
                return m17412R(m17393n, m10016f);
            }
            return this;
        } else if (m17389r(m10016f)) {
            int m17415O = m17415O(m10016f);
            C47542qa6<K, V> m17416N = m17416N(m17415O);
            if (i2 == 30) {
                m17413Q = m17416N.m17398i(k);
            } else {
                m17413Q = m17416N.m17413Q(i, k, i2 + 5);
            }
            return m17410T(m17416N, m17413Q, m17415O, m10016f);
        } else {
            return this;
        }
    }

    /* renamed from: R */
    public final C47542qa6<K, V> m17412R(int i, int i2) {
        Object[] objArr = this.f105448d;
        if (objArr.length == 2) {
            return null;
        }
        return new C47542qa6<>(i2 ^ this.f105445a, this.f105446b, C49913ua6.m10020b(objArr, i));
    }

    /* renamed from: S */
    public final C47542qa6<K, V> m17411S(int i, int i2) {
        Object[] objArr = this.f105448d;
        if (objArr.length == 1) {
            return null;
        }
        return new C47542qa6<>(this.f105445a, i2 ^ this.f105446b, C49913ua6.m10019c(objArr, i));
    }

    /* renamed from: T */
    public final C47542qa6<K, V> m17410T(C47542qa6<K, V> c47542qa6, C47542qa6<K, V> c47542qa62, int i, int i2) {
        if (c47542qa62 == null) {
            return m17411S(i, i2);
        }
        if (c47542qa6 != c47542qa62) {
            return m17409U(i, i2, c47542qa62);
        }
        return this;
    }

    /* renamed from: U */
    public final C47542qa6<K, V> m17409U(int i, int i2, C47542qa6<K, V> c47542qa6) {
        Object[] objArr = c47542qa6.f105448d;
        if (objArr.length == 2 && c47542qa6.f105446b == 0) {
            if (this.f105448d.length == 1) {
                c47542qa6.f105445a = this.f105446b;
                return c47542qa6;
            }
            return new C47542qa6<>(this.f105445a ^ i2, i2 ^ this.f105446b, C49913ua6.m10017e(this.f105448d, i, m17393n(i2), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.f105448d;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[i] = c47542qa6;
        return new C47542qa6<>(this.f105445a, this.f105446b, copyOf);
    }

    /* renamed from: V */
    public final C47542qa6<K, V> m17408V(int i, V v) {
        Object[] objArr = this.f105448d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new C47542qa6<>(this.f105445a, this.f105446b, copyOf);
    }

    /* renamed from: W */
    public final V m17407W(int i) {
        return (V) this.f105448d[i + 1];
    }

    /* renamed from: b */
    public final C27628b<K, V> m17405b() {
        return new C27628b<>(this, 1);
    }

    /* renamed from: c */
    public final C27628b<K, V> m17404c() {
        return new C27628b<>(this, 0);
    }

    /* renamed from: d */
    public final Object[] m17403d(int i, int i2, int i3, K k, V v, int i4, C46918pX2 c46918pX2) {
        int i5;
        K m17387t = m17387t(i);
        if (m17387t != null) {
            i5 = m17387t.hashCode();
        } else {
            i5 = 0;
        }
        C47542qa6<K, V> m17386u = m17386u(i5, m17387t, m17407W(i), i3, k, v, i4 + 5, c46918pX2);
        return C49913ua6.m10018d(this.f105448d, i, m17415O(i2) + 1, m17386u);
    }

    /* renamed from: e */
    public final int m17402e() {
        if (this.f105446b == 0) {
            return this.f105448d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f105445a);
        int length = this.f105448d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += m17416N(i).m17402e();
        }
        return bitCount;
    }

    /* renamed from: f */
    public final boolean m17401f(K k) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(0, this.f105448d.length);
        step = RangesKt___RangesKt.step(until, 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k, this.f105448d[first])) {
                if (first != last) {
                    first += step2;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final V m17400g(K k) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(0, this.f105448d.length);
        step = RangesKt___RangesKt.step(until, 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k, m17387t(first))) {
                if (first != last) {
                    first += step2;
                } else {
                    return null;
                }
            }
            return m17407W(first);
        }
        return null;
    }

    /* renamed from: h */
    public final C27628b<K, V> m17399h(K k, V v) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(0, this.f105448d.length);
        step = RangesKt___RangesKt.step(until, 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k, m17387t(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            if (v == m17407W(first)) {
                return null;
            }
            Object[] objArr = this.f105448d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[first + 1] = v;
            return new C47542qa6(0, 0, copyOf).m17404c();
        }
        return new C47542qa6(0, 0, C49913ua6.m10021a(this.f105448d, 0, k, v)).m17405b();
    }

    /* renamed from: i */
    public final C47542qa6<K, V> m17398i(K k) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(0, this.f105448d.length);
        step = RangesKt___RangesKt.step(until, 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k, m17387t(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return m17397j(first);
        }
        return this;
    }

    /* renamed from: j */
    public final C47542qa6<K, V> m17397j(int i) {
        Object[] objArr = this.f105448d;
        if (objArr.length == 2) {
            return null;
        }
        return new C47542qa6<>(0, 0, C49913ua6.m10020b(objArr, i));
    }

    /* renamed from: k */
    public final boolean m17396k(int i, K k, int i2) {
        int m10016f = 1 << C49913ua6.m10016f(i, i2);
        if (m17390q(m10016f)) {
            return Intrinsics.areEqual(k, m17387t(m17393n(m10016f)));
        }
        if (m17389r(m10016f)) {
            C47542qa6<K, V> m17416N = m17416N(m17415O(m10016f));
            if (i2 == 30) {
                return m17416N.m17401f(k);
            }
            return m17416N.m17396k(i, k, i2 + 5);
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m17395l(C47542qa6<K, V> c47542qa6) {
        if (this == c47542qa6) {
            return true;
        }
        if (this.f105446b != c47542qa6.f105446b || this.f105445a != c47542qa6.f105445a) {
            return false;
        }
        int length = this.f105448d.length;
        for (int i = 0; i < length; i++) {
            if (this.f105448d[i] != c47542qa6.f105448d[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final int m17394m() {
        return Integer.bitCount(this.f105445a);
    }

    /* renamed from: n */
    public final int m17393n(int i) {
        return Integer.bitCount((i - 1) & this.f105445a) * 2;
    }

    /* renamed from: o */
    public final V m17392o(int i, K k, int i2) {
        int m10016f = 1 << C49913ua6.m10016f(i, i2);
        if (m17390q(m10016f)) {
            int m17393n = m17393n(m10016f);
            if (!Intrinsics.areEqual(k, m17387t(m17393n))) {
                return null;
            }
            return m17407W(m17393n);
        } else if (!m17389r(m10016f)) {
            return null;
        } else {
            C47542qa6<K, V> m17416N = m17416N(m17415O(m10016f));
            if (i2 == 30) {
                return m17416N.m17400g(k);
            }
            return m17416N.m17392o(i, k, i2 + 5);
        }
    }

    /* renamed from: p */
    public final Object[] m17391p() {
        return this.f105448d;
    }

    /* renamed from: q */
    public final boolean m17390q(int i) {
        return (i & this.f105445a) != 0;
    }

    /* renamed from: r */
    public final boolean m17389r(int i) {
        return (i & this.f105446b) != 0;
    }

    /* renamed from: s */
    public final C47542qa6<K, V> m17388s(int i, K k, V v) {
        return new C47542qa6<>(i | this.f105445a, this.f105446b, C49913ua6.m10021a(this.f105448d, m17393n(i), k, v));
    }

    /* renamed from: t */
    public final K m17387t(int i) {
        return (K) this.f105448d[i];
    }

    /* renamed from: u */
    public final C47542qa6<K, V> m17386u(int i, K k, V v, int i2, K k2, V v2, int i3, C46918pX2 c46918pX2) {
        if (i3 > 30) {
            return new C47542qa6<>(0, 0, new Object[]{k, v, k2, v2}, c46918pX2);
        }
        int m10016f = C49913ua6.m10016f(i, i3);
        int m10016f2 = C49913ua6.m10016f(i2, i3);
        if (m10016f != m10016f2) {
            return new C47542qa6<>((1 << m10016f) | (1 << m10016f2), 0, m10016f < m10016f2 ? new Object[]{k, v, k2, v2} : new Object[]{k2, v2, k, v}, c46918pX2);
        }
        return new C47542qa6<>(0, 1 << m10016f, new Object[]{m17386u(i, k, v, i2, k2, v2, i3 + 5, c46918pX2)}, c46918pX2);
    }

    /* renamed from: v */
    public final C47542qa6<K, V> m17385v(int i, int i2, int i3, K k, V v, int i4) {
        return new C47542qa6<>(this.f105445a ^ i2, i2 | this.f105446b, m17403d(i, i2, i3, k, v, i4, null));
    }

    /* renamed from: w */
    public final C47542qa6<K, V> m17384w(K k, V v, C47458qR3<K, V> c47458qR3) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(0, this.f105448d.length);
        step = RangesKt___RangesKt.step(until, 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k, m17387t(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            c47458qR3.m17510f(m17407W(first));
            if (this.f105447c == c47458qR3.m17512d()) {
                this.f105448d[first + 1] = v;
                return this;
            }
            c47458qR3.m17511e(c47458qR3.m17514b() + 1);
            Object[] objArr = this.f105448d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[first + 1] = v;
            return new C47542qa6<>(0, 0, copyOf, c47458qR3.m17512d());
        }
        c47458qR3.m17509g(c47458qR3.size() + 1);
        return new C47542qa6<>(0, 0, C49913ua6.m10021a(this.f105448d, 0, k, v), c47458qR3.m17512d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public final C47542qa6<K, V> m17383x(C47542qa6<K, V> c47542qa6, C39495d01 c39495d01, C46918pX2 c46918pX2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        IntRange until;
        IntProgression step;
        if (this.f105446b == 0) {
            z = true;
        } else {
            z = false;
        }
        C49464tp0.m11730a(z);
        if (this.f105445a == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C49464tp0.m11730a(z2);
        if (c47542qa6.f105446b == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C49464tp0.m11730a(z3);
        if (c47542qa6.f105445a == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C49464tp0.m11730a(z4);
        Object[] objArr = this.f105448d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + c47542qa6.f105448d.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int length = this.f105448d.length;
        until = RangesKt___RangesKt.until(0, c47542qa6.f105448d.length);
        step = RangesKt___RangesKt.step(until, 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (!m17401f(c47542qa6.f105448d[first])) {
                    Object[] objArr2 = c47542qa6.f105448d;
                    copyOf[length] = objArr2[first];
                    copyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                } else {
                    c39495d01.m44744c(c39495d01.m44746a() + 1);
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        if (length == this.f105448d.length) {
            return this;
        }
        if (length != c47542qa6.f105448d.length) {
            if (length == copyOf.length) {
                return new C47542qa6<>(0, 0, copyOf, c46918pX2);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            return new C47542qa6<>(0, 0, copyOf2, c46918pX2);
        }
        return c47542qa6;
    }

    /* renamed from: y */
    public final C47542qa6<K, V> m17382y(K k, C47458qR3<K, V> c47458qR3) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(0, this.f105448d.length);
        step = RangesKt___RangesKt.step(until, 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k, m17387t(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return m17429A(first, c47458qR3);
        }
        return this;
    }

    /* renamed from: z */
    public final C47542qa6<K, V> m17381z(K k, V v, C47458qR3<K, V> c47458qR3) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(0, this.f105448d.length);
        step = RangesKt___RangesKt.step(until, 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.areEqual(k, m17387t(first)) && Intrinsics.areEqual(v, m17407W(first))) {
                    return m17429A(first, c47458qR3);
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47542qa6(int i, int i2, Object[] buffer) {
        this(i, i2, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }
}
