package p000;

import android.util.LruCache;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.coreinterface.manager.RideRequirementTimeoutException;
import co.bird.android.model.Agreement;
import co.bird.android.model.AgreementKey;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.Balance;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.BirdPaymentKt;
import co.bird.android.model.RideRequirement;
import co.bird.android.model.TaxInformation;
import co.bird.android.model.User;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.constant.RideRequirementReason;
import co.bird.android.model.identification.IdentificationAcceptableManualEntry;
import co.bird.android.model.identification.IdentificationAcceptableMethod;
import co.bird.android.model.identification.IdentificationIntent;
import co.bird.android.model.identification.IdentificationIntentPermissionStatus;
import co.bird.android.model.identification.IdentificationRequestIdentifier;
import co.bird.android.model.identification.IdentificationStatus;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WirePrivateBird;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.AutoPayPlanConfig;
import co.bird.android.model.wire.configs.BankRedirectConfig;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.HelmetSelfieConfig;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.android.model.wire.configs.RiderHomeAreaPromptConfig;
import co.bird.android.model.wire.configs.TaxInformationConfig;
import co.bird.api.response.AutoReloadFromPreloadConfig;
import co.bird.api.response.ReloadConfigResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Card;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24530g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.B55;
import p000.InterfaceC44637lg6;
import p000.InterfaceC44647lh6;
import p000.InterfaceC44791lw0;
import p000.J35;
@Metadata(m28433d1 = {"\u0000\u008a\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r*\u001e\u009b\u0001\u009f\u0001£\u0001§\u0001«\u0001¯\u0001³\u0001·\u0001»\u0001¿\u0001Ã\u0001Ç\u0001Ë\u0001Ï\u0001Ó\u0001\b\u0007\u0018\u0000 ë\u00012\u00020\u0001:\u0002\f|B\u0084\u0001\b\u0007\u0012\u0006\u0010Q\u001a\u00020O\u0012\u0006\u0010T\u001a\u00020R\u0012\u0006\u0010W\u001a\u00020U\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010b\u001a\u00020`\u0012\u0006\u0010f\u001a\u00020c\u0012\u0006\u0010i\u001a\u00020g\u0012\u0006\u0010l\u001a\u00020j\u0012\u0006\u0010o\u001a\u00020m\u0012\u0006\u0010r\u001a\u00020p\u0012\u0006\u0010v\u001a\u00020s\u0012\u0006\u0010z\u001a\u00020w\u0012\u0006\u0010~\u001a\u00020{\u0012\u0007\u0010\u0082\u0001\u001a\u00020\u007f¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0002J&\u0010$\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u001fH\u0002J(\u0010'\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0002J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020%0)2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010,\u001a\u00020\u001aH\u0002J\u0010\u00100\u001a\u00020%2\u0006\u0010/\u001a\u00020.H\u0002J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J2\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u00103\u001a\u00020%H\u0002J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u0002072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J(\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u0002072\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010;\u001a\u0004\u0018\u00010:H\u0002J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u001e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010B\u001a\u00020AH\u0002J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010E\u001a\u000207H\u0002J\b\u0010G\u001a\u00020\u0007H\u0002J5\u0010M\u001a\u00020%2\u0006\u0010I\u001a\u00020H2\b\u0010J\u001a\u0004\u0018\u00010H2\b\u0010K\u001a\u0004\u0018\u00010H2\b\u0010L\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u0014\u0010T\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010SR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010hR\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010kR\u0014\u0010o\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010nR\u0014\u0010r\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010qR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R$\u0010\u0086\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020%0\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0005\bY\u0010\u008e\u0001R*\u0010\u0095\u0001\u001a\u0004\u0018\u00010H8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0005\b]\u0010\u0094\u0001R\u001f\u0010\u009a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010ª\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010®\u0001\u001a\u00030«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010²\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0018\u0010¶\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0018\u0010º\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010¾\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010Â\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Æ\u0001\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0018\u0010Ê\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ö\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u001f\u0010Ú\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bd\u0010Û\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010\u008d\u0001R\u001a\u0010â\u0001\u001a\u0005\u0018\u00010ß\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bà\u0001\u0010á\u0001R\u0016\u00103\u001a\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u0017\u0010æ\u0001\u001a\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010ä\u0001R\u0019\u0010è\u0001\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010\u008d\u0001¨\u0006ì\u0001"}, m28432d2 = {"LB55;", "LJ35;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "i", "LJ35$a;", "rideRequirementRequestContext", "", "f", "rideRequirement", "j", C17296a.f69688o, "b", "k", "Lco/bird/android/model/wire/WireBird;", "bird", "c", "Lco/bird/android/model/wire/WireRide;", "ride", "h", "Lco/bird/android/model/User;", "user", "Lco/bird/android/model/wire/configs/Config;", "config", "w3", "(Lco/bird/android/model/User;Lco/bird/android/model/wire/configs/Config;)Lio/reactivex/p;", "", "partnerId", "userGuestId", "Lio/reactivex/c;", "m3", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "retries", "f1", "", "needsPreload", "h3", "A2", "Lio/reactivex/F;", "c1", "X1", "experimentName", "b1", "Lco/bird/android/model/Balance;", "balance", "o1", "L1", "G2", "skipBarcodeScanRequirement", "D1", "o2", "c3", "Lco/bird/android/model/wire/configs/RideConfig;", "v1", "p1", "Lco/bird/android/model/BirdPayment;", "defaultBirdPayment", "B1", "j2", "v2", "d2", "Q1", "Lco/bird/android/model/wire/configs/TaxInformationConfig;", "taxInfoConfig", "W2", "L2", "rideConfig", "R2", "q3", "", "rideCount", "isAtLeast", "isNoMoreThan", "isMultipleOf", "e1", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Z", "Lgl;", "Lgl;", "preference", "Llh6;", "Llh6;", "userManager", "Llg6;", "Llg6;", "userAgreementManager", "LAM3;", DateTokenConverter.CONVERTER_KEY, "LAM3;", "paymentManagerV2", "LVM3;", "e", "LVM3;", "paymentManagerV3", "LzN3;", "LzN3;", "paymentMethodManager", "Lqi1;", "g", "Lqi1;", "experimentManager", "LTq4;", "LTq4;", "reactiveConfig", "LHZ5;", "LHZ5;", "taxInformationManager", "LmT1;", "LmT1;", "identificationManager", "LMc2;", "LMc2;", "itemLeaseManager", "LBL1;", "l", "LBL1;", "helmetSelfieManager", "LV74;", "m", "LV74;", "promoManager", "LWU4;", "n", "LWU4;", "ridePassManager", "Llw0;", "o", "Llw0;", "configurableTutorialManager", "Landroid/util/LruCache;", "p", "Landroid/util/LruCache;", "flockTogetherShownCache", "q", "LJ35$a;", "currentRideRequirementRequestContext", "r", "Ljava/lang/String;", "m1", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "soberStartBirdId", "s", "Ljava/lang/Integer;", "h1", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "localSurveyShownForRideCountNumber", "", "LB55$n;", "t", "Ljava/util/Set;", "completedRideRequirementChecks", "B55$l", "u", "LB55$l;", "PreloadV2", "B55$j", "v", "LB55$j;", "Payment", "B55$c", "w", "LB55$c;", "DriversLicense", "B55$g", "x", "LB55$g;", "HelmetLeasePrompt", "B55$h", "y", "LB55$h;", "HelmetSelfieConfirmationPrompt", "B55$p", "z", "LB55$p;", "TaxInformation", "B55$e", "A", "LB55$e;", "FlockTogether", "B55$q", "B", "LB55$q;", "UserAgreement", "B55$a", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LB55$a;", "AutoPay", "B55$f", "D", "LB55$f;", "GooglePay", "B55$k", "E", "LB55$k;", "PendingIdentificationCheck", "B55$m", "F", "LB55$m;", "Quiz", "B55$o", "G", "LB55$o;", "SoberStart", "B55$i", "H", "LB55$i;", "LocalsSurveyPrompt", "B55$d", "I", "LB55$d;", "Empty", "", "J", "Ljava/util/List;", "rideRequirementChecks", "()LJ35$a;", "g1", "()Lco/bird/android/model/wire/WireBird;", "n1", "Lco/bird/android/model/constant/RideRequirementReason;", "i1", "()Lco/bird/android/model/constant/RideRequirementReason;", "rideRequirementReason", "k1", "()Z", "l1", "skipPastGooglePay", "j1", "sessionId", "<init>", "(Lgl;Llh6;Llg6;LAM3;LVM3;LzN3;Lqi1;LTq4;LHZ5;LmT1;LMc2;LBL1;LV74;LWU4;Llw0;)V", "K", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideRequirementManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideRequirementManagerImpl.kt\nco/bird/android/app/manager/RideRequirementManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 Singles.kt\nio/reactivex/rxkotlin/Singles\n*L\n1#1,992:1\n1#2:993\n1054#3:994\n1549#3:995\n1620#3,3:996\n1747#3,3:1001\n37#4,2:999\n51#5,2:1004\n*S KotlinDebug\n*F\n+ 1 RideRequirementManagerImpl.kt\nco/bird/android/app/manager/RideRequirementManagerImpl\n*L\n195#1:994\n200#1:995\n200#1:996,3\n506#1:1001,3\n251#1:999,2\n556#1:1004,2\n*E\n"})
/* renamed from: B55 */
/* loaded from: classes2.dex */
public final class B55 implements J35 {

    /* renamed from: K */
    public static final C0456b f1650K = new C0456b(null);

    /* renamed from: L */
    public static final int f1651L = 8;

    /* renamed from: A */
    public final C0464e f1652A;

    /* renamed from: B */
    public final C0499q f1653B;

    /* renamed from: C */
    public final C0452a f1654C;

    /* renamed from: D */
    public final C0467f f1655D;

    /* renamed from: E */
    public final C0482k f1656E;

    /* renamed from: F */
    public final C0488m f1657F;

    /* renamed from: G */
    public final C0493o f1658G;

    /* renamed from: H */
    public final C0476i f1659H;

    /* renamed from: I */
    public final C0461d f1660I;

    /* renamed from: J */
    public final List<InterfaceC0491n> f1661J;

    /* renamed from: a */
    public final C22454gl f1662a;

    /* renamed from: b */
    public final InterfaceC44647lh6 f1663b;

    /* renamed from: c */
    public final InterfaceC44637lg6 f1664c;

    /* renamed from: d */
    public final AM3 f1665d;

    /* renamed from: e */
    public final VM3 f1666e;

    /* renamed from: f */
    public final InterfaceC52757zN3 f1667f;

    /* renamed from: g */
    public final InterfaceC47617qi1 f1668g;

    /* renamed from: h */
    public final C36207Tq4 f1669h;

    /* renamed from: i */
    public final HZ5 f1670i;

    /* renamed from: j */
    public final InterfaceC45102mT1 f1671j;

    /* renamed from: k */
    public final InterfaceC34441Mc2 f1672k;

    /* renamed from: l */
    public final BL1 f1673l;

    /* renamed from: m */
    public final V74 f1674m;

    /* renamed from: n */
    public final WU4 f1675n;

    /* renamed from: o */
    public final InterfaceC44791lw0 f1676o;

    /* renamed from: p */
    public final LruCache<String, Boolean> f1677p;

    /* renamed from: q */
    public J35.C3879a f1678q;

    /* renamed from: r */
    public String f1679r;

    /* renamed from: s */
    public Integer f1680s;

    /* renamed from: t */
    public final Set<InterfaceC0491n> f1681t;

    /* renamed from: u */
    public final C0485l f1682u;

    /* renamed from: v */
    public final C0479j f1683v;

    /* renamed from: w */
    public final C0458c f1684w;

    /* renamed from: x */
    public final C0470g f1685x;

    /* renamed from: y */
    public final C0473h f1686y;

    /* renamed from: z */
    public final C0496p f1687z;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$A */
    /* loaded from: classes2.dex */
    public static final class C0408A extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0408A f1688g = new C0408A();

        public C0408A() {
            super(1);
        }

        /* renamed from: a */
        public final void m114474a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToAutoPay emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114474a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$A0 */
    /* loaded from: classes2.dex */
    public static final class C0409A0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0409A0 f1689g = new C0409A0();

        public C0409A0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114473a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToUserAgreement subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114473a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Balance;", "balance", "Lio/reactivex/u;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Balance;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$B */
    /* loaded from: classes2.dex */
    public static final class C0410B extends Lambda implements Function1<Balance, InterfaceC24574u<? extends RideRequirement>> {

        /* renamed from: g */
        public final /* synthetic */ RideConfig f1690g;

        /* renamed from: h */
        public final /* synthetic */ B55 f1691h;

        /* renamed from: i */
        public final /* synthetic */ User f1692i;

        /* renamed from: j */
        public final /* synthetic */ boolean f1693j;

        /* renamed from: k */
        public final /* synthetic */ BirdPayment f1694k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0410B(RideConfig rideConfig, B55 b55, User user, boolean z, BirdPayment birdPayment) {
            super(1);
            this.f1690g = rideConfig;
            this.f1691h = b55;
            this.f1692i = user;
            this.f1693j = z;
            this.f1694k = birdPayment;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends RideRequirement> invoke(Balance balance) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(balance, "balance");
            boolean z3 = true;
            if (balance.getBalance() > this.f1690g.getAutoPayMandatoryMinBalance()) {
                z = true;
            } else {
                z = false;
            }
            Integer m37739E = this.f1691h.f1662a.m37739E();
            int autoPayNagEveryRideCount = this.f1690g.getAutoPayNagEveryRideCount();
            if (m37739E == null && this.f1692i.getRideCount() >= this.f1690g.getAutoPayStartAfterRideCount()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (m37739E == null || m37739E.intValue() < 0 || autoPayNagEveryRideCount <= 0 || this.f1692i.getRideCount() < m37739E.intValue() + autoPayNagEveryRideCount) {
                z3 = false;
            }
            if (!Intrinsics.areEqual(balance.getAutoPayActive(), Boolean.TRUE) && this.f1690g.getAutoPayPromptFirst() && this.f1693j && this.f1690g.getAutoPayStartAfterRideCount() >= 0 && !z && (this.f1690g.getAutoPayMandatory() || z2 || z3)) {
                return AbstractC24507p.m32068G(new RideRequirement.AutoPayV2(this.f1690g, this.f1692i, balance, this.f1694k));
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$B0 */
    /* loaded from: classes2.dex */
    public static final class C0411B0 extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0411B0 f1695g = new C0411B0();

        public C0411B0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114471a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToUserAgreement emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114471a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZV1;", "it", "Lio/reactivex/K;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "b", "(LZV1;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$C */
    /* loaded from: classes2.dex */
    public static final class C0412C extends Lambda implements Function1<ZV1, InterfaceC23447K<? extends Optional<ZV1>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "LZV1;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$C$a */
        /* loaded from: classes2.dex */
        public static final class C0413a extends Lambda implements Function1<Long, Optional<ZV1>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1697g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0413a(B55 b55) {
                super(1);
                this.f1697g = b55;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<ZV1> invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f1697g.f1671j.mo25562g().m73665a();
            }
        }

        public C0412C() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m114468c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Optional<ZV1>> invoke(ZV1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<Long> m33133f0 = AbstractC23442F.m33133f0(10L, TimeUnit.MILLISECONDS);
            final C0413a c0413a = new C0413a(B55.this);
            return m33133f0.m33157I(new InterfaceC23492o() { // from class: P55
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m114468c;
                    m114468c = B55.C0412C.m114468c(Function1.this, obj);
                    return m114468c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltg1;", "errorResponse", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ltg1;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$C0 */
    /* loaded from: classes2.dex */
    public static final class C0414C0 extends Lambda implements Function1<C49375tg1, InterfaceC24574u<? extends C49375tg1>> {

        /* renamed from: g */
        public static final C0414C0 f1698g = new C0414C0();

        public C0414C0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends C49375tg1> invoke(C49375tg1 errorResponse) {
            Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
            return AbstractC24507p.m32068G(errorResponse);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$D */
    /* loaded from: classes2.dex */
    public static final class C0415D extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0415D f1699g = new C0415D();

        public C0415D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "error in maybeRedirectToDLUsingIdentificationServiceFlow, will continue without verifying this step", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "error", "Lio/reactivex/u;", "Ltg1;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$D0 */
    /* loaded from: classes2.dex */
    public static final class C0416D0 extends Lambda implements Function1<Throwable, InterfaceC24574u<? extends C49375tg1>> {

        /* renamed from: g */
        public static final C0416D0 f1700g = new C0416D0();

        public C0416D0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends C49375tg1> invoke(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return AbstractC24507p.m32023v(error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LZV1;", "identificationState", "Lio/reactivex/u;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$E */
    /* loaded from: classes2.dex */
    public static final class C0417E extends Lambda implements Function1<Optional<ZV1>, InterfaceC24574u<? extends RideRequirement>> {

        /* renamed from: g */
        public final /* synthetic */ boolean f1701g;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: B55$E$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0418a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IdentificationStatus.values().length];
                try {
                    iArr[IdentificationStatus.ACCEPTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IdentificationStatus.NOT_REQUIRED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IdentificationStatus.PENDING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IdentificationStatus.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[IdentificationStatus.REJECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[IdentificationStatus.REQUIRED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0417E(boolean z) {
            super(1);
            this.f1701g = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends RideRequirement> invoke(Optional<ZV1> identificationState) {
            IdentificationIntentPermissionStatus m73012b;
            List<IdentificationAcceptableMethod> acceptableMethods;
            Intrinsics.checkNotNullParameter(identificationState, "identificationState");
            ZV1 m59035e = identificationState.m59035e();
            if (m59035e != null && (m73012b = m59035e.m73012b()) != null) {
                switch (C0418a.$EnumSwitchMapping$0[m73012b.getStatus().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return AbstractC24507p.m32024u();
                    case 5:
                    case 6:
                        boolean z = false;
                        if (m73012b.getManualEntryOfferBeforeScan()) {
                            IdentificationAcceptableManualEntry acceptableManualEntry = m73012b.getAcceptableManualEntry();
                            Intrinsics.checkNotNull(acceptableManualEntry);
                            if (m73012b.getAcceptableMethods() != null && (!acceptableMethods.isEmpty())) {
                                z = true;
                            }
                            AbstractC24507p m32068G = AbstractC24507p.m32068G(new RideRequirement.DirectManualEntryIdentification(acceptableManualEntry, z));
                            Intrinsics.checkNotNullExpressionValue(m32068G, "{\n                Maybe.…       ))\n              }");
                            return m32068G;
                        } else if (m73012b.countriesAllowingBarcode().contains(Locale.getDefault().getCountry()) && !this.f1701g) {
                            AbstractC24507p m32068G2 = AbstractC24507p.m32068G(RideRequirement.ScanDriverLicenseWithIdentification.INSTANCE);
                            Intrinsics.checkNotNullExpressionValue(m32068G2, "{\n                Maybe.…fication)\n              }");
                            return m32068G2;
                        } else {
                            List<IdentificationAcceptableMethod> acceptableMethods2 = m73012b.getAcceptableMethods();
                            if (acceptableMethods2 == null || acceptableMethods2.isEmpty()) {
                                z = true;
                            }
                            if (z) {
                                AbstractC24507p m32068G3 = AbstractC24507p.m32068G(RideRequirement.IdentificationScanRequiresAppUpgrade.INSTANCE);
                                Intrinsics.checkNotNullExpressionValue(m32068G3, "{\n                Maybe.…pUpgrade)\n              }");
                                return m32068G3;
                            }
                            AbstractC24507p m32068G4 = AbstractC24507p.m32068G(RideRequirement.SelectIdentificationMethod.INSTANCE);
                            Intrinsics.checkNotNullExpressionValue(m32068G4, "{\n                Maybe.…onMethod)\n              }");
                            return m32068G4;
                        }
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltg1;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ltg1;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$E0 */
    /* loaded from: classes2.dex */
    public static final class C0419E0 extends Lambda implements Function1<C49375tg1, InterfaceC23496h> {

        /* renamed from: g */
        public static final C0419E0 f1702g = new C0419E0();

        public C0419E0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C49375tg1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC23461c.m33080F(new Throwable(it.toString()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$F */
    /* loaded from: classes2.dex */
    public static final class C0420F extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0420F f1703g = new C0420F();

        public C0420F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToDLUsingIdentificationServiceFlow error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$F0 */
    /* loaded from: classes2.dex */
    public static final class C0421F0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0421F0 f1704g = new C0421F0();

        public C0421F0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "refreshMissingData error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$G */
    /* loaded from: classes2.dex */
    public static final class C0422G extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0422G f1705g = new C0422G();

        public C0422G() {
            super(1);
        }

        /* renamed from: a */
        public final void m114462a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToDLUsingIdentificationServiceFlow subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114462a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$G0 */
    /* loaded from: classes2.dex */
    public static final class C0423G0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0423G0 f1706g = new C0423G0();

        public C0423G0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114461a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("refreshMissingData subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114461a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$H */
    /* loaded from: classes2.dex */
    public static final class C0424H extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0424H f1707g = new C0424H();

        public C0424H() {
            super(1);
        }

        /* renamed from: a */
        public final void m114460a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToDLUsingIdentificationServiceFlow emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114460a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$H0 */
    /* loaded from: classes2.dex */
    public static final class C0425H0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0425H0 f1708g = new C0425H0();

        public C0425H0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "rideStart error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$I */
    /* loaded from: classes2.dex */
    public static final class C0426I extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0426I f1709g = new C0426I();

        public C0426I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToDriverLicense error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$I0 */
    /* loaded from: classes2.dex */
    public static final class C0427I0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0427I0 f1710g = new C0427I0();

        public C0427I0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114459a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("rideStart subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114459a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$J */
    /* loaded from: classes2.dex */
    public static final class C0428J extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0428J f1711g = new C0428J();

        public C0428J() {
            super(1);
        }

        /* renamed from: a */
        public final void m114458a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToDriverLicense subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114458a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$J0 */
    /* loaded from: classes2.dex */
    public static final class C0429J0 extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0429J0 f1712g = new C0429J0();

        public C0429J0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114457a(RideRequirement rideRequirement) {
            C41318g46.m40163a("rideStart emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114457a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$K */
    /* loaded from: classes2.dex */
    public static final class C0430K extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0430K f1713g = new C0430K();

        public C0430K() {
            super(1);
        }

        /* renamed from: a */
        public final void m114456a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToDriverLicense emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114456a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 RideRequirementManagerImpl.kt\nco/bird/android/app/manager/RideRequirementManagerImpl\n*L\n1#1,328:1\n195#2:329\n*E\n"})
    /* renamed from: B55$K0 */
    /* loaded from: classes2.dex */
    public static final class C0431K0<T> implements Comparator {
        public C0431K0() {
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(Intrinsics.areEqual((InterfaceC0491n) t2, B55.this.f1684w)), Boolean.valueOf(Intrinsics.areEqual((InterfaceC0491n) t, B55.this.f1684w)));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$L */
    /* loaded from: classes2.dex */
    public static final class C0432L extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0432L f1715g = new C0432L();

        public C0432L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToFlockTogether error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$L0 */
    /* loaded from: classes2.dex */
    public static final class C0433L0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0433L0 f1716g = new C0433L0();

        public C0433L0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "rideStartRedirect error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$M */
    /* loaded from: classes2.dex */
    public static final class C0434M extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0434M f1717g = new C0434M();

        public C0434M() {
            super(1);
        }

        /* renamed from: a */
        public final void m114455a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToFlockTogether subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114455a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$M0 */
    /* loaded from: classes2.dex */
    public static final class C0435M0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0435M0 f1718g = new C0435M0();

        public C0435M0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114454a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("rideStartRedirect subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114454a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$N */
    /* loaded from: classes2.dex */
    public static final class C0436N extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0436N f1719g = new C0436N();

        public C0436N() {
            super(1);
        }

        /* renamed from: a */
        public final void m114453a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToFlockTogether emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114453a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$N0 */
    /* loaded from: classes2.dex */
    public static final class C0437N0 extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0437N0 f1720g = new C0437N0();

        public C0437N0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114452a(RideRequirement rideRequirement) {
            C41318g46.m40163a("rideStartRedirect emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114452a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRideRequirementManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideRequirementManagerImpl.kt\nco/bird/android/app/manager/RideRequirementManagerImpl$maybeRedirectToFlockTogether$flockTogetherShown$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,992:1\n1#2:993\n*E\n"})
    /* renamed from: B55$O */
    /* loaded from: classes2.dex */
    public static final class C0438O extends Lambda implements Function0<Boolean> {
        public C0438O() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Boolean bool;
            WireBird m114568g1 = B55.this.m114568g1();
            boolean z = false;
            if (m114568g1 != null && (bool = (Boolean) B55.this.f1677p.get(m114568g1.getId())) != null) {
                Intrinsics.checkNotNullExpressionValue(bool, "flockTogetherShownCache.get(it.id) ?: false");
                z = bool.booleanValue();
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$P */
    /* loaded from: classes2.dex */
    public static final class C0439P extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ Config f1722g;

        /* renamed from: h */
        public final /* synthetic */ B55 f1723h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0439P(Config config, B55 b55) {
            super(0);
            this.f1722g = config;
            this.f1723h = b55;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
            if ((r0 != null && r0.getHasHelmet()) == false) goto L14;
         */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke() {
            boolean z = true;
            if (!this.f1722g.getRequireRideEndPhotoToEndRide() && !Intrinsics.areEqual(this.f1722g.getRequestEndRidePhoto(), Boolean.TRUE)) {
                if (this.f1722g.getLeaseConfig().getLeaseTypes().getHelmet().getEnabled()) {
                    WireBird m114568g1 = this.f1723h.m114568g1();
                }
                WireBird m114568g12 = this.f1723h.m114568g1();
                if ((m114568g12 != null ? m114568g12.getPhysicalLock() : null) == null) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "allowToStartRide", "Lio/reactivex/u;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/Boolean;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$Q */
    /* loaded from: classes2.dex */
    public static final class C0440Q extends Lambda implements Function1<Boolean, InterfaceC24574u<? extends RideRequirement>> {

        /* renamed from: h */
        public final /* synthetic */ RideConfig f1725h;

        /* renamed from: i */
        public final /* synthetic */ User f1726i;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Balance;", "balance", "Lio/reactivex/u;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Balance;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$Q$a */
        /* loaded from: classes2.dex */
        public static final class C0441a extends Lambda implements Function1<Balance, InterfaceC24574u<? extends RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ RideConfig f1727g;

            /* renamed from: h */
            public final /* synthetic */ User f1728h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0441a(RideConfig rideConfig, User user) {
                super(1);
                this.f1727g = rideConfig;
                this.f1728h = user;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends RideRequirement> invoke(Balance balance) {
                Intrinsics.checkNotNullParameter(balance, "balance");
                if ((this.f1727g.getEnableSingleAuthForPositiveBalance() && balance.getBalance() > 0) || (!this.f1727g.getEnableSingleAuthForPositiveBalance() && Intrinsics.areEqual(balance.getAutoPayActive(), Boolean.TRUE))) {
                    return AbstractC24507p.m32024u();
                }
                return AbstractC24507p.m32068G(new RideRequirement.GooglePay(this.f1727g, this.f1728h));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: B55$Q$b */
        /* loaded from: classes2.dex */
        public static final class C0442b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C0442b f1729g = new C0442b();

            public C0442b() {
                super(1);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0440Q(RideConfig rideConfig, User user) {
            super(1);
            this.f1725h = rideConfig;
            this.f1726i = user;
        }

        /* renamed from: d */
        public static final InterfaceC24574u m114448d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final void m114447e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends RideRequirement> invoke(Boolean allowToStartRide) {
            boolean z;
            Intrinsics.checkNotNullParameter(allowToStartRide, "allowToStartRide");
            BirdPayment m59035e = B55.this.f1667f.mo1484a().m73665a().m59035e();
            if (allowToStartRide.booleanValue()) {
                return AbstractC24507p.m32024u();
            }
            if (B55.this.m114547l1()) {
                return AbstractC24507p.m32024u();
            }
            if (m59035e != null && !m59035e.isEmpty()) {
                Card stripeCard = m59035e.getStripeCard();
                if (stripeCard != null) {
                    z = ES5.m108973b(stripeCard);
                } else {
                    z = false;
                }
                if (z) {
                    AbstractC23442F<Balance> mo26979B = B55.this.f1663b.mo26979B(this.f1725h.getCurrency());
                    final C0441a c0441a = new C0441a(this.f1725h, this.f1726i);
                    AbstractC24507p<R> m33163C = mo26979B.m33163C(new InterfaceC23492o() { // from class: Q55
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u m114448d;
                            m114448d = B55.C0440Q.m114448d(Function1.this, obj);
                            return m114448d;
                        }
                    });
                    final C0442b c0442b = C0442b.f1729g;
                    return m33163C.m32029p(new InterfaceC23484g() { // from class: R55
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            B55.C0440Q.m114447e(Function1.this, obj);
                        }
                    }).m32065J();
                }
                return AbstractC24507p.m32024u();
            }
            return AbstractC24507p.m32068G(RideRequirement.Payment.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$R */
    /* loaded from: classes2.dex */
    public static final class C0443R extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0443R f1730g = new C0443R();

        public C0443R() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToGooglePay error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$S */
    /* loaded from: classes2.dex */
    public static final class C0444S extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0444S f1731g = new C0444S();

        public C0444S() {
            super(1);
        }

        /* renamed from: a */
        public final void m114445a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToGooglePay subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114445a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$T */
    /* loaded from: classes2.dex */
    public static final class C0445T extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0445T f1732g = new C0445T();

        public C0445T() {
            super(1);
        }

        /* renamed from: a */
        public final void m114444a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToGooglePay emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114444a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$U */
    /* loaded from: classes2.dex */
    public static final class C0446U extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0446U f1733g = new C0446U();

        public C0446U() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToHelmetLeasePrompt error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$V */
    /* loaded from: classes2.dex */
    public static final class C0447V extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0447V f1734g = new C0447V();

        public C0447V() {
            super(1);
        }

        /* renamed from: a */
        public final void m114443a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToHelmetLeasePrompt subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114443a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$W */
    /* loaded from: classes2.dex */
    public static final class C0448W extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0448W f1735g = new C0448W();

        public C0448W() {
            super(1);
        }

        /* renamed from: a */
        public final void m114442a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToHelmetLeasePrompt emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114442a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$X */
    /* loaded from: classes2.dex */
    public static final class C0449X extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0449X f1736g = new C0449X();

        public C0449X() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToHelmetSelfieConfirmationPrompt error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$Y */
    /* loaded from: classes2.dex */
    public static final class C0450Y extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0450Y f1737g = new C0450Y();

        public C0450Y() {
            super(1);
        }

        /* renamed from: a */
        public final void m114441a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToHelmetSelfieConfirmationPrompt subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114441a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$Z */
    /* loaded from: classes2.dex */
    public static final class C0451Z extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0451Z f1738g = new C0451Z();

        public C0451Z() {
            super(1);
        }

        /* renamed from: a */
        public final void m114440a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToHelmetSelfieConfirmationPrompt emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114440a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$a", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$a */
    /* loaded from: classes2.dex */
    public static final class C0452a implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1739a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "user", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$a$a */
        /* loaded from: classes2.dex */
        public static final class C0453a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1740g;

            /* renamed from: h */
            public final /* synthetic */ C0452a f1741h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0453a(B55 b55, C0452a c0452a) {
                super(2);
                this.f1740g = b55;
                this.f1741h = c0452a;
            }

            /* renamed from: c */
            public static final void m114437c(B55 this$0, C0452a this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "user");
                AbstractC24507p m114497v1 = this.f1740g.m114497v1(config.getRideConfig(), user);
                final B55 b55 = this.f1740g;
                final C0452a c0452a = this.f1741h;
                return m114497v1.m32031n(new InterfaceC23478a() { // from class: A55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0452a.C0453a.m114437c(B55.this, c0452a);
                    }
                });
            }
        }

        public C0452a(B55 b55) {
            this.f1739a = new C0453a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1739a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LZV1;", "identificationState", "Lio/reactivex/u;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$a0 */
    /* loaded from: classes2.dex */
    public static final class C0454a0 extends Lambda implements Function1<Optional<ZV1>, InterfaceC24574u<? extends RideRequirement>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: B55$a0$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0455a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IdentificationStatus.values().length];
                try {
                    iArr[IdentificationStatus.ACCEPTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IdentificationStatus.NOT_REQUIRED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IdentificationStatus.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IdentificationStatus.PENDING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[IdentificationStatus.REJECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[IdentificationStatus.REQUIRED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C0454a0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends RideRequirement> invoke(Optional<ZV1> identificationState) {
            IdentificationIntentPermissionStatus identificationIntentPermissionStatus;
            int i;
            Intrinsics.checkNotNullParameter(identificationState, "identificationState");
            ZV1 m59035e = identificationState.m59035e();
            IdentificationStatus identificationStatus = null;
            if (m59035e != null) {
                identificationIntentPermissionStatus = m59035e.m73012b();
            } else {
                identificationIntentPermissionStatus = null;
            }
            if (identificationIntentPermissionStatus != null) {
                identificationStatus = identificationIntentPermissionStatus.getStatus();
            }
            if (identificationStatus == null) {
                i = -1;
            } else {
                i = C0455a.$EnumSwitchMapping$0[identificationStatus.ordinal()];
            }
            switch (i) {
                case -1:
                case 1:
                case 2:
                case 3:
                    return AbstractC24507p.m32024u();
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 4:
                    return AbstractC24507p.m32068G(RideRequirement.PendingIdentificationCheck.INSTANCE);
                case 5:
                case 6:
                    if (identificationIntentPermissionStatus.countriesAllowingBarcode().contains(Locale.getDefault().getCountry()) && !B55.this.m114552k1()) {
                        AbstractC24507p m32068G = AbstractC24507p.m32068G(RideRequirement.ScanDriverLicenseWithIdentification.INSTANCE);
                        Intrinsics.checkNotNullExpressionValue(m32068G, "{\n              Maybe.ju…tification)\n            }");
                        return m32068G;
                    }
                    AbstractC24507p m32068G2 = AbstractC24507p.m32068G(RideRequirement.SelectIdentificationMethod.INSTANCE);
                    Intrinsics.checkNotNullExpressionValue(m32068G2, "{\n              Maybe.ju…tionMethod)\n            }");
                    return m32068G2;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"LB55$b;", "", "", "ID_STATUS_QUERY_DELAY_MILLIS", "J", "PAYMENT_REFRESH_TIMEOUT_SECONDS", "RIDE_START_TIMEOUT_SECONDS", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$b */
    /* loaded from: classes2.dex */
    public static final class C0456b {
        public /* synthetic */ C0456b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0456b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$b0 */
    /* loaded from: classes2.dex */
    public static final class C0457b0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0457b0 f1743g = new C0457b0();

        public C0457b0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToIdentificationCheckStateAgain error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$c", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$c */
    /* loaded from: classes2.dex */
    public static final class C0458c implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1744a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "<anonymous parameter 1>", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$c$a */
        /* loaded from: classes2.dex */
        public static final class C0459a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1745g;

            /* renamed from: h */
            public final /* synthetic */ C0458c f1746h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0459a(B55 b55, C0458c c0458c) {
                super(2);
                this.f1745g = b55;
                this.f1746h = c0458c;
            }

            /* renamed from: c */
            public static final void m114433c(B55 this$0, C0458c this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "<anonymous parameter 1>");
                AbstractC24507p m114651L1 = this.f1745g.m114651L1(config);
                final B55 b55 = this.f1745g;
                final C0458c c0458c = this.f1746h;
                return m114651L1.m32031n(new InterfaceC23478a() { // from class: C55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0458c.C0459a.m114433c(B55.this, c0458c);
                    }
                });
            }
        }

        public C0458c(B55 b55) {
            this.f1744a = new C0459a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1744a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$c0 */
    /* loaded from: classes2.dex */
    public static final class C0460c0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0460c0 f1747g = new C0460c0();

        public C0460c0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114432a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToIdentificationCheckStateAgain subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114432a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001RP\u0010\u000b\u001a8\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012(\u0012&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$d", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$d */
    /* loaded from: classes2.dex */
    public static final class C0461d implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1748a = C0462a.f1749g;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "<anonymous parameter 0>", "Lco/bird/android/model/User;", "<anonymous parameter 1>", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$d$a */
        /* loaded from: classes2.dex */
        public static final class C0462a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public static final C0462a f1749g = new C0462a();

            public C0462a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(user, "<anonymous parameter 1>");
                return AbstractC24507p.m32024u();
            }
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1748a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$d0 */
    /* loaded from: classes2.dex */
    public static final class C0463d0 extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0463d0 f1750g = new C0463d0();

        public C0463d0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114430a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToIdentificationCheckStateAgain emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114430a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$e", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$e */
    /* loaded from: classes2.dex */
    public static final class C0464e implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1751a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "<anonymous parameter 1>", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$e$a */
        /* loaded from: classes2.dex */
        public static final class C0465a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1752g;

            /* renamed from: h */
            public final /* synthetic */ C0464e f1753h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0465a(B55 b55, C0464e c0464e) {
                super(2);
                this.f1752g = b55;
                this.f1753h = c0464e;
            }

            /* renamed from: c */
            public static final void m114427c(B55 this$0, C0464e this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "<anonymous parameter 1>");
                AbstractC24507p m114631Q1 = this.f1752g.m114631Q1(config);
                final B55 b55 = this.f1752g;
                final C0464e c0464e = this.f1753h;
                return m114631Q1.m32031n(new InterfaceC23478a() { // from class: D55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0464e.C0465a.m114427c(B55.this, c0464e);
                    }
                });
            }
        }

        public C0464e(B55 b55) {
            this.f1751a = new C0465a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1751a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$e0 */
    /* loaded from: classes2.dex */
    public static final class C0466e0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0466e0 f1754g = new C0466e0();

        public C0466e0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToLocalsSurveyPrompt error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$f", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$f */
    /* loaded from: classes2.dex */
    public static final class C0467f implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1755a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "user", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$f$a */
        /* loaded from: classes2.dex */
        public static final class C0468a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1756g;

            /* renamed from: h */
            public final /* synthetic */ C0467f f1757h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0468a(B55 b55, C0467f c0467f) {
                super(2);
                this.f1756g = b55;
                this.f1757h = c0467f;
            }

            /* renamed from: c */
            public static final void m114424c(B55 this$0, C0467f this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "user");
                AbstractC24507p m114603X1 = this.f1756g.m114603X1(config, user);
                final B55 b55 = this.f1756g;
                final C0467f c0467f = this.f1757h;
                return m114603X1.m32031n(new InterfaceC23478a() { // from class: E55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0467f.C0468a.m114424c(B55.this, c0467f);
                    }
                });
            }
        }

        public C0467f(B55 b55) {
            this.f1755a = new C0468a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1755a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$f0 */
    /* loaded from: classes2.dex */
    public static final class C0469f0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0469f0 f1758g = new C0469f0();

        public C0469f0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114423a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToLocalsSurveyPrompt subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114423a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$g", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$g */
    /* loaded from: classes2.dex */
    public static final class C0470g implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1759a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "user", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$g$a */
        /* loaded from: classes2.dex */
        public static final class C0471a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1760g;

            /* renamed from: h */
            public final /* synthetic */ C0470g f1761h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0471a(B55 b55, C0470g c0470g) {
                super(2);
                this.f1760g = b55;
                this.f1761h = c0470g;
            }

            /* renamed from: c */
            public static final void m114420c(B55 this$0, C0470g this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "user");
                AbstractC24507p m114579d2 = this.f1760g.m114579d2(config, user);
                final B55 b55 = this.f1760g;
                final C0470g c0470g = this.f1761h;
                return m114579d2.m32031n(new InterfaceC23478a() { // from class: F55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0470g.C0471a.m114420c(B55.this, c0470g);
                    }
                });
            }
        }

        public C0470g(B55 b55) {
            this.f1759a = new C0471a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1759a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$g0 */
    /* loaded from: classes2.dex */
    public static final class C0472g0 extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0472g0 f1762g = new C0472g0();

        public C0472g0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114419a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToLocalsSurveyPrompt emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114419a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$h", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$h */
    /* loaded from: classes2.dex */
    public static final class C0473h implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1763a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "user", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$h$a */
        /* loaded from: classes2.dex */
        public static final class C0474a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1764g;

            /* renamed from: h */
            public final /* synthetic */ C0473h f1765h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0474a(B55 b55, C0473h c0473h) {
                super(2);
                this.f1764g = b55;
                this.f1765h = c0473h;
            }

            /* renamed from: c */
            public static final void m114416c(B55 this$0, C0473h this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "user");
                AbstractC24507p m114555j2 = this.f1764g.m114555j2(config, user);
                final B55 b55 = this.f1764g;
                final C0473h c0473h = this.f1765h;
                return m114555j2.m32031n(new InterfaceC23478a() { // from class: G55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0473h.C0474a.m114416c(B55.this, c0473h);
                    }
                });
            }
        }

        public C0473h(B55 b55) {
            this.f1763a = new C0474a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1763a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "allowToStartRide", "Lio/reactivex/u;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$h0 */
    /* loaded from: classes2.dex */
    public static final class C0475h0 extends Lambda implements Function1<Boolean, InterfaceC24574u<? extends RideRequirement>> {

        /* renamed from: h */
        public final /* synthetic */ User f1767h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0475h0(User user) {
            super(1);
            this.f1767h = user;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends RideRequirement> invoke(Boolean allowToStartRide) {
            Intrinsics.checkNotNullParameter(allowToStartRide, "allowToStartRide");
            BirdPayment m59035e = B55.this.f1667f.mo1484a().m73665a().m59035e();
            if (allowToStartRide.booleanValue()) {
                return AbstractC24507p.m32024u();
            }
            if ((m59035e == null || m59035e.isEmpty()) && !S55.m86017d(B55.this.m114568g1()) && !S55.m86020a(this.f1767h)) {
                return AbstractC24507p.m32068G(RideRequirement.Payment.INSTANCE);
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$i", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$i */
    /* loaded from: classes2.dex */
    public static final class C0476i implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1768a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "user", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$i$a */
        /* loaded from: classes2.dex */
        public static final class C0477a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1769g;

            /* renamed from: h */
            public final /* synthetic */ C0476i f1770h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0477a(B55 b55, C0476i c0476i) {
                super(2);
                this.f1769g = b55;
                this.f1770h = c0476i;
            }

            /* renamed from: c */
            public static final void m114412c(B55 this$0, C0476i this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "user");
                AbstractC24507p m114496v2 = this.f1769g.m114496v2(config, user);
                final B55 b55 = this.f1769g;
                final C0476i c0476i = this.f1770h;
                return m114496v2.m32031n(new InterfaceC23478a() { // from class: H55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0476i.C0477a.m114412c(B55.this, c0476i);
                    }
                });
            }
        }

        public C0476i(B55 b55) {
            this.f1768a = new C0477a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1768a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$i0 */
    /* loaded from: classes2.dex */
    public static final class C0478i0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0478i0 f1771g = new C0478i0();

        public C0478i0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToPayment error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$j", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$j */
    /* loaded from: classes2.dex */
    public static final class C0479j implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1772a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "user", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$j$a */
        /* loaded from: classes2.dex */
        public static final class C0480a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1773g;

            /* renamed from: h */
            public final /* synthetic */ C0479j f1774h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0480a(B55 b55, C0479j c0479j) {
                super(2);
                this.f1773g = b55;
                this.f1774h = c0479j;
            }

            /* renamed from: c */
            public static final void m114409c(B55 this$0, C0479j this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "user");
                AbstractC24507p m114695A2 = this.f1773g.m114695A2(config, user);
                final B55 b55 = this.f1773g;
                final C0479j c0479j = this.f1774h;
                return m114695A2.m32031n(new InterfaceC23478a() { // from class: I55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0479j.C0480a.m114409c(B55.this, c0479j);
                    }
                });
            }
        }

        public C0479j(B55 b55) {
            this.f1772a = new C0480a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1772a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$j0 */
    /* loaded from: classes2.dex */
    public static final class C0481j0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0481j0 f1775g = new C0481j0();

        public C0481j0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114408a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToPayment subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114408a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$k", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$k */
    /* loaded from: classes2.dex */
    public static final class C0482k implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1776a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "<anonymous parameter 1>", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$k$a */
        /* loaded from: classes2.dex */
        public static final class C0483a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1777g;

            /* renamed from: h */
            public final /* synthetic */ C0482k f1778h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0483a(B55 b55, C0482k c0482k) {
                super(2);
                this.f1777g = b55;
                this.f1778h = c0482k;
            }

            /* renamed from: c */
            public static final void m114405c(B55 this$0, C0482k this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "<anonymous parameter 1>");
                AbstractC24507p m114670G2 = this.f1777g.m114670G2(config);
                final B55 b55 = this.f1777g;
                final C0482k c0482k = this.f1778h;
                return m114670G2.m32031n(new InterfaceC23478a() { // from class: J55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0482k.C0483a.m114405c(B55.this, c0482k);
                    }
                });
            }
        }

        public C0482k(B55 b55) {
            this.f1776a = new C0483a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1776a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$k0 */
    /* loaded from: classes2.dex */
    public static final class C0484k0 extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0484k0 f1779g = new C0484k0();

        public C0484k0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114404a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToPayment emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114404a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$l", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$l */
    /* loaded from: classes2.dex */
    public static final class C0485l implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1780a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "user", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$l$a */
        /* loaded from: classes2.dex */
        public static final class C0486a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1781g;

            /* renamed from: h */
            public final /* synthetic */ C0485l f1782h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0486a(B55 b55, C0485l c0485l) {
                super(2);
                this.f1781g = b55;
                this.f1782h = c0485l;
            }

            /* renamed from: c */
            public static final void m114401c(B55 this$0, C0485l this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "user");
                AbstractC24507p m114527p1 = this.f1781g.m114527p1(config, user);
                final B55 b55 = this.f1781g;
                final C0485l c0485l = this.f1782h;
                return m114527p1.m32031n(new InterfaceC23478a() { // from class: K55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0485l.C0486a.m114401c(B55.this, c0485l);
                    }
                });
            }
        }

        public C0485l(B55 b55) {
            this.f1780a = new C0486a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1780a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$l0 */
    /* loaded from: classes2.dex */
    public static final class C0487l0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0487l0 f1783g = new C0487l0();

        public C0487l0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToPendingIdentificationCheck error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$m", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$m */
    /* loaded from: classes2.dex */
    public static final class C0488m implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1784a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "<anonymous parameter 0>", "Lco/bird/android/model/User;", "<anonymous parameter 1>", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$m$a */
        /* loaded from: classes2.dex */
        public static final class C0489a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1785g;

            /* renamed from: h */
            public final /* synthetic */ C0488m f1786h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0489a(B55 b55, C0488m c0488m) {
                super(2);
                this.f1785g = b55;
                this.f1786h = c0488m;
            }

            /* renamed from: c */
            public static final void m114398c(B55 this$0, C0488m this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(user, "<anonymous parameter 1>");
                AbstractC24507p m114650L2 = this.f1785g.m114650L2();
                final B55 b55 = this.f1785g;
                final C0488m c0488m = this.f1786h;
                return m114650L2.m32031n(new InterfaceC23478a() { // from class: L55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0488m.C0489a.m114398c(B55.this, c0488m);
                    }
                });
            }
        }

        public C0488m(B55 b55) {
            this.f1784a = new C0489a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1784a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$m0 */
    /* loaded from: classes2.dex */
    public static final class C0490m0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0490m0 f1787g = new C0490m0();

        public C0490m0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114397a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToPendingIdentificationCheck subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114397a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001R,\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"LB55$n;", "", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", C17296a.f69688o, "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$n */
    /* loaded from: classes2.dex */
    public interface InterfaceC0491n {
        /* renamed from: a */
        Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a();
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$n0 */
    /* loaded from: classes2.dex */
    public static final class C0492n0 extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0492n0 f1788g = new C0492n0();

        public C0492n0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114396a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToPendingIdentificationCheck emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114396a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$o", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$o */
    /* loaded from: classes2.dex */
    public static final class C0493o implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1789a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "<anonymous parameter 1>", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$o$a */
        /* loaded from: classes2.dex */
        public static final class C0494a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1790g;

            /* renamed from: h */
            public final /* synthetic */ C0493o f1791h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0494a(B55 b55, C0493o c0493o) {
                super(2);
                this.f1790g = b55;
                this.f1791h = c0493o;
            }

            /* renamed from: c */
            public static final void m114393c(B55 this$0, C0493o this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "<anonymous parameter 1>");
                AbstractC24507p m114626R2 = this.f1790g.m114626R2(config.getRideConfig());
                final B55 b55 = this.f1790g;
                final C0493o c0493o = this.f1791h;
                return m114626R2.m32031n(new InterfaceC23478a() { // from class: M55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0493o.C0494a.m114393c(B55.this, c0493o);
                    }
                });
            }
        }

        public C0493o(B55 b55) {
            this.f1789a = new C0494a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1789a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$o0 */
    /* loaded from: classes2.dex */
    public static final class C0495o0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0495o0 f1792g = new C0495o0();

        public C0495o0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToQuiz error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$p", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$p */
    /* loaded from: classes2.dex */
    public static final class C0496p implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1793a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/User;", "<anonymous parameter 1>", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$p$a */
        /* loaded from: classes2.dex */
        public static final class C0497a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1794g;

            /* renamed from: h */
            public final /* synthetic */ C0496p f1795h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0497a(B55 b55, C0496p c0496p) {
                super(2);
                this.f1794g = b55;
                this.f1795h = c0496p;
            }

            /* renamed from: c */
            public static final void m114390c(B55 this$0, C0496p this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(user, "<anonymous parameter 1>");
                AbstractC24507p m114606W2 = this.f1794g.m114606W2(config.getTaxInformationConfig());
                final B55 b55 = this.f1794g;
                final C0496p c0496p = this.f1795h;
                return m114606W2.m32031n(new InterfaceC23478a() { // from class: N55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0496p.C0497a.m114390c(B55.this, c0496p);
                    }
                });
            }
        }

        public C0496p(B55 b55) {
            this.f1793a = new C0497a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1793a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Tutorial;", "tutorials", "Lio/reactivex/u;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$p0 */
    /* loaded from: classes2.dex */
    public static final class C0498p0 extends Lambda implements Function1<List<? extends Tutorial>, InterfaceC24574u<? extends RideRequirement>> {

        /* renamed from: g */
        public static final C0498p0 f1796g = new C0498p0();

        public C0498p0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends RideRequirement> invoke(List<Tutorial> tutorials) {
            Intrinsics.checkNotNullParameter(tutorials, "tutorials");
            if (!tutorials.isEmpty()) {
                return AbstractC24507p.m32068G(RideRequirement.Quiz.INSTANCE);
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m28432d2 = {"B55$q", "LB55$n;", "Lkotlin/Function2;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "check", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B55$q */
    /* loaded from: classes2.dex */
    public static final class C0499q implements InterfaceC0491n {

        /* renamed from: a */
        public final Function2<Config, User, AbstractC24507p<RideRequirement>> f1797a;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "<anonymous parameter 0>", "Lco/bird/android/model/User;", "<anonymous parameter 1>", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: B55$q$a */
        /* loaded from: classes2.dex */
        public static final class C0500a extends Lambda implements Function2<Config, User, AbstractC24507p<RideRequirement>> {

            /* renamed from: g */
            public final /* synthetic */ B55 f1798g;

            /* renamed from: h */
            public final /* synthetic */ C0499q f1799h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0500a(B55 b55, C0499q c0499q) {
                super(2);
                this.f1798g = b55;
                this.f1799h = c0499q;
            }

            /* renamed from: c */
            public static final void m114385c(B55 this$0, C0499q this$1) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.f1681t.add(this$1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b */
            public final AbstractC24507p<RideRequirement> invoke(Config config, User user) {
                Intrinsics.checkNotNullParameter(config, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(user, "<anonymous parameter 1>");
                AbstractC24507p m114582c3 = this.f1798g.m114582c3();
                final B55 b55 = this.f1798g;
                final C0499q c0499q = this.f1799h;
                return m114582c3.m32031n(new InterfaceC23478a() { // from class: O55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.C0499q.C0500a.m114385c(B55.this, c0499q);
                    }
                });
            }
        }

        public C0499q(B55 b55) {
            this.f1797a = new C0500a(b55, this);
        }

        @Override // p000.B55.InterfaceC0491n
        /* renamed from: a */
        public Function2<Config, User, AbstractC24507p<RideRequirement>> mo114388a() {
            return this.f1797a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$q0 */
    /* loaded from: classes2.dex */
    public static final class C0501q0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0501q0 f1800g = new C0501q0();

        public C0501q0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114384a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToQuiz subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114384a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Balance;", "balance", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Balance;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$r */
    /* loaded from: classes2.dex */
    public static final class C0502r extends Lambda implements Function1<Balance, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ BankRedirectConfig f1801g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0502r(BankRedirectConfig bankRedirectConfig) {
            super(1);
            this.f1801g = bankRedirectConfig;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Balance balance) {
            boolean z;
            Intrinsics.checkNotNullParameter(balance, "balance");
            Long minBalanceToRide = this.f1801g.getMinBalanceToRide();
            Boolean allowSufficientBalanceToStartRide = this.f1801g.getAllowSufficientBalanceToStartRide();
            if (minBalanceToRide != null && Intrinsics.areEqual(allowSufficientBalanceToStartRide, Boolean.TRUE) && balance.getBalance() >= minBalanceToRide.longValue()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$r0 */
    /* loaded from: classes2.dex */
    public static final class C0503r0 extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0503r0 f1802g = new C0503r0();

        public C0503r0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114382a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToQuiz emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114382a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "R", "t1", "t2", "t3", "t4", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSingles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Singles.kt\nio/reactivex/rxkotlin/Singles$zip$5\n+ 2 RideRequirementManagerImpl.kt\nco/bird/android/app/manager/RideRequirementManagerImpl\n*L\n1#1,126:1\n561#2:127\n*E\n"})
    /* renamed from: B55$s */
    /* loaded from: classes2.dex */
    public static final class C0504s<T1, T2, T3, T4, R> implements InterfaceC23486i<T1, T2, T3, T4, R> {
        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return (R) new C51106wb4((Boolean) t1, (Boolean) t2, (Boolean) t3, (Balance) t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$s0 */
    /* loaded from: classes2.dex */
    public static final class C0505s0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0505s0 f1803g = new C0505s0();

        public C0505s0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToSoberStart error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052>\u0010\u0004\u001a:\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lwb4;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Balance;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/RideRequirement;", C17296a.f69688o, "(Lwb4;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$t */
    /* loaded from: classes2.dex */
    public static final class C0506t extends Lambda implements Function1<C51106wb4<? extends Boolean, ? extends Boolean, ? extends Boolean, ? extends Balance>, InterfaceC24574u<? extends RideRequirement>> {

        /* renamed from: h */
        public final /* synthetic */ Config f1805h;

        /* renamed from: i */
        public final /* synthetic */ boolean f1806i;

        /* renamed from: j */
        public final /* synthetic */ User f1807j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0506t(Config config, boolean z, User user) {
            super(1);
            this.f1805h = config;
            this.f1806i = z;
            this.f1807j = user;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC24574u<? extends RideRequirement> invoke(C51106wb4<Boolean, Boolean, Boolean, Balance> c51106wb4) {
            boolean z;
            boolean z2;
            ReloadConfigResponse m59035e;
            boolean z3;
            AutoReloadFromPreloadConfig autoReloadFromPreload;
            int i;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            Boolean preloadV2Enabled = c51106wb4.m6614a();
            Boolean preloadV2Required = c51106wb4.m6613b();
            Boolean preloadV2CanSkip = c51106wb4.m6612c();
            Balance m6611d = c51106wb4.m6611d();
            BirdPayment m59035e2 = B55.this.f1667f.mo1484a().m73665a().m59035e();
            boolean z4 = false;
            if (B55.this.f1662a.m37562v1() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (Intrinsics.areEqual(m6611d.getAutoPayActive(), Boolean.TRUE)) {
                Integer autoPayIncentiveAmount = m6611d.getAutoPayIncentiveAmount();
                if (autoPayIncentiveAmount != null) {
                    i = autoPayIncentiveAmount.intValue();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    z2 = true;
                    m59035e = B55.this.f1666e.mo25737i().getValue().m59035e();
                    if (m59035e == null && (autoReloadFromPreload = m59035e.getAutoReloadFromPreload()) != null && autoReloadFromPreload.getEnabled()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (this.f1805h.getEnablePreloadSkipCoupons() && B55.this.f1674m.mo27777r().getValue().booleanValue()) {
                        z4 = true;
                    }
                    boolean isEmpty = true ^ B55.this.f1675n.mo55502F0().m73665a().isEmpty();
                    if (!z2) {
                        return AbstractC24507p.m32024u();
                    }
                    if (z4) {
                        return AbstractC24507p.m32024u();
                    }
                    if (isEmpty) {
                        return AbstractC24507p.m32024u();
                    }
                    Intrinsics.checkNotNullExpressionValue(preloadV2CanSkip, "preloadV2CanSkip");
                    if (preloadV2CanSkip.booleanValue()) {
                        return AbstractC24507p.m32024u();
                    }
                    Intrinsics.checkNotNullExpressionValue(preloadV2Required, "preloadV2Required");
                    if (preloadV2Required.booleanValue()) {
                        return AbstractC24507p.m32068G(new RideRequirement.PreloadV2(z3));
                    }
                    Intrinsics.checkNotNullExpressionValue(preloadV2Enabled, "preloadV2Enabled");
                    if (preloadV2Enabled.booleanValue() && this.f1806i) {
                        return AbstractC24507p.m32024u();
                    }
                    if (preloadV2Enabled.booleanValue() && z) {
                        return AbstractC24507p.m32024u();
                    }
                    if (preloadV2Enabled.booleanValue()) {
                        return AbstractC24507p.m32068G(new RideRequirement.PreloadV2(z3));
                    }
                    return B55.this.m114691B1(this.f1805h.getRideConfig(), this.f1807j, m59035e2);
                }
            }
            z2 = false;
            m59035e = B55.this.f1666e.mo25737i().getValue().m59035e();
            if (m59035e == null) {
            }
            z3 = false;
            if (this.f1805h.getEnablePreloadSkipCoupons()) {
                z4 = true;
            }
            boolean isEmpty2 = true ^ B55.this.f1675n.mo55502F0().m73665a().isEmpty();
            if (!z2) {
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$t0 */
    /* loaded from: classes2.dex */
    public static final class C0507t0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0507t0 f1808g = new C0507t0();

        public C0507t0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114380a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToSoberStart subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114380a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$u */
    /* loaded from: classes2.dex */
    public static final class C0508u extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0508u f1809g = new C0508u();

        public C0508u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectPreloadV2 error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$u0 */
    /* loaded from: classes2.dex */
    public static final class C0509u0 extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0509u0 f1810g = new C0509u0();

        public C0509u0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114379a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToSoberStart emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114379a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$v */
    /* loaded from: classes2.dex */
    public static final class C0510v extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0510v f1811g = new C0510v();

        public C0510v() {
            super(1);
        }

        /* renamed from: a */
        public final void m114378a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectPreloadV2 subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114378a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/TaxInformation;", "it", "Lio/reactivex/u;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$v0 */
    /* loaded from: classes2.dex */
    public static final class C0511v0 extends Lambda implements Function1<Optional<TaxInformation>, InterfaceC24574u<? extends RideRequirement>> {

        /* renamed from: g */
        public static final C0511v0 f1812g = new C0511v0();

        public C0511v0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends RideRequirement> invoke(Optional<TaxInformation> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m59037c()) {
                return AbstractC24507p.m32024u();
            }
            return AbstractC24507p.m32068G(RideRequirement.TaxInformationRequirement.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$w */
    /* loaded from: classes2.dex */
    public static final class C0512w extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0512w f1813g = new C0512w();

        public C0512w() {
            super(1);
        }

        /* renamed from: a */
        public final void m114376a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectPreloadV2 emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114376a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$w0 */
    /* loaded from: classes2.dex */
    public static final class C0513w0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0513w0 f1814g = new C0513w0();

        public C0513w0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToTaxInformation error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Balance;", "balance", "Lio/reactivex/u;", "Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Balance;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$x */
    /* loaded from: classes2.dex */
    public static final class C0514x extends Lambda implements Function1<Balance, InterfaceC24574u<? extends RideRequirement>> {

        /* renamed from: h */
        public final /* synthetic */ RideConfig f1816h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0514x(RideConfig rideConfig) {
            super(1);
            this.f1816h = rideConfig;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends RideRequirement> invoke(Balance balance) {
            Intrinsics.checkNotNullParameter(balance, "balance");
            boolean z = !B55.this.m114532o1(balance);
            Pair pair = new Pair(Integer.valueOf(this.f1816h.getAutoPayRefillAmount()), this.f1816h.getAutoPayExpName());
            int intValue = ((Number) pair.component1()).intValue();
            String str = (String) pair.component2();
            if (z && intValue != 0) {
                return AbstractC24507p.m32068G(RideRequirement.AutoPay.INSTANCE);
            }
            if (z && intValue == 0 && str != null) {
                return B55.this.m114588b1(str);
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$x0 */
    /* loaded from: classes2.dex */
    public static final class C0515x0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0515x0 f1817g = new C0515x0();

        public C0515x0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114374a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToTaxInformation subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114374a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$y */
    /* loaded from: classes2.dex */
    public static final class C0516y extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0516y f1818g = new C0516y();

        public C0516y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToAutoPay error: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$y0 */
    /* loaded from: classes2.dex */
    public static final class C0517y0 extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C0517y0 f1819g = new C0517y0();

        public C0517y0() {
            super(1);
        }

        /* renamed from: a */
        public final void m114373a(RideRequirement rideRequirement) {
            C41318g46.m40163a("maybeRedirectToTaxInformation emitted requirement " + rideRequirement, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m114373a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: B55$z */
    /* loaded from: classes2.dex */
    public static final class C0518z extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C0518z f1820g = new C0518z();

        public C0518z() {
            super(1);
        }

        /* renamed from: a */
        public final void m114372a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("maybeRedirectToAutoPay subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m114372a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: B55$z0 */
    /* loaded from: classes2.dex */
    public static final class C0519z0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0519z0 f1821g = new C0519z0();

        public C0519z0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "maybeRedirectToUserAgreement error: ", new Object[0]);
        }
    }

    public B55(C22454gl preference, InterfaceC44647lh6 userManager, InterfaceC44637lg6 userAgreementManager, AM3 paymentManagerV2, VM3 paymentManagerV3, InterfaceC52757zN3 paymentMethodManager, InterfaceC47617qi1 experimentManager, C36207Tq4 reactiveConfig, HZ5 taxInformationManager, InterfaceC45102mT1 identificationManager, InterfaceC34441Mc2 itemLeaseManager, BL1 helmetSelfieManager, V74 promoManager, WU4 ridePassManager, InterfaceC44791lw0 configurableTutorialManager) {
        List<InterfaceC0491n> listOf;
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userAgreementManager, "userAgreementManager");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(paymentMethodManager, "paymentMethodManager");
        Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(taxInformationManager, "taxInformationManager");
        Intrinsics.checkNotNullParameter(identificationManager, "identificationManager");
        Intrinsics.checkNotNullParameter(itemLeaseManager, "itemLeaseManager");
        Intrinsics.checkNotNullParameter(helmetSelfieManager, "helmetSelfieManager");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(ridePassManager, "ridePassManager");
        Intrinsics.checkNotNullParameter(configurableTutorialManager, "configurableTutorialManager");
        this.f1662a = preference;
        this.f1663b = userManager;
        this.f1664c = userAgreementManager;
        this.f1665d = paymentManagerV2;
        this.f1666e = paymentManagerV3;
        this.f1667f = paymentMethodManager;
        this.f1668g = experimentManager;
        this.f1669h = reactiveConfig;
        this.f1670i = taxInformationManager;
        this.f1671j = identificationManager;
        this.f1672k = itemLeaseManager;
        this.f1673l = helmetSelfieManager;
        this.f1674m = promoManager;
        this.f1675n = ridePassManager;
        this.f1676o = configurableTutorialManager;
        this.f1677p = new LruCache<>(3);
        this.f1681t = new LinkedHashSet();
        C0485l c0485l = new C0485l(this);
        this.f1682u = c0485l;
        C0479j c0479j = new C0479j(this);
        this.f1683v = c0479j;
        C0458c c0458c = new C0458c(this);
        this.f1684w = c0458c;
        C0470g c0470g = new C0470g(this);
        this.f1685x = c0470g;
        C0473h c0473h = new C0473h(this);
        this.f1686y = c0473h;
        C0496p c0496p = new C0496p(this);
        this.f1687z = c0496p;
        C0464e c0464e = new C0464e(this);
        this.f1652A = c0464e;
        C0499q c0499q = new C0499q(this);
        this.f1653B = c0499q;
        C0452a c0452a = new C0452a(this);
        this.f1654C = c0452a;
        C0467f c0467f = new C0467f(this);
        this.f1655D = c0467f;
        C0482k c0482k = new C0482k(this);
        this.f1656E = c0482k;
        C0488m c0488m = new C0488m(this);
        this.f1657F = c0488m;
        C0493o c0493o = new C0493o(this);
        this.f1658G = c0493o;
        C0476i c0476i = new C0476i(this);
        this.f1659H = c0476i;
        C0461d c0461d = new C0461d();
        this.f1660I = c0461d;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new InterfaceC0491n[]{c0485l, c0479j, c0458c, c0470g, c0473h, c0496p, c0464e, c0499q, c0452a, c0467f, c0482k, c0488m, c0493o, c0476i, c0461d});
        this.f1661J = listOf;
    }

    /* renamed from: A1 */
    public static final void m114696A1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A3 */
    public static final void m114694A3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B2 */
    public static final InterfaceC24574u m114690B2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: C1 */
    public static final InterfaceC24574u m114687C1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: C2 */
    public static final void m114686C2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D2 */
    public static final void m114682D2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E1 */
    public static final InterfaceC23447K m114679E1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E2 */
    public static final void m114678E2() {
        C41318g46.m40163a("maybeRedirectToPayment completed without emitting requirement", new Object[0]);
    }

    /* renamed from: F1 */
    public static final void m114675F1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F2 */
    public static final void m114674F2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G1 */
    public static final InterfaceC24574u m114671G1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: H1 */
    public static final void m114667H1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H2 */
    public static final void m114666H2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I1 */
    public static final void m114663I1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I2 */
    public static final void m114662I2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J1 */
    public static final void m114659J1() {
        C41318g46.m40163a("maybeRedirectToDLUsingIdentificationServiceFlow completed without emitting requirement", new Object[0]);
    }

    /* renamed from: J2 */
    public static final void m114658J2() {
        C41318g46.m40163a("maybeRedirectToPendingIdentificationCheck completed without emitting requirement", new Object[0]);
    }

    /* renamed from: K1 */
    public static final void m114655K1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K2 */
    public static final void m114654K2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M1 */
    public static final void m114647M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M2 */
    public static final void m114646M2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N1 */
    public static final void m114643N1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N2 */
    public static final InterfaceC24574u m114642N2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: O1 */
    public static final void m114639O1() {
        C41318g46.m40163a("maybeRedirectToDriverLicense completed without emitting requirement", new Object[0]);
    }

    /* renamed from: O2 */
    public static final void m114638O2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P1 */
    public static final void m114635P1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P2 */
    public static final void m114634P2() {
        C41318g46.m40163a("maybeRedirectToQuiz completed without emitting requirement", new Object[0]);
    }

    /* renamed from: Q2 */
    public static final void m114630Q2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R1 */
    public static final boolean m114627R1(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }

    /* renamed from: S1 */
    public static final boolean m114623S1(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }

    /* renamed from: S2 */
    public static final void m114622S2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T1 */
    public static final void m114619T1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T2 */
    public static final void m114618T2() {
        C41318g46.m40163a("maybeRedirectToSoberStart completed without emitting requirement", new Object[0]);
    }

    /* renamed from: U1 */
    public static final void m114615U1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U2 */
    public static final void m114614U2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V1 */
    public static final void m114611V1() {
        C41318g46.m40163a("maybeRedirectToFlockTogether completed without emitting requirement", new Object[0]);
    }

    /* renamed from: V2 */
    public static final void m114610V2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W1 */
    public static final void m114607W1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X2 */
    public static final InterfaceC24574u m114602X2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Y1 */
    public static final InterfaceC24574u m114599Y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Y2 */
    public static final void m114598Y2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z1 */
    public static final void m114595Z1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z2 */
    public static final void m114594Z2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a2 */
    public static final void m114591a2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a3 */
    public static final void m114590a3() {
        C41318g46.m40163a("maybeRedirectToTaxInformation completed without emitting requirement", new Object[0]);
    }

    /* renamed from: b2 */
    public static final void m114587b2() {
        C41318g46.m40163a("maybeRedirectToGooglePay completed without emitting requirement", new Object[0]);
    }

    /* renamed from: b3 */
    public static final void m114586b3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c2 */
    public static final void m114583c2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d1 */
    public static final Boolean m114580d1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: d3 */
    public static final void m114578d3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e2 */
    public static final InterfaceC24574u m114575e2(B55 this$0, WireBird wireBird) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f1672k.mo55666l(wireBird, ItemLeaseType.HELMET)) {
            return AbstractC24507p.m32024u();
        }
        return AbstractC24507p.m32068G(new RideRequirement.LeaseBasedHelmetPrompt(wireBird));
    }

    /* renamed from: e3 */
    public static final void m114574e3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f2 */
    public static final void m114571f2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f3 */
    public static final void m114570f3() {
        C41318g46.m40163a("maybeRedirectToUserAgreement completed without emitting requirement", new Object[0]);
    }

    /* renamed from: g2 */
    public static final void m114567g2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g3 */
    public static final void m114566g3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h2 */
    public static final void m114563h2() {
        C41318g46.m40163a("maybeRedirectToHelmetLeasePrompt completed without emitting requirement", new Object[0]);
    }

    /* renamed from: i2 */
    public static final void m114559i2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i3 */
    public static final InterfaceC24574u m114558i3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: j3 */
    public static final InterfaceC24574u m114554j3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: k2 */
    public static final void m114551k2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k3 */
    public static final InterfaceC24574u m114550k3(String str, B55 this$0, String str2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            return this$0.f1664c.mo2955f(new AgreementRole[]{AgreementRole.MULTI_RIDE_GUEST}, str2, str);
        }
        return AbstractC24507p.m32024u();
    }

    /* renamed from: l2 */
    public static final void m114546l2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l3 */
    public static final InterfaceC23496h m114545l3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: m2 */
    public static final void m114541m2() {
        C41318g46.m40163a("maybeRedirectToHelmetSelfieConfirmationPrompt completed without emitting requirement", new Object[0]);
    }

    /* renamed from: n2 */
    public static final void m114536n2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n3 */
    public static final void m114535n3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o3 */
    public static final void m114530o3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p2 */
    public static final InterfaceC23447K m114526p2(B55 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f1671j.mo25562g().firstOrError();
    }

    /* renamed from: p3 */
    public static final void m114525p3() {
        C41318g46.m40163a("refreshMissingData completed", new Object[0]);
    }

    /* renamed from: q1 */
    public static final InterfaceC24574u m114522q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: q2 */
    public static final InterfaceC24574u m114521q2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: r1 */
    public static final void m114517r1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r2 */
    public static final void m114516r2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r3 */
    public static final InterfaceC24574u m114515r3(B55 this$0, User user, Config config) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(user, "$user");
        Intrinsics.checkNotNullParameter(config, "$config");
        return this$0.m114490w3(user, config);
    }

    /* renamed from: s1 */
    public static final void m114512s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s2 */
    public static final void m114511s2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s3 */
    public static final void m114510s3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t1 */
    public static final void m114507t1() {
        C41318g46.m40163a("maybeRedirectPreloadV2 completed without emitting requirement", new Object[0]);
    }

    /* renamed from: t2 */
    public static final void m114506t2() {
        C41318g46.m40163a("maybeRedirectToIdentificationCheckStateAgain completed without emitting requirement", new Object[0]);
    }

    /* renamed from: t3 */
    public static final void m114505t3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u1 */
    public static final void m114502u1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u2 */
    public static final void m114501u2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u3 */
    public static final void m114500u3() {
        C41318g46.m40163a("rideStart completed without emitting requirement", new Object[0]);
    }

    /* renamed from: v3 */
    public static final void m114495v3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w1 */
    public static final InterfaceC24574u m114492w1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: w2 */
    public static final void m114491w2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x1 */
    public static final void m114487x1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x2 */
    public static final void m114486x2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x3 */
    public static final void m114485x3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y1 */
    public static final void m114482y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y2 */
    public static final void m114481y2() {
        C41318g46.m40163a("maybeRedirectToLocalsSurveyPrompt completed without emitting requirement", new Object[0]);
    }

    /* renamed from: y3 */
    public static final void m114480y3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z1 */
    public static final void m114477z1() {
        C41318g46.m40163a("maybeRedirectToAutoPay completed without emitting requirement", new Object[0]);
    }

    /* renamed from: z2 */
    public static final void m114476z2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z3 */
    public static final void m114475z3() {
        C41318g46.m40163a("rideStartRedirect completed without emitting requirement", new Object[0]);
    }

    /* renamed from: A2 */
    public final AbstractC24507p<RideRequirement> m114695A2(Config config, User user) {
        AbstractC23442F<Boolean> m114584c1 = m114584c1(config);
        final C0475h0 c0475h0 = new C0475h0(user);
        AbstractC24507p<R> m33163C = m114584c1.m33163C(new InterfaceC23492o() { // from class: n45
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m114690B2;
                m114690B2 = B55.m114690B2(Function1.this, obj);
                return m114690B2;
            }
        });
        final C0478i0 c0478i0 = C0478i0.f1771g;
        AbstractC24507p m32029p = m33163C.m32029p(new InterfaceC23484g() { // from class: o45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114686C2(Function1.this, obj);
            }
        });
        final C0481j0 c0481j0 = C0481j0.f1775g;
        AbstractC24507p m32031n = m32029p.m32027r(new InterfaceC23484g() { // from class: p45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114682D2(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: q45
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114678E2();
            }
        });
        final C0484k0 c0484k0 = C0484k0.f1779g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: s45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114674F2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "private fun maybeRedirec…d requirement $it\") }\n  }");
        return m32026s;
    }

    /* renamed from: B1 */
    public final AbstractC24507p<RideRequirement> m114691B1(RideConfig rideConfig, User user, BirdPayment birdPayment) {
        List<AutoPayPlanConfig> autoPayPlans;
        boolean z;
        if (!S55.m86017d(m114568g1()) && !S55.m86020a(user)) {
            if (rideConfig.getAutoPayPlans() != null && (!autoPayPlans.isEmpty())) {
                z = true;
            } else {
                z = false;
            }
            if (z && !rideConfig.getAutoPayPromptFirst() && rideConfig.getAutoPayExpName() != null) {
                String autoPayExpName = rideConfig.getAutoPayExpName();
                Intrinsics.checkNotNull(autoPayExpName);
                return m114588b1(autoPayExpName);
            }
            AbstractC23442F<Balance> mo26979B = this.f1663b.mo26979B(rideConfig.getCurrency());
            final C0410B c0410b = new C0410B(rideConfig, this, user, z, birdPayment);
            AbstractC24507p<RideRequirement> m32065J = mo26979B.m33163C(new InterfaceC23492o() { // from class: K35
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m114687C1;
                    m114687C1 = B55.m114687C1(Function1.this, obj);
                    return m114687C1;
                }
            }).m32065J();
            Intrinsics.checkNotNullExpressionValue(m32065J, "private fun maybeRedirec…   .onErrorComplete()\n  }");
            return m32065J;
        }
        AbstractC24507p<RideRequirement> m32024u = AbstractC24507p.m32024u();
        Intrinsics.checkNotNullExpressionValue(m32024u, "empty()");
        return m32024u;
    }

    /* renamed from: D1 */
    public final AbstractC24507p<RideRequirement> m114683D1(WireBird wireBird, Config config, String str, boolean z) {
        IdentificationIntent identificationIntent;
        String str2;
        BirdModel birdModel;
        InterfaceC45102mT1 interfaceC45102mT1 = this.f1671j;
        if (str == null) {
            identificationIntent = IdentificationIntent.PRIMARY_RIDE;
        } else {
            identificationIntent = IdentificationIntent.GUEST_RIDE;
        }
        IdentificationIntent identificationIntent2 = identificationIntent;
        String habitatId = config.getHabitatId();
        if (wireBird != null) {
            str2 = wireBird.getPartnerId();
        } else {
            str2 = null;
        }
        if (wireBird != null) {
            birdModel = WireBirdKt.birdModel(wireBird);
        } else {
            birdModel = null;
        }
        AbstractC23442F<ZV1> m33146T = interfaceC45102mT1.mo25560i(new IdentificationRequestIdentifier(identificationIntent2, str, habitatId, str2, birdModel)).m33146T(2L);
        final C0412C c0412c = new C0412C();
        AbstractC23442F<R> m33165A = m33146T.m33165A(new InterfaceC23492o() { // from class: S45
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m114679E1;
                m114679E1 = B55.m114679E1(Function1.this, obj);
                return m114679E1;
            }
        });
        final C0415D c0415d = C0415D.f1699g;
        AbstractC23442F m33106t = m33165A.m33106t(new InterfaceC23484g() { // from class: T45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114675F1(Function1.this, obj);
            }
        });
        final C0417E c0417e = new C0417E(z);
        AbstractC24507p m33163C = m33106t.m33163C(new InterfaceC23492o() { // from class: U45
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m114671G1;
                m114671G1 = B55.m114671G1(Function1.this, obj);
                return m114671G1;
            }
        });
        final C0420F c0420f = C0420F.f1703g;
        AbstractC24507p m32065J = m33163C.m32029p(new InterfaceC23484g() { // from class: V45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114667H1(Function1.this, obj);
            }
        }).m32065J();
        final C0422G c0422g = C0422G.f1705g;
        AbstractC24507p m32031n = m32065J.m32027r(new InterfaceC23484g() { // from class: W45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114663I1(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: X45
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114659J1();
            }
        });
        final C0424H c0424h = C0424H.f1707g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: Z45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114655K1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "private fun maybeRedirec…d requirement $it\") }\n  }");
        return m32026s;
    }

    /* renamed from: G2 */
    public final AbstractC24507p<RideRequirement> m114670G2(Config config) {
        AbstractC24507p<RideRequirement> m32024u;
        if (config.getIdentificationConfig().getEnableIdentificationService()) {
            m32024u = m114531o2();
        } else {
            m32024u = AbstractC24507p.m32024u();
        }
        final C0487l0 c0487l0 = C0487l0.f1783g;
        AbstractC24507p<RideRequirement> m32029p = m32024u.m32029p(new InterfaceC23484g() { // from class: E45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114666H2(Function1.this, obj);
            }
        });
        final C0490m0 c0490m0 = C0490m0.f1787g;
        AbstractC24507p<RideRequirement> m32031n = m32029p.m32027r(new InterfaceC23484g() { // from class: F45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114662I2(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: G45
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114658J2();
            }
        });
        final C0492n0 c0492n0 = C0492n0.f1788g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: H45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114654K2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "if (config.identificatio…itted requirement $it\") }");
        return m32026s;
    }

    /* renamed from: L1 */
    public final AbstractC24507p<RideRequirement> m114651L1(Config config) {
        AbstractC24507p<RideRequirement> m32024u;
        if (S55.m86017d(m114568g1())) {
            m32024u = AbstractC24507p.m32024u();
        } else if (config.getIdentificationConfig().getEnableIdentificationService()) {
            m32024u = m114683D1(m114568g1(), config, m114537n1(), m114552k1());
        } else {
            m32024u = AbstractC24507p.m32024u();
        }
        final C0426I c0426i = C0426I.f1709g;
        AbstractC24507p<RideRequirement> m32029p = m32024u.m32029p(new InterfaceC23484g() { // from class: j45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114647M1(Function1.this, obj);
            }
        });
        final C0428J c0428j = C0428J.f1711g;
        AbstractC24507p<RideRequirement> m32031n = m32029p.m32027r(new InterfaceC23484g() { // from class: k45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114643N1(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: l45
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114639O1();
            }
        });
        final C0430K c0430k = C0430K.f1713g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: m45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114635P1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "when {\n      bird.hasPri…itted requirement $it\") }");
        return m32026s;
    }

    /* renamed from: L2 */
    public final AbstractC24507p<RideRequirement> m114650L2() {
        List emptyList;
        AbstractC23442F refreshTutorialsAndGetByContext$default = InterfaceC44791lw0.C25816a.refreshTutorialsAndGetByContext$default(this.f1676o, ConfigurableTutorialContext.QUIZ, null, false, 6, null);
        final C0495o0 c0495o0 = C0495o0.f1792g;
        AbstractC23442F m33106t = refreshTutorialsAndGetByContext$default.m33106t(new InterfaceC23484g() { // from class: t45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114646M2(Function1.this, obj);
            }
        });
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC23442F m33148R = m33106t.m33148R(emptyList);
        final C0498p0 c0498p0 = C0498p0.f1796g;
        AbstractC24507p m33163C = m33148R.m33163C(new InterfaceC23492o() { // from class: u45
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m114642N2;
                m114642N2 = B55.m114642N2(Function1.this, obj);
                return m114642N2;
            }
        });
        final C0501q0 c0501q0 = C0501q0.f1800g;
        AbstractC24507p m32031n = m33163C.m32027r(new InterfaceC23484g() { // from class: v45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114638O2(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: w45
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114634P2();
            }
        });
        final C0503r0 c0503r0 = C0503r0.f1802g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: x45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114630Q2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "configurableTutorialMana…itted requirement $it\") }");
        return m32026s;
    }

    /* renamed from: Q1 */
    public final AbstractC24507p<RideRequirement> m114631Q1(Config config) {
        Lazy lazy;
        Lazy lazy2;
        AbstractC24507p m32024u;
        lazy = LazyKt__LazyJVMKt.lazy(new C0438O());
        lazy2 = LazyKt__LazyJVMKt.lazy(new C0439P(config, this));
        if (m114537n1() != null && m114560i1() == RideRequirementReason.RIDE && m114623S1(lazy2) && !m114627R1(lazy)) {
            m32024u = AbstractC24507p.m32068G(RideRequirement.FlockTogether.INSTANCE);
        } else {
            m32024u = AbstractC24507p.m32024u();
        }
        final C0432L c0432l = C0432L.f1715g;
        AbstractC24507p m32065J = m32024u.m32029p(new InterfaceC23484g() { // from class: e45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114619T1(Function1.this, obj);
            }
        }).m32065J();
        final C0434M c0434m = C0434M.f1717g;
        AbstractC24507p m32031n = m32065J.m32027r(new InterfaceC23484g() { // from class: f45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114615U1(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: h45
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114611V1();
            }
        });
        final C0436N c0436n = C0436N.f1719g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: i45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114607W1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "if (userGuestId != null …itted requirement $it\") }");
        return m32026s;
    }

    /* renamed from: R2 */
    public final AbstractC24507p<RideRequirement> m114626R2(RideConfig rideConfig) {
        AbstractC24507p m32024u;
        String str;
        WireBird m114568g1 = m114568g1();
        if (m114560i1() == RideRequirementReason.RIDE) {
            if (m114568g1 != null) {
                str = m114568g1.getId();
            } else {
                str = null;
            }
            if (str != null && !Intrinsics.areEqual(m114542m1(), m114568g1.getId()) && rideConfig.getSafeRideStart().getEnabled()) {
                m32024u = AbstractC24507p.m32068G(new RideRequirement.SoberStart(m114568g1));
                final C0505s0 c0505s0 = C0505s0.f1803g;
                AbstractC24507p m32065J = m32024u.m32029p(new InterfaceC23484g() { // from class: N45
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        B55.m114610V2(Function1.this, obj);
                    }
                }).m32065J();
                final C0507t0 c0507t0 = C0507t0.f1808g;
                AbstractC24507p m32031n = m32065J.m32027r(new InterfaceC23484g() { // from class: Y45
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        B55.m114622S2(Function1.this, obj);
                    }
                }).m32031n(new InterfaceC23478a() { // from class: j55
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        B55.m114618T2();
                    }
                });
                final C0509u0 c0509u0 = C0509u0.f1810g;
                AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: u55
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        B55.m114614U2(Function1.this, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m32026s, "if (\n      rideRequireme…itted requirement $it\") }");
                return m32026s;
            }
        }
        mo101236d(null);
        m32024u = AbstractC24507p.m32024u();
        final Function1 c0505s02 = C0505s0.f1803g;
        AbstractC24507p m32065J2 = m32024u.m32029p(new InterfaceC23484g() { // from class: N45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114610V2(Function1.this, obj);
            }
        }).m32065J();
        final Function1 c0507t02 = C0507t0.f1808g;
        AbstractC24507p m32031n2 = m32065J2.m32027r(new InterfaceC23484g() { // from class: Y45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114622S2(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: j55
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114618T2();
            }
        });
        final Function1 c0509u02 = C0509u0.f1810g;
        AbstractC24507p<RideRequirement> m32026s2 = m32031n2.m32026s(new InterfaceC23484g() { // from class: u55
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114614U2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s2, "if (\n      rideRequireme…itted requirement $it\") }");
        return m32026s2;
    }

    /* renamed from: W2 */
    public final AbstractC24507p<RideRequirement> m114606W2(TaxInformationConfig taxInformationConfig) {
        AbstractC24507p m32024u;
        if (taxInformationConfig.getEnableSignupFlowScreen()) {
            if (taxInformationConfig.getShowSignupFlowSkipButton() && this.f1662a.m37637c3()) {
                m32024u = AbstractC24507p.m32024u();
            } else {
                AbstractC23442F<Optional<TaxInformation>> mo98738a = this.f1670i.mo98738a();
                final C0511v0 c0511v0 = C0511v0.f1812g;
                m32024u = mo98738a.m33163C(new InterfaceC23492o() { // from class: Z35
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m114602X2;
                        m114602X2 = B55.m114602X2(Function1.this, obj);
                        return m114602X2;
                    }
                });
            }
        } else {
            m32024u = AbstractC24507p.m32024u();
        }
        final C0513w0 c0513w0 = C0513w0.f1814g;
        AbstractC24507p m32065J = m32024u.m32029p(new InterfaceC23484g() { // from class: a45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114598Y2(Function1.this, obj);
            }
        }).m32065J();
        final C0515x0 c0515x0 = C0515x0.f1817g;
        AbstractC24507p m32031n = m32065J.m32027r(new InterfaceC23484g() { // from class: b45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114594Z2(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: c45
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114590a3();
            }
        });
        final C0517y0 c0517y0 = C0517y0.f1819g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: d45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114586b3(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "if (taxInfoConfig.enable…itted requirement $it\") }");
        return m32026s;
    }

    /* renamed from: X1 */
    public final AbstractC24507p<RideRequirement> m114603X1(Config config, User user) {
        if (!S55.m86017d(m114568g1()) && !S55.m86020a(user)) {
            RideConfig rideConfig = config.getRideConfig();
            AbstractC23442F<Boolean> m114584c1 = m114584c1(config);
            final C0440Q c0440q = new C0440Q(rideConfig, user);
            AbstractC24507p<R> m33163C = m114584c1.m33163C(new InterfaceC23492o() { // from class: I45
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m114599Y1;
                    m114599Y1 = B55.m114599Y1(Function1.this, obj);
                    return m114599Y1;
                }
            });
            final C0443R c0443r = C0443R.f1730g;
            AbstractC24507p m32029p = m33163C.m32029p(new InterfaceC23484g() { // from class: J45
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114595Z1(Function1.this, obj);
                }
            });
            final C0444S c0444s = C0444S.f1731g;
            AbstractC24507p m32031n = m32029p.m32027r(new InterfaceC23484g() { // from class: K45
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114591a2(Function1.this, obj);
                }
            }).m32031n(new InterfaceC23478a() { // from class: L45
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    B55.m114587b2();
                }
            });
            final C0445T c0445t = C0445T.f1732g;
            AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: M45
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114583c2(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32026s, "private fun maybeRedirec…d requirement $it\") }\n  }");
            return m32026s;
        }
        AbstractC24507p<RideRequirement> m32024u = AbstractC24507p.m32024u();
        Intrinsics.checkNotNullExpressionValue(m32024u, "empty()");
        return m32024u;
    }

    @Override // p000.J35
    /* renamed from: a */
    public void mo101239a() {
        J35.C3879a c3879a;
        J35.C3879a c3879a2 = this.f1678q;
        if (c3879a2 == null || (c3879a = J35.C3879a.copy$default(c3879a2, null, null, null, false, true, null, 47, null)) == null) {
            c3879a = new J35.C3879a(RideRequirementReason.BIRD_AGNOSTIC, null, null, false, true, null, 46, null);
        }
        this.f1678q = c3879a;
    }

    @Override // p000.J35
    /* renamed from: b */
    public void mo101238b() {
        J35.C3879a c3879a;
        J35.C3879a c3879a2 = this.f1678q;
        if (c3879a2 == null || (c3879a = J35.C3879a.copy$default(c3879a2, null, null, null, true, false, null, 55, null)) == null) {
            c3879a = new J35.C3879a(RideRequirementReason.BIRD_AGNOSTIC, null, null, true, false, null, 54, null);
        }
        this.f1678q = c3879a;
    }

    /* renamed from: b1 */
    public final AbstractC24507p<RideRequirement> m114588b1(String str) {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f1668g.mo15556a(str).m33069Q(), InterfaceC44647lh6.C25764a.updateAutoPay$default(this.f1663b, false, true, null, 4, null).m33159G().m33069Q()});
        AbstractC24507p<RideRequirement> m33045k = AbstractC23461c.m33074L(listOf).m33045k(AbstractC24507p.m32024u());
        Intrinsics.checkNotNullExpressionValue(m33045k, "merge(listOf(\n      expe…  .andThen(Maybe.empty())");
        return m33045k;
    }

    @Override // p000.J35
    /* renamed from: c */
    public void mo101237c(WireBird wireBird) {
        if (wireBird != null) {
            this.f1677p.put(wireBird.getId(), Boolean.TRUE);
        }
    }

    /* renamed from: c1 */
    public final AbstractC23442F<Boolean> m114584c1(Config config) {
        BankRedirectConfig bankRedirectConfig = config.getPaymentConfig().getBankRedirectConfig();
        AbstractC23442F<Balance> mo26979B = this.f1663b.mo26979B(config.getRideConfig().getCurrency());
        final C0502r c0502r = new C0502r(bankRedirectConfig);
        AbstractC23442F m33157I = mo26979B.m33157I(new InterfaceC23492o() { // from class: a55
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m114580d1;
                m114580d1 = B55.m114580d1(Function1.this, obj);
                return m114580d1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "bankRedirectConfig = con… minBalanceToRide\n      }");
        return m33157I;
    }

    /* renamed from: c3 */
    public final AbstractC24507p<RideRequirement> m114582c3() {
        WirePrivateBird wirePrivateBird;
        List<AgreementRole> m86018c;
        String str;
        List<Agreement> list;
        boolean z;
        AbstractC24507p m32024u;
        WireBird m114568g1 = m114568g1();
        if (m114568g1 != null) {
            wirePrivateBird = m114568g1.getPrivateBird();
        } else {
            wirePrivateBird = null;
        }
        if (wirePrivateBird != null) {
            m86018c = S55.m86019b();
        } else {
            m86018c = S55.m86018c();
        }
        Map<AgreementKey, List<Agreement>> value = this.f1664c.mo2957d().getValue();
        List<AgreementRole> list2 = m86018c;
        boolean z2 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AgreementRole agreementRole = (AgreementRole) it.next();
                WireBird m114568g12 = m114568g1();
                if (m114568g12 != null) {
                    str = m114568g12.getPartnerId();
                } else {
                    str = null;
                }
                if (value.get(new AgreementKey(agreementRole, str, m114537n1())) != null && (!list.isEmpty())) {
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
        if (z2) {
            m32024u = AbstractC24507p.m32068G(new RideRequirement.RentalAgreement(m86018c, m114537n1()));
        } else {
            m32024u = AbstractC24507p.m32024u();
        }
        final C0519z0 c0519z0 = C0519z0.f1821g;
        AbstractC24507p m32029p = m32024u.m32029p(new InterfaceC23484g() { // from class: O45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114578d3(Function1.this, obj);
            }
        });
        final C0409A0 c0409a0 = C0409A0.f1689g;
        AbstractC24507p m32031n = m32029p.m32027r(new InterfaceC23484g() { // from class: P45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114574e3(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: Q45
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114570f3();
            }
        });
        final C0411B0 c0411b0 = C0411B0.f1695g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: R45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114566g3(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "if (requiredAgreements.a…itted requirement $it\") }");
        return m32026s;
    }

    @Override // p000.J35
    /* renamed from: d */
    public void mo101236d(String str) {
        this.f1679r = str;
    }

    /* renamed from: d2 */
    public final AbstractC24507p<RideRequirement> m114579d2(Config config, User user) {
        AbstractC24507p m32024u;
        final WireBird m114568g1 = m114568g1();
        if (m114560i1() != RideRequirementReason.RIDE) {
            m32024u = AbstractC24507p.m32024u();
        } else if (m114568g1 == null) {
            m32024u = AbstractC24507p.m32024u();
        } else if (!m114568g1.getHasHelmet()) {
            m32024u = AbstractC24507p.m32024u();
        } else {
            InterfaceC34441Mc2 interfaceC34441Mc2 = this.f1672k;
            ItemLeaseType itemLeaseType = ItemLeaseType.HELMET;
            if (!interfaceC34441Mc2.mo55655t(m114568g1, itemLeaseType)) {
                m32024u = AbstractC24507p.m32024u();
            } else if (this.f1672k.mo55668k(m114568g1, itemLeaseType)) {
                m32024u = AbstractC24507p.m32024u();
            } else if (!this.f1672k.mo55666l(m114568g1, itemLeaseType)) {
                m32024u = this.f1672k.mo55682b().m33069Q().m33045k(AbstractC24507p.m32034k(new Callable() { // from class: O35
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC24574u m114575e2;
                        m114575e2 = B55.m114575e2(B55.this, m114568g1);
                        return m114575e2;
                    }
                }));
            } else {
                m32024u = AbstractC24507p.m32024u();
            }
        }
        final C0446U c0446u = C0446U.f1733g;
        AbstractC24507p m32029p = m32024u.m32029p(new InterfaceC23484g() { // from class: P35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114571f2(Function1.this, obj);
            }
        });
        final C0447V c0447v = C0447V.f1734g;
        AbstractC24507p m32031n = m32029p.m32027r(new InterfaceC23484g() { // from class: Q35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114567g2(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: R35
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114563h2();
            }
        });
        final C0448W c0448w = C0448W.f1735g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: S35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114559i2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "when {\n      // If we're…itted requirement $it\") }");
        return m32026s;
    }

    @Override // p000.J35
    /* renamed from: e */
    public void mo101235e(Integer num) {
        this.f1680s = num;
    }

    /* renamed from: e1 */
    public final boolean m114576e1(int i, Integer num, Integer num2, Integer num3) {
        if (num != null && i < num.intValue()) {
            return false;
        }
        if (num2 != null && i > num2.intValue()) {
            return false;
        }
        if (num3 != null && num3.intValue() > 0 && i % num3.intValue() != 0) {
            return false;
        }
        return true;
    }

    @Override // p000.J35
    /* renamed from: f */
    public void mo101234f(J35.C3879a rideRequirementRequestContext) {
        Intrinsics.checkNotNullParameter(rideRequirementRequestContext, "rideRequirementRequestContext");
        String m101221h = rideRequirementRequestContext.m101221h();
        C41318g46.m40163a("setting current ride requirement request context to " + m101221h, new Object[0]);
        if (!Intrinsics.areEqual(rideRequirementRequestContext.m101225d(), m114556j1())) {
            this.f1681t.clear();
        }
        this.f1678q = rideRequirementRequestContext;
    }

    /* renamed from: f1 */
    public final AbstractC23461c m114572f1(AbstractC23461c abstractC23461c, long j, TimeUnit timeUnit, long j2) {
        AbstractC23461c m33069Q = abstractC23461c.m33061Z(j, timeUnit).m33065U(j2).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "this.timeout(timeout, ti…\n      .onErrorComplete()");
        return m33069Q;
    }

    @Override // p000.J35
    /* renamed from: g */
    public J35.C3879a mo101233g() {
        return this.f1678q;
    }

    /* renamed from: g1 */
    public final WireBird m114568g1() {
        J35.C3879a mo101233g = mo101233g();
        if (mo101233g != null) {
            return mo101233g.m101227b();
        }
        return null;
    }

    @Override // p000.J35
    /* renamed from: h */
    public void mo101232h(WireRide ride) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        m114520q3();
    }

    /* renamed from: h1 */
    public Integer m114564h1() {
        return this.f1680s;
    }

    /* renamed from: h3 */
    public final AbstractC23461c m114562h3(boolean z, final String str, final String str2) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(AgreementRole.RIDER);
        if (z) {
            mutableListOf.add(AgreementRole.PRELOAD);
        }
        if (str2 != null) {
            mutableListOf.add(AgreementRole.MULTI_RIDE_HOST);
        }
        InterfaceC44637lg6 interfaceC44637lg6 = this.f1664c;
        AgreementRole[] agreementRoleArr = (AgreementRole[]) mutableListOf.toArray(new AgreementRole[0]);
        AbstractC24507p refreshAgreements$default = InterfaceC44637lg6.C25760a.refreshAgreements$default(interfaceC44637lg6, (AgreementRole[]) Arrays.copyOf(agreementRoleArr, agreementRoleArr.length), str, null, 4, null);
        final C0414C0 c0414c0 = C0414C0.f1698g;
        InterfaceC23492o interfaceC23492o = new InterfaceC23492o() { // from class: v55
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m114558i3;
                m114558i3 = B55.m114558i3(Function1.this, obj);
                return m114558i3;
            }
        };
        final C0416D0 c0416d0 = C0416D0.f1700g;
        AbstractC24507p m32019z = refreshAgreements$default.m32019z(interfaceC23492o, new InterfaceC23492o() { // from class: w55
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m114554j3;
                m114554j3 = B55.m114554j3(Function1.this, obj);
                return m114554j3;
            }
        }, new Callable() { // from class: x55
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC24574u m114550k3;
                m114550k3 = B55.m114550k3(str2, this, str);
                return m114550k3;
            }
        });
        final C0419E0 c0419e0 = C0419E0.f1702g;
        AbstractC23461c m32074A = m32019z.m32074A(new InterfaceC23492o() { // from class: y55
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m114545l3;
                m114545l3 = B55.m114545l3(Function1.this, obj);
                return m114545l3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32074A, "userAgreementManager.ref…rowable(it.toString())) }");
        return m32074A;
    }

    @Override // p000.J35
    /* renamed from: i */
    public AbstractC24507p<RideRequirement> mo101231i() {
        String str;
        final User m37750B0 = this.f1662a.m37750B0();
        if (m37750B0 != null) {
            final Config m80769c = C36441Uq4.m80769c(this.f1669h, m114568g1());
            WireBird m114568g1 = m114568g1();
            String str2 = null;
            if (m114568g1 != null) {
                str = m114568g1.getPartnerId();
            } else {
                str = null;
            }
            AbstractC24507p m33045k = m114540m3(str, m114537n1()).m33045k(AbstractC24507p.m32034k(new Callable() { // from class: h55
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC24574u m114515r3;
                    m114515r3 = B55.m114515r3(B55.this, m37750B0, m80769c);
                    return m114515r3;
                }
            }));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            J35.C3879a mo101233g = mo101233g();
            if (mo101233g != null) {
                str2 = mo101233g.m101221h();
            }
            AbstractC24507p m32052X = m33045k.m32052X(30L, timeUnit, AbstractC24507p.m32023v(new RideRequirementTimeoutException("timeout while computing ride requirements (context=" + str2 + ")")));
            final C0425H0 c0425h0 = C0425H0.f1708g;
            AbstractC24507p m32029p = m32052X.m32029p(new InterfaceC23484g() { // from class: i55
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114510s3(Function1.this, obj);
                }
            });
            final C0427I0 c0427i0 = C0427I0.f1710g;
            AbstractC24507p m32031n = m32029p.m32027r(new InterfaceC23484g() { // from class: k55
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114505t3(Function1.this, obj);
                }
            }).m32031n(new InterfaceC23478a() { // from class: l55
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    B55.m114500u3();
                }
            });
            final C0429J0 c0429j0 = C0429J0.f1712g;
            AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: m55
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114495v3(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32026s, "refreshMissingData(bird?…itted requirement $it\") }");
            return m32026s;
        }
        throw new IllegalArgumentException("User was null, must not be by ride start time".toString());
    }

    /* renamed from: i1 */
    public final RideRequirementReason m114560i1() {
        J35.C3879a mo101233g = mo101233g();
        if (mo101233g != null) {
            return mo101233g.m101226c();
        }
        return null;
    }

    @Override // p000.J35
    /* renamed from: j */
    public AbstractC24507p<RideRequirement> mo101230j(RideRequirement rideRequirement) {
        boolean z;
        boolean areEqual;
        boolean areEqual2;
        InterfaceC0491n interfaceC0491n;
        Intrinsics.checkNotNullParameter(rideRequirement, "rideRequirement");
        boolean z2 = true;
        if (Intrinsics.areEqual(rideRequirement, RideRequirement.AutoPay.INSTANCE)) {
            z = true;
        } else {
            z = rideRequirement instanceof RideRequirement.AutoPayV2;
        }
        if (z) {
            interfaceC0491n = this.f1654C;
        } else {
            if (!Intrinsics.areEqual(rideRequirement, RideRequirement.Cancel.INSTANCE)) {
                if (rideRequirement instanceof RideRequirement.DirectManualEntryIdentification) {
                    areEqual = true;
                } else {
                    areEqual = Intrinsics.areEqual(rideRequirement, RideRequirement.ScanDriverLicenseWithIdentification.INSTANCE);
                }
                if (areEqual) {
                    areEqual2 = true;
                } else {
                    areEqual2 = Intrinsics.areEqual(rideRequirement, RideRequirement.SelectIdentificationMethod.INSTANCE);
                }
                if (!areEqual2) {
                    z2 = Intrinsics.areEqual(rideRequirement, RideRequirement.IdentificationScanRequiresAppUpgrade.INSTANCE);
                }
                if (z2) {
                    interfaceC0491n = this.f1684w;
                } else if (Intrinsics.areEqual(rideRequirement, RideRequirement.PendingIdentificationCheck.INSTANCE)) {
                    interfaceC0491n = this.f1656E;
                } else if (Intrinsics.areEqual(rideRequirement, RideRequirement.FlockTogether.INSTANCE)) {
                    interfaceC0491n = this.f1652A;
                } else if (rideRequirement instanceof RideRequirement.GooglePay) {
                    interfaceC0491n = this.f1655D;
                } else if (rideRequirement instanceof RideRequirement.HelmetSelfieConfirmation) {
                    interfaceC0491n = this.f1686y;
                } else if (rideRequirement instanceof RideRequirement.LeaseBasedHelmetPrompt) {
                    interfaceC0491n = this.f1685x;
                } else if (Intrinsics.areEqual(rideRequirement, RideRequirement.Payment.INSTANCE)) {
                    interfaceC0491n = this.f1683v;
                } else if (rideRequirement instanceof RideRequirement.PreloadV2) {
                    interfaceC0491n = this.f1682u;
                } else if (!Intrinsics.areEqual(rideRequirement, RideRequirement.PushNotification.INSTANCE)) {
                    if (Intrinsics.areEqual(rideRequirement, RideRequirement.Quiz.INSTANCE)) {
                        interfaceC0491n = this.f1657F;
                    } else if (rideRequirement instanceof RideRequirement.RentalAgreement) {
                        interfaceC0491n = this.f1653B;
                    } else if (rideRequirement instanceof RideRequirement.RiderHomeAreaPrompt) {
                        interfaceC0491n = this.f1659H;
                    } else if (rideRequirement instanceof RideRequirement.SoberStart) {
                        interfaceC0491n = this.f1658G;
                    } else if (Intrinsics.areEqual(rideRequirement, RideRequirement.TaxInformationRequirement.INSTANCE)) {
                        interfaceC0491n = this.f1687z;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            interfaceC0491n = null;
        }
        if (interfaceC0491n == null) {
            AbstractC24507p<RideRequirement> m32024u = AbstractC24507p.m32024u();
            Intrinsics.checkNotNullExpressionValue(m32024u, "empty()");
            return m32024u;
        }
        User m37750B0 = this.f1662a.m37750B0();
        if (m37750B0 != null) {
            return interfaceC0491n.mo114388a().invoke(C36441Uq4.m80769c(this.f1669h, m114568g1()), m37750B0);
        }
        throw new IllegalArgumentException("User was null, must not be by ride start time".toString());
    }

    /* renamed from: j1 */
    public final String m114556j1() {
        J35.C3879a mo101233g = mo101233g();
        if (mo101233g != null) {
            return mo101233g.m101225d();
        }
        return null;
    }

    /* renamed from: j2 */
    public final AbstractC24507p<RideRequirement> m114555j2(Config config, User user) {
        Integer num;
        Integer num2;
        AbstractC24507p m32068G;
        WireBird m114568g1 = m114568g1();
        if (m114560i1() != RideRequirementReason.RIDE) {
            m32068G = AbstractC24507p.m32024u();
        } else if (m114568g1 == null) {
            m32068G = AbstractC24507p.m32024u();
        } else if (S55.m86017d(m114568g1)) {
            m32068G = AbstractC24507p.m32024u();
        } else if (Intrinsics.areEqual(config.getComplianceConfig().getHelmetLeaseCanBypassSelfie(), Boolean.TRUE) && this.f1672k.mo55666l(m114568g1, ItemLeaseType.HELMET)) {
            m32068G = AbstractC24507p.m32024u();
        } else if (!this.f1673l.mo55715b(m114568g1)) {
            m32068G = AbstractC24507p.m32024u();
        } else {
            int rideCount = user.getRideCount();
            HelmetSelfieConfig helmetSelfie = config.getRideConfig().getHelmetSelfie();
            Integer num3 = null;
            if (helmetSelfie != null) {
                num = helmetSelfie.getMinRideCount();
            } else {
                num = null;
            }
            HelmetSelfieConfig helmetSelfie2 = config.getRideConfig().getHelmetSelfie();
            if (helmetSelfie2 != null) {
                num2 = helmetSelfie2.getMaxRideCount();
            } else {
                num2 = null;
            }
            HelmetSelfieConfig helmetSelfie3 = config.getRideConfig().getHelmetSelfie();
            if (helmetSelfie3 != null) {
                num3 = helmetSelfie3.getRideFrequency();
            }
            if (!m114576e1(rideCount, num, num2, num3)) {
                m32068G = AbstractC24507p.m32024u();
            } else {
                m32068G = AbstractC24507p.m32068G(new RideRequirement.HelmetSelfieConfirmation(m114568g1));
            }
        }
        final C0449X c0449x = C0449X.f1736g;
        AbstractC24507p m32029p = m32068G.m32029p(new InterfaceC23484g() { // from class: z55
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114551k2(Function1.this, obj);
            }
        });
        final C0450Y c0450y = C0450Y.f1737g;
        AbstractC24507p m32031n = m32029p.m32027r(new InterfaceC23484g() { // from class: L35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114546l2(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: M35
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114541m2();
            }
        });
        final C0451Z c0451z = C0451Z.f1738g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: N35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114536n2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "when {\n      // If we're…itted requirement $it\") }");
        return m32026s;
    }

    @Override // p000.J35
    /* renamed from: k */
    public void mo101229k() {
        C41318g46.m40163a("clearing current ride requirement request context", new Object[0]);
        this.f1678q = null;
        this.f1681t.clear();
    }

    /* renamed from: k1 */
    public final boolean m114552k1() {
        J35.C3879a mo101233g = mo101233g();
        return mo101233g != null && mo101233g.m101224e();
    }

    /* renamed from: l1 */
    public final boolean m114547l1() {
        J35.C3879a mo101233g = mo101233g();
        return mo101233g != null && mo101233g.m101223f();
    }

    /* renamed from: m1 */
    public String m114542m1() {
        return this.f1679r;
    }

    /* renamed from: m3 */
    public final AbstractC23461c m114540m3(String str, String str2) {
        List listOf;
        AbstractC23461c m33159G = InterfaceC44647lh6.C25764a.fetchBalance$default(this.f1663b, null, 1, null).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "userManager.fetchBalance().ignoreElement()");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{m114572f1(m33159G, 10L, timeUnit, 1L), m114572f1(m114562h3(this.f1664c.mo2960a().getValue().booleanValue(), str, str2), 10L, timeUnit, 1L), m114572f1(this.f1665d.mo85670h(), 10L, timeUnit, 1L), m114572f1(this.f1666e.mo25735j(), 10L, timeUnit, 1L), m114572f1(this.f1666e.mo25779A(), 10L, timeUnit, 1L)});
        AbstractC23461c m33074L = AbstractC23461c.m33074L(listOf);
        final C0421F0 c0421f0 = C0421F0.f1704g;
        AbstractC23461c m33069Q = m33074L.m33084B(new InterfaceC23484g() { // from class: n55
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114535n3(Function1.this, obj);
            }
        }).m33069Q();
        final C0423G0 c0423g0 = C0423G0.f1706g;
        AbstractC23461c m33029z = m33069Q.m33081E(new InterfaceC23484g() { // from class: o55
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114530o3(Function1.this, obj);
            }
        }).m33029z(new InterfaceC23478a() { // from class: p55
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114525p3();
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "merge(listOf(\n      user…MissingData completed\") }");
        return m33029z;
    }

    /* renamed from: n1 */
    public final String m114537n1() {
        J35.C3879a mo101233g = mo101233g();
        if (mo101233g != null) {
            return mo101233g.m101222g();
        }
        return null;
    }

    /* renamed from: o1 */
    public final boolean m114532o1(Balance balance) {
        return balance.getAutoPayAskedAt() != null || System.currentTimeMillis() - this.f1662a.m37555x0() < TimeUnit.MINUTES.toMillis(10L);
    }

    /* renamed from: o2 */
    public final AbstractC24507p<RideRequirement> m114531o2() {
        AbstractC23442F m33124k = AbstractC23442F.m33124k(new Callable() { // from class: b55
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m114526p2;
                m114526p2 = B55.m114526p2(B55.this);
                return m114526p2;
            }
        });
        final C0454a0 c0454a0 = new C0454a0();
        AbstractC24507p m33163C = m33124k.m33163C(new InterfaceC23492o() { // from class: c55
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m114521q2;
                m114521q2 = B55.m114521q2(Function1.this, obj);
                return m114521q2;
            }
        });
        final C0457b0 c0457b0 = C0457b0.f1743g;
        AbstractC24507p m32029p = m33163C.m32029p(new InterfaceC23484g() { // from class: d55
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114516r2(Function1.this, obj);
            }
        });
        final C0460c0 c0460c0 = C0460c0.f1747g;
        AbstractC24507p m32031n = m32029p.m32027r(new InterfaceC23484g() { // from class: e55
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114511s2(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: f55
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114506t2();
            }
        });
        final C0463d0 c0463d0 = C0463d0.f1750g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: g55
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114501u2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "private fun maybeRedirec…d requirement $it\") }\n  }");
        return m32026s;
    }

    /* renamed from: p1 */
    public final AbstractC24507p<RideRequirement> m114527p1(Config config, User user) {
        if (!S55.m86017d(m114568g1()) && !S55.m86020a(user)) {
            boolean m37558w1 = this.f1662a.m37558w1();
            C24530g c24530g = C24530g.f91174a;
            AbstractC23442F m33113p0 = AbstractC23442F.m33113p0(this.f1666e.mo25710x(), this.f1666e.mo25709y(), this.f1666e.mo25739h(), this.f1663b.mo26979B(config.getRideConfig().getCurrency()), new C0504s());
            Intrinsics.checkExpressionValueIsNotNull(m33113p0, "Single.zip(s1, s2, s3, s…invoke(t1, t2, t3, t4) })");
            final C0506t c0506t = new C0506t(config, m37558w1, user);
            AbstractC24507p m33163C = m33113p0.m33163C(new InterfaceC23492o() { // from class: T35
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m114522q1;
                    m114522q1 = B55.m114522q1(Function1.this, obj);
                    return m114522q1;
                }
            });
            final C0508u c0508u = C0508u.f1809g;
            AbstractC24507p m32065J = m33163C.m32029p(new InterfaceC23484g() { // from class: U35
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114517r1(Function1.this, obj);
                }
            }).m32065J();
            final C0510v c0510v = C0510v.f1811g;
            AbstractC24507p m32031n = m32065J.m32027r(new InterfaceC23484g() { // from class: W35
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114512s1(Function1.this, obj);
                }
            }).m32031n(new InterfaceC23478a() { // from class: X35
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    B55.m114507t1();
                }
            });
            final C0512w c0512w = C0512w.f1813g;
            AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: Y35
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114502u1(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32026s, "private fun maybeRedirec…d requirement $it\") }\n  }");
            return m32026s;
        }
        AbstractC24507p<RideRequirement> m32024u = AbstractC24507p.m32024u();
        Intrinsics.checkNotNullExpressionValue(m32024u, "empty()");
        return m32024u;
    }

    /* renamed from: q3 */
    public final void m114520q3() {
        String id;
        String id2;
        WireBird m114568g1 = m114568g1();
        if (m114568g1 != null && (id2 = m114568g1.getId()) != null) {
            this.f1677p.remove(id2);
        }
        WireBird m114568g12 = m114568g1();
        if (m114568g12 != null && (id = m114568g12.getId()) != null) {
            this.f1673l.mo55713e(id);
        }
    }

    /* renamed from: v1 */
    public final AbstractC24507p<RideRequirement> m114497v1(RideConfig rideConfig, User user) {
        AbstractC24507p m32024u;
        if (!S55.m86017d(m114568g1()) && !S55.m86020a(user)) {
            if (!rideConfig.getAutoPayPromptFirst() && Intrinsics.areEqual(rideConfig.getAutoPayUseFullscreenFlow(), Boolean.TRUE)) {
                AbstractC23442F<Balance> mo26979B = this.f1663b.mo26979B(rideConfig.getCurrency());
                final C0514x c0514x = new C0514x(rideConfig);
                m32024u = mo26979B.m33163C(new InterfaceC23492o() { // from class: y45
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m114492w1;
                        m114492w1 = B55.m114492w1(Function1.this, obj);
                        return m114492w1;
                    }
                });
            } else {
                m32024u = AbstractC24507p.m32024u();
            }
            final C0516y c0516y = C0516y.f1818g;
            AbstractC24507p m32065J = m32024u.m32029p(new InterfaceC23484g() { // from class: z45
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114487x1(Function1.this, obj);
                }
            }).m32065J();
            final C0518z c0518z = C0518z.f1820g;
            AbstractC24507p m32031n = m32065J.m32027r(new InterfaceC23484g() { // from class: A45
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114482y1(Function1.this, obj);
                }
            }).m32031n(new InterfaceC23478a() { // from class: B45
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    B55.m114477z1();
                }
            });
            final C0408A c0408a = C0408A.f1688g;
            AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: D45
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    B55.m114696A1(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32026s, "private fun maybeRedirec…d requirement $it\") }\n  }");
            return m32026s;
        }
        AbstractC24507p<RideRequirement> m32024u2 = AbstractC24507p.m32024u();
        Intrinsics.checkNotNullExpressionValue(m32024u2, "{\n      Maybe.empty()\n    }");
        return m32024u2;
    }

    /* renamed from: v2 */
    public final AbstractC24507p<RideRequirement> m114496v2(Config config, User user) {
        List listOf;
        Integer num;
        Integer num2;
        AbstractC24507p m32068G;
        RideRequirementReason m114560i1 = m114560i1();
        boolean z = false;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new RideRequirementReason[]{RideRequirementReason.RIDE, RideRequirementReason.ONBOARDING_BANNER});
        if (!BirdPaymentKt.isOneOf(m114560i1, listOf)) {
            m32068G = AbstractC24507p.m32024u();
        } else {
            RiderHomeAreaPromptConfig riderHomeAreaPromptConfig = config.getRiderHomeAreaPromptConfig();
            if (riderHomeAreaPromptConfig != null && riderHomeAreaPromptConfig.getEnabled()) {
                z = true;
            }
            if (!z) {
                m32068G = AbstractC24507p.m32024u();
            } else {
                Integer m114564h1 = m114564h1();
                int rideCount = user.getRideCount();
                if (m114564h1 != null && m114564h1.intValue() == rideCount) {
                    m32068G = AbstractC24507p.m32024u();
                } else if (S55.m86017d(m114568g1())) {
                    m32068G = AbstractC24507p.m32024u();
                } else {
                    int rideCount2 = user.getRideCount();
                    RiderHomeAreaPromptConfig riderHomeAreaPromptConfig2 = config.getRiderHomeAreaPromptConfig();
                    Integer num3 = null;
                    if (riderHomeAreaPromptConfig2 != null) {
                        num = riderHomeAreaPromptConfig2.getMinRideCount();
                    } else {
                        num = null;
                    }
                    RiderHomeAreaPromptConfig riderHomeAreaPromptConfig3 = config.getRiderHomeAreaPromptConfig();
                    if (riderHomeAreaPromptConfig3 != null) {
                        num2 = riderHomeAreaPromptConfig3.getMaxRideCount();
                    } else {
                        num2 = null;
                    }
                    RiderHomeAreaPromptConfig riderHomeAreaPromptConfig4 = config.getRiderHomeAreaPromptConfig();
                    if (riderHomeAreaPromptConfig4 != null) {
                        num3 = riderHomeAreaPromptConfig4.getRideFrequency();
                    }
                    if (!m114576e1(rideCount2, num, num2, num3)) {
                        m32068G = AbstractC24507p.m32024u();
                    } else {
                        m32068G = AbstractC24507p.m32068G(new RideRequirement.RiderHomeAreaPrompt(m114568g1()));
                    }
                }
            }
        }
        final C0466e0 c0466e0 = C0466e0.f1754g;
        AbstractC24507p m32065J = m32068G.m32029p(new InterfaceC23484g() { // from class: V35
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114491w2(Function1.this, obj);
            }
        }).m32065J();
        final C0469f0 c0469f0 = C0469f0.f1758g;
        AbstractC24507p m32031n = m32065J.m32027r(new InterfaceC23484g() { // from class: g45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114486x2(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: r45
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114481y2();
            }
        });
        final C0472g0 c0472g0 = C0472g0.f1762g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: C45
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114476z2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "when {\n      // If we're…itted requirement $it\") }");
        return m32026s;
    }

    /* renamed from: w3 */
    public final AbstractC24507p<RideRequirement> m114490w3(User user, Config config) {
        List<InterfaceC0491n> list;
        List minus;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getIdentificationConfig().getOnboardingBeforePayment()) {
            list = CollectionsKt___CollectionsKt.sortedWith(this.f1661J, new C0431K0());
        } else {
            list = this.f1661J;
        }
        minus = CollectionsKt___CollectionsKt.minus((Iterable) list, (Iterable) this.f1681t);
        List<InterfaceC0491n> list2 = minus;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (InterfaceC0491n interfaceC0491n : list2) {
            arrayList.add(interfaceC0491n.mo114388a().invoke(config, user));
        }
        AbstractC24507p m32171U = AbstractC24507p.m32039h(arrayList).m32171U();
        final C0433L0 c0433l0 = C0433L0.f1716g;
        AbstractC24507p m32029p = m32171U.m32029p(new InterfaceC23484g() { // from class: q55
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114485x3(Function1.this, obj);
            }
        });
        final C0435M0 c0435m0 = C0435M0.f1718g;
        AbstractC24507p m32031n = m32029p.m32027r(new InterfaceC23484g() { // from class: r55
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114480y3(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: s55
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                B55.m114475z3();
            }
        });
        final C0437N0 c0437n0 = C0437N0.f1720g;
        AbstractC24507p<RideRequirement> m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: t55
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                B55.m114694A3(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "concat(rideRequirementCh…itted requirement $it\") }");
        return m32026s;
    }
}
