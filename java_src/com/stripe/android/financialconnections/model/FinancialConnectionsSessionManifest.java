package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.adyen.checkout.components.model.payments.response.Action;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.ManualEntryMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bq\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 é\u00012\u00020\u0001:\fê\u0001ë\u0001é\u0001ì\u0001í\u0001î\u0001Bë\u0003\u0012\u0006\u0010A\u001a\u00020\t\u0012\u0006\u0010B\u001a\u00020\t\u0012\u0006\u0010C\u001a\u00020\t\u0012\u0006\u0010D\u001a\u00020\t\u0012\u0006\u0010E\u001a\u00020\u000e\u0012\u0006\u0010F\u001a\u00020\t\u0012\u0006\u0010G\u001a\u00020\t\u0012\u0006\u0010H\u001a\u00020\t\u0012\u0006\u0010I\u001a\u00020\t\u0012\u0006\u0010J\u001a\u00020\t\u0012\u0006\u0010K\u001a\u00020\u0015\u0012\u0006\u0010L\u001a\u00020\u0017\u0012\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010N\u001a\u00020\u001c\u0012\u0006\u0010O\u001a\u00020\t\u0012\u0006\u0010P\u001a\u00020\t\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u000100\u0012\u0016\b\u0002\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u000109\u0012\u0016\b\u0002\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\t¢\u0006\u0006\bâ\u0001\u0010ã\u0001Bµ\u0004\b\u0017\u0012\u0007\u0010ä\u0001\u001a\u00020n\u0012\u0007\u0010å\u0001\u001a\u00020n\u0012\b\b\u0001\u0010A\u001a\u00020\t\u0012\b\b\u0001\u0010B\u001a\u00020\t\u0012\b\b\u0001\u0010C\u001a\u00020\t\u0012\b\b\u0001\u0010D\u001a\u00020\t\u0012\n\b\u0001\u0010E\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0001\u0010F\u001a\u00020\t\u0012\b\b\u0001\u0010G\u001a\u00020\t\u0012\b\b\u0001\u0010H\u001a\u00020\t\u0012\b\b\u0001\u0010I\u001a\u00020\t\u0012\b\b\u0001\u0010J\u001a\u00020\t\u0012\n\b\u0001\u0010K\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010L\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0001\u0010M\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\b\u0001\u0010N\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0001\u0010O\u001a\u00020\t\u0012\b\b\u0001\u0010P\u001a\u00020\t\u0012\n\b\u0001\u0010Q\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010S\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010U\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010V\u001a\u0004\u0018\u00010'\u0012\n\b\u0001\u0010W\u001a\u0004\u0018\u00010)\u0012\n\b\u0001\u0010X\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010Z\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010[\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\\\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0001\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u000100\u0012\u0016\b\u0001\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100\u0012\n\b\u0001\u0010_\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010`\u001a\u0004\u0018\u00010)\u0012\n\b\u0001\u0010a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010e\u001a\u0004\u0018\u000109\u0012\u0016\b\u0001\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100\u0012\n\b\u0001\u0010g\u001a\u0004\u0018\u00010<\u0012\n\b\u0001\u0010h\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010i\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\t\u0012\n\u0010ç\u0001\u001a\u0005\u0018\u00010æ\u0001¢\u0006\u0006\bâ\u0001\u0010è\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0015HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0017HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003J\t\u0010\u001d\u001a\u00020\u001cHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010'HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010)HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u000100HÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010)HÆ\u0003J\u0012\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b5\u0010$J\u0012\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b6\u0010$J\u0012\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b7\u0010$J\u0012\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b8\u0010$J\u000b\u0010:\u001a\u0004\u0018\u000109HÆ\u0003J\u0017\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010<HÆ\u0003J\u0012\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b>\u0010$J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0012\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b@\u0010$J\u0092\u0004\u0010k\u001a\u00020\u00002\b\b\u0002\u0010A\u001a\u00020\t2\b\b\u0002\u0010B\u001a\u00020\t2\b\b\u0002\u0010C\u001a\u00020\t2\b\b\u0002\u0010D\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020\u000e2\b\b\u0002\u0010F\u001a\u00020\t2\b\b\u0002\u0010G\u001a\u00020\t2\b\b\u0002\u0010H\u001a\u00020\t2\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020\t2\b\b\u0002\u0010K\u001a\u00020\u00152\b\b\u0002\u0010L\u001a\u00020\u00172\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010N\u001a\u00020\u001c2\b\b\u0002\u0010O\u001a\u00020\t2\b\b\u0002\u0010P\u001a\u00020\t2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u0001002\u0016\b\u0002\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u0001002\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010e\u001a\u0004\u0018\u0001092\u0016\b\u0002\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u0001002\n\b\u0002\u0010g\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\bk\u0010lJ\t\u0010m\u001a\u00020\u000eHÖ\u0001J\t\u0010o\u001a\u00020nHÖ\u0001J\u0013\u0010r\u001a\u00020\t2\b\u0010q\u001a\u0004\u0018\u00010pHÖ\u0003J\t\u0010s\u001a\u00020nHÖ\u0001J\u0019\u0010w\u001a\u00020\u00072\u0006\u0010u\u001a\u00020t2\u0006\u0010v\u001a\u00020nHÖ\u0001R \u0010A\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010x\u0012\u0004\b{\u0010|\u001a\u0004\by\u0010zR \u0010B\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010x\u0012\u0004\b~\u0010|\u001a\u0004\b}\u0010zR!\u0010C\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\bC\u0010x\u0012\u0005\b\u0080\u0001\u0010|\u001a\u0004\b\u007f\u0010zR\"\u0010D\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bD\u0010x\u0012\u0005\b\u0082\u0001\u0010|\u001a\u0005\b\u0081\u0001\u0010zR$\u0010E\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bE\u0010\u0083\u0001\u0012\u0005\b\u0086\u0001\u0010|\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\"\u0010F\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bF\u0010x\u0012\u0005\b\u0088\u0001\u0010|\u001a\u0005\b\u0087\u0001\u0010zR\"\u0010G\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bG\u0010x\u0012\u0005\b\u008a\u0001\u0010|\u001a\u0005\b\u0089\u0001\u0010zR\"\u0010H\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bH\u0010x\u0012\u0005\b\u008c\u0001\u0010|\u001a\u0005\b\u008b\u0001\u0010zR\"\u0010I\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bI\u0010x\u0012\u0005\b\u008e\u0001\u0010|\u001a\u0005\b\u008d\u0001\u0010zR\"\u0010J\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bJ\u0010x\u0012\u0005\b\u0090\u0001\u0010|\u001a\u0005\b\u008f\u0001\u0010zR$\u0010K\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bK\u0010\u0091\u0001\u0012\u0005\b\u0094\u0001\u0010|\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R$\u0010L\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bL\u0010\u0095\u0001\u0012\u0005\b\u0098\u0001\u0010|\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bM\u0010\u0099\u0001\u0012\u0005\b\u009c\u0001\u0010|\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R$\u0010N\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bN\u0010\u009d\u0001\u0012\u0005\b \u0001\u0010|\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\"\u0010O\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bO\u0010x\u0012\u0005\b¢\u0001\u0010|\u001a\u0005\b¡\u0001\u0010zR\"\u0010P\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bP\u0010x\u0012\u0005\b¤\u0001\u0010|\u001a\u0005\b£\u0001\u0010zR&\u0010Q\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bQ\u0010¥\u0001\u0012\u0005\b¨\u0001\u0010|\u001a\u0006\b¦\u0001\u0010§\u0001R&\u0010R\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bR\u0010\u0083\u0001\u0012\u0005\bª\u0001\u0010|\u001a\u0006\b©\u0001\u0010\u0085\u0001R%\u0010S\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bS\u0010«\u0001\u0012\u0005\b\u00ad\u0001\u0010|\u001a\u0005\b¬\u0001\u0010$R&\u0010T\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bT\u0010\u0083\u0001\u0012\u0005\b¯\u0001\u0010|\u001a\u0006\b®\u0001\u0010\u0085\u0001R&\u0010U\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bU\u0010\u0083\u0001\u0012\u0005\b±\u0001\u0010|\u001a\u0006\b°\u0001\u0010\u0085\u0001R&\u0010V\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bV\u0010²\u0001\u0012\u0005\bµ\u0001\u0010|\u001a\u0006\b³\u0001\u0010´\u0001R&\u0010W\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bW\u0010¶\u0001\u0012\u0005\b¹\u0001\u0010|\u001a\u0006\b·\u0001\u0010¸\u0001R&\u0010X\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bX\u0010\u0083\u0001\u0012\u0005\b»\u0001\u0010|\u001a\u0006\bº\u0001\u0010\u0085\u0001R&\u0010Y\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bY\u0010\u0083\u0001\u0012\u0005\b½\u0001\u0010|\u001a\u0006\b¼\u0001\u0010\u0085\u0001R&\u0010Z\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bZ\u0010\u0083\u0001\u0012\u0005\b¿\u0001\u0010|\u001a\u0006\b¾\u0001\u0010\u0085\u0001R&\u0010[\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b[\u0010\u0083\u0001\u0012\u0005\bÁ\u0001\u0010|\u001a\u0006\bÀ\u0001\u0010\u0085\u0001R&\u0010\\\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\\\u0010\u0083\u0001\u0012\u0005\bÃ\u0001\u0010|\u001a\u0006\bÂ\u0001\u0010\u0085\u0001R2\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b]\u0010Ä\u0001\u0012\u0005\bÇ\u0001\u0010|\u001a\u0006\bÅ\u0001\u0010Æ\u0001R2\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b^\u0010Ä\u0001\u0012\u0005\bÉ\u0001\u0010|\u001a\u0006\bÈ\u0001\u0010Æ\u0001R&\u0010_\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b_\u0010\u0083\u0001\u0012\u0005\bË\u0001\u0010|\u001a\u0006\bÊ\u0001\u0010\u0085\u0001R&\u0010`\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b`\u0010¶\u0001\u0012\u0005\bÍ\u0001\u0010|\u001a\u0006\bÌ\u0001\u0010¸\u0001R$\u0010a\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\ba\u0010«\u0001\u0012\u0005\bÎ\u0001\u0010|\u001a\u0004\ba\u0010$R$\u0010b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\bb\u0010«\u0001\u0012\u0005\bÏ\u0001\u0010|\u001a\u0004\bb\u0010$R$\u0010c\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\bc\u0010«\u0001\u0012\u0005\bÐ\u0001\u0010|\u001a\u0004\bc\u0010$R$\u0010d\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\bd\u0010«\u0001\u0012\u0005\bÑ\u0001\u0010|\u001a\u0004\bd\u0010$R&\u0010e\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\be\u0010Ò\u0001\u0012\u0005\bÕ\u0001\u0010|\u001a\u0006\bÓ\u0001\u0010Ô\u0001R2\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bf\u0010Ä\u0001\u0012\u0005\b×\u0001\u0010|\u001a\u0006\bÖ\u0001\u0010Æ\u0001R&\u0010g\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bg\u0010Ø\u0001\u0012\u0005\bÛ\u0001\u0010|\u001a\u0006\bÙ\u0001\u0010Ú\u0001R%\u0010h\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bh\u0010«\u0001\u0012\u0005\bÝ\u0001\u0010|\u001a\u0005\bÜ\u0001\u0010$R&\u0010i\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bi\u0010\u0083\u0001\u0012\u0005\bß\u0001\u0010|\u001a\u0006\bÞ\u0001\u0010\u0085\u0001R%\u0010j\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bj\u0010«\u0001\u0012\u0005\bá\u0001\u0010|\u001a\u0005\bà\u0001\u0010$¨\u0006ï\u0001"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "component11", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "component12", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "component13", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "component14", "component15", "component16", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "component17", "component18", "component19", "()Ljava/lang/Boolean;", "component20", "component21", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "component22", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "component23", "component24", "component25", "component26", "component27", "component28", "", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "component37", "component38", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "component39", "component40", "component41", "component42", "allowManualEntry", "consentRequired", "customManualEntryHandling", "disableLinkMoreAccounts", "id", "instantVerificationDisabled", "institutionSearchDisabled", "livemode", "manualEntryUsesMicrodeposits", "mobileHandoffEnabled", "nextPane", "manualEntryMode", "permissions", "product", "singleAccount", "useSingleSortSearch", "accountDisconnectionMethod", "accountholderCustomerEmailAddress", "accountholderIsLinkConsumer", "accountholderPhoneNumber", "accountholderToken", "activeAuthSession", "activeInstitution", "assignmentEventId", "businessName", "cancelUrl", "connectPlatformName", "connectedAccountName", "experimentAssignments", "features", "hostedAuthUrl", "initialInstitution", "isEndUserFacing", "isLinkWithStripe", "isNetworkingUserFlow", "isStripeDirect", "linkAccountSessionCancellationBehavior", "modalCustomization", Action.PAYMENT_METHOD_TYPE, "stepUpAuthenticationRequired", "successUrl", "skipSuccessPane", "copy", "(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Z", "getAllowManualEntry", "()Z", "getAllowManualEntry$annotations", "()V", "getConsentRequired", "getConsentRequired$annotations", "getCustomManualEntryHandling", "getCustomManualEntryHandling$annotations", "getDisableLinkMoreAccounts", "getDisableLinkMoreAccounts$annotations", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "getInstantVerificationDisabled", "getInstantVerificationDisabled$annotations", "getInstitutionSearchDisabled", "getInstitutionSearchDisabled$annotations", "getLivemode", "getLivemode$annotations", "getManualEntryUsesMicrodeposits", "getManualEntryUsesMicrodeposits$annotations", "getMobileHandoffEnabled", "getMobileHandoffEnabled$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane$annotations", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "getManualEntryMode", "()Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "getManualEntryMode$annotations", "Ljava/util/List;", "getPermissions", "()Ljava/util/List;", "getPermissions$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "getProduct", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "getProduct$annotations", "getSingleAccount", "getSingleAccount$annotations", "getUseSingleSortSearch", "getUseSingleSortSearch$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "getAccountDisconnectionMethod", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "getAccountDisconnectionMethod$annotations", "getAccountholderCustomerEmailAddress", "getAccountholderCustomerEmailAddress$annotations", "Ljava/lang/Boolean;", "getAccountholderIsLinkConsumer", "getAccountholderIsLinkConsumer$annotations", "getAccountholderPhoneNumber", "getAccountholderPhoneNumber$annotations", "getAccountholderToken", "getAccountholderToken$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "getActiveAuthSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "getActiveAuthSession$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "getActiveInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "getActiveInstitution$annotations", "getAssignmentEventId", "getAssignmentEventId$annotations", "getBusinessName", "getBusinessName$annotations", "getCancelUrl", "getCancelUrl$annotations", "getConnectPlatformName", "getConnectPlatformName$annotations", "getConnectedAccountName", "getConnectedAccountName$annotations", "Ljava/util/Map;", "getExperimentAssignments", "()Ljava/util/Map;", "getExperimentAssignments$annotations", "getFeatures", "getFeatures$annotations", "getHostedAuthUrl", "getHostedAuthUrl$annotations", "getInitialInstitution", "getInitialInstitution$annotations", "isEndUserFacing$annotations", "isLinkWithStripe$annotations", "isNetworkingUserFlow$annotations", "isStripeDirect$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "getLinkAccountSessionCancellationBehavior", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "getLinkAccountSessionCancellationBehavior$annotations", "getModalCustomization", "getModalCustomization$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "getPaymentMethodType", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "getPaymentMethodType$annotations", "getStepUpAuthenticationRequired", "getStepUpAuthenticationRequired$annotations", "getSuccessUrl", "getSuccessUrl$annotations", "getSkipSuccessPane", "getSkipSuccessPane$annotations", "<init>", "(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen1", "seen2", "Lbt5;", "serializationConstructorMarker", "(IIZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lbt5;)V", "Companion", "$serializer", "AccountDisconnectionMethod", "LinkAccountSessionCancellationBehavior", "Pane", "Product", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSessionManifest implements Parcelable {
    private final AccountDisconnectionMethod accountDisconnectionMethod;
    private final String accountholderCustomerEmailAddress;
    private final Boolean accountholderIsLinkConsumer;
    private final String accountholderPhoneNumber;
    private final String accountholderToken;
    private final FinancialConnectionsAuthorizationSession activeAuthSession;
    private final FinancialConnectionsInstitution activeInstitution;
    private final boolean allowManualEntry;
    private final String assignmentEventId;
    private final String businessName;
    private final String cancelUrl;
    private final String connectPlatformName;
    private final String connectedAccountName;
    private final boolean consentRequired;
    private final boolean customManualEntryHandling;
    private final boolean disableLinkMoreAccounts;
    private final Map<String, String> experimentAssignments;
    private final Map<String, Boolean> features;
    private final String hostedAuthUrl;

    /* renamed from: id */
    private final String f75311id;
    private final FinancialConnectionsInstitution initialInstitution;
    private final boolean instantVerificationDisabled;
    private final boolean institutionSearchDisabled;
    private final Boolean isEndUserFacing;
    private final Boolean isLinkWithStripe;
    private final Boolean isNetworkingUserFlow;
    private final Boolean isStripeDirect;
    private final LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior;
    private final boolean livemode;
    private final ManualEntryMode manualEntryMode;
    private final boolean manualEntryUsesMicrodeposits;
    private final boolean mobileHandoffEnabled;
    private final Map<String, Boolean> modalCustomization;
    private final Pane nextPane;
    private final FinancialConnectionsAccount.SupportedPaymentMethodTypes paymentMethodType;
    private final List<FinancialConnectionsAccount.Permissions> permissions;
    private final Product product;
    private final boolean singleAccount;
    private final Boolean skipSuccessPane;
    private final Boolean stepUpAuthenticationRequired;
    private final String successUrl;
    private final boolean useSingleSortSearch;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsSessionManifest> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DASHBOARD", "EMAIL", "SUPPORT", "LINK", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5(with = Serializer.class)
    /* loaded from: classes7.dex */
    public enum AccountDisconnectionMethod {
        DASHBOARD("dashboard"),
        EMAIL("email"),
        SUPPORT("support"),
        LINK("link"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return AccountDisconnectionMethod.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<AccountDisconnectionMethod> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serializer extends EnumIgnoreUnknownSerializer<AccountDisconnectionMethod> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super(AccountDisconnectionMethod.values(), AccountDisconnectionMethod.UNKNOWN);
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18885xb6b343ef.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        AccountDisconnectionMethod(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<FinancialConnectionsSessionManifest> serializer() {
            return FinancialConnectionsSessionManifest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsSessionManifest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSessionManifest createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            boolean z;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            LinkedHashMap linkedHashMap4;
            Boolean bool;
            FinancialConnectionsInstitution financialConnectionsInstitution;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            String readString = parcel.readString();
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            boolean z8 = parcel.readInt() != 0;
            boolean z9 = parcel.readInt() != 0;
            boolean z10 = parcel.readInt() != 0;
            Pane valueOf = Pane.valueOf(parcel.readString());
            ManualEntryMode valueOf2 = ManualEntryMode.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList2.add(FinancialConnectionsAccount.Permissions.valueOf(parcel.readString()));
            }
            Product valueOf3 = Product.valueOf(parcel.readString());
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            AccountDisconnectionMethod valueOf4 = parcel.readInt() == 0 ? null : AccountDisconnectionMethod.valueOf(parcel.readString());
            String readString2 = parcel.readString();
            Boolean valueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            FinancialConnectionsAuthorizationSession createFromParcel = parcel.readInt() == 0 ? null : FinancialConnectionsAuthorizationSession.CREATOR.createFromParcel(parcel);
            FinancialConnectionsInstitution createFromParcel2 = parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel);
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                z = z11;
                arrayList = arrayList2;
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                arrayList = arrayList2;
                int i2 = 0;
                while (i2 != readInt2) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i2++;
                    readInt2 = readInt2;
                    z11 = z11;
                }
                z = z11;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap3 = linkedHashMap;
                linkedHashMap2 = null;
            } else {
                int readInt3 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    int i4 = readInt3;
                    LinkedHashMap linkedHashMap5 = linkedHashMap;
                    linkedHashMap2.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                    i3++;
                    readInt3 = i4;
                    linkedHashMap = linkedHashMap5;
                }
                linkedHashMap3 = linkedHashMap;
            }
            String readString10 = parcel.readString();
            FinancialConnectionsInstitution createFromParcel3 = parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel);
            Boolean valueOf6 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf7 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf8 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf9 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            LinkAccountSessionCancellationBehavior valueOf10 = parcel.readInt() == 0 ? null : LinkAccountSessionCancellationBehavior.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                financialConnectionsInstitution = createFromParcel3;
                bool = valueOf7;
                linkedHashMap4 = null;
            } else {
                int readInt4 = parcel.readInt();
                linkedHashMap4 = new LinkedHashMap(readInt4);
                bool = valueOf7;
                int i5 = 0;
                while (i5 != readInt4) {
                    int i6 = readInt4;
                    FinancialConnectionsInstitution financialConnectionsInstitution2 = createFromParcel3;
                    linkedHashMap4.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                    i5++;
                    readInt4 = i6;
                    createFromParcel3 = financialConnectionsInstitution2;
                }
                financialConnectionsInstitution = createFromParcel3;
            }
            return new FinancialConnectionsSessionManifest(z2, z3, z4, z5, readString, z6, z7, z8, z9, z10, valueOf, valueOf2, arrayList, valueOf3, z, z12, valueOf4, readString2, valueOf5, readString3, readString4, createFromParcel, createFromParcel2, readString5, readString6, readString7, readString8, readString9, linkedHashMap3, linkedHashMap2, readString10, financialConnectionsInstitution, valueOf6, bool, valueOf8, valueOf9, valueOf10, linkedHashMap4, parcel.readInt() == 0 ? null : FinancialConnectionsAccount.SupportedPaymentMethodTypes.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSessionManifest[] newArray(int i) {
            return new FinancialConnectionsSessionManifest[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SILENT_SUCCESS", "USER_ERROR", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5(with = Serializer.class)
    /* loaded from: classes7.dex */
    public enum LinkAccountSessionCancellationBehavior {
        SILENT_SUCCESS("treat_as_silent_success"),
        USER_ERROR("treat_as_user_error"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return LinkAccountSessionCancellationBehavior.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<LinkAccountSessionCancellationBehavior> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serializer extends EnumIgnoreUnknownSerializer<LinkAccountSessionCancellationBehavior> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super(LinkAccountSessionCancellationBehavior.values(), LinkAccountSessionCancellationBehavior.UNKNOWN);
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18886x38fbe897.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        LinkAccountSessionCancellationBehavior(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0017\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCOUNT_PICKER", "ATTACH_LINKED_PAYMENT_ACCOUNT", "AUTH_OPTIONS", "CONSENT", "INSTITUTION_PICKER", "LINK_CONSENT", "LINK_LOGIN", "MANUAL_ENTRY", "MANUAL_ENTRY_SUCCESS", "NETWORKING_LINK_LOGIN_WARMUP", "NETWORKING_LINK_SIGNUP_PANE", "NETWORKING_LINK_VERIFICATION", "PARTNER_AUTH", "SUCCESS", "UNEXPECTED_ERROR", "RESET", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5(with = Serializer.class)
    /* loaded from: classes7.dex */
    public enum Pane {
        ACCOUNT_PICKER("account_picker"),
        ATTACH_LINKED_PAYMENT_ACCOUNT("attach_linked_payment_account"),
        AUTH_OPTIONS("auth_options"),
        CONSENT("consent"),
        INSTITUTION_PICKER("institution_picker"),
        LINK_CONSENT("link_consent"),
        LINK_LOGIN("link_login"),
        MANUAL_ENTRY("manual_entry"),
        MANUAL_ENTRY_SUCCESS("manual_entry_success"),
        NETWORKING_LINK_LOGIN_WARMUP("networking_link_login_warmup"),
        NETWORKING_LINK_SIGNUP_PANE("networking_link_signup_pane"),
        NETWORKING_LINK_VERIFICATION("networking_link_verification"),
        PARTNER_AUTH("partner_auth"),
        SUCCESS("success"),
        UNEXPECTED_ERROR("unexpected_error"),
        RESET("reset");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return Pane.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<Pane> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Pane> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super(Pane.values(), Pane.UNEXPECTED_ERROR);
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18887xd92c5bc7.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        Pane(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u001b\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BILLPAY", "CANARY", "CAPITAL", "CAPITAL_HOSTED", "DASHBOARD", "DIRECT_ONBOARDING", "DIRECT_SETTINGS", "EMERALD", "EXPRESS_ONBOARDING", "EXTERNAL_API", "ISSUING", "LCPM", "LINK_WITH_NETWORKING", "OPAL", "PAYMENT_FLOWS", "RESERVE_APPEALS", "STANDARD_ONBOARDING", "STRIPE_CARD", "SUPPORT_SITE", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5(with = Serializer.class)
    /* loaded from: classes7.dex */
    public enum Product {
        BILLPAY("billpay"),
        CANARY("canary"),
        CAPITAL("capital"),
        CAPITAL_HOSTED("capital_hosted"),
        DASHBOARD("dashboard"),
        DIRECT_ONBOARDING("direct_onboarding"),
        DIRECT_SETTINGS("direct_settings"),
        EMERALD("emerald"),
        EXPRESS_ONBOARDING("express_onboarding"),
        EXTERNAL_API("external_api"),
        ISSUING("issuing"),
        LCPM("lcpm"),
        LINK_WITH_NETWORKING("link_with_networking"),
        OPAL("opal"),
        PAYMENT_FLOWS("payment_flows"),
        RESERVE_APPEALS("reserve_appeals"),
        STANDARD_ONBOARDING("standard_onboarding"),
        STRIPE_CARD("stripe_card"),
        SUPPORT_SITE("support_site"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return Product.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<Product> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Product> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super(Product.values(), Product.UNKNOWN);
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18888x9b2ce496.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        Product(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FinancialConnectionsSessionManifest(int i, int i2, @InterfaceC36694Vs5("allow_manual_entry") boolean z, @InterfaceC36694Vs5("consent_required") boolean z2, @InterfaceC36694Vs5("custom_manual_entry_handling") boolean z3, @InterfaceC36694Vs5("disable_link_more_accounts") boolean z4, @InterfaceC36694Vs5("id") String str, @InterfaceC36694Vs5("instant_verification_disabled") boolean z5, @InterfaceC36694Vs5("institution_search_disabled") boolean z6, @InterfaceC36694Vs5("livemode") boolean z7, @InterfaceC36694Vs5("manual_entry_uses_microdeposits") boolean z8, @InterfaceC36694Vs5("mobile_handoff_enabled") boolean z9, @InterfaceC36694Vs5("next_pane") Pane pane, @InterfaceC36694Vs5("manual_entry_mode") ManualEntryMode manualEntryMode, @InterfaceC36694Vs5("permissions") List list, @InterfaceC36694Vs5("product") Product product, @InterfaceC36694Vs5("single_account") boolean z10, @InterfaceC36694Vs5("use_single_sort_search") boolean z11, @InterfaceC36694Vs5("account_disconnection_method") AccountDisconnectionMethod accountDisconnectionMethod, @InterfaceC36694Vs5("accountholder_customer_email_address") String str2, @InterfaceC36694Vs5("accountholder_is_link_consumer") Boolean bool, @InterfaceC36694Vs5("accountholder_phone_number") String str3, @InterfaceC36694Vs5("accountholder_token") String str4, @InterfaceC36694Vs5("active_auth_session") FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, @InterfaceC36694Vs5("active_institution") FinancialConnectionsInstitution financialConnectionsInstitution, @InterfaceC36694Vs5("assignment_event_id") String str5, @InterfaceC36694Vs5("business_name") String str6, @InterfaceC36694Vs5("cancel_url") String str7, @InterfaceC36694Vs5("connect_platform_name") String str8, @InterfaceC36694Vs5("connected_account_name") String str9, @InterfaceC36694Vs5("experiment_assignments") Map map, @InterfaceC36694Vs5("features") Map map2, @InterfaceC36694Vs5("hosted_auth_url") String str10, @InterfaceC36694Vs5("initial_institution") FinancialConnectionsInstitution financialConnectionsInstitution2, @InterfaceC36694Vs5("is_end_user_facing") Boolean bool2, @InterfaceC36694Vs5("is_link_with_stripe") Boolean bool3, @InterfaceC36694Vs5("is_networking_user_flow") Boolean bool4, @InterfaceC36694Vs5("is_stripe_direct") Boolean bool5, @InterfaceC36694Vs5("link_account_session_cancellation_behavior") LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, @InterfaceC36694Vs5("modal_customization") Map map3, @InterfaceC36694Vs5("payment_method_type") FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, @InterfaceC36694Vs5("step_up_authentication_required") Boolean bool6, @InterfaceC36694Vs5("success_url") String str11, @InterfaceC36694Vs5("skip_success_pane") Boolean bool7, C38819bt5 c38819bt5) {
        if ((65535 != (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) | ((i2 & 0) != 0)) {
            C52838zW3.m1276a(new int[]{i, i2}, new int[]{Settings.DEFAULT_INITIAL_WINDOW_SIZE, 0}, FinancialConnectionsSessionManifest$$serializer.INSTANCE.getDescriptor());
        }
        this.allowManualEntry = z;
        this.consentRequired = z2;
        this.customManualEntryHandling = z3;
        this.disableLinkMoreAccounts = z4;
        this.f75311id = str;
        this.instantVerificationDisabled = z5;
        this.institutionSearchDisabled = z6;
        this.livemode = z7;
        this.manualEntryUsesMicrodeposits = z8;
        this.mobileHandoffEnabled = z9;
        this.nextPane = pane;
        this.manualEntryMode = manualEntryMode;
        this.permissions = list;
        this.product = product;
        this.singleAccount = z10;
        this.useSingleSortSearch = z11;
        if ((65536 & i) == 0) {
            this.accountDisconnectionMethod = null;
        } else {
            this.accountDisconnectionMethod = accountDisconnectionMethod;
        }
        if ((131072 & i) == 0) {
            this.accountholderCustomerEmailAddress = null;
        } else {
            this.accountholderCustomerEmailAddress = str2;
        }
        if ((262144 & i) == 0) {
            this.accountholderIsLinkConsumer = null;
        } else {
            this.accountholderIsLinkConsumer = bool;
        }
        if ((524288 & i) == 0) {
            this.accountholderPhoneNumber = null;
        } else {
            this.accountholderPhoneNumber = str3;
        }
        if ((1048576 & i) == 0) {
            this.accountholderToken = null;
        } else {
            this.accountholderToken = str4;
        }
        if ((2097152 & i) == 0) {
            this.activeAuthSession = null;
        } else {
            this.activeAuthSession = financialConnectionsAuthorizationSession;
        }
        if ((4194304 & i) == 0) {
            this.activeInstitution = null;
        } else {
            this.activeInstitution = financialConnectionsInstitution;
        }
        if ((8388608 & i) == 0) {
            this.assignmentEventId = null;
        } else {
            this.assignmentEventId = str5;
        }
        if ((16777216 & i) == 0) {
            this.businessName = null;
        } else {
            this.businessName = str6;
        }
        if ((33554432 & i) == 0) {
            this.cancelUrl = null;
        } else {
            this.cancelUrl = str7;
        }
        if ((67108864 & i) == 0) {
            this.connectPlatformName = null;
        } else {
            this.connectPlatformName = str8;
        }
        if ((134217728 & i) == 0) {
            this.connectedAccountName = null;
        } else {
            this.connectedAccountName = str9;
        }
        if ((268435456 & i) == 0) {
            this.experimentAssignments = null;
        } else {
            this.experimentAssignments = map;
        }
        if ((536870912 & i) == 0) {
            this.features = null;
        } else {
            this.features = map2;
        }
        if ((1073741824 & i) == 0) {
            this.hostedAuthUrl = null;
        } else {
            this.hostedAuthUrl = str10;
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            this.initialInstitution = null;
        } else {
            this.initialInstitution = financialConnectionsInstitution2;
        }
        if ((i2 & 1) == 0) {
            this.isEndUserFacing = null;
        } else {
            this.isEndUserFacing = bool2;
        }
        if ((i2 & 2) == 0) {
            this.isLinkWithStripe = null;
        } else {
            this.isLinkWithStripe = bool3;
        }
        if ((i2 & 4) == 0) {
            this.isNetworkingUserFlow = null;
        } else {
            this.isNetworkingUserFlow = bool4;
        }
        if ((i2 & 8) == 0) {
            this.isStripeDirect = null;
        } else {
            this.isStripeDirect = bool5;
        }
        if ((i2 & 16) == 0) {
            this.linkAccountSessionCancellationBehavior = null;
        } else {
            this.linkAccountSessionCancellationBehavior = linkAccountSessionCancellationBehavior;
        }
        if ((i2 & 32) == 0) {
            this.modalCustomization = null;
        } else {
            this.modalCustomization = map3;
        }
        if ((i2 & 64) == 0) {
            this.paymentMethodType = null;
        } else {
            this.paymentMethodType = supportedPaymentMethodTypes;
        }
        if ((i2 & 128) == 0) {
            this.stepUpAuthenticationRequired = null;
        } else {
            this.stepUpAuthenticationRequired = bool6;
        }
        if ((i2 & 256) == 0) {
            this.successUrl = null;
        } else {
            this.successUrl = str11;
        }
        if ((i2 & 512) == 0) {
            this.skipSuccessPane = null;
        } else {
            this.skipSuccessPane = bool7;
        }
    }

    @InterfaceC36694Vs5("account_disconnection_method")
    public static /* synthetic */ void getAccountDisconnectionMethod$annotations() {
    }

    @InterfaceC36694Vs5("accountholder_customer_email_address")
    public static /* synthetic */ void getAccountholderCustomerEmailAddress$annotations() {
    }

    @InterfaceC36694Vs5("accountholder_is_link_consumer")
    public static /* synthetic */ void getAccountholderIsLinkConsumer$annotations() {
    }

    @InterfaceC36694Vs5("accountholder_phone_number")
    public static /* synthetic */ void getAccountholderPhoneNumber$annotations() {
    }

    @InterfaceC36694Vs5("accountholder_token")
    public static /* synthetic */ void getAccountholderToken$annotations() {
    }

    @InterfaceC36694Vs5("active_auth_session")
    public static /* synthetic */ void getActiveAuthSession$annotations() {
    }

    @InterfaceC36694Vs5("active_institution")
    public static /* synthetic */ void getActiveInstitution$annotations() {
    }

    @InterfaceC36694Vs5("allow_manual_entry")
    public static /* synthetic */ void getAllowManualEntry$annotations() {
    }

    @InterfaceC36694Vs5("assignment_event_id")
    public static /* synthetic */ void getAssignmentEventId$annotations() {
    }

    @InterfaceC36694Vs5("business_name")
    public static /* synthetic */ void getBusinessName$annotations() {
    }

    @InterfaceC36694Vs5("cancel_url")
    public static /* synthetic */ void getCancelUrl$annotations() {
    }

    @InterfaceC36694Vs5("connect_platform_name")
    public static /* synthetic */ void getConnectPlatformName$annotations() {
    }

    @InterfaceC36694Vs5("connected_account_name")
    public static /* synthetic */ void getConnectedAccountName$annotations() {
    }

    @InterfaceC36694Vs5("consent_required")
    public static /* synthetic */ void getConsentRequired$annotations() {
    }

    @InterfaceC36694Vs5("custom_manual_entry_handling")
    public static /* synthetic */ void getCustomManualEntryHandling$annotations() {
    }

    @InterfaceC36694Vs5("disable_link_more_accounts")
    public static /* synthetic */ void getDisableLinkMoreAccounts$annotations() {
    }

    @InterfaceC36694Vs5("experiment_assignments")
    public static /* synthetic */ void getExperimentAssignments$annotations() {
    }

    @InterfaceC36694Vs5("features")
    public static /* synthetic */ void getFeatures$annotations() {
    }

    @InterfaceC36694Vs5("hosted_auth_url")
    public static /* synthetic */ void getHostedAuthUrl$annotations() {
    }

    @InterfaceC36694Vs5("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC36694Vs5("initial_institution")
    public static /* synthetic */ void getInitialInstitution$annotations() {
    }

    @InterfaceC36694Vs5("instant_verification_disabled")
    public static /* synthetic */ void getInstantVerificationDisabled$annotations() {
    }

    @InterfaceC36694Vs5("institution_search_disabled")
    public static /* synthetic */ void getInstitutionSearchDisabled$annotations() {
    }

    @InterfaceC36694Vs5("link_account_session_cancellation_behavior")
    public static /* synthetic */ void getLinkAccountSessionCancellationBehavior$annotations() {
    }

    @InterfaceC36694Vs5("livemode")
    public static /* synthetic */ void getLivemode$annotations() {
    }

    @InterfaceC36694Vs5("manual_entry_mode")
    public static /* synthetic */ void getManualEntryMode$annotations() {
    }

    @InterfaceC36694Vs5("manual_entry_uses_microdeposits")
    public static /* synthetic */ void getManualEntryUsesMicrodeposits$annotations() {
    }

    @InterfaceC36694Vs5("mobile_handoff_enabled")
    public static /* synthetic */ void getMobileHandoffEnabled$annotations() {
    }

    @InterfaceC36694Vs5("modal_customization")
    public static /* synthetic */ void getModalCustomization$annotations() {
    }

    @InterfaceC36694Vs5("next_pane")
    public static /* synthetic */ void getNextPane$annotations() {
    }

    @InterfaceC36694Vs5("payment_method_type")
    public static /* synthetic */ void getPaymentMethodType$annotations() {
    }

    @InterfaceC36694Vs5("permissions")
    public static /* synthetic */ void getPermissions$annotations() {
    }

    @InterfaceC36694Vs5("product")
    public static /* synthetic */ void getProduct$annotations() {
    }

    @InterfaceC36694Vs5("single_account")
    public static /* synthetic */ void getSingleAccount$annotations() {
    }

    @InterfaceC36694Vs5("skip_success_pane")
    public static /* synthetic */ void getSkipSuccessPane$annotations() {
    }

    @InterfaceC36694Vs5("step_up_authentication_required")
    public static /* synthetic */ void getStepUpAuthenticationRequired$annotations() {
    }

    @InterfaceC36694Vs5("success_url")
    public static /* synthetic */ void getSuccessUrl$annotations() {
    }

    @InterfaceC36694Vs5("use_single_sort_search")
    public static /* synthetic */ void getUseSingleSortSearch$annotations() {
    }

    @InterfaceC36694Vs5("is_end_user_facing")
    public static /* synthetic */ void isEndUserFacing$annotations() {
    }

    @InterfaceC36694Vs5("is_link_with_stripe")
    public static /* synthetic */ void isLinkWithStripe$annotations() {
    }

    @InterfaceC36694Vs5("is_networking_user_flow")
    public static /* synthetic */ void isNetworkingUserFlow$annotations() {
    }

    @InterfaceC36694Vs5("is_stripe_direct")
    public static /* synthetic */ void isStripeDirect$annotations() {
    }

    @JvmStatic
    public static final void write$Self(FinancialConnectionsSessionManifest self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1129v(serialDesc, 0, self.allowManualEntry);
        output.mo1129v(serialDesc, 1, self.consentRequired);
        output.mo1129v(serialDesc, 2, self.customManualEntryHandling);
        output.mo1129v(serialDesc, 3, self.disableLinkMoreAccounts);
        output.mo1128w(serialDesc, 4, self.f75311id);
        output.mo1129v(serialDesc, 5, self.instantVerificationDisabled);
        output.mo1129v(serialDesc, 6, self.institutionSearchDisabled);
        output.mo1129v(serialDesc, 7, self.livemode);
        output.mo1129v(serialDesc, 8, self.manualEntryUsesMicrodeposits);
        output.mo1129v(serialDesc, 9, self.mobileHandoffEnabled);
        output.mo1126y(serialDesc, 10, Pane.Serializer.INSTANCE, self.nextPane);
        output.mo1126y(serialDesc, 11, ManualEntryMode.Serializer.INSTANCE, self.manualEntryMode);
        output.mo1126y(serialDesc, 12, new C27999ro(FinancialConnectionsAccount.Permissions.Serializer.INSTANCE), self.permissions);
        output.mo1126y(serialDesc, 13, Product.Serializer.INSTANCE, self.product);
        output.mo1129v(serialDesc, 14, self.singleAccount);
        output.mo1129v(serialDesc, 15, self.useSingleSortSearch);
        if (output.mo1132s(serialDesc, 16) || self.accountDisconnectionMethod != null) {
            output.mo1173E(serialDesc, 16, AccountDisconnectionMethod.Serializer.INSTANCE, self.accountDisconnectionMethod);
        }
        if (output.mo1132s(serialDesc, 17) || self.accountholderCustomerEmailAddress != null) {
            output.mo1173E(serialDesc, 17, C41539gS5.f82260a, self.accountholderCustomerEmailAddress);
        }
        if (output.mo1132s(serialDesc, 18) || self.accountholderIsLinkConsumer != null) {
            output.mo1173E(serialDesc, 18, C9804YY.f45990a, self.accountholderIsLinkConsumer);
        }
        if (output.mo1132s(serialDesc, 19) || self.accountholderPhoneNumber != null) {
            output.mo1173E(serialDesc, 19, C41539gS5.f82260a, self.accountholderPhoneNumber);
        }
        if (output.mo1132s(serialDesc, 20) || self.accountholderToken != null) {
            output.mo1173E(serialDesc, 20, C41539gS5.f82260a, self.accountholderToken);
        }
        if (output.mo1132s(serialDesc, 21) || self.activeAuthSession != null) {
            output.mo1173E(serialDesc, 21, FinancialConnectionsAuthorizationSession$$serializer.INSTANCE, self.activeAuthSession);
        }
        if (output.mo1132s(serialDesc, 22) || self.activeInstitution != null) {
            output.mo1173E(serialDesc, 22, FinancialConnectionsInstitution$$serializer.INSTANCE, self.activeInstitution);
        }
        if (output.mo1132s(serialDesc, 23) || self.assignmentEventId != null) {
            output.mo1173E(serialDesc, 23, C41539gS5.f82260a, self.assignmentEventId);
        }
        if (output.mo1132s(serialDesc, 24) || self.businessName != null) {
            output.mo1173E(serialDesc, 24, C41539gS5.f82260a, self.businessName);
        }
        if (output.mo1132s(serialDesc, 25) || self.cancelUrl != null) {
            output.mo1173E(serialDesc, 25, C41539gS5.f82260a, self.cancelUrl);
        }
        if (output.mo1132s(serialDesc, 26) || self.connectPlatformName != null) {
            output.mo1173E(serialDesc, 26, C41539gS5.f82260a, self.connectPlatformName);
        }
        if (output.mo1132s(serialDesc, 27) || self.connectedAccountName != null) {
            output.mo1173E(serialDesc, 27, C41539gS5.f82260a, self.connectedAccountName);
        }
        if (output.mo1132s(serialDesc, 28) || self.experimentAssignments != null) {
            C41539gS5 c41539gS5 = C41539gS5.f82260a;
            output.mo1173E(serialDesc, 28, new C35512Qr2(c41539gS5, c41539gS5), self.experimentAssignments);
        }
        if (output.mo1132s(serialDesc, 29) || self.features != null) {
            output.mo1173E(serialDesc, 29, new C35512Qr2(C41539gS5.f82260a, C9804YY.f45990a), self.features);
        }
        if (output.mo1132s(serialDesc, 30) || self.hostedAuthUrl != null) {
            output.mo1173E(serialDesc, 30, C41539gS5.f82260a, self.hostedAuthUrl);
        }
        if (output.mo1132s(serialDesc, 31) || self.initialInstitution != null) {
            output.mo1173E(serialDesc, 31, FinancialConnectionsInstitution$$serializer.INSTANCE, self.initialInstitution);
        }
        if (output.mo1132s(serialDesc, 32) || self.isEndUserFacing != null) {
            output.mo1173E(serialDesc, 32, C9804YY.f45990a, self.isEndUserFacing);
        }
        if (output.mo1132s(serialDesc, 33) || self.isLinkWithStripe != null) {
            output.mo1173E(serialDesc, 33, C9804YY.f45990a, self.isLinkWithStripe);
        }
        if (output.mo1132s(serialDesc, 34) || self.isNetworkingUserFlow != null) {
            output.mo1173E(serialDesc, 34, C9804YY.f45990a, self.isNetworkingUserFlow);
        }
        if (output.mo1132s(serialDesc, 35) || self.isStripeDirect != null) {
            output.mo1173E(serialDesc, 35, C9804YY.f45990a, self.isStripeDirect);
        }
        if (output.mo1132s(serialDesc, 36) || self.linkAccountSessionCancellationBehavior != null) {
            output.mo1173E(serialDesc, 36, LinkAccountSessionCancellationBehavior.Serializer.INSTANCE, self.linkAccountSessionCancellationBehavior);
        }
        if (output.mo1132s(serialDesc, 37) || self.modalCustomization != null) {
            output.mo1173E(serialDesc, 37, new C35512Qr2(C41539gS5.f82260a, C9804YY.f45990a), self.modalCustomization);
        }
        if (output.mo1132s(serialDesc, 38) || self.paymentMethodType != null) {
            output.mo1173E(serialDesc, 38, FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE, self.paymentMethodType);
        }
        if (output.mo1132s(serialDesc, 39) || self.stepUpAuthenticationRequired != null) {
            output.mo1173E(serialDesc, 39, C9804YY.f45990a, self.stepUpAuthenticationRequired);
        }
        if (output.mo1132s(serialDesc, 40) || self.successUrl != null) {
            output.mo1173E(serialDesc, 40, C41539gS5.f82260a, self.successUrl);
        }
        if (output.mo1132s(serialDesc, 41) || self.skipSuccessPane != null) {
            output.mo1173E(serialDesc, 41, C9804YY.f45990a, self.skipSuccessPane);
        }
    }

    public final boolean component1() {
        return this.allowManualEntry;
    }

    public final boolean component10() {
        return this.mobileHandoffEnabled;
    }

    public final Pane component11() {
        return this.nextPane;
    }

    public final ManualEntryMode component12() {
        return this.manualEntryMode;
    }

    public final List<FinancialConnectionsAccount.Permissions> component13() {
        return this.permissions;
    }

    public final Product component14() {
        return this.product;
    }

    public final boolean component15() {
        return this.singleAccount;
    }

    public final boolean component16() {
        return this.useSingleSortSearch;
    }

    public final AccountDisconnectionMethod component17() {
        return this.accountDisconnectionMethod;
    }

    public final String component18() {
        return this.accountholderCustomerEmailAddress;
    }

    public final Boolean component19() {
        return this.accountholderIsLinkConsumer;
    }

    public final boolean component2() {
        return this.consentRequired;
    }

    public final String component20() {
        return this.accountholderPhoneNumber;
    }

    public final String component21() {
        return this.accountholderToken;
    }

    public final FinancialConnectionsAuthorizationSession component22() {
        return this.activeAuthSession;
    }

    public final FinancialConnectionsInstitution component23() {
        return this.activeInstitution;
    }

    public final String component24() {
        return this.assignmentEventId;
    }

    public final String component25() {
        return this.businessName;
    }

    public final String component26() {
        return this.cancelUrl;
    }

    public final String component27() {
        return this.connectPlatformName;
    }

    public final String component28() {
        return this.connectedAccountName;
    }

    public final Map<String, String> component29() {
        return this.experimentAssignments;
    }

    public final boolean component3() {
        return this.customManualEntryHandling;
    }

    public final Map<String, Boolean> component30() {
        return this.features;
    }

    public final String component31() {
        return this.hostedAuthUrl;
    }

    public final FinancialConnectionsInstitution component32() {
        return this.initialInstitution;
    }

    public final Boolean component33() {
        return this.isEndUserFacing;
    }

    public final Boolean component34() {
        return this.isLinkWithStripe;
    }

    public final Boolean component35() {
        return this.isNetworkingUserFlow;
    }

    public final Boolean component36() {
        return this.isStripeDirect;
    }

    public final LinkAccountSessionCancellationBehavior component37() {
        return this.linkAccountSessionCancellationBehavior;
    }

    public final Map<String, Boolean> component38() {
        return this.modalCustomization;
    }

    public final FinancialConnectionsAccount.SupportedPaymentMethodTypes component39() {
        return this.paymentMethodType;
    }

    public final boolean component4() {
        return this.disableLinkMoreAccounts;
    }

    public final Boolean component40() {
        return this.stepUpAuthenticationRequired;
    }

    public final String component41() {
        return this.successUrl;
    }

    public final Boolean component42() {
        return this.skipSuccessPane;
    }

    public final String component5() {
        return this.f75311id;
    }

    public final boolean component6() {
        return this.instantVerificationDisabled;
    }

    public final boolean component7() {
        return this.institutionSearchDisabled;
    }

    public final boolean component8() {
        return this.livemode;
    }

    public final boolean component9() {
        return this.manualEntryUsesMicrodeposits;
    }

    public final FinancialConnectionsSessionManifest copy(boolean z, boolean z2, boolean z3, boolean z4, String id, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Pane nextPane, ManualEntryMode manualEntryMode, List<? extends FinancialConnectionsAccount.Permissions> permissions, Product product, boolean z10, boolean z11, AccountDisconnectionMethod accountDisconnectionMethod, String str, Boolean bool, String str2, String str3, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsInstitution financialConnectionsInstitution, String str4, String str5, String str6, String str7, String str8, Map<String, String> map, Map<String, Boolean> map2, String str9, FinancialConnectionsInstitution financialConnectionsInstitution2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map<String, Boolean> map3, FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, Boolean bool6, String str10, Boolean bool7) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        Intrinsics.checkNotNullParameter(manualEntryMode, "manualEntryMode");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(product, "product");
        return new FinancialConnectionsSessionManifest(z, z2, z3, z4, id, z5, z6, z7, z8, z9, nextPane, manualEntryMode, permissions, product, z10, z11, accountDisconnectionMethod, str, bool, str2, str3, financialConnectionsAuthorizationSession, financialConnectionsInstitution, str4, str5, str6, str7, str8, map, map2, str9, financialConnectionsInstitution2, bool2, bool3, bool4, bool5, linkAccountSessionCancellationBehavior, map3, supportedPaymentMethodTypes, bool6, str10, bool7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsSessionManifest) {
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
            return this.allowManualEntry == financialConnectionsSessionManifest.allowManualEntry && this.consentRequired == financialConnectionsSessionManifest.consentRequired && this.customManualEntryHandling == financialConnectionsSessionManifest.customManualEntryHandling && this.disableLinkMoreAccounts == financialConnectionsSessionManifest.disableLinkMoreAccounts && Intrinsics.areEqual(this.f75311id, financialConnectionsSessionManifest.f75311id) && this.instantVerificationDisabled == financialConnectionsSessionManifest.instantVerificationDisabled && this.institutionSearchDisabled == financialConnectionsSessionManifest.institutionSearchDisabled && this.livemode == financialConnectionsSessionManifest.livemode && this.manualEntryUsesMicrodeposits == financialConnectionsSessionManifest.manualEntryUsesMicrodeposits && this.mobileHandoffEnabled == financialConnectionsSessionManifest.mobileHandoffEnabled && this.nextPane == financialConnectionsSessionManifest.nextPane && this.manualEntryMode == financialConnectionsSessionManifest.manualEntryMode && Intrinsics.areEqual(this.permissions, financialConnectionsSessionManifest.permissions) && this.product == financialConnectionsSessionManifest.product && this.singleAccount == financialConnectionsSessionManifest.singleAccount && this.useSingleSortSearch == financialConnectionsSessionManifest.useSingleSortSearch && this.accountDisconnectionMethod == financialConnectionsSessionManifest.accountDisconnectionMethod && Intrinsics.areEqual(this.accountholderCustomerEmailAddress, financialConnectionsSessionManifest.accountholderCustomerEmailAddress) && Intrinsics.areEqual(this.accountholderIsLinkConsumer, financialConnectionsSessionManifest.accountholderIsLinkConsumer) && Intrinsics.areEqual(this.accountholderPhoneNumber, financialConnectionsSessionManifest.accountholderPhoneNumber) && Intrinsics.areEqual(this.accountholderToken, financialConnectionsSessionManifest.accountholderToken) && Intrinsics.areEqual(this.activeAuthSession, financialConnectionsSessionManifest.activeAuthSession) && Intrinsics.areEqual(this.activeInstitution, financialConnectionsSessionManifest.activeInstitution) && Intrinsics.areEqual(this.assignmentEventId, financialConnectionsSessionManifest.assignmentEventId) && Intrinsics.areEqual(this.businessName, financialConnectionsSessionManifest.businessName) && Intrinsics.areEqual(this.cancelUrl, financialConnectionsSessionManifest.cancelUrl) && Intrinsics.areEqual(this.connectPlatformName, financialConnectionsSessionManifest.connectPlatformName) && Intrinsics.areEqual(this.connectedAccountName, financialConnectionsSessionManifest.connectedAccountName) && Intrinsics.areEqual(this.experimentAssignments, financialConnectionsSessionManifest.experimentAssignments) && Intrinsics.areEqual(this.features, financialConnectionsSessionManifest.features) && Intrinsics.areEqual(this.hostedAuthUrl, financialConnectionsSessionManifest.hostedAuthUrl) && Intrinsics.areEqual(this.initialInstitution, financialConnectionsSessionManifest.initialInstitution) && Intrinsics.areEqual(this.isEndUserFacing, financialConnectionsSessionManifest.isEndUserFacing) && Intrinsics.areEqual(this.isLinkWithStripe, financialConnectionsSessionManifest.isLinkWithStripe) && Intrinsics.areEqual(this.isNetworkingUserFlow, financialConnectionsSessionManifest.isNetworkingUserFlow) && Intrinsics.areEqual(this.isStripeDirect, financialConnectionsSessionManifest.isStripeDirect) && this.linkAccountSessionCancellationBehavior == financialConnectionsSessionManifest.linkAccountSessionCancellationBehavior && Intrinsics.areEqual(this.modalCustomization, financialConnectionsSessionManifest.modalCustomization) && this.paymentMethodType == financialConnectionsSessionManifest.paymentMethodType && Intrinsics.areEqual(this.stepUpAuthenticationRequired, financialConnectionsSessionManifest.stepUpAuthenticationRequired) && Intrinsics.areEqual(this.successUrl, financialConnectionsSessionManifest.successUrl) && Intrinsics.areEqual(this.skipSuccessPane, financialConnectionsSessionManifest.skipSuccessPane);
        }
        return false;
    }

    public final AccountDisconnectionMethod getAccountDisconnectionMethod() {
        return this.accountDisconnectionMethod;
    }

    public final String getAccountholderCustomerEmailAddress() {
        return this.accountholderCustomerEmailAddress;
    }

    public final Boolean getAccountholderIsLinkConsumer() {
        return this.accountholderIsLinkConsumer;
    }

    public final String getAccountholderPhoneNumber() {
        return this.accountholderPhoneNumber;
    }

    public final String getAccountholderToken() {
        return this.accountholderToken;
    }

    public final FinancialConnectionsAuthorizationSession getActiveAuthSession() {
        return this.activeAuthSession;
    }

    public final FinancialConnectionsInstitution getActiveInstitution() {
        return this.activeInstitution;
    }

    public final boolean getAllowManualEntry() {
        return this.allowManualEntry;
    }

    public final String getAssignmentEventId() {
        return this.assignmentEventId;
    }

    public final String getBusinessName() {
        return this.businessName;
    }

    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    public final String getConnectPlatformName() {
        return this.connectPlatformName;
    }

    public final String getConnectedAccountName() {
        return this.connectedAccountName;
    }

    public final boolean getConsentRequired() {
        return this.consentRequired;
    }

    public final boolean getCustomManualEntryHandling() {
        return this.customManualEntryHandling;
    }

    public final boolean getDisableLinkMoreAccounts() {
        return this.disableLinkMoreAccounts;
    }

    public final Map<String, String> getExperimentAssignments() {
        return this.experimentAssignments;
    }

    public final Map<String, Boolean> getFeatures() {
        return this.features;
    }

    public final String getHostedAuthUrl() {
        return this.hostedAuthUrl;
    }

    public final String getId() {
        return this.f75311id;
    }

    public final FinancialConnectionsInstitution getInitialInstitution() {
        return this.initialInstitution;
    }

    public final boolean getInstantVerificationDisabled() {
        return this.instantVerificationDisabled;
    }

    public final boolean getInstitutionSearchDisabled() {
        return this.institutionSearchDisabled;
    }

    public final LinkAccountSessionCancellationBehavior getLinkAccountSessionCancellationBehavior() {
        return this.linkAccountSessionCancellationBehavior;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final ManualEntryMode getManualEntryMode() {
        return this.manualEntryMode;
    }

    public final boolean getManualEntryUsesMicrodeposits() {
        return this.manualEntryUsesMicrodeposits;
    }

    public final boolean getMobileHandoffEnabled() {
        return this.mobileHandoffEnabled;
    }

    public final Map<String, Boolean> getModalCustomization() {
        return this.modalCustomization;
    }

    public final Pane getNextPane() {
        return this.nextPane;
    }

    public final FinancialConnectionsAccount.SupportedPaymentMethodTypes getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final List<FinancialConnectionsAccount.Permissions> getPermissions() {
        return this.permissions;
    }

    public final Product getProduct() {
        return this.product;
    }

    public final boolean getSingleAccount() {
        return this.singleAccount;
    }

    public final Boolean getSkipSuccessPane() {
        return this.skipSuccessPane;
    }

    public final Boolean getStepUpAuthenticationRequired() {
        return this.stepUpAuthenticationRequired;
    }

    public final String getSuccessUrl() {
        return this.successUrl;
    }

    public final boolean getUseSingleSortSearch() {
        return this.useSingleSortSearch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.allowManualEntry;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.consentRequired;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.customManualEntryHandling;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.disableLinkMoreAccounts;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int hashCode = (((i5 + i6) * 31) + this.f75311id.hashCode()) * 31;
        ?? r24 = this.instantVerificationDisabled;
        int i7 = r24;
        if (r24 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode + i7) * 31;
        ?? r25 = this.institutionSearchDisabled;
        int i9 = r25;
        if (r25 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        ?? r26 = this.livemode;
        int i11 = r26;
        if (r26 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r27 = this.manualEntryUsesMicrodeposits;
        int i13 = r27;
        if (r27 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r28 = this.mobileHandoffEnabled;
        int i15 = r28;
        if (r28 != 0) {
            i15 = 1;
        }
        int hashCode2 = (((((((((i14 + i15) * 31) + this.nextPane.hashCode()) * 31) + this.manualEntryMode.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.product.hashCode()) * 31;
        ?? r29 = this.singleAccount;
        int i16 = r29;
        if (r29 != 0) {
            i16 = 1;
        }
        int i17 = (hashCode2 + i16) * 31;
        boolean z2 = this.useSingleSortSearch;
        int i18 = (i17 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        AccountDisconnectionMethod accountDisconnectionMethod = this.accountDisconnectionMethod;
        int hashCode3 = (i18 + (accountDisconnectionMethod == null ? 0 : accountDisconnectionMethod.hashCode())) * 31;
        String str = this.accountholderCustomerEmailAddress;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.accountholderIsLinkConsumer;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.accountholderPhoneNumber;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountholderToken;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = this.activeAuthSession;
        int hashCode8 = (hashCode7 + (financialConnectionsAuthorizationSession == null ? 0 : financialConnectionsAuthorizationSession.hashCode())) * 31;
        FinancialConnectionsInstitution financialConnectionsInstitution = this.activeInstitution;
        int hashCode9 = (hashCode8 + (financialConnectionsInstitution == null ? 0 : financialConnectionsInstitution.hashCode())) * 31;
        String str4 = this.assignmentEventId;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.businessName;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cancelUrl;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.connectPlatformName;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.connectedAccountName;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, String> map = this.experimentAssignments;
        int hashCode15 = (hashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Boolean> map2 = this.features;
        int hashCode16 = (hashCode15 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str9 = this.hostedAuthUrl;
        int hashCode17 = (hashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        FinancialConnectionsInstitution financialConnectionsInstitution2 = this.initialInstitution;
        int hashCode18 = (hashCode17 + (financialConnectionsInstitution2 == null ? 0 : financialConnectionsInstitution2.hashCode())) * 31;
        Boolean bool2 = this.isEndUserFacing;
        int hashCode19 = (hashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isLinkWithStripe;
        int hashCode20 = (hashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isNetworkingUserFlow;
        int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isStripeDirect;
        int hashCode22 = (hashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = this.linkAccountSessionCancellationBehavior;
        int hashCode23 = (hashCode22 + (linkAccountSessionCancellationBehavior == null ? 0 : linkAccountSessionCancellationBehavior.hashCode())) * 31;
        Map<String, Boolean> map3 = this.modalCustomization;
        int hashCode24 = (hashCode23 + (map3 == null ? 0 : map3.hashCode())) * 31;
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = this.paymentMethodType;
        int hashCode25 = (hashCode24 + (supportedPaymentMethodTypes == null ? 0 : supportedPaymentMethodTypes.hashCode())) * 31;
        Boolean bool6 = this.stepUpAuthenticationRequired;
        int hashCode26 = (hashCode25 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str10 = this.successUrl;
        int hashCode27 = (hashCode26 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool7 = this.skipSuccessPane;
        return hashCode27 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final Boolean isEndUserFacing() {
        return this.isEndUserFacing;
    }

    public final Boolean isLinkWithStripe() {
        return this.isLinkWithStripe;
    }

    public final Boolean isNetworkingUserFlow() {
        return this.isNetworkingUserFlow;
    }

    public final Boolean isStripeDirect() {
        return this.isStripeDirect;
    }

    public String toString() {
        boolean z = this.allowManualEntry;
        boolean z2 = this.consentRequired;
        boolean z3 = this.customManualEntryHandling;
        boolean z4 = this.disableLinkMoreAccounts;
        String str = this.f75311id;
        boolean z5 = this.instantVerificationDisabled;
        boolean z6 = this.institutionSearchDisabled;
        boolean z7 = this.livemode;
        boolean z8 = this.manualEntryUsesMicrodeposits;
        boolean z9 = this.mobileHandoffEnabled;
        Pane pane = this.nextPane;
        ManualEntryMode manualEntryMode = this.manualEntryMode;
        List<FinancialConnectionsAccount.Permissions> list = this.permissions;
        Product product = this.product;
        boolean z10 = this.singleAccount;
        boolean z11 = this.useSingleSortSearch;
        AccountDisconnectionMethod accountDisconnectionMethod = this.accountDisconnectionMethod;
        String str2 = this.accountholderCustomerEmailAddress;
        Boolean bool = this.accountholderIsLinkConsumer;
        String str3 = this.accountholderPhoneNumber;
        String str4 = this.accountholderToken;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = this.activeAuthSession;
        FinancialConnectionsInstitution financialConnectionsInstitution = this.activeInstitution;
        String str5 = this.assignmentEventId;
        String str6 = this.businessName;
        String str7 = this.cancelUrl;
        String str8 = this.connectPlatformName;
        String str9 = this.connectedAccountName;
        Map<String, String> map = this.experimentAssignments;
        Map<String, Boolean> map2 = this.features;
        String str10 = this.hostedAuthUrl;
        FinancialConnectionsInstitution financialConnectionsInstitution2 = this.initialInstitution;
        Boolean bool2 = this.isEndUserFacing;
        Boolean bool3 = this.isLinkWithStripe;
        Boolean bool4 = this.isNetworkingUserFlow;
        Boolean bool5 = this.isStripeDirect;
        LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = this.linkAccountSessionCancellationBehavior;
        Map<String, Boolean> map3 = this.modalCustomization;
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = this.paymentMethodType;
        Boolean bool6 = this.stepUpAuthenticationRequired;
        String str11 = this.successUrl;
        Boolean bool7 = this.skipSuccessPane;
        return "FinancialConnectionsSessionManifest(allowManualEntry=" + z + ", consentRequired=" + z2 + ", customManualEntryHandling=" + z3 + ", disableLinkMoreAccounts=" + z4 + ", id=" + str + ", instantVerificationDisabled=" + z5 + ", institutionSearchDisabled=" + z6 + ", livemode=" + z7 + ", manualEntryUsesMicrodeposits=" + z8 + ", mobileHandoffEnabled=" + z9 + ", nextPane=" + pane + ", manualEntryMode=" + manualEntryMode + ", permissions=" + list + ", product=" + product + ", singleAccount=" + z10 + ", useSingleSortSearch=" + z11 + ", accountDisconnectionMethod=" + accountDisconnectionMethod + ", accountholderCustomerEmailAddress=" + str2 + ", accountholderIsLinkConsumer=" + bool + ", accountholderPhoneNumber=" + str3 + ", accountholderToken=" + str4 + ", activeAuthSession=" + financialConnectionsAuthorizationSession + ", activeInstitution=" + financialConnectionsInstitution + ", assignmentEventId=" + str5 + ", businessName=" + str6 + ", cancelUrl=" + str7 + ", connectPlatformName=" + str8 + ", connectedAccountName=" + str9 + ", experimentAssignments=" + map + ", features=" + map2 + ", hostedAuthUrl=" + str10 + ", initialInstitution=" + financialConnectionsInstitution2 + ", isEndUserFacing=" + bool2 + ", isLinkWithStripe=" + bool3 + ", isNetworkingUserFlow=" + bool4 + ", isStripeDirect=" + bool5 + ", linkAccountSessionCancellationBehavior=" + linkAccountSessionCancellationBehavior + ", modalCustomization=" + map3 + ", paymentMethodType=" + supportedPaymentMethodTypes + ", stepUpAuthenticationRequired=" + bool6 + ", successUrl=" + str11 + ", skipSuccessPane=" + bool7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.allowManualEntry ? 1 : 0);
        out.writeInt(this.consentRequired ? 1 : 0);
        out.writeInt(this.customManualEntryHandling ? 1 : 0);
        out.writeInt(this.disableLinkMoreAccounts ? 1 : 0);
        out.writeString(this.f75311id);
        out.writeInt(this.instantVerificationDisabled ? 1 : 0);
        out.writeInt(this.institutionSearchDisabled ? 1 : 0);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeInt(this.manualEntryUsesMicrodeposits ? 1 : 0);
        out.writeInt(this.mobileHandoffEnabled ? 1 : 0);
        out.writeString(this.nextPane.name());
        out.writeString(this.manualEntryMode.name());
        List<FinancialConnectionsAccount.Permissions> list = this.permissions;
        out.writeInt(list.size());
        for (FinancialConnectionsAccount.Permissions permissions : list) {
            out.writeString(permissions.name());
        }
        out.writeString(this.product.name());
        out.writeInt(this.singleAccount ? 1 : 0);
        out.writeInt(this.useSingleSortSearch ? 1 : 0);
        AccountDisconnectionMethod accountDisconnectionMethod = this.accountDisconnectionMethod;
        if (accountDisconnectionMethod == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(accountDisconnectionMethod.name());
        }
        out.writeString(this.accountholderCustomerEmailAddress);
        Boolean bool = this.accountholderIsLinkConsumer;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeString(this.accountholderPhoneNumber);
        out.writeString(this.accountholderToken);
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = this.activeAuthSession;
        if (financialConnectionsAuthorizationSession == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            financialConnectionsAuthorizationSession.writeToParcel(out, i);
        }
        FinancialConnectionsInstitution financialConnectionsInstitution = this.activeInstitution;
        if (financialConnectionsInstitution == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            financialConnectionsInstitution.writeToParcel(out, i);
        }
        out.writeString(this.assignmentEventId);
        out.writeString(this.businessName);
        out.writeString(this.cancelUrl);
        out.writeString(this.connectPlatformName);
        out.writeString(this.connectedAccountName);
        Map<String, String> map = this.experimentAssignments;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        Map<String, Boolean> map2 = this.features;
        if (map2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map2.size());
            for (Map.Entry<String, Boolean> entry2 : map2.entrySet()) {
                out.writeString(entry2.getKey());
                out.writeInt(entry2.getValue().booleanValue() ? 1 : 0);
            }
        }
        out.writeString(this.hostedAuthUrl);
        FinancialConnectionsInstitution financialConnectionsInstitution2 = this.initialInstitution;
        if (financialConnectionsInstitution2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            financialConnectionsInstitution2.writeToParcel(out, i);
        }
        Boolean bool2 = this.isEndUserFacing;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isLinkWithStripe;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.isNetworkingUserFlow;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.isStripeDirect;
        if (bool5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = this.linkAccountSessionCancellationBehavior;
        if (linkAccountSessionCancellationBehavior == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(linkAccountSessionCancellationBehavior.name());
        }
        Map<String, Boolean> map3 = this.modalCustomization;
        if (map3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map3.size());
            for (Map.Entry<String, Boolean> entry3 : map3.entrySet()) {
                out.writeString(entry3.getKey());
                out.writeInt(entry3.getValue().booleanValue() ? 1 : 0);
            }
        }
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = this.paymentMethodType;
        if (supportedPaymentMethodTypes == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(supportedPaymentMethodTypes.name());
        }
        Boolean bool6 = this.stepUpAuthenticationRequired;
        if (bool6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        out.writeString(this.successUrl);
        Boolean bool7 = this.skipSuccessPane;
        if (bool7 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool7.booleanValue() ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinancialConnectionsSessionManifest(boolean z, boolean z2, boolean z3, boolean z4, String id, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Pane nextPane, ManualEntryMode manualEntryMode, List<? extends FinancialConnectionsAccount.Permissions> permissions, Product product, boolean z10, boolean z11, AccountDisconnectionMethod accountDisconnectionMethod, String str, Boolean bool, String str2, String str3, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsInstitution financialConnectionsInstitution, String str4, String str5, String str6, String str7, String str8, Map<String, String> map, Map<String, Boolean> map2, String str9, FinancialConnectionsInstitution financialConnectionsInstitution2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map<String, Boolean> map3, FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, Boolean bool6, String str10, Boolean bool7) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        Intrinsics.checkNotNullParameter(manualEntryMode, "manualEntryMode");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(product, "product");
        this.allowManualEntry = z;
        this.consentRequired = z2;
        this.customManualEntryHandling = z3;
        this.disableLinkMoreAccounts = z4;
        this.f75311id = id;
        this.instantVerificationDisabled = z5;
        this.institutionSearchDisabled = z6;
        this.livemode = z7;
        this.manualEntryUsesMicrodeposits = z8;
        this.mobileHandoffEnabled = z9;
        this.nextPane = nextPane;
        this.manualEntryMode = manualEntryMode;
        this.permissions = permissions;
        this.product = product;
        this.singleAccount = z10;
        this.useSingleSortSearch = z11;
        this.accountDisconnectionMethod = accountDisconnectionMethod;
        this.accountholderCustomerEmailAddress = str;
        this.accountholderIsLinkConsumer = bool;
        this.accountholderPhoneNumber = str2;
        this.accountholderToken = str3;
        this.activeAuthSession = financialConnectionsAuthorizationSession;
        this.activeInstitution = financialConnectionsInstitution;
        this.assignmentEventId = str4;
        this.businessName = str5;
        this.cancelUrl = str6;
        this.connectPlatformName = str7;
        this.connectedAccountName = str8;
        this.experimentAssignments = map;
        this.features = map2;
        this.hostedAuthUrl = str9;
        this.initialInstitution = financialConnectionsInstitution2;
        this.isEndUserFacing = bool2;
        this.isLinkWithStripe = bool3;
        this.isNetworkingUserFlow = bool4;
        this.isStripeDirect = bool5;
        this.linkAccountSessionCancellationBehavior = linkAccountSessionCancellationBehavior;
        this.modalCustomization = map3;
        this.paymentMethodType = supportedPaymentMethodTypes;
        this.stepUpAuthenticationRequired = bool6;
        this.successUrl = str10;
        this.skipSuccessPane = bool7;
    }

    public /* synthetic */ FinancialConnectionsSessionManifest(boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Pane pane, ManualEntryMode manualEntryMode, List list, Product product, boolean z10, boolean z11, AccountDisconnectionMethod accountDisconnectionMethod, String str2, Boolean bool, String str3, String str4, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsInstitution financialConnectionsInstitution, String str5, String str6, String str7, String str8, String str9, Map map, Map map2, String str10, FinancialConnectionsInstitution financialConnectionsInstitution2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map map3, FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, Boolean bool6, String str11, Boolean bool7, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, z4, str, z5, z6, z7, z8, z9, pane, manualEntryMode, list, product, z10, z11, (i & 65536) != 0 ? null : accountDisconnectionMethod, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : str2, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : bool, (i & 524288) != 0 ? null : str3, (i & 1048576) != 0 ? null : str4, (i & 2097152) != 0 ? null : financialConnectionsAuthorizationSession, (i & 4194304) != 0 ? null : financialConnectionsInstitution, (i & 8388608) != 0 ? null : str5, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str6, (i & 33554432) != 0 ? null : str7, (i & 67108864) != 0 ? null : str8, (i & 134217728) != 0 ? null : str9, (i & 268435456) != 0 ? null : map, (i & 536870912) != 0 ? null : map2, (i & 1073741824) != 0 ? null : str10, (i & Integer.MIN_VALUE) != 0 ? null : financialConnectionsInstitution2, (i2 & 1) != 0 ? null : bool2, (i2 & 2) != 0 ? null : bool3, (i2 & 4) != 0 ? null : bool4, (i2 & 8) != 0 ? null : bool5, (i2 & 16) != 0 ? null : linkAccountSessionCancellationBehavior, (i2 & 32) != 0 ? null : map3, (i2 & 64) != 0 ? null : supportedPaymentMethodTypes, (i2 & 128) != 0 ? null : bool6, (i2 & 256) != 0 ? null : str11, (i2 & 512) != 0 ? null : bool7);
    }
}
