package com.stripe.android;

import android.content.Intent;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.exception.CardException;
import com.stripe.android.model.AccountParams;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.CvcTokenParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PersonTokenParams;
import com.stripe.android.model.PiiTokenParams;
import com.stripe.android.model.PossibleBrands;
import com.stripe.android.model.RadarSession;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Token;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Ð\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001a*\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0004H\u0082\b¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001a1\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010\u0012\u001a)\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010\u0016\u001a9\u0010\u0017\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0086@ø\u0001\u0001¢\u0006\u0002\u0010\u001d\u001a)\u0010\u001e\u001a\u00020\u001f*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010\u0016\u001a5\u0010 \u001a\u00020!*\u00020\u000b2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010$\u001a5\u0010%\u001a\u00020!*\u00020\u000b2\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010(\u001a5\u0010)\u001a\u00020!*\u00020\u000b2\u0006\u0010*\u001a\u00020+2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010,\u001a7\u0010-\u001a\u00020!*\u00020\u000b2\b\b\u0001\u0010.\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010/\u001a5\u00100\u001a\u000201*\u00020\u000b2\u0006\u00102\u001a\u0002032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u00104\u001a5\u00105\u001a\u000206*\u00020\u000b2\u0006\u00107\u001a\u0002082\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u00109\u001a5\u0010:\u001a\u00020!*\u00020\u000b2\u0006\u0010;\u001a\u00020<2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010=\u001a5\u0010>\u001a\u00020!*\u00020\u000b2\u0006\u0010?\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010/\u001a\u0015\u0010@\u001a\u00020A*\u00020\u000bH\u0086@ø\u0001\u0001¢\u0006\u0002\u0010B\u001a5\u0010C\u001a\u00020D*\u00020\u000b2\u0006\u0010E\u001a\u00020F2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010G\u001a%\u0010H\u001a\u00020D*\u00020\u000b2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0086@ø\u0001\u0001¢\u0006\u0002\u0010M\u001a%\u0010N\u001a\u00020\n*\u00020\u000b2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0086@ø\u0001\u0001¢\u0006\u0002\u0010M\u001a%\u0010O\u001a\u00020P*\u00020\u000b2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0086@ø\u0001\u0001¢\u0006\u0002\u0010M\u001a9\u0010Q\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010R\u001a\u00020\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0086@ø\u0001\u0001¢\u0006\u0002\u0010S\u001a\u001d\u0010T\u001a\u00020U*\u00020\u000b2\u0006\u0010V\u001a\u00020\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010W\u001a9\u0010X\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010R\u001a\u00020\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0086@ø\u0001\u0001¢\u0006\u0002\u0010S\u001a5\u0010Y\u001a\u00020D*\u00020\u000b2\b\b\u0001\u0010Z\u001a\u00020\u00112\b\b\u0001\u0010R\u001a\u00020\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010/\u001a-\u0010[\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010R\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020J2\u0006\u0010]\u001a\u00020JH\u0086@ø\u0001\u0001¢\u0006\u0002\u0010^\u001a%\u0010[\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010R\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010`\u001a-\u0010a\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010R\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020J2\u0006\u0010]\u001a\u00020JH\u0086@ø\u0001\u0001¢\u0006\u0002\u0010^\u001a%\u0010a\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010R\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u0011H\u0086@ø\u0001\u0001¢\u0006\u0002\u0010`\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006b"}, m28432d2 = {"runApiRequest", "ApiObject", "Lcom/stripe/android/core/model/StripeModel;", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/core/model/StripeModel;", "isValidParam", "", "(ZLkotlin/jvm/functions/Function0;)Lcom/stripe/android/core/model/StripeModel;", "confirmAlipayPayment", "Lcom/stripe/android/PaymentIntentResult;", "Lcom/stripe/android/Stripe;", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "idempotencyKey", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "expand", "", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmWeChatPayPayment", "Lcom/stripe/android/model/WeChatPayNextAction;", "createAccountToken", "Lcom/stripe/android/model/Token;", "accountParams", "Lcom/stripe/android/model/AccountParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBankAccountToken", "bankAccountTokenParams", "Lcom/stripe/android/model/BankAccountTokenParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCardToken", "cardParams", "Lcom/stripe/android/model/CardParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCvcUpdateToken", "cvc", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createFile", "Lcom/stripe/android/core/model/StripeFile;", "fileParams", "Lcom/stripe/android/core/model/StripeFileParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPersonToken", "params", "Lcom/stripe/android/model/PersonTokenParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPiiToken", "personalId", "createRadarSession", "Lcom/stripe/android/model/RadarSession;", "(Lcom/stripe/android/Stripe;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSource", "Lcom/stripe/android/model/Source;", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuthenticateSourceResult", "requestCode", "", MessageExtension.FIELD_DATA, "Landroid/content/Intent;", "(Lcom/stripe/android/Stripe;ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentIntentResult", "getSetupIntentResult", "Lcom/stripe/android/SetupIntentResult;", "retrievePaymentIntent", "clientSecret", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrievePossibleBrands", "Lcom/stripe/android/model/PossibleBrands;", "cardNumber", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSetupIntent", "retrieveSource", "sourceId", "verifyPaymentIntentWithMicrodeposits", "firstAmount", "secondAmount", "(Lcom/stripe/android/Stripe;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "descriptorCode", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifySetupIntentWithMicrodeposits", "payments-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nStripeKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeKtx.kt\ncom/stripe/android/StripeKtxKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1014:1\n690#1,5:1015\n690#1,5:1021\n690#1,5:1027\n690#1,5:1033\n690#1,5:1039\n690#1,5:1045\n690#1,5:1051\n690#1,5:1057\n690#1,5:1063\n690#1,5:1069\n690#1,5:1075\n690#1,5:1081\n690#1,5:1087\n690#1,5:1093\n690#1,5:1099\n690#1,5:1105\n800#1,6:1112\n800#1,6:1119\n800#1,6:1126\n690#1,5:1134\n690#1,5:1140\n690#1,5:1146\n690#1,5:1152\n690#1,2:1158\n692#1,3:1164\n1#2:1020\n1#2:1026\n1#2:1032\n1#2:1038\n1#2:1044\n1#2:1050\n1#2:1056\n1#2:1062\n1#2:1068\n1#2:1074\n1#2:1080\n1#2:1086\n1#2:1092\n1#2:1098\n1#2:1104\n1#2:1110\n1#2:1111\n1#2:1118\n1#2:1125\n1#2:1132\n1#2:1133\n1#2:1139\n1#2:1145\n1#2:1151\n1#2:1157\n1#2:1167\n1549#3:1160\n1620#3,3:1161\n*S KotlinDebug\n*F\n+ 1 StripeKtx.kt\ncom/stripe/android/StripeKtxKt\n*L\n62#1:1015,5\n101#1:1021,5\n140#1:1027,5\n179#1:1033,5\n218#1:1039,5\n257#1:1045,5\n298#1:1051,5\n336#1:1057,5\n376#1:1063,5\n417#1:1069,5\n447#1:1075,5\n485#1:1081,5\n524#1:1087,5\n563#1:1093,5\n601#1:1099,5\n671#1:1105,5\n719#1:1112,6\n751#1:1119,6\n782#1:1126,6\n839#1:1134,5\n880#1:1140,5\n923#1:1146,5\n964#1:1152,5\n991#1:1158,2\n991#1:1164,3\n62#1:1020\n101#1:1026\n140#1:1032\n179#1:1038\n218#1:1044\n257#1:1050\n298#1:1056\n336#1:1062\n376#1:1068\n417#1:1074\n447#1:1080\n485#1:1086\n524#1:1092\n563#1:1098\n601#1:1104\n671#1:1110\n719#1:1118\n751#1:1125\n782#1:1132\n839#1:1139\n880#1:1145\n923#1:1151\n964#1:1157\n991#1:1167\n1004#1:1160\n1004#1:1161,3\n*E\n"})
/* loaded from: classes6.dex */
public final class StripeKtxKt {
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        r11 = kotlin.Result.Companion;
        r10 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object confirmAlipayPayment(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, Continuation<? super PaymentIntentResult> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$confirmAlipayPayment$1 stripeKtxKt$confirmAlipayPayment$1;
        Object coroutine_suspended;
        int i;
        PaymentIntentResult paymentIntentResult;
        if (continuation instanceof StripeKtxKt$confirmAlipayPayment$1) {
            stripeKtxKt$confirmAlipayPayment$1 = (StripeKtxKt$confirmAlipayPayment$1) continuation;
            int i2 = stripeKtxKt$confirmAlipayPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$confirmAlipayPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$confirmAlipayPayment$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$confirmAlipayPayment$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    PaymentController paymentController$payments_core_release = stripe.getPaymentController$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str, null, 4, null);
                    stripeKtxKt$confirmAlipayPayment$1.label = 1;
                    obj = paymentController$payments_core_release.confirmAndAuthenticateAlipay(confirmPaymentIntentParams, alipayAuthenticator, options, stripeKtxKt$confirmAlipayPayment$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                paymentIntentResult = (PaymentIntentResult) obj;
                if (paymentIntentResult == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(paymentIntentResult);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = PaymentIntentResult.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$confirmAlipayPayment$1 = new StripeKtxKt$confirmAlipayPayment$1(continuation);
        Object obj2 = stripeKtxKt$confirmAlipayPayment$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$confirmAlipayPayment$1.label;
        if (i == 0) {
        }
        paymentIntentResult = (PaymentIntentResult) obj2;
        if (paymentIntentResult == null) {
        }
    }

    public static /* synthetic */ Object confirmAlipayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 4) != 0) {
            str = stripe.getStripeAccountId$payments_core_release();
        }
        return confirmAlipayPayment(stripe, confirmPaymentIntentParams, alipayAuthenticator, str, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        r9 = kotlin.Result.Companion;
        r8 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:11:0x0026, B:19:0x0055, B:21:0x0059, B:22:0x005e, B:23:0x0083, B:16:0x0035), top: B:32:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:11:0x0026, B:19:0x0055, B:21:0x0059, B:22:0x005e, B:23:0x0083, B:16:0x0035), top: B:32:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object confirmPaymentIntent(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$confirmPaymentIntent$1 stripeKtxKt$confirmPaymentIntent$1;
        Object coroutine_suspended;
        int i;
        PaymentIntent paymentIntent;
        if (continuation instanceof StripeKtxKt$confirmPaymentIntent$1) {
            stripeKtxKt$confirmPaymentIntent$1 = (StripeKtxKt$confirmPaymentIntent$1) continuation;
            int i2 = stripeKtxKt$confirmPaymentIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$confirmPaymentIntent$1.label = i2 - Integer.MIN_VALUE;
                StripeKtxKt$confirmPaymentIntent$1 stripeKtxKt$confirmPaymentIntent$12 = stripeKtxKt$confirmPaymentIntent$1;
                Object obj = stripeKtxKt$confirmPaymentIntent$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$confirmPaymentIntent$12.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), stripe.getStripeAccountId$payments_core_release(), str);
                    stripeKtxKt$confirmPaymentIntent$12.label = 1;
                    obj = StripeRepository.confirmPaymentIntent$payments_core_release$default(stripeRepository$payments_core_release, confirmPaymentIntentParams, options, null, stripeKtxKt$confirmPaymentIntent$12, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                paymentIntent = (PaymentIntent) obj;
                if (paymentIntent == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(paymentIntent);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = PaymentIntent.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$confirmPaymentIntent$1 = new StripeKtxKt$confirmPaymentIntent$1(continuation);
        StripeKtxKt$confirmPaymentIntent$1 stripeKtxKt$confirmPaymentIntent$122 = stripeKtxKt$confirmPaymentIntent$1;
        Object obj2 = stripeKtxKt$confirmPaymentIntent$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$confirmPaymentIntent$122.label;
        if (i == 0) {
        }
        paymentIntent = (PaymentIntent) obj2;
        if (paymentIntent == null) {
        }
    }

    public static /* synthetic */ Object confirmPaymentIntent$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        return confirmPaymentIntent(stripe, confirmPaymentIntentParams, str, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        r6 = kotlin.Result.Companion;
        r5 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:11:0x0025, B:19:0x0050, B:21:0x0054, B:22:0x0059, B:23:0x007e, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:11:0x0025, B:19:0x0050, B:21:0x0054, B:22:0x0059, B:23:0x007e, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object confirmSetupIntent(Stripe stripe, ConfirmSetupIntentParams confirmSetupIntentParams, String str, List<String> list, Continuation<? super SetupIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$confirmSetupIntent$1 stripeKtxKt$confirmSetupIntent$1;
        Object coroutine_suspended;
        int i;
        SetupIntent setupIntent;
        if (continuation instanceof StripeKtxKt$confirmSetupIntent$1) {
            stripeKtxKt$confirmSetupIntent$1 = (StripeKtxKt$confirmSetupIntent$1) continuation;
            int i2 = stripeKtxKt$confirmSetupIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$confirmSetupIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$confirmSetupIntent$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$confirmSetupIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), stripe.getStripeAccountId$payments_core_release(), str);
                    stripeKtxKt$confirmSetupIntent$1.label = 1;
                    obj = stripeRepository$payments_core_release.confirmSetupIntent$payments_core_release(confirmSetupIntentParams, options, list, stripeKtxKt$confirmSetupIntent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                setupIntent = (SetupIntent) obj;
                if (setupIntent == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(setupIntent);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = SetupIntent.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$confirmSetupIntent$1 = new StripeKtxKt$confirmSetupIntent$1(continuation);
        Object obj2 = stripeKtxKt$confirmSetupIntent$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$confirmSetupIntent$1.label;
        if (i == 0) {
        }
        setupIntent = (SetupIntent) obj2;
        if (setupIntent == null) {
        }
    }

    public static /* synthetic */ Object confirmSetupIntent$default(Stripe stripe, ConfirmSetupIntentParams confirmSetupIntentParams, String str, List list, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        return confirmSetupIntent(stripe, confirmSetupIntentParams, str, list, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)(2:16|17)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        r11 = kotlin.Result.Companion;
        r10 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object confirmWeChatPayPayment(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation<? super WeChatPayNextAction> continuation) {
        StripeKtxKt$confirmWeChatPayPayment$1 stripeKtxKt$confirmWeChatPayPayment$1;
        Object coroutine_suspended;
        int i;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof StripeKtxKt$confirmWeChatPayPayment$1) {
            stripeKtxKt$confirmWeChatPayPayment$1 = (StripeKtxKt$confirmWeChatPayPayment$1) continuation;
            int i2 = stripeKtxKt$confirmWeChatPayPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$confirmWeChatPayPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$confirmWeChatPayPayment$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$confirmWeChatPayPayment$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    PaymentController paymentController$payments_core_release = stripe.getPaymentController$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str, null, 4, null);
                    stripeKtxKt$confirmWeChatPayPayment$1.label = 1;
                    obj = paymentController$payments_core_release.confirmWeChatPay(confirmPaymentIntentParams, options, stripeKtxKt$confirmWeChatPayPayment$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Object m116783constructorimpl = Result.m116783constructorimpl((WeChatPayNextAction) obj);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    return m116783constructorimpl;
                }
                throw StripeException.Companion.create(m116786exceptionOrNullimpl);
            }
        }
        stripeKtxKt$confirmWeChatPayPayment$1 = new StripeKtxKt$confirmWeChatPayPayment$1(continuation);
        Object obj2 = stripeKtxKt$confirmWeChatPayPayment$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$confirmWeChatPayPayment$1.label;
        if (i == 0) {
        }
        Object m116783constructorimpl2 = Result.m116783constructorimpl((WeChatPayNextAction) obj2);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
        if (m116786exceptionOrNullimpl != null) {
        }
    }

    public static /* synthetic */ Object confirmWeChatPayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = stripe.getStripeAccountId$payments_core_release();
        }
        return confirmWeChatPayPayment(stripe, confirmPaymentIntentParams, str, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createAccountToken(Stripe stripe, AccountParams accountParams, String str, String str2, Continuation<? super Token> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$createAccountToken$1 stripeKtxKt$createAccountToken$1;
        Object coroutine_suspended;
        int i;
        Token token;
        if (continuation instanceof StripeKtxKt$createAccountToken$1) {
            stripeKtxKt$createAccountToken$1 = (StripeKtxKt$createAccountToken$1) continuation;
            int i2 = stripeKtxKt$createAccountToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$createAccountToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$createAccountToken$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$createAccountToken$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str2, str);
                    stripeKtxKt$createAccountToken$1.label = 1;
                    obj = stripeRepository$payments_core_release.createToken$payments_core_release(accountParams, options, stripeKtxKt$createAccountToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                token = (Token) obj;
                if (token == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(token);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = Token.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$createAccountToken$1 = new StripeKtxKt$createAccountToken$1(continuation);
        Object obj2 = stripeKtxKt$createAccountToken$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$createAccountToken$1.label;
        if (i == 0) {
        }
        token = (Token) obj2;
        if (token == null) {
        }
    }

    public static /* synthetic */ Object createAccountToken$default(Stripe stripe, AccountParams accountParams, String str, String str2, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createAccountToken(stripe, accountParams, str, str2, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createBankAccountToken(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, Continuation<? super Token> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$createBankAccountToken$1 stripeKtxKt$createBankAccountToken$1;
        Object coroutine_suspended;
        int i;
        Token token;
        if (continuation instanceof StripeKtxKt$createBankAccountToken$1) {
            stripeKtxKt$createBankAccountToken$1 = (StripeKtxKt$createBankAccountToken$1) continuation;
            int i2 = stripeKtxKt$createBankAccountToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$createBankAccountToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$createBankAccountToken$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$createBankAccountToken$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str2, str);
                    stripeKtxKt$createBankAccountToken$1.label = 1;
                    obj = stripeRepository$payments_core_release.createToken$payments_core_release(bankAccountTokenParams, options, stripeKtxKt$createBankAccountToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                token = (Token) obj;
                if (token == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(token);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = Token.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$createBankAccountToken$1 = new StripeKtxKt$createBankAccountToken$1(continuation);
        Object obj2 = stripeKtxKt$createBankAccountToken$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$createBankAccountToken$1.label;
        if (i == 0) {
        }
        token = (Token) obj2;
        if (token == null) {
        }
    }

    public static /* synthetic */ Object createBankAccountToken$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createBankAccountToken(stripe, bankAccountTokenParams, str, str2, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createCardToken(Stripe stripe, CardParams cardParams, String str, String str2, Continuation<? super Token> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException {
        StripeKtxKt$createCardToken$1 stripeKtxKt$createCardToken$1;
        Object coroutine_suspended;
        int i;
        Token token;
        if (continuation instanceof StripeKtxKt$createCardToken$1) {
            stripeKtxKt$createCardToken$1 = (StripeKtxKt$createCardToken$1) continuation;
            int i2 = stripeKtxKt$createCardToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$createCardToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$createCardToken$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$createCardToken$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str2, str);
                    stripeKtxKt$createCardToken$1.label = 1;
                    obj = stripeRepository$payments_core_release.createToken$payments_core_release(cardParams, options, stripeKtxKt$createCardToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                token = (Token) obj;
                if (token == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(token);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = Token.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$createCardToken$1 = new StripeKtxKt$createCardToken$1(continuation);
        Object obj2 = stripeKtxKt$createCardToken$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$createCardToken$1.label;
        if (i == 0) {
        }
        token = (Token) obj2;
        if (token == null) {
        }
    }

    public static /* synthetic */ Object createCardToken$default(Stripe stripe, CardParams cardParams, String str, String str2, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createCardToken(stripe, cardParams, str, str2, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createCvcUpdateToken(Stripe stripe, String str, String str2, String str3, Continuation<? super Token> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$createCvcUpdateToken$1 stripeKtxKt$createCvcUpdateToken$1;
        Object coroutine_suspended;
        int i;
        Token token;
        if (continuation instanceof StripeKtxKt$createCvcUpdateToken$1) {
            stripeKtxKt$createCvcUpdateToken$1 = (StripeKtxKt$createCvcUpdateToken$1) continuation;
            int i2 = stripeKtxKt$createCvcUpdateToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$createCvcUpdateToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$createCvcUpdateToken$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$createCvcUpdateToken$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    CvcTokenParams cvcTokenParams = new CvcTokenParams(str);
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str3, str2);
                    stripeKtxKt$createCvcUpdateToken$1.label = 1;
                    obj = stripeRepository$payments_core_release.createToken$payments_core_release(cvcTokenParams, options, stripeKtxKt$createCvcUpdateToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                token = (Token) obj;
                if (token == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(token);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = Token.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$createCvcUpdateToken$1 = new StripeKtxKt$createCvcUpdateToken$1(continuation);
        Object obj2 = stripeKtxKt$createCvcUpdateToken$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$createCvcUpdateToken$1.label;
        if (i == 0) {
        }
        token = (Token) obj2;
        if (token == null) {
        }
    }

    public static /* synthetic */ Object createCvcUpdateToken$default(Stripe stripe, String str, String str2, String str3, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.getStripeAccountId$payments_core_release();
        }
        return createCvcUpdateToken(stripe, str, str2, str3, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createFile(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, Continuation<? super StripeFile> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException {
        StripeKtxKt$createFile$1 stripeKtxKt$createFile$1;
        Object coroutine_suspended;
        int i;
        StripeFile stripeFile;
        if (continuation instanceof StripeKtxKt$createFile$1) {
            stripeKtxKt$createFile$1 = (StripeKtxKt$createFile$1) continuation;
            int i2 = stripeKtxKt$createFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$createFile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$createFile$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$createFile$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str2, str);
                    stripeKtxKt$createFile$1.label = 1;
                    obj = stripeRepository$payments_core_release.createFile$payments_core_release(stripeFileParams, options, stripeKtxKt$createFile$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                stripeFile = (StripeFile) obj;
                if (stripeFile == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(stripeFile);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = StripeFile.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$createFile$1 = new StripeKtxKt$createFile$1(continuation);
        Object obj2 = stripeKtxKt$createFile$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$createFile$1.label;
        if (i == 0) {
        }
        stripeFile = (StripeFile) obj2;
        if (stripeFile == null) {
        }
    }

    public static /* synthetic */ Object createFile$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createFile(stripe, stripeFileParams, str, str2, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createPaymentMethod(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation<? super PaymentMethod> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$createPaymentMethod$1 stripeKtxKt$createPaymentMethod$1;
        Object coroutine_suspended;
        int i;
        PaymentMethod paymentMethod;
        if (continuation instanceof StripeKtxKt$createPaymentMethod$1) {
            stripeKtxKt$createPaymentMethod$1 = (StripeKtxKt$createPaymentMethod$1) continuation;
            int i2 = stripeKtxKt$createPaymentMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$createPaymentMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$createPaymentMethod$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$createPaymentMethod$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str2, str);
                    stripeKtxKt$createPaymentMethod$1.label = 1;
                    obj = stripeRepository$payments_core_release.createPaymentMethod(paymentMethodCreateParams, options, stripeKtxKt$createPaymentMethod$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                paymentMethod = (PaymentMethod) obj;
                if (paymentMethod == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(paymentMethod);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = PaymentMethod.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$createPaymentMethod$1 = new StripeKtxKt$createPaymentMethod$1(continuation);
        Object obj2 = stripeKtxKt$createPaymentMethod$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$createPaymentMethod$1.label;
        if (i == 0) {
        }
        paymentMethod = (PaymentMethod) obj2;
        if (paymentMethod == null) {
        }
    }

    public static /* synthetic */ Object createPaymentMethod$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createPaymentMethod(stripe, paymentMethodCreateParams, str, str2, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createPersonToken(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, Continuation<? super Token> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$createPersonToken$1 stripeKtxKt$createPersonToken$1;
        Object coroutine_suspended;
        int i;
        Token token;
        if (continuation instanceof StripeKtxKt$createPersonToken$1) {
            stripeKtxKt$createPersonToken$1 = (StripeKtxKt$createPersonToken$1) continuation;
            int i2 = stripeKtxKt$createPersonToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$createPersonToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$createPersonToken$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$createPersonToken$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str2, str);
                    stripeKtxKt$createPersonToken$1.label = 1;
                    obj = stripeRepository$payments_core_release.createToken$payments_core_release(personTokenParams, options, stripeKtxKt$createPersonToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                token = (Token) obj;
                if (token == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(token);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = Token.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$createPersonToken$1 = new StripeKtxKt$createPersonToken$1(continuation);
        Object obj2 = stripeKtxKt$createPersonToken$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$createPersonToken$1.label;
        if (i == 0) {
        }
        token = (Token) obj2;
        if (token == null) {
        }
    }

    public static /* synthetic */ Object createPersonToken$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createPersonToken(stripe, personTokenParams, str, str2, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createPiiToken(Stripe stripe, String str, String str2, String str3, Continuation<? super Token> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$createPiiToken$1 stripeKtxKt$createPiiToken$1;
        Object coroutine_suspended;
        int i;
        Token token;
        if (continuation instanceof StripeKtxKt$createPiiToken$1) {
            stripeKtxKt$createPiiToken$1 = (StripeKtxKt$createPiiToken$1) continuation;
            int i2 = stripeKtxKt$createPiiToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$createPiiToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$createPiiToken$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$createPiiToken$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    PiiTokenParams piiTokenParams = new PiiTokenParams(str);
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str3, str2);
                    stripeKtxKt$createPiiToken$1.label = 1;
                    obj = stripeRepository$payments_core_release.createToken$payments_core_release(piiTokenParams, options, stripeKtxKt$createPiiToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                token = (Token) obj;
                if (token == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(token);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = Token.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$createPiiToken$1 = new StripeKtxKt$createPiiToken$1(continuation);
        Object obj2 = stripeKtxKt$createPiiToken$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$createPiiToken$1.label;
        if (i == 0) {
        }
        token = (Token) obj2;
        if (token == null) {
        }
    }

    public static /* synthetic */ Object createPiiToken$default(Stripe stripe, String str, String str2, String str3, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.getStripeAccountId$payments_core_release();
        }
        return createPiiToken(stripe, str, str2, str3, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        r11 = kotlin.Result.Companion;
        r10 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x0025, B:19:0x0054, B:21:0x0058, B:22:0x005d, B:23:0x0082, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x0025, B:19:0x0054, B:21:0x0058, B:22:0x005d, B:23:0x0082, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createRadarSession(Stripe stripe, Continuation<? super RadarSession> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$createRadarSession$1 stripeKtxKt$createRadarSession$1;
        Object coroutine_suspended;
        int i;
        RadarSession radarSession;
        if (continuation instanceof StripeKtxKt$createRadarSession$1) {
            stripeKtxKt$createRadarSession$1 = (StripeKtxKt$createRadarSession$1) continuation;
            int i2 = stripeKtxKt$createRadarSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$createRadarSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$createRadarSession$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$createRadarSession$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), stripe.getStripeAccountId$payments_core_release(), null, 4, null);
                    stripeKtxKt$createRadarSession$1.label = 1;
                    obj = stripeRepository$payments_core_release.createRadarSession$payments_core_release(options, stripeKtxKt$createRadarSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                radarSession = (RadarSession) obj;
                if (radarSession == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(radarSession);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = RadarSession.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$createRadarSession$1 = new StripeKtxKt$createRadarSession$1(continuation);
        Object obj2 = stripeKtxKt$createRadarSession$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$createRadarSession$1.label;
        if (i == 0) {
        }
        radarSession = (RadarSession) obj2;
        if (radarSession == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0025, B:19:0x004c, B:21:0x0050, B:22:0x0055, B:23:0x007a, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createSource(Stripe stripe, SourceParams sourceParams, String str, String str2, Continuation<? super Source> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$createSource$1 stripeKtxKt$createSource$1;
        Object coroutine_suspended;
        int i;
        Source source;
        if (continuation instanceof StripeKtxKt$createSource$1) {
            stripeKtxKt$createSource$1 = (StripeKtxKt$createSource$1) continuation;
            int i2 = stripeKtxKt$createSource$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$createSource$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$createSource$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$createSource$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str2, str);
                    stripeKtxKt$createSource$1.label = 1;
                    obj = stripeRepository$payments_core_release.createSource$payments_core_release(sourceParams, options, stripeKtxKt$createSource$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                source = (Source) obj;
                if (source == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(source);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = Source.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$createSource$1 = new StripeKtxKt$createSource$1(continuation);
        Object obj2 = stripeKtxKt$createSource$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$createSource$1.label;
        if (i == 0) {
        }
        source = (Source) obj2;
        if (source == null) {
        }
    }

    public static /* synthetic */ Object createSource$default(Stripe stripe, SourceParams sourceParams, String str, String str2, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createSource(stripe, sourceParams, str, str2, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(2:24|(1:26))(2:27|28))|11|12|(2:14|15)(2:17|18)))|31|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getAuthenticateSourceResult(Stripe stripe, int i, Intent intent, Continuation<? super Source> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$getAuthenticateSourceResult$1 stripeKtxKt$getAuthenticateSourceResult$1;
        Object coroutine_suspended;
        int i2;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof StripeKtxKt$getAuthenticateSourceResult$1) {
            stripeKtxKt$getAuthenticateSourceResult$1 = (StripeKtxKt$getAuthenticateSourceResult$1) continuation;
            int i3 = stripeKtxKt$getAuthenticateSourceResult$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$getAuthenticateSourceResult$1.label = i3 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$getAuthenticateSourceResult$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = stripeKtxKt$getAuthenticateSourceResult$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    boolean isAuthenticateSourceResult = stripe.isAuthenticateSourceResult(i, intent);
                    Result.Companion companion = Result.Companion;
                    if (isAuthenticateSourceResult) {
                        PaymentController paymentController$payments_core_release = stripe.getPaymentController$payments_core_release();
                        stripeKtxKt$getAuthenticateSourceResult$1.label = 1;
                        obj = paymentController$payments_core_release.getAuthenticateSourceResult(intent, stripeKtxKt$getAuthenticateSourceResult$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        String simpleName = Source.class.getSimpleName();
                        throw new IllegalArgumentException(("Incorrect requestCode and data for " + simpleName + InstructionFileId.DOT).toString());
                    }
                }
                Object m116783constructorimpl = Result.m116783constructorimpl((Source) obj);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    return (StripeModel) m116783constructorimpl;
                }
                throw StripeException.Companion.create(m116786exceptionOrNullimpl);
            }
        }
        stripeKtxKt$getAuthenticateSourceResult$1 = new StripeKtxKt$getAuthenticateSourceResult$1(continuation);
        Object obj2 = stripeKtxKt$getAuthenticateSourceResult$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = stripeKtxKt$getAuthenticateSourceResult$1.label;
        if (i2 == 0) {
        }
        Object m116783constructorimpl2 = Result.m116783constructorimpl((Source) obj2);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
        if (m116786exceptionOrNullimpl != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(2:24|(1:26))(2:27|28))|11|12|(2:14|15)(2:17|18)))|31|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getPaymentIntentResult(Stripe stripe, int i, Intent intent, Continuation<? super PaymentIntentResult> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$getPaymentIntentResult$1 stripeKtxKt$getPaymentIntentResult$1;
        Object coroutine_suspended;
        int i2;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof StripeKtxKt$getPaymentIntentResult$1) {
            stripeKtxKt$getPaymentIntentResult$1 = (StripeKtxKt$getPaymentIntentResult$1) continuation;
            int i3 = stripeKtxKt$getPaymentIntentResult$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$getPaymentIntentResult$1.label = i3 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$getPaymentIntentResult$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = stripeKtxKt$getPaymentIntentResult$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    boolean isPaymentResult = stripe.isPaymentResult(i, intent);
                    Result.Companion companion = Result.Companion;
                    if (isPaymentResult) {
                        PaymentController paymentController$payments_core_release = stripe.getPaymentController$payments_core_release();
                        stripeKtxKt$getPaymentIntentResult$1.label = 1;
                        obj = paymentController$payments_core_release.getPaymentIntentResult(intent, stripeKtxKt$getPaymentIntentResult$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        String simpleName = PaymentIntentResult.class.getSimpleName();
                        throw new IllegalArgumentException(("Incorrect requestCode and data for " + simpleName + InstructionFileId.DOT).toString());
                    }
                }
                Object m116783constructorimpl = Result.m116783constructorimpl((PaymentIntentResult) obj);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    return (StripeModel) m116783constructorimpl;
                }
                throw StripeException.Companion.create(m116786exceptionOrNullimpl);
            }
        }
        stripeKtxKt$getPaymentIntentResult$1 = new StripeKtxKt$getPaymentIntentResult$1(continuation);
        Object obj2 = stripeKtxKt$getPaymentIntentResult$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = stripeKtxKt$getPaymentIntentResult$1.label;
        if (i2 == 0) {
        }
        Object m116783constructorimpl2 = Result.m116783constructorimpl((PaymentIntentResult) obj2);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
        if (m116786exceptionOrNullimpl != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(2:24|(1:26))(2:27|28))|11|12|(2:14|15)(2:17|18)))|31|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        r5 = kotlin.Result.Companion;
        r4 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getSetupIntentResult(Stripe stripe, int i, Intent intent, Continuation<? super SetupIntentResult> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException {
        StripeKtxKt$getSetupIntentResult$1 stripeKtxKt$getSetupIntentResult$1;
        Object coroutine_suspended;
        int i2;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof StripeKtxKt$getSetupIntentResult$1) {
            stripeKtxKt$getSetupIntentResult$1 = (StripeKtxKt$getSetupIntentResult$1) continuation;
            int i3 = stripeKtxKt$getSetupIntentResult$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$getSetupIntentResult$1.label = i3 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$getSetupIntentResult$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = stripeKtxKt$getSetupIntentResult$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    boolean isSetupResult = stripe.isSetupResult(i, intent);
                    Result.Companion companion = Result.Companion;
                    if (isSetupResult) {
                        PaymentController paymentController$payments_core_release = stripe.getPaymentController$payments_core_release();
                        stripeKtxKt$getSetupIntentResult$1.label = 1;
                        obj = paymentController$payments_core_release.getSetupIntentResult(intent, stripeKtxKt$getSetupIntentResult$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        String simpleName = SetupIntentResult.class.getSimpleName();
                        throw new IllegalArgumentException(("Incorrect requestCode and data for " + simpleName + InstructionFileId.DOT).toString());
                    }
                }
                Object m116783constructorimpl = Result.m116783constructorimpl((SetupIntentResult) obj);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    return (StripeModel) m116783constructorimpl;
                }
                throw StripeException.Companion.create(m116786exceptionOrNullimpl);
            }
        }
        stripeKtxKt$getSetupIntentResult$1 = new StripeKtxKt$getSetupIntentResult$1(continuation);
        Object obj2 = stripeKtxKt$getSetupIntentResult$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = stripeKtxKt$getSetupIntentResult$1.label;
        if (i2 == 0) {
        }
        Object m116783constructorimpl2 = Result.m116783constructorimpl((SetupIntentResult) obj2);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
        if (m116786exceptionOrNullimpl != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        r11 = kotlin.Result.Companion;
        r10 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retrievePaymentIntent(Stripe stripe, String str, String str2, List<String> list, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$retrievePaymentIntent$1 stripeKtxKt$retrievePaymentIntent$1;
        Object coroutine_suspended;
        int i;
        PaymentIntent paymentIntent;
        if (continuation instanceof StripeKtxKt$retrievePaymentIntent$1) {
            stripeKtxKt$retrievePaymentIntent$1 = (StripeKtxKt$retrievePaymentIntent$1) continuation;
            int i2 = stripeKtxKt$retrievePaymentIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$retrievePaymentIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$retrievePaymentIntent$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$retrievePaymentIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str2, null, 4, null);
                    stripeKtxKt$retrievePaymentIntent$1.label = 1;
                    obj = stripeRepository$payments_core_release.retrievePaymentIntent(str, options, list, stripeKtxKt$retrievePaymentIntent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                paymentIntent = (PaymentIntent) obj;
                if (paymentIntent == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(paymentIntent);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = PaymentIntent.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$retrievePaymentIntent$1 = new StripeKtxKt$retrievePaymentIntent$1(continuation);
        Object obj2 = stripeKtxKt$retrievePaymentIntent$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$retrievePaymentIntent$1.label;
        if (i == 0) {
        }
        paymentIntent = (PaymentIntent) obj2;
        if (paymentIntent == null) {
        }
    }

    public static /* synthetic */ Object retrievePaymentIntent$default(Stripe stripe, String str, String str2, List list, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        return retrievePaymentIntent(stripe, str, str2, list, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(1:10)(2:34|35))(3:36|37|(2:39|(1:41))(2:42|43))|11|(1:33)(3:15|(2:18|16)|19)|(1:21)|(3:23|24|(2:26|27)(2:29|30))(2:31|32)))|46|6|7|(0)(0)|11|(1:13)|33|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00de, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00df, code lost:
        r11 = kotlin.Result.Companion;
        r10 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[Catch: all -> 0x00de, TryCatch #0 {all -> 0x00de, blocks: (B:11:0x0025, B:21:0x005f, B:23:0x0064, B:25:0x006a, B:26:0x007b, B:28:0x0081, B:31:0x0092, B:33:0x00a3, B:34:0x00a8, B:35:0x00cd, B:16:0x0034, B:18:0x0041, B:36:0x00ce, B:37:0x00dd), top: B:46:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: all -> 0x00de, TryCatch #0 {all -> 0x00de, blocks: (B:11:0x0025, B:21:0x005f, B:23:0x0064, B:25:0x006a, B:26:0x007b, B:28:0x0081, B:31:0x0092, B:33:0x00a3, B:34:0x00a8, B:35:0x00cd, B:16:0x0034, B:18:0x0041, B:36:0x00ce, B:37:0x00dd), top: B:46:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[Catch: all -> 0x00de, TryCatch #0 {all -> 0x00de, blocks: (B:11:0x0025, B:21:0x005f, B:23:0x0064, B:25:0x006a, B:26:0x007b, B:28:0x0081, B:31:0x0092, B:33:0x00a3, B:34:0x00a8, B:35:0x00cd, B:16:0x0034, B:18:0x0041, B:36:0x00ce, B:37:0x00dd), top: B:46:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retrievePossibleBrands(Stripe stripe, String str, Continuation<? super PossibleBrands> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$retrievePossibleBrands$1 stripeKtxKt$retrievePossibleBrands$1;
        Object coroutine_suspended;
        int i;
        CardMetadata cardMetadata;
        PossibleBrands possibleBrands;
        ArrayList arrayList;
        Set set;
        List list;
        List<AccountRange> accountRanges;
        int collectionSizeOrDefault;
        if (continuation instanceof StripeKtxKt$retrievePossibleBrands$1) {
            stripeKtxKt$retrievePossibleBrands$1 = (StripeKtxKt$retrievePossibleBrands$1) continuation;
            int i2 = stripeKtxKt$retrievePossibleBrands$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$retrievePossibleBrands$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$retrievePossibleBrands$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$retrievePossibleBrands$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    if (new CardNumber.Unvalidated(str).getBin() != null) {
                        StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                        ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), stripe.getStripeAccountId$payments_core_release(), null, 4, null);
                        stripeKtxKt$retrievePossibleBrands$1.label = 1;
                        obj = stripeRepository$payments_core_release.retrieveCardMetadata(str, options, stripeKtxKt$retrievePossibleBrands$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        throw new InvalidRequestException(null, null, 0, "cardNumber cannot be less than 6 characters", null, 23, null);
                    }
                }
                cardMetadata = (CardMetadata) obj;
                possibleBrands = null;
                if (cardMetadata == null && (accountRanges = cardMetadata.getAccountRanges()) != null) {
                    List<AccountRange> list2 = accountRanges;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    arrayList = new ArrayList(collectionSizeOrDefault);
                    for (AccountRange accountRange : list2) {
                        arrayList.add(accountRange.getBrand());
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    set = CollectionsKt___CollectionsKt.toSet(arrayList);
                    list = CollectionsKt___CollectionsKt.toList(set);
                    possibleBrands = new PossibleBrands(list);
                }
                if (possibleBrands == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(possibleBrands);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                throw new IllegalArgumentException(("Failed to parse " + PossibleBrands.class.getSimpleName() + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$retrievePossibleBrands$1 = new StripeKtxKt$retrievePossibleBrands$1(continuation);
        Object obj2 = stripeKtxKt$retrievePossibleBrands$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$retrievePossibleBrands$1.label;
        if (i == 0) {
        }
        cardMetadata = (CardMetadata) obj2;
        possibleBrands = null;
        if (cardMetadata == null) {
        }
        arrayList = null;
        if (arrayList != null) {
        }
        if (possibleBrands == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        r11 = kotlin.Result.Companion;
        r10 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retrieveSetupIntent(Stripe stripe, String str, String str2, List<String> list, Continuation<? super SetupIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$retrieveSetupIntent$1 stripeKtxKt$retrieveSetupIntent$1;
        Object coroutine_suspended;
        int i;
        SetupIntent setupIntent;
        if (continuation instanceof StripeKtxKt$retrieveSetupIntent$1) {
            stripeKtxKt$retrieveSetupIntent$1 = (StripeKtxKt$retrieveSetupIntent$1) continuation;
            int i2 = stripeKtxKt$retrieveSetupIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$retrieveSetupIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$retrieveSetupIntent$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$retrieveSetupIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str2, null, 4, null);
                    stripeKtxKt$retrieveSetupIntent$1.label = 1;
                    obj = stripeRepository$payments_core_release.retrieveSetupIntent(str, options, list, stripeKtxKt$retrieveSetupIntent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                setupIntent = (SetupIntent) obj;
                if (setupIntent == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(setupIntent);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = SetupIntent.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$retrieveSetupIntent$1 = new StripeKtxKt$retrieveSetupIntent$1(continuation);
        Object obj2 = stripeKtxKt$retrieveSetupIntent$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$retrieveSetupIntent$1.label;
        if (i == 0) {
        }
        setupIntent = (SetupIntent) obj2;
        if (setupIntent == null) {
        }
    }

    public static /* synthetic */ Object retrieveSetupIntent$default(Stripe stripe, String str, String str2, List list, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        return retrieveSetupIntent(stripe, str, str2, list, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        r11 = kotlin.Result.Companion;
        r10 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0025, B:19:0x0051, B:21:0x0055, B:22:0x005a, B:23:0x007f, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retrieveSource(Stripe stripe, String str, String str2, String str3, Continuation<? super Source> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$retrieveSource$1 stripeKtxKt$retrieveSource$1;
        Object coroutine_suspended;
        int i;
        Source source;
        if (continuation instanceof StripeKtxKt$retrieveSource$1) {
            stripeKtxKt$retrieveSource$1 = (StripeKtxKt$retrieveSource$1) continuation;
            int i2 = stripeKtxKt$retrieveSource$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$retrieveSource$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$retrieveSource$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$retrieveSource$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), str3, null, 4, null);
                    stripeKtxKt$retrieveSource$1.label = 1;
                    obj = stripeRepository$payments_core_release.retrieveSource$payments_core_release(str, str2, options, stripeKtxKt$retrieveSource$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                source = (Source) obj;
                if (source == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(source);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = Source.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$retrieveSource$1 = new StripeKtxKt$retrieveSource$1(continuation);
        Object obj2 = stripeKtxKt$retrieveSource$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$retrieveSource$1.label;
        if (i == 0) {
        }
        source = (Source) obj2;
        if (source == null) {
        }
    }

    public static /* synthetic */ Object retrieveSource$default(Stripe stripe, String str, String str2, String str3, Continuation continuation, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 4) != 0) {
            str3 = stripe.getStripeAccountId$payments_core_release();
        }
        return retrieveSource(stripe, str, str2, str3, continuation);
    }

    private static final /* synthetic */ <ApiObject extends StripeModel> ApiObject runApiRequest(Function0<? extends ApiObject> function0) {
        Object m116783constructorimpl;
        ApiObject invoke;
        try {
            Result.Companion companion = Result.Companion;
            invoke = function0.invoke();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (invoke != null) {
            m116783constructorimpl = Result.m116783constructorimpl(invoke);
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl == null) {
                return (ApiObject) m116783constructorimpl;
            }
            throw StripeException.Companion.create(m116786exceptionOrNullimpl);
        }
        Intrinsics.reifiedOperationMarker(4, "ApiObject");
        String simpleName = StripeModel.class.getSimpleName();
        throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        r1 = kotlin.Result.Companion;
        r0 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:11:0x0028, B:19:0x005c, B:21:0x0060, B:22:0x0065, B:23:0x008a, B:16:0x0037), top: B:32:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:11:0x0028, B:19:0x005c, B:21:0x0060, B:22:0x0065, B:23:0x008a, B:16:0x0037), top: B:32:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object verifyPaymentIntentWithMicrodeposits(Stripe stripe, String str, int i, int i2, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1 stripeKtxKt$verifyPaymentIntentWithMicrodeposits$1;
        Object coroutine_suspended;
        int i3;
        PaymentIntent paymentIntent;
        if (continuation instanceof StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1) {
            stripeKtxKt$verifyPaymentIntentWithMicrodeposits$1 = (StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1) continuation;
            int i4 = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$verifyPaymentIntentWithMicrodeposits$1.label = i4 - Integer.MIN_VALUE;
                StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1 stripeKtxKt$verifyPaymentIntentWithMicrodeposits$12 = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$1;
                Object obj = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$12.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), stripe.getStripeAccountId$payments_core_release(), null, 4, null);
                    stripeKtxKt$verifyPaymentIntentWithMicrodeposits$12.label = 1;
                    obj = stripeRepository$payments_core_release.verifyPaymentIntentWithMicrodeposits(str, i, i2, options, stripeKtxKt$verifyPaymentIntentWithMicrodeposits$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                paymentIntent = (PaymentIntent) obj;
                if (paymentIntent == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(paymentIntent);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = PaymentIntent.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$verifyPaymentIntentWithMicrodeposits$1 = new StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1(continuation);
        StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1 stripeKtxKt$verifyPaymentIntentWithMicrodeposits$122 = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$1;
        Object obj2 = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$122.label;
        if (i3 != 0) {
        }
        paymentIntent = (PaymentIntent) obj2;
        if (paymentIntent == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        r1 = kotlin.Result.Companion;
        r0 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:11:0x0028, B:19:0x005c, B:21:0x0060, B:22:0x0065, B:23:0x008a, B:16:0x0037), top: B:32:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:11:0x0028, B:19:0x005c, B:21:0x0060, B:22:0x0065, B:23:0x008a, B:16:0x0037), top: B:32:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object verifySetupIntentWithMicrodeposits(Stripe stripe, String str, int i, int i2, Continuation<? super SetupIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$verifySetupIntentWithMicrodeposits$1 stripeKtxKt$verifySetupIntentWithMicrodeposits$1;
        Object coroutine_suspended;
        int i3;
        SetupIntent setupIntent;
        if (continuation instanceof StripeKtxKt$verifySetupIntentWithMicrodeposits$1) {
            stripeKtxKt$verifySetupIntentWithMicrodeposits$1 = (StripeKtxKt$verifySetupIntentWithMicrodeposits$1) continuation;
            int i4 = stripeKtxKt$verifySetupIntentWithMicrodeposits$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$verifySetupIntentWithMicrodeposits$1.label = i4 - Integer.MIN_VALUE;
                StripeKtxKt$verifySetupIntentWithMicrodeposits$1 stripeKtxKt$verifySetupIntentWithMicrodeposits$12 = stripeKtxKt$verifySetupIntentWithMicrodeposits$1;
                Object obj = stripeKtxKt$verifySetupIntentWithMicrodeposits$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = stripeKtxKt$verifySetupIntentWithMicrodeposits$12.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), stripe.getStripeAccountId$payments_core_release(), null, 4, null);
                    stripeKtxKt$verifySetupIntentWithMicrodeposits$12.label = 1;
                    obj = stripeRepository$payments_core_release.verifySetupIntentWithMicrodeposits(str, i, i2, options, stripeKtxKt$verifySetupIntentWithMicrodeposits$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                setupIntent = (SetupIntent) obj;
                if (setupIntent == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(setupIntent);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = SetupIntent.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$verifySetupIntentWithMicrodeposits$1 = new StripeKtxKt$verifySetupIntentWithMicrodeposits$1(continuation);
        StripeKtxKt$verifySetupIntentWithMicrodeposits$1 stripeKtxKt$verifySetupIntentWithMicrodeposits$122 = stripeKtxKt$verifySetupIntentWithMicrodeposits$1;
        Object obj2 = stripeKtxKt$verifySetupIntentWithMicrodeposits$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = stripeKtxKt$verifySetupIntentWithMicrodeposits$122.label;
        if (i3 != 0) {
        }
        setupIntent = (SetupIntent) obj2;
        if (setupIntent == null) {
        }
    }

    public static final /* synthetic */ <ApiObject extends StripeModel> ApiObject runApiRequest(boolean z, Function0<? extends ApiObject> block) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.Companion;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (z) {
            m116783constructorimpl = Result.m116783constructorimpl(block.invoke());
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl == null) {
                return (ApiObject) m116783constructorimpl;
            }
            throw StripeException.Companion.create(m116786exceptionOrNullimpl);
        }
        Intrinsics.reifiedOperationMarker(4, "ApiObject");
        String simpleName = StripeModel.class.getSimpleName();
        throw new IllegalArgumentException(("Incorrect requestCode and data for " + simpleName + InstructionFileId.DOT).toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        r11 = kotlin.Result.Companion;
        r10 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x0025, B:19:0x0054, B:21:0x0058, B:22:0x005d, B:23:0x0082, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x0025, B:19:0x0054, B:21:0x0058, B:22:0x005d, B:23:0x0082, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object verifyPaymentIntentWithMicrodeposits(Stripe stripe, String str, String str2, Continuation<? super PaymentIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3 stripeKtxKt$verifyPaymentIntentWithMicrodeposits$3;
        Object coroutine_suspended;
        int i;
        PaymentIntent paymentIntent;
        if (continuation instanceof StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3) {
            stripeKtxKt$verifyPaymentIntentWithMicrodeposits$3 = (StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3) continuation;
            int i2 = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$verifyPaymentIntentWithMicrodeposits$3.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$3.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$3.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), stripe.getStripeAccountId$payments_core_release(), null, 4, null);
                    stripeKtxKt$verifyPaymentIntentWithMicrodeposits$3.label = 1;
                    obj = stripeRepository$payments_core_release.verifyPaymentIntentWithMicrodeposits(str, str2, options, stripeKtxKt$verifyPaymentIntentWithMicrodeposits$3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                paymentIntent = (PaymentIntent) obj;
                if (paymentIntent == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(paymentIntent);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = PaymentIntent.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$verifyPaymentIntentWithMicrodeposits$3 = new StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3(continuation);
        Object obj2 = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$3.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$verifyPaymentIntentWithMicrodeposits$3.label;
        if (i != 0) {
        }
        paymentIntent = (PaymentIntent) obj2;
        if (paymentIntent == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        r11 = kotlin.Result.Companion;
        r10 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x0025, B:19:0x0054, B:21:0x0058, B:22:0x005d, B:23:0x0082, B:16:0x0034), top: B:32:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x0025, B:19:0x0054, B:21:0x0058, B:22:0x005d, B:23:0x0082, B:16:0x0034), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object verifySetupIntentWithMicrodeposits(Stripe stripe, String str, String str2, Continuation<? super SetupIntent> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        StripeKtxKt$verifySetupIntentWithMicrodeposits$3 stripeKtxKt$verifySetupIntentWithMicrodeposits$3;
        Object coroutine_suspended;
        int i;
        SetupIntent setupIntent;
        if (continuation instanceof StripeKtxKt$verifySetupIntentWithMicrodeposits$3) {
            stripeKtxKt$verifySetupIntentWithMicrodeposits$3 = (StripeKtxKt$verifySetupIntentWithMicrodeposits$3) continuation;
            int i2 = stripeKtxKt$verifySetupIntentWithMicrodeposits$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeKtxKt$verifySetupIntentWithMicrodeposits$3.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeKtxKt$verifySetupIntentWithMicrodeposits$3.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeKtxKt$verifySetupIntentWithMicrodeposits$3.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository$payments_core_release = stripe.getStripeRepository$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey$payments_core_release(), stripe.getStripeAccountId$payments_core_release(), null, 4, null);
                    stripeKtxKt$verifySetupIntentWithMicrodeposits$3.label = 1;
                    obj = stripeRepository$payments_core_release.verifySetupIntentWithMicrodeposits(str, str2, options, stripeKtxKt$verifySetupIntentWithMicrodeposits$3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                setupIntent = (SetupIntent) obj;
                if (setupIntent == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl(setupIntent);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return (StripeModel) m116783constructorimpl;
                    }
                    throw StripeException.Companion.create(m116786exceptionOrNullimpl);
                }
                String simpleName = SetupIntent.class.getSimpleName();
                throw new IllegalArgumentException(("Failed to parse " + simpleName + InstructionFileId.DOT).toString());
            }
        }
        stripeKtxKt$verifySetupIntentWithMicrodeposits$3 = new StripeKtxKt$verifySetupIntentWithMicrodeposits$3(continuation);
        Object obj2 = stripeKtxKt$verifySetupIntentWithMicrodeposits$3.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeKtxKt$verifySetupIntentWithMicrodeposits$3.label;
        if (i != 0) {
        }
        setupIntent = (SetupIntent) obj2;
        if (setupIntent == null) {
        }
    }
}
