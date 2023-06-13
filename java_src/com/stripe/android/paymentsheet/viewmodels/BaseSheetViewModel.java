package com.stripe.android.paymentsheet.viewmodels;

import android.app.Application;
import androidx.lifecycle.C11747p;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.link.p042ui.inline.InlineSignupViewState;
import com.stripe.android.link.p042ui.inline.UserInput;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.PaymentOptionsState;
import com.stripe.android.paymentsheet.PaymentOptionsStateFactoryKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.forms.FormArgumentsFactory;
import com.stripe.android.paymentsheet.model.IntentKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.model.SupportedPaymentMethodKtxKt;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.p047ui.HeaderTextFactory;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.state.GooglePayState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC43640jz5;
@Metadata(m28433d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 á\u00012\u00020\u0001:\u0004á\u0001â\u0001Bg\u0012\b\u0010Þ\u0001\u001a\u00030Ý\u0001\u0012\b\u0010I\u001a\u0004\u0018\u00010H\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010X\u001a\u00020W\u0012\b\b\u0002\u0010]\u001a\u00020\\\u0012\u0006\u0010b\u001a\u00020a\u0012\u0006\u0010g\u001a\u00020f\u0012\u0006\u0010l\u001a\u00020k\u0012\u0006\u0010q\u001a\u00020p\u0012\u0006\u0010v\u001a\u00020u¢\u0006\u0006\bß\u0001\u0010à\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J3\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0005H\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\u0005H&J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\nH\u0004J\u0006\u0010\u001c\u001a\u00020\u0005J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH\u0004J\u0012\u0010\u001f\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0004J\b\u0010 \u001a\u00020\u0005H&J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!J\u0006\u0010$\u001a\u00020\u0005J\u001e\u0010'\u001a\u00020\u00052\u0016\u0010&\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070%J\u0006\u0010(\u001a\u00020\u0005J\u000e\u0010*\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020)J\u0010\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\u0003J\u0012\u0010/\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010-H&J\u0010\u00100\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010-J\u0006\u00101\u001a\u00020\u0005J\u000e\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020\fJ\u000e\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u000204J\u0010\u00109\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u000107J\u0016\u0010>\u001a\u00020=2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\fJ\u0006\u0010?\u001a\u00020\u0005J\b\u0010@\u001a\u00020\u0005H&J\u0010\u0010C\u001a\u00020\u00052\u0006\u0010B\u001a\u00020AH&J\b\u0010D\u001a\u00020\u0005H&J\u001b\u0010F\u001a\u00020\u00052\n\b\u0003\u0010E\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\bF\u0010GJ\u0014\u0010F\u001a\u00020\u00052\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003H&R\u001c\u0010I\u001a\u0004\u0018\u00010H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010N\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020R8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010]\u001a\u00020\\8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010b\u001a\u00020a8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010g\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010l\u001a\u00020k8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0017\u0010q\u001a\u00020p8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\"\u0010y\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R!\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001f\u0010\u0084\u0001\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R+\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R$\u0010\u000f\u001a\t\u0012\u0004\u0012\u00020\u000e0\u008e\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u000f\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0093\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0011\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u008e\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0011\u0010\u008f\u0001\u001a\u0006\b\u0095\u0001\u0010\u0091\u0001R>\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020:0\u00022\r\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020:0\u00028\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R)\u0010\u009e\u0001\u001a\u0014\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0003j\u0003`\u009d\u00010\u00020\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0094\u0001R1\u0010\u009f\u0001\u001a\u0014\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0003j\u0003`\u009d\u00010\u00020\u008e\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010\u008f\u0001\u001a\u0006\b \u0001\u0010\u0091\u0001R.\u0010¡\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u000204\u0018\u00010\u00020\u008e\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u008f\u0001\u001a\u0006\b¢\u0001\u0010\u0091\u0001R!\u0010¤\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010£\u00010\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010\u0094\u0001R)\u0010¥\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010£\u00010\u008e\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u008f\u0001\u001a\u0006\b¦\u0001\u0010\u0091\u0001R!\u0010¨\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010§\u00010\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010\u008f\u0001R,\u0010©\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\u0092\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010\u0094\u0001\u001a\u0006\bª\u0001\u0010«\u0001R!\u0010\u001d\u001a\t\u0012\u0004\u0012\u00020\n0\u008e\u00018\u0006¢\u0006\u000f\n\u0005\b\u001d\u0010\u008f\u0001\u001a\u0006\b¬\u0001\u0010\u0091\u0001R(\u0010®\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00ad\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R&\u0010.\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0\u008e\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b.\u0010\u008f\u0001\u001a\u0006\b²\u0001\u0010\u0091\u0001R\u001e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010\u0094\u0001R&\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u008e\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010\u008f\u0001\u001a\u0006\bµ\u0001\u0010\u0091\u0001R#\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u008e\u00018\u0006¢\u0006\u0010\n\u0006\b¶\u0001\u0010\u008f\u0001\u001a\u0006\b·\u0001\u0010\u0091\u0001R\u001e\u0010¸\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010\u0094\u0001R&\u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u008e\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u008f\u0001\u001a\u0006\bº\u0001\u0010\u0091\u0001R \u0010»\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010)0\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010\u0094\u0001R%\u0010¼\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010)0\u008e\u00018\u0006¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u008f\u0001\u001a\u0006\b½\u0001\u0010\u0091\u0001R(\u0010¾\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0092\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b¾\u0001\u0010\u0094\u0001\u001a\u0006\b¿\u0001\u0010«\u0001R \u0010À\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010\u0094\u0001R(\u0010Á\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u008e\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u008f\u0001\u001a\u0006\bÂ\u0001\u0010\u0091\u0001R#\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u00ad\u00018\u0006¢\u0006\u0010\n\u0006\bÃ\u0001\u0010¯\u0001\u001a\u0006\bÄ\u0001\u0010±\u0001R+\u0010Å\u0001\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÅ\u0001\u0010\u0085\u0001\u001a\u0006\bÆ\u0001\u0010\u0087\u0001\"\u0006\bÇ\u0001\u0010È\u0001R!\u0010Î\u0001\u001a\u00030É\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R$\u0010Ð\u0001\u001a\n\u0012\u0005\u0012\u00030Ï\u00010\u008e\u00018\u0006¢\u0006\u0010\n\u0006\bÐ\u0001\u0010\u008f\u0001\u001a\u0006\bÑ\u0001\u0010\u0091\u0001R \u0010Ó\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u008e\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010\u0091\u0001R$\u0010Ù\u0001\u001a\u0005\u0018\u00010Ô\u00018&@&X¦\u000e¢\u0006\u0010\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R\u0017\u0010Ü\u0001\u001a\u00020\f8&X¦\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001¨\u0006ã\u0001"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "Lie;", "", "", "unactivatedPaymentMethodTypes", "", "warnUnactivatedIfNeeded", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", TransferTable.COLUMN_STATE, "updateLinkPrimaryButtonUiState", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "screen", "", "isLinkAvailable", "Lcom/stripe/android/paymentsheet/state/GooglePayState;", "googlePayState", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "", "mapToHeaderTextResource", "(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/state/GooglePayState;Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Integer;", "onUserBack", "", "throwable", "onFatal", "transitionToFirstScreen", "target", "transitionTo", "transitionToAddPaymentScreen", "currentScreen", "reportNavigationEvent", "setStripeIntent", "clearErrorMessages", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "viewState", "updatePrimaryButtonForLinkSignup", "updatePrimaryButtonForLinkInline", "Lkotlin/Function1;", "block", "updateCustomPrimaryButtonUiState", "resetUSBankPrimaryButton", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "updatePrimaryButtonState", Entry.TYPE_TEXT, "updateBelowButtonText", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", BaseSheetViewModel.SAVE_SELECTION, "handlePaymentMethodSelected", "updateSelection", "toggleEditing", "visible", "setContentVisible", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "removePaymentMethod", "Lcom/stripe/android/link/ui/inline/UserInput;", "userInput", "payWithLinkInline", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;", "selectedItem", "showLinkInlineSignup", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "createFormArguments", "handleBackPressed", "onUserCancel", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "paymentResult", "onPaymentResult", "onFinish", "error", "onError", "(Ljava/lang/Integer;)V", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getConfig$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "getEventReporter$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "getCustomerRepository", "()Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "prefsRepository", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "getPrefsRepository", "()Lcom/stripe/android/paymentsheet/PrefsRepository;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "getWorkContext", "()Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "getLogger", "()Lcom/stripe/android/core/Logger;", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;", "lpmRepository", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;", "getLpmRepository", "()Lcom/stripe/android/ui/core/forms/resources/LpmRepository;", "Landroidx/lifecycle/p;", "savedStateHandle", "Landroidx/lifecycle/p;", "getSavedStateHandle", "()Landroidx/lifecycle/p;", "Lcom/stripe/android/paymentsheet/LinkHandler;", "linkHandler", "Lcom/stripe/android/paymentsheet/LinkHandler;", "getLinkHandler", "()Lcom/stripe/android/paymentsheet/LinkHandler;", "Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;", "headerTextFactory", "Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "getInjector", "()Lcom/stripe/android/core/injection/NonFallbackInjector;", "setInjector", "(Lcom/stripe/android/core/injection/NonFallbackInjector;)V", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "customerConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "getCustomerConfig$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "merchantName", "Ljava/lang/String;", "getMerchantName$paymentsheet_release", "()Ljava/lang/String;", "mostRecentError", "Ljava/lang/Throwable;", "getMostRecentError", "()Ljava/lang/Throwable;", "setMostRecentError", "(Ljava/lang/Throwable;)V", "LtP5;", "LtP5;", "getGooglePayState$paymentsheet_release", "()LtP5;", "LGX2;", "_stripeIntent", "LGX2;", "getStripeIntent$paymentsheet_release", "value", "supportedPaymentMethods", "Ljava/util/List;", "getSupportedPaymentMethods$paymentsheet_release", "()Ljava/util/List;", "setSupportedPaymentMethods$paymentsheet_release", "(Ljava/util/List;)V", "Lcom/stripe/android/model/PaymentMethodCode;", "_supportedPaymentMethodsFlow", "supportedPaymentMethodsFlow", "getSupportedPaymentMethodsFlow", "paymentMethods", "getPaymentMethods$paymentsheet_release", "Lcom/stripe/android/ui/core/Amount;", "_amount", "amount", "getAmount$paymentsheet_release", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "savedSelection", "backStack", "getBackStack", "()LGX2;", "getCurrentScreen", "LEu1;", "headerText", "LEu1;", "getHeaderText$paymentsheet_release", "()LEu1;", "getSelection$paymentsheet_release", "_editing", "editing", "getEditing$paymentsheet_release", BaseSheetViewModel.SAVE_PROCESSING, "getProcessing", "_contentVisible", "contentVisible", "getContentVisible$paymentsheet_release", "_primaryButtonState", "primaryButtonState", "getPrimaryButtonState", "customPrimaryButtonUiState", "getCustomPrimaryButtonUiState", "_notesText", "notesText", "getNotesText$paymentsheet_release", "buttonsEnabled", "getButtonsEnabled", "lpmServerSpec", "getLpmServerSpec$paymentsheet_release", "setLpmServerSpec$paymentsheet_release", "(Ljava/lang/String;)V", "Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;", "paymentOptionsStateMapper$delegate", "Lkotlin/Lazy;", "getPaymentOptionsStateMapper", "()Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;", "paymentOptionsStateMapper", "Lcom/stripe/android/paymentsheet/PaymentOptionsState;", "paymentOptionsState", "getPaymentOptionsState", "getPrimaryButtonUiState", "primaryButtonUiState", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "getNewPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "setNewPaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V", "newPaymentSelection", "getShouldCompleteLinkFlowInline", "()Z", "shouldCompleteLinkFlowInline", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;)V", "Companion", "UserErrorMessage", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSheetViewModel.kt\ncom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,527:1\n47#2:528\n49#2:532\n50#3:529\n55#3:531\n106#4:530\n1549#5:533\n1620#5,3:534\n1549#5:542\n1620#5,3:543\n230#6,5:537\n230#6,5:546\n230#6,5:551\n*S KotlinDebug\n*F\n+ 1 BaseSheetViewModel.kt\ncom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel\n*L\n131#1:528\n131#1:532\n131#1:529\n131#1:531\n131#1:530\n99#1:533\n99#1:534,3\n286#1:542\n286#1:543,3\n241#1:537,5\n373#1:546,5\n502#1:551,5\n*E\n"})
/* loaded from: classes7.dex */
public abstract class BaseSheetViewModel extends C23294ie {
    public static final Companion Companion = new Companion(null);
    public static final String SAVE_GOOGLE_PAY_STATE = "google_pay_state";
    public static final String SAVE_PAYMENT_METHODS = "customer_payment_methods";
    public static final String SAVE_PROCESSING = "processing";
    public static final String SAVE_SAVED_SELECTION = "saved_selection";
    public static final String SAVE_SELECTION = "selection";
    private final GX2<Amount> _amount;
    private final GX2<Boolean> _contentVisible;
    private final GX2<Boolean> _editing;
    private final GX2<String> _notesText;
    private final GX2<PrimaryButton.State> _primaryButtonState;
    private final GX2<StripeIntent> _stripeIntent;
    private final GX2<List<String>> _supportedPaymentMethodsFlow;
    private final InterfaceC49220tP5<Amount> amount;
    private final GX2<List<PaymentSheetScreen>> backStack;
    private final InterfaceC32730Eu1<Boolean> buttonsEnabled;
    private final PaymentSheet.Configuration config;
    private final InterfaceC49220tP5<Boolean> contentVisible;
    private final InterfaceC49220tP5<PaymentSheetScreen> currentScreen;
    private final GX2<PrimaryButton.UIState> customPrimaryButtonUiState;
    private final PaymentSheet.CustomerConfiguration customerConfig;
    private final CustomerRepository customerRepository;
    private final InterfaceC49220tP5<Boolean> editing;
    private final EventReporter eventReporter;
    private final InterfaceC49220tP5<GooglePayState> googlePayState;
    private final InterfaceC32730Eu1<Integer> headerText;
    private final HeaderTextFactory headerTextFactory;
    public NonFallbackInjector injector;
    private final LinkHandler linkHandler;
    private final Logger logger;
    private final LpmRepository lpmRepository;
    private String lpmServerSpec;
    private final String merchantName;
    private Throwable mostRecentError;
    private final InterfaceC49220tP5<String> notesText;
    private final InterfaceC49220tP5<List<PaymentMethod>> paymentMethods;
    private final InterfaceC49220tP5<PaymentOptionsState> paymentOptionsState;
    private final Lazy paymentOptionsStateMapper$delegate;
    private final PrefsRepository prefsRepository;
    private final InterfaceC49220tP5<PrimaryButton.State> primaryButtonState;
    private final InterfaceC49220tP5<Boolean> processing;
    private final InterfaceC49220tP5<SavedSelection> savedSelection;
    private final C11747p savedStateHandle;
    private final InterfaceC49220tP5<PaymentSelection> selection;
    private final InterfaceC49220tP5<StripeIntent> stripeIntent;
    private List<LpmRepository.SupportedPaymentMethod> supportedPaymentMethods;
    private final InterfaceC49220tP5<List<String>> supportedPaymentMethodsFlow;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$1", m28418f = "BaseSheetViewModel.kt", m28417i = {}, m28416l = {220}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C193251 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, m28432d2 = {"", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$1$1", m28418f = "BaseSheetViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$1$1 */
        /* loaded from: classes7.dex */
        public static final class C193261 extends SuspendLambda implements Function2<List<? extends PaymentMethod>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BaseSheetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C193261(BaseSheetViewModel baseSheetViewModel, Continuation<? super C193261> continuation) {
                super(2, continuation);
                this.this$0 = baseSheetViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C193261 c193261 = new C193261(this.this$0, continuation);
                c193261.L$0 = obj;
                return c193261;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends PaymentMethod> list, Continuation<? super Unit> continuation) {
                return invoke2((List<PaymentMethod>) list, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    List list = (List) this.L$0;
                    if (list != null && !list.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && this.this$0.getEditing$paymentsheet_release().getValue().booleanValue()) {
                        this.this$0.toggleEditing();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(List<PaymentMethod> list, Continuation<? super Unit> continuation) {
                return ((C193261) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C193251(Continuation<? super C193251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C193251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C193251) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC32730Eu1 m79276L = C36708Vu1.m79276L(BaseSheetViewModel.this.getPaymentMethods$paymentsheet_release(), new C193261(BaseSheetViewModel.this, null));
                this.label = 1;
                if (C36708Vu1.m79262i(m79276L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2", m28418f = "BaseSheetViewModel.kt", m28417i = {}, m28416l = {233}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nBaseSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSheetViewModel.kt\ncom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,527:1\n54#2:528\n57#2:532\n20#2:533\n22#2:537\n50#3:529\n55#3:531\n50#3:534\n55#3:536\n106#4:530\n106#4:535\n*S KotlinDebug\n*F\n+ 1 BaseSheetViewModel.kt\ncom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$2\n*L\n227#1:528\n227#1:532\n230#1:533\n230#1:537\n227#1:529\n227#1:531\n230#1:534\n230#1:536\n227#1:530\n230#1:535\n*E\n"})
    /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C193272 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C193272(Continuation<? super C193272> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C193272(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C193272) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                final InterfaceC49220tP5<PaymentOptionsState> paymentOptionsState = BaseSheetViewModel.this.getPaymentOptionsState();
                final InterfaceC32730Eu1<PaymentSelection> interfaceC32730Eu1 = new InterfaceC32730Eu1<PaymentSelection>() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2$invokeSuspend$$inlined$mapNotNull$1

                    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BaseSheetViewModel.kt\ncom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$2\n*L\n1#1,222:1\n55#2:223\n56#2:225\n228#3:224\n*E\n"})
                    /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2 */
                    /* loaded from: classes7.dex */
                    public static final class C193312<T> implements InterfaceC33198Gu1 {
                        final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                        @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2", m28418f = "BaseSheetViewModel.kt", m28417i = {}, m28416l = {225}, m28415m = "emit", m28414n = {}, m28413s = {})
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                        /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1 */
                        /* loaded from: classes7.dex */
                        public static final class C193321 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public C193321(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C193312.this.emit(null, this);
                            }
                        }

                        public C193312(InterfaceC33198Gu1 interfaceC33198Gu1) {
                            this.$this_unsafeFlow = interfaceC33198Gu1;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                        @Override // p000.InterfaceC33198Gu1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            C193321 c193321;
                            Object coroutine_suspended;
                            int i;
                            PaymentSelection paymentSelection;
                            if (continuation instanceof C193321) {
                                c193321 = (C193321) continuation;
                                int i2 = c193321.label;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    c193321.label = i2 - Integer.MIN_VALUE;
                                    Object obj2 = c193321.result;
                                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = c193321.label;
                                    if (i == 0) {
                                        if (i == 1) {
                                            ResultKt.throwOnFailure(obj2);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.throwOnFailure(obj2);
                                        InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                        PaymentOptionsItem selectedItem = ((PaymentOptionsState) obj).getSelectedItem();
                                        if (selectedItem != null) {
                                            paymentSelection = PaymentOptionsStateFactoryKt.toPaymentSelection(selectedItem);
                                        } else {
                                            paymentSelection = null;
                                        }
                                        if (paymentSelection != null) {
                                            c193321.label = 1;
                                            if (interfaceC33198Gu1.emit(paymentSelection, c193321) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            c193321 = new C193321(continuation);
                            Object obj22 = c193321.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193321.label;
                            if (i == 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // p000.InterfaceC32730Eu1
                    public Object collect(InterfaceC33198Gu1<? super PaymentSelection> interfaceC33198Gu1, Continuation continuation) {
                        Object coroutine_suspended2;
                        Object collect = InterfaceC32730Eu1.this.collect(new C193312(interfaceC33198Gu1), continuation);
                        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (collect == coroutine_suspended2) {
                            return collect;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final BaseSheetViewModel baseSheetViewModel = BaseSheetViewModel.this;
                InterfaceC32730Eu1<PaymentSelection> interfaceC32730Eu12 = new InterfaceC32730Eu1<PaymentSelection>() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2$invokeSuspend$$inlined$filter$1

                    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BaseSheetViewModel.kt\ncom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$2\n*L\n1#1,222:1\n21#2:223\n22#2:225\n231#3:224\n*E\n"})
                    /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2$invokeSuspend$$inlined$filter$1$2 */
                    /* loaded from: classes7.dex */
                    public static final class C193292<T> implements InterfaceC33198Gu1 {
                        final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                        final /* synthetic */ BaseSheetViewModel this$0;

                        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                        @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2$invokeSuspend$$inlined$filter$1$2", m28418f = "BaseSheetViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                        /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2$invokeSuspend$$inlined$filter$1$2$1 */
                        /* loaded from: classes7.dex */
                        public static final class C193301 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public C193301(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C193292.this.emit(null, this);
                            }
                        }

                        public C193292(InterfaceC33198Gu1 interfaceC33198Gu1, BaseSheetViewModel baseSheetViewModel) {
                            this.$this_unsafeFlow = interfaceC33198Gu1;
                            this.this$0 = baseSheetViewModel;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                        @Override // p000.InterfaceC33198Gu1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            C193301 c193301;
                            Object coroutine_suspended;
                            int i;
                            if (continuation instanceof C193301) {
                                c193301 = (C193301) continuation;
                                int i2 = c193301.label;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    c193301.label = i2 - Integer.MIN_VALUE;
                                    Object obj2 = c193301.result;
                                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = c193301.label;
                                    if (i == 0) {
                                        if (i == 1) {
                                            ResultKt.throwOnFailure(obj2);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.throwOnFailure(obj2);
                                        InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                        if (!Intrinsics.areEqual((PaymentSelection) obj, this.this$0.getSelection$paymentsheet_release().getValue())) {
                                            c193301.label = 1;
                                            if (interfaceC33198Gu1.emit(obj, c193301) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            c193301 = new C193301(continuation);
                            Object obj22 = c193301.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193301.label;
                            if (i == 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // p000.InterfaceC32730Eu1
                    public Object collect(InterfaceC33198Gu1<? super PaymentSelection> interfaceC33198Gu1, Continuation continuation) {
                        Object coroutine_suspended2;
                        Object collect = InterfaceC32730Eu1.this.collect(new C193292(interfaceC33198Gu1, baseSheetViewModel), continuation);
                        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (collect == coroutine_suspended2) {
                            return collect;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final BaseSheetViewModel baseSheetViewModel2 = BaseSheetViewModel.this;
                InterfaceC33198Gu1<PaymentSelection> interfaceC33198Gu1 = new InterfaceC33198Gu1<PaymentSelection>() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.2.3
                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(PaymentSelection paymentSelection, Continuation<? super Unit> continuation) {
                        BaseSheetViewModel.this.updateSelection(paymentSelection);
                        return Unit.INSTANCE;
                    }

                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(PaymentSelection paymentSelection, Continuation continuation) {
                        return emit2(paymentSelection, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (interfaceC32730Eu12.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Companion;", "", "()V", "SAVE_GOOGLE_PAY_STATE", "", "SAVE_PAYMENT_METHODS", "SAVE_PROCESSING", "SAVE_SAVED_SELECTION", "SAVE_SELECTION", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class UserErrorMessage {
        public static final int $stable = 0;
        private final String message;

        public UserErrorMessage(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ UserErrorMessage copy$default(UserErrorMessage userErrorMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userErrorMessage.message;
            }
            return userErrorMessage.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final UserErrorMessage copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new UserErrorMessage(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserErrorMessage) && Intrinsics.areEqual(this.message, ((UserErrorMessage) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            String str = this.message;
            return "UserErrorMessage(message=" + str + ")";
        }
    }

    public /* synthetic */ BaseSheetViewModel(Application application, PaymentSheet.Configuration configuration, EventReporter eventReporter, CustomerRepository customerRepository, PrefsRepository prefsRepository, CoroutineContext coroutineContext, Logger logger, LpmRepository lpmRepository, C11747p c11747p, LinkHandler linkHandler, HeaderTextFactory headerTextFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, configuration, eventReporter, customerRepository, prefsRepository, (i & 32) != 0 ? T41.m84377b() : coroutineContext, logger, lpmRepository, c11747p, linkHandler, headerTextFactory);
    }

    private final PaymentOptionsStateMapper getPaymentOptionsStateMapper() {
        return (PaymentOptionsStateMapper) this.paymentOptionsStateMapper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer mapToHeaderTextResource(PaymentSheetScreen paymentSheetScreen, boolean z, GooglePayState googlePayState, StripeIntent stripeIntent) {
        boolean z2;
        if (paymentSheetScreen != null) {
            HeaderTextFactory headerTextFactory = this.headerTextFactory;
            if (!z && !(googlePayState instanceof GooglePayState.Available)) {
                z2 = false;
            } else {
                z2 = true;
            }
            return headerTextFactory.create(paymentSheetScreen, z2, stripeIntent instanceof PaymentIntent, stripeIntent.getPaymentMethodTypes());
        }
        return null;
    }

    public static /* synthetic */ void onError$default(BaseSheetViewModel baseSheetViewModel, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
        if ((i & 1) != 0) {
            num = null;
        }
        baseSheetViewModel.onError(num);
    }

    private final void onUserBack() {
        List<PaymentSheetScreen> value;
        List<PaymentSheetScreen> dropLast;
        PaymentSelection paymentSelection;
        clearErrorMessages();
        GX2<List<PaymentSheetScreen>> gx2 = this.backStack;
        do {
            value = gx2.getValue();
            dropLast = CollectionsKt___CollectionsKt.dropLast(value, 1);
        } while (!gx2.compareAndSet(value, dropLast));
        PaymentOptionsItem selectedItem = this.paymentOptionsState.getValue().getSelectedItem();
        if (selectedItem != null) {
            paymentSelection = PaymentOptionsStateFactoryKt.toPaymentSelection(selectedItem);
        } else {
            paymentSelection = null;
        }
        updateSelection(paymentSelection);
    }

    private final void updateLinkPrimaryButtonUiState(PrimaryButton.UIState uIState) {
        this.customPrimaryButtonUiState.setValue(uIState);
    }

    private final void warnUnactivatedIfNeeded(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        this.logger.warning("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: " + list + ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method");
    }

    public abstract void clearErrorMessages();

    public final FormArguments createFormArguments(LpmRepository.SupportedPaymentMethod selectedItem, boolean z) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        FormArgumentsFactory formArgumentsFactory = FormArgumentsFactory.INSTANCE;
        StripeIntent value = this.stripeIntent.getValue();
        if (value != null) {
            return formArgumentsFactory.create(selectedItem, value, this.config, this.merchantName, this.amount.getValue(), getNewPaymentSelection(), z);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final InterfaceC49220tP5<Amount> getAmount$paymentsheet_release() {
        return this.amount;
    }

    public final GX2<List<PaymentSheetScreen>> getBackStack() {
        return this.backStack;
    }

    public final InterfaceC32730Eu1<Boolean> getButtonsEnabled() {
        return this.buttonsEnabled;
    }

    public final PaymentSheet.Configuration getConfig$paymentsheet_release() {
        return this.config;
    }

    public final InterfaceC49220tP5<Boolean> getContentVisible$paymentsheet_release() {
        return this.contentVisible;
    }

    public final InterfaceC49220tP5<PaymentSheetScreen> getCurrentScreen() {
        return this.currentScreen;
    }

    public final GX2<PrimaryButton.UIState> getCustomPrimaryButtonUiState() {
        return this.customPrimaryButtonUiState;
    }

    public final PaymentSheet.CustomerConfiguration getCustomerConfig$paymentsheet_release() {
        return this.customerConfig;
    }

    public final CustomerRepository getCustomerRepository() {
        return this.customerRepository;
    }

    public final InterfaceC49220tP5<Boolean> getEditing$paymentsheet_release() {
        return this.editing;
    }

    public final EventReporter getEventReporter$paymentsheet_release() {
        return this.eventReporter;
    }

    public final InterfaceC49220tP5<GooglePayState> getGooglePayState$paymentsheet_release() {
        return this.googlePayState;
    }

    public final InterfaceC32730Eu1<Integer> getHeaderText$paymentsheet_release() {
        return this.headerText;
    }

    public final NonFallbackInjector getInjector() {
        NonFallbackInjector nonFallbackInjector = this.injector;
        if (nonFallbackInjector != null) {
            return nonFallbackInjector;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injector");
        return null;
    }

    public final LinkHandler getLinkHandler() {
        return this.linkHandler;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final LpmRepository getLpmRepository() {
        return this.lpmRepository;
    }

    public final String getLpmServerSpec$paymentsheet_release() {
        return this.lpmServerSpec;
    }

    public final String getMerchantName$paymentsheet_release() {
        return this.merchantName;
    }

    public final Throwable getMostRecentError() {
        return this.mostRecentError;
    }

    public abstract PaymentSelection.New getNewPaymentSelection();

    public final InterfaceC49220tP5<String> getNotesText$paymentsheet_release() {
        return this.notesText;
    }

    public final InterfaceC49220tP5<List<PaymentMethod>> getPaymentMethods$paymentsheet_release() {
        return this.paymentMethods;
    }

    public final InterfaceC49220tP5<PaymentOptionsState> getPaymentOptionsState() {
        return this.paymentOptionsState;
    }

    public final PrefsRepository getPrefsRepository() {
        return this.prefsRepository;
    }

    public final InterfaceC49220tP5<PrimaryButton.State> getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    public abstract InterfaceC49220tP5<PrimaryButton.UIState> getPrimaryButtonUiState();

    public final InterfaceC49220tP5<Boolean> getProcessing() {
        return this.processing;
    }

    public final C11747p getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final InterfaceC49220tP5<PaymentSelection> getSelection$paymentsheet_release() {
        return this.selection;
    }

    public abstract boolean getShouldCompleteLinkFlowInline();

    public final InterfaceC49220tP5<StripeIntent> getStripeIntent$paymentsheet_release() {
        return this.stripeIntent;
    }

    public final List<LpmRepository.SupportedPaymentMethod> getSupportedPaymentMethods$paymentsheet_release() {
        return this.supportedPaymentMethods;
    }

    public final InterfaceC49220tP5<List<String>> getSupportedPaymentMethodsFlow() {
        return this.supportedPaymentMethodsFlow;
    }

    public final CoroutineContext getWorkContext() {
        return this.workContext;
    }

    public final void handleBackPressed() {
        if (this.processing.getValue().booleanValue()) {
            return;
        }
        if (this.backStack.getValue().size() > 1) {
            onUserBack();
        } else {
            onUserCancel();
        }
    }

    public abstract void handlePaymentMethodSelected(PaymentSelection paymentSelection);

    public abstract void onError(Integer num);

    public abstract void onError(String str);

    public abstract void onFatal(Throwable th);

    public abstract void onFinish();

    public abstract void onPaymentResult(PaymentResult paymentResult);

    public abstract void onUserCancel();

    public final void payWithLinkInline(UserInput userInput) {
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new BaseSheetViewModel$payWithLinkInline$1(this, userInput, null), 3, null);
    }

    public final void removePaymentMethod(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        String str = paymentMethod.f75358id;
        if (str == null) {
            return;
        }
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new BaseSheetViewModel$removePaymentMethod$1(this, str, null), 3, null);
    }

    public final void reportNavigationEvent(PaymentSheetScreen currentScreen) {
        boolean areEqual;
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        if (!Intrinsics.areEqual(currentScreen, PaymentSheetScreen.Loading.INSTANCE)) {
            String str = null;
            if (Intrinsics.areEqual(currentScreen, PaymentSheetScreen.SelectSavedPaymentMethods.INSTANCE)) {
                EventReporter eventReporter = this.eventReporter;
                boolean areEqual2 = Intrinsics.areEqual(this.linkHandler.isLinkEnabled().getValue(), Boolean.TRUE);
                boolean booleanValue = this.linkHandler.getActiveLinkSession().getValue().booleanValue();
                StripeIntent value = this.stripeIntent.getValue();
                if (value != null) {
                    str = IntentKt.getCurrency(value);
                }
                eventReporter.onShowExistingPaymentOptions(areEqual2, booleanValue, str);
                return;
            }
            if (Intrinsics.areEqual(currentScreen, PaymentSheetScreen.AddFirstPaymentMethod.INSTANCE)) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(currentScreen, PaymentSheetScreen.AddAnotherPaymentMethod.INSTANCE);
            }
            if (areEqual) {
                EventReporter eventReporter2 = this.eventReporter;
                boolean areEqual3 = Intrinsics.areEqual(this.linkHandler.isLinkEnabled().getValue(), Boolean.TRUE);
                boolean booleanValue2 = this.linkHandler.getActiveLinkSession().getValue().booleanValue();
                StripeIntent value2 = this.stripeIntent.getValue();
                if (value2 != null) {
                    str = IntentKt.getCurrency(value2);
                }
                eventReporter2.onShowNewPaymentOptionForm(areEqual3, booleanValue2, str);
            }
        }
    }

    public final void resetUSBankPrimaryButton() {
        this.customPrimaryButtonUiState.setValue(null);
    }

    public final void setContentVisible(boolean z) {
        this._contentVisible.setValue(Boolean.valueOf(z));
    }

    public final void setInjector(NonFallbackInjector nonFallbackInjector) {
        Intrinsics.checkNotNullParameter(nonFallbackInjector, "<set-?>");
        this.injector = nonFallbackInjector;
    }

    public final void setLpmServerSpec$paymentsheet_release(String str) {
        this.lpmServerSpec = str;
    }

    public final void setMostRecentError(Throwable th) {
        this.mostRecentError = th;
    }

    public abstract void setNewPaymentSelection(PaymentSelection.New r1);

    public final void setStripeIntent(StripeIntent stripeIntent) {
        Object m116783constructorimpl;
        GX2<Amount> gx2;
        Long amount;
        int collectionSizeOrDefault;
        List list;
        this._stripeIntent.setValue(stripeIntent);
        setSupportedPaymentMethods$paymentsheet_release(SupportedPaymentMethodKtxKt.getPMsToAdd(stripeIntent, this.config, this.lpmRepository));
        if (stripeIntent != null && this.supportedPaymentMethods.isEmpty()) {
            List<String> paymentMethodTypes = stripeIntent.getPaymentMethodTypes();
            Collection<LpmRepository.SupportedPaymentMethod> values = this.lpmRepository.values();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (LpmRepository.SupportedPaymentMethod supportedPaymentMethod : values) {
                arrayList.add(supportedPaymentMethod.getCode());
            }
            list = CollectionsKt___CollectionsKt.toList(arrayList);
            onFatal(new IllegalArgumentException("None of the requested payment methods (" + paymentMethodTypes + ") match the supported payment types (" + list + ")"));
        }
        if (stripeIntent instanceof PaymentIntent) {
            try {
                Result.Companion companion = Result.Companion;
                gx2 = this._amount;
                amount = ((PaymentIntent) stripeIntent).getAmount();
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            if (amount != null) {
                long longValue = amount.longValue();
                String currency = ((PaymentIntent) stripeIntent).getCurrency();
                if (currency != null) {
                    gx2.setValue(new Amount(longValue, currency));
                    m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
                    if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
                        onFatal(new IllegalStateException("PaymentIntent must contain amount and currency."));
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        if (stripeIntent != null) {
            warnUnactivatedIfNeeded(stripeIntent.getUnactivatedPaymentMethods());
        }
    }

    public final void setSupportedPaymentMethods$paymentsheet_release(List<LpmRepository.SupportedPaymentMethod> value) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(value, "value");
        this.supportedPaymentMethods = value;
        GX2<List<String>> gx2 = this._supportedPaymentMethodsFlow;
        List<LpmRepository.SupportedPaymentMethod> list = value;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (LpmRepository.SupportedPaymentMethod supportedPaymentMethod : list) {
            arrayList.add(supportedPaymentMethod.getCode());
        }
        gx2.mo10357b(arrayList);
    }

    public final void toggleEditing() {
        this._editing.setValue(Boolean.valueOf(!this.editing.getValue().booleanValue()));
    }

    public final void transitionTo(PaymentSheetScreen target) {
        List<PaymentSheetScreen> value;
        List minus;
        List<PaymentSheetScreen> plus;
        Intrinsics.checkNotNullParameter(target, "target");
        clearErrorMessages();
        GX2<List<PaymentSheetScreen>> gx2 = this.backStack;
        do {
            value = gx2.getValue();
            minus = CollectionsKt___CollectionsKt.minus(value, PaymentSheetScreen.Loading.INSTANCE);
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends PaymentSheetScreen>) ((Collection<? extends Object>) minus), target);
        } while (!gx2.compareAndSet(value, plus));
        reportNavigationEvent(target);
    }

    public final void transitionToAddPaymentScreen() {
        transitionTo(PaymentSheetScreen.AddAnotherPaymentMethod.INSTANCE);
    }

    public abstract void transitionToFirstScreen();

    public final void updateBelowButtonText(String str) {
        this._notesText.setValue(str);
    }

    public final void updateCustomPrimaryButtonUiState(Function1<? super PrimaryButton.UIState, PrimaryButton.UIState> block) {
        PrimaryButton.UIState value;
        Intrinsics.checkNotNullParameter(block, "block");
        GX2<PrimaryButton.UIState> gx2 = this.customPrimaryButtonUiState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, block.invoke(value)));
    }

    public final void updatePrimaryButtonForLinkInline() {
        PrimaryButton.UIState value = getPrimaryButtonUiState().getValue();
        if (value == null) {
            return;
        }
        updateLinkPrimaryButtonUiState(new PrimaryButton.UIState(value.getLabel(), new BaseSheetViewModel$updatePrimaryButtonForLinkInline$1(this), true, this instanceof PaymentSheetViewModel));
    }

    public final void updatePrimaryButtonForLinkSignup(InlineSignupViewState viewState) {
        PrimaryButton.UIState uIState;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        PrimaryButton.UIState value = getPrimaryButtonUiState().getValue();
        if (value == null) {
            return;
        }
        if (viewState.getUseLink()) {
            UserInput userInput = viewState.getUserInput();
            PaymentSelection value2 = this.selection.getValue();
            if (userInput != null && value2 != null) {
                uIState = new PrimaryButton.UIState(value.getLabel(), new BaseSheetViewModel$updatePrimaryButtonForLinkSignup$1(this, userInput), true, this instanceof PaymentSheetViewModel);
            } else {
                uIState = new PrimaryButton.UIState(value.getLabel(), BaseSheetViewModel$updatePrimaryButtonForLinkSignup$2.INSTANCE, false, this instanceof PaymentSheetViewModel);
            }
        } else {
            uIState = null;
        }
        updateLinkPrimaryButtonUiState(uIState);
    }

    public final void updatePrimaryButtonState(PrimaryButton.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this._primaryButtonState.setValue(state);
    }

    public final void updateSelection(PaymentSelection paymentSelection) {
        String str;
        if (paymentSelection instanceof PaymentSelection.New) {
            setNewPaymentSelection((PaymentSelection.New) paymentSelection);
        }
        this.savedStateHandle.m66940m(SAVE_SELECTION, paymentSelection);
        if (paymentSelection != null) {
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication()");
            str = paymentSelection.mandateText(application);
        } else {
            str = null;
        }
        updateBelowButtonText(str);
        clearErrorMessages();
    }

    public static /* synthetic */ void onError$default(BaseSheetViewModel baseSheetViewModel, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        baseSheetViewModel.onError(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel(Application application, PaymentSheet.Configuration configuration, EventReporter eventReporter, CustomerRepository customerRepository, PrefsRepository prefsRepository, CoroutineContext workContext, Logger logger, LpmRepository lpmRepository, C11747p savedStateHandle, LinkHandler linkHandler, HeaderTextFactory headerTextFactory) {
        super(application);
        String obj;
        List<LpmRepository.SupportedPaymentMethod> emptyList;
        List emptyList2;
        List listOf;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(prefsRepository, "prefsRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(lpmRepository, "lpmRepository");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        Intrinsics.checkNotNullParameter(headerTextFactory, "headerTextFactory");
        this.config = configuration;
        this.eventReporter = eventReporter;
        this.customerRepository = customerRepository;
        this.prefsRepository = prefsRepository;
        this.workContext = workContext;
        this.logger = logger;
        this.lpmRepository = lpmRepository;
        this.savedStateHandle = savedStateHandle;
        this.linkHandler = linkHandler;
        this.headerTextFactory = headerTextFactory;
        this.customerConfig = configuration != null ? configuration.getCustomer() : null;
        this.merchantName = (configuration == null || (obj = configuration.getMerchantDisplayName()) == null) ? application.getApplicationInfo().loadLabel(application.getPackageManager()).toString() : obj;
        InterfaceC49220tP5<GooglePayState> m66944i = savedStateHandle.m66944i(SAVE_GOOGLE_PAY_STATE, GooglePayState.Indeterminate.INSTANCE);
        this.googlePayState = m66944i;
        GX2<StripeIntent> m8742a = C50405vP5.m8742a(null);
        this._stripeIntent = m8742a;
        this.stripeIntent = m8742a;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.supportedPaymentMethods = emptyList;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        GX2<List<String>> m8742a2 = C50405vP5.m8742a(emptyList2);
        this._supportedPaymentMethodsFlow = m8742a2;
        this.supportedPaymentMethodsFlow = m8742a2;
        this.paymentMethods = savedStateHandle.m66944i(SAVE_PAYMENT_METHODS, null);
        GX2<Amount> m8742a3 = C50405vP5.m8742a(null);
        this._amount = m8742a3;
        this.amount = m8742a3;
        this.savedSelection = savedStateHandle.m66944i(SAVE_SAVED_SELECTION, null);
        PaymentSheetScreen.Loading loading = PaymentSheetScreen.Loading.INSTANCE;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(loading);
        final GX2<List<PaymentSheetScreen>> m8742a4 = C50405vP5.m8742a(listOf);
        this.backStack = m8742a4;
        InterfaceC32730Eu1<PaymentSheetScreen> interfaceC32730Eu1 = new InterfaceC32730Eu1<PaymentSheetScreen>() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BaseSheetViewModel.kt\ncom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel\n*L\n1#1,222:1\n48#2:223\n131#3:224\n*E\n"})
            /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C193332<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$special$$inlined$map$1$2", m28418f = "BaseSheetViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193341 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193341(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193332.this.emit(null, this);
                    }
                }

                public C193332(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193341 c193341;
                    Object coroutine_suspended;
                    int i;
                    Object last;
                    if (continuation instanceof C193341) {
                        c193341 = (C193341) continuation;
                        int i2 = c193341.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193341.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193341.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193341.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) obj);
                                c193341.label = 1;
                                if (interfaceC33198Gu1.emit(last, c193341) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193341 = new C193341(continuation);
                    Object obj22 = c193341.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193341.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super PaymentSheetScreen> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193332(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        ZC0 m82333a = C36218Tr6.m82333a(this);
        InterfaceC43640jz5.C25067a c25067a = InterfaceC43640jz5.f93705a;
        InterfaceC49220tP5<PaymentSheetScreen> m79273O = C36708Vu1.m79273O(interfaceC32730Eu1, m82333a, InterfaceC43640jz5.C25067a.m29522b(c25067a, 0L, 0L, 3, null), loading);
        this.currentScreen = m79273O;
        this.headerText = C36708Vu1.m79259l(m79273O, C36708Vu1.m79249v(linkHandler.isLinkEnabled()), m66944i, C36708Vu1.m79249v(m8742a), new BaseSheetViewModel$headerText$1(this, null));
        this.selection = savedStateHandle.m66944i(SAVE_SELECTION, null);
        Boolean bool = Boolean.FALSE;
        GX2<Boolean> m8742a5 = C50405vP5.m8742a(bool);
        this._editing = m8742a5;
        this.editing = m8742a5;
        InterfaceC49220tP5<Boolean> m66944i2 = savedStateHandle.m66944i(SAVE_PROCESSING, bool);
        this.processing = m66944i2;
        GX2<Boolean> m8742a6 = C50405vP5.m8742a(Boolean.TRUE);
        this._contentVisible = m8742a6;
        this.contentVisible = m8742a6;
        GX2<PrimaryButton.State> m8742a7 = C50405vP5.m8742a(null);
        this._primaryButtonState = m8742a7;
        this.primaryButtonState = m8742a7;
        this.customPrimaryButtonUiState = C50405vP5.m8742a(null);
        GX2<String> m8742a8 = C50405vP5.m8742a(null);
        this._notesText = m8742a8;
        this.notesText = m8742a8;
        this.buttonsEnabled = C36708Vu1.m79255p(C36708Vu1.m79257n(m66944i2, m8742a5, new BaseSheetViewModel$buttonsEnabled$1(null)));
        lazy = LazyKt__LazyJVMKt.lazy(new BaseSheetViewModel$paymentOptionsStateMapper$2(this, application));
        this.paymentOptionsStateMapper$delegate = lazy;
        this.paymentOptionsState = C36708Vu1.m79273O(C36708Vu1.m79249v(getPaymentOptionsStateMapper().invoke()), C36218Tr6.m82333a(this), InterfaceC43640jz5.C25067a.m29522b(c25067a, 0L, 0L, 3, null), new PaymentOptionsState(null, 0, 3, null));
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C193251(null), 3, null);
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C193272(null), 3, null);
    }
}
