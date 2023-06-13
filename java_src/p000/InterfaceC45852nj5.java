package p000;

import co.bird.android.model.RepairType;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.PartKind;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\"\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0012\u001a\u00020\u0005H&J\b\u0010\u0013\u001a\u00020\u0005H&¨\u0006\u0014"}, m28432d2 = {"Lnj5;", "", "", "Lco/bird/android/model/constant/BirdModel;", "restrictModels", "", "b", "Lco/bird/android/model/constant/PartKind;", "kind", "Lco/bird/android/model/RepairType;", "repairType", C17296a.f69688o, "", "enablePeripheralScanner", "manualInput", "", "previousScanIdentifier", "c", "onResume", "onPause", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nj5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC45852nj5 {
    /* renamed from: a */
    void mo23254a(PartKind partKind, RepairType repairType);

    /* renamed from: b */
    void mo23253b(List<? extends BirdModel> list);

    /* renamed from: c */
    void mo23252c(boolean z, boolean z2, String str);

    void onPause();

    void onResume();
}
