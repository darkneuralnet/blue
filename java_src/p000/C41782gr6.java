package p000;

import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u0000H\u0086\u0002\"\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, m28432d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", C17296a.f69688o, "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/sequences/Sequence;", "b", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "children", "c", "descendants", "core-ktx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: gr6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41782gr6 {

    @Metadata(m28433d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u0005"}, m28432d2 = {"gr6$a", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "", "iterator", "core-ktx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: gr6$a */
    /* loaded from: classes.dex */
    public static final class C22498a implements Sequence<View> {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f84379a;

        public C22498a(ViewGroup viewGroup) {
            this.f84379a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<View> iterator() {
            return C41782gr6.m37377d(this.f84379a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"Lkotlin/sequences/SequenceScope;", "Landroid/view/View;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "androidx.core.view.ViewGroupKt$descendants$1", m28418f = "ViewGroup.kt", m28417i = {0, 0, 0, 0, 1, 1, 1}, m28416l = {119, 121}, m28415m = "invokeSuspend", m28414n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, m28413s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    /* renamed from: gr6$b */
    /* loaded from: classes.dex */
    public static final class C22499b extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f84380h;

        /* renamed from: i */
        public Object f84381i;

        /* renamed from: j */
        public int f84382j;

        /* renamed from: k */
        public int f84383k;

        /* renamed from: l */
        public int f84384l;

        /* renamed from: m */
        public /* synthetic */ Object f84385m;

        /* renamed from: n */
        public final /* synthetic */ ViewGroup f84386n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22499b(ViewGroup viewGroup, Continuation<? super C22499b> continuation) {
            super(2, continuation);
            this.f84386n = viewGroup;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C22499b c22499b = new C22499b(this.f84386n, continuation);
            c22499b.f84385m = obj;
            return c22499b;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008f -> B:22:0x0091). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0098 -> B:24:0x009c). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            SequenceScope sequenceScope;
            ViewGroup viewGroup;
            int childCount;
            int i;
            C22499b c22499b;
            C22499b c22499b2;
            SequenceScope sequenceScope2;
            ViewGroup viewGroup2;
            View view;
            int i2;
            int i3;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f84384l;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        i3 = this.f84383k;
                        i2 = this.f84382j;
                        ViewGroup viewGroup3 = (ViewGroup) this.f84380h;
                        SequenceScope sequenceScope3 = (SequenceScope) this.f84385m;
                        ResultKt.throwOnFailure(obj);
                        c22499b2 = this;
                        SequenceScope sequenceScope4 = sequenceScope3;
                        c22499b = c22499b2;
                        sequenceScope = sequenceScope4;
                        ViewGroup viewGroup4 = viewGroup3;
                        int i5 = i3;
                        viewGroup = viewGroup4;
                        int i6 = i5;
                        i = i2 + 1;
                        childCount = i6;
                        if (i >= childCount) {
                            View childAt = viewGroup.getChildAt(i);
                            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
                            c22499b.f84385m = sequenceScope;
                            c22499b.f84380h = viewGroup;
                            c22499b.f84381i = childAt;
                            c22499b.f84382j = i;
                            c22499b.f84383k = childCount;
                            c22499b.f84384l = 1;
                            if (sequenceScope.yield(childAt, c22499b) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            sequenceScope2 = sequenceScope;
                            c22499b2 = c22499b;
                            viewGroup2 = viewGroup;
                            i3 = childCount;
                            i2 = i;
                            view = childAt;
                            if (!(view instanceof ViewGroup)) {
                                Sequence<View> m37378c = C41782gr6.m37378c((ViewGroup) view);
                                c22499b2.f84385m = sequenceScope2;
                                c22499b2.f84380h = viewGroup2;
                                c22499b2.f84381i = null;
                                c22499b2.f84382j = i2;
                                c22499b2.f84383k = i3;
                                c22499b2.f84384l = 2;
                                if (sequenceScope2.yieldAll(m37378c, c22499b2) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                viewGroup3 = viewGroup2;
                                sequenceScope3 = sequenceScope2;
                                SequenceScope sequenceScope42 = sequenceScope3;
                                c22499b = c22499b2;
                                sequenceScope = sequenceScope42;
                                ViewGroup viewGroup42 = viewGroup3;
                                int i52 = i3;
                                viewGroup = viewGroup42;
                                int i62 = i52;
                                i = i2 + 1;
                                childCount = i62;
                                if (i >= childCount) {
                                    return Unit.INSTANCE;
                                }
                            } else {
                                i52 = i3;
                                viewGroup = viewGroup2;
                                c22499b = c22499b2;
                                sequenceScope = sequenceScope2;
                                int i622 = i52;
                                i = i2 + 1;
                                childCount = i622;
                                if (i >= childCount) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i3 = this.f84383k;
                    i2 = this.f84382j;
                    view = (View) this.f84381i;
                    viewGroup2 = (ViewGroup) this.f84380h;
                    sequenceScope2 = (SequenceScope) this.f84385m;
                    ResultKt.throwOnFailure(obj);
                    c22499b2 = this;
                    if (!(view instanceof ViewGroup)) {
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f84385m;
                viewGroup = this.f84386n;
                childCount = viewGroup.getChildCount();
                i = 0;
                c22499b = this;
                if (i >= childCount) {
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super View> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C22499b) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m28432d2 = {"gr6$c", "", "Landroid/view/View;", "", "hasNext", C17296a.f69688o, "", "remove", "", "b", "I", "index", "core-ktx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: gr6$c */
    /* loaded from: classes.dex */
    public static final class C22500c implements Iterator<View>, KMutableIterator {

        /* renamed from: b */
        public int f84387b;

        /* renamed from: c */
        public final /* synthetic */ ViewGroup f84388c;

        public C22500c(ViewGroup viewGroup) {
            this.f84388c = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.f84388c;
            int i = this.f84387b;
            this.f84387b = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f84387b < this.f84388c.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f84388c;
            int i = this.f84387b - 1;
            this.f84387b = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: a */
    public static final View m37380a(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    /* renamed from: b */
    public static final Sequence<View> m37379b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return new C22498a(viewGroup);
    }

    /* renamed from: c */
    public static final Sequence<View> m37378c(ViewGroup viewGroup) {
        Sequence<View> sequence;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        sequence = SequencesKt__SequenceBuilderKt.sequence(new C22499b(viewGroup, null));
        return sequence;
    }

    /* renamed from: d */
    public static final Iterator<View> m37377d(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return new C22500c(viewGroup);
    }
}
