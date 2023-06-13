package co.bird.android.feature.servicecenter.idtools.landing;

import android.app.Application;
import android.os.Bundle;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.persistence.BrainSwapRecord;
import co.bird.android.widget.BottomSheetOptionLayout;
import co.bird.android.widget.C16597a;
import co.bird.android.widget.C16664e;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.S74;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b=\u0010>J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u000b0\u000b048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010:\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u000b0\u000b048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\"\u0010<\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u000e0\u000e048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107¨\u0006?"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LlS1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LmS1;", TransferTable.COLUMN_STATE, "Y", "Lio/reactivex/Observable;", "Lco/bird/android/model/IdToolOption;", "d2", "D2", "Lco/bird/android/model/persistence/BrainSwapRecord;", "d6", "s2", "LfS1;", "j", "LfS1;", "U", "()LfS1;", "setPresenter", "(LfS1;)V", "presenter", "LRR1;", "k", "LRR1;", "R", "()LRR1;", "setConverter", "(LRR1;)V", "converter", "LsQ1;", "l", "LsQ1;", "component", "LPR1;", "m", "LPR1;", "adapter", "LmX5;", "n", "Lkotlin/Lazy;", "X", "()LmX5;", "swipeHelper", "Landroidx/recyclerview/widget/l;", "o", "S", "()Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Lma4;", "kotlin.jvm.PlatformType", "p", "Lma4;", "associateOptionClick", "q", "dissociateOptionClick", "r", "brainSwapRecordClick", "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolsLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingActivity.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
/* loaded from: classes3.dex */
public final class IdToolsLandingActivity extends BaseActivityLite implements InterfaceC44500lS1 {

    /* renamed from: j */
    public C40942fS1 f65367j;

    /* renamed from: k */
    public RR1 f65368k;

    /* renamed from: l */
    public InterfaceC48632sQ1 f65369l;

    /* renamed from: m */
    public final PR1 f65370m = new PR1();

    /* renamed from: n */
    public final Lazy f65371n;

    /* renamed from: o */
    public final Lazy f65372o;

    /* renamed from: p */
    public final C45168ma4<IdToolOption> f65373p;

    /* renamed from: q */
    public final C45168ma4<IdToolOption> f65374q;

    /* renamed from: r */
    public final C45168ma4<BrainSwapRecord> f65375r;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "idx", "LmS1;", TransferTable.COLUMN_STATE, "Lco/bird/android/model/persistence/BrainSwapRecord;", C17296a.f69688o, "(Ljava/lang/Integer;LmS1;)Lco/bird/android/model/persistence/BrainSwapRecord;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15614a extends Lambda implements Function2<Integer, C45093mS1, BrainSwapRecord> {

        /* renamed from: g */
        public static final C15614a f65376g = new C15614a();

        public C15614a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final BrainSwapRecord invoke(Integer idx, C45093mS1 state) {
            Intrinsics.checkNotNullParameter(idx, "idx");
            Intrinsics.checkNotNullParameter(state, "state");
            return state.m25608f().get(((idx.intValue() - 1) - (!state.m25612b().isEmpty() ? 1 : 0)) - (!state.m25611c().isEmpty() ? 1 : 0));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/recyclerview/widget/l;", "b", "()Landroidx/recyclerview/widget/l;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15615b extends Lambda implements Function0<C11925l> {
        public C15615b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C11925l invoke() {
            return new C11925l(IdToolsLandingActivity.this.m56846X());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "options", "", "Lco/bird/android/model/IdToolOption;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nIdToolsLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingActivity.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$1\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,118:1\n1549#2:119\n1620#2,3:120\n819#2:132\n847#2:133\n848#2:135\n38#3,9:123\n47#3,4:136\n40#4:134\n218#5:140\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingActivity.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$onCreate$1\n*L\n64#1:119\n64#1:120,3\n63#1:132\n63#1:133\n63#1:135\n63#1:123,9\n63#1:136,4\n63#1:134\n69#1:140\n*E\n"})
    /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15616c extends Lambda implements Function1<List<? extends IdToolOption>, Unit> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LiQ1;", "sheetOption", "Lco/bird/android/model/IdToolOption;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LiQ1;)Lco/bird/android/model/IdToolOption;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$c$a */
        /* loaded from: classes3.dex */
        public static final class C15617a extends Lambda implements Function1<EnumC42703iQ1, IdToolOption> {

            /* renamed from: g */
            public static final C15617a f65379g = new C15617a();

            public C15617a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final IdToolOption invoke(EnumC42703iQ1 sheetOption) {
                Intrinsics.checkNotNullParameter(sheetOption, "sheetOption");
                return sheetOption.m34002j();
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$c$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C15618b extends FunctionReferenceImpl implements Function1<IdToolOption, Unit> {
            public C15618b(Object obj) {
                super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m56837a(IdToolOption p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C45168ma4) this.receiver).accept(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IdToolOption idToolOption) {
                m56837a(idToolOption);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00018\u00008\u0000\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"", "Lco/bird/android/widget/d;", "K", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Enum;", "co/bird/android/widget/a$l"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$2$1\n*L\n1#1,108:1\n*E\n"})
        /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$c$c */
        /* loaded from: classes3.dex */
        public static final class C15619c extends Lambda implements Function1<Integer, EnumC42703iQ1> {

            /* renamed from: g */
            public final /* synthetic */ List f65380g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15619c(List list) {
                super(1);
                this.f65380g = list;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Enum, iQ1] */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final EnumC42703iQ1 invoke(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (Enum) this.f65380g.get(it.intValue());
            }
        }

        public C15616c() {
            super(1);
        }

        /* renamed from: c */
        public static final IdToolOption m56840c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (IdToolOption) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final void m56839d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends IdToolOption> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends IdToolOption> options) {
            int collectionSizeOrDefault;
            List list;
            Intrinsics.checkNotNullParameter(options, "options");
            IdToolsLandingActivity idToolsLandingActivity = IdToolsLandingActivity.this;
            List<? extends IdToolOption> list2 = options;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (IdToolOption idToolOption : list2) {
                arrayList.add(C43296jQ1.m30642a(idToolOption));
            }
            list = CollectionsKt___CollectionsKt.toList(arrayList);
            BottomSheetOptionLayout.EnumC16469a enumC16469a = BottomSheetOptionLayout.EnumC16469a.SMALL_TITLE;
            String string = IdToolsLandingActivity.this.getString(C45871nl4.id_tools_replace_type_title);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                Enum r5 = (Enum) obj;
                arrayList2.add(obj);
            }
            C16664e c16664e = new C16664e();
            c16664e.setArguments(C16597a.m54345a(enumC16469a, string, null, 8388611, arrayList2));
            c16664e.show(idToolsLandingActivity.getSupportFragmentManager(), "BottomSheetOptionFragment");
            AbstractC24507p<R> m32067H = c16664e.m54040D9().m32067H(new C16597a.C16601d(new C15619c(arrayList2)));
            Intrinsics.checkNotNullExpressionValue(m32067H, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
            final C15617a c15617a = C15617a.f65379g;
            AbstractC24507p m32067H2 = m32067H.m32067H(new InterfaceC23492o() { // from class: KR1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    IdToolOption m56840c;
                    m56840c = IdToolsLandingActivity.C15616c.m56840c(Function1.this, obj2);
                    return m56840c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32067H2, "show(\n        which = op…n -> sheetOption.option }");
            Object m32048b = m32067H2.m32048b(AutoDispose.m45239a(IdToolsLandingActivity.this));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C15618b c15618b = new C15618b(IdToolsLandingActivity.this.f65373p);
            ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: LR1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj2) {
                    IdToolsLandingActivity.C15616c.m56839d(Function1.this, obj2);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "options", "", "Lco/bird/android/model/IdToolOption;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nIdToolsLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingActivity.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$onCreate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$1\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,118:1\n1549#2:119\n1620#2,3:120\n819#2:132\n847#2:133\n848#2:135\n38#3,9:123\n47#3,4:136\n40#4:134\n218#5:140\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingActivity.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$onCreate$2\n*L\n75#1:119\n75#1:120,3\n74#1:132\n74#1:133\n74#1:135\n74#1:123,9\n74#1:136,4\n74#1:134\n80#1:140\n*E\n"})
    /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$d */
    /* loaded from: classes3.dex */
    public static final class C15620d extends Lambda implements Function1<List<? extends IdToolOption>, Unit> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LiQ1;", "sheetOption", "Lco/bird/android/model/IdToolOption;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LiQ1;)Lco/bird/android/model/IdToolOption;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$d$a */
        /* loaded from: classes3.dex */
        public static final class C15621a extends Lambda implements Function1<EnumC42703iQ1, IdToolOption> {

            /* renamed from: g */
            public static final C15621a f65382g = new C15621a();

            public C15621a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final IdToolOption invoke(EnumC42703iQ1 sheetOption) {
                Intrinsics.checkNotNullParameter(sheetOption, "sheetOption");
                return sheetOption.m34002j();
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$d$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C15622b extends FunctionReferenceImpl implements Function1<IdToolOption, Unit> {
            public C15622b(Object obj) {
                super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m56830a(IdToolOption p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C45168ma4) this.receiver).accept(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IdToolOption idToolOption) {
                m56830a(idToolOption);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00018\u00008\u0000\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"", "Lco/bird/android/widget/d;", "K", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Enum;", "co/bird/android/widget/a$l"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$2$1\n*L\n1#1,108:1\n*E\n"})
        /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$d$c */
        /* loaded from: classes3.dex */
        public static final class C15623c extends Lambda implements Function1<Integer, EnumC42703iQ1> {

            /* renamed from: g */
            public final /* synthetic */ List f65383g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15623c(List list) {
                super(1);
                this.f65383g = list;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Enum, iQ1] */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final EnumC42703iQ1 invoke(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (Enum) this.f65383g.get(it.intValue());
            }
        }

        public C15620d() {
            super(1);
        }

        /* renamed from: c */
        public static final IdToolOption m56833c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (IdToolOption) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final void m56832d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends IdToolOption> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends IdToolOption> options) {
            int collectionSizeOrDefault;
            List list;
            Intrinsics.checkNotNullParameter(options, "options");
            IdToolsLandingActivity idToolsLandingActivity = IdToolsLandingActivity.this;
            List<? extends IdToolOption> list2 = options;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (IdToolOption idToolOption : list2) {
                arrayList.add(C43296jQ1.m30642a(idToolOption));
            }
            list = CollectionsKt___CollectionsKt.toList(arrayList);
            BottomSheetOptionLayout.EnumC16469a enumC16469a = BottomSheetOptionLayout.EnumC16469a.SMALL_TITLE;
            String string = IdToolsLandingActivity.this.getString(C45871nl4.id_tools_dissociate_type_title);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                Enum r5 = (Enum) obj;
                arrayList2.add(obj);
            }
            C16664e c16664e = new C16664e();
            c16664e.setArguments(C16597a.m54345a(enumC16469a, string, null, 8388611, arrayList2));
            c16664e.show(idToolsLandingActivity.getSupportFragmentManager(), "BottomSheetOptionFragment");
            AbstractC24507p<R> m32067H = c16664e.m54040D9().m32067H(new C16597a.C16602e(new C15623c(arrayList2)));
            Intrinsics.checkNotNullExpressionValue(m32067H, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
            final C15621a c15621a = C15621a.f65382g;
            AbstractC24507p m32067H2 = m32067H.m32067H(new InterfaceC23492o() { // from class: MR1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    IdToolOption m56833c;
                    m56833c = IdToolsLandingActivity.C15620d.m56833c(Function1.this, obj2);
                    return m56833c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32067H2, "show(\n        which = op…n -> sheetOption.option }");
            Object m32048b = m32067H2.m32048b(AutoDispose.m45239a(IdToolsLandingActivity.this));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C15622b c15622b = new C15622b(IdToolsLandingActivity.this.f65374q);
            ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: NR1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj2) {
                    IdToolsLandingActivity.C15620d.m56832d(Function1.this, obj2);
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15624e extends FunctionReferenceImpl implements Function1<BrainSwapRecord, Unit> {
        public C15624e(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m56828a(BrainSwapRecord p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrainSwapRecord brainSwapRecord) {
            m56828a(brainSwapRecord);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LmX5;", "b", "()LmX5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$f */
    /* loaded from: classes3.dex */
    public static final class C15625f extends Lambda implements Function0<C45142mX5> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/recyclerview/widget/RecyclerView$D;", "viewHolder", "", C17296a.f69688o, "(Landroidx/recyclerview/widget/RecyclerView$D;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity$f$a */
        /* loaded from: classes3.dex */
        public static final class C15626a extends Lambda implements Function1<RecyclerView.AbstractC11834D, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ IdToolsLandingActivity f65385g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15626a(IdToolsLandingActivity idToolsLandingActivity) {
                super(1);
                this.f65385g = idToolsLandingActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(RecyclerView.AbstractC11834D viewHolder) {
                boolean z;
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                if (this.f65385g.f65370m.getItemViewType(viewHolder.getBindingAdapterPosition()) == C34740Nj4.item_id_tools_pending_swap) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C15625f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C45142mX5 invoke() {
            IdToolsLandingActivity idToolsLandingActivity = IdToolsLandingActivity.this;
            return new C45142mX5(idToolsLandingActivity, 0, new C15626a(idToolsLandingActivity), null, 10, null);
        }
    }

    public IdToolsLandingActivity() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new C15625f());
        this.f65371n = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C15615b());
        this.f65372o = lazy2;
        C45168ma4<IdToolOption> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<IdToolOption>()");
        this.f65373p = m25409g;
        C45168ma4<IdToolOption> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<IdToolOption>()");
        this.f65374q = m25409g2;
        C45168ma4<BrainSwapRecord> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<BrainSwapRecord>()");
        this.f65375r = m25409g3;
    }

    /* renamed from: Q */
    public static final BrainSwapRecord m56850Q(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BrainSwapRecord) tmp0.invoke(obj, obj2);
    }

    @Override // p000.InterfaceC44500lS1
    /* renamed from: D2 */
    public Observable<IdToolOption> mo27279D2() {
        Observable<IdToolOption> hide = this.f65374q.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "dissociateOptionClick.hide()");
        return hide;
    }

    /* renamed from: R */
    public final RR1 m56849R() {
        RR1 rr1 = this.f65368k;
        if (rr1 != null) {
            return rr1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    /* renamed from: S */
    public final C11925l m56848S() {
        return (C11925l) this.f65372o.getValue();
    }

    /* renamed from: U */
    public final C40942fS1 m56847U() {
        C40942fS1 c40942fS1 = this.f65367j;
        if (c40942fS1 != null) {
            return c40942fS1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: X */
    public final C45142mX5 m56846X() {
        return (C45142mX5) this.f65371n.getValue();
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: Y */
    public void render(C45093mS1 state) {
        boolean z;
        Intrinsics.checkNotNullParameter(state, "state");
        this.f65370m.mo24871u(m56849R().m86752a(state.m25612b(), state.m25611c(), state.m25608f()));
        C48955sx4 m58990F = m58990F();
        if (state.m25609e() > 0) {
            z = true;
        } else {
            z = false;
        }
        S74.C7343a.showProgress$default(m58990F, z, 0, 2, null);
        Throwable m25610d = state.m25610d();
        if (m25610d != null) {
            C38689bg5.m64178c(m58990F(), m25610d);
        }
    }

    @Override // p000.InterfaceC44500lS1
    /* renamed from: d2 */
    public Observable<IdToolOption> mo27278d2() {
        Observable<IdToolOption> hide = this.f65373p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "associateOptionClick.hide()");
        return hide;
    }

    @Override // p000.InterfaceC44500lS1
    /* renamed from: d6 */
    public Observable<BrainSwapRecord> mo27277d6() {
        Observable<BrainSwapRecord> throttleFirst = this.f65375r.hide().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "brainSwapRecordClick.hid…0, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6655Q3 m89024c = C6655Q3.m89024c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m89024c, "inflate(layoutInflater)");
        setContentView(m89024c.getRoot());
        C52189yQ1 c52189yQ1 = C52189yQ1.f119504b;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC48632sQ1 interfaceC48632sQ1 = null;
        InterfaceC48632sQ1 interfaceC48632sQ12 = (InterfaceC48632sQ1) AbstractC31704Ak1.component$default(c52189yQ1, application, null, 2, null);
        this.f65369l = interfaceC48632sQ12;
        if (interfaceC48632sQ12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
        } else {
            interfaceC48632sQ1 = interfaceC48632sQ12;
        }
        interfaceC48632sQ1.mo14225c(this);
        m89024c.f29746c.setAdapter(this.f65370m);
        m89024c.f29746c.setLayoutManager(new LinearLayoutManager(this));
        m89024c.f29746c.setItemAnimator(new C11894g());
        this.f65370m.m90295y(new C15616c());
        this.f65370m.m90299B(new C15620d());
        this.f65370m.m90300A(new C15624e(this.f65375r));
        m56848S().m66204g(m89024c.f29746c);
        m56847U().consume(this);
    }

    @Override // p000.InterfaceC44500lS1
    /* renamed from: s2 */
    public Observable<BrainSwapRecord> mo27276s2() {
        Observable<Integer> m25451b = m56846X().m25451b();
        Observable<C45093mS1> m42276l = m56847U().m42276l();
        final C15614a c15614a = C15614a.f65376g;
        Observable withLatestFrom = m25451b.withLatestFrom(m42276l, new InterfaceC23480c() { // from class: JR1
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                BrainSwapRecord m56850Q;
                m56850Q = IdToolsLandingActivity.m56850Q(Function2.this, obj, obj2);
                return m56850Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(withLatestFrom, "swipeHelper.itemSwiped()…are options\n      ]\n    }");
        return withLatestFrom;
    }
}
