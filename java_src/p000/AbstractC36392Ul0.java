package p000;

import android.view.View;
import co.bird.android.widget.standardcomponents.CollapsableHeaderView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0004¨\u0006\f"}, m28432d2 = {"LUl0;", "LyS0;", "", "position", "Lkotlin/Function1;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "v", "<init>", "()V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCollapsableAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollapsableAdapter.kt\nco/bird/android/widget/adapter/CollapsableAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1549#2:77\n1620#2,2:78\n1549#2:80\n1620#2,3:81\n1622#2:84\n*S KotlinDebug\n*F\n+ 1 CollapsableAdapter.kt\nco/bird/android/widget/adapter/CollapsableAdapter\n*L\n58#1:77\n58#1:78,2\n63#1:80\n63#1:81,3\n58#1:84\n*E\n"})
/* renamed from: Ul0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC36392Ul0 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0094\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"LUl0$a;", "Lw1;", "Landroid/view/View$OnClickListener;", "", "position", "", "bind", "Landroid/view/View;", "v", "onClick", "Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;", "b", "Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;", "header", "view", "<init>", "(LUl0;Landroid/view/View;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCollapsableAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollapsableAdapter.kt\nco/bird/android/widget/adapter/CollapsableAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,76:1\n18#2:77\n9#3,4:78\n*S KotlinDebug\n*F\n+ 1 CollapsableAdapter.kt\nco/bird/android/widget/adapter/CollapsableAdapter$HeaderViewHolder\n*L\n14#1:77\n14#1:78,4\n*E\n"})
    /* renamed from: Ul0$a */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC8438a extends C29735w1 implements View.OnClickListener {

        /* renamed from: b */
        public final CollapsableHeaderView f37947b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC36392Ul0 f37948c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "visible", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ul0$a$a */
        /* loaded from: classes4.dex */
        public static final class C8439a extends Lambda implements Function1<Boolean, Unit> {
            public C8439a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                CollapsableHeaderView.EnumC16700a enumC16700a;
                CollapsableHeaderView collapsableHeaderView = View$OnClickListenerC8438a.this.f37947b;
                if (z) {
                    enumC16700a = CollapsableHeaderView.EnumC16700a.UP;
                } else {
                    enumC16700a = CollapsableHeaderView.EnumC16700a.DOWN;
                }
                collapsableHeaderView.setArrowDirection(enumC16700a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public View$OnClickListenerC8438a(AbstractC36392Ul0 abstractC36392Ul0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f37948c = abstractC36392Ul0;
            this.f37947b = (CollapsableHeaderView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object firstOrNull;
            CollapsableHeaderView.EnumC16700a enumC16700a;
            Object m105816c = this.f37948c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C36626Vl0)) {
                m105816c = null;
            }
            C36626Vl0 c36626Vl0 = (C36626Vl0) m105816c;
            if (c36626Vl0 != null) {
                AbstractC36392Ul0 abstractC36392Ul0 = this.f37948c;
                this.f37947b.setText(c36626Vl0.m79460d());
                this.f37947b.setCollapsable(c36626Vl0.m79462b());
                boolean m79461c = c36626Vl0.m79461c();
                boolean z = false;
                c36626Vl0.m79459e(false);
                if (this.f37947b.m53965f()) {
                    CollapsableHeaderView collapsableHeaderView = this.f37947b;
                    if (!m79461c) {
                        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) abstractC36392Ul0.m94543q(i).m104410c());
                        C2637G6 c2637g6 = (C2637G6) firstOrNull;
                        if (c2637g6 != null && c2637g6.m105815d()) {
                            z = true;
                        }
                        if (z) {
                            enumC16700a = CollapsableHeaderView.EnumC16700a.UP;
                        } else {
                            enumC16700a = CollapsableHeaderView.EnumC16700a.DOWN;
                        }
                    } else {
                        enumC16700a = CollapsableHeaderView.EnumC16700a.DOWN;
                    }
                    collapsableHeaderView.setArrowDirection(enumC16700a);
                    this.itemView.setOnClickListener(this);
                    return;
                }
                this.itemView.setOnClickListener(null);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            this.f37948c.m80894v(adapterPosition, new C8439a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void toggleItemVisibilityForHeaderPosition$default(AbstractC36392Ul0 abstractC36392Ul0, int i, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleItemVisibilityForHeaderPosition");
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        abstractC36392Ul0.m80894v(i, function1);
    }

    /* renamed from: v */
    public final void m80894v(int i, Function1<? super Boolean, Unit> function1) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List mutableList;
        Object firstOrNull;
        C2637G6 c2637g6;
        if (i == -1) {
            return;
        }
        C3023H6 m109393i = m94545o().m109393i(m94545o().m109394h().get(i));
        List<C3023H6> m109392j = m94545o().m109392j();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m109392j, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C3023H6 c3023h6 : m109392j) {
            if (Intrinsics.areEqual(c3023h6, m109393i)) {
                List<C2637G6> m104410c = c3023h6.m104410c();
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(m104410c, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                Iterator<T> it = m104410c.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    arrayList2.add(C2637G6.copy$default((C2637G6) it.next(), null, 0, !c2637g6.m105815d(), 3, null));
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                if (function1 != null) {
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) mutableList);
                    C2637G6 c2637g62 = (C2637G6) firstOrNull;
                    function1.invoke(Boolean.valueOf((c2637g62 == null || !c2637g62.m105815d()) ? false : false));
                }
                c3023h6 = C3023H6.copy$default(c3023h6, mutableList, null, null, 6, null);
            }
            arrayList.add(c3023h6);
        }
        mo24871u(arrayList);
    }
}
