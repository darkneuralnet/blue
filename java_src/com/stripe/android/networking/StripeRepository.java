package com.stripe.android.networking;

import com.stripe.android.cards.Bin;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.exception.CardException;
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
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodMessage;
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
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import org.json.JSONException;
@Metadata(m28433d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JK\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0017JA\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0017JA\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ-\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J-\u0010#\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\b$\u0010\"J%\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\b'\u0010(J5\u0010)\u001a\u0004\u0018\u00010\u00112\u0006\u0010*\u001a\u00020+2\u0006\u0010 \u001a\u00020\r2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H @ø\u0001\u0000¢\u0006\u0004\b,\u0010-J5\u0010.\u001a\u0004\u0018\u00010\u00192\u0006\u0010/\u001a\u0002002\u0006\u0010 \u001a\u00020\r2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H @ø\u0001\u0000¢\u0006\u0004\b1\u00102JY\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\u00108\u001a\u0004\u0018\u00010\u00062\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010\u00062\u0006\u0010<\u001a\u00020=2\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010>J#\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ#\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010(J+\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010G\u001a\u00020\u00062\u0006\u0010J\u001a\u00020K2\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010LJ+\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010G\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\"J-\u0010N\u001a\u0004\u0018\u00010F2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010O\u001a\u00020P2\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ#\u0010S\u001a\u0004\u0018\u00010\u001c2\u0006\u0010T\u001a\u00020U2\u0006\u0010 \u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010VJ\u001d\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ-\u0010[\u001a\u0004\u0018\u00010F2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010O\u001a\u00020P2\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\b\\\u0010RJ%\u0010]\u001a\u0004\u0018\u00010\u00042\u0006\u0010^\u001a\u00020_2\u0006\u0010 \u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ%\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010d\u001a\u00020e2\u0006\u0010 \u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\bf\u0010gJC\u0010h\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\bi\u0010\u001eJ)\u0010j\u001a\u00020k2\u0006\u0010G\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\"J9\u0010m\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010nJ%\u0010o\u001a\u0004\u0018\u00010p2\u0006\u0010q\u001a\u00020r2\u0006\u0010 \u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\bs\u0010tJ\u001b\u0010u\u001a\u00020v2\u0006\u0010 \u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0004\bw\u0010ZJ=\u0010x\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u0006\u0010y\u001a\u00020z2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010{J1\u0010|\u001a\u0004\u0018\u00010I2\u0006\u0010G\u001a\u00020\u00062\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010~J-\u0010\u007f\u001a\u0004\u0018\u0001042\u0006\u0010G\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\"J'\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\rH¡@ø\u0001\u0000¢\u0006\u0005\b\u0081\u0001\u0010(J%\u0010\u0082\u0001\u001a\u0004\u0018\u00010p2\u0007\u0010\u0083\u0001\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010(J3\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u00012\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010~J'\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u00012\u0007\u0010O\u001a\u00030\u0088\u00012\u0006\u0010 \u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0003\u0010\u0089\u0001J;\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00062\u0007\u0010\u008b\u0001\u001a\u00020\u00062\u0007\u0010\u008c\u0001\u001a\u00020\u00062\u0007\u0010\u008d\u0001\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J-\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0091\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0005\b\u0093\u0001\u0010(J5\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\r2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H§@ø\u0001\u0000¢\u0006\u0003\u0010\u0095\u0001JY\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u00012\r\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\u0007\u0010\u009c\u0001\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0003\u0010\u009d\u0001J5\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\r2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H§@ø\u0001\u0000¢\u0006\u0003\u0010\u0095\u0001J/\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0005\b \u0001\u0010\"J7\u0010¡\u0001\u001a\u00030¢\u00012\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\r2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H @ø\u0001\u0000¢\u0006\u0006\b£\u0001\u0010\u0095\u0001JI\u0010¤\u0001\u001a\u0005\u0018\u00010\u0085\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\u0010¥\u0001\u001a\u00030¦\u00012\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001JN\u0010©\u0001\u001a\u0005\u0018\u00010\u0085\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0005\bª\u0001\u0010\u000fJ*\u0010«\u0001\u001a\u0004\u0018\u00010&2\b\u0010¬\u0001\u001a\u00030\u00ad\u00012\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0006\b®\u0001\u0010¯\u0001JB\u0010°\u0001\u001a\u00020k2\u0007\u0010\u008b\u0001\u001a\u00020\u00062\u0007\u0010±\u0001\u001a\u00020\u00062\u0007\u0010\u008c\u0001\u001a\u00020\u00062\u0007\u0010\u008d\u0001\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH @ø\u0001\u0000¢\u0006\u0006\b²\u0001\u0010³\u0001J/\u0010´\u0001\u001a\u0004\u0018\u00010I2\u0006\u0010G\u001a\u00020\u00062\b\u0010µ\u0001\u001a\u00030¶\u00012\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0003\u0010·\u0001J9\u0010¸\u0001\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010¹\u0001\u001a\u00030\u009a\u00012\b\u0010º\u0001\u001a\u00030\u009a\u00012\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0003\u0010»\u0001J-\u0010¸\u0001\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0007\u0010¼\u0001\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\"J9\u0010½\u0001\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010¹\u0001\u001a\u00030\u009a\u00012\b\u0010º\u0001\u001a\u00030\u009a\u00012\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0003\u0010»\u0001J-\u0010½\u0001\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u00062\u0007\u0010¼\u0001\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¾\u0001"}, m28432d2 = {"Lcom/stripe/android/networking/StripeRepository;", "", "()V", "addCustomerSource", "Lcom/stripe/android/model/Source;", "customerId", "", "publishableKey", "productUsageTokens", "", "sourceId", "sourceType", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "addCustomerSource$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachFinancialConnectionsSessionToPaymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "clientSecret", "paymentIntentId", "financialConnectionsSessionId", "expandFields", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachFinancialConnectionsSessionToSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "setupIntentId", "attachPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPaymentIntentSource", "options", "cancelPaymentIntentSource$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelSetupIntentSource", "cancelSetupIntentSource$payments_core_release", "complete3ds2Auth", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "complete3ds2Auth$payments_core_release", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntent$payments_core_release", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntent", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntent$payments_core_release", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSignUp", "Lcom/stripe/android/model/ConsumerSession;", "email", "phoneNumber", "country", "name", "locale", "Ljava/util/Locale;", "authSessionCookie", "consentAction", "Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createFile", "Lcom/stripe/android/core/model/StripeFile;", "fileParams", "Lcom/stripe/android/core/model/StripeFileParams;", "createFile$payments_core_release", "(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLinkFinancialConnectionsSession", "Lcom/stripe/android/model/FinancialConnectionsSession;", "consumerSessionClientSecret", "createPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "paymentDetailsCreateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;", "(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financialConnectionsAccountId", "createPaymentIntentFinancialConnectionsSession", "params", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "createPaymentIntentFinancialConnectionsSession$payments_core_release", "(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRadarSession", "Lcom/stripe/android/model/RadarSession;", "createRadarSession$payments_core_release", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSetupIntentFinancialConnectionsSession", "createSetupIntentFinancialConnectionsSession$payments_core_release", "createSource", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "createSource$payments_core_release", "(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createToken", "Lcom/stripe/android/model/Token;", "tokenParams", "Lcom/stripe/android/model/TokenParams;", "createToken$payments_core_release", "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomerSource", "deleteCustomerSource$payments_core_release", "deletePaymentDetails", "", "paymentDetailsId", "detachPaymentMethod", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardMetadata", "Lcom/stripe/android/model/CardMetadata;", "bin", "Lcom/stripe/android/cards/Bin;", "getCardMetadata$payments_core_release", "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFpxBankStatus", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatus$payments_core_release", "getPaymentMethods", "listPaymentMethodsParams", "Lcom/stripe/android/model/ListPaymentMethodsParams;", "(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listPaymentDetails", "paymentMethodTypes", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logoutConsumer", "refreshPaymentIntent", "refreshPaymentIntent$payments_core_release", "retrieveCardMetadata", "cardNumber", "retrieveCustomer", "Lcom/stripe/android/model/Customer;", "retrieveElementsSession", "Lcom/stripe/android/model/ElementsSession;", "Lcom/stripe/android/model/ElementsSessionParams;", "(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveIssuingCardPin", "cardId", "verificationId", "userOneTimeCode", "retrieveIssuingCardPin$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveObject", "Lcom/stripe/android/core/networking/StripeResponse;", "url", "retrieveObject$payments_core_release", "retrievePaymentIntent", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrievePaymentMethodMessage", "Lcom/stripe/android/model/PaymentMethodMessage;", "paymentMethods", "amount", "", "currency", "logoColor", "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSetupIntent", "retrieveSource", "retrieveSource$payments_core_release", "retrieveStripeIntent", "Lcom/stripe/android/model/StripeIntent;", "retrieveStripeIntent$payments_core_release", "setCustomerShippingInfo", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "setCustomerShippingInfo$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultCustomerSource", "setDefaultCustomerSource$payments_core_release", "start3ds2Auth", "authParams", "Lcom/stripe/android/model/Stripe3ds2AuthParams;", "start3ds2Auth$payments_core_release", "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateIssuingCardPin", "newPin", "updateIssuingCardPin$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentDetails", "paymentDetailsUpdateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyPaymentIntentWithMicrodeposits", "firstAmount", "secondAmount", "(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "descriptorCode", "verifySetupIntentWithMicrodeposits", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class StripeRepository {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object confirmPaymentIntent$payments_core_release$default(StripeRepository stripeRepository, ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if (obj == null) {
            if ((i & 4) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            return stripeRepository.confirmPaymentIntent$payments_core_release(confirmPaymentIntentParams, options, list, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmPaymentIntent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object confirmSetupIntent$payments_core_release$default(StripeRepository stripeRepository, ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if (obj == null) {
            if ((i & 4) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            return stripeRepository.confirmSetupIntent$payments_core_release(confirmSetupIntentParams, options, list, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmSetupIntent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object retrievePaymentIntent$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if (obj == null) {
            if ((i & 4) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            return stripeRepository.retrievePaymentIntent(str, options, list, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrievePaymentIntent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object retrieveSetupIntent$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if (obj == null) {
            if ((i & 4) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            return stripeRepository.retrieveSetupIntent(str, options, list, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveSetupIntent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object retrieveStripeIntent$payments_core_release$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            return stripeRepository.retrieveStripeIntent$payments_core_release(str, options, list, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveStripeIntent");
    }

    public abstract Object addCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, Continuation<? super Source> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    public abstract Object attachFinancialConnectionsSessionToPaymentIntent(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super PaymentIntent> continuation);

    public abstract Object attachFinancialConnectionsSessionToSetupIntent(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super SetupIntent> continuation);

    public abstract Object attachPaymentMethod(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, Continuation<? super PaymentMethod> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    public abstract Object cancelPaymentIntentSource$payments_core_release(String str, String str2, ApiRequest.Options options, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    public abstract Object cancelSetupIntentSource$payments_core_release(String str, String str2, ApiRequest.Options options, Continuation<? super SetupIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    public abstract Object complete3ds2Auth$payments_core_release(String str, ApiRequest.Options options, Continuation<? super Stripe3ds2AuthResult> continuation);

    public abstract Object confirmPaymentIntent$payments_core_release(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    public abstract Object confirmSetupIntent$payments_core_release(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super SetupIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    public abstract Object consumerSignUp(String str, String str2, String str3, String str4, Locale locale, String str5, ConsumerSignUpConsentAction consumerSignUpConsentAction, ApiRequest.Options options, Continuation<? super ConsumerSession> continuation);

    public abstract Object createFile$payments_core_release(StripeFileParams stripeFileParams, ApiRequest.Options options, Continuation<? super StripeFile> continuation);

    public abstract Object createLinkFinancialConnectionsSession(String str, ApiRequest.Options options, Continuation<? super FinancialConnectionsSession> continuation);

    public abstract Object createPaymentDetails(String str, ConsumerPaymentDetailsCreateParams consumerPaymentDetailsCreateParams, ApiRequest.Options options, Continuation<? super ConsumerPaymentDetails> continuation);

    public abstract Object createPaymentDetails(String str, String str2, ApiRequest.Options options, Continuation<? super ConsumerPaymentDetails> continuation);

    /* renamed from: createPaymentIntentFinancialConnectionsSession$payments_core_release */
    public abstract Object mo45462x3a63d1f9(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super FinancialConnectionsSession> continuation);

    public abstract Object createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, ApiRequest.Options options, Continuation<? super PaymentMethod> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    public abstract Object createRadarSession$payments_core_release(ApiRequest.Options options, Continuation<? super RadarSession> continuation);

    /* renamed from: createSetupIntentFinancialConnectionsSession$payments_core_release */
    public abstract Object mo45461x9b93a6a2(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super FinancialConnectionsSession> continuation);

    public abstract Object createSource$payments_core_release(SourceParams sourceParams, ApiRequest.Options options, Continuation<? super Source> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    public abstract Object createToken$payments_core_release(TokenParams tokenParams, ApiRequest.Options options, Continuation<? super Token> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    public abstract Object deleteCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, Continuation<? super Source> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    public abstract Object deletePaymentDetails(String str, String str2, ApiRequest.Options options, Continuation<? super Unit> continuation);

    public abstract Object detachPaymentMethod(String str, Set<String> set, String str2, ApiRequest.Options options, Continuation<? super PaymentMethod> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    public abstract Object getCardMetadata$payments_core_release(Bin bin, ApiRequest.Options options, Continuation<? super CardMetadata> continuation);

    public abstract Object getFpxBankStatus$payments_core_release(ApiRequest.Options options, Continuation<? super BankStatuses> continuation);

    public abstract Object getPaymentMethods(ListPaymentMethodsParams listPaymentMethodsParams, String str, Set<String> set, ApiRequest.Options options, Continuation<? super List<PaymentMethod>> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    public abstract Object listPaymentDetails(String str, Set<String> set, ApiRequest.Options options, Continuation<? super ConsumerPaymentDetails> continuation);

    public abstract Object logoutConsumer(String str, String str2, ApiRequest.Options options, Continuation<? super ConsumerSession> continuation);

    public abstract Object refreshPaymentIntent$payments_core_release(String str, ApiRequest.Options options, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    public abstract Object retrieveCardMetadata(String str, ApiRequest.Options options, Continuation<? super CardMetadata> continuation);

    public abstract Object retrieveCustomer(String str, Set<String> set, ApiRequest.Options options, Continuation<? super Customer> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    public abstract Object retrieveElementsSession(ElementsSessionParams elementsSessionParams, ApiRequest.Options options, Continuation<? super ElementsSession> continuation);

    public abstract Object retrieveIssuingCardPin$payments_core_release(String str, String str2, String str3, ApiRequest.Options options, Continuation<? super String> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException, JSONException;

    public abstract Object retrieveObject$payments_core_release(String str, ApiRequest.Options options, Continuation<? super StripeResponse<String>> continuation);

    public abstract Object retrievePaymentIntent(String str, ApiRequest.Options options, List<String> list, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    public abstract Object retrievePaymentMethodMessage(List<String> list, int i, String str, String str2, String str3, String str4, ApiRequest.Options options, Continuation<? super PaymentMethodMessage> continuation);

    public abstract Object retrieveSetupIntent(String str, ApiRequest.Options options, List<String> list, Continuation<? super SetupIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    public abstract Object retrieveSource$payments_core_release(String str, String str2, ApiRequest.Options options, Continuation<? super Source> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    public abstract Object retrieveStripeIntent$payments_core_release(String str, ApiRequest.Options options, List<String> list, Continuation<? super StripeIntent> continuation);

    public abstract Object setCustomerShippingInfo$payments_core_release(String str, String str2, Set<String> set, ShippingInformation shippingInformation, ApiRequest.Options options, Continuation<? super Customer> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    public abstract Object setDefaultCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, Continuation<? super Customer> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    public abstract Object start3ds2Auth$payments_core_release(Stripe3ds2AuthParams stripe3ds2AuthParams, ApiRequest.Options options, Continuation<? super Stripe3ds2AuthResult> continuation);

    public abstract Object updateIssuingCardPin$payments_core_release(String str, String str2, String str3, String str4, ApiRequest.Options options, Continuation<? super Unit> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    public abstract Object updatePaymentDetails(String str, ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, ApiRequest.Options options, Continuation<? super ConsumerPaymentDetails> continuation);

    public abstract Object verifyPaymentIntentWithMicrodeposits(String str, int i, int i2, ApiRequest.Options options, Continuation<? super PaymentIntent> continuation);

    public abstract Object verifyPaymentIntentWithMicrodeposits(String str, String str2, ApiRequest.Options options, Continuation<? super PaymentIntent> continuation);

    public abstract Object verifySetupIntentWithMicrodeposits(String str, int i, int i2, ApiRequest.Options options, Continuation<? super SetupIntent> continuation);

    public abstract Object verifySetupIntentWithMicrodeposits(String str, String str2, ApiRequest.Options options, Continuation<? super SetupIntent> continuation);
}
