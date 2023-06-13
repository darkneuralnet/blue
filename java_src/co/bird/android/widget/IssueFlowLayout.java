package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.widget.IssueFlowLayout;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\r"}, m28432d2 = {"Lco/bird/android/widget/IssueFlowLayout;", "Landroid/widget/LinearLayout;", "Lio/reactivex/Observable;", "", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class IssueFlowLayout extends LinearLayout {

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "states", "", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIssueFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueFlowLayout.kt\nco/bird/android/widget/IssueFlowLayout$selectedChanges$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,28:1\n12744#2,2:29\n*S KotlinDebug\n*F\n+ 1 IssueFlowLayout.kt\nco/bird/android/widget/IssueFlowLayout$selectedChanges$1\n*L\n24#1:29,2\n*E\n"})
    /* renamed from: co.bird.android.widget.IssueFlowLayout$a */
    /* loaded from: classes4.dex */
    public static final class C16531a extends Lambda implements Function1<Object[], Boolean> {

        /* renamed from: g */
        public static final C16531a f67385g = new C16531a();

        public C16531a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object[] states) {
            Intrinsics.checkNotNullParameter(states, "states");
            int length = states.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj = states[i];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj).booleanValue()) {
                    z = true;
                    break;
                }
                i++;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "Lco/bird/android/widget/IssueView;", "b", "(I)Lco/bird/android/widget/IssueView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.IssueFlowLayout$b */
    /* loaded from: classes4.dex */
    public static final class C16532b extends Lambda implements Function1<Integer, IssueView> {
        public C16532b() {
            super(1);
        }

        /* renamed from: b */
        public final IssueView m54550b(int i) {
            View childAt = IssueFlowLayout.this.getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type co.bird.android.widget.IssueView");
            return (IssueView) childAt;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IssueView invoke(Integer num) {
            return m54550b(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/widget/IssueView;", "it", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/widget/IssueView;)Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.IssueFlowLayout$c */
    /* loaded from: classes4.dex */
    public static final class C16533c extends Lambda implements Function1<IssueView, Observable<Boolean>> {

        /* renamed from: g */
        public static final C16533c f67387g = new C16533c();

        public C16533c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<Boolean> invoke(IssueView it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m54546g().startWith((Observable<Boolean>) Boolean.FALSE);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IssueFlowLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: c */
    public static final Boolean m54552c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: b */
    public final Observable<Boolean> m54553b() {
        Sequence asSequence;
        Sequence map;
        Sequence map2;
        List list;
        asSequence = CollectionsKt___CollectionsKt.asSequence(new IntRange(0, getChildCount() - 1));
        map = SequencesKt___SequencesKt.map(asSequence, new C16532b());
        map2 = SequencesKt___SequencesKt.map(map, C16533c.f67387g);
        list = SequencesKt___SequencesKt.toList(map2);
        final C16531a c16531a = C16531a.f67385g;
        Observable<Boolean> combineLatest = Observable.combineLatest(list, new InterfaceC23492o() { // from class: ja2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m54552c;
                m54552c = IssueFlowLayout.m54552c(Function1.this, obj);
                return m54552c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(observable… it as Boolean }\n      })");
        return combineLatest;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IssueFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IssueFlowLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IssueFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
