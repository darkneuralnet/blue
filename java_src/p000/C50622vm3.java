package p000;

import android.content.Context;
import android.location.Location;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdScan;
import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.OperatorRideHistoryItem;
import co.bird.android.model.constant.AlarmCommand;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.constant.FlightSheetContext;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.exception.LocationDisabledException;
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
import co.bird.api.request.AlarmBirdBody;
import co.bird.api.request.BirdAssignStickerHourlyBody;
import co.bird.api.request.BirdIdBody;
import co.bird.api.request.BulkCaptureRequest;
import co.bird.api.request.CaptureValidationRequest;
import co.bird.api.request.LockBirdBody;
import co.bird.api.request.MarkMissingBirdBody;
import co.bird.api.request.OperatorBatchActionRequest;
import co.bird.api.request.OperatorBirdActionRequest;
import co.bird.api.request.OperatorUpdateLocationBody;
import co.bird.api.request.ScanBody;
import co.bird.api.request.StartTaskBody;
import co.bird.api.request.TaskIdBody;
import co.bird.api.response.BirdsResponse;
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
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.C37791a94;
import p000.InterfaceC8601VK;
@Metadata(m28433d1 = {"\u0000¢\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B´\u0001\b\u0007\u0012\u0007\u0010P\u001a\u00030¸\u0001\u0012\b\u0010¼\u0001\u001a\u00030º\u0001\u0012\b\u0010¿\u0001\u001a\u00030½\u0001\u0012\b\u0010Â\u0001\u001a\u00030À\u0001\u0012\b\u0010Å\u0001\u001a\u00030Ã\u0001\u0012\b\u0010È\u0001\u001a\u00030Æ\u0001\u0012\b\u0010Ë\u0001\u001a\u00030É\u0001\u0012\b\u0010Î\u0001\u001a\u00030Ì\u0001\u0012\b\u0010Ò\u0001\u001a\u00030Ï\u0001\u0012\b\u0010Ö\u0001\u001a\u00030Ó\u0001\u0012\b\u0010Ú\u0001\u001a\u00030×\u0001\u0012\b\u0010Þ\u0001\u001a\u00030Û\u0001\u0012\b\u0010â\u0001\u001a\u00030ß\u0001\u0012\b\u0010æ\u0001\u001a\u00030ã\u0001\u0012\b\u0010é\u0001\u001a\u00030ç\u0001\u0012\b\u0010í\u0001\u001a\u00030ê\u0001\u0012\b\u0010ñ\u0001\u001a\u00030î\u0001¢\u0006\u0006\bý\u0001\u0010þ\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0002H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J4\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00070\u00022\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016J.\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00070\u00022\u0006\u0010\u0018\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00022\u0006\u0010\"\u001a\u00020\u0005H\u0016J=\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00190\u00070\u00022\u0006\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\r2\b\u0010'\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b)\u0010*J.\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00070\u00022\u0006\u0010+\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016J(\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010+\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016J$\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0016J\u001c\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u00109\u001a\u000208H\u0016J\b\u0010<\u001a\u00020;H\u0016J(\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00070\u00022\b\u0010=\u001a\u0004\u0018\u00010\u00052\b\u0010>\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020\bH\u0016J\b\u0010D\u001a\u00020BH\u0016J\u0014\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0F0EH\u0016J\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010H\u001a\u00020\u0005H\u0016J\u0010\u0010J\u001a\u00020;2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u0002030\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\"\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00190L2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J\u0018\u0010Q\u001a\u00020;2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010P\u001a\u00020OH\u0016J\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\f2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010P\u001a\u00020OH\u0016J\u0016\u0010T\u001a\u00020;2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J\u0014\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\u00190\fH\u0016J\b\u0010W\u001a\u00020;H\u0016JF\u0010c\u001a\u00020;2\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^2\u000e\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00192\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u0019H\u0016J\u001c\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u00190L2\u0006\u0010_\u001a\u00020^H\u0016J\u000e\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u0002H\u0016J\b\u0010h\u001a\u00020;H\u0016J\u0014\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0\u00190\fH\u0016J\u0014\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0\u00190\fH\u0016J\u0016\u0010n\u001a\b\u0012\u0004\u0012\u00020k0\f2\u0006\u0010m\u001a\u00020\u0005H\u0016J\u0010\u0010o\u001a\u00020;2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0\u00190\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020p0\f2\u0006\u0010r\u001a\u00020\u0005H\u0016J\u0010\u0010t\u001a\u00020;2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010y\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010+\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010x\u001a\u00020wH\u0016J\u001c\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00190\f2\u0006\u0010x\u001a\u00020wH\u0016J\u0010\u0010{\u001a\u00020;2\u0006\u0010x\u001a\u00020wH\u0016J#\u0010}\u001a\u00020;2\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050|\"\u00020\u0005H\u0016¢\u0006\u0004\b}\u0010~J?\u0010\u0080\u0001\u001a\u00020;2\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020Z2\u0006\u0010_\u001a\u00020^2\u000e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00192\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u0019H\u0016J\u0019\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010\u00022\u0007\u0010\u0081\u0001\u001a\u00020\u0005H\u0016J\u0016\u0010\u0085\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010\u00190\fH\u0016J\u0018\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u0007\u0010\u0086\u0001\u001a\u00020\u0005H\u0016J\u0018\u0010\u0089\u0001\u001a\u00020;2\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J\u0018\u0010\u008a\u0001\u001a\u00020;2\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J\u0012\u0010\u008b\u0001\u001a\u00020;2\u0007\u0010\u0081\u0001\u001a\u00020\u0005H\u0016J\u0012\u0010\u008d\u0001\u001a\u00020;2\u0007\u0010\u008c\u0001\u001a\u00020\u0005H\u0016J\u0019\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\f2\u0007\u0010\u008c\u0001\u001a\u00020\u0005H\u0016J\u0012\u0010\u0091\u0001\u001a\u00020;2\u0007\u0010\u0090\u0001\u001a\u00020\u0005H\u0016J\u0019\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010\f2\u0007\u0010\u0090\u0001\u001a\u00020\u0005H\u0016J1\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010\u00022\u0007\u0010\u0094\u0001\u001a\u00020\u00052\u0007\u0010\u0095\u0001\u001a\u00020\u00052\r\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J'\u0010\u009a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010\u00022\u0007\u0010\u0094\u0001\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J\u0018\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010 \u0001\u001a\t\u0012\u0005\u0012\u00030\u009f\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0011\u0010¡\u0001\u001a\u00020;2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010¢\u0001\u001a\u00020;H\u0016J\u0010\u0010¤\u0001\u001a\t\u0012\u0005\u0012\u00030£\u00010\u0002H\u0016J\u001f\u0010§\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u0001022\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J\u0013\u0010©\u0001\u001a\u00020;2\b\u0010¨\u0001\u001a\u00030¦\u0001H\u0016J$\u0010¬\u0001\u001a\u00020;2\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001H\u0016J$\u0010\u00ad\u0001\u001a\u00020;2\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001H\u0016J'\u0010¯\u0001\u001a\u00020;2\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\r\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J'\u0010±\u0001\u001a\u00020;2\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\r\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J\u0018\u0010²\u0001\u001a\u00020;2\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J\u0018\u0010³\u0001\u001a\u00020;2\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J \u0010´\u0001\u001a\u00020;2\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J!\u0010¶\u0001\u001a\u00020;2\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\u0007\u0010µ\u0001\u001a\u00020\u0005H\u0016J\u0017\u0010·\u0001\u001a\b\u0012\u0004\u0012\u0002030\u00022\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0016\u0010P\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bK\u0010¹\u0001R\u0017\u0010¼\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010»\u0001R\u0017\u0010¿\u0001\u001a\u00030½\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010¾\u0001R\u0017\u0010Â\u0001\u001a\u00030À\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010Á\u0001R\u0018\u0010Å\u0001\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010Ä\u0001R\u0017\u0010È\u0001\u001a\u00030Æ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bW\u0010Ç\u0001R\u0017\u0010Ë\u0001\u001a\u00030É\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010Ê\u0001R\u0018\u0010Î\u0001\u001a\u00030Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010Í\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ö\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u0010Þ\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010â\u0001\u001a\u00030ß\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0018\u0010æ\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0018\u0010é\u0001\u001a\u00030ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010è\u0001R\u0018\u0010í\u0001\u001a\u00030ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0018\u0010ñ\u0001\u001a\u00030î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R'\u0010ö\u0001\u001a\u0012\u0012\r\u0012\u000b ó\u0001*\u0004\u0018\u00010\r0\r0ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R#\u0010ù\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0F0÷\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\be\u0010ø\u0001R:\u0010ü\u0001\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b ó\u0001*\n\u0012\u0004\u0012\u00020\b\u0018\u00010F0F0E8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b}\u0010ú\u0001\u001a\u0006\bô\u0001\u0010û\u0001¨\u0006ÿ\u0001"}, m28432d2 = {"Lvm3;", "Lom3;", "Lio/reactivex/F;", "Lco/bird/api/response/OperatorMapDemandInsightResponse;", "O0", "", "birdId", "LHM4;", "Lco/bird/android/model/wire/WireBird;", "b", "", "I0", "Lio/reactivex/Observable;", "", "i1", "bird", "Lco/bird/android/model/constant/AlarmCommand;", "command", "Z0", "", "lock", "R0", "taskId", "f1", "action", "", "birdIds", "operatorTripStopId", "Lco/bird/api/response/OperatorBatchActionResponse;", "p1", "Lco/bird/api/response/OpsBatchJobActionKind;", "role", "Lco/bird/api/response/OperatorBirdResponse;", "c1", "batchId", "Lco/bird/api/response/OperatorBatchStatusResponse;", DateTokenConverter.CONVERTER_KEY, "search", "offset", "limit", "Lco/bird/android/model/wire/WireBatch;", "c", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/F;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "Lco/bird/android/model/BirdScan;", "J0", "Lio/reactivex/p;", "Lco/bird/android/model/persistence/Bird;", "c0", "stickerId", "g1", "b1", "LYG;", "event", "W0", "Lio/reactivex/c;", "k1", "shiftId", "date", "Lco/bird/android/model/wire/WireOperatorActivityLogDetails;", "Q0", "lookupBird", "", "L0", "e1", "LZ84;", "Lco/bird/android/buava/Optional;", "V0", "birdCode", "g", "S0", C17296a.f69688o, "Lio/reactivex/k;", "v", "vehicleId", "Lco/bird/android/model/constant/FlightSheetContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "n0", "Lco/bird/android/model/persistence/FlightSheetDetails;", "Y", "s0", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "N", "f", "Landroid/location/Location;", "location", "", "radius", "Lco/bird/android/model/constant/OperatorMapKind;", "kind", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "bypassFilterBirdIds", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "m1", "Lco/bird/android/model/persistence/BirdMapMarker;", "s", "Lco/bird/api/response/OperatorAttributesResponse;", "h1", "M0", "Lco/bird/android/model/persistence/OperatorTaskBanner;", "L", "Lco/bird/android/model/persistence/OperatorTaskGroup;", "q1", "title", "N0", "W", "Lco/bird/android/model/OperatorRideHistoryItem;", "U", "rideId", "V", "R", "Lco/bird/android/model/persistence/BirdRatingHistory;", "D", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "F0", "l1", "r1", "", "t", "([Ljava/lang/String;)Lio/reactivex/c;", "bypassFilterBountyIds", "a1", "bountyId", "Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "X", "Lco/bird/android/model/persistence/BountyMapMarker;", "v0", "surplusId", "Z", "bountyIds", "n1", "X0", "Y0", "nestId", "G0", "Lco/bird/android/model/persistence/NestFlightSheetDetails;", "S", "warehouseId", "H0", "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;", "T", "sessionId", "scanIdentifier", "previousBirdIds", "Lco/bird/android/model/wire/WireCaptureValidation;", "d1", "Lco/bird/api/response/BulkCaptureResponse;", "j1", "Lco/bird/api/response/QuickCaptureResponse;", "t1", "Lco/bird/api/response/QuickCaptureCancelResponse;", "T0", "Lco/bird/api/response/QuickCaptureStateResponse;", "h", "K0", "A", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "o1", "complaintIds", "Lco/bird/android/model/persistence/ComplaintResolution;", "E", "request", "x", "Lco/bird/android/model/FileUploadReceipt;", "receipt", "U0", "P0", "issues", "e", "vehicleInvolvedIds", "y", "A0", "s1", "o", "notes", "e0", "w0", "Landroid/content/Context;", "Landroid/content/Context;", "LTk3;", "LTk3;", "operatorClient", "LRR;", "LRR;", "birdRepo", "LQs1;", "LQs1;", "flightSheetRepo", "LVL1;", "LVL1;", "hibernationRepo", "LO33;", "LO33;", "nestFlightSheetRepo", "LNy6;", "LNy6;", "warehouseFlightSheetRepo", "LVK;", "LVK;", "birdClient", "Lef0;", "i", "Lef0;", "captureClient", "LjZ5;", "j", "LjZ5;", "taskClient", "Ldr4;", "k", "Ldr4;", "locationManager", "LZu3;", "l", "LZu3;", "operatorTaskGroupRepo", "LKR4;", "m", "LKR4;", "rideHistoryRepo", "LMR;", "n", "LMR;", "birdRatingHistoryRepo", "LT00;", "LT00;", "bountyRepo", "LYr0;", "p", "LYr0;", "complaintResolutionRepo", "Lgl;", "q", "Lgl;", "preference", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "r", "Lio/reactivex/subjects/a;", "tasksSubject", "La94;", "La94;", "lookupBirdRelay", "Lkotlin/Lazy;", "()LZ84;", "lookupBirdObservable", "<init>", "(Landroid/content/Context;LTk3;LRR;LQs1;LVL1;LO33;LNy6;LVK;Lef0;LjZ5;Ldr4;LZu3;LKR4;LMR;LT00;LYr0;Lgl;)V", "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vm3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50622vm3 implements InterfaceC46473om3 {

    /* renamed from: a */
    public final Context f114598a;

    /* renamed from: b */
    public final InterfaceC36152Tk3 f114599b;

    /* renamed from: c */
    public final InterfaceC7168RR f114600c;

    /* renamed from: d */
    public final InterfaceC35520Qs1 f114601d;

    /* renamed from: e */
    public final VL1 f114602e;

    /* renamed from: f */
    public final O33 f114603f;

    /* renamed from: g */
    public final InterfaceC34877Ny6 f114604g;

    /* renamed from: h */
    public final InterfaceC8601VK f114605h;

    /* renamed from: i */
    public final InterfaceC40470ef0 f114606i;

    /* renamed from: j */
    public final InterfaceC43381jZ5 f114607j;

    /* renamed from: k */
    public final InterfaceC40001dr4 f114608k;

    /* renamed from: l */
    public final InterfaceC37646Zu3 f114609l;

    /* renamed from: m */
    public final KR4 f114610m;

    /* renamed from: n */
    public final InterfaceC5292MR f114611n;

    /* renamed from: o */
    public final T00 f114612o;

    /* renamed from: p */
    public final InterfaceC37382Yr0 f114613p;

    /* renamed from: q */
    public final C22454gl f114614q;

    /* renamed from: r */
    public final C24552a<Integer> f114615r;

    /* renamed from: s */
    public final C37791a94<Optional<WireBird>> f114616s;

    /* renamed from: t */
    public final Lazy f114617t;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vm3$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29623a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BirdAction.values().length];
            try {
                iArr[BirdAction.START_CHARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BirdAction.ALARM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BirdAction.MARK_MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BirdAction.CANCEL_TASK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BirdAction.COMPLETE_CHARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BirdAction.REPAIR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BirdAction.START_REPAIR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/location/Location;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Landroid/location/Location;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vm3$b */
    /* loaded from: classes4.dex */
    public static final class C29624b extends Lambda implements Function1<Location, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f114619h;

        /* renamed from: i */
        public final /* synthetic */ AlarmCommand f114620i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29624b(WireBird wireBird, AlarmCommand alarmCommand) {
            super(1);
            this.f114619h = wireBird;
            this.f114620i = alarmCommand;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends WireBird> invoke(Location it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C50622vm3.this.f114605h.m79963t(new AlarmBirdBody(this.f114619h.getId(), this.f114620i, null, 4, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "lookupBird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorManagerImpl.kt\nco/bird/android/manager/contractor/OperatorManagerImpl$fetchOperatorBirdNearby$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,648:1\n37#2,2:649\n26#3:651\n*S KotlinDebug\n*F\n+ 1 OperatorManagerImpl.kt\nco/bird/android/manager/contractor/OperatorManagerImpl$fetchOperatorBirdNearby$1\n*L\n385#1:649,2\n385#1:651\n*E\n"})
    /* renamed from: vm3$c */
    /* loaded from: classes4.dex */
    public static final class C29625c extends Lambda implements Function1<Optional<WireBird>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ Location f114622h;

        /* renamed from: i */
        public final /* synthetic */ double f114623i;

        /* renamed from: j */
        public final /* synthetic */ OperatorMapKind f114624j;

        /* renamed from: k */
        public final /* synthetic */ OperatorMapFilterBundle f114625k;

        /* renamed from: l */
        public final /* synthetic */ List<String> f114626l;

        /* renamed from: m */
        public final /* synthetic */ List<Geolocation> f114627m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29625c(Location location, double d, OperatorMapKind operatorMapKind, OperatorMapFilterBundle operatorMapFilterBundle, List<String> list, List<Geolocation> list2) {
            super(1);
            this.f114622h = location;
            this.f114623i = d;
            this.f114624j = operatorMapKind;
            this.f114625k = operatorMapFilterBundle;
            this.f114626l = list;
            this.f114627m = list2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Optional<WireBird> lookupBird) {
            String[] strArr;
            String str;
            List<String> listOfNotNull;
            Intrinsics.checkNotNullParameter(lookupBird, "lookupBird");
            InterfaceC7168RR interfaceC7168RR = C50622vm3.this.f114600c;
            Location location = this.f114622h;
            double d = this.f114623i;
            OperatorMapKind operatorMapKind = this.f114624j;
            OperatorMapFilterBundle operatorMapFilterBundle = this.f114625k;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            List<String> list = this.f114626l;
            if (list == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            spreadBuilder.addSpread(strArr);
            WireBird m59035e = lookupBird.m59035e();
            if (m59035e != null) {
                str = m59035e.getId();
            } else {
                str = null;
            }
            spreadBuilder.add(str);
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new String[spreadBuilder.size()]));
            return interfaceC7168RR.mo39456B1(location, d, operatorMapKind, operatorMapFilterBundle, listOfNotNull, this.f114627m);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/BirdsResponse;", "response", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/BirdsResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorManagerImpl.kt\nco/bird/android/manager/contractor/OperatorManagerImpl$getTasksForOperator$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,648:1\n1011#2,2:649\n*S KotlinDebug\n*F\n+ 1 OperatorManagerImpl.kt\nco/bird/android/manager/contractor/OperatorManagerImpl$getTasksForOperator$1\n*L\n132#1:649,2\n*E\n"})
    /* renamed from: vm3$d */
    /* loaded from: classes4.dex */
    public static final class C29626d extends Lambda implements Function1<BirdsResponse, List<WireBird>> {

        /* renamed from: g */
        public static final C29626d f114628g = new C29626d();

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 OperatorManagerImpl.kt\nco/bird/android/manager/contractor/OperatorManagerImpl$getTasksForOperator$1\n*L\n1#1,328:1\n132#2:329\n*E\n"})
        /* renamed from: vm3$d$a */
        /* loaded from: classes4.dex */
        public static final class C29627a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(((WireBird) t2).getStartedAt(), ((WireBird) t).getStartedAt());
                return compareValues;
            }
        }

        public C29626d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(BirdsResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            List<WireBird> birds = response.getBirds();
            if (birds.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(birds, new C29627a());
            }
            return response.getBirds();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "tasks", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vm3$e */
    /* loaded from: classes4.dex */
    public static final class C29628e extends Lambda implements Function1<List<WireBird>, Unit> {
        public C29628e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<WireBird> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> list) {
            C50622vm3.this.f114615r.onNext(Integer.valueOf(list.size()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/location/Location;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Landroid/location/Location;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vm3$f */
    /* loaded from: classes4.dex */
    public static final class C29629f extends Lambda implements Function1<Location, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: h */
        public final /* synthetic */ LockBirdBody f114631h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29629f(LockBirdBody lockBirdBody) {
            super(1);
            this.f114631h = lockBirdBody;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends WireBird> invoke(Location it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C50622vm3.this.f114605h.m79974K(this.f114631h).m33123k0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vm3$g */
    /* loaded from: classes4.dex */
    public static final class C29630g extends Lambda implements Function0<Z84<Optional<WireBird>>> {
        public C29630g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<WireBird>> invoke() {
            return Z84.f47888d.m73663b(C50622vm3.this.f114616s);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vm3$h */
    /* loaded from: classes4.dex */
    public static final class C29631h extends Lambda implements Function1<WireBird, WireBird> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f114633g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29631h(WireBird wireBird) {
            super(1);
            this.f114633g = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireBird invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f114633g;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vm3$i */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29632i extends FunctionReferenceImpl implements Function1<TaskIdBody, Observable<WireBird>> {
        public C29632i(Object obj) {
            super(1, obj, InterfaceC43381jZ5.class, "completeTask", "completeTask(Lco/bird/api/request/TaskIdBody;)Lio/reactivex/Observable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<WireBird> invoke(TaskIdBody p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC43381jZ5) this.receiver).m30321c(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vm3$j */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29633j extends FunctionReferenceImpl implements Function1<TaskIdBody, Observable<WireBird>> {
        public C29633j(Object obj) {
            super(1, obj, InterfaceC43381jZ5.class, "completeTask", "completeTask(Lco/bird/api/request/TaskIdBody;)Lio/reactivex/Observable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<WireBird> invoke(TaskIdBody p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC43381jZ5) this.receiver).m30321c(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vm3$k */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29634k extends FunctionReferenceImpl implements Function1<TaskIdBody, Observable<WireBird>> {
        public C29634k(Object obj) {
            super(1, obj, InterfaceC43381jZ5.class, "markTaskRepaired", "markTaskRepaired(Lco/bird/api/request/TaskIdBody;)Lio/reactivex/Observable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<WireBird> invoke(TaskIdBody p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC43381jZ5) this.receiver).m30323a(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002'\u0010\u0007\u001a#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00060\u00022\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lkotlin/Function1;", "Lco/bird/api/request/TaskIdBody;", "Lkotlin/ParameterName;", "name", "Lio/reactivex/Observable;", "f", "", "cancelTask", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;Lkotlin/jvm/functions/Function1;Z)Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vm3$l */
    /* loaded from: classes4.dex */
    public static final class C29635l extends Lambda implements Function3<WireBird, Function1<? super TaskIdBody, ? extends Observable<WireBird>>, Boolean, Observable<WireBird>> {

        /* renamed from: g */
        public static final C29635l f114634g = new C29635l();

        public C29635l() {
            super(3);
        }

        /* renamed from: a */
        public final Observable<WireBird> m8060a(WireBird bird, Function1<? super TaskIdBody, ? extends Observable<WireBird>> f, boolean z) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            Intrinsics.checkNotNullParameter(f, "f");
            String taskId = bird.getTaskId();
            if (taskId == null) {
                Observable<WireBird> error = Observable.error(new IllegalArgumentException("Bird has no task"));
                Intrinsics.checkNotNullExpressionValue(error, "{\n        Observable.err…rd has no task\"))\n      }");
                return error;
            }
            return f.invoke(new TaskIdBody(taskId, Boolean.valueOf(z)));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Observable<WireBird> invoke(WireBird wireBird, Function1<? super TaskIdBody, ? extends Observable<WireBird>> function1, Boolean bool) {
            return m8060a(wireBird, function1, bool.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vm3$m */
    /* loaded from: classes4.dex */
    public static final class C29636m extends Lambda implements Function1<Optional<WireBird>, Optional<WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f114635g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29636m(WireBird wireBird) {
            super(1);
            this.f114635g = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WireBird> invoke(Optional<WireBird> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Optional.f63040c.m59032c(this.f114635g);
        }
    }

    public C50622vm3(Context context, InterfaceC36152Tk3 operatorClient, InterfaceC7168RR birdRepo, InterfaceC35520Qs1 flightSheetRepo, VL1 hibernationRepo, O33 nestFlightSheetRepo, InterfaceC34877Ny6 warehouseFlightSheetRepo, InterfaceC8601VK birdClient, InterfaceC40470ef0 captureClient, InterfaceC43381jZ5 taskClient, InterfaceC40001dr4 locationManager, InterfaceC37646Zu3 operatorTaskGroupRepo, KR4 rideHistoryRepo, InterfaceC5292MR birdRatingHistoryRepo, T00 bountyRepo, InterfaceC37382Yr0 complaintResolutionRepo, C22454gl preference) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(birdRepo, "birdRepo");
        Intrinsics.checkNotNullParameter(flightSheetRepo, "flightSheetRepo");
        Intrinsics.checkNotNullParameter(hibernationRepo, "hibernationRepo");
        Intrinsics.checkNotNullParameter(nestFlightSheetRepo, "nestFlightSheetRepo");
        Intrinsics.checkNotNullParameter(warehouseFlightSheetRepo, "warehouseFlightSheetRepo");
        Intrinsics.checkNotNullParameter(birdClient, "birdClient");
        Intrinsics.checkNotNullParameter(captureClient, "captureClient");
        Intrinsics.checkNotNullParameter(taskClient, "taskClient");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(operatorTaskGroupRepo, "operatorTaskGroupRepo");
        Intrinsics.checkNotNullParameter(rideHistoryRepo, "rideHistoryRepo");
        Intrinsics.checkNotNullParameter(birdRatingHistoryRepo, "birdRatingHistoryRepo");
        Intrinsics.checkNotNullParameter(bountyRepo, "bountyRepo");
        Intrinsics.checkNotNullParameter(complaintResolutionRepo, "complaintResolutionRepo");
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f114598a = context;
        this.f114599b = operatorClient;
        this.f114600c = birdRepo;
        this.f114601d = flightSheetRepo;
        this.f114602e = hibernationRepo;
        this.f114603f = nestFlightSheetRepo;
        this.f114604g = warehouseFlightSheetRepo;
        this.f114605h = birdClient;
        this.f114606i = captureClient;
        this.f114607j = taskClient;
        this.f114608k = locationManager;
        this.f114609l = operatorTaskGroupRepo;
        this.f114610m = rideHistoryRepo;
        this.f114611n = birdRatingHistoryRepo;
        this.f114612o = bountyRepo;
        this.f114613p = complaintResolutionRepo;
        this.f114614q = preference;
        C24552a<Integer> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Int>()");
        this.f114615r = m31922e;
        this.f114616s = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C29630g());
        this.f114617t = lazy;
    }

    /* renamed from: B */
    public static final WireBird m8153B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireBird) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final InterfaceC23434B m8085p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23496h m8083q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final List m8074u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m8071w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23434B m8067z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: A */
    public AbstractC23461c mo8155A() {
        AbstractC23461c m33063X = this.f114613p.mo44962A().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: A0 */
    public AbstractC23461c mo8154A0(List<String> complaintIds) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        AbstractC23461c m33063X = this.f114613p.mo44961A0(complaintIds).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: D */
    public AbstractC23442F<BirdRatingHistory> mo8152D(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<BirdRatingHistory> m33142Y = this.f114611n.mo92316D(birdId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "birdRatingHistoryRepo.ge…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: E */
    public AbstractC24507p<ComplaintResolution> mo8151E(List<String> complaintIds) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        AbstractC24507p<ComplaintResolution> m32056T = this.f114613p.mo44960E(complaintIds).m32056T(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32056T, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m32056T;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: F0 */
    public AbstractC24507p<Bird> mo8150F0(String code, ScanMode mode, ScanIntention scanIntention, BulkScanPurpose purpose) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        AbstractC24507p<Bird> m32056T = this.f114600c.mo39455F0(code, mode, scanIntention, purpose).m32056T(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32056T, "birdRepo.bulkScanOperato…scribeOn(Schedulers.io())");
        return m32056T;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: G0 */
    public AbstractC23461c mo8149G0(String nestId) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        AbstractC23461c m33063X = this.f114603f.mo88997G0(nestId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "nestFlightSheetRepo.fetc…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: H0 */
    public AbstractC23461c mo8148H0(String warehouseId) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        AbstractC23461c m33063X = this.f114604g.mo89210H0(warehouseId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "warehouseFlightSheetRepo…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: I0 */
    public AbstractC23442F<List<WireBird>> mo8147I0() {
        AbstractC23442F<BirdsResponse> m79984A = this.f114605h.m79984A();
        final C29626d c29626d = C29626d.f114628g;
        AbstractC23442F m33142Y = m79984A.m33157I(new InterfaceC23492o() { // from class: pm3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m8074u;
                m8074u = C50622vm3.m8074u(Function1.this, obj);
                return m8074u;
            }
        }).m33142Y(C24542a.m31932c());
        final C29628e c29628e = new C29628e();
        AbstractC23442F<List<WireBird>> m33101w = m33142Y.m33101w(new InterfaceC23484g() { // from class: qm3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50622vm3.m8071w(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun getTasksFor….onNext(tasks.size) }\n  }");
        return m33101w;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: J0 */
    public AbstractC23442F<HM4<BirdScan>> mo8146J0(String code, ScanMode mode, ScanIntention scanIntention) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return this.f114599b.m83026q(new ScanBody(code, mode, scanIntention, null, null, 24, null));
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: K0 */
    public AbstractC23461c mo8145K0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33063X = this.f114599b.m83021v(new BirdIdBody(birdId)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "operatorClient.markForIn…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: L */
    public Observable<List<OperatorTaskBanner>> mo8144L() {
        Observable<List<OperatorTaskBanner>> subscribeOn = this.f114609l.mo62138L().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "operatorTaskGroupRepo.st…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: L0 */
    public void mo8143L0(WireBird lookupBird) {
        Intrinsics.checkNotNullParameter(lookupBird, "lookupBird");
        this.f114616s.m71837i(new C29636m(lookupBird));
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: M0 */
    public AbstractC23461c mo8142M0() {
        AbstractC23461c m33063X = this.f114609l.mo62136j1().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "operatorTaskGroupRepo.fe…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: N */
    public Observable<List<HibernationSessionVehicle>> mo8141N() {
        Observable<List<HibernationSessionVehicle>> subscribeOn = this.f114602e.mo73285N().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "hibernationRepo.streamHi…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: N0 */
    public Observable<OperatorTaskGroup> mo8140N0(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Observable<OperatorTaskGroup> subscribeOn = this.f114609l.mo62141J0(title).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "operatorTaskGroupRepo.st…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: O0 */
    public AbstractC23442F<OperatorMapDemandInsightResponse> mo8139O0() {
        AbstractC23442F<OperatorMapDemandInsightResponse> m33142Y = this.f114599b.m83024s().m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "operatorClient.getDemand…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: P0 */
    public AbstractC23461c mo8138P0(List<String> complaintIds, FileUploadReceipt fileUploadReceipt) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        AbstractC23461c m33063X = this.f114613p.mo44954V0(complaintIds, fileUploadReceipt).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: Q0 */
    public AbstractC23442F<HM4<WireOperatorActivityLogDetails>> mo8137Q0(String str, String str2) {
        AbstractC23442F<HM4<WireOperatorActivityLogDetails>> m33152N = this.f114599b.m83027p(str, str2).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "operatorClient\n      .ge…dSchedulers.mainThread())");
        return m33152N;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: R */
    public AbstractC23461c mo8136R(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33063X = this.f114611n.mo92312R(birdId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdRatingHistoryRepo.fe…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: R0 */
    public Observable<WireBird> mo8135R0(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        LockBirdBody lockBirdBody = new LockBirdBody(bird.getId(), z);
        AbstractC23442F<Location> mo43627e = this.f114608k.mo43627e(true);
        final C29629f c29629f = new C29629f(lockBirdBody);
        Observable m33162D = mo43627e.m33162D(new InterfaceC23492o() { // from class: um3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m8067z;
                m8067z = C50622vm3.m8067z(Function1.this, obj);
                return m8067z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33162D, "override fun lockUnlockB…ody).toObservable() }\n  }");
        return m33162D;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: S */
    public Observable<NestFlightSheetDetails> mo8134S(String nestId) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Observable<NestFlightSheetDetails> subscribeOn = this.f114603f.mo88992S(nestId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "nestFlightSheetRepo.stre…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: S0 */
    public AbstractC23461c mo8133S0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33063X = this.f114600c.mo39444T0(birdId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdRepo.fetchOperatorBi…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: T */
    public Observable<WarehouseFlightSheetDetails> mo8132T(String warehouseId) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Observable<WarehouseFlightSheetDetails> subscribeOn = this.f114604g.mo89206T(warehouseId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "warehouseFlightSheetRepo…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: T0 */
    public AbstractC23442F<QuickCaptureCancelResponse> mo8131T0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<QuickCaptureCancelResponse> m33142Y = this.f114606i.m42656l(new BirdIdBody(birdId)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "captureClient.cancelQuic…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: U */
    public Observable<List<OperatorRideHistoryItem>> mo8130U(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Observable<List<OperatorRideHistoryItem>> subscribeOn = this.f114610m.mo92295U(birdId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "rideHistoryRepo.streamRi…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: U0 */
    public AbstractC23461c mo8129U0(List<String> complaintIds, FileUploadReceipt fileUploadReceipt) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        AbstractC23461c m33063X = this.f114613p.mo44956M0(complaintIds, fileUploadReceipt).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: V */
    public Observable<OperatorRideHistoryItem> mo8128V(String rideId) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Observable<OperatorRideHistoryItem> subscribeOn = this.f114610m.mo92294V(rideId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "rideHistoryRepo.streamRi…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: V0 */
    public Z84<Optional<WireBird>> mo8127V0() {
        return m8081r();
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: W */
    public AbstractC23461c mo8126W(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33063X = this.f114610m.mo92293W(birdId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "rideHistoryRepo.fetchRid…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: W0 */
    public Observable<WireBird> mo8125W0(C9750YG event) {
        Observable<WireBird> m30319e;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!C40788fB0.m41760v(this.f114598a)) {
            Observable<WireBird> error = Observable.error(new LocationDisabledException());
            Intrinsics.checkNotNullExpressionValue(error, "error(LocationDisabledException())");
            return error;
        }
        WireBird m75287c = event.m75287c();
        List<String> m75286d = event.m75286d();
        C29635l c29635l = C29635l.f114634g;
        MapMode m37571t0 = this.f114614q.m37571t0();
        switch (C29623a.$EnumSwitchMapping$0[event.m75288b().ordinal()]) {
            case 1:
                m30319e = this.f114607j.m30319e(new StartTaskBody(m75287c.getId(), m75286d));
                break;
            case 2:
                m30319e = this.f114605h.m79963t(new AlarmBirdBody(m75287c.getId(), AlarmCommand.AUTO, null, 4, null));
                break;
            case 3:
                Observable<WireBird> m79982C = this.f114605h.m79982C(new MarkMissingBirdBody(m75287c.getId(), m37571t0.toScanMode()));
                final C29631h c29631h = new C29631h(m75287c);
                m30319e = m79982C.map(new InterfaceC23492o() { // from class: tm3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        WireBird m8153B;
                        m8153B = C50622vm3.m8153B(Function1.this, obj);
                        return m8153B;
                    }
                });
                break;
            case 4:
                m30319e = c29635l.invoke(m75287c, new C29632i(this.f114607j), Boolean.TRUE);
                break;
            case 5:
                m30319e = c29635l.invoke(m75287c, new C29633j(this.f114607j), Boolean.FALSE);
                break;
            case 6:
                m30319e = c29635l.invoke(m75287c, new C29634k(this.f114607j), Boolean.FALSE);
                break;
            case 7:
                m30319e = this.f114607j.m30319e(new StartTaskBody(m75287c.getId(), null, 2, null));
                break;
            default:
                m30319e = Observable.just(m75287c);
                break;
        }
        Observable<WireBird> observeOn = m30319e.subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "bird = event.bird\n    va…dSchedulers.mainThread())");
        return observeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: X */
    public AbstractC23442F<BountyFlightSheetDetails> mo8124X(String bountyId) {
        Intrinsics.checkNotNullParameter(bountyId, "bountyId");
        AbstractC23442F<BountyFlightSheetDetails> m33142Y = this.f114612o.mo75877X(bountyId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "bountyRepo.bounty(bounty…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: X0 */
    public AbstractC23461c mo8123X0(List<String> bountyIds) {
        Intrinsics.checkNotNullParameter(bountyIds, "bountyIds");
        AbstractC23461c m33063X = this.f114612o.mo75874b1(bountyIds).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "bountyRepo.cancelDesigna…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: Y */
    public Observable<FlightSheetDetails> mo8122Y(String vehicleId, FlightSheetContext context) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(context, "context");
        Observable<FlightSheetDetails> subscribeOn = this.f114601d.mo84721Y(vehicleId, context).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "flightSheetRepo.streamFl…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: Y0 */
    public AbstractC23461c mo8121Y0(String bountyId) {
        Intrinsics.checkNotNullParameter(bountyId, "bountyId");
        AbstractC23461c m33063X = this.f114612o.mo75884I1(bountyId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "bountyRepo.reAcceptDesig…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: Z */
    public AbstractC23442F<Boolean> mo8120Z(String surplusId) {
        Intrinsics.checkNotNullParameter(surplusId, "surplusId");
        AbstractC23442F<Boolean> m33142Y = this.f114612o.mo75876Z(surplusId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "bountyRepo.refreshSurplu…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: Z0 */
    public Observable<WireBird> mo8119Z0(WireBird bird, AlarmCommand command) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(command, "command");
        AbstractC23442F<Location> mo43627e = this.f114608k.mo43627e(true);
        final C29624b c29624b = new C29624b(bird, command);
        Observable m33162D = mo43627e.m33162D(new InterfaceC23492o() { // from class: sm3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m8085p;
                m8085p = C50622vm3.m8085p(Function1.this, obj);
                return m8085p;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33162D, "override fun alarmBird(b…(bird.id, command)) }\n  }");
        return m33162D;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: a */
    public Observable<Bird> mo8118a(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Observable<Bird> subscribeOn = this.f114600c.mo39434a(birdId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "birdRepo.streamBird(bird…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: a1 */
    public AbstractC23461c mo8117a1(Location location, double d, OperatorMapFilterBundle filters, List<String> list, List<Geolocation> viewport) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        AbstractC23461c m33063X = this.f114612o.mo75875a1(location, d, filters, list, viewport).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "bountyRepo.fetchBounties…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: b */
    public AbstractC23442F<HM4<WireBird>> mo8116b(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<WireBird>> m33142Y = this.f114599b.m83041b(birdId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "operatorClient.getBirdBy…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: b1 */
    public AbstractC23442F<HM4<Boolean>> mo8115b1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return this.f114599b.m83023t(new OperatorUpdateLocationBody(birdId));
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: c */
    public AbstractC23442F<HM4<List<WireBatch>>> mo8114c(String search, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(search, "search");
        AbstractC23442F<HM4<List<WireBatch>>> m33142Y = this.f114599b.m83040c(search, num, num2).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "operatorClient.searchOpe…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: c0 */
    public AbstractC24507p<Bird> mo8113c0(String code, ScanMode mode, ScanIntention scanIntention) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(mode, "mode");
        AbstractC24507p<Bird> m32056T = this.f114600c.mo39431c0(code, mode, scanIntention).m32056T(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32056T, "birdRepo.scanOperatorBir…scribeOn(Schedulers.io())");
        return m32056T;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: c1 */
    public AbstractC23442F<HM4<OperatorBirdResponse>> mo8112c1(OpsBatchJobActionKind action, String birdId, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<OperatorBirdResponse>> m33142Y = this.f114599b.m83035h(new OperatorBirdActionRequest(str, birdId, action)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "operatorClient.takeActio…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: d */
    public AbstractC23442F<OperatorBatchStatusResponse> mo8111d(String batchId) {
        Intrinsics.checkNotNullParameter(batchId, "batchId");
        AbstractC23442F<OperatorBatchStatusResponse> m33142Y = this.f114599b.m83039d(batchId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "operatorClient.getOperat…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: d1 */
    public AbstractC23442F<WireCaptureValidation> mo8110d1(String sessionId, String scanIdentifier, List<String> previousBirdIds) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(previousBirdIds, "previousBirdIds");
        AbstractC23442F<WireCaptureValidation> m33142Y = this.f114606i.m42659i(new CaptureValidationRequest(sessionId, scanIdentifier, previousBirdIds)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "captureClient.validate(\n…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: e */
    public AbstractC23461c mo8109e(List<String> complaintIds, List<String> issues) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(issues, "issues");
        AbstractC23461c m33063X = this.f114613p.mo44953e(complaintIds, issues).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: e0 */
    public AbstractC23461c mo8108e0(List<String> complaintIds, String notes) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(notes, "notes");
        AbstractC23461c m33063X = this.f114613p.mo44952e0(complaintIds, notes).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: e1 */
    public void mo8107e1() {
        this.f114616s.m71836j();
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: f */
    public AbstractC23461c mo8106f() {
        AbstractC23461c m33063X = this.f114602e.mo73283f().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "hibernationRepo.clearHib…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: f1 */
    public Observable<WireBird> mo8105f1(String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Observable<WireBird> subscribeOn = this.f114607j.m30321c(new TaskIdBody(taskId, Boolean.TRUE)).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "taskClient.completeTask(…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: g */
    public AbstractC23442F<WireBird> mo8104g(String birdCode) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        AbstractC23442F<WireBird> m33142Y = InterfaceC8601VK.C8602a.validate$default(this.f114605h, null, birdCode, 1, null).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "birdClient.validate(bird…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: g1 */
    public AbstractC23442F<HM4<WireBird>> mo8103g1(String birdId, String stickerId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(stickerId, "stickerId");
        AbstractC23442F<HM4<WireBird>> m33142Y = this.f114605h.m79978G(new BirdAssignStickerHourlyBody(stickerId, birdId)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "birdClient.assignSticker…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: h */
    public AbstractC23442F<QuickCaptureStateResponse> mo8102h(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<QuickCaptureStateResponse> m33142Y = this.f114606i.m42660h(birdId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "captureClient.quickCaptu…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: h1 */
    public AbstractC23442F<OperatorAttributesResponse> mo8101h1() {
        AbstractC23442F<OperatorAttributesResponse> m33142Y = this.f114599b.m83032k().m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "operatorClient.getOperat…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: i1 */
    public Observable<Integer> mo8099i1() {
        if (!this.f114615r.m31919i()) {
            mo8147I0().m33148R(new ArrayList()).subscribe();
        }
        return this.f114615r;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: j1 */
    public AbstractC23442F<BulkCaptureResponse> mo8097j1(String sessionId, List<String> birdIds) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        AbstractC23442F<BulkCaptureResponse> m33142Y = this.f114606i.m42657k(new BulkCaptureRequest(sessionId, birdIds)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "captureClient.capture(\n …scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: k1 */
    public AbstractC23461c mo8095k1() {
        AbstractC23461c m33063X = this.f114599b.m83031l().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "operatorClient.trackUser…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: l1 */
    public Observable<List<Bird>> mo8093l1(BulkScanPurpose purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Observable<List<Bird>> subscribeOn = this.f114600c.mo39417m1(purpose).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "birdRepo.streamBirdsByBu…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: m1 */
    public AbstractC23461c mo8091m1(Location location, double d, OperatorMapKind kind, OperatorMapFilterBundle filters, List<String> list, List<Geolocation> viewport) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        Z84<Optional<WireBird>> m8081r = m8081r();
        final C29625c c29625c = new C29625c(location, d, kind, filters, list, viewport);
        AbstractC23461c m33063X = m8081r.flatMapCompletable(new InterfaceC23492o() { // from class: rm3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m8083q;
                m8083q = C50622vm3.m8083q(Function1.this, obj);
                return m8083q;
            }
        }).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "override fun fetchOperat…beOn(Schedulers.io())\n  }");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: n0 */
    public AbstractC23461c mo8089n0(String vehicleId, FlightSheetContext context) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(context, "context");
        AbstractC23461c m33063X = this.f114601d.mo84720n0(vehicleId, context).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "flightSheetRepo.fetchFli…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: n1 */
    public AbstractC23461c mo8088n1(List<String> bountyIds) {
        Intrinsics.checkNotNullParameter(bountyIds, "bountyIds");
        AbstractC23461c m33063X = this.f114612o.mo75873o1(bountyIds).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "bountyRepo.acceptDesigna…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: o */
    public AbstractC23461c mo8087o(List<String> complaintIds, String action) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(action, "action");
        AbstractC23461c m33063X = this.f114613p.mo44949o(complaintIds, action).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: o1 */
    public AbstractC23442F<ComplaintResolutionForm> mo8086o1() {
        AbstractC23442F<ComplaintResolutionForm> m33142Y = this.f114613p.mo44950h1().m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: p1 */
    public AbstractC23442F<HM4<OperatorBatchActionResponse>> mo8084p1(String action, List<String> birdIds, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        AbstractC23442F<HM4<OperatorBatchActionResponse>> m33142Y = this.f114599b.m83025r(new OperatorBatchActionRequest(action, null, str, birdIds)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "operatorClient.takeActio…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: q1 */
    public Observable<List<OperatorTaskGroup>> mo8082q1() {
        Observable<List<OperatorTaskGroup>> subscribeOn = this.f114609l.mo62135w1().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "operatorTaskGroupRepo.st…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    /* renamed from: r */
    public final Z84<Optional<WireBird>> m8081r() {
        return (Z84) this.f114617t.getValue();
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: r1 */
    public AbstractC23461c mo8080r1(BulkScanPurpose purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        AbstractC23461c m33063X = this.f114600c.mo39438X0(purpose).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdRepo.clearBirdsByBul…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: s */
    public AbstractC24490k<List<BirdMapMarker>> mo8079s(OperatorMapFilterBundle filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        AbstractC24490k<List<BirdMapMarker>> m32163Y0 = this.f114600c.mo39410s(filters).m32163Y0(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32163Y0, "birdRepo.streamOperatorM…scribeOn(Schedulers.io())");
        return m32163Y0;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: s0 */
    public AbstractC23461c mo8078s0(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        AbstractC23461c m33063X = this.f114602e.mo73281s0(birdIds).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "hibernationRepo.fetchHib…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: s1 */
    public AbstractC23461c mo8077s1(List<String> complaintIds) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        AbstractC23461c m33063X = this.f114613p.mo44951f1(complaintIds).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: t */
    public AbstractC23461c mo8076t(String... birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        AbstractC23461c m33063X = this.f114600c.mo39409t((String[]) Arrays.copyOf(birdIds, birdIds.length)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdRepo.deleteBulkScanB…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: t1 */
    public AbstractC23442F<QuickCaptureResponse> mo8075t1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<QuickCaptureResponse> m33142Y = this.f114606i.m42658j(new BirdIdBody(birdId)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "captureClient.quickCaptu…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: v */
    public AbstractC24490k<List<Bird>> mo8073v(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        AbstractC24490k<List<Bird>> m32163Y0 = this.f114600c.mo39408v(birdIds).m32163Y0(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32163Y0, "birdRepo.streamBirds(bir…scribeOn(Schedulers.io())");
        return m32163Y0;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: v0 */
    public Observable<List<BountyMapMarker>> mo8072v0() {
        Observable<List<BountyMapMarker>> subscribeOn = this.f114612o.mo75872v0().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "bountyRepo.bounties()\n  …scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: w0 */
    public AbstractC23442F<Bird> mo8070w0(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return this.f114600c.mo39407w0(bird);
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: x */
    public AbstractC23461c mo8069x(ComplaintResolution request) {
        Intrinsics.checkNotNullParameter(request, "request");
        AbstractC23461c m33063X = this.f114613p.mo44948x(request).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46473om3
    /* renamed from: y */
    public AbstractC23461c mo8068y(List<String> complaintIds, List<String> vehicleInvolvedIds) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(vehicleInvolvedIds, "vehicleInvolvedIds");
        AbstractC23461c m33063X = this.f114613p.mo44947y(complaintIds, vehicleInvolvedIds).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "complaintResolutionRepo.…scribeOn(Schedulers.io())");
        return m33063X;
    }
}
