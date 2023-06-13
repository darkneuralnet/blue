package co.bird.android.model.persistence;

import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.constant.OperatorMapKind;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorFilter;", "", "id", "", "getId", "()Ljava/lang/String;", "kind", "Lco/bird/android/model/constant/OperatorMapKind;", "getKind", "()Lco/bird/android/model/constant/OperatorMapKind;", "ordinal", "", "getOrdinal", "()I", "type", "Lco/bird/android/model/constant/OperatorFilterType;", "getType", "()Lco/bird/android/model/constant/OperatorFilterType;", "Lco/bird/android/model/persistence/OperatorOptionFilter;", "Lco/bird/android/model/persistence/OperatorToggleFilter;", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public interface OperatorFilter {
    String getId();

    OperatorMapKind getKind();

    int getOrdinal();

    OperatorFilterType getType();
}
