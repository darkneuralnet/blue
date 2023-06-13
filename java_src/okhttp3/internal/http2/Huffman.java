package okhttp3.internal.http2;

import androidx.recyclerview.widget.C11925l;
import com.google.android.gms.location.places.Place;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lokhttp3/internal/http2/Huffman;", "", "", "symbol", PaymentMethodOptionsParams.Blik.PARAM_CODE, "codeBitCount", "", "addCode", "LM70;", Stripe3ds2AuthParams.FIELD_SOURCE, "Ln30;", "sink", "encode", "bytes", "encodedLength", "Lo30;", "", "byteCount", "decode", "", "CODES", "[I", "", "CODE_BIT_COUNTS", "[B", "Lokhttp3/internal/http2/Huffman$Node;", "root", "Lokhttp3/internal/http2/Huffman$Node;", "<init>", "()V", "Node", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class Huffman {
    private static final byte[] CODE_BIT_COUNTS;
    public static final Huffman INSTANCE = new Huffman();
    private static final int[] CODES = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, Place.TYPE_POSTAL_CODE_PREFIX, Place.TYPE_POSTAL_TOWN, 4090, 8185, 21, 248, 2042, Place.TYPE_PREMISE, Place.TYPE_ROOM, 249, 2043, C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, Place.TYPE_ROUTE, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final Node root = new Node();

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        CODE_BIT_COUNTS = bArr;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            INSTANCE.addCode(i, CODES[i], CODE_BIT_COUNTS[i]);
        }
    }

    private Huffman() {
    }

    private final void addCode(int i, int i2, int i3) {
        Node node = new Node(i, i3);
        Node node2 = root;
        while (i3 > 8) {
            i3 -= 8;
            int i4 = (i2 >>> i3) & KotlinVersion.MAX_COMPONENT_VALUE;
            Node[] children = node2.getChildren();
            Intrinsics.checkNotNull(children);
            Node node3 = children[i4];
            if (node3 == null) {
                node3 = new Node();
                children[i4] = node3;
            }
            node2 = node3;
        }
        int i5 = 8 - i3;
        int i6 = (i2 << i5) & KotlinVersion.MAX_COMPONENT_VALUE;
        Node[] children2 = node2.getChildren();
        Intrinsics.checkNotNull(children2);
        ArraysKt___ArraysJvmKt.fill(children2, node, i6, (1 << i5) + i6);
    }

    public final void decode(InterfaceC46046o30 source, long j, InterfaceC45453n30 sink) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Node node = root;
        int i = 0;
        long j2 = 0;
        int i2 = 0;
        while (j2 < j) {
            j2++;
            i = (i << 8) | Util.and(source.readByte(), (int) KotlinVersion.MAX_COMPONENT_VALUE);
            i2 += 8;
            while (i2 >= 8) {
                int i3 = (i >>> (i2 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                Node[] children = node.getChildren();
                Intrinsics.checkNotNull(children);
                node = children[i3];
                Intrinsics.checkNotNull(node);
                if (node.getChildren() == null) {
                    sink.mo24534M0(node.getSymbol());
                    i2 -= node.getTerminalBitCount();
                    node = root;
                } else {
                    i2 -= 8;
                }
            }
        }
        while (i2 > 0) {
            int i4 = (i << (8 - i2)) & KotlinVersion.MAX_COMPONENT_VALUE;
            Node[] children2 = node.getChildren();
            Intrinsics.checkNotNull(children2);
            Node node2 = children2[i4];
            Intrinsics.checkNotNull(node2);
            if (node2.getChildren() == null && node2.getTerminalBitCount() <= i2) {
                sink.mo24534M0(node2.getSymbol());
                i2 -= node2.getTerminalBitCount();
                node = root;
            } else {
                return;
            }
        }
    }

    public final void encode(M70 source, InterfaceC45453n30 sink) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int size = source.size();
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int i3 = i + 1;
            int and = Util.and(source.m95808e(i), (int) KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = CODES[and];
            byte b = CODE_BIT_COUNTS[and];
            j = (j << b) | i4;
            i2 += b;
            while (i2 >= 8) {
                i2 = (i2 == true ? 1 : 0) - 8;
                sink.mo24534M0((int) (j >> i2));
            }
            i = i3;
        }
        if (i2 > 0) {
            sink.mo24534M0((int) ((j << (8 - i2)) | (255 >>> i2)));
        }
    }

    public final int encodedLength(M70 bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int size = bytes.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            j += CODE_BIT_COUNTS[Util.and(bytes.m95808e(i), (int) KotlinVersion.MAX_COMPONENT_VALUE)];
            i = i2;
        }
        return (int) ((j + 7) >> 3);
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u001d\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m28432d2 = {"Lokhttp3/internal/http2/Huffman$Node;", "", "()V", "symbol", "", "bits", "(II)V", "children", "", "getChildren", "()[Lokhttp3/internal/http2/Huffman$Node;", "[Lokhttp3/internal/http2/Huffman$Node;", "getSymbol", "()I", "terminalBitCount", "getTerminalBitCount", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* loaded from: classes8.dex */
    public static final class Node {
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
            this.children = new Node[256];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        public final Node[] getChildren() {
            return this.children;
        }

        public final int getSymbol() {
            return this.symbol;
        }

        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }

        public Node(int i, int i2) {
            this.children = null;
            this.symbol = i;
            int i3 = i2 & 7;
            this.terminalBitCount = i3 == 0 ? 8 : i3;
        }
    }
}
