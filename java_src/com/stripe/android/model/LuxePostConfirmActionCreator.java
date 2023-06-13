package com.stripe.android.model;

import android.net.Uri;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.LuxePostConfirmActionRepository;
import com.stripe.android.model.StripeIntent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Regex;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0003\n\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH ¢\u0006\u0002\b\u0007\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/model/LuxePostConfirmActionCreator;", "", "()V", "create", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;", "stripeIntentJsonString", "", "create$payments_core_release", "stripeIntentJson", "Lorg/json/JSONObject;", "Companion", "NoActionCreator", "RedirectActionCreator", "Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;", "Lcom/stripe/android/model/LuxePostConfirmActionCreator$RedirectActionCreator;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class LuxePostConfirmActionCreator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/LuxePostConfirmActionCreator$Companion;", "", "()V", "getPath", "", "path", "json", "Lorg/json/JSONObject;", "getPath$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getPath$payments_core_release(String str, JSONObject json) {
            Sequence map;
            Sequence distinct;
            Sequence filterNot;
            List list;
            JSONObject optJSONObject;
            Intrinsics.checkNotNullParameter(json, "json");
            if (str == null) {
                return null;
            }
            map = SequencesKt___SequencesKt.map(Regex.findAll$default(new Regex("[*([A-Za-z_0-9]+)]*"), str, 0, 2, null), LuxePostConfirmActionCreator$Companion$getPath$pathArray$1.INSTANCE);
            distinct = SequencesKt___SequencesKt.distinct(map);
            filterNot = SequencesKt___SequencesKt.filterNot(distinct, LuxePostConfirmActionCreator$Companion$getPath$pathArray$2.INSTANCE);
            list = SequencesKt___SequencesKt.toList(filterNot);
            for (int i = 0; i < list.size() && !(json.opt((String) list.get(i)) instanceof String); i++) {
                String str2 = (String) list.get(i);
                if (json.has(str2) && (optJSONObject = json.optJSONObject(str2)) != null) {
                    json = optJSONObject;
                }
            }
            Object opt = json.opt((String) list.get(list.size() - 1));
            if (!(opt instanceof String)) {
                return null;
            }
            return (String) opt;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;", "Lcom/stripe/android/model/LuxePostConfirmActionCreator;", "()V", "create", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$NoAction;", "stripeIntentJson", "Lorg/json/JSONObject;", "create$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class NoActionCreator extends LuxePostConfirmActionCreator {
        public static final int $stable = 0;
        public static final NoActionCreator INSTANCE = new NoActionCreator();

        private NoActionCreator() {
            super(null);
        }

        @Override // com.stripe.android.model.LuxePostConfirmActionCreator
        public LuxePostConfirmActionRepository.Result.NoAction create$payments_core_release(JSONObject stripeIntentJson) {
            Intrinsics.checkNotNullParameter(stripeIntentJson, "stripeIntentJson");
            return LuxePostConfirmActionRepository.Result.NoAction.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0010¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/LuxePostConfirmActionCreator$RedirectActionCreator;", "Lcom/stripe/android/model/LuxePostConfirmActionCreator;", "redirectPagePath", "", "returnToUrlPath", "(Ljava/lang/String;Ljava/lang/String;)V", "getRedirectPagePath", "()Ljava/lang/String;", "getReturnToUrlPath", "component1", "component2", "copy", "create", "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;", "stripeIntentJson", "Lorg/json/JSONObject;", "create$payments_core_release", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class RedirectActionCreator extends LuxePostConfirmActionCreator {
        public static final int $stable = 0;
        private final String redirectPagePath;
        private final String returnToUrlPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedirectActionCreator(String redirectPagePath, String returnToUrlPath) {
            super(null);
            Intrinsics.checkNotNullParameter(redirectPagePath, "redirectPagePath");
            Intrinsics.checkNotNullParameter(returnToUrlPath, "returnToUrlPath");
            this.redirectPagePath = redirectPagePath;
            this.returnToUrlPath = returnToUrlPath;
        }

        public static /* synthetic */ RedirectActionCreator copy$default(RedirectActionCreator redirectActionCreator, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redirectActionCreator.redirectPagePath;
            }
            if ((i & 2) != 0) {
                str2 = redirectActionCreator.returnToUrlPath;
            }
            return redirectActionCreator.copy(str, str2);
        }

        public final String component1() {
            return this.redirectPagePath;
        }

        public final String component2() {
            return this.returnToUrlPath;
        }

        public final RedirectActionCreator copy(String redirectPagePath, String returnToUrlPath) {
            Intrinsics.checkNotNullParameter(redirectPagePath, "redirectPagePath");
            Intrinsics.checkNotNullParameter(returnToUrlPath, "returnToUrlPath");
            return new RedirectActionCreator(redirectPagePath, returnToUrlPath);
        }

        @Override // com.stripe.android.model.LuxePostConfirmActionCreator
        public LuxePostConfirmActionRepository.Result create$payments_core_release(JSONObject stripeIntentJson) {
            Intrinsics.checkNotNullParameter(stripeIntentJson, "stripeIntentJson");
            Companion companion = LuxePostConfirmActionCreator.Companion;
            String path$payments_core_release = companion.getPath$payments_core_release(this.returnToUrlPath, stripeIntentJson);
            String path$payments_core_release2 = companion.getPath$payments_core_release(this.redirectPagePath, stripeIntentJson);
            if (path$payments_core_release != null && path$payments_core_release2 != null) {
                Uri parse = Uri.parse(path$payments_core_release2);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(url)");
                return new LuxePostConfirmActionRepository.Result.Action(new StripeIntent.NextActionData.RedirectToUrl(parse, path$payments_core_release));
            }
            return LuxePostConfirmActionRepository.Result.NotSupported.INSTANCE;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RedirectActionCreator) {
                RedirectActionCreator redirectActionCreator = (RedirectActionCreator) obj;
                return Intrinsics.areEqual(this.redirectPagePath, redirectActionCreator.redirectPagePath) && Intrinsics.areEqual(this.returnToUrlPath, redirectActionCreator.returnToUrlPath);
            }
            return false;
        }

        public final String getRedirectPagePath() {
            return this.redirectPagePath;
        }

        public final String getReturnToUrlPath() {
            return this.returnToUrlPath;
        }

        public int hashCode() {
            return (this.redirectPagePath.hashCode() * 31) + this.returnToUrlPath.hashCode();
        }

        public String toString() {
            String str = this.redirectPagePath;
            String str2 = this.returnToUrlPath;
            return "RedirectActionCreator(redirectPagePath=" + str + ", returnToUrlPath=" + str2 + ")";
        }
    }

    public /* synthetic */ LuxePostConfirmActionCreator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final LuxePostConfirmActionRepository.Result create$payments_core_release(String stripeIntentJsonString) {
        Intrinsics.checkNotNullParameter(stripeIntentJsonString, "stripeIntentJsonString");
        return create$payments_core_release(new JSONObject(stripeIntentJsonString));
    }

    public abstract LuxePostConfirmActionRepository.Result create$payments_core_release(JSONObject jSONObject);

    private LuxePostConfirmActionCreator() {
    }
}
