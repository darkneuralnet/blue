package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IssueType;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.QCInspection;
import co.bird.android.model.RepairScope;
import co.bird.android.model.RepairType;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.InspectionFlow;
import co.bird.android.model.constant.QCStatus;
import co.bird.android.model.extension.IssueType_Kt;
import co.bird.android.model.wire.WireBird;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24518b;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.C32103Cc4;
import p000.C45672nQ5;
import p000.FQ5;
import p000.InterfaceC37857aG6;
@Metadata(m28433d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206¢\u0006\u0004\bL\u0010MJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004*\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002J\b\u0010\r\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J,\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J\"\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010>\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010\u00100\u00100:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R.\u0010@\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 ;*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\"\u0010B\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=R.\u0010D\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b ;*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00040\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010=R.\u0010G\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020E ;*\n\u0012\u0004\u0012\u00020E\u0018\u00010\u00040\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010=R.\u0010K\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 ;*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u00040H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006N"}, m28432d2 = {"LCc4;", "Lic4;", "", "workOrderId", "", "Lco/bird/android/model/QCInspection;", "inspections", "Lco/bird/android/model/QCAutoCheck;", "qcAutoChecks", "", "M", "Lco/bird/android/model/IssueType;", "z", "A", "", "L", "Lco/bird/android/model/wire/WireBird;", "bird", "qcInspections", C17296a.f69688o, "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "LLc4;", "LLc4;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lcc4;", "c", "Lcc4;", "converter", "LGc4;", DateTokenConverter.CONVERTER_KEY, "LGc4;", "statusConverter", "LaG6;", "e", "LaG6;", "workOrderManager", "Le13;", "f", "Le13;", "navigator", "LTq4;", "g", "LTq4;", "reactiveConfig", "LAb4;", "h", "LAb4;", "qualityControlAnalyticsManager", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/a;", "birdSubject", "j", "inspectionsSubject", "k", "workOrderIdSubject", "l", "issueTypesSubject", "Lco/bird/android/model/RepairType;", "m", "repairTypesSubject", "Lio/reactivex/subjects/d;", "n", "Lio/reactivex/subjects/d;", "qcAutoChecksSubject", "<init>", "(LLc4;Lcom/uber/autodispose/ScopeProvider;Lcc4;LGc4;LaG6;Le13;LTq4;LAb4;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQualityControlResultPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultPresenter.kt\nco/bird/android/qualitycontrol/result/QualityControlResultPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,214:1\n180#2:215\n161#2:216\n180#2:217\n199#2:224\n180#2:233\n1549#3:218\n1620#3,3:219\n1360#3:225\n1446#3,2:226\n1448#3,3:230\n2624#3,3:234\n37#4,2:222\n37#4,2:228\n*S KotlinDebug\n*F\n+ 1 QualityControlResultPresenter.kt\nco/bird/android/qualitycontrol/result/QualityControlResultPresenterImpl\n*L\n83#1:215\n109#1:216\n137#1:217\n181#1:224\n203#1:233\n156#1:218\n156#1:219,3\n189#1:225\n189#1:226,2\n189#1:230,3\n212#1:234,3\n164#1:222,2\n189#1:228,2\n*E\n"})
/* renamed from: Cc4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32103Cc4 implements InterfaceC42816ic4 {

    /* renamed from: a */
    public final InterfaceC34209Lc4 f4335a;

    /* renamed from: b */
    public final ScopeProvider f4336b;

    /* renamed from: c */
    public final InterfaceC39241cc4 f4337c;

    /* renamed from: d */
    public final InterfaceC33039Gc4 f4338d;

    /* renamed from: e */
    public final InterfaceC37857aG6 f4339e;

    /* renamed from: f */
    public final InterfaceC40099e13 f4340f;

    /* renamed from: g */
    public final C36207Tq4 f4341g;

    /* renamed from: h */
    public final InterfaceC31626Ab4 f4342h;

    /* renamed from: i */
    public final C24552a<WireBird> f4343i;

    /* renamed from: j */
    public final C24552a<List<QCInspection>> f4344j;

    /* renamed from: k */
    public final C24552a<String> f4345k;

    /* renamed from: l */
    public final C24552a<List<IssueType>> f4346l;

    /* renamed from: m */
    public final C24552a<List<RepairType>> f4347m;

    /* renamed from: n */
    public final C24558d<List<QCAutoCheck>> f4348n;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072T\u0010\u0006\u001aP\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/IssueType;", "Lco/bird/android/model/RepairType;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cc4$a */
    /* loaded from: classes4.dex */
    public static final class C1084a extends Lambda implements Function1<Triple<? extends List<? extends QCInspection>, ? extends List<? extends IssueType>, ? extends List<? extends RepairType>>, Boolean> {

        /* renamed from: g */
        public static final C1084a f4349g = new C1084a();

        public C1084a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
            if ((!r4.isEmpty()) != false) goto L5;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Triple<? extends List<QCInspection>, ? extends List<IssueType>, ? extends List<RepairType>> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<IssueType> issueTypes = triple.component2();
            List<RepairType> repairTypes = triple.component3();
            boolean z = true;
            if (!issueTypes.isEmpty() || !repairTypes.isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(issueTypes, "issueTypes");
                if (!issueTypes.isEmpty()) {
                    Intrinsics.checkNotNullExpressionValue(repairTypes, "repairTypes");
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\r\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\u0004\u0012\u00020\f \u0003*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\n0\n \u0003*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\u0004\u0012\u00020\f \u0003*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\n0\n\u0018\u00010\t0\t2Û\u0001\u0010\b\u001aÖ\u0001\u0012©\u0001\u0012¦\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001 \u0003*R\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\r\u0010\u000e"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/IssueType;", "Lco/bird/android/model/RepairType;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/QCAutoCheck;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Pair;", "LH6;", "", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cc4$b */
    /* loaded from: classes4.dex */
    public static final class C1085b extends Lambda implements Function1<Triple<? extends Triple<? extends List<? extends QCInspection>, ? extends List<? extends IssueType>, ? extends List<? extends RepairType>>, ? extends WireBird, ? extends List<? extends QCAutoCheck>>, InterfaceC23447K<? extends Pair<? extends List<? extends C3023H6>, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "adapterSections", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Cc4$b$a */
        /* loaded from: classes4.dex */
        public static final class C1086a extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends List<? extends C3023H6>, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ C32103Cc4 f4351g;

            /* renamed from: h */
            public final /* synthetic */ List<QCInspection> f4352h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1086a(C32103Cc4 c32103Cc4, List<QCInspection> list) {
                super(1);
                this.f4351g = c32103Cc4;
                this.f4352h = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<C3023H6>, Boolean> invoke(List<C3023H6> adapterSections) {
                Intrinsics.checkNotNullParameter(adapterSections, "adapterSections");
                C32103Cc4 c32103Cc4 = this.f4351g;
                List<QCInspection> inspections = this.f4352h;
                Intrinsics.checkNotNullExpressionValue(inspections, "inspections");
                return TuplesKt.m28425to(adapterSections, Boolean.valueOf(c32103Cc4.m112023L(inspections)));
            }
        }

        public C1085b() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<List<C3023H6>, Boolean>> invoke(Triple<? extends Triple<? extends List<QCInspection>, ? extends List<IssueType>, ? extends List<RepairType>>, WireBird, ? extends List<QCAutoCheck>> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Triple<? extends List<QCInspection>, ? extends List<IssueType>, ? extends List<RepairType>> component1 = triple.component1();
            List<QCAutoCheck> qcAutoChecks = triple.component3();
            List<QCInspection> inspections = component1.component1();
            List<IssueType> issueTypes = component1.component2();
            List<RepairType> repairTypes = component1.component3();
            InterfaceC39241cc4 interfaceC39241cc4 = C32103Cc4.this.f4337c;
            String model = triple.component2().getModel();
            if (model == null) {
                model = BirdModel.B2.toString();
            }
            Intrinsics.checkNotNullExpressionValue(inspections, "inspections");
            Intrinsics.checkNotNullExpressionValue(issueTypes, "issueTypes");
            Intrinsics.checkNotNullExpressionValue(repairTypes, "repairTypes");
            Intrinsics.checkNotNullExpressionValue(qcAutoChecks, "qcAutoChecks");
            AbstractC23442F<List<C3023H6>> mo42721a = interfaceC39241cc4.mo42721a(model, inspections, issueTypes, repairTypes, qcAutoChecks);
            final C1086a c1086a = new C1086a(C32103Cc4.this, inspections);
            return mo42721a.m33157I(new InterfaceC23492o() { // from class: Dc4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C32103Cc4.C1085b.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cc4$c */
    /* loaded from: classes4.dex */
    public static final class C1087c extends Lambda implements Function1<Throwable, Unit> {
        public C1087c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C32103Cc4.this.f4335a.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LH6;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cc4$d */
    /* loaded from: classes4.dex */
    public static final class C1088d extends Lambda implements Function1<Pair<? extends List<? extends C3023H6>, ? extends Boolean>, Unit> {
        public C1088d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends C3023H6>, ? extends Boolean> pair) {
            invoke2((Pair<? extends List<C3023H6>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<C3023H6>, Boolean> pair) {
            int i;
            List<C3023H6> adapterSections = pair.component1();
            boolean booleanValue = pair.component2().booleanValue();
            InterfaceC34209Lc4 interfaceC34209Lc4 = C32103Cc4.this.f4335a;
            if (booleanValue) {
                i = C45871nl4.quality_control_success_activity_title;
            } else {
                i = C45871nl4.quality_control_fail_activity_title;
            }
            interfaceC34209Lc4.mo95129Y(i);
            InterfaceC34209Lc4 interfaceC34209Lc42 = C32103Cc4.this.f4335a;
            Intrinsics.checkNotNullExpressionValue(adapterSections, "adapterSections");
            interfaceC34209Lc42.mo95127b(adapterSections);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cc4$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C1089e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1089e f4355b = new C1089e();

        public C1089e() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aú\u0001\u0012v\b\u0001\u0012r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003 \u0006*|\u0012v\b\u0001\u0012r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/RepairType;", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cc4$f */
    /* loaded from: classes4.dex */
    public static final class C1090f extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends Pair<? extends List<? extends IssueType>, ? extends List<? extends RepairType>>>> {
        public C1090f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Pair<List<IssueType>, List<RepairType>>> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            C24530g c24530g = C24530g.f91174a;
            InterfaceC37857aG6 interfaceC37857aG6 = C32103Cc4.this.f4339e;
            String model = bird.getModel();
            Intrinsics.checkNotNull(model);
            AbstractC23442F m70883l = C38096ag5.m70883l(InterfaceC37857aG6.C10609b.getIssueTypesByModel$default(interfaceC37857aG6, model, null, 2, null));
            InterfaceC37857aG6 interfaceC37857aG62 = C32103Cc4.this.f4339e;
            String id = bird.getId();
            String model2 = bird.getModel();
            Intrinsics.checkNotNull(model2);
            return c24530g.m31946a(m70883l, C38096ag5.m70883l(interfaceC37857aG62.mo19652b(id, model2, RepairScope.SERVICE_CENTER)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001aV\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002 \u0005**\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012:\u0010\u0006\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0005*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/IssueType;", "Lco/bird/android/model/RepairType;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cc4$g */
    /* loaded from: classes4.dex */
    public static final class C1091g extends Lambda implements Function1<Pair<? extends List<? extends IssueType>, ? extends List<? extends RepairType>>, Pair<? extends List<? extends IssueType>, ? extends List<? extends RepairType>>> {
        public C1091g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends List<? extends IssueType>, ? extends List<? extends RepairType>> invoke(Pair<? extends List<? extends IssueType>, ? extends List<? extends RepairType>> pair) {
            return invoke2((Pair<? extends List<IssueType>, ? extends List<RepairType>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<List<IssueType>, List<RepairType>> invoke2(Pair<? extends List<IssueType>, ? extends List<RepairType>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<IssueType> issueSupertypes = pair.component1();
            C32103Cc4 c32103Cc4 = C32103Cc4.this;
            Intrinsics.checkNotNullExpressionValue(issueSupertypes, "issueSupertypes");
            return TuplesKt.m28425to(c32103Cc4.m111993z(issueSupertypes), pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012Z\u0010\u0002\u001aV\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0007**\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/IssueType;", "Lco/bird/android/model/RepairType;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cc4$h */
    /* loaded from: classes4.dex */
    public static final class C1092h extends Lambda implements Function1<Pair<? extends List<? extends IssueType>, ? extends List<? extends RepairType>>, Unit> {
        public C1092h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends IssueType>, ? extends List<? extends RepairType>> pair) {
            invoke2((Pair<? extends List<IssueType>, ? extends List<RepairType>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<IssueType>, ? extends List<RepairType>> pair) {
            C32103Cc4.this.f4346l.onNext(pair.component1());
            C32103Cc4.this.f4347m.onNext(pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nQualityControlResultPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultPresenter.kt\nco/bird/android/qualitycontrol/result/QualityControlResultPresenterImpl$getIssueTypesAndRepairTypes$4\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n9#2,4:215\n1#3:219\n*S KotlinDebug\n*F\n+ 1 QualityControlResultPresenter.kt\nco/bird/android/qualitycontrol/result/QualityControlResultPresenterImpl$getIssueTypesAndRepairTypes$4\n*L\n208#1:215,4\n*E\n"})
    /* renamed from: Cc4$i */
    /* loaded from: classes4.dex */
    public static final class C1093i extends Lambda implements Function1<Throwable, Unit> {
        public C1093i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            Unit unit = null;
            if (!(th instanceof HttpException)) {
                th = null;
            }
            HttpException httpException = (HttpException) th;
            if (httpException != null) {
                C32103Cc4.this.f4335a.error(httpException);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                C32103Cc4.this.f4335a.errorGeneric();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cc4$j */
    /* loaded from: classes4.dex */
    public static final class C1094j extends Lambda implements Function1<Throwable, Unit> {
        public C1094j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C32103Cc4.this.f4335a.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/WorkOrder;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cc4$k */
    /* loaded from: classes4.dex */
    public static final class C1095k extends Lambda implements Function1<Pair<? extends Unit, ? extends WorkOrder>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f4362h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Cc4$k$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C1096a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InspectionFlow.values().length];
                try {
                    iArr[InspectionFlow.LEGACY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InspectionFlow.LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1095k(WireBird wireBird) {
            super(1);
            this.f4362h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends WorkOrder> pair) {
            invoke2((Pair<Unit, WorkOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, WorkOrder> pair) {
            WorkOrder component2 = pair.component2();
            int i = C1096a.$EnumSwitchMapping$0[C32103Cc4.this.f4341g.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getInspectionFlow().ordinal()];
            if (i == 1) {
                C32103Cc4.this.f4340f.mo37098S(this.f4362h, component2, true, true);
            } else if (i != 2) {
            } else {
                C32103Cc4.this.f4340f.mo37197B0(this.f4362h, component2, true);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cc4$l */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C1097l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1097l f4363b = new C1097l();

        public C1097l() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0004*,\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/QCInspection;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cc4$m */
    /* loaded from: classes4.dex */
    public static final class C1098m extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends QCInspection>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f4365h;

        /* renamed from: i */
        public final /* synthetic */ List<QCAutoCheck> f4366i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1098m(String str, List<QCAutoCheck> list) {
            super(1);
            this.f4365h = str;
            this.f4366i = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends List<? extends QCInspection>> pair) {
            invoke2((Pair<Unit, ? extends List<QCInspection>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, ? extends List<QCInspection>> pair) {
            List<QCInspection> inspections = pair.component2();
            C32103Cc4 c32103Cc4 = C32103Cc4.this;
            String str = this.f4365h;
            Intrinsics.checkNotNullExpressionValue(inspections, "inspections");
            c32103Cc4.m112022M(str, inspections, this.f4366i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnQ5$b;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LnQ5$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cc4$o */
    /* loaded from: classes4.dex */
    public static final class C1101o extends Lambda implements Function1<C45672nQ5.EnumC26504b, Unit> {
        public C1101o() {
            super(1);
        }

        /* renamed from: a */
        public final void m111985a(C45672nQ5.EnumC26504b enumC26504b) {
            C32103Cc4.this.f4340f.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45672nQ5.EnumC26504b enumC26504b) {
            m111985a(enumC26504b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "passed", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cc4$p */
    /* loaded from: classes4.dex */
    public static final class C1102p extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: h */
        public final /* synthetic */ List<QCInspection> f4376h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1102p(List<QCInspection> list) {
            super(1);
            this.f4376h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean passed) {
            InterfaceC31626Ab4 interfaceC31626Ab4 = C32103Cc4.this.f4342h;
            Intrinsics.checkNotNullExpressionValue(passed, "passed");
            interfaceC31626Ab4.mo113827c(passed.booleanValue(), this.f4376h);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cc4$q */
    /* loaded from: classes4.dex */
    public static final class C1103q extends Lambda implements Function1<Pair<? extends Boolean, ? extends WireBird>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C1103q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<Boolean, WireBird> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean passed = pair.component1();
            InterfaceC33039Gc4 interfaceC33039Gc4 = C32103Cc4.this.f4338d;
            String code = pair.component2().getCode();
            Intrinsics.checkNotNullExpressionValue(passed, "passed");
            return interfaceC33039Gc4.mo100116h(code, passed.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cc4$r */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C1104r extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C1104r(Object obj) {
            super(1, obj, InterfaceC34209Lc4.class, "onSuccess", "onSuccess(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC34209Lc4) this.receiver).mo12610b1(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cc4$s */
    /* loaded from: classes4.dex */
    public static final class C1105s extends Lambda implements Function1<Throwable, Unit> {
        public C1105s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC34209Lc4 interfaceC34209Lc4 = C32103Cc4.this.f4335a;
            List<C3023H6> m33132g = C32103Cc4.this.f4338d.mo100117a(((WireBird) C32103Cc4.this.f4343i.blockingFirst()).getCode()).m33132g();
            Intrinsics.checkNotNullExpressionValue(m33132g, "statusConverter.convertF…rst().code).blockingGet()");
            interfaceC34209Lc4.mo12607g1(m33132g);
            C41318g46.m40159e(th);
        }
    }

    public C32103Cc4(InterfaceC34209Lc4 ui, ScopeProvider scopeProvider, InterfaceC39241cc4 converter, InterfaceC33039Gc4 statusConverter, InterfaceC37857aG6 workOrderManager, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig, InterfaceC31626Ab4 qualityControlAnalyticsManager) {
        List emptyList;
        List emptyList2;
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(statusConverter, "statusConverter");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(qualityControlAnalyticsManager, "qualityControlAnalyticsManager");
        this.f4335a = ui;
        this.f4336b = scopeProvider;
        this.f4337c = converter;
        this.f4338d = statusConverter;
        this.f4339e = workOrderManager;
        this.f4340f = navigator;
        this.f4341g = reactiveConfig;
        this.f4342h = qualityControlAnalyticsManager;
        C24552a<WireBird> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireBird>()");
        this.f4343i = m31922e;
        C24552a<List<QCInspection>> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<List<QCInspection>>()");
        this.f4344j = m31922e2;
        C24552a<String> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<String>()");
        this.f4345k = m31922e3;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<IssueType>> m31921g = C24552a.m31921g(emptyList);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<List<IssueType>>(emptyList())");
        this.f4346l = m31921g;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<RepairType>> m31921g2 = C24552a.m31921g(emptyList2);
        Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault<List<RepairType>>(emptyList())");
        this.f4347m = m31921g2;
        C24558d<List<QCAutoCheck>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<List<QCAutoCheck>>()");
        this.f4348n = m31902e;
        Observable m31955b = C24523e.f91168a.m31955b(m31922e2, m31921g, m31921g2);
        final C1084a c1084a = C1084a.f4349g;
        Observable filter = m31955b.filter(new InterfaceC23494q() { // from class: Ac4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m111998u;
                m111998u = C32103Cc4.m111998u(Function1.this, obj);
                return m111998u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "Observables.combineLates…pes.isNotEmpty())\n      }");
        Observable m31949b = C24527f.m31949b(filter, m31922e, m31902e);
        final C1085b c1085b = new C1085b();
        Observable observeOn = m31949b.switchMapSingle(new InterfaceC23492o() { // from class: Bc4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m111997v;
                m111997v = C32103Cc4.m111997v(Function1.this, obj);
                return m111997v;
            }
        }).observeOn(C23454a.m33087a());
        final C1087c c1087c = new C1087c();
        Observable doOnError = observeOn.doOnError(new InterfaceC23484g() { // from class: kc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m111996w(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "Observables.combineLates…ui.error(error.message) }");
        Object m33094as = doOnError.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1088d c1088d = new C1088d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: lc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m111995x(Function1.this, obj);
            }
        };
        final C1089e c1089e = C1089e.f4355b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: mc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m111994y(Function1.this, obj);
            }
        });
    }

    /* renamed from: B */
    public static final InterfaceC23447K m112033B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final Pair m112032C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m112031D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m112030E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m112029F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m112028G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m112027H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m112026I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m112025J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final InterfaceC23434B m112024K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m112021N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC23447K m112020O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m112019P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m112018Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final boolean m111998u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: v */
    public static final InterfaceC23447K m111997v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m111996w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m111995x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m111994y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final void m112034A() {
        C24552a<WireBird> c24552a = this.f4343i;
        final C1090f c1090f = new C1090f();
        Observable<R> flatMapSingle = c24552a.flatMapSingle(new InterfaceC23492o() { // from class: wc4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m112033B;
                m112033B = C32103Cc4.m112033B(Function1.this, obj);
                return m112033B;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "private fun getIssueType…rrorGeneric()\n      }\n  }");
        Observable progress$default = C28237sD.progress$default(flatMapSingle, this.f4335a, 0, 2, (Object) null);
        final C1091g c1091g = new C1091g();
        Observable map = progress$default.map(new InterfaceC23492o() { // from class: xc4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m112032C;
                m112032C = C32103Cc4.m112032C(Function1.this, obj);
                return m112032C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun getIssueType…rrorGeneric()\n      }\n  }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(this.f4336b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1092h c1092h = new C1092h();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: yc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m112031D(Function1.this, obj);
            }
        };
        final C1093i c1093i = new C1093i();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: zc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m112030E(Function1.this, obj);
            }
        });
    }

    /* renamed from: L */
    public final boolean m112023L(List<QCInspection> list) {
        boolean z;
        List<QCInspection> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (QCInspection qCInspection : list2) {
            if (qCInspection.getStatus() == QCStatus.FAILED) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    public final void m112022M(String str, List<QCInspection> list, List<QCAutoCheck> list2) {
        AbstractC23442F m70883l = C38096ag5.m70883l(this.f4339e.mo19646g(str, list, list2));
        final C1102p c1102p = new C1102p(list);
        AbstractC23442F m33101w = m70883l.m33101w(new InterfaceC23484g() { // from class: jc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m112021N(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun processQcIns…  Timber.e(e)\n      }\n  }");
        S74 mo12605oc = this.f4335a.mo12605oc();
        if (mo12605oc == null) {
            mo12605oc = this.f4335a;
        }
        AbstractC23442F m74531s0 = C37279Yf5.m74531s0(C28237sD.progress$default(m33101w, mo12605oc, 0, 2, (Object) null), this.f4343i);
        final C1103q c1103q = new C1103q();
        AbstractC23442F m33152N = m74531s0.m33165A(new InterfaceC23492o() { // from class: tc4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m112020O;
                m112020O = C32103Cc4.m112020O(Function1.this, obj);
                return m112020O;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "private fun processQcIns…  Timber.e(e)\n      }\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f4336b));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1104r c1104r = new C1104r(this.f4335a);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: uc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m112019P(Function1.this, obj);
            }
        };
        final C1105s c1105s = new C1105s();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: vc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m112018Q(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC42816ic4
    /* renamed from: a */
    public void mo33751a(WireBird bird, List<QCInspection> qcInspections, List<QCAutoCheck> qcAutoChecks) {
        Object first;
        List<QCInspection> mutableList;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(qcInspections, "qcInspections");
        Intrinsics.checkNotNullParameter(qcAutoChecks, "qcAutoChecks");
        this.f4343i.onNext(bird);
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) qcInspections);
        String workOrderId = ((QCInspection) first).getWorkOrderId();
        this.f4345k.onNext(workOrderId);
        this.f4348n.onNext(qcAutoChecks);
        C24552a<List<QCInspection>> c24552a = this.f4344j;
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) qcInspections);
        c24552a.onNext(mutableList);
        AbstractC24490k m32114r0 = AbstractC24490k.m32114r0(this.f4335a.mo95126i1(), this.f4335a.mo95130Og());
        Intrinsics.checkNotNullExpressionValue(m32114r0, "merge(\n      ui.addIssue…tillDamagedClicks()\n    )");
        AbstractC24490k m33127i0 = C38096ag5.m70883l(this.f4339e.mo19637p(bird.getId())).m33127i0();
        Intrinsics.checkNotNullExpressionValue(m33127i0, "workOrderManager.getOpen…sponseBody().toFlowable()");
        AbstractC24490k m32111s0 = C24518b.m31962a(m32114r0, m33127i0).m32111s0(C23454a.m33087a());
        final C1094j c1094j = new C1094j();
        AbstractC24490k m32195I = m32111s0.m32195I(new InterfaceC23484g() { // from class: nc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m112028G(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32195I, "override fun onCreate(bi…ndRepairTypes()\n    }\n  }");
        Object m32150f = m32195I.m32150f(AutoDispose.m45239a(this.f4336b));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1095k c1095k = new C1095k(bird);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: oc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m112027H(Function1.this, obj);
            }
        };
        final C1097l c1097l = C1097l.f4363b;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: pc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m112026I(Function1.this, obj);
            }
        });
        Observable m32113r1 = AbstractC24490k.m32114r0(this.f4335a.mo95125p2(), this.f4335a.mo95128a8()).m32113r1();
        Intrinsics.checkNotNullExpressionValue(m32113r1, "merge(\n      ui.readyToR…  )\n      .toObservable()");
        Observable m31950a = C24527f.m31950a(m32113r1, this.f4344j);
        final C1098m c1098m = new C1098m(workOrderId, qcAutoChecks);
        Observable observeOn = m31950a.doAfterNext(new InterfaceC23484g() { // from class: qc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m112025J(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        final C1099n c1099n = new C1099n(workOrderId, qcAutoChecks);
        Observable retry = observeOn.switchMap(new InterfaceC23492o() { // from class: rc4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m112024K;
                m112024K = C32103Cc4.m112024K(Function1.this, obj);
                return m112024K;
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate(bi…ndRepairTypes()\n    }\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f4336b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1101o c1101o = new C1101o();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: sc4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32103Cc4.m112029F(Function1.this, obj);
            }
        });
        if (m112023L(qcInspections)) {
            return;
        }
        m112034A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r4 == null) goto L28;
     */
    @Override // p000.InterfaceC42816ic4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int i, int i2, Intent intent) {
        List emptyList;
        int collectionSizeOrDefault;
        List<QCInspection> listOf;
        if (intent != null) {
            if (i == 10019 && i2 == -1) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("issues");
                if (parcelableArrayListExtra != null) {
                    Intrinsics.checkNotNullExpressionValue(parcelableArrayListExtra, "getParcelableArrayListEx…IssueType>(Extras.ISSUES)");
                    emptyList = CollectionsKt___CollectionsKt.toList(parcelableArrayListExtra);
                } else {
                    emptyList = null;
                }
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        List<QCInspection> value = this.f4344j.getValue();
        if (value == null) {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        List<IssueType> list = emptyList;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (IssueType it : list) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            String value2 = this.f4345k.getValue();
            Intrinsics.checkNotNull(value2);
            arrayList.add(IssueType_Kt.toQCInspection(it, value2, QCStatus.FAILED));
        }
        if (m112023L(value) && !m112023L(arrayList)) {
            m112034A();
        }
        C24552a<List<QCInspection>> c24552a = this.f4344j;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(value.toArray(new QCInspection[0]));
        spreadBuilder.addSpread(arrayList.toArray(new QCInspection[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new QCInspection[spreadBuilder.size()]));
        c24552a.onNext(listOf);
    }

    @Override // p000.InterfaceC42816ic4
    public void onBackPressed() {
        this.f4340f.mo37050b1(0);
    }

    /* renamed from: z */
    public final List<IssueType> m111993z(List<IssueType> list) {
        List listOf;
        ArrayList arrayList = new ArrayList();
        for (IssueType issueType : list) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(issueType);
            spreadBuilder.addSpread(issueType.getSubtypes().toArray(new IssueType[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new IssueType[spreadBuilder.size()]));
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, listOf);
        }
        return arrayList;
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/QCInspection;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "LnQ5$b;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cc4$n */
    /* loaded from: classes4.dex */
    public static final class C1099n extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends QCInspection>>, InterfaceC23434B<? extends C45672nQ5.EnumC26504b>> {

        /* renamed from: h */
        public final /* synthetic */ String f4368h;

        /* renamed from: i */
        public final /* synthetic */ List<QCAutoCheck> f4369i;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnQ5$b;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LnQ5$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Cc4$n$a */
        /* loaded from: classes4.dex */
        public static final class C1100a extends Lambda implements Function1<C45672nQ5.EnumC26504b, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C32103Cc4 f4370g;

            /* renamed from: h */
            public final /* synthetic */ String f4371h;

            /* renamed from: i */
            public final /* synthetic */ List<QCInspection> f4372i;

            /* renamed from: j */
            public final /* synthetic */ List<QCAutoCheck> f4373j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1100a(C32103Cc4 c32103Cc4, String str, List<QCInspection> list, List<QCAutoCheck> list2) {
                super(1);
                this.f4370g = c32103Cc4;
                this.f4371h = str;
                this.f4372i = list;
                this.f4373j = list2;
            }

            /* renamed from: a */
            public final void m111986a(C45672nQ5.EnumC26504b enumC26504b) {
                if (enumC26504b == C45672nQ5.EnumC26504b.TRY_AGAIN) {
                    C32103Cc4 c32103Cc4 = this.f4370g;
                    String str = this.f4371h;
                    List<QCInspection> inspections = this.f4372i;
                    Intrinsics.checkNotNullExpressionValue(inspections, "inspections");
                    c32103Cc4.m112022M(str, inspections, this.f4373j);
                    return;
                }
                this.f4370g.f4340f.mo37030e3();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45672nQ5.EnumC26504b enumC26504b) {
                m111986a(enumC26504b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1099n(String str, List<QCAutoCheck> list) {
            super(1);
            this.f4368h = str;
            this.f4369i = list;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends C45672nQ5.EnumC26504b> invoke2(Pair<Unit, ? extends List<QCInspection>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Observable showStatusDialog$default = FQ5.C2274a.showStatusDialog$default(C32103Cc4.this.f4335a, null, 1, null);
            final C1100a c1100a = new C1100a(C32103Cc4.this, this.f4368h, pair.component2(), this.f4369i);
            return showStatusDialog$default.doOnNext(new InterfaceC23484g() { // from class: Ec4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C32103Cc4.C1099n.invoke$lambda$0(Function1.this, obj);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends C45672nQ5.EnumC26504b> invoke(Pair<? extends Unit, ? extends List<? extends QCInspection>> pair) {
            return invoke2((Pair<Unit, ? extends List<QCInspection>>) pair);
        }
    }
}
