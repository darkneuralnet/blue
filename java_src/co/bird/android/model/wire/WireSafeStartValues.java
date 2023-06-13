package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/WireSafeStartValues;", "", "title", "", "body", "word", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getTitle", "getWord", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireSafeStartValues {
    @JsonProperty("body")
    @InterfaceC41208ft5("body")
    private final String body;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("word")
    @InterfaceC41208ft5("word")
    private final String word;

    public WireSafeStartValues() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireSafeStartValues copy$default(WireSafeStartValues wireSafeStartValues, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireSafeStartValues.title;
        }
        if ((i & 2) != 0) {
            str2 = wireSafeStartValues.body;
        }
        if ((i & 4) != 0) {
            str3 = wireSafeStartValues.word;
        }
        return wireSafeStartValues.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final String component3() {
        return this.word;
    }

    public final WireSafeStartValues copy(String title, String body, String word) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(word, "word");
        return new WireSafeStartValues(title, body, word);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireSafeStartValues) {
            WireSafeStartValues wireSafeStartValues = (WireSafeStartValues) obj;
            return Intrinsics.areEqual(this.title, wireSafeStartValues.title) && Intrinsics.areEqual(this.body, wireSafeStartValues.body) && Intrinsics.areEqual(this.word, wireSafeStartValues.word);
        }
        return false;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.word.hashCode();
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        String str3 = this.word;
        return "WireSafeStartValues(title=" + str + ", body=" + str2 + ", word=" + str3 + ")";
    }

    public WireSafeStartValues(String title, String body, String word) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(word, "word");
        this.title = title;
        this.body = body;
        this.word = word;
    }

    public /* synthetic */ WireSafeStartValues(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
