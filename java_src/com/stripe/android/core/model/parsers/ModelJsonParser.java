package com.stripe.android.core.model.parsers;

import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \b*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0001\bJ\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "ModelType", "Lcom/stripe/android/core/model/StripeModel;", "", "parse", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface ModelJsonParser<ModelType extends StripeModel> {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/core/model/parsers/ModelJsonParser$Companion;", "", "()V", "jsonArrayToList", "", "", "jsonArray", "Lorg/json/JSONArray;", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nModelJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelJsonParser.kt\ncom/stripe/android/core/model/parsers/ModelJsonParser$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n1549#2:22\n1620#2,3:23\n*S KotlinDebug\n*F\n+ 1 ModelJsonParser.kt\ncom/stripe/android/core/model/parsers/ModelJsonParser$Companion\n*L\n16#1:22\n16#1:23,3\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final List<String> jsonArrayToList(JSONArray jSONArray) {
            List<String> emptyList;
            IntRange until;
            int collectionSizeOrDefault;
            if (jSONArray != null) {
                until = RangesKt___RangesKt.until(0, jSONArray.length());
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    arrayList.add(jSONArray.getString(((IntIterator) it).nextInt()));
                }
                return arrayList;
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
    }

    ModelType parse(JSONObject jSONObject);
}
