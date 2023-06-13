package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.ER3;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003BA\u0012\f\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000e\u0012\u0010\u0010y\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0012\u000e\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u007f\u001a\u00020\u0004¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001d\u001a\u00020\u001c2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J?\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010#\u001a\u00020\u00042\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0$H\u0002¢\u0006\u0004\b&\u0010'JG\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u00042\u0014\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\tH\u0002¢\u0006\u0004\b*\u0010+JO\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0$H\u0002¢\u0006\u0004\b\u0001\u0010-J1\u0010/\u001a\u00020\u001c2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b/\u00100JI\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J]\u0010:\u001a\u00020\u001c2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000052\u0006\u0010.\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0016\u0010)\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t0\t2\u0006\u00108\u001a\u00020\u00042\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b:\u0010;JW\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010<\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0016\u0010)\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t0\t2\u0006\u00108\u001a\u00020\u00042\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b=\u0010>Jm\u0010A\u001a\u00020\u001c2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000052\u0006\u0010.\u001a\u00020\u00042\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010@\u001a\u00020\u00042\u0016\u0010)\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t0\t2\u0006\u00108\u001a\u00020\u00042\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010DJ;\u0010E\u001a\u0004\u0018\u00010\n2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\bE\u0010FJ?\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010G\u001a\u000201H\u0002¢\u0006\u0004\bH\u0010IJ1\u0010J\u001a\u00020\u001c2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\bJ\u0010KJA\u0010L\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010G\u001a\u000201H\u0002¢\u0006\u0004\bL\u0010IJ\u001c\u0010O\u001a\u00020\f2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0MH\u0002J1\u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\bP\u0010\u0013J7\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\bQ\u0010RJ,\u0010U\u001a\u00020\u00042\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0M2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u000201H\u0002JC\u0010W\u001a\u00020\u00042\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0M2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010T\u001a\u000201H\u0002¢\u0006\u0004\bW\u0010XJw\u0010\\\u001a\u00020\u00042\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0M2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00042\u0006\u0010T\u001a\u0002012\u0014\u0010[\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0Z2\u0014\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0ZH\u0002¢\u0006\u0004\b\\\u0010]JG\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010^\u001a\u00028\u00002\u0006\u0010_\u001a\u000201H\u0002¢\u0006\u0004\b`\u00104J\u001e\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0a2\u0006\u0010.\u001a\u00020\u0004H\u0002J\u000f\u0010c\u001a\u00020\u0004H\u0000¢\u0006\u0004\bc\u0010dJ\u000e\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000eH\u0016J\u0017\u0010g\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\bg\u0010hJ\u0016\u0010i\u001a\u00020\f2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016J\u001f\u0010g\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\bg\u0010jJ\u001e\u0010i\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016J\u0018\u0010k\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\bm\u0010lJ\u0016\u0010n\u001a\u00020\f2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016J\u001a\u0010o\u001a\u00020\f2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0MJ \u0010p\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bp\u0010qJ\u000f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000rH\u0096\u0002J\u000e\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000tH\u0016J\u0016\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t2\u0006\u0010.\u001a\u00020\u0004H\u0016R\u001c\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010vR \u0010y\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010xR\u001e\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010xR\"\u0010\u007f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010!\u001a\u0004\b|\u0010d\"\u0004\b}\u0010~R\u0019\u0010\u0082\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b|\u0010\u0081\u0001R:\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0011\u0010\u0083\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0000@BX\u0080\u000e¢\u0006\r\n\u0005\b\u0084\u0001\u0010x\u001a\u0004\b^\u0010\u0018R7\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000f\u0010\u0083\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010x\u001a\u0005\b\u0085\u0001\u0010\u0018R'\u0010\u0006\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010!\u001a\u0005\b\u0087\u0001\u0010d¨\u0006\u008a\u0001"}, m28432d2 = {"LPR3;", "E", "Lkotlin/collections/AbstractMutableList;", "LER3$a;", "", "S", "size", "Y", "X", "", "", "buffer", "", "u", "([Ljava/lang/Object;)Z", "w", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "x", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "z", "(Ljava/lang/Object;)[Ljava/lang/Object;", "y", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "", "H", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "I", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "b", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", "F", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "s", "([Ljava/lang/Object;ILjava/lang/Object;)V", "LSd3;", "elementCarry", "o", "([Ljava/lang/Object;IILjava/lang/Object;LSd3;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "j", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "U", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "V", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", C17296a.f69688o, "(I)[Ljava/lang/Object;", "Q", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "O", "([Ljava/lang/Object;IILSd3;)[Ljava/lang/Object;", "D", "([Ljava/lang/Object;II)V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lkotlin/Function1;", "predicate", "L", "R", "A", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", "M", "bufferSize", "K", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILSd3;)I", "toBufferSize", "", "recyclableBuffers", "J", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILSd3;Ljava/util/List;Ljava/util/List;)I", "e", "oldElementCarry", "T", "", "v", "c", "()I", "LER3;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "add", "(Ljava/lang/Object;)Z", "addAll", "(ILjava/lang/Object;)V", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAll", "N", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "", "listIterator", "LER3;", "vector", "[Ljava/lang/Object;", "vectorRoot", DateTokenConverter.CONVERTER_KEY, "vectorTail", "f", "setRootShift$runtime_release", "(I)V", "rootShift", "LpX2;", "LpX2;", "ownership", "<set-?>", "g", "h", "i", "getSize", "<init>", "(LER3;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,992:1\n26#2:993\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n623#1:993\n*E\n"})
/* renamed from: PR3 */
/* loaded from: classes.dex */
public final class PR3<E> extends AbstractMutableList<E> implements ER3.InterfaceC1825a<E> {

    /* renamed from: b */
    public ER3<? extends E> f28484b;

    /* renamed from: c */
    public Object[] f28485c;

    /* renamed from: d */
    public Object[] f28486d;

    /* renamed from: e */
    public int f28487e;

    /* renamed from: f */
    public C46918pX2 f28488f;

    /* renamed from: g */
    public Object[] f28489g;

    /* renamed from: h */
    public Object[] f28490h;

    /* renamed from: i */
    public int f28491i;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PR3$a */
    /* loaded from: classes.dex */
    public static final class C6364a extends Lambda implements Function1<E, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ Collection<E> f28492g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6364a(Collection<? extends E> collection) {
            super(1);
            this.f28492g = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(E e) {
            return Boolean.valueOf(this.f28492g.contains(e));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((C6364a) obj);
        }
    }

    public PR3(ER3<? extends E> vector, Object[] objArr, Object[] vectorTail, int i) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        Intrinsics.checkNotNullParameter(vectorTail, "vectorTail");
        this.f28484b = vector;
        this.f28485c = objArr;
        this.f28486d = vectorTail;
        this.f28487e = i;
        this.f28488f = new C46918pX2();
        this.f28489g = this.f28485c;
        this.f28490h = this.f28486d;
        this.f28491i = this.f28484b.size();
    }

    /* renamed from: A */
    public final Object[] m90288A(Object[] objArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 == 0) {
                return objArr;
            }
            int m80985a = C36371Ui6.m80985a(i, i2);
            Object obj = objArr[m80985a];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object m90288A = m90288A((Object[]) obj, i, i2 - 5);
            if (m80985a < 31) {
                int i3 = m80985a + 1;
                if (objArr[i3] != null) {
                    if (m90258u(objArr)) {
                        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i3, 32);
                    }
                    objArr = ArraysKt___ArraysJvmKt.copyInto(objArr, m90254y(), 0, 0, i3);
                }
            }
            if (m90288A != objArr[m80985a]) {
                Object[] m90256w = m90256w(objArr);
                m90256w[m80985a] = m90288A;
                return m90256w;
            }
            return objArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: C */
    public final Object[] m90287C(Object[] objArr, int i, int i2, C35855Sd3 c35855Sd3) {
        Object[] m90287C;
        int m80985a = C36371Ui6.m80985a(i2 - 1, i);
        if (i == 5) {
            c35855Sd3.m85177b(objArr[m80985a]);
            m90287C = null;
        } else {
            Object obj = objArr[m80985a];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            m90287C = m90287C((Object[]) obj, i - 5, i2, c35855Sd3);
        }
        if (m90287C == null && m80985a == 0) {
            return null;
        }
        Object[] m90256w = m90256w(objArr);
        m90256w[m80985a] = m90287C;
        return m90256w;
    }

    /* renamed from: D */
    public final void m90286D(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f28489g = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f28490h = objArr;
            this.f28491i = i;
            this.f28487e = i2;
            return;
        }
        C35855Sd3 c35855Sd3 = new C35855Sd3(null);
        Intrinsics.checkNotNull(objArr);
        Object[] m90287C = m90287C(objArr, i2, i, c35855Sd3);
        Intrinsics.checkNotNull(m90287C);
        Object m85178a = c35855Sd3.m85178a();
        Intrinsics.checkNotNull(m85178a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f28490h = (Object[]) m85178a;
        this.f28491i = i;
        if (m90287C[1] == null) {
            this.f28489g = (Object[]) m90287C[0];
            this.f28487e = i2 - 5;
            return;
        }
        this.f28489g = m90287C;
        this.f28487e = i2;
    }

    /* renamed from: E */
    public final Object[] m90285E(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        boolean z;
        if (it.hasNext()) {
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 == 0) {
                    return it.next();
                }
                Object[] m90256w = m90256w(objArr);
                int m80985a = C36371Ui6.m80985a(i, i2);
                int i3 = i2 - 5;
                m90256w[m80985a] = m90285E((Object[]) m90256w[m80985a], i, i3, it);
                while (true) {
                    m80985a++;
                    if (m80985a >= 32 || !it.hasNext()) {
                        break;
                    }
                    m90256w[m80985a] = m90285E((Object[]) m90256w[m80985a], 0, i3, it);
                }
                return m90256w;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: F */
    public final Object[] m90284F(Object[] objArr, int i, Object[][] objArr2) {
        Object[] m90256w;
        Iterator<Object[]> it = ArrayIteratorKt.iterator(objArr2);
        int i2 = i >> 5;
        int i3 = this.f28487e;
        if (i2 < (1 << i3)) {
            m90256w = m90285E(objArr, i, i3, it);
        } else {
            m90256w = m90256w(objArr);
        }
        while (it.hasNext()) {
            this.f28487e += 5;
            m90256w = m90253z(m90256w);
            int i4 = this.f28487e;
            m90285E(m90256w, 1 << i4, i4, it);
        }
        return m90256w;
    }

    /* renamed from: H */
    public final void m90283H(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f28487e;
        if (size > (1 << i)) {
            this.f28489g = m90282I(m90253z(objArr), objArr2, this.f28487e + 5);
            this.f28490h = objArr3;
            this.f28487e += 5;
            this.f28491i = size() + 1;
        } else if (objArr == null) {
            this.f28489g = objArr2;
            this.f28490h = objArr3;
            this.f28491i = size() + 1;
        } else {
            this.f28489g = m90282I(objArr, objArr2, i);
            this.f28490h = objArr3;
            this.f28491i = size() + 1;
        }
    }

    /* renamed from: I */
    public final Object[] m90282I(Object[] objArr, Object[] objArr2, int i) {
        int m80985a = C36371Ui6.m80985a(size() - 1, i);
        Object[] m90256w = m90256w(objArr);
        if (i == 5) {
            m90256w[m80985a] = objArr2;
        } else {
            m90256w[m80985a] = m90282I((Object[]) m90256w[m80985a], objArr2, i - 5);
        }
        return m90256w;
    }

    /* renamed from: J */
    public final int m90281J(Function1<? super E, Boolean> function1, Object[] objArr, int i, int i2, C35855Sd3 c35855Sd3, List<Object[]> list, List<Object[]> list2) {
        Object[] m90254y;
        if (m90258u(objArr)) {
            list.add(objArr);
        }
        Object m85178a = c35855Sd3.m85178a();
        Intrinsics.checkNotNull(m85178a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) m85178a;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!function1.invoke(obj).booleanValue()) {
                if (i2 == 32) {
                    if (!list.isEmpty()) {
                        m90254y = list.remove(list.size() - 1);
                    } else {
                        m90254y = m90254y();
                    }
                    objArr3 = m90254y;
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        c35855Sd3.m85177b(objArr3);
        if (objArr2 != c35855Sd3.m85178a()) {
            list2.add(objArr2);
        }
        return i2;
    }

    /* renamed from: K */
    public final int m90280K(Function1<? super E, Boolean> function1, Object[] objArr, int i, C35855Sd3 c35855Sd3) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (function1.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr2 = m90256w(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        c35855Sd3.m85177b(objArr2);
        return i2;
    }

    /* renamed from: L */
    public final boolean m90279L(Function1<? super E, Boolean> function1) {
        Object[] m90285E;
        int m90269X = m90269X();
        C35855Sd3 c35855Sd3 = new C35855Sd3(null);
        if (this.f28489g == null) {
            if (m90278M(function1, m90269X, c35855Sd3) == m90269X) {
                return false;
            }
            return true;
        }
        ListIterator<Object[]> m90257v = m90257v(0);
        int i = 32;
        while (i == 32 && m90257v.hasNext()) {
            i = m90280K(function1, m90257v.next(), 32, c35855Sd3);
        }
        if (i == 32) {
            C49464tp0.m11730a(!m90257v.hasNext());
            int m90278M = m90278M(function1, m90269X, c35855Sd3);
            if (m90278M == 0) {
                m90286D(this.f28489g, size(), this.f28487e);
            }
            if (m90278M == m90269X) {
                return false;
            }
            return true;
        }
        int previousIndex = m90257v.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = i;
        while (m90257v.hasNext()) {
            i2 = m90281J(function1, m90257v.next(), 32, i2, c35855Sd3, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i3 = previousIndex;
        int m90281J = m90281J(function1, this.f28490h, m90269X, i2, c35855Sd3, arrayList2, arrayList);
        Object m85178a = c35855Sd3.m85178a();
        Intrinsics.checkNotNull(m85178a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) m85178a;
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, m90281J, 32);
        if (arrayList.isEmpty()) {
            m90285E = this.f28489g;
            Intrinsics.checkNotNull(m90285E);
        } else {
            m90285E = m90285E(this.f28489g, i3, this.f28487e, arrayList.iterator());
        }
        int size = i3 + (arrayList.size() << 5);
        this.f28489g = m90274R(m90285E, size);
        this.f28490h = objArr;
        this.f28491i = size + m90281J;
        return true;
    }

    /* renamed from: M */
    public final int m90278M(Function1<? super E, Boolean> function1, int i, C35855Sd3 c35855Sd3) {
        boolean z;
        int m90280K = m90280K(function1, this.f28490h, i, c35855Sd3);
        if (m90280K == i) {
            if (c35855Sd3.m85178a() == this.f28490h) {
                z = true;
            } else {
                z = false;
            }
            C49464tp0.m11730a(z);
            return i;
        }
        Object m85178a = c35855Sd3.m85178a();
        Intrinsics.checkNotNull(m85178a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) m85178a;
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, m90280K, i);
        this.f28490h = objArr;
        this.f28491i = size() - (i - m90280K);
        return m90280K;
    }

    /* renamed from: N */
    public final boolean m90277N(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean m90279L = m90279L(predicate);
        if (m90279L) {
            ((AbstractList) this).modCount++;
        }
        return m90279L;
    }

    /* renamed from: O */
    public final Object[] m90276O(Object[] objArr, int i, int i2, C35855Sd3 c35855Sd3) {
        Object[] copyInto;
        int m80985a = C36371Ui6.m80985a(i2, i);
        int i3 = 31;
        if (i == 0) {
            Object obj = objArr[m80985a];
            copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, m90256w(objArr), m80985a, m80985a + 1, 32);
            copyInto[31] = c35855Sd3.m85178a();
            c35855Sd3.m85177b(obj);
            return copyInto;
        }
        if (objArr[31] == null) {
            i3 = C36371Ui6.m80985a(m90273S() - 1, i);
        }
        Object[] m90256w = m90256w(objArr);
        int i4 = i - 5;
        int i5 = m80985a + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj2 = m90256w[i3];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                m90256w[i3] = m90276O((Object[]) obj2, i4, 0, c35855Sd3);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = m90256w[m80985a];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m90256w[m80985a] = m90276O((Object[]) obj3, i4, i2, c35855Sd3);
        return m90256w;
    }

    /* renamed from: Q */
    public final Object m90275Q(Object[] objArr, int i, int i2, int i3) {
        boolean z;
        Object[] copyInto;
        int size = size() - i;
        if (i3 < size) {
            z = true;
        } else {
            z = false;
        }
        C49464tp0.m11730a(z);
        if (size == 1) {
            Object obj = this.f28490h[0];
            m90286D(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.f28490h;
        Object obj2 = objArr2[i3];
        copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr2, m90256w(objArr2), i3, i3 + 1, size);
        copyInto[size - 1] = null;
        this.f28489g = objArr;
        this.f28490h = copyInto;
        this.f28491i = (i + size) - 1;
        this.f28487e = i2;
        return obj2;
    }

    /* renamed from: R */
    public final Object[] m90274R(Object[] objArr, int i) {
        boolean z;
        if ((i & 31) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                this.f28487e = 0;
                return null;
            }
            int i2 = i - 1;
            while (true) {
                int i3 = this.f28487e;
                if ((i2 >> i3) == 0) {
                    this.f28487e = i3 - 5;
                    Object[] objArr2 = objArr[0];
                    Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr = objArr2;
                } else {
                    return m90288A(objArr, i2, i3);
                }
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: S */
    public final int m90273S() {
        if (size() <= 32) {
            return 0;
        }
        return C36371Ui6.m80982d(size());
    }

    /* renamed from: T */
    public final Object[] m90272T(Object[] objArr, int i, int i2, E e, C35855Sd3 c35855Sd3) {
        int m80985a = C36371Ui6.m80985a(i2, i);
        Object[] m90256w = m90256w(objArr);
        if (i == 0) {
            if (m90256w != objArr) {
                ((AbstractList) this).modCount++;
            }
            c35855Sd3.m85177b(m90256w[m80985a]);
            m90256w[m80985a] = e;
            return m90256w;
        }
        Object obj = m90256w[m80985a];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m90256w[m80985a] = m90272T((Object[]) obj, i - 5, i2, e, c35855Sd3);
        return m90256w;
    }

    /* renamed from: U */
    public final Object[] m90271U(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f28489g != null) {
            ListIterator<Object[]> m90257v = m90257v(m90273S() >> 5);
            while (m90257v.previousIndex() != i) {
                Object[] previous = m90257v.previous();
                ArraysKt___ArraysJvmKt.copyInto(previous, objArr2, 0, 32 - i2, 32);
                objArr2 = m90255x(previous, i2);
                i3--;
                objArr[i3] = objArr2;
            }
            return m90257v.previous();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: V */
    public final void m90270V(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        boolean z;
        Object[] m90254y;
        if (i3 >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] m90256w = m90256w(objArr);
            objArr2[0] = m90256w;
            int i4 = i & 31;
            int size = ((i + collection.size()) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                ArraysKt___ArraysJvmKt.copyInto(m90256w, objArr3, size + 1, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    m90254y = m90256w;
                } else {
                    m90254y = m90254y();
                    i3--;
                    objArr2[i3] = m90254y;
                }
                int i7 = i2 - i6;
                ArraysKt___ArraysJvmKt.copyInto(m90256w, objArr3, 0, i7, i2);
                ArraysKt___ArraysJvmKt.copyInto(m90256w, m90254y, size + 1, i4, i7);
                objArr3 = m90254y;
            }
            Iterator<? extends E> it = collection.iterator();
            m90266b(m90256w, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                objArr2[i8] = m90266b(m90254y(), 0, it);
            }
            m90266b(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: X */
    public final int m90269X() {
        return m90268Y(size());
    }

    /* renamed from: Y */
    public final int m90268Y(int i) {
        return i <= 32 ? i : i - C36371Ui6.m80982d(i);
    }

    /* renamed from: a */
    public final Object[] m90267a(int i) {
        if (m90273S() <= i) {
            return this.f28490h;
        }
        Object[] objArr = this.f28489g;
        Intrinsics.checkNotNull(objArr);
        for (int i2 = this.f28487e; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[C36371Ui6.m80985a(i, i2)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ((AbstractList) this).modCount++;
        int m90269X = m90269X();
        if (m90269X < 32) {
            Object[] m90256w = m90256w(this.f28490h);
            m90256w[m90269X] = e;
            this.f28490h = m90256w;
            this.f28491i = size() + 1;
        } else {
            m90283H(this.f28489g, this.f28490h, m90253z(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int m90269X = m90269X();
        Iterator<? extends E> it = elements.iterator();
        if (32 - m90269X >= elements.size()) {
            this.f28490h = m90266b(m90256w(this.f28490h), m90269X, it);
            this.f28491i = size() + elements.size();
        } else {
            int size = ((elements.size() + m90269X) - 1) / 32;
            Object[][] objArr = new Object[size];
            objArr[0] = m90266b(m90256w(this.f28490h), m90269X, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = m90266b(m90254y(), 0, it);
            }
            this.f28489g = m90284F(this.f28489g, m90273S(), objArr);
            this.f28490h = m90266b(m90254y(), 0, it);
            this.f28491i = size() + elements.size();
        }
        return true;
    }

    /* renamed from: b */
    public final Object[] m90266b(Object[] objArr, int i, Iterator<? extends Object> it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    @Override // p000.ER3.InterfaceC1825a
    public ER3<E> build() {
        OR3 or3;
        boolean z;
        if (this.f28489g == this.f28485c && this.f28490h == this.f28486d) {
            or3 = this.f28484b;
        } else {
            this.f28488f = new C46918pX2();
            Object[] objArr = this.f28489g;
            this.f28485c = objArr;
            Object[] objArr2 = this.f28490h;
            this.f28486d = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    or3 = C36371Ui6.m80984b();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f28490h, size());
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    or3 = new C47936rE5(copyOf);
                }
            } else {
                Object[] objArr3 = this.f28489g;
                Intrinsics.checkNotNull(objArr3);
                or3 = new OR3(objArr3, this.f28490h, size(), this.f28487e);
            }
        }
        this.f28484b = or3;
        return (ER3<E>) or3;
    }

    /* renamed from: c */
    public final int m90265c() {
        return ((AbstractList) this).modCount;
    }

    /* renamed from: e */
    public final Object[] m90264e() {
        return this.f28489g;
    }

    /* renamed from: f */
    public final int m90263f() {
        return this.f28487e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        C38213as2.m65373a(i, size());
        return (E) m90267a(i)[i & 31];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.f28491i;
    }

    /* renamed from: h */
    public final Object[] m90262h() {
        return this.f28490h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    /* renamed from: j */
    public final void m90261j(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f28489g != null) {
            int i4 = i >> 5;
            Object[] m90271U = m90271U(i4, i2, objArr, i3, objArr2);
            int m90273S = i3 - (((m90273S() >> 5) - 1) - i4);
            if (m90273S < i3) {
                objArr2 = objArr[m90273S];
                Intrinsics.checkNotNull(objArr2);
            }
            m90270V(collection, i, m90271U, 32, objArr, m90273S, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: o */
    public final Object[] m90260o(Object[] objArr, int i, int i2, Object obj, C35855Sd3 c35855Sd3) {
        Object obj2;
        Object[] copyInto;
        int m80985a = C36371Ui6.m80985a(i2, i);
        if (i == 0) {
            c35855Sd3.m85177b(objArr[31]);
            copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, m90256w(objArr), m80985a + 1, m80985a, 31);
            copyInto[m80985a] = obj;
            return copyInto;
        }
        Object[] m90256w = m90256w(objArr);
        int i3 = i - 5;
        Object obj3 = m90256w[m80985a];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m90256w[m80985a] = m90260o((Object[]) obj3, i3, i2, obj, c35855Sd3);
        while (true) {
            m80985a++;
            if (m80985a >= 32 || (obj2 = m90256w[m80985a]) == null) {
                break;
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            m90256w[m80985a] = m90260o((Object[]) obj2, i3, 0, c35855Sd3.m85178a(), c35855Sd3);
        }
        return m90256w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m90277N(new C6364a(elements));
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        C38213as2.m65373a(i, size());
        ((AbstractList) this).modCount++;
        int m90273S = m90273S();
        if (i >= m90273S) {
            return (E) m90275Q(this.f28489g, m90273S, this.f28487e, i - m90273S);
        }
        C35855Sd3 c35855Sd3 = new C35855Sd3(this.f28490h[0]);
        Object[] objArr = this.f28489g;
        Intrinsics.checkNotNull(objArr);
        m90275Q(m90276O(objArr, this.f28487e, i, c35855Sd3), m90273S, this.f28487e, 0);
        return (E) c35855Sd3.m85178a();
    }

    /* renamed from: s */
    public final void m90259s(Object[] objArr, int i, E e) {
        int m90269X = m90269X();
        Object[] m90256w = m90256w(this.f28490h);
        if (m90269X < 32) {
            ArraysKt___ArraysJvmKt.copyInto(this.f28490h, m90256w, i + 1, i, m90269X);
            m90256w[i] = e;
            this.f28489g = objArr;
            this.f28490h = m90256w;
            this.f28491i = size() + 1;
            return;
        }
        Object[] objArr2 = this.f28490h;
        Object obj = objArr2[31];
        ArraysKt___ArraysJvmKt.copyInto(objArr2, m90256w, i + 1, i, 31);
        m90256w[i] = e;
        m90283H(objArr, m90256w, m90253z(obj));
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        C38213as2.m65373a(i, size());
        if (m90273S() <= i) {
            Object[] m90256w = m90256w(this.f28490h);
            if (m90256w != this.f28490h) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) m90256w[i2];
            m90256w[i2] = e;
            this.f28490h = m90256w;
            return e2;
        }
        C35855Sd3 c35855Sd3 = new C35855Sd3(null);
        Object[] objArr = this.f28489g;
        Intrinsics.checkNotNull(objArr);
        this.f28489g = m90272T(objArr, this.f28487e, i, e, c35855Sd3);
        return (E) c35855Sd3.m85178a();
    }

    /* renamed from: u */
    public final boolean m90258u(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f28488f;
    }

    /* renamed from: v */
    public final ListIterator<Object[]> m90257v(int i) {
        if (this.f28489g != null) {
            int m90273S = m90273S() >> 5;
            C38213as2.m65372b(i, m90273S);
            int i2 = this.f28487e;
            if (i2 == 0) {
                Object[] objArr = this.f28489g;
                Intrinsics.checkNotNull(objArr);
                return new C43758kB5(objArr, i);
            }
            Object[] objArr2 = this.f28489g;
            Intrinsics.checkNotNull(objArr2);
            return new C46949pa6(objArr2, i, m90273S, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: w */
    public final Object[] m90256w(Object[] objArr) {
        int coerceAtMost;
        Object[] copyInto$default;
        if (objArr == null) {
            return m90254y();
        }
        if (m90258u(objArr)) {
            return objArr;
        }
        Object[] m90254y = m90254y();
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(objArr.length, 32);
        copyInto$default = ArraysKt___ArraysJvmKt.copyInto$default(objArr, m90254y, 0, 0, coerceAtMost, 6, (Object) null);
        return copyInto$default;
    }

    /* renamed from: x */
    public final Object[] m90255x(Object[] objArr, int i) {
        Object[] copyInto;
        Object[] copyInto2;
        if (m90258u(objArr)) {
            copyInto2 = ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i, 0, 32 - i);
            return copyInto2;
        }
        copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, m90254y(), i, 0, 32 - i);
        return copyInto;
    }

    /* renamed from: y */
    public final Object[] m90254y() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f28488f;
        return objArr;
    }

    /* renamed from: z */
    public final Object[] m90253z(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f28488f;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        C38213as2.m65372b(i, size());
        return new RR3(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        C38213as2.m65372b(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int m90273S = m90273S();
        if (i >= m90273S) {
            m90259s(this.f28489g, i - m90273S, e);
            return;
        }
        C35855Sd3 c35855Sd3 = new C35855Sd3(null);
        Object[] objArr = this.f28489g;
        Intrinsics.checkNotNull(objArr);
        m90259s(m90260o(objArr, this.f28487e, i, e, c35855Sd3), 0, c35855Sd3.m85178a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> elements) {
        Object[] copyInto;
        Object[] copyInto2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        C38213as2.m65372b(i, size());
        if (i == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + elements.size()) - 1) / 32;
        if (size == 0) {
            C49464tp0.m11730a(i >= m90273S());
            int i3 = i & 31;
            Object[] objArr = this.f28490h;
            copyInto2 = ArraysKt___ArraysJvmKt.copyInto(objArr, m90256w(objArr), (((i + elements.size()) - 1) & 31) + 1, i3, m90269X());
            m90266b(copyInto2, i3, elements.iterator());
            this.f28490h = copyInto2;
            this.f28491i = size() + elements.size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int m90269X = m90269X();
        int m90268Y = m90268Y(size() + elements.size());
        if (i >= m90273S()) {
            copyInto = m90254y();
            m90270V(elements, i, this.f28490h, m90269X, objArr2, size, copyInto);
        } else if (m90268Y <= m90269X) {
            int i4 = m90269X - m90268Y;
            copyInto = ArraysKt___ArraysJvmKt.copyInto(this.f28490h, m90254y(), 0, i4, m90269X);
            int i5 = 32 - i4;
            Object[] m90255x = m90255x(this.f28490h, i5);
            int i6 = size - 1;
            objArr2[i6] = m90255x;
            m90261j(elements, i, i5, objArr2, i6, m90255x);
        } else {
            int i7 = m90268Y - m90269X;
            copyInto = m90255x(this.f28490h, i7);
            m90261j(elements, i, i7, objArr2, size, copyInto);
        }
        this.f28489g = m90284F(this.f28489g, i2, objArr2);
        this.f28490h = copyInto;
        this.f28491i = size() + elements.size();
        return true;
    }
}
