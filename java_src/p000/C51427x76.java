package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\u000f"}, m28432d2 = {"Lx76;", "LFy5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LAN5;", C17296a.f69688o, "", "LK66;", "Ljava/util/List;", "transactions", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "", "encodeUrls", "<init>", "(Ljava/util/List;Z)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionListDetailsSharable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionListDetailsSharable.kt\ncom/chuckerteam/chucker/internal/support/TransactionListDetailsSharable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1549#2:24\n1620#2,3:25\n*S KotlinDebug\n*F\n+ 1 TransactionListDetailsSharable.kt\ncom/chuckerteam/chucker/internal/support/TransactionListDetailsSharable\n*L\n13#1:24\n13#1:25,3\n*E\n"})
/* renamed from: x76  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51427x76 implements InterfaceC33004Fy5 {

    /* renamed from: a */
    public final List<K66> f117113a;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LK66;", "it", "", C17296a.f69688o, "(LK66;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: x76$a */
    /* loaded from: classes5.dex */
    public static final class C30041a extends Lambda implements Function1<K66, CharSequence> {

        /* renamed from: g */
        public final /* synthetic */ Context f117114g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30041a(Context context) {
            super(1);
            this.f117114g = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(K66 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C33238Gy5.m104539c(it, this.f117114g);
        }
    }

    public C51427x76(List<HttpTransaction> transactions, boolean z) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        List<HttpTransaction> list = transactions;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (HttpTransaction httpTransaction : list) {
            arrayList.add(new K66(httpTransaction, z));
        }
        this.f117113a = arrayList;
    }

    @Override // p000.InterfaceC33004Fy5
    /* renamed from: a */
    public AN5 mo5832a(Context context) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(context, "context");
        C42488i30 c42488i30 = new C42488i30();
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.f117113a, "\n" + context.getString(C38145al4.chucker_export_separator) + "\n", context.getString(C38145al4.chucker_export_prefix) + "\n", "\n" + context.getString(C38145al4.chucker_export_postfix) + "\n", 0, null, new C30041a(context), 24, null);
        return c42488i30.mo24530a2(joinToString$default);
    }
}
