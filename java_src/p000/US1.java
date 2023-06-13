package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import android.net.Uri;
import androidx.camera.core.C11154e;
import androidx.camera.core.InterfaceC11183i;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RequirementsResult;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23447K;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34451Md3;
import p000.C37791a94;
import p000.C42290hj1;
import p000.C46615p06;
import p000.C50784w26;
import p000.US1;
@Metadata(m28433d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 U2\u00020\u0001:\u0003.49B\u0007¢\u0006\u0004\bS\u0010TJ\"\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J1\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\"\u0004\b\u0000\u0010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016H\u0002J2\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001e0\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aJ>\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0&0\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aJ\u0010\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0017R'\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0-0,8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0-038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105RF\u0010;\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f 8*\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u001e078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010/\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010/\u001a\u0004\bN\u0010OR$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006V"}, m28432d2 = {"LUS1;", "Landroidx/camera/core/e$a;", "Lg32;", Entry.TYPE_IMAGE, "Lio/reactivex/F;", "LUS1$b;", "", "LU11;", "y", "Lp06;", "A", "Ldj1;", "w", "Landroid/graphics/Rect;", "imageSize", "", "faceResults", "textResult", "", "x", "(Landroid/graphics/Rect;Ljava/util/List;Lp06;)Ljava/lang/Float;", "T", "Lkotlin/Function0;", "Lcom/google/android/gms/tasks/Task;", "task", "z", "Lkotlin/Function1;", "LUS1$c;", "Lco/bird/android/model/RequirementsResult;", "requirementsPredicate", "Lkotlin/Triple;", "Landroid/graphics/Bitmap;", "B", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/net/Uri;", "uri", "satisfiesRequirementsPredicate", "Lkotlin/Pair;", "m", "Landroidx/camera/core/i;", "imageProxy", "", DateTokenConverter.CONVERTER_KEY, "LZ84;", "Lco/bird/android/buava/Optional;", C17296a.f69688o, "Lkotlin/Lazy;", "v", "()LZ84;", "results", "La94;", "b", "La94;", "mutableScanResults", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "validScanResults", "LMd3;", "LMd3;", "objectOptions", "LLd3;", "e", "u", "()LLd3;", "objectDetector", "Lv26;", "f", "Lv26;", "textRecognition", "Lhj1;", "g", "Lhj1;", "faceOptions", "Lgj1;", "h", "t", "()Lgj1;", "faceDetector", "i", "Lkotlin/jvm/functions/Function1;", "<init>", "()V", "j", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationAnalyzer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAnalyzer.kt\nco/bird/android/widget/scan/analyzer/IdentificationAnalyzer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1603#2,9:247\n1855#2:256\n1856#2:258\n1612#2:259\n2824#2,8:260\n1#3:257\n1#3:268\n*S KotlinDebug\n*F\n+ 1 IdentificationAnalyzer.kt\nco/bird/android/widget/scan/analyzer/IdentificationAnalyzer\n*L\n216#1:247,9\n216#1:256\n216#1:258\n216#1:259\n217#1:260,8\n216#1:257\n*E\n"})
/* renamed from: US1 */
/* loaded from: classes4.dex */
public final class US1 implements C11154e.InterfaceC11155a {

    /* renamed from: j */
    public static final C8282a f37397j = new C8282a(null);

    /* renamed from: a */
    public final Lazy f37398a;

    /* renamed from: b */
    public final C37791a94<Optional<C8284c>> f37399b;

    /* renamed from: c */
    public final C45168ma4<Triple<C8284c, RequirementsResult, Bitmap>> f37400c;

    /* renamed from: d */
    public final C34451Md3 f37401d;

    /* renamed from: e */
    public final Lazy f37402e;

    /* renamed from: f */
    public final InterfaceC50191v26 f37403f;

    /* renamed from: g */
    public final C42290hj1 f37404g;

    /* renamed from: h */
    public final Lazy f37405h;

    /* renamed from: i */
    public Function1<? super C8284c, RequirementsResult> f37406i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LUS1$a;", "", "", "DETECTED_IMAGE_BITMAP_PADDING", "I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: US1$a */
    /* loaded from: classes4.dex */
    public static final class C8282a {
        public /* synthetic */ C8282a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8282a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b#\u0010$JR\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006%"}, m28432d2 = {"LUS1$c;", "", "Landroid/graphics/Rect;", "imageSize", "", "LU11;", "objectResults", "Ldj1;", "faceResults", "Lp06;", "textResult", "", "landmarkWidthRatio", C17296a.f69688o, "(Landroid/graphics/Rect;Ljava/util/List;Ljava/util/List;Lp06;Ljava/lang/Float;)LUS1$c;", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/graphics/Rect;", "c", "()Landroid/graphics/Rect;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "Lp06;", "f", "()Lp06;", "Ljava/lang/Float;", "()Ljava/lang/Float;", "<init>", "(Landroid/graphics/Rect;Ljava/util/List;Ljava/util/List;Lp06;Ljava/lang/Float;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: US1$c */
    /* loaded from: classes4.dex */
    public static final class C8284c {

        /* renamed from: a */
        public final Rect f37409a;

        /* renamed from: b */
        public final List<U11> f37410b;

        /* renamed from: c */
        public final List<C39919dj1> f37411c;

        /* renamed from: d */
        public final C46615p06 f37412d;

        /* renamed from: e */
        public final Float f37413e;

        public C8284c() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ C8284c copy$default(C8284c c8284c, Rect rect, List list, List list2, C46615p06 c46615p06, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                rect = c8284c.f37409a;
            }
            List<U11> list3 = list;
            if ((i & 2) != 0) {
                list3 = c8284c.f37410b;
            }
            List list4 = list3;
            List<C39919dj1> list5 = list2;
            if ((i & 4) != 0) {
                list5 = c8284c.f37411c;
            }
            List list6 = list5;
            if ((i & 8) != 0) {
                c46615p06 = c8284c.f37412d;
            }
            C46615p06 c46615p062 = c46615p06;
            if ((i & 16) != 0) {
                f = c8284c.f37413e;
            }
            return c8284c.m81514a(rect, list4, list6, c46615p062, f);
        }

        /* renamed from: a */
        public final C8284c m81514a(Rect imageSize, List<? extends U11> objectResults, List<? extends C39919dj1> faceResults, C46615p06 c46615p06, Float f) {
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            Intrinsics.checkNotNullParameter(objectResults, "objectResults");
            Intrinsics.checkNotNullParameter(faceResults, "faceResults");
            return new C8284c(imageSize, objectResults, faceResults, c46615p06, f);
        }

        /* renamed from: b */
        public final List<C39919dj1> m81513b() {
            return this.f37411c;
        }

        /* renamed from: c */
        public final Rect m81512c() {
            return this.f37409a;
        }

        /* renamed from: d */
        public final Float m81511d() {
            return this.f37413e;
        }

        /* renamed from: e */
        public final List<U11> m81510e() {
            return this.f37410b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8284c) {
                C8284c c8284c = (C8284c) obj;
                return Intrinsics.areEqual(this.f37409a, c8284c.f37409a) && Intrinsics.areEqual(this.f37410b, c8284c.f37410b) && Intrinsics.areEqual(this.f37411c, c8284c.f37411c) && Intrinsics.areEqual(this.f37412d, c8284c.f37412d) && Intrinsics.areEqual((Object) this.f37413e, (Object) c8284c.f37413e);
            }
            return false;
        }

        /* renamed from: f */
        public final C46615p06 m81509f() {
            return this.f37412d;
        }

        public int hashCode() {
            int hashCode = ((((this.f37409a.hashCode() * 31) + this.f37410b.hashCode()) * 31) + this.f37411c.hashCode()) * 31;
            C46615p06 c46615p06 = this.f37412d;
            int hashCode2 = (hashCode + (c46615p06 == null ? 0 : c46615p06.hashCode())) * 31;
            Float f = this.f37413e;
            return hashCode2 + (f != null ? f.hashCode() : 0);
        }

        public String toString() {
            Rect rect = this.f37409a;
            List<U11> list = this.f37410b;
            List<C39919dj1> list2 = this.f37411c;
            C46615p06 c46615p06 = this.f37412d;
            Float f = this.f37413e;
            return "Result(imageSize=" + rect + ", objectResults=" + list + ", faceResults=" + list2 + ", textResult=" + c46615p06 + ", landmarkWidthRatio=" + f + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C8284c(Rect imageSize, List<? extends U11> objectResults, List<? extends C39919dj1> faceResults, C46615p06 c46615p06, Float f) {
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            Intrinsics.checkNotNullParameter(objectResults, "objectResults");
            Intrinsics.checkNotNullParameter(faceResults, "faceResults");
            this.f37409a = imageSize;
            this.f37410b = objectResults;
            this.f37411c = faceResults;
            this.f37412d = c46615p06;
            this.f37413e = f;
        }

        public /* synthetic */ C8284c(Rect rect, List list, List list2, C46615p06 c46615p06, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Rect() : rect, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 8) != 0 ? null : c46615p06, (i & 16) != 0 ? null : f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lg32;", Entry.TYPE_IMAGE, "Lio/reactivex/K;", "Lkotlin/Pair;", "LUS1$c;", "Lco/bird/android/model/RequirementsResult;", "kotlin.jvm.PlatformType", "c", "(Lg32;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$d */
    /* loaded from: classes4.dex */
    public static final class C8285d extends Lambda implements Function1<C41304g32, InterfaceC23447K<? extends Pair<? extends C8284c, ? extends RequirementsResult>>> {

        /* renamed from: h */
        public final /* synthetic */ Function1<C8284c, RequirementsResult> f37415h;

        @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00002\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"LUS1$b;", "Lp06;", Entry.TYPE_TEXT, "", "Ldj1;", "faces", "LU11;", "objects", "LUS1$c;", C17296a.f69688o, "(LUS1$b;LUS1$b;LUS1$b;)LUS1$c;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: US1$d$a */
        /* loaded from: classes4.dex */
        public static final class C8286a extends Lambda implements Function3<C8283b<C46615p06>, C8283b<List<C39919dj1>>, C8283b<List<U11>>, C8284c> {

            /* renamed from: g */
            public final /* synthetic */ C41304g32 f37416g;

            /* renamed from: h */
            public final /* synthetic */ US1 f37417h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8286a(C41304g32 c41304g32, US1 us1) {
                super(3);
                this.f37416g = c41304g32;
                this.f37417h = us1;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: a */
            public final C8284c invoke(C8283b<C46615p06> text, C8283b<List<C39919dj1>> faces, C8283b<List<U11>> objects) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(faces, "faces");
                Intrinsics.checkNotNullParameter(objects, "objects");
                Rect rect = new Rect(0, 0, this.f37416g.m40237l(), this.f37416g.m40241h());
                List<C39919dj1> m81515a = faces.m81515a();
                if (m81515a == null) {
                    m81515a = CollectionsKt__CollectionsKt.emptyList();
                }
                List<C39919dj1> list = m81515a;
                C46615p06 m81515a2 = text.m81515a();
                List<U11> m81515a3 = objects.m81515a();
                if (m81515a3 == null) {
                    m81515a3 = CollectionsKt__CollectionsKt.emptyList();
                }
                return new C8284c(rect, m81515a3, list, m81515a2, this.f37417h.m81518x(rect, list, m81515a2));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LUS1$c;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Pair;", "Lco/bird/android/model/RequirementsResult;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LUS1$c;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: US1$d$b */
        /* loaded from: classes4.dex */
        public static final class C8287b extends Lambda implements Function1<C8284c, Pair<? extends C8284c, ? extends RequirementsResult>> {

            /* renamed from: g */
            public final /* synthetic */ Function1<C8284c, RequirementsResult> f37418g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C8287b(Function1<? super C8284c, RequirementsResult> function1) {
                super(1);
                this.f37418g = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<C8284c, RequirementsResult> invoke(C8284c result) {
                RequirementsResult requirementsResult;
                Intrinsics.checkNotNullParameter(result, "result");
                Function1<C8284c, RequirementsResult> function1 = this.f37418g;
                if (function1 == null || (requirementsResult = function1.invoke(result)) == null) {
                    requirementsResult = new RequirementsResult(null, null, null, null, 15, null);
                }
                return TuplesKt.m28425to(result, requirementsResult);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8285d(Function1<? super C8284c, RequirementsResult> function1) {
            super(1);
            this.f37415h = function1;
        }

        /* renamed from: d */
        public static final C8284c m81505d(Function3 tmp0, Object obj, Object obj2, Object obj3) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C8284c) tmp0.invoke(obj, obj2, obj3);
        }

        /* renamed from: e */
        public static final Pair m81504e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<C8284c, RequirementsResult>> invoke(C41304g32 image) {
            Intrinsics.checkNotNullParameter(image, "image");
            AbstractC23442F m81541A = US1.this.m81541A(image);
            AbstractC23442F m81519w = US1.this.m81519w(image);
            AbstractC23442F m81517y = US1.this.m81517y(image);
            final C8286a c8286a = new C8286a(image, US1.this);
            AbstractC23442F m33152N = AbstractC23442F.m33111q0(m81541A, m81519w, m81517y, new InterfaceC23485h() { // from class: VS1
                @Override // io.reactivex.functions.InterfaceC23485h
                public final Object apply(Object obj, Object obj2, Object obj3) {
                    US1.C8284c m81505d;
                    m81505d = US1.C8285d.m81505d(Function3.this, obj, obj2, obj3);
                    return m81505d;
                }
            }).m33152N(C24542a.m31934a());
            final C8287b c8287b = new C8287b(this.f37415h);
            return m33152N.m33157I(new InterfaceC23492o() { // from class: WS1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m81504e;
                    m81504e = US1.C8285d.m81504e(Function1.this, obj);
                    return m81504e;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00002\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"LUS1$b;", "Lp06;", Entry.TYPE_TEXT, "", "Ldj1;", "faces", "LU11;", "objects", "LUS1$c;", C17296a.f69688o, "(LUS1$b;LUS1$b;LUS1$b;)LUS1$c;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$e */
    /* loaded from: classes4.dex */
    public static final class C8288e extends Lambda implements Function3<C8283b<C46615p06>, C8283b<List<C39919dj1>>, C8283b<List<U11>>, C8284c> {

        /* renamed from: g */
        public final /* synthetic */ C41304g32 f37419g;

        /* renamed from: h */
        public final /* synthetic */ US1 f37420h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8288e(C41304g32 c41304g32, US1 us1) {
            super(3);
            this.f37419g = c41304g32;
            this.f37420h = us1;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final C8284c invoke(C8283b<C46615p06> text, C8283b<List<C39919dj1>> faces, C8283b<List<U11>> objects) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(faces, "faces");
            Intrinsics.checkNotNullParameter(objects, "objects");
            Rect rect = new Rect(0, 0, this.f37419g.m40237l(), this.f37419g.m40241h());
            List<C39919dj1> m81515a = faces.m81515a();
            if (m81515a == null) {
                m81515a = CollectionsKt__CollectionsKt.emptyList();
            }
            List<C39919dj1> list = m81515a;
            C46615p06 m81515a2 = text.m81515a();
            List<U11> m81515a3 = objects.m81515a();
            if (m81515a3 == null) {
                m81515a3 = CollectionsKt__CollectionsKt.emptyList();
            }
            return new C8284c(rect, m81515a3, list, m81515a2, this.f37420h.m81518x(rect, list, m81515a2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LUS1$c;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(LUS1$c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$f */
    /* loaded from: classes4.dex */
    public static final class C8289f extends Lambda implements Function1<C8284c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC11183i f37422h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8289f(InterfaceC11183i interfaceC11183i) {
            super(1);
            this.f37422h = interfaceC11183i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
            if (r0.isSatisfied() == true) goto L8;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m81500a(C8284c result) {
            RequirementsResult requirementsResult;
            boolean z;
            Function1 function1 = US1.this.f37406i;
            if (function1 != null) {
                Intrinsics.checkNotNullExpressionValue(result, "result");
                requirementsResult = (RequirementsResult) function1.invoke(result);
            } else {
                requirementsResult = null;
            }
            if (requirementsResult != null) {
                z = true;
            }
            z = false;
            if (z) {
                C41318g46.m40163a("satisfiesRequirementsPredicate met, attempting to parse bitmap", new Object[0]);
                try {
                    US1.this.f37400c.accept(new Triple(result, requirementsResult, C25708lU.m27248a(this.f37422h, null, 90, 16)));
                } catch (Exception e) {
                    C41318g46.m40161c(e, "exception while parsing bitmap in identification analyzer, ignoring: ", new Object[0]);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C8284c c8284c) {
            m81500a(c8284c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LUS1$c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LUS1$c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$g */
    /* loaded from: classes4.dex */
    public static final class C8290g extends Lambda implements Function1<C8284c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC11183i f37424h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8290g(InterfaceC11183i interfaceC11183i) {
            super(1);
            this.f37424h = interfaceC11183i;
        }

        /* renamed from: a */
        public final void m81499a(C8284c it) {
            C37791a94 c37791a94 = US1.this.f37399b;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c37791a94.accept(c14443a.m59032c(it));
            this.f37424h.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C8284c c8284c) {
            m81499a(c8284c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: US1$h */
    /* loaded from: classes4.dex */
    public static final class C8291h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC11183i f37426h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8291h(InterfaceC11183i interfaceC11183i) {
            super(1);
            this.f37426h = interfaceC11183i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while processing image", new Object[0]);
            US1.this.f37399b.accept(Optional.f63040c.m59034a());
            this.f37426h.close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lgj1;", "b", "()Lgj1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$i */
    /* loaded from: classes4.dex */
    public static final class C8292i extends Lambda implements Function0<InterfaceC41697gj1> {
        public C8292i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC41697gj1 invoke() {
            return C41104fj1.m40998a(US1.this.f37404g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LLd3;", "b", "()LLd3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$j */
    /* loaded from: classes4.dex */
    public static final class C8293j extends Lambda implements Function0<InterfaceC34217Ld3> {
        public C8293j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC34217Ld3 invoke() {
            return C33983Kd3.m98637a(US1.this.f37401d);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/android/gms/tasks/Task;", "", "Ldj1;", "b", "()Lcom/google/android/gms/tasks/Task;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$k */
    /* loaded from: classes4.dex */
    public static final class C8294k extends Lambda implements Function0<Task<List<C39919dj1>>> {

        /* renamed from: h */
        public final /* synthetic */ C41304g32 f37430h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8294k(C41304g32 c41304g32) {
            super(0);
            this.f37430h = c41304g32;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Task<List<C39919dj1>> invoke() {
            Task<List<C39919dj1>> mo37869h = US1.this.m81522t().mo37869h(this.f37430h);
            Intrinsics.checkNotNullExpressionValue(mo37869h, "faceDetector.process(image)");
            return mo37869h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/android/gms/tasks/Task;", "", "LU11;", "b", "()Lcom/google/android/gms/tasks/Task;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$l */
    /* loaded from: classes4.dex */
    public static final class C8295l extends Lambda implements Function0<Task<List<U11>>> {

        /* renamed from: h */
        public final /* synthetic */ C41304g32 f37432h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8295l(C41304g32 c41304g32) {
            super(0);
            this.f37432h = c41304g32;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Task<List<U11>> invoke() {
            Task<List<U11>> mo46752h = US1.this.m81521u().mo46752h(this.f37432h);
            Intrinsics.checkNotNullExpressionValue(mo46752h, "objectDetector.process(image)");
            return mo46752h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/H;", "LUS1$b;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$m */
    /* loaded from: classes4.dex */
    public static final class C8296m extends Lambda implements Function1<InterfaceC23444H<C8283b<T>>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Task<T>> f37433g;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: US1$m$a */
        /* loaded from: classes4.dex */
        public static final class C8297a extends Lambda implements Function1<T, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<C8283b<T>> f37434g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8297a(InterfaceC23444H<C8283b<T>> interfaceC23444H) {
                super(1);
                this.f37434g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C8297a) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
                this.f37434g.onSuccess(new C8283b(t, null, 2, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8296m(Function0<? extends Task<T>> function0) {
            super(1);
            this.f37433g = function0;
        }

        /* renamed from: c */
        public static final void m81492c(InterfaceC23444H emitter, Exception it) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40159e(it);
            emitter.onSuccess(new C8283b(null, it));
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((InterfaceC23444H) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(final InterfaceC23444H<C8283b<T>> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            final C8297a c8297a = new C8297a(emitter);
            ((Task) this.f37433g.invoke()).addOnSuccessListener(new OnSuccessListener() { // from class: XS1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    US1.C8296m.invoke$lambda$0(Function1.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: YS1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    US1.C8296m.m81492c(InterfaceC23444H.this, exc);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/google/android/gms/tasks/Task;", "Lp06;", "b", "()Lcom/google/android/gms/tasks/Task;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$n */
    /* loaded from: classes4.dex */
    public static final class C8298n extends Lambda implements Function0<Task<C46615p06>> {

        /* renamed from: h */
        public final /* synthetic */ C41304g32 f37436h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8298n(C41304g32 c41304g32) {
            super(0);
            this.f37436h = c41304g32;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Task<C46615p06> invoke() {
            Task<C46615p06> mo9280h = US1.this.f37403f.mo9280h(this.f37436h);
            Intrinsics.checkNotNullExpressionValue(mo9280h, "textRecognition.process(image)");
            return mo9280h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "LUS1$c;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$o */
    /* loaded from: classes4.dex */
    public static final class C8299o extends Lambda implements Function0<Z84<Optional<C8284c>>> {
        public C8299o() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<C8284c>> invoke() {
            return Z84.f47888d.m73663b(US1.this.f37399b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: US1$p */
    /* loaded from: classes4.dex */
    public static final class C8300p extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Function1<C8284c, RequirementsResult> f37439h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8300p(Function1<? super C8284c, RequirementsResult> function1) {
            super(1);
            this.f37439h = function1;
        }

        /* renamed from: a */
        public final void m81490a(InterfaceC23465c interfaceC23465c) {
            US1.this.f37406i = this.f37439h;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m81490a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    public US1() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new C8299o());
        this.f37398a = lazy;
        this.f37399b = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
        C45168ma4<Triple<C8284c, RequirementsResult, Bitmap>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Triple<Identifica…rementsResult, Bitmap>>()");
        this.f37400c = m25409g;
        C34451Md3 m95103f = new C34451Md3.C5325a().m95102g(2).m95103f();
        Intrinsics.checkNotNullExpressionValue(m95103f, "Builder()\n    .setDetect…_IMAGE_MODE)\n    .build()");
        this.f37401d = m95103f;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C8293j());
        this.f37402e = lazy2;
        InterfaceC50191v26 m10948a = C49599u26.m10948a(new C50784w26.C29743a().m7544a());
        Intrinsics.checkNotNullExpressionValue(m10948a, "getClient(TextRecognizerOptions.Builder().build())");
        this.f37403f = m10948a;
        C42290hj1 m35947a = new C42290hj1.C22712a().m35943e(1).m35944d(1).m35946b(1).m35945c(1).m35947a();
        Intrinsics.checkNotNullExpressionValue(m35947a, "Builder()\n    .setPerfor…R_MODE_NONE)\n    .build()");
        this.f37404g = m35947a;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C8292i());
        this.f37405h = lazy3;
    }

    /* renamed from: C */
    public static final void m81539C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m81538D(US1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37406i = null;
    }

    /* renamed from: n */
    public static final C41304g32 m81528n(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(uri, "$uri");
        return C41304g32.m40247b(context, uri);
    }

    /* renamed from: o */
    public static final InterfaceC23447K m81527o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final C8284c m81526p(Function3 tmp0, Object obj, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C8284c) tmp0.invoke(obj, obj2, obj3);
    }

    /* renamed from: q */
    public static final void m81525q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m81524r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m81523s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final AbstractC23442F<C8283b<C46615p06>> m81541A(C41304g32 c41304g32) {
        return m81516z(new C8298n(c41304g32));
    }

    /* renamed from: B */
    public final AbstractC23442F<Triple<C8284c, RequirementsResult, Bitmap>> m81540B(Function1<? super C8284c, RequirementsResult> requirementsPredicate) {
        Intrinsics.checkNotNullParameter(requirementsPredicate, "requirementsPredicate");
        C45168ma4<Triple<C8284c, RequirementsResult, Bitmap>> c45168ma4 = this.f37400c;
        final C8300p c8300p = new C8300p(requirementsPredicate);
        AbstractC23442F<Triple<C8284c, RequirementsResult, Bitmap>> firstOrError = c45168ma4.doOnSubscribe(new InterfaceC23484g() { // from class: OS1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                US1.m81539C(Function1.this, obj);
            }
        }).doOnDispose(new InterfaceC23478a() { // from class: PS1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                US1.m81538D(US1.this);
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "fun waitForMatchingImage…      .firstOrError()\n  }");
        return firstOrError;
    }

    @Override // androidx.camera.core.C11154e.InterfaceC11155a
    @SuppressLint({"UnsafeExperimentalUsageError", "CheckResult"})
    /* renamed from: d */
    public void mo968d(InterfaceC11183i imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Image mo69479k3 = imageProxy.mo69479k3();
        if (mo69479k3 != null) {
            try {
                C41304g32 m40246c = C41304g32.m40246c(mo69479k3, imageProxy.mo40428i1().mo3253c());
                Intrinsics.checkNotNullExpressionValue(m40246c, "try {\n          InputIma…         return\n        }");
                AbstractC23442F<C8283b<C46615p06>> m81541A = m81541A(m40246c);
                AbstractC23442F<C8283b<List<C39919dj1>>> m81519w = m81519w(m40246c);
                AbstractC23442F<C8283b<List<U11>>> m81517y = m81517y(m40246c);
                final C8288e c8288e = new C8288e(m40246c, this);
                AbstractC23442F m33152N = AbstractC23442F.m33111q0(m81541A, m81519w, m81517y, new InterfaceC23485h() { // from class: QS1
                    @Override // io.reactivex.functions.InterfaceC23485h
                    public final Object apply(Object obj, Object obj2, Object obj3) {
                        US1.C8284c m81526p;
                        m81526p = US1.m81526p(Function3.this, obj, obj2, obj3);
                        return m81526p;
                    }
                }).m33152N(C24542a.m31934a());
                final C8289f c8289f = new C8289f(imageProxy);
                AbstractC23442F m33148R = m33152N.m33101w(new InterfaceC23484g() { // from class: RS1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        US1.m81525q(Function1.this, obj);
                    }
                }).m33152N(C23454a.m33087a()).m33140a0(500L, TimeUnit.MILLISECONDS).m33148R(new C8284c(null, null, null, null, null, 31, null));
                final C8290g c8290g = new C8290g(imageProxy);
                InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: SS1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        US1.m81524r(Function1.this, obj);
                    }
                };
                final C8291h c8291h = new C8291h(imageProxy);
                m33148R.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: TS1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        US1.m81523s(Function1.this, obj);
                    }
                });
            } catch (Exception e) {
                C41318g46.m40158f(e, "error in identification analyzer while decoding media image: ", new Object[0]);
                imageProxy.close();
            }
        }
    }

    /* renamed from: m */
    public final AbstractC23442F<Pair<C8284c, RequirementsResult>> m81529m(final Context context, final Uri uri, Function1<? super C8284c, RequirementsResult> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: MS1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C41304g32 m81528n;
                m81528n = US1.m81528n(context, uri);
                return m81528n;
            }
        });
        final C8285d c8285d = new C8285d(function1);
        AbstractC23442F<Pair<C8284c, RequirementsResult>> m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: NS1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m81527o;
                m81527o = US1.m81527o(Function1.this, obj);
                return m81527o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "fun analyze(\n    context…t\n          }\n      }\n  }");
        return m33165A;
    }

    /* renamed from: t */
    public final InterfaceC41697gj1 m81522t() {
        return (InterfaceC41697gj1) this.f37405h.getValue();
    }

    /* renamed from: u */
    public final InterfaceC34217Ld3 m81521u() {
        return (InterfaceC34217Ld3) this.f37402e.getValue();
    }

    /* renamed from: v */
    public final Z84<Optional<C8284c>> m81520v() {
        return (Z84) this.f37398a.getValue();
    }

    /* renamed from: w */
    public final AbstractC23442F<C8283b<List<C39919dj1>>> m81519w(C41304g32 c41304g32) {
        return m81516z(new C8294k(c41304g32));
    }

    /* renamed from: x */
    public final Float m81518x(Rect rect, List<? extends C39919dj1> list, C46615p06 c46615p06) {
        Rect rect2;
        Object firstOrNull;
        Rect m43852a;
        List<C46615p06.C27123e> m20166b;
        Object previous;
        if (c46615p06 != null && (m20166b = c46615p06.m20166b()) != null) {
            ArrayList arrayList = new ArrayList();
            for (C46615p06.C27123e c27123e : m20166b) {
                Rect m20164a = c27123e.m20164a();
                if (m20164a != null) {
                    arrayList.add(m20164a);
                }
            }
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            if (!listIterator.hasPrevious()) {
                previous = null;
            } else {
                previous = listIterator.previous();
                while (listIterator.hasPrevious()) {
                    Rect rect3 = (Rect) listIterator.previous();
                    rect3.union((Rect) previous);
                    previous = rect3;
                }
            }
            rect2 = (Rect) previous;
        } else {
            rect2 = null;
        }
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
        C39919dj1 c39919dj1 = (C39919dj1) firstOrNull;
        if (c39919dj1 != null && (m43852a = c39919dj1.m43852a()) != null && rect2 != null) {
            rect2.union(m43852a);
        }
        if (rect2 == null) {
            return null;
        }
        return Float.valueOf(rect2.width() / rect.width());
    }

    /* renamed from: y */
    public final AbstractC23442F<C8283b<List<U11>>> m81517y(C41304g32 c41304g32) {
        return m81516z(new C8295l(c41304g32));
    }

    /* renamed from: z */
    public final <T> AbstractC23442F<C8283b<T>> m81516z(Function0<? extends Task<T>> function0) {
        return C45832nh5.m23305k(new C8296m(function0));
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\b\u0010\r\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LUS1$b;", "T", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/Object;", "()Ljava/lang/Object;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "b", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "exception", "<init>", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: US1$b */
    /* loaded from: classes4.dex */
    public static final class C8283b<T> {

        /* renamed from: a */
        public final T f37407a;

        /* renamed from: b */
        public final Throwable f37408b;

        public C8283b(T t, Throwable th) {
            this.f37407a = t;
            this.f37408b = th;
        }

        /* renamed from: a */
        public final T m81515a() {
            return this.f37407a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8283b) {
                C8283b c8283b = (C8283b) obj;
                return Intrinsics.areEqual(this.f37407a, c8283b.f37407a) && Intrinsics.areEqual(this.f37408b, c8283b.f37408b);
            }
            return false;
        }

        public int hashCode() {
            T t = this.f37407a;
            int hashCode = (t == null ? 0 : t.hashCode()) * 31;
            Throwable th = this.f37408b;
            return hashCode + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            T t = this.f37407a;
            Throwable th = this.f37408b;
            return "ProcessResult(result=" + t + ", exception=" + th + ")";
        }

        public /* synthetic */ C8283b(Object obj, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? null : th);
        }
    }
}
