package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import okhttp3.internal.http.StatusLine;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\b\b\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B+\b\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"LvM5;", "", "", "bit", "", "o", "v", "j", "bits", "h", "u", "", "iterator", "default", "s", "", "toString", "", "b", "J", "upperSet", "c", "lowerSet", DateTokenConverter.CONVERTER_KEY, "I", "lowerBound", "", "e", "[I", "belowBound", "<init>", "(JJI[I)V", "f", C17296a.f69688o, "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n13600#2,2:398\n1789#3,3:400\n1789#3,3:403\n1789#3,3:406\n1789#3,3:409\n1789#3,3:412\n1549#3:415\n1620#3,3:416\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n107#1:398,2\n236#1:400,3\n257#1:403,3\n261#1:406,3\n283#1:409,3\n286#1:412,3\n343#1:415\n343#1:416,3\n*E\n"})
/* renamed from: vM5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50378vM5 implements Iterable<Integer>, KMappedMarker {

    /* renamed from: f */
    public static final C29518a f113941f = new C29518a(null);

    /* renamed from: g */
    public static final C50378vM5 f113942g = new C50378vM5(0, 0, 0, null);

    /* renamed from: b */
    public final long f113943b;

    /* renamed from: c */
    public final long f113944c;

    /* renamed from: d */
    public final int f113945d;

    /* renamed from: e */
    public final int[] f113946e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"LvM5$a;", "", "LvM5;", "EMPTY", "LvM5;", C17296a.f69688o, "()LvM5;", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vM5$a */
    /* loaded from: classes.dex */
    public static final class C29518a {
        public /* synthetic */ C29518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C50378vM5 m8775a() {
            return C50378vM5.f113942g;
        }

        private C29518a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"Lkotlin/sequences/SequenceScope;", "", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m28418f = "SnapshotIdSet.kt", m28417i = {0, 0, 1, 1, 2, 2}, m28416l = {295, 300, StatusLine.HTTP_TEMP_REDIRECT}, m28415m = "invokeSuspend", m28414n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, m28413s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    /* renamed from: vM5$b */
    /* loaded from: classes.dex */
    public static final class C29519b extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f113947h;

        /* renamed from: i */
        public int f113948i;

        /* renamed from: j */
        public int f113949j;

        /* renamed from: k */
        public int f113950k;

        /* renamed from: l */
        public /* synthetic */ Object f113951l;

        public C29519b(Continuation<? super C29519b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29519b c29519b = new C29519b(continuation);
            c29519b.f113951l = obj;
            return c29519b;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:19:0x007b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:31:0x00b7). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b4 -> B:31:0x00b7). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f0 -> B:43:0x00f4). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f3 -> B:43:0x00f4). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            SequenceScope sequenceScope;
            C29519b c29519b;
            SequenceScope sequenceScope2;
            int length;
            int[] iArr;
            int i;
            SequenceScope sequenceScope3;
            int i2;
            SequenceScope sequenceScope4;
            C29519b c29519b2;
            int i3;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f113950k;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            int i5 = this.f113948i;
                            sequenceScope4 = (SequenceScope) this.f113951l;
                            ResultKt.throwOnFailure(obj);
                            i3 = i5;
                            c29519b2 = this;
                            i3++;
                            if (i3 < 64) {
                                if ((C50378vM5.this.f113943b & (1 << i3)) != 0) {
                                    Integer boxInt = Boxing.boxInt(i3 + 64 + C50378vM5.this.f113945d);
                                    c29519b2.f113951l = sequenceScope4;
                                    c29519b2.f113947h = null;
                                    c29519b2.f113948i = i3;
                                    c29519b2.f113950k = 3;
                                    if (sequenceScope4.yield(boxInt, c29519b2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                i3++;
                                if (i3 < 64) {
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f113948i;
                    sequenceScope3 = (SequenceScope) this.f113951l;
                    ResultKt.throwOnFailure(obj);
                    c29519b = this;
                    i2++;
                    if (i2 < 64) {
                        if ((C50378vM5.this.f113944c & (1 << i2)) != 0) {
                            Integer boxInt2 = Boxing.boxInt(C50378vM5.this.f113945d + i2);
                            c29519b.f113951l = sequenceScope3;
                            c29519b.f113947h = null;
                            c29519b.f113948i = i2;
                            c29519b.f113950k = 2;
                            if (sequenceScope3.yield(boxInt2, c29519b) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        i2++;
                        if (i2 < 64) {
                        }
                    } else {
                        sequenceScope = sequenceScope3;
                        if (C50378vM5.this.f113943b != 0) {
                            sequenceScope4 = sequenceScope;
                            c29519b2 = c29519b;
                            i3 = 0;
                            if (i3 < 64) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    length = this.f113949j;
                    i = this.f113948i;
                    iArr = (int[]) this.f113947h;
                    sequenceScope2 = (SequenceScope) this.f113951l;
                    ResultKt.throwOnFailure(obj);
                    c29519b = this;
                    i++;
                    if (i < length) {
                        Integer boxInt3 = Boxing.boxInt(iArr[i]);
                        c29519b.f113951l = sequenceScope2;
                        c29519b.f113947h = iArr;
                        c29519b.f113948i = i;
                        c29519b.f113949j = length;
                        c29519b.f113950k = 1;
                        if (sequenceScope2.yield(boxInt3, c29519b) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i++;
                        if (i < length) {
                            sequenceScope = sequenceScope2;
                            if (C50378vM5.this.f113944c != 0) {
                                sequenceScope3 = sequenceScope;
                                i2 = 0;
                                if (i2 < 64) {
                                }
                            }
                            if (C50378vM5.this.f113943b != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f113951l;
                int[] iArr2 = C50378vM5.this.f113946e;
                if (iArr2 != null) {
                    c29519b = this;
                    sequenceScope2 = sequenceScope;
                    length = iArr2.length;
                    iArr = iArr2;
                    i = 0;
                    if (i < length) {
                    }
                } else {
                    c29519b = this;
                    if (C50378vM5.this.f113944c != 0) {
                    }
                    if (C50378vM5.this.f113943b != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C29519b) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public C50378vM5(long j, long j2, int i, int[] iArr) {
        this.f113943b = j;
        this.f113944c = j2;
        this.f113945d = i;
        this.f113946e = iArr;
    }

    /* renamed from: h */
    public final C50378vM5 m8781h(C50378vM5 bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        C50378vM5 c50378vM5 = f113942g;
        if (bits == c50378vM5) {
            return this;
        }
        if (this == c50378vM5) {
            return c50378vM5;
        }
        int i = bits.f113945d;
        int i2 = this.f113945d;
        if (i == i2) {
            int[] iArr = bits.f113946e;
            int[] iArr2 = this.f113946e;
            if (iArr == iArr2) {
                return new C50378vM5(this.f113943b & (~bits.f113943b), this.f113944c & (~bits.f113944c), i2, iArr2);
            }
        }
        Iterator<Integer> it = bits.iterator();
        C50378vM5 c50378vM52 = this;
        while (it.hasNext()) {
            c50378vM52 = c50378vM52.m8780j(it.next().intValue());
        }
        return c50378vM52;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        Sequence sequence;
        sequence = SequencesKt__SequenceBuilderKt.sequence(new C29519b(null));
        return sequence.iterator();
    }

    /* renamed from: j */
    public final C50378vM5 m8780j(int i) {
        int[] iArr;
        int m6969b;
        int i2 = this.f113945d;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.f113944c;
            if ((j2 & j) != 0) {
                return new C50378vM5(this.f113943b, j2 & (~j), i2, this.f113946e);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.f113943b;
            if ((j4 & j3) != 0) {
                return new C50378vM5(j4 & (~j3), this.f113944c, i2, this.f113946e);
            }
        } else if (i3 < 0 && (iArr = this.f113946e) != null && (m6969b = C50971wM5.m6969b(iArr, i)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new C50378vM5(this.f113943b, this.f113944c, this.f113945d, null);
            }
            int[] iArr2 = new int[length];
            if (m6969b > 0) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, m6969b);
            }
            if (m6969b < length) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, m6969b, m6969b + 1, length + 1);
            }
            return new C50378vM5(this.f113943b, this.f113944c, this.f113945d, iArr2);
        }
        return this;
    }

    /* renamed from: o */
    public final boolean m8779o(int i) {
        int[] iArr;
        int i2 = i - this.f113945d;
        boolean z = true;
        if (i2 >= 0 && i2 < 64) {
            if (((1 << i2) & this.f113944c) != 0) {
                return true;
            }
            return false;
        } else if (i2 >= 64 && i2 < 128) {
            if (((1 << (i2 - 64)) & this.f113943b) != 0) {
                return true;
            }
            return false;
        } else if (i2 > 0 || (iArr = this.f113946e) == null) {
            return false;
        } else {
            if (C50971wM5.m6969b(iArr, i) < 0) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: s */
    public final int m8778s(int i) {
        int m6968c;
        int m6968c2;
        int[] iArr = this.f113946e;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.f113944c;
        if (j != 0) {
            int i2 = this.f113945d;
            m6968c2 = C50971wM5.m6968c(j);
            return i2 + m6968c2;
        }
        long j2 = this.f113943b;
        if (j2 != 0) {
            m6968c = C50971wM5.m6968c(j2);
            return this.f113945d + 64 + m6968c;
        }
        return i;
    }

    public String toString() {
        int collectionSizeOrDefault;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(this, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb.append(C32245Cs2.m111386d(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: u */
    public final C50378vM5 m8777u(C50378vM5 bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        C50378vM5 c50378vM5 = f113942g;
        if (bits == c50378vM5) {
            return this;
        }
        if (this == c50378vM5) {
            return bits;
        }
        int i = bits.f113945d;
        int i2 = this.f113945d;
        if (i == i2) {
            int[] iArr = bits.f113946e;
            int[] iArr2 = this.f113946e;
            if (iArr == iArr2) {
                return new C50378vM5(this.f113943b | bits.f113943b, this.f113944c | bits.f113944c, i2, iArr2);
            }
        }
        if (this.f113946e == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                bits = bits.m8776v(it.next().intValue());
            }
            return bits;
        }
        Iterator<Integer> it2 = bits.iterator();
        C50378vM5 c50378vM52 = this;
        while (it2.hasNext()) {
            c50378vM52 = c50378vM52.m8776v(it2.next().intValue());
        }
        return c50378vM52;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
        r3 = kotlin.collections.CollectionsKt___CollectionsKt.toIntArray(r9);
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C50378vM5 m8776v(int i) {
        int i2;
        int[] iArr;
        int i3 = this.f113945d;
        int i4 = i - i3;
        long j = 0;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.f113944c;
            if ((j3 & j2) == 0) {
                return new C50378vM5(this.f113943b, j3 | j2, i3, this.f113946e);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.f113943b;
            if ((j5 & j4) == 0) {
                return new C50378vM5(j5 | j4, this.f113944c, i3, this.f113946e);
            }
        } else if (i4 >= 128) {
            if (!m8779o(i)) {
                long j6 = this.f113943b;
                long j7 = this.f113944c;
                int i5 = this.f113945d;
                int i6 = ((i + 1) / 64) * 64;
                ArrayList arrayList = null;
                long j8 = j7;
                long j9 = j6;
                while (true) {
                    if (i5 < i6) {
                        if (j8 != j) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                int[] iArr2 = this.f113946e;
                                if (iArr2 != null) {
                                    for (int i7 : iArr2) {
                                        arrayList.add(Integer.valueOf(i7));
                                    }
                                }
                            }
                            for (int i8 = 0; i8 < 64; i8++) {
                                if (((1 << i8) & j8) != 0) {
                                    arrayList.add(Integer.valueOf(i8 + i5));
                                }
                            }
                            j = 0;
                        }
                        if (j9 == j) {
                            i2 = i6;
                            j8 = j;
                            break;
                        }
                        i5 += 64;
                        j8 = j9;
                        j9 = j;
                    } else {
                        i2 = i5;
                        break;
                    }
                }
                if (arrayList == null || iArr == null) {
                    iArr = this.f113946e;
                }
                return new C50378vM5(j9, j8, i2, iArr).m8776v(i);
            }
        } else {
            int[] iArr3 = this.f113946e;
            if (iArr3 == null) {
                return new C50378vM5(this.f113943b, this.f113944c, i3, new int[]{i});
            }
            int m6969b = C50971wM5.m6969b(iArr3, i);
            if (m6969b < 0) {
                int i9 = -(m6969b + 1);
                int length = iArr3.length + 1;
                int[] iArr4 = new int[length];
                ArraysKt___ArraysJvmKt.copyInto(iArr3, iArr4, 0, 0, i9);
                ArraysKt___ArraysJvmKt.copyInto(iArr3, iArr4, i9 + 1, i9, length - 1);
                iArr4[i9] = i;
                return new C50378vM5(this.f113943b, this.f113944c, this.f113945d, iArr4);
            }
        }
        return this;
    }
}
