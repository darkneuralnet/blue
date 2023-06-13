package p000;

import androidx.compose.p003ui.graphics.C11329d;
import androidx.compose.p003ui.graphics.InterfaceC11328c;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000 \u0080\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0003_\u0081\u0002B\u0011\u0012\u0006\u0010~\u001a\u00020y¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0002J-\u0010\u0012\u001a\u00020\u00072\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002JY\u0010\u001e\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020\u0014*\u0004\u0018\u00018\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJa\u0010\"\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020\u0014*\u0004\u0018\u00018\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#Ja\u0010$\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020\u0014*\u0004\u0018\u00018\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010#J\f\u0010%\u001a\u00020\u0000*\u00020\u0003H\u0002J%\u0010(\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J \u0010-\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\bH\u0002J\u0018\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020*2\u0006\u0010,\u001a\u00020\bH\u0002J\u001d\u00100\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\b2\n\u00103\u001a\u0006\u0012\u0002\b\u000302ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J)\u00106\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00152\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0006\u00108\u001a\u00020\bJ\u000f\u00109\u001a\u00020\u0007H\u0010¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020\u00072\b\u0010<\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0004\b=\u0010>J\u0010\u0010A\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?H\u0004J\u0010\u0010B\u001a\u00020?2\u0006\u0010<\u001a\u00020;H&J\u0018\u0010F\u001a\u00020\u00072\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020CH\u0014J\u0006\u0010G\u001a\u00020\u0007J@\u0010K\u001a\u00020\u00072\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020 2\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\u000fH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010LJ\u000e\u0010M\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006J\u0010\u0010N\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0006\u0010O\u001a\u00020\u0007J\u0011\u0010P\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0096\u0002J+\u0010Q\u001a\u00020\u00072\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\bJQ\u0010R\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010SJS\u0010T\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010SJ\u0006\u0010V\u001a\u00020UJ\u001d\u0010X\u001a\u00020\u00182\u0006\u0010W\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u00101J\u001d\u0010Z\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u00101J%\u0010]\u001a\u00020\u00182\u0006\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010^J\u0018\u0010_\u001a\u00020U2\u0006\u0010[\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\bH\u0016J\u001d\u0010`\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b`\u00101J\u001d\u0010a\u001a\u00020\u00182\u0006\u0010I\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u00101J\u001d\u0010b\u001a\u00020\u00182\u0006\u0010I\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u00101J\u0018\u0010e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010d\u001a\u00020cH\u0004J\u0006\u0010f\u001a\u00020\u0007J\u0006\u0010g\u001a\u00020\u0007J)\u0010i\u001a\u00020\u00072\u0006\u0010.\u001a\u00020*2\u0006\u0010,\u001a\u00020\b2\b\b\u0002\u0010h\u001a\u00020\bH\u0000¢\u0006\u0004\bi\u0010jJ\u001d\u0010k\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010lJ\u001d\u0010m\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010lJ\b\u0010n\u001a\u00020\u0007H\u0016J\b\u0010o\u001a\u00020\u0007H\u0016J\u0017\u0010q\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u0000H\u0000¢\u0006\u0004\bq\u0010rJ\u0006\u0010s\u001a\u00020\bJ\u001d\u0010v\u001a\u00020t2\u0006\u0010u\u001a\u00020tH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bv\u00101J%\u0010w\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010u\u001a\u00020tH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bw\u0010xR\u001a\u0010~\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R)\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\bZ\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0085\u0001\u0010\u007f\u001a\u0006\b\u0086\u0001\u0010\u0081\u0001\"\u0006\b\u0087\u0001\u0010\u0083\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008a\u0001RO\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\u000f2\u001a\u0010\u008e\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\u000f8\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001a\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001a\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009d\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R-\u0010@\u001a\u0004\u0018\u00010?2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010?8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R)\u0010ª\u0001\u001a\u0012\u0012\u0005\u0012\u00030§\u0001\u0012\u0004\u0012\u00020C\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R:\u0010I\u001a\u00020H2\u0007\u0010\u008e\u0001\u001a\u00020H8\u0016@TX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R1\u0010J\u001a\u00020 2\u0007\u0010\u008e\u0001\u001a\u00020 8\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010\u009c\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R\u001b\u0010¸\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001c\u0010¼\u0001\u001a\u0005\u0018\u00010¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001e\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R)\u0010Ã\u0001\u001a\u00020\b2\u0007\u0010\u008e\u0001\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b`\u0010\u008a\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R0\u0010É\u0001\u001a\u0005\u0018\u00010Ä\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010Ä\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0018\u0010Í\u0001\u001a\u00030Ê\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0017\u0010Ð\u0001\u001a\u00020\n8&X¦\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ó\u0001\u001a\u00030\u0097\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0017\u0010Õ\u0001\u001a\u00020 8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010³\u0001R\u0017\u0010×\u0001\u001a\u00020 8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010³\u0001R\u0019\u0010Ú\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0017\u0010Ý\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u001e\u0010à\u0001\u001a\u00030Þ\u00018Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\bß\u0001\u0010®\u0001R\u0018\u0010ä\u0001\u001a\u00030á\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0019\u0010æ\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010Ù\u0001R\u0017\u0010è\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010Â\u0001R\u0017\u0010é\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010Â\u0001R,\u0010ï\u0001\u001a\u00030\u009e\u00012\b\u0010ê\u0001\u001a\u00030\u009e\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R\u001a\u0010ó\u0001\u001a\u0005\u0018\u00010ð\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010ò\u0001R\u0016\u0010ô\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b«\u0001\u0010Ü\u0001R\u0017\u0010÷\u0001\u001a\u00020*8DX\u0084\u0004¢\u0006\b\u001a\u0006\bõ\u0001\u0010ö\u0001R!\u0010ú\u0001\u001a\u00030ø\u00018@X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\bù\u0001\u0010®\u0001R\u0017\u0010ü\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bû\u0001\u0010Â\u0001R\u001c\u0010u\u001a\u00020t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\bý\u0001\u0010®\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0082\u0002"}, m28432d2 = {"LH83;", "LSC2;", "LvO2;", "Lnm2;", "LlD3;", "Lkotlin/Function1;", "Lme0;", "", "", "includeTail", "LgV2$c;", "m2", "canvas", "V1", "Landroidx/compose/ui/graphics/c;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "forceLayerInvalidated", "x2", "S2", "LvZ0;", "T", "LH83$f;", "hitTestSource", "LCe3;", "pointerPosition", "LRM1;", "hitTestResult", "isTouchEvent", "isInLayer", "o2", "(LvZ0;LH83$f;JLRM1;ZZ)V", "", "distanceFromEdge", "p2", "(LvZ0;LH83$f;JLRM1;ZZF)V", "N2", "O2", "ancestor", "offset", "P1", "(LH83;J)J", "LyX2;", "rect", "clipBounds", "O1", "bounds", "Y1", "w2", "(J)J", "LK83;", "type", "l2", "(I)Z", "n2", "(I)Ljava/lang/Object;", "v2", "y1", "()V", "LXC2;", Action.SCOPE_ATTRIBUTE, "U2", "(LXC2;)V", "LTC2;", "lookaheadDelegate", "T2", "R1", "", "width", "height", "B2", "C2", "LA52;", "position", "zIndex", "j1", "(JFLkotlin/jvm/functions/Function1;)V", "T1", "F2", "D2", "t2", "R2", "q2", "(LH83$f;JLRM1;ZZ)V", "r2", "LOs4;", "Q2", "relativeToWindow", "H", "relativeToLocal", "i", "sourceCoordinates", "relativeToSource", "X", "(Lnm2;J)J", "e", "y", "P2", "X1", "LkE3;", "paint", "U1", "A2", "E2", "clipToMinimumTouchTargetSize", "G2", "(LyX2;ZZ)V", "V2", "(J)Z", "u2", "s2", "z2", LegacyRepairType.OTHER_KEY, "W1", "(LH83;)LH83;", "M2", "LxB5;", "minimumTouchTargetSize", "Q1", "S1", "(JJ)F", "LJm2;", "h", "LJm2;", "r1", "()LJm2;", "layoutNode", "LH83;", "i2", "()LH83;", "K2", "(LH83;)V", "wrapped", "j", "j2", "L2", "wrappedBy", "k", "Z", "released", "l", "isClipping", "<set-?>", "m", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "Lg01;", "n", "Lg01;", "layerDensity", "Lpm2;", "o", "Lpm2;", "layerLayoutDirection", "p", "F", "lastLayerAlpha", "LyO2;", "q", "LyO2;", "_measureResult", "r", "LTC2;", "d2", "()LTC2;", "", "LL9;", "s", "Ljava/util/Map;", "oldAlignmentLines", "t", "J", "u1", "()J", "J2", "(J)V", "u", "k2", "()F", "setZIndex", "(F)V", "v", "LyX2;", "_rectCache", "Ljm2;", "w", "Ljm2;", "layerPositionalProperties", "Lkotlin/Function0;", "x", "Lkotlin/jvm/functions/Function0;", "invalidateParentLayer", "a2", "()Z", "lastLayerDrawingWasSkipped", "LiD3;", "z", "LiD3;", "c2", "()LiD3;", "layer", "LmD3;", "g2", "()LmD3;", "snapshotObserver", "h2", "()LgV2$c;", "tail", "getLayoutDirection", "()Lpm2;", "layoutDirection", "b", "density", "R0", "fontScale", "t1", "()LSC2;", "parent", "p1", "()Lnm2;", "coordinates", "LG52;", C17296a.f69688o, "size", "LQ9;", "Z1", "()LQ9;", "alignmentLinesOwner", "o1", "child", "q1", "hasMeasureResult", "isAttached", "value", "s1", "()LyO2;", "I2", "(LyO2;)V", "measureResult", "", "c", "()Ljava/lang/Object;", "parentData", "parentLayoutCoordinates", "f2", "()LyX2;", "rectCache", "Lkz0;", "b2", "lastMeasurementConstraints", "L", "isValidOwnerScope", "e2", "<init>", "(LJm2;)V", "A", "f", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1354:1\n100#1,9:1355\n100#1,9:1364\n100#1,9:1373\n111#1:1384\n100#1,15:1385\n111#1:1418\n100#1,15:1419\n121#1:1437\n100#1,9:1438\n122#1:1447\n111#1:1449\n100#1,15:1450\n111#1:1466\n100#1,15:1467\n1#2:1382\n71#3:1383\n79#3:1400\n79#3:1404\n81#3:1409\n81#3:1417\n71#3:1436\n81#3:1448\n81#3:1465\n69#3:1482\n69#3:1483\n75#3:1493\n75#3:1494\n664#4,3:1401\n667#4,3:1406\n196#5:1405\n480#6,4:1410\n485#6:1435\n122#7,3:1414\n126#7:1434\n276#8,9:1484\n290#8:1495\n262#8,7:1496\n291#8,2:1503\n270#8,3:1505\n66#9,5:1508\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n111#1:1355,9\n121#1:1364,9\n126#1:1373,9\n247#1:1384\n247#1:1385,15\n315#1:1418\n315#1:1419,15\n365#1:1437\n365#1:1438,9\n365#1:1447\n382#1:1449\n382#1:1450,15\n386#1:1466\n386#1:1467,15\n247#1:1383\n262#1:1400\n266#1:1404\n313#1:1409\n315#1:1417\n365#1:1436\n382#1:1448\n386#1:1465\n686#1:1482\n1075#1:1483\n1107#1:1493\n1108#1:1494\n264#1:1401,3\n264#1:1406,3\n266#1:1405\n314#1:1410,4\n314#1:1435\n314#1:1414,3\n314#1:1434\n1075#1:1484,9\n1108#1:1495\n1108#1:1496,7\n1108#1:1503,2\n1108#1:1505,3\n1150#1:1508,5\n*E\n"})
/* renamed from: H83 */
/* loaded from: classes.dex */
public abstract class H83 extends SC2 implements InterfaceC50393vO2, InterfaceC45879nm2, InterfaceC44367lD3, Function1<InterfaceC45204me0, Unit> {

    /* renamed from: A */
    public static final C3037e f12884A = new C3037e(null);

    /* renamed from: B */
    public static final Function1<H83, Unit> f12885B = C3036d.f12912g;

    /* renamed from: C */
    public static final Function1<H83, Unit> f12886C = C3035c.f12911g;

    /* renamed from: D */
    public static final C11329d f12887D = new C11329d();

    /* renamed from: E */
    public static final C43507jm2 f12888E = new C43507jm2();

    /* renamed from: F */
    public static final float[] f12889F = C42084hN2.m36494c(null, 1, null);

    /* renamed from: G */
    public static final InterfaceC3038f<InterfaceC48105rX3> f12890G = new C3033a();

    /* renamed from: H */
    public static final InterfaceC3038f<InterfaceC41791gs5> f12891H = new C3034b();

    /* renamed from: h */
    public final C33829Jm2 f12892h;

    /* renamed from: i */
    public H83 f12893i;

    /* renamed from: j */
    public H83 f12894j;

    /* renamed from: k */
    public boolean f12895k;

    /* renamed from: l */
    public boolean f12896l;

    /* renamed from: m */
    public Function1<? super InterfaceC11328c, Unit> f12897m;

    /* renamed from: n */
    public InterfaceC41273g01 f12898n;

    /* renamed from: o */
    public EnumC47065pm2 f12899o;

    /* renamed from: p */
    public float f12900p;

    /* renamed from: q */
    public InterfaceC52172yO2 f12901q;

    /* renamed from: r */
    public TC2 f12902r;

    /* renamed from: s */
    public Map<AbstractC4750L9, Integer> f12903s;

    /* renamed from: t */
    public long f12904t;

    /* renamed from: u */
    public float f12905u;

    /* renamed from: v */
    public C52253yX2 f12906v;

    /* renamed from: w */
    public C43507jm2 f12907w;

    /* renamed from: x */
    public final Function0<Unit> f12908x;

    /* renamed from: y */
    public boolean f12909y;

    /* renamed from: z */
    public InterfaceC42588iD3 f12910z;

    @Metadata(m28433d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016JC\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"H83$a", "LH83$f;", "LrX3;", "LK83;", C17296a.f69688o, "()I", "node", "", "e", "LJm2;", "parentLayoutNode", "c", "layoutNode", "LCe3;", "pointerPosition", "LRM1;", "hitTestResult", "isTouchEvent", "isInLayer", "", "b", "(LJm2;JLRM1;ZZ)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n75#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n*L\n1242#1:1355\n*E\n"})
    /* renamed from: H83$a */
    /* loaded from: classes.dex */
    public static final class C3033a implements InterfaceC3038f<InterfaceC48105rX3> {
        @Override // p000.H83.InterfaceC3038f
        /* renamed from: a */
        public int mo104287a() {
            return K83.m99169a(16);
        }

        @Override // p000.H83.InterfaceC3038f
        /* renamed from: b */
        public void mo104286b(C33829Jm2 layoutNode, long j, RM1<InterfaceC48105rX3> hitTestResult, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m99733x0(j, hitTestResult, z, z2);
        }

        @Override // p000.H83.InterfaceC3038f
        /* renamed from: c */
        public boolean mo104285c(C33829Jm2 parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            return true;
        }

        @Override // p000.H83.InterfaceC3038f
        /* renamed from: e */
        public boolean mo104284d(InterfaceC48105rX3 node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return node.mo15818j();
        }
    }

    @Metadata(m28433d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016JC\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"H83$b", "LH83$f;", "Lgs5;", "LK83;", C17296a.f69688o, "()I", "node", "", "e", "LJm2;", "parentLayoutNode", "c", "layoutNode", "LCe3;", "pointerPosition", "LRM1;", "hitTestResult", "isTouchEvent", "isInLayer", "", "b", "(LJm2;JLRM1;ZZ)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n73#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n*L\n1263#1:1355\n*E\n"})
    /* renamed from: H83$b */
    /* loaded from: classes.dex */
    public static final class C3034b implements InterfaceC3038f<InterfaceC41791gs5> {
        @Override // p000.H83.InterfaceC3038f
        /* renamed from: a */
        public int mo104287a() {
            return K83.m99169a(8);
        }

        @Override // p000.H83.InterfaceC3038f
        /* renamed from: b */
        public void mo104286b(C33829Jm2 layoutNode, long j, RM1<InterfaceC41791gs5> hitTestResult, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m99727z0(j, hitTestResult, z, z2);
        }

        @Override // p000.H83.InterfaceC3038f
        /* renamed from: c */
        public boolean mo104285c(C33829Jm2 parentLayoutNode) {
            C38809bs5 m35683a;
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            InterfaceC41791gs5 m29803i = C43570js5.m29803i(parentLayoutNode);
            boolean z = false;
            if (m29803i != null && (m35683a = C42384hs5.m35683a(m29803i)) != null && m35683a.m62255o()) {
                z = true;
            }
            return !z;
        }

        @Override // p000.H83.InterfaceC3038f
        /* renamed from: e */
        public boolean mo104284d(InterfaceC41791gs5 node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LH83;", "coordinator", "", C17296a.f69688o, "(LH83;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: H83$c */
    /* loaded from: classes.dex */
    public static final class C3035c extends Lambda implements Function1<H83, Unit> {

        /* renamed from: g */
        public static final C3035c f12911g = new C3035c();

        public C3035c() {
            super(1);
        }

        /* renamed from: a */
        public final void m104291a(H83 coordinator) {
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            InterfaceC42588iD3 m104315c2 = coordinator.m104315c2();
            if (m104315c2 != null) {
                m104315c2.invalidate();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(H83 h83) {
            m104291a(h83);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LH83;", "coordinator", "", C17296a.f69688o, "(LH83;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: H83$d */
    /* loaded from: classes.dex */
    public static final class C3036d extends Lambda implements Function1<H83, Unit> {

        /* renamed from: g */
        public static final C3036d f12912g = new C3036d();

        public C3036d() {
            super(1);
        }

        /* renamed from: a */
        public final void m104290a(H83 coordinator) {
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            if (coordinator.mo14142L()) {
                C43507jm2 c43507jm2 = coordinator.f12907w;
                if (c43507jm2 == null) {
                    coordinator.m104328S2();
                    return;
                }
                H83.f12888E.m29943a(c43507jm2);
                coordinator.m104328S2();
                if (!H83.f12888E.m29941c(c43507jm2)) {
                    C33829Jm2 mo84222r1 = coordinator.mo84222r1();
                    C34999Om2 m99796X = mo84222r1.m99796X();
                    if (m99796X.m91516m() > 0) {
                        if (m99796X.m91515n()) {
                            C33829Jm2.m99765l1(mo84222r1, false, 1, null);
                        }
                        m99796X.m91505x().m91474r1();
                    }
                    InterfaceC43181jD3 m99759o0 = mo84222r1.m99759o0();
                    if (m99759o0 != null) {
                        m99759o0.mo31011G(mo84222r1);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(H83 h83) {
            m104290a(h83);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010\tR#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m28432d2 = {"LH83$e;", "", "LH83$f;", "LrX3;", "PointerInputSource", "LH83$f;", C17296a.f69688o, "()LH83$f;", "getPointerInputSource$annotations", "()V", "Lgs5;", "SemanticsSource", "b", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/d;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/d;", "Lkotlin/Function1;", "LH83;", "", "onCommitAffectingLayer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayerParams", "Ljm2;", "tmpLayerPositionalProperties", "Ljm2;", "LhN2;", "tmpMatrix", "[F", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H83$e */
    /* loaded from: classes.dex */
    public static final class C3037e {
        public /* synthetic */ C3037e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC3038f<InterfaceC48105rX3> m104289a() {
            return H83.f12890G;
        }

        /* renamed from: b */
        public final InterfaceC3038f<InterfaceC41791gs5> m104288b() {
            return H83.f12891H;
        }

        private C3037e() {
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&JC\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH&ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m28432d2 = {"LH83$f;", "LvZ0;", "N", "", "LK83;", C17296a.f69688o, "()I", "node", "", DateTokenConverter.CONVERTER_KEY, "(LvZ0;)Z", "LJm2;", "parentLayoutNode", "c", "layoutNode", "LCe3;", "pointerPosition", "LRM1;", "hitTestResult", "isTouchEvent", "isInLayer", "", "b", "(LJm2;JLRM1;ZZ)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H83$f */
    /* loaded from: classes.dex */
    public interface InterfaceC3038f<N extends InterfaceC50490vZ0> {
        /* renamed from: a */
        int mo104287a();

        /* renamed from: b */
        void mo104286b(C33829Jm2 c33829Jm2, long j, RM1<N> rm1, boolean z, boolean z2);

        /* renamed from: c */
        boolean mo104285c(C33829Jm2 c33829Jm2);

        /* renamed from: d */
        boolean mo104284d(N n);
    }

    /* JADX WARN: Incorrect field signature: TT; */
    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LvZ0;", "T", "", "invoke", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n69#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hit$1\n*L\n615#1:1355\n*E\n"})
    /* renamed from: H83$g */
    /* loaded from: classes.dex */
    public static final class C3039g extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC50490vZ0 f12914h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC3038f<T> f12915i;

        /* renamed from: j */
        public final /* synthetic */ long f12916j;

        /* renamed from: k */
        public final /* synthetic */ RM1<T> f12917k;

        /* renamed from: l */
        public final /* synthetic */ boolean f12918l;

        /* renamed from: m */
        public final /* synthetic */ boolean f12919m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (LH83;TT;LH83$f<TT;>;JLRM1<TT;>;ZZ)V */
        public C3039g(InterfaceC50490vZ0 interfaceC50490vZ0, InterfaceC3038f interfaceC3038f, long j, RM1 rm1, boolean z, boolean z2) {
            super(0);
            this.f12914h = interfaceC50490vZ0;
            this.f12915i = interfaceC3038f;
            this.f12916j = j;
            this.f12917k = rm1;
            this.f12918l = z;
            this.f12919m = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            H83.this.m104304o2((InterfaceC50490vZ0) I83.m102915a(this.f12914h, this.f12915i.mo104287a(), K83.m99169a(2)), this.f12915i, this.f12916j, this.f12917k, this.f12918l, this.f12919m);
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LvZ0;", "T", "", "invoke", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hitNear$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n69#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hitNear$1\n*L\n642#1:1355\n*E\n"})
    /* renamed from: H83$h */
    /* loaded from: classes.dex */
    public static final class C3040h extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC50490vZ0 f12921h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC3038f<T> f12922i;

        /* renamed from: j */
        public final /* synthetic */ long f12923j;

        /* renamed from: k */
        public final /* synthetic */ RM1<T> f12924k;

        /* renamed from: l */
        public final /* synthetic */ boolean f12925l;

        /* renamed from: m */
        public final /* synthetic */ boolean f12926m;

        /* renamed from: n */
        public final /* synthetic */ float f12927n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (LH83;TT;LH83$f<TT;>;JLRM1<TT;>;ZZF)V */
        public C3040h(InterfaceC50490vZ0 interfaceC50490vZ0, InterfaceC3038f interfaceC3038f, long j, RM1 rm1, boolean z, boolean z2, float f) {
            super(0);
            this.f12921h = interfaceC50490vZ0;
            this.f12922i = interfaceC3038f;
            this.f12923j = j;
            this.f12924k = rm1;
            this.f12925l = z;
            this.f12926m = z2;
            this.f12927n = f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            H83.this.m104303p2((InterfaceC50490vZ0) I83.m102915a(this.f12921h, this.f12922i.mo104287a(), K83.m99169a(2)), this.f12922i, this.f12923j, this.f12924k, this.f12925l, this.f12926m, this.f12927n);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: H83$i */
    /* loaded from: classes.dex */
    public static final class C3041i extends Lambda implements Function0<Unit> {
        public C3041i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            H83 m104309j2 = H83.this.m104309j2();
            if (m104309j2 != null) {
                m104309j2.m104301s2();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: H83$j */
    /* loaded from: classes.dex */
    public static final class C3042j extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC45204me0 f12930h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3042j(InterfaceC45204me0 interfaceC45204me0) {
            super(0);
            this.f12930h = interfaceC45204me0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            H83.this.m104323V1(this.f12930h);
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LvZ0;", "T", "", "invoke", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n69#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n*L\n676#1:1355\n*E\n"})
    /* renamed from: H83$k */
    /* loaded from: classes.dex */
    public static final class C3043k extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC50490vZ0 f12932h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC3038f<T> f12933i;

        /* renamed from: j */
        public final /* synthetic */ long f12934j;

        /* renamed from: k */
        public final /* synthetic */ RM1<T> f12935k;

        /* renamed from: l */
        public final /* synthetic */ boolean f12936l;

        /* renamed from: m */
        public final /* synthetic */ boolean f12937m;

        /* renamed from: n */
        public final /* synthetic */ float f12938n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (LH83;TT;LH83$f<TT;>;JLRM1<TT;>;ZZF)V */
        public C3043k(InterfaceC50490vZ0 interfaceC50490vZ0, InterfaceC3038f interfaceC3038f, long j, RM1 rm1, boolean z, boolean z2, float f) {
            super(0);
            this.f12932h = interfaceC50490vZ0;
            this.f12933i = interfaceC3038f;
            this.f12934j = j;
            this.f12935k = rm1;
            this.f12936l = z;
            this.f12937m = z2;
            this.f12938n = f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            H83.this.m104337N2((InterfaceC50490vZ0) I83.m102915a(this.f12932h, this.f12933i.mo104287a(), K83.m99169a(2)), this.f12933i, this.f12934j, this.f12935k, this.f12936l, this.f12937m, this.f12938n);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: H83$l */
    /* loaded from: classes.dex */
    public static final class C3044l extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<InterfaceC11328c, Unit> f12939g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3044l(Function1<? super InterfaceC11328c, Unit> function1) {
            super(0);
            this.f12939g = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f12939g.invoke(H83.f12887D);
        }
    }

    public H83(C33829Jm2 layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f12892h = layoutNode;
        this.f12898n = mo84222r1().m99816N();
        this.f12899o = mo84222r1().getLayoutDirection();
        this.f12900p = 0.8f;
        this.f12904t = A52.f130b.m116106a();
        this.f12908x = new C3041i();
    }

    /* renamed from: H2 */
    public static /* synthetic */ void m104349H2(H83 h83, C52253yX2 c52253yX2, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        h83.m104351G2(c52253yX2, z, z2);
    }

    /* renamed from: y2 */
    public static /* synthetic */ void m104295y2(H83 h83, Function1 function1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLayerBlockUpdated");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        h83.m104296x2(function1, z);
    }

    /* renamed from: A2 */
    public final void m104362A2() {
        m104295y2(this, this.f12897m, false, 2, null);
    }

    /* renamed from: B2 */
    public void m104360B2(int i, int i2) {
        InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
        if (interfaceC42588iD3 != null) {
            interfaceC42588iD3.mo29667f(H52.m104430a(i, i2));
        } else {
            H83 h83 = this.f12894j;
            if (h83 != null) {
                h83.m104301s2();
            }
        }
        InterfaceC43181jD3 m99759o0 = mo84222r1().m99759o0();
        if (m99759o0 != null) {
            m99759o0.mo30984t(mo84222r1());
        }
        m92224l1(H52.m104430a(i, i2));
        f12887D.m68710A(H52.m104428c(m92228f1()));
        int m99169a = K83.m99169a(4);
        boolean m97661g = L83.m97661g(m99169a);
        InterfaceC41563gV2.AbstractC20914c mo94436h2 = mo94436h2();
        if (m97661g || (mo94436h2 = mo94436h2.m39256O()) != null) {
            for (InterfaceC41563gV2.AbstractC20914c m104306m2 = m104306m2(m97661g); m104306m2 != null && (m104306m2.m39262G() & m99169a) != 0; m104306m2 = m104306m2.m39261I()) {
                if ((m104306m2.m39258M() & m99169a) != 0 && (m104306m2 instanceof E61)) {
                    ((E61) m104306m2).mo29724p();
                }
                if (m104306m2 == mo94436h2) {
                    return;
                }
            }
        }
    }

    /* renamed from: C2 */
    public final void m104358C2() {
        InterfaceC41563gV2.AbstractC20914c m39256O;
        if (m104307l2(K83.m99169a(128))) {
            AbstractC48600sM5 m14281a = AbstractC48600sM5.f108670e.m14281a();
            try {
                AbstractC48600sM5 m14295k = m14281a.m14295k();
                int m99169a = K83.m99169a(128);
                boolean m97661g = L83.m97661g(m99169a);
                if (m97661g) {
                    m39256O = mo94436h2();
                } else {
                    m39256O = mo94436h2().m39256O();
                    if (m39256O == null) {
                        Unit unit = Unit.INSTANCE;
                        m14281a.m14288r(m14295k);
                    }
                }
                for (InterfaceC41563gV2.AbstractC20914c m104306m2 = m104306m2(m97661g); m104306m2 != null && (m104306m2.m39262G() & m99169a) != 0; m104306m2 = m104306m2.m39261I()) {
                    if ((m104306m2.m39258M() & m99169a) != 0 && (m104306m2 instanceof InterfaceC44100km2)) {
                        ((InterfaceC44100km2) m104306m2).mo28466A(m92228f1());
                    }
                    if (m104306m2 == m39256O) {
                        break;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                m14281a.m14288r(m14295k);
            } finally {
                m14281a.mo1848d();
            }
        }
    }

    /* renamed from: D2 */
    public final void m104356D2() {
        TC2 tc2 = this.f12902r;
        if (tc2 != null) {
            int m99169a = K83.m99169a(128);
            boolean m97661g = L83.m97661g(m99169a);
            InterfaceC41563gV2.AbstractC20914c mo94436h2 = mo94436h2();
            if (m97661g || (mo94436h2 = mo94436h2.m39256O()) != null) {
                for (InterfaceC41563gV2.AbstractC20914c m104306m2 = m104306m2(m97661g); m104306m2 != null && (m104306m2.m39262G() & m99169a) != 0; m104306m2 = m104306m2.m39261I()) {
                    if ((m104306m2.m39258M() & m99169a) != 0 && (m104306m2 instanceof InterfaceC44100km2)) {
                        ((InterfaceC44100km2) m104306m2).mo28465D(tc2.m84230H1());
                    }
                    if (m104306m2 == mo94436h2) {
                        break;
                    }
                }
            }
        }
        int m99169a2 = K83.m99169a(128);
        boolean m97661g2 = L83.m97661g(m99169a2);
        InterfaceC41563gV2.AbstractC20914c mo94436h22 = mo94436h2();
        if (m97661g2 || (mo94436h22 = mo94436h22.m39256O()) != null) {
            for (InterfaceC41563gV2.AbstractC20914c m104306m22 = m104306m2(m97661g2); m104306m22 != null && (m104306m22.m39262G() & m99169a2) != 0; m104306m22 = m104306m22.m39261I()) {
                if ((m104306m22.m39258M() & m99169a2) != 0 && (m104306m22 instanceof InterfaceC44100km2)) {
                    ((InterfaceC44100km2) m104306m22).mo28464t(this);
                }
                if (m104306m22 == mo94436h22) {
                    return;
                }
            }
        }
    }

    /* renamed from: E2 */
    public final void m104354E2() {
        this.f12895k = true;
        if (this.f12910z != null) {
            m104295y2(this, null, false, 2, null);
        }
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: F */
    public boolean mo23189F() {
        return !this.f12895k && mo84222r1().m99822J0();
    }

    /* renamed from: F2 */
    public void mo94438F2(InterfaceC45204me0 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        H83 h83 = this.f12893i;
        if (h83 != null) {
            h83.m104327T1(canvas);
        }
    }

    /* renamed from: G2 */
    public final void m104351G2(C52253yX2 bounds, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
        if (interfaceC42588iD3 != null) {
            if (this.f12896l) {
                if (z2) {
                    long m104313e2 = m104313e2();
                    float m5730i = C51465xB5.m5730i(m104313e2) / 2.0f;
                    float m5732g = C51465xB5.m5732g(m104313e2) / 2.0f;
                    bounds.m3368e(-m5730i, -m5732g, G52.m105829g(mo23186a()) + m5730i, G52.m105830f(mo23186a()) + m5732g);
                } else if (z) {
                    bounds.m3368e(0.0f, 0.0f, G52.m105829g(mo23186a()), G52.m105830f(mo23186a()));
                }
                if (bounds.m3367f()) {
                    return;
                }
            }
            interfaceC42588iD3.mo29672a(bounds, false);
        }
        float m116111j = A52.m116111j(mo84219u1());
        bounds.m3364i(bounds.m3371b() + m116111j);
        bounds.m3363j(bounds.m3370c() + m116111j);
        float m116110k = A52.m116110k(mo84219u1());
        bounds.m3362k(bounds.m3369d() + m116110k);
        bounds.m3365h(bounds.m3372a() + m116110k);
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: H */
    public long mo23188H(long j) {
        if (mo23189F()) {
            InterfaceC45879nm2 m20517d = C46472om2.m20517d(this);
            return mo23187X(m20517d, C32120Ce3.m111940s(C34765Nm2.m93440a(mo84222r1()).mo30981w(j), C46472om2.m20516e(m20517d)));
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: I2 */
    public void m104347I2(InterfaceC52172yO2 value) {
        boolean z;
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC52172yO2 interfaceC52172yO2 = this.f12901q;
        if (value != interfaceC52172yO2) {
            this.f12901q = value;
            if (interfaceC52172yO2 == null || value.getWidth() != interfaceC52172yO2.getWidth() || value.getHeight() != interfaceC52172yO2.getHeight()) {
                m104360B2(value.getWidth(), value.getHeight());
            }
            Map<AbstractC4750L9, Integer> map = this.f12903s;
            if (map != null && !map.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if ((!z || (!value.mo1428d().isEmpty())) && !Intrinsics.areEqual(value.mo1428d(), this.f12903s)) {
                m104318Z1().mo88870d().m90689m();
                Map map2 = this.f12903s;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f12903s = map2;
                }
                map2.clear();
                map2.putAll(value.mo1428d());
            }
        }
    }

    /* renamed from: J2 */
    public void m104345J2(long j) {
        this.f12904t = j;
    }

    /* renamed from: K2 */
    public final void m104343K2(H83 h83) {
        this.f12893i = h83;
    }

    @Override // p000.InterfaceC44367lD3
    /* renamed from: L */
    public boolean mo14142L() {
        return this.f12910z != null && mo23189F();
    }

    /* renamed from: L2 */
    public final void m104341L2(H83 h83) {
        this.f12894j = h83;
    }

    /* renamed from: M2 */
    public final boolean m104339M2() {
        InterfaceC41563gV2.AbstractC20914c m104306m2 = m104306m2(L83.m97661g(K83.m99169a(16)));
        if (m104306m2 == null) {
            return false;
        }
        int m99169a = K83.m99169a(16);
        if (m104306m2.mo8445r().m39254Q()) {
            InterfaceC41563gV2.AbstractC20914c mo8445r = m104306m2.mo8445r();
            if ((mo8445r.m39262G() & m99169a) != 0) {
                for (InterfaceC41563gV2.AbstractC20914c m39261I = mo8445r.m39261I(); m39261I != null; m39261I = m39261I.m39261I()) {
                    if ((m39261I.m39258M() & m99169a) != 0 && (m39261I instanceof InterfaceC48105rX3) && ((InterfaceC48105rX3) m39261I).mo15815x()) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N2 */
    public final <T extends InterfaceC50490vZ0> void m104337N2(T t, InterfaceC3038f<T> interfaceC3038f, long j, RM1<T> rm1, boolean z, boolean z2, float f) {
        if (t == null) {
            mo94435r2(interfaceC3038f, j, rm1, z, z2);
        } else if (interfaceC3038f.mo104284d(t)) {
            rm1.m86812x(t, f, z2, new C3043k(t, interfaceC3038f, j, rm1, z, z2, f));
        } else {
            m104337N2((InterfaceC50490vZ0) I83.m102915a(t, interfaceC3038f.mo104287a(), K83.m99169a(2)), interfaceC3038f, j, rm1, z, z2, f);
        }
    }

    /* renamed from: O1 */
    public final void m104336O1(H83 h83, C52253yX2 c52253yX2, boolean z) {
        if (h83 == this) {
            return;
        }
        H83 h832 = this.f12894j;
        if (h832 != null) {
            h832.m104336O1(h83, c52253yX2, z);
        }
        m104319Y1(c52253yX2, z);
    }

    /* renamed from: O2 */
    public final H83 m104335O2(InterfaceC45879nm2 interfaceC45879nm2) {
        H83 m80235b;
        VC2 vc2 = interfaceC45879nm2 instanceof VC2 ? (VC2) interfaceC45879nm2 : null;
        if (vc2 == null || (m80235b = vc2.m80235b()) == null) {
            Intrinsics.checkNotNull(interfaceC45879nm2, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return (H83) interfaceC45879nm2;
        }
        return m80235b;
    }

    /* renamed from: P1 */
    public final long m104334P1(H83 h83, long j) {
        if (h83 == this) {
            return j;
        }
        H83 h832 = this.f12894j;
        if (h832 != null && !Intrinsics.areEqual(h83, h832)) {
            return m104320X1(h832.m104334P1(h83, j));
        }
        return m104320X1(j);
    }

    /* renamed from: P2 */
    public long m104333P2(long j) {
        InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
        if (interfaceC42588iD3 != null) {
            j = interfaceC42588iD3.mo29668e(j, false);
        }
        return B52.m114702c(j, mo84219u1());
    }

    /* renamed from: Q1 */
    public final long m104332Q1(long j) {
        return CB5.m112663a(Math.max(0.0f, (C51465xB5.m5730i(j) - mo91479g1()) / 2.0f), Math.max(0.0f, (C51465xB5.m5732g(j) - mo91480e1()) / 2.0f));
    }

    /* renamed from: Q2 */
    public final C35055Os4 m104331Q2() {
        if (!mo23189F()) {
            return C35055Os4.f27481e.m91247a();
        }
        InterfaceC45879nm2 m20517d = C46472om2.m20517d(this);
        C52253yX2 m104312f2 = m104312f2();
        long m104332Q1 = m104332Q1(m104313e2());
        m104312f2.m3364i(-C51465xB5.m5730i(m104332Q1));
        m104312f2.m3362k(-C51465xB5.m5732g(m104332Q1));
        m104312f2.m3363j(mo91479g1() + C51465xB5.m5730i(m104332Q1));
        m104312f2.m3365h(mo91480e1() + C51465xB5.m5732g(m104332Q1));
        H83 h83 = this;
        while (h83 != m20517d) {
            h83.m104351G2(m104312f2, false, true);
            if (m104312f2.m3367f()) {
                return C35055Os4.f27481e.m91247a();
            }
            h83 = h83.f12894j;
            Intrinsics.checkNotNull(h83);
        }
        return C52846zX2.m1246a(m104312f2);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: R0 */
    public float mo3412R0() {
        return mo84222r1().m99816N().mo3412R0();
    }

    /* renamed from: R1 */
    public abstract TC2 mo94437R1(XC2 xc2);

    /* renamed from: R2 */
    public final void m104330R2(Function1<? super InterfaceC11328c, Unit> function1, boolean z) {
        boolean z2;
        if (this.f12897m == function1 && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f12897m = function1;
        m104296x2(function1, z2);
    }

    /* renamed from: S1 */
    public final float m104329S1(long j, long j2) {
        if (mo91479g1() >= C51465xB5.m5730i(j2) && mo91480e1() >= C51465xB5.m5732g(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long m104332Q1 = m104332Q1(j2);
        float m5730i = C51465xB5.m5730i(m104332Q1);
        float m5732g = C51465xB5.m5732g(m104332Q1);
        long m104297w2 = m104297w2(j);
        if ((m5730i <= 0.0f && m5732g <= 0.0f) || C32120Ce3.m111944o(m104297w2) > m5730i || C32120Ce3.m111943p(m104297w2) > m5732g) {
            return Float.POSITIVE_INFINITY;
        }
        return C32120Ce3.m111945n(m104297w2);
    }

    /* renamed from: S2 */
    public final void m104328S2() {
        boolean z;
        InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
        if (interfaceC42588iD3 != null) {
            Function1<? super InterfaceC11328c, Unit> function1 = this.f12897m;
            if (function1 != null) {
                C11329d c11329d = f12887D;
                c11329d.m68677v();
                c11329d.m68675y(mo84222r1().m99816N());
                c11329d.m68710A(H52.m104428c(mo23186a()));
                m104311g2().m26010h(this, f12885B, new C3044l(function1));
                C43507jm2 c43507jm2 = this.f12907w;
                if (c43507jm2 == null) {
                    c43507jm2 = new C43507jm2();
                    this.f12907w = c43507jm2;
                }
                c43507jm2.m29942b(c11329d);
                interfaceC42588iD3.mo29669d(c11329d.mo68703L0(), c11329d.mo68696Z0(), c11329d.m68695c(), c11329d.mo68689h0(), c11329d.mo68694c0(), c11329d.m68684n(), c11329d.mo68697X0(), c11329d.mo68676w0(), c11329d.mo68674y0(), c11329d.mo68702N(), c11329d.mo68707D0(), c11329d.m68683o(), c11329d.m68692e(), c11329d.m68688i(), c11329d.m68693d(), c11329d.m68679t(), c11329d.m68691f(), mo84222r1().getLayoutDirection(), mo84222r1().m99816N());
                this.f12896l = c11329d.m68692e();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            if (this.f12897m == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.f12900p = f12887D.m68695c();
        InterfaceC43181jD3 m99759o0 = mo84222r1().m99759o0();
        if (m99759o0 != null) {
            m99759o0.mo30984t(mo84222r1());
        }
    }

    /* renamed from: T1 */
    public final void m104327T1(InterfaceC45204me0 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
        if (interfaceC42588iD3 != null) {
            interfaceC42588iD3.mo29670c(canvas);
            return;
        }
        float m116111j = A52.m116111j(mo84219u1());
        float m116110k = A52.m116110k(mo84219u1());
        canvas.mo25265b(m116111j, m116110k);
        m104323V1(canvas);
        canvas.mo25265b(-m116111j, -m116110k);
    }

    /* renamed from: T2 */
    public final void m104326T2(TC2 lookaheadDelegate) {
        Intrinsics.checkNotNullParameter(lookaheadDelegate, "lookaheadDelegate");
        this.f12902r = lookaheadDelegate;
    }

    /* renamed from: U1 */
    public final void m104325U1(InterfaceC45204me0 canvas, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.m25248s(new C35055Os4(0.5f, 0.5f, G52.m105829g(m92228f1()) - 0.5f, G52.m105830f(m92228f1()) - 0.5f), paint);
    }

    /* renamed from: U2 */
    public final void m104324U2(XC2 xc2) {
        TC2 tc2;
        TC2 tc22 = null;
        XC2 xc22 = null;
        if (xc2 != null) {
            TC2 tc23 = this.f12902r;
            if (tc23 != null) {
                xc22 = tc23.m84229I1();
            }
            if (!Intrinsics.areEqual(xc2, xc22)) {
                tc2 = mo94437R1(xc2);
            } else {
                tc2 = this.f12902r;
            }
            tc22 = tc2;
        }
        this.f12902r = tc22;
    }

    /* renamed from: V1 */
    public final void m104323V1(InterfaceC45204me0 interfaceC45204me0) {
        int m99169a = K83.m99169a(4);
        boolean m97661g = L83.m97661g(m99169a);
        E61 e61 = null;
        InterfaceC41563gV2.AbstractC20914c mo94436h2 = mo94436h2();
        if (m97661g || (mo94436h2 = mo94436h2.m39256O()) != null) {
            InterfaceC41563gV2.AbstractC20914c m104306m2 = m104306m2(m97661g);
            while (true) {
                if (m104306m2 != null && (m104306m2.m39262G() & m99169a) != 0) {
                    if ((m104306m2.m39258M() & m99169a) != 0) {
                        if (m104306m2 instanceof E61) {
                            e61 = m104306m2;
                        }
                        e61 = e61;
                    } else if (m104306m2 == mo94436h2) {
                        break;
                    } else {
                        m104306m2 = m104306m2.m39261I();
                    }
                } else {
                    break;
                }
            }
        }
        E61 e612 = e61;
        if (e612 == null) {
            mo94438F2(interfaceC45204me0);
        } else {
            mo84222r1().m99783d0().m96362c(interfaceC45204me0, H52.m104428c(mo23186a()), this, e612);
        }
    }

    /* renamed from: V2 */
    public final boolean m104322V2(long j) {
        if (!C33056Ge3.m104937b(j)) {
            return false;
        }
        InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
        if (interfaceC42588iD3 != null && this.f12896l && !interfaceC42588iD3.mo29666g(j)) {
            return false;
        }
        return true;
    }

    /* renamed from: W1 */
    public final H83 m104321W1(H83 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        C33829Jm2 mo84222r1 = other.mo84222r1();
        C33829Jm2 mo84222r12 = mo84222r1();
        if (mo84222r1 == mo84222r12) {
            InterfaceC41563gV2.AbstractC20914c mo94436h2 = other.mo94436h2();
            InterfaceC41563gV2.AbstractC20914c mo94436h22 = mo94436h2();
            int m99169a = K83.m99169a(2);
            if (mo94436h22.mo8445r().m39254Q()) {
                for (InterfaceC41563gV2.AbstractC20914c m39256O = mo94436h22.mo8445r().m39256O(); m39256O != null; m39256O = m39256O.m39256O()) {
                    if ((m39256O.m39258M() & m99169a) != 0 && m39256O == mo94436h2) {
                        return other;
                    }
                }
                return this;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        while (mo84222r1.m99814O() > mo84222r12.m99814O()) {
            mo84222r1 = mo84222r1.m99756p0();
            Intrinsics.checkNotNull(mo84222r1);
        }
        while (mo84222r12.m99814O() > mo84222r1.m99814O()) {
            mo84222r12 = mo84222r12.m99756p0();
            Intrinsics.checkNotNull(mo84222r12);
        }
        while (mo84222r1 != mo84222r12) {
            mo84222r1 = mo84222r1.m99756p0();
            mo84222r12 = mo84222r12.m99756p0();
            if (mo84222r1 != null) {
                if (mo84222r12 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        if (mo84222r12 == mo84222r1()) {
            return this;
        }
        if (mo84222r1 != other.mo84222r1()) {
            return mo84222r1.m99806S();
        }
        return other;
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: X */
    public long mo23187X(InterfaceC45879nm2 sourceCoordinates, long j) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        H83 m104335O2 = m104335O2(sourceCoordinates);
        H83 m104321W1 = m104321W1(m104335O2);
        while (m104335O2 != m104321W1) {
            j = m104335O2.m104333P2(j);
            m104335O2 = m104335O2.f12894j;
            Intrinsics.checkNotNull(m104335O2);
        }
        return m104334P1(m104321W1, j);
    }

    /* renamed from: X1 */
    public long m104320X1(long j) {
        long m114703b = B52.m114703b(j, mo84219u1());
        InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
        if (interfaceC42588iD3 != null) {
            return interfaceC42588iD3.mo29668e(m114703b, true);
        }
        return m114703b;
    }

    /* renamed from: Y1 */
    public final void m104319Y1(C52253yX2 c52253yX2, boolean z) {
        float m116111j = A52.m116111j(mo84219u1());
        c52253yX2.m3364i(c52253yX2.m3371b() - m116111j);
        c52253yX2.m3363j(c52253yX2.m3370c() - m116111j);
        float m116110k = A52.m116110k(mo84219u1());
        c52253yX2.m3362k(c52253yX2.m3369d() - m116110k);
        c52253yX2.m3365h(c52253yX2.m3372a() - m116110k);
        InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
        if (interfaceC42588iD3 != null) {
            interfaceC42588iD3.mo29672a(c52253yX2, true);
            if (this.f12896l && z) {
                c52253yX2.m3368e(0.0f, 0.0f, G52.m105829g(mo23186a()), G52.m105830f(mo23186a()));
                c52253yX2.m3367f();
            }
        }
    }

    /* renamed from: Z1 */
    public InterfaceC6687Q9 m104318Z1() {
        return mo84222r1().m99796X().m91517l();
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: a */
    public final long mo23186a() {
        return m92228f1();
    }

    /* renamed from: a2 */
    public final boolean m104317a2() {
        return this.f12909y;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: b */
    public float mo3408b() {
        return mo84222r1().m99816N().mo3408b();
    }

    /* renamed from: b2 */
    public final long m104316b2() {
        return m92227h1();
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Object] */
    @Override // p000.AO2, p000.X62
    /* renamed from: c */
    public Object mo77401c() {
        boolean z;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        InterfaceC41563gV2.AbstractC20914c mo94436h2 = mo94436h2();
        if (mo84222r1().m99764m0().m107672q(K83.m99169a(64))) {
            InterfaceC41273g01 m99816N = mo84222r1().m99816N();
            for (InterfaceC41563gV2.AbstractC20914c m107674o = mo84222r1().m99764m0().m107674o(); m107674o != null; m107674o = m107674o.m39256O()) {
                if (m107674o != mo94436h2) {
                    if ((K83.m99169a(64) & m107674o.m39258M()) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (m107674o instanceof TE3)) {
                        objectRef.element = ((TE3) m107674o).mo15408B(m99816N, objectRef.element);
                    }
                }
            }
        }
        return objectRef.element;
    }

    /* renamed from: c2 */
    public final InterfaceC42588iD3 m104315c2() {
        return this.f12910z;
    }

    /* renamed from: d2 */
    public final TC2 m104314d2() {
        return this.f12902r;
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: e */
    public C35055Os4 mo23185e(InterfaceC45879nm2 sourceCoordinates, boolean z) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (mo23189F()) {
            if (sourceCoordinates.mo23189F()) {
                H83 m104335O2 = m104335O2(sourceCoordinates);
                H83 m104321W1 = m104321W1(m104335O2);
                C52253yX2 m104312f2 = m104312f2();
                m104312f2.m3364i(0.0f);
                m104312f2.m3362k(0.0f);
                m104312f2.m3363j(G52.m105829g(sourceCoordinates.mo23186a()));
                m104312f2.m3365h(G52.m105830f(sourceCoordinates.mo23186a()));
                while (m104335O2 != m104321W1) {
                    m104349H2(m104335O2, m104312f2, z, false, 4, null);
                    if (m104312f2.m3367f()) {
                        return C35055Os4.f27481e.m91247a();
                    }
                    m104335O2 = m104335O2.f12894j;
                    Intrinsics.checkNotNull(m104335O2);
                }
                m104336O1(m104321W1, m104312f2, z);
                return C52846zX2.m1246a(m104312f2);
            }
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: e2 */
    public final long m104313e2() {
        return this.f12898n.mo3395z(mo84222r1().m99744t0().mo99626e());
    }

    /* renamed from: f2 */
    public final C52253yX2 m104312f2() {
        C52253yX2 c52253yX2 = this.f12906v;
        if (c52253yX2 == null) {
            C52253yX2 c52253yX22 = new C52253yX2(0.0f, 0.0f, 0.0f, 0.0f);
            this.f12906v = c52253yX22;
            return c52253yX22;
        }
        return c52253yX2;
    }

    /* renamed from: g2 */
    public final C44960mD3 m104311g2() {
        return C34765Nm2.m93440a(mo84222r1()).mo30989l();
    }

    @Override // p000.Z62
    public EnumC47065pm2 getLayoutDirection() {
        return mo84222r1().getLayoutDirection();
    }

    /* renamed from: h2 */
    public abstract InterfaceC41563gV2.AbstractC20914c mo94436h2();

    @Override // p000.InterfaceC45879nm2
    /* renamed from: i */
    public long mo23183i(long j) {
        return C34765Nm2.m93440a(mo84222r1()).mo31014C(mo23181y(j));
    }

    /* renamed from: i2 */
    public final H83 m104310i2() {
        return this.f12893i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC45204me0 interfaceC45204me0) {
        m104300t2(interfaceC45204me0);
        return Unit.INSTANCE;
    }

    @Override // p000.OU3
    /* renamed from: j1 */
    public void mo35855j1(long j, float f, Function1<? super InterfaceC11328c, Unit> function1) {
        m104295y2(this, function1, false, 2, null);
        if (!A52.m116112i(mo84219u1(), j)) {
            m104345J2(j);
            mo84222r1().m99796X().m91505x().m91474r1();
            InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
            if (interfaceC42588iD3 != null) {
                interfaceC42588iD3.mo29665h(j);
            } else {
                H83 h83 = this.f12894j;
                if (h83 != null) {
                    h83.m104301s2();
                }
            }
            m85845v1(this);
            InterfaceC43181jD3 m99759o0 = mo84222r1().m99759o0();
            if (m99759o0 != null) {
                m99759o0.mo30984t(mo84222r1());
            }
        }
        this.f12905u = f;
    }

    /* renamed from: j2 */
    public final H83 m104309j2() {
        return this.f12894j;
    }

    /* renamed from: k2 */
    public final float m104308k2() {
        return this.f12905u;
    }

    /* renamed from: l2 */
    public final boolean m104307l2(int i) {
        InterfaceC41563gV2.AbstractC20914c m104306m2 = m104306m2(L83.m97661g(i));
        return m104306m2 != null && C51083wZ0.m6665d(m104306m2, i);
    }

    /* renamed from: m2 */
    public final InterfaceC41563gV2.AbstractC20914c m104306m2(boolean z) {
        InterfaceC41563gV2.AbstractC20914c mo94436h2;
        if (mo84222r1().m99762n0() == this) {
            return mo84222r1().m99764m0().m107677l();
        }
        if (z) {
            H83 h83 = this.f12894j;
            if (h83 != null && (mo94436h2 = h83.mo94436h2()) != null) {
                return mo94436h2.m39261I();
            }
        } else {
            H83 h832 = this.f12894j;
            if (h832 != null) {
                return h832.mo94436h2();
            }
        }
        return null;
    }

    /* renamed from: n2 */
    public final <T> T m104305n2(int i) {
        boolean m97661g = L83.m97661g(i);
        InterfaceC41563gV2.AbstractC20914c mo94436h2 = mo94436h2();
        if (m97661g || (mo94436h2 = mo94436h2.m39256O()) != null) {
            for (T t = (T) m104306m2(m97661g); t != null && (((InterfaceC41563gV2.AbstractC20914c) t).m39262G() & i) != 0; t = (T) ((InterfaceC41563gV2.AbstractC20914c) t).m39261I()) {
                if ((((InterfaceC41563gV2.AbstractC20914c) t).m39258M() & i) != 0) {
                    return t;
                }
                if (t == mo94436h2) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // p000.SC2
    /* renamed from: o1 */
    public SC2 mo84225o1() {
        return this.f12893i;
    }

    /* renamed from: o2 */
    public final <T extends InterfaceC50490vZ0> void m104304o2(T t, InterfaceC3038f<T> interfaceC3038f, long j, RM1<T> rm1, boolean z, boolean z2) {
        if (t == null) {
            mo94435r2(interfaceC3038f, j, rm1, z, z2);
        } else {
            rm1.m86816s(t, z2, new C3039g(t, interfaceC3038f, j, rm1, z, z2));
        }
    }

    @Override // p000.SC2
    /* renamed from: p1 */
    public InterfaceC45879nm2 mo84224p1() {
        return this;
    }

    /* renamed from: p2 */
    public final <T extends InterfaceC50490vZ0> void m104303p2(T t, InterfaceC3038f<T> interfaceC3038f, long j, RM1<T> rm1, boolean z, boolean z2, float f) {
        if (t == null) {
            mo94435r2(interfaceC3038f, j, rm1, z, z2);
        } else {
            rm1.m86815u(t, f, z2, new C3040h(t, interfaceC3038f, j, rm1, z, z2, f));
        }
    }

    @Override // p000.SC2
    /* renamed from: q1 */
    public boolean mo84223q1() {
        return this.f12901q != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q2 */
    public final <T extends InterfaceC50490vZ0> void m104302q2(InterfaceC3038f<T> hitTestSource, long j, RM1<T> hitTestResult, boolean z, boolean z2) {
        float m104329S1;
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        InterfaceC50490vZ0 interfaceC50490vZ0 = (InterfaceC50490vZ0) m104305n2(hitTestSource.mo104287a());
        boolean z3 = true;
        if (!m104322V2(j)) {
            if (z) {
                float m104329S12 = m104329S1(j, m104313e2());
                if (Float.isInfinite(m104329S12) || Float.isNaN(m104329S12)) {
                    z3 = false;
                }
                if (z3 && hitTestResult.m86814v(m104329S12, false)) {
                    m104303p2(interfaceC50490vZ0, hitTestSource, j, hitTestResult, z, false, m104329S12);
                }
            }
        } else if (interfaceC50490vZ0 == null) {
            mo94435r2(hitTestSource, j, hitTestResult, z, z2);
        } else if (m104299u2(j)) {
            m104304o2(interfaceC50490vZ0, hitTestSource, j, hitTestResult, z, z2);
        } else {
            if (!z) {
                m104329S1 = Float.POSITIVE_INFINITY;
            } else {
                m104329S1 = m104329S1(j, m104313e2());
            }
            float f = m104329S1;
            if (Float.isInfinite(f) || Float.isNaN(f)) {
                z3 = false;
            }
            if (z3 && hitTestResult.m86814v(f, z2)) {
                m104303p2(interfaceC50490vZ0, hitTestSource, j, hitTestResult, z, z2, f);
            } else {
                m104337N2(interfaceC50490vZ0, hitTestSource, j, hitTestResult, z, z2, f);
            }
        }
    }

    @Override // p000.SC2
    /* renamed from: r1 */
    public C33829Jm2 mo84222r1() {
        return this.f12892h;
    }

    /* renamed from: r2 */
    public <T extends InterfaceC50490vZ0> void mo94435r2(InterfaceC3038f<T> hitTestSource, long j, RM1<T> hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        H83 h83 = this.f12893i;
        if (h83 != null) {
            h83.m104302q2(hitTestSource, h83.m104320X1(j), hitTestResult, z, z2);
        }
    }

    @Override // p000.SC2
    /* renamed from: s1 */
    public InterfaceC52172yO2 mo84221s1() {
        InterfaceC52172yO2 interfaceC52172yO2 = this.f12901q;
        if (interfaceC52172yO2 != null) {
            return interfaceC52172yO2;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    /* renamed from: s2 */
    public void m104301s2() {
        InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
        if (interfaceC42588iD3 != null) {
            interfaceC42588iD3.invalidate();
            return;
        }
        H83 h83 = this.f12894j;
        if (h83 != null) {
            h83.m104301s2();
        }
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: t */
    public final InterfaceC45879nm2 mo23182t() {
        if (mo23189F()) {
            return mo84222r1().m99762n0().f12894j;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // p000.SC2
    /* renamed from: t1 */
    public SC2 mo84220t1() {
        return this.f12894j;
    }

    /* renamed from: t2 */
    public void m104300t2(InterfaceC45204me0 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (mo84222r1().mo8156n()) {
            m104311g2().m26010h(this, f12886C, new C3042j(canvas));
            this.f12909y = false;
            return;
        }
        this.f12909y = true;
    }

    @Override // p000.SC2
    /* renamed from: u1 */
    public long mo84219u1() {
        return this.f12904t;
    }

    /* renamed from: u2 */
    public final boolean m104299u2(long j) {
        float m111944o = C32120Ce3.m111944o(j);
        float m111943p = C32120Ce3.m111943p(j);
        if (m111944o >= 0.0f && m111943p >= 0.0f && m111944o < mo91479g1() && m111943p < mo91480e1()) {
            return true;
        }
        return false;
    }

    /* renamed from: v2 */
    public final boolean m104298v2() {
        if (this.f12910z != null && this.f12900p <= 0.0f) {
            return true;
        }
        H83 h83 = this.f12894j;
        if (h83 != null) {
            return h83.m104298v2();
        }
        return false;
    }

    /* renamed from: w2 */
    public final long m104297w2(long j) {
        float mo91479g1;
        float mo91480e1;
        float m111944o = C32120Ce3.m111944o(j);
        if (m111944o < 0.0f) {
            mo91479g1 = -m111944o;
        } else {
            mo91479g1 = m111944o - mo91479g1();
        }
        float max = Math.max(0.0f, mo91479g1);
        float m111943p = C32120Ce3.m111943p(j);
        if (m111943p < 0.0f) {
            mo91480e1 = -m111943p;
        } else {
            mo91480e1 = m111943p - mo91480e1();
        }
        return C33056Ge3.m104938a(max, Math.max(0.0f, mo91480e1));
    }

    /* renamed from: x2 */
    public final void m104296x2(Function1<? super InterfaceC11328c, Unit> function1, boolean z) {
        boolean z2;
        InterfaceC43181jD3 m99759o0;
        if (this.f12897m == function1 && Intrinsics.areEqual(this.f12898n, mo84222r1().m99816N()) && this.f12899o == mo84222r1().getLayoutDirection() && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f12897m = function1;
        this.f12898n = mo84222r1().m99816N();
        this.f12899o = mo84222r1().getLayoutDirection();
        if (mo23189F() && function1 != null) {
            if (this.f12910z == null) {
                InterfaceC42588iD3 mo30980x = C34765Nm2.m93440a(mo84222r1()).mo30980x(this, this.f12908x);
                mo30980x.mo29667f(m92228f1());
                mo30980x.mo29665h(mo84219u1());
                this.f12910z = mo30980x;
                m104328S2();
                mo84222r1().m99746s1(true);
                this.f12908x.invoke();
                return;
            } else if (z2) {
                m104328S2();
                return;
            } else {
                return;
            }
        }
        InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
        if (interfaceC42588iD3 != null) {
            interfaceC42588iD3.destroy();
            mo84222r1().m99746s1(true);
            this.f12908x.invoke();
            if (mo23189F() && (m99759o0 = mo84222r1().m99759o0()) != null) {
                m99759o0.mo30984t(mo84222r1());
            }
        }
        this.f12910z = null;
        this.f12909y = false;
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: y */
    public long mo23181y(long j) {
        if (mo23189F()) {
            for (H83 h83 = this; h83 != null; h83 = h83.f12894j) {
                j = h83.m104333P2(j);
            }
            return j;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // p000.SC2
    /* renamed from: y1 */
    public void mo84218y1() {
        mo35855j1(mo84219u1(), this.f12905u, this.f12897m);
    }

    /* renamed from: z2 */
    public void mo104294z2() {
        InterfaceC42588iD3 interfaceC42588iD3 = this.f12910z;
        if (interfaceC42588iD3 != null) {
            interfaceC42588iD3.invalidate();
        }
    }
}
