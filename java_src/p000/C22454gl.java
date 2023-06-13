package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.config.tweaks.dsl.Tweaks;
import co.bird.android.model.BountyBirdsFilter;
import co.bird.android.model.Contractor;
import co.bird.android.model.Deal;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.ReservationPrice;
import co.bird.android.model.TokenPair;
import co.bird.android.model.TokenPairState;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.UserRoleItem;
import co.bird.android.model.UserRoleItemKt;
import co.bird.android.model.VehiclePricingDetails;
import co.bird.android.model.constant.DeserializerKind;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.constant.UserRole;
import co.bird.android.model.contractor.ContractorSpecialProgramsResponse;
import co.bird.android.model.filter.NestTypeFilter;
import co.bird.android.model.identification.IdentificationDebugResponse;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WireReleaseAssignmentMapBanner;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireRidePrice;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.google.gson.JsonSyntaxException;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import no.nordicsemi.android.ble.AbstractC26684u0;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000ê\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 h2\u00020\u0001:\u0007L§\u0002¦\u0002Â\u0002B#\u0012\u0006\u0010W\u001a\u00020V\u0012\b\u0010Å\u0002\u001a\u00030Ã\u0002\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0006\bÜ\u0002\u0010Ý\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J6\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u0006H\u0002J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\f\u0010\u0015\u001a\u00020\u000f*\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u0004J\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010\u001f\u001a\u00020\u0004J\u0006\u0010 \u001a\u00020\u0014J\b\u0010!\u001a\u0004\u0018\u00010\u0007J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$J\u000f\u0010'\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(J\u000e\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)J\u0012\u0010.\u001a\u00020)2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,J\u0006\u0010/\u001a\u00020\u0004J\u000e\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200J\u0006\u00103\u001a\u000200J\u000e\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u000204J\b\u00107\u001a\u0004\u0018\u000104J\u000e\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u000208J\b\u0010;\u001a\u0004\u0018\u000108J\u000e\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<J\u0006\u0010?\u001a\u00020\u0004J\u0006\u0010@\u001a\u00020<J\u000e\u0010A\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<J\u0006\u0010B\u001a\u00020<J\u0016\u0010E\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0014J\u0014\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010FJ\u0006\u0010H\u001a\u00020\u0004J\u000e\u0010I\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<J\u0006\u0010J\u001a\u00020\u0014J\u000e\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0007J\u000e\u0010M\u001a\u00020\u00142\u0006\u0010K\u001a\u00020\u0007J\u000e\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0014J\u000e\u0010R\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020PJ\u0006\u0010S\u001a\u00020PJ\u0006\u0010T\u001a\u00020\u0014J\u0006\u0010U\u001a\u00020\u0004J\u0016\u0010Z\u001a\u00020\u00072\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020XJ\u000e\u0010\\\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u0007J\b\u0010]\u001a\u0004\u0018\u00010\u0007J\u0016\u0010_\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020X2\u0006\u0010^\u001a\u00020\u0014J\u000e\u0010`\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020XJ\u001f\u0010b\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020X2\b\u0010a\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bb\u0010cJ\u000e\u0010d\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020XJ\u000e\u0010f\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u0007J\b\u0010g\u001a\u0004\u0018\u00010\u0007J\u0006\u0010h\u001a\u00020\u0004J\b\u0010j\u001a\u0004\u0018\u00010iJ\u000e\u0010m\u001a\u00020k2\u0006\u0010l\u001a\u00020kJ\b\u0010n\u001a\u0004\u0018\u00010kJ\u0006\u0010o\u001a\u00020PJ\u000e\u0010p\u001a\u00020\u00042\u0006\u0010e\u001a\u00020PJ\u0006\u0010q\u001a\u00020\u000fJ\u000e\u0010s\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u000fJ\u0010\u0010u\u001a\u00020\u00042\b\u0010t\u001a\u0004\u0018\u00010\u0007J\b\u0010v\u001a\u0004\u0018\u00010\u0007J\u0010\u0010y\u001a\u00020\u00042\b\u0010x\u001a\u0004\u0018\u00010wJ\b\u0010z\u001a\u0004\u0018\u00010wJ\u000e\u0010}\u001a\u00020\u00042\u0006\u0010|\u001a\u00020{J\u0006\u0010~\u001a\u00020{J\u000e\u0010\u007f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0007\u0010\u0080\u0001\u001a\u00020\u0002J\t\u0010\u0081\u0001\u001a\u00020\u0002H\u0007J\u0010\u0010\u0083\u0001\u001a\u00020\u00142\u0007\u0010\u0082\u0001\u001a\u00020\u0007J\u0010\u0010\u0084\u0001\u001a\u00020\u00042\u0007\u0010\u0082\u0001\u001a\u00020\u0007J\u0010\u0010\u0085\u0001\u001a\u00020\u00142\u0007\u0010\u0082\u0001\u001a\u00020\u0007J\u0010\u0010\u0086\u0001\u001a\u00020\u00042\u0007\u0010\u0082\u0001\u001a\u00020\u0007J\u0007\u0010\u0087\u0001\u001a\u00020\u0014J\u0007\u0010\u0088\u0001\u001a\u00020\u0004J\u0007\u0010\u0089\u0001\u001a\u00020\u0014J\u0007\u0010\u008a\u0001\u001a\u00020\u0004J\u000f\u0010\u008b\u0001\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u0007J\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0007J\u0011\u0010\u008f\u0001\u001a\u00020\u00042\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u00142\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001J\u0007\u0010\u0091\u0001\u001a\u00020\u0004J\u0007\u0010\u0092\u0001\u001a\u00020\u000fJ\u0010\u0010\u0094\u0001\u001a\u00020\u000f2\u0007\u0010\u0093\u0001\u001a\u00020\u0007J\u0007\u0010\u0095\u0001\u001a\u00020\u000fJ\u0007\u0010\u0096\u0001\u001a\u00020\u000fJ\u0007\u0010\u0097\u0001\u001a\u00020\u0004J\u0007\u0010\u0098\u0001\u001a\u00020\u000fJ\u0007\u0010\u0099\u0001\u001a\u00020\u0004J\u0007\u0010\u009a\u0001\u001a\u00020\u0014J\u0007\u0010\u009b\u0001\u001a\u00020\u0004J\u0007\u0010\u009c\u0001\u001a\u00020\u0014J\u0007\u0010\u009d\u0001\u001a\u00020\u0004J\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001J\u0007\u0010 \u0001\u001a\u00020\u0014J\u0007\u0010¡\u0001\u001a\u00020\u0004J\u0010\u0010£\u0001\u001a\u00020\u00042\u0007\u0010¢\u0001\u001a\u00020\u000fJ\u0012\u0010¤\u0001\u001a\u0004\u0018\u00010\u000f¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0010\u0010§\u0001\u001a\u00020\u00042\u0007\u0010¦\u0001\u001a\u00020\u0007J\u0010\u0010¨\u0001\u001a\u00020\u00142\u0007\u0010¦\u0001\u001a\u00020\u0007J\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001J\u0011\u0010¬\u0001\u001a\u00020\u00042\b\u0010«\u0001\u001a\u00030©\u0001J\u0011\u0010¯\u0001\u001a\u00020\u00042\b\u0010®\u0001\u001a\u00030\u00ad\u0001J\u0011\u0010°\u0001\u001a\u00020\u00042\b\u0010®\u0001\u001a\u00030\u00ad\u0001J\u0011\u0010³\u0001\u001a\u00020\u00042\b\u0010²\u0001\u001a\u00030±\u0001J\n\u0010´\u0001\u001a\u0005\u0018\u00010\u00ad\u0001J\n\u0010µ\u0001\u001a\u0005\u0018\u00010\u00ad\u0001J\n\u0010¶\u0001\u001a\u0005\u0018\u00010±\u0001J\u0018\u0010¸\u0001\u001a\u00020\u00042\u0007\u0010·\u0001\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tJ'\u0010¼\u0001\u001a\u00020\u00042\u000e\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¹\u00012\u000e\u0010»\u0001\u001a\t\u0012\u0004\u0012\u00020\f0¹\u0001J\u0013\u0010½\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000bJ\u001b\u0010Â\u0001\u001a\u00020\u00042\b\u0010¿\u0001\u001a\u00030¾\u00012\b\u0010Á\u0001\u001a\u00030À\u0001J\n\u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u0001J\u0007\u0010Å\u0001\u001a\u00020\u0004J\u0007\u0010Æ\u0001\u001a\u00020\u0004J\u0007\u0010Ç\u0001\u001a\u00020\u0014J\u0010\u0010É\u0001\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\u0007J\u0010\u0010Ê\u0001\u001a\u00020\u00142\u0007\u0010È\u0001\u001a\u00020\u0007J\u0010\u0010Ë\u0001\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\u0007J\u0010\u0010Ì\u0001\u001a\u00020\u00142\u0007\u0010È\u0001\u001a\u00020\u0007J\u0019\u0010Ï\u0001\u001a\u00020\u00042\u0007\u0010Í\u0001\u001a\u00020\u00072\u0007\u0010Î\u0001\u001a\u00020\u0014J\u0010\u0010Ñ\u0001\u001a\u00020\u00042\u0007\u0010Ð\u0001\u001a\u00020\u0007J\t\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0007J\t\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0007J\u0012\u0010Õ\u0001\u001a\u00020\u00042\t\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0007J\u0007\u0010Ö\u0001\u001a\u00020\u0014J\u0010\u0010Ø\u0001\u001a\u00020\u00042\u0007\u0010×\u0001\u001a\u00020\u0014J\n\u0010Ú\u0001\u001a\u0005\u0018\u00010Ù\u0001J\u0007\u0010Û\u0001\u001a\u00020\u0004J\b\u0010Ý\u0001\u001a\u00030Ü\u0001J\u0007\u0010Þ\u0001\u001a\u00020\u0004J\u0011\u0010á\u0001\u001a\u00020\u00042\b\u0010à\u0001\u001a\u00030ß\u0001J\b\u0010â\u0001\u001a\u00030ß\u0001J\b\u0010ã\u0001\u001a\u00030ß\u0001J\u0011\u0010ä\u0001\u001a\u00020\u00042\b\u0010à\u0001\u001a\u00030ß\u0001J\n\u0010å\u0001\u001a\u0005\u0018\u00010ß\u0001J\b\u0010æ\u0001\u001a\u00030ß\u0001J\u0010\u0010è\u0001\u001a\u00020\u00042\u0007\u0010ç\u0001\u001a\u00020\u0007J\t\u0010é\u0001\u001a\u0004\u0018\u00010\u0007J\u0010\u0010ë\u0001\u001a\u00020\u00042\u0007\u0010ê\u0001\u001a\u00020\u0007J\t\u0010ì\u0001\u001a\u0004\u0018\u00010\u0007J\u0007\u0010í\u0001\u001a\u00020\u0004J\u0007\u0010î\u0001\u001a\u00020\u0014J\u0007\u0010ï\u0001\u001a\u00020\u0004J\u0007\u0010ð\u0001\u001a\u00020\u0004J\u0007\u0010ñ\u0001\u001a\u00020\u0014J\u0007\u0010ò\u0001\u001a\u00020\u0004J\u0007\u0010ó\u0001\u001a\u00020\u0014J\u0019\u0010ö\u0001\u001a\u00020\u00042\u0007\u0010ô\u0001\u001a\u00020\u000f2\u0007\u0010õ\u0001\u001a\u00020\u000fJ\u0013\u0010÷\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0FJ\u0010\u0010ù\u0001\u001a\u00020\u00042\u0007\u0010ø\u0001\u001a\u00020\u000fJ\u0007\u0010ú\u0001\u001a\u00020\u000fJ\u0011\u0010ý\u0001\u001a\u00020\u00042\b\u0010ü\u0001\u001a\u00030û\u0001J\u0007\u0010þ\u0001\u001a\u00020\u0004J\n\u0010ÿ\u0001\u001a\u0005\u0018\u00010û\u0001J\u0011\u0010\u0082\u0002\u001a\u00020\u00042\b\u0010\u0081\u0002\u001a\u00030\u0080\u0002J\n\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0080\u0002J\u0010\u0010\u0085\u0002\u001a\u00020\u00042\u0007\u0010\u0084\u0002\u001a\u00020\u0007J\u0010\u0010\u0086\u0002\u001a\u00020\u00142\u0007\u0010\u0084\u0002\u001a\u00020\u0007J\u0007\u0010\u0087\u0002\u001a\u00020\u0004J\u0007\u0010\u0088\u0002\u001a\u00020\u0014J\u0010\u0010\u008a\u0002\u001a\u00020\u00042\u0007\u0010\u0089\u0002\u001a\u00020\u0014J\u0012\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0014¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\u0010\u0010\u008e\u0002\u001a\u00020\u00042\u0007\u0010\u008d\u0002\u001a\u00020\u0007J\u0010\u0010\u008f\u0002\u001a\u00020\u00142\u0007\u0010\u008d\u0002\u001a\u00020\u0007J\u0007\u0010\u0090\u0002\u001a\u00020\u0004J\u0007\u0010\u0091\u0002\u001a\u00020\u0014J\u000f\u0010\u0092\u0002\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u0007J\u0010\u0010\u0094\u0002\u001a\u00020\u000f2\u0007\u0010\u0093\u0002\u001a\u00020\u0007J\u0010\u0010\u0095\u0002\u001a\u00020\u000f2\u0007\u0010\u0093\u0002\u001a\u00020\u0007J\u0018\u0010\u0097\u0002\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u0096\u0002\u001a\u00020\u0007J\u0018\u0010\u0098\u0002\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u0096\u0002\u001a\u00020\u0007J\u0011\u0010\u009b\u0002\u001a\u00020\u00042\b\u0010\u009a\u0002\u001a\u00030\u0099\u0002J\n\u0010\u009c\u0002\u001a\u0005\u0018\u00010\u0099\u0002J\u000e\u0010\u009e\u0002\u001a\t\u0012\u0004\u0012\u00020\u00070\u009d\u0002J\u0017\u0010 \u0002\u001a\u00020\u00042\u000e\u0010\u009f\u0002\u001a\t\u0012\u0004\u0012\u00020\u00070¹\u0001J\u0011\u0010¢\u0002\u001a\u00020\u00042\b\u0010¡\u0002\u001a\u00030À\u0001J\n\u0010£\u0002\u001a\u0005\u0018\u00010À\u0001J\u0011\u0010¤\u0002\u001a\u00020\u00042\b\u0010¡\u0002\u001a\u00030À\u0001J\u0011\u0010¥\u0002\u001a\u00020\u00042\b\u0010¡\u0002\u001a\u00030À\u0001J\n\u0010¦\u0002\u001a\u0005\u0018\u00010À\u0001J\n\u0010§\u0002\u001a\u0005\u0018\u00010À\u0001J\b\u0010¨\u0002\u001a\u00030À\u0001J\u0011\u0010©\u0002\u001a\u00020\u00042\b\u0010¡\u0002\u001a\u00030À\u0001J\u0007\u0010ª\u0002\u001a\u00020\u000fJ\u0007\u0010«\u0002\u001a\u00020\u0004J\u0007\u0010¬\u0002\u001a\u00020\u0004J\u0007\u0010\u00ad\u0002\u001a\u00020\u0014J\u0007\u0010®\u0002\u001a\u00020\u0004J\u0007\u0010¯\u0002\u001a\u00020\u0014J\u0007\u0010°\u0002\u001a\u00020\u0004J\u000f\u0010±\u0002\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0007J\t\u0010²\u0002\u001a\u0004\u0018\u00010\u0007J\u0007\u0010³\u0002\u001a\u00020\u0004J\u0010\u0010µ\u0002\u001a\u00020\u00042\u0007\u0010´\u0002\u001a\u00020\u0014J\u0012\u0010¶\u0002\u001a\u0004\u0018\u00010\u0014¢\u0006\u0006\b¶\u0002\u0010\u008c\u0002J\u0007\u0010·\u0002\u001a\u00020\u0004J\u0007\u0010¸\u0002\u001a\u00020PJ\u0007\u0010¹\u0002\u001a\u00020\u0004J\u0019\u0010¼\u0002\u001a\u00020\u00142\u0007\u0010º\u0002\u001a\u00020\u00072\u0007\u0010»\u0002\u001a\u00020\u000fJ\u0010\u0010¾\u0002\u001a\u00020\u00042\u0007\u0010½\u0002\u001a\u00020\u0007J\t\u0010¿\u0002\u001a\u0004\u0018\u00010\u0007J\u0007\u0010À\u0002\u001a\u00020\u0014J\u0010\u0010Á\u0002\u001a\u00020\u00042\u0007\u0010×\u0001\u001a\u00020\u0014J\t\u0010Â\u0002\u001a\u00020\u0004H\u0007R\u0017\u0010Å\u0002\u001a\u00030Ã\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bL\u0010Ä\u0002R\u0016\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0002\u0010Æ\u0002R'\u0010Ë\u0002\u001a\t\u0012\u0004\u0012\u00020\u00070Ç\u00028FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0002\u0010È\u0002\u001a\u0006\bÉ\u0002\u0010Ê\u0002R+\u0010Ð\u0002\u001a\r Í\u0002*\u0005\u0018\u00010Ì\u00020Ì\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0002\u0010È\u0002\u001a\u0006\bÎ\u0002\u0010Ï\u0002R+\u0010Ò\u0002\u001a\r Í\u0002*\u0005\u0018\u00010Ì\u00020Ì\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bþ\u0001\u0010È\u0002\u001a\u0006\bÑ\u0002\u0010Ï\u0002R\u001f\u0010W\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÛ\u0001\u0010È\u0002\u001a\u0006\bÓ\u0002\u0010Ô\u0002R\u001a\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010Õ\u0002R!\u0010Ø\u0002\u001a\r Í\u0002*\u0005\u0018\u00010Ö\u00020Ö\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010×\u0002R\u001d\u0010Û\u0002\u001a\t\u0012\u0004\u0012\u00020\u00070Ù\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010Ú\u0002¨\u0006ß\u0002²\u0006\u0019\u0010Þ\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b8\nX\u008a\u0084\u0002"}, m28432d2 = {"Lgl;", "", "Lco/bird/android/model/constant/MapMode;", "mode", "", "b3", "", "", "Lgl$c;", "Lco/bird/android/model/itemlease/ItemLease;", "itemLease", "", "Lco/bird/android/model/wire/WireBird;", "fallbackBirdsById", "Y2", "", "w0", "LYj2;", "type", "M", "", "y", "n1", "k1", "l1", "m1", "Lco/bird/android/model/wire/WireReleaseAssignmentMapBanner;", "info", "D2", "p", "q0", "J2", "X2", "a0", "email", "l2", "Lco/bird/android/model/wire/configs/Config;", "config", AbstractC3831J1.f16564d, "I", "()Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "tweaks", "K2", "Lco/bird/android/model/constant/DeserializerKind;", "kind", "z0", "q", "Ljava/util/Locale;", "locale", "b2", "V", "Lco/bird/android/model/identification/IdentificationDocumentType;", "docType", "a2", "U", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "debugResponse", "Z1", "T", "Lco/bird/android/model/wire/WireLocation;", "location", "c2", "i", "W", "Y1", "S", "optionId", "enableAutoReload", "X1", "Lkotlin/Pair;", "R", "h", "f0", "V0", "userRidePassId", C17296a.f69688o, "F0", "shown", "H1", "", "timeStamp", "I2", "x0", "c1", "U2", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LfN1;", "host", "A0", "url", "o2", "e0", "enabled", "n2", "d0", "port", "m2", "(LfN1;Ljava/lang/Integer;)V", "c0", "id", "f2", "Y", "j", "Lco/bird/android/model/Contractor;", "K", "Lco/bird/android/model/User;", "user", "L2", "B0", "P", "Q1", "Q", "count", "R1", "token", "F1", "D", "Lco/bird/android/model/TokenPairState;", "tokenPair", "N2", "D0", "Luf1;", "environment", "N1", "O", "z", "t0", AbstractC26684u0.f100690q, RequestHeadersFactory.MODEL, "W0", "P2", "a1", "T2", "b1", "W2", "Y0", "S2", "B2", "p0", "Lco/bird/android/model/constant/Permission;", "permission", "s2", "Z0", "U0", "i1", "name", "T0", "v0", "v", "S0", "u", "R0", "G0", "r", "K0", "R2", "Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;", "H", "I0", "Q2", "rideCount", "o1", "E", "()Ljava/lang/Integer;", "message", "j1", "H0", "Lco/bird/android/model/VehiclePricingDetails;", "b0", "vehiclePricingDetails", "O2", "Lco/bird/android/model/wire/WireRidePrice;", "ridePrice", "k2", "h2", "Lco/bird/android/model/ReservationPrice;", "reservationPrice", "g2", "h1", "g1", "f1", "wireBird", "u1", "", "itemLeases", "fallbackBirds", "Z2", "B", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "Lorg/joda/time/DateTime;", "expireTime", "j2", "Lgl$b;", "Z", "k", "S1", "J0", "lockKind", "T1", "M0", "U1", "N0", "serialNumber", "isFactoryKeys", "V1", "rideId", "d2", "e1", "X", "partnerName", "e2", "V2", "show", "H2", "Lco/bird/android/model/BountyBirdsFilter;", "G", "f", "Lco/bird/android/model/filter/NestTypeFilter;", "j0", "o", "Lco/bird/android/model/UserRoleItem;", "userRoleItem", "F2", "s0", "o0", "E2", "r0", "z1", PaymentMethodOptionsParams.Blik.PARAM_CODE, "w2", "k0", "bountyId", "p2", "g0", "x1", "F", "l", "t2", "q1", "v2", "t1", "min", "max", "q2", "h0", "frequencyInMillis", "r2", "i0", "Lco/bird/android/model/Deal;", "deal", "B1", "e", "A", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "purpose", "M1", "N", "featureName", "u2", "r1", "O1", "X0", "ready", "P1", "E0", "()Ljava/lang/Boolean;", "experimentName", "G2", "L0", "M2", "c3", "C1", "announcementId", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "O0", "key", "L", "P0", "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "i2", "w", "", "A1", "couponIds", "G1", "date", "W1", "d1", "E1", "D1", "c", "b", "t", "I1", "s", "Q0", "g", "x", "L1", "w1", "z2", "A2", "n0", "n", "selected", "x2", "m0", "m", "v1", "y2", "linkCode", "shownCount", "p1", "tab", "K1", "s1", "y1", "C2", DateTokenConverter.CONVERTER_KEY, "Lwi2;", "Lwi2;", "deserializer", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "Lio/reactivex/Observable;", "Lkotlin/Lazy;", "C0", "()Lio/reactivex/Observable;", "userRoleChanges", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "y0", "()Landroid/content/SharedPreferences;", "sp", "l0", "persistentSp", "J", "()Landroid/content/Context;", "Lco/bird/android/model/wire/configs/Config;", "Lorg/joda/time/format/DateTimeFormatter;", "Lorg/joda/time/format/DateTimeFormatter;", "formatter", "La94;", "La94;", "userRoleChangedRelay", "<init>", "(Landroid/content/Context;Lwi2;Lco/bird/android/config/tweaks/dsl/Tweaks;)V", "birdsMap", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAppPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppPreference.kt\nco/bird/android/config/preference/AppPreference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1851:1\n1#2:1852\n1855#3,2:1853\n515#4:1855\n500#4,6:1856\n*S KotlinDebug\n*F\n+ 1 AppPreference.kt\nco/bird/android/config/preference/AppPreference\n*L\n1123#1:1853,2\n1161#1:1855\n1161#1:1856,6\n*E\n"})
/* renamed from: gl */
/* loaded from: classes2.dex */
public final class C22454gl {

    /* renamed from: j */
    public static final C22455a f84179j = new C22455a(null);

    /* renamed from: k */
    public static final EnumC49958uf1 f84180k = EnumC49958uf1.f112719l;

    /* renamed from: a */
    public final C51174wi2 f84181a;

    /* renamed from: b */
    public final Tweaks f84182b;

    /* renamed from: c */
    public final Lazy f84183c;

    /* renamed from: d */
    public final Lazy f84184d;

    /* renamed from: e */
    public final Lazy f84185e;

    /* renamed from: f */
    public final Lazy f84186f;

    /* renamed from: g */
    public Config f84187g;

    /* renamed from: h */
    public final DateTimeFormatter f84188h;

    /* renamed from: i */
    public final C37791a94<String> f84189i;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lgl$a;", "", "<init>", "()V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gl$a */
    /* loaded from: classes2.dex */
    public static final class C22455a {
        public /* synthetic */ C22455a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C22455a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lgl$b;", "", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "Lorg/joda/time/DateTime;", "expireTime", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WirePhysicalLock;", "c", "()Lco/bird/android/model/wire/WirePhysicalLock;", "Lorg/joda/time/DateTime;", "b", "()Lorg/joda/time/DateTime;", "<init>", "(Lco/bird/android/model/wire/WirePhysicalLock;Lorg/joda/time/DateTime;)V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gl$b */
    /* loaded from: classes2.dex */
    public static final class C22456b {
        @JsonProperty("expire_time")
        @InterfaceC41208ft5("expire_time")
        private final DateTime expireTime;
        @JsonProperty("physical_lock")
        @InterfaceC41208ft5("physical_lock")
        private final WirePhysicalLock physicalLock;

        public C22456b(WirePhysicalLock physicalLock, DateTime expireTime) {
            Intrinsics.checkNotNullParameter(physicalLock, "physicalLock");
            Intrinsics.checkNotNullParameter(expireTime, "expireTime");
            this.physicalLock = physicalLock;
            this.expireTime = expireTime;
        }

        public static /* synthetic */ C22456b copy$default(C22456b c22456b, WirePhysicalLock wirePhysicalLock, DateTime dateTime, int i, Object obj) {
            if ((i & 1) != 0) {
                wirePhysicalLock = c22456b.physicalLock;
            }
            if ((i & 2) != 0) {
                dateTime = c22456b.expireTime;
            }
            return c22456b.m37544a(wirePhysicalLock, dateTime);
        }

        /* renamed from: a */
        public final C22456b m37544a(WirePhysicalLock physicalLock, DateTime expireTime) {
            Intrinsics.checkNotNullParameter(physicalLock, "physicalLock");
            Intrinsics.checkNotNullParameter(expireTime, "expireTime");
            return new C22456b(physicalLock, expireTime);
        }

        /* renamed from: b */
        public final DateTime m37543b() {
            return this.expireTime;
        }

        /* renamed from: c */
        public final WirePhysicalLock m37542c() {
            return this.physicalLock;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C22456b) {
                C22456b c22456b = (C22456b) obj;
                return Intrinsics.areEqual(this.physicalLock, c22456b.physicalLock) && Intrinsics.areEqual(this.expireTime, c22456b.expireTime);
            }
            return false;
        }

        public int hashCode() {
            return (this.physicalLock.hashCode() * 31) + this.expireTime.hashCode();
        }

        public String toString() {
            WirePhysicalLock wirePhysicalLock = this.physicalLock;
            DateTime dateTime = this.expireTime;
            return "LastRidePhysicalLock(physicalLock=" + wirePhysicalLock + ", expireTime=" + dateTime + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lgl$c;", "", "Lco/bird/android/model/wire/WireBird;", "wireBird", "Lco/bird/android/model/itemlease/ItemLease;", "itemLease", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireBird;", "c", "()Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/itemlease/ItemLease;", "b", "()Lco/bird/android/model/itemlease/ItemLease;", "<init>", "(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/ItemLease;)V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gl$c */
    /* loaded from: classes2.dex */
    public static final class C22457c {
        @JsonProperty("item_lease")
        @InterfaceC41208ft5("item_lease")
        private final ItemLease itemLease;
        @JsonProperty("wire_bird")
        @InterfaceC41208ft5("wire_bird")
        private final WireBird wireBird;

        public C22457c(WireBird wireBird, ItemLease itemLease) {
            Intrinsics.checkNotNullParameter(itemLease, "itemLease");
            this.wireBird = wireBird;
            this.itemLease = itemLease;
        }

        public static /* synthetic */ C22457c copy$default(C22457c c22457c, WireBird wireBird, ItemLease itemLease, int i, Object obj) {
            if ((i & 1) != 0) {
                wireBird = c22457c.wireBird;
            }
            if ((i & 2) != 0) {
                itemLease = c22457c.itemLease;
            }
            return c22457c.m37541a(wireBird, itemLease);
        }

        /* renamed from: a */
        public final C22457c m37541a(WireBird wireBird, ItemLease itemLease) {
            Intrinsics.checkNotNullParameter(itemLease, "itemLease");
            return new C22457c(wireBird, itemLease);
        }

        /* renamed from: b */
        public final ItemLease m37540b() {
            return this.itemLease;
        }

        /* renamed from: c */
        public final WireBird m37539c() {
            return this.wireBird;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C22457c) {
                C22457c c22457c = (C22457c) obj;
                return Intrinsics.areEqual(this.wireBird, c22457c.wireBird) && Intrinsics.areEqual(this.itemLease, c22457c.itemLease);
            }
            return false;
        }

        public int hashCode() {
            WireBird wireBird = this.wireBird;
            return ((wireBird == null ? 0 : wireBird.hashCode()) * 31) + this.itemLease.hashCode();
        }

        public String toString() {
            WireBird wireBird = this.wireBird;
            ItemLease itemLease = this.itemLease;
            return "PersistedLeaseDetail(wireBird=" + wireBird + ", itemLease=" + itemLease + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0006\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lgl$d;", "", "", "", "Lgl$c;", "items", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gl$d */
    /* loaded from: classes2.dex */
    public static final class C22458d {
        @JsonProperty("items")
        @InterfaceC41208ft5("items")
        private final Map<String, C22457c> items;

        public C22458d(Map<String, C22457c> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C22458d copy$default(C22458d c22458d, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = c22458d.items;
            }
            return c22458d.m37538a(map);
        }

        /* renamed from: a */
        public final C22458d m37538a(Map<String, C22457c> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new C22458d(items);
        }

        /* renamed from: b */
        public final Map<String, C22457c> m37537b() {
            return this.items;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C22458d) && Intrinsics.areEqual(this.items, ((C22458d) obj).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            Map<String, C22457c> map = this.items;
            return "PersistedLeaseDetails(items=" + map + ")";
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gl$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22459e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapMode.values().length];
            try {
                iArr[MapMode.OPERATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapMode.SERVICE_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MapMode.MERCHANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/content/Context;", "kotlin.jvm.PlatformType", "b", "()Landroid/content/Context;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gl$f */
    /* loaded from: classes2.dex */
    public static final class C22460f extends Lambda implements Function0<Context> {

        /* renamed from: g */
        public final /* synthetic */ Context f84190g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22460f(Context context) {
            super(0);
            this.f84190g = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Context invoke() {
            return this.f84190g.getApplicationContext();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"gl$g", "LFb6;", "", "", "", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gl$g */
    /* loaded from: classes2.dex */
    public static final class C22461g extends C32798Fb6<Map<String, Integer>> {
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"gl$h", "LFb6;", "", "", "", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gl$h */
    /* loaded from: classes2.dex */
    public static final class C22462h extends C32798Fb6<Map<String, Integer>> {
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gl$i */
    /* loaded from: classes2.dex */
    public static final class C22463i extends Lambda implements Function0<SharedPreferences> {

        /* renamed from: g */
        public final /* synthetic */ Context f84191g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22463i(Context context) {
            super(0);
            this.f84191g = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            Context context = this.f84191g;
            String packageName = context.getPackageName();
            return context.getSharedPreferences(packageName + "_spp", 0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"gl$j", "LFb6;", "", "", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gl$j */
    /* loaded from: classes2.dex */
    public static final class C22464j extends C32798Fb6<Set<? extends String>> {
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gl$k */
    /* loaded from: classes2.dex */
    public static final class C22465k extends Lambda implements Function0<SharedPreferences> {

        /* renamed from: g */
        public final /* synthetic */ Context f84192g;

        /* renamed from: h */
        public final /* synthetic */ C22454gl f84193h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22465k(Context context, C22454gl c22454gl) {
            super(0);
            this.f84192g = context;
            this.f84193h = c22454gl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            Context context = this.f84192g;
            String packageName = context.getPackageName();
            String lowerCase = this.f84193h.m37699O().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return context.getSharedPreferences(packageName + "_sp_" + lowerCase, 0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "", "Lco/bird/android/model/wire/WireBird;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAppPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppPreference.kt\nco/bird/android/config/preference/AppPreference$updateLeaseDetailsIfPresent$birdsMap$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1851:1\n1194#2,2:1852\n1222#2,4:1854\n*S KotlinDebug\n*F\n+ 1 AppPreference.kt\nco/bird/android/config/preference/AppPreference$updateLeaseDetailsIfPresent$birdsMap$2\n*L\n1122#1:1852,2\n1122#1:1854,4\n*E\n"})
    /* renamed from: gl$l */
    /* loaded from: classes2.dex */
    public static final class C22466l extends Lambda implements Function0<Map<String, ? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ List<WireBird> f84194g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22466l(List<WireBird> list) {
            super(0);
            this.f84194g = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends WireBird> invoke() {
            int collectionSizeOrDefault;
            int mapCapacity;
            int coerceAtLeast;
            List<WireBird> list = this.f84194g;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
            for (Object obj : list) {
                linkedHashMap.put(((WireBird) obj).getId(), obj);
            }
            return linkedHashMap;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gl$m */
    /* loaded from: classes2.dex */
    public static final class C22467m extends Lambda implements Function0<Observable<String>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22467m() {
            super(0);
            C22454gl.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return C22454gl.this.f84189i.hide();
        }
    }

    public C22454gl(Context context, C51174wi2 deserializer, Tweaks tweaks) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        String name;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        this.f84181a = deserializer;
        this.f84182b = tweaks;
        lazy = LazyKt__LazyJVMKt.lazy(new C22467m());
        this.f84183c = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C22465k(context, this));
        this.f84184d = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C22463i(context));
        this.f84185e = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C22460f(context));
        this.f84186f = lazy4;
        this.f84188h = ISODateTimeFormat.dateTime();
        m37606k1();
        m37594n1();
        m37602l1();
        m37598m1();
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        MapMode m37571t0 = m37571t0();
        if (C22459e.$EnumSwitchMapping$0[m37571t0.ordinal()] == 1) {
            name = m37575s0().getUserRoleCode();
        } else {
            name = m37571t0.name();
        }
        this.f84189i = C37791a94.C10586a.createNonRedundant$default(c10586a, name, null, 2, null);
    }

    /* renamed from: a3 */
    public static final Map<String, WireBird> m37647a3(Lazy<? extends Map<String, WireBird>> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ Tweaks getTweaks$default(C22454gl c22454gl, DeserializerKind deserializerKind, int i, Object obj) {
        if ((i & 1) != 0) {
            deserializerKind = null;
        }
        return c22454gl.m37547z0(deserializerKind);
    }

    /* renamed from: A */
    public final Deal m37755A() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.DEAL);
        if (m43437j != null) {
            return (Deal) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(Deal.class));
        }
        return null;
    }

    /* renamed from: A0 */
    public final String m37754A0(Context context, EnumC40897fN1 host) {
        Integer num;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(host, "host");
        EnumC49958uf1 m37699O = m37699O();
        if (m37699O == EnumC49958uf1.f112720m) {
            String m37631e0 = m37631e0();
            if (m37631e0 != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(m37631e0, Arrays.copyOf(new Object[]{Integer.valueOf(host.m41478c())}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                if (format != null) {
                    return format;
                }
            }
            int m41478c = host.m41478c();
            return "http://localhost:" + m41478c + "/";
        } else if (host == EnumC40897fN1.POWERLINE) {
            String string = context.getString(C47057pl4.powerline, host.m41479b());
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(C.string.powerline, host.host)");
            return string;
        } else {
            if (m37635d0(host)) {
                num = Integer.valueOf(m37640c0(host));
            } else {
                num = null;
            }
            if (num != null) {
                String m37631e02 = m37631e0();
                if (m37631e02 != null) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format(m37631e02, Arrays.copyOf(new Object[]{num}, 1));
                    Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
                    if (format2 != null) {
                        return format2;
                    }
                }
                return "http://localhost:" + num + "/";
            }
            String string2 = context.getString(m37699O.m9902f(), host.m41479b());
            Intrinsics.checkNotNullExpressionValue(string2, "{\n          context.getS…mat, host.host)\n        }");
            return string2;
        }
    }

    /* renamed from: A1 */
    public final Set<String> m37753A1() {
        Set<String> emptySet;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.BAD_BATTERY_COUPONS_SEEN);
        if (m43437j != null) {
            C51174wi2 c51174wi2 = this.f84181a;
            Type type = new C22464j().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<Set<String>>() {}.type");
            Set<String> set = (Set) c51174wi2.m6460b(m43437j, type);
            if (set != null) {
                return set;
            }
        }
        emptySet = SetsKt__SetsKt.emptySet();
        return emptySet;
    }

    /* renamed from: A2 */
    public final void m37752A2(String optionId) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        C41318g46.m40163a("preload setPreloadV2SelectedOption saved " + optionId, new Object[0]);
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.PRELOAD_V2_OPTION_SELECTED_ID, optionId);
    }

    /* renamed from: B */
    public final Map<String, C22457c> m37751B() {
        Map<String, C22457c> emptyMap;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.LEASE_DETAILS);
        LinkedHashMap linkedHashMap = null;
        if (m43437j != null) {
            try {
                Map<String, C22457c> m37537b = ((C22458d) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(C22458d.class))).m37537b();
                if (m37537b != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<String, C22457c> entry : m37537b.entrySet()) {
                        if (entry.getValue().m37540b().isActive()) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap = linkedHashMap2;
                }
            } catch (Exception e) {
                C41318g46.m40161c(e, "Exception while parsing active lease details from json String " + m43437j + " : ", new Object[0]);
            }
        }
        if (linkedHashMap == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
        return linkedHashMap;
    }

    /* renamed from: B0 */
    public final User m37750B0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.USER);
        if (m43437j != null) {
            return (User) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(User.class));
        }
        return null;
    }

    /* renamed from: B1 */
    public final void m37749B1(Deal deal) {
        Intrinsics.checkNotNullParameter(deal, "deal");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.DEAL, this.f84181a.m6453i(deal));
    }

    /* renamed from: B2 */
    public final void m37748B2(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43445b(sp, EnumC37312Yj2.PUSH_TOKEN, token);
    }

    /* renamed from: C */
    public final int m37747C(String announcementId) {
        Intrinsics.checkNotNullParameter(announcementId, "announcementId");
        Integer num = m37559w0().get(announcementId);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: C0 */
    public final Observable<String> m37746C0() {
        Object value = this.f84183c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-userRoleChanges>(...)");
        return (Observable) value;
    }

    /* renamed from: C1 */
    public final void m37745C1(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43445b(sp, EnumC37312Yj2.APP_CHECK_TOKEN, token);
    }

    /* renamed from: C2 */
    public final void m37744C2(boolean z) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.QUICK_CAPTURE_READY_DO_NOT_SHOW, z);
    }

    /* renamed from: D */
    public final String m37743D() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43437j(sp, EnumC37312Yj2.AUTH_TOKEN);
    }

    /* renamed from: D0 */
    public final TokenPairState m37742D0() {
        TokenPairState tokenPairState;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.V2_TOKEN_PAIR_STATE);
        if (m43437j == null || (tokenPairState = (TokenPairState) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(TokenPairState.class))) == null) {
            SharedPreferences sp2 = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp2, "sp");
            EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.V2_ACCESS_TOKEN_STATE;
            String m43437j2 = C40082dz5.m43437j(sp2, enumC37312Yj2);
            if (m43437j2 != null) {
                SharedPreferences sp3 = m37551y0();
                Intrinsics.checkNotNullExpressionValue(sp3, "sp");
                C40082dz5.m43434m(sp3, enumC37312Yj2);
                TokenPairState tokenPairState2 = new TokenPairState((TokenPair) this.f84181a.m6459c(m43437j2, Reflection.getOrCreateKotlinClass(TokenPair.class)), false);
                m37700N2(tokenPairState2);
                return tokenPairState2;
            }
            return null;
        }
        return tokenPairState;
    }

    /* renamed from: D1 */
    public final void m37741D1(DateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.APP_LAST_BACKGROUNDED, this.f84188h.print(date));
    }

    /* renamed from: D2 */
    public final void m37740D2(WireReleaseAssignmentMapBanner info) {
        Intrinsics.checkNotNullParameter(info, "info");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43445b(sp, EnumC37312Yj2.REBALANCE_MAP_BANNER_INFO, this.f84181a.m6453i(info));
    }

    /* renamed from: E */
    public final Integer m37739E() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        Integer valueOf = Integer.valueOf(C40082dz5.m43440g(sp, EnumC37312Yj2.AUTO_PAY_V2_LAST_NAG_RIDE_COUNT, -1));
        if (valueOf.intValue() != -1) {
            return valueOf;
        }
        return null;
    }

    /* renamed from: E0 */
    public final Boolean m37738E0() {
        if (m37551y0().contains("GOOGLE_PAY_READY")) {
            SharedPreferences sp = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp, "sp");
            return Boolean.valueOf(C40082dz5.m43442e(sp, EnumC37312Yj2.GOOGLE_PAY_READY, false));
        }
        return null;
    }

    /* renamed from: E1 */
    public final void m37737E1(DateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.APP_LAST_FOREGROUNDED, this.f84188h.print(date));
    }

    /* renamed from: E2 */
    public final void m37736E2(UserRoleItem userRoleItem) {
        Intrinsics.checkNotNullParameter(userRoleItem, "userRoleItem");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.RECENT_OPERATOR_USER_ROLE_ITEM, this.f84181a.m6453i(userRoleItem));
    }

    /* renamed from: F */
    public final boolean m37735F() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.PROMPT_BOUNTY_DESIGNATION_REACCEPT;
        boolean m43443d = C40082dz5.m43443d(sp, enumC37312Yj2);
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        C40082dz5.m43434m(sp2, enumC37312Yj2);
        return m43443d;
    }

    /* renamed from: F0 */
    public final boolean m37734F0(String userRidePassId) {
        Intrinsics.checkNotNullParameter(userRidePassId, "userRidePassId");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        Set<String> m43435l = C40082dz5.m43435l(sp, EnumC37312Yj2.ACKED_INELIGIBLE_USER_RIDE_PASS_IDS);
        if (m43435l == null) {
            m43435l = SetsKt__SetsKt.emptySet();
        }
        return m43435l.contains(userRidePassId);
    }

    /* renamed from: F1 */
    public final void m37733F1(String str) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43445b(sp, EnumC37312Yj2.AUTH_TOKEN, str);
    }

    /* renamed from: F2 */
    public final void m37732F2(UserRoleItem userRoleItem) {
        Intrinsics.checkNotNullParameter(userRoleItem, "userRoleItem");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.RECENT_USER_ROLE_ITEM;
        String m43437j = C40082dz5.m43437j(sp, enumC37312Yj2);
        if (m43437j != null && !Intrinsics.areEqual(((UserRoleItem) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(UserRoleItem.class))).getUserRoleCode(), userRoleItem.getUserRoleCode())) {
            SharedPreferences sp2 = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp2, "sp");
            EnumC37312Yj2 enumC37312Yj22 = EnumC37312Yj2.PREVIOUS_USER_ROLE_ITEM;
            SharedPreferences sp3 = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp3, "sp");
            C40082dz5.m43431p(sp2, enumC37312Yj22, C40082dz5.m43437j(sp3, enumC37312Yj2));
        }
        this.f84189i.accept(userRoleItem.getUserRoleCode());
        SharedPreferences sp4 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp4, "sp");
        C40082dz5.m43431p(sp4, enumC37312Yj2, this.f84181a.m6453i(userRoleItem));
    }

    /* renamed from: G */
    public final BountyBirdsFilter m37731G() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.BOUNTY_FILTER);
        if (m43437j != null) {
            return (BountyBirdsFilter) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(BountyBirdsFilter.class));
        }
        return null;
    }

    /* renamed from: G0 */
    public final boolean m37730G0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43443d(sp, EnumC37312Yj2.HAS_CLICKED_LONG_TERM_RENTAL_SETUP_BANNER);
    }

    /* renamed from: G1 */
    public final void m37729G1(List<String> couponIds) {
        Set set;
        Intrinsics.checkNotNullParameter(couponIds, "couponIds");
        set = CollectionsKt___CollectionsKt.toSet(couponIds);
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.BAD_BATTERY_COUPONS_SEEN, this.f84181a.m6453i(set));
    }

    /* renamed from: G2 */
    public final void m37728G2(String experimentName) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.SEEN_ON_DEMAND_EXPERIMENTS;
        Set m43435l = C40082dz5.m43435l(sp, enumC37312Yj2);
        if (m43435l == null) {
            m43435l = new LinkedHashSet();
        }
        m43435l.add(experimentName);
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        C40082dz5.m43430q(sp2, enumC37312Yj2, m43435l);
    }

    /* renamed from: H */
    public final ContractorSpecialProgramsResponse m37727H() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.CONTRACTOR_SPECIAL_PROGRAM_STATUS);
        if (m43437j != null) {
            return (ContractorSpecialProgramsResponse) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(ContractorSpecialProgramsResponse.class));
        }
        return new ContractorSpecialProgramsResponse(null, 1, null);
    }

    /* renamed from: H0 */
    public final boolean m37726H0(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        Set m43435l = C40082dz5.m43435l(sp, EnumC37312Yj2.SEEN_DESTINATION_TOOLTIP);
        if (m43435l == null) {
            m43435l = new LinkedHashSet();
        }
        return m43435l.contains(message);
    }

    /* renamed from: H1 */
    public final void m37725H1(boolean z) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.SHOW_CHARGER_WELCOME, z);
    }

    /* renamed from: H2 */
    public final void m37724H2(boolean z) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.SHOW_REQUIRE_END_RIDE_PHOTO_RIDER_BAR, z);
    }

    /* renamed from: I */
    public final Config m37723I() {
        Config config;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.CONFIG);
        return (m43437j == null || (config = (Config) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(Config.class))) == null) ? new Config(null, null, null, null, null, null, null, false, 0.0d, false, false, null, null, null, null, null, null, null, null, false, 0, 0.0d, 0.0d, null, null, 0.0d, 0.0d, null, null, null, null, null, false, null, false, 0.0d, 0.0d, false, false, false, false, 0, false, null, null, false, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, false, null, null, null, null, false, false, false, false, null, 0, null, false, null, false, false, false, null, false, false, false, false, null, null, null, false, null, null, null, null, 0, false, false, 0.0f, false, false, 0L, null, false, null, null, null, null, false, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, 0L, 0.0d, null, null, null, null, null, null, 0.0f, false, false, null, null, null, null, null, null, false, null, -1, -1, -1, -1, Integer.MAX_VALUE, null) : config;
    }

    /* renamed from: I0 */
    public final boolean m37722I0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43443d(sp, EnumC37312Yj2.SHOW_FRAUD_REPORT_INTRO);
    }

    /* renamed from: I1 */
    public final void m37721I1(DateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.CLOSE_PARKING_NEST_TIME_INTERVAL_START, this.f84188h.print(date));
    }

    /* renamed from: I2 */
    public final void m37720I2(long j) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43432o(sp, EnumC37312Yj2.AUTO_PAY_SHOWN_LAST, j);
    }

    /* renamed from: J */
    public final Context m37719J() {
        Object value = this.f84186f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-context>(...)");
        return (Context) value;
    }

    /* renamed from: J0 */
    public final boolean m37718J0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43443d(sp, EnumC37312Yj2.HAS_SEEN_HELMET_BUTTON_TOOLTIP);
    }

    /* renamed from: J1 */
    public final Config m37717J1(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f84187g = config;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.CONFIG, this.f84181a.m6453i(config));
        return config;
    }

    /* renamed from: J2 */
    public final void m37716J2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43444c(sp, EnumC37312Yj2.TASK_ORDER_POST_CONFIRMATION, true);
    }

    /* renamed from: K */
    public final Contractor m37715K() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.CONTRACTOR);
        if (m43437j != null) {
            return (Contractor) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(Contractor.class));
        }
        return null;
    }

    /* renamed from: K0 */
    public final boolean m37714K0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43443d(sp, EnumC37312Yj2.HAS_SEEN_LONG_TERM_RENTAL_SETUP);
    }

    /* renamed from: K1 */
    public final void m37713K1(String tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.OPERATOR_TAB, tab);
    }

    /* renamed from: K2 */
    public final void m37712K2(Tweaks tweaks) {
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43445b(sp, EnumC37312Yj2.TWEAKS, this.f84181a.m6453i(tweaks));
    }

    /* renamed from: L */
    public final int m37711L(EnumC37312Yj2 type, String key) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Integer num = m37707M(type).get(key);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: L0 */
    public final boolean m37710L0(String experimentName) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        Set<String> m43435l = C40082dz5.m43435l(sp, EnumC37312Yj2.SEEN_ON_DEMAND_EXPERIMENTS);
        if (m43435l == null) {
            m43435l = SetsKt__SetsKt.emptySet();
        }
        return m43435l.contains(experimentName);
    }

    /* renamed from: L1 */
    public final void m37709L1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.DATABASES_CLEARED, true);
    }

    /* renamed from: L2 */
    public final User m37708L2(User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43445b(sp, EnumC37312Yj2.USER, this.f84181a.m6453i(UserKt.maybeMergeWith(m37750B0(), user)));
        return user;
    }

    /* renamed from: M */
    public final Map<String, Integer> m37707M(EnumC37312Yj2 enumC37312Yj2) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, enumC37312Yj2);
        if (m43437j != null) {
            C51174wi2 c51174wi2 = this.f84181a;
            Type type = new C22461g().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<Mutab…p<String, Int>>() {}.type");
            Map<String, Integer> map = (Map) c51174wi2.m6460b(m43437j, type);
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    /* renamed from: M0 */
    public final boolean m37706M0(String lockKind) {
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        return m37551y0().getBoolean(EnumC47876r81.HAS_SEEN_PHYSICAL_LOCK_TUTORIAL.m16446b(lockKind), false);
    }

    /* renamed from: M1 */
    public final void m37705M1(PhysicalLockPurpose purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.DEFAULT_PHYSICAL_LOCK_PURPOSE, this.f84181a.m6453i(purpose));
    }

    /* renamed from: M2 */
    public final void m37704M2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.TAX_INFORMATION_SKIPPED, true);
    }

    /* renamed from: N */
    public final PhysicalLockPurpose m37703N() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.DEFAULT_PHYSICAL_LOCK_PURPOSE);
        if (m43437j != null) {
            return (PhysicalLockPurpose) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(PhysicalLockPurpose.class));
        }
        return null;
    }

    /* renamed from: N0 */
    public final boolean m37702N0(String lockKind) {
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        return m37551y0().getBoolean(EnumC47876r81.HAS_SEEN_PRIVATE_BIRD_PHYSICAL_LOCK_TUTORIAL.m16446b(lockKind), false);
    }

    /* renamed from: N1 */
    public final void m37701N1(EnumC49958uf1 environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        SharedPreferences persistentSp = m37603l0();
        Intrinsics.checkNotNullExpressionValue(persistentSp, "persistentSp");
        C40082dz5.m43445b(persistentSp, EnumC37312Yj2.ENVIRONMENT, this.f84181a.m6453i(environment));
    }

    /* renamed from: N2 */
    public final void m37700N2(TokenPairState tokenPairState) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43445b(sp, EnumC37312Yj2.V2_TOKEN_PAIR_STATE, tokenPairState != null ? this.f84181a.m6453i(tokenPairState) : null);
    }

    /* renamed from: O */
    public final EnumC49958uf1 m37699O() {
        EnumC49958uf1 enumC49958uf1;
        try {
            SharedPreferences persistentSp = m37603l0();
            Intrinsics.checkNotNullExpressionValue(persistentSp, "persistentSp");
            String m43437j = C40082dz5.m43437j(persistentSp, EnumC37312Yj2.ENVIRONMENT);
            if (m43437j == null || (enumC49958uf1 = (EnumC49958uf1) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(EnumC49958uf1.class))) == null) {
                return EnumC49958uf1.f112717j.m9899a();
            }
            return enumC49958uf1;
        } catch (Exception unused) {
            SharedPreferences persistentSp2 = m37603l0();
            Intrinsics.checkNotNullExpressionValue(persistentSp2, "persistentSp");
            return EnumC49958uf1.values()[EnumC49958uf1.f112717j.m9898b(C40082dz5.m43440g(persistentSp2, EnumC37312Yj2.ENVIRONMENT, m37552y(false)))];
        }
    }

    /* renamed from: O0 */
    public final int m37698O0(String announcementId) {
        int i;
        Intrinsics.checkNotNullParameter(announcementId, "announcementId");
        Map<String, Integer> m37559w0 = m37559w0();
        Integer num = m37559w0.get(announcementId);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int i2 = i + 1;
        m37559w0.put(announcementId, Integer.valueOf(i2));
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.SEEN_ANNOUNCEMENTS, this.f84181a.m6453i(m37559w0));
        return i2;
    }

    /* renamed from: O1 */
    public final void m37697O1() {
        SharedPreferences persistentSp = m37603l0();
        Intrinsics.checkNotNullExpressionValue(persistentSp, "persistentSp");
        C40082dz5.m43429r(persistentSp, EnumC37312Yj2.EXISTING_USER, true);
    }

    /* renamed from: O2 */
    public final void m37696O2(VehiclePricingDetails vehiclePricingDetails) {
        Intrinsics.checkNotNullParameter(vehiclePricingDetails, "vehiclePricingDetails");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.VEHICLE_PRICING_DETAILS, this.f84181a.m6453i(vehiclePricingDetails));
    }

    /* renamed from: P */
    public final long m37695P() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43438i(sp, EnumC37312Yj2.HARD_COUNT_LAP_ID, -1L);
    }

    /* renamed from: P0 */
    public final synchronized int m37694P0(EnumC37312Yj2 type, String key) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Integer> m37707M = m37707M(type);
        Integer num = m37707M.get(key);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        i2 = i + 1;
        m37707M.put(key, Integer.valueOf(i2));
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, type, this.f84181a.m6453i(m37707M));
        return i2;
    }

    /* renamed from: P1 */
    public final void m37693P1(boolean z) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.GOOGLE_PAY_READY, z);
    }

    /* renamed from: P2 */
    public final void m37692P2(String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        m37551y0().edit().putBoolean(EnumC47876r81.CONTEXTUAL_TUTORIAL.m16446b(model), true).apply();
    }

    /* renamed from: Q */
    public final int m37691Q() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43440g(sp, EnumC37312Yj2.HARD_COUNT_LAP_SCAN_COUNT, 0);
    }

    /* renamed from: Q0 */
    public final void m37690Q0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43433n(sp, EnumC37312Yj2.CLOSE_PARKING_NEST_COUNT, m37576s() + 1);
    }

    /* renamed from: Q1 */
    public final void m37689Q1(long j) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43432o(sp, EnumC37312Yj2.HARD_COUNT_LAP_ID, j);
    }

    /* renamed from: Q2 */
    public final void m37688Q2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.SHOW_FRAUD_REPORT_INTRO, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0032, code lost:
        if ((!r4) != false) goto L9;
     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<String, Boolean> m37687R() {
        List list;
        String str;
        Boolean bool;
        Object orNull;
        Object firstOrNull;
        boolean isBlank;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.LAST_CONFIGURE_PRELOAD_OPTIONS);
        if (m43437j != null) {
            list = StringsKt__StringsKt.split$default((CharSequence) m43437j, new char[]{CoreConstants.COMMA_CHAR}, false, 2, 2, (Object) null);
        } else {
            list = null;
        }
        if (list != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            str = (String) firstOrNull;
            if (str != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
            }
        }
        str = null;
        if (list != null) {
            orNull = CollectionsKt___CollectionsKt.getOrNull(list, 1);
            String str2 = (String) orNull;
            if (str2 != null) {
                bool = Boolean.valueOf(str2.equals("1"));
                if (str == null && bool != null) {
                    return TuplesKt.m28425to(str, bool);
                }
            }
        }
        bool = null;
        return str == null ? null : null;
    }

    /* renamed from: R0 */
    public final void m37686R0() {
        m37551y0().edit().putInt("CODE_ENTRY_COUNT", m37568u() + 1).apply();
    }

    /* renamed from: R1 */
    public final void m37685R1(int i) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43433n(sp, EnumC37312Yj2.HARD_COUNT_LAP_SCAN_COUNT, i);
    }

    /* renamed from: R2 */
    public final void m37684R2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.HAS_SEEN_LONG_TERM_RENTAL_SETUP, true);
    }

    /* renamed from: S */
    public final WireLocation m37683S() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.LAST_FAKE_LOCATION);
        if (m43437j != null) {
            return (WireLocation) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(WireLocation.class));
        }
        return new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 508, null);
    }

    /* renamed from: S0 */
    public final void m37682S0() {
        m37551y0().edit().putInt("CODE_ENTRY_HINT_VIEW_COUNT", m37564v() + 1).apply();
    }

    /* renamed from: S1 */
    public final void m37681S1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.HAS_SEEN_HELMET_BUTTON_TOOLTIP, true);
    }

    /* renamed from: S2 */
    public final void m37680S2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.SHOW_MOPED_PARKING_TUTORIAL, true);
    }

    /* renamed from: T */
    public final IdentificationDebugResponse m37679T() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.LAST_IDENTIFICATION_DEBUG_RESPONSE);
        if (m43437j == null) {
            return null;
        }
        try {
            return (IdentificationDebugResponse) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(IdentificationDebugResponse.class));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: T0 */
    public final int m37678T0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String m16446b = EnumC47876r81.RECURRENT_NTH_EVENT_COUNT_PREFIX.m16446b(name);
        int i = m37551y0().getInt(m16446b, 0) + 1;
        m37551y0().edit().putInt(m16446b, i).apply();
        return i;
    }

    /* renamed from: T1 */
    public final void m37677T1(String lockKind) {
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        m37551y0().edit().putBoolean(EnumC47876r81.HAS_SEEN_PHYSICAL_LOCK_TUTORIAL.m16446b(lockKind), true).apply();
    }

    /* renamed from: T2 */
    public final void m37676T2(String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        m37551y0().edit().putBoolean(EnumC47876r81.PRIVATE_BIRD_CONTEXTUAL_TUTORIAL.m16446b(model), true).apply();
    }

    /* renamed from: U */
    public final IdentificationDocumentType m37675U() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.LAST_IDENTIFICATION_DOCUMENT_TYPE);
        if (m43437j == null) {
            return null;
        }
        try {
            return (IdentificationDocumentType) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(IdentificationDocumentType.class));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: U0 */
    public final void m37674U0() {
        m37603l0().edit().putInt("RUN_COUNT", m37563v0() + 1).apply();
    }

    /* renamed from: U1 */
    public final void m37673U1(String lockKind) {
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        m37551y0().edit().putBoolean(EnumC47876r81.HAS_SEEN_PRIVATE_BIRD_PHYSICAL_LOCK_TUTORIAL.m16446b(lockKind), true).apply();
    }

    /* renamed from: U2 */
    public final void m37672U2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.SHOW_RATE_APP, true);
    }

    /* renamed from: V */
    public final Locale m37671V() {
        Locale locale;
        try {
            SharedPreferences sp = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp, "sp");
            String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.LAST_IDENTIFICATION_LOCALE);
            if (m43437j == null || (locale = Locale.forLanguageTag(m43437j)) == null) {
                locale = Locale.getDefault();
            }
            Intrinsics.checkNotNullExpressionValue(locale, "{\n      sp.getString(Key…Locale.getDefault()\n    }");
            return locale;
        } catch (Exception unused) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "{\n      Locale.getDefault()\n    }");
            return locale2;
        }
    }

    /* renamed from: V0 */
    public final boolean m37670V0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.SHOW_CHARGER_WELCOME, false);
    }

    /* renamed from: V1 */
    public final void m37669V1(String serialNumber, boolean z) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        m37551y0().edit().putBoolean(EnumC47876r81.SMARTLOCK_SET_TO_FACTORY_KEYS.m16446b(serialNumber), z).apply();
    }

    /* renamed from: V2 */
    public final boolean m37668V2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.SHOW_REQUIRE_END_RIDE_PHOTO_RIDER_BAR, false);
    }

    /* renamed from: W */
    public final WireLocation m37667W() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.LAST_LOCATION);
        if (m43437j != null) {
            return (WireLocation) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(WireLocation.class));
        }
        return new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 508, null);
    }

    /* renamed from: W0 */
    public final boolean m37666W0(String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return m37551y0().getBoolean(EnumC47876r81.CONTEXTUAL_TUTORIAL.m16446b(model), false);
    }

    /* renamed from: W1 */
    public final void m37665W1(DateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_ANALYTICS_SUBMISSION, this.f84188h.print(date));
    }

    /* renamed from: W2 */
    public final void m37664W2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.SHOW_SCOOTER_PARKING_TUTORIAL, true);
    }

    /* renamed from: X */
    public final String m37663X() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43437j(sp, EnumC37312Yj2.LAST_PARTNER_NAME);
    }

    /* renamed from: X0 */
    public final boolean m37662X0() {
        SharedPreferences persistentSp = m37603l0();
        Intrinsics.checkNotNullExpressionValue(persistentSp, "persistentSp");
        return C40082dz5.m43442e(persistentSp, EnumC37312Yj2.EXISTING_USER, false);
    }

    /* renamed from: X1 */
    public final void m37661X1(String optionId, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.LAST_CONFIGURE_PRELOAD_OPTIONS;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        C40082dz5.m43431p(sp, enumC37312Yj2, optionId + "," + str);
    }

    /* renamed from: X2 */
    public final boolean m37660X2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.TASK_ORDER_POST_CONFIRMATION, false);
    }

    /* renamed from: Y */
    public final String m37659Y() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43437j(sp, EnumC37312Yj2.RESERVATION_ID);
    }

    /* renamed from: Y0 */
    public final boolean m37658Y0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.SHOW_MOPED_PARKING_TUTORIAL, false);
    }

    /* renamed from: Y1 */
    public final void m37657Y1(WireLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (C22719hl.m35899b(location)) {
            SharedPreferences sp = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp, "sp");
            C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_FAKE_LOCATION, this.f84181a.m6453i(location));
        }
    }

    /* renamed from: Y2 */
    public final String m37656Y2(Map<String, C22457c> map, ItemLease itemLease, Map<String, WireBird> map2) {
        WireBird wireBird;
        String associatedItemId = itemLease.getAssociatedItemId();
        if (associatedItemId == null) {
            return null;
        }
        C22457c c22457c = map.get(associatedItemId);
        if (c22457c == null || (wireBird = c22457c.m37539c()) == null) {
            wireBird = map2.get(associatedItemId);
        }
        map.put(associatedItemId, new C22457c(wireBird, itemLease));
        return associatedItemId;
    }

    /* renamed from: Z */
    public final C22456b m37655Z() {
        boolean z;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.LAST_RIDE_PHYISCAL_LOCK);
        if (m43437j == null) {
            return null;
        }
        try {
            Object m6459c = this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(C22456b.class));
            C22456b c22456b = (C22456b) m6459c;
            if (c22456b.m37542c() != null && c22456b.m37543b() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m6459c = null;
            }
            return (C22456b) m6459c;
        } catch (InvalidDefinitionException e) {
            C41318g46.m40159e(e);
            return null;
        } catch (NullPointerException e2) {
            C41318g46.m40159e(e2);
            return null;
        }
    }

    /* renamed from: Z0 */
    public final boolean m37654Z0(Permission permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return m37551y0().getBoolean(permission.getPermission(), false);
    }

    /* renamed from: Z1 */
    public final void m37653Z1(IdentificationDebugResponse debugResponse) {
        Intrinsics.checkNotNullParameter(debugResponse, "debugResponse");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_IDENTIFICATION_DEBUG_RESPONSE, this.f84181a.m6453i(debugResponse));
    }

    /* renamed from: Z2 */
    public final void m37652Z2(List<ItemLease> itemLeases, List<WireBird> fallbackBirds) {
        Map<String, C22457c> mutableMap;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(itemLeases, "itemLeases");
        Intrinsics.checkNotNullParameter(fallbackBirds, "fallbackBirds");
        mutableMap = MapsKt__MapsKt.toMutableMap(m37751B());
        ArrayList arrayList = new ArrayList();
        lazy = LazyKt__LazyJVMKt.lazy(new C22466l(fallbackBirds));
        for (ItemLease itemLease : itemLeases) {
            String m37656Y2 = m37656Y2(mutableMap, itemLease, m37647a3(lazy));
            if (m37656Y2 != null) {
                arrayList.add(m37656Y2);
            }
        }
        Iterator<Map.Entry<String, C22457c>> it = mutableMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, C22457c> next = it.next();
            next.getValue();
            if (!arrayList.contains(next.getKey())) {
                it.remove();
            }
        }
        m37551y0().edit().putString("LEASE_DETAILS", this.f84181a.m6453i(new C22458d(mutableMap))).commit();
    }

    /* renamed from: a */
    public final void m37651a(String userRidePassId) {
        Intrinsics.checkNotNullParameter(userRidePassId, "userRidePassId");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.ACKED_INELIGIBLE_USER_RIDE_PASS_IDS;
        Set m43435l = C40082dz5.m43435l(sp, enumC37312Yj2);
        if (m43435l == null) {
            m43435l = new LinkedHashSet();
        }
        m43435l.add(userRidePassId);
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        C40082dz5.m43430q(sp2, enumC37312Yj2, m43435l);
    }

    /* renamed from: a0 */
    public final String m37650a0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43437j(sp, EnumC37312Yj2.LAST_USED_EMAIL);
    }

    /* renamed from: a1 */
    public final boolean m37649a1(String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return m37551y0().getBoolean(EnumC47876r81.PRIVATE_BIRD_CONTEXTUAL_TUTORIAL.m16446b(model), false);
    }

    /* renamed from: a2 */
    public final void m37648a2(IdentificationDocumentType docType) {
        Intrinsics.checkNotNullParameter(docType, "docType");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_IDENTIFICATION_DOCUMENT_TYPE, this.f84181a.m6453i(docType));
    }

    /* renamed from: b */
    public final DateTime m37646b() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.APP_LAST_BACKGROUNDED);
        if (m43437j != null) {
            return this.f84188h.parseDateTime(m43437j);
        }
        return null;
    }

    /* renamed from: b0 */
    public final VehiclePricingDetails m37645b0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.VEHICLE_PRICING_DETAILS);
        if (m43437j != null) {
            return (VehiclePricingDetails) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(VehiclePricingDetails.class));
        }
        return null;
    }

    /* renamed from: b1 */
    public final boolean m37644b1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.SHOW_SCOOTER_PARKING_TUTORIAL, false);
    }

    /* renamed from: b2 */
    public final void m37643b2(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_IDENTIFICATION_LOCALE, locale.toLanguageTag());
    }

    /* renamed from: b3 */
    public final void m37642b3(MapMode mapMode) {
        String name;
        C37791a94<String> c37791a94 = this.f84189i;
        if (C22459e.$EnumSwitchMapping$0[mapMode.ordinal()] == 1) {
            name = m37575s0().getUserRoleCode();
        } else {
            name = mapMode.name();
        }
        c37791a94.accept(name);
    }

    /* renamed from: c */
    public final DateTime m37641c() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.APP_LAST_FOREGROUNDED);
        if (m43437j != null) {
            return this.f84188h.parseDateTime(m43437j);
        }
        return null;
    }

    /* renamed from: c0 */
    public final int m37640c0(EnumC40897fN1 host) {
        Intrinsics.checkNotNullParameter(host, "host");
        C51174wi2 c51174wi2 = this.f84181a;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.HOST_PORTS);
        if (m43437j == null) {
            m43437j = "{}";
        }
        Integer num = (Integer) ((Map) c51174wi2.m6460b(m43437j, this.f84181a.m6461a(Reflection.getOrCreateKotlinClass(Map.class), Reflection.getOrCreateKotlinClass(EnumC40897fN1.class), Reflection.getOrCreateKotlinClass(Integer.class)))).get(host);
        if (num != null) {
            return num.intValue();
        }
        return host.m41478c();
    }

    /* renamed from: c1 */
    public final boolean m37639c1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.SHOW_RATE_APP, false);
    }

    /* renamed from: c2 */
    public final void m37638c2(WireLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (C22719hl.m35899b(location)) {
            SharedPreferences sp = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp, "sp");
            C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_LOCATION, this.f84181a.m6453i(location));
        }
    }

    /* renamed from: c3 */
    public final boolean m37637c3() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.TAX_INFORMATION_SKIPPED, false);
    }

    @SuppressLint({"CommitPrefEdits", "ApplySharedPref"})
    /* renamed from: d */
    public final void m37636d() {
        m37551y0().edit().clear().commit();
    }

    /* renamed from: d0 */
    public final boolean m37635d0(EnumC40897fN1 host) {
        Intrinsics.checkNotNullParameter(host, "host");
        C51174wi2 c51174wi2 = this.f84181a;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.HOST_ENABLED);
        if (m43437j == null) {
            m43437j = "{}";
        }
        Integer num = (Integer) ((Map) c51174wi2.m6460b(m43437j, this.f84181a.m6461a(Reflection.getOrCreateKotlinClass(Map.class), Reflection.getOrCreateKotlinClass(EnumC40897fN1.class), Reflection.getOrCreateKotlinClass(Integer.class)))).get(host);
        if (num == null) {
            return false;
        }
        return num.equals(1);
    }

    /* renamed from: d1 */
    public final DateTime m37634d1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.LAST_ANALYTICS_SUBMISSION);
        if (m43437j != null) {
            return this.f84188h.parseDateTime(m43437j);
        }
        return null;
    }

    /* renamed from: d2 */
    public final void m37633d2(String rideId) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_LOCK_COMPLIANCE_MODAL_RIDE_ID, rideId);
    }

    /* renamed from: e */
    public final void m37632e() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.DEAL, null);
    }

    /* renamed from: e0 */
    public final String m37631e0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.LOCAL_URL;
        String string = m37719J().getString(EnumC49958uf1.f112720m.m9902f());
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(Environment.LOCAL.hostFormat)");
        return C40082dz5.m43436k(sp, enumC37312Yj2, string);
    }

    /* renamed from: e1 */
    public final String m37630e1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43437j(sp, EnumC37312Yj2.LAST_LOCK_COMPLIANCE_MODAL_RIDE_ID);
    }

    /* renamed from: e2 */
    public final void m37629e2(String str) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_PARTNER_NAME, str);
    }

    /* renamed from: f */
    public final void m37628f() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.BOUNTY_FILTER, null);
    }

    /* renamed from: f0 */
    public final String m37627f0(WireLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f84181a.m6453i(location);
    }

    /* renamed from: f1 */
    public final ReservationPrice m37626f1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.PREVIOUS_RESERVATION_CURRENCY);
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        long m43439h = C40082dz5.m43439h(sp2, EnumC37312Yj2.PREVIOUS_RESERVATION_BASE_PRICE);
        SharedPreferences sp3 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp3, "sp");
        long m43438i = C40082dz5.m43438i(sp3, EnumC37312Yj2.PREVIOUS_RESERVATION_MINUTE_PRICE, -1L);
        SharedPreferences sp4 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp4, "sp");
        boolean m43443d = C40082dz5.m43443d(sp4, EnumC37312Yj2.PREVIOUS_RESERVATION_APPLY_SALES_TAX);
        if (m43437j != null && m43438i != -1) {
            return new ReservationPrice(m43437j, m43439h, m43438i, m43443d);
        }
        return null;
    }

    /* renamed from: f2 */
    public final void m37625f2(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.RESERVATION_ID, id);
    }

    /* renamed from: g */
    public final void m37624g() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43433n(sp, EnumC37312Yj2.CLOSE_PARKING_NEST_COUNT, 0);
    }

    /* renamed from: g0 */
    public final String m37623g0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.LOOKUP_BOUNTY_ID;
        String m43437j = C40082dz5.m43437j(sp, enumC37312Yj2);
        if (m43437j != null) {
            SharedPreferences sp2 = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp2, "sp");
            C40082dz5.m43434m(sp2, enumC37312Yj2);
            return m43437j;
        }
        return null;
    }

    /* renamed from: g1 */
    public final WireRidePrice m37622g1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.PREVIOUS_RIDE_CURRENCY);
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        long m43438i = C40082dz5.m43438i(sp2, EnumC37312Yj2.PREVIOUS_BASE_PRICE, -1L);
        SharedPreferences sp3 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp3, "sp");
        long m43438i2 = C40082dz5.m43438i(sp3, EnumC37312Yj2.PREVIOUS_MINUTE_PRICE, -1L);
        SharedPreferences sp4 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp4, "sp");
        boolean m43443d = C40082dz5.m43443d(sp4, EnumC37312Yj2.PREVIOUSLY_HAD_SALES_TAX);
        SharedPreferences sp5 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp5, "sp");
        long m43438i3 = C40082dz5.m43438i(sp5, EnumC37312Yj2.PREVIOUS_MINIMUM_PRICE, 0L);
        SharedPreferences sp6 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp6, "sp");
        int m43440g = C40082dz5.m43440g(sp6, EnumC37312Yj2.PREVIOUS_INCLUDED_MINUTES, 0);
        SharedPreferences sp7 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp7, "sp");
        String m43437j2 = C40082dz5.m43437j(sp7, EnumC37312Yj2.PREVIOUS_DYNAMIC_PRICING_STRING);
        if (m43437j != null && m43438i != -1 && m43438i2 != -1) {
            return new WireRidePrice(m43437j, m43438i, m43438i2, m43443d, m43438i3, m43440g, m43437j2);
        }
        return null;
    }

    /* renamed from: g2 */
    public final void m37621g2(ReservationPrice reservationPrice) {
        Intrinsics.checkNotNullParameter(reservationPrice, "reservationPrice");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.PREVIOUS_RESERVATION_CURRENCY, reservationPrice.getCurrency());
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        C40082dz5.m43432o(sp2, EnumC37312Yj2.PREVIOUS_RESERVATION_BASE_PRICE, reservationPrice.getBasePrice());
        SharedPreferences sp3 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp3, "sp");
        C40082dz5.m43432o(sp3, EnumC37312Yj2.PREVIOUS_RESERVATION_MINUTE_PRICE, reservationPrice.getMinutePrice());
        SharedPreferences sp4 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp4, "sp");
        C40082dz5.m43429r(sp4, EnumC37312Yj2.PREVIOUS_RESERVATION_APPLY_SALES_TAX, reservationPrice.getApplyTax());
    }

    /* renamed from: h */
    public final void m37620h() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_CONFIGURE_PRELOAD_OPTIONS, null);
    }

    /* renamed from: h0 */
    public final Pair<Integer, Integer> m37619h0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        Integer valueOf = Integer.valueOf(C40082dz5.m43440g(sp, EnumC37312Yj2.NEARBY_BIRDS_SIGNAL_FILTER_MIN, -100));
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        return new Pair<>(valueOf, Integer.valueOf(C40082dz5.m43440g(sp2, EnumC37312Yj2.NEARBY_BIRDS_SIGNAL_FILTER_MAX, 0)));
    }

    /* renamed from: h1 */
    public final WireRidePrice m37618h1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.SCANNER_PREVIOUS_RIDE_CURRENCY);
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        long m43438i = C40082dz5.m43438i(sp2, EnumC37312Yj2.SCANNER_PREVIOUS_BASE_PRICE, -1L);
        SharedPreferences sp3 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp3, "sp");
        long m43438i2 = C40082dz5.m43438i(sp3, EnumC37312Yj2.SCANNER_PREVIOUS_MINUTE_PRICE, -1L);
        SharedPreferences sp4 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp4, "sp");
        boolean m43443d = C40082dz5.m43443d(sp4, EnumC37312Yj2.SCANNER_PREVIOUSLY_HAD_SALES_TAX);
        SharedPreferences sp5 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp5, "sp");
        long m43438i3 = C40082dz5.m43438i(sp5, EnumC37312Yj2.SCANNER_PREVIOUS_MINIMUM_PRICE, 0L);
        SharedPreferences sp6 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp6, "sp");
        int m43440g = C40082dz5.m43440g(sp6, EnumC37312Yj2.SCANNER_PREVIOUS_INCLUDED_MINUTES, 0);
        SharedPreferences sp7 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp7, "sp");
        String m43437j2 = C40082dz5.m43437j(sp7, EnumC37312Yj2.SCANNER_PREVIOUS_DYNAMIC_PRICING_STRING);
        if (m43437j != null && m43438i != -1 && m43438i2 != -1) {
            return new WireRidePrice(m43437j, m43438i, m43438i2, m43443d, m43438i3, m43440g, m43437j2);
        }
        return null;
    }

    /* renamed from: h2 */
    public final void m37617h2(WireRidePrice ridePrice) {
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.PREVIOUS_RIDE_CURRENCY, ridePrice.getCurrency());
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        C40082dz5.m43432o(sp2, EnumC37312Yj2.PREVIOUS_BASE_PRICE, ridePrice.getBasePrice());
        SharedPreferences sp3 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp3, "sp");
        C40082dz5.m43432o(sp3, EnumC37312Yj2.PREVIOUS_MINUTE_PRICE, ridePrice.getMinutePrice());
        SharedPreferences sp4 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp4, "sp");
        C40082dz5.m43429r(sp4, EnumC37312Yj2.PREVIOUSLY_HAD_SALES_TAX, ridePrice.getSalesTax());
        SharedPreferences sp5 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp5, "sp");
        C40082dz5.m43432o(sp5, EnumC37312Yj2.PREVIOUS_MINIMUM_PRICE, ridePrice.getMinimumPrice());
        SharedPreferences sp6 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp6, "sp");
        C40082dz5.m43433n(sp6, EnumC37312Yj2.PREVIOUS_INCLUDED_MINUTES, ridePrice.getIncludedMinutes());
        SharedPreferences sp7 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp7, "sp");
        C40082dz5.m43431p(sp7, EnumC37312Yj2.PREVIOUS_DYNAMIC_PRICING_STRING, ridePrice.getOverwriteString());
    }

    /* renamed from: i */
    public final void m37616i() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_LOCATION, null);
    }

    /* renamed from: i0 */
    public final int m37615i0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43440g(sp, EnumC37312Yj2.NEARBY_BIRDS_UPDATE_FREQUENCY, 0);
    }

    /* renamed from: i1 */
    public final int m37614i1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43440g(sp, EnumC37312Yj2.OPERATOR_LIFETIME_FRICTION_COUNT, 0);
    }

    /* renamed from: i2 */
    public final void m37613i2(WireRideDetail rideDetail) {
        Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_COMPLETED_RIDE, this.f84181a.m6453i(rideDetail));
    }

    /* renamed from: j */
    public final void m37612j() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43434m(sp, EnumC37312Yj2.RESERVATION_ID);
    }

    /* renamed from: j0 */
    public final NestTypeFilter m37611j0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.NESTS_TYPE_FILTER);
        if (m43437j != null) {
            return (NestTypeFilter) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(NestTypeFilter.class));
        }
        return new NestTypeFilter(false, 1, null);
    }

    /* renamed from: j1 */
    public final void m37610j1(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.SEEN_DESTINATION_TOOLTIP;
        Set m43435l = C40082dz5.m43435l(sp, enumC37312Yj2);
        if (m43435l == null) {
            m43435l = new LinkedHashSet();
        }
        m43435l.add(message);
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        C40082dz5.m43430q(sp2, enumC37312Yj2, m43435l);
    }

    /* renamed from: j2 */
    public final void m37609j2(WirePhysicalLock physicalLock, DateTime expireTime) {
        Intrinsics.checkNotNullParameter(physicalLock, "physicalLock");
        Intrinsics.checkNotNullParameter(expireTime, "expireTime");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_RIDE_PHYISCAL_LOCK, this.f84181a.m6453i(new C22456b(physicalLock, expireTime)));
    }

    /* renamed from: k */
    public final void m37608k() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LAST_RIDE_PHYISCAL_LOCK, null);
    }

    /* renamed from: k0 */
    public final String m37607k0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.PENDING_LOOKUP_BIRD_CODE);
        if (m43437j != null) {
            m37604l();
            return m43437j;
        }
        return null;
    }

    /* renamed from: k1 */
    public final void m37606k1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.ENVIRONMENT;
        int m43440g = C40082dz5.m43440g(sp, enumC37312Yj2, -1);
        if (m43440g != -1) {
            SharedPreferences persistentSp = m37603l0();
            Intrinsics.checkNotNullExpressionValue(persistentSp, "persistentSp");
            C40082dz5.m43446a(persistentSp, enumC37312Yj2, m43440g);
            SharedPreferences sp2 = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp2, "sp");
            C40082dz5.m43434m(sp2, enumC37312Yj2);
        }
    }

    /* renamed from: k2 */
    public final void m37605k2(WireRidePrice ridePrice) {
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.SCANNER_PREVIOUS_RIDE_CURRENCY, ridePrice.getCurrency());
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        C40082dz5.m43432o(sp2, EnumC37312Yj2.SCANNER_PREVIOUS_BASE_PRICE, ridePrice.getBasePrice());
        SharedPreferences sp3 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp3, "sp");
        C40082dz5.m43432o(sp3, EnumC37312Yj2.SCANNER_PREVIOUS_MINUTE_PRICE, ridePrice.getMinutePrice());
        SharedPreferences sp4 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp4, "sp");
        C40082dz5.m43429r(sp4, EnumC37312Yj2.SCANNER_PREVIOUSLY_HAD_SALES_TAX, ridePrice.getSalesTax());
        SharedPreferences sp5 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp5, "sp");
        C40082dz5.m43432o(sp5, EnumC37312Yj2.SCANNER_PREVIOUS_MINIMUM_PRICE, ridePrice.getMinimumPrice());
        SharedPreferences sp6 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp6, "sp");
        C40082dz5.m43433n(sp6, EnumC37312Yj2.SCANNER_PREVIOUS_INCLUDED_MINUTES, ridePrice.getIncludedMinutes());
        SharedPreferences sp7 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp7, "sp");
        C40082dz5.m43431p(sp7, EnumC37312Yj2.SCANNER_PREVIOUS_DYNAMIC_PRICING_STRING, ridePrice.getOverwriteString());
    }

    /* renamed from: l */
    public final void m37604l() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43434m(sp, EnumC37312Yj2.PENDING_LOOKUP_BIRD_CODE);
    }

    /* renamed from: l0 */
    public final SharedPreferences m37603l0() {
        return (SharedPreferences) this.f84185e.getValue();
    }

    /* renamed from: l1 */
    public final void m37602l1() {
        try {
            SharedPreferences persistentSp = m37603l0();
            Intrinsics.checkNotNullExpressionValue(persistentSp, "persistentSp");
            m37701N1(EnumC49958uf1.values()[EnumC49958uf1.f112717j.m9898b(C40082dz5.m43440g(persistentSp, EnumC37312Yj2.ENVIRONMENT, m37552y(false)))]);
        } catch (ClassCastException unused) {
        }
    }

    /* renamed from: l2 */
    public final void m37601l2(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43445b(sp, EnumC37312Yj2.LAST_USED_EMAIL, email);
    }

    /* renamed from: m */
    public final void m37600m() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.PRELOAD_V2_AUTO_RELOAD_SELECTED, null);
        C41318g46.m40163a("preload clearPreloadV2AutoReloadSelected", new Object[0]);
    }

    /* renamed from: m0 */
    public final Boolean m37599m0() {
        Boolean bool;
        if (m37551y0().contains("PRELOAD_V2_AUTO_RELOAD_SELECTED")) {
            SharedPreferences sp = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp, "sp");
            bool = Boolean.valueOf(C40082dz5.m43443d(sp, EnumC37312Yj2.PRELOAD_V2_AUTO_RELOAD_SELECTED));
        } else {
            bool = null;
        }
        C41318g46.m40163a("preload setPreloadV2AutoReloadSelected returning " + bool, new Object[0]);
        return bool;
    }

    /* renamed from: m1 */
    public final void m37598m1() {
        try {
            if (m37551y0().getAll().get("RECENT_VIEW_MODE") instanceof Number) {
                SharedPreferences sp = m37551y0();
                Intrinsics.checkNotNullExpressionValue(sp, "sp");
                C40082dz5.m43445b(sp, EnumC37312Yj2.RECENT_VIEW_MODE, this.f84181a.m6453i(m37567u0()));
            }
        } catch (Exception e) {
            C41318g46.m40153k("MapMode Enum Migration").mo7224f(e);
        }
    }

    /* renamed from: m2 */
    public final void m37597m2(EnumC40897fN1 host, Integer num) {
        Map mutableMap;
        Intrinsics.checkNotNullParameter(host, "host");
        C51174wi2 c51174wi2 = this.f84181a;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.HOST_PORTS;
        String m43437j = C40082dz5.m43437j(sp, enumC37312Yj2);
        if (m43437j == null) {
            m43437j = "{}";
        }
        mutableMap = MapsKt__MapsKt.toMutableMap((Map) c51174wi2.m6460b(m43437j, this.f84181a.m6461a(Reflection.getOrCreateKotlinClass(Map.class), Reflection.getOrCreateKotlinClass(EnumC40897fN1.class), Reflection.getOrCreateKotlinClass(Integer.class))));
        if (num != null) {
            mutableMap.put(host, num);
        } else {
            mutableMap.remove(host);
        }
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        C40082dz5.m43431p(sp2, enumC37312Yj2, this.f84181a.m6453i(mutableMap));
    }

    /* renamed from: n */
    public final void m37596n() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.PRELOAD_V2_OPTION_SELECTED_ID, null);
        C41318g46.m40163a("preload clearPreloadV2SelectedOption", new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0018, code lost:
        if ((!r2) != false) goto L5;
     */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m37595n0() {
        boolean isBlank;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.PRELOAD_V2_OPTION_SELECTED_ID);
        if (m43437j != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(m43437j);
        }
        m43437j = null;
        C41318g46.m40163a("preload getPreloadV2SelectedOption returning " + m43437j, new Object[0]);
        return m43437j;
    }

    /* renamed from: n1 */
    public final void m37594n1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.RUN_COUNT;
        int m43440g = C40082dz5.m43440g(sp, enumC37312Yj2, -1);
        if (m43440g != -1) {
            SharedPreferences persistentSp = m37603l0();
            Intrinsics.checkNotNullExpressionValue(persistentSp, "persistentSp");
            C40082dz5.m43446a(persistentSp, enumC37312Yj2, m43440g);
            SharedPreferences sp2 = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp2, "sp");
            C40082dz5.m43434m(sp2, enumC37312Yj2);
        }
    }

    /* renamed from: n2 */
    public final void m37593n2(EnumC40897fN1 host, boolean z) {
        Map mutableMap;
        Intrinsics.checkNotNullParameter(host, "host");
        C51174wi2 c51174wi2 = this.f84181a;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.HOST_ENABLED;
        String m43437j = C40082dz5.m43437j(sp, enumC37312Yj2);
        if (m43437j == null) {
            m43437j = "{}";
        }
        mutableMap = MapsKt__MapsKt.toMutableMap((Map) c51174wi2.m6460b(m43437j, this.f84181a.m6461a(Reflection.getOrCreateKotlinClass(Map.class), Reflection.getOrCreateKotlinClass(EnumC40897fN1.class), Reflection.getOrCreateKotlinClass(Integer.class))));
        mutableMap.put(host, Integer.valueOf(z ? 1 : 0));
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        C40082dz5.m43431p(sp2, enumC37312Yj2, this.f84181a.m6453i(mutableMap));
    }

    /* renamed from: o */
    public final void m37592o() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.PREVIOUS_USER_ROLE_ITEM, null);
    }

    /* renamed from: o0 */
    public final UserRoleItem m37591o0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.PREVIOUS_USER_ROLE_ITEM);
        if (m43437j != null) {
            return (UserRoleItem) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(UserRoleItem.class));
        }
        return UserRoleItemKt.toUserRoleItem(UserRole.UNKNOWN);
    }

    /* renamed from: o1 */
    public final void m37590o1(int i) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43433n(sp, EnumC37312Yj2.AUTO_PAY_V2_LAST_NAG_RIDE_COUNT, i);
    }

    /* renamed from: o2 */
    public final void m37589o2(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LOCAL_URL, url);
    }

    /* renamed from: p */
    public final void m37588p() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43434m(sp, EnumC37312Yj2.REBALANCE_MAP_BANNER_INFO);
    }

    /* renamed from: p0 */
    public final String m37587p0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43437j(sp, EnumC37312Yj2.PUSH_TOKEN);
    }

    /* renamed from: p1 */
    public final boolean m37586p1(String linkCode, int i) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.SEEN_RIDE_PASSES;
        if (m37711L(enumC37312Yj2, linkCode) <= i) {
            m37694P0(enumC37312Yj2, linkCode);
            return true;
        }
        return false;
    }

    /* renamed from: p2 */
    public final void m37585p2(String bountyId) {
        Intrinsics.checkNotNullParameter(bountyId, "bountyId");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LOOKUP_BOUNTY_ID, bountyId);
    }

    /* renamed from: q */
    public final void m37584q() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43434m(sp, EnumC37312Yj2.TWEAKS);
    }

    /* renamed from: q0 */
    public final WireReleaseAssignmentMapBanner m37583q0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.REBALANCE_MAP_BANNER_INFO);
        if (m43437j != null) {
            return (WireReleaseAssignmentMapBanner) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(WireReleaseAssignmentMapBanner.class));
        }
        return null;
    }

    /* renamed from: q1 */
    public final boolean m37582q1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.ONBOARDING_COMPLETED, false);
    }

    /* renamed from: q2 */
    public final void m37581q2(int i, int i2) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43433n(sp, EnumC37312Yj2.NEARBY_BIRDS_SIGNAL_FILTER_MIN, i);
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        C40082dz5.m43433n(sp2, EnumC37312Yj2.NEARBY_BIRDS_SIGNAL_FILTER_MAX, i2);
    }

    /* renamed from: r */
    public final void m37580r() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.HAS_CLICKED_LONG_TERM_RENTAL_SETUP_BANNER, true);
    }

    /* renamed from: r0 */
    public final UserRoleItem m37579r0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.RECENT_OPERATOR_USER_ROLE_ITEM);
        if (m43437j != null) {
            return (UserRoleItem) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(UserRoleItem.class));
        }
        return null;
    }

    /* renamed from: r1 */
    public final boolean m37578r1(String featureName) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        return m37551y0().getBoolean(C22719hl.m35900a(featureName), false);
    }

    /* renamed from: r2 */
    public final void m37577r2(int i) {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43433n(sp, EnumC37312Yj2.NEARBY_BIRDS_UPDATE_FREQUENCY, i);
    }

    /* renamed from: s */
    public final int m37576s() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43441f(sp, EnumC37312Yj2.CLOSE_PARKING_NEST_COUNT);
    }

    /* renamed from: s0 */
    public final UserRoleItem m37575s0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.RECENT_USER_ROLE_ITEM);
        if (m43437j != null) {
            return (UserRoleItem) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(UserRoleItem.class));
        }
        return UserRoleItemKt.toUserRoleItem(UserRole.UNKNOWN);
    }

    /* renamed from: s1 */
    public final String m37574s1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43437j(sp, EnumC37312Yj2.OPERATOR_TAB);
    }

    /* renamed from: s2 */
    public final void m37573s2(Permission permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        m37551y0().edit().putBoolean(permission.getPermission(), true).apply();
    }

    /* renamed from: t */
    public final DateTime m37572t() {
        DateTime dateTime;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.CLOSE_PARKING_NEST_TIME_INTERVAL_START);
        if (m43437j != null) {
            dateTime = this.f84188h.parseDateTime(m43437j);
        } else {
            dateTime = null;
        }
        if (dateTime == null) {
            return new DateTime(0L);
        }
        return dateTime;
    }

    /* renamed from: t0 */
    public final MapMode m37571t0() {
        C51174wi2 c51174wi2 = this.f84181a;
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.RECENT_VIEW_MODE;
        MapMode mapMode = MapMode.RIDER;
        String m43436k = C40082dz5.m43436k(sp, enumC37312Yj2, mapMode.name());
        if (m43436k == null) {
            m43436k = mapMode.name();
        }
        return (MapMode) c51174wi2.m6459c(m43436k, Reflection.getOrCreateKotlinClass(MapMode.class));
    }

    /* renamed from: t1 */
    public final boolean m37570t1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.PARKING_NEST_DIALOG_VIEWED, false);
    }

    /* renamed from: t2 */
    public final void m37569t2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.ONBOARDING_COMPLETED, true);
    }

    /* renamed from: u */
    public final int m37568u() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43440g(sp, EnumC37312Yj2.CODE_ENTRY_COUNT, 0);
    }

    @Deprecated(message = "This uses ordinal to retrieve the MapMode, which is no longer supported")
    /* renamed from: u0 */
    public final MapMode m37567u0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.RECENT_VIEW_MODE;
        MapMode mapMode = MapMode.RIDER;
        int m43440g = C40082dz5.m43440g(sp, enumC37312Yj2, mapMode.ordinal());
        if (m43440g >= MapMode.values().length) {
            m43440g = mapMode.ordinal();
        }
        return MapMode.values()[m43440g];
    }

    /* renamed from: u1 */
    public final void m37566u1(WireBird wireBird, ItemLease itemLease) {
        Map mutableMap;
        Intrinsics.checkNotNullParameter(wireBird, "wireBird");
        Intrinsics.checkNotNullParameter(itemLease, "itemLease");
        mutableMap = MapsKt__MapsKt.toMutableMap(m37751B());
        mutableMap.put(wireBird.getId(), new C22457c(wireBird, itemLease));
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.LEASE_DETAILS, this.f84181a.m6453i(mutableMap));
    }

    /* renamed from: u2 */
    public final void m37565u2(String featureName) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        m37551y0().edit().putBoolean(C22719hl.m35900a(featureName), true).apply();
    }

    /* renamed from: v */
    public final int m37564v() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43440g(sp, EnumC37312Yj2.CODE_ENTRY_HINT_VIEW_COUNT, 0);
    }

    /* renamed from: v0 */
    public final int m37563v0() {
        SharedPreferences persistentSp = m37603l0();
        Intrinsics.checkNotNullExpressionValue(persistentSp, "persistentSp");
        return C40082dz5.m43440g(persistentSp, EnumC37312Yj2.RUN_COUNT, 0);
    }

    /* renamed from: v1 */
    public final long m37562v1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43438i(sp, EnumC37312Yj2.PRELOAD_V2_ONBOARDING_SEEN_TIMESTAMP, 0L);
    }

    /* renamed from: v2 */
    public final void m37561v2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.PARKING_NEST_DIALOG_VIEWED, true);
    }

    /* renamed from: w */
    public final WireRideDetail m37560w() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        EnumC37312Yj2 enumC37312Yj2 = EnumC37312Yj2.LAST_COMPLETED_RIDE;
        String m43437j = C40082dz5.m43437j(sp, enumC37312Yj2);
        SharedPreferences sp2 = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp2, "sp");
        C40082dz5.m43431p(sp2, enumC37312Yj2, null);
        if (m43437j == null) {
            return null;
        }
        return (WireRideDetail) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(WireRideDetail.class));
    }

    /* renamed from: w0 */
    public final Map<String, Integer> m37559w0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.SEEN_ANNOUNCEMENTS);
        if (m43437j != null) {
            C51174wi2 c51174wi2 = this.f84181a;
            Type type = new C22462h().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<Mutab…p<String, Int>>() {}.type");
            Map<String, Integer> map = (Map) c51174wi2.m6460b(m43437j, type);
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    /* renamed from: w1 */
    public final boolean m37558w1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.PRELOAD_V2_PAY_PER_RIDE_SELECTED, false);
    }

    /* renamed from: w2 */
    public final void m37557w2(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43431p(sp, EnumC37312Yj2.PENDING_LOOKUP_BIRD_CODE, code);
    }

    /* renamed from: x */
    public final boolean m37556x() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.DATABASES_CLEARED, false);
    }

    /* renamed from: x0 */
    public final long m37555x0() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43438i(sp, EnumC37312Yj2.AUTO_PAY_SHOWN_LAST, 0L);
    }

    /* renamed from: x1 */
    public final void m37554x1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.PROMPT_BOUNTY_DESIGNATION_REACCEPT, true);
    }

    /* renamed from: x2 */
    public final void m37553x2(boolean z) {
        C41318g46.m40163a("preload setPreloadV2AutoReloadSelected saved " + z, new Object[0]);
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.PRELOAD_V2_AUTO_RELOAD_SELECTED, z);
    }

    /* renamed from: y */
    public final int m37552y(boolean z) {
        if (z) {
            return f84180k.ordinal();
        }
        return EnumC49958uf1.f112718k.ordinal();
    }

    /* renamed from: y0 */
    public final SharedPreferences m37551y0() {
        return (SharedPreferences) this.f84184d.getValue();
    }

    /* renamed from: y1 */
    public final boolean m37550y1() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return C40082dz5.m43442e(sp, EnumC37312Yj2.QUICK_CAPTURE_READY_DO_NOT_SHOW, false);
    }

    /* renamed from: y2 */
    public final void m37549y2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43432o(sp, EnumC37312Yj2.PRELOAD_V2_ONBOARDING_SEEN_TIMESTAMP, System.currentTimeMillis());
    }

    /* renamed from: z */
    public final void m37548z(MapMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        m37642b3(mode);
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43445b(sp, EnumC37312Yj2.RECENT_VIEW_MODE, this.f84181a.m6453i(mode));
    }

    /* renamed from: z0 */
    public final Tweaks m37547z0(DeserializerKind deserializerKind) {
        Tweaks tweaks;
        try {
            SharedPreferences sp = m37551y0();
            Intrinsics.checkNotNullExpressionValue(sp, "sp");
            String m43437j = C40082dz5.m43437j(sp, EnumC37312Yj2.TWEAKS);
            if (m43437j != null) {
                C41318g46.m40152l("Deserializing tweaks from string " + m43437j, new Object[0]);
                if (deserializerKind != null) {
                    tweaks = (Tweaks) this.f84181a.m6458d(m43437j, Reflection.getOrCreateKotlinClass(Tweaks.class), deserializerKind);
                } else {
                    tweaks = (Tweaks) this.f84181a.m6459c(m43437j, Reflection.getOrCreateKotlinClass(Tweaks.class));
                }
                C41318g46.m40152l("Deserialized tweaks into " + tweaks, new Object[0]);
                if (tweaks != null) {
                    return tweaks;
                }
            }
            return this.f84182b;
        } catch (JsonSyntaxException e) {
            C41318g46.m40161c(e, "Caught json syntax exception while handling getTweaks", new Object[0]);
            return this.f84182b;
        }
    }

    /* renamed from: z1 */
    public final UserRoleItem m37546z1() {
        UserRoleItem m37575s0 = m37575s0();
        if (m37575s0.getUserRole() == UserRole.UNKNOWN) {
            int i = C22459e.$EnumSwitchMapping$0[m37571t0().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return UserRoleItemKt.toUserRoleItem(UserRole.RIDER);
                }
                return UserRoleItemKt.toUserRoleItem(UserRole.MERCHANT);
            }
            return UserRoleItemKt.toUserRoleItem(UserRole.OPERATOR);
        }
        return m37575s0;
    }

    /* renamed from: z2 */
    public final void m37545z2() {
        SharedPreferences sp = m37551y0();
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        C40082dz5.m43429r(sp, EnumC37312Yj2.PRELOAD_V2_PAY_PER_RIDE_SELECTED, true);
    }
}
