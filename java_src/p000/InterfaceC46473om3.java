package p000;

import android.location.Location;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdScan;
import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.OperatorRideHistoryItem;
import co.bird.android.model.constant.AlarmCommand;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.constant.FlightSheetContext;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.persistence.BirdRatingHistory;
import co.bird.android.model.persistence.BountyFlightSheetDetails;
import co.bird.android.model.persistence.BountyMapMarker;
import co.bird.android.model.persistence.ComplaintResolution;
import co.bird.android.model.persistence.ComplaintResolutionForm;
import co.bird.android.model.persistence.FlightSheetDetails;
import co.bird.android.model.persistence.HibernationSessionVehicle;
import co.bird.android.model.persistence.NestFlightSheetDetails;
import co.bird.android.model.persistence.OperatorTaskBanner;
import co.bird.android.model.persistence.OperatorTaskGroup;
import co.bird.android.model.persistence.WarehouseFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.wire.WireBatch;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireCaptureValidation;
import co.bird.android.model.wire.WireOperatorActivityLogDetails;
import co.bird.api.response.BulkCaptureResponse;
import co.bird.api.response.OperatorAttributesResponse;
import co.bird.api.response.OperatorBatchActionResponse;
import co.bird.api.response.OperatorBatchStatusResponse;
import co.bird.api.response.OperatorBirdResponse;
import co.bird.api.response.OperatorMapDemandInsightResponse;
import co.bird.api.response.OpsBatchJobActionKind;
import co.bird.api.response.QuickCaptureCancelResponse;
import co.bird.api.response.QuickCaptureResponse;
import co.bird.api.response.QuickCaptureStateResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u008c\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u0004H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0014\u001a\u00020\u0002H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0017\u001a\u00020\u0016H&J6\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00042\u0006\u0010\u0019\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002H&J0\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00050\u00042\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002H&J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00042\u0006\u0010#\u001a\u00020\u0002H&JA\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001a0\u00050\u00042\u0006\u0010&\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b*\u0010+J0\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00050\u00042\u0006\u0010,\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/H&J*\u00105\u001a\b\u0012\u0004\u0012\u000204032\u0006\u0010,\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/H&J$\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0002H&J\u001c\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020\u0006H&J\b\u0010<\u001a\u00020:H&J\u0014\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060>0=H&J,\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00050\u00042\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0002H&J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010D\u001a\u00020\u0002H&J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u0004H&J\b\u0010I\u001a\u00020HH&J\u0010\u0010J\u001a\u00020H2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u0002040\n2\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u001a0L2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&J\u0018\u0010Q\u001a\u00020H2\u0006\u0010N\u001a\u00020\u00022\u0006\u0010P\u001a\u00020OH&J\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\n2\u0006\u0010N\u001a\u00020\u00022\u0006\u0010P\u001a\u00020OH&J\u0016\u0010T\u001a\u00020H2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&J\u0014\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\u001a0\nH&J\b\u0010W\u001a\u00020HH&JJ\u0010c\u001a\u00020H2\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020Z2\b\b\u0002\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^2\u0010\b\u0002\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001aH&J\u001c\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u001a0L2\u0006\u0010_\u001a\u00020^H&J\u000e\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u0004H&J\b\u0010h\u001a\u00020HH&J\u0014\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0\u001a0\nH&J\u0014\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0\u001a0\nH&J\u0016\u0010n\u001a\b\u0012\u0004\u0012\u00020k0\n2\u0006\u0010m\u001a\u00020\u0002H&J\u0010\u0010o\u001a\u00020H2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0\u001a0\n2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020p0\n2\u0006\u0010r\u001a\u00020\u0002H&J\u0010\u0010t\u001a\u00020H2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J0\u0010y\u001a\b\u0012\u0004\u0012\u000204032\u0006\u0010,\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010x\u001a\u00020wH&J\u001c\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u001a0\n2\u0006\u0010x\u001a\u00020wH&J\u0010\u0010{\u001a\u00020H2\u0006\u0010x\u001a\u00020wH&J#\u0010}\u001a\u00020H2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020|\"\u00020\u0002H&¢\u0006\u0004\b}\u0010~JA\u0010\u0080\u0001\u001a\u00020H2\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020Z2\u0006\u0010_\u001a\u00020^2\u0010\b\u0002\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001aH&J\u0019\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010\u00042\u0007\u0010\u0081\u0001\u001a\u00020\u0002H&J\u0016\u0010\u0085\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010\u001a0\nH&J\u0018\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0007\u0010\u0086\u0001\u001a\u00020\u0002H&J\u0018\u0010\u0089\u0001\u001a\u00020H2\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&J\u0018\u0010\u008a\u0001\u001a\u00020H2\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&J\u0012\u0010\u008b\u0001\u001a\u00020H2\u0007\u0010\u0081\u0001\u001a\u00020\u0002H&J\t\u0010\u008c\u0001\u001a\u00020HH&J\u0010\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010\u0004H&J\u001f\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u0001032\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&J\u0013\u0010\u0093\u0001\u001a\u00020H2\b\u0010\u0092\u0001\u001a\u00030\u0090\u0001H&J$\u0010\u0096\u0001\u001a\u00020H2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u0001H&J$\u0010\u0097\u0001\u001a\u00020H2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u0001H&J'\u0010\u0099\u0001\u001a\u00020H2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\r\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&J'\u0010\u009b\u0001\u001a\u00020H2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\r\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&J\u0018\u0010\u009c\u0001\u001a\u00020H2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&J\u0018\u0010\u009d\u0001\u001a\u00020H2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&J \u0010\u009e\u0001\u001a\u00020H2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H&J!\u0010 \u0001\u001a\u00020H2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0007\u0010\u009f\u0001\u001a\u00020\u0002H&J\u0012\u0010¢\u0001\u001a\u00020H2\u0007\u0010¡\u0001\u001a\u00020\u0002H&J\u0019\u0010¤\u0001\u001a\t\u0012\u0005\u0012\u00030£\u00010\n2\u0007\u0010¡\u0001\u001a\u00020\u0002H&J\u0012\u0010¦\u0001\u001a\u00020H2\u0007\u0010¥\u0001\u001a\u00020\u0002H&J\u0019\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010\n2\u0007\u0010¥\u0001\u001a\u00020\u0002H&J1\u0010\u00ad\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010\u00042\u0007\u0010©\u0001\u001a\u00020\u00022\u0007\u0010ª\u0001\u001a\u00020\u00022\r\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&J'\u0010¯\u0001\u001a\t\u0012\u0005\u0012\u00030®\u00010\u00042\u0007\u0010©\u0001\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&J\u0018\u0010±\u0001\u001a\t\u0012\u0005\u0012\u00030°\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010³\u0001\u001a\t\u0012\u0005\u0012\u00030²\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010µ\u0001\u001a\t\u0012\u0005\u0012\u00030´\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010¶\u0001\u001a\u00020H2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010·\u0001\u001a\b\u0012\u0004\u0012\u0002040\u00042\u0006\u0010\r\u001a\u00020\u0006H&¨\u0006¸\u0001"}, m28432d2 = {"Lom3;", "", "", "birdId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/wire/WireBird;", "b", "", "I0", "Lio/reactivex/Observable;", "", "i1", "bird", "Lco/bird/android/model/constant/AlarmCommand;", "command", "Z0", "", "lock", "R0", "taskId", "f1", "LYG;", "event", "W0", "action", "", "birdIds", "operatorTripStopId", "Lco/bird/api/response/OperatorBatchActionResponse;", "p1", "Lco/bird/api/response/OpsBatchJobActionKind;", "role", "Lco/bird/api/response/OperatorBirdResponse;", "c1", "batchId", "Lco/bird/api/response/OperatorBatchStatusResponse;", DateTokenConverter.CONVERTER_KEY, "search", "offset", "limit", "Lco/bird/android/model/wire/WireBatch;", "c", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/F;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "Lco/bird/android/model/BirdScan;", "J0", "Lio/reactivex/p;", "Lco/bird/android/model/persistence/Bird;", "c0", "stickerId", "g1", "b1", "lookupBird", "", "L0", "e1", "LZ84;", "Lco/bird/android/buava/Optional;", "V0", "shiftId", "date", "Lco/bird/android/model/wire/WireOperatorActivityLogDetails;", "Q0", "birdCode", "g", "Lco/bird/api/response/OperatorMapDemandInsightResponse;", "O0", "Lio/reactivex/c;", "k1", "S0", C17296a.f69688o, "Lio/reactivex/k;", "v", "vehicleId", "Lco/bird/android/model/constant/FlightSheetContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "n0", "Lco/bird/android/model/persistence/FlightSheetDetails;", "Y", "s0", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "N", "f", "Landroid/location/Location;", "location", "", "radius", "Lco/bird/android/model/constant/OperatorMapKind;", "kind", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "bypassFilterBirdIds", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "m1", "Lco/bird/android/model/persistence/BirdMapMarker;", "s", "Lco/bird/api/response/OperatorAttributesResponse;", "h1", "M0", "Lco/bird/android/model/persistence/OperatorTaskBanner;", "L", "Lco/bird/android/model/persistence/OperatorTaskGroup;", "q1", "title", "N0", "W", "Lco/bird/android/model/OperatorRideHistoryItem;", "U", "rideId", "V", "R", "Lco/bird/android/model/persistence/BirdRatingHistory;", "D", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "F0", "l1", "r1", "", "t", "([Ljava/lang/String;)Lio/reactivex/c;", "bypassFilterBountyIds", "a1", "bountyId", "Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "X", "Lco/bird/android/model/persistence/BountyMapMarker;", "v0", "surplusId", "Z", "bountyIds", "n1", "X0", "Y0", "A", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "o1", "complaintIds", "Lco/bird/android/model/persistence/ComplaintResolution;", "E", "request", "x", "Lco/bird/android/model/FileUploadReceipt;", "receipt", "U0", "P0", "issues", "e", "vehicleInvolvedIds", "y", "A0", "s1", "o", "notes", "e0", "nestId", "G0", "Lco/bird/android/model/persistence/NestFlightSheetDetails;", "S", "warehouseId", "H0", "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;", "T", "sessionId", "scanIdentifier", "previousBirdIds", "Lco/bird/android/model/wire/WireCaptureValidation;", "d1", "Lco/bird/api/response/BulkCaptureResponse;", "j1", "Lco/bird/api/response/QuickCaptureResponse;", "t1", "Lco/bird/api/response/QuickCaptureCancelResponse;", "T0", "Lco/bird/api/response/QuickCaptureStateResponse;", "h", "K0", "w0", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: om3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC46473om3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: om3$a */
    /* loaded from: classes2.dex */
    public static final class C27057a {
        public static /* synthetic */ AbstractC23442F fetchActivityLogDetails$default(InterfaceC46473om3 interfaceC46473om3, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return interfaceC46473om3.mo8137Q0(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchActivityLogDetails");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC23461c fetchBounty$default(InterfaceC46473om3 interfaceC46473om3, Location location, double d, OperatorMapFilterBundle operatorMapFilterBundle, List list, List list2, int i, Object obj) {
            if (obj == null) {
                List<String> list3 = list;
                if ((i & 8) != 0) {
                    list3 = null;
                }
                return interfaceC46473om3.mo8117a1(location, d, operatorMapFilterBundle, list3, list2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchBounty");
        }

        public static /* synthetic */ AbstractC23461c fetchOperatorBirdNearby$default(InterfaceC46473om3 interfaceC46473om3, Location location, double d, OperatorMapKind operatorMapKind, OperatorMapFilterBundle operatorMapFilterBundle, List list, List list2, int i, Object obj) {
            OperatorMapKind operatorMapKind2;
            List list3;
            if (obj == null) {
                if ((i & 4) != 0) {
                    operatorMapKind2 = OperatorMapKind.BIRD;
                } else {
                    operatorMapKind2 = operatorMapKind;
                }
                if ((i & 16) != 0) {
                    list3 = null;
                } else {
                    list3 = list;
                }
                return interfaceC46473om3.mo8091m1(location, d, operatorMapKind2, operatorMapFilterBundle, list3, list2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchOperatorBirdNearby");
        }

        public static /* synthetic */ AbstractC23442F legacyScanOperatorBird$default(InterfaceC46473om3 interfaceC46473om3, String str, ScanMode scanMode, ScanIntention scanIntention, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    scanIntention = null;
                }
                return interfaceC46473om3.mo8146J0(str, scanMode, scanIntention);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: legacyScanOperatorBird");
        }

        public static /* synthetic */ AbstractC24507p scanOperatorBird$default(InterfaceC46473om3 interfaceC46473om3, String str, ScanMode scanMode, ScanIntention scanIntention, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    scanIntention = null;
                }
                return interfaceC46473om3.mo8113c0(str, scanMode, scanIntention);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scanOperatorBird");
        }

        public static /* synthetic */ AbstractC23442F searchOperatorBatches$default(InterfaceC46473om3 interfaceC46473om3, String str, Integer num, Integer num2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    num = null;
                }
                if ((i & 4) != 0) {
                    num2 = null;
                }
                return interfaceC46473om3.mo8114c(str, num, num2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchOperatorBatches");
        }

        public static /* synthetic */ AbstractC23442F takeActionOnOperatorBatch$default(InterfaceC46473om3 interfaceC46473om3, String str, List list, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                return interfaceC46473om3.mo8084p1(str, list, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeActionOnOperatorBatch");
        }

        public static /* synthetic */ AbstractC23442F takeActionOnOperatorBird$default(InterfaceC46473om3 interfaceC46473om3, OpsBatchJobActionKind opsBatchJobActionKind, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                return interfaceC46473om3.mo8112c1(opsBatchJobActionKind, str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeActionOnOperatorBird");
        }
    }

    /* renamed from: A */
    AbstractC23461c mo8155A();

    /* renamed from: A0 */
    AbstractC23461c mo8154A0(List<String> list);

    /* renamed from: D */
    AbstractC23442F<BirdRatingHistory> mo8152D(String str);

    /* renamed from: E */
    AbstractC24507p<ComplaintResolution> mo8151E(List<String> list);

    /* renamed from: F0 */
    AbstractC24507p<Bird> mo8150F0(String str, ScanMode scanMode, ScanIntention scanIntention, BulkScanPurpose bulkScanPurpose);

    /* renamed from: G0 */
    AbstractC23461c mo8149G0(String str);

    /* renamed from: H0 */
    AbstractC23461c mo8148H0(String str);

    /* renamed from: I0 */
    AbstractC23442F<List<WireBird>> mo8147I0();

    /* renamed from: J0 */
    AbstractC23442F<HM4<BirdScan>> mo8146J0(String str, ScanMode scanMode, ScanIntention scanIntention);

    /* renamed from: K0 */
    AbstractC23461c mo8145K0(String str);

    /* renamed from: L */
    Observable<List<OperatorTaskBanner>> mo8144L();

    /* renamed from: L0 */
    void mo8143L0(WireBird wireBird);

    /* renamed from: M0 */
    AbstractC23461c mo8142M0();

    /* renamed from: N */
    Observable<List<HibernationSessionVehicle>> mo8141N();

    /* renamed from: N0 */
    Observable<OperatorTaskGroup> mo8140N0(String str);

    /* renamed from: O0 */
    AbstractC23442F<OperatorMapDemandInsightResponse> mo8139O0();

    /* renamed from: P0 */
    AbstractC23461c mo8138P0(List<String> list, FileUploadReceipt fileUploadReceipt);

    /* renamed from: Q0 */
    AbstractC23442F<HM4<WireOperatorActivityLogDetails>> mo8137Q0(String str, String str2);

    /* renamed from: R */
    AbstractC23461c mo8136R(String str);

    /* renamed from: R0 */
    Observable<WireBird> mo8135R0(WireBird wireBird, boolean z);

    /* renamed from: S */
    Observable<NestFlightSheetDetails> mo8134S(String str);

    /* renamed from: S0 */
    AbstractC23461c mo8133S0(String str);

    /* renamed from: T */
    Observable<WarehouseFlightSheetDetails> mo8132T(String str);

    /* renamed from: T0 */
    AbstractC23442F<QuickCaptureCancelResponse> mo8131T0(String str);

    /* renamed from: U */
    Observable<List<OperatorRideHistoryItem>> mo8130U(String str);

    /* renamed from: U0 */
    AbstractC23461c mo8129U0(List<String> list, FileUploadReceipt fileUploadReceipt);

    /* renamed from: V */
    Observable<OperatorRideHistoryItem> mo8128V(String str);

    /* renamed from: V0 */
    Z84<Optional<WireBird>> mo8127V0();

    /* renamed from: W */
    AbstractC23461c mo8126W(String str);

    /* renamed from: W0 */
    Observable<WireBird> mo8125W0(C9750YG c9750yg);

    /* renamed from: X */
    AbstractC23442F<BountyFlightSheetDetails> mo8124X(String str);

    /* renamed from: X0 */
    AbstractC23461c mo8123X0(List<String> list);

    /* renamed from: Y */
    Observable<FlightSheetDetails> mo8122Y(String str, FlightSheetContext flightSheetContext);

    /* renamed from: Y0 */
    AbstractC23461c mo8121Y0(String str);

    /* renamed from: Z */
    AbstractC23442F<Boolean> mo8120Z(String str);

    /* renamed from: Z0 */
    Observable<WireBird> mo8119Z0(WireBird wireBird, AlarmCommand alarmCommand);

    /* renamed from: a */
    Observable<Bird> mo8118a(String str);

    /* renamed from: a1 */
    AbstractC23461c mo8117a1(Location location, double d, OperatorMapFilterBundle operatorMapFilterBundle, List<String> list, List<Geolocation> list2);

    /* renamed from: b */
    AbstractC23442F<HM4<WireBird>> mo8116b(String str);

    /* renamed from: b1 */
    AbstractC23442F<HM4<Boolean>> mo8115b1(String str);

    /* renamed from: c */
    AbstractC23442F<HM4<List<WireBatch>>> mo8114c(String str, Integer num, Integer num2);

    /* renamed from: c0 */
    AbstractC24507p<Bird> mo8113c0(String str, ScanMode scanMode, ScanIntention scanIntention);

    /* renamed from: c1 */
    AbstractC23442F<HM4<OperatorBirdResponse>> mo8112c1(OpsBatchJobActionKind opsBatchJobActionKind, String str, String str2);

    /* renamed from: d */
    AbstractC23442F<OperatorBatchStatusResponse> mo8111d(String str);

    /* renamed from: d1 */
    AbstractC23442F<WireCaptureValidation> mo8110d1(String str, String str2, List<String> list);

    /* renamed from: e */
    AbstractC23461c mo8109e(List<String> list, List<String> list2);

    /* renamed from: e0 */
    AbstractC23461c mo8108e0(List<String> list, String str);

    /* renamed from: e1 */
    void mo8107e1();

    /* renamed from: f */
    AbstractC23461c mo8106f();

    /* renamed from: f1 */
    Observable<WireBird> mo8105f1(String str);

    /* renamed from: g */
    AbstractC23442F<WireBird> mo8104g(String str);

    /* renamed from: g1 */
    AbstractC23442F<HM4<WireBird>> mo8103g1(String str, String str2);

    /* renamed from: h */
    AbstractC23442F<QuickCaptureStateResponse> mo8102h(String str);

    /* renamed from: h1 */
    AbstractC23442F<OperatorAttributesResponse> mo8101h1();

    /* renamed from: i1 */
    Observable<Integer> mo8099i1();

    /* renamed from: j1 */
    AbstractC23442F<BulkCaptureResponse> mo8097j1(String str, List<String> list);

    /* renamed from: k1 */
    AbstractC23461c mo8095k1();

    /* renamed from: l1 */
    Observable<List<Bird>> mo8093l1(BulkScanPurpose bulkScanPurpose);

    /* renamed from: m1 */
    AbstractC23461c mo8091m1(Location location, double d, OperatorMapKind operatorMapKind, OperatorMapFilterBundle operatorMapFilterBundle, List<String> list, List<Geolocation> list2);

    /* renamed from: n0 */
    AbstractC23461c mo8089n0(String str, FlightSheetContext flightSheetContext);

    /* renamed from: n1 */
    AbstractC23461c mo8088n1(List<String> list);

    /* renamed from: o */
    AbstractC23461c mo8087o(List<String> list, String str);

    /* renamed from: o1 */
    AbstractC23442F<ComplaintResolutionForm> mo8086o1();

    /* renamed from: p1 */
    AbstractC23442F<HM4<OperatorBatchActionResponse>> mo8084p1(String str, List<String> list, String str2);

    /* renamed from: q1 */
    Observable<List<OperatorTaskGroup>> mo8082q1();

    /* renamed from: r1 */
    AbstractC23461c mo8080r1(BulkScanPurpose bulkScanPurpose);

    /* renamed from: s */
    AbstractC24490k<List<BirdMapMarker>> mo8079s(OperatorMapFilterBundle operatorMapFilterBundle);

    /* renamed from: s0 */
    AbstractC23461c mo8078s0(List<String> list);

    /* renamed from: s1 */
    AbstractC23461c mo8077s1(List<String> list);

    /* renamed from: t */
    AbstractC23461c mo8076t(String... strArr);

    /* renamed from: t1 */
    AbstractC23442F<QuickCaptureResponse> mo8075t1(String str);

    /* renamed from: v */
    AbstractC24490k<List<Bird>> mo8073v(List<String> list);

    /* renamed from: v0 */
    Observable<List<BountyMapMarker>> mo8072v0();

    /* renamed from: w0 */
    AbstractC23442F<Bird> mo8070w0(WireBird wireBird);

    /* renamed from: x */
    AbstractC23461c mo8069x(ComplaintResolution complaintResolution);

    /* renamed from: y */
    AbstractC23461c mo8068y(List<String> list, List<String> list2);
}
