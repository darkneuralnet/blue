package p000;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.imageupload.ImageUploadBar;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC36392Ul0;
import p000.AbstractC40765f86;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\nR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R.\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u0011*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001b"}, m28432d2 = {"Lt64;", "Lf86;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lio/reactivex/Observable;", "", "g", "", "", "D8", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "addPhotoClicksSubject", "e", "photoUrlsSubject", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: t64  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49044t64 extends AbstractC40765f86 {

    /* renamed from: d */
    public final C24558d<Unit> f109865d;

    /* renamed from: e */
    public final C24558d<List<String>> f109866e;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lt64$a;", "Lw1;", "", "position", "", "bind", "Lsc2;", "b", "Lsc2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lt64;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nProcessContainerOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessContainerOrderAdapter.kt\nco/bird/android/feature/transferorder/container/processing/adapters/ProcessContainerOrderAdapter$ImageUploadViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n18#2:84\n9#3,4:85\n1855#4,2:89\n*S KotlinDebug\n*F\n+ 1 ProcessContainerOrderAdapter.kt\nco/bird/android/feature/transferorder/container/processing/adapters/ProcessContainerOrderAdapter$ImageUploadViewHolder\n*L\n65#1:84\n65#1:85,4\n66#1:89,2\n*E\n"})
    /* renamed from: t64$a */
    /* loaded from: classes3.dex */
    public final class C28524a extends C29735w1 {

        /* renamed from: b */
        public final C48743sc2 f109867b;

        /* renamed from: c */
        public final /* synthetic */ C49044t64 f109868c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: t64$a$a */
        /* loaded from: classes3.dex */
        public static final class C28525a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49044t64 f109869g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28525a(C49044t64 c49044t64) {
                super(1);
                this.f109869g = c49044t64;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f109869g.f109865d.onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"t64$a$b", "Lco/bird/android/imageupload/ImageUploadBar$a;", "", "Landroid/net/Uri;", "photos", "", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nProcessContainerOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessContainerOrderAdapter.kt\nco/bird/android/feature/transferorder/container/processing/adapters/ProcessContainerOrderAdapter$ImageUploadViewHolder$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1549#2:84\n1620#2,3:85\n*S KotlinDebug\n*F\n+ 1 ProcessContainerOrderAdapter.kt\nco/bird/android/feature/transferorder/container/processing/adapters/ProcessContainerOrderAdapter$ImageUploadViewHolder$2\n*L\n59#1:84\n59#1:85,3\n*E\n"})
        /* renamed from: t64$a$b */
        /* loaded from: classes3.dex */
        public static final class C28526b implements ImageUploadBar.InterfaceC15989a {

            /* renamed from: a */
            public final /* synthetic */ C49044t64 f109870a;

            public C28526b(C49044t64 c49044t64) {
                this.f109870a = c49044t64;
            }

            @Override // co.bird.android.imageupload.ImageUploadBar.InterfaceC15989a
            /* renamed from: a */
            public void mo8628a(List<? extends Uri> photos) {
                int collectionSizeOrDefault;
                Intrinsics.checkNotNullParameter(photos, "photos");
                C24558d c24558d = this.f109870a.f109866e;
                List<? extends Uri> list = photos;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Uri uri : list) {
                    String uri2 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri2, "it.toString()");
                    arrayList.add(uri2);
                }
                c24558d.onNext(arrayList);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28524a(C49044t64 c49044t64, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f109868c = c49044t64;
            C48743sc2 m13947a = C48743sc2.m13947a(view);
            Intrinsics.checkNotNullExpressionValue(m13947a, "bind(view)");
            this.f109867b = m13947a;
            ImageUploadBar imageUploadBar = m13947a.f109041c;
            Intrinsics.checkNotNullExpressionValue(imageUploadBar, "binding.imageUploadBar");
            C34585Ms2.m94661j(imageUploadBar, new C28525a(c49044t64));
            m13947a.f109041c.setPhotoChangedListener(new C28526b(c49044t64));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f109868c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C45220mf6)) {
                m105816c = null;
            }
            C45220mf6 c45220mf6 = (C45220mf6) m105816c;
            if (c45220mf6 != null) {
                for (String str : c45220mf6.m25205e()) {
                    this.f109867b.f109041c.m56145s(str);
                }
                this.f109867b.f109042d.setText(c45220mf6.m25207c());
                ImageView imageView = this.f109867b.f109043e;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.statusIconFailure");
                C49520tu6.m11232s(imageView, !c45220mf6.m25206d(), 4);
                ImageView imageView2 = this.f109867b.f109044f;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.statusIconSuccess");
                C49520tu6.m11232s(imageView2, c45220mf6.m25206d(), 4);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, m28432d2 = {"Lt64$b;", "Lf86$g;", "Lf86;", "", "position", "", "bind", "Landroid/view/View;", "view", "<init>", "(Lt64;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: t64$b */
    /* loaded from: classes3.dex */
    public final class C28527b extends AbstractC40765f86.C20241g {

        /* renamed from: d */
        public final /* synthetic */ C49044t64 f109871d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28527b(C49044t64 c49044t64, View view) {
            super(c49044t64, view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f109871d = c49044t64;
        }

        @Override // p000.AbstractC40765f86.C20241g, p000.C29735w1
        public void bind(int i) {
            super.bind(i);
            TextView textView = m41956a().f2544f;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.viewAction");
            C49520tu6.m11232s(textView, false, 4);
        }
    }

    public C49044t64() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f109865d = m31902e;
        C24558d<List<String>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<List<String>>()");
        this.f109866e = m31902e2;
    }

    /* renamed from: D8 */
    public final Observable<List<String>> m13069D8() {
        Observable<List<String>> hide = this.f109866e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "photoUrlsSubject.hide()");
        return hide;
    }

    /* renamed from: g */
    public final Observable<Unit> m13068g() {
        Observable<Unit> hide = this.f109865d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "addPhotoClicksSubject.hide()");
        return hide;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C44627lf6();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_section_header ? new AbstractC40765f86.C20240f(this, m41761u) : i == C35442Qj4.item_container_order ? new AbstractC40765f86.C20235a(this, m41761u) : i == C35442Qj4.item_container_order_details_header ? new AbstractC36392Ul0.View$OnClickListenerC8438a(this, m41761u) : i == C35442Qj4.item_image_upload ? new C28524a(this, m41761u) : i == C35442Qj4.item_sku_order_status ? new AbstractC40765f86.C20239e(this, m41761u) : i == C35442Qj4.item_container_order_sku_order ? new C28527b(this, m41761u) : i == C35442Qj4.item_header_spannable_status_cta ? new AbstractC40765f86.C20236b(this, m41761u) : i == C35442Qj4.item_header_value ? new AbstractC40765f86.C20238d(this, m41761u) : i == C35442Qj4.item_transfer_order ? new AbstractC40765f86.C20243h(this, m41761u) : new C29735w1(m41761u);
    }
}
