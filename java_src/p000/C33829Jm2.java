package p000;

import androidx.compose.p003ui.focus.FocusTargetModifierNode;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.C34999Om2;
import p000.InterfaceC41563gV2;
import p000.InterfaceC43181jD3;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u007f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0004ilp[B\u001d\u0012\b\b\u0002\u0010c\u001a\u00020<\u0012\b\b\u0002\u0010h\u001a\u00020\r¢\u0006\u0006\bÉ\u0002\u0010Ê\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002J\u000f\u0010\u0018\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001e\u0010\u0019J\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0000¢\u0006\u0004\b\"\u0010\u0019J'\u0010%\u001a\u00020\b2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0000¢\u0006\u0004\b+\u0010\u0019J\b\u0010,\u001a\u00020\u000fH\u0016J\u000f\u0010-\u001a\u00020\bH\u0000¢\u0006\u0004\b-\u0010\u0019J\u000f\u0010.\u001a\u00020\bH\u0000¢\u0006\u0004\b.\u0010\u0019J\u001f\u00100\u001a\u00020\b2\u0006\u0010)\u001a\u00020\r2\u0006\u0010/\u001a\u00020\rH\u0000¢\u0006\u0004\b0\u0010!J\u000f\u00101\u001a\u00020\bH\u0000¢\u0006\u0004\b1\u0010\u0019J\u000f\u00102\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u0010\u0019J\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b5\u00106J?\u0010?\u001a\u00020\b2\u0006\u00108\u001a\u0002072\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:092\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020<H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@J?\u0010C\u001a\u00020\b2\u0006\u00108\u001a\u0002072\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A092\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020<H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010@J\u000f\u0010D\u001a\u00020\bH\u0000¢\u0006\u0004\bD\u0010\u0019J\u000f\u0010E\u001a\u00020\bH\u0000¢\u0006\u0004\bE\u0010\u0019J\u000f\u0010/\u001a\u00020\bH\u0000¢\u0006\u0004\b/\u0010\u0019J\u0017\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u0000H\u0000¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020\b2\b\b\u0002\u0010I\u001a\u00020<H\u0000¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u00020\b2\b\b\u0002\u0010I\u001a\u00020<H\u0000¢\u0006\u0004\bL\u0010KJ\u000f\u0010M\u001a\u00020\bH\u0000¢\u0006\u0004\bM\u0010\u0019J\u0019\u0010N\u001a\u00020\b2\b\b\u0002\u0010I\u001a\u00020<H\u0000¢\u0006\u0004\bN\u0010KJ\u0019\u0010O\u001a\u00020\b2\b\b\u0002\u0010I\u001a\u00020<H\u0000¢\u0006\u0004\bO\u0010KJ\u000f\u0010P\u001a\u00020\bH\u0000¢\u0006\u0004\bP\u0010\u0019J\u000f\u0010Q\u001a\u00020\bH\u0000¢\u0006\u0004\bQ\u0010\u0019J!\u0010T\u001a\u00020<2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010RH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJ!\u0010V\u001a\u00020<2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010RH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010UJ\u000f\u0010W\u001a\u00020\bH\u0000¢\u0006\u0004\bW\u0010\u0019J\u000f\u0010X\u001a\u00020\bH\u0000¢\u0006\u0004\bX\u0010\u0019J\u000f\u0010Y\u001a\u00020\bH\u0000¢\u0006\u0004\bY\u0010\u0019J\u000f\u0010Z\u001a\u00020\bH\u0000¢\u0006\u0004\bZ\u0010\u0019J\b\u0010[\u001a\u00020\bH\u0016J\b\u0010\\\u001a\u00020\bH\u0016J\u000f\u0010]\u001a\u00020\bH\u0000¢\u0006\u0004\b]\u0010\u0019J\u000f\u0010^\u001a\u00020\bH\u0000¢\u0006\u0004\b^\u0010\u0019J\b\u0010_\u001a\u00020\bH\u0016J\b\u0010`\u001a\u00020\bH\u0016J\b\u0010a\u001a\u00020\bH\u0016R\u0014\u0010c\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010h\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010eR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00000k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010s\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010bR\u0018\u0010v\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010w\u001a\u0004\u0018\u00010'8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R.\u0010\u0083\u0001\u001a\n\u0018\u00010|j\u0004\u0018\u0001`}8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b`\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0084\u0001\u0010e\u001a\u0005\b\u0085\u0001\u0010g\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u0088\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010bR\u001b\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010qR\u0018\u0010\u008b\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010bR4\u0010\u0093\u0001\u001a\u00030\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u008e\u0001\u0010\u0092\u0001R \u0010\u0099\u0001\u001a\u00030\u0094\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R4\u0010 \u0001\u001a\u00030\u009a\u00012\b\u0010\u008d\u0001\u001a\u00030\u009a\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u0084\u0001\u0010\u009f\u0001R8\u0010©\u0001\u001a\u0005\u0018\u00010¡\u00012\n\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0000@BX\u0080\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R4\u0010±\u0001\u001a\u00030ª\u00012\b\u0010\u008d\u0001\u001a\u00030ª\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R*\u0010¸\u0001\u001a\u00030²\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b\u009b\u0001\u0010·\u0001R(\u0010»\u0001\u001a\u00020<2\u0006\u0010w\u001a\u00020<8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0005\b¹\u0001\u0010b\u001a\u0006\b\u008a\u0001\u0010º\u0001R'\u0010¾\u0001\u001a\u00020\r2\u0006\u0010w\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b¼\u0001\u0010e\u001a\u0005\b½\u0001\u0010gR'\u0010Á\u0001\u001a\u00020\r2\u0006\u0010w\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b¿\u0001\u0010e\u001a\u0005\bÀ\u0001\u0010gR\u0017\u0010Â\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010eR)\u0010É\u0001\u001a\u00030Ã\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b/\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R)\u0010Ì\u0001\u001a\u00030Ã\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bE\u0010Ä\u0001\u001a\u0006\bÊ\u0001\u0010Æ\u0001\"\u0006\bË\u0001\u0010È\u0001R)\u0010Ï\u0001\u001a\u00030Ã\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b]\u0010Ä\u0001\u001a\u0006\bÍ\u0001\u0010Æ\u0001\"\u0006\bÎ\u0001\u0010È\u0001R\u0019\u0010Ð\u0001\u001a\u00030Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0017\u0010Ä\u0001R,\u0010Ó\u0001\u001a\u00020<8\u0000@\u0000X\u0081\u000e¢\u0006\u001b\n\u0004\b\u0010\u0010b\u0012\u0005\bÒ\u0001\u0010\u0019\u001a\u0005\be\u0010º\u0001\"\u0005\bÑ\u0001\u0010KR0\u0010Õ\u0001\u001a\u00020<2\u0007\u0010\u008d\u0001\u001a\u00020<8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\bÔ\u0001\u0010b\u001a\u0006\bÕ\u0001\u0010º\u0001\"\u0005\bÖ\u0001\u0010KR\u001f\u0010Û\u0001\u001a\u00030×\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b+\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u001f\u0010à\u0001\u001a\u00030Ü\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bP\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0018\u0010â\u0001\u001a\u00030á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010PR,\u0010ê\u0001\u001a\u0005\u0018\u00010ã\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bä\u0001\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R\u001b\u0010í\u0001\u001a\u0005\u0018\u00010ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\be\u0010ì\u0001R'\u0010ñ\u0001\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bî\u0001\u0010b\u001a\u0006\bï\u0001\u0010º\u0001\"\u0005\bð\u0001\u0010KR4\u0010ø\u0001\u001a\u00030ò\u00012\b\u0010\u008d\u0001\u001a\u00030ò\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b\u0095\u0001\u0010÷\u0001R8\u0010\u0080\u0002\u001a\u0011\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b\u0018\u00010ù\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R8\u0010\u0084\u0002\u001a\u0011\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b\u0018\u00010ù\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0081\u0002\u0010û\u0001\u001a\u0006\b\u0082\u0002\u0010ý\u0001\"\u0006\b\u0083\u0002\u0010ÿ\u0001R'\u0010\u0088\u0002\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0085\u0002\u0010b\u001a\u0006\b\u0086\u0002\u0010º\u0001\"\u0005\b\u0087\u0002\u0010KR\u0018\u0010\u008a\u0002\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0002\u0010bR\u0018\u0010\u008c\u0002\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0002\u0010bR\u001f\u0010\u0090\u0002\u001a\n\u0018\u00010\u008d\u0002R\u00030Ü\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u001d\u0010\u0094\u0002\u001a\b0\u0091\u0002R\u00030Ü\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R\u001a\u0010\u0096\u0002\u001a\u0005\u0018\u00010ë\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010\u0095\u0002R\u0016\u0010\u0099\u0002\u001a\u0004\u0018\u00010<8F¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R\u001e\u0010\u009c\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u009a\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bú\u0001\u0010\u009b\u0002R\u001f\u0010\u009e\u0002\u001a\n\u0012\u0005\u0012\u00030\u009d\u00020\u009a\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010\u009b\u0002R\u001f\u0010\u009f\u0002\u001a\n\u0012\u0005\u0012\u00030\u009d\u00020\u009a\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bî\u0001\u0010\u009b\u0002R\u001d\u0010¢\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000o8@X\u0080\u0004¢\u0006\b\u001a\u0006\b \u0002\u0010¡\u0002R\u001e\u0010¤\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u009a\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b£\u0002\u0010\u009b\u0002R\u0019\u0010§\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0002\u0010¦\u0002R\u0017\u0010©\u0002\u001a\u00020<8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0002\u0010º\u0001R\u0017\u0010¬\u0002\u001a\u00030ª\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bb\u0010«\u0002R$\u0010¯\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000o8@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b®\u0002\u0010\u0019\u001a\u0006\b\u00ad\u0002\u0010¡\u0002R\u0017\u0010±\u0002\u001a\u00020<8VX\u0096\u0004¢\u0006\b\u001a\u0006\b°\u0002\u0010º\u0001R\u0017\u0010²\u0002\u001a\u00020<8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010º\u0001R\u0016\u0010´\u0002\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b³\u0002\u0010gR\u0016\u0010µ\u0002\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0002\u0010gR\u0017\u0010¶\u0002\u001a\u00020<8@X\u0080\u0004¢\u0006\b\u001a\u0006\bä\u0001\u0010º\u0001R\u0018\u0010º\u0002\u001a\u00030·\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¸\u0002\u0010¹\u0002R\u0018\u0010»\u0002\u001a\u00030ë\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0089\u0002\u0010\u0095\u0002R\u0018\u0010½\u0002\u001a\u00030ë\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¼\u0002\u0010\u0095\u0002R\u0017\u0010À\u0002\u001a\u00030¾\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bt\u0010¿\u0002R\u0017\u0010Â\u0002\u001a\u00020<8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010º\u0001R\u0017\u0010Ä\u0002\u001a\u00020<8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010º\u0001R\u0017\u0010Æ\u0002\u001a\u00020<8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010º\u0001R\u0017\u0010È\u0002\u001a\u00020<8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÇ\u0002\u0010º\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ë\u0002"}, m28432d2 = {"LJm2;", "LAt0;", "LMv4;", "LlD3;", "Lvm2;", "LBt0;", "", "LjD3$b;", "", "a1", "I0", "child", "V0", "", "depth", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "W0", "p1", "S0", "T0", "C0", "D0", "B", "C1", "()V", "index", "instance", "B0", "(ILJm2;)V", "Y0", "count", "e1", "(II)V", "d1", "from", "to", "U0", "(III)V", "LjD3;", "owner", "x", "(LjD3;)V", "E", "toString", "E0", "H0", "y", "Z0", "f1", "N0", "Lme0;", "canvas", "G", "(Lme0;)V", "LCe3;", "pointerPosition", "LRM1;", "LrX3;", "hitTestResult", "", "isTouchEvent", "isInLayer", "x0", "(JLRM1;ZZ)V", "Lgs5;", "hitSemanticsEntities", "z0", "X0", "z", "it", "o1", "(LJm2;)V", "forceRequest", "m1", "(Z)V", "i1", "G0", "k1", "g1", "F", "F0", "Lkz0;", "constraints", "L0", "(Lkz0;)Z", "b1", "O0", "R0", "P0", "Q0", "g", "m", "A", "q1", "l", "j", "b", "Z", "isVirtual", "c", "I", "r0", "()I", "semanticsId", DateTokenConverter.CONVERTER_KEY, "virtualChildrenCount", "LNX2;", "e", "LNX2;", "_foldedChildren", "LLX2;", "f", "LLX2;", "_unfoldedChildren", "unfoldedVirtualChildrenListDirty", "h", "LJm2;", "_foldedParent", "<set-?>", "i", "LjD3;", "o0", "()LjD3;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "U", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "t1", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "interopViewFactoryHolder", "k", "O", "setDepth$ui_release", "(I)V", "ignoreRemeasureRequests", "_zSortedChildren", "n", "zSortedChildrenInvalidated", "LxO2;", "value", "o", "LxO2;", "h0", "()LxO2;", "(LxO2;)V", "measurePolicy", "Lf72;", "p", "Lf72;", "V", "()Lf72;", "intrinsicsPolicy", "Lg01;", "q", "Lg01;", "N", "()Lg01;", "(Lg01;)V", "density", "LXC2;", "newScope", "r", "LXC2;", "e0", "()LXC2;", "v1", "(LXC2;)V", "mLookaheadScope", "Lpm2;", "s", "Lpm2;", "getLayoutDirection", "()Lpm2;", C17296a.f69688o, "(Lpm2;)V", "layoutDirection", "LJq6;", "t", "LJq6;", "t0", "()LJq6;", "(LJq6;)V", "viewConfiguration", "u", "()Z", "isPlaced", "v", "q0", "placeOrder", "w", "getPreviousPlaceOrder$ui_release", "previousPlaceOrder", "nextChildPlaceOrder", "LJm2$g;", "LJm2$g;", "i0", "()LJm2$g;", "w1", "(LJm2$g;)V", "measuredByParent", "j0", "x1", "measuredByParentInLookahead", "W", "u1", "intrinsicsUsageByParent", "previousIntrinsicsUsageByParent", "r1", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "D", "isLookaheadRoot", "setLookaheadRoot", "LF83;", "LF83;", "m0", "()LF83;", "nodes", "LOm2;", "LOm2;", "X", "()LOm2;", "layoutDelegate", "", "zIndex", "LQm2;", "H", "LQm2;", "s0", "()LQm2;", "B1", "(LQm2;)V", "subcompositionsState", "LH83;", "LH83;", "_innerLayerCoordinator", "J", "getInnerLayerCoordinatorIsDirty$ui_release", "s1", "innerLayerCoordinatorIsDirty", "LgV2;", "K", "LgV2;", "k0", "()LgV2;", "(LgV2;)V", "modifier", "Lkotlin/Function1;", "P", "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "z1", "(Lkotlin/jvm/functions/Function1;)V", "onAttach", "Q", "getOnDetach$ui_release", "A1", "onDetach", "R", "l0", "y1", "needsOnPositionedDispatch", "S", "relayoutWithoutParentInProgress", "T", "deactivated", "LOm2$a;", "c0", "()LOm2$a;", "lookaheadPassDelegate", "LOm2$b;", "f0", "()LOm2$b;", "measurePassDelegate", "()LH83;", "innerLayerCoordinator", "K0", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "", "()Ljava/util/List;", "foldedChildren", "LvO2;", "childMeasurables", "childLookaheadMeasurables", "w0", "()LLX2;", "_children", "M", "children", "p0", "()LJm2;", "parent", "J0", "isAttached", "LJm2$e;", "()LJm2$e;", "layoutState", "v0", "getZSortedChildren$annotations", "zSortedChildren", "L", "isValidOwnerScope", "hasFixedInnerContentConstraints", AbstractC26684u0.f100690q, "width", "height", "alignmentLinesRequired", "LLm2;", "d0", "()LLm2;", "mDrawScope", "innerCoordinator", "n0", "outerCoordinator", "Lnm2;", "()Lnm2;", "coordinates", "g0", "measurePending", "Y", "layoutPending", "b0", "lookaheadMeasurePending", "a0", "lookaheadLayoutPending", "<init>", "(ZI)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 9 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 10 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 11 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 12 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1507:1\n1289#1,7:1589\n163#1:1609\n1289#1,7:1621\n1289#1,7:1628\n1277#1,7:1650\n163#1:1657\n163#1:1669\n1289#1,7:1681\n163#1:1688\n163#1:1700\n1277#1,7:1770\n163#1:1850\n163#1:1862\n163#1:1874\n1289#1,7:1886\n1182#2:1508\n1161#2,2:1509\n1182#2:1511\n1161#2,2:1512\n1182#2:1514\n1161#2,2:1515\n48#3:1517\n48#3:1553\n48#3:1565\n48#3:1577\n48#3:1596\n460#4,7:1518\n146#4:1525\n467#4,4:1526\n460#4,11:1530\n476#4,11:1541\n460#4,11:1554\n460#4,11:1566\n460#4,11:1578\n460#4,11:1597\n146#4:1608\n460#4,11:1610\n460#4,11:1658\n460#4,11:1670\n460#4,11:1689\n460#4,11:1701\n460#4,11:1809\n460#4,11:1851\n460#4,11:1863\n460#4,11:1875\n1#5:1552\n360#6,15:1635\n87#7,3:1712\n91#7:1716\n87#7:1721\n89#7,3:1723\n87#7:1729\n87#7:1733\n83#7:1738\n83#7:1753\n69#7:1777\n69#7:1792\n81#7:1820\n71#7:1837\n69#7:1838\n69#7:1842\n69#7:1844\n71#7:1845\n47#8:1715\n51#9:1717\n633#10,3:1718\n636#10,3:1726\n664#10,3:1730\n667#10,3:1735\n610#10,8:1739\n633#10,3:1747\n618#10,2:1750\n611#10:1752\n612#10,11:1754\n636#10,3:1765\n623#10:1768\n613#10:1769\n610#10,8:1778\n633#10,3:1786\n618#10,2:1789\n611#10:1791\n612#10,11:1793\n636#10,3:1804\n623#10:1807\n613#10:1808\n633#10,3:1839\n636#10,3:1847\n196#11:1722\n196#11:1734\n196#11:1843\n196#11:1846\n111#12:1821\n100#12,15:1822\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n422#1:1589,7\n519#1:1609\n589#1:1621,7\n778#1:1628,7\n923#1:1650,7\n962#1:1657\n975#1:1669\n1001#1:1681,7\n1006#1:1688\n1041#1:1700\n1158#1:1770,7\n1326#1:1850\n1348#1:1862\n1360#1:1874\n1393#1:1886,7\n95#1:1508\n95#1:1509,2\n465#1:1511\n465#1:1512,2\n107#1:1514\n107#1:1515,2\n111#1:1517\n279#1:1553\n344#1:1565\n415#1:1577\n457#1:1596\n111#1:1518,7\n113#1:1525\n111#1:1526,4\n163#1:1530,11\n165#1:1541,11\n279#1:1554,11\n344#1:1566,11\n415#1:1578,11\n457#1:1597,11\n481#1:1608\n519#1:1610,11\n962#1:1658,11\n975#1:1670,11\n1006#1:1689,11\n1041#1:1701,11\n1247#1:1809,11\n1326#1:1851,11\n1348#1:1863,11\n1360#1:1875,11\n823#1:1635,15\n1088#1:1712,3\n1088#1:1716\n1090#1:1721\n1090#1:1723,3\n1099#1:1729\n1102#1:1733\n1142#1:1738\n1143#1:1753\n1243#1:1777\n1244#1:1792\n1268#1:1820\n1299#1:1837\n1299#1:1838\n1301#1:1842\n1302#1:1844\n1306#1:1845\n1088#1:1715\n1088#1:1717\n1089#1:1718,3\n1089#1:1726,3\n1100#1:1730,3\n1100#1:1735,3\n1142#1:1739,8\n1142#1:1747,3\n1142#1:1750,2\n1142#1:1752\n1142#1:1754,11\n1142#1:1765,3\n1142#1:1768\n1142#1:1769\n1243#1:1778,8\n1243#1:1786,3\n1243#1:1789,2\n1243#1:1791\n1243#1:1793,11\n1243#1:1804,3\n1243#1:1807\n1243#1:1808\n1300#1:1839,3\n1300#1:1847,3\n1090#1:1722\n1102#1:1734\n1301#1:1843\n1306#1:1846\n1268#1:1821\n1268#1:1822,15\n*E\n"})
/* renamed from: Jm2 */
/* loaded from: classes.dex */
public final class C33829Jm2 implements InterfaceC31784At0, InterfaceC34614Mv4, InterfaceC44367lD3, InterfaceC50621vm2, InterfaceC32018Bt0, InterfaceC43181jD3.InterfaceC24738b {

    /* renamed from: U */
    public static final C4227d f18144U = new C4227d(null);

    /* renamed from: W */
    public static final AbstractC4229f f18145W = new C4226c();

    /* renamed from: X */
    public static final Function0<C33829Jm2> f18146X = C4224a.f18190g;

    /* renamed from: Y */
    public static final InterfaceC33869Jq6 f18147Y = new C4225b();

    /* renamed from: Z */
    public static final Comparator<C33829Jm2> f18148Z = new Comparator() { // from class: Im2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m99748s;
            m99748s = C33829Jm2.m99748s((C33829Jm2) obj, (C33829Jm2) obj2);
            return m99748s;
        }
    };

    /* renamed from: A */
    public EnumC4230g f18149A;

    /* renamed from: B */
    public EnumC4230g f18150B;

    /* renamed from: C */
    public boolean f18151C;

    /* renamed from: D */
    public boolean f18152D;

    /* renamed from: E */
    public final F83 f18153E;

    /* renamed from: F */
    public final C34999Om2 f18154F;

    /* renamed from: G */
    public float f18155G;

    /* renamed from: H */
    public C35467Qm2 f18156H;

    /* renamed from: I */
    public H83 f18157I;

    /* renamed from: J */
    public boolean f18158J;

    /* renamed from: K */
    public InterfaceC41563gV2 f18159K;

    /* renamed from: P */
    public Function1<? super InterfaceC43181jD3, Unit> f18160P;

    /* renamed from: Q */
    public Function1<? super InterfaceC43181jD3, Unit> f18161Q;

    /* renamed from: R */
    public boolean f18162R;

    /* renamed from: S */
    public boolean f18163S;

    /* renamed from: T */
    public boolean f18164T;

    /* renamed from: b */
    public final boolean f18165b;

    /* renamed from: c */
    public final int f18166c;

    /* renamed from: d */
    public int f18167d;

    /* renamed from: e */
    public final NX2<C33829Jm2> f18168e;

    /* renamed from: f */
    public LX2<C33829Jm2> f18169f;

    /* renamed from: g */
    public boolean f18170g;

    /* renamed from: h */
    public C33829Jm2 f18171h;

    /* renamed from: i */
    public InterfaceC43181jD3 f18172i;

    /* renamed from: j */
    public AndroidViewHolder f18173j;

    /* renamed from: k */
    public int f18174k;

    /* renamed from: l */
    public boolean f18175l;

    /* renamed from: m */
    public final LX2<C33829Jm2> f18176m;

    /* renamed from: n */
    public boolean f18177n;

    /* renamed from: o */
    public InterfaceC51579xO2 f18178o;

    /* renamed from: p */
    public final C40751f72 f18179p;

    /* renamed from: q */
    public InterfaceC41273g01 f18180q;

    /* renamed from: r */
    public XC2 f18181r;

    /* renamed from: s */
    public EnumC47065pm2 f18182s;

    /* renamed from: t */
    public InterfaceC33869Jq6 f18183t;

    /* renamed from: u */
    public boolean f18184u;

    /* renamed from: v */
    public int f18185v;

    /* renamed from: w */
    public int f18186w;

    /* renamed from: x */
    public int f18187x;

    /* renamed from: y */
    public EnumC4230g f18188y;

    /* renamed from: z */
    public EnumC4230g f18189z;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LJm2;", "b", "()LJm2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jm2$a */
    /* loaded from: classes.dex */
    public static final class C4224a extends Lambda implements Function0<C33829Jm2> {

        /* renamed from: g */
        public static final C4224a f18190g = new C4224a();

        public C4224a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C33829Jm2 invoke() {
            return new C33829Jm2(false, 0, 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m28432d2 = {"Jm2$b", "LJq6;", "", DateTokenConverter.CONVERTER_KEY, "()J", "longPressTimeoutMillis", "c", "doubleTapTimeoutMillis", C17296a.f69688o, "doubleTapMinTimeMillis", "", "b", "()F", "touchSlop", "Lo61;", "e", "minimumTouchTargetSize", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Jm2$b */
    /* loaded from: classes.dex */
    public static final class C4225b implements InterfaceC33869Jq6 {
        @Override // p000.InterfaceC33869Jq6
        /* renamed from: a */
        public long mo42676a() {
            return 40L;
        }

        @Override // p000.InterfaceC33869Jq6
        /* renamed from: b */
        public float mo42675b() {
            return 16.0f;
        }

        @Override // p000.InterfaceC33869Jq6
        /* renamed from: c */
        public long mo42674c() {
            return 300L;
        }

        @Override // p000.InterfaceC33869Jq6
        /* renamed from: d */
        public long mo42673d() {
            return 400L;
        }

        @Override // p000.InterfaceC33869Jq6
        /* renamed from: e */
        public long mo99626e() {
            return C46077o61.f101371b.m21783b();
        }
    }

    @Metadata(m28433d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Jm2$c", "LJm2$f;", "LzO2;", "", "LvO2;", "measurables", "Lkz0;", "constraints", "", "j", "(LzO2;Ljava/util/List;J)Ljava/lang/Void;", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Jm2$c */
    /* loaded from: classes.dex */
    public static final class C4226c extends AbstractC4229f {
        public C4226c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 interfaceC52765zO2, List list, long j) {
            return (InterfaceC52172yO2) m99724j(interfaceC52765zO2, list, j);
        }

        /* renamed from: j */
        public Void m99724j(InterfaceC52765zO2 measure, List<? extends InterfaceC50393vO2> measurables, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LJm2$d;", "", "Lkotlin/Function0;", "LJm2;", "Constructor", "Lkotlin/jvm/functions/Function0;", C17296a.f69688o, "()Lkotlin/jvm/functions/Function0;", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "b", "()Ljava/util/Comparator;", "LJm2$f;", "ErrorMeasurePolicy", "LJm2$f;", "", "NotPlacedPlaceOrder", "I", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Jm2$d */
    /* loaded from: classes.dex */
    public static final class C4227d {
        public /* synthetic */ C4227d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function0<C33829Jm2> m99723a() {
            return C33829Jm2.f18146X;
        }

        /* renamed from: b */
        public final Comparator<C33829Jm2> m99722b() {
            return C33829Jm2.f18148Z;
        }

        private C4227d() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"LJm2$e;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Jm2$e */
    /* loaded from: classes.dex */
    public enum EnumC4228e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u000b\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\"\u0010\f\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\r\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LJm2$f;", "LxO2;", "LZ62;", "", "LX62;", "measurables", "", "height", "", "i", "width", "h", "g", "f", "", C17296a.f69688o, "Ljava/lang/String;", "error", "<init>", "(Ljava/lang/String;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Jm2$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC4229f implements InterfaceC51579xO2 {

        /* renamed from: a */
        public final String f18197a;

        public AbstractC4229f(String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f18197a = error;
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo5313b(Z62 z62, List list, int i) {
            return ((Number) m99719g(z62, list, i)).intValue();
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: c */
        public /* bridge */ /* synthetic */ int mo5312c(Z62 z62, List list, int i) {
            return ((Number) m99717i(z62, list, i)).intValue();
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo5311d(Z62 z62, List list, int i) {
            return ((Number) m99720f(z62, list, i)).intValue();
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: e */
        public /* bridge */ /* synthetic */ int mo5310e(Z62 z62, List list, int i) {
            return ((Number) m99718h(z62, list, i)).intValue();
        }

        /* renamed from: f */
        public Void m99720f(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f18197a.toString());
        }

        /* renamed from: g */
        public Void m99719g(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f18197a.toString());
        }

        /* renamed from: h */
        public Void m99718h(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f18197a.toString());
        }

        /* renamed from: i */
        public Void m99717i(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f18197a.toString());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"LJm2$g;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Jm2$g */
    /* loaded from: classes.dex */
    public enum EnumC4230g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Jm2$h */
    /* loaded from: classes.dex */
    public /* synthetic */ class C4231h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC4228e.values().length];
            try {
                iArr[EnumC4228e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Jm2$i */
    /* loaded from: classes.dex */
    public static final class C4232i extends Lambda implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4232i() {
            super(0);
            C33829Jm2.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            C33829Jm2.this.m99796X().m91540D();
        }
    }

    public C33829Jm2() {
        this(false, 0, 3, null);
    }

    /* renamed from: D */
    public static /* synthetic */ String m99835D(C33829Jm2 c33829Jm2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return c33829Jm2.m99838C(i);
    }

    /* renamed from: M0 */
    public static /* synthetic */ boolean m99817M0(C33829Jm2 c33829Jm2, C44228kz0 c44228kz0, int i, Object obj) {
        if ((i & 1) != 0) {
            c44228kz0 = c33829Jm2.f18154F.m91512q();
        }
        return c33829Jm2.m99819L0(c44228kz0);
    }

    /* renamed from: c1 */
    public static /* synthetic */ boolean m99784c1(C33829Jm2 c33829Jm2, C44228kz0 c44228kz0, int i, Object obj) {
        if ((i & 1) != 0) {
            c44228kz0 = c33829Jm2.f18154F.m91513p();
        }
        return c33829Jm2.m99786b1(c44228kz0);
    }

    /* renamed from: h1 */
    public static /* synthetic */ void m99774h1(C33829Jm2 c33829Jm2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c33829Jm2.m99776g1(z);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m99770j1(C33829Jm2 c33829Jm2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c33829Jm2.m99772i1(z);
    }

    /* renamed from: l1 */
    public static /* synthetic */ void m99765l1(C33829Jm2 c33829Jm2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c33829Jm2.m99767k1(z);
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m99761n1(C33829Jm2 c33829Jm2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c33829Jm2.m99763m1(z);
    }

    /* renamed from: s */
    public static final int m99748s(C33829Jm2 c33829Jm2, C33829Jm2 c33829Jm22) {
        boolean z;
        float f = c33829Jm2.f18155G;
        float f2 = c33829Jm22.f18155G;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Intrinsics.compare(c33829Jm2.f18185v, c33829Jm22.f18185v);
        }
        return Float.compare(f, f2);
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m99730y0(C33829Jm2 c33829Jm2, long j, RM1 rm1, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        c33829Jm2.m99733x0(j, rm1, z3, z2);
    }

    /* renamed from: A */
    public final void m99844A() {
        this.f18150B = this.f18149A;
        this.f18149A = EnumC4230g.NotUsed;
        LX2<C33829Jm2> m99736w0 = m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            int i = 0;
            do {
                C33829Jm2 c33829Jm2 = m96691s[i];
                if (c33829Jm2.f18149A != EnumC4230g.NotUsed) {
                    c33829Jm2.m99844A();
                }
                i++;
            } while (i < m96690u);
        }
    }

    /* renamed from: A1 */
    public final void m99842A1(Function1<? super InterfaceC43181jD3, Unit> function1) {
        this.f18161Q = function1;
    }

    /* renamed from: B */
    public final void m99841B() {
        this.f18150B = this.f18149A;
        this.f18149A = EnumC4230g.NotUsed;
        LX2<C33829Jm2> m99736w0 = m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            int i = 0;
            do {
                C33829Jm2 c33829Jm2 = m96691s[i];
                if (c33829Jm2.f18149A == EnumC4230g.InLayoutBlock) {
                    c33829Jm2.m99841B();
                }
                i++;
            } while (i < m96690u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m99840B0(int i, C33829Jm2 instance) {
        Object[] objArr;
        Object[] objArr2;
        InterfaceC43181jD3 interfaceC43181jD3;
        LX2<C33829Jm2> m93793f;
        int m96690u;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i2 = 0;
        if (instance.f18171h == null) {
            objArr = 1;
        } else {
            objArr = null;
        }
        H83 h83 = null;
        String str = null;
        if (objArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(instance);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(m99835D(this, 0, 1, null));
            sb.append(" Other tree: ");
            C33829Jm2 c33829Jm2 = instance.f18171h;
            if (c33829Jm2 != null) {
                str = m99835D(c33829Jm2, 0, 1, null);
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (instance.f18172i == null) {
            objArr2 = 1;
        } else {
            objArr2 = null;
        }
        if (objArr2 != null) {
            instance.f18171h = this;
            this.f18168e.m93798a(i, instance);
            m99793Y0();
            if (instance.f18165b) {
                if (!this.f18165b) {
                    this.f18167d++;
                } else {
                    throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
                }
            }
            m99824I0();
            H83 m99762n0 = instance.m99762n0();
            if (this.f18165b) {
                C33829Jm2 c33829Jm22 = this.f18171h;
                if (c33829Jm22 != null) {
                    h83 = c33829Jm22.m99806S();
                }
            } else {
                h83 = m99806S();
            }
            m99762n0.m104341L2(h83);
            if (instance.f18165b && (m96690u = (m93793f = instance.f18168e.m93793f()).m96690u()) > 0) {
                C33829Jm2[] m96691s = m93793f.m96691s();
                do {
                    m96691s[i2].m99762n0().m104341L2(m99806S());
                    i2++;
                } while (i2 < m96690u);
                interfaceC43181jD3 = this.f18172i;
                if (interfaceC43181jD3 != null) {
                }
                if (instance.f18154F.m91516m() <= 0) {
                }
            } else {
                interfaceC43181jD3 = this.f18172i;
                if (interfaceC43181jD3 != null) {
                    instance.m99734x(interfaceC43181jD3);
                }
                if (instance.f18154F.m91516m() <= 0) {
                    C34999Om2 c34999Om2 = this.f18154F;
                    c34999Om2.m91531M(c34999Om2.m91516m() + 1);
                }
            }
        } else {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + m99835D(this, 0, 1, null) + " Other tree: " + m99835D(instance, 0, 1, null)).toString());
        }
    }

    /* renamed from: B1 */
    public final void m99839B1(C35467Qm2 c35467Qm2) {
        this.f18156H = c35467Qm2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m99838C(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        LX2<C33829Jm2> m99736w0 = m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            int i3 = 0;
            do {
                sb.append(m96691s[i3].m99838C(i + 1));
                i3++;
            } while (i3 < m96690u);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "tree.toString()");
            if (i != 0) {
                String substring = sb2.substring(0, sb2.length() - 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
            return sb2;
        }
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "tree.toString()");
        if (i != 0) {
        }
    }

    /* renamed from: C0 */
    public final void m99837C0() {
        boolean z;
        boolean z2;
        if (this.f18153E.m107673p(K83.m99169a(1024) | K83.m99169a(2048) | K83.m99169a(4096))) {
            for (InterfaceC41563gV2.AbstractC20914c m107677l = this.f18153E.m107677l(); m107677l != null; m107677l = m107677l.m39261I()) {
                boolean z3 = true;
                if ((K83.m99169a(1024) & m107677l.m39258M()) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((K83.m99169a(2048) & m107677l.m39258M()) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z | z2;
                if ((K83.m99169a(4096) & m107677l.m39258M()) == 0) {
                    z3 = false;
                }
                if (z4 | z3) {
                    L83.m97667a(m107677l);
                }
            }
        }
    }

    /* renamed from: C1 */
    public final void m99836C1() {
        if (this.f18167d > 0) {
            m99788a1();
        }
    }

    /* renamed from: D0 */
    public final void m99834D0() {
        boolean z;
        if (this.f18153E.m107672q(K83.m99169a(1024))) {
            for (InterfaceC41563gV2.AbstractC20914c m107674o = this.f18153E.m107674o(); m107674o != null; m107674o = m107674o.m39256O()) {
                if ((K83.m99169a(1024) & m107674o.m39258M()) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (m107674o instanceof FocusTargetModifierNode)) {
                    FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) m107674o;
                    if (focusTargetModifierNode.m68831g0().mo76101a()) {
                        C34765Nm2.m93440a(this).mo31015B().mo68852h(true, false);
                        focusTargetModifierNode.m68828j0();
                    }
                }
            }
        }
    }

    /* renamed from: E */
    public final void m99833E() {
        InterfaceC43181jD3 interfaceC43181jD3 = this.f18172i;
        String str = null;
        if (interfaceC43181jD3 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            C33829Jm2 m99756p0 = m99756p0();
            if (m99756p0 != null) {
                str = m99835D(m99756p0, 0, 1, null);
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString().toString());
        }
        m99834D0();
        C33829Jm2 m99756p02 = m99756p0();
        if (m99756p02 != null) {
            m99756p02.m99832E0();
            m99756p02.m99828G0();
            this.f18188y = EnumC4230g.NotUsed;
        }
        this.f18154F.m91532L();
        Function1<? super InterfaceC43181jD3, Unit> function1 = this.f18161Q;
        if (function1 != null) {
            function1.invoke(interfaceC43181jD3);
        }
        if (C43570js5.m29803i(this) != null) {
            interfaceC43181jD3.mo30998V();
        }
        this.f18153E.m107681h();
        interfaceC43181jD3.mo30983u(this);
        this.f18172i = null;
        this.f18174k = 0;
        LX2<C33829Jm2> m93793f = this.f18168e.m93793f();
        int m96690u = m93793f.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m93793f.m96691s();
            int i = 0;
            do {
                m96691s[i].m99833E();
                i++;
            } while (i < m96690u);
            this.f18185v = Integer.MAX_VALUE;
            this.f18186w = Integer.MAX_VALUE;
            this.f18184u = false;
        }
        this.f18185v = Integer.MAX_VALUE;
        this.f18186w = Integer.MAX_VALUE;
        this.f18184u = false;
    }

    /* renamed from: E0 */
    public final void m99832E0() {
        H83 m99804T = m99804T();
        if (m99804T != null) {
            m99804T.m104301s2();
            return;
        }
        C33829Jm2 m99756p0 = m99756p0();
        if (m99756p0 != null) {
            m99756p0.m99832E0();
        }
    }

    /* renamed from: F */
    public final void m99831F() {
        int m107679j;
        if (m99792Z() != EnumC4228e.Idle || m99794Y() || m99777g0() || !mo8156n()) {
            return;
        }
        F83 f83 = this.f18153E;
        int m99169a = K83.m99169a(256);
        m107679j = f83.m107679j();
        if ((m107679j & m99169a) != 0) {
            for (InterfaceC41563gV2.AbstractC20914c m107677l = f83.m107677l(); m107677l != null; m107677l = m107677l.m39261I()) {
                if ((m107677l.m39258M() & m99169a) != 0 && (m107677l instanceof TC1)) {
                    TC1 tc1 = (TC1) m107677l;
                    tc1.mo29741C(C51083wZ0.m6662g(tc1, K83.m99169a(256)));
                }
                if ((m107677l.m39262G() & m99169a) == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: F0 */
    public final void m99830F0() {
        H83 m99762n0 = m99762n0();
        H83 m99806S = m99806S();
        while (m99762n0 != m99806S) {
            Intrinsics.checkNotNull(m99762n0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C32659Em2 c32659Em2 = (C32659Em2) m99762n0;
            InterfaceC42588iD3 m104315c2 = c32659Em2.m104315c2();
            if (m104315c2 != null) {
                m104315c2.invalidate();
            }
            m99762n0 = c32659Em2.m104310i2();
        }
        InterfaceC42588iD3 m104315c22 = m99806S().m104315c2();
        if (m104315c22 != null) {
            m104315c22.invalidate();
        }
    }

    /* renamed from: G */
    public final void m99829G(InterfaceC45204me0 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        m99762n0().m104327T1(canvas);
    }

    /* renamed from: G0 */
    public final void m99828G0() {
        if (this.f18181r != null) {
            m99770j1(this, false, 1, null);
        } else {
            m99761n1(this, false, 1, null);
        }
    }

    /* renamed from: H */
    public final boolean m99827H() {
        boolean z;
        AbstractC6277P9 mo88870d;
        C34999Om2 c34999Om2 = this.f18154F;
        if (c34999Om2.m91517l().mo88870d().m90691k()) {
            return true;
        }
        InterfaceC6687Q9 m91509t = c34999Om2.m91509t();
        if (m91509t != null && (mo88870d = m91509t.mo88870d()) != null && mo88870d.m90691k()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: H0 */
    public final void m99826H0() {
        this.f18154F.m91542B();
    }

    /* renamed from: I */
    public final boolean m99825I() {
        return this.f18151C;
    }

    /* renamed from: I0 */
    public final void m99824I0() {
        C33829Jm2 m99756p0;
        if (this.f18167d > 0) {
            this.f18170g = true;
        }
        if (this.f18165b && (m99756p0 = m99756p0()) != null) {
            m99756p0.f18170g = true;
        }
    }

    /* renamed from: J */
    public final List<InterfaceC50393vO2> m99823J() {
        C34999Om2.C6111a m99785c0 = m99785c0();
        Intrinsics.checkNotNull(m99785c0);
        return m99785c0.m91495p1();
    }

    /* renamed from: J0 */
    public boolean m99822J0() {
        return this.f18172i != null;
    }

    /* renamed from: K */
    public final List<InterfaceC50393vO2> m99821K() {
        return m99779f0().m91478n1();
    }

    /* renamed from: K0 */
    public final Boolean m99820K0() {
        C34999Om2.C6111a m99785c0 = m99785c0();
        if (m99785c0 != null) {
            return Boolean.valueOf(m99785c0.mo88869n());
        }
        return null;
    }

    @Override // p000.InterfaceC44367lD3
    /* renamed from: L */
    public boolean mo14142L() {
        return m99822J0();
    }

    /* renamed from: L0 */
    public final boolean m99819L0(C44228kz0 c44228kz0) {
        if (c44228kz0 != null && this.f18181r != null) {
            C34999Om2.C6111a m99785c0 = m99785c0();
            Intrinsics.checkNotNull(m99785c0);
            return m99785c0.m91486y1(c44228kz0.m28058s());
        }
        return false;
    }

    /* renamed from: M */
    public final List<C33829Jm2> m99818M() {
        return m99736w0().m96697g();
    }

    /* renamed from: N */
    public InterfaceC41273g01 m99816N() {
        return this.f18180q;
    }

    /* renamed from: N0 */
    public final void m99815N0() {
        if (this.f18149A == EnumC4230g.NotUsed) {
            m99841B();
        }
        C34999Om2.C6111a m99785c0 = m99785c0();
        Intrinsics.checkNotNull(m99785c0);
        m99785c0.m91485z1();
    }

    /* renamed from: O */
    public final int m99814O() {
        return this.f18174k;
    }

    /* renamed from: O0 */
    public final void m99813O0() {
        this.f18154F.m91539E();
    }

    /* renamed from: P */
    public final List<C33829Jm2> m99812P() {
        return this.f18168e.m93797b();
    }

    /* renamed from: P0 */
    public final void m99811P0() {
        this.f18154F.m91538F();
    }

    /* renamed from: Q */
    public final boolean m99810Q() {
        long m104316b2 = m99806S().m104316b2();
        if (C44228kz0.m28065l(m104316b2) && C44228kz0.m28066k(m104316b2)) {
            return true;
        }
        return false;
    }

    /* renamed from: Q0 */
    public final void m99809Q0() {
        this.f18154F.m91537G();
    }

    /* renamed from: R */
    public int m99808R() {
        return this.f18154F.m91514o();
    }

    /* renamed from: R0 */
    public final void m99807R0() {
        this.f18154F.m91536H();
    }

    /* renamed from: S */
    public final H83 m99806S() {
        return this.f18153E.m107676m();
    }

    /* renamed from: S0 */
    public final void m99805S0() {
        boolean mo8156n = mo8156n();
        this.f18184u = true;
        if (!mo8156n) {
            if (m99777g0()) {
                m99763m1(true);
            } else if (m99787b0()) {
                m99772i1(true);
            }
        }
        H83 m104310i2 = m99806S().m104310i2();
        for (H83 m99762n0 = m99762n0(); !Intrinsics.areEqual(m99762n0, m104310i2) && m99762n0 != null; m99762n0 = m99762n0.m104310i2()) {
            if (m99762n0.m104317a2()) {
                m99762n0.m104301s2();
            }
        }
        LX2<C33829Jm2> m99736w0 = m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            int i = 0;
            do {
                C33829Jm2 c33829Jm2 = m96691s[i];
                if (c33829Jm2.f18185v != Integer.MAX_VALUE) {
                    c33829Jm2.m99805S0();
                    m99758o1(c33829Jm2);
                }
                i++;
            } while (i < m96690u);
        }
    }

    /* renamed from: T */
    public final H83 m99804T() {
        InterfaceC42588iD3 interfaceC42588iD3;
        if (this.f18158J) {
            H83 m99806S = m99806S();
            H83 m104309j2 = m99762n0().m104309j2();
            this.f18157I = null;
            while (true) {
                if (Intrinsics.areEqual(m99806S, m104309j2)) {
                    break;
                }
                if (m99806S != null) {
                    interfaceC42588iD3 = m99806S.m104315c2();
                } else {
                    interfaceC42588iD3 = null;
                }
                if (interfaceC42588iD3 != null) {
                    this.f18157I = m99806S;
                    break;
                } else if (m99806S != null) {
                    m99806S = m99806S.m104309j2();
                } else {
                    m99806S = null;
                }
            }
        }
        H83 h83 = this.f18157I;
        if (h83 != null && h83.m104315c2() == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return h83;
    }

    /* renamed from: T0 */
    public final void m99803T0() {
        if (mo8156n()) {
            int i = 0;
            this.f18184u = false;
            LX2<C33829Jm2> m99736w0 = m99736w0();
            int m96690u = m99736w0.m96690u();
            if (m96690u > 0) {
                C33829Jm2[] m96691s = m99736w0.m96691s();
                do {
                    m96691s[i].m99803T0();
                    i++;
                } while (i < m96690u);
            }
        }
    }

    /* renamed from: U */
    public final AndroidViewHolder m99802U() {
        return this.f18173j;
    }

    /* renamed from: U0 */
    public final void m99801U0(int i, int i2, int i3) {
        int i4;
        if (i == i2) {
            return;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            if (i > i2) {
                i4 = i + i5;
            } else {
                i4 = i;
            }
            this.f18168e.m93798a(i > i2 ? i2 + i5 : (i2 + i3) - 2, this.f18168e.m93792g(i4));
        }
        m99793Y0();
        m99824I0();
        m99828G0();
    }

    /* renamed from: V */
    public final C40751f72 m99800V() {
        return this.f18179p;
    }

    /* renamed from: V0 */
    public final void m99799V0(C33829Jm2 c33829Jm2) {
        C34999Om2 c34999Om2;
        if (c33829Jm2.f18154F.m91516m() > 0) {
            this.f18154F.m91531M(c34999Om2.m91516m() - 1);
        }
        if (this.f18172i != null) {
            c33829Jm2.m99833E();
        }
        c33829Jm2.f18171h = null;
        c33829Jm2.m99762n0().m104341L2(null);
        if (c33829Jm2.f18165b) {
            this.f18167d--;
            LX2<C33829Jm2> m93793f = c33829Jm2.f18168e.m93793f();
            int m96690u = m93793f.m96690u();
            if (m96690u > 0) {
                C33829Jm2[] m96691s = m93793f.m96691s();
                int i = 0;
                do {
                    m96691s[i].m99762n0().m104341L2(null);
                    i++;
                } while (i < m96690u);
            }
        }
        m99824I0();
        m99793Y0();
    }

    /* renamed from: W */
    public final EnumC4230g m99798W() {
        return this.f18149A;
    }

    /* renamed from: W0 */
    public final void m99797W0() {
        m99828G0();
        C33829Jm2 m99756p0 = m99756p0();
        if (m99756p0 != null) {
            m99756p0.m99832E0();
        }
        m99830F0();
    }

    /* renamed from: X */
    public final C34999Om2 m99796X() {
        return this.f18154F;
    }

    /* renamed from: X0 */
    public final void m99795X0() {
        boolean z;
        C33829Jm2 m99756p0 = m99756p0();
        float m104308k2 = m99806S().m104308k2();
        H83 m99762n0 = m99762n0();
        H83 m99806S = m99806S();
        while (m99762n0 != m99806S) {
            Intrinsics.checkNotNull(m99762n0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C32659Em2 c32659Em2 = (C32659Em2) m99762n0;
            m104308k2 += c32659Em2.m104308k2();
            m99762n0 = c32659Em2.m104310i2();
        }
        boolean z2 = false;
        if (m104308k2 == this.f18155G) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f18155G = m104308k2;
            if (m99756p0 != null) {
                m99756p0.m99793Y0();
            }
            if (m99756p0 != null) {
                m99756p0.m99832E0();
            }
        }
        if (!mo8156n()) {
            if (m99756p0 != null) {
                m99756p0.m99832E0();
            }
            m99805S0();
        }
        if (m99756p0 != null) {
            if (!this.f18163S && m99756p0.m99792Z() == EnumC4228e.LayingOut) {
                if (this.f18185v == Integer.MAX_VALUE) {
                    z2 = true;
                }
                if (z2) {
                    int i = m99756p0.f18187x;
                    this.f18185v = i;
                    m99756p0.f18187x = i + 1;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
        } else {
            this.f18185v = 0;
        }
        this.f18154F.m91517l().mo88872S();
    }

    /* renamed from: Y */
    public final boolean m99794Y() {
        return this.f18154F.m91511r();
    }

    /* renamed from: Y0 */
    public final void m99793Y0() {
        if (this.f18165b) {
            C33829Jm2 m99756p0 = m99756p0();
            if (m99756p0 != null) {
                m99756p0.m99793Y0();
                return;
            }
            return;
        }
        this.f18177n = true;
    }

    /* renamed from: Z */
    public final EnumC4228e m99792Z() {
        return this.f18154F.m91510s();
    }

    /* renamed from: Z0 */
    public final void m99791Z0(int i, int i2) {
        H83 h83;
        InterfaceC45879nm2 interfaceC45879nm2;
        int mo92191l;
        EnumC47065pm2 mo92192k;
        C34999Om2 c34999Om2;
        boolean m92193F;
        if (this.f18149A == EnumC4230g.NotUsed) {
            m99841B();
        }
        C34999Om2.C6119b m99779f0 = m99779f0();
        OU3.AbstractC6015a.C6016a c6016a = OU3.AbstractC6015a.f26640a;
        int mo91479g1 = m99779f0.mo91479g1();
        EnumC47065pm2 layoutDirection = getLayoutDirection();
        C33829Jm2 m99756p0 = m99756p0();
        if (m99756p0 != null) {
            h83 = m99756p0.m99806S();
        } else {
            h83 = null;
        }
        H83 h832 = h83;
        interfaceC45879nm2 = OU3.AbstractC6015a.f26643d;
        mo92191l = c6016a.mo92191l();
        mo92192k = c6016a.mo92192k();
        c34999Om2 = OU3.AbstractC6015a.f26644e;
        OU3.AbstractC6015a.f26642c = mo91479g1;
        OU3.AbstractC6015a.f26641b = layoutDirection;
        m92193F = c6016a.m92193F(h832);
        OU3.AbstractC6015a.m92205r(c6016a, m99779f0, i, i2, 0.0f, 4, null);
        if (h832 != null) {
            h832.m85842z1(m92193F);
        }
        OU3.AbstractC6015a.f26642c = mo92191l;
        OU3.AbstractC6015a.f26641b = mo92192k;
        OU3.AbstractC6015a.f26643d = interfaceC45879nm2;
        OU3.AbstractC6015a.f26644e = c34999Om2;
    }

    @Override // p000.InterfaceC32018Bt0
    /* renamed from: a */
    public void mo99790a(EnumC47065pm2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f18182s != value) {
            this.f18182s = value;
            m99797W0();
        }
    }

    /* renamed from: a0 */
    public final boolean m99789a0() {
        return this.f18154F.m91508u();
    }

    /* renamed from: a1 */
    public final void m99788a1() {
        if (this.f18170g) {
            int i = 0;
            this.f18170g = false;
            LX2<C33829Jm2> lx2 = this.f18169f;
            if (lx2 == null) {
                lx2 = new LX2<>(new C33829Jm2[16], 0);
                this.f18169f = lx2;
            }
            lx2.m96696h();
            LX2<C33829Jm2> m93793f = this.f18168e.m93793f();
            int m96690u = m93793f.m96690u();
            if (m96690u > 0) {
                C33829Jm2[] m96691s = m93793f.m96691s();
                do {
                    C33829Jm2 c33829Jm2 = m96691s[i];
                    if (c33829Jm2.f18165b) {
                        lx2.m96700c(lx2.m96690u(), c33829Jm2.m99736w0());
                    } else {
                        lx2.m96701b(c33829Jm2);
                    }
                    i++;
                } while (i < m96690u);
                this.f18154F.m91540D();
            }
            this.f18154F.m91540D();
        }
    }

    @Override // p000.InterfaceC31784At0
    /* renamed from: b */
    public void mo68281b() {
        AndroidViewHolder androidViewHolder = this.f18173j;
        if (androidViewHolder != null) {
            androidViewHolder.mo68281b();
        }
        H83 m104310i2 = m99806S().m104310i2();
        for (H83 m99762n0 = m99762n0(); !Intrinsics.areEqual(m99762n0, m104310i2) && m99762n0 != null; m99762n0 = m99762n0.m104310i2()) {
            m99762n0.m104354E2();
        }
    }

    /* renamed from: b0 */
    public final boolean m99787b0() {
        return this.f18154F.m91507v();
    }

    /* renamed from: b1 */
    public final boolean m99786b1(C44228kz0 c44228kz0) {
        if (c44228kz0 != null) {
            if (this.f18149A == EnumC4230g.NotUsed) {
                m99844A();
            }
            return m99779f0().m91470v1(c44228kz0.m28058s());
        }
        return false;
    }

    /* renamed from: c0 */
    public final C34999Om2.C6111a m99785c0() {
        return this.f18154F.m91506w();
    }

    /* renamed from: d0 */
    public final C34297Lm2 m99783d0() {
        return C34765Nm2.m93440a(this).mo31002Q();
    }

    /* renamed from: d1 */
    public final void m99782d1() {
        int m93794e = this.f18168e.m93794e();
        while (true) {
            m93794e--;
            if (-1 < m93794e) {
                m99799V0(this.f18168e.m93795d(m93794e));
            } else {
                this.f18168e.m93796c();
                return;
            }
        }
    }

    /* renamed from: e0 */
    public final XC2 m99781e0() {
        return this.f18181r;
    }

    /* renamed from: e1 */
    public final void m99780e1(int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = (i2 + i) - 1;
            if (i > i3) {
                return;
            }
            while (true) {
                m99799V0(this.f18168e.m93792g(i3));
                if (i3 != i) {
                    i3--;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(("count (" + i2 + ") must be greater than 0").toString());
        }
    }

    /* renamed from: f0 */
    public final C34999Om2.C6119b m99779f0() {
        return this.f18154F.m91505x();
    }

    /* renamed from: f1 */
    public final void m99778f1() {
        if (this.f18149A == EnumC4230g.NotUsed) {
            m99841B();
        }
        try {
            this.f18163S = true;
            m99779f0().m91469w1();
        } finally {
            this.f18163S = false;
        }
    }

    @Override // p000.InterfaceC34614Mv4
    /* renamed from: g */
    public void mo94567g() {
        m99761n1(this, false, 1, null);
        C44228kz0 m91513p = this.f18154F.m91513p();
        if (m91513p != null) {
            InterfaceC43181jD3 interfaceC43181jD3 = this.f18172i;
            if (interfaceC43181jD3 != null) {
                interfaceC43181jD3.mo31004O(this, m91513p.m28058s());
                return;
            }
            return;
        }
        InterfaceC43181jD3 interfaceC43181jD32 = this.f18172i;
        if (interfaceC43181jD32 != null) {
            InterfaceC43181jD3.m30991j(interfaceC43181jD32, false, 1, null);
        }
    }

    /* renamed from: g0 */
    public final boolean m99777g0() {
        return this.f18154F.m91504y();
    }

    /* renamed from: g1 */
    public final void m99776g1(boolean z) {
        InterfaceC43181jD3 interfaceC43181jD3;
        if (!this.f18165b && (interfaceC43181jD3 = this.f18172i) != null) {
            interfaceC43181jD3.mo31007L(this, true, z);
        }
    }

    @Override // p000.InterfaceC50621vm2
    public EnumC47065pm2 getLayoutDirection() {
        return this.f18182s;
    }

    @Override // p000.InterfaceC50621vm2
    /* renamed from: h */
    public InterfaceC45879nm2 mo8157h() {
        return m99806S();
    }

    /* renamed from: h0 */
    public InterfaceC51579xO2 m99775h0() {
        return this.f18178o;
    }

    /* renamed from: i0 */
    public final EnumC4230g m99773i0() {
        return this.f18188y;
    }

    /* renamed from: i1 */
    public final void m99772i1(boolean z) {
        boolean z2;
        if (this.f18181r != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            InterfaceC43181jD3 interfaceC43181jD3 = this.f18172i;
            if (interfaceC43181jD3 != null && !this.f18175l && !this.f18165b) {
                interfaceC43181jD3.mo31003P(this, true, z);
                C34999Om2.C6111a m99785c0 = m99785c0();
                Intrinsics.checkNotNull(m99785c0);
                m99785c0.m91493r1(z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    @Override // p000.InterfaceC31784At0
    /* renamed from: j */
    public void mo68273j() {
        AndroidViewHolder androidViewHolder = this.f18173j;
        if (androidViewHolder != null) {
            androidViewHolder.mo68273j();
        }
        this.f18164T = true;
        m99755p1();
    }

    /* renamed from: j0 */
    public final EnumC4230g m99771j0() {
        return this.f18189z;
    }

    @Override // p000.InterfaceC32018Bt0
    /* renamed from: k */
    public void mo99769k(InterfaceC41273g01 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.f18180q, value)) {
            this.f18180q = value;
            m99797W0();
        }
    }

    /* renamed from: k0 */
    public InterfaceC41563gV2 m99768k0() {
        return this.f18159K;
    }

    /* renamed from: k1 */
    public final void m99767k1(boolean z) {
        InterfaceC43181jD3 interfaceC43181jD3;
        if (!this.f18165b && (interfaceC43181jD3 = this.f18172i) != null) {
            InterfaceC43181jD3.m30982v(interfaceC43181jD3, this, false, z, 2, null);
        }
    }

    @Override // p000.InterfaceC31784At0
    /* renamed from: l */
    public void mo68271l() {
        AndroidViewHolder androidViewHolder = this.f18173j;
        if (androidViewHolder != null) {
            androidViewHolder.mo68271l();
        }
        if (this.f18164T) {
            this.f18164T = false;
        } else {
            m99755p1();
        }
        this.f18153E.m107683f();
    }

    /* renamed from: l0 */
    public final boolean m99766l0() {
        return this.f18162R;
    }

    @Override // p000.InterfaceC43181jD3.InterfaceC24738b
    /* renamed from: m */
    public void mo29723m() {
        H83 m99806S = m99806S();
        int m99169a = K83.m99169a(128);
        boolean m97661g = L83.m97661g(m99169a);
        InterfaceC41563gV2.AbstractC20914c mo94436h2 = m99806S.mo94436h2();
        if (m97661g || (mo94436h2 = mo94436h2.m39256O()) != null) {
            for (InterfaceC41563gV2.AbstractC20914c m104306m2 = m99806S.m104306m2(m97661g); m104306m2 != null && (m104306m2.m39262G() & m99169a) != 0; m104306m2 = m104306m2.m39261I()) {
                if ((m104306m2.m39258M() & m99169a) != 0 && (m104306m2 instanceof InterfaceC44100km2)) {
                    ((InterfaceC44100km2) m104306m2).mo28464t(m99806S());
                }
                if (m104306m2 == mo94436h2) {
                    return;
                }
            }
        }
    }

    /* renamed from: m0 */
    public final F83 m99764m0() {
        return this.f18153E;
    }

    /* renamed from: m1 */
    public final void m99763m1(boolean z) {
        InterfaceC43181jD3 interfaceC43181jD3;
        if (this.f18175l || this.f18165b || (interfaceC43181jD3 = this.f18172i) == null) {
            return;
        }
        InterfaceC43181jD3.m31010H(interfaceC43181jD3, this, false, z, 2, null);
        m99779f0().m91476p1(z);
    }

    @Override // p000.InterfaceC50621vm2
    /* renamed from: n */
    public boolean mo8156n() {
        return this.f18184u;
    }

    /* renamed from: n0 */
    public final H83 m99762n0() {
        return this.f18153E.m107675n();
    }

    @Override // p000.InterfaceC32018Bt0
    /* renamed from: o */
    public void mo99760o(InterfaceC51579xO2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.f18178o, value)) {
            this.f18178o = value;
            this.f18179p.m41996l(m99775h0());
            m99828G0();
        }
    }

    /* renamed from: o0 */
    public final InterfaceC43181jD3 m99759o0() {
        return this.f18172i;
    }

    /* renamed from: o1 */
    public final void m99758o1(C33829Jm2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (C4231h.$EnumSwitchMapping$0[it.m99792Z().ordinal()] == 1) {
            if (it.m99777g0()) {
                it.m99763m1(true);
                return;
            } else if (it.m99794Y()) {
                it.m99767k1(true);
                return;
            } else if (it.m99787b0()) {
                it.m99772i1(true);
                return;
            } else if (it.m99789a0()) {
                it.m99776g1(true);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + it.m99792Z());
    }

    @Override // p000.InterfaceC32018Bt0
    /* renamed from: p */
    public void mo99757p(InterfaceC41563gV2 value) {
        boolean z;
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f18165b && m99768k0() != InterfaceC41563gV2.f82354b0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f18159K = value;
            this.f18153E.m107663z(value);
            H83 m104310i2 = m99806S().m104310i2();
            for (H83 m99762n0 = m99762n0(); !Intrinsics.areEqual(m99762n0, m104310i2) && m99762n0 != null; m99762n0 = m99762n0.m104310i2()) {
                m99762n0.m104324U2(this.f18181r);
            }
            this.f18154F.m91529O();
            return;
        }
        throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
    }

    /* renamed from: p0 */
    public final C33829Jm2 m99756p0() {
        C33829Jm2 c33829Jm2 = this.f18171h;
        boolean z = false;
        if (c33829Jm2 != null && c33829Jm2.f18165b) {
            z = true;
        }
        if (z) {
            if (c33829Jm2 != null) {
                return c33829Jm2.m99756p0();
            }
            return null;
        }
        return c33829Jm2;
    }

    /* renamed from: p1 */
    public final void m99755p1() {
        this.f18153E.m107667v();
    }

    @Override // p000.InterfaceC32018Bt0
    /* renamed from: q */
    public void mo99754q(InterfaceC33869Jq6 interfaceC33869Jq6) {
        Intrinsics.checkNotNullParameter(interfaceC33869Jq6, "<set-?>");
        this.f18183t = interfaceC33869Jq6;
    }

    /* renamed from: q0 */
    public final int m99753q0() {
        return this.f18185v;
    }

    /* renamed from: q1 */
    public final void m99752q1() {
        LX2<C33829Jm2> m99736w0 = m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            int i = 0;
            do {
                C33829Jm2 c33829Jm2 = m96691s[i];
                EnumC4230g enumC4230g = c33829Jm2.f18150B;
                c33829Jm2.f18149A = enumC4230g;
                if (enumC4230g != EnumC4230g.NotUsed) {
                    c33829Jm2.m99752q1();
                }
                i++;
            } while (i < m96690u);
        }
    }

    /* renamed from: r0 */
    public int m99750r0() {
        return this.f18166c;
    }

    /* renamed from: r1 */
    public final void m99749r1(boolean z) {
        this.f18151C = z;
    }

    /* renamed from: s0 */
    public final C35467Qm2 m99747s0() {
        return this.f18156H;
    }

    /* renamed from: s1 */
    public final void m99746s1(boolean z) {
        this.f18158J = z;
    }

    /* renamed from: t0 */
    public InterfaceC33869Jq6 m99744t0() {
        return this.f18183t;
    }

    /* renamed from: t1 */
    public final void m99743t1(AndroidViewHolder androidViewHolder) {
        this.f18173j = androidViewHolder;
    }

    public String toString() {
        return C33100Gj2.m104826a(this, null) + " children: " + m99818M().size() + " measurePolicy: " + m99775h0();
    }

    /* renamed from: u0 */
    public int m99741u0() {
        return this.f18154F.m91543A();
    }

    /* renamed from: u1 */
    public final void m99740u1(EnumC4230g enumC4230g) {
        Intrinsics.checkNotNullParameter(enumC4230g, "<set-?>");
        this.f18149A = enumC4230g;
    }

    /* renamed from: v0 */
    public final LX2<C33829Jm2> m99739v0() {
        if (this.f18177n) {
            this.f18176m.m96696h();
            LX2<C33829Jm2> lx2 = this.f18176m;
            lx2.m96700c(lx2.m96690u(), m99736w0());
            this.f18176m.m96703G(f18148Z);
            this.f18177n = false;
        }
        return this.f18176m;
    }

    /* renamed from: v1 */
    public final void m99738v1(XC2 xc2) {
        if (!Intrinsics.areEqual(xc2, this.f18181r)) {
            this.f18181r = xc2;
            this.f18154F.m91535I(xc2);
            H83 m104310i2 = m99806S().m104310i2();
            for (H83 m99762n0 = m99762n0(); !Intrinsics.areEqual(m99762n0, m104310i2) && m99762n0 != null; m99762n0 = m99762n0.m104310i2()) {
                m99762n0.m104324U2(xc2);
            }
        }
    }

    /* renamed from: w0 */
    public final LX2<C33829Jm2> m99736w0() {
        m99836C1();
        if (this.f18167d == 0) {
            return this.f18168e.m93793f();
        }
        LX2<C33829Jm2> lx2 = this.f18169f;
        Intrinsics.checkNotNull(lx2);
        return lx2;
    }

    /* renamed from: w1 */
    public final void m99735w1(EnumC4230g enumC4230g) {
        Intrinsics.checkNotNullParameter(enumC4230g, "<set-?>");
        this.f18188y = enumC4230g;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0070  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m99734x(InterfaceC43181jD3 owner) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        H83 m99762n0;
        H83 m104310i2;
        Function1<? super InterfaceC43181jD3, Unit> function1;
        XC2 xc2;
        InterfaceC43181jD3 interfaceC43181jD3;
        InterfaceC43181jD3 interfaceC43181jD32;
        Intrinsics.checkNotNullParameter(owner, "owner");
        int i2 = 0;
        if (this.f18172i == null) {
            objArr = 1;
        } else {
            objArr = null;
        }
        XC2 xc22 = null;
        String str = null;
        if (objArr != null) {
            C33829Jm2 c33829Jm2 = this.f18171h;
            if (c33829Jm2 != null) {
                if (c33829Jm2 != null) {
                    interfaceC43181jD32 = c33829Jm2.f18172i;
                } else {
                    interfaceC43181jD32 = null;
                }
                if (!Intrinsics.areEqual(interfaceC43181jD32, owner)) {
                    objArr2 = null;
                    if (objArr2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Attaching to a different owner(");
                        sb.append(owner);
                        sb.append(") than the parent's owner(");
                        C33829Jm2 m99756p0 = m99756p0();
                        if (m99756p0 != null) {
                            interfaceC43181jD3 = m99756p0.f18172i;
                        } else {
                            interfaceC43181jD3 = null;
                        }
                        sb.append(interfaceC43181jD3);
                        sb.append("). This tree: ");
                        sb.append(m99835D(this, 0, 1, null));
                        sb.append(" Parent tree: ");
                        C33829Jm2 c33829Jm22 = this.f18171h;
                        if (c33829Jm22 != null) {
                            str = m99835D(c33829Jm22, 0, 1, null);
                        }
                        sb.append(str);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    C33829Jm2 m99756p02 = m99756p0();
                    if (m99756p02 == null) {
                        this.f18184u = true;
                    }
                    this.f18172i = owner;
                    if (m99756p02 != null) {
                        i = m99756p02.f18174k;
                    } else {
                        i = -1;
                    }
                    this.f18174k = i + 1;
                    if (C43570js5.m29803i(this) != null) {
                        owner.mo30998V();
                    }
                    owner.mo30993e(this);
                    if (m99756p02 != null && (xc2 = m99756p02.f18181r) != null) {
                        xc22 = xc2;
                    } else if (this.f18152D) {
                        xc22 = new XC2(this);
                    }
                    m99738v1(xc22);
                    this.f18153E.m107683f();
                    LX2<C33829Jm2> m93793f = this.f18168e.m93793f();
                    int m96690u = m93793f.m96690u();
                    if (m96690u > 0) {
                        C33829Jm2[] m96691s = m93793f.m96691s();
                        do {
                            m96691s[i2].m99734x(owner);
                            i2++;
                        } while (i2 < m96690u);
                        m99828G0();
                        if (m99756p02 != null) {
                            m99756p02.m99828G0();
                        }
                        m104310i2 = m99806S().m104310i2();
                        for (m99762n0 = m99762n0(); !Intrinsics.areEqual(m99762n0, m104310i2) && m99762n0 != null; m99762n0 = m99762n0.m104310i2()) {
                            m99762n0.m104362A2();
                        }
                        function1 = this.f18160P;
                        if (function1 != null) {
                            function1.invoke(owner);
                        }
                        this.f18154F.m91529O();
                        m99837C0();
                        return;
                    }
                    m99828G0();
                    if (m99756p02 != null) {
                    }
                    m104310i2 = m99806S().m104310i2();
                    while (!Intrinsics.areEqual(m99762n0, m104310i2)) {
                        m99762n0.m104362A2();
                    }
                    function1 = this.f18160P;
                    if (function1 != null) {
                    }
                    this.f18154F.m91529O();
                    m99837C0();
                    return;
                }
            }
            objArr2 = 1;
            if (objArr2 != null) {
            }
        } else {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + m99835D(this, 0, 1, null)).toString());
        }
    }

    /* renamed from: x0 */
    public final void m99733x0(long j, RM1<InterfaceC48105rX3> hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        m99762n0().m104302q2(H83.f12884A.m104289a(), m99762n0().m104320X1(j), hitTestResult, z, z2);
    }

    /* renamed from: x1 */
    public final void m99732x1(EnumC4230g enumC4230g) {
        Intrinsics.checkNotNullParameter(enumC4230g, "<set-?>");
        this.f18189z = enumC4230g;
    }

    /* renamed from: y */
    public final void m99731y() {
        LX2<C33829Jm2> m99736w0 = m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            int i = 0;
            do {
                C33829Jm2 c33829Jm2 = m96691s[i];
                if (c33829Jm2.f18186w != c33829Jm2.f18185v) {
                    m99793Y0();
                    m99832E0();
                    if (c33829Jm2.f18185v == Integer.MAX_VALUE) {
                        c33829Jm2.m99803T0();
                    }
                }
                i++;
            } while (i < m96690u);
        }
    }

    /* renamed from: y1 */
    public final void m99729y1(boolean z) {
        this.f18162R = z;
    }

    /* renamed from: z */
    public final void m99728z() {
        int i = 0;
        this.f18187x = 0;
        LX2<C33829Jm2> m99736w0 = m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            do {
                C33829Jm2 c33829Jm2 = m96691s[i];
                c33829Jm2.f18186w = c33829Jm2.f18185v;
                c33829Jm2.f18185v = Integer.MAX_VALUE;
                if (c33829Jm2.f18188y == EnumC4230g.InLayoutBlock) {
                    c33829Jm2.f18188y = EnumC4230g.NotUsed;
                }
                i++;
            } while (i < m96690u);
        }
    }

    /* renamed from: z0 */
    public final void m99727z0(long j, RM1<InterfaceC41791gs5> hitSemanticsEntities, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitSemanticsEntities, "hitSemanticsEntities");
        m99762n0().m104302q2(H83.f12884A.m104288b(), m99762n0().m104320X1(j), hitSemanticsEntities, true, z2);
    }

    /* renamed from: z1 */
    public final void m99726z1(Function1<? super InterfaceC43181jD3, Unit> function1) {
        this.f18160P = function1;
    }

    public C33829Jm2(boolean z, int i) {
        this.f18165b = z;
        this.f18166c = i;
        this.f18168e = new NX2<>(new LX2(new C33829Jm2[16], 0), new C4232i());
        this.f18176m = new LX2<>(new C33829Jm2[16], 0);
        this.f18177n = true;
        this.f18178o = f18145W;
        this.f18179p = new C40751f72(this);
        this.f18180q = C42459i01.m35404b(1.0f, 0.0f, 2, null);
        this.f18182s = EnumC47065pm2.Ltr;
        this.f18183t = f18147Y;
        this.f18185v = Integer.MAX_VALUE;
        this.f18186w = Integer.MAX_VALUE;
        EnumC4230g enumC4230g = EnumC4230g.NotUsed;
        this.f18188y = enumC4230g;
        this.f18189z = enumC4230g;
        this.f18149A = enumC4230g;
        this.f18150B = enumC4230g;
        this.f18153E = new F83(this);
        this.f18154F = new C34999Om2(this);
        this.f18158J = true;
        this.f18159K = InterfaceC41563gV2.f82354b0;
    }

    public /* synthetic */ C33829Jm2(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? C40605es5.f79036d.m42472a() : i);
    }
}
