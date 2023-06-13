package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.Folder;
import co.bird.android.model.PermissionStatus;
import co.bird.android.model.PhotoBannerViewModel;
import co.bird.android.model.constant.ContentKind;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.UploadKind;
import co.bird.android.model.wire.ReleaseValidationResult;
import co.bird.android.model.wire.WireNest;
import co.bird.android.model.wire.WireReleaseItem;
import co.bird.api.response.ReleaseResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.observables.AbstractC24495a;
import io.reactivex.rxkotlin.C24527f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.C31806Av4;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BA\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203¢\u0006\u0004\bA\u0010BJF\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\f0\n0\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004*\b\u0012\u0004\u0012\u00020\u00100\u0004H\u0002J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004*\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0002J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004*\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R.\u0010>\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b ;*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\f0\f0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\"\u0010@\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010\u00050\u00050:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=¨\u0006C"}, m28432d2 = {"LAv4;", "LhE;", "LJv4;", "LKv4;", "Lio/reactivex/Observable;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireNest;", "nest", "renderer", "Lkotlin/Pair;", "Lco/bird/android/model/wire/ReleaseValidationResult;", "", "r0", "Lco/bird/api/response/ReleaseResponse;", "k0", "", "", "R", "T", "P", "", "e", "g0", "Lio/reactivex/F;", "h0", "V", "Le13;", "f", "Le13;", "navigator", "Ldr4;", "g", "Ldr4;", "locationManager", "Ls43;", "h", "Ls43;", "nestManager", "LDQ3;", "i", "LDQ3;", "permissionManager", "Lef6;", "j", "Lef6;", "uploadManager", "LTq4;", "k", "LTq4;", "reactiveConfig", "Lco/bird/android/model/PhotoBannerViewModel;", "l", "Lco/bird/android/model/PhotoBannerViewModel;", "photoBannerViewModel", "m", "Ljava/lang/String;", "sessionId", "Lma4;", "kotlin.jvm.PlatformType", "n", "Lma4;", "validatedItemsRelay", "o", "assetIdRelay", "<init>", "(Le13;Ldr4;Ls43;LDQ3;Lef6;LTq4;Lco/bird/android/model/PhotoBannerViewModel;)V", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,360:1\n71#2,2:361\n61#2,2:365\n180#3:363\n180#3:364\n180#3:367\n180#3:368\n180#3:369\n180#3:370\n180#3:371\n271#4:372\n233#4:373\n271#4:374\n*S KotlinDebug\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter\n*L\n54#1:361,2\n128#1:365,2\n60#1:363\n97#1:364\n133#1:367\n151#1:368\n162#1:369\n194#1:370\n203#1:371\n214#1:372\n246#1:373\n266#1:374\n*E\n"})
/* renamed from: Av4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31806Av4 extends C22600hE<InterfaceC33912Jv4, C34146Kv4> {

    /* renamed from: f */
    public final InterfaceC40099e13 f1364f;

    /* renamed from: g */
    public final InterfaceC40001dr4 f1365g;

    /* renamed from: h */
    public final InterfaceC48430s43 f1366h;

    /* renamed from: i */
    public final DQ3 f1367i;

    /* renamed from: j */
    public final InterfaceC40476ef6 f1368j;

    /* renamed from: k */
    public final C36207Tq4 f1369k;

    /* renamed from: l */
    public final PhotoBannerViewModel f1370l;

    /* renamed from: m */
    public final String f1371m;

    /* renamed from: n */
    public final C45168ma4<List<ReleaseValidationResult>> f1372n;

    /* renamed from: o */
    public final C45168ma4<String> f1373o;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Av4$A */
    /* loaded from: classes3.dex */
    public static final class C0304A extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Av4$A$a */
        /* loaded from: classes3.dex */
        public static final class C0305a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

            /* renamed from: g */
            public static final C0305a f1375g = new C0305a();

            public C0305a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34146Kv4 invoke(C34146Kv4 state) {
                C34146Kv4 m98142n;
                Intrinsics.checkNotNullParameter(state, "state");
                m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : true, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                return m98142n;
            }
        }

        public C0304A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C31806Av4.this.m42279i(C0305a.f1375g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T", "T1", "T2", "T3", "R", "t", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$5\n+ 2 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter\n*L\n1#1,304:1\n218#2:305\n*E\n"})
    /* renamed from: Av4$B */
    /* loaded from: classes3.dex */
    public static final class C0306B<T1, T2, T3, T4, R> implements InterfaceC23486i<String, T1, T2, T3, R> {
        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(String str, T1 t1, T2 t2, T3 t3) {
            return (R) new C51106wb4(str, (Optional) t1, (Optional) t2, (List) t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "raw", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Av4$C */
    /* loaded from: classes3.dex */
    public static final class C0307C extends Lambda implements Function1<String, String> {

        /* renamed from: g */
        public static final C0307C f1376g = new C0307C();

        public C0307C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            String m99597e = C33894Jt4.f18402a.m99597e(raw);
            return m99597e == null ? raw : m99597e;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2Ç\u0001\u0010\u0007\u001aÂ\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0002*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0002*`\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0002*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lwb4;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireNest;", "", "Lco/bird/android/model/wire/ReleaseValidationResult;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$D */
    /* loaded from: classes3.dex */
    public static final class C0308D extends Lambda implements Function1<C51106wb4<? extends String, ? extends Optional<WireNest>, ? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$validateScan$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
        /* renamed from: Av4$D$a */
        /* loaded from: classes3.dex */
        public static final class C0309a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

            /* renamed from: g */
            public static final C0309a f1378g = new C0309a();

            public C0309a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34146Kv4 invoke(C34146Kv4 state) {
                C34146Kv4 m98142n;
                Intrinsics.checkNotNullParameter(state, "state");
                m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : false, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                m98142n.m98144B(true);
                return m98142n;
            }
        }

        public C0308D() {
            super(1);
        }

        /* renamed from: a */
        public final void m114888a(C51106wb4<String, Optional<WireNest>, Optional<String>, ? extends List<ReleaseValidationResult>> c51106wb4) {
            Optional<WireNest> m6613b = c51106wb4.m6613b();
            List<ReleaseValidationResult> m6611d = c51106wb4.m6611d();
            if (m6613b.m59037c() && m6611d.size() >= m6613b.m59038b().getAvailableCapacity()) {
                C31806Av4.this.m42279i(C0309a.f1378g);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends String, ? extends Optional<WireNest>, ? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>> c51106wb4) {
            m114888a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\t\u001a\u00020\b2b\u0010\u0007\u001a^\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0002*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lwb4;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireNest;", "", "Lco/bird/android/model/wire/ReleaseValidationResult;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$E */
    /* loaded from: classes3.dex */
    public static final class C0310E extends Lambda implements Function1<C51106wb4<? extends String, ? extends Optional<WireNest>, ? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>>, Boolean> {

        /* renamed from: g */
        public static final C0310E f1379g = new C0310E();

        public C0310E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C51106wb4<String, Optional<WireNest>, Optional<String>, ? extends List<ReleaseValidationResult>> c51106wb4) {
            boolean z;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            Optional<WireNest> m6613b = c51106wb4.m6613b();
            List<ReleaseValidationResult> m6611d = c51106wb4.m6611d();
            if (m6613b.m59037c() && (!m6613b.m59037c() || m6611d.size() >= m6613b.m59038b().getAvailableCapacity())) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\b0\b2b\u0010\u0007\u001a^\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0002*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lwb4;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireNest;", "", "Lco/bird/android/model/wire/ReleaseValidationResult;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", C17296a.f69688o, "(Lwb4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$validateScan$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1603#2,9:361\n1855#2:370\n1856#2:372\n1612#2:373\n1#3:371\n*S KotlinDebug\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$validateScan$5\n*L\n236#1:361,9\n236#1:370\n236#1:372\n236#1:373\n236#1:371\n*E\n"})
    /* renamed from: Av4$F */
    /* loaded from: classes3.dex */
    public static final class C0311F extends Lambda implements Function1<C51106wb4<? extends String, ? extends Optional<WireNest>, ? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>>, InterfaceC23447K<? extends ReleaseValidationResult>> {
        public C0311F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends ReleaseValidationResult> invoke(C51106wb4<String, Optional<WireNest>, Optional<String>, ? extends List<ReleaseValidationResult>> c51106wb4) {
            String str;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            String scanIdentifier = c51106wb4.m6614a();
            Optional<String> m6612c = c51106wb4.m6612c();
            List<ReleaseValidationResult> scannedItems = c51106wb4.m6611d();
            C31806Av4 c31806Av4 = C31806Av4.this;
            InterfaceC48430s43 interfaceC48430s43 = c31806Av4.f1366h;
            String str2 = C31806Av4.this.f1371m;
            WireNest m59035e = c51106wb4.m6613b().m59035e();
            if (m59035e != null) {
                str = m59035e.getId();
            } else {
                str = null;
            }
            String m59035e2 = m6612c.m59035e();
            Intrinsics.checkNotNullExpressionValue(scanIdentifier, "scanIdentifier");
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            ArrayList arrayList = new ArrayList();
            for (ReleaseValidationResult releaseValidationResult : scannedItems) {
                String birdId = releaseValidationResult.getBirdId();
                if (birdId != null) {
                    arrayList.add(birdId);
                }
            }
            return c31806Av4.m114917h0(interfaceC48430s43.mo10895f(str2, str, m59035e2, scanIdentifier, arrayList));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Av4$G */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0312G extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C0312G(Object obj) {
            super(1, obj, C31806Av4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C31806Av4) this.receiver).m114918g0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/Boolean;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$a */
    /* loaded from: classes3.dex */
    public static final class C0313a extends Lambda implements Function1<Boolean, InterfaceC24574u<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "mocked", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Av4$a$a */
        /* loaded from: classes3.dex */
        public static final class C0314a extends Lambda implements Function1<Boolean, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C31806Av4 f1382g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$checkLocationMocked$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
            /* renamed from: Av4$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C0315a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

                /* renamed from: g */
                public static final C0315a f1383g = new C0315a();

                public C0315a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C34146Kv4 invoke(C34146Kv4 state) {
                    C34146Kv4 m98142n;
                    Intrinsics.checkNotNullParameter(state, "state");
                    m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : false, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                    m98142n.m98131y(true);
                    return m98142n;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0314a(C31806Av4 c31806Av4) {
                super(1);
                this.f1382g = c31806Av4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean mocked) {
                Intrinsics.checkNotNullExpressionValue(mocked, "mocked");
                if (mocked.booleanValue()) {
                    this.f1382g.m42279i(C0315a.f1383g);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "mocked", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Av4$a$b */
        /* loaded from: classes3.dex */
        public static final class C0316b extends Lambda implements Function1<Boolean, Boolean> {

            /* renamed from: g */
            public static final C0316b f1384g = new C0316b();

            public C0316b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Boolean mocked) {
                Intrinsics.checkNotNullParameter(mocked, "mocked");
                return Boolean.valueOf(!mocked.booleanValue());
            }
        }

        public C0313a() {
            super(1);
        }

        /* renamed from: d */
        public static final boolean m114881d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Boolean> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<Boolean> mo43624h = C31806Av4.this.f1365g.mo43624h();
            final C0314a c0314a = new C0314a(C31806Av4.this);
            AbstractC23442F<Boolean> m33101w = mo43624h.m33101w(new InterfaceC23484g() { // from class: yv4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C31806Av4.C0313a.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C0316b c0316b = C0316b.f1384g;
            return m33101w.m33098z(new InterfaceC23494q() { // from class: zv4
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m114881d;
                    m114881d = C31806Av4.C0313a.m114881d(Function1.this, obj);
                    return m114881d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$b */
    /* loaded from: classes3.dex */
    public static final class C0317b extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "t", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Av4$b$a */
        /* loaded from: classes3.dex */
        public static final class C0318a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C31806Av4 f1386g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$checkLocationService$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
            /* renamed from: Av4$b$a$a */
            /* loaded from: classes3.dex */
            public static final class C0319a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

                /* renamed from: g */
                public final /* synthetic */ Throwable f1387g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0319a(Throwable th) {
                    super(1);
                    this.f1387g = th;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C34146Kv4 invoke(C34146Kv4 state) {
                    C34146Kv4 m98142n;
                    Intrinsics.checkNotNullParameter(state, "state");
                    m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : false, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                    m98142n.m98145A(this.f1387g);
                    return m98142n;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0318a(C31806Av4 c31806Av4) {
                super(1);
                this.f1386g = c31806Av4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f1386g.m42279i(new C0319a(th));
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "success", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Av4$b$b */
        /* loaded from: classes3.dex */
        public static final class C0320b extends Lambda implements Function1<Boolean, Boolean> {

            /* renamed from: g */
            public static final C0320b f1388g = new C0320b();

            public C0320b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Boolean success) {
                Intrinsics.checkNotNullParameter(success, "success");
                return success;
            }
        }

        public C0317b() {
            super(1);
        }

        /* renamed from: e */
        public static final Boolean m114875e(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }

        /* renamed from: f */
        public static final boolean m114874f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC24574u<? extends Boolean> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<Boolean> mo43615q = C31806Av4.this.f1365g.mo43615q(true);
            final C0318a c0318a = new C0318a(C31806Av4.this);
            AbstractC23442F<Boolean> m33149Q = mo43615q.m33106t(new InterfaceC23484g() { // from class: Bv4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C31806Av4.C0317b.invoke$lambda$0(Function1.this, obj);
                }
            }).m33149Q(new InterfaceC23492o() { // from class: Cv4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m114875e;
                    m114875e = C31806Av4.C0317b.m114875e((Throwable) obj);
                    return m114875e;
                }
            });
            final C0320b c0320b = C0320b.f1388g;
            return m33149Q.m33098z(new InterfaceC23494q() { // from class: Dv4
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m114874f;
                    m114874f = C31806Av4.C0317b.m114874f(Function1.this, obj);
                    return m114874f;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$c */
    /* loaded from: classes3.dex */
    public static final class C0321c extends Lambda implements Function1<Boolean, InterfaceC24574u<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$checkPreciseLocationPermission$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
        /* renamed from: Av4$c$a */
        /* loaded from: classes3.dex */
        public static final class C0322a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

            /* renamed from: g */
            public static final C0322a f1390g = new C0322a();

            public C0322a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34146Kv4 invoke(C34146Kv4 state) {
                C34146Kv4 m98142n;
                Intrinsics.checkNotNullParameter(state, "state");
                m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : false, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                m98142n.m98130z(true);
                return m98142n;
            }
        }

        public C0321c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Boolean> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (C31806Av4.this.f1367i.m110496a(Permission.ACCESS_FINE_LOCATION) != PermissionStatus.GRANTED) {
                C31806Av4.this.m42279i(C0322a.f1390g);
                return AbstractC24507p.m32024u();
            }
            return AbstractC24507p.m32068G(Boolean.TRUE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$3\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Av4$d */
    /* loaded from: classes3.dex */
    public static final class C0323d<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C0323d<T1, T2, T3, T4, R> f1391a = new C0323d<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Av4$e */
    /* loaded from: classes3.dex */
    public static final class C0324e<T1, T2, T3, R> implements InterfaceC23485h {

        /* renamed from: a */
        public static final C0324e<T1, T2, T3, R> f1392a = new C0324e<>();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062J\u0010\u0005\u001aF\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lwb4;", "", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$f */
    /* loaded from: classes3.dex */
    public static final class C0325f extends Lambda implements Function1<C51106wb4<? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Optional<String>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Av4$f$a */
        /* loaded from: classes3.dex */
        public static final class C0326a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

            /* renamed from: g */
            public final /* synthetic */ boolean f1394g;

            /* renamed from: h */
            public final /* synthetic */ Optional<String> f1395h;

            /* renamed from: i */
            public final /* synthetic */ boolean f1396i;

            /* renamed from: j */
            public final /* synthetic */ boolean f1397j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0326a(boolean z, Optional<String> optional, boolean z2, boolean z3) {
                super(1);
                this.f1394g = z;
                this.f1395h = optional;
                this.f1396i = z2;
                this.f1397j = z3;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34146Kv4 invoke(C34146Kv4 state) {
                C34146Kv4 m98142n;
                Intrinsics.checkNotNullParameter(state, "state");
                m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : this.f1395h.m59037c(), (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : false, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : Boolean.valueOf(this.f1396i), (r30 & 256) != 0 ? state.f20379i : Boolean.valueOf(this.f1397j), (r30 & 512) != 0 ? state.f20380j : Boolean.valueOf(!this.f1394g), (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                return m98142n;
            }
        }

        public C0325f() {
            super(1);
        }

        /* renamed from: a */
        public final void m114868a(C51106wb4<Boolean, Boolean, Boolean, Optional<String>> c51106wb4) {
            C31806Av4.this.m42279i(new C0326a(c51106wb4.m6612c().booleanValue(), c51106wb4.m6611d(), c51106wb4.m6614a().booleanValue(), c51106wb4.m6613b().booleanValue()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Optional<String>> c51106wb4) {
            m114868a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/FileUploadReceipt;", "receipt", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/FileUploadReceipt;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$g */
    /* loaded from: classes3.dex */
    public static final class C0327g extends Lambda implements Function1<FileUploadReceipt, String> {

        /* renamed from: g */
        public static final C0327g f1398g = new C0327g();

        public C0327g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(FileUploadReceipt receipt) {
            Intrinsics.checkNotNullParameter(receipt, "receipt");
            return receipt.getAssetId();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "scan", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$h */
    /* loaded from: classes3.dex */
    public static final class C0328h extends Lambda implements Function1<String, InterfaceC23434B<? extends String>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Av4$h$a */
        /* loaded from: classes3.dex */
        public static final class C0329a extends Lambda implements Function1<Boolean, String> {

            /* renamed from: g */
            public final /* synthetic */ String f1400g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0329a(String str) {
                super(1);
                this.f1400g = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f1400g;
            }
        }

        public C0328h() {
            super(1);
        }

        /* renamed from: c */
        public static final String m114863c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends String> invoke(String scan) {
            Intrinsics.checkNotNullParameter(scan, "scan");
            C31806Av4 c31806Av4 = C31806Av4.this;
            Observable just = Observable.just(Unit.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(just, "just(Unit)");
            Observable m114934R = c31806Av4.m114934R(just);
            final C0329a c0329a = new C0329a(scan);
            return m114934R.map(new InterfaceC23492o() { // from class: Ev4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m114863c;
                    m114863c = C31806Av4.C0328h.m114863c(Function1.this, obj);
                    return m114863c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/ReleaseValidationResult;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$consume$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,360:1\n1747#2,3:361\n1054#2:364\n37#3,2:365\n*S KotlinDebug\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$consume$3\n*L\n106#1:361,3\n110#1:364\n119#1:365,2\n*E\n"})
    /* renamed from: Av4$i */
    /* loaded from: classes3.dex */
    public static final class C0330i extends Lambda implements Function1<Pair<? extends ReleaseValidationResult, ? extends List<? extends ReleaseValidationResult>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$consume$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
        /* renamed from: Av4$i$a */
        /* loaded from: classes3.dex */
        public static final class C0331a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

            /* renamed from: g */
            public final /* synthetic */ ReleaseValidationResult f1402g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0331a(ReleaseValidationResult releaseValidationResult) {
                super(1);
                this.f1402g = releaseValidationResult;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34146Kv4 invoke(C34146Kv4 state) {
                C34146Kv4 m98142n;
                Intrinsics.checkNotNullParameter(state, "state");
                m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : false, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                m98142n.m98143C(this.f1402g.getFailureReason());
                return m98142n;
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$consume$3\n*L\n1#1,328:1\n110#2:329\n*E\n"})
        /* renamed from: Av4$i$b */
        /* loaded from: classes3.dex */
        public static final class C0332b<T> implements Comparator {

            /* renamed from: b */
            public final /* synthetic */ ReleaseValidationResult f1403b;

            public C0332b(ReleaseValidationResult releaseValidationResult) {
                this.f1403b = releaseValidationResult;
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(Intrinsics.areEqual(((ReleaseValidationResult) t2).getBirdId(), this.f1403b.getBirdId())), Boolean.valueOf(Intrinsics.areEqual(((ReleaseValidationResult) t).getBirdId(), this.f1403b.getBirdId())));
                return compareValues;
            }
        }

        public C0330i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends ReleaseValidationResult, ? extends List<? extends ReleaseValidationResult>> pair) {
            invoke2((Pair<ReleaseValidationResult, ? extends List<ReleaseValidationResult>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<ReleaseValidationResult, ? extends List<ReleaseValidationResult>> pair) {
            boolean z;
            List listOf;
            List sortedWith;
            ReleaseValidationResult component1 = pair.component1();
            List<ReleaseValidationResult> component2 = pair.component2();
            if (component1.getFailureReason() != null) {
                C31806Av4.this.m42279i(new C0331a(component1));
                return;
            }
            List<ReleaseValidationResult> list = component2;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (ReleaseValidationResult releaseValidationResult : list) {
                    if (Intrinsics.areEqual(releaseValidationResult.getBirdId(), component1.getBirdId())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                C45168ma4 c45168ma4 = C31806Av4.this.f1372n;
                sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C0332b(component1));
                c45168ma4.accept(sortedWith);
                return;
            }
            C45168ma4 c45168ma42 = C31806Av4.this.f1372n;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(component1);
            spreadBuilder.addSpread(component2.toArray(new ReleaseValidationResult[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new ReleaseValidationResult[spreadBuilder.size()]));
            c45168ma42.accept(listOf);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u008f\u0001\u0010\u0007\u001a\u008a\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0003*D\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireNest;", "kotlin.jvm.PlatformType", "", "", "Lco/bird/android/model/wire/ReleaseValidationResult;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$j */
    /* loaded from: classes3.dex */
    public static final class C0333j extends Lambda implements Function1<Triple<? extends Optional<WireNest>, ? extends Optional<Boolean>, ? extends List<? extends ReleaseValidationResult>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Av4$j$a */
        /* loaded from: classes3.dex */
        public static final class C0334a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

            /* renamed from: g */
            public final /* synthetic */ Optional<WireNest> f1405g;

            /* renamed from: h */
            public final /* synthetic */ Optional<Boolean> f1406h;

            /* renamed from: i */
            public final /* synthetic */ List<ReleaseValidationResult> f1407i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0334a(Optional<WireNest> optional, Optional<Boolean> optional2, List<ReleaseValidationResult> list) {
                super(1);
                this.f1405g = optional;
                this.f1406h = optional2;
                this.f1407i = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34146Kv4 invoke(C34146Kv4 state) {
                C34146Kv4 m98142n;
                Intrinsics.checkNotNullParameter(state, "state");
                WireNest m59035e = this.f1405g.m59035e();
                boolean booleanValue = this.f1406h.m59036d(Boolean.TRUE).booleanValue();
                List<ReleaseValidationResult> validatedItems = this.f1407i;
                Intrinsics.checkNotNullExpressionValue(validatedItems, "validatedItems");
                boolean z = !validatedItems.isEmpty();
                List<ReleaseValidationResult> validatedItems2 = this.f1407i;
                Intrinsics.checkNotNullExpressionValue(validatedItems2, "validatedItems");
                m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : m59035e, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : validatedItems2, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : z, (r30 & 32) != 0 ? state.f20376f : booleanValue, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                return m98142n;
            }
        }

        public C0333j() {
            super(1);
        }

        /* renamed from: a */
        public final void m114860a(Triple<Optional<WireNest>, Optional<Boolean>, ? extends List<ReleaseValidationResult>> triple) {
            C31806Av4.this.m42279i(new C0334a(triple.component1(), triple.component2(), triple.component3()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<WireNest>, ? extends Optional<Boolean>, ? extends List<? extends ReleaseValidationResult>> triple) {
            m114860a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$k */
    /* loaded from: classes3.dex */
    public static final class C0335k extends Lambda implements Function1<Unit, Optional<String>> {

        /* renamed from: g */
        public static final C0335k f1408g = new C0335k();

        public C0335k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<String> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Optional.f63040c.m59034a();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Av4$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0336l extends FunctionReferenceImpl implements Function1<String, Optional<String>> {

        /* renamed from: b */
        public static final C0336l f1409b = new C0336l();

        public C0336l() {
            super(1, Optional.class, "<init>", "<init>(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<String> invoke(String str) {
            return new Optional<>(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ReleaseResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/ReleaseResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$consume$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n1774#2,4:361\n*S KotlinDebug\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$consume$7\n*L\n155#1:361,4\n*E\n"})
    /* renamed from: Av4$m */
    /* loaded from: classes3.dex */
    public static final class C0337m extends Lambda implements Function1<ReleaseResponse, Unit> {
        public C0337m() {
            super(1);
        }

        /* renamed from: a */
        public final void m114856a(ReleaseResponse releaseResponse) {
            int i;
            boolean z;
            InterfaceC40099e13 interfaceC40099e13 = C31806Av4.this.f1364f;
            InterfaceC40099e13.EnumC19925b enumC19925b = InterfaceC40099e13.EnumC19925b.RESULT_OK;
            Pair<String, ?>[] pairArr = new Pair[1];
            List<WireReleaseItem> releases = releaseResponse.getReleases();
            if ((releases instanceof Collection) && releases.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (WireReleaseItem wireReleaseItem : releases) {
                    if (wireReleaseItem.getFailureReason() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            pairArr[0] = TuplesKt.m28425to("nest_release_count", Integer.valueOf(i));
            interfaceC40099e13.mo37077W0(enumC19925b, pairArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ReleaseResponse releaseResponse) {
            m114856a(releaseResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005 \u0006*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/ReleaseValidationResult;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Av4$n */
    /* loaded from: classes3.dex */
    public static final class C0338n extends Lambda implements Function1<Pair<? extends ReleaseValidationResult, ? extends List<? extends ReleaseValidationResult>>, Unit> {
        public C0338n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends ReleaseValidationResult, ? extends List<? extends ReleaseValidationResult>> pair) {
            invoke2((Pair<ReleaseValidationResult, ? extends List<ReleaseValidationResult>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<ReleaseValidationResult, ? extends List<ReleaseValidationResult>> pair) {
            List minus;
            List<ReleaseValidationResult> validatedItems = pair.component2();
            C45168ma4 c45168ma4 = C31806Av4.this.f1372n;
            Intrinsics.checkNotNullExpressionValue(validatedItems, "validatedItems");
            minus = CollectionsKt___CollectionsKt.minus(validatedItems, pair.component1());
            c45168ma4.accept(minus);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Ljava/io/File;", "file", "Lio/reactivex/K;", "Lco/bird/android/model/FileUploadReceipt;", "kotlin.jvm.PlatformType", "c", "(Ljava/io/File;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$o */
    /* loaded from: classes3.dex */
    public static final class C0339o extends Lambda implements Function1<File, InterfaceC23447K<? extends FileUploadReceipt>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Av4$o$a */
        /* loaded from: classes3.dex */
        public static final class C0340a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C31806Av4 f1413g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Av4$o$a$a */
            /* loaded from: classes3.dex */
            public static final class C0341a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

                /* renamed from: g */
                public static final C0341a f1414g = new C0341a();

                public C0341a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C34146Kv4 invoke(C34146Kv4 state) {
                    C34146Kv4 m98142n;
                    Intrinsics.checkNotNullParameter(state, "state");
                    m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : false, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                    return m98142n;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0340a(C31806Av4 c31806Av4) {
                super(1);
                this.f1413g = c31806Av4;
            }

            /* renamed from: a */
            public final void m114851a(InterfaceC23465c interfaceC23465c) {
                this.f1413g.m42279i(C0341a.f1414g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m114851a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/FileUploadReceipt;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "t", "", C17296a.f69688o, "(Lco/bird/android/model/FileUploadReceipt;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Av4$o$b */
        /* loaded from: classes3.dex */
        public static final class C0342b extends Lambda implements Function2<FileUploadReceipt, Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ File f1415g;

            /* renamed from: h */
            public final /* synthetic */ C31806Av4 f1416h;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Av4$o$b$a */
            /* loaded from: classes3.dex */
            public static final class C0343a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

                /* renamed from: g */
                public static final C0343a f1417g = new C0343a();

                public C0343a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C34146Kv4 invoke(C34146Kv4 state) {
                    C34146Kv4 m98142n;
                    Intrinsics.checkNotNullParameter(state, "state");
                    m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : true, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                    return m98142n;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0342b(File file, C31806Av4 c31806Av4) {
                super(2);
                this.f1415g = file;
                this.f1416h = c31806Av4;
            }

            /* renamed from: a */
            public final void m114849a(FileUploadReceipt fileUploadReceipt, Throwable th) {
                this.f1415g.delete();
                if (th != null) {
                    this.f1416h.m42279i(C0343a.f1417g);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(FileUploadReceipt fileUploadReceipt, Throwable th) {
                m114849a(fileUploadReceipt, th);
                return Unit.INSTANCE;
            }
        }

        public C0339o() {
            super(1);
        }

        /* renamed from: d */
        public static final void m114852d(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj, obj2);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends FileUploadReceipt> invoke(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            C31806Av4 c31806Av4 = C31806Av4.this;
            AbstractC23442F m114917h0 = c31806Av4.m114917h0(c31806Av4.f1368j.mo28674h(file, ContentKind.PNG, UploadKind.DROP_PHOTOS, Folder.DROP_PHOTOS));
            final C0340a c0340a = new C0340a(C31806Av4.this);
            AbstractC23442F m33102v = m114917h0.m33102v(new InterfaceC23484g() { // from class: Fv4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C31806Av4.C0339o.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C0342b c0342b = new C0342b(file, C31806Av4.this);
            return m33102v.m33104u(new InterfaceC23479b() { // from class: Gv4
                @Override // io.reactivex.functions.InterfaceC23479b
                public final void accept(Object obj, Object obj2) {
                    C31806Av4.C0339o.m114852d(Function2.this, obj, obj2);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "nestIdOptional", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireNest;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$p */
    /* loaded from: classes3.dex */
    public static final class C0344p extends Lambda implements Function1<Optional<String>, InterfaceC23447K<? extends Optional<WireNest>>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Av4$p$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0345a extends FunctionReferenceImpl implements Function1<WireNest, Optional<WireNest>> {

            /* renamed from: b */
            public static final C0345a f1419b = new C0345a();

            public C0345a() {
                super(1, Optional.class, "<init>", "<init>(Ljava/lang/Object;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<WireNest> invoke(WireNest wireNest) {
                return new Optional<>(wireNest);
            }
        }

        public C0344p() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m114845c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Optional<WireNest>> invoke(Optional<String> nestIdOptional) {
            Intrinsics.checkNotNullParameter(nestIdOptional, "nestIdOptional");
            String m59035e = nestIdOptional.m59035e();
            if (m59035e != null) {
                C31806Av4 c31806Av4 = C31806Av4.this;
                AbstractC23442F m33146T = c31806Av4.m114917h0(c31806Av4.f1366h.mo10890k(m59035e)).m33146T(3L);
                final C0345a c0345a = C0345a.f1419b;
                AbstractC23442F m33157I = m33146T.m33157I(new InterfaceC23492o() { // from class: Hv4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Optional m114845c;
                        m114845c = C31806Av4.C0344p.m114845c(Function1.this, obj);
                        return m114845c;
                    }
                });
                if (m33157I != null) {
                    return m33157I;
                }
            }
            return AbstractC23442F.m33158H(Optional.f63040c.m59034a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$onError$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
    /* renamed from: Av4$q */
    /* loaded from: classes3.dex */
    public static final class C0346q extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f1420g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0346q(Throwable th) {
            super(1);
            this.f1420g = th;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C34146Kv4 invoke(C34146Kv4 state) {
            C34146Kv4 m98142n;
            Intrinsics.checkNotNullParameter(state, "state");
            m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : false, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
            m98142n.m98145A(this.f1420g);
            return m98142n;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$r */
    /* loaded from: classes3.dex */
    public static final class C0347r extends Lambda implements Function1<InterfaceC23465c, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Av4$r$a */
        /* loaded from: classes3.dex */
        public static final class C0348a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

            /* renamed from: g */
            public static final C0348a f1422g = new C0348a();

            public C0348a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34146Kv4 invoke(C34146Kv4 state) {
                C34146Kv4 m98142n;
                Intrinsics.checkNotNullParameter(state, "state");
                m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : state.m98139q() + 1, (r30 & 16) != 0 ? state.f20375e : false, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                return m98142n;
            }
        }

        public C0347r() {
            super(1);
        }

        /* renamed from: a */
        public final void m114842a(InterfaceC23465c interfaceC23465c) {
            C31806Av4.this.m42279i(C0348a.f1422g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114842a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$s */
    /* loaded from: classes3.dex */
    public static final class C0349s extends Lambda implements Function2<T, Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Av4$s$a */
        /* loaded from: classes3.dex */
        public static final class C0350a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

            /* renamed from: g */
            public static final C0350a f1424g = new C0350a();

            public C0350a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34146Kv4 invoke(C34146Kv4 state) {
                C34146Kv4 m98142n;
                Intrinsics.checkNotNullParameter(state, "state");
                m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : state.m98139q() - 1, (r30 & 16) != 0 ? state.f20375e : false, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                return m98142n;
            }
        }

        public C0349s() {
            super(2);
        }

        /* renamed from: a */
        public final void m114840a(T t, Throwable th) {
            C31806Av4.this.m42279i(C0350a.f1424g);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
            m114840a(obj, th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter\n*L\n1#1,304:1\n248#2:305\n*E\n"})
    /* renamed from: Av4$t */
    /* loaded from: classes3.dex */
    public static final class C0351t<T1, T2, R> implements InterfaceC23480c<Optional<String>, List<? extends ReleaseValidationResult>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Optional<String> optional, List<? extends ReleaseValidationResult> list) {
            return (R) TuplesKt.m28425to(optional, list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T", "T1", "T2", "T3", "R", "t", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$5\n+ 2 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter\n*L\n1#1,304:1\n270#2:305\n*E\n"})
    /* renamed from: Av4$u */
    /* loaded from: classes3.dex */
    public static final class C0352u<T1, T2, T3, T4, R> implements InterfaceC23486i<Pair<? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>>, T1, T2, T3, R> {
        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(Pair<? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>> pair, T1 t1, T2 t2, T3 t3) {
            Optional optional = (Optional) t2;
            Optional optional2 = (Optional) t1;
            Pair<? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>> pair2 = pair;
            return (R) new C35631Re4(pair2.getFirst(), pair2.getSecond(), optional2, optional, (Optional) t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012Z\u0010\u0002\u001aV\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \b**\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "", "Lco/bird/android/model/wire/ReleaseValidationResult;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$release$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n1726#2,3:361\n*S KotlinDebug\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$release$2\n*L\n252#1:361,3\n*E\n"})
    /* renamed from: Av4$v */
    /* loaded from: classes3.dex */
    public static final class C0353v extends Lambda implements Function1<Pair<? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>>, Unit> {
        public C0353v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>> pair) {
            invoke2((Pair<Optional<String>, ? extends List<ReleaseValidationResult>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<String>, ? extends List<ReleaseValidationResult>> pair) {
            Optional<String> component1 = pair.component1();
            List<ReleaseValidationResult> validatedItems = pair.component2();
            Intrinsics.checkNotNullExpressionValue(validatedItems, "validatedItems");
            List<ReleaseValidationResult> list = validatedItems;
            boolean z = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!((ReleaseValidationResult) it.next()).getRequiresLocationVerification()) {
                        z = false;
                        break;
                    }
                }
            }
            if (!z || component1.m59037c()) {
                return;
            }
            InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(C31806Av4.this.f1364f, C31806Av4.this.f1370l, C31806Av4.this.f1371m, null, 10026, null, false, 52, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\t0\t \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\b2z\u0010\u0007\u001av\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"LRe4;", "Lco/bird/android/buava/Optional;", "", "", "Lco/bird/android/model/wire/ReleaseValidationResult;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/api/response/ReleaseResponse;", "b", "(LRe4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$release$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1603#2,9:361\n1855#2:370\n1856#2:372\n1612#2:373\n1#3:371\n*S KotlinDebug\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$release$5\n*L\n277#1:361,9\n277#1:370\n277#1:372\n277#1:373\n277#1:371\n*E\n"})
    /* renamed from: Av4$x */
    /* loaded from: classes3.dex */
    public static final class C0355x extends Lambda implements Function1<C35631Re4<? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>, ? extends Optional<String>, ? extends Optional<String>, ? extends Optional<Boolean>>, InterfaceC23447K<? extends ReleaseResponse>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Av4$x$a */
        /* loaded from: classes3.dex */
        public static final class C0356a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C31806Av4 f1428g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LKv4;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LKv4;)LKv4;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Av4$x$a$a */
            /* loaded from: classes3.dex */
            public static final class C0357a extends Lambda implements Function1<C34146Kv4, C34146Kv4> {

                /* renamed from: g */
                public static final C0357a f1429g = new C0357a();

                public C0357a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C34146Kv4 invoke(C34146Kv4 state) {
                    C34146Kv4 m98142n;
                    Intrinsics.checkNotNullParameter(state, "state");
                    m98142n = state.m98142n((r30 & 1) != 0 ? state.f20371a : null, (r30 & 2) != 0 ? state.f20372b : false, (r30 & 4) != 0 ? state.f20373c : null, (r30 & 8) != 0 ? state.f20374d : 0, (r30 & 16) != 0 ? state.f20375e : false, (r30 & 32) != 0 ? state.f20376f : false, (r30 & 64) != 0 ? state.f20377g : null, (r30 & 128) != 0 ? state.f20378h : null, (r30 & 256) != 0 ? state.f20379i : null, (r30 & 512) != 0 ? state.f20380j : null, (r30 & 1024) != 0 ? state.f20381k : null, (r30 & 2048) != 0 ? state.f20382l : null, (r30 & 4096) != 0 ? state.f20383m : null, (r30 & 8192) != 0 ? state.f20384n : null);
                    return m98142n;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0356a(C31806Av4 c31806Av4) {
                super(1);
                this.f1428g = c31806Av4;
            }

            /* renamed from: a */
            public final void m114835a(InterfaceC23465c interfaceC23465c) {
                this.f1428g.m42279i(C0357a.f1429g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m114835a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        public C0355x() {
            super(1);
        }

        /* renamed from: c */
        public static final void m114836c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends ReleaseResponse> invoke(C35631Re4<Optional<String>, ? extends List<ReleaseValidationResult>, Optional<String>, Optional<String>, Optional<Boolean>> c35631Re4) {
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            Optional<String> m86500a = c35631Re4.m86500a();
            List<ReleaseValidationResult> validatedItems = c35631Re4.m86499b();
            C31806Av4 c31806Av4 = C31806Av4.this;
            InterfaceC48430s43 interfaceC48430s43 = c31806Av4.f1366h;
            String str = C31806Av4.this.f1371m;
            String m59035e = c35631Re4.m86498c().m59035e();
            String m59035e2 = c35631Re4.m86497d().m59035e();
            Boolean m59035e3 = c35631Re4.m86496e().m59035e();
            Intrinsics.checkNotNullExpressionValue(validatedItems, "validatedItems");
            ArrayList arrayList = new ArrayList();
            for (ReleaseValidationResult releaseValidationResult : validatedItems) {
                String birdId = releaseValidationResult.getBirdId();
                if (birdId != null) {
                    arrayList.add(birdId);
                }
            }
            AbstractC23442F m114917h0 = c31806Av4.m114917h0(interfaceC48430s43.mo10894g(str, m59035e, m59035e2, m59035e3, arrayList, m86500a.m59035e()));
            final C0356a c0356a = new C0356a(C31806Av4.this);
            return m114917h0.m33102v(new InterfaceC23484g() { // from class: Iv4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C31806Av4.C0355x.m114836c(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/api/response/ReleaseResponse;", "response", "", C17296a.f69688o, "(Lco/bird/api/response/ReleaseResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Av4$y */
    /* loaded from: classes3.dex */
    public static final class C0358y extends Lambda implements Function1<ReleaseResponse, Boolean> {

        /* renamed from: g */
        public static final C0358y f1430g = new C0358y();

        public C0358y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(ReleaseResponse response) {
            boolean z;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.getReleasePhotoUrl() == null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Av4$z */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0359z extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C0359z(Object obj) {
            super(1, obj, C31806Av4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C31806Av4) this.receiver).m114918g0(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31806Av4(InterfaceC40099e13 navigator, InterfaceC40001dr4 locationManager, InterfaceC48430s43 nestManager, DQ3 permissionManager, InterfaceC40476ef6 uploadManager, C36207Tq4 reactiveConfig, PhotoBannerViewModel photoBannerViewModel) {
        super(new C34146Kv4(null, false, null, 0, false, false, null, null, null, null, null, null, null, null, 16383, null), null, 2, null);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(nestManager, "nestManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(uploadManager, "uploadManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(photoBannerViewModel, "photoBannerViewModel");
        this.f1364f = navigator;
        this.f1365g = locationManager;
        this.f1366h = nestManager;
        this.f1367i = permissionManager;
        this.f1368j = uploadManager;
        this.f1369k = reactiveConfig;
        this.f1370l = photoBannerViewModel;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f1371m = uuid;
        C45168ma4<List<ReleaseValidationResult>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<List<ReleaseValidationResult>>()");
        this.f1372n = m25409g;
        C45168ma4<String> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<String>()");
        this.f1373o = m25409g2;
    }

    /* renamed from: Q */
    public static final InterfaceC24574u m114935Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final InterfaceC24574u m114933S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC24574u m114931U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final InterfaceC23447K m114929W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final String m114928X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23434B m114927Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m114926Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m114925a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final Optional m114924b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final Optional m114923c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m114922d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m114921e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m114920f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23447K m114919f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m114916i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m114915j0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj, obj2);
    }

    /* renamed from: l0 */
    public static final void m114913l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final boolean m114912m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: n0 */
    public static final InterfaceC23447K m114911n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final boolean m114909o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: p0 */
    public static final void m114907p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m114905q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final String m114901s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final void m114899t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final boolean m114897u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: v0 */
    public static final InterfaceC23447K m114895v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m114893w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public final Observable<Boolean> m114936P(Observable<Boolean> observable) {
        final C0313a c0313a = new C0313a();
        Observable flatMapMaybe = observable.flatMapMaybe(new InterfaceC23492o() { // from class: pv4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m114935Q;
                m114935Q = C31806Av4.m114935Q(Function1.this, obj);
                return m114935Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "private fun Observable<B…ed -> !mocked }\n    }\n  }");
        return flatMapMaybe;
    }

    /* renamed from: R */
    public final Observable<Boolean> m114934R(Observable<Unit> observable) {
        final C0317b c0317b = new C0317b();
        Observable flatMapMaybe = observable.flatMapMaybe(new InterfaceC23492o() { // from class: bv4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m114933S;
                m114933S = C31806Av4.m114933S(Function1.this, obj);
                return m114933S;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "private fun Observable<U…ss -> success }\n    }\n  }");
        return flatMapMaybe;
    }

    /* renamed from: T */
    public final Observable<Boolean> m114932T(Observable<Boolean> observable) {
        final C0321c c0321c = new C0321c();
        Observable flatMapMaybe = observable.flatMapMaybe(new InterfaceC23492o() { // from class: hv4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m114931U;
                m114931U = C31806Av4.m114931U(Function1.this, obj);
                return m114931U;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "private fun Observable<B…t(true)\n      }\n    }\n  }");
        return flatMapMaybe;
    }

    @Override // p000.C22600hE, p000.AbstractC20169f1
    /* renamed from: V */
    public void consume(InterfaceC33912Jv4 renderer) {
        List<ReleaseValidationResult> emptyList;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume((C31806Av4) renderer);
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f1369k.m82627f4(), this.f1369k.m82691Z5(), this.f1369k.m82628f3(), renderer.mo57636z2(), C0323d.f1391a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…> Quad(t1, t2, t3, t4) })");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0325f c0325f = new C0325f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Xu4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31806Av4.m114920f(Function1.this, obj);
            }
        });
        Observable<Optional<String>> mo57657N = renderer.mo57657N();
        final C0344p c0344p = new C0344p();
        AbstractC24495a nest = mo57657N.flatMapSingle(new InterfaceC23492o() { // from class: qv4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m114929W;
                m114929W = C31806Av4.m114929W(Function1.this, obj);
                return m114929W;
            }
        }).publish();
        Observable<String> mo54815T = renderer.mo54815T();
        final C0328h c0328h = new C0328h();
        Observable<R> flatMap = mo54815T.flatMap(new InterfaceC23492o() { // from class: rv4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m114927Y;
                m114927Y = C31806Av4.m114927Y(Function1.this, obj);
                return m114927Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "override fun consume(ren…)\n\n    nest.connect()\n  }");
        Intrinsics.checkNotNullExpressionValue(nest, "nest");
        Object m33094as2 = m114903r0(flatMap, nest, renderer).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0330i c0330i = new C0330i();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: sv4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31806Av4.m114926Z(Function1.this, obj);
            }
        });
        Observable<Optional<Boolean>> mo57639t4 = renderer.mo57639t4();
        C45168ma4<List<ReleaseValidationResult>> c45168ma4 = this.f1372n;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<ReleaseValidationResult>> startWith = c45168ma4.startWith((C45168ma4<List<ReleaseValidationResult>>) emptyList);
        Intrinsics.checkNotNullExpressionValue(startWith, "validatedItemsRelay.star…leaseValidationResult>())");
        Observable combineLatest2 = Observable.combineLatest(nest, mo57639t4, startWith, C0324e.f1392a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
        Object m33094as3 = combineLatest2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0333j c0333j = new C0333j();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: tv4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31806Av4.m114925a0(Function1.this, obj);
            }
        });
        Observable<Unit> mo57656V2 = renderer.mo57656V2();
        final C0335k c0335k = C0335k.f1408g;
        InterfaceC23434B map = mo57656V2.map(new InterfaceC23492o() { // from class: uv4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m114924b0;
                m114924b0 = C31806Av4.m114924b0(Function1.this, obj);
                return m114924b0;
            }
        });
        C45168ma4<String> c45168ma42 = this.f1373o;
        final C0336l c0336l = C0336l.f1409b;
        Observable<Optional<String>> merge = Observable.merge(map, c45168ma42.map(new InterfaceC23492o() { // from class: vv4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m114923c0;
                m114923c0 = C31806Av4.m114923c0(Function1.this, obj);
                return m114923c0;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      renderer.re…lay.map(::Optional)\n    )");
        Object m33094as4 = m114914k0(merge, renderer).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0337m c0337m = new C0337m();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: wv4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31806Av4.m114922d0(Function1.this, obj);
            }
        });
        Object m33094as5 = C24527f.m31950a(renderer.mo57661H1(), this.f1372n).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0338n c0338n = new C0338n();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: xv4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31806Av4.m114921e0(Function1.this, obj);
            }
        });
        Observable<File> mo57652e3 = renderer.mo57652e3();
        final C0339o c0339o = new C0339o();
        Observable<R> flatMapSingle = mo57652e3.flatMapSingle(new InterfaceC23492o() { // from class: Yu4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m114919f0;
                m114919f0 = C31806Av4.m114919f0(Function1.this, obj);
                return m114919f0;
            }
        });
        final C0327g c0327g = C0327g.f1398g;
        Observable map2 = flatMapSingle.map(new InterfaceC23492o() { // from class: iv4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m114928X;
                m114928X = C31806Av4.m114928X(Function1.this, obj);
                return m114928X;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "override fun consume(ren…)\n\n    nest.connect()\n  }");
        Object m33094as6 = map2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as6).subscribe(this.f1373o);
        Object m33094as7 = m114936P(m114932T(m114934R(renderer.mo57644n2()))).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as7).subscribe();
        nest.m32087e();
    }

    /* renamed from: g0 */
    public final void m114918g0(Throwable th) {
        C41318g46.m40159e(th);
        m42279i(new C0346q(th));
    }

    /* renamed from: h0 */
    public final <T> AbstractC23442F<T> m114917h0(AbstractC23442F<T> abstractC23442F) {
        final C0347r c0347r = new C0347r();
        AbstractC23442F<T> m33102v = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: Zu4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31806Av4.m114916i0(Function1.this, obj);
            }
        });
        final C0349s c0349s = new C0349s();
        AbstractC23442F<T> m33104u = m33102v.m33104u(new InterfaceC23479b() { // from class: av4
            @Override // io.reactivex.functions.InterfaceC23479b
            public final void accept(Object obj, Object obj2) {
                C31806Av4.m114915j0(Function2.this, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33104u, "private fun <T>Single<T>…oading - 1) }\n      }\n  }");
        return m33104u;
    }

    /* renamed from: k0 */
    public final Observable<ReleaseResponse> m114914k0(Observable<Optional<String>> observable, InterfaceC33912Jv4 interfaceC33912Jv4) {
        List<ReleaseValidationResult> emptyList;
        C45168ma4<List<ReleaseValidationResult>> c45168ma4 = this.f1372n;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<ReleaseValidationResult>> startWith = c45168ma4.startWith((C45168ma4<List<ReleaseValidationResult>>) emptyList);
        Intrinsics.checkNotNullExpressionValue(startWith, "validatedItemsRelay.star…leaseValidationResult>())");
        Observable<R> withLatestFrom = observable.withLatestFrom(startWith, new C0351t());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        final C0353v c0353v = new C0353v();
        Observable doOnNext = withLatestFrom.doOnNext(new InterfaceC23484g() { // from class: jv4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31806Av4.m114913l0(Function1.this, obj);
            }
        });
        final C0354w c0354w = C0354w.f1426g;
        Observable filter = doOnNext.filter(new InterfaceC23494q() { // from class: kv4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m114912m0;
                m114912m0 = C31806Av4.m114912m0(Function1.this, obj);
                return m114912m0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "private fun Observable<O…     }\n      .retry()\n  }");
        Observable withLatestFrom2 = filter.withLatestFrom(interfaceC33912Jv4.mo57657N(), interfaceC33912Jv4.mo57636z2(), interfaceC33912Jv4.mo57639t4(), new C0352u());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom2, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        final C0355x c0355x = new C0355x();
        Observable flatMapSingle = withLatestFrom2.flatMapSingle(new InterfaceC23492o() { // from class: lv4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m114911n0;
                m114911n0 = C31806Av4.m114911n0(Function1.this, obj);
                return m114911n0;
            }
        });
        final C0358y c0358y = C0358y.f1430g;
        Observable filter2 = flatMapSingle.filter(new InterfaceC23494q() { // from class: mv4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m114909o0;
                m114909o0 = C31806Av4.m114909o0(Function1.this, obj);
                return m114909o0;
            }
        });
        final C0359z c0359z = new C0359z(this);
        Observable doOnError = filter2.doOnError(new InterfaceC23484g() { // from class: nv4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31806Av4.m114907p0(Function1.this, obj);
            }
        });
        final C0304A c0304a = new C0304A();
        Observable<ReleaseResponse> retry = doOnError.doOnError(new InterfaceC23484g() { // from class: ov4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31806Av4.m114905q0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun Observable<O…     }\n      .retry()\n  }");
        return retry;
    }

    /* renamed from: r0 */
    public final Observable<Pair<ReleaseValidationResult, List<ReleaseValidationResult>>> m114903r0(Observable<String> observable, Observable<Optional<WireNest>> observable2, InterfaceC33912Jv4 interfaceC33912Jv4) {
        List<ReleaseValidationResult> emptyList;
        List<ReleaseValidationResult> emptyList2;
        final C0307C c0307c = C0307C.f1376g;
        Observable<R> map = observable.map(new InterfaceC23492o() { // from class: cv4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m114901s0;
                m114901s0 = C31806Av4.m114901s0(Function1.this, obj);
                return m114901s0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map { raw -> Regex.getSc…mRegexMatch(raw) ?: raw }");
        Observable<Optional<String>> mo57636z2 = interfaceC33912Jv4.mo57636z2();
        C45168ma4<List<ReleaseValidationResult>> c45168ma4 = this.f1372n;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<ReleaseValidationResult>> startWith = c45168ma4.startWith((C45168ma4<List<ReleaseValidationResult>>) emptyList);
        Intrinsics.checkNotNullExpressionValue(startWith, "validatedItemsRelay.star…leaseValidationResult>())");
        Observable withLatestFrom = map.withLatestFrom(observable2, mo57636z2, startWith, new C0306B());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        final C0308D c0308d = new C0308D();
        Observable doOnNext = withLatestFrom.doOnNext(new InterfaceC23484g() { // from class: dv4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31806Av4.m114899t0(Function1.this, obj);
            }
        });
        final C0310E c0310e = C0310E.f1379g;
        Observable filter = doOnNext.filter(new InterfaceC23494q() { // from class: ev4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m114897u0;
                m114897u0 = C31806Av4.m114897u0(Function1.this, obj);
                return m114897u0;
            }
        });
        final C0311F c0311f = new C0311F();
        Observable flatMapSingle = filter.flatMapSingle(new InterfaceC23492o() { // from class: fv4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m114895v0;
                m114895v0 = C31806Av4.m114895v0(Function1.this, obj);
                return m114895v0;
            }
        });
        final C0312G c0312g = new C0312G(this);
        Observable retry = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: gv4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31806Av4.m114893w0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun Observable<S…ValidationResult>()))\n  }");
        C45168ma4<List<ReleaseValidationResult>> c45168ma42 = this.f1372n;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<ReleaseValidationResult>> startWith2 = c45168ma42.startWith((C45168ma4<List<ReleaseValidationResult>>) emptyList2);
        Intrinsics.checkNotNullExpressionValue(startWith2, "validatedItemsRelay.star…leaseValidationResult>())");
        return C24527f.m31950a(retry, startWith2);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "", "Lco/bird/android/model/wire/ReleaseValidationResult;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$release$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n1747#2,3:361\n*S KotlinDebug\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$release$3\n*L\n264#1:361,3\n*E\n"})
    /* renamed from: Av4$w */
    /* loaded from: classes3.dex */
    public static final class C0354w extends Lambda implements Function1<Pair<? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>>, Boolean> {

        /* renamed from: g */
        public static final C0354w f1426g = new C0354w();

        public C0354w() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Optional<String>, ? extends List<ReleaseValidationResult>> pair) {
            boolean z;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<ReleaseValidationResult> validatedItems = pair.component2();
            boolean z2 = true;
            if (!pair.component1().m59037c()) {
                Intrinsics.checkNotNullExpressionValue(validatedItems, "validatedItems");
                List<ReleaseValidationResult> list = validatedItems;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (ReleaseValidationResult releaseValidationResult : list) {
                        if (!releaseValidationResult.getRequiresLocationVerification()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z2 = false;
                }
            }
            return Boolean.valueOf(z2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Optional<String>, ? extends List<? extends ReleaseValidationResult>> pair) {
            return invoke2((Pair<Optional<String>, ? extends List<ReleaseValidationResult>>) pair);
        }
    }
}
