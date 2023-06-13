package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.model.BottomSheetButton;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.persistence.nestedstructures.ZoneDetail;
import co.bird.android.model.persistence.nestedstructures.ZoneDetails;
import co.bird.android.model.persistence.nestedstructures.ZoneFlightSheetIcon;
import co.bird.android.model.persistence.nestedstructures.ZoneStatus;
import co.bird.android.model.persistence.nestedstructures.ZoneSummary;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0004\u001a\u001b\u0015\u001cB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m28432d2 = {"LGI6;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "", "LH6;", "sections", "u", "LF6;", "r", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/BottomSheetButton;", "c", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "bottomSheet", "<init>", "()V", C17296a.f69688o, "b", DateTokenConverter.CONVERTER_KEY, "zone-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n*L\n1#1,155:1\n9#2,4:156\n9#2,4:165\n9#2,4:178\n1855#3,2:160\n288#3,2:162\n1360#3:169\n1446#3,5:170\n288#3,2:175\n18#4:164\n18#4:177\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter\n*L\n50#1:156,4\n64#1:165,4\n71#1:178,4\n58#1:160,2\n63#1:162,2\n69#1:169\n69#1:170,5\n70#1:175,2\n64#1:164\n71#1:177\n*E\n"})
/* renamed from: GI6 */
/* loaded from: classes3.dex */
public final class GI6 extends AbstractC52206yS0 {

    /* renamed from: c */
    public BaseBottomSheet<BottomSheetButton> f11508c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LGI6$a;", "Lw1;", "", "position", "", "bind", "Lug2;", "b", "Lug2;", "binding", "Landroid/view/View;", "view", "<init>", "(LGI6;Landroid/view/View;)V", "zone-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nZoneFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,155:1\n18#2:156\n9#3,4:157\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter$DetailViewHolder\n*L\n137#1:156\n137#1:157,4\n*E\n"})
    /* renamed from: GI6$a */
    /* loaded from: classes3.dex */
    public final class C2703a extends C29735w1 {

        /* renamed from: b */
        public final C49969ug2 f11509b;

        /* renamed from: c */
        public final /* synthetic */ GI6 f11510c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2703a(GI6 gi6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f11510c = gi6;
            C49969ug2 m9887a = C49969ug2.m9887a(view);
            Intrinsics.checkNotNullExpressionValue(m9887a, "bind(view)");
            this.f11509b = m9887a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f11510c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof ZoneDetail)) {
                m105816c = null;
            }
            ZoneDetail zoneDetail = (ZoneDetail) m105816c;
            if (zoneDetail != null) {
                ImageView imageView = this.f11509b.f112751d;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
                if (zoneDetail.getIcon() == null && zoneDetail.getColoredIcon() == null) {
                    z = false;
                } else {
                    z = true;
                }
                C49520tu6.show$default(imageView, z, 0, 2, null);
                ZoneFlightSheetIcon icon = zoneDetail.getIcon();
                if (icon != null) {
                    this.f11509b.f112751d.setImageDrawable(C33341Hk0.m103484a(icon.getIcon(), getContext()));
                    this.f11509b.f112751d.setImageTintList(ColorStateList.valueOf(icon.getIconColor().getLightMode()));
                } else {
                    ColoredIcon coloredIcon = zoneDetail.getColoredIcon();
                    if (coloredIcon != null) {
                        this.f11509b.f112751d.setImageDrawable(C34295Lm0.m96371a(coloredIcon, getContext()));
                        this.f11509b.f112751d.setImageTintList(null);
                    }
                }
                this.f11509b.f112752e.setText(zoneDetail.getTitle());
                this.f11509b.f112750c.setText(zoneDetail.getDetails());
                TextView textView = this.f11509b.f112749b;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.description");
                C49520tu6.setTextAndVisibility$default(textView, zoneDetail.getDescription(), 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LGI6$b;", "Lw1;", "", "position", "", "bind", "Lvg2;", "b", "Lvg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LGI6;Landroid/view/View;)V", "zone-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nZoneFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter$DetailsTitleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,155:1\n18#2:156\n9#3,4:157\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter$DetailsTitleViewHolder\n*L\n127#1:156\n127#1:157,4\n*E\n"})
    /* renamed from: GI6$b */
    /* loaded from: classes3.dex */
    public final class C2704b extends C29735w1 {

        /* renamed from: b */
        public final C50561vg2 f11511b;

        /* renamed from: c */
        public final /* synthetic */ GI6 f11512c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2704b(GI6 gi6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f11512c = gi6;
            C50561vg2 m8269a = C50561vg2.m8269a(view);
            Intrinsics.checkNotNullExpressionValue(m8269a, "bind(view)");
            this.f11511b = m8269a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f11512c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof ZoneDetails)) {
                m105816c = null;
            }
            ZoneDetails zoneDetails = (ZoneDetails) m105816c;
            if (zoneDetails != null) {
                this.f11511b.f114488b.setText(zoneDetails.getTitle());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LGI6$c;", "Lw1;", "", "position", "", "bind", "Lwg2;", "b", "Lwg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LGI6;Landroid/view/View;)V", "zone-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nZoneFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter$StatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n18#2:156\n9#3,4:157\n1#4:161\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter$StatusViewHolder\n*L\n100#1:156\n100#1:157,4\n*E\n"})
    /* renamed from: GI6$c */
    /* loaded from: classes3.dex */
    public final class C2705c extends C29735w1 {

        /* renamed from: b */
        public final C51154wg2 f11513b;

        /* renamed from: c */
        public final /* synthetic */ GI6 f11514c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2705c(GI6 gi6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f11514c = gi6;
            C51154wg2 m6504a = C51154wg2.m6504a(view);
            Intrinsics.checkNotNullExpressionValue(m6504a, "bind(view)");
            this.f11513b = m6504a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            ColorStateList valueOf;
            Object m105816c = this.f11514c.m94545o().m109397e(i).m105816c();
            Unit unit = null;
            if (!(m105816c instanceof ZoneStatus)) {
                m105816c = null;
            }
            ZoneStatus zoneStatus = (ZoneStatus) m105816c;
            if (zoneStatus != null) {
                GI6 gi6 = this.f11514c;
                this.f11513b.f116341d.setText(zoneStatus.getTitle());
                this.f11513b.f116339b.setText(zoneStatus.getDetails());
                ImageView imageView = this.f11513b.f116340c;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
                if (zoneStatus.getIcon() == null && zoneStatus.getColoredIcon() == null) {
                    z = false;
                } else {
                    z = true;
                }
                C49520tu6.show$default(imageView, z, 0, 2, null);
                ZoneFlightSheetIcon icon = zoneStatus.getIcon();
                if (icon != null) {
                    this.f11513b.f116340c.setImageDrawable(C33341Hk0.m103484a(icon.getIcon(), getContext()));
                    this.f11513b.f116340c.setImageTintList(ColorStateList.valueOf(icon.getIconColor().getLightMode()));
                } else {
                    ColoredIcon coloredIcon = zoneStatus.getColoredIcon();
                    if (coloredIcon != null) {
                        this.f11513b.f116340c.setImageDrawable(C34295Lm0.m96371a(coloredIcon, getContext()));
                        this.f11513b.f116340c.setImageTintList(null);
                    }
                }
                ThemedColors iconBackgroundColor = zoneStatus.getIconBackgroundColor();
                if (iconBackgroundColor != null && (valueOf = ColorStateList.valueOf(iconBackgroundColor.getLightMode())) != null) {
                    ImageView imageView2 = this.f11513b.f116340c;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.icon");
                    imageView2.setBackgroundTintList(valueOf);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    this.f11513b.f116340c.setBackgroundTintList(ColorStateList.valueOf(0));
                }
                BaseBottomSheet baseBottomSheet = gi6.f11508c;
                if (baseBottomSheet != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    baseBottomSheet.m59064n("status", itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LGI6$d;", "Lw1;", "", "position", "", "bind", "Lxg2;", "b", "Lxg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LGI6;Landroid/view/View;)V", "zone-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nZoneFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter$SummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,155:1\n18#2:156\n9#3,4:157\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter$SummaryViewHolder\n*L\n89#1:156\n89#1:157,4\n*E\n"})
    /* renamed from: GI6$d */
    /* loaded from: classes3.dex */
    public final class C2706d extends C29735w1 {

        /* renamed from: b */
        public final C51747xg2 f11515b;

        /* renamed from: c */
        public final /* synthetic */ GI6 f11516c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2706d(GI6 gi6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f11516c = gi6;
            C51747xg2 m4891a = C51747xg2.m4891a(view);
            Intrinsics.checkNotNullExpressionValue(m4891a, "bind(view)");
            this.f11515b = m4891a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f11516c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof ZoneSummary)) {
                m105816c = null;
            }
            ZoneSummary zoneSummary = (ZoneSummary) m105816c;
            if (zoneSummary != null) {
                GI6 gi6 = this.f11516c;
                this.f11515b.getRoot().setText(zoneSummary.getTitle());
                BaseBottomSheet baseBottomSheet = gi6.f11508c;
                if (baseBottomSheet != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    baseBottomSheet.m59064n("title", itemView);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new OI6());
        }
        ViewParent parent = recyclerView.getParent();
        if (parent != null) {
            z = parent instanceof BaseBottomSheet;
        } else {
            z = true;
        }
        if (!z) {
            parent = null;
        }
        BaseBottomSheet<BottomSheetButton> baseBottomSheet = (BaseBottomSheet) parent;
        this.f11508c = baseBottomSheet;
        if (baseBottomSheet != null) {
            BaseBottomSheet.clearPeekViews$default(baseBottomSheet, false, 1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IntRange until;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        until = RangesKt___RangesKt.until(0, recyclerView.getItemDecorationCount());
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            recyclerView.removeItemDecorationAt(((IntIterator) it).nextInt());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new HI6();
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:666)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:524)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:282)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:252)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[LOOP:1: B:20:0x0051->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // p000.AbstractC5440My
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo24871u(java.util.Collection<p000.C3023H6> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "sections"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            E6 r0 = r4.m94545o()
            java.util.List r0 = r0.m109394h()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            r3 = r1
            G6 r3 = (p000.C2637G6) r3
            java.lang.Object r3 = r3.m105816c()
            boolean r3 = r3 instanceof co.bird.android.model.persistence.nestedstructures.ZoneSummary
            if (r3 == 0) goto L13
            goto L2b
        L2a:
            r1 = r2
        L2b:
            G6 r1 = (p000.C2637G6) r1
            if (r1 == 0) goto L42
            java.lang.Object r0 = r1.m105816c()
            boolean r1 = r0 instanceof co.bird.android.model.persistence.nestedstructures.ZoneSummary
            if (r1 == 0) goto L38
            goto L39
        L38:
            r0 = r2
        L39:
            co.bird.android.model.persistence.nestedstructures.ZoneSummary r0 = (co.bird.android.model.persistence.nestedstructures.ZoneSummary) r0
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.getTitle()
            goto L43
        L42:
            r0 = r2
        L43:
            super.mo24871u(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L51:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r5.next()
            H6 r3 = (p000.C3023H6) r3
            java.util.List r3 = r3.m104408e()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            kotlin.collections.CollectionsKt.addAll(r1, r3)
            goto L51
        L67:
            java.util.Iterator r5 = r1.iterator()
        L6b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r5.next()
            r3 = r1
            G6 r3 = (p000.C2637G6) r3
            java.lang.Object r3 = r3.m105816c()
            boolean r3 = r3 instanceof co.bird.android.model.persistence.nestedstructures.ZoneSummary
            if (r3 == 0) goto L6b
            goto L82
        L81:
            r1 = r2
        L82:
            G6 r1 = (p000.C2637G6) r1
            if (r1 == 0) goto L99
            java.lang.Object r5 = r1.m105816c()
            boolean r1 = r5 instanceof co.bird.android.model.persistence.nestedstructures.ZoneSummary
            if (r1 == 0) goto L8f
            goto L90
        L8f:
            r5 = r2
        L90:
            co.bird.android.model.persistence.nestedstructures.ZoneSummary r5 = (co.bird.android.model.persistence.nestedstructures.ZoneSummary) r5
            if (r5 == 0) goto L99
            java.lang.String r5 = r5.getTitle()
            goto L9a
        L99:
            r5 = r2
        L9a:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            if (r5 != 0) goto La9
            co.bird.android.bottomsheet.BaseBottomSheet<co.bird.android.model.BottomSheetButton> r5 = r4.f11508c
            if (r5 == 0) goto La9
            r0 = 0
            r1 = 1
            co.bird.android.bottomsheet.BaseBottomSheet.clearPeekViews$default(r5, r0, r1, r2)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.GI6.mo24871u(java.util.Collection):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37314Yj4.item_zone_flight_sheet_summary ? new C2706d(this, m41761u) : i == C37314Yj4.item_zone_flight_sheet_status ? new C2705c(this, m41761u) : i == C37314Yj4.item_zone_flight_sheet_details_title ? new C2704b(this, m41761u) : i == C37314Yj4.item_zone_flight_sheet_detail ? new C2703a(this, m41761u) : new C29735w1(m41761u);
    }
}
