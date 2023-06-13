package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Polygon;
import co.bird.android.model.Polygonable;
import co.bird.android.model.ZoomBehaviorable;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.PopupInvocationMethod;
import co.bird.android.model.constant.PopupType;
import co.bird.android.model.constant.ZoomBehavior;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u0000\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B±\u0004\u0012\u0006\u0010H\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010K\u001a\u00020\u000e\u0012\u0006\u0010L\u001a\u00020\u000e\u0012\u0006\u0010M\u001a\u00020\u000e\u0012\u0006\u0010N\u001a\u00020\u000e\u0012\u0006\u0010O\u001a\u00020\u000e\u0012\u0006\u0010P\u001a\u00020\u000e\u0012\u0006\u0010Q\u001a\u00020\u000e\u0012\u0006\u0010R\u001a\u00020\u000e\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010Y\u001a\u00020!\u0012\u0006\u0010Z\u001a\u00020\u0019\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\\\u001a\u00020\u0019\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010^\u001a\u00020\u0019\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010`\u001a\u00020)\u0012\u0006\u0010a\u001a\u00020\u000e\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010j\u001a\u00020\u001d\u0012\u0006\u0010k\u001a\u00020\u001d\u0012\u0006\u0010l\u001a\u00020\u001d\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108\u0012\u0010\b\u0002\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108\u0012\u0006\u0010p\u001a\u00020\u000e\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108\u0012\n\b\u0002\u0010v\u001a\u0004\u0018\u00010A\u0012\u0006\u0010w\u001a\u00020\u0003\u0012\u0006\u0010x\u001a\u00020D\u0012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\u000e¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0015\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0016\u001a\u00020\u000eHÆ\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020!HÆ\u0003J\t\u0010#\u001a\u00020\u0019HÆ\u0003J\u0012\u0010$\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\t\u0010%\u001a\u00020\u0019HÆ\u0003J\u0012\u0010&\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\t\u0010'\u001a\u00020\u0019HÆ\u0003J\u0012\u0010(\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\t\u0010*\u001a\u00020)HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\u0012\u0010,\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b,\u0010\u001bJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b-\u0010\u001bJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u001dHÆ\u0003J\t\u00105\u001a\u00020\u001dHÆ\u0003J\t\u00106\u001a\u00020\u001dHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108HÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108HÆ\u0003J\t\u0010;\u001a\u00020\u000eHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010?\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b?\u0010\u001bJ\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010AHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020DHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010G\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bG\u0010\u0018Jè\u0004\u0010{\u001a\u00020\u00002\b\b\u0002\u0010H\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010K\u001a\u00020\u000e2\b\b\u0002\u0010L\u001a\u00020\u000e2\b\b\u0002\u0010M\u001a\u00020\u000e2\b\b\u0002\u0010N\u001a\u00020\u000e2\b\b\u0002\u0010O\u001a\u00020\u000e2\b\b\u0002\u0010P\u001a\u00020\u000e2\b\b\u0002\u0010Q\u001a\u00020\u000e2\b\b\u0002\u0010R\u001a\u00020\u000e2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010Y\u001a\u00020!2\b\b\u0002\u0010Z\u001a\u00020\u00192\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\\\u001a\u00020\u00192\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010^\u001a\u00020\u00192\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010`\u001a\u00020)2\b\b\u0002\u0010a\u001a\u00020\u000e2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010j\u001a\u00020\u001d2\b\b\u0002\u0010k\u001a\u00020\u001d2\b\b\u0002\u0010l\u001a\u00020\u001d2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001082\u0010\b\u0002\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001082\b\b\u0002\u0010p\u001a\u00020\u000e2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001082\n\b\u0002\u0010v\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010w\u001a\u00020\u00032\b\b\u0002\u0010x\u001a\u00020D2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b{\u0010|J\t\u0010}\u001a\u00020\u0003HÖ\u0001J\t\u0010~\u001a\u00020\u0019HÖ\u0001J\u0015\u0010\u0081\u0001\u001a\u00020\u000e2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007fHÖ\u0003R\u001d\u0010H\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\bH\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0004\u0010\u0082\u0001\u001a\u0006\b\u0085\u0001\u0010\u0084\u0001R\u001f\u0010I\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bI\u0010\u0082\u0001\u001a\u0006\b\u0086\u0001\u0010\u0084\u0001R\u001f\u0010J\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bJ\u0010\u0082\u0001\u001a\u0006\b\u0087\u0001\u0010\u0084\u0001R\u001d\u0010K\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bK\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001d\u0010L\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bL\u0010\u0088\u0001\u001a\u0006\b\u008b\u0001\u0010\u008a\u0001R\u001d\u0010M\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bM\u0010\u0088\u0001\u001a\u0006\b\u008c\u0001\u0010\u008a\u0001R\u001d\u0010N\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bN\u0010\u0088\u0001\u001a\u0006\b\u008d\u0001\u0010\u008a\u0001R\u001d\u0010O\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bO\u0010\u0088\u0001\u001a\u0006\b\u008e\u0001\u0010\u008a\u0001R\u001d\u0010P\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bP\u0010\u0088\u0001\u001a\u0006\b\u008f\u0001\u0010\u008a\u0001R\u001c\u0010Q\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bQ\u0010\u0088\u0001\u001a\u0005\bQ\u0010\u008a\u0001R\u001c\u0010R\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bR\u0010\u0088\u0001\u001a\u0005\bR\u0010\u008a\u0001R\u001e\u0010S\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bS\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010\u0018R\u001e\u0010T\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bT\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010\u001bR\u001f\u0010U\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bU\u0010\u0082\u0001\u001a\u0006\b\u0094\u0001\u0010\u0084\u0001R\u001f\u0010V\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bV\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001e\u0010W\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bW\u0010\u0092\u0001\u001a\u0005\b\u0098\u0001\u0010\u001bR\u001f\u0010X\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bX\u0010\u0082\u0001\u001a\u0006\b\u0099\u0001\u0010\u0084\u0001R\u001d\u0010Y\u001a\u00020!8\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\bY\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001d\u0010Z\u001a\u00020\u00198\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\bZ\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001e\u0010[\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b[\u0010\u0092\u0001\u001a\u0005\b \u0001\u0010\u001bR\u001d\u0010\\\u001a\u00020\u00198\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b\\\u0010\u009d\u0001\u001a\u0006\b¡\u0001\u0010\u009f\u0001R\u001e\u0010]\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b]\u0010\u0092\u0001\u001a\u0005\b¢\u0001\u0010\u001bR\u001d\u0010^\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b^\u0010\u009d\u0001\u001a\u0006\b£\u0001\u0010\u009f\u0001R\u001e\u0010_\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b_\u0010\u0092\u0001\u001a\u0005\b¤\u0001\u0010\u001bR\u001d\u0010`\u001a\u00020)8\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b`\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u001d\u0010a\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\ba\u0010\u0088\u0001\u001a\u0006\b¨\u0001\u0010\u008a\u0001R\u001e\u0010b\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bb\u0010\u0092\u0001\u001a\u0005\b©\u0001\u0010\u001bR\u001e\u0010c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bc\u0010\u0092\u0001\u001a\u0005\bª\u0001\u0010\u001bR\u001f\u0010d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bd\u0010\u0082\u0001\u001a\u0006\b«\u0001\u0010\u0084\u0001R\u001f\u0010e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\be\u0010\u0082\u0001\u001a\u0006\b¬\u0001\u0010\u0084\u0001R\u001f\u0010f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bf\u0010\u0082\u0001\u001a\u0006\b\u00ad\u0001\u0010\u0084\u0001R\u001f\u0010g\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bg\u0010\u0082\u0001\u001a\u0006\b®\u0001\u0010\u0084\u0001R\u001f\u0010h\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bh\u0010\u0082\u0001\u001a\u0006\b¯\u0001\u0010\u0084\u0001R\u001f\u0010i\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bi\u0010\u0082\u0001\u001a\u0006\b°\u0001\u0010\u0084\u0001R\u001d\u0010j\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bj\u0010\u0095\u0001\u001a\u0006\b±\u0001\u0010\u0097\u0001R\u001d\u0010k\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bk\u0010\u0095\u0001\u001a\u0006\b²\u0001\u0010\u0097\u0001R\u001d\u0010l\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bl\u0010\u0095\u0001\u001a\u0006\b³\u0001\u0010\u0097\u0001R\u001f\u0010m\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bm\u0010\u0082\u0001\u001a\u0006\b´\u0001\u0010\u0084\u0001R%\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bn\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R%\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bo\u0010µ\u0001\u001a\u0006\b¸\u0001\u0010·\u0001R\u001c\u0010p\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bp\u0010\u0088\u0001\u001a\u0005\bp\u0010\u008a\u0001R\u001f\u0010q\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bq\u0010\u0082\u0001\u001a\u0006\b¹\u0001\u0010\u0084\u0001R\u001f\u0010r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\br\u0010\u0082\u0001\u001a\u0006\bº\u0001\u0010\u0084\u0001R\u001f\u0010s\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bs\u0010\u0082\u0001\u001a\u0006\b»\u0001\u0010\u0084\u0001R\u001e\u0010t\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bt\u0010\u0092\u0001\u001a\u0005\b¼\u0001\u0010\u001bR%\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bu\u0010µ\u0001\u001a\u0006\b½\u0001\u0010·\u0001R\u001f\u0010v\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bv\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R\u001d\u0010w\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bw\u0010\u0082\u0001\u001a\u0006\bÁ\u0001\u0010\u0084\u0001R\u001d\u0010x\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bx\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001f\u0010y\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\by\u0010\u0082\u0001\u001a\u0006\bÅ\u0001\u0010\u0084\u0001R\u001e\u0010z\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bz\u0010\u0090\u0001\u001a\u0005\bÆ\u0001\u0010\u0018R)\u0010Ç\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010\u0088\u0001\u001a\u0006\bÇ\u0001\u0010\u008a\u0001\"\u0006\bÈ\u0001\u0010É\u0001R!\u0010Ï\u0001\u001a\u00030Ê\u00018FX\u0087\u0084\u0002¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001¨\u0006Ò\u0001"}, m28432d2 = {"Lco/bird/android/model/persistence/Area;", "Lco/bird/android/model/Polygonable;", "Lco/bird/android/model/ZoomBehaviorable;", "", "title", "Lco/bird/android/model/constant/PopupInvocationMethod;", "popupInvocationMethod", "Lco/bird/android/model/constant/PopupType;", "popupType", "toolTipTitle", "component1", "component2", "component3", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/lang/Boolean;", "", "component14", "()Ljava/lang/Integer;", "component15", "Lco/bird/android/model/constant/AreaIconType;", "component16", "component17", "component18", "Lco/bird/android/model/Polygon;", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "Lco/bird/android/model/constant/ZoomBehavior;", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "component48", "component49", "Lorg/joda/time/DateTime;", "component50", "component51", "component52", "id", "label", "notes", "hideBirds", "rejectDrops", "noRides", "noParking", "preferredParking", "delivery", "isReleaseConstrained", "isDemandArea", "feeModified", "demandLevel", "overlayLabel", "overlayIcon", "overlayMinZoomLevel", "selectedOverlayLabel", "region", "color", "colorDark", "borderColor", "borderColorDark", "titleColor", "titleColorDark", "zoomBehavior", "operational", "maxSpeed", "releaseCapacity", "noParkingFineAlertTitle", "noParkingFineAlertMessage", "riderBarInRideMessageTitle", "riderBarInRideMessageBody", "riderBarNotInRideMessageTitle", "riderBarNotInRideMessageBody", "riderBarInRideMessageIconType", "riderBarNotInRideMessageIconType", "areaReleaseCapacityIconType", "partnerId", "fleetIds", "areaKeys", "isUniversalArea", "noParkingFineCurrency", "noParkingWarningAlertTitle", "noParkingWarningAlertBody", "noParkingFineAmount", "areasMerged", "centerPoint", "role", "updatedAt", "zoneId", "walkway", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;)Lco/bird/android/model/persistence/Area;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "getLabel", "getNotes", "Z", "getHideBirds", "()Z", "getRejectDrops", "getNoRides", "getNoParking", "getPreferredParking", "getDelivery", "Ljava/lang/Boolean;", "getFeeModified", "Ljava/lang/Integer;", "getDemandLevel", "getOverlayLabel", "Lco/bird/android/model/constant/AreaIconType;", "getOverlayIcon", "()Lco/bird/android/model/constant/AreaIconType;", "getOverlayMinZoomLevel", "getSelectedOverlayLabel", "Lco/bird/android/model/Polygon;", "getRegion", "()Lco/bird/android/model/Polygon;", "I", "getColor", "()I", "getColorDark", "getBorderColor", "getBorderColorDark", "getTitleColor", "getTitleColorDark", "Lco/bird/android/model/constant/ZoomBehavior;", "getZoomBehavior", "()Lco/bird/android/model/constant/ZoomBehavior;", "getOperational", "getMaxSpeed", "getReleaseCapacity", "getNoParkingFineAlertTitle", "getNoParkingFineAlertMessage", "getRiderBarInRideMessageTitle", "getRiderBarInRideMessageBody", "getRiderBarNotInRideMessageTitle", "getRiderBarNotInRideMessageBody", "getRiderBarInRideMessageIconType", "getRiderBarNotInRideMessageIconType", "getAreaReleaseCapacityIconType", "getPartnerId", "Ljava/util/List;", "getFleetIds", "()Ljava/util/List;", "getAreaKeys", "getNoParkingFineCurrency", "getNoParkingWarningAlertTitle", "getNoParkingWarningAlertBody", "getNoParkingFineAmount", "getAreasMerged", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "getCenterPoint", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "getRole", "Lorg/joda/time/DateTime;", "getUpdatedAt", "()Lorg/joda/time/DateTime;", "getZoneId", "getWalkway", "isOperationalInverse", "setOperationalInverse", "(Z)V", "LCX3;", "jtsRegion$delegate", "Lkotlin/Lazy;", "getJtsRegion", "()LCX3;", "jtsRegion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;)V", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Area implements Polygonable, ZoomBehaviorable {
    private final List<String> areaKeys;
    private final AreaIconType areaReleaseCapacityIconType;
    private final List<String> areasMerged;
    private final int borderColor;
    private final Integer borderColorDark;
    private final Geolocation centerPoint;
    private final int color;
    private final Integer colorDark;
    private final boolean delivery;
    private final Integer demandLevel;
    private final Boolean feeModified;
    private final List<String> fleetIds;
    private final boolean hideBirds;

    /* renamed from: id */
    private final String f66669id;
    private final boolean isDemandArea;
    private boolean isOperationalInverse;
    private final boolean isReleaseConstrained;
    private final boolean isUniversalArea;
    private final Lazy jtsRegion$delegate;
    private final String label;
    private final Integer maxSpeed;
    private final boolean noParking;
    private final String noParkingFineAlertMessage;
    private final String noParkingFineAlertTitle;
    private final Integer noParkingFineAmount;
    private final String noParkingFineCurrency;
    private final String noParkingWarningAlertBody;
    private final String noParkingWarningAlertTitle;
    private final boolean noRides;
    private final String notes;
    private final boolean operational;
    private final AreaIconType overlayIcon;
    private final String overlayLabel;
    private final Integer overlayMinZoomLevel;
    private final String partnerId;
    private final boolean preferredParking;
    private final Polygon region;
    private final boolean rejectDrops;
    private final Integer releaseCapacity;
    private final String riderBarInRideMessageBody;
    private final AreaIconType riderBarInRideMessageIconType;
    private final String riderBarInRideMessageTitle;
    private final String riderBarNotInRideMessageBody;
    private final AreaIconType riderBarNotInRideMessageIconType;
    private final String riderBarNotInRideMessageTitle;
    private final String role;
    private final String selectedOverlayLabel;
    private final String title;
    private final int titleColor;
    private final Integer titleColorDark;
    private final DateTime updatedAt;
    private final Boolean walkway;
    private final String zoneId;
    private final ZoomBehavior zoomBehavior;

    public Area(String id, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Boolean bool, Integer num, String str4, AreaIconType areaIconType, Integer num2, String str5, Polygon region, int i, Integer num3, int i2, Integer num4, int i3, Integer num5, ZoomBehavior zoomBehavior, boolean z9, Integer num6, Integer num7, String str6, String str7, String str8, String str9, String str10, String str11, AreaIconType riderBarInRideMessageIconType, AreaIconType riderBarNotInRideMessageIconType, AreaIconType areaReleaseCapacityIconType, String str12, List<String> list, List<String> list2, boolean z10, String str13, String str14, String str15, Integer num8, List<String> list3, Geolocation geolocation, String role, DateTime updatedAt, String str16, Boolean bool2) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(zoomBehavior, "zoomBehavior");
        Intrinsics.checkNotNullParameter(riderBarInRideMessageIconType, "riderBarInRideMessageIconType");
        Intrinsics.checkNotNullParameter(riderBarNotInRideMessageIconType, "riderBarNotInRideMessageIconType");
        Intrinsics.checkNotNullParameter(areaReleaseCapacityIconType, "areaReleaseCapacityIconType");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f66669id = id;
        this.title = str;
        this.label = str2;
        this.notes = str3;
        this.hideBirds = z;
        this.rejectDrops = z2;
        this.noRides = z3;
        this.noParking = z4;
        this.preferredParking = z5;
        this.delivery = z6;
        this.isReleaseConstrained = z7;
        this.isDemandArea = z8;
        this.feeModified = bool;
        this.demandLevel = num;
        this.overlayLabel = str4;
        this.overlayIcon = areaIconType;
        this.overlayMinZoomLevel = num2;
        this.selectedOverlayLabel = str5;
        this.region = region;
        this.color = i;
        this.colorDark = num3;
        this.borderColor = i2;
        this.borderColorDark = num4;
        this.titleColor = i3;
        this.titleColorDark = num5;
        this.zoomBehavior = zoomBehavior;
        this.operational = z9;
        this.maxSpeed = num6;
        this.releaseCapacity = num7;
        this.noParkingFineAlertTitle = str6;
        this.noParkingFineAlertMessage = str7;
        this.riderBarInRideMessageTitle = str8;
        this.riderBarInRideMessageBody = str9;
        this.riderBarNotInRideMessageTitle = str10;
        this.riderBarNotInRideMessageBody = str11;
        this.riderBarInRideMessageIconType = riderBarInRideMessageIconType;
        this.riderBarNotInRideMessageIconType = riderBarNotInRideMessageIconType;
        this.areaReleaseCapacityIconType = areaReleaseCapacityIconType;
        this.partnerId = str12;
        this.fleetIds = list;
        this.areaKeys = list2;
        this.isUniversalArea = z10;
        this.noParkingFineCurrency = str13;
        this.noParkingWarningAlertTitle = str14;
        this.noParkingWarningAlertBody = str15;
        this.noParkingFineAmount = num8;
        this.areasMerged = list3;
        this.centerPoint = geolocation;
        this.role = role;
        this.updatedAt = updatedAt;
        this.zoneId = str16;
        this.walkway = bool2;
        lazy = LazyKt__LazyJVMKt.lazy(new Area$jtsRegion$2(this));
        this.jtsRegion$delegate = lazy;
    }

    public final String component1() {
        return this.f66669id;
    }

    public final boolean component10() {
        return this.delivery;
    }

    public final boolean component11() {
        return this.isReleaseConstrained;
    }

    public final boolean component12() {
        return this.isDemandArea;
    }

    public final Boolean component13() {
        return this.feeModified;
    }

    public final Integer component14() {
        return this.demandLevel;
    }

    public final String component15() {
        return this.overlayLabel;
    }

    public final AreaIconType component16() {
        return this.overlayIcon;
    }

    public final Integer component17() {
        return this.overlayMinZoomLevel;
    }

    public final String component18() {
        return this.selectedOverlayLabel;
    }

    public final Polygon component19() {
        return this.region;
    }

    public final String component2() {
        return this.title;
    }

    public final int component20() {
        return this.color;
    }

    public final Integer component21() {
        return this.colorDark;
    }

    public final int component22() {
        return this.borderColor;
    }

    public final Integer component23() {
        return this.borderColorDark;
    }

    public final int component24() {
        return this.titleColor;
    }

    public final Integer component25() {
        return this.titleColorDark;
    }

    public final ZoomBehavior component26() {
        return this.zoomBehavior;
    }

    public final boolean component27() {
        return this.operational;
    }

    public final Integer component28() {
        return this.maxSpeed;
    }

    public final Integer component29() {
        return this.releaseCapacity;
    }

    public final String component3() {
        return this.label;
    }

    public final String component30() {
        return this.noParkingFineAlertTitle;
    }

    public final String component31() {
        return this.noParkingFineAlertMessage;
    }

    public final String component32() {
        return this.riderBarInRideMessageTitle;
    }

    public final String component33() {
        return this.riderBarInRideMessageBody;
    }

    public final String component34() {
        return this.riderBarNotInRideMessageTitle;
    }

    public final String component35() {
        return this.riderBarNotInRideMessageBody;
    }

    public final AreaIconType component36() {
        return this.riderBarInRideMessageIconType;
    }

    public final AreaIconType component37() {
        return this.riderBarNotInRideMessageIconType;
    }

    public final AreaIconType component38() {
        return this.areaReleaseCapacityIconType;
    }

    public final String component39() {
        return this.partnerId;
    }

    public final String component4() {
        return this.notes;
    }

    public final List<String> component40() {
        return this.fleetIds;
    }

    public final List<String> component41() {
        return this.areaKeys;
    }

    public final boolean component42() {
        return this.isUniversalArea;
    }

    public final String component43() {
        return this.noParkingFineCurrency;
    }

    public final String component44() {
        return this.noParkingWarningAlertTitle;
    }

    public final String component45() {
        return this.noParkingWarningAlertBody;
    }

    public final Integer component46() {
        return this.noParkingFineAmount;
    }

    public final List<String> component47() {
        return this.areasMerged;
    }

    public final Geolocation component48() {
        return this.centerPoint;
    }

    public final String component49() {
        return this.role;
    }

    public final boolean component5() {
        return this.hideBirds;
    }

    public final DateTime component50() {
        return this.updatedAt;
    }

    public final String component51() {
        return this.zoneId;
    }

    public final Boolean component52() {
        return this.walkway;
    }

    public final boolean component6() {
        return this.rejectDrops;
    }

    public final boolean component7() {
        return this.noRides;
    }

    public final boolean component8() {
        return this.noParking;
    }

    public final boolean component9() {
        return this.preferredParking;
    }

    public final Area copy(String id, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Boolean bool, Integer num, String str4, AreaIconType areaIconType, Integer num2, String str5, Polygon region, int i, Integer num3, int i2, Integer num4, int i3, Integer num5, ZoomBehavior zoomBehavior, boolean z9, Integer num6, Integer num7, String str6, String str7, String str8, String str9, String str10, String str11, AreaIconType riderBarInRideMessageIconType, AreaIconType riderBarNotInRideMessageIconType, AreaIconType areaReleaseCapacityIconType, String str12, List<String> list, List<String> list2, boolean z10, String str13, String str14, String str15, Integer num8, List<String> list3, Geolocation geolocation, String role, DateTime updatedAt, String str16, Boolean bool2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(zoomBehavior, "zoomBehavior");
        Intrinsics.checkNotNullParameter(riderBarInRideMessageIconType, "riderBarInRideMessageIconType");
        Intrinsics.checkNotNullParameter(riderBarNotInRideMessageIconType, "riderBarNotInRideMessageIconType");
        Intrinsics.checkNotNullParameter(areaReleaseCapacityIconType, "areaReleaseCapacityIconType");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new Area(id, str, str2, str3, z, z2, z3, z4, z5, z6, z7, z8, bool, num, str4, areaIconType, num2, str5, region, i, num3, i2, num4, i3, num5, zoomBehavior, z9, num6, num7, str6, str7, str8, str9, str10, str11, riderBarInRideMessageIconType, riderBarNotInRideMessageIconType, areaReleaseCapacityIconType, str12, list, list2, z10, str13, str14, str15, num8, list3, geolocation, role, updatedAt, str16, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Area) {
            Area area = (Area) obj;
            return Intrinsics.areEqual(this.f66669id, area.f66669id) && Intrinsics.areEqual(this.title, area.title) && Intrinsics.areEqual(this.label, area.label) && Intrinsics.areEqual(this.notes, area.notes) && this.hideBirds == area.hideBirds && this.rejectDrops == area.rejectDrops && this.noRides == area.noRides && this.noParking == area.noParking && this.preferredParking == area.preferredParking && this.delivery == area.delivery && this.isReleaseConstrained == area.isReleaseConstrained && this.isDemandArea == area.isDemandArea && Intrinsics.areEqual(this.feeModified, area.feeModified) && Intrinsics.areEqual(this.demandLevel, area.demandLevel) && Intrinsics.areEqual(this.overlayLabel, area.overlayLabel) && this.overlayIcon == area.overlayIcon && Intrinsics.areEqual(this.overlayMinZoomLevel, area.overlayMinZoomLevel) && Intrinsics.areEqual(this.selectedOverlayLabel, area.selectedOverlayLabel) && Intrinsics.areEqual(this.region, area.region) && this.color == area.color && Intrinsics.areEqual(this.colorDark, area.colorDark) && this.borderColor == area.borderColor && Intrinsics.areEqual(this.borderColorDark, area.borderColorDark) && this.titleColor == area.titleColor && Intrinsics.areEqual(this.titleColorDark, area.titleColorDark) && this.zoomBehavior == area.zoomBehavior && this.operational == area.operational && Intrinsics.areEqual(this.maxSpeed, area.maxSpeed) && Intrinsics.areEqual(this.releaseCapacity, area.releaseCapacity) && Intrinsics.areEqual(this.noParkingFineAlertTitle, area.noParkingFineAlertTitle) && Intrinsics.areEqual(this.noParkingFineAlertMessage, area.noParkingFineAlertMessage) && Intrinsics.areEqual(this.riderBarInRideMessageTitle, area.riderBarInRideMessageTitle) && Intrinsics.areEqual(this.riderBarInRideMessageBody, area.riderBarInRideMessageBody) && Intrinsics.areEqual(this.riderBarNotInRideMessageTitle, area.riderBarNotInRideMessageTitle) && Intrinsics.areEqual(this.riderBarNotInRideMessageBody, area.riderBarNotInRideMessageBody) && this.riderBarInRideMessageIconType == area.riderBarInRideMessageIconType && this.riderBarNotInRideMessageIconType == area.riderBarNotInRideMessageIconType && this.areaReleaseCapacityIconType == area.areaReleaseCapacityIconType && Intrinsics.areEqual(this.partnerId, area.partnerId) && Intrinsics.areEqual(this.fleetIds, area.fleetIds) && Intrinsics.areEqual(this.areaKeys, area.areaKeys) && this.isUniversalArea == area.isUniversalArea && Intrinsics.areEqual(this.noParkingFineCurrency, area.noParkingFineCurrency) && Intrinsics.areEqual(this.noParkingWarningAlertTitle, area.noParkingWarningAlertTitle) && Intrinsics.areEqual(this.noParkingWarningAlertBody, area.noParkingWarningAlertBody) && Intrinsics.areEqual(this.noParkingFineAmount, area.noParkingFineAmount) && Intrinsics.areEqual(this.areasMerged, area.areasMerged) && Intrinsics.areEqual(this.centerPoint, area.centerPoint) && Intrinsics.areEqual(this.role, area.role) && Intrinsics.areEqual(this.updatedAt, area.updatedAt) && Intrinsics.areEqual(this.zoneId, area.zoneId) && Intrinsics.areEqual(this.walkway, area.walkway);
        }
        return false;
    }

    public final List<String> getAreaKeys() {
        return this.areaKeys;
    }

    public final AreaIconType getAreaReleaseCapacityIconType() {
        return this.areaReleaseCapacityIconType;
    }

    public final List<String> getAreasMerged() {
        return this.areasMerged;
    }

    @Override // co.bird.android.model.Polygonable
    public int getBorderColor() {
        return this.borderColor;
    }

    public final Integer getBorderColorDark() {
        return this.borderColorDark;
    }

    public final Geolocation getCenterPoint() {
        return this.centerPoint;
    }

    @Override // co.bird.android.model.Polygonable
    public int getColor() {
        return this.color;
    }

    public final Integer getColorDark() {
        return this.colorDark;
    }

    public final boolean getDelivery() {
        return this.delivery;
    }

    public final Integer getDemandLevel() {
        return this.demandLevel;
    }

    public final Boolean getFeeModified() {
        return this.feeModified;
    }

    public final List<String> getFleetIds() {
        return this.fleetIds;
    }

    public final boolean getHideBirds() {
        return this.hideBirds;
    }

    @Override // co.bird.android.model.Polygonable
    public String getId() {
        return this.f66669id;
    }

    public final CX3 getJtsRegion() {
        return (CX3) this.jtsRegion$delegate.getValue();
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getMaxSpeed() {
        return this.maxSpeed;
    }

    public final boolean getNoParking() {
        return this.noParking;
    }

    public final String getNoParkingFineAlertMessage() {
        return this.noParkingFineAlertMessage;
    }

    public final String getNoParkingFineAlertTitle() {
        return this.noParkingFineAlertTitle;
    }

    public final Integer getNoParkingFineAmount() {
        return this.noParkingFineAmount;
    }

    public final String getNoParkingFineCurrency() {
        return this.noParkingFineCurrency;
    }

    public final String getNoParkingWarningAlertBody() {
        return this.noParkingWarningAlertBody;
    }

    public final String getNoParkingWarningAlertTitle() {
        return this.noParkingWarningAlertTitle;
    }

    public final boolean getNoRides() {
        return this.noRides;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final boolean getOperational() {
        return this.operational;
    }

    public final AreaIconType getOverlayIcon() {
        return this.overlayIcon;
    }

    public final String getOverlayLabel() {
        return this.overlayLabel;
    }

    public final Integer getOverlayMinZoomLevel() {
        return this.overlayMinZoomLevel;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final boolean getPreferredParking() {
        return this.preferredParking;
    }

    @Override // co.bird.android.model.Polygonable
    public Polygon getRegion() {
        return this.region;
    }

    public final boolean getRejectDrops() {
        return this.rejectDrops;
    }

    public final Integer getReleaseCapacity() {
        return this.releaseCapacity;
    }

    public final String getRiderBarInRideMessageBody() {
        return this.riderBarInRideMessageBody;
    }

    public final AreaIconType getRiderBarInRideMessageIconType() {
        return this.riderBarInRideMessageIconType;
    }

    public final String getRiderBarInRideMessageTitle() {
        return this.riderBarInRideMessageTitle;
    }

    public final String getRiderBarNotInRideMessageBody() {
        return this.riderBarNotInRideMessageBody;
    }

    public final AreaIconType getRiderBarNotInRideMessageIconType() {
        return this.riderBarNotInRideMessageIconType;
    }

    public final String getRiderBarNotInRideMessageTitle() {
        return this.riderBarNotInRideMessageTitle;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getSelectedOverlayLabel() {
        return this.selectedOverlayLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTitleColor() {
        return this.titleColor;
    }

    public final Integer getTitleColorDark() {
        return this.titleColorDark;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final Boolean getWalkway() {
        return this.walkway;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    @Override // co.bird.android.model.ZoomBehaviorable
    public ZoomBehavior getZoomBehavior() {
        return this.zoomBehavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66669id.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.notes;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.hideBirds;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.rejectDrops;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.noRides;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.noParking;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.preferredParking;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.delivery;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.isReleaseConstrained;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z8 = this.isDemandArea;
        int i15 = z8;
        if (z8 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        Boolean bool = this.feeModified;
        int hashCode5 = (i16 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.demandLevel;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.overlayLabel;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AreaIconType areaIconType = this.overlayIcon;
        int hashCode8 = (hashCode7 + (areaIconType == null ? 0 : areaIconType.hashCode())) * 31;
        Integer num2 = this.overlayMinZoomLevel;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.selectedOverlayLabel;
        int hashCode10 = (((((hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.region.hashCode()) * 31) + Integer.hashCode(this.color)) * 31;
        Integer num3 = this.colorDark;
        int hashCode11 = (((hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31) + Integer.hashCode(this.borderColor)) * 31;
        Integer num4 = this.borderColorDark;
        int hashCode12 = (((hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31) + Integer.hashCode(this.titleColor)) * 31;
        Integer num5 = this.titleColorDark;
        int hashCode13 = (((hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31) + this.zoomBehavior.hashCode()) * 31;
        boolean z9 = this.operational;
        int i17 = z9;
        if (z9 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode13 + i17) * 31;
        Integer num6 = this.maxSpeed;
        int hashCode14 = (i18 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.releaseCapacity;
        int hashCode15 = (hashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str6 = this.noParkingFineAlertTitle;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.noParkingFineAlertMessage;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.riderBarInRideMessageTitle;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.riderBarInRideMessageBody;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.riderBarNotInRideMessageTitle;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.riderBarNotInRideMessageBody;
        int hashCode21 = (((((((hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.riderBarInRideMessageIconType.hashCode()) * 31) + this.riderBarNotInRideMessageIconType.hashCode()) * 31) + this.areaReleaseCapacityIconType.hashCode()) * 31;
        String str12 = this.partnerId;
        int hashCode22 = (hashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<String> list = this.fleetIds;
        int hashCode23 = (hashCode22 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.areaKeys;
        int hashCode24 = (hashCode23 + (list2 == null ? 0 : list2.hashCode())) * 31;
        boolean z10 = this.isUniversalArea;
        int i19 = (hashCode24 + (z10 ? 1 : z10 ? 1 : 0)) * 31;
        String str13 = this.noParkingFineCurrency;
        int hashCode25 = (i19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.noParkingWarningAlertTitle;
        int hashCode26 = (hashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.noParkingWarningAlertBody;
        int hashCode27 = (hashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num8 = this.noParkingFineAmount;
        int hashCode28 = (hashCode27 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List<String> list3 = this.areasMerged;
        int hashCode29 = (hashCode28 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Geolocation geolocation = this.centerPoint;
        int hashCode30 = (((((hashCode29 + (geolocation == null ? 0 : geolocation.hashCode())) * 31) + this.role.hashCode()) * 31) + this.updatedAt.hashCode()) * 31;
        String str16 = this.zoneId;
        int hashCode31 = (hashCode30 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool2 = this.walkway;
        return hashCode31 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean isDemandArea() {
        return this.isDemandArea;
    }

    public final boolean isOperationalInverse() {
        return this.isOperationalInverse;
    }

    public final boolean isReleaseConstrained() {
        return this.isReleaseConstrained;
    }

    public final boolean isUniversalArea() {
        return this.isUniversalArea;
    }

    public final PopupInvocationMethod popupInvocationMethod() {
        if (this.isReleaseConstrained && this.releaseCapacity != null) {
            return PopupInvocationMethod.MAP_MARKER;
        }
        return PopupInvocationMethod.POLYGON_TAP;
    }

    public final PopupType popupType() {
        if (this.isReleaseConstrained) {
            return PopupType.BOTTOM_SHEET;
        }
        return PopupType.INFO_WINDOW;
    }

    public final void setOperationalInverse(boolean z) {
        this.isOperationalInverse = z;
    }

    public final String title() {
        String str = this.title;
        return str == null ? this.label : str;
    }

    public String toString() {
        String str = this.f66669id;
        String str2 = this.title;
        String str3 = this.label;
        String str4 = this.notes;
        boolean z = this.hideBirds;
        boolean z2 = this.rejectDrops;
        boolean z3 = this.noRides;
        boolean z4 = this.noParking;
        boolean z5 = this.preferredParking;
        boolean z6 = this.delivery;
        boolean z7 = this.isReleaseConstrained;
        boolean z8 = this.isDemandArea;
        Boolean bool = this.feeModified;
        Integer num = this.demandLevel;
        String str5 = this.overlayLabel;
        AreaIconType areaIconType = this.overlayIcon;
        Integer num2 = this.overlayMinZoomLevel;
        String str6 = this.selectedOverlayLabel;
        Polygon polygon = this.region;
        int i = this.color;
        Integer num3 = this.colorDark;
        int i2 = this.borderColor;
        Integer num4 = this.borderColorDark;
        int i3 = this.titleColor;
        Integer num5 = this.titleColorDark;
        ZoomBehavior zoomBehavior = this.zoomBehavior;
        boolean z9 = this.operational;
        Integer num6 = this.maxSpeed;
        Integer num7 = this.releaseCapacity;
        String str7 = this.noParkingFineAlertTitle;
        String str8 = this.noParkingFineAlertMessage;
        String str9 = this.riderBarInRideMessageTitle;
        String str10 = this.riderBarInRideMessageBody;
        String str11 = this.riderBarNotInRideMessageTitle;
        String str12 = this.riderBarNotInRideMessageBody;
        AreaIconType areaIconType2 = this.riderBarInRideMessageIconType;
        AreaIconType areaIconType3 = this.riderBarNotInRideMessageIconType;
        AreaIconType areaIconType4 = this.areaReleaseCapacityIconType;
        String str13 = this.partnerId;
        List<String> list = this.fleetIds;
        List<String> list2 = this.areaKeys;
        boolean z10 = this.isUniversalArea;
        String str14 = this.noParkingFineCurrency;
        String str15 = this.noParkingWarningAlertTitle;
        String str16 = this.noParkingWarningAlertBody;
        Integer num8 = this.noParkingFineAmount;
        List<String> list3 = this.areasMerged;
        Geolocation geolocation = this.centerPoint;
        String str17 = this.role;
        DateTime dateTime = this.updatedAt;
        String str18 = this.zoneId;
        Boolean bool2 = this.walkway;
        return "Area(id=" + str + ", title=" + str2 + ", label=" + str3 + ", notes=" + str4 + ", hideBirds=" + z + ", rejectDrops=" + z2 + ", noRides=" + z3 + ", noParking=" + z4 + ", preferredParking=" + z5 + ", delivery=" + z6 + ", isReleaseConstrained=" + z7 + ", isDemandArea=" + z8 + ", feeModified=" + bool + ", demandLevel=" + num + ", overlayLabel=" + str5 + ", overlayIcon=" + areaIconType + ", overlayMinZoomLevel=" + num2 + ", selectedOverlayLabel=" + str6 + ", region=" + polygon + ", color=" + i + ", colorDark=" + num3 + ", borderColor=" + i2 + ", borderColorDark=" + num4 + ", titleColor=" + i3 + ", titleColorDark=" + num5 + ", zoomBehavior=" + zoomBehavior + ", operational=" + z9 + ", maxSpeed=" + num6 + ", releaseCapacity=" + num7 + ", noParkingFineAlertTitle=" + str7 + ", noParkingFineAlertMessage=" + str8 + ", riderBarInRideMessageTitle=" + str9 + ", riderBarInRideMessageBody=" + str10 + ", riderBarNotInRideMessageTitle=" + str11 + ", riderBarNotInRideMessageBody=" + str12 + ", riderBarInRideMessageIconType=" + areaIconType2 + ", riderBarNotInRideMessageIconType=" + areaIconType3 + ", areaReleaseCapacityIconType=" + areaIconType4 + ", partnerId=" + str13 + ", fleetIds=" + list + ", areaKeys=" + list2 + ", isUniversalArea=" + z10 + ", noParkingFineCurrency=" + str14 + ", noParkingWarningAlertTitle=" + str15 + ", noParkingWarningAlertBody=" + str16 + ", noParkingFineAmount=" + num8 + ", areasMerged=" + list3 + ", centerPoint=" + geolocation + ", role=" + str17 + ", updatedAt=" + dateTime + ", zoneId=" + str18 + ", walkway=" + bool2 + ")";
    }

    public final String toolTipTitle() {
        if (this.isReleaseConstrained) {
            Integer num = this.releaseCapacity;
            if (num != null) {
                return num.toString();
            }
            return null;
        }
        return this.title;
    }

    public /* synthetic */ Area(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Boolean bool, Integer num, String str5, AreaIconType areaIconType, Integer num2, String str6, Polygon polygon, int i, Integer num3, int i2, Integer num4, int i3, Integer num5, ZoomBehavior zoomBehavior, boolean z9, Integer num6, Integer num7, String str7, String str8, String str9, String str10, String str11, String str12, AreaIconType areaIconType2, AreaIconType areaIconType3, AreaIconType areaIconType4, String str13, List list, List list2, boolean z10, String str14, String str15, String str16, Integer num8, List list3, Geolocation geolocation, String str17, DateTime dateTime, String str18, Boolean bool2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, z, z2, z3, z4, z5, z6, z7, z8, (i4 & 4096) != 0 ? Boolean.FALSE : bool, (i4 & 8192) != 0 ? null : num, (i4 & 16384) != 0 ? null : str5, (i4 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : areaIconType, (65536 & i4) != 0 ? null : num2, (131072 & i4) != 0 ? null : str6, polygon, i, num3, i2, num4, i3, num5, zoomBehavior, z9, (134217728 & i4) != 0 ? null : num6, (268435456 & i4) != 0 ? null : num7, (536870912 & i4) != 0 ? null : str7, (1073741824 & i4) != 0 ? null : str8, (i4 & Integer.MIN_VALUE) != 0 ? null : str9, (i5 & 1) != 0 ? null : str10, (i5 & 2) != 0 ? null : str11, (i5 & 4) != 0 ? null : str12, areaIconType2, areaIconType3, areaIconType4, (i5 & 64) != 0 ? null : str13, (i5 & 128) != 0 ? null : list, (i5 & 256) != 0 ? null : list2, z10, (i5 & 1024) != 0 ? null : str14, (i5 & 2048) != 0 ? null : str15, (i5 & 4096) != 0 ? null : str16, (i5 & 8192) != 0 ? null : num8, (i5 & 16384) != 0 ? null : list3, (i5 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : geolocation, str17, dateTime, (262144 & i5) != 0 ? null : str18, (524288 & i5) != 0 ? Boolean.FALSE : bool2);
    }
}
