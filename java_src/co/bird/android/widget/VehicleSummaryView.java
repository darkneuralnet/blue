package co.bird.android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.constant.BirdLocationSource;
import co.bird.android.model.constant.BirdModel;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0003·\u0001\u001dB\u0015\b\u0016\u0012\b\u0010±\u0001\u001a\u00030°\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001B\u001d\b\u0016\u0012\b\u0010±\u0001\u001a\u00030°\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0006\b²\u0001\u0010´\u0001B&\b\u0016\u0012\b\u0010±\u0001\u001a\u00030°\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0007\u0010µ\u0001\u001a\u00020\u0011¢\u0006\u0006\b²\u0001\u0010¶\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R*\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u00101\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00104\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R(\u00107\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R(\u0010=\u001a\u0004\u0018\u0001082\b\u0010$\u001a\u0004\u0018\u0001088F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010@\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R(\u0010C\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R(\u0010F\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010.\"\u0004\bE\u00100R$\u0010L\u001a\u00020G2\u0006\u0010$\u001a\u00020G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010O\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010.\"\u0004\bN\u00100R(\u0010R\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010.\"\u0004\bQ\u00100R(\u0010U\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010.\"\u0004\bT\u00100R(\u0010X\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010.\"\u0004\bW\u00100R(\u0010[\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010.\"\u0004\bZ\u00100R(\u0010^\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010.\"\u0004\b]\u00100R(\u0010a\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010.\"\u0004\b`\u00100R(\u0010d\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010.\"\u0004\bc\u00100R(\u0010g\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010.\"\u0004\bf\u00100R(\u0010j\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010.\"\u0004\bi\u00100R(\u0010m\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010.\"\u0004\bl\u00100R(\u0010p\u001a\u0004\u0018\u0001082\b\u0010$\u001a\u0004\u0018\u0001088F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010:\"\u0004\bo\u0010<R(\u0010s\u001a\u0004\u0018\u0001082\b\u0010$\u001a\u0004\u0018\u0001088F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010:\"\u0004\br\u0010<R(\u0010v\u001a\u0004\u0018\u0001082\b\u0010$\u001a\u0004\u0018\u0001088F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010:\"\u0004\bu\u0010<R(\u0010y\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010.\"\u0004\bx\u00100R$\u0010\u007f\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R'\u0010\u0082\u0001\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010|\"\u0005\b\u0081\u0001\u0010~R'\u0010\u0085\u0001\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010|\"\u0005\b\u0084\u0001\u0010~R'\u0010\u0088\u0001\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010|\"\u0005\b\u0087\u0001\u0010~R'\u0010\u008b\u0001\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010|\"\u0005\b\u008a\u0001\u0010~R'\u0010\u008e\u0001\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008c\u0001\u0010|\"\u0005\b\u008d\u0001\u0010~R'\u0010\u0091\u0001\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008f\u0001\u0010|\"\u0005\b\u0090\u0001\u0010~R'\u0010\u0094\u0001\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0092\u0001\u0010|\"\u0005\b\u0093\u0001\u0010~R'\u0010\u0097\u0001\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0095\u0001\u0010|\"\u0005\b\u0096\u0001\u0010~R'\u0010\u009a\u0001\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0098\u0001\u0010|\"\u0005\b\u0099\u0001\u0010~R'\u0010\u009d\u0001\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009b\u0001\u0010|\"\u0005\b\u009c\u0001\u0010~R'\u0010 \u0001\u001a\u00020z2\u0006\u0010$\u001a\u00020z8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009e\u0001\u0010|\"\u0005\b\u009f\u0001\u0010~R*\u0010¥\u0001\u001a\u00030¡\u00012\u0007\u0010$\u001a\u00030¡\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0005\b\u0013\u0010¤\u0001R*\u0010§\u0001\u001a\u00030¡\u00012\u0007\u0010$\u001a\u00030¡\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b¦\u0001\u0010£\u0001\"\u0005\b\u0015\u0010¤\u0001R*\u0010©\u0001\u001a\u00030¡\u00012\u0007\u0010$\u001a\u00030¡\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b¨\u0001\u0010£\u0001\"\u0005\b\u0016\u0010¤\u0001R*\u0010«\u0001\u001a\u00030¡\u00012\u0007\u0010$\u001a\u00030¡\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bª\u0001\u0010£\u0001\"\u0005\b\u0017\u0010¤\u0001R*\u0010\u00ad\u0001\u001a\u00030¡\u00012\u0007\u0010$\u001a\u00030¡\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b¬\u0001\u0010£\u0001\"\u0005\b\u0018\u0010¤\u0001R*\u0010¯\u0001\u001a\u00030¡\u00012\u0007\u0010$\u001a\u00030¡\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b®\u0001\u0010£\u0001\"\u0005\b\u0019\u0010¤\u0001¨\u0006¸\u0001"}, m28432d2 = {"Lco/bird/android/widget/VehicleSummaryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/util/AttributeSet;", "attrs", "", "h", "i", "Lun6;", "viewModel", "e", "Landroid/graphics/Bitmap;", "bitmap", "setScooterImageBitmap", "setBrandIconBitmap", "", "url", "setBrandIconUrl", "", "color", "setTitleTextColor", "(Ljava/lang/Integer;)V", "setSubtitleTextColor", "setTimeTextColor", "setLastCellularTrackTextColor", "setValue1TextColor", "setValue2TextColor", "setStatusIconColor", "setStatusIconBackgroundTint", "Lnu6;", "b", "Lnu6;", "binding", "c", "I", "matteBlackStateList", "Lco/bird/android/widget/VehicleSummaryView$b;", "value", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/widget/VehicleSummaryView$b;", "getMode", "()Lco/bird/android/widget/VehicleSummaryView$b;", "setMode", "(Lco/bird/android/widget/VehicleSummaryView$b;)V", "mode", "", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "g", "setStatusTitle", "statusTitle", "getStatusDescription", "setStatusDescription", "statusDescription", "Landroid/graphics/drawable/Drawable;", "f", "()Landroid/graphics/drawable/Drawable;", "setStatusIcon", "(Landroid/graphics/drawable/Drawable;)V", "statusIcon", "getCaption", "setCaption", "caption", "getCode", "setCode", PaymentMethodOptionsParams.Blik.PARAM_CODE, "getBattery", "setBattery", "battery", "", "getBatteryLevel", "()F", "setBatteryLevel", "(F)V", "batteryLevel", "getSignal", "setSignal", "signal", "getRatingAverage", "setRatingAverage", "ratingAverage", "getTime", "setTime", "time", "getBrand", "setBrand", AccountRangeJsonParser.FIELD_BRAND, "getCondition", "setCondition", "condition", "getBrainState", "setBrainState", "brainState", "getLastCellularTrack", "setLastCellularTrack", "lastCellularTrack", "getLabel1", "setLabel1", "label1", "getLabel2", "setLabel2", "label2", "getValue1", "setValue1", "value1", "getValue2", "setValue2", "value2", "getScooterImage", "setScooterImage", "scooterImage", "getBrandIcon", "setBrandIcon", "brandIcon", "getSignalIcon", "setSignalIcon", "signalIcon", "getMarkerLabel", "setMarkerLabel", "markerLabel", "", "getMarkerLabelVisible", "()Z", "setMarkerLabelVisible", "(Z)V", "markerLabelVisible", "getTitleVisible", "setTitleVisible", "titleVisible", "getStatusGroupVisible", "setStatusGroupVisible", "statusGroupVisible", "getCaptionVisible", "setCaptionVisible", "captionVisible", "getTimeVisible", "setTimeVisible", "timeVisible", "getBrandVisible", "setBrandVisible", "brandVisible", "getConditionVisible", "setConditionVisible", "conditionVisible", "getBrainVisible", "setBrainVisible", "brainVisible", "getValue1Visible", "setValue1Visible", "value1Visible", "getValue2Visible", "setValue2Visible", "value2Visible", "getLastCellularTrackVisible", "setLastCellularTrackVisible", "lastCellularTrackVisible", "getRatingAverageVisible", "setRatingAverageVisible", "ratingAverageVisible", "Landroid/content/res/ColorStateList;", "getTitleTextColor", "()Landroid/content/res/ColorStateList;", "(Landroid/content/res/ColorStateList;)V", "titleTextColor", "getSubtitleTextColor", "subtitleTextColor", "getTimeTextColor", "timeTextColor", "getLastCellularTrackTextColor", "lastCellularTrackTextColor", "getValue1TextColor", "value1TextColor", "getValue2TextColor", "value2TextColor", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleSummaryView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleSummaryView.kt\nco/bird/android/widget/VehicleSummaryView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,422:1\n1#2:423\n177#3,2:424\n177#3,2:426\n*S KotlinDebug\n*F\n+ 1 VehicleSummaryView.kt\nco/bird/android/widget/VehicleSummaryView\n*L\n395#1:424,2\n398#1:426,2\n*E\n"})
/* loaded from: classes4.dex */
public final class VehicleSummaryView extends ConstraintLayout {

    /* renamed from: e */
    public static final C16592a f67691e = new C16592a(null);

    /* renamed from: b */
    public final C45963nu6 f67692b;

    /* renamed from: c */
    public final int f67693c;

    /* renamed from: d */
    public EnumC16593b f67694d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/VehicleSummaryView$a;", "", "", "STATUS_ICON_BACKGROUND_PADDING_DP", "I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.VehicleSummaryView$a */
    /* loaded from: classes4.dex */
    public static final class C16592a {
        public /* synthetic */ C16592a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16592a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lco/bird/android/widget/VehicleSummaryView$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.VehicleSummaryView$b */
    /* loaded from: classes4.dex */
    public enum EnumC16593b {
        MODE_NONE,
        MODE_SERVICE_CENTER,
        MODE_FIELD,
        MODE_ROUTING,
        MODE_COMPACT
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.VehicleSummaryView$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16594c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC16593b.values().length];
            try {
                iArr[EnumC16593b.MODE_SERVICE_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16593b.MODE_FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16593b.MODE_ROUTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC16593b.MODE_COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC16593b.MODE_NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleSummaryView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_vehicle_summary, this, true);
        setBackground(new ColorDrawable(NA0.m94301c(getContext(), C32364Df4.white)));
        C45963nu6 m22195a = C45963nu6.m22195a(this);
        Intrinsics.checkNotNullExpressionValue(m22195a, "bind(this)");
        this.f67692b = m22195a;
        this.f67693c = NA0.m94301c(getContext(), C32364Df4.primary_text_state_list);
        this.f67694d = EnumC16593b.MODE_NONE;
    }

    /* renamed from: e */
    public final void m54355e(C50043un6 viewModel) {
        boolean z;
        boolean z2;
        SpannableString spannableString;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        setTitle(viewModel.m9738y());
        boolean z3 = true;
        if (viewModel.m9738y() != null) {
            z = true;
        } else {
            z = false;
        }
        setTitleVisible(z);
        setStatusTitle(viewModel.m9741v());
        setStatusDescription(viewModel.m9745r());
        setStatusIcon(viewModel.m9744s());
        setCaption(viewModel.m9757f());
        setCode(viewModel.m9755h());
        setBattery(viewModel.m9761b());
        setRatingAverage(viewModel.m9746q());
        if (viewModel.m9746q() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setRatingAverageVisible(z2);
        setTime(viewModel.m9740w());
        setCondition(viewModel.m9754i());
        setBrainState(viewModel.m9759d());
        setLastCellularTrack(viewModel.m9753j());
        setSignal(viewModel.m9751l());
        BirdLocationSource m9750m = viewModel.m9750m();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setSignalIcon(C9757YL.m75240a(m9750m, context));
        setValue1(viewModel.m9766A());
        setValue2(viewModel.m9764C());
        setBatteryLevel(viewModel.m9760c() / 100.0f);
        String m9749n = viewModel.m9749n();
        Unit unit = null;
        if (m9749n != null) {
            spannableString = C45097mS5.span$default(m9749n, viewModel.m9749n(), null, 2, null);
        } else {
            spannableString = null;
        }
        setMarkerLabel(spannableString);
        if (viewModel.m9749n() == null) {
            z3 = false;
        }
        setMarkerLabelVisible(z3);
        setTitleTextColor(viewModel.m9737z());
        setStatusIconColor(viewModel.m9742u());
        setStatusIconBackgroundTint(viewModel.m9743t());
        setSubtitleTextColor(viewModel.m9756g());
        setValue1TextColor(viewModel.m9765B());
        setValue2TextColor(viewModel.m9763D());
        setTimeTextColor(viewModel.m9739x());
        setLastCellularTrackTextColor(viewModel.m9752k());
        BirdModel m9748o = viewModel.m9748o();
        if (m9748o != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setScooterImage(C6327PM.m90445a(m9748o, context2));
        }
        MobilePartner m9747p = viewModel.m9747p();
        if (m9747p != null) {
            String displayName = m9747p.getDisplayName();
            CharSequence m9758e = viewModel.m9758e();
            setBrand(displayName + " " + ((Object) m9758e));
            String iconUrl = m9747p.getIconUrl();
            if (iconUrl != null) {
                setBrandIconUrl(iconUrl);
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null) {
            setBrand(viewModel.m9758e());
            setBrandIcon(NA0.m94299e(getContext(), C48193rg4.ic_bird_logo));
        }
    }

    /* renamed from: f */
    public final Drawable m54354f() {
        return this.f67692b.f101027I.getDrawable();
    }

    /* renamed from: g */
    public final CharSequence m54353g() {
        return this.f67692b.f101028J.getText();
    }

    /* renamed from: h */
    public final void m54352h(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34056Kl4.VehicleSummaryView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…eable.VehicleSummaryView)");
        setTimeVisible(obtainStyledAttributes.getBoolean(C34056Kl4.VehicleSummaryView_showTime, true));
        setMode(EnumC16593b.values()[obtainStyledAttributes.getInt(C34056Kl4.VehicleSummaryView_mode, EnumC16593b.MODE_NONE.ordinal())]);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C34056Kl4.VehicleSummaryView_android_paddingBottom, -1);
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin);
        }
        setPadding(0, 0, 0, dimensionPixelSize);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: i */
    public final void m54351i() {
        boolean z;
        boolean isBlank;
        CharSequence m54353g = m54353g();
        boolean z2 = false;
        if (m54353g != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(m54353g);
            if (!isBlank) {
                z = true;
                if (z && m54354f() != null) {
                    z2 = true;
                }
                setStatusGroupVisible(z2);
            }
        }
        z = false;
        if (z) {
            z2 = true;
        }
        setStatusGroupVisible(z2);
    }

    public final void setBattery(CharSequence charSequence) {
        this.f67692b.f101038c.setText(charSequence);
    }

    public final void setBatteryLevel(float f) {
        this.f67692b.f101040e.setBatteryLevel(f);
    }

    public final void setBrainState(CharSequence charSequence) {
        this.f67692b.f101041f.setText(charSequence);
    }

    public final void setBrainVisible(boolean z) {
        ImageView imageView = this.f67692b.f101043h;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.brainIcon");
        C49520tu6.show$default(imageView, z, 0, 2, null);
        TextView textView = this.f67692b.f101041f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.brain");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    public final void setBrand(CharSequence charSequence) {
        this.f67692b.f101044i.setText(charSequence);
    }

    public final void setBrandIcon(Drawable drawable) {
        this.f67692b.f101046k.setImageDrawable(drawable);
    }

    public final void setBrandIconBitmap(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f67692b.f101046k.setImageBitmap(bitmap);
    }

    public final void setBrandIconUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ComponentCallbacks2C17096a.m53137u(this).m81662b().m16089a1(url).m16096R0(this.f67692b.f101046k);
    }

    public final void setBrandVisible(boolean z) {
        ImageView imageView = this.f67692b.f101046k;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.brandIcon");
        C49520tu6.show$default(imageView, z, 0, 2, null);
        TextView textView = this.f67692b.f101044i;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.brand");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    public final void setCaption(CharSequence charSequence) {
        this.f67692b.f101047l.setText(charSequence);
    }

    public final void setCaptionVisible(boolean z) {
        TextView textView = this.f67692b.f101047l;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.caption");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    public final void setCode(CharSequence charSequence) {
        this.f67692b.f101048m.setText(charSequence);
    }

    public final void setCondition(CharSequence charSequence) {
        this.f67692b.f101049n.setText(charSequence);
    }

    public final void setConditionVisible(boolean z) {
        ImageView imageView = this.f67692b.f101051p;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.conditionIcon");
        C49520tu6.show$default(imageView, z, 0, 2, null);
        TextView textView = this.f67692b.f101049n;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.condition");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    public final void setLabel1(CharSequence charSequence) {
        this.f67692b.f101054s.setText(charSequence);
    }

    public final void setLabel2(CharSequence charSequence) {
        this.f67692b.f101055t.setText(charSequence);
    }

    public final void setLastCellularTrack(CharSequence charSequence) {
        this.f67692b.f101058w.setText(charSequence);
    }

    public final void setLastCellularTrackTextColor(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67692b.f101058w.setTextColor(value);
    }

    public final void setLastCellularTrackVisible(boolean z) {
        TextView textView = this.f67692b.f101059x;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.lastCellularTrackLabel");
        C49520tu6.show$default(textView, z, 0, 2, null);
        TextView textView2 = this.f67692b.f101058w;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.lastCellularTrack");
        C49520tu6.show$default(textView2, z, 0, 2, null);
    }

    public final void setMarkerLabel(CharSequence charSequence) {
        this.f67692b.f101060y.setText(charSequence);
    }

    public final void setMarkerLabelVisible(boolean z) {
        TextView textView = this.f67692b.f101060y;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.markerLabel");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    public final void setMode(EnumC16593b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        EnumC16593b enumC16593b = this.f67694d;
        if (enumC16593b == value) {
            return;
        }
        if (enumC16593b == EnumC16593b.MODE_COMPACT) {
            C11515b c11515b = new C11515b();
            c11515b.m67813o(getContext(), C45268mk4.constraints_vehicle_summary_full);
            c11515b.m67819i(this);
        }
        this.f67694d = value;
        int i = C16594c.$EnumSwitchMapping$0[value.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C11515b c11515b2 = new C11515b();
                        c11515b2.m67813o(getContext(), C45268mk4.constraints_vehicle_summary_compact);
                        c11515b2.m67819i(this);
                        return;
                    }
                    return;
                }
                setCaptionVisible(false);
                setConditionVisible(true);
                setBrainVisible(true);
                setTimeVisible(false);
                setBrandVisible(false);
                setLastCellularTrackVisible(false);
                setValue1Visible(false);
                setValue2Visible(false);
                View view = this.f67692b.f101052q;
                Intrinsics.checkNotNullExpressionValue(view, "binding.divider");
                C49520tu6.show$default(view, true, 0, 2, null);
                return;
            }
            setCaptionVisible(true);
            setConditionVisible(false);
            setBrainVisible(false);
            setTimeVisible(false);
            setLastCellularTrackVisible(false);
            setValue1Visible(false);
            setValue2Visible(false);
            View view2 = this.f67692b.f101052q;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.divider");
            C49520tu6.show$default(view2, false, 0, 2, null);
            return;
        }
        setCaptionVisible(true);
        setTimeVisible(true);
        setConditionVisible(false);
        setBrainVisible(false);
        setLabel1(getContext().getString(C45871nl4.vehicle_summary_condition));
        setLabel2(getContext().getString(C45871nl4.vehicle_summary_brain_state));
        View view3 = this.f67692b.f101052q;
        Intrinsics.checkNotNullExpressionValue(view3, "binding.divider");
        C49520tu6.show$default(view3, true, 0, 2, null);
    }

    public final void setRatingAverage(CharSequence charSequence) {
        this.f67692b.f101037b.setText(charSequence);
    }

    public final void setRatingAverageVisible(boolean z) {
        ImageView imageView = this.f67692b.f101020B;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.star");
        C49520tu6.show$default(imageView, z, 0, 2, null);
        TextView textView = this.f67692b.f101037b;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.average");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    public final void setScooterImage(Drawable drawable) {
        this.f67692b.f101035Q.setImageDrawable(drawable);
    }

    public final void setScooterImageBitmap(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f67692b.f101035Q.setImageBitmap(bitmap);
    }

    public final void setSignal(CharSequence charSequence) {
        this.f67692b.f101061z.setText(charSequence);
    }

    public final void setSignalIcon(Drawable drawable) {
        this.f67692b.f101019A.setImageDrawable(drawable);
    }

    public final void setStatusDescription(CharSequence charSequence) {
        boolean z;
        boolean isBlank;
        this.f67692b.f101025G.setText(charSequence);
        TextView textView = this.f67692b.f101025G;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.statusDescription");
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                z = false;
                C49520tu6.show$default(textView, !z, 0, 2, null);
            }
        }
        z = true;
        C49520tu6.show$default(textView, !z, 0, 2, null);
    }

    public final void setStatusGroupVisible(boolean z) {
        Group group = this.f67692b.f101026H;
        Intrinsics.checkNotNullExpressionValue(group, "binding.statusGroup");
        C49520tu6.show$default(group, z, 0, 2, null);
    }

    public final void setStatusIcon(Drawable drawable) {
        this.f67692b.f101027I.setImageDrawable(drawable);
        Unit unit = Unit.INSTANCE;
        m54351i();
    }

    public final void setStatusIconBackgroundTint(Integer num) {
        if (num == null) {
            this.f67692b.f101027I.setBackground(null);
            ImageView imageView = this.f67692b.f101027I;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.statusIcon");
            imageView.setPadding(0, 0, 0, 0);
            return;
        }
        this.f67692b.f101027I.setBackground(NA0.m94299e(getContext(), C33309Hg4.background_circle));
        ImageView imageView2 = this.f67692b.f101027I;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.statusIcon");
        int m12001b = (int) C49347td3.m12001b(4);
        imageView2.setPadding(m12001b, m12001b, m12001b, m12001b);
        this.f67692b.f101027I.setBackgroundTintList(ColorStateList.valueOf(num.intValue()));
    }

    public final void setStatusIconColor(Integer num) {
        ColorStateList colorStateList;
        ImageView imageView = this.f67692b.f101027I;
        if (num != null) {
            num.intValue();
            colorStateList = ColorStateList.valueOf(num.intValue());
        } else {
            colorStateList = null;
        }
        imageView.setImageTintList(colorStateList);
    }

    public final void setStatusTitle(CharSequence charSequence) {
        this.f67692b.f101028J.setText(charSequence);
        m54351i();
    }

    public final void setSubtitleTextColor(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67692b.f101047l.setTextColor(value);
    }

    public final void setTime(CharSequence charSequence) {
        this.f67692b.f101029K.setText(charSequence);
    }

    public final void setTimeTextColor(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67692b.f101029K.setTextColor(value);
    }

    public final void setTimeVisible(boolean z) {
        ImageView imageView = this.f67692b.f101031M;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.timeIcon");
        C49520tu6.show$default(imageView, z, 0, 2, null);
        TextView textView = this.f67692b.f101029K;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.time");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f67692b.f101032N.setText(charSequence);
    }

    public final void setTitleTextColor(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67692b.f101032N.setTextColor(value);
    }

    public final void setTitleVisible(boolean z) {
        TextView textView = this.f67692b.f101032N;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    public final void setValue1(CharSequence charSequence) {
        this.f67692b.f101033O.setText(charSequence);
    }

    public final void setValue1TextColor(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67692b.f101033O.setTextColor(value);
    }

    public final void setValue1Visible(boolean z) {
        TextView textView = this.f67692b.f101054s;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.label1");
        C49520tu6.show$default(textView, z, 0, 2, null);
        TextView textView2 = this.f67692b.f101033O;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.value1");
        C49520tu6.show$default(textView2, z, 0, 2, null);
    }

    public final void setValue2(CharSequence charSequence) {
        this.f67692b.f101034P.setText(charSequence);
    }

    public final void setValue2TextColor(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67692b.f101034P.setTextColor(value);
    }

    public final void setValue2Visible(boolean z) {
        TextView textView = this.f67692b.f101055t;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.label2");
        C49520tu6.show$default(textView, z, 0, 2, null);
        TextView textView2 = this.f67692b.f101034P;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.value2");
        C49520tu6.show$default(textView2, z, 0, 2, null);
    }

    public final void setLastCellularTrackTextColor(Integer num) {
        this.f67692b.f101058w.setTextColor(num != null ? num.intValue() : this.f67693c);
    }

    public final void setSubtitleTextColor(Integer num) {
        this.f67692b.f101047l.setTextColor(num != null ? num.intValue() : this.f67693c);
    }

    public final void setTimeTextColor(Integer num) {
        this.f67692b.f101029K.setTextColor(num != null ? num.intValue() : this.f67693c);
    }

    public final void setTitleTextColor(Integer num) {
        this.f67692b.f101032N.setTextColor(num != null ? num.intValue() : this.f67693c);
    }

    public final void setValue1TextColor(Integer num) {
        this.f67692b.f101033O.setTextColor(num != null ? num.intValue() : this.f67693c);
    }

    public final void setValue2TextColor(Integer num) {
        this.f67692b.f101034P.setTextColor(num != null ? num.intValue() : this.f67693c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleSummaryView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_vehicle_summary, this, true);
        setBackground(new ColorDrawable(NA0.m94301c(getContext(), C32364Df4.white)));
        C45963nu6 m22195a = C45963nu6.m22195a(this);
        Intrinsics.checkNotNullExpressionValue(m22195a, "bind(this)");
        this.f67692b = m22195a;
        this.f67693c = NA0.m94301c(getContext(), C32364Df4.primary_text_state_list);
        this.f67694d = EnumC16593b.MODE_NONE;
        m54352h(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleSummaryView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_vehicle_summary, this, true);
        setBackground(new ColorDrawable(NA0.m94301c(getContext(), C32364Df4.white)));
        C45963nu6 m22195a = C45963nu6.m22195a(this);
        Intrinsics.checkNotNullExpressionValue(m22195a, "bind(this)");
        this.f67692b = m22195a;
        this.f67693c = NA0.m94301c(getContext(), C32364Df4.primary_text_state_list);
        this.f67694d = EnumC16593b.MODE_NONE;
        m54352h(attrs);
    }
}
