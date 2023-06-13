package com.stripe.android.model.parsers;

import com.stripe.android.cards.Bin;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/CardMetadataJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/CardMetadata;", "bin", "Lcom/stripe/android/cards/Bin;", "(Lcom/stripe/android/cards/Bin;)V", "accountRangeJsonParser", "Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardMetadataJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardMetadataJsonParser.kt\ncom/stripe/android/model/parsers/CardMetadataJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1603#2,9:24\n1855#2:33\n1856#2:35\n1612#2:36\n1#3:34\n*S KotlinDebug\n*F\n+ 1 CardMetadataJsonParser.kt\ncom/stripe/android/model/parsers/CardMetadataJsonParser\n*L\n17#1:24,9\n17#1:33\n17#1:35\n17#1:36\n17#1:34\n*E\n"})
/* loaded from: classes7.dex */
public final class CardMetadataJsonParser implements ModelJsonParser<CardMetadata> {
    private final AccountRangeJsonParser accountRangeJsonParser;
    private final Bin bin;

    public CardMetadataJsonParser(Bin bin) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        this.bin = bin;
        this.accountRangeJsonParser = new AccountRangeJsonParser();
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public CardMetadata parse(JSONObject json) {
        IntRange until;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray optJSONArray = json.optJSONArray(MessageExtension.FIELD_DATA);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        until = RangesKt___RangesKt.until(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            AccountRangeJsonParser accountRangeJsonParser = this.accountRangeJsonParser;
            JSONObject jSONObject = optJSONArray.getJSONObject(nextInt);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "data.getJSONObject(it)");
            AccountRange parse = accountRangeJsonParser.parse(jSONObject);
            if (parse != null) {
                arrayList.add(parse);
            }
        }
        return new CardMetadata(this.bin, arrayList);
    }
}
