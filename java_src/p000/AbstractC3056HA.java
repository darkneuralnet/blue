package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC10997b;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.persistence.Announcement;
import co.bird.android.model.persistence.FeatureAnnouncementDialogResponse;
import co.bird.android.model.persistence.nestedstructures.AnnouncementPage;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001?B\u001f\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b<\u0010=J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0014\u0010\u0014\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0011H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010.\u001a\u0004\u0018\u00010)8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u00101\u001a\u0004\u0018\u00010)8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068$X¤\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006@"}, m28432d2 = {"LHA;", "LxE;", "Lxk1;", "Lio/reactivex/Observable;", "", "W4", "Lco/bird/android/model/persistence/Announcement;", "announcement", "Lio/reactivex/c;", "ia", "Lco/bird/android/model/constant/AnnouncementContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "startingBirdCode", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "nj", "l9", "Landroid/view/View;", "am", "contentView", "gm", "LJf;", "b", "LJf;", "adapter", "Lbg;", "c", "Lbg;", "converter", "Landroid/view/ViewGroup;", DateTokenConverter.CONVERTER_KEY, "Landroid/view/ViewGroup;", "Zl", "()Landroid/view/ViewGroup;", "bannerView", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "Wl", "()Landroid/widget/ImageView;", "bannerImage", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "Yl", "()Landroid/widget/TextView;", "bannerTitle", "g", "Xl", "bannerSubtitle", "Landroidx/appcompat/app/b;", "h", "Landroidx/appcompat/app/b;", "dialog", "LTo2;", "Vl", "()LTo2;", "assetManager", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;)V", "i", C17296a.f69688o, "announcement_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFeatureAnnouncementModalUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureAnnouncementModalUi.kt\nco/bird/android/lib/announcement/BaseFeatureAnnouncementModalUi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n1#2:198\n1747#3,3:199\n*S KotlinDebug\n*F\n+ 1 FeatureAnnouncementModalUi.kt\nco/bird/android/lib/announcement/BaseFeatureAnnouncementModalUi\n*L\n175#1:199,3\n*E\n"})
/* renamed from: HA */
/* loaded from: classes3.dex */
public abstract class AbstractC3056HA extends AbstractC30071xE implements InterfaceC51786xk1 {

    /* renamed from: i */
    public static final C3057a f12985i = new C3057a(null);

    /* renamed from: b */
    public final C4176Jf f12986b;

    /* renamed from: c */
    public final C12470bg f12987c;

    /* renamed from: d */
    public final ViewGroup f12988d;

    /* renamed from: e */
    public final ImageView f12989e;

    /* renamed from: f */
    public final TextView f12990f;

    /* renamed from: g */
    public final TextView f12991g;

    /* renamed from: h */
    public DialogInterfaceC10997b f12992h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LHA$a;", "", "", "SIDE_NAV_BANNER_DP", "I", "<init>", "()V", "announcement_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: HA$a */
    /* loaded from: classes3.dex */
    public static final class C3057a {
        public /* synthetic */ C3057a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3057a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Primary;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Primary;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HA$b */
    /* loaded from: classes3.dex */
    public static final class C3058b extends Lambda implements Function1<Unit, FeatureAnnouncementDialogResponse.Primary> {

        /* renamed from: g */
        public final /* synthetic */ Announcement f12993g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3058b(Announcement announcement) {
            super(1);
            this.f12993g = announcement;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final FeatureAnnouncementDialogResponse.Primary invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new FeatureAnnouncementDialogResponse.Primary(this.f12993g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Share;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Share;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HA$c */
    /* loaded from: classes3.dex */
    public static final class C3059c extends Lambda implements Function1<Unit, FeatureAnnouncementDialogResponse.Share> {

        /* renamed from: g */
        public final /* synthetic */ Announcement f12994g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3059c(Announcement announcement) {
            super(1);
            this.f12994g = announcement;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final FeatureAnnouncementDialogResponse.Share invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new FeatureAnnouncementDialogResponse.Share(this.f12994g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$LearnMore;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$LearnMore;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HA$d */
    /* loaded from: classes3.dex */
    public static final class C3060d extends Lambda implements Function1<Unit, FeatureAnnouncementDialogResponse.LearnMore> {

        /* renamed from: g */
        public final /* synthetic */ Announcement f12995g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3060d(Announcement announcement) {
            super(1);
            this.f12995g = announcement;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final FeatureAnnouncementDialogResponse.LearnMore invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new FeatureAnnouncementDialogResponse.LearnMore(this.f12995g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HA$e */
    /* loaded from: classes3.dex */
    public static final class C3061e extends Lambda implements Function1<Unit, FeatureAnnouncementDialogResponse.Dismiss> {

        /* renamed from: g */
        public final /* synthetic */ Announcement f12996g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3061e(Announcement announcement) {
            super(1);
            this.f12996g = announcement;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final FeatureAnnouncementDialogResponse.Dismiss invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new FeatureAnnouncementDialogResponse.Dismiss(this.f12996g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3056HA(BaseActivity activity, C4176Jf adapter, C12470bg converter) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f12986b = adapter;
        this.f12987c = converter;
    }

    /* renamed from: bm */
    public static final void m104240bm(AbstractC3056HA this$0, List sections) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sections, "$sections");
        this$0.f12986b.mo24871u(sections);
    }

    /* renamed from: cm */
    public static final FeatureAnnouncementDialogResponse.Primary m104239cm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (FeatureAnnouncementDialogResponse.Primary) tmp0.invoke(obj);
    }

    /* renamed from: dm */
    public static final FeatureAnnouncementDialogResponse.Share m104238dm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (FeatureAnnouncementDialogResponse.Share) tmp0.invoke(obj);
    }

    /* renamed from: em */
    public static final FeatureAnnouncementDialogResponse.LearnMore m104237em(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (FeatureAnnouncementDialogResponse.LearnMore) tmp0.invoke(obj);
    }

    /* renamed from: fm */
    public static final FeatureAnnouncementDialogResponse.Dismiss m104236fm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (FeatureAnnouncementDialogResponse.Dismiss) tmp0.invoke(obj);
    }

    /* renamed from: hm */
    public static final void m104234hm(AbstractC3056HA this$0, RecyclerView recyclerView) {
        int i;
        int coerceAtMost;
        Window window;
        Window window2;
        View decorView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DialogInterfaceC10997b dialogInterfaceC10997b = this$0.f12992h;
        if (dialogInterfaceC10997b != null && (window2 = dialogInterfaceC10997b.getWindow()) != null && (decorView = window2.getDecorView()) != null) {
            i = decorView.getHeight();
        } else {
            i = 0;
        }
        Rect rect = new Rect();
        this$0.getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        coerceAtMost = RangesKt___RangesKt.coerceAtMost((int) (i * 1.33d), (int) (rect.height() * 0.9d));
        DialogInterfaceC10997b dialogInterfaceC10997b2 = this$0.f12992h;
        if (dialogInterfaceC10997b2 != null && (window = dialogInterfaceC10997b2.getWindow()) != null) {
            window.setLayout(-2, coerceAtMost);
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.height = recyclerView.getHeight() + (coerceAtMost - i);
        recyclerView.setLayoutParams(layoutParams);
    }

    /* renamed from: Vl */
    public abstract InterfaceC36187To2 mo2709Vl();

    @Override // p000.InterfaceC51786xk1
    /* renamed from: W4 */
    public Observable<Unit> mo4759W4() {
        Observable<Unit> clicksThrottle$default;
        ViewGroup mo75617Zl = mo75617Zl();
        if (mo75617Zl == null || (clicksThrottle$default = C44626lf5.clicksThrottle$default(mo75617Zl, 0L, 1, null)) == null) {
            Observable<Unit> never = Observable.never();
            Intrinsics.checkNotNullExpressionValue(never, "never()");
            return never;
        }
        return clicksThrottle$default;
    }

    /* renamed from: Wl */
    public ImageView mo75628Wl() {
        return this.f12989e;
    }

    /* renamed from: Xl */
    public TextView mo75624Xl() {
        return this.f12991g;
    }

    /* renamed from: Yl */
    public TextView mo75622Yl() {
        return this.f12990f;
    }

    /* renamed from: Zl */
    public ViewGroup mo75617Zl() {
        return this.f12988d;
    }

    /* renamed from: am */
    public final View m104241am(Announcement announcement, String str) {
        InterfaceC34094Kp6 m18250c;
        C37613Zq6 m72400a;
        if (announcement.isFullscreen()) {
            m18250c = C40068dy1.m43466c(getActivity().getLayoutInflater());
            m72400a = C37613Zq6.m72400a(m18250c.getRoot());
            Intrinsics.checkNotNullExpressionValue(m72400a, "bind(binding.root)");
            Intrinsics.checkNotNullExpressionValue(m18250c, "{\n      FragmentFeatureA…ind(binding.root) }\n    }");
        } else {
            m18250c = C47233q31.m18250c(getActivity().getLayoutInflater());
            m72400a = C37613Zq6.m72400a(m18250c.getRoot());
            Intrinsics.checkNotNullExpressionValue(m72400a, "bind(binding.root)");
            Intrinsics.checkNotNullExpressionValue(m18250c, "{\n      DialogFeatureAnn…ind(binding.root) }\n    }");
        }
        if (!announcement.isFullscreen()) {
            ViewGroup.LayoutParams layoutParams = m72400a.f49386d.getLayoutParams();
            layoutParams.height = -2;
            m72400a.f49386d.setLayoutParams(layoutParams);
        }
        m72400a.f49386d.setAdapter(this.f12986b);
        m72400a.f49386d.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        m72400a.f49386d.setItemAnimator(new C11894g());
        final List<C3023H6> m64189a = this.f12987c.m64189a(announcement, str);
        if (announcement.isFullscreen()) {
            m72400a.f49386d.post(new Runnable() { // from class: GA
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3056HA.m104240bm(AbstractC3056HA.this, m64189a);
                }
            });
        } else {
            this.f12986b.mo24871u(m64189a);
        }
        View root = m18250c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    /* renamed from: gm */
    public final void m104235gm(Announcement announcement, View view) {
        DialogInterfaceC10997b.C10998a c10998a;
        boolean z;
        boolean z2;
        if (announcement.isFullscreen()) {
            C48927su6.m13411d(view);
            c10998a = new DialogInterfaceC10997b.C10998a(getActivity(), 16973837);
        } else {
            c10998a = new DialogInterfaceC10997b.C10998a(getActivity());
        }
        DialogInterfaceC10997b mo70301a = c10998a.mo70284r(view).mo70301a();
        this.f12992h = mo70301a;
        if (mo70301a != null) {
            mo70301a.show();
        }
        if (!announcement.isFullscreen()) {
            List<AnnouncementPage> pages = announcement.getPages();
            boolean z3 = false;
            if (pages != null) {
                List<AnnouncementPage> list = pages;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (AnnouncementPage announcementPage : list) {
                        if (announcementPage.getTitle() != null) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    z3 = true;
                }
            }
            if (z3) {
                final RecyclerView recyclerView = (RecyclerView) view.findViewById(C45841ni4.recyclerView);
                recyclerView.post(new Runnable() { // from class: FA
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3056HA.m104234hm(AbstractC3056HA.this, recyclerView);
                    }
                });
            }
        }
    }

    @Override // p000.InterfaceC51786xk1
    /* renamed from: ia */
    public AbstractC23461c mo4758ia(Announcement announcement) {
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        ViewGroup mo75617Zl = mo75617Zl();
        if (mo75617Zl != null) {
            C49520tu6.show$default(mo75617Zl, true, 0, 2, null);
        }
        TextView mo75622Yl = mo75622Yl();
        if (mo75622Yl != null) {
            mo75622Yl.setText(announcement.getAuxiliaryTitle());
        }
        TextView mo75624Xl = mo75624Xl();
        if (mo75624Xl != null) {
            mo75624Xl.setText(announcement.getAuxiliaryBody());
        }
        LegacyAsset auxiliaryAsset = announcement.getAuxiliaryAsset();
        if (mo75628Wl() != null && auxiliaryAsset != null) {
            InterfaceC36187To2 mo2709Vl = mo2709Vl();
            ImageView mo75628Wl = mo75628Wl();
            Intrinsics.checkNotNull(mo75628Wl);
            AbstractC23461c m33069Q = mo2709Vl.mo80867a(auxiliaryAsset, mo75628Wl, (int) C49347td3.m12002a(60, getActivity()), (int) C49347td3.m12002a(60, getActivity())).m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "{\n      assetManager.dra…).onErrorComplete()\n    }");
            return m33069Q;
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "{\n      Completable.complete()\n    }");
        return m33039p;
    }

    @Override // p000.InterfaceC51786xk1
    /* renamed from: l9 */
    public void mo4757l9() {
        DialogInterfaceC10997b dialogInterfaceC10997b = this.f12992h;
        if (dialogInterfaceC10997b != null) {
            dialogInterfaceC10997b.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    @Override // p000.InterfaceC51786xk1
    /* renamed from: nj */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Observable<FeatureAnnouncementDialogResponse> mo4756nj(AnnouncementContext context, Announcement announcement, String str) {
        ImageView close;
        C37613Zq6 m72400a;
        boolean z;
        List listOfNotNull;
        boolean z2;
        Button button;
        boolean isBlank;
        boolean isBlank2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        View m104241am = m104241am(announcement, str);
        if (announcement.isFullscreen()) {
            C40068dy1 m43468a = C40068dy1.m43468a(m104241am);
            close = m43468a.f77488c;
            Intrinsics.checkNotNullExpressionValue(close, "close");
            m43468a.f77490e.setText(announcement.getNavigationTitle());
            m72400a = C37613Zq6.m72400a(m43468a.getRoot());
        } else {
            C47233q31 m18252a = C47233q31.m18252a(m104241am);
            close = m18252a.f104601b;
            Intrinsics.checkNotNullExpressionValue(close, "close");
            m72400a = C37613Zq6.m72400a(m18252a.getRoot());
        }
        Intrinsics.checkNotNullExpressionValue(m72400a, "if (announcement.isFulls…ind(binding.root) }\n    }");
        Button button2 = m72400a.f49385c;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.questions");
        String learnMoreUrl = announcement.getLearnMoreUrl();
        if (learnMoreUrl != null) {
            isBlank2 = StringsKt__StringsJVMKt.isBlank(learnMoreUrl);
            if (!isBlank2) {
                z = false;
                C49520tu6.show$default(button2, !z, 0, 2, null);
                m72400a.f49384b.setText(announcement.getButtonText());
                if (context != AnnouncementContext.SIDE_MENU) {
                    m72400a.f49387e.setText(announcement.getButtonText());
                    Button button3 = m72400a.f49387e;
                    Intrinsics.checkNotNullExpressionValue(button3, "binding.share");
                    String shareContent = announcement.getShareContent();
                    if (shareContent != null) {
                        isBlank = StringsKt__StringsJVMKt.isBlank(shareContent);
                        if (!isBlank) {
                            z2 = false;
                            C49520tu6.show$default(button3, !z2, 0, 2, null);
                            Button button4 = m72400a.f49384b;
                            Intrinsics.checkNotNullExpressionValue(button4, "binding.primary");
                            Intrinsics.checkNotNullExpressionValue(m72400a.f49387e, "binding.share");
                            C49520tu6.m11232s(button4, !C49520tu6.m11230u(button), 4);
                        }
                    }
                    z2 = true;
                    C49520tu6.show$default(button3, !z2, 0, 2, null);
                    Button button42 = m72400a.f49384b;
                    Intrinsics.checkNotNullExpressionValue(button42, "binding.primary");
                    Intrinsics.checkNotNullExpressionValue(m72400a.f49387e, "binding.share");
                    C49520tu6.m11232s(button42, !C49520tu6.m11230u(button), 4);
                } else {
                    Button button5 = m72400a.f49387e;
                    Intrinsics.checkNotNullExpressionValue(button5, "binding.share");
                    C49520tu6.m11239l(button5);
                }
                m104235gm(announcement, m104241am);
                Button button6 = m72400a.f49384b;
                Intrinsics.checkNotNullExpressionValue(button6, "binding.primary");
                Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button6, 0L, 1, null);
                final C3058b c3058b = new C3058b(announcement);
                Button button7 = m72400a.f49387e;
                Intrinsics.checkNotNullExpressionValue(button7, "binding.share");
                Observable clicksThrottle$default2 = C44626lf5.clicksThrottle$default(button7, 0L, 1, null);
                final C3059c c3059c = new C3059c(announcement);
                Button button8 = m72400a.f49385c;
                Intrinsics.checkNotNullExpressionValue(button8, "binding.questions");
                Observable clicksThrottle$default3 = C44626lf5.clicksThrottle$default(button8, 0L, 1, null);
                final C3060d c3060d = new C3060d(announcement);
                Observable clicksThrottle$default4 = C44626lf5.clicksThrottle$default(close, 0L, 1, null);
                final C3061e c3061e = new C3061e(announcement);
                listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Observable[]{clicksThrottle$default.map(new InterfaceC23492o() { // from class: BA
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        FeatureAnnouncementDialogResponse.Primary m104239cm;
                        m104239cm = AbstractC3056HA.m104239cm(Function1.this, obj);
                        return m104239cm;
                    }
                }), clicksThrottle$default2.map(new InterfaceC23492o() { // from class: CA
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        FeatureAnnouncementDialogResponse.Share m104238dm;
                        m104238dm = AbstractC3056HA.m104238dm(Function1.this, obj);
                        return m104238dm;
                    }
                }), clicksThrottle$default3.map(new InterfaceC23492o() { // from class: DA
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        FeatureAnnouncementDialogResponse.LearnMore m104237em;
                        m104237em = AbstractC3056HA.m104237em(Function1.this, obj);
                        return m104237em;
                    }
                }), clicksThrottle$default4.map(new InterfaceC23492o() { // from class: EA
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        FeatureAnnouncementDialogResponse.Dismiss m104236fm;
                        m104236fm = AbstractC3056HA.m104236fm(Function1.this, obj);
                        return m104236fm;
                    }
                })});
                Observable<FeatureAnnouncementDialogResponse> merge = Observable.merge(listOfNotNull);
                Intrinsics.checkNotNullExpressionValue(merge, "announcement: Announceme…announcement) },\n      ))");
                return merge;
            }
        }
        z = true;
        C49520tu6.show$default(button2, !z, 0, 2, null);
        m72400a.f49384b.setText(announcement.getButtonText());
        if (context != AnnouncementContext.SIDE_MENU) {
        }
        m104235gm(announcement, m104241am);
        Button button62 = m72400a.f49384b;
        Intrinsics.checkNotNullExpressionValue(button62, "binding.primary");
        Observable clicksThrottle$default5 = C44626lf5.clicksThrottle$default(button62, 0L, 1, null);
        final Function1 c3058b2 = new C3058b(announcement);
        Button button72 = m72400a.f49387e;
        Intrinsics.checkNotNullExpressionValue(button72, "binding.share");
        Observable clicksThrottle$default22 = C44626lf5.clicksThrottle$default(button72, 0L, 1, null);
        final Function1 c3059c2 = new C3059c(announcement);
        Button button82 = m72400a.f49385c;
        Intrinsics.checkNotNullExpressionValue(button82, "binding.questions");
        Observable clicksThrottle$default32 = C44626lf5.clicksThrottle$default(button82, 0L, 1, null);
        final Function1 c3060d2 = new C3060d(announcement);
        Observable clicksThrottle$default42 = C44626lf5.clicksThrottle$default(close, 0L, 1, null);
        final Function1 c3061e2 = new C3061e(announcement);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Observable[]{clicksThrottle$default5.map(new InterfaceC23492o() { // from class: BA
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                FeatureAnnouncementDialogResponse.Primary m104239cm;
                m104239cm = AbstractC3056HA.m104239cm(Function1.this, obj);
                return m104239cm;
            }
        }), clicksThrottle$default22.map(new InterfaceC23492o() { // from class: CA
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                FeatureAnnouncementDialogResponse.Share m104238dm;
                m104238dm = AbstractC3056HA.m104238dm(Function1.this, obj);
                return m104238dm;
            }
        }), clicksThrottle$default32.map(new InterfaceC23492o() { // from class: DA
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                FeatureAnnouncementDialogResponse.LearnMore m104237em;
                m104237em = AbstractC3056HA.m104237em(Function1.this, obj);
                return m104237em;
            }
        }), clicksThrottle$default42.map(new InterfaceC23492o() { // from class: EA
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                FeatureAnnouncementDialogResponse.Dismiss m104236fm;
                m104236fm = AbstractC3056HA.m104236fm(Function1.this, obj);
                return m104236fm;
            }
        })});
        Observable<FeatureAnnouncementDialogResponse> merge2 = Observable.merge(listOfNotNull);
        Intrinsics.checkNotNullExpressionValue(merge2, "announcement: Announceme…announcement) },\n      ))");
        return merge2;
    }
}
