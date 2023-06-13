package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Polygon;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.ZoomBehavior;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bg\b\u0086\b\u0018\u00002\u00020\u0001Bõ\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0015\u0012\b\b\u0002\u0010)\u001a\u00020\u0015\u0012\b\b\u0002\u0010*\u001a\u00020\u0015\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-\u0012\b\b\u0002\u0010/\u001a\u00020\b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104¢\u0006\u0002\u00105J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\bHÆ\u0003J\t\u0010l\u001a\u00020\bHÆ\u0003J\t\u0010m\u001a\u00020\bHÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010FJ\u0010\u0010o\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0019HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0012HÆ\u0003J\t\u0010w\u001a\u00020\u0012HÆ\u0003J\t\u0010x\u001a\u00020\u0012HÆ\u0003J\t\u0010y\u001a\u00020\u001eHÆ\u0003J\t\u0010z\u001a\u00020\bHÆ\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010|\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0015HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-HÆ\u0003J\u0012\u0010\u0089\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\bHÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010CJ\u0012\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u000104HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\bHÆ\u0003J\u0080\u0004\u0010\u0095\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010(\u001a\u00020\u00152\b\b\u0002\u0010)\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020\u00152\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-2\b\b\u0002\u0010/\u001a\u00020\b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-2\n\b\u0002\u00103\u001a\u0004\u0018\u000104HÆ\u0001¢\u0006\u0003\u0010\u0096\u0001J\u0015\u0010\u0097\u0001\u001a\u00020\b2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0012HÖ\u0001J\n\u0010\u009a\u0001\u001a\u00020\u0003HÖ\u0001R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010*\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00107R\u0016\u0010\u001b\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\u001a\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00107R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010AR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010AR\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010AR\u0016\u0010/\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010AR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010KR\u001a\u0010 \u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bM\u0010CR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010AR\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010KR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010KR\u001a\u00101\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bQ\u0010CR\u0018\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010KR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010AR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010KR\u0016\u0010\u001f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010AR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00109R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010KR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bX\u0010CR\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010KR\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010AR\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010AR\u001a\u0010!\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\b^\u0010CR\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010KR\u0016\u0010(\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u00109R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010KR\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010KR\u0016\u0010)\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u00109R\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010KR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010KR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010KR\u0016\u0010\u001c\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010<R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010i¨\u0006\u009b\u0001"}, m28432d2 = {"Lco/bird/android/model/wire/WireArea;", "", "id", "", "title", "label", "notes", "hideBirds", "", "rejectDrops", "noRides", "noParking", "preferredParking", "delivery", "isReleaseConstrained", "isDemandArea", "feeModified", "demandLevel", "", "overlayLabel", "overlayIcon", "Lco/bird/android/model/constant/AreaIconType;", "overlayMinZoomLevel", "selectedOverlayLabel", "region", "Lco/bird/android/model/Polygon;", "color", "borderColor", "titleColor", "zoomBehavior", "Lco/bird/android/model/constant/ZoomBehavior;", "operational", "maxSpeed", "releaseCapacity", "noParkingFineAlertTitle", "noParkingFineAlertMessage", "riderBarInRideMessageTitle", "riderBarInRideMessageBody", "riderBarNotInRideMessageTitle", "riderBarNotInRideMessageBody", "riderBarInRideMessageIconType", "riderBarNotInRideMessageIconType", "areaReleaseCapacityIconType", "partnerId", "fleetIds", "", "areaKeys", "isUniversalArea", "noParkingFineCurrency", "noParkingFineAmount", "areasMerged", "centerPoint", "Lco/bird/android/model/wire/WireLocation;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;IIILco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/wire/WireLocation;)V", "getAreaKeys", "()Ljava/util/List;", "getAreaReleaseCapacityIconType", "()Lco/bird/android/model/constant/AreaIconType;", "getAreasMerged", "getBorderColor", "()I", "getCenterPoint", "()Lco/bird/android/model/wire/WireLocation;", "getColor", "getDelivery", "()Z", "getDemandLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFeeModified", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFleetIds", "getHideBirds", "getId", "()Ljava/lang/String;", "getLabel", "getMaxSpeed", "getNoParking", "getNoParkingFineAlertMessage", "getNoParkingFineAlertTitle", "getNoParkingFineAmount", "getNoParkingFineCurrency", "getNoRides", "getNotes", "getOperational", "getOverlayIcon", "getOverlayLabel", "getOverlayMinZoomLevel", "getPartnerId", "getPreferredParking", "getRegion", "()Lco/bird/android/model/Polygon;", "getRejectDrops", "getReleaseCapacity", "getRiderBarInRideMessageBody", "getRiderBarInRideMessageIconType", "getRiderBarInRideMessageTitle", "getRiderBarNotInRideMessageBody", "getRiderBarNotInRideMessageIconType", "getRiderBarNotInRideMessageTitle", "getSelectedOverlayLabel", "getTitle", "getTitleColor", "getZoomBehavior", "()Lco/bird/android/model/constant/ZoomBehavior;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;IIILco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/wire/WireLocation;)Lco/bird/android/model/wire/WireArea;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireArea {
    @JsonProperty("area_keys")
    @InterfaceC41208ft5("area_keys")
    private final List<String> areaKeys;
    @JsonProperty("area_release_capacity_icon_type")
    @InterfaceC41208ft5("area_release_capacity_icon_type")
    private final AreaIconType areaReleaseCapacityIconType;
    @JsonProperty("areas_merged")
    @InterfaceC41208ft5("areas_merged")
    private final List<String> areasMerged;
    @JsonProperty("border_color")
    @InterfaceC41208ft5("border_color")
    private final int borderColor;
    @JsonProperty("center_point")
    @InterfaceC41208ft5("center_point")
    private final WireLocation centerPoint;
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final int color;
    @JsonProperty("delivery")
    @InterfaceC41208ft5("delivery")
    private final boolean delivery;
    @JsonProperty("demand_level")
    @InterfaceC41208ft5("demand_level")
    private final Integer demandLevel;
    @JsonProperty("fee_modified")
    @InterfaceC41208ft5("fee_modified")
    private final Boolean feeModified;
    @JsonProperty("fleet_ids")
    @InterfaceC41208ft5("fleet_ids")
    private final List<String> fleetIds;
    @JsonProperty("hide_birds")
    @InterfaceC41208ft5("hide_birds")
    private final boolean hideBirds;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66714id;
    @JsonProperty("is_demand_area")
    @InterfaceC41208ft5("is_demand_area")
    private final boolean isDemandArea;
    @JsonProperty("release_constrained")
    @InterfaceC41208ft5("release_constrained")
    private final boolean isReleaseConstrained;
    @JsonProperty("universal")
    @InterfaceC41208ft5("universal")
    private final boolean isUniversalArea;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("max_speed")
    @InterfaceC41208ft5("max_speed")
    private final Integer maxSpeed;
    @JsonProperty("no_parking")
    @InterfaceC41208ft5("no_parking")
    private final boolean noParking;
    @JsonProperty("no_parking_fine_alert_message")
    @InterfaceC41208ft5("no_parking_fine_alert_message")
    private final String noParkingFineAlertMessage;
    @JsonProperty("no_parking_fine_alert_title")
    @InterfaceC41208ft5("no_parking_fine_alert_title")
    private final String noParkingFineAlertTitle;
    @JsonProperty("no_parking_fine_amount")
    @InterfaceC41208ft5("no_parking_fine_amount")
    private final Integer noParkingFineAmount;
    @JsonProperty("no_parking_fine_currency")
    @InterfaceC41208ft5("no_parking_fine_currency")
    private final String noParkingFineCurrency;
    @JsonProperty("no_rides")
    @InterfaceC41208ft5("no_rides")
    private final boolean noRides;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("operational")
    @InterfaceC41208ft5("operational")
    private final boolean operational;
    @JsonProperty("overlay_icon")
    @InterfaceC41208ft5("overlay_icon")
    private final AreaIconType overlayIcon;
    @JsonProperty("overlay_label")
    @InterfaceC41208ft5("overlay_label")
    private final String overlayLabel;
    @JsonProperty("overlay_min_zoom_level")
    @InterfaceC41208ft5("overlay_min_zoom_level")
    private final Integer overlayMinZoomLevel;
    @JsonProperty("partner_id")
    @InterfaceC41208ft5("partner_id")
    private final String partnerId;
    @JsonProperty("preferred_parking")
    @InterfaceC41208ft5("preferred_parking")
    private final boolean preferredParking;
    @JsonProperty("region")
    @InterfaceC41208ft5("region")
    private final Polygon region;
    @JsonProperty("reject_drops")
    @InterfaceC41208ft5("reject_drops")
    private final boolean rejectDrops;
    @JsonProperty("release_capacity")
    @InterfaceC41208ft5("release_capacity")
    private final Integer releaseCapacity;
    @JsonProperty("rider_bar_in_ride_message_body")
    @InterfaceC41208ft5("rider_bar_in_ride_message_body")
    private final String riderBarInRideMessageBody;
    @JsonProperty("rider_bar_in_ride_message_icon_type")
    @InterfaceC41208ft5("rider_bar_in_ride_message_icon_type")
    private final AreaIconType riderBarInRideMessageIconType;
    @JsonProperty("rider_bar_in_ride_message_title")
    @InterfaceC41208ft5("rider_bar_in_ride_message_title")
    private final String riderBarInRideMessageTitle;
    @JsonProperty("rider_bar_not_in_ride_message_body")
    @InterfaceC41208ft5("rider_bar_not_in_ride_message_body")
    private final String riderBarNotInRideMessageBody;
    @JsonProperty("rider_bar_not_in_ride_message_icon_type")
    @InterfaceC41208ft5("rider_bar_not_in_ride_message_icon_type")
    private final AreaIconType riderBarNotInRideMessageIconType;
    @JsonProperty("rider_bar_not_in_ride_message_title")
    @InterfaceC41208ft5("rider_bar_not_in_ride_message_title")
    private final String riderBarNotInRideMessageTitle;
    @JsonProperty("selected_overlay_label")
    @InterfaceC41208ft5("selected_overlay_label")
    private final String selectedOverlayLabel;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("title_color")
    @InterfaceC41208ft5("title_color")
    private final int titleColor;
    @JsonProperty("zoom_behavior")
    @InterfaceC41208ft5("zoom_behavior")
    private final ZoomBehavior zoomBehavior;

    public WireArea() {
        this(null, null, null, null, false, false, false, false, false, false, false, false, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -1, 2047, null);
    }

    public final String component1() {
        return this.f66714id;
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

    public final int component21() {
        return this.borderColor;
    }

    public final int component22() {
        return this.titleColor;
    }

    public final ZoomBehavior component23() {
        return this.zoomBehavior;
    }

    public final boolean component24() {
        return this.operational;
    }

    public final Integer component25() {
        return this.maxSpeed;
    }

    public final Integer component26() {
        return this.releaseCapacity;
    }

    public final String component27() {
        return this.noParkingFineAlertTitle;
    }

    public final String component28() {
        return this.noParkingFineAlertMessage;
    }

    public final String component29() {
        return this.riderBarInRideMessageTitle;
    }

    public final String component3() {
        return this.label;
    }

    public final String component30() {
        return this.riderBarInRideMessageBody;
    }

    public final String component31() {
        return this.riderBarNotInRideMessageTitle;
    }

    public final String component32() {
        return this.riderBarNotInRideMessageBody;
    }

    public final AreaIconType component33() {
        return this.riderBarInRideMessageIconType;
    }

    public final AreaIconType component34() {
        return this.riderBarNotInRideMessageIconType;
    }

    public final AreaIconType component35() {
        return this.areaReleaseCapacityIconType;
    }

    public final String component36() {
        return this.partnerId;
    }

    public final List<String> component37() {
        return this.fleetIds;
    }

    public final List<String> component38() {
        return this.areaKeys;
    }

    public final boolean component39() {
        return this.isUniversalArea;
    }

    public final String component4() {
        return this.notes;
    }

    public final String component40() {
        return this.noParkingFineCurrency;
    }

    public final Integer component41() {
        return this.noParkingFineAmount;
    }

    public final List<String> component42() {
        return this.areasMerged;
    }

    public final WireLocation component43() {
        return this.centerPoint;
    }

    public final boolean component5() {
        return this.hideBirds;
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

    public final WireArea copy(String id, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Boolean bool, Integer num, String str4, AreaIconType areaIconType, Integer num2, String str5, Polygon region, int i, int i2, int i3, ZoomBehavior zoomBehavior, boolean z9, Integer num3, Integer num4, String str6, String str7, String str8, String str9, String str10, String str11, AreaIconType riderBarInRideMessageIconType, AreaIconType riderBarNotInRideMessageIconType, AreaIconType areaReleaseCapacityIconType, String str12, List<String> list, List<String> list2, boolean z10, String str13, Integer num5, List<String> list3, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(zoomBehavior, "zoomBehavior");
        Intrinsics.checkNotNullParameter(riderBarInRideMessageIconType, "riderBarInRideMessageIconType");
        Intrinsics.checkNotNullParameter(riderBarNotInRideMessageIconType, "riderBarNotInRideMessageIconType");
        Intrinsics.checkNotNullParameter(areaReleaseCapacityIconType, "areaReleaseCapacityIconType");
        return new WireArea(id, str, str2, str3, z, z2, z3, z4, z5, z6, z7, z8, bool, num, str4, areaIconType, num2, str5, region, i, i2, i3, zoomBehavior, z9, num3, num4, str6, str7, str8, str9, str10, str11, riderBarInRideMessageIconType, riderBarNotInRideMessageIconType, areaReleaseCapacityIconType, str12, list, list2, z10, str13, num5, list3, wireLocation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireArea) {
            WireArea wireArea = (WireArea) obj;
            return Intrinsics.areEqual(this.f66714id, wireArea.f66714id) && Intrinsics.areEqual(this.title, wireArea.title) && Intrinsics.areEqual(this.label, wireArea.label) && Intrinsics.areEqual(this.notes, wireArea.notes) && this.hideBirds == wireArea.hideBirds && this.rejectDrops == wireArea.rejectDrops && this.noRides == wireArea.noRides && this.noParking == wireArea.noParking && this.preferredParking == wireArea.preferredParking && this.delivery == wireArea.delivery && this.isReleaseConstrained == wireArea.isReleaseConstrained && this.isDemandArea == wireArea.isDemandArea && Intrinsics.areEqual(this.feeModified, wireArea.feeModified) && Intrinsics.areEqual(this.demandLevel, wireArea.demandLevel) && Intrinsics.areEqual(this.overlayLabel, wireArea.overlayLabel) && this.overlayIcon == wireArea.overlayIcon && Intrinsics.areEqual(this.overlayMinZoomLevel, wireArea.overlayMinZoomLevel) && Intrinsics.areEqual(this.selectedOverlayLabel, wireArea.selectedOverlayLabel) && Intrinsics.areEqual(this.region, wireArea.region) && this.color == wireArea.color && this.borderColor == wireArea.borderColor && this.titleColor == wireArea.titleColor && this.zoomBehavior == wireArea.zoomBehavior && this.operational == wireArea.operational && Intrinsics.areEqual(this.maxSpeed, wireArea.maxSpeed) && Intrinsics.areEqual(this.releaseCapacity, wireArea.releaseCapacity) && Intrinsics.areEqual(this.noParkingFineAlertTitle, wireArea.noParkingFineAlertTitle) && Intrinsics.areEqual(this.noParkingFineAlertMessage, wireArea.noParkingFineAlertMessage) && Intrinsics.areEqual(this.riderBarInRideMessageTitle, wireArea.riderBarInRideMessageTitle) && Intrinsics.areEqual(this.riderBarInRideMessageBody, wireArea.riderBarInRideMessageBody) && Intrinsics.areEqual(this.riderBarNotInRideMessageTitle, wireArea.riderBarNotInRideMessageTitle) && Intrinsics.areEqual(this.riderBarNotInRideMessageBody, wireArea.riderBarNotInRideMessageBody) && this.riderBarInRideMessageIconType == wireArea.riderBarInRideMessageIconType && this.riderBarNotInRideMessageIconType == wireArea.riderBarNotInRideMessageIconType && this.areaReleaseCapacityIconType == wireArea.areaReleaseCapacityIconType && Intrinsics.areEqual(this.partnerId, wireArea.partnerId) && Intrinsics.areEqual(this.fleetIds, wireArea.fleetIds) && Intrinsics.areEqual(this.areaKeys, wireArea.areaKeys) && this.isUniversalArea == wireArea.isUniversalArea && Intrinsics.areEqual(this.noParkingFineCurrency, wireArea.noParkingFineCurrency) && Intrinsics.areEqual(this.noParkingFineAmount, wireArea.noParkingFineAmount) && Intrinsics.areEqual(this.areasMerged, wireArea.areasMerged) && Intrinsics.areEqual(this.centerPoint, wireArea.centerPoint);
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

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final WireLocation getCenterPoint() {
        return this.centerPoint;
    }

    public final int getColor() {
        return this.color;
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

    public final String getId() {
        return this.f66714id;
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

    public final Polygon getRegion() {
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

    public final String getSelectedOverlayLabel() {
        return this.selectedOverlayLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTitleColor() {
        return this.titleColor;
    }

    public final ZoomBehavior getZoomBehavior() {
        return this.zoomBehavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66714id.hashCode() * 31;
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
        int hashCode10 = (((((((((((hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.region.hashCode()) * 31) + Integer.hashCode(this.color)) * 31) + Integer.hashCode(this.borderColor)) * 31) + Integer.hashCode(this.titleColor)) * 31) + this.zoomBehavior.hashCode()) * 31;
        boolean z9 = this.operational;
        int i17 = z9;
        if (z9 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode10 + i17) * 31;
        Integer num3 = this.maxSpeed;
        int hashCode11 = (i18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.releaseCapacity;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.noParkingFineAlertTitle;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.noParkingFineAlertMessage;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.riderBarInRideMessageTitle;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.riderBarInRideMessageBody;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.riderBarNotInRideMessageTitle;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.riderBarNotInRideMessageBody;
        int hashCode18 = (((((((hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.riderBarInRideMessageIconType.hashCode()) * 31) + this.riderBarNotInRideMessageIconType.hashCode()) * 31) + this.areaReleaseCapacityIconType.hashCode()) * 31;
        String str12 = this.partnerId;
        int hashCode19 = (hashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<String> list = this.fleetIds;
        int hashCode20 = (hashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.areaKeys;
        int hashCode21 = (hashCode20 + (list2 == null ? 0 : list2.hashCode())) * 31;
        boolean z10 = this.isUniversalArea;
        int i19 = (hashCode21 + (z10 ? 1 : z10 ? 1 : 0)) * 31;
        String str13 = this.noParkingFineCurrency;
        int hashCode22 = (i19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num5 = this.noParkingFineAmount;
        int hashCode23 = (hashCode22 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<String> list3 = this.areasMerged;
        int hashCode24 = (hashCode23 + (list3 == null ? 0 : list3.hashCode())) * 31;
        WireLocation wireLocation = this.centerPoint;
        return hashCode24 + (wireLocation != null ? wireLocation.hashCode() : 0);
    }

    public final boolean isDemandArea() {
        return this.isDemandArea;
    }

    public final boolean isReleaseConstrained() {
        return this.isReleaseConstrained;
    }

    public final boolean isUniversalArea() {
        return this.isUniversalArea;
    }

    public String toString() {
        String str = this.f66714id;
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
        int i2 = this.borderColor;
        int i3 = this.titleColor;
        ZoomBehavior zoomBehavior = this.zoomBehavior;
        boolean z9 = this.operational;
        Integer num3 = this.maxSpeed;
        Integer num4 = this.releaseCapacity;
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
        Integer num5 = this.noParkingFineAmount;
        List<String> list3 = this.areasMerged;
        WireLocation wireLocation = this.centerPoint;
        return "WireArea(id=" + str + ", title=" + str2 + ", label=" + str3 + ", notes=" + str4 + ", hideBirds=" + z + ", rejectDrops=" + z2 + ", noRides=" + z3 + ", noParking=" + z4 + ", preferredParking=" + z5 + ", delivery=" + z6 + ", isReleaseConstrained=" + z7 + ", isDemandArea=" + z8 + ", feeModified=" + bool + ", demandLevel=" + num + ", overlayLabel=" + str5 + ", overlayIcon=" + areaIconType + ", overlayMinZoomLevel=" + num2 + ", selectedOverlayLabel=" + str6 + ", region=" + polygon + ", color=" + i + ", borderColor=" + i2 + ", titleColor=" + i3 + ", zoomBehavior=" + zoomBehavior + ", operational=" + z9 + ", maxSpeed=" + num3 + ", releaseCapacity=" + num4 + ", noParkingFineAlertTitle=" + str7 + ", noParkingFineAlertMessage=" + str8 + ", riderBarInRideMessageTitle=" + str9 + ", riderBarInRideMessageBody=" + str10 + ", riderBarNotInRideMessageTitle=" + str11 + ", riderBarNotInRideMessageBody=" + str12 + ", riderBarInRideMessageIconType=" + areaIconType2 + ", riderBarNotInRideMessageIconType=" + areaIconType3 + ", areaReleaseCapacityIconType=" + areaIconType4 + ", partnerId=" + str13 + ", fleetIds=" + list + ", areaKeys=" + list2 + ", isUniversalArea=" + z10 + ", noParkingFineCurrency=" + str14 + ", noParkingFineAmount=" + num5 + ", areasMerged=" + list3 + ", centerPoint=" + wireLocation + ")";
    }

    public WireArea(String id, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Boolean bool, Integer num, String str4, AreaIconType areaIconType, Integer num2, String str5, Polygon region, int i, int i2, int i3, ZoomBehavior zoomBehavior, boolean z9, Integer num3, Integer num4, String str6, String str7, String str8, String str9, String str10, String str11, AreaIconType riderBarInRideMessageIconType, AreaIconType riderBarNotInRideMessageIconType, AreaIconType areaReleaseCapacityIconType, String str12, List<String> list, List<String> list2, boolean z10, String str13, Integer num5, List<String> list3, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(zoomBehavior, "zoomBehavior");
        Intrinsics.checkNotNullParameter(riderBarInRideMessageIconType, "riderBarInRideMessageIconType");
        Intrinsics.checkNotNullParameter(riderBarNotInRideMessageIconType, "riderBarNotInRideMessageIconType");
        Intrinsics.checkNotNullParameter(areaReleaseCapacityIconType, "areaReleaseCapacityIconType");
        this.f66714id = id;
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
        this.borderColor = i2;
        this.titleColor = i3;
        this.zoomBehavior = zoomBehavior;
        this.operational = z9;
        this.maxSpeed = num3;
        this.releaseCapacity = num4;
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
        this.noParkingFineAmount = num5;
        this.areasMerged = list3;
        this.centerPoint = wireLocation;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireArea(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Boolean bool, Integer num, String str5, AreaIconType areaIconType, Integer num2, String str6, Polygon polygon, int i, int i2, int i3, ZoomBehavior zoomBehavior, boolean z9, Integer num3, Integer num4, String str7, String str8, String str9, String str10, String str11, String str12, AreaIconType areaIconType2, AreaIconType areaIconType3, AreaIconType areaIconType4, String str13, List list, List list2, boolean z10, String str14, Integer num5, List list3, WireLocation wireLocation, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(r2, r3, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r4, r87, r8, r16, r17, r18, r19, r20, (i4 & 1048576) != 0 ? r20 : i2, (i4 & 2097152) != 0 ? r20 : i3, (i4 & 4194304) != 0 ? ZoomBehavior.ALWAYS_VISIBLE : zoomBehavior, (i4 & 8388608) != 0 ? false : z9, (i4 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num3, (i4 & 33554432) != 0 ? null : num4, (i4 & 67108864) != 0 ? null : str7, (i4 & 134217728) != 0 ? null : str8, (i4 & 268435456) != 0 ? null : str9, (i4 & 536870912) != 0 ? null : str10, (i4 & 1073741824) != 0 ? null : str11, (i4 & Integer.MIN_VALUE) != 0 ? null : str12, (i5 & 1) != 0 ? AreaIconType.UNKNOWN : areaIconType2, (i5 & 2) != 0 ? AreaIconType.UNKNOWN : areaIconType3, (i5 & 4) != 0 ? AreaIconType.UNKNOWN : areaIconType4, (i5 & 8) != 0 ? null : str13, (i5 & 16) != 0 ? null : list, (i5 & 32) != 0 ? null : list2, (i5 & 64) != 0 ? false : z10, (i5 & 128) != 0 ? null : str14, (i5 & 256) != 0 ? null : num5, (i5 & 512) != 0 ? null : list3, (i5 & 1024) != 0 ? null : wireLocation);
        String str15 = (i4 & 1) != 0 ? "" : str;
        String str16 = (i4 & 2) != 0 ? null : str2;
        String str17 = (i4 & 4) != 0 ? null : str3;
        String str18 = (i4 & 8) != 0 ? null : str4;
        boolean z11 = (i4 & 16) != 0 ? false : z;
        boolean z12 = (i4 & 32) != 0 ? false : z2;
        boolean z13 = (i4 & 64) != 0 ? false : z3;
        boolean z14 = (i4 & 128) != 0 ? false : z4;
        boolean z15 = (i4 & 256) != 0 ? false : z5;
        boolean z16 = (i4 & 512) != 0 ? false : z6;
        boolean z17 = (i4 & 1024) != 0 ? false : z7;
        boolean z18 = (i4 & 2048) != 0 ? false : z8;
        Boolean bool2 = (i4 & 4096) != 0 ? Boolean.FALSE : bool;
        Integer num6 = (i4 & 8192) != 0 ? null : num;
        String str19 = (i4 & 16384) != 0 ? null : str5;
        AreaIconType areaIconType5 = (i4 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : areaIconType;
        Integer num7 = (i4 & 65536) != 0 ? null : num2;
        String str20 = (i4 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : str6;
        Polygon polygon2 = (i4 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? new Polygon() : polygon;
        int i6 = (i4 & 524288) != 0 ? 0 : i;
    }
}
