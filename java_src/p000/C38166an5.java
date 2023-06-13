package p000;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.imageupload.ImageUploadBar;
import co.bird.android.model.LocalAsset;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.ScrapRequestReason;
import co.bird.android.model.constant.TaskPriority;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007,-\u0019\u001c #\u0014B\u0011\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eJ\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000eJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000eR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR.\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 \u001f*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R.\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 \u001f*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f0\u000f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\"\u0010%\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\f0\f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R.\u0010)\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016 \u001f*\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u00150&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006."}, m28432d2 = {"Lan5;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ScrapRequestReason;", "s", "", "v", "g", "", "Landroid/net/Uri;", "w", "Lsu2;", "c", "Lsu2;", "localAssetManager", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/d;", "reasonSubject", "f", "detailsSubject", "addPhotoClickSubject", "Lio/reactivex/subjects/a;", "h", "Lio/reactivex/subjects/a;", "photoUpdatesSubject", "<init>", "(Lsu2;)V", C17296a.f69688o, "b", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: an5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38166an5 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final InterfaceC48923su2 f51240c;

    /* renamed from: d */
    public RecyclerView f51241d;

    /* renamed from: e */
    public final C24558d<Optional<ScrapRequestReason>> f51242e;

    /* renamed from: f */
    public final C24558d<Optional<CharSequence>> f51243f;

    /* renamed from: g */
    public final C24558d<Unit> f51244g;

    /* renamed from: h */
    public final C24552a<List<Uri>> f51245h;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lan5$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/EditText;", "b", "Landroid/widget/EditText;", "detailsView", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(Lan5;Landroid/view/View;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$DetailsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n18#2:191\n9#3,4:192\n1#4:196\n*S KotlinDebug\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$DetailsViewHolder\n*L\n144#1:191\n144#1:192,4\n*E\n"})
    /* renamed from: an5$a */
    /* loaded from: classes3.dex */
    public final class C10860a extends C29735w1 {

        /* renamed from: b */
        public final EditText f51246b;

        /* renamed from: c */
        public boolean f51247c;

        /* renamed from: d */
        public final /* synthetic */ C38166an5 f51248d;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHJ6;", "", C17296a.f69688o, "(LHJ6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: an5$a$a */
        /* loaded from: classes3.dex */
        public static final class C10861a extends Lambda implements Function1<HJ6, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C38166an5 f51250h;

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", Entry.TYPE_TEXT, "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "", C17296a.f69688o, "(Ljava/lang/CharSequence;III)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: an5$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C10862a extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C10860a f51251g;

                /* renamed from: h */
                public final /* synthetic */ C38166an5 f51252h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10862a(C10860a c10860a, C38166an5 c38166an5) {
                    super(4);
                    this.f51251g = c10860a;
                    this.f51252h = c38166an5;
                }

                /* renamed from: a */
                public final void m70729a(CharSequence charSequence, int i, int i2, int i3) {
                    if (this.f51251g.f51247c) {
                        return;
                    }
                    this.f51252h.f51243f.onNext(Optional.f63040c.m59033b(charSequence));
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    m70729a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10861a(C38166an5 c38166an5) {
                super(1);
                this.f51250h = c38166an5;
            }

            /* renamed from: a */
            public final void m70730a(HJ6 textChangedListener) {
                Intrinsics.checkNotNullParameter(textChangedListener, "$this$textChangedListener");
                textChangedListener.m104030b(new C10862a(C10860a.this, this.f51250h));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HJ6 hj6) {
                m70730a(hj6);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10860a(C38166an5 c38166an5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f51248d = c38166an5;
            EditText editText = (EditText) view;
            this.f51246b = editText;
            C34585Ms2.m94647x(editText, new C10861a(c38166an5));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f51247c = true;
            Object m105816c = this.f51248d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                this.f51246b.setText((String) pair.component1());
                this.f51246b.setEnabled(booleanValue);
            }
            this.f51247c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lan5$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "headerView", "Landroid/view/View;", "view", "<init>", "(Lan5;Landroid/view/View;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,190:1\n18#2:191\n9#3,4:192\n*S KotlinDebug\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$HeaderViewHolder\n*L\n80#1:191\n80#1:192,4\n*E\n"})
    /* renamed from: an5$b */
    /* loaded from: classes3.dex */
    public final class C10863b extends C29735w1 {

        /* renamed from: b */
        public final TextView f51253b;

        /* renamed from: c */
        public final /* synthetic */ C38166an5 f51254c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10863b(C38166an5 c38166an5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f51254c = c38166an5;
            this.f51253b = (TextView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f51253b;
            Object m105816c = this.f51254c.m94545o().m109397e(i).m105816c();
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

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lan5$c;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/imageupload/ImageUploadBar;", "b", "Lco/bird/android/imageupload/ImageUploadBar;", "imageBar", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(Lan5;Landroid/view/View;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$ImageBarViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n18#2:191\n9#3,4:192\n1855#4,2:196\n*S KotlinDebug\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$ImageBarViewHolder\n*L\n124#1:191\n124#1:192,4\n124#1:196,2\n*E\n"})
    /* renamed from: an5$c */
    /* loaded from: classes3.dex */
    public final class C10864c extends C29735w1 {

        /* renamed from: b */
        public final ImageUploadBar f51255b;

        /* renamed from: c */
        public boolean f51256c;

        /* renamed from: d */
        public final /* synthetic */ C38166an5 f51257d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: an5$c$a */
        /* loaded from: classes3.dex */
        public static final class C10865a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C38166an5 f51258g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10865a(C38166an5 c38166an5) {
                super(1);
                this.f51258g = c38166an5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f51258g.f51244g.onNext(Unit.INSTANCE);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"an5$c$b", "Lco/bird/android/imageupload/ImageUploadBar$a;", "", "Landroid/net/Uri;", "photos", "", C17296a.f69688o, "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: an5$c$b */
        /* loaded from: classes3.dex */
        public static final class C10866b implements ImageUploadBar.InterfaceC15989a {

            /* renamed from: b */
            public final /* synthetic */ C38166an5 f51260b;

            public C10866b(C38166an5 c38166an5) {
                this.f51260b = c38166an5;
            }

            @Override // co.bird.android.imageupload.ImageUploadBar.InterfaceC15989a
            /* renamed from: a */
            public void mo8628a(List<? extends Uri> photos) {
                Intrinsics.checkNotNullParameter(photos, "photos");
                if (C10864c.this.f51256c) {
                    return;
                }
                this.f51260b.f51245h.onNext(photos);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10864c(C38166an5 c38166an5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f51257d = c38166an5;
            ImageUploadBar imageUploadBar = (ImageUploadBar) view;
            this.f51255b = imageUploadBar;
            C34585Ms2.m94661j(imageUploadBar, new C10865a(c38166an5));
            imageUploadBar.setPhotoChangedListener(new C10866b(c38166an5));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f51256c = true;
            Object m105816c = this.f51257d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof List)) {
                m105816c = null;
            }
            List<Uri> list = (List) m105816c;
            if (list != null) {
                ImageUploadBar imageUploadBar = this.f51255b;
                for (Uri uri : list) {
                    imageUploadBar.m56146r(uri);
                }
            }
            this.f51256c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"Lan5$d;", "Lw1;", "", "position", "", "bind", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/ImageView;", "imageView", "Landroid/view/View;", "view", "<init>", "(Lan5;Landroid/view/View;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$PhotoViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n*L\n1#1,190:1\n18#2:191\n9#3,4:192\n41#4:196\n*S KotlinDebug\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$PhotoViewHolder\n*L\n179#1:191\n179#1:192,4\n185#1:196\n*E\n"})
    /* renamed from: an5$d */
    /* loaded from: classes3.dex */
    public final class C10867d extends C29735w1 {

        /* renamed from: b */
        public final ImageView f51261b;

        /* renamed from: c */
        public final /* synthetic */ C38166an5 f51262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10867d(C38166an5 c38166an5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f51262c = c38166an5;
            this.f51261b = (ImageView) view.findViewById(C37296Yh4.requestPhoto);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f51262c.m94545o().m109397e(i).m105816c();
            RecyclerView recyclerView = null;
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            String str = (String) m105816c;
            if (str != null) {
                C38166an5 c38166an5 = this.f51262c;
                AbstractC23442F<LocalAsset> mo13534a = c38166an5.f51240c.mo13534a(str, AssetManagerType.REPAIR, TaskPriority.IMMEDIATE);
                ImageView imageView = this.f51261b;
                Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
                RecyclerView recyclerView2 = c38166an5.f51241d;
                if (recyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                } else {
                    recyclerView = recyclerView2;
                }
                ScopeProvider m45202a = ViewScopeProvider.m45202a(recyclerView);
                Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
                C37279Yf5.m74583L(mo13534a, imageView, m45202a);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lan5$e;", "Lw1;", "", "position", "", "bind", "Landroid/widget/CheckBox;", "b", "Landroid/widget/CheckBox;", "checkBox", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(Lan5;Landroid/view/View;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$ReasonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,190:1\n18#2:191\n9#3,4:192\n*S KotlinDebug\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$ReasonViewHolder\n*L\n99#1:191\n99#1:192,4\n*E\n"})
    /* renamed from: an5$e */
    /* loaded from: classes3.dex */
    public final class C10868e extends C29735w1 {

        /* renamed from: b */
        public final CheckBox f51263b;

        /* renamed from: c */
        public boolean f51264c;

        /* renamed from: d */
        public final /* synthetic */ C38166an5 f51265d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nScrapAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$ReasonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,190:1\n18#2:191\n9#3,4:192\n*S KotlinDebug\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$ReasonViewHolder$1\n*L\n91#1:191\n91#1:192,4\n*E\n"})
        /* renamed from: an5$e$a */
        /* loaded from: classes3.dex */
        public static final class C10869a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C38166an5 f51267h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10869a(C38166an5 c38166an5) {
                super(2);
                this.f51267h = c38166an5;
            }

            /* renamed from: a */
            public final void m70726a(CompoundButton compoundButton, boolean z) {
                if (C10868e.this.f51264c) {
                    return;
                }
                Object m105816c = this.f51267h.m94545o().m109397e(C10868e.this.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C33391Hp5)) {
                    m105816c = null;
                }
                C33391Hp5 c33391Hp5 = (C33391Hp5) m105816c;
                if (c33391Hp5 != null) {
                    C38166an5 c38166an5 = this.f51267h;
                    if (z) {
                        c38166an5.f51242e.onNext(Optional.f63040c.m59032c(c33391Hp5.m103408d()));
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m70726a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10868e(C38166an5 c38166an5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f51265d = c38166an5;
            CheckBox checkBox = (CheckBox) view;
            this.f51263b = checkBox;
            C34585Ms2.m94663h(checkBox, new C10869a(c38166an5));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f51264c = true;
            Object m105816c = this.f51265d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C33391Hp5)) {
                m105816c = null;
            }
            C33391Hp5 c33391Hp5 = (C33391Hp5) m105816c;
            if (c33391Hp5 != null) {
                this.f51263b.setText(c33391Hp5.m103410b());
                this.f51263b.setChecked(c33391Hp5.m103407e());
                this.f51263b.setEnabled(c33391Hp5.m103409c());
            }
            this.f51264c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001c\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0013"}, m28432d2 = {"Lan5$f;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "rejectionReason", "c", "rejectReasonMessage", DateTokenConverter.CONVERTER_KEY, "reviewedDate", "Landroid/view/View;", "view", "<init>", "(Lan5;Landroid/view/View;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$RejectionReasonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,190:1\n18#2:191\n9#3,4:192\n*S KotlinDebug\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$RejectionReasonViewHolder\n*L\n158#1:191\n158#1:192,4\n*E\n"})
    /* renamed from: an5$f */
    /* loaded from: classes3.dex */
    public final class C10870f extends C29735w1 {

        /* renamed from: b */
        public final TextView f51268b;

        /* renamed from: c */
        public final TextView f51269c;

        /* renamed from: d */
        public final TextView f51270d;

        /* renamed from: e */
        public final /* synthetic */ C38166an5 f51271e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10870f(C38166an5 c38166an5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f51271e = c38166an5;
            this.f51268b = (TextView) view.findViewById(C52955zi4.rejection);
            this.f51269c = (TextView) view.findViewById(C52955zi4.rejectMessage);
            this.f51270d = (TextView) view.findViewById(C52955zi4.reviewedDate);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f51271e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C33157Gp5)) {
                m105816c = null;
            }
            C33157Gp5 c33157Gp5 = (C33157Gp5) m105816c;
            if (c33157Gp5 != null) {
                this.f51268b.setText(c33157Gp5.m104694b());
                TextView rejectReasonMessage = this.f51269c;
                Intrinsics.checkNotNullExpressionValue(rejectReasonMessage, "rejectReasonMessage");
                if (c33157Gp5.m104693c() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(rejectReasonMessage, z, 0, 2, null);
                this.f51269c.setText(c33157Gp5.m104693c());
                this.f51270d.setText(c33157Gp5.m104692d());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"Lan5$g;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "submittedDate", "Landroid/view/View;", "view", "<init>", "(Lan5;Landroid/view/View;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$ScrapSubmittedDateViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,190:1\n18#2:191\n9#3,4:192\n*S KotlinDebug\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$ScrapSubmittedDateViewHolder\n*L\n171#1:191\n171#1:192,4\n*E\n"})
    /* renamed from: an5$g */
    /* loaded from: classes3.dex */
    public final class C10871g extends C29735w1 {

        /* renamed from: b */
        public final TextView f51272b;

        /* renamed from: c */
        public final /* synthetic */ C38166an5 f51273c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10871g(C38166an5 c38166an5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f51273c = c38166an5;
            this.f51272b = (TextView) view.findViewById(C37296Yh4.submittedDate);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f51272b;
            Object m105816c = this.f51273c.m94545o().m109397e(i).m105816c();
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

    public C38166an5(InterfaceC48923su2 localAssetManager) {
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        this.f51240c = localAssetManager;
        C24558d<Optional<ScrapRequestReason>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Optional<ScrapRequestReason>>()");
        this.f51242e = m31902e;
        C24558d<Optional<CharSequence>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Optional<CharSequence>>()");
        this.f51243f = m31902e2;
        C24558d<Unit> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Unit>()");
        this.f51244g = m31902e3;
        C24552a<List<Uri>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<Uri>>()");
        this.f51245h = m31922e;
    }

    /* renamed from: g */
    public final Observable<Unit> m70735g() {
        Observable<Unit> hide = this.f51244g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "addPhotoClickSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f51241d = recyclerView;
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C35011On5());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C38759bn5();
    }

    /* renamed from: s */
    public final Observable<Optional<ScrapRequestReason>> m70734s() {
        Observable<Optional<ScrapRequestReason>> hide = this.f51242e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "reasonSubject.hide()");
        return hide;
    }

    /* renamed from: v */
    public final Observable<Optional<CharSequence>> m70733v() {
        Observable<Optional<CharSequence>> hide = this.f51243f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "detailsSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<List<Uri>> m70732w() {
        Observable<List<Uri>> hide = this.f51245h.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "photoUpdatesSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C34272Lj4.item_scrap_header ? new C10863b(this, m41761u) : i == C34272Lj4.item_scrap_reason ? new C10868e(this, m41761u) : i == C34272Lj4.item_scrap_image_upload_bar ? new C10864c(this, m41761u) : i == C34272Lj4.item_scrap_details ? new C10860a(this, m41761u) : i == C45268mk4.item_scrap_rejection ? new C10870f(this, m41761u) : i == C34272Lj4.item_scrap_submitted_date ? new C10871g(this, m41761u) : i == C34272Lj4.item_scrap_request_photo ? new C10867d(this, m41761u) : new C29735w1(m41761u);
    }
}
