package p000;

import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.InterfaceC36230Tt0;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b¢\u0006\u0004\b(\u0010)J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0001\u0001*¨\u0006+"}, m28432d2 = {"LvK2;", "Key", "Value", "Collection", "", "Builder", "Ll0;", "", "LTt0;", "decoder", "builder", "", "startIndex", "size", "", "o", "(LTt0;Ljava/util/Map;II)V", "index", "", "checkIndex", "p", "(LTt0;ILjava/util/Map;Z)V", "Lrb1;", "encoder", "value", "serialize", "(Lrb1;Ljava/lang/Object;)V", "LKj2;", C17296a.f69688o, "LKj2;", "m", "()LKj2;", "keySerializer", "b", "n", "valueSerializer", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "(LKj2;LKj2;)V", "LQr2;", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,283:1\n1#2:284\n488#3,2:285\n490#3,2:289\n32#4,2:287\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n*L\n118#1:285,2\n118#1:289,2\n121#1:287,2\n*E\n"})
/* renamed from: vK2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC50357vK2<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC25581l0<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a */
    public final InterfaceC34036Kj2<Key> f113836a;

    /* renamed from: b */
    public final InterfaceC34036Kj2<Value> f113837b;

    public /* synthetic */ AbstractC50357vK2(InterfaceC34036Kj2 interfaceC34036Kj2, InterfaceC34036Kj2 interfaceC34036Kj22, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC34036Kj2, interfaceC34036Kj22);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public abstract InterfaceC34588Ms5 getDescriptor();

    /* renamed from: m */
    public final InterfaceC34036Kj2<Key> m8896m() {
        return this.f113836a;
    }

    /* renamed from: n */
    public final InterfaceC34036Kj2<Value> m8895n() {
        return this.f113837b;
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: o */
    public final void mo8897g(InterfaceC36230Tt0 decoder, Builder builder, int i, int i2) {
        boolean z;
        IntRange until;
        IntProgression step;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            until = RangesKt___RangesKt.until(0, i2 * 2);
            step = RangesKt___RangesKt.step(until, 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
                return;
            }
            while (true) {
                mo5867h(decoder, i + first, builder, false);
                if (first != last) {
                    first += step2;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: p */
    public final void mo5867h(InterfaceC36230Tt0 decoder, int i, Builder builder, boolean z) {
        int i2;
        Object m82314c;
        Object value;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object m82314c2 = InterfaceC36230Tt0.C8139a.m82314c(decoder, getDescriptor(), i, this.f113836a, null, 8, null);
        boolean z2 = true;
        if (z) {
            i2 = decoder.mo11843q(getDescriptor());
            if (i2 != i + 1) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        int i3 = i2;
        if (builder.containsKey(m82314c2) && !(this.f113837b.getDescriptor().getKind() instanceof E24)) {
            InterfaceC34588Ms5 descriptor = getDescriptor();
            InterfaceC34036Kj2<Value> interfaceC34036Kj2 = this.f113837b;
            value = MapsKt__MapsKt.getValue(builder, m82314c2);
            m82314c = decoder.mo3283s(descriptor, i3, interfaceC34036Kj2, value);
        } else {
            m82314c = InterfaceC36230Tt0.C8139a.m82314c(decoder, getDescriptor(), i3, this.f113837b, null, 8, null);
        }
        builder.put(m82314c2, m82314c);
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int mo5868e = mo5868e(collection);
        InterfaceC34588Ms5 descriptor = getDescriptor();
        InterfaceC36464Ut0 mo1125z = encoder.mo1125z(descriptor, mo5868e);
        Iterator<Map.Entry<? extends Key, ? extends Value>> mo28033d = mo28033d(collection);
        int i = 0;
        while (mo28033d.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = mo28033d.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            mo1125z.mo1126y(getDescriptor(), i, m8896m(), key);
            mo1125z.mo1126y(getDescriptor(), i2, m8895n(), value);
            i = i2 + 1;
        }
        mo1125z.mo1151a(descriptor);
    }

    public AbstractC50357vK2(InterfaceC34036Kj2<Key> interfaceC34036Kj2, InterfaceC34036Kj2<Value> interfaceC34036Kj22) {
        super(null);
        this.f113836a = interfaceC34036Kj2;
        this.f113837b = interfaceC34036Kj22;
    }
}
