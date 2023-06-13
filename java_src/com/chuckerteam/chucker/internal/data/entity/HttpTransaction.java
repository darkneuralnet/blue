package com.chuckerteam.chucker.internal.data.entity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.adyen.checkout.components.model.payments.request.CardPaymentMethod;
import com.chuckerteam.chucker.internal.support.SpanTextUtil;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.Headers;
import okhttp3.HttpUrl;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0002°\u0001B¼\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u000f\u0012\b\u00101\u001a\u0004\u0018\u00010\u000f\u0012\b\u00107\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010:\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010X\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010^\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010`\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010c\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010f\u001a\u00020\u0017\u0012\b\u0010l\u001a\u0004\u0018\u00010k\u0012\b\u0010r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010u\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010x\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010{\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010~\u001a\u0004\u0018\u00010\u0007\u0012\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000f\u0012\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0007\u0012\t\b\u0002\u0010\u0086\u0001\u001a\u00020\u0017\u0012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u0001\u0012\t\b\u0002\u0010\u008f\u0001\u001a\u00020\u0017\u0012\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0007¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001B\u000b\b\u0017¢\u0006\u0006\b\u00ad\u0001\u0010¯\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002J$\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0013\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u001a\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u0007J\u0010\u0010\u001d\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u001e\u001a\u00020\u0007J\u0010\u0010\u001f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0017J\u000e\u0010%\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0017J\u0006\u0010&\u001a\u00020\u000fJ\u0006\u0010'\u001a\u00020\u000fJ\u0006\u0010(\u001a\u00020\u000fJ\u0010\u0010*\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010\u0000R\"\u0010+\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R$\u0010:\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R$\u0010=\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010C\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR$\u0010F\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010>\u001a\u0004\bG\u0010@\"\u0004\bH\u0010BR$\u0010I\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010>\u001a\u0004\bJ\u0010@\"\u0004\bK\u0010BR$\u0010L\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010>\u001a\u0004\bM\u0010@\"\u0004\bN\u0010BR$\u0010O\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010>\u001a\u0004\bP\u0010@\"\u0004\bQ\u0010BR$\u0010R\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010>\u001a\u0004\bS\u0010@\"\u0004\bT\u0010BR$\u0010U\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010>\u001a\u0004\bV\u0010@\"\u0004\bW\u0010BR$\u0010X\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u00102\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R$\u0010[\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010>\u001a\u0004\b\\\u0010@\"\u0004\b]\u0010BR$\u0010^\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b^\u0010>\u001a\u0004\b_\u0010@\"\u0004\b\u0013\u0010BR$\u0010`\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u00102\u001a\u0004\ba\u00104\"\u0004\bb\u00106R$\u0010c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010>\u001a\u0004\bd\u0010@\"\u0004\be\u0010BR\"\u0010f\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bf\u0010h\"\u0004\bi\u0010jR$\u0010l\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\br\u0010>\u001a\u0004\bs\u0010@\"\u0004\bt\u0010BR$\u0010u\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bu\u0010>\u001a\u0004\bv\u0010@\"\u0004\bw\u0010BR$\u0010x\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bx\u00102\u001a\u0004\by\u00104\"\u0004\bz\u00106R$\u0010{\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b{\u0010>\u001a\u0004\b|\u0010@\"\u0004\b}\u0010BR$\u0010~\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b~\u0010>\u001a\u0004\b\u007f\u0010@\"\u0004\b\u001a\u0010BR(\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u00102\u001a\u0005\b\u0081\u0001\u00104\"\u0005\b\u0082\u0001\u00106R(\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010>\u001a\u0005\b\u0084\u0001\u0010@\"\u0005\b\u0085\u0001\u0010BR&\u0010\u0086\u0001\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010g\u001a\u0005\b\u0086\u0001\u0010h\"\u0005\b\u0087\u0001\u0010jR,\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010\u008f\u0001\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010g\u001a\u0005\b\u0090\u0001\u0010h\"\u0005\b\u0091\u0001\u0010jR'\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0005\b\u0092\u0001\u0010>\u001a\u0005\b\u0093\u0001\u0010@\"\u0004\b\u0014\u0010BR\u0015\u0010\u0097\u0001\u001a\u00030\u0094\u00018F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010@R\u0015\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010@R\u0015\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010@R\u0013\u0010\u009f\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010@R\u0015\u0010¡\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b \u0001\u0010@R\u0013\u0010£\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010@R\u0015\u0010¥\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010@R\u0013\u0010§\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010@R\u0013\u0010¨\u0001\u001a\u00020\u00178F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010hR\u0017\u0010¬\u0001\u001a\u0005\u0018\u00010©\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006±\u0001"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "", "Lokhttp3/Headers;", "headers", "", "LDN1;", "toHttpHeaderList", "", "body", "contentType", "formatBody", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "spanBody", "", "bytes", "formatBytes", "", "setRequestHeaders", "setGraphQlOperationName", "getParsedRequestHeaders", "getParsedResponseHeaders", "", "withMarkup", "getRequestHeadersString", "setResponseHeaders", "getResponseHeadersString", "getFormattedRequestBody", "getSpannedRequestBody", "getFormattedResponseBody", "getSpannedResponseBody", "Lokhttp3/HttpUrl;", "httpUrl", "populateUrl", "encode", "getFormattedUrl", "getFormattedPath", "getRequestTotalSize", "getResponseTotalSize", "getHarResponseBodySize", LegacyRepairType.OTHER_KEY, "hasTheSameContent", "id", "J", "getId", "()J", "setId", "(J)V", "requestDate", "Ljava/lang/Long;", "getRequestDate", "()Ljava/lang/Long;", "setRequestDate", "(Ljava/lang/Long;)V", "responseDate", "getResponseDate", "setResponseDate", "tookMs", "getTookMs", "setTookMs", "protocol", "Ljava/lang/String;", "getProtocol", "()Ljava/lang/String;", "setProtocol", "(Ljava/lang/String;)V", "method", "getMethod", "setMethod", "url", "getUrl", "setUrl", "host", "getHost", "setHost", "path", "getPath", "setPath", CardPaymentMethod.PAYMENT_METHOD_TYPE, "getScheme", "setScheme", "responseTlsVersion", "getResponseTlsVersion", "setResponseTlsVersion", "responseCipherSuite", "getResponseCipherSuite", "setResponseCipherSuite", "requestPayloadSize", "getRequestPayloadSize", "setRequestPayloadSize", "requestContentType", "getRequestContentType", "setRequestContentType", "requestHeaders", "getRequestHeaders", "requestHeadersSize", "getRequestHeadersSize", "setRequestHeadersSize", "requestBody", "getRequestBody", "setRequestBody", "isRequestBodyEncoded", "Z", "()Z", "setRequestBodyEncoded", "(Z)V", "", "responseCode", "Ljava/lang/Integer;", "getResponseCode", "()Ljava/lang/Integer;", "setResponseCode", "(Ljava/lang/Integer;)V", "responseMessage", "getResponseMessage", "setResponseMessage", "error", "getError", "setError", "responsePayloadSize", "getResponsePayloadSize", "setResponsePayloadSize", "responseContentType", "getResponseContentType", "setResponseContentType", "responseHeaders", "getResponseHeaders", "responseHeadersSize", "getResponseHeadersSize", "setResponseHeadersSize", "responseBody", "getResponseBody", "setResponseBody", "isResponseBodyEncoded", "setResponseBodyEncoded", "", "responseImageData", "[B", "getResponseImageData", "()[B", "setResponseImageData", "([B)V", "graphQlDetected", "getGraphQlDetected", "setGraphQlDetected", "graphQlOperationName", "getGraphQlOperationName", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;", "getStatus", "()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;", "status", "getRequestDateString", "requestDateString", "getResponseDateString", "responseDateString", "getDurationString", "durationString", "getRequestSizeString", "requestSizeString", "getResponseSizeString", "responseSizeString", "getTotalSizeString", "totalSizeString", "getResponseSummaryText", "responseSummaryText", "getNotificationText", "notificationText", "isSsl", "Landroid/graphics/Bitmap;", "getResponseImageBitmap", "()Landroid/graphics/Bitmap;", "responseImageBitmap", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z[BZLjava/lang/String;)V", "()V", C17296a.f69688o, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHttpTransaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpTransaction.kt\ncom/chuckerteam/chucker/internal/data/entity/HttpTransaction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
/* loaded from: classes5.dex */
public final class HttpTransaction {
    private String error;
    private boolean graphQlDetected;
    private String graphQlOperationName;
    private String host;

    /* renamed from: id */
    private long f69202id;
    private boolean isRequestBodyEncoded;
    private boolean isResponseBodyEncoded;
    private String method;
    private String path;
    private String protocol;
    private String requestBody;
    private String requestContentType;
    private Long requestDate;
    private String requestHeaders;
    private Long requestHeadersSize;
    private Long requestPayloadSize;
    private String responseBody;
    private String responseCipherSuite;
    private Integer responseCode;
    private String responseContentType;
    private Long responseDate;
    private String responseHeaders;
    private Long responseHeadersSize;
    private byte[] responseImageData;
    private String responseMessage;
    private Long responsePayloadSize;
    private String responseTlsVersion;
    private String scheme;
    private Long tookMs;
    private String url;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.data.entity.HttpTransaction$a */
    /* loaded from: classes5.dex */
    public enum EnumC17143a {
        Requested,
        Complete,
        Failed
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.data.entity.HttpTransaction$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C17144b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17143a.values().length];
            try {
                iArr[EnumC17143a.Failed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17143a.Requested.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"com/chuckerteam/chucker/internal/data/entity/HttpTransaction$c", "LFb6;", "", "LDN1;", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.data.entity.HttpTransaction$c */
    /* loaded from: classes5.dex */
    public static final class C17145c extends C32798Fb6<List<? extends DN1>> {
    }

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"com/chuckerteam/chucker/internal/data/entity/HttpTransaction$d", "LFb6;", "", "LDN1;", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.data.entity.HttpTransaction$d */
    /* loaded from: classes5.dex */
    public static final class C17146d extends C32798Fb6<List<? extends DN1>> {
    }

    public HttpTransaction(long j, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l4, String str9, String str10, Long l5, String str11, boolean z, Integer num, String str12, String str13, Long l6, String str14, String str15, Long l7, String str16, boolean z2, byte[] bArr, boolean z3, String str17) {
        this.f69202id = j;
        this.requestDate = l;
        this.responseDate = l2;
        this.tookMs = l3;
        this.protocol = str;
        this.method = str2;
        this.url = str3;
        this.host = str4;
        this.path = str5;
        this.scheme = str6;
        this.responseTlsVersion = str7;
        this.responseCipherSuite = str8;
        this.requestPayloadSize = l4;
        this.requestContentType = str9;
        this.requestHeaders = str10;
        this.requestHeadersSize = l5;
        this.requestBody = str11;
        this.isRequestBodyEncoded = z;
        this.responseCode = num;
        this.responseMessage = str12;
        this.error = str13;
        this.responsePayloadSize = l6;
        this.responseContentType = str14;
        this.responseHeaders = str15;
        this.responseHeadersSize = l7;
        this.responseBody = str16;
        this.isResponseBodyEncoded = z2;
        this.responseImageData = bArr;
        this.graphQlDetected = z3;
        this.graphQlOperationName = str17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String formatBody(String str, String str2) {
        boolean z;
        boolean contains;
        boolean contains2;
        boolean contains3;
        boolean isBlank;
        if (str2 != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str2);
            if (!isBlank) {
                z = false;
                if (z) {
                    contains = StringsKt__StringsKt.contains((CharSequence) str2, (CharSequence) "json", true);
                    if (contains) {
                        return C50730vx1.f114933a.m7720c(str);
                    }
                    contains2 = StringsKt__StringsKt.contains((CharSequence) str2, (CharSequence) "xml", true);
                    if (contains2) {
                        return C50730vx1.f114933a.m7718e(str);
                    }
                    contains3 = StringsKt__StringsKt.contains((CharSequence) str2, (CharSequence) "x-www-form-urlencoded", true);
                    if (contains3) {
                        return C50730vx1.f114933a.m7719d(str);
                    }
                    return str;
                }
                return str;
            }
        }
        z = true;
        if (z) {
        }
    }

    private final String formatBytes(long j) {
        return C50730vx1.f114933a.m7722a(j, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final CharSequence spanBody(CharSequence charSequence, String str, Context context) {
        boolean z;
        boolean contains;
        boolean isBlank;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (z) {
                    contains = StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) "json", true);
                    if (contains && context != null) {
                        return new SpanTextUtil(context).m52978f(charSequence);
                    }
                    return formatBody(charSequence.toString(), str);
                }
                return charSequence;
            }
        }
        z = true;
        if (z) {
        }
    }

    private final List<DN1> toHttpHeaderList(Headers headers) {
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new DN1(headers.name(i), headers.value(i)));
        }
        return arrayList;
    }

    public final String getDurationString() {
        Long l = this.tookMs;
        if (l != null) {
            long longValue = l.longValue();
            return longValue + " ms";
        }
        return null;
    }

    public final String getError() {
        return this.error;
    }

    public final String getFormattedPath(boolean z) {
        HttpUrl httpUrl;
        String str = this.url;
        if (str != null && (httpUrl = HttpUrl.Companion.get(str)) != null) {
            return C51323wx1.f116882f.m6063c(httpUrl, z).m6069b();
        }
        return "";
    }

    public final String getFormattedRequestBody() {
        String formatBody;
        String str = this.requestBody;
        return (str == null || (formatBody = formatBody(str, this.requestContentType)) == null) ? "" : formatBody;
    }

    public final String getFormattedResponseBody() {
        String formatBody;
        String str = this.responseBody;
        return (str == null || (formatBody = formatBody(str, this.responseContentType)) == null) ? "" : formatBody;
    }

    public final String getFormattedUrl(boolean z) {
        HttpUrl httpUrl;
        String str = this.url;
        if (str != null && (httpUrl = HttpUrl.Companion.get(str)) != null) {
            return C51323wx1.f116882f.m6063c(httpUrl, z).m6067d();
        }
        return "";
    }

    public final boolean getGraphQlDetected() {
        return this.graphQlDetected;
    }

    public final String getGraphQlOperationName() {
        return this.graphQlOperationName;
    }

    public final long getHarResponseBodySize() {
        Long l;
        Integer num = this.responseCode;
        if ((num != null && num.intValue() == 304) || (l = this.responsePayloadSize) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final String getHost() {
        return this.host;
    }

    public final long getId() {
        return this.f69202id;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getNotificationText() {
        int i = C17144b.$EnumSwitchMapping$0[getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                Integer num = this.responseCode;
                String str = this.method;
                String str2 = this.path;
                return num + " " + str + " " + str2;
            }
            String str3 = this.method;
            String str4 = this.path;
            return " . . .  " + str3 + " " + str4;
        }
        String str5 = this.method;
        String str6 = this.path;
        return " ! ! !  " + str5 + " " + str6;
    }

    public final List<DN1> getParsedRequestHeaders() {
        return (List) C44653li2.f96593a.m26934a().m21554o(this.requestHeaders, new C17145c().getType());
    }

    public final List<DN1> getParsedResponseHeaders() {
        return (List) C44653li2.f96593a.m26934a().m21554o(this.responseHeaders, new C17146d().getType());
    }

    public final String getPath() {
        return this.path;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public final String getRequestContentType() {
        return this.requestContentType;
    }

    public final Long getRequestDate() {
        return this.requestDate;
    }

    public final String getRequestDateString() {
        Long l = this.requestDate;
        if (l != null) {
            return new Date(l.longValue()).toString();
        }
        return null;
    }

    public final String getRequestHeaders() {
        return this.requestHeaders;
    }

    public final Long getRequestHeadersSize() {
        return this.requestHeadersSize;
    }

    public final String getRequestHeadersString(boolean z) {
        return C50730vx1.f114933a.m7721b(getParsedRequestHeaders(), z);
    }

    public final Long getRequestPayloadSize() {
        return this.requestPayloadSize;
    }

    public final String getRequestSizeString() {
        Long l = this.requestPayloadSize;
        return formatBytes(l != null ? l.longValue() : 0L);
    }

    public final long getRequestTotalSize() {
        Long l = this.requestHeadersSize;
        long longValue = l != null ? l.longValue() : 0L;
        Long l2 = this.requestPayloadSize;
        return longValue + (l2 != null ? l2.longValue() : 0L);
    }

    public final String getResponseBody() {
        return this.responseBody;
    }

    public final String getResponseCipherSuite() {
        return this.responseCipherSuite;
    }

    public final Integer getResponseCode() {
        return this.responseCode;
    }

    public final String getResponseContentType() {
        return this.responseContentType;
    }

    public final Long getResponseDate() {
        return this.responseDate;
    }

    public final String getResponseDateString() {
        Long l = this.responseDate;
        if (l != null) {
            return new Date(l.longValue()).toString();
        }
        return null;
    }

    public final String getResponseHeaders() {
        return this.responseHeaders;
    }

    public final Long getResponseHeadersSize() {
        return this.responseHeadersSize;
    }

    public final String getResponseHeadersString(boolean z) {
        return C50730vx1.f114933a.m7721b(getParsedResponseHeaders(), z);
    }

    public final Bitmap getResponseImageBitmap() {
        byte[] bArr = this.responseImageData;
        if (bArr != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public final byte[] getResponseImageData() {
        return this.responseImageData;
    }

    public final String getResponseMessage() {
        return this.responseMessage;
    }

    public final Long getResponsePayloadSize() {
        return this.responsePayloadSize;
    }

    public final String getResponseSizeString() {
        Long l = this.responsePayloadSize;
        if (l != null) {
            return formatBytes(l.longValue());
        }
        return null;
    }

    public final String getResponseSummaryText() {
        int i = C17144b.$EnumSwitchMapping$0[getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                Integer num = this.responseCode;
                String str = this.responseMessage;
                return num + " " + str;
            }
            return null;
        }
        return this.error;
    }

    public final String getResponseTlsVersion() {
        return this.responseTlsVersion;
    }

    public final long getResponseTotalSize() {
        Long l = this.responseHeadersSize;
        return (l != null ? l.longValue() : 0L) + getHarResponseBodySize();
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final CharSequence getSpannedRequestBody(Context context) {
        CharSequence spanBody;
        String str = this.requestBody;
        if (str == null || (spanBody = spanBody(str, this.requestContentType, context)) == null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf("");
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(\"\")");
            return valueOf;
        }
        return spanBody;
    }

    public final CharSequence getSpannedResponseBody(Context context) {
        CharSequence spanBody;
        String str = this.responseBody;
        if (str == null || (spanBody = spanBody(str, this.responseContentType, context)) == null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf("");
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(\"\")");
            return valueOf;
        }
        return spanBody;
    }

    public final EnumC17143a getStatus() {
        if (this.error != null) {
            return EnumC17143a.Failed;
        }
        if (this.responseCode == null) {
            return EnumC17143a.Requested;
        }
        return EnumC17143a.Complete;
    }

    public final Long getTookMs() {
        return this.tookMs;
    }

    public final String getTotalSizeString() {
        long j;
        Long l = this.requestPayloadSize;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = this.responsePayloadSize;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        return formatBytes(j + j2);
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean hasTheSameContent(HttpTransaction httpTransaction) {
        boolean z;
        if (this == httpTransaction) {
            return true;
        }
        if (httpTransaction == null) {
            return false;
        }
        if (this.f69202id == httpTransaction.f69202id && Intrinsics.areEqual(this.requestDate, httpTransaction.requestDate) && Intrinsics.areEqual(this.responseDate, httpTransaction.responseDate) && Intrinsics.areEqual(this.tookMs, httpTransaction.tookMs) && Intrinsics.areEqual(this.protocol, httpTransaction.protocol) && Intrinsics.areEqual(this.method, httpTransaction.method) && Intrinsics.areEqual(this.url, httpTransaction.url) && Intrinsics.areEqual(this.host, httpTransaction.host) && Intrinsics.areEqual(this.path, httpTransaction.path) && Intrinsics.areEqual(this.scheme, httpTransaction.scheme) && Intrinsics.areEqual(this.responseTlsVersion, httpTransaction.responseTlsVersion) && Intrinsics.areEqual(this.responseCipherSuite, httpTransaction.responseCipherSuite) && Intrinsics.areEqual(this.requestPayloadSize, httpTransaction.requestPayloadSize) && Intrinsics.areEqual(this.requestContentType, httpTransaction.requestContentType) && Intrinsics.areEqual(this.requestHeaders, httpTransaction.requestHeaders) && Intrinsics.areEqual(this.requestHeadersSize, httpTransaction.requestHeadersSize) && Intrinsics.areEqual(this.requestBody, httpTransaction.requestBody) && this.isRequestBodyEncoded == httpTransaction.isRequestBodyEncoded && Intrinsics.areEqual(this.responseCode, httpTransaction.responseCode) && Intrinsics.areEqual(this.responseMessage, httpTransaction.responseMessage) && Intrinsics.areEqual(this.error, httpTransaction.error) && Intrinsics.areEqual(this.responsePayloadSize, httpTransaction.responsePayloadSize) && Intrinsics.areEqual(this.responseContentType, httpTransaction.responseContentType) && Intrinsics.areEqual(this.responseHeaders, httpTransaction.responseHeaders) && Intrinsics.areEqual(this.responseHeadersSize, httpTransaction.responseHeadersSize) && Intrinsics.areEqual(this.responseBody, httpTransaction.responseBody) && this.isResponseBodyEncoded == httpTransaction.isResponseBodyEncoded) {
            byte[] bArr = this.responseImageData;
            if (bArr != null) {
                byte[] bArr2 = httpTransaction.responseImageData;
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    z = true;
                    if (!z && Intrinsics.areEqual(this.graphQlOperationName, httpTransaction.graphQlOperationName) && this.graphQlDetected == httpTransaction.graphQlDetected) {
                        return true;
                    }
                }
            }
            z = false;
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public final boolean isRequestBodyEncoded() {
        return this.isRequestBodyEncoded;
    }

    public final boolean isResponseBodyEncoded() {
        return this.isResponseBodyEncoded;
    }

    public final boolean isSsl() {
        boolean equals;
        equals = StringsKt__StringsJVMKt.equals(this.scheme, "https", true);
        return equals;
    }

    public final HttpTransaction populateUrl(HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "httpUrl");
        C51323wx1 m6063c = C51323wx1.f116882f.m6063c(httpUrl, false);
        this.url = m6063c.m6067d();
        this.host = m6063c.m6070a();
        this.path = m6063c.m6069b();
        this.scheme = m6063c.m6068c();
        return this;
    }

    public final void setError(String str) {
        this.error = str;
    }

    public final void setGraphQlDetected(boolean z) {
        this.graphQlDetected = z;
    }

    public final void setGraphQlOperationName(String str) {
        this.graphQlOperationName = str;
    }

    public final void setHost(String str) {
        this.host = str;
    }

    public final void setId(long j) {
        this.f69202id = j;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setProtocol(String str) {
        this.protocol = str;
    }

    public final void setRequestBody(String str) {
        this.requestBody = str;
    }

    public final void setRequestBodyEncoded(boolean z) {
        this.isRequestBodyEncoded = z;
    }

    public final void setRequestContentType(String str) {
        this.requestContentType = str;
    }

    public final void setRequestDate(Long l) {
        this.requestDate = l;
    }

    public final void setRequestHeaders(String str) {
        this.requestHeaders = str;
    }

    public final void setRequestHeadersSize(Long l) {
        this.requestHeadersSize = l;
    }

    public final void setRequestPayloadSize(Long l) {
        this.requestPayloadSize = l;
    }

    public final void setResponseBody(String str) {
        this.responseBody = str;
    }

    public final void setResponseBodyEncoded(boolean z) {
        this.isResponseBodyEncoded = z;
    }

    public final void setResponseCipherSuite(String str) {
        this.responseCipherSuite = str;
    }

    public final void setResponseCode(Integer num) {
        this.responseCode = num;
    }

    public final void setResponseContentType(String str) {
        this.responseContentType = str;
    }

    public final void setResponseDate(Long l) {
        this.responseDate = l;
    }

    public final void setResponseHeaders(String str) {
        this.responseHeaders = str;
    }

    public final void setResponseHeadersSize(Long l) {
        this.responseHeadersSize = l;
    }

    public final void setResponseImageData(byte[] bArr) {
        this.responseImageData = bArr;
    }

    public final void setResponseMessage(String str) {
        this.responseMessage = str;
    }

    public final void setResponsePayloadSize(Long l) {
        this.responsePayloadSize = l;
    }

    public final void setResponseTlsVersion(String str) {
        this.responseTlsVersion = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setTookMs(Long l) {
        this.tookMs = l;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setGraphQlOperationName(Headers headers) {
        Object obj;
        boolean contains$default;
        Intrinsics.checkNotNullParameter(headers, "headers");
        Iterator<T> it = toHttpHeaderList(headers).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String lowerCase = ((DN1) obj).m110556a().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "operation-name", false, 2, (Object) null);
            if (contains$default) {
                break;
            }
        }
        DN1 dn1 = (DN1) obj;
        this.graphQlOperationName = dn1 != null ? dn1.m110555b() : null;
    }

    public final void setRequestHeaders(Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        setRequestHeaders(toHttpHeaderList(headers));
    }

    public final void setResponseHeaders(Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        setResponseHeaders(toHttpHeaderList(headers));
    }

    public final void setRequestHeaders(List<DN1> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.requestHeaders = C44653li2.f96593a.m26934a().m21545x(headers);
    }

    public final void setResponseHeaders(List<DN1> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.responseHeaders = C44653li2.f96593a.m26934a().m21545x(headers);
    }

    public /* synthetic */ HttpTransaction(long j, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l4, String str9, String str10, Long l5, String str11, boolean z, Integer num, String str12, String str13, Long l6, String str14, String str15, Long l7, String str16, boolean z2, byte[] bArr, boolean z3, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, l, l2, l3, str, str2, str3, str4, str5, str6, str7, str8, l4, str9, str10, l5, str11, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? false : z, num, str12, str13, l6, str14, str15, l7, str16, (i & 67108864) != 0 ? false : z2, bArr, (i & 268435456) != 0 ? false : z3, str17);
    }

    public HttpTransaction() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, 335675393, null);
    }
}
