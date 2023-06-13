package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0005\u0018\u0019\u0011\u0014\u001aB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u0002J\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016RF\u0010\u0013\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0010*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012RF\u0010\u0015\u001a4\u00120\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0004\u0012\u00020\u0004 \u0010*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u001b"}, m28432d2 = {"LH92;", "LyS0;", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "w", "v", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "itemScansAndCategorySubject", DateTokenConverter.CONVERTER_KEY, "itemGroupClicksSubject", "<init>", "()V", C17296a.f69688o, "b", "e", "inventory-scanning_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: H92 */
/* loaded from: classes3.dex */
public final class H92 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Pair<String, Collection<WireSuccessfulScannedItem>>> f12954c;

    /* renamed from: d */
    public final C24558d<Pair<Collection<String>, String>> f12955d;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b¢\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LH92$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "title", "c", "details", "Landroid/widget/ImageView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/ImageView;", "skuIcon", "Landroid/view/View;", "view", "<init>", "(LH92;Landroid/view/View;)V", "inventory-scanning_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInventoryScanningAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanningAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningAdapter$BaseInventoryScanViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n1#4:107\n*S KotlinDebug\n*F\n+ 1 InventoryScanningAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningAdapter$BaseInventoryScanViewHolder\n*L\n62#1:102\n62#1:103,4\n*E\n"})
    /* renamed from: H92$a */
    /* loaded from: classes3.dex */
    public abstract class AbstractC3046a extends C29735w1 {

        /* renamed from: b */
        public TextView f12956b;

        /* renamed from: c */
        public TextView f12957c;

        /* renamed from: d */
        public final ImageView f12958d;

        /* renamed from: e */
        public final /* synthetic */ H92 f12959e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC3046a(H92 h92, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f12959e = h92;
            this.f12956b = (TextView) this.itemView.findViewById(C49991ui4.title);
            this.f12957c = (TextView) this.itemView.findViewById(C49991ui4.details);
            this.f12958d = (ImageView) this.itemView.findViewById(C49991ui4.skuIcon);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f12959e.m94545o().m109397e(i).m105816c();
            ColorStateList colorStateList = null;
            if (!(m105816c instanceof G92)) {
                m105816c = null;
            }
            G92 g92 = (G92) m105816c;
            if (g92 != null) {
                this.f12956b.setText(g92.m105685j());
                this.f12957c.setText(g92.m105691d());
                this.f12957c.setTextColor(g92.m105690e());
                this.f12958d.setImageDrawable(g92.m105686i());
                ImageView imageView = this.f12958d;
                Integer m105689f = g92.m105689f();
                if (m105689f != null) {
                    colorStateList = ColorStateList.valueOf(m105689f.intValue());
                }
                imageView.setImageTintList(colorStateList);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LH92$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "headerView", "Landroid/view/View;", "view", "<init>", "(LH92;Landroid/view/View;)V", "inventory-scanning_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInventoryScanningAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanningAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n*S KotlinDebug\n*F\n+ 1 InventoryScanningAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningAdapter$HeaderViewHolder\n*L\n43#1:102\n43#1:103,4\n*E\n"})
    /* renamed from: H92$b */
    /* loaded from: classes3.dex */
    public final class C3047b extends C29735w1 {

        /* renamed from: b */
        public final TextView f12960b;

        /* renamed from: c */
        public final /* synthetic */ H92 f12961c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3047b(H92 h92, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f12961c = h92;
            this.f12960b = (TextView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            C49520tu6.m11233r(this.f12960b);
            TextView textView = this.f12960b;
            Object m105816c = this.f12961c.m94545o().m109394h().get(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof CharSequence;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"LH92$c;", "LH92$a;", "LH92;", "Landroid/view/View;", "view", "<init>", "(LH92;Landroid/view/View;)V", "inventory-scanning_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H92$c */
    /* loaded from: classes3.dex */
    public final class C3048c extends AbstractC3046a {

        /* renamed from: f */
        public final /* synthetic */ H92 f12962f;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nInventoryScanningAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanningAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningAdapter$ItemScanGroupViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n*S KotlinDebug\n*F\n+ 1 InventoryScanningAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningAdapter$ItemScanGroupViewHolder$1\n*L\n89#1:102\n89#1:103,4\n*E\n"})
        /* renamed from: H92$c$a */
        /* loaded from: classes3.dex */
        public static final class C3049a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ H92 f12963g;

            /* renamed from: h */
            public final /* synthetic */ C3048c f12964h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3049a(H92 h92, C3048c c3048c) {
                super(1);
                this.f12963g = h92;
                this.f12964h = c3048c;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f12963g.m94545o().m109397e(this.f12964h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof G92)) {
                    m105816c = null;
                }
                G92 g92 = (G92) m105816c;
                if (g92 != null) {
                    H92 h92 = this.f12963g;
                    Collection m105692c = g92.m105692c();
                    String m105693b = g92.m105693b();
                    if (m105692c == null || m105693b == null) {
                        return;
                    }
                    h92.f12955d.onNext(TuplesKt.m28425to(m105692c, m105693b));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3048c(H92 h92, View view) {
            super(h92, view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f12962f = h92;
            C34585Ms2.m94661j(view, new C3049a(h92, this));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"LH92$d;", "LH92$a;", "LH92;", "Landroid/view/View;", "view", "<init>", "(LH92;Landroid/view/View;)V", "inventory-scanning_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H92$d */
    /* loaded from: classes3.dex */
    public final class C3050d extends AbstractC3046a {

        /* renamed from: f */
        public final /* synthetic */ H92 f12965f;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nInventoryScanningAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanningAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningAdapter$ItemScannedViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n*S KotlinDebug\n*F\n+ 1 InventoryScanningAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningAdapter$ItemScannedViewHolder$1\n*L\n77#1:102\n77#1:103,4\n*E\n"})
        /* renamed from: H92$d$a */
        /* loaded from: classes3.dex */
        public static final class C3051a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ H92 f12966g;

            /* renamed from: h */
            public final /* synthetic */ C3050d f12967h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3051a(H92 h92, C3050d c3050d) {
                super(1);
                this.f12966g = h92;
                this.f12967h = c3050d;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f12966g.m94545o().m109397e(this.f12967h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof G92)) {
                    m105816c = null;
                }
                G92 g92 = (G92) m105816c;
                if (g92 != null) {
                    H92 h92 = this.f12966g;
                    Collection m105692c = g92.m105692c();
                    if (m105692c != null) {
                        h92.f12954c.onNext(new Pair(g92.m105685j(), m105692c));
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3050d(H92 h92, View view) {
            super(h92, view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f12965f = h92;
            C34585Ms2.m94661j(view, new C3051a(h92, this));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"LH92$e;", "LH92$a;", "LH92;", "Landroid/view/View;", "view", "<init>", "(LH92;Landroid/view/View;)V", "inventory-scanning_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H92$e */
    /* loaded from: classes3.dex */
    public final class C3052e extends AbstractC3046a {

        /* renamed from: f */
        public final /* synthetic */ H92 f12968f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3052e(H92 h92, View view) {
            super(h92, view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f12968f = h92;
        }
    }

    public H92() {
        C24558d<Pair<String, Collection<WireSuccessfulScannedItem>>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<String, Coll…uccessfulScannedItem>>>()");
        this.f12954c = m31902e;
        C24558d<Pair<Collection<String>, String>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Pair<Collection<String>, String>>()");
        this.f12955d = m31902e2;
    }

    /* renamed from: v */
    public final Observable<Pair<Collection<String>, String>> m104264v() {
        Observable<Pair<Collection<String>, String>> hide = this.f12955d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "itemGroupClicksSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Pair<String, Collection<WireSuccessfulScannedItem>>> m104263w() {
        Observable<Pair<String, Collection<WireSuccessfulScannedItem>>> hide = this.f12954c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "itemScansAndCategorySubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C42303hk4.item_model_header ? new C3047b(this, m41761u) : i == C42303hk4.item_group ? new C3048c(this, m41761u) : i == C42303hk4.item_inventory_scan ? new C3050d(this, m41761u) : i == C42303hk4.item_last_successful_scan ? new C3052e(this, m41761u) : new C29735w1(m41761u);
    }
}
