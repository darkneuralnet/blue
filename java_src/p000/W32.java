package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.InspectionFlow;
import co.bird.android.model.InspectionIssue;
import co.bird.android.model.InspectionNotice;
import co.bird.android.model.constant.MapMarkerKind;
import co.bird.android.model.wire.WireMapMarker;
import co.bird.android.model.wire.WireMapMarkerKt;
import co.bird.android.model.wire.WireThemedColors;
import co.bird.android.widget.BatteryView;
import co.bird.android.widget.standardcomponents.InspectionV3CardView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0002()B\u0007¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00100\u000eJ\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000eJ\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000eJ\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u000eR\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\n0\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\n0\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR>\u0010\u001f\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012 \u0018*\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00100\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR:\u0010!\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012 \u0018*\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00100\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR:\u0010#\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012 \u0018*\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00100\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR:\u0010%\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011 \u0018*\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001a¨\u0006*"}, m28432d2 = {"LW32;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "y", "Lkotlin/Pair;", "", "", "w", "x", "v", "A", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "vehicleInfoClicksSubject", DateTokenConverter.CONVERTER_KEY, "passAllClicksSubject", "e", "categoryUpdatesSubject", "f", "issueUpdatesSubject", "g", "categoryExpandsSubject", "h", "warningDisplaysSubject", "<init>", "()V", C17296a.f69688o, "b", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: W32 */
/* loaded from: classes3.dex */
public final class W32 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Unit> f40332c;

    /* renamed from: d */
    public final C24558d<Unit> f40333d;

    /* renamed from: e */
    public final C24558d<Pair<String, Boolean>> f40334e;

    /* renamed from: f */
    public final C24558d<Pair<String, Boolean>> f40335f;

    /* renamed from: g */
    public final C24558d<Pair<String, Boolean>> f40336g;

    /* renamed from: h */
    public final C24558d<Pair<String, String>> f40337h;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LW32$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/InspectionV3CardView;", "b", "Lco/bird/android/widget/standardcomponents/InspectionV3CardView;", "inspectionCard", "Lm42;", "c", "Lm42;", "adapter", "", DateTokenConverter.CONVERTER_KEY, "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LW32;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectionV3Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,180:1\n18#2:181\n9#3,4:182\n*S KotlinDebug\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder\n*L\n149#1:181\n149#1:182,4\n*E\n"})
    /* renamed from: W32$a */
    /* loaded from: classes3.dex */
    public final class C8922a extends C29735w1 {

        /* renamed from: b */
        public final InspectionV3CardView f40338b;

        /* renamed from: c */
        public final C44872m42 f40339c;

        /* renamed from: d */
        public boolean f40340d;

        /* renamed from: e */
        public final /* synthetic */ W32 f40341e;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "passed", "", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nInspectionV3Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n18#2:181\n18#2:196\n9#3,4:182\n9#3,4:197\n1603#4,9:186\n1855#4:195\n1856#4:202\n1612#4:203\n766#4:204\n857#4,2:205\n1855#4,2:207\n1#5:201\n*S KotlinDebug\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder$1\n*L\n99#1:181\n105#1:196\n99#1:182,4\n105#1:197,4\n105#1:186,9\n105#1:195\n105#1:202\n105#1:203\n106#1:204\n106#1:205,2\n107#1:207,2\n105#1:201\n*E\n"})
        /* renamed from: W32$a$a */
        /* loaded from: classes3.dex */
        public static final class C8923a extends Lambda implements Function1<Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ W32 f40343h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8923a(W32 w32) {
                super(1);
                this.f40343h = w32;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                int adapterPosition = C8922a.this.getAdapterPosition();
                if (adapterPosition == -1 || C8922a.this.f40340d) {
                    return;
                }
                Object m105816c = this.f40343h.m94545o().m109397e(adapterPosition).m105816c();
                if (!(m105816c instanceof Q32)) {
                    m105816c = null;
                }
                Q32 q32 = (Q32) m105816c;
                if (q32 != null) {
                    W32 w32 = this.f40343h;
                    w32.f40334e.onNext(TuplesKt.m28425to(q32.m89002f(), bool));
                    Boolean bool2 = Boolean.FALSE;
                    if (Intrinsics.areEqual(bool, bool2) && !q32.m89003e()) {
                        w32.f40336g.onNext(TuplesKt.m28425to(q32.m89002f(), Boolean.TRUE));
                    } else if (!Intrinsics.areEqual(bool, bool2)) {
                        ArrayList arrayList = new ArrayList();
                        for (C2637G6 c2637g6 : q32.m88998j().m104408e()) {
                            Object m105816c2 = c2637g6.m105816c();
                            if (!(m105816c2 instanceof InspectionIssue)) {
                                m105816c2 = null;
                            }
                            InspectionIssue inspectionIssue = (InspectionIssue) m105816c2;
                            if (inspectionIssue != null) {
                                arrayList.add(inspectionIssue);
                            }
                        }
                        ArrayList<InspectionIssue> arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (((InspectionIssue) obj).getSelected()) {
                                arrayList2.add(obj);
                            }
                        }
                        for (InspectionIssue inspectionIssue2 : arrayList2) {
                            w32.f40335f.onNext(TuplesKt.m28425to(inspectionIssue2.getId(), Boolean.TRUE));
                            String warningMessage = inspectionIssue2.getWarningMessage();
                            if (warningMessage != null) {
                                w32.f40337h.onNext(TuplesKt.m28425to(inspectionIssue2.getId(), warningMessage));
                            }
                        }
                        w32.f40336g.onNext(TuplesKt.m28425to(q32.m89002f(), Boolean.FALSE));
                    }
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nInspectionV3Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,180:1\n18#2:181\n9#3,4:182\n*S KotlinDebug\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder$2\n*L\n126#1:181\n126#1:182,4\n*E\n"})
        /* renamed from: W32$a$b */
        /* loaded from: classes3.dex */
        public static final class C8924b extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ W32 f40345h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8924b(W32 w32) {
                super(1);
                this.f40345h = w32;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                int adapterPosition = C8922a.this.getAdapterPosition();
                if (adapterPosition == -1 || C8922a.this.f40340d) {
                    return;
                }
                Object m105816c = this.f40345h.m94545o().m109397e(adapterPosition).m105816c();
                if (!(m105816c instanceof Q32)) {
                    m105816c = null;
                }
                Q32 q32 = (Q32) m105816c;
                if (q32 != null) {
                    this.f40345h.f40336g.onNext(TuplesKt.m28425to(q32.m89002f(), Boolean.valueOf(!C8922a.this.f40338b.m53953G())));
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: W32$a$c */
        /* loaded from: classes3.dex */
        public static final class C8925c extends Lambda implements Function1<Pair<? extends String, ? extends Boolean>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ W32 f40346g;

            /* renamed from: h */
            public final /* synthetic */ C8922a f40347h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8925c(W32 w32, C8922a c8922a) {
                super(1);
                this.f40346g = w32;
                this.f40347h = c8922a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends Boolean> pair) {
                invoke2((Pair<String, Boolean>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<String, Boolean> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                boolean booleanValue = pair.component2().booleanValue();
                this.f40346g.f40335f.onNext(TuplesKt.m28425to(pair.component1(), Boolean.valueOf(booleanValue)));
                if (booleanValue) {
                    return;
                }
                Boolean m53979v = this.f40347h.f40338b.m53979v();
                Boolean bool = Boolean.FALSE;
                if (Intrinsics.areEqual(m53979v, bool) || this.f40347h.f40340d) {
                    return;
                }
                this.f40347h.f40338b.setAccepted(bool);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: W32$a$d */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C8926d extends FunctionReferenceImpl implements Function1<Pair<? extends String, ? extends String>, Unit> {
            public C8926d(Object obj) {
                super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends String> pair) {
                invoke2((Pair<String, String>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<String, String> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24558d) this.receiver).onNext(p0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8922a(W32 w32, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f40341e = w32;
            InspectionV3CardView inspectionV3CardView = (InspectionV3CardView) view;
            this.f40338b = inspectionV3CardView;
            C44872m42 c44872m42 = new C44872m42();
            this.f40339c = c44872m42;
            inspectionV3CardView.m53981C(new C8923a(w32));
            inspectionV3CardView.m53955E(new C8924b(w32));
            inspectionV3CardView.setAdapter(c44872m42);
            c44872m42.m26393v(new C8925c(w32, this));
            c44872m42.m26392w(new C8926d(w32.f40337h));
            ImageView m53961s = inspectionV3CardView.m53961s();
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            CY1.m112150a(m53961s, C49347td3.m12002a(4, context));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String str;
            Integer num;
            AbstractC33662It6<ImageView, Drawable> abstractC33662It6;
            List<C3023H6> listOf;
            WireThemedColors bannerColor;
            Object m105816c = this.f40341e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Q32)) {
                m105816c = null;
            }
            Q32 q32 = (Q32) m105816c;
            if (q32 != null) {
                boolean z = true;
                this.f40340d = true;
                this.f40338b.setTitle(q32.m89004d());
                this.f40338b.setDescription(q32.m89005c());
                this.f40338b.setAccepted(q32.m88999i());
                this.f40338b.setExpanded(q32.m89003e());
                this.f40338b.setMutable(q32.m89001g());
                InspectionV3CardView inspectionV3CardView = this.f40338b;
                if (q32.m89000h() == null) {
                    z = false;
                }
                inspectionV3CardView.setCampaignVisible(z);
                InspectionV3CardView inspectionV3CardView2 = this.f40338b;
                InspectionNotice m89000h = q32.m89000h();
                if (m89000h != null) {
                    str = m89000h.getDisplay();
                } else {
                    str = null;
                }
                inspectionV3CardView2.setCampaignTitle(str);
                InspectionV3CardView inspectionV3CardView3 = this.f40338b;
                InspectionNotice m89000h2 = q32.m89000h();
                if (m89000h2 != null && (bannerColor = m89000h2.getBannerColor()) != null) {
                    num = Integer.valueOf(bannerColor.getLightMode());
                } else {
                    num = null;
                }
                inspectionV3CardView3.setCampaignColor(num);
                String m89006b = q32.m89006b();
                if (m89006b != null) {
                    abstractC33662It6 = ComponentCallbacks2C17096a.m53138t(this.itemView.getContext()).m81653k(m89006b).m16096R0(this.f40338b.m53961s());
                } else {
                    abstractC33662It6 = null;
                }
                if (abstractC33662It6 == null) {
                    this.f40338b.m53961s().setImageDrawable(null);
                }
                if (q32.m89003e()) {
                    InspectionV3CardView inspectionV3CardView4 = this.f40338b;
                    listOf = CollectionsKt__CollectionsJVMKt.listOf(q32.m88998j());
                    inspectionV3CardView4.m53982B(listOf);
                } else {
                    this.f40338b.m53980u();
                }
                this.f40340d = false;
            }
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u001c\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u001c\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"LW32$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/widget/BatteryView;", "c", "Lco/bird/android/widget/BatteryView;", "battery", DateTokenConverter.CONVERTER_KEY, "batteryLevel", "e", "status", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "statusIcon", "Landroid/view/View;", "view", "<init>", "(LW32;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectionV3Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$VehicleInfoViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,180:1\n18#2:181\n9#3,4:182\n*S KotlinDebug\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$VehicleInfoViewHolder\n*L\n80#1:181\n80#1:182,4\n*E\n"})
    /* renamed from: W32$b */
    /* loaded from: classes3.dex */
    public final class C8927b extends C29735w1 {

        /* renamed from: b */
        public final TextView f40348b;

        /* renamed from: c */
        public final BatteryView f40349c;

        /* renamed from: d */
        public final TextView f40350d;

        /* renamed from: e */
        public final TextView f40351e;

        /* renamed from: f */
        public final ImageView f40352f;

        /* renamed from: g */
        public final /* synthetic */ W32 f40353g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: W32$b$a */
        /* loaded from: classes3.dex */
        public static final class C8928a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ W32 f40354g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8928a(W32 w32) {
                super(1);
                this.f40354g = w32;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f40354g.f40332c.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8927b(W32 w32, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f40353g = w32;
            this.f40348b = (TextView) view.findViewById(C52955zi4.code);
            this.f40349c = (BatteryView) view.findViewById(C52955zi4.battery);
            this.f40350d = (TextView) view.findViewById(C52955zi4.batteryLevel);
            this.f40351e = (TextView) view.findViewById(C52955zi4.status);
            this.f40352f = (ImageView) view.findViewById(C52955zi4.statusIcon);
            C34585Ms2.m94661j(view, new C8928a(w32));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String str;
            MapMarkerKind kind;
            Object m105816c = this.f40353g.m94545o().m109397e(i).m105816c();
            Drawable drawable = null;
            if (!(m105816c instanceof InspectionFlow)) {
                m105816c = null;
            }
            InspectionFlow inspectionFlow = (InspectionFlow) m105816c;
            if (inspectionFlow != null) {
                this.f40348b.setText(inspectionFlow.getCode());
                this.f40349c.setPercent(inspectionFlow.getBatteryLevel());
                this.f40350d.setText(this.itemView.getContext().getString(C45871nl4.battery_percent, Integer.valueOf(inspectionFlow.getBatteryLevel())));
                TextView textView = this.f40351e;
                WireMapMarker marker = inspectionFlow.getMarker();
                if (marker != null) {
                    str = marker.getLabel();
                } else {
                    str = null;
                }
                textView.setText(str);
                ImageView imageView = this.f40352f;
                WireMapMarker marker2 = inspectionFlow.getMarker();
                if (marker2 != null && (kind = WireMapMarkerKt.getKind(marker2)) != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    drawable = C52136yK2.m3671b(kind, context);
                }
                imageView.setImageDrawable(drawable);
            }
        }
    }

    public W32() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f40332c = m31902e;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f40333d = m31902e2;
        C24558d<Pair<String, Boolean>> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Pair<String, Boolean?>>()");
        this.f40334e = m31902e3;
        C24558d<Pair<String, Boolean>> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<Pair<String, Boolean>>()");
        this.f40335f = m31902e4;
        C24558d<Pair<String, Boolean>> m31902e5 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e5, "create<Pair<String, Boolean>>()");
        this.f40336g = m31902e5;
        C24558d<Pair<String, String>> m31902e6 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e6, "create<Pair<String, String>>()");
        this.f40337h = m31902e6;
    }

    /* renamed from: A */
    public final Observable<Pair<String, String>> m78886A() {
        Observable<Pair<String, String>> hide = this.f40337h.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "warningDisplaysSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C45465n42());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new X32();
    }

    /* renamed from: v */
    public final Observable<Pair<String, Boolean>> m78885v() {
        Observable<Pair<String, Boolean>> hide = this.f40336g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "categoryExpandsSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Pair<String, Boolean>> m78884w() {
        Observable<Pair<String, Boolean>> hide = this.f40334e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "categoryUpdatesSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<Pair<String, Boolean>> m78883x() {
        Observable<Pair<String, Boolean>> hide = this.f40335f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "issueUpdatesSubject.hide()");
        return hide;
    }

    /* renamed from: y */
    public final Observable<Unit> m78882y() {
        Observable<Unit> hide = this.f40332c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "vehicleInfoClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C45268mk4.item_vehicle_servicing_vehicle_info ? new C8927b(this, m41761u) : i == C37080Xj4.item_inspection_category ? new C8922a(this, m41761u) : new C29735w1(m41761u);
    }
}
