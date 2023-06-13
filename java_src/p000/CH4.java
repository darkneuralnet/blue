package p000;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.imageupload.worker.UpdatePhotosWorker;
import co.bird.android.model.ComplaintOption;
import co.bird.android.model.ComplaintSection;
import co.bird.android.model.ComplaintSectionType;
import co.bird.android.model.ComplaintType;
import co.bird.android.model.Folder;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LocationSelectionModel;
import co.bird.android.model.PhotoSavedModel;
import co.bird.android.model.analytics.CommunityModeAddressChanged;
import co.bird.android.model.analytics.CommunityModeBadParkingSubmitted;
import co.bird.android.model.analytics.CommunityModeBadRidingSubmitted;
import co.bird.android.model.analytics.CommunityModeDamageSubmitted;
import co.bird.android.model.analytics.CommunityModePhotoAdded;
import co.bird.android.model.analytics.CommunityModeScanAdded;
import co.bird.android.model.analytics.LegacyAnalyticsEvent;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import co.bird.android.retakeablephoto.RetakeablePhotoActivity;
import co.bird.api.request.ComplaintSchemaType;
import co.bird.api.response.Complaint;
import co.bird.api.response.ComplaintSchemaResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.CH4;
import p000.InterfaceC40099e13;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u0097\u00012\u00020\u0001:\u0001\u001eBu\b\u0007\u0012\u0006\u0010G\u001a\u00020E\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u000e\b\u0001\u0010\\\u001a\b\u0012\u0004\u0012\u00020Y0X\u0012\b\b\u0001\u0010`\u001a\u00020]\u0012\b\b\u0001\u0010d\u001a\u00020a\u0012\b\b\u0001\u0010h\u001a\u00020e\u0012\b\b\u0001\u0010l\u001a\u00020i\u0012\b\b\u0001\u0010p\u001a\u00020m¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0016\u0010\u0011\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\f\u0010\u0015\u001a\u00020\u0014*\u00020\nH\u0002J\u0012\u0010\u0016\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\"\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010#\u001a\u00020\u0002H\u0016J%\u0010'\u001a\u00020\u00022\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$2\u0006\u0010&\u001a\u00020\u0004H\u0000¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u00020\u00022\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$2\u0006\u0010&\u001a\u00020\u0004H\u0000¢\u0006\u0004\b)\u0010(JZ\u00103\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\n2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\b\u00100\u001a\u0004\u0018\u00010\u00042\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u0001010\u0012H\u0016J?\u00108\u001a\b\u0012\u0004\u0012\u00020\u0006042\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u0006042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0006042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000604H\u0001¢\u0006\u0004\b8\u00109J\b\u0010:\u001a\u00020\u0002H\u0016J\u0017\u0010;\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b;\u0010<J?\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u0001010?2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040=2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0012H\u0000¢\u0006\u0004\b@\u0010AJ\u0010\u0010D\u001a\u00020\u00022\u0006\u0010C\u001a\u00020BH\u0017R\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010+\u001a\u0010\u0012\f\u0012\n r*\u0004\u0018\u00010*0*0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\"\u0010v\u001a\u0010\u0012\f\u0012\n r*\u0004\u0018\u00010\u00040\u00040q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010tR\"\u00105\u001a\u0010\u0012\f\u0012\n r*\u0004\u0018\u00010\u00060\u00060w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\"\u00106\u001a\u0010\u0012\f\u0012\n r*\u0004\u0018\u00010\u00060\u00060w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010yR\"\u00107\u001a\u0010\u0012\f\u0012\n r*\u0004\u0018\u00010\u00060\u00060w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010yR\"\u0010}\u001a\u0010\u0012\f\u0012\n r*\u0004\u0018\u00010\u00060\u00060q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010tR\"\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010\u007fR\"\u0010\u0083\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0080\u0001\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R*\u0010\u0087\u0001\u001a\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010\u0088\u0001R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b8\u0010\u008b\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0088\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\fR)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f0\u008f\u0001j\t\u0012\u0004\u0012\u00020\u000f`\u0090\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b@\u0010\u0091\u0001R\u0017\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0013\u0010\u0092\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010\u0093\u0001¨\u0006\u0098\u0001"}, m28432d2 = {"LCH4;", "LiH4;", "", "G", "", "option", "", "selected", "S", "b0", "Lco/bird/android/model/ComplaintType;", "type", "I", "u", "", "Lco/bird/android/model/ComplaintSection;", "sections", "F", "", "A", "", "E", "y", "birdId", "B", "completed", "W", "Landroid/content/Intent;", "intent", "photoStoragePath", C17296a.f69688o, "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "T", "", "selectedOptions", "value", "R", "(Ljava/util/Set;Ljava/lang/String;)V", "U", "Lco/bird/android/model/wire/WireLocation;", "location", "Lco/bird/android/model/constant/MapMode;", "role", "complaintType", "photoUrls", "rideId", "", "reasonsAndMessages", "X", "Lio/reactivex/Observable;", "photoAdded", "birdScanned", "noQrCodeSelected", "w", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;", "onDestroy", "V", "(Lco/bird/android/model/ComplaintType;)V", "", "valueToPropertyMap", "", "z", "(Ljava/util/Set;Ljava/util/Map;)Ljava/util/Map;", "LcT;", "event", "onEvent", "LKp0;", "LKp0;", "communityManager", "Ldr4;", "b", "Ldr4;", "reactiveLocationManager", "LEa;", "c", "LEa;", "analyticsManager", "Landroid/os/Handler;", DateTokenConverter.CONVERTER_KEY, "Landroid/os/Handler;", "handler", "LTq4;", "e", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "f", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LEg1;", "g", "LEg1;", "eventBus", "LHH4;", "h", "LHH4;", "ui", "LDQ3;", "i", "LDQ3;", "permissionManager", "Le13;", "j", "Le13;", "navigator", "LoY1;", "k", "LoY1;", "imageUploader", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "l", "Lio/reactivex/subjects/d;", "m", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lio/reactivex/subjects/a;", "n", "Lio/reactivex/subjects/a;", "o", "p", "q", "stepTwoCompleted", "r", "Ljava/util/Map;", "Lco/bird/android/model/ComplaintOption;", "s", "Ljava/util/List;", "complaintOptions", "Lkotlin/Pair;", "t", "Lkotlin/Pair;", "textComplaintSection", "Ljava/lang/String;", "v", "Ljava/util/Set;", "Lco/bird/android/model/constant/MapMode;", "x", "birdCode", "numImages", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "Lco/bird/android/model/ComplaintType;", "Z", "fromTaskList", "<init>", "(LKp0;Ldr4;LEa;Landroid/os/Handler;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;LHH4;LDQ3;Le13;LoY1;)V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportPresenter.kt\nco/bird/android/app/feature/reportcomplaint/ReportPresenterImpl\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 7 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 8 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,492:1\n6#2:493\n1#3:494\n1#3:501\n13#4,2:495\n15#4,2:499\n1109#5,2:497\n180#6:502\n180#6:503\n180#6:505\n180#6:508\n180#6:509\n180#6:510\n180#6:512\n180#6:514\n199#6:515\n180#6:516\n180#6:519\n199#6:547\n252#7:504\n22#8,2:506\n41#8,2:517\n1855#9:511\n1856#9:513\n2624#9,3:520\n766#9:523\n857#9,2:524\n1549#9:526\n1620#9,2:527\n1549#9:529\n1620#9,3:530\n1179#9,2:533\n1253#9,4:535\n1855#9,2:539\n1747#9,2:541\n1747#9,3:543\n1749#9:546\n*S KotlinDebug\n*F\n+ 1 ReportPresenter.kt\nco/bird/android/app/feature/reportcomplaint/ReportPresenterImpl\n*L\n129#1:493\n129#1:494\n129#1:495,2\n129#1:499,2\n129#1:497,2\n152#1:502\n175#1:503\n182#1:505\n198#1:508\n204#1:509\n208#1:510\n280#1:512\n318#1:514\n334#1:515\n374#1:516\n385#1:519\n467#1:547\n181#1:504\n194#1:506,2\n380#1:517,2\n278#1:511\n278#1:513\n406#1:520,3\n415#1:523\n415#1:524,2\n416#1:526\n416#1:527,2\n416#1:529\n416#1:530,3\n418#1:533,2\n418#1:535,4\n424#1:539,2\n444#1:541,2\n445#1:543,3\n444#1:546\n*E\n"})
/* renamed from: CH4 */
/* loaded from: classes2.dex */
public final class CH4 implements InterfaceC42625iH4 {

    /* renamed from: C */
    public static final C0982a f3827C = new C0982a(null);

    /* renamed from: D */
    public static final int f3828D = 8;

    /* renamed from: A */
    public ComplaintType f3829A;

    /* renamed from: B */
    public boolean f3830B;

    /* renamed from: a */
    public final InterfaceC34088Kp0 f3831a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f3832b;

    /* renamed from: c */
    public final InterfaceC1880Ea f3833c;

    /* renamed from: d */
    public final Handler f3834d;

    /* renamed from: e */
    public final C36207Tq4 f3835e;

    /* renamed from: f */
    public final LifecycleScopeProvider<EnumC7097RE> f3836f;

    /* renamed from: g */
    public final InterfaceC32604Eg1 f3837g;

    /* renamed from: h */
    public final HH4 f3838h;

    /* renamed from: i */
    public final DQ3 f3839i;

    /* renamed from: j */
    public final InterfaceC40099e13 f3840j;

    /* renamed from: k */
    public final InterfaceC46333oY1 f3841k;

    /* renamed from: l */
    public final C24558d<WireLocation> f3842l;

    /* renamed from: m */
    public final C24558d<String> f3843m;

    /* renamed from: n */
    public final C24552a<Boolean> f3844n;

    /* renamed from: o */
    public final C24552a<Boolean> f3845o;

    /* renamed from: p */
    public final C24552a<Boolean> f3846p;

    /* renamed from: q */
    public final C24558d<Boolean> f3847q;

    /* renamed from: r */
    public Map<String, String> f3848r;

    /* renamed from: s */
    public List<ComplaintOption> f3849s;

    /* renamed from: t */
    public Pair<String, String> f3850t;

    /* renamed from: u */
    public String f3851u;

    /* renamed from: v */
    public final Set<String> f3852v;

    /* renamed from: w */
    public MapMode f3853w;

    /* renamed from: x */
    public String f3854x;

    /* renamed from: y */
    public int f3855y;

    /* renamed from: z */
    public ArrayList<ComplaintSection> f3856z;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LCH4$a;", "", "", "CHANGE_LOCATION_REQUEST", "I", "", "NO_QR_CODE_OPTION_VALUE", "Ljava/lang/String;", "OTHER_OPTION_VALUE", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: CH4$a */
    /* loaded from: classes2.dex */
    public static final class C0982a {
        public /* synthetic */ C0982a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0982a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0983b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ComplaintSectionType.values().length];
            try {
                iArr[ComplaintSectionType.MULTISELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComplaintSectionType.SINGLESELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComplaintSectionType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ComplaintType.values().length];
            try {
                iArr2[ComplaintType.BAD_RIDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ComplaintType.BAD_PARKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ComplaintType.DAMAGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$c */
    /* loaded from: classes2.dex */
    public static final class C0984c extends Lambda implements Function1<Unit, Unit> {
        public C0984c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            CH4.this.m112444T();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T1", "T2", "T3", "R", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$3\n+ 2 ReportPresenter.kt\nco/bird/android/app/feature/reportcomplaint/ReportPresenterImpl\n*L\n1#1,304:1\n381#2:305\n*E\n"})
    /* renamed from: CH4$d */
    /* loaded from: classes2.dex */
    public static final class C0985d<T1, T2, T3, R> implements InterfaceC23485h<T1, T2, T3, R> {
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(T1 t1, T2 t2, T3 t3) {
            boolean z;
            boolean booleanValue = ((Boolean) t3).booleanValue();
            boolean booleanValue2 = ((Boolean) t2).booleanValue();
            if (((Boolean) t1).booleanValue() && (booleanValue2 || booleanValue)) {
                z = true;
            } else {
                z = false;
            }
            return (R) Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$e */
    /* loaded from: classes2.dex */
    public static final class C0986e extends Lambda implements Function1<Boolean, Unit> {
        public C0986e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            HH4 hh4 = CH4.this.f3838h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            hh4.mo102561u2(it.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ComplaintSchemaResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/ComplaintSchemaResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CH4$f */
    /* loaded from: classes2.dex */
    public static final class C0987f extends Lambda implements Function1<ComplaintSchemaResponse, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: CH4$f$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0988a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[ComplaintType.values().length];
                try {
                    iArr[ComplaintType.DAMAGED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ComplaintType.BAD_PARKING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ComplaintType.BAD_RIDING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[ComplaintSectionType.values().length];
                try {
                    iArr2[ComplaintSectionType.MULTISELECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ComplaintSectionType.SINGLESELECT.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[ComplaintSectionType.TEXT.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public C0987f() {
            super(1);
        }

        /* renamed from: a */
        public final void m112407a(ComplaintSchemaResponse complaintSchemaResponse) {
            List<ComplaintSection> damaged;
            List list;
            CH4 ch4 = CH4.this;
            ComplaintType complaintType = ch4.f3829A;
            ComplaintType complaintType2 = null;
            if (complaintType == null) {
                Intrinsics.throwUninitializedPropertyAccessException("type");
                complaintType = null;
            }
            int i = C0988a.$EnumSwitchMapping$0[complaintType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        damaged = CH4.this.f3856z;
                        if (damaged == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sections");
                            damaged = null;
                        }
                    } else {
                        damaged = complaintSchemaResponse.getBadRiding();
                    }
                } else {
                    damaged = complaintSchemaResponse.getBadParking();
                }
            } else {
                damaged = complaintSchemaResponse.getDamaged();
            }
            ch4.f3856z = C44691lm0.m26849a(damaged);
            ArrayList arrayList = CH4.this.f3856z;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sections");
                arrayList = null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ComplaintSection complaintSection = (ComplaintSection) it.next();
                int i2 = C0988a.$EnumSwitchMapping$1[complaintSection.getType().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        CH4.this.f3850t = new Pair(complaintSection.getPlaceholder(), complaintSection.getProperty());
                    }
                } else {
                    CH4 ch42 = CH4.this;
                    List<ComplaintOption> options = complaintSection.getOptions();
                    if (options != null) {
                        list = CollectionsKt___CollectionsKt.toMutableList((Collection) options);
                    } else {
                        list = null;
                    }
                    ch42.f3849s = list;
                }
            }
            HH4 hh4 = CH4.this.f3838h;
            ArrayList arrayList2 = CH4.this.f3856z;
            if (arrayList2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sections");
                arrayList2 = null;
            }
            ComplaintType complaintType3 = CH4.this.f3829A;
            if (complaintType3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("type");
            } else {
                complaintType2 = complaintType3;
            }
            hh4.mo102574Mb(arrayList2, complaintType2);
            CH4.this.m112457G();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ComplaintSchemaResponse complaintSchemaResponse) {
            m112407a(complaintSchemaResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0989g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C0989g f3860b = new C0989g();

        public C0989g() {
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

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$h */
    /* loaded from: classes2.dex */
    public static final class C0990h extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f3862h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0990h(String str) {
            super(1);
            this.f3862h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            CH4 ch4 = CH4.this;
            ArrayList arrayList = ch4.f3856z;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sections");
                arrayList = null;
            }
            if (ch4.m112458F(arrayList)) {
                CH4 ch42 = CH4.this;
                ch42.m112443U(ch42.f3852v, this.f3862h);
                return;
            }
            CH4 ch43 = CH4.this;
            ch43.m112446R(ch43.f3852v, this.f3862h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 ReportPresenter.kt\nco/bird/android/app/feature/reportcomplaint/ReportPresenterImpl\n*L\n1#1,304:1\n195#2:305\n*E\n"})
    /* renamed from: CH4$i */
    /* loaded from: classes2.dex */
    public static final class C0991i<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            boolean z;
            Boolean bool = (Boolean) t2;
            if (((Boolean) t1).booleanValue() && bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            return (R) Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T", "T1", "T2", "R", "t", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$3\n+ 2 ReportPresenter.kt\nco/bird/android/app/feature/reportcomplaint/ReportPresenterImpl\n*L\n1#1,304:1\n181#2:305\n*E\n"})
    /* renamed from: CH4$j */
    /* loaded from: classes2.dex */
    public static final class C0992j<T1, T2, T3, R> implements InterfaceC23485h<Unit, T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(Unit unit, T1 t1, T2 t2) {
            return (R) new Pair((WireLocation) t1, (List) t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "done", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$k */
    /* loaded from: classes2.dex */
    public static final class C0993k extends Lambda implements Function1<Boolean, Unit> {
        public C0993k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean done) {
            HH4 hh4 = CH4.this.f3838h;
            Intrinsics.checkNotNullExpressionValue(done, "done");
            hh4.mo102576L0(done.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$l */
    /* loaded from: classes2.dex */
    public static final class C0994l extends Lambda implements Function1<String, Unit> {
        public C0994l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            HH4 hh4 = CH4.this.f3838h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            hh4.setAddress(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$m */
    /* loaded from: classes2.dex */
    public static final class C0995m extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f3866h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0995m(String str) {
            super(1);
            this.f3866h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(CH4.this.f3840j, null, this.f3866h, Folder.COMPLAINT_PHOTOS, null, null, false, 57, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00012R\u0010\u0005\u001aN\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*&\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireLocation;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CH4$n */
    /* loaded from: classes2.dex */
    public static final class C0996n extends Lambda implements Function1<Triple<? extends Unit, ? extends String, ? extends WireLocation>, Unit> {
        public C0996n() {
            super(1);
        }

        /* renamed from: a */
        public final void m112406a(Triple<Unit, String, WireLocation> triple) {
            String address = triple.component2();
            WireLocation location = triple.component3();
            InterfaceC40099e13 interfaceC40099e13 = CH4.this.f3840j;
            ComplaintType complaintType = CH4.this.f3829A;
            ArrayList<ComplaintSection> arrayList = null;
            if (complaintType == null) {
                Intrinsics.throwUninitializedPropertyAccessException("type");
                complaintType = null;
            }
            ArrayList<ComplaintSection> arrayList2 = CH4.this.f3856z;
            if (arrayList2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sections");
            } else {
                arrayList = arrayList2;
            }
            Intrinsics.checkNotNullExpressionValue(location, "location");
            Intrinsics.checkNotNullExpressionValue(address, "address");
            interfaceC40099e13.mo36915x4(complaintType, arrayList, 1, new LocationSelectionModel(location, address));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends String, ? extends WireLocation> triple) {
            m112406a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$o */
    /* loaded from: classes2.dex */
    public static final class C0997o extends Lambda implements Function1<List<? extends Uri>, Unit> {
        public C0997o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Uri> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Uri> list) {
            if (list.size() > CH4.this.f3855y) {
                CH4.this.f3833c.mo55956N(new CommunityModePhotoAdded());
            }
            CH4.this.f3855y = list.size();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Landroid/net/Uri;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$p */
    /* loaded from: classes2.dex */
    public static final class C0998p extends Lambda implements Function1<List<? extends Uri>, Boolean> {

        /* renamed from: g */
        public static final C0998p f3869g = new C0998p();

        public C0998p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<? extends Uri> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$q */
    /* loaded from: classes2.dex */
    public static final class C0999q extends Lambda implements Function1<Boolean, Unit> {
        public C0999q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            CH4.this.f3844n.onNext(bool);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "", "Landroid/net/Uri;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$r */
    /* loaded from: classes2.dex */
    public static final class C1000r extends Lambda implements Function1<Pair<? extends WireLocation, ? extends List<? extends Uri>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f3872h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1000r(String str) {
            super(1);
            this.f3872h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireLocation, ? extends List<? extends Uri>> pair) {
            invoke2((Pair<WireLocation, ? extends List<? extends Uri>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireLocation, ? extends List<? extends Uri>> pair) {
            MapMode mapMode;
            ComplaintType complaintType;
            WireLocation location = pair.component1();
            List<? extends Uri> photoUris = pair.component2();
            Intrinsics.checkNotNullExpressionValue(photoUris, "photoUris");
            List<String> m101827a = C33536If6.m101827a(photoUris);
            CH4 ch4 = CH4.this;
            String str = ch4.f3851u;
            Intrinsics.checkNotNullExpressionValue(location, "location");
            MapMode mapMode2 = CH4.this.f3853w;
            Map<String, String> map = null;
            if (mapMode2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("role");
                mapMode = null;
            } else {
                mapMode = mapMode2;
            }
            ComplaintType complaintType2 = CH4.this.f3829A;
            if (complaintType2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("type");
                complaintType = null;
            } else {
                complaintType = complaintType2;
            }
            String str2 = this.f3872h;
            CH4 ch42 = CH4.this;
            Set<String> set = ch42.f3852v;
            Map<String, String> map2 = CH4.this.f3848r;
            if (map2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueToPropertyMap");
            } else {
                map = map2;
            }
            ch4.m112440X(str, location, mapMode, complaintType, m101827a, str2, ch42.m112408z(set, map));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"CH4$s", "LCQ3;", "Lco/bird/android/model/constant/Permission;", "permission", "", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: CH4$s */
    /* loaded from: classes2.dex */
    public static final class C1001s implements CQ3 {
        public C1001s() {
        }

        @Override // p000.CQ3
        /* renamed from: a */
        public void mo19266a(Permission permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            InterfaceC40099e13.C19924a.goToLegacyScanBird$default(CH4.this.f3840j, null, null, BirdAction.GET_CODE, MapMode.RIDER, null, false, 51, null);
        }

        @Override // p000.CQ3
        /* renamed from: b */
        public void mo19265b(Permission permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CH4$t */
    /* loaded from: classes2.dex */
    public static final class C1002t extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C1002t() {
            super(1);
        }

        /* renamed from: a */
        public final void m112405a(InterfaceC23465c interfaceC23465c) {
            S74.C7343a.showProgress$default(CH4.this.f3838h, true, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m112405a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062B\u0010\u0005\u001a>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LHM4;", "Lco/bird/api/response/Complaint;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CH4$u */
    /* loaded from: classes2.dex */
    public static final class C1003u extends Lambda implements Function1<Pair<? extends HM4<Complaint>, ? extends Boolean>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ ComplaintType f3875g;

        /* renamed from: h */
        public final /* synthetic */ CH4 f3876h;

        /* renamed from: i */
        public final /* synthetic */ MapMode f3877i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: CH4$u$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C1004a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ComplaintType.values().length];
                try {
                    iArr[ComplaintType.DAMAGED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ComplaintType.BAD_PARKING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ComplaintType.BAD_RIDING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1003u(ComplaintType complaintType, CH4 ch4, MapMode mapMode) {
            super(1);
            this.f3875g = complaintType;
            this.f3876h = ch4;
            this.f3877i = mapMode;
        }

        /* renamed from: b */
        public static final void m112403b(CH4 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f3840j.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends HM4<Complaint>, ? extends Boolean> pair) {
            invoke2((Pair<HM4<Complaint>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<HM4<Complaint>, Boolean> pair) {
            LegacyAnalyticsEvent communityModeDamageSubmitted;
            int i;
            HM4<Complaint> component1 = pair.component1();
            Boolean enableBackgroundImageUploads = pair.component2();
            if (component1.m103939f()) {
                int i2 = C1004a.$EnumSwitchMapping$0[this.f3875g.ordinal()];
                if (i2 == 1) {
                    communityModeDamageSubmitted = new CommunityModeDamageSubmitted();
                } else if (i2 == 2) {
                    communityModeDamageSubmitted = new CommunityModeBadParkingSubmitted();
                } else if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    communityModeDamageSubmitted = new CommunityModeBadRidingSubmitted();
                }
                this.f3876h.f3833c.mo55956N(communityModeDamageSubmitted);
                Complaint m103944a = component1.m103944a();
                if (m103944a != null) {
                    CH4 ch4 = this.f3876h;
                    Intrinsics.checkNotNullExpressionValue(enableBackgroundImageUploads, "enableBackgroundImageUploads");
                    if (enableBackgroundImageUploads.booleanValue()) {
                        ch4.f3841k.mo15794a(UpdatePhotosWorker.class, UpdatePhotosWorker.f66044i.m56117a(m103944a.getId()));
                    }
                }
                if (this.f3877i == MapMode.RIDER) {
                    InterfaceC40099e13.C19924a.goToRider$default(this.f3876h.f3840j, false, true, null, 4, null);
                    return;
                }
                if (this.f3876h.f3835e.m82623f8().getValue().getChargerConfig().getMarkDamagedCopyUpdates()) {
                    i = C45871nl4.damage_feedback_feedback_thank_you;
                } else {
                    i = C45871nl4.feedback_thank_you;
                }
                this.f3876h.f3838h.success(i);
                Handler handler = this.f3876h.f3834d;
                final CH4 ch42 = this.f3876h;
                handler.postDelayed(new Runnable() { // from class: DH4
                    @Override // java.lang.Runnable
                    public final void run() {
                        CH4.C1003u.m112403b(CH4.this);
                    }
                }, 2000L);
                return;
            }
            this.f3876h.f3838h.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/location/Location;", "location", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Landroid/location/Location;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CH4$v */
    /* loaded from: classes2.dex */
    public static final class C1005v extends Lambda implements Function1<Location, InterfaceC23434B<? extends String>> {
        public C1005v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends String> invoke(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return CH4.this.f3832b.mo43614r(location.getLatitude(), location.getLongitude());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/location/Location;", "location", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireLocation;", C17296a.f69688o, "(Landroid/location/Location;Ljava/lang/String;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CH4$w */
    /* loaded from: classes2.dex */
    public static final class C1006w extends Lambda implements Function2<Location, String, Pair<? extends WireLocation, ? extends String>> {

        /* renamed from: g */
        public static final C1006w f3879g = new C1006w();

        public C1006w() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<WireLocation, String> invoke(Location location, String address) {
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(address, "address");
            return new Pair<>(WireLocationKt.toLocation$default(location, null, 1, null), address);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireLocation;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CH4$x */
    /* loaded from: classes2.dex */
    public static final class C1007x extends Lambda implements Function1<Pair<? extends WireLocation, ? extends String>, Unit> {
        public C1007x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireLocation, ? extends String> pair) {
            invoke2((Pair<WireLocation, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireLocation, String> pair) {
            CH4.this.f3842l.onNext(pair.getFirst());
            CH4.this.f3843m.onNext(pair.getSecond());
        }
    }

    public CH4(InterfaceC34088Kp0 communityManager, InterfaceC40001dr4 reactiveLocationManager, InterfaceC1880Ea analyticsManager, Handler handler, C36207Tq4 reactiveConfig, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC32604Eg1 eventBus, HH4 ui, DQ3 permissionManager, InterfaceC40099e13 navigator, InterfaceC46333oY1 imageUploader) {
        Intrinsics.checkNotNullParameter(communityManager, "communityManager");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(imageUploader, "imageUploader");
        this.f3831a = communityManager;
        this.f3832b = reactiveLocationManager;
        this.f3833c = analyticsManager;
        this.f3834d = handler;
        this.f3835e = reactiveConfig;
        this.f3836f = scopeProvider;
        this.f3837g = eventBus;
        this.f3838h = ui;
        this.f3839i = permissionManager;
        this.f3840j = navigator;
        this.f3841k = imageUploader;
        C24558d<WireLocation> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireLocation>()");
        this.f3842l = m31902e;
        C24558d<String> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<String>()");
        this.f3843m = m31902e2;
        Boolean bool = Boolean.FALSE;
        C24552a<Boolean> m31921g = C24552a.m31921g(bool);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(false)");
        this.f3844n = m31921g;
        C24552a<Boolean> m31921g2 = C24552a.m31921g(bool);
        Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault(false)");
        this.f3845o = m31921g2;
        C24552a<Boolean> m31921g3 = C24552a.m31921g(bool);
        Intrinsics.checkNotNullExpressionValue(m31921g3, "createDefault(false)");
        this.f3846p = m31921g3;
        C24558d<Boolean> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Boolean>()");
        this.f3847q = m31902e3;
        this.f3849s = new ArrayList();
        this.f3852v = new LinkedHashSet();
    }

    /* renamed from: C */
    public static final void m112461C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m112460D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m112456H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m112454J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m112453K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m112452L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m112451M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m112450N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final Boolean m112449O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m112448P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m112447Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m112439Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m112438Z(CH4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        S74.C7343a.showProgress$default(this$0.f3838h, false, 0, 2, null);
    }

    /* renamed from: a0 */
    public static final void m112437a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23434B m112433c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final Pair m112431d0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: e0 */
    public static final void m112429e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m112412v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m112410x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final Map<String, String> m112463A(List<ComplaintSection> list) {
        int collectionSizeOrDefault;
        List flatten;
        int collectionSizeOrDefault2;
        int mapCapacity;
        int coerceAtLeast;
        int collectionSizeOrDefault3;
        boolean z;
        ArrayList<ComplaintSection> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ComplaintSection) obj).getOptions() != null) {
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
        for (ComplaintSection complaintSection : arrayList) {
            List<ComplaintOption> options = complaintSection.getOptions();
            Intrinsics.checkNotNull(options);
            List<ComplaintOption> list2 = options;
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
            for (ComplaintOption complaintOption : list2) {
                arrayList3.add(new Pair(complaintOption.getValue(), complaintSection.getProperty()));
            }
            arrayList2.add(arrayList3);
        }
        flatten = CollectionsKt__IterablesKt.flatten(arrayList2);
        List<Pair> list3 = flatten;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault2);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (Pair pair : list3) {
            Pair m28425to = TuplesKt.m28425to(pair.getFirst(), pair.getSecond());
            linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
        }
        return linkedHashMap;
    }

    /* renamed from: B */
    public final void m112462B(String str) {
        AbstractC23442F<ComplaintSchemaResponse> m33152N = this.f3831a.mo96320d(ComplaintSchemaType.COMMUNITY, str).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "communityManager.complai…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f3836f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0987f c0987f = new C0987f();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: jH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CH4.m112461C(Function1.this, obj);
            }
        };
        final C0989g c0989g = C0989g.f3860b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: tH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CH4.m112460D(Function1.this, obj);
            }
        });
    }

    /* renamed from: E */
    public final int m112459E(ComplaintType complaintType) {
        int i = C0983b.$EnumSwitchMapping$1[complaintType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C45871nl4.damage_title;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C45871nl4.bad_parking_title;
        }
        return C45871nl4.unsafe_rider_title;
    }

    /* renamed from: F */
    public final boolean m112458F(List<ComplaintSection> list) {
        boolean z;
        List<ComplaintSection> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (ComplaintSection complaintSection : list2) {
            if (complaintSection.getType() == ComplaintSectionType.MULTISELECT) {
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

    /* renamed from: G */
    public final void m112457G() {
        Iterator<T> it = this.f3838h.mo102563l2().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object m33094as = ((Observable) pair.component2()).m33094as(AutoDispose.m45239a(this.f3836f));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C0990h c0990h = new C0990h((String) pair.component1());
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kH4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CH4.m112456H(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: I */
    public final void m112455I(ComplaintType complaintType) {
        this.f3838h.mo102569dh(complaintType != ComplaintType.BAD_RIDING);
    }

    /* renamed from: R */
    public final void m112446R(Set<String> selectedOptions, String value) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        Intrinsics.checkNotNullParameter(value, "value");
        boolean z = !selectedOptions.contains(value);
        if (!z) {
            selectedOptions.remove(value);
        } else {
            String lowerCase = value.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            selectedOptions.add(lowerCase);
        }
        m112445S(value, z);
        this.f3838h.mo102579F0(value);
        m112441W(!selectedOptions.isEmpty());
    }

    /* renamed from: S */
    public final void m112445S(String str, boolean z) {
        if (Intrinsics.areEqual(str, "no_qr_code")) {
            this.f3846p.onNext(Boolean.valueOf(z));
        } else if (Intrinsics.areEqual(str, LegacyRepairType.OTHER_KEY)) {
            this.f3838h.mo102570Sc(z);
            if (!z) {
                this.f3838h.mo102567ej();
            }
        }
    }

    /* renamed from: T */
    public void m112444T() {
        DQ3.request$default(this.f3839i, Permission.CAMERA, new C1001s(), null, 4, null);
    }

    /* renamed from: U */
    public final void m112443U(Set<String> selectedOptions, String value) {
        Object first;
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        Intrinsics.checkNotNullParameter(value, "value");
        boolean z = !selectedOptions.contains(value);
        if (!z) {
            selectedOptions.remove(value);
        } else {
            if (!selectedOptions.isEmpty()) {
                first = CollectionsKt___CollectionsKt.first(selectedOptions);
                String str = (String) first;
                this.f3838h.mo102579F0(str);
                selectedOptions.clear();
                m112445S(str, false);
            }
            selectedOptions.add(value);
        }
        m112445S(value, z);
        this.f3838h.mo102579F0(value);
        m112441W(z);
    }

    /* renamed from: V */
    public final void m112442V(ComplaintType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f3838h.mo102581E(m112459E(type));
    }

    /* renamed from: W */
    public final void m112441W(boolean z) {
        this.f3838h.mo102580E3(z);
        this.f3847q.onNext(Boolean.valueOf(z));
    }

    /* renamed from: X */
    public void m112440X(String str, WireLocation location, MapMode role, ComplaintType complaintType, List<String> list, String str2, Map<String, ? extends Object> reasonsAndMessages) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(complaintType, "complaintType");
        Intrinsics.checkNotNullParameter(reasonsAndMessages, "reasonsAndMessages");
        AbstractC23442F m74531s0 = C37279Yf5.m74531s0(this.f3831a.mo96317g(str, location, role, complaintType, list, str2, reasonsAndMessages, this.f3830B), this.f3835e.m82540n3());
        final C1002t c1002t = new C1002t();
        AbstractC23442F m33110r = m74531s0.m33102v(new InterfaceC23484g() { // from class: qH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CH4.m112439Y(Function1.this, obj);
            }
        }).m33110r(new InterfaceC23478a() { // from class: rH4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                CH4.m112438Z(CH4.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33110r, "override fun submitCompl…dy)\n        }\n      }\n  }");
        Object m33135e = m33110r.m33135e(AutoDispose.m45239a(this.f3836f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1003u c1003u = new C1003u(complaintType, this, role);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: sH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CH4.m112437a0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC42625iH4
    /* renamed from: a */
    public void mo34243a(Intent intent, String photoStoragePath) {
        Enum r10;
        boolean equals;
        Unit unit;
        Observable combineLatest;
        List<ComplaintOption> list;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(photoStoragePath, "photoStoragePath");
        Serializable serializableExtra = intent.getSerializableExtra("complaint_type");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type co.bird.android.model.ComplaintType");
        this.f3829A = (ComplaintType) serializableExtra;
        ArrayList<ComplaintSection> parcelableArrayListExtra = intent.getParcelableArrayListExtra("complaint_section");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        this.f3856z = parcelableArrayListExtra;
        String stringExtra = intent.getStringExtra("ride_id");
        String stringExtra2 = intent.getStringExtra("map_mode");
        ComplaintType complaintType = null;
        if (stringExtra2 != null) {
            try {
                Object[] enumConstants = MapMode.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra2, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r10 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = MapMode.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    r10 = (Enum) obj2;
                    if (Intrinsics.areEqual(r10.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r10 = null;
        MapMode mapMode = (MapMode) r10;
        if (mapMode != null) {
            this.f3853w = mapMode;
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            return;
        }
        WireBird wireBird = (WireBird) intent.getParcelableExtra("bird");
        if (wireBird != null) {
            this.f3851u = wireBird.getId();
            this.f3854x = wireBird.getCode();
        }
        this.f3830B = intent.getBooleanExtra("from_task_list", false);
        String str = this.f3854x;
        if (str != null) {
            this.f3838h.mo102562m(str);
        }
        this.f3837g.mo104917a(this);
        m112435b0();
        ComplaintType complaintType2 = this.f3829A;
        if (complaintType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
            complaintType2 = null;
        }
        m112455I(complaintType2);
        ArrayList<ComplaintSection> arrayList = this.f3856z;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sections");
            arrayList = null;
        }
        if (m112409y(arrayList)) {
            this.f3838h.mo102565g9();
        }
        ComplaintType complaintType3 = this.f3829A;
        if (complaintType3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
            complaintType3 = null;
        }
        m112442V(complaintType3);
        ArrayList<ComplaintSection> arrayList2 = this.f3856z;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sections");
            arrayList2 = null;
        }
        this.f3848r = m112463A(arrayList2);
        m112413u();
        Object m33094as = C24527f.m31949b(this.f3838h.mo102578Gc(), this.f3843m, this.f3842l).m33094as(AutoDispose.m45239a(this.f3836f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0996n c0996n = new C0996n();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: uH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                CH4.m112451M(Function1.this, obj3);
            }
        });
        ArrayList<ComplaintSection> arrayList3 = this.f3856z;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sections");
            arrayList3 = null;
        }
        Iterator<ComplaintSection> it = arrayList3.iterator();
        while (it.hasNext()) {
            ComplaintSection next = it.next();
            int i = C0983b.$EnumSwitchMapping$0[next.getType().ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    this.f3850t = new Pair<>(next.getPlaceholder(), next.getProperty());
                }
            } else {
                List<ComplaintOption> options = next.getOptions();
                if (options != null) {
                    list = CollectionsKt___CollectionsKt.toMutableList((Collection) options);
                } else {
                    list = null;
                }
                this.f3849s = list;
            }
        }
        HH4 hh4 = this.f3838h;
        ArrayList<ComplaintSection> arrayList4 = this.f3856z;
        if (arrayList4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sections");
            arrayList4 = null;
        }
        ComplaintType complaintType4 = this.f3829A;
        if (complaintType4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
            complaintType4 = null;
        }
        hh4.mo102574Mb(arrayList4, complaintType4);
        m112457G();
        Observable<List<Uri>> mo102560v = this.f3838h.mo102560v();
        final C0997o c0997o = new C0997o();
        Observable<List<Uri>> doOnNext = mo102560v.doOnNext(new InterfaceC23484g() { // from class: vH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                CH4.m112450N(Function1.this, obj3);
            }
        });
        final C0998p c0998p = C0998p.f3869g;
        Observable<R> map = doOnNext.map(new InterfaceC23492o() { // from class: wH4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                Boolean m112449O;
                m112449O = CH4.m112449O(Function1.this, obj3);
                return m112449O;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun onCreate(in…LAINT_PHOTOS)\n      }\n  }");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(this.f3836f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0999q c0999q = new C0999q();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: xH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                CH4.m112448P(Function1.this, obj3);
            }
        });
        Observable<R> withLatestFrom = this.f3838h.mo102568e().withLatestFrom(this.f3842l, this.f3838h.mo102560v(), new C0992j());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        Object m33094as3 = withLatestFrom.m33094as(AutoDispose.m45239a(this.f3836f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1000r c1000r = new C1000r(stringExtra);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: yH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                CH4.m112447Q(Function1.this, obj3);
            }
        });
        Observable<Boolean> hide = this.f3844n.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "photoAdded.hide()");
        Observable<Boolean> hide2 = this.f3845o.hide();
        Intrinsics.checkNotNullExpressionValue(hide2, "birdScanned.hide()");
        Observable<Boolean> hide3 = this.f3846p.hide();
        Intrinsics.checkNotNullExpressionValue(hide3, "noQrCodeSelected.hide()");
        Observable<Boolean> m112411w = m112411w(hide, hide2, hide3);
        ComplaintType complaintType5 = this.f3829A;
        if (complaintType5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        } else {
            complaintType = complaintType5;
        }
        if (C0983b.$EnumSwitchMapping$1[complaintType.ordinal()] == 1) {
            combineLatest = this.f3847q;
        } else {
            C24523e c24523e = C24523e.f91168a;
            combineLatest = Observable.combineLatest(m112411w, this.f3847q, new C0991i());
            Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        }
        Object m33094as4 = combineLatest.m33094as(AutoDispose.m45239a(this.f3836f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0993k c0993k = new C0993k();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: zH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                CH4.m112454J(Function1.this, obj3);
            }
        });
        Object m33094as5 = this.f3843m.m33094as(AutoDispose.m45239a(this.f3836f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0994l c0994l = new C0994l();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: AH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                CH4.m112453K(Function1.this, obj3);
            }
        });
        Object m33094as6 = this.f3838h.mo102566g().m33094as(AutoDispose.m45239a(this.f3836f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0995m c0995m = new C0995m(photoStoragePath);
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: BH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                CH4.m112452L(Function1.this, obj3);
            }
        });
    }

    /* renamed from: b0 */
    public final void m112435b0() {
        Observable<Location> m33123k0 = this.f3832b.mo43627e(true).m33123k0();
        final C1005v c1005v = new C1005v();
        InterfaceC23492o<? super Location, ? extends InterfaceC23434B<? extends U>> interfaceC23492o = new InterfaceC23492o() { // from class: lH4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m112433c0;
                m112433c0 = CH4.m112433c0(Function1.this, obj);
                return m112433c0;
            }
        };
        final C1006w c1006w = C1006w.f3879g;
        Observable observeOn = m33123k0.flatMap(interfaceC23492o, new InterfaceC23480c() { // from class: mH4
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m112431d0;
                m112431d0 = CH4.m112431d0(Function2.this, obj, obj2);
                return m112431d0;
            }
        }).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun updateCurren…(pair.second)\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f3836f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1007x c1007x = new C1007x();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: nH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CH4.m112429e0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC42625iH4
    public void onActivityResult(int i, int i2, Intent intent) {
        PhotoSavedModel photoSavedModel;
        if (i == 1) {
            if (i2 == -1 && intent != null) {
                WireLocation wireLocation = (WireLocation) intent.getParcelableExtra("location");
                if (wireLocation != null) {
                    this.f3842l.onNext(wireLocation);
                }
                String stringExtra = intent.getStringExtra(PaymentMethod.BillingDetails.PARAM_ADDRESS);
                if (stringExtra != null) {
                    this.f3843m.onNext(stringExtra);
                }
                this.f3833c.mo55956N(new CommunityModeAddressChanged());
            }
        } else if (i == C30906z6.m1823a(Reflection.getOrCreateKotlinClass(RetakeablePhotoActivity.class)) && i2 == -1 && intent != null) {
            if (intent.hasExtra("photo_url")) {
                String stringExtra2 = intent.getStringExtra("photo_url");
                if (stringExtra2 != null) {
                    this.f3838h.mo102564j(stringExtra2);
                }
            } else if (intent.hasExtra("photo_saved_model") && (photoSavedModel = (PhotoSavedModel) intent.getParcelableExtra("photo_saved_model")) != null) {
                HH4 hh4 = this.f3838h;
                Uri fromFile = Uri.fromFile(new File(photoSavedModel.getPhotoPath()));
                Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(File(model.photoPath))");
                hh4.mo102582B3(fromFile);
            }
        }
    }

    @Override // p000.InterfaceC42625iH4
    public void onDestroy() {
        if (this.f3837g.mo104916b(this)) {
            this.f3837g.mo104914d(this);
        }
    }

    @InterfaceC40955fT5
    public void onEvent(C13581cT event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String m61293c = event.m61293c();
        this.f3851u = m61293c;
        if (m61293c != null) {
            m112462B(m61293c);
        }
        this.f3838h.mo102562m(event.m61294b());
        this.f3833c.mo55956N(new CommunityModeScanAdded());
        this.f3845o.onNext(Boolean.TRUE);
    }

    /* renamed from: u */
    public final void m112413u() {
        Object m33094as = this.f3838h.mo102575Lg().m33094as(AutoDispose.m45239a(this.f3836f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0984c c0984c = new C0984c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: pH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CH4.m112412v(Function1.this, obj);
            }
        });
    }

    /* renamed from: w */
    public final Observable<Boolean> m112411w(Observable<Boolean> photoAdded, Observable<Boolean> birdScanned, Observable<Boolean> noQrCodeSelected) {
        Intrinsics.checkNotNullParameter(photoAdded, "photoAdded");
        Intrinsics.checkNotNullParameter(birdScanned, "birdScanned");
        Intrinsics.checkNotNullParameter(noQrCodeSelected, "noQrCodeSelected");
        C24523e c24523e = C24523e.f91168a;
        Observable<Boolean> combineLatest = Observable.combineLatest(photoAdded, birdScanned, noQrCodeSelected, new C0985d());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(this.f3836f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0986e c0986e = new C0986e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: oH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CH4.m112410x(Function1.this, obj);
            }
        });
        return combineLatest;
    }

    /* renamed from: y */
    public final boolean m112409y(List<ComplaintSection> list) {
        boolean z;
        List<ComplaintSection> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (ComplaintSection complaintSection : list2) {
            List<ComplaintOption> options = complaintSection.getOptions();
            if (options != null) {
                List<ComplaintOption> list3 = options;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (ComplaintOption complaintOption : list3) {
                        if (Intrinsics.areEqual(complaintOption.getValue(), "no_qr_code")) {
                            z = true;
                            continue;
                            break;
                        }
                    }
                }
            }
            z = false;
            continue;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public final Map<String, Object> m112408z(Set<String> selectedOptions, Map<String, String> valueToPropertyMap) {
        List mutableListOf;
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        Intrinsics.checkNotNullParameter(valueToPropertyMap, "valueToPropertyMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f3838h.mo102577Id());
        for (String str : selectedOptions) {
            String str2 = valueToPropertyMap.get(str);
            Intrinsics.checkNotNull(str2);
            String str3 = str2;
            if (linkedHashMap.containsKey(str3)) {
                Object obj = linkedHashMap.get(str3);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                TypeIntrinsics.asMutableList(obj).add(str);
            } else {
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(str);
                linkedHashMap.put(str3, mutableListOf);
            }
        }
        return linkedHashMap;
    }
}
