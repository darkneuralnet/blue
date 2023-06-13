package com.chuckerteam.chucker.internal.support;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.LongSparseArray;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.p029ui.BaseChuckerActivity;
import com.facebook.share.internal.C17296a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C38054ac3;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\fH\u0002R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R#\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/support/a;", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "k", "g", DateTokenConverter.CONVERTER_KEY, "", "e", "Lac3$a;", "f", "", "j", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", "h", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/NotificationManager;", "b", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "c", "Lkotlin/Lazy;", "i", "()Landroid/app/PendingIntent;", "transactionsScreenIntent", "<init>", "(Landroid/content/Context;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationHelper.kt\ncom/chuckerteam/chucker/internal/support/NotificationHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1855#2,2:149\n*S KotlinDebug\n*F\n+ 1 NotificationHelper.kt\ncom/chuckerteam/chucker/internal/support/NotificationHelper\n*L\n100#1:149,2\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.support.a */
/* loaded from: classes5.dex */
public final class C17156a {

    /* renamed from: d */
    public static final C17157a f69245d = new C17157a(null);

    /* renamed from: e */
    public static final LongSparseArray<HttpTransaction> f69246e = new LongSparseArray<>();

    /* renamed from: f */
    public static final HashSet<Long> f69247f = new HashSet<>();

    /* renamed from: a */
    public final Context f69248a;

    /* renamed from: b */
    public final NotificationManager f69249b;

    /* renamed from: c */
    public final Lazy f69250c;

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/support/a$a;", "", "", C17296a.f69688o, "", "BUFFER_SIZE", "I", "INTENT_REQUEST_CODE", "", "TRANSACTIONS_CHANNEL_ID", "Ljava/lang/String;", "TRANSACTION_NOTIFICATION_ID", "Landroid/util/LongSparseArray;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactionBuffer", "Landroid/util/LongSparseArray;", "Ljava/util/HashSet;", "", "transactionIdsSet", "Ljava/util/HashSet;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.support.a$a */
    /* loaded from: classes5.dex */
    public static final class C17157a {
        public /* synthetic */ C17157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m52962a() {
            synchronized (C17156a.f69246e) {
                C17156a.f69246e.clear();
                C17156a.f69247f.clear();
                Unit unit = Unit.INSTANCE;
            }
        }

        private C17157a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "b", "()Landroid/app/PendingIntent;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.support.a$b */
    /* loaded from: classes5.dex */
    public static final class C17158b extends Lambda implements Function0<PendingIntent> {
        public C17158b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final PendingIntent invoke() {
            return PendingIntent.getActivity(C17156a.this.m52966h(), 1138, C43475jj0.m30041b(C17156a.this.m52966h()), C17156a.this.m52964j() | 134217728);
        }
    }

    public C17156a(Context context) {
        Lazy lazy;
        List listOf;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f69248a = context;
        Object systemService = context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        this.f69249b = notificationManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C17158b());
        this.f69250c = lazy;
        if (Build.VERSION.SDK_INT >= 26) {
            C42795ia3.m33793a();
            listOf = CollectionsKt__CollectionsJVMKt.listOf(C42202ha3.m36179a("chucker_transactions", context.getString(C38145al4.chucker_network_notification_category), 2));
            notificationManager.createNotificationChannels(listOf);
        }
    }

    /* renamed from: d */
    public final void m52970d(HttpTransaction httpTransaction) {
        if (httpTransaction.getId() == 0) {
            return;
        }
        LongSparseArray<HttpTransaction> longSparseArray = f69246e;
        synchronized (longSparseArray) {
            f69247f.add(Long.valueOf(httpTransaction.getId()));
            longSparseArray.put(httpTransaction.getId(), httpTransaction);
            if (longSparseArray.size() > 10) {
                longSparseArray.removeAt(0);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: e */
    public final boolean m52969e() {
        return this.f69249b.areNotificationsEnabled();
    }

    /* renamed from: f */
    public final C38054ac3.C10762a m52968f() {
        String string = this.f69248a.getString(C38145al4.chucker_clear);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.chucker_clear)");
        return new C38054ac3.C10762a(C49971ug4.chucker_ic_delete_white, string, PendingIntent.getBroadcast(this.f69248a, 11, new Intent(this.f69248a, ClearDatabaseJobIntentServiceReceiver.class), 1073741824 | m52964j()));
    }

    /* renamed from: g */
    public final void m52967g() {
        this.f69249b.cancel(1138);
    }

    /* renamed from: h */
    public final Context m52966h() {
        return this.f69248a;
    }

    /* renamed from: i */
    public final PendingIntent m52965i() {
        return (PendingIntent) this.f69250c.getValue();
    }

    /* renamed from: j */
    public final int m52964j() {
        return 67108864;
    }

    /* renamed from: k */
    public final void m52963k(HttpTransaction transaction) {
        IntProgression downTo;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        m52970d(transaction);
        if (!BaseChuckerActivity.f69252b.m52957a() && m52969e()) {
            C38054ac3.C10770e m71058b = new C38054ac3.C10770e(this.f69248a, "chucker_transactions").m71049k(m52965i()).m71039u(true).m71067B(C49971ug4.chucker_ic_transaction_notification).m71050j(NA0.m94301c(this.f69248a, C33066Gf4.chucker_color_primary)).m71047m(this.f69248a.getString(C38145al4.chucker_http_notification_title)).m71053g(true).m71058b(m52968f());
            Intrinsics.checkNotNullExpressionValue(m71058b, "Builder(context, TRANSAC…tion(createClearAction())");
            C38054ac3.C10772g c10772g = new C38054ac3.C10772g();
            LongSparseArray<HttpTransaction> longSparseArray = f69246e;
            synchronized (longSparseArray) {
                int i = 0;
                downTo = RangesKt___RangesKt.downTo(longSparseArray.size() - 1, 0);
                Iterator<Integer> it = downTo.iterator();
                while (it.hasNext()) {
                    HttpTransaction valueAt = f69246e.valueAt(((IntIterator) it).nextInt());
                    if (valueAt != null && i < 10) {
                        if (i == 0) {
                            m71058b.m71048l(valueAt.getNotificationText());
                        }
                        c10772g.m71033h(valueAt.getNotificationText());
                    }
                    i++;
                }
                m71058b.m71065D(c10772g);
                m71058b.m71064E(String.valueOf(f69247f.size()));
            }
            this.f69249b.notify(1138, m71058b.m71057c());
        }
    }
}
