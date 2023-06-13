package p000;

import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.constant.ComplaintResolutionField;
import co.bird.android.model.persistence.nestedstructures.ComplaintIssueOption;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u00120\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00120\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0006R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0006R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0006R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0006R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0#0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0006¨\u0006&"}, m28432d2 = {"LXr0;", "Lrx4;", "Les0;", "Lio/reactivex/Observable;", "Lga2;", "u8", "()Lio/reactivex/Observable;", "categorySelected", "", "h9", "submitClicks", "m9", "doneClicks", "Lco/bird/android/model/constant/ComplaintResolutionField;", "Y8", "addPhotoClicks", "z6", "removePhotoClicks", "Lkotlin/Pair;", "Lco/bird/android/model/FileUploadReceipt;", "x3", "photoAdded", "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", "", "y0", "selectedIssues", "", "v4", "actionTakenSelected", "X2", "notesUpdated", "b9", "vehicleScanClicks", "j4", "vehicleRemoveClicks", "", "Z7", "vehiclesInvolvedScans", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xr0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC37148Xr0 extends InterfaceC48362rx4<InterfaceC40600es0> {
    /* renamed from: X2 */
    Observable<String> mo58447X2();

    /* renamed from: Y8 */
    Observable<ComplaintResolutionField> mo58445Y8();

    /* renamed from: Z7 */
    Observable<List<String>> mo58444Z7();

    /* renamed from: b9 */
    Observable<Unit> mo58443b9();

    /* renamed from: h9 */
    Observable<Unit> mo58442h9();

    /* renamed from: j4 */
    Observable<String> mo58441j4();

    /* renamed from: m9 */
    Observable<Unit> mo58440m9();

    /* renamed from: u8 */
    Observable<EnumC41608ga2> mo58439u8();

    /* renamed from: v4 */
    Observable<String> mo58438v4();

    /* renamed from: x3 */
    Observable<Pair<ComplaintResolutionField, FileUploadReceipt>> mo58437x3();

    /* renamed from: y0 */
    Observable<Pair<ComplaintIssueOption, Boolean>> mo58436y0();

    /* renamed from: z6 */
    Observable<ComplaintResolutionField> mo58435z6();
}
