package co.bird.android.lib.jackson.enums;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/lib/jackson/enums/DuplicateJsonProperty;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "name", "", "(Ljava/lang/String;)V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes3.dex */
public final class DuplicateJsonProperty extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuplicateJsonProperty(String name) {
        super("@JsonProperty must be unique for all enums. Found \"" + name + "\" multiple times.");
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
