package co.bird.android.manager.itemlease;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.manager.itemlease.ItemLeaseManagerImpl;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateKt;
import co.bird.android.model.RideStates;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.itemlease.ItemLeaseExemption;
import co.bird.android.model.itemlease.ItemLeaseKt;
import co.bird.android.model.itemlease.LeaseItemAvailability;
import co.bird.android.model.itemlease.LeaseItemAvailabilityResponse;
import co.bird.android.model.itemlease.LeaseReturnResponse;
import co.bird.android.model.itemlease.LeaseStartResponse;
import co.bird.android.model.itemlease.LeaseSubmitAssetResponse;
import co.bird.android.model.itemlease.p022enum.ItemLeaseAssetPurpose;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLeaseObjectResponse;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.request.WireItemLeaseStartRequest;
import co.bird.api.request.WireLeaseAssetRequest;
import co.bird.api.request.WireLeaseItemAvailabilityRequest;
import co.bird.api.request.WireLeaseReturnRequest;
import co.bird.api.request.WirePaymentAuthRequest;
import co.bird.api.response.PagedCollection;
import co.bird.api.response.WireItemLeaseStartResponse;
import co.bird.api.response.WireLeaseAssetResponse;
import co.bird.api.response.WireLeaseItemAvailabilityResponse;
import co.bird.api.response.WireLeaseReturnResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C22454gl;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002Bm\b\u0007\u0012\u0006\u0010I\u001a\u00020G\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010T\u001a\u00020R\u0012\u0006\u0010W\u001a\u00020U\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\b\b\u0001\u0010b\u001a\u00020\u000e\u0012\u0006\u0010e\u001a\u00020c\u0012\u0006\u0010h\u001a\u00020f\u0012\u0006\u0010k\u001a\u00020i\u0012\u0006\u0010o\u001a\u00020l¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J8\u0010\f\u001a\u00020\u000b2\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002J8\u0010\r\u001a\u00020\u000b2\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J@\u0010\u0015\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00120\u0011*\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\u0004\u0012\u00020\u00140\u00120\u0011J\b\u0010\u0017\u001a\u00020\u0016H\u0016J<\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00112\u0006\u0010\t\u001a\u00020\u0007H\u0016JD\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00112\u0006\u0010!\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006H\u0016J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00112\u0006\u0010!\u001a\u00020\u0018H\u0016J\u0018\u0010.\u001a\u00020'2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00100\u001a\u00020'2\u0006\u0010/\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u001a\u00101\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u001a\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u0010/\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00103\u001a\u00020'2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00104\u001a\u00020'2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00105\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00106\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00107\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00108\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J \u0010=\u001a\u00020'2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>H\u0016J\u0018\u0010A\u001a\u00020'2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010B\u001a\u00020\u000bH\u0016J2\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00112\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010C\u001a\u00020'2\b\u0010D\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0016R\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010SR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010dR\u0014\u0010h\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010gR\u0014\u0010k\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR'\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060p8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u0010q\u001a\u0004\br\u0010sR'\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0u0p8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bF\u0010q\u001a\u0004\bv\u0010sR'\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060p8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b2\u0010q\u001a\u0004\bO\u0010sR3\u0010z\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040p8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b6\u0010q\u001a\u0004\by\u0010sR3\u0010}\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040p8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b{\u0010q\u001a\u0004\b|\u0010sR \u0010\u007f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010~R!\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0u0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010~R!\u0010\u0081\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010~R-\u0010\u0082\u0001\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010~R-\u0010\u0083\u0001\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010~R\u001d\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008c\u0001"}, m28432d2 = {"Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;", "LMc2;", "LVX0;", "La94;", "", "Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "", "Lco/bird/android/model/wire/WireBird;", "relay", "bird", "leaseType", "", "p0", "n0", "LLifecycleOwner;", "owner", "onStart", "Lio/reactivex/F;", "Lkotlin/Pair;", "Lco/bird/android/model/itemlease/ItemLease;", "Lco/bird/android/model/RideStates;", "Y", "Lio/reactivex/c;", "b", "", "partnerId", "leasedItemId", "associatedItemId", "Lco/bird/api/request/WirePaymentAuthRequest;", "paymentAuth", "Lco/bird/android/model/itemlease/LeaseStartResponse;", "x", "E", "leaseId", "Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;", "purpose", "", "fileSize", "mimeType", "", "autoScanned", "autoScannedCodes", "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;", "B", "Lco/bird/android/model/itemlease/LeaseReturnResponse;", "u", "l", "birdId", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "z", "p", "t", "n", "f", "q", "y", "j", "Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "v", "Lco/bird/android/model/itemlease/ItemLeaseExemption;", "exemption", "A", "k", "e", "present", "itemId", "Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;", "o", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LLc2;", "c", "LLc2;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "LOh;", DateTokenConverter.CONVERTER_KEY, "LOh;", "buildConfig", "Lwi2;", "Lwi2;", "deserializer", "LEa;", "LEa;", "analyticsManager", "LGI3;", "g", "LGI3;", "partnerManager", "LTq4;", "h", "LTq4;", "reactiveConfig", "i", "LLifecycleOwner;", "processLifecycleOwner", "Lgl;", "Lgl;", "appPreference", "LYR4;", "LYR4;", "rideManager", "LaM;", "LaM;", "birdManager", "Ldr4;", "m", "Ldr4;", "locationManager", "LZ84;", "Lkotlin/Lazy;", "s", "()LZ84;", "activeLeases", "", "X", "currentExemptions", "activeLeaseBirds", "D", "readyToLeaseBirds", "r", "w", "readyToEndLeaseBirds", "La94;", "mutableActiveLeases", "mutableLeaseExemption", "mutableActiveLeaseBirds", "mutableReadyToLeaseBirds", "mutableReadyToEndLeaseBirds", "W", "()Ljava/util/List;", "currentActiveLeaseBirds", C17296a.f69688o, "()Ljava/lang/String;", "imageCacheDirectoryPath", "<init>", "(Landroid/content/Context;LLc2;LOh;Lwi2;LEa;LGI3;LTq4;LLifecycleOwner;Lgl;LYR4;LaM;Ldr4;)V", "co.bird.android.manager.itemlease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nItemLeaseManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 6 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,476:1\n1603#2,9:477\n1855#2:486\n1856#2:488\n1612#2:489\n1747#2,3:497\n288#2,2:500\n1747#2,3:502\n1747#2,3:505\n1747#2,3:508\n1747#2,3:511\n1#3:487\n1#3:496\n44#4:490\n44#4:494\n237#5:491\n237#5:495\n52#6,2:492\n*S KotlinDebug\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl\n*L\n100#1:477,9\n100#1:486\n100#1:488\n100#1:489\n312#1:497,3\n322#1:500,2\n329#1:502,3\n339#1:505,3\n351#1:508,3\n397#1:511,3\n100#1:487\n119#1:490\n154#1:494\n119#1:491\n154#1:495\n124#1:492,2\n*E\n"})
/* loaded from: classes4.dex */
public final class ItemLeaseManagerImpl implements InterfaceC34441Mc2, VX0 {

    /* renamed from: b */
    public final Context f66377b;

    /* renamed from: c */
    public final InterfaceC34207Lc2 f66378c;

    /* renamed from: d */
    public final InterfaceC6097Oh f66379d;

    /* renamed from: e */
    public final C51174wi2 f66380e;

    /* renamed from: f */
    public final InterfaceC1880Ea f66381f;

    /* renamed from: g */
    public final GI3 f66382g;

    /* renamed from: h */
    public final C36207Tq4 f66383h;

    /* renamed from: i */
    public final LifecycleOwner f66384i;

    /* renamed from: j */
    public final C22454gl f66385j;

    /* renamed from: k */
    public final YR4 f66386k;

    /* renamed from: l */
    public final InterfaceC10636aM f66387l;

    /* renamed from: m */
    public final InterfaceC40001dr4 f66388m;

    /* renamed from: n */
    public final Lazy f66389n;

    /* renamed from: o */
    public final Lazy f66390o;

    /* renamed from: p */
    public final Lazy f66391p;

    /* renamed from: q */
    public final Lazy f66392q;

    /* renamed from: r */
    public final Lazy f66393r;

    /* renamed from: s */
    public final C37791a94<List<ItemLease>> f66394s;

    /* renamed from: t */
    public final C37791a94<Set<ItemLeaseExemption>> f66395t;

    /* renamed from: u */
    public final C37791a94<List<WireBird>> f66396u;

    /* renamed from: v */
    public final C37791a94<Map<ItemLeaseType, List<WireBird>>> f66397v;

    /* renamed from: w */
    public final C37791a94<Map<ItemLeaseType, List<WireBird>>> f66398w;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16146a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ItemLeaseType.values().length];
            try {
                iArr[ItemLeaseType.HELMET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemLeaseType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$b */
    /* loaded from: classes4.dex */
    public static final class C16147b extends Lambda implements Function0<Z84<List<? extends WireBird>>> {
        public C16147b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireBird>> invoke2() {
            return C38384b94.m64921a(ItemLeaseManagerImpl.this.f66396u);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/itemlease/ItemLease;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$c */
    /* loaded from: classes4.dex */
    public static final class C16148c extends Lambda implements Function0<Z84<List<? extends ItemLease>>> {
        public C16148c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends ItemLease>> invoke2() {
            return C38384b94.m64921a(ItemLeaseManagerImpl.this.f66394s);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/itemlease/ItemLeaseExemption;", "set", C17296a.f69688o, "(Ljava/util/Set;)Ljava/util/Set;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$d */
    /* loaded from: classes4.dex */
    public static final class C16149d extends Lambda implements Function1<Set<? extends ItemLeaseExemption>, Set<? extends ItemLeaseExemption>> {

        /* renamed from: g */
        public final /* synthetic */ ItemLeaseExemption f66401g;

        /* renamed from: h */
        public final /* synthetic */ ItemLeaseManagerImpl f66402h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/itemlease/ItemLeaseExemption;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/itemlease/ItemLeaseExemption;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$d$a */
        /* loaded from: classes4.dex */
        public static final class C16150a extends Lambda implements Function1<ItemLeaseExemption, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ ItemLeaseManagerImpl f66403g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16150a(ItemLeaseManagerImpl itemLeaseManagerImpl) {
                super(1);
                this.f66403g = itemLeaseManagerImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(ItemLeaseExemption it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isValid(C36441Uq4.m80769c(this.f66403g.f66383h, it.getBird())));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/itemlease/ItemLeaseExemption;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/itemlease/ItemLeaseExemption;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$d$b */
        /* loaded from: classes4.dex */
        public static final class C16151b extends Lambda implements Function1<ItemLeaseExemption, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ ItemLeaseExemption f66404g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16151b(ItemLeaseExemption itemLeaseExemption) {
                super(1);
                this.f66404g = itemLeaseExemption;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(ItemLeaseExemption it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getBird().isProbablySame(this.f66404g.getBird()) && it.getException() == this.f66404g.getException() && it.getLeaseType() == this.f66404g.getLeaseType()) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16149d(ItemLeaseExemption itemLeaseExemption, ItemLeaseManagerImpl itemLeaseManagerImpl) {
            super(1);
            this.f66401g = itemLeaseExemption;
            this.f66402h = itemLeaseManagerImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Set<ItemLeaseExemption> invoke(Set<ItemLeaseExemption> set) {
            Set mutableSet;
            Set<ItemLeaseExemption> set2;
            Intrinsics.checkNotNullParameter(set, "set");
            mutableSet = CollectionsKt___CollectionsKt.toMutableSet(set);
            ItemLeaseExemption itemLeaseExemption = this.f66401g;
            CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, new C16150a(this.f66402h));
            CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, new C16151b(itemLeaseExemption));
            mutableSet.add(itemLeaseExemption);
            set2 = CollectionsKt___CollectionsKt.toSet(mutableSet);
            return set2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/itemlease/ItemLeaseExemption;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$e */
    /* loaded from: classes4.dex */
    public static final class C16152e extends Lambda implements Function0<Z84<Set<? extends ItemLeaseExemption>>> {
        public C16152e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Set<? extends ItemLeaseExemption>> invoke2() {
            return C38384b94.m64921a(ItemLeaseManagerImpl.this.f66395t);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u008a\u0001\u0012>\b\u0001\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0001 \u0007*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0001\u0018\u00010\u00000\u0000 \u0007*D\u0012>\b\u0001\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0001 \u0007*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/itemlease/ItemLease;", "Lco/bird/android/model/RideStates;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nItemLeaseManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$mapWithFallbackBirdsAndUpdate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,476:1\n1603#2,9:477\n1855#2:486\n1856#2:488\n1612#2:489\n1603#2,9:490\n1855#2:499\n1856#2:501\n1612#2:502\n1549#2:503\n1620#2,3:504\n1#3:487\n1#3:500\n*S KotlinDebug\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$mapWithFallbackBirdsAndUpdate$1\n*L\n160#1:477,9\n160#1:486\n160#1:488\n160#1:489\n161#1:490,9\n161#1:499\n161#1:501\n161#1:502\n162#1:503\n162#1:504,3\n160#1:487\n161#1:500\n*E\n"})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$f */
    /* loaded from: classes4.dex */
    public static final class C16153f extends Lambda implements Function1<Pair<? extends List<? extends ItemLease>, ? extends RideStates>, InterfaceC23447K<? extends Pair<? extends List<? extends ItemLease>, ? extends List<? extends WireBird>>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "nearbyBirds", "Lkotlin/Pair;", "Lco/bird/android/model/itemlease/ItemLease;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nItemLeaseManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$mapWithFallbackBirdsAndUpdate$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,476:1\n1655#2,8:477\n*S KotlinDebug\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$mapWithFallbackBirdsAndUpdate$1$1\n*L\n171#1:477,8\n*E\n"})
        /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$f$a */
        /* loaded from: classes4.dex */
        public static final class C16154a extends Lambda implements Function1<List<? extends WireBird>, Pair<? extends List<? extends ItemLease>, ? extends List<? extends WireBird>>> {

            /* renamed from: g */
            public final /* synthetic */ List<ItemLease> f66407g;

            /* renamed from: h */
            public final /* synthetic */ List<WireBird> f66408h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16154a(List<ItemLease> list, List<WireBird> list2) {
                super(1);
                this.f66407g = list;
                this.f66408h = list2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<ItemLease>, List<WireBird>> invoke(List<WireBird> nearbyBirds) {
                List plus;
                Intrinsics.checkNotNullParameter(nearbyBirds, "nearbyBirds");
                List<ItemLease> list = this.f66407g;
                plus = CollectionsKt___CollectionsKt.plus((Collection) this.f66408h, (Iterable) nearbyBirds);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : plus) {
                    if (hashSet.add(((WireBird) obj).getId())) {
                        arrayList.add(obj);
                    }
                }
                return TuplesKt.m28425to(list, arrayList);
            }
        }

        public C16153f() {
            super(1);
        }

        /* renamed from: c */
        public static final Pair m55643c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<List<ItemLease>, List<WireBird>>> invoke(Pair<? extends List<ItemLease>, RideStates> pair) {
            Set<String> set;
            int collectionSizeOrDefault;
            Set set2;
            Set<String> minus;
            List<WireBird> emptyList;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<ItemLease> component1 = pair.component1();
            RideStates component2 = pair.component2();
            ArrayList arrayList = new ArrayList();
            for (ItemLease itemLease : component1) {
                String associatedItemId = itemLease.getAssociatedItemId();
                if (associatedItemId != null) {
                    arrayList.add(associatedItemId);
                }
            }
            set = CollectionsKt___CollectionsKt.toSet(arrayList);
            ArrayList<WireBird> arrayList2 = new ArrayList();
            for (RideState rideState : component2.ridesForBirdIds(set)) {
                WireBird bird = rideState.getRide().getBird();
                if (bird != null) {
                    arrayList2.add(bird);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            for (WireBird wireBird : arrayList2) {
                arrayList3.add(wireBird.getId());
            }
            set2 = CollectionsKt___CollectionsKt.toSet(arrayList3);
            minus = SetsKt___SetsKt.minus((Set) set, (Iterable) set2);
            if (!minus.isEmpty()) {
                AbstractC23442F<List<WireBird>> mo71587V0 = ItemLeaseManagerImpl.this.f66387l.mo71587V0(minus, ItemLeaseManagerImpl.this.f66388m.mo43616p().m73665a());
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                AbstractC23442F<List<WireBird>> m33148R = mo71587V0.m33148R(emptyList);
                final C16154a c16154a = new C16154a(component1, arrayList2);
                return m33148R.m33157I(new InterfaceC23492o() { // from class: cd2
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m55643c;
                        m55643c = ItemLeaseManagerImpl.C16153f.m55643c(Function1.this, obj);
                        return m55643c;
                    }
                });
            }
            return AbstractC23442F.m33158H(TuplesKt.m28425to(component1, arrayList2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/itemlease/ItemLease;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$g */
    /* loaded from: classes4.dex */
    public static final class C16155g extends Lambda implements Function1<Pair<? extends List<? extends ItemLease>, ? extends List<? extends WireBird>>, Unit> {
        public C16155g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends ItemLease>, ? extends List<? extends WireBird>> pair) {
            invoke2((Pair<? extends List<ItemLease>, ? extends List<WireBird>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<ItemLease>, ? extends List<WireBird>> pair) {
            List<ItemLease> component1 = pair.component1();
            ItemLeaseManagerImpl.this.f66394s.accept(component1);
            ItemLeaseManagerImpl.this.f66385j.m37652Z2(component1, pair.component2());
            ItemLeaseManagerImpl.this.f66396u.accept(ItemLeaseManagerImpl.this.m55688W());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireLeaseItemAvailabilityResponse;", "response", "Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireLeaseItemAvailabilityResponse;)Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nItemLeaseManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$markLeaseItemAvailability$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,476:1\n1#2:477\n*E\n"})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$h */
    /* loaded from: classes4.dex */
    public static final class C16156h extends Lambda implements Function1<WireLeaseItemAvailabilityResponse, LeaseItemAvailabilityResponse> {

        /* renamed from: g */
        public static final C16156h f66410g = new C16156h();

        public C16156h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final LeaseItemAvailabilityResponse invoke(WireLeaseItemAvailabilityResponse response) {
            ItemLeaseType itemLeaseType;
            Intrinsics.checkNotNullParameter(response, "response");
            String id = response.getAvailability().getId();
            String leaseType = response.getAvailability().getLeaseType();
            if (leaseType != null) {
                itemLeaseType = ItemLeaseType.Companion.fromWire(leaseType);
            } else {
                itemLeaseType = null;
            }
            return new LeaseItemAvailabilityResponse(new LeaseItemAvailability(id, itemLeaseType, response.getAvailability().getItemId(), response.getAvailability().getAssociatedItemId(), response.getAvailability().getConfidence(), response.getAvailability().getCreatedAt(), response.getAvailability().getUpdatedAt()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$i */
    /* loaded from: classes4.dex */
    public static final class C16157i<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C16157i<T1, T2, R> f66411a = new C16157i<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$j */
    /* loaded from: classes4.dex */
    public static final class C16158j extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16158j f66412g = new C16158j();

        public C16158j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while querying active leases on app foreground", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003 \u0007*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "shouldUpdate", "Lio/reactivex/B;", "Lkotlin/Pair;", "", "Lco/bird/android/model/itemlease/ItemLease;", "Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$l */
    /* loaded from: classes4.dex */
    public static final class C16160l extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Pair<? extends List<? extends ItemLease>, ? extends RideStates>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "rideStates", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nItemLeaseManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$onStart$3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,476:1\n1603#2,9:477\n1855#2:486\n1856#2:489\n1612#2:490\n1#3:487\n1#3:488\n*S KotlinDebug\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$onStart$3$1\n*L\n139#1:477,9\n139#1:486\n139#1:489\n139#1:490\n139#1:488\n*E\n"})
        /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$l$a */
        /* loaded from: classes4.dex */
        public static final class C16161a extends Lambda implements Function1<RideStates, List<? extends String>> {

            /* renamed from: g */
            public static final C16161a f66415g = new C16161a();

            public C16161a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<String> invoke(RideStates rideStates) {
                String id;
                Intrinsics.checkNotNullParameter(rideStates, "rideStates");
                ArrayList arrayList = new ArrayList();
                for (RideState rideState : rideStates.getRideStates()) {
                    WireBird bird = rideState.getRide().getBird();
                    String str = null;
                    if (bird != null && (id = bird.getId()) != null && RideStateKt.isInRide(rideState)) {
                        str = id;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0000 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "it", "Lkotlin/Pair;", "", "Lco/bird/android/model/itemlease/ItemLease;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$l$b */
        /* loaded from: classes4.dex */
        public static final class C16162b extends Lambda implements Function1<RideStates, Pair<? extends List<? extends ItemLease>, ? extends RideStates>> {

            /* renamed from: g */
            public final /* synthetic */ ItemLeaseManagerImpl f66416g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16162b(ItemLeaseManagerImpl itemLeaseManagerImpl) {
                super(1);
                this.f66416g = itemLeaseManagerImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<ItemLease>, RideStates> invoke(RideStates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f66416g.mo55656s().m73665a(), it);
            }
        }

        public C16160l() {
            super(1);
        }

        /* renamed from: c */
        public static final List m55637c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final Pair m55636d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Pair<List<ItemLease>, RideStates>> invoke(Boolean shouldUpdate) {
            Intrinsics.checkNotNullParameter(shouldUpdate, "shouldUpdate");
            if (shouldUpdate.booleanValue()) {
                Z84<RideStates> mo75032o0 = ItemLeaseManagerImpl.this.f66386k.mo75032o0();
                final C16161a c16161a = C16161a.f66415g;
                Observable<RideStates> distinctUntilChanged = mo75032o0.distinctUntilChanged(new InterfaceC23492o() { // from class: dd2
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        List m55637c;
                        m55637c = ItemLeaseManagerImpl.C16160l.m55637c(Function1.this, obj);
                        return m55637c;
                    }
                });
                final C16162b c16162b = new C16162b(ItemLeaseManagerImpl.this);
                return distinctUntilChanged.map(new InterfaceC23492o() { // from class: ed2
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m55636d;
                        m55636d = ItemLeaseManagerImpl.C16160l.m55636d(Function1.this, obj);
                        return m55636d;
                    }
                });
            }
            return Observable.never();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/api/response/PagedCollection;", "Lco/bird/android/model/wire/WireLeaseObjectResponse;", "collection", "Lkotlin/Pair;", "", "Lco/bird/android/model/itemlease/ItemLease;", "Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/PagedCollection;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nItemLeaseManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$queryActiveLeases$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,476:1\n1549#2:477\n1620#2,3:478\n*S KotlinDebug\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$queryActiveLeases$1\n*L\n188#1:477\n188#1:478,3\n*E\n"})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$n */
    /* loaded from: classes4.dex */
    public static final class C16165n extends Lambda implements Function1<PagedCollection<WireLeaseObjectResponse>, Pair<? extends List<? extends ItemLease>, ? extends RideStates>> {
        public C16165n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<List<ItemLease>, RideStates> invoke(PagedCollection<WireLeaseObjectResponse> collection) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(collection, "collection");
            List<WireLeaseObjectResponse> items = collection.getItems();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireLeaseObjectResponse wireLeaseObjectResponse : items) {
                arrayList.add(ItemLeaseKt.toItemLease(wireLeaseObjectResponse));
            }
            return TuplesKt.m28425to(arrayList, ItemLeaseManagerImpl.this.f66386k.mo75032o0().m73665a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$o */
    /* loaded from: classes4.dex */
    public static final class C16166o extends Lambda implements Function0<Z84<Map<ItemLeaseType, ? extends List<? extends WireBird>>>> {
        public C16166o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Map<ItemLeaseType, ? extends List<? extends WireBird>>> invoke2() {
            return C38384b94.m64921a(ItemLeaseManagerImpl.this.f66398w);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$p */
    /* loaded from: classes4.dex */
    public static final class C16167p extends Lambda implements Function0<Z84<Map<ItemLeaseType, ? extends List<? extends WireBird>>>> {
        public C16167p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Map<ItemLeaseType, ? extends List<? extends WireBird>>> invoke2() {
            return C38384b94.m64921a(ItemLeaseManagerImpl.this.f66397v);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireLeaseReturnResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/WireLeaseReturnResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$q */
    /* loaded from: classes4.dex */
    public static final class C16168q extends Lambda implements Function1<WireLeaseReturnResponse, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/itemlease/ItemLease;", "leases", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$q$a */
        /* loaded from: classes4.dex */
        public static final class C16169a extends Lambda implements Function1<List<? extends ItemLease>, List<? extends ItemLease>> {

            /* renamed from: g */
            public final /* synthetic */ WireLeaseObjectResponse f66423g;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/itemlease/ItemLease;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/itemlease/ItemLease;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$q$a$a */
            /* loaded from: classes4.dex */
            public static final class C16170a extends Lambda implements Function1<ItemLease, Boolean> {

                /* renamed from: g */
                public final /* synthetic */ WireLeaseObjectResponse f66424g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16170a(WireLeaseObjectResponse wireLeaseObjectResponse) {
                    super(1);
                    this.f66424g = wireLeaseObjectResponse;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Boolean invoke(ItemLease it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(Intrinsics.areEqual(it.getId(), this.f66424g.getId()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16169a(WireLeaseObjectResponse wireLeaseObjectResponse) {
                super(1);
                this.f66423g = wireLeaseObjectResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<ItemLease> invoke(List<ItemLease> leases) {
                List mutableList;
                List<ItemLease> list;
                Intrinsics.checkNotNullParameter(leases, "leases");
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) leases);
                CollectionsKt__MutableCollectionsKt.removeAll(mutableList, (Function1) new C16170a(this.f66423g));
                list = CollectionsKt___CollectionsKt.toList(mutableList);
                return list;
            }
        }

        public C16168q() {
            super(1);
        }

        /* renamed from: a */
        public final void m55631a(WireLeaseReturnResponse wireLeaseReturnResponse) {
            ItemLeaseManagerImpl.this.f66394s.m71837i(new C16169a(wireLeaseReturnResponse.getLease()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireLeaseReturnResponse wireLeaseReturnResponse) {
            m55631a(wireLeaseReturnResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireLeaseReturnResponse;", "response", "Lco/bird/android/model/itemlease/LeaseReturnResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireLeaseReturnResponse;)Lco/bird/android/model/itemlease/LeaseReturnResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$r */
    /* loaded from: classes4.dex */
    public static final class C16171r extends Lambda implements Function1<WireLeaseReturnResponse, LeaseReturnResponse> {

        /* renamed from: g */
        public static final C16171r f66425g = new C16171r();

        public C16171r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final LeaseReturnResponse invoke(WireLeaseReturnResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new LeaseReturnResponse(ItemLeaseKt.toItemLease(response.getLease()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "habitatId", "Lio/reactivex/K;", "Lco/bird/android/model/itemlease/LeaseStartResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$s */
    /* loaded from: classes4.dex */
    public static final class C16172s extends Lambda implements Function1<String, InterfaceC23447K<? extends LeaseStartResponse>> {

        /* renamed from: h */
        public final /* synthetic */ ItemLeaseType f66427h;

        /* renamed from: i */
        public final /* synthetic */ String f66428i;

        /* renamed from: j */
        public final /* synthetic */ String f66429j;

        /* renamed from: k */
        public final /* synthetic */ WirePaymentAuthRequest f66430k;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireItemLeaseStartResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireItemLeaseStartResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$s$a */
        /* loaded from: classes4.dex */
        public static final class C16173a extends Lambda implements Function1<WireItemLeaseStartResponse, InterfaceC23447K<? extends WireItemLeaseStartResponse>> {

            /* renamed from: g */
            public final /* synthetic */ ItemLeaseManagerImpl f66431g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16173a(ItemLeaseManagerImpl itemLeaseManagerImpl) {
                super(1);
                this.f66431g = itemLeaseManagerImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends WireItemLeaseStartResponse> invoke(WireItemLeaseStartResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return this.f66431g.mo55682b().m33069Q().m33042m(AbstractC23442F.m33158H(response));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireItemLeaseStartResponse;", "response", "Lco/bird/android/model/itemlease/LeaseStartResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireItemLeaseStartResponse;)Lco/bird/android/model/itemlease/LeaseStartResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$s$b */
        /* loaded from: classes4.dex */
        public static final class C16174b extends Lambda implements Function1<WireItemLeaseStartResponse, LeaseStartResponse> {

            /* renamed from: g */
            public static final C16174b f66432g = new C16174b();

            public C16174b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final LeaseStartResponse invoke(WireItemLeaseStartResponse response) {
                ItemLease itemLease;
                Intrinsics.checkNotNullParameter(response, "response");
                WireLeaseObjectResponse lease = response.getLease();
                if (lease != null) {
                    itemLease = ItemLeaseKt.toItemLease(lease);
                } else {
                    itemLease = null;
                }
                return new LeaseStartResponse(itemLease, response.getPaymentAuth());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16172s(ItemLeaseType itemLeaseType, String str, String str2, WirePaymentAuthRequest wirePaymentAuthRequest) {
            super(1);
            this.f66427h = itemLeaseType;
            this.f66428i = str;
            this.f66429j = str2;
            this.f66430k = wirePaymentAuthRequest;
        }

        /* renamed from: c */
        public static final LeaseStartResponse m55625c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (LeaseStartResponse) tmp0.invoke(obj);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends LeaseStartResponse> invoke(String habitatId) {
            Intrinsics.checkNotNullParameter(habitatId, "habitatId");
            AbstractC23442F<WireItemLeaseStartResponse> m96588e = ItemLeaseManagerImpl.this.f66378c.m96588e(new WireItemLeaseStartRequest(habitatId, this.f66427h.toString(), this.f66428i, this.f66429j, this.f66430k));
            final C16173a c16173a = new C16173a(ItemLeaseManagerImpl.this);
            AbstractC23442F<R> m33165A = m96588e.m33165A(new InterfaceC23492o() { // from class: gd2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = ItemLeaseManagerImpl.C16172s.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C16174b c16174b = C16174b.f66432g;
            return m33165A.m33157I(new InterfaceC23492o() { // from class: hd2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    LeaseStartResponse m55625c;
                    m55625c = ItemLeaseManagerImpl.C16172s.m55625c(Function1.this, obj);
                    return m55625c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseStartResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/itemlease/LeaseStartResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nItemLeaseManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$startLease$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,476:1\n1#2:477\n*E\n"})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$t */
    /* loaded from: classes4.dex */
    public static final class C16175t extends Lambda implements Function1<LeaseStartResponse, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f66434h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16175t(WireBird wireBird) {
            super(1);
            this.f66434h = wireBird;
        }

        /* renamed from: a */
        public final void m55622a(LeaseStartResponse leaseStartResponse) {
            ItemLease lease = leaseStartResponse.getLease();
            if (lease != null) {
                ItemLeaseManagerImpl itemLeaseManagerImpl = ItemLeaseManagerImpl.this;
                itemLeaseManagerImpl.f66385j.m37566u1(this.f66434h, lease);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LeaseStartResponse leaseStartResponse) {
            m55622a(leaseStartResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/MobilePartner;", "partner", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/MobilePartner;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$u */
    /* loaded from: classes4.dex */
    public static final class C16176u extends Lambda implements Function1<MobilePartner, String> {
        public C16176u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(MobilePartner partner) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            String habitatId = partner.getHabitatId();
            if (habitatId == null) {
                String m86446d = C7241Rh.m86446d(ItemLeaseManagerImpl.this.f66379d);
                if (m86446d == null) {
                    return C7241Rh.m86447c(ItemLeaseManagerImpl.this.f66379d);
                }
                return m86446d;
            }
            return habitatId;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireLeaseAssetResponse;", "response", "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireLeaseAssetResponse;)Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$v */
    /* loaded from: classes4.dex */
    public static final class C16177v extends Lambda implements Function1<WireLeaseAssetResponse, LeaseSubmitAssetResponse> {

        /* renamed from: g */
        public static final C16177v f66436g = new C16177v();

        public C16177v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final LeaseSubmitAssetResponse invoke(WireLeaseAssetResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new LeaseSubmitAssetResponse(response.getSignedUrl());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "b", "Lco/bird/android/model/wire/WireBird;", "invoke", "(Lco/bird/android/model/wire/WireBird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$w */
    /* loaded from: classes4.dex */
    public static final class C16178w extends Lambda implements Function1<WireBird, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f66437g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16178w(WireBird wireBird) {
            super(1);
            this.f66437g = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WireBird b) {
            Intrinsics.checkNotNullParameter(b, "b");
            return Boolean.valueOf(b.isProbablySame(this.f66437g));
        }
    }

    public ItemLeaseManagerImpl(Context context, InterfaceC34207Lc2 client, InterfaceC6097Oh buildConfig, C51174wi2 deserializer, InterfaceC1880Ea analyticsManager, GI3 partnerManager, C36207Tq4 reactiveConfig, LifecycleOwner processLifecycleOwner, C22454gl appPreference, YR4 rideManager, InterfaceC10636aM birdManager, InterfaceC40001dr4 locationManager) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        List emptyList;
        Set emptySet;
        Map emptyMap;
        Map emptyMap2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f66377b = context;
        this.f66378c = client;
        this.f66379d = buildConfig;
        this.f66380e = deserializer;
        this.f66381f = analyticsManager;
        this.f66382g = partnerManager;
        this.f66383h = reactiveConfig;
        this.f66384i = processLifecycleOwner;
        this.f66385j = appPreference;
        this.f66386k = rideManager;
        this.f66387l = birdManager;
        this.f66388m = locationManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C16148c());
        this.f66389n = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16152e());
        this.f66390o = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16147b());
        this.f66391p = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C16167p());
        this.f66392q = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C16166o());
        this.f66393r = lazy5;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f66394s = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        emptySet = SetsKt__SetsKt.emptySet();
        this.f66395t = C37791a94.C10586a.create$default(c10586a, emptySet, null, 2, null);
        this.f66396u = C37791a94.C10586a.create$default(c10586a, m55688W(), null, 2, null);
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f66397v = C37791a94.C10586a.create$default(c10586a, emptyMap, null, 2, null);
        emptyMap2 = MapsKt__MapsKt.emptyMap();
        this.f66398w = C37791a94.C10586a.create$default(c10586a, emptyMap2, null, 2, null);
        processLifecycleOwner.getLifecycle().mo67008a(this);
    }

    /* renamed from: Z */
    public static final InterfaceC23447K m55685Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m55683a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final LeaseItemAvailabilityResponse m55681b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LeaseItemAvailabilityResponse) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m55680c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final Boolean m55678d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23434B m55676e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23496h m55674f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final Pair m55673g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m55672h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final LeaseReturnResponse m55671i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LeaseReturnResponse) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m55669j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final String m55667k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final InterfaceC23447K m55665l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final LeaseSubmitAssetResponse m55664m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LeaseSubmitAssetResponse) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final boolean m55660o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: A */
    public void mo55708A(ItemLeaseExemption exemption) {
        Intrinsics.checkNotNullParameter(exemption, "exemption");
        this.f66395t.m71837i(new C16149d(exemption, this));
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: B */
    public AbstractC23442F<LeaseSubmitAssetResponse> mo55707B(String leaseId, ItemLeaseAssetPurpose purpose, long j, String mimeType, boolean z, List<String> list) {
        List<String> autoScannedCodes = list;
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(autoScannedCodes, "autoScannedCodes");
        InterfaceC34207Lc2 interfaceC34207Lc2 = this.f66378c;
        String itemLeaseAssetPurpose = purpose.toString();
        if (!(!autoScannedCodes.isEmpty())) {
            autoScannedCodes = null;
        }
        AbstractC23442F<WireLeaseAssetResponse> m96587f = interfaceC34207Lc2.m96587f(new WireLeaseAssetRequest(leaseId, itemLeaseAssetPurpose, j, mimeType, z, autoScannedCodes));
        final C16177v c16177v = C16177v.f66436g;
        AbstractC23442F m33157I = m96587f.m33157I(new InterfaceC23492o() { // from class: Qc2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                LeaseSubmitAssetResponse m55664m0;
                m55664m0 = ItemLeaseManagerImpl.m55664m0(Function1.this, obj);
                return m55664m0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "client.submitLeaseAsset(…nedUrl,\n        )\n      }");
        return m33157I;
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: C */
    public boolean mo55706C(String birdId, ItemLeaseType leaseType) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        List<ItemLease> m73665a = mo55656s().m73665a();
        if ((m73665a instanceof Collection) && m73665a.isEmpty()) {
            return false;
        }
        for (ItemLease itemLease : m73665a) {
            if (itemLease.isLeaseForBirdId(birdId, leaseType)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: D */
    public Z84<Map<ItemLeaseType, List<WireBird>>> mo55705D() {
        return (Z84) this.f66392q.getValue();
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: E */
    public AbstractC23442F<LeaseStartResponse> mo55704E(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        String partnerId = bird.getPartnerId();
        if (partnerId == null) {
            partnerId = "";
        }
        AbstractC23442F<LeaseStartResponse> mo55651x = mo55651x(partnerId, ItemLeaseType.HELMET, "", bird.getId(), null);
        final C16175t c16175t = new C16175t(bird);
        AbstractC23442F<LeaseStartResponse> m33101w = mo55651x.m33101w(new InterfaceC23484g() { // from class: Pc2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ItemLeaseManagerImpl.m55669j0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun startLease(…ird, lease) }\n      }\n  }");
        return m33101w;
    }

    /* renamed from: W */
    public final List<WireBird> m55688W() {
        ArrayList arrayList = new ArrayList();
        for (C22454gl.C22457c c22457c : this.f66385j.m37751B().values()) {
            WireBird m37539c = c22457c.m37539c();
            if (m37539c != null) {
                arrayList.add(m37539c);
            }
        }
        return arrayList;
    }

    /* renamed from: X */
    public Z84<Set<ItemLeaseExemption>> m55687X() {
        return (Z84) this.f66390o.getValue();
    }

    /* renamed from: Y */
    public final AbstractC23442F<Pair<List<ItemLease>, List<WireBird>>> m55686Y(AbstractC23442F<Pair<List<ItemLease>, RideStates>> abstractC23442F) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        final C16153f c16153f = new C16153f();
        AbstractC23442F m33152N = abstractC23442F.m33165A(new InterfaceC23492o() { // from class: Rc2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55685Z;
                m55685Z = ItemLeaseManagerImpl.m55685Z(Function1.this, obj);
                return m55685Z;
            }
        }).m33152N(C24542a.m31934a());
        final C16155g c16155g = new C16155g();
        AbstractC23442F<Pair<List<ItemLease>, List<WireBird>>> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: Sc2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ItemLeaseManagerImpl.m55683a0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "fun Single<Pair<List<Ite…veLeaseBirds)\n      }\n  }");
        return m33101w;
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: a */
    public String mo55684a() {
        String absolutePath = this.f66377b.getCacheDir().getAbsolutePath();
        return absolutePath + "/itemlease";
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: b */
    public AbstractC23461c mo55682b() {
        AbstractC23442F<PagedCollection<WireLeaseObjectResponse>> m96591b = this.f66378c.m96591b();
        final C16165n c16165n = new C16165n();
        AbstractC23442F<Pair<List<ItemLease>, RideStates>> m33157I = m96591b.m33157I(new InterfaceC23492o() { // from class: bd2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m55673g0;
                m55673g0 = ItemLeaseManagerImpl.m55673g0(Function1.this, obj);
                return m55673g0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "override fun queryActive…     .ignoreElement()\n  }");
        AbstractC23461c m33159G = m55686Y(m33157I).m33122l(100L, TimeUnit.MILLISECONDS).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun queryActive…     .ignoreElement()\n  }");
        return m33159G;
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: d */
    public Z84<List<WireBird>> mo55679d() {
        return (Z84) this.f66391p.getValue();
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: e */
    public void mo55677e() {
        C41318g46.m40163a("cleared lease exemptions", new Object[0]);
        this.f66395t.m71836j();
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: f */
    public void mo55675f(WireBird bird, ItemLeaseType leaseType) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        m55658p0(this.f66397v, bird, leaseType);
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: j */
    public void mo55670j(WireBird bird, ItemLeaseType leaseType) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        m55662n0(this.f66398w, bird, leaseType);
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: k */
    public boolean mo55668k(WireBird bird, ItemLeaseType leaseType) {
        boolean z;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        Set<ItemLeaseExemption> m73665a = m55687X().m73665a();
        if ((m73665a instanceof Collection) && m73665a.isEmpty()) {
            return false;
        }
        for (ItemLeaseExemption itemLeaseExemption : m73665a) {
            if (itemLeaseExemption.isValid(C36441Uq4.m80769c(this.f66383h, itemLeaseExemption.getBird())) && itemLeaseExemption.getLeaseType() == leaseType && itemLeaseExemption.getBird().isProbablySame(bird)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: l */
    public boolean mo55666l(WireBird bird, ItemLeaseType leaseType) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        return mo55706C(bird.getId(), leaseType);
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: n */
    public boolean mo55663n(WireBird bird, ItemLeaseType leaseType) {
        boolean z;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        List<WireBird> list = this.f66397v.getValue().get(leaseType);
        if (list == null) {
            return false;
        }
        List<WireBird> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (WireBird wireBird : list2) {
                if (wireBird.isProbablySame(bird)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: n0 */
    public final void m55662n0(C37791a94<Map<ItemLeaseType, List<WireBird>>> c37791a94, WireBird wireBird, ItemLeaseType itemLeaseType) {
        List mutableList;
        List list;
        Map mutableMap;
        Map<ItemLeaseType, List<WireBird>> map;
        Map<ItemLeaseType, List<WireBird>> value = c37791a94.getValue();
        List<WireBird> list2 = value.get(itemLeaseType);
        if (list2 == null) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list2);
        final C16178w c16178w = new C16178w(wireBird);
        mutableList.removeIf(new Predicate() { // from class: Wc2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m55660o0;
                m55660o0 = ItemLeaseManagerImpl.m55660o0(Function1.this, obj);
                return m55660o0;
            }
        });
        list = CollectionsKt___CollectionsKt.toList(mutableList);
        mutableMap = MapsKt__MapsKt.toMutableMap(value);
        mutableMap.put(itemLeaseType, list);
        map = MapsKt__MapsKt.toMap(mutableMap);
        c37791a94.accept(map);
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: o */
    public AbstractC23442F<LeaseItemAvailabilityResponse> mo55661o(ItemLeaseType leaseType, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        AbstractC23442F<WireLeaseItemAvailabilityResponse> m96590c = this.f66378c.m96590c(new WireLeaseItemAvailabilityRequest(leaseType.toString(), str, str2, z));
        final C16156h c16156h = C16156h.f66410g;
        AbstractC23442F m33157I = m96590c.m33157I(new InterfaceC23492o() { // from class: Oc2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                LeaseItemAvailabilityResponse m55681b0;
                m55681b0 = ItemLeaseManagerImpl.m55681b0(Function1.this, obj);
                return m55681b0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "client.markLeaseItemAvai…      )\n        }\n      }");
        return m33157I;
    }

    @Override // p000.VX0
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        C41318g46.m40163a("onAppForeground called", new Object[0]);
        AbstractC23461c m33061Z = mo55682b().m33061Z(30L, TimeUnit.SECONDS);
        final C16158j c16158j = C16158j.f66412g;
        AbstractC23461c m33069Q = m33061Z.m33084B(new InterfaceC23484g() { // from class: Nc2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ItemLeaseManagerImpl.m55680c0(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "queryActiveLeases()\n    …\n      .onErrorComplete()");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(mo55656s(), mo55679d(), C16157i.f66411a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C16159k c16159k = C16159k.f66413g;
        Observable distinctUntilChanged = combineLatest.map(new InterfaceC23492o() { // from class: Tc2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m55678d0;
                m55678d0 = ItemLeaseManagerImpl.m55678d0(Function1.this, obj);
                return m55678d0;
            }
        }).distinctUntilChanged();
        final C16160l c16160l = new C16160l();
        Observable flatMap = distinctUntilChanged.flatMap(new InterfaceC23492o() { // from class: Uc2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m55676e0;
                m55676e0 = ItemLeaseManagerImpl.m55676e0(Function1.this, obj);
                return m55676e0;
            }
        });
        final C16163m c16163m = new C16163m();
        AbstractC23461c flatMapCompletable = flatMap.flatMapCompletable(new InterfaceC23492o() { // from class: Vc2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m55674f0;
                m55674f0 = ItemLeaseManagerImpl.m55674f0(Function1.this, obj);
                return m55674f0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun onStart(own…))\n      .subscribe()\n  }");
        AndroidLifecycleScopeProvider m45197b2 = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b2, "AndroidLifecycleScopeProvider.from(this)");
        Object m33041n2 = flatMapCompletable.m33041n(AutoDispose.m45239a(m45197b2));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: p */
    public ItemLease mo55659p(String birdId, ItemLeaseType leaseType) {
        Object obj;
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        Iterator<T> it = mo55656s().m73665a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ItemLease) obj).isLeaseForBirdId(birdId, leaseType)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ItemLease) obj;
    }

    /* renamed from: p0 */
    public final void m55658p0(C37791a94<Map<ItemLeaseType, List<WireBird>>> c37791a94, WireBird wireBird, ItemLeaseType itemLeaseType) {
        List plus;
        Map mutableMap;
        Map<ItemLeaseType, List<WireBird>> map;
        Map<ItemLeaseType, List<WireBird>> value = c37791a94.getValue();
        List<WireBird> list = value.get(itemLeaseType);
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends WireBird>) ((Collection<? extends Object>) list), wireBird);
        mutableMap = MapsKt__MapsKt.toMutableMap(value);
        mutableMap.put(itemLeaseType, plus);
        map = MapsKt__MapsKt.toMap(mutableMap);
        c37791a94.accept(map);
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: q */
    public void mo55657q(WireBird bird, ItemLeaseType leaseType) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        m55662n0(this.f66397v, bird, leaseType);
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: s */
    public Z84<List<ItemLease>> mo55656s() {
        return (Z84) this.f66389n.getValue();
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: t */
    public boolean mo55655t(WireBird bird, ItemLeaseType leaseType) {
        boolean z;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        List<WirePhysicalLock> physicalLocks = bird.getPhysicalLocks();
        if (physicalLocks == null) {
            return false;
        }
        List<WirePhysicalLock> list = physicalLocks;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (WirePhysicalLock wirePhysicalLock : list) {
                if (mo55653v(C36441Uq4.m80769c(this.f66383h, bird), wirePhysicalLock, leaseType)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: u */
    public AbstractC23442F<LeaseReturnResponse> mo55654u(String leaseId) {
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        AbstractC23442F<WireLeaseReturnResponse> m96589d = this.f66378c.m96589d(new WireLeaseReturnRequest(leaseId));
        final C16168q c16168q = new C16168q();
        AbstractC23442F<WireLeaseReturnResponse> m33101w = m96589d.m33101w(new InterfaceC23484g() { // from class: Zc2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ItemLeaseManagerImpl.m55672h0(Function1.this, obj);
            }
        });
        final C16171r c16171r = C16171r.f66425g;
        AbstractC23442F m33157I = m33101w.m33157I(new InterfaceC23492o() { // from class: ad2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                LeaseReturnResponse m55671i0;
                m55671i0 = ItemLeaseManagerImpl.m55671i0(Function1.this, obj);
                return m55671i0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "override fun returnLease…e()\n        )\n      }\n  }");
        return m33157I;
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: v */
    public boolean mo55653v(Config config, WirePhysicalLock physicalLock, ItemLeaseType leaseType) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(physicalLock, "physicalLock");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        int i = C16146a.$EnumSwitchMapping$0[leaseType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        } else if (!config.getLeaseConfig().getLeaseTypes().getHelmet().getEnabled() || physicalLock.getPurpose() != PhysicalLockPurpose.HELMET) {
            return false;
        } else {
            if (physicalLock.isSolebe() && !Intrinsics.areEqual(config.getRideConfig().getSmartlockConfig().getEnableSolebeLocks(), Boolean.TRUE)) {
                return false;
            }
            return true;
        }
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: w */
    public Z84<Map<ItemLeaseType, List<WireBird>>> mo55652w() {
        return (Z84) this.f66393r.getValue();
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: x */
    public AbstractC23442F<LeaseStartResponse> mo55651x(String str, ItemLeaseType leaseType, String leasedItemId, String str2, WirePaymentAuthRequest wirePaymentAuthRequest) {
        AbstractC23442F m33158H;
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        Intrinsics.checkNotNullParameter(leasedItemId, "leasedItemId");
        if (str != null) {
            AbstractC23442F<MobilePartner> mo97362u = this.f66382g.mo97362u(str);
            final C16176u c16176u = new C16176u();
            m33158H = mo97362u.m33157I(new InterfaceC23492o() { // from class: Xc2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m55667k0;
                    m55667k0 = ItemLeaseManagerImpl.m55667k0(Function1.this, obj);
                    return m55667k0;
                }
            }).m33148R(C7241Rh.m86447c(this.f66379d));
        } else {
            m33158H = AbstractC23442F.m33158H(C7241Rh.m86447c(this.f66379d));
        }
        Intrinsics.checkNotNullExpressionValue(m33158H, "override fun startLease(…)\n          }\n      }\n  }");
        final C16172s c16172s = new C16172s(leaseType, leasedItemId, str2, wirePaymentAuthRequest);
        AbstractC23442F<LeaseStartResponse> m33165A = m33158H.m33165A(new InterfaceC23492o() { // from class: Yc2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55665l0;
                m55665l0 = ItemLeaseManagerImpl.m55665l0(Function1.this, obj);
                return m55665l0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun startLease(…)\n          }\n      }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: y */
    public void mo55650y(WireBird bird, ItemLeaseType leaseType) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        m55658p0(this.f66398w, bird, leaseType);
    }

    @Override // p000.InterfaceC34441Mc2
    /* renamed from: z */
    public ItemLease mo55649z(WireBird bird, ItemLeaseType leaseType) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        return mo55659p(bird.getId(), leaseType);
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/itemlease/ItemLease;", "Lco/bird/android/model/wire/WireBird;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$k */
    /* loaded from: classes4.dex */
    public static final class C16159k extends Lambda implements Function1<Pair<? extends List<? extends ItemLease>, ? extends List<? extends WireBird>>, Boolean> {

        /* renamed from: g */
        public static final C16159k f66413g = new C16159k();

        public C16159k() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends List<ItemLease>, ? extends List<WireBird>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<ItemLease> component1 = pair.component1();
            List<WireBird> component2 = pair.component2();
            int size = component1.size();
            int size2 = component2.size();
            C41318g46.m40163a("leases size = " + size + ", lease bird size = " + size2, new Object[0]);
            return Boolean.valueOf(component1.size() > component2.size());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends List<? extends ItemLease>, ? extends List<? extends WireBird>> pair) {
            return invoke2((Pair<? extends List<ItemLease>, ? extends List<WireBird>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/itemlease/ItemLease;", "Lco/bird/android/model/RideStates;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$m */
    /* loaded from: classes4.dex */
    public static final class C16163m extends Lambda implements Function1<Pair<? extends List<? extends ItemLease>, ? extends RideStates>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.manager.itemlease.ItemLeaseManagerImpl$m$a */
        /* loaded from: classes4.dex */
        public static final class C16164a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C16164a f66418g = new C16164a();

            public C16164a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Ignoring error while updating item lease birds: ", new Object[0]);
            }
        }

        public C16163m() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<? extends List<ItemLease>, RideStates> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C41318g46.m40163a("Updating lease birds now", new Object[0]);
            ItemLeaseManagerImpl itemLeaseManagerImpl = ItemLeaseManagerImpl.this;
            AbstractC23442F<Pair<List<ItemLease>, RideStates>> m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(pair.component1(), pair.component2()));
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(leases to rideStates)");
            AbstractC23461c m33159G = itemLeaseManagerImpl.m55686Y(m33158H).m33159G();
            final C16164a c16164a = C16164a.f66418g;
            return m33159G.m33084B(new InterfaceC23484g() { // from class: fd2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ItemLeaseManagerImpl.C16163m.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends List<? extends ItemLease>, ? extends RideStates> pair) {
            return invoke2((Pair<? extends List<ItemLease>, RideStates>) pair);
        }
    }
}
