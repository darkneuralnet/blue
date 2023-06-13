package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.ApiKeyValidator;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.exception.CardException;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.AccountParams;
import com.stripe.android.model.BankAccountTokenParams;
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
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fB1\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000fB)\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012B5\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J2\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0007J$\u0010-\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010-\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u001e\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010&\u001a\u00020'2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005H\u0007J$\u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00102\u001a\u0002032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u00101\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u00102\u001a\u0002032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u001e\u00104\u001a\u0004\u0018\u0001052\u0006\u00102\u001a\u0002032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005H\u0007J*\u00106\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u0002070+H\u0007J6\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010<\u001a\u0004\u0018\u00010;2\u0006\u00109\u001a\u00020:2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020?2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010@\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020?2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020C2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010D\u001a\u0004\u0018\u00010;2\u0006\u0010B\u001a\u00020C2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J8\u0010E\u001a\u00020\u001e2\b\b\u0001\u0010F\u001a\u00020\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010G\u001a\u0004\u0018\u00010;2\u0006\u0010F\u001a\u00020\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020J2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020K0+H\u0007J(\u0010L\u001a\u00020K2\u0006\u0010I\u001a\u00020J2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010M\u001a\u00020\u001e2\u0006\u0010N\u001a\u00020O2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020P0+H\u0007J*\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010N\u001a\u00020O2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010R\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020T2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010U\u001a\u0004\u0018\u00010;2\u0006\u0010S\u001a\u00020T2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010V\u001a\u00020\u001e2\u0006\u0010W\u001a\u00020\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010X\u001a\u0004\u0018\u00010;2\u0006\u0010W\u001a\u00020\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\"\u0010Y\u001a\u00020\u001e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020Z0+H\u0007J6\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020]2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0+H\u0007J*\u0010^\u001a\u0004\u0018\u00010\"2\u0006\u0010S\u001a\u00020]2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J4\u0010_\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0002J:\u0010b\u001a\u00020\u001e\"\b\b\u0000\u0010c*\u00020d2\f\u0010e\u001a\b\u0012\u0004\u0012\u0002Hc0f2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002Hc0+H\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010gJH\u0010h\u001a\u00020\u001e\"\b\b\u0000\u0010c*\u00020d2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002Hc0+2\u001e\u0010i\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001Hc0k\u0012\u0006\u0012\u0004\u0018\u00010\u00010jH\u0002ø\u0001\u0000¢\u0006\u0002\u0010lJ$\u0010m\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010m\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010o\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010o\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010p\u001a\u00020\b2\u0006\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010tJ\u0018\u0010u\u001a\u00020\b2\u0006\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010tJ\u0018\u0010v\u001a\u00020\b2\u0006\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010tJ\u001c\u0010w\u001a\u00020\u001e2\u0006\u0010s\u001a\u00020t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0+J(\u0010x\u001a\u00020\b2\u0006\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0007J(\u0010y\u001a\u00020\b2\u0006\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020z0+H\u0007J:\u0010{\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00050}2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020/0+H\u0007J.\u0010~\u001a\u0004\u0018\u00010/2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00050}H\u0007J\u001e\u0010\u007f\u001a\u00020\u001e2\u0007\u0010\u0080\u0001\u001a\u00020\u00052\r\u0010*\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010+J;\u0010\u0082\u0001\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00050}2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002050+H\u0007J/\u0010\u0083\u0001\u001a\u0004\u0018\u0001052\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00050}H\u0007J8\u0010\u0084\u0001\u001a\u00020\u001e2\t\b\u0001\u0010\u0085\u0001\u001a\u00020\u00052\b\b\u0001\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0+H\u0007J,\u0010\u0086\u0001\u001a\u0004\u0018\u00010\"2\t\b\u0001\u0010\u0085\u0001\u001a\u00020\u00052\b\b\u0001\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J1\u0010\u0087\u0001\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\u0007\u0010\u0088\u0001\u001a\u00020r2\u0007\u0010\u0089\u0001\u001a\u00020r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020/0+H\u0007J(\u0010\u0087\u0001\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\u0007\u0010\u008a\u0001\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020/0+H\u0007J1\u0010\u008b\u0001\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\u0007\u0010\u0088\u0001\u001a\u00020r2\u0007\u0010\u0089\u0001\u001a\u00020r2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002050+H\u0007J(\u0010\u008b\u0001\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\u0007\u0010\u008a\u0001\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u0002050+H\u0007R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008d\u0001"}, m28432d2 = {"Lcom/stripe/android/Stripe;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, NamedConstantsKt.ENABLE_LOGGING, "", "betas", "", "Lcom/stripe/android/StripeApiBeta;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;)V", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Z)V", "paymentController", "Lcom/stripe/android/PaymentController;", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;)V", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "getPaymentController$payments_core_release", "()Lcom/stripe/android/PaymentController;", "getPublishableKey$payments_core_release", "()Ljava/lang/String;", "getStripeAccountId$payments_core_release", "getStripeRepository$payments_core_release", "()Lcom/stripe/android/networking/StripeRepository;", "authenticateSource", "", "activity", "Landroidx/activity/ComponentActivity;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lcom/stripe/android/model/Source;", "fragment", "Landroidx/fragment/app/Fragment;", "confirmAlipayPayment", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "callback", "Lcom/stripe/android/ApiResultCallback;", "Lcom/stripe/android/PaymentIntentResult;", "confirmPayment", "confirmPaymentIntentSynchronous", "Lcom/stripe/android/model/PaymentIntent;", "idempotencyKey", "confirmSetupIntent", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntentSynchronous", "Lcom/stripe/android/model/SetupIntent;", "confirmWeChatPayPayment", "Lcom/stripe/android/model/WeChatPayNextAction;", "createAccountToken", "accountParams", "Lcom/stripe/android/model/AccountParams;", "Lcom/stripe/android/model/Token;", "createAccountTokenSynchronous", "createBankAccountToken", "bankAccountTokenParams", "Lcom/stripe/android/model/BankAccountTokenParams;", "createBankAccountTokenSynchronous", "createCardToken", "cardParams", "Lcom/stripe/android/model/CardParams;", "createCardTokenSynchronous", "createCvcUpdateToken", "cvc", "createCvcUpdateTokenSynchronous", "createFile", "fileParams", "Lcom/stripe/android/core/model/StripeFileParams;", "Lcom/stripe/android/core/model/StripeFile;", "createFileSynchronous", "createPaymentMethod", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethodSynchronous", "createPersonToken", "params", "Lcom/stripe/android/model/PersonTokenParams;", "createPersonTokenSynchronous", "createPiiToken", "personalId", "createPiiTokenSynchronous", "createRadarSession", "Lcom/stripe/android/model/RadarSession;", "createSource", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "createSourceSynchronous", "createToken", "tokenParams", "Lcom/stripe/android/model/TokenParams;", "dispatchResult", "T", "Lcom/stripe/android/core/model/StripeModel;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Result;", "(Ljava/lang/Object;Lcom/stripe/android/ApiResultCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeAsync", "apiMethod", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V", "handleNextActionForPayment", "clientSecret", "handleNextActionForSetupIntent", "isAuthenticateSourceResult", "requestCode", "", MessageExtension.FIELD_DATA, "Landroid/content/Intent;", "isPaymentResult", "isSetupResult", "onAuthenticateSourceResult", "onPaymentResult", "onSetupResult", "Lcom/stripe/android/SetupIntentResult;", "retrievePaymentIntent", "expand", "", "retrievePaymentIntentSynchronous", "retrievePossibleBrands", "cardNumber", "Lcom/stripe/android/model/PossibleBrands;", "retrieveSetupIntent", "retrieveSetupIntentSynchronous", "retrieveSource", "sourceId", "retrieveSourceSynchronous", "verifyPaymentIntentWithMicrodeposits", "firstAmount", "secondAmount", "descriptorCode", "verifySetupIntentWithMicrodeposits", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class Stripe {
    public static final String VERSION = "AndroidBindings/20.21.0";
    public static final String VERSION_NAME = "20.21.0";
    private static AppInfo appInfo;
    private final PaymentController paymentController;
    private final String publishableKey;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    public static final String API_VERSION = ApiVersion.Companion.get().getCode();
    private static boolean advancedFraudSignalsEnabled = true;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.Stripe$1 */
    /* loaded from: classes6.dex */
    public static final class C186111 extends Lambda implements Function0<String> {
        final /* synthetic */ String $publishableKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186111(String str) {
            super(0);
            this.$publishableKey = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$publishableKey;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.Stripe$2 */
    /* loaded from: classes6.dex */
    public static final class C186122 extends Lambda implements Function0<String> {
        final /* synthetic */ String $publishableKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186122(String str) {
            super(0);
            this.$publishableKey = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$publishableKey;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/Stripe$Companion;", "", "()V", "API_VERSION", "", "VERSION", "getVERSION$annotations", CoreConstants.VERSION_NAME_KEY, "getVERSION_NAME$annotations", "advancedFraudSignalsEnabled", "", "getAdvancedFraudSignalsEnabled$annotations", "getAdvancedFraudSignalsEnabled", "()Z", "setAdvancedFraudSignalsEnabled", "(Z)V", "appInfo", "Lcom/stripe/android/core/AppInfo;", "getAppInfo$annotations", "getAppInfo", "()Lcom/stripe/android/core/AppInfo;", "setAppInfo", "(Lcom/stripe/android/core/AppInfo;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getAdvancedFraudSignalsEnabled$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getAppInfo$annotations() {
        }

        @Deprecated(message = "Use StripeSdkVersion.VERSION instead", replaceWith = @ReplaceWith(expression = "StripeSdkVersion.VERSION", imports = {"com.stripe.android.core.version.StripeSdkVersion"}))
        public static /* synthetic */ void getVERSION$annotations() {
        }

        @Deprecated(message = "Use StripeSdkVersion.VERSION_NAME instead", replaceWith = @ReplaceWith(expression = "StripeSdkVersion.VERSION_NAME", imports = {"com.stripe.android.core.version.StripeSdkVersion"}))
        public static /* synthetic */ void getVERSION_NAME$annotations() {
        }

        public final boolean getAdvancedFraudSignalsEnabled() {
            return Stripe.advancedFraudSignalsEnabled;
        }

        public final AppInfo getAppInfo() {
            return Stripe.appInfo;
        }

        public final void setAdvancedFraudSignalsEnabled(boolean z) {
            Stripe.advancedFraudSignalsEnabled = z;
        }

        public final void setAppInfo(AppInfo appInfo) {
            Stripe.appInfo = appInfo;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Stripe(Context context, String publishableKey) {
        this(context, publishableKey, (String) null, false, (Set) null, 28, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }

    public static /* synthetic */ void authenticateSource$default(Stripe stripe, ComponentActivity componentActivity, Source source, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.authenticateSource(componentActivity, source, str);
    }

    public static /* synthetic */ void confirmAlipayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmAlipayPayment(confirmPaymentIntentParams, alipayAuthenticator, str, apiResultCallback);
    }

    public static /* synthetic */ void confirmPayment$default(Stripe stripe, ComponentActivity componentActivity, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmPayment(componentActivity, confirmPaymentIntentParams, str);
    }

    public static /* synthetic */ PaymentIntent confirmPaymentIntentSynchronous$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        return stripe.confirmPaymentIntentSynchronous(confirmPaymentIntentParams, str);
    }

    public static /* synthetic */ void confirmSetupIntent$default(Stripe stripe, ComponentActivity componentActivity, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmSetupIntent(componentActivity, confirmSetupIntentParams, str);
    }

    public static /* synthetic */ SetupIntent confirmSetupIntentSynchronous$default(Stripe stripe, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        return stripe.confirmSetupIntentSynchronous(confirmSetupIntentParams, str);
    }

    public static /* synthetic */ void confirmWeChatPayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmWeChatPayPayment(confirmPaymentIntentParams, str, apiResultCallback);
    }

    public static /* synthetic */ void createAccountToken$default(Stripe stripe, AccountParams accountParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createAccountToken(accountParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Token createAccountTokenSynchronous$default(Stripe stripe, AccountParams accountParams, String str, String str2, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createAccountTokenSynchronous(accountParams, str, str2);
    }

    public static /* synthetic */ void createBankAccountToken$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createBankAccountToken(bankAccountTokenParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Token createBankAccountTokenSynchronous$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createBankAccountTokenSynchronous(bankAccountTokenParams, str, str2);
    }

    public static /* synthetic */ void createCardToken$default(Stripe stripe, CardParams cardParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createCardToken(cardParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Token createCardTokenSynchronous$default(Stripe stripe, CardParams cardParams, String str, String str2, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createCardTokenSynchronous(cardParams, str, str2);
    }

    public static /* synthetic */ void createCvcUpdateToken$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.createCvcUpdateToken(str, str2, str3, apiResultCallback);
    }

    public static /* synthetic */ Token createCvcUpdateTokenSynchronous$default(Stripe stripe, String str, String str2, String str3, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.createCvcUpdateTokenSynchronous(str, str2, str3);
    }

    public static /* synthetic */ void createFile$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createFile(stripeFileParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ StripeFile createFileSynchronous$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createFileSynchronous(stripeFileParams, str, str2);
    }

    public static /* synthetic */ void createPaymentMethod$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createPaymentMethod(paymentMethodCreateParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ PaymentMethod createPaymentMethodSynchronous$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, int i, Object obj) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createPaymentMethodSynchronous(paymentMethodCreateParams, str, str2);
    }

    public static /* synthetic */ void createPersonToken$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createPersonToken(personTokenParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Token createPersonTokenSynchronous$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createPersonTokenSynchronous(personTokenParams, str, str2);
    }

    public static /* synthetic */ void createPiiToken$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.createPiiToken(str, str2, str3, apiResultCallback);
    }

    public static /* synthetic */ Token createPiiTokenSynchronous$default(Stripe stripe, String str, String str2, String str3, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.createPiiTokenSynchronous(str, str2, str3);
    }

    public static /* synthetic */ void createRadarSession$default(Stripe stripe, String str, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.createRadarSession(str, apiResultCallback);
    }

    public static /* synthetic */ void createSource$default(Stripe stripe, SourceParams sourceParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createSource(sourceParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Source createSourceSynchronous$default(Stripe stripe, SourceParams sourceParams, String str, String str2, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createSourceSynchronous(sourceParams, str, str2);
    }

    private final void createToken(TokenParams tokenParams, String str, String str2, ApiResultCallback<? super Token> apiResultCallback) {
        executeAsync(apiResultCallback, new Stripe$createToken$1(this, tokenParams, str, str2, null));
    }

    public static /* synthetic */ void createToken$default(Stripe stripe, TokenParams tokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        stripe.createToken(tokenParams, str, str2, apiResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends StripeModel> Object dispatchResult(Object obj, ApiResultCallback<? super T> apiResultCallback, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(T41.m84376c(), new Stripe$dispatchResult$2(obj, apiResultCallback, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m77504g == coroutine_suspended ? m77504g : Unit.INSTANCE;
    }

    private final <T extends StripeModel> void executeAsync(ApiResultCallback<? super T> apiResultCallback, Function1<? super Continuation<? super T>, ? extends Object> function1) {
        Z30.m73800d(C37824aD0.m71790a(this.workContext), null, null, new Stripe$executeAsync$1(this, apiResultCallback, function1, null), 3, null);
    }

    public static final boolean getAdvancedFraudSignalsEnabled() {
        return Companion.getAdvancedFraudSignalsEnabled();
    }

    public static final AppInfo getAppInfo() {
        return Companion.getAppInfo();
    }

    public static /* synthetic */ void handleNextActionForPayment$default(Stripe stripe, ComponentActivity componentActivity, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForPayment(componentActivity, str, str2);
    }

    public static /* synthetic */ void handleNextActionForSetupIntent$default(Stripe stripe, ComponentActivity componentActivity, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForSetupIntent(componentActivity, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void retrievePaymentIntent$default(Stripe stripe, String str, String str2, List list, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        stripe.retrievePaymentIntent(str, str2, list, apiResultCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentIntent retrievePaymentIntentSynchronous$default(Stripe stripe, String str, String str2, List list, int i, Object obj) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        return stripe.retrievePaymentIntentSynchronous(str, str2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void retrieveSetupIntent$default(Stripe stripe, String str, String str2, List list, ApiResultCallback apiResultCallback, int i, Object obj) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        stripe.retrieveSetupIntent(str, str2, list, apiResultCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetupIntent retrieveSetupIntentSynchronous$default(Stripe stripe, String str, String str2, List list, int i, Object obj) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        return stripe.retrieveSetupIntentSynchronous(str, str2, list);
    }

    public static /* synthetic */ void retrieveSource$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.retrieveSource(str, str2, str3, apiResultCallback);
    }

    public static /* synthetic */ Source retrieveSourceSynchronous$default(Stripe stripe, String str, String str2, String str3, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.retrieveSourceSynchronous(str, str2, str3);
    }

    public static final void setAdvancedFraudSignalsEnabled(boolean z) {
        Companion.setAdvancedFraudSignalsEnabled(z);
    }

    public static final void setAppInfo(AppInfo appInfo2) {
        Companion.setAppInfo(appInfo2);
    }

    @JvmOverloads
    public final void authenticateSource(ComponentActivity activity, Source source) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(source, "source");
        authenticateSource$default(this, activity, source, (String) null, 4, (Object) null);
    }

    @JvmOverloads
    public final void confirmAlipayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator authenticator, ApiResultCallback<? super PaymentIntentResult> callback) {
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        Intrinsics.checkNotNullParameter(callback, "callback");
        confirmAlipayPayment$default(this, confirmPaymentIntentParams, authenticator, null, callback, 4, null);
    }

    @JvmOverloads
    public final void confirmPayment(ComponentActivity activity, ConfirmPaymentIntentParams confirmPaymentIntentParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        confirmPayment$default(this, activity, confirmPaymentIntentParams, (String) null, 4, (Object) null);
    }

    @Deprecated(message = "use {@link #confirmPayment(Activity, ConfirmPaymentIntentParams)}")
    @JvmOverloads
    public final PaymentIntent confirmPaymentIntentSynchronous(ConfirmPaymentIntentParams confirmPaymentIntentParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        return confirmPaymentIntentSynchronous$default(this, confirmPaymentIntentParams, null, 2, null);
    }

    @JvmOverloads
    public final void confirmSetupIntent(ComponentActivity activity, ConfirmSetupIntentParams confirmSetupIntentParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        confirmSetupIntent$default(this, activity, confirmSetupIntentParams, (String) null, 4, (Object) null);
    }

    @Deprecated(message = "use {@link #confirmSetupIntent(Activity, ConfirmSetupIntentParams)}")
    @JvmOverloads
    public final SetupIntent confirmSetupIntentSynchronous(ConfirmSetupIntentParams confirmSetupIntentParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        return confirmSetupIntentSynchronous$default(this, confirmSetupIntentParams, null, 2, null);
    }

    @Deprecated(message = "Use the WeChat Pay module instead.")
    @JvmOverloads
    public final void confirmWeChatPayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiResultCallback<? super WeChatPayNextAction> callback) {
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        confirmWeChatPayPayment$default(this, confirmPaymentIntentParams, null, callback, 2, null);
    }

    @JvmOverloads
    public final void createAccountToken(AccountParams accountParams, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createAccountToken$default(this, accountParams, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final Token createAccountTokenSynchronous(AccountParams accountParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        return createAccountTokenSynchronous$default(this, accountParams, null, null, 6, null);
    }

    @JvmOverloads
    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createBankAccountToken$default(this, bankAccountTokenParams, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        return createBankAccountTokenSynchronous$default(this, bankAccountTokenParams, null, null, 6, null);
    }

    @JvmOverloads
    public final void createCardToken(CardParams cardParams, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createCardToken$default(this, cardParams, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final Token createCardTokenSynchronous(CardParams cardParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        return createCardTokenSynchronous$default(this, cardParams, null, null, 6, null);
    }

    @JvmOverloads
    public final void createCvcUpdateToken(String cvc, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createCvcUpdateToken$default(this, cvc, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final Token createCvcUpdateTokenSynchronous(String cvc) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        return createCvcUpdateTokenSynchronous$default(this, cvc, null, null, 6, null);
    }

    @JvmOverloads
    public final void createFile(StripeFileParams fileParams, ApiResultCallback<? super StripeFile> callback) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createFile$default(this, fileParams, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final StripeFile createFileSynchronous(StripeFileParams fileParams) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        return createFileSynchronous$default(this, fileParams, null, null, 6, null);
    }

    @JvmOverloads
    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, ApiResultCallback<? super PaymentMethod> callback) {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPaymentMethod$default(this, paymentMethodCreateParams, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        return createPaymentMethodSynchronous$default(this, paymentMethodCreateParams, null, null, 6, null);
    }

    @JvmOverloads
    public final void createPersonToken(PersonTokenParams params, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPersonToken$default(this, params, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final Token createPersonTokenSynchronous(PersonTokenParams params) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Intrinsics.checkNotNullParameter(params, "params");
        return createPersonTokenSynchronous$default(this, params, null, null, 6, null);
    }

    @JvmOverloads
    public final void createPiiToken(String personalId, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPiiToken$default(this, personalId, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final Token createPiiTokenSynchronous(String personalId) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        return createPiiTokenSynchronous$default(this, personalId, null, null, 6, null);
    }

    @JvmOverloads
    public final void createRadarSession(ApiResultCallback<? super RadarSession> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        createRadarSession$default(this, null, callback, 1, null);
    }

    @JvmOverloads
    public final void createSource(SourceParams sourceParams, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createSource$default(this, sourceParams, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final Source createSourceSynchronous(SourceParams params) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Intrinsics.checkNotNullParameter(params, "params");
        return createSourceSynchronous$default(this, params, null, null, 6, null);
    }

    public final PaymentController getPaymentController$payments_core_release() {
        return this.paymentController;
    }

    public final String getPublishableKey$payments_core_release() {
        return this.publishableKey;
    }

    public final String getStripeAccountId$payments_core_release() {
        return this.stripeAccountId;
    }

    public final StripeRepository getStripeRepository$payments_core_release() {
        return this.stripeRepository;
    }

    @JvmOverloads
    public final void handleNextActionForPayment(ComponentActivity activity, String clientSecret) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        handleNextActionForPayment$default(this, activity, clientSecret, (String) null, 4, (Object) null);
    }

    @JvmOverloads
    public final void handleNextActionForSetupIntent(ComponentActivity activity, String clientSecret) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        handleNextActionForSetupIntent$default(this, activity, clientSecret, (String) null, 4, (Object) null);
    }

    public final boolean isAuthenticateSourceResult(int i, Intent intent) {
        return intent != null && this.paymentController.shouldHandleSourceResult(i, intent);
    }

    public final boolean isPaymentResult(int i, Intent intent) {
        return intent != null && this.paymentController.shouldHandlePaymentResult(i, intent);
    }

    public final boolean isSetupResult(int i, Intent intent) {
        return intent != null && this.paymentController.shouldHandleSetupResult(i, intent);
    }

    public final void onAuthenticateSourceResult(Intent data, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$onAuthenticateSourceResult$1(this, data, null));
    }

    public final boolean onPaymentResult(int i, Intent intent, ApiResultCallback<? super PaymentIntentResult> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (intent != null && isPaymentResult(i, intent)) {
            executeAsync(callback, new Stripe$onPaymentResult$1(this, intent, null));
            return true;
        }
        return false;
    }

    public final boolean onSetupResult(int i, Intent intent, ApiResultCallback<? super SetupIntentResult> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (intent != null && isSetupResult(i, intent)) {
            executeAsync(callback, new Stripe$onSetupResult$1(this, intent, null));
            return true;
        }
        return false;
    }

    @JvmOverloads
    public final void retrievePaymentIntent(String clientSecret, ApiResultCallback<? super PaymentIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        retrievePaymentIntent$default(this, clientSecret, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final PaymentIntent retrievePaymentIntentSynchronous(String clientSecret) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return retrievePaymentIntentSynchronous$default(this, clientSecret, null, null, 6, null);
    }

    public final void retrievePossibleBrands(String cardNumber, ApiResultCallback<? super PossibleBrands> callback) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (new CardNumber.Unvalidated(cardNumber).getBin() == null) {
            callback.onError(new InvalidRequestException(null, null, 0, "cardNumber cannot be less than 6 characters", null, 23, null));
        } else {
            executeAsync(callback, new Stripe$retrievePossibleBrands$2(this, cardNumber, null));
        }
    }

    @JvmOverloads
    public final void retrieveSetupIntent(String clientSecret, ApiResultCallback<? super SetupIntent> callback) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        retrieveSetupIntent$default(this, clientSecret, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final SetupIntent retrieveSetupIntentSynchronous(String clientSecret) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return retrieveSetupIntentSynchronous$default(this, clientSecret, null, null, 6, null);
    }

    @JvmOverloads
    public final void retrieveSource(String sourceId, String clientSecret, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        retrieveSource$default(this, sourceId, clientSecret, null, callback, 4, null);
    }

    @JvmOverloads
    public final Source retrieveSourceSynchronous(String sourceId, String clientSecret) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return retrieveSourceSynchronous$default(this, sourceId, clientSecret, null, 4, null);
    }

    @JvmOverloads
    public final void verifyPaymentIntentWithMicrodeposits(String clientSecret, int i, int i2, ApiResultCallback<? super PaymentIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$verifyPaymentIntentWithMicrodeposits$1(this, clientSecret, i, i2, null));
    }

    @JvmOverloads
    public final void verifySetupIntentWithMicrodeposits(String clientSecret, int i, int i2, ApiResultCallback<? super SetupIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$verifySetupIntentWithMicrodeposits$1(this, clientSecret, i, i2, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Stripe(Context context, String publishableKey, String str) {
        this(context, publishableKey, str, false, (Set) null, 24, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }

    @JvmOverloads
    public final void authenticateSource(Fragment fragment, Source source) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(source, "source");
        authenticateSource$default(this, fragment, source, (String) null, 4, (Object) null);
    }

    @JvmOverloads
    public final void confirmAlipayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator authenticator, String str, ApiResultCallback<? super PaymentIntentResult> callback) {
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$confirmAlipayPayment$1(this, confirmPaymentIntentParams, authenticator, str, null));
    }

    @JvmOverloads
    public final void confirmPayment(Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        confirmPayment$default(this, fragment, confirmPaymentIntentParams, (String) null, 4, (Object) null);
    }

    @Deprecated(message = "use {@link #confirmPayment(Activity, ConfirmPaymentIntentParams)}")
    @JvmOverloads
    public final PaymentIntent confirmPaymentIntentSynchronous(ConfirmPaymentIntentParams confirmPaymentIntentParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        m75794b = Y30.m75794b(null, new Stripe$confirmPaymentIntentSynchronous$1(this, confirmPaymentIntentParams, str, null), 1, null);
        return (PaymentIntent) m75794b;
    }

    @JvmOverloads
    public final void confirmSetupIntent(Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        confirmSetupIntent$default(this, fragment, confirmSetupIntentParams, (String) null, 4, (Object) null);
    }

    @Deprecated(message = "use {@link #confirmSetupIntent(Activity, ConfirmSetupIntentParams)}")
    @JvmOverloads
    public final SetupIntent confirmSetupIntentSynchronous(ConfirmSetupIntentParams confirmSetupIntentParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        m75794b = Y30.m75794b(null, new Stripe$confirmSetupIntentSynchronous$1(this, confirmSetupIntentParams, str, null), 1, null);
        return (SetupIntent) m75794b;
    }

    @Deprecated(message = "Use the WeChat Pay module instead.")
    @JvmOverloads
    public final void confirmWeChatPayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, ApiResultCallback<? super WeChatPayNextAction> callback) {
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$confirmWeChatPayPayment$1(this, confirmPaymentIntentParams, str, null));
    }

    @JvmOverloads
    public final void createAccountToken(AccountParams accountParams, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createAccountToken$default(this, accountParams, str, null, callback, 4, null);
    }

    @JvmOverloads
    public final Token createAccountTokenSynchronous(AccountParams accountParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        return createAccountTokenSynchronous$default(this, accountParams, str, null, 4, null);
    }

    @JvmOverloads
    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createBankAccountToken$default(this, bankAccountTokenParams, str, null, callback, 4, null);
    }

    @JvmOverloads
    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        return createBankAccountTokenSynchronous$default(this, bankAccountTokenParams, str, null, 4, null);
    }

    @JvmOverloads
    public final void createCardToken(CardParams cardParams, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createCardToken$default(this, cardParams, str, null, callback, 4, null);
    }

    @JvmOverloads
    public final Token createCardTokenSynchronous(CardParams cardParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        return createCardTokenSynchronous$default(this, cardParams, str, null, 4, null);
    }

    @JvmOverloads
    public final void createCvcUpdateToken(String cvc, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createCvcUpdateToken$default(this, cvc, str, null, callback, 4, null);
    }

    @JvmOverloads
    public final Token createCvcUpdateTokenSynchronous(String cvc, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        return createCvcUpdateTokenSynchronous$default(this, cvc, str, null, 4, null);
    }

    @JvmOverloads
    public final void createFile(StripeFileParams fileParams, String str, ApiResultCallback<? super StripeFile> callback) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createFile$default(this, fileParams, str, null, callback, 4, null);
    }

    @JvmOverloads
    public final StripeFile createFileSynchronous(StripeFileParams fileParams, String str) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        return createFileSynchronous$default(this, fileParams, str, null, 4, null);
    }

    @JvmOverloads
    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, String str, ApiResultCallback<? super PaymentMethod> callback) {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPaymentMethod$default(this, paymentMethodCreateParams, str, null, callback, 4, null);
    }

    @JvmOverloads
    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams, String str) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        return createPaymentMethodSynchronous$default(this, paymentMethodCreateParams, str, null, 4, null);
    }

    @JvmOverloads
    public final void createPersonToken(PersonTokenParams params, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPersonToken$default(this, params, str, null, callback, 4, null);
    }

    @JvmOverloads
    public final Token createPersonTokenSynchronous(PersonTokenParams params, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Intrinsics.checkNotNullParameter(params, "params");
        return createPersonTokenSynchronous$default(this, params, str, null, 4, null);
    }

    @JvmOverloads
    public final void createPiiToken(String personalId, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPiiToken$default(this, personalId, str, null, callback, 4, null);
    }

    @JvmOverloads
    public final Token createPiiTokenSynchronous(String personalId, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        return createPiiTokenSynchronous$default(this, personalId, str, null, 4, null);
    }

    @JvmOverloads
    public final void createRadarSession(String str, ApiResultCallback<? super RadarSession> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$createRadarSession$1(this, str, null));
    }

    @JvmOverloads
    public final void createSource(SourceParams sourceParams, String str, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createSource$default(this, sourceParams, str, null, callback, 4, null);
    }

    @JvmOverloads
    public final Source createSourceSynchronous(SourceParams params, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Intrinsics.checkNotNullParameter(params, "params");
        return createSourceSynchronous$default(this, params, str, null, 4, null);
    }

    @JvmOverloads
    public final void handleNextActionForPayment(Fragment fragment, String clientSecret) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        handleNextActionForPayment$default(this, fragment, clientSecret, (String) null, 4, (Object) null);
    }

    @JvmOverloads
    public final void handleNextActionForSetupIntent(Fragment fragment, String clientSecret) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        handleNextActionForSetupIntent$default(this, fragment, clientSecret, (String) null, 4, (Object) null);
    }

    @JvmOverloads
    public final void retrievePaymentIntent(String clientSecret, String str, ApiResultCallback<? super PaymentIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        retrievePaymentIntent$default(this, clientSecret, str, null, callback, 4, null);
    }

    @JvmOverloads
    public final PaymentIntent retrievePaymentIntentSynchronous(String clientSecret, String str) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return retrievePaymentIntentSynchronous$default(this, clientSecret, str, null, 4, null);
    }

    @JvmOverloads
    public final void retrieveSetupIntent(String clientSecret, String str, ApiResultCallback<? super SetupIntent> callback) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        retrieveSetupIntent$default(this, clientSecret, str, null, callback, 4, null);
    }

    @JvmOverloads
    public final SetupIntent retrieveSetupIntentSynchronous(String clientSecret, String str) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return retrieveSetupIntentSynchronous$default(this, clientSecret, str, null, 4, null);
    }

    @JvmOverloads
    public final void retrieveSource(String sourceId, String clientSecret, String str, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$retrieveSource$1(this, sourceId, clientSecret, str, null));
    }

    @JvmOverloads
    public final Source retrieveSourceSynchronous(String sourceId, String clientSecret, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        m75794b = Y30.m75794b(null, new Stripe$retrieveSourceSynchronous$1(this, sourceId, clientSecret, str, null), 1, null);
        return (Source) m75794b;
    }

    @JvmOverloads
    public final void verifyPaymentIntentWithMicrodeposits(String clientSecret, String descriptorCode, ApiResultCallback<? super PaymentIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(descriptorCode, "descriptorCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$verifyPaymentIntentWithMicrodeposits$2(this, clientSecret, descriptorCode, null));
    }

    @JvmOverloads
    public final void verifySetupIntentWithMicrodeposits(String clientSecret, String descriptorCode, ApiResultCallback<? super SetupIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(descriptorCode, "descriptorCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$verifySetupIntentWithMicrodeposits$2(this, clientSecret, descriptorCode, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Stripe(Context context, String publishableKey, String str, boolean z) {
        this(context, publishableKey, str, z, (Set) null, 16, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }

    public static /* synthetic */ void authenticateSource$default(Stripe stripe, Fragment fragment, Source source, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.authenticateSource(fragment, source, str);
    }

    public static /* synthetic */ void confirmPayment$default(Stripe stripe, Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmPayment(fragment, confirmPaymentIntentParams, str);
    }

    public static /* synthetic */ void confirmSetupIntent$default(Stripe stripe, Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmSetupIntent(fragment, confirmSetupIntentParams, str);
    }

    public static /* synthetic */ void handleNextActionForPayment$default(Stripe stripe, Fragment fragment, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForPayment(fragment, str, str2);
    }

    public static /* synthetic */ void handleNextActionForSetupIntent$default(Stripe stripe, Fragment fragment, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForSetupIntent(fragment, str, str2);
    }

    @JvmOverloads
    public final void authenticateSource(ComponentActivity activity, Source source, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(source, "source");
        Z30.m73800d(C33163Gq2.m104689a(activity), null, null, new Stripe$authenticateSource$1(this, activity, source, str, null), 3, null);
    }

    @JvmOverloads
    public final void confirmPayment(ComponentActivity activity, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        Z30.m73800d(C33163Gq2.m104689a(activity), null, null, new Stripe$confirmPayment$1(this, activity, confirmPaymentIntentParams, str, null), 3, null);
    }

    @JvmOverloads
    public final void confirmSetupIntent(ComponentActivity activity, ConfirmSetupIntentParams confirmSetupIntentParams, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        Z30.m73800d(C33163Gq2.m104689a(activity), null, null, new Stripe$confirmSetupIntent$1(this, activity, confirmSetupIntentParams, str, null), 3, null);
    }

    @JvmOverloads
    public final void createAccountToken(AccountParams accountParams, String str, String str2, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(accountParams, str2, str, callback);
    }

    @JvmOverloads
    public final Token createAccountTokenSynchronous(AccountParams accountParams, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        try {
            m75794b = Y30.m75794b(null, new Stripe$createAccountTokenSynchronous$1(this, accountParams, str2, str, null), 1, null);
            return (Token) m75794b;
        } catch (CardException unused) {
            return null;
        }
    }

    @JvmOverloads
    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, String str, String str2, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(bankAccountTokenParams, str2, str, callback);
    }

    @JvmOverloads
    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        m75794b = Y30.m75794b(null, new Stripe$createBankAccountTokenSynchronous$1(this, bankAccountTokenParams, str2, str, null), 1, null);
        return (Token) m75794b;
    }

    @JvmOverloads
    public final void createCardToken(CardParams cardParams, String str, String str2, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(cardParams, str2, str, callback);
    }

    @JvmOverloads
    public final Token createCardTokenSynchronous(CardParams cardParams, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        m75794b = Y30.m75794b(null, new Stripe$createCardTokenSynchronous$1(this, cardParams, str2, str, null), 1, null);
        return (Token) m75794b;
    }

    @JvmOverloads
    public final void createCvcUpdateToken(String cvc, String str, String str2, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(new CvcTokenParams(cvc), str2, str, callback);
    }

    @JvmOverloads
    public final Token createCvcUpdateTokenSynchronous(String cvc, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        m75794b = Y30.m75794b(null, new Stripe$createCvcUpdateTokenSynchronous$1(this, cvc, str2, str, null), 1, null);
        return (Token) m75794b;
    }

    @JvmOverloads
    public final void createFile(StripeFileParams fileParams, String str, String str2, ApiResultCallback<? super StripeFile> callback) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$createFile$1(this, fileParams, str2, str, null));
    }

    @JvmOverloads
    public final StripeFile createFileSynchronous(StripeFileParams fileParams, String str, String str2) {
        Object m75794b;
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        m75794b = Y30.m75794b(null, new Stripe$createFileSynchronous$1(this, fileParams, str2, str, null), 1, null);
        return (StripeFile) m75794b;
    }

    @JvmOverloads
    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, ApiResultCallback<? super PaymentMethod> callback) {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$createPaymentMethod$1(this, paymentMethodCreateParams, str2, str, null));
    }

    @JvmOverloads
    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        m75794b = Y30.m75794b(null, new Stripe$createPaymentMethodSynchronous$1(this, paymentMethodCreateParams, str2, str, null), 1, null);
        return (PaymentMethod) m75794b;
    }

    @JvmOverloads
    public final void createPersonToken(PersonTokenParams params, String str, String str2, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(params, str2, str, callback);
    }

    @JvmOverloads
    public final Token createPersonTokenSynchronous(PersonTokenParams params, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(params, "params");
        m75794b = Y30.m75794b(null, new Stripe$createPersonTokenSynchronous$1(this, params, str2, str, null), 1, null);
        return (Token) m75794b;
    }

    @JvmOverloads
    public final void createPiiToken(String personalId, String str, String str2, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(new PiiTokenParams(personalId), str2, str, callback);
    }

    @JvmOverloads
    public final Token createPiiTokenSynchronous(String personalId, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        m75794b = Y30.m75794b(null, new Stripe$createPiiTokenSynchronous$1(this, personalId, str2, str, null), 1, null);
        return (Token) m75794b;
    }

    @JvmOverloads
    public final void createSource(SourceParams sourceParams, String str, String str2, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$createSource$1(this, sourceParams, str2, str, null));
    }

    @JvmOverloads
    public final Source createSourceSynchronous(SourceParams params, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(params, "params");
        m75794b = Y30.m75794b(null, new Stripe$createSourceSynchronous$1(this, params, str2, str, null), 1, null);
        return (Source) m75794b;
    }

    @JvmOverloads
    public final void handleNextActionForPayment(ComponentActivity activity, String clientSecret, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Z30.m73800d(C33163Gq2.m104689a(activity), null, null, new Stripe$handleNextActionForPayment$1(this, activity, clientSecret, str, null), 3, null);
    }

    @JvmOverloads
    public final void handleNextActionForSetupIntent(ComponentActivity activity, String clientSecret, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Z30.m73800d(C33163Gq2.m104689a(activity), null, null, new Stripe$handleNextActionForSetupIntent$1(this, activity, clientSecret, str, null), 3, null);
    }

    @JvmOverloads
    public final void retrievePaymentIntent(String clientSecret, String str, List<String> expand, ApiResultCallback<? super PaymentIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$retrievePaymentIntent$1(this, clientSecret, str, expand, null));
    }

    @JvmOverloads
    public final PaymentIntent retrievePaymentIntentSynchronous(String clientSecret, String str, List<String> expand) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(expand, "expand");
        m75794b = Y30.m75794b(null, new Stripe$retrievePaymentIntentSynchronous$1(this, clientSecret, str, expand, null), 1, null);
        return (PaymentIntent) m75794b;
    }

    @JvmOverloads
    public final void retrieveSetupIntent(String clientSecret, String str, List<String> expand, ApiResultCallback<? super SetupIntent> callback) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsync(callback, new Stripe$retrieveSetupIntent$1(this, clientSecret, str, expand, null));
    }

    @JvmOverloads
    public final SetupIntent retrieveSetupIntentSynchronous(String clientSecret, String str, List<String> expand) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Object m75794b;
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(expand, "expand");
        m75794b = Y30.m75794b(null, new Stripe$retrieveSetupIntentSynchronous$1(this, clientSecret, str, expand, null), 1, null);
        return (SetupIntent) m75794b;
    }

    public Stripe(StripeRepository stripeRepository, PaymentController paymentController, String publishableKey, String str, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentController, "paymentController");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.paymentController = paymentController;
        this.stripeAccountId = str;
        this.workContext = workContext;
        this.publishableKey = new ApiKeyValidator().requireValid(publishableKey);
    }

    @JvmOverloads
    public final void authenticateSource(Fragment fragment, Source source, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(source, "source");
        C33163Gq2.m104689a(fragment).m389b(new Stripe$authenticateSource$2(this, fragment, source, str, null));
    }

    @JvmOverloads
    public final void confirmPayment(Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        Z30.m73800d(C33163Gq2.m104689a(fragment), null, null, new Stripe$confirmPayment$2(this, fragment, confirmPaymentIntentParams, str, null), 3, null);
    }

    @JvmOverloads
    public final void confirmSetupIntent(Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        Z30.m73800d(C33163Gq2.m104689a(fragment), null, null, new Stripe$confirmSetupIntent$2(this, fragment, confirmSetupIntentParams, str, null), 3, null);
    }

    @JvmOverloads
    public final void handleNextActionForPayment(Fragment fragment, String clientSecret, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Z30.m73800d(C33163Gq2.m104689a(fragment), null, null, new Stripe$handleNextActionForPayment$2(this, fragment, clientSecret, str, null), 3, null);
    }

    @JvmOverloads
    public final void handleNextActionForSetupIntent(Fragment fragment, String clientSecret, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Z30.m73800d(C33163Gq2.m104689a(fragment), null, null, new Stripe$handleNextActionForSetupIntent$2(this, fragment, clientSecret, str, null), 3, null);
    }

    public /* synthetic */ Stripe(StripeRepository stripeRepository, PaymentController paymentController, String str, String str2, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeRepository, paymentController, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? T41.m84377b() : coroutineContext);
    }

    public /* synthetic */ Stripe(Context context, String str, String str2, boolean z, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? SetsKt__SetsKt.emptySet() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Stripe(Context context, String publishableKey, String str, boolean z, Set<? extends StripeApiBeta> betas) {
        this(r15, new StripeApiRepository(r4, new C186111(publishableKey), appInfo, Logger.Companion.getInstance(z), null, null, null, null, null, null, null, null, betas, null, null, 28656, null), ApiKeyValidator.Companion.get().requireValid(publishableKey), str, z);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(betas, "betas");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Stripe(Context context, StripeRepository stripeRepository, String str, String str2, boolean z) {
        this(stripeRepository, new StripePaymentController(r2, new C186122(str), stripeRepository, z, null, null, null, null, null, 496, null), str, str2);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe(StripeRepository stripeRepository, PaymentController paymentController, String publishableKey, String str) {
        this(stripeRepository, paymentController, publishableKey, str, T41.m84377b());
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentController, "paymentController");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }
}
