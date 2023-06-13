package com.stripe.android.cards;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeStore;", "Lcom/stripe/android/cards/CardAccountRangeStore;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "accountRangeJsonParser", "Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "contains", "", "bin", "Lcom/stripe/android/cards/Bin;", "(Lcom/stripe/android/cards/Bin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPrefKey", "", "createPrefKey$payments_core_release", "get", "", "Lcom/stripe/android/model/AccountRange;", "save", "", "accountRanges", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nDefaultCardAccountRangeStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCardAccountRangeStore.kt\ncom/stripe/android/cards/DefaultCardAccountRangeStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1603#2,9:52\n1855#2:61\n1856#2:63\n1612#2:64\n1549#2:65\n1620#2,3:66\n1#3:62\n*S KotlinDebug\n*F\n+ 1 DefaultCardAccountRangeStore.kt\ncom/stripe/android/cards/DefaultCardAccountRangeStore\n*L\n21#1:52,9\n21#1:61\n21#1:63\n21#1:64\n30#1:65\n30#1:66,3\n21#1:62\n*E\n"})
/* loaded from: classes6.dex */
public final class DefaultCardAccountRangeStore implements CardAccountRangeStore {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String PREF_FILE = "InMemoryCardAccountRangeSource.Store";
    @Deprecated
    private static final String PREF_KEY_ACCOUNT_RANGES = "key_account_ranges";
    private final AccountRangeJsonParser accountRangeJsonParser;
    private final Context context;
    private final Lazy prefs$delegate;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeStore$Companion;", "", "()V", "PREF_FILE", "", "PREF_KEY_ACCOUNT_RANGES", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultCardAccountRangeStore(Context context) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.accountRangeJsonParser = new AccountRangeJsonParser();
        lazy = LazyKt__LazyJVMKt.lazy(new DefaultCardAccountRangeStore$prefs$2(this));
        this.prefs$delegate = lazy;
    }

    private final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs$delegate.getValue();
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public Object contains(Bin bin, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(getPrefs().contains(createPrefKey$payments_core_release(bin)));
    }

    public final String createPrefKey$payments_core_release(Bin bin) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        return "key_account_ranges:" + bin;
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public Object get(Bin bin, Continuation<? super List<AccountRange>> continuation) {
        Set<String> stringSet = getPrefs().getStringSet(createPrefKey$payments_core_release(bin), null);
        if (stringSet == null) {
            stringSet = SetsKt__SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : stringSet) {
            AccountRange parse = this.accountRangeJsonParser.parse(new JSONObject(str));
            if (parse != null) {
                arrayList.add(parse);
            }
        }
        return arrayList;
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public void save(Bin bin, List<AccountRange> accountRanges) {
        int collectionSizeOrDefault;
        Set<String> set;
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
        List<AccountRange> list = accountRanges;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (AccountRange accountRange : list) {
            arrayList.add(this.accountRangeJsonParser.serialize(accountRange).toString());
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        getPrefs().edit().putStringSet(createPrefKey$payments_core_release(bin), set).apply();
    }
}
