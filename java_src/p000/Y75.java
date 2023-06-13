package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC10997b;
import androidx.appcompat.widget.AppCompatButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.RideStatusBottomSheetButton;
import co.bird.android.model.RideStatusEndButton;
import co.bird.android.model.RideStatusLockButton;
import co.bird.android.model.RideStatusManageRidesButton;
import co.bird.android.model.RideStatusScanAfterReserveButton;
import co.bird.android.model.RideStatusUnlockButton;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.constant.ScanButtonShape;
import co.bird.android.model.constant.ScanButtonStyle;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.WarningPresentationKind;
import co.bird.android.widget.ActionView;
import co.bird.android.widget.ControlButton;
import co.bird.android.widget.InfoPillLinearLayout;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.list.DialogListExtKt;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.skydoves.balloon.Balloon;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23470e;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32147Ch3;
import p000.H31;
import p000.P75;
@Metadata(m28433d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Ó\u00012\u00020\u00012\u00020\u0002:\u0002Ô\u0001BN\b\u0007\u0012\b\u0010Ì\u0001\u001a\u00030Ë\u0001\u0012\u0006\u0010|\u001a\u00020w\u0012\u0007\u0010\u0080\u0001\u001a\u00020}\u0012\b\u0010\u0084\u0001\u001a\u00030\u0081\u0001\u0012\b\u0010\u0088\u0001\u001a\u00030\u0085\u0001\u0012\b\u0010Î\u0001\u001a\u00030Í\u0001\u0012\b\u0010Ð\u0001\u001a\u00030Ï\u0001¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00052\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\tH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\tH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\tH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\tH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\tH\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J2\u0010,\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140)H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\u001e\u00105\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0016J\u0016\u00107\u001a\u00020\u00052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016J\b\u00109\u001a\u000208H\u0016J-\u0010=\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u00032\b\u0010;\u001a\u0004\u0018\u00010&2\b\u0010<\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b=\u0010>JO\u0010D\u001a\u00020\u00052\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\b\u0010B\u001a\u0004\u0018\u00010\u00032\b\u0010C\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010G\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010J\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016J\b\u0010K\u001a\u00020\u0005H\u0016J\u0010\u0010L\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\b\u0010P\u001a\u00020\u000fH\u0016J\u0018\u0010R\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0016J\u0018\u0010S\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0016J\u000e\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u0010\u0010U\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u0018\u0010Y\u001a\u00020\u00052\u0006\u0010@\u001a\u00020*2\u0006\u0010X\u001a\u00020WH\u0016J\u0010\u0010Z\u001a\u00020\u00052\u0006\u0010X\u001a\u00020&H\u0016J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010X\u001a\u00020&H\u0016J\u0010\u0010\\\u001a\u00020\u00052\u0006\u0010X\u001a\u00020&H\u0016J\u001e\u0010]\u001a\u00020\u00052\u0006\u0010X\u001a\u00020&2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016J\u001e\u0010^\u001a\u00020\u00052\u0006\u0010X\u001a\u00020&2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016J\u001e\u0010_\u001a\u00020\u00052\u0006\u0010X\u001a\u00020&2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016J\u0010\u0010a\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\u0003H\u0016J\u0010\u0010b\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\u0003H\u0016J\u0010\u0010c\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\u0003H\u0016J\u0010\u0010f\u001a\u00020\u00052\u0006\u0010e\u001a\u00020dH\u0016J\u0010\u0010h\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u000fH\u0016J\u000e\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u0014\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\tH\u0016J\u0010\u0010l\u001a\u00020\u00052\u0006\u0010k\u001a\u00020\bH\u0016J\u0010\u0010m\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u000e\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u0018\u0010t\u001a\u00020\u00052\u0006\u0010q\u001a\u00020p2\u0006\u0010s\u001a\u00020rH\u0016J\u000e\u0010u\u001a\b\u0012\u0004\u0012\u00020403H\u0016J\b\u0010v\u001a\u00020\u0005H\u0016R\u001a\u0010|\u001a\u00020w8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R#\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0089\u00018TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R#\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008f\u00018TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008b\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R#\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0094\u00018TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u008b\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R#\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0094\u00018TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u008b\u0001\u001a\u0006\b\u009a\u0001\u0010\u0097\u0001R2\u0010£\u0001\u001a\u00020\u000f2\u0007\u0010\u009c\u0001\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R\u001c\u0010§\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010©\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u009e\u0001R!\u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010\u008b\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010²\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\"\u0010¶\u0001\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0001\u0010\u008b\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R1\u0010»\u0001\u001a\u0013\u0012\r\u0012\u000b ·\u0001*\u0004\u0018\u00010\b0\b\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0001\u0010\u008b\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R\"\u0010¾\u0001\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u008b\u0001\u001a\u0006\b½\u0001\u0010µ\u0001R1\u0010Á\u0001\u001a\u0013\u0012\r\u0012\u000b ·\u0001*\u0004\u0018\u00010\b0\b\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¿\u0001\u0010\u008b\u0001\u001a\u0006\bÀ\u0001\u0010º\u0001R#\u0010Ä\u0001\u001a\u0005\u0018\u00010\u0094\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010\u008b\u0001\u001a\u0006\bÃ\u0001\u0010\u0097\u0001R#\u0010Ç\u0001\u001a\u0005\u0018\u00010\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010\u008b\u0001\u001a\u0006\bÆ\u0001\u0010\u0092\u0001R\u0019\u0010Ê\u0001\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001¨\u0006Õ\u0001"}, m28432d2 = {"LY75;", "LHA;", "LP75;", "", TransferTable.COLUMN_STATE, "", "Am", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "qm", "La75;", "rideStatus", "Q2", "", "show", "R7", "Qd", "sf", "Lkotlin/Function0;", "onDismiss", "H5", "n7", "Lco/bird/android/model/RideStatusUnlockButton;", "Ok", "Lco/bird/android/model/RideStatusLockButton;", "uh", "Lco/bird/android/model/RideStatusEndButton;", "o9", "Lco/bird/android/model/RideStatusManageRidesButton;", "mi", "Lco/bird/android/model/RideStatusScanAfterReserveButton;", Bird_Kt.MODEL_BIRD_B4, "Zg", "vg", "Sb", "zd", "", "dialogTitle", "dialogContent", "", "", "options", "Gg", "Z9", "U1", "LQM4;", "alertDialog", "Lco/bird/android/model/wire/configs/WarningPresentationKind;", "presentationKind", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Ck", "onPrimary", "N0", "Lio/reactivex/c;", "V7", "iconRes", "titleText", "bodyText", "vk", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/c;", "title", "message", "onSecondary", "fee", "currency", "k1", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/String;)V", "de", "M6", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "purpose", "kc", "Ce", "Xi", "Kb", "O7", "Fa", "c4", "showPhysicalLockCopy", "ad", "Sd", "F", AbstractC3831J1.f16564d, "Q", "Lf56;", "duration", "topToast", "Cg", "E2", "k5", "X6", "Pi", "n3", "minutes", "od", "Jc", "Zc", "LYz1;", "status", "Y1", "animated", "Bi", "W9", "di", "bottomSheet", "yk", "Ff", "ra", "b3", "Lco/bird/android/model/constant/ScanButtonStyle;", "scanButtonStyle", "Lco/bird/android/model/constant/ScanButtonShape;", "scanButtonShape", "ic", "Ci", "Xa", "LTo2;", "j", "LTo2;", "Vl", "()LTo2;", "assetManager", "LF5;", "k", "LF5;", "binding", "LDt6;", "l", "LDt6;", "sideMenuBinding", "LTq4;", "m", "LTq4;", "reactiveConfig", "Landroid/view/ViewGroup;", "n", "Lkotlin/Lazy;", "Zl", "()Landroid/view/ViewGroup;", "bannerView", "Landroid/widget/ImageView;", "o", "Wl", "()Landroid/widget/ImageView;", "bannerImage", "Landroid/widget/TextView;", "p", "Yl", "()Landroid/widget/TextView;", "bannerTitle", "q", "Xl", "bannerSubtitle", "value", "r", "Z", "ym", "()Z", "Z8", "(Z)V", "showGroupRide", "Lcom/skydoves/balloon/Balloon;", "s", "Lcom/skydoves/balloon/Balloon;", "tooltipBalloon", "t", "frequentFlyerStatusInflated", "Lco/bird/android/widget/InfoPillLinearLayout;", "u", "um", "()Lco/bird/android/widget/InfoPillLinearLayout;", "frequentFlyerStatus", "Lco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet;", "v", "Lco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet;", "rideStatusBottomSheet", "w", "xm", "()Landroid/view/View;", "privateBirdFlightView", "kotlin.jvm.PlatformType", "x", "wm", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "privateBirdBottomSheetBehavior", "y", "tm", "destinationSelectionView", "z", "sm", "destinationBottomSheetBehavior", "A", "rm", "addRidePill", "B", "vm", "physicalLockButton", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Landroid/view/View;", "buttonContainer", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LJf;", "adapter", "Lbg;", "converter", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LTo2;LF5;LDt6;LTq4;LJf;Lbg;)V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideUi.kt\nco/bird/android/app/feature/ride/ui/RideUiImpl\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Rx+.kt\nco/bird/android/library/rx/Rx_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,816:1\n260#2:817\n641#3,2:818\n641#3,2:820\n641#3,2:822\n641#3,2:824\n641#3,2:826\n1#4:828\n41#5,2:829\n*S KotlinDebug\n*F\n+ 1 RideUi.kt\nco/bird/android/app/feature/ride/ui/RideUiImpl\n*L\n192#1:817\n250#1:818,2\n253#1:820,2\n256#1:822,2\n259#1:824,2\n262#1:826,2\n720#1:829,2\n*E\n"})
/* renamed from: Y75 */
/* loaded from: classes2.dex */
public final class Y75 extends AbstractC3056HA implements P75 {

    /* renamed from: D */
    public static final C9653a f44585D = new C9653a(null);

    /* renamed from: E */
    public static final int f44586E = 8;

    /* renamed from: A */
    public final Lazy f44587A;

    /* renamed from: B */
    public final Lazy f44588B;

    /* renamed from: C */
    public final View f44589C;

    /* renamed from: j */
    public final InterfaceC36187To2 f44590j;

    /* renamed from: k */
    public final C2136F5 f44591k;

    /* renamed from: l */
    public final C32492Dt6 f44592l;

    /* renamed from: m */
    public final C36207Tq4 f44593m;

    /* renamed from: n */
    public final Lazy f44594n;

    /* renamed from: o */
    public final Lazy f44595o;

    /* renamed from: p */
    public final Lazy f44596p;

    /* renamed from: q */
    public final Lazy f44597q;

    /* renamed from: r */
    public boolean f44598r;

    /* renamed from: s */
    public Balloon f44599s;

    /* renamed from: t */
    public boolean f44600t;

    /* renamed from: u */
    public final Lazy f44601u;

    /* renamed from: v */
    public final RideStatusBottomSheet f44602v;

    /* renamed from: w */
    public final Lazy f44603w;

    /* renamed from: x */
    public final Lazy f44604x;

    /* renamed from: y */
    public final Lazy f44605y;

    /* renamed from: z */
    public final Lazy f44606z;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$A */
    /* loaded from: classes2.dex */
    public static final class C9640A extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C9640A f44607g = new C9640A();

        public C9640A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.OK;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$B */
    /* loaded from: classes2.dex */
    public static final class C9641B extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C9641B f44608g = new C9641B();

        public C9641B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.OTHER;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$C */
    /* loaded from: classes2.dex */
    public static final class C9642C extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ DialogInterfaceC10997b f44609g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9642C(DialogInterfaceC10997b dialogInterfaceC10997b) {
            super(1);
            this.f44609g = dialogInterfaceC10997b;
        }

        /* renamed from: a */
        public final void m75574a(InterfaceC23465c interfaceC23465c) {
            this.f44609g.show();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m75574a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$D */
    /* loaded from: classes2.dex */
    public static final class C9643D extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public final /* synthetic */ DialogInterfaceC10997b f44610g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9643D(DialogInterfaceC10997b dialogInterfaceC10997b) {
            super(1);
            this.f44610g = dialogInterfaceC10997b;
        }

        /* renamed from: a */
        public final void m75573a(DialogResponse dialogResponse) {
            this.f44610g.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m75573a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$E */
    /* loaded from: classes2.dex */
    public static final class C9644E extends Lambda implements Function1<DialogResponse, DialogResponse> {

        /* renamed from: g */
        public static final C9644E f44611g = new C9644E();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Y75$E$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9645a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogResponse.values().length];
                try {
                    iArr[DialogResponse.CANCEL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C9644E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (C9645a.$EnumSwitchMapping$0[it.ordinal()] == 1) {
                return DialogResponse.OTHER;
            }
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Lco/bird/android/model/DialogResponse;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideUi.kt\nco/bird/android/app/feature/ride/ui/RideUiImpl$showRestrictedAreaDialog$9\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,816:1\n1#2:817\n*E\n"})
    /* renamed from: Y75$F */
    /* loaded from: classes2.dex */
    public static final class C9646F extends Lambda implements Function1<InterfaceC23444H<DialogResponse>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f44613h;

        /* renamed from: i */
        public final /* synthetic */ String f44614i;

        /* renamed from: j */
        public final /* synthetic */ String f44615j;

        /* renamed from: k */
        public final /* synthetic */ String f44616k;

        /* renamed from: l */
        public final /* synthetic */ String f44617l;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Y75$F$a */
        /* loaded from: classes2.dex */
        public static final class C9647a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f44618g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9647a(InterfaceC23444H<DialogResponse> interfaceC23444H) {
                super(0);
                this.f44618g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f44618g.onSuccess(DialogResponse.OK);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Y75$F$b */
        /* loaded from: classes2.dex */
        public static final class C9648b extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f44619g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9648b(InterfaceC23444H<DialogResponse> interfaceC23444H) {
                super(0);
                this.f44619g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f44619g.onSuccess(DialogResponse.OTHER);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9646F(int i, String str, String str2, String str3, String str4) {
            super(1);
            this.f44613h = i;
            this.f44614i = str;
            this.f44615j = str2;
            this.f44616k = str3;
            this.f44617l = str4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<DialogResponse> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<DialogResponse> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            int i = C39311cj4.dialog_area_specific_warning;
            int i2 = C36585Vg4.icon;
            int i3 = C36585Vg4.title;
            int i4 = C36585Vg4.body;
            int i5 = C36585Vg4.confirmButton;
            Integer valueOf = Integer.valueOf(C36585Vg4.secondaryButton);
            String str = this.f44617l;
            valueOf.intValue();
            if (!(str != null)) {
                valueOf = null;
            }
            H31.C3014a.showCustomDialog$default((H31) Y75.this, i, Integer.valueOf(i2), Integer.valueOf(this.f44613h), false, false, false, Integer.valueOf(i3), Integer.valueOf(i4), (CharSequence) this.f44614i, (CharSequence) this.f44615j, i5, valueOf, this.f44616k, this.f44617l, (Function0) new C9647a(emitter), (Function0) new C9648b(emitter), (Function0) null, (Function0) null, false, 458792, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog", "", "index", "", Entry.TYPE_TEXT, "", C17296a.f69688o, "(Lcom/afollestad/materialdialogs/MaterialDialog;ILjava/lang/CharSequence;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$G */
    /* loaded from: classes2.dex */
    public static final class C9649G extends Lambda implements Function3<MaterialDialog, Integer, CharSequence, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Map<CharSequence, Function0<Unit>> f44620g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9649G(Map<CharSequence, Function0<Unit>> map) {
            super(3);
            this.f44620g = map;
        }

        /* renamed from: a */
        public final void m75571a(MaterialDialog dialog, int i, CharSequence text) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(text, "text");
            Function0<Unit> function0 = this.f44620g.get(text);
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog, Integer num, CharSequence charSequence) {
            m75571a(materialDialog, num.intValue(), charSequence);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T1", "T2", "T3", "R", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$3\n+ 2 RideUi.kt\nco/bird/android/app/feature/ride/ui/RideUiImpl\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,304:1\n725#2:305\n2333#3,14:306\n*S KotlinDebug\n*F\n+ 1 RideUi.kt\nco/bird/android/app/feature/ride/ui/RideUiImpl\n*L\n725#1:306,14\n*E\n"})
    /* renamed from: Y75$H */
    /* loaded from: classes2.dex */
    public static final class C9650H<T1, T2, T3, R> implements InterfaceC23485h<T1, T2, T3, R> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(T1 t1, T2 t2, T3 t3) {
            List listOf;
            float f;
            float f2;
            Object obj;
            R r = (R) ((Optional) t1);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Optional[]{r, (Optional) t2, (Optional) t3});
            Iterator it = listOf.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                Object next = it.next();
                if (!it.hasNext()) {
                    obj = next;
                } else {
                    View view = (View) ((Optional) next).m59035e();
                    if (view != null) {
                        f = view.getY();
                    } else {
                        f = Float.MAX_VALUE;
                    }
                    do {
                        Object next2 = it.next();
                        View view2 = (View) ((Optional) next2).m59035e();
                        if (view2 != null) {
                            f2 = view2.getY();
                        } else {
                            f2 = Float.MAX_VALUE;
                        }
                        if (Float.compare(f, f2) > 0) {
                            next = next2;
                            f = f2;
                        }
                    } while (it.hasNext());
                    obj = next;
                }
            }
            R r2 = (R) ((Optional) obj);
            if (r2 != null) {
                return r2;
            }
            return r;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Y75$I */
    /* loaded from: classes2.dex */
    public static final class C9651I<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C9651I<T> f44621b = new C9651I<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof RideStatusUnlockButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Y75$J */
    /* loaded from: classes2.dex */
    public static final class C9652J<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C9652J<T, R> f44622b = new C9652J<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final RideStatusUnlockButton apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (RideStatusUnlockButton) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LY75$a;", "", "", "AUTO_DISMISS_HELMET_LOCK_TOOLTIP_SECONDS", "J", "BOTTOM_SHEET_LAYOUT_PADDING_MILLIS", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Y75$a */
    /* loaded from: classes2.dex */
    public static final class C9653a {
        public /* synthetic */ C9653a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9653a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y75$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9654b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[WarningPresentationKind.values().length];
            try {
                iArr[WarningPresentationKind.FULL_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WarningPresentationKind.ACTION_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WarningPresentationKind.ALERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WarningPresentationKind.LEGACY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PhysicalLockPurpose.values().length];
            try {
                iArr2[PhysicalLockPurpose.HELMET.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ScanButtonStyle.values().length];
            try {
                iArr3[ScanButtonStyle.RIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ScanButtonStyle.SCAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ScanButtonStyle.QR_SCAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ScanButtonStyle.QR_GRID.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ScanButtonShape.values().length];
            try {
                iArr4[ScanButtonShape.PILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y75$c */
    /* loaded from: classes2.dex */
    public static final class C9655c extends Lambda implements Function0<TextView> {

        /* renamed from: g */
        public final /* synthetic */ BaseActivity f44623g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9655c(BaseActivity baseActivity) {
            super(0);
            this.f44623g = baseActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) C40788fB0.m41758x(this.f44623g, C36585Vg4.addRidePill);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y75$d */
    /* loaded from: classes2.dex */
    public static final class C9656d extends Lambda implements Function0<ImageView> {
        public C9656d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            return Y75.this.f44592l.f6469c;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y75$e */
    /* loaded from: classes2.dex */
    public static final class C9657e extends Lambda implements Function0<TextView> {
        public C9657e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return Y75.this.f44592l.f6470d;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y75$f */
    /* loaded from: classes2.dex */
    public static final class C9658f extends Lambda implements Function0<TextView> {
        public C9658f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return Y75.this.f44592l.f6471e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/widget/RelativeLayout;", "b", "()Landroid/widget/RelativeLayout;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$g */
    /* loaded from: classes2.dex */
    public static final class C9659g extends Lambda implements Function0<RelativeLayout> {
        public C9659g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final RelativeLayout invoke() {
            return Y75.this.f44592l.f6468b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LOZ;", "it", "Lco/bird/android/buava/Optional;", "Landroid/view/View;", C17296a.f69688o, "(LOZ;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$h */
    /* loaded from: classes2.dex */
    public static final class C9660h extends Lambda implements Function1<AbstractC6031OZ, Optional<View>> {

        /* renamed from: g */
        public static final C9660h f44628g = new C9660h();

        public C9660h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<View> invoke(AbstractC6031OZ it) {
            C43051j00 c43051j00;
            Optional<View> m59034a;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof C43051j00) {
                c43051j00 = (C43051j00) it;
            } else {
                c43051j00 = null;
            }
            if (c43051j00 == null) {
                return null;
            }
            if (C3161HZ.m103747a(c43051j00.m31275c())) {
                m59034a = Optional.f63040c.m59032c(c43051j00.m31276b());
            } else {
                m59034a = Optional.f63040c.m59034a();
            }
            return m59034a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRideUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideUi.kt\nco/bird/android/app/feature/ride/ui/RideUiImpl$destinationBottomSheetBehavior$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,816:1\n1#2:817\n*E\n"})
    /* renamed from: Y75$i */
    /* loaded from: classes2.dex */
    public static final class C9661i extends Lambda implements Function0<BottomSheetBehavior<View>> {
        public C9661i() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final BottomSheetBehavior<View> invoke() {
            View m75588tm = Y75.this.m75588tm();
            if (m75588tm != null) {
                return BottomSheetBehavior.m50133G(m75588tm);
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/view/View;", "b", "()Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$j */
    /* loaded from: classes2.dex */
    public static final class C9662j extends Lambda implements Function0<View> {

        /* renamed from: g */
        public final /* synthetic */ BaseActivity f44630g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9662j(BaseActivity baseActivity) {
            super(0);
            this.f44630g = baseActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final View invoke() {
            return C40788fB0.m41758x(this.f44630g, C36585Vg4.destinationSelectionView);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Y75$k */
    /* loaded from: classes2.dex */
    public static final class C9663k<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C9663k<T> f44631b = new C9663k<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof RideStatusEndButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Y75$l */
    /* loaded from: classes2.dex */
    public static final class C9664l<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C9664l<T, R> f44632b = new C9664l<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final RideStatusEndButton apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (RideStatusEndButton) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/widget/InfoPillLinearLayout;", "b", "()Lco/bird/android/widget/InfoPillLinearLayout;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$m */
    /* loaded from: classes2.dex */
    public static final class C9665m extends Lambda implements Function0<InfoPillLinearLayout> {
        public C9665m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InfoPillLinearLayout invoke() {
            Y75.this.f44600t = true;
            View inflate = Y75.this.f44591k.f8683o.inflate();
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type co.bird.android.widget.InfoPillLinearLayout");
            return (InfoPillLinearLayout) inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Y75$n */
    /* loaded from: classes2.dex */
    public static final class C9666n<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C9666n<T> f44634b = new C9666n<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof RideStatusLockButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Y75$o */
    /* loaded from: classes2.dex */
    public static final class C9667o<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C9667o<T, R> f44635b = new C9667o<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final RideStatusLockButton apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (RideStatusLockButton) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Y75$p */
    /* loaded from: classes2.dex */
    public static final class C9668p<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C9668p<T> f44636b = new C9668p<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof RideStatusManageRidesButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Y75$q */
    /* loaded from: classes2.dex */
    public static final class C9669q<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C9669q<T, R> f44637b = new C9669q<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final RideStatusManageRidesButton apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (RideStatusManageRidesButton) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y75$r */
    /* loaded from: classes2.dex */
    public static final class C9670r extends Lambda implements Function0<ImageView> {

        /* renamed from: g */
        public final /* synthetic */ BaseActivity f44638g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9670r(BaseActivity baseActivity) {
            super(0);
            this.f44638g = baseActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            return (ImageView) C40788fB0.m41758x(this.f44638g, C36585Vg4.physicalLockButton);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRideUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideUi.kt\nco/bird/android/app/feature/ride/ui/RideUiImpl$privateBirdBottomSheetBehavior$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,816:1\n1#2:817\n*E\n"})
    /* renamed from: Y75$s */
    /* loaded from: classes2.dex */
    public static final class C9671s extends Lambda implements Function0<BottomSheetBehavior<View>> {
        public C9671s() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final BottomSheetBehavior<View> invoke() {
            View m75581xm = Y75.this.m75581xm();
            if (m75581xm != null) {
                return BottomSheetBehavior.m50133G(m75581xm);
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y75$t */
    /* loaded from: classes2.dex */
    public static final class C9672t extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public static final C9672t f44640g = new C9672t();

        public C9672t() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/view/View;", "b", "()Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$u */
    /* loaded from: classes2.dex */
    public static final class C9673u extends Lambda implements Function0<View> {

        /* renamed from: g */
        public final /* synthetic */ BaseActivity f44641g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9673u(BaseActivity baseActivity) {
            super(0);
            this.f44641g = baseActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final View invoke() {
            return C40788fB0.m41758x(this.f44641g, C36585Vg4.privateBirdFlightView);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Y75$v */
    /* loaded from: classes2.dex */
    public static final class C9674v<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C9674v<T> f44642b = new C9674v<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof RideStatusScanAfterReserveButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Y75$w */
    /* loaded from: classes2.dex */
    public static final class C9675w<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C9675w<T, R> f44643b = new C9675w<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final RideStatusScanAfterReserveButton apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (RideStatusScanAfterReserveButton) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/skydoves/balloon/Balloon$a;", "", C17296a.f69688o, "(Lcom/skydoves/balloon/Balloon$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$x */
    /* loaded from: classes2.dex */
    public static final class C9676x extends Lambda implements Function1<Balloon.C18588a, Unit> {

        /* renamed from: g */
        public static final C9676x f44644g = new C9676x();

        public C9676x() {
            super(1);
        }

        /* renamed from: a */
        public final void m75565a(Balloon.C18588a createBirdTooltip) {
            Intrinsics.checkNotNullParameter(createBirdTooltip, "$this$createBirdTooltip");
            createBirdTooltip.m45638V0(15000L);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Balloon.C18588a c18588a) {
            m75565a(c18588a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/e;", "emitter", "", C17296a.f69688o, "(Lio/reactivex/e;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$y */
    /* loaded from: classes2.dex */
    public static final class C9677y extends Lambda implements Function1<InterfaceC23470e, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Integer f44646h;

        /* renamed from: i */
        public final /* synthetic */ String f44647i;

        /* renamed from: j */
        public final /* synthetic */ String f44648j;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Y75$y$a */
        /* loaded from: classes2.dex */
        public static final class C9678a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23470e f44649g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9678a(InterfaceC23470e interfaceC23470e) {
                super(0);
                this.f44649g = interfaceC23470e;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f44649g.onComplete();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9677y(Integer num, String str, String str2) {
            super(1);
            this.f44646h = num;
            this.f44647i = str;
            this.f44648j = str2;
        }

        /* renamed from: a */
        public final void m75564a(InterfaceC23470e emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            H31.C3014a.showCustomDialog$default((H31) Y75.this, C39311cj4.dialog_area_specific_warning, Integer.valueOf(C36585Vg4.icon), this.f44646h, false, false, false, Integer.valueOf(C36585Vg4.title), Integer.valueOf(C36585Vg4.body), (CharSequence) this.f44647i, (CharSequence) this.f44648j, C36585Vg4.confirmButton, (Integer) null, (String) null, (String) null, (Function0) new C9678a(emitter), (Function0) null, (Function0) null, (Function0) null, false, 505896, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23470e interfaceC23470e) {
            m75564a(interfaceC23470e);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y75$z */
    /* loaded from: classes2.dex */
    public static final class C9679z extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C9679z f44650g = new C9679z();

        public C9679z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.DISMISS;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y75(BaseActivity activity, InterfaceC36187To2 assetManager, C2136F5 binding, C32492Dt6 sideMenuBinding, C36207Tq4 reactiveConfig, C4176Jf adapter, C12470bg converter) {
        super(activity, adapter, converter);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Lazy lazy8;
        Lazy lazy9;
        Lazy lazy10;
        Lazy lazy11;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(sideMenuBinding, "sideMenuBinding");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f44590j = assetManager;
        this.f44591k = binding;
        this.f44592l = sideMenuBinding;
        this.f44593m = reactiveConfig;
        lazy = LazyKt__LazyJVMKt.lazy(new C9659g());
        this.f44594n = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C9656d());
        this.f44595o = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C9658f());
        this.f44596p = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C9657e());
        this.f44597q = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C9665m());
        this.f44601u = lazy5;
        this.f44602v = (RideStatusBottomSheet) C40788fB0.m41758x(activity, C36585Vg4.rideStatusBottomSheet);
        lazy6 = LazyKt__LazyJVMKt.lazy(new C9673u(activity));
        this.f44603w = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new C9671s());
        this.f44604x = lazy7;
        lazy8 = LazyKt__LazyJVMKt.lazy(new C9662j(activity));
        this.f44605y = lazy8;
        lazy9 = LazyKt__LazyJVMKt.lazy(new C9661i());
        this.f44606z = lazy9;
        lazy10 = LazyKt__LazyJVMKt.lazy(new C9655c(activity));
        this.f44587A = lazy10;
        lazy11 = LazyKt__LazyJVMKt.lazy(new C9670r(activity));
        this.f44588B = lazy11;
        this.f44589C = C40788fB0.m41758x(activity, C36585Vg4.buttonContainer);
    }

    /* renamed from: Bm */
    public static final void m75662Bm(int i, Y75 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 4) {
            if (i != 5) {
                BottomSheetBehavior<View> m59057u = this$0.f44602v.m59057u();
                if (m59057u != null) {
                    m59057u.m50082p0(i);
                    return;
                }
                return;
            }
            this$0.f44602v.m59081U();
            return;
        }
        this$0.f44602v.m59079W();
    }

    /* renamed from: Cm */
    public static final DialogResponse m75657Cm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: Dm */
    public static final DialogResponse m75656Dm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: Em */
    public static final DialogResponse m75654Em(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: Fm */
    public static final DialogResponse m75650Fm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: Gm */
    public static final void m75648Gm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Hm */
    public static final void m75646Hm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: zm */
    public static final void m75577zm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Am */
    public final void m75664Am(final int i) {
        RideStatusBottomSheet rideStatusBottomSheet = this.f44602v;
        if (rideStatusBottomSheet != null) {
            rideStatusBottomSheet.post(new Runnable() { // from class: Q75
                @Override // java.lang.Runnable
                public final void run() {
                    Y75.m75662Bm(i, this);
                }
            });
        }
    }

    @Override // p000.P75
    /* renamed from: Bi */
    public void mo75663Bi(boolean z) {
        if (!this.f44600t) {
            return;
        }
        if (z) {
            C49520tu6.fadeOut$default(m75586um(), 300L, 0, 2, null);
        } else {
            C49520tu6.m11239l(m75586um());
        }
    }

    @Override // p000.P75
    /* renamed from: Ce */
    public void mo75661Ce() {
        ImageView m75583vm = m75583vm();
        if (m75583vm == null) {
            return;
        }
        BaseActivity activity = getActivity();
        String string = getActivity().getString(C45871nl4.smartlock_helmet_lock_button_tooltip);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…lmet_lock_button_tooltip)");
        Balloon m99238a = K56.m99238a(activity, string, C9676x.f44644g);
        this.f44599s = m99238a;
        if (m99238a != null) {
            Balloon.m45751H0(m99238a, m75583vm, 0, 0, 6, null);
        }
    }

    @Override // p000.P75
    /* renamed from: Cg */
    public void mo75660Cg(String duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        int i = C39311cj4.dialog_reserve_bad_scan;
        int i2 = C36585Vg4.header;
        H31.C3014a.showCustomDialog$default((H31) this, i, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(i2), Integer.valueOf(C36585Vg4.mainText), (CharSequence) getActivity().getString(C45871nl4.ride_canceled_free_reserve_and_unlock_modal_header), (CharSequence) getActivity().getString(C45871nl4.ride_canceled_free_reserve_and_unlock_modal_body, duration), C36585Vg4.confirmButton, (Integer) null, getActivity().getString(C45871nl4.ride_canceled_free_reserve_modal_button), (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 518206, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: Ci */
    public AbstractC23442F<DialogResponse> mo75659Ci() {
        C32147Ch3.C1129a c1129a = C32147Ch3.f4487d;
        if (!c1129a.m111871a().isAdded()) {
            c1129a.m111871a().show(getActivity().getSupportFragmentManager(), "OneFlowOnboardingBottomSheet");
        }
        return c1129a.m111871a().m111873N6();
    }

    @Override // p000.P75
    /* renamed from: Ck */
    public AbstractC23442F<DialogResponse> mo75658Ck(QM4 alertDialog, WarningPresentationKind presentationKind) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(alertDialog, "alertDialog");
        Intrinsics.checkNotNullParameter(presentationKind, "presentationKind");
        int mo27707d = alertDialog.mo27707d();
        String obj = alertDialog.title(getActivity()).toString();
        String obj2 = alertDialog.message(getActivity()).toString();
        Integer mo3215a = alertDialog.mo3215a();
        if (mo3215a != null) {
            str = getActivity().getString(mo3215a.intValue());
        } else {
            str = null;
        }
        Integer negativeText = alertDialog.getNegativeText();
        if (negativeText != null) {
            str2 = getActivity().getString(negativeText.intValue());
        } else {
            str2 = null;
        }
        int i = C9654b.$EnumSwitchMapping$0[presentationKind.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return C45832nh5.m23305k(new C9646F(mo27707d, obj, obj2, str, str2));
            }
            AbstractC23442F<DialogResponse> showBottomSheetAlert = showBottomSheetAlert(alertDialog, Integer.valueOf(C33804Jj4.bottom_sheet_alert_side_asset));
            final C9644E c9644e = C9644E.f44611g;
            AbstractC23442F m33157I = showBottomSheetAlert.m33157I(new InterfaceC23492o() { // from class: X75
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    DialogResponse m75657Cm;
                    m75657Cm = Y75.m75657Cm(Function1.this, obj3);
                    return m75657Cm;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "{\n        showBottomShee…    }\n          }\n      }");
            return m33157I;
        }
        View contentView = LayoutInflater.from(getActivity()).inflate(C39311cj4.dialog_area_specific_warning_fullscreen, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
        Button button = (Button) C49520tu6.m11243h(contentView, C36585Vg4.confirmButton);
        Button button2 = (Button) C49520tu6.m11243h(contentView, C36585Vg4.secondaryButton);
        ImageView imageView = (ImageView) C49520tu6.m11243h(contentView, C36585Vg4.closeButton);
        C49520tu6.setTextAndVisibility$default((TextView) C49520tu6.m11243h(contentView, C36585Vg4.title), obj, 0, 2, null);
        C49520tu6.setTextAndVisibility$default((TextView) C49520tu6.m11243h(contentView, C36585Vg4.body), obj2, 0, 2, null);
        ((ImageView) C49520tu6.m11243h(contentView, C36585Vg4.icon)).setImageResource(mo27707d);
        if (str != null) {
            button.setText(str);
        }
        if (str2 != null) {
            button2.setText(str2);
            C49520tu6.m11233r(button2);
        }
        DialogInterfaceC10997b mo70301a = new DialogInterfaceC10997b.C10998a(getActivity(), 16973837).mo70284r(contentView).mo70301a();
        Intrinsics.checkNotNullExpressionValue(mo70301a, "builder.setView(contentView).create()");
        C48927su6.m13411d(contentView);
        Observable<Unit> m25214a = C45219mf5.m25214a(imageView);
        final C9679z c9679z = C9679z.f44650g;
        InterfaceC23434B map = m25214a.map(new InterfaceC23492o() { // from class: S75
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                DialogResponse m75656Dm;
                m75656Dm = Y75.m75656Dm(Function1.this, obj3);
                return m75656Dm;
            }
        });
        Observable<Unit> m25214a2 = C45219mf5.m25214a(button);
        final C9640A c9640a = C9640A.f44607g;
        InterfaceC23434B map2 = m25214a2.map(new InterfaceC23492o() { // from class: T75
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                DialogResponse m75654Em;
                m75654Em = Y75.m75654Em(Function1.this, obj3);
                return m75654Em;
            }
        });
        Observable<Unit> m25214a3 = C45219mf5.m25214a(button2);
        final C9641B c9641b = C9641B.f44608g;
        Observable merge = Observable.merge(map, map2, m25214a3.map(new InterfaceC23492o() { // from class: U75
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                DialogResponse m75650Fm;
                m75650Fm = Y75.m75650Fm(Function1.this, obj3);
                return m75650Fm;
            }
        }));
        final C9642C c9642c = new C9642C(mo70301a);
        Observable doOnSubscribe = merge.doOnSubscribe(new InterfaceC23484g() { // from class: V75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                Y75.m75648Gm(Function1.this, obj3);
            }
        });
        final C9643D c9643d = new C9643D(mo70301a);
        AbstractC23442F<DialogResponse> firstOrError = doOnSubscribe.doOnNext(new InterfaceC23484g() { // from class: W75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                Y75.m75646Hm(Function1.this, obj3);
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "{\n        val contentVie…  .firstOrError()\n      }");
        return firstOrError;
    }

    @Override // p000.P75
    /* renamed from: E2 */
    public void mo75655E2(String duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        int i = C39311cj4.dialog_reserve_bad_scan;
        int i2 = C36585Vg4.header;
        H31.C3014a.showCustomDialog$default((H31) this, i, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(i2), Integer.valueOf(C36585Vg4.mainText), (CharSequence) getActivity().getString(C45871nl4.ride_canceled_free_reserve_modal_header), (CharSequence) getActivity().getString(C45871nl4.ride_canceled_free_reserve_modal_body, duration), C36585Vg4.confirmButton, (Integer) null, getActivity().getString(C45871nl4.ride_canceled_free_reserve_modal_button), (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 518206, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: F */
    public Observable<Unit> mo75653F() {
        ActionView actionView = this.f44591k.f8667J;
        int i = C36585Vg4.turnOn;
        View findViewById = actionView.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(findViewById, "binding.turnOnLocation.f…ById<Button>(R.id.turnOn)");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(findViewById, 0L, 1, null);
        View findViewById2 = this.f44591k.f8668K.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "binding.turnOnLocationPe…ById<Button>(R.id.turnOn)");
        Observable<Unit> merge = Observable.merge(clicksThrottle$default, C44626lf5.clicksThrottle$default(findViewById2, 0L, 1, null));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      binding.tur…n).clicksThrottle()\n    )");
        return merge;
    }

    @Override // p000.P75
    /* renamed from: Fa */
    public Observable<Unit> mo75652Fa() {
        Observable<Unit> clicksThrottle$default;
        ImageView m75583vm = m75583vm();
        if (m75583vm == null || (clicksThrottle$default = C44626lf5.clicksThrottle$default(m75583vm, 0L, 1, null)) == null) {
            Observable<Unit> empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "empty()");
            return empty;
        }
        return clicksThrottle$default;
    }

    @Override // p000.P75
    /* renamed from: Ff */
    public void mo75651Ff(boolean z) {
        TextView m75591rm = m75591rm();
        if (m75591rm != null) {
            C49520tu6.show$default(m75591rm, z, 0, 2, null);
        }
    }

    @Override // p000.P75
    /* renamed from: Gg */
    public void mo75649Gg(String dialogTitle, String dialogContent, Map<CharSequence, Function0<Unit>> options) {
        List list;
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        Intrinsics.checkNotNullParameter(dialogContent, "dialogContent");
        Intrinsics.checkNotNullParameter(options, "options");
        if (!getActivity().isFinishing()) {
            MaterialDialog message$default = MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(getActivity(), null, 2, null), null, dialogTitle, 1, null), null, dialogContent, null, 5, null);
            list = CollectionsKt___CollectionsKt.toList(options.keySet());
            MaterialDialog.negativeButton$default(DialogListExtKt.listItems$default(message$default, null, list, null, false, new C9649G(options), 13, null), 17039360, null, null, 6, null).show();
        }
    }

    @Override // p000.P75
    /* renamed from: H5 */
    public void mo75647H5(Function0<Unit> function0) {
        if (!getActivity().isFinishing()) {
            C46827pN1.f103590c.m19383a(function0).show(getActivity().getSupportFragmentManager(), "how_to_ride");
        }
    }

    @Override // p000.P75
    /* renamed from: J1 */
    public void mo75645J1(boolean z) {
        ImageView imageView = this.f44591k.f8684p;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.gift");
        C49520tu6.show$default(imageView, z, 0, 2, null);
        ImageView imageView2 = this.f44591k.f8675g;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.blueDot");
        C49520tu6.show$default(imageView2, z, 0, 2, null);
    }

    @Override // p000.P75
    /* renamed from: Jc */
    public void mo75644Jc(int i) {
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_reservation, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(C36585Vg4.header), Integer.valueOf(C36585Vg4.body), (CharSequence) getActivity().getString(C45871nl4.unlock_free_offer_expired), (CharSequence) getActivity().getString(C45871nl4.unlock_free_offer_expired_body, C51916xx1.durationMinute$default(C51916xx1.f118396a, getActivity(), i, false, 4, null)), C36585Vg4.primaryButton, (Integer) null, (String) null, (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 522302, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: Kb */
    public Observable<Unit> mo75643Kb() {
        ImageView imageView = this.f44591k.f8677i;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.communityModeButton");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    @Override // p000.P75
    /* renamed from: M6 */
    public void mo75642M6(boolean z) {
        ImageView imageView = this.f44591k.f8659B;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.privateBirdButton");
        C49520tu6.show$default(imageView, z, 0, 2, null);
    }

    @Override // p000.P75
    /* renamed from: N0 */
    public void mo75641N0(Function0<Unit> onPrimary) {
        Intrinsics.checkNotNullParameter(onPrimary, "onPrimary");
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_enforce_parking, (Integer) null, (Integer) null, false, false, false, (Integer) null, (Integer) null, (CharSequence) null, (CharSequence) null, C36585Vg4.moveToParkingButton, (Integer) null, (String) null, (String) null, (Function0) onPrimary, (Function0) null, (Function0) null, (Function0) null, false, 506862, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: O7 */
    public Observable<Unit> mo75640O7() {
        ImageView imageView = this.f44591k.f8659B;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.privateBirdButton");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
        final C9672t c9672t = C9672t.f44640g;
        Observable<Unit> doOnNext = clicksThrottle$default.doOnNext(new InterfaceC23484g() { // from class: R75
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                Y75.m75577zm(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "binding.privateBirdButto…ksThrottle().doOnNext { }");
        return doOnNext;
    }

    @Override // p000.P75
    /* renamed from: Ok */
    public Observable<RideStatusUnlockButton> mo75639Ok() {
        Observable<RideStatusBottomSheetButton> m59059s;
        RideStatusBottomSheet rideStatusBottomSheet = this.f44602v;
        if (rideStatusBottomSheet != null && (m59059s = rideStatusBottomSheet.m59059s()) != null) {
            Observable map = m59059s.filter(C9651I.f44621b).map(C9652J.f44622b);
            Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
            if (map != null) {
                return map;
            }
        }
        Observable<RideStatusUnlockButton> empty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(empty, "empty()");
        return empty;
    }

    @Override // p000.P75
    /* renamed from: Pi */
    public void mo75638Pi(String duration, Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        int i = C39311cj4.dialog_reserve_bad_scan;
        int i2 = C36585Vg4.header;
        H31.C3014a.showCustomDialog$default((H31) this, i, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(i2), Integer.valueOf(C36585Vg4.mainText), (CharSequence) getActivity().getString(C45871nl4.bad_battery_free_reserve_modal_header), (CharSequence) getActivity().getString(C45871nl4.bad_battery_free_reserve_modal_body, duration), C36585Vg4.confirmButton, (Integer) null, getActivity().getString(C45871nl4.bad_battery_free_reserve_modal_button), (String) null, (Function0) null, (Function0) null, (Function0) onDismiss, (Function0) null, true, 190526, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: Q */
    public Observable<Unit> mo75637Q() {
        ImageView imageView = this.f44591k.f8684p;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.gift");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    @Override // p000.P75
    /* renamed from: Q2 */
    public void mo75636Q2(C37772a75 c37772a75) {
        String str;
        Unit unit;
        WireBird m71875b;
        if (c37772a75 != null && (m71875b = c37772a75.m71875b()) != null) {
            str = m71875b.getCode();
        } else {
            str = null;
        }
        C41318g46.m40163a("updateRideStatus called for bird " + str, new Object[0]);
        if (c37772a75 != null) {
            mo75634R7(false);
            RideStatusBottomSheet rideStatusBottomSheet = this.f44602v;
            if (rideStatusBottomSheet != null) {
                rideStatusBottomSheet.m57083e0(c37772a75);
            }
            m75664Am(4);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            m75664Am(5);
            P75.C6268a.showRideButton$default(this, false, 1, null);
        }
    }

    @Override // p000.P75
    /* renamed from: Qd */
    public void mo75635Qd(C37772a75 rideStatus) {
        String str;
        Intrinsics.checkNotNullParameter(rideStatus, "rideStatus");
        WireBird m71875b = rideStatus.m71875b();
        if (m71875b != null) {
            str = m71875b.getCode();
        } else {
            str = null;
        }
        C41318g46.m40163a("showRideStatusPanel called for bird " + str, new Object[0]);
        mo75634R7(false);
        RideStatusBottomSheet rideStatusBottomSheet = this.f44602v;
        if (rideStatusBottomSheet != null) {
            rideStatusBottomSheet.m57083e0(rideStatus);
        }
        m75664Am(4);
    }

    @Override // p000.P75
    /* renamed from: R7 */
    public void mo75634R7(boolean z) {
        boolean z2;
        ControlButton controlButton = this.f44591k.f8661D;
        Intrinsics.checkNotNullExpressionValue(controlButton, "binding.rideButton");
        C49520tu6.show$default(controlButton, z, 0, 2, null);
        AppCompatButton appCompatButton = this.f44591k.f8685q;
        Intrinsics.checkNotNullExpressionValue(appCompatButton, "binding.groupRides");
        if (z && m75579ym()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C49520tu6.show$default(appCompatButton, z2, 0, 2, null);
    }

    @Override // p000.P75
    /* renamed from: Sb */
    public void mo75633Sb() {
        C50923wH2 c50923wH2;
        Fragment m67322m0 = getActivity().getSupportFragmentManager().m67322m0("ManageGroupRidesBottomSheetDialog");
        if (m67322m0 instanceof C50923wH2) {
            c50923wH2 = (C50923wH2) m67322m0;
        } else {
            c50923wH2 = null;
        }
        if (c50923wH2 != null) {
            c50923wH2.dismissAllowingStateLoss();
        }
    }

    @Override // p000.P75
    /* renamed from: Sd */
    public void mo75632Sd(boolean z, boolean z2) {
        if (z) {
            ActionView actionView = this.f44591k.f8668K;
            Intrinsics.checkNotNullExpressionValue(actionView, "binding.turnOnLocationPermission");
            TextView textView = (TextView) C49520tu6.m11238m(actionView, C52955zi4.defaultMessage);
            if (textView != null) {
                C49520tu6.show$default(textView, !z2, 0, 2, null);
            }
            ActionView actionView2 = this.f44591k.f8668K;
            Intrinsics.checkNotNullExpressionValue(actionView2, "binding.turnOnLocationPermission");
            TextView textView2 = (TextView) C49520tu6.m11238m(actionView2, C52955zi4.physicalLockMessage);
            if (textView2 != null) {
                C49520tu6.show$default(textView2, z2, 0, 2, null);
            }
            ActionView actionView3 = this.f44591k.f8668K;
            Intrinsics.checkNotNullExpressionValue(actionView3, "binding.turnOnLocationPermission");
            C3865J2.m101293a(actionView3, 0);
            return;
        }
        ActionView actionView4 = this.f44591k.f8668K;
        Intrinsics.checkNotNullExpressionValue(actionView4, "binding.turnOnLocationPermission");
        C3865J2.m101292b(actionView4);
    }

    @Override // p000.P75
    /* renamed from: U1 */
    public void mo75631U1() {
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_reservation, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(C36585Vg4.header), Integer.valueOf(C36585Vg4.body), (CharSequence) getActivity().getString(C45871nl4.reservation_thanks_for_feedback), (CharSequence) getActivity().getString(C45871nl4.reservation_review), C36585Vg4.primaryButton, (Integer) null, (String) null, (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 522302, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: V7 */
    public AbstractC23461c mo75630V7() {
        int i = C48193rg4.ic_rider_bar_outside_service_area_triangle;
        String string = getActivity().getString(C45871nl4.rider_bar_ride_out_of_service_pre_ride_title);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…f_service_pre_ride_title)");
        String string2 = getActivity().getString(C45871nl4.rider_bar_ride_out_of_service_pre_ride_body);
        Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(L.str…of_service_pre_ride_body)");
        return mo75584vk(Integer.valueOf(i), string, string2);
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Vl */
    public InterfaceC36187To2 mo2709Vl() {
        return this.f44590j;
    }

    @Override // p000.P75
    /* renamed from: W9 */
    public Observable<Unit> mo75629W9() {
        return C44626lf5.clicksThrottle$default(m75586um(), 0L, 1, null);
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Wl */
    public ImageView mo75628Wl() {
        return (ImageView) this.f44595o.getValue();
    }

    @Override // p000.P75
    /* renamed from: X6 */
    public void mo75627X6(String duration, Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        int i = C39311cj4.dialog_reserve_bad_scan;
        int i2 = C36585Vg4.header;
        H31.C3014a.showCustomDialog$default((H31) this, i, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(i2), Integer.valueOf(C36585Vg4.mainText), (CharSequence) getActivity().getString(C45871nl4.bad_battery_free_reserve_modal_header), (CharSequence) getActivity().getString(C45871nl4.bad_battery_free_reserve_and_unlock_modal_body, duration), C36585Vg4.confirmButton, (Integer) null, getActivity().getString(C45871nl4.bad_battery_free_reserve_modal_button), (String) null, (Function0) null, (Function0) null, (Function0) onDismiss, (Function0) null, true, 190526, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: Xa */
    public void mo75626Xa() {
        C32147Ch3.C1129a c1129a = C32147Ch3.f4487d;
        if (c1129a.m111871a().isAdded()) {
            c1129a.m111871a().dismiss();
        }
    }

    @Override // p000.P75
    /* renamed from: Xi */
    public void mo75625Xi(boolean z) {
        ImageView imageView = this.f44591k.f8688t;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.myLocationButton");
        C49520tu6.show$default(imageView, z, 0, 2, null);
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Xl */
    public TextView mo75624Xl() {
        return (TextView) this.f44597q.getValue();
    }

    @Override // p000.P75
    /* renamed from: Y1 */
    public void mo75623Y1(C37455Yz1 status) {
        Intrinsics.checkNotNullParameter(status, "status");
        m75586um().setBorderColor(status.m73940c().getColor());
        ((TextView) C49520tu6.m11243h(m75586um(), C47610qh4.message)).setText(status.m73941b());
        ((ProgressBar) C49520tu6.m11243h(m75586um(), C47610qh4.statusBar)).setProgressDrawable(C44931mA1.m26205a(status.m73940c(), getActivity()));
        C49520tu6.m11246e(m75586um(), 300L);
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Yl */
    public TextView mo75622Yl() {
        return (TextView) this.f44596p.getValue();
    }

    @Override // p000.P75
    /* renamed from: Z8 */
    public void mo75621Z8(boolean z) {
        boolean z2;
        this.f44598r = z;
        ControlButton controlButton = this.f44591k.f8661D;
        Intrinsics.checkNotNullExpressionValue(controlButton, "binding.rideButton");
        if (controlButton.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo75634R7(z2);
    }

    @Override // p000.P75
    /* renamed from: Z9 */
    public void mo75620Z9() {
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_complaint_submitted, (Integer) null, (Integer) null, false, false, false, (Integer) null, Integer.valueOf(C36585Vg4.mainText), (CharSequence) null, (CharSequence) getActivity().getResources().getString(C45871nl4.complaints_dialog_message), C36585Vg4.confirmButton, (Integer) null, (String) null, (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 522622, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: Zc */
    public void mo75619Zc(int i) {
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_reservation, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(C36585Vg4.header), Integer.valueOf(C36585Vg4.body), (CharSequence) getActivity().getString(C45871nl4.reservation_unlock_free_offer_expired), (CharSequence) getActivity().getString(C45871nl4.reservation_unlock_free_offer_expired_body, C51916xx1.durationMinute$default(C51916xx1.f118396a, getActivity(), i, false, 4, null)), C36585Vg4.primaryButton, (Integer) null, (String) null, (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 522302, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: Zg */
    public Observable<Unit> mo75618Zg() {
        ControlButton controlButton = this.f44591k.f8661D;
        Intrinsics.checkNotNullExpressionValue(controlButton, "binding.rideButton");
        return C44626lf5.clicksThrottle$default(controlButton, 0L, 1, null);
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Zl */
    public ViewGroup mo75617Zl() {
        return (ViewGroup) this.f44594n.getValue();
    }

    @Override // p000.P75
    /* renamed from: ad */
    public void mo75616ad(boolean z, boolean z2) {
        if (z) {
            ActionView actionView = this.f44591k.f8667J;
            Intrinsics.checkNotNullExpressionValue(actionView, "binding.turnOnLocation");
            TextView textView = (TextView) C49520tu6.m11238m(actionView, C52955zi4.defaultMessage);
            if (textView != null) {
                C49520tu6.show$default(textView, !z2, 0, 2, null);
            }
            ActionView actionView2 = this.f44591k.f8667J;
            Intrinsics.checkNotNullExpressionValue(actionView2, "binding.turnOnLocation");
            TextView textView2 = (TextView) C49520tu6.m11238m(actionView2, C52955zi4.physicalLockMessage);
            if (textView2 != null) {
                C49520tu6.show$default(textView2, z2, 0, 2, null);
            }
            ActionView actionView3 = this.f44591k.f8667J;
            Intrinsics.checkNotNullExpressionValue(actionView3, "binding.turnOnLocation");
            C3865J2.m101293a(actionView3, 0);
            return;
        }
        ActionView actionView4 = this.f44591k.f8667J;
        Intrinsics.checkNotNullExpressionValue(actionView4, "binding.turnOnLocation");
        C3865J2.m101292b(actionView4);
    }

    @Override // p000.P75
    /* renamed from: b3 */
    public Observable<Unit> mo75615b3() {
        AppCompatButton appCompatButton = this.f44591k.f8685q;
        Intrinsics.checkNotNullExpressionValue(appCompatButton, "binding.groupRides");
        return C44626lf5.clicksThrottle$default(appCompatButton, 0L, 1, null);
    }

    @Override // p000.P75
    /* renamed from: b4 */
    public Observable<RideStatusScanAfterReserveButton> mo75614b4() {
        Observable<RideStatusBottomSheetButton> m59059s;
        RideStatusBottomSheet rideStatusBottomSheet = this.f44602v;
        if (rideStatusBottomSheet != null && (m59059s = rideStatusBottomSheet.m59059s()) != null) {
            Observable map = m59059s.filter(C9674v.f44642b).map(C9675w.f44643b);
            Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
            if (map != null) {
                return map;
            }
        }
        Observable<RideStatusScanAfterReserveButton> empty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(empty, "empty()");
        return empty;
    }

    @Override // p000.P75
    /* renamed from: c4 */
    public boolean mo75613c4() {
        BottomSheetBehavior<View> m59057u;
        RideStatusBottomSheet rideStatusBottomSheet = this.f44602v;
        return (rideStatusBottomSheet == null || (m59057u = rideStatusBottomSheet.m59057u()) == null || !C3161HZ.m103746b(m59057u)) ? false : true;
    }

    @Override // p000.P75
    /* renamed from: de */
    public void mo75612de(boolean z) {
        ImageView imageView = this.f44591k.f8677i;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.communityModeButton");
        C49520tu6.show$default(imageView, z, 0, 2, null);
    }

    @Override // p000.P75
    /* renamed from: di */
    public Observable<Optional<View>> mo75611di() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        C24523e c24523e = C24523e.f91168a;
        RideStatusBottomSheet rideStatusBottomSheet = this.f44602v;
        if (rideStatusBottomSheet != null) {
            bottomSheetBehavior = rideStatusBottomSheet.m59057u();
        } else {
            bottomSheetBehavior = null;
        }
        Observable combineLatest = Observable.combineLatest(m75593qm(bottomSheetBehavior), m75593qm(m75582wm()), m75593qm(m75589sm()), new C9650H());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        Optional.C14443a c14443a = Optional.f63040c;
        RideStatusBottomSheet rideStatusBottomSheet2 = this.f44602v;
        Intrinsics.checkNotNull(rideStatusBottomSheet2, "null cannot be cast to non-null type android.view.View");
        Observable<Optional<View>> distinctUntilChanged = combineLatest.startWith((Observable) c14443a.m59032c(rideStatusBottomSheet2)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "Observables.combineLates…  .distinctUntilChanged()");
        return distinctUntilChanged;
    }

    @Override // p000.P75
    /* renamed from: ic */
    public void mo75610ic(ScanButtonStyle scanButtonStyle, ScanButtonShape scanButtonShape) {
        ControlButton.EnumC16491d enumC16491d;
        Intrinsics.checkNotNullParameter(scanButtonStyle, "scanButtonStyle");
        Intrinsics.checkNotNullParameter(scanButtonShape, "scanButtonShape");
        ControlButton controlButton = this.f44591k.f8661D;
        int i = C9654b.$EnumSwitchMapping$2[scanButtonStyle.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        controlButton.setCallToAction(ControlButton.EnumC16489b.ICON);
                        controlButton.setIcon(NA0.m94299e(getActivity(), C48193rg4.ic_qr_code));
                    }
                } else {
                    controlButton.setCallToAction(ControlButton.EnumC16489b.ICON);
                    controlButton.setIcon(NA0.m94299e(getActivity(), C48193rg4.ic_scan));
                }
            } else {
                controlButton.setCallToAction(ControlButton.EnumC16489b.TEXT);
                String string = getActivity().getString(C45871nl4.scan);
                Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.string.scan)");
                String upperCase = string.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
                controlButton.setActionText(upperCase);
            }
        } else {
            controlButton.setCallToAction(ControlButton.EnumC16489b.TEXT);
            String string2 = getActivity().getString(C45871nl4.general_start_riding);
            Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(L.string.general_start_riding)");
            controlButton.setActionText(string2);
        }
        if (C9654b.$EnumSwitchMapping$3[scanButtonShape.ordinal()] == 1) {
            enumC16491d = ControlButton.EnumC16491d.PILL;
        } else {
            enumC16491d = ControlButton.EnumC16491d.CIRCLE;
        }
        controlButton.setStyle(enumC16491d);
    }

    @Override // p000.P75
    /* renamed from: k1 */
    public void mo75607k1(String title, String message, Function0<Unit> onPrimary, Function0<Unit> onSecondary, Integer num, String str) {
        String string;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onPrimary, "onPrimary");
        Intrinsics.checkNotNullParameter(onSecondary, "onSecondary");
        View view = LayoutInflater.from(getActivity()).inflate(C39311cj4.dialog_no_parking_warning, (ViewGroup) null);
        if (num != null && str != null) {
            string = getActivity().getString(C45871nl4.dialog_do_not_park_here_negative_button, C51916xx1.currency$default(C51916xx1.f118396a, num.intValue(), C45097mS5.m25591o(str), null, 4, null));
        } else {
            string = getActivity().getString(C45871nl4.dialog_do_not_park_here_default_negative_button);
        }
        Intrinsics.checkNotNullExpressionValue(string, "if (fee != null && curre…lt_negative_button)\n    }");
        int i = C36585Vg4.title;
        int i2 = C36585Vg4.body;
        int i3 = C36585Vg4.positiveButton;
        int i4 = C36585Vg4.negativeButton;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        H31.C3014a.showCustomDialog$default((H31) this, view, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(i), Integer.valueOf(i2), (CharSequence) title, (CharSequence) message, i3, Integer.valueOf(i4), (String) null, string, (Function0) onPrimary, (Function0) onSecondary, (Function0) null, (Function0) null, false, 462894, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: k5 */
    public void mo75606k5(String duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        int i = C39311cj4.dialog_reserve_bad_scan;
        int i2 = C36585Vg4.header;
        H31.C3014a.showCustomDialog$default((H31) this, i, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(i2), Integer.valueOf(C36585Vg4.mainText), (CharSequence) getActivity().getString(C45871nl4.ride_canceled_free_unlock_modal_header), (CharSequence) getActivity().getString(C45871nl4.ride_canceled_free_unlock_modal_body, duration), C36585Vg4.confirmButton, (Integer) null, getActivity().getString(C45871nl4.ride_canceled_free_unlock_modal_button), (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 518206, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: kc */
    public void mo75605kc(boolean z, PhysicalLockPurpose physicalLockPurpose) {
        int i;
        int i2;
        if (physicalLockPurpose == null) {
            i = -1;
        } else {
            i = C9654b.$EnumSwitchMapping$1[physicalLockPurpose.ordinal()];
        }
        if (i == 1) {
            i2 = C48193rg4.ic_helmet;
        } else {
            i2 = C48193rg4.ic_lock_dark;
        }
        ImageView m75583vm = m75583vm();
        if (m75583vm != null) {
            m75583vm.setImageResource(i2);
        }
        ImageView m75583vm2 = m75583vm();
        if (m75583vm2 != null) {
            C49520tu6.show$default(m75583vm2, z, 0, 2, null);
        }
        if (!z) {
            Balloon balloon = this.f44599s;
            if (balloon != null) {
                balloon.m45739O();
            }
            this.f44599s = null;
        }
    }

    @Override // p000.P75
    /* renamed from: mi */
    public Observable<RideStatusManageRidesButton> mo75602mi() {
        Observable<RideStatusBottomSheetButton> m59059s;
        RideStatusBottomSheet rideStatusBottomSheet = this.f44602v;
        if (rideStatusBottomSheet != null && (m59059s = rideStatusBottomSheet.m59059s()) != null) {
            Observable map = m59059s.filter(C9668p.f44636b).map(C9669q.f44637b);
            Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
            if (map != null) {
                return map;
            }
        }
        Observable<RideStatusManageRidesButton> empty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(empty, "empty()");
        return empty;
    }

    @Override // p000.P75
    /* renamed from: n3 */
    public void mo75600n3(String duration, Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        int i = C39311cj4.dialog_reserve_bad_scan;
        int i2 = C36585Vg4.header;
        H31.C3014a.showCustomDialog$default((H31) this, i, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(i2), Integer.valueOf(C36585Vg4.mainText), (CharSequence) getActivity().getString(C45871nl4.bad_battery_free_reserve_modal_header), (CharSequence) getActivity().getString(C45871nl4.bad_battery_free_unlock_modal_body, duration), C36585Vg4.confirmButton, (Integer) null, getActivity().getString(C45871nl4.bad_battery_free_unlock_modal_button), (String) null, (Function0) null, (Function0) null, (Function0) onDismiss, (Function0) null, true, 190526, (Object) null);
    }

    @Override // p000.P75
    /* renamed from: n7 */
    public void mo75599n7() {
        C41318g46.m40163a("hidePanel", new Object[0]);
        m75664Am(5);
    }

    @Override // p000.P75
    /* renamed from: o9 */
    public Observable<RideStatusEndButton> mo75597o9() {
        Observable<RideStatusBottomSheetButton> m59059s;
        RideStatusBottomSheet rideStatusBottomSheet = this.f44602v;
        if (rideStatusBottomSheet != null && (m59059s = rideStatusBottomSheet.m59059s()) != null) {
            Observable map = m59059s.filter(C9663k.f44631b).map(C9664l.f44632b);
            Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
            if (map != null) {
                return map;
            }
        }
        Observable<RideStatusEndButton> empty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(empty, "empty()");
        return empty;
    }

    @Override // p000.P75
    /* renamed from: od */
    public void mo75596od(int i) {
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_reservation, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(C36585Vg4.header), Integer.valueOf(C36585Vg4.body), (CharSequence) getActivity().getString(C45871nl4.reservation_free_offer_expired), (CharSequence) getActivity().getString(C45871nl4.reservation_free_offer_expired_body, C51916xx1.durationMinute$default(C51916xx1.f118396a, getActivity(), i, false, 4, null)), C36585Vg4.primaryButton, (Integer) null, (String) null, (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 522302, (Object) null);
    }

    /* renamed from: qm */
    public final Observable<Optional<View>> m75593qm(BottomSheetBehavior<View> bottomSheetBehavior) {
        Observable<Optional<View>> observable;
        Observable<AbstractC6031OZ> m13412c;
        Observable m74575T;
        if (bottomSheetBehavior != null && (m13412c = C48927su6.m13412c(bottomSheetBehavior)) != null && (m74575T = C37279Yf5.m74575T(m13412c, C9660h.f44628g)) != null) {
            observable = m74575T.startWith((Observable) Optional.f63040c.m59034a());
        } else {
            observable = null;
        }
        if (observable == null) {
            Observable<Optional<View>> just = Observable.just(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(just, "just(Optional.absent())");
            return just;
        }
        return observable;
    }

    @Override // p000.P75
    /* renamed from: ra */
    public Observable<Unit> mo75592ra() {
        Observable<Unit> clicksThrottle$default;
        TextView m75591rm = m75591rm();
        if (m75591rm == null || (clicksThrottle$default = C44626lf5.clicksThrottle$default(m75591rm, 0L, 1, null)) == null) {
            Observable<Unit> empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "empty()");
            return empty;
        }
        return clicksThrottle$default;
    }

    /* renamed from: rm */
    public final TextView m75591rm() {
        return (TextView) this.f44587A.getValue();
    }

    @Override // p000.P75
    /* renamed from: sf */
    public boolean mo75590sf() {
        return this.f44591k.f8661D.getVisibility() == 0;
    }

    /* renamed from: sm */
    public final BottomSheetBehavior<View> m75589sm() {
        return (BottomSheetBehavior) this.f44606z.getValue();
    }

    /* renamed from: tm */
    public final View m75588tm() {
        return (View) this.f44605y.getValue();
    }

    @Override // p000.AbstractC9344XC, p000.InterfaceC41921h56
    public void topToast(CharSequence message, EnumC40735f56 duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f44591k.f8665H.m54385d(message, duration);
    }

    @Override // p000.P75
    /* renamed from: uh */
    public Observable<RideStatusLockButton> mo75587uh() {
        Observable<RideStatusBottomSheetButton> m59059s;
        RideStatusBottomSheet rideStatusBottomSheet = this.f44602v;
        if (rideStatusBottomSheet != null && (m59059s = rideStatusBottomSheet.m59059s()) != null) {
            Observable map = m59059s.filter(C9666n.f44634b).map(C9667o.f44635b);
            Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
            if (map != null) {
                return map;
            }
        }
        Observable<RideStatusLockButton> empty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(empty, "empty()");
        return empty;
    }

    /* renamed from: um */
    public final InfoPillLinearLayout m75586um() {
        return (InfoPillLinearLayout) this.f44601u.getValue();
    }

    @Override // p000.P75
    /* renamed from: vg */
    public void mo75585vg() {
        C50923wH2.f115755c.m7049a().show(getActivity().getSupportFragmentManager(), "ManageGroupRidesBottomSheetDialog");
    }

    @Override // p000.P75
    /* renamed from: vk */
    public AbstractC23461c mo75584vk(Integer num, String str, String str2) {
        return C45832nh5.m23311e(new C9677y(num, str, str2));
    }

    /* renamed from: vm */
    public final ImageView m75583vm() {
        return (ImageView) this.f44588B.getValue();
    }

    /* renamed from: wm */
    public final BottomSheetBehavior<View> m75582wm() {
        return (BottomSheetBehavior) this.f44604x.getValue();
    }

    /* renamed from: xm */
    public final View m75581xm() {
        return (View) this.f44603w.getValue();
    }

    @Override // p000.P75
    /* renamed from: yk */
    public void mo75580yk(View bottomSheet) {
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        View view = this.f44589C;
        CoordinatorLayout.C11529e c11529e = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof CoordinatorLayout.C11529e) {
            c11529e = (CoordinatorLayout.C11529e) layoutParams;
        }
        if (c11529e != null) {
            c11529e.m67759p(bottomSheet.getId());
        }
    }

    /* renamed from: ym */
    public boolean m75579ym() {
        return this.f44598r;
    }

    @Override // p000.P75
    /* renamed from: zd */
    public boolean mo75578zd() {
        Fragment m67322m0 = getActivity().getSupportFragmentManager().m67322m0("ManageGroupRidesBottomSheetDialog");
        return m67322m0 != null && m67322m0.isResumed();
    }
}
