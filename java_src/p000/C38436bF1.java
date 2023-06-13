package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import co.bird.android.model.persistence.HardCountScan;
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
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001:\u0005\u001f \u0018\u001b!B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eJ\u001e\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\u00140\u00120\u000eR.\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 \u0017*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019RF\u0010\u001c\u001a4\u00120\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\u0014 \u0017*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00120\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\""}, m28432d2 = {"LbF1;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/HardCountScan;", "v", "Lkotlin/Pair;", "", "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "w", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "hardCountScansSubject", DateTokenConverter.CONVERTER_KEY, "identifiersSubject", "<init>", "()V", C17296a.f69688o, "b", "e", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bF1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C38436bF1 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Collection<HardCountScan>> f57150c;

    /* renamed from: d */
    public final C24558d<Pair<Collection<String>, InventoryScanningIdentifierCategory>> f57151d;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"LbF1$a;", "LbF1$b;", "LbF1;", "Landroid/view/View;", "view", "<init>", "(LbF1;Landroid/view/View;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bF1$a */
    /* loaded from: classes3.dex */
    public final class C12334a extends C12336b {

        /* renamed from: f */
        public final /* synthetic */ C38436bF1 f57152f;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nHardCountAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$HardCountVehiclesViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n18#2:117\n9#3,4:118\n1#4:122\n*S KotlinDebug\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$HardCountVehiclesViewHolder$1\n*L\n95#1:117\n95#1:118,4\n*E\n"})
        /* renamed from: bF1$a$a */
        /* loaded from: classes3.dex */
        public static final class C12335a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C38436bF1 f57153g;

            /* renamed from: h */
            public final /* synthetic */ C12334a f57154h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12335a(C38436bF1 c38436bF1, C12334a c12334a) {
                super(1);
                this.f57153g = c38436bF1;
                this.f57154h = c12334a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Collection m17704c;
                Object m105816c = this.f57153g.m94545o().m109397e(this.f57154h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C47366qH1)) {
                    m105816c = null;
                }
                C47366qH1 c47366qH1 = (C47366qH1) m105816c;
                if (c47366qH1 == null || (m17704c = c47366qH1.m17704c()) == null) {
                    return;
                }
                this.f57153g.f57150c.onNext(m17704c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12334a(C38436bF1 c38436bF1, View view) {
            super(c38436bF1, view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f57152f = c38436bF1;
            C34585Ms2.m94661j(view, new C12335a(c38436bF1, this));
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0094\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001e\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0015"}, m28432d2 = {"LbF1$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/ImageView;", "scooter", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "title", DateTokenConverter.CONVERTER_KEY, "details", "Landroid/view/View;", "view", "<init>", "(LbF1;Landroid/view/View;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$HardCountViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n18#2:117\n9#3,4:118\n1#4:122\n*S KotlinDebug\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$HardCountViewHolder\n*L\n66#1:117\n66#1:118,4\n*E\n"})
    /* renamed from: bF1$b */
    /* loaded from: classes3.dex */
    public class C12336b extends C29735w1 {

        /* renamed from: b */
        public final ImageView f57155b;

        /* renamed from: c */
        public TextView f57156c;

        /* renamed from: d */
        public TextView f57157d;

        /* renamed from: e */
        public final /* synthetic */ C38436bF1 f57158e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12336b(C38436bF1 c38436bF1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f57158e = c38436bF1;
            this.f57155b = (ImageView) this.itemView.findViewById(C48203rh4.scooter);
            this.f57156c = (TextView) this.itemView.findViewById(C48203rh4.title);
            this.f57157d = (TextView) this.itemView.findViewById(C48203rh4.details);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f57158e.m94545o().m109397e(i).m105816c();
            ColorStateList colorStateList = null;
            if (!(m105816c instanceof C47366qH1)) {
                m105816c = null;
            }
            C47366qH1 c47366qH1 = (C47366qH1) m105816c;
            if (c47366qH1 != null) {
                this.f57156c.setText(c47366qH1.m17697j());
                this.f57157d.setText(c47366qH1.m17703d());
                this.f57157d.setTextColor(c47366qH1.m17702e());
                this.f57155b.setImageDrawable(c47366qH1.m17700g());
                ImageView imageView = this.f57155b;
                Integer m17701f = c47366qH1.m17701f();
                if (m17701f != null) {
                    colorStateList = ColorStateList.valueOf(m17701f.intValue());
                }
                imageView.setImageTintList(colorStateList);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LbF1$c;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "headerView", "Landroid/view/View;", "view", "<init>", "(LbF1;Landroid/view/View;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,116:1\n18#2:117\n9#3,4:118\n*S KotlinDebug\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$HeaderViewHolder\n*L\n56#1:117\n56#1:118,4\n*E\n"})
    /* renamed from: bF1$c */
    /* loaded from: classes3.dex */
    public final class C12337c extends C29735w1 {

        /* renamed from: b */
        public final TextView f57159b;

        /* renamed from: c */
        public final /* synthetic */ C38436bF1 f57160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12337c(C38436bF1 c38436bF1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f57160c = c38436bF1;
            this.f57159b = (TextView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            C49520tu6.m11233r(this.f57159b);
            TextView textView = this.f57159b;
            Object m105816c = this.f57160c.m94545o().m109394h().get(i).m105816c();
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"LbF1$d;", "LbF1$b;", "LbF1;", "Landroid/view/View;", "view", "<init>", "(LbF1;Landroid/view/View;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bF1$d */
    /* loaded from: classes3.dex */
    public final class C12338d extends C12336b {

        /* renamed from: f */
        public final /* synthetic */ C38436bF1 f57161f;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nHardCountAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$IdentifierViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,116:1\n18#2:117\n9#3,4:118\n*S KotlinDebug\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$IdentifierViewHolder$1\n*L\n104#1:117\n104#1:118,4\n*E\n"})
        /* renamed from: bF1$d$a */
        /* loaded from: classes3.dex */
        public static final class C12339a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C38436bF1 f57162g;

            /* renamed from: h */
            public final /* synthetic */ C12338d f57163h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12339a(C38436bF1 c38436bF1, C12338d c12338d) {
                super(1);
                this.f57162g = c38436bF1;
                this.f57163h = c12338d;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f57162g.m94545o().m109397e(this.f57163h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C47366qH1)) {
                    m105816c = null;
                }
                C47366qH1 c47366qH1 = (C47366qH1) m105816c;
                if (c47366qH1 != null) {
                    C38436bF1 c38436bF1 = this.f57162g;
                    Collection m17704c = c47366qH1.m17704c();
                    InventoryScanningIdentifierCategory m17705b = c47366qH1.m17705b();
                    if (m17704c == null || m17705b == null) {
                        return;
                    }
                    c38436bF1.f57151d.onNext(TuplesKt.m28425to(m17704c, m17705b));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12338d(C38436bF1 c38436bF1, View view) {
            super(c38436bF1, view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f57161f = c38436bF1;
            C34585Ms2.m94661j(view, new C12339a(c38436bF1, this));
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001e\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0015"}, m28432d2 = {"LbF1$e;", "Lw1;", "", "position", "", "bind", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/ImageView;", "scooter", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "title", DateTokenConverter.CONVERTER_KEY, "details", "Landroid/view/View;", "view", "<init>", "(LbF1;Landroid/view/View;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$LastSuccessfulVehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n18#2:117\n9#3,4:118\n1#4:122\n*S KotlinDebug\n*F\n+ 1 HardCountAdapter.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapter$LastSuccessfulVehicleViewHolder\n*L\n82#1:117\n82#1:118,4\n*E\n"})
    /* renamed from: bF1$e */
    /* loaded from: classes3.dex */
    public final class C12340e extends C29735w1 {

        /* renamed from: b */
        public final ImageView f57164b;

        /* renamed from: c */
        public TextView f57165c;

        /* renamed from: d */
        public TextView f57166d;

        /* renamed from: e */
        public final /* synthetic */ C38436bF1 f57167e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12340e(C38436bF1 c38436bF1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f57167e = c38436bF1;
            this.f57164b = (ImageView) this.itemView.findViewById(C48203rh4.scooter);
            this.f57165c = (TextView) this.itemView.findViewById(C48203rh4.title);
            this.f57166d = (TextView) this.itemView.findViewById(C48203rh4.details);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f57167e.m94545o().m109397e(i).m105816c();
            ColorStateList colorStateList = null;
            if (!(m105816c instanceof C47366qH1)) {
                m105816c = null;
            }
            C47366qH1 c47366qH1 = (C47366qH1) m105816c;
            if (c47366qH1 != null) {
                this.f57165c.setText(c47366qH1.m17697j());
                this.f57166d.setText(c47366qH1.m17703d());
                this.f57166d.setTextColor(c47366qH1.m17702e());
                this.f57164b.setImageDrawable(c47366qH1.m17700g());
                ImageView imageView = this.f57164b;
                Integer m17701f = c47366qH1.m17701f();
                if (m17701f != null) {
                    colorStateList = ColorStateList.valueOf(m17701f.intValue());
                }
                imageView.setImageTintList(colorStateList);
            }
        }
    }

    public C38436bF1() {
        C24558d<Collection<HardCountScan>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Collection<HardCountScan>>()");
        this.f57150c = m31902e;
        C24558d<Pair<Collection<String>, InventoryScanningIdentifierCategory>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Pair<Collection<S…ingIdentifierCategory>>()");
        this.f57151d = m31902e2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new WF1());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C39029cF1();
    }

    /* renamed from: v */
    public final Observable<Collection<HardCountScan>> m64760v() {
        Observable<Collection<HardCountScan>> hide = this.f57150c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hardCountScansSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Pair<Collection<String>, InventoryScanningIdentifierCategory>> m64759w() {
        Observable<Pair<Collection<String>, InventoryScanningIdentifierCategory>> hide = this.f57151d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "identifiersSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        if (i == C40514ej4.item_hard_count) {
            return new C12334a(this, m41761u);
        }
        return i == C40514ej4.item_hard_count_unidentified || i == C40514ej4.item_hard_count_pending_upload ? new C12338d(this, m41761u) : i == C40514ej4.item_last_successful_hard_count ? new C12340e(this, m41761u) : i == C40514ej4.item_vehicle_models_header ? new C12337c(this, m41761u) : new C29735w1(m41761u);
    }
}
