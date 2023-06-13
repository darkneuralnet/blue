package com.stripe.android.networking;

import android.content.Context;
import android.net.http.HttpResponseCache;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.services.p026s3.internal.Constants;
import com.stripe.android.DefaultFraudDetectionDataRepository;
import com.stripe.android.FraudDetectionDataRepository;
import com.stripe.android.Stripe;
import com.stripe.android.StripeApiBeta;
import com.stripe.android.cards.Bin;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.core.model.parsers.StripeFileJsonParser;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.FileUploadRequest;
import com.stripe.android.core.networking.RequestId;
import com.stripe.android.core.networking.ResponseJsonKt;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.exception.CardException;
import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSignUpConsentAction;
import com.stripe.android.model.CreateFinancialConnectionsSessionParams;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.IssuingCardPin;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodMessage;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.PaymentMethodsList;
import com.stripe.android.model.RadarSession;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.model.parsers.CardMetadataJsonParser;
import com.stripe.android.model.parsers.ConsumerPaymentDetailsJsonParser;
import com.stripe.android.model.parsers.ConsumerSessionJsonParser;
import com.stripe.android.model.parsers.CustomerJsonParser;
import com.stripe.android.model.parsers.ElementsSessionJsonParser;
import com.stripe.android.model.parsers.FinancialConnectionsSessionJsonParser;
import com.stripe.android.model.parsers.FpxBankStatusesJsonParser;
import com.stripe.android.model.parsers.IssuingCardPinJsonParser;
import com.stripe.android.model.parsers.PaymentIntentJsonParser;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.model.parsers.PaymentMethodMessageJsonParser;
import com.stripe.android.model.parsers.PaymentMethodsListJsonParser;
import com.stripe.android.model.parsers.RadarSessionJsonParser;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import com.stripe.android.model.parsers.SourceJsonParser;
import com.stripe.android.model.parsers.Stripe3ds2AuthResultJsonParser;
import com.stripe.android.model.parsers.TokenJsonParser;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.utils.StripeUrlUtils;
import java.io.File;
import java.io.IOException;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
@Metadata(m28433d1 = {"\u0000Þ\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u0091\u00022\u00020\u0001:\u0004\u0091\u0002\u0092\u0002BQ\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011B\u00ad\u0001\b\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\u0006¢\u0006\u0002\u0010!JK\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0004\b0\u00101JA\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000608H\u0096@ø\u0001\u0000¢\u0006\u0002\u00109JA\u0010:\u001a\u0004\u0018\u00010;2\u0006\u00104\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000608H\u0096@ø\u0001\u0000¢\u0006\u0002\u00109JA\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010@J$\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060B2\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J-\u0010D\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ-\u0010H\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0004\bI\u0010GJ%\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ3\u0010N\u001a\u0004\u0018\u0001032\u0006\u0010O\u001a\u00020P2\u0006\u0010E\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000608H\u0090@ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ1\u0010S\u001a\u0004\u0018\u0001032\u0006\u0010O\u001a\u00020P2\u0006\u0010E\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000608H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010RJ3\u0010T\u001a\u0004\u0018\u00010;2\u0006\u0010U\u001a\u00020V2\u0006\u0010E\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000608H\u0090@ø\u0001\u0000¢\u0006\u0004\bW\u0010XJY\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u00062\b\u0010^\u001a\u0004\u0018\u00010\u00062\b\u0010_\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010\u00062\u0006\u0010b\u001a\u00020c2\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010dJ*\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020g0f2\u0006\u00104\u001a\u00020\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000608H\u0002J#\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ#\u0010n\u001a\u0004\u0018\u00010o2\u0006\u0010p\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010MJ+\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010p\u001a\u00020\u00062\u0006\u0010s\u001a\u00020t2\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010uJ+\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010p\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010GJ-\u0010w\u001a\u0004\u0018\u00010o2\u0006\u00105\u001a\u00020\u00062\u0006\u0010x\u001a\u00020y2\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0004\bz\u0010{J#\u0010|\u001a\u0004\u0018\u00010>2\u0006\u0010}\u001a\u00020~2\u0006\u0010E\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u007fJ!\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J/\u0010\u0084\u0001\u001a\u0004\u0018\u00010o2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010x\u001a\u00020y2\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0005\b\u0085\u0001\u0010{J*\u0010\u0086\u0001\u001a\u0004\u0018\u00010)2\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0006\u0010E\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J+\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0006\u0010E\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001JE\u0010\u0091\u0001\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0005\b\u0092\u0001\u0010@J,\u0010\u0093\u0001\u001a\u00030\u0094\u00012\u0006\u0010p\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010GJ;\u0010\u0096\u0001\u001a\u0004\u0018\u00010>2\u0006\u0010+\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0097\u0001J\n\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0002JM\u0010\u009a\u0001\u001a\u0005\u0018\u0001H\u009b\u0001\"\n\b\u0000\u0010\u009b\u0001*\u00030\u009c\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\u000f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009b\u00010 \u00012\u000e\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010¢\u0001J\u0019\u0010£\u0001\u001a\u00030\u0094\u00012\u0007\u0010x\u001a\u00030¤\u0001H\u0001¢\u0006\u0003\b¥\u0001J\u0014\u0010£\u0001\u001a\u00030\u0094\u00012\b\u0010¦\u0001\u001a\u00030§\u0001H\u0002J\n\u0010¨\u0001\u001a\u00030\u0094\u0001H\u0002J+\u0010©\u0001\u001a\u0005\u0018\u00010ª\u00012\b\u0010«\u0001\u001a\u00030¬\u00012\u0006\u0010E\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0017\u0010¯\u0001\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0006H\u0001¢\u0006\u0003\b°\u0001J\u001f\u0010±\u0001\u001a\u00030²\u00012\u0006\u0010E\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0006\b³\u0001\u0010\u0083\u0001J\u0017\u0010´\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0001¢\u0006\u0003\bµ\u0001JA\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020>082\b\u0010·\u0001\u001a\u00030¸\u00012\u0006\u0010+\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010¹\u0001J\u0017\u0010º\u0001\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0001¢\u0006\u0003\b»\u0001J\u001a\u0010¼\u0001\u001a\u00030\u0094\u00012\u000e\u0010½\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060¾\u0001H\u0002J4\u0010¿\u0001\u001a\u0004\u0018\u00010r2\u0006\u0010p\u001a\u00020\u00062\r\u0010À\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010Á\u0001J.\u0010Â\u0001\u001a\u0004\u0018\u00010Z2\u0006\u0010p\u001a\u00020\u00062\b\u0010a\u001a\u0004\u0018\u00010\u00062\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010GJ7\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060¾\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\u000e\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010\u0005H\u0081@ø\u0001\u0000¢\u0006\u0006\bÄ\u0001\u0010Å\u0001JA\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060¾\u00012\b\u0010Ç\u0001\u001a\u00030È\u00012\u0018\u0010¡\u0001\u001a\u0013\u0012\u0007\u0012\u0005\u0018\u00010Ê\u0001\u0012\u0005\u0012\u00030\u0094\u00010É\u0001H\u0081@ø\u0001\u0000¢\u0006\u0006\bË\u0001\u0010Ì\u0001JA\u0010Í\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020g0f2\u0012\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020g0f2\b\u0010}\u001a\u0004\u0018\u00010~2\f\b\u0002\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001H\u0002J'\u0010Î\u0001\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0005\bÏ\u0001\u0010MJ\u0014\u0010Ð\u0001\u001a\u00030\u0094\u00012\b\u0010Ñ\u0001\u001a\u00030\u0099\u0001H\u0002J&\u0010Ò\u0001\u001a\u0005\u0018\u00010ª\u00012\u0007\u0010Ó\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010MJ4\u0010Ô\u0001\u001a\u0005\u0018\u00010Õ\u00012\u0006\u0010*\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010Á\u0001J'\u0010Ö\u0001\u001a\u0005\u0018\u00010×\u00012\u0007\u0010x\u001a\u00030Ø\u00012\u0006\u0010E\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010Ù\u0001J3\u0010Ö\u0001\u001a\u0005\u0018\u00010×\u00012\u0007\u0010x\u001a\u00030Ø\u00012\u0006\u0010E\u001a\u00020/2\n\u0010Ú\u0001\u001a\u0005\u0018\u00010§\u0001H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010Û\u0001J;\u0010Ü\u0001\u001a\u0004\u0018\u00010\u00062\u0007\u0010Ý\u0001\u001a\u00020\u00062\u0007\u0010Þ\u0001\u001a\u00020\u00062\u0007\u0010ß\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0006\bà\u0001\u0010á\u0001J-\u0010â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060¾\u00012\u0007\u0010ã\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0005\bä\u0001\u0010MJ3\u0010å\u0001\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000608H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010æ\u0001JY\u0010ç\u0001\u001a\u0005\u0018\u00010è\u00012\r\u0010é\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006082\b\u0010ê\u0001\u001a\u00030ë\u00012\u0007\u0010ì\u0001\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00062\u0007\u0010í\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010î\u0001J3\u0010ï\u0001\u001a\u0004\u0018\u00010;2\u0006\u00104\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000608H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010æ\u0001J/\u0010ð\u0001\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0005\bñ\u0001\u0010GJ5\u0010ò\u0001\u001a\u00030ó\u00012\u0006\u00104\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000608H\u0090@ø\u0001\u0000¢\u0006\u0006\bô\u0001\u0010æ\u0001JI\u0010õ\u0001\u001a\u0005\u0018\u00010Õ\u00012\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\u0010ö\u0001\u001a\u00030÷\u00012\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0006\bø\u0001\u0010ù\u0001JN\u0010ú\u0001\u001a\u0005\u0018\u00010Õ\u00012\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0005\bû\u0001\u00101J*\u0010ü\u0001\u001a\u0004\u0018\u00010K2\b\u0010ý\u0001\u001a\u00030þ\u00012\u0006\u0010.\u001a\u00020/H\u0091@ø\u0001\u0000¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002JC\u0010\u0081\u0002\u001a\u00030\u0094\u00012\u0007\u0010Ý\u0001\u001a\u00020\u00062\u0007\u0010\u0082\u0002\u001a\u00020\u00062\u0007\u0010Þ\u0001\u001a\u00020\u00062\u0007\u0010ß\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@ø\u0001\u0000¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J/\u0010\u0085\u0002\u001a\u0004\u0018\u00010r2\u0006\u0010p\u001a\u00020\u00062\b\u0010\u0086\u0002\u001a\u00030\u0087\u00022\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0088\u0002J9\u0010\u0089\u0002\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00062\b\u0010\u008a\u0002\u001a\u00030ë\u00012\b\u0010\u008b\u0002\u001a\u00030ë\u00012\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u008c\u0002J-\u0010\u0089\u0002\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00062\u0007\u0010\u008d\u0002\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010GJ9\u0010\u008e\u0002\u001a\u0004\u0018\u00010;2\u0006\u00104\u001a\u00020\u00062\b\u0010\u008a\u0002\u001a\u00030ë\u00012\b\u0010\u008b\u0002\u001a\u00030ë\u00012\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u008c\u0002J-\u0010\u008e\u0002\u001a\u0004\u0018\u00010;2\u0006\u00104\u001a\u00020\u00062\u0007\u0010\u008d\u0002\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010GJ\u001f\u0010\u008f\u0002\u001a\u00020P*\u00020P2\u0006\u0010E\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0090\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0093\u0002"}, m28432d2 = {"Lcom/stripe/android/networking/StripeApiRepository;", "Lcom/stripe/android/networking/StripeRepository;", "appContext", "Landroid/content/Context;", "publishableKeyProvider", "Lkotlin/Function0;", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "productUsageTokens", "", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "logger", "Lcom/stripe/android/core/Logger;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/Logger;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "appInfo", "Lcom/stripe/android/core/AppInfo;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "fraudDetectionDataRepository", "Lcom/stripe/android/FraudDetectionDataRepository;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "fraudDetectionDataParamsUtils", "Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;", "betas", "Lcom/stripe/android/StripeApiBeta;", "apiVersion", "sdkVersion", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "fraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "getFraudDetectionData", "()Lcom/stripe/android/networking/FraudDetectionData;", "addCustomerSource", "Lcom/stripe/android/model/Source;", "customerId", "publishableKey", "sourceId", "sourceType", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "addCustomerSource$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachFinancialConnectionsSessionToPaymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "clientSecret", "paymentIntentId", "financialConnectionsSessionId", "expandFields", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachFinancialConnectionsSessionToSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "setupIntentId", "attachPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildPaymentUserAgentPair", "Lkotlin/Pair;", "attribution", "cancelPaymentIntentSource", "options", "cancelPaymentIntentSource$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelSetupIntentSource", "cancelSetupIntentSource$payments_core_release", "complete3ds2Auth", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "complete3ds2Auth$payments_core_release", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntent$payments_core_release", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntentInternal", "confirmSetupIntent", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntent$payments_core_release", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSignUp", "Lcom/stripe/android/model/ConsumerSession;", "email", "phoneNumber", "country", "name", "locale", "Ljava/util/Locale;", "authSessionCookie", "consentAction", "Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createClientSecretParam", "", "", "createFile", "Lcom/stripe/android/core/model/StripeFile;", "fileParams", "Lcom/stripe/android/core/model/StripeFileParams;", "createFile$payments_core_release", "(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLinkFinancialConnectionsSession", "Lcom/stripe/android/model/FinancialConnectionsSession;", "consumerSessionClientSecret", "createPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "paymentDetailsCreateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;", "(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financialConnectionsAccountId", "createPaymentIntentFinancialConnectionsSession", "params", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "createPaymentIntentFinancialConnectionsSession$payments_core_release", "(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRadarSession", "Lcom/stripe/android/model/RadarSession;", "createRadarSession$payments_core_release", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSetupIntentFinancialConnectionsSession", "createSetupIntentFinancialConnectionsSession$payments_core_release", "createSource", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "createSource$payments_core_release", "(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createToken", "Lcom/stripe/android/model/Token;", "tokenParams", "Lcom/stripe/android/model/TokenParams;", "createToken$payments_core_release", "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomerSource", "deleteCustomerSource$payments_core_release", "deletePaymentDetails", "", "paymentDetailsId", "detachPaymentMethod", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableDnsCache", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "fetchStripeModel", "ModelType", "Lcom/stripe/android/core/model/StripeModel;", "apiRequest", "Lcom/stripe/android/core/networking/ApiRequest;", "jsonParser", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "onResponse", "(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fireAnalyticsRequest", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "fireAnalyticsRequest$payments_core_release", "event", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "fireFraudDetectionDataRequest", "getCardMetadata", "Lcom/stripe/android/model/CardMetadata;", "bin", "Lcom/stripe/android/cards/Bin;", "getCardMetadata$payments_core_release", "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetachPaymentMethodUrl", "getDetachPaymentMethodUrl$payments_core_release", "getFpxBankStatus", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatus$payments_core_release", "getPaymentIntentFinancialConnectionsSessionUrl", "getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release", "getPaymentMethods", "listPaymentMethodsParams", "Lcom/stripe/android/model/ListPaymentMethodsParams;", "(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSetupIntentFinancialConnectionsSessionUrl", "getSetupIntentFinancialConnectionsSessionUrl$payments_core_release", "handleApiError", "response", "Lcom/stripe/android/core/networking/StripeResponse;", "listPaymentDetails", "paymentMethodTypes", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logoutConsumer", "makeApiRequest", "makeApiRequest$payments_core_release", "(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeFileUploadRequest", "fileUploadRequest", "Lcom/stripe/android/core/networking/FileUploadRequest;", "Lkotlin/Function1;", "Lcom/stripe/android/core/networking/RequestId;", "makeFileUploadRequest$payments_core_release", "(Lcom/stripe/android/core/networking/FileUploadRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maybeAddPaymentUserAgent", "refreshPaymentIntent", "refreshPaymentIntent$payments_core_release", "resetDnsCache", "dnsCacheData", "retrieveCardMetadata", "cardNumber", "retrieveCustomer", "Lcom/stripe/android/model/Customer;", "retrieveElementsSession", "Lcom/stripe/android/model/ElementsSession;", "Lcom/stripe/android/model/ElementsSessionParams;", "(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analyticsEvent", "(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveIssuingCardPin", "cardId", "verificationId", "userOneTimeCode", "retrieveIssuingCardPin$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveObject", "url", "retrieveObject$payments_core_release", "retrievePaymentIntent", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrievePaymentMethodMessage", "Lcom/stripe/android/model/PaymentMethodMessage;", "paymentMethods", "amount", "", "currency", "logoColor", "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSetupIntent", "retrieveSource", "retrieveSource$payments_core_release", "retrieveStripeIntent", "Lcom/stripe/android/model/StripeIntent;", "retrieveStripeIntent$payments_core_release", "setCustomerShippingInfo", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "setCustomerShippingInfo$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultCustomerSource", "setDefaultCustomerSource$payments_core_release", "start3ds2Auth", "authParams", "Lcom/stripe/android/model/Stripe3ds2AuthParams;", "start3ds2Auth$payments_core_release", "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateIssuingCardPin", "newPin", "updateIssuingCardPin$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentDetails", "paymentDetailsUpdateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyPaymentIntentWithMicrodeposits", "firstAmount", "secondAmount", "(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "descriptorCode", "verifySetupIntentWithMicrodeposits", "maybeForDashboard", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "DnsCacheData", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nStripeApiRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeApiRepository.kt\ncom/stripe/android/networking/StripeApiRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2166:1\n1549#2:2167\n1620#2,3:2168\n1559#2:2172\n1590#2,4:2173\n1#3:2171\n*S KotlinDebug\n*F\n+ 1 StripeApiRepository.kt\ncom/stripe/android/networking/StripeApiRepository\n*L\n134#1:2167\n134#1:2168,3\n1567#1:2172\n1567#1:2173,4\n*E\n"})
/* loaded from: classes7.dex */
public final class StripeApiRepository extends StripeRepository {
    private static final String DNS_CACHE_TTL_PROPERTY_NAME = "networkaddress.cache.ttl";
    private static final String PAYMENT_USER_AGENT = "payment_user_agent";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final ApiRequest.Factory apiRequestFactory;
    private final AppInfo appInfo;
    private final CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory;
    private final Context context;
    private final FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils;
    private final FraudDetectionDataRepository fraudDetectionDataRepository;
    private final Logger logger;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final Set<String> productUsageTokens;
    private final Function0<String> publishableKeyProvider;
    private final StripeNetworkClient stripeNetworkClient;
    private final CoroutineContext workContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.networking.StripeApiRepository$2", m28418f = "StripeApiRepository.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.networking.StripeApiRepository$2 */
    /* loaded from: classes7.dex */
    public static final class C190932 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C190932(Continuation<? super C190932> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190932(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C190932) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HttpResponseCache.install(new File(StripeApiRepository.this.context.getCacheDir(), "stripe_api_repository_cache"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b/\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00190\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0002J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002J)\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010$\"\u00020\u0001H\u0002¢\u0006\u0002\u0010%J\u001d\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0001¢\u0006\u0002\b)J\u001d\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0001¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0001¢\u0006\u0002\b/J\u0015\u00100\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0001¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0001¢\u0006\u0002\b3J\u0015\u00104\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0001¢\u0006\u0002\b5J\u0015\u00106\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0001¢\u0006\u0002\b7J\u0015\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0007J\u001d\u0010:\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0001¢\u0006\u0002\b<J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u0015\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0001¢\u0006\u0002\b@J\u0015\u0010A\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0001¢\u0006\u0002\bBJ\u0015\u0010C\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0002\bDJ\u0015\u0010E\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0001¢\u0006\u0002\bFJ\u0015\u0010G\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0001¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0001¢\u0006\u0002\bJJ\u0015\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0004H\u0001¢\u0006\u0002\bMJ\u0015\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0004H\u0001¢\u0006\u0002\bPJ\u0015\u0010Q\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0004H\u0001¢\u0006\u0002\bRR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\b¨\u0006S"}, m28432d2 = {"Lcom/stripe/android/networking/StripeApiRepository$Companion;", "", "()V", "DNS_CACHE_TTL_PROPERTY_NAME", "", "PAYMENT_USER_AGENT", "consumerPaymentDetailsUrl", "getConsumerPaymentDetailsUrl$payments_core_release", "()Ljava/lang/String;", "consumerSignUpUrl", "getConsumerSignUpUrl$payments_core_release", "linkFinancialConnectionsSessionUrl", "getLinkFinancialConnectionsSessionUrl$payments_core_release", "listConsumerPaymentDetailsUrl", "getListConsumerPaymentDetailsUrl$payments_core_release", "logoutConsumerUrl", "getLogoutConsumerUrl$payments_core_release", "paymentMethodsUrl", "getPaymentMethodsUrl$payments_core_release", "sourcesUrl", "getSourcesUrl$payments_core_release", "tokensUrl", "getTokensUrl$payments_core_release", "createExpandParam", "", "", "expandFields", "createVerificationParam", "verificationId", "userOneTimeCode", "getAddCustomerSourceUrl", "customerId", "getAddCustomerSourceUrl$payments_core_release", "getApiUrl", "path", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "getAttachFinancialConnectionsSessionToPaymentIntentUrl", "paymentIntentId", "financialConnectionsSessionId", "getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release", "getAttachFinancialConnectionsSessionToSetupIntentUrl", "setupIntentId", "getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release", "getAttachPaymentMethodUrl", "paymentMethodId", "getAttachPaymentMethodUrl$payments_core_release", "getCancelPaymentIntentSourceUrl", "getCancelPaymentIntentSourceUrl$payments_core_release", "getCancelSetupIntentSourceUrl", "getCancelSetupIntentSourceUrl$payments_core_release", "getConfirmPaymentIntentUrl", "getConfirmPaymentIntentUrl$payments_core_release", "getConfirmSetupIntentUrl", "getConfirmSetupIntentUrl$payments_core_release", "getConsumerPaymentDetailsUrl", "paymentDetailsId", "getDeleteCustomerSourceUrl", "sourceId", "getDeleteCustomerSourceUrl$payments_core_release", "getEdgeUrl", "getIssuingCardPinUrl", "cardId", "getIssuingCardPinUrl$payments_core_release", "getRefreshPaymentIntentUrl", "getRefreshPaymentIntentUrl$payments_core_release", "getRetrieveCustomerUrl", "getRetrieveCustomerUrl$payments_core_release", "getRetrievePaymentIntentUrl", "getRetrievePaymentIntentUrl$payments_core_release", "getRetrieveSetupIntentUrl", "getRetrieveSetupIntentUrl$payments_core_release", "getRetrieveSourceApiUrl", "getRetrieveSourceApiUrl$payments_core_release", "getRetrieveTokenApiUrl", "tokenId", "getRetrieveTokenApiUrl$payments_core_release", "getVerifyMicrodepositsOnPaymentIntentUrl", "clientSecret", "getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release", "getVerifyMicrodepositsOnSetupIntentUrl", "getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nStripeApiRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeApiRepository.kt\ncom/stripe/android/networking/StripeApiRepository$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2166:1\n1#2:2167\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, List<String>> createExpandParam(List<String> list) {
            Map<String, List<String>> emptyMap;
            Map<String, List<String>> map = null;
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("expand", list));
            }
            if (map == null) {
                emptyMap = MapsKt__MapsKt.emptyMap();
                return emptyMap;
            }
            return map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, String> createVerificationParam(String str, String str2) {
            Map<String, String> mapOf;
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("id", str), TuplesKt.m28425to("one_time_code", str2));
            return mapOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getApiUrl(String str, Object... objArr) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.ENGLISH;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
            return getApiUrl(format);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEdgeUrl(String str) {
            String api_host = ApiRequest.Companion.getAPI_HOST();
            return api_host + "/edge-internal/" + str;
        }

        public final /* synthetic */ String getAddCustomerSourceUrl$payments_core_release(String customerId) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            return getApiUrl("customers/%s/sources", customerId);
        }

        /* renamed from: getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release */
        public final /* synthetic */ String m45464x3818cccc(String paymentIntentId, String financialConnectionsSessionId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
            return getApiUrl("payment_intents/%s/link_account_sessions/%s/attach", paymentIntentId, financialConnectionsSessionId);
        }

        /* renamed from: getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release */
        public final /* synthetic */ String m45463x1508b7f5(String setupIntentId, String financialConnectionsSessionId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
            return getApiUrl("setup_intents/%s/link_account_sessions/%s/attach", setupIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String getAttachPaymentMethodUrl$payments_core_release(String paymentMethodId) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            return getApiUrl("payment_methods/%s/attach", paymentMethodId);
        }

        public final /* synthetic */ String getCancelPaymentIntentSourceUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/source_cancel", paymentIntentId);
        }

        public final /* synthetic */ String getCancelSetupIntentSourceUrl$payments_core_release(String setupIntentId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s/source_cancel", setupIntentId);
        }

        public final /* synthetic */ String getConfirmPaymentIntentUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/confirm", paymentIntentId);
        }

        public final /* synthetic */ String getConfirmSetupIntentUrl$payments_core_release(String setupIntentId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s/confirm", setupIntentId);
        }

        public final /* synthetic */ String getConsumerPaymentDetailsUrl$payments_core_release() {
            return getApiUrl("consumers/payment_details");
        }

        public final /* synthetic */ String getConsumerSignUpUrl$payments_core_release() {
            return getApiUrl("consumers/accounts/sign_up");
        }

        public final /* synthetic */ String getDeleteCustomerSourceUrl$payments_core_release(String customerId, String sourceId) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return getApiUrl("customers/%s/sources/%s", customerId, sourceId);
        }

        public final /* synthetic */ String getIssuingCardPinUrl$payments_core_release(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return getApiUrl("issuing/cards/%s/pin", cardId);
        }

        public final /* synthetic */ String getLinkFinancialConnectionsSessionUrl$payments_core_release() {
            return getApiUrl("consumers/link_account_sessions");
        }

        public final /* synthetic */ String getListConsumerPaymentDetailsUrl$payments_core_release() {
            return getApiUrl("consumers/payment_details/list");
        }

        public final /* synthetic */ String getLogoutConsumerUrl$payments_core_release() {
            return getApiUrl("consumers/sessions/log_out");
        }

        public final /* synthetic */ String getPaymentMethodsUrl$payments_core_release() {
            return getApiUrl("payment_methods");
        }

        public final /* synthetic */ String getRefreshPaymentIntentUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String getRetrieveCustomerUrl$payments_core_release(String customerId) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            return getApiUrl("customers/%s", customerId);
        }

        public final /* synthetic */ String getRetrievePaymentIntentUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s", paymentIntentId);
        }

        public final /* synthetic */ String getRetrieveSetupIntentUrl$payments_core_release(String setupIntentId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s", setupIntentId);
        }

        public final /* synthetic */ String getRetrieveSourceApiUrl$payments_core_release(String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return getApiUrl("sources/%s", sourceId);
        }

        public final /* synthetic */ String getRetrieveTokenApiUrl$payments_core_release(String tokenId) {
            Intrinsics.checkNotNullParameter(tokenId, "tokenId");
            return getApiUrl("tokens/%s", tokenId);
        }

        public final /* synthetic */ String getSourcesUrl$payments_core_release() {
            return getApiUrl("sources");
        }

        public final /* synthetic */ String getTokensUrl$payments_core_release() {
            return getApiUrl("tokens");
        }

        public final /* synthetic */ String getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return getApiUrl("payment_intents/%s/verify_microdeposits", clientSecret);
        }

        public final /* synthetic */ String getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return getApiUrl("setup_intents/%s/verify_microdeposits", clientSecret);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getApiUrl(String str) {
            String api_host = ApiRequest.Companion.getAPI_HOST();
            return api_host + "/v1/" + str;
        }

        public final /* synthetic */ String getConsumerPaymentDetailsUrl$payments_core_release(String paymentDetailsId) {
            Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
            return getApiUrl("consumers/payment_details/" + paymentDetailsId);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "", "()V", "Failure", "Success", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class DnsCacheData {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Failure extends DnsCacheData {
            public static final int $stable = 0;
            public static final Failure INSTANCE = new Failure();

            private Failure() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "originalDnsCacheTtl", "", "(Ljava/lang/String;)V", "getOriginalDnsCacheTtl", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Success extends DnsCacheData {
            public static final int $stable = 0;
            private final String originalDnsCacheTtl;

            public Success(String str) {
                super(null);
                this.originalDnsCacheTtl = str;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.originalDnsCacheTtl;
                }
                return success.copy(str);
            }

            public final String component1() {
                return this.originalDnsCacheTtl;
            }

            public final Success copy(String str) {
                return new Success(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.areEqual(this.originalDnsCacheTtl, ((Success) obj).originalDnsCacheTtl);
            }

            public final String getOriginalDnsCacheTtl() {
                return this.originalDnsCacheTtl;
            }

            public int hashCode() {
                String str = this.originalDnsCacheTtl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.originalDnsCacheTtl;
                return "Success(originalDnsCacheTtl=" + str + ")";
            }
        }

        public /* synthetic */ DnsCacheData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DnsCacheData() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider) {
        this(context, publishableKeyProvider, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
    }

    private final Pair<String, String> buildPaymentUserAgentPair(Set<String> set) {
        Set of;
        Set plus;
        Set plus2;
        String joinToString$default;
        of = SetsKt__SetsJVMKt.setOf("stripe-android/20.21.0");
        plus = SetsKt___SetsKt.plus(of, (Iterable) this.productUsageTokens);
        plus2 = SetsKt___SetsKt.plus(plus, (Iterable) set);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(plus2, ";", null, null, 0, null, null, 62, null);
        return TuplesKt.m28425to(PAYMENT_USER_AGENT, joinToString$default);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair buildPaymentUserAgentPair$default(StripeApiRepository stripeApiRepository, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = SetsKt__SetsKt.emptySet();
        }
        return stripeApiRepository.buildPaymentUserAgentPair(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object confirmPaymentIntentInternal(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super PaymentIntent> continuation) {
        Map<String, ?> plus;
        FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils = this.fraudDetectionDataParamsUtils;
        Map<String, Object> paramMap = confirmPaymentIntentParams.toParamMap();
        if (options.getApiKeyIsUserKey()) {
            paramMap = MapsKt__MapsKt.minus(paramMap, "client_secret");
        }
        Map<String, Object> maybeAddPaymentUserAgent = maybeAddPaymentUserAgent(paramMap, confirmPaymentIntentParams.getPaymentMethodCreateParams(), confirmPaymentIntentParams.getSourceParams());
        Companion companion = Companion;
        plus = MapsKt__MapsKt.plus(maybeAddPaymentUserAgent, companion.createExpandParam(list));
        Map<String, ?> addFraudDetectionData$payments_core_release = fraudDetectionDataParamsUtils.addFraudDetectionData$payments_core_release(plus, getFraudDetectionData());
        String confirmPaymentIntentUrl$payments_core_release = companion.getConfirmPaymentIntentUrl$payments_core_release(new PaymentIntent.ClientSecret(confirmPaymentIntentParams.getClientSecret()).getPaymentIntentId$payments_core_release());
        fireFraudDetectionDataRequest();
        return fetchStripeModel(ApiRequest.Factory.createPost$default(this.apiRequestFactory, confirmPaymentIntentUrl$payments_core_release, options, addFraudDetectionData$payments_core_release, false, 8, null), new PaymentIntentJsonParser(null, 1, null), new StripeApiRepository$confirmPaymentIntentInternal$2(confirmPaymentIntentParams, this), continuation);
    }

    private final Map<String, Object> createClientSecretParam(String str, List<String> list) {
        Map mapOf;
        Map<String, Object> plus;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("client_secret", str));
        plus = MapsKt__MapsKt.plus(mapOf, Companion.createExpandParam(list));
        return plus;
    }

    private final DnsCacheData disableDnsCache() {
        DnsCacheData.Failure m116783constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String property = Security.getProperty(DNS_CACHE_TTL_PROPERTY_NAME);
            Security.setProperty(DNS_CACHE_TTL_PROPERTY_NAME, "0");
            m116783constructorimpl = Result.m116783constructorimpl(new DnsCacheData.Success(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        DnsCacheData.Failure failure = DnsCacheData.Failure.INSTANCE;
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = failure;
        }
        return (DnsCacheData) m116783constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <ModelType extends StripeModel> Object fetchStripeModel(ApiRequest apiRequest, ModelJsonParser<? extends ModelType> modelJsonParser, Function0<Unit> function0, Continuation<? super ModelType> continuation) {
        StripeApiRepository$fetchStripeModel$1 stripeApiRepository$fetchStripeModel$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof StripeApiRepository$fetchStripeModel$1) {
            stripeApiRepository$fetchStripeModel$1 = (StripeApiRepository$fetchStripeModel$1) continuation;
            int i2 = stripeApiRepository$fetchStripeModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$fetchStripeModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeApiRepository$fetchStripeModel$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$fetchStripeModel$1.label;
                if (i == 0) {
                    if (i == 1) {
                        modelJsonParser = (ModelJsonParser) stripeApiRepository$fetchStripeModel$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    stripeApiRepository$fetchStripeModel$1.L$0 = modelJsonParser;
                    stripeApiRepository$fetchStripeModel$1.label = 1;
                    obj = makeApiRequest$payments_core_release(apiRequest, function0, stripeApiRepository$fetchStripeModel$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return modelJsonParser.parse(ResponseJsonKt.responseJson((StripeResponse) obj));
            }
        }
        stripeApiRepository$fetchStripeModel$1 = new StripeApiRepository$fetchStripeModel$1(this, continuation);
        Object obj2 = stripeApiRepository$fetchStripeModel$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$fetchStripeModel$1.label;
        if (i == 0) {
        }
        return modelJsonParser.parse(ResponseJsonKt.responseJson((StripeResponse) obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireAnalyticsRequest(PaymentAnalyticsEvent paymentAnalyticsEvent) {
        fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, 30, null));
    }

    private final void fireFraudDetectionDataRequest() {
        this.fraudDetectionDataRepository.refresh();
    }

    private final FraudDetectionData getFraudDetectionData() {
        return this.fraudDetectionDataRepository.getCached();
    }

    private final void handleApiError(StripeResponse<String> stripeResponse) throws InvalidRequestException, AuthenticationException, CardException, APIException {
        String str;
        RequestId requestId = stripeResponse.getRequestId();
        if (requestId != null) {
            str = requestId.getValue();
        } else {
            str = null;
        }
        String str2 = str;
        int code = stripeResponse.getCode();
        StripeError withLocalizedMessage = StripeErrorMappingKt.withLocalizedMessage(new StripeErrorJsonParser().parse(ResponseJsonKt.responseJson(stripeResponse)), this.context);
        if (code != 429) {
            switch (code) {
                case 400:
                case Constants.NO_SUCH_BUCKET_STATUS_CODE /* 404 */:
                    throw new InvalidRequestException(withLocalizedMessage, str2, code, null, null, 24, null);
                case 401:
                    throw new AuthenticationException(withLocalizedMessage, str2);
                case 402:
                    throw new CardException(withLocalizedMessage, str2);
                case Constants.BUCKET_ACCESS_FORBIDDEN_STATUS_CODE /* 403 */:
                    throw new PermissionException(withLocalizedMessage, str2);
                default:
                    throw new APIException(withLocalizedMessage, str2, code, null, null, 24, null);
            }
        }
        throw new RateLimitException(withLocalizedMessage, str2, null, null, 12, null);
    }

    private final Map<String, Object> maybeAddPaymentUserAgent(Map<String, ? extends Object> map, PaymentMethodCreateParams paymentMethodCreateParams, SourceParams sourceParams) {
        Map map2;
        Set<String> emptySet;
        Map plus;
        Map<String, Object> plus2;
        Set emptySet2;
        Map plus3;
        Map<String, Object> plus4;
        Object obj = map.get("payment_method_data");
        Map map3 = null;
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            if (paymentMethodCreateParams == null || (emptySet2 = paymentMethodCreateParams.getAttribution$payments_core_release()) == null) {
                emptySet2 = SetsKt__SetsKt.emptySet();
            }
            plus3 = MapsKt__MapsKt.plus(map2, buildPaymentUserAgentPair(emptySet2));
            plus4 = MapsKt__MapsKt.plus(map, TuplesKt.m28425to("payment_method_data", plus3));
            if (plus4 != null) {
                return plus4;
            }
        }
        Object obj2 = map.get(ConfirmPaymentIntentParams.PARAM_SOURCE_DATA);
        if (obj2 instanceof Map) {
            map3 = (Map) obj2;
        }
        if (map3 != null) {
            if (sourceParams == null || (emptySet = sourceParams.getAttribution$payments_core_release()) == null) {
                emptySet = SetsKt__SetsKt.emptySet();
            }
            plus = MapsKt__MapsKt.plus(map3, buildPaymentUserAgentPair(emptySet));
            plus2 = MapsKt__MapsKt.plus(map, TuplesKt.m28425to(ConfirmPaymentIntentParams.PARAM_SOURCE_DATA, plus));
            return plus2;
        }
        return map;
    }

    public static /* synthetic */ Map maybeAddPaymentUserAgent$default(StripeApiRepository stripeApiRepository, Map map, PaymentMethodCreateParams paymentMethodCreateParams, SourceParams sourceParams, int i, Object obj) {
        if ((i & 4) != 0) {
            sourceParams = null;
        }
        return stripeApiRepository.maybeAddPaymentUserAgent(map, paymentMethodCreateParams, sourceParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object maybeForDashboard(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, Continuation<? super ConfirmPaymentIntentParams> continuation) {
        StripeApiRepository$maybeForDashboard$1 stripeApiRepository$maybeForDashboard$1;
        Object coroutine_suspended;
        int i;
        PaymentMethod paymentMethod;
        String str;
        if (continuation instanceof StripeApiRepository$maybeForDashboard$1) {
            stripeApiRepository$maybeForDashboard$1 = (StripeApiRepository$maybeForDashboard$1) continuation;
            int i2 = stripeApiRepository$maybeForDashboard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$maybeForDashboard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeApiRepository$maybeForDashboard$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$maybeForDashboard$1.label;
                if (i == 0) {
                    if (i == 1) {
                        confirmPaymentIntentParams = (ConfirmPaymentIntentParams) stripeApiRepository$maybeForDashboard$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (options.getApiKeyIsUserKey() && confirmPaymentIntentParams.getPaymentMethodCreateParams() != null) {
                        PaymentMethodCreateParams paymentMethodCreateParams = confirmPaymentIntentParams.getPaymentMethodCreateParams();
                        stripeApiRepository$maybeForDashboard$1.L$0 = confirmPaymentIntentParams;
                        stripeApiRepository$maybeForDashboard$1.label = 1;
                        obj = createPaymentMethod(paymentMethodCreateParams, options, stripeApiRepository$maybeForDashboard$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return confirmPaymentIntentParams;
                    }
                }
                paymentMethod = (PaymentMethod) obj;
                if (paymentMethod == null) {
                    str = paymentMethod.f75358id;
                } else {
                    str = null;
                }
                if (str == null) {
                    return ConfirmPaymentIntentParams.Companion.createForDashboard$payments_core_release(confirmPaymentIntentParams.getClientSecret(), str);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        stripeApiRepository$maybeForDashboard$1 = new StripeApiRepository$maybeForDashboard$1(this, continuation);
        Object obj2 = stripeApiRepository$maybeForDashboard$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$maybeForDashboard$1.label;
        if (i == 0) {
        }
        paymentMethod = (PaymentMethod) obj2;
        if (paymentMethod == null) {
        }
        if (str == null) {
        }
    }

    private final void resetDnsCache(DnsCacheData dnsCacheData) {
        if (dnsCacheData instanceof DnsCacheData.Success) {
            String originalDnsCacheTtl = ((DnsCacheData.Success) dnsCacheData).getOriginalDnsCacheTtl();
            if (originalDnsCacheTtl == null) {
                originalDnsCacheTtl = "-1";
            }
            Security.setProperty(DNS_CACHE_TTL_PROPERTY_NAME, originalDnsCacheTtl);
        }
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object addCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, Continuation<? super Source> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String addCustomerSourceUrl$payments_core_release = Companion.getAddCustomerSourceUrl$payments_core_release(str);
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, str3));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, addCustomerSourceUrl$payments_core_release, options, mapOf, false, 8, null), new SourceJsonParser(), new StripeApiRepository$addCustomerSource$2(this, set, str4), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object attachFinancialConnectionsSessionToPaymentIntent(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super PaymentIntent> continuation) {
        Map mapOf;
        Map plus;
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = Companion;
        String m45464x3818cccc = companion.m45464x3818cccc(str2, str3);
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("client_secret", str));
        plus = MapsKt__MapsKt.plus(mapOf, companion.createExpandParam(list));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, m45464x3818cccc, options, plus, false, 8, null), new PaymentIntentJsonParser(null, 1, null), C19094xdc89549d.INSTANCE, continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object attachFinancialConnectionsSessionToSetupIntent(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super SetupIntent> continuation) {
        Map mapOf;
        Map plus;
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = Companion;
        String m45463x1508b7f5 = companion.m45463x1508b7f5(str2, str3);
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("client_secret", str));
        plus = MapsKt__MapsKt.plus(mapOf, companion.createExpandParam(list));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, m45463x1508b7f5, options, plus, false, 8, null), new SetupIntentJsonParser(), C19095x126ea554.INSTANCE, continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object attachPaymentMethod(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, Continuation<? super PaymentMethod> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        Map mapOf;
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String attachPaymentMethodUrl$payments_core_release = Companion.getAttachPaymentMethodUrl$payments_core_release(str3);
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PaymentSheetEvent.FIELD_CUSTOMER, str));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, attachPaymentMethodUrl$payments_core_release, options, mapOf, false, 8, null), new PaymentMethodJsonParser(), new StripeApiRepository$attachPaymentMethod$2(this, set), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object cancelPaymentIntentSource$payments_core_release(String str, String str2, ApiRequest.Options options, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Map mapOf;
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String cancelPaymentIntentSourceUrl$payments_core_release = Companion.getCancelPaymentIntentSourceUrl$payments_core_release(str);
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, str2));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, cancelPaymentIntentSourceUrl$payments_core_release, options, mapOf, false, 8, null), new PaymentIntentJsonParser(null, 1, null), new StripeApiRepository$cancelPaymentIntentSource$2(this), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object cancelSetupIntentSource$payments_core_release(String str, String str2, ApiRequest.Options options, Continuation<? super SetupIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String cancelSetupIntentSourceUrl$payments_core_release = Companion.getCancelSetupIntentSourceUrl$payments_core_release(str);
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, str2));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, cancelSetupIntentSourceUrl$payments_core_release, options, mapOf, false, 8, null), new SetupIntentJsonParser(), new StripeApiRepository$cancelSetupIntentSource$2(this), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object complete3ds2Auth$payments_core_release(String str, ApiRequest.Options options, Continuation<? super Stripe3ds2AuthResult> continuation) {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String apiUrl = Companion.getApiUrl("3ds2/challenge_complete");
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, str));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, apiUrl, options, mapOf, false, 8, null), new Stripe3ds2AuthResultJsonParser(), StripeApiRepository$complete3ds2Auth$2.INSTANCE, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r9 
      PHI: (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:21:0x0067, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object confirmPaymentIntent$payments_core_release(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeApiRepository$confirmPaymentIntent$1 stripeApiRepository$confirmPaymentIntent$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        StripeApiRepository stripeApiRepository;
        if (continuation instanceof StripeApiRepository$confirmPaymentIntent$1) {
            stripeApiRepository$confirmPaymentIntent$1 = (StripeApiRepository$confirmPaymentIntent$1) continuation;
            int i2 = stripeApiRepository$confirmPaymentIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$confirmPaymentIntent$1.label = i2 - Integer.MIN_VALUE;
                obj = stripeApiRepository$confirmPaymentIntent$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$confirmPaymentIntent$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    stripeApiRepository = (StripeApiRepository) stripeApiRepository$confirmPaymentIntent$1.L$2;
                    list = (List) stripeApiRepository$confirmPaymentIntent$1.L$1;
                    options = (ApiRequest.Options) stripeApiRepository$confirmPaymentIntent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    stripeApiRepository$confirmPaymentIntent$1.L$0 = options;
                    stripeApiRepository$confirmPaymentIntent$1.L$1 = list;
                    stripeApiRepository$confirmPaymentIntent$1.L$2 = this;
                    stripeApiRepository$confirmPaymentIntent$1.label = 1;
                    obj = maybeForDashboard(confirmPaymentIntentParams, options, stripeApiRepository$confirmPaymentIntent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    stripeApiRepository = this;
                }
                stripeApiRepository$confirmPaymentIntent$1.L$0 = null;
                stripeApiRepository$confirmPaymentIntent$1.L$1 = null;
                stripeApiRepository$confirmPaymentIntent$1.L$2 = null;
                stripeApiRepository$confirmPaymentIntent$1.label = 2;
                obj = stripeApiRepository.confirmPaymentIntentInternal((ConfirmPaymentIntentParams) obj, options, list, stripeApiRepository$confirmPaymentIntent$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return obj;
            }
        }
        stripeApiRepository$confirmPaymentIntent$1 = new StripeApiRepository$confirmPaymentIntent$1(this, continuation);
        obj = stripeApiRepository$confirmPaymentIntent$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$confirmPaymentIntent$1.label;
        if (i == 0) {
        }
        stripeApiRepository$confirmPaymentIntent$1.L$0 = null;
        stripeApiRepository$confirmPaymentIntent$1.L$1 = null;
        stripeApiRepository$confirmPaymentIntent$1.L$2 = null;
        stripeApiRepository$confirmPaymentIntent$1.label = 2;
        obj = stripeApiRepository.confirmPaymentIntentInternal((ConfirmPaymentIntentParams) obj, options, list, stripeApiRepository$confirmPaymentIntent$1);
        if (obj != coroutine_suspended) {
        }
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object confirmSetupIntent$payments_core_release(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super SetupIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Map<String, ?> plus;
        String setupIntentId$payments_core_release = new SetupIntent.ClientSecret(confirmSetupIntentParams.getClientSecret()).getSetupIntentId$payments_core_release();
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = Companion;
        String confirmSetupIntentUrl$payments_core_release = companion.getConfirmSetupIntentUrl$payments_core_release(setupIntentId$payments_core_release);
        FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils = this.fraudDetectionDataParamsUtils;
        plus = MapsKt__MapsKt.plus(maybeAddPaymentUserAgent$default(this, confirmSetupIntentParams.toParamMap(), confirmSetupIntentParams.getPaymentMethodCreateParams$payments_core_release(), null, 4, null), companion.createExpandParam(list));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, confirmSetupIntentUrl$payments_core_release, options, fraudDetectionDataParamsUtils.addFraudDetectionData$payments_core_release(plus, getFraudDetectionData()), false, 8, null), new SetupIntentJsonParser(), new StripeApiRepository$confirmSetupIntent$2(this, confirmSetupIntentParams), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
        r7 = kotlin.collections.MapsKt__MapsJVMKt.mapOf(kotlin.TuplesKt.m28425to("legal_name", r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0067, code lost:
        if (r7 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0073, code lost:
        r7 = kotlin.collections.MapsKt__MapsJVMKt.mapOf(kotlin.TuplesKt.m28425to("locale", r10.toLanguageTag()));
     */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object consumerSignUp(String str, String str2, String str3, String str4, Locale locale, String str5, ConsumerSignUpConsentAction consumerSignUpConsentAction, ApiRequest.Options options, Continuation<? super ConsumerSession> continuation) {
        Map mapOf;
        Map emptyMap;
        Map plus;
        Map emptyMap2;
        Map plus2;
        Map emptyMap3;
        Map plus3;
        List listOf;
        Map mapOf2;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerSignUpUrl$payments_core_release = Companion.getConsumerSignUpUrl$payments_core_release();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.m28425to("email_address", lowerCase), TuplesKt.m28425to("phone_number", str2), TuplesKt.m28425to("country", str3), TuplesKt.m28425to("consent_action", consumerSignUpConsentAction.getValue()));
        if (str5 != null) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(str5);
            mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("verification_session_client_secrets", listOf));
            emptyMap = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("cookies", mapOf2));
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        plus = MapsKt__MapsKt.plus(mapOf, emptyMap);
        if (locale == null || emptyMap2 == null) {
            emptyMap2 = MapsKt__MapsKt.emptyMap();
        }
        plus2 = MapsKt__MapsKt.plus(plus, emptyMap2);
        if (str4 == null || emptyMap3 == null) {
            emptyMap3 = MapsKt__MapsKt.emptyMap();
        }
        plus3 = MapsKt__MapsKt.plus(plus2, emptyMap3);
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, consumerSignUpUrl$payments_core_release, options, plus3, false, 8, null), new ConsumerSessionJsonParser(), StripeApiRepository$consumerSignUp$5.INSTANCE, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createFile$payments_core_release(StripeFileParams stripeFileParams, ApiRequest.Options options, Continuation<? super StripeFile> continuation) {
        StripeApiRepository$createFile$1 stripeApiRepository$createFile$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof StripeApiRepository$createFile$1) {
            stripeApiRepository$createFile$1 = (StripeApiRepository$createFile$1) continuation;
            int i2 = stripeApiRepository$createFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createFile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeApiRepository$createFile$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$createFile$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    FileUploadRequest fileUploadRequest = new FileUploadRequest(stripeFileParams, options, this.appInfo, null, 8, null);
                    Function1<? super RequestId, Unit> stripeApiRepository$createFile$response$1 = new StripeApiRepository$createFile$response$1(this);
                    stripeApiRepository$createFile$1.label = 1;
                    obj = makeFileUploadRequest$payments_core_release(fileUploadRequest, stripeApiRepository$createFile$response$1, stripeApiRepository$createFile$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return new StripeFileJsonParser().parse(ResponseJsonKt.responseJson((StripeResponse) obj));
            }
        }
        stripeApiRepository$createFile$1 = new StripeApiRepository$createFile$1(this, continuation);
        Object obj2 = stripeApiRepository$createFile$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$createFile$1.label;
        if (i == 0) {
        }
        return new StripeFileJsonParser().parse(ResponseJsonKt.responseJson((StripeResponse) obj2));
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createLinkFinancialConnectionsSession(String str, ApiRequest.Options options, Continuation<? super FinancialConnectionsSession> continuation) {
        Map mapOf;
        Map mapOf2;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String linkFinancialConnectionsSessionUrl$payments_core_release = Companion.getLinkFinancialConnectionsSessionUrl$payments_core_release();
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("consumer_session_client_secret", str));
        mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.m28425to("credentials", mapOf));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, linkFinancialConnectionsSessionUrl$payments_core_release, options, mapOf2, false, 8, null), new FinancialConnectionsSessionJsonParser(), StripeApiRepository$createLinkFinancialConnectionsSession$2.INSTANCE, continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createPaymentDetails(String str, String str2, ApiRequest.Options options, Continuation<? super ConsumerPaymentDetails> continuation) {
        Map mapOf;
        Map mapOf2;
        Map mapOf3;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerPaymentDetailsUrl$payments_core_release = Companion.getConsumerPaymentDetailsUrl$payments_core_release();
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("consumer_session_client_secret", str));
        mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("account", str2));
        mapOf3 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.m28425to("credentials", mapOf), TuplesKt.m28425to("type", ConsumerPaymentDetails.BankAccount.type), TuplesKt.m28425to(ConsumerPaymentDetails.BankAccount.type, mapOf2), TuplesKt.m28425to("is_default", Boxing.boxBoolean(true)));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, consumerPaymentDetailsUrl$payments_core_release, options, mapOf3, false, 8, null), new ConsumerPaymentDetailsJsonParser(), StripeApiRepository$createPaymentDetails$2.INSTANCE, continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createPaymentIntentFinancialConnectionsSession$payments_core_release */
    public Object mo45462x3a63d1f9(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super FinancialConnectionsSession> continuation) {
        return fetchStripeModel(ApiRequest.Factory.createPost$default(this.apiRequestFactory, m45466x96f9dba6(str), options, createFinancialConnectionsSessionParams.toMap(), false, 8, null), new FinancialConnectionsSessionJsonParser(), C19096x68e7465f.INSTANCE, continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, ApiRequest.Options options, Continuation<? super PaymentMethod> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Map plus;
        Map<String, String> map;
        Map plus2;
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String paymentMethodsUrl$payments_core_release = Companion.getPaymentMethodsUrl$payments_core_release();
        plus = MapsKt__MapsKt.plus(paymentMethodCreateParams.toParamMap(), buildPaymentUserAgentPair(paymentMethodCreateParams.getAttribution$payments_core_release()));
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        if (fraudDetectionData != null) {
            map = fraudDetectionData.getParams();
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        plus2 = MapsKt__MapsKt.plus(plus, map);
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, paymentMethodsUrl$payments_core_release, options, plus2, false, 8, null), new PaymentMethodJsonParser(), new StripeApiRepository$createPaymentMethod$2(this, paymentMethodCreateParams), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #1 {all -> 0x0041, blocks: (B:16:0x003d, B:28:0x0062, B:29:0x0069, B:30:0x0074), top: B:48:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:16:0x003d, B:28:0x0062, B:29:0x0069, B:30:0x0074), top: B:48:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createRadarSession$payments_core_release(ApiRequest.Options options, Continuation<? super RadarSession> continuation) {
        StripeApiRepository$createRadarSession$1 stripeApiRepository$createRadarSession$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        StripeApiRepository stripeApiRepository;
        Object m116783constructorimpl;
        Map plus;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof StripeApiRepository$createRadarSession$1) {
            stripeApiRepository$createRadarSession$1 = (StripeApiRepository$createRadarSession$1) continuation;
            int i2 = stripeApiRepository$createRadarSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createRadarSession$1.label = i2 - Integer.MIN_VALUE;
                obj = stripeApiRepository$createRadarSession$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$createRadarSession$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            m116783constructorimpl = (RadarSession) obj;
                            Object m116783constructorimpl2 = Result.m116783constructorimpl(m116783constructorimpl);
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
                            if (m116786exceptionOrNullimpl != null) {
                                return m116783constructorimpl2;
                            }
                            throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    options = (ApiRequest.Options) stripeApiRepository$createRadarSession$1.L$1;
                    stripeApiRepository = (StripeApiRepository) stripeApiRepository$createRadarSession$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        ApiRequest.Options options2 = options;
                        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                        }
                        Object m116783constructorimpl22 = Result.m116783constructorimpl(m116783constructorimpl);
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl22);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        if (Stripe.Companion.getAdvancedFraudSignalsEnabled()) {
                            FraudDetectionDataRepository fraudDetectionDataRepository = this.fraudDetectionDataRepository;
                            stripeApiRepository$createRadarSession$1.L$0 = this;
                            stripeApiRepository$createRadarSession$1.L$1 = options;
                            stripeApiRepository$createRadarSession$1.label = 1;
                            obj = fraudDetectionDataRepository.getLatest(stripeApiRepository$createRadarSession$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            stripeApiRepository = this;
                        } else {
                            throw new IllegalArgumentException("Stripe.advancedFraudSignalsEnabled must be set to 'true' to create a Radar Session.".toString());
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        stripeApiRepository = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        ApiRequest.Options options22 = options;
                        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                        }
                        Object m116783constructorimpl222 = Result.m116783constructorimpl(m116783constructorimpl);
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl222);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                    }
                }
                if (obj == null) {
                    m116783constructorimpl = Result.m116783constructorimpl((FraudDetectionData) obj);
                    ApiRequest.Options options222 = options;
                    if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                        plus = MapsKt__MapsKt.plus(((FraudDetectionData) m116783constructorimpl).getParams(), buildPaymentUserAgentPair$default(stripeApiRepository, null, 1, null));
                        ApiRequest createPost$default = ApiRequest.Factory.createPost$default(stripeApiRepository.apiRequestFactory, Companion.getApiUrl("radar/session"), options222, plus, false, 8, null);
                        RadarSessionJsonParser radarSessionJsonParser = new RadarSessionJsonParser();
                        StripeApiRepository$createRadarSession$3$1 stripeApiRepository$createRadarSession$3$1 = new StripeApiRepository$createRadarSession$3$1(stripeApiRepository);
                        stripeApiRepository$createRadarSession$1.L$0 = null;
                        stripeApiRepository$createRadarSession$1.L$1 = null;
                        stripeApiRepository$createRadarSession$1.label = 2;
                        obj = stripeApiRepository.fetchStripeModel(createPost$default, radarSessionJsonParser, stripeApiRepository$createRadarSession$3$1, stripeApiRepository$createRadarSession$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        m116783constructorimpl = (RadarSession) obj;
                    }
                    Object m116783constructorimpl2222 = Result.m116783constructorimpl(m116783constructorimpl);
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2222);
                    if (m116786exceptionOrNullimpl != null) {
                    }
                } else {
                    throw new IllegalArgumentException("Could not obtain fraud data required to create a Radar Session.".toString());
                }
            }
        }
        stripeApiRepository$createRadarSession$1 = new StripeApiRepository$createRadarSession$1(this, continuation);
        obj = stripeApiRepository$createRadarSession$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$createRadarSession$1.label;
        if (i == 0) {
        }
        if (obj == null) {
        }
    }

    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createSetupIntentFinancialConnectionsSession$payments_core_release */
    public Object mo45461x9b93a6a2(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super FinancialConnectionsSession> continuation) {
        return fetchStripeModel(ApiRequest.Factory.createPost$default(this.apiRequestFactory, m45465x5bc85bdd(str), options, createFinancialConnectionsSessionParams.toMap(), false, 8, null), new FinancialConnectionsSessionJsonParser(), C19097x3fe640c8.INSTANCE, continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createSource$payments_core_release(SourceParams sourceParams, ApiRequest.Options options, Continuation<? super Source> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Map plus;
        Map<String, String> map;
        Map plus2;
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String sourcesUrl$payments_core_release = Companion.getSourcesUrl$payments_core_release();
        plus = MapsKt__MapsKt.plus(sourceParams.toParamMap(), buildPaymentUserAgentPair(sourceParams.getAttribution$payments_core_release()));
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        if (fraudDetectionData != null) {
            map = fraudDetectionData.getParams();
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        plus2 = MapsKt__MapsKt.plus(plus, map);
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, sourcesUrl$payments_core_release, options, plus2, false, 8, null), new SourceJsonParser(), new StripeApiRepository$createSource$2(this, sourceParams), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createToken$payments_core_release(TokenParams tokenParams, ApiRequest.Options options, Continuation<? super Token> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Map plus;
        Map<String, String> map;
        Map plus2;
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String tokensUrl$payments_core_release = Companion.getTokensUrl$payments_core_release();
        plus = MapsKt__MapsKt.plus(tokenParams.toParamMap(), buildPaymentUserAgentPair(tokenParams.getAttribution()));
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        if (fraudDetectionData != null) {
            map = fraudDetectionData.getParams();
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        plus2 = MapsKt__MapsKt.plus(plus, map);
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, tokensUrl$payments_core_release, options, plus2, false, 8, null), new TokenJsonParser(), new StripeApiRepository$createToken$2(this, tokenParams), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object deleteCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, Continuation<? super Source> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        return fetchStripeModel(ApiRequest.Factory.createDelete$default(this.apiRequestFactory, Companion.getDeleteCustomerSourceUrl$payments_core_release(str, str3), options, null, 4, null), new SourceJsonParser(), new StripeApiRepository$deleteCustomerSource$2(this, set), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object deletePaymentDetails(String str, String str2, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        Map mapOf;
        Map<String, ?> mapOf2;
        Object coroutine_suspended;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerPaymentDetailsUrl$payments_core_release = Companion.getConsumerPaymentDetailsUrl$payments_core_release(str2);
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("consumer_session_client_secret", str));
        mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.m28425to("credentials", mapOf));
        Object makeApiRequest$payments_core_release = makeApiRequest$payments_core_release(factory.createDelete(consumerPaymentDetailsUrl$payments_core_release, options, mapOf2), StripeApiRepository$deletePaymentDetails$2.INSTANCE, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (makeApiRequest$payments_core_release == coroutine_suspended) {
            return makeApiRequest$payments_core_release;
        }
        return Unit.INSTANCE;
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object detachPaymentMethod(String str, Set<String> set, String str2, ApiRequest.Options options, Continuation<? super PaymentMethod> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        return fetchStripeModel(ApiRequest.Factory.createPost$default(this.apiRequestFactory, getDetachPaymentMethodUrl$payments_core_release(str2), options, null, false, 12, null), new PaymentMethodJsonParser(), new StripeApiRepository$detachPaymentMethod$2(this, set), continuation);
    }

    public final void fireAnalyticsRequest$payments_core_release(AnalyticsRequest params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.analyticsRequestExecutor.executeAsync(params);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCardMetadata$payments_core_release(Bin bin, ApiRequest.Options options, Continuation<? super CardMetadata> continuation) {
        StripeApiRepository$getCardMetadata$1 stripeApiRepository$getCardMetadata$1;
        Object coroutine_suspended;
        int i;
        StripeApiRepository stripeApiRepository;
        Map mapOf;
        Object m116783constructorimpl;
        if (continuation instanceof StripeApiRepository$getCardMetadata$1) {
            stripeApiRepository$getCardMetadata$1 = (StripeApiRepository$getCardMetadata$1) continuation;
            int i2 = stripeApiRepository$getCardMetadata$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$getCardMetadata$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeApiRepository$getCardMetadata$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$getCardMetadata$1.label;
                if (i == 0) {
                    if (i == 1) {
                        stripeApiRepository = (StripeApiRepository) stripeApiRepository$getCardMetadata$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
                            }
                            if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        ApiRequest.Factory factory = this.apiRequestFactory;
                        String edgeUrl = Companion.getEdgeUrl("card-metadata");
                        ApiRequest.Options copy$default = ApiRequest.Options.copy$default(options, null, null, null, 5, null);
                        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("key", options.getApiKey()), TuplesKt.m28425to("bin_prefix", bin.getValue()));
                        ApiRequest createGet$default = ApiRequest.Factory.createGet$default(factory, edgeUrl, copy$default, mapOf, false, 8, null);
                        CardMetadataJsonParser cardMetadataJsonParser = new CardMetadataJsonParser(bin);
                        StripeApiRepository$getCardMetadata$2$1 stripeApiRepository$getCardMetadata$2$1 = StripeApiRepository$getCardMetadata$2$1.INSTANCE;
                        stripeApiRepository$getCardMetadata$1.L$0 = this;
                        stripeApiRepository$getCardMetadata$1.label = 1;
                        obj = fetchStripeModel(createGet$default, cardMetadataJsonParser, stripeApiRepository$getCardMetadata$2$1, stripeApiRepository$getCardMetadata$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stripeApiRepository = this;
                    } catch (Throwable th2) {
                        th = th2;
                        stripeApiRepository = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
                        }
                        if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                        }
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((CardMetadata) obj);
                if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
                    stripeApiRepository.fireAnalyticsRequest(PaymentAnalyticsEvent.CardMetadataLoadFailure);
                }
                if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                    return null;
                }
                return m116783constructorimpl;
            }
        }
        stripeApiRepository$getCardMetadata$1 = new StripeApiRepository$getCardMetadata$1(this, continuation);
        Object obj2 = stripeApiRepository$getCardMetadata$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$getCardMetadata$1.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((CardMetadata) obj2);
        if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
        }
        if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
        }
    }

    public final String getDetachPaymentMethodUrl$payments_core_release(String paymentMethodId) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        return Companion.getApiUrl("payment_methods/%s/detach", paymentMethodId);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|(3:13|14|(2:16|17)(1:19))(2:20|21)))|30|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        r14 = kotlin.Result.Companion;
        r13 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r13));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:11:0x0025, B:19:0x0071, B:21:0x0075, B:22:0x007a, B:23:0x0085, B:16:0x0034), top: B:30:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:11:0x0025, B:19:0x0071, B:21:0x0075, B:22:0x007a, B:23:0x0085, B:16:0x0034), top: B:30:0x0021 }] */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFpxBankStatus$payments_core_release(ApiRequest.Options options, Continuation<? super BankStatuses> continuation) {
        StripeApiRepository$getFpxBankStatus$1 stripeApiRepository$getFpxBankStatus$1;
        Object coroutine_suspended;
        int i;
        Map mapOf;
        BankStatuses bankStatuses;
        if (continuation instanceof StripeApiRepository$getFpxBankStatus$1) {
            stripeApiRepository$getFpxBankStatus$1 = (StripeApiRepository$getFpxBankStatus$1) continuation;
            int i2 = stripeApiRepository$getFpxBankStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$getFpxBankStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeApiRepository$getFpxBankStatus$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$getFpxBankStatus$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    ApiRequest.Factory factory = this.apiRequestFactory;
                    String apiUrl = Companion.getApiUrl("fpx/bank_statuses");
                    ApiRequest.Options copy$default = ApiRequest.Options.copy$default(options, null, null, null, 5, null);
                    mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("account_holder_type", "individual"));
                    ApiRequest createGet$default = ApiRequest.Factory.createGet$default(factory, apiUrl, copy$default, mapOf, false, 8, null);
                    FpxBankStatusesJsonParser fpxBankStatusesJsonParser = new FpxBankStatusesJsonParser();
                    StripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1 stripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1 = new StripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1(this);
                    stripeApiRepository$getFpxBankStatus$1.label = 1;
                    obj = fetchStripeModel(createGet$default, fpxBankStatusesJsonParser, stripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1, stripeApiRepository$getFpxBankStatus$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                bankStatuses = (BankStatuses) obj;
                if (bankStatuses == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(bankStatuses);
                    BankStatuses bankStatuses2 = new BankStatuses(null, 1, null);
                    if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                        return bankStatuses2;
                    }
                    return m116783constructorimpl;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        stripeApiRepository$getFpxBankStatus$1 = new StripeApiRepository$getFpxBankStatus$1(this, continuation);
        Object obj2 = stripeApiRepository$getFpxBankStatus$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$getFpxBankStatus$1.label;
        if (i == 0) {
        }
        bankStatuses = (BankStatuses) obj2;
        if (bankStatuses == null) {
        }
    }

    /* renamed from: getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release */
    public final /* synthetic */ String m45466x96f9dba6(String paymentIntentId) {
        Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
        return Companion.getApiUrl("payment_intents/%s/link_account_sessions", paymentIntentId);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPaymentMethods(ListPaymentMethodsParams listPaymentMethodsParams, String str, Set<String> set, ApiRequest.Options options, Continuation<? super List<PaymentMethod>> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        StripeApiRepository$getPaymentMethods$1 stripeApiRepository$getPaymentMethods$1;
        Object coroutine_suspended;
        int i;
        PaymentMethodsList paymentMethodsList;
        List<PaymentMethod> list;
        List emptyList;
        if (continuation instanceof StripeApiRepository$getPaymentMethods$1) {
            stripeApiRepository$getPaymentMethods$1 = (StripeApiRepository$getPaymentMethods$1) continuation;
            int i2 = stripeApiRepository$getPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$getPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeApiRepository$getPaymentMethods$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$getPaymentMethods$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ApiRequest createGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, Companion.getPaymentMethodsUrl$payments_core_release(), options, listPaymentMethodsParams.toParamMap(), false, 8, null);
                    PaymentMethodsListJsonParser paymentMethodsListJsonParser = new PaymentMethodsListJsonParser();
                    StripeApiRepository$getPaymentMethods$paymentMethodsList$1 stripeApiRepository$getPaymentMethods$paymentMethodsList$1 = new StripeApiRepository$getPaymentMethods$paymentMethodsList$1(this, set);
                    stripeApiRepository$getPaymentMethods$1.label = 1;
                    obj = fetchStripeModel(createGet$default, paymentMethodsListJsonParser, stripeApiRepository$getPaymentMethods$paymentMethodsList$1, stripeApiRepository$getPaymentMethods$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                paymentMethodsList = (PaymentMethodsList) obj;
                if (paymentMethodsList == null) {
                    list = paymentMethodsList.getPaymentMethods();
                } else {
                    list = null;
                }
                if (list != null) {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                    return emptyList;
                }
                return list;
            }
        }
        stripeApiRepository$getPaymentMethods$1 = new StripeApiRepository$getPaymentMethods$1(this, continuation);
        Object obj2 = stripeApiRepository$getPaymentMethods$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$getPaymentMethods$1.label;
        if (i == 0) {
        }
        paymentMethodsList = (PaymentMethodsList) obj2;
        if (paymentMethodsList == null) {
        }
        if (list != null) {
        }
    }

    /* renamed from: getSetupIntentFinancialConnectionsSessionUrl$payments_core_release */
    public final /* synthetic */ String m45465x5bc85bdd(String setupIntentId) {
        Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
        return Companion.getApiUrl("setup_intents/%s/link_account_sessions", setupIntentId);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object listPaymentDetails(String str, Set<String> set, ApiRequest.Options options, Continuation<? super ConsumerPaymentDetails> continuation) {
        Map mapOf;
        List list;
        Map mapOf2;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String listConsumerPaymentDetailsUrl$payments_core_release = Companion.getListConsumerPaymentDetailsUrl$payments_core_release();
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("consumer_session_client_secret", str));
        list = CollectionsKt___CollectionsKt.toList(set);
        mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.m28425to("credentials", mapOf), TuplesKt.m28425to("types", list));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, listConsumerPaymentDetailsUrl$payments_core_release, options, mapOf2, false, 8, null), new ConsumerPaymentDetailsJsonParser(), StripeApiRepository$listPaymentDetails$2.INSTANCE, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
        if (r9 == null) goto L8;
     */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object logoutConsumer(String str, String str2, ApiRequest.Options options, Continuation<? super ConsumerSession> continuation) {
        Map mapOf;
        Map mapOf2;
        Map emptyMap;
        Map plus;
        List listOf;
        Map mapOf3;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String logoutConsumerUrl$payments_core_release = Companion.getLogoutConsumerUrl$payments_core_release();
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("consumer_session_client_secret", str));
        mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.m28425to("credentials", mapOf));
        if (str2 != null) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(str2);
            mapOf3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("verification_session_client_secrets", listOf));
            emptyMap = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("cookies", mapOf3));
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        plus = MapsKt__MapsKt.plus(mapOf2, emptyMap);
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, logoutConsumerUrl$payments_core_release, options, plus, false, 8, null), new ConsumerSessionJsonParser(), StripeApiRepository$logoutConsumer$3.INSTANCE, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(4:9|10|11|12)(2:34|35))(4:36|37|38|(1:40)(1:41))|13|14|15|(4:17|(1:19)|20|21)(2:23|(2:25|26)(1:27))))|45|6|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeApiRequest$payments_core_release(ApiRequest apiRequest, Function0<Unit> function0, Continuation<? super StripeResponse<String>> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        StripeApiRepository$makeApiRequest$1 stripeApiRepository$makeApiRequest$1;
        Object coroutine_suspended;
        int i;
        DnsCacheData disableDnsCache;
        StripeApiRepository stripeApiRepository;
        Object executeRequest;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof StripeApiRepository$makeApiRequest$1) {
            stripeApiRepository$makeApiRequest$1 = (StripeApiRepository$makeApiRequest$1) continuation;
            int i2 = stripeApiRepository$makeApiRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$makeApiRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeApiRepository$makeApiRequest$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$makeApiRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        DnsCacheData dnsCacheData = (DnsCacheData) stripeApiRepository$makeApiRequest$1.L$3;
                        function0 = (Function0) stripeApiRepository$makeApiRequest$1.L$2;
                        ApiRequest apiRequest2 = (ApiRequest) stripeApiRepository$makeApiRequest$1.L$1;
                        StripeApiRepository stripeApiRepository2 = (StripeApiRepository) stripeApiRepository$makeApiRequest$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            disableDnsCache = dnsCacheData;
                            apiRequest = apiRequest2;
                            stripeApiRepository = stripeApiRepository2;
                            executeRequest = obj;
                        } catch (Throwable th) {
                            disableDnsCache = dnsCacheData;
                            apiRequest = apiRequest2;
                            stripeApiRepository = stripeApiRepository2;
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            function0.invoke();
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl == null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    disableDnsCache = disableDnsCache();
                    try {
                        Result.Companion companion2 = Result.Companion;
                        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
                        stripeApiRepository$makeApiRequest$1.L$0 = this;
                        stripeApiRepository$makeApiRequest$1.L$1 = apiRequest;
                        stripeApiRepository$makeApiRequest$1.L$2 = function0;
                        stripeApiRepository$makeApiRequest$1.L$3 = disableDnsCache;
                        stripeApiRepository$makeApiRequest$1.label = 1;
                        executeRequest = stripeNetworkClient.executeRequest(apiRequest, stripeApiRepository$makeApiRequest$1);
                        if (executeRequest == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stripeApiRepository = this;
                    } catch (Throwable th2) {
                        th = th2;
                        stripeApiRepository = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        function0.invoke();
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl == null) {
                        }
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((StripeResponse) executeRequest);
                function0.invoke();
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl == null) {
                    StripeResponse<String> stripeResponse = (StripeResponse) m116783constructorimpl;
                    if (stripeResponse.isError()) {
                        stripeApiRepository.handleApiError(stripeResponse);
                    }
                    stripeApiRepository.resetDnsCache(disableDnsCache);
                    return stripeResponse;
                } else if (m116786exceptionOrNullimpl instanceof IOException) {
                    throw APIConnectionException.Companion.create((IOException) m116786exceptionOrNullimpl, apiRequest.getBaseUrl());
                } else {
                    throw m116786exceptionOrNullimpl;
                }
            }
        }
        stripeApiRepository$makeApiRequest$1 = new StripeApiRepository$makeApiRequest$1(this, continuation);
        Object obj2 = stripeApiRepository$makeApiRequest$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$makeApiRequest$1.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((StripeResponse) executeRequest);
        function0.invoke();
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|(1:(4:9|10|11|12)(2:41|42))(4:43|44|45|(1:47)(1:48))|13|14|15|(1:17)(1:34)|18|(1:20)|21|(4:23|(1:25)|26|27)(2:29|(2:31|32)(1:33))))|52|6|(0)(0)|13|14|15|(0)(0)|18|(0)|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeFileUploadRequest$payments_core_release(FileUploadRequest fileUploadRequest, Function1<? super RequestId, Unit> function1, Continuation<? super StripeResponse<String>> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        StripeApiRepository$makeFileUploadRequest$1 stripeApiRepository$makeFileUploadRequest$1;
        Object coroutine_suspended;
        int i;
        DnsCacheData disableDnsCache;
        StripeApiRepository stripeApiRepository;
        Object executeRequest;
        Object m116783constructorimpl;
        Object obj;
        StripeResponse stripeResponse;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof StripeApiRepository$makeFileUploadRequest$1) {
            stripeApiRepository$makeFileUploadRequest$1 = (StripeApiRepository$makeFileUploadRequest$1) continuation;
            int i2 = stripeApiRepository$makeFileUploadRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$makeFileUploadRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = stripeApiRepository$makeFileUploadRequest$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$makeFileUploadRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        DnsCacheData dnsCacheData = (DnsCacheData) stripeApiRepository$makeFileUploadRequest$1.L$3;
                        function1 = (Function1) stripeApiRepository$makeFileUploadRequest$1.L$2;
                        FileUploadRequest fileUploadRequest2 = (FileUploadRequest) stripeApiRepository$makeFileUploadRequest$1.L$1;
                        StripeApiRepository stripeApiRepository2 = (StripeApiRepository) stripeApiRepository$makeFileUploadRequest$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            disableDnsCache = dnsCacheData;
                            fileUploadRequest = fileUploadRequest2;
                            stripeApiRepository = stripeApiRepository2;
                            executeRequest = obj2;
                        } catch (Throwable th) {
                            disableDnsCache = dnsCacheData;
                            fileUploadRequest = fileUploadRequest2;
                            stripeApiRepository = stripeApiRepository2;
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            RequestId requestId = null;
                            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                            }
                            stripeResponse = (StripeResponse) obj;
                            if (stripeResponse != null) {
                            }
                            function1.invoke(requestId);
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl == null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj2);
                    disableDnsCache = disableDnsCache();
                    try {
                        Result.Companion companion2 = Result.Companion;
                        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
                        stripeApiRepository$makeFileUploadRequest$1.L$0 = this;
                        stripeApiRepository$makeFileUploadRequest$1.L$1 = fileUploadRequest;
                        stripeApiRepository$makeFileUploadRequest$1.L$2 = function1;
                        stripeApiRepository$makeFileUploadRequest$1.L$3 = disableDnsCache;
                        stripeApiRepository$makeFileUploadRequest$1.label = 1;
                        executeRequest = stripeNetworkClient.executeRequest(fileUploadRequest, stripeApiRepository$makeFileUploadRequest$1);
                        if (executeRequest == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stripeApiRepository = this;
                    } catch (Throwable th2) {
                        th = th2;
                        stripeApiRepository = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        RequestId requestId2 = null;
                        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                        }
                        stripeResponse = (StripeResponse) obj;
                        if (stripeResponse != null) {
                        }
                        function1.invoke(requestId2);
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl == null) {
                        }
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((StripeResponse) executeRequest);
                RequestId requestId22 = null;
                if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                    obj = null;
                } else {
                    obj = m116783constructorimpl;
                }
                stripeResponse = (StripeResponse) obj;
                if (stripeResponse != null) {
                    requestId22 = stripeResponse.getRequestId();
                }
                function1.invoke(requestId22);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl == null) {
                    StripeResponse<String> stripeResponse2 = (StripeResponse) m116783constructorimpl;
                    if (stripeResponse2.isError()) {
                        stripeApiRepository.handleApiError(stripeResponse2);
                    }
                    stripeApiRepository.resetDnsCache(disableDnsCache);
                    return stripeResponse2;
                } else if (m116786exceptionOrNullimpl instanceof IOException) {
                    throw APIConnectionException.Companion.create((IOException) m116786exceptionOrNullimpl, fileUploadRequest.getUrl());
                } else {
                    throw m116786exceptionOrNullimpl;
                }
            }
        }
        stripeApiRepository$makeFileUploadRequest$1 = new StripeApiRepository$makeFileUploadRequest$1(this, continuation);
        Object obj22 = stripeApiRepository$makeFileUploadRequest$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$makeFileUploadRequest$1.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((StripeResponse) executeRequest);
        RequestId requestId222 = null;
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
        }
        stripeResponse = (StripeResponse) obj;
        if (stripeResponse != null) {
        }
        function1.invoke(requestId222);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
        }
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object refreshPaymentIntent$payments_core_release(String str, ApiRequest.Options options, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        List<String> emptyList;
        String paymentIntentId$payments_core_release = new PaymentIntent.ClientSecret(str).getPaymentIntentId$payments_core_release();
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String refreshPaymentIntentUrl$payments_core_release = Companion.getRefreshPaymentIntentUrl$payments_core_release(paymentIntentId$payments_core_release);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, refreshPaymentIntentUrl$payments_core_release, options, createClientSecretParam(str, emptyList), false, 8, null), new PaymentIntentJsonParser(null, 1, null), new StripeApiRepository$refreshPaymentIntent$2(this), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrieveCardMetadata(String str, ApiRequest.Options options, Continuation<? super CardMetadata> continuation) {
        StripeApiRepository$retrieveCardMetadata$1 stripeApiRepository$retrieveCardMetadata$1;
        Object coroutine_suspended;
        int i;
        Bin bin;
        List list;
        if (continuation instanceof StripeApiRepository$retrieveCardMetadata$1) {
            stripeApiRepository$retrieveCardMetadata$1 = (StripeApiRepository$retrieveCardMetadata$1) continuation;
            int i2 = stripeApiRepository$retrieveCardMetadata$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveCardMetadata$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeApiRepository$retrieveCardMetadata$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$retrieveCardMetadata$1.label;
                if (i == 0) {
                    if (i == 1) {
                        bin = (Bin) stripeApiRepository$retrieveCardMetadata$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CardNumber.Unvalidated unvalidated = new CardNumber.Unvalidated(str);
                    bin = unvalidated.getBin();
                    if (bin == null) {
                        return null;
                    }
                    CardAccountRangeRepository createWithStripeRepository = this.cardAccountRangeRepositoryFactory.createWithStripeRepository(this, this.publishableKeyProvider.invoke());
                    stripeApiRepository$retrieveCardMetadata$1.L$0 = bin;
                    stripeApiRepository$retrieveCardMetadata$1.label = 1;
                    obj = createWithStripeRepository.getAccountRanges(unvalidated, stripeApiRepository$retrieveCardMetadata$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                list = (List) obj;
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                }
                return new CardMetadata(bin, list);
            }
        }
        stripeApiRepository$retrieveCardMetadata$1 = new StripeApiRepository$retrieveCardMetadata$1(this, continuation);
        Object obj2 = stripeApiRepository$retrieveCardMetadata$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$retrieveCardMetadata$1.label;
        if (i == 0) {
        }
        list = (List) obj2;
        if (list == null) {
        }
        return new CardMetadata(bin, list);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrieveCustomer(String str, Set<String> set, ApiRequest.Options options, Continuation<? super Customer> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        return fetchStripeModel(ApiRequest.Factory.createGet$default(this.apiRequestFactory, Companion.getRetrieveCustomerUrl$payments_core_release(str), options, null, false, 12, null), new CustomerJsonParser(), new StripeApiRepository$retrieveCustomer$2(this, set), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrieveElementsSession(ElementsSessionParams elementsSessionParams, ApiRequest.Options options, Continuation<? super ElementsSession> continuation) {
        return retrieveElementsSession(elementsSessionParams, options, null, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[ORIG_RETURN, RETURN] */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrieveIssuingCardPin$payments_core_release(String str, String str2, String str3, ApiRequest.Options options, Continuation<? super String> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException, JSONException {
        StripeApiRepository$retrieveIssuingCardPin$1 stripeApiRepository$retrieveIssuingCardPin$1;
        Object coroutine_suspended;
        int i;
        Map mapOf;
        IssuingCardPin issuingCardPin;
        if (continuation instanceof StripeApiRepository$retrieveIssuingCardPin$1) {
            stripeApiRepository$retrieveIssuingCardPin$1 = (StripeApiRepository$retrieveIssuingCardPin$1) continuation;
            int i2 = stripeApiRepository$retrieveIssuingCardPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveIssuingCardPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeApiRepository$retrieveIssuingCardPin$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$retrieveIssuingCardPin$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ApiRequest.Factory factory = this.apiRequestFactory;
                    Companion companion = Companion;
                    String issuingCardPinUrl$payments_core_release = companion.getIssuingCardPinUrl$payments_core_release(str);
                    mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("verification", companion.createVerificationParam(str2, str3)));
                    ApiRequest createGet$default = ApiRequest.Factory.createGet$default(factory, issuingCardPinUrl$payments_core_release, options, mapOf, false, 8, null);
                    IssuingCardPinJsonParser issuingCardPinJsonParser = new IssuingCardPinJsonParser();
                    StripeApiRepository$retrieveIssuingCardPin$issuingCardPin$1 stripeApiRepository$retrieveIssuingCardPin$issuingCardPin$1 = new StripeApiRepository$retrieveIssuingCardPin$issuingCardPin$1(this);
                    stripeApiRepository$retrieveIssuingCardPin$1.label = 1;
                    obj = fetchStripeModel(createGet$default, issuingCardPinJsonParser, stripeApiRepository$retrieveIssuingCardPin$issuingCardPin$1, stripeApiRepository$retrieveIssuingCardPin$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                issuingCardPin = (IssuingCardPin) obj;
                if (issuingCardPin == null) {
                    return issuingCardPin.getPin();
                }
                return null;
            }
        }
        stripeApiRepository$retrieveIssuingCardPin$1 = new StripeApiRepository$retrieveIssuingCardPin$1(this, continuation);
        Object obj2 = stripeApiRepository$retrieveIssuingCardPin$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$retrieveIssuingCardPin$1.label;
        if (i == 0) {
        }
        issuingCardPin = (IssuingCardPin) obj2;
        if (issuingCardPin == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrieveObject$payments_core_release(String str, ApiRequest.Options options, Continuation<? super StripeResponse<String>> continuation) throws IllegalArgumentException, InvalidRequestException, APIConnectionException, APIException, CardException, AuthenticationException {
        StripeApiRepository$retrieveObject$1 stripeApiRepository$retrieveObject$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof StripeApiRepository$retrieveObject$1) {
            stripeApiRepository$retrieveObject$1 = (StripeApiRepository$retrieveObject$1) continuation;
            int i2 = stripeApiRepository$retrieveObject$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveObject$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeApiRepository$retrieveObject$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$retrieveObject$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (StripeUrlUtils.INSTANCE.isStripeUrl$payments_core_release(str)) {
                        ApiRequest createGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, str, options, null, false, 12, null);
                        Function0<Unit> stripeApiRepository$retrieveObject$response$1 = new StripeApiRepository$retrieveObject$response$1(this);
                        stripeApiRepository$retrieveObject$1.label = 1;
                        obj = makeApiRequest$payments_core_release(createGet$default, stripeApiRepository$retrieveObject$response$1, stripeApiRepository$retrieveObject$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        throw new IllegalArgumentException("Unrecognized domain: " + str);
                    }
                }
                return (StripeResponse) obj;
            }
        }
        stripeApiRepository$retrieveObject$1 = new StripeApiRepository$retrieveObject$1(this, continuation);
        Object obj2 = stripeApiRepository$retrieveObject$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$retrieveObject$1.label;
        if (i == 0) {
        }
        return (StripeResponse) obj2;
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrievePaymentIntent(String str, ApiRequest.Options options, List<String> list, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Map<String, Object> createClientSecretParam;
        String paymentIntentId$payments_core_release = new PaymentIntent.ClientSecret(str).getPaymentIntentId$payments_core_release();
        if (options.getApiKeyIsUserKey()) {
            createClientSecretParam = Companion.createExpandParam(list);
        } else {
            createClientSecretParam = createClientSecretParam(str, list);
        }
        Map<String, Object> map = createClientSecretParam;
        fireFraudDetectionDataRequest();
        return fetchStripeModel(ApiRequest.Factory.createGet$default(this.apiRequestFactory, Companion.getRetrievePaymentIntentUrl$payments_core_release(paymentIntentId$payments_core_release), options, map, false, 8, null), new PaymentIntentJsonParser(null, 1, null), new StripeApiRepository$retrievePaymentIntent$2(this), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrievePaymentMethodMessage(List<String> list, int i, String str, String str2, String str3, String str4, ApiRequest.Options options, Continuation<? super PaymentMethodMessage> continuation) {
        Map mapOf;
        int collectionSizeOrDefault;
        Map plus;
        ApiRequest.Factory factory = this.apiRequestFactory;
        int i2 = 0;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("amount", Boxing.boxInt(i)), TuplesKt.m28425to(PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "android"), TuplesKt.m28425to("country", str2), TuplesKt.m28425to("currency", str), TuplesKt.m28425to("locale", str3), TuplesKt.m28425to("logo_color", str4));
        List<String> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new Pair("payment_methods[" + i2 + "]", (String) obj));
            i2 = i3;
        }
        plus = MapsKt__MapsKt.plus(mapOf, arrayList);
        return fetchStripeModel(ApiRequest.Factory.createGet$default(factory, "https://ppm.stripe.com/content", options, plus, false, 8, null), new PaymentMethodMessageJsonParser(), StripeApiRepository$retrievePaymentMethodMessage$3.INSTANCE, continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrieveSetupIntent(String str, ApiRequest.Options options, List<String> list, Continuation<? super SetupIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        String setupIntentId$payments_core_release = new SetupIntent.ClientSecret(str).getSetupIntentId$payments_core_release();
        fireFraudDetectionDataRequest();
        return fetchStripeModel(ApiRequest.Factory.createGet$default(this.apiRequestFactory, Companion.getRetrieveSetupIntentUrl$payments_core_release(setupIntentId$payments_core_release), options, createClientSecretParam(str, list), false, 8, null), new SetupIntentJsonParser(), new StripeApiRepository$retrieveSetupIntent$2(this), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrieveSource$payments_core_release(String str, String str2, ApiRequest.Options options, Continuation<? super Source> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        return fetchStripeModel(ApiRequest.Factory.createGet$default(this.apiRequestFactory, Companion.getRetrieveSourceApiUrl$payments_core_release(str), options, SourceParams.Companion.createRetrieveSourceParams(str2), false, 8, null), new SourceJsonParser(), new StripeApiRepository$retrieveSource$2(this), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrieveStripeIntent$payments_core_release(String str, ApiRequest.Options options, List<String> list, Continuation<? super StripeIntent> continuation) {
        StripeApiRepository$retrieveStripeIntent$1 stripeApiRepository$retrieveStripeIntent$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof StripeApiRepository$retrieveStripeIntent$1) {
            stripeApiRepository$retrieveStripeIntent$1 = (StripeApiRepository$retrieveStripeIntent$1) continuation;
            int i2 = stripeApiRepository$retrieveStripeIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveStripeIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeApiRepository$retrieveStripeIntent$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeApiRepository$retrieveStripeIntent$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                                return (StripeIntent) obj;
                            }
                            throw new IllegalArgumentException("Could not retrieve SetupIntent.".toString());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (obj == null) {
                        return (StripeIntent) obj;
                    }
                    throw new IllegalArgumentException("Could not retrieve PaymentIntent.".toString());
                }
                ResultKt.throwOnFailure(obj);
                if (PaymentIntent.ClientSecret.Companion.isMatch(str)) {
                    stripeApiRepository$retrieveStripeIntent$1.label = 1;
                    obj = retrievePaymentIntent(str, options, list, stripeApiRepository$retrieveStripeIntent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (obj == null) {
                    }
                } else if (SetupIntent.ClientSecret.Companion.isMatch(str)) {
                    stripeApiRepository$retrieveStripeIntent$1.label = 2;
                    obj = retrieveSetupIntent(str, options, list, stripeApiRepository$retrieveStripeIntent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (obj == null) {
                    }
                } else {
                    throw new IllegalStateException("Invalid client secret.".toString());
                }
            }
        }
        stripeApiRepository$retrieveStripeIntent$1 = new StripeApiRepository$retrieveStripeIntent$1(this, continuation);
        Object obj2 = stripeApiRepository$retrieveStripeIntent$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeApiRepository$retrieveStripeIntent$1.label;
        if (i == 0) {
        }
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object setCustomerShippingInfo$payments_core_release(String str, String str2, Set<String> set, ShippingInformation shippingInformation, ApiRequest.Options options, Continuation<? super Customer> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String retrieveCustomerUrl$payments_core_release = Companion.getRetrieveCustomerUrl$payments_core_release(str);
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("shipping", shippingInformation.toParamMap()));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, retrieveCustomerUrl$payments_core_release, options, mapOf, false, 8, null), new CustomerJsonParser(), new StripeApiRepository$setCustomerShippingInfo$2(this, set), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object setDefaultCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, Continuation<? super Customer> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String retrieveCustomerUrl$payments_core_release = Companion.getRetrieveCustomerUrl$payments_core_release(str);
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("default_source", str3));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, retrieveCustomerUrl$payments_core_release, options, mapOf, false, 8, null), new CustomerJsonParser(), new StripeApiRepository$setDefaultCustomerSource$2(this, set, str4), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object start3ds2Auth$payments_core_release(Stripe3ds2AuthParams stripe3ds2AuthParams, ApiRequest.Options options, Continuation<? super Stripe3ds2AuthResult> continuation) {
        return fetchStripeModel(ApiRequest.Factory.createPost$default(this.apiRequestFactory, Companion.getApiUrl("3ds2/authenticate"), options, stripe3ds2AuthParams.toParamMap(), false, 8, null), new Stripe3ds2AuthResultJsonParser(), new StripeApiRepository$start3ds2Auth$2(this), continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object updateIssuingCardPin$payments_core_release(String str, String str2, String str3, String str4, ApiRequest.Options options, Continuation<? super Unit> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        Map mapOf;
        Object coroutine_suspended;
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = Companion;
        String issuingCardPinUrl$payments_core_release = companion.getIssuingCardPinUrl$payments_core_release(str);
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("verification", companion.createVerificationParam(str3, str4)), TuplesKt.m28425to("pin", str2));
        Object makeApiRequest$payments_core_release = makeApiRequest$payments_core_release(ApiRequest.Factory.createPost$default(factory, issuingCardPinUrl$payments_core_release, options, mapOf, false, 8, null), new StripeApiRepository$updateIssuingCardPin$2(this), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (makeApiRequest$payments_core_release == coroutine_suspended) {
            return makeApiRequest$payments_core_release;
        }
        return Unit.INSTANCE;
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object updatePaymentDetails(String str, ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, ApiRequest.Options options, Continuation<? super ConsumerPaymentDetails> continuation) {
        Map mapOf;
        Map mapOf2;
        Map plus;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerPaymentDetailsUrl$payments_core_release = Companion.getConsumerPaymentDetailsUrl$payments_core_release(consumerPaymentDetailsUpdateParams.getId());
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("consumer_session_client_secret", str));
        mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.m28425to("credentials", mapOf));
        plus = MapsKt__MapsKt.plus(mapOf2, consumerPaymentDetailsUpdateParams.toParamMap());
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, consumerPaymentDetailsUrl$payments_core_release, options, plus, false, 8, null), new ConsumerPaymentDetailsJsonParser(), StripeApiRepository$updatePaymentDetails$2.INSTANCE, continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object verifyPaymentIntentWithMicrodeposits(String str, int i, int i2, ApiRequest.Options options, Continuation<? super PaymentIntent> continuation) {
        List listOf;
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String verifyMicrodepositsOnPaymentIntentUrl$payments_core_release = Companion.getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(new PaymentIntent.ClientSecret(str).getPaymentIntentId$payments_core_release());
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i), Boxing.boxInt(i2)});
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", str), TuplesKt.m28425to("amounts", listOf));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, verifyMicrodepositsOnPaymentIntentUrl$payments_core_release, options, mapOf, false, 8, null), new PaymentIntentJsonParser(null, 1, null), StripeApiRepository$verifyPaymentIntentWithMicrodeposits$2.INSTANCE, continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object verifySetupIntentWithMicrodeposits(String str, int i, int i2, ApiRequest.Options options, Continuation<? super SetupIntent> continuation) {
        List listOf;
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String verifyMicrodepositsOnSetupIntentUrl$payments_core_release = Companion.getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(new SetupIntent.ClientSecret(str).getSetupIntentId$payments_core_release());
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i), Boxing.boxInt(i2)});
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", str), TuplesKt.m28425to("amounts", listOf));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, verifyMicrodepositsOnSetupIntentUrl$payments_core_release, options, mapOf, false, 8, null), new SetupIntentJsonParser(), StripeApiRepository$verifySetupIntentWithMicrodeposits$2.INSTANCE, continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo) {
        this(context, publishableKeyProvider, appInfo, null, null, null, null, null, null, null, null, null, null, null, null, 32760, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retrieveElementsSession(ElementsSessionParams elementsSessionParams, ApiRequest.Options options, PaymentAnalyticsEvent paymentAnalyticsEvent, Continuation<? super ElementsSession> continuation) {
        Map createMapBuilder;
        Map build;
        Map plus;
        if (options.getApiKeyIsUserKey()) {
            return null;
        }
        fireFraudDetectionDataRequest();
        ElementsSessionJsonParser elementsSessionJsonParser = new ElementsSessionJsonParser(elementsSessionParams, options.getApiKey(), null, 4, null);
        createMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
        createMapBuilder.put("type", elementsSessionParams.getType());
        String clientSecret = elementsSessionParams.getClientSecret();
        if (clientSecret != null) {
            createMapBuilder.put("client_secret", clientSecret);
        }
        createMapBuilder.put("locale", elementsSessionParams.getLocale());
        ElementsSessionParams.DeferredIntentType deferredIntentType = elementsSessionParams instanceof ElementsSessionParams.DeferredIntentType ? (ElementsSessionParams.DeferredIntentType) elementsSessionParams : null;
        if (deferredIntentType != null) {
            createMapBuilder.putAll(deferredIntentType.getDeferredIntentParams().toQueryParams());
        }
        build = MapsKt__MapsJVMKt.build(createMapBuilder);
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = Companion;
        String apiUrl = companion.getApiUrl("elements/sessions");
        plus = MapsKt__MapsKt.plus(build, companion.createExpandParam(elementsSessionParams.getExpandFields()));
        return fetchStripeModel(ApiRequest.Factory.createGet$default(factory, apiUrl, options, plus, false, 8, null), elementsSessionJsonParser, new StripeApiRepository$retrieveElementsSession$3(paymentAnalyticsEvent, this), continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger) {
        this(context, publishableKeyProvider, appInfo, logger, null, null, null, null, null, null, null, null, null, null, null, 32752, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, null, null, null, null, null, null, null, null, null, null, 32736, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, null, null, null, null, null, null, null, null, null, 32704, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, null, null, null, null, null, null, null, null, 32640, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, null, null, null, null, null, null, null, 32512, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, null, null, null, null, null, null, 32256, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, cardAccountRangeRepositoryFactory, null, null, null, null, null, 31744, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object verifyPaymentIntentWithMicrodeposits(String str, String str2, ApiRequest.Options options, Continuation<? super PaymentIntent> continuation) {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String verifyMicrodepositsOnPaymentIntentUrl$payments_core_release = Companion.getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(new PaymentIntent.ClientSecret(str).getPaymentIntentId$payments_core_release());
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", str), TuplesKt.m28425to("descriptor_code", str2));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, verifyMicrodepositsOnPaymentIntentUrl$payments_core_release, options, mapOf, false, 8, null), new PaymentIntentJsonParser(null, 1, null), StripeApiRepository$verifyPaymentIntentWithMicrodeposits$4.INSTANCE, continuation);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object verifySetupIntentWithMicrodeposits(String str, String str2, ApiRequest.Options options, Continuation<? super SetupIntent> continuation) {
        Map mapOf;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String verifyMicrodepositsOnSetupIntentUrl$payments_core_release = Companion.getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(new SetupIntent.ClientSecret(str).getSetupIntentId$payments_core_release());
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", str), TuplesKt.m28425to("descriptor_code", str2));
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, verifyMicrodepositsOnSetupIntentUrl$payments_core_release, options, mapOf, false, 8, null), new SetupIntentJsonParser(), StripeApiRepository$verifySetupIntentWithMicrodeposits$4.INSTANCE, continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, cardAccountRangeRepositoryFactory, paymentAnalyticsRequestFactory, null, null, null, null, 30720, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, cardAccountRangeRepositoryFactory, paymentAnalyticsRequestFactory, fraudDetectionDataParamsUtils, null, null, null, 28672, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, Set<? extends StripeApiBeta> betas) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, cardAccountRangeRepositoryFactory, paymentAnalyticsRequestFactory, fraudDetectionDataParamsUtils, betas, null, null, 24576, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        Intrinsics.checkNotNullParameter(betas, "betas");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, Set<? extends StripeApiBeta> betas, String apiVersion) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, cardAccountRangeRepositoryFactory, paymentAnalyticsRequestFactory, fraudDetectionDataParamsUtils, betas, apiVersion, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        Intrinsics.checkNotNullParameter(betas, "betas");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createPaymentDetails(String str, ConsumerPaymentDetailsCreateParams consumerPaymentDetailsCreateParams, ApiRequest.Options options, Continuation<? super ConsumerPaymentDetails> continuation) {
        Map mapOf;
        Map mapOf2;
        Map plus;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerPaymentDetailsUrl$payments_core_release = Companion.getConsumerPaymentDetailsUrl$payments_core_release();
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("consumer_session_client_secret", str));
        mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.m28425to("credentials", mapOf), TuplesKt.m28425to("active", Boxing.boxBoolean(false)));
        plus = MapsKt__MapsKt.plus(mapOf2, consumerPaymentDetailsCreateParams.toParamMap());
        return fetchStripeModel(ApiRequest.Factory.createPost$default(factory, consumerPaymentDetailsUrl$payments_core_release, options, plus, false, 8, null), new ConsumerPaymentDetailsJsonParser(), StripeApiRepository$createPaymentDetails$4.INSTANCE, continuation);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StripeApiRepository(Context context, Function0 function0, AppInfo appInfo, Logger logger, CoroutineContext coroutineContext, Set set, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory factory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, Set set2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, function0, r3, r12, r13, r14, r7, r8, r9, r10, r11, r15, r6, r16, (i & 16384) != 0 ? "AndroidBindings/20.21.0" : str2);
        Set set3;
        Set<StripeApiBeta> set4;
        String str3;
        int collectionSizeOrDefault;
        Set set5;
        Set emptySet;
        Set emptySet2;
        AppInfo appInfo2 = (i & 4) != 0 ? Stripe.Companion.getAppInfo() : appInfo;
        Logger noop = (i & 8) != 0 ? Logger.Companion.noop() : logger;
        SC0 m84377b = (i & 16) != 0 ? T41.m84377b() : coroutineContext;
        if ((i & 32) != 0) {
            emptySet2 = SetsKt__SetsKt.emptySet();
            set3 = emptySet2;
        } else {
            set3 = set;
        }
        DefaultStripeNetworkClient defaultStripeNetworkClient = (i & 64) != 0 ? new DefaultStripeNetworkClient(m84377b, null, null, 0, noop, 14, null) : stripeNetworkClient;
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = (i & 128) != 0 ? new DefaultAnalyticsRequestExecutor(noop, m84377b) : analyticsRequestExecutor;
        DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository = (i & 256) != 0 ? new DefaultFraudDetectionDataRepository(context, m84377b) : fraudDetectionDataRepository;
        DefaultCardAccountRangeRepositoryFactory defaultCardAccountRangeRepositoryFactory = (i & 512) != 0 ? new DefaultCardAccountRangeRepositoryFactory(context, defaultAnalyticsRequestExecutor) : factory;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2 = (i & 1024) != 0 ? new PaymentAnalyticsRequestFactory(context, function0, set3) : paymentAnalyticsRequestFactory;
        FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils2 = (i & 2048) != 0 ? new FraudDetectionDataParamsUtils() : fraudDetectionDataParamsUtils;
        if ((i & 4096) != 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            set4 = emptySet;
        } else {
            set4 = set2;
        }
        if ((i & 8192) != 0) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set4, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (StripeApiBeta stripeApiBeta : set4) {
                arrayList.add(stripeApiBeta.getCode());
            }
            set5 = CollectionsKt___CollectionsKt.toSet(arrayList);
            str3 = new ApiVersion(set5).getCode();
        } else {
            str3 = str;
        }
    }

    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, Set<? extends StripeApiBeta> betas, String apiVersion, String sdkVersion) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        Intrinsics.checkNotNullParameter(betas, "betas");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.context = context;
        this.publishableKeyProvider = publishableKeyProvider;
        this.appInfo = appInfo;
        this.logger = logger;
        this.workContext = workContext;
        this.productUsageTokens = productUsageTokens;
        this.stripeNetworkClient = stripeNetworkClient;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.fraudDetectionDataRepository = fraudDetectionDataRepository;
        this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.fraudDetectionDataParamsUtils = fraudDetectionDataParamsUtils;
        this.apiRequestFactory = new ApiRequest.Factory(appInfo, apiVersion, sdkVersion);
        fireFraudDetectionDataRequest();
        Z30.m73800d(C37824aD0.m71790a(workContext), null, null, new C190932(null), 3, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context appContext, Function0<String> publishableKeyProvider, @IOContext CoroutineContext workContext, Set<String> productUsageTokens, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, Logger logger) {
        this(appContext, publishableKeyProvider, null, logger, workContext, productUsageTokens, null, analyticsRequestExecutor, null, null, paymentAnalyticsRequestFactory, null, null, null, null, 31556, null);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(logger, "logger");
    }
}
