package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.IssueType;
import co.bird.android.model.IssueTypeLock;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.RepairScope;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.wire.WireBird;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p000.C37132Xp2;
import p000.InterfaceC37857aG6;
@Metadata(m28433d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002BY\b\u0007\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\bQ\u0010RJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J*\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R.\u00106\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000202 3*\n\u0012\u0004\u0012\u000202\u0018\u00010101008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u00109\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010707008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105RF\u0010=\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020,\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u000f 3*\u0016\u0012\u0004\u0012\u00020,\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u000f\u0018\u00010:0:008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00105R.\u0010?\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 3*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00105R.\u0010A\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 3*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00105R\"\u0010C\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010,0,008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00105R \u0010H\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006S"}, m28432d2 = {"LXp2;", "LFE;", "LAp2;", "", "error", "", "b0", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "", "returnAddedIssues", "recordInspectionEvent", "b", "", "Lco/bird/android/model/IssueTypeLock;", "issues", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "LaM;", "g", "LaM;", "birdManager", "LGI3;", "h", "LGI3;", "partnerManager", "LaG6;", "i", "LaG6;", "workOrderManager", "Lbq2;", "j", "Lbq2;", "ui", "LfE6;", "k", "LfE6;", "converter", "Lp83;", "l", "Lp83;", "noRepairGenerator", "", "m", "Ljava/lang/String;", "originalNotes", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "kotlin.jvm.PlatformType", "n", "Lio/reactivex/subjects/a;", "partnerSubject", "Lco/bird/android/model/BirdSummaryBody;", "o", "birdSummarySubject", "", "Lco/bird/android/model/IssueType;", "p", "categoryIssueSubject", "q", "issuesSubject", "r", "unselectedIssuesSubject", "s", "notesSubject", "", "Lco/bird/android/model/Issue;", "t", "Ljava/util/Map;", "existingIssues", "Llh6;", "userManager", "LEa;", "analyticsManager", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Llh6;LEa;Le13;Lcom/uber/autodispose/ScopeProvider;LaM;LGI3;LaG6;Lbq2;LfE6;Lp83;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/ObservablesKt\n+ 4 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,337:1\n180#2:338\n180#2:339\n199#2:340\n180#2:341\n180#2:342\n180#2:344\n180#2:347\n128#3:343\n82#4,2:345\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl\n*L\n75#1:338\n80#1:339\n159#1:340\n169#1:341\n179#1:342\n257#1:344\n315#1:347\n189#1:343\n269#1:345,2\n*E\n"})
/* renamed from: Xp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37132Xp2 extends AbstractC2207FE implements InterfaceC31750Ap2 {

    /* renamed from: g */
    public final InterfaceC10636aM f43980g;

    /* renamed from: h */
    public final GI3 f43981h;

    /* renamed from: i */
    public final InterfaceC37857aG6 f43982i;

    /* renamed from: j */
    public final InterfaceC38786bq2 f43983j;

    /* renamed from: k */
    public final InterfaceC40821fE6 f43984k;

    /* renamed from: l */
    public final InterfaceC46692p83 f43985l;

    /* renamed from: m */
    public String f43986m;

    /* renamed from: n */
    public final C24552a<Optional<MobilePartner>> f43987n;

    /* renamed from: o */
    public final C24552a<BirdSummaryBody> f43988o;

    /* renamed from: p */
    public final C24552a<Map<String, List<IssueType>>> f43989p;

    /* renamed from: q */
    public final C24552a<List<IssueTypeLock>> f43990q;

    /* renamed from: r */
    public final C24552a<List<IssueTypeLock>> f43991r;

    /* renamed from: s */
    public final C24552a<String> f43992s;

    /* renamed from: t */
    public final Map<String, Issue> f43993t;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp2$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9497a extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C9497a(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "category", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp2$b */
    /* loaded from: classes3.dex */
    public static final class C9498b extends Lambda implements Function1<String, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC40099e13 f43995h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9498b(InterfaceC40099e13 interfaceC40099e13) {
            super(1);
            this.f43995h = interfaceC40099e13;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String category) {
            List<IssueType> list;
            List<IssueTypeLock> list2;
            Map map = (Map) C37132Xp2.this.f43989p.getValue();
            if (map == null || (list = (List) map.get(category)) == null || (list2 = (List) C37132Xp2.this.f43990q.getValue()) == null) {
                return;
            }
            InterfaceC40099e13 interfaceC40099e13 = this.f43995h;
            Intrinsics.checkNotNullExpressionValue(category, "category");
            interfaceC40099e13.mo37156I(category, list, list2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Xp2$c */
    /* loaded from: classes3.dex */
    public static final class C9499c<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C9499c<T1, T2, T3, T4, T5, R> f43996a = new C9499c<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T", "T1", "T2", "T3", "t", "t1", "t2", "t3", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/ObservablesKt$withLatestFrom$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Xp2$d */
    /* loaded from: classes3.dex */
    public static final class C9500d<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C9500d<T1, T2, T3, T4, R> f43997a = new C9500d<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<Unit, T1, T2, T3> apply(Unit unit, T1 t1, T2 t2, T3 t3) {
            return new C51106wb4<>(unit, t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "issueTypes", "", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp2$e */
    /* loaded from: classes3.dex */
    public static final class C9501e extends Lambda implements Function1<List<? extends IssueType>, Unit> {
        public C9501e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends IssueType> list) {
            invoke2((List<IssueType>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<IssueType> list) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("issues", new ArrayList<>(list));
            C37132Xp2.this.m107430f().mo37029e4(-1, intent);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u0010\t\u001aV\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004**\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u00072N\u0010\u0006\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lwb4;", "", "", "Lco/bird/android/model/IssueTypeLock;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lkotlin/Triple;", "", C17296a.f69688o, "(Lwb4;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$11\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n766#2:338\n857#2,2:339\n1549#2:341\n1620#2,3:342\n1549#2:345\n1620#2,3:346\n1549#2:349\n1620#2,3:350\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$11\n*L\n191#1:338\n191#1:339,2\n194#1:341\n194#1:342,3\n197#1:345\n197#1:346,3\n197#1:349\n197#1:350,3\n*E\n"})
    /* renamed from: Xp2$f */
    /* loaded from: classes3.dex */
    public static final class C9502f extends Lambda implements Function1<C51106wb4<? extends Unit, ? extends List<? extends IssueTypeLock>, ? extends List<? extends IssueTypeLock>, ? extends String>, Triple<? extends List<? extends String>, ? extends Set<? extends String>, ? extends String>> {
        public C9502f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Triple<List<String>, Set<String>, String> invoke(C51106wb4<Unit, ? extends List<IssueTypeLock>, ? extends List<IssueTypeLock>, String> c51106wb4) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            Set subtract;
            boolean z;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            List<IssueTypeLock> selectedIssues = c51106wb4.m6613b();
            List<IssueTypeLock> unselectedIssues = c51106wb4.m6612c();
            String m6611d = c51106wb4.m6611d();
            Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
            List<IssueTypeLock> list = selectedIssues;
            C37132Xp2 c37132Xp2 = C37132Xp2.this;
            ArrayList<IssueTypeLock> arrayList = new ArrayList();
            for (Object obj : list) {
                IssueTypeLock issueTypeLock = (IssueTypeLock) obj;
                IssueType component1 = issueTypeLock.component1();
                boolean component2 = issueTypeLock.component2();
                if (!component1.isNoIssue() && !component2 && c37132Xp2.f43993t.get(component1.getId()) == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (IssueTypeLock issueTypeLock2 : arrayList) {
                arrayList2.add(issueTypeLock2.component1().getId());
            }
            Intrinsics.checkNotNullExpressionValue(unselectedIssues, "unselectedIssues");
            List<IssueTypeLock> list2 = unselectedIssues;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
            for (IssueTypeLock issueTypeLock3 : list2) {
                arrayList3.add(issueTypeLock3.getIssueType().getId());
            }
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault3);
            for (IssueTypeLock issueTypeLock4 : list) {
                arrayList4.add(issueTypeLock4.getIssueType().getId());
            }
            subtract = CollectionsKt___CollectionsKt.subtract(arrayList3, arrayList4);
            return new Triple<>(arrayList2, subtract, m6611d);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\n\u001a¢\u0001\u0012J\b\u0001\u0012F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0004\u0012\u00020\t \u0004*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u00000\u0000 \u0004*P\u0012J\b\u0001\u0012F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0004\u0012\u00020\t \u0004*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u00000\u0000\u0018\u00010\u00060\u00062,\u0010\u0005\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xp2$g */
    /* loaded from: classes3.dex */
    public static final class C9503g extends Lambda implements Function1<Triple<? extends List<? extends String>, ? extends Set<? extends String>, ? extends String>, InterfaceC23447K<? extends Triple<? extends Optional<WorkOrder>, ? extends Set<? extends String>, ? extends Integer>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f44001h;

        /* renamed from: i */
        public final /* synthetic */ WorkOrder f44002i;

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0010\b\u001aF\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Xp2$g$a */
        /* loaded from: classes3.dex */
        public static final class C9504a extends Lambda implements Function1<WorkOrder, Triple<? extends Optional<WorkOrder>, ? extends Set<? extends String>, ? extends Integer>> {

            /* renamed from: g */
            public final /* synthetic */ Set<String> f44003g;

            /* renamed from: h */
            public final /* synthetic */ List<String> f44004h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9504a(Set<String> set, List<String> list) {
                super(1);
                this.f44003g = set;
                this.f44004h = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<Optional<WorkOrder>, Set<String>, Integer> invoke(WorkOrder workOrder) {
                Intrinsics.checkNotNullParameter(workOrder, "workOrder");
                return new Triple<>(Optional.f63040c.m59032c(workOrder), this.f44003g, Integer.valueOf(this.f44004h.size()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9503g(WireBird wireBird, WorkOrder workOrder) {
            super(1);
            this.f44001h = wireBird;
            this.f44002i = workOrder;
        }

        /* renamed from: c */
        public static final Triple m76258c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<Optional<WorkOrder>, Set<String>, Integer>> invoke(Triple<? extends List<String>, ? extends Set<String>, String> triple) {
            String str;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<String> component1 = triple.component1();
            Set<String> component2 = triple.component2();
            String notes = triple.component3();
            if (!(!component1.isEmpty())) {
                Intrinsics.checkNotNullExpressionValue(notes, "notes");
                isBlank = StringsKt__StringsJVMKt.isBlank(notes);
                if (!(!isBlank)) {
                    return AbstractC23442F.m33158H(new Triple(Optional.f63040c.m59033b(this.f44002i), component2, Integer.valueOf(component1.size())));
                }
            }
            InterfaceC37857aG6 interfaceC37857aG6 = C37132Xp2.this.f43982i;
            String id = this.f44001h.getId();
            WorkOrder workOrder = this.f44002i;
            if (workOrder != null) {
                str = workOrder.getId();
            } else {
                str = null;
            }
            AbstractC23442F<WorkOrder> mo19632u = interfaceC37857aG6.mo19632u(id, str, component1, notes);
            final C9504a c9504a = new C9504a(component2, component1);
            return mo19632u.m33157I(new InterfaceC23492o() { // from class: Yp2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m76258c;
                    m76258c = C37132Xp2.C9503g.m76258c(Function1.this, obj);
                    return m76258c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a¢\u0001\u0012J\b\u0001\u0012F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b \u0007*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b\u0018\u00010\u00010\u0001 \u0007*P\u0012J\b\u0001\u0012F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b \u0007*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b\u0018\u00010\u00010\u0001\u0018\u00010\u000b0\u000b2j\u0010\n\u001af\u0012H\u0012F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0007*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b0\u0000H\n¢\u0006\u0004\b\r\u0010\u000e"}, m28432d2 = {"Lkotlin/Pair;", "Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/IssueTypeLock;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/Issue;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$13\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,337:1\n1549#2:338\n1620#2,3:339\n766#2:342\n857#2,2:343\n1549#2:345\n1620#2,3:346\n766#2:349\n857#2,2:350\n1549#2:352\n1620#2,3:353\n37#3,2:356\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$13\n*L\n215#1:338\n215#1:339,3\n217#1:342\n217#1:343,2\n218#1:345\n218#1:346,3\n221#1:349\n221#1:350,2\n224#1:352\n224#1:353,3\n231#1:356,2\n*E\n"})
    /* renamed from: Xp2$h */
    /* loaded from: classes3.dex */
    public static final class C9505h extends Lambda implements Function1<Pair<? extends Triple<? extends Optional<WorkOrder>, ? extends Set<? extends String>, ? extends Integer>, ? extends List<? extends IssueTypeLock>>, InterfaceC23447K<? extends Triple<? extends Optional<WorkOrder>, ? extends Integer, ? extends List<? extends Issue>>>> {

        @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\t\u001aF\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \b*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/Issue;", "it", "Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Xp2$h$a */
        /* loaded from: classes3.dex */
        public static final class C9506a extends Lambda implements Function1<HM4<List<? extends Issue>>, Triple<? extends Optional<WorkOrder>, ? extends Integer, ? extends List<? extends Issue>>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<WorkOrder> f44006g;

            /* renamed from: h */
            public final /* synthetic */ int f44007h;

            /* renamed from: i */
            public final /* synthetic */ List<Issue> f44008i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9506a(Optional<WorkOrder> optional, int i, List<Issue> list) {
                super(1);
                this.f44006g = optional;
                this.f44007h = i;
                this.f44008i = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<Optional<WorkOrder>, Integer, List<Issue>> invoke(HM4<List<Issue>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Triple<>(this.f44006g, Integer.valueOf(this.f44007h), this.f44008i);
            }
        }

        public C9505h() {
            super(1);
        }

        /* renamed from: c */
        public static final Triple m76254c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<Optional<WorkOrder>, Integer, List<Issue>>> invoke(Pair<? extends Triple<Optional<WorkOrder>, ? extends Set<String>, Integer>, ? extends List<IssueTypeLock>> pair) {
            int collectionSizeOrDefault;
            List emptyList;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            List<Issue> listOf;
            List emptyList2;
            Issue copy;
            Issue copy2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Triple<Optional<WorkOrder>, ? extends Set<String>, Integer> component1 = pair.component1();
            List<IssueTypeLock> selectedIssues = pair.component2();
            Optional<WorkOrder> component12 = component1.component1();
            Set<String> component2 = component1.component2();
            int intValue = component1.component3().intValue();
            Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
            List<IssueTypeLock> list = selectedIssues;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (IssueTypeLock issueTypeLock : list) {
                arrayList.add(issueTypeLock.getIssueType().getId());
            }
            if (component12.m59037c()) {
                ArrayList<Issue> arrayList2 = new ArrayList();
                for (Object obj : C37132Xp2.this.f43993t.values()) {
                    if (component2.contains(((Issue) obj).getIssueTypeId())) {
                        arrayList2.add(obj);
                    }
                }
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                for (Issue issue : arrayList2) {
                    copy2 = issue.copy((r37 & 1) != 0 ? issue.f66598id : null, (r37 & 2) != 0 ? issue.workOrderId : null, (r37 & 4) != 0 ? issue.issueTypeId : null, (r37 & 8) != 0 ? issue.display : null, (r37 & 16) != 0 ? issue.description : null, (r37 & 32) != 0 ? issue.status : IssueStatus.DISPUTED, (r37 & 64) != 0 ? issue.statusDisplay : null, (r37 & 128) != 0 ? issue.statusColor : null, (r37 & 256) != 0 ? issue.statusReasonDisplay : null, (r37 & 512) != 0 ? issue.source : null, (r37 & 1024) != 0 ? issue.sourceDisplay : null, (r37 & 2048) != 0 ? issue.createdBy : null, (r37 & 4096) != 0 ? issue.createdAt : null, (r37 & 8192) != 0 ? issue.updatedAt : null, (r37 & 16384) != 0 ? issue.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue.assetId : null, (r37 & 65536) != 0 ? issue.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue.statusReason : null);
                    arrayList3.add(copy2);
                }
                ArrayList<Issue> arrayList4 = new ArrayList();
                Iterator it = C37132Xp2.this.f43993t.values().iterator();
                while (true) {
                    boolean z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Issue issue2 = (Issue) next;
                    if (arrayList.contains(issue2.getIssueTypeId()) && issue2.getStatus() == IssueStatus.DISPUTED) {
                        z = true;
                    }
                    if (z) {
                        arrayList4.add(next);
                    }
                }
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
                ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault3);
                for (Issue issue3 : arrayList4) {
                    copy = issue3.copy((r37 & 1) != 0 ? issue3.f66598id : null, (r37 & 2) != 0 ? issue3.workOrderId : null, (r37 & 4) != 0 ? issue3.issueTypeId : null, (r37 & 8) != 0 ? issue3.display : null, (r37 & 16) != 0 ? issue3.description : null, (r37 & 32) != 0 ? issue3.status : IssueStatus.OPEN, (r37 & 64) != 0 ? issue3.statusDisplay : null, (r37 & 128) != 0 ? issue3.statusColor : null, (r37 & 256) != 0 ? issue3.statusReasonDisplay : null, (r37 & 512) != 0 ? issue3.source : null, (r37 & 1024) != 0 ? issue3.sourceDisplay : null, (r37 & 2048) != 0 ? issue3.createdBy : null, (r37 & 4096) != 0 ? issue3.createdAt : null, (r37 & 8192) != 0 ? issue3.updatedAt : null, (r37 & 16384) != 0 ? issue3.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue3.assetId : null, (r37 & 65536) != 0 ? issue3.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue3.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue3.statusReason : null);
                    arrayList5.add(copy);
                }
                if (arrayList3.isEmpty() && arrayList5.isEmpty()) {
                    Integer valueOf = Integer.valueOf(intValue);
                    emptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    return AbstractC23442F.m33158H(new Triple(component12, valueOf, emptyList2));
                }
                InterfaceC37857aG6 interfaceC37857aG6 = C37132Xp2.this.f43982i;
                String id = component12.m59038b().getId();
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.addSpread(arrayList3.toArray(new Issue[0]));
                spreadBuilder.addSpread(arrayList5.toArray(new Issue[0]));
                listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Issue[spreadBuilder.size()]));
                AbstractC23442F<HM4<List<Issue>>> mo19642k = interfaceC37857aG6.mo19642k(id, listOf);
                final C9506a c9506a = new C9506a(component12, intValue, arrayList3);
                return mo19642k.m33157I(new InterfaceC23492o() { // from class: Zp2
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj2) {
                        Triple m76254c;
                        m76254c = C37132Xp2.C9505h.m76254c(Function1.this, obj2);
                        return m76254c;
                    }
                });
            }
            Optional m59034a = Optional.f63040c.m59034a();
            Integer valueOf2 = Integer.valueOf(intValue);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return AbstractC23442F.m33158H(new Triple(m59034a, valueOf2, emptyList));
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2J\u0010\u0007\u001aF\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xp2$i */
    /* loaded from: classes3.dex */
    public static final class C9507i extends Lambda implements Function1<Triple<? extends Optional<WorkOrder>, ? extends Integer, ? extends List<? extends Issue>>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WorkOrder f44009g;

        /* renamed from: h */
        public final /* synthetic */ DateTime f44010h;

        /* renamed from: i */
        public final /* synthetic */ C37132Xp2 f44011i;

        /* renamed from: j */
        public final /* synthetic */ WireBird f44012j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9507i(WorkOrder workOrder, DateTime dateTime, C37132Xp2 c37132Xp2, WireBird wireBird) {
            super(1);
            this.f44009g = workOrder;
            this.f44010h = dateTime;
            this.f44011i = c37132Xp2;
            this.f44012j = wireBird;
        }

        /* renamed from: a */
        public final void m76252a(Triple<Optional<WorkOrder>, Integer, ? extends List<Issue>> triple) {
            String str;
            Optional<WorkOrder> component1 = triple.component1();
            int intValue = triple.component2().intValue();
            List<Issue> component3 = triple.component3();
            WorkOrder workOrder = this.f44009g;
            String str2 = null;
            if (workOrder == null || (str = workOrder.getId()) == null) {
                WorkOrder m59035e = component1.m59035e();
                if (m59035e != null) {
                    str = m59035e.getId();
                } else {
                    str = null;
                }
            }
            if (this.f44010h != null && str != null) {
                this.f44011i.f43982i.mo19644i(this.f44010h, str).subscribe();
            }
            C37132Xp2 c37132Xp2 = this.f44011i;
            WireBird wireBird = this.f44012j;
            WorkOrder m59035e2 = component1.m59035e();
            if (m59035e2 != null) {
                str2 = m59035e2.getId();
            }
            c37132Xp2.m107427i(wireBird, str2, intValue, component3);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<WorkOrder>, ? extends Integer, ? extends List<? extends Issue>> triple) {
            m76252a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp2$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9508j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9508j(Object obj) {
            super(1, obj, C37132Xp2.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37132Xp2) this.receiver).m76282b0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2J\u0010\u0007\u001aF\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xp2$k */
    /* loaded from: classes3.dex */
    public static final class C9509k extends Lambda implements Function1<Triple<? extends Optional<WorkOrder>, ? extends Integer, ? extends List<? extends Issue>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f44014h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9509k(WireBird wireBird) {
            super(1);
            this.f44014h = wireBird;
        }

        /* renamed from: a */
        public final void m76251a(Triple<Optional<WorkOrder>, Integer, ? extends List<Issue>> triple) {
            if (triple.component1().m59037c()) {
                C37132Xp2.this.f43983j.mo44993r();
                C37132Xp2.this.m107430f().close();
                return;
            }
            C37132Xp2.this.m107430f().mo37069X3(this.f44014h);
            C37132Xp2.this.m107430f().close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<WorkOrder>, ? extends Integer, ? extends List<? extends Issue>> triple) {
            m76251a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp2$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9510l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9510l(Object obj) {
            super(1, obj, C37132Xp2.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37132Xp2) this.receiver).m76282b0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\u0094\u0002\u0010\n\u001a\u008f\u0002\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u00120\u0012.\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007 \u0002*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0002*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002*\u0086\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u00120\u0012.\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007 \u0002*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0002*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\f\u0010\r"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "", "", "", "Lco/bird/android/model/IssueType;", "Lco/bird/android/model/IssueTypeLock;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LRe4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$18\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n1747#2,3:338\n766#2:341\n857#2,2:342\n1726#2,3:344\n766#2:347\n857#2,2:348\n819#2:350\n847#2:351\n1747#2,3:352\n848#2:355\n1549#2:356\n1620#2,2:357\n1747#2,3:359\n1622#2:362\n1726#2,3:363\n1549#2:366\n1620#2,2:367\n1747#2,3:369\n1622#2:372\n1726#2,3:373\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$18\n*L\n278#1:338,3\n279#1:341\n279#1:342,2\n287#1:344,3\n291#1:347\n291#1:348,2\n293#1:350\n293#1:351\n293#1:352,3\n293#1:355\n294#1:356\n294#1:357,2\n295#1:359,3\n294#1:362\n297#1:363,3\n302#1:366\n302#1:367,2\n303#1:369,3\n302#1:372\n305#1:373,3\n*E\n"})
    /* renamed from: Xp2$m */
    /* loaded from: classes3.dex */
    public static final class C9511m extends Lambda implements Function1<C35631Re4<? extends BirdSummaryBody, ? extends Optional<MobilePartner>, ? extends Map<String, ? extends List<? extends IssueType>>, ? extends List<? extends IssueTypeLock>, ? extends String>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f44015g;

        /* renamed from: h */
        public final /* synthetic */ C37132Xp2 f44016h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9511m(boolean z, C37132Xp2 c37132Xp2) {
            super(1);
            this.f44015g = z;
            this.f44016h = c37132Xp2;
        }

        /* renamed from: a */
        public final void m76250a(C35631Re4<BirdSummaryBody, Optional<MobilePartner>, ? extends Map<String, ? extends List<IssueType>>, ? extends List<IssueTypeLock>, String> c35631Re4) {
            boolean z;
            int collectionSizeOrDefault;
            boolean z2;
            int collectionSizeOrDefault2;
            boolean z3;
            boolean z4;
            boolean z5;
            Map<String, ? extends List<IssueType>> m86498c = c35631Re4.m86498c();
            List<IssueTypeLock> selectedIssues = c35631Re4.m86497d();
            String m86496e = c35631Re4.m86496e();
            Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
            List<IssueTypeLock> list = selectedIssues;
            boolean z6 = list instanceof Collection;
            boolean z7 = true;
            if (!z6 || !list.isEmpty()) {
                for (IssueTypeLock issueTypeLock : list) {
                    if (issueTypeLock.component2()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            ArrayList<IssueTypeLock> arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((IssueTypeLock) obj).component2()) {
                    arrayList.add(obj);
                }
            }
            if (!this.f44015g && (!z || Intrinsics.areEqual(this.f44016h.f43986m, m86496e))) {
                if (z) {
                    if (!arrayList.isEmpty()) {
                        for (IssueTypeLock issueTypeLock2 : arrayList) {
                            if (!issueTypeLock2.component1().isNoIssue()) {
                                z5 = false;
                                break;
                            }
                        }
                    }
                    z5 = true;
                    if (z5) {
                        z7 = false;
                        break;
                    }
                }
                if (z) {
                    ArrayList<IssueTypeLock> arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((IssueTypeLock) obj2).component2()) {
                            arrayList2.add(obj2);
                        }
                    }
                    Set<String> keySet = m86498c.keySet();
                    ArrayList<String> arrayList3 = new ArrayList();
                    for (Object obj3 : keySet) {
                        String str = (String) obj3;
                        if (!arrayList2.isEmpty()) {
                            for (IssueTypeLock issueTypeLock3 : arrayList2) {
                                if (Intrinsics.areEqual(issueTypeLock3.component1().getCategory(), str)) {
                                    z4 = true;
                                    break;
                                }
                            }
                        }
                        z4 = false;
                        if (!z4) {
                            arrayList3.add(obj3);
                        }
                    }
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                    ArrayList<Boolean> arrayList4 = new ArrayList(collectionSizeOrDefault2);
                    for (String str2 : arrayList3) {
                        if (!arrayList.isEmpty()) {
                            for (IssueTypeLock issueTypeLock4 : arrayList) {
                                if (Intrinsics.areEqual(issueTypeLock4.component1().getCategory(), str2)) {
                                    z3 = true;
                                    break;
                                }
                            }
                        }
                        z3 = false;
                        arrayList4.add(Boolean.valueOf(z3));
                    }
                    if (!arrayList4.isEmpty()) {
                        for (Boolean bool : arrayList4) {
                            if (!bool.booleanValue()) {
                                z7 = false;
                                break;
                            }
                        }
                    }
                } else {
                    Set<String> keySet2 = m86498c.keySet();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet2, 10);
                    ArrayList<Boolean> arrayList5 = new ArrayList(collectionSizeOrDefault);
                    for (String str3 : keySet2) {
                        if (!z6 || !list.isEmpty()) {
                            for (IssueTypeLock issueTypeLock5 : list) {
                                if (Intrinsics.areEqual(issueTypeLock5.component1().getCategory(), str3)) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        arrayList5.add(Boolean.valueOf(z2));
                    }
                    if (!arrayList5.isEmpty()) {
                        for (Boolean bool2 : arrayList5) {
                            if (!bool2.booleanValue()) {
                                z7 = false;
                                break;
                            }
                        }
                    }
                }
            }
            this.f44016h.f43983j.mo44992x(z7);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C35631Re4<? extends BirdSummaryBody, ? extends Optional<MobilePartner>, ? extends Map<String, ? extends List<? extends IssueType>>, ? extends List<? extends IssueTypeLock>, ? extends String> c35631Re4) {
            m76250a(c35631Re4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\f \u0002*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00070\u0007 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\f \u0002*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00070\u0007\u0018\u00010\u000b0\u000b2\u0089\u0001\u0010\n\u001a\u0084\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u00120\u0012.\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007 \u0002*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0002*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u00060\u0000H\n¢\u0006\u0004\b\r\u0010\u000e"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "", "", "", "Lco/bird/android/model/IssueType;", "Lco/bird/android/model/IssueTypeLock;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(LRe4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xp2$n */
    /* loaded from: classes3.dex */
    public static final class C9512n extends Lambda implements Function1<C35631Re4<? extends BirdSummaryBody, ? extends Optional<MobilePartner>, ? extends Map<String, ? extends List<? extends IssueType>>, ? extends List<? extends IssueTypeLock>, ? extends String>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C9512n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(C35631Re4<BirdSummaryBody, Optional<MobilePartner>, ? extends Map<String, ? extends List<IssueType>>, ? extends List<IssueTypeLock>, String> c35631Re4) {
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            BirdSummaryBody birdSummary = c35631Re4.m86500a();
            Map<String, ? extends List<IssueType>> categories = c35631Re4.m86498c();
            List<IssueTypeLock> issues = c35631Re4.m86497d();
            String m86496e = c35631Re4.m86496e();
            InterfaceC40821fE6 interfaceC40821fE6 = C37132Xp2.this.f43984k;
            Intrinsics.checkNotNullExpressionValue(birdSummary, "birdSummary");
            Intrinsics.checkNotNullExpressionValue(categories, "categories");
            Intrinsics.checkNotNullExpressionValue(issues, "issues");
            return interfaceC40821fE6.mo29157b(birdSummary, c35631Re4.m86499b().m59035e(), categories, issues, m86496e);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp2$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9513o extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C9513o(Object obj) {
            super(1, obj, InterfaceC38786bq2.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC38786bq2) this.receiver).mo44996b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp2$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9514p extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9514p(Object obj) {
            super(1, obj, C37132Xp2.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37132Xp2) this.receiver).m76282b0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/Issue;", "existingIssues", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n1549#2:338\n1620#2,3:339\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$3\n*L\n118#1:338\n118#1:339,3\n*E\n"})
    /* renamed from: Xp2$q */
    /* loaded from: classes3.dex */
    public static final class C9515q extends Lambda implements Function1<List<? extends Issue>, Map<String, ? extends Issue>> {

        /* renamed from: g */
        public static final C9515q f44018g = new C9515q();

        public C9515q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, Issue> invoke(List<Issue> existingIssues) {
            int collectionSizeOrDefault;
            Map<String, Issue> map;
            Intrinsics.checkNotNullParameter(existingIssues, "existingIssues");
            List<Issue> list = existingIssues;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Issue issue : list) {
                arrayList.add(TuplesKt.m28425to(issue.getIssueTypeId(), issue));
            }
            map = MapsKt__MapsKt.toMap(arrayList);
            return map;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp2$r */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9516r extends FunctionReferenceImpl implements Function1<Map<? extends String, ? extends Issue>, Unit> {
        public C9516r(Object obj) {
            super(1, obj, Map.class, "putAll", "putAll(Ljava/util/Map;)V", 0);
        }

        /* renamed from: a */
        public final void m76247a(Map<? extends String, Issue> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Map) this.receiver).putAll(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<? extends String, ? extends Issue> map) {
            m76247a(map);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a¢\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0007 \u0003*P\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0007\u0018\u00010\u00000\u00002\u0087\u0001\u0010\n\u001a\u0082\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u00120\u0012.\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007 \u0003*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00050\u0005\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t \u0003*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\r\u0010\u000e"}, m28432d2 = {"Lwb4;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/BirdSummaryBody;", "", "", "", "Lco/bird/android/model/IssueType;", "Lco/bird/android/model/Issue;", "<name for destructuring parameter 0>", "", "Lco/bird/android/model/IssueTypeLock;", C17296a.f69688o, "(Lwb4;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n1549#2:338\n1620#2,2:339\n819#2:341\n847#2,2:342\n1747#2,3:344\n1622#2:347\n1855#2:348\n1549#2:349\n1620#2,3:350\n766#2:353\n857#2,2:354\n1747#2,3:356\n1856#2:359\n766#2:360\n857#2,2:361\n1549#2:363\n1620#2,3:364\n766#2:367\n857#2,2:368\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$5\n*L\n126#1:338\n126#1:339,2\n127#1:341\n127#1:342,2\n128#1:344,3\n126#1:347\n131#1:348\n133#1:349\n133#1:350,3\n134#1:353\n134#1:354,2\n134#1:356,3\n131#1:359\n146#1:360\n146#1:361,2\n149#1:363\n149#1:364,3\n154#1:367\n154#1:368,2\n*E\n"})
    /* renamed from: Xp2$s */
    /* loaded from: classes3.dex */
    public static final class C9517s extends Lambda implements Function1<C51106wb4<? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends Map<String, ? extends List<? extends IssueType>>, ? extends Map<String, ? extends Issue>>, C51106wb4<? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends Map<String, List<? extends IssueType>>, ? extends List<? extends IssueTypeLock>>> {

        /* renamed from: g */
        public final /* synthetic */ boolean f44019g;

        /* renamed from: h */
        public final /* synthetic */ C37132Xp2 f44020h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9517s(boolean z, C37132Xp2 c37132Xp2) {
            super(1);
            this.f44019g = z;
            this.f44020h = c37132Xp2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
            r13 = kotlin.collections.CollectionsKt___CollectionsKt.toMutableList((java.util.Collection) r13);
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C51106wb4<Optional<MobilePartner>, BirdSummaryBody, Map<String, List<IssueType>>, List<IssueTypeLock>> invoke(C51106wb4<Optional<MobilePartner>, BirdSummaryBody, ? extends Map<String, ? extends List<IssueType>>, ? extends Map<String, Issue>> c51106wb4) {
            int collectionSizeOrDefault;
            List flatten;
            int collectionSizeOrDefault2;
            boolean z;
            IssueStatus issueStatus;
            boolean z2;
            boolean z3;
            List arrayList;
            int collectionSizeOrDefault3;
            boolean z4;
            boolean z5;
            boolean z6;
            ArrayList arrayList2;
            Set of;
            IssueStatus issueStatus2;
            boolean contains;
            boolean z7;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            Optional<MobilePartner> m6614a = c51106wb4.m6614a();
            BirdSummaryBody m6613b = c51106wb4.m6613b();
            Map<String, ? extends List<IssueType>> m6612c = c51106wb4.m6612c();
            Map<String, Issue> m6611d = c51106wb4.m6611d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set<String> keySet = m6612c.keySet();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = keySet.iterator();
            while (true) {
                boolean z8 = true;
                boolean z9 = false;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                List<IssueType> list = m6612c.get(str);
                if (list != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        List<RepairScope> repairScopes = ((IssueType) obj).getRepairScopes();
                        if (repairScopes != null && repairScopes.contains(RepairScope.INTERNAL)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (!z7) {
                            arrayList2.add(obj);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    ArrayList<IssueType> arrayList4 = arrayList2;
                    if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                        for (IssueType issueType : arrayList4) {
                            of = SetsKt__SetsKt.setOf((Object[]) new IssueStatus[]{IssueStatus.OPEN, IssueStatus.RESOLVED});
                            Issue issue = m6611d.get(issueType.getId());
                            if (issue != null) {
                                issueStatus2 = issue.getStatus();
                            } else {
                                issueStatus2 = null;
                            }
                            contains = CollectionsKt___CollectionsKt.contains(of, issueStatus2);
                            if (contains) {
                                break;
                            }
                        }
                    }
                    z8 = false;
                    z9 = z8;
                }
                arrayList3.add(TuplesKt.m28425to(str, Boolean.valueOf(z9)));
            }
            boolean z10 = this.f44019g;
            C37132Xp2 c37132Xp2 = this.f44020h;
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                String str2 = (String) pair.component1();
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                List<IssueType> list2 = m6612c.get(str2);
                if (list2 == null || arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<IssueType> list3 = arrayList;
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
                ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault3);
                for (IssueType issueType2 : list3) {
                    arrayList5.add(issueType2.getId());
                }
                ArrayList<Issue> arrayList6 = new ArrayList();
                for (Object obj2 : m6611d.values()) {
                    Iterator it3 = it2;
                    if (arrayList5.contains(((Issue) obj2).getIssueTypeId())) {
                        arrayList6.add(obj2);
                    }
                    it2 = it3;
                }
                Iterator it4 = it2;
                if (!arrayList6.isEmpty()) {
                    for (Issue issue2 : arrayList6) {
                        if (issue2.getStatus() == IssueStatus.RESOLVED) {
                            z4 = true;
                            continue;
                        } else {
                            z4 = false;
                            continue;
                        }
                        if (z4) {
                            z5 = true;
                            break;
                        }
                    }
                }
                z5 = false;
                if ((z10 && !booleanValue) || !z5) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    arrayList.add(c37132Xp2.f43985l.mo18076a(str2));
                }
                linkedHashMap.put(str2, arrayList);
                it2 = it4;
            }
            flatten = CollectionsKt__IterablesKt.flatten(m6612c.values());
            ArrayList<IssueType> arrayList7 = new ArrayList();
            for (Object obj3 : flatten) {
                if (m6611d.get(((IssueType) obj3).getId()) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    arrayList7.add(obj3);
                }
            }
            boolean z11 = this.f44019g;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10);
            ArrayList arrayList8 = new ArrayList(collectionSizeOrDefault2);
            for (IssueType issueType3 : arrayList7) {
                Issue issue3 = m6611d.get(issueType3.getId());
                if (issue3 != null) {
                    issueStatus = issue3.getStatus();
                } else {
                    issueStatus = null;
                }
                if (z11 || issueStatus != IssueStatus.OPEN) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (issueStatus == null) {
                    issueStatus = IssueStatus.OPEN;
                }
                arrayList8.add(new IssueTypeLock(issueType3, z2, issueStatus));
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj4 : arrayList8) {
                if (((IssueTypeLock) obj4).getStatus() == IssueStatus.OPEN) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList9.add(obj4);
                }
            }
            return new C51106wb4<>(m6614a, m6613b, linkedHashMap, arrayList9);
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2§\u0001\u0010\n\u001a¢\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0007 \u0003*P\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\f\u0010\r"}, m28432d2 = {"Lwb4;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/BirdSummaryBody;", "", "", "", "Lco/bird/android/model/IssueType;", "Lco/bird/android/model/IssueTypeLock;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xp2$t */
    /* loaded from: classes3.dex */
    public static final class C9518t extends Lambda implements Function1<C51106wb4<? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends Map<String, List<? extends IssueType>>, ? extends List<? extends IssueTypeLock>>, Unit> {
        public C9518t() {
            super(1);
        }

        /* renamed from: a */
        public final void m76245a(C51106wb4<Optional<MobilePartner>, BirdSummaryBody, ? extends Map<String, List<IssueType>>, ? extends List<IssueTypeLock>> c51106wb4) {
            C37132Xp2.this.f43987n.onNext(c51106wb4.m6614a());
            C37132Xp2.this.f43988o.onNext(c51106wb4.m6613b());
            C37132Xp2.this.f43989p.onNext(c51106wb4.m6612c());
            C37132Xp2.this.f43990q.onNext(c51106wb4.m6611d());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends Map<String, List<? extends IssueType>>, ? extends List<? extends IssueTypeLock>> c51106wb4) {
            m76245a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp2$u */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9519u extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9519u(Object obj) {
            super(1, obj, C37132Xp2.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37132Xp2) this.receiver).m76282b0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp2$v */
    /* loaded from: classes3.dex */
    public static final class C9520v extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f44023h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9520v(WireBird wireBird) {
            super(1);
            this.f44023h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C37132Xp2.this.f43983j.mo44997W8(this.f44023h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u00010\u0005H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/IssueTypeLock;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n766#2:338\n857#2,2:339\n1549#2:341\n1620#2,3:342\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionPresenterImpl$onCreate$9\n*L\n176#1:338\n176#1:339,2\n177#1:341\n177#1:342,3\n*E\n"})
    /* renamed from: Xp2$w */
    /* loaded from: classes3.dex */
    public static final class C9521w extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends IssueTypeLock>>, List<? extends IssueType>> {

        /* renamed from: g */
        public static final C9521w f44024g = new C9521w();

        public C9521w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends IssueType> invoke(Pair<? extends Unit, ? extends List<? extends IssueTypeLock>> pair) {
            return invoke2((Pair<Unit, ? extends List<IssueTypeLock>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<IssueType> invoke2(Pair<Unit, ? extends List<IssueTypeLock>> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<IssueTypeLock> selectedIssues = pair.component2();
            Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
            ArrayList<IssueTypeLock> arrayList = new ArrayList();
            for (Object obj : selectedIssues) {
                IssueTypeLock issueTypeLock = (IssueTypeLock) obj;
                if ((issueTypeLock.component1().isNoIssue() || issueTypeLock.component2()) ? false : true) {
                    arrayList.add(obj);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (IssueTypeLock issueTypeLock2 : arrayList) {
                arrayList2.add(issueTypeLock2.component1());
            }
            return arrayList2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/MobilePartner;", "partner", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/MobilePartner;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xp2$x */
    /* loaded from: classes3.dex */
    public static final class C9522x extends Lambda implements Function1<MobilePartner, Optional<MobilePartner>> {

        /* renamed from: g */
        public static final C9522x f44025g = new C9522x();

        public C9522x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<MobilePartner> invoke(MobilePartner partner) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            return Optional.f63040c.m59032c(partner);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37132Xp2(InterfaceC44647lh6 userManager, InterfaceC1880Ea analyticsManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, InterfaceC10636aM birdManager, GI3 partnerManager, InterfaceC37857aG6 workOrderManager, InterfaceC38786bq2 ui, InterfaceC40821fE6 converter, InterfaceC46692p83 noRepairGenerator) {
        super(userManager, analyticsManager, scopeProvider, navigator, ui);
        List emptyList;
        List emptyList2;
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(noRepairGenerator, "noRepairGenerator");
        this.f43980g = birdManager;
        this.f43981h = partnerManager;
        this.f43982i = workOrderManager;
        this.f43983j = ui;
        this.f43984k = converter;
        this.f43985l = noRepairGenerator;
        C24552a<Optional<MobilePartner>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Optional<MobilePartner>>()");
        this.f43987n = m31922e;
        C24552a<BirdSummaryBody> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<BirdSummaryBody>()");
        this.f43988o = m31922e2;
        C24552a<Map<String, List<IssueType>>> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<Map<String, List<IssueType>>>()");
        this.f43989p = m31922e3;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<IssueTypeLock>> m31921g = C24552a.m31921g(emptyList);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<List<IssueTypeLock>>(emptyList())");
        this.f43990q = m31921g;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<IssueTypeLock>> m31921g2 = C24552a.m31921g(emptyList2);
        Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault<List<IssueTypeLock>>(emptyList())");
        this.f43991r = m31921g2;
        C24552a<String> m31921g3 = C24552a.m31921g("");
        Intrinsics.checkNotNullExpressionValue(m31921g3, "createDefault(\"\")");
        this.f43992s = m31921g3;
        this.f43993t = new LinkedHashMap();
        Object m33094as = ui.mo44991z().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9497a c9497a = new C9497a(m31921g3);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Bp2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37132Xp2.m76306F(Function1.this, obj);
            }
        });
        Observable<String> observeOn = ui.mo44994n2().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.categoryClicks()\n    …dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9498b c9498b = new C9498b(navigator);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Mp2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37132Xp2.m76305G(Function1.this, obj);
            }
        });
    }

    /* renamed from: F */
    public static final void m76306F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m76305G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m76304H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final List m76303I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m76302J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final Triple m76301K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23447K m76300L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23447K m76299M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m76298N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m76297O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m76296P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m76295Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m76294R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final InterfaceC23447K m76293S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m76292T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m76291U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final Optional m76290V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final Map m76289W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Map) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m76288X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final C51106wb4 m76287Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C51106wb4) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m76286Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m76284a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        r3 = kotlin.collections.CollectionsKt___CollectionsKt.toList(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = kotlin.collections.SetsKt___SetsKt.plus(r0, (java.lang.Iterable) r3);
     */
    @Override // p000.InterfaceC31750Ap2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo76285a(List<IssueTypeLock> issues) {
        Set set;
        List<IssueTypeLock> emptyList;
        Set plus;
        Intrinsics.checkNotNullParameter(issues, "issues");
        List<IssueTypeLock> value = this.f43991r.getValue();
        if (value != null) {
            set = CollectionsKt___CollectionsKt.toSet(value);
        } else {
            set = null;
        }
        C24552a<List<IssueTypeLock>> c24552a = this.f43991r;
        if (set == null || plus == null || emptyList == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        c24552a.onNext(emptyList);
    }

    @Override // p000.InterfaceC31750Ap2
    /* renamed from: b */
    public void mo76283b(WireBird bird, WorkOrder workOrder, boolean z, boolean z2) {
        AbstractC23442F<Optional<MobilePartner>> partnerSingle;
        List emptyList;
        AbstractC23442F<HM4<List<Issue>>> m33158H;
        String notes;
        Intrinsics.checkNotNullParameter(bird, "bird");
        super.mo75363c(bird, workOrder, z);
        DateTime now = z2 ? DateTime.now(DateTimeZone.UTC) : null;
        if (workOrder != null && (notes = workOrder.getNotes()) != null) {
            this.f43992s.onNext(notes);
            this.f43986m = notes;
        }
        if (!this.f43987n.m31919i() && bird.getPartnerId() != null) {
            GI3 gi3 = this.f43981h;
            String partnerId = bird.getPartnerId();
            Intrinsics.checkNotNull(partnerId);
            AbstractC23442F<MobilePartner> mo97362u = gi3.mo97362u(partnerId);
            final C9522x c9522x = C9522x.f44025g;
            partnerSingle = mo97362u.m33157I(new InterfaceC23492o() { // from class: Pp2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m76290V;
                    m76290V = C37132Xp2.m76290V(Function1.this, obj);
                    return m76290V;
                }
            });
        } else if (this.f43987n.m31919i()) {
            partnerSingle = this.f43987n.firstOrError();
        } else {
            partnerSingle = AbstractC23442F.m33158H(Optional.f63040c.m59034a());
        }
        C48501sB5 c48501sB5 = C48501sB5.f108430a;
        Intrinsics.checkNotNullExpressionValue(partnerSingle, "partnerSingle");
        AbstractC23442F m70883l = C38096ag5.m70883l(this.f43980g.mo71571o(bird.getId()));
        InterfaceC37857aG6 interfaceC37857aG6 = this.f43982i;
        String model = bird.getModel();
        if (model == null) {
            model = BirdModel.M365.toString();
        }
        AbstractC23442F m70883l2 = C38096ag5.m70883l(InterfaceC37857aG6.C10609b.getIssuesMappedByCategory$default(interfaceC37857aG6, model, null, 2, null));
        if (workOrder == null || (m33158H = this.f43982i.mo19648e(workOrder.getId())) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            m33158H = AbstractC23442F.m33158H(HM4.m103935j(emptyList));
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(Response.success(listOf()))");
        }
        AbstractC23442F m70883l3 = C38096ag5.m70883l(m33158H);
        final C9515q c9515q = C9515q.f44018g;
        AbstractC23442F m33157I = m70883l3.m33157I(new InterfaceC23492o() { // from class: Fp2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Map m76289W;
                m76289W = C37132Xp2.m76289W(Function1.this, obj);
                return m76289W;
            }
        });
        final C9516r c9516r = new C9516r(this.f43993t);
        AbstractC23442F m33101w = m33157I.m33101w(new InterfaceC23484g() { // from class: Gp2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37132Xp2.m76288X(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "workOrder?.let {\n       …s.existingIssues::putAll)");
        AbstractC23442F m14579d = c48501sB5.m14579d(partnerSingle, m70883l, m70883l2, m33101w);
        final C9517s c9517s = new C9517s(z, this);
        AbstractC23442F m33152N = m14579d.m33157I(new InterfaceC23492o() { // from class: Hp2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C51106wb4 m76287Y;
                m76287Y = C37132Xp2.m76287Y(Function1.this, obj);
                return m76287Y;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "override fun onCreate(bi…teAdapter, ::onError)\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m107429g()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9518t c9518t = new C9518t();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Ip2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37132Xp2.m76286Z(Function1.this, obj);
            }
        };
        final C9519u c9519u = new C9519u(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Jp2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37132Xp2.m76284a0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn = this.f43983j.mo44998B().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.commandClicks()\n     …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m107429g()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9520v c9520v = new C9520v(bird);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Kp2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37132Xp2.m76304H(Function1.this, obj);
            }
        });
        if (z) {
            Observable m31950a = C24527f.m31950a(this.f43983j.mo44995c(), this.f43990q);
            final C9521w c9521w = C9521w.f44024g;
            Observable map = m31950a.map(new InterfaceC23492o() { // from class: Lp2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m76303I;
                    m76303I = C37132Xp2.m76303I(Function1.this, obj);
                    return m76303I;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "ui.submitClicks()\n      … -> issueType }\n        }");
            Object m33094as2 = map.m33094as(AutoDispose.m45239a(m107429g()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C9501e c9501e = new C9501e();
            ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Np2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37132Xp2.m76302J(Function1.this, obj);
                }
            });
        } else {
            Observable<R> withLatestFrom = this.f43983j.mo44995c().withLatestFrom(this.f43990q, this.f43991r, this.f43992s, C9500d.f43997a);
            Intrinsics.checkNotNullExpressionValue(withLatestFrom, "withLatestFrom(o1, o2, o…-> Quad(t, t1, t2, t3) })");
            final C9502f c9502f = new C9502f();
            Observable map2 = withLatestFrom.map(new InterfaceC23492o() { // from class: Op2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m76301K;
                    m76301K = C37132Xp2.m76301K(Function1.this, obj);
                    return m76301K;
                }
            });
            final C9503g c9503g = new C9503g(bird, workOrder);
            Observable flatMapSingle = map2.flatMapSingle(new InterfaceC23492o() { // from class: Qp2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m76300L;
                    m76300L = C37132Xp2.m76300L(Function1.this, obj);
                    return m76300L;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onCreate(bi…teAdapter, ::onError)\n  }");
            Observable m31950a2 = C24527f.m31950a(flatMapSingle, this.f43990q);
            final C9505h c9505h = new C9505h();
            Observable flatMapSingle2 = m31950a2.flatMapSingle(new InterfaceC23492o() { // from class: Rp2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m76299M;
                    m76299M = C37132Xp2.m76299M(Function1.this, obj);
                    return m76299M;
                }
            });
            final C9507i c9507i = new C9507i(workOrder, now, this, bird);
            Observable observeOn2 = flatMapSingle2.doOnNext(new InterfaceC23484g() { // from class: Sp2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37132Xp2.m76298N(Function1.this, obj);
                }
            }).observeOn(C23454a.m33087a());
            final C9508j c9508j = new C9508j(this);
            Observable observeOn3 = observeOn2.doOnError(new InterfaceC23484g() { // from class: Tp2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37132Xp2.m76297O(Function1.this, obj);
                }
            }).retry().observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn3, "override fun onCreate(bi…teAdapter, ::onError)\n  }");
            Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(m107429g()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C9509k c9509k = new C9509k(bird);
            InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Up2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37132Xp2.m76296P(Function1.this, obj);
                }
            };
            final C9510l c9510l = new C9510l(this);
            ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Vp2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37132Xp2.m76295Q(Function1.this, obj);
                }
            });
        }
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f43988o, this.f43987n, this.f43989p, this.f43990q, this.f43992s, C9499c.f43996a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
        Observable observeOn4 = combineLatest.observeOn(C23454a.m33087a());
        final C9511m c9511m = new C9511m(z, this);
        Observable doOnNext = observeOn4.doOnNext(new InterfaceC23484g() { // from class: Wp2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37132Xp2.m76294R(Function1.this, obj);
            }
        });
        final C9512n c9512n = new C9512n();
        Observable observeOn5 = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: Cp2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m76293S;
                m76293S = C37132Xp2.m76293S(Function1.this, obj);
                return m76293S;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "override fun onCreate(bi…teAdapter, ::onError)\n  }");
        Object m33094as4 = observeOn5.m33094as(AutoDispose.m45239a(m107429g()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9513o c9513o = new C9513o(this.f43983j);
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: Dp2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37132Xp2.m76292T(Function1.this, obj);
            }
        };
        final C9514p c9514p = new C9514p(this);
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: Ep2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37132Xp2.m76291U(Function1.this, obj);
            }
        });
    }

    /* renamed from: b0 */
    public final void m76282b0(Throwable th) {
        C41318g46.m40159e(th);
        if (th instanceof HttpException) {
            this.f43983j.error(th);
        } else {
            this.f43983j.error(C45871nl4.error_generic_body);
        }
    }

    @Override // p000.InterfaceC31750Ap2
    /* renamed from: d */
    public void mo76281d(List<IssueTypeLock> issues) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        this.f43990q.onNext(issues);
    }
}
